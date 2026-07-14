/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ue extends fa {
    int[][] field_l;
    static ak field_t;
    static String field_q;
    String[][] field_r;
    int field_s;
    int field_o;
    static String field_p;
    boolean field_n;
    int field_m;
    long[][] field_k;

    final static int a(int param0, byte param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = Pixelate.field_H ? 1 : 0;
        int var2 = 0;
        int[] var8 = new int[la.field_a.length];
        int[] var7 = var8;
        int[] var3 = var7;
        if (param1 != 118) {
            field_p = null;
        }
        for (var4 = 0; var8.length > var4; var4++) {
            var3[var4] = -Math.abs(param0 + -la.field_a[var4]) + 30;
            if (var8[var4] < 0) {
                var8[var4] = 0;
            }
            var2 = var2 + var8[var4];
        }
        var4 = ok.a(tg.field_f, param1 ^ -3, var2);
        for (var5 = 0; var5 < var8.length; var5++) {
            var4 = var4 - var8[var5];
            if (!(var4 > 0)) {
                return var5;
            }
        }
        return ok.a(tg.field_f, -125, la.field_a.length);
    }

    final static boolean a(byte param0) {
        int var1 = -8 % ((18 - param0) / 51);
        return ka.field_W != null ? true : false;
    }

    public static void a(int param0) {
        field_p = null;
        field_t = null;
        field_q = null;
        if (param0 != 30) {
            field_q = null;
        }
    }

    final static void b(int param0, byte param1) {
        int var3 = Pixelate.field_H ? 1 : 0;
        if (param1 != 42) {
            field_p = null;
        }
        hf var4 = (hf) (Object) dh.field_a.c(1504642273);
        while (var4 != null) {
            id.a((byte) -117, var4, param0);
            var4 = (hf) (Object) dh.field_a.f(param1 + 1504642231);
        }
        fa var2 = tj.field_z.c(1504642273);
        while (var2 != null) {
            ro.a(126, param0);
            var2 = tj.field_z.f(1504642273);
        }
    }

    ue() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Change display name";
        field_p = "Invalid date";
    }
}
