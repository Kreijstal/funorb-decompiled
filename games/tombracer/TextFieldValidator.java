/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TextFieldValidator extends DebouncedValidationSource implements TextInputListener {
    static int field_h;
    static int field_g;
    private TextInputWidget field_i;
    static int field_f;

    abstract ValidationState validateText(byte param0, String param1);

    abstract String validationMessageForText(int param0, String param1);

    final String computeMessage(int param0) {
        if (param0 == 1890) {
          return this.validationMessageForText(-1, this.field_i.field_o);
        }
        field_h = -23;
        return this.validationMessageForText(-1, this.field_i.field_o);
    }

    public final boolean isEmpty(boolean param0) {
        if (!param0) {
          field_g = 101;
          if (null != this.field_i.field_o) {
            return this.field_i.field_o.length() == 0 ? true : false;
          }
          return true;
        }
        if (null == this.field_i.field_o) {
          return true;
        }
        if (this.field_i.field_o.length() != 0) {
          return false;
        }
        return true;
    }

    public final void onEnterPressed(int param0, TextInputWidget param1) {
        try {
          if (param0 != -6038) {
            TextInputWidget var4 = (TextInputWidget) null;
            this.onEnterPressed(46, (TextInputWidget) null);
          }
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "kca.KA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void onTextChanged(TextInputWidget param0, int param1) {
        if (param1 != -10) {
          return;
        }
        try {
          this.markEdited(-99);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "kca.U(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    TextFieldValidator(TextInputWidget param0) {
        try {
          this.field_i = param0;
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "kca.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final ValidationState computeState(int param0) {
        if (param0 == -1891) {
          return this.validateText((byte) 14, this.field_i.field_o);
        }
        this.computeState(102);
        return this.validateText((byte) 14, this.field_i.field_o);
    }

    static {
        field_g = -1;
        field_f = 0;
    }
}
