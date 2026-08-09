/*
 * Decompiled by CFR-JS 0.4.0.
 */
class j extends ka {
    static String[] field_q;
    static bi[] field_s;
    static fg field_r;
    static String field_p;

    void g(int param0) {
        int stackIn_41_0 = 0;
        int[] stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int[] stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_44_2 = 0;
        int stackIn_56_0 = 0;
        int var2;
        int[][] var3;
        boolean[] var4;
        int var5_int;
        int[] var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int[][] var14;
        int[][] var15;
        L0: {
          var13 = ShatteredPlansClient.field_F ? 1 : 0;
          var2 = this.field_g.field_r;
          var15 = new int[var2][];
          var14 = var15;
          var3 = var14;
          if (param0 == -18484) {
            break L0;
          } else {
            this.g(93);
            break L0;
          }
        }
        this.field_k = -1;
        var4 = new boolean[this.field_o];
        var5_int = 0;
        L1: while (true) {
          if (var2 <= var5_int) {
            var5 = var3[this.field_n.field_x];
            var6 = 0;
            var7 = 0;
            L2: while (true) {
              if (var7 >= this.field_o) {
                var7 = 0;
                L3: while (true) {
                  if (var2 <= var7) {
                    return;
                  } else {
                    var8 = this.field_g.field_m[-var7 + (-1 + var2)];
                    if (this.field_n.field_x != var8) {
                      if (!this.field_n.field_h[var8]) {
                        if (-1 == (this.field_g.field_w & 1 << var8 ^ -1)) {
                          var9 = var6;
                          var10 = 0;
                          L4: while (true) {
                            if (var10 >= this.field_o) {
                              L5: {
                                if (5 > var9) {
                                  stackIn_41_0 = 0;
                                  break L5;
                                } else {
                                  stackIn_41_0 = 1;
                                  break L5;
                                }
                              }
                              L6: {
                                var10 = stackIn_41_0;
                                stackIn_43_0 = this.field_b;

                                stackIn_43_1 = var7;

                                if (var10 != 0) {
                                  stackIn_44_0 = (int[]) ((Object) stackIn_43_0);
                                  stackIn_44_1 = stackIn_43_1;
                                  stackIn_44_2 = -3;
                                  break L6;
                                } else {
                                  stackIn_44_0 = (int[]) ((Object) stackIn_43_0);
                                  stackIn_44_1 = stackIn_43_1;
                                  stackIn_44_2 = 4;
                                  break L6;
                                }
                              }
                              stackIn_44_0[stackIn_44_1] = stackIn_44_2;
                              if (var10 != 0) {
                                if (0 == (this.field_k ^ -1)) {
                                  this.field_k = var7;
                                  var11 = 0;
                                  L7: while (true) {
                                    if (var11 < this.field_o) {
                                      if (var4[var11]) {
                                        L8: {
                                          if (var3[this.field_k][var11] <= var5[var11]) {
                                            stackIn_56_0 = 0;
                                            break L8;
                                          } else {
                                            stackIn_56_0 = 1;
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
                                if (var5[var10] >= var15[var8][var10]) {
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
                if (this.field_g.field_g.field_e[var7].field_y != this.field_n) {
                  var8 = 1;
                  var9 = 0;
                  L9: while (true) {
                    L10: {
                      if (var2 <= var9) {
                        break L10;
                      } else {
                        if ((var9 ^ -1) != (this.field_n.field_x ^ -1)) {
                          if (this.field_n.field_h[var9]) {
                            if (var5[var7] >= var15[var9][var7]) {
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
            var3[var5_int] = this.a((byte) -122, this.field_g.field_v[var5_int]);
            var5_int++;
            continue L1;
          }
        }
    }

    int d(ln param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3_int = super.d(param0, param1);
              if (1 != this.field_h) {
                stackIn_3_0 = var3_int;
                break L1;
              } else {
                stackIn_3_0 = 2 * var3_int;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("j.F(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public static void i(int param0) {
        field_r = null;
        field_q = null;
        field_p = null;
        field_s = null;
        if (param0 != 19333) {
            field_r = (fg) null;
        }
    }

    final int a(int param0, byte param1) {
        if (param1 > -25) {
            this.g(104);
        }
        return 1 != this.field_h ? param0 * 3 >> 1925469122 : 7 * param0 >> 1341832995;
    }

    j(dc param0, fs param1, mn param2, int param3) {
        super(param0, param1, param2, param3);
    }

    final int b(byte param0, ln param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3_int = -43 / ((param0 - -44) / 62);
              var4 = super.b((byte) 28, param1);
              if (this.field_h == 1) {
                var4 = 3 * var4 >> -952420159;
                break L1;
              } else {
                break L1;
              }
            }
            stackIn_4_0 = var4;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("j.R(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    final static boolean a(int param0, int[] param1, String param2, int param3, long param4) {
        RuntimeException var6 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 2) {
                break L1;
              } else {
                field_s = (bi[]) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (param1 == null) {
                  break L3;
                } else {
                  L4: {
                    if (param3 != 2) {
                      break L4;
                    } else {
                      if (!ShatteredPlansClient.a(16, param4, param2)) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  stackIn_8_0 = 1;
                  break L2;
                }
              }
              stackIn_8_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var6);

            stackIn_11_1 = new StringBuilder().append("j.EB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L5;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L6;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L6;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_8_0 != 0;
    }

    static {
        field_q = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_r = new fg();
        field_p = "Your email address is used to identify this account";
    }
}
