/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EmailAvailabilityValidator extends TextFieldValidator {
    private MatchingTextValidator field_h;
    static String field_j;
    static String field_k;
    static int field_f;
    private boolean field_i;
    private String field_g;

    final static void showLoginPanelDefault(boolean param0, int param1) {
        if (param1 < 61) {
          field_f = 84;
          ResizableDialog.showLoginPanel(false, (byte) -55, param0);
          return;
        }
        ResizableDialog.showLoginPanel(false, (byte) -55, param0);
    }

    final static TickClock createTickClock(int param0) {
        if (param0 != 16516) {
          return (TickClock) null;
        }
        return (TickClock) ((Object) new NanoTickClock());
    }

    public static void releaseStatics(int param0) {
        field_k = null;
        field_j = null;
        if (param0 != 1029) {
          EmailAvailabilityValidator.createTickClock(-104);
        }
    }

    final ValidationState validateText(String param0, int param1) {
        NameCheckRequest var3 = null;
        RuntimeException var3_ref = null;
        ValidationState stackIn_2_0 = null;
        ValidationState stackIn_7_0 = null;
        ValidationState stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_h.validateText(param0, param1) == MouseWheelInput.field_b) {
            stackIn_2_0 = MouseWheelInput.field_b;
            return stackIn_2_0;
          }
          if (!param0.equals(this.field_g)) {
            var3 = DebouncedValidator.getOrCreateNameCheck((byte) 110, param0);
            if (!var3.isComplete(36)) {
              stackIn_7_0 = WidgetStyleLayer.field_v;
              return stackIn_7_0;
            }
            this.field_g = param0;
            this.field_i = var3.getResult(false);
          }
          if (this.field_i) {
            stackIn_12_0 = EmailSyntaxValidator.field_g;
          } else {
            stackIn_12_0 = MouseWheelInput.field_b;
          }
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("lk.I(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    EmailAvailabilityValidator(EditableTextWidget param0, EditableTextWidget param1) {
        super(param0);
        this.field_i = false;
        this.field_g = "";
        try {
          this.field_h = new MatchingTextValidator(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "lk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String messageForText(String param0, byte param1) {
        RuntimeException var3 = null;
        String stackIn_4_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -94) {
            field_k = (String) null;
          }
          if (this.field_h.validateText(param0, 2) == MouseWheelInput.field_b) {
            stackIn_4_0 = this.field_h.messageForText(param0, (byte) -119);
            return stackIn_4_0;
          }
          if (this.validateText(param0, 2) != MouseWheelInput.field_b) {
            return AccountRequestState.field_c;
          }
          stackIn_8_0 = LoginConnectionHelpers.field_d;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("lk.B(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_j = "Back";
    }
}
