/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc {
    static int field_b;
    static int field_a;

    final static void a(int param0, int param1) {
        mi var2 = uh.field_Wb;
        var2.j(param1, 122);
        var2.f(1, -117);
        if (param0 < -25) {
          var2.f(1, -90);
          return;
        }
        java.applet.Applet var3 = (java.applet.Applet) null;
        hc.a((String) null, -33, true, (java.applet.Applet) null);
        var2.f(1, -90);
    }

    final static void a(String param0, int param1, boolean param2, java.applet.Applet param3) {
        try {
          java.net.MalformedURLException var4 = null;
          RuntimeException var4_ref = null;
          java.applet.Applet var5 = null;
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (jj.field_v.startsWith("win") &&
              eb.a(param0, true)) {
              return;
            }
            try {
              if (param1 != 16011) {
                var5 = (java.applet.Applet) null;
                hc.a((String) null, -87, false, (java.applet.Applet) null);
              }
              param3.getAppletContext().showDocument(new java.net.URL(param0), "_blank");
              return;
            } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
              ke.a((Throwable) null, "MGR1: " + param0, 0);
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var4_ref;
            stackIn_11_1 = new StringBuilder().append("hc.B(");
            if (param0 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            throw wn.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
