package com.Review_fragments;

import android.app.*;
import android.os.*;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentTransaction;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity
//public class MainActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		
		// create Fragment from MainFragment-class(Self made) if it is the first time.
		if(savedInstanceState == null){
			
			// Ctrate FragmentTransaction
			FragmentTransaction frantran = getSupportFragmentManager().beginTransaction();

			//★★★ Recycle fragment and tarnsfer data from Activity to Fragment
			frantran.replace(R.id.conta,MainFragment.createInstance("Turn to Hoge",Color.RED));
			frantran.replace(R.id.conta2,MainFragment.createInstance("Change to A-BE-SHI",Color.BLUE));
			// reflecting the setting of Fragment
			frantran.commit();

		}
		
    }
}
