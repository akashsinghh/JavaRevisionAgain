import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DistinctSquare {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,2,6,5,3,3,4,9);
//        List<Integer> l=list.stream().distinct().collect(Collectors.toList());
//        String collect = list.stream().distinct().map(n -> n + "\t" + n * n).collect(Collectors.joining("\n"));
//        System.out.println(collect);
        list.stream().distinct().forEach(n -> System.out.println(n +"\t" +(int)Math.pow(n,4)));
        List<Integer> nam=new ArrayList<Integer>();
        nam.add(4);
        nam.add(5);
        nam.add(5);
        nam.add(7);
        nam.add(9);
        nam.add(4);
        nam.stream().distinct().forEach(n-> System.out.println(n+" "+(int)Math.pow(n,2)));
        nam.stream().distinct().forEach(e-> System.out.println(e+" "+(int)Math.pow(e,3)));



//        System.out.println(l);
    }

}
