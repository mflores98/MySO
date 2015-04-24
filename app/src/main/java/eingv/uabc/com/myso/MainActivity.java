package eingv.uabc.com.myso;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.ToggleButton;


public class MainActivity extends ActionBarActivity {
private Spinner spinner;
private String seleccion;
private ToggleButton toggleButton;
    private String []optionSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner= (Spinner) findViewById(R.id.spinnerListOS);
        toggleButton= (ToggleButton) findViewById(R.id.toggleMovil);

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

     if (isChecked){
         escritorioOS();
     }else{
        movilOS();
     }
            }
        });
    }

    public void escritorioOS(){
        optionSpinner= new String[]{"Linux", "Win", "OSx"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item, optionSpinner);
        spinner.setAdapter(adapter);
    }
    private void movilOS(){
        optionSpinner= new String[]{"Android", "iOS", "WindowsPhone","BlackBerry6","Sysmbian","FirefoxO.S","UbuntuTouch"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item, optionSpinner);
        spinner.setAdapter(adapter);
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;

        }
        if (id==R.id._verOS){

            seleccion=spinner.getSelectedItem().toString();

            if (seleccion.equals("Linux")){

                linux();
            }
            else
            if (seleccion.equals("Win")){
                win();

            }else
            if (seleccion.equals("OSx")){
                osx();

            }
            //////////////////////////////////////////////////////////////
            else

            if (seleccion.equals("Android")){
                android();
            }
            else
            if (seleccion.equals("iOS")){


            }else
            if (seleccion.equals("WindowsPhone")){

            }
            if (seleccion.equals("BlackBerry6")){


            }
            else
            if (seleccion.equals("Sysmbian")){


            }else
            if (seleccion.equals("FirefoxO.")){


            }else
            if (seleccion.equals("UbuntuTouch")){


            }







        }
        if (id==R.id._Salir){

            System.exit(0);
        }
        return super.onOptionsItemSelected(item);
    }




    public void linux(){

        String []listaVersiones={"Ubuntu","Debian","Fedora","CentOS","LinuxMint","Edubuntu","KaliLinux","Tails","BackTrack"};
        String descripcion="linux el pinguino.......................................................";

        Intent listVL=new Intent(this,ActivityVerOs.class);
        listVL.putExtra("listaVersiones",listaVersiones);
        listVL.putExtra("descripcion",descripcion);
        startActivity(listVL);


    }

    public void win(){

        String []listaVersiones={"Windows xp","Windows 7","Windows 8","Windows Vista","Windows 98","Windows 95","Windows 2000","Windows Me"};
        String descripcion="Window:" +
                "es el nombre de una familia de distribuciones para PC, smartphone, servidores" +
                "y sistemas empotrados, desarrollados y vendidos por Microsoft, y disponibles para" +
                "multiples arquitecturas, tales como x86 y ARM";


        Intent listVW=new Intent(this,ActivityVerOs.class);
        listVW.putExtra("listaVersiones",listaVersiones);
        listVW.putExtra("descripcion",descripcion);


        startActivity(listVW);

    }
    public void  osx(){


        String []listaVersiones={"MacOsClasic","MacOSX","","","","","",""};
        String descripcion=" Mac os del ingles Macintosh Operating System, es el nombre del sistema" +
                "operativo creado por Apple para su linea de computadoras Macintosh." ;

        Intent listVW=new Intent(this,ActivityVerOs.class);
        listVW.putExtra("listaVersiones",listaVersiones);
        listVW.putExtra("descripcion",descripcion);
        startActivity(listVW);
    }
   public void android(){
       String []listaVersiones={"1.5 Cupcake","1.6 Donut","2.0 Eclair","2.0.1 Eclair","2.1 Eclair","2.2 Froyo","2.3 Gingerbread","4.0 Ice Cream Sandwich","4.1 Jelly Bean","4.2 Jelly Bean","4.3 Jelly Bean","4.4 Kitkat","5.0 Lollipop"};
       String descripcion=" Mac os del ingles Macintosh Operating System, es el nombre del sistema" +
               "operativo creado por Apple para su linea de computadoras Macintosh." ;

       Intent listVW=new Intent(this,ActivityVerOs.class);
       listVW.putExtra("listaVersiones",listaVersiones);
       listVW.putExtra("descripcion",descripcion);
       startActivity(listVW);

   }


}
