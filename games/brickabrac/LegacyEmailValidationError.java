/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyEmailValidationError {
    static String[] field_c;
    static int[] keyChangeQueue;
    static int[] field_a;
    static boolean field_d;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(byte param0) {
        if (param0 < 13) {
          return;
        }
        field_c = null;
        keyChangeQueue = null;
        field_a = null;
    }

    final static void drawBoardResultWord(int boardWidth, int alpha256, int obfuscationGuard, int x, int scaleDivisor, int y, int boardHeight, PlayerBoard board) {
        Object unusedTextSlot = null;
        String resultText = null;
        RuntimeException failure = null;
        String formattedResult = null;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String boardSummary = null;
        RuntimeException caughtFailure = null;
        try {
          unusedTextSlot = null;
          if (board.resultWord != 0 &&
            1 != scaleDivisor) {
            if (board.resultWord < 0) {
              formattedResult = Integer.toString(board.resultWord);
            } else {
              formattedResult = GamePresentationHelpers.formatIndexedText(IntegerPowerHelpers.positiveBoardResultFormat, new String[]{Integer.toString(board.resultWord)}, (byte) 103);
            }
            resultText = formattedResult;
            QuickChatPopupHelpers.field_e.drawCenteredAlpha(resultText, x + boardWidth / (scaleDivisor * 2), 60 / scaleDivisor + (y + (boardHeight / (scaleDivisor * 2) + QuickChatPopupHelpers.field_e.ascent)), 2, -1, alpha256);
          }
          if (obfuscationGuard == 60) {
            return;
          }
          LegacyEmailValidationError.a((byte) 126);
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("lo.A(").append(boardWidth).append(',').append(alpha256).append(',').append(obfuscationGuard).append(',').append(x).append(',').append(scaleDivisor).append(',').append(y).append(',').append(boardHeight).append(',');
          if (board == null) {
            boardSummary = "null";
          } else {
            boardSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(boardSummary).append(')').toString());
        }
    }

    static {
        field_c = new String[]{"levels_icons"};
        field_a = new int[]{7, 38};
        keyChangeQueue = new int[128];
    }
}
