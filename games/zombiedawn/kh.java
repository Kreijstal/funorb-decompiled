/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh implements io {
    static vn field_a;

    public final void a(int param0, boolean param1, int param2, ga param3, int param4) {
        try {
            if (param0 != 16777215) {
                field_a = (vn) null;
            }
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "kh.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static fn a(int param0, boolean param1) {
        tm var2 = new tm(param0);
        kn.field_L.a(0, var2);
        if (param1) {
            return (fn) null;
        }
        return var2.field_j;
    }

    public static void a(int param0) {
        field_a = null;
        int var1 = -5 % ((-18 - param0) / 41);
    }

    static {
    }
}
