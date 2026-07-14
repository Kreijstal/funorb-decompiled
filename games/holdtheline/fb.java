/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb extends hl {
    int[] field_r;
    int field_t;
    int field_u;
    static String field_l;
    int field_j;
    long field_m;
    static ah field_n;
    int field_p;
    int field_o;
    static ll field_s;
    int field_q;
    static gn field_i;
    int field_k;

    public static void a(boolean param0) {
        field_i = null;
        field_l = null;
        field_n = null;
        field_s = null;
        if (!param0) {
            field_n = null;
        }
    }

    final static float a(ei param0, byte param1) {
        int var3 = 0;
        int var4 = HoldTheLine.field_D;
        float var2 = 0.0f;
        if (param1 <= 14) {
            fb.a(false);
        }
        for (var3 = 0; var3 < param0.field_e; var3++) {
            var2 = var2 + ((wc) param0.field_b[var3]).f(50);
        }
        return var2;
    }

    fb(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        ((fb) this).field_p = param3;
        ((fb) this).field_k = param5;
        mi.field_b = mi.field_b + 1;
        ((fb) this).field_u = 65535 & mi.field_b;
        ((fb) this).field_t = param1;
        ((fb) this).field_o = param4;
        ((fb) this).field_j = param0;
        ((fb) this).field_q = param2;
        ((fb) this).field_r = param6;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "to over <%0> great games";
        field_s = new ll();
    }
}
