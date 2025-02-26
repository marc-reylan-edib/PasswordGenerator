import java.util.Scanner;

public class Main {

    public static Scanner sc =  new Scanner(System.in);
    public static void main(String[] args) {

        generatePassword();

    }

    public static void generatePassword(){
        System.out.println("+....................+");
        System.out.println("| PASSWORD GENERATOR |");
        System.out.println("+....................+");

        int cantidad = 0;
        boolean valid = false;

            try{
                System.out.println("Enter how many characters you want for your password: ");
                cantidad = Integer.parseInt(sc.nextLine());
    
                if(cantidad <= 0){
                    System.out.println("ERROR: The number must be 1 or bigger. ");
                } else{
                    valid = true;
                }
    
            }catch(NumberFormatException e){
                System.out.println("ERROR: Please enter a valid number");
            }   
        
        String characters = "aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ";
        StringBuilder password = new StringBuilder();


        for(int x = 0; x < cantidad ; x++){
    
            password.append(characters.charAt((int)(Math.random()*characters.length())));
        }
        System.out.println("Password generated: " + password);
    

    }
}
