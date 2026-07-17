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

    public static void b() {
        field_m = null;
    }

    final void a(int param0, int param1, byte param2) {
        if (param2 != 106) {
            field_g = -31;
        }
        int var4 = param1 * ((ll) this).field_k >> 12;
        int var5 = ((ll) this).field_l * param1 >> 12;
        int var6 = param0 * ((ll) this).field_j >> 12;
        int var7 = param0 * ((ll) this).field_h >> 12;
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
        int var4 = ((ll) this).field_k * param0 >> 12;
        if (param2 > -101) {
            return;
        }
        int var5 = ((ll) this).field_l * param0 >> 12;
        int var6 = ((ll) this).field_j * param1 >> 12;
        int var7 = param1 * ((ll) this).field_h >> 12;
        ii.a(var6, var5, var7, ((ll) this).field_e, var4, 2124, ((ll) this).field_c, ((ll) this).field_a);
    }

    final static double[] a(double[][] param0, double[] param1, byte param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
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
        int var19 = 0;
        Object var20 = null;
        int var21 = 0;
        double[][] var28 = null;
        int[] var29 = null;
        double[] stackIn_9_0 = null;
        int stackIn_27_0 = 0;
        Object stackIn_34_0 = null;
        Object stackIn_37_0 = null;
        double[] stackIn_47_0 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        double[] stackOut_8_0 = null;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        double[] stackOut_46_0 = null;
        Object stackOut_36_0 = null;
        Object stackOut_33_0 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        var19 = Torquing.field_u;
        try {
          L0: {
            var3_int = param0.length;
            var4 = new double[var3_int];
            var5 = 1;
            var6_ref_double__ = param1;
            var7 = 0;
            L1: while (true) {
              if (var7 >= var6_ref_double__.length) {
                if (var5 != 0) {
                  stackOut_8_0 = (double[]) var4;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                } else {
                  var6 = param0.length * param0.length;
                  var7 = 2 * var3_int - -2;
                  var28 = new double[var3_int][var7];
                  var29 = new int[var3_int];
                  var10 = 0;
                  L2: while (true) {
                    if (var10 >= var3_int) {
                      L3: {
                        if (param2 >= 118) {
                          break L3;
                        } else {
                          var20 = null;
                          double[] discarded$1 = ll.a((double[][]) null, (double[]) null, (byte) 59);
                          break L3;
                        }
                      }
                      var10 = 0;
                      var11 = 1;
                      L4: while (true) {
                        if (var3_int <= var11) {
                          var11 = var10;
                          var12 = cp.a(var7, var10, -53, var3_int * 2, var3_int, var28, var29);
                          L5: while (true) {
                            L6: {
                              if (var3_int <= var12) {
                                stackOut_26_0 = -var3_int + var12;
                                stackIn_27_0 = stackOut_26_0;
                                break L6;
                              } else {
                                stackOut_25_0 = var3_int + var12;
                                stackIn_27_0 = stackOut_25_0;
                                break L6;
                              }
                            }
                            var13 = stackIn_27_0;
                            var10 = -1;
                            var14 = Double.POSITIVE_INFINITY;
                            var16 = 0;
                            L7: while (true) {
                              if (var3_int <= var16) {
                                if (var10 != -1) {
                                  var6--;
                                  if (var6 != 0) {
                                    L8: {
                                      var12 = cp.a(var7, var10, -127, var13, var3_int, var28, var29);
                                      if (var3_int * 2 == var12) {
                                        break L8;
                                      } else {
                                        if (Math.abs(var28[var11][var3_int * 2 + 1]) > 1e-15) {
                                          continue L5;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                    var21 = 0;
                                    var13 = var21;
                                    L9: while (true) {
                                      if (var21 >= var3_int) {
                                        stackOut_46_0 = (double[]) var4;
                                        stackIn_47_0 = stackOut_46_0;
                                        break L0;
                                      } else {
                                        L10: {
                                          if (var29[var21] < var3_int) {
                                            break L10;
                                          } else {
                                            break L10;
                                          }
                                        }
                                        var21++;
                                        continue L9;
                                      }
                                    }
                                  } else {
                                    stackOut_36_0 = null;
                                    stackIn_37_0 = stackOut_36_0;
                                    return (double[]) (Object) stackIn_37_0;
                                  }
                                } else {
                                  stackOut_33_0 = null;
                                  stackIn_34_0 = stackOut_33_0;
                                  return (double[]) (Object) stackIn_34_0;
                                }
                              } else {
                                L11: {
                                  if (0.0 >= var28[var16][var13]) {
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                                var16++;
                                continue L7;
                              }
                            }
                          }
                        } else {
                          L12: {
                            if (param1[var10] <= param1[var11]) {
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          var11++;
                          continue L4;
                        }
                      }
                    } else {
                      var28[var10][var10] = 1.0;
                      var11 = 0;
                      L13: while (true) {
                        if (var11 >= var3_int) {
                          var28[var10][2 * var3_int] = -1.0;
                          var28[var10][1 + 2 * var3_int] = param1[var10];
                          var29[var10] = var10;
                          var10++;
                          continue L2;
                        } else {
                          var28[var10][var11 + var3_int] = -param0[var10][var11];
                          var11++;
                          continue L13;
                        }
                      }
                    }
                  }
                }
              } else {
                L14: {
                  var8 = var6_ref_double__[var7];
                  if (0.0 <= var8) {
                    break L14;
                  } else {
                    break L14;
                  }
                }
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var3 = decompiledCaughtException;
            stackOut_48_0 = (RuntimeException) var3;
            stackOut_48_1 = new StringBuilder().append("ll.E(");
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param0 == null) {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L15;
            } else {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "{...}";
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              break L15;
            }
          }
          L16: {
            stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
            stackOut_51_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(44);
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param1 == null) {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L16;
            } else {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "{...}";
              stackIn_54_0 = stackOut_52_0;
              stackIn_54_1 = stackOut_52_1;
              stackIn_54_2 = stackOut_52_2;
              break L16;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + 44 + param2 + 41);
        }
        return stackIn_47_0;
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = param2 * ((ll) this).field_k >> 12;
        int var5 = ((ll) this).field_l * param2 >> 12;
        int var6 = param1 * ((ll) this).field_j >> 12;
        if (param0 <= 7) {
            return;
        }
        int var7 = ((ll) this).field_h * param1 >> 12;
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
