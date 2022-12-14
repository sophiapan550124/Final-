public class MainMethod {
    // attributes for class MainMethod
    private String spam;
    private int times;

    /**
     * constructor for MainMethod that implements the attributes
     */
    public MainMethod(String spam, int times) {
        this.spam = spam;
        this.times = times;
    }

    /**
     * method that prints out the inputted message
     */
    public void printSpam() {
        System.out.println(spam + " ");
    }
}
