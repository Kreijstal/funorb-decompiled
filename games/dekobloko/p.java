/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p {
    static String field_c;
    static w field_b;
    static String field_d;
    static long field_a;

    public static void a() {
        field_b = null;
        field_d = null;
        field_c = null;
    }

    final static void a(int param0, byte param1) {
        try {
            Throwable throwable = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                Object discarded$2 = nc.a("resizing", param1 + -14511, se.h(param1 ^ -25126), new Object[1]);
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                throwable = decompiledCaughtException;
                break L1;
              }
            }
            if (param1 != -30) {
              p.a(72, (byte) -105);
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
        field_c = "Create unrated game";
        field_d = "Position";
    }
}
