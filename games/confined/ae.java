/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ae {
    static String field_c;
    private int field_a;
    static vc field_f;
    private int field_g;
    static String field_b;
    static String field_e;
    private pf field_h;
    private pf field_d;

    public final String toString() {
        return "" + ((ae) this).field_a;
    }

    final boolean a(int param0, int param1, byte[] param2, int param3) {
        Object var5 = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = (Object) (Object) ((ae) this).field_h;
                    // monitorenter ((ae) this).field_h
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 < (param1 ^ -1)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (((ae) this).field_g >= param1) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        throw new IllegalArgumentException();
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var6 = this.a(param2, true, param3, param1, (byte) -15) ? 1 : 0;
                        if (var6 != 0) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var6 = this.a(param2, false, param3, param1, (byte) -15) ? 1 : 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        // monitorexit var5
                        stackOut_6_0 = var6;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0 != 0;
                }
                case 8: {
                    try {
                        var7 = caughtException;
                        // monitorexit var5
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 9: {
                    throw (RuntimeException) (Object) var7;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final boolean a(byte[] param0, boolean param1, int param2, int param3, byte param4) {
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
            int stackIn_66_0 = 0;
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
            int stackOut_65_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = Confined.field_J ? 1 : 0;
                        var6 = (Object) (Object) ((ae) this).field_h;
                        // monitorenter ((ae) this).field_h
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (!param1) {
                                statePc = 13;
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
                            if ((long)(param2 * 6 + 6) > ((ae) this).field_d.b((byte) 97)) {
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
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = (stateCaught_3 instanceof IOException ? 65 : 67);
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
                            statePc = (stateCaught_4 instanceof IOException ? 65 : 67);
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
                            statePc = 67;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        return stackIn_6_0 != 0;
                    }
                    case 7: {
                        try {
                            ((ae) this).field_d.a((byte) 123, (long)(6 * param2));
                            ((ae) this).field_d.a(0, gi.field_db, (byte) 122, 6);
                            var7_int = (gi.field_db[5] & 255) + (gi.field_db[3] << 80007984 & 16711680) - -(65280 & gi.field_db[4] << -1374026936);
                            if (var7_int <= 0) {
                                statePc = 10;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if ((((ae) this).field_h.b((byte) 111) / 520L ^ -1L) > ((long)var7_int ^ -1L)) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = (stateCaught_9 instanceof IOException ? 65 : 67);
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
                            statePc = (stateCaught_10 instanceof IOException ? 65 : 67);
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
                            statePc = 67;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        return stackIn_12_0 != 0;
                    }
                    case 13: {
                        try {
                            var7_int = (int)((((ae) this).field_h.b((byte) 99) + 519L) / 520L);
                            if (var7_int == 0) {
                                statePc = 15;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof IOException ? 65 : 67);
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
                            statePc = (stateCaught_15 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            gi.field_db[2] = (byte)param3;
                            gi.field_db[0] = (byte)(param3 >> 1141638128);
                            gi.field_db[4] = (byte)(var7_int >> -1670097176);
                            gi.field_db[1] = (byte)(param3 >> 636735624);
                            gi.field_db[5] = (byte)var7_int;
                            gi.field_db[3] = (byte)(var7_int >> 463273040);
                            ((ae) this).field_d.a((byte) 123, (long)(6 * param2));
                            ((ae) this).field_d.a(6, (byte) 9, 0, gi.field_db);
                            var8 = 0;
                            var9 = 0;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (param3 <= var8) {
                                statePc = 60;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var10 = 0;
                            if (param1) {
                                statePc = 20;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            ((ae) this).field_h.a((byte) 123, (long)(var7_int * 520));
                            if (65535 < param2) {
                                statePc = 25;
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
                            ((ae) this).field_h.a(0, gi.field_db, (byte) 89, 8);
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof EOFException ? 23 : (stateCaught_21 instanceof IOException ? 65 : 67));
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 65 : 67);
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
                            statePc = (stateCaught_23 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var13 = gi.field_db[7] & 255;
                            var10 = (gi.field_db[6] & 255) + ((16711680 & gi.field_db[4] << 1088006384) - -((255 & gi.field_db[5]) << 1577761576));
                            var12 = (65280 & gi.field_db[2] << -1184060728) + (255 & gi.field_db[3]);
                            var11 = ((255 & gi.field_db[0]) << 761202984) + (255 & gi.field_db[1]);
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            ((ae) this).field_h.a(0, gi.field_db, (byte) 107, 10);
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof EOFException ? 27 : (stateCaught_25 instanceof IOException ? 65 : 67));
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 65 : 67);
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
                            statePc = (stateCaught_27 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var13 = gi.field_db[9] & 255;
                            var10 = (65280 & gi.field_db[7] << 1558216712) + (((255 & gi.field_db[6]) << 986335632) - -(gi.field_db[8] & 255));
                            var12 = (gi.field_db[5] & 255) + (65280 & gi.field_db[4] << -1665764664);
                            var11 = (16711680 & gi.field_db[1] << -1609961424) + (((gi.field_db[0] & 255) << -9011944) - -(gi.field_db[2] << -1536628504 & 65280)) + (255 & gi.field_db[3]);
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (var11 != param2) {
                                statePc = 33;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof IOException ? 65 : 67);
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
                            statePc = (stateCaught_30 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (((ae) this).field_a == var13) {
                                statePc = 36;
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
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof IOException ? 65 : 67);
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
                            statePc = (stateCaught_33 instanceof IOException ? 65 : 67);
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
                            statePc = 67;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        return stackIn_35_0 != 0;
                    }
                    case 36: {
                        try {
                            if (var10 < 0) {
                                statePc = 39;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if ((((ae) this).field_h.b((byte) 99) / 520L ^ -1L) <= ((long)var10 ^ -1L)) {
                                statePc = 42;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof IOException ? 65 : 67);
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
                            statePc = (stateCaught_39 instanceof IOException ? 65 : 67);
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
                            statePc = 67;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        return stackIn_41_0 != 0;
                    }
                    case 42: {
                        try {
                            if (var10 != 0) {
                                statePc = 49;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            param1 = false;
                            var10 = (int)((519L + ((ae) this).field_h.b((byte) 113)) / 520L);
                            if (0 == var10) {
                                statePc = 45;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof IOException ? 65 : 67);
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
                            statePc = (stateCaught_45 instanceof IOException ? 65 : 67);
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
                            statePc = (stateCaught_46 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof IOException ? 65 : 67);
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
                            statePc = (stateCaught_48 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            if (-var8 + param3 < -513) {
                                statePc = 51;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof IOException ? 65 : 67);
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
                            statePc = (stateCaught_50 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            if (-65536 < param2) {
                                statePc = 56;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            gi.field_db[2] = (byte)(var9 >> 1270171784);
                            gi.field_db[4] = (byte)(var10 >> -1192307920);
                            gi.field_db[7] = (byte)((ae) this).field_a;
                            gi.field_db[6] = (byte)var10;
                            gi.field_db[3] = (byte)var9;
                            gi.field_db[5] = (byte)(var10 >> -1530090488);
                            gi.field_db[1] = (byte)param2;
                            gi.field_db[0] = (byte)(param2 >> -942517752);
                            ((ae) this).field_h.a((byte) 123, (long)(520 * var7_int));
                            ((ae) this).field_h.a(8, (byte) 9, 0, gi.field_db);
                            var11 = -var8 + param3;
                            if (512 < var11) {
                                statePc = 54;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof IOException ? 65 : 67);
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
                            statePc = (stateCaught_54 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            ((ae) this).field_h.a(var11, (byte) 9, var8, param0);
                            var8 = var8 + var11;
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            gi.field_db[7] = (byte)(var10 >> -2074814520);
                            gi.field_db[1] = (byte)(param2 >> 1968794192);
                            gi.field_db[4] = (byte)(var9 >> -550605880);
                            gi.field_db[3] = (byte)param2;
                            gi.field_db[0] = (byte)(param2 >> 190050360);
                            gi.field_db[5] = (byte)var9;
                            gi.field_db[6] = (byte)(var10 >> 1107353648);
                            gi.field_db[8] = (byte)var10;
                            gi.field_db[9] = (byte)((ae) this).field_a;
                            gi.field_db[2] = (byte)(param2 >> -1087352312);
                            ((ae) this).field_h.a((byte) 123, (long)(520 * var7_int));
                            ((ae) this).field_h.a(10, (byte) 9, 0, gi.field_db);
                            var11 = -var8 + param3;
                            if (510 >= var11) {
                                statePc = 58;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof IOException ? 65 : 67);
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
                            statePc = (stateCaught_57 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            ((ae) this).field_h.a(var11, (byte) 9, var8, param0);
                            var8 = var8 + var11;
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            var7_int = var10;
                            var9++;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            if (param4 == -15) {
                                statePc = 62;
                            } else {
                                statePc = 61;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof IOException ? 65 : 67);
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            field_e = null;
                            statePc = 62;
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
            Object stackIn_21_0 = null;
            Object stackIn_22_0 = null;
            Object stackIn_42_0 = null;
            Object stackIn_43_0 = null;
            byte[] stackIn_49_0 = null;
            byte[] stackIn_50_0 = null;
            Object stackIn_52_0 = null;
            Object stackOut_2_0 = null;
            Object stackOut_3_0 = null;
            Object stackOut_8_0 = null;
            Object stackOut_9_0 = null;
            Object stackOut_20_0 = null;
            Object stackOut_21_0 = null;
            Object stackOut_41_0 = null;
            Object stackOut_42_0 = null;
            byte[] stackOut_48_0 = null;
            byte[] stackOut_49_0 = null;
            Object stackOut_51_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var18 = Confined.field_J ? 1 : 0;
                        var3 = (Object) (Object) ((ae) this).field_h;
                        // monitorenter ((ae) this).field_h
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((long)(6 * param1 + 6) ^ -1L) >= (((ae) this).field_d.b((byte) 107) ^ -1L)) {
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
                            ((ae) this).field_d.a((byte) 123, (long)(6 * param1));
                            ((ae) this).field_d.a(0, gi.field_db, (byte) 95, 6);
                            var4_int = (gi.field_db[2] & 255) + ((16711680 & gi.field_db[0] << -1912100464) - -((255 & gi.field_db[1]) << -1136463032));
                            var5 = ((255 & gi.field_db[3]) << 1386407952) + ((65280 & gi.field_db[param0] << -336636024) - -(gi.field_db[5] & 255));
                            if (var4_int >= 0) {
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
                            if (((ae) this).field_g >= var4_int) {
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
                            stackOut_8_0 = null;
                            stackIn_9_0 = stackOut_8_0;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof IOException ? 51 : 53);
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
                            statePc = 53;
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
                            if (((long)var5 ^ -1L) >= (((ae) this).field_h.b((byte) 98) / 520L ^ -1L)) {
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
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
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
                            statePc = (stateCaught_17 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (var4_int <= var7) {
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
                            if (var5 != 0) {
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
                            ((ae) this).field_h.a((byte) 123, (long)(520 * var5));
                            var9 = -var7 + var4_int;
                            if (65535 >= param1) {
                                statePc = 27;
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
                            var14 = 10;
                            if ((var9 ^ -1) >= -511) {
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
                            var9 = 510;
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            ((ae) this).field_h.a(0, gi.field_db, (byte) 119, var14 + var9);
                            var11 = (255 & gi.field_db[5]) + (65280 & gi.field_db[4] << 470455496);
                            var12 = (gi.field_db[8] & 255) + (gi.field_db[7] << 1551564200 & 65280) + (gi.field_db[6] << 322698832 & 16711680);
                            var13 = 255 & gi.field_db[9];
                            var10 = (gi.field_db[3] & 255) + (((255 & gi.field_db[1]) << -735618960) + ((255 & gi.field_db[0]) << 1891977336) + (65280 & gi.field_db[2] << 35335464));
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var14 = 8;
                            if (512 >= var9) {
                                statePc = 29;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var9 = 512;
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            ((ae) this).field_h.a(0, gi.field_db, (byte) 96, var9 + var14);
                            var11 = (gi.field_db[3] & 255) + (65280 & gi.field_db[2] << 1821060008);
                            var10 = (255 & gi.field_db[1]) + ((gi.field_db[0] & 255) << -1769949368);
                            var12 = (255 & gi.field_db[6]) + (gi.field_db[5] << 1952977256 & 65280) + (16711680 & gi.field_db[4] << 1110178448);
                            var13 = 255 & gi.field_db[7];
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
                            if (var10 == param1) {
                                statePc = 32;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (var11 == var8) {
                                statePc = 34;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (var13 == ((ae) this).field_a) {
                                statePc = 38;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if ((var12 ^ -1) <= -1) {
                                statePc = 40;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (((long)var12 ^ -1L) >= (((ae) this).field_h.b((byte) 106) / 520L ^ -1L)) {
                                statePc = 44;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            stackOut_41_0 = null;
                            stackIn_42_0 = stackOut_41_0;
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            // monitorexit var3
                            stackOut_42_0 = stackIn_42_0;
                            stackIn_43_0 = stackOut_42_0;
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 53;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        return (byte[]) (Object) stackIn_43_0;
                    }
                    case 44: {
                        try {
                            var15 = var9 + var14;
                            var16 = var14;
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            if (var15 <= var16) {
                                statePc = 47;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            var7++;
                            var6[var7] = gi.field_db[var16];
                            var16++;
                            statePc = 45;
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
                            var5 = var12;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof IOException ? 51 : 53);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            stackOut_48_0 = (byte[]) var6;
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
                            var17 = caughtException;
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

    public static void a(int param0) {
        if (param0 < 12) {
            Object var2 = null;
            ae.a((String) null, -84);
        }
        field_f = null;
        field_c = null;
        field_e = null;
        field_b = null;
    }

    final static void a(String param0, int param1) {
        if (param1 != 0) {
            Object var3 = null;
            ae.a((String) null, -38);
        }
        ag.field_e = param0;
    }

    ae(int param0, pf param1, pf param2, int param3) {
        ((ae) this).field_h = null;
        ((ae) this).field_d = null;
        ((ae) this).field_g = 65000;
        ((ae) this).field_h = param1;
        ((ae) this).field_a = param0;
        ((ae) this).field_d = param2;
        ((ae) this).field_g = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Press <%0> to fire your nuclear missile when you most need it";
        field_e = "You already have spread fire";
        field_c = "<col=FFFFFF>Shield:</col> upgrade awarded every four levels or if you've missed one; restore awarded if your shield is low or lost.";
    }
}
