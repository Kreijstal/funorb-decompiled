/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nma implements dja {
    static int field_a;
    static da[] field_b;

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            tv discarded$0 = ((nma) this).a((byte) -57);
            return (tv[]) (Object) new gtb[param1];
        }
        return (tv[]) (Object) new gtb[param1];
    }

    public final tv a(byte param0) {
        int var2 = 20 % ((-64 - param0) / 50);
        return (tv) (Object) new gtb();
    }

    public static void b(byte param0) {
        field_b = null;
        if (param0 != -4) {
            field_a = 33;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
    }
}
