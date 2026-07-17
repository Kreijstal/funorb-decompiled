/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je {
    static int field_a;
    static int[] field_b;
    static int field_c;

    final static int a(int param0, int param1, boolean param2, int param3) {
        return (0 != (param0 & 1) ? -param1 : param1) + ((param0 & 2) == 0 ? param3 : -param3);
    }

    public static void a(int param0) {
        if (param0 != 2) {
            je.a(-82);
            field_b = null;
            return;
        }
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[1024];
        field_a = 3;
        field_c = 0;
    }
}
