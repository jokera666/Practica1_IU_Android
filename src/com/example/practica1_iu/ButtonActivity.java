package com.example.practica1_iu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class ButtonActivity extends Activity {
	
	Button button; 
	TextView textView;
	boolean pulsacion;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_button);
		
		button = (Button)findViewById(R.id.button1);
		textView = (TextView)findViewById(R.id.textView3);
		
		textView.setVisibility(View.INVISIBLE);
		
		
        button.setOnClickListener(new OnClickListener() 
        {
	        @Override 
	        public void onClick(View v)
	        {
	        	//textView.append(getString(R.string.info1));
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
