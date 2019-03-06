import java.util.Scanner;

public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s) {
        int answer = 0;
        char[] chars = s.toCharArray();
        int count = 0;

        for (char c : chars) {

            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
            }
        }

        System.out.println("Number of vowels in string =" + count);
        return count;
    }

    //Code you problem number two here
    static int problemTwo(String s) {
        int answer = 0;


        return answer;
    }
        //Code your solution to problem number 3 here
        static String problemThree (String s){
           int index=0;
           int element = s.length();
           for (int i=1; i++){
               if (s(i).length()>element){
                   index=1;
               }
           }
            return s;
        }
        public static void main (String[]args){
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */
            String s;
        }
    }
