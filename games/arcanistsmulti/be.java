/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class be {
    static String field_h;
    private int field_n;
    static int[] field_m;
    private int field_k;
    private sd field_e;
    static int[] field_d;
    static ll field_j;
    static boolean field_g;
    static String field_i;
    static String field_a;
    static kc field_b;
    static int field_f;
    private sd field_c;
    static kc field_l;

    final boolean a(byte[] param0, boolean param1, int param2, int param3) {
        Object var5 = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = (Object) (Object) ((be) this).field_c;
                    // monitorenter ((be) this).field_c
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2 < 0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param2 <= ((be) this).field_n) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        throw new IllegalArgumentException();
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var6 = this.a(param3, param1, param2, (byte) -114, param0) ? 1 : 0;
                        if (var6 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var6 = this.a(param3, false, param2, (byte) -114, param0) ? 1 : 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        // monitorexit var5
                        stackOut_7_0 = var6;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0 != 0;
                }
                case 9: {
                    try {
                        var7 = caughtException;
                        // monitorexit var5
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 10: {
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
            Object var19 = null;
            Object stackIn_3_0 = null;
            Object stackIn_4_0 = null;
            Object stackIn_17_0 = null;
            Object stackIn_18_0 = null;
            Object stackIn_38_0 = null;
            Object stackIn_39_0 = null;
            byte[] stackIn_50_0 = null;
            byte[] stackIn_51_0 = null;
            Object stackIn_53_0 = null;
            Object stackOut_2_0 = null;
            Object stackOut_3_0 = null;
            Object stackOut_16_0 = null;
            Object stackOut_17_0 = null;
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
                        var18 = ArcanistsMulti.field_G ? 1 : 0;
                        var3 = (Object) (Object) ((be) this).field_c;
                        // monitorenter ((be) this).field_c
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((be) this).field_e.b((byte) -30) >= (long)(6 + param0 * 6)) {
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
                            stackOut_3_0 = (Object) (Object) stackIn_3_0;
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
                            ((be) this).field_e.a((long)(6 * param0), -116);
                            if (param1 < -56) {
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
                            var19 = null;
                            boolean discarded$1 = ((be) this).a((byte[]) null, true, -34, -67);
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            ((be) this).field_e.a(6, ae.field_c, (byte) -39, 0);
                            var4_int = (255 & ae.field_c[2]) + (16711680 & ae.field_c[0] << 137526960) - -((ae.field_c[1] & 255) << -254183288);
                            var5 = (255 & ae.field_c[5]) + (((255 & ae.field_c[3]) << 1010769936) + ((ae.field_c[4] & 255) << -1833197880));
                            if (var4_int >= 0) {
                                statePc = 9;
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
                    case 9: {
                        try {
                            if (var4_int <= ((be) this).field_n) {
                                statePc = 13;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = (stateCaught_9 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (var5 > 0) {
                                statePc = 15;
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
                    case 15: {
                        try {
                            if ((((be) this).field_c.b((byte) -30) / 520L ^ -1L) <= ((long)var5 ^ -1L)) {
                                statePc = 19;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            stackOut_16_0 = null;
                            stackIn_17_0 = stackOut_16_0;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            // monitorexit var3
                            stackOut_17_0 = (Object) (Object) stackIn_17_0;
                            stackIn_18_0 = stackOut_17_0;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 54;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        return (byte[]) (Object) stackIn_18_0;
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
                            statePc = (stateCaught_19 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (var4_int <= var7) {
                                statePc = 49;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (0 != var5) {
                                statePc = 25;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            ((be) this).field_c.a((long)(520 * var5), -86);
                            var9 = var4_int + -var7;
                            if (-65536 > (param0 ^ -1)) {
                                statePc = 29;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var14 = 8;
                            if ((var9 ^ -1) >= -513) {
                                statePc = 28;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var9 = 512;
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            ((be) this).field_c.a(var14 + var9, ae.field_c, (byte) -39, 0);
                            var12 = (ae.field_c[5] << -286942904 & 65280) + (((255 & ae.field_c[4]) << -447967952) + (ae.field_c[6] & 255));
                            var10 = (ae.field_c[1] & 255) + (65280 & ae.field_c[0] << -696687768);
                            var11 = (255 & ae.field_c[3]) + ((ae.field_c[2] & 255) << -2069850488);
                            var13 = ae.field_c[7] & 255;
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof IOException ? 52 : 54);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var14 = 10;
                            if (-511 <= (var9 ^ -1)) {
                                statePc = 31;
                            } else {
                                statePc = 30;
                            }
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
                            ((be) this).field_c.a(var9 + var14, ae.field_c, (byte) -39, 0);
                            var10 = (ae.field_c[3] & 255) + (((ae.field_c[0] & 255) << -2142843688) - (-(ae.field_c[1] << -797971600 & 16711680) + -(ae.field_c[2] << -991582872 & 65280)));
                            var13 = ae.field_c[9] & 255;
                            var11 = ((ae.field_c[4] & 255) << 1824119208) - -(ae.field_c[5] & 255);
                            var12 = (ae.field_c[7] << -1652196984 & 65280) + ((ae.field_c[6] << -10479792 & 16711680) - -(255 & ae.field_c[8]));
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
                            if (param0 == var10) {
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
                            if (((be) this).field_k == var13) {
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
                            stackOut_38_0 = (Object) (Object) stackIn_38_0;
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
                            if (((be) this).field_c.b((byte) -30) / 520L >= (long)var12) {
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
                            var15 = var14 - -var9;
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
                                statePc = 20;
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
                            var6[var7] = ae.field_c[var16];
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
                        return (byte[]) (Object) stackIn_51_0;
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

    public final String toString() {
        return "" + ((be) this).field_k;
    }

    public static void a(byte param0) {
        field_i = null;
        field_j = null;
        field_h = null;
        field_b = null;
        field_l = null;
        field_d = null;
        int var1 = 6 % ((param0 - 5) / 37);
        field_m = null;
        field_a = null;
    }

    final static int a(int param0) {
        if (param0 != 1497225488) {
            return -32;
        }
        return hg.field_b;
    }

    private final boolean a(int param0, boolean param1, int param2, byte param3, byte[] param4) {
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
            int stackIn_9_0 = 0;
            int stackIn_10_0 = 0;
            int stackIn_15_0 = 0;
            int stackIn_16_0 = 0;
            int stackIn_35_0 = 0;
            int stackIn_36_0 = 0;
            int stackIn_41_0 = 0;
            int stackIn_42_0 = 0;
            int stackIn_62_0 = 0;
            int stackIn_63_0 = 0;
            int stackIn_65_0 = 0;
            int stackOut_8_0 = 0;
            int stackOut_9_0 = 0;
            int stackOut_14_0 = 0;
            int stackOut_15_0 = 0;
            int stackOut_34_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_62_0 = 0;
            int stackOut_64_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = ArcanistsMulti.field_G ? 1 : 0;
                        var6 = (Object) (Object) ((be) this).field_c;
                        // monitorenter ((be) this).field_c
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (param3 < -73) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 66;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            ((be) this).field_e = null;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 66;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (param1) {
                                statePc = 6;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = (stateCaught_3 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var7_int = (int)((((be) this).field_c.b((byte) -30) - -519L) / 520L);
                            if (0 != var7_int) {
                                statePc = 17;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = (stateCaught_4 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var7_int = 1;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if ((((be) this).field_e.b((byte) -30) ^ -1L) > ((long)(6 * param0 + 6) ^ -1L)) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            stackOut_8_0 = 0;
                            stackIn_9_0 = stackOut_8_0;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            // monitorexit var6
                            stackOut_9_0 = stackIn_9_0;
                            stackIn_10_0 = stackOut_9_0;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 66;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        return stackIn_10_0 != 0;
                    }
                    case 11: {
                        try {
                            ((be) this).field_e.a((long)(6 * param0), -111);
                            ((be) this).field_e.a(6, ae.field_c, (byte) -39, 0);
                            var7_int = (ae.field_c[5] & 255) + (((ae.field_c[3] & 255) << 303575952) + (65280 & ae.field_c[4] << -152524856));
                            if (var7_int <= 0) {
                                statePc = 14;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if (((be) this).field_c.b((byte) -30) / 520L < (long)var7_int) {
                                statePc = 14;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            stackOut_14_0 = 0;
                            stackIn_15_0 = stackOut_14_0;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            // monitorexit var6
                            stackOut_15_0 = stackIn_15_0;
                            stackIn_16_0 = stackOut_15_0;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 66;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        return stackIn_16_0 != 0;
                    }
                    case 17: {
                        try {
                            ae.field_c[0] = (byte)(param2 >> 1328454960);
                            ae.field_c[3] = (byte)(var7_int >> 485041232);
                            ae.field_c[1] = (byte)(param2 >> -874613336);
                            ae.field_c[4] = (byte)(var7_int >> -1763536088);
                            ae.field_c[5] = (byte)var7_int;
                            ae.field_c[2] = (byte)param2;
                            ((be) this).field_e.a((long)(param0 * 6), -104);
                            ((be) this).field_e.a((byte) -53, 0, ae.field_c, 6);
                            var8 = 0;
                            var9 = 0;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (param2 <= var8) {
                                statePc = 61;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var10 = 0;
                            if (!param1) {
                                statePc = 43;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            ((be) this).field_c.a((long)(520 * var7_int), -88);
                            if (-65536 > (param0 ^ -1)) {
                                statePc = 26;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            ((be) this).field_c.a(8, ae.field_c, (byte) -39, 0);
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof EOFException ? 24 : (stateCaught_22 instanceof IOException ? 64 : 66));
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var14 = (EOFException) (Object) caughtException;
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var10 = (65280 & ae.field_c[5] << -588502936) + (((255 & ae.field_c[4]) << -2038258160) + (255 & ae.field_c[6]));
                            var11 = (ae.field_c[1] & 255) + ((255 & ae.field_c[0]) << -348820760);
                            var13 = 255 & ae.field_c[7];
                            var12 = (255 & ae.field_c[3]) + ((255 & ae.field_c[2]) << 1782413960);
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            ((be) this).field_c.a(10, ae.field_c, (byte) -39, 0);
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof EOFException ? 28 : (stateCaught_26 instanceof IOException ? 64 : 66));
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var14 = (EOFException) (Object) caughtException;
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var12 = (255 & ae.field_c[5]) + (ae.field_c[4] << -249619672 & 65280);
                            var10 = (65280 & ae.field_c[7] << -255316344) + ((255 & ae.field_c[6]) << 1497225488) + (ae.field_c[8] & 255);
                            var11 = (ae.field_c[3] & 255) + ((-16777216 & ae.field_c[0] << 1340860504) - (-((255 & ae.field_c[1]) << 76963376) - ((ae.field_c[2] & 255) << 1519912744)));
                            var13 = 255 & ae.field_c[9];
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (var11 != param0) {
                                statePc = 34;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof IOException ? 64 : 66);
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
                            statePc = (stateCaught_31 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (var13 != ((be) this).field_k) {
                                statePc = 34;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof IOException ? 64 : 66);
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
                            statePc = (stateCaught_34 instanceof IOException ? 64 : 66);
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
                            statePc = 66;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        return stackIn_36_0 != 0;
                    }
                    case 37: {
                        try {
                            if (0 > var10) {
                                statePc = 40;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (((be) this).field_c.b((byte) -30) / 520L >= (long)var10) {
                                statePc = 43;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof IOException ? 64 : 66);
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
                            statePc = (stateCaught_40 instanceof IOException ? 64 : 66);
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
                            statePc = 66;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        return stackIn_42_0 != 0;
                    }
                    case 43: {
                        try {
                            if (0 != var10) {
                                statePc = 49;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            var10 = (int)((519L + ((be) this).field_c.b((byte) -30)) / 520L);
                            param1 = false;
                            if (0 != var10) {
                                statePc = 46;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof IOException ? 64 : 66);
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
                            statePc = (stateCaught_45 instanceof IOException ? 64 : 66);
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
                            statePc = (stateCaught_46 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof IOException ? 64 : 66);
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
                            statePc = (stateCaught_48 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            if (512 >= param2 + -var8) {
                                statePc = 51;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof IOException ? 64 : 66);
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
                            statePc = (stateCaught_51 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            if ((param0 ^ -1) >= -65536) {
                                statePc = 56;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            ae.field_c[7] = (byte)(var10 >> 2108083592);
                            ae.field_c[6] = (byte)(var10 >> 1349537648);
                            ae.field_c[0] = (byte)(param0 >> -1678185352);
                            ae.field_c[4] = (byte)(var9 >> -1931575032);
                            ae.field_c[3] = (byte)param0;
                            ae.field_c[2] = (byte)(param0 >> 1616447656);
                            ae.field_c[9] = (byte)((be) this).field_k;
                            ae.field_c[5] = (byte)var9;
                            ae.field_c[1] = (byte)(param0 >> -1638365648);
                            ae.field_c[8] = (byte)var10;
                            ((be) this).field_c.a((long)(var7_int * 520), -88);
                            ((be) this).field_c.a((byte) -53, 0, ae.field_c, 10);
                            var11 = -var8 + param2;
                            if ((var11 ^ -1) >= -511) {
                                statePc = 55;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            var11 = 510;
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            ((be) this).field_c.a((byte) -53, var8, param4, var11);
                            var8 = var8 + var11;
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            ae.field_c[6] = (byte)var10;
                            ae.field_c[5] = (byte)(var10 >> 1032974728);
                            ae.field_c[3] = (byte)var9;
                            ae.field_c[0] = (byte)(param0 >> 2143179304);
                            ae.field_c[4] = (byte)(var10 >> 227484720);
                            ae.field_c[2] = (byte)(var9 >> 1439090216);
                            ae.field_c[7] = (byte)((be) this).field_k;
                            ae.field_c[1] = (byte)param0;
                            ((be) this).field_c.a((long)(520 * var7_int), -112);
                            ((be) this).field_c.a((byte) -53, 0, ae.field_c, 8);
                            var11 = -var8 + param2;
                            if (var11 > 512) {
                                statePc = 58;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof IOException ? 64 : 66);
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
                            statePc = (stateCaught_58 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            ((be) this).field_c.a((byte) -53, var8, param4, var11);
                            var8 = var8 + var11;
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            var9++;
                            var7_int = var10;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            stackOut_61_0 = 1;
                            stackIn_62_0 = stackOut_61_0;
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = (stateCaught_61 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            // monitorexit var6
                            stackOut_62_0 = stackIn_62_0;
                            stackIn_63_0 = stackOut_62_0;
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 66;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        return stackIn_63_0 != 0;
                    }
                    case 64: {
                        try {
                            var7 = (IOException) (Object) caughtException;
                            // monitorexit var6
                            stackOut_64_0 = 0;
                            stackIn_65_0 = stackOut_64_0;
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 66;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        return stackIn_65_0 != 0;
                    }
                    case 66: {
                        try {
                            var15 = caughtException;
                            // monitorexit var6
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 66;
                            continue stateLoop;
                        }
                    }
                    case 67: {
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

    final static void a(int param0, vd param1, String param2, dj param3, byte param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        if (param4 == 35) {
          var5 = 0;
          var6 = -1;
          var7 = 1;
          L0: while (true) {
            if (param2.length() <= var7) {
              return;
            } else {
              L1: {
                var8 = param2.charAt(var7);
                if (60 != var8) {
                  break L1;
                } else {
                  var6 = param1.field_f[0] + (var5 >> -1991223736) + param3.b(param2.substring(0, var7));
                  break L1;
                }
              }
              L2: {
                if (0 != (var6 ^ -1)) {
                  param1.field_f[var7] = var6;
                  break L2;
                } else {
                  L3: {
                    if (32 != var8) {
                      break L3;
                    } else {
                      var5 = var5 + param0;
                      break L3;
                    }
                  }
                  param1.field_f[var7] = (var5 >> 1124157928) + param1.field_f[0] - (-param3.b(param2.substring(0, var7 - -1)) - -param3.a((char) var8));
                  break L2;
                }
              }
              if (var8 == 62) {
                var6 = -1;
                var7++;
                continue L0;
              } else {
                var7++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final static long a(CharSequence param0, boolean param1) {
        long var2 = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = ArcanistsMulti.field_G ? 1 : 0;
          if (!param1) {
            break L0;
          } else {
            int discarded$2 = be.a(-40);
            break L0;
          }
        }
        var2 = 0L;
        var4 = param0.length();
        var5 = 0;
        L1: while (true) {
          L2: {
            if (var5 >= var4) {
              break L2;
            } else {
              L3: {
                L4: {
                  var2 = var2 * 37L;
                  var6 = param0.charAt(var5);
                  if (var6 < 65) {
                    break L4;
                  } else {
                    if (90 < var6) {
                      break L4;
                    } else {
                      var2 = var2 + (long)(-65 + (var6 + 1));
                      break L3;
                    }
                  }
                }
                L5: {
                  if (var6 < 97) {
                    break L5;
                  } else {
                    if (122 >= var6) {
                      var2 = var2 + (long)(var6 + 1 - 97);
                      break L3;
                    } else {
                      break L5;
                    }
                  }
                }
                if (var6 < 48) {
                  break L3;
                } else {
                  if (57 >= var6) {
                    var2 = var2 + (long)(var6 + -21);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              if (177917621779460413L <= var2) {
                break L2;
              } else {
                var5++;
                continue L1;
              }
            }
          }
          L6: while (true) {
            L7: {
              if (0L != var2 % 37L) {
                break L7;
              } else {
                if (var2 == 0L) {
                  break L7;
                } else {
                  var2 = var2 / 37L;
                  continue L6;
                }
              }
            }
            return var2;
          }
        }
    }

    be(int param0, sd param1, sd param2, int param3) {
        ((be) this).field_e = null;
        ((be) this).field_n = 65000;
        ((be) this).field_c = null;
        ((be) this).field_n = param3;
        ((be) this).field_c = param1;
        ((be) this).field_k = param0;
        ((be) this).field_e = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "MOST SKILLFUL - ";
        field_m = new int[8192];
        field_h = "Only two targets left! You have no control over the direction that the attack comes in at, so be careful if you are too close.";
        field_i = "Elements Expansion";
        field_f = 0;
    }
}
