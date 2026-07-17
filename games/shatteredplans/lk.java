/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk extends kg {
    static String field_D;

    lk(String param0, ko param1, boolean param2) {
        this(param0, param1);
        try {
            ((lk) this).field_z = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "lk.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final static void a() {
        rd.field_g = null;
        ui.field_p = nm.field_a;
    }

    private lk(String param0, ko param1) {
        this(param0, qq.field_I.field_q, param1);
        try {
            ((lk) this).field_p = qq.field_I.field_a;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "lk.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    private lk(String param0, iq param1, ko param2) {
        super(param0, param1, param2);
        try {
            ((lk) this).field_p = qq.field_I.field_a;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "lk.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        ((lk) this).field_z = !((lk) this).field_z ? true : false;
        super.a(param0, param1, param2, param3);
    }

    public static void h() {
        field_D = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "Maximum total production";
    }
}
