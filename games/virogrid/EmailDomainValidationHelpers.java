/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EmailDomainValidationHelpers {
    static String textEndgameBoardfilledDraw;
    static LoginRsaKey field_b;
    static TextWidgetPainter field_f;
    static String field_a;
    static SpriteWidget field_e;
    static int field_c;

    final static void sendActionRequest(int param0) {
        if (param0 == -64) {
          IterableNodeHashTable.field_g.writeCipheredOpcode(62, 8);
          IterableNodeHashTable.field_g.writeByte(123, 117);
          return;
        }
        EmailDomainValidationHelpers.releaseStatics(true);
        IterableNodeHashTable.field_g.writeCipheredOpcode(62, 8);
        IterableNodeHashTable.field_g.writeByte(123, 117);
    }

    public static void releaseStatics(boolean param0) {
        textEndgameBoardfilledDraw = null;
        field_b = null;
        field_f = null;
        if (!param0) {
          field_e = null;
          field_a = null;
          return;
        }
        textEndgameBoardfilledDraw = (String) null;
        field_e = null;
        field_a = null;
    }

    final static LogoAndLoginHelpers validateDomainLabel(String param0, int param1) {
        int var3 = 0;
        int var2_int = 0;
        int var4 = 0;
        int var5 = 0;
        LogoAndLoginHelpers stackIn_6_0 = null;
        LogoAndLoginHelpers stackIn_10_0 = null;
        LogoAndLoginHelpers stackIn_19_0 = null;
        LogoAndLoginHelpers stackIn_22_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = Virogrid.field_F ? 1 : 0;
        try {
          if (param1 != 8286) {
            textEndgameBoardfilledDraw = (String) null;
          }
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_6_0 = PasswordFieldPainter.field_H;
            return stackIn_6_0;
          }
          if (var2_int > 63) {
            stackIn_10_0 = MouseWheelInput.field_a;
            return stackIn_10_0;
          }
          for (var3 = 0; var2_int > var3; var3++) {
            var4 = param0.charAt(var3);
            if (var4 == 45) {
              if (var3 == 0 ||
                var3 == -1 + var2_int) {
                stackIn_19_0 = WidgetStyleLayer.field_f;
                return stackIn_19_0;
              }
            } else {
              if (CheckboxTickPainter.field_f.indexOf(var4) == -1) {
                stackIn_22_0 = WidgetStyleLayer.field_f;
                return stackIn_22_0;
              }
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("vf.A(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        textEndgameBoardfilledDraw = "Both players have the same number of pieces";
        field_b = new LoginRsaKey();
        field_a = "Try again";
        field_c = 360;
    }
}
