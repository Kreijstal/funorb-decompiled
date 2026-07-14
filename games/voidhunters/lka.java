/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lka implements dja {
    static int[] field_a;

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            tv discarded$0 = ((lka) this).a((byte) 43);
            return (tv[]) (Object) new imb[param1];
        }
        return (tv[]) (Object) new imb[param1];
    }

    public final tv a(byte param0) {
        int var2 = -113 % ((-64 - param0) / 50);
        return (tv) (Object) new imb();
    }

    public static void a(int param0) {
        if (param0 != 8192) {
            lka.a(-29);
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[8192];
    }
}
