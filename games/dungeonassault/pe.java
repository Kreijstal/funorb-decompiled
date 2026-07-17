/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe extends ne {
    static fd field_j;
    static String field_k;
    static String field_n;
    static String field_i;
    static rk field_l;
    static String field_o;
    static String[] field_m;

    public static void a(int param0) {
        if (param0 != 9) {
          pe.a(39);
          field_n = null;
          field_i = null;
          field_l = null;
          field_o = null;
          field_j = null;
          field_m = null;
          field_k = null;
          return;
        } else {
          field_n = null;
          field_i = null;
          field_l = null;
          field_o = null;
          field_j = null;
          field_m = null;
          field_k = null;
          return;
        }
    }

    final static cn[] a(int param0, int param1, int param2, int param3) {
        cn[] var5 = null;
        cn[] var6 = null;
        var6 = new cn[9];
        var5 = var6;
        cn dupTemp$4 = bl.a(false, param0, 1);
        var6[6] = dupTemp$4;
        var5[3] = dupTemp$4;
        var5[2] = dupTemp$4;
        var5[1] = dupTemp$4;
        var5[0] = dupTemp$4;
        cn dupTemp$5 = bl.a(false, param3, 1);
        var6[8] = dupTemp$5;
        var5[7] = dupTemp$5;
        var5[5] = dupTemp$5;
        if (param1 != 0) {
          var6[4] = bl.a(false, param1, 64);
          return var5;
        } else {
          return var5;
        }
    }

    final static boolean a(CharSequence param0, char param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            if (il.a(true, param1)) {
              if (param0 == null) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              } else {
                var3_int = param0.length();
                if (var3_int < 12) {
                  var4 = 0;
                  if (!jc.a(param1, -101)) {
                    stackOut_15_0 = 1;
                    stackIn_16_0 = stackOut_15_0;
                    break L0;
                  } else {
                    if (0 == var3_int) {
                      stackOut_13_0 = 0;
                      stackIn_14_0 = stackOut_13_0;
                      return stackIn_14_0 != 0;
                    } else {
                      return true;
                    }
                  }
                } else {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0 != 0;
                }
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3;
            stackOut_17_1 = new StringBuilder().append("pe.B(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L1;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L1;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param1 + 44 + -105 + 41);
        }
        return stackIn_16_0 != 0;
    }

    private pe() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "A large, wolf-like creature with brown-black hair and horns.";
        field_j = new fd(3);
        field_n = "ACCEPT";
        field_i = "Select a raider to enchant with additional Defence";
    }
}
