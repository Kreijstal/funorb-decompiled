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
        int var3 = param2 >>> 185376735;
        if (param1) {
            return -13;
        }
        return -var3 + (param2 - -var3) / param0;
    }

    final static void a(int param0, int param1, int param2, byte param3, kv param4, int param5, int param6, int param7, po param8, int param9, int param10) {
        try {
            ou.field_b = param1;
            cga.field_p = param7;
            vc.field_c = param0;
            rs.field_c = param2;
            od.field_B = param4;
            kt.field_j = param9;
            sha.field_m = param10;
            if (param3 > -57) {
                field_l = -90L;
            }
            ima.field_r = param6;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "gd.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ',' + param9 + ',' + param10 + ')');
        }
    }

    public static void d(byte param0) {
        field_n = (gna[][]) null;
        field_o = null;
        if (param0 != -49) {
            field_m = 109;
        }
    }

    static {
        field_o = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_m = 0;
        field_l = 0L;
    }
}
