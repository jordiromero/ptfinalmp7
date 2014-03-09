package com.iesebre.ptfinalmp7;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class SegonsActivity extends Activity {
	private ListView llista; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_segons);
		ArrayList<ListaEntradaSegons> dades = new ArrayList<ListaEntradaSegons>();
		dades.add(new ListaEntradaSegons(R.drawable.ic_ternasco, "Ternasco", "Del millor corder tendre, tendre"));
		dades.add(new ListaEntradaSegons(R.drawable.ic_sepia, "Sopa de Verdura", "Sopa de verdura feta en verdures recient collide del hort"));
		llista = (ListView)findViewById(R.id.listViewPrimers);
		llista.setAdapter(new Lista_adaptador(this,R.layout.entrada_llista_segons,dades){

			@Override
			public void onEntrada(Object entrada, View view) {
				 if (entrada != null) {
			            TextView text_principal = (TextView)view.findViewById(R.id.textViewTextPrincipal); 
			            if (text_principal != null) 
			            	text_principal.setText(((ListaEntradaSegons) entrada).get_textPrincipal()); 
			              
			            TextView text_secundari = (TextView)view.findViewById(R.id.textViewTextSecundari); 
			            if (text_secundari != null)
			            	text_secundari.setText(((ListaEntradaSegons) entrada).get_textSecundari()); 
			              
			            ImageView imatge = (ImageView)view.findViewById(R.id.imageViewLlista); 
			            if (imatge != null)
			            	imatge.setImageResource(((ListaEntradaSegons) entrada).get_idImatge());
			        }
				
			}
			
		});
	}

}
