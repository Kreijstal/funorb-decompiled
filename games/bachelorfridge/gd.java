/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gd extends pu {
    static Calendar field_o;
    static int field_m;
    static gna[][] field_n;
    static volatile long field_l;

    final static int a(int param0, boolean param1, int param2) {
        int var3 = param2 >>> 31;
        return -var3 + (param2 - -var3) / param0;
    }

    final static void a(int param0, int param1, int param2, byte param3, kv param4, int param5, int param6, int param7, po param8) {
        try {
            ou.field_b = -2400;
            cga.field_p = 2;
            vc.field_c = param0;
            rs.field_c = 40;
            od.field_B = param4;
            kt.field_j = 80;
            sha.field_m = 15;
            ima.field_r = 80;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "gd.A(" + param0 + ',' + -2400 + ',' + 40 + ',' + -85 + ',' + (param4 != null ? "{...}" : "null") + ',' + 16744576 + ',' + 80 + ',' + 2 + ',' + (param8 != null ? "{...}" : "null") + ',' + 80 + ',' + 15 + ')');
        }
    }

    public static void d() {
        field_n = null;
        field_o = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_m = 0;
        field_l = 0L;
    }
}
