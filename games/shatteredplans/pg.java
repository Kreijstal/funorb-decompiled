/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg extends qs {
    private int field_K;
    private int field_H;
    static String field_E;
    static int[][] field_A;
    private boolean field_I;
    private nq field_G;
    private String field_L;
    private int field_D;
    static int field_J;
    static byte[] field_C;
    static String field_F;

    final String c(boolean param0) {
        int var2 = this.field_z.field_k ? 1 : 0;
        this.field_z.field_k = this.field_k;
        String var3 = this.field_z.c(param0);
        this.field_z.field_k = var2 != 0 ? true : false;
        return var3;
    }

    pg(int param0, int param1, int param2, int param3, vg param4, boolean param5, int param6, int param7, nq param8, int param9, String param10) {
        super(param0, param1, param2, param3, (iq) null, (ko) null);
        RuntimeException var12 = null;
        int var12_int = 0;
        int var13 = 0;
        int var14 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              this.field_z = param4;
              this.field_L = param10;
              this.field_D = param9;
              this.field_H = param6;
              this.field_G = param8;
              this.field_K = param7;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param5) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((pg) (this)).field_I = stackIn_4_1 != 0;
              var12_int = -this.field_K + this.field_H;
              var13 = this.field_G.c(param10, var12_int, this.field_G.field_J) - -(this.field_K * 2);
              if (param3 < var13) {
                this.a(param1, var13, (byte) 102, param0, param2);
                break L2;
              } else {
                var13 = param3;
                break L2;
              }
            }
            L3: {
              if (!this.field_I) {
                stackOut_9_0 = 2 * this.field_K + this.field_H;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = 0;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            var14 = stackIn_10_0;
            this.field_z.a((-param3 + var13 >> 730032801) + this.field_K, param3 + -(2 * this.field_K), (byte) 115, var14, -this.field_H + param2 + -(3 * this.field_K));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var12);
            stackOut_12_1 = new StringBuilder().append("pg.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param8 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param9).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param10 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
    }

    public static void f(byte param0) {
        if (param0 != -43) {
            return;
        }
        field_F = null;
        field_C = null;
        field_A = (int[][]) null;
        field_E = null;
    }

    final static bi[] a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7, int param8) {
        bi[] discarded$1 = null;
        int var9 = 0;
        bi[] var10 = null;
        bi[] var11_ref_bi__ = null;
        int var11 = 0;
        int var12 = 0;
        bi var13 = null;
        int var14 = 0;
        int var15 = 0;
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        var9 = param1 + param2 + param7;
        var10 = new bi[]{new bi(var9, var9), new bi(param6, var9), new bi(var9, var9), new bi(var9, param6), new bi(64, 64), new bi(var9, param6), new bi(var9, var9), new bi(param6, var9), new bi(var9, var9)};
        var11_ref_bi__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var11_ref_bi__.length <= var12) {
            var11 = 0;
            L1: while (true) {
              if (var11 >= param7) {
                var11 = 0;
                L2: while (true) {
                  if (param7 <= var11) {
                    var11 = 0;
                    L3: while (true) {
                      if (var11 >= param6) {
                        L4: {
                          var11 = 0;
                          if (param3 == -41) {
                            break L4;
                          } else {
                            discarded$1 = pg.a(-7, 17, -29, (byte) 74, -118, 12, 82, -100, -35);
                            break L4;
                          }
                        }
                        L5: while (true) {
                          if (var11 >= param6 >> 1793017697) {
                            return var10;
                          } else {
                            var12 = 0;
                            L6: while (true) {
                              if (param1 > var12) {
                                var10[1].field_B[param6 * (-1 + -var12 + var9) + var11] = param0;
                                var10[3].field_B[-1 - -var9 + -var12 + var11 * var9] = param0;
                                var10[7].field_B[var11 + param6 * var12] = param0;
                                var10[5].field_B[var9 * var11 - -var12] = param0;
                                var12++;
                                continue L6;
                              } else {
                                var11++;
                                continue L5;
                              }
                            }
                          }
                        }
                      } else {
                        var12 = 0;
                        L7: while (true) {
                          if (var12 < param7) {
                            var10[7].field_B[(var9 - var12 - 1) * param6 + var11] = param4;
                            var10[5].field_B[var9 + (-1 - var12) + var11 * var9] = param4;
                            var10[1].field_B[var12 * param6 - -var11] = param8;
                            var10[3].field_B[var12 + var9 * var11] = param8;
                            var12++;
                            continue L7;
                          } else {
                            var11++;
                            continue L3;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L8: while (true) {
                      if (var12 >= var9) {
                        var11++;
                        continue L2;
                      } else {
                        var10[0].field_B[var9 * var11 + var12] = param8;
                        var10[0].field_B[var11 + var12 * var9] = param8;
                        if (var9 - var11 > var12) {
                          var10[2].field_B[var9 * var11 + var12] = param8;
                          var10[6].field_B[var11 + var9 * var12] = param8;
                          var12++;
                          continue L8;
                        } else {
                          var12++;
                          continue L8;
                        }
                      }
                    }
                  }
                }
              } else {
                var12 = 0;
                L9: while (true) {
                  if (var9 > var12) {
                    var10[6].field_B[var12 + (-1 + (var9 + -var11)) * var9] = param4;
                    var10[8].field_B[var12 + var9 * (-1 + -var11 + var9)] = param4;
                    var10[2].field_B[-1 + (var9 + -var11 + var9 * var12)] = param4;
                    var10[8].field_B[var9 * var12 - var11 - (-var9 + 1)] = param4;
                    var12++;
                    continue L9;
                  } else {
                    var11++;
                    continue L1;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_bi__[var12];
            var14 = 0;
            L10: while (true) {
              if (var14 >= var13.field_B.length) {
                var12++;
                continue L0;
              } else {
                var13.field_B[var14] = param5;
                var14++;
                continue L10;
              }
            }
          }
        }
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_9_0 = 0;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 28654) {
                break L1;
              } else {
                field_C = (byte[]) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (param1 <= 0) {
                  break L3;
                } else {
                  if (param1 < 128) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (param1 < 160) {
                  break L4;
                } else {
                  if (param1 <= 255) {
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (0 == param1) {
                  break L5;
                } else {
                  var6 = tl.field_p;
                  var2 = var6;
                  var3 = 0;
                  L6: while (true) {
                    if (var3 >= var6.length) {
                      break L5;
                    } else {
                      var4 = var6[var3];
                      if (param1 != var4) {
                        var3++;
                        continue L6;
                      } else {
                        stackOut_15_0 = 1;
                        stackIn_16_0 = stackOut_15_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                }
              }
              stackOut_18_0 = 0;
              stackIn_19_0 = stackOut_18_0;
              decompiledRegionSelector0 = 2;
              break L0;
            }
            stackOut_9_0 = 1;
            stackIn_10_0 = stackOut_9_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2_ref), "pg.D(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0 != 0;
          } else {
            return stackIn_19_0 != 0;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        bi[] discarded$0 = null;
        int var5 = this.field_m - -param3;
        if (param1 != -11857) {
            discarded$0 = pg.a(40, -66, 111, (byte) -124, 52, 3, 0, 73, -122);
        }
        int var6 = this.field_q - -param2;
        super.a(param0, param1 ^ 0, param2, param3);
        if (0 != param0) {
            return;
        }
        int var7 = !this.field_I ? 0 : -(2 * this.field_K) + (-this.field_H + this.field_x);
        int discarded$1 = this.field_G.a(this.field_L, var5 - -var7 + this.field_K, var6 - -this.field_K, this.field_H + -this.field_K, this.field_n + -(this.field_K * 2), this.field_D, -1, !this.field_I ? 2 : 0, 1, this.field_G.field_J);
    }

    static {
        field_E = "Press F10 to open Quick Chat.";
        field_C = new byte[]{(byte)5, (byte)7, (byte)4, (byte)5, (byte)2};
        field_F = "Neutral homeworld";
    }
}
