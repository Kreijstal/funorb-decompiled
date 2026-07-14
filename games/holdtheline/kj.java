/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class kj extends rd {
    static String field_o;
    static hj field_q;
    private int field_m;
    static boolean field_r;
    static hj field_p;
    static String field_n;

    final static int b(int param0, int param1) {
        if (param0 != 2) {
            field_o = null;
        }
        return rf.a(param1, in.field_c, -1);
    }

    public static void a(byte param0) {
        field_o = null;
        field_q = null;
        if (param0 <= 96) {
            kj.a((byte) 21);
        }
        field_n = null;
        field_p = null;
    }

    final void a(int[] param0, int param1, byte param2, int[] param3) {
        int var6 = 0;
        int var7 = HoldTheLine.field_D;
        int[] var9 = new int[param0.length + param3.length];
        int[] var14 = var9;
        int[] var13 = var14;
        int[] var12 = var13;
        int[] var11 = var12;
        int[] var5 = var11;
        for (var6 = 0; param0.length > var6; var6++) {
            var9[var6] = param0[var6];
        }
        int var10 = 0;
        var6 = var10;
        if (param2 >= -49) {
            Object var8 = null;
            ((kj) this).a((int[]) null, 1, (byte) -32, (int[]) null);
        }
        while (param3.length / 2 > var10) {
            var5[param0.length - -(2 * var10)] = param3[param3.length - (2 + 2 * var10)];
            var5[1 + var10 * 2 + param0.length] = param3[param3.length + -1 + -(2 * var10)];
            var10++;
        }
        gf.a(var14, ((kj) this).field_m);
    }

    kj(int param0, int param1) {
        ((kj) this).field_c = param0 / 2;
        ((kj) this).field_i = 2;
        ((kj) this).field_h = -((kj) this).field_c + param0;
        ((kj) this).field_k = 40.0f;
        ((kj) this).field_m = param1;
    }

    final static boolean a(int param0, qm param1, qm param2, ei param3) {
        int var5 = 0;
        ei var6 = null;
        int var7 = 0;
        lb var8 = null;
        int var9 = HoldTheLine.field_D;
        lb var10 = new lb(param2, param1, 0, false, true);
        if (param0 != 140) {
            field_o = null;
        }
        for (var5 = 0; var5 < param3.field_e; var5++) {
            var6 = (ei) param3.field_b[var5];
            for (var7 = 0; var7 < var6.field_e; var7++) {
                var8 = (lb) var6.field_b[var7];
                if (th.a(param0 + -141, var10, var8)) {
                    return true;
                }
            }
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Waiting for music";
        field_n = "<%0> unlocked!";
        field_p = new hj(540, 140);
    }
}
