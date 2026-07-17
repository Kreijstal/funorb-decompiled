/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb extends qb {
    static jd field_j;
    static String field_h;
    static gd field_g;
    static int field_i;

    public static void a() {
        field_h = null;
        field_j = null;
        field_g = null;
    }

    final static int a(byte param0, int param1) {
        param1--;
        param1 = param1 | param1 >>> 1;
        param1 = param1 | param1 >>> 2;
        param1 = param1 | param1 >>> 4;
        param1 = param1 | param1 >>> 8;
        param1 = param1 | param1 >>> 16;
        return param1 + 1;
    }

    private cb() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Suggested names: ";
    }
}
