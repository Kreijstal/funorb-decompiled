/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LobbySessionHelpers {
    static SpriteWidget field_d;
    static String[] field_b;
    static String textNotAvailableIn2d;
    static String field_f;
    static IntrusiveDeque field_a;
    static int field_c;
    static SpriteWidget field_e;

    final static boolean handleChatInputKey(int param0, int param1, byte param2) {
        StringBuilder discarded$0 = null;
        int var3;
        int var4;
        int var5;
        String var5_ref_String;
        int var6;
        String var8;
        String var9;
        int var10;
        int var11;
        int var12;
        String var13;
        String var14;
        String var15;
        String var16;
        String var17;
        String var18;
        String var19;
        String var20;
        String var36;
        String var37;
        String var38;
        String var39;
        String var40;
        String var41;
        Object var42;
        CharSequence var43;
        int var6Lifetime1;
        String var8Lifetime1;
        String var8Lifetime2;
        String var8Lifetime3;
        String var8Lifetime4;
        String var8Lifetime5;
        String var8Lifetime6;
        String var8Lifetime7;
        String var8Lifetime8;
        var42 = null;
        var12 = Virogrid.field_F ? 1 : 0;
        var3 = 1;
        if (!GameBoard.field_i &&
          null == ArchiveLoadSequence.field_i) {
          var3 = 0;
        }
        if (ChatFilterHelpers.field_e == 0 &&
          null != QueuedRequest.field_h) {
          var3 = 0;
        }
        if (ChatFilterHelpers.field_e == 2 &&
          !NetworkArchiveRequest.isQuickChatRecipientAvailable(68)) {
          var3 = 0;
        }
        var4 = -34 % ((param2 - 59) / 55);
        if (ScrollPane.field_Gb == 84) {
          if (var3 != 0) {
            if (0 < MenuScreen.field_h.length()) {
              var5_ref_String = MenuScreen.field_h.toString();
              var8 = var5_ref_String;
              var8Lifetime8 = var5_ref_String;
              if (GameOptions.containsFilterText(-96, var5_ref_String)) {
                var14 = (String) null;
                var13 = (String) null;
                ArrayWidgetContainer.addChatMessage((String) null, 0, false, FullscreenSupport.field_d, 2, (String) null);
                var16 = (String) null;
                var15 = (String) null;
                ArrayWidgetContainer.addChatMessage((String) null, 0, false, SpriteState.field_q, 2, (String) null);
                LongAndTextLoginPayload.clearChatInput((byte) 121);
                return true;
              }
              var6 = ChatFilterHelpers.field_e;
              if (var6 == 0 &&
                null != AudioSetupHelpers.field_d) {
                var6 = 1;
              }
              if (UiTheme.getChatFilterSetting(var6, (byte) 123) == 2) {
                ChatFilterHelpers.updateChatFilter(1, param1, var6, (byte) 97);
              }
              AccountChoicePanel.sendChatMessage(-1, ChatFilterHelpers.field_e, ArchiveFactoryHelpers.field_d, param0, (byte) 39, var5_ref_String);
              LongAndTextLoginPayload.clearChatInput((byte) 121);
              return true;
            }
          } else {
            if (ChatFilterHelpers.field_e == 0) {
              return true;
            }
          }
          LongAndTextLoginPayload.clearChatInput((byte) 121);
          return true;
        }
        if (ScrollPane.field_Gb == 85) {
          if (var3 == 0) {
            return true;
          }
          if (MenuScreen.field_h.length() <= 0) {
            return true;
          }
          ArchiveBytesHelpers.padWithChar(MenuScreen.field_h, -18340, -1 + MenuScreen.field_h.length(), ' ');
          return true;
        }
        var5 = PopupMenuHelpers.field_d;
        if (!LogoIntroHelpers.isPrintableCharacter((byte) -126, (char) var5)) {
          return false;
        }
        if (var3 == 0) {
          return true;
        }
        if (80 <= MenuScreen.field_h.length()) {
          return true;
        }
        discarded$0 = MenuScreen.field_h.append((char) var5);
        var6Lifetime1 = 485;
        var18 = DebouncedValidator.field_d;
        var8Lifetime1 = var18;
        var8Lifetime2 = var18;
        var17 = BirthDateInputWidget.prefixWithCrown(124, var18);
        var8Lifetime3 = var17;
        var8Lifetime4 = var17;
        var20 = var17;
        var8Lifetime5 = var20;
        var8Lifetime6 = var20;
        if (ChatFilterHelpers.field_e != 2) {
          var8Lifetime7 = "";
          if (ChatFilterHelpers.field_e == 0) {
            if (null == AudioSetupHelpers.field_d &&
              DisplayModeInfo.field_e) {
              var8Lifetime7 = "[" + RankingArraySupport.field_a + "] ";
            }
            if (AudioSetupHelpers.field_d == null) {
              var36 = var8Lifetime7 + var20 + ": ";
              var6Lifetime1 = var6Lifetime1 - IconTextComponent.field_Ob.textWidth(var36);
              if (IconTextComponent.field_Ob.textWidth(MenuScreen.field_h.toString()) > var6Lifetime1) {
                ArchiveBytesHelpers.padWithChar(MenuScreen.field_h, -18340, MenuScreen.field_h.length() - 1, ' ');
              }
              return true;
            }
            if (!ReflectionCheck.field_t) {
              var39 = "[" + MenuScreen.formatIndexedText(new String[]{AudioSetupHelpers.field_d.field_Qb}, ScoreSubmissionHelpers.field_c, 2) + "] ";
              var40 = var39 + var20 + ": ";
              var6Lifetime1 = var6Lifetime1 - IconTextComponent.field_Ob.textWidth(var40);
              if (IconTextComponent.field_Ob.textWidth(MenuScreen.field_h.toString()) > var6Lifetime1) {
                ArchiveBytesHelpers.padWithChar(MenuScreen.field_h, -18340, MenuScreen.field_h.length() - 1, ' ');
              }
              return true;
            }
            if (null == DirectByteStorage.field_e) {
              var37 = "[" + MenuScreen.formatIndexedText(new String[]{AudioSetupHelpers.field_d.field_Qb}, ScoreSubmissionHelpers.field_c, 2) + "] ";
              var38 = var37 + var20 + ": ";
              var6Lifetime1 = var6Lifetime1 - IconTextComponent.field_Ob.textWidth(var38);
              if (IconTextComponent.field_Ob.textWidth(MenuScreen.field_h.toString()) > var6Lifetime1) {
                ArchiveBytesHelpers.padWithChar(MenuScreen.field_h, -18340, MenuScreen.field_h.length() - 1, ' ');
              }
              return true;
            }
            var8Lifetime7 = "[" + DirectByteStorage.field_e + "] ";
          }
          var41 = var8Lifetime7 + var20 + ": ";
          var6Lifetime1 = var6Lifetime1 - IconTextComponent.field_Ob.textWidth(var41);
        } else {
          var43 = (CharSequence) ((Object) ArchiveFactoryHelpers.field_d);
          var19 = MenuScreen.formatIndexedText(new String[]{BoundedRandomAccessFile.canonicalizeNameOrEmpty(11, var43)}, AudioPumpThread.field_c, 2);
          var8Lifetime7 = var19;
          var8Lifetime7 = var19;
          var9 = MenuScreen.formatIndexedText(new String[]{var17}, NanoTickClock.field_d, 2);
          var8Lifetime7 = var9;
          var8Lifetime7 = var9;
          var10 = IconTextComponent.field_Ob.textWidth(var19);
          var11 = IconTextComponent.field_Ob.textWidth(var9);
          if (var10 <= var11) {
            var6Lifetime1 = var6Lifetime1 - var11;
          } else {
            var6Lifetime1 = var6Lifetime1 - var10;
          }
        }
        if (IconTextComponent.field_Ob.textWidth(MenuScreen.field_h.toString()) <= var6Lifetime1) {
          return true;
        }
        ArchiveBytesHelpers.padWithChar(MenuScreen.field_h, -18340, MenuScreen.field_h.length() - 1, ' ');
        return true;
    }

    public static void releaseStatics(byte param0) {
        field_d = null;
        field_b = null;
        field_e = null;
        field_f = null;
        int var1 = -60 / ((30 - param0) / 54);
        field_a = null;
        textNotAvailableIn2d = null;
    }

    final static void disconnectLobby(int param0) {
        int var2 = 0;
        LobbyPlayerEntry var3 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = Virogrid.field_F ? 1 : 0;
        try {
          QueuedRequest.field_h = null;
          GameKeyHandler.field_c = false;
          AudioSetupHelpers.field_d = null;
          if (PasswordConfirmationValidator.field_o != null) {
            PasswordConfirmationValidator.field_o.clear(false);
            PasswordConfirmationValidator.field_o = null;
          }
          LinkTextPainter.field_i = null;
          if (null != ProxyAuthenticationRequiredException.field_f) {
            ProxyAuthenticationRequiredException.field_f.clear(false);
            ProxyAuthenticationRequiredException.field_f = null;
          }
          IntrusiveDequeCursor.field_c = null;
          if (VerticalScrollbar.field_Mb != null) {
            VerticalScrollbar.field_Mb.clear(false);
            VerticalScrollbar.field_Mb = null;
          }
          IndexedSpriteState.field_h = null;
          if (LinkTextPainter.field_i != null) {
            var3 = (LobbyPlayerEntry) (LinkTextPainter.field_i.first(true));
            while (var3 != null) {
              var3.unlinkSecondary(40);
              var3 = (LobbyPlayerEntry) (LinkTextPainter.field_i.next(-1));
            }
            LinkTextPainter.field_i = null;
          }
          if (param0 >= -30) {
            field_a = (IntrusiveDeque) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var1), "fn.D(" + param0 + ')');
        }
    }

    final static void handleRegistrationReply(int param0, int param1, String[] param2, String param3) {
        int var5 = 0;
        int stackIn_9_0 = 0;
        boolean stackIn_10_1 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Virogrid.field_F ? 1 : 0;
        try {
          MusicVoiceMixer.field_l = ClientException.field_d;
          if (param0 == 255) {
            stackIn_9_0 = -32;
            stackIn_10_1 = !(13 <= TextDecodeHelpers.field_d);
            TextMetricsGlobals.field_c = Virogrid.createDobResultReply(stackIn_9_0, stackIn_10_1);
          } else {
            if (param0 >= 100 &&
              param0 <= 105) {
              TextMetricsGlobals.field_c = IntKeyLookup.createStringArrayMessage(param2, 7655);
            } else {
              TextMetricsGlobals.field_c = TypeCode.createSuggestedUsernameQuery(param0, param3, param1 ^ 29532);
            }
          }
          if (param1 != 105) {
            LobbySessionHelpers.clearChatHistory((byte) 118);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("fn.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static void sendPendingRequestPacket(int param0, boolean param1) {
        CipherPacketBuffer var2 = null;
        if (param1) {
          var2 = IterableNodeHashTable.field_g;
          var2.writeCipheredOpcode(param0, 8);
          var2.writeByte(1, -91);
          var2.writeByte(2, -96);
          return;
        }
    }

    final static void clearChatHistory(byte param0) {
        int var1_int = 0;
        int var2 = Virogrid.field_F ? 1 : 0;
        try {
          if (param0 != -69) {
            field_e = (SpriteWidget) null;
          }
          for (var1_int = 0; AccountCreationForm.field_K > var1_int; var1_int++) {
            BufferedSocket.field_s[var1_int] = null;
          }
          AccountCreationForm.field_K = 0;
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "fn.F(" + param0 + ')');
        }
    }

    static {
        field_f = "Play the game without logging in just yet";
        textNotAvailableIn2d = "2D - Fastest";
        field_b = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_a = new IntrusiveDeque();
    }
}
