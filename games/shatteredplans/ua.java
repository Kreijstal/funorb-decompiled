/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ua {
    private int field_e;
    static qr field_f;
    private ej field_a;
    private ej field_b;
    static pf field_d;
    private int field_i;
    static String field_g;
    static String[] field_c;
    static boolean[] field_h;

    private final boolean a(int param0, boolean param1, byte param2, int param3, byte[] param4) {
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
                        var16 = ShatteredPlansClient.field_F ? 1 : 0;
                        var6 = (Object) (Object) ((ua) this).field_b;
                        // monitorenter ((ua) this).field_b
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (param1) {
                                statePc = 5;
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
                            var7_int = (int)((((ua) this).field_b.a((byte) -116) + 519L) / 520L);
                            if (var7_int == 0) {
                                statePc = 4;
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
                            var7_int = 1;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = (stateCaught_4 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if ((((ua) this).field_a.a((byte) -72) ^ -1L) <= ((long)(6 + param3 * 6) ^ -1L)) {
                                statePc = 9;
                            } else {
                                statePc = 6;
                            }
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
                            ((ua) this).field_a.a((byte) 77, (long)(6 * param3));
                            ((ua) this).field_a.a(6, ho.field_i, (byte) -73, 0);
                            var7_int = (255 & ho.field_i[5]) + (((ho.field_i[4] & 255) << 548843656) + ((ho.field_i[3] & 255) << -685411952));
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
                            if (((long)var7_int ^ -1L) < (((ua) this).field_b.a((byte) -89) / 520L ^ -1L)) {
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
                            ho.field_i[4] = (byte)(var7_int >> -700047544);
                            ho.field_i[1] = (byte)(param0 >> 962946472);
                            ho.field_i[5] = (byte)var7_int;
                            ho.field_i[3] = (byte)(var7_int >> -1931884624);
                            ho.field_i[2] = (byte)param0;
                            ho.field_i[0] = (byte)(param0 >> -50735504);
                            ((ua) this).field_a.a((byte) 79, (long)(6 * param3));
                            ((ua) this).field_a.a(-105, 6, 0, ho.field_i);
                            var8 = 0;
                            var9 = 0;
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
                            if (param0 <= var8) {
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
                            var10 = 0;
                            if (param1) {
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
                            ((ua) this).field_b.a((byte) -115, (long)(var7_int * 520));
                            if (-65536 > (param3 ^ -1)) {
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
                            ((ua) this).field_b.a(8, ho.field_i, (byte) -114, 0);
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
                            var14 = (EOFException) (Object) caughtException;
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
                            var13 = 255 & ho.field_i[7];
                            var12 = ((ho.field_i[2] & 255) << 1436791976) + (255 & ho.field_i[3]);
                            var11 = (ho.field_i[1] & 255) + ((ho.field_i[0] & 255) << -465629848);
                            var10 = (ho.field_i[6] & 255) + (16711680 & ho.field_i[4] << 1540612272) - -(ho.field_i[5] << 1841964392 & 65280);
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
                            ((ua) this).field_b.a(10, ho.field_i, (byte) 96, 0);
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
                            var14 = (EOFException) (Object) caughtException;
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
                            var11 = (ho.field_i[3] & 255) + (16711680 & ho.field_i[1] << -259520208) + ((-16777216 & ho.field_i[0] << 243114712) + ((255 & ho.field_i[2]) << -709651192));
                            var12 = (ho.field_i[4] << -1354341208 & 65280) - -(255 & ho.field_i[5]);
                            var10 = (ho.field_i[8] & 255) + ((ho.field_i[7] & 255) << 2065042056) + (16711680 & ho.field_i[6] << 341948944);
                            var13 = ho.field_i[9] & 255;
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
                            if (var11 != param3) {
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
                            if (var12 != var9) {
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
                            if (var13 == ((ua) this).field_i) {
                                statePc = 35;
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
                            statePc = 32;
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
                            if ((var10 ^ -1) > -1) {
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
                            if (((long)var10 ^ -1L) >= (((ua) this).field_b.a((byte) -104) / 520L ^ -1L)) {
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
                            if (-1 == (var10 ^ -1)) {
                                statePc = 43;
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
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            param1 = false;
                            var10 = (int)((519L + ((ua) this).field_b.a((byte) -68)) / 520L);
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
                            if (var10 != var7_int) {
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
                            var10++;
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
                            if (-513 <= (-var8 + param0 ^ -1)) {
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
                            statePc = 51;
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
                            if (param3 <= 65535) {
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
                            ho.field_i[4] = (byte)(var9 >> 584072168);
                            ho.field_i[9] = (byte)((ua) this).field_i;
                            ho.field_i[1] = (byte)(param3 >> 1138839056);
                            ho.field_i[5] = (byte)var9;
                            ho.field_i[7] = (byte)(var10 >> 1179874376);
                            ho.field_i[3] = (byte)param3;
                            ho.field_i[8] = (byte)var10;
                            ho.field_i[6] = (byte)(var10 >> 2087727280);
                            ho.field_i[0] = (byte)(param3 >> -381935176);
                            ho.field_i[2] = (byte)(param3 >> -1085570264);
                            ((ua) this).field_b.a((byte) 64, (long)(var7_int * 520));
                            ((ua) this).field_b.a(-68, 10, 0, ho.field_i);
                            var11 = -var8 + param0;
                            if (-511 <= (var11 ^ -1)) {
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
                            ((ua) this).field_b.a(82, var11, var8, param4);
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
                            ho.field_i[0] = (byte)(param3 >> -800831224);
                            ho.field_i[3] = (byte)var9;
                            ho.field_i[6] = (byte)var10;
                            ho.field_i[2] = (byte)(var9 >> 1069073000);
                            ho.field_i[1] = (byte)param3;
                            ho.field_i[4] = (byte)(var10 >> 332099984);
                            ho.field_i[5] = (byte)(var10 >> 829905224);
                            ho.field_i[7] = (byte)((ua) this).field_i;
                            ((ua) this).field_b.a((byte) 107, (long)(var7_int * 520));
                            ((ua) this).field_b.a(-66, 8, 0, ho.field_i);
                            var11 = -var8 + param0;
                            if (-513 <= (var11 ^ -1)) {
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
                            ((ua) this).field_b.a(101, var11, var8, param4);
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
                            var10 = -3 / ((70 - param2) / 49);
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
            Object stackIn_7_0 = null;
            Object stackIn_8_0 = null;
            Object stackIn_19_0 = null;
            Object stackIn_20_0 = null;
            Object stackIn_46_0 = null;
            Object stackIn_47_0 = null;
            byte[] stackIn_53_0 = null;
            byte[] stackIn_54_0 = null;
            Object stackIn_56_0 = null;
            Object stackOut_2_0 = null;
            Object stackOut_3_0 = null;
            Object stackOut_6_0 = null;
            Object stackOut_7_0 = null;
            Object stackOut_18_0 = null;
            Object stackOut_19_0 = null;
            Object stackOut_45_0 = null;
            Object stackOut_46_0 = null;
            byte[] stackOut_52_0 = null;
            byte[] stackOut_53_0 = null;
            Object stackOut_55_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var18 = ShatteredPlansClient.field_F ? 1 : 0;
                        var3 = (Object) (Object) ((ua) this).field_b;
                        // monitorenter ((ua) this).field_b
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if ((long)(6 + param0 * 6) <= ((ua) this).field_a.a((byte) -110)) {
                                statePc = 5;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof IOException ? 55 : 57);
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
                            statePc = (stateCaught_2 instanceof IOException ? 55 : 57);
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
                            statePc = 57;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        return (byte[]) (Object) stackIn_4_0;
                    }
                    case 5: {
                        try {
                            ((ua) this).field_a.a((byte) -88, (long)(param0 * 6));
                            if (param1 > 57) {
                                statePc = 9;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            stackOut_6_0 = null;
                            stackIn_7_0 = stackOut_6_0;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            // monitorexit var3
                            stackOut_7_0 = stackIn_7_0;
                            stackIn_8_0 = stackOut_7_0;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 57;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        return (byte[]) (Object) stackIn_8_0;
                    }
                    case 9: {
                        try {
                            ((ua) this).field_a.a(6, ho.field_i, (byte) 67, 0);
                            var4_int = (ho.field_i[2] & 255) + ((ho.field_i[0] & 255) << 128320720) + ((ho.field_i[1] & 255) << 787416360);
                            var5 = (255 & ho.field_i[5]) + (ho.field_i[3] << -401995472 & 16711680) + ((255 & ho.field_i[4]) << 892865096);
                            if (var4_int >= 0) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = (stateCaught_9 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (var4_int <= ((ua) this).field_e) {
                                statePc = 15;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if ((var5 ^ -1) < -1) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (((long)var5 ^ -1L) >= (((ua) this).field_b.a((byte) -124) / 520L ^ -1L)) {
                                statePc = 21;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof IOException ? 55 : 57);
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
                            statePc = (stateCaught_18 instanceof IOException ? 55 : 57);
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
                            statePc = 57;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        return (byte[]) (Object) stackIn_20_0;
                    }
                    case 21: {
                        try {
                            var6 = new byte[var4_int];
                            var7 = 0;
                            var8 = 0;
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (var7 >= var4_int) {
                                statePc = 52;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (0 != var5) {
                                statePc = 27;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            ((ua) this).field_b.a((byte) 84, (long)(var5 * 520));
                            var9 = -var7 + var4_int;
                            if ((param0 ^ -1) < -65536) {
                                statePc = 31;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if ((var9 ^ -1) >= -513) {
                                statePc = 30;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof IOException ? 55 : 57);
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
                            statePc = (stateCaught_29 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var14 = 8;
                            ((ua) this).field_b.a(var14 + var9, ho.field_i, (byte) 100, 0);
                            var10 = (255 & ho.field_i[1]) + (65280 & ho.field_i[0] << -440390296);
                            var11 = (ho.field_i[2] << -102441816 & 65280) + (ho.field_i[3] & 255);
                            var13 = ho.field_i[7] & 255;
                            var12 = ((ho.field_i[5] & 255) << 1897761032) + (16711680 & ho.field_i[4] << -1539198192) - -(ho.field_i[6] & 255);
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            var14 = 10;
                            if (var9 <= 510) {
                                statePc = 33;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var9 = 510;
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            ((ua) this).field_b.a(var14 + var9, ho.field_i, (byte) 46, 0);
                            var10 = (ho.field_i[3] & 255) + ((255 & ho.field_i[2]) << 1797718440) + (((ho.field_i[1] & 255) << 1171658992) + (ho.field_i[0] << 942808024 & -16777216));
                            var12 = ((255 & ho.field_i[7]) << -1052526296) + ((255 & ho.field_i[6]) << 554662288) - -(255 & ho.field_i[8]);
                            var13 = ho.field_i[9] & 255;
                            var11 = ((255 & ho.field_i[4]) << 393996648) - -(ho.field_i[5] & 255);
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (var10 == param0) {
                                statePc = 36;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            if (var11 == var8) {
                                statePc = 38;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (((ua) this).field_i == var13) {
                                statePc = 42;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if (-1 >= (var12 ^ -1)) {
                                statePc = 44;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            if (((ua) this).field_b.a((byte) -107) / 520L >= (long)var12) {
                                statePc = 48;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            stackOut_45_0 = null;
                            stackIn_46_0 = stackOut_45_0;
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            // monitorexit var3
                            stackOut_46_0 = stackIn_46_0;
                            stackIn_47_0 = stackOut_46_0;
                            statePc = 47;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 57;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        return (byte[]) (Object) stackIn_47_0;
                    }
                    case 48: {
                        try {
                            var15 = var14 + var9;
                            var8++;
                            var16 = var14;
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            if (var15 <= var16) {
                                statePc = 51;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            var7++;
                            var6[var7] = ho.field_i[var16];
                            var16++;
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            var5 = var12;
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            stackOut_52_0 = (byte[]) var6;
                            stackIn_53_0 = stackOut_52_0;
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            // monitorexit var3
                            stackOut_53_0 = (byte[]) (Object) stackIn_53_0;
                            stackIn_54_0 = stackOut_53_0;
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 57;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        return stackIn_54_0;
                    }
                    case 55: {
                        try {
                            var4 = (IOException) (Object) caughtException;
                            // monitorexit var3
                            stackOut_55_0 = null;
                            stackIn_56_0 = stackOut_55_0;
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 57;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        return (byte[]) (Object) stackIn_56_0;
                    }
                    case 57: {
                        try {
                            var17 = caughtException;
                            // monitorexit var3
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 57;
                            continue stateLoop;
                        }
                    }
                    case 58: {
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
        return "" + ((ua) this).field_i;
    }

    public static void a(int param0) {
        field_h = null;
        field_g = null;
        field_c = null;
        field_f = null;
        field_d = null;
        if (param0 != 4) {
            Object var2 = null;
            int discarded$0 = ua.a((String) null, (String) null, -43);
        }
    }

    final boolean a(int param0, int param1, byte[] param2, int param3) {
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
                    var5 = (Object) (Object) ((ua) this).field_b;
                    // monitorenter ((ua) this).field_b
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (-1 < (param0 ^ -1)) {
                            statePc = 3;
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
                        if (param0 <= ((ua) this).field_e) {
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
                        throw new IllegalArgumentException();
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var6 = this.a(param0, true, (byte) -22, param1, param2) ? 1 : 0;
                        if (param3 == 2) {
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
                        ((ua) this).field_a = null;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
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
                        var6 = this.a(param0, false, (byte) -1, param1, param2) ? 1 : 0;
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

    final static int a(String param0, String param1, int param2) {
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        int var3 = param0.indexOf(param1, param2);
        int var4 = var3;
        while ((var3 ^ -1) != 0) {
            var4 = var3;
            var3 = param0.indexOf(param1, 1 + var4);
        }
        return var4;
    }

    ua(int param0, ej param1, ej param2, int param3) {
        ((ua) this).field_e = 65000;
        ((ua) this).field_a = null;
        ((ua) this).field_b = null;
        ((ua) this).field_a = param2;
        ((ua) this).field_e = param3;
        ((ua) this).field_i = param0;
        ((ua) this).field_b = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "End Tutorial";
        field_d = new pf();
        field_c = new String[]{"No garrisoning, production unified across territories.", "Garrisoning required, separate production per territory."};
    }
}
