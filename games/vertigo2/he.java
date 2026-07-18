/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he extends gp {
    static String field_B;
    private int[] field_w;
    private int[] field_y;
    static String field_t;
    private ji[] field_v;
    static String field_z;
    static cr field_x;
    private ji field_A;
    static int[] field_u;

    final int[] a(r param0, double param1, boolean param2, boolean param3, int param4, int param5, int param6, ka param7) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int[] var10_array = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19_ref_int__ = null;
        int[][] var19_ref_int____ = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int[][] var25 = null;
        int[] var26 = null;
        int var27 = 0;
        int[][] var28 = null;
        int[][] var29 = null;
        int[][] var30 = null;
        int[][] var31 = null;
        Object stackIn_43_0 = null;
        int[] stackIn_47_0 = null;
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
        int[] stackOut_46_0 = null;
        Object stackOut_42_0 = null;
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
        var24 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            mk.field_P = param7;
            nk.field_Hb = param0;
            var10_int = 0;
            L1: while (true) {
              if (var10_int >= ((he) this).field_v.length) {
                L2: {
                  dl.a(param1, (byte) -107);
                  ib.a((byte) -122, param4, param6);
                  var26 = new int[param6 * param4];
                  var10_array = var26;
                  if (!param2) {
                    var11 = 0;
                    var13 = 1;
                    var12 = param6;
                    break L2;
                  } else {
                    var13 = -1;
                    var12 = -1;
                    var11 = param6 + -1;
                    break L2;
                  }
                }
                var14 = 0;
                var15 = 0;
                L3: while (true) {
                  if (param4 <= var15) {
                    var27 = 0;
                    var15 = var27;
                    if (param5 == 27127) {
                      L4: while (true) {
                        if (var27 >= ((he) this).field_v.length) {
                          stackOut_46_0 = (int[]) var10_array;
                          stackIn_47_0 = stackOut_46_0;
                          break L0;
                        } else {
                          ((he) this).field_v[var27].f(2);
                          var27++;
                          continue L4;
                        }
                      }
                    } else {
                      stackOut_42_0 = null;
                      stackIn_43_0 = stackOut_42_0;
                      return (int[]) (Object) stackIn_43_0;
                    }
                  } else {
                    L5: {
                      if (param3) {
                        var14 = var15;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      if (((he) this).field_A.field_o) {
                        var19_ref_int__ = ((he) this).field_A.c(var15, param5 + -27024);
                        var18 = var19_ref_int__;
                        var16 = var19_ref_int__;
                        var17 = var19_ref_int__;
                        break L6;
                      } else {
                        var31 = ((he) this).field_A.b(-3780, var15);
                        var30 = var31;
                        var29 = var30;
                        var28 = var29;
                        var25 = var28;
                        var19_ref_int____ = var25;
                        var17 = var31[1];
                        var16 = var31[0];
                        var18 = var31[2];
                        break L6;
                      }
                    }
                    var19 = var11;
                    L7: while (true) {
                      if (var12 == var19) {
                        var15++;
                        continue L3;
                      } else {
                        L8: {
                          var20 = var16[var19] >> 4;
                          if (var20 > 255) {
                            var20 = 255;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if (var20 < 0) {
                            var20 = 0;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          var21 = var17[var19] >> 4;
                          if (var21 <= 255) {
                            break L10;
                          } else {
                            var21 = 255;
                            break L10;
                          }
                        }
                        L11: {
                          if (var21 < 0) {
                            var21 = 0;
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        L12: {
                          var22 = var18[var19] >> 4;
                          if (var22 <= 255) {
                            break L12;
                          } else {
                            var22 = 255;
                            break L12;
                          }
                        }
                        L13: {
                          var21 = li.field_l[var21];
                          if (0 > var22) {
                            var22 = 0;
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                        L14: {
                          var20 = li.field_l[var20];
                          var22 = li.field_l[var22];
                          var23 = (var20 << 16) - (-(var21 << 8) - var22);
                          if (var23 != 0) {
                            var23 = var23 | -16777216;
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        L15: {
                          int incrementValue$1 = var14;
                          var14++;
                          var26[incrementValue$1] = var23;
                          if (param3) {
                            var14 = var14 + (-1 + param6);
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        var19 = var19 + var13;
                        continue L7;
                      }
                    }
                  }
                }
              } else {
                ((he) this).field_v[var10_int].b(param4, param6, 255);
                var10_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var10 = decompiledCaughtException;
            stackOut_48_0 = (RuntimeException) var10;
            stackOut_48_1 = new StringBuilder().append("he.D(");
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
              break L16;
            } else {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "{...}";
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              break L16;
            }
          }
          L17: {
            stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
            stackOut_51_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param7 == null) {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L17;
            } else {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "{...}";
              stackIn_54_0 = stackOut_52_0;
              stackIn_54_1 = stackOut_52_1;
              stackIn_54_2 = stackOut_52_2;
              break L17;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + ')');
        }
        return stackIn_47_0;
    }

    public static void a(byte param0) {
        field_B = null;
        field_u = null;
        field_z = null;
        field_x = null;
        field_t = null;
    }

    final static boolean a(byte param0, int param1) {
        if (param0 > -72) {
            return true;
        }
        return 0 != (param1 & 2) ? true : false;
    }

    final static void a(int param0, ub param1, int param2) {
        mi var5 = null;
        int var4 = 0;
        try {
            var5 = uh.field_Wb;
            var5.j(param0, 118);
            var5.field_u = var5.field_u + 1;
            var4 = var5.field_u;
            var5.f(1, 117);
            var5.f(param1.field_u, -71);
            if (param2 != -27011) {
                boolean discarded$0 = he.a((byte) -108, 124);
            }
            var5.b(param1.field_q, (byte) -124);
            var5.e(param1.field_s, 0);
            var5.e(param1.field_o, 0);
            var5.e(param1.field_r, 0);
            var5.e(param1.field_n, 0);
            int discarded$1 = var5.c(var4, 85);
            var5.b((byte) 53, var5.field_u - var4);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "he.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean a(r param0, ka param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (b.field_i >= 0) {
                var4_int = 0;
                L2: while (true) {
                  if (var4_int >= ((he) this).field_y.length) {
                    break L1;
                  } else {
                    if (!param0.b(param2, b.field_i, ((he) this).field_y[var4_int])) {
                      stackOut_13_0 = 0;
                      stackIn_14_0 = stackOut_13_0;
                      return stackIn_14_0 != 0;
                    } else {
                      var4_int++;
                      continue L2;
                    }
                  }
                }
              } else {
                var4_int = 0;
                L3: while (true) {
                  if (var4_int >= ((he) this).field_y.length) {
                    break L1;
                  } else {
                    if (!param0.a(((he) this).field_y[var4_int], (byte) 53)) {
                      stackOut_6_0 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      return stackIn_7_0 != 0;
                    } else {
                      var4_int++;
                      continue L3;
                    }
                  }
                }
              }
            }
            var4_int = param2;
            L4: while (true) {
              if (((he) this).field_w.length <= var4_int) {
                stackOut_22_0 = 1;
                stackIn_23_0 = stackOut_22_0;
                break L0;
              } else {
                if (param1.f(0, ((he) this).field_w[var4_int])) {
                  var4_int++;
                  continue L4;
                } else {
                  stackOut_19_0 = 0;
                  stackIn_20_0 = stackOut_19_0;
                  return stackIn_20_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var4;
            stackOut_24_1 = new StringBuilder().append("he.C(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L5;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L5;
            }
          }
          L6: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L6;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L6;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param2 + ')');
        }
        return stackIn_23_0 != 0;
    }

    he(ed param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[][] var12 = null;
        ji var13 = null;
        ji var14 = null;
        int[][] var15 = null;
        ji var16 = null;
        int[][] var17 = null;
        int[][] var18 = null;
        int[][] var19 = null;
        int[][] var20 = null;
        int[][] var21 = null;
        int[][] var22 = null;
        int[][] var23 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            var2_int = param0.h(-11);
            var3 = 0;
            var4 = 0;
            var22 = new int[var2_int][];
            var20 = var22;
            var18 = var20;
            var15 = var18;
            var12 = var15;
            var23 = var12;
            var21 = var23;
            var19 = var21;
            var17 = var19;
            var5 = var17;
            ((he) this).field_v = new ji[var2_int];
            var6 = 0;
            L1: while (true) {
              if (var2_int <= var6) {
                ((he) this).field_y = new int[var3];
                var3 = 0;
                ((he) this).field_w = new int[var4];
                var4 = 0;
                var6 = 0;
                L2: while (true) {
                  if (var2_int <= var6) {
                    ((he) this).field_A = ((he) this).field_v[param0.h(-11)];
                    int discarded$4 = param0.h(-11);
                    var5 = null;
                    int discarded$5 = param0.h(-11);
                    break L0;
                  } else {
                    var16 = ((he) this).field_v[var6];
                    var8 = var16.field_u.length;
                    var9 = 0;
                    L3: while (true) {
                      if (var8 <= var9) {
                        L4: {
                          var9 = var16.a((byte) -117);
                          var10 = var16.e(6557);
                          if (var9 <= 0) {
                            break L4;
                          } else {
                            int incrementValue$6 = var3;
                            var3++;
                            ((he) this).field_y[incrementValue$6] = var9;
                            break L4;
                          }
                        }
                        L5: {
                          if (var10 <= 0) {
                            break L5;
                          } else {
                            int incrementValue$7 = var4;
                            var4++;
                            ((he) this).field_w[incrementValue$7] = var10;
                            break L5;
                          }
                        }
                        var5[var6] = null;
                        var6++;
                        continue L2;
                      } else {
                        var16.field_u[var9] = ((he) this).field_v[var23[var6][var9]];
                        var9++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                L6: {
                  var13 = ve.a((byte) -109, param0);
                  var14 = var13;
                  if (0 > var14.a((byte) -117)) {
                    break L6;
                  } else {
                    var3++;
                    break L6;
                  }
                }
                L7: {
                  if (var14.e(6557) < 0) {
                    break L7;
                  } else {
                    var4++;
                    break L7;
                  }
                }
                var8 = var14.field_u.length;
                var12[var6] = new int[var8];
                var9 = 0;
                L8: while (true) {
                  if (var9 >= var8) {
                    ((he) this).field_v[var6] = var13;
                    var6++;
                    continue L1;
                  } else {
                    var22[var6][var9] = param0.h(-11);
                    var9++;
                    continue L8;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var2;
            stackOut_23_1 = new StringBuilder().append("he.<init>(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "Owner";
        field_t = "Personal Best: <%0>";
        field_z = "Play the game without logging in just yet";
        field_u = new int[4];
    }
}
