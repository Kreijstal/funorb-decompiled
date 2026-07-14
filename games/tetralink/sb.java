/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb {
    static byte[] field_b;
    static ah field_a;
    static String field_c;

    final static boolean a(byte param0, String param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 2) {
          L0: {
            sb.a((byte) 126);
            if (null == fh.a(-32055, param1)) {
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
            if (null == fh.a(-32055, param1)) {
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

    public static void a(byte param0) {
        Object var2 = null;
        field_c = null;
        field_a = null;
        if (param0 != -30) {
          var2 = null;
          boolean discarded$2 = sb.a((byte) 65, (String) null);
          field_b = null;
          return;
        } else {
          field_b = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new byte[]{(byte)2};
        field_c = "You cannot chat to <%0> because <%0> is offline in your friend list.";
    }
}
