public class Rectangle {

    private int height;
    private int width;


    Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    Rectangle() {
        this(25,25);
    }

    public void Paint1() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j > i) {
                    System.out.print("# ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public void Paint2() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j == i) {
                    System.out.print("# ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public void Paint3() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j == width - i - 1) {
                    System.out.print("# ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public void Paint4() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j + i < 30) {
                    System.out.print("# ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public void Paint5() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j == i*2 || j == i*2+1) {
                    System.out.print("# ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public void Paint6() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j < 10 || i < 10) {
                    System.out.print("# ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public void Paint7() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j > 15 && i > 15) {
                    System.out.print("# ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public void Paint8() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j * i == 0) {
                    System.out.print("# ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public void Paint9() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j > i + 10 || i > j + 10) {
                    System.out.print("# ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }


}
