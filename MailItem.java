
/**
 * Write a description of class MailItem here.
 * 
 * @author (Raul Perez) 
 * @version (25/11/2015)
 */
public class MailItem
{
    // instance variables - replace the example below with your own
    private String from;
    //
    private String to;
    //
    private String message;
    //
    private String subject;

    /**
     * Constructor for objects of class MailItem
     */
    public MailItem(String from, String to, String message, String subject)
    {
        // initialise instance variables
        this.from = from;
        this.to = to;
        this. message = message;
        this.subject = subject;
        
    }

    /**
     * Método getter para from
     */
    public String getFrom()
    {
        return from;
    }
    
    /**
     * Método getter para to
     */
    public String getTo()
    {
        return to;
    }
    
    /**
     * Método getter para message
     */
    public String getMessage()
    {
        return message;
    }
    
    /**
     * Método getter para subject
     */
    public String getsubject()
    {
        return subject;
    }
    
    /**
     * Método print sin parámetros
     * que muestra los atributos
     * del objeto
     */
    public void print()
    {
        System.out.println("desde " + from);
        System.out.println("hacia " + to);
        System.out.println("mensaje " + message);
        System.out.println("asunto " + subject);

    }
}
