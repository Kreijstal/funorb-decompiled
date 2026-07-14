/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wl {
    static String field_b;
    private gj field_c;
    private int field_a;
    private int field_d;
    private gj field_e;

    private final boolean a(byte[] param0, boolean param1, int param2, int param3, int param4) {
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
            int stackIn_3_0 = 0;
            int stackIn_8_0 = 0;
            int stackIn_9_0 = 0;
            int stackIn_14_0 = 0;
            int stackIn_15_0 = 0;
            int stackIn_36_0 = 0;
            int stackIn_37_0 = 0;
            int stackIn_42_0 = 0;
            int stackIn_43_0 = 0;
            int stackIn_63_0 = 0;
            int stackIn_64_0 = 0;
            int stackIn_66_0 = 0;
            int stackOut_2_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_8_0 = 0;
            int stackOut_13_0 = 0;
            int stackOut_14_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_36_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_62_0 = 0;
            int stackOut_63_0 = 0;
            int stackOut_65_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = Sumoblitz.field_L ? 1 : 0;
                        var6 = (Object) (Object) ((wl) this).field_c;
                        // monitorenter ((wl) this).field_c
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (param4 == 255) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 67;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            // monitorexit var6
                            stackOut_2_0 = 0;
                            stackIn_3_0 = stackOut_2_0;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 67;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        return stackIn_3_0 != 0;
                    }
                    case 4: {
                        try {
                            if (!param1) {
                                statePc = 16;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = (stateCaught_4 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if ((((wl) this).field_e.a((byte) -60) ^ -1L) > ((long)(param3 * 6 + 6) ^ -1L)) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            stackOut_7_0 = 0;
                            stackIn_8_0 = stackOut_7_0;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            // monitorexit var6
                            stackOut_8_0 = stackIn_8_0;
                            stackIn_9_0 = stackOut_8_0;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 67;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        return stackIn_9_0 != 0;
                    }
                    case 10: {
                        try {
                            ((wl) this).field_e.a(-7564, (long)(6 * param3));
                            ((wl) this).field_e.a(6, 0, to.field_t, -111);
                            var7_int = (to.field_t[3] << -1986960720 & 16711680) + (to.field_t[4] << 939853608 & 65280) - -(255 & to.field_t[5]);
                            if (0 >= var7_int) {
                                statePc = 13;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if ((((wl) this).field_c.a((byte) -60) / 520L ^ -1L) > ((long)var7_int ^ -1L)) {
                                statePc = 13;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            stackOut_13_0 = 0;
                            stackIn_14_0 = stackOut_13_0;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            // monitorexit var6
                            stackOut_14_0 = stackIn_14_0;
                            stackIn_15_0 = stackOut_14_0;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 67;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        return stackIn_15_0 != 0;
                    }
                    case 16: {
                        try {
                            var7_int = (int)((((wl) this).field_c.a((byte) -60) - -519L) / 520L);
                            if (var7_int != 0) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var7_int = 1;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            to.field_t[1] = (byte)(param2 >> -1219525112);
                            to.field_t[4] = (byte)(var7_int >> 1194522600);
                            to.field_t[5] = (byte)var7_int;
                            to.field_t[3] = (byte)(var7_int >> 1031016240);
                            to.field_t[2] = (byte)param2;
                            to.field_t[0] = (byte)(param2 >> -816110096);
                            ((wl) this).field_e.a(-7564, (long)(6 * param3));
                            ((wl) this).field_e.a(to.field_t, 6, (byte) -50, 0);
                            var8 = 0;
                            var9 = 0;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (param2 <= var8) {
                                statePc = 62;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            var10 = 0;
                            if (!param1) {
                                statePc = 44;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            ((wl) this).field_c.a(-7564, (long)(var7_int * 520));
                            if (param3 <= 65535) {
                                statePc = 27;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            ((wl) this).field_c.a(10, 0, to.field_t, -108);
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof EOFException ? 25 : (stateCaught_23 instanceof IOException ? 65 : 67));
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var14 = (EOFException) (Object) caughtException;
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var13 = to.field_t[9] & 255;
                            var10 = ((255 & to.field_t[7]) << 1428007304) + (((to.field_t[6] & 255) << -1291481040) + (255 & to.field_t[8]));
                            var11 = (255 & to.field_t[3]) + (to.field_t[1] << -328166064 & 16711680) + ((to.field_t[0] & 255) << -979088008) - -(65280 & to.field_t[2] << 628736936);
                            var12 = (255 & to.field_t[5]) + ((255 & to.field_t[4]) << -1510095864);
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            ((wl) this).field_c.a(8, 0, to.field_t, -64);
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof EOFException ? 29 : (stateCaught_27 instanceof IOException ? 65 : 67));
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var14 = (EOFException) (Object) caughtException;
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var10 = (255 & to.field_t[6]) + (16711680 & to.field_t[4] << -1177425904) + ((to.field_t[5] & 255) << -913508696);
                            var13 = to.field_t[7] & 255;
                            var11 = (to.field_t[1] & 255) + (65280 & to.field_t[0] << 1627523656);
                            var12 = ((255 & to.field_t[2]) << 926588392) - -(to.field_t[3] & 255);
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (param3 != var11) {
                                statePc = 35;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (var9 != var12) {
                                statePc = 35;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (var13 == ((wl) this).field_d) {
                                statePc = 38;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            stackOut_35_0 = 0;
                            stackIn_36_0 = stackOut_35_0;
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            // monitorexit var6
                            stackOut_36_0 = stackIn_36_0;
                            stackIn_37_0 = stackOut_36_0;
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 67;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        return stackIn_37_0 != 0;
                    }
                    case 38: {
                        try {
                            if (0 > var10) {
                                statePc = 41;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if ((long)var10 > ((wl) this).field_c.a((byte) -60) / 520L) {
                                statePc = 41;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            stackOut_41_0 = 0;
                            stackIn_42_0 = stackOut_41_0;
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            // monitorexit var6
                            stackOut_42_0 = stackIn_42_0;
                            stackIn_43_0 = stackOut_42_0;
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 67;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        return stackIn_43_0 != 0;
                    }
                    case 44: {
                        try {
                            if (0 == var10) {
                                statePc = 46;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            param1 = false;
                            var10 = (int)((519L + ((wl) this).field_c.a((byte) -60)) / 520L);
                            if (var10 == 0) {
                                statePc = 48;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof IOException ? 65 : 67);
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
                            statePc = (stateCaught_48 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            if (var10 != var7_int) {
                                statePc = 51;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof IOException ? 65 : 67);
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
                            statePc = (stateCaught_50 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            if ((-var8 + param2 ^ -1) >= -513) {
                                statePc = 53;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof IOException ? 65 : 67);
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
                            statePc = (stateCaught_53 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            if ((param3 ^ -1) >= -65536) {
                                statePc = 58;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            to.field_t[8] = (byte)var10;
                            to.field_t[7] = (byte)(var10 >> 898422824);
                            to.field_t[6] = (byte)(var10 >> 283051600);
                            to.field_t[3] = (byte)param3;
                            to.field_t[9] = (byte)((wl) this).field_d;
                            to.field_t[5] = (byte)var9;
                            to.field_t[0] = (byte)(param3 >> -871653448);
                            to.field_t[4] = (byte)(var9 >> 41034760);
                            to.field_t[1] = (byte)(param3 >> -2014710224);
                            to.field_t[2] = (byte)(param3 >> -1170731512);
                            ((wl) this).field_c.a(-7564, (long)(var7_int * 520));
                            ((wl) this).field_c.a(to.field_t, 10, (byte) 126, 0);
                            var11 = param2 - var8;
                            if (510 >= var11) {
                                statePc = 57;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof IOException ? 65 : 67);
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
                            statePc = (stateCaught_56 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            ((wl) this).field_c.a(param0, var11, (byte) 126, var8);
                            var8 = var8 + var11;
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            to.field_t[4] = (byte)(var10 >> 1834015184);
                            to.field_t[5] = (byte)(var10 >> -1067013112);
                            to.field_t[2] = (byte)(var9 >> -714520024);
                            to.field_t[0] = (byte)(param3 >> -340848216);
                            to.field_t[7] = (byte)((wl) this).field_d;
                            to.field_t[6] = (byte)var10;
                            to.field_t[3] = (byte)var9;
                            to.field_t[1] = (byte)param3;
                            ((wl) this).field_c.a(param4 + -7819, (long)(var7_int * 520));
                            ((wl) this).field_c.a(to.field_t, 8, (byte) 65, 0);
                            var11 = -var8 + param2;
                            if (var11 <= 512) {
                                statePc = 60;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            var11 = 512;
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            ((wl) this).field_c.a(param0, var11, (byte) -121, var8);
                            var8 = var8 + var11;
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            var9++;
                            var7_int = var10;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = (stateCaught_61 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            stackOut_62_0 = 1;
                            stackIn_63_0 = stackOut_62_0;
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = (stateCaught_62 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            // monitorexit var6
                            stackOut_63_0 = stackIn_63_0;
                            stackIn_64_0 = stackOut_63_0;
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 67;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        return stackIn_64_0 != 0;
                    }
                    case 65: {
                        try {
                            var7 = (IOException) (Object) caughtException;
                            // monitorexit var6
                            stackOut_65_0 = 0;
                            stackIn_66_0 = stackOut_65_0;
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 67;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        return stackIn_66_0 != 0;
                    }
                    case 67: {
                        try {
                            var15 = caughtException;
                            // monitorexit var6
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 67;
                            continue stateLoop;
                        }
                    }
                    case 68: {
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
        return "" + ((wl) this).field_d;
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 != -90) {
            field_b = null;
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
            Object stackIn_21_0 = null;
            Object stackIn_22_0 = null;
            Object stackIn_37_0 = null;
            Object stackIn_38_0 = null;
            byte[] stackIn_50_0 = null;
            byte[] stackIn_51_0 = null;
            Object stackIn_53_0 = null;
            Object stackOut_2_0 = null;
            Object stackOut_3_0 = null;
            Object stackOut_20_0 = null;
            Object stackOut_21_0 = null;
            Object stackOut_36_0 = null;
            Object stackOut_37_0 = null;
            byte[] stackOut_49_0 = null;
            byte[] stackOut_50_0 = null;
            Object stackOut_52_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var18 = Sumoblitz.field_L ? 1 : 0;
                        var3 = (Object) (Object) ((wl) this).field_c;
                        // monitorenter ((wl) this).field_c
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((wl) this).field_e.a((byte) -60) >= (long)(6 + param1 * 6)) {
                                statePc = 5;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof IOException ? 52 : 54);
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
                            statePc = (stateCaught_2 instanceof IOException ? 52 : 54);
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
                            statePc = 54;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        return (byte[]) (Object) stackIn_4_0;
                    }
                    case 5: {
                        try {
                            ((wl) this).field_e.a(-7564, (long)(6 * param1));
                            ((wl) this).field_e.a(6, 0, to.field_t, -104);
                            var4_int = (65280 & to.field_t[1] << -1287640792) + (((255 & to.field_t[0]) << -1376047440) + (255 & to.field_t[2]));
                            var5 = ((255 & to.field_t[3]) << 701270832) + (65280 & to.field_t[4] << -1691931768) - -(255 & to.field_t[5]);
                            if (var4_int >= 0) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (((wl) this).field_a >= var4_int) {
                                statePc = 11;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof IOException ? 52 : 54);
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
                            statePc = (stateCaught_11 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (((wl) this).field_c.a((byte) -60) / 520L >= (long)var5) {
                                statePc = 17;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
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
                            statePc = (stateCaught_17 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (var7 >= var4_int) {
                                statePc = 49;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (var5 != 0) {
                                statePc = 23;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 52 : 54);
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
                            statePc = (stateCaught_20 instanceof IOException ? 52 : 54);
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
                            statePc = 54;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        return (byte[]) (Object) stackIn_22_0;
                    }
                    case 23: {
                        try {
                            ((wl) this).field_c.a(-7564, (long)(var5 * 520));
                            var9 = var4_int + -var7;
                            if (param1 <= 65535) {
                                statePc = 27;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (var9 <= 510) {
                                statePc = 26;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 52 : 54);
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
                            statePc = (stateCaught_25 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var14 = 10;
                            ((wl) this).field_c.a(var9 + var14, 0, to.field_t, -93);
                            var10 = (to.field_t[3] & 255) + (to.field_t[2] << -25652792 & 65280) + ((to.field_t[1] & 255) << 97457648) + ((to.field_t[0] & 255) << 889211128);
                            var13 = to.field_t[9] & 255;
                            var12 = (to.field_t[8] & 255) + (to.field_t[7] << -1603142936 & 65280) + ((to.field_t[6] & 255) << -375772624);
                            var11 = ((255 & to.field_t[4]) << -1469508952) - -(to.field_t[5] & 255);
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var14 = 8;
                            if (-513 > (var9 ^ -1)) {
                                statePc = 29;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var9 = 512;
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            ((wl) this).field_c.a(var9 - -var14, 0, to.field_t, -55);
                            var11 = (255 & to.field_t[3]) + ((255 & to.field_t[2]) << -2032926552);
                            var13 = to.field_t[7] & 255;
                            var12 = (255 & to.field_t[6]) + (((255 & to.field_t[5]) << -351227736) + (16711680 & to.field_t[4] << -908122928));
                            var10 = ((to.field_t[0] & 255) << -90301720) - -(to.field_t[1] & 255);
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (var10 == param1) {
                                statePc = 33;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (var11 == var8) {
                                statePc = 35;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (var13 == ((wl) this).field_d) {
                                statePc = 39;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            stackOut_36_0 = null;
                            stackIn_37_0 = stackOut_36_0;
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            // monitorexit var3
                            stackOut_37_0 = stackIn_37_0;
                            stackIn_38_0 = stackOut_37_0;
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 54;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        return (byte[]) (Object) stackIn_38_0;
                    }
                    case 39: {
                        try {
                            if ((var12 ^ -1) <= -1) {
                                statePc = 41;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            if ((long)var12 <= ((wl) this).field_c.a((byte) -60) / 520L) {
                                statePc = 45;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            var15 = var14 - -var9;
                            var16 = var14;
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if (var16 >= var15) {
                                statePc = 48;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            var7++;
                            var6[var7] = to.field_t[var16];
                            var16++;
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            var5 = var12;
                            var8++;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            var9 = 9 % ((-33 - param0) / 59);
                            stackOut_49_0 = (byte[]) var6;
                            stackIn_50_0 = stackOut_49_0;
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            // monitorexit var3
                            stackOut_50_0 = (byte[]) (Object) stackIn_50_0;
                            stackIn_51_0 = stackOut_50_0;
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 54;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        return stackIn_51_0;
                    }
                    case 52: {
                        try {
                            var4 = (IOException) (Object) caughtException;
                            // monitorexit var3
                            stackOut_52_0 = null;
                            stackIn_53_0 = stackOut_52_0;
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 54;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        return (byte[]) (Object) stackIn_53_0;
                    }
                    case 54: {
                        try {
                            var17 = caughtException;
                            // monitorexit var3
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 54;
                            continue stateLoop;
                        }
                    }
                    case 55: {
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

    final boolean a(byte[] param0, int param1, int param2, int param3) {
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
                    var5 = (Object) (Object) ((wl) this).field_c;
                    // monitorenter ((wl) this).field_c
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param3 > param2) {
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
                        if (((wl) this).field_a >= param2) {
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
                        var6 = this.a(param0, true, param2, param1, 255) ? 1 : 0;
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
                        var6 = this.a(param0, false, param2, param1, 255) ? 1 : 0;
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

    wl(int param0, gj param1, gj param2, int param3) {
        ((wl) this).field_a = 65000;
        ((wl) this).field_c = null;
        ((wl) this).field_e = null;
        ((wl) this).field_e = param2;
        ((wl) this).field_c = param1;
        ((wl) this).field_d = param0;
        ((wl) this).field_a = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Service unavailable";
    }
}
