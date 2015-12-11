
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
    private MailItem lastMail;

    /**
     * Constructor for objects of class MailClient
     */
    public MailClient(MailServer server, String user)
    {
        // inicializa las variables
        this.server = server;
        this.user = user;
    }

    /**
     * Método que recupera del servidor el siguiente correo
     * (un objeto MailItem) que tenga el usuario y devuelva dicho objeto.
     */
    public MailItem getNextMailItem()
    {
        return server.getNextMailItem(user);
    }
    
   
       
    
    
    /**
     * Método que recupere del servidor el siguiente correo (un objeto MailItem)
     * que tenga el usuario e imprima por pantalla los datos de dicho mensaje.
     * Si no hay ningun mensaje, que muestre un mensaje por pantalla informando de ello.
     */
   
    public void printNextMailItem()
    {
        MailItem email = getNextMailItem();
        if (email.getMessage().contains("regalo")||email.getMessage().contains("promocion"))        
        {
            //Imprimimos los detalles del email
		    System.out.println("Tienes un spam");
        }
        
        else if (email.getMessage().contains("trabajo"))
        {
            //Avisamos de que no hay emails en el servidor
			System.out.println("Hay correo nuevo");
        }
  
    }
    
    
    
    /**
     * Método que reciba 2 parámetros (un String indicando para quién es el mensaje
     * y otro String indicando el contenido del mensaje), cree un email (objeto MailItem)
     * basándose en la información de dichos parámetros 
     * y lo envíe al servidor asociado a ese cliente.
     */
    public void sendMailItem(String to, String message)
    {
        MailItem email = new MailItem(to, message);
		server.post(email);
    }
    
    /**
     * Método que muestra cuantos emails hay
     */
    
    public void numeroEmails ()
    
    {
        System.out.print("Hay " +  server.howManyMailItems(user) + " emails");
    }
    
    /**
     * Método recibe un correo y responde indicando que estamos fuera
     */
    public void getNextMailItemAndSendAutomaticRespond()
    {
        MailItem email = getNextMailItem();
        if (email != null)
        {
            sendMailItem(email.getFrom(),
            "No estoy en la oficina. " + email.getMessage(),
            "RE: " + email.getSubject());
        }
    }
    
    /**
     * Muestra por pantalla los datos del ultimo email.
     * En caso de no haber ninguno nos informa de ello
     */
    public void muestraUltimoEmail()
    {
        if (lastMail !=null) 
        {
        lastMail.print();
        }
        else
        {
        System.out.println("No hay ningun mensaje.");
        }
    }
}

