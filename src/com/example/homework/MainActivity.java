package com.example.homework;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.*;

public class MainActivity extends ActionBarActivity {
	private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private ActionBarDrawerToggle mDrawerToggle;

    private CharSequence mDrawerTitle;
    private CharSequence mTitle;
    private String[] mHomeWorks;
    
    HomeWork1 homework1 = new HomeWork1();
    HomeWork3 multipanelayout = new HomeWork3();
    Startframe startframe = new Startframe();
    AnimationFrame animation = new AnimationFrame();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
	getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    getSupportActionBar().setHomeButtonEnabled(true);
    
    mTitle = mDrawerTitle = getTitle();
    mHomeWorks = getResources().getStringArray(R.array.HomeWork);
    mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
    mDrawerList = (ListView) findViewById(R.id.left_drawer);
	
    mDrawerList.setAdapter(new ArrayAdapter<String>(this,
            R.layout.drawer_list_item, mHomeWorks));
    
   mDrawerList.setOnItemClickListener(new DrawerItemClickListener());
    
   mDrawerToggle = new ActionBarDrawerToggle(
            this,                  /* host Activity */
            mDrawerLayout,         /* DrawerLayout object */
            R.drawable.ic_drawer,  /* nav drawer image to replace 'Up' caret */
            R.string.drawer_open,  /* "open drawer" description for accessibility */
            R.string.drawer_close  /* "close drawer" description for accessibility */
            ) {
        public void onDrawerClosed(View view) {
            getSupportActionBar().setTitle(R.string.app_name);
        }
        public void onDrawerOpened(View drawerView) {
            getSupportActionBar().setTitle(R.string.drawer_open);
        }
    };
    
    mDrawerLayout.setDrawerListener(mDrawerToggle);

    if (savedInstanceState == null) {
    	getSupportFragmentManager().beginTransaction().
    	    replace(R.id.content_frame,startframe).commit();
    	
    }
}
    
	private class DrawerItemClickListener implements ListView.OnItemClickListener {
		@Override
		public void onItemClick(AdapterView parent, View view, int position, long id) {
			selectItem(position);
		}
	}

	private void selectItem(int position) {
		// TODO Auto-generated method stub
		
		switch (position){
			case 0:
				openHomeTask1();
				break;
			case 1:
				openHomeTask2();
				break;
            case 2:
                openHomeTask3();
                break;
		}
	}
	
	public void openHomeTask1(){
		getSupportFragmentManager().beginTransaction().
		   replace(R.id.content_frame, homework1).commit();
	}
	
	public void openHomeTask2(){
		getSupportFragmentManager().beginTransaction().
		   replace(R.id.content_frame, animation).commit();
	}

    public void openHomeTask3(){
        getSupportFragmentManager().beginTransaction().
                replace(R.id.content_frame, multipanelayout).commit();
    }
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
}
