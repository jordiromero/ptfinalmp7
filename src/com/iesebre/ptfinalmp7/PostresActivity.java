package com.iesebre.ptfinalmp7;

import java.util.ArrayList;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class PostresActivity extends Activity {

	private ListView llista;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_postres);
		ArrayList<ListaEntradaSegons> dades = new ArrayList<ListaEntradaSegons>();
		dades.add(new ListaEntradaSegons(R.drawable.ic_broxeta, "Broxeta de Fruita",
				"La millor fruita per acabar un dinar"));
		dades.add(new ListaEntradaSegons(R.drawable.ic_ppoma,
				"Pastís de Poma",
				"Un classic de la reposteria"));
		llista = (ListView) findViewById(R.id.listViewPostres);
		llista.setAdapter(new Lista_adaptador(this,
				R.layout.entrada_llista, dades) {

			@Override
			public void onEntrada(Object entrada, View view) {
				if (entrada != null) {
					TextView text_principal = (TextView) view
							.findViewById(R.id.textViewTextPrincipal);
					if (text_principal != null)
						text_principal.setText(((ListaEntradaSegons) entrada)
								.get_textPrincipal());

					TextView text_secundari = (TextView) view
							.findViewById(R.id.textViewTextSecundari);
					if (text_secundari != null)
						text_secundari.setText(((ListaEntradaSegons) entrada)
								.get_textSecundari());

					ImageView imatge = (ImageView) view
							.findViewById(R.id.imageViewLlista);
					if (imatge != null)
						imatge.setImageResource(((ListaEntradaSegons) entrada)
								.get_idImatge());
				}

			}

		});
	}

}
