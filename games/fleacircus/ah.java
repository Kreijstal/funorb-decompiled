/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ah {
    private int field_b;
    static sf field_a;
    static boolean field_c;
    private int field_d;
    static int[] field_g;
    private k field_f;
    private k field_e;

    public final String toString() {
        return "" + ((ah) this).field_d;
    }

    final boolean a(byte[] param0, int param1, int param2, byte param3) {
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        Throwable var8 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = (Object) (Object) ((ah) this).field_f;
                    // monitorenter ((ah) this).field_f
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 < 0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (((ah) this).field_b >= param1) {
                            statePc = 4;
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
                        throw new IllegalArgumentException();
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var6 = this.a((byte) 37, param0, param1, param2, true) ? 1 : 0;
                        if (var6 != 0) {
                            statePc = 6;
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
                        var6 = this.a((byte) 37, param0, param1, param2, false) ? 1 : 0;
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
                        var7 = -45 % ((param3 - 42) / 43);
                        // monitorexit var5
                        stackOut_6_0 = var6;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0 != 0;
                }
                case 8: {
                    try {
                        var8 = caughtException;
                        // monitorexit var5
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 9: {
                    throw (RuntimeException) (Object) var8;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final boolean a(byte param0, byte[] param1, int param2, int param3, boolean param4) {
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
            int stackIn_4_0 = 0;
            int stackIn_5_0 = 0;
            int stackIn_10_0 = 0;
            int stackIn_11_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_35_0 = 0;
            int stackIn_40_0 = 0;
            int stackIn_41_0 = 0;
            int stackIn_60_0 = 0;
            int stackIn_61_0 = 0;
            int stackIn_63_0 = 0;
            int stackOut_3_0 = 0;
            int stackOut_4_0 = 0;
            int stackOut_9_0 = 0;
            int stackOut_10_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_34_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_59_0 = 0;
            int stackOut_60_0 = 0;
            int stackOut_62_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = fleas.field_A ? 1 : 0;
                        var6 = (Object) (Object) ((ah) this).field_f;
                        // monitorenter ((ah) this).field_f
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (!param4) {
                                statePc = 12;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if ((((ah) this).field_e.c((byte) -123) ^ -1L) <= ((long)(6 + param3 * 6) ^ -1L)) {
                                statePc = 6;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof IOException ? 62 : 64);
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
                            statePc = (stateCaught_3 instanceof IOException ? 62 : 64);
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
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        return stackIn_5_0 != 0;
                    }
                    case 6: {
                        try {
                            ((ah) this).field_e.a(-116, (long)(param3 * 6));
                            ((ah) this).field_e.a(nf.field_G, 0, 6, 6520);
                            var7_int = (nf.field_G[5] & 255) + ((16711680 & nf.field_G[3] << -1991428912) + ((255 & nf.field_G[4]) << -672335256));
                            if ((var7_int ^ -1) >= -1) {
                                statePc = 9;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (((ah) this).field_f.c((byte) -83) / 520L < (long)var7_int) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof IOException ? 62 : 64);
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
                            statePc = (stateCaught_9 instanceof IOException ? 62 : 64);
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
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        return stackIn_11_0 != 0;
                    }
                    case 12: {
                        try {
                            var7_int = (int)((((ah) this).field_f.c((byte) -91) - -519L) / 520L);
                            if (var7_int != 0) {
                                statePc = 14;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            var7_int = 1;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            nf.field_G[0] = (byte)(param2 >> 1634713456);
                            nf.field_G[2] = (byte)param2;
                            nf.field_G[3] = (byte)(var7_int >> -1536108208);
                            nf.field_G[5] = (byte)var7_int;
                            nf.field_G[1] = (byte)(param2 >> -1298468600);
                            nf.field_G[4] = (byte)(var7_int >> 440007432);
                            ((ah) this).field_e.a(param0 ^ -81, (long)(6 * param3));
                            if (param0 == 37) {
                                statePc = 16;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            ah.a(103);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            ((ah) this).field_e.a(0, nf.field_G, 6, (byte) 114);
                            var8 = 0;
                            var9 = 0;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (param2 <= var8) {
                                statePc = 59;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var10 = 0;
                            if (param4) {
                                statePc = 20;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            ((ah) this).field_f.a(-124, (long)(var7_int * 520));
                            if (-65536 <= (param3 ^ -1)) {
                                statePc = 25;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            ((ah) this).field_f.a(nf.field_G, 0, 10, 6520);
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof EOFException ? 23 : (stateCaught_21 instanceof IOException ? 62 : 64));
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var14 = (EOFException) (Object) caughtException;
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var10 = (65280 & nf.field_G[7] << -1402330968) + ((nf.field_G[6] & 255) << -1763458992) + (nf.field_G[8] & 255);
                            var11 = (255 & nf.field_G[3]) + (nf.field_G[2] << 1900449864 & 65280) + (((255 & nf.field_G[1]) << -1481339888) + ((255 & nf.field_G[0]) << -305278632));
                            var12 = ((255 & nf.field_G[4]) << -1288486424) - -(255 & nf.field_G[5]);
                            var13 = nf.field_G[9] & 255;
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            ((ah) this).field_f.a(nf.field_G, 0, 8, 6520);
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof EOFException ? 27 : (stateCaught_25 instanceof IOException ? 62 : 64));
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var14 = (EOFException) (Object) caughtException;
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var11 = (nf.field_G[0] << -307250616 & 65280) - -(255 & nf.field_G[1]);
                            var13 = nf.field_G[7] & 255;
                            var12 = (65280 & nf.field_G[2] << -667106104) - -(nf.field_G[3] & 255);
                            var10 = (65280 & nf.field_G[5] << 390184104) + (((255 & nf.field_G[4]) << 310161104) + (nf.field_G[6] & 255));
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (var11 != param3) {
                                statePc = 33;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (var12 != var9) {
                                statePc = 33;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (((ah) this).field_d == var13) {
                                statePc = 36;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            stackOut_33_0 = 0;
                            stackIn_34_0 = stackOut_33_0;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            // monitorexit var6
                            stackOut_34_0 = stackIn_34_0;
                            stackIn_35_0 = stackOut_34_0;
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        return stackIn_35_0 != 0;
                    }
                    case 36: {
                        try {
                            if ((var10 ^ -1) > -1) {
                                statePc = 39;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (((ah) this).field_f.c((byte) -76) / 520L < (long)var10) {
                                statePc = 39;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            stackOut_39_0 = 0;
                            stackIn_40_0 = stackOut_39_0;
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            // monitorexit var6
                            stackOut_40_0 = stackIn_40_0;
                            stackIn_41_0 = stackOut_40_0;
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        return stackIn_41_0 != 0;
                    }
                    case 42: {
                        try {
                            if (0 != var10) {
                                statePc = 49;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            param4 = false;
                            var10 = (int)((519L + ((ah) this).field_f.c((byte) -48)) / 520L);
                            if (0 == var10) {
                                statePc = 45;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            var10++;
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if (var10 == var7_int) {
                                statePc = 48;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            var10++;
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            if (-513 > param2 + -var8) {
                                statePc = 51;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            var10 = 0;
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            if (-65536 >= param3) {
                                statePc = 55;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            nf.field_G[3] = (byte)param3;
                            nf.field_G[8] = (byte)var10;
                            nf.field_G[6] = (byte)(var10 >> 1717980144);
                            nf.field_G[0] = (byte)(param3 >> -1758518504);
                            nf.field_G[4] = (byte)(var9 >> -409607000);
                            nf.field_G[7] = (byte)(var10 >> 623552520);
                            nf.field_G[2] = (byte)(param3 >> 1878880328);
                            nf.field_G[9] = (byte)((ah) this).field_d;
                            nf.field_G[1] = (byte)(param3 >> -632159568);
                            nf.field_G[5] = (byte)var9;
                            ((ah) this).field_f.a(-104, (long)(520 * var7_int));
                            ((ah) this).field_f.a(0, nf.field_G, 10, (byte) 76);
                            var11 = param2 - var8;
                            if (var11 <= 510) {
                                statePc = 54;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            var11 = 510;
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            ((ah) this).field_f.a(var8, param1, var11, (byte) -59);
                            var8 = var8 + var11;
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            nf.field_G[4] = (byte)(var10 >> 1366220400);
                            nf.field_G[7] = (byte)((ah) this).field_d;
                            nf.field_G[0] = (byte)(param3 >> 382906856);
                            nf.field_G[5] = (byte)(var10 >> 385167112);
                            nf.field_G[3] = (byte)var9;
                            nf.field_G[2] = (byte)(var9 >> -904389912);
                            nf.field_G[6] = (byte)var10;
                            nf.field_G[1] = (byte)param3;
                            ((ah) this).field_f.a(-111, (long)(var7_int * 520));
                            ((ah) this).field_f.a(0, nf.field_G, 8, (byte) 92);
                            var11 = -var8 + param2;
                            if (var11 <= 512) {
                                statePc = 57;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            var11 = 512;
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            ((ah) this).field_f.a(var8, param1, var11, (byte) -30);
                            var8 = var8 + var11;
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            var9++;
                            var7_int = var10;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            stackOut_59_0 = 1;
                            stackIn_60_0 = stackOut_59_0;
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            // monitorexit var6
                            stackOut_60_0 = stackIn_60_0;
                            stackIn_61_0 = stackOut_60_0;
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        return stackIn_61_0 != 0;
                    }
                    case 62: {
                        try {
                            var7 = (IOException) (Object) caughtException;
                            // monitorexit var6
                            stackOut_62_0 = 0;
                            stackIn_63_0 = stackOut_62_0;
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        return stackIn_63_0 != 0;
                    }
                    case 64: {
                        try {
                            var15 = caughtException;
                            // monitorexit var6
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 65: {
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

    public static void a(boolean param0) {
        field_g = null;
        if (!param0) {
            ah.a(18);
        }
        field_a = null;
    }

    final byte[] a(byte param0, int param1) {
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
            Object stackIn_15_0 = null;
            Object stackIn_16_0 = null;
            Object stackIn_21_0 = null;
            Object stackIn_22_0 = null;
            Object stackIn_36_0 = null;
            Object stackIn_37_0 = null;
            Object stackIn_49_0 = null;
            Object stackIn_50_0 = null;
            byte[] stackIn_52_0 = null;
            byte[] stackIn_53_0 = null;
            Object stackIn_55_0 = null;
            Object stackOut_2_0 = null;
            Object stackOut_3_0 = null;
            Object stackOut_8_0 = null;
            Object stackOut_9_0 = null;
            Object stackOut_14_0 = null;
            Object stackOut_15_0 = null;
            Object stackOut_20_0 = null;
            Object stackOut_21_0 = null;
            Object stackOut_35_0 = null;
            Object stackOut_36_0 = null;
            Object stackOut_48_0 = null;
            Object stackOut_49_0 = null;
            byte[] stackOut_51_0 = null;
            byte[] stackOut_52_0 = null;
            Object stackOut_54_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var18 = fleas.field_A ? 1 : 0;
                        var3 = (Object) (Object) ((ah) this).field_f;
                        // monitorenter ((ah) this).field_f
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if ((long)(6 + param1 * 6) <= ((ah) this).field_e.c((byte) -110)) {
                                statePc = 5;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof IOException ? 54 : 56);
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
                            statePc = (stateCaught_2 instanceof IOException ? 54 : 56);
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
                            statePc = 56;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        return (byte[]) (Object) stackIn_4_0;
                    }
                    case 5: {
                        try {
                            ((ah) this).field_e.a(-119, (long)(6 * param1));
                            ((ah) this).field_e.a(nf.field_G, 0, 6, 6520);
                            var4_int = ((nf.field_G[0] & 255) << 535287472) + ((nf.field_G[1] << -876367736 & 65280) + (255 & nf.field_G[2]));
                            var5 = (65280 & nf.field_G[4] << -2096846200) + ((16711680 & nf.field_G[3] << 1331838288) - -(nf.field_G[5] & 255));
                            if ((var4_int ^ -1) <= -1) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (var4_int <= ((ah) this).field_b) {
                                statePc = 11;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof IOException ? 54 : 56);
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
                            statePc = (stateCaught_8 instanceof IOException ? 54 : 56);
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
                            statePc = 56;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        return (byte[]) (Object) stackIn_10_0;
                    }
                    case 11: {
                        try {
                            if (0 < var5) {
                                statePc = 13;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if ((long)var5 <= ((ah) this).field_f.c((byte) -103) / 520L) {
                                statePc = 17;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof IOException ? 54 : 56);
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
                            statePc = (stateCaught_14 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            // monitorexit var3
                            stackOut_15_0 = stackIn_15_0;
                            stackIn_16_0 = stackOut_15_0;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 56;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        return (byte[]) (Object) stackIn_16_0;
                    }
                    case 17: {
                        try {
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = 0;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (var4_int <= var7) {
                                statePc = 47;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (0 != var5) {
                                statePc = 23;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            stackOut_20_0 = null;
                            stackIn_21_0 = stackOut_20_0;
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            // monitorexit var3
                            stackOut_21_0 = stackIn_21_0;
                            stackIn_22_0 = stackOut_21_0;
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 56;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        return (byte[]) (Object) stackIn_22_0;
                    }
                    case 23: {
                        try {
                            ((ah) this).field_f.a(param0 + -23, (long)(var5 * 520));
                            var9 = -var7 + var4_int;
                            if (65535 >= param1) {
                                statePc = 27;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var14 = 10;
                            if (var9 <= 510) {
                                statePc = 26;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var9 = 510;
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            ((ah) this).field_f.a(nf.field_G, 0, var9 - -var14, 6520);
                            var10 = ((255 & nf.field_G[0]) << 1234177400) - -(16711680 & nf.field_G[1] << 288839536) - -(65280 & nf.field_G[2] << -1544675288) - -(nf.field_G[3] & 255);
                            var11 = (nf.field_G[4] << -815187416 & 65280) + (255 & nf.field_G[5]);
                            var13 = nf.field_G[9] & 255;
                            var12 = (65280 & nf.field_G[7] << 339341960) + (16711680 & nf.field_G[6] << 1326112048) - -(nf.field_G[8] & 255);
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var14 = 8;
                            if (-513 <= (var9 ^ -1)) {
                                statePc = 29;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 54 : 56);
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
                            statePc = (stateCaught_28 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            ((ah) this).field_f.a(nf.field_G, 0, var14 + var9, 6520);
                            var12 = (nf.field_G[6] & 255) + (((255 & nf.field_G[5]) << -1340155288) + ((255 & nf.field_G[4]) << 193044976));
                            var10 = ((255 & nf.field_G[0]) << 1142077704) - -(255 & nf.field_G[1]);
                            var11 = (65280 & nf.field_G[2] << -1178278136) + (255 & nf.field_G[3]);
                            var13 = 255 & nf.field_G[7];
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (var10 == param1) {
                                statePc = 32;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (var8 == var11) {
                                statePc = 34;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (((ah) this).field_d == var13) {
                                statePc = 38;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            stackOut_35_0 = null;
                            stackIn_36_0 = stackOut_35_0;
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            // monitorexit var3
                            stackOut_36_0 = stackIn_36_0;
                            stackIn_37_0 = stackOut_36_0;
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 56;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        return (byte[]) (Object) stackIn_37_0;
                    }
                    case 38: {
                        try {
                            if ((var12 ^ -1) <= -1) {
                                statePc = 40;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if ((long)var12 <= ((ah) this).field_f.c((byte) -125) / 520L) {
                                statePc = 44;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            var15 = var9 + var14;
                            var5 = var12;
                            var8++;
                            var16 = var14;
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            if (var15 <= var16) {
                                statePc = 18;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            var7++;
                            var6[var7] = nf.field_G[var16];
                            var16++;
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            if (param0 == -90) {
                                statePc = 51;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof IOException ? 54 : 56);
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
                            statePc = (stateCaught_48 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            // monitorexit var3
                            stackOut_49_0 = stackIn_49_0;
                            stackIn_50_0 = stackOut_49_0;
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 56;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        return (byte[]) (Object) stackIn_50_0;
                    }
                    case 51: {
                        try {
                            stackOut_51_0 = (byte[]) var6;
                            stackIn_52_0 = stackOut_51_0;
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            // monitorexit var3
                            stackOut_52_0 = (byte[]) (Object) stackIn_52_0;
                            stackIn_53_0 = stackOut_52_0;
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 56;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        return stackIn_53_0;
                    }
                    case 54: {
                        try {
                            var4 = (IOException) (Object) caughtException;
                            // monitorexit var3
                            stackOut_54_0 = null;
                            stackIn_55_0 = stackOut_54_0;
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 56;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        return (byte[]) (Object) stackIn_55_0;
                    }
                    case 56: {
                        try {
                            var17 = caughtException;
                            // monitorexit var3
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 56;
                            continue stateLoop;
                        }
                    }
                    case 57: {
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
        int var2 = 0;
        L0: {
          var2 = fleas.field_A ? 1 : 0;
          if (param0 == -1) {
            break L0;
          } else {
            field_c = true;
            break L0;
          }
        }
        if (!vf.c((byte) -5)) {
          L1: {
            if (null == rh.field_p) {
              break L1;
            } else {
              if (!rh.field_p.field_c) {
                break L1;
              } else {
                lh.a(false);
                mg.field_a.b((qa) (Object) new ic(mg.field_a, fb.field_g), (byte) -35);
                break L1;
              }
            }
          }
          return;
        } else {
          boolean discarded$14 = mg.field_a.a(hm.field_d, param0 + 41, true, bk.field_b);
          mg.field_a.d(true);
          L2: while (true) {
            if (!wf.b(-113)) {
              return;
            } else {
              boolean discarded$15 = mg.field_a.a(id.field_b, (byte) -105, ji.field_a);
              continue L2;
            }
          }
        }
    }

    ah(int param0, k param1, k param2, int param3) {
        ((ah) this).field_b = 65000;
        ((ah) this).field_f = null;
        ((ah) this).field_e = null;
        ((ah) this).field_b = param3;
        ((ah) this).field_e = param2;
        ((ah) this).field_f = param1;
        ((ah) this).field_d = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = false;
        field_g = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    }
}
