package com.Fragments_Lib;
import android.os.*;

public class frgmlib_ListVal_a implements Parcelable
{

	private String TitleText;
	private String DatText;
	private int ListID;
	private int ImgResID;
	
	
	@Override
	public int describeContents()
	{
		// STUB
		return 0;
	}

	@Override
	public void writeToParcel(Parcel out, int flags)
	{
		// TODO: Implement this method
		out.writeString(TitleText);
		out.writeString(DatText);
		out.writeInt(ListID);
		out.writeInt(ImgResID);
		
	}
	
	// Creating static field "CREATOR" for its interface
	public static final Parcelable.Creator<frgmlib_ListVal_a> CREATOR  
	= new Parcelable.Creator<frgmlib_ListVal_a>() {
		
        public frgmlib_ListVal_a createFromParcel(Parcel in) {  
            return new frgmlib_ListVal_a(in);  
        }  

        public frgmlib_ListVal_a[] newArray(int size) {  
            return new frgmlib_ListVal_a[size];  
        }  
    };  
	
	//internal Const
	private frgmlib_ListVal_a(Parcel in){
		TitleText=in.readString();
		DatText=in.readString();
		ListID=in.readInt();
		ImgResID=in.readInt();
	}
	
	//Nomal Const
	public frgmlib_ListVal_a(String title,String dattxt, int listid,int imgresid){
		TitleText=title;
		DatText=dattxt;
		ListID=listid;
		ImgResID=imgresid;
	}
	
	
	// get Method
	public String getTitle(){
		return TitleText;
	}
	public String getDatText(){
		return DatText;
	}
	public int getListID(){
		return ListID;
	}
	public int getImgResID(){
		return ImgResID;
	}
}
