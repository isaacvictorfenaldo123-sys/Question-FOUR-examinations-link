

package qn4.babysmealschedular;


public class BabysmealSchedular {

    public static void main(String[] args) {
        double porridgeLitres = 2.0;
        double milkLitres = 2.0;
        double cupSize = 0.5;

        int porridgeFeeds = (int)(porridgeLitres / cupSize);
        int milkFeeds = (int)(milkLitres / cupSize);

        int totalTime = (porridgeFeeds * 45) + (milkFeeds * 30);

        System.out.println("Total feeding time: " + totalTime + " minutes");
        System.out.println("Equivalent to: " + (totalTime / 60.0) + " hours");
    }
}
    
