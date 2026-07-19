/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class oj {
    static lh field_d;
    static long field_c;
    static String field_e;
    static int field_b;
    static String field_a;

    final static void a(java.applet.Applet param0, int param1) {
        try {
            Object discarded$6 = null;
            Object discarded$7 = null;
            Object discarded$8 = null;
            Object discarded$9 = null;
            Object discarded$10 = null;
            Object discarded$11 = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            java.net.URL var4 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              try {
                L0: {
                  L1: {
                    var4 = param0.getCodeBase();
                    if (param1 == 20000000) {
                      break L1;
                    } else {
                      oj.a(-109);
                      break L1;
                    }
                  }
                  var3 = wf.a(var4, param1 + -19999938, param0).getFile();
                  discarded$6 = wk.a(param1 + -20014882, new Object[]{"home", var3 + "home.ws"}, param0, "updatelinks");
                  discarded$7 = wk.a(-14882, new Object[]{"gamelist", var3 + "togamelist.ws"}, param0, "updatelinks");
                  discarded$8 = wk.a(-14882, new Object[]{"serverlist", var3 + "toserverlist.ws"}, param0, "updatelinks");
                  discarded$9 = wk.a(param1 + -20014882, new Object[]{"options", var3 + "options.ws"}, param0, "updatelinks");
                  discarded$10 = wk.a(-14882, new Object[]{"terms", var3 + "terms.ws"}, param0, "updatelinks");
                  discarded$11 = wk.a(-14882, new Object[]{"privacy", var3 + "privacy.ws"}, param0, "updatelinks");
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
                stackOut_6_0 = (RuntimeException) (var2_ref);
                stackOut_6_1 = new StringBuilder().append("oj.F(");
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L2;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L2;
                }
              }
              throw t.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        if (param0 > -50) {
            return;
        }
        field_e = null;
    }

    final static void a(int param0, byte param1) {
        int discarded$3 = gb.a(-1);
        if (param1 >= -89) {
            oj.a(70);
        }
    }

    abstract byte[] a(byte param0);

    abstract void a(byte[] param0, boolean param1);

    static {
        field_d = new lh();
        field_e = "Loading extra data";
        field_c = 20000000L;
    }
}
