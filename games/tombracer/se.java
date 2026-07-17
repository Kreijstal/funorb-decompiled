/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se extends wv {
    static int[] field_s;
    static String field_r;
    static String field_q;

    final static void f() {
        tga.field_a.f(8, 16384);
    }

    final static void d() {
        String var2 = null;
        if (!(null == wra.field_b)) {
            var2 = wra.field_b;
            String var1 = var2;
            int discarded$0 = 15165;
            wja.a(gl.a((byte) 86, mu.field_Bb, new String[1]));
            wra.field_b = null;
        }
    }

    final void a(byte param0, boolean param1) {
        if (!(param1)) {
            return;
        }
        la.field_j.a(0, 0);
        gg.field_f.a((aaa.a(false) - gg.field_f.d()) / 2, (koa.b(0) + -gg.field_f.b()) / 2);
        oka.a(so.field_L.toUpperCase(), 2431750, qr.field_v, -1, 60 + (koa.b(param0 + 28) - gg.field_f.b()) / 2, aaa.a(false) / 2, -1);
        int discarded$0 = be.a(hl.field_i, 1, kn.field_p, 2431750, 20, 200, 1, -100 + koa.b(param0 + 28) / 2, aaa.a(false) / 2 + -150, -1, (byte) 60, 300);
        super.a(param0, param1);
    }

    public static void e() {
        int var1 = 0;
        field_q = null;
        field_s = null;
        field_r = null;
    }

    final int a(int param0, byte param1) {
        if (param1 != -48) {
          field_q = null;
          return ((se) this).a((byte) 117, param0) + ((se) this).field_m[param0].e(-163);
        } else {
          return ((se) this).a((byte) 117, param0) + ((se) this).field_m[param0].e(-163);
        }
    }

    final int a(byte param0, int param1) {
        if (param0 <= 111) {
          field_r = null;
          return aaa.a(false) - ((se) this).field_m[param1].e(-163) >> 1;
        } else {
          return aaa.a(false) - ((se) this).field_m[param1].e(-163) >> 1;
        }
    }

    se(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = new int[]{0};
        field_q = "Disruptive behaviour";
        field_r = "<%0> has left.";
    }
}
