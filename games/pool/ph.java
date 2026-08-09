/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph {
    static int[] field_g;
    static vh field_d;
    static String field_a;
    static volatile long field_b;
    static dd field_f;
    static int field_e;
    static String field_c;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static int a(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Pool.field_O;
        try {
          L0: {
            var1_int = -124 / ((param0 - 38) / 54);
            wd.field_Ub.a(-120, qr.field_b, true, sm.field_D);
            wd.field_Ub.h((byte) 126);
            L1: while (true) {
              if (!n.h(127)) {
                if (0 == (jd.field_b ^ -1)) {
                  if (!ep.field_z) {
                    if (pa.field_I == ra.field_e) {
                      stackIn_13_0 = 1;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      if (ig.field_j.a(112)) {
                        if (ra.field_e == wd.field_Lb) {
                          stackIn_20_0 = 2;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          return -1;
                        }
                      } else {
                        stackIn_16_0 = 1;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  } else {
                    stackIn_9_0 = 3;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  var2 = jd.field_b;
                  lf.a(-1, (byte) 92);
                  stackIn_6_0 = var2;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                wd.field_Ub.a(-81, qi.field_a, ml.field_b);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1), "ph.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_16_0;
              } else {
                return stackIn_20_0;
              }
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_g = null;
        field_a = null;
        field_c = null;
        field_d = null;
        if (param0) {
          field_a = (String) null;
          field_f = null;
          return;
        } else {
          field_f = null;
          return;
        }
    }

    static {
        field_c = "Remove <%0> from ignore list";
        field_b = 0L;
        field_a = "You would have lost!";
    }
}
