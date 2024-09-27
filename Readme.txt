Detalles importantes del Challenge Conversor de Monedas
*******************************************************
Fuente de API: ExchangeRate-API
API key: Your API Key: *********************
****************************
Aplicación desarrollada mediante el uso del aprendizaje en
ALuraLatam-OracleONE-G7 BackEnd-Dev en Formación. También se
utiliza Foros, Consultas en Google, A.I. y un afán por
aprender cada día más. Comencé el programa esquematizando
las labores que iba a realizar para obtener un resultado
satisfactorio.
En primera instancia sabía qué pasos iba a dar, tenía la idea
de los estudiado hasta ahora, pero no sabía si era lo adecuado
para mi caso. Al final se unieron muchas variables y determinaron
el éxito de la app.

En cada clase se imponía importar utilidad necesaria para poder utilizar sus métodos. No necesariamente desde el principio sabía qué librería iba a utilizar sino que se fue generando paso a paso.

Una opción necesaria es crear clase principal main y en ella colcoar el Menú de la app, qué opcion escoge el usuario y la opción de salida del programa. Luego se hace claro la necesidad de crear clases alternas para las funciones de consultar la API, convertir o calcular el cambio y para terminar la clase principal sustanciar la opción de salida definitivamente con un "Buenos días/Buenas tardes y para ellos cómo se iba a hacer para que la app reconociera qué era era. Google es definitivamente una opción clara para alcanzar la solución de los problemas de programación.

AL final de la clase no se puede olvidar cerrar los elementos que son necesario cerrar: El scanner es uno de ellos. Archivos abiertos es otro elemento que es importante cerrar al final.

La otra clase que he creado es la ApiConsulta encargada de todo lo relacionado con bajar el json, serializarlo para obtener la información que se necesita y para ello se antoja la creación de otra clase pequeña que fundamente las labores de creación y manejo de un Array del tipo: Clave, Valor o lo que es lo mismo: Moneda (PEN, COL, VEN, etc) y la tasa de cambio para cada una de ellas. 

Al final de este archivo dejo la ultima clase creadca que es: Conversor. Esta se encarga de los cálculos utilizando los elementos antes ubicados y formateados adecuadamente.







