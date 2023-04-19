public class Lecture4Exercises {

    /*
     *   implement a function that returns factorial of given n
     *   lecture 4 page 15
     */
    public long factorial(int n) {
        long answer = 1;
        while(n > 0){
            answer = answer * n;
            n--;
        }
        return answer;
    }


    /*
     *   implement a function that return nth number of fibonacci series
     *   the series -> 1, 1, 2, 3, 5, 8, ...
     *   lecture 4 page 19
     */
    public long fibonacci(int n) {
        long first = 0;
        long second = 1;
        long answer = 0;
        if(n == 1){
            answer = 1;
        }
        else{
            n--;
            while(n > 0){
                answer = first + second;
                first = second;
                second = answer;
                n--;
            }
        }
        return  answer;
    }

    /*
     *   implement a function that return reverse of a given word
     *   lecture 4 page 19
     */
    public String reverse(String word) {
        int len = word.length();
        String answer = "";
        for(int  i = len-1; i >= 0; i--){
            answer = answer + word.charAt(i);
        }
        return answer;
    }

    /*
     *   implement a function that returns true if the given line is
     *   palindrome and false if it is not palindrome.
     *   palindrome is like 'wow', 'never odd or even', 'Wow'
     *   lecture 4 page 19
     */
    public boolean isPalindrome(String line) {
        line = line.toLowerCase();
        String fixLine = "";
        for(int  i = 0; i < line.length(); i++){
            if(line.charAt(i) != ' '){
                fixLine = fixLine + line.charAt(i);
            }
        }
        String check = reverse(fixLine);
        boolean flag;
        flag = check.equals(fixLine);
        return flag;
    }

    /*
     *   implement a function which computes the dot plot of 2 given
     *   string. dot plot of hello and ali is:
     *       h e l l o
     *   h   *
     *   e     *
     *   l       * *
     *   l       * *
     *   o           *
     *   lecture 4 page 26
     */
    public char[][] dotPlot(String str1, String str2) {
        char[][] answer = new char[str1.length()][str2.length()];
        for(int  i = 0; i < str1.length(); i++){
            for(int j = 0; j < str2.length(); j++){
                if(str1.charAt(i) == str2.charAt(j))
                    answer[i][j] = '*';
                else
                    answer[i][j] = ' ';
            }
        }
        return answer;
    }
}
