package com.iesebre.ptfinalmp7;

import java.util.ArrayList;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class PrimersActivity extends Activity {
	
	private ListView llista; 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_primers);
		ArrayList<ListaEntrada> dades = new ArrayList<ListaEntrada>();
		dades.add(new ListaEntrada(R.drawable.ic_paella, "Paella", "Paella feta amb el millor arrós del món"));
		dades.add(new ListaEntrada(R.drawable.ic_sopa_verd, "Sopa de Verdura", "Sopa de verdura feta en verdures recient collide del hort"));
		llista = (ListView)findViewById(R.id.listViewPrimers);
		llista.setAdapter(new Lista_adaptador(this,R.layout.entrada_llista,dades){

			@Override
			public void onEntrada(Object entrada, View view) {
				 if (entrada != null) {
			            TextView text_principal = (TextView)view.findViewById(R.id.textViewTextPrincipal); 
			            if (text_principal != null) 
			            	text_principal.setText(((ListaEntrada) entrada).get_textPrincipal()); 
			              
			            TextView text_secundari = (TextView)view.findViewById(R.id.textViewTextSecundari); 
			            if (text_secundari != null)
			            	text_secundari.setText(((ListaEntrada) entrada).get_textSecundari()); 
			              
			            ImageView imatge = (ImageView)view.findViewById(R.id.imageViewLlista); 
			            if (imatge != null)
			            	imatge.setImageResource(((ListaEntrada) entrada).get_idImatge());
			        }
				
			}
			
		});
	
	}
}
