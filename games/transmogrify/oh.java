/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh extends wf {
    int field_k;
    static uh field_h;
    boolean field_i;
    int[] field_g;
    static int field_j;

    final static boolean a(byte param0, oa param1) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var2 = param1.d((byte) 101);
        if (param0 > -20) {
          L0: {
            var4 = null;
            boolean discarded$6 = oh.a((byte) 95, (oa) null);
            if (var2 != 1) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          var3 = stackIn_8_0;
          return var3 != 0;
        } else {
          L1: {
            if (var2 != 1) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          var3 = stackIn_4_0;
          return var3 != 0;
        }
    }

    oh() {
        ((oh) this).field_i = false;
    }

    public static void a(byte param0) {
        field_h = null;
        if (param0 < 83) {
            oh.a((byte) 68);
        }
    }

    static {
    }
}
