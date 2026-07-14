/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class um {
    static boolean field_f;
    static boolean field_d;
    static int field_e;
    private bn field_c;
    static String field_h;
    private int field_b;
    private bn field_g;
    private int field_a;

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
            int stackIn_66_0 = 0;
            int stackIn_67_0 = 0;
            int stackIn_69_0 = 0;
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
            int stackOut_65_0 = 0;
            int stackOut_66_0 = 0;
            int stackOut_68_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = HostileSpawn.field_I ? 1 : 0;
                        var6 = (Object) (Object) ((um) this).field_c;
                        // monitorenter ((um) this).field_c
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (param1) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var7_int = (int)((((um) this).field_c.d(-42) - -519L) / 520L);
                            if (var7_int != 0) {
                                statePc = 15;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof IOException ? 68 : 70);
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
                            statePc = (stateCaught_3 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if ((long)(6 + 6 * param4) > ((um) this).field_g.d(105)) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = (stateCaught_4 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof IOException ? 68 : 70);
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
                            statePc = (stateCaught_6 instanceof IOException ? 68 : 70);
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
                            statePc = 70;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        return stackIn_8_0 != 0;
                    }
                    case 9: {
                        try {
                            ((um) this).field_g.a((long)(param4 * 6), (byte) 115);
                            ((um) this).field_g.a(ec.field_d, (byte) -87, 0, 6);
                            var7_int = ((255 & ec.field_d[3]) << -529232848) + (ec.field_d[4] << 922809768 & 65280) - -(ec.field_d[5] & 255);
                            if (0 >= var7_int) {
                                statePc = 12;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = (stateCaught_9 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (((long)var7_int ^ -1L) < (((um) this).field_c.d(120) / 520L ^ -1L)) {
                                statePc = 12;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof IOException ? 68 : 70);
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
                            statePc = (stateCaught_12 instanceof IOException ? 68 : 70);
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
                            statePc = 70;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        return stackIn_14_0 != 0;
                    }
                    case 15: {
                        try {
                            ec.field_d[0] = (byte)(param3 >> 934400112);
                            ec.field_d[2] = (byte)param3;
                            if (param2 <= -50) {
                                statePc = 19;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            stackOut_16_0 = 1;
                            stackIn_17_0 = stackOut_16_0;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 68 : 70);
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
                            statePc = 70;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        return stackIn_18_0 != 0;
                    }
                    case 19: {
                        try {
                            ec.field_d[1] = (byte)(param3 >> 574606312);
                            ec.field_d[4] = (byte)(var7_int >> 1816976584);
                            ec.field_d[3] = (byte)(var7_int >> 1732371888);
                            ec.field_d[5] = (byte)var7_int;
                            ((um) this).field_g.a((long)(6 * param4), (byte) 118);
                            ((um) this).field_g.a(6, 0, ec.field_d, (byte) 39);
                            var8 = 0;
                            var9 = 0;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (var8 >= param3) {
                                statePc = 65;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var10 = 0;
                            if (!param1) {
                                statePc = 45;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            ((um) this).field_c.a((long)(520 * var7_int), (byte) 121);
                            if (param4 > 65535) {
                                statePc = 28;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            ((um) this).field_c.a(ec.field_d, (byte) -121, 0, 8);
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof EOFException ? 26 : (stateCaught_24 instanceof IOException ? 68 : 70));
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var14 = (EOFException) (Object) caughtException;
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var12 = (255 & ec.field_d[3]) + (65280 & ec.field_d[2] << 1170636200);
                            var11 = (ec.field_d[1] & 255) + (ec.field_d[0] << 95034216 & 65280);
                            var10 = (ec.field_d[5] << -842232664 & 65280) + ((16711680 & ec.field_d[4] << -1395873008) - -(255 & ec.field_d[6]));
                            var13 = 255 & ec.field_d[7];
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            ((um) this).field_c.a(ec.field_d, (byte) -116, 0, 10);
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof EOFException ? 30 : (stateCaught_28 instanceof IOException ? 68 : 70));
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var14 = (EOFException) (Object) caughtException;
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            var12 = (ec.field_d[5] & 255) + ((ec.field_d[4] & 255) << -252069496);
                            var11 = ((255 & ec.field_d[2]) << 1065690088) + ((ec.field_d[0] & 255) << 1322272728) - (-(ec.field_d[1] << -1925432976 & 16711680) - (ec.field_d[3] & 255));
                            var10 = ((ec.field_d[7] & 255) << -11931800) + (((255 & ec.field_d[6]) << -1945200016) + (255 & ec.field_d[8]));
                            var13 = ec.field_d[9] & 255;
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (var11 != param4) {
                                statePc = 36;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof IOException ? 68 : 70);
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
                            statePc = (stateCaught_33 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (var13 == ((um) this).field_a) {
                                statePc = 39;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof IOException ? 68 : 70);
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
                            statePc = (stateCaught_36 instanceof IOException ? 68 : 70);
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
                            statePc = 70;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        return stackIn_38_0 != 0;
                    }
                    case 39: {
                        try {
                            if ((var10 ^ -1) > -1) {
                                statePc = 42;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (((long)var10 ^ -1L) >= (((um) this).field_c.d(121) / 520L ^ -1L)) {
                                statePc = 45;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof IOException ? 68 : 70);
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
                            statePc = (stateCaught_42 instanceof IOException ? 68 : 70);
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
                            statePc = 70;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        return stackIn_44_0 != 0;
                    }
                    case 45: {
                        try {
                            if (-1 == (var10 ^ -1)) {
                                statePc = 47;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            param1 = false;
                            var10 = (int)((519L + ((um) this).field_c.d(-86)) / 520L);
                            if (var10 == -1) {
                                statePc = 49;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof IOException ? 68 : 70);
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
                            statePc = (stateCaught_49 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            if (var10 == var7_int) {
                                statePc = 52;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            var10++;
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (-513 < -var8 + param3) {
                                statePc = 55;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof IOException ? 68 : 70);
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
                            statePc = (stateCaught_54 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            if ((param4 ^ -1) < -65536) {
                                statePc = 60;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            ec.field_d[3] = (byte)var9;
                            ec.field_d[7] = (byte)((um) this).field_a;
                            ec.field_d[2] = (byte)(var9 >> -429616344);
                            ec.field_d[0] = (byte)(param4 >> 1892335656);
                            ec.field_d[5] = (byte)(var10 >> -1957774968);
                            ec.field_d[1] = (byte)param4;
                            ec.field_d[6] = (byte)var10;
                            ec.field_d[4] = (byte)(var10 >> 130687408);
                            ((um) this).field_c.a((long)(var7_int * 520), (byte) 98);
                            ((um) this).field_c.a(8, 0, ec.field_d, (byte) 42);
                            var11 = param3 - var8;
                            if (512 < var11) {
                                statePc = 58;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof IOException ? 68 : 70);
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
                            statePc = (stateCaught_58 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            ((um) this).field_c.a(var11, var8, param0, (byte) 77);
                            var8 = var8 + var11;
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            ec.field_d[3] = (byte)param4;
                            ec.field_d[7] = (byte)(var10 >> 1031928104);
                            ec.field_d[5] = (byte)var9;
                            ec.field_d[8] = (byte)var10;
                            ec.field_d[9] = (byte)((um) this).field_a;
                            ec.field_d[1] = (byte)(param4 >> 764694512);
                            ec.field_d[6] = (byte)(var10 >> 1093341232);
                            ec.field_d[2] = (byte)(param4 >> 1452919304);
                            ec.field_d[4] = (byte)(var9 >> 604199016);
                            ec.field_d[0] = (byte)(param4 >> 2103313752);
                            ((um) this).field_c.a((long)(520 * var7_int), (byte) 104);
                            ((um) this).field_c.a(10, 0, ec.field_d, (byte) 79);
                            var11 = -var8 + param3;
                            if (-511 > (var11 ^ -1)) {
                                statePc = 62;
                            } else {
                                statePc = 61;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = (stateCaught_61 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            var11 = 510;
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = (stateCaught_62 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            ((um) this).field_c.a(var11, var8, param0, (byte) 122);
                            var8 = var8 + var11;
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = (stateCaught_63 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            var9++;
                            var7_int = var10;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = (stateCaught_64 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            stackOut_65_0 = 1;
                            stackIn_66_0 = stackOut_65_0;
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = (stateCaught_65 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            // monitorexit var6
                            stackOut_66_0 = stackIn_66_0;
                            stackIn_67_0 = stackOut_66_0;
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 70;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        return stackIn_67_0 != 0;
                    }
                    case 68: {
                        try {
                            var7 = (IOException) (Object) caughtException;
                            // monitorexit var6
                            stackOut_68_0 = 0;
                            stackIn_69_0 = stackOut_68_0;
                            statePc = 69;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 70;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        return stackIn_69_0 != 0;
                    }
                    case 70: {
                        try {
                            var15 = caughtException;
                            // monitorexit var6
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 70;
                            continue stateLoop;
                        }
                    }
                    case 71: {
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

    final boolean a(byte param0, byte[] param1, int param2, int param3) {
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
                    if (param0 == -24) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    int discarded$3 = um.a(-93, -47, -15);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var5 = (Object) (Object) ((um) this).field_c;
                    // monitorenter ((um) this).field_c
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        if (-1 < (param2 ^ -1)) {
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
                        if (param2 <= ((um) this).field_b) {
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
                        var6 = this.a(param1, true, param0 ^ 125, param2, param3) ? 1 : 0;
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
                        var6 = this.a(param1, false, -62, param2, param3) ? 1 : 0;
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

    public static void a(int param0) {
        field_h = null;
        if (param0 != 255) {
            um.a(-80);
        }
    }

    public final String toString() {
        return "" + ((um) this).field_a;
    }

    final static int a(int param0, int param1, int param2) {
        if (param2 != 10179) {
            field_e = 24;
        }
        int var3 = param1 >>> -1816913121;
        return (var3 + param1) / param0 - var3;
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
            Object stackIn_15_0 = null;
            Object stackIn_16_0 = null;
            Object stackIn_21_0 = null;
            Object stackIn_22_0 = null;
            Object stackIn_37_0 = null;
            Object stackIn_38_0 = null;
            byte[] stackIn_50_0 = null;
            byte[] stackIn_51_0 = null;
            Object stackIn_53_0 = null;
            Object stackOut_8_0 = null;
            Object stackOut_9_0 = null;
            Object stackOut_14_0 = null;
            Object stackOut_15_0 = null;
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
                        var19 = HostileSpawn.field_I ? 1 : 0;
                        var3 = (Object) (Object) ((um) this).field_c;
                        // monitorenter ((um) this).field_c
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((long)(6 + 6 * param0) ^ -1L) >= (((um) this).field_g.d(-47) ^ -1L)) {
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
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            ((um) this).field_g.a((long)(6 * param0), (byte) 103);
                            ((um) this).field_g.a(ec.field_d, (byte) -39, 0, 6);
                            var4_int = (65280 & ec.field_d[1] << 1725635336) + (16711680 & ec.field_d[0] << -1699601744) + (ec.field_d[2] & 255);
                            var5 = (255 & ec.field_d[5]) + (65280 & ec.field_d[4] << 820555208) + ((255 & ec.field_d[3]) << -967586256);
                            var6 = -13 % ((param1 - -80) / 43);
                            if (-1 >= (var4_int ^ -1)) {
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
                            if (var4_int <= ((um) this).field_b) {
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
                            stackOut_8_0 = null;
                            stackIn_9_0 = stackOut_8_0;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof IOException ? 52 : 54);
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
                            statePc = 54;
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
                            if (((um) this).field_c.d(2) / 520L >= (long)var5) {
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
                            stackOut_14_0 = null;
                            stackIn_15_0 = stackOut_14_0;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof IOException ? 52 : 54);
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
                            statePc = 54;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        return (byte[]) (Object) stackIn_16_0;
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
                            statePc = (stateCaught_17 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (var8 >= var4_int) {
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
                            ((um) this).field_c.a((long)(520 * var5), (byte) 96);
                            var10 = -var8 + var4_int;
                            if (param0 <= 65535) {
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
                            var15 = 10;
                            if (-511 <= (var10 ^ -1)) {
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
                            var10 = 510;
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
                            ((um) this).field_c.a(ec.field_d, (byte) -39, 0, var10 - -var15);
                            var11 = (255 & ec.field_d[3]) + (65280 & ec.field_d[2] << 1861849608) + (((255 & ec.field_d[1]) << -2104603344) + ((ec.field_d[0] & 255) << -1262419944));
                            var12 = (ec.field_d[4] << 156887336 & 65280) + (255 & ec.field_d[5]);
                            var13 = (ec.field_d[8] & 255) + (ec.field_d[7] << 1803122152 & 65280) + (ec.field_d[6] << -202079152 & 16711680);
                            var14 = ec.field_d[9] & 255;
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
                            if (-513 > (var10 ^ -1)) {
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
                            var10 = 512;
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
                            var15 = 8;
                            ((um) this).field_c.a(ec.field_d, (byte) -61, 0, var15 + var10);
                            var12 = ((255 & ec.field_d[2]) << 104746376) - -(ec.field_d[3] & 255);
                            var13 = (ec.field_d[6] & 255) + (((ec.field_d[4] & 255) << 1088954352) - -((ec.field_d[5] & 255) << 65018056));
                            var11 = ((255 & ec.field_d[0]) << 1971946280) - -(255 & ec.field_d[1]);
                            var14 = 255 & ec.field_d[7];
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
                            if (var11 == param0) {
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
                            if (var12 == var9) {
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
                            if (var14 == ((um) this).field_a) {
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
                            if ((var13 ^ -1) <= -1) {
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
                            if (((long)var13 ^ -1L) >= (((um) this).field_c.d(-94) / 520L ^ -1L)) {
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
                            var16 = var15 - -var10;
                            var9++;
                            var17 = var15;
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
                            if (var16 <= var17) {
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
                            var8++;
                            var7[var8] = ec.field_d[var17];
                            var17++;
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
                            var5 = var13;
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
                            stackOut_49_0 = (byte[]) var7;
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
                            var18 = caughtException;
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

    um(int param0, bn param1, bn param2, int param3) {
        ((um) this).field_c = null;
        ((um) this).field_g = null;
        ((um) this).field_b = 65000;
        ((um) this).field_b = param3;
        ((um) this).field_c = param1;
        ((um) this).field_a = param0;
        ((um) this).field_g = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = false;
        field_h = "Confirm Password: ";
        field_f = false;
    }
}
