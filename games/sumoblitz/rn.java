/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rn {
    static String field_a;

    final static void a(String param0, int param1, int param2, int param3, int param4) {
        try {
            ig.field_b.a((ms) (new to(param0, param3, param1, param2)), (byte) 39);
            if (param4 != 28807) {
                rn.a(16);
            }
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "rn.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 13921) {
            String var2 = (String) null;
            rn.a((String) null, 84, 7, -70, 53);
        }
    }

    static {
        field_a = "Unfortunately you are not eligible to create an account.";
    }
}
