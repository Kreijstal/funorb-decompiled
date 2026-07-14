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

    final static int f(byte param0) {
        int var1 = 0;
        int var2 = Chess.field_G;
        boolean discarded$8 = jh.field_e.a(-120, hd.field_d, vj.field_h, true);
        jh.field_e.f((byte) 70);
        while (kf.d(param0 ^ -19010)) {
            boolean discarded$9 = jh.field_e.a(d.field_Ib, 57, vg.field_a);
        }
        if (!(rn.field_a == -1)) {
            var1 = rn.field_a;
            uk.a(false, -1);
            return var1;
        }
        if (cf.field_Nb) {
            return 3;
        }
        if (!(vl.field_A != ci.field_ub)) {
            return 1;
        }
        if (!pi.field_c.b((byte) 125)) {
            return 1;
        }
        if (param0 != -76) {
            field_Nb = null;
            if (!(g.field_a != ci.field_ub)) {
                return 2;
            }
            return -1;
        }
        if (!(g.field_a != ci.field_ub)) {
            return 2;
        }
        return -1;
    }

    public static void l(int param0) {
        field_Qb = null;
        field_Gb = null;
        int var1 = -2 % ((param0 - 29) / 63);
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
