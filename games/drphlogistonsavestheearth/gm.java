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
        try {
            this.field_N = this.field_N + 1;
            super.a(param0, param1, param2, (byte) -128);
            if (param3 >= -127) {
                gm.h(-80);
            }
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "gm.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(byte param0, float param1, String param2, boolean param3) {
        try {
            if (param0 < 3) {
                field_J = 66;
            }
            if (!(af.field_g != null)) {
                af.field_g = new tf(ng.field_c, mf.field_u);
                ng.field_c.a((byte) -111, (vg) (af.field_g));
            }
            af.field_g.a(param2, param3, 6, param1);
            wj.c();
            a.a((byte) -121, true);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "gm.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final boolean a(boolean param0, vg param1) {
        RuntimeException var3 = null;
        od var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param0) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              var4 = (od) null;
              gm.a((byte) -17, (od) null, 126);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("gm.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final static String a(byte param0, od param1, int param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        int var6 = 0;
        String stackIn_3_0 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var3_int = param1.k(7021);
                  if (var3_int <= param2) {
                    break L2;
                  } else {
                    var3_int = param2;
                    break L2;
                  }
                }
                var4 = new byte[var3_int];
                param1.field_j = param1.field_j + pa.field_e.a(var3_int, param1.field_h, 0, param1.field_j, 0, var4);
                var6 = 88 / ((param0 - 18) / 39);
                var5 = p.a(var3_int, (byte) 79, var4, 0);
                stackIn_3_0 = (String) (var5);
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = (Exception) (Object) decompiledCaughtException;
              stackIn_5_0 = "Cabbage";
              return stackIn_5_0;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3_ref);

            stackIn_8_1 = new StringBuilder().append("gm.L(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final String e(int param0) {
        if (param0 >= -39) {
            return (String) null;
        }
        if (!this.field_n) {
            return null;
        }
        return this.field_I.b(-16034);
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5;
        int var6;
        vh var8;
        int var9;
        int var10;
        int var11;
        nh var12;
        nh var13;
        nh var14;
        var11 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        super.a(param0, param1, param2, param3);
        if (param1 != 0) {
          return;
        } else {
          L0: {
            L1: {
              var5 = param0 + this.field_o - -(this.field_w >> 1595136161);
              var6 = param3 - (-this.field_m - (this.field_k >> 1736670273));
              var8 = this.field_I.a(param2 + -12296);
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
            var12.b(112, 144, var12.field_z << -334433372, var12.field_C << 1091720580, -this.field_N << -1785998838, 4096);
            cl.d((byte) -80);
            mj.field_v.a(var5 - var12.field_z, -var12.field_C + var6, 256);
            break L0;
          }
          return;
        }
    }

    gm(qi param0) {
        try {
            this.field_I = param0;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "gm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static nh a(nh param0, int param1, int param2, he param3, int param4, boolean param5) {
        nh stackIn_23_0 = null;
        nh stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
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
        nh var25 = null;
        nh var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        var24 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var6_int = param3.field_d;
                var7 = param3.field_k;
                var8 = param0.field_y;
                var9 = param0.field_w;
                if (var8 != var6_int) {
                  break L2;
                } else {
                  if (var7 != var9) {
                    break L2;
                  } else {
                    if (var6_int * var7 > param3.field_m.length) {
                      break L2;
                    } else {
                      if (param0.field_B.length >= var8 * var9) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              var25 = new nh(var6_int, var7);
              var25.c();
              param0.a(0, 0);
              lb.field_C.a(114);
              param0 = var25;
              break L1;
            }
            var26 = param0;
            var28 = var26.field_B;
            var27 = var28;
            var11 = var27;
            var12 = var6_int * (param2 * var7) / 10000;
            var13 = 1;
            var14 = 1;
            var15 = 0;
            L3: while (true) {
              if (var12 <= 0) {
                var15 = var6_int + 1;
                var16 = -var7 + 2;
                L4: while (true) {
                  if (0 <= var16) {
                    var16 = var28.length - 1;
                    L5: while (true) {
                      if ((var16 ^ -1) > -1) {
                        if (param5) {
                          stackIn_25_0 = (nh) (var26);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          stackIn_23_0 = (nh) null;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      } else {
                        var17 = var28[var16];
                        var18 = var17 >> 1873192112;
                        var19 = var17 >> -1028563288 & 255;
                        var20 = var17 & 255;
                        var11[var16] = (var20 * 63627 >> -618150224) + (rk.a(63627 * var19, 16711893) >> -872690136) + rk.a(var18 * 63627, 16711680);
                        var16--;
                        continue L5;
                      }
                    }
                  } else {
                    var17 = var11[-1 + var15];
                    var18 = var28[var15];
                    var19 = var11[1 + var15];
                    var20 = -var6_int + 2;
                    L6: while (true) {
                      if ((var20 ^ -1) <= -1) {
                        var15 += 2;
                        var16++;
                        continue L4;
                      } else {
                        var21 = var11[-var6_int + var15];
                        var22 = (65280 & var19) + (65280 & var21) + (var17 & 65280) - -(65280 & var18) >> 1643235554;
                        var23 = (var19 & 16711935) + (var18 & 16711935) + ((var17 & 16711935) + (16711935 & var21)) >> -1158895390;
                        var11[-var6_int + var15] = rk.a(var23, 16711935) + rk.a(var22, 65280);
                        var17 = var18;
                        var15++;
                        var18 = var19;
                        var19 = var11[1 + var15];
                        var20++;
                        continue L6;
                      }
                    }
                  }
                }
              } else {
                var13 = hi.a(var6_int + -2, 4, jf.field_nb) + 1;
                var14 = hi.a(-2 + var7, 4, jf.field_nb) + 1;
                var15 = var13 + var14 * var6_int;
                if ((param3.field_m[var15] ^ -1) != -1) {
                  var12--;
                  var11[var15] = li.a(param4, hi.a(255, 4, jf.field_nb) * param1);
                  continue L3;
                } else {
                  continue L3;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var6);

            stackIn_28_1 = new StringBuilder().append("gm.O(");

            if (param0 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L7;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L8;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L8;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_29_0), stackIn_32_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_23_0;
        } else {
          return stackIn_25_0;
        }
    }

    public static void h(int param0) {
        field_L = null;
        if (param0 > -67) {
            field_K = (String) null;
        }
        field_K = null;
    }

    static {
        field_K = "This game has been updated! Please reload this page.";
        field_O = 0;
        field_J = 0;
    }
}
