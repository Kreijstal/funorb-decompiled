/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kea {
    static String field_b;
    static su field_c;
    static String field_a;

    final static void b(int param0) {
        wu.field_a.e(true);
        wu.field_a.c((ae) (Object) new at(wu.field_a), 89);
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != -7646) {
            kea.a(104);
            field_c = null;
            field_a = null;
            return;
        }
        field_c = null;
        field_a = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Bottomless pits";
        field_a = "Add friend";
        field_c = new su(13, 0, 1, 0);
    }
}
