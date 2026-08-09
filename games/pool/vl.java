/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vl extends tm {
    static boolean[] field_p;
    static String field_o;
    static String field_r;
    static volatile boolean field_q;
    static kn field_m;
    private static int[][] field_n;
    static qb[] field_l;
    static String field_s;

    final static void a(int param0, int param1, dd[] param2, int param3, dd[] param4, int param5, int param6, lr param7, int param8, int param9, dd[] param10, int param11, int param12, int param13, int param14) {
        RuntimeException runtimeException = null;
        int var15_int = 0;
        int var16 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param11 == -1373633266) {
              var15_int = param7.field_w + param7.field_L;
              var16 = param7.field_L;
              eh.a(param5, var16, param4, param7, param1, param10, param14, param6, 19539, param0, param2, var16, param13, param7, param3, param8, param12, param9, var15_int, var15_int);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (runtimeException);

            stackIn_7_1 = new StringBuilder().append("vl.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param8).append(',').append(param9).append(',');

            if (param10 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), stackIn_20_2 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, di param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
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
                field_p = (boolean[]) null;
                break L1;
              }
            }
            dq.field_i = pf.a("", (byte) 46, "grad_lightning_blue", param1).field_D;
            v.field_a = pf.a("", (byte) 53, "grad_lightning_red", param1).field_D;
            jc.field_i = pf.a("", (byte) 37, "grad_lightning_white", param1).field_D;
            this.field_e = aj.a(0, "", param1, "top_bar_balls_plasma");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("vl.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final void a(boolean param0, int[] param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                this.a((int[]) null, (int[]) null, 93, 33);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("vl.O(").append(param0).append(',');

            if (param1 == null) {
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
          throw wm.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1, boolean param2, boolean param3) {
        int var5 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Pool.field_O;
        try {
          L0: {
            if (param1 == -21972) {
              if (de.field_g) {
                decompiledRegionSelector0 = 1;
                break L0;
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
                              if (-1 < (param0 ^ -1)) {
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
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var4), "vl.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static ie a(int param0, String param1) {
        ie stackIn_5_0 = null;
        ie stackIn_10_0 = null;
        ie stackIn_16_0 = null;
        int stackIn_26_0 = 0;
        ie stackIn_36_0 = null;
        Object stackIn_40_0 = null;
        ie stackIn_43_0 = null;
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
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = Pool.field_O;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = param1.length();
                        if (-1 == (var2_int ^ -1)) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_5_0 = uj.field_e;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0;
                }
                case 6: {
                    try {
                        if (64 < var2_int) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_10_0 = la.field_h;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return stackIn_10_0;
                }
                case 11: {
                    try {
                        if ((param1.charAt(0) ^ -1) == -35) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if ((param1.charAt(-1 + var2_int) ^ -1) == -35) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_16_0 = pj.field_K;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return stackIn_16_0;
                }
                case 17: {
                    try {
                        var3 = 0;
                        var4 = 1;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (-1 + var2_int <= var4) {
                            statePc = 39;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var5 = param1.charAt(var4);
                        if (92 != var5) {
                            statePc = 27;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var3 != 0) {
                            statePc = 25;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackIn_26_0 = 1;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_26_0 = 0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var3 = stackIn_26_0;
                        if (var6 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var5 != 34) {
                            statePc = 37;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (var3 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackIn_36_0 = pj.field_K;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 36: {
                    return stackIn_36_0;
                }
                case 37: {
                    try {
                        var3 = 0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var4++;
                        if (var6 == 0) {
                            statePc = 18;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackIn_40_0 = null;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 40: {
                    return (ie) ((Object) stackIn_40_0);
                }
                case 41: {
                    try {
                        if (param0 == 7) {
                            statePc = 44;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackIn_43_0 = (ie) null;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 43: {
                    return stackIn_43_0;
                }
                case 44: {
                    try {
                        var3 = 0;
                        var4 = 0;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (var4 >= var2_int) {
                            statePc = 66;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var5 = param1.charAt(var4);
                        if (-47 != (var5 ^ -1)) {
                            statePc = 59;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (0 == var4) {
                            statePc = 56;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (var2_int - 1 == var4) {
                            statePc = 56;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (var3 == 0) {
                            statePc = 58;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        stackIn_57_0 = pj.field_K;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 57: {
                    return stackIn_57_0;
                }
                case 58: {
                    try {
                        var3 = 1;
                        if (var6 == 0) {
                            statePc = 65;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if ((dj.field_b.indexOf(var5) ^ -1) != 0) {
                            statePc = 64;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        stackIn_63_0 = pj.field_K;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 63: {
                    return stackIn_63_0;
                }
                case 64: {
                    try {
                        var3 = 0;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var4++;
                        if (var6 == 0) {
                            statePc = 45;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        stackIn_67_0 = null;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 67: {
                    return (ie) ((Object) stackIn_67_0);
                }
                case 68: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_71_0 = (RuntimeException) (var2);
                    stackIn_69_0 = stackIn_71_0;
                    stackIn_71_1 = new StringBuilder().append("vl.EA(").append(param0).append(',');
                    stackIn_69_1 = stackIn_71_1;
                    if (param1 == null) {
                        statePc = 71;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    stackIn_72_0 = (RuntimeException) ((Object) stackIn_69_0);
                    stackIn_72_1 = (StringBuilder) ((Object) stackIn_69_1);
                    stackIn_72_2 = "{...}";
                    statePc = 72;
                    continue stateLoop;
                }
                case 71: {
                    stackIn_72_0 = (RuntimeException) ((Object) stackIn_71_0);
                    stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
                    stackIn_72_2 = "null";
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    throw wm.a((Throwable) ((Object) stackIn_72_0), stackIn_72_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int[] param0, int[] param1, int param2, byte param3, int param4) {
        int[] dupTemp$2 = null;
        int[] dupTemp$3 = null;
        RuntimeException runtimeException = null;
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
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var27 = Pool.field_O;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var18 = param0[3] >> 24769058;
                        var19 = param0[4] >> -514656894;
                        var20 = param0[5] >> -1352694046;
                        var21 = param0[6] >> -205148766;
                        var22 = param0[7] >> 583344674;
                        var23 = param0[8] >> 591913186;
                        var24 = param0[9] >> 67091714;
                        var25 = param0[10] >> -315518494;
                        if (param3 < -37) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var26 = param0[11] >> -2063191134;
                        var9 = param1[5] * var20 + param1[4] * var19 + param1[3] * var18 >> 587351182;
                        var10 = param1[3] * var21 - -(param1[4] * var22) - -(param1[5] * var23) >> 77586446;
                        var13 = param1[6] * var21 - -(var22 * param1[7]) + param1[8] * var23 >> 150268494;
                        var17 = var26 * param1[11] + param1[10] * var25 + var24 * param1[9] >> -1373633266;
                        var15 = param1[11] * var20 + param1[9] * var18 - -(var19 * param1[10]) >> 427364654;
                        var12 = var18 * param1[6] + var19 * param1[7] - -(param1[8] * var20) >> 1437706350;
                        var11 = param1[5] * var26 + param1[4] * var25 + var24 * param1[3] >> 333871534;
                        var14 = var26 * param1[8] + param1[7] * var25 + var24 * param1[6] >> -641646514;
                        var16 = var22 * param1[10] + param1[9] * var21 + param1[11] * var23 >> -1433344402;
                        var18 = param1[0] + -param0[0];
                        var19 = -param0[1] + param1[1];
                        var20 = -param0[2] + param1[2];
                        var7 = var19 * param0[7] + (var18 * param0[6] - -(param0[8] * var20)) >> -98336272;
                        var8 = param0[10] * var19 + (var18 * param0[9] - -(param0[11] * var20)) >> -283843184;
                        var6_int = var20 * param0[5] + (var18 * param0[3] + var19 * param0[4]) >> -1369514672;
                        var18 = 0;
                        var19 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((var19 ^ -1) <= (hj.field_d[param2].length ^ -1)) {
                            statePc = 23;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var20 = 2 + (128 * var19 / hj.field_d[param2].length + -64);
                        kp.field_i[param2][var19] = var20 * var15 + var12 * tj.field_ab[param2][var19] + hj.field_d[param2][var19] * var9 >> -590652816;
                        field_n[param2][var19] = var13 * tj.field_ab[param2][var19] + (var10 * hj.field_d[param2][var19] + var16 * var20) >> 26455952;
                        var20 = var14 * tj.field_ab[param2][var19] + hj.field_d[param2][var19] * var11 + var20 * var17 >> -383431248;
                        dupTemp$2 = kp.field_i[param2];
                        dupTemp$2[var19] = dupTemp$2[var19] + var6_int;
                        dupTemp$3 = field_n[param2];
                        dupTemp$3[var19] = dupTemp$3[var19] + var7;
                        var20 = var20 + var8;
                        stackIn_27_0 = 0;
                        stackIn_6_0 = stackIn_27_0;
                        stackIn_27_1 = var20;
                        stackIn_6_1 = stackIn_27_1;
                        if (var27 != 0) {
                            statePc = 27;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (stackIn_6_0 >= stackIn_6_1) {
                            statePc = 19;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        kp.field_i[param2][var19] = (qh.field_b - -fb.field_q << 1388713666) - -((kp.field_i[param2][var19] << -299218677) / var20);
                        field_n[param2][var19] = (qh.field_c - -fb.field_d << 888691202) + (field_n[param2][var19] << -1933287701) / var20;
                        stackIn_15_0 = jr.field_o[param2];
                        stackIn_10_0 = stackIn_15_0;
                        stackIn_15_1 = var19;
                        stackIn_10_1 = stackIn_15_1;
                        if (0 == var19) {
                            statePc = 15;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_12_0 = (int[]) ((Object) stackIn_10_0);
                        stackIn_12_1 = stackIn_10_1;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_17_0 = (int[]) ((Object) stackIn_12_0);
                        stackIn_13_0 = stackIn_17_0;
                        stackIn_17_1 = stackIn_12_1;
                        stackIn_13_1 = stackIn_17_1;
                        if (var18 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_15_0 = (int[]) ((Object) stackIn_13_0);
                        stackIn_15_1 = stackIn_13_1;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_18_0 = (int[]) ((Object) stackIn_15_0);
                        stackIn_18_1 = stackIn_15_1;
                        stackIn_18_2 = 0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_18_0 = (int[]) ((Object) stackIn_17_0);
                        stackIn_18_1 = stackIn_17_1;
                        stackIn_18_2 = (int)(((long)ie.field_a[param2][var19] << 658650826) / (long)var20);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_18_0[stackIn_18_1] = stackIn_18_2;
                        if (var27 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var18 = 1;
                        if (var27 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var19++;
                        if (var27 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var18 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackIn_27_0 = 0;
                        stackIn_27_1 = 0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        wn.a((byte) stackIn_27_0, (byte) stackIn_27_1, s.a(param2, 115), field_n[param2], 32512 + -(param4 * 127) >> 1280317448, 0, kp.field_i[param2], jr.field_o[param2]);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 29: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_32_0 = (RuntimeException) (runtimeException);
                    stackIn_30_0 = stackIn_32_0;
                    stackIn_32_1 = new StringBuilder().append("vl.J(");
                    stackIn_30_1 = stackIn_32_1;
                    if (param0 == null) {
                        statePc = 32;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    stackIn_33_0 = (RuntimeException) ((Object) stackIn_30_0);
                    stackIn_33_1 = (StringBuilder) ((Object) stackIn_30_1);
                    stackIn_33_2 = "{...}";
                    statePc = 33;
                    continue stateLoop;
                }
                case 32: {
                    stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
                    stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
                    stackIn_33_2 = "null";
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    stackIn_36_0 = (RuntimeException) ((Object) stackIn_33_0);
                    stackIn_34_0 = stackIn_36_0;
                    stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');
                    stackIn_34_1 = stackIn_36_1;
                    if (param1 == null) {
                        statePc = 36;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    stackIn_37_0 = (RuntimeException) ((Object) stackIn_34_0);
                    stackIn_37_1 = (StringBuilder) ((Object) stackIn_34_1);
                    stackIn_37_2 = "{...}";
                    statePc = 37;
                    continue stateLoop;
                }
                case 36: {
                    stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
                    stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
                    stackIn_37_2 = "null";
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    throw wm.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
                }
                case 38: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void h(int param0) {
        int[] dupTemp$0 = null;
        int[] dupTemp$1 = null;
        int[] dupTemp$2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
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
                  if ((var4 + -1 ^ -1) >= (var5 ^ -1)) {
                    break L0;
                  } else {
                    var2_int = var5 - var4 / 2;
                    var6 = rf.a(65536 - (var2_int * var2_int << 383683600) / (var4 * var4 / 4), -120) * 8 >> 1656634605 >> -1602798527;
                    var7 = 0;
                    L3: while (true) {
                      if (var7 >= hj.field_d.length) {
                        var5++;
                        continue L2;
                      } else {
                        L4: {
                          if (-1 > (var6 ^ -1)) {
                            L5: {
                              hj.field_d[var7][var5] = hj.field_d[var7][var5] + hj.field_d[var7][-1 + var5] >> 1346339073;
                              tj.field_ab[var7][var5] = tj.field_ab[var7][var5] + tj.field_ab[var7][var5 - 1] >> 353234113;
                              dupTemp$0 = hj.field_d[var7];
                              dupTemp$0[var5] = dupTemp$0[var5] + (ga.a(5, true, ea.field_r) + -2);
                              dupTemp$1 = tj.field_ab[var7];
                              dupTemp$1[var5] = dupTemp$1[var5] + (ga.a(5, true, ea.field_r) - 2);
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
                  dupTemp$2 = ie.field_a[var5];
                  dupTemp$2[1] = dupTemp$2[1] + (-3 + ga.a(5, true, ea.field_r));
                  ie.field_a[var5][hj.field_d[var5].length - 1] = 0;
                  if (48 >= ie.field_a[var5][1]) {
                    if ((ie.field_a[var5][1] ^ -1) > -17) {
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
          throw wm.a((Throwable) ((Object) var2), "vl.CA(" + param0 + ')');
        }
    }

    public static void i(int param0) {
        try {
            field_o = null;
            int var1_int = -50 % ((40 - param0) / 58);
            field_n = (int[][]) null;
            field_r = null;
            field_p = null;
            field_l = null;
            field_s = null;
            field_m = null;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "vl.E(" + param0 + ')');
        }
    }

    final void a(int param0, al param1) {
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = Pool.field_O;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        hj.field_d = new int[param1.field_l.length][12];
                        tj.field_ab = new int[param1.field_l.length][12];
                        ie.field_a = new int[param1.field_l.length][12];
                        kp.field_i = new int[hj.field_d.length][hj.field_d[0].length];
                        field_n = new int[hj.field_d.length][hj.field_d[0].length];
                        jr.field_o = new int[hj.field_d.length][hj.field_d[0].length];
                        var3_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (hj.field_d.length <= var3_int) {
                            statePc = 12;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_13_0 = 0;
                        stackIn_4_0 = stackIn_13_0;
                        if (var5 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var4 = stackIn_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((var4 ^ -1) <= (hj.field_d[var3_int].length ^ -1)) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        hj.field_d[var3_int][var4] = 0;
                        tj.field_ab[var3_int][var4] = 0;
                        ie.field_a[var3_int][var4] = 16;
                        var4++;
                        if (var5 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var5 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        ie.field_a[var3_int][0] = 0;
                        ie.field_a[var3_int][-1 + ie.field_a[var3_int].length] = 0;
                        var3_int++;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var5 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_13_0 = param0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (stackIn_13_0 == 2147483647) {
                            statePc = 22;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        vl.a(106, (String) null);
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_20_0 = (RuntimeException) (var3);
                    stackIn_18_0 = stackIn_20_0;
                    stackIn_20_1 = new StringBuilder().append("vl.AA(").append(param0).append(',');
                    stackIn_18_1 = stackIn_20_1;
                    if (param1 == null) {
                        statePc = 20;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_18_1);
                    stackIn_21_2 = "{...}";
                    statePc = 21;
                    continue stateLoop;
                }
                case 20: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                    stackIn_21_2 = "null";
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    throw wm.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
                }
                case 22: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final String a(int param0, byte param1) {
        RuntimeException var3 = null;
        String stackIn_7_0 = null;
        String stackIn_12_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 >= 108) {
                break L1;
              } else {
                vl.a(7, (String) null);
                break L1;
              }
            }
            if (param0 == 0) {
              stackIn_7_0 = pn.field_t;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-2 == (param0 ^ -1)) {
                stackIn_12_0 = oe.field_S;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                throw new IllegalStateException("Invalid group number");
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3), "vl.W(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_12_0;
        }
    }

    private final void a(int param0, byte param1, int param2, int[] param3, int[] param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        long var7 = 0L;
        long var9 = 0L;
        long var11 = 0L;
        long var13 = 0L;
        long var15 = 0L;
        long var17 = 0L;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6_int = -100 / ((47 - param1) / 45);
            var7 = (long)(-param3[0] + param4[0]);
            var9 = (long)(-param3[1] + param4[1]);
            var11 = (long)(-param3[2] + param4[2]);
            var13 = (long)param3[9] * var7 + ((long)param3[10] * var9 - -((long)param3[11] * var11));
            if (-1L <= (var13 ^ -1L)) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var15 = (long)param3[4] * var9 + (long)param3[3] * var7 - -((long)param3[5] * var11);
                var17 = var9 * (long)param3[7] + (var7 * (long)param3[6] + var11 * (long)param3[8]);
                var15 = (var15 << 2015665613) / var13 + (long)(qh.field_b + fb.field_q << 1846502276);
                var17 = (var17 << 1396390605) / var13 + (long)(qh.field_c - -fb.field_d << 2056129380);
                qh.a((int)(var15 >> -1462654460), (int)(var17 >> 466795908), -2 + ((int)(2147483648L / var13) * (256 + -param0) >> 662030440), 0, 224);
                if (2147483647L > 127L * (34359738368L / var13) * (34359738368L / var13)) {
                  qh.a((int)var15, (int)var17, (int)(34359738368L / var13) * (256 - param0) >> -1984877944, 127, dg.a(-9, param2));
                  break L1;
                } else {
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (runtimeException);

            stackIn_12_1 = new StringBuilder().append("vl.FA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param4 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_13_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(boolean param0, int param1, boolean param2) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0) {
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
                        lc.a(var4 != 0, fc.field_b.h(1), var3_int, param1, fc.field_b.field_Lb, -121);
                        break L2;
                      }
                    }
                    fc.field_b = null;
                    wa.m(8421504);
                    break L1;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) runtimeException), "vl.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    vl() {
    }

    final int a(int param0, boolean param1) {
        int stackIn_84_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_95_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
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
                  if ((var3_int ^ -1) == -3) {
                    break L2;
                  } else {
                    L4: {
                      if (-4 != (var3_int ^ -1)) {
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
                    if ((var3_int ^ -1) == -6) {
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
                        if ((var3_int ^ -1) != -8) {
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
                            stackIn_88_0 = 3355443;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            break L8;
                          }
                        }
                      }
                      L9: {
                        L10: {
                          if (-10 != (var3_int ^ -1)) {
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
                        if (-13 == (var3_int ^ -1)) {
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
                                field_r = (String) null;
                                break L15;
                              }
                            }
                            stackIn_95_0 = 16711935;
                            decompiledRegionSelector0 = 4;
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
                      stackIn_90_0 = 255;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  }
                }
                stackIn_86_0 = 16711680;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
            stackIn_84_0 = 16777215;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3), "vl.A(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_84_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_86_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_88_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_90_0;
              } else {
                return stackIn_95_0;
              }
            }
          }
        }
    }

    final void a(int[] param0, int[] param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (runtimeException);

            stackIn_15_1 = new StringBuilder().append("vl.DA(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_16_0), stackIn_20_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean j(int param0) {
        long var1_long = 0L;
        RuntimeException var1 = null;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = Pool.field_O;
        try {
          L0: {
            L1: {
              var1_long = rl.a((byte) -101);
              if (param0 == 12000) {
                break L1;
              } else {
                vl.i(32);
                break L1;
              }
            }
            L2: {
              var3 = var1_long - db.field_Pb;
              if (-30001L > (var3 ^ -1L)) {
                break L2;
              } else {
                L3: {
                  L4: {
                    var5 = 3000;
                    if (7 > up.field_j) {
                      break L4;
                    } else {
                      var5 = 12000;
                      if (var6 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (5 <= up.field_j) {
                      break L5;
                    } else {
                      if ((up.field_j ^ -1) > -4) {
                        break L3;
                      } else {
                        var5 = 6000;
                        if (var6 == 0) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  var5 = 9000;
                  break L3;
                }
                if (var3 > (long)var5) {
                  db.field_Pb = var1_long;
                  up.field_j = up.field_j + 1;
                  stackIn_19_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  if (var6 == 0) {
                    stackIn_24_0 = 0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            up.field_j = 0;
            db.field_Pb = var1_long;
            stackIn_22_0 = 1;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1), "vl.GA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_19_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_22_0 != 0;
          } else {
            return stackIn_24_0 != 0;
          }
        }
    }

    final int b(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_4_0 = hj.field_d.length;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "vl.P(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void a(int param0, int param1, int[] param2, int[] param3, boolean param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (param0 == -1912602369) {
                break L1;
              } else {
                this.a((byte) -54, -91);
                break L1;
              }
            }
            L2: {
              L3: {
                this.a(param4, param2, param1, param3, -20263);
                if ((param2[2] ^ -1) >= -16385) {
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
            stackIn_16_0 = (RuntimeException) (var6);

            stackIn_16_1 = new StringBuilder().append("vl.K(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_17_0), stackIn_21_2 + ',' + param4 + ')');
        }
    }

    final boolean c(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 2) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "vl.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    final int[] b(int param0, int param1) {
        int[] stackIn_78_0 = null;
        int[] stackIn_80_0 = null;
        int[] stackIn_82_0 = null;
        int[] stackIn_84_0 = null;
        Object stackIn_86_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                field_s = (String) null;
                break L1;
              }
            }
            L2: {
              L3: {
                var3_int = param0;
                if ((var3_int ^ -1) != -1) {
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
                  if (-4 == (var3_int ^ -1)) {
                    break L4;
                  } else {
                    L6: {
                      if (-5 != (var3_int ^ -1)) {
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
                      if (-7 == (var3_int ^ -1)) {
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
                          if ((var3_int ^ -1) != -9) {
                            break L8;
                          } else {
                            if (var4 == 0) {
                              stackIn_82_0 = bc.field_c;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            } else {
                              break L8;
                            }
                          }
                        }
                        L9: {
                          if (-10 == (var3_int ^ -1)) {
                            break L9;
                          } else {
                            L10: {
                              if (-11 != (var3_int ^ -1)) {
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
                              if ((var3_int ^ -1) != -12) {
                                break L11;
                              } else {
                                if (var4 == 0) {
                                  break L9;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            if ((var3_int ^ -1) == -13) {
                              break L9;
                            } else {
                              if (-14 == (var3_int ^ -1)) {
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
                                  stackIn_86_0 = null;
                                  decompiledRegionSelector0 = 4;
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
                        stackIn_84_0 = dq.field_i;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  }
                }
              }
              stackIn_80_0 = v.field_a;
              decompiledRegionSelector0 = 1;
              break L0;
            }
            stackIn_78_0 = jc.field_i;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3), "vl.T(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_78_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_80_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_82_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_84_0;
              } else {
                return (int[]) ((Object) stackIn_86_0);
              }
            }
          }
        }
    }

    final String a(byte param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_4_0 = null;
        String stackIn_7_0 = null;
        String stackIn_12_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 0) {
              stackIn_4_0 = kk.field_G;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 > 9) {
                if (1 == param1) {
                  stackIn_12_0 = hi.field_j;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  throw new IllegalStateException("Invalid group number");
                }
              } else {
                stackIn_7_0 = (String) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3), "vl.G(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    static {
        field_r = "<%0>: ";
        field_q = true;
        field_o = "You have withdrawn your request to join.";
        field_s = "All games";
    }
}
