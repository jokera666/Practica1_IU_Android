package com.example.practica1_iu;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SpinnerActivity extends Activity {

	Spinner miSpinner;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_spinner);
		
		miSpinner = (Spinner) findViewById(R.id.spinner1);
		// Crear ArrayAdapter usando un string de array y el spinner layout por defecto
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
		R.array.combo, android.R.layout.simple_spinner_item);
		//La apariencia del adaptador con las opciones
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		// Aplicar el addapter al spinner
		miSpinner.setAdapter(adapter);
	}
}
