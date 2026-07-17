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
            RuntimeException var4_ref2 = null;
            ba var5 = null;
            sl var5_ref = null;
            ba stackIn_3_0 = null;
            sl stackIn_5_0 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            ba stackOut_2_0 = null;
            sl stackOut_4_0 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
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
                return stackIn_3_0;
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4_ref = decompiledCaughtException;
                var5_ref = new sl();
                ((ba) (Object) var5_ref).a(param1, param2, param3, -119);
                stackOut_4_0 = (sl) var5_ref;
                stackIn_5_0 = stackOut_4_0;
                return (ba) (Object) stackIn_5_0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L1: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var4_ref2;
                stackOut_6_1 = new StringBuilder().append("ub.D(").append(param0).append(44).append(param1).append(44);
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param2 == null) {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L1;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L1;
                }
              }
              throw la.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param3 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean b(boolean param0) {
        return uj.field_i > 250;
    }

    public static void a(boolean param0) {
        field_d = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Play free version";
        field_c = "Name is available";
    }
}
