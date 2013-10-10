package com.ghostwg.homework1;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.View;


public class MainActivity extends FragmentActivity {
	
	FragmentTransaction fTrans;
	dfrag dynfrag = new dfrag();;
	int i=0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	}
	
	public void onClick(View v){
		fTrans = getSupportFragmentManager().beginTransaction();
		// Re-check if fragment added to container
		// issue 25598, Android Issue Tracker
		if (i==0){
			fTrans.add(R.id.fL1, dynfrag);
			i++;
		}
		fTrans.addToBackStack(null);
		fTrans.commit();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
