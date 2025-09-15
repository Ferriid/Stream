import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //1
        List<String> names = Arrays.asList("Ali", "Leyla", "Misha", "Nigar", "Anar", "Kamran");
        var studentsName=  names.stream().filter(name -> name.startsWith("A")).toList();
        System.out.println(studentsName);
//2
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
        var number = numbers.stream().map(numbero->numbero*numbero).toList();
        System.out.println(number);
//3
        List<String> words = Arrays.asList("apple", "banana", "avocado", "apricot", "berry");
        var word = words.stream().filter(worrd->worrd.startsWith("a")).count();
        System.out.println(word);
//4
        List<Integer> numbers2 = Arrays.asList(5, 12, 7, 20, 25, 30, 3);
        //Use filter to keep only numbers greater than 10.
        var numbersGreaterThan10= numbers2.stream().filter(num -> num>10).toList();
        System.out.println(numbersGreaterThan10);

        //Use map to multiply each remaining number by 2.
        var numberMultiply = numbers2.stream().filter(n->n<=10).map(n->n*2).toList();
        System.out.println(numberMultiply);
        System.out.println(numberMultiply.stream().count());
    }
}git remote add origin https://github.com/Ferriid/Stream.git
