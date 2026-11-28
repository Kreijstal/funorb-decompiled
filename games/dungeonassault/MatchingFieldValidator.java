/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MatchingFieldValidator extends TextFieldValidator {
    static String field_m;
    static String field_r;
    static hl field_n;
    private EditableTextField field_p;
    static String field_q;
    static ph field_o;
    static wk field_s;

    final String getValidationMessage(byte param0, String param1) {
        FieldValidator var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        String stackIn_9_0 = null;
        String stackIn_11_0 = null;
        String stackIn_15_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 44) {
            var4 = (String) null;
            this.getValidationStatus((String) null, -75);
          }
          if (this.field_p instanceof FieldValidatorProvider) {
            var3 = ((FieldValidatorProvider) ((Object) this.field_p)).getFieldValidator(-79);
            if (var3 != null) {
              if (var3.getValidationStatus((byte) -117) == AwtRasterBuffer.field_d &&
                !param1.equals(this.field_p.field_w)) {
                stackIn_9_0 = DirectByteStorage.field_j;
                return stackIn_9_0;
              }
              stackIn_11_0 = var3.getValidationMessage(true);
              return stackIn_11_0;
            }
          }
          if (param1.equals(this.field_p.field_w)) {
            return null;
          }
          stackIn_15_0 = DirectByteStorage.field_j;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("be.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final od getValidationStatus(String param0, int param1) {
        FieldValidator var3 = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        od stackIn_5_0 = null;
        od stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_p instanceof FieldValidatorProvider) {
            var3 = ((FieldValidatorProvider) ((Object) this.field_p)).getFieldValidator(-122);
            if (var3 != null &&
              var3.getValidationStatus((byte) -99) != AwtRasterBuffer.field_d) {
              stackIn_5_0 = pd.field_J;
              return stackIn_5_0;
            }
          }
          var3_int = -81 / ((5 - param1) / 44);
          if (param0.equals(this.field_p.field_w)) {
            stackIn_9_0 = AwtRasterBuffer.field_d;
          } else {
            stackIn_9_0 = pd.field_J;
          }
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("be.C(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void clearDeclaredStaticReferences(int param0) {
        field_q = null;
        field_s = null;
        field_m = null;
        field_n = null;
        if (param0 == -15818) {
          field_o = null;
          field_r = null;
          return;
        }
        field_n = (hl) null;
        field_o = null;
        field_r = null;
    }

    MatchingFieldValidator(EditableTextField param0, EditableTextField param1) {
        super(param0);
        try {
          this.field_p = param1;
        } catch (RuntimeException runtimeException) {
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) runtimeException), "be.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = null;
        field_m = "You must have had your dungeon reset by an Orb of Mastery once to earn the title of <%1>.";
        field_q = "CHARGE ORB";
        field_r = "Cancel";
    }
}
