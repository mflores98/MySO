package eingv.uabc.com.myso;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;


public class Activity3Detalles extends ActionBarActivity {
private ImageView imagen;
private TextView textoDescripcion;
private TextView fechaInicio,fechaFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity3_detalles);

        imagen= (ImageView) findViewById(R.id.imagenID);
        textoDescripcion= (TextView) findViewById(R.id.descId);


        fechaInicio= (TextView) findViewById(R.id.fechaInicioID);
        fechaFinal= (TextView) findViewById(R.id.fechaTerminoID);

        comparar();



    }
    private void comparar(){
        String recupera=getIntent().getStringExtra("tipo");
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if (recupera.equals("ubuntu")){

            String des="ubuntu es una de las distribuciones más utilizadas gracias a su gran facilidad de uso. Basada en Debian, es amada y odiada por partes iguales por su exclusivo entorno de escritorio Unity, con el que persigue convertirse en una distribución versátil que pueda utilizarse tanto en ordenadores como móviles y tabletas.";

            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.ubuntu);

            fechaInicio.setText("20 de octubre de 2004");
            fechaFinal.setText("tEn desarrollo");


        }else
        if (recupera.equals("debian")){
            String des="es un sistema operativo libre, desarrollado por más de mil voluntarios alrededor del mundo, que colaboran a través de Internet.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.debian);


        }else
        if (recupera.equals("fedora")){
            String des="es una distribución Linux para propósitos generales basada en RPM, que se caracteriza por ser un sistema estable, la cual es mantenida gracias a una comunidad internacional de ingenieros, diseñadores gráficos y usuarios que informan de fallos y prueban nuevas tecnologías. Cuenta con el respaldo y la promoción de Red Hat.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.fedora);

        }
        else
        if (recupera.equals("centos")){
            String des="es una bifurcación a nivel binario de la distribución Linux Red Hat Enterprise Linux RHEL, compilado por voluntarios a partir del código fuente publicado por Red Hat.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.centos);



        }else
        if (recupera.equals("linuxMint")){
            String des="es una distribución del sistema operativo GNU/Linux, basada en la distribución Ubuntu (que a su vez está basada en Debian). A partir del 7 de septiembre de 2010 también está disponible una edición basada en Debian.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.linuxmind);


        }
        else
        if (recupera.equals("edubuntu")){
            String des="Edubuntu ha sido desarrollado en colaboración con docentes y tecnólogos de múltiples países. Edubuntu se construyó sobre Ubuntu e incorpora una arquitectura de cliente de LTSP, así como de usos educativos específicos, con un objetivo a la población entre los 6 y los 18 años. Hasta la versión 8.10, contaba con el servicio ShipIt para encargar CD de manera gratuita.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.edubuntu);


        }else
        if (recupera.equals("kaliLinux")){
            String des="es una distribución basada en Debian GNU/Linux diseñada principalmente para la auditoría y seguridad informática en general. Fue fundada y es mantenida por Offensive Security Ltd. Mati Aharoni and Devon Kearns, ambos pertenecientes al equipo de Offensive Security, desarrollaron la distribución a partir de la reescritura de BackTrack,que se podría denominar como la antecesora de Kali Linux.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.kalilinux);


        }
        else
        if (recupera.equals("tails")){
            String des="tails es una de las distribuciones más utilizadas gracias a su gran facilidad de uso. Basada en Debian, es amada y odiada por partes iguales por su exclusivo entorno de escritorio Unity, con el que persigue convertirse en una distribución versátil que pueda utilizarse tanto en ordenadores como móviles y tabletas.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.tails);
        }
        else
        if (recupera.equals("backtrack")){
            String des="BackTrack es una distribución GNU/Linux en formato LiveCD pensada y diseñada para la auditoría de seguridad y relacionada con la seguridad informática en general. Actualmente tiene una gran popularidad y aceptación en la comunidad que se mueve en torno a la seguridad informática.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.backtrack);
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////






    }






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity3_detalles, menu);
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

        return super.onOptionsItemSelected(item);
    }
}
