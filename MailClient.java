
/**
 * Write a description of class MailClient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MailClient
{
    // Atributos
    private MailServer server;
    private String user;

    /**
     * Constructor for objects of class MailClient
     */
    public MailClient(MailServer servidor, String usuario)
    {
        // inicializa las variables
        server = servidor;
        user = usuario;
    }

    /**
     * Método que recupera del servidor el siguiente correo
     * (un objeto MailItem) que tenga el usuario y devuelva dicho objeto.
     */
    public MailItem getNextMailItem()
    {
    }
    
   
       
    
    
    /**
     * Método que recupere del servidor el siguiente correo (un objeto MailItem)
     * que tenga el usuario e imprima por pantalla los datos de dicho mensaje.
     * Si no hay ningun mensaje, que muestre un mensaje por pantalla informando de ello.
     */
   
    public void printNextMailItem()
    {
    }
  
    
    
    
    
    /**
     * Método que reciba 2 parámetros (un String indicando para quién es el mensaje
     * y otro String indicando el contenido del mensaje), cree un email (objeto MailItem)
     * basándose en la información de dichos parámetros 
     * y lo envíe al servidor asociado a ese cliente.
     */
    public void sendMailItem(String to, String message)
    {
    }
    
    
    
    
}
