package lsp;

/**
 * objects of a superclass can be replaced with
 * objects of a subclass without affecting the correctness of the program.
 *
 * Substituting an object of type Rectangle or Square
 * for an object of type Shape should not affect the behavior of the program.
 */
public class Guide {
    public class Shape {

        /***
         *
         * LSP is concerned with the behavior of objects within inheritance hierarchies
         */
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

    public class Square extends Shape {
        private double side;

        public Square(double side) {
            this.side = side;
        }

        @Override
        public double area() {
            return side * side;
        }
    }

}
