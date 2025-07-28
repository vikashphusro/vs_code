public class ReverseSenteneWord {

    public String reverseWordInSentence(String snt){
        String []str = snt.split(" ");
        StringBuilder builder  = new StringBuilder();
        for(String st : str){
            builder.append(" ").append(reverseWord(st));
            
        }
        System.out.println(builder.toString());
        return builder.toString();
    }

    private  String reverseWord(String ss){
        char[] ch = ss.toCharArray();
        int i = 0; 
        int j = ss.length() -1 ; 
        while(i<j){
            char temp= ch[j];
            ch[j] = ch[i];
            ch[i] = temp;
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        String ss = "vikash";
        ReverseSenteneWord reverseSenteneWord = new ReverseSenteneWord();
        String str = reverseSenteneWord.reverseWord(ss);
        System.out.println("Reverse Word is : " + str);

    }
    
}
