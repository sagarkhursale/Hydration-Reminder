package com.sagar.hydrationreminder.sync;

import android.content.Context;

import com.sagar.hydrationreminder.utilities.NotificationUtil;
import com.sagar.hydrationreminder.utilities.PreferenceUtilities;


public  class ReminderTask {

    public static final String ACTION_INCREMENT_WATER_COUNT = "increment-water-count";
    public static final String ACTION_DISMISS_NOTIFICATION = "dismiss-notification";
    static final String ACTION_CHARGING_REMINDER = "charging-reminder";


    public static void executeTask(Context context, String action) {
        if (ACTION_INCREMENT_WATER_COUNT.equals(action)) {
            incrementWaterCount(context);
        }else if (ACTION_DISMISS_NOTIFICATION.equals(action)) {
            NotificationUtil.clearAllNotifications(context);
        }
    }


    private static void incrementWaterCount(Context context) {
        PreferenceUtilities.incrementWaterCount(context);
        NotificationUtil.clearAllNotifications(context);
    }


    private static void issueChargingReminder(Context context) {
        PreferenceUtilities.incrementChargingReminderCount(context);
        NotificationUtil.remindUserBecauseCharging(context);
    }


    // END
}
