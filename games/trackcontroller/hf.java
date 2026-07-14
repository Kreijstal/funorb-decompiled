/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hf {
    private int field_c;
    static le field_f;
    private il field_g;
    private int field_e;
    private il field_h;
    static String field_a;
    static byte[][] field_b;
    static int field_d;

    final static void a(oh param0, int param1, int param2, int param3, boolean param4, int param5, int param6, oh param7, int param8, int param9, na param10, int param11, int param12, int param13, na param14, int param15, int param16, int param17, na param18, int param19, int param20) {
        ha.a(param7, 2, param2, param0);
        vb.a(param1, param16, -74, param11, param5);
        jk.a(param20, -114, param12);
        uh.a(param8, param10, param17, -97, param13, param14);
        we.a(param19, 104, param15, param18);
        he.a(param9, 0, param3, param6);
        if (param4) {
            Object var22 = null;
            hf.a((oh) null, 9, -29, 58, false, 115, 108, (oh) null, 122, -19, (na) null, -127, 114, -93, (na) null, -79, 80, -6, (na) null, 93, 114);
        }
    }

    final static boolean a(int param0, boolean param1) {
        try {
            int var2_int = 0;
            IOException var2 = null;
            int stackIn_13_0 = 0;
            int stackIn_15_0 = 0;
            int stackOut_12_0 = 0;
            int stackOut_14_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (ne.field_a.field_k < param0) {
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
                        if (null == r.field_i) {
                            statePc = 4;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        return false;
                    }
                    case 5: {
                        try {
                            if (!param1) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            hf.a(99);
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var2_int = r.field_i.b(0);
                            if (var2_int <= 0) {
                                statePc = 16;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (var2_int <= param0 + -ne.field_a.field_k) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var2_int = -ne.field_a.field_k + param0;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            r.field_i.a(ne.field_a.field_j, 0, var2_int, ne.field_a.field_k);
                            he.field_a = qg.a(false);
                            ne.field_a.field_k = ne.field_a.field_k + var2_int;
                            if (ne.field_a.field_k < param0) {
                                statePc = 12;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 21;
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
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        return stackIn_13_0 != 0;
                    }
                    case 14: {
                        try {
                            ne.field_a.field_k = 0;
                            stackOut_14_0 = 1;
                            stackIn_15_0 = stackOut_14_0;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        return stackIn_15_0 != 0;
                    }
                    case 16: {
                        try {
                            if ((var2_int ^ -1) > -1) {
                                statePc = 19;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (30000L >= bj.b(-21676)) {
                                statePc = 20;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            lj.a((byte) 113);
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        return false;
                    }
                    case 21: {
                        var2 = (IOException) (Object) caughtException;
                        lj.a((byte) 117);
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 22: {
                        return false;
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

    final byte[] a(byte param0, int param1) {
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
            Object stackIn_11_0 = null;
            Object stackIn_12_0 = null;
            Object stackIn_17_0 = null;
            Object stackIn_18_0 = null;
            Object stackIn_46_0 = null;
            Object stackIn_47_0 = null;
            byte[] stackIn_52_0 = null;
            byte[] stackIn_53_0 = null;
            Object stackIn_55_0 = null;
            Object stackOut_2_0 = null;
            Object stackOut_3_0 = null;
            Object stackOut_10_0 = null;
            Object stackOut_11_0 = null;
            Object stackOut_16_0 = null;
            Object stackOut_17_0 = null;
            Object stackOut_45_0 = null;
            Object stackOut_46_0 = null;
            byte[] stackOut_51_0 = null;
            byte[] stackOut_52_0 = null;
            Object stackOut_54_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var18 = TrackController.field_F ? 1 : 0;
                        var3 = (Object) (Object) ((hf) this).field_h;
                        // monitorenter ((hf) this).field_h
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((long)(6 + param1 * 6) ^ -1L) >= (((hf) this).field_g.a((byte) -88) ^ -1L)) {
                                statePc = 5;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof IOException ? 54 : 56);
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
                            statePc = (stateCaught_2 instanceof IOException ? 54 : 56);
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
                            statePc = 56;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        return (byte[]) (Object) stackIn_4_0;
                    }
                    case 5: {
                        try {
                            ((hf) this).field_g.a((long)(6 * param1), true);
                            ((hf) this).field_g.a(fh.field_a, 6, 0, 0);
                            if (param0 < -89) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            field_f = null;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var4_int = (65280 & fh.field_a[1] << 509728840) + ((fh.field_a[0] & 255) << -776253648) - -(255 & fh.field_a[2]);
                            var5 = (fh.field_a[3] << -1039623664 & 16711680) - (-(65280 & fh.field_a[4] << 268824872) - (fh.field_a[5] & 255));
                            if (0 <= var4_int) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (var4_int <= ((hf) this).field_e) {
                                statePc = 13;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = (stateCaught_9 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            stackOut_10_0 = null;
                            stackIn_11_0 = stackOut_10_0;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            // monitorexit var3
                            stackOut_11_0 = stackIn_11_0;
                            stackIn_12_0 = stackOut_11_0;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 56;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        return (byte[]) (Object) stackIn_12_0;
                    }
                    case 13: {
                        try {
                            if ((var5 ^ -1) < -1) {
                                statePc = 15;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (((hf) this).field_h.a((byte) -128) / 520L >= (long)var5) {
                                statePc = 19;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 54 : 56);
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
                            statePc = (stateCaught_16 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            // monitorexit var3
                            stackOut_17_0 = stackIn_17_0;
                            stackIn_18_0 = stackOut_17_0;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 56;
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
                            statePc = (stateCaught_19 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (var7 >= var4_int) {
                                statePc = 51;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (var5 != 0) {
                                statePc = 25;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            ((hf) this).field_h.a((long)(var5 * 520), true);
                            var9 = -var7 + var4_int;
                            if (param1 > 65535) {
                                statePc = 30;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if ((var9 ^ -1) < -513) {
                                statePc = 28;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 54 : 56);
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
                            statePc = (stateCaught_28 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var14 = 8;
                            ((hf) this).field_h.a(fh.field_a, var14 + var9, 0, 0);
                            var12 = (fh.field_a[6] & 255) + ((fh.field_a[4] & 255) << 204365072) + (65280 & fh.field_a[5] << 1903664392);
                            var11 = (fh.field_a[3] & 255) + ((255 & fh.field_a[2]) << -596885400);
                            var13 = 255 & fh.field_a[7];
                            var10 = ((fh.field_a[0] & 255) << 1376126728) + (fh.field_a[1] & 255);
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if ((var9 ^ -1) < -511) {
                                statePc = 32;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var9 = 510;
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            var14 = 10;
                            ((hf) this).field_h.a(fh.field_a, var14 + var9, 0, 0);
                            var10 = (255 & fh.field_a[3]) + (((fh.field_a[2] & 255) << 1666776616) + (((255 & fh.field_a[0]) << 1109169400) + (fh.field_a[1] << 223088560 & 16711680)));
                            var11 = (fh.field_a[5] & 255) + ((fh.field_a[4] & 255) << 204116040);
                            var13 = fh.field_a[9] & 255;
                            var12 = ((255 & fh.field_a[7]) << -710377912) + (fh.field_a[6] << -122237360 & 16711680) - -(fh.field_a[8] & 255);
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (var10 == param1) {
                                statePc = 36;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            if (var8 == var11) {
                                statePc = 38;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (((hf) this).field_c == var13) {
                                statePc = 42;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if (var12 >= 0) {
                                statePc = 44;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            if ((long)var12 <= ((hf) this).field_h.a((byte) -88) / 520L) {
                                statePc = 48;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            stackOut_45_0 = null;
                            stackIn_46_0 = stackOut_45_0;
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            // monitorexit var3
                            stackOut_46_0 = stackIn_46_0;
                            stackIn_47_0 = stackOut_46_0;
                            statePc = 47;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 56;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        return (byte[]) (Object) stackIn_47_0;
                    }
                    case 48: {
                        try {
                            var15 = var9 + var14;
                            var8++;
                            var5 = var12;
                            var16 = var14;
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            if (var16 >= var15) {
                                statePc = 20;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            var7++;
                            var6[var7] = fh.field_a[var16];
                            var16++;
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            stackOut_51_0 = (byte[]) var6;
                            stackIn_52_0 = stackOut_51_0;
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof IOException ? 54 : 56);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            // monitorexit var3
                            stackOut_52_0 = (byte[]) (Object) stackIn_52_0;
                            stackIn_53_0 = stackOut_52_0;
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 56;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        return stackIn_53_0;
                    }
                    case 54: {
                        try {
                            var4 = (IOException) (Object) caughtException;
                            // monitorexit var3
                            stackOut_54_0 = null;
                            stackIn_55_0 = stackOut_54_0;
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 56;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        return (byte[]) (Object) stackIn_55_0;
                    }
                    case 56: {
                        try {
                            var17 = caughtException;
                            // monitorexit var3
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 56;
                            continue stateLoop;
                        }
                    }
                    case 57: {
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
        return "" + ((hf) this).field_c;
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 6) {
            Object var2 = null;
            hf.a((oh) null, 27, 98, -128, true, -24, 31, (oh) null, 112, -78, (na) null, -60, 114, 126, (na) null, -28, 7, 29, (na) null, -35, -108);
        }
        field_a = null;
        field_f = null;
    }

    private final boolean a(byte[] param0, int param1, int param2, boolean param3, boolean param4) {
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
            il stackIn_58_0 = null;
            long stackIn_58_1 = 0L;
            il stackIn_59_0 = null;
            long stackIn_59_1 = 0L;
            il stackIn_60_0 = null;
            long stackIn_60_1 = 0L;
            int stackIn_60_2 = 0;
            int stackIn_66_0 = 0;
            int stackIn_67_0 = 0;
            int stackIn_69_0 = 0;
            int stackOut_2_0 = 0;
            int stackOut_9_0 = 0;
            int stackOut_10_0 = 0;
            int stackOut_15_0 = 0;
            int stackOut_16_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_36_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_42_0 = 0;
            il stackOut_57_0 = null;
            long stackOut_57_1 = 0L;
            il stackOut_58_0 = null;
            long stackOut_58_1 = 0L;
            int stackOut_58_2 = 0;
            il stackOut_59_0 = null;
            long stackOut_59_1 = 0L;
            int stackOut_59_2 = 0;
            int stackOut_65_0 = 0;
            int stackOut_66_0 = 0;
            int stackOut_68_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = TrackController.field_F ? 1 : 0;
                        var6 = (Object) (Object) ((hf) this).field_h;
                        // monitorenter ((hf) this).field_h
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (!param4) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 70;
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
                            statePc = 70;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        return stackIn_3_0 != 0;
                    }
                    case 4: {
                        try {
                            if (param3) {
                                statePc = 8;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = (stateCaught_4 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var7_int = (int)((((hf) this).field_h.a((byte) -106) + 519L) / 520L);
                            if (var7_int == 0) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof IOException ? 68 : 70);
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
                            statePc = (stateCaught_7 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (((long)(6 * param1 + 6) ^ -1L) >= (((hf) this).field_g.a((byte) -95) ^ -1L)) {
                                statePc = 12;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof IOException ? 68 : 70);
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
                            statePc = (stateCaught_9 instanceof IOException ? 68 : 70);
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
                            statePc = 70;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        return stackIn_11_0 != 0;
                    }
                    case 12: {
                        try {
                            ((hf) this).field_g.a((long)(6 * param1), true);
                            ((hf) this).field_g.a(fh.field_a, 6, 0, 0);
                            var7_int = ((fh.field_a[4] & 255) << 455696680) + ((16711680 & fh.field_a[3] << 1916514320) - -(255 & fh.field_a[5]));
                            if (var7_int <= 0) {
                                statePc = 15;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if ((long)var7_int > ((hf) this).field_h.a((byte) -77) / 520L) {
                                statePc = 15;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof IOException ? 68 : 70);
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
                            statePc = (stateCaught_15 instanceof IOException ? 68 : 70);
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
                            statePc = 70;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        return stackIn_17_0 != 0;
                    }
                    case 18: {
                        try {
                            fh.field_a[3] = (byte)(var7_int >> -1023648016);
                            fh.field_a[1] = (byte)(param2 >> -121050648);
                            fh.field_a[0] = (byte)(param2 >> -504638736);
                            fh.field_a[4] = (byte)(var7_int >> -769948184);
                            fh.field_a[2] = (byte)param2;
                            fh.field_a[5] = (byte)var7_int;
                            ((hf) this).field_g.a((long)(param1 * 6), true);
                            ((hf) this).field_g.a(6, -1, fh.field_a, 0);
                            var8 = 0;
                            var9 = 0;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (param2 <= var8) {
                                statePc = 65;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            var10 = 0;
                            if (param3) {
                                statePc = 22;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            ((hf) this).field_h.a((long)(520 * var7_int), true);
                            if (65535 < param1) {
                                statePc = 27;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            ((hf) this).field_h.a(fh.field_a, 8, 0, 0);
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof EOFException ? 25 : (stateCaught_23 instanceof IOException ? 68 : 70));
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var14 = (EOFException) (Object) caughtException;
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var12 = (255 & fh.field_a[3]) + ((255 & fh.field_a[2]) << -246513720);
                            var13 = 255 & fh.field_a[7];
                            var11 = (fh.field_a[0] << 1141212360 & 65280) - -(255 & fh.field_a[1]);
                            var10 = (255 & fh.field_a[6]) + (16711680 & fh.field_a[4] << 719778640) + (fh.field_a[5] << -1857596568 & 65280);
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            ((hf) this).field_h.a(fh.field_a, 10, 0, 0);
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof EOFException ? 29 : (stateCaught_27 instanceof IOException ? 68 : 70));
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var14 = (EOFException) (Object) caughtException;
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var11 = ((fh.field_a[1] & 255) << 1735380816) + (-16777216 & fh.field_a[0] << -695224840) - -((255 & fh.field_a[2]) << -353987992) - -(255 & fh.field_a[3]);
                            var12 = (fh.field_a[4] << -794284024 & 65280) + (fh.field_a[5] & 255);
                            var10 = ((255 & fh.field_a[6]) << -1148007152) + (((fh.field_a[7] & 255) << 139466824) + (fh.field_a[8] & 255));
                            var13 = 255 & fh.field_a[9];
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (param1 != var11) {
                                statePc = 35;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 68 : 70);
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
                            statePc = (stateCaught_32 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (var13 != ((hf) this).field_c) {
                                statePc = 35;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof IOException ? 68 : 70);
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
                            statePc = (stateCaught_35 instanceof IOException ? 68 : 70);
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
                            statePc = 70;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        return stackIn_37_0 != 0;
                    }
                    case 38: {
                        try {
                            if (-1 < (var10 ^ -1)) {
                                statePc = 41;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if (((long)var10 ^ -1L) < (((hf) this).field_h.a((byte) -102) / 520L ^ -1L)) {
                                statePc = 41;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof IOException ? 68 : 70);
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
                            statePc = (stateCaught_41 instanceof IOException ? 68 : 70);
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
                            statePc = 70;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        return stackIn_43_0 != 0;
                    }
                    case 44: {
                        try {
                            if (var10 != 0) {
                                statePc = 50;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            param3 = false;
                            var10 = (int)((519L + ((hf) this).field_h.a((byte) -104)) / 520L);
                            if (var10 == 0) {
                                statePc = 47;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof IOException ? 68 : 70);
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
                            statePc = (stateCaught_47 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if (var7_int != var10) {
                                statePc = 50;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            var10++;
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            if (512 < param2 - var8) {
                                statePc = 52;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof IOException ? 68 : 70);
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
                            statePc = (stateCaught_51 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            if (param1 > 65535) {
                                statePc = 57;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            fh.field_a[1] = (byte)param1;
                            fh.field_a[6] = (byte)var10;
                            fh.field_a[3] = (byte)var9;
                            fh.field_a[2] = (byte)(var9 >> -711057368);
                            fh.field_a[5] = (byte)(var10 >> 165541832);
                            fh.field_a[4] = (byte)(var10 >> -925642736);
                            fh.field_a[7] = (byte)((hf) this).field_c;
                            fh.field_a[0] = (byte)(param1 >> -2058642648);
                            ((hf) this).field_h.a((long)(var7_int * 520), true);
                            ((hf) this).field_h.a(8, -1, fh.field_a, 0);
                            var11 = -var8 + param2;
                            if (-513 > (var11 ^ -1)) {
                                statePc = 55;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            var11 = 512;
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            ((hf) this).field_h.a(var11, -1, param0, var8);
                            var8 = var8 + var11;
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            fh.field_a[2] = (byte)(param1 >> 1521718472);
                            fh.field_a[7] = (byte)(var10 >> 2100315976);
                            fh.field_a[4] = (byte)(var9 >> -764280856);
                            fh.field_a[8] = (byte)var10;
                            fh.field_a[5] = (byte)var9;
                            fh.field_a[9] = (byte)((hf) this).field_c;
                            fh.field_a[0] = (byte)(param1 >> 1520875544);
                            fh.field_a[6] = (byte)(var10 >> -1160282096);
                            fh.field_a[1] = (byte)(param1 >> -1827942928);
                            fh.field_a[3] = (byte)param1;
                            stackOut_57_0 = ((hf) this).field_h;
                            stackOut_57_1 = (long)(520 * var7_int);
                            stackIn_59_0 = stackOut_57_0;
                            stackIn_59_1 = stackOut_57_1;
                            stackIn_58_0 = stackOut_57_0;
                            stackIn_58_1 = stackOut_57_1;
                            if (param4) {
                                statePc = 59;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            stackOut_58_0 = (il) (Object) stackIn_58_0;
                            stackOut_58_1 = stackIn_58_1;
                            stackOut_58_2 = 1;
                            stackIn_60_0 = stackOut_58_0;
                            stackIn_60_1 = stackOut_58_1;
                            stackIn_60_2 = stackOut_58_2;
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            stackOut_59_0 = (il) (Object) stackIn_59_0;
                            stackOut_59_1 = stackIn_59_1;
                            stackOut_59_2 = 0;
                            stackIn_60_0 = stackOut_59_0;
                            stackIn_60_1 = stackOut_59_1;
                            stackIn_60_2 = stackOut_59_2;
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            ((il) (Object) stackIn_60_0).a(stackIn_60_1, stackIn_60_2 != 0);
                            ((hf) this).field_h.a(10, -1, fh.field_a, 0);
                            var11 = -var8 + param2;
                            if (510 < var11) {
                                statePc = 62;
                            } else {
                                statePc = 61;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = (stateCaught_61 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            var11 = 510;
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = (stateCaught_62 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            ((hf) this).field_h.a(var11, -1, param0, var8);
                            var8 = var8 + var11;
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = (stateCaught_63 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            var9++;
                            var7_int = var10;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = (stateCaught_64 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            stackOut_65_0 = 1;
                            stackIn_66_0 = stackOut_65_0;
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = (stateCaught_65 instanceof IOException ? 68 : 70);
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            // monitorexit var6
                            stackOut_66_0 = stackIn_66_0;
                            stackIn_67_0 = stackOut_66_0;
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 70;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        return stackIn_67_0 != 0;
                    }
                    case 68: {
                        try {
                            var7 = (IOException) (Object) caughtException;
                            // monitorexit var6
                            stackOut_68_0 = 0;
                            stackIn_69_0 = stackOut_68_0;
                            statePc = 69;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 70;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        return stackIn_69_0 != 0;
                    }
                    case 70: {
                        try {
                            var15 = caughtException;
                            // monitorexit var6
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 70;
                            continue stateLoop;
                        }
                    }
                    case 71: {
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

    hf(int param0, il param1, il param2, int param3) {
        ((hf) this).field_g = null;
        ((hf) this).field_e = 65000;
        ((hf) this).field_h = null;
        ((hf) this).field_e = param3;
        ((hf) this).field_g = param2;
        ((hf) this).field_h = param1;
        ((hf) this).field_c = param0;
    }

    final boolean a(int param0, int param1, byte[] param2, int param3) {
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
                    var5_ref = (Object) (Object) ((hf) this).field_h;
                    // monitorenter ((hf) this).field_h
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
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param3 > ((hf) this).field_e) {
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
                        if (param0 == -1023648016) {
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
                        var6 = this.a(param2, param1, param3, true, false) ? 1 : 0;
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
                        var6 = this.a(param2, param1, param3, false, false) ? 1 : 0;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Email is valid";
        field_f = new le();
        field_b = new byte[50][];
    }
}
