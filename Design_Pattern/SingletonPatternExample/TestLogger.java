public class TestLogger {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("Started application.");

        Logger logger2 = Logger.getInstance();
        logger2.log("Running diagnostics.");

        // Check if both logger instances are the same
        if (logger1 == logger2) {
            System.out.println("Same logger instance is being used.");
        } else {
            System.out.println("Different logger instances — singleton failed.");
        }
    }
}


