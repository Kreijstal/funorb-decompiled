/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ns {
    static ha field_a;

    final static void a(wt param0, int param1, wt param2) {
        if (!(null == param0.field_f)) {
            param0.d(-122);
        }
        param0.field_j = param2.field_j;
        param0.field_f = param2;
        param0.field_f.field_j = param0;
        try {
            param0.field_j.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "ns.B(" + (param0 != null ? "{...}" : "null") + ',' + -30575 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a() {
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = null;
    }
}
