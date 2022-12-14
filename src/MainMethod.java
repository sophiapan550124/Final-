public class MainMethod {
    private String spam;
    private int times;

    public MainMethod(String spam, int times) {
        this.spam = spam;
        this.times = times;
    }

    public void printSpam() {
        System.out.println(spam + " ");
    }
}
