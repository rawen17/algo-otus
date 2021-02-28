public class Rectangle {

    private final int height = 25;
    private final int width = 25;

    Rectangle() {
    }

    public void paint1() {
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

    public void paint2() {
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

    public void paint3() {
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

    public void paint4() {
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

    public void paint5() {
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

    public void paint6() {
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

    public void paint7() {
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

    public void paint8() {
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

    public void paint9() {
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
