package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            int leng = cathetusLength;
            for (int j = 1; j <= cathetusLength * 2 - 1; j++) {
                if(leng <= i) {
                    System.out.print(leng);
                } else if(j < cathetusLength) {
                    System.out.print(" ");
                }
                   if (j < cathetusLength) {
                       leng--;
                   } else {
                       leng++;
                   }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
