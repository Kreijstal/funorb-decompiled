/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TextFieldValidator extends DebouncedValidator implements EditableTextWidgetListener {
    private EditableTextWidget input;
    static String field_f;
    static String field_d;
    static int currentThemeId;
    static String field_i;
    static boolean field_h;

    public final boolean isInputEmpty(int obfuscationGuard) {
        if (obfuscationGuard < 12) {
          return true;
        }
        if (null == this.input.text) {
          return true;
        }
        if (this.input.text.length() != 0) {
          return false;
        }
        return true;
    }

    abstract ValidationState validateText(int obfuscationGuard, String text);

    public final void textChanged(EditableTextWidget widget, int obfuscationGuard) {
        try {
          this.validationChanged(126);
          int var3_int = 59 % ((-80 - obfuscationGuard) / 33);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "mk.FA(" + (widget != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    TextFieldValidator(EditableTextWidget input) {
        try {
          this.input = input;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "mk.<init>(" + (input != null ? "{...}" : "null") + ')');
        }
    }

    abstract String describeText(byte obfuscationGuard, String text);

    final String evaluateMessage(byte obfuscationGuard) {
        if (obfuscationGuard == -71) {
          return this.describeText((byte) 115, this.input.text);
        }
        field_h = false;
        return this.describeText((byte) 115, this.input.text);
    }

    final ValidationState evaluateState(int obfuscationGuard) {
        int guardQuotient = 85 / ((56 - obfuscationGuard) / 32);
        return this.validateText(-3137, this.input.text);
    }

    public final void textSubmitted(EditableTextWidget widget, int obfuscationGuard) {
        try {
          if (obfuscationGuard != 80) {
            field_i = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "mk.EA(" + (widget != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    public static void f(int param0) {
        field_d = null;
        if (param0 != -1) {
          field_i = (String) null;
          field_f = null;
          field_i = null;
          return;
        }
        field_f = null;
        field_i = null;
    }

    static {
        field_f = null;
        field_d = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
        currentThemeId = -1;
        field_i = "STRENGTH";
        field_h = true;
    }
}
