/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AlternateNumericLoginCredentials extends NumericLoginCredentials {
    static String field_u;
    static String field_q;
    static int field_o;
    static String field_n;
    static boolean field_s;
    static String field_t;
    static String field_p;
    static RgbSprite[] field_r;

    AlternateNumericLoginCredentials(long identifier, String password) {
        super(identifier, password);
    }

    public static void b(byte param0) {
        field_q = null;
        field_u = null;
        field_r = null;
        field_n = null;
        field_t = null;
        if (param0 == -121) {
          field_p = null;
          return;
        }
        field_o = -51;
        field_p = null;
    }

    final LoginCredentialKind getCredentialKind(int obfuscationGuard) {
        if (obfuscationGuard != 13) {
          field_r = (RgbSprite[]) null;
          return PopupWidgetLayer.alternateNumericLoginKind;
        }
        return PopupWidgetLayer.alternateNumericLoginKind;
    }

    static {
        field_q = "No spectators";
        field_u = "Similar rating";
        field_t = "Loading...";
        field_n = "Waiting for instruments";
        field_p = "Level: <%0>";
    }
}
