/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w {
    static int[] field_i;
    static String field_c;
    static int field_h;
    static String field_l;
    static String field_m;
    static String[] field_k;
    static int[] field_d;
    static qp field_b;
    static eb[] field_a;
    static String field_e;
    static String field_g;
    static int[][] field_j;
    static dd field_f;

    public static void a(int param0) {
        field_i = null;
        field_g = null;
        field_m = null;
        field_d = null;
        field_f = null;
        field_l = null;
        field_j = null;
        field_a = null;
        field_e = null;
        field_b = null;
        field_c = null;
        field_k = null;
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (!((param1 & 7) == 0)) {
            var2 = 8 - (param1 & 7);
        }
        int var3 = param1 - -var2;
        if (param0 != 8) {
            return -16;
        }
        return var3;
    }

    final static void a(int param0, int param1, int param2) {
        ad.field_u = param0;
        m.field_f = param2;
        int var3 = 62 % ((59 - param1) / 59);
    }

    final static boolean a(boolean param0, CharSequence param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var4 = Pool.field_O;
        try {
          L0: {
            if (p.a(param1, (byte) -113, param0)) {
              var3_int = 0;
              L1: while (true) {
                if (var3_int >= param1.length()) {
                  stackOut_12_0 = 1;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  if (!uc.a(param1.charAt(var3_int), (byte) -51)) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0 != 0;
                  } else {
                    var3_int++;
                    continue L1;
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("w.D(").append(param0).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + -37 + 41);
        }
        return stackIn_13_0 != 0;
    }

    final static tc a(boolean param0, int param1) {
        tc var2 = new tc(param1, param0);
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "<%0> are <%2>.";
        field_i = new int[]{1, 1, 1, 1, 1, 2, 2, 3, 3, 3, 32, 32, 34, 53, 68, 69, 69, 69, 73, 73, 83, 83, 83, 92, 97, 99};
        field_l = "Cancel unrated rematch";
        field_d = new int[]{12, 20, 21, 49, 6, 7};
        field_m = "Quick Chat Help";
        field_e = "<%0> and <%1> have resigned!";
        field_g = "<%0><br>versus<br><%1>";
    }
}
