/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ir extends tm {
    static int field_D;
    static String field_B;
    static String field_C;
    static int[] field_A;

    final li a(byte param0, li[] param1) {
        if (param0 != 84) {
            field_B = null;
            return new li(mi.a(true));
        }
        return new li(mi.a(true));
    }

    final static void a(boolean param0, int param1) {
        L0: {
          if (eq.a(false)) {
            param0 = false;
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 == 16355) {
          ti.a(63, param0);
          if (gs.field_b) {
            on.g(ni.field_l.field_b.field_s, ni.field_l.field_b.field_J, ni.field_l.field_b.field_q, ni.field_l.field_b.field_mb);
            ni.field_l.field_b.a(122, param0);
            gp.a(param0, (byte) -93);
            return;
          } else {
            gp.a(param0, (byte) -93);
            return;
          }
        } else {
          ir.a(false, 111);
          ti.a(63, param0);
          if (!gs.field_b) {
            gp.a(param0, (byte) -93);
            return;
          } else {
            on.g(ni.field_l.field_b.field_s, ni.field_l.field_b.field_J, ni.field_l.field_b.field_q, ni.field_l.field_b.field_mb);
            ni.field_l.field_b.a(122, param0);
            gp.a(param0, (byte) -93);
            return;
          }
        }
    }

    public static void a(boolean param0) {
        field_A = null;
        field_C = null;
        field_B = null;
        if (param0) {
            ir.a(false, -68);
        }
    }

    ir(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(float param0, int param1, float param2, float param3, float param4, float param5, float param6) {
        if (rq.field_D == null) {
          vg.field_Bb = new gq();
          rq.field_D = new dp((lq) (Object) vg.field_Bb);
          pi.field_b.a((lq) (Object) rq.field_D);
          qd.field_c = new tf();
          rq.field_D.a(param5);
          rq.field_D.f(param4);
          rq.field_D.c(param0);
          if (param1 <= -10) {
            rq.field_D.b(param6);
            rq.field_D.e(param3);
            rq.field_D.d(param2);
            return;
          } else {
            field_A = null;
            rq.field_D.b(param6);
            rq.field_D.e(param3);
            rq.field_D.d(param2);
            return;
          }
        } else {
          if (null == vg.field_Bb) {
            vg.field_Bb = new gq();
            rq.field_D = new dp((lq) (Object) vg.field_Bb);
            pi.field_b.a((lq) (Object) rq.field_D);
            qd.field_c = new tf();
            rq.field_D.a(param5);
            rq.field_D.f(param4);
            rq.field_D.c(param0);
            if (param1 <= -10) {
              rq.field_D.b(param6);
              rq.field_D.e(param3);
              rq.field_D.d(param2);
              return;
            } else {
              field_A = null;
              rq.field_D.b(param6);
              rq.field_D.e(param3);
              rq.field_D.d(param2);
              return;
            }
          } else {
            if (null == qd.field_c) {
              vg.field_Bb = new gq();
              rq.field_D = new dp((lq) (Object) vg.field_Bb);
              pi.field_b.a((lq) (Object) rq.field_D);
              qd.field_c = new tf();
              rq.field_D.a(param5);
              rq.field_D.f(param4);
              rq.field_D.c(param0);
              if (param1 <= -10) {
                rq.field_D.b(param6);
                rq.field_D.e(param3);
                rq.field_D.d(param2);
                return;
              } else {
                field_A = null;
                rq.field_D.b(param6);
                rq.field_D.e(param3);
                rq.field_D.d(param2);
                return;
              }
            } else {
              rq.field_D.a(param5);
              rq.field_D.f(param4);
              rq.field_D.c(param0);
              if (param1 <= -10) {
                rq.field_D.b(param6);
                rq.field_D.e(param3);
                rq.field_D.d(param2);
                return;
              } else {
                field_A = null;
                rq.field_D.b(param6);
                rq.field_D.e(param3);
                rq.field_D.d(param2);
                return;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "create new auction";
        field_C = "Change display name";
        field_A = new int[8192];
    }
}
