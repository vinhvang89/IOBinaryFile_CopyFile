import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter input :");
        String input = scan.nextLine();
        System.out.println("Enter output :");
        String output = scan.nextLine();
        try{
            FileInputStream f_i = new FileInputStream(input);
            FileOutputStream f_o = new FileOutputStream(output);
            int hehe ;
            while ((hehe = f_i.read())!= -1){
                f_o.write(hehe);
            }
            f_i.close();
            f_o.close();

        } catch (Exception e){
            System.out.println("Trash computer");
        }
    }
}
