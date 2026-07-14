/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class uk extends nf {
    private int field_h;
    private int field_k;
    static ko field_i;
    static boolean field_j;

    public static void c(int param0) {
        field_i = null;
        int var1 = -52 / ((param0 - -61) / 60);
    }

    final pb b(byte param0) {
        if (param0 >= -127) {
            ((uk) this).field_h = 65;
        }
        return (pb) (Object) new mn();
    }

    final f a(boolean param0, int param1, int param2, int param3, ta param4) {
        ((uk) this).field_k = ((uk) this).field_k + param3;
        if (param0) {
            return null;
        }
        ((uk) this).field_h = ((uk) this).field_h + 1;
        ph.a(q.field_a[ma.field_n[param1]].a((byte) 107, param2) ? 50 : 25, (byte) 107, param1, param4);
        return bm.field_g;
    }

    final static void d(int param0) {
        try {
            IOException var1_ref_IOException = null;
            int[] var1_ref_int__ = null;
            int var1 = 0;
            int var2 = 0;
            int var3 = 0;
            int var4 = 0;
            int[] var5 = null;
            int[] var6 = null;
            int[] var7 = null;
            int[] var8 = null;
            int[] var9 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var4 = CrazyCrystals.field_B;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (param0 == -9762) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            uk.c(-48);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (null != ol.field_z[0]) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            ol.field_z[0] = b.a(0, (InputStream) (Object) new ByteArrayInputStream(ba.field_k.a(7693, "tutorial.ccl", "")), qp.field_g);
                            vp.a(125);
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if ((mo.field_l ^ -1) < -1) {
                                statePc = 9;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (ol.field_z[1] == null) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            ol.field_z[1] = b.a(0, (InputStream) (Object) new ByteArrayInputStream(ba.field_k.a(7693, "puzzle1p.ccl", "")), ro.field_r);
                            vp.a(param0 ^ -9800);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (null != ol.field_z[2]) {
                                statePc = 16;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (pd.field_f == null) {
                                statePc = 12;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            pd.field_f = w.a(param0 + 9762, 0, 2, 5);
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            var9 = pd.field_f.field_j;
                            var8 = var9;
                            var7 = var8;
                            var6 = var7;
                            var5 = var6;
                            var1_ref_int__ = var5;
                            if (var1_ref_int__ != null) {
                                statePc = 15;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        return;
                    }
                    case 15: {
                        try {
                            ol.field_z[1] = b.a(oe.a(param0, -9762), (InputStream) (Object) new ByteArrayInputStream(mg.field_g.a(false, var9, "puzzle1p.ccl", "")), ro.field_r);
                            ol.field_z[2] = b.a(0, (InputStream) (Object) new ByteArrayInputStream(mg.field_g.a(false, var9, "puzzle2p.ccl", "")), pg.field_e);
                            ol.field_z[3] = b.a(param0 + 9762, (InputStream) (Object) new ByteArrayInputStream(mg.field_g.a(false, var9, "puzzle3p.ccl", "")), qg.field_c);
                            ol.field_z[4] = b.a(0, (InputStream) (Object) new ByteArrayInputStream(mg.field_g.a(false, var9, "arcade1p.ccl", "")), kk.field_k);
                            pd.field_f = null;
                            mg.field_g = null;
                            vp.a(105);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            ba.field_k = null;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        var1_ref_IOException = (IOException) (Object) caughtException;
                        throw new RuntimeException(var1_ref_IOException.getMessage());
                    }
                    case 19: {
                        if (jc.field_b) {
                            statePc = 40;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        if (!rc.a(-39)) {
                            statePc = 22;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        if (null == pc.field_u) {
                            statePc = 24;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        pc.field_u = new pp[5];
                        var1 = 0;
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 25: {
                        if (var1 >= 5) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        pc.field_u[var1] = ea.a(var1, 1, (byte) 65, 5);
                        var1++;
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 27: {
                        var1 = 1;
                        var2 = 0;
                        statePc = 28;
                        continue stateLoop;
                    }
                    case 28: {
                        if ((var2 ^ -1) <= -6) {
                            statePc = 38;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    }
                    case 29: {
                        if (pc.field_u[var2] == null) {
                            statePc = 35;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    }
                    case 30: {
                        if (!pc.field_u[var2].field_h) {
                            statePc = 35;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    }
                    case 31: {
                        if (pc.field_u[var2].field_g[0] > ke.field_b[var2]) {
                            statePc = 33;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    }
                    case 33: {
                        var3 = pc.field_u[var2].field_g[0] + -ke.field_b[var2];
                        ka.field_n = ka.field_n - var3;
                        ei.field_F = ei.field_F - 2 * var3;
                        sm.field_f = sm.field_f - var3 * 2;
                        ke.field_b[var2] = pc.field_u[var2].field_g[0];
                        statePc = 34;
                        continue stateLoop;
                    }
                    case 34: {
                        pc.field_u[var2] = null;
                        statePc = 35;
                        continue stateLoop;
                    }
                    case 35: {
                        if (pc.field_u[var2] != null) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    }
                    case 36: {
                        var2++;
                        statePc = 28;
                        continue stateLoop;
                    }
                    case 37: {
                        var1 = 0;
                        var2++;
                        statePc = 28;
                        continue stateLoop;
                    }
                    case 38: {
                        if (var1 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    }
                    case 39: {
                        jc.field_b = true;
                        pc.field_u = null;
                        statePc = 40;
                        continue stateLoop;
                    }
                    case 40: {
                        if (gh.field_y) {
                            statePc = 47;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    }
                    case 41: {
                        if (!rc.a(-63)) {
                            statePc = 43;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    }
                    case 43: {
                        if (null != eb.field_p) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    }
                    case 44: {
                        eb.field_p = qa.a((byte) 121, 4);
                        statePc = 45;
                        continue stateLoop;
                    }
                    case 45: {
                        if (!eb.field_p.field_k) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    }
                    case 46: {
                        fk.field_s = eb.field_p.field_f;
                        pc.field_y = pc.field_y & (fk.field_s ^ -1);
                        gh.field_y = true;
                        fk.field_s = fk.field_s + pc.field_y;
                        eb.field_p = null;
                        statePc = 47;
                        continue stateLoop;
                    }
                    case 47: {
                        return;
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

    uk() {
        ((uk) this).field_h = 0;
        ((uk) this).field_k = 0;
    }

    final void a(byte param0) {
        int var2 = -37 % ((param0 - 29) / 42);
        tb.field_d.a(cf.field_d, 100, 48 * (gi.field_m * ((uk) this).field_h), ((uk) this).field_k / ((uk) this).field_h);
        ((uk) this).field_h = 0;
        ((uk) this).field_k = 0;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        int var6 = CrazyCrystals.field_B;
        param2 = param2 + param3;
        if (!param0) {
            field_j = false;
        }
        while (param2 > param3) {
            pd.field_g[param1] = pd.field_g[param1] + (q.field_a[ma.field_n[param1]].a((byte) 92, param3) ? 50 : 25);
            param3++;
        }
    }

    final static jp a(byte param0, String param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = CrazyCrystals.field_B;
        int var2 = param1.length();
        if (param0 < 43) {
            uk.d(38);
        }
        for (var3 = 0; var3 < var2; var3++) {
            var4 = param1.charAt(var3);
            if (var4 < 48) {
                return null;
            }
            if (var4 > 57) {
                return null;
            }
        }
        return sl.field_m;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = false;
    }
}
