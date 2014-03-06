package com.iesebre.ptfinalmp7;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

@SuppressLint("NewApi")
public class LoginControl extends LinearLayout {
	private EditText textUsuari;
	private EditText textContrasena;
	private Button buttonLogin;
	private OnLoginListener listener;

	public LoginControl(Context context) {
		super(context);
		inicialitzar();
	}

	public LoginControl(Context context, AttributeSet attrs) {
		super(context, attrs);
		inicialitzar();
	}

	public LoginControl(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}

	private void inicialitzar() {
		String infService = Context.LAYOUT_INFLATER_SERVICE;
		LayoutInflater li = (LayoutInflater) getContext().getSystemService(
				infService);
		li.inflate(R.layout.control_login, this, true);
		// Obtenim les referencies als diferents controls
		textUsuari = (EditText) findViewById(R.id.editText1);
		textContrasena = (EditText) findViewById(R.id.editText2);
		buttonLogin = (Button) findViewById(R.id.buttonLogin);
		// Associem els events necessaris
		asignarEventos();
	}

	public void setOnLoginListener(OnLoginListener l) {
		listener = l;
	}

	private void asignarEventos() {
		buttonLogin.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				listener.onLogin(textUsuari.getText().toString(),
						textContrasena.getText().toString());
			}
		});
	}
}