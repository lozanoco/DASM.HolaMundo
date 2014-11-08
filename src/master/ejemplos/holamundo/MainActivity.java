package master.ejemplos.holamundo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    //Forma desacoplada
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button botonUno = (Button) findViewById(R.id.button1);
        botonUno.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				Toast.makeText(MainActivity.this,"Has pulsado 1",Toast.LENGTH_SHORT).show();
				
			}
		});
    }
    
    public void pulsaDos(View vista){
    	Toast.makeText(this,"Has pulsado 2",Toast.LENGTH_SHORT).show();
    }
    public void pulsaTres(View vista){
    	Toast.makeText(this,"Has pulsado 3",Toast.LENGTH_SHORT).show();
    }
    // Forma de hacerlo para todos los botones
    public void pulsaBoton(View v){
    	Button boton = (Button)v;
    	String textoBoton = boton.getText().toString();
    	String mensaje = getString(R.string.mensaje, textoBoton);
    	Toast.makeText(MainActivity.this,mensaje,Toast.LENGTH_SHORT).show();
    }
}
