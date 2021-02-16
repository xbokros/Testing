package sk.stuba.fei.uim.oop;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello World!");

        int x = 15;
        float y = 5.5f;
        double z = 5.5;     //Always use double
        long xyz = 5L;

        char alpha = 'a';
        String beta = "a";

        int op1 = 2/3;      //0
        int op2 = 2%3;      //2

        System.out.println(op1);
        System.out.println(op2);

        float op3 = 2/3.0f;
        System.out.println(op3);

        boolean truth = true;

        if(2>1){
            System.out.println("Hello");
            System.out.println("World");
        }
        if(2!=1){
            System.out.println("I am alive!");
        }

        switch (x){
            case 1:
                System.out.println("X = 1");
                break;
            case 2:
                System.out.println("X = 2");
                break;
            case 15:
                System.out.println("X = 15");
                break;
            default:
                System.out.println(String.format("X = %d",x));
        }
        for(int i = 1; i <= x; i++){
            System.out.println(String.format("i = %d",i));
        }
    }
}
