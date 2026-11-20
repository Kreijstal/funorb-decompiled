/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StandaloneWindow {
    static String field_c;
    static String field_b;
    static java.awt.Frame frame;
    private static String field_z;

    public static void clearSharedReferences(int param0) {
        if (param0 > 100) {
          field_c = null;
          frame = null;
          field_b = null;
          return;
        }
        StandaloneWindow.clearSharedReferences(-112);
        field_c = null;
        frame = null;
        field_b = null;
    }

    static {
        field_z = "fm.A(";
        field_c = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_b = "Fetching highscores...";
    }
}
