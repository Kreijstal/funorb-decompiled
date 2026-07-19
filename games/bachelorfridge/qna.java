/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qna extends k {
    private int field_n;
    static kv[] field_l;
    static int field_k;
    private boolean field_m;

    final void a(byte param0, lu param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -71) {
                break L1;
              } else {
                field_k = -126;
                break L1;
              }
            }
            var4_int = param2;
            if (var4_int == 0) {
              this.field_n = param1.e((byte) 107);
              return;
            } else {
              if (var4_int == 1) {
                L2: {
                  stackOut_6_0 = this;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if ((param1.b(param0 + 16712006) ^ -1) != -2) {
                    stackOut_8_0 = this;
                    stackOut_8_1 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    break L2;
                  } else {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    break L2;
                  }
                }
                ((qna) (this)).field_m = stackIn_9_1 != 0;
                break L0;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var4);
            stackOut_11_1 = new StringBuilder().append("qna.E(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
        }
    }

    final static void b(int param0, int param1) {
        pf var2 = sja.field_fb;
        var2.c(param0, (byte) 124);
        var2.d(1, param1 ^ param1);
        var2.d(0, param1 ^ 0);
    }

    public static void e(byte param0) {
        if (param0 != -106) {
            qna.b(18, -38);
            field_l = null;
            return;
        }
        field_l = null;
    }

    public qna() {
        super(1, false);
        this.field_n = 4096;
        this.field_m = true;
    }

    final int[][] a(boolean param0, int param1) {
        int[][] discarded$1 = null;
        int[][] var3 = null;
        int[] var5 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int[][] var22 = null;
        int[][] var23 = null;
        int[][] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        int[] var45 = null;
        int[] var46 = null;
        int[] var47 = null;
        int[] var48 = null;
        int[] var49 = null;
        var21 = BachelorFridge.field_y;
        if (!param0) {
          var29 = this.field_h.a(param1, -858);
          var23 = var29;
          var22 = var23;
          var3 = var22;
          if (!this.field_h.field_b) {
            return var22;
          } else {
            var46 = this.a(0, it.field_r & -1 + param1, (byte) 117);
            var5 = this.a(0, param1, (byte) 106);
            var45 = this.a(0, param1 - -1 & it.field_r, (byte) 124);
            var47 = var29[0];
            var48 = var29[1];
            var49 = var29[2];
            var10 = 0;
            L0: while (true) {
              if (hh.field_d <= var10) {
                return var22;
              } else {
                L1: {
                  var14 = (var45[var10] - var46[var10]) * this.field_n;
                  var15 = (-var5[-1 + var10 & wp.field_r] + var5[var10 + 1 & wp.field_r]) * this.field_n;
                  var16 = var15 >> -798477748;
                  var17 = var14 >> -1653000436;
                  var18 = var16 * var16 >> 1249397452;
                  var19 = var17 * var17 >> -737892756;
                  var20 = (int)(4096.0 * Math.sqrt((double)((float)(4096 + (var19 + var18)) / 4096.0f)));
                  if (var20 == 0) {
                    var13 = 0;
                    var11 = 0;
                    var12 = 0;
                    break L1;
                  } else {
                    var12 = var14 / var20;
                    var11 = var15 / var20;
                    var13 = 16777216 / var20;
                    break L1;
                  }
                }
                L2: {
                  if (this.field_m) {
                    var13 = (var13 >> -251053087) + 2048;
                    var12 = (var12 >> 769610785) + 2048;
                    var11 = 2048 + (var11 >> 302087841);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var47[var10] = var11;
                var48[var10] = var12;
                var49[var10] = var13;
                var10++;
                continue L0;
              }
            }
          }
        } else {
          discarded$1 = this.a(false, -96);
          var29 = this.field_h.a(param1, -858);
          var23 = var29;
          var22 = var23;
          var3 = var22;
          if (this.field_h.field_b) {
            var36 = this.a(0, it.field_r & -1 + param1, (byte) 117);
            var31 = var36;
            var5 = this.a(0, param1, (byte) 106);
            var35 = this.a(0, param1 - -1 & it.field_r, (byte) 124);
            var30 = var35;
            var37 = var29[0];
            var32 = var37;
            var38 = var29[1];
            var33 = var38;
            var39 = var29[2];
            var34 = var39;
            var10 = 0;
            L3: while (true) {
              if (hh.field_d > var10) {
                L4: {
                  var14 = (var35[var10] - var36[var10]) * this.field_n;
                  var15 = (-var5[-1 + var10 & wp.field_r] + var5[var10 + 1 & wp.field_r]) * this.field_n;
                  var16 = var15 >> -798477748;
                  var17 = var14 >> -1653000436;
                  var18 = var16 * var16 >> 1249397452;
                  var19 = var17 * var17 >> -737892756;
                  var20 = (int)(4096.0 * Math.sqrt((double)((float)(4096 + (var19 + var18)) / 4096.0f)));
                  if (var20 == 0) {
                    var13 = 0;
                    var11 = 0;
                    var12 = 0;
                    break L4;
                  } else {
                    var12 = var14 / var20;
                    var11 = var15 / var20;
                    var13 = 16777216 / var20;
                    break L4;
                  }
                }
                L5: {
                  if (this.field_m) {
                    var13 = (var13 >> -251053087) + 2048;
                    var12 = (var12 >> 769610785) + 2048;
                    var11 = 2048 + (var11 >> 302087841);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var37[var10] = var11;
                var38[var10] = var12;
                var39[var10] = var13;
                var10++;
                continue L3;
              } else {
                return var22;
              }
            }
          } else {
            return var22;
          }
        }
    }

    static {
    }
}
