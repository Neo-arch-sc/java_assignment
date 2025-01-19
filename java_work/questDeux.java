class questDeux {
    public static void main(String[] args) {
        System.out.println("Using a single loop:");
        singleLoop();

        System.out.println("\nUsing nested loops:");
        nestedLoop();
    }
    public static void singleLoop() {
        int rows = 6, columns = 12;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i < 3 && j < 4) System.out.print("*");
                else if (i < 3) System.out.print("=");
                else if (j < 11) System.out.print("=");
            }
            System.out.println();
        }
    }
    public static void nestedLoop() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) System.out.print("*");
            for (int j = 0; j < 7; j++) System.out.print("=");
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 11; j++) System.out.print("=");
            System.out.println();
        }
    }
}