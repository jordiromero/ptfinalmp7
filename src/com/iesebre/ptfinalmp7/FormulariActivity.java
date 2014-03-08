package com.iesebre.ptfinalmp7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class FormulariActivity extends Activity {
	private TextView condicions;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.formulari_layout);
		
		TextView condicions = (TextView)findViewById(R.id.textViewCondicions);
		condicions.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent condicions = new Intent(FormulariActivity.this, CondicionsActivity.class );
				startActivity(condicions);
				
			}
		});
		
	}
}
