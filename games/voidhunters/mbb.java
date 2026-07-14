/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mbb implements dja {
    static String field_a;
    static int field_c;
    static boolean field_b;
    static String field_d;

    public static void a(int param0) {
        if (param0 != 50) {
            mbb.a(-18);
            field_d = null;
            field_a = null;
            return;
        }
        field_d = null;
        field_a = null;
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            tv discarded$0 = ((mbb) this).a((byte) -26);
            return (tv[]) (Object) new lrb[param1];
        }
        return (tv[]) (Object) new lrb[param1];
    }

    public final tv a(byte param0) {
        int var2 = -72 / ((-64 - param0) / 50);
        return (tv) (Object) new lrb();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = true;
        field_c = 50;
        field_a = "Remove selected condition/action";
        field_d = "SAVED BLUEPRINT";
    }
}
