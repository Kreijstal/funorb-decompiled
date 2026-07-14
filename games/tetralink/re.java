/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re extends ae {
    static String field_S;
    static String field_Q;
    static java.security.SecureRandom field_R;
    static String field_P;
    static String field_T;

    final void b(int param0, int param1, int param2, int param3) {
        ((re) this).field_N = !((re) this).field_N ? true : false;
        super.b(param0, param1, param2, param3);
    }

    re(String param0, dn param1, boolean param2) {
        this(param0, param1);
        ((re) this).field_N = param2 ? true : false;
    }

    final static void d(boolean param0) {
        qa.b((byte) 53);
        if (!(uh.field_b == null)) {
            oa.a((byte) -128, uh.field_b);
        }
        rl.b(-9648);
        jl.a(109);
        bm.a(-25676);
        if (!param0) {
            re.e((byte) -39);
            if (!(!wm.c(-14688))) {
                nd.field_Lb.f(1, (byte) -92);
                ak.a((byte) -86, 0);
            }
            mk.a(false);
            return;
        }
        if (!(!wm.c(-14688))) {
            nd.field_Lb.f(1, (byte) -92);
            ak.a((byte) -86, 0);
        }
        mk.a(false);
    }

    final static boolean a(byte param0, int param1) {
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 >= -84) {
          return true;
        } else {
          L0: {
            if ((-param1 & param1) != param1) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void a(int param0) {
        field_R = null;
        field_S = null;
        field_Q = null;
        field_T = null;
        if (param0 != 0) {
            return;
        }
        field_P = null;
    }

    private re(String param0, dn param1) {
        this(param0, dh.field_q.field_n, param1);
        ((re) this).field_H = dh.field_q.field_x;
    }

    final static void e(byte param0) {
        int var1 = 0;
        gd var2 = null;
        int var3 = 0;
        L0: {
          var3 = TetraLink.field_J;
          kl.field_a = false;
          qe.field_a = null;
          qb.field_N = null;
          if (gl.field_p != null) {
            gl.field_p.b(1);
            gl.field_p = null;
            break L0;
          } else {
            break L0;
          }
        }
        db.field_a = null;
        if (null == jl.field_a) {
          L1: {
            db.field_e = null;
            var1 = 39 / ((param0 - 14) / 42);
            if (ui.field_d != null) {
              ui.field_d.b(1);
              ui.field_d = null;
              break L1;
            } else {
              break L1;
            }
          }
          dg.field_g = null;
          if (null != db.field_a) {
            var2 = (gd) (Object) db.field_a.b(-104);
            L2: while (true) {
              if (var2 == null) {
                db.field_a = null;
                return;
              } else {
                var2.e(0);
                var2 = (gd) (Object) db.field_a.d(-1);
                continue L2;
              }
            }
          } else {
            return;
          }
        } else {
          L3: {
            jl.field_a.b(1);
            jl.field_a = null;
            db.field_e = null;
            var1 = 39 / ((param0 - 14) / 42);
            if (ui.field_d != null) {
              ui.field_d.b(1);
              ui.field_d = null;
              break L3;
            } else {
              break L3;
            }
          }
          dg.field_g = null;
          if (null != db.field_a) {
            var2 = (gd) (Object) db.field_a.b(-104);
            L4: while (true) {
              if (var2 == null) {
                db.field_a = null;
                return;
              } else {
                var2.e(0);
                var2 = (gd) (Object) db.field_a.d(-1);
                continue L4;
              }
            }
          } else {
            return;
          }
        }
    }

    private re(String param0, kg param1, dn param2) {
        super(param0, param1, param2);
        ((re) this).field_H = dh.field_q.field_x;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_S = "Remove friend";
        field_Q = "Add name";
        field_T = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
