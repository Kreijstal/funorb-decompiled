/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g {
    byte[] field_i;
    int field_g;
    int field_h;
    static int field_l;
    static String field_e;
    static int field_a;
    byte[] field_j;
    int field_b;
    static kg field_k;
    int field_d;
    int field_f;
    int field_c;
    int field_m;

    public static void a(int param0) {
        field_e = null;
        field_k = null;
        if (param0 != -6960) {
          dl var2 = (dl) null;
          g.a(107, 48, (dl) null, 12, (byte) 17, 41);
        }
    }

    final static jg a(int param0, int param1, dl param2, int param3, byte param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        jg var7 = null;
        String var8 = null;
        java.awt.Frame var9 = null;
        Object stackIn_2_0 = null;
        jg stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = ii.a(true, param5, param2, param0, param1, param3);
          var6 = var9;
          if (var9 == null) {
            stackIn_2_0 = null;
            return (jg) (stackIn_2_0);
          }
          var7 = new jg();
          var7.field_c = var9;
          var7.field_c.add((java.awt.Component) ((Object) var7));
          var7.setBounds(0, 0, param3, param0);
          if (param4 != -81) {
            var8 = (String) null;
            g.a((java.applet.Applet) null, (String) null, -30);
          }
          var7.addFocusListener(var7);
          var7.requestFocus();
          stackIn_6_0 = var7;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_9_0 = var6_ref;
          stackIn_9_1 = new StringBuilder().append("g.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(java.applet.Applet param0, String param1, int param2) {
        try {
          String var3 = null;
          String var4 = null;
          String var5 = null;
          RuntimeException stackIn_13_0 = null;
          StringBuilder stackIn_13_1 = null;
          String stackIn_14_2 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3_ref = null;
          RuntimeException var3_ref2 = null;
          try {
            bf.field_i = param1;
            try {
              var3 = param0.getParameter("cookieprefix");
              if (param2 != -3603) {
                return;
              }
              var4 = param0.getParameter("cookiehost");
              var5 = var3 + "session=" + param1 + "; version=1; path=/; domain=" + var4;
              if (param1.length() == 0) {
                var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              fd.a(57, param0, "document.cookie=\"" + var5 + "\"");
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = decompiledCaughtException;
            }
            la.a(param0, true);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_13_0 = var3_ref2;
            stackIn_13_1 = new StringBuilder().append("g.B(");
            if (param0 == null) {
              stackIn_14_2 = "null";
            } else {
              stackIn_14_2 = "{...}";
            }
            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
            if (param1 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            throw fc.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_e = "Checking";
        field_k = new kg();
    }
}
