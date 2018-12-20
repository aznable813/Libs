package com.Fragments_Lib;
import android.app.*;
//import android.support.v4.app.*;
//import android.support.v4.app.Fragment;
import android.os.*;
import android.view.*;
import android.widget.*;

public class frgmlib_BlankFrg extends Fragment
{
	private final static String BG_COLOR = "Blnk_BG_color";
	private final static String MSG_TEXT = "Blnk_Msg_text";
	private final static String MSG_TEXT_SIZE = "Blnk_Msg_size";

	//Create instance
	public static frgmlib_BlankFrg newInstance(int bg_color,String Msg,float MsgSize){
		frgmlib_BlankFrg blnkFrg = new frgmlib_BlankFrg();
		Bundle bndl = new Bundle();
		
		bndl.putInt(BG_COLOR,bg_color);
		bndl.putString(MSG_TEXT,Msg);
		bndl.putFloat(MSG_TEXT_SIZE,MsgSize);
		blnkFrg.setArguments(bndl);
		return blnkFrg;
	}
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		//Inflate XML
		View v = inflater.inflate(R.layout.frgmlib_blank,null);
		
		//Set BG Color
		RelativeLayout rLay = (RelativeLayout)v.findViewById(R.id.frgmlib_blankRelativeLayout);
		rLay.setBackgroundColor(getArguments().getInt(BG_COLOR));
		
		//Set Text & TextSize
		TextView tv = (TextView)v.findViewById(R.id.frgmlib_blankTextView);
		tv.setText(getArguments().getString(MSG_TEXT));
		tv.setTextSize(getArguments().getFloat(MSG_TEXT_SIZE));
		
		return v;
	}
	
	
	
}


