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
            return (pl) null;
        }
        return boa.field_s;
    }

    final void a(uia param0, boolean param1) {
        try {
            if (param1) {
                this.field_f = (String) null;
            }
            param0.a(this.field_g, (byte) 0);
            param0.a(this.field_f, -127);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "wc.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    wc(String param0, String param1) {
        try {
            this.field_f = param1;
            this.field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "wc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = "Options";
        field_e = new su(9, 0, 4, 1);
    }
}
