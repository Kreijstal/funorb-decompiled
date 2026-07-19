/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk extends kg {
    static String field_D;

    lk(String param0, ko param1, boolean param2) {
        this(param0, param1);
        try {
            this.field_z = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "lk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(int param0) {
        rd.field_g = null;
        ui.field_p = nm.field_a;
        if (param0 != -15365) {
            lk.h(-36);
        }
    }

    private lk(String param0, ko param1) {
        this(param0, qq.field_I.field_q, param1);
        try {
            this.field_p = qq.field_I.field_a;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "lk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private lk(String param0, iq param1, ko param2) {
        super(param0, param1, param2);
        try {
            this.field_p = qq.field_I.field_a;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "lk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        this.field_z = !this.field_z ? true : false;
        super.a(param0, param1, param2, param3);
    }

    public static void h(int param0) {
        if (param0 != -22429) {
            field_D = (String) null;
            field_D = null;
            return;
        }
        field_D = null;
    }

    static {
        field_D = "Maximum total production";
    }
}
