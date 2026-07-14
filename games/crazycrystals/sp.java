/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sp {
    static ng field_c;
    private qa field_d;
    private int field_e;
    private qa field_b;
    private int field_g;
    static na field_a;
    static sj field_f;

    private final boolean a(int param0, int param1, byte[] param2, int param3, boolean param4) {
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
                        var16 = CrazyCrystals.field_B;
                        var6 = (Object) (Object) ((sp) this).field_d;
                        // monitorenter ((sp) this).field_d
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (param4) {
                                statePc = 5;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var7_int = (int)((((sp) this).field_d.b(0) - -519L) / 520L);
                            if (var7_int == 0) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = (stateCaught_3 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var7_int = 1;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = (stateCaught_4 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (((long)(6 * param1 - -6) ^ -1L) < (((sp) this).field_b.b(0) ^ -1L)) {
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
                            ((sp) this).field_b.a((long)(param1 * 6), -1);
                            ((sp) this).field_b.a((byte) 106, mf.field_u, 0, 6);
                            var7_int = (16711680 & mf.field_u[3] << -742686992) + ((65280 & mf.field_u[4] << -413110104) + (mf.field_u[5] & 255));
                            if ((var7_int ^ -1) >= -1) {
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
                            if (((long)var7_int ^ -1L) >= (((sp) this).field_d.b(0) / 520L ^ -1L)) {
                                statePc = 16;
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
                            statePc = 13;
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
                            mf.field_u[2] = (byte)param0;
                            mf.field_u[1] = (byte)(param0 >> -1775233080);
                            mf.field_u[5] = (byte)var7_int;
                            mf.field_u[4] = (byte)(var7_int >> 1565858088);
                            mf.field_u[3] = (byte)(var7_int >> -1227899632);
                            mf.field_u[0] = (byte)(param0 >> 1711114064);
                            ((sp) this).field_b.a((long)(6 * param1), -1);
                            ((sp) this).field_b.a(123, mf.field_u, 0, 6);
                            var8 = 0;
                            if (param3 > 111) {
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
                            field_a = null;
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
                            if (param0 <= var8) {
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
                            if (!param4) {
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
                            ((sp) this).field_d.a((long)(520 * var7_int), -1);
                            if (-65536 <= (param1 ^ -1)) {
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
                            ((sp) this).field_d.a((byte) 106, mf.field_u, 0, 10);
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
                            var10 = ((255 & mf.field_u[7]) << 107332424) + (((255 & mf.field_u[6]) << -178619568) - -(255 & mf.field_u[8]));
                            var12 = (mf.field_u[5] & 255) + ((255 & mf.field_u[4]) << -1149990680);
                            var13 = 255 & mf.field_u[9];
                            var11 = (mf.field_u[2] << -1951568472 & 65280) + ((-16777216 & mf.field_u[0] << 960159352) + ((mf.field_u[1] & 255) << 1327807312)) + (mf.field_u[3] & 255);
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
                            ((sp) this).field_d.a((byte) 106, mf.field_u, 0, 8);
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
                            var10 = ((mf.field_u[4] & 255) << 1292281264) + (mf.field_u[5] << -1611011032 & 65280) + (255 & mf.field_u[6]);
                            var12 = ((mf.field_u[2] & 255) << 340930600) - -(mf.field_u[3] & 255);
                            var13 = mf.field_u[7] & 255;
                            var11 = ((255 & mf.field_u[0]) << 939091784) - -(mf.field_u[1] & 255);
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
                            if (param1 != var11) {
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
                            if (((sp) this).field_e != var13) {
                                statePc = 35;
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
                            statePc = 38;
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
                            if (((sp) this).field_d.b(0) / 520L >= (long)var10) {
                                statePc = 44;
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
                            statePc = 41;
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
                            if (var10 != 0) {
                                statePc = 50;
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
                            param4 = false;
                            var10 = (int)((519L + ((sp) this).field_d.b(0)) / 520L);
                            if (var10 != 0) {
                                statePc = 47;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof IOException ? 65 : 67);
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
                            statePc = (stateCaught_46 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            if (var10 == var7_int) {
                                statePc = 49;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof IOException ? 65 : 67);
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
                            statePc = (stateCaught_49 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            if (512 >= param0 + -var8) {
                                statePc = 52;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            var10 = 0;
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (param1 > 65535) {
                                statePc = 57;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            mf.field_u[2] = (byte)(var9 >> -984878680);
                            mf.field_u[5] = (byte)(var10 >> -1197842904);
                            mf.field_u[0] = (byte)(param1 >> 52614984);
                            mf.field_u[6] = (byte)var10;
                            mf.field_u[3] = (byte)var9;
                            mf.field_u[7] = (byte)((sp) this).field_e;
                            mf.field_u[1] = (byte)param1;
                            mf.field_u[4] = (byte)(var10 >> -965320496);
                            ((sp) this).field_d.a((long)(520 * var7_int), -1);
                            ((sp) this).field_d.a(122, mf.field_u, 0, 8);
                            var11 = param0 - var8;
                            if (var11 <= 512) {
                                statePc = 56;
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
                            var11 = 512;
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            ((sp) this).field_d.a(123, param2, var8, var11);
                            var8 = var8 + var11;
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            mf.field_u[3] = (byte)param1;
                            mf.field_u[4] = (byte)(var9 >> -535926008);
                            mf.field_u[0] = (byte)(param1 >> 575388664);
                            mf.field_u[9] = (byte)((sp) this).field_e;
                            mf.field_u[6] = (byte)(var10 >> 2027704848);
                            mf.field_u[7] = (byte)(var10 >> -1577040536);
                            mf.field_u[2] = (byte)(param1 >> 914050952);
                            mf.field_u[8] = (byte)var10;
                            mf.field_u[1] = (byte)(param1 >> -1490354480);
                            mf.field_u[5] = (byte)var9;
                            ((sp) this).field_d.a((long)(520 * var7_int), -1);
                            ((sp) this).field_d.a(122, mf.field_u, 0, 10);
                            var11 = param0 - var8;
                            if (var11 > 510) {
                                statePc = 59;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            var11 = 510;
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
                            ((sp) this).field_d.a(125, param2, var8, var11);
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
        return "" + ((sp) this).field_e;
    }

    public static void a(byte param0) {
        field_f = null;
        field_a = null;
        if (param0 != 113) {
            field_c = null;
        }
        field_c = null;
    }

    final boolean a(int param0, byte[] param1, byte param2, int param3) {
        Object var5 = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = (Object) (Object) ((sp) this).field_d;
                    // monitorenter ((sp) this).field_d
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if ((param0 ^ -1) > -1) {
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
                        if (param0 <= ((sp) this).field_g) {
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
                        if (param2 == 101) {
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
                        field_f = null;
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
                        var6 = this.a(param0, param3, param1, 112, true) ? 1 : 0;
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
                        var6 = this.a(param0, param3, param1, 126, false) ? 1 : 0;
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

    final byte[] a(boolean param0, int param1) {
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
            Object stackIn_9_0 = null;
            Object stackIn_10_0 = null;
            Object stackIn_23_0 = null;
            Object stackIn_24_0 = null;
            Object stackIn_39_0 = null;
            Object stackIn_40_0 = null;
            byte[] stackIn_52_0 = null;
            byte[] stackIn_53_0 = null;
            Object stackIn_55_0 = null;
            Object stackOut_8_0 = null;
            Object stackOut_9_0 = null;
            Object stackOut_22_0 = null;
            Object stackOut_23_0 = null;
            Object stackOut_38_0 = null;
            Object stackOut_39_0 = null;
            byte[] stackOut_51_0 = null;
            byte[] stackOut_52_0 = null;
            Object stackOut_54_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var18 = CrazyCrystals.field_B;
                        var3 = (Object) (Object) ((sp) this).field_d;
                        // monitorenter ((sp) this).field_d
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((sp) this).field_b.b(0) >= (long)(6 * param1 + 6)) {
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
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            ((sp) this).field_b.a((long)(param1 * 6), -1);
                            ((sp) this).field_b.a((byte) 106, mf.field_u, 0, 6);
                            var4_int = (255 & mf.field_u[2]) + ((65280 & mf.field_u[1] << 46729832) + ((255 & mf.field_u[0]) << 790693200));
                            var5 = (255 & mf.field_u[5]) + ((mf.field_u[4] & 255) << -397509304) + ((mf.field_u[3] & 255) << -2118395600);
                            if (var4_int >= 0) {
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
                            if (((sp) this).field_g >= var4_int) {
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
                            if (var5 > 0) {
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
                            if (((long)var5 ^ -1L) >= (((sp) this).field_d.b(0) / 520L ^ -1L)) {
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
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (!param0) {
                                statePc = 19;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            field_f = null;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof IOException ? 54 : 56);
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
                            if (var7 >= var4_int) {
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
                            if (var5 != 0) {
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
                            stackOut_22_0 = null;
                            stackIn_23_0 = stackOut_22_0;
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 54 : 56);
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
                            statePc = 56;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        return (byte[]) (Object) stackIn_24_0;
                    }
                    case 25: {
                        try {
                            ((sp) this).field_d.a((long)(var5 * 520), -1);
                            var9 = var4_int - var7;
                            if ((param1 ^ -1) >= -65536) {
                                statePc = 29;
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
                            if (510 >= var9) {
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
                            var9 = 510;
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var14 = 10;
                            ((sp) this).field_d.a((byte) 106, mf.field_u, 0, var9 - -var14);
                            var10 = ((255 & mf.field_u[2]) << 746298728) + (((mf.field_u[0] & 255) << 873205432) - -(16711680 & mf.field_u[1] << 1232728240)) + (255 & mf.field_u[3]);
                            var12 = (255 & mf.field_u[8]) + (((255 & mf.field_u[6]) << 601678384) + (65280 & mf.field_u[7] << -490639608));
                            var11 = (65280 & mf.field_u[4] << -98522328) + (mf.field_u[5] & 255);
                            var13 = 255 & mf.field_u[9];
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var14 = 8;
                            if (var9 > 512) {
                                statePc = 31;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            statePc = 32;
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
                            ((sp) this).field_d.a((byte) 106, mf.field_u, 0, var9 + var14);
                            var12 = (mf.field_u[5] << 1075548712 & 65280) + ((16711680 & mf.field_u[4] << -406590864) - -(255 & mf.field_u[6]));
                            var10 = (mf.field_u[1] & 255) + (65280 & mf.field_u[0] << -1575642872);
                            var13 = mf.field_u[7] & 255;
                            var11 = (255 & mf.field_u[3]) + ((255 & mf.field_u[2]) << 196757256);
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
                            if (var10 == param1) {
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
                            if (var11 == var8) {
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
                            if (var13 == ((sp) this).field_e) {
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
                            if (-1 >= (var12 ^ -1)) {
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
                            if ((((sp) this).field_d.b(0) / 520L ^ -1L) <= ((long)var12 ^ -1L)) {
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
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            var15 = var9 + var14;
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
                            if (var16 >= var15) {
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
                            var6[var7] = mf.field_u[var16];
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
                            var5 = var12;
                            var8++;
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

    sp(int param0, qa param1, qa param2, int param3) {
        ((sp) this).field_d = null;
        ((sp) this).field_b = null;
        ((sp) this).field_g = 65000;
        ((sp) this).field_d = param1;
        ((sp) this).field_g = param3;
        ((sp) this).field_b = param2;
        ((sp) this).field_e = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new ng(256);
        field_f = new sj(15, 0, 1, 0);
    }
}
