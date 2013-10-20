package com.example.homework;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;

public class AnimationFrame extends Fragment {
	
	Animation anim;

	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
		      Bundle savedInstanceState){
		
			View v = inflater.inflate(R.layout.homeworklayout2, null);
			final TextView tV = (TextView) v.findViewById(R.id.textView1);
			
			Button btAlpha = (Button) v.findViewById(R.id.button1);
			Button btRotate = (Button) v.findViewById(R.id.button4);
			Button btMove = (Button) v.findViewById(R.id.button3);
			Button btScale = (Button) v.findViewById(R.id.button2);
			
			btAlpha.setOnClickListener(new View.OnClickListener() {
		      public void onClick(View v) {
		    	  anim=AnimationUtils.loadAnimation(getActivity().getApplicationContext(),R.layout.alpha);
		          tV.setVisibility(1);
		          tV.startAnimation(anim);
		      }
		    });
			
			btRotate.setOnClickListener(new View.OnClickListener() {
			      public void onClick(View v) {
			    	  anim=AnimationUtils.loadAnimation(getActivity().getApplicationContext(),R.layout.rotate);
			          tV.setVisibility(1);
			          tV.startAnimation(anim);
			      }
			    });
			
			btMove.setOnClickListener(new View.OnClickListener() {
			      public void onClick(View v) {
			    	  anim=AnimationUtils.loadAnimation(getActivity().getApplicationContext(),R.layout.move);
			          tV.setVisibility(1);
			          tV.startAnimation(anim);
			      }
			    });
				
			btScale.setOnClickListener(new View.OnClickListener() {
			      public void onClick(View v) {
			    	  anim=AnimationUtils.loadAnimation(getActivity().getApplicationContext(),R.layout.scale);
			          tV.setVisibility(1);
			          tV.startAnimation(anim);
			      }
			    });
			
		   return v;
		}
		
	
}
	
