package ExtraCredit;

/**
 * LeftArrow class for drawing a left arrow. Extends an abstract class and implements an interface.
 */
public class LeftArrow extends BasicShape implements ArrowInterface {
    private int tail, width;

    /**
     * No-arg constructor for LeftArrow
     */
    public LeftArrow()
    {
        super();
        tail = 5;
        width = 5;
    }

    /**
     * Constructor with 4 parameters for LeftArrow
     *
     * @param xAdj  the x adj
     * @param yAdj  the y adj
     * @param tail  the tail
     * @param width the width
     */
    public LeftArrow(int xAdj, int yAdj, int tail, int width)
    {
        super(xAdj, yAdj);
        if(width % 2 == 0)
        {
            width++;
        }
        this.width = width;
        this.tail = tail;
    }

    /**
     * Draws the arrow
     */
    private void drawArrow()
    {
        int tailLocation = (width + 2) / 2;

        for(int i = 1; i <= width / 2 + 1; i++)
        {
            System.out.print("\n");

            if(i == tailLocation)
            {
                for(int x = 0; x < getXAdj(); x++)
                {
                    System.out.print(" ");
                }

                System.out.print("*");

                for(int spaces = 0; spaces < width / 2 - 1; spaces++) {
                    System.out.print(" ");
                }

                System.out.print("*");

                drawTail();
            } else {

                for(int x = 0; x < getXAdj() + width / 2 - 1; x++)
                {
                    System.out.print(" ");
                }

                for(int spaceNumb = 1; spaceNumb < i - 1; spaceNumb++)
                {
                    System.out.print("\b");
                }

                if(i != 1)
                    System.out.print("*");

                for(int spaces = 1; spaces < i - 1; spaces++)
                {
                    System.out.print(" ");
                }

                if(i == 1)
                    System.out.print(" ");

                System.out.print("*");
            }
        }

        for(int i = 0; i < width / 2 + 1; i++)
        {
            System.out.print("\n");

            for(int x = 0; x < getXAdj(); x++)
            {
                System.out.print(" ");
            }

            System.out.print(" ");

            for(int spaceNumb = 0; spaceNumb < i; spaceNumb++)
            {
                System.out.print(" ");
            }

            if(i != width / 2)
            {
                System.out.print("*");
            }

            for(int space = (width / 2 - 1) - i; space > 1; space--)
            {
                System.out.print(" ");
            }

            if(i < width / 2 - 1) {
                System.out.print("*");
            }
        }
    }

    /**
     * Draws the tail
     */
    private void drawTail() {
        for(int i = 0; i < tail; i++)
        {
            System.out.print("*");
        }
    }

    /**
     * Draws the shape
     */
    @Override
    public void drawShape() {
        System.out.print("\n");
        for(int i = 0; i < getXAdj(); i++)
        {
            System.out.print(" ");
        }

        drawArrow();
    }

    /**
     * Sets the new arrow dimensions
     * @param newTail  the new tail
     * @param newWidth the new width
     */
    @Override
    public void setArrowDim(int newTail, int newWidth) {
        tail = newTail;
        width = newWidth;
    }
}
