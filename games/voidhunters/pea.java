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
            throw rta.a((Throwable) ((Object) runtimeException), "pea.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            field_c = (String) null;
            field_d = null;
            field_c = null;
            return;
        }
        field_d = null;
        field_c = null;
    }

    static {
        field_b = 1;
        field_a = 1280;
        field_d = new slb();
        field_c = "Please enter your date of birth to enable chat:";
    }
}
