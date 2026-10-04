/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ProxyAuthenticationRequiredException extends IOException {
    static int rankedKeyTwoUpperBoundSeed;
    static TextTemplateArgumentType textTemplateArgumentTypeThirteen;
    static String discardResultsWarningText;

    final static void drawScorePopups(int methodGuard) {
        ScorePopup popup = null;
        String chainAndPointsText = null;
        int savedAccentPaletteColor = 0;
        int clientControlSnapshot = 0;
        RuntimeException caughtPopupDrawFailure = null;
        RuntimeException popupDrawFailureForContext = null;
        clientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          SingleChildWidget.mainRasterBuffer.setAsRasterTarget(255);
          popup = (ScorePopup) ((Object) GmtTimestampSupport.activeScorePopups.firstForIteration(0));
          if (methodGuard > -112) {
            return;
          }
          while (popup != null) {
            if (popup.chainMultiplier != 1) {
              chainAndPointsText = "X" + popup.chainMultiplier + " - " + popup.pointsText;
              savedAccentPaletteColor = FadingDialog.uiPaletteFont.colorPalettes[0][SessionGameApplet.uiAccentPaletteIndex];
              FadingDialog.uiPaletteFont.colorPalettes[0][SessionGameApplet.uiAccentPaletteIndex] = 15488514;
              FadingDialog.uiPaletteFont.drawCenteredText(chainAndPointsText, (int)(popup.progress * ((float)(80 + UiWidget.gameplaySession.pointsPanelX) - popup.originX) + popup.originX), (int)(popup.progress * (34.0f - popup.originY) + popup.originY), 0, -1);
              FadingDialog.uiPaletteFont.colorPalettes[0][SessionGameApplet.uiAccentPaletteIndex] = savedAccentPaletteColor;
            } else {
              FadingDialog.uiPaletteFont.drawCenteredText(popup.pointsText, (int)(popup.progress * (-popup.originX + 144.0f) + popup.originX), (int)((-popup.originY + 34.0f) * popup.progress + popup.originY), 0, -1);
            }
            popup = (ScorePopup) ((Object) GmtTimestampSupport.activeScorePopups.nextForIteration(1));
          }
          return;
        } catch (java.lang.RuntimeException popupDrawFailure) {
          caughtPopupDrawFailure = popupDrawFailure;
          popupDrawFailureForContext = caughtPopupDrawFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) popupDrawFailureForContext), "bd.B(" + methodGuard + ')');
        }
    }

    public static void releaseProxyExceptionSharedResources(int methodGuard) {
        discardResultsWarningText = null;
        textTemplateArgumentTypeThirteen = null;
        if (methodGuard == -20152) {
            return;
        }
        rankedKeyTwoUpperBoundSeed = 79;
    }

    ProxyAuthenticationRequiredException(String authenticationScheme) {
        super(authenticationScheme);
    }

    static {
        textTemplateArgumentTypeThirteen = new TextTemplateArgumentType(13, 0, 1, 0);
        discardResultsWarningText = "Click 'Discard Results' to lose all progress, Achievements and your score.";
    }
}
