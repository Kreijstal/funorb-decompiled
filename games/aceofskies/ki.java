/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki extends fn {
    static String field_c;
    private String field_d;
    static int field_g;
    static int field_e;
    private String field_f;

    final void a(rb param0, boolean param1) {
        try {
            if (!param1) {
                eo discarded$0 = ((ki) this).a(87);
            }
            param0.a(!param1 ? true : false, ((ki) this).field_d);
            param0.b(0, ((ki) this).field_f);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "ki.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final eo a(int param0) {
        if (param0 > -51) {
            return null;
        }
        return jd.field_a;
    }

    public static void b(int param0) {
        if (param0 != 64) {
            ki.b(-115);
            field_c = null;
            return;
        }
        field_c = null;
    }

    ki(String param0, String param1) {
        try {
            ((ki) this).field_d = param0;
            ((ki) this).field_f = param1;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "ki.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "classic";
        field_g = 64;
        field_e = 0;
    }
}
