/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r {
    static int field_c;
    static int field_a;
    static String field_b;

    final static void b(int param0) {
        int var3 = -76 % ((param0 - 21) / 44);
        int var1 = qh.field_c * qh.field_c;
        int var2 = -(oh.field_b * oh.field_b) + var1;
        int var4 = var2 * (qo.field_o + -wa.field_i) / var1 + wa.field_i;
        ui.field_i.a(var4, 120, ho.field_c, 256, 640);
        jp.a(-24 + qo.field_o, (byte) 116, 640, hd.field_q, 5, 0, v.field_c);
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        int var4 = 0;
        jh.field_O.b(param1, param0);
        if (param3 == -40) {
          if (param2) {
            L0: {
              var4 = qk.field_e % jh.field_O.field_F * 2;
              if (jh.field_O.field_F <= var4) {
                var4 = jh.field_O.field_F + (-var4 + jh.field_O.field_F);
                break L0;
              } else {
                break L0;
              }
            }
            if (10 > var4) {
              var4 = 10;
              uf.a(0, 80, 30, jh.field_O, param1, 0, var4, param0, (byte) -113);
              return;
            } else {
              if (-40 + jh.field_O.field_F < var4) {
                var4 = jh.field_O.field_F - 40;
                uf.a(0, 80, 30, jh.field_O, param1, 0, var4, param0, (byte) -113);
                return;
              } else {
                uf.a(0, 80, 30, jh.field_O, param1, 0, var4, param0, (byte) -113);
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != -31558) {
            r.a(48);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(int param0, int param1) {
        pc var2 = aa.field_f;
        var2.g(param1, param0 ^ 15514);
        var2.field_m = var2.field_m + 1;
        int var3 = var2.field_m;
        var2.e(160, 2);
        var2.a(qm.field_J.length, 0, -3493, qm.field_J);
        var2.e(160, ib.field_a);
        var2.e(160, mg.field_i);
        var2.a(k.field_k.length, param0, -3493, k.field_k);
        var2.f(var2.field_m - var3, -1);
    }

    static {
        field_b = "Confirm Password: ";
    }
}
