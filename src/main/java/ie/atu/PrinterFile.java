package ie.atu;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
public class PrinterFile {
    public static void main(String[] args){

//specify file name

        String fileName = "FileTest14.txt";

        String data =" ";

//create a file object

        File myFile = new File(fileName);
        try(PrintWriter writer = new PrintWriter(new FileWriter(fileName,true))){

            writer.println("This line will be appended");

            writer.printf("Append formatted content: %d %s%n",167,"example");

            System.out.println("Content written to file + Append Successful");

        }
        catch(IOException e){

            System.out.print("An error occurred while writing to the file.");

            e.printStackTrace();

        }

    }

}
