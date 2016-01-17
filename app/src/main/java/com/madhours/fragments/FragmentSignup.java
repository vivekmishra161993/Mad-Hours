package com.madhours.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.madhours.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentSignup extends Fragment {


    public FragmentSignup() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_signup,null,false);
    }

}
