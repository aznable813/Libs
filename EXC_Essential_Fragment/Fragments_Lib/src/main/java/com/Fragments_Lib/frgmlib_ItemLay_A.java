package com.Fragments_Lib;
import android.widget.*;
import android.content.*;
import android.util.*;
import android.view.*;

public class frgmlib_ItemLay_A extends LinearLayout
{
	private TextView MainTitle;
	private TextView SubTitle;
	private ImageView IconImg;
	
	public frgmlib_ItemLay_A(Context conte,AttributeSet attr){
		super(conte,attr);	
	}

	@Override
	protected void onFinishInflate()
	{
		super.onFinishInflate();
		MainTitle=(TextView)findViewById(R.id.frgmlib_list_a_Main_TV);
		SubTitle=(TextView)findViewById(R.id.frgmlib_list_a_Sub_TV);
		IconImg=(ImageView)findViewById(R.id.frgmlib_list_a_IV);
	}
	
	public void bindViews(frgmlib_ListVal_a listval_a){
		MainTitle.setText(listval_a.getTitle());
		SubTitle.setText(listval_a.getDatText());
		IconImg.setImageResource(listval_a.getImgResID());
	}
	
}
