/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii extends RuntimeException {
    static int[] field_e;
    Throwable field_f;
    String field_a;
    static int field_c;
    static int[] field_d;
    static String[] field_b;

    final static boolean a() {
        if (null == r.field_a) {
            return false;
        }
        if (null == r.field_a.i((byte) -127)) {
            return false;
        }
        return true;
    }

    final static boolean a(int param0, char param1) {
        if (48 > param1) {
            return false;
        }
        if (57 < param1) {
            return false;
        }
        return true;
    }

    ii(Throwable param0, String param1) {
        ((ii) this).field_a = param1;
        ((ii) this).field_f = param0;
    }

    public static void a(int param0) {
        field_e = null;
        field_b = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[]{16744319, 8388479, 16777087, 8421631};
    }
}
