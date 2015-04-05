package com.example.practica1_iu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class ImageButton1 extends Activity {

	TextView textView;
	ImageButton botonImagen;
	boolean pulsacion;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_image_button);
		
		textView = (TextView)findViewById(R.id.textView3);
		textView.setVisibility(View.INVISIBLE);
		
		botonImagen = (ImageButton)findViewById(R.id.botonImagen1);
		
		
        botonImagen.setOnClickListener(new OnClickListener() 
        {
	        @Override 
	        public void onClick(View v)
	        {
	        	if(pulsacion == false){
	        		textView.setVisibility(View.VISIBLE);
	        		pulsacion = true;
	        	}
	        	else{
	        		textView.setVisibility(View.INVISIBLE);
	        		pulsacion = false;
	        	}
	        }
        });
	}
}
