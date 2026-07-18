/*
 * Decompiled by CFR-JS 0.4.0.
 */
class j extends ka {
    static String[] field_q;
    static bi[] field_s;
    static fg field_r;
    static String field_p;

    void g(int param0) {
        int var2 = 0;
        int[][] var3 = null;
        boolean[] var4 = null;
        int var5_int = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[][] var14 = null;
        int[][] var15 = null;
        int[][] var16 = null;
        int[][] var17 = null;
        int stackIn_41_0 = 0;
        int[] stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int[] stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int[] stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_44_2 = 0;
        int stackIn_56_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        int[] stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int[] stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        int stackOut_43_2 = 0;
        int[] stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        int stackOut_42_2 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        L0: {
          var13 = ShatteredPlansClient.field_F ? 1 : 0;
          var2 = ((j) this).field_g.field_r;
          var17 = new int[var2][];
          var16 = var17;
          var15 = var16;
          var14 = var15;
          var3 = var14;
          if (param0 == -18484) {
            break L0;
          } else {
            ((j) this).g(93);
            break L0;
          }
        }
        ((j) this).field_k = -1;
        var4 = new boolean[((j) this).field_o];
        var5_int = 0;
        L1: while (true) {
          if (var2 <= var5_int) {
            var5 = var3[((j) this).field_n.field_x];
            var6 = 0;
            var7 = 0;
            L2: while (true) {
              if (var7 >= ((j) this).field_o) {
                var7 = 0;
                L3: while (true) {
                  if (var2 <= var7) {
                    return;
                  } else {
                    var8 = ((j) this).field_g.field_m[-var7 + (-1 + var2)];
                    if (((j) this).field_n.field_x != var8) {
                      if (!((j) this).field_n.field_h[var8]) {
                        if ((((j) this).field_g.field_w & 1 << var8) == 0) {
                          var9 = var6;
                          var10 = 0;
                          L4: while (true) {
                            if (var10 >= ((j) this).field_o) {
                              L5: {
                                if (5 > var9) {
                                  stackOut_40_0 = 0;
                                  stackIn_41_0 = stackOut_40_0;
                                  break L5;
                                } else {
                                  stackOut_39_0 = 1;
                                  stackIn_41_0 = stackOut_39_0;
                                  break L5;
                                }
                              }
                              L6: {
                                var10 = stackIn_41_0;
                                stackOut_41_0 = ((j) this).field_b;
                                stackOut_41_1 = var7;
                                stackIn_43_0 = stackOut_41_0;
                                stackIn_43_1 = stackOut_41_1;
                                stackIn_42_0 = stackOut_41_0;
                                stackIn_42_1 = stackOut_41_1;
                                if (var10 != 0) {
                                  stackOut_43_0 = (int[]) (Object) stackIn_43_0;
                                  stackOut_43_1 = stackIn_43_1;
                                  stackOut_43_2 = -3;
                                  stackIn_44_0 = stackOut_43_0;
                                  stackIn_44_1 = stackOut_43_1;
                                  stackIn_44_2 = stackOut_43_2;
                                  break L6;
                                } else {
                                  stackOut_42_0 = (int[]) (Object) stackIn_42_0;
                                  stackOut_42_1 = stackIn_42_1;
                                  stackOut_42_2 = 4;
                                  stackIn_44_0 = stackOut_42_0;
                                  stackIn_44_1 = stackOut_42_1;
                                  stackIn_44_2 = stackOut_42_2;
                                  break L6;
                                }
                              }
                              stackIn_44_0[stackIn_44_1] = stackIn_44_2;
                              if (var10 != 0) {
                                if (((j) this).field_k == -1) {
                                  ((j) this).field_k = var7;
                                  var11 = 0;
                                  L7: while (true) {
                                    if (var11 < ((j) this).field_o) {
                                      if (var4[var11]) {
                                        L8: {
                                          if (var3[((j) this).field_k][var11] <= var5[var11]) {
                                            stackOut_55_0 = 0;
                                            stackIn_56_0 = stackOut_55_0;
                                            break L8;
                                          } else {
                                            stackOut_54_0 = 1;
                                            stackIn_56_0 = stackOut_54_0;
                                            break L8;
                                          }
                                        }
                                        var12 = stackIn_56_0;
                                        var4[var11] = var12 != 0;
                                        if (var12 == 0) {
                                          var6--;
                                          var11++;
                                          continue L7;
                                        } else {
                                          var11++;
                                          continue L7;
                                        }
                                      } else {
                                        var11++;
                                        continue L7;
                                      }
                                    } else {
                                      var7++;
                                      continue L3;
                                    }
                                  }
                                } else {
                                  var7++;
                                  continue L3;
                                }
                              } else {
                                var7++;
                                continue L3;
                              }
                            } else {
                              if (var4[var10]) {
                                if (var5[var10] >= var17[var8][var10]) {
                                  var9--;
                                  var10++;
                                  continue L4;
                                } else {
                                  var10++;
                                  continue L4;
                                }
                              } else {
                                var10++;
                                continue L4;
                              }
                            }
                          }
                        } else {
                          var7++;
                          continue L3;
                        }
                      } else {
                        var7++;
                        continue L3;
                      }
                    } else {
                      var7++;
                      continue L3;
                    }
                  }
                }
              } else {
                if (((j) this).field_g.field_g.field_e[var7].field_y != ((j) this).field_n) {
                  var8 = 1;
                  var9 = 0;
                  L9: while (true) {
                    L10: {
                      if (var2 <= var9) {
                        break L10;
                      } else {
                        if (var9 != ((j) this).field_n.field_x) {
                          if (((j) this).field_n.field_h[var9]) {
                            if (var5[var7] >= var17[var9][var7]) {
                              var8 = 0;
                              break L10;
                            } else {
                              var9++;
                              continue L9;
                            }
                          } else {
                            var9++;
                            continue L9;
                          }
                        } else {
                          var9++;
                          continue L9;
                        }
                      }
                    }
                    var4[var7] = var8 != 0;
                    if (var8 != 0) {
                      var6++;
                      var7++;
                      continue L2;
                    } else {
                      var7++;
                      continue L2;
                    }
                  }
                } else {
                  var4[var7] = false;
                  var7++;
                  continue L2;
                }
              }
            }
          } else {
            var3[var5_int] = ((j) this).a((byte) -122, ((j) this).field_g.field_v[var5_int]);
            var5_int++;
            continue L1;
          }
        }
    }

    int d(ln param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var3_int = super.d(param0, param1);
              if (1 != ((j) this).field_h) {
                stackOut_2_0 = var3_int;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 2 * var3_int;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("j.F(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public static void i() {
        field_r = null;
        field_q = null;
        field_p = null;
        field_s = null;
    }

    final int a(int param0, byte param1) {
        if (param1 > -25) {
            ((j) this).g(104);
        }
        return 1 != ((j) this).field_h ? param0 * 3 >> 2 : 7 * param0 >> 3;
    }

    j(dc param0, fs param1, mn param2, int param3) {
        super(param0, param1, param2, param3);
    }

    final int b(byte param0, ln param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              var3_int = -43 / ((param0 - -44) / 62);
              var4 = super.b((byte) 28, param1);
              if (((j) this).field_h == 1) {
                var4 = 3 * var4 >> 1;
                break L1;
              } else {
                break L1;
              }
            }
            stackOut_3_0 = var4;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("j.R(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    final static boolean a(int param0, int[] param1, String param2, int param3, long param4) {
        RuntimeException var6 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (param1 == null) {
                  break L2;
                } else {
                  L3: {
                    if (param3 != 2) {
                      break L3;
                    } else {
                      if (!ShatteredPlansClient.a(16, param4, param2)) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var6;
            stackOut_7_1 = new StringBuilder().append("j.EB(").append(2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          L5: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          throw r.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_6_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_r = new fg();
        field_p = "Your email address is used to identify this account";
    }
}
