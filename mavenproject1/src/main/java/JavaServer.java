import org.apache.xmlrpc.*;

public class JavaServer { 

   public Integer sum(int x, int y){
      return (x+y);
   }

   public static void main (String [] args){
   
      try {

         System.out.println("Запуск XML-RPC Server...");
         
         WebServer server = new WebServer(80);
         server.addHandler("sample", new JavaServer());
         server.start();
         
         System.out.println("Запущен успешно.");
         System.out.println("Прием запросов....");
         
      } catch (Exception exception){
         System.err.println("JavaServer: " + exception);
      }
   }
}