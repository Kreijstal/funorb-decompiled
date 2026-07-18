/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh {
    static int field_b;
    static String field_a;
    static hk field_d;
    static int field_c;

    final static int a(boolean param0) {
        return ac.field_e;
    }

    final static boolean b(byte param0) {
        if (param0 < 31) {
            return true;
        }
        return ni.field_d > 250 ? true : false;
    }

    public static void a(byte param0) {
        field_d = null;
        field_a = null;
        if (param0 < 87) {
            gh.a((byte) 2);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "To server list";
        field_c = 0;
    }
}
