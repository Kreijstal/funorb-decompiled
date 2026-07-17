/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ib extends gg {
    static Random field_i;
    int[] field_n;
    int field_m;
    boolean field_k;
    static boolean field_o;
    static int field_h;
    static dh field_l;
    static int field_j;

    public static void a(int param0) {
        field_i = null;
    }

    final static o a(int param0, boolean param1, int param2) {
        int var5 = SolKnight.field_L ? 1 : 0;
        o var3 = new o(param0, param0);
        int var4 = 0;
        if (!param1) {
            field_j = -85;
        }
        while (var4 < var3.field_v.length) {
            var3.field_v[var4] = param2;
            var4++;
        }
        return var3;
    }

    ib() {
        ((ib) this).field_k = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new Random();
        field_l = null;
        field_j = 0;
    }
}
