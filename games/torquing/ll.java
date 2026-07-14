/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll extends kj {
    private int field_j;
    static String field_m;
    static int field_i;
    private int field_l;
    private int field_h;
    private int field_k;
    static int field_g;

    public static void b(byte param0) {
        field_m = null;
        if (param0 != 81) {
            field_i = 92;
        }
    }

    final void a(int param0, int param1, byte param2) {
        if (param2 != 106) {
            field_g = -31;
        }
        int var4 = param1 * ((ll) this).field_k >> -743431220;
        int var5 = ((ll) this).field_l * param1 >> 935231596;
        int var6 = param0 * ((ll) this).field_j >> 2131250028;
        int var7 = param0 * ((ll) this).field_h >> -26079220;
        ko.a(((ll) this).field_c, var7, ((ll) this).field_e, var5, var6, -2910, var4);
    }

    ll(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        super(param4, param5, param6);
        ((ll) this).field_h = param3;
        ((ll) this).field_k = param0;
        ((ll) this).field_j = param1;
        ((ll) this).field_l = param2;
    }

    final void a(int param0, int param1, int param2) {
        int var4 = ((ll) this).field_k * param0 >> 1762625676;
        if (param2 > -101) {
            return;
        }
        int var5 = ((ll) this).field_l * param0 >> -1000989140;
        int var6 = ((ll) this).field_j * param1 >> 1384096844;
        int var7 = param1 * ((ll) this).field_h >> 1596435436;
        ii.a(var6, var5, var7, ((ll) this).field_e, var4, 2124, ((ll) this).field_c, ((ll) this).field_a);
    }

    final static double[] a(double[][] param0, double[] param1, byte param2) {
        int var3 = 0;
        double[] var4 = null;
        int var5 = 0;
        double[] var6_ref_double__ = null;
        int var6 = 0;
        int var7 = 0;
        double var8 = 0.0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        double var14 = 0.0;
        int var16 = 0;
        double var17 = 0.0;
        int var19 = 0;
        Object var20 = null;
        int var21 = 0;
        double[][] var28 = null;
        int[] var29 = null;
        int stackIn_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        var19 = Torquing.field_u;
        var3 = param0.length;
        var4 = new double[var3];
        var5 = 1;
        var6_ref_double__ = param1;
        var7 = 0;
        L0: while (true) {
          if (var7 >= var6_ref_double__.length) {
            if (var5 != 0) {
              return var4;
            } else {
              var6 = param0.length * param0.length;
              var7 = 2 * var3 - -2;
              var28 = new double[var3][var7];
              var29 = new int[var3];
              var10 = 0;
              L1: while (true) {
                if (var10 >= var3) {
                  L2: {
                    if (param2 >= 118) {
                      break L2;
                    } else {
                      var20 = null;
                      double[] discarded$1 = ll.a((double[][]) null, (double[]) null, (byte) 59);
                      break L2;
                    }
                  }
                  var10 = 0;
                  var11 = 1;
                  L3: while (true) {
                    if (var3 <= var11) {
                      var11 = var10;
                      var12 = cp.a(var7, var10, -53, var3 * 2, var3, var28, var29);
                      L4: while (true) {
                        L5: {
                          if (var3 <= var12) {
                            stackOut_24_0 = -var3 + var12;
                            stackIn_25_0 = stackOut_24_0;
                            break L5;
                          } else {
                            stackOut_23_0 = var3 + var12;
                            stackIn_25_0 = stackOut_23_0;
                            break L5;
                          }
                        }
                        var13 = stackIn_25_0;
                        var10 = -1;
                        var14 = Double.POSITIVE_INFINITY;
                        var16 = 0;
                        L6: while (true) {
                          if (var3 <= var16) {
                            if (0 != (var10 ^ -1)) {
                              var6--;
                              if (var6 != 0) {
                                L7: {
                                  var12 = cp.a(var7, var10, -127, var13, var3, var28, var29);
                                  if (var3 * 2 == var12) {
                                    break L7;
                                  } else {
                                    if (Math.abs(var28[var11][var3 * 2 + 1]) > 1e-15) {
                                      continue L4;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                                var21 = 0;
                                var13 = var21;
                                L8: while (true) {
                                  if (var21 >= var3) {
                                    return var4;
                                  } else {
                                    if (var29[var21] >= var3) {
                                      if (var3 * 2 > var29[var21]) {
                                        var4[var29[var21] - var3] = var28[var21][1 + 2 * var3];
                                        var21++;
                                        continue L8;
                                      } else {
                                        var21++;
                                        continue L8;
                                      }
                                    } else {
                                      var21++;
                                      continue L8;
                                    }
                                  }
                                }
                              } else {
                                return null;
                              }
                            } else {
                              return null;
                            }
                          } else {
                            if (0.0 < var28[var16][var13]) {
                              var17 = var28[var16][1 + var3 * 2] / var28[var16][var13];
                              if (var17 >= var14) {
                                if (var17 == var14) {
                                  L9: {
                                    if (var12 == var10) {
                                      break L9;
                                    } else {
                                      if (var16 == var3 * 2) {
                                        break L9;
                                      } else {
                                        var16++;
                                        continue L6;
                                      }
                                    }
                                  }
                                  var10 = var16;
                                  var16++;
                                  continue L6;
                                } else {
                                  var16++;
                                  continue L6;
                                }
                              } else {
                                var14 = var17;
                                var10 = var16;
                                var16++;
                                continue L6;
                              }
                            } else {
                              var16++;
                              continue L6;
                            }
                          }
                        }
                      }
                    } else {
                      if (param1[var10] > param1[var11]) {
                        var10 = var11;
                        var11++;
                        continue L3;
                      } else {
                        var11++;
                        continue L3;
                      }
                    }
                  }
                } else {
                  var28[var10][var10] = 1.0;
                  var11 = 0;
                  L10: while (true) {
                    if (var11 >= var3) {
                      var28[var10][2 * var3] = -1.0;
                      var28[var10][1 + 2 * var3] = param1[var10];
                      var29[var10] = var10;
                      var10++;
                      continue L1;
                    } else {
                      var28[var10][var11 + var3] = -param0[var10][var11];
                      var11++;
                      continue L10;
                    }
                  }
                }
              }
            }
          } else {
            var8 = var6_ref_double__[var7];
            if (0.0 > var8) {
              var5 = 0;
              var7++;
              continue L0;
            } else {
              var7++;
              continue L0;
            }
          }
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = param2 * ((ll) this).field_k >> 2075509996;
        int var5 = ((ll) this).field_l * param2 >> 1568388172;
        int var6 = param1 * ((ll) this).field_j >> 1647844076;
        if (param0 <= 7) {
            return;
        }
        int var7 = ((ll) this).field_h * param1 >> 1849983020;
        kl.a(var5, 16011, var4, var6, var7, ((ll) this).field_a);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Play the game without logging in just yet";
        field_i = -1;
    }
}
