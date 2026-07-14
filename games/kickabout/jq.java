/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jq {
    static String field_c;
    private static int[] field_b;
    static String[] field_a;
    private static String field_z;

    public static void a(boolean param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        if (!param0) {
            field_c = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "jq.A(";
        field_a = new String[]{"The minimum bid for an auction. This can be adjusted (within limits) to compete with others on the marketplace.", "If you choose to set a buyout price, bidders can instantly buy your character and you might get a faster sale.", "Increasing the duration of your auction might drive up the final sale price, as long as you've got enough patience."};
        field_b = new int[4];
        field_c = "Password is valid";
        field_b[3] = 0;
        field_b[0] = 2000;
        field_b[2] = 6000;
        field_b[1] = 4000;
    }
}
