/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi {
    static bd field_e;
    boolean field_b;
    static String field_a;
    String field_d;
    String field_f;
    static String field_c;

    public static void a(int param0) {
        field_c = null;
        if (param0 != 24074) {
            wi.a(-33);
            field_e = null;
            field_a = null;
            return;
        }
        field_e = null;
        field_a = null;
    }

    final static void a(p param0, int param1, byte param2, int param3) {
        try {
            int var4_int = -72 % ((param2 - -34) / 41);
            om.field_d.a(true, 128, (int)param0.field_c - -128, param1, param3);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "wi.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Destroy the reactor and escape on your shuttle.";
    }
}
