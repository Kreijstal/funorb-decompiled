/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TextFieldValidator extends DebouncedFieldValidator implements TextFieldListener {
    static long field_h;
    static String field_g;
    private EditableTextField field_i;

    public static void clearDeclaredStaticReferences(int param0) {
        field_g = null;
        if (param0 != 24562) {
          TextFieldValidator.clearDeclaredStaticReferences(52);
        }
    }

    public final boolean hasMissingInput(byte param0) {
        if (param0 > -8) {
          field_h = 36L;
          if (this.field_i.field_h != null) {
            return this.field_i.field_h.length() == 0 ? true : false;
          }
          return true;
        }
        if (this.field_i.field_h == null) {
          return true;
        }
        if (this.field_i.field_h.length() != 0) {
          return false;
        }
        return true;
    }

    public final void onTextSubmitted(byte param0, EditableTextField param1) {
        try {
          int var3_int = 79 % ((param0 - 0) / 33);
        } catch (RuntimeException runtimeException) {
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) runtimeException), "al.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void onTextChanged(EditableTextField param0, byte param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 <= 81) {
            this.evaluateValidationStatus(-77);
            this.recordInputChange((byte) 92);
          } else {
            this.recordInputChange((byte) 92);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("al.D(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    abstract String getValidationMessage(String param0, byte param1);

    final vf evaluateValidationStatus(int param0) {
        if (param0 == -1) {
          return this.getValidationStatus(this.field_i.field_h, (byte) 54);
        }
        field_h = 47L;
        return this.getValidationStatus(this.field_i.field_h, (byte) 54);
    }

    abstract vf getValidationStatus(String param0, byte param1);

    TextFieldValidator(EditableTextField param0) {
        try {
          this.field_i = param0;
        } catch (RuntimeException runtimeException) {
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) runtimeException), "al.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final String evaluateValidationMessage(int param0) {
        if (param0 == 8335) {
          return this.getValidationMessage(this.field_i.field_h, (byte) -114);
        }
        this.evaluateValidationStatus(103);
        return this.getValidationMessage(this.field_i.field_h, (byte) -114);
    }

    static {
        field_g = "If you do nothing the game will revert to normal view in <%0> second.";
    }
}
