/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df extends le {
    static af field_j;
    boolean field_k;
    static int field_i;
    static boolean field_h;
    static boolean field_l;

    final static boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 1) {
          L0: {
            field_l = false;
            if (gl.field_E.a(117)) {
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
            if (gl.field_E.a(117)) {
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

    public static void c(int param0) {
        if (param0 != -24231) {
            return;
        }
        field_j = null;
    }

    final static vn[] a(byte param0, String param1, String param2, dj param3) {
        int var4 = 0;
        int var5 = 0;
        if (param0 != 24) {
          field_l = true;
          var4 = param3.a(param1, (byte) 8);
          var5 = param3.a(var4, param2, true);
          return an.a(var4, var5, 127, param3);
        } else {
          var4 = param3.a(param1, (byte) 8);
          var5 = param3.a(var4, param2, true);
          return an.a(var4, var5, 127, param3);
        }
    }

    df() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new af();
        field_i = 1;
        field_h = true;
    }
}
