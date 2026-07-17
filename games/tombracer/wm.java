/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wm {
    static String field_b;
    static dfa field_a;

    final static int a(int param0, int param1, int param2) {
        int var3 = 19 / ((param2 - 70) / 33);
        if (!(param1 >= 0)) {
            return 0;
        }
        if (!(param1 <= param0)) {
            return 0;
        }
        return bs.a(param0, -28970, param1);
    }

    public static void a(byte param0) {
        if (param0 <= 10) {
            wm.a((byte) -21);
            field_b = null;
            field_a = null;
            return;
        }
        field_b = null;
        field_a = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Apply";
    }
}
