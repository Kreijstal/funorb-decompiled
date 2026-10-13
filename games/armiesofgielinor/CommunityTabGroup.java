/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CommunityTabGroup {
    static String field_b;
    TabbedPanel tabs;
    static String field_d;
    static String field_c;

    final static String a(int param0, CharSequence param1) {
        int var4 = 0;
        int var2_int = 0;
        char[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_23_0 = null;
        String stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var2_int = param1.length();
          if (var2_int > 20) {
            var2_int = 20;
          }
          var8 = new char[var2_int];
          var7 = var8;
          var3 = var7;
          for (var4 = 0; var2_int > var4; var4++) {
            var5 = param1.charAt(var4);
            if (var5 >= 65 &&
              var5 <= 90) {
              var3[var4] = (char)(var5 + 32);
            } else if ((var5 < 97 ||
              var5 > 122) &&
              (var5 < 48 ||
              var5 > 57)) {
              var3[var4] = (char)95;
            } else {
              var3[var4] = (char)var5;
            }
          }
          if (param0 == -1212) {
            stackIn_25_0 = new String(var8);
            return stackIn_25_0;
          }
          stackIn_23_0 = (String) null;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_28_0 = var2;
          stackIn_28_1 = new StringBuilder().append("ea.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final static ChatMessage decodeChatMessage(byte obfuscationGuard, boolean quickChat) {
        boolean systemMessage = false;
        int separateAccountName = 0;
        int[] responsePhraseIds = null;
        Throwable decompiledCaughtException = null;
        CipherPacketBuffer packetAlias = null;
        int packedChannel = 0;
        int hasSeparateAccountName = 0;
        int phraseIdOrGuardRemainder = 0;
        Exception phraseFailure = null;
        int obfuscationControl = 0;
        CipherPacketBuffer packet = null;
        QuickChatPhrase phrase = null;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        packet = ByteStorage.incomingPacket;
        packetAlias = packet;
        packedChannel = packet.readUnsignedByte(0);
        systemMessage = (0 != (packedChannel & 128));
        DualNodeDeque.decodedChatSystemMessage = systemMessage;
        MatchConditionEntry.decodedChatChannel = packedChannel & 127;
        UnitModelViewer.decodedChatIconId = packet.readUnsignedByte(0);
        ModalDialogHost.decodedChatAccountId = packet.readLong((byte) -2);
        if (2 == MatchConditionEntry.decodedChatChannel) {
          PcmPlayerService.decodedPrivateMessageIdHigh16 = packet.readUnsignedShort((byte) -104);
          th.decodedPrivateMessageIdLow24 = packet.readUnsignedMedium((byte) -13);
        } else {
          PcmPlayerService.decodedPrivateMessageIdHigh16 = 0;
          th.decodedPrivateMessageIdLow24 = 0;
        }
        separateAccountName = (packet.readUnsignedByte(0) != 1) ? 0 : 1;
        hasSeparateAccountName = separateAccountName;
        RegistrationAgreementPane.decodedChatDisplayName = packet.readNullTerminatedString(1);
        if (hasSeparateAccountName == 0) {
          gp.decodedChatAccountName = RegistrationAgreementPane.decodedChatDisplayName;
        } else {
          gp.decodedChatAccountName = packet.readNullTerminatedString(1);
        }
        if (MatchConditionEntry.decodedChatChannel == 1) {
          DisplaySettingsDialog.decodedChatContextId = packet.readUnsignedShort((byte) -104);
          BestScoreStrategy.decodedChatChannelLabel = packet.readNullTerminatedString(1);
        } else {
          if (MatchConditionEntry.decodedChatChannel == 4) {
            DisplaySettingsDialog.decodedChatContextId = packet.readUnsignedShort((byte) -104);
            BestScoreStrategy.decodedChatChannelLabel = packet.readNullTerminatedString(1);
          } else {
            DisplaySettingsDialog.decodedChatContextId = 0;
            BestScoreStrategy.decodedChatChannelLabel = null;
          }
        }
        if (!quickChat) {
          BattleGraphicsAssets.decodedChatText = GameCanvas.readCompressedChatText(80, (byte) -25, packet);
          HotspotTextWidget.decodedChatResponsePhraseIds = null;
        } else {
          phraseIdOrGuardRemainder = packet.readUnsignedShort((byte) -104);
          try {
            phrase = GuestPlayConfirmationForm.quickChatPhrases.getPhrase(phraseIdOrGuardRemainder, -124);
            BattleGraphicsAssets.decodedChatText = phrase.getPreviewText((byte) 97);
            if (gp.decodedChatAccountName.equals(mv.localAccountName)) {
              responsePhraseIds = null;
            } else {
              responsePhraseIds = phrase.linkedPhraseIds;
            }
            HotspotTextWidget.decodedChatResponsePhraseIds = responsePhraseIds;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            phraseFailure = (Exception) (Object) decompiledCaughtException;
            af.a((Throwable) ((Object) phraseFailure), -120, "CC1");
            HotspotTextWidget.decodedChatResponsePhraseIds = null;
            BattleGraphicsAssets.decodedChatText = null;
          }
        }
        phraseIdOrGuardRemainder = -17 / ((obfuscationGuard - 47) / 42);
        return new ChatMessage(quickChat);
    }

    final static LoginMethod readLastLoginMethod(int obfuscationGuard, java.applet.Applet applet) {
        String cookieValue = null;
        RuntimeException failure = null;
        LoginMethod[] methods = null;
        int methodIndex = 0;
        LoginMethod method = null;
        int obfuscationControl = 0;
        LoginMethod defaultWithoutCookie = null;
        LoginMethod matchingMethod = null;
        LoginMethod defaultUnrecognized = null;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String appletDescription = null;
        RuntimeException caughtFailure = null;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          cookieValue = fk.readBrowserCookie((byte) 102, applet, "jagex-last-login-method");
          if (cookieValue == null) {
            defaultWithoutCookie = MatchConditionEntry.defaultLoginMethod;
            return defaultWithoutCookie;
          }
          methods = TileMetadata.getLoginMethods(0);
          methodIndex = obfuscationGuard;
          while (true) {
            if (methodIndex >= methods.length) {
              defaultUnrecognized = MatchConditionEntry.defaultLoginMethod;
              return defaultUnrecognized;
            }
            method = methods[methodIndex];
            if (!method.matchesCookieValue((byte) -106, cookieValue)) {
              methodIndex++;
              continue;
            }
            break;
          }
          matchingMethod = method;
          return matchingMethod;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("ea.E(").append(obfuscationGuard).append(',');
          if (applet == null) {
            appletDescription = "null";
          } else {
            appletDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(appletDescription).append(')').toString());
        }
    }

    final void setLayout(int height, byte obfuscationGuard, int x, int width, int y) {
        int var6 = 24;
        int var7 = 5;
        if (obfuscationGuard > -117) {
          CommunityTabGroup.decodeChatMessageWithIntGuard(-115, true);
        }
        this.tabs.setLayout(width, y, x, var7, 0, var6, height);
        bn.field_c.setBounds(jn.field_d, -20500, su.field_d.width, 0, 0);
        AdaptiveMidiPcmStream.field_kb.setBounds(18, -20500, -2 + (-2 + su.field_d.width + (-jn.field_c - 80)), 2 + jn.field_d, 0);
        ek.field_a.setBounds(18, -20500, 82 + jn.field_c, jn.field_d + 2, -82 + (su.field_d.width - jn.field_c));
        ListMissionsConsoleCommand.field_E.setLayout(0, jn.field_c, 2, 20, su.field_d.width, 20 + (2 + jn.field_d), -2 + (su.field_d.height - jn.field_d) - 20, (byte) -92);
        TaggedMapData.field_g.layoutControls((byte) -110, jn.field_c, 20, 2);
    }

    CommunityTabGroup(String firstTabLabel, ClientUiComponent firstPanel) {
        String[] var3 = null;
        ClientUiComponent[] var4 = null;
        try {
          var3 = new String[]{firstTabLabel, IterableDualNodeDeque.field_a, op.field_e};
          var4 = new ClientUiComponent[]{firstPanel, su.field_d, (ClientUiComponent) ((Object) TaggedMapData.field_g)};
          this.tabs = new TabbedPanel(0L, h.field_d, var3, wm.field_c, var4, 0);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ea.<init>(" + (firstTabLabel != null ? "{...}" : "null") + ',' + (firstPanel != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        int var1 = 43 % ((19 - param0) / 38);
        field_d = null;
    }

    static {
        field_d = "<%0> has joined your game.";
        field_c = "Passwords can only contain letters and numbers";
        field_b = "Magical incantations to instantly change the tide of battle.";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static ChatMessage decodeChatMessageWithIntGuard(int obfuscationGuard, boolean quickChat) {
        boolean systemMessage = false;
        int separateAccountName = 0;
        int[] responsePhraseIds = null;
        Throwable decompiledCaughtException = null;
        CipherPacketBuffer packetAlias = null;
        int packedChannel = 0;
        int hasSeparateAccountName = 0;
        int phraseIdOrGuardRemainder = 0;
        Exception phraseFailure = null;
        int obfuscationControl = 0;
        CipherPacketBuffer packet = null;
        QuickChatPhrase phrase = null;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        packet = ByteStorage.incomingPacket;
        packetAlias = packet;
        packedChannel = packet.readUnsignedByte(0);
        systemMessage = (0 != (packedChannel & 128));
        DualNodeDeque.decodedChatSystemMessage = systemMessage;
        MatchConditionEntry.decodedChatChannel = packedChannel & 127;
        UnitModelViewer.decodedChatIconId = packet.readUnsignedByte(0);
        ModalDialogHost.decodedChatAccountId = packet.readLong((byte) -2);
        if (2 == MatchConditionEntry.decodedChatChannel) {
          PcmPlayerService.decodedPrivateMessageIdHigh16 = packet.readUnsignedShort((byte) -104);
          th.decodedPrivateMessageIdLow24 = packet.readUnsignedMedium((byte) -13);
        } else {
          PcmPlayerService.decodedPrivateMessageIdHigh16 = 0;
          th.decodedPrivateMessageIdLow24 = 0;
        }
        separateAccountName = (packet.readUnsignedByte(0) != 1) ? 0 : 1;
        hasSeparateAccountName = separateAccountName;
        RegistrationAgreementPane.decodedChatDisplayName = packet.readNullTerminatedString(1);
        if (hasSeparateAccountName == 0) {
          gp.decodedChatAccountName = RegistrationAgreementPane.decodedChatDisplayName;
        } else {
          gp.decodedChatAccountName = packet.readNullTerminatedString(1);
        }
        if (MatchConditionEntry.decodedChatChannel == 1) {
          DisplaySettingsDialog.decodedChatContextId = packet.readUnsignedShort((byte) -104);
          BestScoreStrategy.decodedChatChannelLabel = packet.readNullTerminatedString(1);
        } else {
          if (MatchConditionEntry.decodedChatChannel == 4) {
            DisplaySettingsDialog.decodedChatContextId = packet.readUnsignedShort((byte) -104);
            BestScoreStrategy.decodedChatChannelLabel = packet.readNullTerminatedString(1);
          } else {
            DisplaySettingsDialog.decodedChatContextId = 0;
            BestScoreStrategy.decodedChatChannelLabel = null;
          }
        }
        if (!quickChat) {
          BattleGraphicsAssets.decodedChatText = GameCanvas.readCompressedChatText(80, (byte) -25, packet);
          HotspotTextWidget.decodedChatResponsePhraseIds = null;
        } else {
          phraseIdOrGuardRemainder = packet.readUnsignedShort((byte) -104);
          try {
            phrase = GuestPlayConfirmationForm.quickChatPhrases.getPhrase(phraseIdOrGuardRemainder, -124);
            BattleGraphicsAssets.decodedChatText = phrase.getPreviewText((byte) 97);
            if (gp.decodedChatAccountName.equals(mv.localAccountName)) {
              responsePhraseIds = null;
            } else {
              responsePhraseIds = phrase.linkedPhraseIds;
            }
            HotspotTextWidget.decodedChatResponsePhraseIds = responsePhraseIds;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            phraseFailure = (Exception) (Object) decompiledCaughtException;
            af.a((Throwable) ((Object) phraseFailure), -120, "CC1");
            HotspotTextWidget.decodedChatResponsePhraseIds = null;
            BattleGraphicsAssets.decodedChatText = null;
          }
        }
        phraseIdOrGuardRemainder = -17 / ((obfuscationGuard - 47) / 42);
        return new ChatMessage(quickChat);
    }
}
