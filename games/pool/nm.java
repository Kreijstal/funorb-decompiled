/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nm {
    static String field_g;
    static int field_e;
    static int field_f;
    static dd field_d;
    static boolean field_c;
    static vh field_a;
    static boolean field_b;
    private dd[] field_h;

    final static void a(byte param0) {
        if (param0 != 41) {
            return;
        }
        qa.a(true, re.field_d, -104, eo.field_Rb);
        to.field_q = true;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        nj.a(((nm) this).field_h, (byte) -72, param0, param3, param1, param4);
        if (param2 != -6316) {
            nm.a((byte) -25);
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            nm.a(true);
            field_a = null;
            field_g = null;
            field_d = null;
            return;
        }
        field_a = null;
        field_g = null;
        field_d = null;
    }

    nm(dd[] param0) {
        try {
            ((nm) this).field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "nm.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Asking for or providing contact information";
    }
}
