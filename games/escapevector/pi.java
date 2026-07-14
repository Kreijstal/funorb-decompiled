/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi extends hg {
    boolean field_h;
    oc field_i;
    static ed field_j;
    int field_q;
    hl field_o;
    int field_n;
    int field_m;
    int field_l;
    int field_p;
    int field_g;
    int field_k;
    int field_r;

    public static void a(byte param0) {
        field_j = null;
        int var1 = -26 / ((param0 - 26) / 58);
    }

    final static boolean a(int param0, String param1, String param2) {
        String var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        param2 = ca.a(-1, '_', param2, "");
        var3 = na.a(param2, false);
        if (param0 < -77) {
          if (0 == param1.indexOf(param2)) {
            if (0 != param1.indexOf(var3)) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          field_j = null;
          if (0 != param1.indexOf(param2)) {
            return true;
          } else {
            L0: {
              if (0 == param1.indexOf(var3)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    pi() {
    }

    static {
    }
}
