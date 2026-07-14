/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class la {
    private rk field_c;
    private int field_b;
    static oe field_f;
    private rk field_e;
    static kb field_a;
    static fj field_d;
    private int field_g;

    private final boolean a(int param0, int param1, int param2, byte[] param3, boolean param4) {
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
            int stackIn_7_0 = 0;
            int stackIn_8_0 = 0;
            int stackIn_13_0 = 0;
            int stackIn_14_0 = 0;
            int stackIn_17_0 = 0;
            int stackIn_18_0 = 0;
            int stackIn_37_0 = 0;
            int stackIn_38_0 = 0;
            int stackIn_43_0 = 0;
            int stackIn_44_0 = 0;
            int stackIn_65_0 = 0;
            int stackIn_66_0 = 0;
            int stackIn_68_0 = 0;
            int stackOut_6_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_12_0 = 0;
            int stackOut_13_0 = 0;
            int stackOut_16_0 = 0;
            int stackOut_17_0 = 0;
            int stackOut_36_0 = 0;
            int stackOut_37_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_64_0 = 0;
            int stackOut_65_0 = 0;
            int stackOut_67_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = TorChallenge.field_F ? 1 : 0;
                        var6 = (Object) (Object) ((la) this).field_c;
                        // monitorenter ((la) this).field_c
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
                            statePc = (stateCaught_1 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var7_int = (int)((((la) this).field_c.a(-124) - -519L) / 520L);
                            if (var7_int != 0) {
                                statePc = 15;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof IOException ? 67 : 69);
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
                            statePc = (stateCaught_3 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if ((((la) this).field_e.a(3) ^ -1L) > ((long)(6 * param2 - -6) ^ -1L)) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = (stateCaught_4 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof IOException ? 67 : 69);
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
                            statePc = (stateCaught_6 instanceof IOException ? 67 : 69);
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
                            statePc = 69;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        return stackIn_8_0 != 0;
                    }
                    case 9: {
                        try {
                            ((la) this).field_e.a((long)(6 * param2), 0);
                            ((la) this).field_e.a(0, 6, (byte) 72, wi.field_c);
                            var7_int = (65280 & wi.field_c[4] << 1445846824) + (((wi.field_c[3] & 255) << 824425008) + (255 & wi.field_c[5]));
                            if ((var7_int ^ -1) >= -1) {
                                statePc = 12;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = (stateCaught_9 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (((long)var7_int ^ -1L) < (((la) this).field_c.a(param1 ^ -20) / 520L ^ -1L)) {
                                statePc = 12;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof IOException ? 67 : 69);
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
                            statePc = (stateCaught_12 instanceof IOException ? 67 : 69);
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
                            statePc = 69;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        return stackIn_14_0 != 0;
                    }
                    case 15: {
                        try {
                            wi.field_c[2] = (byte)param0;
                            wi.field_c[4] = (byte)(var7_int >> 1520647816);
                            wi.field_c[1] = (byte)(param0 >> -377548344);
                            wi.field_c[0] = (byte)(param0 >> 677735536);
                            wi.field_c[3] = (byte)(var7_int >> -1586241712);
                            wi.field_c[5] = (byte)var7_int;
                            ((la) this).field_e.a((long)(param2 * 6), 0);
                            ((la) this).field_e.a(-4573, 0, wi.field_c, 6);
                            var8 = 0;
                            if (param1 == -6) {
                                statePc = 19;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            stackOut_16_0 = 0;
                            stackIn_17_0 = stackOut_16_0;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            // monitorexit var6
                            stackOut_17_0 = stackIn_17_0;
                            stackIn_18_0 = stackOut_17_0;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 69;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        return stackIn_18_0 != 0;
                    }
                    case 19: {
                        try {
                            var9 = 0;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (var8 >= param0) {
                                statePc = 64;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var10 = 0;
                            if (!param4) {
                                statePc = 45;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            ((la) this).field_c.a((long)(520 * var7_int), 0);
                            if (param2 <= 65535) {
                                statePc = 28;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            ((la) this).field_c.a(0, 10, (byte) 68, wi.field_c);
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof EOFException ? 26 : (stateCaught_24 instanceof IOException ? 67 : 69));
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var14 = (EOFException) (Object) caughtException;
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var10 = (65280 & wi.field_c[7] << 1768307688) + ((255 & wi.field_c[6]) << -1821448464) - -(255 & wi.field_c[8]);
                            var11 = (255 & wi.field_c[3]) + ((wi.field_c[2] & 255) << 348533928) + (wi.field_c[0] << -633665704 & -16777216) - -(16711680 & wi.field_c[1] << 861319536);
                            var12 = (wi.field_c[5] & 255) + (65280 & wi.field_c[4] << -355662168);
                            var13 = wi.field_c[9] & 255;
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            ((la) this).field_c.a(0, 8, (byte) 29, wi.field_c);
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof EOFException ? 30 : (stateCaught_28 instanceof IOException ? 67 : 69));
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var14 = (EOFException) (Object) caughtException;
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            var12 = (wi.field_c[2] << -1561527992 & 65280) + (255 & wi.field_c[3]);
                            var13 = 255 & wi.field_c[7];
                            var11 = (wi.field_c[1] & 255) + ((255 & wi.field_c[0]) << 1329152776);
                            var10 = (16711680 & wi.field_c[4] << 334558416) - -(wi.field_c[5] << 1894404264 & 65280) + (255 & wi.field_c[6]);
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (param2 != var11) {
                                statePc = 36;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (var9 != var12) {
                                statePc = 36;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (((la) this).field_b == var13) {
                                statePc = 39;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            stackOut_36_0 = 0;
                            stackIn_37_0 = stackOut_36_0;
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            // monitorexit var6
                            stackOut_37_0 = stackIn_37_0;
                            stackIn_38_0 = stackOut_37_0;
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 69;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        return stackIn_38_0 != 0;
                    }
                    case 39: {
                        try {
                            if (0 > var10) {
                                statePc = 42;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if ((long)var10 <= ((la) this).field_c.a(-112) / 520L) {
                                statePc = 45;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            stackOut_42_0 = 0;
                            stackIn_43_0 = stackOut_42_0;
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            // monitorexit var6
                            stackOut_43_0 = stackIn_43_0;
                            stackIn_44_0 = stackOut_43_0;
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 69;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        return stackIn_44_0 != 0;
                    }
                    case 45: {
                        try {
                            if (0 == var10) {
                                statePc = 47;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            param4 = false;
                            var10 = (int)((((la) this).field_c.a(-14) - -519L) / 520L);
                            if (0 == var10) {
                                statePc = 49;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof IOException ? 67 : 69);
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
                            statePc = (stateCaught_49 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            if (var10 != var7_int) {
                                statePc = 52;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            var10++;
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            if (-513 <= param0 + -var8) {
                                statePc = 54;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            var10 = 0;
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            if (-65536 < param2) {
                                statePc = 60;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            wi.field_c[3] = (byte)var9;
                            wi.field_c[1] = (byte)param2;
                            wi.field_c[5] = (byte)(var10 >> 522511400);
                            wi.field_c[2] = (byte)(var9 >> -1687770648);
                            wi.field_c[7] = (byte)((la) this).field_b;
                            wi.field_c[6] = (byte)var10;
                            wi.field_c[4] = (byte)(var10 >> -1219796240);
                            wi.field_c[0] = (byte)(param2 >> 636369480);
                            ((la) this).field_c.a((long)(var7_int * 520), 0);
                            ((la) this).field_c.a(param1 ^ 4569, 0, wi.field_c, 8);
                            var11 = -var8 + param0;
                            if ((var11 ^ -1) < -513) {
                                statePc = 58;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            var11 = 512;
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            ((la) this).field_c.a(-4573, var8, param3, var11);
                            var8 = var8 + var11;
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            wi.field_c[5] = (byte)var9;
                            wi.field_c[6] = (byte)(var10 >> 1607141904);
                            wi.field_c[7] = (byte)(var10 >> -729187832);
                            wi.field_c[4] = (byte)(var9 >> 1266526952);
                            wi.field_c[8] = (byte)var10;
                            wi.field_c[9] = (byte)((la) this).field_b;
                            wi.field_c[2] = (byte)(param2 >> -1407949560);
                            wi.field_c[3] = (byte)param2;
                            wi.field_c[0] = (byte)(param2 >> 784929080);
                            wi.field_c[1] = (byte)(param2 >> -935111568);
                            ((la) this).field_c.a((long)(var7_int * 520), 0);
                            ((la) this).field_c.a(-4573, 0, wi.field_c, 10);
                            var11 = -var8 + param0;
                            if (var11 <= 510) {
                                statePc = 62;
                            } else {
                                statePc = 61;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            var11 = 510;
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = (stateCaught_61 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            ((la) this).field_c.a(-4573, var8, param3, var11);
                            var8 = var8 + var11;
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = (stateCaught_62 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            var7_int = var10;
                            var9++;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = (stateCaught_63 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            stackOut_64_0 = 1;
                            stackIn_65_0 = stackOut_64_0;
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = (stateCaught_64 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            // monitorexit var6
                            stackOut_65_0 = stackIn_65_0;
                            stackIn_66_0 = stackOut_65_0;
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 69;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        return stackIn_66_0 != 0;
                    }
                    case 67: {
                        try {
                            var7 = (IOException) (Object) caughtException;
                            // monitorexit var6
                            stackOut_67_0 = 0;
                            stackIn_68_0 = stackOut_67_0;
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 69;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        return stackIn_68_0 != 0;
                    }
                    case 69: {
                        try {
                            var15 = caughtException;
                            // monitorexit var6
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 69;
                            continue stateLoop;
                        }
                    }
                    case 70: {
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

    final byte[] a(int param0, int param1) {
        try {
            Object var3 = null;
            IOException var4 = null;
            int var4_int = 0;
            int var5 = 0;
            int var6 = 0;
            byte[] var7 = null;
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
            Throwable var18 = null;
            int var19 = 0;
            Object stackIn_9_0 = null;
            Object stackIn_10_0 = null;
            Object stackIn_37_0 = null;
            Object stackIn_38_0 = null;
            Object stackIn_43_0 = null;
            Object stackIn_44_0 = null;
            byte[] stackIn_49_0 = null;
            byte[] stackIn_50_0 = null;
            Object stackIn_52_0 = null;
            Object stackOut_8_0 = null;
            Object stackOut_9_0 = null;
            Object stackOut_36_0 = null;
            Object stackOut_37_0 = null;
            Object stackOut_42_0 = null;
            Object stackOut_43_0 = null;
            byte[] stackOut_48_0 = null;
            byte[] stackOut_49_0 = null;
            Object stackOut_51_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var19 = TorChallenge.field_F ? 1 : 0;
                        var3 = (Object) (Object) ((la) this).field_c;
                        // monitorenter ((la) this).field_c
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((long)(6 + 6 * param0) ^ -1L) >= (((la) this).field_e.a(-114) ^ -1L)) {
                                statePc = 5;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            ((la) this).field_e.a((long)(6 * param0), 0);
                            ((la) this).field_e.a(0, 6, (byte) 46, wi.field_c);
                            var4_int = (wi.field_c[2] & 255) + ((wi.field_c[0] & 255) << 1513119312) - -((wi.field_c[1] & 255) << -1861070616);
                            var5 = (wi.field_c[5] & 255) + ((255 & wi.field_c[4]) << 1612039272) + ((255 & wi.field_c[3]) << -1655868944);
                            var6 = -54 % ((-63 - param1) / 40);
                            if (var4_int <= -1) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (var4_int <= ((la) this).field_g) {
                                statePc = 11;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof IOException ? 51 : 53);
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
                            statePc = (stateCaught_8 instanceof IOException ? 51 : 53);
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
                            statePc = 53;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        return (byte[]) (Object) stackIn_10_0;
                    }
                    case 11: {
                        try {
                            if (-1 < var5) {
                                statePc = 13;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if ((((la) this).field_c.a(-117) / 520L ^ -1L) <= ((long)var5 ^ -1L)) {
                                statePc = 17;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var7 = new byte[var4_int];
                            var8 = 0;
                            var9 = 0;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (var4_int <= var8) {
                                statePc = 48;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof IOException ? 51 : 53);
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
                            statePc = (stateCaught_19 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            ((la) this).field_c.a((long)(var5 * 520), 0);
                            var10 = var4_int + -var8;
                            if ((param0 ^ -1) < -65536) {
                                statePc = 27;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (512 >= var10) {
                                statePc = 26;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var10 = 512;
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var15 = 8;
                            ((la) this).field_c.a(0, var15 + var10, (byte) 98, wi.field_c);
                            var12 = (255 & wi.field_c[3]) + (65280 & wi.field_c[2] << 1093552008);
                            var13 = (255 & wi.field_c[6]) + (((wi.field_c[4] & 255) << -770117584) + (wi.field_c[5] << 1225973512 & 65280));
                            var14 = wi.field_c[7] & 255;
                            var11 = (wi.field_c[1] & 255) + ((255 & wi.field_c[0]) << 365069896);
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var15 = 10;
                            if (var10 > 510) {
                                statePc = 29;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var10 = 510;
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            ((la) this).field_c.a(0, var10 + var15, (byte) 69, wi.field_c);
                            var12 = ((255 & wi.field_c[4]) << -532938840) - -(255 & wi.field_c[5]);
                            var14 = 255 & wi.field_c[9];
                            var11 = ((wi.field_c[2] & 255) << -973944504) + (((255 & wi.field_c[1]) << 1878434224) + ((wi.field_c[0] & 255) << 530339384)) + (255 & wi.field_c[3]);
                            var13 = (wi.field_c[8] & 255) + (65280 & wi.field_c[7] << 2282376) + (16711680 & wi.field_c[6] << 1716154800);
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (var11 == param0) {
                                statePc = 33;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (var9 == var12) {
                                statePc = 35;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (var14 == ((la) this).field_b) {
                                statePc = 39;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof IOException ? 51 : 53);
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
                            statePc = (stateCaught_36 instanceof IOException ? 51 : 53);
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
                            statePc = 53;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        return (byte[]) (Object) stackIn_38_0;
                    }
                    case 39: {
                        try {
                            if (-1 >= (var13 ^ -1)) {
                                statePc = 41;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            if (((la) this).field_c.a(23) / 520L >= (long)var13) {
                                statePc = 45;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            stackOut_42_0 = null;
                            stackIn_43_0 = stackOut_42_0;
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            // monitorexit var3
                            stackOut_43_0 = stackIn_43_0;
                            stackIn_44_0 = stackOut_43_0;
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 53;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        return (byte[]) (Object) stackIn_44_0;
                    }
                    case 45: {
                        try {
                            var16 = var10 + var15;
                            var9++;
                            var5 = var13;
                            var17 = var15;
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if (var16 <= var17) {
                                statePc = 18;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            var8++;
                            var7[var8] = wi.field_c[var17];
                            var17++;
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            stackOut_48_0 = (byte[]) var7;
                            stackIn_49_0 = stackOut_48_0;
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            // monitorexit var3
                            stackOut_49_0 = (byte[]) (Object) stackIn_49_0;
                            stackIn_50_0 = stackOut_49_0;
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 53;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        return stackIn_50_0;
                    }
                    case 51: {
                        try {
                            var4 = (IOException) (Object) caughtException;
                            // monitorexit var3
                            stackOut_51_0 = null;
                            stackIn_52_0 = stackOut_51_0;
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 53;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        return (byte[]) (Object) stackIn_52_0;
                    }
                    case 53: {
                        try {
                            var18 = caughtException;
                            // monitorexit var3
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 53;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        throw (RuntimeException) (Object) var18;
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

    final static int a(qe param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        qe var9 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var14 = TorChallenge.field_F ? 1 : 0;
        if (0 >= param0.field_G) {
          return -1;
        } else {
          L0: {
            var2 = 0;
            if (-1 <= (param0.field_Q ^ -1)) {
              break L0;
            } else {
              var2 = 1;
              break L0;
            }
          }
          L1: {
            if (param0.field_Q >= 0) {
              break L1;
            } else {
              var2 = -1;
              break L1;
            }
          }
          var3 = param0.field_B + param0.field_Q;
          var4 = param0.field_o;
          var5 = 89 / ((11 - param1) / 56);
          L2: while (true) {
            if (256 >= var3 * var2) {
              L3: {
                var6 = (-param0.field_o + var4) * var2;
                if ((var4 ^ -1) <= -65) {
                  var4 -= 64;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (0 > var4) {
                  var4 += 64;
                  break L4;
                } else {
                  break L4;
                }
              }
              var11 = 0;
              var12 = 0;
              L5: while (true) {
                if (var6 <= var12) {
                  return 1;
                } else {
                  L6: {
                    var7 = var2 * var12 + param0.field_o;
                    var15 = var7 % 64;
                    var7 = var15;
                    if (-1 < (var15 ^ -1)) {
                      var15 += 64;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  if (null != n.field_kb[var15][param0.field_H]) {
                    var13 = 0;
                    L7: while (true) {
                      if (n.field_kb[var15][param0.field_H].length > var13) {
                        L8: {
                          if (var13 < 0) {
                            break L8;
                          } else {
                            var8 = var13;
                            if (eh.a(var2, -30917, n.field_kb[var15][param0.field_H], var8, param0)) {
                              L9: {
                                if (var11 == 0) {
                                  param0.field_Q = 8 * param0.field_Q / 10;
                                  var11 = 1;
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              if (n.field_kb[var15][param0.field_H][var8] < ea.field_g.length) {
                                var9 = ea.field_g[n.field_kb[var15][param0.field_H][var8]];
                                if (var9 == null) {
                                  break L8;
                                } else {
                                  var9.field_Q = param0.field_Q;
                                  break L8;
                                }
                              } else {
                                break L8;
                              }
                            } else {
                              break L8;
                            }
                          }
                        }
                        var13++;
                        continue L7;
                      } else {
                        var12++;
                        continue L5;
                      }
                    }
                  } else {
                    var12++;
                    continue L5;
                  }
                }
              }
            } else {
              var4 = var4 + var2;
              var3 = var3 + var2 * -256;
              continue L2;
            }
          }
        }
    }

    final boolean a(int param0, byte[] param1, int param2, byte param3) {
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
                    if (param3 >= 116) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    String discarded$3 = ((la) this).toString();
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var5 = (Object) (Object) ((la) this).field_c;
                    // monitorenter ((la) this).field_c
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        if (param2 < 0) {
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
                        if (param2 <= ((la) this).field_g) {
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
                        var6 = this.a(param2, -6, param0, param1, true) ? 1 : 0;
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
                        var6 = this.a(param2, -6, param0, param1, false) ? 1 : 0;
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

    public static void b(byte param0) {
        field_a = null;
        field_d = null;
        field_f = null;
        if (param0 != -64) {
            la.b((byte) -70);
        }
    }

    final static void a(byte param0) {
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        pa var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var10 = null;
        int[] var11 = null;
        rd var12 = null;
        pa var13 = null;
        int[] var14 = null;
        ql var15 = null;
        Object var16 = null;
        ql var16_ref = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        L0: {
          var16 = null;
          var8 = TorChallenge.field_F ? 1 : 0;
          var13 = id.field_b;
          if (param0 < -29) {
            break L0;
          } else {
            la.a((byte) 70);
            break L0;
          }
        }
        L1: {
          var2 = var13.j(-126);
          if (var2 != 0) {
            if (1 != var2) {
              if ((var2 ^ -1) == -3) {
                var16_ref = (ql) (Object) ji.field_q.c((byte) 125);
                if (var16_ref == null) {
                  ob.b(-107);
                  return;
                } else {
                  var16_ref.field_o = jj.b((byte) -24);
                  var16_ref.field_i = true;
                  var16_ref.field_m = var16_ref.field_o[0];
                  var16_ref.a(true);
                  break L1;
                }
              } else {
                td.a("A1: " + ck.a(-13299), (Throwable) null, (byte) -74);
                ob.b(-87);
                return;
              }
            } else {
              var12 = (rd) (Object) bb.field_d.c((byte) 113);
              if (var12 != null) {
                var12.a(true);
                break L1;
              } else {
                ob.b(-93);
                return;
              }
            }
          } else {
            var11 = jj.b((byte) -24);
            var19 = var11;
            var18 = var19;
            var17 = var18;
            var14 = var17;
            var3 = var14;
            var10 = var11;
            var4 = var10;
            var5 = var13;
            var6 = ((uf) (Object) var5).j(-95);
            var7 = 0;
            L2: while (true) {
              if (var6 <= var7) {
                var15 = (ql) (Object) ji.field_q.c((byte) 119);
                if (var15 == null) {
                  ob.b(-100);
                  return;
                } else {
                  var15.field_m = var19[0];
                  var15.field_o = var3;
                  var15.field_i = true;
                  var15.a(true);
                  break L1;
                }
              } else {
                var10[var7] = ((uf) (Object) var5).i(38);
                var7++;
                continue L2;
              }
            }
          }
        }
    }

    public final String toString() {
        return "" + ((la) this).field_b;
    }

    final static String a(byte param0, int param1, char param2) {
        int var4 = 0;
        int var5 = TorChallenge.field_F ? 1 : 0;
        char[] var6 = new char[param1];
        char[] var3 = var6;
        if (param0 < 75) {
            field_a = null;
        }
        for (var4 = 0; param1 > var4; var4++) {
            var6[var4] = param2;
        }
        return new String(var6);
    }

    la(int param0, rk param1, rk param2, int param3) {
        ((la) this).field_c = null;
        ((la) this).field_e = null;
        ((la) this).field_g = 65000;
        ((la) this).field_g = param3;
        ((la) this).field_b = param0;
        ((la) this).field_e = param2;
        ((la) this).field_c = param1;
    }

    static {
    }
}
