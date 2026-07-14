/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class opa extends qra {
    private boolean field_o;
    private gsa[] field_r;
    private boolean field_m;
    private boolean field_p;
    private boolean field_q;
    private boolean field_s;
    static mi[] field_n;

    final static void a(int param0, String param1, int param2, int param3, String param4, int param5) {
        RuntimeException runtimeException = null;
        kh var6 = null;
        int var7 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var6 = ql.field_k;
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        var6.k(param2, param3 + -35359);
                        var6.field_h = var6.field_h + 1;
                        if (param3 == 32371) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_n = null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var7 = var6.field_h;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var6.i(param0, 0);
                        if (param0 == 2) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var6.a(param4, false);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (param1 == null) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        int discarded$5 = wq.a(param1, (uia) (Object) var6, 0);
                        if (!TombRacer.field_G) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var6.f(-1477662136, param5);
                        statePc = 15;
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
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var6.d(-var7 + var6.field_h, (byte) 10);
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    try {
                        stackOut_20_0 = (RuntimeException) runtimeException;
                        stackOut_20_1 = new StringBuilder().append("opa.D(").append(param0).append(44);
                        stackIn_23_0 = stackOut_20_0;
                        stackIn_23_1 = stackOut_20_1;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        if (param1 == null) {
                            statePc = 23;
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
                        stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                        stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                        stackOut_21_2 = "{...}";
                        stackIn_24_0 = stackOut_21_0;
                        stackIn_24_1 = stackOut_21_1;
                        stackIn_24_2 = stackOut_21_2;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 23: {
                    stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
                    stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
                    stackOut_23_2 = "null";
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    stackIn_24_2 = stackOut_23_2;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    try {
                        stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
                        stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(44).append(param2).append(44).append(param3).append(44);
                        stackIn_27_0 = stackOut_24_0;
                        stackIn_27_1 = stackOut_24_1;
                        stackIn_25_0 = stackOut_24_0;
                        stackIn_25_1 = stackOut_24_1;
                        if (param4 == null) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
                        stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
                        stackOut_25_2 = "{...}";
                        stackIn_28_0 = stackOut_25_0;
                        stackIn_28_1 = stackOut_25_1;
                        stackIn_28_2 = stackOut_25_2;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 27: {
                    stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
                    stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
                    stackOut_27_2 = "null";
                    stackIn_28_0 = stackOut_27_0;
                    stackIn_28_1 = stackOut_27_1;
                    stackIn_28_2 = stackOut_27_2;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    throw tba.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 44 + param5 + 41);
                }
                case 29: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(char param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        try {
          try {
            L0: {
              if (param1 == 25) {
                break L0;
              } else {
                ((opa) this).field_m = false;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = 0;
          stackIn_5_0 = stackOut_4_0;
        }
        return false;
    }

    public static void f(int param0) {
        try {
            field_n = null;
            if (param0 < 73) {
                field_n = null;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "opa.C(" + param0 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5, boolean param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_7_0 = 0;
        int stackIn_14_0 = 0;
        boolean stackIn_18_0 = false;
        boolean stackIn_29_0 = false;
        int stackIn_35_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_48_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_13_0 = 0;
        boolean stackOut_17_0 = false;
        boolean stackOut_28_0 = false;
        int stackOut_32_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_47_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param3 > param1) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        if ((param1 + 1 ^ -1) > (param2 ^ -1)) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return;
                }
                case 5: {
                    try {
                        if (param2 <= param1 - -5) {
                            statePc = 12;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = param0;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((stackIn_7_0 ^ -1) == (param5 ^ -1)) {
                            statePc = 12;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var7_int = param2 - 1;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = var7_int ^ -1;
                        stackIn_14_0 = stackOut_13_0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (stackIn_14_0 >= (param1 ^ -1)) {
                            statePc = 24;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var8 = param1;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if ((var8 ^ -1) <= (var7_int ^ -1)) {
                            statePc = 23;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var9 = boa.field_n[var8];
                        var10 = boa.field_n[var8 + 1];
                        stackOut_17_0 = cl.a(param6, (byte) 119, var10, var9);
                        stackIn_14_0 = stackOut_17_0 ? 1 : 0;
                        stackIn_18_0 = stackOut_17_0;
                        if (var14 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (!stackIn_18_0) {
                            statePc = 22;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        boa.field_n[var8] = var10;
                        boa.field_n[var8 - -1] = var9;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var8++;
                        if (var14 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var7_int--;
                        if (var14 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 24: {
                    return;
                }
                case 25: {
                    try {
                        var7_int = (1 & (param5 & param0)) + (param5 >> 1598161089) + (param0 >> -668009087);
                        var8 = param1;
                        var9 = param0;
                        var10 = param5;
                        var11 = param1;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (param2 <= var11) {
                            statePc = 47;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var12 = boa.field_n[var11];
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackOut_28_0 = param6;
                        stackIn_48_0 = stackOut_28_0 ? 1 : 0;
                        stackIn_29_0 = stackOut_28_0;
                        if (var14 != 0) {
                            statePc = 48;
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
                        if (!stackIn_29_0) {
                            statePc = 34;
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
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackOut_32_0 = jk.field_h[var12];
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
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackOut_34_0 = ic.field_c[var12];
                        stackIn_35_0 = stackOut_34_0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var13 = stackIn_35_0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if ((var7_int ^ -1) > (var13 ^ -1)) {
                            statePc = 42;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if ((var10 ^ -1) <= (var13 ^ -1)) {
                            statePc = 46;
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
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var10 = var13;
                        stackOut_40_0 = var14;
                        stackIn_41_0 = stackOut_40_0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (stackIn_41_0 == 0) {
                            statePc = 46;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        boa.field_n[var11] = boa.field_n[var8];
                        var8++;
                        boa.field_n[var8] = var12;
                        if ((var13 ^ -1) <= (var9 ^ -1)) {
                            statePc = 46;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var9 = var13;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var11++;
                        if (var14 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        opa.a(param0, param1, var8, param3, (byte) -100, var9, param6);
                        stackOut_47_0 = var10;
                        stackIn_48_0 = stackOut_47_0;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        opa.a(stackIn_48_0, var8, param2, param3, param4, param5, param6);
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 50: {
                    var7 = (RuntimeException) (Object) caughtException;
                    throw tba.a((Throwable) (Object) var7, "opa.F(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
                }
                case 51: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean e(int param0) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        try {
          try {
            L0: {
              if (param0 == -9202) {
                break L0;
              } else {
                ((opa) this).field_m = true;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = 1;
          stackIn_5_0 = stackOut_4_0;
        }
        return false;
    }

    final void b(int param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12_int = 0;
        String var12 = null;
        int var13_int = 0;
        String var13 = null;
        gsa var14_ref_gsa = null;
        int var14 = 0;
        int var15 = 0;
        String var16_ref = null;
        int var16 = 0;
        int var17 = 0;
        String var18_ref = null;
        int var18 = 0;
        int var19 = 0;
        String var20_ref = null;
        int var20 = 0;
        int var21_int = 0;
        nh var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        String var25 = null;
        nh var25_ref = null;
        int var26 = 0;
        int var27 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        Object stackIn_25_3 = null;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_31_2 = 0;
        int stackIn_36_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_59_0 = 0;
        gsa stackIn_63_0 = null;
        int[] stackIn_71_0 = null;
        int stackIn_80_0 = 0;
        gsa stackIn_84_0 = null;
        int stackIn_92_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_118_0 = 0;
        int stackIn_118_1 = 0;
        int stackIn_118_2 = 0;
        int stackIn_119_0 = 0;
        int stackIn_119_1 = 0;
        int stackIn_121_0 = 0;
        int stackIn_122_0 = 0;
        Object stackIn_122_1 = null;
        int stackIn_123_0 = 0;
        int stackIn_125_0 = 0;
        int stackIn_127_0 = 0;
        int stackIn_128_0 = 0;
        int stackIn_128_1 = 0;
        int stackIn_131_0 = 0;
        int stackIn_146_0 = 0;
        int stackIn_146_1 = 0;
        int stackIn_159_0 = 0;
        int stackIn_163_0 = 0;
        int stackIn_170_0 = 0;
        int stackIn_174_0 = 0;
        int stackIn_181_0 = 0;
        int stackIn_185_0 = 0;
        int stackIn_194_0 = 0;
        StringBuilder stackIn_196_0 = null;
        StringBuilder stackIn_198_0 = null;
        StringBuilder stackIn_199_0 = null;
        int stackIn_199_1 = 0;
        int stackIn_202_0 = 0;
        int stackIn_206_0 = 0;
        int stackIn_212_0 = 0;
        int stackIn_217_0 = 0;
        int stackIn_219_0 = 0;
        int stackIn_219_1 = 0;
        int stackIn_221_0 = 0;
        int stackIn_221_1 = 0;
        int stackIn_222_0 = 0;
        int stackIn_222_1 = 0;
        int stackIn_222_2 = 0;
        int stackIn_234_0 = 0;
        StringBuilder stackIn_236_0 = null;
        StringBuilder stackIn_238_0 = null;
        StringBuilder stackIn_239_0 = null;
        int stackIn_239_1 = 0;
        Object stackIn_242_0 = null;
        int stackIn_246_0 = 0;
        int stackIn_252_0 = 0;
        int stackIn_254_0 = 0;
        int stackIn_256_0 = 0;
        int stackIn_257_0 = 0;
        int stackIn_257_1 = 0;
        int stackIn_259_0 = 0;
        int stackIn_261_0 = 0;
        int stackIn_262_0 = 0;
        int stackIn_262_1 = 0;
        int stackIn_274_0 = 0;
        StringBuilder stackIn_276_0 = null;
        StringBuilder stackIn_278_0 = null;
        StringBuilder stackIn_279_0 = null;
        int stackIn_279_1 = 0;
        Object stackIn_282_0 = null;
        int stackIn_286_0 = 0;
        int stackIn_292_0 = 0;
        int stackIn_297_0 = 0;
        int stackIn_299_0 = 0;
        int stackIn_299_1 = 0;
        int stackIn_301_0 = 0;
        int stackIn_301_1 = 0;
        int stackIn_302_0 = 0;
        int stackIn_302_1 = 0;
        int stackIn_302_2 = 0;
        int stackIn_306_0 = 0;
        Throwable caughtException = null;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        Object stackOut_24_3 = null;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_30_2 = 0;
        int stackOut_33_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_58_0 = 0;
        gsa stackOut_62_0 = null;
        int[] stackOut_70_0 = null;
        int stackOut_79_0 = 0;
        gsa stackOut_83_0 = null;
        int stackOut_91_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_117_0 = 0;
        int stackOut_117_1 = 0;
        int stackOut_117_2 = 0;
        int stackOut_118_0 = 0;
        int stackOut_118_1 = 0;
        int stackOut_120_0 = 0;
        int stackOut_121_0 = 0;
        Object stackOut_121_1 = null;
        int stackOut_122_0 = 0;
        int stackOut_123_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_125_1 = 0;
        int stackOut_127_0 = 0;
        int stackOut_127_1 = 0;
        int stackOut_130_0 = 0;
        int stackOut_145_0 = 0;
        int stackOut_145_1 = 0;
        int stackOut_158_0 = 0;
        int stackOut_162_0 = 0;
        int stackOut_169_0 = 0;
        int stackOut_173_0 = 0;
        int stackOut_180_0 = 0;
        int stackOut_184_0 = 0;
        int stackOut_191_0 = 0;
        int stackOut_193_0 = 0;
        StringBuilder stackOut_195_0 = null;
        StringBuilder stackOut_196_0 = null;
        int stackOut_196_1 = 0;
        StringBuilder stackOut_198_0 = null;
        int stackOut_198_1 = 0;
        int stackOut_201_0 = 0;
        int stackOut_205_0 = 0;
        int stackOut_209_0 = 0;
        int stackOut_211_0 = 0;
        int stackOut_214_0 = 0;
        int stackOut_216_0 = 0;
        int stackOut_218_0 = 0;
        int stackOut_218_1 = 0;
        int stackOut_219_0 = 0;
        int stackOut_219_1 = 0;
        int stackOut_219_2 = 0;
        int stackOut_221_0 = 0;
        int stackOut_221_1 = 0;
        int stackOut_221_2 = 0;
        int stackOut_231_0 = 0;
        int stackOut_233_0 = 0;
        StringBuilder stackOut_235_0 = null;
        StringBuilder stackOut_236_0 = null;
        int stackOut_236_1 = 0;
        StringBuilder stackOut_238_0 = null;
        int stackOut_238_1 = 0;
        Object stackOut_241_0 = null;
        int stackOut_245_0 = 0;
        int stackOut_249_0 = 0;
        int stackOut_251_0 = 0;
        int stackOut_253_0 = 0;
        int stackOut_254_0 = 0;
        int stackOut_254_1 = 0;
        int stackOut_256_0 = 0;
        int stackOut_256_1 = 0;
        int stackOut_258_0 = 0;
        int stackOut_259_0 = 0;
        int stackOut_259_1 = 0;
        int stackOut_261_0 = 0;
        int stackOut_261_1 = 0;
        int stackOut_271_0 = 0;
        int stackOut_273_0 = 0;
        StringBuilder stackOut_275_0 = null;
        StringBuilder stackOut_276_0 = null;
        int stackOut_276_1 = 0;
        StringBuilder stackOut_278_0 = null;
        int stackOut_278_1 = 0;
        Object stackOut_281_0 = null;
        int stackOut_285_0 = 0;
        int stackOut_289_0 = 0;
        int stackOut_291_0 = 0;
        int stackOut_294_0 = 0;
        int stackOut_296_0 = 0;
        int stackOut_298_0 = 0;
        int stackOut_298_1 = 0;
        int stackOut_299_0 = 0;
        int stackOut_299_1 = 0;
        int stackOut_299_2 = 0;
        int stackOut_301_0 = 0;
        int stackOut_301_1 = 0;
        int stackOut_301_2 = 0;
        int stackOut_305_0 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var27 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (param0 < -50) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    ((opa) this).field_s = false;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    ura.a(-10985);
                    la.field_j.a(0, 0);
                    ik.field_h.a(0, 0);
                    ng.field_b[1].a(50, -10);
                    var3_int = -250 + aaa.a(false);
                    var4 = -10 + ng.field_b[1].c() + -70;
                    ng.field_b[1].a(var3_int, -10);
                    nm.field_l.a(var3_int, 0);
                    nm.field_l.a(var3_int, var4);
                    var5 = 3;
                    var6 = (var3_int + -50) / (var5 - -1);
                    var7 = 0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if ((var5 ^ -1) >= (var7 ^ -1)) {
                        statePc = 12;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var8 = 50 - -((1 + var7) * var6);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    ng.field_b[0].a(var8, 0);
                    var7++;
                    if (var27 != 0) {
                        statePc = 13;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (var27 == 0) {
                        statePc = 6;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var7 = 0;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    if (3 <= var7) {
                        statePc = 19;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var8 = -30 + (var3_int + -50 >> 2071501314) * 3;
                    var9 = (var7 + 1) * ((var4 - 0) / 4) + 20;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    ng.field_b[0].a((float)var8, (float)var9, 4096, 16384, 3, 1610612736, 1);
                    ng.field_b[0].a((float)(var8 - -150), (float)var9, 4096, 16384, 3, 1610612736, 1);
                    var7++;
                    if (var27 != 0) {
                        statePc = 20;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (var27 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var7 = ((opa) this).field_c.field_E;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    var8 = 0;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    if (((opa) this).field_c.field_k <= var8) {
                        statePc = 116;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    var9 = var3_int + 32;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    stackOut_23_0 = 95 * var8;
                    stackOut_23_1 = 70;
                    stackOut_23_2 = -4;
                    stackIn_118_0 = stackOut_23_0;
                    stackIn_118_1 = stackOut_23_1;
                    stackIn_118_2 = stackOut_23_2;
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    stackIn_24_2 = stackOut_23_2;
                    if (var27 != 0) {
                        statePc = 118;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    stackOut_24_0 = stackIn_24_0;
                    stackOut_24_1 = stackIn_24_1;
                    stackOut_24_2 = stackIn_24_2;
                    stackOut_24_3 = this;
                    stackIn_25_0 = stackOut_24_0;
                    stackIn_25_1 = stackOut_24_1;
                    stackIn_25_2 = stackOut_24_2;
                    stackIn_25_3 = stackOut_24_3;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    stackOut_25_0 = stackIn_25_0;
                    stackOut_25_1 = stackIn_25_1;
                    stackIn_30_0 = stackOut_25_0;
                    stackIn_30_1 = stackOut_25_1;
                    stackIn_26_0 = stackOut_25_0;
                    stackIn_26_1 = stackOut_25_1;
                    if (stackIn_25_2 >= (((opa) this).field_c.field_k ^ -1)) {
                        statePc = 30;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackOut_26_0 = stackIn_26_0;
                    stackOut_26_1 = stackIn_26_1;
                    stackIn_28_0 = stackOut_26_0;
                    stackIn_28_1 = stackOut_26_1;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    stackOut_28_0 = stackIn_28_0;
                    stackOut_28_1 = stackIn_28_1;
                    stackOut_28_2 = 95;
                    stackIn_31_0 = stackOut_28_0;
                    stackIn_31_1 = stackOut_28_1;
                    stackIn_31_2 = stackOut_28_2;
                    statePc = 31;
                    continue stateLoop;
                }
                case 30: {
                    stackOut_30_0 = stackIn_30_0;
                    stackOut_30_1 = stackIn_30_1;
                    stackOut_30_2 = 0;
                    stackIn_31_0 = stackOut_30_0;
                    stackIn_31_1 = stackOut_30_1;
                    stackIn_31_2 = stackOut_30_2;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    var10 = stackIn_31_0 + (stackIn_31_1 - -stackIn_31_2);
                    var11 = -50 + var10;
                    var12_int = var10 - 25;
                    eca.field_c[2].a(3 + var9, var11, eca.field_c[2].a() >> 299328994, eca.field_c[2].c() >> 1776428962);
                    var13_int = var10;
                    eca.field_c[1].a(var9, var12_int, eca.field_c[1].a() >> -656139454, eca.field_c[1].c() >> -2106429246);
                    eca.field_c[0].a(2 + var9, var13_int, eca.field_c[0].a() / 3, eca.field_c[0].c() / 3);
                    var14_ref_gsa = ((opa) this).field_r[var8];
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    if (!var14_ref_gsa.field_l) {
                        statePc = 35;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    stackOut_33_0 = var14_ref_gsa.field_c;
                    stackIn_36_0 = stackOut_33_0;
                    statePc = 36;
                    continue stateLoop;
                }
                case 35: {
                    stackOut_35_0 = 0;
                    stackIn_36_0 = stackOut_35_0;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    var15 = stackIn_36_0;
                    var16_ref = Integer.toString(var15);
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (var15 < 10) {
                        statePc = 40;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 40: {
                    var16_ref = "0" + var16_ref;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    ts.a(-1, -73, 20 + var11, var16_ref.toUpperCase(), 24 + var9, eda.field_f, 2431750);
                    if (var14_ref_gsa.field_d) {
                        statePc = 44;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    stackOut_42_0 = 0;
                    stackIn_45_0 = stackOut_42_0;
                    statePc = 45;
                    continue stateLoop;
                }
                case 44: {
                    stackOut_44_0 = var14_ref_gsa.field_r;
                    stackIn_45_0 = stackOut_44_0;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    var17 = stackIn_45_0;
                    var18_ref = Integer.toString(var17);
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    if (10 > var17) {
                        statePc = 49;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 49: {
                    var18_ref = "0" + var18_ref;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    ts.a(-1, -28, var12_int - -17, var18_ref.toUpperCase(), var9 - -24, eda.field_f, 2431750);
                    if (var14_ref_gsa.field_k) {
                        statePc = 53;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    stackOut_51_0 = 0;
                    stackIn_54_0 = stackOut_51_0;
                    statePc = 54;
                    continue stateLoop;
                }
                case 53: {
                    stackOut_53_0 = var14_ref_gsa.field_p;
                    stackIn_54_0 = stackOut_53_0;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    var19 = stackIn_54_0;
                    var20_ref = Integer.toString(var19);
                    if (var19 >= 10) {
                        statePc = 56;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    var20_ref = "0" + var20_ref;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    ts.a(-1, -29, var13_int + 14, var20_ref.toUpperCase(), var9 - -24, eda.field_f, 2431750);
                    var21_int = ((opa) this).field_c.field_H[var8].z(-104);
                    var22 = 0;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    if (-1 < (var21_int ^ -1)) {
                        statePc = 69;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    stackOut_58_0 = 2;
                    stackIn_59_0 = stackOut_58_0;
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    if (stackIn_59_0 != bta.field_n[var21_int]) {
                        statePc = 69;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    stackOut_62_0 = (gsa) var14_ref_gsa;
                    stackIn_63_0 = stackOut_62_0;
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    if (stackIn_63_0.field_o) {
                        statePc = 68;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 68: {
                    var22 = 1;
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    if (0 > var21_int) {
                        statePc = 78;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    stackOut_70_0 = bta.field_n;
                    stackIn_71_0 = stackOut_70_0;
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    if ((stackIn_71_0[var21_int] ^ -1) != -2) {
                        statePc = 78;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    if (!var14_ref_gsa.field_h) {
                        statePc = 78;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    var22 = 1;
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    if (-1 < (var21_int ^ -1)) {
                        statePc = 90;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    stackOut_79_0 = 0;
                    stackIn_80_0 = stackOut_79_0;
                    statePc = 80;
                    continue stateLoop;
                }
                case 80: {
                    if (stackIn_80_0 != bta.field_n[var21_int]) {
                        statePc = 90;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    stackOut_83_0 = (gsa) var14_ref_gsa;
                    stackIn_84_0 = stackOut_83_0;
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    if (stackIn_84_0.field_b) {
                        statePc = 89;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 89: {
                    var22 = 1;
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    if (-1 < (var21_int ^ -1)) {
                        statePc = 106;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    stackOut_91_0 = var22;
                    stackIn_92_0 = stackOut_91_0;
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    if (stackIn_92_0 != 0) {
                        statePc = 97;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 97: {
                    var23 = 43 + var9;
                    statePc = 98;
                    continue stateLoop;
                }
                case 98: {
                    if (bta.field_n[var21_int] != 2) {
                        statePc = 101;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    stackOut_99_0 = -4 + var11;
                    stackIn_105_0 = stackOut_99_0;
                    statePc = 105;
                    continue stateLoop;
                }
                case 101: {
                    if ((bta.field_n[var21_int] ^ -1) != -2) {
                        statePc = 104;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    stackOut_102_0 = -6 + var12_int;
                    stackIn_105_0 = stackOut_102_0;
                    statePc = 105;
                    continue stateLoop;
                }
                case 104: {
                    stackOut_104_0 = var13_int - 10;
                    stackIn_105_0 = stackOut_104_0;
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    var24 = stackIn_105_0;
                    var25_ref = sta.field_y[bta.field_f[var21_int]];
                    var25_ref.a(var23, var24, var25_ref.a() >> -1701847199, var25_ref.c() >> -888815583);
                    statePc = 106;
                    continue stateLoop;
                }
                case 106: {
                    var23 = 80 + var9;
                    var24 = 32 + var10;
                    var25 = String.valueOf(((opa) this).field_r[var8].field_m);
                    ts.a(-1, -59, var24, "$", var23, qr.field_v, 2431750);
                    ts.a(0, -28, -1 + var24, var25.toUpperCase(), 18 + var23, qr.field_v, wga.field_a[var8]);
                    var26 = ((opa) this).field_c.field_v[var8];
                    statePc = 107;
                    continue stateLoop;
                }
                case 107: {
                    if ((var8 ^ -1) != (((opa) this).field_c.e(2) ^ -1)) {
                        statePc = 115;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    stackOut_108_0 = var7;
                    stackIn_109_0 = stackOut_108_0;
                    statePc = 109;
                    continue stateLoop;
                }
                case 109: {
                    if ((stackIn_109_0 ^ -1) <= (-100 + fd.field_e ^ -1)) {
                        statePc = 115;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    var26--;
                    statePc = 115;
                    continue stateLoop;
                }
                case 115: {
                    oka.a(Integer.toString(var26), wga.field_a[var8], qr.field_v, -1, -47 + (var24 + -1), 55, 0);
                    oka.a(Integer.toString(((opa) this).field_c.field_L), wga.field_a[var8], qr.field_v, -1, -12 + (var24 + -1), 55, 0);
                    oka.a("_", wga.field_a[var8], qr.field_v, -1, -40 + var24, 55, 0);
                    var8++;
                    if (var27 == 0) {
                        statePc = 21;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    var8 = 0;
                    statePc = 117;
                    continue stateLoop;
                }
                case 117: {
                    stackOut_117_0 = var8 ^ -1;
                    stackOut_117_1 = ((opa) this).field_c.field_k;
                    stackOut_117_2 = -1;
                    stackIn_118_0 = stackOut_117_0;
                    stackIn_118_1 = stackOut_117_1;
                    stackIn_118_2 = stackOut_117_2;
                    statePc = 118;
                    continue stateLoop;
                }
                case 118: {
                    stackOut_118_0 = stackIn_118_0;
                    stackOut_118_1 = stackIn_118_1 ^ stackIn_118_2;
                    stackIn_119_0 = stackOut_118_0;
                    stackIn_119_1 = stackOut_118_1;
                    statePc = 119;
                    continue stateLoop;
                }
                case 119: {
                    if (stackIn_119_0 <= stackIn_119_1) {
                        statePc = 305;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    stackOut_120_0 = 95 * var8 + 105;
                    stackIn_306_0 = stackOut_120_0;
                    stackIn_121_0 = stackOut_120_0;
                    if (var27 != 0) {
                        statePc = 306;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    stackOut_121_0 = stackIn_121_0;
                    stackOut_121_1 = this;
                    stackIn_122_0 = stackOut_121_0;
                    stackIn_122_1 = stackOut_121_1;
                    statePc = 122;
                    continue stateLoop;
                }
                case 122: {
                    stackOut_122_0 = stackIn_122_0;
                    stackIn_127_0 = stackOut_122_0;
                    stackIn_123_0 = stackOut_122_0;
                    if (((opa) this).field_c.field_k < 3) {
                        statePc = 127;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    stackOut_123_0 = stackIn_123_0;
                    stackIn_125_0 = stackOut_123_0;
                    statePc = 125;
                    continue stateLoop;
                }
                case 125: {
                    stackOut_125_0 = stackIn_125_0;
                    stackOut_125_1 = 0;
                    stackIn_128_0 = stackOut_125_0;
                    stackIn_128_1 = stackOut_125_1;
                    statePc = 128;
                    continue stateLoop;
                }
                case 127: {
                    stackOut_127_0 = stackIn_127_0;
                    stackOut_127_1 = 95;
                    stackIn_128_0 = stackOut_127_0;
                    stackIn_128_1 = stackOut_127_1;
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    var9 = stackIn_128_0 + stackIn_128_1;
                    statePc = 129;
                    continue stateLoop;
                }
                case 129: {
                    if ((-100 + fd.field_e ^ -1) < (var7 ^ -1)) {
                        statePc = 156;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    stackOut_130_0 = var8;
                    stackIn_131_0 = stackOut_130_0;
                    statePc = 131;
                    continue stateLoop;
                }
                case 131: {
                    if ((stackIn_131_0 ^ -1) == (((opa) this).field_c.e(2) ^ -1)) {
                        statePc = 136;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 136: {
                    if (((opa) this).field_c.field_L == ((opa) this).field_c.field_v[var8]) {
                        statePc = 140;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    oka.a(cha.field_h.toUpperCase(), 2431750, qr.field_v, -1, var9 - 22, (var3_int + 50 >> -1164132767) + 20, -1);
                    if (var27 == 0) {
                        statePc = 143;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    oka.a(vu.field_d.toUpperCase(), 2431750, qr.field_v, -1, var9 + -22, (var3_int + 50 >> 1972141153) - -20, -1);
                    statePc = 143;
                    continue stateLoop;
                }
                case 143: {
                    var10 = 0;
                    var11 = 0;
                    statePc = 144;
                    continue stateLoop;
                }
                case 144: {
                    if (((opa) this).field_r.length <= var11) {
                        statePc = 152;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    stackOut_145_0 = var11;
                    stackOut_145_1 = var8;
                    stackIn_119_0 = stackOut_145_0;
                    stackIn_119_1 = stackOut_145_1;
                    stackIn_146_0 = stackOut_145_0;
                    stackIn_146_1 = stackOut_145_1;
                    if (var27 != 0) {
                        statePc = 119;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    if (stackIn_146_0 == stackIn_146_1) {
                        statePc = 151;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    if (((opa) this).field_r[var8].field_x != ((opa) this).field_r[var11].field_x) {
                        statePc = 151;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    var10 = 1;
                    statePc = 151;
                    continue stateLoop;
                }
                case 151: {
                    var11++;
                    if (var27 == 0) {
                        statePc = 144;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    if (var10 != 0) {
                        statePc = 155;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 155: {
                    oka.a(uda.field_o.toUpperCase(), 2431750, eda.field_f, -1, var9, 20 + (50 + var3_int >> -479353247), -1);
                    statePc = 156;
                    continue stateLoop;
                }
                case 156: {
                    tga.field_a.KA(0, var9 - 100, (int)(2.0 + ((opa) this).field_r[var8].field_q), var9 - -50);
                    var10 = wga.field_a[var8];
                    statePc = 157;
                    continue stateLoop;
                }
                case 157: {
                    gca.field_a.a(62, 10 + var9 + -95, 0, var10 | -1006632960, 1);
                    tga.field_a.la();
                    ((opa) this).field_c.field_H[var8].n((byte) -42).a(-1, (int)((opa) this).field_r[var8].field_q, 1400, 1536, var9);
                    oka.a(((opa) this).field_c.field_l[var8].toUpperCase(), var10, kn.field_p, -1, var9, (int)((opa) this).field_r[var8].field_q, -1);
                    if (((opa) this).field_p) {
                        statePc = 166;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    stackOut_158_0 = var7;
                    stackIn_159_0 = stackOut_158_0;
                    statePc = 159;
                    continue stateLoop;
                }
                case 159: {
                    if ((stackIn_159_0 ^ -1) > (var8 * 50 + efa.field_y ^ -1)) {
                        statePc = 166;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    stackOut_162_0 = var7;
                    stackIn_163_0 = stackOut_162_0;
                    statePc = 163;
                    continue stateLoop;
                }
                case 163: {
                    if ((stackIn_163_0 ^ -1) > (50 + efa.field_y - -(((opa) this).field_c.field_k * 50) ^ -1)) {
                        statePc = 268;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    if (((opa) this).field_m) {
                        statePc = 177;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    stackOut_169_0 = var7;
                    stackIn_170_0 = stackOut_169_0;
                    statePc = 170;
                    continue stateLoop;
                }
                case 170: {
                    if (stackIn_170_0 < var8 * 50 + nta.field_d) {
                        statePc = 177;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    stackOut_173_0 = 50;
                    stackIn_174_0 = stackOut_173_0;
                    statePc = 174;
                    continue stateLoop;
                }
                case 174: {
                    if (stackIn_174_0 + (((opa) this).field_c.field_k * 50 + nta.field_d) > var7) {
                        statePc = 228;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    if (((opa) this).field_o) {
                        statePc = 304;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    stackOut_180_0 = var7;
                    stackIn_181_0 = stackOut_180_0;
                    statePc = 181;
                    continue stateLoop;
                }
                case 181: {
                    if (stackIn_181_0 < var8 * 50 + iv.field_ub) {
                        statePc = 304;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    stackOut_184_0 = var7;
                    stackIn_185_0 = stackOut_184_0;
                    statePc = 185;
                    continue stateLoop;
                }
                case 185: {
                    if (stackIn_185_0 < ((opa) this).field_c.field_k * 50 + iv.field_ub - -50) {
                        statePc = 190;
                    } else {
                        statePc = 304;
                    }
                    continue stateLoop;
                }
                case 190: {
                    if ((50 * var8 + iv.field_ub + 25 ^ -1) < (var7 ^ -1)) {
                        statePc = 193;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    stackOut_191_0 = 1;
                    stackIn_194_0 = stackOut_191_0;
                    statePc = 194;
                    continue stateLoop;
                }
                case 193: {
                    stackOut_193_0 = 0;
                    stackIn_194_0 = stackOut_193_0;
                    statePc = 194;
                    continue stateLoop;
                }
                case 194: {
                    var11 = stackIn_194_0;
                    var12 = Integer.toString(((opa) this).field_r[var8].field_c);
                    statePc = 195;
                    continue stateLoop;
                }
                case 195: {
                    stackOut_195_0 = new StringBuilder().append("$");
                    stackIn_198_0 = stackOut_195_0;
                    stackIn_196_0 = stackOut_195_0;
                    if (var11 == 0) {
                        statePc = 198;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    stackOut_196_0 = (StringBuilder) (Object) stackIn_196_0;
                    stackOut_196_1 = ((opa) this).field_r[var8].field_f;
                    stackIn_199_0 = stackOut_196_0;
                    stackIn_199_1 = stackOut_196_1;
                    statePc = 199;
                    continue stateLoop;
                }
                case 198: {
                    stackOut_198_0 = (StringBuilder) (Object) stackIn_198_0;
                    stackOut_198_1 = 0;
                    stackIn_199_0 = stackOut_198_0;
                    stackIn_199_1 = stackOut_198_1;
                    statePc = 199;
                    continue stateLoop;
                }
                case 199: {
                    var13 = Integer.toString(stackIn_199_1 + ((opa) this).field_r[var8].field_a);
                    var14 = ((opa) this).field_c.field_H[var8].z(-113);
                    statePc = 200;
                    continue stateLoop;
                }
                case 200: {
                    if (var11 == 0) {
                        statePc = 211;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 201: {
                    stackOut_201_0 = 0;
                    stackIn_202_0 = stackOut_201_0;
                    statePc = 202;
                    continue stateLoop;
                }
                case 202: {
                    if (stackIn_202_0 >= ((opa) this).field_r[var8].field_f) {
                        statePc = 211;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    stackOut_205_0 = var14;
                    stackIn_206_0 = stackOut_205_0;
                    statePc = 206;
                    continue stateLoop;
                }
                case 206: {
                    if ((stackIn_206_0 ^ -1) > -1) {
                        statePc = 211;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    stackOut_209_0 = 1;
                    stackIn_212_0 = stackOut_209_0;
                    statePc = 212;
                    continue stateLoop;
                }
                case 211: {
                    stackOut_211_0 = 0;
                    stackIn_212_0 = stackOut_211_0;
                    statePc = 212;
                    continue stateLoop;
                }
                case 212: {
                    var15 = stackIn_212_0;
                    statePc = 213;
                    continue stateLoop;
                }
                case 213: {
                    if (var15 == 0) {
                        statePc = 216;
                    } else {
                        statePc = 214;
                    }
                    continue stateLoop;
                }
                case 214: {
                    stackOut_214_0 = 20;
                    stackIn_217_0 = stackOut_214_0;
                    statePc = 217;
                    continue stateLoop;
                }
                case 216: {
                    stackOut_216_0 = 0;
                    stackIn_217_0 = stackOut_216_0;
                    statePc = 217;
                    continue stateLoop;
                }
                case 217: {
                    var16 = stackIn_217_0 + Math.max(95 + wb.field_a.a("x" + var12, (byte) 45), 70 + wb.field_a.a("+" + var13, (byte) 98));
                    statePc = 218;
                    continue stateLoop;
                }
                case 218: {
                    stackOut_218_0 = 40;
                    stackOut_218_1 = (int)((opa) this).field_r[var8].field_q;
                    stackIn_221_0 = stackOut_218_0;
                    stackIn_221_1 = stackOut_218_1;
                    stackIn_219_0 = stackOut_218_0;
                    stackIn_219_1 = stackOut_218_1;
                    if ((double)(-var16 + var3_int) > ((opa) this).field_r[var8].field_q) {
                        statePc = 221;
                    } else {
                        statePc = 219;
                    }
                    continue stateLoop;
                }
                case 219: {
                    stackOut_219_0 = stackIn_219_0;
                    stackOut_219_1 = stackIn_219_1;
                    stackOut_219_2 = var16;
                    stackIn_222_0 = stackOut_219_0;
                    stackIn_222_1 = stackOut_219_1;
                    stackIn_222_2 = stackOut_219_2;
                    statePc = 222;
                    continue stateLoop;
                }
                case 221: {
                    stackOut_221_0 = stackIn_221_0;
                    stackOut_221_1 = stackIn_221_1;
                    stackOut_221_2 = 0;
                    stackIn_222_0 = stackOut_221_0;
                    stackIn_222_1 = stackOut_221_1;
                    stackIn_222_2 = stackOut_221_2;
                    statePc = 222;
                    continue stateLoop;
                }
                case 222: {
                    var17 = stackIn_222_0 + (stackIn_222_1 + -stackIn_222_2);
                    var18 = -70 + var9;
                    statePc = 223;
                    continue stateLoop;
                }
                case 223: {
                    eca.field_c[2].a(var17, var18 + -5, eca.field_c[2].a() >> 813448290, eca.field_c[2].c() >> 1171533250);
                    ts.a(0, -30, 15 + var18, "x", 25 + var17, qr.field_v, wga.field_a[var8]);
                    ts.a(0, -100, var18 + 17, var12, 45 + var17, qr.field_v, wga.field_a[var8]);
                    ts.a(0, -126, 55 + var18, "+", var17 + 2, qr.field_v, wga.field_a[var8]);
                    ts.a(0, -24, 55 + var18, var13, 25 + var17, qr.field_v, wga.field_a[var8]);
                    if (var15 != 0) {
                        statePc = 226;
                    } else {
                        statePc = 227;
                    }
                    continue stateLoop;
                }
                case 226: {
                    var19 = var17 - -wb.field_a.a("x" + var12, (byte) 36) - -25;
                    var20 = -11 + var18;
                    var21 = sta.field_y[bta.field_f[var14]];
                    var21.a(var19, var20, var21.a() >> -1516435071, var21.c() >> -1785801471);
                    statePc = 227;
                    continue stateLoop;
                }
                case 227: {
                    if (var27 == 0) {
                        statePc = 304;
                    } else {
                        statePc = 228;
                    }
                    continue stateLoop;
                }
                case 228: {
                    if ((25 + (nta.field_d + var8 * 50) ^ -1) < (var7 ^ -1)) {
                        statePc = 233;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 231: {
                    stackOut_231_0 = 1;
                    stackIn_234_0 = stackOut_231_0;
                    statePc = 234;
                    continue stateLoop;
                }
                case 233: {
                    stackOut_233_0 = 0;
                    stackIn_234_0 = stackOut_233_0;
                    statePc = 234;
                    continue stateLoop;
                }
                case 234: {
                    var11 = stackIn_234_0;
                    var12 = Integer.toString(((opa) this).field_r[var8].field_r);
                    statePc = 235;
                    continue stateLoop;
                }
                case 235: {
                    stackOut_235_0 = new StringBuilder().append("$");
                    stackIn_238_0 = stackOut_235_0;
                    stackIn_236_0 = stackOut_235_0;
                    if (var11 != 0) {
                        statePc = 238;
                    } else {
                        statePc = 236;
                    }
                    continue stateLoop;
                }
                case 236: {
                    stackOut_236_0 = (StringBuilder) (Object) stackIn_236_0;
                    stackOut_236_1 = 0;
                    stackIn_239_0 = stackOut_236_0;
                    stackIn_239_1 = stackOut_236_1;
                    statePc = 239;
                    continue stateLoop;
                }
                case 238: {
                    stackOut_238_0 = (StringBuilder) (Object) stackIn_238_0;
                    stackOut_238_1 = ((opa) this).field_r[var8].field_z;
                    stackIn_239_0 = stackOut_238_0;
                    stackIn_239_1 = stackOut_238_1;
                    statePc = 239;
                    continue stateLoop;
                }
                case 239: {
                    var13 = Integer.toString(stackIn_239_1 + ((opa) this).field_r[var8].field_n);
                    var14 = ((opa) this).field_c.field_H[var8].z(39);
                    statePc = 240;
                    continue stateLoop;
                }
                case 240: {
                    if (var11 == 0) {
                        statePc = 251;
                    } else {
                        statePc = 241;
                    }
                    continue stateLoop;
                }
                case 241: {
                    stackOut_241_0 = this;
                    stackIn_242_0 = stackOut_241_0;
                    statePc = 242;
                    continue stateLoop;
                }
                case 242: {
                    if (((opa) this).field_r[var8].field_z <= 0) {
                        statePc = 251;
                    } else {
                        statePc = 245;
                    }
                    continue stateLoop;
                }
                case 245: {
                    stackOut_245_0 = -1;
                    stackIn_246_0 = stackOut_245_0;
                    statePc = 246;
                    continue stateLoop;
                }
                case 246: {
                    if (stackIn_246_0 < (var14 ^ -1)) {
                        statePc = 251;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 249: {
                    stackOut_249_0 = 1;
                    stackIn_252_0 = stackOut_249_0;
                    statePc = 252;
                    continue stateLoop;
                }
                case 251: {
                    stackOut_251_0 = 0;
                    stackIn_252_0 = stackOut_251_0;
                    statePc = 252;
                    continue stateLoop;
                }
                case 252: {
                    var15 = stackIn_252_0;
                    statePc = 253;
                    continue stateLoop;
                }
                case 253: {
                    stackOut_253_0 = Math.max(95 + wb.field_a.a("x" + var12, (byte) 49), 70 + wb.field_a.a("+" + var13, (byte) 99));
                    stackIn_256_0 = stackOut_253_0;
                    stackIn_254_0 = stackOut_253_0;
                    if (var15 != 0) {
                        statePc = 256;
                    } else {
                        statePc = 254;
                    }
                    continue stateLoop;
                }
                case 254: {
                    stackOut_254_0 = stackIn_254_0;
                    stackOut_254_1 = 0;
                    stackIn_257_0 = stackOut_254_0;
                    stackIn_257_1 = stackOut_254_1;
                    statePc = 257;
                    continue stateLoop;
                }
                case 256: {
                    stackOut_256_0 = stackIn_256_0;
                    stackOut_256_1 = 20;
                    stackIn_257_0 = stackOut_256_0;
                    stackIn_257_1 = stackOut_256_1;
                    statePc = 257;
                    continue stateLoop;
                }
                case 257: {
                    var16 = stackIn_257_0 - -stackIn_257_1;
                    statePc = 258;
                    continue stateLoop;
                }
                case 258: {
                    stackOut_258_0 = (int)((opa) this).field_r[var8].field_q - -40;
                    stackIn_261_0 = stackOut_258_0;
                    stackIn_259_0 = stackOut_258_0;
                    if ((double)(-var16 + var3_int) <= ((opa) this).field_r[var8].field_q) {
                        statePc = 261;
                    } else {
                        statePc = 259;
                    }
                    continue stateLoop;
                }
                case 259: {
                    stackOut_259_0 = stackIn_259_0;
                    stackOut_259_1 = 0;
                    stackIn_262_0 = stackOut_259_0;
                    stackIn_262_1 = stackOut_259_1;
                    statePc = 262;
                    continue stateLoop;
                }
                case 261: {
                    stackOut_261_0 = stackIn_261_0;
                    stackOut_261_1 = var16;
                    stackIn_262_0 = stackOut_261_0;
                    stackIn_262_1 = stackOut_261_1;
                    statePc = 262;
                    continue stateLoop;
                }
                case 262: {
                    var17 = stackIn_262_0 + -stackIn_262_1;
                    var18 = var9 - 70;
                    statePc = 263;
                    continue stateLoop;
                }
                case 263: {
                    eca.field_c[1].a(var17, -5 + var18, eca.field_c[1].a() >> -332879806, eca.field_c[1].c() >> 997498242);
                    ts.a(0, -42, 15 + var18, "x", 25 + var17, qr.field_v, wga.field_a[var8]);
                    ts.a(0, -124, var18 - -17, var12, 45 + var17, qr.field_v, wga.field_a[var8]);
                    ts.a(0, -92, 55 + var18, "+", var17 + 2, qr.field_v, wga.field_a[var8]);
                    ts.a(0, -119, 55 + var18, var13, var17 + 25, qr.field_v, wga.field_a[var8]);
                    if (var15 != 0) {
                        statePc = 266;
                    } else {
                        statePc = 267;
                    }
                    continue stateLoop;
                }
                case 266: {
                    var19 = var17 + (wb.field_a.a("x" + var12, (byte) -122) + 25);
                    var20 = var18 + -11;
                    var21 = sta.field_y[bta.field_f[var14]];
                    var21.a(var19, var20, var21.a() >> -574488927, var21.c() >> -267027071);
                    statePc = 267;
                    continue stateLoop;
                }
                case 267: {
                    if (var27 == 0) {
                        statePc = 304;
                    } else {
                        statePc = 268;
                    }
                    continue stateLoop;
                }
                case 268: {
                    if ((var8 * 50 + efa.field_y - -25 ^ -1) < (var7 ^ -1)) {
                        statePc = 273;
                    } else {
                        statePc = 271;
                    }
                    continue stateLoop;
                }
                case 271: {
                    stackOut_271_0 = 1;
                    stackIn_274_0 = stackOut_271_0;
                    statePc = 274;
                    continue stateLoop;
                }
                case 273: {
                    stackOut_273_0 = 0;
                    stackIn_274_0 = stackOut_273_0;
                    statePc = 274;
                    continue stateLoop;
                }
                case 274: {
                    var11 = stackIn_274_0;
                    var12 = Integer.toString(((opa) this).field_r[var8].field_p);
                    statePc = 275;
                    continue stateLoop;
                }
                case 275: {
                    stackOut_275_0 = new StringBuilder().append("$");
                    stackIn_278_0 = stackOut_275_0;
                    stackIn_276_0 = stackOut_275_0;
                    if (var11 == 0) {
                        statePc = 278;
                    } else {
                        statePc = 276;
                    }
                    continue stateLoop;
                }
                case 276: {
                    stackOut_276_0 = (StringBuilder) (Object) stackIn_276_0;
                    stackOut_276_1 = ((opa) this).field_r[var8].field_u;
                    stackIn_279_0 = stackOut_276_0;
                    stackIn_279_1 = stackOut_276_1;
                    statePc = 279;
                    continue stateLoop;
                }
                case 278: {
                    stackOut_278_0 = (StringBuilder) (Object) stackIn_278_0;
                    stackOut_278_1 = 0;
                    stackIn_279_0 = stackOut_278_0;
                    stackIn_279_1 = stackOut_278_1;
                    statePc = 279;
                    continue stateLoop;
                }
                case 279: {
                    var13 = Integer.toString(stackIn_279_1 + ((opa) this).field_r[var8].field_v);
                    var14 = ((opa) this).field_c.field_H[var8].z(-124);
                    statePc = 280;
                    continue stateLoop;
                }
                case 280: {
                    if (var11 == 0) {
                        statePc = 291;
                    } else {
                        statePc = 281;
                    }
                    continue stateLoop;
                }
                case 281: {
                    stackOut_281_0 = this;
                    stackIn_282_0 = stackOut_281_0;
                    statePc = 282;
                    continue stateLoop;
                }
                case 282: {
                    if (((opa) this).field_r[var8].field_u <= 0) {
                        statePc = 291;
                    } else {
                        statePc = 285;
                    }
                    continue stateLoop;
                }
                case 285: {
                    stackOut_285_0 = -1;
                    stackIn_286_0 = stackOut_285_0;
                    statePc = 286;
                    continue stateLoop;
                }
                case 286: {
                    if (stackIn_286_0 < (var14 ^ -1)) {
                        statePc = 291;
                    } else {
                        statePc = 289;
                    }
                    continue stateLoop;
                }
                case 289: {
                    stackOut_289_0 = 1;
                    stackIn_292_0 = stackOut_289_0;
                    statePc = 292;
                    continue stateLoop;
                }
                case 291: {
                    stackOut_291_0 = 0;
                    stackIn_292_0 = stackOut_291_0;
                    statePc = 292;
                    continue stateLoop;
                }
                case 292: {
                    var15 = stackIn_292_0;
                    statePc = 293;
                    continue stateLoop;
                }
                case 293: {
                    if (var15 == 0) {
                        statePc = 296;
                    } else {
                        statePc = 294;
                    }
                    continue stateLoop;
                }
                case 294: {
                    stackOut_294_0 = 20;
                    stackIn_297_0 = stackOut_294_0;
                    statePc = 297;
                    continue stateLoop;
                }
                case 296: {
                    stackOut_296_0 = 0;
                    stackIn_297_0 = stackOut_296_0;
                    statePc = 297;
                    continue stateLoop;
                }
                case 297: {
                    var16 = stackIn_297_0 + Math.max(95 + wb.field_a.a("x" + var12, (byte) -103), wb.field_a.a("+" + var13, (byte) 87) + 70);
                    statePc = 298;
                    continue stateLoop;
                }
                case 298: {
                    stackOut_298_0 = 40;
                    stackOut_298_1 = (int)((opa) this).field_r[var8].field_q;
                    stackIn_301_0 = stackOut_298_0;
                    stackIn_301_1 = stackOut_298_1;
                    stackIn_299_0 = stackOut_298_0;
                    stackIn_299_1 = stackOut_298_1;
                    if ((double)(-var16 + var3_int) <= ((opa) this).field_r[var8].field_q) {
                        statePc = 301;
                    } else {
                        statePc = 299;
                    }
                    continue stateLoop;
                }
                case 299: {
                    stackOut_299_0 = stackIn_299_0;
                    stackOut_299_1 = stackIn_299_1;
                    stackOut_299_2 = 0;
                    stackIn_302_0 = stackOut_299_0;
                    stackIn_302_1 = stackOut_299_1;
                    stackIn_302_2 = stackOut_299_2;
                    statePc = 302;
                    continue stateLoop;
                }
                case 301: {
                    stackOut_301_0 = stackIn_301_0;
                    stackOut_301_1 = stackIn_301_1;
                    stackOut_301_2 = var16;
                    stackIn_302_0 = stackOut_301_0;
                    stackIn_302_1 = stackOut_301_1;
                    stackIn_302_2 = stackOut_301_2;
                    statePc = 302;
                    continue stateLoop;
                }
                case 302: {
                    var17 = stackIn_302_0 + (stackIn_302_1 - stackIn_302_2);
                    var18 = var9 + -70;
                    eca.field_c[0].a(var17, -5 + var18, eca.field_c[0].a() >> 1028237665, eca.field_c[0].c() >> 188512449);
                    ts.a(0, -123, 15 + var18, "x", 25 + var17, qr.field_v, wga.field_a[var8]);
                    ts.a(0, -51, 17 + var18, var12, 45 + var17, qr.field_v, wga.field_a[var8]);
                    ts.a(0, -103, var18 - -55, "+", var17 - -2, qr.field_v, wga.field_a[var8]);
                    ts.a(0, -65, var18 - -55, var13, 25 + var17, qr.field_v, wga.field_a[var8]);
                    if (var15 == 0) {
                        statePc = 304;
                    } else {
                        statePc = 303;
                    }
                    continue stateLoop;
                }
                case 303: {
                    var19 = 25 + wb.field_a.a("x" + var12, (byte) 31) + var17;
                    var20 = -11 + var18;
                    var21 = sta.field_y[bta.field_f[var14]];
                    var21.a(var19, var20, var21.a() >> 160958305, var21.c() >> 457600321);
                    statePc = 304;
                    continue stateLoop;
                }
                case 304: {
                    var8++;
                    if (var27 == 0) {
                        statePc = 117;
                    } else {
                        statePc = 305;
                    }
                    continue stateLoop;
                }
                case 305: {
                    stackOut_305_0 = -6;
                    stackIn_306_0 = stackOut_305_0;
                    statePc = 306;
                    continue stateLoop;
                }
                case 306: {
                    se.f((byte) stackIn_306_0);
                    ((opa) this).d(-27142);
                    statePc = 309;
                    continue stateLoop;
                }
                case 309: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static String a(String param0, byte param1) {
        RuntimeException var2 = null;
        mi[] var2_array = null;
        StringBuilder var3 = null;
        int var4 = 0;
        int var5 = 0;
        mi var6 = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int stackIn_8_0 = 0;
        String stackIn_42_0 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        String stackOut_41_0 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_array = ih.a((byte) 126, param0);
                        var3 = new StringBuilder();
                        var4 = -99 % ((param1 - 5) / 54);
                        var5 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var5 >= var2_array.length) {
                            statePc = 41;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var6 = var2_array[var5];
                        var7 = var6.field_h;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var5 != var2_array.length + -1) {
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
                        stackOut_5_0 = param0.length();
                        stackIn_8_0 = stackOut_5_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = var2_array[var5 - -1].field_h;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var8 = stackIn_8_0;
                        var9 = param0.substring(var7, var8);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var6.field_p == ma.field_e) {
                            statePc = 37;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((nl.field_d ^ -1) == (var6.field_p ^ -1)) {
                            statePc = 34;
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
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var6.field_p != tr.field_f) {
                            statePc = 19;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        StringBuilder discarded$6 = var3.append("<col=ffff99>").append(var9).append("</col>");
                        if (var10 == 0) {
                            statePc = 40;
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
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (dc.field_o != var6.field_p) {
                            statePc = 25;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        StringBuilder discarded$7 = var3.append("<col=ffaaff>").append(var9).append("</col>");
                        if (var10 == 0) {
                            statePc = 40;
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
                        if ((var6.field_p ^ -1) != (dja.field_r ^ -1)) {
                            statePc = 31;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 30;
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
                        StringBuilder discarded$8 = var3.append("<col=33ffaa>").append(var9).append("</col>");
                        if (var10 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        StringBuilder discarded$9 = var3.append(var9);
                        if (var10 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        StringBuilder discarded$10 = var3.append("<col=33bbff>").append(var9).append("</col>");
                        if (var10 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        StringBuilder discarded$11 = var3.append("<col=66ffff>").append(var9).append("</col>");
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var5++;
                        if (var10 == 0) {
                            statePc = 2;
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
                        stackOut_41_0 = var3.toString();
                        stackIn_42_0 = stackOut_41_0;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 42: {
                    return stackIn_42_0;
                }
                case 43: {
                    var2 = (RuntimeException) (Object) caughtException;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    try {
                        stackOut_44_0 = (RuntimeException) var2;
                        stackOut_44_1 = new StringBuilder().append("opa.H(");
                        stackIn_47_0 = stackOut_44_0;
                        stackIn_47_1 = stackOut_44_1;
                        stackIn_45_0 = stackOut_44_0;
                        stackIn_45_1 = stackOut_44_1;
                        if (param0 == null) {
                            statePc = 47;
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
                        stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
                        stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
                        stackOut_45_2 = "{...}";
                        stackIn_48_0 = stackOut_45_0;
                        stackIn_48_1 = stackOut_45_1;
                        stackIn_48_2 = stackOut_45_2;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 46: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 47: {
                    stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
                    stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
                    stackOut_47_2 = "null";
                    stackIn_48_0 = stackOut_47_0;
                    stackIn_48_1 = stackOut_47_1;
                    stackIn_48_2 = stackOut_47_2;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    throw tba.a((Throwable) (Object) stackIn_48_0, stackIn_48_2 + 44 + param1 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    opa(qh param0, v param1, int[][] param2) {
        super(param0, param1);
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5_int = 0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        int var13_int = 0;
        double var13 = 0.0;
        gsa var14 = null;
        int var15_int = 0;
        double var15 = 0.0;
        int var16 = 0;
        int var17 = 0;
        gsa var18_ref_gsa = null;
        double var18 = 0.0;
        double var19 = 0.0;
        double var21 = 0.0;
        double var23 = 0.0;
        double var25 = 0.0;
        double var27 = 0.0;
        double var29 = 0.0;
        double var31 = 0.0;
        int var33 = 0;
        int stackIn_12_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_31_0 = 0;
        double stackIn_35_0 = 0.0;
        double stackIn_41_0 = 0.0;
        double stackIn_44_0 = 0.0;
        double stackIn_50_0 = 0.0;
        double stackIn_53_0 = 0.0;
        double stackIn_59_0 = 0.0;
        int stackIn_61_0 = 0;
        Object stackIn_79_0 = null;
        Object stackIn_83_0 = null;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        String stackIn_96_2 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_100_2 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_104_2 = null;
        int stackOut_11_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_30_0 = 0;
        double stackOut_34_0 = 0.0;
        double stackOut_38_0 = 0.0;
        double stackOut_40_0 = 0.0;
        double stackOut_43_0 = 0.0;
        double stackOut_47_0 = 0.0;
        double stackOut_49_0 = 0.0;
        double stackOut_52_0 = 0.0;
        double stackOut_56_0 = 0.0;
        double stackOut_58_0 = 0.0;
        int stackOut_60_0 = 0;
        Object stackOut_78_0 = null;
        Object stackOut_82_0 = null;
        RuntimeException stackOut_92_0 = null;
        StringBuilder stackOut_92_1 = null;
        RuntimeException stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        String stackOut_93_2 = null;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        String stackOut_95_2 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        String stackOut_99_2 = null;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        String stackOut_101_2 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        String stackOut_103_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var33 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4_int = ((opa) this).field_c.field_H.length;
                        ((opa) this).field_r = new gsa[var4_int];
                        var5_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var4_int ^ -1) >= (var5_int ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ((opa) this).field_r[var5_int] = new gsa(((opa) this).field_c.field_H[var5_int], param2[var5_int]);
                        var5_int++;
                        if (var33 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var33 == 0) {
                            statePc = 2;
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
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        er.b(1, 0);
                        ((opa) this).field_s = false;
                        mr.field_w = new w();
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var5 = 0.0;
                        var7 = 0.0;
                        var9 = 0.0;
                        var11 = 0.0;
                        var13_int = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((var13_int ^ -1) <= (((opa) this).field_r.length ^ -1)) {
                            statePc = 26;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var14 = ((opa) this).field_r[var13_int];
                        var15_int = var14.field_v + var14.field_u;
                        var16 = var14.field_n + var14.field_z;
                        var17 = var14.field_a - -var14.field_f;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = (var9 < (double)var16 ? -1 : (var9 == (double)var16 ? 0 : 1));
                        stackIn_27_0 = stackOut_11_0;
                        stackIn_12_0 = stackOut_11_0;
                        if (var33 != 0) {
                            statePc = 27;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (stackIn_12_0 < 0) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var9 = (double)var16;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var7 < (double)var15_int) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var7 = (double)var15_int;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if ((double)(var15_int - (-var16 + -var17)) <= var5) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var5 = (double)(var17 + (var15_int - -var16));
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var11 >= (double)var17) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var11 = (double)var17;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var13_int++;
                        if (var33 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackOut_26_0 = aaa.a(false) + -250;
                        stackIn_27_0 = stackOut_26_0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var13 = (double)stackIn_27_0;
                        var15 = -50.0 + var13;
                        var17 = 0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (((opa) this).field_r.length <= var17) {
                            statePc = 60;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var18_ref_gsa = ((opa) this).field_r[var17];
                        var19 = (double)(var18_ref_gsa.field_u + var18_ref_gsa.field_v);
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackOut_30_0 = (var19 < 0.0 ? -1 : (var19 == 0.0 ? 0 : 1));
                        stackIn_61_0 = stackOut_30_0;
                        stackIn_31_0 = stackOut_30_0;
                        if (var33 != 0) {
                            statePc = 61;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (stackIn_31_0 == 0) {
                            statePc = 38;
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
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackOut_34_0 = 0.0;
                        stackIn_35_0 = stackOut_34_0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (stackIn_35_0 != var5) {
                            statePc = 40;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
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
                case 38: {
                    try {
                        stackOut_38_0 = 0.0;
                        stackIn_41_0 = stackOut_38_0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackOut_40_0 = var19 / var5 * 100.0;
                        stackIn_41_0 = stackOut_40_0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var21 = stackIn_41_0;
                        var23 = var21 * (var15 / 100.0) / 100.0;
                        var25 = (double)(var18_ref_gsa.field_n + var18_ref_gsa.field_z);
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (0.0 == var25) {
                            statePc = 47;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackOut_43_0 = var5;
                        stackIn_44_0 = stackOut_43_0;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (stackIn_44_0 != 0.0) {
                            statePc = 49;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackOut_47_0 = 0.0;
                        stackIn_50_0 = stackOut_47_0;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackOut_49_0 = 100.0 * (var25 / var5);
                        stackIn_50_0 = stackOut_49_0;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var21 = stackIn_50_0;
                        var27 = var21 * (var15 / 100.0) / 100.0;
                        var29 = (double)(var18_ref_gsa.field_f + var18_ref_gsa.field_a);
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var29 == 0.0) {
                            statePc = 58;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        stackOut_52_0 = 0.0;
                        stackIn_53_0 = stackOut_52_0;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (stackIn_53_0 == var5) {
                            statePc = 58;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        stackOut_56_0 = 100.0 * (var29 / var5);
                        stackIn_59_0 = stackOut_56_0;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        stackOut_58_0 = 0.0;
                        stackIn_59_0 = stackOut_58_0;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var21 = stackIn_59_0;
                        var31 = var21 * (var15 / 100.0) / 100.0;
                        var18_ref_gsa.a(var27, var31, var23, true);
                        var17++;
                        if (var33 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var17 = 50;
                        stackOut_60_0 = (0.0 < var7 ? -1 : (0.0 == var7 ? 0 : 1));
                        stackIn_61_0 = stackOut_60_0;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (stackIn_61_0 >= 0) {
                            statePc = 64;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        efa.field_y = var17;
                        var17 = var4_int * 50 + (var17 - -50);
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        ona.field_H = var17;
                        var17 += 100;
                        var17 += 50;
                        if (var33 == 0) {
                            statePc = 67;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        ((opa) this).field_p = true;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (var9 > 0.0) {
                            statePc = 71;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        ((opa) this).field_m = true;
                        if (var33 == 0) {
                            statePc = 72;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        nta.field_d = var17;
                        var17 = 50 + var4_int * 50 + var17;
                        og.field_m = var17;
                        var17 += 100;
                        var17 += 50;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (0.0 < var11) {
                            statePc = 76;
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
                        ((opa) this).field_o = true;
                        if (var33 == 0) {
                            statePc = 77;
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
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        iv.field_ub = var17;
                        var17 = var17 - -(var4_int * 50) + 50;
                        ema.field_b = var17;
                        var17 += 100;
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if (!((opa) this).field_p) {
                            statePc = 89;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        stackOut_78_0 = this;
                        stackIn_79_0 = stackOut_78_0;
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (!((opa) this).field_m) {
                            statePc = 89;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        stackOut_82_0 = this;
                        stackIn_83_0 = stackOut_82_0;
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (((opa) this).field_o) {
                            statePc = 88;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 87;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        ona.field_H = var17;
                        var17 += 100;
                        var18 = var15 / 100.0;
                        ((opa) this).field_r[((opa) this).field_c.e(2)].field_i = var18;
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        var17 += 100;
                        fd.field_e = var17;
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 91: {
                    var4 = (RuntimeException) (Object) caughtException;
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    try {
                        stackOut_92_0 = (RuntimeException) var4;
                        stackOut_92_1 = new StringBuilder().append("opa.<init>(");
                        stackIn_95_0 = stackOut_92_0;
                        stackIn_95_1 = stackOut_92_1;
                        stackIn_93_0 = stackOut_92_0;
                        stackIn_93_1 = stackOut_92_1;
                        if (param0 == null) {
                            statePc = 95;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        stackOut_93_0 = (RuntimeException) (Object) stackIn_93_0;
                        stackOut_93_1 = (StringBuilder) (Object) stackIn_93_1;
                        stackOut_93_2 = "{...}";
                        stackIn_96_0 = stackOut_93_0;
                        stackIn_96_1 = stackOut_93_1;
                        stackIn_96_2 = stackOut_93_2;
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 94: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 95: {
                    stackOut_95_0 = (RuntimeException) (Object) stackIn_95_0;
                    stackOut_95_1 = (StringBuilder) (Object) stackIn_95_1;
                    stackOut_95_2 = "null";
                    stackIn_96_0 = stackOut_95_0;
                    stackIn_96_1 = stackOut_95_1;
                    stackIn_96_2 = stackOut_95_2;
                    statePc = 96;
                    continue stateLoop;
                }
                case 96: {
                    try {
                        stackOut_96_0 = (RuntimeException) (Object) stackIn_96_0;
                        stackOut_96_1 = ((StringBuilder) (Object) stackIn_96_1).append(stackIn_96_2).append(44);
                        stackIn_99_0 = stackOut_96_0;
                        stackIn_99_1 = stackOut_96_1;
                        stackIn_97_0 = stackOut_96_0;
                        stackIn_97_1 = stackOut_96_1;
                        if (param1 == null) {
                            statePc = 99;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        stackOut_97_0 = (RuntimeException) (Object) stackIn_97_0;
                        stackOut_97_1 = (StringBuilder) (Object) stackIn_97_1;
                        stackOut_97_2 = "{...}";
                        stackIn_100_0 = stackOut_97_0;
                        stackIn_100_1 = stackOut_97_1;
                        stackIn_100_2 = stackOut_97_2;
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 98;
                        continue stateLoop;
                    }
                }
                case 98: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 99: {
                    stackOut_99_0 = (RuntimeException) (Object) stackIn_99_0;
                    stackOut_99_1 = (StringBuilder) (Object) stackIn_99_1;
                    stackOut_99_2 = "null";
                    stackIn_100_0 = stackOut_99_0;
                    stackIn_100_1 = stackOut_99_1;
                    stackIn_100_2 = stackOut_99_2;
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    try {
                        stackOut_100_0 = (RuntimeException) (Object) stackIn_100_0;
                        stackOut_100_1 = ((StringBuilder) (Object) stackIn_100_1).append(stackIn_100_2).append(44);
                        stackIn_103_0 = stackOut_100_0;
                        stackIn_103_1 = stackOut_100_1;
                        stackIn_101_0 = stackOut_100_0;
                        stackIn_101_1 = stackOut_100_1;
                        if (param2 == null) {
                            statePc = 103;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        stackOut_101_0 = (RuntimeException) (Object) stackIn_101_0;
                        stackOut_101_1 = (StringBuilder) (Object) stackIn_101_1;
                        stackOut_101_2 = "{...}";
                        stackIn_104_0 = stackOut_101_0;
                        stackIn_104_1 = stackOut_101_1;
                        stackIn_104_2 = stackOut_101_2;
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 102: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 103: {
                    stackOut_103_0 = (RuntimeException) (Object) stackIn_103_0;
                    stackOut_103_1 = (StringBuilder) (Object) stackIn_103_1;
                    stackOut_103_2 = "null";
                    stackIn_104_0 = stackOut_103_0;
                    stackIn_104_1 = stackOut_103_1;
                    stackIn_104_2 = stackOut_103_2;
                    statePc = 104;
                    continue stateLoop;
                }
                case 104: {
                    throw tba.a((Throwable) (Object) stackIn_104_0, stackIn_104_2 + 41);
                }
                case 105: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        boolean stackIn_8_0 = false;
        boolean stackIn_16_0 = false;
        Object stackIn_22_0 = null;
        w stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        w stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        w stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        boolean stackOut_7_0 = false;
        boolean stackOut_15_0 = false;
        Object stackOut_21_0 = null;
        w stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        w stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int stackOut_39_2 = 0;
        w stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == 80) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ((opa) this).b(76, true);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var3_int = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var3_int >= ((opa) this).field_c.field_H.length) {
                            statePc = 15;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = ((opa) this).field_q;
                        stackIn_16_0 = stackOut_7_0;
                        stackIn_8_0 = stackOut_7_0;
                        if (var5 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (stackIn_8_0) {
                            statePc = 14;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        ((opa) this).field_c.field_H[var3_int].n((byte) -98).a(26, 4, true);
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
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        ((opa) this).field_c.field_H[var3_int].n((byte) -127).a(param0 + 21383);
                        ((opa) this).field_c.field_H[var3_int].n((byte) -54).f(-4366);
                        var3_int++;
                        if (var5 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        ((opa) this).field_q = true;
                        stackOut_15_0 = param1;
                        stackIn_16_0 = stackOut_15_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (stackIn_16_0) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ((opa) this).c(7);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        ((opa) this).field_c.field_E = ((opa) this).field_c.field_E + 1;
                        var3_int = ((opa) this).field_c.field_E;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (fd.field_e > var3_int) {
                            statePc = 32;
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
                        stackOut_21_0 = this;
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
                        if (!((opa) this).field_s) {
                            statePc = 27;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (((opa) this).field_f == null) {
                            statePc = 31;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        ((opa) this).field_f.a(6418);
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        ((opa) this).field_s = true;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var4 = 0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (((opa) this).field_r.length <= var4) {
                            statePc = 38;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        ((opa) this).field_r[var4].a(0, var3_int, var4);
                        var4++;
                        if (var5 != 0) {
                            statePc = 45;
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
                        if (var5 == 0) {
                            statePc = 33;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackOut_38_0 = mr.field_w;
                        stackOut_38_1 = param0 + 35;
                        stackIn_41_0 = stackOut_38_0;
                        stackIn_41_1 = stackOut_38_1;
                        stackIn_39_0 = stackOut_38_0;
                        stackIn_39_1 = stackOut_38_1;
                        if (param1) {
                            statePc = 41;
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
                        stackOut_39_0 = (w) (Object) stackIn_39_0;
                        stackOut_39_1 = stackIn_39_1;
                        stackOut_39_2 = 1;
                        stackIn_42_0 = stackOut_39_0;
                        stackIn_42_1 = stackOut_39_1;
                        stackIn_42_2 = stackOut_39_2;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackOut_41_0 = (w) (Object) stackIn_41_0;
                        stackOut_41_1 = stackIn_41_1;
                        stackOut_41_2 = 0;
                        stackIn_42_0 = stackOut_41_0;
                        stackIn_42_1 = stackOut_41_1;
                        stackIn_42_2 = stackOut_41_2;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        ((w) (Object) stackIn_42_0).a(stackIn_42_1, stackIn_42_2 != 0);
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 44: {
                    var3 = (RuntimeException) (Object) caughtException;
                    throw tba.a((Throwable) (Object) var3, "opa.B(" + param0 + 44 + param1 + 41);
                }
                case 45: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
    }
}
