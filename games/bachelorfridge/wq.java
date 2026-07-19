/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wq extends k {
    static String field_m;
    static int field_n;
    private int field_p;
    private int field_o;
    static kv field_k;
    private int field_l;

    final void a(byte param0, lu param1, int param2) {
        int[][] discarded$1 = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (var4_int == 0) {
                this.field_o = param1.e((byte) 112);
                break L1;
              } else {
                if (-2 != (var4_int ^ -1)) {
                  if (var4_int == 2) {
                    this.field_p = param1.e((byte) 120);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  this.field_l = param1.e((byte) 67);
                  break L1;
                }
              }
            }
            L2: {
              if (param0 == -71) {
                break L2;
              } else {
                discarded$1 = this.a(true, 44);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var4);
            stackOut_12_1 = new StringBuilder().append("wq.E(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7, String param8, int param9, int param10) {
        int discarded$0 = 0;
        int discarded$1 = 0;
        try {
            if (!param7) {
                wq.d(51);
            }
            discarded$0 = hfa.field_z.a(param8, param10, param4, param5, param2, param6, -1, param0, param9, param1);
            discarded$1 = jha.field_g.a(param8, param10, 20 + param4, param5, param2, param3, -1, param0, param9, param1);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "wq.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ',' + param9 + ',' + param10 + ')');
        }
    }

    public static void d(int param0) {
        field_k = null;
        field_m = null;
        int var1 = 79 / ((45 - param0) / 59);
    }

    public wq() {
        super(1, false);
        this.field_p = 4096;
        this.field_o = 4096;
        this.field_l = 4096;
    }

    final int[][] a(boolean param0, int param1) {
        int[][] var3 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[][] var16 = null;
        int[][] var18 = null;
        int[][] var23 = null;
        int[][] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        L0: {
          var15 = BachelorFridge.field_y;
          var23 = this.field_h.a(param1, -858);
          var18 = var23;
          var16 = var18;
          var3 = var16;
          if (this.field_h.field_b) {
            var31 = this.a((byte) -93, 0, param1);
            var32 = var31[0];
            var34 = var31[1];
            var33 = var31[2];
            var8 = var23[0];
            var9 = var23[1];
            var10 = var23[2];
            var11 = 0;
            L1: while (true) {
              if (var11 >= hh.field_d) {
                break L0;
              } else {
                L2: {
                  var12 = var32[var11];
                  var13 = var33[var11];
                  var14 = var34[var11];
                  if (var12 != var13) {
                    break L2;
                  } else {
                    if (var14 == var13) {
                      var8[var11] = var12 * this.field_o >> -965657780;
                      var9[var11] = var13 * this.field_l >> -1620535732;
                      var10[var11] = var14 * this.field_p >> 2093606156;
                      var11++;
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var8[var11] = this.field_o;
                var9[var11] = this.field_l;
                var10[var11] = this.field_p;
                var11++;
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        L3: {
          if (!param0) {
            break L3;
          } else {
            field_m = (String) null;
            break L3;
          }
        }
        return var3;
    }

    static {
        field_n = 0;
        field_m = "Type your age in years";
    }
}
