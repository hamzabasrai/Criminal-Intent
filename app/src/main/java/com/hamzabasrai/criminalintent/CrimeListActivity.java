package com.hamzabasrai.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Hamza Basrai on 4/21/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
