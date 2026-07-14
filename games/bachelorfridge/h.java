/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h extends td {
    static du field_p;

    final static void c(byte param0) {
        sja.field_fb.c(95, (byte) 104);
        if (param0 != -69) {
            Object var2 = null;
            h.a((uha) null, -126);
        }
    }

    public static void d(byte param0) {
        if (param0 != 45) {
            return;
        }
        field_p = null;
    }

    final ii a(op param0, int param1) {
        aga var3 = null;
        cv var4 = null;
        if (param1 != 3) {
          return null;
        } else {
          var3 = ((h) this).field_h.a(118, param0);
          var4 = new cv(((h) this).field_g, new nq(var3));
          var4.field_o.a((bw) (Object) new iv(new nq(var3), false, 1, 0, 43), true);
          return (ii) (Object) var4;
        }
    }

    final static void a(uha param0, int param1) {
        uha var2 = null;
        int var3 = 0;
        var3 = BachelorFridge.field_y;
        param0.a(false);
        if (param1 == 0) {
          var2 = (uha) (Object) uma.field_M.b((byte) 90);
          L0: while (true) {
            if (var2 != null) {
              if (var2.a(param1 ^ -7, param0)) {
                var2 = (uha) (Object) uma.field_M.c(0);
                continue L0;
              } else {
                L1: {
                  if (var2 != null) {
                    nr.a((byte) 106, (bw) (Object) var2, (bw) (Object) param0);
                    break L1;
                  } else {
                    uma.field_M.a((bw) (Object) param0, true);
                    break L1;
                  }
                }
                return;
              }
            } else {
              L2: {
                if (var2 != null) {
                  nr.a((byte) 106, (bw) (Object) var2, (bw) (Object) param0);
                  break L2;
                } else {
                  uma.field_M.a((bw) (Object) param0, true);
                  break L2;
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    h(int param0, aga param1) {
        super(param0, param1);
    }

    final static boolean a(int param0, boolean param1, ue param2, int param3, String param4, String param5, String param6) {
        if (tn.field_a != ola.field_p) {
            return false;
        }
        tea var9 = new tea(gja.field_m, param2);
        int var8 = -49 / ((-8 - param3) / 56);
        gja.field_m.a((wj) (Object) var9, (byte) 86);
        if (kk.d((byte) 77)) {
            var9.r(-7);
        } else {
            ola.field_p = kq.field_j;
            pma.field_k = param1 ? true : false;
            sc.field_n = param5;
            sg.field_p = null;
            wj.field_i = param4;
            em.field_V = param6;
            fga.field_f = param0;
            return true;
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new du(11, 0, 1, 2);
    }
}
