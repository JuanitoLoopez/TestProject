package fizzBuzzChallenge;

public class FizzBuzzChallenge {

    public static String fizzBuzz(Long number) {
        String result = "";
        for (int i = 0; i <= number; i++) {
            if(number % 3 == 0 && number % 5 != 0) {
                result = "Fizz";
                return result;
            } else if (number % 5 == 0 && number % 3 != 0) {
                result = "Buzz";
                return result;
            } else if (number % 3 == 0 && number % 5 == 0) {
                result = "FizzBuzz";
                return result;
            } else {
                result = String.valueOf(i);
                return result;
            }
        }
        return result;
    }

}
