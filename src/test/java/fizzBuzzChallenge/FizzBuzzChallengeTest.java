package fizzBuzzChallenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzChallengeTest {

    @Test
    public void returrn_fizz_when_is_divisible_by_3(){
        FizzBuzzChallenge fizzBuzzChallenge = new FizzBuzzChallenge();

        assertTrue("Fizz", fizzBuzzChallenge.fizzBuzz(3L).equals("Fizz"));
        assertTrue("Fizz", fizzBuzzChallenge.fizzBuzz(6L).equals("Fizz"));
        assertTrue("Fizz", fizzBuzzChallenge.fizzBuzz(9L).equals("Fizz"));
    }
    @Test
    public void returrn_buzz_when_is_divisible_by_5(){
        FizzBuzzChallenge fizzBuzzChallenge = new FizzBuzzChallenge();

        assertTrue("Buzz", fizzBuzzChallenge.fizzBuzz(5L).equals("Buzz"));
        assertTrue("Buzz", fizzBuzzChallenge.fizzBuzz(10L).equals("Buzz"));
        assertTrue("Buzz", fizzBuzzChallenge.fizzBuzz(20L).equals("Buzz"));
    }
    @Test
    public void returrn_fizzBuzz_when_is_divisible_by_3_and_5(){
        FizzBuzzChallenge fizzBuzzChallenge = new FizzBuzzChallenge();

        assertTrue("FizzBuzz", fizzBuzzChallenge.fizzBuzz(15L).equals("FizzBuzz"));
        assertTrue("FizzBuzz", fizzBuzzChallenge.fizzBuzz(30L).equals("FizzBuzz"));
        assertTrue("FizzBuzz", fizzBuzzChallenge.fizzBuzz(60L).equals("FizzBuzz"));
    }

}