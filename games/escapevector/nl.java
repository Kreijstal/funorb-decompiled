/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl {
    static String field_a;

    public static void a(int param0) {
        if (param0 != 16558) {
            return;
        }
        field_a = null;
    }

    final static boolean a(byte param0, int param1) {
        if (param1 == 0) {
            return true;
        }
        if (param0 < 95) {
            field_a = null;
            if (-2 != (param1 ^ -1)) {
                return false;
            }
            return true;
        }
        return -2 != (param1 ^ -1) ? false : true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Shield recharged";
    }
}
