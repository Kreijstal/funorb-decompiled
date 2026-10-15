/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameOverlayHelpers {
    static int fullscreenDialogButtonPaddingX;
    static byte[][] decodedSpriteIndices;
    static RgbSprite[] smallLeverSprites;
    static int field_d;
    static String field_b;

    final static AchievementIcon acquireAchievementIcon(int remainingOffset, int y, int width, AchievementBrowserScreen owner, int height, int transitionBitIndex, int x, int achievementId, int transitionBit) {
        AchievementIcon icon = null;
        RuntimeException var9_ref = null;
        AchievementIcon stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          icon = (AchievementIcon) (JavaRandomHelpers.achievementIconPool.removeFirst(3));
          if (icon == null) {
            icon = new AchievementIcon();
          }
          icon.y = y;
          icon.width = width;
          icon.height = height;
          icon.owner = owner;
          icon.achievementId = achievementId;
          icon.x = x;
          icon.remainingOffset = remainingOffset;
          icon.transitionKeepMask = ~(transitionBit << transitionBitIndex);
          stackIn_3_0 = icon;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9_ref = decompiledCaughtException;
          stackIn_6_0 = var9_ref;
          stackIn_6_1 = new StringBuilder().append("cn.A(").append(remainingOffset).append(',').append(y).append(',').append(width).append(',');
          if (owner == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(height).append(',').append(transitionBitIndex).append(',').append(x).append(',').append(achievementId).append(',').append(transitionBit).append(')').toString());
        }
    }

    final static void drawScorePopup(ScorePopup popup, PlayerBoard unusedBoard, int obfuscationGuard, int offsetX, int offsetY) {
        try {
          ContextActionController.field_g.drawCenteredAlpha(popup.text, (popup.x256 >> 8) + offsetX, (popup.y256 >> 8) + offsetY + ContextActionController.field_g.capHeight, 0, -1, 256 * popup.remainingTicks / 50);
          if (obfuscationGuard != 10030) {
            PlayerBoard var6 = (PlayerBoard) null;
            GameOverlayHelpers.drawScorePopup((ScorePopup) null, (PlayerBoard) null, -6, -71, 111);
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "cn.B(" + (popup != null ? "{...}" : "null") + ',' + (unusedBoard != null ? "{...}" : "null") + ',' + obfuscationGuard + ',' + offsetX + ',' + offsetY + ')');
        }
    }

    public static void a(int param0) {
        smallLeverSprites = null;
        decodedSpriteIndices = (byte[][]) null;
        field_b = null;
        if (param0 < 97) {
          PlayerBoard var2 = (PlayerBoard) null;
          GameOverlayHelpers.drawScorePopup((ScorePopup) null, (PlayerBoard) null, 41, -50, 10);
        }
    }

    static {
        field_b = "Auto-respond to <%0>";
    }
}
