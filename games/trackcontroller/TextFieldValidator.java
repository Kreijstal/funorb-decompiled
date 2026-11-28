/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TextFieldValidator extends DebouncedFieldValidator implements TextFieldListener {
    static int field_i;
    private EditableTextField field_k;
    static String field_l;
    static String field_j;
    static int field_h;

    final String evaluateValidationMessage(byte param0) {
        if (param0 != 22) {
          return (String) null;
        }
        return this.getValidationMessage(this.field_k.field_s, 426);
    }

    public final boolean hasMissingInput(int param0) {
        if (param0 != 24685) {
          this.evaluateValidationMessage((byte) 69);
          if (this.field_k.field_s != null) {
            return this.field_k.field_s.length() == 0 ? true : false;
          }
          return true;
        }
        if (this.field_k.field_s == null) {
          return true;
        }
        if (this.field_k.field_s.length() != 0) {
          return false;
        }
        return true;
    }

    final ud evaluateValidationStatus(int param0) {
        int var2 = -119 / ((-30 - param0) / 56);
        return this.getValidationStatus(-120, this.field_k.field_s);
    }

    public final void onTextChanged(int param0, EditableTextField param1) {
        try {
          this.recordInputChange(52);
          if (param0 != -12230) {
            this.hasMissingInput(30);
          }
        } catch (RuntimeException runtimeException) {
          throw LevelGrid.toClientException((Throwable) ((Object) runtimeException), "di.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    abstract String getValidationMessage(String param0, int param1);

    public final void onTextSubmitted(int param0, EditableTextField param1) {
        try {
          if (param0 >= -23) {
            TextFieldValidator.clearStaticReferences((byte) -43);
          }
        } catch (RuntimeException runtimeException) {
          throw LevelGrid.toClientException((Throwable) ((Object) runtimeException), "di.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    TextFieldValidator(EditableTextField param0) {
        try {
          this.field_k = param0;
        } catch (RuntimeException runtimeException) {
          throw LevelGrid.toClientException((Throwable) ((Object) runtimeException), "di.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearStaticReferences(byte param0) {
        field_l = null;
        if (param0 != 73) {
          return;
        }
        field_j = null;
    }

    abstract ud getValidationStatus(int param0, String param1);

    static {
        field_l = "Orb coins: <%0>";
        field_j = "Age:";
    }
}
