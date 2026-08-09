/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa {
    static String field_b;
    static int field_a;

    final static boolean a(byte param0) {
        int var1;
        var1 = 116 / ((16 - param0) / 34);
        if (10 <= ff.field_e) {
          if (fc.field_a < 13) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = EscapeVector.field_A;
        try {
          L0: {
            var2_int = param1.charAt(0);
            var3 = param0;
            L1: while (true) {
              if (param1.length() <= var3) {
                stackIn_9_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param1.charAt(var3) != var2_int) {
                  stackIn_6_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var2);

            stackIn_12_1 = new StringBuilder().append("aa.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    public static void b(byte param0) {
        if (param0 != -96) {
            String var2 = (String) null;
            aa.a(-12, (String) null);
            field_b = null;
            return;
        }
        field_b = null;
    }

    static {
        field_b = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
