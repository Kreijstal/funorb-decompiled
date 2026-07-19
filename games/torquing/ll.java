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
        int var4 = param1 * this.field_k >> -743431220;
        int var5 = this.field_l * param1 >> 935231596;
        int var6 = param0 * this.field_j >> 2131250028;
        int var7 = param0 * this.field_h >> -26079220;
        ko.a(this.field_c, var7, this.field_e, var5, var6, -2910, var4);
    }

    ll(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        super(param4, param5, param6);
        this.field_h = param3;
        this.field_k = param0;
        this.field_j = param1;
        this.field_l = param2;
    }

    final void a(int param0, int param1, int param2) {
        int var4 = this.field_k * param0 >> 1762625676;
        if (param2 > -101) {
            return;
        }
        int var5 = this.field_l * param0 >> -1000989140;
        int var6 = this.field_j * param1 >> 1384096844;
        int var7 = param1 * this.field_h >> 1596435436;
        ii.a(var6, var5, var7, this.field_e, var4, 2124, this.field_c, this.field_a);
    }

    final static double[] a(double[][] param0, double[] param1, byte param2) {
        double[] discarded$1 = null;
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
        double var17 = 0.0;
        int var19 = 0;
        double[] var20 = null;
        int var21 = 0;
        double[][] var28 = null;
        int[] var29 = null;
        double[] stackIn_9_0 = null;
        int stackIn_27_0 = 0;
        Object stackIn_42_0 = null;
        Object stackIn_45_0 = null;
        double[] stackIn_58_0 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_62_2 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        double[] stackOut_8_0 = null;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        double[] stackOut_57_0 = null;
        Object stackOut_44_0 = null;
        Object stackOut_41_0 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
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
                  stackOut_8_0 = (double[]) (var4);
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
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
                          var20 = (double[]) null;
                          discarded$1 = ll.a((double[][]) null, (double[]) null, (byte) 59);
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
                                if (0 != (var10 ^ -1)) {
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
                                        stackOut_57_0 = (double[]) (var4);
                                        stackIn_58_0 = stackOut_57_0;
                                        decompiledRegionSelector0 = 3;
                                        break L0;
                                      } else {
                                        if (var29[var21] >= var3_int) {
                                          L10: {
                                            if (var3_int * 2 > var29[var21]) {
                                              var4[var29[var21] - var3_int] = var28[var21][1 + 2 * var3_int];
                                              break L10;
                                            } else {
                                              break L10;
                                            }
                                          }
                                          var21++;
                                          continue L9;
                                        } else {
                                          var21++;
                                          continue L9;
                                        }
                                      }
                                    }
                                  } else {
                                    stackOut_44_0 = null;
                                    stackIn_45_0 = stackOut_44_0;
                                    decompiledRegionSelector0 = 2;
                                    break L0;
                                  }
                                } else {
                                  stackOut_41_0 = null;
                                  stackIn_42_0 = stackOut_41_0;
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                }
                              } else {
                                if (0.0 < var28[var16][var13]) {
                                  L11: {
                                    var17 = var28[var16][1 + var3_int * 2] / var28[var16][var13];
                                    if (var17 >= var14) {
                                      if (var17 == var14) {
                                        L12: {
                                          if (var12 == var10) {
                                            break L12;
                                          } else {
                                            if (var16 == var3_int * 2) {
                                              break L12;
                                            } else {
                                              break L11;
                                            }
                                          }
                                        }
                                        var10 = var16;
                                        break L11;
                                      } else {
                                        var16++;
                                        continue L7;
                                      }
                                    } else {
                                      var14 = var17;
                                      var10 = var16;
                                      break L11;
                                    }
                                  }
                                  var16++;
                                  continue L7;
                                } else {
                                  var16++;
                                  continue L7;
                                }
                              }
                            }
                          }
                        } else {
                          if (param1[var10] > param1[var11]) {
                            var10 = var11;
                            var11++;
                            continue L4;
                          } else {
                            var11++;
                            continue L4;
                          }
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
                var8 = var6_ref_double__[var7];
                if (0.0 > var8) {
                  var5 = 0;
                  var7++;
                  continue L1;
                } else {
                  var7++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var3 = decompiledCaughtException;
            stackOut_59_0 = (RuntimeException) (var3);
            stackOut_59_1 = new StringBuilder().append("ll.E(");
            stackIn_61_0 = stackOut_59_0;
            stackIn_61_1 = stackOut_59_1;
            stackIn_60_0 = stackOut_59_0;
            stackIn_60_1 = stackOut_59_1;
            if (param0 == null) {
              stackOut_61_0 = (RuntimeException) ((Object) stackIn_61_0);
              stackOut_61_1 = (StringBuilder) ((Object) stackIn_61_1);
              stackOut_61_2 = "null";
              stackIn_62_0 = stackOut_61_0;
              stackIn_62_1 = stackOut_61_1;
              stackIn_62_2 = stackOut_61_2;
              break L14;
            } else {
              stackOut_60_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackOut_60_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackOut_60_2 = "{...}";
              stackIn_62_0 = stackOut_60_0;
              stackIn_62_1 = stackOut_60_1;
              stackIn_62_2 = stackOut_60_2;
              break L14;
            }
          }
          L15: {
            stackOut_62_0 = (RuntimeException) ((Object) stackIn_62_0);
            stackOut_62_1 = ((StringBuilder) (Object) stackIn_62_1).append(stackIn_62_2).append(',');
            stackIn_64_0 = stackOut_62_0;
            stackIn_64_1 = stackOut_62_1;
            stackIn_63_0 = stackOut_62_0;
            stackIn_63_1 = stackOut_62_1;
            if (param1 == null) {
              stackOut_64_0 = (RuntimeException) ((Object) stackIn_64_0);
              stackOut_64_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackOut_64_2 = "null";
              stackIn_65_0 = stackOut_64_0;
              stackIn_65_1 = stackOut_64_1;
              stackIn_65_2 = stackOut_64_2;
              break L15;
            } else {
              stackOut_63_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackOut_63_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackOut_63_2 = "{...}";
              stackIn_65_0 = stackOut_63_0;
              stackIn_65_1 = stackOut_63_1;
              stackIn_65_2 = stackOut_63_2;
              break L15;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_65_0), stackIn_65_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (double[]) ((Object) stackIn_42_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (double[]) ((Object) stackIn_45_0);
            } else {
              return stackIn_58_0;
            }
          }
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = param2 * this.field_k >> 2075509996;
        int var5 = this.field_l * param2 >> 1568388172;
        int var6 = param1 * this.field_j >> 1647844076;
        if (param0 <= 7) {
            return;
        }
        int var7 = this.field_h * param1 >> 1849983020;
        kl.a(var5, 16011, var4, var6, var7, this.field_a);
    }

    static {
        field_m = "Play the game without logging in just yet";
        field_i = -1;
    }
}
