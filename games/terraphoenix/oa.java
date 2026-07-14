/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa {
    static int[] field_c;
    static String field_b;
    static int[] field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != 7463) {
            return;
        }
        field_b = null;
    }

    final static void a(byte param0) {
        try {
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            int var2 = 0;
            Throwable var3 = null;
            Runtime var3_ref = null;
            Long var4 = null;
            Object var5 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var1 = Runtime.class.getMethod("maxMemory", new Class[0]);
                var2 = -16 / ((33 - param0) / 62);
                if (var1 == null) {
                  break L0;
                } else {
                  try {
                    var3_ref = Runtime.getRuntime();
                    var5 = null;
                    var4 = (Long) var1.invoke((Object) (Object) var3_ref, (Object[]) null);
                    qb.field_g = (int)(var4.longValue() / 1048576L) + 1;
                  } catch (java.lang.Throwable decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                    return;
                  }
                  break L0;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              var3 = decompiledCaughtException;
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
        field_b = "10000pts";
    }
}
