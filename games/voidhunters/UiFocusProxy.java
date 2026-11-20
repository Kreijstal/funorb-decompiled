/*
 * Decompiled by CFR-JS 0.4.0.
 */
class UiFocusProxy extends UiFocusableComponent {
    private UiComponent focusOwner;

    final static String toHexString(int param0, int param1) {
        if (param0 != -18879) {
          return (String) null;
        }
        return Integer.toHexString(param1);
    }

    final boolean requestFocus(int param0, UiComponent param1) {
        RuntimeException var3 = null;
        UiComponent var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            var4 = (UiComponent) null;
            this.requestFocus(107, (UiComponent) null);
          }
          stackIn_3_0 = this.focusOwner.requestFocus(param0 ^ 0, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("mu.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    UiFocusProxy(UiComponent param0) {
        try {
          this.focusOwner = param0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "mu.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        ArmBehaviourFactory discarded$0 = new ArmBehaviourFactory();
    }
}
