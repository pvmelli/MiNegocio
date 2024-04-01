# MiNegocio
Aplicación de consola en Java para registrar una lista de empleados de forma fácil y rápida en un archivo txt! :memo: :dash: 

### Detalles técnicos
* Con el fin conservar los datos del negocio y los empleados tras completada la primera ejecución de la aplicación, se han serializado los datos de los Objetos Java. Estos mismos se deserializan al bootear.
* Los datos son guardados en un archivo txt para volverlos de fácil acceso
* Se detecta si es la primera ejecución de la aplicación por medio de la búsqueda del archivo txt generado

## REQUISITOS
Para usar MisEmpleados, es necesario tener instalados en el equipo:
1. JDK
2. IDE de preferencia

## CORRER LA APLICACIÓN
### Descargar o clonar el repositorio
 
 Será necesario, para comenzar, descargar o clonar el repositorio en el que se encuentra en este momento. Para ello, deberá clickear el botón verde "Clone or download".

 ![Descargar un repositorio](https://i.imgur.com/cBeY4Zp.png "Descargar un repositorio")

 Si prefiere descargarlo, simplemente deberá clickear en la opcion "Download ZIP". Y luego extrar el archivo en la dirección de su preferencia.
 
 ___

 Si, por otro lado, prefiere clonarlo, puede hacer uso de software como [Github Desktop](https://desktop.github.com "Github Desktop"). En este caso, copie el URL presentado al clikear el boton verde. Luego abra Github Desktop y diríjase a la opción "File" de la barra superior, elija la opción "Clone Repository" en el menú. Este proceso puede llevarse a cabo con Ctrl+Shift+O.

 ![Clonar un repositorio en Github Desktop](https://i.imgur.com/KWss1Ga.png "Clonar un repositorio en Github Desktop")
 
 Se le presentará una ventana en la que deberá clickear la opción "URL". Allí podrá pegar el URL del repositorio y decidir una dirección en la que clonarlo.

 ![Clonar un repositorio en Github Desktop](https://i.imgur.com/Y3k4xmk.png "Clonar un repositorio en Github Desktop")

### Abrir el repositorio en la IDE
Esto puede realizarse de dos maneras:
1) Moviendo la carpeta del repositorio dentro del Workspace de la IDE
2) Con el menú propio de la IDE, haciendo clic en File > Open Project

### Ejecutar la aplicación
Para finalmente correr la aplicación, se debe hallar el archivo Main y hacer clic en el ícono de Run o en el menú correspondiente a este.

Al correr la aplicación por primera vez, debería aparecer en su consola el siguiente mensaje:
 ```
************************************************************
¡BIENVENIDO A MINEGOCIO!
Esta aplicación de consola le permitirá generar y administrar una lista de los empleados que trabajan en su negocio, almacenada en un archivo TXT.
************************************************************
Usted no ha registrado un negocio aún. Por favor, responda las siguientes preguntas. Cuando desee enviar su respuesta, presione Enter.
¿Cuál es el nombre de su negocio?
 ```

Por favor, responda las preguntas dentro de la consola, y continúe con las instrucciones.



