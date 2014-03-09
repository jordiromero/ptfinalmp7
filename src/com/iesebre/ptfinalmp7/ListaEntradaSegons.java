package com.iesebre.ptfinalmp7;

public class ListaEntradaSegons {
	
	private int idImatge; 
	private String textPrincipal; 
	private String textSecundari; 
	  
	public ListaEntradaSegons (int idImatge, String textPrincipal, String textSecundari) { 
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
