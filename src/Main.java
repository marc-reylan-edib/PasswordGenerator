import java.util.Scanner;

public class Main {

    public static Scanner sc =  new Scanner(System.in);
    public static void main(String[] args) {

        generarContraseña();

    }

    public static void generarContraseña(){
        System.out.println("Enter how many characters you want for your password: ");
        int cantidad = Integer.parseInt(sc.nextLine());

        String characters = "aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ";
        String password = "";

        for(int x = 0; x < cantidad ; x++){
    
            password =  password + characters.charAt((int)(Math.random() * characters.length()-1));
        }
        System.out.println(password);
    

    }
}
