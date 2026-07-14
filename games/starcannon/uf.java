/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class uf {
    private int field_c;
    static boolean field_d;
    private td field_b;
    private td field_e;
    private int field_a;

    private final boolean a(byte param0, int param1, int param2, byte[] param3, boolean param4) {
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
            int stackIn_32_0 = 0;
            int stackIn_33_0 = 0;
            int stackIn_38_0 = 0;
            int stackIn_39_0 = 0;
            int stackIn_60_0 = 0;
            int stackIn_61_0 = 0;
            int stackIn_65_0 = 0;
            int stackOut_3_0 = 0;
            int stackOut_4_0 = 0;
            int stackOut_9_0 = 0;
            int stackOut_10_0 = 0;
            int stackOut_31_0 = 0;
            int stackOut_32_0 = 0;
            int stackOut_37_0 = 0;
            int stackOut_38_0 = 0;
            int stackOut_59_0 = 0;
            int stackOut_60_0 = 0;
            int stackOut_64_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = StarCannon.field_A;
                        var6 = (Object) (Object) ((uf) this).field_b;
                        // monitorenter ((uf) this).field_b
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
                            statePc = (stateCaught_1 instanceof IOException ? 62 : 66);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if ((long)(6 + param2 * 6) <= ((uf) this).field_e.b(false)) {
                                statePc = 6;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof IOException ? 62 : 66);
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
                            statePc = (stateCaught_3 instanceof IOException ? 62 : 66);
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
                            statePc = 66;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        return stackIn_5_0 != 0;
                    }
                    case 6: {
                        try {
                            ((uf) this).field_e.a((long)(param2 * 6), 0);
                            ((uf) this).field_e.a(param0 ^ 38, cb.field_b, 0, 6);
                            var7_int = (255 & cb.field_b[5]) + (cb.field_b[3] << -194621456 & 16711680) - -(cb.field_b[4] << -1999248472 & 65280);
                            if (var7_int <= 0) {
                                statePc = 9;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof IOException ? 62 : 66);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (((long)var7_int ^ -1L) >= (((uf) this).field_b.b(false) / 520L ^ -1L)) {
                                statePc = 14;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof IOException ? 62 : 66);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof IOException ? 62 : 66);
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
                            statePc = (stateCaught_9 instanceof IOException ? 62 : 66);
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
                            statePc = 66;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        return stackIn_11_0 != 0;
                    }
                    case 12: {
                        try {
                            var7_int = (int)((((uf) this).field_b.b(false) - -519L) / 520L);
                            if (0 != var7_int) {
                                statePc = 14;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof IOException ? 62 : 66);
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
                            statePc = (stateCaught_13 instanceof IOException ? 62 : 66);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            cb.field_b[1] = (byte)(param1 >> 1368248360);
                            cb.field_b[5] = (byte)var7_int;
                            cb.field_b[4] = (byte)(var7_int >> -24142360);
                            cb.field_b[2] = (byte)param1;
                            cb.field_b[0] = (byte)(param1 >> -2142331952);
                            cb.field_b[3] = (byte)(var7_int >> 2137757488);
                            ((uf) this).field_e.a((long)(6 * param2), 0);
                            ((uf) this).field_e.a(0, 6, false, cb.field_b);
                            var8 = 0;
                            var9 = 0;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof IOException ? 62 : 66);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (var8 >= param1) {
                                statePc = 59;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 62 : 66);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            var10 = 0;
                            if (!param4) {
                                statePc = 40;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 62 : 66);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            ((uf) this).field_b.a((long)(520 * var7_int), 0);
                            if (param2 > 65535) {
                                statePc = 23;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof IOException ? 62 : 66);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof IOException ? 62 : 66);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            ((uf) this).field_b.a(0, cb.field_b, 0, 8);
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof EOFException ? 21 : (stateCaught_19 instanceof IOException ? 62 : 66));
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 62 : 66);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var14 = (EOFException) (Object) caughtException;
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 62 : 66);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var12 = (cb.field_b[3] & 255) + (cb.field_b[2] << 1780360072 & 65280);
                            var10 = ((255 & cb.field_b[5]) << -1863565816) + (((255 & cb.field_b[4]) << 1495336176) - -(cb.field_b[6] & 255));
                            var13 = 255 & cb.field_b[7];
                            var11 = (255 & cb.field_b[1]) + ((cb.field_b[0] & 255) << -1089887384);
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 62 : 66);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            ((uf) this).field_b.a(param0 + -38, cb.field_b, 0, 10);
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof EOFException ? 25 : (stateCaught_23 instanceof IOException ? 62 : 66));
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 62 : 66);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var14 = (EOFException) (Object) caughtException;
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 62 : 66);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var11 = (255 & cb.field_b[3]) + ((cb.field_b[2] & 255) << 947838120) + (((255 & cb.field_b[0]) << 855849016) + (cb.field_b[1] << -632873648 & 16711680));
                            var13 = cb.field_b[9] & 255;
                            var12 = (255 & cb.field_b[5]) + (65280 & cb.field_b[4] << -1872599992);
                            var10 = (cb.field_b[8] & 255) + (cb.field_b[6] << -794264912 & 16711680) + (cb.field_b[7] << -1895936664 & 65280);
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 62 : 66);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (var11 != param2) {
                                statePc = 31;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 62 : 66);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (var12 != var9) {
                                statePc = 31;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof IOException ? 62 : 66);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (var13 != ((uf) this).field_c) {
                                statePc = 31;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof IOException ? 62 : 66);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof IOException ? 62 : 66);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            stackOut_31_0 = 0;
                            stackIn_32_0 = stackOut_31_0;
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 62 : 66);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            // monitorexit var6
                            stackOut_32_0 = stackIn_32_0;
                            stackIn_33_0 = stackOut_32_0;
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 66;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        return stackIn_33_0 != 0;
                    }
                    case 34: {
                        try {
                            if (0 > var10) {
                                statePc = 37;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof IOException ? 62 : 66);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if ((((uf) this).field_b.b(false) / 520L ^ -1L) > ((long)var10 ^ -1L)) {
                                statePc = 37;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof IOException ? 62 : 66);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof IOException ? 62 : 66);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            stackOut_37_0 = 0;
                            stackIn_38_0 = stackOut_37_0;
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof IOException ? 62 : 66);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            // monitorexit var6
                            stackOut_38_0 = stackIn_38_0;
                            stackIn_39_0 = stackOut_38_0;
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 66;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        return stackIn_39_0 != 0;
                    }
                    case 40: {
                        try {
                            if (-1 == (var10 ^ -1)) {
                                statePc = 42;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof IOException ? 62 : 66);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            statePc = 47;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof IOException ? 62 : 66);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            param4 = false;
                            var10 = (int)((((uf) this).field_b.b(false) - -519L) / 520L);
                            if (var10 == 0) {
                                statePc = 44;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof IOException ? 62 : 66);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof IOException ? 62 : 66);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            var10++;
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof IOException ? 62 : 66);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            if (var7_int != var10) {
                                statePc = 47;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof IOException ? 62 : 66);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            var10++;
                            statePc = 47;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof IOException ? 62 : 66);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            if (param1 - var8 <= 512) {
                                statePc = 49;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof IOException ? 62 : 66);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof IOException ? 62 : 66);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            var10 = 0;
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof IOException ? 62 : 66);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            if (-65536 > (param2 ^ -1)) {
                                statePc = 55;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof IOException ? 62 : 66);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            cb.field_b[3] = (byte)var9;
                            cb.field_b[6] = (byte)var10;
                            cb.field_b[5] = (byte)(var10 >> -60818744);
                            cb.field_b[1] = (byte)param2;
                            cb.field_b[4] = (byte)(var10 >> -164114416);
                            cb.field_b[7] = (byte)((uf) this).field_c;
                            cb.field_b[2] = (byte)(var9 >> 749275400);
                            cb.field_b[0] = (byte)(param2 >> -1916717752);
                            ((uf) this).field_b.a((long)(var7_int * 520), 0);
                            ((uf) this).field_b.a(0, 8, false, cb.field_b);
                            var11 = param1 + -var8;
                            if (var11 > 512) {
                                statePc = 53;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof IOException ? 62 : 66);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof IOException ? 62 : 66);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            var11 = 512;
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof IOException ? 62 : 66);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            ((uf) this).field_b.a(var8, var11, false, param3);
                            var8 = var8 + var11;
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof IOException ? 62 : 66);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            cb.field_b[3] = (byte)param2;
                            cb.field_b[2] = (byte)(param2 >> -140418520);
                            cb.field_b[0] = (byte)(param2 >> -1509700264);
                            cb.field_b[7] = (byte)(var10 >> -271378456);
                            cb.field_b[6] = (byte)(var10 >> -1135023728);
                            cb.field_b[4] = (byte)(var9 >> 797976392);
                            cb.field_b[1] = (byte)(param2 >> 1050040528);
                            cb.field_b[5] = (byte)var9;
                            cb.field_b[8] = (byte)var10;
                            cb.field_b[9] = (byte)((uf) this).field_c;
                            ((uf) this).field_b.a((long)(var7_int * 520), 0);
                            ((uf) this).field_b.a(0, 10, false, cb.field_b);
                            var11 = -var8 + param1;
                            if (-511 <= (var11 ^ -1)) {
                                statePc = 57;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof IOException ? 62 : 66);
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
                            statePc = (stateCaught_56 instanceof IOException ? 62 : 66);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            ((uf) this).field_b.a(var8, var11, false, param3);
                            var8 = var8 + var11;
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof IOException ? 62 : 66);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            var9++;
                            var7_int = var10;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof IOException ? 62 : 66);
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
                            statePc = (stateCaught_59 instanceof IOException ? 62 : 66);
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
                            statePc = 66;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        return stackIn_61_0 != 0;
                    }
                    case 62: {
                        try {
                            var7 = (IOException) (Object) caughtException;
                            if (param0 == 38) {
                                statePc = 64;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 66;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            ((uf) this).field_b = null;
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 66;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            // monitorexit var6
                            stackOut_64_0 = 0;
                            stackIn_65_0 = stackOut_64_0;
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 66;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        return stackIn_65_0 != 0;
                    }
                    case 66: {
                        try {
                            var15 = caughtException;
                            // monitorexit var6
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 66;
                            continue stateLoop;
                        }
                    }
                    case 67: {
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

    public final String toString() {
        return "" + ((uf) this).field_c;
    }

    final static qb a(String param0, int param1) {
        int var2 = 11 / ((-49 - param1) / 55);
        return new qb(param0);
    }

    final byte[] a(int param0, byte param1) {
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
            Object stackIn_11_0 = null;
            Object stackIn_12_0 = null;
            Object stackIn_39_0 = null;
            Object stackIn_40_0 = null;
            Object stackIn_45_0 = null;
            Object stackIn_46_0 = null;
            byte[] stackIn_52_0 = null;
            byte[] stackIn_53_0 = null;
            Object stackIn_55_0 = null;
            Object stackOut_2_0 = null;
            Object stackOut_3_0 = null;
            Object stackOut_10_0 = null;
            Object stackOut_11_0 = null;
            Object stackOut_38_0 = null;
            Object stackOut_39_0 = null;
            Object stackOut_44_0 = null;
            Object stackOut_45_0 = null;
            byte[] stackOut_51_0 = null;
            byte[] stackOut_52_0 = null;
            Object stackOut_54_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var18 = StarCannon.field_A;
                        var3 = (Object) (Object) ((uf) this).field_b;
                        // monitorenter ((uf) this).field_b
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((uf) this).field_e.b(false) >= (long)(6 + 6 * param0)) {
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
                            ((uf) this).field_e.a((long)(6 * param0), 0);
                            ((uf) this).field_e.a(0, cb.field_b, 0, 6);
                            if (param1 == 114) {
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
                            byte[] discarded$1 = ((uf) this).a(24, (byte) 53);
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var4_int = (255 & cb.field_b[2]) + ((cb.field_b[1] << 1487825064 & 65280) + (16711680 & cb.field_b[0] << -1881024080));
                            var5 = (65280 & cb.field_b[4] << -1570427000) + ((16711680 & cb.field_b[3] << -308215440) + (cb.field_b[5] & 255));
                            if (var4_int >= 0) {
                                statePc = 9;
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
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (((uf) this).field_a >= var4_int) {
                                statePc = 13;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = (stateCaught_9 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            stackOut_10_0 = null;
                            stackIn_11_0 = stackOut_10_0;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            // monitorexit var3
                            stackOut_11_0 = stackIn_11_0;
                            stackIn_12_0 = stackOut_11_0;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 56;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        return (byte[]) (Object) stackIn_12_0;
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
                            statePc = (stateCaught_13 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (((uf) this).field_b.b(false) / 520L >= (long)var5) {
                                statePc = 19;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 54 : 56);
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
                            statePc = (stateCaught_19 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (var4_int <= var7) {
                                statePc = 51;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (-1 != (var5 ^ -1)) {
                                statePc = 25;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            ((uf) this).field_b.a((long)(var5 * 520), 0);
                            var9 = -var7 + var4_int;
                            if ((param0 ^ -1) >= -65536) {
                                statePc = 30;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var14 = 10;
                            if (var9 > 510) {
                                statePc = 28;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var9 = 510;
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
                            ((uf) this).field_b.a(0, cb.field_b, 0, var14 + var9);
                            var11 = (65280 & cb.field_b[4] << 160375528) + (cb.field_b[5] & 255);
                            var12 = (255 & cb.field_b[8]) + (((cb.field_b[6] & 255) << 1428089008) - -(65280 & cb.field_b[7] << -747327192));
                            var10 = (255 & cb.field_b[3]) + (16711680 & cb.field_b[1] << 1617076784) + (-16777216 & cb.field_b[0] << -2094568200) - -(cb.field_b[2] << 1076949800 & 65280);
                            var13 = cb.field_b[9] & 255;
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var14 = 8;
                            if (var9 <= 512) {
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
                            var9 = 512;
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            ((uf) this).field_b.a(0, cb.field_b, 0, var14 + var9);
                            var12 = (cb.field_b[6] & 255) + (65280 & cb.field_b[5] << 1039872904) + (cb.field_b[4] << 1692627504 & 16711680);
                            var10 = (cb.field_b[0] << -871191288 & 65280) - -(255 & cb.field_b[1]);
                            var11 = (cb.field_b[2] << 189985672 & 65280) + (cb.field_b[3] & 255);
                            var13 = 255 & cb.field_b[7];
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (var10 == param0) {
                                statePc = 35;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof IOException ? 54 : 56);
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
                            statePc = (stateCaught_35 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (var13 == ((uf) this).field_c) {
                                statePc = 41;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            stackOut_38_0 = null;
                            stackIn_39_0 = stackOut_38_0;
                            statePc = 39;
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
                            stackOut_39_0 = stackIn_39_0;
                            stackIn_40_0 = stackOut_39_0;
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 56;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        return (byte[]) (Object) stackIn_40_0;
                    }
                    case 41: {
                        try {
                            if (var12 >= 0) {
                                statePc = 43;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            if (((uf) this).field_b.b(false) / 520L >= (long)var12) {
                                statePc = 47;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof IOException ? 54 : 56);
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
                            statePc = (stateCaught_44 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            // monitorexit var3
                            stackOut_45_0 = stackIn_45_0;
                            stackIn_46_0 = stackOut_45_0;
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 56;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        return (byte[]) (Object) stackIn_46_0;
                    }
                    case 47: {
                        try {
                            var15 = var14 + var9;
                            var16 = var14;
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if (var15 <= var16) {
                                statePc = 50;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            var7++;
                            var6[var7] = cb.field_b[var16];
                            var16++;
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            var8++;
                            var5 = var12;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
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

    final boolean a(int param0, int param1, byte[] param2, int param3) {
        Object var5 = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = (Object) (Object) ((uf) this).field_b;
                    // monitorenter ((uf) this).field_b
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 < (param1 ^ -1)) {
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
                        if (((uf) this).field_a >= param1) {
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
                        var6 = this.a((byte) 38, param1, param3, param2, true) ? 1 : 0;
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
                        var6 = this.a((byte) 38, param1, param3, param2, false) ? 1 : 0;
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
                        var7 = caughtException;
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
                    throw (RuntimeException) (Object) var7;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static String a(Throwable param0, int param1) throws IOException {
        String var2 = null;
        PrintWriter var4 = null;
        String var5 = null;
        BufferedReader var6 = null;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        ii var13 = null;
        StringWriter var14 = null;
        String var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        L0: {
          if (param0 instanceof ii) {
            var13 = (ii) (Object) param0;
            param0 = var13.field_a;
            var2 = var13.field_b + " | ";
            var11 = var2;
            break L0;
          } else {
            var2 = "";
            break L0;
          }
        }
        L1: {
          var14 = new StringWriter();
          var4 = new PrintWriter((Writer) (Object) var14);
          if (param1 == -17490) {
            break L1;
          } else {
            field_d = false;
            break L1;
          }
        }
        param0.printStackTrace(var4);
        var4.close();
        var5 = var14.toString();
        var2 = var5;
        var11 = var5;
        var6 = new BufferedReader((Reader) (Object) new StringReader(var5));
        var7 = var6.readLine();
        var2 = var7;
        var11 = var7;
        L2: while (true) {
          var8 = var6.readLine();
          var2 = var8;
          var11 = var8;
          var2 = var11;
          if (var8 != null) {
            L3: {
              var9 = var8.indexOf('(');
              var10 = var8.indexOf(')', 1 + var9);
              if (-1 == var9) {
                var11 = var8;
                var2 = var11;
                var2 = var11;
                break L3;
              } else {
                var11 = var8.substring(0, var9);
                break L3;
              }
            }
            L4: {
              var15 = var11.trim();
              var2 = var15;
              var2 = var15;
              var16 = var15.substring(var15.lastIndexOf(' ') - -1);
              var2 = var16;
              var2 = var16;
              var17 = var16.substring(var16.lastIndexOf('\t') + 1);
              var2 = var17;
              var2 = var17;
              var18 = var2 + var17;
              var2 = var18;
              var2 = var18;
              if (var9 == -1) {
                break L4;
              } else {
                if (-1 == var10) {
                  break L4;
                } else {
                  var12 = var8.indexOf(".java:", var9);
                  if (-1 >= (var12 ^ -1)) {
                    var2 = var18 + var8.substring(var12 - -5, var10);
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
            }
            var2 = var2 + 32;
            continue L2;
          } else {
            var2 = var11;
            var11 = var2;
            var2 = var11;
            var2 = var2 + "| " + var7;
            return var2;
          }
        }
    }

    uf(int param0, td param1, td param2, int param3) {
        ((uf) this).field_b = null;
        ((uf) this).field_e = null;
        ((uf) this).field_a = 65000;
        ((uf) this).field_b = param1;
        ((uf) this).field_c = param0;
        ((uf) this).field_a = param3;
        ((uf) this).field_e = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = false;
    }
}
