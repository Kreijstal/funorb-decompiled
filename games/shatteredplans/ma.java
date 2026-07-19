/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma extends ka {
    static String field_q;
    static String[][] field_s;
    static bi field_r;
    static int field_p;

    final int c(ln param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ln[] var4 = null;
        int var5 = 0;
        ln var6 = null;
        int var7 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 0;
              if (param1 == -5) {
                break L1;
              } else {
                field_s = (String[][]) null;
                break L1;
              }
            }
            var4 = param0.field_D;
            var5 = 0;
            L2: while (true) {
              if (var5 >= var4.length) {
                stackOut_8_0 = super.c(param0, -5) - -(var3_int * 4);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                L3: {
                  var6 = var4[var5];
                  if (this.field_n != var6.field_y) {
                    break L3;
                  } else {
                    var3_int++;
                    break L3;
                  }
                }
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3);
            stackOut_10_1 = new StringBuilder().append("ma.NA(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final static void j(int param0) {
        if (param0 != 25140) {
            return;
        }
        if ((oq.field_j ^ -1) == -85) {
            fl.a(0, "enter");
            return;
        }
    }

    final static int a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
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
            if (param1 == 2) {
              stackOut_3_0 = fc.a(10, param0, (byte) -108, true);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = -125;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("ma.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final int d(ln param0, int param1) {
        int discarded$2 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        ln var4 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 2) {
                break L1;
              } else {
                var4 = (ln) null;
                discarded$2 = this.a((byte) -71, (ln) null);
                break L1;
              }
            }
            L2: {
              var3_int = this.a(-5, param0) + (param0.field_x >> 2081046625);
              if (-1 == (var3_int ^ -1)) {
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = var3_int;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var3);
            stackOut_6_1 = new StringBuilder().append("ma.F(");
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
          throw r.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0;
    }

    ma(dc param0, fs param1, mn param2) {
        super(param0, param1, param2, 7);
    }

    public static void i(int param0) {
        field_r = null;
        field_q = null;
        field_s = (String[][]) null;
        if (param0 <= 3) {
            field_r = (bi) null;
        }
    }

    final int a(byte param0, ln param1) {
        int discarded$1 = 0;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var5 = 0;
        ln[] var7 = null;
        int var8 = 0;
        ln var9 = null;
        int var10 = 0;
        ln var11 = null;
        ln[] var12 = null;
        ln var13 = null;
        fs[] var14 = null;
        fs var15 = null;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var12 = param1.field_D;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var12.length) {
                L2: {
                  var14 = this.field_g.field_v;
                  var5 = 0;
                  if (param0 < -14) {
                    break L2;
                  } else {
                    var11 = (ln) null;
                    discarded$1 = this.d((ln) null, 93);
                    break L2;
                  }
                }
                L3: while (true) {
                  if (var5 >= var14.length) {
                    stackOut_23_0 = var3_int;
                    stackIn_24_0 = stackOut_23_0;
                    break L0;
                  } else {
                    L4: {
                      var15 = var14[var5];
                      if (this.field_n == var15) {
                        break L4;
                      } else {
                        if (!this.field_n.field_h[var15.field_x]) {
                          var7 = param1.field_D;
                          var8 = 0;
                          L5: while (true) {
                            if (var8 >= var7.length) {
                              break L4;
                            } else {
                              L6: {
                                var9 = var7[var8];
                                if (var9.field_y == var15) {
                                  var3_int = var3_int + var9.field_R.field_r;
                                  break L6;
                                } else {
                                  break L6;
                                }
                              }
                              var8++;
                              continue L5;
                            }
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                    var5++;
                    continue L3;
                  }
                }
              } else {
                var13 = var12[var5];
                if (null != var13.field_y) {
                  if (var13.field_y != this.field_n) {
                    if (!this.field_n.field_h[var13.field_y.field_x]) {
                      var3_int = var3_int + var13.field_x;
                      var5++;
                      continue L1;
                    } else {
                      var5++;
                      continue L1;
                    }
                  } else {
                    var5++;
                    continue L1;
                  }
                } else {
                  var5++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var3);
            stackOut_25_1 = new StringBuilder().append("ma.U(").append(param0).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L7;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L7;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
        return stackIn_24_0;
    }

    final int[] b(int param0) {
        int var2 = -23 / ((-48 - param0) / 61);
        return new int[]{17, 15};
    }

    final int a(int param0, byte param1) {
        int discarded$0 = 0;
        if (param1 > -25) {
            CharSequence var4 = (CharSequence) null;
            discarded$0 = ma.a((CharSequence) null, -24);
        }
        if (param0 < 5) {
            return param0;
        }
        if ((param0 ^ -1) > -26) {
            return (param0 - -5) / 2;
        }
        return -10 + param0;
    }

    final int b(byte param0, ln param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        int stackIn_2_0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
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
              var3_int = 126 / ((param0 - -44) / 62);
              stackOut_0_0 = this.a((byte) -92, param1) * 3;
              stackIn_2_0 = stackOut_0_0;
              stackIn_1_0 = stackOut_0_0;
              if (param1.field_u) {
                stackOut_2_0 = stackIn_2_0;
                stackOut_2_1 = 2;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                break L1;
              } else {
                stackOut_1_0 = stackIn_1_0;
                stackOut_1_1 = 1;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                break L1;
              }
            }
            stackOut_3_0 = stackIn_3_0 >> stackIn_3_1;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("ma.R(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    static {
        field_q = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_s = new String[][]{new String[]{"We will not bow before such as you."}, new String[]{"We cannot ally with any who call <%largestplayer> a friend."}, new String[]{"You do not have sufficient might to deserve that honour."}, new String[]{"An alliance with <%you> does not fit into our expansion plans."}, new String[]{"While we could of course defeat you easily, the forces on our borders can be better used elsewhere."}, new String[]{"Agreed. Let <%largestplayer> tremble before our combined might."}, new String[]{"We shall stand together in the battles ahead."}, new String[]{"The forces deployed on our borders could be put to better use. Let us sign a non-agression pact immediately."}, new String[]{"Join with us, and together we can end the tyranny of <%largestplayer>."}, new String[]{"Unite with us; our two nations together as one would be a power unmatched."}, new String[]{"A wise decision. Such profitless conflict serves neither of us."}, new String[]{"Excellent. We will begin mobilizing our forces against <%largestplayer> immediately."}, new String[]{"Excellent. Let us coordinate our battle plans."}, new String[]{"Time has yet to erase the mistakes of <%you>."}, new String[]{"The <%me> claims this portion of the galaxy. Defend yourself."}, new String[]{"The <%me> shall guard its borders carefully."}, new String[]{"We are the <%me>, and we are prepared for combat."}, new String[]{"The <%me> looks forward to an era of enlightened peace and prosperity."}, new String[]{"Do not attempt to interfere with the plans of <%me>."}, new String[]{"These resources will be of use in the struggle ahead.", "The citizens of <%system> are adjusting well to their new leadership."}, new String[]{"The defences at <%system> are strong indeed."}, new String[]{"<%system> will remain mine for all time!"}, new String[]{"Attacking <%system> was a tactical error."}, new String[]{"<%system> would be a prize indeed."}, new String[]{"You have no chance to survive, make your time.", "Your fall is now inevitable.", "Rest assured - your cultural artefacts will be preserved after your civilization collapses."}, new String[]{"No! This will not be tolerated!"}, new String[]{"Cease this useless violence!"}};
    }
}
