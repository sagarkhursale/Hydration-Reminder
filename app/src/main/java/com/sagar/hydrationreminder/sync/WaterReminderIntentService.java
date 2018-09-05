package com.sagar.hydrationreminder.sync;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;


public class WaterReminderIntentService extends IntentService {

    public WaterReminderIntentService() {
        super("WaterReminderIntentService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        assert intent != null;
        String action = intent.getAction();
        ReminderTask.executeTask(this,action);
    }

    // end
}
