/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pea {
    static int field_b;
    static int field_a;
    static slb field_d;
    static String field_c;

    final static void a(long param0, llb param1, int param2, int[] param3, String param4, soa param5, String param6, byte param7, int param8) {
        qg.field_a = param5;
        if (param7 <= 21) {
            return;
        }
        try {
            cka.field_o = new hqb(param1, param0, param4, param6, param8, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "pea.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 44 + (param6 != null ? "{...}" : "null") + 44 + param7 + 44 + param8 + 41);
        }
    }

    public static void a() {
        field_d = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 1;
        field_a = 1280;
        field_d = new slb();
        field_c = "Please enter your date of birth to enable chat:";
    }
}
