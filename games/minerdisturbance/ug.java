/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug implements uj {
    static String field_b;
    static bf field_a;

    public static void b(byte param0) {
        if (param0 <= 41) {
            ug.b((byte) 64);
            field_b = null;
            field_a = null;
            return;
        }
        field_b = null;
        field_a = null;
    }

    public final String a(byte param0) {
        int var2 = 86 % ((-33 - param0) / 62);
        return "Make Ore Freezium";
    }

    public final void a(boolean param0) {
        tb.field_a = 1;
        gd.field_x = 5;
        if (param0) {
            field_b = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Ranking: King of the Snowmen";
    }
}
