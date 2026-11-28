/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MatchingFieldValidator extends TextFieldValidator {
    static String field_k;
    static String field_j;
    static bg field_l;
    private EditableTextField field_i;

    final ag getValidationStatus(String param0, int param1) {
        FieldValidator var3 = null;
        RuntimeException var3_ref = null;
        PacketBuffer var4 = null;
        ag stackIn_4_0 = null;
        ag stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_i instanceof FieldValidatorProvider) {
            var3 = ((FieldValidatorProvider) ((Object) this.field_i)).getFieldValidator(35);
            if (var3 != null &&
              var3.getValidationStatus(24595) != sc.field_a) {
              stackIn_4_0 = fg.field_d;
              return stackIn_4_0;
            }
          }
          if (param1 != 5) {
            var4 = (PacketBuffer) null;
            MatchingFieldValidator.a((java.math.BigInteger) null, 33, (PacketBuffer) null, (java.math.BigInteger) null, (PacketBuffer) null);
          }
          if (!param0.equals(this.field_i.field_s)) {
            stackIn_10_0 = fg.field_d;
          } else {
            stackIn_10_0 = sc.field_a;
          }
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("jg.D(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw lj.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    MatchingFieldValidator(EditableTextField param0, EditableTextField param1) {
        super(param0);
        try {
          this.field_i = param1;
        } catch (RuntimeException runtimeException) {
          throw lj.wrapClientException((Throwable) ((Object) runtimeException), "jg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearStaticReferences(byte param0) {
        field_l = null;
        field_j = null;
        if (param0 != 23) {
          return;
        }
        field_k = null;
    }

    final static void a(String param0, String param1, int param2, boolean param3) {
        try {
          pl.field_a = param1;
          ch.field_g = param0;
          if (param2 >= -100) {
            MatchingFieldValidator.clearStaticReferences((byte) -17);
          }
          DirectByteStorage.a(param3, rf.field_a, 0);
        } catch (RuntimeException runtimeException) {
          throw lj.wrapClientException((Throwable) ((Object) runtimeException), "jg.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final String getValidationMessage(byte param0, String param1) {
        FieldValidator var3 = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        Object stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_i instanceof FieldValidatorProvider) {
            var3 = ((FieldValidatorProvider) ((Object) this.field_i)).getFieldValidator(35);
            if (var3 != null) {
              if (var3.getValidationStatus(24595) == sc.field_a &&
                !param1.equals(this.field_i.field_s)) {
                stackIn_7_0 = PacketBuffer.field_q;
                return stackIn_7_0;
              }
              stackIn_9_0 = var3.getValidationMessage(7320);
              return stackIn_9_0;
            }
          }
          if (!param1.equals(this.field_i.field_s)) {
            stackIn_13_0 = PacketBuffer.field_q;
            return stackIn_13_0;
          }
          var3_int = -95 / ((param0 - 49) / 56);
          stackIn_15_0 = null;
          return (String) (stackIn_15_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("jg.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw lj.wrapClientException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static void a(java.math.BigInteger param0, int param1, PacketBuffer param2, java.math.BigInteger param3, PacketBuffer param4) {
        try {
          eg.a(0, (byte) 90, param2.payload, param2.position, param3, param4, param0);
          if (param1 >= -94) {
            MatchingFieldValidator.clearStaticReferences((byte) -48);
          }
        } catch (RuntimeException runtimeException) {
          throw lj.wrapClientException((Throwable) ((Object) runtimeException), "jg.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = "Drowned By Greed";
        field_j = "Please try again in a few minutes.";
        field_l = new bg(15, 0, 1, 0);
    }
}
