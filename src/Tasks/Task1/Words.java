package Tasks.Task1;

public class Words {
    public String word;
    Words(String word) {
        this.word = word;
    }


    public String getWord() {
        return word;
    }

    @Override
    public String toString() {
        return "Words{" +
                "word='" + word + '\'' +
                '}';
    }
}
