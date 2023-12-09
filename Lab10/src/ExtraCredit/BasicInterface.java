package ExtraCredit;

/**
 * Basic interface. All the basic things needed, specifically xAdj and yAdj.
 */
public interface BasicInterface {
    /**
     * Sets x adj.
     *
     * @param newXAdj the new x adj
     */
    void setXAdj(int newXAdj);

    /**
     * Gets x adj.
     *
     * @return the x adj
     */
    int getXAdj();

    /**
     * Sets y adj.
     *
     * @param newYAdj the new y adj
     */
    void setYAdj(int newYAdj);

    /**
     * Gets y adj.
     *
     * @return the y adj
     */
    int getYAdj();

    /**
     * Drawshapeon. Draws the shape on the y
     */
    void drawShapeOn();

    /**
     * Drawshape. Draws the actuals shape
     */
    void drawShape();
}
