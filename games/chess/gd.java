/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gd {
    static ci field_b;
    static String field_d;
    static boolean field_e;
    private lc field_h;
    private lc field_a;
    static String field_f;
    private int field_c;
    private int field_g;

    final boolean a(int param0, byte[] param1, byte param2, int param3) {
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
                    if (param2 == 59) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    int discarded$3 = gd.a(118);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var5 = (Object) (Object) ((gd) this).field_a;
                    // monitorenter ((gd) this).field_a
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        if (0 > param3) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (((gd) this).field_c >= param3) {
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
                        throw new IllegalArgumentException();
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var6 = this.a(param1, param0, true, param3, 68) ? 1 : 0;
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
                        var6 = this.a(param1, param0, false, param3, 82) ? 1 : 0;
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
            Object var19 = null;
            Object stackIn_15_0 = null;
            Object stackIn_16_0 = null;
            Object stackIn_23_0 = null;
            Object stackIn_24_0 = null;
            byte[] stackIn_51_0 = null;
            byte[] stackIn_52_0 = null;
            Object stackIn_54_0 = null;
            Object stackOut_14_0 = null;
            Object stackOut_15_0 = null;
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
                        var18 = Chess.field_G;
                        var3 = (Object) (Object) ((gd) this).field_a;
                        // monitorenter ((gd) this).field_a
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if ((((gd) this).field_h.c((byte) 109) ^ -1L) <= ((long)(6 + 6 * param0) ^ -1L)) {
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
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            ((gd) this).field_h.a((long)(param0 * 6), 0);
                            ((gd) this).field_h.a(jg.field_O, -19616, 0, 6);
                            var4_int = ((jg.field_O[0] & 255) << -890717616) - (-(65280 & jg.field_O[1] << -1518102360) - (255 & jg.field_O[2]));
                            var5 = (jg.field_O[5] & 255) + ((jg.field_O[3] & 255) << -1307216688) - -(65280 & jg.field_O[4] << 2051841704);
                            if (-1 >= (var4_int ^ -1)) {
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
                            if (var4_int <= ((gd) this).field_c) {
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
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (var5 > 0) {
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
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (((gd) this).field_a.c((byte) 109) / 520L >= (long)var5) {
                                statePc = 17;
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
                            stackOut_14_0 = null;
                            stackIn_15_0 = stackOut_14_0;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            // monitorexit var3
                            stackOut_15_0 = (Object) (Object) stackIn_15_0;
                            stackIn_16_0 = stackOut_15_0;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 55;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        return (byte[]) (Object) stackIn_16_0;
                    }
                    case 17: {
                        try {
                            if (param1 >= 92) {
                                statePc = 19;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var19 = null;
                            boolean discarded$1 = ((gd) this).a(-51, (byte[]) null, (byte) -18, -53);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof IOException ? 53 : 55);
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
                            if (var7 >= var4_int) {
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
                            stackOut_23_0 = (Object) (Object) stackIn_23_0;
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
                            ((gd) this).field_a.a((long)(var5 * 520), 0);
                            var9 = var4_int - var7;
                            if (-65536 > (param0 ^ -1)) {
                                statePc = 30;
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
                            var14 = 8;
                            if (var9 > 512) {
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
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var9 = 512;
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            ((gd) this).field_a.a(jg.field_O, -19616, 0, var9 + var14);
                            var12 = (jg.field_O[6] & 255) + ((jg.field_O[4] << 370837840 & 16711680) + (65280 & jg.field_O[5] << 978188200));
                            var13 = 255 & jg.field_O[7];
                            var10 = (255 & jg.field_O[1]) + (65280 & jg.field_O[0] << -1945205560);
                            var11 = (65280 & jg.field_O[2] << 2117000072) - -(255 & jg.field_O[3]);
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (-511 <= (var9 ^ -1)) {
                                statePc = 32;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            var9 = 510;
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
                            var14 = 10;
                            ((gd) this).field_a.a(jg.field_O, -19616, 0, var14 + var9);
                            var13 = jg.field_O[9] & 255;
                            var12 = (65280 & jg.field_O[7] << 1611570504) + (((jg.field_O[6] & 255) << 944875696) - -(255 & jg.field_O[8]));
                            var10 = ((255 & jg.field_O[2]) << -436676792) + (jg.field_O[0] << 1760239576 & -16777216) - -((jg.field_O[1] & 255) << 96506064) - -(jg.field_O[3] & 255);
                            var11 = (jg.field_O[4] << -529222392 & 65280) - -(255 & jg.field_O[5]);
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
                            if (var13 == ((gd) this).field_g) {
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
                            if ((var12 ^ -1) <= -1) {
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
                            if (((gd) this).field_a.c((byte) 109) / 520L >= (long)var12) {
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
                            var15 = var9 + var14;
                            var8++;
                            var5 = var12;
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
                            if (var16 >= var15) {
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
                            var6[var7] = jg.field_O[var16];
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
                        return (byte[]) (Object) stackIn_52_0;
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

    public final String toString() {
        return "" + ((gd) this).field_g;
    }

    final static boolean a(byte param0, boolean param1) {
        try {
            nk var4 = null;
            nk var5 = null;
            if (null == tl.field_Gb) {
                tl.field_Gb = re.field_n.a(am.field_d, false, qh.field_a);
            }
            if (0 == tl.field_Gb.field_f) {
                return false;
            }
            if (param0 != 68) {
                boolean discarded$0 = gd.a((byte) -72, false);
            }
            ta.field_t = ud.a(param0 ^ 70);
            ml.field_d = ud.a(param0 ^ 70);
            if (-2 != (tl.field_Gb.field_f ^ -1)) {
                tb.field_f = gh.field_c;
            } else {
                try {
                    lj.field_a = new hn((java.net.Socket) tl.field_Gb.field_b, re.field_n);
                    qn.field_U.field_l = 0;
                    var4 = tk.field_h;
                    var5 = var4;
                    lf.field_T = param1 ? -2 : -1;
                    wc.field_u = param1 ? -2 : -1;
                    hh.field_o = param1 ? -2 : -1;
                    var5.field_l = 0;
                    tb.field_f = ca.field_h;
                    dh.a(fn.field_b, 11, cm.field_u, ub.field_e, (p) (Object) qn.field_U);
                    vh.a(-1, (byte) -35);
                } catch (IOException iOException) {
                    tb.field_f = gh.field_c;
                }
            }
            tl.field_Gb = null;
            return true;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0) {
        if (param0 != 5) {
            return -100;
        }
        return -ai.field_j + ca.field_j;
    }

    private final boolean a(byte[] param0, int param1, boolean param2, int param3, int param4) {
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
            int var14 = 0;
            EOFException var15 = null;
            Throwable var16 = null;
            int var17 = 0;
            int stackIn_4_0 = 0;
            int stackIn_5_0 = 0;
            int stackIn_10_0 = 0;
            int stackIn_11_0 = 0;
            int stackIn_33_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_39_0 = 0;
            int stackIn_40_0 = 0;
            int stackIn_61_0 = 0;
            int stackIn_62_0 = 0;
            int stackIn_64_0 = 0;
            int stackOut_3_0 = 0;
            int stackOut_4_0 = 0;
            int stackOut_9_0 = 0;
            int stackOut_10_0 = 0;
            int stackOut_32_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_38_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_60_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_63_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var17 = Chess.field_G;
                        var6 = (Object) (Object) ((gd) this).field_a;
                        // monitorenter ((gd) this).field_a
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (!param2) {
                                statePc = 12;
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
                            if ((long)(6 + param1 * 6) <= ((gd) this).field_h.c((byte) 109)) {
                                statePc = 6;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            stackOut_3_0 = 0;
                            stackIn_4_0 = stackOut_3_0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = (stateCaught_3 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            // monitorexit var6
                            stackOut_4_0 = stackIn_4_0;
                            stackIn_5_0 = stackOut_4_0;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 65;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        return stackIn_5_0 != 0;
                    }
                    case 6: {
                        try {
                            ((gd) this).field_h.a((long)(param1 * 6), 0);
                            ((gd) this).field_h.a(jg.field_O, -19616, 0, 6);
                            var7_int = (255 & jg.field_O[5]) + ((16711680 & jg.field_O[3] << -1175302704) + ((jg.field_O[4] & 255) << 1655604520));
                            if (0 >= var7_int) {
                                statePc = 9;
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
                            if (((long)var7_int ^ -1L) < (((gd) this).field_a.c((byte) 109) / 520L ^ -1L)) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            stackOut_9_0 = 0;
                            stackIn_10_0 = stackOut_9_0;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = (stateCaught_9 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            // monitorexit var6
                            stackOut_10_0 = stackIn_10_0;
                            stackIn_11_0 = stackOut_10_0;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 65;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        return stackIn_11_0 != 0;
                    }
                    case 12: {
                        try {
                            var7_int = (int)((519L + ((gd) this).field_a.c((byte) 109)) / 520L);
                            if (var7_int == 0) {
                                statePc = 14;
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
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            var7_int = 1;
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
                            jg.field_O[5] = (byte)var7_int;
                            jg.field_O[3] = (byte)(var7_int >> -1943665136);
                            jg.field_O[4] = (byte)(var7_int >> 775096520);
                            var8 = -43 / ((param4 - -55) / 57);
                            jg.field_O[0] = (byte)(param3 >> -1945334864);
                            jg.field_O[2] = (byte)param3;
                            jg.field_O[1] = (byte)(param3 >> -1156411160);
                            ((gd) this).field_h.a((long)(param1 * 6), 0);
                            ((gd) this).field_h.a(0, 6, -1, jg.field_O);
                            var9 = 0;
                            var10 = 0;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (param3 <= var9) {
                                statePc = 60;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var11 = 0;
                            if (!param2) {
                                statePc = 41;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            ((gd) this).field_a.a((long)(520 * var7_int), 0);
                            if ((param1 ^ -1) >= -65536) {
                                statePc = 24;
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
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            ((gd) this).field_a.a(jg.field_O, -19616, 0, 10);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof EOFException ? 22 : (stateCaught_20 instanceof IOException ? 63 : 65));
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var15 = (EOFException) (Object) caughtException;
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var11 = (255 & jg.field_O[8]) + ((16711680 & jg.field_O[6] << 1184631760) + (jg.field_O[7] << -1882783192 & 65280));
                            var14 = jg.field_O[9] & 255;
                            var13 = (jg.field_O[4] << -404195640 & 65280) + (255 & jg.field_O[5]);
                            var12 = (jg.field_O[3] & 255) + ((jg.field_O[2] & 255) << 1839328904) + ((16711680 & jg.field_O[1] << 672141104) + ((jg.field_O[0] & 255) << 53822776));
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            ((gd) this).field_a.a(jg.field_O, -19616, 0, 8);
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof EOFException ? 26 : (stateCaught_24 instanceof IOException ? 63 : 65));
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var15 = (EOFException) (Object) caughtException;
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var14 = 255 & jg.field_O[7];
                            var11 = (jg.field_O[6] & 255) + (((255 & jg.field_O[4]) << 785940112) - -(jg.field_O[5] << 1617576264 & 65280));
                            var12 = (255 & jg.field_O[1]) + (65280 & jg.field_O[0] << 497841608);
                            var13 = (255 & jg.field_O[3]) + ((jg.field_O[2] & 255) << 346547080);
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (param1 != var12) {
                                statePc = 32;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (var13 != var10) {
                                statePc = 32;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (var14 != ((gd) this).field_g) {
                                statePc = 32;
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
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            stackOut_32_0 = 0;
                            stackIn_33_0 = stackOut_32_0;
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            // monitorexit var6
                            stackOut_33_0 = stackIn_33_0;
                            stackIn_34_0 = stackOut_33_0;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 65;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        return stackIn_34_0 != 0;
                    }
                    case 35: {
                        try {
                            if (var11 < 0) {
                                statePc = 38;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            if (((gd) this).field_a.c((byte) 109) / 520L >= (long)var11) {
                                statePc = 41;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            stackOut_38_0 = 0;
                            stackIn_39_0 = stackOut_38_0;
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            // monitorexit var6
                            stackOut_39_0 = stackIn_39_0;
                            stackIn_40_0 = stackOut_39_0;
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 65;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        return stackIn_40_0 != 0;
                    }
                    case 41: {
                        try {
                            if (-1 != (var11 ^ -1)) {
                                statePc = 47;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            var11 = (int)((((gd) this).field_a.c((byte) 109) - -519L) / 520L);
                            param2 = false;
                            if (var11 != 0) {
                                statePc = 44;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            var11++;
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            if (var7_int == var11) {
                                statePc = 46;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            statePc = 47;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            var11++;
                            statePc = 47;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            if ((-var9 + param3 ^ -1) >= -513) {
                                statePc = 49;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            var11 = 0;
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
                            if (65535 >= param1) {
                                statePc = 55;
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
                            jg.field_O[6] = (byte)(var11 >> -1893675824);
                            jg.field_O[7] = (byte)(var11 >> -633103064);
                            jg.field_O[0] = (byte)(param1 >> 1014870328);
                            jg.field_O[4] = (byte)(var10 >> -1464376248);
                            jg.field_O[2] = (byte)(param1 >> -131258360);
                            jg.field_O[8] = (byte)var11;
                            jg.field_O[5] = (byte)var10;
                            jg.field_O[1] = (byte)(param1 >> 795634864);
                            jg.field_O[9] = (byte)((gd) this).field_g;
                            jg.field_O[3] = (byte)param1;
                            ((gd) this).field_a.a((long)(var7_int * 520), 0);
                            ((gd) this).field_a.a(0, 10, -1, jg.field_O);
                            var12 = -var9 + param3;
                            if ((var12 ^ -1) < -511) {
                                statePc = 53;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            var12 = 510;
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            ((gd) this).field_a.a(var9, var12, -1, param0);
                            var9 = var9 + var12;
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            jg.field_O[7] = (byte)((gd) this).field_g;
                            jg.field_O[0] = (byte)(param1 >> -1643559512);
                            jg.field_O[6] = (byte)var11;
                            jg.field_O[2] = (byte)(var10 >> 1451493608);
                            jg.field_O[1] = (byte)param1;
                            jg.field_O[5] = (byte)(var11 >> 450090824);
                            jg.field_O[3] = (byte)var10;
                            jg.field_O[4] = (byte)(var11 >> 1218784496);
                            ((gd) this).field_a.a((long)(520 * var7_int), 0);
                            ((gd) this).field_a.a(0, 8, -1, jg.field_O);
                            var12 = param3 + -var9;
                            if (var12 > 512) {
                                statePc = 57;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            var12 = 512;
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
                            ((gd) this).field_a.a(var9, var12, -1, param0);
                            var9 = var9 + var12;
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
                            var7_int = var11;
                            var10++;
                            statePc = 16;
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
                            var16 = caughtException;
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
                        throw (RuntimeException) (Object) var16;
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

    public static void a(byte param0) {
        field_f = null;
        field_b = null;
        field_d = null;
        int var1 = 62 % ((-52 - param0) / 40);
    }

    gd(int param0, lc param1, lc param2, int param3) {
        ((gd) this).field_h = null;
        ((gd) this).field_c = 65000;
        ((gd) this).field_a = null;
        ((gd) this).field_h = param2;
        ((gd) this).field_c = param3;
        ((gd) this).field_g = param0;
        ((gd) this).field_a = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Show chat (<%0> unread messages)";
        field_f = "Play free version";
    }
}
