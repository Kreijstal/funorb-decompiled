/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk {
    static int field_a;
    long field_b;
    static Object field_d;
    private fr field_c;

    public static void a(int param0) {
        if (param0 != -25140) {
            mk.a(-127);
            field_d = null;
            return;
        }
        field_d = null;
    }

    protected final void finalize() throws Throwable {
        ((mk) this).field_c.a(((mk) this).field_b, (byte) -81);
        super.finalize();
    }

    mk(fr param0, long param1, int param2) {
        ((mk) this).field_c = param0;
        ((mk) this).field_b = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
    }
}
