public class ThreadSecondVersion extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println("Welcome to Americana!");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
    }
}
