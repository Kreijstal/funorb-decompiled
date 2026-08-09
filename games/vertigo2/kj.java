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
        int[][] var3;
        int[] var5;
        int[] var6;
        int[] var7;
        int[] var8;
        int[] var9;
        int[] var10;
        int var11;
        int var12;
        int[][] var13;
        int[][] var16;
        int[] var17;
        int[] var18;
        int[] var19;
        int[][] var21;
        int[] var22;
        int[] var23;
        int[] var24;
        int[][] var26;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        int var14;
        var12 = Vertigo2.field_L ? 1 : 0;
        var21 = this.field_v.a(param1, -2);
        var16 = var21;
        var13 = var16;
        var3 = var13;
        if (this.field_v.field_c) {
          L0: {
            stackIn_7_0 = this;

            stackIn_7_1 = 0;

            stackIn_7_2 = 3;

            if (!this.field_z) {
              stackIn_8_0 = this;
              stackIn_8_1 = stackIn_7_1;
              stackIn_8_2 = stackIn_7_2;
              stackIn_8_3 = param1;
              break L0;
            } else {
              stackIn_8_0 = this;
              stackIn_8_1 = stackIn_7_1;
              stackIn_8_2 = stackIn_7_2;
              stackIn_8_3 = fk.field_x - param1;
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
                  this.c(87, -79);
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
                  this.c(87, -79);
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
            this.c(87, -79);
            return var3;
          }
        }
    }

    public static void b(byte param0) {
        int var1 = -103 % ((param0 - 51) / 40);
        field_A = null;
    }

    final void a(byte param0, int param1, ed param2) {
        int var4_int = 0;
        int var5 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param1;
              if (var4_int != 0) {
                if (-2 == (var4_int ^ -1)) {
                  L2: {
                    stackIn_12_0 = this;

                    if ((param2.h(-11) ^ -1) != -2) {
                      stackIn_13_0 = this;
                      stackIn_13_1 = 0;
                      break L2;
                    } else {
                      stackIn_13_0 = this;
                      stackIn_13_1 = 1;
                      break L2;
                    }
                  }
                  ((kj) (this)).field_z = stackIn_13_1 != 0;
                  break L1;
                } else {
                  if (var4_int == 2) {
                    L3: {
                      stackIn_16_0 = this;

                      if ((param2.h(param0 + -121) ^ -1) != -2) {
                        stackIn_17_0 = this;
                        stackIn_17_1 = 0;
                        break L3;
                      } else {
                        stackIn_17_0 = this;
                        stackIn_17_1 = 1;
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
                  stackIn_8_0 = this;

                  if ((param2.h(-11) ^ -1) != -2) {
                    stackIn_9_0 = this;
                    stackIn_9_1 = 0;
                    break L4;
                  } else {
                    stackIn_9_0 = this;
                    stackIn_9_1 = 1;
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
                this.c(-23, 41);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var4);

            stackIn_23_1 = new StringBuilder().append("kj.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L6;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
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
        int[] var3;
        int[] var4;
        int var5;
        int var6;
        int[] var7;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        var6 = Vertigo2.field_L ? 1 : 0;
        if (param1 > 91) {
          var7 = this.field_x.a(param0, (byte) 97);
          var3 = var7;
          if (this.field_x.field_i) {
            L0: {
              stackIn_6_0 = this;

              stackIn_6_1 = 0;

              stackIn_6_2 = -1;

              if (this.field_z) {
                stackIn_7_0 = this;
                stackIn_7_1 = stackIn_6_1;
                stackIn_7_2 = stackIn_6_2;
                stackIn_7_3 = -param0 + fk.field_x;
                break L0;
              } else {
                stackIn_7_0 = this;
                stackIn_7_1 = stackIn_6_1;
                stackIn_7_2 = stackIn_6_2;
                stackIn_7_3 = param0;
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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
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
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("kj.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
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
