/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.Object;

final class m extends mc {
    static int[][] field_w;
    static gq field_A;
    static bc field_z;
    static int[] field_x;
    static String field_v;
    private Object field_y;

    final Object e(byte param0) {
        RuntimeException var2 = null;
        Object stackIn_5_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        try {
          try {
            L0: {
              if (param0 < -106) {
                break L0;
              } else {
                field_v = null;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = ((m) this).field_y;
          stackIn_5_0 = stackOut_4_0;
        }
        return null;
    }

    final static boolean f(byte param0) {
        RuntimeException var1 = null;
        boolean stackIn_6_0 = false;
        int stackIn_15_0 = 0;
        boolean stackOut_5_0 = false;
        int stackOut_12_0 = 0;
        int stackOut_14_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 >= 111) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        m.a((byte) -50, (int[]) null, (bc) null, (nk[]) null, (bc) null);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (!hg.field_r) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = h.field_q;
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
                        if (stackIn_6_0) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (!w.d(true)) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = 1;
                        stackIn_15_0 = stackOut_12_0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 13;
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
                        stackOut_14_0 = 0;
                        stackIn_15_0 = stackOut_14_0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return stackIn_15_0 != 0;
                }
                case 16: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw r.a((Throwable) (Object) var1, "m.B(" + param0 + 41);
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
              field_A = null;
              field_z = null;
              if (param0 < -107) {
                break L0;
              } else {
                field_w = null;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          field_v = null;
          field_w = null;
          field_x = null;
        }
    }

    final boolean e(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        try {
          if (!param0) {
            return stackIn_2_0 != 0;
          } else {
            stackOut_1_0 = 0;
            stackIn_2_0 = stackOut_1_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
        }
        return false;
    }

    final static void a(byte param0, fs[] param1, ob param2, int param3, pf param4, int param5, me param6, fs param7, l param8, boolean param9) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12_int = 0;
        sd var12 = null;
        cs var12_ref = null;
        lo var13_ref = null;
        int var13 = 0;
        ln var14_ref = null;
        int var14 = 0;
        ln var15 = null;
        int var16 = 0;
        oh stackIn_24_0 = null;
        Object stackIn_26_0 = null;
        ln stackIn_29_0 = null;
        ln stackIn_32_0 = null;
        ln stackIn_33_0 = null;
        sd stackIn_33_1 = null;
        Object stackIn_41_0 = null;
        lo stackIn_47_0 = null;
        fs[] stackIn_51_0 = null;
        Object stackIn_63_0 = null;
        ln stackIn_72_0 = null;
        ln stackIn_73_0 = null;
        lo stackIn_73_1 = null;
        int stackIn_83_0 = 0;
        int stackIn_85_0 = 0;
        boolean stackIn_88_0 = false;
        int stackIn_102_0 = 0;
        ln stackIn_115_0 = null;
        int stackIn_118_0 = 0;
        RuntimeException stackIn_126_0 = null;
        StringBuilder stackIn_126_1 = null;
        RuntimeException stackIn_128_0 = null;
        StringBuilder stackIn_128_1 = null;
        RuntimeException stackIn_129_0 = null;
        StringBuilder stackIn_129_1 = null;
        String stackIn_129_2 = null;
        RuntimeException stackIn_130_0 = null;
        StringBuilder stackIn_130_1 = null;
        RuntimeException stackIn_132_0 = null;
        StringBuilder stackIn_132_1 = null;
        RuntimeException stackIn_133_0 = null;
        StringBuilder stackIn_133_1 = null;
        String stackIn_133_2 = null;
        RuntimeException stackIn_134_0 = null;
        StringBuilder stackIn_134_1 = null;
        RuntimeException stackIn_136_0 = null;
        StringBuilder stackIn_136_1 = null;
        RuntimeException stackIn_137_0 = null;
        StringBuilder stackIn_137_1 = null;
        String stackIn_137_2 = null;
        RuntimeException stackIn_138_0 = null;
        StringBuilder stackIn_138_1 = null;
        RuntimeException stackIn_140_0 = null;
        StringBuilder stackIn_140_1 = null;
        RuntimeException stackIn_141_0 = null;
        StringBuilder stackIn_141_1 = null;
        String stackIn_141_2 = null;
        RuntimeException stackIn_142_0 = null;
        StringBuilder stackIn_142_1 = null;
        RuntimeException stackIn_144_0 = null;
        StringBuilder stackIn_144_1 = null;
        RuntimeException stackIn_145_0 = null;
        StringBuilder stackIn_145_1 = null;
        String stackIn_145_2 = null;
        RuntimeException stackIn_146_0 = null;
        StringBuilder stackIn_146_1 = null;
        RuntimeException stackIn_148_0 = null;
        StringBuilder stackIn_148_1 = null;
        RuntimeException stackIn_149_0 = null;
        StringBuilder stackIn_149_1 = null;
        String stackIn_149_2 = null;
        oh stackOut_23_0 = null;
        oh stackOut_24_0 = null;
        ln stackOut_28_0 = null;
        ln stackOut_31_0 = null;
        ln stackOut_32_0 = null;
        sd stackOut_32_1 = null;
        oh stackOut_40_0 = null;
        lo stackOut_46_0 = null;
        fs[] stackOut_50_0 = null;
        Object stackOut_62_0 = null;
        ln stackOut_71_0 = null;
        ln stackOut_72_0 = null;
        lo stackOut_72_1 = null;
        int stackOut_82_0 = 0;
        int stackOut_84_0 = 0;
        boolean stackOut_87_0 = false;
        int stackOut_101_0 = 0;
        oh stackOut_114_0 = null;
        int stackOut_117_0 = 0;
        RuntimeException stackOut_125_0 = null;
        StringBuilder stackOut_125_1 = null;
        RuntimeException stackOut_126_0 = null;
        StringBuilder stackOut_126_1 = null;
        String stackOut_126_2 = null;
        RuntimeException stackOut_128_0 = null;
        StringBuilder stackOut_128_1 = null;
        String stackOut_128_2 = null;
        RuntimeException stackOut_129_0 = null;
        StringBuilder stackOut_129_1 = null;
        RuntimeException stackOut_130_0 = null;
        StringBuilder stackOut_130_1 = null;
        String stackOut_130_2 = null;
        RuntimeException stackOut_132_0 = null;
        StringBuilder stackOut_132_1 = null;
        String stackOut_132_2 = null;
        RuntimeException stackOut_133_0 = null;
        StringBuilder stackOut_133_1 = null;
        RuntimeException stackOut_134_0 = null;
        StringBuilder stackOut_134_1 = null;
        String stackOut_134_2 = null;
        RuntimeException stackOut_136_0 = null;
        StringBuilder stackOut_136_1 = null;
        String stackOut_136_2 = null;
        RuntimeException stackOut_137_0 = null;
        StringBuilder stackOut_137_1 = null;
        RuntimeException stackOut_138_0 = null;
        StringBuilder stackOut_138_1 = null;
        String stackOut_138_2 = null;
        RuntimeException stackOut_140_0 = null;
        StringBuilder stackOut_140_1 = null;
        String stackOut_140_2 = null;
        RuntimeException stackOut_141_0 = null;
        StringBuilder stackOut_141_1 = null;
        RuntimeException stackOut_142_0 = null;
        StringBuilder stackOut_142_1 = null;
        String stackOut_142_2 = null;
        RuntimeException stackOut_144_0 = null;
        StringBuilder stackOut_144_1 = null;
        String stackOut_144_2 = null;
        RuntimeException stackOut_145_0 = null;
        StringBuilder stackOut_145_1 = null;
        RuntimeException stackOut_146_0 = null;
        StringBuilder stackOut_146_1 = null;
        String stackOut_146_2 = null;
        RuntimeException stackOut_148_0 = null;
        StringBuilder stackOut_148_1 = null;
        String stackOut_148_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = ShatteredPlansClient.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!param9) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        param8.a(param2, param1, 127);
                        if (var16 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        param8.a((byte) -87, param1, param2);
                        statePc = 6;
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
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        param8.a(10529, param2, param1);
                        var10_int = 0;
                        var11 = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((var11 ^ -1) <= (param1.length ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var10_int = var10_int + param1[var11].field_i.e(0);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var11++;
                        if (var16 != 0) {
                            statePc = 16;
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
                        if (var16 == 0) {
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
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        param2.c(var10_int, (byte) -89);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (param0 <= -57) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        field_v = null;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var11 = 0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (param1.length <= var11) {
                            statePc = 43;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var16 != 0) {
                            statePc = 44;
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
                        stackOut_23_0 = param1[var11].field_i.d(0);
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
                    try {
                        stackOut_24_0 = (oh) (Object) stackIn_24_0;
                        stackIn_26_0 = (Object) (Object) stackOut_24_0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var12 = (sd) (Object) stackIn_26_0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (null == var12) {
                            statePc = 42;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        im.a(var12.field_o, param2, 9555);
                        di.a(var12.field_q, false, param2);
                        var13 = var12.g(89);
                        param2.c(var13, (byte) -112);
                        stackOut_28_0 = var12.j(18229);
                        stackIn_26_0 = (Object) (Object) stackOut_28_0;
                        stackIn_29_0 = stackOut_28_0;
                        if (var16 != 0) {
                            statePc = 26;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var14_ref = stackIn_29_0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (null == var14_ref) {
                            statePc = 40;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackOut_31_0 = (ln) var14_ref;
                        stackIn_41_0 = (Object) (Object) stackOut_31_0;
                        stackIn_32_0 = stackOut_31_0;
                        if (var16 != 0) {
                            statePc = 41;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackOut_32_0 = (ln) (Object) stackIn_32_0;
                        stackOut_32_1 = (sd) var12;
                        stackIn_33_0 = stackOut_32_0;
                        stackIn_33_1 = stackOut_32_1;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (stackIn_33_0 != stackIn_33_1.field_q) {
                            statePc = 38;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        di.a(var14_ref, false, param2);
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var14_ref = var12.h(-23410);
                        if (var16 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackOut_40_0 = param1[var11].field_i.a((byte) -71);
                        stackIn_41_0 = (Object) (Object) stackOut_40_0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var12 = (sd) (Object) stackIn_41_0;
                        if (var16 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var11++;
                        if (var16 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var11 = 0;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var12_int = 0;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (param1.length <= var12_int) {
                            statePc = 58;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackOut_46_0 = param1[var12_int].field_m;
                        stackIn_115_0 = (ln) (Object) stackOut_46_0;
                        stackIn_47_0 = stackOut_46_0;
                        if (var16 != 0) {
                            statePc = 115;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (stackIn_47_0 == null) {
                            statePc = 57;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackOut_50_0 = (fs[]) param1;
                        stackIn_51_0 = stackOut_50_0;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if ((((lo) (Object) stackIn_51_0[var12_int].field_m).g(-68) ^ -1) >= -1) {
                            statePc = 57;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var11++;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var12_int++;
                        if (var16 == 0) {
                            statePc = 45;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        param2.c(var11, (byte) -118);
                        var12_int = 0;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (var12_int >= param1.length) {
                            statePc = 81;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var13_ref = param1[var12_int].field_m;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (var16 != 0) {
                            statePc = 82;
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
                        stackOut_62_0 = null;
                        stackIn_63_0 = stackOut_62_0;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (stackIn_63_0 == (Object) (Object) var13_ref) {
                            statePc = 80;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (var13_ref.g(122) <= 0) {
                            statePc = 80;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        im.a(param1[var12_int], param2, 9555);
                        di.a(var13_ref.field_q, false, param2);
                        var14 = var13_ref.g(-127);
                        param2.c(var14, (byte) -69);
                        var15 = var13_ref.j(18229);
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (null == var15) {
                            statePc = 80;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        stackOut_71_0 = (ln) var15;
                        stackIn_115_0 = stackOut_71_0;
                        stackIn_72_0 = stackOut_71_0;
                        if (var16 != 0) {
                            statePc = 115;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        stackOut_72_0 = (ln) (Object) stackIn_72_0;
                        stackOut_72_1 = (lo) var13_ref;
                        stackIn_73_0 = stackOut_72_0;
                        stackIn_73_1 = stackOut_72_1;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (stackIn_73_0 != stackIn_73_1.field_q) {
                            statePc = 78;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 76;
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
                case 76: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        di.a(var15, false, param2);
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var15 = var13_ref.h(-23410);
                        if (var16 == 0) {
                            statePc = 70;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        var12_int++;
                        if (var16 == 0) {
                            statePc = 59;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        var12_int = 0;
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        stackOut_82_0 = var12_int;
                        stackIn_83_0 = stackOut_82_0;
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (stackIn_83_0 >= param1.length) {
                            statePc = 97;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        stackOut_84_0 = var12_int + 1;
                        stackIn_102_0 = stackOut_84_0;
                        stackIn_85_0 = stackOut_84_0;
                        if (var16 != 0) {
                            statePc = 102;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        var13 = stackIn_85_0;
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if ((var13 ^ -1) <= (param1.length ^ -1)) {
                            statePc = 96;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        stackOut_87_0 = param1[var12_int].field_h[var13];
                        stackIn_83_0 = stackOut_87_0 ? 1 : 0;
                        stackIn_88_0 = stackOut_87_0;
                        if (var16 != 0) {
                            statePc = 83;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        if (stackIn_88_0) {
                            statePc = 92;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        param2.c(127, (byte) -88);
                        if (var16 == 0) {
                            statePc = 95;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        param2.c(param1[var12_int].field_f[var13], (byte) -55);
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        var13++;
                        if (var16 == 0) {
                            statePc = 86;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        var12_int++;
                        if (var16 == 0) {
                            statePc = 82;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if (param7 != null) {
                            statePc = 100;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 99;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        param2.c(param7.field_w, (byte) -127);
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        stackOut_101_0 = 0;
                        stackIn_102_0 = stackOut_101_0;
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        var12_int = stackIn_102_0;
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        if ((param1.length ^ -1) >= (var12_int ^ -1)) {
                            statePc = 113;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        if (var16 != 0) {
                            statePc = 114;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        var13 = 0;
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        if (var13 >= 4) {
                            statePc = 111;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        param2.c(param1[var12_int].field_u[var13], (byte) -94);
                        var13++;
                        if (var16 != 0) {
                            statePc = 112;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        if (var16 == 0) {
                            statePc = 106;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        var12_int++;
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        if (var16 == 0) {
                            statePc = 103;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        param2.c(param4.e(0), (byte) -67);
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        stackOut_114_0 = param4.d(0);
                        stackIn_115_0 = (ln) (Object) stackOut_114_0;
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        var12_ref = (cs) (Object) stackIn_115_0;
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        if (var12_ref == null) {
                            statePc = 122;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        di.a(var12_ref.field_n, false, param2);
                        di.a(var12_ref.field_k, false, param2);
                        param2.c(var12_ref.field_m, (byte) -82);
                        var12_ref = (cs) (Object) param4.a((byte) -71);
                        stackOut_117_0 = var16;
                        stackIn_118_0 = stackOut_117_0;
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        if (stackIn_118_0 != 0) {
                            statePc = 150;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        if (var16 == 0) {
                            statePc = 116;
                        } else {
                            statePc = 120;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        param6.a(-3, param2);
                        param2.c(param5, (byte) -125);
                        param2.c(param3, (byte) -90);
                        statePc = 150;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 124: {
                    var10 = (RuntimeException) (Object) caughtException;
                    statePc = 125;
                    continue stateLoop;
                }
                case 125: {
                    try {
                        stackOut_125_0 = (RuntimeException) var10;
                        stackOut_125_1 = new StringBuilder().append("m.A(").append(param0).append(44);
                        stackIn_128_0 = stackOut_125_0;
                        stackIn_128_1 = stackOut_125_1;
                        stackIn_126_0 = stackOut_125_0;
                        stackIn_126_1 = stackOut_125_1;
                        if (param1 == null) {
                            statePc = 128;
                        } else {
                            statePc = 126;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        stackOut_126_0 = (RuntimeException) (Object) stackIn_126_0;
                        stackOut_126_1 = (StringBuilder) (Object) stackIn_126_1;
                        stackOut_126_2 = "{...}";
                        stackIn_129_0 = stackOut_126_0;
                        stackIn_129_1 = stackOut_126_1;
                        stackIn_129_2 = stackOut_126_2;
                        statePc = 129;
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 127: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 128: {
                    stackOut_128_0 = (RuntimeException) (Object) stackIn_128_0;
                    stackOut_128_1 = (StringBuilder) (Object) stackIn_128_1;
                    stackOut_128_2 = "null";
                    stackIn_129_0 = stackOut_128_0;
                    stackIn_129_1 = stackOut_128_1;
                    stackIn_129_2 = stackOut_128_2;
                    statePc = 129;
                    continue stateLoop;
                }
                case 129: {
                    try {
                        stackOut_129_0 = (RuntimeException) (Object) stackIn_129_0;
                        stackOut_129_1 = ((StringBuilder) (Object) stackIn_129_1).append(stackIn_129_2).append(44);
                        stackIn_132_0 = stackOut_129_0;
                        stackIn_132_1 = stackOut_129_1;
                        stackIn_130_0 = stackOut_129_0;
                        stackIn_130_1 = stackOut_129_1;
                        if (param2 == null) {
                            statePc = 132;
                        } else {
                            statePc = 130;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        stackOut_130_0 = (RuntimeException) (Object) stackIn_130_0;
                        stackOut_130_1 = (StringBuilder) (Object) stackIn_130_1;
                        stackOut_130_2 = "{...}";
                        stackIn_133_0 = stackOut_130_0;
                        stackIn_133_1 = stackOut_130_1;
                        stackIn_133_2 = stackOut_130_2;
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 131;
                        continue stateLoop;
                    }
                }
                case 131: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 132: {
                    stackOut_132_0 = (RuntimeException) (Object) stackIn_132_0;
                    stackOut_132_1 = (StringBuilder) (Object) stackIn_132_1;
                    stackOut_132_2 = "null";
                    stackIn_133_0 = stackOut_132_0;
                    stackIn_133_1 = stackOut_132_1;
                    stackIn_133_2 = stackOut_132_2;
                    statePc = 133;
                    continue stateLoop;
                }
                case 133: {
                    try {
                        stackOut_133_0 = (RuntimeException) (Object) stackIn_133_0;
                        stackOut_133_1 = ((StringBuilder) (Object) stackIn_133_1).append(stackIn_133_2).append(44).append(param3).append(44);
                        stackIn_136_0 = stackOut_133_0;
                        stackIn_136_1 = stackOut_133_1;
                        stackIn_134_0 = stackOut_133_0;
                        stackIn_134_1 = stackOut_133_1;
                        if (param4 == null) {
                            statePc = 136;
                        } else {
                            statePc = 134;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        stackOut_134_0 = (RuntimeException) (Object) stackIn_134_0;
                        stackOut_134_1 = (StringBuilder) (Object) stackIn_134_1;
                        stackOut_134_2 = "{...}";
                        stackIn_137_0 = stackOut_134_0;
                        stackIn_137_1 = stackOut_134_1;
                        stackIn_137_2 = stackOut_134_2;
                        statePc = 137;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 135: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 136: {
                    stackOut_136_0 = (RuntimeException) (Object) stackIn_136_0;
                    stackOut_136_1 = (StringBuilder) (Object) stackIn_136_1;
                    stackOut_136_2 = "null";
                    stackIn_137_0 = stackOut_136_0;
                    stackIn_137_1 = stackOut_136_1;
                    stackIn_137_2 = stackOut_136_2;
                    statePc = 137;
                    continue stateLoop;
                }
                case 137: {
                    try {
                        stackOut_137_0 = (RuntimeException) (Object) stackIn_137_0;
                        stackOut_137_1 = ((StringBuilder) (Object) stackIn_137_1).append(stackIn_137_2).append(44).append(param5).append(44);
                        stackIn_140_0 = stackOut_137_0;
                        stackIn_140_1 = stackOut_137_1;
                        stackIn_138_0 = stackOut_137_0;
                        stackIn_138_1 = stackOut_137_1;
                        if (param6 == null) {
                            statePc = 140;
                        } else {
                            statePc = 138;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        stackOut_138_0 = (RuntimeException) (Object) stackIn_138_0;
                        stackOut_138_1 = (StringBuilder) (Object) stackIn_138_1;
                        stackOut_138_2 = "{...}";
                        stackIn_141_0 = stackOut_138_0;
                        stackIn_141_1 = stackOut_138_1;
                        stackIn_141_2 = stackOut_138_2;
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 139: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 140: {
                    stackOut_140_0 = (RuntimeException) (Object) stackIn_140_0;
                    stackOut_140_1 = (StringBuilder) (Object) stackIn_140_1;
                    stackOut_140_2 = "null";
                    stackIn_141_0 = stackOut_140_0;
                    stackIn_141_1 = stackOut_140_1;
                    stackIn_141_2 = stackOut_140_2;
                    statePc = 141;
                    continue stateLoop;
                }
                case 141: {
                    try {
                        stackOut_141_0 = (RuntimeException) (Object) stackIn_141_0;
                        stackOut_141_1 = ((StringBuilder) (Object) stackIn_141_1).append(stackIn_141_2).append(44);
                        stackIn_144_0 = stackOut_141_0;
                        stackIn_144_1 = stackOut_141_1;
                        stackIn_142_0 = stackOut_141_0;
                        stackIn_142_1 = stackOut_141_1;
                        if (param7 == null) {
                            statePc = 144;
                        } else {
                            statePc = 142;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        stackOut_142_0 = (RuntimeException) (Object) stackIn_142_0;
                        stackOut_142_1 = (StringBuilder) (Object) stackIn_142_1;
                        stackOut_142_2 = "{...}";
                        stackIn_145_0 = stackOut_142_0;
                        stackIn_145_1 = stackOut_142_1;
                        stackIn_145_2 = stackOut_142_2;
                        statePc = 145;
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 143: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 144: {
                    stackOut_144_0 = (RuntimeException) (Object) stackIn_144_0;
                    stackOut_144_1 = (StringBuilder) (Object) stackIn_144_1;
                    stackOut_144_2 = "null";
                    stackIn_145_0 = stackOut_144_0;
                    stackIn_145_1 = stackOut_144_1;
                    stackIn_145_2 = stackOut_144_2;
                    statePc = 145;
                    continue stateLoop;
                }
                case 145: {
                    try {
                        stackOut_145_0 = (RuntimeException) (Object) stackIn_145_0;
                        stackOut_145_1 = ((StringBuilder) (Object) stackIn_145_1).append(stackIn_145_2).append(44);
                        stackIn_148_0 = stackOut_145_0;
                        stackIn_148_1 = stackOut_145_1;
                        stackIn_146_0 = stackOut_145_0;
                        stackIn_146_1 = stackOut_145_1;
                        if (param8 == null) {
                            statePc = 148;
                        } else {
                            statePc = 146;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        stackOut_146_0 = (RuntimeException) (Object) stackIn_146_0;
                        stackOut_146_1 = (StringBuilder) (Object) stackIn_146_1;
                        stackOut_146_2 = "{...}";
                        stackIn_149_0 = stackOut_146_0;
                        stackIn_149_1 = stackOut_146_1;
                        stackIn_149_2 = stackOut_146_2;
                        statePc = 149;
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 147: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 148: {
                    stackOut_148_0 = (RuntimeException) (Object) stackIn_148_0;
                    stackOut_148_1 = (StringBuilder) (Object) stackIn_148_1;
                    stackOut_148_2 = "null";
                    stackIn_149_0 = stackOut_148_0;
                    stackIn_149_1 = stackOut_148_1;
                    stackIn_149_2 = stackOut_148_2;
                    statePc = 149;
                    continue stateLoop;
                }
                case 149: {
                    throw r.a((Throwable) (Object) stackIn_149_0, stackIn_149_2 + 44 + param9 + 41);
                }
                case 150: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    m(Object param0, int param1) {
        super(param1);
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
        int statePc = 1;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 1: {
                    try {
                        ((m) this).field_y = param0;
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
                        stackOut_4_1 = new StringBuilder().append("m.<init>(");
                        stackIn_7_0 = stackOut_4_0;
                        stackIn_7_1 = stackOut_4_1;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
                        if (param0 == null) {
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
                    throw r.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
                }
                case 9: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(byte param0, int[] param1, bc param2, nk[] param3, bc param4) {
        nk[] var5 = null;
        nk[] var6 = null;
        int[] var6_array = null;
        int var7_int = 0;
        hh var7 = null;
        qr var8 = null;
        qr var9 = null;
        qr var10 = null;
        qr var11 = null;
        bi[] var12 = null;
        bi[] var13 = null;
        bi[] var14 = null;
        qr var15 = null;
        bi[] var16 = null;
        bi[] var17 = null;
        int var18 = 0;
        nk[] stackIn_10_0 = null;
        nk[] stackIn_13_0 = null;
        nk[] stackOut_9_0 = null;
        nk[] stackOut_12_0 = null;
        L0: {
          L1: {
            var18 = ShatteredPlansClient.field_F ? 1 : 0;
            var5 = tp.a("lobby", param4, "crowns", (byte) -118);
            rg.field_d = var5.length;
            if (param3 == null) {
              break L1;
            } else {
              var6 = new nk[param3.length + rg.field_d];
              var7_int = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if ((rg.field_d ^ -1) >= (var7_int ^ -1)) {
                      break L4;
                    } else {
                      var6[var7_int] = var5[var7_int];
                      var7_int++;
                      if (var18 != 0) {
                        break L3;
                      } else {
                        if (var18 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  var5 = var6;
                  break L3;
                }
                var7_int = 0;
                L5: while (true) {
                  if (param3.length <= var7_int) {
                    break L1;
                  } else {
                    stackOut_9_0 = (nk[]) var6;
                    stackIn_13_0 = stackOut_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    if (var18 != 0) {
                      break L0;
                    } else {
                      stackIn_10_0[var7_int + rg.field_d] = param3[var7_int];
                      var7_int++;
                      if (var18 == 0) {
                        continue L5;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
            }
          }
          stackOut_12_0 = (nk[]) var5;
          stackIn_13_0 = stackOut_12_0;
          break L0;
        }
        var6_array = new int[stackIn_13_0.length];
        var7_int = 0;
        L6: while (true) {
          L7: {
            L8: {
              L9: {
                L10: {
                  if (var7_int >= rg.field_d) {
                    break L10;
                  } else {
                    var6_array[var7_int] = 10;
                    var7_int++;
                    if (var18 != 0) {
                      break L9;
                    } else {
                      if (var18 == 0) {
                        continue L6;
                      } else {
                        break L10;
                      }
                    }
                  }
                }
                if (param3 != null) {
                  break L9;
                } else {
                  break L8;
                }
              }
              L11: {
                if (param1 != null) {
                  break L11;
                } else {
                  var7_int = 0;
                  L12: while (true) {
                    L13: {
                      if ((param3.length ^ -1) >= (var7_int ^ -1)) {
                        break L13;
                      } else {
                        var6_array[rg.field_d + var7_int] = param3[var7_int].field_c;
                        var7_int++;
                        if (var18 != 0) {
                          break L7;
                        } else {
                          if (var18 == 0) {
                            continue L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                    if (var18 == 0) {
                      break L8;
                    } else {
                      break L11;
                    }
                  }
                }
              }
              var7_int = 0;
              L14: while (true) {
                if (var7_int >= param3.length) {
                  break L8;
                } else {
                  var6_array[rg.field_d - -var7_int] = param1[var7_int];
                  var7_int++;
                  if (var18 != 0) {
                    break L7;
                  } else {
                    if (var18 == 0) {
                      continue L14;
                    } else {
                      break L8;
                    }
                  }
                }
              }
            }
            rc.field_l = 2;
            s.field_i = 11;
            tg.field_a = 4;
            cr.field_c = 15;
            qo.field_b = 2;
            break L7;
          }
          var7 = go.a(115, "largefont", param4, param2, "lobby");
          ge.field_p = go.a(117, "generalfont", param4, param2, "lobby");
          ul.field_xb = go.a(123, "chatfont", param4, param2, "lobby");
          var7.a((bq[]) (Object) var5, var6_array);
          ge.field_p.a((bq[]) (Object) var5, var6_array);
          ul.field_xb.a((bq[]) (Object) var5, var6_array);
          var8 = new qr(0L, (qr) null);
          var8.field_nb = (nq) (Object) var7;
          var8.field_x = 16777215;
          var8.field_Y = cr.field_c;
          var8.field_G = 1;
          var9 = var8;
          var9.field_y = 1;
          var10 = new qr(0L, (qr) null);
          var10.field_x = 16777215;
          var10.field_Y = cr.field_c;
          var10.field_nb = (nq) (Object) ge.field_p;
          var10.field_G = 1;
          var11 = var10;
          var11.field_y = 1;
          gg.field_d = new qr(0L, var8);
          gg.field_d.field_F = re.a(ae.a(-82, "lobby", param4, "heading"), 123);
          oh.field_a = new qr(0L, (qr) null);
          oh.field_a.field_F = tj.a(false, 4210752, false, 120, 8421504, (byte) -63);
          l.field_a = new qr(0L, (qr) null);
          l.field_a.field_F = cs.a(16, 3, 114, 6316128, 6316128, 1);
          h.field_v = new qr(0L, (qr) null);
          h.field_v.field_F = re.a(ae.a(-113, "lobby", param4, "popup"), 122);
          var12 = re.a(ae.a(124, "lobby", param4, "popup_mouseover"), 117);
          var13 = ae.a(32, "lobby", param4, "button");
          var14 = re.a(ae.a(-97, "lobby", param4, "tab_active"), 82);
          un.field_g = new qr(0L, var8);
          un.field_g.field_F = var14;
          po.field_d = new qr(0L, (qr) null);
          po.field_d.field_pb = id.a(2, param4, "lobby", "closebutton");
          po.field_d.field_fb = id.a(2, param4, "lobby", "closebutton_mouseover");
          nl.field_b = new qr(0L, var8);
          nl.field_b.field_F = tj.a(true, 2039583, true, 40, 3815994, (byte) -47);
          td.field_N = new qr(0L, var10);
          td.field_N.field_kb = 2;
          td.field_N.field_F = tj.a(true, 2039583, false, 30, 3815994, (byte) -111);
          jr.field_h = new qr(0L, var10);
          jr.field_h.field_kb = 2;
          jr.field_h.field_F = tj.a(false, 2039583, false, 30, 3815994, (byte) -35);
          vm.field_Cb = new qr(0L, var10);
          vm.field_Cb.field_kb = 2;
          vm.field_Cb.field_F = tj.a(false, 2039583, true, 30, 3815994, (byte) -64);
          ii.field_u = new qr(0L, (qr) null);
          ii.field_u.field_x = 13421772;
          ii.field_u.field_Y = cr.field_c;
          ii.field_u.field_G = 1;
          ii.field_u.field_nb = (nq) (Object) ge.field_p;
          gn.field_w = new qr(0L, ii.field_u);
          gn.field_w.field_ab = 16777215;
          gn.field_w.field_W = 8421504;
          gn.field_w.field_jb = 16777215;
          gn.field_w.field_x = 16764006;
          gn.field_w.field_qb = 16777215;
          var15 = new qr(0L, gn.field_w);
          var15.field_x = 16777215;
          var15.field_Y = cr.field_c;
          var15.field_nb = (nq) (Object) var7;
          fg.field_b = new qr(0L, ii.field_u);
          fg.field_b.field_F = tj.a(false, 2236962, false, 16, 2236962, (byte) -40);
          fg.field_b.field_kb = 2;
          dm.field_h = new qr(0L, ii.field_u);
          dm.field_h.field_F = tj.a(false, 1513239, false, 16, 1513239, (byte) -36);
          dm.field_h.field_kb = 2;
          oj.field_zb = new qr(0L, fg.field_b);
          oj.field_zb.a(gn.field_w, false);
          ek.field_E = new qr(0L, dm.field_h);
          ek.field_E.a(gn.field_w, false);
          var16 = ae.a(-82, "lobby", param4, "button_mouseover");
          hd.field_t = new ul(h.field_v, var12, ii.field_u, gn.field_w, 3, 2, qo.field_b, 3, cr.field_c);
          rd.field_h = new qr(0L, gn.field_w);
          rd.field_h.field_lb = var16;
          rd.field_h.field_T = 1;
          rd.field_h.field_t = 1;
          rd.field_h.field_V = 1;
          rd.field_h.field_J = 1;
          if (param0 < -25) {
            rd.field_h.field_F = var13;
            rd.field_h.field_vb = ae.a(-112, "lobby", param4, "button_mouseheld");
            rd.field_h.field_sb = ae.a(62, "lobby", param4, "button_active");
            rd.field_h.field_wb = ae.a(-104, "lobby", param4, "button_disabled");
            rd.field_h.field_y = 1;
            re.field_h = new qr(0L, gn.field_w);
            re.field_h.field_y = 1;
            re.field_h.field_F = re.a(ae.a(73, "lobby", param4, "tab_inactive"), 127);
            re.field_h.field_lb = re.a(ae.a(100, "lobby", param4, "tab_mouseover"), 85);
            re.field_h.field_sb = var14;
            tm.field_t = new qr(0L, (qr) null);
            tm.field_t.field_F = cs.a(16, 3, 206, 1856141, 1127256, -1);
            rs.field_Eb = new qr(0L, (qr) null);
            rs.field_Eb.field_F = cs.a(16, 3, 290, 11579568, 6052956, -1);
            ea.field_a = new qr(0L, var15);
            ea.field_a.field_T = 1;
            ea.field_a.field_y = 1;
            ea.field_a.field_J = 1;
            ea.field_a.field_t = 1;
            ea.field_a.field_V = 1;
            af.field_f = new qr(0L, ea.field_a);
            jf.field_b = new qr(0L, gn.field_w);
            jf.field_b.field_V = 1;
            jf.field_b.field_t = 1;
            jf.field_b.field_y = 1;
            jf.field_b.field_T = 1;
            jf.field_b.field_J = 1;
            kq.field_h = new qr(0L, jf.field_b);
            rf.field_l = new qr(0L, jf.field_b);
            bd.field_E = new qr(0L, ea.field_a);
            n.field_o = new qr(0L, jf.field_b);
            mc.field_o = new qr(0L, jf.field_b);
            an.field_d = new qr(0L, jf.field_b);
            jf.field_b.field_F = re.a(ae.a(106, "lobby", param4, "smallbutton"), 47);
            jf.field_b.field_lb = re.a(ae.a(-79, "lobby", param4, "smallbutton_mouseover"), 103);
            jf.field_b.field_sb = re.a(ae.a(-114, "lobby", param4, "smallbutton_active"), 51);
            jf.field_b.field_vb = re.a(ae.a(-114, "lobby", param4, "smallbutton_active"), 51);
            jf.field_b.field_wb = re.a(ae.a(109, "lobby", param4, "smallbutton_disabled"), 65);
            af.field_f.field_F = re.a(ae.a(-99, "lobby", param4, "mediumbutton"), 41);
            af.field_f.field_lb = re.a(ae.a(80, "lobby", param4, "mediumbutton_mouseover"), 126);
            af.field_f.field_vb = re.a(ae.a(113, "lobby", param4, "mediumbutton_mouseheld"), 95);
            ea.field_a.field_F = re.a(ae.a(-121, "lobby", param4, "bigbutton"), 53);
            ea.field_a.field_lb = re.a(ae.a(92, "lobby", param4, "bigbutton_mouseover"), 76);
            ea.field_a.field_vb = re.a(ae.a(-108, "lobby", param4, "bigbutton_mouseheld"), 127);
            ea.field_a.field_wb = re.a(ae.a(-98, "lobby", param4, "bigbutton_disabled"), 122);
            kq.field_h.field_F = re.a(ae.a(-86, "lobby", param4, "greenbutton"), 76);
            kq.field_h.field_lb = re.a(ae.a(-78, "lobby", param4, "greenbutton_mouseover"), 91);
            kq.field_h.field_vb = re.a(ae.a(-98, "lobby", param4, "greenbutton_mouseheld"), 39);
            rf.field_l.field_F = re.a(ae.a(-126, "lobby", param4, "redbutton"), 56);
            rf.field_l.field_lb = re.a(ae.a(120, "lobby", param4, "redbutton_mouseover"), 55);
            rf.field_l.field_vb = re.a(ae.a(126, "lobby", param4, "redbutton_mouseheld"), 103);
            bd.field_E.field_F = re.a(ae.a(-101, "lobby", param4, "backbutton"), 48);
            bd.field_E.field_lb = re.a(ae.a(-103, "lobby", param4, "backbutton_mouseover"), 60);
            bd.field_E.field_vb = re.a(ae.a(-104, "lobby", param4, "backbutton_mouseheld"), 123);
            bd.field_E.field_wb = re.a(ae.a(53, "lobby", param4, "backbutton_disabled"), 40);
            an.field_d.field_F = re.a(ae.a(115, "lobby", param4, "gameoptionbutton"), 57);
            an.field_d.field_lb = re.a(ae.a(54, "lobby", param4, "gameoptionbutton_mouseover"), 117);
            an.field_d.field_sb = re.a(ae.a(77, "lobby", param4, "gameoptionbutton_active"), 52);
            an.field_d.field_vb = re.a(ae.a(77, "lobby", param4, "gameoptionbutton_active"), 52);
            an.field_d.field_wb = re.a(ae.a(-114, "lobby", param4, "gameoptionbutton_disabled"), 121);
            n.field_o.field_F = re.a(ae.a(-117, "lobby", param4, "chatbutton"), 75);
            n.field_o.field_lb = re.a(ae.a(84, "lobby", param4, "chatbutton_mouseover"), 122);
            n.field_o.field_sb = re.a(ae.a(124, "lobby", param4, "chatbutton_active"), 53);
            n.field_o.field_vb = re.a(ae.a(124, "lobby", param4, "chatbutton_active"), 53);
            mc.field_o.field_F = re.a(ae.a(74, "lobby", param4, "chatfilterbutton"), 104);
            mc.field_o.field_lb = re.a(ae.a(-95, "lobby", param4, "chatfilterbutton_mouseover"), 101);
            mc.field_o.field_sb = re.a(ae.a(91, "lobby", param4, "chatfilterbutton_active"), 77);
            mc.field_o.field_vb = re.a(ae.a(91, "lobby", param4, "chatfilterbutton_active"), 77);
            var17 = ae.a(-118, "lobby", param4, "checkbox");
            fk.field_i = new rs(0L, var17[1], var17[0], 1, gn.field_w, (String) null);
            sj.field_c = new qr(0L, (qr) null);
            sj.field_c.field_F = cg.a(-15338, id.a(2, param4, "lobby", "slideregion"));
            sj.field_c.field_lb = cg.a(-15338, id.a(2, param4, "lobby", "slideregion_mouseover"));
            sj.field_c.field_vb = cg.a(-15338, id.a(2, param4, "lobby", "slideregion_mouseheld"));
            sj.field_c.field_wb = cg.a(-15338, id.a(2, param4, "lobby", "slideregion_disabled"));
            ml.field_l = new qr(0L, (qr) null);
            ml.field_l.field_F = re.a(ae.a(126, "lobby", param4, "dragbar"), 33);
            ml.field_l.field_lb = re.a(ae.a(-109, "lobby", param4, "dragbar_mouseover"), 118);
            ml.field_l.field_vb = re.a(ae.a(-77, "lobby", param4, "dragbar_mouseheld"), 67);
            ml.field_l.field_wb = re.a(ae.a(57, "lobby", param4, "dragbar_disabled"), 126);
            sk.field_k = new qr(0L, (qr) null);
            sk.field_k.field_pb = id.a(2, param4, "lobby", "upbutton");
            sk.field_k.field_fb = id.a(2, param4, "lobby", "upbutton_mouseover");
            sk.field_k.field_U = id.a(2, param4, "lobby", "upbutton_mouseheld");
            sk.field_k.field_ob = id.a(2, param4, "lobby", "upbutton_disabled");
            eg.field_u = new qr(0L, (qr) null);
            eg.field_u.field_pb = id.a(2, param4, "lobby", "downbutton");
            eg.field_u.field_fb = id.a(2, param4, "lobby", "downbutton_mouseover");
            eg.field_u.field_U = id.a(2, param4, "lobby", "downbutton_mouseheld");
            eg.field_u.field_ob = id.a(2, param4, "lobby", "downbutton_disabled");
            se.field_m = new ur(0L, sk.field_k, eg.field_u, sj.field_c, ml.field_l);
            ih.field_g = new am(0L, (qr) null, me.field_d, se.field_m, jf.field_b, (String) null, (String) null);
            return;
          } else {
            return;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, bi[] param5, int param6, int param7, bi[] param8, int param9, nq param10, nq param11, int param12, int param13, int param14, int param15, int param16, int param17, int param18, bi[] param19, int param20) {
        RuntimeException var21 = null;
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
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        mb.a(param2, param16, param9, 0, param12, param13, param20, param7, param6, param0, param4, param10, param17, param3, new v(param8), new v(param19), param18, param11, param14, new v(param5), param15);
                        if (param1 == 13421772) {
                            statePc = 25;
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
                        m.a(48, 114, -92, -17, -81, (bi[]) null, 87, -77, (bi[]) null, 10, (nq) null, (nq) null, -117, -102, 14, -52, -97, -21, 46, (bi[]) null, 33);
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    var21 = (RuntimeException) (Object) caughtException;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        stackOut_4_0 = (RuntimeException) var21;
                        stackOut_4_1 = new StringBuilder().append("m.E(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
                        stackIn_7_0 = stackOut_4_0;
                        stackIn_7_1 = stackOut_4_1;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
                        if (param5 == null) {
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
                    try {
                        stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                        stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param6).append(44).append(param7).append(44);
                        stackIn_11_0 = stackOut_8_0;
                        stackIn_11_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (param8 == null) {
                            statePc = 11;
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
                        stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                        stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                        stackOut_9_2 = "{...}";
                        stackIn_12_0 = stackOut_9_0;
                        stackIn_12_1 = stackOut_9_1;
                        stackIn_12_2 = stackOut_9_2;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 11: {
                    stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                    stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                    stackOut_11_2 = "null";
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    try {
                        stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                        stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44).append(param9).append(44);
                        stackIn_15_0 = stackOut_12_0;
                        stackIn_15_1 = stackOut_12_1;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        if (param10 == null) {
                            statePc = 15;
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
                        stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                        stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                        stackOut_13_2 = "{...}";
                        stackIn_16_0 = stackOut_13_0;
                        stackIn_16_1 = stackOut_13_1;
                        stackIn_16_2 = stackOut_13_2;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 15: {
                    stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                    stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                    stackOut_15_2 = "null";
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    stackIn_16_2 = stackOut_15_2;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    try {
                        stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                        stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
                        stackIn_19_0 = stackOut_16_0;
                        stackIn_19_1 = stackOut_16_1;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        if (param11 == null) {
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
                    try {
                        stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
                        stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44).append(param12).append(44).append(param13).append(44).append(param14).append(44).append(param15).append(44).append(param16).append(44).append(param17).append(44).append(param18).append(44);
                        stackIn_23_0 = stackOut_20_0;
                        stackIn_23_1 = stackOut_20_1;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        if (param19 == null) {
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
                    throw r.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param20 + 41);
                }
                case 25: {
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
        field_A = new gq(12, 0, 1, 0);
        field_x = new int[128];
        field_v = "PEACE DECLARED!";
    }
}
