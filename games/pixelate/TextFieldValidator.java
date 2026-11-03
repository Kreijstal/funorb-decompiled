/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TextFieldValidator extends DebouncedValidator implements TextInputListener {
    static int field_i;
    static SceneWidget field_h;
    static String field_g;
    static String field_k;
    static boolean field_l;
    private EditableTextWidget field_j;

    public static void releaseStatics(int param0) {
        field_g = null;
        field_h = null;
        field_k = null;
        int var1 = 57 / ((-8 - param0) / 42);
    }

    abstract String describeText(int param0, String param1);

    final String c(int param0) {
        if (param0 == -1) {
          return this.describeText(-128, this.field_j.field_q);
        }
        this.isInputEmpty(10);
        return this.describeText(-128, this.field_j.field_q);
    }

    public final boolean isInputEmpty(int param0) {
        if (param0 != -22265) {
          return true;
        }
        if (null == this.field_j.field_q) {
          return true;
        }
        if (this.field_j.field_q.length() != 0) {
          return false;
        }
        return true;
    }

    abstract dj validateText(String param0, boolean param1);

    public final void a(int param0, EditableTextWidget param1) {
        try {
          this.b(2048);
          int var3_int = -22 % ((-30 - param0) / 60);
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "mg.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void onTextChanged(EditableTextWidget param0, int param1) {
        try {
          if (param1 != 4) {
            field_i = -81;
          }
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "mg.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final dj a(boolean param0) {
        if (param0) {
          return this.validateText(this.field_j.field_q, param0);
        }
        String var3 = (String) null;
        this.describeText(17, (String) null);
        return this.validateText(this.field_j.field_q, param0);
    }

    TextFieldValidator(EditableTextWidget param0) {
        try {
          this.field_j = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "mg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "Shortcut Reference";
        field_k = "Options Menu";
    }
}
