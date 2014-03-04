package com.iesebre.ptfinalmp7;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	private TextView textview1;
	private LoginControl login;
	private Button button1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//Executem un onClicklistener sobre el text Registrat ens envia 
		//al formulari per a introduir les nostres dades.
		TextView t2 = (TextView) findViewById(R.id.textView1);

		t2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this,
						FormulariActivity.class);
				startActivity(intent);

			}
		});
		//Iniciem el control de login
		login=(LoginControl)findViewById(R.id.CtlLogin);
		
		
		login.setOnLoginListener(new OnLoginListener() {
			
			@Override
			public void onLogin(String usuari, String contrasena) {
				// Validem usuari i contrasenya
				if(usuari.equals("demo") && contrasena.equals("demo")){
					//Toast.makeText(MainActivity.this, "Usuari Correcte", Toast.LENGTH_SHORT).show();
					button1 =(Button)findViewById(R.id.buttonLogin);
					button1.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View v) {
							Intent principal = new Intent(MainActivity.this,DashBoardPrincipalActivity.class);
							startActivity(principal);
							
						}
					});
							
				}else
					Toast.makeText(MainActivity.this, "Usuari Incorrecte", Toast.LENGTH_SHORT).show();
			}
			});
		
		
	
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
