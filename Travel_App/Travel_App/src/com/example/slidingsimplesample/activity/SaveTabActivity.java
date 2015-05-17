package com.example.slidingsimplesample.activity;

import com.example.slidingsimplesample.R;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

@SuppressWarnings("deprecation")
public class SaveTabActivity extends TabActivity{
	
	public static boolean isRunning = false;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.travel_plans);
		
		isRunning = true;
		
		// create the TabHost that will contain the Tabs
		TabHost tabHost = (TabHost)findViewById(android.R.id.tabhost);
		
		
		TabSpec tab1 = tabHost.newTabSpec("First Tab");
		TabSpec tab2 = tabHost.newTabSpec("Second Tab");
		
		// Set the Tab name and Activity
        // that will be opened when particular Tab will be selected
		tab1.setIndicator("Current");
		tab1.setContent(new Intent(this, Save_CurrentActivity.class));
		
		tab2.setIndicator("Past");
		tab2.setContent(new Intent(this, Save_PastActivity.class));
		
		
		/** Add the tabs  to the TabHost to display. */
		tabHost.addTab(tab1);
		tabHost.addTab(tab2);
//		tabHost.setCurrentTab(1);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.travel_menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.add) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
