package com.example.nitishsharma.fragmentsunderstanding;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Test extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


    /// evry activity has fragment manger , kkep referernces of all the fragments ,, findbyid , findbytag
    // changes to ui in terms of adding //removing and replacing are conducted usin fragment tarsactoons


    //fragment manager befgin transaction and we can dd replace or whaever we want
    // then commit user sees the changes
    //


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_test, container, false);
    }


}
