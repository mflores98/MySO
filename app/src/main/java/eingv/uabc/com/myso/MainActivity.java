package eingv.uabc.com.myso;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.Toast;
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
        optionSpinner= new String[]{"Android", "iOS", "WindowsPhone","BlackBerry6","Sysmbian"};
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
            String r="Aplicacion realizada por Miguel Flores";
            Toast toast=Toast.makeText(getApplicationContext(),r,Toast.LENGTH_LONG);
            toast.show();
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
          iOS();

            }else
            if (seleccion.equals("WindowsPhone")){
                wphone();

            }
            if (seleccion.equals("BlackBerry6")){
blackbe();

            }
            else
            if (seleccion.equals("Sysmbian")){

sysmbian();
            }
            //else
           /// if (seleccion.equals("FirefoxO.")){


            //}else
            ///if (seleccion.equals("UbuntuTouch")){


            //}


        }
        if (id==R.id._Salir){

            System.exit(0);
        }
        return super.onOptionsItemSelected(item);
    }



    public void linux(){

        String []listaVersiones={"Ubuntu","Debian","Fedora","CentOS","LinuxMint","Edubuntu","KaliLinux","Tails","BackTrack"};
        String descripcion="Es un sistema operativo libre, basado en Unix. Es uno de los principales ejemplos de software libre y de código abierto. Linux está licenciado bajo la GPL v2 y está desarrollado por colaboradores de todo el mundo. " +
                "El desarrollo del día a día tiene lugar en la Linux Kernel Mailing List Archive.";

        Intent listVL=new Intent(this,ActivityVerOs.class);
        listVL.putExtra("listaVersiones",listaVersiones);
        listVL.putExtra("descripcion",descripcion);
        startActivity(listVL);


    }

    public void win(){

        String []listaVersiones={"Windows 98","Windows 95","Windows xp","Windows Vista","Windows 7","Windows 8","Windows 2000","Windows Me"};
        String descripcion="Window: es el nombre de una familia de distribuciones para PC, smartphone, servidores" +
                "y sistemas empotrados, desarrollados y vendidos por Microsoft, y disponibles para" +
                "multiples arquitecturas, tales como x86 y ARM";


        Intent listVW=new Intent(this,ActivityVerOs.class);
        listVW.putExtra("listaVersiones",listaVersiones);
        listVW.putExtra("descripcion",descripcion);


        startActivity(listVW);

    }
    public void  osx(){


        String []listaVersiones={"OS X Server 1.0 Hera","Mac OS X v10.0","Mac OS X v10.1","Mac OS X v10.2","Mac OS X v10.3","Mac OS X v10.4","Mac OS X v10.5","Mac OS X v10.6","Mac OS X v10.7","Mac OS X v10.8","OS X Mavericks","OS X Yosemite"};
        String descripcion=" Mac os del ingles Macintosh Operating System, es el nombre del sistema" +
                "operativo creado por Apple para su linea de computadoras Macintosh." ;

        Intent listVW=new Intent(this,ActivityVerOs.class);
        listVW.putExtra("listaVersiones",listaVersiones);
        listVW.putExtra("descripcion",descripcion);
        startActivity(listVW);
    }
    public void android(){
        String []listaVersiones={"1.0 Apple Pie","1.1 Banana Bread","1.5 Cupcake","1.6 Donut","2.0 Eclair","2.0.1 Eclair","2.2 Froyo","2.3 Gingerbread","4.0 Ice Cream Sandwich","4.1 Jelly Bean","4.2 Jelly Bean","4.3 Jelly Bean","4.4 Kitkat","5.0 Lollipop"};
        String descripcion="Android es un sistema operativo móvil desarrollado por Google y la Open Handset Alliance, y ha visto un número de actualizaciones a su sistema operativo base desde su lanzamiento original. Estas actualizaciones típicamente corrigen fallos de programa y agregan nuevas funcionalidades. Desde abril de 2009, las versiones de Android han sido desarrolladas bajo un nombre en clave y sus nombres siguen un orden alfabético" ;

        Intent listVW=new Intent(this,ActivityVerOs.class);
        listVW.putExtra("listaVersiones",listaVersiones);
        listVW.putExtra("descripcion",descripcion);
        startActivity(listVW);

    }
    public void iOS(){
        String []listaVersiones={"iPhone OS 1.0","iPhone OS 2.0","iPhone OS 3.0","iOS 4","iOS 5","iOS 6","iOS 7","iOS 8"};
        String descripcion="Este sistema operativo hecho por Apple Inc. corre también en el iPod touch y iPad." ;

        Intent listVW=new Intent(this,ActivityVerOs.class);
        listVW.putExtra("listaVersiones",listaVersiones);
        listVW.putExtra("descripcion",descripcion);
        startActivity(listVW);

    } public void wphone(){
        String []listaVersiones={"Windows Phone 7.x","Windows Phone 8.0.x","Windows Phone 8.1.x","Windows 10"};
        String descripcion="Es un sistema operativo móvil desarrollado por Microsoft, como sucesor de Windows Mobile. A diferencia de su predecesor está enfocado en el mercado de consumo en lugar de en el mercado empresarial. Con Windows Phone; Microsoft ofrece una nueva interfaz de usuario que integra varios de sus servicios propios como OneDrive, Skype y Xbox Live en el sistema operativo." ;

        Intent listVW=new Intent(this,ActivityVerOs.class);
        listVW.putExtra("listaVersiones",listaVersiones);
        listVW.putExtra("descripcion",descripcion);
        startActivity(listVW);

    }private void blackbe() {
        String []listaVersiones={"BlackBerry 4.6","BlackBerry 6","BlackBerry 7.1","Blackberry 10"};
        String descripcion="El BlackBerry OS es un sistema operativo móvil de código cerrado desarrollado por BlackBerry, antigua Research In Motion (RIM); para los dispositivos BlackBerry. El sistema permite multitarea y tiene soporte para diferentes métodos de entrada adoptados por RIM para su uso en computadoras de mano, particularmente la trackwheel, trackball, touchpad y pantallas táctiles. Su desarrollo se remonta la aparición de los primeros handheld en 1999. " ;

        Intent listVW=new Intent(this,ActivityVerOs.class);
        listVW.putExtra("listaVersiones",listaVersiones);
        listVW.putExtra("descripcion",descripcion);
        startActivity(listVW);

    }

    private void sysmbian() {
        String []listaVersiones={"EPOC32","Symbian OS","Symbian OS 9.1","Symbian OS 9.3","Symbian OS 9.4","Symbian OS 10"};
        String descripcion="Symbian es un sistema operativo propiedad de Nokia, y que en el pasado fue producto de la alianza de varias empresas de telefonía móvil, entre las que se encontraban Nokia, Sony Mobile Communications, Psion, Samsung, Siemens, Arima, Benq, Fujitsu, Lenovo, LG, Motorola, Mitsubishi Electric, Panasonic, Sharp, etc. Sus orígenes provenían de su antepasado EPOC32, utilizado en PDA's y Handhelds de PSION." ;

        Intent listVW=new Intent(this,ActivityVerOs.class);
        listVW.putExtra("listaVersiones",listaVersiones);
        listVW.putExtra("descripcion",descripcion);
        startActivity(listVW);

    }


}
