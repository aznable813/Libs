package com.Fragments_Lib;
import android.app.*;
import java.util.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class frgmlib_TEST_Frg extends Fragment
{
	private static final String Lnum_KEY = "List_Num";
	private static final String PARCEL_KEY="PacelKey";

	
	//Create instance
	public static frgmlib_TEST_Frg newInstance(ArrayList<frgmlib_ListVal_a> PclList)
	{
		frgmlib_TEST_Frg tstFrg = new frgmlib_TEST_Frg();
		Bundle bndl=new Bundle();
		
		bndl.putInt(Lnum_KEY,PclList.size());
		bndl.putParcelableArrayList(PARCEL_KEY,PclList);
		tstFrg.setArguments(bndl);
	
		return tstFrg;
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
		// get argue
		ArrayList<frgmlib_ListVal_a> RtnPcl;
		String str1="";
		String strInt1="";
		String strInt2="";
		int arryCnt = getArguments().getInt(Lnum_KEY);
		RtnPcl=getArguments().getParcelableArrayList(PARCEL_KEY);
		
		for(int i=0;i<arryCnt;i++){
			str1 = str1+"\n"+RtnPcl.get(i).getTitle();
			strInt1 = strInt1+"\n"+String.valueOf(RtnPcl.get(i).getListID());
			strInt2 = strInt2+"\n"+String.valueOf(RtnPcl.get(i).getImgResID());
		}
		
		View v =inflater.inflate(R.layout.frgmlib_test_frg,null);
		
		//Set Text
		TextView tv1 = (TextView)v.findViewById(R.id.frgmlib_txt1);
		TextView tv2 = (TextView)v.findViewById(R.id.frgmlib_txt2);
		TextView tvint1 = (TextView)v.findViewById(R.id.frgmlib_int1);
		tv1.setText(str1);
		tv2.setText(strInt1);
		tvint1.setText(strInt2);
		
		return v;
		
	}
	
}
