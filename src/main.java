import java.util.stream.IntStream;

public class main {
    public static void main(String[] args) {
        int num = IntStream.rangeClosed(1, 10)
                .map((int x) ->
                        {
                            return x * 2;
                        }
                ).sum();
        System.out.printf("sum is : %d%n" , num);
    }


}
