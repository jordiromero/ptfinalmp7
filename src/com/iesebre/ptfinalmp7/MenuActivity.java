package com.iesebre.ptfinalmp7;

import java.util.ArrayList;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

@SuppressWarnings("deprecation")
public class MenuActivity extends TabActivity {
	
	private static final String PRIMERS_TAB = "Primers";
	private static final String SEGONS_TAB = "Segons";
	private static final String POSTRES_TAB = "Postres";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu_layout);
		

       TabHost tabHost = getTabHost();
        
      //Primers Tab
        TabSpec primersTab = tabHost.newTabSpec(PRIMERS_TAB);
        primersTab.setIndicator(PRIMERS_TAB);
        Intent primersIntent = new Intent(this, PrimersActivity.class);
        // Contingut de la pestanya
        primersTab.setContent(primersIntent);
         
        // Segons Tab
        TabSpec segonsTab = tabHost.newTabSpec(SEGONS_TAB);
        segonsTab.setIndicator(SEGONS_TAB);
        Intent segonsIntent = new Intent(this, SegonsActivity.class);
        segonsTab.setContent(segonsIntent);
         
        // Postres Tab
        TabSpec postresTab = tabHost.newTabSpec(POSTRES_TAB);
        postresTab.setIndicator(POSTRES_TAB);
        Intent postresIntent = new Intent(this, PostresActivity.class);
        postresTab.setContent(postresIntent);
         
        // Adding all TabSpec to TabHost
        tabHost.addTab(primersTab); // afegim  la pestanya primers
        tabHost.addTab(segonsTab); // afegim  la pestanya segons
        tabHost.addTab(postresTab); // afegim  la pestanya postres
	}
}