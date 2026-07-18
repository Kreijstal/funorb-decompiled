/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be {
    static String field_e;
    static km field_d;
    static String[] field_b;
    static String field_g;
    static int field_f;
    static int[] field_a;
    static String field_c;

    final static km[] a(int param0, boolean param1, int param2, int param3, int param4) {
        return jc.a(3, 1, 0, 0, 1, 0, 1, 65793, 0);
    }

    public static void a(byte param0) {
        field_d = null;
        field_b = null;
        field_c = null;
        field_a = null;
        field_g = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Message game";
        field_g = "Open";
        field_f = 50;
        field_c = "Show chat";
        field_b = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
    }
}
