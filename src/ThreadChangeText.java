import java.util.Scanner;

public class ThreadChangeText extends Thread {

    private Common common;

    private Scanner scanner = new Scanner(System.in);

    public ThreadChangeText(Common common) {
        super();
        this.common = common;
    }

    public void run() {
        while (true) {
            common.setText(scanner.nextLine());
        }
    }
}
