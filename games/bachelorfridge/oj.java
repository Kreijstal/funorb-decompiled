/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj extends k {
    static String field_m;
    private int field_p;
    private int field_q;
    private int field_l;
    static String field_o;
    private int field_k;
    static String field_n;

    final static void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7, int param8, int param9) {
        RuntimeException var10 = null;
        int[] var10_array = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var16 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param2 >= 76) {
                break L1;
              } else {
                oj.e((byte) -89);
                break L1;
              }
            }
            param7--;
            L2: while (true) {
              if (param7 < 0) {
                break L0;
              } else {
                var17 = param4;
                var10_array = var17;
                var11 = param3;
                var12 = param0;
                var13 = param6;
                var14 = param5;
                var15 = (var17[var11] & 16711422) >> 1;
                var10_array[var11] = (dda.a(33493156, var14) >> 17) + dda.a(65280, var13 >> 9) + dda.a(var12 >> 1, 16711680) + var15;
                param5 = param5 + param9;
                param6 = param6 + param8;
                param0 = param0 + param1;
                param3++;
                param7--;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var10 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var10;
            stackOut_8_1 = new StringBuilder().append("oj.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param4 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    final int[] a(int param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        var14 = BachelorFridge.field_y;
        if (param1 == 0) {
          var15 = ((oj) this).field_j.a(param0, ~param1);
          var3 = var15;
          if (!((oj) this).field_j.field_m) {
            return var15;
          } else {
            var4 = 0;
            L0: while (true) {
              if (hh.field_d <= var4) {
                return var15;
              } else {
                var5 = (jq.field_k[var4] << 12) / ((oj) this).field_l + ((oj) this).field_p;
                var6 = (tj.field_f[param0] << 12) / ((oj) this).field_l - -((oj) this).field_q;
                var7 = var5;
                var8 = var6;
                var9 = var5;
                var10 = var6;
                var11 = var5 * var5 >> 12;
                var12 = var6 * var6 >> 12;
                var13 = 0;
                L1: while (true) {
                  L2: {
                    if (16384 <= var12 + var11) {
                      break L2;
                    } else {
                      if (var13 >= ((oj) this).field_k) {
                        break L2;
                      } else {
                        var10 = var8 + (var9 * var10 >> 12) * 2;
                        var9 = -var12 + var11 + var7;
                        var11 = var9 * var9 >> 12;
                        var12 = var10 * var10 >> 12;
                        var13++;
                        continue L1;
                      }
                    }
                  }
                  L3: {
                    stackOut_9_0 = (int[]) var15;
                    stackOut_9_1 = var4;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_11_1 = stackOut_9_1;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    if (var13 >= -1 + ((oj) this).field_k) {
                      stackOut_11_0 = (int[]) (Object) stackIn_11_0;
                      stackOut_11_1 = stackIn_11_1;
                      stackOut_11_2 = 0;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      stackIn_12_2 = stackOut_11_2;
                      break L3;
                    } else {
                      stackOut_10_0 = (int[]) (Object) stackIn_10_0;
                      stackOut_10_1 = stackIn_10_1;
                      stackOut_10_2 = (var13 << 12) / ((oj) this).field_k;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      stackIn_12_2 = stackOut_10_2;
                      break L3;
                    }
                  }
                  stackIn_12_0[stackIn_12_1] = stackIn_12_2;
                  var4++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    public oj() {
        super(0, true);
        ((oj) this).field_q = 0;
        ((oj) this).field_p = 0;
        ((oj) this).field_l = 1365;
        ((oj) this).field_k = 20;
    }

    final void a(byte param0, lu param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (var4_int == 0) {
                ((oj) this).field_l = param1.e((byte) 90);
                break L1;
              } else {
                if (var4_int != 1) {
                  if (2 != var4_int) {
                    if (var4_int != 3) {
                      break L1;
                    } else {
                      ((oj) this).field_q = param1.e((byte) 57);
                      break L1;
                    }
                  } else {
                    ((oj) this).field_p = param1.e((byte) 119);
                    break L1;
                  }
                } else {
                  ((oj) this).field_k = param1.e((byte) 114);
                  break L1;
                }
              }
            }
            if (param0 == -71) {
              break L0;
            } else {
              field_n = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("oj.E(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param2 + ')');
        }
    }

    public static void e(byte param0) {
        if (param0 > -114) {
          oj.e((byte) 62);
          field_n = null;
          field_m = null;
          field_o = null;
          return;
        } else {
          field_n = null;
          field_m = null;
          field_o = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Drinks";
        field_n = "Remove <%0> from ignore list";
        field_o = "Bakery";
    }
}
