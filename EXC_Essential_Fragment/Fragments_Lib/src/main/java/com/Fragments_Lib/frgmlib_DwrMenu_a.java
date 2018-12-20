package com.Fragments_Lib;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class frgmlib_DwrMenu_a extends Fragment
{
	private final static String BG_IMG_ID = "Bg_Img_ResID";
	private final static String MENU_TITLE = "Menu_Title";
	private final static String MENU_LIST = "Menu_List";
	//private final static String MENU_LIST_ID = "Menu_List_ID";
	//Create instance
	public static frgmlib_BlankFrg newInstance(int BgImgResID,frgmlib_ListVal_a listval,float MsgSize){
		frgmlib_BlankFrg blnkFrg = new frgmlib_BlankFrg();
		Bundle bndl = new Bundle();

		bndl.putInt(BG_IMG_ID,BgImgResID);
		//bndl.putParcelableArrayList(
		
		//bndl.putString(Menu_Title,Msg);
		//bndl.putFloat(MSG_TEXT_SIZE,MsgSize);
		blnkFrg.setArguments(bndl);
		return blnkFrg;
	}
	
}
