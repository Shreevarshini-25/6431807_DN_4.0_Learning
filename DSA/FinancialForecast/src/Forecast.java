public class Forecast {

    // Recursive forecast method
    public static double forecastRecursive(double value, double rate, int years) {
        if (years == 0) return value;
        return forecastRecursive(value * (1 + rate), rate, years - 1);
    }

    // Optimized using memoization
    public static double forecastMemoized(double value, double rate, int years, double[] memo) {
        if (years == 0) return value;
        if (memo[years] != 0) return memo[years];

        memo[years] = forecastMemoized(value * (1 + rate), rate, years - 1, memo);
        return memo[years];
    }
}
