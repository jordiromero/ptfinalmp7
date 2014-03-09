package com.iesebre.ptfinalmp7;

import java.util.ArrayList;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

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
        TabSpec inboxSpec = tabHost.newTabSpec(PRIMERS_TAB);
        // Tab Icon
        inboxSpec.setIndicator(PRIMERS_TAB);
        Intent inboxIntent = new Intent(this, PrimersActivity.class);
        // Tab Content
        inboxSpec.setContent(inboxIntent);
         
        // Outbox Tab
        TabSpec outboxSpec = tabHost.newTabSpec(SEGONS_TAB);
        outboxSpec.setIndicator(SEGONS_TAB);
        Intent outboxIntent = new Intent(this, SegonsActivity.class);
        outboxSpec.setContent(outboxIntent);
         
        // Profile Tab
        TabSpec profileSpec = tabHost.newTabSpec(POSTRES_TAB);
        profileSpec.setIndicator(POSTRES_TAB);
        Intent profileIntent = new Intent(this, PostresActivity.class);
        profileSpec.setContent(profileIntent);
         
        // Adding all TabSpec to TabHost
        tabHost.addTab(inboxSpec); // Adding Inbox tab
        tabHost.addTab(outboxSpec); // Adding Outbox tab
        tabHost.addTab(profileSpec); // Adding Profile tab
	}
}