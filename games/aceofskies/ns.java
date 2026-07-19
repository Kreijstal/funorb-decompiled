/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ns {
    static ha field_a;

    final static void a(wt param0, int param1, wt param2) {
        if (!(null == param0.field_f)) {
            param0.d(param1 + 30453);
        }
        param0.field_j = param2.field_j;
        param0.field_f = param2;
        param0.field_f.field_j = param0;
        if (param1 != -30575) {
            return;
        }
        try {
            param0.field_j.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "ns.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != -24169) {
            field_a = (ha) null;
        }
    }

    static {
        field_a = null;
    }
}
