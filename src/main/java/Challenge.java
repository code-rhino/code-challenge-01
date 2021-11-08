import java.util.Locale;

public class Challenge {

//    Count Duplicate Words
//    Given a string like that that is is that that is not is not is that it it is wutang
//
//    Count the number of unique words, and how many times the occur.
//
//            The 4 unique words are:
//    that (Seen 5)
//    is (Seen 5)
//    not (Seen 2)
//    wutang (Seen 1)

    public void countDups(String dups) {
        String sentence = dups.toLowerCase();
        String words[] = dups.split(" ");


        for (int i = 0; i <= words.length; i++) {
            int count = 1;
            for(int j = i+1; i < words.length; j++){
                if(words[i].equals(words[j])){
                    count++;
                    words[j]= "0";

                }
            }
            if(count > 1 && words[i] != "0")
                System.out.println(words[i]);


        }

    }


    public static void main(String[] args) {
        Challenge challenge = new Challenge();
        challenge.countDups("that that is is that that is not is not is that it it is wutang");

    }
}