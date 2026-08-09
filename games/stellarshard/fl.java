/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    static String field_c;
    static dd field_b;
    static int[] field_d;
    static int field_a;

    final static boolean a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = stellarshard.field_B;
        try {
          L0: {
            var2_int = param0.charAt(0);
            var3 = 1;
            L1: while (true) {
              if (var3 >= param0.length()) {
                if (param1 == 19) {
                  stackIn_12_0 = 1;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_10_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                if ((param0.charAt(var3) ^ -1) == (var2_int ^ -1)) {
                  var3++;
                  continue L1;
                } else {
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var2);

            stackIn_15_1 = new StringBuilder().append("fl.B(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        int var1 = 99 % ((param0 - -57) / 50);
        field_d = null;
    }

    static {
        field_c = "Loading...";
        field_d = new int[8192];
    }
}
