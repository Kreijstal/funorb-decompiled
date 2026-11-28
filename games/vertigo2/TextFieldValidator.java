/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TextFieldValidator extends DebouncedFieldValidator implements TextFieldListener {
    static int[] field_k;
    private EditableTextField field_h;
    static int field_j;
    static int field_i;

    public final boolean hasMissingInput(int param0) {
        if (param0 != -12211) {
          field_j = -18;
          if (this.field_h.text != null) {
            return this.field_h.text.length() == 0 ? true : false;
          }
          return true;
        }
        if (this.field_h.text == null) {
          return true;
        }
        if (this.field_h.text.length() != 0) {
          return false;
        }
        return true;
    }

    public static void clearDeclaredStaticReferences(byte param0) {
        if (param0 >= -97) {
          TextFieldValidator.clearDeclaredStaticReferences((byte) -31);
          field_k = null;
          return;
        }
        field_k = null;
    }

    abstract String getValidationMessage(int param0, String param1);

    final ba evaluateValidationStatus(byte param0) {
        if (param0 > 24) {
          return this.getValidationStatus(-1, this.field_h.text);
        }
        field_i = 123;
        return this.getValidationStatus(-1, this.field_h.text);
    }

    TextFieldValidator(EditableTextField param0) {
        try {
          this.field_h = param0;
        } catch (RuntimeException runtimeException) {
          throw wn.wrapClientException((Throwable) ((Object) runtimeException), "da.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void onTextSubmitted(byte param0, EditableTextField param1) {
        try {
          if (param0 < 16) {
            String var4 = (String) null;
            this.getValidationMessage(-114, (String) null);
          }
        } catch (RuntimeException runtimeException) {
          throw wn.wrapClientException((Throwable) ((Object) runtimeException), "da.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String evaluateValidationMessage(int param0) {
        if (param0 < -68) {
          return this.getValidationMessage(3614, this.field_h.text);
        }
        this.evaluateValidationMessage(-53);
        return this.getValidationMessage(3614, this.field_h.text);
    }

    public final void onTextChanged(int param0, EditableTextField param1) {
        EditableTextField var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 >= -10) {
            var4 = (EditableTextField) null;
            this.onTextSubmitted((byte) -106, (EditableTextField) null);
            this.recordInputChange(18340);
          } else {
            this.recordInputChange(18340);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("da.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wn.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    abstract ba getValidationStatus(int param0, String param1);

    static {
    }
}
