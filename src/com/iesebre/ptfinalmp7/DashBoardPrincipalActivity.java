package com.iesebre.ptfinalmp7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class DashBoardPrincipalActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.principal_layout);
		// inicialitzem el boto OnEstem
		Button btnmap = (Button) findViewById(R.id.ButtonOnEstem);
		// inicialitzem el boto Carta
		Button btnmenu = (Button) findViewById(R.id.ButtonCarta);
		// inicialitzem el boto Reserva
		Button btnreserva = (Button) findViewById(R.id.ButtonReserva);

		// Iniciem l'activitat del onEstem quan fem clic sobre el botó
		btnmap.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent map = new Intent(getApplicationContext(),
						MapActivity.class);
				startActivity(map);

			}
		});
		// Iniciem l'activitat del carta quan fem clic sobre el botó
		btnmenu.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent carta = new Intent(getApplicationContext(),
						MenuActivity.class);
				startActivity(carta);

			}
		});
		// Iniciem l'activitat del reserva quan fem clic sobre el botó
		btnreserva.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent reserva = new Intent(getApplicationContext(),
						ReservaActivity.class);
				startActivity(reserva);

			}
		});
	}

}