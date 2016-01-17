package com.madhours.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.madhours.R;
import com.madhours.activities.ActivityEventDetails;

/**
 * Created by Home on 03-01-2016.
 */
public class FragmentEvents extends Fragment {
    private LinearLayout lin_events;
    public FragmentEvents() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.events,null,false);
        lin_events= (LinearLayout)view.findViewById(R.id.lin_events);
        lin_events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), ActivityEventDetails.class);
                startActivity(intent);
            }
        });
        return view;


    }

}
