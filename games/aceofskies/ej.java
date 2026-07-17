/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej {
    static ej field_b;
    static mg field_a;
    int field_c;
    int field_d;

    public static void a() {
        field_a = null;
        field_b = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    ej(int param0, int param1, int param2, int param3) {
        ((ej) this).field_c = param3;
        ((ej) this).field_d = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new ej(8, 0, 4, 1);
    }
}
