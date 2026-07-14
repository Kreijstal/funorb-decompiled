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
            Throwable var2 = null;
            String var3 = null;
            java.net.URL var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var4 = param0.getCodeBase();
                if (param1 == 20000000) {
                  break L0;
                } else {
                  oj.a(-109);
                  break L0;
                }
              }
              var3 = wf.a(var4, param1 + -19999938, param0).getFile();
              Object discarded$6 = wk.a(param1 + -20014882, new Object[2], param0, "updatelinks");
              Object discarded$7 = wk.a(-14882, new Object[2], param0, "updatelinks");
              Object discarded$8 = wk.a(-14882, new Object[2], param0, "updatelinks");
              Object discarded$9 = wk.a(param1 + -20014882, new Object[2], param0, "updatelinks");
              Object discarded$10 = wk.a(-14882, new Object[2], param0, "updatelinks");
              Object discarded$11 = wk.a(-14882, new Object[2], param0, "updatelinks");
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new lh();
        field_e = "Loading extra data";
        field_c = 20000000L;
    }
}
