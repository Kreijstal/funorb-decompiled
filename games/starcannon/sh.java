/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sh extends fh {
    static String field_s;
    static boolean field_t;

    sh(int param0) {
        this(nb.field_c, param0);
    }

    private sh(qe param0, int param1) {
        super(param0, param1);
    }

    public static void b(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 4) {
                break L1;
              } else {
                field_t = false;
                break L1;
              }
            }
            field_s = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var1, "sh.CA(" + param0 + ')');
        }
    }

    final static void a(boolean param0, boolean param1, int param2, int[] param3, lb param4, int[] param5, boolean param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_61_0 = 0;
        int stackOut_61_1 = 0;
        int stackOut_62_0 = 0;
        int stackOut_62_1 = 0;
        int stackOut_59_0 = 0;
        int stackOut_59_1 = 0;
        int stackOut_68_0 = 0;
        boolean stackOut_68_1 = false;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        var31 = StarCannon.field_A;
        try {
          L0: {
            var7_int = 2147483647;
            var8 = -2147483648;
            var21 = param5[3] >> 2;
            var22 = param5[4] >> 2;
            var23 = param5[5] >> 2;
            var24 = param5[6] >> 2;
            var25 = param5[7] >> 2;
            var26 = param5[8] >> 2;
            var27 = param5[9] >> 2;
            var28 = param5[10] >> 2;
            var12 = param3[3] * var21 + (param3[4] * var22 + var23 * param3[5]) >> 14;
            var29 = param5[11] >> 2;
            var13 = var26 * param3[5] + (var24 * param3[3] - -(var25 * param3[4])) >> 14;
            var19 = param3[10] * var25 + param3[9] * var24 + var26 * param3[11] >> 14;
            var14 = param3[5] * var29 + (var27 * param3[3] + param3[4] * var28) >> 14;
            var20 = var29 * param3[11] + var28 * param3[10] + param3[9] * var27 >> 14;
            var18 = var22 * param3[10] + (param3[9] * var21 - -(var23 * param3[11])) >> 14;
            var15 = param3[6] * var21 + (param3[7] * var22 + param3[8] * var23) >> 14;
            var16 = param3[8] * var26 + var25 * param3[7] + var24 * param3[6] >> 14;
            var17 = param3[8] * var29 + var27 * param3[6] + param3[7] * var28 >> 14;
            var30 = -71 / ((-53 - param2) / 35);
            var21 = param3[0] + -param5[0];
            var22 = param3[1] + -param5[1];
            var23 = param3[2] + -param5[2];
            var9 = var21 * param5[3] + (param5[4] * var22 - -(var23 * param5[5])) >> 16 - fb.field_r;
            var11 = var23 * param5[11] + var22 * param5[10] + var21 * param5[9] >> 16;
            var10 = var23 * param5[8] + param5[6] * var21 - -(param5[7] * var22) >> -fb.field_r + 16;
            var21 = gl.field_e;
            var22 = gl.field_i;
            var23 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (var23 >= param4.field_R) {
                      break L4;
                    } else {
                      var24 = param4.field_J[var23];
                      var25 = param4.field_x[var23];
                      var26 = param4.field_q[var23];
                      var27 = var9 - -(var26 * var18 + var24 * var12 - -(var15 * var25) >> 16 - fb.field_r);
                      var28 = (var26 * var19 + var24 * var13 + var16 * var25 >> 16 + -fb.field_r) + var10;
                      var29 = (var17 * var25 + (var24 * var14 + var20 * var26) >> 16) + var11;
                      stackOut_3_0 = var29;
                      stackOut_3_1 = 50;
                      stackIn_60_0 = stackOut_3_0;
                      stackIn_60_1 = stackOut_3_1;
                      stackIn_4_0 = stackOut_3_0;
                      stackIn_4_1 = stackOut_3_1;
                      if (var31 != 0) {
                        L5: while (true) {
                          if (stackIn_60_0 >= stackIn_60_1) {
                            break L3;
                          } else {
                            stackOut_61_0 = var18;
                            stackOut_61_1 = rc.field_a.length;
                            stackIn_69_0 = stackOut_61_0;
                            stackIn_69_1 = stackOut_61_1;
                            stackIn_62_0 = stackOut_61_0;
                            stackIn_62_1 = stackOut_61_1;
                            if (var31 != 0) {
                              break L2;
                            } else {
                              stackOut_62_0 = stackIn_62_0;
                              stackOut_62_1 = stackIn_62_1;
                              stackIn_64_0 = stackOut_62_0;
                              stackIn_64_1 = stackOut_62_1;
                              if (stackIn_64_0 >= stackIn_64_1) {
                                break L3;
                              } else {
                                var19 = param4.field_N[var18];
                                var20 = param4.field_a[var18];
                                var21 = param4.field_o[var18];
                                rc.field_a[var18] = var21 * var15 + var20 * var12 + var9 * var19 >> 16;
                                fb.field_m[var18] = var20 * var13 + (var10 * var19 + var21 * var16) >> 16;
                                p.field_f[var18] = var17 * var21 + var19 * var11 + var20 * var14 >> 16;
                                var18++;
                                if (var31 == 0) {
                                  stackOut_59_0 = ~param4.field_s;
                                  stackOut_59_1 = ~var18;
                                  stackIn_60_0 = stackOut_59_0;
                                  stackIn_60_1 = stackOut_59_1;
                                  continue L5;
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        L6: {
                          L7: {
                            if (stackIn_4_0 < stackIn_4_1) {
                              break L7;
                            } else {
                              L8: {
                                bh.field_c[var23] = var27 / var29 + var21;
                                ri.field_a[var23] = var22 + var28 / var29;
                                sc.field_d[var23] = var29;
                                if (var29 < var7_int) {
                                  var7_int = var29;
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                              if (~var8 <= ~var29) {
                                break L6;
                              } else {
                                var8 = var29;
                                if (var31 == 0) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          sc.field_d[var23] = -2147483648;
                          break L6;
                        }
                        L9: {
                          if (!param0) {
                            break L9;
                          } else {
                            bj.field_a[var23] = var27 >> fb.field_r;
                            lj.field_g[var23] = var28 >> fb.field_r;
                            ej.field_s[var23] = var29;
                            break L9;
                          }
                        }
                        var23++;
                        if (var31 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  L10: {
                    L11: {
                      if (param4.field_i == null) {
                        break L11;
                      } else {
                        if (null == param4.field_j) {
                          break L11;
                        } else {
                          if (null == param4.field_f) {
                            break L11;
                          } else {
                            if (null == param4.field_E) {
                              break L11;
                            } else {
                              if (param4.field_h == null) {
                                break L11;
                              } else {
                                if (null == param4.field_C) {
                                  break L11;
                                } else {
                                  if (param4.field_n == null) {
                                    break L11;
                                  } else {
                                    if (param4.field_g == null) {
                                      break L11;
                                    } else {
                                      if (null != param4.field_r) {
                                        var23 = 0;
                                        L12: while (true) {
                                          if (var23 >= param4.field_P) {
                                            break L11;
                                          } else {
                                            var24 = param4.field_i[var23];
                                            var25 = param4.field_j[var23];
                                            var26 = param4.field_f[var23];
                                            ae.field_b[var23] = (var25 * var15 + (var24 * var12 - -(var18 * var26)) >> 16) + var9;
                                            cd.field_b[var23] = (var16 * var25 + var13 * var24 + var26 * var19 >> 16) + var10;
                                            kl.field_c[var23] = var11 - -(var25 * var17 + (var24 * var14 + var20 * var26) >> 16);
                                            var24 = param4.field_E[var23];
                                            var25 = param4.field_h[var23];
                                            var26 = param4.field_C[var23];
                                            ad.field_D[var23] = (var24 * var12 - (-(var15 * var25) - var18 * var26) >> 16) + var9;
                                            hi.field_d[var23] = (var26 * var19 + var13 * var24 + var16 * var25 >> 16) + var10;
                                            StarCannon.field_y[var23] = (var20 * var26 + (var14 * var24 - -(var17 * var25)) >> 16) + var11;
                                            var24 = param4.field_n[var23];
                                            var25 = param4.field_g[var23];
                                            var26 = param4.field_r[var23];
                                            pd.field_d[var23] = (var18 * var26 + var25 * var15 + var12 * var24 >> 16) + var9;
                                            ob.field_c[var23] = var10 - -(var25 * var16 + (var13 * var24 + var19 * var26) >> 16);
                                            ih.field_g[var23] = var11 - -(var26 * var20 + (var14 * var24 + var17 * var25) >> 16);
                                            var23++;
                                            if (var31 != 0) {
                                              break L10;
                                            } else {
                                              if (var31 == 0) {
                                                continue L12;
                                              } else {
                                                break L11;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    if (param6) {
                      var9 = param3[3];
                      var10 = param3[4];
                      var11 = param3[5];
                      var12 = param3[6];
                      var13 = param3[7];
                      var14 = param3[8];
                      var15 = param3[9];
                      var16 = param3[10];
                      var17 = param3[11];
                      break L10;
                    } else {
                      break L3;
                    }
                  }
                  var18 = 0;
                  L13: while (true) {
                    stackOut_59_0 = ~param4.field_s;
                    stackOut_59_1 = ~var18;
                    stackIn_60_0 = stackOut_59_0;
                    stackIn_60_1 = stackOut_59_1;
                    if (stackIn_60_0 >= stackIn_60_1) {
                      break L3;
                    } else {
                      stackOut_61_0 = var18;
                      stackOut_61_1 = rc.field_a.length;
                      stackIn_69_0 = stackOut_61_0;
                      stackIn_69_1 = stackOut_61_1;
                      stackIn_62_0 = stackOut_61_0;
                      stackIn_62_1 = stackOut_61_1;
                      if (var31 != 0) {
                        break L2;
                      } else {
                        stackOut_62_0 = stackIn_62_0;
                        stackOut_62_1 = stackIn_62_1;
                        stackIn_64_0 = stackOut_62_0;
                        stackIn_64_1 = stackOut_62_1;
                        if (stackIn_64_0 >= stackIn_64_1) {
                          break L3;
                        } else {
                          var19 = param4.field_N[var18];
                          var20 = param4.field_a[var18];
                          var21 = param4.field_o[var18];
                          rc.field_a[var18] = var21 * var15 + var20 * var12 + var9 * var19 >> 16;
                          fb.field_m[var18] = var20 * var13 + (var10 * var19 + var21 * var16) >> 16;
                          p.field_f[var18] = var17 * var21 + var19 * var11 + var20 * var14 >> 16;
                          var18++;
                          if (var31 == 0) {
                            continue L13;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_68_0 = var7_int;
                stackOut_68_1 = param1;
                stackIn_69_0 = stackOut_68_0;
                stackIn_69_1 = stackOut_68_1 ? 1 : 0;
                break L2;
              }
              vh.a(stackIn_69_0, stackIn_69_1 != 0, param4, -6787, var8);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var7 = decompiledCaughtException;
            stackOut_71_0 = (RuntimeException) var7;
            stackOut_71_1 = new StringBuilder().append("sh.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_74_0 = stackOut_71_0;
            stackIn_74_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param3 == null) {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L14;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_75_0 = stackOut_72_0;
              stackIn_75_1 = stackOut_72_1;
              stackIn_75_2 = stackOut_72_2;
              break L14;
            }
          }
          L15: {
            stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
            stackOut_75_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_75_2).append(',');
            stackIn_78_0 = stackOut_75_0;
            stackIn_78_1 = stackOut_75_1;
            stackIn_76_0 = stackOut_75_0;
            stackIn_76_1 = stackOut_75_1;
            if (param4 == null) {
              stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "null";
              stackIn_79_0 = stackOut_78_0;
              stackIn_79_1 = stackOut_78_1;
              stackIn_79_2 = stackOut_78_2;
              break L15;
            } else {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "{...}";
              stackIn_79_0 = stackOut_76_0;
              stackIn_79_1 = stackOut_76_1;
              stackIn_79_2 = stackOut_76_2;
              break L15;
            }
          }
          L16: {
            stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
            stackOut_79_1 = ((StringBuilder) (Object) stackIn_79_1).append(stackIn_79_2).append(',');
            stackIn_82_0 = stackOut_79_0;
            stackIn_82_1 = stackOut_79_1;
            stackIn_80_0 = stackOut_79_0;
            stackIn_80_1 = stackOut_79_1;
            if (param5 == null) {
              stackOut_82_0 = (RuntimeException) (Object) stackIn_82_0;
              stackOut_82_1 = (StringBuilder) (Object) stackIn_82_1;
              stackOut_82_2 = "null";
              stackIn_83_0 = stackOut_82_0;
              stackIn_83_1 = stackOut_82_1;
              stackIn_83_2 = stackOut_82_2;
              break L16;
            } else {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "{...}";
              stackIn_83_0 = stackOut_80_0;
              stackIn_83_1 = stackOut_80_1;
              stackIn_83_2 = stackOut_80_2;
              break L16;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_83_0, stackIn_83_2 + ',' + param6 + ')');
        }
    }

    final String a(uj param0, boolean param1) {
        RuntimeException var3 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                sh.b(-96);
                break L1;
              }
            }
            stackOut_3_0 = uh.a(param0.field_k.length(), 0, '*');
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("sh.R(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final static int b(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        try {
          L0: {
            var2_int = -20 / ((param0 - -78) / 48);
            stackOut_0_0 = eh.a(2, nc.field_c, param1);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "sh.AA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "to return to the normal view.";
    }
}
