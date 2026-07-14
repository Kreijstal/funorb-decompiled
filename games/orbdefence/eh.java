/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class eh {
    private int field_f;
    private dj field_b;
    static int field_a;
    private dj field_d;
    private int field_e;
    static volatile int field_c;

    final boolean a(byte[] param0, int param1, int param2, int param3) {
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
                    if (param1 == 255) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    ((eh) this).field_d = null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var5 = (Object) (Object) ((eh) this).field_d;
                    // monitorenter ((eh) this).field_d
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
                        if (param2 <= ((eh) this).field_e) {
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
                        var6 = this.a(param0, true, param3, true, param2) ? 1 : 0;
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
                        var6 = this.a(param0, true, param3, false, param2) ? 1 : 0;
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

    private final boolean a(byte[] param0, boolean param1, int param2, boolean param3, int param4) {
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
            int stackIn_33_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_39_0 = 0;
            int stackIn_40_0 = 0;
            dj stackIn_52_0 = null;
            dj stackIn_53_0 = null;
            dj stackIn_54_0 = null;
            int stackIn_54_1 = 0;
            dj stackIn_59_0 = null;
            dj stackIn_60_0 = null;
            dj stackIn_61_0 = null;
            int stackIn_61_1 = 0;
            dj stackIn_65_0 = null;
            dj stackIn_66_0 = null;
            dj stackIn_67_0 = null;
            int stackIn_67_1 = 0;
            boolean stackIn_70_0 = false;
            boolean stackIn_71_0 = false;
            int stackIn_73_0 = 0;
            int stackOut_4_0 = 0;
            int stackOut_5_0 = 0;
            int stackOut_10_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_32_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_38_0 = 0;
            int stackOut_39_0 = 0;
            dj stackOut_51_0 = null;
            dj stackOut_52_0 = null;
            int stackOut_52_1 = 0;
            dj stackOut_53_0 = null;
            int stackOut_53_1 = 0;
            dj stackOut_58_0 = null;
            dj stackOut_59_0 = null;
            int stackOut_59_1 = 0;
            dj stackOut_60_0 = null;
            int stackOut_60_1 = 0;
            dj stackOut_64_0 = null;
            dj stackOut_65_0 = null;
            int stackOut_65_1 = 0;
            dj stackOut_66_0 = null;
            int stackOut_66_1 = 0;
            boolean stackOut_69_0 = false;
            boolean stackOut_70_0 = false;
            int stackOut_72_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = OrbDefence.field_D ? 1 : 0;
                        var6 = (Object) (Object) ((eh) this).field_d;
                        // monitorenter ((eh) this).field_d
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (!param3) {
                                statePc = 13;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (((long)(6 + 6 * param2) ^ -1L) < (((eh) this).field_b.b(-34) ^ -1L)) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = (stateCaught_3 instanceof IOException ? 72 : 74);
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
                            statePc = (stateCaught_4 instanceof IOException ? 72 : 74);
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
                            statePc = 74;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        return stackIn_6_0 != 0;
                    }
                    case 7: {
                        try {
                            ((eh) this).field_b.a((long)(param2 * 6), -1);
                            ((eh) this).field_b.a(0, (byte) -119, 6, bi.field_c);
                            var7_int = (bi.field_c[4] << 1504311912 & 65280) + ((bi.field_c[3] << -958841744 & 16711680) + (bi.field_c[5] & 255));
                            if (0 >= var7_int) {
                                statePc = 10;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (((long)var7_int ^ -1L) >= (((eh) this).field_d.b(-103) / 520L ^ -1L)) {
                                statePc = 15;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = (stateCaught_9 instanceof IOException ? 72 : 74);
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
                            statePc = (stateCaught_10 instanceof IOException ? 72 : 74);
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
                            statePc = 74;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        return stackIn_12_0 != 0;
                    }
                    case 13: {
                        try {
                            var7_int = (int)((519L + ((eh) this).field_d.b(-107)) / 520L);
                            if (var7_int != 0) {
                                statePc = 15;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof IOException ? 72 : 74);
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
                            statePc = (stateCaught_14 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            bi.field_c[3] = (byte)(var7_int >> -867337680);
                            bi.field_c[1] = (byte)(param4 >> 2066150472);
                            bi.field_c[4] = (byte)(var7_int >> -1180948952);
                            bi.field_c[0] = (byte)(param4 >> 1871805904);
                            bi.field_c[5] = (byte)var7_int;
                            bi.field_c[2] = (byte)param4;
                            ((eh) this).field_b.a((long)(6 * param2), -1);
                            ((eh) this).field_b.a(false, bi.field_c, 6, 0);
                            var8 = 0;
                            var9 = 0;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (var8 >= param4) {
                                statePc = 69;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var10 = 0;
                            if (param3) {
                                statePc = 19;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            ((eh) this).field_d.a((long)(var7_int * 520), -1);
                            if ((param2 ^ -1) >= -65536) {
                                statePc = 24;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            ((eh) this).field_d.a(0, (byte) -128, 10, bi.field_c);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof EOFException ? 22 : (stateCaught_20 instanceof IOException ? 72 : 74));
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var14 = (EOFException) (Object) caughtException;
                            statePc = 69;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var10 = ((255 & bi.field_c[6]) << -817022192) - -(65280 & bi.field_c[7] << -1997624536) - -(255 & bi.field_c[8]);
                            var12 = ((bi.field_c[4] & 255) << 132880584) + (bi.field_c[5] & 255);
                            var13 = bi.field_c[9] & 255;
                            var11 = (bi.field_c[3] & 255) + (((255 & bi.field_c[1]) << 1965377168) + (((255 & bi.field_c[0]) << -685276200) + ((255 & bi.field_c[2]) << 1793109224)));
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            ((eh) this).field_d.a(0, (byte) 81, 8, bi.field_c);
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof EOFException ? 26 : (stateCaught_24 instanceof IOException ? 72 : 74));
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var14 = (EOFException) (Object) caughtException;
                            statePc = 69;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var10 = (255 & bi.field_c[6]) + (((255 & bi.field_c[4]) << 1465092944) + (65280 & bi.field_c[5] << 79431016));
                            var13 = 255 & bi.field_c[7];
                            var12 = (bi.field_c[3] & 255) + ((255 & bi.field_c[2]) << 2034003304);
                            var11 = ((255 & bi.field_c[0]) << -1989688888) + (255 & bi.field_c[1]);
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (var11 != param2) {
                                statePc = 32;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (var9 != var12) {
                                statePc = 32;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (((eh) this).field_f != var13) {
                                statePc = 32;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 72 : 74);
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
                            statePc = (stateCaught_32 instanceof IOException ? 72 : 74);
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
                            statePc = 74;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        return stackIn_34_0 != 0;
                    }
                    case 35: {
                        try {
                            if (-1 < (var10 ^ -1)) {
                                statePc = 38;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            if ((long)var10 > ((eh) this).field_d.b(114) / 520L) {
                                statePc = 38;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof IOException ? 72 : 74);
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
                            statePc = (stateCaught_38 instanceof IOException ? 72 : 74);
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
                            statePc = 74;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        return stackIn_40_0 != 0;
                    }
                    case 41: {
                        try {
                            if (var10 == 0) {
                                statePc = 43;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            var10 = (int)((((eh) this).field_d.b(123) + 519L) / 520L);
                            param3 = false;
                            if (var10 != 0) {
                                statePc = 45;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            var10++;
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            if (var7_int == var10) {
                                statePc = 47;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof IOException ? 72 : 74);
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
                            statePc = (stateCaught_47 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if (param4 - var8 > 512) {
                                statePc = 50;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            var10 = 0;
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            if ((param2 ^ -1) < -65536) {
                                statePc = 58;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            bi.field_c[2] = (byte)(var9 >> -1029826360);
                            bi.field_c[5] = (byte)(var10 >> 415630792);
                            bi.field_c[6] = (byte)var10;
                            bi.field_c[7] = (byte)((eh) this).field_f;
                            bi.field_c[0] = (byte)(param2 >> 397246344);
                            bi.field_c[1] = (byte)param2;
                            bi.field_c[4] = (byte)(var10 >> 295660592);
                            bi.field_c[3] = (byte)var9;
                            ((eh) this).field_d.a((long)(var7_int * 520), -1);
                            stackOut_51_0 = ((eh) this).field_d;
                            stackIn_53_0 = stackOut_51_0;
                            stackIn_52_0 = stackOut_51_0;
                            if (param1) {
                                statePc = 53;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            stackOut_52_0 = (dj) (Object) stackIn_52_0;
                            stackOut_52_1 = 1;
                            stackIn_54_0 = stackOut_52_0;
                            stackIn_54_1 = stackOut_52_1;
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            stackOut_53_0 = (dj) (Object) stackIn_53_0;
                            stackOut_53_1 = 0;
                            stackIn_54_0 = stackOut_53_0;
                            stackIn_54_1 = stackOut_53_1;
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            ((dj) (Object) stackIn_54_0).a(stackIn_54_1 != 0, bi.field_c, 8, 0);
                            var11 = -var8 + param4;
                            if (512 < var11) {
                                statePc = 56;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof IOException ? 72 : 74);
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
                            statePc = (stateCaught_56 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            ((eh) this).field_d.a(false, param0, var11, var8);
                            var8 = var8 + var11;
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            bi.field_c[4] = (byte)(var9 >> 1830743496);
                            bi.field_c[9] = (byte)((eh) this).field_f;
                            bi.field_c[1] = (byte)(param2 >> -530000048);
                            bi.field_c[0] = (byte)(param2 >> -1194524584);
                            bi.field_c[5] = (byte)var9;
                            bi.field_c[6] = (byte)(var10 >> -458731184);
                            bi.field_c[2] = (byte)(param2 >> -960265624);
                            bi.field_c[8] = (byte)var10;
                            bi.field_c[7] = (byte)(var10 >> 1582423656);
                            bi.field_c[3] = (byte)param2;
                            ((eh) this).field_d.a((long)(520 * var7_int), -1);
                            stackOut_58_0 = ((eh) this).field_d;
                            stackIn_60_0 = stackOut_58_0;
                            stackIn_59_0 = stackOut_58_0;
                            if (param1) {
                                statePc = 60;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            stackOut_59_0 = (dj) (Object) stackIn_59_0;
                            stackOut_59_1 = 1;
                            stackIn_61_0 = stackOut_59_0;
                            stackIn_61_1 = stackOut_59_1;
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            stackOut_60_0 = (dj) (Object) stackIn_60_0;
                            stackOut_60_1 = 0;
                            stackIn_61_0 = stackOut_60_0;
                            stackIn_61_1 = stackOut_60_1;
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            ((dj) (Object) stackIn_61_0).a(stackIn_61_1 != 0, bi.field_c, 10, 0);
                            var11 = param4 + -var8;
                            if (var11 > 510) {
                                statePc = 63;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = (stateCaught_61 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = (stateCaught_62 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            var11 = 510;
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = (stateCaught_63 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            stackOut_64_0 = ((eh) this).field_d;
                            stackIn_66_0 = stackOut_64_0;
                            stackIn_65_0 = stackOut_64_0;
                            if (param1) {
                                statePc = 66;
                            } else {
                                statePc = 65;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = (stateCaught_64 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            stackOut_65_0 = (dj) (Object) stackIn_65_0;
                            stackOut_65_1 = 1;
                            stackIn_67_0 = stackOut_65_0;
                            stackIn_67_1 = stackOut_65_1;
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = (stateCaught_65 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            stackOut_66_0 = (dj) (Object) stackIn_66_0;
                            stackOut_66_1 = 0;
                            stackIn_67_0 = stackOut_66_0;
                            stackIn_67_1 = stackOut_66_1;
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = (stateCaught_66 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            ((dj) (Object) stackIn_67_0).a(stackIn_67_1 != 0, param0, var11, var8);
                            var8 = var8 + var11;
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = (stateCaught_67 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            var9++;
                            var7_int = var10;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = (stateCaught_68 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            stackOut_69_0 = param1;
                            stackIn_70_0 = stackOut_69_0;
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = (stateCaught_69 instanceof IOException ? 72 : 74);
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            // monitorexit var6
                            stackOut_70_0 = stackIn_70_0;
                            stackIn_71_0 = stackOut_70_0;
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 74;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        return stackIn_71_0;
                    }
                    case 72: {
                        try {
                            var7 = (IOException) (Object) caughtException;
                            // monitorexit var6
                            stackOut_72_0 = 0;
                            stackIn_73_0 = stackOut_72_0;
                            statePc = 73;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 74;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        return stackIn_73_0 != 0;
                    }
                    case 74: {
                        try {
                            var15 = caughtException;
                            // monitorexit var6
                            statePc = 75;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 74;
                            continue stateLoop;
                        }
                    }
                    case 75: {
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
        return "" + ((eh) this).field_f;
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
            Object stackIn_9_0 = null;
            Object stackIn_10_0 = null;
            Object stackIn_15_0 = null;
            Object stackIn_16_0 = null;
            Object stackIn_19_0 = null;
            Object stackIn_20_0 = null;
            byte[] stackIn_53_0 = null;
            byte[] stackIn_54_0 = null;
            Object stackIn_56_0 = null;
            Object stackOut_2_0 = null;
            Object stackOut_3_0 = null;
            Object stackOut_8_0 = null;
            Object stackOut_9_0 = null;
            Object stackOut_14_0 = null;
            Object stackOut_15_0 = null;
            Object stackOut_18_0 = null;
            Object stackOut_19_0 = null;
            byte[] stackOut_52_0 = null;
            byte[] stackOut_53_0 = null;
            Object stackOut_55_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var18 = OrbDefence.field_D ? 1 : 0;
                        var3 = (Object) (Object) ((eh) this).field_d;
                        // monitorenter ((eh) this).field_d
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if ((long)(6 * param1 + 6) <= ((eh) this).field_b.b(126)) {
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
                            ((eh) this).field_b.a((long)(param1 * 6), -1);
                            ((eh) this).field_b.a(0, (byte) -18, 6, bi.field_c);
                            var4_int = ((255 & bi.field_c[0]) << -1991704496) + (bi.field_c[1] << -691810104 & 65280) - -(bi.field_c[2] & 255);
                            var5 = (bi.field_c[3] << -689978512 & 16711680) - (-((bi.field_c[4] & 255) << -1630682424) + -(bi.field_c[5] & 255));
                            if (0 <= var4_int) {
                                statePc = 7;
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
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (((eh) this).field_e >= var4_int) {
                                statePc = 11;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof IOException ? 55 : 57);
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
                            statePc = (stateCaught_8 instanceof IOException ? 55 : 57);
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
                            statePc = 57;
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
                    case 13: {
                        try {
                            if ((((eh) this).field_d.b(107) / 520L ^ -1L) <= ((long)var5 ^ -1L)) {
                                statePc = 17;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof IOException ? 55 : 57);
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
                            statePc = (stateCaught_14 instanceof IOException ? 55 : 57);
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
                            statePc = 57;
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
                            if (param0 == 520) {
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
                            if (var7 >= var4_int) {
                                statePc = 52;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (var5 != 0) {
                                statePc = 26;
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
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            ((eh) this).field_d.a((long)(var5 * 520), -1);
                            var9 = var4_int - var7;
                            if (65535 < param1) {
                                statePc = 31;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var14 = 8;
                            if (512 < var9) {
                                statePc = 29;
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
                            statePc = 30;
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
                            ((eh) this).field_d.a(0, (byte) -125, var14 + var9, bi.field_c);
                            var12 = (65280 & bi.field_c[5] << 2126659656) + ((bi.field_c[4] & 255) << 918270832) - -(bi.field_c[6] & 255);
                            var13 = 255 & bi.field_c[7];
                            var11 = (bi.field_c[3] & 255) + ((255 & bi.field_c[2]) << -649605752);
                            var10 = (bi.field_c[1] & 255) + ((255 & bi.field_c[0]) << -248854168);
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if ((var9 ^ -1) < -511) {
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
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof IOException ? 55 : 57);
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
                            statePc = (stateCaught_33 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            var14 = 10;
                            ((eh) this).field_d.a(0, (byte) -111, var9 - -var14, bi.field_c);
                            var11 = ((bi.field_c[4] & 255) << 1200956808) - -(bi.field_c[5] & 255);
                            var10 = (bi.field_c[3] & 255) + (bi.field_c[0] << -1678604392 & -16777216) + (bi.field_c[1] << -251246064 & 16711680) + ((bi.field_c[2] & 255) << 2077602632);
                            var13 = bi.field_c[9] & 255;
                            var12 = (255 & bi.field_c[8]) + ((bi.field_c[6] << 65917456 & 16711680) + ((bi.field_c[7] & 255) << 1170133736));
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof IOException ? 55 : 57);
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
                            statePc = (stateCaught_35 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof IOException ? 55 : 57);
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
                            statePc = (stateCaught_37 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if (((eh) this).field_f == var13) {
                                statePc = 43;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            if (0 <= var12) {
                                statePc = 45;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            if (((eh) this).field_d.b(param0 ^ -587) / 520L >= (long)var12) {
                                statePc = 49;
                            } else {
                                statePc = 46;
                            }
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
                            return null;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            var15 = var14 + var9;
                            var8++;
                            var5 = var12;
                            var16 = var14;
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            if (var15 <= var16) {
                                statePc = 21;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            var7++;
                            var6[var7] = bi.field_c[var16];
                            var16++;
                            statePc = 50;
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

    eh(int param0, dj param1, dj param2, int param3) {
        ((eh) this).field_e = 65000;
        ((eh) this).field_d = null;
        ((eh) this).field_b = null;
        ((eh) this).field_d = param1;
        ((eh) this).field_b = param2;
        ((eh) this).field_f = param0;
        ((eh) this).field_e = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
    }
}
