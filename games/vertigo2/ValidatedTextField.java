/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidatedTextField extends EditableTextField implements FieldValidatorProvider {
    static ve field_Y;
    static String field_W;
    static String field_S;
    private FieldValidator field_Z;
    static int field_X;
    private int field_V;
    static int field_Q;
    static boolean field_R;
    static int field_T;
    static int field_U;

    final static void a(java.awt.Frame param0, PlatformTaskDispatcher param1, int param2) {
        AsyncRequest var3 = null;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          while (true) {
            var3 = param1.requestExitFullscreen(false, param0);
            while (var3.status == 0) {
              ArrayWidgetContainer.sleepMillis(true, 10L);
            }
            if (var3.status != 1) {
              ArrayWidgetContainer.sleepMillis(true, 100L);
              continue;
            }
            break;
          }
          if (param2 != 8) {
            field_Y = (ve) null;
          }
          param0.setVisible(false);
          param0.dispose();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("br.V(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wn.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    final void notifyTextChanged(byte param0) {
        if (param0 <= 16) {
          return;
        }
        super.notifyTextChanged((byte) 89);
        if (null != this.field_Z) {
          this.field_Z.recordInputChange(18340);
        }
    }

    final void setFieldValidator(boolean param0, FieldValidator param1) {
        try {
          this.field_Z = param1;
          if (!param0) {
            UiWidget var4 = (UiWidget) null;
            this.updatePointer((byte) 118, -53, -31, (UiWidget) null);
          }
        } catch (RuntimeException runtimeException) {
          throw wn.wrapClientException((Throwable) ((Object) runtimeException), "br.U(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int b(int param0, byte param1) {
        if (param1 != 48) {
          field_U = -18;
          return param0;
        }
        return param0;
    }

    final static String a(String param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        BitPacketBuffer var5 = null;
        CharSequence var6 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_17_0 = null;
        String stackIn_21_0 = null;
        Object stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = (CharSequence) ((Object) param0);
          if (!BlastDebrisModel.isValidPlayerName((byte) 122, var6)) {
            stackIn_3_0 = or.field_a;
            return stackIn_3_0;
          }
          if (PasswordValidator.a(param0, true)) {
            stackIn_6_0 = Vertigo2.field_K;
            return stackIn_6_0;
          }
          if (2 != ba.field_d) {
            stackIn_10_0 = jf.field_J;
            return stackIn_10_0;
          }
          if (UiWidget.b(param0, 109)) {
            stackIn_13_0 = Vertigo2.a(new String[]{param0}, RasterBuffer.field_f, 55);
            return stackIn_13_0;
          }
          if (vd.field_a >= param2) {
            stackIn_17_0 = eb.field_i;
            return stackIn_17_0;
          }
          if (c.a(param0, (byte) -116)) {
            stackIn_21_0 = Vertigo2.a(new String[]{param0}, wb.field_C, -4);
            return stackIn_21_0;
          }
          var5 = uh.field_Wb;
          var5.writeCipheredByte(param1, 127);
          var5.position = var5.position + 1;
          var4 = var5.position;
          var5.writeByte(2, -92);
          var5.writeString((byte) 0, param0);
          var5.patchByteLength((byte) -98, var5.position - var4);
          stackIn_23_0 = null;
          return (String) (stackIn_23_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_26_0 = var3;
          stackIn_26_1 = new StringBuilder().append("br.W(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw wn.wrapClientException((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void updatePointer(byte param0, int param1, int param2, UiWidget param3) {
        try {
          super.updatePointer((byte) 45, param1, param2, param3);
          if (param0 < 6) {
            PlatformTaskDispatcher var6 = (PlatformTaskDispatcher) null;
            ValidatedTextField.a((java.awt.Frame) null, (PlatformTaskDispatcher) null, -16);
          }
          this.field_V = -param1 + (-this.x + PacketBuffer.field_n);
        } catch (RuntimeException runtimeException) {
          throw wn.wrapClientException((Throwable) ((Object) runtimeException), "br.E(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearStaticReferences(int param0) {
        field_W = null;
        field_Y = null;
        if (param0 != -17131) {
          return;
        }
        field_S = null;
    }

    final String getTooltipText(boolean param0) {
        if (!this.field_p) {
          return null;
        }
        if (this.field_q == null) {
          return null;
        }
        if (!param0) {
          jn.a(gb.field_d, -4765, PacketBuffer.field_n - (-this.width + this.field_V));
          return this.field_q;
        }
        ValidatedTextField.b(-110, (byte) -108);
        jn.a(gb.field_d, -4765, PacketBuffer.field_n - (-this.width + this.field_V));
        return this.field_q;
    }

    public final FieldValidator getFieldValidator(byte param0) {
        if (param0 != -5) {
          field_U = -34;
          return this.field_Z;
        }
        return this.field_Z;
    }

    ValidatedTextField(String param0, WidgetEventListener param1, int param2) {
        super(param0, param1, param2);
    }

    static {
        field_W = "Quick Chat Help";
        field_S = "Please enter your age in years";
        field_Y = new ve(8, 0, 4, 1);
    }
}
