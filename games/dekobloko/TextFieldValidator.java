/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TextFieldValidator extends DebouncedFieldValidator implements TextFieldListener {
    private EditableTextField uiComponentPart028State0009;
    static int integerState0937;
    static RgbSprite rgbSpriteState0076;
    static String stringState0633;
    static RgbSprite rgbSpriteState0077;
    static String stringState0634;
    static String stringState0635;
    static String stringState0636;
    static SceneWidget sceneWidgetState0151;

    abstract ValidationStatus getValidationStatus(String stringArgument1, byte byteArgument2);

    final String evaluateValidationMessage(byte byteArgument1) {
        if (byteArgument1 > 2) {
          return this.getValidationMessage(this.uiComponentPart028State0009.stringState0078, (byte) -11);
        }
        rgbSpriteState0076 = (RgbSprite) null;
        return this.getValidationMessage(this.uiComponentPart028State0009.stringState0078, (byte) -11);
    }

    final static void performAction1828(int integerArgument1) {
        MixedSupport089.stringState0372 = UiComponentPart006.cipherPacketBufferState0001.readNullTerminatedString((byte) -38);
        CharSequence charSequenceLocal1 = (CharSequence) ((Object) MixedSupport089.stringState0372);
        MixedSupport051.stringState0212 = ComponentContainer.computeString0894(charSequenceLocal1, (byte) 2);
        if (integerArgument1 != 140) {
          TextFieldValidator.computeContainer1829((byte) 98);
        }
    }

    final ValidationStatus evaluateValidationStatus(int integerArgument1) {
        if (integerArgument1 == -5520) {
          return this.getValidationStatus(this.uiComponentPart028State0009.stringState0078, (byte) -40);
        }
        this.uiComponentPart028State0009 = (EditableTextField) null;
        return this.getValidationStatus(this.uiComponentPart028State0009.stringState0078, (byte) -40);
    }

    abstract String getValidationMessage(String stringArgument1, byte byteArgument2);

    public final void onTextChanged(int integerArgument1, EditableTextField uiComponentPart028Argument2) {
        if (integerArgument1 != 16737894) {
          return;
        }
        try {
          this.recordInputChange((byte) -51);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "wm.N(" + integerArgument1 + ',' + (uiComponentPart028Argument2 != null ? "{...}" : "null") + ')');
        }
    }

    final static java.awt.Container computeContainer1829(byte byteArgument1) {
        if (MixedSupport054.frameState0001 != null) {
          return (java.awt.Container) ((Object) MixedSupport054.frameState0001);
        }
        if (byteArgument1 <= 123) {
          TextFieldValidator.performAction1828(74);
          return (java.awt.Container) ((Object) UiComponentPart029.computeApplet1485(25144));
        }
        return (java.awt.Container) ((Object) UiComponentPart029.computeApplet1485(25144));
    }

    public final void onTextSubmitted(int integerArgument1, EditableTextField uiComponentPart028Argument2) {
        try {
          if (integerArgument1 != -2569) {
            rgbSpriteState0076 = (RgbSprite) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "wm.K(" + integerArgument1 + ',' + (uiComponentPart028Argument2 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean hasMissingInput(byte byteArgument1) {
        int integerLocal1 = 112 / ((byteArgument1 - 72) / 40);
        if (null == this.uiComponentPart028State0009.stringState0078) {
          return true;
        }
        if (0 != this.uiComponentPart028State0009.stringState0078.length()) {
          return false;
        }
        return true;
    }

    TextFieldValidator(EditableTextField uiComponentPart028Argument1) {
        try {
          this.uiComponentPart028State0009 = uiComponentPart028Argument1;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "wm.<init>(" + (uiComponentPart028Argument1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void performAction1827(int integerArgument1) {
        stringState0633 = null;
        sceneWidgetState0151 = null;
        stringState0636 = null;
        if (integerArgument1 == 18966) {
          rgbSpriteState0076 = null;
          rgbSpriteState0077 = null;
          stringState0635 = null;
          stringState0634 = null;
          return;
        }
        TextFieldValidator.computeContainer1829((byte) 42);
        rgbSpriteState0076 = null;
        rgbSpriteState0077 = null;
        stringState0635 = null;
        stringState0634 = null;
    }

    static {
        stringState0633 = "Please wait...";
        stringState0634 = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        rgbSpriteState0077 = new RgbSprite(540, 140);
        stringState0635 = "Chain Bonus: ";
        stringState0636 = "<%0> would need a rating of <%1> to play with the current options.";
    }
}
