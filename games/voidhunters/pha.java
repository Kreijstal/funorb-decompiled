/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pha extends rqa {
    static ds field_o;
    static String field_p;
    static String field_q;
    static String[] field_r;

    public static void a(int param0) {
        if (param0 != 22829) {
            return;
        }
        field_r = null;
        field_q = null;
        field_p = null;
        field_o = null;
    }

    pha(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
            return null;
        }
        return new nc((Object) (Object) frb.a(7, 105));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "<%0> has not yet unlocked this option for use.";
        field_r = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
