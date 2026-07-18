/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh extends fe {
    static mi field_qb;
    static String field_rb;
    static s field_tb;
    static String field_ub;
    static String field_sb;
    static int field_vb;

    final static void m(int param0) {
        ob.field_G = ue.a(false);
        qj.field_h = 0;
        if (param0 >= -58) {
            bh.m(-3);
        }
    }

    bh(cp param0, oc param1) {
        super(param0, param1, 33, 20, 30);
    }

    public static void n() {
        field_ub = null;
        field_qb = null;
        field_tb = null;
        field_rb = null;
        field_sb = null;
    }

    final void b(byte param0, oc param1) {
        if (param0 <= 105) {
            return;
        }
        try {
            super.b((byte) 120, param1);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "bh.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_rb = "You do not have a suitable number of players for the current options.";
        field_sb = "This entry doesn't match";
        field_ub = "Oh dear!";
        field_qb = new mi();
    }
}
