/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bj extends IOException {
    static int[] field_b;
    static volatile int field_c;
    static int[] field_d;
    static int[] field_a;

    final static void a(int param0) {
        fl.a(-128, true, mj.field_d, uf.field_j);
        int var1 = 25 / ((param0 - -28) / 48);
        ae.field_C = true;
    }

    final static void a(byte param0) {
        int var1 = 0;
        int var2 = TorChallenge.field_F ? 1 : 0;
        if (param0 != 71) {
            field_a = null;
        }
        if (!(null != wa.field_pb)) {
            wa.field_pb = new boolean[5];
        }
        for (var1 = 0; var1 < 5; var1++) {
            mh.field_d[var1] = -1;
            wa.field_pb[var1] = false;
        }
        gh.field_m = false;
        bi.field_f = false;
        vi.field_a = 0;
        jj.field_d = false;
        qk.field_lb = 0;
        wj.field_a = 0;
        ih.a(param0 ^ 55);
    }

    final static void a(boolean param0) {
        fk.a(param0, 17);
    }

    bj(String param0) {
        super(param0);
    }

    public static void b(int param0) {
        field_b = null;
        int var1 = 30 % ((param0 - 17) / 50);
        field_a = null;
        field_d = null;
    }

    final static int a(int param0, boolean param1, int param2, int param3, int param4) {
        int var12 = TorChallenge.field_F ? 1 : 0;
        if (param1) {
            return -82;
        }
        int var5 = -param0 + param4;
        int var6 = -param2 + param3;
        int var7 = 0;
        int var8 = 1;
        if (-1 < (var5 ^ -1)) {
            var8 = -1;
            var5 = -var5;
        }
        int var9 = 0;
        if (var5 <= 32) {
            var9 = var8;
        } else {
            var9 = -var8;
        }
        if (!(-1 >= var6)) {
            var6 = -var6;
        }
        if (!(var5 < 32)) {
            var5 = -var5 + 64;
        }
        if (-65 < var5) {
            return -1;
        }
        if (-17 > var5) {
            return -1;
        }
        if (-241 < var6 * 64) {
            return -1;
        }
        int var10 = var5 * var5;
        int var11 = 0;
        while (-1 > (var10 ^ -1)) {
            var11++;
            var10 = var10 >> -2126403423;
        }
        var7 = -var11 + 9;
        var7 = var7 << -1895311033;
        if (var9 > 0) {
            var7 = -var7 + 256;
        }
        return var7;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = -1;
        field_d = new int[]{28, 26, 24, 22, 20};
        field_a = new int[]{0, 5, 10};
    }
}
