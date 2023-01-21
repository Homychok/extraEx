package Tasks.Task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        Words word1 = new Words("One");
        Words word2 = new Words("Two");
        Words word3 = new Words("Three");
        Words word4 = new Words("Four");
        Words word5 = new Words("Five");
        List<Words> wordsList = new ArrayList<>();
        wordsList.add(word1);
        wordsList.add(word2);
        wordsList.add(word3);
        wordsList.add(word4);
        wordsList.add(word5);
        wordsList.stream().map(Words::getWord);

        System.out.println(wordsList);
    }
}
