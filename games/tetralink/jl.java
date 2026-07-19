/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl {
    static je field_a;
    static int field_e;
    static String[] field_b;
    static String field_d;
    static String field_c;

    public static void b(int param0) {
        field_a = null;
        field_d = null;
        field_b = null;
        if (param0 != -25534) {
            jl.a(69);
        }
        field_c = null;
    }

    final static boolean a(boolean param0) {
        nm var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        nm var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_15_0 = 0;
        var3 = TetraLink.field_J;
        try {
          L0: {
            var4 = (nm) ((Object) bo.field_C.c(param0));
            var1 = var4;
            if (var1 == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var2 = 0;
              L1: while (true) {
                if (var2 >= var1.field_r) {
                  stackOut_18_0 = 1;
                  stackIn_19_0 = stackOut_18_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  L2: {
                    if (null != var4.field_x[var2]) {
                      if (-1 != (var4.field_x[var2].field_d ^ -1)) {
                        break L2;
                      } else {
                        stackOut_10_0 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (null != var4.field_u[var2]) {
                      if (var4.field_u[var2].field_d != 0) {
                        break L3;
                      } else {
                        stackOut_15_0 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    } else {
                      break L3;
                    }
                  }
                  var2++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1_ref), "jl.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0 != 0;
            } else {
              return stackIn_19_0 != 0;
            }
          }
        }
    }

    final static void a(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param0 >= 108) {
            break L0;
          } else {
            field_b = (String[]) null;
            break L0;
          }
        }
        L1: {
          if (kd.field_g != null) {
            var1 = kd.field_g;
            synchronized (var1) {
              L2: {
                kd.field_g = null;
                break L2;
              }
            }
            break L1;
          } else {
            break L1;
          }
        }
    }

    final static void a(int param0, int param1, int param2) {
        int incrementValue$7 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = TetraLink.field_J;
        try {
          L0: {
            ra.c(640 + -param1 >> 1484464961, param2 - param0 >> 699148417, param1, param0, 9408511);
            var3_int = -param0;
            L1: while (true) {
              if ((var3_int ^ -1) <= -1) {
                break L0;
              } else {
                var4 = 640 * (var3_int + (480 - -param0 >> -74386943)) + (640 - param1 >> 319873761);
                var5 = param1;
                L2: while (true) {
                  var5--;
                  if (0 > var5) {
                    var3_int += 2;
                    continue L1;
                  } else {
                    incrementValue$7 = var4;
                    var4++;
                    ra.field_b[incrementValue$7] = 11513855;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var3), "jl.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_e = 0;
        field_d = "<%0> has left.";
    }
}
