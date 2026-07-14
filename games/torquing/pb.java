/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pb {
    private int field_a;
    private o field_d;
    static int field_e;
    static String field_c;
    private int field_b;
    private o field_f;
    static String field_g;

    public final String toString() {
        return "" + ((pb) this).field_a;
    }

    private final boolean a(boolean param0, int param1, byte[] param2, byte param3, int param4) {
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
            int stackIn_6_0 = 0;
            int stackIn_7_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_13_0 = 0;
            int stackIn_32_0 = 0;
            int stackIn_33_0 = 0;
            int stackIn_38_0 = 0;
            int stackIn_39_0 = 0;
            int stackIn_59_0 = 0;
            int stackIn_60_0 = 0;
            int stackIn_62_0 = 0;
            int stackOut_5_0 = 0;
            int stackOut_6_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_12_0 = 0;
            int stackOut_31_0 = 0;
            int stackOut_32_0 = 0;
            int stackOut_37_0 = 0;
            int stackOut_38_0 = 0;
            int stackOut_58_0 = 0;
            int stackOut_59_0 = 0;
            int stackOut_61_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var17 = Torquing.field_u;
                        var6 = (Object) (Object) ((pb) this).field_d;
                        // monitorenter ((pb) this).field_d
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (param0) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var7_int = (int)((519L + ((pb) this).field_d.b(true)) / 520L);
                            if (0 != var7_int) {
                                statePc = 14;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var7_int = 1;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = (stateCaught_3 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (((pb) this).field_f.b(true) >= (long)(6 + 6 * param1)) {
                                statePc = 8;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = (stateCaught_4 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            stackOut_5_0 = 0;
                            stackIn_6_0 = stackOut_5_0;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            // monitorexit var6
                            stackOut_6_0 = stackIn_6_0;
                            stackIn_7_0 = stackOut_6_0;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        return stackIn_7_0 != 0;
                    }
                    case 8: {
                        try {
                            ((pb) this).field_f.a(false, (long)(6 * param1));
                            ((pb) this).field_f.a(0, aa.field_X, 6, -80);
                            var7_int = (aa.field_X[3] << 312276432 & 16711680) + (aa.field_X[4] << 231526056 & 65280) - -(255 & aa.field_X[5]);
                            if (-1 <= (var7_int ^ -1)) {
                                statePc = 11;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if ((((pb) this).field_d.b(true) / 520L ^ -1L) <= ((long)var7_int ^ -1L)) {
                                statePc = 14;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = (stateCaught_9 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            stackOut_11_0 = 0;
                            stackIn_12_0 = stackOut_11_0;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            // monitorexit var6
                            stackOut_12_0 = stackIn_12_0;
                            stackIn_13_0 = stackOut_12_0;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        return stackIn_13_0 != 0;
                    }
                    case 14: {
                        try {
                            aa.field_X[0] = (byte)(param4 >> -1446502544);
                            aa.field_X[1] = (byte)(param4 >> -1978744280);
                            aa.field_X[2] = (byte)param4;
                            aa.field_X[3] = (byte)(var7_int >> 187571792);
                            aa.field_X[4] = (byte)(var7_int >> -1022605624);
                            aa.field_X[5] = (byte)var7_int;
                            ((pb) this).field_f.a(false, (long)(6 * param1));
                            ((pb) this).field_f.a(-1, 6, 0, aa.field_X);
                            var9 = 120 % ((-33 - param3) / 62);
                            var8 = 0;
                            var10 = 0;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (param4 <= var8) {
                                statePc = 58;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            var11 = 0;
                            if (param0) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            ((pb) this).field_d.a(false, (long)(var7_int * 520));
                            if (65535 >= param1) {
                                statePc = 23;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            ((pb) this).field_d.a(0, aa.field_X, 10, -89);
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof EOFException ? 21 : (stateCaught_19 instanceof IOException ? 61 : 63));
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var15 = (EOFException) (Object) caughtException;
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var11 = (aa.field_X[7] << 886533768 & 65280) + ((aa.field_X[6] & 255) << 637079696) + (255 & aa.field_X[8]);
                            var12 = (255 & aa.field_X[3]) + ((65280 & aa.field_X[2] << -1699596984) + ((aa.field_X[0] & 255) << -1048076936)) + ((aa.field_X[1] & 255) << -1176723248);
                            var14 = aa.field_X[9] & 255;
                            var13 = (aa.field_X[4] << 1940400968 & 65280) - -(255 & aa.field_X[5]);
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            ((pb) this).field_d.a(0, aa.field_X, 8, -108);
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof EOFException ? 25 : (stateCaught_23 instanceof IOException ? 61 : 63));
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var15 = (EOFException) (Object) caughtException;
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var11 = (255 & aa.field_X[6]) + (65280 & aa.field_X[5] << -1255839736) + ((255 & aa.field_X[4]) << -53827344);
                            var14 = aa.field_X[7] & 255;
                            var12 = (aa.field_X[1] & 255) + (65280 & aa.field_X[0] << -1145538424);
                            var13 = (255 & aa.field_X[3]) + ((aa.field_X[2] & 255) << 1293577096);
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (var12 != param1) {
                                statePc = 31;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (var13 != var10) {
                                statePc = 31;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (var14 == ((pb) this).field_a) {
                                statePc = 34;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof IOException ? 61 : 63);
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
                            statePc = (stateCaught_31 instanceof IOException ? 61 : 63);
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
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        return stackIn_33_0 != 0;
                    }
                    case 34: {
                        try {
                            if (-1 < (var11 ^ -1)) {
                                statePc = 37;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (((long)var11 ^ -1L) >= (((pb) this).field_d.b(true) / 520L ^ -1L)) {
                                statePc = 40;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof IOException ? 61 : 63);
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
                            statePc = (stateCaught_37 instanceof IOException ? 61 : 63);
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
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        return stackIn_39_0 != 0;
                    }
                    case 40: {
                        try {
                            if (var11 != 0) {
                                statePc = 46;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            param0 = false;
                            var11 = (int)((((pb) this).field_d.b(true) - -519L) / 520L);
                            if (0 == var11) {
                                statePc = 43;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            var11++;
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            if (var7_int != var11) {
                                statePc = 46;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            var11++;
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if (512 < param4 + -var8) {
                                statePc = 48;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            var11 = 0;
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if (-65536 <= (param1 ^ -1)) {
                                statePc = 53;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            aa.field_X[5] = (byte)var10;
                            aa.field_X[8] = (byte)var11;
                            aa.field_X[4] = (byte)(var10 >> 1239034312);
                            aa.field_X[1] = (byte)(param1 >> 1714449712);
                            aa.field_X[9] = (byte)((pb) this).field_a;
                            aa.field_X[0] = (byte)(param1 >> -667863592);
                            aa.field_X[7] = (byte)(var11 >> -460186136);
                            aa.field_X[6] = (byte)(var11 >> -989521872);
                            aa.field_X[3] = (byte)param1;
                            aa.field_X[2] = (byte)(param1 >> 1134286248);
                            ((pb) this).field_d.a(false, (long)(520 * var7_int));
                            ((pb) this).field_d.a(-1, 10, 0, aa.field_X);
                            var12 = param4 + -var8;
                            if ((var12 ^ -1) < -511) {
                                statePc = 51;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            var12 = 510;
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            ((pb) this).field_d.a(-1, var12, var8, param2);
                            var8 = var8 + var12;
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            aa.field_X[6] = (byte)var11;
                            aa.field_X[0] = (byte)(param1 >> 546197000);
                            aa.field_X[2] = (byte)(var10 >> 777522120);
                            aa.field_X[3] = (byte)var10;
                            aa.field_X[1] = (byte)param1;
                            aa.field_X[5] = (byte)(var11 >> -1223753400);
                            aa.field_X[4] = (byte)(var11 >> 1921631856);
                            aa.field_X[7] = (byte)((pb) this).field_a;
                            ((pb) this).field_d.a(false, (long)(var7_int * 520));
                            ((pb) this).field_d.a(-1, 8, 0, aa.field_X);
                            var12 = -var8 + param4;
                            if (512 < var12) {
                                statePc = 55;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            var12 = 512;
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            ((pb) this).field_d.a(-1, var12, var8, param2);
                            var8 = var8 + var12;
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            var10++;
                            var7_int = var11;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            stackOut_58_0 = 1;
                            stackIn_59_0 = stackOut_58_0;
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            // monitorexit var6
                            stackOut_59_0 = stackIn_59_0;
                            stackIn_60_0 = stackOut_59_0;
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        return stackIn_60_0 != 0;
                    }
                    case 61: {
                        try {
                            var7 = (IOException) (Object) caughtException;
                            // monitorexit var6
                            stackOut_61_0 = 0;
                            stackIn_62_0 = stackOut_61_0;
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        return stackIn_62_0 != 0;
                    }
                    case 63: {
                        try {
                            var16 = caughtException;
                            // monitorexit var6
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 64: {
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

    public static void a(boolean param0) {
        field_g = null;
        if (param0) {
            return;
        }
        field_c = null;
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
            Object stackIn_7_0 = null;
            Object stackIn_8_0 = null;
            Object stackIn_25_0 = null;
            Object stackIn_26_0 = null;
            byte[] stackIn_54_0 = null;
            byte[] stackIn_55_0 = null;
            Object stackIn_57_0 = null;
            Object stackOut_2_0 = null;
            Object stackOut_3_0 = null;
            Object stackOut_6_0 = null;
            Object stackOut_7_0 = null;
            Object stackOut_24_0 = null;
            Object stackOut_25_0 = null;
            byte[] stackOut_53_0 = null;
            byte[] stackOut_54_0 = null;
            Object stackOut_56_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var18 = Torquing.field_u;
                        var3 = (Object) (Object) ((pb) this).field_d;
                        // monitorenter ((pb) this).field_d
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((pb) this).field_f.b(true) >= (long)(6 + 6 * param0)) {
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
                            ((pb) this).field_f.a(false, (long)(param0 * 6));
                            ((pb) this).field_f.a(0, aa.field_X, 6, param1 + 25);
                            var4_int = ((aa.field_X[0] & 255) << 1044040496) - -((255 & aa.field_X[1]) << 2106940872) - -(255 & aa.field_X[2]);
                            if (param1 == 85) {
                                statePc = 9;
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
                            stackOut_6_0 = null;
                            stackIn_7_0 = stackOut_6_0;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof IOException ? 56 : 58);
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
                            statePc = 58;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        return (byte[]) (Object) stackIn_8_0;
                    }
                    case 9: {
                        try {
                            var5 = ((aa.field_X[3] & 255) << 1038810128) + ((255 & aa.field_X[4]) << 2114852392) - -(255 & aa.field_X[5]);
                            if (var4_int >= 0) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = (stateCaught_9 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (((pb) this).field_b >= var4_int) {
                                statePc = 15;
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
                    case 15: {
                        try {
                            if (0 < var5) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (((long)var5 ^ -1L) >= (((pb) this).field_d.b(true) / 520L ^ -1L)) {
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
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
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
                            statePc = (stateCaught_21 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (var4_int <= var7) {
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
                            if (-1 != (var5 ^ -1)) {
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
                            stackOut_24_0 = null;
                            stackIn_25_0 = stackOut_24_0;
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            // monitorexit var3
                            stackOut_25_0 = stackIn_25_0;
                            stackIn_26_0 = stackOut_25_0;
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 58;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        return (byte[]) (Object) stackIn_26_0;
                    }
                    case 27: {
                        try {
                            ((pb) this).field_d.a(false, (long)(520 * var5));
                            var9 = var4_int - var7;
                            if (param0 > 65535) {
                                statePc = 32;
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
                            if (512 < var9) {
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
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var9 = 512;
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            ((pb) this).field_d.a(0, aa.field_X, var9 - -var14, -113);
                            var10 = (aa.field_X[1] & 255) + (65280 & aa.field_X[0] << -193984792);
                            var13 = 255 & aa.field_X[7];
                            var11 = ((aa.field_X[2] & 255) << -1312346424) + (aa.field_X[3] & 255);
                            var12 = (255 & aa.field_X[6]) + (aa.field_X[4] << 686440656 & 16711680) - -(aa.field_X[5] << 412463240 & 65280);
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var14 = 10;
                            if ((var9 ^ -1) < -511) {
                                statePc = 34;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            var9 = 510;
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
                            ((pb) this).field_d.a(0, aa.field_X, var9 + var14, -76);
                            var11 = (aa.field_X[5] & 255) + (aa.field_X[4] << 1537373224 & 65280);
                            var13 = aa.field_X[9] & 255;
                            var10 = (aa.field_X[3] & 255) + ((aa.field_X[0] << -409561576 & -16777216) + ((16711680 & aa.field_X[1] << 945438480) - -(aa.field_X[2] << -1292531608 & 65280)));
                            var12 = (255 & aa.field_X[8]) + (((255 & aa.field_X[6]) << 1096311312) + ((255 & aa.field_X[7]) << 568542824));
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            if (var10 == param0) {
                                statePc = 38;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (var8 == var11) {
                                statePc = 40;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (var13 == ((pb) this).field_a) {
                                statePc = 44;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            if (var12 >= 0) {
                                statePc = 46;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if (((long)var12 ^ -1L) >= (((pb) this).field_d.b(true) / 520L ^ -1L)) {
                                statePc = 50;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            var15 = var9 + var14;
                            var8++;
                            var5 = var12;
                            var16 = var14;
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            if (var15 <= var16) {
                                statePc = 22;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            var7++;
                            var6[var7] = aa.field_X[var16];
                            var16++;
                            statePc = 51;
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
                    if (param1 == 10282) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return false;
                }
                case 2: {
                    var5 = (Object) (Object) ((pb) this).field_d;
                    // monitorenter ((pb) this).field_d
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        if (-1 < (param3 ^ -1)) {
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
                        if (((pb) this).field_b >= param3) {
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
                        var6 = this.a(true, param0, param2, (byte) -122, param3) ? 1 : 0;
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
                        var6 = this.a(false, param0, param2, (byte) -123, param3) ? 1 : 0;
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

    final static t[] a(String param0, int param1, String param2, la param3) {
        int var4 = param3.a(param1, param2);
        int var5 = param3.a(param0, param1 + -103, var4);
        return mi.a(var4, param3, var5, 482809644);
    }

    pb(int param0, o param1, o param2, int param3) {
        ((pb) this).field_d = null;
        ((pb) this).field_b = 65000;
        ((pb) this).field_f = null;
        ((pb) this).field_a = param0;
        ((pb) this).field_f = param2;
        ((pb) this).field_b = param3;
        ((pb) this).field_d = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = -1;
        field_c = "Unpacking music";
        field_g = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
