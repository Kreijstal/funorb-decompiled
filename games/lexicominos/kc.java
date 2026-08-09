/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kc {
    private long[] field_f;
    private int field_b;
    static int[] field_l;
    private long[] field_a;
    private byte[] field_g;
    private byte[] field_k;
    static int field_c;
    private int field_i;
    private long[] field_j;
    static byte[] field_d;
    static ke[] field_m;
    private long[] field_h;
    private long[] field_e;

    final static void a(int param0, int param1) {
        try {
            IOException iOException = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (null == jc.field_b) {
                break L0;
              } else {
                L1: {
                  if (0 > param0) {
                    break L1;
                  } else {
                    if (gg.field_b != uf.field_m) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if ((ed.field_q.field_h ^ -1) != -1) {
                    break L2;
                  } else {
                    if (rf.c(0) > p.field_c - -10000L) {
                      ed.field_q.h(param0, param1 ^ -1);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if ((ed.field_q.field_h ^ -1) < param1) {
                    try {
                      L4: {
                        jc.field_b.a(ed.field_q.field_j, ed.field_q.field_h, 120, 0);
                        p.field_c = rf.c(0);
                        break L4;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        iOException = (IOException) (Object) decompiledCaughtException;
                        ck.b((byte) -37);
                        break L5;
                      }
                    }
                    ed.field_q.field_h = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                return;
              }
            }
            ed.field_q.field_h = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_m = null;
        field_d = null;
        field_l = null;
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int[] param8, int param9) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_92_1 = 0;
        int stackIn_102_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_115_0 = 0;
        int stackIn_115_1 = 0;
        RuntimeException stackIn_118_0 = null;
        StringBuilder stackIn_118_1 = null;
        RuntimeException stackIn_119_0 = null;
        StringBuilder stackIn_119_1 = null;
        RuntimeException stackIn_120_0 = null;
        StringBuilder stackIn_120_1 = null;
        String stackIn_120_2 = null;
        RuntimeException stackIn_121_0 = null;
        StringBuilder stackIn_121_1 = null;
        RuntimeException stackIn_122_0 = null;
        StringBuilder stackIn_122_1 = null;
        RuntimeException stackIn_123_0 = null;
        StringBuilder stackIn_123_1 = null;
        String stackIn_123_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var22 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var10_int = -(param1 >> 1169880194);
                        param1 = -(param1 & 3);
                        if (param6 == 8) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_c = 87;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var11 = -param0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var11 >= 0) {
                            statePc = 124;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var22 != 0) {
                            statePc = 125;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var12 = var10_int;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var12 >= 0) {
                            statePc = 89;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        incrementValue$0 = param3;
                        param3++;
                        param4 = param8[incrementValue$0];
                        stackIn_115_0 = 0;
                        stackIn_9_0 = stackIn_115_0;
                        stackIn_115_1 = param4;
                        stackIn_9_1 = stackIn_115_1;
                        if (var22 != 0) {
                            statePc = 115;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (stackIn_9_0 == stackIn_9_1) {
                            statePc = 28;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var13 = 255 & param4 >> -180184752;
                        var14 = param4 >> 1870134088 & 255;
                        var15 = 255 & param4;
                        var16 = param2[param7];
                        var17 = (16768750 & var16) >> 822166448;
                        var18 = 15 & var16 >> -1207387096;
                        var19 = var16 & 255;
                        if ((var14 ^ -1) > (var13 ^ -1)) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var14 > var15) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_17_0 = var15;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_17_0 = var14;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var15 < var13) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_17_0 = var15;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackIn_17_0 = var13;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var20 = stackIn_17_0;
                        if (var18 >= var17) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var17 > var19) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_24_0 = var19;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_24_0 = var17;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if ((var19 ^ -1) <= (var18 ^ -1)) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackIn_24_0 = var18;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackIn_24_0 = var19;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var21 = stackIn_24_0;
                        if (var20 > var21) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        param4 = var21 * var14 / var20 << 1670499240 | var21 * var13 / var20 << 73378000 | var21 * var15 / var20;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        incrementValue$1 = param7;
                        param7++;
                        param2[incrementValue$1] = param4;
                        if (var22 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        param7++;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        incrementValue$2 = param3;
                        param3++;
                        param4 = param8[incrementValue$2];
                        if (0 == param4) {
                            statePc = 47;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var13 = (param4 & 16771522) >> 714058096;
                        var14 = (param4 & 65535) >> -133897304;
                        var15 = param4 & 255;
                        var16 = param2[param7];
                        var17 = (16751732 & var16) >> 689844688;
                        var18 = (3998 & var16) >> 1773268840;
                        var19 = 255 & var16;
                        if ((var13 ^ -1) >= (var14 ^ -1)) {
                            statePc = 34;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if ((var13 ^ -1) < (var15 ^ -1)) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_37_0 = var15;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_37_0 = var13;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if ((var14 ^ -1) >= (var15 ^ -1)) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackIn_37_0 = var14;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackIn_37_0 = var15;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var20 = stackIn_37_0;
                        if ((var18 ^ -1) > (var17 ^ -1)) {
                            statePc = 41;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if ((var19 ^ -1) > (var18 ^ -1)) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackIn_44_0 = var19;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackIn_44_0 = var18;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var17 > var19) {
                            statePc = 43;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackIn_44_0 = var19;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackIn_44_0 = var17;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var21 = stackIn_44_0;
                        if ((var20 ^ -1) >= (var21 ^ -1)) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        param4 = var13 * var21 / var20 << -1156533456 | var21 * var14 / var20 << 1296576584 | var15 * var21 / var20;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        incrementValue$3 = param7;
                        param7++;
                        param2[incrementValue$3] = param4;
                        if (var22 == 0) {
                            statePc = 48;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        param7++;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        incrementValue$4 = param3;
                        param3++;
                        param4 = param8[incrementValue$4];
                        if ((param4 ^ -1) != -1) {
                            statePc = 51;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        param7++;
                        if (var22 == 0) {
                            statePc = 68;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var13 = (16730233 & param4) >> 1541067664;
                        var14 = (param4 & 65406) >> -749200504;
                        var15 = param4 & 255;
                        var16 = param2[param7];
                        var17 = (var16 & 16775412) >> 1773562384;
                        var18 = (var16 & 4043) >> 1436800936;
                        var19 = var16 & 255;
                        if ((var13 ^ -1) < (var14 ^ -1)) {
                            statePc = 55;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if ((var14 ^ -1) >= (var15 ^ -1)) {
                            statePc = 54;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        stackIn_58_0 = var14;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        stackIn_58_0 = var15;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if ((var15 ^ -1) <= (var13 ^ -1)) {
                            statePc = 57;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        stackIn_58_0 = var13;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        stackIn_58_0 = var15;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var20 = stackIn_58_0;
                        if ((var18 ^ -1) > (var17 ^ -1)) {
                            statePc = 62;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if ((var18 ^ -1) >= (var19 ^ -1)) {
                            statePc = 61;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        stackIn_65_0 = var18;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        stackIn_65_0 = var19;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (var17 <= var19) {
                            statePc = 64;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        stackIn_65_0 = var17;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        stackIn_65_0 = var19;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var21 = stackIn_65_0;
                        if (var20 <= var21) {
                            statePc = 67;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        param4 = var15 * var21 / var20 | (var13 * var21 / var20 << -1116122352 | var14 * var21 / var20 << 221442344);
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        incrementValue$5 = param7;
                        param7++;
                        param2[incrementValue$5] = param4;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        incrementValue$6 = param3;
                        param3++;
                        param4 = param8[incrementValue$6];
                        if (-1 == (param4 ^ -1)) {
                            statePc = 87;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var13 = 255 & param4 >> 1046582576;
                        var14 = (65473 & param4) >> 1806238856;
                        var15 = 255 & param4;
                        var16 = param2[param7];
                        var17 = 255 & var16 >> 682435376;
                        var18 = 15 & var16 >> 1211249224;
                        var19 = 255 & var16;
                        if (var14 >= var13) {
                            statePc = 73;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if ((var13 ^ -1) < (var15 ^ -1)) {
                            statePc = 72;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        stackIn_76_0 = var15;
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        stackIn_76_0 = var13;
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (var14 > var15) {
                            statePc = 75;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        stackIn_76_0 = var15;
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        stackIn_76_0 = var14;
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var20 = stackIn_76_0;
                        if (var18 < var17) {
                            statePc = 80;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if (var19 >= var18) {
                            statePc = 79;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        stackIn_83_0 = var18;
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        stackIn_83_0 = var19;
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if ((var19 ^ -1) <= (var17 ^ -1)) {
                            statePc = 82;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        stackIn_83_0 = var17;
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        stackIn_83_0 = var19;
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        var21 = stackIn_83_0;
                        if (var21 < var20) {
                            statePc = 85;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        param4 = var15 * var21 / var20 | (var21 * var14 / var20 << -1132881272 | var21 * var13 / var20 << 1778785104);
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        incrementValue$7 = param7;
                        param7++;
                        param2[incrementValue$7] = param4;
                        if (var22 == 0) {
                            statePc = 88;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        param7++;
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        var12++;
                        if (var22 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        var12 = param1;
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (var12 >= 0) {
                            statePc = 114;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        incrementValue$8 = param3;
                        param3++;
                        param4 = param8[incrementValue$8];
                        stackIn_115_0 = 0;
                        stackIn_92_0 = stackIn_115_0;
                        stackIn_115_1 = param4;
                        stackIn_92_1 = stackIn_115_1;
                        if (var22 != 0) {
                            statePc = 115;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if (stackIn_92_0 != stackIn_92_1) {
                            statePc = 95;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        param7++;
                        if (var22 == 0) {
                            statePc = 113;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        var13 = 255 & param4 >> 1191395984;
                        var14 = (65290 & param4) >> -118330008;
                        var15 = 255 & param4;
                        var16 = param2[param7];
                        var17 = (16754807 & var16) >> -166496880;
                        var18 = var16 >> 1479300296 & 15;
                        var19 = var16 & 255;
                        if ((var13 ^ -1) < (var14 ^ -1)) {
                            statePc = 99;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        if (var15 < var14) {
                            statePc = 98;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        stackIn_102_0 = var15;
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        stackIn_102_0 = var14;
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if ((var13 ^ -1) < (var15 ^ -1)) {
                            statePc = 101;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        stackIn_102_0 = var15;
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        stackIn_102_0 = var13;
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        var20 = stackIn_102_0;
                        if ((var18 ^ -1) <= (var17 ^ -1)) {
                            statePc = 106;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        if ((var19 ^ -1) <= (var17 ^ -1)) {
                            statePc = 105;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        stackIn_109_0 = var17;
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        stackIn_109_0 = var19;
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        if ((var18 ^ -1) < (var19 ^ -1)) {
                            statePc = 108;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        stackIn_109_0 = var19;
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        stackIn_109_0 = var18;
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        var21 = stackIn_109_0;
                        if ((var21 ^ -1) > (var20 ^ -1)) {
                            statePc = 111;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        param4 = var15 * var21 / var20 | (var13 * var21 / var20 << 710271312 | var21 * var14 / var20 << -1724225816);
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        incrementValue$9 = param7;
                        param7++;
                        param2[incrementValue$9] = param4;
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        var12++;
                        if (var22 == 0) {
                            statePc = 90;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        param3 = param3 + param5;
                        stackIn_115_0 = param7;
                        stackIn_115_1 = param9;
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        param7 = stackIn_115_0 + stackIn_115_1;
                        var11++;
                        if (var22 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 117;
                        continue stateLoop;
                    }
                }
                case 117: {
                    var10 = (RuntimeException) ((Object) caughtException);
                    stackIn_119_0 = (RuntimeException) (var10);
                    stackIn_118_0 = stackIn_119_0;
                    stackIn_119_1 = new StringBuilder().append("kc.F(").append(param0).append(',').append(param1).append(',');
                    stackIn_118_1 = stackIn_119_1;
                    if (param2 == null) {
                        statePc = 119;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    stackIn_120_0 = (RuntimeException) ((Object) stackIn_118_0);
                    stackIn_120_1 = (StringBuilder) ((Object) stackIn_118_1);
                    stackIn_120_2 = "{...}";
                    statePc = 120;
                    continue stateLoop;
                }
                case 119: {
                    stackIn_120_0 = (RuntimeException) ((Object) stackIn_119_0);
                    stackIn_120_1 = (StringBuilder) ((Object) stackIn_119_1);
                    stackIn_120_2 = "null";
                    statePc = 120;
                    continue stateLoop;
                }
                case 120: {
                    stackIn_122_0 = (RuntimeException) ((Object) stackIn_120_0);
                    stackIn_121_0 = stackIn_122_0;
                    stackIn_122_1 = ((StringBuilder) (Object) stackIn_120_1).append(stackIn_120_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
                    stackIn_121_1 = stackIn_122_1;
                    if (param8 == null) {
                        statePc = 122;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    stackIn_123_0 = (RuntimeException) ((Object) stackIn_121_0);
                    stackIn_123_1 = (StringBuilder) ((Object) stackIn_121_1);
                    stackIn_123_2 = "{...}";
                    statePc = 123;
                    continue stateLoop;
                }
                case 122: {
                    stackIn_123_0 = (RuntimeException) ((Object) stackIn_122_0);
                    stackIn_123_1 = (StringBuilder) ((Object) stackIn_122_1);
                    stackIn_123_2 = "null";
                    statePc = 123;
                    continue stateLoop;
                }
                case 123: {
                    throw ld.a((Throwable) ((Object) stackIn_123_0), stackIn_123_2 + ',' + param9 + ')');
                }
                case 124: {
                    return;
                }
                case 125: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(byte param0) {
        long dupTemp$0 = 0L;
        long arrayValue$1 = 0L;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_53_0 = 0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = Lexicominos.field_L ? 1 : 0;
                    var2 = 0;
                    if (param0 <= -111) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var7 = (byte[]) null;
                    this.a(-93L, (byte[]) null, 126);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var3 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (8 <= var2) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    this.field_h[var2] = qg.a(qg.a(tf.a(255L, (long)this.field_k[var3 + 6]) << -900871224, qg.a(qg.a(qg.a(qg.a(tf.a((long)this.field_k[2 + var3] << 953476200, 280375465082880L), qg.a((long)this.field_k[var3] << 783770232, tf.a(71776119061217280L, (long)this.field_k[var3 - -1] << 1461624112))), tf.a(1095216660480L, (long)this.field_k[var3 - -3] << -391529184)), tf.a((long)this.field_k[var3 - -4], 255L) << 426542488), tf.a((long)this.field_k[var3 - -5] << 1213552656, 16711680L))), tf.a((long)this.field_k[7 + var3], 255L));
                    var3 += 8;
                    var2++;
                    if (var6 != 0) {
                        statePc = 9;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (var6 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var2 = 0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (-9 >= (var2 ^ -1)) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    dupTemp$0 = this.field_e[var2];
                    arrayValue$1 = this.field_h[var2];
                    this.field_j[var2] = dupTemp$0;
                    this.field_f[var2] = qg.a(arrayValue$1, dupTemp$0);
                    var2++;
                    if (var6 != 0) {
                        statePc = 15;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (var6 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var2 = 1;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (-11 > (var2 ^ -1)) {
                        statePc = 52;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_53_0 = 0;
                    stackIn_17_0 = stackIn_53_0;
                    if (var6 != 0) {
                        statePc = 53;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var3 = stackIn_17_0;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (var3 >= 8) {
                        statePc = 27;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    this.field_a[var3] = 0L;
                    var4 = 0;
                    stackIn_28_0 = 56;
                    stackIn_20_0 = stackIn_28_0;
                    if (var6 != 0) {
                        statePc = 28;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var5 = stackIn_20_0;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    if (8 <= var4) {
                        statePc = 25;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    this.field_a[var3] = qg.a(this.field_a[var3], fb.field_j[var4][vg.a((int)(this.field_j[vg.a(var3 - var4, 7)] >>> var5), 255)]);
                    var4++;
                    var5 -= 8;
                    if (var6 != 0) {
                        statePc = 26;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (var6 == 0) {
                        statePc = 21;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var3++;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    if (var6 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    stackIn_28_0 = 0;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    var3 = stackIn_28_0;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    if ((var3 ^ -1) <= -9) {
                        statePc = 33;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    this.field_j[var3] = this.field_a[var3];
                    var3++;
                    if (var6 != 0) {
                        statePc = 34;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if (var6 == 0) {
                        statePc = 29;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    this.field_j[0] = qg.a(this.field_j[0], fb.field_o[var2]);
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    var3 = 0;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (var3 >= 8) {
                        statePc = 44;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    this.field_a[var3] = this.field_j[var3];
                    var4 = 0;
                    stackIn_45_0 = 56;
                    stackIn_37_0 = stackIn_45_0;
                    if (var6 != 0) {
                        statePc = 45;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    var5 = stackIn_37_0;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if ((var4 ^ -1) <= -9) {
                        statePc = 42;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    this.field_a[var3] = qg.a(this.field_a[var3], fb.field_j[var4][vg.a(255, (int)(this.field_f[vg.a(var3 - var4, 7)] >>> var5))]);
                    var5 -= 8;
                    var4++;
                    if (var6 != 0) {
                        statePc = 43;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (var6 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    var3++;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    if (var6 == 0) {
                        statePc = 35;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    stackIn_45_0 = 0;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    var3 = stackIn_45_0;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    if (-9 >= (var3 ^ -1)) {
                        statePc = 50;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    this.field_f[var3] = this.field_a[var3];
                    var3++;
                    if (var6 != 0) {
                        statePc = 51;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (var6 == 0) {
                        statePc = 46;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var2++;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    if (var6 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    stackIn_53_0 = 0;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    var2 = stackIn_53_0;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    if (8 <= var2) {
                        statePc = 58;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    this.field_e[var2] = qg.a(this.field_e[var2], qg.a(this.field_h[var2], this.field_f[var2]));
                    var2++;
                    if (var6 != 0) {
                        statePc = 58;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    if (var6 == 0) {
                        statePc = 54;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, boolean param1, byte[] param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_k[this.field_i] = (byte)tb.a((int) this.field_k[this.field_i], 128 >>> vg.a(7, this.field_b));
                        this.field_i = this.field_i + 1;
                        if ((this.field_i ^ -1) < -33) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (this.field_i >= 64) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        fieldTemp$0 = this.field_i;
                        this.field_i = this.field_i + 1;
                        this.field_k[fieldTemp$0] = (byte) 0;
                        if (var8 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var8 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        this.b((byte) -127);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.field_i = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (-33 >= (this.field_i ^ -1)) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        fieldTemp$1 = this.field_i;
                        this.field_i = this.field_i + 1;
                        this.field_k[fieldTemp$1] = (byte) 0;
                        if (var8 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var8 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        o.a(this.field_g, 0, this.field_k, 32, 32);
                        this.b((byte) -122);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var4_int = 0;
                        if (!param1) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return;
                }
                case 16: {
                    try {
                        var5 = param0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var4_int >= 8) {
                            statePc = 26;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var6 = this.field_e[var4_int];
                        param2[var5] = (byte)(int)(var6 >>> 796419064);
                        param2[1 + var5] = (byte)(int)(var6 >>> 1141110960);
                        param2[var5 - -2] = (byte)(int)(var6 >>> -1839473176);
                        param2[3 + var5] = (byte)(int)(var6 >>> -403539104);
                        param2[4 + var5] = (byte)(int)(var6 >>> -984102248);
                        param2[5 + var5] = (byte)(int)(var6 >>> -137356848);
                        param2[var5 + 6] = (byte)(int)(var6 >>> -295675448);
                        param2[7 + var5] = (byte)(int)var6;
                        var5 += 8;
                        var4_int++;
                        if (var8 != 0) {
                            statePc = 27;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var8 == 0) {
                            statePc = 17;
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
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_24_0 = (RuntimeException) (var4);
                    stackIn_23_0 = stackIn_24_0;
                    stackIn_24_1 = new StringBuilder().append("kc.D(").append(param0).append(',').append(param1).append(',');
                    stackIn_23_1 = stackIn_24_1;
                    if (param2 == null) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_23_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_23_1);
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
                    throw ld.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
                }
                case 26: {
                    return;
                }
                case 27: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(long param0, byte[] param1, int param2) {
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = 0;
                        var6 = 7 & 8 + -((int)param0 & 7);
                        var7 = 7 & this.field_b;
                        var9 = param0;
                        var11 = 31;
                        var12 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (-1 < (var11 ^ -1)) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var12 = var12 + ((255 & this.field_g[var11]) + (255 & (int)var9));
                        this.field_g[var11] = (byte)var12;
                        var12 = var12 >>> 8;
                        var9 = var9 >>> 8;
                        var11--;
                        if (var13 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var13 == 0) {
                            statePc = 2;
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
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param2 == -24893) {
                            statePc = 8;
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
                        this.field_a = (long[]) null;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (8L >= param0) {
                            statePc = 18;
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
                        var8 = 255 & param1[var5_int] << var6 | (param1[1 + var5_int] & 255) >>> 8 - var6;
                        stackIn_25_0 = 0;
                        stackIn_11_0 = stackIn_25_0;
                        stackIn_25_1 = var8;
                        stackIn_11_1 = stackIn_25_1;
                        if (var13 != 0) {
                            statePc = 25;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (stackIn_11_0 > stackIn_11_1) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (-257 < (var8 ^ -1)) {
                            statePc = 15;
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
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw new RuntimeException("LOGIC ERROR");
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        this.field_k[this.field_i] = (byte)tb.a((int) this.field_k[this.field_i], var8 >>> var7);
                        this.field_i = this.field_i + 1;
                        this.field_b = this.field_b + (8 - var7);
                        if ((this.field_b ^ -1) != -513) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        this.b((byte) -120);
                        this.field_i = 0;
                        this.field_b = 0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        this.field_k[this.field_i] = (byte)vg.a(var8 << -var7 + 8, 255);
                        param0 = param0 - 8L;
                        var5_int++;
                        this.field_b = this.field_b + var7;
                        if (var13 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (-1L <= (param0 ^ -1L)) {
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
                        var8 = param1[var5_int] << var6 & 255;
                        this.field_k[this.field_i] = (byte)tb.a((int) this.field_k[this.field_i], var8 >>> var7);
                        if (var13 == 0) {
                            statePc = 21;
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
                        var8 = 0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (((long)var7 - -param0 ^ -1L) <= -9L) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        this.field_b = (int)((long)this.field_b + param0);
                        if (var13 == 0) {
                            statePc = 33;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        param0 = param0 - (long)(-var7 + 8);
                        this.field_i = this.field_i + 1;
                        this.field_b = this.field_b + (-var7 + 8);
                        stackIn_25_0 = this.field_b ^ -1;
                        stackIn_25_1 = -513;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (stackIn_25_0 != stackIn_25_1) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        this.b((byte) -119);
                        this.field_i = 0;
                        this.field_b = 0;
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
                        this.field_k[this.field_i] = (byte)vg.a(var8 << 8 + -var7, 255);
                        this.field_b = this.field_b + (int)param0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 29: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_31_0 = (RuntimeException) (var5);
                    stackIn_30_0 = stackIn_31_0;
                    stackIn_31_1 = new StringBuilder().append("kc.G(").append(param0).append(',');
                    stackIn_30_1 = stackIn_31_1;
                    if (param1 == null) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    stackIn_32_0 = (RuntimeException) ((Object) stackIn_30_0);
                    stackIn_32_1 = (StringBuilder) ((Object) stackIn_30_1);
                    stackIn_32_2 = "{...}";
                    statePc = 32;
                    continue stateLoop;
                }
                case 31: {
                    stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
                    stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
                    stackIn_32_2 = "null";
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    throw ld.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param2 + ')');
                }
                case 33: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = Lexicominos.field_L ? 1 : 0;
                    if (param0 >= 109) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_d = (byte[]) null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var2 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if ((var2 ^ -1) <= -33) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    this.field_g[var2] = (byte) 0;
                    var2++;
                    if (var3 != 0) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (var3 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    this.field_i = 0;
                    this.field_b = 0;
                    this.field_k[0] = (byte) 0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    var2 = 0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (8 <= var2) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    this.field_e[var2] = 0L;
                    var2++;
                    if (var3 != 0) {
                        statePc = 13;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (var3 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    kc() {
        this.field_a = new long[8];
        this.field_b = 0;
        this.field_k = new byte[64];
        this.field_f = new long[8];
        this.field_j = new long[8];
        this.field_i = 0;
        this.field_g = new byte[32];
        this.field_e = new long[8];
        this.field_h = new long[8];
    }

    static {
        field_l = new int[8192];
        field_m = new ke[10];
    }
}
