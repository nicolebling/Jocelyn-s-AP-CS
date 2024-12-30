public class MyComplex {
    private double real; // Encapsulate the variables
    private double img;

    public MyComplex(double a, double b) {
        this.real = a;
        this.img = b;
    }
    public double getReal() {
        return real;
    }
    public void setReal(double real) {
        this.real = real;
    }
    public double getImg() {
        return img;
    }
    public void setImg(double img) {
        this.img = img;
    }
    public void setValue(double real, double img) {
        this.real = real;
        this.img = img;
    }
    public String toString() {
        if (img < 0) {
            return "(" + real + " - " + Math.abs(img) + "i)";
        } else {
            return "(" + real + " + " + img + "i)";
        }
    }

    public boolean isReal() {
        return img == 0;
    }

    public boolean isImaginary() {
        return real == 0;
    }

    public void add(MyComplex c) {
        this.real += c.real;
        this.img += c.img;
    }

    public void multiply(MyComplex c) {
        double tempReal = (this.real * c.real) - (this.img * c.img); // Correct real part
        double tempImg = (this.real * c.img) + (this.img * c.real);  // Correct imaginary part
        this.real = tempReal; // Assign calculated real part
        this.img = tempImg;   // Assign calculated imaginary part
    }

    public void conjugate() {
        this.img = -this.img;
    }

    public double argument() {
        return Math.atan2(img, real);
    }

    public double magnitude() {
        return Math.sqrt(real * real + img * img);
    }

//    public static void main(String[] args) {
//        // Create MyComplex objects
//        MyComplex num1 = new MyComplex(2, 3);
//        MyComplex num2 = new MyComplex(4, 5);
//
//        // Add num2 to num1
//        num1.add(num2);
//        System.out.println("Sum: " + num1); // Should print (6.0 + 8.0i)
//
//        // Multiply num1 by num2
//        num1 = new MyComplex(2, 3); // Reset num1 for correct multiplication
//        num1.multiply(num2);
//        System.out.println("Product: " + num1); // Should print (-7.0 + 22.0i)
//    }
}