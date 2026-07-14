/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qh {
    static String field_g;
    private int field_h;
    static String field_e;
    static long field_c;
    private int field_d;
    private ew field_f;
    static int field_b;
    static String field_a;
    private ew field_i;

    public static void b(int param0) {
        if (param0 != -1) {
            field_g = null;
        }
        field_a = null;
        field_g = null;
        field_e = null;
    }

    final boolean a(byte param0, int param1, int param2, byte[] param3) {
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
                    var5 = (Object) (Object) ((qh) this).field_i;
                    // monitorenter ((qh) this).field_i
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (-1 < (param2 ^ -1)) {
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
                        if (param2 <= ((qh) this).field_d) {
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
                        var6 = this.a(true, 16, param1, param3, param2) ? 1 : 0;
                        if (var6 == 0) {
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
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var6 = this.a(false, 16, param1, param3, param2) ? 1 : 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param0 == 66) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ((qh) this).field_h = -36;
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
            Object stackIn_15_0 = null;
            Object stackIn_16_0 = null;
            Object stackIn_21_0 = null;
            Object stackIn_22_0 = null;
            Object stackIn_44_0 = null;
            Object stackIn_45_0 = null;
            byte[] stackIn_50_0 = null;
            byte[] stackIn_51_0 = null;
            Object stackIn_53_0 = null;
            Object stackOut_14_0 = null;
            Object stackOut_15_0 = null;
            Object stackOut_20_0 = null;
            Object stackOut_21_0 = null;
            Object stackOut_43_0 = null;
            Object stackOut_44_0 = null;
            byte[] stackOut_49_0 = null;
            byte[] stackOut_50_0 = null;
            Object stackOut_52_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var18 = Kickabout.field_G;
                        var3 = (Object) (Object) ((qh) this).field_i;
                        // monitorenter ((qh) this).field_i
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if ((long)(6 + 6 * param0) <= ((qh) this).field_f.a(param1 + -65162)) {
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
                            ((qh) this).field_f.a((byte) 4, (long)(param0 * 6));
                            ((qh) this).field_f.a(6, 0, (byte) 93, id.field_u);
                            var4_int = (param1 & id.field_u[1] << 1517957576) + ((255 & id.field_u[0]) << -712151664) + (id.field_u[2] & 255);
                            var5 = (255 & id.field_u[5]) + (((255 & id.field_u[3]) << 328902928) + (id.field_u[4] << 1810700616 & 65280));
                            if (0 <= var4_int) {
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
                            if (((qh) this).field_d >= var4_int) {
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
                            if ((var5 ^ -1) < -1) {
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
                            if ((long)var5 <= ((qh) this).field_i.a(-76) / 520L) {
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
                            ((qh) this).field_i.a((byte) 4, (long)(520 * var5));
                            var9 = var4_int + -var7;
                            if (param0 > 65535) {
                                statePc = 28;
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
                            var14 = 8;
                            if ((var9 ^ -1) < -513) {
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
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var9 = 512;
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            ((qh) this).field_i.a(var14 + var9, 0, (byte) 116, id.field_u);
                            var11 = (id.field_u[2] << -749531864 & 65280) + (255 & id.field_u[3]);
                            var10 = (id.field_u[0] << 1897722952 & 65280) + (255 & id.field_u[1]);
                            var13 = 255 & id.field_u[7];
                            var12 = (id.field_u[4] << -234944880 & 16711680) - (-(65280 & id.field_u[5] << 1961718952) - (255 & id.field_u[6]));
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var14 = 10;
                            if (var9 > 510) {
                                statePc = 30;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof IOException ? 52 : 54);
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
                            statePc = (stateCaught_30 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            ((qh) this).field_i.a(var14 + var9, 0, (byte) 113, id.field_u);
                            var13 = 255 & id.field_u[9];
                            var12 = (id.field_u[8] & 255) + ((id.field_u[7] & 255) << 2087458600) + ((255 & id.field_u[6]) << -328254032);
                            var10 = (16711680 & id.field_u[1] << -413209424) + (((id.field_u[0] & 255) << 1125560248) - (-(id.field_u[2] << -1682361976 & 65280) - (id.field_u[3] & 255)));
                            var11 = (id.field_u[4] << 1867160552 & 65280) - -(255 & id.field_u[5]);
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 52 : 54);
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
                            statePc = (stateCaught_32 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (var8 == var11) {
                                statePc = 36;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            if (((qh) this).field_h == var13) {
                                statePc = 40;
                            } else {
                                statePc = 37;
                            }
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
                            return null;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (-1 >= (var12 ^ -1)) {
                                statePc = 42;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if ((((qh) this).field_i.a(58) / 520L ^ -1L) <= ((long)var12 ^ -1L)) {
                                statePc = 46;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof IOException ? 52 : 54);
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
                            statePc = (stateCaught_43 instanceof IOException ? 52 : 54);
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
                            statePc = 54;
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
                            var5 = var12;
                            var16 = var14;
                            statePc = 47;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            if (var15 <= var16) {
                                statePc = 18;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            var7++;
                            var6[var7] = id.field_u[var16];
                            var16++;
                            statePc = 47;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
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

    final static void a(byte param0, tv param1) {
        int var2 = 0;
        tv var3 = null;
        int var4 = 0;
        var4 = Kickabout.field_G;
        if (null == param1.field_g) {
          return;
        } else {
          L0: {
            L1: {
              if (0 != param1.field_j) {
                break L1;
              } else {
                if (-1 == (param1.field_p ^ -1)) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var2 = 0;
            L2: while (true) {
              if (vb.field_j <= var2) {
                break L0;
              } else {
                var3 = fu.field_b[var2];
                if ((var3.field_c ^ -1) == -3) {
                  if (var3.field_j == param1.field_j) {
                    if (var3.field_p == param1.field_p) {
                      return;
                    } else {
                      var2++;
                      continue L2;
                    }
                  } else {
                    var2++;
                    continue L2;
                  }
                } else {
                  var2++;
                  continue L2;
                }
              }
            }
          }
          L3: {
            if (param1.field_r != null) {
              ol.field_z = param1.field_c;
              mv.field_a = param1.field_q;
              nr.field_r = param1.field_d;
              qs.field_S = param1.field_r;
              break L3;
            } else {
              break L3;
            }
          }
          var2 = 50 % ((-10 - param0) / 54);
          ec.a(true, param1);
          return;
        }
    }

    private final boolean a(boolean param0, int param1, int param2, byte[] param3, int param4) {
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
            int stackIn_35_0 = 0;
            int stackIn_36_0 = 0;
            int stackIn_41_0 = 0;
            int stackIn_42_0 = 0;
            int stackIn_60_0 = 0;
            int stackIn_61_0 = 0;
            int stackIn_63_0 = 0;
            int stackOut_3_0 = 0;
            int stackOut_4_0 = 0;
            int stackOut_9_0 = 0;
            int stackOut_10_0 = 0;
            int stackOut_34_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_59_0 = 0;
            int stackOut_60_0 = 0;
            int stackOut_62_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = Kickabout.field_G;
                        var6 = (Object) (Object) ((qh) this).field_i;
                        // monitorenter ((qh) this).field_i
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (!param0) {
                                statePc = 12;
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
                            if ((long)(6 + param2 * 6) <= ((qh) this).field_f.a(param1 ^ -115)) {
                                statePc = 6;
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
                            stackOut_3_0 = 0;
                            stackIn_4_0 = stackOut_3_0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = (stateCaught_3 instanceof IOException ? 62 : 64);
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
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        return stackIn_5_0 != 0;
                    }
                    case 6: {
                        try {
                            ((qh) this).field_f.a((byte) 4, (long)(6 * param2));
                            ((qh) this).field_f.a(6, 0, (byte) 103, id.field_u);
                            var7_int = (255 & id.field_u[5]) + ((id.field_u[3] & 255) << 133634096) - -((id.field_u[4] & 255) << -232133400);
                            if ((var7_int ^ -1) >= -1) {
                                statePc = 9;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (((long)var7_int ^ -1L) < (((qh) this).field_i.a(107) / 520L ^ -1L)) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof IOException ? 62 : 64);
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
                            statePc = (stateCaught_9 instanceof IOException ? 62 : 64);
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
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        return stackIn_11_0 != 0;
                    }
                    case 12: {
                        try {
                            var7_int = (int)((519L + ((qh) this).field_i.a(121)) / 520L);
                            if (0 == var7_int) {
                                statePc = 14;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof IOException ? 62 : 64);
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
                            statePc = (stateCaught_14 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            id.field_u[0] = (byte)(param4 >> -721577328);
                            id.field_u[3] = (byte)(var7_int >> 1172355440);
                            id.field_u[4] = (byte)(var7_int >> 436222504);
                            id.field_u[5] = (byte)var7_int;
                            id.field_u[1] = (byte)(param4 >> 2047810440);
                            if (param1 == 16) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            qh.a(-25);
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            id.field_u[2] = (byte)param4;
                            ((qh) this).field_f.a((byte) 4, (long)(6 * param2));
                            ((qh) this).field_f.a(0, 56, 6, id.field_u);
                            var8 = 0;
                            var9 = 0;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (var8 >= param4) {
                                statePc = 59;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var10 = 0;
                            if (!param0) {
                                statePc = 43;
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
                            ((qh) this).field_i.a((byte) 4, (long)(520 * var7_int));
                            if (param2 <= 65535) {
                                statePc = 26;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            ((qh) this).field_i.a(10, 0, (byte) 104, id.field_u);
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof EOFException ? 24 : (stateCaught_22 instanceof IOException ? 62 : 64));
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var14 = (EOFException) (Object) caughtException;
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var12 = ((id.field_u[4] & 255) << 1957197736) - -(255 & id.field_u[5]);
                            var13 = id.field_u[9] & 255;
                            var11 = (65280 & id.field_u[2] << -936734040) + ((255 & id.field_u[1]) << -2127776720) + (-16777216 & id.field_u[0] << 1165292792) + (id.field_u[3] & 255);
                            var10 = ((255 & id.field_u[6]) << -418167056) + ((id.field_u[7] & 255) << -1211325400) - -(id.field_u[8] & 255);
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            ((qh) this).field_i.a(8, 0, (byte) 118, id.field_u);
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof EOFException ? 28 : (stateCaught_26 instanceof IOException ? 62 : 64));
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var14 = (EOFException) (Object) caughtException;
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var11 = (id.field_u[1] & 255) + (65280 & id.field_u[0] << -2084796664);
                            var10 = (id.field_u[6] & 255) + (((id.field_u[5] & 255) << 1986438152) + (16711680 & id.field_u[4] << 1112670544));
                            var13 = id.field_u[7] & 255;
                            var12 = ((id.field_u[2] & 255) << -93967800) - -(id.field_u[3] & 255);
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (var11 != param2) {
                                statePc = 34;
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
                            if (var12 != var9) {
                                statePc = 34;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (var13 != ((qh) this).field_h) {
                                statePc = 34;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof IOException ? 62 : 64);
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
                            statePc = (stateCaught_34 instanceof IOException ? 62 : 64);
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
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        return stackIn_36_0 != 0;
                    }
                    case 37: {
                        try {
                            if ((var10 ^ -1) > -1) {
                                statePc = 40;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if ((long)var10 <= ((qh) this).field_i.a(param1 + -117) / 520L) {
                                statePc = 43;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof IOException ? 62 : 64);
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
                            statePc = (stateCaught_40 instanceof IOException ? 62 : 64);
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
                            statePc = 64;
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
                            statePc = (stateCaught_43 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            param0 = false;
                            var10 = (int)((519L + ((qh) this).field_i.a(97)) / 520L);
                            if (var10 != 0) {
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
                            var10++;
                            statePc = 47;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            if (var10 != var7_int) {
                                statePc = 49;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof IOException ? 62 : 64);
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
                            statePc = (stateCaught_48 instanceof IOException ? 62 : 64);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            if (-var8 + param4 < -513) {
                                statePc = 51;
                            } else {
                                statePc = 50;
                            }
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
                            if (-65536 < param2) {
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
                            id.field_u[4] = (byte)(var10 >> -1072376400);
                            id.field_u[3] = (byte)var9;
                            id.field_u[2] = (byte)(var9 >> -1390729208);
                            id.field_u[1] = (byte)param2;
                            id.field_u[0] = (byte)(param2 >> -1516296632);
                            id.field_u[7] = (byte)((qh) this).field_h;
                            id.field_u[6] = (byte)var10;
                            id.field_u[5] = (byte)(var10 >> -362958584);
                            ((qh) this).field_i.a((byte) 4, (long)(520 * var7_int));
                            ((qh) this).field_i.a(0, 76, 8, id.field_u);
                            var11 = -var8 + param4;
                            if ((var11 ^ -1) >= -513) {
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
                            var11 = 512;
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
                            ((qh) this).field_i.a(var8, 102, var11, param3);
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
                            id.field_u[3] = (byte)param2;
                            id.field_u[2] = (byte)(param2 >> -972193080);
                            id.field_u[1] = (byte)(param2 >> 1455599248);
                            id.field_u[5] = (byte)var9;
                            id.field_u[6] = (byte)(var10 >> 110837104);
                            id.field_u[4] = (byte)(var9 >> 465226248);
                            id.field_u[8] = (byte)var10;
                            id.field_u[0] = (byte)(param2 >> -1734809000);
                            id.field_u[7] = (byte)(var10 >> -255869240);
                            id.field_u[9] = (byte)((qh) this).field_h;
                            ((qh) this).field_i.a((byte) 4, (long)(520 * var7_int));
                            ((qh) this).field_i.a(0, 125, 10, id.field_u);
                            var11 = param4 - var8;
                            if (510 >= var11) {
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
                            var11 = 510;
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
                            ((qh) this).field_i.a(var8, param1 + 84, var11, param3);
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
                            var7_int = var10;
                            var9++;
                            statePc = 18;
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

    public final String toString() {
        return "" + ((qh) this).field_h;
    }

    final static void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        cf var5 = null;
        cf var5_ref = null;
        bc var6 = null;
        int var7 = 0;
        tf var8 = null;
        cf var9 = null;
        L0: {
          var7 = Kickabout.field_G;
          var8 = new tf();
          if (jh.field_Hb.field_Db.field_jb == null) {
            break L0;
          } else {
            jh.field_Hb.field_Db.field_jb.a(-17481, var8);
            break L0;
          }
        }
        L1: {
          var2 = mf.field_Gb;
          if ((var2 ^ -1) <= -1) {
            break L1;
          } else {
            var2 = 0;
            break L1;
          }
        }
        var3 = je.field_k;
        var4 = 5 - -(var2 * 18);
        L2: while (true) {
          L3: {
            if (jh.field_Hb.field_Gb.field_mb - (-15 + jh.field_Hb.field_Db.field_J) <= var4) {
              break L3;
            } else {
              if (pu.field_Db[var3] <= var2) {
                break L3;
              } else {
                var5 = (cf) (Object) var8.g(24009);
                L4: while (true) {
                  L5: {
                    if (var5 == null) {
                      break L5;
                    } else {
                      L6: {
                        if (var5.field_yb != var2) {
                          break L6;
                        } else {
                          if (var5.field_Ab == var3) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var5 = (cf) (Object) var8.c(33);
                      continue L4;
                    }
                  }
                  L7: {
                    if (var5 != null) {
                      break L7;
                    } else {
                      var9 = cu.a(false, 0, var3, var2, false, false);
                      var5_ref = var9;
                      var9.a(true, 327, 5, var4, 16);
                      break L7;
                    }
                  }
                  jh.field_Hb.field_Db.a((byte) -109, (hd) (Object) var5_ref);
                  var6 = bf.field_y.a(var2, (byte) 116, var3);
                  var4 += 18;
                  var2++;
                  if (var6 == null) {
                    var5_ref.h((byte) 104);
                    continue L2;
                  } else {
                    var5_ref.a((byte) 59, var6);
                    continue L2;
                  }
                }
              }
            }
          }
          var5 = (cf) (Object) var8.b((byte) 127);
          if (param0 >= 82) {
            L8: while (true) {
              if (var5 == null) {
                return;
              } else {
                var5.c(true);
                var5 = (cf) (Object) var8.b((byte) 127);
                continue L8;
              }
            }
          } else {
            return;
          }
        }
    }

    qh(int param0, ew param1, ew param2, int param3) {
        ((qh) this).field_d = 65000;
        ((qh) this).field_f = null;
        ((qh) this).field_i = null;
        ((qh) this).field_i = param1;
        ((qh) this).field_h = param0;
        ((qh) this).field_f = param2;
        ((qh) this).field_d = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Your search returned no results";
        field_a = "Checking";
        field_g = "Log in to browse the leagues.";
    }
}
