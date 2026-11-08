/*
 * Decompiled by CFR-JS 0.4.0.
 */
class FocusProxyWidget extends InteractiveWidget {
    static String field_F;
    private UiWidget field_E;

    final boolean requestFocus(UiWidget root, byte guard) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard == 61) {
            stackIn_4_0 = this.field_E.requestFocus(root, (byte) 61);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ac.Q(");
          if (root == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(guard).append(')').toString());
        }
    }

    public static void releaseStatics(boolean param0) {
        if (param0) {
          FocusProxyWidget.releaseStatics(true);
          field_F = null;
          return;
        }
        field_F = null;
    }

    FocusProxyWidget(UiWidget param0) {
        try {
          this.field_E = param0;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ac.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
