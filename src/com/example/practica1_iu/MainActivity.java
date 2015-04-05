package com.example.practica1_iu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/*MainActivity es el Layout principal es decir la primera pantalla
 * que aparece a la hora de arrancar la aplicacion que hereda de la clase
 * Activity*/
public class MainActivity extends Activity 
{
    /*savedInstanceState: Es un metodo que nos asegura que no se va romper nada
     * si el sistema operativo mata a nuestra aplicacion*/
	@Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        
        Log.i("NESTOR",getString(R.string.log));
        
        /*Muestra el Layout establecido (activity_main) por pantalla*/
        setContentView(R.layout.activity_main);
        
        
        /*Crear un objeto button1 de la clase Button y identificando 
         * dicho objeto a traves de la predifinicion a partir del ID
         * del fichero activity_main.xml*/
        Button button1 = (Button) findViewById(R.id.Button1);
        
        /*metodo aplicado al button a la escucha de un click
         * que redirige con el Intent a otro Layout (a otra  pagina).
         * new View.OnClickListener es una clase anonima */
        button1.setOnClickListener(new View.OnClickListener()
        {
        	@Override
        	public void onClick(View arg0)
        	{
        		Intent intent = new Intent(MainActivity.this,ButtonActivity.class);
        		startActivity(intent);
        	}
        });
        
        
        Button button2 = (Button) findViewById(R.id.Button2);
        button2.setOnClickListener(new View.OnClickListener() 
        {
			
			@Override
			public void onClick(View v)
			{
			Intent intent = new Intent(MainActivity.this,ImageView.class);
			startActivity(intent);	
			}
		});
        
        
        Button button3 = (Button) findViewById(R.id.Button3);
        button3.setOnClickListener(new View.OnClickListener() 
        {
			
			@Override
			public void onClick(View v)
			{
			Intent intent = new Intent(MainActivity.this,RadioButton.class);
			startActivity(intent);	
			}
		});
       
        Button button4 = (Button) findViewById(R.id.Button4);
        button4.setOnClickListener(new View.OnClickListener() 
        {
			
			@Override
			public void onClick(View v)
			{
			Intent intent = new Intent(MainActivity.this,CheckBox.class);
			startActivity(intent);	
			}
		});
        
        Button button5 = (Button) findViewById(R.id.Button5);
        button5.setOnClickListener(new View.OnClickListener() 
        {
			
			@Override
			public void onClick(View v)
			{
			Intent intent = new Intent(MainActivity.this,EditText.class);
			startActivity(intent);	
			}
		});
        
        Button button6 = (Button) findViewById(R.id.Button6);
        button6.setOnClickListener(new View.OnClickListener() 
        {
			
			@Override
			public void onClick(View v)
			{
			Intent intent = new Intent(MainActivity.this,SpinnerActivity.class);
			startActivity(intent);	
			}
		});
        
        Button button7 = (Button) findViewById(R.id.Button7);
        button7.setOnClickListener(new View.OnClickListener() 
        {
			
			@Override
			public void onClick(View v)
			{
			Intent intent = new Intent(MainActivity.this,TextView.class);
			startActivity(intent);	
			}
		});
        
        Button button8 = (Button) findViewById(R.id.Button8);
        button8.setOnClickListener(new View.OnClickListener() 
        {
			
			@Override
			public void onClick(View v)
			{
			Intent intent = new Intent(MainActivity.this,ProgressBar.class);
			startActivity(intent);	
			}
		});
        
        Button button9 = (Button) findViewById(R.id.Button9);
        button9.setOnClickListener(new View.OnClickListener() 
        {
			
			@Override
			public void onClick(View v)
			{
			Intent intent = new Intent(MainActivity.this,ImageButton1.class);
			startActivity(intent);	
			}
		});
        
        Button button11 = (Button) findViewById(R.id.registro);
        button11.setOnClickListener(new View.OnClickListener() 
        {
			
			@Override
			public void onClick(View v)
			{
			Intent intent = new Intent(MainActivity.this,Registrar.class);
			startActivity(intent);	
			}
		});
        
        

    }
}
