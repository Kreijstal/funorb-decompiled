/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class aa {
    static jpa field_a;
    static String field_b;
    static int field_c;

    protected aa() throws Throwable {
        throw new Error();
    }

    public static void a(boolean param0) {
        field_a = null;
        field_b = null;
        if (!param0) {
            field_a = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Don't mind";
    }
}
