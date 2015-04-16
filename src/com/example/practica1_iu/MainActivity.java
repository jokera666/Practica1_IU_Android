package com.example.practica1_iu;



import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/*MainActivity es el Layout principal es decir la primera pantalla
 * que aparece a la hora de arrancar la aplicacion que hereda de la clase
 * Activity*/
public class MainActivity extends Activity 
{
	static int idTema=R.style.AppBaseTheme;	//Tema por defecto
	
	/*savedInstanceState: Es un metodo que nos asegura que no se va romper nada
     * si el sistema operativo mata a nuestra aplicacion*/
	@Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        
		//Establecemos el tema
		this.setTheme(idTema);
        
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
	
    @Override
   public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; a�ade los elemnetos del menu
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
   public boolean onOptionsItemSelected(MenuItem item) {
    	// es un metodo boleano que cuando pulsamos a cualquier opcion
    	//del menu ejecuta lo que hay dentro del if
    	// item: es la opcion pulsada
        int id = item.getItemId();


        if (id == R.id.verano) {
        	item.setChecked(true);
			//idTema=R.style.temaVerano;
			
			//Finalizamos la actividad
			MainActivity.this.finish();	
			//Lanzamos la actividad con el tema nuevo
			startActivity(new Intent(MainActivity.this, MainActivity.this.getClass()));
			
        	Context contexto = getApplicationContext();
        	String mensaje = "Esto es verano";
        	int duracion = Toast.LENGTH_SHORT;
        	Toast toast = Toast.makeText(contexto, mensaje,duracion);
        	// para los toast se puede utilizar tambien:
        	//Toast toast = Toast.makeText(this, "esto es mi mensaje",Toast.LENGTH_SHORT);
        	toast.show();
            return true;
        }
        
        if (id == R.id.primavera) {
        	item.setChecked(true);
        	Context contexto = getApplicationContext();
        	String mensaje = "Esto es primavera";
        	int duracion = Toast.LENGTH_SHORT;
        	Toast toast = Toast.makeText(contexto, mensaje,duracion);
        	toast.show();
            return true;
        }
        
        if (id == R.id.otono) {
        	item.setChecked(true);
        	Context contexto = getApplicationContext();
        	String mensaje = "Esto es oto�o";
        	int duracion = Toast.LENGTH_SHORT;
        	Toast toast = Toast.makeText(contexto, mensaje,duracion);
        	toast.show();
            return true;
        }
        
        if (id == R.id.invierno) {
        	item.setChecked(true);
        	Context contexto = getApplicationContext();
        	String mensaje = "Esto es invierno";
        	int duracion = Toast.LENGTH_SHORT;
        	Toast toast = Toast.makeText(contexto, mensaje,duracion);
        	toast.show();
            return true;
        }
        
        if (id == R.id.defecto) {
        	item.setChecked(true);
        	Context contexto = getApplicationContext();
        	String mensaje = "Por defecto";
        	int duracion = Toast.LENGTH_SHORT;
        	Toast toast = Toast.makeText(contexto, mensaje,duracion);
        	toast.show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
