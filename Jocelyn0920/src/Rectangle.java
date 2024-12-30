public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int rectWidth, int rectHeight)
    {
        width = rectWidth;
        height = rectHeight;
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }

    public int getArea()
    {
        return width * height;
    }

    public String toString()
    {
        String rectInfo = "Rectangle with width " + width + " and height " + height +
                " and area " + getArea();

        return rectInfo;
    }
}
