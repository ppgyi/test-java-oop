package sk.pgyi.oop;

public class App {
    public static void main(String[] args){

        // break a continue s labelom, presunie na vonkajsi cyklus:
        vonkajsiFor:
        for (int i = 0; i < 100; i++){
            for (int j = 10; j > 0; j--){
                System.out.println("---");
                if (i%4 == 0){
                    continue vonkajsiFor;
                }
                System.out.println(i + ", " + j);
            }
        }
        System.out.println("koniec");
    }
}
