/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl extends rm {
    static volatile int field_S;
    static Boolean field_T;
    static String field_U;
    static long[] field_V;
    static o field_W;
    static double[][] field_O;

    final static void b(byte param0) {
        if (param0 != 106) {
            return;
        }
        nn.field_c.field_g = 0;
        nn.field_c.field_k = 0;
    }

    public static void b(int param0) {
        field_O = (double[][]) null;
        field_T = null;
        field_U = null;
        field_V = null;
        field_W = null;
        if (param0 != 2) {
            field_O = (double[][]) null;
        }
    }

    private final int a(double param0, double param1, double param2, byte param3) {
        if (param3 >= -12) {
            return 109;
        }
        return this.a(al.a(param0, (byte) -126), al.a(param2, (byte) 120), al.a(param1, (byte) 62));
    }

    jl(int param0, boolean param1) {
        super(92, 180, 0);
        int discarded$2 = 0;
        double var3 = 0.0;
        double[] var5 = null;
        double var6 = 0.0;
        int var8_int = 0;
        double var8 = 0.0;
        double var9 = 0.0;
        int var10 = 0;
        double var11_double = 0.0;
        int var11 = 0;
        int var12 = 0;
        double var13_double = 0.0;
        int var13 = 0;
        int var14 = 0;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        double var21 = 0.0;
        int var23 = 0;
        int var42 = 0;
        int[][] var59 = null;
        int[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int stackIn_20_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_22_0 = 0;
        var42 = Torquing.field_u;
        var3 = (Math.sqrt(5.0) + 1.0) / 2.0;
        var5 = new double[]{0.0, 1.0, var3 * 3.0, 0.0, 1.0, -3.0 * var3, 0.0, -1.0, 3.0 * var3, 0.0, -1.0, -3.0 * var3, 1.0, 3.0 * var3, 0.0, 1.0, var3 * -3.0, 0.0, -1.0, 3.0 * var3, 0.0, -1.0, -3.0 * var3, 0.0, 3.0 * var3, 0.0, 1.0, var3 * -3.0, 0.0, 1.0, 3.0 * var3, 0.0, -1.0, -3.0 * var3, 0.0, -1.0, 2.0, 2.0 * var3 + 1.0, var3, 2.0, 1.0 + var3 * 2.0, -var3, 2.0, -(var3 * 2.0) + -1.0, var3, 2.0, -(var3 * 2.0) + -1.0, -var3, -2.0, 1.0 + var3 * 2.0, var3, -2.0, 2.0 * var3 + 1.0, -var3, -2.0, -1.0 - var3 * 2.0, var3, -2.0, -(2.0 * var3) + -1.0, -var3, var3 * 2.0 + 1.0, var3, 2.0, 2.0 * var3 + 1.0, -var3, 2.0, -1.0 - 2.0 * var3, var3, 2.0, -(var3 * 2.0) + -1.0, -var3, 2.0, 1.0 + 2.0 * var3, var3, -2.0, var3 * 2.0 + 1.0, -var3, -2.0, -(var3 * 2.0) + -1.0, var3, -2.0, -(2.0 * var3) + -1.0, -var3, -2.0, var3, 2.0, 2.0 * var3 + 1.0, -var3, 2.0, var3 * 2.0 + 1.0, var3, 2.0, -1.0 - var3 * 2.0, -var3, 2.0, -(var3 * 2.0) + -1.0, var3, -2.0, 1.0 + var3 * 2.0, -var3, -2.0, var3 * 2.0 + 1.0, var3, -2.0, -(var3 * 2.0) + -1.0, -var3, -2.0, -1.0 - var3 * 2.0, 1.0, var3 + 2.0, 2.0 * var3, 1.0, 2.0 + var3, var3 * -2.0, 1.0, -var3 + -2.0, var3 * 2.0, 1.0, -var3 + -2.0, -2.0 * var3, -1.0, 2.0 + var3, 2.0 * var3, -1.0, 2.0 + var3, -2.0 * var3, -1.0, -var3 + -2.0, 2.0 * var3, -1.0, -2.0 - var3, var3 * -2.0, var3 + 2.0, var3 * 2.0, 1.0, var3 + 2.0, -2.0 * var3, 1.0, -var3 + -2.0, 2.0 * var3, 1.0, -var3 + -2.0, var3 * -2.0, 1.0, 2.0 + var3, 2.0 * var3, -1.0, var3 + 2.0, -2.0 * var3, -1.0, -var3 + -2.0, 2.0 * var3, -1.0, -2.0 - var3, -2.0 * var3, -1.0, 2.0 * var3, 1.0, 2.0 + var3, var3 * -2.0, 1.0, var3 + 2.0, var3 * 2.0, 1.0, -2.0 - var3, var3 * -2.0, 1.0, -2.0 - var3, 2.0 * var3, -1.0, 2.0 + var3, var3 * -2.0, -1.0, 2.0 + var3, 2.0 * var3, -1.0, -2.0 - var3, -2.0 * var3, -1.0, -2.0 - var3};
        var6 = (double)param0 / Math.sqrt(var5[1] * var5[1] + var5[0] * var5[0] + var5[2] * var5[2]);
        var8_int = 0;
        L0: while (true) {
          if (-61 >= (var8_int ^ -1)) {
            var8 = Double.POSITIVE_INFINITY;
            var10 = 1;
            L1: while (true) {
              if (-61 >= (var10 ^ -1)) {
                var59 = new int[60][3];
                var11 = 0;
                L2: while (true) {
                  if (-61 >= (var11 ^ -1)) {
                    var11 = 0;
                    L3: while (true) {
                      stackOut_19_0 = 60;
                      stackIn_20_0 = stackOut_19_0;
                      L4: while (true) {
                        if (stackIn_20_0 <= var11) {
                          var11 = 0;
                          L5: while (true) {
                            stackOut_26_0 = this.field_f;
                            stackOut_26_1 = var11;
                            stackIn_27_0 = stackOut_26_0;
                            stackIn_27_1 = stackOut_26_1;
                            L6: while (true) {
                              if (stackIn_27_0 <= stackIn_27_1) {
                                return;
                              } else {
                                var12 = 0;
                                var13 = 0;
                                L7: while (true) {
                                  if (var13 >= this.field_g) {
                                    L8: {
                                      if ((var12 ^ -1) != -6) {
                                        break L8;
                                      } else {
                                        var13 = 0;
                                        if (this.field_g <= var13) {
                                          break L8;
                                        } else {
                                          stackOut_37_0 = this.field_o[var13];
                                          stackOut_37_1 = var11;
                                          stackIn_27_0 = stackOut_37_0;
                                          stackIn_27_1 = stackOut_37_1;
                                          continue L6;
                                        }
                                      }
                                    }
                                    var11++;
                                    continue L5;
                                  } else {
                                    L9: {
                                      L10: {
                                        if ((this.field_o[var13] ^ -1) == (var11 ^ -1)) {
                                          break L10;
                                        } else {
                                          if (this.field_y[var13] == var11) {
                                            break L10;
                                          } else {
                                            if (var11 != this.field_q[var13]) {
                                              break L9;
                                            } else {
                                              break L10;
                                            }
                                          }
                                        }
                                      }
                                      var12++;
                                      break L9;
                                    }
                                    var13++;
                                    continue L7;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var62 = var59[var11];
                          var13 = 0;
                          if (var13 >= var62.length) {
                            var11++;
                            continue L3;
                          } else {
                            var14 = var62[var13];
                            var63 = var59[var14];
                            stackOut_22_0 = 0;
                            stackIn_20_0 = stackOut_22_0;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    var60 = var59[var11];
                    var61 = var59[var11];
                    var59[var11][2] = -1;
                    var60[0] = -1;
                    var61[1] = -1;
                    var14 = 0;
                    L11: while (true) {
                      if (var14 >= 60) {
                        var11++;
                        continue L2;
                      } else {
                        L12: {
                          if (var14 == var11) {
                            break L12;
                          } else {
                            var15 = var5[var14 * 3] - var5[3 * var11];
                            var17 = var5[var14 * 3 - -1] - var5[1 + 3 * var11];
                            var19 = var5[2 + var14 * 3] - var5[var11 * 3 + 2];
                            var21 = Math.sqrt(var15 * var15 + var17 * var17 + var19 * var19);
                            if (var21 >= 1.1 * var8) {
                              break L12;
                            } else {
                              var23 = 0;
                              L13: while (true) {
                                if (-1 == var59[var11][var23]) {
                                  var59[var11][var23] = var14;
                                  break L12;
                                } else {
                                  var23++;
                                  continue L13;
                                }
                              }
                            }
                          }
                        }
                        var14++;
                        continue L11;
                      }
                    }
                  }
                }
              } else {
                var11_double = var5[var10 * 3] - var5[0];
                var13_double = -var5[1] + var5[1 + 3 * var10];
                var15 = -var5[2] + var5[var10 * 3 - -2];
                var8 = Math.min(var8, Math.sqrt(var13_double * var13_double + var11_double * var11_double + var15 * var15));
                var10++;
                continue L1;
              }
            }
          } else {
            var9 = var5[var8_int * 3];
            var11_double = var5[1 + var8_int * 3];
            var13_double = var5[var8_int * 3 + 2];
            discarded$2 = this.a(var6 * var9, var13_double * var6, var11_double * var6, (byte) -100);
            var8_int++;
            continue L0;
          }
        }
    }

    private final int a(int param0, int param1, int param2, int param3, boolean param4, int param5) {
        int discarded$2 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = Torquing.field_u;
          var7 = 0;
          if (!param4) {
            break L0;
          } else {
            discarded$2 = this.a(-98, 102, 31, -9, false, 113);
            break L0;
          }
        }
        L1: while (true) {
          if (var7 >= this.field_g) {
            return super.a(param3, param0, param1, (byte)param2, (byte) -1, (short)param5, (short) -1);
          } else {
            L2: {
              L3: {
                if (param3 != this.field_o[var7]) {
                  break L3;
                } else {
                  if (param0 != this.field_y[var7]) {
                    break L3;
                  } else {
                    if (param1 == this.field_q[var7]) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              L4: {
                if (param3 != this.field_y[var7]) {
                  break L4;
                } else {
                  if (param0 != this.field_q[var7]) {
                    break L4;
                  } else {
                    if (this.field_o[var7] == param1) {
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              if (param3 == this.field_q[var7]) {
                if (this.field_o[var7] == param0) {
                  if (this.field_y[var7] == param1) {
                    break L2;
                  } else {
                    var7++;
                    continue L1;
                  }
                } else {
                  var7++;
                  continue L1;
                }
              } else {
                var7++;
                continue L1;
              }
            }
            return var7;
          }
        }
    }

    static {
        field_S = 0;
        field_U = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_V = new long[32];
        field_O = new double[8][8];
    }
}
