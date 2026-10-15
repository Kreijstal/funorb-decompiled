/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MatchingTextValidator extends TextFieldValidator {
    static String field_l;
    static boolean field_k;
    static boolean field_n;
    static java.awt.Frame field_o;
    static int heldButton;
    static String field_p;
    private TextFieldWidget matchingField;

    final static void e(byte param0) {
        String var1 = null;
        String var1Lifetime1;
        if (!NanoGameClock.field_l) {
          throw new IllegalStateException();
        }
        if (param0 >= -34) {
          return;
        }
        if (null == StrongCacheEntry.field_I) {
          var1 = PlayerInputBatch.a(-123);
          DirectByteStorage.field_k = new LoginPanel(var1, (String) null, true, false, false);
          ResourceArchive.field_f.pushLayer(-126, rj.accountContentLayer);
          rj.accountContentLayer.transitionToContent((byte) 108, DirectByteStorage.field_k);
          rj.accountContentLayer.finishTransition(20);
          return;
        }
        StrongCacheEntry.field_I.closeDialog(17);
        var1Lifetime1 = PlayerInputBatch.a(-123);
        DirectByteStorage.field_k = new LoginPanel(var1Lifetime1, (String) null, true, false, false);
        ResourceArchive.field_f.pushLayer(-126, rj.accountContentLayer);
        rj.accountContentLayer.transitionToContent((byte) 108, DirectByteStorage.field_k);
        rj.accountContentLayer.finishTransition(20);
    }

    final String describeTextValidation(int obfuscationGuard, String text) {
        ValidationSource sourceValidation = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.matchingField instanceof ValidatableWidget) {
            sourceValidation = ((ValidatableWidget) ((Object) this.matchingField)).getValidationSource(-11011);
            if (sourceValidation != null) {
              if (sourceValidation.getValidationStatus((byte) -31) == DualLinkIterator.validationValid &&
                !text.equals(this.matchingField.text)) {
                stackIn_6_0 = AccountContentTransitionLayer.field_sb;
                return stackIn_6_0;
              }
              stackIn_8_0 = sourceValidation.getValidationMessage(45);
              return stackIn_8_0;
            }
          }
          var3_int = 55 % ((-16 - obfuscationGuard) / 50);
          if (text.equals(this.matchingField.text)) {
            return null;
          }
          stackIn_12_0 = AccountContentTransitionLayer.field_sb;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("cb.C(").append(obfuscationGuard).append(',');
          if (text == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void f(int param0) {
        field_o = null;
        int var1 = 55 / ((58 - param0) / 54);
        field_p = null;
        field_l = null;
    }

    final static void b(boolean param0) {
        TextFieldValidator.outgoingPackets.writeCipheredOpcode(-13413, 9);
        RadialSelectorWidget.field_L = param0 ? true : false;
    }

    final ValidationStatus validateText(String text, byte obfuscationGuard) {
        ValidationSource sourceValidation = null;
        RuntimeException var3_ref = null;
        ValidationStatus stackIn_7_0 = null;
        ValidationStatus stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != 106) {
            field_k = false;
          }
          if (this.matchingField instanceof ValidatableWidget) {
            sourceValidation = ((ValidatableWidget) ((Object) this.matchingField)).getValidationSource(obfuscationGuard - 11117);
            if (sourceValidation != null &&
              sourceValidation.getValidationStatus((byte) -31) != DualLinkIterator.validationValid) {
              stackIn_7_0 = AccountMessageDialog.validationInvalid;
              return stackIn_7_0;
            }
          }
          if (text.equals(this.matchingField.text)) {
            stackIn_11_0 = DualLinkIterator.validationValid;
          } else {
            stackIn_11_0 = AccountMessageDialog.validationInvalid;
          }
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("cb.B(");
          if (text == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    MatchingTextValidator(TextFieldWidget textField, TextFieldWidget matchingField) {
        super(textField);
        try {
          this.matchingField = matchingField;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "cb.<init>(" + (textField != null ? "{...}" : "null") + ',' + (matchingField != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean e(int param0) {
        if (param0 >= -90) {
          return false;
        }
        if (!MatchResultScreen.field_s) {
          return false;
        }
        if (ng.quickChatChannel == 0) {
          return true;
        }
        return false;
    }

    final static void a(java.applet.Applet param0, int param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        try {
          StateIconLabel.field_Sb = true;
          if (param1 != 9) {
            MatchingTextValidator.f(-31);
          }
          var2 = "tuhstatbut";
          var3 = "rvnadlm";
          var4 = -1L;
          ChatLobbyUiHelpers.setAppletCookie(param0, (byte) 117, var3, var2, var4);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "cb.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_l = "Searching for an opponent";
        field_k = false;
        heldButton = 0;
        field_p = "To Customer Support";
    }
}
