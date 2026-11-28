/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TextFieldValidator extends DebouncedFieldValidator implements TextFieldListener {
    static gd field_f;
    static int[] field_g;
    private EditableTextField field_e;

    abstract fi getValidationStatus(byte param0, String param1);

    public final void onTextSubmitted(EditableTextField param0, byte param1) {
        try {
          if (param1 != 83) {
            field_f = (gd) null;
          }
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "mf.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean hasMissingInput(boolean param0) {
        if (!param0) {
          EditableTextField var3 = (EditableTextField) null;
          this.onTextSubmitted((EditableTextField) null, (byte) -119);
          if (null != this.field_e.field_B) {
            return 0 == this.field_e.field_B.length() ? true : false;
          }
          return true;
        }
        if (null == this.field_e.field_B) {
          return true;
        }
        if (0 != this.field_e.field_B.length()) {
          return false;
        }
        return true;
    }

    final static boolean c(int param0) {
        if (param0 < 101) {
          return true;
        }
        return sg.a((byte) -111, ii.b(false));
    }

    TextFieldValidator(EditableTextField param0) {
        try {
          this.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "mf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final String evaluateValidationMessage(byte param0) {
        if (param0 < 102) {
          return (String) null;
        }
        return this.getValidationMessage(this.field_e.field_B, true);
    }

    final fi evaluateValidationStatus(boolean param0) {
        if (param0) {
          return this.getValidationStatus((byte) -68, this.field_e.field_B);
        }
        this.field_e = (EditableTextField) null;
        return this.getValidationStatus((byte) -68, this.field_e.field_B);
    }

    abstract String getValidationMessage(String param0, boolean param1);

    public final void onTextChanged(int param0, EditableTextField param1) {
        try {
          this.recordInputChange(-47);
          if (param0 != 32175) {
            EditableTextField var4 = (EditableTextField) null;
            this.onTextSubmitted((EditableTextField) null, (byte) 73);
          }
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "mf.GA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(int param0) {
        if (param0 <= 66) {
          TextFieldValidator.c(95);
          field_f = null;
          field_g = null;
          return;
        }
        field_f = null;
        field_g = null;
    }

    static {
        field_g = new int[8192];
    }
}
