/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gj {
    static String field_a;

    final static void a(byte param0) {
        int var1 = 38 % ((param0 - -66) / 55);
        mm.field_u.e((na) (Object) new qb(), -27667);
    }

    final static void a(int param0, int param1, int param2, int param3) {
        ve.field_b = param2;
        lk.field_wb = param1;
        mc.field_b = param3;
    }

    public static void a() {
        field_a = null;
    }

    final static void a(ve param0, int param1, int param2) {
        try {
            ng.field_D = param1;
            nm.field_o = param0;
            fl.field_b = param2;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "gj.C(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + -20140 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Password: ";
    }
}
