/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj extends he {
    static int[] field_t;
    static Boolean field_r;
    static String field_s;
    private Object field_q;

    public static void d() {
        field_t = null;
        field_r = null;
        field_s = null;
    }

    final static qg g(int param0) {
        try {
            Throwable var1 = null;
            qg stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            qg stackOut_2_0 = null;
            if (param0 == 8192) {
              try {
                L0: {
                  stackOut_2_0 = (qg) Class.forName("bq").newInstance();
                  stackIn_3_0 = stackOut_2_0;
                  break L0;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = decompiledCaughtException;
                return null;
              }
              return stackIn_3_0;
            } else {
              return null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean e(int param0) {
        if (param0 != 0) {
            field_t = null;
            return false;
        }
        return false;
    }

    final static void c() {
        if (!ks.field_b) {
            throw new IllegalStateException();
        }
        int var1 = 0;
        nq.field_a = true;
        ep.a(true, 0);
        ob.field_d = 0;
    }

    qj(Object param0, int param1) {
        super(param1);
        try {
            ((qj) this).field_q = param0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "qj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void h() {
    }

    final Object a(byte param0) {
        if (param0 != 74) {
            return null;
        }
        return ((qj) this).field_q;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new int[8192];
        field_s = null;
    }
}
