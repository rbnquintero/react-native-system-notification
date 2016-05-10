package io.neson.react.notification;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

import com.facebook.react.bridge.WritableNativeMap;
import com.google.gson.Gson;

public class NotificationAttributes {
    public Integer id;
    public String subject;
    public String message;
    public String action;
    public String payload;

    public Boolean delayed = false;
    public Integer delay;

    public Boolean scheduled = false;
    public Long sendAt;
    public Integer sendAtYear;
    public Integer sendAtMonth;
    public Integer sendAtDay;
    public Integer sendAtWeekDay;
    public Integer sendAtHour;
    public Integer sendAtMinute;

    public String repeatEvery;
    public String repeatType;
    public Integer repeatTime;
    public Integer repeatCount;
    public Long endAt;

    public Integer priority;
    public String smallIcon;
    public String largeIcon;
    public String sound;
    public String vibrate;
    public String lights;
    public Boolean autoClear = false;
    public Boolean onlyAlertOnce = false;
    public String tickerText;
    public Long when;
    public String bigText;
    public String bigStyleImageBase64;
    public String subText;
    public Integer progress;
    public String color;
    public Integer number;
    public String category;
    public Boolean localOnly = false;

    public Boolean inboxStyle = false;
    public String inboxStyleBigContentTitle;
    public String inboxStyleSummaryText;
    public ArrayList<String> inboxStyleLines;

    public void loadFromMap(Map map) {
        
        Map writableMap = new HashMap<String, Object>();

        Iterator entries = map.entrySet().iterator();

        while (entries.hasNext()) {
            Map.Entry entry = (Map.Entry) entries.next();
            String key = (String) entry.getKey();
            Object value = entry.getValue();

            if ("id".equals(key) || value.getClass().equals(Integer.class) || value.getClass().equals(Long.class)) {
                Number v = (Number) value;
                writableMap.put(key, (Integer) v.intValue());

            } else if (value.getClass().equals(Float.class) || value.getClass().equals(Double.class)) {
                writableMap.put(key, (Double) value);

            } else if (value.getClass().equals(String.class)) {
                writableMap.put(key, (String) value);

            } else if (value.getClass().equals(Boolean.class)) {
                writableMap.put(key, (Boolean) value);

            } else {
                Gson gson = new Gson();
                String json = gson.toJson(value);
                writableMap.put(key, json);
            }
        }

        loadFromReadableMap(writableMap);
    }

    public void loadFromReadableMap(Map readableMap) {
        if (readableMap.get("id")!=null) id = (Integer)readableMap.get("id");
        if (readableMap.get("subject")!=null) subject = (String)readableMap.get("subject");
        if (readableMap.get("message")!=null) message = (String)readableMap.get("message");
        if (readableMap.get("action")!=null) action = (String)readableMap.get("action");
        if (readableMap.get("payload")!=null) payload = (String)readableMap.get("payload");

        if (readableMap.get("delayed")!=null) delayed = (Boolean)readableMap.get("delayed");
        if (readableMap.get("delay")!=null) delay = (Integer)readableMap.get("delay");

        if (readableMap.get("scheduled")!=null) scheduled = (Boolean)readableMap.get("scheduled");
        if (readableMap.get("sendAt")!=null) sendAt = Long.parseLong((String)readableMap.get("sendAt"));
        if (readableMap.get("sendAtYear")!=null) sendAtYear = (Integer)readableMap.get("sendAtYear");
        if (readableMap.get("sendAtMonth")!=null) sendAtMonth = (Integer)readableMap.get("sendAtMonth");
        if (readableMap.get("sendAtDay")!=null) sendAtDay = (Integer)readableMap.get("sendAtDay");
        if (readableMap.get("sendAtWeekDay")!=null) sendAtWeekDay = (Integer)readableMap.get("sendAtWeekDay");
        if (readableMap.get("sendAtHour")!=null) sendAtHour = (Integer)readableMap.get("sendAtHour");
        if (readableMap.get("sendAtMinute")!=null) sendAtMinute = (Integer)readableMap.get("sendAtMinute");

        if (readableMap.get("repeatEvery")!=null) repeatEvery = (String)readableMap.get("repeatEvery");
        if (readableMap.get("repeatType")!=null) repeatType = (String)readableMap.get("repeatType");
        if (readableMap.get("repeatTime")!=null) repeatTime = (Integer)readableMap.get("repeatTime");
        if (readableMap.get("repeatCount")!=null) repeatCount = (Integer)readableMap.get("repeatCount");
        if (readableMap.get("endAt")!=null) endAt = Long.parseLong((String)readableMap.get("endAt"));

        if (readableMap.get("priority")!=null) priority = ((Double) readableMap.get("priority")).intValue();
        if (readableMap.get("smallIcon")!=null) smallIcon = (String)readableMap.get("smallIcon");
        if (readableMap.get("largeIcon")!=null) largeIcon = (String)readableMap.get("largeIcon");
        if (readableMap.get("sound")!=null) sound = (String)readableMap.get("sound");
        if (readableMap.get("vibrate")!=null) vibrate = (String)readableMap.get("vibrate");
        if (readableMap.get("lights")!=null) lights = (String)readableMap.get("lights");
        if (readableMap.get("autoClear")!=null) autoClear = (Boolean)readableMap.get("autoClear");
        else autoClear = true;
        if (readableMap.get("onlyAlertOnce")!=null) onlyAlertOnce = (Boolean)readableMap.get("onlyAlertOnce");
        if (readableMap.get("tickerText")!=null) tickerText = (String)readableMap.get("tickerText");
        if (readableMap.get("when")!=null) when = Long.parseLong((String)readableMap.get("when"));
        if (readableMap.get("bigText")!=null) bigText = (String)readableMap.get("bigText");
        if (readableMap.get("bigStyleImageBase64")!=null) bigStyleImageBase64 = (String)readableMap.get("bigStyleImageBase64");
        if (readableMap.get("subText")!=null) subText = (String)readableMap.get("subText");
        if (readableMap.get("progress")!=null) progress = (Integer)readableMap.get("progress");
        if (readableMap.get("color")!=null) color = (String)readableMap.get("color");
        if (readableMap.get("number")!=null) number = (Integer)readableMap.get("number");
        if (readableMap.get("category")!=null) category = (String)readableMap.get("category");
        if (readableMap.get("localOnly")!=null) localOnly = (Boolean)readableMap.get("localOnly");

    }

    public void loadFromReadableMap(ReadableMap readableMap) {
        if (readableMap.hasKey("id")) id = readableMap.getInt("id");
        if (readableMap.hasKey("subject")) subject = readableMap.getString("subject");
        if (readableMap.hasKey("message")) message = readableMap.getString("message");
        if (readableMap.hasKey("action")) action = readableMap.getString("action");
        if (readableMap.hasKey("payload")) payload = readableMap.getString("payload");

        if (readableMap.hasKey("delayed")) delayed = readableMap.getBoolean("delayed");
        if (readableMap.hasKey("delay")) delay = readableMap.getInt("delay");

        if (readableMap.hasKey("scheduled")) scheduled = readableMap.getBoolean("scheduled");
        if (readableMap.hasKey("sendAt")) sendAt = Long.parseLong(readableMap.getString("sendAt"));
        if (readableMap.hasKey("sendAtYear")) sendAtYear = readableMap.getInt("sendAtYear");
        if (readableMap.hasKey("sendAtMonth")) sendAtMonth = readableMap.getInt("sendAtMonth");
        if (readableMap.hasKey("sendAtDay")) sendAtDay = readableMap.getInt("sendAtDay");
        if (readableMap.hasKey("sendAtWeekDay")) sendAtWeekDay = readableMap.getInt("sendAtWeekDay");
        if (readableMap.hasKey("sendAtHour")) sendAtHour = readableMap.getInt("sendAtHour");
        if (readableMap.hasKey("sendAtMinute")) sendAtMinute = readableMap.getInt("sendAtMinute");

        if (readableMap.hasKey("repeatEvery")) repeatEvery = readableMap.getString("repeatEvery");
        if (readableMap.hasKey("repeatType")) repeatType = readableMap.getString("repeatType");
        if (readableMap.hasKey("repeatTime")) repeatTime = readableMap.getInt("repeatTime");
        if (readableMap.hasKey("repeatCount")) repeatCount = readableMap.getInt("repeatCount");
        if (readableMap.hasKey("endAt")) endAt = Long.parseLong(readableMap.getString("endAt"));

        if (readableMap.hasKey("priority")) priority = readableMap.getInt("priority");
        if (readableMap.hasKey("smallIcon")) smallIcon = readableMap.getString("smallIcon");
        if (readableMap.hasKey("largeIcon")) largeIcon = readableMap.getString("largeIcon");
        if (readableMap.hasKey("sound")) sound = readableMap.getString("sound");
        if (readableMap.hasKey("vibrate")) vibrate = readableMap.getString("vibrate");
        if (readableMap.hasKey("lights")) lights = readableMap.getString("lights");
        if (readableMap.hasKey("autoClear")) autoClear = readableMap.getBoolean("autoClear");
        else autoClear = true;
        if (readableMap.hasKey("onlyAlertOnce")) onlyAlertOnce = readableMap.getBoolean("onlyAlertOnce");
        if (readableMap.hasKey("tickerText")) tickerText = readableMap.getString("tickerText");
        if (readableMap.hasKey("when")) when = Long.parseLong(readableMap.getString("when"));
        if (readableMap.hasKey("bigText")) bigText = readableMap.getString("bigText");
        if (readableMap.hasKey("bigStyleImageBase64")) bigStyleImageBase64 = readableMap.getString("bigStyleImageBase64");
        if (readableMap.hasKey("subText")) subText = readableMap.getString("subText");
        if (readableMap.hasKey("progress")) progress = readableMap.getInt("progress");
        if (readableMap.hasKey("color")) color = readableMap.getString("color");
        if (readableMap.hasKey("number")) number = readableMap.getInt("number");
        if (readableMap.hasKey("category")) category = readableMap.getString("category");
        if (readableMap.hasKey("localOnly")) localOnly = readableMap.getBoolean("localOnly");

        if (readableMap.hasKey("inboxStyle")){
            inboxStyle = true;
            ReadableMap inboxStyle = readableMap.getMap("inboxStyle");

            inboxStyleBigContentTitle = inboxStyle.getString("bigContentTitle");
            inboxStyleSummaryText = inboxStyle.getString("summaryText");

            ReadableArray inboxLines = inboxStyle.getArray("lines");
            inboxStyleLines = new ArrayList<>();
            for(int i=0; i < inboxLines.size(); i++){
                inboxStyleLines.add(inboxLines.getString(i));
            }
        }else{
            inboxStyle = false;
        }

    }

    public ReadableMap asReadableMap() {
        WritableMap writableMap = new com.facebook.react.bridge.WritableNativeMap();

        if (id != null) writableMap.putInt("id", id);
        if (subject != null) writableMap.putString("subject", subject);
        if (message != null) writableMap.putString("message", message);
        if (action != null) writableMap.putString("action", action);
        if (payload != null) writableMap.putString("payload", payload);

        if (delayed != null) writableMap.putBoolean("delayed", delayed);
        if (delay != null) writableMap.putInt("delay", delay);

        if (scheduled != null) writableMap.putBoolean("scheduled", scheduled);
        if (sendAt != null) writableMap.putString("sendAt", Long.toString(sendAt));
        if (sendAtYear != null) writableMap.putInt("sendAtYear", sendAtYear);
        if (sendAtMonth != null) writableMap.putInt("sendAtMonth", sendAtMonth);
        if (sendAtDay != null) writableMap.putInt("sendAtDay", sendAtDay);
        if (sendAtWeekDay != null) writableMap.putInt("sendAtWeekDay", sendAtWeekDay);
        if (sendAtHour != null) writableMap.putInt("sendAtHour", sendAtHour);
        if (sendAtMinute != null) writableMap.putInt("sendAtMinute", sendAtMinute);

        if (repeatEvery != null) writableMap.putString("repeatEvery", repeatEvery);
        if (repeatType != null) writableMap.putString("repeatType", repeatType);
        if (repeatTime != null) writableMap.putInt("repeatTime", repeatTime);
        if (repeatCount != null) writableMap.putInt("repeatCount", repeatCount);
        if (endAt != null) writableMap.putString("endAt", Long.toString(endAt));

        if (priority != null) writableMap.putDouble("priority", (double) priority);
        if (smallIcon != null) writableMap.putString("smallIcon", smallIcon);
        if (largeIcon != null) writableMap.putString("largeIcon", largeIcon);
        if (sound != null) writableMap.putString("sound", sound);
        if (vibrate != null) writableMap.putString("vibrate", vibrate);
        if (lights != null) writableMap.putString("lights", lights);
        if (autoClear != null) writableMap.putBoolean("autoClear", autoClear);
        if (onlyAlertOnce != null) writableMap.putBoolean("onlyAlertOnce", onlyAlertOnce);
        if (tickerText != null) writableMap.putString("tickerText", tickerText);
        if (when != null) writableMap.putString("when", Long.toString(when));
        if (bigText != null) writableMap.putString("bigText", bigText);
        if (bigStyleImageBase64 != null) writableMap.putString("bigStyleImageBase64", bigStyleImageBase64);
        if (subText != null) writableMap.putString("subText", subText);
        if (progress != null) writableMap.putInt("progress", progress);
        if (color != null) writableMap.putString("color", color);
        if (number != null) writableMap.putInt("number", number);
        if (category != null) writableMap.putString("category", category);
        if (localOnly != null) writableMap.putBoolean("localOnly", localOnly);

        if (inboxStyle){

            WritableMap inboxStyle = new com.facebook.react.bridge.WritableNativeMap();

            if (inboxStyleBigContentTitle != null) inboxStyle.putString("bigContentTitle", inboxStyleBigContentTitle);
            if (inboxStyleSummaryText != null) inboxStyle.putString("summaryText", inboxStyleSummaryText);

            if(inboxStyleLines != null){
                WritableArray inboxLines =  new com.facebook.react.bridge.WritableNativeArray();
                for(int i=0; i < inboxStyleLines.size(); i++){
                    inboxLines.pushString(inboxStyleLines.get(i));
                }
                inboxStyle.putArray("lines", inboxLines);
            }

            writableMap.putMap("inboxStyle", inboxStyle);
        }

        return (ReadableMap) writableMap;
    }
}
