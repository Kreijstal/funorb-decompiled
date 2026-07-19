/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ka implements uj {
    static ae field_d;
    static String field_c;
    static String field_b;
    static int field_a;

    public final String a(byte param0) {
        int var2 = 19 / ((param0 - -33) / 62);
        return "Fill Cell Water";
    }

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        field_b = null;
        if (param0 != 3) {
            ka.a(-55);
        }
    }

    public final void a(boolean param0) {
        ha.field_e = 2;
        tb.field_a = 3;
        if (param0) {
            this.a(false);
        }
    }

    static {
        field_d = new ae();
        field_c = "Highscores";
        field_b = "Username: ";
    }
}
