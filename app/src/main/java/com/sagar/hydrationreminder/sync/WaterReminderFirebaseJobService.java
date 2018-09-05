package com.sagar.hydrationreminder.sync;

import android.app.job.JobParameters;
import com.firebase.jobdispatcher.JobService;


public class WaterReminderFirebaseJobService extends JobService {

    @Override
    public boolean onStartJob(com.firebase.jobdispatcher.JobParameters job) {
        return false;
    }

    @Override
    public boolean onStopJob(com.firebase.jobdispatcher.JobParameters job) {
        return false;
    }


    // END
}
