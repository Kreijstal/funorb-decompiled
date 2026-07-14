/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh {
    static String field_d;
    static String field_e;
    static fi field_b;
    static String field_a;
    static String[] field_c;

    final static void a(int param0, hn param1, byte param2) {
        mi var5 = uh.field_Wb;
        var5.j(param0, 120);
        var5.field_u = var5.field_u + 1;
        if (param2 != 81) {
            return;
        }
        int var4 = var5.field_u;
        var5.f(1, param2 ^ 57);
        if (null != param1.field_p) {
            var5.f(param1.field_p.length, -47);
            var5.a(0, -10140, param1.field_p, param1.field_p.length);
            int discarded$0 = var5.c(var4, -2);
            var5.field_u = var5.field_u - 4;
            param1.field_q = var5.b(true);
            var5.b((byte) 20, var5.field_u - var4);
            return;
        }
        var5.f(0, param2 ^ 36);
        int discarded$1 = var5.c(var4, -2);
        var5.field_u = var5.field_u - 4;
        param1.field_q = var5.b(true);
        var5.b((byte) 20, var5.field_u - var4);
    }

    final static void a(byte param0) {
        gp var1 = null;
        int var2 = 0;
        var2 = Vertigo2.field_L ? 1 : 0;
        dg.field_d = null;
        if (param0 == -22) {
          sq.field_b = 0;
          vd.field_a = 0;
          tm.field_a.c(0);
          vj.field_d.c(0);
          var1 = se.field_A.b(-125);
          L0: while (true) {
            if (var1 == null) {
              var1 = jn.field_g.b(param0 ^ 106);
              L1: while (true) {
                if (var1 == null) {
                  ba.field_d = 0;
                  return;
                } else {
                  var1.a(-128);
                  var1 = jn.field_g.a((byte) -60);
                  continue L1;
                }
              }
            } else {
              var1.a(-111);
              var1 = se.field_A.a((byte) -60);
              continue L0;
            }
          }
        } else {
          field_a = null;
          sq.field_b = 0;
          vd.field_a = 0;
          tm.field_a.c(0);
          vj.field_d.c(0);
          var1 = se.field_A.b(-125);
          L2: while (true) {
            if (var1 == null) {
              var1 = jn.field_g.b(param0 ^ 106);
              L3: while (true) {
                if (var1 == null) {
                  ba.field_d = 0;
                  return;
                } else {
                  var1.a(-128);
                  var1 = jn.field_g.a((byte) -60);
                  continue L3;
                }
              }
            } else {
              var1.a(-111);
              var1 = se.field_A.a((byte) -60);
              continue L2;
            }
          }
        }
    }

    public static void b(byte param0) {
        field_d = null;
        if (param0 != 41) {
            lh.b((byte) 70);
            field_a = null;
            field_e = null;
            field_b = null;
            field_c = null;
            return;
        }
        field_a = null;
        field_e = null;
        field_b = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "You are RED";
        field_e = "Respect";
        field_a = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
    }
}
