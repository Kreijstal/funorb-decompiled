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
                L0: {
                  stackOut_2_0 = (qg) (Class.forName("bq").newInstance());
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
              return (qg) null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
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
        try {
            this.field_q = param0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "qj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void h(int param0) {
        qg discarded$0 = null;
        if (param0 <= 28) {
            discarded$0 = qj.g(-8);
        }
    }

    final Object a(byte param0) {
        if (param0 != 74) {
            return (Object) null;
        }
        return this.field_q;
    }

    static {
        field_t = new int[8192];
        field_s = null;
    }
}
