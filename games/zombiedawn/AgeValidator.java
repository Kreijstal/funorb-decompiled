/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AgeValidator extends TextFieldValidator {
    static String field_h;
    static FullscreenErrorReason field_f;
    static String[] field_g;
    static String[] field_j;
    static Sprite[] field_i;

    final String messageForText(String param0, byte param1) {
        RuntimeException var3 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -94) {
            field_i = (Sprite[]) null;
          }
          if (this.validateText(param0, 2) != MouseWheelInput.field_b) {
            return null;
          }
          stackIn_5_0 = LoadingProgressDialog.field_Z;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("kb.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    AgeValidator(EditableTextWidget param0) {
        super(param0);
    }

    final ValidationState validateText(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        ValidationState stackIn_4_0 = null;
        ValidationState stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 2) {
            var4 = (String) null;
            this.messageForText((String) null, (byte) 5);
          }
          var5 = (CharSequence) ((Object) param0);
          if (!ResizableModeHelpers.isDecimalInteger((byte) -101, var5)) {
            stackIn_4_0 = MouseWheelInput.field_b;
            return stackIn_4_0;
          }
          var6 = (CharSequence) ((Object) param0);
          var3_int = DualLinkDeque.parseDecimalInt(var6, 121);
          if (var3_int > 0 &&
            130 >= var3_int) {
            return EmailSyntaxValidator.field_g;
          }
          stackIn_9_0 = MouseWheelInput.field_b;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("kb.I(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_f = null;
        field_g = null;
        field_i = null;
        if (param0 <= 60) {
          return;
        }
        field_j = null;
        field_h = null;
    }

    static {
        field_h = "This password contains your Player Name, and would be easy to guess";
        field_g = new String[]{"Catch as many as you can before the time runs out!", "Get across the road!", "Swarm the entrance to the White House!", "", "Catch as many as you can before the time runs out!", "Herd the humans into the barn!", "Get across the laser maze as fast as you can!", ""};
        field_f = new FullscreenErrorReason();
    }
}
