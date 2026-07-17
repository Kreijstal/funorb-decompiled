/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve extends ci {
    String field_Ob;
    ci field_Eb;
    static long field_Pb;
    ci field_Mb;
    String field_Fb;
    String field_Kb;
    static jc field_Nb;
    String field_Lb;
    int field_Ib;
    ci field_Jb;
    static String field_Qb;
    static int[] field_Hb;
    static int[] field_Gb;

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param5 == 2) {
          if (param6 >= param1) {
            if (param6 < param1 - -param2) {
              if (param0 <= param3) {
                if (param0 - -param4 <= param3) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          field_Gb = null;
          if (param6 >= param1) {
            if (param6 < param1 - -param2) {
              if (param0 <= param3) {
                if (param0 - -param4 <= param3) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final static boolean k(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 > -50) {
          L0: {
            boolean discarded$9 = ve.k(-78);
            if (null == me.field_a) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (null == me.field_a) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    ve() {
        super(0L, (ci) null);
    }

    final static int f() {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_9_0 = 0;
        var2 = Chess.field_G;
        try {
          L0: {
            boolean discarded$28 = jh.field_e.a(-120, hd.field_d, vj.field_h, true);
            jh.field_e.f((byte) 70);
            L1: while (true) {
              int discarded$29 = 18954;
              if (!kf.d()) {
                if (rn.field_a != -1) {
                  var1_int = rn.field_a;
                  uk.a(false, -1);
                  stackOut_6_0 = var1_int;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                } else {
                  if (!cf.field_Nb) {
                    if (vl.field_A == ci.field_ub) {
                      stackOut_13_0 = 1;
                      stackIn_14_0 = stackOut_13_0;
                      return stackIn_14_0;
                    } else {
                      if (pi.field_c.b((byte) 125)) {
                        if (g.field_a == ci.field_ub) {
                          stackOut_20_0 = 2;
                          stackIn_21_0 = stackOut_20_0;
                          break L0;
                        } else {
                          return -1;
                        }
                      } else {
                        stackOut_16_0 = 1;
                        stackIn_17_0 = stackOut_16_0;
                        return stackIn_17_0;
                      }
                    }
                  } else {
                    stackOut_9_0 = 3;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  }
                }
              } else {
                boolean discarded$30 = jh.field_e.a(d.field_Ib, 57, vg.field_a);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var1, "ve.B(" + -76 + 41);
        }
        return stackIn_21_0;
    }

    public static void l() {
        field_Qb = null;
        field_Gb = null;
        int var1 = 0;
        field_Nb = null;
        field_Hb = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Nb = new jc();
        field_Gb = new int[8192];
        field_Qb = "Waiting for models";
        field_Hb = new int[16384];
    }
}
