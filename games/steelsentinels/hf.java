/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf {
    static int field_c;
    static String field_b;
    static String field_d;
    static int field_e;
    static String field_f;
    static String field_a;

    public static void a(boolean param0) {
        field_a = null;
        field_f = null;
        field_b = null;
        field_d = null;
    }

    final static void a(ak param0, int param1, int param2, ak param3, int param4, int param5) {
        try {
            rc.field_j = param1;
            ng.field_m = param2;
            if (param4 >= -122) {
                Object var7 = null;
                hf.a((ak) null, -18, -91, (ak) null, 27, -75);
            }
            vd.field_f = param0;
            ud.field_y = param5;
            kk.field_c = param3;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "hf.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        hh.field_a.a(param0, (byte) 127);
    }

    final static wk[] a() {
        int discarded$0 = 1;
        int discarded$1 = 1;
        int discarded$2 = 0;
        int discarded$3 = 0;
        int discarded$4 = 65793;
        int discarded$5 = 0;
        int discarded$6 = 4;
        int discarded$7 = 1;
        int discarded$8 = 3;
        return ch.a();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Camera follows sentinel: On";
        field_a = "Slots:<br><%0> <times> <%1>";
        field_e = 20;
        field_d = "Name is available";
        field_f = "Invite more players, or alternatively try changing the '<%0>' setting.";
    }
}
