import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner N_in = new Scanner(System.in);
        Scanner S_in = new Scanner(System.in);
        Scanner H_in = new Scanner(System.in);

        double totalArea = 0;

        int N = N_in.nextInt();
        int[] sides = new int[N+1];
        int[] heights = new int[N];

        for (int i = 0; i < sides.length; i++) {
            sides[i] = S_in.nextInt();
        }

        for (int i = 0; i < heights.length; i++) {
            heights[i] = H_in.nextInt();
        }

        for (int i = 0; i < N; i++) {
            totalArea += (double) ((sides[i]+sides[i+1]) * heights[i]) / 2;
        }

        System.out.println(totalArea);





    }

}
