/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok {
    static ff field_a;

    final static void a(int param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            java.net.URL var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var4 = param1.getCodeBase();
                var3 = dh.a(param1, (byte) 39, var4).getFile();
                Object discarded$6 = kj.a(22102, "updatelinks", new Object[2], param1);
                Object discarded$7 = kj.a(22102, "updatelinks", new Object[2], param1);
                Object discarded$8 = kj.a(22102, "updatelinks", new Object[2], param1);
                Object discarded$9 = kj.a(22102, "updatelinks", new Object[2], param1);
                if (param0 == 9507) {
                  break L0;
                } else {
                  ok.a(-5);
                  break L0;
                }
              }
              Object discarded$10 = kj.a(param0 ^ 29557, "updatelinks", new Object[2], param1);
              Object discarded$11 = kj.a(22102, "updatelinks", new Object[2], param1);
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
        if (param0 < 29) {
            return;
        }
        field_a = null;
    }

    static {
    }
}
