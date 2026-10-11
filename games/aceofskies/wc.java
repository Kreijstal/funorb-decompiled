/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc {
    static int[] field_a;

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
          java.applet.Applet var2 = (java.applet.Applet) null;
          wc.a((String) null, (java.applet.Applet) null, -86, true);
        }
    }

    final static void a(String param0, java.applet.Applet param1, int param2, boolean param3) {
        try {
          java.net.MalformedURLException var4 = null;
          RuntimeException var4_ref = null;
          java.applet.Applet var5 = null;
          RuntimeException stackIn_12_0 = null;
          StringBuilder stackIn_12_1 = null;
          String stackIn_13_2 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param2 != 14301) {
              var5 = (java.applet.Applet) null;
              wc.a((String) null, (java.applet.Applet) null, 36, true);
            }
            if (rk.field_f.startsWith("win") &&
              km.a(param0, param2 - 14300)) {
              return;
            }
            try {
              param1.getAppletContext().showDocument(new java.net.URL(param0), "_blank");
              return;
            } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
              v.a("MGR1: " + param0, (byte) -52, (Throwable) null);
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_12_0 = var4_ref;
            stackIn_12_1 = new StringBuilder().append("wc.A(");
            if (param0 == null) {
              stackIn_13_2 = "null";
            } else {
              stackIn_13_2 = "{...}";
            }
            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
            if (param1 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            throw pn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(byte param0, int param1, int param2) {
        if (param0 < -38) {
          return (33 & param1) != 0 ? true : false;
        }
        field_a = (int[]) null;
        return (33 & param1) != 0 ? true : false;
    }

    static {
        field_a = new int[8192];
    }
}
