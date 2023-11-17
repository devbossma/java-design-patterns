package ma.devboss.JDP.creational.prototype.explication;

import java.sql.Array;
import java.util.Arrays;

public class MainClient {
    public static void main(String[] args) {
        Enemy en1 = new Enemy("easy", 100);
        System.out.println(Arrays.toString(en1.getCoordination()));
        en1.setCoordination(new int[]{10, 23, 13});
        Enemy en2 = en1.clone();
        System.out.println(Arrays.toString(en1.getCoordination()));
        System.out.println(Arrays.toString(en2.getCoordination()));
        System.out.println(en1);
        System.out.println(en2);
        System.out.println(en2.getEnemyType());

    }
}
