//Copy this code into a DebugDemo.java file
//There are built in errors that need to be debugged

public class DebugDemo {

    public static final String HAPPYSTRING = "This is a happy string";

    public static void main(String[] args) {
        //test findLongestWord
        System.out.println(findLongestWord(HAPPYSTRING));

    }

    public static String findLongestWord(String sentence){
        String longestWord = "";
        String[] wordArray = sentence.split(" ");

        if(sentence != null){
            for(int i=0;i < wordArray.length;i++);{
                if (longestWord.length() > wordArray[0].length() ){
                    longestWord = wordArray[0];
                }
            }
        }

        return longestWord;
    }
}