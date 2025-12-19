/*
 * Copyright (C) 2017 The OmniROM Project
 *               2022 The Evolution X Project
 *               2024 The crDroid Project
 * SPDX-License-Identifier: GPL-2.0-or-later
 */

package org.lineageos.settings;

import android.os.Bundle;

import com.android.settingslib.collapsingtoolbar.CollapsingToolbarBaseActivity;
import com.android.settingslib.widget.SettingsBasePreferenceFragment;

public class OPlusExtrasActivity extends CollapsingToolbarBaseActivity {

    private OPlusExtras mOPlusExtrasFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        androidx.fragment.app.Fragment fragment = getSupportFragmentManager().findFragmentById(
                                com.android.settingslib.collapsingtoolbar.R.id.content_frame);
        if (fragment == null) {
            mOPlusExtrasFragment = new OPlusExtras();
            getSupportFragmentManager().beginTransaction()
                .add(com.android.settingslib.collapsingtoolbar.R.id.content_frame, mOPlusExtrasFragment)
                .commit();
        } else {
            mOPlusExtrasFragment = (OPlusExtras) fragment;
        }
    }
}
