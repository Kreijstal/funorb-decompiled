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
        cka.field_o = new hqb(param1, param0, param4, param6, param8, param2, param3);
    }

    public static void a(boolean param0) {
        if (!param0) {
            field_c = null;
            field_d = null;
            field_c = null;
            return;
        }
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
