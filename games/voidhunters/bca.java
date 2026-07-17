/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bca implements dja {
    static dpb field_a;

    public final tv a(byte param0) {
        int var2 = -86 % ((-64 - param0) / 50);
        return (tv) (Object) new be();
    }

    public static void a() {
        field_a = null;
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            return null;
        }
        return (tv[]) (Object) new be[param1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new dpb();
        spa discarded$0 = new spa();
    }
}
