/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TextFieldValidator extends DebouncedInputValidator implements UiTextFieldListener {
    static int field_e;
    static String field_d;
    private UiTextField textField;

    final String getCurrentValidationMessage(int param0) {
        if (param0 == 16384) {
          return this.getValueValidationMessage(this.textField.text, -1);
        }
        String var3 = (String) null;
        this.validateValue((String) null, -101);
        return this.getValueValidationMessage(this.textField.text, -1);
    }

    final ValidationState validateCurrentValue(int param0) {
        if (param0 == -1) {
          return this.validateValue(this.textField.text, 16384);
        }
        field_d = (String) null;
        return this.validateValue(this.textField.text, 16384);
    }

    public final void onTextChanged(UiTextField param0, byte param1) {
        if (param1 != 100) {
          return;
        }
        try {
          this.markChanged(20);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "eca.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean isEmpty(byte param0) {
        if (param0 > -100) {
          this.textField = (UiTextField) null;
          if (this.textField.text != null) {
            return this.textField.text.length() == 0 ? true : false;
          }
          return true;
        }
        if (this.textField.text == null) {
          return true;
        }
        if (this.textField.text.length() != 0) {
          return false;
        }
        return true;
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != -27183) {
          field_d = (String) null;
          field_d = null;
          return;
        }
        field_d = null;
    }

    public final void onSubmitted(int param0, UiTextField param1) {
        try {
          if (param0 != -12409) {
            UiTextField var4 = (UiTextField) null;
            this.onTextChanged((UiTextField) null, (byte) 43);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "eca.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    TextFieldValidator(UiTextField param0) {
        try {
          this.textField = param0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "eca.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    abstract ValidationState validateValue(String param0, int param1);

    abstract String getValueValidationMessage(String param0, int param1);

    static {
        field_d = "Halve custom variables";
        field_e = 16384;
    }
}
