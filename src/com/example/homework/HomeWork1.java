package com.example.homework;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HomeWork1 extends Fragment{
	
	FragmentTransaction fTrans;
	dfrag dynfrag = new dfrag();
	int i=0;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
		      Bundle savedInstanceState){
		View v = inflater.inflate(R.layout.homeworklayout, null);
		
		Button btn = (Button) v.findViewById(R.id.btn1);
	    btn.setOnClickListener(new View.OnClickListener() {
	      public void onClick(View v) {
	        
	        fTrans = getFragmentManager().beginTransaction();
		// Re-check if fragment added to container
		// issue 25598, Android Issue Tracker
		if (i==0){
			fTrans.add(R.id.fL1, dynfrag);
			i++;
		}
		fTrans.addToBackStack(null);
		fTrans.commit();		      }
	    });
	   return v;
	}
}