Para instalar Java en Ubuntu 20.04 necesitamos ejecutar los siguientes comandos:

//actualizamos el repositorio
apt update

//instalamos java
sudo apt install default-jre

//instalamos JDK también
sudo apt install default-jdk

//Creamos archivo java
nano HolaMundo.java

//y le metemos:
public class HolaMundo
{
    public static void main (String [ ] args)
    {
        System.out.println ("Hola mundo");
     }
}

//Ejecutamos con Java "Nombre del archivo" .java y compilamos con:
Javac HolaMundo.java