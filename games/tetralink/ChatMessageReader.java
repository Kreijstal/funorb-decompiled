/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ChatMessageReader {
    static JoinStatusTextHelpers field_d;
    static String field_b;
    static String field_g;
    static int[] field_f;
    static int field_h;
    static int field_e;
    static String field_a;
    static int field_c;

    final static ChatMessage readChatMessage(byte param0, boolean param1) {
        boolean stackIn_3_0 = false;
        int stackIn_11_0 = 0;
        int[] stackIn_24_0 = null;
        Throwable decompiledCaughtException = null;
        BitPacketBuffer var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        BitPacketBuffer var8 = null;
        QuickChatPhraseDefinition var9 = null;
        var7 = TetraLink.field_J;
        var8 = BackgroundSparkle.field_q;
        var2 = var8;
        var3 = var8.readUnsignedByte((byte) -99);
        stackIn_3_0 = ((var3 & 128) != 0);
        CachedArchiveSource.field_s = stackIn_3_0;
        MusicPatch.field_u = var3 & 127;
        CheckboxPainter.field_i = var8.readUnsignedByte((byte) -99);
        if (param0 != 85) {
          return (ChatMessage) null;
        }
        LobbyGame.field_tc = var8.readLong(255);
        if (MusicPatch.field_u == 2) {
          GameOptionControls.field_a = var8.readUnsignedShort(127);
          NameSuggestionsPanel.field_O = var8.readMedium(-1);
        } else {
          GameOptionControls.field_a = 0;
          NameSuggestionsPanel.field_O = 0;
        }
        stackIn_11_0 = (1 != var8.readUnsignedByte((byte) -99)) ? 0 : 1;
        var4 = stackIn_11_0;
        MidiPcmStream.field_O = var8.readString((byte) 81);
        if (var4 != 0) {
          TetraLink.field_M = var8.readString((byte) 81);
        } else {
          TetraLink.field_M = MidiPcmStream.field_O;
        }
        if (MusicPatch.field_u != 1 &&
          4 != MusicPatch.field_u) {
          LoadingStatusHelpers.field_c = 0;
          ValidationStatusIcon.field_U = null;
        } else {
          LoadingStatusHelpers.field_c = var8.readUnsignedShort(127);
          ValidationStatusIcon.field_U = var8.readString((byte) 81);
        }
        if (!param1) {
          ContentTransitionDialog.field_fb = NetworkArchiveRequest.readCompressedChatText(119, var8, 80);
          MouseInputHandler.field_i = null;
        } else {
          var5 = var8.readUnsignedShort(127);
          try {
            var9 = QueuedStatSubmission.field_p.getPhraseDefinition(var5, -128);
            ContentTransitionDialog.field_fb = var9.getPreviewText(-15);
            if (TetraLink.field_M.equals(NetworkGameClient.field_w)) {
              stackIn_24_0 = null;
            } else {
              stackIn_24_0 = var9.field_v;
            }
            MouseInputHandler.field_i = stackIn_24_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            HotspotTextWidget.reportClientError(param0 ^ -122, (Throwable) ((Object) var6), "CC1");
            ContentTransitionDialog.field_fb = null;
            MouseInputHandler.field_i = null;
          }
        }
        return new ChatMessage(param1);
    }

    public static void releaseStatics(int param0) {
        field_d = null;
        field_g = null;
        if (param0 != 6945) {
          return;
        }
        field_a = null;
        field_b = null;
        field_f = null;
    }

    final static String validatePlayerNameFormat(CharSequence param0, int param1, boolean param2) {
        int var7 = 0;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_14_0 = null;
        String stackIn_19_0 = null;
        String stackIn_28_0 = null;
        String stackIn_33_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = TetraLink.field_J;
        try {
          var3_int = 26 / ((-70 - param1) / 51);
          if (param0 == null) {
            stackIn_4_0 = CommonUiHelpers.field_e;
            return stackIn_4_0;
          }
          var4 = param0.length();
          if (1 <= var4 &&
            var4 <= 12) {
            var5 = DialWidgetPainter.normalizeDisplayName(param0, (byte) 108);
            if (var5 != null &&
              var5.length() >= 1) {
              if (!NameSeparatorHelpers.isNameSeparator((byte) 81, var5.charAt(0)) &&
                !NameSeparatorHelpers.isNameSeparator((byte) 81, var5.charAt(var5.length() - 1))) {
                var6 = 0;
                for (var7 = 0; var7 < param0.length(); var7++) {
                  var8 = param0.charAt(var7);
                  if (NameSeparatorHelpers.isNameSeparator((byte) 81, (char) var8)) {
                    var6++;
                  } else {
                    var6 = 0;
                  }
                  if (var6 >= 2 &&
                    !param2) {
                    stackIn_28_0 = GameOptionControls.field_i;
                    return stackIn_28_0;
                  }
                }
                if (0 >= var6) {
                  return null;
                }
                stackIn_33_0 = DraggableWidget.field_U;
                return stackIn_33_0;
              }
              stackIn_19_0 = DraggableWidget.field_U;
              return stackIn_19_0;
            }
            stackIn_14_0 = CommonUiHelpers.field_e;
            return stackIn_14_0;
          }
          stackIn_9_0 = CommonUiHelpers.field_e;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_36_0 = var3;
          stackIn_36_1 = new StringBuilder().append("wg.C(");
          if (param0 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static int packChatFilterSettings(boolean param0) {
        if (!param0) {
          ChatMessageReader.releaseStatics(123);
        }
        return IntrusiveNode.field_f + ((RasterStackHelpers.field_b << 2) + (RegistrationResponseHelpers.field_e << 4));
    }

    static {
        field_d = new JoinStatusTextHelpers();
        field_b = null;
        field_f = new int[]{2, 14, 15, 6, 5, 16, 17, 18, 12};
        field_h = 4;
        field_e = 0;
        field_g = "Enter name of friend to delete from list";
        field_a = "Updates will sent to the email address you've given";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static ChatMessage readChatMessage(int param0, boolean param1) {
        boolean stackIn_3_0 = false;
        int stackIn_11_0 = 0;
        int[] stackIn_24_0 = null;
        Throwable decompiledCaughtException = null;
        BitPacketBuffer var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        BitPacketBuffer var8 = null;
        QuickChatPhraseDefinition var9 = null;
        var7 = TetraLink.field_J;
        var8 = BackgroundSparkle.field_q;
        var2 = var8;
        var3 = var8.readUnsignedByte((byte) -99);
        stackIn_3_0 = ((var3 & 128) != 0);
        CachedArchiveSource.field_s = stackIn_3_0;
        MusicPatch.field_u = var3 & 127;
        CheckboxPainter.field_i = var8.readUnsignedByte((byte) -99);
        if (param0 != 85) {
          return (ChatMessage) null;
        }
        LobbyGame.field_tc = var8.readLong(255);
        if (MusicPatch.field_u == 2) {
          GameOptionControls.field_a = var8.readUnsignedShort(127);
          NameSuggestionsPanel.field_O = var8.readMedium(-1);
        } else {
          GameOptionControls.field_a = 0;
          NameSuggestionsPanel.field_O = 0;
        }
        stackIn_11_0 = (1 != var8.readUnsignedByte((byte) -99)) ? 0 : 1;
        var4 = stackIn_11_0;
        MidiPcmStream.field_O = var8.readString((byte) 81);
        if (var4 != 0) {
          TetraLink.field_M = var8.readString((byte) 81);
        } else {
          TetraLink.field_M = MidiPcmStream.field_O;
        }
        if (MusicPatch.field_u != 1 &&
          4 != MusicPatch.field_u) {
          LoadingStatusHelpers.field_c = 0;
          ValidationStatusIcon.field_U = null;
        } else {
          LoadingStatusHelpers.field_c = var8.readUnsignedShort(127);
          ValidationStatusIcon.field_U = var8.readString((byte) 81);
        }
        if (!param1) {
          ContentTransitionDialog.field_fb = NetworkArchiveRequest.readCompressedChatText(119, var8, 80);
          MouseInputHandler.field_i = null;
        } else {
          var5 = var8.readUnsignedShort(127);
          try {
            var9 = QueuedStatSubmission.field_p.getPhraseDefinition(var5, -128);
            ContentTransitionDialog.field_fb = var9.getPreviewText(-15);
            if (TetraLink.field_M.equals(NetworkGameClient.field_w)) {
              stackIn_24_0 = null;
            } else {
              stackIn_24_0 = var9.field_v;
            }
            MouseInputHandler.field_i = stackIn_24_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            HotspotTextWidget.reportClientError(param0 ^ -122, (Throwable) ((Object) var6), "CC1");
            ContentTransitionDialog.field_fb = null;
            MouseInputHandler.field_i = null;
          }
        }
        return new ChatMessage(param1);
    }
}
