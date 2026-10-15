/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LobbyGame extends UiComponent {
    boolean directJoinEnabled;
    int removalStatus;
    static String field_rc;
    boolean directJoinAvailable;
    int playerCount;
    static int field_oc;
    int concludedDurationMillis;
    UiComponent field_Vb;
    static String field_Xb;
    UiComponent field_sc;
    byte[] settings;
    boolean joinRequestPending;
    UiComponent field_tc;
    int protocolWord16;
    static String field_pc;
    UiComponent field_nc;
    UiComponent field_lc;
    long activityTimeMillis;
    boolean rated;
    UiComponent field_Bc;
    UiComponent field_zc;
    String[] playerNames;
    UiComponent field_ic;
    boolean protocolFlag8;
    UiComponent[] field_Ec;
    UiComponent field_Cc;
    UiComponent field_Ac;
    int statusChangeTick;
    String displayName;
    UiComponent field_Ub;
    boolean invitationPending;
    int joinSortPriority;
    UiComponent field_mc;
    static RgbSprite spaceNearSprite;
    static int textChoiceSelectedButtonTextColor;
    UiComponent field_gc;
    UiComponent field_ec;
    UiComponent field_Yb;
    int spectatorMode;
    long protocolId64;
    int maxPlayers;
    boolean started;
    UiComponent field_Sb;

    final boolean isUnindexed(int obfuscationGuard) {
        int var2 = -35 / ((74 - obfuscationGuard) / 32);
        return !this.isSecondaryLinked(2) ? true : false;
    }

    final boolean comesBeforeGame(LobbyGame other, boolean obfuscationGuard) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        boolean stackIn_22_0 = false;
        boolean stackIn_29_0 = false;
        int stackIn_33_0 = 0;
        boolean stackIn_37_0 = false;
        boolean stackIn_42_0 = false;
        int stackIn_49_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_61_0 = 0;
        boolean stackIn_65_0 = false;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        RuntimeException decompiledCaughtException = null;
        int thisInvitationPriority = 0;
        RuntimeException failure = null;
        int otherInvitationPriority = 0;
        int thisStartedPriority = 0;
        int otherStartedPriority = 0;
        try {
          if (!this.invitationPending) {
            stackIn_6_0 = (6 == this.removalStatus) ? 1 : 0;
          } else {
            stackIn_6_0 = 1;
          }
          thisInvitationPriority = stackIn_6_0;
          if (!other.invitationPending) {
            stackIn_12_0 = (other.removalStatus == 6) ? 1 : 0;
          } else {
            stackIn_12_0 = 1;
          }
          otherInvitationPriority = stackIn_12_0;
          if (!obfuscationGuard) {
            this.getGameId((byte) -123);
          }
          if (otherInvitationPriority != thisInvitationPriority) {
            stackIn_17_0 = thisInvitationPriority;
            return stackIn_17_0 != 0;
          }
          if (thisInvitationPriority == 0) {
            if (other.directJoinAvailable != this.directJoinAvailable) {
              stackIn_22_0 = this.directJoinAvailable;
              return stackIn_22_0;
            }
            if (this.directJoinAvailable &&
              other.joinSortPriority != this.joinSortPriority) {
              stackIn_29_0 = !(other.joinSortPriority <= this.joinSortPriority);
              return stackIn_29_0;
            }
          }
          stackIn_33_0 = (this.started) ? 0 : 1;
          if (stackIn_33_0 == (other.started ? 1 : 0)) {
            stackIn_37_0 = !(this.started);
            return stackIn_37_0;
          }
          if (!this.started) {
            stackIn_42_0 = !(other.activityTimeMillis <= this.activityTimeMillis);
            return stackIn_42_0;
          }
          if (this.protocolFlag8) {
            stackIn_49_0 = 1;
          } else {
            stackIn_49_0 = (this.spectatorMode == 2) ? 1 : 0;
          }
          thisStartedPriority = stackIn_49_0;
          if (!other.protocolFlag8) {
            stackIn_55_0 = (2 == other.spectatorMode) ? 1 : 0;
          } else {
            stackIn_55_0 = 1;
          }
          otherStartedPriority = stackIn_55_0;
          stackIn_57_0 = thisStartedPriority;
          if (otherStartedPriority != 0) {
            stackIn_58_1 = 0;
          } else {
            stackIn_58_1 = 1;
          }
          if (stackIn_57_0 == stackIn_58_1) {
            stackIn_61_0 = thisStartedPriority;
            return stackIn_61_0 != 0;
          }
          stackIn_65_0 = !(this.activityTimeMillis <= other.activityTimeMillis);
          return stackIn_65_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          failure = decompiledCaughtException;
          stackIn_68_0 = failure;
          stackIn_68_1 = new StringBuilder().append("om.B(");
          if (other == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void drawMultiplayerBoardHud(boolean resultWordMode, byte obfuscationGuard, int x, boolean showCountdown, PlayerBoard board, int y, int playerId, boolean showMessages, MultiplayerMatch match) {
        int maskedValue = 0;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String boardSummary = null;
        StringBuilder matchContextBuilder = null;
        String matchSummary = null;
        RuntimeException caughtFailure = null;
        int isPlayerMasked = 0;
        RuntimeException failure = null;
        int countdownIndex = 0;
        RgbSprite characterSpriteAlias = null;
        int countdownAge = 0;
        RgbSprite[] leverSprites = null;
        int countdownWidth = 0;
        RgbSprite leverSprite = null;
        int countdownHeight = 0;
        String truncatedPlayerName = null;
        int countdownFadeAge = 0;
        Object unusedMessageSlot = null;
        String statusText = null;
        String nameAndStatusText = null;
        int messageWidth = 0;
        RgbSprite countdownSprite = null;
        RgbSprite characterSprite = null;
        int statusTop;
        try {
          maskedValue = ((1 << playerId & (match.playerMaskTwo | match.playerMaskOne | match.playerMaskThree)) == 0) ? 0 : 1;
          isPlayerMasked = maskedValue;
          if (isPlayerMasked == 0 &&
            showCountdown &&
            board.simulationTick < 150) {
            countdownIndex = board.simulationTick / 50;
            countdownSprite = ed.countdownSprites[countdownIndex];
            countdownAge = board.simulationTick - 50 * countdownIndex;
            countdownWidth = (50 + countdownAge * 2) * countdownSprite.canvasWidth / 50;
            countdownHeight = countdownSprite.canvasHeight * (50 + countdownAge * 3) / 50;
            countdownFadeAge = countdownAge;
            if (4 * countdownAge < 150) {
              countdownFadeAge = countdownAge / 2;
            }
            countdownSprite.b(x + (306 - countdownWidth) / 2, 300 + y - (countdownHeight / 2 + board.simulationTick / 5), countdownWidth, countdownHeight, (12800 - 256 * countdownFadeAge) / 50);
          }
          x -= 7;
          y -= 7;
          statusTop = 445 + y;
          Rasterizer2D.fillRectangleAlpha(7 + x, statusTop, 306, 28, 0, 96);
          LobbyUiHelpers.paintNineSliceFrame(322, 482, -40, x - 1, LoginCredentialKind.field_h, y - 1);
          LobbyUiHelpers.paintNineSliceFrame(322, 44, -40, x - 1, LoginCredentialKind.field_h, -7 + statusTop - 1);
          x += 7;
          PowerUpWarning.drawPowerUpMeterRow(5 + x, board, match, -34, 4 + statusTop);
          x += 306;
          characterSprite = ProxyAuthenticationRequiredException.smallCharacterSprites[board.characterIndex];
          characterSpriteAlias = characterSprite;
          characterSpriteAlias.drawTransparent(-characterSprite.canvasWidth + x + 5, 480 - characterSprite.canvasHeight);
          if (board.characterIndex != 2) {
            if (board.characterIndex != 5) {
              leverSprites = GameOverlayHelpers.smallLeverSprites;
            } else {
              leverSprites = AccountMessageDialog.spaceSmallLeverSprites;
            }
          } else {
            leverSprites = ScorePopup.chocolateSmallLeverSprites;
          }
          leverSprite = leverSprites[QuickChatHelpDialog.getLeverFrameIndex(match, playerId, 87, board)];
          leverSprite.drawTransparent(-8 + x - (characterSprite.canvasWidth + leverSprite.canvasWidth) / 2, -leverSprite.canvasHeight + 480 + 10);
          if (obfuscationGuard != -103) {
            textChoiceSelectedButtonTextColor = 38;
          }
          truncatedPlayerName = TextFont.truncateText(ce.field_e, match.playerNames[playerId], 73);
          unusedMessageSlot = null;
          if (!showMessages ||
            isPlayerMasked != 0 ||
            board.displayedMessage == null) {
            if (resultWordMode &&
              isPlayerMasked != 0) {
              if (board.resultWord < 0) {
                statusText = Integer.toString(board.resultWord);
              } else {
                statusText = GamePresentationHelpers.formatIndexedText(hh.positiveBoardResultFormat, new String[]{Integer.toString(board.resultWord)}, (byte) 103);
              }
            } else {
              if (!match.configuration.repeats) {
                statusText = GamePresentationHelpers.formatIndexedText(FontRequestHelpers.field_e, new String[]{Integer.toString(pp.a(board, (byte) 66, match) + 1), Integer.toString(match.configuration.getPeriod(-103))}, (byte) 103);
              } else {
                statusText = GamePresentationHelpers.formatIndexedText(MouseInput.field_a, new String[]{Integer.toString(1 + pp.a(board, (byte) 97, match))}, (byte) 103);
              }
            }
            nameAndStatusText = GamePresentationHelpers.formatIndexedText(BrickABrac.field_H, new String[]{truncatedPlayerName, statusText}, (byte) 103);
            ce.field_e.drawRight(nameAndStatusText, -characterSprite.canvasWidth + (x - 9), ce.field_e.ascent + statusTop, 2, -1);
          }
          if (showMessages &&
            isPlayerMasked == 0) {
            if (board.displayedMessage == null) {
              return;
            }
            messageWidth = ContextActionController.field_g.measureText(board.displayedMessage) + 20;
            LobbyUiHelpers.paintNineSliceFrame(messageWidth, 24, obfuscationGuard + 63, x + (-characterSprite.canvasWidth + (-9 - messageWidth)), MultiValueSliderWidget.field_K, 2 + statusTop);
            AlignedIconLabel.field_Sb.drawTransparent(x - characterSprite.canvasWidth - 13, 6 + statusTop);
            PasswordFieldRenderer.field_D.drawCentered(board.displayedMessage, -(messageWidth / 2) + x + (-characterSprite.canvasWidth - 9), 6 + (statusTop + PasswordFieldRenderer.field_D.ascent), 6, -1);
          }
          return;
        } catch (java.lang.RuntimeException caughtException) {
          caughtFailure = caughtException;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("om.D(").append(resultWordMode).append(',').append(obfuscationGuard).append(',').append(x).append(',').append(showCountdown).append(',');
          if (board == null) {
            boardSummary = "null";
          } else {
            boardSummary = "{...}";
          }
          matchContextBuilder = ((StringBuilder) (Object) contextBuilder).append(boardSummary).append(',').append(y).append(',').append(playerId).append(',').append(showMessages).append(',');
          if (match == null) {
            matchSummary = "null";
          } else {
            matchSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) matchContextBuilder).append(matchSummary).append(')').toString());
        }
    }

    public static void d(byte param0) {
        field_rc = null;
        field_Xb = null;
        if (param0 != -32) {
          MultiplayerMatch var2 = (MultiplayerMatch) null;
          LobbyGame.drawMultiplayerBoardHud(true, -24, 25, true, (PlayerBoard) null, 48, -120, false, (MultiplayerMatch) null);
        }
        spaceNearSprite = null;
        field_pc = null;
    }

    final int getGameId(byte obfuscationGuard) {
        int var2 = -51 % ((obfuscationGuard - 66) / 35);
        return (int)this.getSecondaryKey(-19451);
    }

    LobbyGame(int settingCount) {
        super(0L, (UiComponent) null);
        this.settings = new byte[settingCount];
    }

    static {
        field_Xb = "Invalid name";
        field_rc = "To report a player, click on the most suitable option from the Rules of Conduct. Please do not abuse this form.";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void drawMultiplayerBoardHud(boolean resultWordMode, int obfuscationGuard, int x, boolean showCountdown, PlayerBoard board, int y, int playerId, boolean showMessages, MultiplayerMatch match) {
        int maskedValue = 0;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String boardSummary = null;
        StringBuilder matchContextBuilder = null;
        String matchSummary = null;
        RuntimeException caughtFailure = null;
        int isPlayerMasked = 0;
        RuntimeException failure = null;
        int countdownIndex = 0;
        RgbSprite characterSpriteAlias = null;
        int countdownAge = 0;
        RgbSprite[] leverSprites = null;
        int countdownWidth = 0;
        RgbSprite leverSprite = null;
        int countdownHeight = 0;
        String truncatedPlayerName = null;
        int countdownFadeAge = 0;
        Object unusedMessageSlot = null;
        String statusText = null;
        String nameAndStatusText = null;
        int messageWidth = 0;
        RgbSprite countdownSprite = null;
        RgbSprite characterSprite = null;
        int statusTop;
        try {
          maskedValue = ((1 << playerId & (match.playerMaskTwo | match.playerMaskOne | match.playerMaskThree)) == 0) ? 0 : 1;
          isPlayerMasked = maskedValue;
          if (isPlayerMasked == 0 &&
            showCountdown &&
            board.simulationTick < 150) {
            countdownIndex = board.simulationTick / 50;
            countdownSprite = ed.countdownSprites[countdownIndex];
            countdownAge = board.simulationTick - 50 * countdownIndex;
            countdownWidth = (50 + countdownAge * 2) * countdownSprite.canvasWidth / 50;
            countdownHeight = countdownSprite.canvasHeight * (50 + countdownAge * 3) / 50;
            countdownFadeAge = countdownAge;
            if (4 * countdownAge < 150) {
              countdownFadeAge = countdownAge / 2;
            }
            countdownSprite.b(x + (306 - countdownWidth) / 2, 300 + y - (countdownHeight / 2 + board.simulationTick / 5), countdownWidth, countdownHeight, (12800 - 256 * countdownFadeAge) / 50);
          }
          x -= 7;
          y -= 7;
          statusTop = 445 + y;
          Rasterizer2D.fillRectangleAlpha(7 + x, statusTop, 306, 28, 0, 96);
          LobbyUiHelpers.paintNineSliceFrame(322, 482, -40, x - 1, LoginCredentialKind.field_h, y - 1);
          LobbyUiHelpers.paintNineSliceFrame(322, 44, -40, x - 1, LoginCredentialKind.field_h, -7 + statusTop - 1);
          x += 7;
          PowerUpWarning.drawPowerUpMeterRow(5 + x, board, match, -34, 4 + statusTop);
          x += 306;
          characterSprite = ProxyAuthenticationRequiredException.smallCharacterSprites[board.characterIndex];
          characterSpriteAlias = characterSprite;
          characterSpriteAlias.drawTransparent(-characterSprite.canvasWidth + x + 5, 480 - characterSprite.canvasHeight);
          if (board.characterIndex != 2) {
            if (board.characterIndex != 5) {
              leverSprites = GameOverlayHelpers.smallLeverSprites;
            } else {
              leverSprites = AccountMessageDialog.spaceSmallLeverSprites;
            }
          } else {
            leverSprites = ScorePopup.chocolateSmallLeverSprites;
          }
          leverSprite = leverSprites[QuickChatHelpDialog.getLeverFrameIndex(match, playerId, 87, board)];
          leverSprite.drawTransparent(-8 + x - (characterSprite.canvasWidth + leverSprite.canvasWidth) / 2, -leverSprite.canvasHeight + 480 + 10);
          if (obfuscationGuard != -103) {
            textChoiceSelectedButtonTextColor = 38;
          }
          truncatedPlayerName = TextFont.truncateText(ce.field_e, match.playerNames[playerId], 73);
          unusedMessageSlot = null;
          if (!showMessages ||
            isPlayerMasked != 0 ||
            board.displayedMessage == null) {
            if (resultWordMode &&
              isPlayerMasked != 0) {
              if (board.resultWord < 0) {
                statusText = Integer.toString(board.resultWord);
              } else {
                statusText = GamePresentationHelpers.formatIndexedText(hh.positiveBoardResultFormat, new String[]{Integer.toString(board.resultWord)}, (byte) 103);
              }
            } else {
              if (!match.configuration.repeats) {
                statusText = GamePresentationHelpers.formatIndexedText(FontRequestHelpers.field_e, new String[]{Integer.toString(pp.a(board, (byte) 66, match) + 1), Integer.toString(match.configuration.getPeriod(-103))}, (byte) 103);
              } else {
                statusText = GamePresentationHelpers.formatIndexedText(MouseInput.field_a, new String[]{Integer.toString(1 + pp.a(board, (byte) 97, match))}, (byte) 103);
              }
            }
            nameAndStatusText = GamePresentationHelpers.formatIndexedText(BrickABrac.field_H, new String[]{truncatedPlayerName, statusText}, (byte) 103);
            ce.field_e.drawRight(nameAndStatusText, -characterSprite.canvasWidth + (x - 9), ce.field_e.ascent + statusTop, 2, -1);
          }
          if (showMessages &&
            isPlayerMasked == 0) {
            if (board.displayedMessage == null) {
              return;
            }
            messageWidth = ContextActionController.field_g.measureText(board.displayedMessage) + 20;
            LobbyUiHelpers.paintNineSliceFrame(messageWidth, 24, obfuscationGuard + 63, x + (-characterSprite.canvasWidth + (-9 - messageWidth)), MultiValueSliderWidget.field_K, 2 + statusTop);
            AlignedIconLabel.field_Sb.drawTransparent(x - characterSprite.canvasWidth - 13, 6 + statusTop);
            PasswordFieldRenderer.field_D.drawCentered(board.displayedMessage, -(messageWidth / 2) + x + (-characterSprite.canvasWidth - 9), 6 + (statusTop + PasswordFieldRenderer.field_D.ascent), 6, -1);
          }
          return;
        } catch (java.lang.RuntimeException caughtException) {
          caughtFailure = caughtException;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("om.D(").append(resultWordMode).append(',').append(obfuscationGuard).append(',').append(x).append(',').append(showCountdown).append(',');
          if (board == null) {
            boardSummary = "null";
          } else {
            boardSummary = "{...}";
          }
          matchContextBuilder = ((StringBuilder) (Object) contextBuilder).append(boardSummary).append(',').append(y).append(',').append(playerId).append(',').append(showMessages).append(',');
          if (match == null) {
            matchSummary = "null";
          } else {
            matchSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) matchContextBuilder).append(matchSummary).append(')').toString());
        }
    }
}
