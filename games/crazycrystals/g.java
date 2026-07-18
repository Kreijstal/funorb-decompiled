/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g {
    static String field_a;
    static String field_c;
    static wb field_b;

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        field_a = null;
    }

    final static void a(byte param0, long param1) {
        try {
            int var3 = 0;
            InterruptedException var4 = null;
            Throwable decompiledCaughtException = null;
            var3 = -60 % ((64 - param0) / 39);
            {
              L0: {
                Thread.sleep(param1);
                break L0;
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
        field_a = "Click on the sticky ball!";
        field_c = "You";
    }
}
