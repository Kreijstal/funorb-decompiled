/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj extends ji {
    private boolean field_z;
    static boolean field_E;
    static int field_B;
    private boolean field_y;
    static boolean field_C;
    static String field_A;

    final static void g(int param0) {
        if (param0 != 1) {
            field_E = true;
        }
    }

    final int[][] b(int param0, int param1) {
        int[] discarded$3 = null;
        int[] discarded$4 = null;
        int[] discarded$5 = null;
        int[][] var3 = null;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int[][] var13 = null;
        int var14 = 0;
        int[][] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[][] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[][] var26 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        var12 = Vertigo2.field_L ? 1 : 0;
        var21 = this.field_v.a(param1, -2);
        var16 = var21;
        var13 = var16;
        var3 = var13;
        if (this.field_v.field_c) {
          L0: {
            stackOut_5_0 = this;
            stackOut_5_1 = 0;
            stackOut_5_2 = 3;
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_7_2 = stackOut_5_2;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            stackIn_6_2 = stackOut_5_2;
            if (!this.field_z) {
              stackOut_7_0 = this;
              stackOut_7_1 = stackIn_7_1;
              stackOut_7_2 = stackIn_7_2;
              stackOut_7_3 = param1;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              stackIn_8_3 = stackOut_7_3;
              break L0;
            } else {
              stackOut_6_0 = this;
              stackOut_6_1 = stackIn_6_1;
              stackOut_6_2 = stackIn_6_2;
              stackOut_6_3 = fk.field_x - param1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              stackIn_8_3 = stackOut_6_3;
              break L0;
            }
          }
          var26 = this.c(stackIn_8_1, stackIn_8_2, stackIn_8_3);
          var22 = var26[0];
          var17 = var22;
          var5 = var17;
          var23 = var26[1];
          var18 = var23;
          var6 = var18;
          var24 = var26[2];
          var19 = var24;
          var7 = var19;
          var8 = var21[0];
          var9 = var21[1];
          var10 = var21[2];
          if (!this.field_y) {
            var14 = 0;
            var11 = var14;
            L1: while (true) {
              if (we.field_M <= var14) {
                if (param0 == -3780) {
                  return var3;
                } else {
                  discarded$3 = this.c(87, -79);
                  return var3;
                }
              } else {
                var8[var14] = var22[var14];
                var9[var14] = var23[var14];
                var10[var14] = var24[var14];
                var14++;
                continue L1;
              }
            }
          } else {
            var11 = 0;
            L2: while (true) {
              if (we.field_M > var11) {
                var8[var11] = var5[rm.field_z - var11];
                var9[var11] = var6[-var11 + rm.field_z];
                var10[var11] = var7[rm.field_z + -var11];
                var11++;
                continue L2;
              } else {
                if (param0 != -3780) {
                  discarded$4 = this.c(87, -79);
                  return var3;
                } else {
                  return var3;
                }
              }
            }
          }
        } else {
          if (param0 == -3780) {
            return var3;
          } else {
            discarded$5 = this.c(87, -79);
            return var3;
          }
        }
    }

    public static void b(byte param0) {
        int var1 = -103 % ((param0 - 51) / 40);
        field_A = null;
    }

    final void a(byte param0, int param1, ed param2) {
        int[] discarded$1 = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_14_0 = null;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param1;
              if (var4_int != 0) {
                if (-2 == (var4_int ^ -1)) {
                  L2: {
                    stackOut_10_0 = this;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_11_0 = stackOut_10_0;
                    if ((param2.h(-11) ^ -1) != -2) {
                      stackOut_12_0 = this;
                      stackOut_12_1 = 0;
                      stackIn_13_0 = stackOut_12_0;
                      stackIn_13_1 = stackOut_12_1;
                      break L2;
                    } else {
                      stackOut_11_0 = this;
                      stackOut_11_1 = 1;
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_13_1 = stackOut_11_1;
                      break L2;
                    }
                  }
                  ((kj) (this)).field_z = stackIn_13_1 != 0;
                  break L1;
                } else {
                  if (var4_int == 2) {
                    L3: {
                      stackOut_14_0 = this;
                      stackIn_16_0 = stackOut_14_0;
                      stackIn_15_0 = stackOut_14_0;
                      if ((param2.h(param0 + -121) ^ -1) != -2) {
                        stackOut_16_0 = this;
                        stackOut_16_1 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        break L3;
                      } else {
                        stackOut_15_0 = this;
                        stackOut_15_1 = 1;
                        stackIn_17_0 = stackOut_15_0;
                        stackIn_17_1 = stackOut_15_1;
                        break L3;
                      }
                    }
                    ((kj) (this)).field_o = stackIn_17_1 != 0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                L4: {
                  stackOut_6_0 = this;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if ((param2.h(-11) ^ -1) != -2) {
                    stackOut_8_0 = this;
                    stackOut_8_1 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    break L4;
                  } else {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    break L4;
                  }
                }
                ((kj) (this)).field_y = stackIn_9_1 != 0;
                break L1;
              }
            }
            L5: {
              if (param0 == 110) {
                break L5;
              } else {
                discarded$1 = this.c(-23, 41);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var4);
            stackOut_21_1 = new StringBuilder().append("kj.C(").append(param0).append(',').append(param1).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
    }

    public kj() {
        super(1, false);
        this.field_z = true;
        this.field_y = true;
    }

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        var6 = Vertigo2.field_L ? 1 : 0;
        if (param1 > 91) {
          var7 = this.field_x.a(param0, (byte) 97);
          var3 = var7;
          if (this.field_x.field_i) {
            L0: {
              stackOut_4_0 = this;
              stackOut_4_1 = 0;
              stackOut_4_2 = -1;
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              if (this.field_z) {
                stackOut_6_0 = this;
                stackOut_6_1 = stackIn_6_1;
                stackOut_6_2 = stackIn_6_2;
                stackOut_6_3 = -param0 + fk.field_x;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                stackIn_7_2 = stackOut_6_2;
                stackIn_7_3 = stackOut_6_3;
                break L0;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = stackIn_5_1;
                stackOut_5_2 = stackIn_5_2;
                stackOut_5_3 = param0;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_7_2 = stackOut_5_2;
                stackIn_7_3 = stackOut_5_3;
                break L0;
              }
            }
            var4 = this.a(stackIn_7_1, stackIn_7_2, stackIn_7_3);
            if (this.field_y) {
              var5 = 0;
              L1: while (true) {
                if (we.field_M > var5) {
                  var7[var5] = var4[-var5 + rm.field_z];
                  var5++;
                  continue L1;
                } else {
                  return var3;
                }
              }
            } else {
              qq.a(var4, 0, var7, 0, we.field_M);
              return var3;
            }
          } else {
            return var3;
          }
        } else {
          return (int[]) null;
        }
    }

    final static void a(int param0, int param1, int param2, er[] param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var10 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 == null) {
                break L1;
              } else {
                if ((param1 ^ -1) >= -1) {
                  break L1;
                } else {
                  var5_int = param3[0].field_x;
                  var6 = param3[2].field_x;
                  var7 = param3[param0].field_x;
                  param3[0].e(param2, param4);
                  param3[2].e(param1 + (param2 + -var6), param4);
                  bi.a(ak.field_d);
                  bi.c(param2 + var5_int, param4, -var6 + param2 - -param1, param4 + param3[1].field_B);
                  var8 = param2 - -var5_int;
                  var9 = param2 + param1 - var6;
                  param2 = var8;
                  L2: while (true) {
                    if (param2 >= var9) {
                      bi.b(ak.field_d);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      param3[1].e(param2, param4);
                      param2 = param2 + var7;
                      continue L2;
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var5);
            stackOut_10_1 = new StringBuilder().append("kj.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
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
          throw wn.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_E = false;
        field_A = "Enter name of friend to add to list";
    }
}
