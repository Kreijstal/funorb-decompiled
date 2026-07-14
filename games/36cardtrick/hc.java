/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hc {
    private tk field_g;
    static int field_f;
    static fe field_h;
    private int field_i;
    static String field_a;
    private tk field_d;
    private int field_c;
    static nc field_b;
    static String field_e;

    final static void a(boolean param0) {
        int var1 = 0;
        int var2 = Main.field_T;
        if (!(bk.field_c == null)) {
            return;
        }
        bk.field_c = new String[22];
        bk.field_c[3] = td.field_a;
        bk.field_c[0] = tj.field_J;
        bk.field_c[5] = field_e;
        bk.field_c[15] = bl.field_g;
        bk.field_c[12] = ii.field_f;
        bk.field_c[9] = field_a;
        bk.field_c[13] = dd.field_e;
        bk.field_c[1] = sg.field_e;
        bk.field_c[14] = gg.field_c;
        bk.field_c[16] = q.field_f;
        bk.field_c[17] = db.field_b;
        bk.field_c[10] = tf.field_m;
        if (!param0) {
            return;
        }
        bk.field_c[2] = rf.field_e;
        bk.field_c[4] = lf.field_d;
        bk.field_c[11] = Main.field_y;
        bk.field_c[8] = pg.field_b;
        bk.field_c[7] = id.field_f;
        bk.field_c[6] = n.field_D;
        bk.field_c[20] = jk.field_d[2];
        bk.field_c[19] = jk.field_d[1];
        bk.field_c[21] = n.field_D;
        bk.field_c[18] = jk.field_d[0];
        for (var1 = 0; bk.field_c.length > var1; var1++) {
            bk.field_c[var1] = bk.field_c[var1].toUpperCase();
        }
    }

    final boolean a(byte[] param0, int param1, int param2, int param3) {
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
                    var5_ref = (Object) (Object) ((hc) this).field_d;
                    // monitorenter ((hc) this).field_d
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (0 > param2) {
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
                        if (param2 > ((hc) this).field_i) {
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
                        if (param1 >= 51) {
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
                        stackOut_6_0 = 0;
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
                        var6 = this.a(true, param0, param3, param2, (byte) 2) ? 1 : 0;
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
                        var6 = this.a(false, param0, param3, param2, (byte) 2) ? 1 : 0;
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

    final static wb[] a(int param0) {
        int var2 = 0;
        int var3 = Main.field_T;
        wb[] var1 = new wb[cf.field_c];
        for (var2 = 0; var2 < cf.field_c; var2++) {
            var1[var2] = new wb(p.field_l, gk.field_a, kb.field_c[var2], ml.field_b[var2], na.field_q[var2], hb.field_a[var2], rd.field_k[var2], jf.field_i);
        }
        rh.d(param0 ^ -3343315);
        if (param0 != 3343272) {
            return (wb[]) null;
        }
        return var1;
    }

    final static byte[] a(String param0, byte param1) {
        if (param1 != -127) {
            String var3 = (String) null;
            byte[] discarded$0 = hc.a((String) null, (byte) 7);
        }
        return gk.field_d.a((byte) 7, param0, "");
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
            byte[] stackIn_7_0 = null;
            byte[] stackIn_8_0 = null;
            Object stackIn_19_0 = null;
            Object stackIn_20_0 = null;
            Object stackIn_25_0 = null;
            Object stackIn_26_0 = null;
            Object stackIn_48_0 = null;
            Object stackIn_49_0 = null;
            byte[] stackIn_54_0 = null;
            byte[] stackIn_55_0 = null;
            Object stackIn_57_0 = null;
            Object stackOut_2_0 = null;
            Object stackOut_3_0 = null;
            byte[] stackOut_6_0 = null;
            byte[] stackOut_7_0 = null;
            Object stackOut_18_0 = null;
            Object stackOut_19_0 = null;
            Object stackOut_24_0 = null;
            Object stackOut_25_0 = null;
            Object stackOut_47_0 = null;
            Object stackOut_48_0 = null;
            byte[] stackOut_53_0 = null;
            byte[] stackOut_54_0 = null;
            Object stackOut_56_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var18 = Main.field_T;
                        var3 = (Object) (Object) ((hc) this).field_d;
                        // monitorenter ((hc) this).field_d
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((long)(6 + 6 * param1) ^ -1L) >= (((hc) this).field_g.b((byte) -95) ^ -1L)) {
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
                            stackOut_2_0 = null;
                            stackIn_3_0 = stackOut_2_0;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof IOException ? 56 : 58);
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
                            statePc = 58;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        return (byte[]) (Object) stackIn_4_0;
                    }
                    case 5: {
                        try {
                            ((hc) this).field_g.a((long)(param1 * 6), 79);
                            ((hc) this).field_g.a((byte) -118, fb.field_e, 0, 6);
                            if (param0 == 19) {
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
                            stackOut_6_0 = (byte[]) null;
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
                            stackOut_7_0 = (byte[]) (Object) stackIn_7_0;
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
                            var4_int = (255 & fb.field_e[2]) + (((fb.field_e[0] & 255) << -818831280) - -(fb.field_e[1] << 3343272 & 65280));
                            var5 = (255 & fb.field_e[5]) + ((255 & fb.field_e[3]) << -283753712) - -((255 & fb.field_e[4]) << 1051356680);
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
                            if (((hc) this).field_i >= var4_int) {
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
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
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
                            if (((long)var5 ^ -1L) >= (((hc) this).field_d.b((byte) -95) / 520L ^ -1L)) {
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
                            stackOut_18_0 = null;
                            stackIn_19_0 = stackOut_18_0;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            // monitorexit var3
                            stackOut_19_0 = (Object) (Object) stackIn_19_0;
                            stackIn_20_0 = stackOut_19_0;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 58;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        return (byte[]) (Object) stackIn_20_0;
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
                            if (-1 != (var5 ^ -1)) {
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
                            stackOut_25_0 = (Object) (Object) stackIn_25_0;
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
                            ((hc) this).field_d.a((long)(520 * var5), 55);
                            var9 = var4_int + -var7;
                            if (param1 <= 65535) {
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
                            var14 = 10;
                            if ((var9 ^ -1) < -511) {
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
                            var9 = 510;
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
                            ((hc) this).field_d.a((byte) -118, fb.field_e, 0, var9 - -var14);
                            var10 = (255 & fb.field_e[3]) + ((fb.field_e[0] & 255) << -1236232904) - (-((fb.field_e[1] & 255) << -31962448) + -(65280 & fb.field_e[2] << 1475207688));
                            var13 = fb.field_e[9] & 255;
                            var12 = (16711680 & fb.field_e[6] << -722145616) + ((fb.field_e[7] << -1468322168 & 65280) + (fb.field_e[8] & 255));
                            var11 = (255 & fb.field_e[5]) + (65280 & fb.field_e[4] << 905770952);
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var14 = 8;
                            if (-513 > (var9 ^ -1)) {
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
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            var9 = 512;
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
                            ((hc) this).field_d.a((byte) -118, fb.field_e, 0, var14 + var9);
                            var12 = ((fb.field_e[4] & 255) << -1495617808) - -((255 & fb.field_e[5]) << 1597269000) + (fb.field_e[6] & 255);
                            var11 = (fb.field_e[2] << -1609538872 & 65280) - -(fb.field_e[3] & 255);
                            var13 = fb.field_e[7] & 255;
                            var10 = (fb.field_e[1] & 255) + ((255 & fb.field_e[0]) << -310005464);
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            if (var10 == param1) {
                                statePc = 38;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (var11 == var8) {
                                statePc = 40;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (var13 == ((hc) this).field_c) {
                                statePc = 44;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            if (-1 >= (var12 ^ -1)) {
                                statePc = 46;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if ((long)var12 <= ((hc) this).field_d.b((byte) -95) / 520L) {
                                statePc = 50;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            stackOut_47_0 = null;
                            stackIn_48_0 = stackOut_47_0;
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            // monitorexit var3
                            stackOut_48_0 = (Object) (Object) stackIn_48_0;
                            stackIn_49_0 = stackOut_48_0;
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 58;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        return (byte[]) (Object) stackIn_49_0;
                    }
                    case 50: {
                        try {
                            var15 = var14 + var9;
                            var5 = var12;
                            var8++;
                            var16 = var14;
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            if (var15 <= var16) {
                                statePc = 22;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof IOException ? 56 : 58);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            var7++;
                            var6[var7] = fb.field_e[var16];
                            var16++;
                            statePc = 51;
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
                        return (byte[]) (Object) stackIn_55_0;
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

    public final String toString() {
        return "" + ((hc) this).field_c;
    }

    hc(int param0, tk param1, tk param2, int param3) {
        ((hc) this).field_g = null;
        ((hc) this).field_d = null;
        ((hc) this).field_i = 65000;
        ((hc) this).field_c = param0;
        ((hc) this).field_g = param2;
        ((hc) this).field_i = param3;
        ((hc) this).field_d = param1;
    }

    public static void b(boolean param0) {
        if (!param0) {
            field_a = (String) null;
        }
        field_a = null;
        field_h = null;
        field_b = null;
        field_e = null;
    }

    private final boolean a(boolean param0, byte[] param1, int param2, int param3, byte param4) {
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
            int stackIn_17_0 = 0;
            int stackIn_18_0 = 0;
            int stackIn_37_0 = 0;
            int stackIn_38_0 = 0;
            int stackIn_43_0 = 0;
            int stackIn_44_0 = 0;
            int stackIn_65_0 = 0;
            int stackIn_66_0 = 0;
            int stackIn_68_0 = 0;
            int stackOut_3_0 = 0;
            int stackOut_4_0 = 0;
            int stackOut_9_0 = 0;
            int stackOut_10_0 = 0;
            int stackOut_16_0 = 0;
            int stackOut_17_0 = 0;
            int stackOut_36_0 = 0;
            int stackOut_37_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_43_0 = 0;
            int stackOut_64_0 = 0;
            int stackOut_65_0 = 0;
            int stackOut_67_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = Main.field_T;
                        var6 = (Object) (Object) ((hc) this).field_d;
                        // monitorenter ((hc) this).field_d
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
                            statePc = (stateCaught_1 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (((hc) this).field_g.b((byte) -95) >= (long)(6 + param2 * 6)) {
                                statePc = 6;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof IOException ? 67 : 69);
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
                            statePc = (stateCaught_3 instanceof IOException ? 67 : 69);
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
                            statePc = 69;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        return stackIn_5_0 != 0;
                    }
                    case 6: {
                        try {
                            ((hc) this).field_g.a((long)(param2 * 6), -65);
                            ((hc) this).field_g.a((byte) -118, fb.field_e, 0, 6);
                            var7_int = (fb.field_e[3] << -154627664 & 16711680) + ((255 & fb.field_e[4]) << -724984504) + (255 & fb.field_e[5]);
                            if ((var7_int ^ -1) >= -1) {
                                statePc = 9;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if ((long)var7_int <= ((hc) this).field_d.b((byte) -95) / 520L) {
                                statePc = 15;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof IOException ? 67 : 69);
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
                            statePc = (stateCaught_9 instanceof IOException ? 67 : 69);
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
                            statePc = 69;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        return stackIn_11_0 != 0;
                    }
                    case 12: {
                        try {
                            var7_int = (int)((((hc) this).field_d.b((byte) -95) + 519L) / 520L);
                            if (var7_int == 0) {
                                statePc = 14;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof IOException ? 67 : 69);
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
                            statePc = (stateCaught_14 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            fb.field_e[2] = (byte)param3;
                            fb.field_e[5] = (byte)var7_int;
                            fb.field_e[1] = (byte)(param3 >> -161480696);
                            fb.field_e[0] = (byte)(param3 >> -2129914736);
                            fb.field_e[3] = (byte)(var7_int >> 1987771280);
                            fb.field_e[4] = (byte)(var7_int >> -871337784);
                            ((hc) this).field_g.a((long)(6 * param2), -76);
                            ((hc) this).field_g.a(fb.field_e, 0, 6, -1);
                            if (param4 == 2) {
                                statePc = 19;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 67 : 69);
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
                            statePc = (stateCaught_16 instanceof IOException ? 67 : 69);
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
                            statePc = 69;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        return stackIn_18_0 != 0;
                    }
                    case 19: {
                        try {
                            var8 = 0;
                            var9 = 0;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (param3 <= var8) {
                                statePc = 64;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 67 : 69);
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
                            statePc = (stateCaught_21 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            ((hc) this).field_d.a((long)(var7_int * 520), -98);
                            if ((param2 ^ -1) < -65536) {
                                statePc = 28;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            ((hc) this).field_d.a((byte) -118, fb.field_e, 0, 8);
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof EOFException ? 26 : (stateCaught_24 instanceof IOException ? 67 : 69));
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var14 = (EOFException) (Object) caughtException;
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var11 = ((255 & fb.field_e[0]) << -2074176664) + (fb.field_e[1] & 255);
                            var12 = ((255 & fb.field_e[2]) << -1026058776) + (255 & fb.field_e[3]);
                            var13 = fb.field_e[7] & 255;
                            var10 = (fb.field_e[6] & 255) + ((fb.field_e[5] << 278414728 & 65280) + (16711680 & fb.field_e[4] << 1451688784));
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            ((hc) this).field_d.a((byte) -118, fb.field_e, 0, 10);
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof EOFException ? 30 : (stateCaught_28 instanceof IOException ? 67 : 69));
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var14 = (EOFException) (Object) caughtException;
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            var10 = (16711680 & fb.field_e[6] << 318418000) - -(fb.field_e[7] << -1520354904 & 65280) - -(fb.field_e[8] & 255);
                            var13 = 255 & fb.field_e[9];
                            var12 = (fb.field_e[5] & 255) + ((fb.field_e[4] & 255) << -1691588856);
                            var11 = ((255 & fb.field_e[1]) << -1590617744) + ((255 & fb.field_e[0]) << 1428562040) - (-(fb.field_e[2] << -1631064504 & 65280) + -(fb.field_e[3] & 255));
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 67 : 69);
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
                            statePc = (stateCaught_32 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (var12 != var9) {
                                statePc = 36;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (((hc) this).field_c != var13) {
                                statePc = 36;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof IOException ? 67 : 69);
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
                            statePc = (stateCaught_36 instanceof IOException ? 67 : 69);
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
                            statePc = 69;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        return stackIn_38_0 != 0;
                    }
                    case 39: {
                        try {
                            if (0 > var10) {
                                statePc = 42;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (((hc) this).field_d.b((byte) -95) / 520L < (long)var10) {
                                statePc = 42;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof IOException ? 67 : 69);
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
                            statePc = (stateCaught_42 instanceof IOException ? 67 : 69);
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
                            statePc = 69;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        return stackIn_44_0 != 0;
                    }
                    case 45: {
                        try {
                            if (var10 == -1) {
                                statePc = 47;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            var10 = (int)((((hc) this).field_d.b((byte) -95) - -519L) / 520L);
                            param0 = false;
                            if (-1 == var10) {
                                statePc = 49;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof IOException ? 67 : 69);
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
                            statePc = (stateCaught_49 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            if (var7_int == var10) {
                                statePc = 52;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            var10++;
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if ((-var8 + param3 ^ -1) < -513) {
                                statePc = 55;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            var10 = 0;
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            if (65535 >= param2) {
                                statePc = 60;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            fb.field_e[5] = (byte)var9;
                            fb.field_e[2] = (byte)(param2 >> -566601848);
                            fb.field_e[9] = (byte)((hc) this).field_c;
                            fb.field_e[3] = (byte)param2;
                            fb.field_e[1] = (byte)(param2 >> 1373882832);
                            fb.field_e[4] = (byte)(var9 >> -1266986328);
                            fb.field_e[8] = (byte)var10;
                            fb.field_e[7] = (byte)(var10 >> 1957470600);
                            fb.field_e[6] = (byte)(var10 >> 990672816);
                            fb.field_e[0] = (byte)(param2 >> 488200888);
                            ((hc) this).field_d.a((long)(var7_int * 520), 108);
                            ((hc) this).field_d.a(fb.field_e, 0, 10, -1);
                            var11 = param3 - var8;
                            if ((var11 ^ -1) < -511) {
                                statePc = 58;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            var11 = 510;
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            ((hc) this).field_d.a(param1, var8, var11, -1);
                            var8 = var8 + var11;
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            fb.field_e[4] = (byte)(var10 >> 287224976);
                            fb.field_e[5] = (byte)(var10 >> -293689592);
                            fb.field_e[3] = (byte)var9;
                            fb.field_e[6] = (byte)var10;
                            fb.field_e[7] = (byte)((hc) this).field_c;
                            fb.field_e[1] = (byte)param2;
                            fb.field_e[0] = (byte)(param2 >> 1395767720);
                            fb.field_e[2] = (byte)(var9 >> -1777890584);
                            ((hc) this).field_d.a((long)(520 * var7_int), 23);
                            ((hc) this).field_d.a(fb.field_e, 0, 8, param4 ^ -3);
                            var11 = param3 - var8;
                            if (var11 <= 512) {
                                statePc = 62;
                            } else {
                                statePc = 61;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            var11 = 512;
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = (stateCaught_61 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            ((hc) this).field_d.a(param1, var8, var11, -1);
                            var8 = var8 + var11;
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = (stateCaught_62 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            var9++;
                            var7_int = var10;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = (stateCaught_63 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            stackOut_64_0 = 1;
                            stackIn_65_0 = stackOut_64_0;
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = (stateCaught_64 instanceof IOException ? 67 : 69);
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            // monitorexit var6
                            stackOut_65_0 = stackIn_65_0;
                            stackIn_66_0 = stackOut_65_0;
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 69;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        return stackIn_66_0 != 0;
                    }
                    case 67: {
                        try {
                            var7 = (IOException) (Object) caughtException;
                            // monitorexit var6
                            stackOut_67_0 = 0;
                            stackIn_68_0 = stackOut_67_0;
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 69;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        return stackIn_68_0 != 0;
                    }
                    case 69: {
                        try {
                            var15 = caughtException;
                            // monitorexit var6
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 69;
                            continue stateLoop;
                        }
                    }
                    case 70: {
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Achievements";
        field_f = -1;
        field_h = new fe(2);
        field_b = new nc();
        field_e = "Instructions";
    }
}
