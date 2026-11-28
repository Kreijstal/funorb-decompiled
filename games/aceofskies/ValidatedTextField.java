/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidatedTextField extends EditableTextField implements FieldValidatorProvider {
    static int field_K;
    private int field_M;
    static AircraftDefinition field_N;
    private FieldValidator field_L;
    static String field_J;

    public final FieldValidator getFieldValidator(int param0) {
        if (param0 != 0) {
          this.notifyTextChanged((byte) -126);
          return this.field_L;
        }
        return this.field_L;
    }

    final void setFieldValidator(FieldValidator param0, int param1) {
        try {
          this.field_L = param0;
          if (param1 != 1472) {
            field_N = (AircraftDefinition) null;
          }
        } catch (RuntimeException runtimeException) {
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) runtimeException), "kk.DA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void notifyTextChanged(byte param0) {
        super.notifyTextChanged(param0);
        if (null != this.field_L) {
          this.field_L.recordInputChange((byte) 115);
        }
    }

    final void updatePointer(byte param0, UiWidget param1, int param2, int param3) {
        try {
          super.updatePointer((byte) 46, param1, param2, param3);
          if (param0 <= 13) {
            this.getFieldValidator(113);
          }
          this.field_M = -this.field_p + (ic.field_b - param3);
        } catch (RuntimeException runtimeException) {
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) runtimeException), "kk.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static int a(BufferElementType param0, byte param1) {
        String stackIn_31_2 = null;
        try {
          if (param0 == BufferElementType.field_a) {
            int stackIn_2_0 = 5120;
            return stackIn_2_0;
          }
          if (param0 == BufferElementType.field_j) {
            int stackIn_24_0 = 5122;
            return stackIn_24_0;
          }
          if (param0 == BufferElementType.field_e) {
            int stackIn_6_0 = 5124;
            return stackIn_6_0;
          }
          if (BufferElementType.field_h == param0) {
            int stackIn_9_0 = 5121;
            return stackIn_9_0;
          }
          if (param0 == BufferElementType.field_b) {
            int stackIn_12_0 = 5123;
            return stackIn_12_0;
          }
          if (BufferElementType.field_f == param0) {
            int stackIn_15_0 = 5125;
            return stackIn_15_0;
          }
          if (param0 == BufferElementType.field_d) {
            int stackIn_22_0 = 5131;
            return stackIn_22_0;
          }
          if (param0 == BufferElementType.field_i) {
            int stackIn_20_0 = 5126;
            return stackIn_20_0;
          }
          if (param1 >= -91) {
            BufferElementType var3 = (BufferElementType) null;
            ValidatedTextField.a((BufferElementType) null, (byte) -56);
          }
          throw new IllegalArgumentException("");
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_30_0 = var2;
          StringBuilder stackIn_30_1 = new StringBuilder().append("kk.EA(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(')').toString());
        }
    }

    ValidatedTextField(String param0, WidgetEventListener param1, int param2) {
        super(param0, param1, param2);
    }

    final String getTooltipText(byte param0) {
        if (param0 >= -41) {
          return (String) null;
        }
        if (!this.field_g) {
          return null;
        }
        if (this.field_k != null) {
          WeightedObjectCache.a(true, this.field_q + (-this.field_M + ic.field_b), cf.field_g);
          return this.field_k;
        }
        return null;
    }

    public static void clearStaticReferences(boolean param0) {
        if (!param0) {
          field_N = (AircraftDefinition) null;
          field_J = null;
          field_N = null;
          return;
        }
        field_J = null;
        field_N = null;
    }

    static {
        field_K = 0;
        field_N = new AircraftDefinition(0.5, 20, 0, 100, 1, 7.0, 9.0, 16, 0);
        field_J = "Login: ";
    }
}
