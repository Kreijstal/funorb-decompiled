/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UsernameAvailabilityValidator extends TextFieldValidator {
    private String checkedUsername;
    static long field_l;
    static String field_m;
    private boolean usernameAvailable;

    final static void f(byte param0) {
        int var1 = 50 / ((31 - param0) / 52);
        LevelCompleteScreen.field_J = null;
        ResourceArchiveFactory.field_e = 0;
        QuickChatParameterType.field_h = false;
        b.field_a = -1;
        CappedUrlRequest.field_j = -1;
    }

    final static void e(int param0) {
        RgbSprite var1 = null;
        RgbSprite var3 = null;
        int var4 = 0;
        int var5 = BrickABrac.field_J ? 1 : 0;
        try {
          var1 = new RgbSprite(540, 140);
          int var2 = 5 / ((16 - param0) / 50);
          IndexedSpriteGeometry.pushSpriteRaster(-89, var1);
          MeshRasterState.syncRasterClip();
          Rasterizer2D.clear();
          MatchResultScreen.logoAnimationTicks = 0;
          LogoRenderHelpers.drawLogoPieces(-115);
          var3 = var1.copy();
          for (var4 = 0; 15 > var4; var4++) {
            var3.d(-2, -2, 16777215);
            Rasterizer2D.e(4, 4, 0, 0, 540, 140);
          }
          aa.field_b.bindRasterTarget();
          var1.a(0, 0);
          sc.popRaster(-123);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "fl.Q(" + param0 + ')');
        }
    }

    final String describeTextValidation(int obfuscationGuard, String text) {
        String var3 = null;
        RuntimeException var3_ref = null;
        AccountResponse var4_ref_oh = null;
        int var4 = 0;
        CharSequence var5 = null;
        String stackIn_3_0 = null;
        Object stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = (CharSequence) ((Object) text);
          var3 = QuickChatParameterType.a(var5, -106);
          if (var3 != null) {
            stackIn_3_0 = var3;
            return stackIn_3_0;
          }
          if (!text.equals(this.checkedUsername)) {
            var4_ref_oh = GameplayAudioEvent.pollUsernameAvailability(text, 0);
            if (var4_ref_oh == null) {
              return null;
            }
            if (null != var4_ref_oh.message) {
              stackIn_9_0 = null;
              return (String) (stackIn_9_0);
            }
            this.usernameAvailable = var4_ref_oh.success;
            this.checkedUsername = text;
          }
          if (!this.usernameAvailable) {
            stackIn_13_0 = ScreenNavigationHelpers.field_f;
            return stackIn_13_0;
          }
          var4 = 21 / ((-16 - obfuscationGuard) / 50);
          stackIn_15_0 = MouseWheelSource.field_d;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("fl.C(").append(obfuscationGuard).append(',');
          if (text == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static void b(boolean param0) {
        if (!param0) {
          UsernameAvailabilityValidator.f((byte) -72);
          OptionsScreen.field_A.setLength(0);
          ScreenNavigationHelpers.quickChatChannel = 0;
          return;
        }
        OptionsScreen.field_A.setLength(0);
        ScreenNavigationHelpers.quickChatChannel = 0;
    }

    UsernameAvailabilityValidator(TextFieldWidget textField) {
        super(textField);
        this.usernameAvailable = false;
    }

    public static void f(int param0) {
        if (param0 >= -35) {
          field_l = 72L;
          field_m = null;
          return;
        }
        field_m = null;
    }

    final ValidationStatus validateText(String text, byte obfuscationGuard) {
        AccountResponse var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        ValidationStatus stackIn_4_0 = null;
        ValidationStatus stackIn_11_0 = null;
        ValidationStatus stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != 106) {
            UsernameAvailabilityValidator.f((byte) -106);
          }
          var4 = (CharSequence) ((Object) text);
          if (!ByteArrayNode.a(17165, var4)) {
            stackIn_4_0 = AccountMessageDialog.validationInvalid;
            return stackIn_4_0;
          }
          if (!text.equals(this.checkedUsername)) {
            var3 = GameplayAudioEvent.pollUsernameAvailability(text, 0);
            if (var3 != null &&
              var3.message == null) {
              this.checkedUsername = text;
              this.usernameAvailable = var3.success;
            } else {
              stackIn_11_0 = SaveResultsPromptScreen.validationPending;
              return stackIn_11_0;
            }
          }
          if (!this.usernameAvailable) {
            stackIn_16_0 = AccountMessageDialog.validationInvalid;
          } else {
            stackIn_16_0 = DualLinkIterator.validationValid;
          }
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("fl.B(");
          if (text == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static int parseDecimalInt(CharSequence text, int obfuscationGuard) {
        RuntimeException failure = null;
        int parsedValue = 0;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String textSummary = null;
        RuntimeException caughtFailure = null;
        try {
          if (obfuscationGuard != -28734) {
            field_m = (String) null;
          }
          parsedValue = IntegerParsingHelpers.parseAsciiInt((byte) -32, 10, true, text);
          return parsedValue;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("fl.A(");
          if (text == null) {
            textSummary = "null";
          } else {
            textSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(textSummary).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void clearAvailabilityCache(byte obfuscationGuard) {
        this.checkedUsername = null;
        if (obfuscationGuard != -22) {
          this.clearAvailabilityCache((byte) -82);
        }
    }

    static {
        field_m = "Orb coins: ";
    }
}
