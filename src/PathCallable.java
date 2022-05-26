import java.util.concurrent.Callable;

public class PathCallable {
    public class StyleOfCallable implements Callable<Long> {
        public long count = 0;
        @Override
        public Long call() {
            for (int i = 0; i < 10; i++) {
                count++;
            }
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();}
                return count;
        }
    }
}
