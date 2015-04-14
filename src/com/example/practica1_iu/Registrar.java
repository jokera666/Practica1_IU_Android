package com.example.practica1_iu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ArrayAdapter;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.Spinner;

public class Registrar extends Activity {
	
	private EditText nombre;
	private Button enviar;
	private Button borrar;
	private Spinner combo;
	private RadioButton hombre;
	private RadioButton mujer;
	private String nombreCadena;
	private String cadenaEnviada;
	private String edad;
	private String sexo;
	private CheckBox estudiante;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_registrar);
		
		nombre = (EditText)findViewById(R.id.editText1);
		
		//RadioGroup grupoRadio = (RadioGroup)findViewById(R.id.radioSex);
		
		
		
		hombre = (RadioButton)this.findViewById(R.id.radioButton1);
		mujer = (RadioButton)this.findViewById(R.id.radioButton2);
		
		estudiante =(CheckBox)this.findViewById(R.id.checkBox1);
		

		
		
		combo = (Spinner) findViewById(R.id.spinner1);
		// Create an ArrayAdapter using the string array and a default spinner layout
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
		R.array.comboEdades, android.R.layout.simple_spinner_item);
		// Specify the layout to use when the list of choices appears
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		// Apply the adapter to the spinner
		combo.setAdapter(adapter);
		
		


		
		enviar = (Button)findViewById(R.id.botonEnviar);
		enviar.setOnClickListener(new OnClickListener()
	    {

			@Override
			public void onClick(View arg0) {
		
				nombreCadena = nombre.getText().toString();
				
				if(hombre.isChecked() == true){
					
					sexo = "hombre";
				}
				

				if(mujer.isChecked() == true){
					sexo = "mujer";
				}
				
				edad = combo.getSelectedItem().toString();
				
				cadenaEnviada = nombreCadena+"es "+sexo+",tiene entre "+edad+" años";
				Log.i("CADENA",cadenaEnviada);
                
            	//Creamos el Intent
            	Intent intent = new Intent(Registrar.this, RecibirForm.class);
            	
            	//Creamos la informacion a pasar entre actividades
            	Bundle b = new Bundle();
            	if(estudiante.isChecked())
            	{
            		cadenaEnviada += " y es estudiante";
            		b.putString("param",cadenaEnviada);
            	}
            	
            	else {
            		cadenaEnviada += " y no es estudiante";
            		b.putString("param",cadenaEnviada);
            	}
				
            	
            	//Añadimos la informacion al intent
            	intent.putExtras(b);
            	
            	//Iniciamos la nueva actividad
                startActivity(intent);
				
			}
        });
		
		borrar = (Button)this.findViewById(R.id.botonBorrar);
		borrar.setOnClickListener(new OnClickListener() 
        {
	        @Override 
	        public void onClick(View v)
	        {
	        	nombre.setText(null);
	        	hombre.setChecked(false);
	        	mujer.setChecked(false);
	        	combo.setSelection(0);
	        	estudiante.setChecked(false);
	        }
        }); 
		
	}
	
}


