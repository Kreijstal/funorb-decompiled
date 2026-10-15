/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextChoiceDialogHitTest {
    static RgbSprite[][] field_c;
    static String field_b;
    static RgbSprite[][] chocSegsSprites;

    public static void b(int param0) {
        if (param0 == -789103103) {
          field_c = (RgbSprite[][]) null;
          chocSegsSprites = (RgbSprite[][]) null;
          field_b = null;
          return;
        }
        TextChoiceDialogHitTest.hitTestTextChoiceDialog(57, -37, 115);
        field_c = (RgbSprite[][]) null;
        chocSegsSprites = (RgbSprite[][]) null;
        field_b = null;
    }

    final static ResourceArchive a(int param0, boolean param1) {
        if (param1) {
          return ResourceArchiveFactory.createResourceArchive(false, param0, false, 1, true, true);
        }
        field_b = (String) null;
        return ResourceArchiveFactory.createResourceArchive(false, param0, false, 1, true, true);
    }

    final static UiComponent a(int param0) {
        if (param0 != 1345) {
          TextChoiceDialogHitTest.b(94);
          return rl.field_e.content;
        }
        return rl.field_e.content;
    }

    final static int hitTestTextChoiceDialog(int firstLineIndex, int pointerY, int pointerX) {
        int lineIndex = 0;
        int lineTop = 0;
        int actionIndex = 0;
        int textWidth = 0;
        int textLeft = 0;
        int unusedClientFlag = 0;
        int hitAction = 0;
        int noAction = 0;
        RuntimeException caughtFailure = null;
        RuntimeException hitTestFailure = null;
        unusedClientFlag = BrickABrac.field_J ? 1 : 0;
        try {
          lineIndex = firstLineIndex;
          lineTop = ContentTransitionPhase.textChoiceTop;
          while (QuickChatCategoryDefinition.textChoiceLines.length > lineIndex) {
            actionIndex = MenuSelection.textChoiceLineActions[lineIndex];
            if (0 > actionIndex) {
              lineTop = lineTop + BufferedSocket.textChoiceBodyLineHeight;
            } else {
              textWidth = SpriteInputHelpers.measureTextChoiceLine(0, QuickChatCategoryDefinition.textChoiceLines[lineIndex], true);
              textLeft = -(textWidth >> 1) + NewAchievementsScreen.textChoiceCenterX;
              lineTop = lineTop + GameClock.textChoiceButtonGapY;
              if (ReflectionCheck.containsRectanglePoint(-FullscreenFailureDialog.textChoiceButtonPaddingX + textLeft, (GameCanvas.textChoiceButtonPaddingY << 1) + TooltipSprite.textChoiceButtonLineHeight, (FullscreenFailureDialog.textChoiceButtonPaddingX << 1) + textWidth, (byte) 80, pointerY, pointerX, lineTop)) {
                hitAction = actionIndex;
                return hitAction;
              }
              lineTop = lineTop + (GameClock.textChoiceButtonGapY + ((GameCanvas.textChoiceButtonPaddingY << 1) + TooltipSprite.textChoiceButtonLineHeight));
            }
            lineIndex++;
          }
          noAction = -1;
          return noAction;
        } catch (java.lang.RuntimeException caughtHitTestFailure) {
          caughtFailure = caughtHitTestFailure;
          hitTestFailure = caughtFailure;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) hitTestFailure), "aj.A(" + firstLineIndex + ',' + pointerY + ',' + pointerX + ')');
        }
    }

    static {
        field_b = "Asking to join <%0>'s game...";
    }
}
