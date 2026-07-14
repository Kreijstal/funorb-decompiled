/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh {
    byte field_s;
    byte field_k;
    boolean field_a;
    byte field_c;
    boolean field_m;
    boolean field_p;
    boolean field_o;
    byte field_n;
    boolean field_l;
    byte field_b;
    static al[] field_g;
    boolean field_i;
    short field_t;
    int field_h;
    boolean field_f;
    byte field_j;
    byte field_r;
    int field_q;
    boolean field_d;
    int field_e;

    public static void a(int param0) {
        field_g = null;
        if (param0 > -72) {
            field_g = (al[]) null;
        }
    }

    final static boolean a(int param0, kc param1, double param2, kc param3) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 < 59) {
          L0: {
            field_g = (al[]) null;
            if (param2 * param2 <= lc.a(param3, false, param1)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (param2 * param2 <= lc.a(param3, false, param1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    private uh() throws Throwable {
        throw new Error();
    }

    static {
    }
}
