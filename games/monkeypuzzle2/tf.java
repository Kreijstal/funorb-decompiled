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
            Object var4 = null;
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
            Throwable var2 = null;
            String var3 = null;
            java.net.URL var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var4 = param1.getCodeBase();
                var3 = uf.a(param1, (byte) 113, var4).getFile();
                Object discarded$6 = mf.a(126, "updatelinks", param1, new Object[2]);
                Object discarded$7 = mf.a(124, "updatelinks", param1, new Object[2]);
                Object discarded$8 = mf.a(124, "updatelinks", param1, new Object[2]);
                Object discarded$9 = mf.a(123, "updatelinks", param1, new Object[2]);
                if (param0 < -1) {
                  break L0;
                } else {
                  field_a = null;
                  break L0;
                }
              }
              Object discarded$10 = mf.a(123, "updatelinks", param1, new Object[2]);
              Object discarded$11 = mf.a(121, "updatelinks", param1, new Object[2]);
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
        field_b = 640;
    }
}
