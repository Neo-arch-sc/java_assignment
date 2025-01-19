class questUn {
    public static void main(String[] args) {
        System.out.println("single loop:");
        useSingleLoop();

        System.out.println("\nnested loop:");
        useNestedLoops();
    }

    public static void useSingleLoop() {
        for (int i = 0; i < 4; i++) {
            System.out.println("****====****");
        }
    }

    public static void useNestedLoops() {
        int h = 4;
        int w = 12;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (j < 4) {
                    System.out.print("*");
                } else if (j < 8) {
                    System.out.print("=");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
