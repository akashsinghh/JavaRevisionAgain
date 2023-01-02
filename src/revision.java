import java.util.ArrayList;
import java.util.stream.Collectors;

public class revision {
    public static void main(String[] args) {
      String s="abbcbba";
      String r="";
      for(int i =s.length()-1;i>=0;i--){
          r=r+s.charAt(i);
      }if(s.equals(r)){
            System.out.println("True");
        }else {

            System.out.println("False");
        }

    }
}
