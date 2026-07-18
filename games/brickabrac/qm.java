/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qm {
    static ql field_d;
    static String field_b;
    static int field_a;
    static String field_e;
    static String field_c;

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        field_c = null;
        field_e = null;
    }

    final static void a(int param0, int param1) {
        try {
            int var2 = 0;
            Throwable var3 = null;
            Throwable decompiledCaughtException = null;
            var2 = -25;
            try {
              L0: {
                Object discarded$1 = ne.a(new Object[1], 78, uc.e((byte) -82), "resizing");
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var3 = decompiledCaughtException;
                break L1;
              }
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
        field_b = "Send private Quick Chat to <%0>";
        field_e = "Loading extra data";
        field_c = "Accept unrated rematch";
    }
}
