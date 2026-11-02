/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WidgetLayerBootstrap {
    static String field_e;
    static String field_f;
    static int fullscreenDialogLeft;
    static RgbSprite jungleFarSprite;
    static RgbSprite[][] volcanicSegsSprites;
    static int uiRowHeight;

    final static void createWidgetLayerStack(boolean param0) {
        PopupWidgetLayer.widgetTheme = IntegerValidationHelpers.getSharedWidgetTheme((byte) 84);
        if (!param0) {
          ResourceArchive.field_f = new WidgetLayerStack();
          ArrayWidgetGroup.a((byte) -16, true, true);
          return;
        }
        field_e = (String) null;
        ResourceArchive.field_f = new WidgetLayerStack();
        ArrayWidgetGroup.a((byte) -16, true, true);
    }

    public static void clearSharedReferences(boolean obfuscationGuard) {
        field_f = null;
        jungleFarSprite = null;
        field_e = null;
        volcanicSegsSprites = (RgbSprite[][]) null;
        if (!obfuscationGuard) {
          WidgetLayerBootstrap.clearSharedReferences(false);
        }
    }

    static {
        field_e = "Unable to connect to the data server. Please check any firewall you are using.";
        field_f = "Decline invitation to <%0>'s game";
    }
}
