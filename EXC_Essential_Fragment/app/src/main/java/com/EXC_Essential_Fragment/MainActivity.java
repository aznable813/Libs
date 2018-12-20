package com.EXC_Essential_Fragment;

import android.app.*;
import android.os.*;
import com.Fragments_Lib.*;
import android.graphics.*;
import android.support.v4.widget.*;
import java.io.*;
import android.util.*;
import java.util.*;
import android.widget.*;

public class MainActivity extends Activity implements frgmlib_ListViewFrg_a.ListViewFrg_a_Listener
{
	
	private final static String TagetPath="/storage/emulated/0/Download/";
	private final static String NothingStr="Filelist is nothing!";
	private String DispStr;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawer_main);
		
		//make lists
		ArrayList<frgmlib_ListVal_a> listdat = new ArrayList<frgmlib_ListVal_a>();
		frgmlib_ListVal_a Dat;
		
		//Get Filelist
		File FileDat = new File(TagetPath);
		File[] FileArray = FileDat.listFiles();
		if(FileArray==null){
			//DispStr=NothingStr;
			Dat = new frgmlib_ListVal_a("Nothing","empty",0,R.drawable.ic_launcher);
			listdat.add(Dat);
		}else{
			//DispStr="";
			for(int i=0;i<FileArray.length;i++){
				Dat=new frgmlib_ListVal_a(
											FileArray[i].getName(),
											FileArray[i].getAbsolutePath(),
											i,
											R.drawable.ic_launcher
											);
				listdat.add(Dat);	
			}
			
		}
		// Creating View when it's null
		if(savedInstanceState==null){
			//frgmlib_BlankFrg frgblnk = frgmlib_BlankFrg.newInstance(Color.CYAN,"TEST DA!TEST DA!TEST DA!TEST DA!TEST DA!TEST DA!TEST DA!TEST DA!TEST DA!",20);
			frgmlib_ListViewFrg_a frglist = frgmlib_ListViewFrg_a.newInstance(listdat);
			frgmlib_ListViewFrg_a frglist2 = frgmlib_ListViewFrg_a.newInstance(listdat);
			//frgmlib_BlankFrg frgblnk2 = frgmlib_BlankFrg.newInstance(Color.RED,DispStr,30);
		
			FragmentManager FM = getFragmentManager();
			FM.beginTransaction().add(R.id.container,frglist).commit();
			FM.beginTransaction().add(R.id.drawer_ListFrgLay,frglist2).commit();
			//FM.beginTransaction().add(R.id.drawer_listLay,frgblnk2).commit();
		}
		
    }

	@Override
	public void onListviewlistener(MultiEvent mulevent, String filename)
	{
		mulevent.apply(this,filename);
	}

	
	
	
	
}
