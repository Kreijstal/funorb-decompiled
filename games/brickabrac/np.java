/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class np {
    static String field_e;
    static String field_f;
    static int fullscreenDialogLeft;
    static RgbSprite jungleFarSprite;
    static RgbSprite[][] volcanicSegsSprites;
    static int uiRowHeight;

    final static void b(boolean param0) {
        PopupWidgetLayer.widgetTheme = sh.a((byte) 84);
        if (!param0) {
          ResourceArchive.field_f = new WidgetLayerStack();
          ArrayWidgetGroup.a((byte) -16, true, true);
          return;
        }
        field_e = (String) null;
        ResourceArchive.field_f = new WidgetLayerStack();
        ArrayWidgetGroup.a((byte) -16, true, true);
    }

    public static void a(boolean param0) {
        field_f = null;
        jungleFarSprite = null;
        field_e = null;
        volcanicSegsSprites = (RgbSprite[][]) null;
        if (!param0) {
          np.a(false);
        }
    }

    static {
        field_e = "Unable to connect to the data server. Please check any firewall you are using.";
        field_f = "Decline invitation to <%0>'s game";
    }
}
