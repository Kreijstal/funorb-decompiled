/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class cf extends ki {
    static qf field_fb;
    static Vector field_eb;

    final void b(int param0, ga param1) {
        try {
            super.b(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "cf.DB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void m() {
        field_eb = null;
        field_fb = null;
    }

    cf(dn param0, ga param1) {
        super(param0, param1, 33, 20, 30);
    }

    static {
    }
}
