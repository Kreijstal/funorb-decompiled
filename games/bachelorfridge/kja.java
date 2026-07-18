/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class kja {
    int field_a;
    static kv field_e;
    int field_c;
    int field_b;
    int field_d;

    final static void a(int param0, int param1, byte param2, boolean param3) {
        wg.a(param3, -90);
        vla.a(5, param1, param0, param3);
    }

    final static sna a(byte param0) {
        return ak.field_q.field_vb;
    }

    public static void b(int param0) {
        field_e = null;
    }

    final static int a(int param0) {
        return new Date().getYear() + 1900;
    }

    final static void a(int param0, byte param1, ne param2) {
        pf var3 = null;
        try {
            if (param1 < 1) {
                Object var4 = null;
                kja.a(80, (byte) 81, (ne) null);
            }
            var3 = sja.field_fb;
            var3.c(param0, (byte) 108);
            var3.d(param2.field_o, 0);
            var3.d(param2.field_i, 0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "kja.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
