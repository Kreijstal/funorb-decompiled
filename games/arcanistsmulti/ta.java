/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta {
    static int field_e;
    static String field_a;
    String field_f;
    static kc[] field_i;
    int field_h;
    static boolean field_b;
    String field_j;
    eg field_c;
    String field_g;
    static boolean field_d;

    final static int a(boolean param0, int param1) {
        int var2 = 7 & 6 + param1;
        if (0 != var2) {
            if (var2 > 5) {
                return 3;
            }
            return 2;
        }
        return 5;
    }

    public static void a(int param0) {
        field_a = null;
        field_i = null;
    }

    private ta() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
        field_a = "You need to play 1 more rated game to unlock this option.";
    }
}
