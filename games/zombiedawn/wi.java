/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi {
    static int field_a;
    static int field_e;
    static int field_c;
    static rc field_b;
    static String field_d;

    final static void a(String param0, java.applet.Applet param1, boolean param2, int param3) {
        try {
          java.net.MalformedURLException var4 = null;
          RuntimeException var4_ref = null;
          RuntimeException stackIn_13_0 = null;
          StringBuilder stackIn_13_1 = null;
          String stackIn_14_2 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param3 != -20517) {
              return;
            }
            if (ec.field_n.startsWith("win") &&
              kj.a(param0, 27994)) {
              return;
            }
            try {
              param1.getAppletContext().showDocument(new java.net.URL(param0), "_blank");
              return;
            } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
              ae.a((Throwable) null, param3 ^ -30848, "MGR1: " + param0);
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_13_0 = var4_ref;
            stackIn_13_1 = new StringBuilder().append("wi.B(");
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
            throw sh.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 != 61) {
          return;
        }
        field_b = null;
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        mg var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = ZombieDawn.field_J;
        try {
          var4 = (mg) (bg.field_i.b((byte) 26));
          while (var4 != null) {
            oe.a(param1, -19004, var4);
            var4 = (mg) (bg.field_i.a(false));
          }
          if (param0 == 0) {
            return;
          }
          field_e = -110;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "wi.C(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_d = "You are not currently logged in to the<nbsp>game.";
        field_b = null;
    }
}
