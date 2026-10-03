/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginMethod {
    static String field_b;
    private String methodName;

    final static boolean isAvatarCryHoldExpired(int methodGuard) {
        if (methodGuard != -3) {
            field_b = (String) null;
            if (gg.avatarCryPhase != 2) {
                return false;
            }
            if (LimitedRandomAccessFile.avatarFeedbackHoldTicks < 0) {
                return true;
            }
            return false;
        }
        if (gg.avatarCryPhase != 2) {
            return false;
        }
        if (LimitedRandomAccessFile.avatarFeedbackHoldTicks < 0) {
            return true;
        }
        return false;
    }

    final boolean matchesMethodName(int methodGuard, String candidate) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (methodGuard > 107) {
            stackIn_4_0 = this.methodName.equals(candidate);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("od.E(").append(methodGuard).append(',');
          if (candidate == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 >= -8) {
            LoginMethod.b((byte) -78);
        }
    }

    final void rememberMethod(java.applet.Applet applet, int methodGuard) {
        try {
            IntArrayQuery.a((byte) -25, 31536000L, applet, "jagex-last-login-method", this.methodName);
            if (methodGuard != 0) {
                java.applet.Applet var4 = (java.applet.Applet) null;
                this.rememberMethod((java.applet.Applet) null, -71);
            }
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "od.F(" + (applet != null ? "{...}" : "null") + ',' + methodGuard + ')');
        }
    }

    final static FullscreenFocusCanvas a(int param0, int param1, int param2, int param3, PlatformTaskDispatcher param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        FullscreenFocusCanvas var7 = null;
        java.awt.Frame var8 = null;
        FullscreenFocusCanvas stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -3) {
            field_b = (String) null;
          }
          var8 = qe.a(param2, -1, param0, param5, param4, param1);
          var6 = var8;
          if (var8 == null) {
            return null;
          }
          var7 = new FullscreenFocusCanvas();
          var7.fullscreenFrame = var8;
          var7.fullscreenFrame.add((java.awt.Component) ((Object) var7));
          var7.setBounds(0, 0, param5, param0);
          var7.addFocusListener(var7);
          var7.requestFocus();
          stackIn_6_0 = var7;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_9_0 = var6_ref;
          stackIn_9_1 = new StringBuilder().append("od.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param5).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void b(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Geoblox.clientControlFlowFlag;
        try {
          if (null != te.field_c) {
            for (var1_int = 0; var1_int < 7; var1_int++) {
              if (!EmailValidator.field_j[var1_int]) {
                return;
              }
            }
            kf.field_c = null;
            UsernameAvailabilityQuery.field_l = null;
            PasswordWidgetRenderer.field_y.c((byte) 83);
            te.field_c = null;
          }
          if (param0 == -24) {
            return;
          }
          LoginMethod.b((byte) -35);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var1), "od.B(" + param0 + ')');
        }
    }

    LoginMethod(String methodName) {
        try {
            this.methodName = methodName;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "od.<init>(" + (methodName != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Geoblox";
    }
}
