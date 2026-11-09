/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dn {
    static String arcadeGameText;
    static String applyText;

    public static void releaseStatics(int param0) {
        if (param0 != -3) {
          return;
        }
        applyText = null;
        arcadeGameText = null;
    }

    final static String b(int param0) {
        if (TextureCoordinateGeneration.field_a < 2) {
          return pi.field_b;
        }
        if (null != DropDownListWidget.field_H) {
          if (!DropDownListWidget.field_H.loadIndex((byte) 127)) {
            return LegacyOpenGlTexture3D.field_k;
          }
          return mm.field_c;
        }
        if (!wd.field_j.loadIndex((byte) 127)) {
          return ProgressDialog.waitingForGraphicsText;
        }
        if (!wd.field_j.tryLoadNamedGroup("commonui", 100)) {
          return LegacyOpenGlTurbulentTextureEffect.loadingGraphicsText + " - " + wd.field_j.namedGroupLoadPercent("commonui", (byte) 33) + "%";
        }
        if (param0 <= 90) {
          dn.b(-125);
        }
        if (!LegacyOpenGlPostProcessManager.field_f.loadIndex((byte) 127)) {
          return ToolkitRasterBuffer.waitingForFontsText;
        }
        if (!LegacyOpenGlPostProcessManager.field_f.tryLoadNamedGroup("commonui", 100)) {
          return ow.loadingFontsText + " - " + LegacyOpenGlPostProcessManager.field_f.namedGroupLoadPercent("commonui", (byte) 33) + "%";
        }
        if (!hw.field_a.loadIndex((byte) 127)) {
          return StatefulWidgetRenderer.waitingForExtraDataText;
        }
        if (!hw.field_a.tryLoadAllGroups(true)) {
          return rd.loadingExtraDataText + " - " + hw.field_a.loadPercent(0) + "%";
        }
        return mm.pleaseWaitText;
    }

    static {
        arcadeGameText = "arcade game";
        applyText = "Apply";
    }
}
