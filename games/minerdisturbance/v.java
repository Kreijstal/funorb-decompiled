/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v implements uj {
    static String field_a;
    static int[] field_b;
    static boolean field_e;
    static ea[] field_d;
    static int field_c;

    public final void a(boolean param0) {
        om.field_g = 12;
        if (param0) {
            ((v) this).a(true);
            tb.field_a = 4;
            return;
        }
        tb.field_a = 4;
    }

    public final String a(byte param0) {
        int var2 = 80 % ((-33 - param0) / 62);
        return "Add Bones";
    }

    public static void b(byte param0) {
        field_d = null;
        field_b = null;
        if (param0 > -25) {
            return;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[4];
        field_a = "Ranking: Minor Miner";
    }
}
