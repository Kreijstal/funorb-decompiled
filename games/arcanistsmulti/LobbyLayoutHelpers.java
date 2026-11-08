/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LobbyLayoutHelpers {
    static String field_b;
    static String field_c;
    static String field_a;
    static int field_f;
    static int[] field_h;
    static int[] field_e;
    static boolean field_d;
    static int field_g;

    final static void setNameSuggestions(String[] args, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -125) {
            field_a = (String) null;
          }
          if (MusicAndClipHelpers.field_d != null) {
            MusicAndClipHelpers.field_d.field_G.setSuggestions(args, (byte) -37);
          }
          if (null == LoginResultHelpers.field_c) {
            return;
          }
          LoginResultHelpers.field_c.field_M.setSuggestions(args, (byte) -100);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("ao.B(");
          if (args == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void addChatMessage(int param0, byte param1, String param2, String param3, int param4, String param5) {
        ChatLine var6 = null;
        RuntimeException var6_ref = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new ChatLine(param4, param3, param0, param5, param2);
          TextLine.appendChatLineToHistory(var6, (byte) -74);
          if (param1 > 68) {
            return;
          }
          LobbyLayoutHelpers.releaseStatics(-83);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_5_0 = var6_ref;
          stackIn_5_1 = new StringBuilder().append("ao.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static void sleepMillis(long param0, int param1) {
        if (0L >= param0) {
          return;
        }
        if (param1 != 1) {
          field_a = (String) null;
          if (param0 % 10L != 0L) {
            TermsNoticePanel.sleep(true, param0);
            return;
          }
          TermsNoticePanel.sleep(true, -1L + param0);
          TermsNoticePanel.sleep(true, 1L);
          return;
        }
        if (param0 % 10L != 0L) {
          TermsNoticePanel.sleep(true, param0);
          return;
        }
        TermsNoticePanel.sleep(true, -1L + param0);
        TermsNoticePanel.sleep(true, 1L);
    }

    final static int getFrameCounter(boolean param0) {
        if (!param0) {
          LobbyLayoutHelpers.computeColumnX(-63, -91, 35);
          return HighscoreEntry.field_o;
        }
        return HighscoreEntry.field_o;
    }

    final static void noOperation(int param0) {
        if (param0 != 5623) {
          LobbyLayoutHelpers.releaseStatics(-55);
        }
    }

    final static void layoutLobby(byte param0) {
        int var3 = 0;
        int var3Lifetime1;
        SecondaryNodeDequeIterator.field_g = SoftwareRasterizer.field_e;
        RasterSetupHelpers.field_a = SoftwareRasterizer.field_j;
        WidgetStyleLayer.layoutCenteredPanels((byte) -128);
        GameOptionType.field_h.layoutChatColumns(0, 0, -40 + (BufferedSocket.field_d.field_I - 2), BufferedSocket.field_d.field_x, 5);
        QuickChatCategoryCache.field_c.setBounds(DraggableWidget.field_H.field_x, 0, 0, ImageProducerRasterBuffer.field_r, (byte) -120);
        int var1 = 2 + ImageProducerRasterBuffer.field_r;
        StatefulTextPainter.field_s.setBounds(DraggableWidget.field_H.field_x, 0, !SpriteDecodeHelpers.field_a ? 0 : var1, -(SpriteDecodeHelpers.field_a ? var1 : 0) + DraggableWidget.field_H.field_I, (byte) -120);
        StatusDialog.layoutTopBar((byte) 100);
        IconHighlightPainter.field_b.setBounds(BufferedSocket.field_d.field_x, 0, BufferedSocket.field_d.field_I - 40, 40, (byte) -120);
        AudioAndCookieHelpers.field_c.setBounds(GameListHelpers.field_e.field_x, 0, 0, 30, (byte) -120);
        SpellbookCaptionGlobals.field_c.setBounds(GameListHelpers.field_e.field_x, 0, 30, -30 + (-40 + (GameListHelpers.field_e.field_I - 2)), (byte) -120);
        CachedArchiveProvider.field_o.setBounds(68, 5, 5, 30, (byte) -120);
        FrameClock.field_e.setBounds(78, 75, 5, 30, (byte) -120);
        ModalStackHelpers.field_a.setBounds(48, 155, 5, 30, (byte) -120);
        AgeValidator.field_r.setBounds(48, 205, 5, 30, (byte) -120);
        int var2 = !SpriteDecodeHelpers.field_a ? 200 : 250;
        WidgetStyleLayer.field_j.setBounds(-var2 + 363, 5 + var2, 5, 30, (byte) -120);
        BitHelpers.field_a.setBounds(-10 + GameListHelpers.field_e.field_x - 365, 370, 5, 30, (byte) -120);
        DebouncedValidator.field_g.setBoundsAndLayout(37, CacheEntry.field_p, -5 + (-5 + SpellbookCaptionGlobals.field_c.field_x), false, 5, -5 + (SpellbookCaptionGlobals.field_c.field_I - 5) - 32, 2);
        if (param0 <= -111) {
          var3 = (GameListHelpers.field_e.field_x + 2) / 2;
          GradientBarPainter.field_a.setBounds(-2 + var3, 0, GameListHelpers.field_e.field_I - 40, 40, (byte) -120);
          if (!SpriteDecodeHelpers.field_a) {
            var3 = 0;
          }
          GrowableIntList.field_a.setBounds(GameListHelpers.field_e.field_x - var3, var3, GameListHelpers.field_e.field_I - 40, 40, (byte) -120);
          return;
        }
        LobbyLayoutHelpers.layoutLobby((byte) 81);
        var3Lifetime1 = (GameListHelpers.field_e.field_x + 2) / 2;
        GradientBarPainter.field_a.setBounds(-2 + var3Lifetime1, 0, GameListHelpers.field_e.field_I - 40, 40, (byte) -120);
        if (!SpriteDecodeHelpers.field_a) {
          var3Lifetime1 = 0;
        }
        GrowableIntList.field_a.setBounds(GameListHelpers.field_e.field_x - var3Lifetime1, var3Lifetime1, GameListHelpers.field_e.field_I - 40, 40, (byte) -120);
    }

    final static int computeColumnX(int param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var3_int = 0;
          if (param0 != 31128) {
            stackIn_3_0 = 73;
            return stackIn_3_0;
          }
          var4 = QueuedPacket.field_o;
          while (EmailValidationHelpers.field_f.length > var3_int) {
            var5 = AccountRegistrationPanel.field_M[var3_int];
            if (var5 < 0) {
              var4 = var4 + HuffmanCodec.field_l;
            } else {
              var6 = MenuScreen.measureText(true, EmailValidationHelpers.field_f[var3_int], (byte) -97);
              var4 = var4 + SpriteTrimHelpers.field_a;
              var7 = -(var6 >> 1) + PairedSceneWidget.field_Eb;
              if (ButtonMenuDialog.containsPoint(param2, 39, var4, var6 + (PendingRequest.field_h << 1), IntensityTableHelpers.field_b + (FullscreenFocusCanvas.field_d << 1), param1, var7 - PendingRequest.field_h)) {
                stackIn_10_0 = var5;
                return stackIn_10_0;
              }
              var4 = var4 + (IntensityTableHelpers.field_b + ((FullscreenFocusCanvas.field_d << 1) + SpriteTrimHelpers.field_a));
            }
            var3_int++;
          }
          stackIn_16_0 = -1;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var3), "ao.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 == 0) {
          field_e = null;
          field_h = null;
          field_c = null;
          field_b = null;
          field_a = null;
          return;
        }
        field_a = (String) null;
        field_e = null;
        field_h = null;
        field_c = null;
        field_b = null;
        field_a = null;
    }

    static {
        field_f = 66;
        field_c = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_a = "MINION MASTER - ";
        field_b = " - Play the tutorial to learn how to use your spells.<br><br> - Never give up! Quitting halfway through a game counts as a forfeit, which will stop you from earning wands and buying more spells/spellbooks.<br><br> - Save your limited-use spells for when they can change the tide of a game.<br><br> - Don't waste a rechargeable spell on an easy target, you might want to use it again soon!<br><br> - Don't forget to use defence as well as offence. Deflecting an opponent's Meteor with a well-timed shield is a great boon.<br><br> - If you have a level 3 spell, save it until it will do the most damage.<br><br> - Keep refining your spellbook to find the combination that best suits your style of play.<br><br>";
        field_d = true;
    }
}
