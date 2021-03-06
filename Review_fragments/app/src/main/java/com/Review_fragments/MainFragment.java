package com.Review_fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.*;
import android.widget.*;
import android.view.View.*;
import android.support.annotation.*;
import android.graphics.Color;


// Succeed to Fragment Class
public class MainFragment extends Fragment
{
	
	//Bundle Keys
	private final static String KEY_NAME = "key_name";
	private final static String KEY_BKGROUND = "bg_color";
	//Bundle Default
	private String tranDef_name = "";
	private @ColorInt int tranDef_Bgcolor = Color.TRANSPARENT;
	

	//The "text" that chages when you click button
	private TextView ChgTxt;

	
	@CheckResult  // Force to create this class WITH THIS METHOD
	public static MainFragment createInstance(String strName, @ColorInt int color){
 		//##  Create Fragment which has bundle-data
		
		MainFragment rtnFragment = new MainFragment();
		
		//Create bundle which transfer data to new fragment
		Bundle args = new Bundle();
		
		//Set data into bundle-data
		args.putString(KEY_NAME,strName);
		args.putInt(KEY_BKGROUND,color);
		
		//Set bundle-data into Fragment
		rtnFragment.setArguments(args);
		return rtnFragment;
	}
	
	// you get bundle when fragment will be created
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		// you get bundle-data here(onCreate) 
		
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		
		//get Bundle
		Bundle getArgs = getArguments();
		
		//check null in bundle
		if(getArgs != null){
			tranDef_name = getArgs.getString(KEY_NAME,"");
			tranDef_Bgcolor=getArgs.getInt(KEY_BKGROUND,Color.TRANSPARENT);
		}
		
	}
	
	
	
	//Create View on Fragment
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		
		// TODO: Implement this method
		super.onCreateView(inflater, container, savedInstanceState);
		return inflater.inflate(R.layout.fragment_main,container,false);
	}

	// Action after View is created
	@Override
	public void onViewCreated(View view, Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onViewCreated(view, savedInstanceState);
		
		//relate ChgTxt with "mainF_txt"-Textview
		ChgTxt = (TextView) view.findViewById(R.id.mainF_txt);
		view.setBackgroundColor(tranDef_Bgcolor);
		
		//Set new onclicklistener
		view.findViewById(R.id.mainF_Btn).setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				// Change text When you click this button
				ChgTxt.setText(tranDef_name);
			}
			
		});
		
	}
	
}
