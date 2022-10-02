import java.util.*;
import org.apache.xmlrpc.*;

public class JavaClient {
   public static void main (String [] args) {
   
      try {
          String serverUrl = "http://localhost/";
         XmlRpcClient client =  new XmlRpcClient("http://localhost/"); 
         Vector params = new Vector();
         
         params.addElement(17);
         params.addElement(13);

         Object result = client.execute("sample.sum", params);

         int sum = ((Integer) result);
         System.out.println("The sum is: "+ sum);

      } catch (Exception exception) {
         System.err.println("JavaClient: " + exception);
      }
   }
}