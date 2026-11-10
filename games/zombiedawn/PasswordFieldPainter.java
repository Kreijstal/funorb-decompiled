/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PasswordFieldPainter extends InsetTextPainter {
    static PlatformTaskDispatcher field_B;

    final static int smootherStep(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var2 = param0 * (param0 * param0 >> 12) >> 12;
        int var3Lifetime1;
        int var4Lifetime1;
        if (param1 > 63) {
          var3 = 6 * param0 - 61440;
          var4 = (var3 * param0 >> 12) + 40960;
          return var2 * var4 >> 12;
        }
        PasswordFieldPainter.smootherStep(-123, 65);
        var3Lifetime1 = 6 * param0 - 61440;
        var4Lifetime1 = (var3Lifetime1 * param0 >> 12) + 40960;
        return var2 * var4Lifetime1 >> 12;
    }

    final static void showLoginForm(String param0, String param1, int param2) {
        if (Point.field_i != null) {
          Point.field_i.closeDialog((byte) -34);
        }
        LoginDialogGlobals.field_a = new LoginPanel(param1, param0, false, true, true);
        if (param2 != -901373652) {
          return;
        }
        try {
          HuffmanCodec.field_d.transitionToContent(20, LoginDialogGlobals.field_a);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "jm.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final String getDisplayText(int param0, UiWidget param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 12307) {
            field_B = (PlatformTaskDispatcher) null;
          }
          stackIn_3_0 = IntKeyLookup.repeatCharacter(95, param1.field_o.length(), '*');
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("jm.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    PasswordFieldPainter(int param0) {
        this(MenuFontGlobals.field_e, param0);
    }

    private PasswordFieldPainter(Font param0, int param1) {
        super(param0, param1);
    }

    public static void releaseStatics(boolean param0) {
        field_B = null;
        if (param0) {
          field_B = (PlatformTaskDispatcher) null;
        }
    }

    static {
    }
}
