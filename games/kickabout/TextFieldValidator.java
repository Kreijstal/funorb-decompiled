/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TextFieldValidator extends DebouncedValidationProvider implements TextInputListener {
    static String field_e;
    static int[] field_h;
    static String[] field_i;
    static Sprite[] field_d;
    static int[] field_g;
    private TextInputWidget field_f;

    final static ChatMessage a(byte param0, boolean param1) {
        boolean stackIn_3_0 = false;
        int stackIn_9_0 = 0;
        int[] stackIn_22_0 = null;
        Throwable decompiledCaughtException = null;
        CipherPacketBuffer var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        CipherPacketBuffer var8 = null;
        QuickChatPhraseDefinition var9 = null;
        var7 = Kickabout.field_G;
        var8 = ByteArrayPool.field_e;
        var2 = var8;
        var3 = var8.readUnsignedByte((byte) -112);
        stackIn_3_0 = ((128 & var3) != 0);
        PasswordValidator.field_l = stackIn_3_0;
        RegistrationRequestDialog.field_ob = 127 & var3;
        SellPlayerDialog.field_F = var8.readUnsignedByte((byte) -108);
        MessageDialog.field_z = var8.readLong((byte) -124);
        if (RegistrationRequestDialog.field_ob != 2) {
          FindingOpponentScreen.field_E = 0;
          DateInputWidget.field_G = 0;
        } else {
          FindingOpponentScreen.field_E = var8.readUnsignedShort((byte) 81);
          DateInputWidget.field_G = var8.readUnsignedMedium(-119);
        }
        stackIn_9_0 = (var8.readUnsignedByte((byte) -116) != 1) ? 0 : 1;
        var4 = stackIn_9_0;
        SortCriterion.field_d = var8.readString(-114);
        if (var4 != 0) {
          LookupRecordUpdate.field_f = var8.readString(69);
        } else {
          LookupRecordUpdate.field_f = SortCriterion.field_d;
        }
        if (RegistrationRequestDialog.field_ob == 1) {
          WorldSpriteDecoration.field_f = var8.readUnsignedShort((byte) 81);
          MatchTextInputOverlay.field_e = var8.readString(42);
        } else {
          if (RegistrationRequestDialog.field_ob == 4) {
            WorldSpriteDecoration.field_f = var8.readUnsignedShort((byte) 81);
            MatchTextInputOverlay.field_e = var8.readString(42);
          } else {
            WorldSpriteDecoration.field_f = 0;
            MatchTextInputOverlay.field_e = null;
          }
        }
        if (!param1) {
          GameMediaSupport.field_a = HuffmanTextSupport.readHuffmanString(80, (byte) -96, var8);
          ChatComposeSupport.field_b = null;
          if (param0 > 84) {
            return new ChatMessage(param1);
          }
          TextFieldValidator.releaseStatics((byte) 82);
          return new ChatMessage(param1);
        }
        var5 = var8.readUnsignedShort((byte) 81);
        try {
          var9 = TournamentLobbyScreen.field_j.getPhrase(-39, var5);
          GameMediaSupport.field_a = var9.getDisplayText((byte) -98);
          if (LookupRecordUpdate.field_f.equals(ArchiveSource.field_e)) {
            stackIn_22_0 = null;
          } else {
            stackIn_22_0 = var9.field_n;
          }
          ChatComposeSupport.field_b = stackIn_22_0;
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (Exception) (Object) decompiledCaughtException;
          UnreadMessagesScreen.reportClientError("CC1", (Throwable) ((Object) var6), 1);
          GameMediaSupport.field_a = null;
          ChatComposeSupport.field_b = null;
          if (param0 > 84) {
            return new ChatMessage(param1);
          }
          TextFieldValidator.releaseStatics((byte) 82);
          return new ChatMessage(param1);
        }
        if (param0 > 84) {
          return new ChatMessage(param1);
        }
        TextFieldValidator.releaseStatics((byte) 82);
        return new ChatMessage(param1);
    }

    abstract ValidationState validateText(String param0, int param1);

    public final boolean isInputEmpty(byte param0) {
        if (param0 != -28) {
          field_h = (int[]) null;
          if (this.field_f.field_q != null) {
            return this.field_f.field_q.length() == 0 ? true : false;
          }
          return true;
        }
        if (this.field_f.field_q == null) {
          return true;
        }
        if (this.field_f.field_q.length() != 0) {
          return false;
        }
        return true;
    }

    final ValidationState evaluateValidationState(boolean param0) {
        if (!param0) {
          return this.validateText(this.field_f.field_q, -5);
        }
        this.evaluateValidationState(true);
        return this.validateText(this.field_f.field_q, -5);
    }

    public final void onEnterPressed(int param0, TextInputWidget param1) {
        try {
          int var3_int = -82 % ((param0 - 8) / 47);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "jd.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void onTextChanged(byte param0, TextInputWidget param1) {
        if (param0 < 65) {
          return;
        }
        try {
          this.validationChanged(116);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "jd.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void updateQuickChatOverlays(int param0, boolean param1, int param2, int param3) {
        SocialRowOrderSupport.updateQuickChatKeysHelp(-27, param1);
        DraggableWidget.updateQuickChatMenu(param0, (byte) -26, param1, param3);
        if (param2 != 14686) {
          field_g = (int[]) null;
        }
    }

    final String evaluateValidationMessage(int param0) {
        if (param0 != -1) {
          return (String) null;
        }
        return this.describeText((byte) 25, this.field_f.field_q);
    }

    TextFieldValidator(TextInputWidget param0) {
        try {
          this.field_f = param0;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "jd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    abstract String describeText(byte param0, String param1);

    public static void releaseStatics(byte param0) {
        int var1 = 91 % ((-57 - param0) / 62);
        field_g = null;
        field_d = null;
        field_e = null;
        field_h = null;
        field_i = null;
    }

    final static boolean areAccountTrinketsDisabled(int param0) {
        if (param0 != -1) {
          return false;
        }
        if (PlayArea.isGuestSession(100)) {
          return true;
        }
        if (WeightedLruCache.field_d > 0) {
          return false;
        }
        return true;
    }

    static {
        field_e = "quickplay";
        field_h = new int[8192];
        field_i = new String[]{"Match me up with a player of similar rating", "Match me up with a player in the same, or nearest league", "Match me up with a player who's team is of a similar level"};
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static ChatMessage $cfr$intArgs$a$e7eed804270c(int param0, boolean param1) {
        boolean stackIn_3_0 = false;
        int stackIn_9_0 = 0;
        int[] stackIn_22_0 = null;
        Throwable decompiledCaughtException = null;
        CipherPacketBuffer var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        CipherPacketBuffer var8 = null;
        QuickChatPhraseDefinition var9 = null;
        var7 = Kickabout.field_G;
        var8 = ByteArrayPool.field_e;
        var2 = var8;
        var3 = var8.readUnsignedByte((byte) -112);
        stackIn_3_0 = ((128 & var3) != 0);
        PasswordValidator.field_l = stackIn_3_0;
        RegistrationRequestDialog.field_ob = 127 & var3;
        SellPlayerDialog.field_F = var8.readUnsignedByte((byte) -108);
        MessageDialog.field_z = var8.readLong((byte) -124);
        if (RegistrationRequestDialog.field_ob != 2) {
          FindingOpponentScreen.field_E = 0;
          DateInputWidget.field_G = 0;
        } else {
          FindingOpponentScreen.field_E = var8.readUnsignedShort((byte) 81);
          DateInputWidget.field_G = var8.readUnsignedMedium(-119);
        }
        stackIn_9_0 = (var8.readUnsignedByte((byte) -116) != 1) ? 0 : 1;
        var4 = stackIn_9_0;
        SortCriterion.field_d = var8.readString(-114);
        if (var4 != 0) {
          LookupRecordUpdate.field_f = var8.readString(69);
        } else {
          LookupRecordUpdate.field_f = SortCriterion.field_d;
        }
        if (RegistrationRequestDialog.field_ob == 1) {
          WorldSpriteDecoration.field_f = var8.readUnsignedShort((byte) 81);
          MatchTextInputOverlay.field_e = var8.readString(42);
        } else {
          if (RegistrationRequestDialog.field_ob == 4) {
            WorldSpriteDecoration.field_f = var8.readUnsignedShort((byte) 81);
            MatchTextInputOverlay.field_e = var8.readString(42);
          } else {
            WorldSpriteDecoration.field_f = 0;
            MatchTextInputOverlay.field_e = null;
          }
        }
        if (!param1) {
          GameMediaSupport.field_a = HuffmanTextSupport.readHuffmanString(80, (byte) -96, var8);
          ChatComposeSupport.field_b = null;
          if (param0 > 84) {
            return new ChatMessage(param1);
          }
          TextFieldValidator.releaseStatics((byte) 82);
          return new ChatMessage(param1);
        }
        var5 = var8.readUnsignedShort((byte) 81);
        try {
          var9 = TournamentLobbyScreen.field_j.getPhrase(-39, var5);
          GameMediaSupport.field_a = var9.getDisplayText((byte) -98);
          if (LookupRecordUpdate.field_f.equals(ArchiveSource.field_e)) {
            stackIn_22_0 = null;
          } else {
            stackIn_22_0 = var9.field_n;
          }
          ChatComposeSupport.field_b = stackIn_22_0;
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (Exception) (Object) decompiledCaughtException;
          UnreadMessagesScreen.reportClientError("CC1", (Throwable) ((Object) var6), 1);
          GameMediaSupport.field_a = null;
          ChatComposeSupport.field_b = null;
          if (param0 > 84) {
            return new ChatMessage(param1);
          }
          TextFieldValidator.releaseStatics((byte) 82);
          return new ChatMessage(param1);
        }
        if (param0 > 84) {
          return new ChatMessage(param1);
        }
        TextFieldValidator.releaseStatics((byte) 82);
        return new ChatMessage(param1);
    }
}
