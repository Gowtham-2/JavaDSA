package algorithms.recursion.subsequence;

public class StringSubSequence {
    public static void main(String[] args) {
        System.out.println(getSubSequence("abcdef"));
    }
    private static String getSubSequence(String word){
        if(word.isEmpty()){
            return "";
        }
        char first=word.charAt(0);
        String rest=getSubSequence(word.substring(1));
        String result="";
        for (String seque:rest.split(",")) {
            result+=","+first+seque;
            result+=","+seque;
        }
        return result.substring(1);
    }
}
