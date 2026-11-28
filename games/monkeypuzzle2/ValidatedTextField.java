/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidatedTextField extends EditableTextField implements FieldValidatorProvider {
    private int field_Q;
    static int field_N;
    static String[] field_R;
    static Sprite[] field_L;
    private FieldValidator field_M;
    static int[] field_P;
    static String field_O;

    final void setFieldValidator(FieldValidator param0, boolean param1) {
        try {
          if (!param1) {
            UiWidget var4 = (UiWidget) null;
            this.a((UiWidget) null, 53, 72, (byte) 12);
          }
          this.field_M = param0;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "qc.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(me param0, byte param1, int param2) {
        hb var3 = null;
        try {
          var3 = SectorCacheStore.field_c;
          if (param1 <= 100) {
            me var4 = (me) null;
            ValidatedTextField.a((me) null, (byte) 35, -2);
          }
          var3.b(true, param2);
          var3.writeByte(param0.field_k, -49152);
          var3.writeShort(param0.field_m, 71);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "qc.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final String getTooltipText(byte param0) {
        if (!this.field_g) {
          return null;
        }
        if (this.field_m == null) {
          return null;
        }
        if (param0 == 54) {
          oh.a(p.field_a, ei.field_a + this.field_l - this.field_Q, 94);
          return this.field_m;
        }
        this.notifyTextChanged(90);
        oh.a(p.field_a, ei.field_a + this.field_l - this.field_Q, 94);
        return this.field_m;
    }

    public static void releaseDeclaredStaticReferences(int param0) {
        field_L = null;
        field_O = null;
        if (param0 < 92) {
          return;
        }
        field_R = null;
        field_P = null;
    }

    final void a(UiWidget param0, int param1, int param2, byte param3) {
        try {
          super.a(param0, param1, param2, (byte) -24);
          if (param3 > -13) {
            FieldValidator var6 = (FieldValidator) null;
            this.setFieldValidator((FieldValidator) null, false);
          }
          this.field_Q = -param2 + (ei.field_a - this.field_r);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "qc.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final FieldValidator getFieldValidator(int param0) {
        int var2 = -110 % ((-50 - param0) / 55);
        return this.field_M;
    }

    final void notifyTextChanged(int param0) {
        super.notifyTextChanged(param0 ^ param0);
        if (null != this.field_M) {
          this.field_M.recordInputChange((byte) -94);
        }
    }

    ValidatedTextField(String param0, of param1, int param2) {
        super(param0, param1, param2);
    }

    static {
        field_R = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
        field_N = 0;
        field_O = "No highscores";
    }
}
