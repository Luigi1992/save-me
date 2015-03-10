package com.gcw_rome_2014.quickstudy.model.difficulties;

import com.gcw_rome_2014.quickstudy.R;
import com.gcw_rome_2014.quickstudy.SettingsActivity;

/**
 * Created by Luigi on 13/02/2015.
 */
public class Hard extends Difficulty {

    public Hard() {
        super("Hard", R.drawable.icon_hard_test);
    }

    @Override
    public int getHoursOfStudy() {
        return SettingsActivity.DIFFICULTY_HOURS_HARD;
    }
}
