package com.gcw_rome_2014.quickstudy.model.difficulties;

import com.gcw_rome_2014.quickstudy.R;

/**
 * Created by Luigi on 13/02/2015.
 */
public class Medium extends Difficulty {

    public Medium() {
        super("Medium", R.drawable.icon_medium_test);
    }

    @Override
    public int getHoursOfStudy() {
        return 2;
    }
}