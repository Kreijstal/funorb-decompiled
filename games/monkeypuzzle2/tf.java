/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf {
    static int field_b;
    static int[] field_c;
    static ai[] field_a;

    final static void a(byte param0, int param1, int param2) {
        fl.field_b = param1;
        jc.field_b = param2;
        if (param0 <= 11) {
            java.applet.Applet var4 = (java.applet.Applet) null;
            tf.a((byte) -74, (java.applet.Applet) null);
        }
    }

    public static void a(int param0) {
        if (param0 != 640) {
            return;
        }
        field_c = null;
        field_a = null;
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            java.net.URL var4 = null;
            try {
              try {
                L0: {
                  L1: {
                    var4 = param1.getCodeBase();
                    var3 = uf.a(param1, (byte) 113, var4).getFile();
                    mf.a(126, "updatelinks", param1, new Object[]{"home", var3 + "home.ws"});
                    mf.a(124, "updatelinks", param1, new Object[]{"gamelist", var3 + "togamelist.ws"});
                    mf.a(124, "updatelinks", param1, new Object[]{"serverlist", var3 + "toserverlist.ws"});
                    mf.a(123, "updatelinks", param1, new Object[]{"options", var3 + "options.ws"});
                    if (param0 < -1) {
                      break L1;
                    } else {
                      field_a = (ai[]) null;
                      break L1;
                    }
                  }
                  mf.a(123, "updatelinks", param1, new Object[]{"terms", var3 + "terms.ws"});
                  mf.a(121, "updatelinks", param1, new Object[]{"privacy", var3 + "privacy.ws"});
                  break L0;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2 = decompiledCaughtException;
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var2_ref);

                stackIn_8_1 = new StringBuilder().append("tf.B(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L2;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L2;
                }
              }
              throw la.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = 640;
    }
}
