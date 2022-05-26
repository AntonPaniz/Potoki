public class Main {
    public static void main(String[] args) {
        Thread runik = new Thread(new FromRun());
        runik.start();
        Thread lola = new Thread(new FromRunSecondThread());
        lola.start();
        StraightThread chilik = new StraightThread();
        chilik.start();
        ThreadSecondVersion offspring = new ThreadSecondVersion();
        offspring.start();


    }
}
