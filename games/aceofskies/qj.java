/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj extends he {
    static int[] field_t;
    static Boolean field_r;
    static String field_s;
    private Object field_q;

    public static void d(byte param0) {
        field_t = null;
        if (param0 > -87) {
            field_s = (String) null;
            field_r = null;
            field_s = null;
            return;
        }
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
                stackOut_2_0 = (qg) Class.forName("bq").newInstance();
                stackIn_3_0 = stackOut_2_0;
              } catch (java.lang.Throwable decompiledCaughtParameter) {
                decompiledCaughtException = decompiledCaughtParameter;
                return (qg) (Object) stackIn_3_0;
              }
            } else {
              return (qg) null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    final boolean e(int param0) {
        if (param0 != 0) {
            field_t = (int[]) null;
            return false;
        }
        return false;
    }

    final static void c(byte param0) {
        int var1 = 0;
        if (!ks.field_b) {
          throw new IllegalStateException();
        } else {
          var1 = 71 % ((param0 - -64) / 57);
          nq.field_a = true;
          ep.a(true, 0);
          ob.field_d = 0;
          return;
        }
    }

    qj(Object param0, int param1) {
        super(param1);
        ((qj) this).field_q = param0;
    }

    final static void h(int param0) {
        if (param0 <= 28) {
            qg discarded$0 = qj.g(-8);
        }
    }

    final Object a(byte param0) {
        if (param0 != 74) {
            return (Object) null;
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
