/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ak {
    private we field_e;
    private int field_b;
    static String field_c;
    private int field_f;
    private we field_d;
    static int field_a;

    public static void a(byte param0) {
        if (param0 < 114) {
            field_c = null;
        }
        field_c = null;
    }

    final byte[] b(int param0, int param1) {
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
            Object stackIn_17_0 = null;
            Object stackIn_18_0 = null;
            Object stackIn_23_0 = null;
            Object stackIn_24_0 = null;
            Object stackIn_44_0 = null;
            Object stackIn_45_0 = null;
            byte[] stackIn_51_0 = null;
            byte[] stackIn_52_0 = null;
            Object stackIn_54_0 = null;
            Object stackOut_16_0 = null;
            Object stackOut_17_0 = null;
            Object stackOut_22_0 = null;
            Object stackOut_23_0 = null;
            Object stackOut_43_0 = null;
            Object stackOut_44_0 = null;
            byte[] stackOut_50_0 = null;
            byte[] stackOut_51_0 = null;
            Object stackOut_53_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var18 = Transmogrify.field_A ? 1 : 0;
                        var3 = (Object) (Object) ((ak) this).field_e;
                        // monitorenter ((ak) this).field_e
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((ak) this).field_d.b((byte) 36) >= (long)(6 + param1 * 6)) {
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
                            ((ak) this).field_d.a((long)(param1 * 6), (byte) -127);
                            ((ak) this).field_d.a(0, 6, sf.field_kb, (byte) 0);
                            if (param0 < -35) {
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
                            ((ak) this).field_b = 73;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var4_int = (sf.field_kb[2] & 255) + (16711680 & sf.field_kb[0] << -1068895248) + (sf.field_kb[1] << -225434456 & 65280);
                            var5 = (255 & sf.field_kb[5]) + (sf.field_kb[4] << 1418223976 & 65280) + (sf.field_kb[3] << 345083760 & 16711680);
                            if ((var4_int ^ -1) <= -1) {
                                statePc = 9;
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
                    case 9: {
                        try {
                            if (var4_int <= ((ak) this).field_f) {
                                statePc = 13;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = (stateCaught_9 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (-1 > (var5 ^ -1)) {
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
                            if ((((ak) this).field_e.b((byte) 36) / 520L ^ -1L) <= ((long)var5 ^ -1L)) {
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
                            stackOut_16_0 = null;
                            stackIn_17_0 = stackOut_16_0;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            // monitorexit var3
                            stackOut_17_0 = stackIn_17_0;
                            stackIn_18_0 = stackOut_17_0;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 55;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        return (byte[]) (Object) stackIn_18_0;
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
                            if (0 != var5) {
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
                            ((ak) this).field_e.a((long)(var5 * 520), (byte) -126);
                            var9 = var4_int - var7;
                            if (param1 > 65535) {
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
                            if (-513 <= (var9 ^ -1)) {
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
                            var9 = 512;
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
                            var14 = 8;
                            ((ak) this).field_e.a(0, var9 + var14, sf.field_kb, (byte) 0);
                            var13 = 255 & sf.field_kb[7];
                            var11 = (255 & sf.field_kb[3]) + (sf.field_kb[2] << 1257525064 & 65280);
                            var12 = ((sf.field_kb[4] & 255) << 1837076240) - (-(65280 & sf.field_kb[5] << -275514296) + -(sf.field_kb[6] & 255));
                            var10 = (255 & sf.field_kb[1]) + ((255 & sf.field_kb[0]) << 272948040);
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var14 = 10;
                            if (-511 <= (var9 ^ -1)) {
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
                            var9 = 510;
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            ((ak) this).field_e.a(0, var9 - -var14, sf.field_kb, (byte) 0);
                            var13 = 255 & sf.field_kb[9];
                            var12 = (255 & sf.field_kb[8]) + (((sf.field_kb[6] & 255) << 1774064208) + (sf.field_kb[7] << 721928008 & 65280));
                            var10 = ((sf.field_kb[1] & 255) << 1275276336) + ((sf.field_kb[0] & 255) << 1375517880) + ((sf.field_kb[2] << 1340318440 & 65280) + (255 & sf.field_kb[3]));
                            var11 = (65280 & sf.field_kb[4] << 1760797032) - -(sf.field_kb[5] & 255);
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
                            if (var10 == param1) {
                                statePc = 34;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (var11 == var8) {
                                statePc = 36;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            if (((ak) this).field_b == var13) {
                                statePc = 40;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (var12 >= 0) {
                                statePc = 42;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if ((long)var12 <= ((ak) this).field_e.b((byte) 36) / 520L) {
                                statePc = 46;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            stackOut_43_0 = null;
                            stackIn_44_0 = stackOut_43_0;
                            statePc = 44;
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
                            stackOut_44_0 = stackIn_44_0;
                            stackIn_45_0 = stackOut_44_0;
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 55;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        return (byte[]) (Object) stackIn_45_0;
                    }
                    case 46: {
                        try {
                            var15 = var14 - -var9;
                            var16 = var14;
                            statePc = 47;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            if (var15 <= var16) {
                                statePc = 49;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            var7++;
                            var6[var7] = sf.field_kb[var16];
                            var16++;
                            statePc = 47;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            var5 = var12;
                            var8++;
                            statePc = 20;
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

    final boolean a(boolean param0, int param1, byte[] param2, int param3) {
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
                    var5 = (Object) (Object) ((ak) this).field_e;
                    // monitorenter ((ak) this).field_e
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (-1 < (param3 ^ -1)) {
                            statePc = 4;
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
                        if (((ak) this).field_f < param3) {
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
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw new IllegalArgumentException();
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var6 = this.a(param2, param3, true, param0, param1) ? 1 : 0;
                        if (var6 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var6 = this.a(param2, param3, false, true, param1) ? 1 : 0;
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

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    private final boolean a(byte[] param0, int param1, boolean param2, boolean param3, int param4) {
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
            Object var17 = null;
            int stackIn_5_0 = 0;
            int stackIn_6_0 = 0;
            int stackIn_11_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_35_0 = 0;
            int stackIn_36_0 = 0;
            int stackIn_41_0 = 0;
            int stackIn_42_0 = 0;
            int stackIn_64_0 = 0;
            int stackIn_65_0 = 0;
            int stackIn_67_0 = 0;
            int stackOut_4_0 = 0;
            int stackOut_5_0 = 0;
            int stackOut_10_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_34_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_63_0 = 0;
            int stackOut_64_0 = 0;
            int stackOut_66_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = Transmogrify.field_A ? 1 : 0;
                        var6 = (Object) (Object) ((ak) this).field_e;
                        // monitorenter ((ak) this).field_e
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (!param2) {
                                statePc = 13;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (((ak) this).field_d.b((byte) 36) < (long)(6 + 6 * param4)) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = (stateCaught_3 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            stackOut_4_0 = 0;
                            stackIn_5_0 = stackOut_4_0;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = (stateCaught_4 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            // monitorexit var6
                            stackOut_5_0 = stackIn_5_0;
                            stackIn_6_0 = stackOut_5_0;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 68;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        return stackIn_6_0 != 0;
                    }
                    case 7: {
                        try {
                            ((ak) this).field_d.a((long)(6 * param4), (byte) -122);
                            ((ak) this).field_d.a(0, 6, sf.field_kb, (byte) 0);
                            var7_int = (sf.field_kb[5] & 255) + ((sf.field_kb[4] & 255) << 324700936) + (sf.field_kb[3] << -389026672 & 16711680);
                            if ((var7_int ^ -1) >= -1) {
                                statePc = 10;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if ((((ak) this).field_e.b((byte) 36) / 520L ^ -1L) > ((long)var7_int ^ -1L)) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = (stateCaught_9 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            stackOut_10_0 = 0;
                            stackIn_11_0 = stackOut_10_0;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            // monitorexit var6
                            stackOut_11_0 = stackIn_11_0;
                            stackIn_12_0 = stackOut_11_0;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 68;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        return stackIn_12_0 != 0;
                    }
                    case 13: {
                        try {
                            var7_int = (int)((519L + ((ak) this).field_e.b((byte) 36)) / 520L);
                            if (var7_int != 0) {
                                statePc = 15;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof IOException ? 66 : 68);
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
                            statePc = (stateCaught_14 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            sf.field_kb[4] = (byte)(var7_int >> -1238837592);
                            sf.field_kb[0] = (byte)(param1 >> -1888258480);
                            sf.field_kb[5] = (byte)var7_int;
                            sf.field_kb[1] = (byte)(param1 >> -897100792);
                            sf.field_kb[3] = (byte)(var7_int >> 14965840);
                            sf.field_kb[2] = (byte)param1;
                            ((ak) this).field_d.a((long)(param4 * 6), (byte) -122);
                            if (param3) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            var17 = null;
                            boolean discarded$1 = this.a((byte[]) null, -23, true, false, 106);
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            ((ak) this).field_d.a(sf.field_kb, 6, (byte) 110, 0);
                            var8 = 0;
                            var9 = 0;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (var8 >= param1) {
                                statePc = 63;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var10 = 0;
                            if (param2) {
                                statePc = 21;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            ((ak) this).field_e.a((long)(var7_int * 520), (byte) -122);
                            if (-65536 > (param4 ^ -1)) {
                                statePc = 26;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            ((ak) this).field_e.a(0, 8, sf.field_kb, (byte) 0);
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof EOFException ? 24 : (stateCaught_22 instanceof IOException ? 66 : 68));
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var14 = (EOFException) (Object) caughtException;
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var11 = (255 & sf.field_kb[1]) + (65280 & sf.field_kb[0] << 1931663432);
                            var13 = 255 & sf.field_kb[7];
                            var12 = (sf.field_kb[3] & 255) + (65280 & sf.field_kb[2] << 594668200);
                            var10 = (sf.field_kb[6] & 255) + ((sf.field_kb[4] & 255) << 1503855760) + ((sf.field_kb[5] & 255) << -1546088728);
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            ((ak) this).field_e.a(0, 10, sf.field_kb, (byte) 0);
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof EOFException ? 28 : (stateCaught_26 instanceof IOException ? 66 : 68));
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var14 = (EOFException) (Object) caughtException;
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var12 = ((sf.field_kb[4] & 255) << 1812029448) - -(sf.field_kb[5] & 255);
                            var11 = ((sf.field_kb[2] & 255) << -527709592) + (((255 & sf.field_kb[1]) << -1627688016) + (((sf.field_kb[0] & 255) << -1963228200) - -(255 & sf.field_kb[3])));
                            var13 = sf.field_kb[9] & 255;
                            var10 = ((255 & sf.field_kb[6]) << 2097021136) + ((sf.field_kb[7] & 255) << 2049683784) + (255 & sf.field_kb[8]);
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (var11 != param4) {
                                statePc = 34;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (var12 != var9) {
                                statePc = 34;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (var13 != ((ak) this).field_b) {
                                statePc = 34;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof IOException ? 66 : 68);
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
                            statePc = (stateCaught_34 instanceof IOException ? 66 : 68);
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
                            statePc = 68;
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
                            statePc = (stateCaught_37 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if ((((ak) this).field_e.b((byte) 36) / 520L ^ -1L) > ((long)var10 ^ -1L)) {
                                statePc = 40;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof IOException ? 66 : 68);
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
                            statePc = (stateCaught_40 instanceof IOException ? 66 : 68);
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
                            statePc = 68;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        return stackIn_42_0 != 0;
                    }
                    case 43: {
                        try {
                            if (var10 == 0) {
                                statePc = 45;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            var10 = (int)((((ak) this).field_e.b((byte) 36) - -519L) / 520L);
                            param2 = false;
                            if (var10 == 0) {
                                statePc = 47;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof IOException ? 66 : 68);
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
                            statePc = (stateCaught_47 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if (var10 == var7_int) {
                                statePc = 50;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            var10++;
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            if (512 >= param1 + -var8) {
                                statePc = 53;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            var10 = 0;
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            if (param4 <= 65535) {
                                statePc = 58;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            sf.field_kb[0] = (byte)(param4 >> -30746792);
                            sf.field_kb[7] = (byte)(var10 >> 490251560);
                            sf.field_kb[5] = (byte)var9;
                            sf.field_kb[6] = (byte)(var10 >> 1689275120);
                            sf.field_kb[8] = (byte)var10;
                            sf.field_kb[1] = (byte)(param4 >> -2042769552);
                            sf.field_kb[3] = (byte)param4;
                            sf.field_kb[9] = (byte)((ak) this).field_b;
                            sf.field_kb[2] = (byte)(param4 >> 1903809736);
                            sf.field_kb[4] = (byte)(var9 >> -1827149080);
                            ((ak) this).field_e.a((long)(520 * var7_int), (byte) -128);
                            ((ak) this).field_e.a(sf.field_kb, 10, (byte) 90, 0);
                            var11 = -var8 + param1;
                            if (510 >= var11) {
                                statePc = 57;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            var11 = 510;
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            ((ak) this).field_e.a(param0, var11, (byte) 118, var8);
                            var8 = var8 + var11;
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            sf.field_kb[5] = (byte)(var10 >> 1491280936);
                            sf.field_kb[4] = (byte)(var10 >> -890668656);
                            sf.field_kb[7] = (byte)((ak) this).field_b;
                            sf.field_kb[1] = (byte)param4;
                            sf.field_kb[2] = (byte)(var9 >> -1970786616);
                            sf.field_kb[3] = (byte)var9;
                            sf.field_kb[6] = (byte)var10;
                            sf.field_kb[0] = (byte)(param4 >> 1554521288);
                            ((ak) this).field_e.a((long)(520 * var7_int), (byte) -120);
                            ((ak) this).field_e.a(sf.field_kb, 8, (byte) 76, 0);
                            var11 = -var8 + param1;
                            if (var11 > 512) {
                                statePc = 60;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            var11 = 512;
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            ((ak) this).field_e.a(param0, var11, (byte) 116, var8);
                            var8 = var8 + var11;
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = (stateCaught_61 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            var7_int = var10;
                            var9++;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = (stateCaught_62 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            stackOut_63_0 = 1;
                            stackIn_64_0 = stackOut_63_0;
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = (stateCaught_63 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            // monitorexit var6
                            stackOut_64_0 = stackIn_64_0;
                            stackIn_65_0 = stackOut_64_0;
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 68;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        return stackIn_65_0 != 0;
                    }
                    case 66: {
                        try {
                            var7 = (IOException) (Object) caughtException;
                            // monitorexit var6
                            stackOut_66_0 = 0;
                            stackIn_67_0 = stackOut_66_0;
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 68;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        return stackIn_67_0 != 0;
                    }
                    case 68: {
                        try {
                            var15 = caughtException;
                            // monitorexit var6
                            statePc = 69;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 68;
                            continue stateLoop;
                        }
                    }
                    case 69: {
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

    final static hh a(byte[] param0, int param1) {
        hh var2 = null;
        Object var3 = null;
        if (param0 == null) {
          return null;
        } else {
          L0: {
            if (param1 == 21725) {
              break L0;
            } else {
              var3 = null;
              hh discarded$2 = ak.a((byte[]) null, 124);
              break L0;
            }
          }
          var2 = new hh(param0, gj.field_j, re.field_a, ql.field_b, wk.field_b, rg.field_D, re.field_K);
          wd.d(120);
          return var2;
        }
    }

    ak(int param0, we param1, we param2, int param3) {
        ((ak) this).field_e = null;
        ((ak) this).field_f = 65000;
        ((ak) this).field_d = null;
        ((ak) this).field_e = param1;
        ((ak) this).field_f = param3;
        ((ak) this).field_d = param2;
        ((ak) this).field_b = param0;
    }

    public final String toString() {
        return "" + ((ak) this).field_b;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Resume Tutorial";
        field_a = 500;
    }
}
