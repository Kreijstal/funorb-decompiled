/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig {
    static int field_e;
    static String field_d;
    static bj field_c;
    static int field_b;
    static String field_a;

    final static boolean a() {
        if (di.field_x == null) {
            return false;
        }
        if (!mh.a(di.field_x, -1)) {
            return false;
        }
        return true;
    }

    final static void a(int param0, int param1, il param2) {
        ld var3 = null;
        int var4 = 0;
        try {
            var3 = sn.field_c;
            var3.d((byte) -77, param0);
            var3.field_o = var3.field_o + 1;
            var4 = var3.field_o;
            var3.c(1, 25564);
            var3.c(param2.field_r, 25564);
            var3.d(-87, param2.field_p);
            var3.a((byte) 110, param2.field_o);
            var3.a((byte) 82, param2.field_q);
            var3.a((byte) 106, param2.field_u);
            var3.a((byte) 121, param2.field_w);
            int discarded$0 = var3.e(-128, var4);
            var3.g(-1, var3.field_o - var4);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "ig.A(" + param0 + ',' + 1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b() {
        field_c = null;
        field_d = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "The charge is a step up from dynamite, as it can be used underwater. Press <img=19> to drop a charge.";
        field_a = "Updates will sent to the email address you've given";
    }
}
