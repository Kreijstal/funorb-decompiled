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
        if (param0 < 9) {
            return;
        }
        field_j = (int[][]) null;
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
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var4 = Pool.field_O;
        try {
          L0: {
            if (p.a(param1, (byte) -113, param0)) {
              if (param2 == -37) {
                var3_int = 0;
                L1: while (true) {
                  if (var3_int >= param1.length()) {
                    stackOut_14_0 = 1;
                    stackIn_15_0 = stackOut_14_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (!uc.a(param1.charAt(var3_int), (byte) -51)) {
                      stackOut_11_0 = 0;
                      stackIn_12_0 = stackOut_11_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      var3_int++;
                      continue L1;
                    }
                  }
                }
              } else {
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var3);
            stackOut_16_1 = new StringBuilder().append("w.D(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L2;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0 != 0;
            } else {
              return stackIn_15_0 != 0;
            }
          }
        }
    }

    final static tc a(boolean param0, int param1) {
        tc var2 = new tc(param1, param0);
        return var2;
    }

    static {
        field_c = "<%0> are <%2>.";
        field_i = new int[]{1, 1, 1, 1, 1, 2, 2, 3, 3, 3, 32, 32, 34, 53, 68, 69, 69, 69, 73, 73, 83, 83, 83, 92, 97, 99};
        field_l = "Cancel unrated rematch";
        field_d = new int[]{12, 20, 21, 49, 6, 7};
        field_m = "Quick Chat Help";
        field_e = "<%0> and <%1> have resigned!";
        field_g = "<%0><br>versus<br><%1>";
    }
}
