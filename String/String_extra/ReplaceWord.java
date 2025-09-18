public class ReplaceWord {
    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful";
        String oldWord = "Java";
        String newWord = "Python";
        String[] words = sentence.split(" ");
        String result = "";

        for (String word : words) {
            if (word.equals(oldWord))
                result += newWord + " ";
            else
                result += word + " ";
        }

        System.out.println("Modified Sentence: " + result.trim());
    }
}
