package eingv.uabc.com.myso;

import android.content.Intent;
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
    private void comparar() {
        String recupera = getIntent().getStringExtra("tipo");
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if (recupera.equals("ubuntu")) {

            String des = "ubuntu es una de las distribuciones más utilizadas gracias a su gran facilidad de uso. Basada en Debian, es amada y odiada por partes iguales por su exclusivo entorno de escritorio Unity, con el que persigue convertirse en una distribución versátil que pueda utilizarse tanto en ordenadores como móviles y tabletas.";

            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.ubuntu);

            fechaInicio.setText("20 de octubre de 2004");
            fechaFinal.setText("En desarrollo");


        } else if (recupera.equals("debian")) {
            String des = "es un sistema operativo libre, desarrollado por más de mil voluntarios alrededor del mundo, que colaboran a través de Internet.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.debian);

        } else if (recupera.equals("fedora")) {
            String des = "es una distribución Linux para propósitos generales basada en RPM, que se caracteriza por ser un sistema estable, la cual es mantenida gracias a una comunidad internacional de ingenieros, diseñadores gráficos y usuarios que informan de fallos y prueban nuevas tecnologías. Cuenta con el respaldo y la promoción de Red Hat.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.fedora);



        } else if (recupera.equals("centos")) {
            String des = "es una bifurcación a nivel binario de la distribución Linux Red Hat Enterprise Linux RHEL, compilado por voluntarios a partir del código fuente publicado por Red Hat.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.centos);


        } else if (recupera.equals("linuxMint")) {
            String des = "es una distribución del sistema operativo GNU/Linux, basada en la distribución Ubuntu (que a su vez está basada en Debian). A partir del 7 de septiembre de 2010 también está disponible una edición basada en Debian.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.linuxmind);


        } else if (recupera.equals("edubuntu")) {
            String des = "Edubuntu ha sido desarrollado en colaboración con docentes y tecnólogos de múltiples países. Edubuntu se construyó sobre Ubuntu e incorpora una arquitectura de cliente de LTSP, así como de usos educativos específicos, con un objetivo a la población entre los 6 y los 18 años. Hasta la versión 8.10, contaba con el servicio ShipIt para encargar CD de manera gratuita.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.edubuntu);


        } else if (recupera.equals("kaliLinux")) {
            String des = "es una distribución basada en Debian GNU/Linux diseñada principalmente para la auditoría y seguridad informática en general. Fue fundada y es mantenida por Offensive Security Ltd. Mati Aharoni and Devon Kearns, ambos pertenecientes al equipo de Offensive Security, desarrollaron la distribución a partir de la reescritura de BackTrack,que se podría denominar como la antecesora de Kali Linux.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.kalilinux);


        } else if (recupera.equals("tails")) {
            String des = "tails es una de las distribuciones más utilizadas gracias a su gran facilidad de uso. Basada en Debian, es amada y odiada por partes iguales por su exclusivo entorno de escritorio Unity, con el que persigue convertirse en una distribución versátil que pueda utilizarse tanto en ordenadores como móviles y tabletas.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.tails);
        } else if (recupera.equals("backtrack")) {
            String des = "BackTrack es una distribución GNU/Linux en formato LiveCD pensada y diseñada para la auditoría de seguridad y relacionada con la seguridad informática en general. Actualmente tiene una gran popularidad y aceptación en la comunidad que se mueve en torno a la seguridad informática.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.backtrack);
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////windows

        else
        if (recupera.equals("xp")) {
            String des = "Windows XP (cuyo nombre clave inicial fue Whistler) es una versión de Microsoft Windows, línea de sistemas operativos desarrollado por Microsoft. Lanzado al mercado el 25 de octubre de 2001, en diciembre de 2013, tenía una cuota de mercado de 500 millones de ordenadores. Las letras \"XP\" provienen de la palabra eXPeriencia (eXPerience en inglés).";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.xp);
          fechaInicio.setText("25 de octubre de 2001");
           fechaFinal.setText("08 de abril 2014");
        }
        else
        if (recupera.equals("win7")) {
            String des = "Fue concebido como una actualizacion incremental y focalizada de Vista y su nucleo NT lo que permitio" +
                    "mantener cirto grado de compatibilidad con aplicaciones y hardware en los que este ya era compatible.";
           textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.w7);
            fechaInicio.setText(" 22 de octubre de 2009");
            fechaFinal.setText("Extendido hasta 14 enero 2020");

        }
        else
        if (recupera.equals("win8")) {
            String des = "Con una interfaz de usuario basada alrededor de Microsoft lenguaje de diseño Metro con optimizaciones para táctiles dispositivos tales como tabletas y PCs todo-en-uno.";
             textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.win8);
            fechaInicio.setText("26 de octubre de 2012");
            fechaFinal.setText("Hasta el 10 de enero de 2023");

        }else
        if (recupera.equals("winV")) {
            String des = "Su aparicion viene mas de 5 años despues de la introduccion de windows xp, es el tiempo mas largo entre dos versiones consecutivas de Microsoft Windows.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.wvista);
            fechaInicio.setText("30 de enero de 2007");
            fechaFinal.setText("Expedido hasta 11 abril 2017");
        }
        else
        if (recupera.equals("win98")) {
            String des = "Sistema monolitico hibrido de 16 bits y 32 bits, su primera edicion fue designada por numeros de version internos 4.10.1998 o 4.10.1998A.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.w98);
            fechaInicio.setText("25 de junio de 1998");
            fechaFinal.setText("11 de julio de 2006");
        }
        else
        if (recupera.equals("win2000")) {
            String des="Para empresas y para ejecutar servidores de red o los servidores de archivo.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.w2000);
            fechaInicio.setText("17 de febrero de 2000");
            fechaFinal.setText("13 de julio de 2010");
        }else
        if (recupera.equals("win95")) {
            String des = "Sustituyo a MS-DOS como sistema operativo. Se encuadra dentro de la familia de sitemas de Microsoft denominado Windows 9x.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.w95);
            fechaInicio.setText("24 de agosto de 1995");
            fechaFinal.setText("31 de diciembre de 2001");
        }
        else
        if (recupera.equals("winMe")) {
            String des = "Es un sitema operativo grafico hibrido de 16 bits y 32 bits, diseñado por Microsoft Corporation para el mercado mayoritario de PCs.";
           textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.wme);
            fechaInicio.setText("14 de septiembre de 2000");
            fechaFinal.setText("11 julio de 2006");
        }





////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////osx
        else
        if (recupera.equals("hera")) {
            String des = "versión preliminar del Mac OS X (internamente conocida como Kodiak) para recibir observaciones y comentarios por parte de los usuarios. Su precio era de USD 29.95 e incluía una camiseta. Esta versión incluía por primera vez la interfaz Aqua.";
            textoDescripcion.setText(des);
         imagen.setImageResource(R.drawable.apple);
            fechaInicio.setText("13 de septiembre del 2000");
            fechaFinal.setText("En la primavera de 2001");

        }
        else
        if (recupera.equals("cheetah")) {
            String des = "Apple liberó el Mac OS X v10.0 (de nombre en código Cheetah). La versión inicial era lenta, estaba incompleta y tenía muy pocas aplicaciones disponibles al momento de su lanzamiento, casi todas de desarrolladores independientes. Mientras que muchos críticos dijeron que el sistema operativo no estaba listo para el público, reconocieron la importancia del lanzamiento inicial como una base sobre la cual se puede progresar. La mera liberación del Mac OS X fue recibido por la comunidad Macintosh como un gran acontecimiento. Después de corregir algunos errores de software, los kernel panics se hicieron menos frecuentes.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.apple);
            fechaInicio.setText("24 de marzo de 2001");
            fechaFinal.setText("22 de junio de 2001");

        } else
        if (recupera.equals("puma")) {
            String des = "Dada la pésima reputación de la versión 10.0, Apple lanzó la 10.1 en forma de un CD de actualización gratuito para sus usuarios, además de los 129$ que costaba para los usuarios que seguían utilizando Mac OS 9. Esto ocasionó algunos quebraderos de cabeza a Apple cuando descubrió que los CD de actualización podían ser utilizados también para hacer instalaciones completas en sistemas con Mac OS 9 con tan sólo eliminar un determinado archivo.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.apple);
            fechaInicio.setText("25 de septiembre de 2001");
            fechaFinal.setText("6 de junio de 2002");

        }else
        if (recupera.equals("jaguar")) {
            String des = "Apple presentó el Mac OS X v10.2 Jaguar, la primera versión en usar su nombre en código como parte de la marca.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.apple);
            fechaInicio.setText("23 de agosto de 2002");
            fechaFinal.setText("3 de octubre de 2003");
        }else
        if (recupera.equals("panther")) {
            String des = "Las nuevas mejoras de Panther incluyen: Finder actualizado (que incorpora una interfaz metálica y búsqueda rápida), Exposé (una nueva forma de manipular ventanas), cambio rápido de usuarios (permite tener sesiones con diferentes usuarios abiertas al mismo tiempo y pasar de una a otra rápidamente), iChat AV (que añade soporte para videoconferencia a iChat), renderización mejorada de PDF, soporte integrado de fax, interoperabilidad mejorada con Microsoft Windows, FileVault (sistema de cifrado en tiempo real) e incremento de velocidad en todo el sistema con un mayor soporte para los G5.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.apple);
            fechaInicio.setText("24 de octubre de 2003");
            fechaFinal.setText("15 de abril de 2005");
        }else
        if (recupera.equals("tiger")) {
            String des = "Contiene más de 150 nuevas mejoras, pero al igual que con el lanzamiento de Panther, algunas máquinas antiguas dejaron de ser soportadas; en particular, cualquier equipo Apple que no cuente con conexión FireWire no está ya soportado en Tiger. Como curiosidad cabe comentar que Apple dispone a partir de Tiger, de una versión paralela compilada para procesadores Intel, si bien, teóricamente, sólo podrá instalarse bajo ciertas restricciones de hardware y en procesadores con soporte SSE3.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.apple);
            fechaInicio.setText("29 de abril de 2005");
            fechaFinal.setText("14 de noviembre de 2007");
        }else
        if (recupera.equals("leopard")) {
            String des = "Fue llamado por Apple como «la mayor actualización del Mac OS X». Trajo consigo más de 300 nuevas funciones. Leopard soporta tanto procesadores PowerPC como Intel; el soporte para procesadores G3 fue abandonado y el procesador G4 requiere una velocidad mínima de 867 MHz, y 512 MB de RAM para permitir la instalación. El DVD de instalación funciona con todas las arquitecturas soportadas (incluyendo maquinas de 64 bits). Las nuevas funciones incluyen una nueva apariencia, un Finder actualizado, Time Machine (software para realizar copias de seguridad), Spaces, Boot Camp preinstalado, soporte completo para aplicaciones de 64 bits, nuevas funciones en Mail e iChat, y nuevas características de seguridad. Leopard es un sistema UNIX certificado para la plataforma Intel. Es además el primer sistema operativo basado en BSD en recibir la certificación UNIX 03. Leopard abandonó el soporte para el Entorno Classic y las aplicaciones del mismo. Fue la última versión del Mac OS X con soporte para la arquitectura PowerPC.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.apple);
            fechaInicio.setText("26 de octubre de 2007");
            fechaFinal.setText("5 de agosto de 2009");
        }else
        if (recupera.equals("sl")) {
            String des = " En lugar de incluir grandes cambios en la apariencia y funcionalidades como ocurrió en las versiones anteriores de Mac OS X, Snow Leopard se enfocó en cambios internos, como lo son: incrementar el rendimiento, la eficiencia y la estabilidad del sistema operativo. Para la mayoría de usuarios, los cambios más notables son: la cantidad de espacio que ocupa una instalación limpia, un Finder reescrito en Cocoa, copias de seguridad más rápidas en Time Machine, a una versión más completa de la aplicación Vista Previa, al igual que mayor velocidad en el navegador de internet Safari." +
                    "Finder ahora toma las ventajas de la tecnología integrada de 64 bits al igual que de Grand Central Dispatch, permite expulsar los discos de una forma más amigable (diversas cajas de diálogos le notifican al usuario si algún servicio o programa está utilizando tal disco), y provee en general de una sensación de mejor respuesta.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.apple);
            fechaInicio.setText("28 de agosto de 2009");
            fechaFinal.setText("23 de junio de 2011");
        }else
        if (recupera.equals("lion")) {
            String des = "El 20 de octubre de 2010, en el evento llamado Back to the Mac («Vuelta al Mac»), Apple mostró un Sneak Peek del próximo sistema operativo Mac OS X 10.7 con nombre código «Lion». Dentro de las primeras características se encuentran Launchpad que es un gestor de aplicaciones estilo iOS; y Mission Control que se podría decir es la integración de Dashboard, Exposé, Spaces y ventanas de Aplicaciones a pantalla completa. El 24 de febrero del 2011 fue entregada una beta de Mac os 10.7 'Lion' a los desarrolladores, develando nuevas características como Airdrop, Resume, Auto Save, Versions y Mail 5. El 6 de junio del 2011 en la Keynote de la WWDC se anunció que OS X 10.7 será puesto a la venta únicamente en descarga digital por la Mac App Store en Julio del 2011. A partir del 20 de julio Lion fue puesto a la venta en la Mac App Store por 23.95 euros, 29.99 dólares al cambio, y se desveló que estaría disponible para descarga desde la App Store y a partir del 20 de agosto estaría disponible para su venta en formato de pendrive.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.apple);
            fechaInicio.setText("20 de julio de 2011");
            fechaFinal.setText("19 septiembre 2012");
        }else
        if (recupera.equals("mlion")) {
            String des = "El 16 de febrero de 2012 Apple lanzó la Developer Preview de Mac OS X 10.8 Mountain Lion, una versión del sistema operativo en la que se incluyen muchas aplicaciones nativas de iOS, como Recordatorios, Notas o Mensajes. Incluye también un centro de notificaciones cercano al de iOS. Mac OS X Mountain Lion salió a la venta en España el 25 de julio de 2012. Con esta nueva versión, Apple pretende potenciar el uso de la nube, con el ya usado iCloud, gracias a la integración con la suite ofimática, iWork. Otra de las grandes novedades es Game Center, una plataforma de juego que pretende ser la primera en aunar los progresos y logros de las consolas portátiles con los sistemas de escritorio. También cuenta con Gatekeeper es una característica que evita la instalación de aplicaciones no confiables y así evitar malware.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.apple);
            fechaInicio.setText("25 de julio de 2012");
            fechaFinal.setText("12 de septiembre de 2013");
        }else
        if (recupera.equals("mave")) {
            String des = "El 22 de octubre de 2013 Apple lanzó la Actualización Mac OS X 10.9 Mavericks, una nueva versión que integra las aplicaciones de iOS como Recordatorios, Notas, Mensajes, iBook y notificaciones instantáneas pero con mucha más personalización. La nueva versión se puede actualizar sin ningún costo desde el mismo día de su presentación. Entre otras novedades anunciadas de OS X Mavericks está la opción de usar una HDTV como segundo monitor por medio de Apple TV y el aumento de la duración de la batería para los usuarios de MacBook Air de 11 y 13, con mayor ahorro de energía para iMac.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.apple);
            fechaInicio.setText("22 de octubre del 2013");
            fechaFinal.setText("31 de enero de 2014");
        }else
        if (recupera.equals("yose")) {
            String des = "El 2 de junio de 2014 Apple presentó en la WWDC 2014 Mac OS X 10.10 Yosemite, una nueva versión del sistema operativo que presenta un rediseño en su interfaz y mejoras en el Finder, Safari, Mail, Centro de Notificaciones, etc. La versión Beta se encontrará disponible únicamente para el primer millón de usuarios que se suscriban en el programa Beta de Apple."
                    +"Durante la Keynote del 16 de octubre de 2014, Apple anuncio el lanzamiento oficial de Mac OS X v10.10 (Yosemite)";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.apple);
            fechaInicio.setText("2 de junio de 2014");
            fechaFinal.setText("Versión final");
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////Android///////////////////////////////////////////////////////////////////////////////////////////////////////



        else
        if (recupera.equals("ap")) {
            String des = "Android 1.0 Apple Pie (Tarta de manzana), la primera versión comercial del software, fue lanzado el 23 septiembre de 2008. El primer dispositivo Android, el HTC Dream.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.andy);
            fechaInicio.setText("23 de septiembre de 2008");
            fechaFinal.setText("Versión final");
        }else
        if (recupera.equals("bb")) {
            String des = "La actualización Android 1.1 Banana Bread (Pan de plátano) fue lanzada, inicialmente solo para el HTC Dream así que solo sirve para este telefono. Android 1.1 fue conocido como Petit Four internamente, aunque este nombre no se utilizó oficialmente.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.andy);
            fechaInicio.setText("9 de febrero de 2009");
            fechaFinal.setText("Versión final");
        }else
        if (recupera.equals("cup")) {
            String des = "La actualización de Android 1.5 Cupcake fue lanzada, basada en núcleo Linux 2.6.27. La actualización incluye varias nuevas características y correcciones de interfaz de usuario";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.andy);
            fechaInicio.setText("30 de abril de 2009");
            fechaFinal.setText("Versión final");
        }else
        if (recupera.equals("don")) {
            String des = "\n" +
                    "Pantalla de inicio de Android 1.6."+
                    " fue lanzado el SDK de Android 1.6 Donut, basado en el núcleo Linux 2.6.29.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.andy);
            fechaInicio.setText("15 de septiembre de 2009");
            fechaFinal.setText("Versión final");
        }

        else
        if (recupera.equals("ec")) {
            String des = "El Motorola Droid, corriendo Android 2.0. El 26 de octubre de 2009, el SDK de Android 2.0 – con nombre en clave Eclair – fue lanzado, basado en el núcleo de linux 2.6.29.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.andy);
            fechaInicio.setText("26 de octubre de 2009");
            fechaFinal.setText("Versión final");
        }else
        if (recupera.equals("fr")) {
            String des = "El SDK de Android 2.2 Froyo (Yogur helado) fue lanzado, basado en el núcleo Linux 2.6.32.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.andy);
            fechaInicio.setText("20 de mayo de 2010");
            fechaFinal.setText("21 de noviembre de 2011");
        }else
        if (recupera.equals("gin")) {
            String des ="El SDK de Android 2.3 Gingerbread (Pan de Jengibre) fue lanzado, basado en el núcleo Linux 2.6.35.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.andy);
            fechaInicio.setText("6 de diciembre de 2010");
            fechaFinal.setText("21 de septiembre de 2011");
        }else
        if (recupera.equals("csa")) {
            String des = "Gabe Cohen de Google declaró que Android 4.0 era teóricamente compatible con cualquier dispositivo Android 2.3 en producción en ese momento, pero sólo si su procesador y memoria ram lo soportaban.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.andy);
            fechaInicio.setText("19 de octubre de 2011");
            fechaFinal.setText("08 de noviembre de 2012");
        }else
        if (recupera.equals("jb")) {
            String des = "Basado en el núcleo de linux 3.0.31, Bean fue una actualización incremental con el enfoque primario de mejorar la funcionalidad y el rendimiento de la interfaz de usuario. La mejora de rendimiento involucró el Proyecto Butter, el cual usa anticipación táctil, triple buffer, latencia vsync extendida y un arreglo en la velocidad de cuadros de 60 fps para crear una fluida y mantecosa suavidad de la interfaz de usuario. Android 4.1 Jelly Bean fue lanzado bajo AOSP el 9 de julio de 2012, y el Nexus 7, el primer dispositivo en correr Jelly Bean, fue lanzado el 13 de julio de 2012.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.andy);
            fechaInicio.setText("27 de junio de 2012");
            fechaFinal.setText("Versión final");
        }else
        if (recupera.equals("jb2")) {
            String des = "Google anunció la nueva versión con un comunicado de prensa, bajo el eslogan A new flavor of Jelly Bean. El primer dispositivo en correr Android 4.2 fue el Nexus 4 de LG y el Nexus 10 de Samsung, los cuales fueron lanzados el 13 de noviembre de 2012.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.andy);
            fechaInicio.setText("29 de octubre de 2012");
            fechaFinal.setText("Versión final");
        }else
        if (recupera.equals("jb3")) {
            String des = "Google lanzó Jelly Bean 4.3, bajo el lema \"Una forma aún más dulce Jelly Bean\" el 24 de julio de 2013, durante un evento en San Francisco llamado \"Desayuno con Sundar Pichai\".";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.andy);
            fechaInicio.setText("24 de julio de 2013");
            fechaFinal.setText("Versión final");
        }else
        if (recupera.equals("kit")) {
            String des = "Su nombre se debe a la chocolatina KitKat, de la empresa internacional Nestlé.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.andy);
            fechaInicio.setText("31 de octubre de 2013");
            fechaFinal.setText("19 de Junio de 2014");
        }else
        if (recupera.equals("loll")) {
            String des = "Un diseño intrépido, colorido, y sensible interfaz de usuario para las experiencias coherentes e intuitivos en todos los dispositivos. Movimiento de respuesta natural, iluminación y sombras realistas y familiares elementos visuales hacen que sea más fácil de navegar su dispositivo. Nuevos colores vivos, tipografía e imágenes de ayuda de borde a borde de enfocar su atención.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.andy);
            fechaInicio.setText("3 de noviembre de 2014");
            fechaFinal.setText("09 de marzo 2015");
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////ios///////////////////////////////////////////////////////////////////////////////////////////////////////

        else
        if (recupera.equals("ip1")) {
            String des = "Fue la primera versión de iPhone OS. Cuando apareció en el mercado, no tenía un nombre específico. Simplemente se decía que el iPhone corría OS X.6 Sólo fue compatible con la primera generación de iPhone y iPod Touch";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.osx);
            fechaInicio.setText("");
            fechaFinal.setText("");
        } else
        if (recupera.equals("ip2")) {
            String des = "El sistema operativo 2.0 vino pre instalado de fábrica en el iPhone 3G. Los dispositivos que corrían la versión 1.x podían actualizarse a esta versión. Esta fue la primera versión de iPhone OS que traía consigo la App Store y permitía descargar aplicaciones de terceros.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.osx);
            fechaInicio.setText("");
            fechaFinal.setText("");
        } else
        if (recupera.equals("ip3")) {
            String des = "iOS 3.0 se hizo disponible con el iPhone 3GS. Fue lanzado el 17 de junio de 2009. La actualización añadió muchos requisitos tales como la función copiar-pegar y MMS. No todos los contenidos estaban disponible en la versión original del iPhone. Los dispositivos que ejecutaban iOS 2.x podían actualizarse a este firmware. También, fue la primera versión adaptada para el iPad.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.osx);
            fechaInicio.setText("17 de junio de 2009");
            fechaFinal.setText("Versiona final");
        } else
        if (recupera.equals("ip4")) {
            String des = "El iOS 4 quedó disponible al público para el iPhone y el iPod touch el 21 de junio de 2010 (en EEUU). El iPhone 3G, junto con el iPod Touch (2.ª generación) tienen funciones limitadas. Esta es la primera versión del iOS que deja de dar soporte a los dispositivos más antiguos, en este caso la primera generación de iPhone y iPod Touch. También es la primera versión que deja de cobrar al iPod Touch para actualizarse.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.osx);
            fechaInicio.setText("21 de junio de 2010");
            fechaFinal.setText("Version Final");
        } else
        if (recupera.equals("ip5")) {
            String des = "iOS 5  también es la segunda versión iOS que no permite actualizarse en los dispositivos antiguos, en este caso: el iPhone 3G y el iPod touch 2G. Fue lanzado para iPhone 3GS, iPhone 4, iPhone 4s, iPod touch 3G, iPod touch 4G, iPad, iPad 2 y iPad 3 el 12 de octubre de 2011.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.osx);
            fechaInicio.setText("6 de junio de 2011");
            fechaFinal.setText("Version Final");
        } else
        if (recupera.equals("ip6")) {
            String des = "Es la tercera versión de iOS que no permite actualizarse en dispositivos antiguos, ahora en el iPad (1.ª generación) y iPod Touch (3.ª generación). Fue lanzada para el iPhone 3GS, iPhone 4, iPhone 4s, iPhone 5, iPod Touch (4.ª y 5.ª generación), iPad (2.ª, 3.ª y 4.ª generación) y ipad mini el 19 de septiembre de 2012";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.osx);
            fechaInicio.setText("12 de junio de 2012");
            fechaFinal.setText("Version Final");
        } else
        if (recupera.equals("ip7")) {
            String des = "iOS 7 fue presentado al público el 10 de junio de 2013. Es la cuarta versión de iOS que no permite actualizarse en dispositivos antiguos, ahora en el iPhone 3GS y iPod Touch (4.ª generación). Fue lanzada para el iPhone 4, iPhone 4s, iPhone 5, iPhone 5c, iPhone 5s, iPod Touch (5.ª generación), iPad (2.ª, 3.ª, 4.ª y 5.ª generación), iPad Mini y iPad Mini con Pantalla Retina el 17 de septiembre de 2013.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.osx);
            fechaInicio.setText("10 de junio de 2013");
            fechaFinal.setText("29 de junio de 2014");
        } else
        if (recupera.equals("ip8")) {
            String des = "OS 8 fue presentado al público el 2 de junio de 2014 durante la WWDC anual. Es la quinta versión de iOS que no permite actualizarse en dispositivos antiguos, ahora en el iPhone 4. Será lanzada para el iPhone 4s, iPhone 5, iPhone 5c, iPhone 5s, iPhone 6, iPhone 6 Plus, iPod Touch (5.ª generación), iPad (2.ª, 3.ª, 4.ª, 5.ª y 6.ª generación), iPad mini (1.ª, 2.ª y 3.ª generación).";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.osx);
            fechaInicio.setText("3 de noviembre de 2014");
            fechaFinal.setText("Version Final");
        }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////windows phone/////////////////////////////////////////////////////////////////////////////////////////////////

        else
        if (recupera.equals("wp1")) {
            String des = "Primera versión de Windows Phone, Nombre en clave Photon. Versión inicial de Windows Phone, con bastantes carencias.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.wp);
            fechaInicio.setText("enero del 2013");
            fechaFinal.setText("Avtivo");
        }else
        if (recupera.equals("wp2")) {
            String des = "Nueva versión de WP presentada a finales de 2012 y disponible únicamente para nuevos dispositivos debido a un cambio de kernel (de Windows CE a Windows NT).";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.wp);
            fechaInicio.setText("enero de 2014");
            fechaFinal.setText("Activo");
        }else
        if (recupera.equals("wp3")) {
            String des = "Aplicaciones que vienen en el paquete de instalación, como: Salud y ejercicios, Comida y bebida, Viajes y Mapas (esta última compite con Here Maps, la cual es la aplicación de mapas de Nokia)." +
                         "Mejoras en la pantalla de inicio: posibilidad de agregar fondos de pantalla y una tercera columna de Tiles.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.wp);
            fechaInicio.setText("verano de 2014");
            fechaFinal.setText("Activo");
        }else
        if (recupera.equals("wp4")) {
            String des = "Se espera que esta versión unifique todas las plataformas como PC, Tablets, Smartphones, Xbox One y dispositivos IoT (Internet de las cosas)";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.wp);
            fechaInicio.setText("12 de febrero de 2015");
            fechaFinal.setText("Activo");
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////Blackberry//////////////////////////////////////////////////////////////////////////////////////////////////
        else
        if (recupera.equals("blackb1")) {
            String des = "BlackBerry 4.6 es un sistema desarrollado por Research In Motion, las novedades las apĺicaciones se organizaron en carpetas en el menú de aplicaciones, interfaz nuevo, Multimedia se ha rediseñado completamente.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.andy);
          //  fechaInicio.setText("3 de noviembre de 2014");
            //fechaFinal.setText("Version Final");
        }else
        if (recupera.equals("blackb2")) {
            String des = "desarrollado por Research In Motion la cual fue presentado en el WES 2010 junto con un video promocional donde se muestra algunas novedades. RIM apuesta que su BlackBerry 6 estará enfocado en el mercado corporativo y no-corporativo. La mejor experiencia de este sistema se encontrara en los equipos touchscreen (Pantalla Táctil), aunque RIM aseguro que en los equipos que cuenten con un TouchPad o TrackPad podrán ejecutarlo ya que ejerce casi la misma función. Así mismo todavía RIM no ha aclarado cuales son los equipos que se podrán actualizar a esta versión aunque hay muchos rumores al respecto.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.andy);
            fechaInicio.setText("2010");
            fechaFinal.setText("Version Final");
        }else
        if (recupera.equals("blackb3")) {
            String des = "es la última versión estable hasta el momento, esta nueva versión es muy parecida a la versión 7.0, pero con una renovación de los iconos y de la resolución de la pantalla del teléfono inteligente, también tiene la función de trabajar como un Router inálambrico para distribuir redes Wi-Fi por el entorno de el teléfono inteligente, también tiene características que hacen más fácil el uso del teléfono inteligente. También incluye una versión completa del software de edición de documentos Documents To Go, puede usarse sin la necesidad de comprar alguna clave como en los sistemas pasados, que era requerida para realizar la edición de archivos.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.andy);
            //  fechaInicio.setText("3 de noviembre de 2014");
            //fechaFinal.setText("Version Final");
        }else
        if (recupera.equals("blackb4")) {
            String des = "OS 8 fue presentado al público el 2 de junio de 2014 durante la WWDC anual. Es la quinta versión de iOS que no permite actualizarse en dispositivos antiguos, ahora en el iPhone 4. Será lanzada para el iPhone 4s, iPhone 5, iPhone 5c, iPhone 5s, iPhone 6, iPhone 6 Plus, iPod Touch (5.ª generación), iPad (2.ª, 3.ª, 4.ª, 5.ª y 6.ª generación), iPad mini (1.ª, 2.ª y 3.ª generación).";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.andy);
            //  fechaInicio.setText("3 de noviembre de 2014");
            //fechaFinal.setText("Version Final");
        }
        ///////////////////////////////////////////////////////////////////////////////////////////////777
        //////////////////////////////////////////////////////////////////////////////////////////////////
        else
        if (recupera.equals("sym1")) {
            String des = "A EPOC32 se le conoció como EPOC simplemente, a partir de la versión 6 la denominación de EPOC cambió a Symbian (como se muestra más adelante). A pesar de la similitud de los nombres, EPOC32 y EPOC16 eran sistemas operativos totalmente diferentes, EPOC32 está escrito en C++.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.sym);
            fechaInicio.setText("1997");
            fechaFinal.setText("Version Final");
        }

        else
        if (recupera.equals("sym2")) {
            String des = "Primera versión de Symbian destinada a teléfonos móviles, añadió soporte para Bluetooth.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.sym);
            fechaInicio.setText("2001");
            fechaFinal.setText("Version Final");
        }
        else
        if (recupera.equals("sym3")) {
            String des = "Soporte para nuevos teléfonos con pantalla a todo color y nuevas aplicaciones que no son binariamentes compatibles con Symbian S60 2nd Edition.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.sym);
           fechaInicio.setText("2006");
            fechaFinal.setText("Version Final");
        }
        else
        if (recupera.equals("sym4")) {
            String des = "Se ha optimizado el software para ganar rendimiento como parte de la introducción a nuevos efectos y transiciones. La opciones de personalización también presentan novedades, se podrá crear una secuencia de fondos de pantalla que cambiará automáticamente o asociar cada llamada con una imagen que aparecerá a pantalla completa para facilitar la identificación de la llamada. Otro de los aspectos mejorados es la usabilidad, como el acceso a las aplicaciones que se están ejecutando al mismo tiempo en el dispositivo.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.sym);
            fechaInicio.setText("2008");
           fechaFinal.setText("Version Final");
        }
        else
        if (recupera.equals("sym5")) {
            String des = "Nueva versión de Symbian que incluye soporte para teléfonos completamente táctiles, fue una adaptación de Symbian S60 3rd que dio bastantes problemas de estabilidad y fueron necesarias varias actualizaciones que en algunos casos nunca solucionaron los problemas, como es el caso del Nokia 5800 XpressMusic que llegó a recibir más de 8 actualizaciones con el fin de mejorar su estabilidad.";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.sym);
            fechaInicio.setText("2008");
            fechaFinal.setText("Version Final");
        }
        else
        if (recupera.equals("sym6")) {
            String des = "Nokia Belle, Feature Pack 2, al igual que Nokia Belle, Feature Pack 1 es una actualización que solo está disponible para los últimos terminales Symbian de Nokia (Nokia 808 PureView, Nokia 603, Nokia 700, Nokia 701). ";
            textoDescripcion.setText(des);
            imagen.setImageResource(R.drawable.sym);
            fechaInicio.setText("11 de octubre de 2012");
            fechaFinal.setText("12 de junio de 2013");
        }
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
        if (id == R.id.regresar2) {
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
