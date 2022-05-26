public class FromRunSecondThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println("Lola it's up to you!");
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
    }
}