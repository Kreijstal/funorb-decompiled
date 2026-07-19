/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r {
    static ge field_c;
    static int field_d;
    static lh field_b;
    static int field_a;

    public static void a(int param0) {
        field_b = null;
        if (param0 > -43) {
            field_d = -40;
            field_c = null;
            return;
        }
        field_c = null;
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final static void a(int param0, long param1) {
        try {
            try {
                Thread.sleep(param1);
            } catch (InterruptedException interruptedException) {
            }
            if (param0 != 18780) {
                r.a(82);
                return;
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
