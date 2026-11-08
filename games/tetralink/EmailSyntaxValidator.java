/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EmailSyntaxValidator extends TextFieldValidator {
    static LoginMethod field_s;
    static HighscoreRowName[] field_v;
    static String field_x;
    static UiComponent field_q;
    static Model field_t;
    static String field_u;
    static String field_r;
    static String field_w;

    final static int[] createEightIntBuffer(int param0) {
        if (param0 != -7990) {
          field_x = (String) null;
          return new int[8];
        }
        return new int[8];
    }

    final String validationMessageForText(String param0, int param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.validationStateForText(param1 - 26202, param0) == QuickChatCommandType.field_h) {
            stackIn_3_0 = LoadingStepTracker.field_j;
            return stackIn_3_0;
          }
          if (param1 != 26202) {
            var4 = (String) null;
            this.validationMessageForText((String) null, 55);
          }
          stackIn_7_0 = AnimationSequence.field_h;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("lh.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    EmailSyntaxValidator(EditableTextWidget param0) {
        super(param0);
    }

    final ValidationState validationStateForText(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        ValidationState stackIn_7_0 = null;
        ValidationState stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            field_v = (HighscoreRowName[]) null;
          }
          stackIn_5_0 = (Js5Transport.validateEmailAddress(-115, param1) != null) ? 0 : 1;
          var3_int = stackIn_5_0;
          if (var3_int != 0) {
            stackIn_9_0 = PlayerContextMenu.field_a;
            return stackIn_9_0;
          }
          stackIn_7_0 = QuickChatCommandType.field_h;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("lh.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_x = null;
        field_q = null;
        field_u = null;
        field_v = null;
        if (param0 == 255) {
          field_r = null;
          field_t = null;
          field_w = null;
          field_s = null;
          return;
        }
    }

    static {
        int var0 = 0;
        field_s = new LoginMethod("email");
        field_v = new HighscoreRowName[255];
        field_x = "You cannot join this game - it is in progress";
        field_r = "Offer unrated rematch";
        field_u = "Rated game";
        for (var0 = 0; field_v.length > var0; var0++) {
          field_v[var0] = new HighscoreRowName();
        }
        field_w = "<%0> is not a member, and cannot play with the current options.";
    }
}
