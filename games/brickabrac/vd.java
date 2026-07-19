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
            int stackIn_12_0 = 0;
            int stackIn_14_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_13_0 = 0;
            int stackOut_11_0 = 0;
            L0: {
              if (param0 == 20) {
                break L0;
              } else {
                vd.a(-79);
                break L0;
              }
            }
            if (param1 > jl.field_e.field_l) {
              if (null != eq.field_g) {
                try {
                  L1: {
                    var2_int = eq.field_g.d(10434);
                    if (0 >= var2_int) {
                      if (var2_int < 0) {
                        hn.a((byte) 123);
                        return false;
                      } else {
                        if (-30001L <= (de.f(param0 + -6812) ^ -1L)) {
                          decompiledRegionSelector0 = 2;
                          break L1;
                        } else {
                          hn.a((byte) 123);
                          return false;
                        }
                      }
                    } else {
                      L2: {
                        if (var2_int > param1 - jl.field_e.field_l) {
                          var2_int = -jl.field_e.field_l + param1;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      eq.field_g.a(param0 + 25806, jl.field_e.field_k, var2_int, jl.field_e.field_l);
                      oj.field_t = ue.a(false);
                      jl.field_e.field_l = jl.field_e.field_l + var2_int;
                      if (param1 <= jl.field_e.field_l) {
                        jl.field_e.field_l = 0;
                        stackOut_13_0 = 1;
                        stackIn_14_0 = stackOut_13_0;
                        decompiledRegionSelector0 = 1;
                        break L1;
                      } else {
                        stackOut_11_0 = 0;
                        stackIn_12_0 = stackOut_11_0;
                        decompiledRegionSelector0 = 0;
                        break L1;
                      }
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = (IOException) (Object) decompiledCaughtException;
                  hn.a((byte) 111);
                  return false;
                }
                if (decompiledRegionSelector0 == 0) {
                  return stackIn_12_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 1) {
                    return stackIn_14_0 != 0;
                  } else {
                    return false;
                  }
                }
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

    final static void a(int param0) {
        mm.h(-29448);
        if (param0 >= -126) {
            field_a = (mo) null;
        }
    }

    public static void a(boolean param0) {
        field_f = null;
        field_a = null;
        if (!param0) {
            return;
        }
        field_b = null;
        field_d = null;
    }

    static {
        field_e = true;
        field_c = 20;
        field_b = new int[8192];
    }
}
