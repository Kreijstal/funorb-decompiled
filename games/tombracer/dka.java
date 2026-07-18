/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dka {
    static jea field_b;
    static String field_a;
    static String field_c;
    static String field_d;

    final static qaa a(byte param0) {
        try {
            Throwable var1 = null;
            qaa stackIn_2_0 = null;
            Throwable decompiledCaughtException = null;
            qaa stackOut_1_0 = null;
            try {
              L0: {
                stackOut_1_0 = (qaa) Class.forName("hfa").newInstance();
                stackIn_2_0 = stackOut_1_0;
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              return null;
            }
            return stackIn_2_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(byte param0) {
        field_a = null;
        field_c = null;
        field_d = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Rated game";
        field_c = "Icons";
        field_d = "Hide players in <%0>'s game";
    }
}
