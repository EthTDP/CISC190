package ExtraCredit;

/**
 * Abstract BasicShape class which implements the interface to get xAdj and yAdj.
 */
public abstract class BasicShape implements BasicInterface {
    private int xAdj, yAdj;

    /**
     * No-arg constructor for BasicShape
     */
    public BasicShape()
    {
        xAdj = 0;
        yAdj = 0;
    }

    /**
     * Constructor with 2 parameters for BasicShape that can be called with either arrow.
     *
     * @param xAdj the x adj
     * @param yAdj the y adj
     */
    public BasicShape(int xAdj, int yAdj)
    {
        this.xAdj = xAdj;
        this.yAdj = yAdj;
    }

    /**
     * Draws shape on y
     */
    @Override
    public void drawShapeOn() {
        for(int i = 0; i < yAdj; i++)
        {
            System.out.print("\n");
        }

        drawShape();
    }

    /**
     * Draws shape
     */
    public abstract void drawShape();

    /**
     * Gets the X
     * @return xAdj the x
     */
    public int getXAdj() {
        return xAdj;
    }
    /**
     * Gets the Y
     * @return yAdj the y
     */
    public int getYAdj() {
        return yAdj;
    }
    /**
     * sets the X
     * @param newXAdj the new xAdj
     */
    public void setXAdj(int newXAdj) {
        xAdj = newXAdj;
    }
    /**
     * sets the y
     * @param newYAdj the new yAdj
     */
    public void setYAdj(int newYAdj) {
        yAdj = newYAdj;
    }
}
