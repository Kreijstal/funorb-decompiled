/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PasswordValidator extends TextFieldValidator {
    private TextFieldWidget usernameField;
    private TextFieldWidget emailField;
    static String field_m;
    static UiComponent field_n;
    static RgbSprite[] field_l;
    static String field_q;
    static int[] field_o;

    public static void b(boolean param0) {
        if (!param0) {
          return;
        }
        field_o = null;
        field_l = null;
        field_q = null;
        field_n = null;
        field_m = null;
    }

    final static void e(byte param0) {
        if (param0 <= -77) {
          TextWidgetRenderer.field_e = false;
          PlayerNameChooserPanel.field_I = LogoRenderHelpers.incomingPackets.readUnsignedByte(255) == 0 ? true : false;
          return;
        }
        field_m = (String) null;
        TextWidgetRenderer.field_e = false;
        PlayerNameChooserPanel.field_I = LogoRenderHelpers.incomingPackets.readUnsignedByte(255) == 0 ? true : false;
    }

    private final boolean containsEmailPart(int obfuscationGuard, String password) {
        String normalizedEmail = null;
        RuntimeException var3_ref = null;
        String normalizedPassword = null;
        int atSignIndex = 0;
        String emailLocalPart = null;
        String emailDomain = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != 0) {
            PasswordValidator.b(true);
          }
          normalizedEmail = this.emailField.text.toLowerCase();
          normalizedPassword = password.toLowerCase();
          if (normalizedEmail.length() > 0 &&
            normalizedPassword.length() > 0) {
            atSignIndex = normalizedEmail.lastIndexOf("@");
            if (0 <= atSignIndex) {
              if (atSignIndex >= normalizedEmail.length() - 1) {
                return false;
              }
              emailLocalPart = normalizedEmail.substring(0, atSignIndex);
              emailDomain = normalizedEmail.substring(1 + atSignIndex);
              if (normalizedPassword.indexOf(emailLocalPart) >= 0) {
                return true;
              }
              if (normalizedPassword.indexOf(emailDomain) >= 0) {
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("g.F(").append(obfuscationGuard).append(',');
          if (password == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static void submitLevelResult(LevelResultSubmission result, int opcode, byte obfuscationGuard) {
        try {
          NinjaBackground.pendingLevelResults.addLast(result, (byte) 3);
          kp.sendLevelResult(opcode, (byte) -99, result);
          int var3_int = -88 % ((obfuscationGuard + 37) / 48);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "g.D(" + (result != null ? "{...}" : "null") + ',' + opcode + ',' + obfuscationGuard + ')');
        }
    }

    final String describeTextValidation(int obfuscationGuard, String text) {
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_14_0 = null;
        String stackIn_18_0 = null;
        String stackIn_23_0 = null;
        String stackIn_27_0 = null;
        String stackIn_31_0 = null;
        String stackIn_33_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = this.usernameField.text.toLowerCase();
          var4 = text.toLowerCase();
          var5 = -62 % ((-16 - obfuscationGuard) / 50);
          if (var4.length() == 0) {
            return null;
          }
          var6 = var4;
          if (pp.hasInvalidPasswordLength(var6, true)) {
            stackIn_6_0 = sc.field_a;
            return stackIn_6_0;
          }
          if (MatchCompleteScreen.containsNonAlphanumeric(var6, 0)) {
            stackIn_10_0 = HuffmanCodec.field_c;
            return stackIn_10_0;
          }
          if (DualLinkDeque.consistsOfRepeatedCharacter((byte) 65, var6)) {
            stackIn_14_0 = WhirlpoolHasher.field_i;
            return stackIn_14_0;
          }
          if (this.containsEmailPart(0, text)) {
            stackIn_18_0 = StateIconLabel.field_Tb;
            return stackIn_18_0;
          }
          if (var7.length() <= 0) {
            stackIn_33_0 = SoundPlayback.field_k;
            return stackIn_33_0;
          }
          if (MenuButton.a(var6, 0, var7)) {
            stackIn_23_0 = BackgroundRegistry.field_b;
            return stackIn_23_0;
          }
          if (ll.a(var6, (byte) 125, var7)) {
            stackIn_27_0 = GameUiController.field_f;
            return stackIn_27_0;
          }
          if (!WidgetTextLayout.a(var6, (byte) 73, var7)) {
            return sc.field_a;
          }
          stackIn_31_0 = BackgroundRegistry.field_b;
          return stackIn_31_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_36_0 = var3;
          stackIn_36_1 = new StringBuilder().append("g.C(").append(obfuscationGuard).append(',');
          if (text == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

    PasswordValidator(TextFieldWidget textField, TextFieldWidget usernameField, TextFieldWidget emailField) {
        super(textField);
        try {
          this.usernameField = usernameField;
          this.emailField = emailField;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "g.<init>(" + (textField != null ? "{...}" : "null") + ',' + (usernameField != null ? "{...}" : "null") + ',' + (emailField != null ? "{...}" : "null") + ')');
        }
    }

    final ValidationStatus validateText(String text, byte obfuscationGuard) {
        String normalizedUsername = null;
        RuntimeException var3_ref = null;
        String normalizedPassword = null;
        ValidationStatus stackIn_4_0 = null;
        ValidationStatus stackIn_8_0 = null;
        ValidationStatus stackIn_11_0 = null;
        ValidationStatus stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != 106) {
            field_q = (String) null;
          }
          normalizedUsername = this.usernameField.text.toLowerCase();
          normalizedPassword = text.toLowerCase();
          if (0 == normalizedPassword.length()) {
            stackIn_4_0 = AccountMessageDialog.validationInvalid;
            return stackIn_4_0;
          }
          if (!MatchCompleteScreen.isAcceptablePassword((byte) -120, normalizedPassword, normalizedUsername)) {
            stackIn_8_0 = AccountMessageDialog.validationInvalid;
            return stackIn_8_0;
          }
          if (!this.containsEmailPart(0, text)) {
            stackIn_13_0 = DualLinkIterator.validationValid;
            return stackIn_13_0;
          }
          stackIn_11_0 = AccountMessageDialog.validationInvalid;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("g.B(");
          if (text == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        field_m = null;
        field_q = "Members";
        field_o = new int[]{0, 27, 1, 5, 32, 4, 3, 22, 19};
    }
}
