/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bd extends IOException {
    static int field_a;
    static ck field_c;
    static String field_b;

    final static void drawScorePopups(int param0) {
        ScorePopup popup = null;
        String chainAndPointsText = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = Geoblox.clientControlFlowFlag;
        try {
          SingleChildWidget.mainRasterBuffer.setAsRasterTarget(255);
          popup = (ScorePopup) ((Object) md.activeScorePopups.firstForIteration(0));
          if (param0 > -112) {
            return;
          }
          while (popup != null) {
            if (popup.chainMultiplier != 1) {
              chainAndPointsText = "X" + popup.chainMultiplier + " - " + popup.pointsText;
              var3 = FadingDialog.uiPaletteFont.colorPalettes[0][wf.field_p];
              FadingDialog.uiPaletteFont.colorPalettes[0][wf.field_p] = 15488514;
              FadingDialog.uiPaletteFont.drawCenteredText(chainAndPointsText, (int)(popup.progress * ((float)(80 + UiWidget.gameplaySession.pointsPanelX) - popup.originX) + popup.originX), (int)(popup.progress * (34.0f - popup.originY) + popup.originY), 0, -1);
              FadingDialog.uiPaletteFont.colorPalettes[0][wf.field_p] = var3;
            } else {
              FadingDialog.uiPaletteFont.drawCenteredText(popup.pointsText, (int)(popup.progress * (-popup.originX + 144.0f) + popup.originX), (int)((-popup.originY + 34.0f) * popup.progress + popup.originY), 0, -1);
            }
            popup = (ScorePopup) ((Object) md.activeScorePopups.nextForIteration(1));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var1_ref), "bd.B(" + param0 + ')');
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_c = null;
        if (param0 == -20152) {
            return;
        }
        field_a = 79;
    }

    bd(String param0) {
        super(param0);
    }

    static {
        field_c = new ck(13, 0, 1, 0);
        field_b = "Click 'Discard Results' to lose all progress, Achievements and your score.";
    }
}
