package ie.atu;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class WriterFile {
    public static void main(String[] args) {
String fileName = "File14.txt";

        File myFile = new File(fileName);
        try
            (FileWriter Writer = new FileWriter(fileName, true)){
            Writer.write("My name is");
            Writer.write(" Johanan");
            System.out.println("Content Has been written to file + Append Successful");
        }
        catch(IOException e)
        {
            System.out.println("An error has occurred while writing to file");
            e.printStackTrace();
        }
    }

}
