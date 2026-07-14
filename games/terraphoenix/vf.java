/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf {
    static String field_b;
    static o field_c;
    static int field_a;

    final static boolean a(pl param0, String param1, boolean param2, int param3, boolean param4, String param5, String param6) {
        tj var7 = null;
        tj var8 = null;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        if (og.field_a != qe.field_f) {
          return false;
        } else {
          var8 = new tj(jl.field_I, param0);
          var7 = var8;
          jl.field_I.a((gl) (Object) var8, (byte) -1);
          if (!param4) {
            if (!va.b(41108)) {
              L0: {
                wl.field_Q = null;
                oe.field_a = param1;
                ra.field_m = param5;
                cg.field_H = param6;
                if (!param2) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L0;
                }
              }
              nf.field_c = stackIn_10_0 != 0;
              qe.field_f = ua.field_d;
              wf.field_q = param3;
              return true;
            } else {
              var8.q(127);
              return true;
            }
          } else {
            return true;
          }
        }
    }

    public static void a(int param0) {
        Object var2 = null;
        field_c = null;
        if (param0 != 29227) {
          var2 = null;
          String discarded$2 = vf.a((String) null, (String) null, (fa) null, (String) null, 121);
          field_b = null;
          return;
        } else {
          field_b = null;
          return;
        }
    }

    final static void a(String param0, int param1) {
        uc.b(121, param0);
        ta.a(fh.field_x, false, 10);
        if (param1 < 7) {
            field_a = 60;
        }
    }

    final static String a(String param0, String param1, fa param2, String param3, int param4) {
        if (!(param2.a(param4 ^ param4))) {
            return param3;
        }
        return param1 + " - " + param2.b(param4 + -4708, param0) + "%";
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Discard";
        field_c = new o();
    }
}
