/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TextFieldValidator extends DebouncedFieldValidator implements TextFieldListener {
    static String field_k;
    private EditableTextField field_g;
    static String[] field_j;
    static int field_i;
    static int field_h;

    public final boolean hasMissingInput(int param0) {
        int var2 = 28 / ((-29 - param0) / 42);
        if (this.field_g.field_u == null) {
          return true;
        }
        if (0 != this.field_g.field_u.length()) {
          return false;
        }
        return true;
    }

    public final void onTextSubmitted(EditableTextField param0, boolean param1) {
        try {
          if (!param1) {
            field_h = -98;
          }
        } catch (RuntimeException runtimeException) {
          throw ValidationStatusIcon.wrapClientException((Throwable) ((Object) runtimeException), "tj.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final sc evaluateValidationStatus(boolean param0) {
        if (param0) {
          return this.getValidationStatus(0, this.field_g.field_u);
        }
        this.evaluateValidationMessage(-1);
        return this.getValidationStatus(0, this.field_g.field_u);
    }

    abstract String getValidationMessage(byte param0, String param1);

    final static void c(int param0) {
        if (param0 != 0) {
          return;
        }
        String var2 = (String) null;
        ValidatedTextField.a((byte) 41, (String) null, Lexicominos.field_H);
    }

    TextFieldValidator(EditableTextField param0) {
        try {
          this.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw ValidationStatusIcon.wrapClientException((Throwable) ((Object) runtimeException), "tj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void onTextChanged(byte param0, EditableTextField param1) {
        try {
          this.recordInputChange(true);
          if (param0 != 10) {
            TextFieldValidator.clearStaticReferences(95);
          }
        } catch (RuntimeException runtimeException) {
          throw ValidationStatusIcon.wrapClientException((Throwable) ((Object) runtimeException), "tj.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    abstract sc getValidationStatus(int param0, String param1);

    final String evaluateValidationMessage(int param0) {
        if (param0 > 21) {
          return this.getValidationMessage((byte) -126, this.field_g.field_u);
        }
        field_h = -22;
        return this.getValidationMessage((byte) -126, this.field_g.field_u);
    }

    public static void clearStaticReferences(int param0) {
        if (param0 != 0) {
          field_k = (String) null;
          field_j = null;
          field_k = null;
          return;
        }
        field_j = null;
        field_k = null;
    }

    static {
        field_k = "Mouse over an icon for details";
        field_j = new String[]{"Using the cursor keys, the 'SPACE' bar, 'Z', and 'X', move and rotate the falling blocks to make words both across and down.", "If you make more than one word with a block, you get a multiplier bonus."};
        field_i = 0;
        field_h = 0;
    }
}
