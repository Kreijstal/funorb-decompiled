/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rj {
    static ka field_a;
    static int field_g;
    static ka[] field_b;
    static int field_c;
    static lj field_f;
    static String field_d;
    static int[] field_e;
    static char[] field_h;

    final static ka[] a(int param0, int param1) {
        ka[] var2 = null;
        RuntimeException var2_ref = null;
        ka[] stackIn_5_0 = null;
        RuntimeException decompiledCaughtException = null;
        ka[] stackOut_4_0 = null;
        try {
          try {
            L0: {
              if (param0 >= 19) {
                break L0;
              } else {
                rj.a((byte) -37, false, (int[]) null, (vg) null, false, true, (int[]) null);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          var2 = new ka[9];
          var2[4] = e.a(param1, 64, (byte) -95);
          stackOut_4_0 = (ka[]) var2;
          stackIn_5_0 = stackOut_4_0;
        }
        return null;
    }

    final static void a(byte param0, boolean param1, int[] param2, vg param3, boolean param4, boolean param5, int[] param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
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
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        Object stackIn_33_0 = null;
        vg stackIn_37_0 = null;
        vg stackIn_41_0 = null;
        Object stackIn_45_0 = null;
        Object stackIn_49_0 = null;
        vg stackIn_53_0 = null;
        Object stackIn_57_0 = null;
        short stackIn_74_0 = 0;
        int stackIn_74_1 = 0;
        int stackIn_76_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_77_1 = 0;
        int stackIn_79_0 = 0;
        int stackIn_79_1 = 0;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        String stackIn_90_2 = null;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        String stackIn_94_2 = null;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_98_2 = null;
        Object stackOut_32_0 = null;
        vg stackOut_36_0 = null;
        vg stackOut_40_0 = null;
        Object stackOut_44_0 = null;
        Object stackOut_48_0 = null;
        vg stackOut_52_0 = null;
        Object stackOut_56_0 = null;
        short stackOut_73_0 = 0;
        int stackOut_73_1 = 0;
        int stackOut_75_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_76_1 = 0;
        int stackOut_77_0 = 0;
        int stackOut_77_1 = 0;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        String stackOut_87_2 = null;
        RuntimeException stackOut_89_0 = null;
        StringBuilder stackOut_89_1 = null;
        String stackOut_89_2 = null;
        RuntimeException stackOut_90_0 = null;
        StringBuilder stackOut_90_1 = null;
        RuntimeException stackOut_91_0 = null;
        StringBuilder stackOut_91_1 = null;
        String stackOut_91_2 = null;
        RuntimeException stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        String stackOut_93_2 = null;
        RuntimeException stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        String stackOut_95_2 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var30 = TorChallenge.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var7_int = 2147483647;
                        var8 = -2147483648;
                        var21 = param6[3] >> 1471710946;
                        var22 = param6[4] >> 1080272450;
                        var23 = param6[5] >> 1398578242;
                        var24 = param6[6] >> 1701400866;
                        var25 = param6[7] >> 2011035970;
                        var26 = param6[8] >> -2046109918;
                        var27 = param6[9] >> 1375349026;
                        var28 = param6[10] >> -2136331390;
                        var12 = param2[4] * var22 + param2[3] * var21 + param2[5] * var23 >> 1837810990;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param0 < -20) {
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
                        rj.a((byte) -82, false, (int[]) null, (vg) null, true, true, (int[]) null);
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
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var29 = param6[11] >> 1878972994;
                        var13 = var26 * param2[5] + (param2[4] * var25 + param2[3] * var24) >> -583978258;
                        var18 = var22 * param2[10] + param2[9] * var21 - -(var23 * param2[11]) >> -46802962;
                        var14 = param2[5] * var29 + (param2[3] * var27 + param2[4] * var28) >> -716084562;
                        var19 = var26 * param2[11] + param2[10] * var25 + param2[9] * var24 >> 81829902;
                        var16 = param2[6] * var24 + (param2[7] * var25 + var26 * param2[8]) >> -381732338;
                        var20 = param2[9] * var27 + param2[10] * var28 + var29 * param2[11] >> -591326162;
                        var15 = param2[7] * var22 + (var21 * param2[6] - -(var23 * param2[8])) >> 139092750;
                        var17 = var29 * param2[8] + var28 * param2[7] + param2[6] * var27 >> 1595568558;
                        var21 = -param6[0] + param2[0];
                        var22 = param2[1] + -param6[1];
                        var23 = -param6[2] + param2[2];
                        var9 = param6[4] * var22 + param6[3] * var21 + var23 * param6[5] >> -fd.field_g + 16;
                        var10 = param6[8] * var23 + (param6[6] * var21 - -(param6[7] * var22)) >> 16 - fd.field_g;
                        var11 = var23 * param6[11] + var21 * param6[9] + param6[10] * var22 >> -1406404496;
                        var21 = oc.field_i;
                        var22 = oc.field_c;
                        var23 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((var23 ^ -1) <= (param3.field_d ^ -1)) {
                            statePc = 31;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var24 = param3.field_g[var23];
                        var25 = param3.field_t[var23];
                        var26 = param3.field_q[var23];
                        var27 = (var18 * var26 + (var12 * var24 + var15 * var25) >> 16 + -fd.field_g) + var9;
                        var28 = (var25 * var16 + var13 * var24 - -(var26 * var19) >> 16 - fd.field_g) + var10;
                        var29 = var11 + (var20 * var26 + (var14 * var24 + var25 * var17) >> -736990640);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (50 > var29) {
                            statePc = 23;
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
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        tj.field_a[var23] = var27 / var29 + var21;
                        si.field_K[var23] = var28 / var29 + var22;
                        if ((var8 ^ -1) > (var29 ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var8 = var29;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if ((var7_int ^ -1) < (var29 ^ -1)) {
                            statePc = 21;
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
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var7_int = var29;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        bg.field_O[var23] = var29;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        bg.field_O[var23] = -2147483648;
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
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (param1) {
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
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        bk.field_q[var23] = var27 >> fd.field_g;
                        ad.field_h[var23] = var28 >> fd.field_g;
                        ek.field_K[var23] = var29;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var23++;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (null == param3.field_u) {
                            statePc = 69;
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
                        stackOut_32_0 = null;
                        stackIn_33_0 = stackOut_32_0;
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
                        if (stackIn_33_0 == (Object) (Object) param3.field_y) {
                            statePc = 69;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackOut_36_0 = (vg) param3;
                        stackIn_37_0 = stackOut_36_0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (stackIn_37_0.field_J == null) {
                            statePc = 69;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 43;
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
                        stackOut_40_0 = (vg) param3;
                        stackIn_41_0 = stackOut_40_0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (stackIn_41_0.field_E == null) {
                            statePc = 69;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackOut_44_0 = null;
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
                        if (stackIn_45_0 == (Object) (Object) param3.field_l) {
                            statePc = 69;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackOut_48_0 = null;
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
                        if (stackIn_49_0 == (Object) (Object) param3.field_C) {
                            statePc = 69;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        stackOut_52_0 = (vg) param3;
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
                        if (stackIn_53_0.field_A == null) {
                            statePc = 69;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        stackOut_56_0 = null;
                        stackIn_57_0 = stackOut_56_0;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (stackIn_57_0 == (Object) (Object) param3.field_o) {
                            statePc = 69;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (param3.field_a == null) {
                            statePc = 69;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var23 = 0;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if ((var23 ^ -1) <= (param3.field_x ^ -1)) {
                            statePc = 69;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var24 = param3.field_u[var23];
                        var25 = param3.field_y[var23];
                        var26 = param3.field_J[var23];
                        ba.field_h[var23] = var9 - -(var24 * var12 + var15 * var25 + var18 * var26 >> 1915848624);
                        ib.field_O[var23] = (var24 * var13 + (var25 * var16 + var26 * var19) >> -466835376) + var10;
                        ih.field_O[var23] = (var24 * var14 + var25 * var17 - -(var26 * var20) >> 125287760) + var11;
                        var24 = param3.field_E[var23];
                        var25 = param3.field_l[var23];
                        var26 = param3.field_C[var23];
                        il.field_r[var23] = (var25 * var15 + var24 * var12 - -(var18 * var26) >> 1953371088) + var9;
                        tf.field_u[var23] = (var25 * var16 + (var24 * var13 + var19 * var26) >> -149844368) + var10;
                        ef.field_d[var23] = (var24 * var14 - (-(var25 * var17) + -(var20 * var26)) >> -172160400) + var11;
                        var24 = param3.field_A[var23];
                        var25 = param3.field_o[var23];
                        var26 = param3.field_a[var23];
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        fa.field_h[var23] = var9 + (var18 * var26 + var24 * var12 - -(var15 * var25) >> -318290352);
                        qi.field_h[var23] = var10 - -(var19 * var26 + var16 * var25 + var24 * var13 >> 1255480752);
                        kc.field_m[var23] = var11 - -(var20 * var26 + (var14 * var24 - -(var17 * var25)) >> -1825362224);
                        var23++;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (param4) {
                            statePc = 72;
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
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var9 = param2[3];
                        var10 = param2[4];
                        var11 = param2[5];
                        var12 = param2[6];
                        var13 = param2[7];
                        var14 = param2[8];
                        var15 = param2[9];
                        var16 = param2[10];
                        var17 = param2[11];
                        var18 = 0;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        stackOut_73_0 = param3.field_c;
                        stackOut_73_1 = var18;
                        stackIn_74_0 = stackOut_73_0;
                        stackIn_74_1 = stackOut_73_1;
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (stackIn_74_0 <= stackIn_74_1) {
                            statePc = 83;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        stackOut_75_0 = var18;
                        stackIn_76_0 = stackOut_75_0;
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        stackOut_76_0 = stackIn_76_0;
                        stackOut_76_1 = sj.field_S.length;
                        stackIn_77_0 = stackOut_76_0;
                        stackIn_77_1 = stackOut_76_1;
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        stackOut_77_0 = stackIn_77_0;
                        stackOut_77_1 = stackIn_77_1;
                        stackIn_79_0 = stackOut_77_0;
                        stackIn_79_1 = stackOut_77_1;
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (stackIn_79_0 >= stackIn_79_1) {
                            statePc = 83;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 81;
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
                        var19 = param3.field_L[var18];
                        var20 = param3.field_r[var18];
                        var21 = param3.field_D[var18];
                        sj.field_S[var18] = var12 * var20 + (var19 * var9 + var15 * var21) >> -1077903728;
                        kl.field_b[var18] = var16 * var21 + var10 * var19 - -(var13 * var20) >> 404237232;
                        kd.field_o[var18] = var21 * var17 + var11 * var19 + var14 * var20 >> 206202288;
                        var18++;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        md.a(-2, param5, var7_int, var8, param3);
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 85: {
                    var7 = (RuntimeException) (Object) caughtException;
                    statePc = 86;
                    continue stateLoop;
                }
                case 86: {
                    try {
                        stackOut_86_0 = (RuntimeException) var7;
                        stackOut_86_1 = new StringBuilder().append("rj.B(").append(param0).append(44).append(param1).append(44);
                        stackIn_89_0 = stackOut_86_0;
                        stackIn_89_1 = stackOut_86_1;
                        stackIn_87_0 = stackOut_86_0;
                        stackIn_87_1 = stackOut_86_1;
                        if (param2 == null) {
                            statePc = 89;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        stackOut_87_0 = (RuntimeException) (Object) stackIn_87_0;
                        stackOut_87_1 = (StringBuilder) (Object) stackIn_87_1;
                        stackOut_87_2 = "{...}";
                        stackIn_90_0 = stackOut_87_0;
                        stackIn_90_1 = stackOut_87_1;
                        stackIn_90_2 = stackOut_87_2;
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 88: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 89: {
                    stackOut_89_0 = (RuntimeException) (Object) stackIn_89_0;
                    stackOut_89_1 = (StringBuilder) (Object) stackIn_89_1;
                    stackOut_89_2 = "null";
                    stackIn_90_0 = stackOut_89_0;
                    stackIn_90_1 = stackOut_89_1;
                    stackIn_90_2 = stackOut_89_2;
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    try {
                        stackOut_90_0 = (RuntimeException) (Object) stackIn_90_0;
                        stackOut_90_1 = ((StringBuilder) (Object) stackIn_90_1).append(stackIn_90_2).append(44);
                        stackIn_93_0 = stackOut_90_0;
                        stackIn_93_1 = stackOut_90_1;
                        stackIn_91_0 = stackOut_90_0;
                        stackIn_91_1 = stackOut_90_1;
                        if (param3 == null) {
                            statePc = 93;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        stackOut_91_0 = (RuntimeException) (Object) stackIn_91_0;
                        stackOut_91_1 = (StringBuilder) (Object) stackIn_91_1;
                        stackOut_91_2 = "{...}";
                        stackIn_94_0 = stackOut_91_0;
                        stackIn_94_1 = stackOut_91_1;
                        stackIn_94_2 = stackOut_91_2;
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 92;
                        continue stateLoop;
                    }
                }
                case 92: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 93: {
                    stackOut_93_0 = (RuntimeException) (Object) stackIn_93_0;
                    stackOut_93_1 = (StringBuilder) (Object) stackIn_93_1;
                    stackOut_93_2 = "null";
                    stackIn_94_0 = stackOut_93_0;
                    stackIn_94_1 = stackOut_93_1;
                    stackIn_94_2 = stackOut_93_2;
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    try {
                        stackOut_94_0 = (RuntimeException) (Object) stackIn_94_0;
                        stackOut_94_1 = ((StringBuilder) (Object) stackIn_94_1).append(stackIn_94_2).append(44).append(param4).append(44).append(param5).append(44);
                        stackIn_97_0 = stackOut_94_0;
                        stackIn_97_1 = stackOut_94_1;
                        stackIn_95_0 = stackOut_94_0;
                        stackIn_95_1 = stackOut_94_1;
                        if (param6 == null) {
                            statePc = 97;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        stackOut_95_0 = (RuntimeException) (Object) stackIn_95_0;
                        stackOut_95_1 = (StringBuilder) (Object) stackIn_95_1;
                        stackOut_95_2 = "{...}";
                        stackIn_98_0 = stackOut_95_0;
                        stackIn_98_1 = stackOut_95_1;
                        stackIn_98_2 = stackOut_95_2;
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 96: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 97: {
                    stackOut_97_0 = (RuntimeException) (Object) stackIn_97_0;
                    stackOut_97_1 = (StringBuilder) (Object) stackIn_97_1;
                    stackOut_97_2 = "null";
                    stackIn_98_0 = stackOut_97_0;
                    stackIn_98_1 = stackOut_97_1;
                    stackIn_98_2 = stackOut_97_2;
                    statePc = 98;
                    continue stateLoop;
                }
                case 98: {
                    throw oj.a((Throwable) (Object) stackIn_98_0, stackIn_98_2 + 41);
                }
                case 99: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, boolean param4, int param5, int param6, int param7, String param8, int param9, long param10, boolean param11, int param12, uj param13) {
        try {
            IOException var15 = null;
            RuntimeException var15_ref = null;
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
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            id.field_b = new pa(param5);
                            dk.field_s = new pa(param1);
                            vl.field_a = param13;
                            fg.field_S = param2;
                            wh.field_c = param10;
                            ll.field_f = param8;
                            ed.field_e = param4;
                            mh.field_a = param7;
                            ae.field_x = param3;
                            na.field_c = param0;
                            db.field_y = param12;
                            ph.field_e = param9;
                            sd.field_h = param6;
                            if (!param11) {
                                statePc = 4;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = (stateCaught_0 instanceof RuntimeException ? 11 : 3);
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            field_g = 2;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof RuntimeException ? 11 : 3);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (null != vl.field_a.field_d) {
                                statePc = 7;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = (stateCaught_4 instanceof IOException ? 6 : 11);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof IOException ? 6 : 11);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            cf.field_d = new rk(vl.field_a.field_d, 64, 0);
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof IOException ? 9 : 11);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var15 = (IOException) (Object) caughtException;
                            throw new RuntimeException(var15.toString());
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        var15_ref = (RuntimeException) (Object) caughtException;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = (RuntimeException) var15_ref;
                            stackOut_12_1 = new StringBuilder().append("rj.C(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44);
                            stackIn_15_0 = stackOut_12_0;
                            stackIn_15_1 = stackOut_12_1;
                            stackIn_13_0 = stackOut_12_0;
                            stackIn_13_1 = stackOut_12_1;
                            if (param8 == null) {
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
                            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44).append(param9).append(44).append(param10).append(44).append(param11).append(44).append(param12).append(44);
                            stackIn_19_0 = stackOut_16_0;
                            stackIn_19_1 = stackOut_16_1;
                            stackIn_17_0 = stackOut_16_0;
                            stackIn_17_1 = stackOut_16_1;
                            if (param13 == null) {
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
                        throw oj.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
                    }
                    case 21: {
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

    public final String toString() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          throw new IllegalStateException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var1, "rj.toString()");
        }
    }

    static long a(long param0, long param1) {
        RuntimeException var4 = null;
        long stackIn_1_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        long stackOut_0_0 = 0L;
        try {
          stackOut_0_0 = param0 | param1;
          stackIn_1_0 = stackOut_0_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_1_0;
        }
        return 0L;
    }

    public static void a(int param0) {
        try {
            field_f = null;
            field_h = null;
            field_b = null;
            field_e = null;
            field_d = null;
            field_a = null;
            if (param0 != 10) {
                field_f = null;
            }
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "rj.E(" + param0 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, ka[] param3, int param4) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var5_int = lg.field_d[param1][9];
                        var6 = lg.field_d[param1][10];
                        var7 = lg.field_d[param1][11];
                        var8 = lg.field_d[param1][12];
                        var9 = lg.field_d[param1][13];
                        var10 = lg.field_d[param1][14];
                        var11 = lg.field_d[param1][15];
                        var12 = lg.field_d[param1][16];
                        ne.a(param4, var8, var10, var9, param2, param4 - 2 * var5_int, var6, var5_int, param3, -(param0 * var9) + param4, -var11 + param2 + -var10, var12, -var7 + -var6 + param2, 128);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 2: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        stackOut_3_0 = (RuntimeException) runtimeException;
                        stackOut_3_1 = new StringBuilder().append("rj.F(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
                        stackIn_6_0 = stackOut_3_0;
                        stackIn_6_1 = stackOut_3_1;
                        stackIn_4_0 = stackOut_3_0;
                        stackIn_4_1 = stackOut_3_1;
                        if (param3 == null) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
                        stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
                        stackOut_4_2 = "{...}";
                        stackIn_7_0 = stackOut_4_0;
                        stackIn_7_1 = stackOut_4_1;
                        stackIn_7_2 = stackOut_4_2;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 6: {
                    stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                    stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                    stackOut_6_2 = "null";
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    stackIn_7_2 = stackOut_6_2;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    throw oj.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param4 + 41);
                }
                case 8: {
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
        field_g = 0;
        field_e = new int[]{60, 60, 60};
        field_d = null;
        field_b = new ka[2];
        field_h = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    }
}
