/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EmailValidator extends TextFieldValidator {
    static AudioMixer field_l;
    static String field_m;
    static String field_k;
    static int alwaysSolidBrickTypeMask;

    EmailValidator(TextFieldWidget textField) {
        super(textField);
    }

    final static void snapshotMouseInput(int obfuscationGuard) {
        int var2 = 0;
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        var1 = PowerUpWarning.mouseInput;
        synchronized (var1) {
          MatchingTextValidator.heldButton = QuickChatHelpDialog.liveHeldButton;
          gr.pointerIdleTicks = gr.pointerIdleTicks + 1;
          MusicPatch.pointerX = DirectByteStorage.livePointerX;
          ResourcePreparationEntry.pointerY = WidgetTextLayout.livePointerY;
          QuickChatHelpDialog.pointerChanged = QuickChatCategoryDefinition.livePointerChanged;
          QuickChatCategoryDefinition.livePointerChanged = false;
          BackgroundScene.pressedButton = ContentTransitionPhase.livePressedButton;
          LoadingProgressDialog.pressX = SoundPlayback.livePressX;
          PlayerNameChooserPanel.pressY = va.livePressY;
          ContentTransitionPhase.livePressedButton = 0;
          var2 = 54 / ((obfuscationGuard + 49) / 63);
        }
    }

    public static void e(byte param0) {
        field_l = null;
        field_m = null;
        if (param0 <= 122) {
          EmailValidator.snapshotMouseInput(23);
          field_k = null;
          return;
        }
        field_k = null;
    }

    final ValidationStatus validateText(String text, byte obfuscationGuard) {
        int validFlag = 0;
        RuntimeException failure = null;
        int validationFlag = 0;
        ValidationStatus invalidStatus = null;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String textSummary = null;
        RuntimeException caughtFailure = null;
        try {
          if (obfuscationGuard != 106) {
            alwaysSolidBrickTypeMask = 85;
          }
          validationFlag = (null != WidgetLayerStack.validateLegacyEmailAddress(text, (byte) -24)) ? 0 : 1;
          validFlag = validationFlag;
          if (validFlag != 0) {
            return DualLinkIterator.validationValid;
          }
          invalidStatus = AccountMessageDialog.validationInvalid;
          return invalidStatus;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("sg.B(");
          if (text == null) {
            textSummary = "null";
          } else {
            textSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(textSummary).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final String describeTextValidation(int obfuscationGuard, String text) {
        int guardCalculation = 0;
        RuntimeException failure = null;
        String invalidMessage = null;
        String validMessage = null;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String textSummary = null;
        RuntimeException caughtFailure = null;
        try {
          if (this.validateText(text, (byte) 106) == AccountMessageDialog.validationInvalid) {
            invalidMessage = ValidationIconWidget.invalidEmailMessage;
            return invalidMessage;
          }
          guardCalculation = -38 % ((obfuscationGuard + 16) / 50);
          validMessage = WeightedLruCache.validEmailMessage;
          return validMessage;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("sg.C(").append(obfuscationGuard).append(',');
          if (text == null) {
            textSummary = "null";
          } else {
            textSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(textSummary).append(')').toString());
        }
    }

    static {
        field_m = "Loading music";
        field_k = "Sorry, you were removed from the game you were in. This can happen if you are disconnected for too long or if the server is updated.";
        alwaysSolidBrickTypeMask = alwaysSolidBrickTypeMask | 2;
        alwaysSolidBrickTypeMask = alwaysSolidBrickTypeMask | 524288;
        alwaysSolidBrickTypeMask = alwaysSolidBrickTypeMask | 1048576;
        alwaysSolidBrickTypeMask = alwaysSolidBrickTypeMask | 33554432;
        alwaysSolidBrickTypeMask = alwaysSolidBrickTypeMask | 67108864;
        alwaysSolidBrickTypeMask = alwaysSolidBrickTypeMask | 268435456;
        alwaysSolidBrickTypeMask = alwaysSolidBrickTypeMask | 2097152;
        alwaysSolidBrickTypeMask = alwaysSolidBrickTypeMask | 4194304;
    }
}
