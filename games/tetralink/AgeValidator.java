/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AgeValidator extends TextFieldValidator {
    static String field_s;
    static String field_q;
    static Sprite field_r;

    public static void releaseStatics(int param0) {
        field_s = null;
        int var1 = -40 % ((param0 + 64) / 39);
        field_q = null;
        field_r = null;
    }

    AgeValidator(EditableTextWidget param0) {
        super(param0);
    }

    final String validationMessageForText(String param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 26202) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          if (this.validationStateForText(param1 - 26202, param0) != QuickChatCommandType.field_h) {
            return null;
          }
          stackIn_6_0 = SparkParticle.field_o;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("w.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final ValidationState validationStateForText(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        ValidationState stackIn_3_0 = null;
        ValidationState stackIn_6_0 = null;
        ValidationState stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param1);
          if (!Js5ArchiveManager.isDecimalInteger(var4, 10)) {
            stackIn_3_0 = QuickChatCommandType.field_h;
            return stackIn_3_0;
          }
          if (param0 != 0) {
            stackIn_6_0 = (ValidationState) null;
            return stackIn_6_0;
          }
          var5 = (CharSequence) ((Object) param1);
          var3_int = CaptionedContainer.parseDecimalInt(var5, 10);
          if (var3_int > 0 &&
            130 >= var3_int) {
            return PlayerContextMenu.field_a;
          }
          stackIn_11_0 = QuickChatCommandType.field_h;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("w.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_s = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_q = "Show chat (<%0> unread messages)";
    }
}
