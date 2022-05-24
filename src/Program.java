import java.util.ArrayList;
import java.util.Locale;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("text");
        arr.add("no this word");
        arr.add("text one");
        arr.add("text two");
        arr.add("five");
        arr.add("three");
        System.out.println(getElementsByWord(arr, "text"));
    }

    static ArrayList<String> getElementsByWord(ArrayList<String> arrayList, String word){
        return (ArrayList<String>) arrayList.stream().filter(a -> a.toUpperCase()
                .contains(word.toUpperCase())).collect(Collectors.toList());
    }
}
