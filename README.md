
**DOCUMENTACIÓN PASSWORD GENERATOR**

En esta documentación se mostrará cómo acceder a nuestro generador de contraseñas y de cómo usarlo.

**1. Buscar en Github el usuario marc-reylan-edib.**

En el primer paso se debe de iniciar sesión a su cuenta de Github y buscar el usuario marc-reylan-edib y buscar entre sus repositorios el repositorio llamado PasswordGenerator y pulsar el botón verde que pone “<> Code” y copie su HTTPS.

**2. Clonar repositorio en Git Bash.**

Tras copiar el HTTPS del repositorio PasswordGenerator, debe de ir a su escritorio y con click derecho entrar en el apartado de Git Bash. Si en caso de no tener Git Bash, puede descargarlo a través de la página oficial de Git .

Después de entrar en Git Bash use el comando “git clone (url del HTTPS copiado)” para clonar el repositorio, quedará de esta forma:

**3. Entrar en Visual Studio Code.**

Cuando ya tengamos nuestro repositorio clonado debemos entrar a Visual Studio Code. Si no tiene aún la aplicación debe descargarla a través de su página oficial de Visual, elegir su sistema operativo y descargar la versión más reciente que es la 1.97. 

El paso siguiente sería arrastrar nuestro repositorio clonado al Visual Studio Code. 

Después de arrastrar el repositorio clonado, les aparecerá a la izquierda en el Explorer el nombre del repositorio y eso significa que está dentro de Visual. Y al  hacer click podemos ver varias carpetas.

**4. Descargar Extensión Java.** 

Nosotros nos enfocaremos más en la carpeta src ya que es la carpeta donde está nuestro código. Ahora bien, para que nuestro código pueda ejecutarse en Visual y este pueda detectar que el código está hecho en Java, debemos de instalarnos una Extensión. 

En este caso descargamos una Extensión que nos permitirá ejecutar y leer automáticamente nuestro código en Java. Para eso, debemos de ir a la izquierda e ir en Extensiones y buscar la siguiente Extensión: Extension Pack for Java.   

**5. Ejecutar Programa.**

Ya instalada la Extensión debemos ir nuevamente a la carpeta src y dentro habrá un archivo llamado Main.java que sería nuestro programa con todo su código. Ahora bien, a la derecha debemos de pulsar el botón de Run Java para que se ejecute nuestro programa.

Tras ejecutarlo nuestro generador de contraseñas debería de funcionar correctamente.


**CÓMO USAR EL GENERADOR DE CONTRASEÑAS**

A continuación se explicara paso a paso cómo usar el generador de contraseñas.

**CÓMO CREAR UNA CONTRASEÑA.**

Primero de todo se debe de ejecutar el programa a través del botón de Run Java. Tras apretar el botón os abrirá la terminal de Visual con una sola pregunta “ Enter how many characters you want for your password:  “. En la que deberéis de introducir el número de caracteres que queréis para su contraseña. Tras estos pasos se creará correctamente una contraseña.

Y si quiere volver a crear una contraseña deberá de ejecutar nuevamente el programa. 

Sin embargo, hay que tener en cuenta que hay ciertos valores que no son válidos, en las cuales son:

Si el valor es 0.
Si el valor es negativo.
Si el valor no es numérica sino letras.
Si el valor son espacios vacíos.

Tras introducir dichos valores les saldrá un error y deberán de ejecutar nuevamente el programa para crear una contraseña.




