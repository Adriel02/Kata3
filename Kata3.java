public class Kata3 {
    public static void main(String[] args) {
        Histogram<String> histogram= new Histogram<>();
        histogram.increment("Gmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("outlook.com");
        histogram.increment("outlook.com");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");

        new HistogramDisplay(histogram).execute();
    }
}
