public class ThreadSoutText extends Thread {

    private Common common;

    public ThreadSoutText(Common common) {
        super();
        this.common = common;
    }

    public void run() {
        while (true) {
            System.out.println(common.getText());
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
