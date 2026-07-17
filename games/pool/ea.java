/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ea extends ma {
    String[][] field_n;
    static boolean field_l;
    boolean field_v;
    static Random field_r;
    int field_o;
    int field_t;
    int field_s;
    int field_x;
    int[][] field_q;
    static int field_p;
    static boolean field_z;
    int field_w;
    static vh field_u;
    int field_y;
    static String field_m;

    final static void c(byte param0) {
        int var1 = -27;
        di.field_j = kn.field_e.j(-100);
        CharSequence var2 = (CharSequence) (Object) di.field_j;
        oj.field_y = hq.a(110, var2);
    }

    public static void d(byte param0) {
        field_u = null;
        field_m = null;
        field_r = null;
    }

    ea() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = false;
        field_p = 0;
        field_z = true;
        field_m = "In a proper game, we would now take turns to try to \"pot\" balls, but for the purposes of this tutorial you're on your own. Try to \"pot\" any ball (make it go into a pocket) on the table, but don't hit the black ball first or pot it.";
        field_r = new Random();
    }
}
