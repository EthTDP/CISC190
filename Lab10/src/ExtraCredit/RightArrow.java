package ExtraCredit;

/**
 * RightArrow class for drawing a right arrow. Extends an abstract class and implements an interface.
 */
public class RightArrow extends BasicShape implements ArrowInterface {
    private int tail, width;

    /**
     * No-arg constructor for RightArrow
     */
    public RightArrow()
    {
        super();
        tail = 5;
        width = 5;
    }

    /**
     * Constructor with 4 parameters for RightArrow
     *
     * @param xAdj  the x adj
     * @param yAdj  the y adj
     * @param tail  the tail
     * @param width the width
     */
    public RightArrow(int xAdj, int yAdj, int tail, int width)
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
     * Draws the arrow.
     */
    private void drawArrow()
    {
        int tailLocation = (width + 1) / 2;

        for(int i = 1; i <= width / 2 + 1; i++)
        {
            System.out.print("\n");

            for(int x = 0; x < getXAdj(); x++)
            {
                System.out.print(" ");
            }


            if(i == tailLocation)
            {
                drawTail();

                System.out.print("*");

                for(int space = 0; space < width / 2 - 1; space++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
            } else if(i < tailLocation) {
                drawSpaces();
                System.out.print("*");

                for(int topSpace = 1; topSpace < i - 1; topSpace++)
                {
                    System.out.print(" ");
                }
                if(i != 1) {
                    System.out.print("*");
                }
            }
        }

        for(int i = width / 2 + 1; i > 1; i--)
        {
            System.out.print("\n");

            for(int x = 0; x < getXAdj(); x++)
            {
                System.out.print(" ");
            }

            drawSpaces();
            System.out.print("*");

            for(int spaceNumb = i - 2; spaceNumb > 1; spaceNumb--)
            {
                System.out.print(" ");
            }

            if(i != 2)
                System.out.print("*");
        }
    }

    /**
     * Draws spaces
     */
    private void drawSpaces()
    {
        for(int i = 0; i < tail; i++)
        {
            System.out.print(" ");
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
     * Just draws the shape
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
     * Sets the new dimensions for arrow
     * @param newTail  the new tail
     * @param newWidth the new width
     */
    @Override
    public void setArrowDim(int newTail, int newWidth) {
        tail = newTail;
        width = newWidth;
    }
}
