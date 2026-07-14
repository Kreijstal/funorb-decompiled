/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ta {
    private jp[] field_b;
    static int field_f;
    static String field_a;
    static oe[] field_e;
    static mf field_g;
    static String field_d;
    static String field_c;

    final static jp b(int param0) {
        int var1 = 0;
        fb var3 = null;
        int[] var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] var11 = null;
        int[] var13 = null;
        int[] var15 = null;
        int[] var17 = null;
        byte[] var18 = null;
        int[] var19 = null;
        byte[] var20 = null;
        int[] var21 = null;
        L0: {
          var7 = BrickABrac.field_J ? 1 : 0;
          if (param0 == 13874) {
            break L0;
          } else {
            ta.a(-46);
            break L0;
          }
        }
        L1: {
          var1 = jh.field_b[0] * gg.field_t[0];
          var18 = cn.field_a[0];
          if (tm.field_b[0]) {
            var20 = bj.field_S[0];
            var21 = new int[var1];
            var17 = var21;
            var13 = var17;
            var11 = var13;
            var5 = var11;
            var6 = 0;
            L2: while (true) {
              if (var6 >= var1) {
                var3 = new fb(cf.field_d, ek.field_db, ag.field_K[0], dl.field_d[0], jh.field_b[0], gg.field_t[0], var21);
                break L1;
              } else {
                var5[var6] = ud.d(qp.field_c[ik.a((int) var18[var6], 255)], ik.a(-16777216, var20[var6] << -339543976));
                var6++;
                continue L2;
              }
            }
          } else {
            var19 = new int[var1];
            var15 = var19;
            var8 = var15;
            var5_int = 0;
            L3: while (true) {
              if (var5_int >= var1) {
                var3 = (fb) (Object) new jp(cf.field_d, ek.field_db, ag.field_K[0], dl.field_d[0], jh.field_b[0], gg.field_t[0], var19);
                break L1;
              } else {
                var8[var5_int] = qp.field_c[ik.a((int) var18[var5_int], 255)];
                var5_int++;
                continue L3;
              }
            }
          }
        }
        ee.d((byte) 96);
        return (jp) (Object) var3;
    }

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        field_g = null;
        if (param0 != 0) {
            return;
        }
        field_a = null;
        field_e = null;
    }

    void a(int param0, int param1, int param2, boolean param3, int param4) {
        if (param3) {
            ta.a(true, false);
        }
        nh.a(param0, param1, -40, param2, ((ta) this).field_b, param4);
    }

    final static void a(boolean param0, boolean param1) {
        if (param1) {
            return;
        }
        if (!(m.a(2))) {
            return;
        }
        if (!(!param0)) {
            lb.d(0, 0, lb.field_c, lb.field_d, 0, 192);
        }
        wo.field_b.a(0, 0, 0);
    }

    ta(jp[] param0) {
        ((ta) this).field_b = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new oe[16];
        field_d = "Some players haven't unlocked the currently selected game options.<br>Please view the '<%0>' tab on the left for details.";
        field_a = "You need to play 1 more rated game to unlock this option.";
        field_c = "Disruptive behaviour";
    }
}
