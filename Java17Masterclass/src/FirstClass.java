import java.util.ArrayList;
import java.util.List;

public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello World");

        List<String> words = List.of("Apple", "Bat", "Cat","Orange");
        List<String> wordsAL = new ArrayList<>(words);
        for (int i=0;i< wordsAL.size();i++) {
            if(wordsAL.get(i).endsWith("at")){
                wordsAL.remove(wordsAL.get(i));
            }
        }
        System.out.println(wordsAL);
    }
}