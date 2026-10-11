/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf {
    private String field_d;
    static String field_c;
    static String field_a;
    static int field_f;
    static String[] field_e;
    static int field_b;
    static int field_g;

    final boolean a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 95 % ((param0 + 55) / 62);
          stackIn_1_0 = this.field_d.equals(param1);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("kf.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static String a(int param0, java.applet.Applet param1) {
        try {
          int var6 = 0;
          String var3 = null;
          String var4 = null;
          String[] var5 = null;
          int var7 = 0;
          int var8 = 0;
          String var9 = null;
          String stackIn_6_0 = null;
          String stackIn_15_0 = null;
          RuntimeException stackIn_18_0 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          var8 = Terraphoenix.field_V;
          try {
            try {
              var9 = param1.getParameter("cookieprefix");
              var3 = var9 + "settings";
              var4 = (String) (cd.a((byte) -128, "getcookies", param1));
              var5 = nc.a(14352, var4, ';');
              for (var6 = 0; var5.length > var6; var6++) {
                var7 = var5[var6].indexOf('=');
                if (var7 >= 0 &&
                  var5[var6].substring(0, var7).trim().equals(var3)) {
                  stackIn_6_0 = var5[var6].substring(var7 + 1).trim();
                  return stackIn_6_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            if (param0 > -17) {
              field_a = (String) null;
            }
            if (va.field_g == null) {
              return param1.getParameter("settings");
            }
            stackIn_15_0 = va.field_g;
            return stackIn_15_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_18_0 = var2_ref;
            stackIn_18_1 = new StringBuilder().append("kf.A(").append(param0).append(',');
            if (param1 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw qk.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    kf(String param0) {
        try {
          this.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "kf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(boolean param0) {
        if (!param0) {
          return !vc.field_a.a(-121) ? true : false;
        }
        field_f = -47;
        return !vc.field_a.a(-121) ? true : false;
    }

    final void a(java.applet.Applet param0, byte param1) {
        try {
          if (param1 != 117) {
            kf.a((byte) -79);
          }
          ll.a(this.field_d, 31536000L, (byte) -126, param0, "jagex-last-login-method");
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "kf.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static qd a(int param0, byte param1, fa param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        qd stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 39 % ((74 - param1) / 39);
          var4 = param2.b(param0, 0);
          if (var4 == null) {
            return null;
          }
          stackIn_4_0 = new qd(var4);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("kf.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 != -77) {
          return;
        }
        field_e = null;
        field_a = null;
        field_c = null;
    }

    static {
        field_c = "Recruit new soldier";
        field_a = "P-2 FG";
        field_e = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
    }
}
