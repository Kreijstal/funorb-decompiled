/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud extends gg {
    int field_l;
    qi field_h;
    static int[] field_i;
    gg field_m;
    static String field_j;
    static int field_k;

    public static void a(int param0) {
        if (param0 != 5010) {
            field_k = -79;
            field_j = null;
            field_i = null;
            return;
        }
        field_j = null;
        field_i = null;
    }

    final static void a(byte param0, lc param1, int param2) {
        int var4 = 0;
        jd var5 = null;
        var5 = id.field_c;
        var5.e(param2, -2147483648);
        var5.field_m = var5.field_m + 1;
        var4 = var5.field_m;
        var5.c(-102, 1);
        var5.c(106, param1.field_n);
        var5.a(param1.field_o, (byte) 98);
        var5.b(param1.field_q, false);
        var5.b(param1.field_r, false);
        var5.b(param1.field_j, false);
        var5.b(param1.field_i, false);
        int discarded$47 = var5.b(true, var4);
        var5.b(1, -var4 + var5.field_m);
        if (param0 >= -105) {
          field_k = -109;
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, String param1) {
        vc.field_c = param1;
        h.a(12, true);
        if (param0 != 11692) {
            Object var3 = null;
            ud.a((byte) 27, (lc) null, -57);
        }
    }

    ud(qi param0, gg param1) {
        ((ud) this).field_h = param0;
        ((ud) this).field_l = param0.e();
        ((ud) this).field_m = param1;
        ((ud) this).field_h.h(128 + ((ud) this).field_l * wc.field_a >> 1828752584);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "FINAL<br>SCORE";
    }
}
