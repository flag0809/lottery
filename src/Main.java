import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        SecureRandom sr = new SecureRandom();
        Set<Integer> s = new HashSet<>();
        int min = 1;
        int max = 45;
        while(s.size() < 6) {
            int randomNumber = sr.nextInt(max - min + 1) + min;
            s.add(randomNumber);
        }
        s.stream().sorted().forEach(System.out::println);
    }
}