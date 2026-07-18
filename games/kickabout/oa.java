/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class oa {
    static Calendar field_a;
    static hd field_b;

    final static void b() {
        int discarded$0 = -25;
        ee.b();
        int discarded$1 = -125;
        aq.c();
    }

    final static ut a(boolean param0) {
        int var8 = 0;
        int var9 = Kickabout.field_G;
        kg[] var10 = ph.field_e[!param0 ? 3 : 1];
        kg[] var11 = var10;
        int var4 = var10[0].field_a;
        int[] var5 = new int[]{var10[0].field_i, var10[1].field_i, var10[2].field_i};
        ut var6 = new ut(var5[1] * 11 + var5[0] + var5[2], var4);
        iw.a(-122, var6);
        int var7 = 0;
        var10[0].a(var7, 0);
        var7 = var7 + var5[0];
        for (var8 = 0; var8 < 11; var8++) {
            var10[1].a(var7, 0);
            var7 = var7 + var5[1];
        }
        var11[2].a(var7, 0);
        ta.e(122);
        int discarded$0 = 20684;
        pd.a(var6);
        return var6;
    }

    final static void a(boolean param0, int param1, int param2, boolean param3, int param4, byte[] param5) {
        ml var10 = null;
        int var7 = 0;
        int var8 = 0;
        try {
            var10 = or.field_d;
            if (param0) {
                Object var9 = null;
                oa.a(true, 43, -115, false, -33, (byte[]) null);
            }
            var10.b(param1, (byte) 120);
            var10.field_n = var10.field_n + 1;
            var7 = var10.field_n;
            var10.a(124, 4);
            var10.a(104, param2);
            var8 = param4;
            if (!(!param3)) {
                var8 += 128;
            }
            var10.a(108, var8);
            var10.a(0, param5.length, 1991220144, param5);
            var10.c(62, -var7 + var10.field_n);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "oa.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, hc param1) {
        try {
            sn.field_g.insertElementAt((Object) (Object) param1, 0);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "oa.F(" + false + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
            return;
        }
        field_a = null;
    }

    final static void a(byte param0, boolean param1) {
        wd.field_l.a(0, 0, (byte) -114);
        if (param0 > -98) {
            field_b = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
    }
}
