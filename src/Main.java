public class Main {
    public static void main(String[] args) {
        Common common = new Common("Tekst");
        ThreadSoutText tsout = new ThreadSoutText(common);
        ThreadChangeText tchange = new ThreadChangeText(common);
        tsout.start();
        tchange.start();
    }
}
