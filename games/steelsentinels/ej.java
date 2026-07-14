/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej extends we {
    static String field_z;
    static int field_y;
    static String field_w;
    static String field_C;
    private ic field_A;
    static int field_v;
    static String field_u;
    static cm field_t;
    static String field_E;
    static int field_B;
    static String field_x;
    ul field_F;
    static int field_H;
    static String field_s;
    static int field_D;
    wg field_G;

    final void d(int param0) {
        int var2 = 0;
        hj var3 = null;
        int var4 = 0;
        var4 = SteelSentinels.field_G;
        ((ej) this).field_G.d(param0);
        var3 = (hj) (Object) ((ej) this).field_F.e(13058);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              if (!((ej) this).field_A.a(var3, false)) {
                var2 = param0;
                L2: while (true) {
                  if (var2 <= var3.field_K) {
                    this.a(110, var3, var2);
                    var3.field_K = var3.field_K - var2;
                    break L1;
                  } else {
                    this.a(-105, var3, var3.field_K);
                    var2 = var2 - var3.field_K;
                    if (!((ej) this).field_A.a(var2, 0, 7139, var3, (int[]) null)) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            var3 = (hj) (Object) ((ej) this).field_F.a((byte) -28);
            continue L0;
          }
        }
    }

    public static void e(int param0) {
        field_C = null;
        field_w = null;
        field_x = null;
        field_E = null;
        field_t = null;
        field_u = null;
        if (param0 >= -62) {
            ej.e(-110);
        }
        field_z = null;
        field_s = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var12 = SteelSentinels.field_G;
          if (pb.field_i > param1) {
            param2 = param2 - (pb.field_i + -param1);
            param1 = pb.field_i;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param5 == 40) {
            break L1;
          } else {
            field_t = null;
            break L1;
          }
        }
        L2: {
          if (pb.field_b >= param2 + param1) {
            break L2;
          } else {
            param2 = pb.field_b + -param1;
            break L2;
          }
        }
        L3: {
          if (pb.field_l > param4) {
            param0 = param0 - (pb.field_l + -param4);
            param4 = pb.field_l;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (pb.field_d < param0 + param4) {
            param0 = pb.field_d - param4;
            break L4;
          } else {
            break L4;
          }
        }
        if ((param2 ^ -1) >= -1) {
          return;
        } else {
          if (0 < param0) {
            var6 = param4 * pb.field_c + param1;
            var7 = -param2 + pb.field_c;
            param4 = -param0;
            L5: while (true) {
              if (-1 >= (param4 ^ -1)) {
                return;
              } else {
                param1 = -param2;
                L6: while (true) {
                  if ((param1 ^ -1) <= -1) {
                    var6 = var6 + var7;
                    param4++;
                    continue L5;
                  } else {
                    var8 = pb.field_g[var6];
                    if ((var8 & 65280) >> -2059790200 > param3) {
                      if ((var8 >> 1075212912 & 255) <= (var8 & 65280) >> -905764632) {
                        L7: {
                          var9 = (var8 >> -94955057 & 510) + -60;
                          if ((var9 ^ -1) < -256) {
                            var9 = 255;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        var10 = 65280 & var8;
                        var10 = (var10 >> -1549321119) + -(var10 >> 811447557) & 65280;
                        var11 = var8 >> -776543165 & 31;
                        pb.field_g[var6] = vn.a(vn.a(var9 << -1697145264, var10), var11);
                        var6++;
                        param1++;
                        continue L6;
                      } else {
                        var6++;
                        param1++;
                        continue L6;
                      }
                    } else {
                      var6++;
                      param1++;
                      continue L6;
                    }
                  }
                }
              }
            }
          } else {
            return;
          }
        }
    }

    final void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var7 = SteelSentinels.field_G;
        ((ej) this).field_G.a(param0, param1, param2);
        hj var6 = (hj) (Object) ((ej) this).field_F.e(13058);
        while (var6 != null) {
            if (!(((ej) this).field_A.a(var6, false))) {
                var4 = param1;
                var5 = param2;
                while (var5 > var6.field_K) {
                    this.a(var4, var6.field_K, (byte) 32, var6, param0, var5 + var4);
                    var4 = var4 + var6.field_K;
                    var5 = var5 - var6.field_K;
                    // ifne L176
                }
                this.a(var4, var5, (byte) -112, var6, param0, var5 + var4);
                var6.field_K = var6.field_K - var5;
            }
            var6 = (hj) (Object) ((ej) this).field_F.a((byte) -37);
        }
    }

    final int a() {
        return 0;
    }

    final we b() {
        hj var1 = null;
        L0: while (true) {
          var1 = (hj) (Object) ((ej) this).field_F.a((byte) -122);
          if (var1 != null) {
            if (null != var1.field_A) {
              return (we) (Object) var1.field_A;
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    private final void a(int param0, hj param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        ic stackIn_7_0 = null;
        ic stackIn_8_0 = null;
        ic stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        ic stackOut_6_0 = null;
        ic stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        ic stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        L0: {
          if (-1 == (((ej) this).field_A.field_F[param1.field_t] & 4)) {
            break L0;
          } else {
            if (-1 <= param1.field_J) {
              break L0;
            } else {
              var4 = ((ej) this).field_A.field_u[param1.field_t] / tb.field_g;
              var5 = (1048575 + var4 - param1.field_v) / var4;
              param1.field_v = 1048575 & param1.field_v + param2 * var4;
              if (param2 >= var5) {
                L1: {
                  if (-1 != (((ej) this).field_A.field_L[param1.field_t] ^ -1)) {
                    L2: {
                      param1.field_A = em.a(param1.field_q, param1.field_A.j(), 0, param1.field_A.i());
                      stackOut_6_0 = ((ej) this).field_A;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (param1.field_N.field_p[param1.field_z] >= 0) {
                        stackOut_8_0 = (ic) (Object) stackIn_8_0;
                        stackOut_8_1 = 0;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        break L2;
                      } else {
                        stackOut_7_0 = (ic) (Object) stackIn_7_0;
                        stackOut_7_1 = 1;
                        stackIn_9_0 = stackOut_7_0;
                        stackIn_9_1 = stackOut_7_1;
                        break L2;
                      }
                    }
                    ((ic) (Object) stackIn_9_0).a(stackIn_9_1 != 0, 111, param1);
                    break L1;
                  } else {
                    param1.field_A = em.a(param1.field_q, param1.field_A.j(), param1.field_A.f(), param1.field_A.i());
                    break L1;
                  }
                }
                L3: {
                  if (-1 >= (param1.field_N.field_p[param1.field_z] ^ -1)) {
                    break L3;
                  } else {
                    param1.field_A.h(-1);
                    break L3;
                  }
                }
                param2 = param1.field_v / var4;
                break L0;
              } else {
                break L0;
              }
            }
          }
        }
        param1.field_A.d(param2);
        var4 = 109 / ((12 - param0) / 60);
    }

    private final void a(int param0, int param1, byte param2, hj param3, int[] param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        em var12 = null;
        int var13 = 0;
        ic stackIn_11_0 = null;
        ic stackIn_12_0 = null;
        ic stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        ic stackOut_10_0 = null;
        ic stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        ic stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        L0: {
          var13 = SteelSentinels.field_G;
          var7 = -21 % ((-50 - param2) / 62);
          if (-1 == (((ej) this).field_A.field_F[param3.field_t] & 4 ^ -1)) {
            break L0;
          } else {
            if (0 > param3.field_J) {
              var8 = ((ej) this).field_A.field_u[param3.field_t] / tb.field_g;
              L1: while (true) {
                var9 = (-param3.field_v + (var8 + 1048575)) / var8;
                if (var9 > param1) {
                  param3.field_v = param3.field_v + param1 * var8;
                  break L0;
                } else {
                  L2: {
                    param3.field_A.a(param4, param0, var9);
                    param0 = param0 + var9;
                    param1 = param1 - var9;
                    param3.field_v = param3.field_v + (-1048576 + var8 * var9);
                    var10 = tb.field_g / 100;
                    var11 = 262144 / var8;
                    if (var11 < var10) {
                      var10 = var11;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    var12 = param3.field_A;
                    if (-1 != (((ej) this).field_A.field_L[param3.field_t] ^ -1)) {
                      L4: {
                        param3.field_A = em.a(param3.field_q, var12.j(), 0, var12.i());
                        stackOut_10_0 = ((ej) this).field_A;
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_11_0 = stackOut_10_0;
                        if (-1 >= (param3.field_N.field_p[param3.field_z] ^ -1)) {
                          stackOut_12_0 = (ic) (Object) stackIn_12_0;
                          stackOut_12_1 = 0;
                          stackIn_13_0 = stackOut_12_0;
                          stackIn_13_1 = stackOut_12_1;
                          break L4;
                        } else {
                          stackOut_11_0 = (ic) (Object) stackIn_11_0;
                          stackOut_11_1 = 1;
                          stackIn_13_0 = stackOut_11_0;
                          stackIn_13_1 = stackOut_11_1;
                          break L4;
                        }
                      }
                      ((ic) (Object) stackIn_13_0).a(stackIn_13_1 != 0, -59, param3);
                      param3.field_A.b(var10, var12.f());
                      break L3;
                    } else {
                      param3.field_A = em.a(param3.field_q, var12.j(), var12.f(), var12.i());
                      break L3;
                    }
                  }
                  L5: {
                    if ((param3.field_N.field_p[param3.field_z] ^ -1) > -1) {
                      param3.field_A.h(-1);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var12.g(var10);
                  var12.a(param4, param0, param5 + -param0);
                  if (var12.l()) {
                    ((ej) this).field_G.b((we) (Object) var12);
                    continue L1;
                  } else {
                    continue L1;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
        param3.field_A.a(param4, param0, param1);
    }

    final static boolean f(int param0) {
        if (null != jb.field_B) {
            return true;
        }
        if (!kd.field_x.a("benefits", (byte) 90)) {
            return false;
        }
        jb.field_B = rl.a(kd.field_x, "benefits", "members_benefits_borders", false);
        if (param0 > -126) {
            return true;
        }
        el.field_ac = rl.a(kd.field_x, "benefits", "members_benefits_price", false);
        bc.field_qb = rl.a(kd.field_x, "benefits", "members_benefits_logo", false);
        pg.field_v = cf.a("members_benefits_screenshots", "benefits", (byte) -73, kd.field_x);
        vc.a(uj.field_h, jb.field_B, false);
        ha.a(16744576, 2, (byte) 120, (mi) (Object) va.field_j, -2400, el.field_ac, 80, 40, 15, 80, 40);
        uh.a(1, pg.field_v);
        qa.a(bc.field_qb, (byte) 69);
        return true;
    }

    final we d() {
        hj var1 = (hj) (Object) ((ej) this).field_F.e(13058);
        if (var1 == null) {
            return null;
        }
        if (null != var1.field_A) {
            return (we) (Object) var1.field_A;
        }
        return ((ej) this).b();
    }

    ej(ic param0) {
        ((ej) this).field_F = new ul();
        ((ej) this).field_G = new wg();
        ((ej) this).field_A = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "STANDARD";
        field_z = "This password contains your email address, and would be easy to guess";
        field_E = "NONE";
        field_u = "Show players in <%0>'s game";
        field_v = 1;
        field_H = 0;
        field_x = "Asking to join <%0>'s game...";
        field_s = "You have discovered the following items:";
        field_w = "Kick";
    }
}
