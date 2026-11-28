/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ConfirmedEmailAvailabilityValidator extends TextFieldValidator {
    static String field_o;
    static int field_l;
    private String field_n;
    private boolean field_r;
    static int field_p;
    static UiPanel field_s;
    private MatchingFieldValidator field_m;
    static int field_q;

    final String getValidationMessage(int param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_4_0 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 3614) {
            field_o = (String) null;
          }
          if (this.field_m.getValidationStatus(-1, param1) == ir.field_a) {
            stackIn_4_0 = this.field_m.getValidationMessage(3614, param1);
            return stackIn_4_0;
          }
          if (this.getValidationStatus(param0 - 3615, param1) != ir.field_a) {
            stackIn_9_0 = mh.field_b;
            return stackIn_9_0;
          }
          stackIn_7_0 = vl.field_b;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("oa.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wn.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void resetStaticState(int param0) {
        field_o = null;
        if (param0 > -107) {
          field_l = -41;
          field_s = null;
          return;
        }
        field_s = null;
    }

    final ba getValidationStatus(int param0, String param1) {
        bk var3 = null;
        RuntimeException var3_ref = null;
        ba stackIn_2_0 = null;
        ba stackIn_7_0 = null;
        ba stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_m.getValidationStatus(param0, param1) == ir.field_a) {
            stackIn_2_0 = ir.field_a;
            return stackIn_2_0;
          }
          if (!param1.equals(this.field_n)) {
            var3 = SocketConnector.a(param1, false);
            if (!var3.a((byte) -100)) {
              stackIn_7_0 = dj.field_c;
              return stackIn_7_0;
            }
            this.field_n = param1;
            this.field_r = var3.c((byte) -119);
          }
          if (!this.field_r) {
            stackIn_12_0 = ir.field_a;
          } else {
            stackIn_12_0 = GuestPlayConfirmationForm.field_G;
          }
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("oa.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wn.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    ConfirmedEmailAvailabilityValidator(EditableTextField param0, EditableTextField param1) {
        super(param0);
        this.field_r = false;
        this.field_n = "";
        try {
          this.field_m = new MatchingFieldValidator(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw wn.wrapClientException((Throwable) ((Object) runtimeException), "oa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = 0;
        field_o = "Unable to delete friend - system busy";
    }
}
