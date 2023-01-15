# Pregunta1
  Hay varias formas en que los clientes pueden descubrir y acceder a los microservicios y sus instancias, como:
   - Registro de servicios: un registro de servicios es una ubicación centralizada donde se registran todos los microservicios y sus instancias
   - API Gateway: una API Gateway actúa como un proxy inverso, enrutando las solicitudes de los clientes a las instancias de microservicio adecuadas. También puede     manejar tareas como la autenticación, la limitación de velocidad y el almacenamiento en caché.
   - DNS: el DNS se puede utilizar para asignar nombres de dominio a instancias de servicio, lo que permite a los clientes acceder a los servicios utilizando un nombre descriptivo en lugar de una dirección IP.
   -  Load Balancer: un load balancer distribuye las solicitudes entrantes entre varias instancias de un servicio para garantizar una alta disponibilidad y escalabilidad. Los clientes pueden acceder a un servicio a través de la dirección IP o el nombre de dominio del load balancer.
   
   Vale la pena mencionar que estas diferentes técnicas se pueden usar juntas según los requisitos específicos de la aplicación y la infraestructura.
   
# Pregunta2
   En un entorno de sistema de microservicios, es común exponer algunos microservicios a clientes externos mientras se mantienen otros microservicios solo internos. Para proteger los microservicios expuestos de solicitudes de clientes maliciosos, se pueden utilizar varias técnicas:
   - Autenticación y autorización: la implementación de mecanismos de autenticación y autorización puede garantizar que solo los clientes autorizados puedan acceder a los microservicios expuestos.
   - API Gateway: una API Gateway puede actuar como una capa de protección para los microservicios expuestos. Puede manejar tareas como la limitación de velocidad, el almacenamiento en caché y la validación de solicitudes para garantizar que solo las solicitudes válidas pasen a los microservicios.
   - Network security: la implementación de medidas de seguridad de la red, como firewalls y redes privadas virtuales (VPN), puede ayudar a proteger los microservicios de amenazas externas al controlar el acceso a la red interna.
   - Web Application Firewall (WAF): un WAF puede proteger sus microservicios al monitorear y bloquear el tráfico HTTP/HTTPS malicioso.
  
# Pregunta3
   Hay varias formas de mejorar el problema de agotamiento de subprocesos causado por la comunicación síncrona mediante el bloqueo de E/S en una arquitectura de microservicios:
   
  - Comunicación asíncrona: en lugar de usar E/S de bloqueo, puede usar la comunicación asíncrona para manejar las solicitudes. Esto permite que el subproceso se libere de nuevo en el grupo tan pronto como se envíe la solicitud, y la respuesta puede ser manejada por un subproceso separado cuando llegue. Un ejemplo de esto es usar la API de servlet asíncrono en Java para manejar solicitudes HTTP.
 - E/S sin bloqueo: en lugar de usar E/S de bloqueo, puede usar E/S sin bloqueo, lo que permite que el subproceso maneje varias solicitudes al mismo tiempo. Un ejemplo de esto es usar el paquete NIO en Java para manejar la comunicación de socket.
  - Agrupación de subprocesos: para reducir la cantidad de subprocesos necesarios, puede utilizar la agrupación de subprocesos para reutilizar subprocesos para varias solicitudes. Esto puede ayudar a reducir la cantidad total de subprocesos necesarios para manejar una gran cantidad de solicitudes simultáneas.
  - Arquitectura basada en eventos: la implementación de una arquitectura basada en eventos puede ayudar a reducir la cantidad de subprocesos necesarios para manejar una gran cantidad de solicitudes simultáneas al permitir que el sistema maneje varias solicitudes al mismo tiempo. Esto se puede lograr mediante el uso de un bucle de eventos para manejar todas las solicitudes entrantes, en lugar de asignar un subproceso para cada solicitud.
  - Programación reactiva: la programación reactiva puede ayudar a manejar escenarios de alta simultaneidad y alto rendimiento mediante el uso de E/S sin bloqueo y contrapresión, lo que permite manejar el flujo de datos y evitar sobrecargar el sistema.

   Es importante tener en cuenta que la optimización del rendimiento es un proceso continuo, y debe revisarse y actualizarse continuamente para adaptarse a los cambios en el tráfico y los patrones de uso.
   
# Pregunta4
  - ¿Cómo obtengo una imagen completa de la configuración que existe para todas las instancias de microservicio en ejecución?
  
    En una arquitectura de microservicios, se recomienda la implementación de un sistema de configuración centralizado, como por ejemplo, una base de datos o un servidor de configuración. Cada microservicio puede acceder a su configuración a través de una API o mediante un archivo en el sistema de configuración. De esta manera, se puede obtener una imagen completa de la configuración al acceder al sistema de configuración centralizado y verificar las configuraciones de cada microservicio. Además, esto permite una mayor flexibilidad y escalabilidad, ya que se pueden cambiar las configuraciones de forma dinámica y sin necesidad de reiniciar los servicios.
  - ¿Cómo actualizar la configuración y me aseguro de que todas las instancias de microservicio afectadas se actualicen correctamente?

    Existen varias formas de actualizar la configuración en una arquitectura de microservicios, dependiendo del sistema de configuración que se haya implementado. Algunas opciones son:
    
      - Utilizar un sistema de configuración dinámico: Algunos sistemas de configuración, como Spring Cloud Config, proporcionan un mecanismo de notificación para avisar a los servicios cuando se realizan cambios en su configuración. De esta manera, los servicios pueden detectar y recargar automáticamente la configuración actualizada.

      - Utilizar un sistema de configuración estático: Si se utiliza un sistema de configuración estático, como archivos de configuración en disco, se puede utilizar una herramienta de automatización, como Ansible o Puppet, para actualizar la configuración en todas las instancias del servicio.

      - Utilizar un sistema de orquestación: Si se utiliza un sistema de orquestación como Kubernetes, se puede utilizar la funcionalidad de actualización en caliente para actualizar la configuración en todas las instancias del servicio.

# Pregunta5
  - ¿Cómo se obtiene una descripción general de lo que sucede en el entorno del sistema cuando cada instancia de microservicio escribe en su propio archivo log local?
  
    Primero definamos los logs, los logs son registros de eventos generados por un sistema, aplicación o servicio. Estos registros pueden incluir información sobre transacciones, errores, advertencias, rendimiento, etc. Los logs son una herramienta valiosa para entender lo que sucede en un sistema, ya que proporcionan una visión detallada de las actividades que ocurren en un momento dado.

    Entonces, en una arquitectura de microservicios, donde se tiene una gran cantidad de instancias de servicios desplegadas en diferentes servidores, como se menciono en la pregunta anterior es recomendable tener un sistema de registro centralizado para recolectar, almacenar y analizar los registros de eventos de todas las instancias de los microservicios. Esto permite obtener una descripción general de lo que sucede en el entorno del sistema y ayuda a detectar problemas, aumentar la capacidad de depuración y tomar decisiones para mejorar el rendimiento del sistema.

  - ¿Cómo averiguo si alguna de las instancias de microservicio tiene problemas y comienza a escribir mensajes de error en sus archivos logs?
  
    Para detectar problemas en una instancia de microservicio que puedan estar causando mensajes de error en los archivos de registro, se pueden usar algunos metodos como: 

    - Análisis de registros: Utilizar herramientas de análisis de registros como Lasticsearch o Logstash, para buscar patrones de errores o anomalías en los registros de eventos. Esto puede ayudar a detectar problemas en una instancia de microservicio específica.

    - Monitoreo en tiempo real: Utilizar herramientas de monitoreo en tiempo real como Prometheus o Grafana, para detectar problemas en tiempo real. Estas herramientas pueden alertar automáticamente si se detectan patrones de errores o anomalías en los registros de eventos.

    - Pruebas automatizadas: Utilizar pruebas automatizadas para detectar problemas en las instancias de microservicios. Estas pruebas pueden ejecutarse de forma continua para detectar problemas de forma temprana, con herramientas como Selenium, Appium o JUnit.

  - Si los usuarios finales comienzan a informar problemas,¿cómo puedo encontrar mensajes logs relacionados? es decir,¿cómo puedo identificar qué instancia de microservicio es la causa raíz del problema?

    Para encontrar mensajes de registro relacionados con problemas informados por los usuarios finales, se puede utilizar un enfoque basado en el trace-id. El trace-id es un identificador único que se utiliza para rastrear una transacción o una solicitud a través de varias instancias de microservicios.

    - Se puede utilizar herramientas de análisis de registros para buscar patrones de errores o anomalías en los registros de eventos que contengan el trace-id específico relacionado con el problema informado por los usuarios finales. Esto puede ayudar a identificar qué instancia de microservicio está causando el problema.
    - Se puede utilizar herramientas de búsqueda de registros para buscar el trace-id específico relacionado con el problema informado por los usuarios finales. Esto puede ayudar a encontrar mensajes de registro específicos relacionados con el problema.
    - Se puede utilizar herramientas de monitoreo para detectar problemas en tiempo real, buscando el trace-id específico relacionado con el problema informado por los usuarios finales. Estas herramientas pueden alertar automáticamente si se detectan patrones de errores o anomalías en los registros de eventos.
    
    Al utilizar el trace-id, se puede rastrear una transacción o solicitud a través de varias instancias de microservicios, lo que permite identificar rápidamente la instancia de microservicio responsable del problema.
    
# Pregunta6
  - Si los usuarios finales comienzan a presentar casos de soporte con respecto a una falla específica,¿cómo podemos identificar el microservicio que causó el problema, es decir, la causa raíz?
 
    Los metodos que mencioné en la pregunta anterior para detectar problemas en las instancias de microservicios, como el análisis de registros, el monitoreo en tiempo real y las pruebas automatizadas, también se pueden utilizar para identificar el microservicio específico que causó un problema específico.
  Por ejemplo, al utilizar herramientas de análisis de registros puede buscar patrones de errores o anomalías en los registros de eventos relacionado con un trace-id específico, lo que permite identificar el microservicio específico que causó el problema. O con un sistema de monitoreo y alertas, puede detectar problemas en tiempo real y recibir alertas automáticamente cuando se detecta un problema en un microservicio específico.

  - Si un caso de soporte menciona problemas relacionados con una entidad específica, por ejemplo, un número de pedido específico,¿cómo podemos encontrar mensajes de registro relacionados con el procesamiento de este pedido específico, por ejemplo, mensajes logs de todos los microservicios que estuvieron involucrados en su procesamiento?
  
    Para encontrar mensajes de registro relacionados con el procesamiento de un número de pedido específico, se pueden utilizar un sistema de trazabilidad, utilizar un sistema de trazabilidad que asocie un identificador único, como el número de pedido, con todas las solicitudes y mensajes relacionados con ese pedido. Esto permite rastrear fácilmente las solicitudes y mensajes que fluyen entre los microservicios mientras se procesa ese pedido específico, y encontrar los mensajes de registro relacionados con el procesamiento de ese pedido específico.

  - Si los usuarios finales comienzan a presentar casos de soporte relacionados con un tiempo de respuesta inaceptablemente largo,¿cómo podemos identificar qué microservicio en una cadena de llamadas está causando la demora?
  
    Para identificar qué microservicio en una cadena de llamadas está causando un tiempo de respuesta inaceptablemente largo, se pueden utilizar algunos de los metodos mencionados anteriormente como:

    - Utilizar un sistema de trazabilidad: Utilizar un sistema de trazabilidad que permita rastrear las solicitudes y mensajes que fluyen entre los microservicios mientras se procesa una solicitud externa. Esto permite identificar fácilmente cuál de los microservicios está tomando más tiempo en procesar las solicitudes y causando un tiempo de respuesta inaceptablemente largo.
    - Utilizar una herramienta de monitoreo: Utilizar una herramienta de monitoreo que permita medir el rendimiento de cada microservicio en tiempo real. Esto permite identificar cuál de los microservicios está causando un cuello de botella y causando un tiempo de respuesta inaceptablemente largo.
    - Utilizar una herramienta de análisis de registros: Utilizar una herramienta de análisis de registros para buscar patrones de rendimiento y errores en los registros de los microservicios. Esto permite identificar cuál de los microservicios está causando problemas y causando un tiempo de respuesta inaceptablemente largo.

    En general, es importante tener un sistema de monitoreo y análisis de registros en marcha para poder detectar problemas en los microservicios y buscar fácilmente los mensajes

# Parte 2
  ## 1) Ejecuta CouchDB como un contenedor de Docker y publica su puerto
  - Importamos el docker CouchDB
  
  ![PullCouchDB](https://user-images.githubusercontent.com/114892939/212558244-774c96ab-a99a-41dd-8893-7d17bb7fc8c7.png)
  
  - Corremos la imagen
  
  ![run_couchDB](https://user-images.githubusercontent.com/114892939/212558243-4bb8ce35-1a27-4a8c-ba90-9ed2d47b9cae.png)
  
  - Mostramos el Puerto
  
  ![run_port_CouchDB](https://user-images.githubusercontent.com/114892939/212558242-1f9c9741-05ce-42b0-9051-3de899a050c1.png)
  
  ## 2)Crea una imagen de Docker con un servicio REST, respondiendo Hola Amigos CC-3S2 a localhost:8080/hola. Utiliza el lenguaje y el framework que prefieras:
  
  - Creamo la aplicacion de servicio web
  
  ![Creamos_la_aplicaion](https://user-images.githubusercontent.com/114892939/212558619-9db4953b-087f-49bc-bc64-7e9540d86fa2.png)
  
  - Creamos el Dockerfile
  
  ![Creamos_el_dockerfile](https://user-images.githubusercontent.com/114892939/212558628-e2965d89-db1d-4b13-833e-60855de4bc1d.png)

  - Construimos la imagen
  
  ![Construimos_la_Imagen](https://user-images.githubusercontent.com/114892939/212558650-83602c1a-bdc8-43d4-8578-8ae890dcbe15.png)
  ![parte2_imagen](https://user-images.githubusercontent.com/114892939/212558683-9212d2e0-a0ef-4344-886b-1cf4b5087188.png)



  - Ejecutamos el contenedor
  
  ![Puerto](https://user-images.githubusercontent.com/114892939/212558666-e443d425-da9a-4bc0-b62a-0cd36df9f02f.png)

  - Verficamos
  
  ![ejecucion_exitosa](https://user-images.githubusercontent.com/114892939/212558676-27284004-3a60-4ae2-84fb-04ba38a1574b.png)
  
  ## 3)Crea un master de Jenkins y imágenes de agentes Docker y úsalos para ejecutar una infraestructura de Jenkins capaz de crear proyectos de Ruby:
  
  - Crea el Dockerfile del master de Jenkins, que instala automáticamente el complemento de Docker.
  
  ![Dockerfile](https://user-images.githubusercontent.com/114892939/212559283-fc38ccf5-ac55-4733-8acc-e6847ec410e3.png)

  - Crea la imagen master y ejecuta la instancia de Jenkins.
  
  ![imagen_master_y_ejecucion](https://user-images.githubusercontent.com/114892939/212559300-70c92bd3-1153-4131-bf7d-6edec607289e.png)

  - Crea el Dockerfile del agente (adecuado para el aprovisionamiento dinámico del agente), que instala el intérprete de Ruby.
  
  ![dockerfile_agente](https://user-images.githubusercontent.com/114892939/212559309-1e3e6075-2205-4921-8016-aa54dd916990.png)

  - Crea la imagen del agente.
  
  ![imagen_del_agente](https://user-images.githubusercontent.com/114892939/212559324-47340104-40c8-411a-8ac7-c0281c040884.png)

  ## 4)Crea un pipeline que ejecuta un script de Ruby que imprima Hola Mundo desde Ruby:
  
  - Crea un nuevo pipeline
  
  ![pipeline](https://user-images.githubusercontent.com/114892939/212560271-c01665c7-8c22-4a31-8eed-20e4af0b11b4.png)

  - Utiliza el siguiente comando de shell para crear el script hola.rb sobre la marcha: sh "echo \"puts 'Hola Mundo en Ruby'\" > hola.rb"
  
  ![script1](https://user-images.githubusercontent.com/114892939/212560277-39f78cfc-70e4-496a-bc8f-d525233ecd33.png)

  - AgrEjecuta la construcción y observa la salida de la consola.egue el comando para ejecutar hola.rb , utilizando el intérprete de Ruby.
  
  ![script](https://user-images.githubusercontent.com/114892939/212560285-cadee147-4c41-424a-b1a2-d627abc03535.png)

  - Ejecuta la construcción y observa la salida de la consola.
  
  ![consola](https://user-images.githubusercontent.com/114892939/212560290-08c54bd6-4bde-4099-bf81-2c89e9a8fed4.png)


