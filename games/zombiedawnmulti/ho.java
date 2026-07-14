/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ho extends nc {
    private int field_o;
    private int field_r;
    static String field_p;
    static int field_q;
    private int field_n;
    static int field_m;
    static int field_l;
    static int field_s;

    final int a(byte param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        try {
          try {
            L0: {
              if (param0 == -118) {
                break L0;
              } else {
                field_l = -12;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = ((ho) this).field_o;
          stackIn_5_0 = stackOut_4_0;
        }
        return 0;
    }

    final static void a(byte param0, fh param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        oq.field_u = param1.field_i.field_k;
                        dl.a(-91);
                        if (param0 < -121) {
                            statePc = 9;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        ho.e(-95);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        stackOut_4_0 = (RuntimeException) runtimeException;
                        stackOut_4_1 = new StringBuilder().append("ho.A(").append(param0).append(44);
                        stackIn_7_0 = stackOut_4_0;
                        stackIn_7_1 = stackOut_4_1;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
                        if (param1 == null) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                        stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                        stackOut_5_2 = "{...}";
                        stackIn_8_0 = stackOut_5_0;
                        stackIn_8_1 = stackOut_5_1;
                        stackIn_8_2 = stackOut_5_2;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 7: {
                    stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                    stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                    stackOut_7_2 = "null";
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    stackIn_8_2 = stackOut_7_2;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    throw fa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
                }
                case 9: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(md param0, int param1, int param2, boolean param3, int param4) {
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
        md stackIn_8_0 = null;
        boolean stackIn_18_0 = false;
        int stackIn_38_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        md stackIn_52_0 = null;
        int stackIn_61_0 = 0;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        md stackOut_7_0 = null;
        boolean stackOut_17_0 = false;
        int stackOut_35_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        md stackOut_51_0 = null;
        int stackOut_60_0 = 0;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = mb.a((byte) -31, 3 * (-param2 + param1));
                        var6 = 3 * param2;
                        dd.a((byte) 8);
                        var7 = var5_int + -10;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param4 == 16634) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        field_q = 42;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (-1 <= (param0.field_m ^ -1)) {
                            statePc = 14;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = (md) param0;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (stackIn_8_0.field_z == null) {
                            statePc = 14;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        kq.a(0);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        tf.field_Eb = 0;
                        var8 = 0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (param0.field_B <= var8) {
                            statePc = 60;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var9 = param0.field_y[var8];
                        var10 = param0.field_L[var8];
                        var11 = param0.field_H[var8];
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackOut_17_0 = param3;
                        stackIn_61_0 = stackOut_17_0 ? 1 : 0;
                        stackIn_18_0 = stackOut_17_0;
                        if (var19 != 0) {
                            statePc = 61;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (!stackIn_18_0) {
                            statePc = 26;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var12 = lo.field_j[var9];
                        var13 = jk.field_k[var9];
                        var14 = lo.field_j[var10] + -var12;
                        var15 = lo.field_j[var11] - var12;
                        var16 = jk.field_k[var10] - var13;
                        var17 = -var13 + jk.field_k[var11];
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (0 > var14 * var17 - var16 * var15) {
                            statePc = 26;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var19 == 0) {
                            statePc = 59;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var12 = hl.field_f[var9];
                        if (-2147483648 == var12) {
                            statePc = 59;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var13 = hl.field_f[var10];
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (-2147483648 != var13) {
                            statePc = 32;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var19 == 0) {
                            statePc = 59;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var14 = hl.field_f[var11];
                        if ((var14 ^ -1) == 2147483647) {
                            statePc = 59;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var15 = var14 + var13 + var12 - var6;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (var7 >= 0) {
                            statePc = 37;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackOut_35_0 = var15 << -var7;
                        stackIn_38_0 = stackOut_35_0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackOut_37_0 = var15 >> var7;
                        stackIn_38_0 = stackOut_37_0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var16 = -stackIn_38_0 + hl.field_e.length + -1;
                        var17 = hl.field_e[var16];
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (0 == var17 >> 2146665476) {
                            statePc = 48;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var16--;
                        stackOut_40_0 = -1;
                        stackOut_40_1 = var16 ^ -1;
                        stackIn_49_0 = stackOut_40_0;
                        stackIn_49_1 = stackOut_40_1;
                        stackIn_41_0 = stackOut_40_0;
                        stackIn_41_1 = stackOut_40_1;
                        if (var19 != 0) {
                            statePc = 49;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (stackIn_41_0 >= stackIn_41_1) {
                            statePc = 47;
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
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        System.err.println("Out of range!");
                        if (var19 == 0) {
                            statePc = 59;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var17 = hl.field_e[var16];
                        if (var19 == 0) {
                            statePc = 39;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackOut_48_0 = var17;
                        stackOut_48_1 = var16 << -1452760860;
                        stackIn_49_0 = stackOut_48_0;
                        stackIn_49_1 = stackOut_48_1;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var18 = stackIn_49_0 + stackIn_49_1;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        ah.field_f[var18] = var8;
                        hl.field_e[var16] = var17 - -1;
                        if (-1 <= (param0.field_m ^ -1)) {
                            statePc = 58;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackOut_51_0 = (md) param0;
                        stackIn_52_0 = stackOut_51_0;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (stackIn_52_0.field_z == null) {
                            statePc = 58;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        nn.field_c[param0.field_z[var8]] = nn.field_c[param0.field_z[var8]] + 1;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        tf.field_Eb = tf.field_Eb + 1;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var8++;
                        if (var19 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        stackOut_60_0 = param0.field_m ^ -1;
                        stackIn_61_0 = stackOut_60_0;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (stackIn_61_0 >= -1) {
                            statePc = 79;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (param0.field_z == null) {
                            statePc = 79;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var8 = 0;
                        var9 = 0;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if ((nn.field_c.length ^ -1) >= (var9 ^ -1)) {
                            statePc = 79;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var10 = nn.field_c[var9];
                        nn.field_c[var9] = var8;
                        var8 = var8 + var10;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var9++;
                        if (var19 != 0) {
                            statePc = 79;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (var19 == 0) {
                            statePc = 66;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 73: {
                    var5 = (RuntimeException) (Object) caughtException;
                    statePc = 74;
                    continue stateLoop;
                }
                case 74: {
                    try {
                        stackOut_74_0 = (RuntimeException) var5;
                        stackOut_74_1 = new StringBuilder().append("ho.E(");
                        stackIn_77_0 = stackOut_74_0;
                        stackIn_77_1 = stackOut_74_1;
                        stackIn_75_0 = stackOut_74_0;
                        stackIn_75_1 = stackOut_74_1;
                        if (param0 == null) {
                            statePc = 77;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
                        stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
                        stackOut_75_2 = "{...}";
                        stackIn_78_0 = stackOut_75_0;
                        stackIn_78_1 = stackOut_75_1;
                        stackIn_78_2 = stackOut_75_2;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 76: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 77: {
                    stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
                    stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
                    stackOut_77_2 = "null";
                    stackIn_78_0 = stackOut_77_0;
                    stackIn_78_1 = stackOut_77_1;
                    stackIn_78_2 = stackOut_77_2;
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    throw fa.a((Throwable) (Object) stackIn_78_0, stackIn_78_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
                }
                case 79: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void e(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              if (param0 == 30833) {
                break L0;
              } else {
                field_l = -114;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          field_p = null;
        }
    }

    final static int a(CharSequence param0, int param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param2 == 3) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        field_p = null;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = md.a(param0, param1, -105, true);
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0;
                }
                case 6: {
                    var3 = (RuntimeException) (Object) caughtException;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    try {
                        stackOut_7_0 = (RuntimeException) var3;
                        stackOut_7_1 = new StringBuilder().append("ho.D(");
                        stackIn_10_0 = stackOut_7_0;
                        stackIn_10_1 = stackOut_7_1;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        if (param0 == null) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                        stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                        stackOut_8_2 = "{...}";
                        stackIn_11_0 = stackOut_8_0;
                        stackIn_11_1 = stackOut_8_1;
                        stackIn_11_2 = stackOut_8_2;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 10: {
                    stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                    stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                    stackOut_10_2 = "null";
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    stackIn_11_2 = stackOut_10_2;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    throw fa.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 44 + param2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            RuntimeException var2_ref = null;
            Throwable var2_ref2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_3_0 = 0;
            int stackIn_13_0 = 0;
            int stackIn_14_0 = 0;
            int stackIn_14_1 = 0;
            int stackIn_21_0 = 0;
            int stackIn_29_0 = 0;
            RuntimeException stackIn_32_0 = null;
            StringBuilder stackIn_32_1 = null;
            RuntimeException stackIn_34_0 = null;
            StringBuilder stackIn_34_1 = null;
            RuntimeException stackIn_35_0 = null;
            StringBuilder stackIn_35_1 = null;
            String stackIn_35_2 = null;
            int stackOut_2_0 = 0;
            int stackOut_12_0 = 0;
            int stackOut_13_0 = 0;
            int stackOut_13_1 = 0;
            int stackOut_20_0 = 0;
            int stackOut_26_0 = 0;
            int stackOut_28_0 = 0;
            RuntimeException stackOut_31_0 = null;
            StringBuilder stackOut_31_1 = null;
            RuntimeException stackOut_32_0 = null;
            StringBuilder stackOut_32_1 = null;
            String stackOut_32_2 = null;
            RuntimeException stackOut_34_0 = null;
            StringBuilder stackOut_34_1 = null;
            String stackOut_34_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = ZombieDawnMulti.field_E ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (!hk.field_a) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            stackOut_2_0 = 1;
                            stackIn_3_0 = stackOut_2_0;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        return stackIn_3_0 != 0;
                    }
                    case 4: {
                        try {
                            var2 = "tuhstatbut";
                            var3 = (String) fo.b(param0, 13093, "getcookies");
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (param1 == 61) {
                                statePc = 9;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            byte[] discarded$2 = ho.a(122, 9, (byte[]) null, 88);
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var4 = mk.a(';', false, var3);
                            var5 = 0;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (var4.length <= var5) {
                                statePc = 23;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = var6 ^ -1;
                            stackIn_29_0 = stackOut_12_0;
                            stackIn_13_0 = stackOut_12_0;
                            if (var7 != 0) {
                                statePc = 29;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            stackOut_13_0 = stackIn_13_0;
                            stackOut_13_1 = -1;
                            stackIn_14_0 = stackOut_13_0;
                            stackIn_14_1 = stackOut_13_1;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (stackIn_14_0 > stackIn_14_1) {
                                statePc = 22;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                                statePc = 22;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            stackOut_20_0 = 1;
                            stackIn_21_0 = stackOut_20_0;
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        return stackIn_21_0 != 0;
                    }
                    case 22: {
                        try {
                            var5++;
                            if (var7 == 0) {
                                statePc = 10;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var2_ref2 = caughtException;
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (null == param0.getParameter("tuhstatbut")) {
                                statePc = 28;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 27;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            stackOut_26_0 = 1;
                            stackIn_29_0 = stackOut_26_0;
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 27;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            stackOut_28_0 = 0;
                            stackIn_29_0 = stackOut_28_0;
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        return stackIn_29_0 != 0;
                    }
                    case 30: {
                        var2_ref = (RuntimeException) (Object) caughtException;
                        statePc = 31;
                        continue stateLoop;
                    }
                    case 31: {
                        try {
                            stackOut_31_0 = (RuntimeException) var2_ref;
                            stackOut_31_1 = new StringBuilder().append("ho.I(");
                            stackIn_34_0 = stackOut_31_0;
                            stackIn_34_1 = stackOut_31_1;
                            stackIn_32_0 = stackOut_31_0;
                            stackIn_32_1 = stackOut_31_1;
                            if (param0 == null) {
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
                            stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
                            stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
                            stackOut_32_2 = "{...}";
                            stackIn_35_0 = stackOut_32_0;
                            stackIn_35_1 = stackOut_32_1;
                            stackIn_35_2 = stackOut_32_2;
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        throw (RuntimeException) (Object) caughtException;
                    }
                    case 34: {
                        stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
                        stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
                        stackOut_34_2 = "null";
                        stackIn_35_0 = stackOut_34_0;
                        stackIn_35_1 = stackOut_34_1;
                        stackIn_35_2 = stackOut_34_2;
                        statePc = 35;
                        continue stateLoop;
                    }
                    case 35: {
                        throw fa.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + 44 + param1 + 41);
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

    final static byte[] a(int param0, int param1, byte[] param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5_int = 0;
        wl var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        Object stackIn_12_0 = null;
        byte[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        Object stackOut_11_0 = null;
        byte[] stackOut_13_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (-1 <= (param1 ^ -1)) {
                            statePc = 9;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var4 = new byte[param3];
                        var5_int = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if ((param3 ^ -1) >= (var5_int ^ -1)) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var4[var5_int] = param2[param1 + var5_int];
                        var5_int++;
                        if (var7 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var7 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var7 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var4 = param2;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5 = new wl();
                        var5.b(32);
                        if (param0 == 4246) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = null;
                        stackIn_12_0 = stackOut_11_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return (byte[]) (Object) stackIn_12_0;
                }
                case 13: {
                    try {
                        var5.a(var4, param0 ^ 4262, (long)(8 * param3));
                        var6 = new byte[64];
                        var5.a(var6, param0 ^ 4247, 0);
                        stackOut_13_0 = (byte[]) var6;
                        stackIn_14_0 = stackOut_13_0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return stackIn_14_0;
                }
                case 15: {
                    var4_ref = (RuntimeException) (Object) caughtException;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    try {
                        stackOut_16_0 = (RuntimeException) var4_ref;
                        stackOut_16_1 = new StringBuilder().append("ho.F(").append(param0).append(44).append(param1).append(44);
                        stackIn_19_0 = stackOut_16_0;
                        stackIn_19_1 = stackOut_16_1;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        if (param2 == null) {
                            statePc = 19;
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
                        stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                        stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                        stackOut_17_2 = "{...}";
                        stackIn_20_0 = stackOut_17_0;
                        stackIn_20_1 = stackOut_17_1;
                        stackIn_20_2 = stackOut_17_2;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 19: {
                    stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                    stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                    stackOut_19_2 = "null";
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    stackIn_20_2 = stackOut_19_2;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    throw fa.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param3 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(boolean param0) {
        int var2_int = 0;
        try {
            var2_int = (wn.a(-125, wf.field_m << 2057136483) * 24 >> -483729424) + (175 + (4 * on.a(wf.field_m << 1660598087, -18924) >> -46548720));
            oo.f(0, 0, 640, 480, 0, var2_int);
            oo.h(5, 5, 635, 475);
            gb.a(6, 3 + ((ho) this).field_n, 469, 640 + (-((ho) this).field_n + -((ho) this).field_n), (byte) 122);
            oo.c();
            vh.field_Lb.a(((ho) this).field_n, 136);
            vh.field_Lb.a(((ho) this).field_n, 6);
            dm.field_Wb.a(640 - ((ho) this).field_n, 6);
            dm.field_Wb.a(-((ho) this).field_n + 640, 134);
            no.field_Jb.a(0, 0);
            super.a(param0);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "ho.H(" + param0 + 41);
        }
    }

    final void c(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_21_0 = 0;
        byte stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((ho) this).field_r = 0;
                        var2_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (((ho) this).field_g.field_c <= var2_int) {
                            statePc = 33;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var3 = we.field_g[((ho) this).field_j[var2_int]];
                        var4 = ah.field_e.a(var3);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = ((ho) this).field_j[var2_int];
                        stackOut_4_1 = 50;
                        stackIn_34_0 = stackOut_4_0;
                        stackIn_34_1 = stackOut_4_1;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
                        if (var9 != 0) {
                            statePc = 34;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (stackIn_5_0 == stackIn_5_1) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var5 = ah.field_e.a(da.field_f);
                        var6 = ah.field_e.a(jm.field_l);
                        var7 = ah.field_e.a(jp.field_a);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var5 > var6) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = var6;
                        stackIn_14_0 = stackOut_11_0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = var5;
                        stackIn_14_0 = stackOut_13_0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var8 = stackIn_14_0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if ((var8 ^ -1) < (var7 ^ -1)) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackOut_16_0 = var7;
                        stackIn_19_0 = stackOut_16_0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackOut_18_0 = var8;
                        stackIn_19_0 = stackOut_18_0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var8 = stackIn_19_0;
                        var4 = var4 + var8;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (((ho) this).field_j[var2_int] == 12) {
                            statePc = 25;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = 13;
                        stackIn_22_0 = stackOut_21_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (stackIn_22_0 != ((ho) this).field_j[var2_int]) {
                            statePc = 28;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        // wide iinc 4 140
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var4 > ((ho) this).field_r) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        ((ho) this).field_r = var4;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var2_int++;
                        if (var9 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        ((ho) this).field_o = -(((ho) this).field_r >> -1057907071) + 320;
                        ((ho) this).field_n = ((ho) this).field_o - 20;
                        stackOut_33_0 = param0;
                        stackOut_33_1 = 74;
                        stackIn_34_0 = stackOut_33_0;
                        stackIn_34_1 = stackOut_33_1;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (stackIn_34_0 == stackIn_34_1) {
                            statePc = 40;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        ho.a((byte) -52, (fh) null);
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 39: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw fa.a((Throwable) (Object) var2, "ho.G(" + param0 + 41);
                }
                case 40: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int d(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        try {
          try {
            L0: {
              if (param0 < -65) {
                break L0;
              } else {
                field_p = null;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = ((ho) this).field_r + ((ho) this).field_o;
          stackIn_5_0 = stackOut_4_0;
        }
        return 0;
    }

    ho(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Respect";
        field_l = 1;
        field_m = 0;
        field_s = 131072;
    }
}
