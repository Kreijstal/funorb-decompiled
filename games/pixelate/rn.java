/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rn {
    private uo field_a;
    private int field_d;
    static wm field_f;
    private uo field_e;
    private int field_c;
    static int field_b;
    static String field_g;

    final boolean a(int param0, byte[] param1, boolean param2, int param3) {
        Object var5 = null;
        Object var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5_ref = (Object) (Object) ((rn) this).field_a;
                    // monitorenter ((rn) this).field_a
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if ((param0 ^ -1) > -1) {
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
                        if (((rn) this).field_c < param0) {
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
                        var6 = this.a(true, 7, param1, param3, param0) ? 1 : 0;
                        if (!param2) {
                            statePc = 8;
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
                        // monitorexit var5_ref
                        stackOut_6_0 = 1;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0 != 0;
                }
                case 8: {
                    try {
                        if (var6 != 0) {
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
                        var6 = this.a(false, 7, param1, param3, param0) ? 1 : 0;
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
                        // monitorexit var5_ref
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
                        // monitorexit var5_ref
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

    private final boolean a(boolean param0, int param1, byte[] param2, int param3, int param4) {
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
            int stackIn_35_0 = 0;
            int stackIn_36_0 = 0;
            int stackIn_41_0 = 0;
            int stackIn_42_0 = 0;
            int stackIn_62_0 = 0;
            int stackIn_63_0 = 0;
            int stackIn_65_0 = 0;
            int stackOut_6_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_12_0 = 0;
            int stackOut_13_0 = 0;
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
                        var16 = Pixelate.field_H ? 1 : 0;
                        var6 = (Object) (Object) ((rn) this).field_a;
                        // monitorenter ((rn) this).field_a
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
                            statePc = (stateCaught_1 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var7_int = (int)((519L + ((rn) this).field_a.a(41)) / 520L);
                            if (var7_int != 0) {
                                statePc = 15;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof IOException ? 64 : 66);
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
                            statePc = (stateCaught_3 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if ((((rn) this).field_e.a(param1 + 59) ^ -1L) > ((long)(6 + param3 * 6) ^ -1L)) {
                                statePc = 6;
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
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof IOException ? 64 : 66);
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
                            statePc = (stateCaught_6 instanceof IOException ? 64 : 66);
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
                            statePc = 66;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        return stackIn_8_0 != 0;
                    }
                    case 9: {
                        try {
                            ((rn) this).field_e.a((long)(6 * param3), 113);
                            ((rn) this).field_e.a(vi.field_K, (byte) 24, 6, 0);
                            var7_int = (vi.field_K[4] << 1709132264 & 65280) + ((vi.field_K[3] << 1453187088 & 16711680) + (vi.field_K[5] & 255));
                            if (-1 <= (var7_int ^ -1)) {
                                statePc = 12;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = (stateCaught_9 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (((rn) this).field_a.a(116) / 520L < (long)var7_int) {
                                statePc = 12;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof IOException ? 64 : 66);
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
                            statePc = (stateCaught_12 instanceof IOException ? 64 : 66);
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
                            statePc = 66;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        return stackIn_14_0 != 0;
                    }
                    case 15: {
                        try {
                            if (param1 == 7) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            ((rn) this).field_c = 14;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            vi.field_K[4] = (byte)(var7_int >> -913538680);
                            vi.field_K[0] = (byte)(param4 >> 1101361424);
                            vi.field_K[5] = (byte)var7_int;
                            vi.field_K[3] = (byte)(var7_int >> -1202333264);
                            vi.field_K[1] = (byte)(param4 >> 164193576);
                            vi.field_K[2] = (byte)param4;
                            ((rn) this).field_e.a((long)(param3 * 6), 118);
                            ((rn) this).field_e.a(6, 0, (byte) -106, vi.field_K);
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
                            if (var8 >= param4) {
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
                            if (param0) {
                                statePc = 21;
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
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            ((rn) this).field_a.a((long)(520 * var7_int), -101);
                            if ((param3 ^ -1) >= -65536) {
                                statePc = 26;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            ((rn) this).field_a.a(vi.field_K, (byte) 24, 10, 0);
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
                            var11 = (vi.field_K[0] << 1875347256 & -16777216) - (-((255 & vi.field_K[1]) << 1231293488) + -((vi.field_K[2] & 255) << -951934392)) - -(vi.field_K[3] & 255);
                            var10 = (vi.field_K[7] << 1893183048 & 65280) + ((255 & vi.field_K[6]) << 664826960) + (vi.field_K[8] & 255);
                            var13 = 255 & vi.field_K[9];
                            var12 = ((255 & vi.field_K[4]) << -752250104) - -(255 & vi.field_K[5]);
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
                            ((rn) this).field_a.a(vi.field_K, (byte) 24, 8, 0);
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
                            var11 = (255 & vi.field_K[1]) + (vi.field_K[0] << 440736488 & 65280);
                            var12 = ((255 & vi.field_K[2]) << -914754808) - -(vi.field_K[3] & 255);
                            var13 = 255 & vi.field_K[7];
                            var10 = (vi.field_K[6] & 255) + ((255 & vi.field_K[5]) << -252034648) + (vi.field_K[4] << -286330640 & 16711680);
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
                            if (var11 != param3) {
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
                            if (var9 != var12) {
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
                            if (var13 != ((rn) this).field_d) {
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
                            if ((long)var10 > ((rn) this).field_a.a(102) / 520L) {
                                statePc = 40;
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
                            statePc = 43;
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
                            if (-1 != (var10 ^ -1)) {
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
                            param0 = false;
                            var10 = (int)((((rn) this).field_a.a(75) + 519L) / 520L);
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
                            if (var10 == var7_int) {
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
                            if (-513 <= param4 - var8) {
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
                            if (-65536 >= param3) {
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
                            vi.field_K[6] = (byte)(var10 >> 734656816);
                            vi.field_K[7] = (byte)(var10 >> 1382533288);
                            vi.field_K[4] = (byte)(var9 >> -200253112);
                            vi.field_K[2] = (byte)(param3 >> -309361304);
                            vi.field_K[8] = (byte)var10;
                            vi.field_K[5] = (byte)var9;
                            vi.field_K[9] = (byte)((rn) this).field_d;
                            vi.field_K[1] = (byte)(param3 >> 770421552);
                            vi.field_K[3] = (byte)param3;
                            vi.field_K[0] = (byte)(param3 >> -269496008);
                            ((rn) this).field_a.a((long)(520 * var7_int), -112);
                            ((rn) this).field_a.a(10, 0, (byte) -88, vi.field_K);
                            var11 = param4 - var8;
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
                            ((rn) this).field_a.a(var11, var8, (byte) -107, param2);
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
                            vi.field_K[4] = (byte)(var10 >> 956319856);
                            vi.field_K[7] = (byte)((rn) this).field_d;
                            vi.field_K[1] = (byte)param3;
                            vi.field_K[5] = (byte)(var10 >> 1257980520);
                            vi.field_K[0] = (byte)(param3 >> -1957155320);
                            vi.field_K[3] = (byte)var9;
                            vi.field_K[2] = (byte)(var9 >> 2115901704);
                            vi.field_K[6] = (byte)var10;
                            ((rn) this).field_a.a((long)(var7_int * 520), 126);
                            ((rn) this).field_a.a(8, 0, (byte) -116, vi.field_K);
                            var11 = param4 - var8;
                            if (512 < var11) {
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
                            ((rn) this).field_a.a(var11, var8, (byte) -89, param2);
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
                            var7_int = var10;
                            var9++;
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

    public static void a(int param0) {
        field_g = null;
        field_f = null;
        if (param0 != 512) {
            Object var2 = null;
            boolean discarded$0 = rn.a((byte) -3, (we) null);
        }
    }

    final static fl a(String param0, byte param1) {
        L0: {
          if (!an.field_e.d(param1 ^ -49)) {
            break L0;
          } else {
            if (!param0.equals((Object) (Object) an.field_e.b((byte) 81))) {
              an.field_e = ii.a((byte) 119, param0);
              break L0;
            } else {
              break L0;
            }
          }
        }
        if (param1 != -99) {
          return null;
        } else {
          return an.field_e;
        }
    }

    final static void a(byte param0) {
        if (param0 < 110) {
            field_g = null;
        }
    }

    public final String toString() {
        return "" + ((rn) this).field_d;
    }

    final static boolean a(byte param0, we param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var2 = param1.f(255);
        if (param0 <= 32) {
          return false;
        } else {
          L0: {
            if ((var2 ^ -1) != -2) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          var3 = stackIn_4_0;
          return var3 != 0;
        }
    }

    final byte[] a(int param0, int param1) {
        try {
            int var3 = 0;
            Object var4 = null;
            IOException var5 = null;
            int var5_int = 0;
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
            Object stackIn_21_0 = null;
            Object stackIn_22_0 = null;
            Object stackIn_44_0 = null;
            Object stackIn_45_0 = null;
            byte[] stackIn_51_0 = null;
            byte[] stackIn_52_0 = null;
            Object stackIn_54_0 = null;
            Object stackOut_20_0 = null;
            Object stackOut_21_0 = null;
            Object stackOut_43_0 = null;
            Object stackOut_44_0 = null;
            byte[] stackOut_50_0 = null;
            byte[] stackOut_51_0 = null;
            Object stackOut_53_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var19 = Pixelate.field_H ? 1 : 0;
                        var3 = -91 % ((param0 - 68) / 41);
                        var4 = (Object) (Object) ((rn) this).field_a;
                        // monitorenter ((rn) this).field_a
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((rn) this).field_e.a(39) >= (long)(6 * param1 + 6)) {
                                statePc = 5;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            // monitorexit var4
                            return null;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            ((rn) this).field_e.a((long)(param1 * 6), -108);
                            ((rn) this).field_e.a(vi.field_K, (byte) 24, 6, 0);
                            var5_int = ((255 & vi.field_K[0]) << -1834250928) + ((65280 & vi.field_K[1] << 1357116616) - -(255 & vi.field_K[2]));
                            var6 = ((255 & vi.field_K[3]) << 1625994992) - (-(vi.field_K[4] << -1919277976 & 65280) + -(255 & vi.field_K[5]));
                            if (-1 >= (var5_int ^ -1)) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            // monitorexit var4
                            return null;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (((rn) this).field_c >= var5_int) {
                                statePc = 11;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            // monitorexit var4
                            return null;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (0 < var6) {
                                statePc = 13;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            // monitorexit var4
                            return null;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if ((((rn) this).field_a.a(52) / 520L ^ -1L) <= ((long)var6 ^ -1L)) {
                                statePc = 17;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            // monitorexit var4
                            return null;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var7 = new byte[var5_int];
                            var8 = 0;
                            var9 = 0;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (var8 >= var5_int) {
                                statePc = 50;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (-1 != (var6 ^ -1)) {
                                statePc = 23;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 53 : 55);
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
                            statePc = (stateCaught_20 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            // monitorexit var4
                            stackOut_21_0 = stackIn_21_0;
                            stackIn_22_0 = stackOut_21_0;
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 55;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        return (byte[]) (Object) stackIn_22_0;
                    }
                    case 23: {
                        try {
                            ((rn) this).field_a.a((long)(var6 * 520), 106);
                            var10 = var5_int + -var8;
                            if (param1 <= 65535) {
                                statePc = 28;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (var10 > 510) {
                                statePc = 26;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var10 = 510;
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var15 = 10;
                            ((rn) this).field_a.a(vi.field_K, (byte) 24, var15 + var10, 0);
                            var14 = 255 & vi.field_K[9];
                            var13 = (vi.field_K[6] << 1116434512 & 16711680) + ((65280 & vi.field_K[7] << -304438744) - -(vi.field_K[8] & 255));
                            var11 = (255 & vi.field_K[3]) + (vi.field_K[2] << -1025002552 & 65280) + ((-16777216 & vi.field_K[0] << -1837166888) - -(vi.field_K[1] << -1746605552 & 16711680));
                            var12 = (255 & vi.field_K[5]) + (65280 & vi.field_K[4] << 260126696);
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var15 = 8;
                            if (512 < var10) {
                                statePc = 30;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var10 = 512;
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            ((rn) this).field_a.a(vi.field_K, (byte) 24, var10 + var15, 0);
                            var11 = (255 & vi.field_K[1]) + (vi.field_K[0] << -1320926040 & 65280);
                            var13 = (255 & vi.field_K[6]) + (vi.field_K[5] << -1914559512 & 65280) + (vi.field_K[4] << -248486320 & 16711680);
                            var12 = (vi.field_K[3] & 255) + (vi.field_K[2] << 1462266856 & 65280);
                            var14 = 255 & vi.field_K[7];
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (var11 == param1) {
                                statePc = 34;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            // monitorexit var4
                            return null;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (var9 == var12) {
                                statePc = 36;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            // monitorexit var4
                            return null;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            if (((rn) this).field_d == var14) {
                                statePc = 40;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            // monitorexit var4
                            return null;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (-1 >= (var13 ^ -1)) {
                                statePc = 42;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            // monitorexit var4
                            return null;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if (((long)var13 ^ -1L) >= (((rn) this).field_a.a(81) / 520L ^ -1L)) {
                                statePc = 46;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof IOException ? 53 : 55);
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
                            statePc = (stateCaught_43 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            // monitorexit var4
                            stackOut_44_0 = stackIn_44_0;
                            stackIn_45_0 = stackOut_44_0;
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 55;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        return (byte[]) (Object) stackIn_45_0;
                    }
                    case 46: {
                        try {
                            var16 = var10 + var15;
                            var6 = var13;
                            var17 = var15;
                            statePc = 47;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            if (var16 <= var17) {
                                statePc = 49;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            var8++;
                            var7[var8] = vi.field_K[var17];
                            var17++;
                            statePc = 47;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            var9++;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            stackOut_50_0 = (byte[]) var7;
                            stackIn_51_0 = stackOut_50_0;
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof IOException ? 53 : 55);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            // monitorexit var4
                            stackOut_51_0 = (byte[]) (Object) stackIn_51_0;
                            stackIn_52_0 = stackOut_51_0;
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 55;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        return stackIn_52_0;
                    }
                    case 53: {
                        try {
                            var5 = (IOException) (Object) caughtException;
                            // monitorexit var4
                            stackOut_53_0 = null;
                            stackIn_54_0 = stackOut_53_0;
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 55;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        return (byte[]) (Object) stackIn_54_0;
                    }
                    case 55: {
                        try {
                            var18 = caughtException;
                            // monitorexit var4
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 55;
                            continue stateLoop;
                        }
                    }
                    case 56: {
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

    rn(int param0, uo param1, uo param2, int param3) {
        ((rn) this).field_a = null;
        ((rn) this).field_e = null;
        ((rn) this).field_c = 65000;
        ((rn) this).field_a = param1;
        ((rn) this).field_d = param0;
        ((rn) this).field_e = param2;
        ((rn) this).field_c = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new wm(0, 2, 2, 1);
        field_g = "Data server full or too many connections from your address. Please try again in a few minutes.";
    }
}
