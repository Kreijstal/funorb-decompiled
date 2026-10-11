/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok {
    static ff field_a;

    final static void a(int param0, java.applet.Applet param1) {
        try {
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          String var3 = null;
          java.net.URL var4 = null;
          try {
            try {
              var4 = param1.getCodeBase();
              var3 = dh.a(param1, (byte) 39, var4).getFile();
              kj.a(22102, "updatelinks", new Object[]{"home", var3 + "home.ws"}, param1);
              kj.a(22102, "updatelinks", new Object[]{"gamelist", var3 + "togamelist.ws"}, param1);
              kj.a(22102, "updatelinks", new Object[]{"serverlist", var3 + "toserverlist.ws"}, param1);
              kj.a(22102, "updatelinks", new Object[]{"options", var3 + "options.ws"}, param1);
              if (param0 != 9507) {
                ok.a(-5);
              }
              kj.a(param0 ^ 29557, "updatelinks", new Object[]{"terms", var3 + "terms.ws"}, param1);
              kj.a(22102, "updatelinks", new Object[]{"privacy", var3 + "privacy.ws"}, param1);
              return;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref;
            stackIn_8_1 = new StringBuilder().append("ok.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw ch.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        if (param0 < 29) {
          return;
        }
        field_a = null;
    }

    static {
    }
}
