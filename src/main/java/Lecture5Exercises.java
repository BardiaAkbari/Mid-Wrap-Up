import java.util.Random;

public class Lecture5Exercises {

    /*
     *   implement a function to create a random password with
     *   given length using lower case letters
     *   lecture 5 page 14
     */
    public String weakPassword(int length) {
        String lower = "abcdefghijklmnopqrstuvwxyz";
        Random myRandom = new Random();
        StringBuilder password = new StringBuilder();
        for(int  i = 0; i < length; i++){
            password.append(lower.charAt(myRandom.nextInt(lower.length())));
        }
        return password.toString();
    }

    /*
     *   implement a function to create a random password with
     *   given length and at least 1 digit and 1 special character
     *   lecture 5 page 14
     */
    public String strongPassword(int length) throws Exception {

        String numbers = "1234567890";
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String special = "<>@#$%&()-?/{}[]\\!=";
        String combination = numbers + upper + lower + special;
        Random myRandom = new Random();
        StringBuilder password = new StringBuilder();
        for(int  i = 0; i < length; i++){
            if(i == 1){
                password.append(numbers.charAt(myRandom.nextInt(numbers.length())));
            }
            else if (i == 3) {
                password.append(special.charAt(myRandom.nextInt(special.length())));
            }
            else{
                password.append(combination.charAt(myRandom.nextInt(combination.length())));
            }
        }
        return password.toString();
    }

    /*
     *   implement a function that checks if a integer is a fibobin number
     *   integer n is fibobin is there exist an i where:
     *       n = fib(i) + bin(fib(i))
     *   where fib(i) is the ith fibonacci number and bin(i) is the number
     *   of ones in binary format
     *   lecture 5 page 17
     */
    public boolean isFiboBin(int n) {
        return false;
    }
}
