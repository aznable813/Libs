package com.Fragments_Lib;
import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;

import android.support.v4.app.Fragment;

public class frgmlib_FrgmForVP extends Fragment
{
	
	private final static String BG_COLOR = "BG_color";
	private final static String MSG_TEXT = "Msg_text";
	private final static String MSG_TEXT2 = "Msg_2text2";

	public static frgmlib_FrgmForVP newInstance(frgmlib_MultiValue mulval) {
        frgmlib_FrgmForVP frag = new frgmlib_FrgmForVP();
        Bundle b = new Bundle();
        b.putInt(BG_COLOR, mulval.getInt());
		b.putString(MSG_TEXT, mulval.getStr());
		b.putString(MSG_TEXT2, mulval.getStr2());
        frag.setArguments(b);
	
        return frag;
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
		// TODO: Implement this method
		View view = inflater.inflate(R.layout.frgmlib_fragment_main, null);
		LinearLayout lineLay = (LinearLayout)view.findViewById(R.id.frgmlib_fragment_mainLinearLayout);
		lineLay.setBackgroundColor(getArguments().getInt(BG_COLOR));
		//ScrollView sclVw =(ScrollView)view.findViewById(R.id.frgmlib_fragment_mainScrollView);
		//sclVw.setBackgroundColor(getArguments().getInt(BG_COLOR));
		TextView tv=(TextView)view.findViewById(R.id.frgmlib_fragment_mainTextView);
		tv.setText(getArguments().getString(MSG_TEXT));
		Button btn=(Button)view.findViewById(R.id.frgmlib_fragment_mainButton);
		btn.setText(getArguments().getString(MSG_TEXT2));

        return view;
	}

	
}
