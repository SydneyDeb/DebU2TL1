public class RectangleRunner {
    public static void main(String[] args) {
            Rectangle plot1 = new Rectangle(150,200);
            Rectangle plot2 = new Rectangle(125);
            Rectangle plot3 = new Rectangle();

            plot1.setWidth(75);
            plot2.setWidth(75);
            plot2.setLength(75);
            plot3.setWidth(75);

            int plot1Area = plot1.calculateArea();
            int plot2Area = plot2.calculateArea();
            int plot3Area = plot3.calculateArea();
            int totalArea = plot1Area + plot2Area + plot3Area;

            System.out.println("These three plots requires " + totalArea + " square feet of seed");
    }
}
