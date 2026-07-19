/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tm extends am {
    static ot field_z;
    static ut field_u;
    static String field_r;
    static ut field_v;
    static int field_t;
    String field_s;
    static int[][] field_x;
    Class[] field_p;
    String field_o;
    static int[] field_y;
    static ut[] field_n;
    static ut field_w;
    static String[] field_q;

    public static void a(int param0) {
        field_n = null;
        field_w = null;
        field_r = null;
        field_u = null;
        field_v = null;
        field_q = null;
        if (param0 != 15) {
          field_x = (int[][]) null;
          field_x = (int[][]) null;
          field_y = null;
          field_z = null;
          return;
        } else {
          field_x = (int[][]) null;
          field_y = null;
          field_z = null;
          return;
        }
    }

    final boolean a(li[] param0, int param1, String param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        Class var5 = null;
        int var6 = 0;
        dg var7 = null;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var6 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param1 == 2) {
                break L1;
              } else {
                var7 = (dg) null;
                tm.a(58, 112, true, (dg) null);
                break L1;
              }
            }
            if (!this.field_o.equals(param2)) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0.length != this.field_p.length) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var4_int = 0;
                L2: while (true) {
                  if (this.field_p.length <= var4_int) {
                    stackOut_31_0 = 1;
                    stackIn_32_0 = stackOut_31_0;
                    decompiledRegionSelector0 = 6;
                    break L0;
                  } else {
                    L3: {
                      if (param0[var4_int].field_b) {
                        L4: {
                          var5 = rm.a(param0[var4_int].field_d, (byte) 127);
                          if (var5 != Boolean.TYPE) {
                            break L4;
                          } else {
                            if (this.field_p[var4_int] != Boolean.TYPE) {
                              stackOut_20_0 = 0;
                              stackIn_21_0 = stackOut_20_0;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L5: {
                          if (Character.TYPE != var5) {
                            break L5;
                          } else {
                            if (this.field_p[var4_int] == Character.TYPE) {
                              break L5;
                            } else {
                              stackOut_24_0 = 0;
                              stackIn_25_0 = stackOut_24_0;
                              decompiledRegionSelector0 = 4;
                              break L0;
                            }
                          }
                        }
                        if (!fp.a(89, var5)) {
                          break L3;
                        } else {
                          if (fp.a(98, this.field_p[var4_int])) {
                            break L3;
                          } else {
                            stackOut_28_0 = 0;
                            stackIn_29_0 = stackOut_28_0;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        }
                      } else {
                        if (this.field_p[var4_int].isInstance(param0[var4_int].field_d)) {
                          break L3;
                        } else {
                          stackOut_15_0 = 0;
                          stackIn_16_0 = stackOut_15_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                    var4_int++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) (var4);
            stackOut_33_1 = new StringBuilder().append("tm.G(");
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L6;
            } else {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L6;
            }
          }
          L7: {
            stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
            stackOut_36_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',').append(param1).append(',');
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param2 == null) {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L7;
            } else {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L7;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_21_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_25_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_29_0 != 0;
                  } else {
                    return stackIn_32_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    final static boolean b(int param0) {
        si var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        si var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_2_0 = 0;
        var3 = Kickabout.field_G;
        try {
          L0: {
            if (param0 == -16000) {
              var4 = (si) ((Object) nv.field_N.g(param0 ^ -25527));
              var1 = var4;
              if (var1 == null) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var2 = 0;
                L1: while (true) {
                  if (var1.field_n <= var2) {
                    stackOut_22_0 = 1;
                    stackIn_23_0 = stackOut_22_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    L2: {
                      if (null != var4.field_f[var2]) {
                        if (-1 != (var4.field_f[var2].field_a ^ -1)) {
                          break L2;
                        } else {
                          stackOut_13_0 = 0;
                          stackIn_14_0 = stackOut_13_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      if (null != var4.field_e[var2]) {
                        if (0 == var4.field_e[var2].field_a) {
                          stackOut_19_0 = 0;
                          stackIn_20_0 = stackOut_19_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                    var2++;
                    continue L1;
                  }
                }
              }
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1_ref), "tm.I(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_20_0 != 0;
              } else {
                return stackIn_23_0 != 0;
              }
            }
          }
        }
    }

    public final String toString() {
        return this.field_s;
    }

    abstract li a(byte param0, li[] param1);

    final static void a(int param0, int param1, boolean param2, dg param3) {
        mt.field_a = param1;
        if (param2) {
            return;
        }
        try {
            ba.field_p = param3;
            dq.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "tm.H(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    tm(String param0, Class[] param1, String param2) {
        StringBuilder discarded$480 = null;
        StringBuilder discarded$481 = null;
        StringBuilder discarded$482 = null;
        StringBuilder discarded$483 = null;
        RuntimeException var4 = null;
        int var5 = 0;
        StringBuilder var7 = null;
        StringBuilder var8 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            this.field_o = param0;
            this.field_p = param1;
            var7 = new StringBuilder(this.field_o).append('(');
            var8 = var7;
            var5 = 0;
            L1: while (true) {
              if (this.field_p.length <= var5) {
                L2: {
                  discarded$480 = var8.append(')');
                  if (param2 == null) {
                    break L2;
                  } else {
                    discarded$481 = var8.append("     <col=ffaaff>" + param2 + "</col>");
                    break L2;
                  }
                }
                this.field_s = var8.toString();
                break L0;
              } else {
                discarded$482 = var7.append(dr.a(-120, this.field_p[var5]));
                if (this.field_p.length + -1 <= var5) {
                  var5++;
                  continue L1;
                } else {
                  discarded$483 = var8.append(", ");
                  var5++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var4);
            stackOut_11_1 = new StringBuilder().append("tm.<init>(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          L4: {
            stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          L5: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
    }

    static {
        field_u = new ut(76, 92);
        field_t = 0;
        field_x = new int[3][4];
        field_x[0][0] = 7508762;
        field_x[0][1] = 7180825;
        field_x[0][2] = 8100378;
        field_x[0][3] = 8100371;
        field_x[1][0] = 13943953;
        field_x[1][3] = 15061120;
        field_x[1][2] = 13878165;
        field_x[1][1] = 13352330;
        field_x[2][0] = 5921627;
        field_x[2][1] = 4934732;
        field_x[2][2] = 2960685;
        field_x[2][3] = 6568505;
        field_r = "<%0> has joined your game.";
        field_v = new ut(270, 70);
        field_y = new int[3];
        field_q = new String[]{"<img=0>The highest league in Kickabout is known as the Diamond Division. The rules here are slightly different.", "<img=0>When you reach the Diamond Division, your league points vanish and are replaced with <col=ffff00>diamond league points</col>.", "<img=0>Players compete with each other in a weekly battle to get the highest score. There is no maximum value or target score to reach.", "<img=0>Diamond league points are reset every week at <col=ffff00>10am GMT on Tuesdays</col>. All players' scores are set back to 0.", "<img=0>The player(s) with the highest score at the end of each week receives the Diamond Trophy and the famous 'We Are The Champions' Achievement!"};
        field_y[2] = 22;
        field_y[1] = 17;
        field_y[0] = 15;
    }
}
