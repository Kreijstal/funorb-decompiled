/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ch {
    static k field_c;
    static String field_f;
    static int field_b;
    int field_g;
    static ji field_a;
    static kc field_d;
    static String field_e;
    static String field_h;

    public final String toString() {
        throw new IllegalStateException();
    }

    ch(int param0) {
        this.field_g = param0;
    }

    public static void a(boolean param0) {
        field_e = null;
        field_d = null;
        field_h = null;
        if (param0) {
            return;
        }
        field_a = null;
        field_f = null;
        field_c = null;
    }

    static {
        field_f = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_e = "Selection:";
        field_a = new ji();
        field_h = "Player Name: ";
    }
}
