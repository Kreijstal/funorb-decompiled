/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PasswordValidator extends TextFieldValidator {
    static int field_n;
    private EditableTextWidget emailField;
    private EditableTextWidget identifierField;
    static ResourceArchive field_p;
    static String field_s;
    static String field_r;

    final String messageForText(byte guard, String text) {
        String stackIn_37_2 = null;
        try {
          String var7 = this.identifierField.text.toLowerCase();
          String var4 = text.toLowerCase();
          if (0 == var4.length()) {
            return null;
          }
          String var5 = var4;
          if (LegacyWidgetStyle.isOutsidePasswordLength((byte) -7, var5)) {
            String stackIn_6_0 = TerrainMap.field_e;
            return stackIn_6_0;
          }
          if (MatchingTextValidator.containsNonAsciiAlphanumeric((byte) -78, var5)) {
            String stackIn_10_0 = ModeProgress.field_b;
            return stackIn_10_0;
          }
          if (RepeatedCharacterSupport.isRepeatedCharacter(1, var5)) {
            String stackIn_14_0 = PacketBuffer.field_j;
            return stackIn_14_0;
          }
          int var6 = 78 / ((guard - 10) / 51);
          if (this.containsEmailPortion((byte) 53, text)) {
            String stackIn_17_0 = CampaignLoadingSupport.field_b;
            return stackIn_17_0;
          }
          if (var7.length() <= 0) {
            String stackIn_33_0 = TrackerMusicLoader.field_b;
            return stackIn_33_0;
          }
          if (PasswordSubstringSupport.containsForwardOrReversed(0, var5, var7)) {
            String stackIn_22_0 = IntrusiveDeque.field_b;
            return stackIn_22_0;
          }
          if (ValidationHelpWidget.containsIdentifierVariant(var5, (byte) 37, var7)) {
            String stackIn_26_0 = DiskCacheWorker.field_a;
            return stackIn_26_0;
          }
          if (!RockBuster.containsIdentifierIgnoringUnderscores(-115, var5, var7)) {
            String stackIn_31_0 = TerrainMap.field_e;
            return stackIn_31_0;
          }
          String stackIn_29_0 = IntrusiveDeque.field_b;
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_36_0 = var3;
          StringBuilder stackIn_36_1 = new StringBuilder().append("nk.L(").append(guard).append(',');
          if (text == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

    final static void releaseLoadingScreenResources(int guard) {
        if (guard != -8055) {
          field_n = -37;
          ImageProducerRasterBuffer.field_l = null;
          UiContainer.field_z = null;
          return;
        }
        ImageProducerRasterBuffer.field_l = null;
        UiContainer.field_z = null;
    }

    private final boolean containsEmailPortion(byte guard, String password) {
        String stackIn_19_2 = null;
        try {
          if (guard != 53) {
            field_s = (String) null;
          }
          String var3 = this.emailField.text.toLowerCase();
          String var4 = password.toLowerCase();
          if (var3.length() > 0) {
            if (0 >= var4.length()) {
              return false;
            }
            int var5 = var3.lastIndexOf("@");
            if (var5 >= 0 &&
              var5 < var3.length() - 1) {
              String var6 = var3.substring(0, var5);
              String var7 = var3.substring(1 + var5);
              if (0 > var4.indexOf(var6)) {
                boolean stackIn_13_0 = (0 <= var4.indexOf(var7));
                return stackIn_13_0;
              }
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_18_0 = var3_ref;
          StringBuilder stackIn_18_1 = new StringBuilder().append("nk.H(").append(guard).append(',');
          if (password == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static int buttonSoundPan(int guard, LegacyButton button) {
        String stackIn_10_2 = null;
        try {
          if (button == null) {
            int stackIn_2_0 = 8192;
            return stackIn_2_0;
          }
          int var2_int = button.x + button.width / 2;
          if (guard >= -83) {
            field_p = (ResourceArchive) null;
          }
          int stackIn_6_0 = var2_int * 16384 / 640;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var2;
          StringBuilder stackIn_9_1 = new StringBuilder().append("nk.I(").append(guard).append(',');
          if (button == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final ValidationState validateText(int guard, String text) {
        String stackIn_13_2 = null;
        try {
          String var3 = this.identifierField.text.toLowerCase();
          String var4 = text.toLowerCase();
          if (guard == ~var4.length()) {
            ValidationState stackIn_2_0 = ArchiveProvider.field_a;
            return stackIn_2_0;
          }
          if (!DelegatingCanvas.isPasswordAcceptable(var4, false, var3)) {
            ValidationState stackIn_5_0 = ArchiveProvider.field_a;
            return stackIn_5_0;
          }
          if (!this.containsEmailPortion((byte) 53, text)) {
            return IsaacRandom.field_h;
          }
          ValidationState stackIn_9_0 = ArchiveProvider.field_a;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var3_ref;
          StringBuilder stackIn_12_1 = new StringBuilder().append("nk.G(").append(guard).append(',');
          if (text == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static int modeSessionOption(int guard, int mode) {
        if (!AchievementRecord.isModeAvailable(mode, -102)) {
          return 1;
        }
        if (guard == 1) {
          return SavedDataQuerySupport.modeSessionOptions[mode];
        }
        field_p = (ResourceArchive) null;
        return SavedDataQuerySupport.modeSessionOptions[mode];
    }

    public static void releaseStatics(int guard) {
        field_p = null;
        if (guard != 29779) {
          field_s = (String) null;
          field_s = null;
          field_r = null;
          return;
        }
        field_s = null;
        field_r = null;
    }

    final static void setSessionAchievementBit(int bit, int guard) {
        if (null != SocketJs5Transport.field_r) {
          SocketJs5Transport.field_r.setAchievementBit(bit, 3748);
        }
        if (guard > -121) {
          PasswordValidator.modeSessionOption(-97, -50);
          return;
        }
    }

    PasswordValidator(EditableTextWidget field, EditableTextWidget identifierField, EditableTextWidget emailField) {
        super(field);
        try {
          this.identifierField = identifierField;
          this.emailField = emailField;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "nk.<init>(" + (field != null ? "{...}" : "null") + ',' + (identifierField != null ? "{...}" : "null") + ',' + (emailField != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_r = "You are not currently logged in to the<nbsp>game.";
        field_s = "Show elapsed time: ";
    }
}
