package com.iesebre.ptfinalmp7;

public class ListaEntrada {
	
	private int idImatge; 
	private String textPrincipal; 
	private String textSecundari; 
	  
	public ListaEntrada (int idImatge, String textPrincipal, String textSecundari) { 
	    this.idImatge = idImatge; 
	    this.textPrincipal = textPrincipal; 
	    this.textSecundari = textSecundari; 
	}
	
	public String get_textPrincipal() { 
	    return textPrincipal; 
	}
	
	public String get_textSecundari() { 
	    return textSecundari; 
	}
	
	public int get_idImatge() {
	    return idImatge; 
	} 

}
