/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pg extends ub {
    static String field_I;
    static String field_H;
    static kg field_K;
    static int field_G;
    static String field_F;
    static gn field_J;
    static String[] field_L;

    final static void a(int param0, qk param1, boolean param2, int param3, int param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_11_0 = false;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        boolean stackOut_10_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = HoldTheLine.field_D;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = qm.a((-param4 + param0) * param3, (byte) -100);
                        var6 = param4 * 3;
                        var7 = var5_int - 10;
                        p.a(80);
                        if (param1.field_l <= 0) {
                            statePc = 8;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (null != param1.field_r) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        go.b(-92);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        rb.field_t = 0;
                        var8 = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (param1.field_J <= var8) {
                            statePc = 48;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var9 = param1.field_w[var8];
                        var10 = param1.field_Q[var8];
                        var11 = param1.field_P[var8];
                        stackOut_10_0 = param2;
                        stackIn_49_0 = stackOut_10_0 ? 1 : 0;
                        stackIn_11_0 = stackOut_10_0;
                        if (var19 != 0) {
                            statePc = 49;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (!stackIn_11_0) {
                            statePc = 18;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var12 = gd.field_d[var9];
                        var13 = om.field_p[var9];
                        var14 = -var12 + gd.field_d[var10];
                        var15 = gd.field_d[var11] + -var12;
                        var16 = -var13 + om.field_p[var10];
                        var17 = om.field_p[var11] + -var13;
                        if ((var14 * var17 + -(var16 * var15) ^ -1) > -1) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var19 == 0) {
                            statePc = 47;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var12 = ff.field_c[var9];
                        if ((var12 ^ -1) != 2147483647) {
                            statePc = 22;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var19 == 0) {
                            statePc = 47;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var13 = ff.field_c[var10];
                        if (-2147483648 == var13) {
                            statePc = 47;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var14 = ff.field_c[var11];
                        if (2147483647 == (var14 ^ -1)) {
                            statePc = 47;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var15 = var13 + (var12 + var14) + -var6;
                        stackIn_27_0 = qg.field_d.length + -1;
                        stackIn_25_0 = stackIn_27_0;
                        if (-1 < (var7 ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_28_0 = stackIn_25_0;
                        stackIn_28_1 = var15 >> var7;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackIn_28_0 = stackIn_27_0;
                        stackIn_28_1 = var15 << -var7;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var16 = stackIn_28_0 + -stackIn_28_1;
                        var17 = qg.field_d[var16];
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if ((var17 >> -1173230876 ^ -1) == -1) {
                            statePc = 38;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var16--;
                        stackIn_39_0 = -1;
                        stackIn_31_0 = stackIn_39_0;
                        stackIn_39_1 = var16 ^ -1;
                        stackIn_31_1 = stackIn_39_1;
                        if (var19 != 0) {
                            statePc = 39;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (stackIn_31_0 >= stackIn_31_1) {
                            statePc = 37;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        System.err.println("Out of range!");
                        if (var19 == 0) {
                            statePc = 47;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var17 = qg.field_d[var16];
                        if (var19 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackIn_39_0 = var17;
                        stackIn_39_1 = var16 << -365163900;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var18 = stackIn_39_0 + stackIn_39_1;
                        al.field_b[var18] = var8;
                        qg.field_d[var16] = var17 - -1;
                        if (-1 <= (param1.field_l ^ -1)) {
                            statePc = 46;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (param1.field_r != null) {
                            statePc = 45;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        dupTemp$0 = param1.field_r[var8];
                        pk.field_I[dupTemp$0] = pk.field_I[dupTemp$0] + 1;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        rb.field_t = rb.field_t + 1;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var8++;
                        if (var19 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackIn_49_0 = 0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (stackIn_49_0 >= param1.field_l) {
                            statePc = 65;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (null == param1.field_r) {
                            statePc = 65;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var8 = 0;
                        var9 = 0;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var9 >= pk.field_I.length) {
                            statePc = 65;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var10 = pk.field_I[var9];
                        pk.field_I[var9] = var8;
                        var8 = var8 + var10;
                        var9++;
                        if (var19 != 0) {
                            statePc = 65;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (var19 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 60: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_63_0 = (RuntimeException) (var5);
                    stackIn_61_0 = stackIn_63_0;
                    stackIn_63_1 = new StringBuilder().append("pg.L(").append(param0).append(',');
                    stackIn_61_1 = stackIn_63_1;
                    if (param1 == null) {
                        statePc = 63;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    stackIn_64_0 = (RuntimeException) ((Object) stackIn_61_0);
                    stackIn_64_1 = (StringBuilder) ((Object) stackIn_61_1);
                    stackIn_64_2 = "{...}";
                    statePc = 64;
                    continue stateLoop;
                }
                case 63: {
                    stackIn_64_0 = (RuntimeException) ((Object) stackIn_63_0);
                    stackIn_64_1 = (StringBuilder) ((Object) stackIn_63_1);
                    stackIn_64_2 = "null";
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    throw kk.a((Throwable) ((Object) stackIn_64_0), stackIn_64_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
                }
                case 65: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, byte param1, boolean param2) {
        RuntimeException runtimeException = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param2) {
                break L1;
              } else {
                if (param0 == ud.field_d) {
                  break L1;
                } else {
                  L2: {
                    if (1 == param0) {
                      break L2;
                    } else {
                      if (o.a(param0, 2) != null) {
                        break L2;
                      } else {
                        kd.field_c = 80;
                        if (HoldTheLine.field_D == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  ud.field_d = param0;
                  break L1;
                }
              }
            }
            if ((param0 ^ -1) != (ma.field_k ^ -1)) {
              L3: {
                ma.field_k = param0;
                if (param1 > 91) {
                  break L3;
                } else {
                  field_K = (kg) null;
                  break L3;
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
          throw kk.a((Throwable) ((Object) runtimeException), "pg.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(boolean param0, byte param1, String param2, boolean param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            uk.b(-45);
            if (param1 >= 82) {
              ka.field_b.a(false);
              lh.field_a = new vg(ec.field_v, (String) null, ci.field_o, param3, param0);
              sm.field_c = new si(ka.field_b, lh.field_a);
              ka.field_b.a(sm.field_c, false);
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

            stackIn_7_1 = new StringBuilder().append("pg.I(").append(param0).append(',').append(param1).append(',');

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
          throw kk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void h(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              field_H = null;
              field_F = null;
              if (param0 == 6) {
                break L1;
              } else {
                field_L = (String[]) null;
                break L1;
              }
            }
            field_K = null;
            field_L = null;
            field_I = null;
            field_J = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var1), "pg.M(" + param0 + ')');
        }
    }

    final static int a(byte param0, byte[] param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = -10 % ((57 - param0) / 62);
            stackIn_1_0 = qe.a(0, param2, 0, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var3);

            stackIn_5_1 = new StringBuilder().append("pg.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(gn param0, int param1) {
        try {
            vk[] array$0 = null;
            int stackIn_5_0 = 0;
            int stackIn_7_0 = 0;
            boolean stackIn_10_0 = false;
            int stackIn_19_0 = 0;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            String stackIn_25_2 = null;
            boolean stackOut_9_0;
            int statePc = 0;
            Throwable caughtException = null;
            byte[] var2 = null;
            RuntimeException var2_ref = null;
            String[] var3 = null;
            String[][] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String var8 = null;
            IOException var9 = null;
            int var10 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var10 = HoldTheLine.field_D;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var2 = param0.a((byte) -96, "level_progression.txt");
                            var3 = ik.a(var2, 0);
                            var4 = new String[6][];
                            var4[0] = e.a(var3, 0, "s1");
                            var4[1] = e.a(var3, 0, "s2");
                            var4[2] = e.a(var3, 0, "s3");
                            var4[3] = e.a(var3, 0, "s4");
                            var4[4] = e.a(var3, 0, "tutorial");
                            var4[5] = e.a(var3, 0, "demolition");
                            vf.field_v = false;
                            tk.field_c = new vk[6][];
                            pc.field_l = new int[6];
                            var5 = 0;
                            if (param1 < -85) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            pg.a((String) null, (byte) 88);
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            stackIn_5_0 = -7;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (stackIn_5_0 >= (var5 ^ -1)) {
                                statePc = 18;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var6 = var4[var5].length;
                            pc.field_l[var5] = var6;
                            array$0 = new vk[var6];
                            tk.field_c[var5] = array$0;
                            stackIn_19_0 = 0;
                            stackIn_7_0 = stackIn_19_0;
                            if (var10 != 0) {
                                statePc = 19;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var7 = stackIn_7_0;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (var7 >= var6) {
                                statePc = 17;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var8 = var4[var5][var7];
                            stackOut_9_0 = param0.a(var8, "", 23158);
                            stackIn_5_0 = stackOut_9_0 ? 1 : 0;
                            stackIn_10_0 = stackOut_9_0;
                            if (var10 != 0) {
                                statePc = 5;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (!stackIn_10_0) {
                                statePc = 15;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            tk.field_c[var5][var7] = lm.a(param0.a((byte) 125, var4[var5][var7]), (byte) 121);
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = ((Object) stateCaught_11 instanceof IOException ? 14 : 21);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            var9 = (IOException) ((Object) caughtException);
                            throw new RuntimeException((String) null);
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            tk.field_c[var5][var7] = new vk(var8);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            var7++;
                            if (var10 == 0) {
                                statePc = 8;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var5++;
                            if (var10 == 0) {
                                statePc = 4;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            stackIn_19_0 = -117;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            j.a((byte) stackIn_19_0, ik.a(param0.a((byte) 58, "tutorial.txt"), 0));
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        var2_ref = (RuntimeException) ((Object) caughtException);
                        stackIn_24_0 = (RuntimeException) (var2_ref);
                        stackIn_22_0 = stackIn_24_0;
                        stackIn_24_1 = new StringBuilder().append("pg.D(");
                        stackIn_22_1 = stackIn_24_1;
                        if (param0 == null) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        stackIn_25_0 = (RuntimeException) ((Object) stackIn_22_0);
                        stackIn_25_1 = (StringBuilder) ((Object) stackIn_22_1);
                        stackIn_25_2 = "{...}";
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 24: {
                        stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
                        stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
                        stackIn_25_2 = "null";
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 25: {
                        throw kk.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
                    }
                    case 26: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, n param1, int param2, int param3, byte param4, int param5) {
        RuntimeException runtimeException = null;
        jd var7 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3, param4, param5);
              var7 = ig.field_q;
              if (null == var7) {
                break L1;
              } else {
                if (this.b(param3, (byte) -105, param0, param2, param5)) {
                  L2: {
                    if (!(this.field_t instanceof c)) {
                      break L2;
                    } else {
                      ((c) ((Object) this.field_t)).a(var7, (byte) 122, (pg) (this));
                      ig.field_q = null;
                      if (HoldTheLine.field_D == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (!(var7.field_t instanceof c)) {
                    break L1;
                  } else {
                    ((c) ((Object) var7.field_t)).a(var7, (byte) 113, (pg) (this));
                    ig.field_q = null;
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (runtimeException);

            stackIn_19_1 = new StringBuilder().append("pg.SA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static sh a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        int var5 = 0;
        sh var6 = null;
        sh stackIn_7_0 = null;
        sh stackIn_10_0 = null;
        sh stackIn_15_0 = null;
        sh stackIn_17_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == param0) {
                break L1;
              } else {
                if (param0.length() == 0) {
                  break L1;
                } else {
                  var2_int = param0.indexOf('@');
                  if (var2_int != -1) {
                    var3 = param0.substring(0, var2_int);
                    var5 = -101 % ((param1 - -63) / 35);
                    var4 = param0.substring(var2_int + 1);
                    var6 = mm.a(var3, 34);
                    if (var6 != null) {
                      stackIn_15_0 = (sh) (var6);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      stackIn_17_0 = cd.a((byte) -118, var4);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  } else {
                    stackIn_10_0 = fo.field_k;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
            stackIn_7_0 = tg.field_g;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var2);

            stackIn_21_1 = new StringBuilder().append("pg.G(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L2;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0;
            } else {
              return stackIn_17_0;
            }
          }
        }
    }

    final static void a(int param0, gn param1, gn param2, gn param3) {
        mg discarded$2 = null;
        byte[] var4 = null;
        bm[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int var8_int = 0;
        int[] var8 = null;
        int var9_int = 0;
        hj var9 = null;
        int var10_int = 0;
        hj var10 = null;
        hj var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        hj var15 = null;
        int var16 = 0;
        int[] stackIn_11_0 = null;
        int[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int[] stackIn_19_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        Throwable caughtException = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = HoldTheLine.field_D;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    fb.field_i = param2;
                    wj.field_n = param1;
                    ef.field_c = param3;
                    var4 = ef.field_c.a("", false, "font");
                    var5 = oc.a("", fb.field_i, (byte) 32, "font");
                    qf.a(param0 ^ param0, -1, var4);
                    ni.field_a = ce.a(0, var4, var5, 1, 16777215, param0 + -30857);
                    qf.a(param0 ^ 30865, 2, var4);
                    nm.field_c = ce.a(0, var4, var5, 2, 16777215, 8);
                    HoldTheLine.field_F = om.a("font12", ef.field_c, "", 8192, fb.field_i);
                    var6 = nm.field_c.field_N[0];
                    nm.field_c.field_N = new int[10][];
                    nm.field_c.field_N[0] = var6;
                    nm.field_c.field_N[1] = mf.a(1, (byte) 102, 14737632, var6);
                    nm.field_c.field_N[2] = mf.a(1, (byte) 97, 16724736, var6);
                    nm.field_c.field_N[3] = mf.a(8388608, (byte) 118, 16711680, var6);
                    nm.field_c.field_N[4] = mf.a(4194304, (byte) 93, 16764672, var6);
                    nm.field_c.field_N[5] = mf.a(1, (byte) 121, 16763904, var6);
                    var7 = HoldTheLine.field_F.field_N[0];
                    HoldTheLine.field_F.field_N = new int[13][];
                    HoldTheLine.field_F.field_N[0] = var7;
                    HoldTheLine.field_F.field_N[4] = mf.a(1, (byte) 98, 14737632, var7);
                    HoldTheLine.field_F.field_N[5] = mf.a(1, (byte) 93, 16724736, var7);
                    HoldTheLine.field_F.field_N[2] = mf.a(1, (byte) 109, 16724736, var7);
                    HoldTheLine.field_F.field_N[1] = mf.a(1, (byte) 99, 16763904, var7);
                    HoldTheLine.field_F.field_N[3] = mf.a(1, (byte) 114, 16777087, var7);
                    HoldTheLine.field_F.field_N[6] = mf.a(12632256, (byte) 116, 8421504, var7);
                    HoldTheLine.field_F.field_N[7] = mf.a(1, (byte) 123, 8421504, var7);
                    HoldTheLine.field_F.field_N[8] = mf.a(1, (byte) 99, 1, var7);
                    var8_int = 0;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if ((nc.field_j.length ^ -1) >= (var8_int ^ -1)) {
                        statePc = 7;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    nm.field_c.field_N[6 - -var8_int] = mf.a(1, (byte) 103, nc.field_j[var8_int], var6);
                    HoldTheLine.field_F.field_N[var8_int + 9] = mf.a(1, (byte) 114, nc.field_j[var8_int], var7);
                    var8_int++;
                    if (var16 != 0) {
                        statePc = 8;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (var16 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    im.field_b = dl.a(fb.field_i, "logo", false, "");
                    td.field_a = dl.a(fb.field_i, "logo_large", false, "");
                    uk.field_a = new hj(im.field_b.field_s, im.field_b.field_y);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    var8_int = im.field_b.field_z.length;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if ((var8_int ^ -1) >= -1) {
                        statePc = 18;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var8_int--;
                    stackIn_19_0 = uk.field_a.field_z;
                    stackIn_11_0 = stackIn_19_0;
                    if (var16 != 0) {
                        statePc = 19;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    stackIn_16_0 = (int[]) ((Object) stackIn_11_0);
                    stackIn_12_0 = stackIn_16_0;
                    stackIn_16_1 = var8_int;
                    stackIn_12_1 = stackIn_16_1;
                    if (im.field_b.field_z[var8_int] == 0) {
                        statePc = 16;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackIn_14_0 = (int[]) ((Object) stackIn_12_0);
                    stackIn_14_1 = stackIn_12_1;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    stackIn_17_0 = (int[]) ((Object) stackIn_14_0);
                    stackIn_17_1 = stackIn_14_1;
                    stackIn_17_2 = 1;
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    stackIn_17_0 = (int[]) ((Object) stackIn_16_0);
                    stackIn_17_1 = stackIn_16_1;
                    stackIn_17_2 = 0;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    stackIn_17_0[stackIn_17_1] = stackIn_17_2;
                    if (var16 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    rf.field_ab = dl.a(fb.field_i, "locked", false, "");
                    kj.field_q = dl.a(wj.field_n, "basic", false, "locked");
                    ra.field_hb = dl.a(fb.field_i, "loading", false, "");
                    ai.field_c = dl.a(wj.field_n, "basic", false, "orbcoin");
                    hf.field_j = new ah();
                    qn.field_m = new bm[14];
                    qn.field_m[0] = hc.a("", fb.field_i, -123, "keyboard_space");
                    qn.field_m[1] = hc.a("", fb.field_i, -117, "keyboard_esc");
                    qn.field_m[2] = hc.a("", fb.field_i, -120, "keyboard_right");
                    qn.field_m[3] = hc.a("", fb.field_i, -123, "keyboard_left");
                    qn.field_m[4] = hc.a("", fb.field_i, -120, "keyboard_down");
                    qn.field_m[5] = hc.a("", fb.field_i, -123, "keyboard_up");
                    qn.field_m[6] = hc.a("", fb.field_i, wb.a(param0, -30976), "keyboard_enter");
                    qn.field_m[7] = hc.a("", fb.field_i, -118, "keyboard_ctrl");
                    qn.field_m[8] = hc.a("", fb.field_i, wb.a(param0, -30951), "keyboard_alt");
                    qn.field_m[9] = hc.a("", fb.field_i, -128, "keyboard_tab");
                    qn.field_m[10] = hc.a("", fb.field_i, -118, "keyboard_q");
                    qn.field_m[11] = hc.a("", fb.field_i, -121, "keyboard_a");
                    qn.field_m[12] = hc.a("", fb.field_i, wb.a(param0, -30958), "keyboard_x");
                    qn.field_m[13] = hc.a("", fb.field_i, -124, "keyboard_c");
                    stackIn_19_0 = new int[qn.field_m.length];
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    var8 = stackIn_19_0;
                    var9_int = 0;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (qn.field_m.length <= var9_int) {
                        statePc = 25;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var8[var9_int] = 13;
                    var9_int++;
                    if (var16 != 0) {
                        statePc = 26;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (var16 == 0) {
                        statePc = 20;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    HoldTheLine.field_F.a(qn.field_m, var8);
                    ka.field_f = new hj(32, 32);
                    vb.a(-114, ka.field_f);
                    kj.field_q.c(0, 0, 32, 32);
                    ug.b(param0 ^ -30866);
                    cm.field_d = dl.a(fb.field_i, "flag", false, "");
                    kc.field_a = new va("benefits");
                    rm.field_A = new uf("mb_template");
                    jf.field_a = new uf("mb_buttonframe");
                    bo.field_d = new uf("mb_logotext");
                    nj.field_i = dl.a(fb.field_i, "menubar", false, "");
                    on.field_t = dl.a(fb.field_i, "titlebar", false, "");
                    de.field_O = dl.a(fb.field_i, "titlebar_divleft", false, "");
                    dc.field_ab = dl.a(fb.field_i, "titlebar_divright", false, "");
                    hh.field_e = dl.a(fb.field_i, "courseselect_bar", false, "");
                    oi.field_a = new hj(20, 20);
                    vb.a(-53, oi.field_a);
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    var9_int = 1;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if ((var9_int ^ -1) <= -20) {
                        statePc = 32;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var10_int = (2166 + var9_int * 44) / 17;
                    var10_int = var10_int << 220188400 | (var10_int | var10_int << 779973608);
                    tc.b(1, var9_int, 18, var10_int);
                    var9_int++;
                    if (var16 != 0) {
                        statePc = 33;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (var16 == 0) {
                        statePc = 27;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var9_int = 2;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    if ((var9_int ^ -1) <= -19) {
                        statePc = 38;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var10_int = (77 * var9_int - 4) / 15;
                    var10_int = var10_int | var10_int << 1371016424 | var10_int << 1922657904;
                    tc.b(2, var9_int, 16, var10_int);
                    var9_int++;
                    if (var16 != 0) {
                        statePc = 39;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if (var16 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    tc.a(0, 0, 20, 20, 65793);
                    ug.b(param0 ^ -30866);
                    ol.field_i = new uf("win");
                    sm.field_a = new uf("loss");
                    nj.field_c = new uf[4];
                    nj.field_c[0] = new uf("splash_s1");
                    nj.field_c[1] = new uf("splash_s2");
                    nj.field_c[2] = new uf("splash_s3");
                    nj.field_c[3] = new uf("splash_s4");
                    ha.field_o = new uf[3];
                    ha.field_o[0] = new uf("wreath1");
                    ha.field_o[1] = new uf("wreath2");
                    ha.field_o[2] = new uf("wreath3");
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    var9 = dl.a(fb.field_i, "frame", false, "");
                    qk.field_E = new hj[9];
                    qk.field_E[0] = fj.a(0, 0, var9, 20, 0, 20);
                    qk.field_E[1] = fj.a(0, 20, var9, 20, 0, 16);
                    qk.field_E[2] = fj.a(0, 36, var9, 20, 0, 20);
                    qk.field_E[3] = fj.a(0, 0, var9, 16, 20, 20);
                    qk.field_E[4] = fj.a(0, 20, var9, 16, 20, 16);
                    qk.field_E[5] = fj.a(0, 36, var9, 16, 20, 20);
                    qk.field_E[6] = fj.a(0, 0, var9, 20, 36, 20);
                    qk.field_E[7] = fj.a(0, 20, var9, 20, 36, 16);
                    qk.field_E[8] = fj.a(0, 36, var9, 20, 36, 20);
                    var10 = dl.a(fb.field_i, "frame_textured", false, "");
                    var11 = dl.a(fb.field_i, "tarmac", false, "");
                    var12 = 14;
                    var13 = -(2 * var12) + var10.field_s;
                    jc.field_h = new hj[9];
                    var14 = var10.field_y - 2 * var12;
                    jc.field_h[0] = fj.a(0, 0, var10, var12, 0, var12);
                    jc.field_h[1] = fj.a(0, var12, var10, var12, 0, var13);
                    jc.field_h[2] = fj.a(0, var12 + var13, var10, var12, 0, var12);
                    jc.field_h[3] = fj.a(0, 0, var10, var14, var12, var12);
                    jc.field_h[4] = var11;
                    jc.field_h[5] = fj.a(0, var13 + var12, var10, var14, var12, var12);
                    jc.field_h[6] = fj.a(wb.a(param0, 30865), 0, var10, var12, var14 + var12, var12);
                    jc.field_h[7] = fj.a(0, var12, var10, var12, var14 - -var12, var13);
                    jc.field_h[8] = fj.a(0, var13 - -var12, var10, var12, var12 + var14, var12);
                    ua.field_b = new va("vehicle_select");
                    oe.field_i = new va("vehicle_select_large");
                    wn.field_f = kb.a("mine", (byte) -53);
                    wb.field_d = hm.a(5499, "missile");
                    ha.field_k = kb.a("powerup_red", (byte) -53);
                    pk.field_O = kb.a("powerup_green", (byte) -53);
                    na.field_q = kb.a("powerup_blue", (byte) -53);
                    cf.field_u = kb.a("powerup_black", (byte) -53);
                    ol.field_h = jd.a("s1_background", 1);
                    fd.field_e = jd.a("s1_track", param0 ^ 30864);
                    qb.field_b = jd.a("s1_tree20", 1);
                    t.field_i = jd.a("s1_tree30", 1);
                    cd.field_d = jd.a("s1_tree40", 1);
                    ci.field_k = jd.a("s1_tree50", 1);
                    ud.field_o = jd.a("s1_tree80", param0 ^ 30864);
                    ub.field_A = ji.a("s1_standempty", (byte) -125);
                    aj.field_c = ji.a("s1_standscattered", (byte) 81);
                    jf.field_c = ji.a("s1_standfull", (byte) 106);
                    ie.field_k = ji.a("s1_ad1", (byte) 97);
                    sj.field_I = ji.a("s1_ad2", (byte) 87);
                    ch.field_u = ji.a("s1_ad3", (byte) 86);
                    bl.field_s = jd.a("s1_pa", 1);
                    vh.field_i = jd.a("s1_tyreblack", 1);
                    ae.field_b = jd.a("s1_tyrewhite", 1);
                    ma.field_l = jd.a("s1_tyrered", param0 + -30864);
                    h.field_b = ji.a("s1_bridge_top", (byte) -57);
                    pd.field_h = ji.a("s1_bridge_side", (byte) -81);
                    aj.field_a = jd.a("s1_bridge_support", param0 ^ 30864);
                    kc.field_b = jd.a("s3_background", 1);
                    ug.field_b = jd.a("s3_background2", 1);
                    ha.field_i = jd.a("s3_background3", 1);
                    om.field_i = jd.a("s3_rock20", param0 ^ 30864);
                    en.field_e = jd.a("s3_rock30", param0 ^ 30864);
                    q.field_d = jd.a("s3_rock40", 1);
                    co.field_b = jd.a("s3_tree20", 1);
                    tf.field_A = jd.a("s3_tree30", 1);
                    uk.field_b = jd.a("s3_tree40", 1);
                    ac.field_c = jd.a("s3_tree50", 1);
                    ri.field_a = jd.a("s3_tree80", 1);
                    ci.field_l = ji.a("s3_igloo", (byte) -76);
                    fj.field_s = ji.a("s3_snowman", (byte) 88);
                    lk.field_a = jd.a("s2_background", 1);
                    hf.field_h = jd.a("s2_background2", 1);
                    a.field_F = jd.a("s2_background3", 1);
                    gh.field_a = ji.a("s2_bones1", (byte) 99);
                    ag.field_r = ji.a("s2_bones2", (byte) -126);
                    w.field_a = jd.a("s2_cacti20", 1);
                    n.field_r = jd.a("s2_cacti30", param0 + -30864);
                    tf.field_o = jd.a("s2_cacti40", 1);
                    aa.field_q = jd.a("s2_tree30", 1);
                    kc.field_d = jd.a("s2_tree40", 1);
                    nd.field_c = jd.a("s2_tree50", 1);
                    ig.field_t = uk.a("s2_well", false, param0 ^ 30968, true);
                    n.field_j = jd.a("s2_tyre1", 1);
                    mo.field_r = jd.a("s2_tyre2", 1);
                    gi.field_J = ji.a("s2_wreckage1", (byte) -116);
                    gk.field_b = ji.a("s2_wreckage2", (byte) 126);
                    hg.field_Q = jd.a("s4_background", 1);
                    gn.field_f = ji.a("s4_light1", (byte) -126);
                    ai.field_b = ji.a("s4_light2", (byte) 91);
                    um.field_e = ji.a("s4_crates", (byte) 74);
                    we.field_p = ji.a("s4_drain", (byte) 92);
                    lc.field_c = ji.a("s4_pa", (byte) 88);
                    jo.field_a = jd.a("s4_tree20", 1);
                    hm.field_b = jd.a("s4_tree30", 1);
                    in.field_b = jd.a("s4_tree40", 1);
                    ie.field_i = jd.a("s4_tree50", 1);
                    lk.field_c = lb.b("vehicle_f1", (byte) -85);
                    al.field_a = lb.b("vehicle_tourer", (byte) -113);
                    rl.field_K = lb.b("vehicle_dragster", (byte) 125);
                    jg.field_o = lb.b("vehicle_dunebuggy", (byte) -114);
                    md.field_j = lb.b("vehicle_snowcat", (byte) 110);
                    ei.field_a = lb.b("vehicle_snowmobile", (byte) 91);
                    am.field_b = lb.b("vehicle_hatchback", (byte) -90);
                    ud.field_h = lb.b("vehicle_suv", (byte) 72);
                    field_K = hm.a(5499, "booster");
                    jk.field_p = hm.a(5499, "slowdown");
                    la.field_g = ji.a("oilslick", (byte) -98);
                    wi.field_a = new kg("halloween_zombie");
                    tn.field_b = new va("halloween_blood");
                    var15 = j.a((byte) 81, 100, 13487565, 40);
                    discarded$2 = new mg(var15, true, false);
                    qk.field_f = new mg(rl.a(-5936, 0, var15, 10, var15), true, false);
                    de.field_Q = sf.a(60, (byte) -108, 8355647);
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private pg(int param0, int param1, int param2, int param3, dh param4, tb param5, n param6) {
        super(param0, param1, param2, param3, param4, param5);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_B = param6;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("pg.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param5 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param6 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), stackIn_15_2 + ')');
        }
    }

    final static int b(int param0, int param1, int param2) {
        int stackIn_2_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_95_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        try {
          L0: {
            var4 = param2 >> 946404223;
            param2 = var4 ^ var4 + param2;
            if (param1 == 4805) {
              L1: {
                var4 = param0 >> 550305023;
                param0 = var4 ^ param0 + var4;
                if ((param0 ^ -1) < (param2 ^ -1)) {
                  var4 = param2;
                  param2 = param0;
                  param0 = var4;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                var3_int = 0;
                if ((param2 ^ -1) > -32769) {
                  break L2;
                } else {
                  L3: {
                    if (-1073741825 < (param2 ^ -1)) {
                      break L3;
                    } else {
                      var3_int += 16;
                      param2 = param2 >> 16;
                      break L3;
                    }
                  }
                  L4: {
                    if (param2 >= 4194304) {
                      var3_int += 8;
                      param2 = param2 >> 8;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (-262145 >= (param2 ^ -1)) {
                      var3_int += 4;
                      param2 = param2 >> 4;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if ((param2 ^ -1) > -65537) {
                      break L6;
                    } else {
                      param2 = param2 >> 2;
                      var3_int += 2;
                      break L6;
                    }
                  }
                  L7: {
                    if ((param2 ^ -1) <= -32769) {
                      param2 = param2 >> 1;
                      var3_int++;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  param0 = param0 >> var3_int;
                  break L2;
                }
              }
              if ((param2 ^ -1) >= (param0 << -1861697915 ^ -1)) {
                param2 = param2 * param2 + param0 * param0;
                if ((param2 ^ -1) <= -65537) {
                  if (param2 < 16777216) {
                    if (-1048577 >= (param2 ^ -1)) {
                      if (param2 < 4194304) {
                        stackIn_95_0 = lg.field_j[param2 >> -2113682514] >> -609889883;
                        decompiledRegionSelector0 = 15;
                        break L0;
                      } else {
                        stackIn_93_0 = lg.field_j[param2 >> 301494032] >> -2005923740;
                        decompiledRegionSelector0 = 14;
                        break L0;
                      }
                    } else {
                      if (param2 < 262144) {
                        stackIn_90_0 = lg.field_j[param2 >> 2049631562] >> 423000263;
                        decompiledRegionSelector0 = 13;
                        break L0;
                      } else {
                        stackIn_88_0 = lg.field_j[param2 >> 291061068] >> -682185370;
                        decompiledRegionSelector0 = 12;
                        break L0;
                      }
                    }
                  } else {
                    if (param2 < 268435456) {
                      if ((param2 ^ -1) > -67108865) {
                        L8: {
                          if ((var3_int ^ -1) > -4) {
                            stackIn_82_0 = lg.field_j[param2 >> -1099996750] >> -var3_int + 3;
                            break L8;
                          } else {
                            stackIn_82_0 = lg.field_j[param2 >> 573377362] << var3_int + -3;
                            break L8;
                          }
                        }
                        decompiledRegionSelector0 = 11;
                        break L0;
                      } else {
                        L9: {
                          if (2 <= var3_int) {
                            stackIn_77_0 = lg.field_j[param2 >> 117227028] << var3_int - 2;
                            break L9;
                          } else {
                            stackIn_77_0 = lg.field_j[param2 >> 2043912276] >> 2 + -var3_int;
                            break L9;
                          }
                        }
                        decompiledRegionSelector0 = 10;
                        break L0;
                      }
                    } else {
                      if (param2 >= 1073741824) {
                        stackIn_69_0 = lg.field_j[param2 >> 288023608] << var3_int;
                        decompiledRegionSelector0 = 9;
                        break L0;
                      } else {
                        L10: {
                          if (1 <= var3_int) {
                            stackIn_67_0 = lg.field_j[param2 >> 238167254] << -1 + var3_int;
                            break L10;
                          } else {
                            stackIn_67_0 = lg.field_j[param2 >> -352316138] >> 1 - var3_int;
                            break L10;
                          }
                        }
                        decompiledRegionSelector0 = 8;
                        break L0;
                      }
                    }
                  }
                } else {
                  if ((param2 ^ -1) > -257) {
                    if (0 <= param2) {
                      stackIn_53_0 = lg.field_j[param2] >> 1008063884;
                      decompiledRegionSelector0 = 7;
                      break L0;
                    } else {
                      stackIn_51_0 = -1;
                      decompiledRegionSelector0 = 6;
                      break L0;
                    }
                  } else {
                    if (param2 < 4096) {
                      if (1024 <= param2) {
                        stackIn_48_0 = lg.field_j[param2 >> -1583404476] >> -12160726;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        stackIn_46_0 = lg.field_j[param2 >> -1153585886] >> -231454645;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      }
                    } else {
                      if (16384 <= param2) {
                        stackIn_43_0 = lg.field_j[param2 >> 616654024] >> 734906696;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        stackIn_41_0 = lg.field_j[param2 >> -1787007610] >> -958075543;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  }
                }
              } else {
                stackIn_29_0 = param2 << var3_int;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = -90;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var3), "pg.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_29_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_41_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_43_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_46_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_48_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_51_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_53_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_67_0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_69_0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_77_0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_82_0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_88_0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_90_0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_93_0;
                                    } else {
                                      return stackIn_95_0;
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
                }
              }
            }
          }
        }
    }

    static {
        field_I = "Updates will sent to the email address you've given";
        field_F = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_H = "Championship";
    }
}
