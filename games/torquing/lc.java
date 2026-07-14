/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class lc extends ro {
    static int field_z;
    static String field_B;

    public static void a(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              if (!param0) {
                break L0;
              } else {
                field_z = 16;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          field_B = null;
        }
    }

    public lc() {
    }

    final static bp a(boolean param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        bp stackIn_6_0 = null;
        bp stackIn_11_0 = null;
        bp stackIn_27_0 = null;
        bp stackIn_30_0 = null;
        Object stackIn_33_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        bp stackOut_5_0 = null;
        bp stackOut_10_0 = null;
        bp stackOut_26_0 = null;
        bp stackOut_29_0 = null;
        Object stackOut_32_0 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = Torquing.field_u;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = param1.length();
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (0 == var2_int) {
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
                        statePc = 7;
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
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = oj.field_l;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0;
                }
                case 7: {
                    try {
                        if ((var2_int ^ -1) < -64) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = wn.field_s;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return stackIn_11_0;
                }
                case 12: {
                    try {
                        if (!param0) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        lc.a(-40, -69, -28, 124, -109, 120, -40);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var3 = 0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var3 >= var2_int) {
                            statePc = 32;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var4 = param1.charAt(var3);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var4 != 45) {
                            statePc = 28;
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
                        if ((var3 ^ -1) == -1) {
                            statePc = 26;
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
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var2_int - 1 != var3) {
                            statePc = 31;
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
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackOut_26_0 = va.field_H;
                        stackIn_27_0 = stackOut_26_0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 27: {
                    return stackIn_27_0;
                }
                case 28: {
                    try {
                        if (0 != (kl.field_t.indexOf(var4) ^ -1)) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackOut_29_0 = va.field_H;
                        stackIn_30_0 = stackOut_29_0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 30: {
                    return stackIn_30_0;
                }
                case 31: {
                    try {
                        var3++;
                        if (var5 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackOut_32_0 = null;
                        stackIn_33_0 = stackOut_32_0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 33: {
                    return (bp) (Object) stackIn_33_0;
                }
                case 34: {
                    var2 = (RuntimeException) (Object) caughtException;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    try {
                        stackOut_35_0 = (RuntimeException) var2;
                        stackOut_35_1 = new StringBuilder().append("lc.C(").append(param0).append(44);
                        stackIn_38_0 = stackOut_35_0;
                        stackIn_38_1 = stackOut_35_1;
                        stackIn_36_0 = stackOut_35_0;
                        stackIn_36_1 = stackOut_35_1;
                        if (param1 == null) {
                            statePc = 38;
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
                        stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
                        stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
                        stackOut_36_2 = "{...}";
                        stackIn_39_0 = stackOut_36_0;
                        stackIn_39_1 = stackOut_36_1;
                        stackIn_39_2 = stackOut_36_2;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 37: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 38: {
                    stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
                    stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
                    stackOut_38_2 = "null";
                    stackIn_39_0 = stackOut_38_0;
                    stackIn_39_1 = stackOut_38_1;
                    stackIn_39_2 = stackOut_38_2;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    throw rb.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static long h(byte param0) {
        RuntimeException var1 = null;
        long stackIn_2_0 = 0L;
        long stackIn_4_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        long stackOut_1_0 = 0L;
        long stackOut_3_0 = 0L;
        try {
          if (param0 == -76) {
            return stackIn_2_0;
          } else {
            stackOut_1_0 = -86L;
            stackIn_2_0 = stackOut_1_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_3_0 = km.b(-1) - rb.field_C;
          stackIn_4_0 = stackOut_3_0;
        }
        return 0L;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (-param5 + param1 < kn.field_e) {
                            statePc = 16;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = qg.field_z;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (stackIn_2_0 < param1 - -param5) {
                            statePc = 16;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = j.field_q;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (stackIn_6_0 > param3 - param5) {
                            statePc = 16;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = param3;
                        stackIn_10_0 = stackOut_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0 + param5 > qk.field_p) {
                            statePc = 16;
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
                        mh.a(param0, param1, param5, param6, param3, 15783, param4);
                        if (Torquing.field_u == 0) {
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
                        ue.a(-15788, param1, param3, param6, param5, param0, param4);
                        statePc = 17;
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
                        var7_int = 124 / ((param2 - -16) / 61);
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 21: {
                    var7 = (RuntimeException) (Object) caughtException;
                    throw rb.a((Throwable) (Object) var7, "lc.G(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
                }
                case 22: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int[][] a(int param0, int param1) {
        int[][] var3 = null;
        RuntimeException var3_ref = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[][] stackIn_20_0 = null;
        int[][] stackOut_19_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = Torquing.field_u;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3 = ((lc) this).field_r.a(15142, param1);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (!((lc) this).field_r.field_b) {
                            statePc = 15;
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
                        if (((lc) this).c(-31292)) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var4 = var3[0];
                        var5 = var3[1];
                        var6 = var3[2];
                        var7 = ((lc) this).field_u * (param1 % ((lc) this).field_u);
                        var8 = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var8 >= ci.field_c) {
                            statePc = 15;
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
                        var9 = ((lc) this).field_s[var8 % ((lc) this).field_x + var7];
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var6[var8] = ie.a(4080, var9 << 1059507172);
                        var5[var8] = ie.a(var9 >> -188440796, 4080);
                        var4[var8] = ie.a(4080, var9 >> 774516140);
                        var8++;
                        if (var10 != 0) {
                            statePc = 19;
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
                        if (var10 == 0) {
                            statePc = 9;
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
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (param0 == -29116) {
                            statePc = 19;
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
                        field_z = 43;
                        statePc = 17;
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
                        stackOut_19_0 = (int[][]) var3;
                        stackIn_20_0 = stackOut_19_0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 20: {
                    return stackIn_20_0;
                }
                case 21: {
                    var3_ref = (RuntimeException) (Object) caughtException;
                    throw rb.a((Throwable) (Object) var3_ref, "lc.B(" + param0 + 44 + param1 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void g(int param0) {
        RuntimeException var1 = null;
        t var1_ref = null;
        int var2_int = 0;
        String var2 = null;
        int var3 = 0;
        int var4 = 0;
        t stackIn_45_0 = null;
        int stackIn_52_0 = 0;
        t stackOut_44_0 = null;
        int stackOut_51_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Torquing.field_u;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ph.c(243, 197, 369, 143, 16777215);
                        ph.d(244, 198, 367, 141, 0);
                        if (null == nc.field_d) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (null != kl.field_o) {
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
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        int discarded$3 = kl.field_o.a(vo.field_e, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return;
                }
                case 9: {
                    try {
                        var1_ref = nc.field_d[da.field_a];
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (null == var1_ref) {
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
                        var1_ref.d(245, 199);
                        if (var4 == 0) {
                            statePc = 20;
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
                        if (kl.field_o != null) {
                            statePc = 19;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        int discarded$4 = kl.field_o.a(vo.field_e, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (param0 >= 68) {
                            statePc = 24;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        lc.g(6);
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if ((op.field_j ^ -1) < (mf.field_t ^ -1)) {
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
                        statePc = 39;
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
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var1_ref = nc.field_d[gf.field_h];
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (null != var1_ref) {
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
                        statePc = 39;
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
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var2_int = (60 + var1_ref.field_w) * mf.field_t / op.field_j;
                        var3 = var2_int - 30;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (!pp.field_c) {
                            statePc = 36;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        ql.a(-256 * var3 / 30, 245, var1_ref, 199, (-var3 + var1_ref.field_w) * 256 / 30, (byte) -122);
                        if (var4 == 0) {
                            statePc = 39;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        ql.a(256 * (var1_ref.field_w + -var3) / 30, 245, var1_ref, 199, -256 * var3 / 30, (byte) -81);
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (null == kl.field_o) {
                            statePc = 67;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var2 = null;
                        var3 = 0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var3 >= nc.field_d.length) {
                            statePc = 61;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var1_ref = nc.field_d[var3];
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (var4 != 0) {
                            statePc = 64;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackOut_44_0 = (t) var1_ref;
                        stackIn_45_0 = stackOut_44_0;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (stackIn_45_0 == null) {
                            statePc = 60;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if ((var1_ref.field_w ^ -1) != -366) {
                            statePc = 55;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackOut_51_0 = -140;
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
                        if (stackIn_52_0 == (var1_ref.field_u ^ -1)) {
                            statePc = 60;
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
                        if (null != var2) {
                            statePc = 59;
                        } else {
                            statePc = 56;
                        }
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
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var2 = Integer.toString(var3);
                        if (var4 == 0) {
                            statePc = 60;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var2 = var2 + ", " + var3;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var3++;
                        if (var4 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (null != var2) {
                            statePc = 64;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        int discarded$5 = kl.field_o.a("Screenshot(s) " + var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 66: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw rb.a((Throwable) (Object) var1, "lc.J(" + param0 + 41);
                }
                case 67: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void b(int param0, int param1) {
        df var2 = null;
        try {
            var2 = wa.field_d;
            var2.f(87, param1);
            var2.b(90, 1);
            var2.b(90, param0);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "lc.D(" + param0 + 44 + param1 + 41);
        }
    }

    final static void d(int param0) {
        RuntimeException var1 = null;
        uf[] var1_array = null;
        int[] var2 = null;
        short[] var3 = null;
        t var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        kh var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        sg var11 = null;
        int var11_int = 0;
        int var12 = 0;
        int var13 = 0;
        rm var13_ref = null;
        int var14 = 0;
        int var15_int = 0;
        t var15 = null;
        int var16 = 0;
        t var16_ref = null;
        int var17 = 0;
        kh var17_ref_kh = null;
        sg var18 = null;
        int var18_int = 0;
        int[] var19 = null;
        int var19_int = 0;
        int[] var20 = null;
        t var20_ref = null;
        int[] var21_ref_int__ = null;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        long var24 = 0L;
        int var26 = 0;
        int var27 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        String[] stackIn_12_0 = null;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        Throwable caughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        String[] stackOut_11_0 = null;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_57_1 = 0;
        int stackOut_66_0 = 0;
        int stackOut_66_1 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var27 = Torquing.field_u;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    var1_array = new uf[]{new uf((uc) (Object) qh.field_c, 0, 517, 298, (sm) null, 0, 0)};
                    var2 = new int[]{0, 1, 2, 4, 6, 5, 9, 18, 7, 8};
                    var3 = new short[]{(short) 0, (short) 2, (short) 4, (short) 3, (short) 1, (short) 5};
                    var4 = new t(8, 1);
                    var5 = ph.field_e;
                    var6 = ph.field_j;
                    var7 = ph.field_d;
                    var1_array = rh.a((byte) -101, var1_array, var4, vd.field_a);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    ln.a(1, 0, var1_array, (byte) -58);
                    if (param0 == -1339942685) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    field_B = null;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    var1_array = rh.a((byte) 114, var1_array, kl.field_p, "");
                    var1_array[0].a((byte) -15, 2);
                    var1_array = rh.a((byte) 116, var1_array, var4, hl.field_c);
                    var1_array[0].a((byte) 101, 1);
                    var1_array = rh.a((byte) 125, var1_array, var4, q.field_i);
                    ln.a(1, 0, var1_array, (byte) -58);
                    var1_array[-1 + var1_array.length].c(0);
                    var1_array[var1_array.length + -1].d(102);
                    var1_array = rh.a((byte) -122, var1_array, var4, eq.field_c);
                    ln.a(0, dd.field_c.field_x, var1_array, (byte) -58);
                    hh.field_e = new t[m.field_n.length];
                    be.field_g = 30;
                    var8 = var2;
                    var9 = 0;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    stackOut_7_0 = var8.length ^ -1;
                    stackOut_7_1 = var9 ^ -1;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (stackIn_8_0 >= stackIn_8_1) {
                        statePc = 53;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var10 = var8[var9];
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (var27 != 0) {
                        statePc = 54;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    stackOut_11_0 = m.field_n;
                    stackIn_12_0 = stackOut_11_0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (stackIn_12_0[var10] != null) {
                        statePc = 17;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var11_int = be.field_l[200];
                    var12 = be.field_o[200];
                    var13_ref = vc.field_c[var10].field_l;
                    var14 = 99999;
                    var15_int = -99999;
                    var16 = 0;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if ((var16 ^ -1) <= (var13_ref.field_f ^ -1)) {
                        statePc = 25;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var17 = var13_ref.field_B[var16];
                    var18_int = var13_ref.field_E[var16];
                    var19_int = var12 * var17 - var18_int * var11_int >> -1164166256;
                    var18_int = var11_int * var17 - -(var18_int * var12) >> -740545232;
                    var17 = (var19_int << -875284055) / (1024 + var18_int);
                    stackOut_19_0 = var17;
                    stackOut_19_1 = var14;
                    stackIn_8_0 = stackOut_19_0;
                    stackIn_8_1 = stackOut_19_1;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    if (var27 != 0) {
                        statePc = 8;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (stackIn_20_0 >= stackIn_20_1) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var14 = var17;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if ((var17 ^ -1) >= (var15_int ^ -1)) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var15_int = var17;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    var16++;
                    if (var27 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var16_ref = new t(60, -var14 + (1 + var15_int));
                    hh.field_e[var10] = var16_ref;
                    var16_ref.e();
                    be.a();
                    var17_ref_kh = vc.field_c[var10];
                    var18 = new sg(1);
                    var18.a(0, var17_ref_kh);
                    var19 = new int[]{0, 0, 0, 65535, 0, 0, 0, var12, var11_int, 0, -var11_int, var12};
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    if ((var10 ^ -1) == -2) {
                        statePc = 29;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var20 = new int[]{0, 0, 0, 0, 0, 65536, 0, 65536, 0, 65536, 0, 0};
                    var21_ref_int__ = new int[12];
                    var22 = 0;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    stackOut_30_0 = 3;
                    stackIn_31_0 = stackOut_30_0;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if (stackIn_31_0 <= var22) {
                        statePc = 46;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    stackOut_32_0 = 0;
                    stackIn_48_0 = stackOut_32_0;
                    stackIn_33_0 = stackOut_32_0;
                    if (var27 != 0) {
                        statePc = 48;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var23 = stackIn_33_0;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    if (3 <= var23) {
                        statePc = 45;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var24 = 0L;
                    stackOut_35_0 = 0;
                    stackIn_31_0 = stackOut_35_0;
                    stackIn_36_0 = stackOut_35_0;
                    if (var27 != 0) {
                        statePc = 31;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var26 = stackIn_36_0;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (3 <= var26) {
                        statePc = 43;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var24 = var24 + (long)var19[3 + (var23 + var26 * 3)] * (long)var20[var22 * 3 + var26 - -3];
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    var26++;
                    if (var27 != 0) {
                        statePc = 44;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (var27 == 0) {
                        statePc = 37;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    var21_ref_int__[3 + (var22 * 3 + var23)] = (int)(var24 >>> 1388403856);
                    var23++;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    if (var27 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    var22++;
                    if (var27 == 0) {
                        statePc = 30;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    var19 = var21_ref_int__;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    var18.a(var17_ref_kh, var19);
                    sg.a(var17_ref_kh, 80, 1365, -1, -12, 12);
                    be.field_b = -var14;
                    var18.a(new int[12]);
                    stackOut_47_0 = var10;
                    stackIn_48_0 = stackOut_47_0;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    if (stackIn_48_0 == 0) {
                        statePc = 50;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var20_ref = new t(60, var15_int - (var14 - -31));
                    var21 = (-31 + (var15_int + -var14)) / 2;
                    t.a(var16_ref, var20_ref, 0, 0, 0, 0, 60, var21);
                    var22 = -var21 + var20_ref.field_t;
                    t.a(var16_ref, var20_ref, 0, var16_ref.field_t - var22, 0, var21, 60, var22);
                    var16_ref = new t(var20_ref.field_s, var20_ref.field_t / 2);
                    var16_ref.e();
                    var20_ref.c(var20_ref.field_s << 1980166307, var20_ref.field_t << -1339942685, var16_ref.field_s << 471761315, var16_ref.field_t << -1328843485, 0, 2048);
                    hh.field_e[var10] = var16_ref;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    var1_array = rh.a((byte) 111, var1_array, var16_ref, m.field_n[var10]);
                    ln.a(0, dd.field_c.field_x, var1_array, (byte) -58);
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    var9++;
                    if (var27 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    var1_array[-1 + var1_array.length].d(param0 ^ -1339942758);
                    var1_array = rh.a((byte) -110, var1_array, var4, vp.field_G);
                    ln.a(0, dd.field_c.field_x, var1_array, (byte) -58);
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    var8_ref = new kh(new rm(8, 2, 2));
                    var8_ref.field_q = new mp(2);
                    int discarded$4 = var8_ref.field_l.a(-60, -60, 0);
                    int discarded$5 = var8_ref.field_l.a(60, -60, 0);
                    int discarded$6 = var8_ref.field_l.a(-60, 60, 0);
                    int discarded$7 = var8_ref.field_l.a(60, 60, 0);
                    oj.a(3, (short) 0, 0, false, true, 1, 0, (short) -1, 2, var8_ref);
                    oj.a(1, (short) 0, 3, false, true, 2, 3, (short) -1, 1, var8_ref);
                    var9 = be.field_l[1664];
                    var10 = be.field_o[1664];
                    be.field_g = 40;
                    var11 = new sg(1);
                    var11.a(0, var8_ref);
                    var11.a(var8_ref, new int[12]);
                    var12 = 99999;
                    var13 = -99999;
                    var14 = 0;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    if ((var8_ref.field_l.field_f ^ -1) >= (var14 ^ -1)) {
                        statePc = 65;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    var15_int = var8_ref.field_l.field_B[var14];
                    var16 = var8_ref.field_l.field_E[var14];
                    var17 = var10 * var15_int + -(var16 * var9) >> -1836488944;
                    var16 = var16 * var10 + var9 * var15_int >> -848667088;
                    var15_int = (var17 << -1478939895) / (var16 + 1024);
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    stackOut_57_0 = var12 ^ -1;
                    stackOut_57_1 = var15_int ^ -1;
                    stackIn_67_0 = stackOut_57_0;
                    stackIn_67_1 = stackOut_57_1;
                    stackIn_58_0 = stackOut_57_0;
                    stackIn_58_1 = stackOut_57_1;
                    if (var27 != 0) {
                        statePc = 67;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    if (stackIn_58_0 >= stackIn_58_1) {
                        statePc = 62;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    var12 = var15_int;
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    if (var15_int <= var13) {
                        statePc = 64;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    var13 = var15_int;
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    var14++;
                    if (var27 == 0) {
                        statePc = 55;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    var14 = 0;
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    stackOut_66_0 = ga.field_d.length;
                    stackOut_66_1 = var14;
                    stackIn_67_0 = stackOut_66_0;
                    stackIn_67_1 = stackOut_66_1;
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    if (stackIn_67_0 <= stackIn_67_1) {
                        statePc = 73;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    var15 = new t(80, var13 + 1 - var12);
                    var15.e();
                    be.a();
                    var8_ref.field_l.field_A[0] = var3[var14];
                    var8_ref.field_l.field_m[1] = (short)be.field_c.b((int) var3[var14]);
                    var8_ref.field_q.field_v = null;
                    var8_ref.field_k = null;
                    var11.a(0, 80, 1365, 0, -1, 0);
                    be.field_b = -var12;
                    var11.a(new int[12]);
                    var1_array = rh.a((byte) 120, var1_array, var15, ga.field_d[var3[var14]]);
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    ln.a(0, dd.field_c.field_x, var1_array, (byte) -58);
                    var14++;
                    if (var27 != 0) {
                        statePc = 76;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    if (var27 == 0) {
                        statePc = 66;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    var1_array[var1_array.length + -1].c(0);
                    hg.field_b = var1_array;
                    ph.a(var5, var6, var7);
                    be.a();
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = 0;
        field_B = "achievements to collect";
    }
}
