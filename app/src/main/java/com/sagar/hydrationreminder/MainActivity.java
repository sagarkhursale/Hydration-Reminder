package com.sagar.hydrationreminder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.sagar.hydrationreminder.utilities.PreferenceUtilities;


public class MainActivity extends AppCompatActivity {

    // Views
    private TextView mWaterCountDisplay;
    private TextView mChargingCountDisplay;
    private ImageView mChargingImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWaterCountDisplay = findViewById(R.id.tv_water_count);
        mChargingCountDisplay = findViewById(R.id.tv_charging_reminder_count);
        mChargingImageView = findViewById(R.id.iv_power_increment);

        // set original values in ui
        updateWaterCount();
        updateChargingReminderCount();



        // end
    }


    private void updateWaterCount() {
        int waterCount = PreferenceUtilities.getWaterCount(this);
        mWaterCountDisplay.setText(waterCount+"");
    }

    private void updateChargingReminderCount() {
        int chargingReminders = PreferenceUtilities.getChargingReminderCount(this);
        String formattedChargingReminders = getResources().getQuantityString(
                R.plurals.charge_notification_count, chargingReminders, chargingReminders);
        mChargingCountDisplay.setText(formattedChargingReminders);

    }



    // Image Button -Water_Increment..
    public void incrementWater(View view) {
    }


    // END
}
