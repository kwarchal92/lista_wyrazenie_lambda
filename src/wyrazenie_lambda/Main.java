package wyrazenie_lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<String> imiona = Arrays.asList("Adam", "Ewa", "Katarzyna", "Bartosz", "Jakub", "Sławomir", "Magdalena");

        Collections.sort(imiona, (String o1, String o2) ->
        {return o2.compareTo(o1);}); //wyrazenie lambda

        System.out.println(imiona);
    }
}
