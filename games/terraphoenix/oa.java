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
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            int var2 = 0;
            Runtime var3 = null;
            Throwable var3_ref = null;
            Long var4 = null;
            Object[] var5 = null;
            try {
              L0: {
                L1: {
                  var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
                  var2 = -16 / ((33 - param0) / 62);
                  if (var1 == null) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        var3 = Runtime.getRuntime();
                        var5 = (Object[]) null;
                        var4 = (Long) (var1.invoke((Object) (var3), (Object[]) null));
                        qb.field_g = (int)(var4.longValue() / 1048576L) + 1;
                        decompiledRegionSelector0 = 0;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var3_ref = decompiledCaughtException;
                        decompiledRegionSelector0 = 1;
                        break L3;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var1_ref = (Exception) (Object) decompiledCaughtException;
                break L4;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = "10000pts";
    }
}
