/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vo {
    static String field_b;
    static String field_a;

    public static void a(boolean param0) {
        field_b = null;
        if (!param0) {
            return;
        }
        field_a = null;
    }

    final static void a(int param0, String param1, java.applet.Applet param2) {
        try {
            Exception exception = null;
            java.net.URL var3 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var3 = new java.net.URL(param2.getCodeBase(), param1);
                var3 = gh.a(param2, var3, (byte) 67);
                ec.a(true, var3.toString(), param2, (byte) -17);
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                exception = (Exception) (Object) decompiledCaughtException;
                exception.printStackTrace();
                break L1;
              }
            }
            if (param0 != 31251) {
              field_b = null;
              return;
            } else {
              return;
            }
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
        field_b = "Checking";
        field_a = "to store your progress.";
    }
}
