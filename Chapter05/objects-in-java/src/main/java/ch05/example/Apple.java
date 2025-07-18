package ch05.example;

public class Apple {

    private static final String HEADER = "Apple Details";
    public static final int SMALL =0;
    public static final int MEDIUM = 1;
    public static final int LARGE = 2;

    float mass;
    float diameter = 1.0f;
    int x, y;

    boolean isTouching(Apple other) {
        double xdiff = x - other.x;
        double ydiff = y - other.y;
        double distance = Math.sqrt(xdiff * xdiff + ydiff * ydiff);
        return distance < diameter / 2 + other.diameter / 2;
    }

    // More methods will go here as we fill out more details of our apple.

    public void printDetails() {
        printDetails(HEADER);
    }

    public void printDetails(String header) {
        String finalHeader = header.isEmpty() ? HEADER : header;
        System.out.println(finalHeader);
        System.out.println("  Mass: " + mass);
        // Print the exact diamter...
        // System.out.println("  Diameter: " + diameter);
        // Or a nice, human-friendly approximate size.
        String niceNames[] = Apple.getAppleSizes();
        if (diameter < 5.0f) {
            System.out.println(niceNames[SMALL]);
        } else if (diameter < 10.0f) {
            System.out.println(niceNames[MEDIUM]);
        } else {
            System.out.println(niceNames[LARGE]);
        }
        System.out.println("  Position: (" + x + ", " + y + ")");
        System.out.println("");
    }

    public void moveTo(int x, int y) {
        System.out.println("Moving apple to (" + x + ", " + y + ")");
        // Store the new x value.
        this.x = x;
        // Store the new y value if it is high enough.
        // If the y value is less than the diameter, set it to the diameter.
        if (y > diameter) { this.y = y; }
        else { this.y = (int) diameter; } // Ensure y is at least the diameter
    }

    public static String[] getAppleSizes() {
        return new String[] { "SMALL", "MEDIUM", "LARGE" };
    }
}
