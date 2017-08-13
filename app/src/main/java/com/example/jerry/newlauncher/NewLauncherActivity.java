package com.example.jerry.newlauncher;

import android.support.v4.app.Fragment;

public class NewLauncherActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return NewLauncherFragment.newInstance();
    }


}
