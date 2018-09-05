package com.sagar.hydrationreminder.utilities;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

import com.sagar.hydrationreminder.MainActivity;

/**
 * Utility class for creating hydration notifications
 */
public class NotificationUtil {

    private static final int WATER_REMINDER_PENDING_INTENT_ID = 3417;


    private static PendingIntent contentIntent(Context context) {
        Intent startActivityIntent = new Intent(context, MainActivity.class);
        return PendingIntent.getActivity(
                context,
                WATER_REMINDER_PENDING_INTENT_ID,
                startActivityIntent,
                PendingIntent.FLAG_UPDATE_CURRENT);
    }

    // END
}
