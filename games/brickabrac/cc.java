/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc extends af {
    static String field_F;
    static int field_H;
    static int[] field_I;
    static int field_J;
    static boolean field_G;

    cc() {
        super(9, oc.field_y);
        ((cc) this).field_t = pl.field_b;
    }

    final static void f(int param0) {
        qa.e((byte) -95);
        int discarded$0 = 1;
        bd.a(4);
    }

    final boolean a(int param0, byte param1) {
        if (param1 != 38) {
          cc.a(-57, true, false, -49);
          return uo.a(param0, (byte) 47, ((cc) this).field_t);
        } else {
          return uo.a(param0, (byte) 47, ((cc) this).field_t);
        }
    }

    final static void a(int param0, boolean param1, boolean param2, int param3) {
        int var4 = si.field_l + nn.field_g.c(nn.field_f);
        op.a(1, qi.field_K, var4, 6, ud.field_w, !param2 ? 196 : 256, -5 + -ud.field_w + param0);
        lb.a(ol.field_v);
        lb.d(qi.field_K[0].field_D + -1, gp.field_d.field_db + (-ud.field_w + -qi.field_K[0].field_C), 1 - (-var4 - -qi.field_K[0].field_D), -qi.field_K[0].field_C + gp.field_d.field_db);
        nn.field_g.c(nn.field_f, qi.field_K[0].field_D + 1, -5 + -qi.field_K[6].field_C + (gp.field_d.field_db - -2), !param1 ? 1 : 0, -1, !param2 ? 196 : 256);
        if (param3 > -105) {
            field_I = null;
        } else {
            lb.b(ol.field_v);
            return;
        }
        lb.b(ol.field_v);
    }

    public static void g(int param0) {
        field_I = null;
        if (param0 != 6) {
            cc.g(49);
            field_F = null;
            return;
        }
        field_F = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "Find opponent";
        field_I = new int[8192];
    }
}
