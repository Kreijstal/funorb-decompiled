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
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((gm) this).field_N = ((gm) this).field_N + 1;
              super.a(param0, param1, param2, (byte) -128);
              if (param3 < -127) {
                break L1;
              } else {
                gm.h(-80);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("gm.I(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(byte param0, float param1, String param2, boolean param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param0 >= 3) {
                break L1;
              } else {
                field_J = 66;
                break L1;
              }
            }
            L2: {
              if (af.field_g == null) {
                af.field_g = new tf(ng.field_c, mf.field_u);
                ng.field_c.a((byte) -111, (vg) (Object) af.field_g);
                break L2;
              } else {
                break L2;
              }
            }
            af.field_g.a(param2, param3, 6, param1);
            wj.c();
            a.a((byte) -121, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("gm.H(").append(param0).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param3 + ')');
        }
    }

    final boolean a(boolean param0, vg param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                String discarded$2 = gm.a((byte) -17, (od) null, 126);
                break L1;
              }
            }
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("gm.M(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_4_0 != 0;
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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          try {
            L0: {
              var3_int = param1.k(7021);
              if (~var3_int >= ~param2) {
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
            return stackIn_3_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackOut_4_0 = "Cabbage";
            stackIn_5_0 = stackOut_4_0;
            return stackIn_5_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L1: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3_ref;
            stackOut_6_1 = new StringBuilder().append("gm.L(").append(param0).append(',');
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L1;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param2 + ')');
        }
    }

    final String e(int param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        String stackIn_5_0 = null;
        Object stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        String stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param0 < -39) {
              if (!((gm) this).field_n) {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = ((gm) this).field_I.b(-16034);
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "gm.J(" + param0 + ')');
        }
        return (String) (Object) stackIn_7_0;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        nh var7 = null;
        vh var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            super.a(param0, param1, param2, param3);
            if (param1 != 0) {
              return;
            } else {
              L1: {
                L2: {
                  L3: {
                    var5_int = param0 + ((gm) this).field_o - -(((gm) this).field_w >> 1595136161);
                    var6 = param3 - (-((gm) this).field_m - (((gm) this).field_k >> 1736670273));
                    var8 = ((gm) this).field_I.a(param2 + -12296);
                    if (var8 == ai.field_A) {
                      break L3;
                    } else {
                      if (var8 != nd.field_P) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    L5: {
                      var7 = ja.field_n[0];
                      var9 = var7.field_z << -632639967;
                      var10 = var7.field_C << -1438272895;
                      if (null == mj.field_v) {
                        break L5;
                      } else {
                        if (var9 > mj.field_v.field_y) {
                          break L5;
                        } else {
                          if (~mj.field_v.field_w > ~var10) {
                            break L5;
                          } else {
                            aj.a(mj.field_v, (byte) 91);
                            wj.c();
                            if (var11 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                    }
                    mj.field_v = new nh(var9, var10);
                    aj.a(mj.field_v, (byte) 125);
                    break L4;
                  }
                  var7.b(112, 144, var7.field_z << -334433372, var7.field_C << 1091720580, -((gm) this).field_N << -1785998838, 4096);
                  cl.d((byte) -80);
                  mj.field_v.a(var5_int - var7.field_z, -var7.field_C + var6, 256);
                  if (var11 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
                L6: {
                  if (u.field_b == var8) {
                    break L6;
                  } else {
                    if (var8 != ce.field_e) {
                      break L1;
                    } else {
                      var7 = ja.field_n[1];
                      var7.a(var5_int - (var7.field_y >> -97196319), var6 - (var7.field_w >> -2103645055), 256);
                      if (var11 == 0) {
                        break L1;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                var7 = ja.field_n[2];
                var7.a(var5_int + -(var7.field_y >> -1066976127), -(var7.field_w >> 487793953) + var6, 256);
                break L1;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var5, "gm.N(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    gm(qi param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            ((gm) this).field_I = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("gm.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    final static nh a(nh param0, int param1, int param2, he param3, int param4, boolean param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        nh var10 = null;
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
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_33_0 = 0;
        Object stackIn_41_0 = null;
        nh stackIn_43_0 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_32_0 = 0;
        Object stackOut_40_0 = null;
        nh stackOut_42_0 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
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
                      if (~param0.field_B.length <= ~(var8 * var9)) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              var10 = new nh(var6_int, var7);
              var10.c();
              param0.a(0, 0);
              lb.field_C.a(114);
              param0 = var10;
              break L1;
            }
            var10 = param0;
            var11 = var10.field_B;
            var12 = var6_int * (param2 * var7) / 10000;
            var13 = 1;
            var14 = 1;
            var15 = 0;
            L3: while (true) {
              L4: {
                L5: {
                  if (var12 <= 0) {
                    break L5;
                  } else {
                    var13 = hi.a(var6_int + -2, 4, jf.field_nb) + 1;
                    var14 = hi.a(-2 + var7, 4, jf.field_nb) + 1;
                    var15 = var13 + var14 * var6_int;
                    stackOut_14_0 = ~param3.field_m[var15];
                    stackOut_14_1 = -1;
                    stackIn_21_0 = stackOut_14_0;
                    stackIn_21_1 = stackOut_14_1;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    if (var24 != 0) {
                      break L4;
                    } else {
                      if (stackIn_15_0 != stackIn_15_1) {
                        var12--;
                        var11[var15] = li.a(param4, hi.a(255, 4, jf.field_nb) * param1);
                        if (var24 == 0) {
                          continue L3;
                        } else {
                          break L5;
                        }
                      } else {
                        continue L3;
                      }
                    }
                  }
                }
                var15 = var6_int + 1;
                stackOut_20_0 = -var7;
                stackOut_20_1 = 2;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                break L4;
              }
              var16 = stackIn_21_0 + stackIn_21_1;
              L6: while (true) {
                L7: {
                  L8: {
                    if (0 <= var16) {
                      break L8;
                    } else {
                      var17 = var11[-1 + var15];
                      var18 = var11[var15];
                      var19 = var11[1 + var15];
                      stackOut_23_0 = -var6_int + 2;
                      stackIn_33_0 = stackOut_23_0;
                      stackIn_24_0 = stackOut_23_0;
                      if (var24 != 0) {
                        break L7;
                      } else {
                        var20 = stackIn_24_0;
                        L9: while (true) {
                          L10: {
                            L11: {
                              if (var20 >= 0) {
                                break L11;
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
                                if (var24 != 0) {
                                  break L10;
                                } else {
                                  if (var24 == 0) {
                                    continue L9;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                            }
                            var15 += 2;
                            var16++;
                            break L10;
                          }
                          if (var24 == 0) {
                            continue L6;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                  }
                  stackOut_32_0 = var11.length - 1;
                  stackIn_33_0 = stackOut_32_0;
                  break L7;
                }
                var16 = stackIn_33_0;
                L12: while (true) {
                  L13: {
                    L14: {
                      if (var16 < 0) {
                        break L14;
                      } else {
                        var17 = var11[var16];
                        var18 = var17 >> 1873192112;
                        var19 = var17 >> -1028563288 & 255;
                        var20 = var17 & 255;
                        var11[var16] = (var20 * 63627 >> -618150224) + (rk.a(63627 * var19, 16711893) >> -872690136) + rk.a(var18 * 63627, 16711680);
                        var16--;
                        if (var24 != 0) {
                          break L13;
                        } else {
                          if (var24 == 0) {
                            continue L12;
                          } else {
                            break L14;
                          }
                        }
                      }
                    }
                    if (param5) {
                      break L13;
                    } else {
                      stackOut_40_0 = null;
                      stackIn_41_0 = stackOut_40_0;
                      return (nh) (Object) stackIn_41_0;
                    }
                  }
                  stackOut_42_0 = (nh) var10;
                  stackIn_43_0 = stackOut_42_0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var6 = decompiledCaughtException;
            stackOut_44_0 = (RuntimeException) var6;
            stackOut_44_1 = new StringBuilder().append("gm.O(");
            stackIn_47_0 = stackOut_44_0;
            stackIn_47_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param0 == null) {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L15;
            } else {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "{...}";
              stackIn_48_0 = stackOut_45_0;
              stackIn_48_1 = stackOut_45_1;
              stackIn_48_2 = stackOut_45_2;
              break L15;
            }
          }
          L16: {
            stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
            stackOut_48_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_51_0 = stackOut_48_0;
            stackIn_51_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param3 == null) {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L16;
            } else {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "{...}";
              stackIn_52_0 = stackOut_49_0;
              stackIn_52_1 = stackOut_49_1;
              stackIn_52_2 = stackOut_49_2;
              break L16;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_52_0, stackIn_52_2 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_43_0;
    }

    public static void h(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_L = null;
              if (param0 <= -67) {
                break L1;
              } else {
                field_K = null;
                break L1;
              }
            }
            field_K = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var1, "gm.K(" + param0 + ')');
        }
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
