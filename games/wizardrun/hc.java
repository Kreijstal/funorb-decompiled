/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hc extends mf {
    private static int[] field_l;
    static int field_o;
    private fe field_k;
    private boolean field_n;
    private String field_m;

    final static void f(int param0) {
        if (param0 != 92682) {
            field_l = null;
        }
        de.a((byte) -52, we.field_a, sf.field_a, true);
        ga.field_a = true;
    }

    public static void g(int param0) {
        field_l = null;
        if (param0 != 2098078177) {
            field_l = null;
        }
    }

    final static boolean a(int param0, int param1) {
        try {
            if (!(nk.field_N.field_m < param0)) {
                return true;
            }
            if (jc.field_H == null) {
                return false;
            }
            int var2_int = jc.field_H.c((byte) 89);
            if (param1 != -28266) {
                hc.f(-28);
            }
            if (var2_int > 0) {
                if (-nk.field_N.field_m + param0 < var2_int) {
                    var2_int = -nk.field_N.field_m + param0;
                }
                jc.field_H.a(nk.field_N.field_k, 114, var2_int, nk.field_N.field_m);
                eg.field_C = d.a((byte) 29);
                nk.field_N.field_m = nk.field_N.field_m + var2_int;
                if (param0 > nk.field_N.field_m) {
                    return false;
                }
                nk.field_N.field_m = 0;
                return true;
            }
            try {
                if (false) throw (IOException) null;
                if (var2_int >= 0) {
                    if (30000L >= eh.a(2)) {
                        return false;
                    }
                }
                ql.a(-114);
            } catch (IOException iOException) {
                ql.a(param1 ^ 28227);
            }
            return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final String a(String param0, int param1) {
        if (((hc) this).field_k.a(param1, param0) == hg.field_c) {
            return ((hc) this).field_k.a(param0, -1);
        }
        if (((hc) this).a(-1, param0) == hg.field_c) {
            return wl.field_d;
        }
        return eh.field_h;
    }

    final static void c(boolean param0) {
        if (!param0) {
            field_o = 35;
        }
        if (!f.field_e) {
            if (null == ok.field_c) {
                ok.field_c = dc.a((byte) 103, 4);
            }
            if (ok.field_c.field_i) {
                qf.field_l = qf.field_l & (ok.field_c.field_j ^ -1);
                ti.field_a = ti.field_a | ok.field_c.field_j;
                ok.field_c = null;
                f.field_e = true;
            }
        }
        if (!e.field_a) {
            if (!(null != rf.field_a)) {
                rf.field_a = ff.c(5, 1, 2, 0);
            }
            if (!(!rf.field_a.field_j)) {
                if (rf.field_a.field_n[0] > pl.field_A) {
                    pl.field_A = rf.field_a.field_n[0];
                }
                e.field_a = true;
                rf.field_a = null;
            }
        }
        if (f.field_e) {
            if (!(!e.field_a)) {
                cf.a((byte) 79);
            }
        }
    }

    final static void a(pg param0, boolean param1, int param2) {
        sf.field_j.a((wl) (Object) param0, param1);
        pg.a(param2, true, param0);
    }

    hc(og param0, og param1) {
        super(param0);
        ((hc) this).field_n = false;
        ((hc) this).field_m = "";
        ((hc) this).field_k = new fe(param0, param1);
    }

    final ok a(int param0, String param1) {
        sf var3 = null;
        if (!(((hc) this).field_k.a(param0, param1) != hg.field_c)) {
            return hg.field_c;
        }
        if (!param1.equals((Object) (Object) ((hc) this).field_m)) {
            var3 = ad.a(param1, 6);
            if (!var3.a(true)) {
                return l.field_S;
            }
            ((hc) this).field_m = param1;
            ((hc) this).field_n = var3.b(25843);
        }
        return ((hc) this).field_n ? gf.field_V : hg.field_c;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        long var6 = 0L;
        long var4 = 0L;
        int var2 = 0;
        int var3 = 0;
        int var1 = 0;
        field_o = 200;
        field_l = new int[98304];
        for (var0 = 92682; var0 >= 46341; var0--) {
            var6 = (long)(1 + (var0 << -974987615));
            var4 = (long)((var0 << 2098078177) + -1);
            var2 = (int)(-32768L + (var4 * var4 >> 201838482));
            var3 = (int)(-32768L + (var6 * var6 >> 1494184338));
            if (var3 >= field_l.length) {
                var3 = -1 + field_l.length;
            }
            for (var1 = 0 <= var2 ? var2 : 0; var1 <= var3; var1++) {
                field_l[var1] = var0;
            }
        }
    }
}
