public class Main {
    public static void main(String[] args) {
        double initialValue = 1000.0;
        double growthRate = 0.08;
        int years = 10;

        double recursiveResult = Forecast.forecastRecursive(initialValue, growthRate, years);
        double[] memo = new double[years + 1];
        double memoizedResult = Forecast.forecastMemoized(initialValue, growthRate, years, memo);

        System.out.println("Forecast using recursion: " + Utils.formatCurrency(recursiveResult));
        System.out.println("Forecast using memoization: " + Utils.formatCurrency(memoizedResult));
    }
}
