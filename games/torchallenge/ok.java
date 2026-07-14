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
            field_c = null;
            dg.field_ab = param0;
            return;
        }
        dg.field_ab = param0;
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        if (param0 != 32097) {
          ok.a(-93, 54, (byte) -126);
          field_c = null;
          return;
        } else {
          field_c = null;
          return;
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            Object var4 = null;
            java.net.URL var5 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var5 = param0.getCodeBase();
                var3 = mc.a(var5, param1 ^ 0, param0).getFile();
                Object discarded$6 = ff.a("updatelinks", new Object[2], param0, -29585);
                Object discarded$7 = ff.a("updatelinks", new Object[2], param0, -29585);
                Object discarded$8 = ff.a("updatelinks", new Object[2], param0, -29585);
                if (param1 == -1) {
                  break L0;
                } else {
                  var4 = null;
                  ok.a((java.applet.Applet) null, -76);
                  break L0;
                }
              }
              Object discarded$9 = ff.a("updatelinks", new Object[2], param0, -29585);
              Object discarded$10 = ff.a("updatelinks", new Object[2], param0, -29585);
              Object discarded$11 = ff.a("updatelinks", new Object[2], param0, -29585);
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var2 = decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = null;
        field_f = 0;
        field_b = 0;
        field_c = new int[][]{new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3]};
    }
}
