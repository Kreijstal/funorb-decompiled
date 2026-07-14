/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fo {
    private int field_d;
    private int field_a;
    private gdb field_c;
    private gdb field_b;

    private final boolean a(byte[] param0, byte param1, boolean param2, int param3, int param4) {
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
            int stackIn_5_0 = 0;
            int stackIn_6_0 = 0;
            int stackIn_11_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_35_0 = 0;
            int stackIn_40_0 = 0;
            int stackIn_41_0 = 0;
            int stackIn_63_0 = 0;
            int stackIn_64_0 = 0;
            int stackIn_68_0 = 0;
            int stackOut_4_0 = 0;
            int stackOut_5_0 = 0;
            int stackOut_10_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_34_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_62_0 = 0;
            int stackOut_63_0 = 0;
            int stackOut_67_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = VoidHunters.field_G;
                        var6 = (Object) (Object) ((fo) this).field_c;
                        // monitorenter ((fo) this).field_c
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
                            statePc = (stateCaught_1 instanceof IOException ? 65 : 69);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (((long)(param4 * 6 - -6) ^ -1L) < (((fo) this).field_b.b(0) ^ -1L)) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof IOException ? 65 : 69);
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = (stateCaught_3 instanceof IOException ? 65 : 69);
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
                            statePc = (stateCaught_4 instanceof IOException ? 65 : 69);
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
                            statePc = 69;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        return stackIn_6_0 != 0;
                    }
                    case 7: {
                        try {
                            ((fo) this).field_b.a(0, (long)(6 * param4));
                            ((fo) this).field_b.a(hbb.field_N, 6, 0, -30541);
                            var7_int = (hbb.field_N[5] & 255) + (65280 & hbb.field_N[4] << -1412498968) + ((255 & hbb.field_N[3]) << 1219647824);
                            if ((var7_int ^ -1) >= -1) {
                                statePc = 10;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof IOException ? 65 : 69);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if ((((fo) this).field_c.b(0) / 520L ^ -1L) <= ((long)var7_int ^ -1L)) {
                                statePc = 16;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof IOException ? 65 : 69);
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = (stateCaught_9 instanceof IOException ? 65 : 69);
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
                            statePc = (stateCaught_10 instanceof IOException ? 65 : 69);
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
                            statePc = 69;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        return stackIn_12_0 != 0;
                    }
                    case 13: {
                        try {
                            var7_int = (int)((((fo) this).field_c.b(0) + 519L) / 520L);
                            if (var7_int == 0) {
                                statePc = 15;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof IOException ? 65 : 69);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof IOException ? 65 : 69);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            var7_int = 1;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 65 : 69);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            hbb.field_N[0] = (byte)(param3 >> -596658800);
                            hbb.field_N[5] = (byte)var7_int;
                            hbb.field_N[2] = (byte)param3;
                            hbb.field_N[1] = (byte)(param3 >> 1526335784);
                            hbb.field_N[3] = (byte)(var7_int >> 969678288);
                            hbb.field_N[4] = (byte)(var7_int >> 1750385640);
                            ((fo) this).field_b.a(0, (long)(param4 * 6));
                            ((fo) this).field_b.a(6, 0, (byte) -117, hbb.field_N);
                            var8 = 0;
                            var9 = 0;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 65 : 69);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (var8 >= param3) {
                                statePc = 62;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof IOException ? 65 : 69);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var10 = 0;
                            if (!param2) {
                                statePc = 42;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof IOException ? 65 : 69);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            ((fo) this).field_c.a(0, (long)(520 * var7_int));
                            if (param4 <= 65535) {
                                statePc = 25;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 65 : 69);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 65 : 69);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            ((fo) this).field_c.a(hbb.field_N, 10, 0, -30541);
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof EOFException ? 23 : (stateCaught_21 instanceof IOException ? 65 : 69));
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 65 : 69);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var14 = (EOFException) (Object) caughtException;
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 65 : 69);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var13 = hbb.field_N[9] & 255;
                            var12 = (255 & hbb.field_N[5]) + (hbb.field_N[4] << 874748680 & 65280);
                            var10 = (hbb.field_N[6] << -1648170000 & 16711680) - (-(65280 & hbb.field_N[7] << -1281157496) - (hbb.field_N[8] & 255));
                            var11 = (hbb.field_N[3] & 255) + ((255 & hbb.field_N[1]) << -1636440944) + (hbb.field_N[0] << -740345512 & -16777216) + ((hbb.field_N[2] & 255) << 2065384520);
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 65 : 69);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            ((fo) this).field_c.a(hbb.field_N, 8, 0, -30541);
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof EOFException ? 27 : (stateCaught_25 instanceof IOException ? 65 : 69));
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 65 : 69);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var14 = (EOFException) (Object) caughtException;
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 65 : 69);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var11 = ((hbb.field_N[0] & 255) << 402550120) + (255 & hbb.field_N[1]);
                            var10 = (255 & hbb.field_N[6]) + ((hbb.field_N[4] << -25204880 & 16711680) - -(hbb.field_N[5] << -2145200504 & 65280));
                            var13 = 255 & hbb.field_N[7];
                            var12 = ((hbb.field_N[2] & 255) << 168139240) - -(255 & hbb.field_N[3]);
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof IOException ? 65 : 69);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (var11 != param4) {
                                statePc = 33;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof IOException ? 65 : 69);
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
                            statePc = (stateCaught_30 instanceof IOException ? 65 : 69);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (var13 != ((fo) this).field_d) {
                                statePc = 33;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 65 : 69);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof IOException ? 65 : 69);
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
                            statePc = (stateCaught_33 instanceof IOException ? 65 : 69);
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
                            statePc = 69;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        return stackIn_35_0 != 0;
                    }
                    case 36: {
                        try {
                            if (-1 < (var10 ^ -1)) {
                                statePc = 39;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof IOException ? 65 : 69);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (((fo) this).field_c.b(0) / 520L >= (long)var10) {
                                statePc = 42;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof IOException ? 65 : 69);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof IOException ? 65 : 69);
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
                            statePc = (stateCaught_39 instanceof IOException ? 65 : 69);
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
                            statePc = 69;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        return stackIn_41_0 != 0;
                    }
                    case 42: {
                        try {
                            if (0 == var10) {
                                statePc = 44;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof IOException ? 65 : 69);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof IOException ? 65 : 69);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            var10 = (int)((519L + ((fo) this).field_c.b(0)) / 520L);
                            param2 = false;
                            if (0 == var10) {
                                statePc = 46;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof IOException ? 65 : 69);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            statePc = 47;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof IOException ? 65 : 69);
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
                            statePc = (stateCaught_46 instanceof IOException ? 65 : 69);
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
                            statePc = (stateCaught_47 instanceof IOException ? 65 : 69);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof IOException ? 65 : 69);
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
                            statePc = (stateCaught_49 instanceof IOException ? 65 : 69);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            if (512 < -var8 + param3) {
                                statePc = 52;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof IOException ? 65 : 69);
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
                            statePc = (stateCaught_51 instanceof IOException ? 65 : 69);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            if (-65536 > (param4 ^ -1)) {
                                statePc = 57;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof IOException ? 65 : 69);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            hbb.field_N[3] = (byte)var9;
                            hbb.field_N[6] = (byte)var10;
                            hbb.field_N[0] = (byte)(param4 >> -1561211320);
                            hbb.field_N[4] = (byte)(var10 >> 190713008);
                            hbb.field_N[5] = (byte)(var10 >> -364935352);
                            hbb.field_N[7] = (byte)((fo) this).field_d;
                            hbb.field_N[1] = (byte)param4;
                            hbb.field_N[2] = (byte)(var9 >> -928009048);
                            ((fo) this).field_c.a(0, (long)(520 * var7_int));
                            ((fo) this).field_c.a(8, 0, (byte) -114, hbb.field_N);
                            var11 = param3 - var8;
                            if (var11 > 512) {
                                statePc = 55;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof IOException ? 65 : 69);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof IOException ? 65 : 69);
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
                            statePc = (stateCaught_55 instanceof IOException ? 65 : 69);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            ((fo) this).field_c.a(var11, var8, (byte) -102, param0);
                            var8 = var8 + var11;
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof IOException ? 65 : 69);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            hbb.field_N[8] = (byte)var10;
                            hbb.field_N[7] = (byte)(var10 >> 1839493608);
                            hbb.field_N[5] = (byte)var9;
                            hbb.field_N[0] = (byte)(param4 >> -705351144);
                            hbb.field_N[6] = (byte)(var10 >> 829427952);
                            hbb.field_N[9] = (byte)((fo) this).field_d;
                            hbb.field_N[4] = (byte)(var9 >> 1011082056);
                            hbb.field_N[1] = (byte)(param4 >> 1560843760);
                            hbb.field_N[2] = (byte)(param4 >> 597762632);
                            hbb.field_N[3] = (byte)param4;
                            ((fo) this).field_c.a(0, (long)(var7_int * 520));
                            ((fo) this).field_c.a(10, 0, (byte) -120, hbb.field_N);
                            var11 = -var8 + param3;
                            if (var11 > 510) {
                                statePc = 59;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof IOException ? 65 : 69);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof IOException ? 65 : 69);
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
                            statePc = (stateCaught_59 instanceof IOException ? 65 : 69);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            ((fo) this).field_c.a(var11, var8, (byte) -106, param0);
                            var8 = var8 + var11;
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof IOException ? 65 : 69);
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            var7_int = var10;
                            var9++;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = (stateCaught_61 instanceof IOException ? 65 : 69);
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
                            statePc = (stateCaught_62 instanceof IOException ? 65 : 69);
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
                            statePc = 69;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        return stackIn_64_0 != 0;
                    }
                    case 65: {
                        try {
                            var7 = (IOException) (Object) caughtException;
                            if (param1 <= -62) {
                                statePc = 67;
                            } else {
                                statePc = 66;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 69;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            ((fo) this).field_a = 31;
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 69;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
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

    final boolean a(int param0, int param1, byte[] param2, int param3) {
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
                    var5 = (Object) (Object) ((fo) this).field_c;
                    // monitorenter ((fo) this).field_c
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (0 > param3) {
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
                        if (param3 <= ((fo) this).field_a) {
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
                        if (param1 == 520) {
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
                        byte[] discarded$3 = ((fo) this).a((byte) -30, -43);
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
                        var6 = this.a(param2, (byte) -93, true, param3, param0) ? 1 : 0;
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
                        var6 = this.a(param2, (byte) -112, false, param3, param0) ? 1 : 0;
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

    public final String toString() {
        return "" + ((fo) this).field_d;
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
            Object stackIn_19_0 = null;
            Object stackIn_20_0 = null;
            byte[] stackIn_54_0 = null;
            byte[] stackIn_55_0 = null;
            Object stackIn_57_0 = null;
            Object stackOut_2_0 = null;
            Object stackOut_3_0 = null;
            Object stackOut_18_0 = null;
            Object stackOut_19_0 = null;
            byte[] stackOut_53_0 = null;
            byte[] stackOut_54_0 = null;
            Object stackOut_56_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var18 = VoidHunters.field_G;
                        var3 = (Object) (Object) ((fo) this).field_c;
                        // monitorenter ((fo) this).field_c
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((long)(6 + param1 * 6) ^ -1L) >= (((fo) this).field_b.b(0) ^ -1L)) {
                                statePc = 5;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof IOException ? 56 : 58);
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
                            statePc = (stateCaught_2 instanceof IOException ? 56 : 58);
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
                            statePc = 58;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        return (byte[]) (Object) stackIn_4_0;
                    }
                    case 5: {
                        try {
                            ((fo) this).field_b.a(0, (long)(6 * param1));
                            ((fo) this).field_b.a(hbb.field_N, 6, 0, -30541);
                            var4_int = (255 & hbb.field_N[2]) + (((255 & hbb.field_N[0]) << 1930703216) + ((255 & hbb.field_N[1]) << -191740248));
                            var5 = (hbb.field_N[3] << -13928048 & 16711680) - -(hbb.field_N[4] << 467446472 & 65280) + (hbb.field_N[5] & 255);
                            if (-1 >= (var4_int ^ -1)) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (((fo) this).field_a >= var4_int) {
                                statePc = 11;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
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
                            statePc = (stateCaught_11 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if ((((fo) this).field_c.b(0) / 520L ^ -1L) <= ((long)var5 ^ -1L)) {
                                statePc = 17;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var6 = new byte[var4_int];
                            if (param0 > 13) {
                                statePc = 21;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            stackOut_18_0 = null;
                            stackIn_19_0 = stackOut_18_0;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            // monitorexit var3
                            stackOut_19_0 = stackIn_19_0;
                            stackIn_20_0 = stackOut_19_0;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 58;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        return (byte[]) (Object) stackIn_20_0;
                    }
                    case 21: {
                        try {
                            var7 = 0;
                            var8 = 0;
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (var7 >= var4_int) {
                                statePc = 53;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (var5 != 0) {
                                statePc = 27;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            ((fo) this).field_c.a(0, (long)(var5 * 520));
                            var9 = var4_int - var7;
                            if (65535 < param1) {
                                statePc = 31;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var14 = 8;
                            if (512 >= var9) {
                                statePc = 30;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof IOException ? 56 : 58);
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
                            statePc = (stateCaught_29 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            ((fo) this).field_c.a(hbb.field_N, var14 + var9, 0, -30541);
                            var13 = hbb.field_N[7] & 255;
                            var11 = (255 & hbb.field_N[3]) + ((hbb.field_N[2] & 255) << 1292554472);
                            var12 = (255 & hbb.field_N[6]) + ((255 & hbb.field_N[4]) << -769529200) - -(65280 & hbb.field_N[5] << 1945809128);
                            var10 = (hbb.field_N[1] & 255) + (65280 & hbb.field_N[0] << 1656787752);
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            var14 = 10;
                            if (var9 > 510) {
                                statePc = 33;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            var9 = 510;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            ((fo) this).field_c.a(hbb.field_N, var9 - -var14, 0, -30541);
                            var10 = (255 & hbb.field_N[3]) + (((hbb.field_N[2] & 255) << -200488312) + ((hbb.field_N[0] & 255) << 60179800) - -((255 & hbb.field_N[1]) << 809245776));
                            var12 = ((hbb.field_N[7] & 255) << 386416232) + (16711680 & hbb.field_N[6] << -1506139760) - -(hbb.field_N[8] & 255);
                            var13 = hbb.field_N[9] & 255;
                            var11 = (255 & hbb.field_N[5]) + (65280 & hbb.field_N[4] << -1115937048);
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (param1 == var10) {
                                statePc = 37;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (var8 == var11) {
                                statePc = 39;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if (((fo) this).field_d == var13) {
                                statePc = 43;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            if ((var12 ^ -1) <= -1) {
                                statePc = 45;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            if (((fo) this).field_c.b(0) / 520L >= (long)var12) {
                                statePc = 49;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            var15 = var14 + var9;
                            var5 = var12;
                            var16 = var14;
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            if (var15 <= var16) {
                                statePc = 52;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            var7++;
                            var6[var7] = hbb.field_N[var16];
                            var16++;
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            var8++;
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            stackOut_53_0 = (byte[]) var6;
                            stackIn_54_0 = stackOut_53_0;
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            // monitorexit var3
                            stackOut_54_0 = (byte[]) (Object) stackIn_54_0;
                            stackIn_55_0 = stackOut_54_0;
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 58;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        return stackIn_55_0;
                    }
                    case 56: {
                        try {
                            var4 = (IOException) (Object) caughtException;
                            // monitorexit var3
                            stackOut_56_0 = null;
                            stackIn_57_0 = stackOut_56_0;
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 58;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        return (byte[]) (Object) stackIn_57_0;
                    }
                    case 58: {
                        try {
                            var17 = caughtException;
                            // monitorexit var3
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 58;
                            continue stateLoop;
                        }
                    }
                    case 59: {
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

    fo(int param0, gdb param1, gdb param2, int param3) {
        ((fo) this).field_a = 65000;
        ((fo) this).field_c = null;
        ((fo) this).field_b = null;
        ((fo) this).field_d = param0;
        ((fo) this).field_a = param3;
        ((fo) this).field_b = param2;
        ((fo) this).field_c = param1;
    }

    static {
    }
}
