class shape {
    int length;
    int breadth;

    shape(int l, int b) {
        length = l;
        breadth = b;
    }

    void area() {
        System.out.println("Area of shape: " + (length * breadth));
    }
}
class rectangle extends shape {
    rectangle(int l, int b) {
        super(l, b);
    }

    @Override
    void area() {
        System.out.println("Area of rectangle: " + (length * breadth));
    }
}
class square extends shape {
    square(int l) {
        super(l, l);
    }

    @Override
    void area() {
        System.out.println("Area of square: " + (length * breadth));
    }
}
class Main {
    public static void main(String[] args) {
        rectangle r = new rectangle(5, 10);
        square s = new square(4);

        r.area();
        s.area();
    }
}
 