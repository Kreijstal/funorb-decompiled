/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidatedTextField extends EditableTextField implements FieldValidatorProvider {
    private FieldValidator field_Q;
    static nk field_G;
    static int field_O;
    private int field_P;
    static q field_N;

    public static void clearStaticReferences(int param0) {
        if (param0 < 78) {
          ValidatedTextField.clearStaticReferences(67);
          field_G = null;
          field_N = null;
          return;
        }
        field_G = null;
        field_N = null;
    }

    final void a(int param0, FieldValidator param1) {
        try {
          int var3_int = 32 / ((-1 - param0) / 56);
          this.field_Q = param1;
        } catch (RuntimeException runtimeException) {
          throw ch.wrapClientException((Throwable) ((Object) runtimeException), "vc.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final FieldValidator getFieldValidator(byte param0) {
        int var2 = -111 / ((46 - param0) / 34);
        return this.field_Q;
    }

    final void notifyTextChanged(byte param0) {
        super.notifyTextChanged((byte) 117);
        if (this.field_Q != null) {
          this.field_Q.recordInputChange(true);
        }
        if (param0 > 43) {
          return;
        }
        this.field_Q = (FieldValidator) null;
    }

    ValidatedTextField(String param0, ma param1, int param2) {
        super(param0, param1, param2);
    }

    final static boolean e(boolean param0) {
        if (param0) {
          return false;
        }
        if (gl.field_y < 10) {
          return false;
        }
        if (!ge.field_x) {
          return !i.b(true) ? true : false;
        }
        return false;
    }

    final String f(int param0) {
        if (!this.field_g) {
          return null;
        }
        if (this.field_j == null) {
          return null;
        }
        if (param0 == 4) {
          sh.a((byte) 123, this.field_l + (-this.field_P + PacketBuffer.field_j), bk.field_a);
          return this.field_j;
        }
        this.field_Q = (FieldValidator) null;
        sh.a((byte) 123, this.field_l + (-this.field_P + PacketBuffer.field_j), bk.field_a);
        return this.field_j;
    }

    final void a(int param0, byte param1, UiWidget param2, int param3) {
        try {
          super.a(param0, param1, param2, param3);
          this.field_P = -param3 + (PacketBuffer.field_j - this.field_p);
        } catch (RuntimeException runtimeException) {
          throw ch.wrapClientException((Throwable) ((Object) runtimeException), "vc.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_G = new nk(2);
        field_N = new q();
    }
}
