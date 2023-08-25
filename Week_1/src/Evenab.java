import java.util.Scanner;
public class Evenab {
    boolean checkCharacter(String a){
        int ac=0, bc=0;
        for(int i=0;i<a.length();i++){
            char temp = a.charAt(i);
            if(temp!='a' && temp!='b'){
                System.out.println("Invalid token");
                return false;
            }else if(temp=='a'){
                ac++;
            }else{
                bc++;
            }
        }
        if(ac%2==0 && bc%2==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Evenab obj = new Evenab();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String a = sc.nextLine();
        int l = a.length();
        boolean valid = true;
        if(l%2!=0){
            valid = false;
        }
        valid = obj.checkCharacter(a);
        if(valid){
            System.out.println("String accepted");
        }else{
            System.out.println("String not accepted");
        }
    }
}
