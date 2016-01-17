package com.madhours.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.madhours.R;
import com.madhours.activities.ActivityEventDetails;

/**
 * Created by Home on 03-01-2016.
 */
public class FragmentVenues extends Fragment {

    public FragmentVenues() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.venue, null, false);
    }

}
