/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qh {
    static boolean field_f;
    static int[][] field_e;
    private int field_a;
    static boolean field_g;
    private int field_b;
    static byte[] field_d;
    static String field_c;
    private im field_h;
    private im field_i;

    public static void c(int param0) {
        field_e = null;
        field_c = null;
        field_d = null;
        if (param0 <= 46) {
            qh.c(126);
        }
    }

    final boolean a(int param0, int param1, byte[] param2, byte param3) {
        Object var5 = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = (Object) (Object) ((qh) this).field_h;
                    // monitorenter ((qh) this).field_h
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (0 > param0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (((qh) this).field_a >= param0) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        throw new IllegalArgumentException();
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var6 = this.a(true, param2, 255, param1, param0) ? 1 : 0;
                        if (param3 == -84) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        byte[] discarded$3 = ((qh) this).a(-6, -73);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var6 != 0) {
                            statePc = 8;
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
                        var6 = this.a(false, param2, 255, param1, param0) ? 1 : 0;
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
                        // monitorexit var5
                        stackOut_8_0 = var6;
                        stackIn_9_0 = stackOut_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return stackIn_9_0 != 0;
                }
                case 10: {
                    try {
                        var7 = caughtException;
                        // monitorexit var5
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 11: {
                    throw (RuntimeException) (Object) var7;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final byte[] a(int param0, int param1) {
        try {
            Object var3 = null;
            IOException var4 = null;
            int var4_int = 0;
            int var5 = 0;
            byte[] var6 = null;
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
            Throwable var17 = null;
            int var18 = 0;
            Object stackIn_3_0 = null;
            Object stackIn_4_0 = null;
            Object stackIn_9_0 = null;
            Object stackIn_10_0 = null;
            Object stackIn_23_0 = null;
            Object stackIn_24_0 = null;
            byte[] stackIn_51_0 = null;
            byte[] stackIn_52_0 = null;
            Object stackIn_54_0 = null;
            Object stackOut_2_0 = null;
            Object stackOut_3_0 = null;
            Object stackOut_8_0 = null;
            Object stackOut_9_0 = null;
            Object stackOut_22_0 = null;
            Object stackOut_23_0 = null;
            byte[] stackOut_50_0 = null;
            byte[] stackOut_51_0 = null;
            Object stackOut_53_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var18 = Vertigo2.field_L ? 1 : 0;
                        var3 = (Object) (Object) ((qh) this).field_h;
                        // monitorenter ((qh) this).field_h
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((long)(6 * param0 + 6) ^ -1L) >= (((qh) this).field_i.c(-1) ^ -1L)) {
                                statePc = 5;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            stackOut_2_0 = null;
                            stackIn_3_0 = stackOut_2_0;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            // monitorexit var3
                            stackOut_3_0 = stackIn_3_0;
                            stackIn_4_0 = stackOut_3_0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 55;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        return (byte[]) (Object) stackIn_4_0;
                    }
                    case 5: {
                        try {
                            ((qh) this).field_i.a(-23669, (long)(param0 * 6));
                            ((qh) this).field_i.a(-128, 0, lf.field_D, 6);
                            var4_int = (255 & lf.field_D[2]) + ((lf.field_D[0] << -953229264 & 16711680) + (lf.field_D[1] << 282636328 & 65280));
                            var5 = (255 & lf.field_D[5]) + ((16711680 & lf.field_D[3] << 1938847472) + (lf.field_D[4] << 2022756392 & 65280));
                            if ((var4_int ^ -1) <= -1) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (((qh) this).field_a >= var4_int) {
                                statePc = 11;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            stackOut_8_0 = null;
                            stackIn_9_0 = stackOut_8_0;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            // monitorexit var3
                            stackOut_9_0 = stackIn_9_0;
                            stackIn_10_0 = stackOut_9_0;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 55;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        return (byte[]) (Object) stackIn_10_0;
                    }
                    case 11: {
                        try {
                            if (param1 == 27176) {
                                statePc = 13;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            field_g = true;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (0 < var5) {
                                statePc = 15;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (((long)var5 ^ -1L) >= (((qh) this).field_h.c(-1) / 520L ^ -1L)) {
                                statePc = 19;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = 0;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (var4_int <= var7) {
                                statePc = 50;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (var5 != 0) {
                                statePc = 25;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            stackOut_22_0 = null;
                            stackIn_23_0 = stackOut_22_0;
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            // monitorexit var3
                            stackOut_23_0 = stackIn_23_0;
                            stackIn_24_0 = stackOut_23_0;
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 55;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        return (byte[]) (Object) stackIn_24_0;
                    }
                    case 25: {
                        try {
                            ((qh) this).field_h.a(-23669, (long)(var5 * 520));
                            var9 = -var7 + var4_int;
                            if ((param0 ^ -1) >= -65536) {
                                statePc = 29;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var14 = 10;
                            if (510 >= var9) {
                                statePc = 28;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var9 = 510;
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            ((qh) this).field_h.a(-121, 0, lf.field_D, var9 - -var14);
                            var12 = (255 & lf.field_D[8]) + ((255 & lf.field_D[7]) << 914174344) + (16711680 & lf.field_D[6] << -1216119280);
                            var10 = (255 & lf.field_D[3]) + (lf.field_D[2] << -1586496472 & 65280) + ((lf.field_D[1] << 1898135696 & 16711680) + (-16777216 & lf.field_D[0] << -1282574984));
                            var11 = (255 & lf.field_D[5]) + ((255 & lf.field_D[4]) << -1706133368);
                            var13 = lf.field_D[9] & 255;
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if ((var9 ^ -1) < -513) {
                                statePc = 31;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            var9 = 512;
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var14 = 8;
                            ((qh) this).field_h.a(-127, 0, lf.field_D, var9 + var14);
                            var12 = (255 & lf.field_D[6]) + (lf.field_D[5] << -1261980824 & 65280) + ((255 & lf.field_D[4]) << -868194640);
                            var13 = 255 & lf.field_D[7];
                            var10 = (255 & lf.field_D[1]) + ((lf.field_D[0] & 255) << 334869032);
                            var11 = ((255 & lf.field_D[2]) << 1328000296) + (255 & lf.field_D[3]);
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (param0 == var10) {
                                statePc = 35;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (var8 == var11) {
                                statePc = 37;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (((qh) this).field_b == var13) {
                                statePc = 41;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            if (-1 >= (var12 ^ -1)) {
                                statePc = 43;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            if ((long)var12 <= ((qh) this).field_h.c(-1) / 520L) {
                                statePc = 47;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            var15 = var14 - -var9;
                            var5 = var12;
                            var8++;
                            var16 = var14;
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if (var15 <= var16) {
                                statePc = 20;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            var7++;
                            var6[var7] = lf.field_D[var16];
                            var16++;
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            stackOut_50_0 = (byte[]) var6;
                            stackIn_51_0 = stackOut_50_0;
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            // monitorexit var3
                            stackOut_51_0 = (byte[]) (Object) stackIn_51_0;
                            stackIn_52_0 = stackOut_51_0;
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 55;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        return stackIn_52_0;
                    }
                    case 53: {
                        try {
                            var4 = (IOException) (Object) caughtException;
                            // monitorexit var3
                            stackOut_53_0 = null;
                            stackIn_54_0 = stackOut_53_0;
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 55;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        return (byte[]) (Object) stackIn_54_0;
                    }
                    case 55: {
                        try {
                            var17 = caughtException;
                            // monitorexit var3
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 55;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        throw (RuntimeException) (Object) var17;
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

    final static void a(int param0) {
        if (param0 != -32739) {
          return;
        } else {
          L0: {
            if (ce.field_b == ro.field_g.field_d) {
              break L0;
            } else {
              tc.field_b = tc.field_b + (ro.field_g.field_d - ce.field_b);
              ce.field_b = ro.field_g.field_d;
              break L0;
            }
          }
          L1: {
            if ((da.field_i ^ -1) < -1) {
              da.field_i = da.field_i - 1;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if ((da.field_i ^ -1) >= -1) {
              break L2;
            } else {
              kg.c((byte) 82);
              break L2;
            }
          }
          return;
        }
    }

    final static int b(int param0) {
        int var1 = 0;
        var1 = 15 / ((-32 - param0) / 63);
        pd.field_c.d(115);
        if (!kb.field_e.d(-3599)) {
          return f.g(0);
        } else {
          return 0;
        }
    }

    final static String d(int param0) {
        if (param0 != 0) {
            field_c = null;
        }
        return lr.field_S;
    }

    public final String toString() {
        return "" + ((qh) this).field_b;
    }

    private final boolean a(boolean param0, byte[] param1, int param2, int param3, int param4) {
        try {
            Object var6 = null;
            IOException var7 = null;
            int var7_int = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            int var12 = 0;
            int var13 = 0;
            EOFException var14 = null;
            Throwable var15 = null;
            int var16 = 0;
            int stackIn_9_0 = 0;
            int stackIn_10_0 = 0;
            int stackIn_15_0 = 0;
            int stackIn_16_0 = 0;
            int stackIn_35_0 = 0;
            int stackIn_36_0 = 0;
            int stackIn_41_0 = 0;
            int stackIn_42_0 = 0;
            int stackIn_61_0 = 0;
            int stackIn_62_0 = 0;
            int stackIn_64_0 = 0;
            int stackOut_8_0 = 0;
            int stackOut_9_0 = 0;
            int stackOut_14_0 = 0;
            int stackOut_15_0 = 0;
            int stackOut_34_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_60_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_63_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = Vertigo2.field_L ? 1 : 0;
                        var6 = (Object) (Object) ((qh) this).field_h;
                        // monitorenter ((qh) this).field_h
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (param2 == 255) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            field_f = false;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (param0) {
                                statePc = 6;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = (stateCaught_3 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var7_int = (int)((((qh) this).field_h.c(param2 ^ -256) + 519L) / 520L);
                            if (var7_int != 0) {
                                statePc = 17;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = (stateCaught_4 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var7_int = 1;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if ((long)(6 + param3 * 6) > ((qh) this).field_i.c(param2 + -256)) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            stackOut_8_0 = 0;
                            stackIn_9_0 = stackOut_8_0;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            // monitorexit var6
                            stackOut_9_0 = stackIn_9_0;
                            stackIn_10_0 = stackOut_9_0;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 65;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        return stackIn_10_0 != 0;
                    }
                    case 11: {
                        try {
                            ((qh) this).field_i.a(-23669, (long)(6 * param3));
                            ((qh) this).field_i.a(-113, 0, lf.field_D, 6);
                            var7_int = (255 & lf.field_D[5]) + (((255 & lf.field_D[4]) << 1393811496) + (16711680 & lf.field_D[3] << -1467104336));
                            if (-1 <= (var7_int ^ -1)) {
                                statePc = 14;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if ((long)var7_int <= ((qh) this).field_h.c(-1) / 520L) {
                                statePc = 17;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof IOException ? 63 : 65);
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
                            statePc = (stateCaught_14 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            // monitorexit var6
                            stackOut_15_0 = stackIn_15_0;
                            stackIn_16_0 = stackOut_15_0;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 65;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        return stackIn_16_0 != 0;
                    }
                    case 17: {
                        try {
                            lf.field_D[1] = (byte)(param4 >> -1505835672);
                            lf.field_D[0] = (byte)(param4 >> 463165328);
                            lf.field_D[5] = (byte)var7_int;
                            lf.field_D[4] = (byte)(var7_int >> -326343640);
                            lf.field_D[3] = (byte)(var7_int >> 565628080);
                            lf.field_D[2] = (byte)param4;
                            ((qh) this).field_i.a(-23669, (long)(param3 * 6));
                            ((qh) this).field_i.a(param2 + -255, 6, 0, lf.field_D);
                            var8 = 0;
                            var9 = 0;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (var8 >= param4) {
                                statePc = 60;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var10 = 0;
                            if (param0) {
                                statePc = 21;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            ((qh) this).field_h.a(-23669, (long)(var7_int * 520));
                            if ((param3 ^ -1) >= -65536) {
                                statePc = 26;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            ((qh) this).field_h.a(param2 ^ -162, 0, lf.field_D, 10);
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof EOFException ? 24 : (stateCaught_22 instanceof IOException ? 63 : 65));
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var14 = (EOFException) (Object) caughtException;
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var12 = (lf.field_D[5] & 255) + ((lf.field_D[4] & 255) << 1457726344);
                            var13 = lf.field_D[9] & 255;
                            var11 = (255 & lf.field_D[3]) + ((lf.field_D[2] & 255) << 1014555016) + (((lf.field_D[1] & 255) << 944142832) + ((lf.field_D[0] & 255) << -1913244040));
                            var10 = ((255 & lf.field_D[7]) << -1052741144) + ((16711680 & lf.field_D[6] << 418551440) + (255 & lf.field_D[8]));
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            ((qh) this).field_h.a(-122, 0, lf.field_D, 8);
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof EOFException ? 28 : (stateCaught_26 instanceof IOException ? 63 : 65));
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var14 = (EOFException) (Object) caughtException;
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var13 = lf.field_D[7] & 255;
                            var11 = (255 & lf.field_D[1]) + (65280 & lf.field_D[0] << 1015711592);
                            var12 = (255 & lf.field_D[3]) + ((255 & lf.field_D[2]) << -904456472);
                            var10 = ((lf.field_D[5] & 255) << -2022305144) + (((255 & lf.field_D[4]) << 477729040) + (255 & lf.field_D[6]));
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (var11 != param3) {
                                statePc = 34;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (var9 != var12) {
                                statePc = 34;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (((qh) this).field_b == var13) {
                                statePc = 37;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            stackOut_34_0 = 0;
                            stackIn_35_0 = stackOut_34_0;
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            // monitorexit var6
                            stackOut_35_0 = stackIn_35_0;
                            stackIn_36_0 = stackOut_35_0;
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 65;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        return stackIn_36_0 != 0;
                    }
                    case 37: {
                        try {
                            if (-1 < (var10 ^ -1)) {
                                statePc = 40;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (((qh) this).field_h.c(-1) / 520L < (long)var10) {
                                statePc = 40;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            stackOut_40_0 = 0;
                            stackIn_41_0 = stackOut_40_0;
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            // monitorexit var6
                            stackOut_41_0 = stackIn_41_0;
                            stackIn_42_0 = stackOut_41_0;
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 65;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        return stackIn_42_0 != 0;
                    }
                    case 43: {
                        try {
                            if (var10 == -1) {
                                statePc = 45;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            param0 = false;
                            var10 = (int)((((qh) this).field_h.c(-1) + 519L) / 520L);
                            if (-1 == var10) {
                                statePc = 47;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            var10++;
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if (var7_int != var10) {
                                statePc = 50;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            var10++;
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            if (-513 > (-var8 + param4 ^ -1)) {
                                statePc = 52;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            var10 = 0;
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            if ((param3 ^ -1) >= -65536) {
                                statePc = 56;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            lf.field_D[2] = (byte)(param3 >> 1528977672);
                            lf.field_D[5] = (byte)var9;
                            lf.field_D[3] = (byte)param3;
                            lf.field_D[4] = (byte)(var9 >> 1895254248);
                            lf.field_D[0] = (byte)(param3 >> 360804120);
                            lf.field_D[9] = (byte)((qh) this).field_b;
                            lf.field_D[1] = (byte)(param3 >> 346081008);
                            lf.field_D[6] = (byte)(var10 >> 34843184);
                            lf.field_D[8] = (byte)var10;
                            lf.field_D[7] = (byte)(var10 >> 1746676296);
                            ((qh) this).field_h.a(-23669, (long)(520 * var7_int));
                            ((qh) this).field_h.a(param2 ^ 255, 10, 0, lf.field_D);
                            var11 = param4 - var8;
                            if (510 >= var11) {
                                statePc = 55;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            var11 = 510;
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            ((qh) this).field_h.a(param2 ^ 255, var11, var8, param1);
                            var8 = var8 + var11;
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            lf.field_D[7] = (byte)((qh) this).field_b;
                            lf.field_D[5] = (byte)(var10 >> -1630870456);
                            lf.field_D[2] = (byte)(var9 >> -1171449496);
                            lf.field_D[3] = (byte)var9;
                            lf.field_D[4] = (byte)(var10 >> 2124801712);
                            lf.field_D[1] = (byte)param3;
                            lf.field_D[6] = (byte)var10;
                            lf.field_D[0] = (byte)(param3 >> 1793840008);
                            ((qh) this).field_h.a(-23669, (long)(var7_int * 520));
                            ((qh) this).field_h.a(param2 + -255, 8, 0, lf.field_D);
                            var11 = param4 - var8;
                            if (-513 <= (var11 ^ -1)) {
                                statePc = 58;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            var11 = 512;
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            ((qh) this).field_h.a(0, var11, var8, param1);
                            var8 = var8 + var11;
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            var7_int = var10;
                            var9++;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            stackOut_60_0 = 1;
                            stackIn_61_0 = stackOut_60_0;
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            // monitorexit var6
                            stackOut_61_0 = stackIn_61_0;
                            stackIn_62_0 = stackOut_61_0;
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 65;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        return stackIn_62_0 != 0;
                    }
                    case 63: {
                        try {
                            var7 = (IOException) (Object) caughtException;
                            // monitorexit var6
                            stackOut_63_0 = 0;
                            stackIn_64_0 = stackOut_63_0;
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 65;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        return stackIn_64_0 != 0;
                    }
                    case 65: {
                        try {
                            var15 = caughtException;
                            // monitorexit var6
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 65;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        throw (RuntimeException) (Object) var15;
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

    qh(int param0, im param1, im param2, int param3) {
        ((qh) this).field_h = null;
        ((qh) this).field_i = null;
        ((qh) this).field_a = 65000;
        ((qh) this).field_i = param2;
        ((qh) this).field_h = param1;
        ((qh) this).field_b = param0;
        ((qh) this).field_a = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Level <%0> of <%1>";
    }
}
