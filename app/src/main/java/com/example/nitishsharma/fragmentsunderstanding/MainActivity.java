package com.example.nitishsharma.fragmentsunderstanding;


import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;



public class MainActivity extends AppCompatActivity implements Communicator{


    ///////
    // within the same activity you can have differnt peices of UI junks


    // you can activate or deactivat those chunks based on certain ui actions

    // suppose two fragments inside activity , you select on list view  , base don selection image on other view changes
    // without navigating to other activity

    // they have own lifecycle // can process own events// can be added or removed while activity runs
    // introduced in honeycomb 11 // can use support libraries to support older versions//

    //// why you need fragements//combine several fragments in activites
    // reuse the same fragments inside activity
    //make better use of larger screen on activities
    // supports different layouts on portratit on landscape and portratit


    /// uses of fragments
    //flexible user ineerfaces across different screens
    // swipeble tabs
    // dialog boxes
    // acton bar customization using list and tab modes


    ///// HOW TO MAKE FRAGMENT
    ///// 1 -- extend the fragment class
    ///provide appearnce in xml
    ////can have fragment which does not require layout /


    //// link appearance --- static and dynamic creation of fragments
    ////use the fragment in xml in java
    // crate fragments dynamically in java


    /// 3 states of java - fragment as java object
    // then atched + activity
    //// then visible on screen


    //// fragment creation // fragment running ///fragment shutdown


    //////1////////////////////////////////////////2/
    /////activiy///////////////////////////////////fragment///

    // 1 oncreate //////////////////////////////////2onattach
    ////3 onattachfragment//////////////4 oncreate --//dont access ui elements here , because activity oncrete may or may noy have finished
    /////////////////////////////////////5 oncreateview  link ui elements of frament
    //////////////////////////////////////6 onactivity --executed after view oncreate has finished means ui is initialized and  redy to use
    // 7 onstart method   ////////////////8 onstar of fragment

    ///9 onresume called /////////////////10 onresume called


    ////////////now when user is exiting the appliction

    ///////////////////////////////////////////1 onpause
    //2 onpause ///////////////////////////////3 onave nstance
    //4 onsave instance     ///////// 5onstop
    // 6 onstop ////// 7ondestroyview ----- will exist as java object but its view heirarchy is not accesible
    ///////////9 ondestroy ///////////8 ondestroy    ///10ondetach --untied from activity


    ///

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        Test test = new Test();
//        FragmentManager frg =getFragmentManager();
//
//
//
//
//           FragmentTransaction txn = frg.beginTransaction();
//            txn.add(R.id.main
//                    ,test,"test");
//
//
//
//txn.commit();
    }


///////////////////

    ////inter fragment communication
    // create a interface that contans a method that which will acts as event a carrier
    // le the activity implement interface


    public void do1(View v) {
        Log.e("test", "coming");
    }

    @Override
    public void respond(String data) {

       FragmentManager m = getSupportFragmentManager();
     Fragment fb = (fragment_2)m.findFragmentById(R.id.fragment3);


       //fb.chagedata();

    }
}
