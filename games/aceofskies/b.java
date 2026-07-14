/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b {
    static nf field_b;
    static hc field_c;
    static int field_a;

    final static boolean a(boolean param0, rb param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var2 = param1.g(119);
        if (!param0) {
          L0: {
            field_b = (nf) null;
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

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        if (param0 != 28) {
            int discarded$0 = b.a(75, (byte) -109, false, 57);
        }
    }

    final static boolean b(byte param0) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 <= -41) {
          L0: {
            if (ml.field_p) {
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L0;
            } else {
              if (!cn.b(true)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                return true;
              }
            }
          }
          return stackIn_7_0 != 0;
        } else {
          return false;
        }
    }

    final static int a(int param0, byte param1, boolean param2, int param3) {
        if (param1 != 72) {
            b.a((byte) 89);
            return de.a((byte) 92);
        }
        return de.a((byte) 92);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new nf();
        field_a = 2;
    }
}
