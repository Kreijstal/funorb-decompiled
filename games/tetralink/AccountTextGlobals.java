/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountTextGlobals {
    static String field_d;
    static String field_c;
    static String field_f;
    static UiComponent field_a;
    static Sprite[][] field_g;
    static String field_e;
    static boolean field_b;
    private static String field_z;

    public static void releaseStatics(int param0) {
        field_a = null;
        field_e = null;
        field_f = null;
        if (param0 >= 1) {
          field_d = null;
          field_g = (Sprite[][]) null;
          field_c = null;
          return;
        }
        AccountTextGlobals.releaseStatics(-29);
        field_d = null;
        field_g = (Sprite[][]) null;
        field_c = null;
    }

    static {
        field_z = "jm.A(";
        field_c = "Player names can be up to 12 letters, numbers and underscores";
        field_e = "Error";
        field_d = "Change display name";
        field_f = "Create a free Account";
    }
}
