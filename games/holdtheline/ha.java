/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ha extends hl implements hd {
    int field_q;
    static Random field_n;
    float field_m;
    static uf[] field_o;
    static int[][] field_j;
    ha field_s;
    boolean field_r;
    boolean field_l;
    static int field_p;
    static uf field_i;
    static va field_k;

    final static void a(boolean param0) {
        qj.field_N[61] = 27;
        qj.field_N[47] = 73;
        qj.field_N[222] = 58;
        qj.field_N[192] = 28;
        qj.field_N[520] = 59;
        qj.field_N[91] = 42;
        qj.field_N[59] = 57;
        qj.field_N[44] = 71;
        qj.field_N[93] = 43;
        qj.field_N[92] = 74;
        qj.field_N[45] = 26;
        qj.field_N[46] = 72;
        if (param0) {
            Object var2 = null;
            float discarded$0 = ha.a((qm) null, (qm) null, true);
        }
    }

    public static void a(int param0) {
        field_o = null;
        field_j = null;
        field_i = null;
        if (param0 < 29) {
            field_i = null;
        }
        field_k = null;
        field_n = null;
    }

    final static StringBuilder a(char param0, byte param1, int param2, StringBuilder param3) {
        int var5 = 0;
        int var6 = HoldTheLine.field_D;
        int var4 = param3.length();
        param3.setLength(param2);
        for (var5 = var4; var5 < param2; var5++) {
            param3.setCharAt(var5, param0);
        }
        if (param1 != -83) {
            return null;
        }
        return param3;
    }

    final static float a(qm param0, qm param1, boolean param2) {
        if (param2) {
            return -0.9188363552093506f;
        }
        return (float)Math.atan2((double)(param0.field_f - param1.field_f), (double)(-param0.field_h + param1.field_h));
    }

    ha(boolean param0, float param1) {
        ((ha) this).field_s = null;
        ((ha) this).field_l = false;
        ((ha) this).field_q = 0;
        ((ha) this).field_r = param0 ? true : false;
        ((ha) this).field_m = param1;
    }

    public final int a(byte param0, hd param1) {
        if (param0 != -101) {
            ((ha) this).field_l = true;
        }
        ha var3 = (ha) (Object) param1;
        if (!(var3.field_m >= var3.field_m)) {
            return -1;
        }
        if (var3.field_m >= var3.field_m) {
            return 0;
        }
        return 1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new Random();
    }
}
