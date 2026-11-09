/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lw {
    static ContentTransitionPhase RESIZING;
    static String moreMemoryIsRequiredText;
    static int field_b;
    private static String field_z;

    public static void releaseStatics(int param0) {
        RESIZING = null;
        if (param0 != -1685) {
          return;
        }
        moreMemoryIsRequiredText = null;
    }

    static {
        field_z = "lw.A(";
        RESIZING = new ContentTransitionPhase();
        moreMemoryIsRequiredText = "More memory is required to run in different resolutions. Try updating your version of Java or changing your Java settings.";
    }
}
