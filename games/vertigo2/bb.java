/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb extends ji {
    static String field_G;
    private int field_E;
    static fg field_F;
    private int field_D;
    static String field_y;
    private int field_C;
    private int field_B;
    private int[] field_z;

    final int[][] b(int param0, int param1) {
        int[][] var3 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[][] var17 = null;
        int[][] var19 = null;
        int[] var21 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[][] var27 = null;
        int[] var29 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[][] var38 = null;
        int[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        L0: {
          var16 = Vertigo2.field_L ? 1 : 0;
          var27 = this.field_v.a(param1, param0 ^ 3778);
          var19 = var27;
          var17 = var19;
          var3 = var17;
          if (!this.field_v.field_c) {
            break L0;
          } else {
            var38 = this.c(0, 3, param1);
            var39 = var38[0];
            var40 = var38[1];
            var41 = var38[2];
            var29 = var27[0];
            var21 = var29;
            var8 = var21;
            var32 = var27[1];
            var24 = var32;
            var9 = var24;
            var33 = var27[2];
            var25 = var33;
            var10 = var25;
            var11 = 0;
            L1: while (true) {
              if (we.field_M <= var11) {
                break L0;
              } else {
                L2: {
                  var13 = var39[var11];
                  var12 = -this.field_z[0] + var13;
                  if ((var12 ^ -1) <= -1) {
                    break L2;
                  } else {
                    var12 = -var12;
                    break L2;
                  }
                }
                if (var12 <= this.field_B) {
                  L3: {
                    var14 = var40[var11];
                    var12 = -this.field_z[1] + var14;
                    if (-1 >= (var12 ^ -1)) {
                      break L3;
                    } else {
                      var12 = -var12;
                      break L3;
                    }
                  }
                  if (var12 > this.field_B) {
                    var32 = var27[1];
                    var29[var11] = var13;
                    var32[var11] = var14;
                    var10[var11] = var41[var11];
                    var11++;
                    continue L1;
                  } else {
                    L4: {
                      var15 = var41[var11];
                      var12 = var15 - this.field_z[2];
                      if (0 <= var12) {
                        break L4;
                      } else {
                        var12 = -var12;
                        break L4;
                      }
                    }
                    if (var12 > this.field_B) {
                      var29[var11] = var13;
                      var32[var11] = var14;
                      var33[var11] = var15;
                      var11++;
                      continue L1;
                    } else {
                      var8[var11] = var13 * this.field_E >> -1198369652;
                      var9[var11] = this.field_C * var14 >> 503917004;
                      var10[var11] = var15 * this.field_D >> -845927732;
                      var11++;
                      continue L1;
                    }
                  }
                } else {
                  var29[var11] = var13;
                  var9[var11] = var40[var11];
                  var10[var11] = var41[var11];
                  var11++;
                  continue L1;
                }
              }
            }
          }
        }
        if (param0 == -3780) {
          return var3;
        } else {
          return (int[][]) null;
        }
    }

    final void a(byte param0, int param1, ed param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var5 = param1;
              if (var5 == 0) {
                this.field_B = param2.a((byte) -11);
                break L1;
              } else {
                if (1 == var5) {
                  this.field_D = param2.a((byte) -11);
                  break L1;
                } else {
                  if (var5 != 2) {
                    if (-4 == (var5 ^ -1)) {
                      this.field_E = param2.a((byte) -11);
                      break L1;
                    } else {
                      if ((var5 ^ -1) == -5) {
                        var4_int = param2.m(0);
                        this.field_z[2] = b.a(var4_int >> 1641018380, 0);
                        this.field_z[1] = b.a(var4_int >> -2131951836, 4080);
                        this.field_z[0] = b.a(16711680, var4_int) << 1913666116;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    this.field_C = param2.a((byte) -11);
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (param0 == 110) {
                break L2;
              } else {
                this.field_z = (int[]) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var4);
            stackOut_16_1 = new StringBuilder().append("bb.C(").append(param0).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
    }

    public bb() {
        super(1, false);
        this.field_D = 4096;
        this.field_E = 4096;
        this.field_C = 4096;
        this.field_B = 409;
        this.field_z = new int[3];
    }

    public static void b(byte param0) {
        field_G = null;
        field_F = null;
        field_y = null;
        if (param0 != 76) {
            field_F = (fg) null;
        }
    }

    final static void a(boolean param0, tn param1) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        tn var3 = null;
        int var4 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (null != param1.field_d) {
              L1: {
                L2: {
                  if (param1.field_o != 0) {
                    break L2;
                  } else {
                    if (-1 == (param1.field_m ^ -1)) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var2_int = 0;
                L3: while (true) {
                  if (var2_int >= no.field_d) {
                    break L1;
                  } else {
                    L4: {
                      var3 = eo.field_l[var2_int];
                      if (var3.field_s != 2) {
                        break L4;
                      } else {
                        if (param1.field_o != var3.field_o) {
                          break L4;
                        } else {
                          if (param1.field_m != var3.field_m) {
                            break L4;
                          } else {
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                    }
                    var2_int++;
                    continue L3;
                  }
                }
              }
              L5: {
                if (null != param1.field_f) {
                  uo.field_d = param1.field_a;
                  jo.field_b = param1.field_s;
                  tg.field_a = param1.field_b;
                  fj.field_lb = param1.field_f;
                  break L5;
                } else {
                  break L5;
                }
              }
              if (!param0) {
                in.a(param1, 640);
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (runtimeException);
            stackOut_21_1 = new StringBuilder().append("bb.B(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
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
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    static {
        field_y = "Previous";
        field_G = "Waiting for animations";
    }
}
