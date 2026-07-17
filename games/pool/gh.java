/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gh extends vc {
    static String field_Q;

    final void a(byte param0, int[] param1) {
        RuntimeException var3 = null;
        int[] var3_array = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var19 = null;
        int[] var20 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var11 = Pool.field_O;
        try {
          L0: {
            L1: {
              L2: {
                var12 = param1;
                var3_array = var12;
                ml.field_l[6] = var12[6];
                ml.field_l[10] = var12[10];
                ml.field_l[9] = var12[9];
                ml.field_l[4] = var12[4];
                ml.field_l[5] = var12[5];
                ml.field_l[8] = var12[8];
                ml.field_l[11] = var12[11];
                if (0L == (pd.field_i & 256L)) {
                  break L2;
                } else {
                  if (vj.field_c[58]) {
                    ml.field_l[1] = -1152 + var12[1] >> 4;
                    ml.field_l[2] = var12[2] >> 4;
                    ml.field_l[0] = var12[0] + -2304 >> 4;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var20 = ml.field_l;
              ml.field_l[2] = 0;
              var19 = ml.field_l;
              var19[1] = 0;
              var20[0] = 0;
              break L1;
            }
            ml.field_l[7] = var12[7];
            ml.field_l[3] = var12[3];
            var4 = 24 / ((-64 - param0) / 52);
            var3_int = 0;
            var5 = 0;
            L3: while (true) {
              L4: {
                if (kk.field_C[0].length <= var3_int) {
                  break L4;
                } else {
                  if (var5 >= kk.field_C[0].length) {
                    break L4;
                  } else {
                    L5: {
                      var6 = -ml.field_l[0] + kk.field_C[0][var3_int];
                      var7 = -ml.field_l[1] + kk.field_C[1][var3_int];
                      var8 = kk.field_C[2][var3_int] - ml.field_l[2];
                      var9 = ml.field_l[3] * var6 - (-(var7 * ml.field_l[4]) + -(var8 * ml.field_l[5])) >> 3;
                      var10 = var8 * ml.field_l[8] + var7 * ml.field_l[7] + ml.field_l[6] * var6 >> 3;
                      var8 = var8 * ml.field_l[11] + ml.field_l[9] * var6 - -(ml.field_l[10] * var7) >> 16;
                      if (var8 == 0) {
                        var8 = -1;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    s.field_b[0][var3_int] = var9 / var8 + 5120;
                    s.field_b[1][var3_int] = 3840 + var10 / var8;
                    s.field_b[2][var3_int] = var8;
                    var3_int++;
                    var5++;
                    continue L3;
                  }
                }
              }
              int discarded$1 = 98;
              bf.b();
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("gh.N(").append(param0).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
    }

    final void a(cf param0, int param1) {
        try {
            ie.field_f = param0.a("space_ball_1", true, "");
            uq.field_i = param0.a("space_ball_2", true, "");
            ma.field_a = param0.a("space_ball_3", true, "");
            int var3_int = -40 / ((39 - param1) / 38);
            hj.field_j = param0.a("space_ball_4", true, "");
            wn.field_b = param0.a("space_ball_cushion1", true, "");
            cr.field_o = param0.a("space_ball_cushion2", true, "");
            ge.field_q = param0.a("space_ball_cushion3", true, "");
            qi.field_f = param0.a("space_ball_cushion4", true, "");
            to.field_l = param0.a("space_respot_the_white", true, "");
            bh.field_a = param0.a("", "space_ball_pot", (byte) 125);
            pq.field_L = param0.a("", "space_cue_hard", (byte) 126);
            li.field_l = param0.a("", "space_cue_soft", (byte) 126);
            jg discarded$0 = param0.a("", "cueball_rolling_loop", (byte) 125);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "gh.M(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void a(boolean param0, mm param1) {
        RuntimeException var3 = null;
        double var3_double = 0.0;
        int var5 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (param1.field_f >= 0.0) {
                if (576.0 < param1.field_f) {
                  param1.field_f = 576.0;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                param1.field_f = 0.0;
                break L1;
              }
            }
            L2: {
              if (0.0 <= param1.field_m) {
                if (288.0 >= param1.field_m) {
                  break L2;
                } else {
                  param1.field_m = 288.0;
                  break L2;
                }
              } else {
                param1.field_m = 0.0;
                break L2;
              }
            }
            L3: {
              if (!param0) {
                break L3;
              } else {
                field_Q = null;
                break L3;
              }
            }
            L4: {
              var3_double = param1.d(8);
              if (var3_double <= 2048.0) {
                break L4;
              } else {
                param1.field_a = param1.field_m + 2048.0 * (param1.field_a - param1.field_m) / var3_double;
                param1.field_d = 2048.0 * (-param1.field_f + param1.field_d) / var3_double + param1.field_f;
                param1.field_h = 2048.0 * (param1.field_h - param1.field_k) / var3_double + param1.field_k;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("gh.VA(").append(param0).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
    }

    private final void a(uf param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var3_int = param0.field_eb.b(-127) - -(((gh) this).field_B.field_A >> 1);
              if (param1 == 10) {
                break L1;
              } else {
                field_Q = null;
                break L1;
              }
            }
            L2: {
              if (var3_int > 0) {
                var4 = (int)(-param0.field_eb.a(true) * (double)((gh) this).field_B.field_z / 2.0 / 3.141592653589793);
                var5 = -((gh) this).field_B.field_A + var3_int;
                ((gh) this).field_B.a(-((gh) this).field_B.field_z + var4, var5);
                if (-640 + ((gh) this).field_B.field_z <= var4) {
                  break L2;
                } else {
                  ((gh) this).field_B.a(var4, var5);
                  break L2;
                }
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("gh.UA(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
    }

    final void d(boolean param0) {
        super.d(param0);
        ra.field_f = null;
        ig.field_h = null;
        lq.field_R = null;
        s.field_b = null;
        kk.field_C = null;
    }

    final void b(int param0, di param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((gh) this).field_B = new dd(param1.a(false, "nebula.jpg", ""), (java.awt.Component) (Object) vj.a((byte) -73));
              if (param0 == 5) {
                break L1;
              } else {
                field_Q = null;
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
            stackOut_3_1 = new StringBuilder().append("gh.JA(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final void a(al param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        var4 = Pool.field_O;
        try {
          L0: {
            super.a(param0, param1);
            ra.field_f = new qf[32];
            wm.field_Ub = new int[ra.field_f.length];
            va.field_N = new int[ra.field_f.length];
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= ra.field_f.length) {
                break L0;
              } else {
                ra.field_f[var3_int] = new qf(((gh) this).field_O[om.field_w]);
                wm.field_Ub[var3_int] = var3_int;
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("gh.B(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
    }

    final void b(boolean param0) {
        super.b(param0);
        int var2 = -220 + -gd.field_g;
        ig.field_h.a(0, (byte) -97, var2, 0);
        gd.field_g = gd.field_g + var2;
    }

    final void a(int param0, uf param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var4 = Pool.field_O;
        try {
          L0: {
            super.a(param0, param1);
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= ra.field_f.length) {
                L2: {
                  if (gd.field_g >= 0) {
                    break L2;
                  } else {
                    ig.field_h.a(0, (byte) -96, 1, 0);
                    gd.field_g = gd.field_g + 1;
                    break L2;
                  }
                }
                break L0;
              } else {
                ra.field_f[var3_int].a(2115785453);
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("gh.T(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    final static vh f() {
        return ci.field_c.field_Rb;
    }

    public static void e() {
        field_Q = null;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Pool.field_O;
          var5 = 22 / ((-44 - param2) / 56);
          super.a(param0, param1, (byte) -107, param3);
          var6 = param0;
          if (var6 != 5) {
            if (2 == var6) {
              var6 = ga.a(2, true, ea.field_r);
              if (var6 == 0) {
                kf discarded$12 = kp.a(100, ie.field_f, param3, param1);
                break L0;
              } else {
                if (var6 == 1) {
                  kf discarded$13 = kp.a(100, ma.field_a, param3, param1);
                  break L0;
                } else {
                  break L0;
                }
              }
            } else {
              if (var6 == 3) {
                var6 = ga.a(2, true, ea.field_r);
                if (var6 != 0) {
                  if (var6 == 1) {
                    kf discarded$14 = kp.a(100, hj.field_j, param3, param1);
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  kf discarded$15 = kp.a(100, uq.field_i, param3, param1);
                  break L0;
                }
              } else {
                if (var6 == 7) {
                  kf discarded$16 = kp.a(100, pq.field_L, param3, param1);
                  break L0;
                } else {
                  if (var6 == 8) {
                    kf discarded$17 = kp.a(100, li.field_l, param3, param1);
                    break L0;
                  } else {
                    if (var6 == 6) {
                      kf discarded$18 = kp.a(100, to.field_l, param3, param1);
                      break L0;
                    } else {
                      if (var6 == 4) {
                        kf discarded$19 = kp.a(100, bh.field_a, param3, param1);
                        break L0;
                      } else {
                        break L0;
                      }
                    }
                  }
                }
              }
            }
          } else {
            var6 = ga.a(4, true, ea.field_r);
            if (var6 == 0) {
              kf discarded$20 = kp.a(100, wn.field_b, param3, param1);
              break L0;
            } else {
              if (1 != var6) {
                if (var6 == 2) {
                  kf discarded$21 = kp.a(100, ge.field_q, param3, param1);
                  break L0;
                } else {
                  if (var6 == 3) {
                    kf discarded$22 = kp.a(100, qi.field_f, param3, param1);
                    break L0;
                  } else {
                    break L0;
                  }
                }
              } else {
                kf discarded$23 = kp.a(100, cr.field_o, param3, param1);
                break L0;
              }
            }
          }
        }
    }

    final void a(byte param0, uf param1) {
        RuntimeException var3 = null;
        pq[] var3_array = null;
        int[] var4 = null;
        int[] var5_ref_int__ = null;
        int var5 = 0;
        int[] var6_ref_int__ = null;
        int var6 = 0;
        int[] var7_ref_int__ = null;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        pq[] var25 = null;
        so var26 = null;
        so var28 = null;
        so var30 = null;
        so var32 = null;
        so var35 = null;
        so var38 = null;
        so var40 = null;
        so var42 = null;
        so var44 = null;
        so var47 = null;
        so var49 = null;
        int[] var52 = null;
        int[] var53 = null;
        int[] var54 = null;
        int[] var55 = null;
        int[] var56 = null;
        int[] var57 = null;
        int[] var73 = null;
        int[] var74 = null;
        int[] var75 = null;
        int[] var76 = null;
        int[] var77 = null;
        int[] var78 = null;
        int[] var94 = null;
        int[] var95 = null;
        int[] var96 = null;
        int[] var97 = null;
        int[] var98 = null;
        int[] var99 = null;
        int[] var100 = null;
        int[] var101 = null;
        int[] var102 = null;
        int[] var103 = null;
        int[] var104 = null;
        int[] var105 = null;
        int[] var106 = null;
        int[] var107 = null;
        int[] var108 = null;
        int[] var109 = null;
        int[] var110 = null;
        boolean[] var111 = null;
        int[] var112 = null;
        int[] var113 = null;
        boolean[] var114 = null;
        boolean[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        boolean[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        boolean[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        boolean[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        boolean[] stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        boolean[] stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        boolean[] stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        boolean[] stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        boolean[] stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        boolean[] stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        int stackIn_27_3 = 0;
        int stackIn_27_4 = 0;
        boolean[] stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        boolean[] stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        boolean[] stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int stackIn_30_2 = 0;
        Object stackIn_46_0 = null;
        int[] stackIn_46_1 = null;
        int stackIn_46_2 = 0;
        int stackIn_46_3 = 0;
        pq[] stackIn_46_4 = null;
        Object stackIn_47_0 = null;
        int[] stackIn_47_1 = null;
        int stackIn_47_2 = 0;
        int stackIn_47_3 = 0;
        pq[] stackIn_47_4 = null;
        Object stackIn_48_0 = null;
        int[] stackIn_48_1 = null;
        int stackIn_48_2 = 0;
        int stackIn_48_3 = 0;
        pq[] stackIn_48_4 = null;
        int stackIn_48_5 = 0;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_45_0 = null;
        int[] stackOut_45_1 = null;
        int stackOut_45_2 = 0;
        int stackOut_45_3 = 0;
        pq[] stackOut_45_4 = null;
        Object stackOut_47_0 = null;
        int[] stackOut_47_1 = null;
        int stackOut_47_2 = 0;
        int stackOut_47_3 = 0;
        pq[] stackOut_47_4 = null;
        int stackOut_47_5 = 0;
        Object stackOut_46_0 = null;
        int[] stackOut_46_1 = null;
        int stackOut_46_2 = 0;
        int stackOut_46_3 = 0;
        pq[] stackOut_46_4 = null;
        int stackOut_46_5 = 0;
        boolean[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        boolean[] stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        boolean[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        boolean[] stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        boolean[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        boolean[] stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        boolean[] stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        int stackOut_26_3 = 0;
        int stackOut_26_4 = 0;
        boolean[] stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        boolean[] stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        int stackOut_25_4 = 0;
        boolean[] stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        int stackOut_24_4 = 0;
        boolean[] stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        boolean[] stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int stackOut_29_2 = 0;
        boolean[] stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        var10 = Pool.field_O;
        try {
          L0: {
            L1: {
              var25 = param1.field_I.field_l;
              var3_array = var25;
              var99 = f.a((byte) 109, param1.field_ab);
              var78 = var99;
              var57 = var78;
              var24 = var57;
              var4 = var24;
              var94 = var4;
              var73 = var94;
              var52 = var73;
              var19 = var52;
              var11 = var19;
              var5_ref_int__ = var11;
              int discarded$2 = 1;
              oh.field_d[0] = var94[0] - sb.a(288.0f) >> 2;
              int discarded$3 = 1;
              oh.field_d[1] = var94[1] + -sb.a(144.0f) >> 2;
              oh.field_d[2] = var94[2] >> 2;
              if (var5_ref_int__ == oh.field_d) {
                break L1;
              } else {
                oh.field_d[7] = var94[7];
                oh.field_d[4] = var94[4];
                oh.field_d[3] = var94[3];
                oh.field_d[9] = var94[9];
                oh.field_d[10] = var94[10];
                oh.field_d[8] = var94[8];
                oh.field_d[5] = var94[5];
                oh.field_d[6] = var94[6];
                oh.field_d[11] = var94[11];
                break L1;
              }
            }
            L2: {
              var95 = var4;
              var74 = var95;
              var53 = var74;
              var20 = var53;
              var12 = var20;
              var5_ref_int__ = var12;
              eh.field_s[1] = -1152 + var95[1] >> 3;
              eh.field_s[2] = var95[2] >> 3;
              if (var5_ref_int__ == eh.field_s) {
                break L2;
              } else {
                eh.field_s[6] = var95[6];
                eh.field_s[7] = var95[7];
                eh.field_s[8] = var95[8];
                eh.field_s[10] = var95[10];
                eh.field_s[5] = var95[5];
                eh.field_s[4] = var95[4];
                eh.field_s[3] = var95[3];
                eh.field_s[11] = var95[11];
                eh.field_s[9] = var95[9];
                break L2;
              }
            }
            L3: {
              L4: {
                eh.field_s[0] = -2304 + var95[0] >> 3;
                var96 = var4;
                var75 = var96;
                var54 = var75;
                var21 = var54;
                var13 = var21;
                var5_ref_int__ = var13;
                ml.field_l[7] = var96[7];
                ml.field_l[4] = var96[4];
                if ((256L & pd.field_i) == 0L) {
                  break L4;
                } else {
                  if (vj.field_c[58]) {
                    ml.field_l[0] = var96[0] + -2304 >> 4;
                    ml.field_l[1] = var96[1] - 1152 >> 4;
                    ml.field_l[2] = var96[2] >> 4;
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              var97 = ml.field_l;
              var76 = var97;
              var55 = var76;
              var22 = var55;
              var14 = var22;
              var6_ref_int__ = var14;
              ml.field_l[2] = 0;
              var98 = ml.field_l;
              var77 = var98;
              var56 = var77;
              var23 = var56;
              var15 = var23;
              var7_ref_int__ = var15;
              var97[0] = 0;
              var98[1] = 0;
              break L3;
            }
            ml.field_l[8] = var96[8];
            ml.field_l[5] = var96[5];
            ml.field_l[6] = var96[6];
            ml.field_l[9] = var96[9];
            ml.field_l[11] = var96[11];
            ml.field_l[10] = var96[10];
            ml.field_l[3] = var96[3];
            var4[1] = rb.b(var99[1], -4);
            var4[0] = rb.b(var99[0], -4);
            var4[2] = rb.b(var99[2], -4);
            ((gh) this).a(false, var99, var25);
            var5 = 0;
            L5: while (true) {
              if (var5 >= ra.field_f.length) {
                L6: {
                  k.a(wm.field_Ub, (byte) -121, va.field_N);
                  ge.field_l = var99[11] * -var99[2] + -var99[1] * var99[10] + -var99[0] * var99[9];
                  var26 = ig.field_h;
                  var100 = oh.field_d;
                  if (param0 == -55) {
                    break L6;
                  } else {
                    field_Q = null;
                    break L6;
                  }
                }
                var26.b((byte) -108, 0, var26.field_j.length, var100);
                var28 = ff.field_d;
                var101 = oh.field_d;
                var28.b((byte) 18, 0, var28.field_j.length, var101);
                var30 = wb.field_c;
                var102 = oh.field_d;
                var30.b((byte) 120, 0, var30.field_j.length, var102);
                var32 = tq.field_o;
                var103 = oh.field_d;
                var32.b((byte) 48, 0, var32.field_j.length, var103);
                var5 = 0;
                L7: while (true) {
                  if (var5 >= kh.field_rc.length) {
                    var35 = ij.field_o;
                    var105 = oh.field_d;
                    var35.b((byte) -116, 0, var35.field_j.length, var105);
                    qh.f(0, 0, qh.field_l, qh.field_f, 51);
                    this.a(param1, param0 ^ -61);
                    var5 = 0;
                    L8: while (true) {
                      if (var5 >= kk.field_C[0].length) {
                        hb.field_k.a(qk.field_d, uh.field_t[1], 4096, (byte) 113, uh.field_t[0]);
                        var16 = f.a((byte) -68, var99);
                        var106 = var16;
                        var16[0] = var16[0] - 2304;
                        var16[1] = var16[1] - 1152;
                        var6 = ra.field_f.length + -1;
                        L9: while (true) {
                          L10: {
                            if (0 > var6) {
                              break L10;
                            } else {
                              if (ge.field_l <= va.field_N[var6]) {
                                ra.field_f[wm.field_Ub[var6]].a(var106, (gh) this, 126);
                                var6--;
                                continue L9;
                              } else {
                                break L10;
                              }
                            }
                          }
                          L11: {
                            var38 = ig.field_h;
                            var107 = oh.field_d;
                            var38.a((byte) -105, 0, var38.field_j.length, var107);
                            var40 = ij.field_o;
                            var108 = oh.field_d;
                            var40.a((byte) -97, 0, var40.field_j.length, var108);
                            var42 = wb.field_c;
                            var109 = oh.field_d;
                            var42.a((byte) -81, 0, var42.field_j.length, var109);
                            if ((pd.field_i & 1073741824L) != 0L) {
                              break L11;
                            } else {
                              ((gh) this).a(var99, (byte) 126, false, var25, false);
                              break L11;
                            }
                          }
                          L12: {
                            var44 = tq.field_o;
                            var110 = oh.field_d;
                            var111 = kh.field_rc;
                            var44.a(false, 0, var44.field_j.length, (byte) -24, var110, var111);
                            var47 = ff.field_d;
                            var112 = oh.field_d;
                            var47.a((byte) -114, 0, var47.field_j.length, var112);
                            if ((1073741824L & pd.field_i) != 0L) {
                              break L12;
                            } else {
                              L13: {
                                stackOut_45_0 = this;
                                stackOut_45_1 = (int[]) var4;
                                stackOut_45_2 = 73;
                                stackOut_45_3 = 1;
                                stackOut_45_4 = (pq[]) var3_array;
                                stackIn_47_0 = stackOut_45_0;
                                stackIn_47_1 = stackOut_45_1;
                                stackIn_47_2 = stackOut_45_2;
                                stackIn_47_3 = stackOut_45_3;
                                stackIn_47_4 = stackOut_45_4;
                                stackIn_46_0 = stackOut_45_0;
                                stackIn_46_1 = stackOut_45_1;
                                stackIn_46_2 = stackOut_45_2;
                                stackIn_46_3 = stackOut_45_3;
                                stackIn_46_4 = stackOut_45_4;
                                if (param1.field_I.j(76).field_q != 0) {
                                  stackOut_47_0 = this;
                                  stackOut_47_1 = (int[]) (Object) stackIn_47_1;
                                  stackOut_47_2 = stackIn_47_2;
                                  stackOut_47_3 = stackIn_47_3;
                                  stackOut_47_4 = (pq[]) (Object) stackIn_47_4;
                                  stackOut_47_5 = 0;
                                  stackIn_48_0 = stackOut_47_0;
                                  stackIn_48_1 = stackOut_47_1;
                                  stackIn_48_2 = stackOut_47_2;
                                  stackIn_48_3 = stackOut_47_3;
                                  stackIn_48_4 = stackOut_47_4;
                                  stackIn_48_5 = stackOut_47_5;
                                  break L13;
                                } else {
                                  stackOut_46_0 = this;
                                  stackOut_46_1 = (int[]) (Object) stackIn_46_1;
                                  stackOut_46_2 = stackIn_46_2;
                                  stackOut_46_3 = stackIn_46_3;
                                  stackOut_46_4 = (pq[]) (Object) stackIn_46_4;
                                  stackOut_46_5 = 1;
                                  stackIn_48_0 = stackOut_46_0;
                                  stackIn_48_1 = stackOut_46_1;
                                  stackIn_48_2 = stackOut_46_2;
                                  stackIn_48_3 = stackOut_46_3;
                                  stackIn_48_4 = stackOut_46_4;
                                  stackIn_48_5 = stackOut_46_5;
                                  break L13;
                                }
                              }
                              ((gh) this).a(stackIn_48_1, (byte) stackIn_48_2, stackIn_48_3 != 0, stackIn_48_4, stackIn_48_5 != 0);
                              break L12;
                            }
                          }
                          L14: {
                            var49 = tq.field_o;
                            var113 = oh.field_d;
                            var114 = kh.field_rc;
                            var49.a(true, 0, var49.field_j.length, (byte) -83, var113, var114);
                            if ((256L & pd.field_i) == 0L) {
                              break L14;
                            } else {
                              ig.field_h.a(oh.field_d, 0);
                              break L14;
                            }
                          }
                          L15: {
                            if ((pd.field_i & 1073741824L) != 0L) {
                              break L15;
                            } else {
                              param1.q(-1);
                              param1.D(param0 + -70);
                              break L15;
                            }
                          }
                          L16: while (true) {
                            if (var6 < 0) {
                              break L0;
                            } else {
                              ra.field_f[wm.field_Ub[var6]].a(var106, (gh) this, 99);
                              var6--;
                              continue L16;
                            }
                          }
                        }
                      } else {
                        L17: {
                          if (s.field_b[2][var5] >= 0) {
                            qh.a(s.field_b[0][var5], s.field_b[1][var5], var5 % ng.field_t.length + 2 << 3, 255, dg.field_K);
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                        var5++;
                        continue L8;
                      }
                    }
                  } else {
                    L18: {
                      var104 = tq.field_o.field_c[var5];
                      var7 = 576;
                      var8 = 288;
                      stackOut_17_0 = kh.field_rc;
                      stackOut_17_1 = var5;
                      stackIn_21_0 = stackOut_17_0;
                      stackIn_21_1 = stackOut_17_1;
                      stackIn_18_0 = stackOut_17_0;
                      stackIn_18_1 = stackOut_17_1;
                      if (var104[0] < -var7) {
                        stackOut_21_0 = (boolean[]) (Object) stackIn_21_0;
                        stackOut_21_1 = stackIn_21_1;
                        stackOut_21_2 = 1;
                        stackIn_22_0 = stackOut_21_0;
                        stackIn_22_1 = stackOut_21_1;
                        stackIn_22_2 = stackOut_21_2;
                        break L18;
                      } else {
                        stackOut_18_0 = (boolean[]) (Object) stackIn_18_0;
                        stackOut_18_1 = stackIn_18_1;
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_20_1 = stackOut_18_1;
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        if (var104[0] <= var7) {
                          stackOut_20_0 = (boolean[]) (Object) stackIn_20_0;
                          stackOut_20_1 = stackIn_20_1;
                          stackOut_20_2 = 0;
                          stackIn_22_0 = stackOut_20_0;
                          stackIn_22_1 = stackOut_20_1;
                          stackIn_22_2 = stackOut_20_2;
                          break L18;
                        } else {
                          stackOut_19_0 = (boolean[]) (Object) stackIn_19_0;
                          stackOut_19_1 = stackIn_19_1;
                          stackOut_19_2 = -1;
                          stackIn_22_0 = stackOut_19_0;
                          stackIn_22_1 = stackOut_19_1;
                          stackIn_22_2 = stackOut_19_2;
                          break L18;
                        }
                      }
                    }
                    L19: {
                      stackOut_22_0 = (boolean[]) (Object) stackIn_22_0;
                      stackOut_22_1 = stackIn_22_1;
                      stackOut_22_2 = stackIn_22_2 * (var104[0] - oh.field_d[0]);
                      stackOut_22_3 = var104[1] - oh.field_d[1];
                      stackIn_26_0 = stackOut_22_0;
                      stackIn_26_1 = stackOut_22_1;
                      stackIn_26_2 = stackOut_22_2;
                      stackIn_26_3 = stackOut_22_3;
                      stackIn_23_0 = stackOut_22_0;
                      stackIn_23_1 = stackOut_22_1;
                      stackIn_23_2 = stackOut_22_2;
                      stackIn_23_3 = stackOut_22_3;
                      if (-var8 > var104[1]) {
                        stackOut_26_0 = (boolean[]) (Object) stackIn_26_0;
                        stackOut_26_1 = stackIn_26_1;
                        stackOut_26_2 = stackIn_26_2;
                        stackOut_26_3 = stackIn_26_3;
                        stackOut_26_4 = 1;
                        stackIn_27_0 = stackOut_26_0;
                        stackIn_27_1 = stackOut_26_1;
                        stackIn_27_2 = stackOut_26_2;
                        stackIn_27_3 = stackOut_26_3;
                        stackIn_27_4 = stackOut_26_4;
                        break L19;
                      } else {
                        stackOut_23_0 = (boolean[]) (Object) stackIn_23_0;
                        stackOut_23_1 = stackIn_23_1;
                        stackOut_23_2 = stackIn_23_2;
                        stackOut_23_3 = stackIn_23_3;
                        stackIn_25_0 = stackOut_23_0;
                        stackIn_25_1 = stackOut_23_1;
                        stackIn_25_2 = stackOut_23_2;
                        stackIn_25_3 = stackOut_23_3;
                        stackIn_24_0 = stackOut_23_0;
                        stackIn_24_1 = stackOut_23_1;
                        stackIn_24_2 = stackOut_23_2;
                        stackIn_24_3 = stackOut_23_3;
                        if (var104[1] <= var8) {
                          stackOut_25_0 = (boolean[]) (Object) stackIn_25_0;
                          stackOut_25_1 = stackIn_25_1;
                          stackOut_25_2 = stackIn_25_2;
                          stackOut_25_3 = stackIn_25_3;
                          stackOut_25_4 = 0;
                          stackIn_27_0 = stackOut_25_0;
                          stackIn_27_1 = stackOut_25_1;
                          stackIn_27_2 = stackOut_25_2;
                          stackIn_27_3 = stackOut_25_3;
                          stackIn_27_4 = stackOut_25_4;
                          break L19;
                        } else {
                          stackOut_24_0 = (boolean[]) (Object) stackIn_24_0;
                          stackOut_24_1 = stackIn_24_1;
                          stackOut_24_2 = stackIn_24_2;
                          stackOut_24_3 = stackIn_24_3;
                          stackOut_24_4 = -1;
                          stackIn_27_0 = stackOut_24_0;
                          stackIn_27_1 = stackOut_24_1;
                          stackIn_27_2 = stackOut_24_2;
                          stackIn_27_3 = stackOut_24_3;
                          stackIn_27_4 = stackOut_24_4;
                          break L19;
                        }
                      }
                    }
                    L20: {
                      stackOut_27_0 = (boolean[]) (Object) stackIn_27_0;
                      stackOut_27_1 = stackIn_27_1;
                      stackIn_29_0 = stackOut_27_0;
                      stackIn_29_1 = stackOut_27_1;
                      stackIn_28_0 = stackOut_27_0;
                      stackIn_28_1 = stackOut_27_1;
                      if (stackIn_27_2 + stackIn_27_3 * stackIn_27_4 <= 0) {
                        stackOut_29_0 = (boolean[]) (Object) stackIn_29_0;
                        stackOut_29_1 = stackIn_29_1;
                        stackOut_29_2 = 0;
                        stackIn_30_0 = stackOut_29_0;
                        stackIn_30_1 = stackOut_29_1;
                        stackIn_30_2 = stackOut_29_2;
                        break L20;
                      } else {
                        stackOut_28_0 = (boolean[]) (Object) stackIn_28_0;
                        stackOut_28_1 = stackIn_28_1;
                        stackOut_28_2 = 1;
                        stackIn_30_0 = stackOut_28_0;
                        stackIn_30_1 = stackOut_28_1;
                        stackIn_30_2 = stackOut_28_2;
                        break L20;
                      }
                    }
                    stackIn_30_0[stackIn_30_1] = stackIn_30_2 != 0;
                    var5++;
                    continue L7;
                  }
                }
              } else {
                va.field_N[var5] = ra.field_f[wm.field_Ub[var5]].a(var99, (byte) 91);
                var5++;
                continue L5;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var3 = decompiledCaughtException;
            stackOut_56_0 = (RuntimeException) var3;
            stackOut_56_1 = new StringBuilder().append("gh.W(").append(param0).append(44);
            stackIn_58_0 = stackOut_56_0;
            stackIn_58_1 = stackOut_56_1;
            stackIn_57_0 = stackOut_56_0;
            stackIn_57_1 = stackOut_56_1;
            if (param1 == null) {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "null";
              stackIn_59_0 = stackOut_58_0;
              stackIn_59_1 = stackOut_58_1;
              stackIn_59_2 = stackOut_58_2;
              break L21;
            } else {
              stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
              stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
              stackOut_57_2 = "{...}";
              stackIn_59_0 = stackOut_57_0;
              stackIn_59_1 = stackOut_57_1;
              stackIn_59_2 = stackOut_57_2;
              break L21;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_59_0, stackIn_59_2 + 41);
        }
    }

    final void c(int param0, di param1) {
        ng.field_t = aj.a(0, "", param1, "space_stars");
        hb.field_k = pf.a("", (byte) 103, "shuttle_planet", param1);
        if (param0 != -23569) {
            return;
        }
        try {
            int discarded$0 = 0;
            this.m();
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "gh.OA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static boolean a(String param0) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param0.length() < wo.field_a) {
                  break L1;
                } else {
                  if (param0.length() <= kq.field_c) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L0;
                  } else {
                    return true;
                  }
                }
              }
            }
            stackOut_4_0 = 1;
            stackIn_5_0 = stackOut_4_0;
            return stackIn_5_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("gh.AB(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + 28350 + 41);
        }
        return stackIn_7_0 != 0;
    }

    final void a(di param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var15 = Pool.field_O;
        try {
          L0: {
            ((gh) this).field_O = new eg[13];
            var3_int = 0;
            om.field_w = var3_int;
            int incrementValue$14 = var3_int;
            var3_int++;
            ((gh) this).field_O[incrementValue$14] = eg.a(param0, "", "space_table/asteroid");
            np.field_d = var3_int;
            int incrementValue$15 = var3_int;
            var3_int++;
            ((gh) this).field_O[incrementValue$15] = eg.a(param0, "", "space_table/space_shuttle");
            da.field_b = var3_int;
            int incrementValue$16 = var3_int;
            var3_int++;
            ((gh) this).field_O[incrementValue$16] = eg.a(param0, "", "space_table/space_door_a");
            lg.field_x = var3_int;
            int incrementValue$17 = var3_int;
            var3_int++;
            ((gh) this).field_O[incrementValue$17] = eg.a(param0, "", "space_table/space_door_b");
            ph.field_e = var3_int;
            int incrementValue$18 = var3_int;
            var3_int++;
            ((gh) this).field_O[incrementValue$18] = eg.a(param0, "", "space_table/space_table_post");
            nr.field_eb = var3_int;
            int incrementValue$19 = var3_int;
            var3_int++;
            ((gh) this).field_O[incrementValue$19] = eg.a(param0, "", "space_table/space_hole_a");
            qe.field_J = var3_int;
            vp.field_f = var3_int;
            int incrementValue$20 = var3_int;
            var3_int++;
            ((gh) this).field_O[incrementValue$20] = eg.a(param0, "", "space_table/space_hole_b");
            vn.field_f = var3_int;
            up.field_l = var3_int;
            int incrementValue$21 = var3_int;
            var3_int++;
            ((gh) this).field_O[incrementValue$21] = eg.a(param0, "", "space_table/space_corner");
            int incrementValue$22 = var3_int;
            var3_int++;
            ((gh) this).field_O[incrementValue$22] = eg.a(param0, "", "space_table/space_side_a");
            int incrementValue$23 = var3_int;
            var3_int++;
            ((gh) this).field_O[incrementValue$23] = eg.a(param0, "", "space_table/space_side_b");
            int incrementValue$24 = var3_int;
            var3_int++;
            ((gh) this).field_O[incrementValue$24] = eg.a(param0, "", "space_table/space_side_c");
            to.field_o = var3_int;
            rk.field_d = var3_int;
            int incrementValue$25 = var3_int;
            var3_int++;
            ((gh) this).field_O[incrementValue$25] = eg.a(param0, "", "space_table/space_top_a");
            int incrementValue$26 = var3_int;
            var3_int++;
            ((gh) this).field_O[incrementValue$26] = eg.a(param0, "", "space_table/space_top_b");
            pc.field_b = var3_int;
            ((gh) this).field_A = new jk();
            ((gh) this).field_A.a(eg.a(param0, "", "cues/space_cue"), (byte) -115);
            var4 = 0;
            L1: while (true) {
              if (((gh) this).field_O.length <= var4) {
                var5 = 2147483647;
                var6 = -2147483648;
                var7 = 2147483647;
                var8 = -2147483648;
                var9 = 2147483647;
                var10 = -2147483648;
                var4 = rk.field_d;
                L2: while (true) {
                  if (pc.field_b <= var4) {
                    var7 = var7 * 2 + -var8;
                    var5 = var5 * 2 + -var6;
                    var11 = var6 + var5 >> 1;
                    var12 = var7 - -var8 >> 1;
                    var13 = var10;
                    var4 = 0;
                    L3: while (true) {
                      if (((gh) this).field_O.length <= var4) {
                        ((gh) this).field_M = new int[((gh) this).field_O.length][3];
                        var4 = 0;
                        L4: while (true) {
                          if (var4 >= ((gh) this).field_O.length) {
                            L5: {
                              pp.a(((gh) this).field_O[da.field_b], (short) -8246, true, ((gh) this).field_M[da.field_b], ud.field_I);
                              if (param1 < -43) {
                                break L5;
                              } else {
                                ((gh) this).c(false);
                                break L5;
                              }
                            }
                            pp.a(((gh) this).field_O[lg.field_x], (short) -8246, true, ((gh) this).field_M[lg.field_x], vq.field_Ub);
                            hi.field_h = new byte[32][((gh) this).field_O[om.field_w].field_K];
                            var4 = 0;
                            L6: while (true) {
                              if (hi.field_h.length <= var4) {
                                break L0;
                              } else {
                                var14 = 0;
                                L7: while (true) {
                                  if (var14 >= hi.field_h[var4].length) {
                                    var4++;
                                    continue L6;
                                  } else {
                                    hi.field_h[var4][var14] = (byte)(var4 * 255 / hi.field_h.length);
                                    var14++;
                                    continue L7;
                                  }
                                }
                              }
                            }
                          } else {
                            ln.a(((gh) this).field_M[var4], 0, ((gh) this).field_O[var4]);
                            var4++;
                            continue L4;
                          }
                        }
                      } else {
                        eg discarded$27 = cq.a(var11, 70, var13, ((gh) this).field_O[var4], var12);
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    L8: {
                      d.a(((gh) this).field_O[var4], -23109);
                      if (var7 <= ((gh) this).field_O[var4].field_y) {
                        break L8;
                      } else {
                        var7 = ((gh) this).field_O[var4].field_y;
                        break L8;
                      }
                    }
                    L9: {
                      if (var6 >= ((gh) this).field_O[var4].field_w) {
                        break L9;
                      } else {
                        var6 = ((gh) this).field_O[var4].field_w;
                        break L9;
                      }
                    }
                    L10: {
                      if (((gh) this).field_O[var4].field_D < var5) {
                        var5 = ((gh) this).field_O[var4].field_D;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (((gh) this).field_O[var4].field_V < var9) {
                        var9 = ((gh) this).field_O[var4].field_V;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (((gh) this).field_O[var4].field_S <= var8) {
                        break L12;
                      } else {
                        var8 = ((gh) this).field_O[var4].field_S;
                        break L12;
                      }
                    }
                    L13: {
                      if (var10 < ((gh) this).field_O[var4].field_x) {
                        var10 = ((gh) this).field_O[var4].field_x;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    var4++;
                    continue L2;
                  }
                }
              } else {
                db.a(0, ((gh) this).field_O[var4]);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var3 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) var3;
            stackOut_37_1 = new StringBuilder().append("gh.KA(");
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param0 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L14;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L14;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + 44 + param1 + 41);
        }
    }

    private final void m() {
    }

    final void c(boolean param0) {
        int var2 = 0;
        int var4 = 0;
        so[] var12 = null;
        int var6 = 0;
        int[] var25 = null;
        so[] var14 = null;
        so[] var15 = null;
        int[] var26 = null;
        so[] var17 = null;
        int[] var27 = null;
        int var9 = 0;
        int var5 = 0;
        int var7 = 0;
        int var10 = 0;
        int var8 = 0;
        int var11 = Pool.field_O;
        int var3 = 0;
        so dupTemp$0 = new so((vp.field_f - nr.field_eb) * 4 + 2 * (-qe.field_J + up.field_l));
        wb.field_c = dupTemp$0;
        so dupTemp$1 = new so(4 * (-rk.field_d + pc.field_b));
        ff.field_d = dupTemp$1;
        so dupTemp$2 = new so(4 * (-vn.field_f + to.field_o));
        tq.field_o = dupTemp$2;
        so dupTemp$3 = hc.a(((gh) this).field_O[ph.field_e], ((gh) this).field_M[ph.field_e], (byte) 101);
        ij.field_o = dupTemp$3;
        lq.field_R = new so(new so[4]);
        var3 = 0;
        for (var2 = nr.field_eb; var2 < vp.field_f; var2++) {
            var4 = var2;
            var12 = wb.field_c.field_b;
            var6 = var3;
            var25 = ((gh) this).field_M[var4];
            bh.a(var12, false, var25[1], var25[2], ((gh) this).field_O[var4], var25[0], var6);
            var3 += 4;
        }
        for (var2 = qe.field_J; up.field_l > var2; var2++) {
            var4 = var2;
            var14 = wb.field_c.field_b;
            var6 = var3;
            be.a(var6, ((gh) this).field_M[var4][1], ((gh) this).field_M[var4][2], 1, var14, ((gh) this).field_M[var4][0], ((gh) this).field_O[var4]);
            var3 += 2;
        }
        if (!param0) {
            field_Q = null;
        }
        var3 = 0;
        for (var2 = rk.field_d; var2 < pc.field_b; var2++) {
            var4 = var2;
            var15 = ff.field_d.field_b;
            var6 = var3;
            var26 = ((gh) this).field_M[var4];
            bh.a(var15, false, var26[1], var26[2], ((gh) this).field_O[var4], var26[0], var6);
            var3 += 4;
        }
        var3 = 0;
        for (var2 = vn.field_f; var2 < to.field_o; var2++) {
            var4 = var2;
            var17 = tq.field_o.field_b;
            var6 = var3;
            var27 = ((gh) this).field_M[var4];
            bh.a(var17, false, var27[1], var27[2], ((gh) this).field_O[var4], var27[0], var6);
            var3 += 4;
        }
        ig.field_h = new so(new so[3]);
        ig.field_h.a(false);
        ig.field_h.a(0);
        ig.field_h.a(((gh) this).field_q, ((gh) this).field_e, ((gh) this).field_F, (byte) -101, ((gh) this).field_u, ((gh) this).field_C);
        ig.field_h.d(118);
        lq.field_R.a(false);
        lq.field_R.a(0);
        lq.field_R.a(((gh) this).field_q, ((gh) this).field_e, ((gh) this).field_F, (byte) -124, ((gh) this).field_u, ((gh) this).field_C);
        ij.field_o.d(109);
        ff.field_d.d(97);
        wb.field_c.d(118);
        tq.field_o.d(90);
        kh.field_rc = new boolean[tq.field_o.field_j.length];
        kk.field_C = new int[3][4096];
        s.field_b = new int[3][kk.field_C[0].length];
        for (var9 = 0; var9 < kk.field_C[0].length; var9++) {
            do {
                var4 = ga.a(255, param0, ea.field_r) - 127;
                var5 = ga.a(255, param0, ea.field_r) + -127;
                var6 = ga.a(255, param0, ea.field_r) + -127;
                var7 = 256;
                var10 = var4 * var4 + (var5 * var5 - -(var6 * var6));
                var8 = rf.a(var10, -121);
            } while (var8 == 0);
            kk.field_C[0][var9] = (var7 * var4 << 8) / var8;
            kk.field_C[1][var9] = (var5 * var7 << 8) / var8;
            kk.field_C[2][var9] = (var7 * var6 << 8) / var8;
        }
    }

    final void a(int param0, di param1) {
        try {
            if (param0 != 1) {
                Object var4 = null;
                ((gh) this).c(63, (di) null);
            }
            ((gh) this).field_b = cg.a(param1, "", "pool_space");
            ((gh) this).field_i = cg.a(param1, "", "pool_space_win_jingle");
            ((gh) this).field_n = cg.a(param1, "", "pool_space_lose_jingle");
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "gh.Q(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void i(int param0) {
        super.i(param0);
        int[] var3 = ta.a(new int[4], 47);
        int[] var2 = var3;
        dg.field_K = ta.a(new int[10], -122);
    }

    final void a(byte param0, boolean param1, int param2) {
        int var4 = -109 / ((-47 - param0) / 45);
        if (param2 != 9) {
        } else {
            if (null != vb.field_b) {
                if (!param1) {
                    vb.field_b.c(4096);
                } else {
                    vb.field_b.c(64);
                }
                vb.field_b = null;
            }
        }
    }

    final static int n(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_31_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_30_0 = 0;
        var7 = Pool.field_O;
        try {
          L0: {
            var1_int = 0;
            var2 = 0;
            L1: while (true) {
              if (!n.h(127)) {
                L2: {
                  n.field_W.a(ub.a(lq.field_W, ua.field_o, 0), ub.a(wn.field_i, gg.field_f, ~param0), -41);
                  if (n.field_W.b((byte) 93)) {
                    var1_int = 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var3 = 0;
                    if (var1_int == 0) {
                      break L4;
                    } else {
                      if (n.field_W.field_h >= 0) {
                        L5: {
                          var3 = mb.field_c[n.field_W.field_h];
                          if (2 == var3) {
                            break L5;
                          } else {
                            if (var3 != 5) {
                              break L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                        gr.g(param0 + 127);
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (var2 == 0) {
                    break L3;
                  } else {
                    if (oa.field_h != 2) {
                      gr.g(116);
                      break L3;
                    } else {
                      L6: {
                        if (param0 != ~var3) {
                          break L6;
                        } else {
                          if (oa.field_h != 2) {
                            break L6;
                          } else {
                            var4 = -ap.field_y + rl.a((byte) -128);
                            var6 = (int)((10999L + -var4) / 1000L);
                            if (var6 > 0) {
                              break L6;
                            } else {
                              var3 = 2;
                              kk.a(true, 4, 5);
                              break L6;
                            }
                          }
                        }
                      }
                      return var3;
                    }
                  }
                }
                L7: {
                  if (param0 != ~var3) {
                    break L7;
                  } else {
                    if (oa.field_h != 2) {
                      break L7;
                    } else {
                      var4 = -ap.field_y + rl.a((byte) -128);
                      var6 = (int)((10999L + -var4) / 1000L);
                      if (var6 > 0) {
                        break L7;
                      } else {
                        var3 = 2;
                        kk.a(true, 4, 5);
                        break L7;
                      }
                    }
                  }
                }
                stackOut_30_0 = var3;
                stackIn_31_0 = stackOut_30_0;
                break L0;
              } else {
                L8: {
                  n.field_W.e(-15525);
                  if (n.field_W.b((byte) 126)) {
                    var1_int = 1;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                if (qi.field_a != 13) {
                  continue L1;
                } else {
                  var2 = 1;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1, "gh.WA(" + param0 + 41);
        }
        return stackIn_31_0;
    }

    gh() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Q = "Waiting for fonts";
    }
}
