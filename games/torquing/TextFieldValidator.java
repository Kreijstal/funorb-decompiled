/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TextFieldValidator extends DebouncedFieldValidator implements TextFieldListener {
    private EditableTextField field_i;
    static qd field_j;
    static int field_h;
    static int field_k;
    static int field_g;
    static long field_f;

    public final void onTextSubmitted(EditableTextField param0, byte param1) {
        try {
          if (param1 > -122) {
            EditableTextField var4 = (EditableTextField) null;
            this.onTextSubmitted((EditableTextField) null, (byte) 107);
          }
        } catch (RuntimeException runtimeException) {
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) runtimeException), "gf.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String evaluateValidationMessage(int param0) {
        if (param0 != 0) {
          return (String) null;
        }
        return this.getValidationMessage((byte) -121, this.field_i.text);
    }

    final cd evaluateValidationStatus(int param0) {
        if (param0 != 0) {
          return (cd) null;
        }
        return this.getValidationStatus(111, this.field_i.text);
    }

    TextFieldValidator(EditableTextField param0) {
        try {
          this.field_i = param0;
        } catch (RuntimeException runtimeException) {
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) runtimeException), "gf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void onTextChanged(int param0, EditableTextField param1) {
        try {
          this.recordInputChange(true);
          if (param0 < 3) {
            EditableTextField var4 = (EditableTextField) null;
            this.onTextSubmitted((EditableTextField) null, (byte) 9);
          }
        } catch (RuntimeException runtimeException) {
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) runtimeException), "gf.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    abstract String getValidationMessage(byte param0, String param1);

    public static void clearStaticReferences(int param0) {
        field_j = null;
        if (param0 != 0) {
          field_j = (qd) null;
        }
    }

    abstract cd getValidationStatus(int param0, String param1);

    public final boolean hasMissingInput(boolean param0) {
        if (!param0) {
          field_f = -87L;
          if (null != this.field_i.text) {
            return 0 == this.field_i.text.length() ? true : false;
          }
          return true;
        }
        if (null == this.field_i.text) {
          return true;
        }
        if (0 != this.field_i.text.length()) {
          return false;
        }
        return true;
    }

    static {
        field_j = new qd();
    }
}
