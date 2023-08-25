import java.util.Scanner;
public class endSymbolSame {
    boolean lastsameornot(String a){
        int l = a.length();
        char lastchar = a.charAt(l-1);
        char secondlastchar = a.charAt(l-2);
        if(lastchar == secondlastchar){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        endSymbolSame obj = new endSymbolSame();
        System.out.print("Enter a string: ");
        String a = sc.nextLine();
        boolean t = obj.lastsameornot(a);
        if(t){
            System.out.println("String accepted");
        }else{
            System.out.println("String not accepted");
        }
    }
}
