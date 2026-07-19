/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se extends wv {
    static int[] field_s;
    static String field_r;
    static String field_q;

    final static void f(byte param0) {
        tga.field_a.f(8, 16384);
        if (param0 != -6) {
            field_r = (String) null;
        }
    }

    final static void d(byte param0) {
        String var1 = null;
        String var2 = null;
        L0: {
          if (null != wra.field_b) {
            var2 = wra.field_b;
            var1 = var2;
            wja.a(gl.a((byte) 86, mu.field_Bb, new String[]{var2}), param0 + 15047);
            wra.field_b = null;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 118) {
          field_q = (String) null;
          return;
        } else {
          return;
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

    public static void e(byte param0) {
        int var1 = -61 % ((65 - param0) / 47);
        field_q = null;
        field_s = null;
        field_r = null;
    }

    final int a(int param0, byte param1) {
        if (param1 != -48) {
          field_q = (String) null;
          return this.a((byte) 117, param0) + this.field_m[param0].e(-163);
        } else {
          return this.a((byte) 117, param0) + this.field_m[param0].e(-163);
        }
    }

    final int a(byte param0, int param1) {
        if (param0 <= 111) {
          field_r = (String) null;
          return aaa.a(false) - this.field_m[param1].e(-163) >> -1739940575;
        } else {
          return aaa.a(false) - this.field_m[param1].e(-163) >> -1739940575;
        }
    }

    se(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    static {
        field_s = new int[]{0};
        field_q = "Disruptive behaviour";
        field_r = "<%0> has left.";
    }
}
