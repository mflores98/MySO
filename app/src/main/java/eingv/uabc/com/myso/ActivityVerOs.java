package eingv.uabc.com.myso;

import android.content.Intent;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;



public class ActivityVerOs extends ActionBarActivity implements View.OnClickListener{

    private Spinner spinnerVersion;
    private String []recuperarlinux;
private TextView descripcionMostrar;
    private String recuperarDescripcion;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_os);

        spinnerVersion= (Spinner) findViewById(R.id.spinnerVersiones);
        descripcionMostrar= (TextView) findViewById(R.id.idMostrarSO);
        button= (Button) findViewById(R.id.detallesID);
        button.setOnClickListener(this);

        recuperarDescripcion=getIntent().getStringExtra("descripcion");
        recuperarlinux=getIntent().getStringArrayExtra("listaVersiones");
        descripcionMostrar.setText(recuperarDescripcion);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item, recuperarlinux);
        spinnerVersion.setAdapter(adapter);

    }



    @Override
    public void onClick(View view) {

        String seleccionSO;

        seleccionSO=spinnerVersion.getSelectedItem().toString();
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        if (seleccionSO.equals("Ubuntu")){
            ubuntu();
        }else
         if (seleccionSO.equals("Debian")) {
            debian();
         }else
         if (seleccionSO.equals("Fedora")){
             ///
             fedora();
         }else
         if (seleccionSO.equals("CentOS")){
            ///
             centOS();
        }else
         if (seleccionSO.equals("LinuxMint")){
             linuxMint();
            ///
        }else
        if (seleccionSO.equals("Edubuntu")){
            ///
            edubuntu();
        }else
        if (seleccionSO.equals("KaliLinux")){
            ///
            kaliLinux();
        }else
        if (seleccionSO.equals("Tails")){
            ///
            tails();
        }else

        if (seleccionSO.equals("BackTrack")){
            backtrack();
        }else



////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////






        if (seleccionSO.equals("Windows xp")){
            xp();
        }else
        if (seleccionSO.equals("Windows 7")){
            win7();
        }else
        if (seleccionSO.equals("Windows 8")){
            win8();
        }else
        if (seleccionSO.equals("Windows Vista")){
            winV();
        }else
        if (seleccionSO.equals("Windows 98")){
            win98();
        }else
        if (seleccionSO.equals("Windows 95")){
            win95();
        }else
        if (seleccionSO.equals("Windows 2000")){
            win2000();
        }else
        if (seleccionSO.equals("Windows Me")){
            winMe();
        }else

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

      if (seleccionSO.equals("OS X Server 1.0 Hera")){
          hera();
        }else
        if (seleccionSO.equals("Mac OS X v10.0")){
            cheetah();
        }else
        if (seleccionSO.equals("Mac OS X v10.1")){
            puma();
        }else
        if (seleccionSO.equals("Mac OS X v10.2")){
            jaguar();
        }else
        if (seleccionSO.equals("Mac OS X v10.3")){
            panther();
        }else
        if (seleccionSO.equals("Mac OS X v10.4")){
            tiger();
        }
        else
        if (seleccionSO.equals("Mac OS X v10.5")){
            leopard();
        }else
        if (seleccionSO.equals("Mac OS X v10.6")){
            sl();
        }else
        if (seleccionSO.equals("Mac OS X v10.7")){
            lion();
        }else
        if (seleccionSO.equals("Mac OS X v10.8")){
            mlion();
        }
        else
        if (seleccionSO.equals("OS X Mavericks")){
            mave();
        }
        else
            if (seleccionSO.equals("OS X Yosemite")){
                yosemite();
            }

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////android//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            else
            if (seleccionSO.equals("1.0 Apple Pie")){
                ap();
            } else
            if (seleccionSO.equals("1.1 Banana Bread")){
                bb();
            } else
            if (seleccionSO.equals("1.5 Cupcake")){
                cup();
            }else
            if (seleccionSO.equals("1.6 Donut")){
                don();
            }else
            if (seleccionSO.equals("2.0 Eclair")){
                ec();
            }else
            if (seleccionSO.equals("2.0.1 Eclair")){
                ec2();
            }else
            if (seleccionSO.equals("2.2 Froyo")){
                fr();
            }else
            if (seleccionSO.equals("2.3 Gingerbread")){
                gin();
            }
            else
            if (seleccionSO.equals("4.0 Ice Cream Sandwich")){
                csa();
            }else
            if (seleccionSO.equals("4.1 Jelly Bean")){
                jb();
            }else
            if (seleccionSO.equals("4.2 Jelly Bean")){
                jb2();
            }else
            if (seleccionSO.equals("4.3 Jelly Bean")) {
                jb3();

            }else
            if (seleccionSO.equals("4.4 Kitkat")) {
                kit();
            }else
            if (seleccionSO.equals("5.0 Lollipop")){
                    loll();
        }
            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////iOS/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


            else
            if (seleccionSO.equals("iPhone OS 1.0")){
                ip1();
            } else
            if (seleccionSO.equals("iPhone OS 2.0")){
                ip2();
            }else
            if (seleccionSO.equals("iPhone OS 3.0")){
                ip3();
            } else
            if (seleccionSO.equals("iOS 4")){
                ip4();
            }else
            if (seleccionSO.equals("iOS 5")){
                ip5();
            }else
            if (seleccionSO.equals("iOS 6")){
                ip6();
            }else
            if (seleccionSO.equals("iOS 7")){
                ip7();
            }else
            if (seleccionSO.equals("iOS 8")){
                ip8();
            }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////windowsPhone//////////////////////////////////////////////////////////////////////////////////////////////////////
            else
            if (seleccionSO.equals("Windows Phone 7.x")){
                wp1();
            }
            else
            if (seleccionSO.equals("Windows Phone 8.0.x")){
                wp2();
            }else
            if (seleccionSO.equals("Windows Phone 8.1.x")){
                wp3();
            }else
            if (seleccionSO.equals("Windows 10")){
                wp4();

            }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////blackberry//////////////////////////////////////////////////////////////////////////////////////////////////
            else
            if (seleccionSO.equals("BlackBerry 4.6")){
                blackb1();
            }else
            if (seleccionSO.equals("BlackBerry 6")){
                blackb2();
            }else
            if (seleccionSO.equals("BlackBerry 7.1")){
                blackb3();
            }else
            if (seleccionSO.equals("BlackBerry 10")){
                blackb4();
            }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////sysmbian///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            else
            if (seleccionSO.equals("EPOC32")){
                Sym1();
            }else
            if (seleccionSO.equals("Symbian OS")){
                Sym2();
            }else
            if (seleccionSO.equals("Symbian OS 9.1")){
                Sym3();
            }else
            if (seleccionSO.equals("Symbian OS 9.3")){
                Sym4();
            }else
            if (seleccionSO.equals("Symbian OS 9.4")){
                Sym5();
            }else
            if (seleccionSO.equals("Symbian OS 10")){
                Sym6();
            }



////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        
        
    }

    private void winMe() {
        String tipo="winMe";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);

    }

    private void win95() {
        String tipo="win95";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }
    private void win2000() {
        String tipo="win2000";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }
    private void win98() {
        String tipo="win98";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }

    private void winV() {
        String tipo="winV";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }


    private void win8() {

        String tipo="win8";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }

    private void win7() {
        String tipo="win7";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);

    }
    private void xp(){

        String tipo="xp";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }


    private void  ubuntu(){

        String tipo="ubuntu";


        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }

    private void debian(){
        String tipo="debian";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }


    private void fedora(){
        String tipo="fedora";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }
    private void centOS(){
        String tipo="centos";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);

    }
    private void linuxMint(){
        String tipo="linuxMint";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);

    }
    private void edubuntu(){
        String tipo="edubuntu";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }
    private void kaliLinux(){
        String tipo="kaliLinux";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);

    }
    private void tails(){
        String tipo="tails";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);

    }
    private void backtrack(){
        String tipo="backtrack";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }






    private void hera(){
        String tipo="hera";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }
    private void cheetah(){
        String tipo="cheetah";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }
    private void puma(){
        String tipo="puma";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }
    private void jaguar(){
        String tipo="jaguar";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }private void panther(){
        String tipo="panther";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }private void tiger(){
        String tipo="tiger";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }private void leopard(){
        String tipo="leopard";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }private void sl(){
        String tipo="sl";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }private void lion(){
        String tipo="lion";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }private void mlion(){
        String tipo="mlion";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }private void mave(){
        String tipo="mave";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }private void yosemite(){
        String tipo="yose";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }private void ap(){
        String tipo="ap";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }private void bb(){
        String tipo="bb";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }private void cup(){
        String tipo="cup";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }private void don(){
        String tipo="don";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }private void ec(){
        String tipo="ec";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }private void ec2(){
        String tipo="ec2";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }private void fr(){
        String tipo="fr";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }private void gin(){
        String tipo="gin";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }private void csa(){
        String tipo="csa";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }private void jb(){
        String tipo="jb";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }private void jb2(){
        String tipo="jb2";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }private void jb3(){
        String tipo="jb3";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }private void kit(){
        String tipo="kit";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }private void loll(){
        String tipo="loll";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////iOS/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private void ip1(){
        String tipo="ip1";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }private void ip2(){
        String tipo="ip2";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }private void ip3(){
        String tipo="ip3";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }private void ip4() {
        String tipo = "ip4";
        Intent intent = new Intent(this, Activity3Detalles.class);
        intent.putExtra("tipo", tipo);
        startActivity(intent);

    }
    private void ip5(){
        String tipo="ip5";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }private void ip6(){
        String tipo="ip6";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }private void ip7(){
        String tipo="ip7";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }private void ip8(){
        String tipo="ip8";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////windowsPhone/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private void wp1(){
        String tipo="wp1";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }private void wp2(){
        String tipo="wp2";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }private void wp3(){
        String tipo="wp3";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }private void wp4(){
        String tipo="wp4";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////blacberry/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private void blackb1(){
        String tipo="blackb1";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }private void blackb2(){
        String tipo="blackb1";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }private void blackb3(){
        String tipo="blackb3";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }private void blackb4(){
        String tipo="blackb4";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////Symbian/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private void Sym1(){
    String tipo="sym1";
    Intent intent=new Intent(this,Activity3Detalles.class);
    intent.putExtra("tipo",tipo);
    startActivity(intent);
    }private void Sym2(){
        String tipo="sym2";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }private void Sym3(){
        String tipo="sym3";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }private void Sym4(){
        String tipo="sym4";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }private void Sym5(){
        String tipo="sym5";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }private void Sym6(){
        String tipo="sym6";
        Intent intent=new Intent(this,Activity3Detalles.class);
        intent.putExtra("tipo",tipo);
        startActivity(intent);
    }







    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity_os, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.regresar1) {
           Intent intent=new Intent(this,MainActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

}
