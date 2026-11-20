/*
 * Decompiled by CFR-JS 0.4.0.
 */
class SocialPanelState {
    static Widget socialPanelRoot;
    static int chatPanelProgress;
    private static String field_z;

    public static void clearSharedReferences(int param0) {
        if (param0 >= -1) {
          socialPanelRoot = (Widget) null;
          socialPanelRoot = null;
          return;
        }
        socialPanelRoot = null;
    }

    static {
        field_z = "tb.F(";
    }
}
