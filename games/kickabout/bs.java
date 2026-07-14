/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bs extends RuntimeException {
    Throwable field_e;
    static np field_c;
    static sr field_a;
    String field_d;
    static int field_f;
    static String field_b;

    final static void a(int param0) {
        id.field_s.a(true, -(ui.field_t ? 40 + (2 + (oe.field_f - -2)) : 0) + mc.field_d.field_q, param0, 0, 18);
        ck.field_c.a(true, oe.field_f + 42, -40 + (-2 + -oe.field_f + mc.field_d.field_q), 0, 18);
        bf.field_u.a(2, param0 ^ 118, mc.field_d.field_mb + -20, 20, 0, mc.field_d.field_q, oe.field_f);
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 > -50) {
            bs.a((byte) 40);
            field_c = null;
            field_a = null;
            return;
        }
        field_c = null;
        field_a = null;
    }

    final static ut[] a(ut[] param0, byte param1) {
        int var2 = 0;
        ut var3_ref_ut = null;
        int var4 = Kickabout.field_G;
        for (var2 = 0; param0.length > var2; var2++) {
            var3_ref_ut = param0[var2];
            param0[var2].field_n = 0;
            var3_ref_ut.field_s = 0;
            param0[var2].field_o = param0[var2].field_q;
            param0[var2].field_v = param0[var2].field_w;
        }
        int var3 = 45 % ((param1 - -62) / 35);
        return param0;
    }

    final static void a(int param0, int param1, int param2) {
        Object var4 = null;
        if (param1 != 0) {
          var4 = null;
          ut[] discarded$2 = bs.a((ut[]) null, (byte) 5);
          tb.field_s = param0;
          ta.field_A = param2;
          return;
        } else {
          tb.field_s = param0;
          ta.field_A = param2;
          return;
        }
    }

    bs(Throwable param0, String param1) {
        ((bs) this).field_d = param1;
        ((bs) this).field_e = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "This is your auction.";
        field_a = (sr) (Object) new qi();
    }
}
