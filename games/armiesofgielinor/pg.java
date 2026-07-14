/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pg {
    static int field_f;
    static bq[] field_a;
    static int field_e;
    static hm field_d;
    static wk field_c;
    static String[] field_b;

    final static boolean a(int param0, int param1) {
        if (param1 != -10) {
            return false;
        }
        return (param0 & -param0) == param0 ? true : false;
    }

    final static qb a(int param0, int param1, boolean param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        int var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 >= 0) {
            // if_icmpgt L22
        }
        param0 = 0;
        int[] var13 = aw.field_j[param3][param0];
        int[] var11 = var13;
        int[] var10 = var11;
        int[] var4 = var10;
        int var5 = var10[ns.a(false, var13.length, gg.field_J)];
        if ((var5 ^ -1) <= -1) {
            return ck.field_e[sf.field_P[param3]][var5];
        }
        if (param1 != 176) {
            return null;
        }
        int[] var14 = var4;
        for (var7 = 0; var7 < var14.length; var7++) {
            var8 = var14[var7];
            if (!(0 > var8)) {
                return ck.field_e[sf.field_P[param3]][var8];
            }
        }
        if (!param2) {
            return null;
        }
        return ck.field_e[sf.field_P[param3]][aw.field_j[param3][0][0]];
    }

    final static void a(boolean param0) {
        ck.b(-111);
        if (si.field_b != null) {
            dt.a(si.field_b, 23678);
        }
        hi.a((byte) 41);
        pf.a(-15291);
        tj.j(-118);
        if (!(!fh.b((byte) -88))) {
            vl.field_n.h(32161, 1);
            hb.a((byte) 124, 0);
        }
        dj.a((byte) -126);
        if (param0) {
            field_d = null;
        }
    }

    final static void a(int param0, mo param1) {
        int var3 = 0;
        int var4 = 0;
        tg var5 = null;
        String var6 = null;
        tg var7 = null;
        String var8 = null;
        tg var9 = null;
        String var10 = null;
        tg var11 = null;
        String var12 = null;
        tg var13 = null;
        Object stackIn_1_0 = null;
        je stackIn_1_1 = null;
        Object stackIn_1_2 = null;
        String stackIn_1_3 = null;
        Object stackIn_2_0 = null;
        je stackIn_2_1 = null;
        Object stackIn_2_2 = null;
        String stackIn_2_3 = null;
        Object stackIn_3_0 = null;
        je stackIn_3_1 = null;
        Object stackIn_3_2 = null;
        String stackIn_3_3 = null;
        int stackIn_3_4 = 0;
        Object stackOut_0_0 = null;
        je stackOut_0_1 = null;
        Object stackOut_0_2 = null;
        String stackOut_0_3 = null;
        Object stackOut_2_0 = null;
        je stackOut_2_1 = null;
        Object stackOut_2_2 = null;
        String stackOut_2_3 = null;
        int stackOut_2_4 = 0;
        Object stackOut_1_0 = null;
        je stackOut_1_1 = null;
        Object stackOut_1_2 = null;
        String stackOut_1_3 = null;
        int stackOut_1_4 = 0;
        L0: {
          stackOut_0_0 = null;
          stackOut_0_1 = param1.field_u;
          stackOut_0_2 = null;
          stackOut_0_3 = param1.field_q;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_2_2 = stackOut_0_2;
          stackIn_2_3 = stackOut_0_3;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          stackIn_1_2 = stackOut_0_2;
          stackIn_1_3 = stackOut_0_3;
          if ((param1.field_b ^ -1) == -2) {
            stackOut_2_0 = (Object) (Object) stackIn_2_0;
            stackOut_2_1 = (je) (Object) stackIn_2_1;
            stackOut_2_2 = (Object) (Object) stackIn_2_2;
            stackOut_2_3 = (String) (Object) stackIn_2_3;
            stackOut_2_4 = param1.field_v;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            stackIn_3_3 = stackOut_2_3;
            stackIn_3_4 = stackOut_2_4;
            break L0;
          } else {
            stackOut_1_0 = (Object) (Object) stackIn_1_0;
            stackOut_1_1 = (je) (Object) stackIn_1_1;
            stackOut_1_2 = (Object) (Object) stackIn_1_2;
            stackOut_1_3 = (String) (Object) stackIn_1_3;
            stackOut_1_4 = 0;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_3_3 = stackOut_1_3;
            stackIn_3_4 = stackOut_1_4;
            break L0;
          }
        }
        L1: {
          ng.a((dn) (Object) stackIn_3_0, (je) (Object) stackIn_3_1, (int[]) (Object) stackIn_3_2, (String) (Object) stackIn_3_3, stackIn_3_4, 1, param1.field_b, param1.field_m, param1.field_n);
          if (-1 != (param1.field_b ^ -1)) {
            break L1;
          } else {
            if (bn.a(false)) {
              break L1;
            } else {
              if (null != vu.field_M) {
                break L1;
              } else {
                if (no.field_K != null) {
                  break L1;
                } else {
                  L2: {
                    if (!vi.field_d) {
                      var5 = tn.field_Z;
                      var6 = wh.field_b;
                      var5.field_i.a(14, var6, (byte) -128);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var7 = tn.field_Z;
                  var8 = wq.field_g;
                  var7.field_i.a(20, var8, (byte) -115);
                  break L1;
                }
              }
            }
          }
        }
        L3: {
          if (1 != param1.field_b) {
            break L3;
          } else {
            if (bn.a(false)) {
              break L3;
            } else {
              if (vu.field_M == null) {
                break L3;
              } else {
                if (param1.field_v != vu.field_M.d((byte) -88)) {
                  break L3;
                } else {
                  L4: {
                    if (!vi.field_d) {
                      var9 = tn.field_Z;
                      var10 = cv.field_q;
                      var9.field_i.a(14, var10, (byte) -108);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var11 = tn.field_Z;
                  var12 = cq.field_E;
                  var11.field_i.a(20, var12, (byte) -117);
                  break L3;
                }
              }
            }
          }
        }
        tn.field_Z.a((byte) 68);
        tn.field_Z.a(param0 + 23899, false);
        tn.field_Z.a(param1.field_d, 7, param1.field_b);
        tn.field_Z.b((byte) 92);
        tn.field_Z.a(param1, 0);
        var13 = tn.field_Z;
        var3 = iu.field_t;
        var4 = ur.field_z;
        var13.field_i.a(0, var4, param0, (byte) -118, var3);
    }

    public static void a(int param0) {
        if (param0 != 20) {
            return;
        }
        field_b = null;
        field_c = null;
        field_d = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
        field_f = field_e;
        field_b = new String[]{"melee", "ranged", "magic", "fire", "aerial"};
    }
}
