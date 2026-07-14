/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk extends kg {
    static String field_D;

    lk(String param0, ko param1, boolean param2) {
        this(param0, param1);
        ((lk) this).field_z = param2 ? true : false;
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
        ((lk) this).field_p = qq.field_I.field_a;
    }

    private lk(String param0, iq param1, ko param2) {
        super(param0, param1, param2);
        ((lk) this).field_p = qq.field_I.field_a;
    }

    final void a(int param0, int param1, int param2, byte param3) {
        ((lk) this).field_z = !((lk) this).field_z ? true : false;
        super.a(param0, param1, param2, param3);
    }

    public static void h(int param0) {
        if (param0 != -22429) {
            field_D = null;
            field_D = null;
            return;
        }
        field_D = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "Maximum total production";
    }
}
