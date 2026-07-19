/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok {
    static int field_b;
    static int field_e;
    static e field_a;
    static int[][] field_c;
    static int field_f;
    static int[][] field_d;

    final static void a(int param0, int param1, byte param2) {
        ii.field_c = param1;
        if (param2 >= -124) {
            field_c = (int[][]) null;
            dg.field_ab = param0;
            return;
        }
        dg.field_ab = param0;
    }

    public static void a(int param0) {
        field_d = (int[][]) null;
        field_a = null;
        if (param0 != 32097) {
          ok.a(-93, 54, (byte) -126);
          field_c = (int[][]) null;
          return;
        } else {
          field_c = (int[][]) null;
          return;
        }
    }

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
            java.applet.Applet var4 = null;
            java.net.URL var5 = null;
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
                    var5 = param0.getCodeBase();
                    var3 = mc.a(var5, param1 ^ 0, param0).getFile();
                    discarded$6 = ff.a("updatelinks", new Object[]{"home", var3 + "home.ws"}, param0, -29585);
                    discarded$7 = ff.a("updatelinks", new Object[]{"gamelist", var3 + "togamelist.ws"}, param0, -29585);
                    discarded$8 = ff.a("updatelinks", new Object[]{"serverlist", var3 + "toserverlist.ws"}, param0, -29585);
                    if (param1 == -1) {
                      break L1;
                    } else {
                      var4 = (java.applet.Applet) null;
                      ok.a((java.applet.Applet) null, -76);
                      break L1;
                    }
                  }
                  discarded$9 = ff.a("updatelinks", new Object[]{"options", var3 + "options.ws"}, param0, -29585);
                  discarded$10 = ff.a("updatelinks", new Object[]{"terms", var3 + "terms.ws"}, param0, -29585);
                  discarded$11 = ff.a("updatelinks", new Object[]{"privacy", var3 + "privacy.ws"}, param0, -29585);
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
                stackOut_6_1 = new StringBuilder().append("ok.B(");
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
              throw oj.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_a = null;
        field_f = 0;
        field_b = 0;
        field_c = new int[][]{new int[]{-1, -1, -1}, new int[]{-1, -1, -1}, new int[]{-1, -1, -1}, new int[]{-1, -1, -1}, new int[]{-1, -1, -1}, new int[]{-1, -1, -1}, new int[]{-1, -1, -1}, new int[]{-1, -1, -1}, new int[]{0, 0, 0}, new int[]{-1, 1, -1}, new int[]{-1, 2, -1}, new int[]{1, -1, -1}, new int[]{-1, -1, 1}, new int[]{-1, -1, -1}, new int[]{-1, -1, -1}, new int[]{-1, -1, 2}};
    }
}
