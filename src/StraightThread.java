public class StraightThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("let's chill");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
    }
}
