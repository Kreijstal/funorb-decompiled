/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf {
    static String field_a;

    final static boolean a(int param0, int param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param1 != -2626) {
          L0: {
            tf.a((byte) -118);
            if (0 == (2048 & param2)) {
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
            if (0 == (2048 & param2)) {
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

    public final String toString() {
        throw new IllegalStateException();
    }

    final static bo a(ki param0, byte param1, int param2, int param3, ki param4) {
        if (k.a(param4, param3, param2, -23046)) {
          if (param1 >= -11) {
            return null;
          } else {
            return vo.a(false, param0.a((byte) 94, param3, param2));
          }
        } else {
          return null;
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != 17) {
            boolean discarded$0 = tf.a(-5, -49, 114);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "OK";
    }
}
