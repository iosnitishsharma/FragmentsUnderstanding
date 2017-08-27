package com.example.nitishsharma.fragmentsunderstanding;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class fragent_1 extends Fragment implements View.OnClickListener {
Communicator comm ;

    /// an interface reference variable can efer to subclass obcet dynamic runtime polymorphism
Button b1;
    int count = 0 ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_1, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        b1 = (Button)getActivity().findViewById(R.id.button);
        b1.setOnClickListener(this);
        comm = (Communicator) getActivity();


    }

    @Override
    public void onClick(View view) {
count++ ;
        comm.respond("button clicked "+count+"times");
    }
}
