/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginMethodPreference {
    static IntrusiveDeque field_a;
    private String cookieValue;
    static SpriteData[] field_c;
    static int textShadowColor;
    static int hslTableUsers;
    static AccountConnectionPhase WAIT_LOGIN_REPLY;

    public static void releaseStatics(int param0) {
        field_c = null;
        WAIT_LOGIN_REPLY = null;
        if (param0 != 0) {
          LoginMethodPreference.releaseStatics(-108);
          field_a = null;
          return;
        }
        field_a = null;
    }

    final boolean matches(String value, int guard) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != -2183) {
            WAIT_LOGIN_REPLY = (AccountConnectionPhase) null;
          }
          stackIn_3_0 = this.cookieValue.equals(value);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("jj.A(");
          if (value == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(guard).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final void savePreference(boolean guard, java.applet.Applet applet) {
        try {
          BufferedCacheFile.a(31536000L, applet, guard, this.cookieValue, "jagex-last-login-method");
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "jj.C(" + guard + ',' + (applet != null ? "{...}" : "null") + ')');
        }
    }

    LoginMethodPreference(String value) {
        try {
          this.cookieValue = value;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "jj.<init>(" + (value != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = new IntrusiveDeque();
        textShadowColor = 0;
        hslTableUsers = 0;
        WAIT_LOGIN_REPLY = new AccountConnectionPhase();
    }
}
