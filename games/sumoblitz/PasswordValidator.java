/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PasswordValidator extends TextInputValidator {
    private TextInputWidget emailInput;
    static ToolkitSprite[] field_j;
    static SpriteData field_i;
    static PrimitiveType LINES;
    private TextInputWidget screenNameInput;
    static String field_f;

    final String messageForText(int guard, String text) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        String var5 = null;
        Object stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        String stackIn_14_0 = null;
        String stackIn_19_0 = null;
        String stackIn_22_0 = null;
        String stackIn_26_0 = null;
        String stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.screenNameInput.text.toLowerCase();
          var4 = text.toLowerCase();
          if (guard == var4.length()) {
            stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          var5 = var4;
          if (ArrayWidgetContainer.a(var5, 30996)) {
            stackIn_5_0 = ArchiveIndex.passwordsMustBeBetweenText;
            return stackIn_5_0;
          }
          if (AsciiCharacterChecks.containsNonAlphanumeric(false, var5)) {
            stackIn_8_0 = ContentTransitionDialog.passwordsCanOnlyContainText;
            return stackIn_8_0;
          }
          if (LegacyOpenGlCubeTexture.hasUniformCharacters(var5, true)) {
            stackIn_11_0 = ScrollPane.thisPasswordContainsRepeatedText;
            return stackIn_11_0;
          }
          if (this.containsEmailParts(-53, text)) {
            stackIn_14_0 = pc.thisPasswordContainsYourText;
            return stackIn_14_0;
          }
          if (var3.length() <= 0) {
            stackIn_28_0 = ka.passwordIsValidText;
            return stackIn_28_0;
          }
          if (MessageDialog.a(var5, var3, 82)) {
            stackIn_19_0 = ValidationStatusWidget.thisPasswordContainsYourText;
            return stackIn_19_0;
          }
          if (CachedTextLayout.a(var5, (byte) 114, var3)) {
            stackIn_22_0 = AccountRequestState.thisPasswordIsPartText;
            return stackIn_22_0;
          }
          if (!AccountNameSupport.containsNameIgnoringUnderscores(false, var5, var3)) {
            return ArchiveIndex.passwordsMustBeBetweenText;
          }
          stackIn_26_0 = ValidationStatusWidget.thisPasswordContainsYourText;
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_31_0 = var3_ref;
          stackIn_31_1 = new StringBuilder().append("tc.B(").append(guard).append(',');
          if (text == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final ValidationStatus validateText(byte guard, String text) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        ValidationStatus stackIn_2_0 = null;
        ValidationStatus stackIn_6_0 = null;
        ValidationStatus stackIn_9_0 = null;
        ValidationStatus stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.screenNameInput.text.toLowerCase();
          var4 = text.toLowerCase();
          if (var4.length() == 0) {
            stackIn_2_0 = AccountConnectionPhase.INVALID;
            return stackIn_2_0;
          }
          if (!ByteArrayCacheNode.a(var4, var3, -83)) {
            stackIn_6_0 = AccountConnectionPhase.INVALID;
            return stackIn_6_0;
          }
          if (this.containsEmailParts(98, text)) {
            stackIn_9_0 = AccountConnectionPhase.INVALID;
            return stackIn_9_0;
          }
          if (guard != 26) {
            field_j = (ToolkitSprite[]) null;
          }
          stackIn_13_0 = PerlinNoiseFactory.VALID;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("tc.E(").append(guard).append(',');
          if (text == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final boolean containsEmailParts(int guard, String password) {
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = this.emailInput.text.toLowerCase();
          var4 = password.toLowerCase();
          var5 = -109 % ((10 - guard) / 60);
          if (0 < var9.length() &&
            var4.length() > 0) {
            var6 = var9.lastIndexOf("@");
            if (var6 >= 0 &&
              var9.length() - 1 > var6) {
              var7 = var9.substring(0, var6);
              var8 = var9.substring(var6 + 1);
              if (var4.indexOf(var7) >= 0) {
                return true;
              }
              if (var4.indexOf(var8) < 0) {
                return false;
              }
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("tc.D(").append(guard).append(',');
          if (password == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void e(int param0) {
        FontMetrics.field_b = 0;
        DisplayModeConfirmationDialog.droneTypeStreakMask = -1;
        ValidationMessageWidget.field_P = false;
        BigBurstaProgress.bigDefeatBalance = 0;
        if (param0 >= 85) {
          DroneChargeParticle.field_w = false;
          ArenaBackdropPalettes.uniqueDroneTypeStreak = 0;
          EmailSyntaxValidator.field_e = 0;
          LegacyOpenGlNormalMapGenerator.field_c = false;
          SecondaryNodeDeque.field_e = false;
          RotarySelectorWidget.field_E = false;
          MatchingTextValidator.field_i = 0;
          return;
        }
    }

    public static void releaseStatics(int param0) {
        field_i = null;
        field_j = null;
        if (param0 != -1) {
          return;
        }
        LINES = null;
        field_f = null;
    }

    PasswordValidator(TextInputWidget field, TextInputWidget nameField, TextInputWidget mailField) {
        super(field);
        try {
          this.emailInput = mailField;
          this.screenNameInput = nameField;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "tc.<init>(" + (field != null ? "{...}" : "null") + ',' + (nameField != null ? "{...}" : "null") + ',' + (mailField != null ? "{...}" : "null") + ')');
        }
    }

    static {
        LINES = new PrimitiveType();
    }
}
