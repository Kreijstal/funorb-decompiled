/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class he extends wt {
    int field_p;
    static eg field_o;
    static volatile int field_n;

    public static void f(int param0) {
        if (param0 != 0) {
            field_n = 38;
            field_o = null;
            return;
        }
        field_o = null;
    }

    abstract Object a(byte param0);

    he(int param0) {
        ((he) this).field_p = param0;
    }

    abstract boolean e(int param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = 0;
        field_o = new eg();
    }
}
