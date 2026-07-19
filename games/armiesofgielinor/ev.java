/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ev implements ok {
    static String field_e;
    static int field_d;
    static boolean field_b;
    static int field_a;
    static int field_c;

    public static void a(int param0) {
        int[] discarded$0 = null;
        if (param0 != 960112080) {
            vh var2 = (vh) null;
            discarded$0 = ev.a((vh) null, (byte) 105);
            field_e = null;
            return;
        }
        field_e = null;
    }

    final static int[] a(vh param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int[] stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_11_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2_int = param0.k(param1 ^ -98);
            if (var2_int != 0) {
              var3 = new int[var2_int];
              var4 = 0;
              L1: while (true) {
                L2: {
                  if (var4 >= var2_int) {
                    if (param1 == -98) {
                      break L2;
                    } else {
                      ev.a(4);
                      break L2;
                    }
                  } else {
                    var3[var4] = param0.k(0);
                    var4++;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      continue L1;
                    }
                  }
                }
                stackOut_11_0 = (int[]) (var3);
                stackIn_12_0 = stackOut_11_0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var2);
            stackOut_13_1 = new StringBuilder().append("ev.D(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        return stackIn_12_0;
    }

    public void a(int param0, int param1, int param2) {
        if (param1 != -32263) {
            return;
        }
        ra.a(param2, param1 ^ -9688, param0);
    }

    final static int b(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var3 = param2 >> 960112080;
        if (param0 >= -33) {
          field_e = (String) null;
          var4 = 65535 & param2;
          var5 = param1 >> 568410800;
          var6 = param1 & 65535;
          return var5 * var4 + param1 * var3 + (var6 * var4 >> -1272601136);
        } else {
          var4 = 65535 & param2;
          var5 = param1 >> 568410800;
          var6 = param1 & 65535;
          return var5 * var4 + param1 * var3 + (var6 * var4 >> -1272601136);
        }
    }

    static {
        field_d = -1;
        field_e = "Join <%0>'s game";
        field_a = 0;
        field_c = 0;
    }
}
