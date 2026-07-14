/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa {
    static volatile boolean field_b;
    static String field_a;

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    final static boolean a(jd param0, byte param1) {
        if (param1 >= -107) {
            return true;
        }
        return (param0.d((byte) 48, 1) ^ -1) == -2 ? true : false;
    }

    public static void a(int param0) {
        if (param0 != -2) {
            wa.a(85);
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = true;
    }
}
