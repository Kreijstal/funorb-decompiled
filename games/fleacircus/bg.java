/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg {
    static String field_a;
    static String field_b;

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = fleas.field_A ? 1 : 0;
        if (param2 >= 85) {
          var3 = 0;
          var4 = rb.field_H;
          L0: while (true) {
            if (var3 >= fb.field_d.length) {
              return -1;
            } else {
              var5 = m.field_c[var3];
              if (0 > var5) {
                var4 = var4 + cm.field_f;
                var3++;
                continue L0;
              } else {
                var6 = se.a(3, fb.field_d[var3], true);
                var7 = af.field_b + -(var6 >> 415806849);
                var4 = var4 + id.field_c;
                if (lh.a(var4, hb.field_t - -(ge.field_h << -193903167), var6 - -(ae.field_c << -1829352159), true, var7 + -ae.field_c, param0, param1)) {
                  return var5;
                } else {
                  var4 = var4 + ((ge.field_h << 1145314849) - (-id.field_c - hb.field_t));
                  var3++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return -18;
        }
    }

    final static void a(byte param0, java.awt.Canvas param1) {
        if (11 == bh.field_t) {
            pl.d(64);
        }
        se.a(qj.field_I, (byte) 121, rj.field_m, wa.field_l);
        be.a(0, param1, (byte) -68, 0);
        if (param0 >= -12) {
            Object var3 = null;
            bg.a((hi) null, 112, 66);
        }
    }

    public static void b(byte param0) {
        field_b = null;
        field_a = null;
        if (param0 != -120) {
            mk discarded$0 = bg.a((byte) 91);
        }
    }

    final static dd[] a(String param0, rh param1, byte param2, String param3) {
        if (param2 != 7) {
            return null;
        }
        int var4 = param1.a(param3, (byte) -100);
        int var5 = param1.a(param0, (byte) -15, var4);
        return w.a(-37, var5, var4, param1);
    }

    final static mk a(byte param0) {
        if (!(cb.field_v != ql.field_l)) {
            throw new IllegalStateException();
        }
        if (ui.field_ob == cb.field_v) {
            cb.field_v = ql.field_l;
            return rl.field_b;
        }
        if (param0 == 56) {
            return null;
        }
        Object var2 = null;
        bg.a((hi) null, -4, -17);
        return null;
    }

    final static void a(hi param0, int param1, int param2) {
        bf.field_e.a(false, (lh) (Object) param0);
        if (param2 > -37) {
            return;
        }
        sc.a(param1, param0, 1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Checking";
        field_a = "Please check if address is correct";
    }
}
