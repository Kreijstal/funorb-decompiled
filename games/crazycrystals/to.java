/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class to {
    static int field_a;
    static int[] field_b;
    static int field_d;
    static String field_e;
    static int field_c;
    static String field_f;

    final static void a(int param0, java.awt.Canvas param1) {
        try {
            if (!(11 != hp.field_s)) {
                int discarded$0 = 95;
                fg.c();
            }
            tg.a(pj.field_p, ta.field_i, (byte) -41, nf.field_f);
            int discarded$1 = 4;
            int discarded$2 = 0;
            int discarded$3 = 0;
            bq.a(param1);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "to.A(" + 0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a() {
        field_b = null;
        field_f = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_b = new int[128];
        field_e = "Username: ";
    }
}
