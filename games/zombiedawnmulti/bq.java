/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bq {
    static int[] field_g;
    private int field_h;
    static String field_f;
    private of field_b;
    static boolean field_c;
    static ao field_i;
    private of field_d;
    static ja field_a;
    private int field_e;

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
            Object stackIn_9_0 = null;
            Object stackIn_10_0 = null;
            Object stackIn_15_0 = null;
            Object stackIn_16_0 = null;
            Object stackIn_38_0 = null;
            Object stackIn_39_0 = null;
            byte[] stackIn_50_0 = null;
            byte[] stackIn_51_0 = null;
            Object stackIn_53_0 = null;
            Object stackOut_8_0 = null;
            Object stackOut_9_0 = null;
            Object stackOut_14_0 = null;
            Object stackOut_15_0 = null;
            Object stackOut_37_0 = null;
            Object stackOut_38_0 = null;
            byte[] stackOut_49_0 = null;
            byte[] stackOut_50_0 = null;
            Object stackOut_52_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var18 = ZombieDawnMulti.field_E ? 1 : 0;
                        var3 = (Object) (Object) ((bq) this).field_b;
                        // monitorenter ((bq) this).field_b
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((bq) this).field_d.c(param0 ^ -2) >= (long)(6 * param1 + 6)) {
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
                            ((bq) this).field_d.a((long)(param1 * 6), (byte) -70);
                            ((bq) this).field_d.a(6, 0, la.field_g, 47);
                            var4_int = (la.field_g[2] & 255) + (((la.field_g[param0] & 255) << 1497411624) + ((255 & la.field_g[0]) << 841354640));
                            var5 = ((255 & la.field_g[3]) << -307556048) + (la.field_g[4] << -2105338744 & 65280) - -(la.field_g[5] & 255);
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
                            if (((bq) this).field_e >= var4_int) {
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
                            if (-1 > (var5 ^ -1)) {
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
                            if (((bq) this).field_b.c(-1) / 520L >= (long)var5) {
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
                            if (0 != var5) {
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
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            ((bq) this).field_b.a((long)(520 * var5), (byte) -70);
                            var9 = var4_int - var7;
                            if (-65536 > (param1 ^ -1)) {
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
                            if (512 < var9) {
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
                            var14 = 8;
                            ((bq) this).field_b.a(var14 + var9, 0, la.field_g, 68);
                            var12 = (la.field_g[6] & 255) + ((255 & la.field_g[5]) << -37815800) + (la.field_g[4] << 1700908304 & 16711680);
                            var13 = la.field_g[7] & 255;
                            var10 = (65280 & la.field_g[0] << 1909878792) - -(la.field_g[1] & 255);
                            var11 = (255 & la.field_g[3]) + (65280 & la.field_g[2] << -896071800);
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
                            if (-511 > (var9 ^ -1)) {
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
                            var14 = 10;
                            ((bq) this).field_b.a(var9 + var14, 0, la.field_g, param0 + -96);
                            var12 = (la.field_g[8] & 255) + ((16711680 & la.field_g[6] << -1639627984) - -(65280 & la.field_g[7] << -2119104152));
                            var11 = (la.field_g[5] & 255) + (la.field_g[4] << -393090808 & 65280);
                            var13 = 255 & la.field_g[9];
                            var10 = (65280 & la.field_g[2] << -1718972888) + ((255 & la.field_g[1]) << -1826194704) + (((255 & la.field_g[0]) << 89432856) + (la.field_g[3] & 255));
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
                            if (param1 == var10) {
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
                            if (var13 == ((bq) this).field_h) {
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
                            stackOut_37_0 = null;
                            stackIn_38_0 = stackOut_37_0;
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            // monitorexit var3
                            stackOut_38_0 = stackIn_38_0;
                            stackIn_39_0 = stackOut_38_0;
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 54;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        return (byte[]) (Object) stackIn_39_0;
                    }
                    case 40: {
                        try {
                            if ((var12 ^ -1) <= -1) {
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
                            if ((((bq) this).field_b.c(-1) / 520L ^ -1L) <= ((long)var12 ^ -1L)) {
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
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            var15 = var9 + var14;
                            var5 = var12;
                            var8++;
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
                            var6[var7] = la.field_g[var16];
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

    public static void a(byte param0) {
        field_g = null;
        field_a = null;
        field_f = null;
        field_i = null;
        if (param0 <= 29) {
            field_a = null;
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
                    var5 = (Object) (Object) ((bq) this).field_b;
                    // monitorenter ((bq) this).field_b
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
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param2 <= ((bq) this).field_e) {
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
                        var6 = this.a(true, param1, (byte) 49, param2, param3) ? 1 : 0;
                        if (param0 == 118) {
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
                        ((bq) this).field_b = null;
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
                        var6 = this.a(false, param1, (byte) 49, param2, param3) ? 1 : 0;
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

    public final String toString() {
        return "" + ((bq) this).field_h;
    }

    private final boolean a(boolean param0, byte[] param1, byte param2, int param3, int param4) {
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
            int stackIn_10_0 = 0;
            int stackIn_11_0 = 0;
            int stackIn_16_0 = 0;
            int stackIn_17_0 = 0;
            int stackIn_36_0 = 0;
            int stackIn_37_0 = 0;
            int stackIn_42_0 = 0;
            int stackIn_43_0 = 0;
            int stackIn_64_0 = 0;
            int stackIn_65_0 = 0;
            int stackIn_67_0 = 0;
            int stackOut_2_0 = 0;
            int stackOut_9_0 = 0;
            int stackOut_10_0 = 0;
            int stackOut_15_0 = 0;
            int stackOut_16_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_36_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_63_0 = 0;
            int stackOut_64_0 = 0;
            int stackOut_66_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = ZombieDawnMulti.field_E ? 1 : 0;
                        var6 = (Object) (Object) ((bq) this).field_b;
                        // monitorenter ((bq) this).field_b
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (param2 == 49) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 68;
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
                            statePc = 68;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        return stackIn_3_0 != 0;
                    }
                    case 4: {
                        try {
                            if (param0) {
                                statePc = 8;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = (stateCaught_4 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var7_int = (int)((((bq) this).field_b.c(-1) + 519L) / 520L);
                            if (0 == var7_int) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var7_int = 1;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if ((long)(6 * param4 - -6) <= ((bq) this).field_d.c(-1)) {
                                statePc = 12;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof IOException ? 66 : 68);
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
                            statePc = (stateCaught_9 instanceof IOException ? 66 : 68);
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
                            statePc = 68;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        return stackIn_11_0 != 0;
                    }
                    case 12: {
                        try {
                            ((bq) this).field_d.a((long)(param4 * 6), (byte) -70);
                            ((bq) this).field_d.a(6, 0, la.field_g, -128);
                            var7_int = (la.field_g[5] & 255) + ((255 & la.field_g[4]) << 1649337992) + (16711680 & la.field_g[3] << 1988693328);
                            if ((var7_int ^ -1) >= -1) {
                                statePc = 15;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (((long)var7_int ^ -1L) < (((bq) this).field_b.c(-1) / 520L ^ -1L)) {
                                statePc = 15;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            stackOut_15_0 = 0;
                            stackIn_16_0 = stackOut_15_0;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            // monitorexit var6
                            stackOut_16_0 = stackIn_16_0;
                            stackIn_17_0 = stackOut_16_0;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 68;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        return stackIn_17_0 != 0;
                    }
                    case 18: {
                        try {
                            la.field_g[1] = (byte)(param3 >> -1145640216);
                            la.field_g[2] = (byte)param3;
                            la.field_g[0] = (byte)(param3 >> -1386020912);
                            la.field_g[3] = (byte)(var7_int >> -1702901424);
                            la.field_g[5] = (byte)var7_int;
                            la.field_g[4] = (byte)(var7_int >> 863144168);
                            ((bq) this).field_d.a((long)(param4 * 6), (byte) -70);
                            ((bq) this).field_d.a(param2 ^ -50, 6, 0, la.field_g);
                            var8 = 0;
                            var9 = 0;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (param3 <= var8) {
                                statePc = 63;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            var10 = 0;
                            if (param0) {
                                statePc = 22;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            ((bq) this).field_b.a((long)(520 * var7_int), (byte) -70);
                            if (65535 >= param4) {
                                statePc = 27;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            ((bq) this).field_b.a(10, 0, la.field_g, -103);
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof EOFException ? 25 : (stateCaught_23 instanceof IOException ? 66 : 68));
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var14 = (EOFException) (Object) caughtException;
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var13 = 255 & la.field_g[9];
                            var11 = (la.field_g[3] & 255) + (((la.field_g[2] & 255) << 1071316840) + ((la.field_g[0] & 255) << -1594309384)) + (16711680 & la.field_g[1] << -150196560);
                            var12 = ((255 & la.field_g[4]) << 311392904) + (255 & la.field_g[5]);
                            var10 = (65280 & la.field_g[7] << -16308152) + ((255 & la.field_g[6]) << 280622096) - -(la.field_g[8] & 255);
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            ((bq) this).field_b.a(8, 0, la.field_g, -126);
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof EOFException ? 29 : (stateCaught_27 instanceof IOException ? 66 : 68));
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var14 = (EOFException) (Object) caughtException;
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var10 = ((255 & la.field_g[4]) << 1705858864) - (-(65280 & la.field_g[5] << -778771352) + -(la.field_g[6] & 255));
                            var12 = (65280 & la.field_g[2] << 871856136) - -(255 & la.field_g[3]);
                            var11 = (la.field_g[1] & 255) + ((la.field_g[0] & 255) << -431156024);
                            var13 = la.field_g[7] & 255;
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (var11 != param4) {
                                statePc = 35;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 66 : 68);
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
                            statePc = (stateCaught_32 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (((bq) this).field_h == var13) {
                                statePc = 38;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof IOException ? 66 : 68);
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
                            statePc = (stateCaught_35 instanceof IOException ? 66 : 68);
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
                            statePc = 68;
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
                            statePc = (stateCaught_38 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if ((long)var10 > ((bq) this).field_b.c(-1) / 520L) {
                                statePc = 41;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof IOException ? 66 : 68);
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
                            statePc = (stateCaught_41 instanceof IOException ? 66 : 68);
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
                            statePc = 68;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        return stackIn_43_0 != 0;
                    }
                    case 44: {
                        try {
                            if (var10 != 0) {
                                statePc = 51;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            var10 = (int)((519L + ((bq) this).field_b.c(-1)) / 520L);
                            param0 = false;
                            if (var10 == 0) {
                                statePc = 47;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof IOException ? 66 : 68);
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
                            statePc = (stateCaught_47 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if (var10 == var7_int) {
                                statePc = 50;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof IOException ? 66 : 68);
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
                            statePc = (stateCaught_50 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            if ((-var8 + param3 ^ -1) >= -513) {
                                statePc = 53;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof IOException ? 66 : 68);
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
                            statePc = (stateCaught_53 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            if (param4 <= 65535) {
                                statePc = 58;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            la.field_g[3] = (byte)param4;
                            la.field_g[5] = (byte)var9;
                            la.field_g[1] = (byte)(param4 >> 2105833072);
                            la.field_g[2] = (byte)(param4 >> 27612456);
                            la.field_g[8] = (byte)var10;
                            la.field_g[9] = (byte)((bq) this).field_h;
                            la.field_g[0] = (byte)(param4 >> -860476392);
                            la.field_g[7] = (byte)(var10 >> 811846856);
                            la.field_g[6] = (byte)(var10 >> -1535071760);
                            la.field_g[4] = (byte)(var9 >> -1012654392);
                            ((bq) this).field_b.a((long)(520 * var7_int), (byte) -70);
                            ((bq) this).field_b.a(-1, 10, 0, la.field_g);
                            var11 = param3 - var8;
                            if (510 >= var11) {
                                statePc = 57;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof IOException ? 66 : 68);
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
                            statePc = (stateCaught_56 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            ((bq) this).field_b.a(-1, var11, var8, param1);
                            var8 = var8 + var11;
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            la.field_g[6] = (byte)var10;
                            la.field_g[0] = (byte)(param4 >> -278316920);
                            la.field_g[4] = (byte)(var10 >> 2066515376);
                            la.field_g[2] = (byte)(var9 >> 1507951976);
                            la.field_g[3] = (byte)var9;
                            la.field_g[5] = (byte)(var10 >> 818178248);
                            la.field_g[7] = (byte)((bq) this).field_h;
                            la.field_g[1] = (byte)param4;
                            ((bq) this).field_b.a((long)(var7_int * 520), (byte) -70);
                            ((bq) this).field_b.a(param2 ^ -50, 8, 0, la.field_g);
                            var11 = param3 + -var8;
                            if (512 < var11) {
                                statePc = 60;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            var11 = 512;
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            ((bq) this).field_b.a(-1, var11, var8, param1);
                            var8 = var8 + var11;
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = (stateCaught_61 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            var9++;
                            var7_int = var10;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = (stateCaught_62 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            stackOut_63_0 = 1;
                            stackIn_64_0 = stackOut_63_0;
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = (stateCaught_63 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            // monitorexit var6
                            stackOut_64_0 = stackIn_64_0;
                            stackIn_65_0 = stackOut_64_0;
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 68;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        return stackIn_65_0 != 0;
                    }
                    case 66: {
                        try {
                            var7 = (IOException) (Object) caughtException;
                            // monitorexit var6
                            stackOut_66_0 = 0;
                            stackIn_67_0 = stackOut_66_0;
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 68;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        return stackIn_67_0 != 0;
                    }
                    case 68: {
                        try {
                            var15 = caughtException;
                            // monitorexit var6
                            statePc = 69;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 68;
                            continue stateLoop;
                        }
                    }
                    case 69: {
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

    bq(int param0, of param1, of param2, int param3) {
        ((bq) this).field_d = null;
        ((bq) this).field_b = null;
        ((bq) this).field_e = 65000;
        ((bq) this).field_e = param3;
        ((bq) this).field_h = param0;
        ((bq) this).field_b = param1;
        ((bq) this).field_d = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = false;
        field_g = new int[8192];
        field_i = new ao(8, 0, 4, 1);
    }
}
