/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class RasterBuffer {
    static String field_f;
    static String field_g;
    int[] field_a;
    static SoundCache field_e;
    int field_i;
    static String field_j;
    static int field_k;
    java.awt.Image field_b;
    static String field_h;
    static String field_d;
    int field_c;

    final void bindRaster(byte param0) {
        if (param0 <= 120) {
          return;
        }
        SoftwareRaster.setTarget(this.field_a, this.field_c, this.field_i);
    }

    abstract void initialize(int param0, byte param1, java.awt.Component param2, int param3);

    abstract void drawImage(byte param0, java.awt.Graphics param1, int param2, int param3);

    final static void setMenuOptionMetrics(boolean param0, int param1, int param2, int param3, int param4) {
        EmailSyntaxValidator.field_r = param3;
        PendingAckRequest.field_q = param4;
        TextFieldValidator.field_l = param2;
        if (param0) {
          return;
        }
        GradientOutlineTextPainter.field_s = param1;
    }

    final static boolean readBooleanBit(int param0, CipherPacketBuffer param1) {
        RuntimeException var2 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -1766) {
            stackIn_6_0 = (param1.readBits(param0 + 1815, 1) == 1);
            return stackIn_6_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("he.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static boolean handleChatInputKey(byte param0, int param1, int param2) {
        StringBuilder discarded$0 = null;
        int var3;
        String var4_ref_String;
        int var4;
        int var5;
        String var7;
        String var8;
        int var9;
        int var10;
        int var11;
        String var12;
        String var13;
        String var14;
        String var15;
        String var16;
        String var17;
        String var18;
        String var19;
        String var20;
        Object var21;
        Object var22;
        CharSequence var23;
        int var5Lifetime1;
        String var7Lifetime1;
        String var7Lifetime2;
        String var7Lifetime3;
        String var7Lifetime4;
        String var7Lifetime5;
        String var7Lifetime6;
        var21 = null;
        var22 = null;
        var11 = SteelSentinels.obfuscationControl;
        var3 = 1;
        if (!PopupMenuHelpers.field_f &&
          LoginActionHelpers.field_a == null) {
          var3 = 0;
        }
        if (ChatPanelHelpers.field_b == 0 &&
          null != ByteArrayPoolHelpers.field_a) {
          var3 = 0;
        }
        if (param0 > -119) {
          field_j = (String) null;
        }
        if (ChatPanelHelpers.field_b == 2 &&
          !StatefulTextPainter.isPrivateChatTargetOnline((byte) -62)) {
          var3 = 0;
        }
        if (NameAvailabilityValidator.field_q == 84) {
          if (var3 == 0) {
            if (ChatPanelHelpers.field_b != 0) {
              AlternateUsernameCredentials.clearChatText(97);
            }
          } else {
            if (ChatHistoryHelpers.field_g.length() > 0) {
              var4_ref_String = ChatHistoryHelpers.field_g.toString();
              if (TextAndBitHelpers.containsFilterText(var4_ref_String, true)) {
                var13 = (String) null;
                var12 = (String) null;
                MusicCrossfadeStream.appendChatMessage((String) null, TextLayoutLine.field_e, 0, (byte) 21, (String) null, 2);
                var15 = (String) null;
                var14 = (String) null;
                MusicCrossfadeStream.appendChatMessage((String) null, MouseWheelInput.field_e, 0, (byte) 21, (String) null, 2);
                AlternateUsernameCredentials.clearChatText(81);
              } else {
                var5 = ChatPanelHelpers.field_b;
                if (0 == var5 &&
                  LoginEncryptionHelpers.field_b != null) {
                  var5 = 1;
                }
                if (NameAvailabilityValidator.getChatFilterMode(var5, 1) == 2) {
                  TextLayoutLine.setChatFilterMode(1, var5, param2, -18853);
                }
                QuickChatPhraseCache.sendReport(param1, LoadingScreenHelpers.field_e, -6988, ChatPanelHelpers.field_b, -1, var4_ref_String);
                AlternateUsernameCredentials.clearChatText(81);
              }
            } else {
              AlternateUsernameCredentials.clearChatText(81);
            }
          }
          return true;
        }
        if (NameAvailabilityValidator.field_q == 85) {
          if (var3 == 0) {
            return true;
          }
          if (0 >= ChatHistoryHelpers.field_g.length()) {
            return true;
          }
          NameCheckResult.padWithChar(' ', 200, ChatHistoryHelpers.field_g, -1 + ChatHistoryHelpers.field_g.length());
          return true;
        }
        var4 = LoginMethod.field_c;
        if (!ChatHistoryHelpers.isRenderableCharacter(2459, (char) var4)) {
          return false;
        }
        if (var3 == 0) {
          return true;
        }
        if (ChatHistoryHelpers.field_g.length() >= 80) {
          return true;
        }
        discarded$0 = ChatHistoryHelpers.field_g.append((char) var4);
        var5Lifetime1 = 485;
        var17 = GrowableIntList.field_l;
        var7 = var17;
        var7Lifetime1 = var17;
        var16 = SceneWidgetNode.prefixWithCrown(-27905, var17);
        var7Lifetime2 = var16;
        var7Lifetime3 = var16;
        var19 = var16;
        var7Lifetime4 = var19;
        var7Lifetime5 = var19;
        if (ChatPanelHelpers.field_b != 2) {
          var7Lifetime6 = "";
          if (ChatPanelHelpers.field_b == 0) {
            if (LoginEncryptionHelpers.field_b == null &&
              QuickChatPacketHelpers.field_g) {
              var7Lifetime6 = "[" + ThreeSliceButtonPainter.field_p + "] ";
            }
            if (null != LoginEncryptionHelpers.field_b) {
              if (!LobbyPlayer.field_lc) {
                var7Lifetime6 = "[" + SocketConnector.formatTemplate(AccountChoicePanel.field_ab, -98, new String[]{LoginEncryptionHelpers.field_b.field_Xb}) + "] ";
              } else {
                if (null == PartInstruction.field_a) {
                  var7Lifetime6 = "[" + SocketConnector.formatTemplate(AccountChoicePanel.field_ab, -98, new String[]{LoginEncryptionHelpers.field_b.field_Xb}) + "] ";
                } else {
                  var7Lifetime6 = "[" + PartInstruction.field_a + "] ";
                }
              }
            }
            var20 = var7Lifetime6 + var19 + ": ";
            var5Lifetime1 = var5Lifetime1 - BirthDateEntryPanel.field_X.textWidth(var20);
          } else {
            var20 = var7Lifetime6 + var19 + ": ";
            var5Lifetime1 = var5Lifetime1 - BirthDateEntryPanel.field_X.textWidth(var20);
          }
        } else {
          var23 = (CharSequence) ((Object) LoadingScreenHelpers.field_e);
          var18 = SocketConnector.formatTemplate(LoginActionHelpers.field_d, -19, new String[]{TextWidgetPainter.normalizeName((byte) 116, var23)});
          var7Lifetime6 = var18;
          var7Lifetime6 = var18;
          var8 = SocketConnector.formatTemplate(SpriteFrame.field_e, -87, new String[]{var16});
          var7Lifetime6 = var8;
          var7Lifetime6 = var8;
          var9 = BirthDateEntryPanel.field_X.textWidth(var18);
          var10 = BirthDateEntryPanel.field_X.textWidth(var8);
          if (var10 >= var9) {
            var5Lifetime1 = var5Lifetime1 - var10;
          } else {
            var5Lifetime1 = var5Lifetime1 - var9;
          }
        }
        if (var5Lifetime1 >= BirthDateEntryPanel.field_X.textWidth(ChatHistoryHelpers.field_g.toString())) {
          return true;
        }
        NameCheckResult.padWithChar(' ', 200, ChatHistoryHelpers.field_g, -1 + ChatHistoryHelpers.field_g.length());
        return true;
    }

    public static void releaseStatics(int param0) {
        field_j = null;
        field_e = null;
        field_g = null;
        field_f = null;
        field_d = null;
        if (param0 == 690) {
          field_h = null;
          return;
        }
        field_e = (SoundCache) null;
        field_h = null;
    }

    final static boolean isPlayerCountValidForMode(int param0, boolean param1, int param2) {
        if (param0 == 1) {
          if (param2 % 2 != 0) {
            return false;
          }
        } else {
          if (4 == param0 &&
            param2 % 2 != 0) {
            return false;
          }
        }
        if (param0 == 5) {
          return (param2 == 2);
        }
        if (!param1) {
          return !(param2 < 2);
        }
        field_h = (String) null;
        return !(param2 < 2);
    }

    final static boolean isSpecialItemUnlocked(byte param0) {
        if (param0 <= 115) {
          RasterBuffer.setMenuOptionMetrics(false, 31, -36, -44, -98);
          return GzipDecoder.ownsSpecialPart(-124);
        }
        return GzipDecoder.ownsSpecialPart(-124);
    }

    static {
        field_g = "Rated game";
        field_k = 0;
        field_h = "NOT ENGINEERED";
        field_j = "Invite players";
        field_f = "Hide private chat and appear offline to friends";
        field_d = "ALT+<img=26> drops target lock: Off";
    }
}
