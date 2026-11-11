/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GraphicsQuality {
    static String field_b;
    static QuickChatParamType field_c;
    static String field_a;

    final static void openDisplaySettingsDialog(int param0) {
        if (param0 <= -17) {
          ModelFactory.field_a.hideAllDialogs(true);
          ModelFactory.field_a.pushDialog(new DisplaySettingsDialog(ModelFactory.field_a), 89);
          return;
        }
        field_a = (String) null;
        ModelFactory.field_a.hideAllDialogs(true);
        ModelFactory.field_a.pushDialog(new DisplaySettingsDialog(ModelFactory.field_a), 89);
    }

    public static void releaseStatics(int param0) {
        field_b = null;
        if (param0 != -7646) {
          GraphicsQuality.releaseStatics(104);
          field_c = null;
          field_a = null;
          return;
        }
        field_c = null;
        field_a = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_b = "Bottomless pits";
        field_a = "Add friend";
        field_c = new QuickChatParamType(13, 0, 1, 0);
    }
}
