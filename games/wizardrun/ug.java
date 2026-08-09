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
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
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
                break L1;
              } else {
                ug.a(false, (byte) -19, 6, -5, (le) null);
                break L1;
              }
            }
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var1), "ug.EA(" + param0 + ')');
        }
    }

    final boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, ub param6) {
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        double var11 = 0.0;
        int var13 = 0;
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
                        if (super.a(param0, (byte) 69, param2, param3, param4, param5, param6)) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var9 = -param0 + -this.field_o + (-this.field_J + param2);
                        var10 = param5 + (-this.field_L + -param3) + -this.field_l;
                        if ((var9 * var9 + var10 * var10 ^ -1) <= (this.field_G * this.field_G ^ -1)) {
                            statePc = 19;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var11 = Math.atan2((double)var10, (double)var9) - fb.field_b;
                        if (var11 >= 0.0) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var11 = var11 - 3.141592653589793 / (double)this.field_O;
                        if (var13 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var11 <= 0.0) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var11 = var11 + 3.141592653589793 / (double)this.field_O;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        this.field_M = (int)(var11 * (double)this.field_O / 6.283185307179586);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if ((this.field_M ^ -1) > (this.field_O ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        this.field_M = this.field_M - this.field_O;
                        if (var13 != 0) {
                            statePc = 19;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var13 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (this.field_M >= 0) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        this.field_M = this.field_M + this.field_O;
                        if (var13 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_20_0 = 1;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 20: {
                    return stackIn_20_0 != 0;
                }
                case 21: {
                    try {
                        stackIn_22_0 = 0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 22: {
                    return stackIn_22_0 != 0;
                }
                case 23: {
                    var8 = (RuntimeException) ((Object) caughtException);
                    stackIn_26_0 = (RuntimeException) (var8);
                    stackIn_24_0 = stackIn_26_0;
                    stackIn_26_1 = new StringBuilder().append("ug.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
                    stackIn_24_1 = stackIn_26_1;
                    if (param6 == null) {
                        statePc = 26;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    stackIn_27_0 = (RuntimeException) ((Object) stackIn_24_0);
                    stackIn_27_1 = (StringBuilder) ((Object) stackIn_24_1);
                    stackIn_27_2 = "{...}";
                    statePc = 27;
                    continue stateLoop;
                }
                case 26: {
                    stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
                    stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
                    stackIn_27_2 = "null";
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    throw bd.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(boolean param0, byte param1, int param2, int param3, le param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        boolean stackOut_9_0;
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
                    var19 = wizardrun.field_H;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = dj.a(false, 3 * (param2 + -param3));
                        var6 = 3 * param3;
                        var7 = -10 + var5_int;
                        vj.b(0);
                        if (0 >= param4.field_n) {
                            statePc = 7;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (null == param4.field_x) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        of.c(45);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        kg.field_c = 0;
                        var8 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((param4.field_N ^ -1) >= (var8 ^ -1)) {
                            statePc = 48;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var9 = param4.field_p[var8];
                        var10 = param4.field_C[var8];
                        var11 = param4.field_I[var8];
                        stackOut_9_0 = param0;
                        stackIn_49_0 = stackOut_9_0 ? 1 : 0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var19 != 0) {
                            statePc = 49;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var12 = nl.field_A[var9];
                        var13 = d.field_c[var9];
                        var14 = -var12 + nl.field_A[var10];
                        var15 = -var12 + nl.field_A[var11];
                        var16 = -var13 + d.field_c[var10];
                        var17 = d.field_c[var11] + -var13;
                        if (var14 * var17 - var16 * var15 < 0) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 65;
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
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var12 = dl.field_a[var9];
                        if (2147483647 == (var12 ^ -1)) {
                            statePc = 47;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var13 = dl.field_a[var10];
                        if (-2147483648 != var13) {
                            statePc = 23;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var19 == 0) {
                            statePc = 47;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var14 = dl.field_a[var11];
                        if (-2147483648 == var14) {
                            statePc = 47;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var15 = var14 + (var13 + var12) + -var6;
                        if ((var7 ^ -1) <= -1) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_28_0 = var15 << -var7;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackIn_28_0 = var15 >> var7;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var16 = -stackIn_28_0 + (id.field_b.length + -1);
                        var17 = id.field_b[var16];
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if ((var17 >> -534240348 ^ -1) == -1) {
                            statePc = 38;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var16--;
                        stackIn_39_0 = var16 ^ -1;
                        stackIn_31_0 = stackIn_39_0;
                        stackIn_39_1 = -1;
                        stackIn_31_1 = stackIn_39_1;
                        if (var19 != 0) {
                            statePc = 39;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (stackIn_31_0 <= stackIn_31_1) {
                            statePc = 37;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 65;
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
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var17 = id.field_b[var16];
                        if (var19 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackIn_39_0 = var16 << -488067580;
                        stackIn_39_1 = var17;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var18 = stackIn_39_0 + stackIn_39_1;
                        cb.field_e[var18] = var8;
                        id.field_b[var16] = var17 - -1;
                        if (0 >= param4.field_n) {
                            statePc = 46;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (param4.field_x != null) {
                            statePc = 45;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        dupTemp$0 = param4.field_x[var8];
                        t.field_a[dupTemp$0] = t.field_a[dupTemp$0] + 1;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        kg.field_c = kg.field_c + 1;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var8++;
                        if (var19 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackIn_49_0 = param1;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (stackIn_49_0 == 11) {
                            statePc = 52;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        field_H = -15;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if ((param4.field_n ^ -1) >= -1) {
                            statePc = 70;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (null != param4.field_x) {
                            statePc = 58;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var8 = 0;
                        var9 = 0;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (t.field_a.length <= var9) {
                            statePc = 70;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var10 = t.field_a[var9];
                        t.field_a[var9] = var8;
                        var8 = var8 + var10;
                        var9++;
                        if (var19 != 0) {
                            statePc = 70;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (var19 == 0) {
                            statePc = 59;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 65: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_68_0 = (RuntimeException) (var5);
                    stackIn_66_0 = stackIn_68_0;
                    stackIn_68_1 = new StringBuilder().append("ug.FA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
                    stackIn_66_1 = stackIn_68_1;
                    if (param4 == null) {
                        statePc = 68;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    stackIn_69_0 = (RuntimeException) ((Object) stackIn_66_0);
                    stackIn_69_1 = (StringBuilder) ((Object) stackIn_66_1);
                    stackIn_69_2 = "{...}";
                    statePc = 69;
                    continue stateLoop;
                }
                case 68: {
                    stackIn_69_0 = (RuntimeException) ((Object) stackIn_68_0);
                    stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
                    stackIn_69_2 = "null";
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    throw bd.a((Throwable) ((Object) stackIn_69_0), stackIn_69_2 + ')');
                }
                case 70: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void d(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              if (param0 == -13542) {
                break L1;
              } else {
                ug.d(-125);
                break L1;
              }
            }
            field_F = null;
            field_I = null;
            field_P = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var1), "ug.DA(" + param0 + ')');
        }
    }

    final static void a(int param0, boolean param1, int param2, String param3, java.awt.Color param4) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_35_1 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        Throwable decompiledCaughtException = null;
        java.awt.Graphics var5 = null;
        Exception var5_ref = null;
        RuntimeException var5_ref2 = null;
        java.awt.Graphics var6 = null;
        Exception var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var5 = wizardrun.field_G.getGraphics();
                  if (null != mh.field_ob) {
                    break L2;
                  } else {
                    mh.field_ob = new java.awt.Font("Helvetica", 1, 13);
                    break L2;
                  }
                }
                L3: {
                  if (param1) {
                    var5.setColor(java.awt.Color.black);
                    var5.fillRect(0, 0, rg.field_R, rg.field_P);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (null == param4) {
                    param4 = new java.awt.Color(140, 17, 17);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                try {
                  L5: {
                    L6: {
                      if (hg.field_b == null) {
                        hg.field_b = wizardrun.field_G.createImage(304, 34);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      var6 = hg.field_b.getGraphics();
                      var6.setColor(param4);
                      if (param0 == 10487) {
                        break L7;
                      } else {
                        ug.a(106, false, -93, (String) null, (java.awt.Color) null);
                        break L7;
                      }
                    }
                    var6.drawRect(0, 0, 303, 33);
                    var6.fillRect(2, 2, param2 * 3, 30);
                    var6.setColor(java.awt.Color.black);
                    var6.drawRect(1, 1, 301, 31);
                    var6.fillRect(param2 * 3 + 2, 2, -(param2 * 3) + 300, 30);
                    var6.setFont(mh.field_ob);
                    var6.setColor(java.awt.Color.white);
                    var6.drawString(param3, (-(6 * param3.length()) + 304) / 2, 22);
                    var5.drawImage(hg.field_b, rg.field_R / 2 + -152, -18 + rg.field_P / 2, (java.awt.image.ImageObserver) null);
                    break L5;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L8: {
                    var6_ref = (Exception) (Object) decompiledCaughtException;
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
                    break L8;
                  }
                }
                L9: {
                  if (gi.field_e != null) {
                    var5.setFont(mh.field_ob);
                    var5.setColor(java.awt.Color.white);
                    var5.drawString(gi.field_e, rg.field_R / 2 + -(gi.field_e.length() * 6 / 2), rg.field_P / 2 + -26);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L10: {
                var5_ref = (Exception) (Object) decompiledCaughtException;
                wizardrun.field_G.repaint();
                break L10;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L11: {
            var5_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var5_ref2);

            stackIn_31_1 = new StringBuilder().append("ug.CA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L11;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');

            if (param4 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L12;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L12;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_32_0), stackIn_36_2 + ')');
        }
    }

    private ug() throws Throwable {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          throw new Error();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var1), "ug.<init>()");
        }
    }

    static {
        field_Q = false;
        field_P = "the health bar down to nothing.";
        field_F = "Password is valid";
    }
}
