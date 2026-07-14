/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class uh {
    private me field_d;
    static boolean field_e;
    static String field_f;
    private me field_b;
    private int field_g;
    static String field_c;
    private int field_a;

    final boolean a(int param0, byte[] param1, byte param2, int param3) {
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
                    if (param2 >= 60) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return true;
                }
                case 2: {
                    var5 = (Object) (Object) ((uh) this).field_b;
                    // monitorenter ((uh) this).field_b
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        if (0 > param0) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param0 > ((uh) this).field_g) {
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
                        throw new IllegalArgumentException();
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var6 = this.a(param0, true, param3, (byte) -55, param1) ? 1 : 0;
                        if (var6 != 0) {
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
                        var6 = this.a(param0, false, param3, (byte) -50, param1) ? 1 : 0;
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
        return "" + ((uh) this).field_a;
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
            int stackIn_6_0 = 0;
            int stackIn_7_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_13_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_35_0 = 0;
            int stackIn_40_0 = 0;
            int stackIn_41_0 = 0;
            int stackIn_62_0 = 0;
            int stackIn_63_0 = 0;
            int stackIn_65_0 = 0;
            int stackOut_5_0 = 0;
            int stackOut_6_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_12_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_34_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_62_0 = 0;
            int stackOut_64_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = MinerDisturbance.field_ab;
                        var6 = (Object) (Object) ((uh) this).field_b;
                        // monitorenter ((uh) this).field_b
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (param1) {
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
                            var7_int = (int)((((uh) this).field_b.a((byte) -47) - -519L) / 520L);
                            if (-1 != (var7_int ^ -1)) {
                                statePc = 14;
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
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = (stateCaught_3 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if ((long)(6 * param2 + 6) <= ((uh) this).field_d.a((byte) -109)) {
                                statePc = 8;
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
                            stackOut_5_0 = 0;
                            stackIn_6_0 = stackOut_5_0;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof IOException ? 64 : 66);
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
                            statePc = 66;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        return stackIn_7_0 != 0;
                    }
                    case 8: {
                        try {
                            ((uh) this).field_d.a((byte) 120, (long)(6 * param2));
                            ((uh) this).field_d.a(ri.field_c, 0, 6, -1);
                            var7_int = (255 & ri.field_c[5]) + (((255 & ri.field_c[4]) << 589281864) + (ri.field_c[3] << 2087732144 & 16711680));
                            if ((var7_int ^ -1) >= -1) {
                                statePc = 11;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (((long)var7_int ^ -1L) < (((uh) this).field_b.a((byte) -96) / 520L ^ -1L)) {
                                statePc = 11;
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
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof IOException ? 64 : 66);
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
                            statePc = (stateCaught_11 instanceof IOException ? 64 : 66);
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
                            statePc = 66;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        return stackIn_13_0 != 0;
                    }
                    case 14: {
                        try {
                            ri.field_c[2] = (byte)param0;
                            ri.field_c[4] = (byte)(var7_int >> -470509400);
                            ri.field_c[3] = (byte)(var7_int >> 1019100304);
                            ri.field_c[5] = (byte)var7_int;
                            ri.field_c[1] = (byte)(param0 >> -56250136);
                            ri.field_c[0] = (byte)(param0 >> 88346800);
                            ((uh) this).field_d.a((byte) 116, (long)(6 * param2));
                            ((uh) this).field_d.a(ri.field_c, 6, 0, true);
                            var8 = 0;
                            if (param3 < -35) {
                                statePc = 16;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            uh.a((byte) -43);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            var9 = 0;
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
                            if (var8 >= param0) {
                                statePc = 61;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof IOException ? 64 : 66);
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
                            statePc = (stateCaught_18 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            ((uh) this).field_b.a((byte) 125, (long)(520 * var7_int));
                            if (65535 >= param2) {
                                statePc = 25;
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
                            ((uh) this).field_b.a(ri.field_c, 0, 10, -1);
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof EOFException ? 23 : (stateCaught_21 instanceof IOException ? 64 : 66));
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var14 = (EOFException) (Object) caughtException;
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var11 = (ri.field_c[3] & 255) + ((ri.field_c[0] & 255) << -1532952328) + ((ri.field_c[1] << -575784368 & 16711680) - -((255 & ri.field_c[2]) << 1276963752));
                            var12 = ((ri.field_c[4] & 255) << -757062168) - -(255 & ri.field_c[5]);
                            var10 = (ri.field_c[8] & 255) + (ri.field_c[6] << -57173712 & 16711680) + ((255 & ri.field_c[7]) << -1207053464);
                            var13 = 255 & ri.field_c[9];
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            ((uh) this).field_b.a(ri.field_c, 0, 8, -1);
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof EOFException ? 27 : (stateCaught_25 instanceof IOException ? 64 : 66));
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var14 = (EOFException) (Object) caughtException;
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var13 = ri.field_c[7] & 255;
                            var12 = (65280 & ri.field_c[2] << 804952008) - -(255 & ri.field_c[3]);
                            var10 = (ri.field_c[4] << -484361840 & 16711680) - (-((255 & ri.field_c[5]) << 225831624) - (ri.field_c[6] & 255));
                            var11 = (ri.field_c[1] & 255) + ((ri.field_c[0] & 255) << -1210319416);
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (param2 != var11) {
                                statePc = 33;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof IOException ? 64 : 66);
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
                            statePc = (stateCaught_30 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (((uh) this).field_a == var13) {
                                statePc = 36;
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
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof IOException ? 64 : 66);
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
                            statePc = (stateCaught_33 instanceof IOException ? 64 : 66);
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
                            statePc = 66;
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
                            statePc = (stateCaught_36 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (((uh) this).field_b.a((byte) -70) / 520L < (long)var10) {
                                statePc = 39;
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
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof IOException ? 64 : 66);
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
                            statePc = (stateCaught_39 instanceof IOException ? 64 : 66);
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
                            statePc = 66;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        return stackIn_41_0 != 0;
                    }
                    case 42: {
                        try {
                            if (var10 == 0) {
                                statePc = 44;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            param1 = false;
                            var10 = (int)((((uh) this).field_b.a((byte) -74) + 519L) / 520L);
                            if (var10 != 0) {
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
                            if (param0 + -var8 > 512) {
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
                            var10 = 0;
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            if (-65536 <= (param2 ^ -1)) {
                                statePc = 56;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof IOException ? 64 : 66);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            ri.field_c[8] = (byte)var10;
                            ri.field_c[4] = (byte)(var9 >> -1903756248);
                            ri.field_c[0] = (byte)(param2 >> 760167544);
                            ri.field_c[3] = (byte)param2;
                            ri.field_c[7] = (byte)(var10 >> -13288248);
                            ri.field_c[9] = (byte)((uh) this).field_a;
                            ri.field_c[5] = (byte)var9;
                            ri.field_c[6] = (byte)(var10 >> -468789840);
                            ri.field_c[1] = (byte)(param2 >> 1389065072);
                            ri.field_c[2] = (byte)(param2 >> 8838856);
                            ((uh) this).field_b.a((byte) 123, (long)(520 * var7_int));
                            ((uh) this).field_b.a(ri.field_c, 10, 0, true);
                            var11 = -var8 + param0;
                            if (-511 > (var11 ^ -1)) {
                                statePc = 54;
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
                            statePc = 55;
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
                            ((uh) this).field_b.a(param4, var11, var8, true);
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
                            ri.field_c[0] = (byte)(param2 >> -1028135992);
                            ri.field_c[4] = (byte)(var10 >> -1991649456);
                            ri.field_c[1] = (byte)param2;
                            ri.field_c[5] = (byte)(var10 >> -773612888);
                            ri.field_c[6] = (byte)var10;
                            ri.field_c[7] = (byte)((uh) this).field_a;
                            ri.field_c[3] = (byte)var9;
                            ri.field_c[2] = (byte)(var9 >> -792853272);
                            ((uh) this).field_b.a((byte) 111, (long)(var7_int * 520));
                            ((uh) this).field_b.a(ri.field_c, 8, 0, true);
                            var11 = -var8 + param0;
                            if ((var11 ^ -1) < -513) {
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
                            ((uh) this).field_b.a(param4, var11, var8, true);
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
                            statePc = 17;
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
            Object stackIn_42_0 = null;
            Object stackIn_43_0 = null;
            byte[] stackIn_48_0 = null;
            byte[] stackIn_49_0 = null;
            Object stackIn_51_0 = null;
            Object stackOut_8_0 = null;
            Object stackOut_9_0 = null;
            Object stackOut_14_0 = null;
            Object stackOut_15_0 = null;
            Object stackOut_41_0 = null;
            Object stackOut_42_0 = null;
            byte[] stackOut_47_0 = null;
            byte[] stackOut_48_0 = null;
            Object stackOut_50_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var18 = MinerDisturbance.field_ab;
                        var3 = (Object) (Object) ((uh) this).field_b;
                        // monitorenter ((uh) this).field_b
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if ((long)(6 + 6 * param1) <= ((uh) this).field_d.a((byte) -72)) {
                                statePc = 5;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            ((uh) this).field_d.a((byte) 126, (long)(6 * param1));
                            ((uh) this).field_d.a(ri.field_c, 0, 6, -1);
                            var4_int = (param0 & ri.field_c[2]) + ((ri.field_c[1] & 255) << -652776344) + ((ri.field_c[0] & 255) << -2021027248);
                            var5 = (65280 & ri.field_c[4] << -1343135096) + (((255 & ri.field_c[3]) << 1356772016) + (ri.field_c[5] & 255));
                            if (-1 >= (var4_int ^ -1)) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (((uh) this).field_g >= var4_int) {
                                statePc = 11;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof IOException ? 50 : 52);
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
                            statePc = (stateCaught_8 instanceof IOException ? 50 : 52);
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
                            statePc = 52;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        return (byte[]) (Object) stackIn_10_0;
                    }
                    case 11: {
                        try {
                            if (var5 > 0) {
                                statePc = 13;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if ((((uh) this).field_b.a((byte) -95) / 520L ^ -1L) <= ((long)var5 ^ -1L)) {
                                statePc = 17;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof IOException ? 50 : 52);
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
                            statePc = (stateCaught_14 instanceof IOException ? 50 : 52);
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
                            statePc = 52;
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
                            statePc = (stateCaught_17 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (var4_int <= var7) {
                                statePc = 47;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof IOException ? 50 : 52);
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
                            statePc = (stateCaught_19 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            ((uh) this).field_b.a((byte) 121, (long)(var5 * 520));
                            var9 = var4_int - var7;
                            if ((param1 ^ -1) >= -65536) {
                                statePc = 27;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (510 >= var9) {
                                statePc = 26;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 50 : 52);
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
                            statePc = (stateCaught_25 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var14 = 10;
                            ((uh) this).field_b.a(ri.field_c, 0, var14 + var9, param0 + -256);
                            var12 = (ri.field_c[8] & 255) + ((ri.field_c[7] & 255) << -1580198072) + (16711680 & ri.field_c[6] << -1979188272);
                            var13 = ri.field_c[9] & 255;
                            var10 = (ri.field_c[2] << 2115197832 & 65280) + (ri.field_c[1] << -304457840 & 16711680) + (((ri.field_c[0] & 255) << -1955897384) + (255 & ri.field_c[3]));
                            var11 = (255 & ri.field_c[5]) + (ri.field_c[4] << 1795475560 & 65280);
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (512 >= var9) {
                                statePc = 29;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 50 : 52);
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
                            statePc = (stateCaught_28 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var14 = 8;
                            ((uh) this).field_b.a(ri.field_c, 0, var14 + var9, -1);
                            var11 = ((255 & ri.field_c[2]) << 419879528) + (ri.field_c[3] & 255);
                            var10 = (255 & ri.field_c[1]) + ((255 & ri.field_c[0]) << 382591976);
                            var12 = (255 & ri.field_c[6]) + (16711680 & ri.field_c[4] << 21117296) - -(ri.field_c[5] << -1836873848 & 65280);
                            var13 = ri.field_c[7] & 255;
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (param1 == var10) {
                                statePc = 32;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (var8 == var11) {
                                statePc = 34;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (((uh) this).field_a == var13) {
                                statePc = 38;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof IOException ? 50 : 52);
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
                            statePc = (stateCaught_38 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (((long)var12 ^ -1L) >= (((uh) this).field_b.a((byte) -95) / 520L ^ -1L)) {
                                statePc = 44;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof IOException ? 50 : 52);
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
                            statePc = (stateCaught_41 instanceof IOException ? 50 : 52);
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
                            statePc = 52;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        return (byte[]) (Object) stackIn_43_0;
                    }
                    case 44: {
                        try {
                            var15 = var9 + var14;
                            var8++;
                            var5 = var12;
                            var16 = var14;
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            if (var16 >= var15) {
                                statePc = 18;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            var7++;
                            var6[var7] = ri.field_c[var16];
                            var16++;
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            stackOut_47_0 = (byte[]) var6;
                            stackIn_48_0 = stackOut_47_0;
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof IOException ? 50 : 52);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            // monitorexit var3
                            stackOut_48_0 = (byte[]) (Object) stackIn_48_0;
                            stackIn_49_0 = stackOut_48_0;
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 52;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        return stackIn_49_0;
                    }
                    case 50: {
                        try {
                            var4 = (IOException) (Object) caughtException;
                            // monitorexit var3
                            stackOut_50_0 = null;
                            stackIn_51_0 = stackOut_50_0;
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 52;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        return (byte[]) (Object) stackIn_51_0;
                    }
                    case 52: {
                        try {
                            var17 = caughtException;
                            // monitorexit var3
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 52;
                            continue stateLoop;
                        }
                    }
                    case 53: {
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

    final static boolean a(byte param0, String param1) {
        String var2 = null;
        Exception var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_18_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = MinerDisturbance.field_ab;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (vf.field_j.startsWith("win")) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = 0;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        if (param1.startsWith("http://")) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (!param1.startsWith("https://")) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0 != 0;
                }
                case 9: {
                    try {
                        var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        var3 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (param1.length() <= var3) {
                            statePc = 16;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (0 == (var2.indexOf((int) param1.charAt(var3)) ^ -1)) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return stackIn_14_0 != 0;
                }
                case 15: {
                    try {
                        var3++;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        Process discarded$11 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                        if (param0 > 7) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        uh.a((byte) -75);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackOut_18_0 = 1;
                        stackIn_19_0 = stackOut_18_0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    return stackIn_19_0 != 0;
                }
                case 20: {
                    var2_ref = (Exception) (Object) caughtException;
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_c = null;
        if (param0 >= -103) {
            Object var2 = null;
            boolean discarded$0 = uh.a((byte) -78, (String) null);
        }
    }

    uh(int param0, me param1, me param2, int param3) {
        ((uh) this).field_d = null;
        ((uh) this).field_b = null;
        ((uh) this).field_g = 65000;
        ((uh) this).field_g = param3;
        ((uh) this).field_a = param0;
        ((uh) this).field_b = param1;
        ((uh) this).field_d = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = true;
        field_f = "MULTIPLIER <times> <%0>";
        field_c = "<%0> <times> 100 = <%1>";
    }
}
