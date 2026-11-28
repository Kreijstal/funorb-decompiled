/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidatedTextField extends EditableTextField implements FieldValidatorProvider {
    static String field_T;
    private int field_P;
    static RgbSprite[] field_R;
    private FieldValidator field_S;

    public final FieldValidator getFieldValidator(int param0) {
        if (param0 >= -40) {
          this.getFieldValidator(-19);
          return this.field_S;
        }
        return this.field_S;
    }

    ValidatedTextField(String param0, bi param1, int param2) {
        super(param0, param1, param2);
    }

    public static void clearStaticReferences(byte param0) {
        field_R = null;
        field_T = null;
        if (param0 != 54) {
          field_T = (String) null;
        }
    }

    final void notifyTextChanged(int param0) {
        if (param0 > 125) {
          super.notifyTextChanged(127);
          if (null != this.field_S) {
            this.field_S.recordInputChange((byte) 78);
          }
          return;
        }
        qm var3 = (qm) null;
        this.a((qm) null, 84, -107, 114);
        super.notifyTextChanged(127);
        if (null != this.field_S) {
          this.field_S.recordInputChange((byte) 78);
        }
    }

    final void a(qm param0, int param1, int param2, int param3) {
        try {
          int var5_int = -123 / ((param1 + 50) / 59);
          super.a(param0, -115, param2, param3);
          this.field_P = -param3 - this.field_r + qh.field_i;
        } catch (RuntimeException runtimeException) {
          throw dn.wrapClientException((Throwable) ((Object) runtimeException), "sd.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void setFieldValidator(boolean param0, FieldValidator param1) {
        if (!param0) {
          return;
        }
        try {
          this.field_S = param1;
        } catch (RuntimeException runtimeException) {
          throw dn.wrapClientException((Throwable) ((Object) runtimeException), "sd.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String getTooltipText(byte param0) {
        if (param0 >= -23) {
          field_R = (RgbSprite[]) null;
          if (!this.field_m) {
            return null;
          }
          if (null != this.field_t) {
            sc.a(qh.field_i + this.field_g - this.field_P, 125, IsaacRandom.field_h);
            return this.field_t;
          }
          return null;
        }
        if (!this.field_m) {
          return null;
        }
        if (null != this.field_t) {
          sc.a(qh.field_i + this.field_g - this.field_P, 125, IsaacRandom.field_h);
          return this.field_t;
        }
        return null;
    }

    static {
        field_T = null;
    }
}
