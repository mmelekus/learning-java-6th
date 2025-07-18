package ch05.example;

public class PrintAppleDetails {
    public static void main(String[] args) {
        String niceNames[] = Apple.getAppleSizes();
        Apple a1 = new Apple();
        
        System.out.println("Apple a1:");
        System.out.println("  Mass: " + a1.mass);
        System.out.println("  Diameter: " + a1.diameter);
        System.out.println("  Position: (" + a1.x + ", " + a1.y + ")");

        if (a1.diameter < 5.0f) {
            System.out.println("This is a " + niceNames[Apple.SMALL] + " apple.");
        } else if (a1.diameter < 10.0f) {
            System.out.println("This ia a " + niceNames[Apple.MEDIUM] + " apple.");
        } else {
            System.out.println("This is a " + niceNames[Apple.LARGE] + " apple.");
        }
    }
}
