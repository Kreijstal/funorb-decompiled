/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cp extends kj {
    private int field_m;
    private int field_n;
    private int field_k;
    private int field_o;
    private int field_p;
    private int field_l;
    private int field_j;
    static String field_i;
    static String field_h;
    private int field_g;

    public static void b(int param0) {
        field_h = null;
        field_i = null;
        if (param0 != 2092666604) {
            Object var2 = null;
            int discarded$0 = cp.a(-67, 118, -41, -44, -77, (double[][]) null, (int[]) null);
        }
    }

    final void a(int param0, int param1, byte param2) {
        int var4 = ((cp) this).field_n * param1 >> 12;
        int var5 = param0 * ((cp) this).field_g >> 12;
        int var6 = param1 * ((cp) this).field_k >> 12;
        int var7 = param0 * ((cp) this).field_m >> 12;
        int var8 = param1 * ((cp) this).field_l >> 12;
        int var9 = ((cp) this).field_p * param0 >> 12;
        int var10 = param1 * ((cp) this).field_j >> 12;
        if (param2 != 106) {
            ((cp) this).field_g = -74;
        }
        int var11 = param0 * ((cp) this).field_o >> 12;
        qh.a(var10, 7503, var4, var11, var5, var6, var7, var9, ((cp) this).field_c, var8);
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 <= 7) {
            ((cp) this).a(-123, 3, -45);
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param2 >= -101) {
            ((cp) this).a(-52, -40, -79);
        }
    }

    cp(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        super(-1, param8, param9);
        ((cp) this).field_l = param4;
        ((cp) this).field_g = param1;
        ((cp) this).field_k = param2;
        ((cp) this).field_n = param0;
        ((cp) this).field_j = param6;
        ((cp) this).field_m = param3;
        ((cp) this).field_o = param7;
        ((cp) this).field_p = param5;
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, double[][] param5, int[] param6) {
        double var7_double = 0.0;
        RuntimeException var7 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var13 = Torquing.field_u;
        try {
          L0: {
            var7_double = param5[param1][param3];
            var9 = 0;
            L1: while (true) {
              if (param0 <= var9) {
                L2: {
                  if (param2 < -19) {
                    break L2;
                  } else {
                    field_h = null;
                    break L2;
                  }
                }
                var9 = 0;
                L3: while (true) {
                  if (param4 <= var9) {
                    var9 = param6[param1];
                    param6[param1] = param3;
                    stackOut_13_0 = var9;
                    stackIn_14_0 = stackOut_13_0;
                    break L0;
                  } else {
                    L4: {
                      if (var9 == param1) {
                        break L4;
                      } else {
                        var10 = param5[var9][param3];
                        var12 = 0;
                        L5: while (true) {
                          if (var12 >= param0) {
                            break L4;
                          } else {
                            param5[var9][var12] = param5[var9][var12] - var10 * param5[param1][var12];
                            var12++;
                            continue L5;
                          }
                        }
                      }
                    }
                    var9++;
                    continue L3;
                  }
                }
              } else {
                param5[param1][var9] = param5[param1][var9] / var7_double;
                var9++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var7 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var7;
            stackOut_15_1 = new StringBuilder().append("cp.E(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param5 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          L7: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param6 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
        return stackIn_14_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Torquing";
        field_h = "Email is valid";
    }
}
