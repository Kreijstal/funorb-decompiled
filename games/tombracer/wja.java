/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wja extends ci {
    private int field_m;
    private int field_n;
    static String field_o;

    final static void a(String param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        rv.field_c.field_r = param0;
        uv.field_o = true;
        int var2_int = gn.field_C.field_f;
        int var3 = gn.field_C.field_e;
        if (param1 != 15165) {
            return;
        }
        try {
            var4 = rv.field_c.field_H.a(param0, 272, rv.field_c.field_P);
            var5 = -(var4 / 2) + (-103 + var3 / 2);
            wo.field_k.a(320, -(2 * var5) + (var3 - 120), -23776, var5, (-320 + var2_int) / 2);
            wo.field_k.field_w = hca.c(wo.field_k.field_t, 2105376, 3, 11579568, -118, 8421504);
            rv.field_c.a(-24 + (wo.field_k.field_G + -24), -20 + wo.field_k.field_t + -24, -23776, 16, 24);
            bma.field_v.a(80, 24, param1 ^ -26595, -24 + wo.field_k.field_t - 20, 120);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "wja.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (-1 != (var4_int ^ -1)) {
                if (1 == var4_int) {
                  this.field_m = param1.d(param0 + 16);
                  break L1;
                } else {
                  if (2 != var4_int) {
                    break L1;
                  } else {
                    L2: {
                      stackIn_10_0 = this;

                      if (-2 != (param1.h(255) ^ -1)) {
                        stackIn_11_0 = this;
                        stackIn_11_1 = 0;
                        break L2;
                      } else {
                        stackIn_11_0 = this;
                        stackIn_11_1 = 1;
                        break L2;
                      }
                    }
                    ((wja) (this)).field_g = stackIn_11_1 != 0;
                    break L1;
                  }
                }
              } else {
                this.field_n = param1.d(127);
                break L1;
              }
            }
            L3: {
              if (param0 == 107) {
                break L3;
              } else {
                this.field_n = 41;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("wja.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ')');
        }
    }

    public static void c(int param0) {
        if (param0 != 0) {
            return;
        }
        field_o = null;
    }

    public wja() {
        super(1, false);
        this.field_n = 0;
        this.field_m = 4096;
    }

    final static void d(byte param0) {
        if (param0 != 96) {
            field_o = (String) null;
        }
    }

    final int[][] b(int param0, int param1) {
        int[][] var3;
        int[] var8;
        int[] var9;
        int[] var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int[][] var16;
        int[][] var18;
        int[] var22;
        int[] var23;
        int[] var24;
        int[][] var26;
        int[] var30;
        int[] var31;
        int[] var32;
        int[][] var37;
        int[] var38;
        int[] var39;
        int[] var40;
        var15 = TombRacer.field_G ? 1 : 0;
        if (param1 == -1) {
          L0: {
            var26 = this.field_h.a(param0, (byte) 18);
            var18 = var26;
            var16 = var18;
            var3 = var16;
            if (!this.field_h.field_f) {
              break L0;
            } else {
              var37 = this.a(param0, 0, param1 ^ 0);
              var38 = var37[0];
              var39 = var37[1];
              var40 = var37[2];
              var30 = var26[0];
              var22 = var30;
              var8 = var22;
              var31 = var26[1];
              var23 = var31;
              var9 = var23;
              var32 = var26[2];
              var24 = var32;
              var10 = var24;
              var11 = 0;
              L1: while (true) {
                if (var11 >= ns.field_g) {
                  break L0;
                } else {
                  L2: {
                    var12 = var38[var11];
                    var13 = var39[var11];
                    var14 = var40[var11];
                    if (this.field_n <= var12) {
                      if (var12 > this.field_m) {
                        var8[var11] = this.field_m;
                        break L2;
                      } else {
                        var30[var11] = var12;
                        break L2;
                      }
                    } else {
                      var8[var11] = this.field_n;
                      break L2;
                    }
                  }
                  L3: {
                    if (var13 < this.field_n) {
                      var9[var11] = this.field_n;
                      break L3;
                    } else {
                      if (this.field_m >= var13) {
                        var31[var11] = var13;
                        break L3;
                      } else {
                        var9[var11] = this.field_m;
                        break L3;
                      }
                    }
                  }
                  if (var14 >= this.field_n) {
                    if (this.field_m < var14) {
                      var10[var11] = this.field_m;
                      var11++;
                      continue L1;
                    } else {
                      var32[var11] = var14;
                      var11++;
                      continue L1;
                    }
                  } else {
                    var10[var11] = this.field_n;
                    var11++;
                    continue L1;
                  }
                }
              }
            }
          }
          return var3;
        } else {
          return (int[][]) null;
        }
    }

    final int[] c(int param0, int param1) {
        int[] var3;
        int[] var4;
        int var5;
        int var6;
        int var7;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          var3 = this.field_i.a((byte) 84, param1);
          if (param0 == 1) {
            break L0;
          } else {
            wja.c(18);
            break L0;
          }
        }
        L1: {
          if (!this.field_i.field_d) {
            break L1;
          } else {
            var4 = this.c(0, -101, param1);
            var5 = 0;
            L2: while (true) {
              if (var5 >= ns.field_g) {
                break L1;
              } else {
                var6 = var4[var5];
                if (this.field_n <= var6) {
                  if (var6 <= this.field_m) {
                    var3[var5] = var6;
                    var5++;
                    continue L2;
                  } else {
                    var3[var5] = this.field_m;
                    var5++;
                    continue L2;
                  }
                } else {
                  var3[var5] = this.field_n;
                  var5++;
                  continue L2;
                }
              }
            }
          }
        }
        return var3;
    }

    static {
        field_o = "Please Log In";
    }
}
