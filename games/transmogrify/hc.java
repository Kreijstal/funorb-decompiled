/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hc extends dl {
    static ti field_r;
    static java.util.zip.CRC32 field_v;
    static int field_t;
    private Object field_s;
    static int field_u;

    public static void d(byte param0) {
        field_v = null;
        field_r = null;
    }

    final boolean d(int param0) {
        if (param0 != 8) {
            return false;
        }
        return false;
    }

    hc(Object param0, int param1) {
        super(param1);
        try {
            ((hc) this).field_s = param0;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "hc.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final Object c(byte param0) {
        int var2 = -64 / ((param0 - 21) / 49);
        return ((hc) this).field_s;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = 0;
        field_v = new java.util.zip.CRC32();
    }
}
