/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginMethod {
    static int field_c;
    private String cookieValue;
    static boolean field_b;

    final boolean matchesCookieValue(int param0, String param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            this.cookieValue = (String) null;
          }
          stackIn_3_0 = this.cookieValue.equals(param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("khb.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final void writeCookie(java.applet.Applet param0, int param1) {
        if (param1 != 0) {
          return;
        }
        try {
          AppletCookieWriter.writeCookie(param0, param1 ^ -124, this.cookieValue, "jagex-last-login-method", 31536000L);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "khb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    LoginMethod(String param0) {
        try {
          this.cookieValue = param0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "khb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = 0;
        field_b = false;
    }
}
