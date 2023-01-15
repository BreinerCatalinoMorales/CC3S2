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
