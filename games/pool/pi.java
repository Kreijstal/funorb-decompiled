/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pi {
    private static int[] field_b;
    private static int[] field_a;

    final static void a() {
        field_b = null;
    }

    private final static int a(int param0, int param1, int param2) {
        int var3 = param0 >> 8;
        int var4 = var3 + 1;
        int var5 = param1 >> 8;
        int var6 = var5 + 1;
        int var7 = param2 >> 8;
        int var8 = var7 + 1;
        var3 = var3 & 15;
        var4 = var4 & 15;
        var5 = (var5 & 15) << 4;
        var6 = (var6 & 15) << 4;
        var7 = (var7 & 15) << 8;
        var8 = (var8 & 15) << 8;
        int var9 = field_b[var7 + var5 + var3];
        int var10 = field_b[var7 + var6 + var3];
        int var11 = field_b[var8 + var5 + var3];
        int var12 = field_b[var8 + var6 + var3];
        param0 = field_a[param0 & 255];
        param1 = field_a[param1 & 255];
        param2 = field_a[param2 & 255];
        int var13 = var9 + ((field_b[var4 + var5 + var7] - var9) * param0 >> 8);
        int var14 = var11 + ((field_b[var4 + var5 + var8] - var11) * param0 >> 8);
        int var15 = var13 + ((var10 + ((field_b[var4 + var6 + var7] - var10) * param0 >> 8) - var13) * param1 >> 8);
        return var15 + ((var14 + ((var12 + ((field_b[var4 + var6 + var8] - var12) * param0 >> 8) - var14) * param1 >> 8) - var15) * param2 >> 8);
    }

    final static void c() {
        int var2 = 0;
        int var0 = 4096;
        field_b = new int[var0];
        Random var1 = new Random();
        for (var2 = var0 - 1; var2 >= 0; var2--) {
            field_b[var2] = ga.a(131072, true, var1) - 65536;
        }
    }

    final static int a(int param0, int param1, int param2, int[] param3, int param4, int param5) {
        int var6 = param4 + ((pi.a(param0, param1, param2) >> 2) + (pi.a(param0 >> 1, param1 >> 1, param2 >> 1) >> 1) + pi.a(param0 >> 2, param1 >> 2, param2 >> 2) >> 10);
        if (var6 < 0) {
            return param3[0];
        }
        if (var6 >= param3.length) {
            return param3[param3.length - 1];
        }
        return param3[var6];
    }

    public static void b() {
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_a = new int[256];
        for (var0 = 0; var0 < field_a.length; var0++) {
            field_a[var0] = (int)(256.0 * (1.0 - Math.cos((double)var0 * 3.141592653589793 / (double)field_a.length)) / 2.0);
        }
    }
}
