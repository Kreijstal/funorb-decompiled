/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sh extends DualLinkNode {
    int field_q;
    static String field_r;
    static String field_s;

    abstract boolean d(byte param0);

    abstract Object e(byte param0);

    public static void f(int param0) {
        field_s = null;
        field_r = null;
        if (param0 != 0) {
          java.net.URL var2 = (java.net.URL) null;
          sh.a((byte) -113, (java.applet.Applet) null, (java.net.URL) null);
        }
    }

    final static ee a(byte param0, java.applet.Applet param1) {
        ee var5 = null;
        String stackIn_18_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          String var2 = dc.a((byte) 90, "jagex-last-login-method", param1);
          if (param0 != -1) {
            ee stackIn_3_0 = (ee) null;
            return stackIn_3_0;
          }
          if (var2 == null) {
            ee stackIn_6_0 = qj.field_g;
            return stackIn_6_0;
          }
          ee[] var3 = BoundedRandomAccessFile.a(false);
          int var4 = 0;
          while (true) {
            if (var3.length <= var4) {
              ee stackIn_14_0 = qj.field_g;
              return stackIn_14_0;
            }
            var5 = var3[var4];
            if (!var5.a(var2, (byte) 119)) {
              var4++;
              continue;
            }
            break;
          }
          ee stackIn_11_0 = var5;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2_ref = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var2_ref;
          StringBuilder stackIn_17_1 = new StringBuilder().append("sh.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    sh(int param0) {
        this.field_q = param0;
    }

    final static java.net.URL a(byte param0, java.applet.Applet param1, java.net.URL param2) {
        Object var3 = null;
        String stackIn_14_2 = null;
        String stackIn_17_2 = null;
        try {
          var3 = null;
          Object var4 = null;
          if (param0 < 11) {
            java.net.URL stackIn_2_0 = (java.net.URL) null;
            return stackIn_2_0;
          }
          if (null != oh.field_p &&
            !oh.field_p.equals(param1.getParameter("settings"))) {
            var3 = oh.field_p;
            var4 = var3;
            var4 = var3;
          }
          if (wi.field_i != null &&
            !wi.field_i.equals(param1.getParameter("session"))) {
            var4 = wi.field_i;
          }
          java.net.URL stackIn_10_0 = vn.a((String) (var4), -1, (String) (var3), param2, 1);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          Object stackIn_13_0 = var3;
          StringBuilder stackIn_13_1 = new StringBuilder().append("sh.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          StringBuilder stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) (stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_r = "Escape Vector Expansion";
        field_s = "Retry";
    }
}
