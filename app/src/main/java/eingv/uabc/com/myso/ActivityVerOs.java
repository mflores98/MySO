package eingv.uabc.com.myso;

import android.content.Intent;
import android.graphics.Bitmap;
import android.opengl.GLES30;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


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

        String seleccionSO=null;

        seleccionSO=spinnerVersion.getSelectedItem().toString();

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
            os();
        }else
        if (seleccionSO.equals("Windows 98")){
            os();
        }else
        if (seleccionSO.equals("Windows 95")){
            os();
        }else
        if (seleccionSO.equals("Windows 2000")){
            os();
        }else
        if (seleccionSO.equals("Windows Me")){
            os();
        }else
        if (seleccionSO.equals("MacOsClasic")){
            os();
        }else
        if (seleccionSO.equals("MacOSX")){
            os();
        }else
        if (seleccionSO.equals("")){
            os();
        }else
        if (seleccionSO.equals("")){
            os();
        }

    }

    private void win8() {
    }

    private void win7() {
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





    private void xp(){
        Toast toast = Toast.makeText(getApplicationContext(), "xp de windows", Toast.LENGTH_SHORT);
        toast.show();

    }

    private void os(){
        Toast toast3 = Toast.makeText(getApplicationContext(), "os d mac", Toast.LENGTH_SHORT);
        toast3.show();

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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
