/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class th {
    static int[] field_c;
    static String field_b;
    static boolean field_d;
    static boolean[] field_a;

    public static void a(boolean param0) {
        field_c = null;
        field_b = null;
        if (param0) {
            field_d = false;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static int b(byte param0) {
        if (param0 <= 48) {
            return 114;
        }
        return new Date().getYear() - -1900;
    }

    final static void a(int param0, int param1, byte[] param2, int[] param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = Kickabout.field_G;
        for (var5 = param0; qe.field_b.length > var5; var5++) {
            param4 = qe.field_b[var5];
            var6 = var5 << -763129436;
            while (true) {
                param4--;
                if (0 == param4) {
                    break;
                }
                var6++;
                param1 = nb.field_e[var6];
                param3[param2[param1]] = param3[param2[param1]] + 1;
                nb.field_e[param3[param2[param1]]] = param1;
            }
            var5++;
        }
    }

    final static void a(byte param0) {
        int var3 = Kickabout.field_G;
        int var2 = -16 % ((param0 - 22) / 35);
        gn var1 = pn.field_z.g(24009);
        while (var1 instanceof wh) {
            ((wh) (Object) var1).b(112);
            var1 = var1.field_d;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_c = new int[]{498, 408, 448, 598};
        field_d = false;
        field_a = new boolean[73];
        field_b = "Loading beach";
        for (var0 = 0; field_a.length > var0; var0++) {
            field_a[var0] = false;
        }
        field_a[16] = true;
        field_a[25] = true;
        field_a[43] = true;
        field_a[31] = true;
        field_a[70] = true;
        field_a[12] = true;
    }
}
