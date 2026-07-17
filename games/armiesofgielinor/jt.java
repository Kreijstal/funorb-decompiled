/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jt {
    static int field_a;

    final static void a(int param0, boolean param1, int param2, int param3) {
        og.a(16756, param1);
        ib.a(40, param1, param3, param2);
        if (param0 != -32216) {
            field_a = 9;
        }
    }

    final static boolean a() {
        int var1 = 72;
        if (tb.field_e == null) {
            return false;
        }
        if (!tb.field_e.d((byte) -101)) {
            return false;
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 16;
    }
}
