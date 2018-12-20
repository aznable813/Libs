package com.Fragments_Lib;
import android.app.*;
import java.util.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.content.*;
import android.util.*;
import android.nfc.*;
import android.view.View.*;

public class frgmlib_ListViewFrg_a extends Fragment
{	
	private static final String PARCEL_KEY="PacelKey";
	private Context ThisConte;
	private Activity ThisActivity=null;
	private ListViewFrg_a_Listener mLister=null;
	private int ResID = R.layout.frgmlib_list_row_a;
	
	//Create instance
	public static frgmlib_ListViewFrg_a newInstance(ArrayList<frgmlib_ListVal_a> PclList)
	{
		frgmlib_ListViewFrg_a tstFrg = new frgmlib_ListViewFrg_a();
		Bundle bndl=new Bundle();
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
	
	
	// Listener & Activity are set here  
	@Override
	public void onAttach(Activity activity)
	{
		// TODO: Implement this method
		super.onAttach(activity);
		if(!(activity instanceof ListViewFrg_a_Listener)){
			throw new UnsupportedOperationException(
				"Listener is not Implementation!!!"
			);
		}else{
			mLister=(ListViewFrg_a_Listener)activity;
		}
		ThisActivity=activity;
	}

	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		ThisConte = getActivity();
		ArrayList<frgmlib_ListVal_a> RtnPcl = getArguments().getParcelableArrayList(PARCEL_KEY);
		View v = inflater.inflate(R.layout.frgmlib_listfrgmnt,null);
		
		ListView lv=(ListView)v.findViewById(R.id.frgmlib_ListViewFrgmnt);
		inListAdptr_a ladpt = new inListAdptr_a(RtnPcl);
		lv.setAdapter(ladpt);
		
		
		// TODO: Implement this method
		return v;
	}
	///////////////////////////////////////
	//Inner Adapter Class
	///////////////////////////////////////
	public class inListAdptr_a extends BaseAdapter
	{
		private LayoutInflater mFactory;
		private ArrayList<frgmlib_ListVal_a> DataList;

		public inListAdptr_a(ArrayList<frgmlib_ListVal_a> lists) {
			
			mFactory = (LayoutInflater) ThisConte.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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
			final int ID = position;
			Item_lay.setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View v){
					if(mLister!=null){
						mLister.onListviewlistener(MultiEvent.EVENT1,getItem(ID).getTitle());
					}
				}
			});

			// TODO: Implement this method
			return Item_lay;
		}
	}
	
	public interface ListViewFrg_a_Listener{
		void onListviewlistener(MultiEvent mulevent,String filename)
	}
	
	
}
