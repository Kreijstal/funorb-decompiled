/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AgeValidator extends TextFieldValidator {
    static PlatformTaskDispatcher field_m;
    static int field_l;
    static String field_k;

    final String getTextValidationMessage(String param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.validateText(param1, param0) != DisplayNameSyntaxHelpers.field_c) {
            return null;
          }
          stackIn_3_0 = WeightedLruCache.field_a;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("qf.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final ValidationState validateText(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        ValidationState stackIn_3_0 = null;
        ValidationState stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param1);
          if (!TextLayout.isDecimalInteger(var4, (byte) 78)) {
            stackIn_3_0 = DisplayNameSyntaxHelpers.field_c;
            return stackIn_3_0;
          }
          var5 = (CharSequence) ((Object) param1);
          var3_int = GameMenu.parseDecimalInteger(1124, var5);
          if (param0 > ~var3_int &&
            130 >= var3_int) {
            return ContentTransitionDialog.field_V;
          }
          stackIn_8_0 = DisplayNameSyntaxHelpers.field_c;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("qf.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public static void releaseStatics(boolean param0) {
        field_k = null;
        if (!param0) {
          return;
        }
        field_m = null;
    }

    final static String getLoginIdentifierPrefill(byte param0) {
        String var1 = "";
        if (TimedValidator.field_b != null) {
          var1 = TimedValidator.field_b.getLoginIdentifier(false);
        }
        if (0 == var1.length()) {
          var1 = MidiNote.getCurrentPlayerName((byte) -110);
        }
        if (param0 == 77) {
          if (0 == var1.length()) {
            var1 = RasterSnapshot.field_i;
          }
          return var1;
        }
        return (String) null;
    }

    AgeValidator(EditableTextWidget param0) {
        super(param0);
    }

    static {
        field_k = "Achievements";
    }
}
