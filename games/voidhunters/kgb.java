/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kgb implements dja {
    static int field_a;
    static int[] field_b;

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            return null;
        }
        return (tv[]) (Object) new hg[param1];
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
            kgb.a(-84);
        }
    }

    public final tv a(byte param0) {
        int var2 = 108 % ((param0 - -64) / 50);
        return (tv) (Object) new hg();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_b = new int[8192];
    }
}
