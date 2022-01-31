import java.util.Scanner;



public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);


        double totalArea = 0;

        int N = in.nextInt();
        int[] sides = new int[N+1];
        int[] heights = new int[N];

        for (int i = 0; i < sides.length; i++) {
            sides[i] = in.nextInt();
        }

        for (int i = 0; i < heights.length; i++) {
            heights[i] = in.nextInt();
        }

        for (int i = 0; i < N; i++) {
            totalArea += (double) ((sides[i]+sides[i+1]) * heights[i]) / 2;
        }

        System.out.print(totalArea);

    }
}
