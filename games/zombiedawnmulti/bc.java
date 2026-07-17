/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc {
    static int field_e;
    static String field_b;
    static String field_a;
    static String field_d;
    static String field_c;

    final static void b() {
        gi.field_i = null;
    }

    public static void c() {
        field_b = null;
        field_d = null;
        field_c = null;
        field_a = null;
    }

    final static void a(int param0, int param1, byte param2, boolean param3) {
        int var4 = 0;
        L0: {
          er.field_j.g(param0, param1);
          if (param3) {
            L1: {
              var4 = fn.field_c % er.field_j.field_x * 2;
              if (var4 < er.field_j.field_x) {
                break L1;
              } else {
                var4 = er.field_j.field_x + -var4 + er.field_j.field_x;
                break L1;
              }
            }
            L2: {
              if (var4 < 10) {
                var4 = 10;
                break L2;
              } else {
                if (-40 + er.field_j.field_x < var4) {
                  var4 = -40 + er.field_j.field_x;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            ij.a(param1, 30, 0, param0, false, var4, 0, er.field_j, 80);
            break L0;
          } else {
            break L0;
          }
        }
    }

    final static void a(byte param0) {
        int discarded$0 = -78;
        iq.a();
        ok.field_l = ah.field_e.a(we.field_g[12]);
        int var1 = ah.field_e.a(we.field_g[13]);
        if (!(var1 <= ok.field_l)) {
            ok.field_l = var1;
        }
        ((ho) (Object) mj.field_Hb[1]).c((byte) 74);
        if (param0 < 8) {
            bc.a((byte) -52);
        }
    }

    final static ri[] a() {
        int var2 = 0;
        int var3 = ZombieDawnMulti.field_E ? 1 : 0;
        ri[] var1 = new ri[qc.field_v];
        for (var2 = 0; var2 < qc.field_v; var2++) {
            var1[var2] = new ri(ie.field_nb, hj.field_a, k.field_i[var2], qj.field_o[var2], oq.field_w[var2], vj.field_p[var2], qp.field_t[var2], tp.field_t);
        }
        fd.h((byte) 125);
        return var1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Public chat is unavailable while setting up a rated game.";
        field_b = "Loading fonts";
        field_a = "Waiting for graphics";
        field_c = "Play free version";
    }
}
