import java.io.IOException;

/**
 * @author Perry Bunn
 * @version 4/12/2017
 */

public class BakeryPart2 {
   /**
    * @param args command line arguments
    * @throws IOException throws an exeption if the file is not found
    */
   public static void main(String[] args) throws IOException {
      if (args.length == 0 || args[0] == null) {
         System.out.println("File name expected as command line argument.");
         System.out.println("Program ending.");
      } else {
         String fileName = args[0];
         BakedItemList a = new BakedItemList();
         a.readItemFile(fileName);
         System.out.println(a.generateReport());
         System.out.println(a.generateReportByClass());
         System.out.println(a.generateReportByPrice());
         System.out.println(a.generateReportByFlavor());
         System.out.println(a.generateExcludedRecordsReport());
      }
   }
}
