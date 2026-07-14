/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p {
    static String field_c;
    static w field_b;
    static String field_d;
    static long field_a;

    public static void a(int param0) {
        if (param0 < 104) {
          field_b = null;
          field_b = null;
          field_d = null;
          field_c = null;
          return;
        } else {
          field_b = null;
          field_d = null;
          field_c = null;
          return;
        }
    }

    final static void a(int param0, byte param1) {
        try {
            Throwable throwable = null;
            Throwable decompiledCaughtException = null;
            try {
              Object discarded$2 = nc.a("resizing", param1 + -14511, se.h(param1 ^ -25126), new Object[1]);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              throwable = decompiledCaughtException;
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
