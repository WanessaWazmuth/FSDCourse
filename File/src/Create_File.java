import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Create_File {
   public static void main( String[] args ) {
	   System.out.println("Check if the file exists and create file if doesn't");

      try {
         String data = "Implement OOPS using JAVA with Data Structure";
         File file = new File("/home/wanessawazmuthd/Documents/file.txt");
         if(!file.exists()) {
        	 file.createNewFile();
        	 System.out.println("File created!");
         }else {
        	 System.out.println("File exists!");
         }
         System.out.println("-------------------------------------------------------");
         System.out.println("read and write to file");
      
         FileWriter fileWriter = new FileWriter(file, false);
         PrintWriter printWriter = new PrintWriter(fileWriter);
         printWriter.println(data);
         printWriter.flush();
         printWriter.close();
           
         FileReader fileReader = new FileReader(file);
         BufferedReader bufferedReader = new BufferedReader(fileReader);
         String line = "";
         while ( ( line = bufferedReader.readLine() ) != null) {
        	 System.out.println(line);
         }
         fileReader.close();
         bufferedReader.close();
         
         System.out.println("-------------------------------------------------------");
         System.out.println("Append to file");
       
         FileWriter fr = new FileWriter(file, true);
         BufferedWriter br = new BufferedWriter(fr);
         PrintWriter pr = new PrintWriter(br);
         pr.println("Append!!!!");
         pr.close();
         br.close();
         fr.close();
       
         FileReader fileReaderAppend = new FileReader(file);
         BufferedReader bufferedReaderAppend = new BufferedReader(fileReaderAppend);
         String lineAppend = "";
         while ( ( lineAppend = bufferedReaderAppend.readLine() ) != null) {
        	 System.out.println(lineAppend);
         }
         fileReaderAppend.close();
         bufferedReaderAppend.close();
       
         System.out.println("Done");
      } catch(IOException e){
         e.printStackTrace();
      }
      
   }
}