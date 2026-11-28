/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidatedTextField extends EditableTextField implements FieldValidatorProvider {
    private int field_bb;
    static boolean field_ab;
    static RgbSprite field_Z;
    private FieldValidator field_Y;
    static String[] field_cb;

    final String g(int param0) {
        if (!this.field_w) {
          return null;
        }
        if (null == this.field_j) {
          return null;
        }
        sb.d(33, rf.field_b, -this.field_bb + this.field_y + BufferedSocket.field_k);
        if (param0 == 0) {
          return this.field_j;
        }
        return (String) null;
    }

    public final FieldValidator getFieldValidator(int param0) {
        if (param0 >= -80) {
          field_ab = false;
          return this.field_Y;
        }
        return this.field_Y;
    }

    final void notifyTextChanged(byte param0) {
        super.notifyTextChanged(param0);
        if (null != this.field_Y) {
          this.field_Y.recordInputChange(true);
        }
    }

    final void a(int param0, FieldValidator param1) {
        try {
          this.field_Y = param1;
          if (param0 >= -63) {
            field_ab = true;
          }
        } catch (RuntimeException runtimeException) {
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) runtimeException), "bg.BA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void discardDeclaredStaticReferences(int param0) {
        if (param0 != 2491) {
          field_Z = (RgbSprite) null;
          field_cb = null;
          field_Z = null;
          return;
        }
        field_cb = null;
        field_Z = null;
    }

    final void a(int param0, int param1, mf param2, int param3) {
        try {
          if (param1 >= -6) {
            field_cb = (String[]) null;
          }
          super.a(param0, -30, param2, param3);
          this.field_bb = -param0 + (-this.field_u + BufferedSocket.field_k);
        } catch (RuntimeException runtimeException) {
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) runtimeException), "bg.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    ValidatedTextField(String param0, rg param1, int param2) {
        super(param0, param1, param2);
    }

    static {
        field_cb = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    }
}
