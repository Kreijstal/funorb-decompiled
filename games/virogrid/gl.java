/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gl {
    static String field_i;
    private nh field_j;
    private int field_k;
    private int field_e;
    private nh field_d;
    static String[] field_g;
    static int field_f;
    static int[] field_c;
    static int[] field_b;
    static String field_a;
    static String field_h;

    public static void a(int param0) {
        field_a = null;
        field_h = null;
        field_g = null;
        field_b = null;
        if (param0 != 3) {
            field_b = null;
        }
        field_i = null;
        field_c = null;
    }

    final static int a(int param0, boolean param1, String param2) {
        if (param0 != 1492912648) {
            gl.a(123);
        }
        if (param1) {
            return ti.field_g.a(param2);
        }
        return j.field_h.a(param2);
    }

    private final boolean a(byte[] param0, int param1, int param2, int param3, boolean param4) {
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
            int stackIn_7_0 = 0;
            int stackIn_8_0 = 0;
            int stackIn_13_0 = 0;
            int stackIn_14_0 = 0;
            int stackIn_33_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_39_0 = 0;
            int stackIn_40_0 = 0;
            int stackIn_60_0 = 0;
            int stackIn_61_0 = 0;
            int stackIn_63_0 = 0;
            int stackOut_6_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_12_0 = 0;
            int stackOut_13_0 = 0;
            int stackOut_32_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_38_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_59_0 = 0;
            int stackOut_60_0 = 0;
            int stackOut_62_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var17 = Virogrid.field_F ? 1 : 0;
                        var6 = (Object) (Object) ((gl) this).field_d;
                        // monitorenter ((gl) this).field_d
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (param4) {
                                statePc = 4;
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
                            var7_int = (int)((519L + ((gl) this).field_d.a((byte) 127)) / 520L);
                            if (-1 != (var7_int ^ -1)) {
                                statePc = 15;
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
                            var7_int = 1;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = (stateCaught_3 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if ((((gl) this).field_j.a((byte) 125) ^ -1L) > ((long)(param3 * 6 - -6) ^ -1L)) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = (stateCaught_4 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            stackOut_6_0 = 0;
                            stackIn_7_0 = stackOut_6_0;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            // monitorexit var6
                            stackOut_7_0 = stackIn_7_0;
                            stackIn_8_0 = stackOut_7_0;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        return stackIn_8_0 != 0;
                    }
                    case 9: {
                        try {
                            ((gl) this).field_j.a((long)(param3 * 6), 0);
                            ((gl) this).field_j.a(0, 6, an.field_c, (byte) 123);
                            var7_int = (an.field_c[4] << 2026607400 & 65280) + ((255 & an.field_c[3]) << -2131929712) - -(255 & an.field_c[5]);
                            if ((var7_int ^ -1) >= -1) {
                                statePc = 12;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = (stateCaught_9 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if ((long)var7_int > ((gl) this).field_d.a((byte) 126) / 520L) {
                                statePc = 12;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = 0;
                            stackIn_13_0 = stackOut_12_0;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            // monitorexit var6
                            stackOut_13_0 = stackIn_13_0;
                            stackIn_14_0 = stackOut_13_0;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        return stackIn_14_0 != 0;
                    }
                    case 15: {
                        try {
                            an.field_c[4] = (byte)(var7_int >> -1094431032);
                            an.field_c[0] = (byte)(param1 >> -571949456);
                            an.field_c[1] = (byte)(param1 >> 1358873992);
                            an.field_c[3] = (byte)(var7_int >> 2136131248);
                            an.field_c[2] = (byte)param1;
                            var8 = -52 % ((54 - param2) / 61);
                            an.field_c[5] = (byte)var7_int;
                            ((gl) this).field_j.a((long)(6 * param3), 0);
                            ((gl) this).field_j.a(0, an.field_c, 6, 0);
                            var9 = 0;
                            var10 = 0;
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
                            if (var9 >= param1) {
                                statePc = 59;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var11 = 0;
                            if (param4) {
                                statePc = 19;
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
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            ((gl) this).field_d.a((long)(520 * var7_int), 0);
                            if (65535 >= param3) {
                                statePc = 24;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            ((gl) this).field_d.a(0, 10, an.field_c, (byte) 127);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof EOFException ? 22 : (stateCaught_20 instanceof IOException ? 62 : 64));
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var15 = (EOFException) (Object) caughtException;
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var13 = (255 & an.field_c[5]) + ((an.field_c[4] & 255) << -1831233144);
                            var11 = (an.field_c[6] << -2017896624 & 16711680) - -(an.field_c[7] << 1318332520 & 65280) + (an.field_c[8] & 255);
                            var12 = (255 & an.field_c[3]) + (((255 & an.field_c[2]) << -1363303768) + (an.field_c[0] << -1848871368 & -16777216)) + ((an.field_c[1] & 255) << 191996208);
                            var14 = 255 & an.field_c[9];
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            ((gl) this).field_d.a(0, 8, an.field_c, (byte) 127);
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof EOFException ? 26 : (stateCaught_24 instanceof IOException ? 62 : 64));
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var15 = (EOFException) (Object) caughtException;
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var11 = (65280 & an.field_c[5] << -1457314584) + (((an.field_c[4] & 255) << -725085008) + (an.field_c[6] & 255));
                            var12 = (255 & an.field_c[1]) + (an.field_c[0] << -969996376 & 65280);
                            var14 = an.field_c[7] & 255;
                            var13 = ((255 & an.field_c[2]) << -333358520) + (an.field_c[3] & 255);
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (param3 != var12) {
                                statePc = 32;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (var10 != var13) {
                                statePc = 32;
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
                            if (var14 != ((gl) this).field_e) {
                                statePc = 32;
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
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 62 : 64);
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
                            statePc = (stateCaught_32 instanceof IOException ? 62 : 64);
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
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        return stackIn_34_0 != 0;
                    }
                    case 35: {
                        try {
                            if ((var11 ^ -1) > -1) {
                                statePc = 38;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            if ((long)var11 <= ((gl) this).field_d.a((byte) 125) / 520L) {
                                statePc = 41;
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
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof IOException ? 62 : 64);
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
                            statePc = (stateCaught_38 instanceof IOException ? 62 : 64);
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
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        return stackIn_40_0 != 0;
                    }
                    case 41: {
                        try {
                            if (var11 != 0) {
                                statePc = 48;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            var11 = (int)((((gl) this).field_d.a((byte) 127) - -519L) / 520L);
                            param4 = false;
                            if (var11 == -1) {
                                statePc = 44;
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
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            var11++;
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            if (var7_int == var11) {
                                statePc = 47;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            var11++;
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if (-513 < param1 - var9) {
                                statePc = 50;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof IOException ? 62 : 64);
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
                            statePc = (stateCaught_49 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            if (-65536 <= (param3 ^ -1)) {
                                statePc = 55;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            an.field_c[5] = (byte)var10;
                            an.field_c[0] = (byte)(param3 >> -1094568);
                            an.field_c[9] = (byte)((gl) this).field_e;
                            an.field_c[7] = (byte)(var11 >> 652059144);
                            an.field_c[4] = (byte)(var10 >> -1667239256);
                            an.field_c[3] = (byte)param3;
                            an.field_c[8] = (byte)var11;
                            an.field_c[6] = (byte)(var11 >> -992196560);
                            an.field_c[2] = (byte)(param3 >> 810540104);
                            an.field_c[1] = (byte)(param3 >> -1547619088);
                            ((gl) this).field_d.a((long)(var7_int * 520), 0);
                            ((gl) this).field_d.a(0, an.field_c, 10, 0);
                            var12 = -var9 + param1;
                            if ((var12 ^ -1) < -511) {
                                statePc = 53;
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
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof IOException ? 62 : 64);
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
                            statePc = (stateCaught_53 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            ((gl) this).field_d.a(var9, param0, var12, 0);
                            var9 = var9 + var12;
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
                            an.field_c[6] = (byte)var11;
                            an.field_c[7] = (byte)((gl) this).field_e;
                            an.field_c[2] = (byte)(var10 >> 532786728);
                            an.field_c[5] = (byte)(var11 >> -910025208);
                            an.field_c[3] = (byte)var10;
                            an.field_c[4] = (byte)(var11 >> 413405200);
                            an.field_c[1] = (byte)param3;
                            an.field_c[0] = (byte)(param3 >> 1973141608);
                            ((gl) this).field_d.a((long)(var7_int * 520), 0);
                            ((gl) this).field_d.a(0, an.field_c, 8, 0);
                            var12 = -var9 + param1;
                            if ((var12 ^ -1) >= -513) {
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
                            var12 = 512;
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
                            ((gl) this).field_d.a(var9, param0, var12, 0);
                            var9 = var9 + var12;
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
                            var10++;
                            var7_int = var11;
                            statePc = 16;
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
                            var16 = caughtException;
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

    final static void a(dh param0, byte param1, int param2) {
        hg var3 = gk.field_g;
        var3.g(param2, 8);
        int var4 = -12 % ((0 - param1) / 43);
        var3.a(param0.field_i, 58);
        var3.a(param0.field_g, 126);
    }

    public final String toString() {
        return "" + ((gl) this).field_e;
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
            Object stackIn_11_0 = null;
            Object stackIn_12_0 = null;
            Object stackIn_17_0 = null;
            Object stackIn_18_0 = null;
            Object stackIn_44_0 = null;
            Object stackIn_45_0 = null;
            byte[] stackIn_51_0 = null;
            byte[] stackIn_52_0 = null;
            Object stackIn_54_0 = null;
            Object stackOut_10_0 = null;
            Object stackOut_11_0 = null;
            Object stackOut_16_0 = null;
            Object stackOut_17_0 = null;
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
                        var18 = Virogrid.field_F ? 1 : 0;
                        var3 = (Object) (Object) ((gl) this).field_d;
                        // monitorenter ((gl) this).field_d
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((long)(6 + param0 * 6) ^ -1L) >= (((gl) this).field_j.a((byte) 127) ^ -1L)) {
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
                            ((gl) this).field_j.a((long)(6 * param0), 0);
                            ((gl) this).field_j.a(0, 6, an.field_c, (byte) 123);
                            if (param1 < -33) {
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
                            var19 = null;
                            int discarded$1 = gl.a(-48, false, (String) null);
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
                            var4_int = ((255 & an.field_c[1]) << -820541560) + ((16711680 & an.field_c[0] << -86079920) - -(an.field_c[2] & 255));
                            var5 = (an.field_c[3] << 1776131472 & 16711680) - -((255 & an.field_c[4]) << -699324888) - -(an.field_c[5] & 255);
                            if (var4_int <= -1) {
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
                            if (var4_int <= ((gl) this).field_k) {
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
                            stackOut_10_0 = null;
                            stackIn_11_0 = stackOut_10_0;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof IOException ? 53 : 55);
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
                            statePc = 55;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        return (byte[]) (Object) stackIn_12_0;
                    }
                    case 13: {
                        try {
                            if (-1 < var5) {
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
                            if ((((gl) this).field_d.a((byte) 127) / 520L ^ -1L) <= ((long)var5 ^ -1L)) {
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
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            ((gl) this).field_d.a((long)(520 * var5), 0);
                            var9 = var4_int - var7;
                            if (param0 > 65535) {
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
                            var14 = 8;
                            if (512 >= var9) {
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
                            ((gl) this).field_d.a(0, var14 + var9, an.field_c, (byte) 125);
                            var10 = (an.field_c[1] & 255) + ((255 & an.field_c[0]) << 1492912648);
                            var12 = (255 & an.field_c[6]) + ((255 & an.field_c[4]) << -136017456) + ((an.field_c[5] & 255) << 1837336296);
                            var13 = 255 & an.field_c[7];
                            var11 = ((255 & an.field_c[2]) << -1675774136) - -(255 & an.field_c[3]);
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
                            if (var9 <= 510) {
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
                            ((gl) this).field_d.a(0, var9 + var14, an.field_c, (byte) 127);
                            var11 = (255 & an.field_c[5]) + (65280 & an.field_c[4] << -1021770616);
                            var10 = ((an.field_c[2] & 255) << -1449824056) + (an.field_c[0] << 1284702008 & -16777216) + ((255 & an.field_c[1]) << 8883664) + (255 & an.field_c[3]);
                            var12 = ((255 & an.field_c[6]) << 1427019792) - (-((an.field_c[7] & 255) << -212918104) - (255 & an.field_c[8]));
                            var13 = 255 & an.field_c[9];
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
                            if (var10 == param0) {
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
                            if (var13 == ((gl) this).field_e) {
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
                            if (0 <= var12) {
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
                            if (((long)var12 ^ -1L) >= (((gl) this).field_d.a((byte) 127) / 520L ^ -1L)) {
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
                            var15 = var9 + var14;
                            var8++;
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
                            var6[var7] = an.field_c[var16];
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

    final boolean a(byte[] param0, int param1, int param2, byte param3) {
        Object var5 = null;
        int var6 = 0;
        Throwable var7 = null;
        Object var8 = null;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = (Object) (Object) ((gl) this).field_d;
                    // monitorenter ((gl) this).field_d
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if ((param2 ^ -1) > -1) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param2 <= ((gl) this).field_k) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        throw new IllegalArgumentException();
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param3 < -43) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var8 = null;
                        boolean discarded$3 = ((gl) this).a((byte[]) null, 80, 22, (byte) -103);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var6 = this.a(param0, param2, 116, param1, true) ? 1 : 0;
                        if (var6 == 0) {
                            statePc = 8;
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
                        var6 = this.a(param0, param2, 119, param1, false) ? 1 : 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        // monitorexit var5
                        stackOut_9_0 = var6;
                        stackIn_10_0 = stackOut_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return stackIn_10_0 != 0;
                }
                case 11: {
                    try {
                        var7 = caughtException;
                        // monitorexit var5
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 12: {
                    throw (RuntimeException) (Object) var7;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    gl(int param0, nh param1, nh param2, int param3) {
        ((gl) this).field_k = 65000;
        ((gl) this).field_j = null;
        ((gl) this).field_d = null;
        ((gl) this).field_k = param3;
        ((gl) this).field_d = param1;
        ((gl) this).field_e = param0;
        ((gl) this).field_j = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_f = -1;
        field_i = "Unpacking models";
        field_a = "Waiting for extra data";
        field_b = new int[8192];
        field_h = "Move one space to clone<br>or two spaces to jump";
    }
}
