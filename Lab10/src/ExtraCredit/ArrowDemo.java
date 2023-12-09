package ExtraCredit;

/**
 * The main class for lab10 extra credit. Uses the arrow classes to draw both a right and left arrow at specific locations and spaces.
 *
 * @since 11/20/2023
 * @version 1.0
 * @author Ethan Nguyen, nguyenethan691@gmail.com
 */
public class ArrowDemo {

    public static void main(String[] args)
    {
        RightArrow right1 = new RightArrow();
        right1.drawShapeOn();
        right1.setXAdj(10);
        right1.drawShapeOn();
        right1.setYAdj(5);
        right1.drawShapeOn();
        right1.setArrowDim(10, 15);
        right1.drawShapeOn();
        RightArrow right2 = new RightArrow(5, 10, 15, 14);
        right2.drawShapeOn();

        LeftArrow left1 = new LeftArrow(13, 0, 15, 15);
        left1.drawShapeOn();
        left1.setArrowDim(10, 10);
        left1.drawShapeOn();
        left1.setXAdj(5);
        left1.drawShapeOn();
        left1.setYAdj(5);
        left1.drawShapeOn();
        LeftArrow left2 = new LeftArrow();
        left2.drawShapeOn();
    }
}
