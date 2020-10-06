import java.io.*;

public class ReadFileInput {
    public static void main(String args[]) throws IOException{
        FileReader myInput = null;
        FileWriter myOutput = null;

        try {
            myInput = new FileReader("/Users/huynhthingochanh/Desktop/quote.txt");
            myOutput =  new FileWriter("/Users/huynhthingochanh/Desktop/Output_quote.txt");
            int character;
            while ((character = myInput.read()) != -1) {
                myOutput.write(character);

            }

        }

        finally {
            if (myInput != null)
                myInput.close();
            if (myOutput != null)
                myOutput.close();
        }

        try (BufferedReader br = new BufferedReader(new FileReader("/Users/huynhthingochanh/Desktop/Output_quote.txt"))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }

    }
}
 
