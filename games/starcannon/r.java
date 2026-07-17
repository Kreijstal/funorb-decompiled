/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r {
    static ge field_c;
    static int field_d;
    static lh field_b;
    static int field_a;

    public static void a() {
        field_b = null;
        field_c = null;
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final static void a(int param0, long param1) {
        try {
            InterruptedException var3 = null;
            Throwable decompiledCaughtException = null;
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
    }
}
