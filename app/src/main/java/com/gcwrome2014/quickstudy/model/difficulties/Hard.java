package com.gcwrome2014.quickstudy.model.difficulties;

import com.gcwrome2014.quickstudy.R;
import com.gcwrome2014.quickstudy.settings.SetCustomDiffActivity;

/**
 * Created by Luigi on 13/02/2015.
 */
public class Hard extends Difficulty {

    public Hard() {
        super("Hard", R.drawable.icon_hard_test);
    }

    @Override
    public int getHoursOfStudy() {
        return SetCustomDiffActivity.DIFFICULTY_HOURS_HARD;
    }
}
