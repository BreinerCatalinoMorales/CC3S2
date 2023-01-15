# Actividad 18
  ### Instalacion de Docker
   - Docker Info
   ![instalacion](https://user-images.githubusercontent.com/114892939/212563348-3bc8e27c-6755-4598-82fd-c7a30417d84a.png)
   
   - Hello-World
   ![run hello world](https://user-images.githubusercontent.com/114892939/212563361-e3410d71-364f-43b4-82dd-44d0785fe793.png)

  ### Imagenes y Contenedores
   -  Definicion:
   
      Una imagen de Docker es una instantánea de un sistema operativo o una aplicación en un momento específico. Es un archivo inmutable que contiene todo lo necesario para ejecutar una aplicación: código fuente, bibliotecas, configuración, etc. Puede ser creada, compartida y descargada desde una plataforma de almacenamiento de imágenes como Docker Hub.
      
      Un contenedor de Docker es una instancia ejecutable de una imagen. Es una forma de aislar una aplicación y sus dependencias en un entorno seguro y aislado del sistema host. Cada contenedor tiene su propio sistema de archivos, su propia memoria y su propio espacio de direcciones. Pueden ser iniciados, detenidos y eliminados, y pueden tener acceso a recursos del host, como redes y dispositivos de almacenamiento.
      
   -  Dcoker Commit:
      Ejecutamos el contenedor desde ubuntu
    ![ubuntu](https://user-images.githubusercontent.com/114892939/212563416-b773b44f-9ce8-4853-9bc9-88c6fe94a91e.png)
    ![binbash](https://user-images.githubusercontent.com/114892939/212563426-1a77dadf-2b2b-48e6-b60d-5369e301c9eb.png)
    
      Mostramos los cambios
      ![1](https://user-images.githubusercontent.com/114892939/212563478-c14b2f20-0818-4dc8-8890-941812d21a21.png)
      ![2](https://user-images.githubusercontent.com/114892939/212563482-3f8440a4-e002-4a37-8a10-050049779ec1.png)
      ![3](https://user-images.githubusercontent.com/114892939/212563489-15c33a2b-3d02-4e8a-91be-55138f74e656.png)
      
      Commit al contenedor
      ![comit](https://user-images.githubusercontent.com/114892939/212563512-6ed45d12-f62d-443e-a841-50a9c2a39844.png)
      
      Listamos las imagenes
      ![lista](https://user-images.githubusercontent.com/114892939/212563550-29e747f8-091b-4fc6-8ea0-44a816854afd.png)
      
      Creamos el contenedor apartir de la imagen
      ![Screenshot from 2023-01-15 14-46-28](https://user-images.githubusercontent.com/114892939/212563612-b065bc11-8c53-435e-ae6a-3b487b0a07c2.png)
      
   - Dockerfile
     Crea un nuevo directorio y un archivo llamado Dockerfile con el siguiente contenido:
     ![Screenshot from 2023-01-15 14-49-10](https://user-images.githubusercontent.com/114892939/212563758-037bae83-f681-400f-8308-9b4c40b3175a.png)
      
     Ejecuta el siguiente comando para crear una imagen ubuntu_con_python: 3. Verifica que la imagen se haya creado ejecutando el siguiente comando:
     ![Screenshot from 2023-01-15 14-50-58](https://user-images.githubusercontent.com/114892939/212563796-7ab1f56b-b756-4f48-b0c6-94df7b72793f.png)
     
     Comprueba que la imagen se creó ejecutando el siguiente comando:
     ![Screenshot from 2023-01-15 14-52-47](https://user-images.githubusercontent.com/114892939/212563871-ba1d2ca3-8aae-44ac-bd61-ec5fd75370ae.png)
      
      


      
      





    


   
   
