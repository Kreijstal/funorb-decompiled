/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg {
    private boolean field_b;
    static g[] field_a;
    g[] field_c;

    public static void a(int param0) {
        if (param0 != -1485) {
            return;
        }
        field_a = null;
    }

    final boolean a(byte param0) {
        if (param0 > -22) {
            return true;
        }
        return ((qg) this).field_b;
    }

    qg(g[] param0, boolean param1) {
        try {
            ((qg) this).field_c = param0;
            ((qg) this).field_b = param1 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "qg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}
