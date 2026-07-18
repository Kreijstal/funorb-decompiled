/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa extends ob {
    static vh field_M;
    static vh field_J;
    static java.awt.Canvas field_K;
    static int field_H;
    static ph field_I;
    static int[] field_L;

    final static boolean a(boolean param0, int param1, int param2, int param3) {
        int stackIn_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        if (null != vl.field_m) {
          if (!vl.field_m.b((byte) 111)) {
            int discarded$2 = pa.f(118);
            if (null == fc.field_b) {
              if (sn.h(-3)) {
                return true;
              } else {
                if (Pool.a(12, 13, 15, -80)) {
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              if (!fc.field_b.f(13)) {
                if (sn.h(-3)) {
                  return true;
                } else {
                  if (Pool.a(12, 13, 15, -80)) {
                    return true;
                  } else {
                    return false;
                  }
                }
              } else {
                fc.field_b = null;
                wa.m(8421504);
                return true;
              }
            }
          } else {
            wa.m(8421504);
            return true;
          }
        } else {
          int discarded$3 = pa.f(118);
          if (null == fc.field_b) {
            if (sn.h(-3)) {
              return true;
            } else {
              L0: {
                if (Pool.a(12, 13, 15, -80)) {
                  stackOut_16_0 = 1;
                  stackIn_17_0 = stackOut_16_0;
                  break L0;
                } else {
                  stackOut_15_0 = 0;
                  stackIn_17_0 = stackOut_15_0;
                  break L0;
                }
              }
              return stackIn_17_0 != 0;
            }
          } else {
            if (!fc.field_b.f(13)) {
              if (sn.h(-3)) {
                return true;
              } else {
                if (!Pool.a(12, 13, 15, -80)) {
                  return false;
                } else {
                  return true;
                }
              }
            } else {
              fc.field_b = null;
              wa.m(8421504);
              return true;
            }
          }
        }
    }

    pa(dd param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
    }

    final static int f(int param0) {
        return pq.field_B != null ? pq.field_B.length : 0;
    }

    public static void g(int param0) {
        field_I = null;
        field_M = null;
        field_L = null;
        field_J = null;
        field_K = null;
        if (param0 >= -31) {
            field_H = -98;
        }
    }

    final int b(byte param0, int param1) {
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 6) {
          return 103;
        } else {
          L0: {
            if (-1 + ((pa) this).field_h.length == param1) {
              stackOut_3_0 = 20;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 0;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 + ((pa) this).field_x - -(param1 * ((pa) this).field_s);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = -1;
    }
}
