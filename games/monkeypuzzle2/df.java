/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class df extends wj {
    static String field_o;
    static le[] field_q;
    private rj field_n;
    static ad field_p;
    private rj field_r;

    final static void f(int param0) {
        int var1 = 0;
        int var2 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 != 18180) {
            df.f((byte) -8);
        }
        ge.h(80, 0, 560, 480);
        for (var1 = 0; fg.field_a > var1; var1++) {
            if (n.field_d[var1][0] > 0.0f) {
                cc.field_a[ul.field_O[var1]][hh.field_r[var1]].c((int)pl.field_f[var1][0], (int)pl.field_f[var1][1]);
            } else {
                cc.field_a[ul.field_O[var1]][hh.field_r[var1]].f((int)pl.field_f[var1][0], (int)pl.field_f[var1][1]);
            }
        }
        ge.h(0, 0, 640, 480);
    }

    final static void h(int param0) {
        int var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        int var1 = -126 / ((param0 - 64) / 47);
        int[] var2 = cl.field_g;
        int var3 = 0;
        int var4 = var2.length;
        while ((var3 ^ -1) > (var4 ^ -1)) {
            var3++;
            var2[var3] = 0;
            var3++;
            var2[var3] = 0;
            var3++;
            var2[var3] = 0;
            var3++;
            var2[var3] = 0;
            var3++;
            var2[var3] = 0;
            var3++;
            var2[var3] = 0;
            var3++;
            var2[var3] = 0;
            var3++;
            var2[var3] = 0;
        }
    }

    final static void e(int param0) {
        if (!(ha.field_db)) {
            throw new IllegalStateException();
        }
        cf.field_c = true;
        hl.a((byte) -60, false);
        int var1 = -79 % ((21 - param0) / 46);
        k.field_g = 0;
    }

    df(rj param0, rj param1, rj param2) {
        super(param0);
        ((df) this).field_r = param2;
        ((df) this).field_n = param1;
    }

    final String a(int param0, String param1) {
        String var6 = ((df) this).field_n.field_s.toLowerCase();
        String var4 = param1.toLowerCase();
        if (var4.length() == 0) {
            return null;
        }
        if (param0 != 1) {
            return null;
        }
        String var5 = var4;
        if (tl.a(0, var5)) {
            return dd.field_a;
        }
        if (bg.a(param0 ^ 4827, var5)) {
            return qi.field_E;
        }
        if (sg.a(var5, false)) {
            return eb.field_E;
        }
        if (!(!this.a((byte) 119, param1))) {
            return ad.field_d;
        }
        if (-1 > (var6.length() ^ -1)) {
            if (!(!qj.a(var5, false, var6))) {
                return fc.field_b;
            }
            if (!(!ue.a(var5, var6, (byte) 66))) {
                return ck.field_d;
            }
            if (!(!di.a(95, var6, var5))) {
                return fc.field_b;
            }
            return dd.field_a;
        }
        return pb.field_i;
    }

    private final boolean a(byte param0, String param1) {
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        if (param0 < 50) {
            field_p = null;
        }
        String var3 = ((df) this).field_r.field_s.toLowerCase();
        String var4 = param1.toLowerCase();
        if ((var3.length() ^ -1) < -1) {
            if (0 >= var4.length()) {
                return false;
            }
            var5 = var3.lastIndexOf("@");
            if (0 <= var5) {
                if (var5 < -1 + var3.length()) {
                    var6 = var3.substring(0, var5);
                    var7 = var3.substring(1 + var5);
                    if (!(var4.indexOf(var6) < 0)) {
                        return true;
                    }
                    return 0 > var4.indexOf(var7) ? false : true;
                }
            }
        }
        return false;
    }

    final static void a(gk param0, boolean param1) {
        try {
            byte[] var2 = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
                        if (!param1) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        return;
                    }
                    case 2: {
                        var6 = new byte[24];
                        var2 = var6;
                        if (hj.field_D != null) {
                            statePc = 4;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        try {
                            hj.field_D.a((byte) 101, 0L);
                            hj.field_D.a(3805, var6);
                            var3_int = 0;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (-25 >= (var3_int ^ -1)) {
                                statePc = 9;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (0 == var2[var3_int]) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 13;
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
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (24 <= var3_int) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            param0.b(var2, 24, -2, 0);
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        var3 = (Exception) (Object) caughtException;
                        var4 = 0;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        if (var4 >= 24) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        var2[var4] = (byte)-1;
                        var4++;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 16: {
                        param0.b(var2, 24, -2, 0);
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
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

    final static ai a(String param0, ad param1, byte param2, String param3) {
        int var4 = param1.c(param0, (byte) -105);
        int var5 = param1.a(param3, var4, param2 ^ -28509);
        if (param2 != 118) {
            field_q = null;
        }
        return rd.a(var5, param1, var4, 1896);
    }

    final static void f(byte param0) {
        if (param0 > -17) {
            return;
        }
        ua.field_v = new pj();
    }

    final na a(String param0, int param1) {
        String var3 = ((df) this).field_n.field_s.toLowerCase();
        if (param1 != 3917) {
            df.f((byte) 86);
        }
        String var4 = param0.toLowerCase();
        if (var4.length() == 0) {
            return ol.field_h;
        }
        if (!ph.a(var3, -67, var4)) {
            return ol.field_h;
        }
        if (!(!this.a((byte) 76, param0))) {
            return ol.field_h;
        }
        return wj.field_i;
    }

    public static void g(int param0) {
        field_p = null;
        field_q = null;
        field_o = null;
        if (param0 != 0) {
            field_p = null;
        }
    }

    static {
    }
}
