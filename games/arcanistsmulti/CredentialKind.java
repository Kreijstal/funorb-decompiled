/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CredentialKind {
    static BufferedSocket field_c;
    static String field_f;
    static int field_b;
    int field_g;
    static KeyboardInputHandler field_a;
    static SceneWidget field_d;
    static String field_e;
    static String field_h;

    public final String toString() {
        throw new IllegalStateException();
    }

    CredentialKind(int param0) {
        this.field_g = param0;
    }

    public static void releaseStatics(boolean param0) {
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
        field_a = new KeyboardInputHandler();
        field_h = "Player Name: ";
    }
}
