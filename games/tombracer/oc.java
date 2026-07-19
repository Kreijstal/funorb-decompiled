/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc {
    int[] field_d;
    int[] field_j;
    short[] field_s;
    short[] field_h;
    private int field_w;
    short[] field_q;
    int[] field_I;
    int[] field_v;
    int field_E;
    jt[] field_m;
    ava[] field_B;
    int[] field_c;
    short[] field_K;
    int[] field_D;
    byte field_k;
    rga[] field_e;
    byte[] field_z;
    int field_L;
    byte[] field_G;
    byte[] field_u;
    short[] field_y;
    int[] field_p;
    int[] field_l;
    byte[] field_n;
    short[] field_J;
    int field_F;
    byte[] field_g;
    byte[] field_i;
    int[] field_x;
    int field_o;
    byte[] field_C;
    short[] field_t;
    static su field_H;
    int[] field_b;
    int[] field_f;
    short[] field_A;
    short[] field_a;
    short[] field_r;

    final int[][] c(byte param0) {
        int[] array$2 = null;
        int var2 = 0;
        int[] var3 = null;
        int var4 = 0;
        int var5_int = 0;
        int[][] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[][] var10 = null;
        int[] var11 = null;
        int[][] var12 = null;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        var2 = 83 % ((param0 - 22) / 49);
        var11 = new int[256];
        var9 = var11;
        var3 = var9;
        var4 = 0;
        var5_int = 0;
        L0: while (true) {
          L1: {
            L2: {
              if ((this.field_o ^ -1) >= (var5_int ^ -1)) {
                break L2;
              } else {
                var6 = this.field_D[var5_int];
                stackOut_2_0 = -1;
                stackOut_2_1 = var6 ^ -1;
                stackIn_9_0 = stackOut_2_0;
                stackIn_9_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (var8 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (stackIn_3_0 >= stackIn_3_1) {
                      var3[var6] = var3[var6] + 1;
                      if (var4 >= var6) {
                        break L3;
                      } else {
                        var4 = var6;
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  var5_int++;
                  if (var8 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackOut_8_0 = var4;
            stackOut_8_1 = -1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            break L1;
          }
          var12 = new int[stackIn_9_0 - stackIn_9_1][];
          var10 = var12;
          var5 = var10;
          var6 = 0;
          L4: while (true) {
            L5: {
              L6: {
                if (var4 < var6) {
                  break L6;
                } else {
                  array$2 = new int[var11[var6]];
                  var5[var6] = array$2;
                  var11[var6] = 0;
                  var6++;
                  if (var8 != 0) {
                    break L5;
                  } else {
                    if (var8 == 0) {
                      continue L4;
                    } else {
                      break L6;
                    }
                  }
                }
              }
              var6 = 0;
              break L5;
            }
            L7: while (true) {
              L8: {
                if (this.field_o <= var6) {
                  break L8;
                } else {
                  L9: {
                    var7 = this.field_D[var6];
                    if (0 <= var7) {
                      var12 = var10;
                      var3[var7] = var3[var7] + 1;
                      var12[var7][var3[var7]] = var6;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  var6++;
                  if (var8 == 0) {
                    continue L7;
                  } else {
                    break L8;
                  }
                }
              }
              return var5;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_H = null;
        if (param0 != -71) {
            oc.a((byte) 123);
        }
    }

    final int[][] b(byte param0) {
        int[] array$2 = null;
        int[][] discarded$3 = null;
        int[] var2 = null;
        int var3 = 0;
        int var4_int = 0;
        int[][] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] var9 = null;
        int[][] var10 = null;
        int[] var11 = null;
        int[][] var12 = null;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        var11 = new int[256];
        var9 = var11;
        var8 = var9;
        var2 = var8;
        var3 = 0;
        var4_int = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (this.field_m.length <= var4_int) {
                break L2;
              } else {
                var5 = this.field_m[var4_int].field_b;
                stackOut_2_0 = 0;
                stackOut_2_1 = var5;
                stackIn_9_0 = stackOut_2_0;
                stackIn_9_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (var7 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (stackIn_3_0 <= stackIn_3_1) {
                      var8[var5] = var8[var5] + 1;
                      if ((var3 ^ -1) <= (var5 ^ -1)) {
                        break L3;
                      } else {
                        var3 = var5;
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  var4_int++;
                  if (var7 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackOut_8_0 = 1;
            stackOut_8_1 = var3;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            break L1;
          }
          var12 = new int[stackIn_9_0 + stackIn_9_1][];
          var10 = var12;
          var4 = var10;
          var5 = 0;
          L4: while (true) {
            L5: {
              L6: {
                if (var3 < var5) {
                  break L6;
                } else {
                  array$2 = new int[var11[var5]];
                  var4[var5] = array$2;
                  var11[var5] = 0;
                  var5++;
                  if (var7 != 0) {
                    break L5;
                  } else {
                    if (var7 == 0) {
                      continue L4;
                    } else {
                      break L6;
                    }
                  }
                }
              }
              if (param0 < -76) {
                break L5;
              } else {
                discarded$3 = this.a(false, (byte) -5);
                break L5;
              }
            }
            var5 = 0;
            L7: while (true) {
              L8: {
                if (this.field_m.length <= var5) {
                  break L8;
                } else {
                  L9: {
                    var6 = this.field_m[var5].field_b;
                    if ((var6 ^ -1) <= -1) {
                      var8[var6] = var8[var6] + 1;
                      var12[var6][var8[var6]] = var5;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  var5++;
                  if (var7 == 0) {
                    continue L7;
                  } else {
                    break L8;
                  }
                }
              }
              return var4;
            }
          }
        }
    }

    private final int a(int param0, short param1, oc param2, int param3) {
        int fieldTemp$1 = 0;
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_10_0 = 0;
        int[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 == 1) {
                break L1;
              } else {
                this.field_n = (byte[]) null;
                break L1;
              }
            }
            var5_int = param2.field_b[param0];
            var6 = param2.field_I[param0];
            var7 = param2.field_p[param0];
            var8 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if ((this.field_E ^ -1) >= (var8 ^ -1)) {
                    break L4;
                  } else {
                    stackOut_5_0 = var5_int ^ -1;
                    stackIn_17_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var9 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (stackIn_6_0 != (this.field_b[var8] ^ -1)) {
                          break L5;
                        } else {
                          if (this.field_I[var8] != var6) {
                            break L5;
                          } else {
                            if (this.field_p[var8] == var7) {
                              this.field_y[var8] = (short)fh.a((int) this.field_y[var8], (int) param1);
                              stackOut_10_0 = var8;
                              stackIn_11_0 = stackOut_10_0;
                              decompiledRegionSelector0 = 1;
                              break L0;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      var8++;
                      if (var9 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                L6: {
                  this.field_b[this.field_E] = var5_int;
                  this.field_I[this.field_E] = var6;
                  this.field_p[this.field_E] = var7;
                  this.field_y[this.field_E] = (short)param1;
                  stackOut_13_0 = this.field_l;
                  stackOut_13_1 = this.field_E;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  if (null != param2.field_l) {
                    stackOut_15_0 = (int[]) ((Object) stackIn_15_0);
                    stackOut_15_1 = stackIn_15_1;
                    stackOut_15_2 = param2.field_l[param0];
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    stackIn_16_2 = stackOut_15_2;
                    break L6;
                  } else {
                    stackOut_14_0 = (int[]) ((Object) stackIn_14_0);
                    stackOut_14_1 = stackIn_14_1;
                    stackOut_14_2 = -1;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    stackIn_16_2 = stackOut_14_2;
                    break L6;
                  }
                }
                stackIn_16_0[stackIn_16_1] = stackIn_16_2;
                fieldTemp$1 = this.field_E;
                this.field_E = this.field_E + 1;
                stackOut_16_0 = fieldTemp$1;
                stackIn_17_0 = stackOut_16_0;
                break L3;
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var5);
            stackOut_18_1 = new StringBuilder().append("oc.B(").append(param0).append(',').append(param1).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_17_0;
        } else {
          return stackIn_11_0;
        }
    }

    private final void a(byte[] param0, int param1) {
        byte dupTemp$1 = 0;
        RuntimeException var3 = null;
        uia var4 = null;
        uia var5 = null;
        uia var6 = null;
        uia var7 = null;
        uia var8 = null;
        uia var9 = null;
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
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var46 = 0;
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        int var57 = 0;
        int var58 = 0;
        int var59 = 0;
        int var60 = 0;
        int var61 = 0;
        int var62 = 0;
        int var63 = 0;
        int var64 = 0;
        uia var65 = null;
        uia var66 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_79_0 = 0;
        int stackIn_79_1 = 0;
        int stackIn_93_0 = 0;
        int stackIn_93_1 = 0;
        int stackIn_95_0 = 0;
        int stackIn_116_0 = 0;
        int stackIn_119_0 = 0;
        int stackIn_119_1 = 0;
        int stackIn_145_0 = 0;
        int stackIn_145_1 = 0;
        int stackIn_147_0 = 0;
        int stackIn_147_1 = 0;
        int stackIn_187_0 = 0;
        int stackIn_187_1 = 0;
        int stackIn_192_0 = 0;
        int stackIn_192_1 = 0;
        int stackIn_200_0 = 0;
        int stackIn_200_1 = 0;
        RuntimeException stackIn_209_0 = null;
        StringBuilder stackIn_209_1 = null;
        RuntimeException stackIn_210_0 = null;
        StringBuilder stackIn_210_1 = null;
        RuntimeException stackIn_211_0 = null;
        StringBuilder stackIn_211_1 = null;
        String stackIn_211_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_78_0 = 0;
        int stackOut_78_1 = 0;
        int stackOut_94_0 = 0;
        int stackOut_92_0 = 0;
        int stackOut_92_1 = 0;
        int stackOut_115_0 = 0;
        int stackOut_118_0 = 0;
        int stackOut_118_1 = 0;
        int stackOut_146_0 = 0;
        int stackOut_146_1 = 0;
        int stackOut_144_0 = 0;
        int stackOut_144_1 = 0;
        int stackOut_186_0 = 0;
        int stackOut_186_1 = 0;
        int stackOut_191_0 = 0;
        int stackOut_191_1 = 0;
        int stackOut_199_0 = 0;
        int stackOut_199_1 = 0;
        RuntimeException stackOut_208_0 = null;
        StringBuilder stackOut_208_1 = null;
        RuntimeException stackOut_210_0 = null;
        StringBuilder stackOut_210_1 = null;
        String stackOut_210_2 = null;
        RuntimeException stackOut_209_0 = null;
        StringBuilder stackOut_209_1 = null;
        String stackOut_209_2 = null;
        var64 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var65 = new uia(param0);
              var66 = var65;
              var4 = new uia(param0);
              var5 = new uia(param0);
              var6 = new uia(param0);
              var7 = new uia(param0);
              var8 = new uia(param0);
              var9 = new uia(param0);
              var66.field_h = param0.length - 23;
              this.field_E = var66.d(123);
              this.field_o = var66.d(123);
              this.field_F = var66.h(255);
              var10 = var66.h(255);
              if ((var10 & 1) != 1) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var11 = stackIn_4_0;
              if ((var10 & 2) != 2) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var12 = stackIn_7_0;
              if ((var10 & 4 ^ -1) != -5) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            L4: {
              var13 = stackIn_10_0;
              if (8 != (var10 & 8)) {
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                break L4;
              } else {
                stackOut_11_0 = 1;
                stackIn_13_0 = stackOut_11_0;
                break L4;
              }
            }
            L5: {
              var14 = stackIn_13_0;
              if (var14 == 0) {
                break L5;
              } else {
                var66.field_h = var66.field_h - 7;
                this.field_w = var66.h(255);
                var66.field_h = var66.field_h + 6;
                break L5;
              }
            }
            L6: {
              L7: {
                var15 = var66.h(param1 ^ 255);
                var16 = var66.h(255);
                var17 = var66.h(255);
                var18 = var66.h(255);
                var19 = var66.h(255);
                var20 = var66.d(param1 + 124);
                var21 = var66.d(127);
                var22 = var66.d(param1 + 127);
                var23 = var66.d(124);
                var24 = var66.d(param1 + 124);
                var25 = 0;
                var26 = 0;
                var27 = 0;
                if (0 < this.field_F) {
                  this.field_u = new byte[this.field_F];
                  var66.field_h = 0;
                  var28 = 0;
                  L8: while (true) {
                    if ((this.field_F ^ -1) >= (var28 ^ -1)) {
                      break L7;
                    } else {
                      dupTemp$1 = var65.c((byte) 52);
                      this.field_u[var28] = dupTemp$1;
                      var29 = dupTemp$1;
                      stackOut_19_0 = var29 ^ -1;
                      stackOut_19_1 = -2;
                      stackIn_30_0 = stackOut_19_0;
                      stackIn_30_1 = stackOut_19_1;
                      stackIn_20_0 = stackOut_19_0;
                      stackIn_20_1 = stackOut_19_1;
                      if (var64 != 0) {
                        break L6;
                      } else {
                        L9: {
                          if (stackIn_20_0 > stackIn_20_1) {
                            break L9;
                          } else {
                            if (var29 > 3) {
                              break L9;
                            } else {
                              var26++;
                              break L9;
                            }
                          }
                        }
                        L10: {
                          if (-1 == (var29 ^ -1)) {
                            var25++;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        L11: {
                          if (var29 != 2) {
                            break L11;
                          } else {
                            var27++;
                            break L11;
                          }
                        }
                        var28++;
                        if (var64 == 0) {
                          continue L8;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                } else {
                  break L7;
                }
              }
              var28 = this.field_F;
              var29 = var28;
              stackOut_29_0 = var28;
              stackOut_29_1 = this.field_E;
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              break L6;
            }
            L12: {
              var28 = stackIn_30_0 + stackIn_30_1;
              var30 = var28;
              if (var11 == 0) {
                break L12;
              } else {
                var28 = var28 + this.field_o;
                break L12;
              }
            }
            L13: {
              var31 = var28;
              var28 = var28 + this.field_o;
              var32 = var28;
              if (var15 != 255) {
                break L13;
              } else {
                var28 = var28 + this.field_o;
                break L13;
              }
            }
            L14: {
              var33 = var28;
              if ((var17 ^ -1) == -2) {
                var28 = var28 + this.field_o;
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              var34 = var28;
              if (1 == var19) {
                var28 = var28 + this.field_E;
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              var35 = var28;
              if (var16 != 1) {
                break L16;
              } else {
                var28 = var28 + this.field_o;
                break L16;
              }
            }
            L17: {
              var36 = var28;
              var28 = var28 + var23;
              var37 = var28;
              if ((var18 ^ -1) == -2) {
                var28 = var28 + 2 * this.field_o;
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              L19: {
                var38 = var28;
                var28 = var28 + var24;
                var39 = var28;
                var28 = var28 + this.field_o * 2;
                var40 = var28;
                var28 = var28 + var20;
                var41 = var28;
                var28 = var28 + var21;
                var42 = var28;
                var28 = var28 + var22;
                var43 = var28;
                var28 = var28 + var25 * 6;
                var44 = var28;
                var28 = var28 + 6 * var26;
                var45 = 6;
                if (-15 != (this.field_w ^ -1)) {
                  break L19;
                } else {
                  var45 = 7;
                  if (var64 == 0) {
                    break L18;
                  } else {
                    break L19;
                  }
                }
              }
              if ((this.field_w ^ -1) > -16) {
                break L18;
              } else {
                var45 = 9;
                break L18;
              }
            }
            L20: {
              var46 = var28;
              var28 = var28 + var45 * var26;
              var47 = var28;
              var28 = var28 + var26;
              var48 = var28;
              var28 = var28 + var26;
              var49 = var28;
              var28 = var28 + (var27 * 2 + var26);
              this.field_t = new short[this.field_o];
              var50 = var28;
              this.field_p = new int[this.field_E];
              this.field_a = new short[this.field_o];
              if (-2 != (var18 ^ -1)) {
                break L20;
              } else {
                if (0 >= this.field_F) {
                  break L20;
                } else {
                  this.field_g = new byte[this.field_o];
                  break L20;
                }
              }
            }
            L21: {
              if (var16 != 1) {
                break L21;
              } else {
                this.field_n = new byte[this.field_o];
                break L21;
              }
            }
            L22: {
              if (-1 <= (this.field_F ^ -1)) {
                break L22;
              } else {
                L23: {
                  this.field_K = new short[this.field_F];
                  if (0 >= var26) {
                    break L23;
                  } else {
                    this.field_i = new byte[var26];
                    this.field_j = new int[var26];
                    this.field_x = new int[var26];
                    this.field_f = new int[var26];
                    this.field_z = new byte[var26];
                    this.field_d = new int[var26];
                    break L23;
                  }
                }
                L24: {
                  this.field_q = new short[this.field_F];
                  if (0 < var27) {
                    this.field_c = new int[var27];
                    this.field_v = new int[var27];
                    break L24;
                  } else {
                    break L24;
                  }
                }
                this.field_s = new short[this.field_F];
                break L22;
              }
            }
            L25: {
              if (var11 != 0) {
                this.field_G = new byte[this.field_o];
                break L25;
              } else {
                break L25;
              }
            }
            L26: {
              L27: {
                if (255 != var15) {
                  break L27;
                } else {
                  this.field_C = new byte[this.field_o];
                  if (var64 == 0) {
                    break L26;
                  } else {
                    break L27;
                  }
                }
              }
              this.field_k = (byte)var15;
              break L26;
            }
            L28: {
              if (1 == var18) {
                this.field_r = new short[this.field_o];
                break L28;
              } else {
                break L28;
              }
            }
            L29: {
              this.field_A = new short[this.field_o];
              this.field_I = new int[this.field_E];
              this.field_J = new short[this.field_o];
              if ((var17 ^ -1) != -2) {
                break L29;
              } else {
                this.field_D = new int[this.field_o];
                break L29;
              }
            }
            L30: {
              var66.field_h = var29;
              this.field_b = new int[this.field_E];
              if (var19 == 1) {
                this.field_l = new int[this.field_E];
                break L30;
              } else {
                break L30;
              }
            }
            var4.field_h = var40;
            var5.field_h = var41;
            var6.field_h = var42;
            var7.field_h = var34;
            var51 = 0;
            var52 = 0;
            var53 = 0;
            var54 = 0;
            L31: while (true) {
              L32: {
                L33: {
                  L34: {
                    if (this.field_E <= var54) {
                      break L34;
                    } else {
                      var55 = var66.h(255);
                      var56 = 0;
                      stackOut_78_0 = -1;
                      stackOut_78_1 = var55 & 1 ^ -1;
                      stackIn_93_0 = stackOut_78_0;
                      stackIn_93_1 = stackOut_78_1;
                      stackIn_79_0 = stackOut_78_0;
                      stackIn_79_1 = stackOut_78_1;
                      if (var64 != 0) {
                        L35: while (true) {
                          if (stackIn_93_0 <= stackIn_93_1) {
                            break L33;
                          } else {
                            this.field_A[var54] = (short)var65.d(127);
                            stackOut_94_0 = var11;
                            stackIn_116_0 = stackOut_94_0;
                            stackIn_95_0 = stackOut_94_0;
                            if (var64 != 0) {
                              break L32;
                            } else {
                              L36: {
                                if (stackIn_95_0 != 0) {
                                  this.field_G[var54] = var4.c((byte) 33);
                                  break L36;
                                } else {
                                  break L36;
                                }
                              }
                              L37: {
                                if (-256 != (var15 ^ -1)) {
                                  break L37;
                                } else {
                                  this.field_C[var54] = var5.c((byte) 96);
                                  break L37;
                                }
                              }
                              L38: {
                                if (-2 == (var16 ^ -1)) {
                                  this.field_n[var54] = var6.c((byte) 119);
                                  break L38;
                                } else {
                                  break L38;
                                }
                              }
                              L39: {
                                if (var17 != 1) {
                                  break L39;
                                } else {
                                  this.field_D[var54] = var7.h(255);
                                  break L39;
                                }
                              }
                              L40: {
                                if ((var18 ^ -1) == -2) {
                                  this.field_r[var54] = (short)(var8.d(kha.b(param1, 127)) + -1);
                                  break L40;
                                } else {
                                  break L40;
                                }
                              }
                              L41: {
                                if (this.field_g != null) {
                                  L42: {
                                    if ((this.field_r[var54] ^ -1) != 0) {
                                      break L42;
                                    } else {
                                      this.field_g[var54] = (byte)-1;
                                      if (var64 == 0) {
                                        break L41;
                                      } else {
                                        break L42;
                                      }
                                    }
                                  }
                                  this.field_g[var54] = (byte)(var9.h(255) - 1);
                                  break L41;
                                } else {
                                  break L41;
                                }
                              }
                              var54++;
                              if (var64 == 0) {
                                stackOut_92_0 = var54 ^ -1;
                                stackOut_92_1 = this.field_o ^ -1;
                                stackIn_93_0 = stackOut_92_0;
                                stackIn_93_1 = stackOut_92_1;
                                continue L35;
                              } else {
                                break L33;
                              }
                            }
                          }
                        }
                      } else {
                        L43: {
                          if (stackIn_79_0 != stackIn_79_1) {
                            var56 = var4.f((byte) -128);
                            break L43;
                          } else {
                            break L43;
                          }
                        }
                        L44: {
                          var57 = 0;
                          if (-1 != (2 & var55 ^ -1)) {
                            var57 = var5.f((byte) -128);
                            break L44;
                          } else {
                            break L44;
                          }
                        }
                        L45: {
                          var58 = 0;
                          if ((var55 & 4) == 0) {
                            break L45;
                          } else {
                            var58 = var6.f((byte) -128);
                            break L45;
                          }
                        }
                        L46: {
                          this.field_b[var54] = var51 + var56;
                          this.field_I[var54] = var52 + var57;
                          this.field_p[var54] = var53 - -var58;
                          var53 = this.field_p[var54];
                          var51 = this.field_b[var54];
                          var52 = this.field_I[var54];
                          if (1 == var19) {
                            this.field_l[var54] = var7.h(kha.b(param1, 255));
                            break L46;
                          } else {
                            break L46;
                          }
                        }
                        var54++;
                        if (var64 == 0) {
                          continue L31;
                        } else {
                          break L34;
                        }
                      }
                    }
                  }
                  var66.field_h = var39;
                  var4.field_h = var30;
                  var5.field_h = var32;
                  var6.field_h = var35;
                  var7.field_h = var33;
                  var8.field_h = var37;
                  var9.field_h = var38;
                  var54 = 0;
                  L47: while (true) {
                    stackOut_92_0 = var54 ^ -1;
                    stackOut_92_1 = this.field_o ^ -1;
                    stackIn_93_0 = stackOut_92_0;
                    stackIn_93_1 = stackOut_92_1;
                    if (stackIn_93_0 <= stackIn_93_1) {
                      break L33;
                    } else {
                      this.field_A[var54] = (short)var65.d(127);
                      stackOut_94_0 = var11;
                      stackIn_116_0 = stackOut_94_0;
                      stackIn_95_0 = stackOut_94_0;
                      if (var64 != 0) {
                        break L32;
                      } else {
                        L48: {
                          if (stackIn_95_0 != 0) {
                            this.field_G[var54] = var4.c((byte) 33);
                            break L48;
                          } else {
                            break L48;
                          }
                        }
                        L49: {
                          if (-256 != (var15 ^ -1)) {
                            break L49;
                          } else {
                            this.field_C[var54] = var5.c((byte) 96);
                            break L49;
                          }
                        }
                        L50: {
                          if (-2 == (var16 ^ -1)) {
                            this.field_n[var54] = var6.c((byte) 119);
                            break L50;
                          } else {
                            break L50;
                          }
                        }
                        L51: {
                          if (var17 != 1) {
                            break L51;
                          } else {
                            this.field_D[var54] = var7.h(255);
                            break L51;
                          }
                        }
                        L52: {
                          if ((var18 ^ -1) == -2) {
                            this.field_r[var54] = (short)(var8.d(kha.b(param1, 127)) + -1);
                            break L52;
                          } else {
                            break L52;
                          }
                        }
                        L53: {
                          if (this.field_g != null) {
                            L54: {
                              if ((this.field_r[var54] ^ -1) != 0) {
                                break L54;
                              } else {
                                this.field_g[var54] = (byte)-1;
                                if (var64 == 0) {
                                  break L53;
                                } else {
                                  break L54;
                                }
                              }
                            }
                            this.field_g[var54] = (byte)(var9.h(255) - 1);
                            break L53;
                          } else {
                            break L53;
                          }
                        }
                        var54++;
                        if (var64 == 0) {
                          continue L47;
                        } else {
                          break L33;
                        }
                      }
                    }
                  }
                }
                var66.field_h = var36;
                this.field_L = -1;
                var4.field_h = var31;
                var54 = 0;
                stackOut_115_0 = 0;
                stackIn_116_0 = stackOut_115_0;
                break L32;
              }
              var55 = stackIn_116_0;
              var56 = 0;
              var57 = 0;
              var58 = 0;
              L55: while (true) {
                L56: {
                  L57: {
                    L58: {
                      L59: {
                        L60: {
                          if ((var58 ^ -1) <= (this.field_o ^ -1)) {
                            break L60;
                          } else {
                            var59 = var4.h(255);
                            stackOut_118_0 = -2;
                            stackOut_118_1 = var59 ^ -1;
                            stackIn_145_0 = stackOut_118_0;
                            stackIn_145_1 = stackOut_118_1;
                            stackIn_119_0 = stackOut_118_0;
                            stackIn_119_1 = stackOut_118_1;
                            if (var64 != 0) {
                              L61: while (true) {
                                if (stackIn_145_0 >= stackIn_145_1) {
                                  break L59;
                                } else {
                                  var59 = this.field_u[var58] & 255;
                                  stackOut_146_0 = var59 ^ -1;
                                  stackOut_146_1 = -1;
                                  stackIn_200_0 = stackOut_146_0;
                                  stackIn_200_1 = stackOut_146_1;
                                  stackIn_147_0 = stackOut_146_0;
                                  stackIn_147_1 = stackOut_146_1;
                                  if (var64 != 0) {
                                    break L58;
                                  } else {
                                    L62: {
                                      if (stackIn_147_0 != stackIn_147_1) {
                                        break L62;
                                      } else {
                                        this.field_s[var58] = (short)var65.d(123);
                                        this.field_q[var58] = (short)var65.d(125);
                                        this.field_K[var58] = (short)var65.d(123);
                                        break L62;
                                      }
                                    }
                                    L63: {
                                      if (-2 != (var59 ^ -1)) {
                                        break L63;
                                      } else {
                                        L64: {
                                          L65: {
                                            this.field_s[var58] = (short)var4.d(126);
                                            this.field_q[var58] = (short)var4.d(123);
                                            this.field_K[var58] = (short)var4.d(param1 + 122);
                                            if (15 > this.field_w) {
                                              break L65;
                                            } else {
                                              this.field_j[var58] = var5.a(-32768);
                                              this.field_f[var58] = var5.a(-32768);
                                              this.field_x[var58] = var5.a(-32768);
                                              if (var64 == 0) {
                                                break L64;
                                              } else {
                                                break L65;
                                              }
                                            }
                                          }
                                          L66: {
                                            L67: {
                                              this.field_j[var58] = var5.d(param1 + 127);
                                              if (this.field_w < 14) {
                                                break L67;
                                              } else {
                                                this.field_f[var58] = var5.a(-32768);
                                                if (var64 == 0) {
                                                  break L66;
                                                } else {
                                                  break L67;
                                                }
                                              }
                                            }
                                            this.field_f[var58] = var5.d(123);
                                            break L66;
                                          }
                                          this.field_x[var58] = var5.d(kha.b(param1, 125));
                                          break L64;
                                        }
                                        this.field_i[var58] = var6.c((byte) 87);
                                        this.field_z[var58] = var7.c((byte) 96);
                                        this.field_d[var58] = var8.c((byte) 75);
                                        break L63;
                                      }
                                    }
                                    L68: {
                                      if (var59 == 2) {
                                        L69: {
                                          L70: {
                                            this.field_s[var58] = (short)var4.d(126);
                                            this.field_q[var58] = (short)var4.d(127);
                                            this.field_K[var58] = (short)var4.d(param1 + 123);
                                            if (this.field_w >= 15) {
                                              break L70;
                                            } else {
                                              L71: {
                                                L72: {
                                                  this.field_j[var58] = var5.d(122);
                                                  if (-15 >= (this.field_w ^ -1)) {
                                                    break L72;
                                                  } else {
                                                    this.field_f[var58] = var5.d(param1 + 126);
                                                    if (var64 == 0) {
                                                      break L71;
                                                    } else {
                                                      break L72;
                                                    }
                                                  }
                                                }
                                                this.field_f[var58] = var5.a(-32768);
                                                break L71;
                                              }
                                              this.field_x[var58] = var5.d(122);
                                              if (var64 == 0) {
                                                break L69;
                                              } else {
                                                break L70;
                                              }
                                            }
                                          }
                                          this.field_j[var58] = var5.a(-32768);
                                          this.field_f[var58] = var5.a(-32768);
                                          this.field_x[var58] = var5.a(-32768);
                                          break L69;
                                        }
                                        this.field_i[var58] = var6.c((byte) 122);
                                        this.field_z[var58] = var7.c((byte) 119);
                                        this.field_d[var58] = var8.c((byte) 88);
                                        this.field_v[var58] = var8.c((byte) 82);
                                        this.field_c[var58] = var8.c((byte) 65);
                                        break L68;
                                      } else {
                                        break L68;
                                      }
                                    }
                                    L73: {
                                      if ((var59 ^ -1) == -4) {
                                        L74: {
                                          L75: {
                                            this.field_s[var58] = (short)var4.d(125);
                                            this.field_q[var58] = (short)var4.d(param1 + 124);
                                            this.field_K[var58] = (short)var4.d(125);
                                            if (-16 < (this.field_w ^ -1)) {
                                              break L75;
                                            } else {
                                              this.field_j[var58] = var5.a(kha.b(param1, -32768));
                                              this.field_f[var58] = var5.a(kha.b(param1, -32768));
                                              this.field_x[var58] = var5.a(param1 + -32768);
                                              if (var64 == 0) {
                                                break L74;
                                              } else {
                                                break L75;
                                              }
                                            }
                                          }
                                          L76: {
                                            L77: {
                                              this.field_j[var58] = var5.d(123);
                                              if ((this.field_w ^ -1) > -15) {
                                                break L77;
                                              } else {
                                                this.field_f[var58] = var5.a(-32768);
                                                if (var64 == 0) {
                                                  break L76;
                                                } else {
                                                  break L77;
                                                }
                                              }
                                            }
                                            this.field_f[var58] = var5.d(123);
                                            break L76;
                                          }
                                          this.field_x[var58] = var5.d(123);
                                          break L74;
                                        }
                                        this.field_i[var58] = var6.c((byte) 31);
                                        this.field_z[var58] = var7.c((byte) 70);
                                        this.field_d[var58] = var8.c((byte) 32);
                                        break L73;
                                      } else {
                                        break L73;
                                      }
                                    }
                                    var58++;
                                    if (var64 == 0) {
                                      stackOut_144_0 = var58;
                                      stackOut_144_1 = this.field_F;
                                      stackIn_145_0 = stackOut_144_0;
                                      stackIn_145_1 = stackOut_144_1;
                                      continue L61;
                                    } else {
                                      break L59;
                                    }
                                  }
                                }
                              }
                            } else {
                              L78: {
                                if (stackIn_119_0 != stackIn_119_1) {
                                  break L78;
                                } else {
                                  L79: {
                                    var54 = (short)(var57 + var66.f((byte) -128));
                                    var57 = var54;
                                    var55 = (short)(var66.f((byte) -128) + var57);
                                    var57 = var55;
                                    var56 = (short)(var66.f((byte) -128) + var57);
                                    var57 = var56;
                                    this.field_a[var58] = (short)var54;
                                    this.field_t[var58] = (short)var55;
                                    this.field_J[var58] = (short)var56;
                                    if ((var54 ^ -1) >= (this.field_L ^ -1)) {
                                      break L79;
                                    } else {
                                      this.field_L = var54;
                                      break L79;
                                    }
                                  }
                                  L80: {
                                    if ((this.field_L ^ -1) > (var55 ^ -1)) {
                                      this.field_L = var55;
                                      break L80;
                                    } else {
                                      break L80;
                                    }
                                  }
                                  if (this.field_L < var56) {
                                    this.field_L = var56;
                                    break L78;
                                  } else {
                                    break L78;
                                  }
                                }
                              }
                              L81: {
                                if (2 == var59) {
                                  var55 = var56;
                                  var56 = (short)(var66.f((byte) -128) + var57);
                                  this.field_a[var58] = (short)var54;
                                  var57 = var56;
                                  this.field_t[var58] = (short)var55;
                                  this.field_J[var58] = (short)var56;
                                  if (this.field_L < var56) {
                                    this.field_L = var56;
                                    break L81;
                                  } else {
                                    break L81;
                                  }
                                } else {
                                  break L81;
                                }
                              }
                              L82: {
                                if (var59 != 3) {
                                  break L82;
                                } else {
                                  var54 = var56;
                                  var56 = (short)(var66.f((byte) -128) + var57);
                                  this.field_a[var58] = (short)var54;
                                  var57 = var56;
                                  this.field_t[var58] = (short)var55;
                                  this.field_J[var58] = (short)var56;
                                  if (var56 > this.field_L) {
                                    this.field_L = var56;
                                    break L82;
                                  } else {
                                    break L82;
                                  }
                                }
                              }
                              L83: {
                                if (-5 != (var59 ^ -1)) {
                                  break L83;
                                } else {
                                  var60 = var54;
                                  var54 = var55;
                                  var55 = var60;
                                  var56 = (short)(var57 + var66.f((byte) -128));
                                  var57 = var56;
                                  this.field_a[var58] = (short)var54;
                                  this.field_t[var58] = (short)var55;
                                  this.field_J[var58] = (short)var56;
                                  if (this.field_L >= var56) {
                                    break L83;
                                  } else {
                                    this.field_L = var56;
                                    break L83;
                                  }
                                }
                              }
                              var58++;
                              if (var64 == 0) {
                                continue L55;
                              } else {
                                break L60;
                              }
                            }
                          }
                        }
                        L84: {
                          var66.field_h = var43;
                          if (param1 == 0) {
                            break L84;
                          } else {
                            this.field_e = (rga[]) null;
                            break L84;
                          }
                        }
                        this.field_L = this.field_L + 1;
                        var4.field_h = var44;
                        var5.field_h = var46;
                        var6.field_h = var47;
                        var7.field_h = var48;
                        var8.field_h = var49;
                        var58 = 0;
                        L85: while (true) {
                          stackOut_144_0 = var58;
                          stackOut_144_1 = this.field_F;
                          stackIn_145_0 = stackOut_144_0;
                          stackIn_145_1 = stackOut_144_1;
                          if (stackIn_145_0 >= stackIn_145_1) {
                            break L59;
                          } else {
                            var59 = this.field_u[var58] & 255;
                            stackOut_146_0 = var59 ^ -1;
                            stackOut_146_1 = -1;
                            stackIn_200_0 = stackOut_146_0;
                            stackIn_200_1 = stackOut_146_1;
                            stackIn_147_0 = stackOut_146_0;
                            stackIn_147_1 = stackOut_146_1;
                            if (var64 != 0) {
                              break L58;
                            } else {
                              L86: {
                                if (stackIn_147_0 != stackIn_147_1) {
                                  break L86;
                                } else {
                                  this.field_s[var58] = (short)var65.d(123);
                                  this.field_q[var58] = (short)var65.d(125);
                                  this.field_K[var58] = (short)var65.d(123);
                                  break L86;
                                }
                              }
                              L87: {
                                if (-2 != (var59 ^ -1)) {
                                  break L87;
                                } else {
                                  L88: {
                                    L89: {
                                      this.field_s[var58] = (short)var4.d(126);
                                      this.field_q[var58] = (short)var4.d(123);
                                      this.field_K[var58] = (short)var4.d(param1 + 122);
                                      if (15 > this.field_w) {
                                        break L89;
                                      } else {
                                        this.field_j[var58] = var5.a(-32768);
                                        this.field_f[var58] = var5.a(-32768);
                                        this.field_x[var58] = var5.a(-32768);
                                        if (var64 == 0) {
                                          break L88;
                                        } else {
                                          break L89;
                                        }
                                      }
                                    }
                                    L90: {
                                      L91: {
                                        this.field_j[var58] = var5.d(param1 + 127);
                                        if (this.field_w < 14) {
                                          break L91;
                                        } else {
                                          this.field_f[var58] = var5.a(-32768);
                                          if (var64 == 0) {
                                            break L90;
                                          } else {
                                            break L91;
                                          }
                                        }
                                      }
                                      this.field_f[var58] = var5.d(123);
                                      break L90;
                                    }
                                    this.field_x[var58] = var5.d(kha.b(param1, 125));
                                    break L88;
                                  }
                                  this.field_i[var58] = var6.c((byte) 87);
                                  this.field_z[var58] = var7.c((byte) 96);
                                  this.field_d[var58] = var8.c((byte) 75);
                                  break L87;
                                }
                              }
                              L92: {
                                if (var59 == 2) {
                                  L93: {
                                    L94: {
                                      this.field_s[var58] = (short)var4.d(126);
                                      this.field_q[var58] = (short)var4.d(127);
                                      this.field_K[var58] = (short)var4.d(param1 + 123);
                                      if (this.field_w >= 15) {
                                        break L94;
                                      } else {
                                        L95: {
                                          L96: {
                                            this.field_j[var58] = var5.d(122);
                                            if (-15 >= (this.field_w ^ -1)) {
                                              break L96;
                                            } else {
                                              this.field_f[var58] = var5.d(param1 + 126);
                                              if (var64 == 0) {
                                                break L95;
                                              } else {
                                                break L96;
                                              }
                                            }
                                          }
                                          this.field_f[var58] = var5.a(-32768);
                                          break L95;
                                        }
                                        this.field_x[var58] = var5.d(122);
                                        if (var64 == 0) {
                                          break L93;
                                        } else {
                                          break L94;
                                        }
                                      }
                                    }
                                    this.field_j[var58] = var5.a(-32768);
                                    this.field_f[var58] = var5.a(-32768);
                                    this.field_x[var58] = var5.a(-32768);
                                    break L93;
                                  }
                                  this.field_i[var58] = var6.c((byte) 122);
                                  this.field_z[var58] = var7.c((byte) 119);
                                  this.field_d[var58] = var8.c((byte) 88);
                                  this.field_v[var58] = var8.c((byte) 82);
                                  this.field_c[var58] = var8.c((byte) 65);
                                  break L92;
                                } else {
                                  break L92;
                                }
                              }
                              L97: {
                                if ((var59 ^ -1) == -4) {
                                  L98: {
                                    L99: {
                                      this.field_s[var58] = (short)var4.d(125);
                                      this.field_q[var58] = (short)var4.d(param1 + 124);
                                      this.field_K[var58] = (short)var4.d(125);
                                      if (-16 < (this.field_w ^ -1)) {
                                        break L99;
                                      } else {
                                        this.field_j[var58] = var5.a(kha.b(param1, -32768));
                                        this.field_f[var58] = var5.a(kha.b(param1, -32768));
                                        this.field_x[var58] = var5.a(param1 + -32768);
                                        if (var64 == 0) {
                                          break L98;
                                        } else {
                                          break L99;
                                        }
                                      }
                                    }
                                    L100: {
                                      L101: {
                                        this.field_j[var58] = var5.d(123);
                                        if ((this.field_w ^ -1) > -15) {
                                          break L101;
                                        } else {
                                          this.field_f[var58] = var5.a(-32768);
                                          if (var64 == 0) {
                                            break L100;
                                          } else {
                                            break L101;
                                          }
                                        }
                                      }
                                      this.field_f[var58] = var5.d(123);
                                      break L100;
                                    }
                                    this.field_x[var58] = var5.d(123);
                                    break L98;
                                  }
                                  this.field_i[var58] = var6.c((byte) 31);
                                  this.field_z[var58] = var7.c((byte) 70);
                                  this.field_d[var58] = var8.c((byte) 32);
                                  break L97;
                                } else {
                                  break L97;
                                }
                              }
                              var58++;
                              if (var64 == 0) {
                                continue L85;
                              } else {
                                break L59;
                              }
                            }
                          }
                        }
                      }
                      L102: {
                        var66.field_h = var50;
                        if (var12 == 0) {
                          break L102;
                        } else {
                          L103: {
                            L104: {
                              var58 = var66.h(255);
                              if (0 < var58) {
                                this.field_B = new ava[var58];
                                var59 = 0;
                                L105: while (true) {
                                  if (var59 >= var58) {
                                    break L104;
                                  } else {
                                    var60 = var66.d(param1 + 121);
                                    var61 = var66.d(122);
                                    stackOut_186_0 = 255;
                                    stackOut_186_1 = var15;
                                    stackIn_192_0 = stackOut_186_0;
                                    stackIn_192_1 = stackOut_186_1;
                                    stackIn_187_0 = stackOut_186_0;
                                    stackIn_187_1 = stackOut_186_1;
                                    if (var64 != 0) {
                                      break L103;
                                    } else {
                                      L106: {
                                        L107: {
                                          if (stackIn_187_0 != stackIn_187_1) {
                                            break L107;
                                          } else {
                                            var62 = this.field_C[var61];
                                            if (var64 == 0) {
                                              break L106;
                                            } else {
                                              break L107;
                                            }
                                          }
                                        }
                                        var62 = (byte)var15;
                                        break L106;
                                      }
                                      this.field_B[var59] = new ava(var60, (int) this.field_a[var61], (int) this.field_t[var61], (int) this.field_J[var61], (byte) var62);
                                      var59++;
                                      if (var64 == 0) {
                                        continue L105;
                                      } else {
                                        break L104;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L104;
                              }
                            }
                            var59 = var66.h(255);
                            stackOut_191_0 = -1;
                            stackOut_191_1 = var59 ^ -1;
                            stackIn_192_0 = stackOut_191_0;
                            stackIn_192_1 = stackOut_191_1;
                            break L103;
                          }
                          if (stackIn_192_0 <= stackIn_192_1) {
                            break L102;
                          } else {
                            this.field_e = new rga[var59];
                            var60 = 0;
                            L108: while (true) {
                              if (var60 >= var59) {
                                break L102;
                              } else {
                                var61 = var66.d(121);
                                var62 = var66.d(123);
                                this.field_e[var60] = new rga(var61, var62);
                                var60++;
                                if (var64 != 0) {
                                  break L57;
                                } else {
                                  if (var64 == 0) {
                                    continue L108;
                                  } else {
                                    break L102;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      if (var13 == 0) {
                        break L57;
                      } else {
                        var58 = var66.h(255);
                        stackOut_199_0 = var58 ^ -1;
                        stackOut_199_1 = -1;
                        stackIn_200_0 = stackOut_199_0;
                        stackIn_200_1 = stackOut_199_1;
                        break L58;
                      }
                    }
                    if (stackIn_200_0 < stackIn_200_1) {
                      this.field_m = new jt[var58];
                      var59 = 0;
                      L109: while (true) {
                        if ((var59 ^ -1) <= (var58 ^ -1)) {
                          break L57;
                        } else {
                          var60 = var66.d(124);
                          var61 = var66.d(param1 ^ 123);
                          var62 = var66.h(param1 + 255);
                          var63 = var66.c((byte) 60);
                          this.field_m[var59] = new jt(var60, var61, var62, var63);
                          var59++;
                          if (var64 != 0) {
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            if (var64 == 0) {
                              continue L109;
                            } else {
                              break L56;
                            }
                          }
                        }
                      }
                    } else {
                      break L56;
                    }
                  }
                  break L56;
                }
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L110: {
            var3 = decompiledCaughtException;
            stackOut_208_0 = (RuntimeException) (var3);
            stackOut_208_1 = new StringBuilder().append("oc.D(");
            stackIn_210_0 = stackOut_208_0;
            stackIn_210_1 = stackOut_208_1;
            stackIn_209_0 = stackOut_208_0;
            stackIn_209_1 = stackOut_208_1;
            if (param0 == null) {
              stackOut_210_0 = (RuntimeException) ((Object) stackIn_210_0);
              stackOut_210_1 = (StringBuilder) ((Object) stackIn_210_1);
              stackOut_210_2 = "null";
              stackIn_211_0 = stackOut_210_0;
              stackIn_211_1 = stackOut_210_1;
              stackIn_211_2 = stackOut_210_2;
              break L110;
            } else {
              stackOut_209_0 = (RuntimeException) ((Object) stackIn_209_0);
              stackOut_209_1 = (StringBuilder) ((Object) stackIn_209_1);
              stackOut_209_2 = "{...}";
              stackIn_211_0 = stackOut_209_0;
              stackIn_211_1 = stackOut_209_1;
              stackIn_211_2 = stackOut_209_2;
              break L110;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_211_0), stackIn_211_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int[][] a(boolean param0, byte param1) {
        int[] array$1 = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        int[][] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[][] var12 = null;
        int[] var13 = null;
        int[][] var14 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        byte stackOut_11_0 = 0;
        L0: {
          var9 = TombRacer.field_G ? 1 : 0;
          var13 = new int[256];
          var11 = var13;
          var10 = var11;
          var3 = var10;
          var4 = 0;
          if (param0) {
            stackOut_2_0 = this.field_E;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = this.field_L;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var5 = stackIn_3_0;
        var6_int = 0;
        L1: while (true) {
          L2: {
            L3: {
              if ((var6_int ^ -1) <= (var5 ^ -1)) {
                break L3;
              } else {
                var7 = this.field_l[var6_int];
                stackOut_5_0 = var7;
                stackIn_12_0 = stackOut_5_0;
                stackIn_6_0 = stackOut_5_0;
                if (var9 != 0) {
                  break L2;
                } else {
                  L4: {
                    if (stackIn_6_0 < 0) {
                      break L4;
                    } else {
                      var10[var7] = var10[var7] + 1;
                      if (var4 < var7) {
                        var4 = var7;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var6_int++;
                  if (var9 == 0) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
              }
            }
            stackOut_11_0 = param1;
            stackIn_12_0 = stackOut_11_0;
            break L2;
          }
          L5: {
            if (stackIn_12_0 == 64) {
              break L5;
            } else {
              this.field_g = (byte[]) null;
              break L5;
            }
          }
          var14 = new int[var4 + 1][];
          var12 = var14;
          var6 = var12;
          var7 = 0;
          L6: while (true) {
            L7: {
              L8: {
                if ((var7 ^ -1) < (var4 ^ -1)) {
                  break L8;
                } else {
                  array$1 = new int[var13[var7]];
                  var6[var7] = array$1;
                  var13[var7] = 0;
                  var7++;
                  if (var9 != 0) {
                    break L7;
                  } else {
                    if (var9 == 0) {
                      continue L6;
                    } else {
                      break L8;
                    }
                  }
                }
              }
              var7 = 0;
              break L7;
            }
            L9: while (true) {
              L10: {
                if ((var7 ^ -1) <= (var5 ^ -1)) {
                  break L10;
                } else {
                  L11: {
                    var8 = this.field_l[var7];
                    if ((var8 ^ -1) > -1) {
                      break L11;
                    } else {
                      var10[var8] = var10[var8] + 1;
                      var14[var8][var10[var8]] = var7;
                      break L11;
                    }
                  }
                  var7++;
                  if (var9 == 0) {
                    continue L9;
                  } else {
                    break L10;
                  }
                }
              }
              return var6;
            }
          }
        }
    }

    private final void a(int param0, byte[] param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        uia var5 = null;
        uia var6 = null;
        uia var7 = null;
        uia var8 = null;
        uia var9 = null;
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
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_97_0 = 0;
        int stackIn_97_1 = 0;
        int stackIn_107_0 = 0;
        int stackIn_117_0 = 0;
        RuntimeException stackIn_126_0 = null;
        StringBuilder stackIn_126_1 = null;
        RuntimeException stackIn_127_0 = null;
        StringBuilder stackIn_127_1 = null;
        RuntimeException stackIn_128_0 = null;
        StringBuilder stackIn_128_1 = null;
        String stackIn_128_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_67_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_70_1 = 0;
        int stackOut_96_0 = 0;
        int stackOut_96_1 = 0;
        int stackOut_106_0 = 0;
        int stackOut_116_0 = 0;
        RuntimeException stackOut_125_0 = null;
        StringBuilder stackOut_125_1 = null;
        RuntimeException stackOut_127_0 = null;
        StringBuilder stackOut_127_1 = null;
        String stackOut_127_2 = null;
        RuntimeException stackOut_126_0 = null;
        StringBuilder stackOut_126_1 = null;
        String stackOut_126_2 = null;
        var43 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 0;
              var4 = 0;
              var5 = new uia(param1);
              var6 = new uia(param1);
              var7 = new uia(param1);
              var8 = new uia(param1);
              var9 = new uia(param1);
              var5.field_h = -18 + param1.length;
              this.field_E = var5.d(param0 + -5349);
              this.field_o = var5.d(124);
              this.field_F = var5.h(255);
              var10 = var5.h(param0 + -5219);
              var11 = var5.h(param0 ^ 5533);
              var12 = var5.h(255);
              var13 = var5.h(255);
              var14 = var5.h(param0 ^ 5533);
              var15 = var5.d(123);
              var16 = var5.d(125);
              var17 = var5.d(param0 + -5348);
              var18 = var5.d(127);
              var19 = 0;
              var20 = var19;
              var19 = var19 + this.field_E;
              var21 = var19;
              var19 = var19 + this.field_o;
              var22 = var19;
              if (-256 == (var11 ^ -1)) {
                var19 = var19 + this.field_o;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var23 = var19;
              if (1 == var13) {
                var19 = var19 + this.field_o;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var24 = var19;
              if (1 == var10) {
                var19 = var19 + this.field_o;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var25 = var19;
              if (var14 == 1) {
                var19 = var19 + this.field_E;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var26 = var19;
              if (1 == var12) {
                var19 = var19 + this.field_o;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              var27 = var19;
              var19 = var19 + var18;
              var28 = var19;
              var19 = var19 + this.field_o * 2;
              var29 = var19;
              var19 = var19 + this.field_F * 6;
              var30 = var19;
              var19 = var19 + var15;
              var31 = var19;
              var19 = var19 + var16;
              var32 = var19;
              this.field_p = new int[this.field_E];
              this.field_t = new short[this.field_o];
              if (-1 <= (this.field_F ^ -1)) {
                break L6;
              } else {
                this.field_u = new byte[this.field_F];
                this.field_s = new short[this.field_F];
                this.field_K = new short[this.field_F];
                this.field_q = new short[this.field_F];
                break L6;
              }
            }
            L7: {
              if (-2 == (var13 ^ -1)) {
                this.field_D = new int[this.field_o];
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              L9: {
                this.field_I = new int[this.field_E];
                var19 = var19 + var17;
                this.field_a = new short[this.field_o];
                if (255 == var11) {
                  break L9;
                } else {
                  this.field_k = (byte)var11;
                  if (var43 == 0) {
                    break L8;
                  } else {
                    break L9;
                  }
                }
              }
              this.field_C = new byte[this.field_o];
              break L8;
            }
            L10: {
              this.field_J = new short[this.field_o];
              this.field_A = new short[this.field_o];
              var5.field_h = var20;
              if ((var14 ^ -1) != -2) {
                break L10;
              } else {
                this.field_l = new int[this.field_E];
                break L10;
              }
            }
            L11: {
              if (1 == var10) {
                this.field_G = new byte[this.field_o];
                this.field_g = new byte[this.field_o];
                this.field_r = new short[this.field_o];
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              this.field_b = new int[this.field_E];
              if ((var12 ^ -1) != -2) {
                break L12;
              } else {
                this.field_n = new byte[this.field_o];
                break L12;
              }
            }
            var6.field_h = var30;
            var7.field_h = var31;
            var8.field_h = var32;
            var9.field_h = var25;
            var33 = 0;
            var34 = 0;
            var35 = 0;
            var36 = 0;
            L13: while (true) {
              L14: {
                L15: {
                  L16: {
                    if (this.field_E <= var36) {
                      break L16;
                    } else {
                      var37 = var5.h(255);
                      var38 = 0;
                      stackOut_34_0 = -1;
                      stackOut_34_1 = var37 & 1 ^ -1;
                      stackIn_47_0 = stackOut_34_0;
                      stackIn_47_1 = stackOut_34_1;
                      stackIn_35_0 = stackOut_34_0;
                      stackIn_35_1 = stackOut_34_1;
                      if (var43 != 0) {
                        L17: while (true) {
                          if (stackIn_47_0 >= stackIn_47_1) {
                            break L15;
                          } else {
                            this.field_A[var36] = (short)var5.d(param0 + -5352);
                            stackOut_48_0 = -2;
                            stackIn_68_0 = stackOut_48_0;
                            stackIn_49_0 = stackOut_48_0;
                            if (var43 != 0) {
                              break L14;
                            } else {
                              L18: {
                                if (stackIn_49_0 == (var10 ^ -1)) {
                                  L19: {
                                    L20: {
                                      var37 = var6.h(255);
                                      if ((var37 & 1 ^ -1) != -2) {
                                        break L20;
                                      } else {
                                        this.field_G[var36] = (byte) 1;
                                        var3_int = 1;
                                        if (var43 == 0) {
                                          break L19;
                                        } else {
                                          break L20;
                                        }
                                      }
                                    }
                                    this.field_G[var36] = (byte) 0;
                                    break L19;
                                  }
                                  L21: {
                                    if (-3 != (2 & var37 ^ -1)) {
                                      break L21;
                                    } else {
                                      this.field_g[var36] = (byte)(var37 >> -852499038);
                                      this.field_r[var36] = this.field_A[var36];
                                      this.field_A[var36] = (short)127;
                                      if (0 != (this.field_r[var36] ^ -1)) {
                                        var4 = 1;
                                        if (var43 == 0) {
                                          break L18;
                                        } else {
                                          break L21;
                                        }
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                  this.field_g[var36] = (byte)-1;
                                  this.field_r[var36] = (short)-1;
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              L22: {
                                if (-256 != (var11 ^ -1)) {
                                  break L22;
                                } else {
                                  this.field_C[var36] = var7.c((byte) 92);
                                  break L22;
                                }
                              }
                              L23: {
                                if (1 == var12) {
                                  this.field_n[var36] = var8.c((byte) 87);
                                  break L23;
                                } else {
                                  break L23;
                                }
                              }
                              L24: {
                                if (1 != var13) {
                                  break L24;
                                } else {
                                  this.field_D[var36] = var9.h(255);
                                  break L24;
                                }
                              }
                              var36++;
                              if (var43 == 0) {
                                stackOut_46_0 = this.field_o ^ -1;
                                stackOut_46_1 = var36 ^ -1;
                                stackIn_47_0 = stackOut_46_0;
                                stackIn_47_1 = stackOut_46_1;
                                continue L17;
                              } else {
                                break L15;
                              }
                            }
                          }
                        }
                      } else {
                        L25: {
                          if (stackIn_35_0 == stackIn_35_1) {
                            break L25;
                          } else {
                            var38 = var6.f((byte) -128);
                            break L25;
                          }
                        }
                        L26: {
                          var39 = 0;
                          if ((var37 & 2) == 0) {
                            break L26;
                          } else {
                            var39 = var7.f((byte) -128);
                            break L26;
                          }
                        }
                        L27: {
                          var40 = 0;
                          if ((4 & var37 ^ -1) == -1) {
                            break L27;
                          } else {
                            var40 = var8.f((byte) -128);
                            break L27;
                          }
                        }
                        L28: {
                          this.field_b[var36] = var33 - -var38;
                          this.field_I[var36] = var39 + var34;
                          this.field_p[var36] = var40 + var35;
                          var35 = this.field_p[var36];
                          var34 = this.field_I[var36];
                          var33 = this.field_b[var36];
                          if (-2 == (var14 ^ -1)) {
                            this.field_l[var36] = var9.h(255);
                            break L28;
                          } else {
                            break L28;
                          }
                        }
                        var36++;
                        if (var43 == 0) {
                          continue L13;
                        } else {
                          break L16;
                        }
                      }
                    }
                  }
                  var5.field_h = var28;
                  var6.field_h = var24;
                  var7.field_h = var22;
                  var8.field_h = var26;
                  var9.field_h = var23;
                  var36 = 0;
                  L29: while (true) {
                    stackOut_46_0 = this.field_o ^ -1;
                    stackOut_46_1 = var36 ^ -1;
                    stackIn_47_0 = stackOut_46_0;
                    stackIn_47_1 = stackOut_46_1;
                    if (stackIn_47_0 >= stackIn_47_1) {
                      break L15;
                    } else {
                      this.field_A[var36] = (short)var5.d(param0 + -5352);
                      stackOut_48_0 = -2;
                      stackIn_68_0 = stackOut_48_0;
                      stackIn_49_0 = stackOut_48_0;
                      if (var43 != 0) {
                        break L14;
                      } else {
                        L30: {
                          if (stackIn_49_0 == (var10 ^ -1)) {
                            L31: {
                              L32: {
                                var37 = var6.h(255);
                                if ((var37 & 1 ^ -1) != -2) {
                                  break L32;
                                } else {
                                  this.field_G[var36] = (byte) 1;
                                  var3_int = 1;
                                  if (var43 == 0) {
                                    break L31;
                                  } else {
                                    break L32;
                                  }
                                }
                              }
                              this.field_G[var36] = (byte) 0;
                              break L31;
                            }
                            L33: {
                              if (-3 != (2 & var37 ^ -1)) {
                                break L33;
                              } else {
                                this.field_g[var36] = (byte)(var37 >> -852499038);
                                this.field_r[var36] = this.field_A[var36];
                                this.field_A[var36] = (short)127;
                                if (0 != (this.field_r[var36] ^ -1)) {
                                  var4 = 1;
                                  if (var43 == 0) {
                                    break L30;
                                  } else {
                                    break L33;
                                  }
                                } else {
                                  break L30;
                                }
                              }
                            }
                            this.field_g[var36] = (byte)-1;
                            this.field_r[var36] = (short)-1;
                            break L30;
                          } else {
                            break L30;
                          }
                        }
                        L34: {
                          if (-256 != (var11 ^ -1)) {
                            break L34;
                          } else {
                            this.field_C[var36] = var7.c((byte) 92);
                            break L34;
                          }
                        }
                        L35: {
                          if (1 == var12) {
                            this.field_n[var36] = var8.c((byte) 87);
                            break L35;
                          } else {
                            break L35;
                          }
                        }
                        L36: {
                          if (1 != var13) {
                            break L36;
                          } else {
                            this.field_D[var36] = var9.h(255);
                            break L36;
                          }
                        }
                        var36++;
                        if (var43 == 0) {
                          continue L29;
                        } else {
                          break L15;
                        }
                      }
                    }
                  }
                }
                this.field_L = -1;
                var5.field_h = var27;
                var6.field_h = var21;
                var36 = 0;
                stackOut_67_0 = 0;
                stackIn_68_0 = stackOut_67_0;
                break L14;
              }
              var37 = stackIn_68_0;
              var38 = 0;
              var39 = 0;
              var40 = 0;
              L37: while (true) {
                L38: {
                  L39: {
                    if (var40 >= this.field_o) {
                      break L39;
                    } else {
                      var41 = var6.h(255);
                      stackOut_70_0 = -2;
                      stackOut_70_1 = var41 ^ -1;
                      stackIn_97_0 = stackOut_70_0;
                      stackIn_97_1 = stackOut_70_1;
                      stackIn_71_0 = stackOut_70_0;
                      stackIn_71_1 = stackOut_70_1;
                      if (var43 != 0) {
                        break L38;
                      } else {
                        L40: {
                          if (stackIn_71_0 == stackIn_71_1) {
                            L41: {
                              var36 = (short)(var39 + var5.f((byte) -128));
                              var39 = var36;
                              var37 = (short)(var39 + var5.f((byte) -128));
                              var39 = var37;
                              var38 = (short)(var39 + var5.f((byte) -128));
                              var39 = var38;
                              this.field_a[var40] = (short)var36;
                              this.field_t[var40] = (short)var37;
                              this.field_J[var40] = (short)var38;
                              if (this.field_L < var36) {
                                this.field_L = var36;
                                break L41;
                              } else {
                                break L41;
                              }
                            }
                            L42: {
                              if ((var37 ^ -1) < (this.field_L ^ -1)) {
                                this.field_L = var37;
                                break L42;
                              } else {
                                break L42;
                              }
                            }
                            if (var38 <= this.field_L) {
                              break L40;
                            } else {
                              this.field_L = var38;
                              break L40;
                            }
                          } else {
                            break L40;
                          }
                        }
                        L43: {
                          if (2 == var41) {
                            var37 = var38;
                            var38 = (short)(var5.f((byte) -128) + var39);
                            this.field_a[var40] = (short)var36;
                            var39 = var38;
                            this.field_t[var40] = (short)var37;
                            this.field_J[var40] = (short)var38;
                            if (this.field_L < var38) {
                              this.field_L = var38;
                              break L43;
                            } else {
                              break L43;
                            }
                          } else {
                            break L43;
                          }
                        }
                        L44: {
                          if (3 == var41) {
                            var36 = var38;
                            var38 = (short)(var39 + var5.f((byte) -128));
                            this.field_a[var40] = (short)var36;
                            var39 = var38;
                            this.field_t[var40] = (short)var37;
                            this.field_J[var40] = (short)var38;
                            if ((this.field_L ^ -1) > (var38 ^ -1)) {
                              this.field_L = var38;
                              break L44;
                            } else {
                              break L44;
                            }
                          } else {
                            break L44;
                          }
                        }
                        L45: {
                          if ((var41 ^ -1) == -5) {
                            var42 = var36;
                            var36 = var37;
                            var37 = var42;
                            var38 = (short)(var39 + var5.f((byte) -128));
                            this.field_a[var40] = (short)var36;
                            var39 = var38;
                            this.field_t[var40] = (short)var37;
                            this.field_J[var40] = (short)var38;
                            if (this.field_L >= var38) {
                              break L45;
                            } else {
                              this.field_L = var38;
                              break L45;
                            }
                          } else {
                            break L45;
                          }
                        }
                        var40++;
                        if (var43 == 0) {
                          continue L37;
                        } else {
                          break L39;
                        }
                      }
                    }
                  }
                  var5.field_h = var29;
                  this.field_L = this.field_L + 1;
                  var40 = 0;
                  stackOut_96_0 = param0;
                  stackOut_96_1 = 5474;
                  stackIn_97_0 = stackOut_96_0;
                  stackIn_97_1 = stackOut_96_1;
                  break L38;
                }
                if (stackIn_97_0 == stackIn_97_1) {
                  L46: while (true) {
                    L47: {
                      L48: {
                        if ((this.field_F ^ -1) >= (var40 ^ -1)) {
                          break L48;
                        } else {
                          this.field_u[var40] = (byte) 0;
                          this.field_s[var40] = (short)var5.d(kha.b(param0, 5407));
                          this.field_q[var40] = (short)var5.d(126);
                          this.field_K[var40] = (short)var5.d(kha.b(param0, 5407));
                          var40++;
                          if (var43 != 0) {
                            break L47;
                          } else {
                            if (var43 == 0) {
                              continue L46;
                            } else {
                              break L48;
                            }
                          }
                        }
                      }
                      if (null == this.field_g) {
                        break L47;
                      } else {
                        var40 = 0;
                        var41 = 0;
                        L49: while (true) {
                          L50: {
                            L51: {
                              if ((var41 ^ -1) <= (this.field_o ^ -1)) {
                                break L51;
                              } else {
                                var42 = 255 & this.field_g[var41];
                                stackOut_106_0 = 255;
                                stackIn_117_0 = stackOut_106_0;
                                stackIn_107_0 = stackOut_106_0;
                                if (var43 != 0) {
                                  break L50;
                                } else {
                                  L52: {
                                    if (stackIn_107_0 != var42) {
                                      L53: {
                                        if (this.field_a[var41] != (this.field_s[var42] & 65535)) {
                                          break L53;
                                        } else {
                                          if ((this.field_t[var41] ^ -1) != (65535 & this.field_q[var42] ^ -1)) {
                                            break L53;
                                          } else {
                                            if ((65535 & this.field_K[var42]) != this.field_J[var41]) {
                                              break L53;
                                            } else {
                                              this.field_g[var41] = (byte)-1;
                                              if (var43 == 0) {
                                                break L52;
                                              } else {
                                                break L53;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var40 = 1;
                                      break L52;
                                    } else {
                                      break L52;
                                    }
                                  }
                                  var41++;
                                  if (var43 == 0) {
                                    continue L49;
                                  } else {
                                    break L51;
                                  }
                                }
                              }
                            }
                            stackOut_116_0 = var40;
                            stackIn_117_0 = stackOut_116_0;
                            break L50;
                          }
                          if (stackIn_117_0 != 0) {
                            break L47;
                          } else {
                            this.field_g = null;
                            break L47;
                          }
                        }
                      }
                    }
                    L54: {
                      if (var3_int != 0) {
                        break L54;
                      } else {
                        this.field_G = null;
                        break L54;
                      }
                    }
                    L55: {
                      if (var4 == 0) {
                        this.field_r = null;
                        break L55;
                      } else {
                        break L55;
                      }
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L56: {
            var3 = decompiledCaughtException;
            stackOut_125_0 = (RuntimeException) (var3);
            stackOut_125_1 = new StringBuilder().append("oc.G(").append(param0).append(',');
            stackIn_127_0 = stackOut_125_0;
            stackIn_127_1 = stackOut_125_1;
            stackIn_126_0 = stackOut_125_0;
            stackIn_126_1 = stackOut_125_1;
            if (param1 == null) {
              stackOut_127_0 = (RuntimeException) ((Object) stackIn_127_0);
              stackOut_127_1 = (StringBuilder) ((Object) stackIn_127_1);
              stackOut_127_2 = "null";
              stackIn_128_0 = stackOut_127_0;
              stackIn_128_1 = stackOut_127_1;
              stackIn_128_2 = stackOut_127_2;
              break L56;
            } else {
              stackOut_126_0 = (RuntimeException) ((Object) stackIn_126_0);
              stackOut_126_1 = (StringBuilder) ((Object) stackIn_126_1);
              stackOut_126_2 = "{...}";
              stackIn_128_0 = stackOut_126_0;
              stackIn_128_1 = stackOut_126_1;
              stackIn_128_2 = stackOut_126_2;
              break L56;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_128_0), stackIn_128_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    oc(byte[] param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        this.field_k = (byte) 0;
        this.field_L = 0;
        this.field_o = 0;
        this.field_F = 0;
        this.field_w = 12;
        this.field_E = 0;
        try {
          L0: {
            L1: {
              L2: {
                if (0 != (param0[param0.length + -1] ^ -1)) {
                  break L2;
                } else {
                  if ((param0[param0.length + -2] ^ -1) != 0) {
                    break L2;
                  } else {
                    this.a(param0, 0);
                    if (!TombRacer.field_G) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              this.a(5474, param0);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var2);
            stackOut_6_1 = new StringBuilder().append("oc.<init>(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    oc(oc[] param0, int param1) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        oc var13_ref_oc = null;
        int var13 = 0;
        oc var14_ref_oc = null;
        int var14 = 0;
        int var15_int = 0;
        oc var15 = null;
        jt var16_ref_jt = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        oc stackIn_57_0 = null;
        int stackIn_66_0 = 0;
        int stackIn_87_0 = 0;
        oc stackIn_99_0 = null;
        int stackIn_101_0 = 0;
        int stackIn_101_1 = 0;
        int stackIn_107_0 = 0;
        byte[] stackIn_109_0 = null;
        int stackIn_109_1 = 0;
        byte[] stackIn_110_0 = null;
        int stackIn_110_1 = 0;
        byte[] stackIn_111_0 = null;
        int stackIn_111_1 = 0;
        byte[] stackIn_112_0 = null;
        int stackIn_112_1 = 0;
        int stackIn_112_2 = 0;
        int stackIn_115_0 = 0;
        int stackIn_118_0 = 0;
        int stackIn_118_1 = 0;
        RuntimeException stackIn_129_0 = null;
        StringBuilder stackIn_129_1 = null;
        RuntimeException stackIn_130_0 = null;
        StringBuilder stackIn_130_1 = null;
        RuntimeException stackIn_131_0 = null;
        StringBuilder stackIn_131_1 = null;
        String stackIn_131_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        oc stackOut_56_0 = null;
        int stackOut_65_0 = 0;
        int stackOut_86_0 = 0;
        Object stackOut_98_0 = null;
        int stackOut_100_0 = 0;
        int stackOut_100_1 = 0;
        int stackOut_106_0 = 0;
        byte[] stackOut_108_0 = null;
        int stackOut_108_1 = 0;
        byte[] stackOut_109_0 = null;
        int stackOut_109_1 = 0;
        byte[] stackOut_110_0 = null;
        int stackOut_110_1 = 0;
        int stackOut_110_2 = 0;
        byte[] stackOut_111_0 = null;
        int stackOut_111_1 = 0;
        int stackOut_111_2 = 0;
        int stackOut_114_0 = 0;
        int stackOut_117_0 = 0;
        int stackOut_117_1 = 0;
        RuntimeException stackOut_128_0 = null;
        StringBuilder stackOut_128_1 = null;
        RuntimeException stackOut_130_0 = null;
        StringBuilder stackOut_130_1 = null;
        String stackOut_130_2 = null;
        RuntimeException stackOut_129_0 = null;
        StringBuilder stackOut_129_1 = null;
        String stackOut_129_2 = null;
        var19 = TombRacer.field_G ? 1 : 0;
        this.field_k = (byte) 0;
        this.field_L = 0;
        this.field_o = 0;
        this.field_F = 0;
        this.field_w = 12;
        this.field_E = 0;
        try {
          L0: {
            this.field_F = 0;
            this.field_o = 0;
            this.field_E = 0;
            var3_int = 0;
            var4 = 0;
            var5 = 0;
            var6 = 0;
            var7 = 0;
            var8 = 0;
            var9 = 0;
            var10 = 0;
            this.field_k = (byte) -1;
            var11 = 0;
            var12 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (param1 <= var12) {
                    break L3;
                  } else {
                    var13_ref_oc = param0[var12];
                    if (var19 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (var13_ref_oc == null) {
                          break L4;
                        } else {
                          L5: {
                            this.field_E = this.field_E + var13_ref_oc.field_E;
                            this.field_o = this.field_o + var13_ref_oc.field_o;
                            this.field_F = this.field_F + var13_ref_oc.field_F;
                            if (var13_ref_oc.field_e == null) {
                              break L5;
                            } else {
                              var4 = var4 + var13_ref_oc.field_e.length;
                              break L5;
                            }
                          }
                          L6: {
                            if (null == var13_ref_oc.field_m) {
                              break L6;
                            } else {
                              var5 = var5 + var13_ref_oc.field_m.length;
                              break L6;
                            }
                          }
                          L7: {
                            if (null == var13_ref_oc.field_B) {
                              break L7;
                            } else {
                              var3_int = var3_int + var13_ref_oc.field_B.length;
                              break L7;
                            }
                          }
                          L8: {
                            stackOut_11_0 = var6;
                            stackIn_13_0 = stackOut_11_0;
                            stackIn_12_0 = stackOut_11_0;
                            if (null == var13_ref_oc.field_G) {
                              stackOut_13_0 = stackIn_13_0;
                              stackOut_13_1 = 0;
                              stackIn_14_0 = stackOut_13_0;
                              stackIn_14_1 = stackOut_13_1;
                              break L8;
                            } else {
                              stackOut_12_0 = stackIn_12_0;
                              stackOut_12_1 = 1;
                              stackIn_14_0 = stackOut_12_0;
                              stackIn_14_1 = stackOut_12_1;
                              break L8;
                            }
                          }
                          L9: {
                            var6 = stackIn_14_0 | stackIn_14_1;
                            stackOut_14_0 = var11;
                            stackIn_16_0 = stackOut_14_0;
                            stackIn_15_0 = stackOut_14_0;
                            if (null == var13_ref_oc.field_D) {
                              stackOut_16_0 = stackIn_16_0;
                              stackOut_16_1 = 0;
                              stackIn_17_0 = stackOut_16_0;
                              stackIn_17_1 = stackOut_16_1;
                              break L9;
                            } else {
                              stackOut_15_0 = stackIn_15_0;
                              stackOut_15_1 = 1;
                              stackIn_17_0 = stackOut_15_0;
                              stackIn_17_1 = stackOut_15_1;
                              break L9;
                            }
                          }
                          L10: {
                            L11: {
                              var11 = stackIn_17_0 | stackIn_17_1;
                              if (null == var13_ref_oc.field_C) {
                                break L11;
                              } else {
                                var7 = 1;
                                if (var19 == 0) {
                                  break L10;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            L12: {
                              if ((this.field_k ^ -1) != 0) {
                                break L12;
                              } else {
                                this.field_k = var13_ref_oc.field_k;
                                break L12;
                              }
                            }
                            if ((this.field_k ^ -1) == (var13_ref_oc.field_k ^ -1)) {
                              break L10;
                            } else {
                              var7 = 1;
                              break L10;
                            }
                          }
                          L13: {
                            stackOut_23_0 = var8;
                            stackIn_25_0 = stackOut_23_0;
                            stackIn_24_0 = stackOut_23_0;
                            if (null == var13_ref_oc.field_n) {
                              stackOut_25_0 = stackIn_25_0;
                              stackOut_25_1 = 0;
                              stackIn_26_0 = stackOut_25_0;
                              stackIn_26_1 = stackOut_25_1;
                              break L13;
                            } else {
                              stackOut_24_0 = stackIn_24_0;
                              stackOut_24_1 = 1;
                              stackIn_26_0 = stackOut_24_0;
                              stackIn_26_1 = stackOut_24_1;
                              break L13;
                            }
                          }
                          L14: {
                            var8 = stackIn_26_0 | stackIn_26_1;
                            stackOut_26_0 = var10;
                            stackIn_28_0 = stackOut_26_0;
                            stackIn_27_0 = stackOut_26_0;
                            if (null == var13_ref_oc.field_r) {
                              stackOut_28_0 = stackIn_28_0;
                              stackOut_28_1 = 0;
                              stackIn_29_0 = stackOut_28_0;
                              stackIn_29_1 = stackOut_28_1;
                              break L14;
                            } else {
                              stackOut_27_0 = stackIn_27_0;
                              stackOut_27_1 = 1;
                              stackIn_29_0 = stackOut_27_0;
                              stackIn_29_1 = stackOut_27_1;
                              break L14;
                            }
                          }
                          L15: {
                            var10 = stackIn_29_0 | stackIn_29_1;
                            stackOut_29_0 = var9;
                            stackIn_31_0 = stackOut_29_0;
                            stackIn_30_0 = stackOut_29_0;
                            if (null == var13_ref_oc.field_g) {
                              stackOut_31_0 = stackIn_31_0;
                              stackOut_31_1 = 0;
                              stackIn_32_0 = stackOut_31_0;
                              stackIn_32_1 = stackOut_31_1;
                              break L15;
                            } else {
                              stackOut_30_0 = stackIn_30_0;
                              stackOut_30_1 = 1;
                              stackIn_32_0 = stackOut_30_0;
                              stackIn_32_1 = stackOut_30_1;
                              break L15;
                            }
                          }
                          var9 = stackIn_32_0 | stackIn_32_1;
                          break L4;
                        }
                      }
                      var12++;
                      if (var19 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if ((var4 ^ -1) >= -1) {
                  break L2;
                } else {
                  this.field_e = new rga[var4];
                  break L2;
                }
              }
              L16: {
                if (var9 == 0) {
                  break L16;
                } else {
                  this.field_g = new byte[this.field_o];
                  break L16;
                }
              }
              L17: {
                this.field_a = new short[this.field_o];
                if (var10 == 0) {
                  break L17;
                } else {
                  this.field_r = new short[this.field_o];
                  break L17;
                }
              }
              L18: {
                if (this.field_F <= 0) {
                  break L18;
                } else {
                  this.field_v = new int[this.field_F];
                  this.field_z = new byte[this.field_F];
                  this.field_c = new int[this.field_F];
                  this.field_f = new int[this.field_F];
                  this.field_s = new short[this.field_F];
                  this.field_q = new short[this.field_F];
                  this.field_x = new int[this.field_F];
                  this.field_j = new int[this.field_F];
                  this.field_K = new short[this.field_F];
                  this.field_i = new byte[this.field_F];
                  this.field_d = new int[this.field_F];
                  this.field_u = new byte[this.field_F];
                  break L18;
                }
              }
              L19: {
                this.field_A = new short[this.field_o];
                if (var7 == 0) {
                  break L19;
                } else {
                  this.field_C = new byte[this.field_o];
                  break L19;
                }
              }
              L20: {
                this.field_I = new int[this.field_E];
                this.field_p = new int[this.field_E];
                this.field_y = new short[this.field_E];
                this.field_h = new short[this.field_o];
                this.field_J = new short[this.field_o];
                this.field_b = new int[this.field_E];
                if (var11 == 0) {
                  break L20;
                } else {
                  this.field_D = new int[this.field_o];
                  break L20;
                }
              }
              L21: {
                this.field_l = new int[this.field_E];
                if ((var5 ^ -1) >= -1) {
                  break L21;
                } else {
                  this.field_m = new jt[var5];
                  break L21;
                }
              }
              L22: {
                this.field_t = new short[this.field_o];
                if (var6 == 0) {
                  break L22;
                } else {
                  this.field_G = new byte[this.field_o];
                  break L22;
                }
              }
              L23: {
                if (var8 == 0) {
                  break L23;
                } else {
                  this.field_n = new byte[this.field_o];
                  break L23;
                }
              }
              L24: {
                if (-1 <= (var3_int ^ -1)) {
                  break L24;
                } else {
                  this.field_B = new ava[var3_int];
                  break L24;
                }
              }
              var3_int = 0;
              var5 = 0;
              var4 = 0;
              this.field_o = 0;
              this.field_F = 0;
              this.field_E = 0;
              var12 = 0;
              L25: while (true) {
                L26: {
                  L27: {
                    if ((param1 ^ -1) >= (var12 ^ -1)) {
                      break L27;
                    } else {
                      var13 = (short)(1 << var12);
                      var14_ref_oc = param0[var12];
                      stackOut_56_0 = (oc) (var14_ref_oc);
                      stackIn_99_0 = stackOut_56_0;
                      stackIn_57_0 = stackOut_56_0;
                      if (var19 != 0) {
                        break L26;
                      } else {
                        L28: {
                          L29: {
                            if (stackIn_57_0 == null) {
                              break L29;
                            } else {
                              L30: {
                                L31: {
                                  if (var14_ref_oc.field_m == null) {
                                    break L31;
                                  } else {
                                    var15_int = 0;
                                    L32: while (true) {
                                      if (var15_int >= var14_ref_oc.field_m.length) {
                                        break L31;
                                      } else {
                                        var16_ref_jt = var14_ref_oc.field_m[var15_int];
                                        incrementValue$2 = var5;
                                        var5++;
                                        this.field_m[incrementValue$2] = var16_ref_jt.a(9677, var16_ref_jt.field_a + this.field_o);
                                        var15_int++;
                                        if (var19 != 0) {
                                          break L30;
                                        } else {
                                          if (var19 == 0) {
                                            continue L32;
                                          } else {
                                            break L31;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                var15_int = 0;
                                break L30;
                              }
                              L33: while (true) {
                                L34: {
                                  L35: {
                                    L36: {
                                      L37: {
                                        if ((var14_ref_oc.field_o ^ -1) >= (var15_int ^ -1)) {
                                          break L37;
                                        } else {
                                          stackOut_65_0 = var6;
                                          stackIn_87_0 = stackOut_65_0;
                                          stackIn_66_0 = stackOut_65_0;
                                          if (var19 != 0) {
                                            break L36;
                                          } else {
                                            L38: {
                                              if (stackIn_66_0 == 0) {
                                                break L38;
                                              } else {
                                                if (null == var14_ref_oc.field_G) {
                                                  break L38;
                                                } else {
                                                  this.field_G[this.field_o] = var14_ref_oc.field_G[var15_int];
                                                  break L38;
                                                }
                                              }
                                            }
                                            L39: {
                                              if (var7 == 0) {
                                                break L39;
                                              } else {
                                                L40: {
                                                  if (null != var14_ref_oc.field_C) {
                                                    break L40;
                                                  } else {
                                                    this.field_C[this.field_o] = var14_ref_oc.field_k;
                                                    if (var19 == 0) {
                                                      break L39;
                                                    } else {
                                                      break L40;
                                                    }
                                                  }
                                                }
                                                this.field_C[this.field_o] = var14_ref_oc.field_C[var15_int];
                                                break L39;
                                              }
                                            }
                                            L41: {
                                              if (var8 == 0) {
                                                break L41;
                                              } else {
                                                if (null == var14_ref_oc.field_n) {
                                                  break L41;
                                                } else {
                                                  this.field_n[this.field_o] = var14_ref_oc.field_n[var15_int];
                                                  break L41;
                                                }
                                              }
                                            }
                                            L42: {
                                              if (var10 == 0) {
                                                break L42;
                                              } else {
                                                L43: {
                                                  if (null == var14_ref_oc.field_r) {
                                                    break L43;
                                                  } else {
                                                    this.field_r[this.field_o] = var14_ref_oc.field_r[var15_int];
                                                    if (var19 == 0) {
                                                      break L42;
                                                    } else {
                                                      break L43;
                                                    }
                                                  }
                                                }
                                                this.field_r[this.field_o] = (short)-1;
                                                break L42;
                                              }
                                            }
                                            L44: {
                                              if (var11 == 0) {
                                                break L44;
                                              } else {
                                                L45: {
                                                  if (var14_ref_oc.field_D != null) {
                                                    break L45;
                                                  } else {
                                                    this.field_D[this.field_o] = -1;
                                                    if (var19 == 0) {
                                                      break L44;
                                                    } else {
                                                      break L45;
                                                    }
                                                  }
                                                }
                                                this.field_D[this.field_o] = var14_ref_oc.field_D[var15_int];
                                                break L44;
                                              }
                                            }
                                            this.field_a[this.field_o] = (short)this.a((int) var14_ref_oc.field_a[var15_int], (short) var13, var14_ref_oc, 1);
                                            this.field_t[this.field_o] = (short)this.a((int) var14_ref_oc.field_t[var15_int], (short) var13, var14_ref_oc, 1);
                                            this.field_J[this.field_o] = (short)this.a((int) var14_ref_oc.field_J[var15_int], (short) var13, var14_ref_oc, 1);
                                            this.field_h[this.field_o] = (short)var13;
                                            this.field_A[this.field_o] = var14_ref_oc.field_A[var15_int];
                                            this.field_o = this.field_o + 1;
                                            var15_int++;
                                            if (var19 == 0) {
                                              continue L33;
                                            } else {
                                              break L37;
                                            }
                                          }
                                        }
                                      }
                                      if (null == var14_ref_oc.field_B) {
                                        break L35;
                                      } else {
                                        stackOut_86_0 = 0;
                                        stackIn_87_0 = stackOut_86_0;
                                        break L36;
                                      }
                                    }
                                    var15_int = stackIn_87_0;
                                    L46: while (true) {
                                      if ((var14_ref_oc.field_B.length ^ -1) >= (var15_int ^ -1)) {
                                        break L35;
                                      } else {
                                        var16 = this.a(var14_ref_oc.field_B[var15_int].field_a, (short) var13, var14_ref_oc, 1);
                                        var17 = this.a(var14_ref_oc.field_B[var15_int].field_c, (short) var13, var14_ref_oc, 1);
                                        var18 = this.a(var14_ref_oc.field_B[var15_int].field_b, (short) var13, var14_ref_oc, 1);
                                        this.field_B[var3_int] = var14_ref_oc.field_B[var15_int].a(0, var17, var18, var16);
                                        var3_int++;
                                        var15_int++;
                                        if (var19 != 0) {
                                          break L34;
                                        } else {
                                          if (var19 == 0) {
                                            continue L46;
                                          } else {
                                            break L35;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (null == var14_ref_oc.field_e) {
                                    break L29;
                                  } else {
                                    break L34;
                                  }
                                }
                                var15_int = 0;
                                L47: while (true) {
                                  if ((var14_ref_oc.field_e.length ^ -1) >= (var15_int ^ -1)) {
                                    break L29;
                                  } else {
                                    var16 = this.a(var14_ref_oc.field_e[var15_int].field_a, (short) var13, var14_ref_oc, 1);
                                    this.field_e[var4] = var14_ref_oc.field_e[var15_int].a(0, var16);
                                    var4++;
                                    var15_int++;
                                    if (var19 != 0) {
                                      break L28;
                                    } else {
                                      if (var19 == 0) {
                                        continue L47;
                                      } else {
                                        break L29;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var12++;
                          break L28;
                        }
                        if (var19 == 0) {
                          continue L25;
                        } else {
                          break L27;
                        }
                      }
                    }
                  }
                  var12 = 0;
                  stackOut_98_0 = this;
                  stackIn_99_0 = (oc) ((Object) stackOut_98_0);
                  break L26;
                }
                this.field_L = this.field_E;
                var13 = 0;
                L48: while (true) {
                  stackOut_100_0 = param1;
                  stackOut_100_1 = var13;
                  stackIn_101_0 = stackOut_100_0;
                  stackIn_101_1 = stackOut_100_1;
                  L49: while (true) {
                    L50: {
                      if (stackIn_101_0 <= stackIn_101_1) {
                        break L50;
                      } else {
                        var14 = (short)(1 << var13);
                        var15 = param0[var13];
                        if (var19 != 0) {
                          decompiledRegionSelector0 = 0;
                          break L0;
                        } else {
                          L51: {
                            if (var15 == null) {
                              break L51;
                            } else {
                              var16 = 0;
                              L52: while (true) {
                                L53: {
                                  L54: {
                                    if (var15.field_o <= var16) {
                                      break L54;
                                    } else {
                                      stackOut_106_0 = var9;
                                      stackIn_115_0 = stackOut_106_0;
                                      stackIn_107_0 = stackOut_106_0;
                                      if (var19 != 0) {
                                        break L53;
                                      } else {
                                        L55: {
                                          if (stackIn_107_0 == 0) {
                                            break L55;
                                          } else {
                                            L56: {
                                              L57: {
                                                incrementValue$3 = var12;
                                                var12++;
                                                stackOut_108_0 = this.field_g;
                                                stackOut_108_1 = incrementValue$3;
                                                stackIn_111_0 = stackOut_108_0;
                                                stackIn_111_1 = stackOut_108_1;
                                                stackIn_109_0 = stackOut_108_0;
                                                stackIn_109_1 = stackOut_108_1;
                                                if (null == var15.field_g) {
                                                  break L57;
                                                } else {
                                                  stackOut_109_0 = (byte[]) ((Object) stackIn_109_0);
                                                  stackOut_109_1 = stackIn_109_1;
                                                  stackIn_111_0 = stackOut_109_0;
                                                  stackIn_111_1 = stackOut_109_1;
                                                  stackIn_110_0 = stackOut_109_0;
                                                  stackIn_110_1 = stackOut_109_1;
                                                  if ((var15.field_g[var16] ^ -1) == 0) {
                                                    break L57;
                                                  } else {
                                                    stackOut_110_0 = (byte[]) ((Object) stackIn_110_0);
                                                    stackOut_110_1 = stackIn_110_1;
                                                    stackOut_110_2 = this.field_F + var15.field_g[var16];
                                                    stackIn_112_0 = stackOut_110_0;
                                                    stackIn_112_1 = stackOut_110_1;
                                                    stackIn_112_2 = stackOut_110_2;
                                                    break L56;
                                                  }
                                                }
                                              }
                                              stackOut_111_0 = (byte[]) ((Object) stackIn_111_0);
                                              stackOut_111_1 = stackIn_111_1;
                                              stackOut_111_2 = -1;
                                              stackIn_112_0 = stackOut_111_0;
                                              stackIn_112_1 = stackOut_111_1;
                                              stackIn_112_2 = stackOut_111_2;
                                              break L56;
                                            }
                                            stackIn_112_0[stackIn_112_1] = (byte)stackIn_112_2;
                                            break L55;
                                          }
                                        }
                                        var16++;
                                        if (var19 == 0) {
                                          continue L52;
                                        } else {
                                          break L54;
                                        }
                                      }
                                    }
                                  }
                                  stackOut_114_0 = 0;
                                  stackIn_115_0 = stackOut_114_0;
                                  break L53;
                                }
                                var16 = stackIn_115_0;
                                L58: while (true) {
                                  if (var15.field_F <= var16) {
                                    break L51;
                                  } else {
                                    this.field_u[this.field_F] = var15.field_u[var16];
                                    var17 = var15.field_u[var16];
                                    stackOut_117_0 = var17 ^ -1;
                                    stackOut_117_1 = -1;
                                    stackIn_101_0 = stackOut_117_0;
                                    stackIn_101_1 = stackOut_117_1;
                                    stackIn_118_0 = stackOut_117_0;
                                    stackIn_118_1 = stackOut_117_1;
                                    if (var19 != 0) {
                                      continue L49;
                                    } else {
                                      L59: {
                                        if (stackIn_118_0 != stackIn_118_1) {
                                          break L59;
                                        } else {
                                          this.field_s[this.field_F] = (short)this.a((int) var15.field_s[var16], (short) var14, var15, 1);
                                          this.field_q[this.field_F] = (short)this.a((int) var15.field_q[var16], (short) var14, var15, 1);
                                          this.field_K[this.field_F] = (short)this.a((int) var15.field_K[var16], (short) var14, var15, 1);
                                          break L59;
                                        }
                                      }
                                      L60: {
                                        if ((var17 ^ -1) > -2) {
                                          break L60;
                                        } else {
                                          if ((var17 ^ -1) < -4) {
                                            break L60;
                                          } else {
                                            this.field_s[this.field_F] = var15.field_s[var16];
                                            this.field_q[this.field_F] = var15.field_q[var16];
                                            this.field_K[this.field_F] = var15.field_K[var16];
                                            this.field_j[this.field_F] = var15.field_j[var16];
                                            this.field_f[this.field_F] = var15.field_f[var16];
                                            this.field_x[this.field_F] = var15.field_x[var16];
                                            this.field_i[this.field_F] = var15.field_i[var16];
                                            this.field_z[this.field_F] = var15.field_z[var16];
                                            this.field_d[this.field_F] = var15.field_d[var16];
                                            break L60;
                                          }
                                        }
                                      }
                                      L61: {
                                        if ((var17 ^ -1) != -3) {
                                          break L61;
                                        } else {
                                          this.field_v[this.field_F] = var15.field_v[var16];
                                          this.field_c[this.field_F] = var15.field_c[var16];
                                          break L61;
                                        }
                                      }
                                      this.field_F = this.field_F + 1;
                                      var16++;
                                      if (var19 == 0) {
                                        continue L58;
                                      } else {
                                        break L51;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var13++;
                          if (var19 == 0) {
                            continue L48;
                          } else {
                            break L50;
                          }
                        }
                      }
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L62: {
            var3 = decompiledCaughtException;
            stackOut_128_0 = (RuntimeException) (var3);
            stackOut_128_1 = new StringBuilder().append("oc.<init>(");
            stackIn_130_0 = stackOut_128_0;
            stackIn_130_1 = stackOut_128_1;
            stackIn_129_0 = stackOut_128_0;
            stackIn_129_1 = stackOut_128_1;
            if (param0 == null) {
              stackOut_130_0 = (RuntimeException) ((Object) stackIn_130_0);
              stackOut_130_1 = (StringBuilder) ((Object) stackIn_130_1);
              stackOut_130_2 = "null";
              stackIn_131_0 = stackOut_130_0;
              stackIn_131_1 = stackOut_130_1;
              stackIn_131_2 = stackOut_130_2;
              break L62;
            } else {
              stackOut_129_0 = (RuntimeException) ((Object) stackIn_129_0);
              stackOut_129_1 = (StringBuilder) ((Object) stackIn_129_1);
              stackOut_129_2 = "{...}";
              stackIn_131_0 = stackOut_129_0;
              stackIn_131_1 = stackOut_129_1;
              stackIn_131_2 = stackOut_129_2;
              break L62;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_131_0), stackIn_131_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_H = new su(15, 0, 1, 0);
    }
}
