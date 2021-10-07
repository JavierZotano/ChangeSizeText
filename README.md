#  Ejercicio ChangeSizeText

En este ejercicio se ha desarrollado una aplicación que pide al usuario que introduzca un texto y
seleccione un tamaño de fuente mediante un control deslizante, y a continuación se muestra el texto
introducido con el tamaño indicado.

Para este ejercicio se han creado dos clases: `User` y `Message`. La primera contiene los datos del
usuario (su nombre y su dirección de correo electrónico), mientras que la segunda contiene el texto,
el tamaño de fuente y al propio User.

La aplicación se encuentra dividida en 2 `Activity`: `ChangeSizeTextActivity` y
`ViewMessageActivity`. Al tratar de pasar un objeto serializable `Message` de la primera a la
segunda `Activity` a través de un `Bundle`,y contener este un `User`, hemos aprendido que `User`
también debe implementar la interfaz `Serializable` para que todo pueda funcionar sin problemas.
Además, se ha creado una clase `Application` personalizada, `ChangeSizeApplication`, por lo que
hemos aprendido que es necesario agregar el atributo `android:name` con el nombre de la clase
personalizada en la etiqueta `application` del `AndroidManifest` para que esta clase personalizada
tenga efecto. En este caso, la función de la clase era crear un `User` en el momento en el que se
lance la aplicación, es decir, en su `onCreate()`.

Imagen de la Activity inicial de la aplicación:

<img src="img/ChangeSizeTextActivity.png" width="400"/>
