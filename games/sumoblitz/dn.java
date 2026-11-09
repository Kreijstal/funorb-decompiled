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
          return AccountRequestState.field_c;
        }
        if (!EmailCredentials.field_j.loadIndex((byte) 127)) {
          return ProgressDialog.waitingForGraphicsText;
        }
        if (!EmailCredentials.field_j.tryLoadNamedGroup("commonui", 100)) {
          return LegacyOpenGlTurbulentTextureEffect.loadingGraphicsText + " - " + EmailCredentials.field_j.namedGroupLoadPercent("commonui", (byte) 33) + "%";
        }
        if (param0 <= 90) {
          dn.b(-125);
        }
        if (!LegacyOpenGlPostProcessManager.field_f.loadIndex((byte) 127)) {
          return ToolkitRasterBuffer.waitingForFontsText;
        }
        if (!LegacyOpenGlPostProcessManager.field_f.tryLoadNamedGroup("commonui", 100)) {
          return HuffmanDecoder.loadingFontsText + " - " + LegacyOpenGlPostProcessManager.field_f.namedGroupLoadPercent("commonui", (byte) 33) + "%";
        }
        if (!hw.field_a.loadIndex((byte) 127)) {
          return StatefulWidgetRenderer.waitingForExtraDataText;
        }
        if (!hw.field_a.tryLoadAllGroups(true)) {
          return ReflectionCheck.loadingExtraDataText + " - " + hw.field_a.loadPercent(0) + "%";
        }
        return AccountRequestState.pleaseWaitText;
    }

    static {
        arcadeGameText = "arcade game";
        applyText = "Apply";
    }
}
