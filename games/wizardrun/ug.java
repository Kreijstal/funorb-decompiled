/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug extends pl {
    int field_G;
    int field_O;
    int field_L;
    int field_J;
    static boolean field_Q;
    int field_K;
    static int field_H;
    static int[] field_I;
    int field_M;
    static String field_P;
    static String field_F;
    static long field_N;

    final static void a(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              sg.field_b = new o[6][];
              ok.field_e = new o[6][5][];
              bd.field_c = new o[6];
              ok.field_e[0][0] = pe.a("", mi.field_E, "monster00", 110);
              ok.field_e[0][1] = pe.a("", mi.field_E, "monster01", 125);
              ok.field_e[0][2] = pe.a("", mi.field_E, "monster02", 121);
              ok.field_e[0][4] = pe.a("", mi.field_E, "monster04", 94);
              sg.field_b[0] = pe.a("", mi.field_E, "level1blocks", 110);
              bd.field_c[0] = vg.a(15, "level1background", mi.field_E, "");
              bd.field_c[1] = vg.a(15, "level2background", mi.field_E, "");
              sg.field_b[1] = pe.a("", mi.field_E, "level2blocks", 122);
              ok.field_e[1][0] = pe.a("", mi.field_E, "monster10", 97);
              ok.field_e[1][1] = pe.a("", mi.field_E, "monster11", 121);
              ok.field_e[1][2] = pe.a("", mi.field_E, "monster12", 96);
              ok.field_e[1][3] = pe.a("", mi.field_E, "monster13", 115);
              ok.field_e[1][4] = pe.a("", mi.field_E, "monster14", 112);
              bd.field_c[2] = vg.a(15, "level3background", mi.field_E, "");
              sg.field_b[2] = pe.a("", mi.field_E, "level3blocks", 102);
              ok.field_e[2][0] = pe.a("", mi.field_E, "monster20", 89);
              ok.field_e[2][1] = pe.a("", mi.field_E, "monster21", 124);
              ok.field_e[2][2] = pe.a("", mi.field_E, "monster22", 118);
              ok.field_e[2][3] = pe.a("", mi.field_E, "monster23", 97);
              ok.field_e[2][4] = pe.a("", mi.field_E, "monster24", 119);
              bd.field_c[3] = vg.a(15, "level4background", mi.field_E, "");
              sg.field_b[3] = pe.a("", mi.field_E, "level4blocks", 90);
              ok.field_e[3][0] = pe.a("", mi.field_E, "monster30", 111);
              ok.field_e[3][1] = pe.a("", mi.field_E, "monster31", 104);
              ok.field_e[3][2] = pe.a("", mi.field_E, "monster32", 118);
              ok.field_e[3][4] = pe.a("", mi.field_E, "monster34", 105);
              bd.field_c[4] = vg.a(15, "level5background", mi.field_E, "");
              sg.field_b[4] = pe.a("", mi.field_E, "level5blocks", 92);
              ok.field_e[4][0] = pe.a("", mi.field_E, "monster40", 125);
              if (param0 <= -27) {
                break L0;
              } else {
                ug.a(false, (byte) -19, 6, -5, (le) null);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          ok.field_e[4][1] = pe.a("", mi.field_E, "monster41", 91);
          ok.field_e[4][2] = pe.a("", mi.field_E, "monster42", 119);
          ok.field_e[4][3] = pe.a("", mi.field_E, "monster43", 121);
          ok.field_e[4][4] = pe.a("", mi.field_E, "monster44", 114);
          bd.field_c[5] = vg.a(15, "level6background", mi.field_E, "");
          sg.field_b[5] = pe.a("", mi.field_E, "level6blocks", 93);
          ok.field_e[5][0] = pe.a("", mi.field_E, "monster50", 107);
          ok.field_e[5][1] = pe.a("", mi.field_E, "monster52", 115);
          ok.field_e[5][2] = pe.a("", mi.field_E, "monster51", 90);
          ok.field_e[5][3] = pe.a("", mi.field_E, "monster53", 98);
          ok.field_e[5][4] = pe.a("", mi.field_E, "monster54", 107);
          hh.field_eb = pe.a("", mi.field_E, "monster55", 110);
          h.field_j = pe.a("", mi.field_E, "monster56", 125);
        }
    }

    final boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, ub param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        double var11 = 0.0;
        int var13 = 0;
        int stackIn_8_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int stackOut_7_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_23_0 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = wizardrun.field_H;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var8_int = 11 / ((param1 - 12) / 36);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (super.a(param0, (byte) 69, param2, param3, param4, param5, param6)) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var9 = -param0 + -((ug) this).field_o + (-((ug) this).field_J + param2);
                        var10 = param5 + (-((ug) this).field_L + -param3) + -((ug) this).field_l;
                        if ((var9 * var9 + var10 * var10 ^ -1) <= (((ug) this).field_G * ((ug) this).field_G ^ -1)) {
                            statePc = 21;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var11 = Math.atan2((double)var10, (double)var9) - fb.field_b;
                        if (var11 >= 0.0) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var11 = var11 - 3.141592653589793 / (double)((ug) this).field_O;
                        stackOut_7_0 = var13;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (stackIn_8_0 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var11 <= 0.0) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var11 = var11 + 3.141592653589793 / (double)((ug) this).field_O;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        ((ug) this).field_M = (int)(var11 * (double)((ug) this).field_O / 6.283185307179586);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if ((((ug) this).field_M ^ -1) > (((ug) this).field_O ^ -1)) {
                            statePc = 19;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        ((ug) this).field_M = ((ug) this).field_M - ((ug) this).field_O;
                        if (var13 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var13 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (((ug) this).field_M >= 0) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        ((ug) this).field_M = ((ug) this).field_M + ((ug) this).field_O;
                        if (var13 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = 1;
                        stackIn_22_0 = stackOut_21_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    return stackIn_22_0 != 0;
                }
                case 23: {
                    try {
                        stackOut_23_0 = 0;
                        stackIn_24_0 = stackOut_23_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 24: {
                    return stackIn_24_0 != 0;
                }
                case 25: {
                    var8 = (RuntimeException) (Object) caughtException;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    try {
                        stackOut_26_0 = (RuntimeException) var8;
                        stackOut_26_1 = new StringBuilder().append("ug.C(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
                        stackIn_29_0 = stackOut_26_0;
                        stackIn_29_1 = stackOut_26_1;
                        stackIn_27_0 = stackOut_26_0;
                        stackIn_27_1 = stackOut_26_1;
                        if (param6 == null) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
                        stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
                        stackOut_27_2 = "{...}";
                        stackIn_30_0 = stackOut_27_0;
                        stackIn_30_1 = stackOut_27_1;
                        stackIn_30_2 = stackOut_27_2;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 28: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 29: {
                    stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
                    stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
                    stackOut_29_2 = "null";
                    stackIn_30_0 = stackOut_29_0;
                    stackIn_30_1 = stackOut_29_1;
                    stackIn_30_2 = stackOut_29_2;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    throw bd.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(boolean param0, byte param1, int param2, int param3, le param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
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
        Object stackIn_4_0 = null;
        boolean stackIn_14_0 = false;
        int stackIn_35_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        le stackIn_49_0 = null;
        int stackIn_58_0 = 0;
        Object stackIn_64_0 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        Object stackOut_3_0 = null;
        boolean stackOut_13_0 = false;
        int stackOut_32_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        le stackOut_48_0 = null;
        byte stackOut_57_0 = 0;
        Object stackOut_63_0 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = wizardrun.field_H;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = dj.a(false, 3 * (param2 + -param3));
                        var6 = 3 * param3;
                        var7 = -10 + var5_int;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        vj.b(0);
                        if (0 >= param4.field_n) {
                            statePc = 10;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = null;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0 == (Object) (Object) param4.field_x) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        of.c(45);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        kg.field_c = 0;
                        var8 = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if ((param4.field_N ^ -1) >= (var8 ^ -1)) {
                            statePc = 57;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var9 = param4.field_p[var8];
                        var10 = param4.field_C[var8];
                        var11 = param4.field_I[var8];
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = param0;
                        stackIn_58_0 = stackOut_13_0 ? 1 : 0;
                        stackIn_14_0 = stackOut_13_0;
                        if (var19 != 0) {
                            statePc = 58;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (stackIn_14_0) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var12 = nl.field_A[var9];
                        var13 = d.field_c[var9];
                        var14 = -var12 + nl.field_A[var10];
                        var15 = -var12 + nl.field_A[var11];
                        var16 = -var13 + d.field_c[var10];
                        var17 = d.field_c[var11] + -var13;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var14 * var17 - var16 * var15 < 0) {
                            statePc = 23;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var19 == 0) {
                            statePc = 56;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var12 = dl.field_a[var9];
                        if (2147483647 == (var12 ^ -1)) {
                            statePc = 56;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var13 = dl.field_a[var10];
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (-2147483648 != var13) {
                            statePc = 29;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var19 == 0) {
                            statePc = 56;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var14 = dl.field_a[var11];
                        if (-2147483648 == var14) {
                            statePc = 56;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var15 = var14 + (var13 + var12) + -var6;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if ((var7 ^ -1) <= -1) {
                            statePc = 34;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackOut_32_0 = var15 << -var7;
                        stackIn_35_0 = stackOut_32_0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackOut_34_0 = var15 >> var7;
                        stackIn_35_0 = stackOut_34_0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var16 = -stackIn_35_0 + (id.field_b.length + -1);
                        var17 = id.field_b[var16];
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if ((var17 >> -534240348 ^ -1) == -1) {
                            statePc = 45;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var16--;
                        stackOut_37_0 = var16 ^ -1;
                        stackOut_37_1 = -1;
                        stackIn_46_0 = stackOut_37_0;
                        stackIn_46_1 = stackOut_37_1;
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        if (var19 != 0) {
                            statePc = 46;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (stackIn_38_0 <= stackIn_38_1) {
                            statePc = 44;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        System.err.println("Out of range!");
                        if (var19 == 0) {
                            statePc = 56;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var17 = id.field_b[var16];
                        if (var19 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackOut_45_0 = var16 << -488067580;
                        stackOut_45_1 = var17;
                        stackIn_46_0 = stackOut_45_0;
                        stackIn_46_1 = stackOut_45_1;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var18 = stackIn_46_0 + stackIn_46_1;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        cb.field_e[var18] = var8;
                        id.field_b[var16] = var17 - -1;
                        if (0 >= param4.field_n) {
                            statePc = 55;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackOut_48_0 = (le) param4;
                        stackIn_49_0 = stackOut_48_0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (stackIn_49_0.field_x != null) {
                            statePc = 54;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        t.field_a[param4.field_x[var8]] = t.field_a[param4.field_x[var8]] + 1;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        kg.field_c = kg.field_c + 1;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var8++;
                        if (var19 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        stackOut_57_0 = param1;
                        stackIn_58_0 = stackOut_57_0;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (stackIn_58_0 == 11) {
                            statePc = 62;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        field_H = -15;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if ((param4.field_n ^ -1) >= -1) {
                            statePc = 83;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        stackOut_63_0 = null;
                        stackIn_64_0 = stackOut_63_0;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (stackIn_64_0 != (Object) (Object) param4.field_x) {
                            statePc = 69;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var8 = 0;
                        var9 = 0;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (t.field_a.length <= var9) {
                            statePc = 83;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var10 = t.field_a[var9];
                        t.field_a[var9] = var8;
                        var8 = var8 + var10;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var9++;
                        if (var19 != 0) {
                            statePc = 83;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (var19 == 0) {
                            statePc = 70;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 77: {
                    var5 = (RuntimeException) (Object) caughtException;
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    try {
                        stackOut_78_0 = (RuntimeException) var5;
                        stackOut_78_1 = new StringBuilder().append("ug.FA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
                        stackIn_81_0 = stackOut_78_0;
                        stackIn_81_1 = stackOut_78_1;
                        stackIn_79_0 = stackOut_78_0;
                        stackIn_79_1 = stackOut_78_1;
                        if (param4 == null) {
                            statePc = 81;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
                        stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
                        stackOut_79_2 = "{...}";
                        stackIn_82_0 = stackOut_79_0;
                        stackIn_82_1 = stackOut_79_1;
                        stackIn_82_2 = stackOut_79_2;
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 80: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 81: {
                    stackOut_81_0 = (RuntimeException) (Object) stackIn_81_0;
                    stackOut_81_1 = (StringBuilder) (Object) stackIn_81_1;
                    stackOut_81_2 = "null";
                    stackIn_82_0 = stackOut_81_0;
                    stackIn_82_1 = stackOut_81_1;
                    stackIn_82_2 = stackOut_81_2;
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    throw bd.a((Throwable) (Object) stackIn_82_0, stackIn_82_2 + 41);
                }
                case 83: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void d(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              if (param0 == -13542) {
                break L0;
              } else {
                ug.d(-125);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          field_F = null;
          field_I = null;
          field_P = null;
        }
    }

    final static void a(int param0, boolean param1, int param2, String param3, java.awt.Color param4) {
        try {
            java.awt.Graphics var5 = null;
            Exception var5_ref = null;
            RuntimeException var5_ref2 = null;
            Exception var6 = null;
            java.awt.Graphics var6_ref = null;
            int var7 = 0;
            int var8 = 0;
            RuntimeException stackIn_34_0 = null;
            StringBuilder stackIn_34_1 = null;
            RuntimeException stackIn_36_0 = null;
            StringBuilder stackIn_36_1 = null;
            RuntimeException stackIn_37_0 = null;
            StringBuilder stackIn_37_1 = null;
            String stackIn_37_2 = null;
            RuntimeException stackIn_38_0 = null;
            StringBuilder stackIn_38_1 = null;
            RuntimeException stackIn_40_0 = null;
            StringBuilder stackIn_40_1 = null;
            RuntimeException stackIn_41_0 = null;
            StringBuilder stackIn_41_1 = null;
            String stackIn_41_2 = null;
            RuntimeException stackOut_33_0 = null;
            StringBuilder stackOut_33_1 = null;
            RuntimeException stackOut_34_0 = null;
            StringBuilder stackOut_34_1 = null;
            String stackOut_34_2 = null;
            RuntimeException stackOut_36_0 = null;
            StringBuilder stackOut_36_1 = null;
            String stackOut_36_2 = null;
            RuntimeException stackOut_37_0 = null;
            StringBuilder stackOut_37_1 = null;
            RuntimeException stackOut_38_0 = null;
            StringBuilder stackOut_38_1 = null;
            String stackOut_38_2 = null;
            RuntimeException stackOut_40_0 = null;
            StringBuilder stackOut_40_1 = null;
            String stackOut_40_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var5 = wizardrun.field_G.getGraphics();
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = (stateCaught_0 instanceof Exception ? 30 : 32);
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            if (null != mh.field_ob) {
                                statePc = 5;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof Exception ? 4 : 32);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            mh.field_ob = new java.awt.Font("Helvetica", 1, 13);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof Exception ? 4 : 32);
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = (stateCaught_3 instanceof Exception ? 30 : 32);
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = (stateCaught_4 instanceof Exception ? 30 : 32);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (param1) {
                                statePc = 8;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof Exception ? 7 : 32);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof Exception ? 7 : 32);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof Exception ? 30 : 32);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var5.setColor(java.awt.Color.black);
                            var5.fillRect(0, 0, rg.field_R, rg.field_P);
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof Exception ? 30 : 32);
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (null == param4) {
                                statePc = 12;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = (stateCaught_9 instanceof Exception ? 11 : 32);
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof Exception ? 11 : 32);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof Exception ? 30 : 32);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            param4 = new java.awt.Color(140, 17, 17);
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof Exception ? 30 : 32);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (hg.field_b == null) {
                                statePc = 16;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof Exception ? 24 : 32);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof Exception ? 24 : 32);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            hg.field_b = wizardrun.field_G.createImage(304, 34);
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof Exception ? 24 : 32);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var6_ref = hg.field_b.getGraphics();
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof Exception ? 24 : 32);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var6_ref.setColor(param4);
                            if (param0 == 10487) {
                                statePc = 22;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof Exception ? 21 : 32);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            ug.a(106, false, -93, (String) null, (java.awt.Color) null);
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof Exception ? 21 : 32);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof Exception ? 24 : 32);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof Exception ? 24 : 32);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var6_ref.drawRect(0, 0, 303, 33);
                            var6_ref.fillRect(2, 2, param2 * 3, 30);
                            var6_ref.setColor(java.awt.Color.black);
                            var6_ref.drawRect(1, 1, 301, 31);
                            var6_ref.fillRect(param2 * 3 + 2, 2, -(param2 * 3) + 300, 30);
                            var6_ref.setFont(mh.field_ob);
                            var6_ref.setColor(java.awt.Color.white);
                            var6_ref.drawString(param3, (-(6 * param3.length()) + 304) / 2, 22);
                            boolean discarded$1 = var5.drawImage(hg.field_b, rg.field_R / 2 + -152, -18 + rg.field_P / 2, (java.awt.image.ImageObserver) null);
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof Exception ? 24 : 32);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof Exception ? 30 : 32);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var6 = (Exception) (Object) caughtException;
                            var7 = rg.field_R / 2 - 152;
                            var8 = -18 + rg.field_P / 2;
                            var5.setColor(param4);
                            var5.drawRect(var7, var8, 303, 33);
                            var5.fillRect(2 + var7, 2 + var8, param2 * 3, 30);
                            var5.setColor(java.awt.Color.black);
                            var5.drawRect(var7 + 1, 1 + var8, 301, 31);
                            var5.fillRect(var7 - -2 - -(3 * param2), 2 + var8, -(3 * param2) + 300, 30);
                            var5.setFont(mh.field_ob);
                            var5.setColor(java.awt.Color.white);
                            var5.drawString(param3, var7 + (304 - param3.length() * 6) / 2, 22 + var8);
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof Exception ? 30 : 32);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (gi.field_e != null) {
                                statePc = 28;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof Exception ? 27 : 32);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof Exception ? 27 : 32);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof Exception ? 30 : 32);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var5.setFont(mh.field_ob);
                            var5.setColor(java.awt.Color.white);
                            var5.drawString(gi.field_e, rg.field_R / 2 + -(gi.field_e.length() * 6 / 2), rg.field_P / 2 + -26);
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof Exception ? 30 : 32);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var5_ref = (Exception) (Object) caughtException;
                            wizardrun.field_G.repaint();
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        var5_ref2 = (RuntimeException) (Object) caughtException;
                        statePc = 33;
                        continue stateLoop;
                    }
                    case 33: {
                        try {
                            stackOut_33_0 = (RuntimeException) var5_ref2;
                            stackOut_33_1 = new StringBuilder().append("ug.CA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
                            stackIn_36_0 = stackOut_33_0;
                            stackIn_36_1 = stackOut_33_1;
                            stackIn_34_0 = stackOut_33_0;
                            stackIn_34_1 = stackOut_33_1;
                            if (param3 == null) {
                                statePc = 36;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
                            stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
                            stackOut_34_2 = "{...}";
                            stackIn_37_0 = stackOut_34_0;
                            stackIn_37_1 = stackOut_34_1;
                            stackIn_37_2 = stackOut_34_2;
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        throw (RuntimeException) (Object) caughtException;
                    }
                    case 36: {
                        stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
                        stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
                        stackOut_36_2 = "null";
                        stackIn_37_0 = stackOut_36_0;
                        stackIn_37_1 = stackOut_36_1;
                        stackIn_37_2 = stackOut_36_2;
                        statePc = 37;
                        continue stateLoop;
                    }
                    case 37: {
                        try {
                            stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
                            stackOut_37_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(44);
                            stackIn_40_0 = stackOut_37_0;
                            stackIn_40_1 = stackOut_37_1;
                            stackIn_38_0 = stackOut_37_0;
                            stackIn_38_1 = stackOut_37_1;
                            if (param4 == null) {
                                statePc = 40;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
                            stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
                            stackOut_38_2 = "{...}";
                            stackIn_41_0 = stackOut_38_0;
                            stackIn_41_1 = stackOut_38_1;
                            stackIn_41_2 = stackOut_38_2;
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        throw (RuntimeException) (Object) caughtException;
                    }
                    case 40: {
                        stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
                        stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
                        stackOut_40_2 = "null";
                        stackIn_41_0 = stackOut_40_0;
                        stackIn_41_1 = stackOut_40_1;
                        stackIn_41_2 = stackOut_40_2;
                        statePc = 41;
                        continue stateLoop;
                    }
                    case 41: {
                        throw bd.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + 41);
                    }
                    case 42: {
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

    private ug() throws Throwable {
        RuntimeException var1 = null;
        int statePc = 1;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 1: {
                    try {
                        throw new Error();
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 2: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw bd.a((Throwable) (Object) var1, "ug.<init>()");
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Q = false;
        field_P = "the health bar down to nothing.";
        field_F = "Password is valid";
    }
}
