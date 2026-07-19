/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ge {
    static int field_c;
    static dl field_d;
    static String field_a;
    static db field_b;

    public static void a(int param0) {
        field_d = null;
        if (param0 > -101) {
            field_d = (dl) null;
            field_b = null;
            field_a = null;
            return;
        }
        field_b = null;
        field_a = null;
    }

    final static boolean b(int param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_2_0 = 0;
        var1_ref = uf.field_c;
        synchronized (var1_ref) {
          L0: {
            if (ah.field_g != td.field_d) {
              L1: {
                if (param0 <= -1) {
                  break L1;
                } else {
                  field_a = (String) null;
                  break L1;
                }
              }
              pj.field_q = re.field_o[td.field_d];
              c.field_p = tp.field_i[td.field_d];
              td.field_d = td.field_d - -1 & 127;
              stackOut_6_0 = 1;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        }
        return stackIn_7_0 != 0;
    }

    final static void a(byte param0) {
        cb.a(1148, le.b((byte) -20));
        if (param0 > -3) {
            ge.a((byte) -27);
        }
    }

    static {
    }
}
