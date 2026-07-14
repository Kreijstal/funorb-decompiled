/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ppa {
    private int field_d;
    private ph field_c;
    private int field_e;
    private ph field_b;
    static String field_a;

    final boolean a(int param0, byte[] param1, int param2, byte param3) {
        Object var5 = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = (Object) (Object) ((ppa) this).field_c;
                    // monitorenter ((ppa) this).field_c
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2 < 0) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param2 > ((ppa) this).field_e) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw new IllegalArgumentException();
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var6 = this.a(true, param2, param1, true, param0) ? 1 : 0;
                        if (var6 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var6 = this.a(false, param2, param1, true, param0) ? 1 : 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (param3 >= 112) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ((ppa) this).field_d = -66;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        // monitorexit var5
                        stackOut_10_0 = var6;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return stackIn_11_0 != 0;
                }
                case 12: {
                    try {
                        var7 = caughtException;
                        // monitorexit var5
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 13: {
                    throw (RuntimeException) (Object) var7;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != -1551894744) {
            field_a = null;
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
            Object stackIn_3_0 = null;
            Object stackIn_4_0 = null;
            Object stackIn_15_0 = null;
            Object stackIn_16_0 = null;
            Object stackIn_21_0 = null;
            Object stackIn_22_0 = null;
            Object stackIn_37_0 = null;
            Object stackIn_38_0 = null;
            Object stackIn_43_0 = null;
            Object stackIn_44_0 = null;
            byte[] stackIn_49_0 = null;
            byte[] stackIn_50_0 = null;
            Object stackIn_52_0 = null;
            Object stackOut_2_0 = null;
            Object stackOut_3_0 = null;
            Object stackOut_14_0 = null;
            Object stackOut_15_0 = null;
            Object stackOut_20_0 = null;
            Object stackOut_21_0 = null;
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
                        var19 = TombRacer.field_G ? 1 : 0;
                        var3 = (Object) (Object) ((ppa) this).field_c;
                        // monitorenter ((ppa) this).field_c
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((ppa) this).field_b.b(true) >= (long)(6 + 6 * param0)) {
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
                            stackOut_2_0 = null;
                            stackIn_3_0 = stackOut_2_0;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof IOException ? 51 : 53);
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
                            statePc = 53;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        return (byte[]) (Object) stackIn_4_0;
                    }
                    case 5: {
                        try {
                            ((ppa) this).field_b.a((byte) 20, (long)(6 * param0));
                            ((ppa) this).field_b.a(wfa.field_F, 6, 0, (byte) -64);
                            var6 = -2 / ((param1 - -40) / 57);
                            var4_int = (255 & wfa.field_F[2]) + (((255 & wfa.field_F[1]) << -699004088) + (wfa.field_F[0] << 1680578096 & 16711680));
                            var5 = (16711680 & wfa.field_F[3] << 382693360) - (-((wfa.field_F[4] & 255) << -2019450424) + -(wfa.field_F[5] & 255));
                            if (-1 >= (var4_int ^ -1)) {
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
                            if (var4_int <= ((ppa) this).field_e) {
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
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (-1 > (var5 ^ -1)) {
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
                            if ((long)var5 <= ((ppa) this).field_c.b(true) / 520L) {
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
                            stackOut_14_0 = null;
                            stackIn_15_0 = stackOut_14_0;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof IOException ? 51 : 53);
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
                            statePc = 53;
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
                            statePc = (stateCaught_17 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (var8 >= var4_int) {
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
                            stackOut_20_0 = null;
                            stackIn_21_0 = stackOut_20_0;
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 51 : 53);
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
                            statePc = 53;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        return (byte[]) (Object) stackIn_22_0;
                    }
                    case 23: {
                        try {
                            ((ppa) this).field_c.a((byte) 67, (long)(520 * var5));
                            var10 = var4_int - var8;
                            if (65535 < param0) {
                                statePc = 28;
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
                            if (var10 > 512) {
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
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var10 = 512;
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var15 = 8;
                            ((ppa) this).field_c.a(wfa.field_F, var15 + var10, 0, (byte) -30);
                            var12 = ((wfa.field_F[2] & 255) << 1298885992) - -(wfa.field_F[3] & 255);
                            var14 = 255 & wfa.field_F[7];
                            var13 = (255 & wfa.field_F[6]) + ((255 & wfa.field_F[4]) << 1559773488) - -(65280 & wfa.field_F[5] << -1551894744);
                            var11 = (255 & wfa.field_F[1]) + ((wfa.field_F[0] & 255) << -1783325336);
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var15 = 10;
                            if (510 >= var10) {
                                statePc = 30;
                            } else {
                                statePc = 29;
                            }
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
                            ((ppa) this).field_c.a(wfa.field_F, var10 - -var15, 0, (byte) -28);
                            var12 = (255 & wfa.field_F[5]) + (wfa.field_F[4] << -134014072 & 65280);
                            var13 = ((255 & wfa.field_F[6]) << -135017520) + ((65280 & wfa.field_F[7] << 247711592) - -(wfa.field_F[8] & 255));
                            var11 = (16711680 & wfa.field_F[1] << -801615824) + (-16777216 & wfa.field_F[0] << 55766968) - (-(wfa.field_F[2] << -2082219128 & 65280) + -(255 & wfa.field_F[3]));
                            var14 = wfa.field_F[9] & 255;
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
                            if (param0 == var11) {
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
                            if (var12 == var9) {
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
                            if (var14 == ((ppa) this).field_d) {
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
                            if ((var13 ^ -1) <= -1) {
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
                            if ((((ppa) this).field_c.b(true) / 520L ^ -1L) <= ((long)var13 ^ -1L)) {
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
                            var16 = var15 - -var10;
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
                            var7[var8] = wfa.field_F[var17];
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

    private final boolean a(boolean param0, int param1, byte[] param2, boolean param3, int param4) {
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
            int stackIn_34_0 = 0;
            int stackIn_35_0 = 0;
            int stackIn_40_0 = 0;
            int stackIn_41_0 = 0;
            int stackIn_61_0 = 0;
            int stackIn_62_0 = 0;
            int stackIn_64_0 = 0;
            int stackOut_3_0 = 0;
            int stackOut_4_0 = 0;
            int stackOut_9_0 = 0;
            int stackOut_10_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_34_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_60_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_63_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = TombRacer.field_G ? 1 : 0;
                        var6 = (Object) (Object) ((ppa) this).field_c;
                        // monitorenter ((ppa) this).field_c
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
                            statePc = (stateCaught_1 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (((ppa) this).field_b.b(true) >= (long)(6 * param4 + 6)) {
                                statePc = 6;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof IOException ? 63 : 65);
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
                            statePc = (stateCaught_3 instanceof IOException ? 63 : 65);
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
                            statePc = 65;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        return stackIn_5_0 != 0;
                    }
                    case 6: {
                        try {
                            ((ppa) this).field_b.a((byte) -124, (long)(6 * param4));
                            ((ppa) this).field_b.a(wfa.field_F, 6, 0, (byte) -34);
                            var7_int = (wfa.field_F[3] << -1620960176 & 16711680) + ((255 & wfa.field_F[4]) << -52731960) + (255 & wfa.field_F[5]);
                            if (-1 <= (var7_int ^ -1)) {
                                statePc = 9;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if ((long)var7_int <= ((ppa) this).field_c.b(true) / 520L) {
                                statePc = 14;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof IOException ? 63 : 65);
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
                            statePc = (stateCaught_9 instanceof IOException ? 63 : 65);
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
                            statePc = 65;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        return stackIn_11_0 != 0;
                    }
                    case 12: {
                        try {
                            var7_int = (int)((519L + ((ppa) this).field_c.b(true)) / 520L);
                            if (-1 != (var7_int ^ -1)) {
                                statePc = 14;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof IOException ? 63 : 65);
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
                            statePc = (stateCaught_13 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            wfa.field_F[5] = (byte)var7_int;
                            wfa.field_F[1] = (byte)(param1 >> -1586847864);
                            wfa.field_F[0] = (byte)(param1 >> 972428496);
                            wfa.field_F[2] = (byte)param1;
                            wfa.field_F[3] = (byte)(var7_int >> -1407435728);
                            wfa.field_F[4] = (byte)(var7_int >> 2117413768);
                            ((ppa) this).field_b.a((byte) -118, (long)(param4 * 6));
                            ((ppa) this).field_b.a(wfa.field_F, 0, (byte) -17, 6);
                            if (param3) {
                                statePc = 16;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            byte[] discarded$1 = ((ppa) this).a(58, 109);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            var8 = 0;
                            var9 = 0;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (var8 >= param1) {
                                statePc = 60;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var10 = 0;
                            if (!param0) {
                                statePc = 42;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            ((ppa) this).field_c.a((byte) 91, (long)(var7_int * 520));
                            if ((param4 ^ -1) >= -65536) {
                                statePc = 25;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            ((ppa) this).field_c.a(wfa.field_F, 10, 0, (byte) -33);
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof EOFException ? 23 : (stateCaught_21 instanceof IOException ? 63 : 65));
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var14 = (EOFException) (Object) caughtException;
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var12 = ((255 & wfa.field_F[4]) << 1670140616) - -(255 & wfa.field_F[5]);
                            var11 = (wfa.field_F[0] << -400917576 & -16777216) - -((255 & wfa.field_F[1]) << 1969366576) - (-((255 & wfa.field_F[2]) << -495893112) + -(255 & wfa.field_F[3]));
                            var13 = 255 & wfa.field_F[9];
                            var10 = (255 & wfa.field_F[8]) + (((255 & wfa.field_F[7]) << 42812104) + ((255 & wfa.field_F[6]) << 1556945840));
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            ((ppa) this).field_c.a(wfa.field_F, 8, 0, (byte) -115);
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof EOFException ? 27 : (stateCaught_25 instanceof IOException ? 63 : 65));
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var14 = (EOFException) (Object) caughtException;
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var12 = (255 & wfa.field_F[3]) + ((255 & wfa.field_F[2]) << 86868968);
                            var11 = (65280 & wfa.field_F[0] << 84403048) - -(wfa.field_F[1] & 255);
                            var10 = (255 & wfa.field_F[6]) + (wfa.field_F[4] << -959727792 & 16711680) + (wfa.field_F[5] << 1057120648 & 65280);
                            var13 = wfa.field_F[7] & 255;
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof IOException ? 63 : 65);
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
                            statePc = (stateCaught_29 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (var9 != var12) {
                                statePc = 33;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (((ppa) this).field_d != var13) {
                                statePc = 33;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof IOException ? 63 : 65);
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
                            statePc = (stateCaught_33 instanceof IOException ? 63 : 65);
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
                            statePc = 65;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        return stackIn_35_0 != 0;
                    }
                    case 36: {
                        try {
                            if (0 > var10) {
                                statePc = 39;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if ((long)var10 > ((ppa) this).field_c.b(true) / 520L) {
                                statePc = 39;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof IOException ? 63 : 65);
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
                            statePc = (stateCaught_39 instanceof IOException ? 63 : 65);
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
                            statePc = 65;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        return stackIn_41_0 != 0;
                    }
                    case 42: {
                        try {
                            if (-1 == (var10 ^ -1)) {
                                statePc = 44;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            var10 = (int)((((ppa) this).field_c.b(true) - -519L) / 520L);
                            param0 = false;
                            if (0 != var10) {
                                statePc = 46;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof IOException ? 63 : 65);
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
                            statePc = (stateCaught_45 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if (var7_int == var10) {
                                statePc = 48;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof IOException ? 63 : 65);
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
                            statePc = (stateCaught_48 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            if (-513 > -var8 + param1) {
                                statePc = 51;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof IOException ? 63 : 65);
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
                            statePc = (stateCaught_50 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            if (-65536 < param4) {
                                statePc = 56;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            wfa.field_F[4] = (byte)(var10 >> 587301264);
                            wfa.field_F[2] = (byte)(var9 >> 583428520);
                            wfa.field_F[6] = (byte)var10;
                            wfa.field_F[3] = (byte)var9;
                            wfa.field_F[0] = (byte)(param4 >> 1978773960);
                            wfa.field_F[5] = (byte)(var10 >> -1327305976);
                            wfa.field_F[1] = (byte)param4;
                            wfa.field_F[7] = (byte)((ppa) this).field_d;
                            ((ppa) this).field_c.a((byte) -109, (long)(var7_int * 520));
                            ((ppa) this).field_c.a(wfa.field_F, 0, (byte) -17, 8);
                            var11 = param1 - var8;
                            if (var11 > 512) {
                                statePc = 54;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            var11 = 512;
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            ((ppa) this).field_c.a(param2, var8, (byte) -17, var11);
                            var8 = var8 + var11;
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            wfa.field_F[7] = (byte)(var10 >> 1566837160);
                            wfa.field_F[5] = (byte)var9;
                            wfa.field_F[1] = (byte)(param4 >> -625830512);
                            wfa.field_F[3] = (byte)param4;
                            wfa.field_F[0] = (byte)(param4 >> -249788232);
                            wfa.field_F[6] = (byte)(var10 >> 1174006160);
                            wfa.field_F[4] = (byte)(var9 >> -286510776);
                            wfa.field_F[9] = (byte)((ppa) this).field_d;
                            wfa.field_F[8] = (byte)var10;
                            wfa.field_F[2] = (byte)(param4 >> 1996238920);
                            ((ppa) this).field_c.a((byte) 36, (long)(520 * var7_int));
                            ((ppa) this).field_c.a(wfa.field_F, 0, (byte) -17, 10);
                            var11 = param1 + -var8;
                            if (-511 <= (var11 ^ -1)) {
                                statePc = 58;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            var11 = 510;
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            ((ppa) this).field_c.a(param2, var8, (byte) -17, var11);
                            var8 = var8 + var11;
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            var9++;
                            var7_int = var10;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            stackOut_60_0 = 1;
                            stackIn_61_0 = stackOut_60_0;
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof IOException ? 63 : 65);
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            // monitorexit var6
                            stackOut_61_0 = stackIn_61_0;
                            stackIn_62_0 = stackOut_61_0;
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 65;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        return stackIn_62_0 != 0;
                    }
                    case 63: {
                        try {
                            var7 = (IOException) (Object) caughtException;
                            // monitorexit var6
                            stackOut_63_0 = 0;
                            stackIn_64_0 = stackOut_63_0;
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 65;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        return stackIn_64_0 != 0;
                    }
                    case 65: {
                        try {
                            var15 = caughtException;
                            // monitorexit var6
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 65;
                            continue stateLoop;
                        }
                    }
                    case 66: {
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

    final static void a(la param0, int param1, ff param2) {
        int var3 = 0;
        L0: {
          if (vpa.a(112)) {
            break L0;
          } else {
            if (!param2.k(-25319)) {
              if ((param0.q((byte) -82) ^ -1) > -1) {
                return;
              } else {
                ql.field_k.k(99, -2988);
                ql.field_k.f(-1477662136, param0.q((byte) -82));
                ql.field_k.f(-1477662136, param0.a((byte) 107));
                var3 = 79 / ((param1 - 9) / 53);
                return;
              }
            } else {
              break L0;
            }
          }
        }
    }

    public final String toString() {
        return "" + ((ppa) this).field_d;
    }

    ppa(int param0, ph param1, ph param2, int param3) {
        ((ppa) this).field_c = null;
        ((ppa) this).field_b = null;
        ((ppa) this).field_e = 65000;
        ((ppa) this).field_d = param0;
        ((ppa) this).field_c = param1;
        ((ppa) this).field_b = param2;
        ((ppa) this).field_e = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Username: ";
    }
}
