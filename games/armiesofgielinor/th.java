/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th {
    static int field_c;
    static ko[] field_b;
    static int field_a;

    final static boolean a(js param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param1 == -17900) {
              var2_int = 0;
              L1: while (true) {
                if (param0.field_x <= var2_int) {
                  stackIn_12_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (param0.field_D[var2_int] > 50) {
                    stackIn_9_0 = 1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var2_int++;
                    continue L1;
                  }
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var2);

            stackIn_15_1 = new StringBuilder().append("th.A(");

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
          throw ig.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    public static void a(byte param0) {
        if (param0 < 32) {
            return;
        }
        field_b = null;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = param2 - param1 & param0 >> 2092116319;
        return var3 + ((param0 >>> -685991521) + param0) % param2;
    }

    static {
        int var0 = 0;
        field_b = new ko[255];
        for (var0 = 0; field_b.length > var0; var0++) {
            field_b[var0] = new ko();
        }
    }
}
