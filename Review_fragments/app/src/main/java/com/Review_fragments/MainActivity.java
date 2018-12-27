package com.Review_fragments;

import android.app.*;
import android.os.*;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity
//public class MainActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		
		// create Fragment from MainFragment-class(Self made)
		//MainFragment testFrgmnt = new MainFragment();
	
		// Ctrate FragmentTransaction
		FragmentTransaction frantran = getSupportFragmentManager().beginTransaction();
		
		//★★★ First of all, this is just an action to add fragment
		frantran.add(R.id.conta,new MainFragment());
		frantran.add(R.id.conta,new MainFragment());
		// reflecting the setting of Fragment
		frantran.commit();
		
    }
}
