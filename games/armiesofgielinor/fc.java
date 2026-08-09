/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc implements kh {
    static boolean field_a;
    static volatile int field_b;
    static String field_c;

    public final void a(kb param0, int param1, int param2, boolean param3, int param4) {
        try {
            if (param2 >= -79) {
                field_b = 123;
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "fc.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 >= -86) {
            fc.a(115);
            field_c = null;
            return;
        }
        field_c = null;
    }

    static {
        field_c = "This cannon can only use fire weapons.";
        field_b = 0;
    }
}
