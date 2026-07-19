/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ksa extends ci {
    static String field_n;
    private int field_m;
    static int field_p;
    private int field_q;
    private int field_o;

    public ksa() {
        super(1, false);
        this.field_q = 2048;
        this.field_m = 1024;
        this.field_o = 3072;
    }

    public static void c(int param0) {
        field_n = null;
        if (param0 != -19514) {
            ksa.c(80);
        }
    }

    final static void a(boolean param0, kia param1) {
        try {
            kh.a(param0, param1, qla.field_f);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ksa.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int[] c(int param0, int param1) {
        int[][] discarded$1 = null;
        int[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int[] stackIn_9_0 = null;
        int[] stackIn_11_0 = null;
        int[] stackIn_18_0 = null;
        int[] stackIn_19_0 = null;
        int[] stackOut_17_0 = null;
        int[] stackOut_8_0 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        if (param0 == 1) {
          var7 = this.field_i.a((byte) 64, param1);
          var3 = var7;
          if (this.field_i.field_d) {
            var4 = this.c(0, -10, param1);
            var5 = 0;
            L0: while (true) {
              if (var5 < ns.field_g) {
                stackOut_17_0 = (int[]) (var7);
                stackIn_19_0 = stackOut_17_0;
                stackIn_18_0 = stackOut_17_0;
                if (var6 == 0) {
                  stackIn_19_0[var5] = (this.field_q * var4[var5] >> 571722540) + this.field_m;
                  var5++;
                  continue L0;
                } else {
                  return stackIn_18_0;
                }
              } else {
                return var7;
              }
            }
          } else {
            return var7;
          }
        } else {
          discarded$1 = this.b(79, -115);
          var7 = this.field_i.a((byte) 64, param1);
          var3 = var7;
          if (this.field_i.field_d) {
            var4 = this.c(0, -10, param1);
            var5 = 0;
            L1: while (true) {
              if (var5 < ns.field_g) {
                stackOut_8_0 = (int[]) (var7);
                stackIn_11_0 = stackOut_8_0;
                stackIn_9_0 = stackOut_8_0;
                if (var6 != 0) {
                  return stackIn_11_0;
                } else {
                  stackIn_9_0[var5] = (this.field_q * var4[var5] >> 571722540) + this.field_m;
                  var5++;
                  continue L1;
                }
              } else {
                return var7;
              }
            }
          } else {
            return var7;
          }
        }
    }

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  var4_int = param2;
                  if (0 == var4_int) {
                    this.field_m = param1.d(param0 ^ 18);
                    if (var5 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  } else {
                    L4: {
                      if (-2 != (var4_int ^ -1)) {
                        break L4;
                      } else {
                        if (var5 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (var4_int == 2) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                this.field_o = param1.d(param0 ^ 20);
                if (var5 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
              L5: {
                stackOut_10_0 = this;
                stackIn_12_0 = stackOut_10_0;
                stackIn_11_0 = stackOut_10_0;
                if (-2 != (param1.h(255) ^ -1)) {
                  stackOut_12_0 = this;
                  stackOut_12_1 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  break L5;
                } else {
                  stackOut_11_0 = this;
                  stackOut_11_1 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  break L5;
                }
              }
              ((ksa) (this)).field_g = stackIn_13_1 != 0;
              break L1;
            }
            L6: {
              if (param0 == 107) {
                break L6;
              } else {
                field_n = (String) null;
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var4);
            stackOut_17_1 = new StringBuilder().append("ksa.A(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L7;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param2 + ')');
        }
    }

    final void b(byte param0) {
        if (param0 != 116) {
          this.field_m = 0;
          this.field_q = -this.field_m + this.field_o;
          return;
        } else {
          this.field_q = -this.field_m + this.field_o;
          return;
        }
    }

    final int[][] b(int param0, int param1) {
        int[][] var3 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        kia var13 = null;
        int[][] var14 = null;
        int[][] var16 = null;
        int[][] var20 = null;
        int[][] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        var12 = TombRacer.field_G ? 1 : 0;
        var21 = this.field_h.a(param0, (byte) -46);
        var16 = var21;
        var14 = var16;
        var3 = var14;
        if (this.field_h.field_f) {
          var20 = this.a(param0, 0, -1);
          var22 = var20[0];
          var23 = var20[1];
          var24 = var20[2];
          var8 = var21[0];
          var9 = var21[1];
          var10 = var21[2];
          var11 = 0;
          L0: while (true) {
            if (ns.field_g <= var11) {
              if (param1 == -1) {
                return var14;
              } else {
                var13 = (kia) null;
                ksa.a(true, (kia) null);
                return var14;
              }
            } else {
              var8[var11] = this.field_m + (var22[var11] * this.field_q >> 123289932);
              var9[var11] = (this.field_q * var23[var11] >> -579643476) + this.field_m;
              var10[var11] = (this.field_q * var24[var11] >> -1156571636) + this.field_m;
              var11++;
              if (var12 == 0) {
                continue L0;
              } else {
                return var14;
              }
            }
          }
        } else {
          if (param1 == -1) {
            return var14;
          } else {
            var13 = (kia) null;
            ksa.a(true, (kia) null);
            return var14;
          }
        }
    }

    static {
        field_n = "Software";
        field_p = 0;
    }
}
