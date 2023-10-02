public class BoxRunner {
    public static void main(String[] args) {
        Box box1 = new Box(5.0, 4.5, 7.2);
        Box box2 = new Box(5, 4, 7);
        Box cube1 = new Box(15.0);
        Box cube2 = new Box(15);
        // box3 = new Box(2.5, 6.7);
        //Box box4 = new Box();

        Box newBox = new Box(6, 10, 8);

        //double larger = newBox.anySideLongerThan(10); // A
        //boolean big = newBox.anySideLongerThan(7.5); // B
        //boolean x = newBox.anySideLongerThan(5); // C
        //String dim = newBox.printDimensions(); // D
        //System.out.println(newBox.printDimensions()); // E
        //newBox.printDimensions(); // F
        //double volume = newBox.volume(21.8); // G

        newBox.printVolume();
    }
}
