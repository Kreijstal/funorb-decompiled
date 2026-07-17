/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jja implements dja {
    static String field_a;
    static String field_b;

    public final tv a(byte param0) {
        int var2 = -54 % ((-64 - param0) / 50);
        return (tv) (Object) new pwa();
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            field_b = null;
            return (tv[]) (Object) new pwa[param1];
        }
        return (tv[]) (Object) new pwa[param1];
    }

    public static void b() {
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "No spectators";
        field_a = "Age:";
    }
}
