/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pf {
    private static long field_a;
    static ta field_c;
    static String field_b;

    final synchronized static long a(int param0) {
        long var1 = 0L;
        if (param0 == 0) {
          var1 = System.currentTimeMillis();
          if (~field_a < ~var1) {
            bb.field_b = bb.field_b + (-var1 + field_a);
            field_a = var1;
            return var1 - -bb.field_b;
          } else {
            field_a = var1;
            return var1 - -bb.field_b;
          }
        } else {
          return -11L;
        }
    }

    final static int b(int param0) {
        return -sc.field_g + h.field_b;
    }

    final static int a(byte param0, int param1) {
        int var2 = -52 % ((-34 - param0) / 53);
        return jg.a((byte) 80, param1, pb.field_n);
    }

    final static void a(byte param0, vl param1, int param2) {
        hb var6 = null;
        int var5 = 0;
        try {
            var6 = gf.field_c;
            int var4 = 95 / ((param0 - -41) / 42);
            var6.b(true, 4);
            var6.field_h = var6.field_h + 1;
            var5 = var6.field_h;
            var6.b(1, -49152);
            var6.b(param1.field_m, -49152);
            var6.b(param1.field_n, -49152);
            var6.a(-803539344, param1.field_l);
            var6.a(-803539344, param1.field_i);
            var6.a(-803539344, param1.field_e);
            var6.a(-803539344, param1.field_k);
            int discarded$0 = var6.a((byte) -47, var5);
            var6.a(-var5 + var6.field_h, (byte) -116);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "pf.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + 4 + ')');
        }
    }

    public static void a(byte param0) {
        int var1 = 39;
        field_b = null;
        field_c = null;
    }

    final static void a(boolean param0) {
        try {
            Exception var1 = null;
            java.lang.reflect.Method var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object var4 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  var1_ref = Runtime.class.getMethod("maxMemory", new Class[0]);
                  if (var1_ref == null) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        var2_ref = Runtime.getRuntime();
                        var4 = null;
                        var3 = (Long) var1_ref.invoke((Object) (Object) var2_ref, (Object[]) null);
                        gb.field_i = (int)(var3.longValue() / 1048576L) + 1;
                        decompiledRegionSelector0 = 0;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var2 = decompiledCaughtException;
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
                var1 = (Exception) (Object) decompiledCaughtException;
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = null;
    }
}
