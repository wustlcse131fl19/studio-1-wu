package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String[] args){
        ArgsProcessor ap = new ArgsProcessor(args);
        int x = ap.nextInt("Value for x?");
        int y = ap.nextInt("Value for y?");
        double average = (double)(x+y)/2;
        System.out.print(average);
        System.out.print(average);

    }


}
