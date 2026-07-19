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
        if (param0 > -100) {
            field_b = (String) null;
            field_e = null;
            return;
        }
        field_e = null;
    }

    final static void a(int param0, int param1) {
        try {
            Object discarded$1 = null;
            int var2 = 0;
            Throwable var3 = null;
            Throwable decompiledCaughtException = null;
            var2 = 25 / ((42 - param0) / 40);
            try {
              L0: {
                discarded$1 = ne.a(new Object[]{new Integer(param1)}, 78, uc.e((byte) -82), "resizing");
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
        field_b = "Send private Quick Chat to <%0>";
        field_e = "Loading extra data";
        field_c = "Accept unrated rematch";
    }
}
