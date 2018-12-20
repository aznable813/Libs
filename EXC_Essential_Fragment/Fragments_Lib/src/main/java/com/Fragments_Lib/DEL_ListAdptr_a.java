package com.Fragments_Lib;
import android.widget.*;
import android.content.*;
import java.util.*;
import android.view.*;
import android.util.*;

public class DEL_ListAdptr_a extends BaseAdapter
{
	private LayoutInflater mFactory;
	private int ResID;
	private ArrayList<frgmlib_ListVal_a> DataList;
	
	public DEL_ListAdptr_a(Context conte, int resource, ArrayList<frgmlib_ListVal_a> lists) {
		//super(conte,resource,lists);

		mFactory = (LayoutInflater) conte.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		ResID = resource;
		DataList=lists;
	}

	@Override
	public frgmlib_ListVal_a getItem(int position)
	{
		// TODO: Implement this method
		//return super.getItem(position);
		return DataList.get(position);
	}

	@Override
	public long getItemId(int p1)
	{
		// TODO: Implement this method
		return 0;
	}

	@Override
	public int getCount()
	{
		// TODO: Implement this method
		return DataList.size();
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent)
	{
		final frgmlib_ItemLay_A Item_lay;
		
		if(convertView==null){
			Item_lay=(frgmlib_ItemLay_A)mFactory.inflate(ResID,null);
		}else{
			Item_lay=(frgmlib_ItemLay_A)convertView;
		}
			Item_lay.bindViews(getItem(position));
		
		// TODO: Implement this method
		return Item_lay;
	}
	
	
	
}
