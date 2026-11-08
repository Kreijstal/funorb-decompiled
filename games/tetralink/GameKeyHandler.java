/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameKeyHandler implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static boolean field_b;
    static String field_f;
    static LobbyGame field_a;
    static int field_d;
    static String field_e;
    static UiComponent field_c;
    static int field_g;

    final static void writeLoginHandshake(int param0, int param1, int param2, int param3) {
        AnimationSequence.field_j.position = 0;
        AnimationSequence.field_j.writeByte(12, false);
        AnimationSequence.field_j.writeInt(SocketConnector.field_i.nextInt(), (byte) -124);
        AnimationSequence.field_j.writeInt(SocketConnector.field_i.nextInt(), (byte) -124);
        AnimationSequence.field_j.writeByte(param3, false);
        AnimationSequence.field_j.writeByte(param0, false);
        AnimationSequence.field_j.writeShort(param2, false);
        AnimationSequence.field_j.encryptRsa(AccountCreationResultHelpers.field_c, RsaKeyAndTextGlobals.field_c, -25035);
        QuickChatHelpDialog.field_Lb.writeCipheredByte(18, (byte) -92);
        int fieldTemp$0 = QuickChatHelpDialog.field_Lb.position + 1;
        QuickChatHelpDialog.field_Lb.position = QuickChatHelpDialog.field_Lb.position + 1;
        int var4 = fieldTemp$0;
        QuickChatHelpDialog.field_Lb.writeBytes(param1, param1 + 128, AnimationSequence.field_j.payload, AnimationSequence.field_j.position);
        QuickChatHelpDialog.field_Lb.backpatchByteLength(-var4 + QuickChatHelpDialog.field_Lb.position, -2);
    }

    public static void releaseStatics(byte param0) {
        field_f = null;
        field_e = null;
        field_c = null;
        int var1 = -12 % ((0 - param0) / 63);
        field_a = null;
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (LoadingStatusHelpers.field_a == null) {
            return;
          }
          GameRoomPanelHelpers.field_b = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("qe.focusLost(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void sendLongCommand(int param0, int param1, long param2) {
        BitPacketBuffer var4 = QuickChatHelpDialog.field_Lb;
        var4.writeCipheredByte(param1, (byte) -92);
        var4.position = var4.position + 1;
        int var5 = var4.position;
        int var6 = 16 % ((param0 + 59) / 54);
        var4.writeByte(7, false);
        var4.writeLong(-1, param2);
        var4.backpatchByteLength(var4.position - var5, -2);
    }

    final static void initializeWidgetRoot(int param0) {
        LruTextureCache.field_q = GameBoard.getDefaultTheme(param0 ^ param0);
        InsetTextPainter.field_s = new WidgetContainer();
        ByteStorage.showLoginPanelWithOptions((byte) -96, true, true);
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var3Lifetime1;
        try {
          if (LoadingStatusHelpers.field_a != null) {
            WidgetTheme.field_c = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              PasswordFieldPainter.field_y.length > var2_int) {
              var2_int = PasswordFieldPainter.field_y[var2_int];
              if ((128 & var2_int) != 0) {
                var2_int = -1;
              }
            } else {
              var2_int = -1;
            }
            if (GameRoomPanelHelpers.field_b >= 0 &&
              var2_int >= 0) {
              Archive.field_g[GameRoomPanelHelpers.field_b] = var2_int;
              GameRoomPanelHelpers.field_b = GameRoomPanelHelpers.field_b + 1 & 127;
              if (MenuThemeHelpers.field_d == GameRoomPanelHelpers.field_b) {
                GameRoomPanelHelpers.field_b = -1;
              }
            }
            if (var2_int >= 0) {
              var3 = 127 & QueuedStatSubmission.field_n + 1;
              if (var3 != LruTextureCache.field_m) {
                JoinStatusTextHelpers.field_e[QueuedStatSubmission.field_n] = var2_int;
                ConfirmPasswordTextGlobals.field_c[QueuedStatSubmission.field_n] = (char)0;
                QueuedStatSubmission.field_n = var3;
              }
            }
            var3Lifetime1 = param0.getModifiers();
            if (0 != (10 & var3Lifetime1)) {
              param0.consume();
              return;
            }
            if (var2_int == 85) {
              param0.consume();
              return;
            }
            if (10 == var2_int) {
              param0.consume();
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("qe.keyPressed(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (LoadingStatusHelpers.field_a != null) {
            WidgetTheme.field_c = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              PasswordFieldPainter.field_y.length > var2_int) {
              var2_int = -129 & PasswordFieldPainter.field_y[var2_int];
            } else {
              var2_int = -1;
            }
            if (0 <= GameRoomPanelHelpers.field_b &&
              var2_int >= 0) {
              Archive.field_g[GameRoomPanelHelpers.field_b] = ~var2_int;
              GameRoomPanelHelpers.field_b = 127 & GameRoomPanelHelpers.field_b + 1;
              if (MenuThemeHelpers.field_d == GameRoomPanelHelpers.field_b) {
                GameRoomPanelHelpers.field_b = -1;
              }
            }
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("qe.keyReleased(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
          if (null != LoadingStatusHelpers.field_a) {
            var2_int = param0.getKeyChar();
            if (var2_int != 0 && var2_int != 65535 &&
              QuickChatMenu.isRepresentableTextCharacter(128, (char) var2_int)) {
              var3 = 127 & 1 + QueuedStatSubmission.field_n;
              if (LruTextureCache.field_m != var3) {
                JoinStatusTextHelpers.field_e[QueuedStatSubmission.field_n] = -1;
                ConfirmPasswordTextGlobals.field_c[QueuedStatSubmission.field_n] = (char)var2_int;
                QueuedStatSubmission.field_n = var3;
              }
            }
          }
          param0.consume();
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "qe.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    static {
        field_f = "This game option has not yet been unlocked for use.";
        field_e = "<%0>'s game";
    }
}
