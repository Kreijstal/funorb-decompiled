/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TooltipAndOptionsHelpers {
    static float field_c;
    static String playernameHotseat2;
    static String[] field_f;
    static BinaryBitmapFont chatFont;
    static PcmStreamMixer field_a;
    static String[] instructionPages;

    public static void releaseStatics(int param0) {
        field_f = null;
        if (param0 < -78) {
          instructionPages = null;
          field_a = null;
          playernameHotseat2 = null;
          chatFont = null;
          return;
        }
        TooltipAndOptionsHelpers.sendGameOptions((byte) -63, 112);
        instructionPages = null;
        field_a = null;
        playernameHotseat2 = null;
        chatFont = null;
    }

    final static void sendGameOptions(byte param0, int param1) {
        CipherPacketBuffer var2 = IterableNodeHashTable.field_g;
        var2.writeCipheredOpcode(param1, 8);
        var2.position = var2.position + 1;
        int var3 = var2.position;
        var2.writeByte(2, -124);
        var2.writeBytes(FadeLayer.field_E, FadeLayer.field_E.length, 0, (byte) -121);
        var2.writeByte(QuickChatHelpHelpers.field_e, -111);
        var2.writeByte(ArchiveLoadSequence.field_c, 77);
        if (param0 == -55) {
          var2.writeBytes(MouseTrailPoint.field_p, MouseTrailPoint.field_p.length, 0, (byte) -105);
          var2.backpatchByteLength(var2.position - var3, -1);
          return;
        }
        instructionPages = (String[]) null;
        var2.writeBytes(MouseTrailPoint.field_p, MouseTrailPoint.field_p.length, 0, (byte) -105);
        var2.backpatchByteLength(var2.position - var3, -1);
    }

    final static void clearFaceDepthBuckets(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          var5 = ProxySocketConnector.field_o;
          var1 = var5;
          var2 = param0;
          var3 = var5.length;
          while (var2 < var3) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var1_ref), "em.B(" + param0 + ')');
        }
    }

    final static BinaryBitmapFont loadFont(int param0, int param1, Js5Archive param2, boolean param3, Js5Archive param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        BinaryBitmapFont stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!PendingHighscoreRequest.decodeSpriteSheetFromArchive(param2, param0, param1, (byte) 109)) {
            stackIn_2_0 = null;
            return (BinaryBitmapFont) (stackIn_2_0);
          }
          if (param3) {
            TooltipAndOptionsHelpers.clearFaceDepthBuckets(20);
          }
          stackIn_6_0 = MouseTrailPoint.createBitmapFont(-9618, param4.getFile(param0, param1, 0));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("em.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void updateTooltip(boolean param0, String param1) {
        int stackIn_16_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = Virogrid.field_F ? 1 : 0;
        try {
          EditableTextWidget.field_F = EditableTextWidget.field_F + 1;
          if (-1 == ConditionalTextValue.field_c &&
            LoadingTextGlobals.field_d == -1) {
            ConditionalTextValue.field_c = StatefulWidgetPainter.field_u;
            LoadingTextGlobals.field_d = IconTextComponent.field_Jb;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param1 != null) {
            decompiledFrameRemainder0 = !(param1.equals(NetworkGameClient.field_l));
          } else {
            decompiledFrameRemainder0 = (NetworkGameClient.field_l == null);
          }
          if (decompiledFrameRemainder0) {
            if (!MusicPlaybackHelpers.field_a) {
              if (EditableTextWidget.field_F >= ChecksumHelpers.field_a) {
                stackIn_16_0 = (EditableTextWidget.field_F < ArchiveRequest.field_y + ChecksumHelpers.field_a) ? 1 : 0;
              } else {
                stackIn_16_0 = 0;
              }
            } else {
              stackIn_16_0 = 0;
            }
            var2_int = stackIn_16_0;
            if (param1 == null) {
              EditableTextWidget.field_F = 0;
            } else {
              if (MusicPlaybackHelpers.field_a) {
                EditableTextWidget.field_F = ChecksumHelpers.field_a;
              } else {
                if (var2_int != 0) {
                  EditableTextWidget.field_F = ChecksumHelpers.field_a;
                } else {
                  EditableTextWidget.field_F = 0;
                }
              }
            }
            AccountDialogHelpers.field_b = LoadingTextGlobals.field_d;
            PopupInputHelpers.field_a = ConditionalTextValue.field_c;
            if (param1 == null) {
              if (var2_int != 0) {
                MusicPlaybackHelpers.field_a = true;
              }
            } else {
              MusicPlaybackHelpers.field_a = false;
            }
          }
          NetworkGameClient.field_l = param1;
          if (!MusicPlaybackHelpers.field_a &&
            ChecksumHelpers.field_a > EditableTextWidget.field_F &&
            ValidationIndicator.field_J) {
            PopupInputHelpers.field_a = ConditionalTextValue.field_c;
            EditableTextWidget.field_F = 0;
            AccountDialogHelpers.field_b = LoadingTextGlobals.field_d;
          }
          ConditionalTextValue.field_c = -1;
          if (!param0) {
            instructionPages = (String[]) null;
          }
          LoadingTextGlobals.field_d = -1;
          if (MusicPlaybackHelpers.field_a) {
            if (EditableTextWidget.field_F != UsernameSuggestionPanel.field_E) {
              return;
            }
            MusicPlaybackHelpers.field_a = false;
            EditableTextWidget.field_F = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_42_0 = var2;
          stackIn_42_1 = new StringBuilder().append("em.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(')').toString());
        }
    }

    static {
        field_f = new String[]{"All scores", "My scores", "Best each"};
        playernameHotseat2 = "White";
        instructionPages = new String[]{"Dominate the grid to achieve victory!<br><br>Players take turns to select a piece and either clone it into an adjacent space, or jump it two spaces.<br><br>If a piece is cloned or jumped into a space that is next to one or more opposing pieces, it will automatically capture those pieces.<br><br>If the grid is filled before either player wipes out the other, the player with the most pieces on the grid wins.", "Each player has a limited amount of time to perform their move. If the timer ever reaches zero, a move is played for them by the easy AI. After three strikes in an online game, that player forfeits the game.<br><br>To rotate the board in game, use the arrow keys or the control panel at the lower-right-hand corner of the screen, or hold down the right mouse button while moving the mouse.<br><br>The circle button in the control panel will restore the default view.<br><br>You can zoom the camera in and out with the mouse wheel or with the up and down arrow keys."};
    }
}
