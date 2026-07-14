/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we {
    static String field_d;
    static String field_a;
    static int field_c;
    static int field_e;
    static String field_b;
    static bi field_f;

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 >= -62) {
          field_d = null;
          field_a = null;
          field_f = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_f = null;
          field_b = null;
          return;
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        String var2 = null;
        CharSequence var3 = null;
        CharSequence var4 = null;
        var2 = param0.getParameter("username");
        if (param1 == 4289) {
          if (var2 != null) {
            var4 = (CharSequence) (Object) var2;
            if ((oq.a(5722, var4) ^ -1L) == -1L) {
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          field_b = null;
          if (var2 != null) {
            var3 = (CharSequence) (Object) var2;
            if ((oq.a(5722, var3) ^ -1L) == -1L) {
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final static void a(byte param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = ShatteredPlansClient.field_F ? 1 : 0;
                    var1 = (Object) (Object) im.field_c;
                    // monitorenter im.field_c
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        of.field_e = of.field_e + 1;
                        tc.field_B = fe.field_J;
                        if (param0 == -59) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        we.a(49, -95, -50, 61, 66, -88, -81, -110, -20);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (qn.field_c <= -1) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var2 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (-113 <= var2) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        di.field_p[var2] = false;
                        var2++;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        qn.field_c = hb.field_e;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (hb.field_e == qn.field_c) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var2 = m.field_x[hb.field_e];
                        hb.field_e = 127 & 1 + hb.field_e;
                        if (-1 < (var2 ^ -1)) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        di.field_p[var2] = true;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        di.field_p[var2 ^ -1] = false;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        fe.field_J = cg.field_I;
                        // monitorexit var1
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var3 = caughtException;
                        // monitorexit var1
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 15: {
                    throw (RuntimeException) (Object) var3;
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14_int = 0;
        long var14 = 0L;
        long var16 = 0L;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        int stackIn_26_4 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        int stackIn_27_3 = 0;
        int stackIn_27_4 = 0;
        int stackIn_27_5 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        int stackIn_29_3 = 0;
        int stackIn_29_4 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_30_2 = 0;
        int stackIn_30_3 = 0;
        int stackIn_30_4 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_31_2 = 0;
        int stackIn_31_3 = 0;
        int stackIn_31_4 = 0;
        int stackIn_31_5 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_54_2 = 0;
        int stackIn_54_3 = 0;
        int stackIn_54_4 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_55_2 = 0;
        int stackIn_55_3 = 0;
        int stackIn_55_4 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_56_2 = 0;
        int stackIn_56_3 = 0;
        int stackIn_56_4 = 0;
        int stackIn_56_5 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_58_2 = 0;
        int stackIn_58_3 = 0;
        int stackIn_58_4 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int stackIn_59_2 = 0;
        int stackIn_59_3 = 0;
        int stackIn_59_4 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        int stackIn_60_2 = 0;
        int stackIn_60_3 = 0;
        int stackIn_60_4 = 0;
        int stackIn_60_5 = 0;
        int stackIn_72_0 = 0;
        int stackIn_72_1 = 0;
        int stackIn_72_2 = 0;
        int stackIn_72_3 = 0;
        int stackIn_72_4 = 0;
        int stackIn_73_0 = 0;
        int stackIn_73_1 = 0;
        int stackIn_73_2 = 0;
        int stackIn_73_3 = 0;
        int stackIn_73_4 = 0;
        int stackIn_74_0 = 0;
        int stackIn_74_1 = 0;
        int stackIn_74_2 = 0;
        int stackIn_74_3 = 0;
        int stackIn_74_4 = 0;
        int stackIn_74_5 = 0;
        int stackIn_76_0 = 0;
        int stackIn_76_1 = 0;
        int stackIn_76_2 = 0;
        int stackIn_76_3 = 0;
        int stackIn_76_4 = 0;
        int stackIn_77_0 = 0;
        int stackIn_77_1 = 0;
        int stackIn_77_2 = 0;
        int stackIn_77_3 = 0;
        int stackIn_77_4 = 0;
        int stackIn_78_0 = 0;
        int stackIn_78_1 = 0;
        int stackIn_78_2 = 0;
        int stackIn_78_3 = 0;
        int stackIn_78_4 = 0;
        int stackIn_78_5 = 0;
        int stackIn_85_0 = 0;
        int stackIn_85_1 = 0;
        int stackIn_85_2 = 0;
        int stackIn_85_3 = 0;
        int stackIn_85_4 = 0;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        int stackIn_86_2 = 0;
        int stackIn_86_3 = 0;
        int stackIn_86_4 = 0;
        int stackIn_87_0 = 0;
        int stackIn_87_1 = 0;
        int stackIn_87_2 = 0;
        int stackIn_87_3 = 0;
        int stackIn_87_4 = 0;
        int stackIn_87_5 = 0;
        int stackIn_89_0 = 0;
        int stackIn_89_1 = 0;
        int stackIn_89_2 = 0;
        int stackIn_89_3 = 0;
        int stackIn_89_4 = 0;
        int stackIn_90_0 = 0;
        int stackIn_90_1 = 0;
        int stackIn_90_2 = 0;
        int stackIn_90_3 = 0;
        int stackIn_90_4 = 0;
        int stackIn_91_0 = 0;
        int stackIn_91_1 = 0;
        int stackIn_91_2 = 0;
        int stackIn_91_3 = 0;
        int stackIn_91_4 = 0;
        int stackIn_91_5 = 0;
        int stackIn_97_0 = 0;
        int stackIn_97_1 = 0;
        int stackIn_97_2 = 0;
        int stackIn_97_3 = 0;
        int stackIn_97_4 = 0;
        int stackIn_98_0 = 0;
        int stackIn_98_1 = 0;
        int stackIn_98_2 = 0;
        int stackIn_98_3 = 0;
        int stackIn_98_4 = 0;
        int stackIn_99_0 = 0;
        int stackIn_99_1 = 0;
        int stackIn_99_2 = 0;
        int stackIn_99_3 = 0;
        int stackIn_99_4 = 0;
        int stackIn_99_5 = 0;
        int stackIn_101_0 = 0;
        int stackIn_101_1 = 0;
        int stackIn_101_2 = 0;
        int stackIn_101_3 = 0;
        int stackIn_101_4 = 0;
        int stackIn_102_0 = 0;
        int stackIn_102_1 = 0;
        int stackIn_102_2 = 0;
        int stackIn_102_3 = 0;
        int stackIn_102_4 = 0;
        int stackIn_103_0 = 0;
        int stackIn_103_1 = 0;
        int stackIn_103_2 = 0;
        int stackIn_103_3 = 0;
        int stackIn_103_4 = 0;
        int stackIn_103_5 = 0;
        int stackIn_112_0 = 0;
        int stackIn_112_1 = 0;
        int stackIn_112_2 = 0;
        int stackIn_112_3 = 0;
        int stackIn_112_4 = 0;
        int stackIn_113_0 = 0;
        int stackIn_113_1 = 0;
        int stackIn_113_2 = 0;
        int stackIn_113_3 = 0;
        int stackIn_113_4 = 0;
        int stackIn_114_0 = 0;
        int stackIn_114_1 = 0;
        int stackIn_114_2 = 0;
        int stackIn_114_3 = 0;
        int stackIn_114_4 = 0;
        int stackIn_114_5 = 0;
        int stackIn_116_0 = 0;
        int stackIn_116_1 = 0;
        int stackIn_116_2 = 0;
        int stackIn_116_3 = 0;
        int stackIn_116_4 = 0;
        int stackIn_117_0 = 0;
        int stackIn_117_1 = 0;
        int stackIn_117_2 = 0;
        int stackIn_117_3 = 0;
        int stackIn_117_4 = 0;
        int stackIn_118_0 = 0;
        int stackIn_118_1 = 0;
        int stackIn_118_2 = 0;
        int stackIn_118_3 = 0;
        int stackIn_118_4 = 0;
        int stackIn_118_5 = 0;
        int stackIn_125_0 = 0;
        int stackIn_125_1 = 0;
        int stackIn_125_2 = 0;
        int stackIn_125_3 = 0;
        int stackIn_125_4 = 0;
        int stackIn_126_0 = 0;
        int stackIn_126_1 = 0;
        int stackIn_126_2 = 0;
        int stackIn_126_3 = 0;
        int stackIn_126_4 = 0;
        int stackIn_127_0 = 0;
        int stackIn_127_1 = 0;
        int stackIn_127_2 = 0;
        int stackIn_127_3 = 0;
        int stackIn_127_4 = 0;
        int stackIn_127_5 = 0;
        int stackIn_129_0 = 0;
        int stackIn_129_1 = 0;
        int stackIn_129_2 = 0;
        int stackIn_129_3 = 0;
        int stackIn_129_4 = 0;
        int stackIn_130_0 = 0;
        int stackIn_130_1 = 0;
        int stackIn_130_2 = 0;
        int stackIn_130_3 = 0;
        int stackIn_130_4 = 0;
        int stackIn_131_0 = 0;
        int stackIn_131_1 = 0;
        int stackIn_131_2 = 0;
        int stackIn_131_3 = 0;
        int stackIn_131_4 = 0;
        int stackIn_131_5 = 0;
        int stackIn_137_0 = 0;
        int stackIn_137_1 = 0;
        int stackIn_137_2 = 0;
        int stackIn_137_3 = 0;
        int stackIn_137_4 = 0;
        int stackIn_138_0 = 0;
        int stackIn_138_1 = 0;
        int stackIn_138_2 = 0;
        int stackIn_138_3 = 0;
        int stackIn_138_4 = 0;
        int stackIn_139_0 = 0;
        int stackIn_139_1 = 0;
        int stackIn_139_2 = 0;
        int stackIn_139_3 = 0;
        int stackIn_139_4 = 0;
        int stackIn_139_5 = 0;
        int stackIn_141_0 = 0;
        int stackIn_141_1 = 0;
        int stackIn_141_2 = 0;
        int stackIn_141_3 = 0;
        int stackIn_141_4 = 0;
        int stackIn_142_0 = 0;
        int stackIn_142_1 = 0;
        int stackIn_142_2 = 0;
        int stackIn_142_3 = 0;
        int stackIn_142_4 = 0;
        int stackIn_143_0 = 0;
        int stackIn_143_1 = 0;
        int stackIn_143_2 = 0;
        int stackIn_143_3 = 0;
        int stackIn_143_4 = 0;
        int stackIn_143_5 = 0;
        int stackOut_57_0 = 0;
        int stackOut_57_1 = 0;
        int stackOut_57_2 = 0;
        int stackOut_57_3 = 0;
        int stackOut_57_4 = 0;
        int stackOut_59_0 = 0;
        int stackOut_59_1 = 0;
        int stackOut_59_2 = 0;
        int stackOut_59_3 = 0;
        int stackOut_59_4 = 0;
        int stackOut_59_5 = 0;
        int stackOut_58_0 = 0;
        int stackOut_58_1 = 0;
        int stackOut_58_2 = 0;
        int stackOut_58_3 = 0;
        int stackOut_58_4 = 0;
        int stackOut_58_5 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        int stackOut_53_2 = 0;
        int stackOut_53_3 = 0;
        int stackOut_53_4 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        int stackOut_55_2 = 0;
        int stackOut_55_3 = 0;
        int stackOut_55_4 = 0;
        int stackOut_55_5 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_54_2 = 0;
        int stackOut_54_3 = 0;
        int stackOut_54_4 = 0;
        int stackOut_54_5 = 0;
        int stackOut_100_0 = 0;
        int stackOut_100_1 = 0;
        int stackOut_100_2 = 0;
        int stackOut_100_3 = 0;
        int stackOut_100_4 = 0;
        int stackOut_102_0 = 0;
        int stackOut_102_1 = 0;
        int stackOut_102_2 = 0;
        int stackOut_102_3 = 0;
        int stackOut_102_4 = 0;
        int stackOut_102_5 = 0;
        int stackOut_101_0 = 0;
        int stackOut_101_1 = 0;
        int stackOut_101_2 = 0;
        int stackOut_101_3 = 0;
        int stackOut_101_4 = 0;
        int stackOut_101_5 = 0;
        int stackOut_96_0 = 0;
        int stackOut_96_1 = 0;
        int stackOut_96_2 = 0;
        int stackOut_96_3 = 0;
        int stackOut_96_4 = 0;
        int stackOut_98_0 = 0;
        int stackOut_98_1 = 0;
        int stackOut_98_2 = 0;
        int stackOut_98_3 = 0;
        int stackOut_98_4 = 0;
        int stackOut_98_5 = 0;
        int stackOut_97_0 = 0;
        int stackOut_97_1 = 0;
        int stackOut_97_2 = 0;
        int stackOut_97_3 = 0;
        int stackOut_97_4 = 0;
        int stackOut_97_5 = 0;
        int stackOut_88_0 = 0;
        int stackOut_88_1 = 0;
        int stackOut_88_2 = 0;
        int stackOut_88_3 = 0;
        int stackOut_88_4 = 0;
        int stackOut_90_0 = 0;
        int stackOut_90_1 = 0;
        int stackOut_90_2 = 0;
        int stackOut_90_3 = 0;
        int stackOut_90_4 = 0;
        int stackOut_90_5 = 0;
        int stackOut_89_0 = 0;
        int stackOut_89_1 = 0;
        int stackOut_89_2 = 0;
        int stackOut_89_3 = 0;
        int stackOut_89_4 = 0;
        int stackOut_89_5 = 0;
        int stackOut_84_0 = 0;
        int stackOut_84_1 = 0;
        int stackOut_84_2 = 0;
        int stackOut_84_3 = 0;
        int stackOut_84_4 = 0;
        int stackOut_86_0 = 0;
        int stackOut_86_1 = 0;
        int stackOut_86_2 = 0;
        int stackOut_86_3 = 0;
        int stackOut_86_4 = 0;
        int stackOut_86_5 = 0;
        int stackOut_85_0 = 0;
        int stackOut_85_1 = 0;
        int stackOut_85_2 = 0;
        int stackOut_85_3 = 0;
        int stackOut_85_4 = 0;
        int stackOut_85_5 = 0;
        int stackOut_75_0 = 0;
        int stackOut_75_1 = 0;
        int stackOut_75_2 = 0;
        int stackOut_75_3 = 0;
        int stackOut_75_4 = 0;
        int stackOut_77_0 = 0;
        int stackOut_77_1 = 0;
        int stackOut_77_2 = 0;
        int stackOut_77_3 = 0;
        int stackOut_77_4 = 0;
        int stackOut_77_5 = 0;
        int stackOut_76_0 = 0;
        int stackOut_76_1 = 0;
        int stackOut_76_2 = 0;
        int stackOut_76_3 = 0;
        int stackOut_76_4 = 0;
        int stackOut_76_5 = 0;
        int stackOut_71_0 = 0;
        int stackOut_71_1 = 0;
        int stackOut_71_2 = 0;
        int stackOut_71_3 = 0;
        int stackOut_71_4 = 0;
        int stackOut_73_0 = 0;
        int stackOut_73_1 = 0;
        int stackOut_73_2 = 0;
        int stackOut_73_3 = 0;
        int stackOut_73_4 = 0;
        int stackOut_73_5 = 0;
        int stackOut_72_0 = 0;
        int stackOut_72_1 = 0;
        int stackOut_72_2 = 0;
        int stackOut_72_3 = 0;
        int stackOut_72_4 = 0;
        int stackOut_72_5 = 0;
        int stackOut_140_0 = 0;
        int stackOut_140_1 = 0;
        int stackOut_140_2 = 0;
        int stackOut_140_3 = 0;
        int stackOut_140_4 = 0;
        int stackOut_142_0 = 0;
        int stackOut_142_1 = 0;
        int stackOut_142_2 = 0;
        int stackOut_142_3 = 0;
        int stackOut_142_4 = 0;
        int stackOut_142_5 = 0;
        int stackOut_141_0 = 0;
        int stackOut_141_1 = 0;
        int stackOut_141_2 = 0;
        int stackOut_141_3 = 0;
        int stackOut_141_4 = 0;
        int stackOut_141_5 = 0;
        int stackOut_136_0 = 0;
        int stackOut_136_1 = 0;
        int stackOut_136_2 = 0;
        int stackOut_136_3 = 0;
        int stackOut_136_4 = 0;
        int stackOut_138_0 = 0;
        int stackOut_138_1 = 0;
        int stackOut_138_2 = 0;
        int stackOut_138_3 = 0;
        int stackOut_138_4 = 0;
        int stackOut_138_5 = 0;
        int stackOut_137_0 = 0;
        int stackOut_137_1 = 0;
        int stackOut_137_2 = 0;
        int stackOut_137_3 = 0;
        int stackOut_137_4 = 0;
        int stackOut_137_5 = 0;
        int stackOut_128_0 = 0;
        int stackOut_128_1 = 0;
        int stackOut_128_2 = 0;
        int stackOut_128_3 = 0;
        int stackOut_128_4 = 0;
        int stackOut_130_0 = 0;
        int stackOut_130_1 = 0;
        int stackOut_130_2 = 0;
        int stackOut_130_3 = 0;
        int stackOut_130_4 = 0;
        int stackOut_130_5 = 0;
        int stackOut_129_0 = 0;
        int stackOut_129_1 = 0;
        int stackOut_129_2 = 0;
        int stackOut_129_3 = 0;
        int stackOut_129_4 = 0;
        int stackOut_129_5 = 0;
        int stackOut_124_0 = 0;
        int stackOut_124_1 = 0;
        int stackOut_124_2 = 0;
        int stackOut_124_3 = 0;
        int stackOut_124_4 = 0;
        int stackOut_126_0 = 0;
        int stackOut_126_1 = 0;
        int stackOut_126_2 = 0;
        int stackOut_126_3 = 0;
        int stackOut_126_4 = 0;
        int stackOut_126_5 = 0;
        int stackOut_125_0 = 0;
        int stackOut_125_1 = 0;
        int stackOut_125_2 = 0;
        int stackOut_125_3 = 0;
        int stackOut_125_4 = 0;
        int stackOut_125_5 = 0;
        int stackOut_115_0 = 0;
        int stackOut_115_1 = 0;
        int stackOut_115_2 = 0;
        int stackOut_115_3 = 0;
        int stackOut_115_4 = 0;
        int stackOut_117_0 = 0;
        int stackOut_117_1 = 0;
        int stackOut_117_2 = 0;
        int stackOut_117_3 = 0;
        int stackOut_117_4 = 0;
        int stackOut_117_5 = 0;
        int stackOut_116_0 = 0;
        int stackOut_116_1 = 0;
        int stackOut_116_2 = 0;
        int stackOut_116_3 = 0;
        int stackOut_116_4 = 0;
        int stackOut_116_5 = 0;
        int stackOut_111_0 = 0;
        int stackOut_111_1 = 0;
        int stackOut_111_2 = 0;
        int stackOut_111_3 = 0;
        int stackOut_111_4 = 0;
        int stackOut_113_0 = 0;
        int stackOut_113_1 = 0;
        int stackOut_113_2 = 0;
        int stackOut_113_3 = 0;
        int stackOut_113_4 = 0;
        int stackOut_113_5 = 0;
        int stackOut_112_0 = 0;
        int stackOut_112_1 = 0;
        int stackOut_112_2 = 0;
        int stackOut_112_3 = 0;
        int stackOut_112_4 = 0;
        int stackOut_112_5 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        int stackOut_28_3 = 0;
        int stackOut_28_4 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_30_2 = 0;
        int stackOut_30_3 = 0;
        int stackOut_30_4 = 0;
        int stackOut_30_5 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_29_2 = 0;
        int stackOut_29_3 = 0;
        int stackOut_29_4 = 0;
        int stackOut_29_5 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        int stackOut_24_4 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        int stackOut_26_3 = 0;
        int stackOut_26_4 = 0;
        int stackOut_26_5 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        int stackOut_25_4 = 0;
        int stackOut_25_5 = 0;
        var23 = ShatteredPlansClient.field_F ? 1 : 0;
        var9 = 0;
        if (param0 == 9) {
          L0: {
            var10 = 0;
            var11 = 0;
            var12 = gf.field_i << -1625449020;
            var13 = gf.field_l << -2008290620;
            if (param3 <= param1) {
              break L0;
            } else {
              var14_int = param3;
              param3 = param1;
              param1 = var14_int;
              var14_int = param2;
              param2 = param6;
              param6 = var14_int;
              param5 = -param5 + param8;
              break L0;
            }
          }
          L1: {
            if (param3 >= var13) {
              break L1;
            } else {
              if (var13 >= param1) {
                break L1;
              } else {
                var11 = (int)(65536L * (long)(param1 - var13) / (long)(-param3 + param1));
                break L1;
              }
            }
          }
          L2: {
            if (var12 <= param3) {
              break L2;
            } else {
              if (param1 > var12) {
                var10 = (int)(65536L * (long)(-param3 + var12) / (long)(-param3 + param1));
                break L2;
              } else {
                L3: {
                  var14 = (long)(param1 - param3);
                  var16 = (long)(param6 - param2);
                  param3 = param3 + (int)((long)var10 * var14 >> -875109296);
                  param2 = param2 + (int)((long)var10 * var16 >> 49590224);
                  param1 = param1 - (int)((long)var11 * var14 >> -912742256);
                  param6 = param6 - (int)((long)var11 * var16 >> -1092948656);
                  var13 = gf.field_f << -1625444604;
                  var12 = gf.field_a << -380459548;
                  var11 = 0;
                  var10 = 0;
                  if (param2 <= param6) {
                    break L3;
                  } else {
                    var18 = param3;
                    param3 = param1;
                    param1 = var18;
                    var18 = param2;
                    param2 = param6;
                    param6 = var18;
                    param5 = param8 - param5;
                    break L3;
                  }
                }
                L4: {
                  var14 = (long)(-param3 + param1);
                  var16 = (long)(param6 + -param2);
                  if (param2 >= var12) {
                    break L4;
                  } else {
                    if (param6 > var12) {
                      var10 = (int)((long)(var12 + -param2) * 65536L / (long)(param6 - param2));
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (param2 >= var13) {
                    break L5;
                  } else {
                    if (var13 < param6) {
                      var11 = (int)((long)(param6 - var13) * 65536L / (long)(-param2 + param6));
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  param6 = param6 - (int)(var16 * (long)var11 >> -984726512);
                  param2 = param2 + (int)((long)var10 * var16 >> -993540784);
                  param3 = param3 + (int)(var14 * (long)var10 >> -909106928);
                  var9 = var9 + param5 / param8;
                  param1 = param1 - (int)(var14 * (long)var11 >> 2133495696);
                  param5 = param5 % param8;
                  if (0 <= param5) {
                    break L6;
                  } else {
                    var9--;
                    param5 = param5 + param8;
                    break L6;
                  }
                }
                var18 = 1 + (int)Math.sqrt((double)((param6 - param2) * (param6 + -param2) + (-param3 + param1) * (param1 + -param3)));
                var19 = param3;
                var20 = param2;
                L7: while (true) {
                  if (param5 >= var18) {
                    L8: {
                      stackOut_57_0 = param1;
                      stackOut_57_1 = var19;
                      stackOut_57_2 = param6;
                      stackOut_57_3 = -128;
                      stackOut_57_4 = var20;
                      stackIn_59_0 = stackOut_57_0;
                      stackIn_59_1 = stackOut_57_1;
                      stackIn_59_2 = stackOut_57_2;
                      stackIn_59_3 = stackOut_57_3;
                      stackIn_59_4 = stackOut_57_4;
                      stackIn_58_0 = stackOut_57_0;
                      stackIn_58_1 = stackOut_57_1;
                      stackIn_58_2 = stackOut_57_2;
                      stackIn_58_3 = stackOut_57_3;
                      stackIn_58_4 = stackOut_57_4;
                      if (0 == (1 & var9)) {
                        stackOut_59_0 = stackIn_59_0;
                        stackOut_59_1 = stackIn_59_1;
                        stackOut_59_2 = stackIn_59_2;
                        stackOut_59_3 = stackIn_59_3;
                        stackOut_59_4 = stackIn_59_4;
                        stackOut_59_5 = param4;
                        stackIn_60_0 = stackOut_59_0;
                        stackIn_60_1 = stackOut_59_1;
                        stackIn_60_2 = stackOut_59_2;
                        stackIn_60_3 = stackOut_59_3;
                        stackIn_60_4 = stackOut_59_4;
                        stackIn_60_5 = stackOut_59_5;
                        break L8;
                      } else {
                        stackOut_58_0 = stackIn_58_0;
                        stackOut_58_1 = stackIn_58_1;
                        stackOut_58_2 = stackIn_58_2;
                        stackOut_58_3 = stackIn_58_3;
                        stackOut_58_4 = stackIn_58_4;
                        stackOut_58_5 = param7;
                        stackIn_60_0 = stackOut_58_0;
                        stackIn_60_1 = stackOut_58_1;
                        stackIn_60_2 = stackOut_58_2;
                        stackIn_60_3 = stackOut_58_3;
                        stackIn_60_4 = stackOut_58_4;
                        stackIn_60_5 = stackOut_58_5;
                        break L8;
                      }
                    }
                    ar.a(stackIn_60_0, stackIn_60_1, stackIn_60_2, (byte) stackIn_60_3, stackIn_60_4, stackIn_60_5);
                    return;
                  } else {
                    L9: {
                      var21 = param5 * (-param3 + param1) / var18 + param3;
                      var22 = param2 - -(param5 * (-param2 + param6) / var18);
                      stackOut_53_0 = var21;
                      stackOut_53_1 = var19;
                      stackOut_53_2 = var22;
                      stackOut_53_3 = -86;
                      stackOut_53_4 = var20;
                      stackIn_55_0 = stackOut_53_0;
                      stackIn_55_1 = stackOut_53_1;
                      stackIn_55_2 = stackOut_53_2;
                      stackIn_55_3 = stackOut_53_3;
                      stackIn_55_4 = stackOut_53_4;
                      stackIn_54_0 = stackOut_53_0;
                      stackIn_54_1 = stackOut_53_1;
                      stackIn_54_2 = stackOut_53_2;
                      stackIn_54_3 = stackOut_53_3;
                      stackIn_54_4 = stackOut_53_4;
                      if ((1 & var9) != 0) {
                        stackOut_55_0 = stackIn_55_0;
                        stackOut_55_1 = stackIn_55_1;
                        stackOut_55_2 = stackIn_55_2;
                        stackOut_55_3 = stackIn_55_3;
                        stackOut_55_4 = stackIn_55_4;
                        stackOut_55_5 = param7;
                        stackIn_56_0 = stackOut_55_0;
                        stackIn_56_1 = stackOut_55_1;
                        stackIn_56_2 = stackOut_55_2;
                        stackIn_56_3 = stackOut_55_3;
                        stackIn_56_4 = stackOut_55_4;
                        stackIn_56_5 = stackOut_55_5;
                        break L9;
                      } else {
                        stackOut_54_0 = stackIn_54_0;
                        stackOut_54_1 = stackIn_54_1;
                        stackOut_54_2 = stackIn_54_2;
                        stackOut_54_3 = stackIn_54_3;
                        stackOut_54_4 = stackIn_54_4;
                        stackOut_54_5 = param4;
                        stackIn_56_0 = stackOut_54_0;
                        stackIn_56_1 = stackOut_54_1;
                        stackIn_56_2 = stackOut_54_2;
                        stackIn_56_3 = stackOut_54_3;
                        stackIn_56_4 = stackOut_54_4;
                        stackIn_56_5 = stackOut_54_5;
                        break L9;
                      }
                    }
                    ar.a(stackIn_56_0, stackIn_56_1, stackIn_56_2, (byte) stackIn_56_3, stackIn_56_4, stackIn_56_5);
                    var19 = var21;
                    var20 = var22;
                    var9++;
                    param5 = param5 + param8;
                    continue L7;
                  }
                }
              }
            }
          }
          L10: {
            var14 = (long)(param1 - param3);
            var16 = (long)(param6 - param2);
            param3 = param3 + (int)((long)var10 * var14 >> -875109296);
            param2 = param2 + (int)((long)var10 * var16 >> 49590224);
            param1 = param1 - (int)((long)var11 * var14 >> -912742256);
            param6 = param6 - (int)((long)var11 * var16 >> -1092948656);
            var13 = gf.field_f << -1625444604;
            var12 = gf.field_a << -380459548;
            var11 = 0;
            var10 = 0;
            if (param2 <= param6) {
              break L10;
            } else {
              var18 = param3;
              param3 = param1;
              param1 = var18;
              var18 = param2;
              param2 = param6;
              param6 = var18;
              param5 = param8 - param5;
              break L10;
            }
          }
          L11: {
            var14 = (long)(-param3 + param1);
            var16 = (long)(param6 + -param2);
            if (param2 >= var12) {
              break L11;
            } else {
              if (param6 > var12) {
                var10 = (int)((long)(var12 + -param2) * 65536L / (long)(param6 - param2));
                break L11;
              } else {
                if (param2 < var13) {
                  if (var13 >= param6) {
                    L12: {
                      param6 = param6 - (int)(var16 * (long)var11 >> -984726512);
                      param2 = param2 + (int)((long)var10 * var16 >> -993540784);
                      param3 = param3 + (int)(var14 * (long)var10 >> -909106928);
                      var9 = var9 + param5 / param8;
                      param1 = param1 - (int)(var14 * (long)var11 >> 2133495696);
                      param5 = param5 % param8;
                      if (0 <= param5) {
                        break L12;
                      } else {
                        var9--;
                        param5 = param5 + param8;
                        break L12;
                      }
                    }
                    var18 = 1 + (int)Math.sqrt((double)((param6 - param2) * (param6 + -param2) + (-param3 + param1) * (param1 + -param3)));
                    var19 = param3;
                    var20 = param2;
                    L13: while (true) {
                      if (param5 >= var18) {
                        L14: {
                          stackOut_100_0 = param1;
                          stackOut_100_1 = var19;
                          stackOut_100_2 = param6;
                          stackOut_100_3 = -128;
                          stackOut_100_4 = var20;
                          stackIn_102_0 = stackOut_100_0;
                          stackIn_102_1 = stackOut_100_1;
                          stackIn_102_2 = stackOut_100_2;
                          stackIn_102_3 = stackOut_100_3;
                          stackIn_102_4 = stackOut_100_4;
                          stackIn_101_0 = stackOut_100_0;
                          stackIn_101_1 = stackOut_100_1;
                          stackIn_101_2 = stackOut_100_2;
                          stackIn_101_3 = stackOut_100_3;
                          stackIn_101_4 = stackOut_100_4;
                          if (0 == (1 & var9)) {
                            stackOut_102_0 = stackIn_102_0;
                            stackOut_102_1 = stackIn_102_1;
                            stackOut_102_2 = stackIn_102_2;
                            stackOut_102_3 = stackIn_102_3;
                            stackOut_102_4 = stackIn_102_4;
                            stackOut_102_5 = param4;
                            stackIn_103_0 = stackOut_102_0;
                            stackIn_103_1 = stackOut_102_1;
                            stackIn_103_2 = stackOut_102_2;
                            stackIn_103_3 = stackOut_102_3;
                            stackIn_103_4 = stackOut_102_4;
                            stackIn_103_5 = stackOut_102_5;
                            break L14;
                          } else {
                            stackOut_101_0 = stackIn_101_0;
                            stackOut_101_1 = stackIn_101_1;
                            stackOut_101_2 = stackIn_101_2;
                            stackOut_101_3 = stackIn_101_3;
                            stackOut_101_4 = stackIn_101_4;
                            stackOut_101_5 = param7;
                            stackIn_103_0 = stackOut_101_0;
                            stackIn_103_1 = stackOut_101_1;
                            stackIn_103_2 = stackOut_101_2;
                            stackIn_103_3 = stackOut_101_3;
                            stackIn_103_4 = stackOut_101_4;
                            stackIn_103_5 = stackOut_101_5;
                            break L14;
                          }
                        }
                        ar.a(stackIn_103_0, stackIn_103_1, stackIn_103_2, (byte) stackIn_103_3, stackIn_103_4, stackIn_103_5);
                        return;
                      } else {
                        L15: {
                          var21 = param5 * (-param3 + param1) / var18 + param3;
                          var22 = param2 - -(param5 * (-param2 + param6) / var18);
                          stackOut_96_0 = var21;
                          stackOut_96_1 = var19;
                          stackOut_96_2 = var22;
                          stackOut_96_3 = -86;
                          stackOut_96_4 = var20;
                          stackIn_98_0 = stackOut_96_0;
                          stackIn_98_1 = stackOut_96_1;
                          stackIn_98_2 = stackOut_96_2;
                          stackIn_98_3 = stackOut_96_3;
                          stackIn_98_4 = stackOut_96_4;
                          stackIn_97_0 = stackOut_96_0;
                          stackIn_97_1 = stackOut_96_1;
                          stackIn_97_2 = stackOut_96_2;
                          stackIn_97_3 = stackOut_96_3;
                          stackIn_97_4 = stackOut_96_4;
                          if ((1 & var9) != 0) {
                            stackOut_98_0 = stackIn_98_0;
                            stackOut_98_1 = stackIn_98_1;
                            stackOut_98_2 = stackIn_98_2;
                            stackOut_98_3 = stackIn_98_3;
                            stackOut_98_4 = stackIn_98_4;
                            stackOut_98_5 = param7;
                            stackIn_99_0 = stackOut_98_0;
                            stackIn_99_1 = stackOut_98_1;
                            stackIn_99_2 = stackOut_98_2;
                            stackIn_99_3 = stackOut_98_3;
                            stackIn_99_4 = stackOut_98_4;
                            stackIn_99_5 = stackOut_98_5;
                            break L15;
                          } else {
                            stackOut_97_0 = stackIn_97_0;
                            stackOut_97_1 = stackIn_97_1;
                            stackOut_97_2 = stackIn_97_2;
                            stackOut_97_3 = stackIn_97_3;
                            stackOut_97_4 = stackIn_97_4;
                            stackOut_97_5 = param4;
                            stackIn_99_0 = stackOut_97_0;
                            stackIn_99_1 = stackOut_97_1;
                            stackIn_99_2 = stackOut_97_2;
                            stackIn_99_3 = stackOut_97_3;
                            stackIn_99_4 = stackOut_97_4;
                            stackIn_99_5 = stackOut_97_5;
                            break L15;
                          }
                        }
                        ar.a(stackIn_99_0, stackIn_99_1, stackIn_99_2, (byte) stackIn_99_3, stackIn_99_4, stackIn_99_5);
                        var19 = var21;
                        var20 = var22;
                        var9++;
                        param5 = param5 + param8;
                        continue L13;
                      }
                    }
                  } else {
                    L16: {
                      var11 = (int)((long)(param6 - var13) * 65536L / (long)(-param2 + param6));
                      param6 = param6 - (int)(var16 * (long)var11 >> -984726512);
                      param2 = param2 + (int)((long)var10 * var16 >> -993540784);
                      param3 = param3 + (int)(var14 * (long)var10 >> -909106928);
                      var9 = var9 + param5 / param8;
                      param1 = param1 - (int)(var14 * (long)var11 >> 2133495696);
                      param5 = param5 % param8;
                      if (0 <= param5) {
                        break L16;
                      } else {
                        var9--;
                        param5 = param5 + param8;
                        break L16;
                      }
                    }
                    var18 = 1 + (int)Math.sqrt((double)((param6 - param2) * (param6 + -param2) + (-param3 + param1) * (param1 + -param3)));
                    var19 = param3;
                    var20 = param2;
                    L17: while (true) {
                      if (param5 >= var18) {
                        L18: {
                          stackOut_88_0 = param1;
                          stackOut_88_1 = var19;
                          stackOut_88_2 = param6;
                          stackOut_88_3 = -128;
                          stackOut_88_4 = var20;
                          stackIn_90_0 = stackOut_88_0;
                          stackIn_90_1 = stackOut_88_1;
                          stackIn_90_2 = stackOut_88_2;
                          stackIn_90_3 = stackOut_88_3;
                          stackIn_90_4 = stackOut_88_4;
                          stackIn_89_0 = stackOut_88_0;
                          stackIn_89_1 = stackOut_88_1;
                          stackIn_89_2 = stackOut_88_2;
                          stackIn_89_3 = stackOut_88_3;
                          stackIn_89_4 = stackOut_88_4;
                          if (0 == (1 & var9)) {
                            stackOut_90_0 = stackIn_90_0;
                            stackOut_90_1 = stackIn_90_1;
                            stackOut_90_2 = stackIn_90_2;
                            stackOut_90_3 = stackIn_90_3;
                            stackOut_90_4 = stackIn_90_4;
                            stackOut_90_5 = param4;
                            stackIn_91_0 = stackOut_90_0;
                            stackIn_91_1 = stackOut_90_1;
                            stackIn_91_2 = stackOut_90_2;
                            stackIn_91_3 = stackOut_90_3;
                            stackIn_91_4 = stackOut_90_4;
                            stackIn_91_5 = stackOut_90_5;
                            break L18;
                          } else {
                            stackOut_89_0 = stackIn_89_0;
                            stackOut_89_1 = stackIn_89_1;
                            stackOut_89_2 = stackIn_89_2;
                            stackOut_89_3 = stackIn_89_3;
                            stackOut_89_4 = stackIn_89_4;
                            stackOut_89_5 = param7;
                            stackIn_91_0 = stackOut_89_0;
                            stackIn_91_1 = stackOut_89_1;
                            stackIn_91_2 = stackOut_89_2;
                            stackIn_91_3 = stackOut_89_3;
                            stackIn_91_4 = stackOut_89_4;
                            stackIn_91_5 = stackOut_89_5;
                            break L18;
                          }
                        }
                        ar.a(stackIn_91_0, stackIn_91_1, stackIn_91_2, (byte) stackIn_91_3, stackIn_91_4, stackIn_91_5);
                        return;
                      } else {
                        L19: {
                          var21 = param5 * (-param3 + param1) / var18 + param3;
                          var22 = param2 - -(param5 * (-param2 + param6) / var18);
                          stackOut_84_0 = var21;
                          stackOut_84_1 = var19;
                          stackOut_84_2 = var22;
                          stackOut_84_3 = -86;
                          stackOut_84_4 = var20;
                          stackIn_86_0 = stackOut_84_0;
                          stackIn_86_1 = stackOut_84_1;
                          stackIn_86_2 = stackOut_84_2;
                          stackIn_86_3 = stackOut_84_3;
                          stackIn_86_4 = stackOut_84_4;
                          stackIn_85_0 = stackOut_84_0;
                          stackIn_85_1 = stackOut_84_1;
                          stackIn_85_2 = stackOut_84_2;
                          stackIn_85_3 = stackOut_84_3;
                          stackIn_85_4 = stackOut_84_4;
                          if ((1 & var9) != 0) {
                            stackOut_86_0 = stackIn_86_0;
                            stackOut_86_1 = stackIn_86_1;
                            stackOut_86_2 = stackIn_86_2;
                            stackOut_86_3 = stackIn_86_3;
                            stackOut_86_4 = stackIn_86_4;
                            stackOut_86_5 = param7;
                            stackIn_87_0 = stackOut_86_0;
                            stackIn_87_1 = stackOut_86_1;
                            stackIn_87_2 = stackOut_86_2;
                            stackIn_87_3 = stackOut_86_3;
                            stackIn_87_4 = stackOut_86_4;
                            stackIn_87_5 = stackOut_86_5;
                            break L19;
                          } else {
                            stackOut_85_0 = stackIn_85_0;
                            stackOut_85_1 = stackIn_85_1;
                            stackOut_85_2 = stackIn_85_2;
                            stackOut_85_3 = stackIn_85_3;
                            stackOut_85_4 = stackIn_85_4;
                            stackOut_85_5 = param4;
                            stackIn_87_0 = stackOut_85_0;
                            stackIn_87_1 = stackOut_85_1;
                            stackIn_87_2 = stackOut_85_2;
                            stackIn_87_3 = stackOut_85_3;
                            stackIn_87_4 = stackOut_85_4;
                            stackIn_87_5 = stackOut_85_5;
                            break L19;
                          }
                        }
                        ar.a(stackIn_87_0, stackIn_87_1, stackIn_87_2, (byte) stackIn_87_3, stackIn_87_4, stackIn_87_5);
                        var19 = var21;
                        var20 = var22;
                        var9++;
                        param5 = param5 + param8;
                        continue L17;
                      }
                    }
                  }
                } else {
                  L20: {
                    param6 = param6 - (int)(var16 * (long)var11 >> -984726512);
                    param2 = param2 + (int)((long)var10 * var16 >> -993540784);
                    param3 = param3 + (int)(var14 * (long)var10 >> -909106928);
                    var9 = var9 + param5 / param8;
                    param1 = param1 - (int)(var14 * (long)var11 >> 2133495696);
                    param5 = param5 % param8;
                    if (0 <= param5) {
                      break L20;
                    } else {
                      var9--;
                      param5 = param5 + param8;
                      break L20;
                    }
                  }
                  var18 = 1 + (int)Math.sqrt((double)((param6 - param2) * (param6 + -param2) + (-param3 + param1) * (param1 + -param3)));
                  var19 = param3;
                  var20 = param2;
                  L21: while (true) {
                    if (param5 >= var18) {
                      L22: {
                        stackOut_75_0 = param1;
                        stackOut_75_1 = var19;
                        stackOut_75_2 = param6;
                        stackOut_75_3 = -128;
                        stackOut_75_4 = var20;
                        stackIn_77_0 = stackOut_75_0;
                        stackIn_77_1 = stackOut_75_1;
                        stackIn_77_2 = stackOut_75_2;
                        stackIn_77_3 = stackOut_75_3;
                        stackIn_77_4 = stackOut_75_4;
                        stackIn_76_0 = stackOut_75_0;
                        stackIn_76_1 = stackOut_75_1;
                        stackIn_76_2 = stackOut_75_2;
                        stackIn_76_3 = stackOut_75_3;
                        stackIn_76_4 = stackOut_75_4;
                        if (0 == (1 & var9)) {
                          stackOut_77_0 = stackIn_77_0;
                          stackOut_77_1 = stackIn_77_1;
                          stackOut_77_2 = stackIn_77_2;
                          stackOut_77_3 = stackIn_77_3;
                          stackOut_77_4 = stackIn_77_4;
                          stackOut_77_5 = param4;
                          stackIn_78_0 = stackOut_77_0;
                          stackIn_78_1 = stackOut_77_1;
                          stackIn_78_2 = stackOut_77_2;
                          stackIn_78_3 = stackOut_77_3;
                          stackIn_78_4 = stackOut_77_4;
                          stackIn_78_5 = stackOut_77_5;
                          break L22;
                        } else {
                          stackOut_76_0 = stackIn_76_0;
                          stackOut_76_1 = stackIn_76_1;
                          stackOut_76_2 = stackIn_76_2;
                          stackOut_76_3 = stackIn_76_3;
                          stackOut_76_4 = stackIn_76_4;
                          stackOut_76_5 = param7;
                          stackIn_78_0 = stackOut_76_0;
                          stackIn_78_1 = stackOut_76_1;
                          stackIn_78_2 = stackOut_76_2;
                          stackIn_78_3 = stackOut_76_3;
                          stackIn_78_4 = stackOut_76_4;
                          stackIn_78_5 = stackOut_76_5;
                          break L22;
                        }
                      }
                      ar.a(stackIn_78_0, stackIn_78_1, stackIn_78_2, (byte) stackIn_78_3, stackIn_78_4, stackIn_78_5);
                      return;
                    } else {
                      L23: {
                        var21 = param5 * (-param3 + param1) / var18 + param3;
                        var22 = param2 - -(param5 * (-param2 + param6) / var18);
                        stackOut_71_0 = var21;
                        stackOut_71_1 = var19;
                        stackOut_71_2 = var22;
                        stackOut_71_3 = -86;
                        stackOut_71_4 = var20;
                        stackIn_73_0 = stackOut_71_0;
                        stackIn_73_1 = stackOut_71_1;
                        stackIn_73_2 = stackOut_71_2;
                        stackIn_73_3 = stackOut_71_3;
                        stackIn_73_4 = stackOut_71_4;
                        stackIn_72_0 = stackOut_71_0;
                        stackIn_72_1 = stackOut_71_1;
                        stackIn_72_2 = stackOut_71_2;
                        stackIn_72_3 = stackOut_71_3;
                        stackIn_72_4 = stackOut_71_4;
                        if ((1 & var9) != 0) {
                          stackOut_73_0 = stackIn_73_0;
                          stackOut_73_1 = stackIn_73_1;
                          stackOut_73_2 = stackIn_73_2;
                          stackOut_73_3 = stackIn_73_3;
                          stackOut_73_4 = stackIn_73_4;
                          stackOut_73_5 = param7;
                          stackIn_74_0 = stackOut_73_0;
                          stackIn_74_1 = stackOut_73_1;
                          stackIn_74_2 = stackOut_73_2;
                          stackIn_74_3 = stackOut_73_3;
                          stackIn_74_4 = stackOut_73_4;
                          stackIn_74_5 = stackOut_73_5;
                          break L23;
                        } else {
                          stackOut_72_0 = stackIn_72_0;
                          stackOut_72_1 = stackIn_72_1;
                          stackOut_72_2 = stackIn_72_2;
                          stackOut_72_3 = stackIn_72_3;
                          stackOut_72_4 = stackIn_72_4;
                          stackOut_72_5 = param4;
                          stackIn_74_0 = stackOut_72_0;
                          stackIn_74_1 = stackOut_72_1;
                          stackIn_74_2 = stackOut_72_2;
                          stackIn_74_3 = stackOut_72_3;
                          stackIn_74_4 = stackOut_72_4;
                          stackIn_74_5 = stackOut_72_5;
                          break L23;
                        }
                      }
                      ar.a(stackIn_74_0, stackIn_74_1, stackIn_74_2, (byte) stackIn_74_3, stackIn_74_4, stackIn_74_5);
                      var19 = var21;
                      var20 = var22;
                      var9++;
                      param5 = param5 + param8;
                      continue L21;
                    }
                  }
                }
              }
            }
          }
          if (param2 < var13) {
            if (var13 >= param6) {
              L24: {
                param6 = param6 - (int)(var16 * (long)var11 >> -984726512);
                param2 = param2 + (int)((long)var10 * var16 >> -993540784);
                param3 = param3 + (int)(var14 * (long)var10 >> -909106928);
                var9 = var9 + param5 / param8;
                param1 = param1 - (int)(var14 * (long)var11 >> 2133495696);
                param5 = param5 % param8;
                if (0 <= param5) {
                  break L24;
                } else {
                  var9--;
                  param5 = param5 + param8;
                  break L24;
                }
              }
              var18 = 1 + (int)Math.sqrt((double)((param6 - param2) * (param6 + -param2) + (-param3 + param1) * (param1 + -param3)));
              var19 = param3;
              var20 = param2;
              L25: while (true) {
                if (param5 >= var18) {
                  L26: {
                    stackOut_140_0 = param1;
                    stackOut_140_1 = var19;
                    stackOut_140_2 = param6;
                    stackOut_140_3 = -128;
                    stackOut_140_4 = var20;
                    stackIn_142_0 = stackOut_140_0;
                    stackIn_142_1 = stackOut_140_1;
                    stackIn_142_2 = stackOut_140_2;
                    stackIn_142_3 = stackOut_140_3;
                    stackIn_142_4 = stackOut_140_4;
                    stackIn_141_0 = stackOut_140_0;
                    stackIn_141_1 = stackOut_140_1;
                    stackIn_141_2 = stackOut_140_2;
                    stackIn_141_3 = stackOut_140_3;
                    stackIn_141_4 = stackOut_140_4;
                    if (0 == (1 & var9)) {
                      stackOut_142_0 = stackIn_142_0;
                      stackOut_142_1 = stackIn_142_1;
                      stackOut_142_2 = stackIn_142_2;
                      stackOut_142_3 = stackIn_142_3;
                      stackOut_142_4 = stackIn_142_4;
                      stackOut_142_5 = param4;
                      stackIn_143_0 = stackOut_142_0;
                      stackIn_143_1 = stackOut_142_1;
                      stackIn_143_2 = stackOut_142_2;
                      stackIn_143_3 = stackOut_142_3;
                      stackIn_143_4 = stackOut_142_4;
                      stackIn_143_5 = stackOut_142_5;
                      break L26;
                    } else {
                      stackOut_141_0 = stackIn_141_0;
                      stackOut_141_1 = stackIn_141_1;
                      stackOut_141_2 = stackIn_141_2;
                      stackOut_141_3 = stackIn_141_3;
                      stackOut_141_4 = stackIn_141_4;
                      stackOut_141_5 = param7;
                      stackIn_143_0 = stackOut_141_0;
                      stackIn_143_1 = stackOut_141_1;
                      stackIn_143_2 = stackOut_141_2;
                      stackIn_143_3 = stackOut_141_3;
                      stackIn_143_4 = stackOut_141_4;
                      stackIn_143_5 = stackOut_141_5;
                      break L26;
                    }
                  }
                  ar.a(stackIn_143_0, stackIn_143_1, stackIn_143_2, (byte) stackIn_143_3, stackIn_143_4, stackIn_143_5);
                  return;
                } else {
                  L27: {
                    var21 = param5 * (-param3 + param1) / var18 + param3;
                    var22 = param2 - -(param5 * (-param2 + param6) / var18);
                    stackOut_136_0 = var21;
                    stackOut_136_1 = var19;
                    stackOut_136_2 = var22;
                    stackOut_136_3 = -86;
                    stackOut_136_4 = var20;
                    stackIn_138_0 = stackOut_136_0;
                    stackIn_138_1 = stackOut_136_1;
                    stackIn_138_2 = stackOut_136_2;
                    stackIn_138_3 = stackOut_136_3;
                    stackIn_138_4 = stackOut_136_4;
                    stackIn_137_0 = stackOut_136_0;
                    stackIn_137_1 = stackOut_136_1;
                    stackIn_137_2 = stackOut_136_2;
                    stackIn_137_3 = stackOut_136_3;
                    stackIn_137_4 = stackOut_136_4;
                    if ((1 & var9) != 0) {
                      stackOut_138_0 = stackIn_138_0;
                      stackOut_138_1 = stackIn_138_1;
                      stackOut_138_2 = stackIn_138_2;
                      stackOut_138_3 = stackIn_138_3;
                      stackOut_138_4 = stackIn_138_4;
                      stackOut_138_5 = param7;
                      stackIn_139_0 = stackOut_138_0;
                      stackIn_139_1 = stackOut_138_1;
                      stackIn_139_2 = stackOut_138_2;
                      stackIn_139_3 = stackOut_138_3;
                      stackIn_139_4 = stackOut_138_4;
                      stackIn_139_5 = stackOut_138_5;
                      break L27;
                    } else {
                      stackOut_137_0 = stackIn_137_0;
                      stackOut_137_1 = stackIn_137_1;
                      stackOut_137_2 = stackIn_137_2;
                      stackOut_137_3 = stackIn_137_3;
                      stackOut_137_4 = stackIn_137_4;
                      stackOut_137_5 = param4;
                      stackIn_139_0 = stackOut_137_0;
                      stackIn_139_1 = stackOut_137_1;
                      stackIn_139_2 = stackOut_137_2;
                      stackIn_139_3 = stackOut_137_3;
                      stackIn_139_4 = stackOut_137_4;
                      stackIn_139_5 = stackOut_137_5;
                      break L27;
                    }
                  }
                  ar.a(stackIn_139_0, stackIn_139_1, stackIn_139_2, (byte) stackIn_139_3, stackIn_139_4, stackIn_139_5);
                  var19 = var21;
                  var20 = var22;
                  var9++;
                  param5 = param5 + param8;
                  continue L25;
                }
              }
            } else {
              L28: {
                var11 = (int)((long)(param6 - var13) * 65536L / (long)(-param2 + param6));
                param6 = param6 - (int)(var16 * (long)var11 >> -984726512);
                param2 = param2 + (int)((long)var10 * var16 >> -993540784);
                param3 = param3 + (int)(var14 * (long)var10 >> -909106928);
                var9 = var9 + param5 / param8;
                param1 = param1 - (int)(var14 * (long)var11 >> 2133495696);
                param5 = param5 % param8;
                if (0 <= param5) {
                  break L28;
                } else {
                  var9--;
                  param5 = param5 + param8;
                  break L28;
                }
              }
              var18 = 1 + (int)Math.sqrt((double)((param6 - param2) * (param6 + -param2) + (-param3 + param1) * (param1 + -param3)));
              var19 = param3;
              var20 = param2;
              L29: while (true) {
                if (param5 >= var18) {
                  L30: {
                    stackOut_128_0 = param1;
                    stackOut_128_1 = var19;
                    stackOut_128_2 = param6;
                    stackOut_128_3 = -128;
                    stackOut_128_4 = var20;
                    stackIn_130_0 = stackOut_128_0;
                    stackIn_130_1 = stackOut_128_1;
                    stackIn_130_2 = stackOut_128_2;
                    stackIn_130_3 = stackOut_128_3;
                    stackIn_130_4 = stackOut_128_4;
                    stackIn_129_0 = stackOut_128_0;
                    stackIn_129_1 = stackOut_128_1;
                    stackIn_129_2 = stackOut_128_2;
                    stackIn_129_3 = stackOut_128_3;
                    stackIn_129_4 = stackOut_128_4;
                    if (0 == (1 & var9)) {
                      stackOut_130_0 = stackIn_130_0;
                      stackOut_130_1 = stackIn_130_1;
                      stackOut_130_2 = stackIn_130_2;
                      stackOut_130_3 = stackIn_130_3;
                      stackOut_130_4 = stackIn_130_4;
                      stackOut_130_5 = param4;
                      stackIn_131_0 = stackOut_130_0;
                      stackIn_131_1 = stackOut_130_1;
                      stackIn_131_2 = stackOut_130_2;
                      stackIn_131_3 = stackOut_130_3;
                      stackIn_131_4 = stackOut_130_4;
                      stackIn_131_5 = stackOut_130_5;
                      break L30;
                    } else {
                      stackOut_129_0 = stackIn_129_0;
                      stackOut_129_1 = stackIn_129_1;
                      stackOut_129_2 = stackIn_129_2;
                      stackOut_129_3 = stackIn_129_3;
                      stackOut_129_4 = stackIn_129_4;
                      stackOut_129_5 = param7;
                      stackIn_131_0 = stackOut_129_0;
                      stackIn_131_1 = stackOut_129_1;
                      stackIn_131_2 = stackOut_129_2;
                      stackIn_131_3 = stackOut_129_3;
                      stackIn_131_4 = stackOut_129_4;
                      stackIn_131_5 = stackOut_129_5;
                      break L30;
                    }
                  }
                  ar.a(stackIn_131_0, stackIn_131_1, stackIn_131_2, (byte) stackIn_131_3, stackIn_131_4, stackIn_131_5);
                  return;
                } else {
                  L31: {
                    var21 = param5 * (-param3 + param1) / var18 + param3;
                    var22 = param2 - -(param5 * (-param2 + param6) / var18);
                    stackOut_124_0 = var21;
                    stackOut_124_1 = var19;
                    stackOut_124_2 = var22;
                    stackOut_124_3 = -86;
                    stackOut_124_4 = var20;
                    stackIn_126_0 = stackOut_124_0;
                    stackIn_126_1 = stackOut_124_1;
                    stackIn_126_2 = stackOut_124_2;
                    stackIn_126_3 = stackOut_124_3;
                    stackIn_126_4 = stackOut_124_4;
                    stackIn_125_0 = stackOut_124_0;
                    stackIn_125_1 = stackOut_124_1;
                    stackIn_125_2 = stackOut_124_2;
                    stackIn_125_3 = stackOut_124_3;
                    stackIn_125_4 = stackOut_124_4;
                    if ((1 & var9) != 0) {
                      stackOut_126_0 = stackIn_126_0;
                      stackOut_126_1 = stackIn_126_1;
                      stackOut_126_2 = stackIn_126_2;
                      stackOut_126_3 = stackIn_126_3;
                      stackOut_126_4 = stackIn_126_4;
                      stackOut_126_5 = param7;
                      stackIn_127_0 = stackOut_126_0;
                      stackIn_127_1 = stackOut_126_1;
                      stackIn_127_2 = stackOut_126_2;
                      stackIn_127_3 = stackOut_126_3;
                      stackIn_127_4 = stackOut_126_4;
                      stackIn_127_5 = stackOut_126_5;
                      break L31;
                    } else {
                      stackOut_125_0 = stackIn_125_0;
                      stackOut_125_1 = stackIn_125_1;
                      stackOut_125_2 = stackIn_125_2;
                      stackOut_125_3 = stackIn_125_3;
                      stackOut_125_4 = stackIn_125_4;
                      stackOut_125_5 = param4;
                      stackIn_127_0 = stackOut_125_0;
                      stackIn_127_1 = stackOut_125_1;
                      stackIn_127_2 = stackOut_125_2;
                      stackIn_127_3 = stackOut_125_3;
                      stackIn_127_4 = stackOut_125_4;
                      stackIn_127_5 = stackOut_125_5;
                      break L31;
                    }
                  }
                  ar.a(stackIn_127_0, stackIn_127_1, stackIn_127_2, (byte) stackIn_127_3, stackIn_127_4, stackIn_127_5);
                  var19 = var21;
                  var20 = var22;
                  var9++;
                  param5 = param5 + param8;
                  continue L29;
                }
              }
            }
          } else {
            L32: {
              param6 = param6 - (int)(var16 * (long)var11 >> -984726512);
              param2 = param2 + (int)((long)var10 * var16 >> -993540784);
              param3 = param3 + (int)(var14 * (long)var10 >> -909106928);
              var9 = var9 + param5 / param8;
              param1 = param1 - (int)(var14 * (long)var11 >> 2133495696);
              param5 = param5 % param8;
              if (0 <= param5) {
                break L32;
              } else {
                var9--;
                param5 = param5 + param8;
                break L32;
              }
            }
            var18 = 1 + (int)Math.sqrt((double)((param6 - param2) * (param6 + -param2) + (-param3 + param1) * (param1 + -param3)));
            var19 = param3;
            var20 = param2;
            L33: while (true) {
              if (param5 >= var18) {
                L34: {
                  stackOut_115_0 = param1;
                  stackOut_115_1 = var19;
                  stackOut_115_2 = param6;
                  stackOut_115_3 = -128;
                  stackOut_115_4 = var20;
                  stackIn_117_0 = stackOut_115_0;
                  stackIn_117_1 = stackOut_115_1;
                  stackIn_117_2 = stackOut_115_2;
                  stackIn_117_3 = stackOut_115_3;
                  stackIn_117_4 = stackOut_115_4;
                  stackIn_116_0 = stackOut_115_0;
                  stackIn_116_1 = stackOut_115_1;
                  stackIn_116_2 = stackOut_115_2;
                  stackIn_116_3 = stackOut_115_3;
                  stackIn_116_4 = stackOut_115_4;
                  if (0 == (1 & var9)) {
                    stackOut_117_0 = stackIn_117_0;
                    stackOut_117_1 = stackIn_117_1;
                    stackOut_117_2 = stackIn_117_2;
                    stackOut_117_3 = stackIn_117_3;
                    stackOut_117_4 = stackIn_117_4;
                    stackOut_117_5 = param4;
                    stackIn_118_0 = stackOut_117_0;
                    stackIn_118_1 = stackOut_117_1;
                    stackIn_118_2 = stackOut_117_2;
                    stackIn_118_3 = stackOut_117_3;
                    stackIn_118_4 = stackOut_117_4;
                    stackIn_118_5 = stackOut_117_5;
                    break L34;
                  } else {
                    stackOut_116_0 = stackIn_116_0;
                    stackOut_116_1 = stackIn_116_1;
                    stackOut_116_2 = stackIn_116_2;
                    stackOut_116_3 = stackIn_116_3;
                    stackOut_116_4 = stackIn_116_4;
                    stackOut_116_5 = param7;
                    stackIn_118_0 = stackOut_116_0;
                    stackIn_118_1 = stackOut_116_1;
                    stackIn_118_2 = stackOut_116_2;
                    stackIn_118_3 = stackOut_116_3;
                    stackIn_118_4 = stackOut_116_4;
                    stackIn_118_5 = stackOut_116_5;
                    break L34;
                  }
                }
                ar.a(stackIn_118_0, stackIn_118_1, stackIn_118_2, (byte) stackIn_118_3, stackIn_118_4, stackIn_118_5);
                return;
              } else {
                L35: {
                  var21 = param5 * (-param3 + param1) / var18 + param3;
                  var22 = param2 - -(param5 * (-param2 + param6) / var18);
                  stackOut_111_0 = var21;
                  stackOut_111_1 = var19;
                  stackOut_111_2 = var22;
                  stackOut_111_3 = -86;
                  stackOut_111_4 = var20;
                  stackIn_113_0 = stackOut_111_0;
                  stackIn_113_1 = stackOut_111_1;
                  stackIn_113_2 = stackOut_111_2;
                  stackIn_113_3 = stackOut_111_3;
                  stackIn_113_4 = stackOut_111_4;
                  stackIn_112_0 = stackOut_111_0;
                  stackIn_112_1 = stackOut_111_1;
                  stackIn_112_2 = stackOut_111_2;
                  stackIn_112_3 = stackOut_111_3;
                  stackIn_112_4 = stackOut_111_4;
                  if ((1 & var9) != 0) {
                    stackOut_113_0 = stackIn_113_0;
                    stackOut_113_1 = stackIn_113_1;
                    stackOut_113_2 = stackIn_113_2;
                    stackOut_113_3 = stackIn_113_3;
                    stackOut_113_4 = stackIn_113_4;
                    stackOut_113_5 = param7;
                    stackIn_114_0 = stackOut_113_0;
                    stackIn_114_1 = stackOut_113_1;
                    stackIn_114_2 = stackOut_113_2;
                    stackIn_114_3 = stackOut_113_3;
                    stackIn_114_4 = stackOut_113_4;
                    stackIn_114_5 = stackOut_113_5;
                    break L35;
                  } else {
                    stackOut_112_0 = stackIn_112_0;
                    stackOut_112_1 = stackIn_112_1;
                    stackOut_112_2 = stackIn_112_2;
                    stackOut_112_3 = stackIn_112_3;
                    stackOut_112_4 = stackIn_112_4;
                    stackOut_112_5 = param4;
                    stackIn_114_0 = stackOut_112_0;
                    stackIn_114_1 = stackOut_112_1;
                    stackIn_114_2 = stackOut_112_2;
                    stackIn_114_3 = stackOut_112_3;
                    stackIn_114_4 = stackOut_112_4;
                    stackIn_114_5 = stackOut_112_5;
                    break L35;
                  }
                }
                ar.a(stackIn_114_0, stackIn_114_1, stackIn_114_2, (byte) stackIn_114_3, stackIn_114_4, stackIn_114_5);
                var19 = var21;
                var20 = var22;
                var9++;
                param5 = param5 + param8;
                continue L33;
              }
            }
          }
        } else {
          L36: {
            field_e = -59;
            var10 = 0;
            var11 = 0;
            var12 = gf.field_i << -1625449020;
            var13 = gf.field_l << -2008290620;
            if (param3 <= param1) {
              break L36;
            } else {
              var14_int = param3;
              param3 = param1;
              param1 = var14_int;
              var14_int = param2;
              param2 = param6;
              param6 = var14_int;
              param5 = -param5 + param8;
              break L36;
            }
          }
          L37: {
            if (param3 >= var13) {
              break L37;
            } else {
              if (var13 >= param1) {
                break L37;
              } else {
                var11 = (int)(65536L * (long)(param1 - var13) / (long)(-param3 + param1));
                break L37;
              }
            }
          }
          L38: {
            if (var12 <= param3) {
              break L38;
            } else {
              if (param1 > var12) {
                var10 = (int)(65536L * (long)(-param3 + var12) / (long)(-param3 + param1));
                break L38;
              } else {
                break L38;
              }
            }
          }
          L39: {
            var14 = (long)(param1 - param3);
            var16 = (long)(param6 - param2);
            param3 = param3 + (int)((long)var10 * var14 >> -875109296);
            param2 = param2 + (int)((long)var10 * var16 >> 49590224);
            param1 = param1 - (int)((long)var11 * var14 >> -912742256);
            param6 = param6 - (int)((long)var11 * var16 >> -1092948656);
            var13 = gf.field_f << -1625444604;
            var12 = gf.field_a << -380459548;
            var11 = 0;
            var10 = 0;
            if (param2 <= param6) {
              break L39;
            } else {
              var18 = param3;
              param3 = param1;
              param1 = var18;
              var18 = param2;
              param2 = param6;
              param6 = var18;
              param5 = param8 - param5;
              break L39;
            }
          }
          L40: {
            var14 = (long)(-param3 + param1);
            var16 = (long)(param6 + -param2);
            if (param2 >= var12) {
              break L40;
            } else {
              if (param6 > var12) {
                var10 = (int)((long)(var12 + -param2) * 65536L / (long)(param6 - param2));
                break L40;
              } else {
                break L40;
              }
            }
          }
          L41: {
            if (param2 >= var13) {
              break L41;
            } else {
              if (var13 < param6) {
                var11 = (int)((long)(param6 - var13) * 65536L / (long)(-param2 + param6));
                break L41;
              } else {
                break L41;
              }
            }
          }
          L42: {
            param6 = param6 - (int)(var16 * (long)var11 >> -984726512);
            param2 = param2 + (int)((long)var10 * var16 >> -993540784);
            param3 = param3 + (int)(var14 * (long)var10 >> -909106928);
            var9 = var9 + param5 / param8;
            param1 = param1 - (int)(var14 * (long)var11 >> 2133495696);
            param5 = param5 % param8;
            if (0 <= param5) {
              break L42;
            } else {
              var9--;
              param5 = param5 + param8;
              break L42;
            }
          }
          var18 = 1 + (int)Math.sqrt((double)((param6 - param2) * (param6 + -param2) + (-param3 + param1) * (param1 + -param3)));
          var19 = param3;
          var20 = param2;
          L43: while (true) {
            if (param5 >= var18) {
              L44: {
                stackOut_28_0 = param1;
                stackOut_28_1 = var19;
                stackOut_28_2 = param6;
                stackOut_28_3 = -128;
                stackOut_28_4 = var20;
                stackIn_30_0 = stackOut_28_0;
                stackIn_30_1 = stackOut_28_1;
                stackIn_30_2 = stackOut_28_2;
                stackIn_30_3 = stackOut_28_3;
                stackIn_30_4 = stackOut_28_4;
                stackIn_29_0 = stackOut_28_0;
                stackIn_29_1 = stackOut_28_1;
                stackIn_29_2 = stackOut_28_2;
                stackIn_29_3 = stackOut_28_3;
                stackIn_29_4 = stackOut_28_4;
                if (0 == (1 & var9)) {
                  stackOut_30_0 = stackIn_30_0;
                  stackOut_30_1 = stackIn_30_1;
                  stackOut_30_2 = stackIn_30_2;
                  stackOut_30_3 = stackIn_30_3;
                  stackOut_30_4 = stackIn_30_4;
                  stackOut_30_5 = param4;
                  stackIn_31_0 = stackOut_30_0;
                  stackIn_31_1 = stackOut_30_1;
                  stackIn_31_2 = stackOut_30_2;
                  stackIn_31_3 = stackOut_30_3;
                  stackIn_31_4 = stackOut_30_4;
                  stackIn_31_5 = stackOut_30_5;
                  break L44;
                } else {
                  stackOut_29_0 = stackIn_29_0;
                  stackOut_29_1 = stackIn_29_1;
                  stackOut_29_2 = stackIn_29_2;
                  stackOut_29_3 = stackIn_29_3;
                  stackOut_29_4 = stackIn_29_4;
                  stackOut_29_5 = param7;
                  stackIn_31_0 = stackOut_29_0;
                  stackIn_31_1 = stackOut_29_1;
                  stackIn_31_2 = stackOut_29_2;
                  stackIn_31_3 = stackOut_29_3;
                  stackIn_31_4 = stackOut_29_4;
                  stackIn_31_5 = stackOut_29_5;
                  break L44;
                }
              }
              ar.a(stackIn_31_0, stackIn_31_1, stackIn_31_2, (byte) stackIn_31_3, stackIn_31_4, stackIn_31_5);
              return;
            } else {
              L45: {
                var21 = param5 * (-param3 + param1) / var18 + param3;
                var22 = param2 - -(param5 * (-param2 + param6) / var18);
                stackOut_24_0 = var21;
                stackOut_24_1 = var19;
                stackOut_24_2 = var22;
                stackOut_24_3 = -86;
                stackOut_24_4 = var20;
                stackIn_26_0 = stackOut_24_0;
                stackIn_26_1 = stackOut_24_1;
                stackIn_26_2 = stackOut_24_2;
                stackIn_26_3 = stackOut_24_3;
                stackIn_26_4 = stackOut_24_4;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                stackIn_25_2 = stackOut_24_2;
                stackIn_25_3 = stackOut_24_3;
                stackIn_25_4 = stackOut_24_4;
                if ((1 & var9) != 0) {
                  stackOut_26_0 = stackIn_26_0;
                  stackOut_26_1 = stackIn_26_1;
                  stackOut_26_2 = stackIn_26_2;
                  stackOut_26_3 = stackIn_26_3;
                  stackOut_26_4 = stackIn_26_4;
                  stackOut_26_5 = param7;
                  stackIn_27_0 = stackOut_26_0;
                  stackIn_27_1 = stackOut_26_1;
                  stackIn_27_2 = stackOut_26_2;
                  stackIn_27_3 = stackOut_26_3;
                  stackIn_27_4 = stackOut_26_4;
                  stackIn_27_5 = stackOut_26_5;
                  break L45;
                } else {
                  stackOut_25_0 = stackIn_25_0;
                  stackOut_25_1 = stackIn_25_1;
                  stackOut_25_2 = stackIn_25_2;
                  stackOut_25_3 = stackIn_25_3;
                  stackOut_25_4 = stackIn_25_4;
                  stackOut_25_5 = param4;
                  stackIn_27_0 = stackOut_25_0;
                  stackIn_27_1 = stackOut_25_1;
                  stackIn_27_2 = stackOut_25_2;
                  stackIn_27_3 = stackOut_25_3;
                  stackIn_27_4 = stackOut_25_4;
                  stackIn_27_5 = stackOut_25_5;
                  break L45;
                }
              }
              ar.a(stackIn_27_0, stackIn_27_1, stackIn_27_2, (byte) stackIn_27_3, stackIn_27_4, stackIn_27_5);
              var19 = var21;
              var20 = var22;
              var9++;
              param5 = param5 + param8;
              continue L43;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "No options available";
        field_d = "You can spectate this game";
        field_b = "Connection lost - attempting to reconnect";
        field_e = 9;
    }
}
