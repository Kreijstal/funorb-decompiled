/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue {
    static String field_c;
    static String field_b;
    static mp field_a;
    static String field_d;
    static int[] field_e;

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 == 18031) {
          field_e = null;
          field_b = null;
          field_d = null;
          return;
        }
        String var2 = (String) null;
        ue.a((java.applet.Applet) null, false, (String) null, -37);
        field_e = null;
        field_b = null;
        field_d = null;
    }

    final static void a(java.applet.Applet param0, boolean param1, String param2, int param3) {
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
            if (param3 >= -75) {
              return;
            }
            if (qb.field_b.startsWith("win") &&
              af.b(param2, -1495)) {
              return;
            }
            try {
              param0.getAppletContext().showDocument(new java.net.URL(param2), "_blank");
              return;
            } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
              jq.a(-29901, (Throwable) null, "MGR1: " + param2);
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_12_0 = var4_ref;
            stackIn_12_1 = new StringBuilder().append("ue.B(");
            if (param0 == null) {
              stackIn_13_2 = "null";
            } else {
              stackIn_13_2 = "{...}";
            }
            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            throw r.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_c = "Game Type: Points";
        field_b = "Click to hide the Projects window.";
        field_a = new mp();
        field_d = "Off";
    }
}
