/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ee {
    static boolean field_b;
    static boolean field_a;

    final static String a(char param0, String param1, String param2, int param3) {
        int var8_int = 0;
        int var10 = 0;
        int var11 = ZombieDawnMulti.field_E ? 1 : 0;
        int var4 = param2.length();
        int var5 = param1.length();
        int var6 = var4;
        int var7 = var5 - 1;
        if (-1 != var7) {
            var8_int = 0;
            while (true) {
                var8_int = param2.indexOf((int) param0, var8_int);
                if (-1 > var8_int) {
                    break;
                }
                var8_int++;
                var6 = var6 + var7;
            }
        }
        StringBuilder var8 = new StringBuilder(var6);
        int var9 = 0;
        while (true) {
            var10 = param2.indexOf((int) param0, var9);
            if (-1 < (var10 ^ -1)) {
                break;
            }
            StringBuilder discarded$0 = var8.append(param2.substring(var9, var10));
            StringBuilder discarded$1 = var8.append(param1);
            var9 = var10 - -1;
        }
        if (param3 > -36) {
            return null;
        }
        StringBuilder discarded$2 = var8.append(param2.substring(var9));
        return var8.toString();
    }

    final static fc a(byte[] param0, boolean param1) {
        int var6 = 0;
        int var7 = ZombieDawnMulti.field_E ? 1 : 0;
        int var2 = 90000;
        int var3 = 10;
        int var4 = 0;
        byte[] var5 = new byte[param0.length + 12];
        nn.a(-107, 0, var5, ql.a(param1, 0, param0));
        nn.a(-124, 1, var5, var4);
        nn.a(-101, 2, var5, var2);
        nn.a(-113, 3, var5, var3);
        for (var6 = 1; var6 < param0.length / 4; var6++) {
            nn.a(-115, 3 + var6, var5, ql.a(true, var6, param0));
        }
        return nn.a(-93, var5);
    }

    final static boolean a(boolean param0, boolean param1) {
        // ifnull L9
        // goto L26
        wp.field_g = ok.field_m.a(tm.field_c, jo.field_b, (byte) -120);
        // if_icmpne L40
        return false;
    }

    final static lm a(int param0, int param1, int param2, boolean param3) {
        if (!param3) {
            field_b = false;
        }
        if (19 == param0) {
            return null;
        }
        return (lm) (Object) new od(param2, param1, param0);
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, boolean param5, boolean param6, int param7, boolean param8, int param9, int param10, boolean param11, int param12, boolean param13) {
        ui.field_j = null;
        no.c((byte) 75);
        param8 = ih.a(param10, 4, param3, param2, param7, param8, param4);
        el.a(param9, param13, param12, 2, param8, param0, param6, param2, param5, param11);
        if (!param1) {
            ee.a(-102, true, -123, -91, -93, false, false, -65, false, 82, -99, true, 54, true);
        }
        bg.a(param12, (byte) 101, param6);
        ig.a((byte) -114, param12, param8, param7);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
    }
}
