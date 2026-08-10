/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td {
    static double[] field_c;
    static am field_e;
    static String field_a;
    static kl field_b;
    static int field_d;

    final static void a(float param0, String param1, boolean param2) {
        try {
            ta.field_i = param1;
            pj.field_p = param0;
            if (param2) {
                field_d = 90;
            }
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "td.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 != 0) {
            field_c = (double[]) null;
            field_e = null;
            return;
        }
        field_e = null;
    }

    static {
        field_a = "Account created successfully!";
        field_d = 0;
    }
}
