/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc {
    static ri field_c;
    static ja[] field_b;
    static String field_a;
    static String field_d;

    final static boolean a(String param0, String param1, String param2, int param3, int param4, fe param5, boolean param6) {
        tf var8 = null;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (mp.field_b == id.field_B) {
          if (param4 == -10663) {
            var8 = new tf(nb.field_a, param5);
            nb.field_a.b(param4 ^ -8815, (cf) (Object) var8);
            if (!sd.h(3853)) {
              L0: {
                iq.field_c = null;
                mc.field_g = param2;
                am.field_a = param0;
                if (!param6) {
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                } else {
                  stackOut_13_0 = 1;
                  stackIn_15_0 = stackOut_13_0;
                  break L0;
                }
              }
              ab.field_k = stackIn_15_0 != 0;
              id.field_B = dj.field_k;
              rj.field_J = param3;
              ch.field_j = param1;
              return true;
            } else {
              var8.p(param4 ^ -10591);
              return true;
            }
          } else {
            field_b = null;
            var8 = new tf(nb.field_a, param5);
            nb.field_a.b(param4 ^ -8815, (cf) (Object) var8);
            if (!sd.h(3853)) {
              L1: {
                iq.field_c = null;
                mc.field_g = param2;
                am.field_a = param0;
                if (!param6) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L1;
                }
              }
              ab.field_k = stackIn_8_0 != 0;
              id.field_B = dj.field_k;
              rj.field_J = param3;
              ch.field_j = param1;
              return true;
            } else {
              var8.p(param4 ^ -10591);
              return true;
            }
          }
        } else {
          return false;
        }
    }

    public static void a(byte param0) {
        if (param0 != -52) {
            return;
        }
        field_b = null;
        field_d = null;
        field_a = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Click here to close help.";
        field_d = "Cloak your zombies in pure fear. Humans will run from them above all else, falling right into your clutches.";
    }
}
