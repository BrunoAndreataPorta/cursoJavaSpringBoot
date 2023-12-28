import java.util.List;
import java.util.Random;
import java.util.ArrayList;

class StreamEx {
    public static void main(String a[]){

        int size = 10_000;
        List<Integer> nums = new ArrayList<>(size);
        
        Random ran = new Random();

        for(int i=1; i<=size; i++){
            nums.add(ran.nextInt(100));
        }
        
        // int sum1 = nums.stream()
        //     .map(i -> i*2)
        //     .reduce(0, (c,e) -> c+e);
        
        long startSeq = System.currentTimeMillis();
        int sum2 = nums.stream()
            .map(i -> i*2)
            .mapToInt(i -> i)
            .sum();
        long endSeq = System.currentTimeMillis();

        long startPara = System.currentTimeMillis();        int sum3 = nums.parallelStream()
            .map(i -> i*2)
            .mapToInt(i -> i)
            .sum();
        long endPara = System.currentTimeMillis();

        System.out.println(sum2 + " " + sum3);
        System.out.println("sum2 time Sequencial: " + (endSeq - startSeq));
        System.out.println("sum3 time Parallel: " + (endPara - startPara));

    }
}
