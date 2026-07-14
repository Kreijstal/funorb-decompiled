/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gm extends hf {
    static he[] field_L;
    static String field_K;
    static int field_O;
    private qi field_I;
    private int field_N;
    static int field_J;
    static boolean field_M;

    final void a(vg param0, int param1, int param2, byte param3) {
        ((gm) this).field_N = ((gm) this).field_N + 1;
        super.a(param0, param1, param2, (byte) -128);
        if (param3 >= -127) {
            gm.h(-80);
        }
    }

    final static void a(byte param0, float param1, String param2, boolean param3) {
        if (param0 < 3) {
            field_J = 66;
        }
        if (!(af.field_g != null)) {
            af.field_g = new tf(ng.field_c, mf.field_u);
            ng.field_c.a((byte) -111, (vg) (Object) af.field_g);
        }
        af.field_g.a(param2, param3, 6, param1);
        wj.c();
        a.a((byte) -121, true);
    }

    final boolean a(boolean param0, vg param1) {
        if (param0) {
            Object var4 = null;
            String discarded$0 = gm.a((byte) -17, (od) null, 126);
            return false;
        }
        return false;
    }

    final static String a(byte param0, od param1, int param2) {
        int var3_int = 0;
        Exception var3 = null;
        byte[] var4 = null;
        String var5 = null;
        int var6 = 0;
        String stackIn_3_0 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_2_0 = null;
        try {
          L0: {
            var3_int = param1.k(7021);
            if (var3_int <= param2) {
              break L0;
            } else {
              var3_int = param2;
              break L0;
            }
          }
          var4 = new byte[var3_int];
          param1.field_j = param1.field_j + pa.field_e.a(var3_int, param1.field_h, 0, param1.field_j, 0, var4);
          var6 = 88 / ((param0 - 18) / 39);
          var5 = p.a(var3_int, (byte) 79, var4, 0);
          stackOut_2_0 = (String) var5;
          stackIn_3_0 = stackOut_2_0;
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_3_0;
        }
        return null;
    }

    final String e(int param0) {
        if (param0 >= -39) {
            return null;
        }
        if (!((gm) this).field_n) {
            return null;
        }
        return ((gm) this).field_I.b(-16034);
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        vh var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        nh var12 = null;
        nh var13 = null;
        nh var14 = null;
        var11 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        super.a(param0, param1, param2, param3);
        if (param1 != 0) {
          return;
        } else {
          L0: {
            L1: {
              var5 = param0 + ((gm) this).field_o - -(((gm) this).field_w >> 1595136161);
              var6 = param3 - (-((gm) this).field_m - (((gm) this).field_k >> 1736670273));
              var8 = ((gm) this).field_I.a(param2 + -12296);
              if (var8 == ai.field_A) {
                break L1;
              } else {
                if (var8 != nd.field_P) {
                  if (u.field_b == var8) {
                    var14 = ja.field_n[2];
                    var14.a(var5 + -(var14.field_y >> -1066976127), -(var14.field_w >> 487793953) + var6, 256);
                    break L0;
                  } else {
                    if (var8 != ce.field_e) {
                      break L0;
                    } else {
                      var13 = ja.field_n[1];
                      var13.a(var5 - (var13.field_y >> -97196319), var6 - (var13.field_w >> -2103645055), 256);
                      break L0;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                var12 = ja.field_n[0];
                var9 = var12.field_z << -632639967;
                var10 = var12.field_C << -1438272895;
                if (null == mj.field_v) {
                  break L3;
                } else {
                  if (var9 > mj.field_v.field_y) {
                    break L3;
                  } else {
                    if (mj.field_v.field_w < var10) {
                      break L3;
                    } else {
                      aj.a(mj.field_v, (byte) 91);
                      wj.c();
                      break L2;
                    }
                  }
                }
              }
              mj.field_v = new nh(var9, var10);
              aj.a(mj.field_v, (byte) 125);
              break L2;
            }
            var12.b(112, 144, var12.field_z << -334433372, var12.field_C << 1091720580, -((gm) this).field_N << -1785998838, 4096);
            cl.d((byte) -80);
            mj.field_v.a(var5 - var12.field_z, -var12.field_C + var6, 256);
            break L0;
          }
          return;
        }
    }

    gm(qi param0) {
        ((gm) this).field_I = param0;
    }

    final static nh a(nh param0, int param1, int param2, he param3, int param4, boolean param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        nh var26 = null;
        nh var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        L0: {
          L1: {
            var24 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
            var6 = param3.field_d;
            var7 = param3.field_k;
            var8 = param0.field_y;
            var9 = param0.field_w;
            if (var8 != var6) {
              break L1;
            } else {
              if (var7 != var9) {
                break L1;
              } else {
                if (var6 * var7 > param3.field_m.length) {
                  break L1;
                } else {
                  if (param0.field_B.length >= var8 * var9) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          var26 = new nh(var6, var7);
          var26.c();
          param0.a(0, 0);
          lb.field_C.a(114);
          param0 = var26;
          break L0;
        }
        var27 = param0;
        var31 = var27.field_B;
        var30 = var31;
        var29 = var30;
        var28 = var29;
        var11 = var28;
        var12 = var6 * (param2 * var7) / 10000;
        var13 = 1;
        var14 = 1;
        var15 = 0;
        L2: while (true) {
          if (var12 <= 0) {
            var15 = var6 + 1;
            var16 = -var7 + 2;
            L3: while (true) {
              if (0 <= var16) {
                var25 = var31.length - 1;
                var16 = var25;
                L4: while (true) {
                  if ((var25 ^ -1) > -1) {
                    if (param5) {
                      return var27;
                    } else {
                      return null;
                    }
                  } else {
                    var17 = var31[var25];
                    var18 = var17 >> 1873192112;
                    var19 = var17 >> -1028563288 & 255;
                    var20 = var17 & 255;
                    var11[var25] = (var20 * 63627 >> -618150224) + (rk.a(63627 * var19, 16711893) >> -872690136) + rk.a(var18 * 63627, 16711680);
                    var25--;
                    continue L4;
                  }
                }
              } else {
                var17 = var11[-1 + var15];
                var18 = var31[var15];
                var19 = var11[1 + var15];
                var20 = -var6 + 2;
                L5: while (true) {
                  if ((var20 ^ -1) <= -1) {
                    var15 += 2;
                    var16++;
                    continue L3;
                  } else {
                    var21 = var11[-var6 + var15];
                    var22 = (65280 & var19) + (65280 & var21) + (var17 & 65280) - -(65280 & var18) >> 1643235554;
                    var23 = (var19 & 16711935) + (var18 & 16711935) + ((var17 & 16711935) + (16711935 & var21)) >> -1158895390;
                    var11[-var6 + var15] = rk.a(var23, 16711935) + rk.a(var22, 65280);
                    var17 = var18;
                    var15++;
                    var18 = var19;
                    var19 = var11[1 + var15];
                    var20++;
                    continue L5;
                  }
                }
              }
            }
          } else {
            var13 = hi.a(var6 + -2, 4, jf.field_nb) + 1;
            var14 = hi.a(-2 + var7, 4, jf.field_nb) + 1;
            var15 = var13 + var14 * var6;
            if (param3.field_m[var15] != 0) {
              var12--;
              var11[var15] = li.a(param4, hi.a(255, 4, jf.field_nb) * param1);
              continue L2;
            } else {
              continue L2;
            }
          }
        }
    }

    public static void h(int param0) {
        field_L = null;
        if (param0 > -67) {
            field_K = null;
        }
        field_K = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "This game has been updated! Please reload this page.";
        field_O = 0;
        field_J = 0;
    }
}
