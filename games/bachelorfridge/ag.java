/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ag extends k {
    private int field_l;
    private int field_m;
    static String field_k;

    final int[][] a(boolean param0, int param1) {
        int[][] var3 = null;
        int[][] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[][] var17 = null;
        int[][] var18 = null;
        int[][] var19 = null;
        L0: {
          var16 = BachelorFridge.field_y;
          if (!param0) {
            break L0;
          } else {
            this.field_l = -114;
            break L0;
          }
        }
        L1: {
          var19 = this.field_h.a(param1, -858);
          var18 = var19;
          var17 = var18;
          var3 = var17;
          if (this.field_h.field_b) {
            L2: {
              var5 = hh.field_d / this.field_l;
              var6 = bi.field_g / this.field_m;
              if ((var6 ^ -1) < -1) {
                var7_int = param1 % var6;
                var4 = this.a((byte) -77, 0, var7_int * bi.field_g / var6);
                break L2;
              } else {
                var4 = this.a((byte) -78, 0, 0);
                break L2;
              }
            }
            var7 = var4[0];
            var8 = var4[1];
            var9 = var4[2];
            var10 = var19[0];
            var11 = var19[1];
            var12 = var19[2];
            var13 = 0;
            L3: while (true) {
              if (var13 >= hh.field_d) {
                break L1;
              } else {
                L4: {
                  if (-1 <= (var5 ^ -1)) {
                    var14 = 0;
                    break L4;
                  } else {
                    var15 = var13 % var5;
                    var14 = var15 * hh.field_d / var5;
                    break L4;
                  }
                }
                var10[var13] = var7[var14];
                var11[var13] = var8[var14];
                var12[var13] = var9[var14];
                var13++;
                continue L3;
              }
            }
          } else {
            break L1;
          }
        }
        return var17;
    }

    final static long e(int param0) {
        if (param0 != -9109) {
            jfa var2 = (jfa) null;
            ag.a((jfa) null, (byte) 80);
        }
        return -pk.field_c + f.b((byte) 73);
    }

    final int[] a(int param0, int param1) {
        int[] discarded$2 = null;
        int[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int var11 = 0;
        L0: {
          var9 = BachelorFridge.field_y;
          if (param1 == 0) {
            break L0;
          } else {
            discarded$2 = this.a(122, 93);
            break L0;
          }
        }
        L1: {
          var10 = this.field_j.a(param0, param1 + -1);
          var3 = var10;
          if (!this.field_j.field_m) {
            break L1;
          } else {
            L2: {
              var5 = hh.field_d / this.field_l;
              var6 = bi.field_g / this.field_m;
              if (-1 > (var6 ^ -1)) {
                var7 = param0 % var6;
                var4 = this.a(0, var7 * bi.field_g / var6, (byte) 110);
                break L2;
              } else {
                var4 = this.a(0, 0, (byte) 116);
                break L2;
              }
            }
            var11 = 0;
            var7 = var11;
            L3: while (true) {
              if (var11 >= hh.field_d) {
                break L1;
              } else {
                if (0 >= var5) {
                  var10[var11] = var4[0];
                  var11++;
                  continue L3;
                } else {
                  var8 = var11 % var5;
                  var10[var11] = var4[var8 * hh.field_d / var5];
                  var11++;
                  continue L3;
                }
              }
            }
          }
        }
        return var10;
    }

    public ag() {
        super(1, false);
        this.field_l = 4;
        this.field_m = 4;
    }

    final static void a(jfa param0, byte param1) {
        int var2_int = 0;
        if (bp.e(param1 ^ 29881)) {
            return;
        }
        try {
            sja.field_fb.c(92, (byte) 111);
            sja.field_fb.field_g = sja.field_fb.field_g + 2;
            if (param1 != -104) {
                field_k = (String) null;
            }
            var2_int = sja.field_fb.field_g;
            rha.a(param0.field_g, sja.field_fb, (byte) -107);
            sja.field_fb.a((byte) -88, sja.field_fb.field_g + -var2_int);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ag.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void d(int param0) {
        int var1 = -112 / ((39 - param0) / 53);
        field_k = null;
    }

    final static void a(int param0, String param1, int param2, int param3, String param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17, int param18, int param19) {
        RuntimeException var20 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              ur.field_e[pe.field_m] = (oha) ((Object) new t(param17, param1, param4, param12, param14, param11, param0, param7, param10, param3, param2, param16, param18, param5, param13, param15, param6, param8, param9));
              pe.field_m = pe.field_m + 1;
              if (param19 == -4313) {
                break L1;
              } else {
                field_k = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var20 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var20);
            stackOut_3_1 = new StringBuilder().append("ag.F(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param4 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ',' + param15 + ',' + param16 + ',' + param17 + ',' + param18 + ',' + param19 + ')');
        }
    }

    final void a(byte param0, lu param1, int param2) {
        int[][] discarded$2 = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param0 == -71) {
                break L1;
              } else {
                discarded$2 = this.a(true, -64);
                break L1;
              }
            }
            L2: {
              var4_int = param2;
              if (-1 != (var4_int ^ -1)) {
                if (-2 != (var4_int ^ -1)) {
                  break L2;
                } else {
                  this.field_m = param1.b(param0 ^ -16711866);
                  break L2;
                }
              } else {
                this.field_l = param1.b(16711935);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var4);
            stackOut_10_1 = new StringBuilder().append("ag.E(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ')');
        }
    }

    static {
        field_k = "Please select options in the following rows:  ";
    }
}
