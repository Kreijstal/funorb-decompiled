/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LobbySlideHelpers {
    static int field_c;
    static int field_a;
    static String field_b;

    final static void layoutSlidingLobbyPanel(int param0) {
        int var3 = -76 % ((param0 - 21) / 44);
        int var1 = MusicPlaybackHelpers.field_c * MusicPlaybackHelpers.field_c;
        int var2 = -(HuffmanCodec.field_b * HuffmanCodec.field_b) + var1;
        int var4 = var2 * (MatchingTextValidator.field_o - SpriteBuildHelpers.field_i) / var1 + SpriteBuildHelpers.field_i;
        Cp1252DecodeHelpers.field_i.setBounds(var4, 120, TextTableInitializer.field_c, 256, 640);
        ArchiveProvider.layoutQuickChatRoot(-24 + MatchingTextValidator.field_o, (byte) 116, 640, PlayerBoard.field_q, 5, 0, MouseWheelHandler.field_c);
    }

    final static void drawChoiceIconWithHighlight(int param0, int param1, boolean param2, int param3) {
        int var4;
        AccountChoicePanel.field_O.drawTransparent(param1, param0);
        if (param3 != -40) {
          return;
        }
        if (!param2) {
          return;
        }
        var4 = RetroBlock.field_e % AccountChoicePanel.field_O.field_F * 2;
        if (AccountChoicePanel.field_O.field_F <= var4) {
          var4 = AccountChoicePanel.field_O.field_F + (-var4 + AccountChoicePanel.field_O.field_F);
        }
        if (10 > var4) {
          var4 = 10;
        } else {
          if (-40 + AccountChoicePanel.field_O.field_F < var4) {
            var4 = AccountChoicePanel.field_O.field_F - 40;
          }
        }
        ProxyAuthenticationException.drawGlowOutline(0, 80, 30, AccountChoicePanel.field_O, param1, 0, var4, param0, (byte) -113);
    }

    public static void releaseStatics(int param0) {
        if (param0 != -31558) {
          LobbySlideHelpers.releaseStatics(48);
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static void sendGameOptionSelection(int param0, int param1) {
        CipherPacketBuffer var2 = ChatMessage.field_f;
        var2.writeOpcode(param1, param0 ^ 15514);
        var2.position = var2.position + 1;
        int var3 = var2.position;
        var2.writeByte(160, 2);
        var2.writeBytes(TextButton.field_J.length, 0, -3493, TextButton.field_J);
        var2.writeByte(160, GridSize.field_a);
        var2.writeByte(160, TextFieldValidator.field_i);
        var2.writeBytes(NanoTickClock.field_k.length, param0, -3493, NanoTickClock.field_k);
        var2.backpatchByteLength(var2.position - var3, -1);
    }

    static {
        field_b = "Confirm Password: ";
    }
}
