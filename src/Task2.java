public class Task2 {
    public static void main(String[] args) {
        int balance = 100;
        int added = 100;

        if (added > 1000) {
            System.out.println(balance + added + (added / 1000));
        } else {
            System.out.println(balance + added);
        }
    }
}