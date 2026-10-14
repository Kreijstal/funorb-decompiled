/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EmailValidator extends TextFieldValidator {
    static AudioMixer field_l;
    static String field_m;
    static String field_k;
    static int field_n;

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
          po.pointerY = WidgetTextLayout.livePointerY;
          QuickChatHelpDialog.pointerChanged = kn.livePointerChanged;
          kn.livePointerChanged = false;
          BackgroundScene.pressedButton = ContentTransitionPhase.livePressedButton;
          tb.pressX = SoundPlayback.livePressX;
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
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        ValidationStatus stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != 106) {
            field_n = 85;
          }
          stackIn_5_0 = (null != WidgetLayerStack.a(text, (byte) -24)) ? 0 : 1;
          var3_int = stackIn_5_0;
          if (var3_int != 0) {
            return DualLinkIterator.validationValid;
          }
          stackIn_8_0 = AccountMessageDialog.validationInvalid;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("sg.B(");
          if (text == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final String describeTextValidation(int obfuscationGuard, String text) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.validateText(text, (byte) 106) == AccountMessageDialog.validationInvalid) {
            stackIn_3_0 = ValidationIconWidget.field_O;
            return stackIn_3_0;
          }
          var3_int = -38 % ((obfuscationGuard + 16) / 50);
          stackIn_5_0 = WeightedLruCache.field_l;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("sg.C(").append(obfuscationGuard).append(',');
          if (text == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    static {
        field_m = "Loading music";
        field_k = "Sorry, you were removed from the game you were in. This can happen if you are disconnected for too long or if the server is updated.";
        field_n = field_n | 2;
        field_n = field_n | 524288;
        field_n = field_n | 1048576;
        field_n = field_n | 33554432;
        field_n = field_n | 67108864;
        field_n = field_n | 268435456;
        field_n = field_n | 2097152;
        field_n = field_n | 4194304;
    }
}
