package lsp;

/**
 * base is
 * */


public class ViolatesLSP {

    public class Shape {
        public double area() {
            return 0;
        }
    }

    public class Rectangle extends Shape {
        private double width;
        private double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public double area() {
            return width * height;
        }
    }

    public class Triangle extends Shape {
        // base is not part for Shape
        private double base;
        private double height;

        public Triangle(double base, double height) {
            this.base = base;
            this.height = height;
        }

        @Override
        public double area() {
            // This implementation violates LSP because incorrect for triangles.
         return base * height;
        }
    }
}
