/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class oj {
    static lh field_d;
    static long field_c;
    static String field_e;
    static int field_b;
    static String field_a;

    final static void a(java.applet.Applet param0) {
        try {
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            java.net.URL var4 = null;
            RuntimeException stackIn_5_0 = null;
            StringBuilder stackIn_5_1 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_4_0 = null;
            StringBuilder stackOut_4_1 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            String stackOut_6_2 = null;
            RuntimeException stackOut_5_0 = null;
            StringBuilder stackOut_5_1 = null;
            String stackOut_5_2 = null;
            try {
              try {
                L0: {
                  var4 = param0.getCodeBase();
                  var3 = wf.a(var4, 62, param0).getFile();
                  Object discarded$6 = wk.a(-14882, new Object[2], param0, "updatelinks");
                  Object discarded$7 = wk.a(-14882, new Object[2], param0, "updatelinks");
                  Object discarded$8 = wk.a(-14882, new Object[2], param0, "updatelinks");
                  Object discarded$9 = wk.a(-14882, new Object[2], param0, "updatelinks");
                  Object discarded$10 = wk.a(-14882, new Object[2], param0, "updatelinks");
                  Object discarded$11 = wk.a(-14882, new Object[2], param0, "updatelinks");
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
              L1: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_4_0 = (RuntimeException) var2_ref;
                stackOut_4_1 = new StringBuilder().append("oj.F(");
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (param0 == null) {
                  stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                  stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                  stackOut_6_2 = "null";
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  break L1;
                } else {
                  stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                  stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                  stackOut_5_2 = "{...}";
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  break L1;
                }
              }
              throw t.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + 20000000 + ')');
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
        int discarded$4 = -1;
        int discarded$7 = gb.a();
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
