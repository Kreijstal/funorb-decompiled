/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kh {
    private nh field_d;
    static String field_b;
    static String field_f;
    static int[] field_e;
    private nh field_a;
    private int field_h;
    private int field_g;
    static String field_c;

    final static void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = client.field_A ? 1 : 0;
        int var1 = a.field_r[0];
        if (param0 != 2) {
            field_e = null;
        }
        for (var2 = 1; a.field_r.length > var2; var2++) {
            var3 = a.field_r[var2];
            an.a(hb.field_Vb, var2 << -461235580, hb.field_Vb, var1, var3);
            var1 = var1 + var3;
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int var4 = 0;
        vi.field_A.field_n = 0;
        vi.field_A.a(true, 12);
        vi.field_A.a(gg.field_A.nextInt(), false);
        if (param0 >= -17) {
          return;
        } else {
          vi.field_A.a(gg.field_A.nextInt(), false);
          vi.field_A.a(true, param1);
          vi.field_A.a(true, param3);
          vi.field_A.d(-1, param2);
          vi.field_A.a(ea.field_k, uk.field_p, true);
          we.field_b.f(18, -4);
          we.field_b.field_n = we.field_b.field_n + 1;
          var4 = we.field_b.field_n + 1;
          we.field_b.a(false, vi.field_A.field_n, vi.field_A.field_r, 0);
          we.field_b.b(we.field_b.field_n - var4, true);
          return;
        }
    }

    public final String toString() {
        return "" + ((kh) this).field_h;
    }

    final boolean a(byte param0, byte[] param1, int param2, int param3) {
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
                    var5 = (Object) (Object) ((kh) this).field_a;
                    // monitorenter ((kh) this).field_a
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param3 < 0) {
                            statePc = 4;
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
                        if (param3 > ((kh) this).field_g) {
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
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw new IllegalArgumentException();
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param0 == 43) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        boolean discarded$3 = kh.a(')', -33);
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
                        var6 = this.a(true, (byte) -108, param2, param3, param1) ? 1 : 0;
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
                        var6 = this.a(false, (byte) -43, param2, param3, param1) ? 1 : 0;
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

    private final boolean a(boolean param0, byte param1, int param2, int param3, byte[] param4) {
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
            int stackIn_4_0 = 0;
            int stackIn_11_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_17_0 = 0;
            int stackIn_18_0 = 0;
            int stackIn_37_0 = 0;
            int stackIn_38_0 = 0;
            int stackIn_43_0 = 0;
            int stackIn_44_0 = 0;
            int stackIn_64_0 = 0;
            int stackIn_65_0 = 0;
            int stackIn_67_0 = 0;
            int stackOut_2_0 = 0;
            int stackOut_3_0 = 0;
            int stackOut_10_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_16_0 = 0;
            int stackOut_17_0 = 0;
            int stackOut_36_0 = 0;
            int stackOut_37_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_63_0 = 0;
            int stackOut_64_0 = 0;
            int stackOut_66_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = client.field_A ? 1 : 0;
                        var6 = (Object) (Object) ((kh) this).field_a;
                        // monitorenter ((kh) this).field_a
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (param1 <= -39) {
                                statePc = 5;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof IOException ? 66 : 68);
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
                            statePc = (stateCaught_2 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            // monitorexit var6
                            stackOut_3_0 = stackIn_3_0;
                            stackIn_4_0 = stackOut_3_0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 68;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        return stackIn_4_0 != 0;
                    }
                    case 5: {
                        try {
                            if (param0) {
                                statePc = 8;
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
                            var7_int = (int)((((kh) this).field_a.b(74) + 519L) / 520L);
                            if (-1 != (var7_int ^ -1)) {
                                statePc = 19;
                            } else {
                                statePc = 7;
                            }
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
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if ((((kh) this).field_d.b(37) ^ -1L) > ((long)(6 + param2 * 6) ^ -1L)) {
                                statePc = 10;
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
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = (stateCaught_9 instanceof IOException ? 66 : 68);
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
                            statePc = (stateCaught_10 instanceof IOException ? 66 : 68);
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
                            statePc = 68;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        return stackIn_12_0 != 0;
                    }
                    case 13: {
                        try {
                            ((kh) this).field_d.a((long)(6 * param2), (byte) -109);
                            ((kh) this).field_d.a(0, jb.field_b, 741, 6);
                            var7_int = (255 & jb.field_b[5]) + (((255 & jb.field_b[3]) << -1816350064) - -(jb.field_b[4] << 1510451016 & 65280));
                            if (0 >= var7_int) {
                                statePc = 16;
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
                            if ((((kh) this).field_a.b(-94) / 520L ^ -1L) > ((long)var7_int ^ -1L)) {
                                statePc = 16;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            stackOut_16_0 = 0;
                            stackIn_17_0 = stackOut_16_0;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            // monitorexit var6
                            stackOut_17_0 = stackIn_17_0;
                            stackIn_18_0 = stackOut_17_0;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 68;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        return stackIn_18_0 != 0;
                    }
                    case 19: {
                        try {
                            jb.field_b[0] = (byte)(param3 >> 1086853712);
                            jb.field_b[2] = (byte)param3;
                            jb.field_b[5] = (byte)var7_int;
                            jb.field_b[1] = (byte)(param3 >> 1683129256);
                            jb.field_b[3] = (byte)(var7_int >> -1965896624);
                            jb.field_b[4] = (byte)(var7_int >> 178310472);
                            ((kh) this).field_d.a((long)(6 * param2), (byte) -109);
                            ((kh) this).field_d.a(jb.field_b, (byte) 118, 0, 6);
                            var8 = 0;
                            var9 = 0;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (var8 >= param3) {
                                statePc = 63;
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
                            var10 = 0;
                            if (param0) {
                                statePc = 23;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            ((kh) this).field_a.a((long)(520 * var7_int), (byte) -109);
                            if ((param2 ^ -1) >= -65536) {
                                statePc = 28;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            ((kh) this).field_a.a(0, jb.field_b, 741, 10);
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof EOFException ? 26 : (stateCaught_24 instanceof IOException ? 66 : 68));
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var14 = (EOFException) (Object) caughtException;
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var12 = ((jb.field_b[4] & 255) << -405989848) + (jb.field_b[5] & 255);
                            var13 = 255 & jb.field_b[9];
                            var11 = (255 & jb.field_b[3]) + (-16777216 & jb.field_b[0] << 127232344) - -((jb.field_b[1] & 255) << -482871280) + ((jb.field_b[2] & 255) << -822689368);
                            var10 = ((255 & jb.field_b[6]) << 324120208) + (65280 & jb.field_b[7] << -1788207480) - -(jb.field_b[8] & 255);
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            ((kh) this).field_a.a(0, jb.field_b, 741, 8);
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof EOFException ? 30 : (stateCaught_28 instanceof IOException ? 66 : 68));
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var14 = (EOFException) (Object) caughtException;
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            var10 = (255 & jb.field_b[6]) + (16711680 & jb.field_b[4] << 392227152) + ((255 & jb.field_b[5]) << -1090035704);
                            var13 = 255 & jb.field_b[7];
                            var12 = (255 & jb.field_b[3]) + ((jb.field_b[2] & 255) << 1475077992);
                            var11 = (255 & jb.field_b[1]) + ((255 & jb.field_b[0]) << -1042807800);
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (var11 != param2) {
                                statePc = 36;
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
                            if (var9 != var12) {
                                statePc = 36;
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
                            if (var13 != ((kh) this).field_h) {
                                statePc = 36;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            stackOut_36_0 = 0;
                            stackIn_37_0 = stackOut_36_0;
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            // monitorexit var6
                            stackOut_37_0 = stackIn_37_0;
                            stackIn_38_0 = stackOut_37_0;
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 68;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        return stackIn_38_0 != 0;
                    }
                    case 39: {
                        try {
                            if ((var10 ^ -1) > -1) {
                                statePc = 42;
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
                            if ((long)var10 <= ((kh) this).field_a.b(-103) / 520L) {
                                statePc = 45;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
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
                            stackOut_42_0 = 0;
                            stackIn_43_0 = stackOut_42_0;
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            // monitorexit var6
                            stackOut_43_0 = stackIn_43_0;
                            stackIn_44_0 = stackOut_43_0;
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 68;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        return stackIn_44_0 != 0;
                    }
                    case 45: {
                        try {
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
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            param0 = false;
                            var10 = (int)((((kh) this).field_a.b(-121) + 519L) / 520L);
                            if (var10 != -1) {
                                statePc = 49;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof IOException ? 66 : 68);
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
                            statePc = (stateCaught_48 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            if (var7_int != var10) {
                                statePc = 51;
                            } else {
                                statePc = 50;
                            }
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
                            if (-513 < -var8 + param3) {
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
                            var10 = 0;
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if ((param2 ^ -1) < -65536) {
                                statePc = 58;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            jb.field_b[0] = (byte)(param2 >> -1704945272);
                            jb.field_b[7] = (byte)((kh) this).field_h;
                            jb.field_b[3] = (byte)var9;
                            jb.field_b[5] = (byte)(var10 >> -1400891000);
                            jb.field_b[4] = (byte)(var10 >> 1717337616);
                            jb.field_b[1] = (byte)param2;
                            jb.field_b[2] = (byte)(var9 >> -906719320);
                            jb.field_b[6] = (byte)var10;
                            ((kh) this).field_a.a((long)(var7_int * 520), (byte) -109);
                            ((kh) this).field_a.a(jb.field_b, (byte) 124, 0, 8);
                            var11 = param3 - var8;
                            if (var11 > 512) {
                                statePc = 56;
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
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof IOException ? 66 : 68);
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
                            statePc = (stateCaught_56 instanceof IOException ? 66 : 68);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            ((kh) this).field_a.a(param4, (byte) 126, var8, var11);
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
                            jb.field_b[3] = (byte)param2;
                            jb.field_b[1] = (byte)(param2 >> 531261328);
                            jb.field_b[8] = (byte)var10;
                            jb.field_b[6] = (byte)(var10 >> -948474160);
                            jb.field_b[4] = (byte)(var9 >> 1676966632);
                            jb.field_b[9] = (byte)((kh) this).field_h;
                            jb.field_b[0] = (byte)(param2 >> -2082895624);
                            jb.field_b[5] = (byte)var9;
                            jb.field_b[7] = (byte)(var10 >> -2143680568);
                            jb.field_b[2] = (byte)(param2 >> -1189518136);
                            ((kh) this).field_a.a((long)(var7_int * 520), (byte) -109);
                            ((kh) this).field_a.a(jb.field_b, (byte) 96, 0, 10);
                            var11 = param3 + -var8;
                            if ((var11 ^ -1) < -511) {
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
                            var11 = 510;
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
                            ((kh) this).field_a.a(param4, (byte) 126, var8, var11);
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
                            var7_int = var10;
                            var9++;
                            statePc = 20;
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

    public static void b(int param0) {
        field_b = null;
        field_c = null;
        field_e = null;
        field_f = null;
        if (param0 != -1643605936) {
            kh.b(15);
        }
    }

    final static boolean a(char param0, int param1) {
        L0: {
          if (param0 < 32) {
            break L0;
          } else {
            if (param0 <= 126) {
              return true;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (param0 < 160) {
            break L1;
          } else {
            if (255 < param0) {
              break L1;
            } else {
              return true;
            }
          }
        }
        if (8364 != param0) {
          if (param0 != 338) {
            if (param0 != 8212) {
              if (339 != param0) {
                if (param0 != 376) {
                  if (param1 != 8212) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final static void a(boolean param0) {
        int var2 = client.field_A ? 1 : 0;
        int var1 = 0;
        if (!param0) {
            field_f = null;
        }
        while (ic.field_c > var1) {
            pd.field_g[var1] = null;
            var1++;
        }
        ic.field_c = 0;
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
            Object stackIn_7_0 = null;
            Object stackIn_8_0 = null;
            Object stackIn_13_0 = null;
            Object stackIn_14_0 = null;
            Object stackIn_25_0 = null;
            Object stackIn_26_0 = null;
            byte[] stackIn_54_0 = null;
            byte[] stackIn_55_0 = null;
            Object stackIn_57_0 = null;
            Object stackOut_6_0 = null;
            Object stackOut_7_0 = null;
            Object stackOut_12_0 = null;
            Object stackOut_13_0 = null;
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
                        var18 = client.field_A ? 1 : 0;
                        var3 = (Object) (Object) ((kh) this).field_a;
                        // monitorenter ((kh) this).field_a
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((long)(6 + param0 * 6) ^ -1L) >= (((kh) this).field_d.b(103) ^ -1L)) {
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
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            ((kh) this).field_d.a((long)(6 * param0), (byte) -109);
                            ((kh) this).field_d.a(0, jb.field_b, 741, 6);
                            var4_int = (jb.field_b[2] & 255) + (jb.field_b[1] << 253972520 & 65280) + (jb.field_b[0] << 1692978896 & 16711680);
                            if (param1 > 38) {
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
                            var5 = (16711680 & jb.field_b[3] << 1493935856) - (-((jb.field_b[4] & 255) << 1799068744) - (255 & jb.field_b[5]));
                            if (-1 >= (var4_int ^ -1)) {
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
                            if (((kh) this).field_g >= var4_int) {
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
                            stackOut_12_0 = null;
                            stackIn_13_0 = stackOut_12_0;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            // monitorexit var3
                            stackOut_13_0 = stackIn_13_0;
                            stackIn_14_0 = stackOut_13_0;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 58;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        return (byte[]) (Object) stackIn_14_0;
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
                            if ((long)var5 <= ((kh) this).field_a.b(-128) / 520L) {
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
                            if (var7 >= var4_int) {
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
                            if (0 != var5) {
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
                            ((kh) this).field_a.a((long)(var5 * 520), (byte) -109);
                            var9 = -var7 + var4_int;
                            if (-65536 > (param0 ^ -1)) {
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
                            ((kh) this).field_a.a(0, jb.field_b, 741, var14 + var9);
                            var12 = (jb.field_b[4] << 1334482960 & 16711680) + (jb.field_b[5] << -1069089528 & 65280) - -(255 & jb.field_b[6]);
                            var11 = (255 & jb.field_b[3]) + ((jb.field_b[2] & 255) << 1055080456);
                            var13 = jb.field_b[7] & 255;
                            var10 = (jb.field_b[1] & 255) + (65280 & jb.field_b[0] << -1366805240);
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if ((var9 ^ -1) >= -511) {
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
                            var9 = 510;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            var14 = 10;
                            ((kh) this).field_a.a(0, jb.field_b, 741, var9 - -var14);
                            var11 = ((255 & jb.field_b[4]) << 818328936) + (jb.field_b[5] & 255);
                            var12 = ((jb.field_b[6] & 255) << 813250864) + (jb.field_b[7] << 422628680 & 65280) - -(jb.field_b[8] & 255);
                            var13 = jb.field_b[9] & 255;
                            var10 = (-16777216 & jb.field_b[0] << -1576939336) + ((jb.field_b[1] & 255) << -1643605936) + ((jb.field_b[2] & 255) << 1367300264) + (255 & jb.field_b[3]);
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
                            if (var10 == param0) {
                                statePc = 37;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof IOException ? 56 : 58);
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
                            statePc = (stateCaught_37 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if (((kh) this).field_h == var13) {
                                statePc = 43;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            if ((var12 ^ -1) <= -1) {
                                statePc = 45;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            if (((kh) this).field_a.b(55) / 520L >= (long)var12) {
                                statePc = 49;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            var15 = var14 - -var9;
                            var16 = var14;
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            if (var15 <= var16) {
                                statePc = 52;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            var7++;
                            var6[var7] = jb.field_b[var16];
                            var16++;
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            var8++;
                            var5 = var12;
                            statePc = 22;
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

    kh(int param0, nh param1, nh param2, int param3) {
        ((kh) this).field_d = null;
        ((kh) this).field_a = null;
        ((kh) this).field_g = 65000;
        ((kh) this).field_d = param2;
        ((kh) this).field_a = param1;
        ((kh) this).field_g = param3;
        ((kh) this).field_h = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Connection timed out. Please try using a different server.";
        field_b = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
        field_e = new int[4];
        field_c = "Play the game without logging in just yet";
    }
}
