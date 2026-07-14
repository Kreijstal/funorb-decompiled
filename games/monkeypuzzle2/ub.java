/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub {
    static String field_d;
    static int field_b;
    static String field_c;
    static boolean field_a;

    final static void a(int param0) {
        if (param0 != 250) {
            field_d = null;
        }
    }

    final static ba a(byte param0, int param1, java.awt.Component param2, int param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            ba var5 = null;
            sl var5_ref = null;
            ba stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            ba stackOut_2_0 = null;
            try {
              L0: {
                if (param0 < -46) {
                  break L0;
                } else {
                  ub.a(-125);
                  break L0;
                }
              }
              var4 = Class.forName("hg");
              var5 = (ba) var4.newInstance();
              var5.a(param1, param2, param3, -103);
              stackOut_2_0 = (ba) var5;
              stackIn_3_0 = stackOut_2_0;
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_3_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    final static boolean b(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (!param0) {
          L0: {
            field_b = 104;
            if (uj.field_i <= 250) {
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
            if (uj.field_i <= 250) {
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

    public static void a(boolean param0) {
        field_d = null;
        field_c = null;
        if (param0) {
            boolean discarded$0 = ub.b(true);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Play free version";
        field_c = "Name is available";
    }
}
