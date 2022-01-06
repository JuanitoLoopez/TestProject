package fizzBuzzChallenge;

public class FizzBuzzChallenge {
    private Long number = 30L;
    private String result = "";

    private static String fizzBuzz(Long number, String result) {
        for (int i = 0; i <= number; i++) {
            if(number % 3 == 0) {
                result = "Fizz";
                return result;
            } else if (number % 5 == 0) {
                result = "Buzz";
                return result;
            } else {
                result = "FizzBuzz";
                return result;
            }
        }
        return result;
    }
}
