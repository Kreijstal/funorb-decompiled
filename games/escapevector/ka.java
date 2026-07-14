/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ka {
    static ed field_a;
    static hh field_e;
    static int[] field_b;
    static int[] field_c;
    static int[] field_d;

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        fn var3 = null;
        ed var4 = null;
        int var5 = 0;
        int var6 = 0;
        fn var7 = null;
        int var8 = EscapeVector.field_A;
        if (!(dj.field_d == null)) {
            return;
        }
        if (param0 <= 48) {
            return;
        }
        dj.field_d = new fn[sc.field_h.length];
        for (var1 = 0; var1 < sc.field_h.length; var1++) {
            var2 = sc.field_h[var1];
            var3 = ph.field_b;
            var4 = k.a(var2, (byte) -39, 2);
            var5 = var4.field_A - var3.field_c;
            var6 = -var3.field_b + var4.field_z;
            var7 = new fn(var5, var6);
            dj.field_d[var1] = rc.a(var2, (byte) 121, var7, var3);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0, int param1, int param2, int param3, DataInputStream param4, int[] param5, byte param6, int param7) throws IOException {
        int var8 = 0;
        int var9 = 0;
        int var10 = EscapeVector.field_A;
        if (0 == param1) {
            return;
        }
        if (1 == param1) {
            var8 = -(1 << param0) + (2 << -1 + param3);
            for (var9 = param7; param2 > var9; var9++) {
                param5[var9] = lb.a(param5[var9], var8);
            }
            return;
        }
        if (param6 != -74) {
            ka.a(1);
        } else {
            bf.a(param7, param2, param4, param0, param3, param5, 2147483647);
            return;
        }
        bf.a(param7, param2, param4, param0, param3, param5, 2147483647);
    }

    public static void a(byte param0) {
        field_c = null;
        field_d = null;
        int var1 = 23 % ((param0 - 60) / 46);
        field_b = null;
        field_a = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[17];
        field_d = new int[17];
        field_b[2] = 500;
        field_b[14] = 4000;
        field_b[16] = 4000;
        field_d[1] = 1000;
        field_b[4] = 500;
        field_b[15] = 4000;
        field_b[0] = 1000;
        field_b[6] = 2000;
        field_b[3] = 500;
        field_b[5] = 500;
        field_b[7] = 2000;
        field_d[10] = 1000;
        field_d[11] = 1000;
        field_d[13] = 1000;
        field_d[12] = 1000;
        field_d[5] = 500;
        field_d[9] = 1000;
    }
}
