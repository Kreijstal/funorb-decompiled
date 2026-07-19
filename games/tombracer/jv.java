/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jv extends ci {
    static ica field_m;
    private int field_o;
    private boolean field_n;

    final static int d(int param0) {
        int var1 = 50 / ((32 - param0) / 60);
        return aqa.field_d - wt.field_a;
    }

    public jv() {
        super(1, false);
        this.field_o = 4096;
        this.field_n = true;
    }

    final int[][] b(int param0, int param1) {
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
        int[] var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        int var45 = 0;
        int var46 = 0;
        var21 = TombRacer.field_G ? 1 : 0;
        var29 = this.field_h.a(param0, (byte) -125);
        var23 = var29;
        var22 = var23;
        var3 = var22;
        if (this.field_h.field_f) {
          var41 = this.c(0, param1 + -118, hba.field_b & -1 + param0);
          var5 = this.c(0, -32, param0);
          var40 = this.c(0, -111, param0 - -1 & hba.field_b);
          var42 = var29[0];
          var43 = var29[1];
          var44 = var29[2];
          var10 = 0;
          L0: while (true) {
            if (ns.field_g > var10) {
              var14 = (var40[var10] - var41[var10]) * this.field_o;
              var15 = this.field_o * (-var5[una.field_b & -1 + var10] + var5[una.field_b & 1 + var10]);
              var16 = var15 >> 1141082572;
              var17 = var14 >> 1909882828;
              var18 = var16 * var16 >> 619297868;
              var19 = var17 * var17 >> -2018310388;
              var20 = (int)(4096.0 * Math.sqrt((double)((float)(4096 + var18 - -var19) / 4096.0f)));
              var46 = -1;
              var45 = var20 ^ -1;
              if (var21 != 0) {
                if (var45 != var46) {
                  this.field_n = false;
                  return var22;
                } else {
                  return var22;
                }
              } else {
                L1: {
                  L2: {
                    if (var45 == var46) {
                      break L2;
                    } else {
                      var12 = var14 / var20;
                      var11 = var15 / var20;
                      var13 = 16777216 / var20;
                      if (var21 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var13 = 0;
                  var11 = 0;
                  var12 = 0;
                  break L1;
                }
                L3: {
                  if (this.field_n) {
                    var12 = 2048 + (var12 >> -1720215103);
                    var11 = (var11 >> 1627837985) + 2048;
                    var13 = (var13 >> -1254476095) + 2048;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var42[var10] = var11;
                var43[var10] = var12;
                var44[var10] = var13;
                var10++;
                continue L0;
              }
            } else {
              if (param1 != -1) {
                this.field_n = false;
                return var22;
              } else {
                return var22;
              }
            }
          }
        } else {
          if (param1 != -1) {
            this.field_n = false;
            return var22;
          } else {
            return var22;
          }
        }
    }

    final void a(byte param0, uia param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_9_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 == 107) {
              L1: {
                L2: {
                  L3: {
                    var4_int = param2;
                    if (0 != var4_int) {
                      break L3;
                    } else {
                      if (var5 == 0) {
                        this.field_o = param1.d(param0 ^ 18);
                        if (var5 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (var4_int == 1) {
                    break L2;
                  } else {
                    return;
                  }
                }
                L4: {
                  stackOut_9_0 = this;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_10_0 = stackOut_9_0;
                  if (-2 != (param1.h(255) ^ -1)) {
                    stackOut_11_0 = this;
                    stackOut_11_1 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    break L4;
                  } else {
                    stackOut_10_0 = this;
                    stackOut_10_1 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    break L4;
                  }
                }
                ((jv) (this)).field_n = stackIn_12_1 != 0;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (runtimeException);
            stackOut_14_1 = new StringBuilder().append("jv.A(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void c(int param0) {
        if (param0 != -15471) {
            return;
        }
        field_m = null;
    }

    static {
        field_m = new ica();
    }
}
