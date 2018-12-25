package com.Review_fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.*;
import android.widget.*;
import android.view.View.*;


// Succeed to Fragment Class
public class MainFragment extends Fragment
{
	
	//The "text" that chages when you click button
	private TextView ChgTxt;
	
	
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
		
		//Set new onclicklistener
		view.findViewById(R.id.mainF_Btn).setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				// Change text When you click this button
				ChgTxt.setText(R.string.mainF_ChgText);
			}
			
		});
		
	}
	
}
