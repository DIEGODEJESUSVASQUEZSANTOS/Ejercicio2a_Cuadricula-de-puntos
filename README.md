# Ejercicio2a_Cuadricula-de-puntos 
2. Generar las siguientes gráficas, cumpliendo la condición para su desarrollo. 
a. Cuadricula. Pantalla completa, cada cuadro deberá medir 30 unidades por lado, como se muestra en el ejemplo. Deberá realizar la cuadricula UTILIZANDO SOLAMENTE PUNTOS, NO LINEAS, NO POLIGONOS, NO FIGURAS. El color de fondo y color de los puntos es libre.

![image](https://user-images.githubusercontent.com/72058362/132414000-5291a949-f7df-4040-8be4-1b20ad3cbf30.png)

# LIBRERIAS
Como primer paso tenemos que importar las librerías necesarias a nuestro código para el uso de ellas en el programa.

![image](https://user-images.githubusercontent.com/72058362/132414086-45ce230f-3434-4f5d-8d92-8fdedf928afb.png)

# CREACIÓN DE LA CLASE
Creamos la clase Ejercicio2A_Puntos declarando al inicio tres variables estáticas y a la vez haciendo uso de la interfaz GLEventListener .

![image](https://user-images.githubusercontent.com/72058362/132414200-dea35945-0c14-4005-8aae-377068b64234.png)

# MÉTODO MAIN 
Damos inicio a la creación del método main o método principal en el cual ejecutamos un JFrame, ponemos las medidas características de nuestra pantalla, creamos un hilo para detener la animación y pedimos que cuando ejecutemos nuestro programa la venta se ejecute en su tamaño máximo. 

![image](https://user-images.githubusercontent.com/72058362/132414249-cb363a37-7e56-4daf-8e45-1089bc8a75ea.png)

# MÉTODO INIT
En esta parte del código podemos observar el método init, este método lo que haces es que inicializa un objeto y nosotros lo ocupamos para la creación de los gráficos de OpenGL.

![image](https://user-images.githubusercontent.com/72058362/132414308-5c6aaa9f-53f1-42e9-a4c5-55937a72394e.png)
  
# MÉTODO RESHAPE
Nombramos el método reshape pero se encuentra vacía ya que no es esencial para nuestro código.

![image](https://user-images.githubusercontent.com/72058362/132414437-7eef04d5-2178-4a95-8b9b-1687ca731cc4.png)

# MÉTODO DISPLAY 
Dentro de este método se crea la función básica para crear nuestros puntos y que vayan avanzando de modo que creen una cuadricula. Dentro de este método hacemos uso de dos ciclos repetitivos FOR, el primer ciclo lo que hace es crear los puntos de forma horizontal y el segundo ciclo los crea de forma vertical. A la vez dentro de este método establecemos el tamaño de los puntos y uso de un método displayChanged pero al no ser esencial para el funcionamiento se encuentra vacía. 

![image](https://user-images.githubusercontent.com/72058362/132414492-024fb7ad-b0dc-4020-9098-23f96351b265.png)

# RESULTADOS
![image](https://user-images.githubusercontent.com/72058362/132414575-9393779e-0031-497d-8753-7f95876cab77.png)

