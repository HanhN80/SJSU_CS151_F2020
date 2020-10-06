import java.io.*;
import java.util.Scanner;

public class CreateFile {
    public static void main(String args[]) {
        File myNewFile = null;
        FileWriter  myFileWriter = null;
        FileReader myFileReader = null;

        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        String text = "";

        try {
            myNewFile = new File ("/Users/huynhthingochanh/Desktop/comand_line_input.txt");
            myFileWriter = new FileWriter(myNewFile, true);

            @SuppressWarnings("unused")
            BufferedWriter writer = new BufferedWriter(myFileWriter);
            while (true){
                String input = scan.nextLine();
                if(input.equalsIgnoreCase("@q"))
                    break;
                text += "\n" + input;

            }

            System.out.println(text);

            myFileWriter.write(text);
            myFileWriter.flush();
            myFileWriter.close();

            myFileReader = new FileReader(myNewFile);
            int data = myFileReader.read();
            while (data != -1) {
                System.out.println((char) data);
                data = myFileReader.read();
            }
            myFileReader.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
