/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gp extends tk implements wg {
    static k field_L;
    private sk field_N;
    static String field_Q;
    static String field_M;
    static String field_P;
    static int field_K;
    private int field_O;

    public final sk a(int param0) {
        if (param0 != -10116) {
            field_K = -4;
            return ((gp) this).field_N;
        }
        return ((gp) this).field_N;
    }

    gp(String param0, ca param1, int param2) {
        super(param0, param1, param2);
    }

    final void a(int param0, gm param1, int param2, int param3) {
        super.a(-73, param1, param2, param3);
        ((gp) this).field_O = -((gp) this).field_w + n.field_t + -param3;
        int var5 = -91 % ((param0 - -28) / 43);
    }

    final String b(int param0) {
        if (((gp) this).field_s) {
          if (((gp) this).field_n != null) {
            bm.a(k.field_e, (byte) 113, -((gp) this).field_O + (((gp) this).field_p + n.field_t));
            if (param0 != 0) {
              return null;
            } else {
              return ((gp) this).field_n;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final void l(int param0) {
        int var2 = 0;
        super.l(100);
        var2 = -94 / ((-17 - param0) / 63);
        if (null != ((gp) this).field_N) {
          ((gp) this).field_N.a(true);
          return;
        } else {
          return;
        }
    }

    final void a(sk param0, int param1) {
        ((gp) this).field_N = param0;
        if (param1 <= 74) {
            gp.j((byte) 91);
        }
    }

    public static void k(byte param0) {
        field_L = null;
        field_M = null;
        field_P = null;
        if (param0 <= 113) {
            field_K = -13;
            field_Q = null;
            return;
        }
        field_Q = null;
    }

    final static void j(byte param0) {
        dc.field_a.h(6);
        if (param0 != -34) {
          L0: {
            field_P = null;
            if (d.field_r == null) {
              d.field_r = new sp(dc.field_a, bi.field_u);
              break L0;
            } else {
              break L0;
            }
          }
          dc.field_a.a((gm) (Object) d.field_r, (byte) 112);
          return;
        } else {
          L1: {
            if (d.field_r == null) {
              d.field_r = new sp(dc.field_a, bi.field_u);
              break L1;
            } else {
              break L1;
            }
          }
          dc.field_a.a((gm) (Object) d.field_r, (byte) 112);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = new k(8, 0, 4, 1);
        field_Q = "to return to the normal view.";
        field_M = "Next";
        field_P = "Exit fullscreen mode";
    }
}
