/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

final class vl extends tm {
    static boolean[] field_p;
    static String field_o;
    static String field_r;
    static volatile boolean field_q;
    static kn field_m;
    private static int[][] field_n;
    static qb[] field_l;
    static String field_s;

    final static void a(int param0, int param1, dd[] param2, int param3, dd[] param4, int param5, int param6, lr param7, int param8, int param9, dd[] param10) {
        RuntimeException var15 = null;
        int var15_int = 0;
        int var16 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            var15_int = param7.field_w + param7.field_L;
            var16 = param7.field_L;
            eh.a(4, var16, param4, param7, param1, param10, 320, 8, 19539, 240, param2, var16, 3, param7, 8, param8, 2, 2, var15_int, var15_int);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var15 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var15;
            stackOut_4_1 = new StringBuilder().append("vl.I(").append(240).append(44).append(param1).append(44);
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(8).append(44);
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param4 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44).append(4).append(44).append(8).append(44);
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param7 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L3;
            }
          }
          L4: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44).append(param8).append(44).append(2).append(44);
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param10 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L4;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + -1373633266 + 44 + 2 + 44 + 3 + 44 + 320 + 41);
        }
    }

    final void a(int param0, di param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              sa.field_q = pf.a("", (byte) 101, "grad_ball_purple", param1).field_D;
              om.field_r = pf.a("", (byte) 113, "grad_ball_blue", param1).field_D;
              cr.field_p = pf.a("", (byte) 126, "grad_ball_red", param1).field_D;
              ae.field_e = pf.a("", (byte) 86, "grad_ball_white", param1).field_D;
              bc.field_c = pf.a("", (byte) 68, "grad_lightning_purple", param1).field_D;
              if (param0 == 198123656) {
                break L1;
              } else {
                field_p = null;
                break L1;
              }
            }
            dq.field_i = pf.a("", (byte) 46, "grad_lightning_blue", param1).field_D;
            v.field_a = pf.a("", (byte) 53, "grad_lightning_red", param1).field_D;
            jc.field_i = pf.a("", (byte) 37, "grad_lightning_white", param1).field_D;
            ((vl) this).field_e = aj.a(0, "", param1, "top_bar_balls_plasma");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("vl.D(").append(param0).append(44);
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
          throw wm.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    final void a(boolean param0, int[] param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                ((vl) this).a((int[]) null, (int[]) null, 93, 33);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("vl.O(").append(param0).append(44);
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param2 + 41);
        }
    }

    final static void a(int param0, int param1, boolean param2, boolean param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Pool.field_O;
        try {
          L0: {
            if (param1 == -21972) {
              if (de.field_g) {
                return;
              } else {
                L1: {
                  L2: {
                    if (param0 == -1) {
                      break L2;
                    } else {
                      L3: {
                        if (param0 != -2) {
                          break L3;
                        } else {
                          qh.b(0, 0, qh.field_l, qh.field_f, 0);
                          if (var5 == 0) {
                            break L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L4: {
                        L5: {
                          if (param3) {
                            break L5;
                          } else {
                            L6: {
                              if (param0 < 0) {
                                break L6;
                              } else {
                                s.field_c[param0].b(0);
                                if (var5 == 0) {
                                  break L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            qh.b(0, 0, qh.field_l, qh.field_f, 0);
                            if (var5 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        L7: {
                          om.a(-96, false);
                          if (param0 >= 0) {
                            break L7;
                          } else {
                            qh.g(0, 0, qh.field_l, qh.field_f);
                            if (var5 == 0) {
                              break L4;
                            } else {
                              break L7;
                            }
                          }
                        }
                        s.field_c[param0].b((byte) 108);
                        break L4;
                      }
                      s.field_c[param0].c(param1 ^ -21891);
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  om.a(93, param2);
                  break L1;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var4, "vl.H(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static ie a(int param0, String param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ie stackIn_5_0 = null;
        ie stackIn_10_0 = null;
        ie stackIn_16_0 = null;
        int stackIn_26_0 = 0;
        ie stackIn_36_0 = null;
        Object stackIn_40_0 = null;
        Object stackIn_43_0 = null;
        ie stackIn_57_0 = null;
        ie stackIn_63_0 = null;
        Object stackIn_67_0 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        RuntimeException decompiledCaughtException = null;
        ie stackOut_4_0 = null;
        ie stackOut_9_0 = null;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        ie stackOut_35_0 = null;
        Object stackOut_39_0 = null;
        ie stackOut_15_0 = null;
        ie stackOut_56_0 = null;
        ie stackOut_62_0 = null;
        Object stackOut_66_0 = null;
        Object stackOut_42_0 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        var6 = Pool.field_O;
        try {
          L0: {
            var2_int = param1.length();
            if (var2_int == 0) {
              stackOut_4_0 = uj.field_e;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              if (64 < var2_int) {
                stackOut_9_0 = la.field_h;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0;
              } else {
                if (param1.charAt(0) == 34) {
                  if (param1.charAt(-1 + var2_int) == 34) {
                    var3 = 0;
                    var4 = 1;
                    L1: while (true) {
                      L2: {
                        if (-1 + var2_int <= var4) {
                          break L2;
                        } else {
                          L3: {
                            L4: {
                              var5 = param1.charAt(var4);
                              if (92 != var5) {
                                break L4;
                              } else {
                                L5: {
                                  if (var3 != 0) {
                                    stackOut_25_0 = 0;
                                    stackIn_26_0 = stackOut_25_0;
                                    break L5;
                                  } else {
                                    stackOut_23_0 = 1;
                                    stackIn_26_0 = stackOut_23_0;
                                    break L5;
                                  }
                                }
                                var3 = stackIn_26_0;
                                if (var6 == 0) {
                                  break L3;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            L6: {
                              if (var5 != 34) {
                                break L6;
                              } else {
                                if (var3 == 0) {
                                  stackOut_35_0 = pj.field_K;
                                  stackIn_36_0 = stackOut_35_0;
                                  return stackIn_36_0;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            var3 = 0;
                            break L3;
                          }
                          var4++;
                          if (var6 == 0) {
                            continue L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                      stackOut_39_0 = null;
                      stackIn_40_0 = stackOut_39_0;
                      return (ie) (Object) stackIn_40_0;
                    }
                  } else {
                    stackOut_15_0 = pj.field_K;
                    stackIn_16_0 = stackOut_15_0;
                    return stackIn_16_0;
                  }
                } else {
                  if (param0 == 7) {
                    var3 = 0;
                    var4 = 0;
                    L7: while (true) {
                      L8: {
                        if (var4 >= var2_int) {
                          break L8;
                        } else {
                          L9: {
                            L10: {
                              var5 = param1.charAt(var4);
                              if (var5 != 46) {
                                break L10;
                              } else {
                                L11: {
                                  if (0 == var4) {
                                    break L11;
                                  } else {
                                    if (var2_int - 1 == var4) {
                                      break L11;
                                    } else {
                                      if (var3 == 0) {
                                        var3 = 1;
                                        if (var6 == 0) {
                                          break L9;
                                        } else {
                                          break L10;
                                        }
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                }
                                stackOut_56_0 = pj.field_K;
                                stackIn_57_0 = stackOut_56_0;
                                return stackIn_57_0;
                              }
                            }
                            if (dj.field_b.indexOf(var5) != -1) {
                              var3 = 0;
                              break L9;
                            } else {
                              stackOut_62_0 = pj.field_K;
                              stackIn_63_0 = stackOut_62_0;
                              return stackIn_63_0;
                            }
                          }
                          var4++;
                          if (var6 == 0) {
                            continue L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                      stackOut_66_0 = null;
                      stackIn_67_0 = stackOut_66_0;
                      break L0;
                    }
                  } else {
                    stackOut_42_0 = null;
                    stackIn_43_0 = stackOut_42_0;
                    return (ie) (Object) stackIn_43_0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var2 = decompiledCaughtException;
            stackOut_68_0 = (RuntimeException) var2;
            stackOut_68_1 = new StringBuilder().append("vl.EA(").append(param0).append(44);
            stackIn_71_0 = stackOut_68_0;
            stackIn_71_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param1 == null) {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L12;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_72_0 = stackOut_69_0;
              stackIn_72_1 = stackOut_69_1;
              stackIn_72_2 = stackOut_69_2;
              break L12;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_72_0, stackIn_72_2 + 41);
        }
        return (ie) (Object) stackIn_67_0;
    }

    private final void a(int[] param0, int[] param1, int param2, byte param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
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
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        int[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var27 = Pool.field_O;
        try {
          L0: {
            var18 = param0[3] >> 2;
            var19 = param0[4] >> 2;
            var20 = param0[5] >> 2;
            var21 = param0[6] >> 2;
            var22 = param0[7] >> 2;
            var23 = param0[8] >> 2;
            var24 = param0[9] >> 2;
            var25 = param0[10] >> 2;
            if (param3 < -37) {
              var26 = param0[11] >> 2;
              var9 = param1[5] * var20 + param1[4] * var19 + param1[3] * var18 >> 14;
              var10 = param1[3] * var21 - -(param1[4] * var22) - -(param1[5] * var23) >> 14;
              var13 = param1[6] * var21 - -(var22 * param1[7]) + param1[8] * var23 >> 14;
              var17 = var26 * param1[11] + param1[10] * var25 + var24 * param1[9] >> 14;
              var15 = param1[11] * var20 + param1[9] * var18 - -(var19 * param1[10]) >> 14;
              var12 = var18 * param1[6] + var19 * param1[7] - -(param1[8] * var20) >> 14;
              var11 = param1[5] * var26 + param1[4] * var25 + var24 * param1[3] >> 14;
              var14 = var26 * param1[8] + param1[7] * var25 + var24 * param1[6] >> 14;
              var16 = var22 * param1[10] + param1[9] * var21 + param1[11] * var23 >> 14;
              var18 = param1[0] + -param0[0];
              var19 = -param0[1] + param1[1];
              var20 = -param0[2] + param1[2];
              var7 = var19 * param0[7] + (var18 * param0[6] - -(param0[8] * var20)) >> 16;
              var8 = param0[10] * var19 + (var18 * param0[9] - -(param0[11] * var20)) >> 16;
              var6_int = var20 * param0[5] + (var18 * param0[3] + var19 * param0[4]) >> 16;
              var18 = 0;
              var19 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    L4: {
                      if (~var19 <= ~hj.field_d[param2].length) {
                        break L4;
                      } else {
                        var20 = 2 + (128 * var19 / hj.field_d[param2].length + -64);
                        kp.field_i[param2][var19] = var20 * var15 + var12 * tj.field_ab[param2][var19] + hj.field_d[param2][var19] * var9 >> 16;
                        field_n[param2][var19] = var13 * tj.field_ab[param2][var19] + (var10 * hj.field_d[param2][var19] + var16 * var20) >> 16;
                        var20 = var14 * tj.field_ab[param2][var19] + hj.field_d[param2][var19] * var11 + var20 * var17 >> 16;
                        kp.field_i[param2][var19] = kp.field_i[param2][var19] + var6_int;
                        field_n[param2][var19] = field_n[param2][var19] + var7;
                        var20 = var20 + var8;
                        stackOut_5_0 = 0;
                        stackOut_5_1 = var20;
                        stackIn_27_0 = stackOut_5_0;
                        stackIn_27_1 = stackOut_5_1;
                        stackIn_6_0 = stackOut_5_0;
                        stackIn_6_1 = stackOut_5_1;
                        if (var27 != 0) {
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              if (stackIn_6_0 >= stackIn_6_1) {
                                break L6;
                              } else {
                                L7: {
                                  L8: {
                                    kp.field_i[param2][var19] = (qh.field_b - -fb.field_q << 2) - -((kp.field_i[param2][var19] << 11) / var20);
                                    field_n[param2][var19] = (qh.field_c - -fb.field_d << 2) + (field_n[param2][var19] << 11) / var20;
                                    stackOut_9_0 = jr.field_o[param2];
                                    stackOut_9_1 = var19;
                                    stackIn_15_0 = stackOut_9_0;
                                    stackIn_15_1 = stackOut_9_1;
                                    stackIn_10_0 = stackOut_9_0;
                                    stackIn_10_1 = stackOut_9_1;
                                    if (0 == var19) {
                                      break L8;
                                    } else {
                                      stackOut_10_0 = (int[]) (Object) stackIn_10_0;
                                      stackOut_10_1 = stackIn_10_1;
                                      stackIn_12_0 = stackOut_10_0;
                                      stackIn_12_1 = stackOut_10_1;
                                      stackOut_12_0 = (int[]) (Object) stackIn_12_0;
                                      stackOut_12_1 = stackIn_12_1;
                                      stackIn_17_0 = stackOut_12_0;
                                      stackIn_17_1 = stackOut_12_1;
                                      stackIn_13_0 = stackOut_12_0;
                                      stackIn_13_1 = stackOut_12_1;
                                      if (var18 == 0) {
                                        stackOut_17_0 = (int[]) (Object) stackIn_17_0;
                                        stackOut_17_1 = stackIn_17_1;
                                        stackOut_17_2 = (int)(((long)ie.field_a[param2][var19] << 10) / (long)var20);
                                        stackIn_18_0 = stackOut_17_0;
                                        stackIn_18_1 = stackOut_17_1;
                                        stackIn_18_2 = stackOut_17_2;
                                        break L7;
                                      } else {
                                        stackOut_13_0 = (int[]) (Object) stackIn_13_0;
                                        stackOut_13_1 = stackIn_13_1;
                                        stackIn_15_0 = stackOut_13_0;
                                        stackIn_15_1 = stackOut_13_1;
                                        break L8;
                                      }
                                    }
                                  }
                                  stackOut_15_0 = (int[]) (Object) stackIn_15_0;
                                  stackOut_15_1 = stackIn_15_1;
                                  stackOut_15_2 = 0;
                                  stackIn_18_0 = stackOut_15_0;
                                  stackIn_18_1 = stackOut_15_1;
                                  stackIn_18_2 = stackOut_15_2;
                                  break L7;
                                }
                                stackIn_18_0[stackIn_18_1] = stackIn_18_2;
                                if (var27 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            var18 = 1;
                            if (var27 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                          var19++;
                          if (var27 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    if (var18 == 0) {
                      stackOut_26_0 = 0;
                      stackOut_26_1 = 0;
                      stackIn_27_0 = stackOut_26_0;
                      stackIn_27_1 = stackOut_26_1;
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                  wn.a((byte) stackIn_27_0, (byte) stackIn_27_1, s.a(param2, 115), field_n[param2], 32512 + -(param4 * 127) >> 8, 0, kp.field_i[param2], jr.field_o[param2]);
                  break L2;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var6;
            stackOut_29_1 = new StringBuilder().append("vl.J(");
            stackIn_32_0 = stackOut_29_0;
            stackIn_32_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L9;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_33_0 = stackOut_30_0;
              stackIn_33_1 = stackOut_30_1;
              stackIn_33_2 = stackOut_30_2;
              break L9;
            }
          }
          L10: {
            stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
            stackOut_33_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(44);
            stackIn_36_0 = stackOut_33_0;
            stackIn_36_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param1 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L10;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_37_0 = stackOut_34_0;
              stackIn_37_1 = stackOut_34_1;
              stackIn_37_2 = stackOut_34_2;
              break L10;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final void h(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Pool.field_O;
        try {
          L0: {
            var3 = -74 / ((29 - param0) / 44);
            var4 = hj.field_d[0].length;
            var5 = 0;
            L1: while (true) {
              if (hj.field_d.length <= var5) {
                var5 = 1;
                L2: while (true) {
                  if (~(var4 + -1) >= ~var5) {
                    break L0;
                  } else {
                    var2_int = var5 - var4 / 2;
                    var6 = rf.a(65536 - (var2_int * var2_int << 16) / (var4 * var4 / 4), -120) * 8 >> 13 >> 1;
                    var7 = 0;
                    L3: while (true) {
                      if (var7 >= hj.field_d.length) {
                        var5++;
                        continue L2;
                      } else {
                        L4: {
                          if (var6 > 0) {
                            L5: {
                              hj.field_d[var7][var5] = hj.field_d[var7][var5] + hj.field_d[var7][-1 + var5] >> 1;
                              tj.field_ab[var7][var5] = tj.field_ab[var7][var5] + tj.field_ab[var7][var5 - 1] >> 1;
                              hj.field_d[var7][var5] = hj.field_d[var7][var5] + (ga.a(5, true, ea.field_r) + -2);
                              tj.field_ab[var7][var5] = tj.field_ab[var7][var5] + (ga.a(5, true, ea.field_r) - 2);
                              if (var6 >= hj.field_d[var7][var5]) {
                                if (-var6 <= hj.field_d[var7][var5]) {
                                  break L5;
                                } else {
                                  hj.field_d[var7][var5] = -var6;
                                  break L5;
                                }
                              } else {
                                hj.field_d[var7][var5] = var6;
                                break L5;
                              }
                            }
                            if (tj.field_ab[var7][var5] <= var6) {
                              if (tj.field_ab[var7][var5] < -var6) {
                                tj.field_ab[var7][var5] = -var6;
                                break L4;
                              } else {
                                break L4;
                              }
                            } else {
                              tj.field_ab[var7][var5] = var6;
                              break L4;
                            }
                          } else {
                            break L4;
                          }
                        }
                        var7++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                L6: {
                  ie.field_a[var5][1] = ie.field_a[var5][1] + (-3 + ga.a(5, true, ea.field_r));
                  ie.field_a[var5][hj.field_d[var5].length - 1] = 0;
                  if (48 >= ie.field_a[var5][1]) {
                    if (ie.field_a[var5][1] < 16) {
                      ie.field_a[var5][1] = 16;
                      break L6;
                    } else {
                      break L6;
                    }
                  } else {
                    ie.field_a[var5][1] = 48;
                    break L6;
                  }
                }
                var6 = var4 - 2;
                L7: while (true) {
                  if (1 >= var6) {
                    var5++;
                    continue L1;
                  } else {
                    ie.field_a[var5][var6] = ie.field_a[var5][-1 + var6];
                    var6--;
                    continue L7;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "vl.CA(" + param0 + 41);
        }
    }

    public static void i() {
        try {
            field_o = null;
            int var1_int = 0;
            field_n = null;
            field_r = null;
            field_p = null;
            field_l = null;
            field_s = null;
            field_m = null;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "vl.E(" + 120 + 41);
        }
    }

    final void a(int param0, al param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var5 = Pool.field_O;
        try {
          L0: {
            hj.field_d = new int[param1.field_l.length][12];
            tj.field_ab = new int[param1.field_l.length][12];
            ie.field_a = new int[param1.field_l.length][12];
            kp.field_i = new int[hj.field_d.length][hj.field_d[0].length];
            field_n = new int[hj.field_d.length][hj.field_d[0].length];
            jr.field_o = new int[hj.field_d.length][hj.field_d[0].length];
            var3_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (hj.field_d.length <= var3_int) {
                    break L3;
                  } else {
                    stackOut_3_0 = 0;
                    stackIn_13_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      var4 = stackIn_4_0;
                      L4: while (true) {
                        L5: {
                          L6: {
                            if (~var4 <= ~hj.field_d[var3_int].length) {
                              break L6;
                            } else {
                              hj.field_d[var3_int][var4] = 0;
                              tj.field_ab[var3_int][var4] = 0;
                              ie.field_a[var3_int][var4] = 16;
                              var4++;
                              if (var5 != 0) {
                                break L5;
                              } else {
                                if (var5 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          ie.field_a[var3_int][0] = 0;
                          ie.field_a[var3_int][-1 + ie.field_a[var3_int].length] = 0;
                          var3_int++;
                          break L5;
                        }
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackOut_12_0 = param0;
                stackIn_13_0 = stackOut_12_0;
                break L2;
              }
              L7: {
                if (stackIn_13_0 == 2147483647) {
                  break L7;
                } else {
                  ie discarded$1 = vl.a(106, (String) null);
                  break L7;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3;
            stackOut_17_1 = new StringBuilder().append("vl.AA(").append(param0).append(44);
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L8;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L8;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
    }

    final String a(int param0, byte param1) {
        RuntimeException var3 = null;
        String stackIn_7_0 = null;
        String stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        String stackOut_11_0 = null;
        try {
          L0: {
            if (param1 >= 108) {
              break L0;
            } else {
              ie discarded$2 = vl.a(7, (String) null);
              break L0;
            }
          }
          if (param0 == 0) {
            stackOut_6_0 = pn.field_t;
            stackIn_7_0 = stackOut_6_0;
            return stackIn_7_0;
          } else {
            if (param0 == 1) {
              stackOut_11_0 = oe.field_S;
              stackIn_12_0 = stackOut_11_0;
              return stackIn_12_0;
            } else {
              throw new IllegalStateException("Invalid group number");
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var3, "vl.W(" + param0 + 44 + param1 + 41);
        }
    }

    private final void a(int param0, byte param1, int param2, int[] param3, int[] param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        long var7 = 0L;
        long var9 = 0L;
        long var11 = 0L;
        long var13 = 0L;
        long var15 = 0L;
        long var17 = 0L;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            var6_int = -100 / ((47 - param1) / 45);
            var7 = (long)(-param3[0] + param4[0]);
            var9 = (long)(-param3[1] + param4[1]);
            var11 = (long)(-param3[2] + param4[2]);
            var13 = (long)param3[9] * var7 + ((long)param3[10] * var9 - -((long)param3[11] * var11));
            if (var13 <= 0L) {
              return;
            } else {
              L1: {
                var15 = (long)param3[4] * var9 + (long)param3[3] * var7 - -((long)param3[5] * var11);
                var17 = var9 * (long)param3[7] + (var7 * (long)param3[6] + var11 * (long)param3[8]);
                var15 = (var15 << 13) / var13 + (long)(qh.field_b + fb.field_q << 4);
                var17 = (var17 << 13) / var13 + (long)(qh.field_c - -fb.field_d << 4);
                qh.a((int)(var15 >> 4), (int)(var17 >> 4), -2 + ((int)(2147483648L / var13) * (256 + -param0) >> 8), 0, 224);
                if (2147483647L > 127L * (34359738368L / var13) * (34359738368L / var13)) {
                  qh.a((int)var15, (int)var17, (int)(34359738368L / var13) * (256 - param0) >> 8, 127, dg.a(-9, param2));
                  break L1;
                } else {
                  break L1;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var6;
            stackOut_9_1 = new StringBuilder().append("vl.FA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
    }

    final static void a(boolean param0, int param1, boolean param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (fc.field_b == null) {
                break L1;
              } else {
                var3_int = fc.field_b.a(param2, -27403);
                if (var3_int == -2) {
                  break L1;
                } else {
                  L2: {
                    if (var3_int == -1) {
                      break L2;
                    } else {
                      var4 = fc.field_b.g(-10459) ? 1 : 0;
                      int discarded$2 = -121;
                      lc.a(var4 != 0, fc.field_b.h(1), var3_int, 14, fc.field_b.field_Lb);
                      break L2;
                    }
                  }
                  fc.field_b = null;
                  int discarded$3 = 8421504;
                  wa.m();
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var3, "vl.F(" + 1 + 44 + 14 + 44 + param2 + 41);
        }
    }

    vl() {
    }

    final int a(int param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int stackIn_84_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_95_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_87_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_83_0 = 0;
        var4 = Pool.field_O;
        try {
          L0: {
            L1: {
              var3_int = param0;
              if (0 == var3_int) {
                break L1;
              } else {
                L2: {
                  L3: {
                    if (1 != var3_int) {
                      break L3;
                    } else {
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (var3_int == 2) {
                    break L2;
                  } else {
                    L4: {
                      if (var3_int != 3) {
                        break L4;
                      } else {
                        if (var4 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (var3_int != 4) {
                        break L5;
                      } else {
                        if (var4 == 0) {
                          break L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (var3_int == 5) {
                      break L2;
                    } else {
                      L6: {
                        if (var3_int != 6) {
                          break L6;
                        } else {
                          if (var4 == 0) {
                            break L2;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if (var3_int != 7) {
                          break L7;
                        } else {
                          if (var4 == 0) {
                            break L2;
                          } else {
                            break L7;
                          }
                        }
                      }
                      L8: {
                        if (8 != var3_int) {
                          break L8;
                        } else {
                          if (var4 == 0) {
                            stackOut_87_0 = 3355443;
                            stackIn_88_0 = stackOut_87_0;
                            return stackIn_88_0;
                          } else {
                            break L8;
                          }
                        }
                      }
                      L9: {
                        L10: {
                          if (var3_int != 9) {
                            break L10;
                          } else {
                            if (var4 == 0) {
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        L11: {
                          if (var3_int != 10) {
                            break L11;
                          } else {
                            if (var4 == 0) {
                              break L9;
                            } else {
                              break L11;
                            }
                          }
                        }
                        L12: {
                          if (var3_int != 11) {
                            break L12;
                          } else {
                            if (var4 == 0) {
                              break L9;
                            } else {
                              break L12;
                            }
                          }
                        }
                        if (var3_int == 12) {
                          break L9;
                        } else {
                          L13: {
                            if (13 != var3_int) {
                              break L13;
                            } else {
                              if (var4 == 0) {
                                break L9;
                              } else {
                                break L13;
                              }
                            }
                          }
                          L14: {
                            if (var3_int != 14) {
                              break L14;
                            } else {
                              if (var4 == 0) {
                                break L9;
                              } else {
                                break L14;
                              }
                            }
                          }
                          if (15 != var3_int) {
                            L15: {
                              if (param1) {
                                break L15;
                              } else {
                                field_r = null;
                                break L15;
                              }
                            }
                            stackOut_94_0 = 16711935;
                            stackIn_95_0 = stackOut_94_0;
                            break L0;
                          } else {
                            if (var4 == 0) {
                              break L9;
                            } else {
                              break L1;
                            }
                          }
                        }
                      }
                      stackOut_89_0 = 255;
                      stackIn_90_0 = stackOut_89_0;
                      return stackIn_90_0;
                    }
                  }
                }
                stackOut_85_0 = 16711680;
                stackIn_86_0 = stackOut_85_0;
                return stackIn_86_0;
              }
            }
            stackOut_83_0 = 16777215;
            stackIn_84_0 = stackOut_83_0;
            return stackIn_84_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var3, "vl.A(" + param0 + 44 + param1 + 41);
        }
        return stackIn_95_0;
    }

    final void a(int[] param0, int[] param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var6 = Pool.field_O;
        try {
          L0: {
            if (param3 == -3637) {
              L1: {
                L2: {
                  if (16384 < param0[2]) {
                    break L2;
                  } else {
                    var5_int = 0;
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (32768 <= param0[2]) {
                    break L3;
                  } else {
                    var5_int = (param0[2] * 256 - 4194304) / 16384;
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
                var5_int = 256;
                break L1;
              }
              this.a(var5_int, (byte) 106, param2, param1, param0);
              this.a(param1, param0, param2, (byte) -56, var5_int);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) runtimeException;
            stackOut_12_1 = new StringBuilder().append("vl.DA(");
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L5;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static boolean j() {
        long var1_long = 0L;
        RuntimeException var1 = null;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_21_0 = 0;
        var6 = Pool.field_O;
        try {
          L0: {
            var1_long = rl.a((byte) -101);
            L1: {
              var3 = var1_long - db.field_Pb;
              if (var3 > 30000L) {
                break L1;
              } else {
                L2: {
                  L3: {
                    var5 = 3000;
                    if (7 > up.field_j) {
                      break L3;
                    } else {
                      var5 = 12000;
                      if (var6 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (5 <= up.field_j) {
                      break L4;
                    } else {
                      if (up.field_j < 3) {
                        break L2;
                      } else {
                        var5 = 6000;
                        if (var6 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  var5 = 9000;
                  break L2;
                }
                if (var3 > (long)var5) {
                  db.field_Pb = var1_long;
                  up.field_j = up.field_j + 1;
                  stackOut_18_0 = 1;
                  stackIn_19_0 = stackOut_18_0;
                  return stackIn_19_0 != 0;
                } else {
                  if (var6 == 0) {
                    stackOut_23_0 = 0;
                    stackIn_24_0 = stackOut_23_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            up.field_j = 0;
            db.field_Pb = var1_long;
            stackOut_21_0 = 1;
            stackIn_22_0 = stackOut_21_0;
            return stackIn_22_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1, "vl.GA(" + 12000 + 41);
        }
        return stackIn_24_0 != 0;
    }

    final int b(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 384) {
                break L1;
              } else {
                this.a((int[]) null, (int[]) null, 41, (byte) 82, 126);
                break L1;
              }
            }
            stackOut_3_0 = hj.field_d.length;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "vl.P(" + param0 + 41);
        }
        return stackIn_4_0;
    }

    final void a(int param0, int param1, int[] param2, int[] param3, boolean param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var7 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (param0 == -1912602369) {
                break L1;
              } else {
                String discarded$2 = ((vl) this).a((byte) -54, -91);
                break L1;
              }
            }
            L2: {
              L3: {
                ((vl) this).a(param4, param2, param1, param3, -20263);
                if (param2[2] <= 16384) {
                  break L3;
                } else {
                  L4: {
                    if (param2[2] < 32768) {
                      break L4;
                    } else {
                      var6_int = 256;
                      if (var7 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var6_int = (param2[2] + -16384) * 256 / 16384;
                  if (var7 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var6_int = 0;
              break L2;
            }
            this.a(var6_int, (byte) -93, param1, param3, param2);
            this.a(param3, param2, param1, (byte) -77, var6_int);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var6;
            stackOut_13_1 = new StringBuilder().append("vl.K(").append(param0).append(44).append(param1).append(44);
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44);
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L6;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param4 + 41);
        }
    }

    final boolean c(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == 2) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "vl.B(" + param0 + 41);
        }
        return stackIn_4_0 != 0;
    }

    final int[] b(int param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int[] stackIn_78_0 = null;
        int[] stackIn_80_0 = null;
        int[] stackIn_82_0 = null;
        int[] stackIn_84_0 = null;
        Object stackIn_86_0 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_81_0 = null;
        Object stackOut_85_0 = null;
        int[] stackOut_83_0 = null;
        int[] stackOut_79_0 = null;
        int[] stackOut_77_0 = null;
        var4 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                field_s = null;
                break L1;
              }
            }
            L2: {
              L3: {
                var3_int = param0;
                if (var3_int != 0) {
                  break L3;
                } else {
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (1 == var3_int) {
                  break L4;
                } else {
                  L5: {
                    if (var3_int != 2) {
                      break L5;
                    } else {
                      if (var4 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if (var3_int == 3) {
                    break L4;
                  } else {
                    L6: {
                      if (var3_int != 4) {
                        break L6;
                      } else {
                        if (var4 == 0) {
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (5 == var3_int) {
                      break L4;
                    } else {
                      if (var3_int == 6) {
                        break L4;
                      } else {
                        L7: {
                          if (var3_int != 7) {
                            break L7;
                          } else {
                            if (var4 == 0) {
                              break L4;
                            } else {
                              break L7;
                            }
                          }
                        }
                        L8: {
                          if (var3_int != 8) {
                            break L8;
                          } else {
                            if (var4 == 0) {
                              stackOut_81_0 = bc.field_c;
                              stackIn_82_0 = stackOut_81_0;
                              return stackIn_82_0;
                            } else {
                              break L8;
                            }
                          }
                        }
                        L9: {
                          if (var3_int == 9) {
                            break L9;
                          } else {
                            L10: {
                              if (var3_int != 10) {
                                break L10;
                              } else {
                                if (var4 == 0) {
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            L11: {
                              if (var3_int != 11) {
                                break L11;
                              } else {
                                if (var4 == 0) {
                                  break L9;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            if (var3_int == 12) {
                              break L9;
                            } else {
                              if (var3_int == 13) {
                                break L9;
                              } else {
                                L12: {
                                  if (14 != var3_int) {
                                    break L12;
                                  } else {
                                    if (var4 == 0) {
                                      break L9;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                                if (var3_int != 15) {
                                  stackOut_85_0 = null;
                                  stackIn_86_0 = stackOut_85_0;
                                  break L0;
                                } else {
                                  if (var4 == 0) {
                                    break L9;
                                  } else {
                                    break L2;
                                  }
                                }
                              }
                            }
                          }
                        }
                        stackOut_83_0 = dq.field_i;
                        stackIn_84_0 = stackOut_83_0;
                        return stackIn_84_0;
                      }
                    }
                  }
                }
              }
              stackOut_79_0 = v.field_a;
              stackIn_80_0 = stackOut_79_0;
              return stackIn_80_0;
            }
            stackOut_77_0 = jc.field_i;
            stackIn_78_0 = stackOut_77_0;
            return stackIn_78_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var3, "vl.T(" + param0 + 44 + param1 + 41);
        }
        return (int[]) (Object) stackIn_86_0;
    }

    final String a(byte param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        String stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_11_0 = null;
        Object stackOut_6_0 = null;
        try {
          if (param1 == 0) {
            stackOut_3_0 = kk.field_G;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          } else {
            if (param0 > 9) {
              if (1 == param1) {
                stackOut_11_0 = hi.field_j;
                stackIn_12_0 = stackOut_11_0;
                return stackIn_12_0;
              } else {
                throw new IllegalStateException("Invalid group number");
              }
            } else {
              stackOut_6_0 = null;
              stackIn_7_0 = stackOut_6_0;
              return (String) (Object) stackIn_7_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var3, "vl.G(" + param0 + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "<%0>: ";
        field_q = true;
        field_o = "You have withdrawn your request to join.";
        field_s = "All games";
    }
}
