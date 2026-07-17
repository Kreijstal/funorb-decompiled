/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vd {
    static int[] field_b;
    static String field_d;
    static boolean field_e;
    static mo field_a;
    static int field_c;
    static ih field_f;

    final static boolean a(int param0, int param1) {
        try {
            int var2_int = 0;
            IOException var2 = null;
            int stackIn_10_0 = 0;
            int stackIn_12_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_11_0 = 0;
            int stackOut_9_0 = 0;
            if (param1 > jl.field_e.field_l) {
              if (null != eq.field_g) {
                try {
                  L0: {
                    var2_int = eq.field_g.d(10434);
                    if (0 >= var2_int) {
                      if (var2_int < 0) {
                        hn.a((byte) 123);
                        return false;
                      } else {
                        int discarded$3 = -6792;
                        if (de.f() <= 30000L) {
                          break L0;
                        } else {
                          hn.a((byte) 123);
                          return false;
                        }
                      }
                    } else {
                      L1: {
                        if (var2_int > param1 - jl.field_e.field_l) {
                          var2_int = -jl.field_e.field_l + param1;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      eq.field_g.a(25826, jl.field_e.field_k, var2_int, jl.field_e.field_l);
                      oj.field_t = ue.a(false);
                      jl.field_e.field_l = jl.field_e.field_l + var2_int;
                      if (param1 <= jl.field_e.field_l) {
                        jl.field_e.field_l = 0;
                        stackOut_11_0 = 1;
                        stackIn_12_0 = stackOut_11_0;
                        return stackIn_12_0 != 0;
                      } else {
                        stackOut_9_0 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        return stackIn_10_0 != 0;
                      }
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = (IOException) (Object) decompiledCaughtException;
                  hn.a((byte) 111);
                  return false;
                }
                return false;
              } else {
                return false;
              }
            } else {
              return true;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a() {
        int discarded$0 = -29448;
        mm.h();
    }

    public static void a(boolean param0) {
        field_f = null;
        field_a = null;
        field_b = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = true;
        field_c = 20;
        field_b = new int[8192];
    }
}
