/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql extends oh {
    static bi[] field_o;
    int field_l;
    int field_m;
    int field_k;
    ql field_h;
    int field_i;
    static pf field_p;
    int field_j;
    static nq field_n;
    static volatile int field_q;

    final static void a(byte param0, String[] param1) {
        int var4 = 0;
        String var5 = null;
        sq var6 = null;
        sq var6_ref = null;
        int var7 = ShatteredPlansClient.field_F ? 1 : 0;
        vc.field_c = param1;
        if (param0 != 50) {
            return;
        }
        if (0 == vc.field_c.length) {
            mf.field_q = null;
            return;
        }
        um.field_k = 0;
        tp.b((byte) 93);
        dm var9 = new dm();
        sq var3 = nd.a((byte) -106);
        while (var3 != null) {
            var9.a(false, (Object) (Object) var3);
            var3 = nd.a((byte) 118);
        }
        mf.field_q = new sq[var9.field_g];
        for (var4 = 0; var4 < var9.field_g; var4++) {
            mf.field_q[var4] = (sq) var9.field_b[var4];
        }
        int var8 = 0;
        var4 = var8;
        while (var9.field_g - 1 > var8) {
            var5 = mf.field_q[var8].field_d;
            var6 = var5 != null ? n.a(var5, -21502) : null;
            if (var6 == null) {
                if (!(mf.field_q[var8].field_r)) {
                    var6_ref = mf.field_q[var8 - -1];
                }
            }
            mf.field_q[var8].field_l = var6_ref;
            var8++;
        }
    }

    final static void a(int param0) {
        gm var1 = null;
        int var2 = ShatteredPlansClient.field_F ? 1 : 0;
        aj.field_e.e();
        hg.field_q.e();
        if (param0 != -26848) {
            ql.a((byte) 108);
        }
        dp.field_u = dp.field_u - 1;
        if (!(dp.field_u != 0)) {
            dp.field_u = 200;
            var1 = (gm) (Object) eo.field_ab.d(param0 ^ -26848);
            while (var1 != null) {
                if (!(var1.field_n.c(2048))) {
                    var1.b((byte) -108);
                }
                var1 = (gm) (Object) eo.field_ab.a((byte) -71);
            }
            if (!(nc.field_v == null)) {
                var1 = (gm) (Object) nc.field_v.d(0);
                while (var1 != null) {
                    if (!(var1.field_n.c(2048))) {
                        var1.b((byte) -84);
                    }
                    var1 = (gm) (Object) nc.field_v.a((byte) -71);
                }
            }
        }
        if (jh.field_B != null) {
            if (jh.field_B.h(5309)) {
            }
        }
    }

    final static void a(java.awt.Frame param0, int param1, qb param2) {
        pb var3 = null;
        int var4 = 0;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        L0: while (true) {
          var3 = param2.a(param0, (byte) 127);
          L1: while (true) {
            if (var3.field_d != 0) {
              if ((var3.field_d ^ -1) == -2) {
                if (param1 == 0) {
                  param0.setVisible(false);
                  param0.dispose();
                  return;
                } else {
                  return;
                }
              } else {
                jb.a((byte) -93, 100L);
                continue L0;
              }
            } else {
              jb.a((byte) -94, 10L);
              continue L1;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_p = null;
        field_o = null;
        if (param0 > -46) {
            field_o = null;
        }
        field_n = null;
    }

    ql(int param0, int param1, int param2, int param3, int param4) {
        ((ql) this).field_m = param2;
        ((ql) this).field_j = param3;
        ((ql) this).field_l = param4;
        ((ql) this).field_i = param0;
        ((ql) this).field_k = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new pf();
        field_q = 0;
    }
}
