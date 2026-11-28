/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TextFieldValidator extends DebouncedFieldValidator implements TextFieldListener {
    static int field_e;
    static lh field_i;
    static int field_h;
    static int field_g;
    private EditableTextField field_f;

    abstract String getValidationMessage(String param0, boolean param1);

    final static o a(int param0, int param1) {
        int var3 = 0;
        o[] var2;
        int var4;
        o[] var5;
        var4 = StarCannon.field_A;
        var5 = a.b(-23508);
        var2 = var5;
        for (var3 = param1; var3 < var5.length; var3++) {
          if (var5[var3].field_d == param0) {
            return var5[var3];
          }
        }
        return null;
    }

    public final void onTextChanged(int param0, EditableTextField param1) {
        try {
          this.recordInputChange((byte) 106);
          if (param0 != -4312) {
            field_i = (lh) null;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.wrapClientException((Throwable) ((Object) runtimeException), "qf.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String evaluateValidationMessage(int param0) {
        if (param0 > -127) {
          return (String) null;
        }
        return this.getValidationMessage(this.field_f.field_k, false);
    }

    public final void onTextSubmitted(boolean param0, EditableTextField param1) {
        try {
          if (param0) {
            field_e = 58;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.wrapClientException((Throwable) ((Object) runtimeException), "qf.AA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    abstract p getValidationStatus(String param0, int param1);

    public final boolean hasMissingInput(boolean param0) {
        boolean stackIn_7_0 = false;
        if (!param0) {
          field_h = 105;
        }
        stackIn_7_0 = (this.field_f.field_k == null) || (this.field_f.field_k.length() == 0);
        return stackIn_7_0;
    }

    public static void d(byte param0) {
        if (param0 <= 87) {
          TextFieldValidator.a(94, -47);
        }
        field_i = null;
    }

    final p evaluateValidationStatus(int param0) {
        if (param0 != 4096) {
          return (p) null;
        }
        return this.getValidationStatus(this.field_f.field_k, -26188);
    }

    final static int a(int param0, byte param1) {
        if (param1 >= -13) {
          return -31;
        }
        param0 = param0 & 8191;
        if (param0 >= 4096) {
          return param0 < 6144 ? -bd.field_c[param0 - 4096] : -bd.field_c[-param0 + 8192];
        }
        return param0 < 2048 ? bd.field_c[param0] : bd.field_c[4096 - param0];
    }

    TextFieldValidator(EditableTextField param0) {
        try {
          this.field_f = param0;
        } catch (RuntimeException runtimeException) {
          throw sd.wrapClientException((Throwable) ((Object) runtimeException), "qf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
