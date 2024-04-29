import java.util.stream.IntStream;

public class SumCalculator {

    public int sum(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Число повинно бути додатнім");
        }
        if (n == 0) {
            throw new IllegalArgumentException("n має бути більше 0");
        }
        return IntStream.range(1, n + 1).sum();
    }
}

