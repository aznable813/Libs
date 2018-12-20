package com.Fragments_Lib;
import android.app.*;
import android.widget.*;

public enum MultiEvent
{
	EVENT1 {
		@Override
		public void apply(Activity activity,String filename){
			//
			Toast.makeText(activity,filename,Toast.LENGTH_SHORT).show();
		}
	},
	
	EVENT2 {
		@Override
		public void apply(Activity activity,String filename){
			//
			Toast.makeText(activity,"Event2222",Toast.LENGTH_SHORT).show();
			
		}
		
	},
	EVENT3 {
		@Override
		public void apply(Activity activity,String filename)
		{
			// TODO: Implement this method
			Toast.makeText(activity,"Event333",Toast.LENGTH_SHORT).show();
			
		}
		
	};
	
	abstract public void apply(Activity activity,String filename);
}
