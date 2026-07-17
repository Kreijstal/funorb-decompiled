/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc extends lu {
    private String field_g;
    private String field_f;
    static String field_d;
    static su field_e;

    public static void b(byte param0) {
        if (param0 != -78) {
            wc.b((byte) 127);
            field_d = null;
            field_e = null;
            return;
        }
        field_d = null;
        field_e = null;
    }

    final pl a(byte param0) {
        if (param0 != 113) {
            return null;
        }
        return boa.field_s;
    }

    final void a(uia param0, boolean param1) {
        try {
            if (param1) {
                ((wc) this).field_f = null;
            }
            param0.a(((wc) this).field_g, (byte) 0);
            param0.a(((wc) this).field_f, -127);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "wc.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    wc(String param0, String param1) {
        try {
            ((wc) this).field_f = param1;
            ((wc) this).field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "wc.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Options";
        field_e = new su(9, 0, 4, 1);
    }
}
