/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class uc {
    static String field_a;
    static java.awt.Frame field_d;
    static volatile int field_b;
    static int[] field_c;

    abstract void a(byte param0);

    abstract void a(boolean param0);

    abstract boolean b(byte param0);

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        if (param0 != 0) {
            field_d = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static int a(boolean param0, byte param1, int param2, int param3) {
        if (param1 < 36) {
            return 92;
        }
        return ga.p(-1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_c = new int[]{2, 2, 2, 2, 0, 0, 0, 0, 2, 1, 1, 2, 2, 1, 1, 2, 1, 1, 1, 1, 1, 1, 2};
        field_a = "Loading sound effects";
    }
}
