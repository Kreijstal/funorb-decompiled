/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MatchingFieldValidator extends TextFieldValidator {
    static RgbSprite[] field_j;
    static int[] field_n;
    private EditableTextField field_k;
    static String field_m;
    static String field_l;

    MatchingFieldValidator(EditableTextField param0, EditableTextField param1) {
        super(param0);
        try {
          this.field_k = param1;
        } catch (RuntimeException runtimeException) {
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) runtimeException), "bd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final vf getValidationStatus(String param0, byte param1) {
        FieldValidator var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        vf stackIn_8_0 = null;
        vf stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 54) {
            var4 = (String) null;
            this.getValidationMessage((String) null, (byte) 8);
          }
          if (this.field_k instanceof FieldValidatorProvider) {
            var3 = ((FieldValidatorProvider) ((Object) this.field_k)).getFieldValidator(true);
            if (var3 != null &&
              var3.getValidationStatus((byte) 123) != mc.field_a) {
              stackIn_8_0 = a.field_e;
              return stackIn_8_0;
            }
          }
          if (!param0.equals(this.field_k.field_h)) {
            stackIn_12_0 = a.field_e;
          } else {
            stackIn_12_0 = mc.field_a;
          }
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("bd.B(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void clearStaticReferences(byte param0) {
        field_l = null;
        field_m = null;
        field_n = null;
        int var1 = 117 / ((66 - param0) / 51);
        field_j = null;
    }

    final String getValidationMessage(String param0, byte param1) {
        FieldValidator var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        String stackIn_15_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_k instanceof FieldValidatorProvider) {
            var3 = ((FieldValidatorProvider) ((Object) this.field_k)).getFieldValidator(true);
            if (var3 != null) {
              if (var3.getValidationStatus((byte) 125) == mc.field_a &&
                !param0.equals(this.field_k.field_h)) {
                stackIn_7_0 = AccountRequestState.field_c;
                return stackIn_7_0;
              }
              stackIn_9_0 = var3.getValidationMessage((byte) 66);
              return stackIn_9_0;
            }
          }
          if (param1 != -114) {
            field_j = (RgbSprite[]) null;
          }
          if (param0.equals(this.field_k.field_h)) {
            return null;
          }
          stackIn_15_0 = AccountRequestState.field_c;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("bd.C(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_m = "This password contains your email address, and would be easy to guess";
        field_n = new int[8192];
    }
}
