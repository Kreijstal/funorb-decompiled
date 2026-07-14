/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jk {
    static gh[] field_a;
    static String field_e;
    static String field_f;
    static String field_b;
    static String field_k;
    private int[] field_c;
    static int[] field_j;
    static mg field_i;
    static String field_g;
    static gh field_h;
    static int field_d;

    final static boolean c(byte param0) {
        if (param0 <= 77) {
            jk.d((byte) 44);
        }
        return !gf.field_a.a((byte) -72) ? true : false;
    }

    final int a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var3 = (((jk) this).field_c.length >> 848561185) + -1;
        var4 = param0 & var3;
        var5 = 8 / ((48 - param1) / 60);
        L0: while (true) {
          var6 = ((jk) this).field_c[1 + var4 + var4];
          if (var6 == -1) {
            return -1;
          } else {
            if (((jk) this).field_c[var4 - -var4] != param0) {
              var4 = var3 & var4 - -1;
              continue L0;
            } else {
              return var6;
            }
          }
        }
    }

    final static String a(int param0, byte[] param1) {
        if (param0 != 13) {
            field_g = null;
        }
        return ub.a((byte) 37, 0, param1, param1.length);
    }

    jk(int[] param0) {
        int var3 = 0;
        int var4 = 0;
        int var2 = 1;
        while ((param0.length >> -1063765151) + param0.length >= var2) {
            var2 = var2 << 1;
        }
        ((jk) this).field_c = new int[var2 + var2];
        for (var3 = 0; var2 + var2 > var3; var3++) {
            ((jk) this).field_c[var3] = -1;
        }
        for (var3 = 0; var3 < param0.length; var3++) {
            var4 = -1 + var2 & param0[var3];
            while ((((jk) this).field_c[1 + var4 + var4] ^ -1) != 0) {
                var4 = 1 + var4 & -1 + var2;
            }
            ((jk) this).field_c[var4 - -var4] = param0[var3];
            ((jk) this).field_c[1 + var4 + var4] = var3;
        }
    }

    final static void a(int param0, gi param1) {
        try {
            byte[] var2 = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            byte[] var7 = null;
            byte[] var8 = null;
            byte[] var9 = null;
            byte[] var10 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = SteelSentinels.field_G;
                        if (param0 >= 120) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        field_a = null;
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        var9 = new byte[24];
                        var7 = var9;
                        var6 = var7;
                        var10 = var6;
                        var8 = var10;
                        var2 = var8;
                        if (null != va.field_h) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        param1.a(24, (byte) -122, 0, var10);
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 4: {
                        try {
                            va.field_h.a(-121, 0L);
                            va.field_h.a(-121, var9);
                            var3_int = 0;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (24 <= var3_int) {
                                statePc = 9;
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
                            if (-1 == (var10[var3_int] ^ -1)) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var3_int++;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if ((var3_int ^ -1) > -25) {
                                statePc = 15;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        var3 = (Exception) (Object) caughtException;
                        var4 = 0;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        if ((var4 ^ -1) <= -25) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        var2[var4] = (byte)-1;
                        var4++;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 15: {
                        param1.a(24, (byte) -122, 0, var10);
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 16: {
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

    final static void d(byte param0) {
        pc.d(param0 + -14);
        vd.a((byte) 63);
        if (param0 != -66) {
            field_b = null;
        }
    }

    public static void b(byte param0) {
        if (param0 >= -67) {
            boolean discarded$0 = jk.c((byte) -9);
        }
        field_f = null;
        field_g = null;
        field_e = null;
        field_i = null;
        field_h = null;
        field_a = null;
        field_j = null;
        field_b = null;
        field_k = null;
    }

    final static void a(byte param0) {
        wk var3 = new wk(120, 30);
        wk var4 = var3;
        ub.field_a[0] = qe.a(var4, (byte) -93, jf.field_eb);
        ub.field_a[1] = qe.a(var4, (byte) -93, gf.field_e);
        ub.field_a[2] = qe.a(var4, (byte) -93, ob.field_w);
        ub.field_a[3] = qe.a(var4, (byte) -93, fm.field_i);
        ub.field_a[4] = qe.a(var4, (byte) -93, sn.field_o);
        ub.field_a[5] = qe.a(var4, (byte) -93, gm.field_a);
        ub.field_a[9] = qe.a(var4, (byte) -93, fc.field_c);
        ub.field_a[10] = qe.a(var4, (byte) -93, hm.field_e);
        ub.field_a[11] = qe.a(var4, (byte) -93, sn.field_a);
        ub.field_a[12] = qe.a(var4, (byte) -93, jm.field_t);
        ub.field_a[13] = qe.a(var4, (byte) -93, cl.field_g);
        ub.field_a[14] = qe.a(var4, (byte) -93, b.field_p);
        ub.field_a[15] = qe.a(var4, (byte) -93, lk.field_X);
        ub.field_a[16] = qe.a(var4, (byte) -93, pl.field_V);
        lc.field_a = new gk[ub.field_a.length];
        ii.a((Object[]) (Object) ub.field_a, 0, (Object[]) (Object) lc.field_a, 0, ub.field_a.length);
        lc.field_a[5] = ub.field_a[15];
        lc.field_a[4] = ub.field_a[14];
        lc.field_a[3] = ub.field_a[13];
        lc.field_a[8] = ub.field_a[7];
        lc.field_a[7] = ub.field_a[12];
        lc.field_a[15] = null;
        lc.field_a[14] = null;
        lc.field_a[13] = null;
        lc.field_a[12] = ub.field_a[7];
        rh.field_v[6].d();
        if (param0 != 6) {
            return;
        }
        fk.field_d.a(gf.field_e, 78, 26, 0, -1);
        fk.field_d.a(ob.field_w, 130, 26, 0, -1);
        sb.field_bb.b((byte) 121);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "achievements to collect";
        field_k = "<%1> was caught in <%0>'s core containment explosion";
        field_b = "Start Game";
        field_j = new int[]{14, 15, 16, 22, 4, -1, 8};
    }
}
