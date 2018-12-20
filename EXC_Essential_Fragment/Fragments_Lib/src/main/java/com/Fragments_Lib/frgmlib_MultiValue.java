package com.Fragments_Lib;

public class frgmlib_MultiValue
{
	// Private Variable definition //
	private String mString;
	private String mString2;
	private int mInt;
	private long mLong;
	private byte[] mByte;
	private boolean mBoolean;

// Setter //
	public void setStr(String str){
		mString = str;
	}
	public void setStr2(String str){
		mString2 = str;
	}
	public void setInt(int Int){
		mInt = Int;
	}
	public void setLng(long Long){
		mLong=Long;
	}
	public void setBytes(byte[] bytes){
		mByte=bytes;
	}
	public void setBool(boolean bool){
		mBoolean=bool;
	}

// Getter //
	public String getStr(){
		return mString;
	}
	public String getStr2(){
		return mString2;
	}
	public int getInt(){
		return mInt;
	}
	public long getLng(){
		return mLong;
	}
	public byte[] getBytes(){
		return mByte;
	}
	public boolean getBool(){
		return mBoolean;
	}
}
