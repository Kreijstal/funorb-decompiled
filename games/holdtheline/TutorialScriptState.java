/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TutorialScriptState {
    static String field_d;
    static String[] lines;
    static String field_e;
    static String field_b;
    static NamedSoundEffect field_a;
    private static String field_z;

    public static void clearSharedReferences(boolean param0) {
        field_d = null;
        field_a = null;
        if (!param0) {
          return;
        }
        field_b = null;
        field_e = null;
        lines = null;
    }

    static {
        field_z = "rc.A(";
        field_d = "Email: ";
        field_b = "Click";
        field_e = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}
