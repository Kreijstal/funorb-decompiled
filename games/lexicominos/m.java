/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m {
    private String field_c;
    static byte[][] field_a;
    static String field_b;

    public static void a(int param0) {
        field_a = (byte[][]) null;
        field_b = null;
        if (param0 != 1000) {
          field_a = (byte[][]) null;
        }
    }

    final static int a(int param0, byte param1) {
        int var2 = 70 / ((param1 + 35) / 38);
        param0 = param0 & 8191;
        if (param0 >= 4096) {
          return param0 < 6144 ? -v.field_w[-4096 + param0] : -v.field_w[-param0 + 8192];
        }
        return param0 >= 2048 ? v.field_w[4096 - param0] : v.field_w[param0];
    }

    final boolean a(int param0, String param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 73) {
            this.field_c = (String) null;
          }
          stackIn_3_0 = this.field_c.equals(param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("m.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(String param0, int param1, boolean param2) {
        try {
          gb.field_d = true;
          lh.field_w = param2 ? true : false;
          int var3_int = -67 / ((param1 + 72) / 33);
          jj.field_a = new uc(ug.field_A, ra.field_c, param0, ca.field_k, lh.field_w);
          ug.field_A.a(-14579, jj.field_a);
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "m.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final void a(java.applet.Applet param0, int param1) {
        if (param1 != 4096) {
          return;
        }
        try {
          te.a("jagex-last-login-method", 31536000L, param0, this.field_c, param1 - 3096);
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "m.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0, boolean param1, String param2, java.applet.Applet param3) {
        try {
          java.net.MalformedURLException var4 = null;
          RuntimeException var4_ref = null;
          RuntimeException stackIn_12_0 = null;
          StringBuilder stackIn_12_1 = null;
          String stackIn_13_2 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (ab.field_b.startsWith("win") &&
              ul.a(param2, 14080)) {
              return;
            }
            if (!param1) {
              return;
            }
            try {
              param3.getAppletContext().showDocument(new java.net.URL(param2), "_blank");
              return;
            } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
              uj.a("MGR1: " + param2, (Throwable) null, 1);
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_12_0 = var4_ref;
            stackIn_12_1 = new StringBuilder().append("m.F(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_13_2 = "null";
            } else {
              stackIn_13_2 = "{...}";
            }
            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
            if (param3 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            throw ld.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    m(String param0) {
        try {
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "m.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Creating your account";
        field_a = new byte[1000][];
    }
}
