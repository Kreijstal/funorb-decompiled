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
            int[] var2 = (int[]) null;
            cp.a(-67, 118, -41, -44, -77, (double[][]) null, (int[]) null);
        }
    }

    final void a(int param0, int param1, byte param2) {
        int var4 = this.field_n * param1 >> -1803631060;
        int var5 = param0 * this.field_g >> 459677452;
        int var6 = param1 * this.field_k >> 800781612;
        int var7 = param0 * this.field_m >> 2092666604;
        int var8 = param1 * this.field_l >> 293845516;
        int var9 = this.field_p * param0 >> 516529196;
        int var10 = param1 * this.field_j >> -1849527732;
        if (param2 != 106) {
            this.field_g = -74;
        }
        int var11 = param0 * this.field_o >> 790401356;
        qh.a(var10, 7503, var4, var11, var5, var6, var7, var9, this.field_c, var8);
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 <= 7) {
            this.a(-123, 3, -45);
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param2 >= -101) {
            this.a(-52, -40, -79);
        }
    }

    cp(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        super(-1, param8, param9);
        this.field_l = param4;
        this.field_g = param1;
        this.field_k = param2;
        this.field_n = param0;
        this.field_j = param6;
        this.field_m = param3;
        this.field_o = param7;
        this.field_p = param5;
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, double[][] param5, int[] param6) {
        double[] dupTemp$2 = null;
        double[] dupTemp$3 = null;
        double var7_double = 0.0;
        RuntimeException var7 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
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
                    field_h = (String) null;
                    break L2;
                  }
                }
                var9 = 0;
                L3: while (true) {
                  if (param4 <= var9) {
                    var9 = param6[param1];
                    param6[param1] = param3;
                    stackIn_14_0 = var9;
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
                            dupTemp$2 = param5[var9];
                            dupTemp$2[var12] = dupTemp$2[var12] - var10 * param5[param1][var12];
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
                dupTemp$3 = param5[param1];
                dupTemp$3[var9] = dupTemp$3[var9] / var7_double;
                var9++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var7 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var7);

            stackIn_17_1 = new StringBuilder().append("cp.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param6 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L7;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L7;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
        return stackIn_14_0;
    }

    static {
        field_i = "Torquing";
        field_h = "Email is valid";
    }
}
