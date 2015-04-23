package com.example.practica1_iu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class RecibirForm extends Activity {

	private TextView textViewID;
	ImageButton botonCasa;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_recibir_form);
		
		Bundle bundle = this.getIntent().getExtras();
        if (bundle!=null)
        {
        	textViewID=(TextView) findViewById(R.id.cadenaRecibida);
        	//Se obtiene el parametro del bundle(Contenedor) y se asigna al control
        	textViewID.setText(bundle.getString("parametros"));
        }
        
        //Boton que nos envia a la actividad Main
        botonCasa = (ImageButton)findViewById(R.id.btnCasa);
        botonCasa.setOnClickListener(new View.OnClickListener()
        {
        	@Override
        	public void onClick(View arg0)
        	{
        		Intent intent = new Intent(RecibirForm.this,MainActivity.class);
        		startActivity(intent);
        	}
        });
	}
}
