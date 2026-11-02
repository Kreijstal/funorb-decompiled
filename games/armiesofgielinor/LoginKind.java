/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginKind {
    static String[] field_e;
    static ClientUiComponent field_d;
    int code;
    static ResourceArchive field_g;
    static String field_b;
    static String field_h;
    static String field_f;
    static long field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void releaseStatics(int obfuscationGuard) {
        field_f = null;
        field_b = null;
        field_g = null;
        field_e = null;
        if (obfuscationGuard == -25764) {
          field_d = null;
          field_h = null;
          return;
        }
        field_h = (String) null;
        field_d = null;
        field_h = null;
    }

    LoginKind(int param0) {
        this.code = param0;
    }

    static {
        field_e = new String[]{"Small", "Medium", "Large", "Epic"};
        field_h = "More suggestions";
        field_f = "<%0> has not yet unlocked this option for use.";
        field_b = "Add friend";
    }
}
