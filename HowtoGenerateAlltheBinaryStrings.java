import java.util.ArrayList;
import java.util.List;

public class HowtoGenerateAlltheBinaryStrings {
        public boolean briankarge(String s){
            for(int i=0;i<s.length()-1;i++){
                if(s.charAt(i)=='0' && s.charAt(i+1)=='0') return false;
            }
            return true;
            // return false;
        }
        public List<String> validStrings(int n) {
            List<String> list = new ArrayList<>();
            // Method to generate all the binary Strings
            for (int i = 0; i < (1 << n); i++) {
                String str = Integer.toBinaryString(i);
                while (str.length() < n) {
                    str = "0" + str;
                }
                if(briankarge(str))list.add(str);
                // }
            }
            return list;
        }

}
