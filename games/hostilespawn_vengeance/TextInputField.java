/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextInputField extends EditableTextField implements FieldValidatorProvider {
    private FieldValidator field_W;
    private int field_Z;
    static boolean field_U;
    static RgbSprite field_ab;
    static PcmSample[] field_V;
    static int[] field_X;
    static String field_Y;
    static RgbSprite field_T;

    public final FieldValidator getInputHandler(byte param0) {
        int var2 = -60 % ((param0 - 35) / 39);
        return this.field_W;
    }

    final void setInputHandler(FieldValidator param0, byte param1) {
        try {
          this.field_W = param0;
          if (param1 >= -37) {
            field_ab = (RgbSprite) null;
          }
        } catch (RuntimeException runtimeException) {
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) runtimeException), "sf.DB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void pushAndIntersectClip(int param0, int param1, int param2, int param3, boolean param4) {
        if (param4) {
          pf.b(511);
          SoftwareRasterizer.intersectClip(param3, param1, param0, param2);
          return;
        }
        field_V = (PcmSample[]) null;
        pf.b(511);
        SoftwareRasterizer.intersectClip(param3, param1, param0, param2);
    }

    final void a(ag param0, int param1, int param2, int param3) {
        try {
          super.a(param0, param1, param2, param3);
          this.field_Z = -param3 + (j.field_c - this.field_v);
        } catch (RuntimeException runtimeException) {
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) runtimeException), "sf.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void notifyTextChanged(byte param0) {
        super.notifyTextChanged(param0);
        if (this.field_W != null) {
          this.field_W.recordInputChange(true);
        }
    }

    final static boolean isDecimalInteger(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= 60) {
            stackIn_4_0 = FrameTimer.a(true, 10, -59, param1);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("sf.EB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static double tileYToScreenY(int param0, double param1) {
        if (param0 != 24) {
          return 0.5905378176354061;
        }
        return param1 * 24.0 - (double)uj.field_p.field_g;
    }

    public static void clearTextInputFieldGlobals(int param0) {
        field_T = null;
        field_V = null;
        field_X = null;
        field_ab = null;
        if (param0 == 10) {
          field_Y = null;
          return;
        }
        CharSequence var2 = (CharSequence) null;
        TextInputField.isDecimalInteger((byte) 48, (CharSequence) null);
        field_Y = null;
    }

    final String e(int param0) {
        if (param0 != 34) {
          field_X = (int[]) null;
          if (!this.field_u) {
            return null;
          }
          if (this.field_i != null) {
            KeyboardInput.a(-128, rb.field_m, j.field_c - (this.field_Z - this.field_s));
            return this.field_i;
          }
          return null;
        }
        if (!this.field_u) {
          return null;
        }
        if (this.field_i != null) {
          KeyboardInput.a(-128, rb.field_m, j.field_c - (this.field_Z - this.field_s));
          return this.field_i;
        }
        return null;
    }

    TextInputField(String param0, mh param1, int param2) {
        super(param0, param1, param2);
    }

    static {
        field_U = false;
        field_Y = "Find the <%0>";
        field_V = new PcmSample[51];
    }
}
