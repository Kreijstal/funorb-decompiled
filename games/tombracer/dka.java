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
            qaa stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            qaa stackOut_2_0 = null;
            if (param0 <= -61) {
              try {
                stackOut_2_0 = (qaa) Class.forName("hfa").newInstance();
                stackIn_3_0 = stackOut_2_0;
              } catch (java.lang.Throwable decompiledCaughtParameter) {
                decompiledCaughtException = decompiledCaughtParameter;
                return stackIn_3_0;
              }
            } else {
              return null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    public static void b(byte param0) {
        field_a = null;
        field_c = null;
        if (param0 != 7) {
            return;
        }
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
