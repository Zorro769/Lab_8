import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        try
        {
            Reader input = new FileReader("D:\\Forestry\\Java\\Lab_8\\src\\mainText.txt");
            Reader input_2 = new FileReader("D:\\Forestry\\Java\\Lab_8\\src\\codedText.txt");
            Writer output = new FileWriter("D:\\Forestry\\Java\\Lab_8\\src\\codedText.txt");
            Writer output_2 = new FileWriter("D:\\Forestry\\Java\\Lab_8\\src\\uncodedText.txt");
            String myKey = "Mytsko Dmytro Andriiovych";
            int index = 0;
            int x;
            while ((input.ready()))
            {
                x = myKey.charAt(index);
                index++;
                if(index == myKey.length())
                    index = 0;
                output.write(input.read()^x);
            }
            input.close();
            output.flush();
            output.close();
            index = 0;
            while ((input_2.ready()))
            {
                x = myKey.charAt(index);
                index++;
                if(index == myKey.length())
                    index = 0;
                output_2.write(input_2.read()^x);
            }
            input_2.close();
            output_2.flush();
            output_2.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}