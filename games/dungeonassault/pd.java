/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd extends rj {
    int field_H;
    private int field_F;
    static od field_J;
    int field_D;
    int field_C;
    int field_z;
    static String field_E;
    static String field_B;
    static ef field_A;
    static String field_G;

    final void a(int param0, int param1) {
        ((pd) this).field_z = ((pd) this).field_z + ((pd) this).field_H * param1;
        if (!(((pd) this).field_C >= ((pd) this).field_z)) {
            ((pd) this).field_z = ((pd) this).field_C;
        }
        if (param0 != 1) {
            ((pd) this).a(-97, (byte) 28, -122);
        }
        if (!(0 <= ((pd) this).field_z)) {
            ((pd) this).field_z = 0;
        }
    }

    public static void c() {
        field_B = null;
        field_G = null;
        field_A = null;
        field_E = null;
        field_J = null;
    }

    final void d(int param0, int param1, int param2) {
        if (0 == ((pd) this).field_F) {
            return;
        }
        int var4 = this.a(param2, true);
        if (var4 > ((pd) this).field_C) {
            var4 = ((pd) this).field_C;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        ((pd) this).field_z = var4;
        if (param1 != 128) {
            boolean discarded$0 = pd.c(57, 88, (byte) -82);
        }
    }

    final void b(int param0, int param1) {
        if (param0 != 4973) {
            boolean discarded$0 = pd.c(-62, 37, (byte) -14);
        }
        this.a(param1 >> 5, -18566, param1, param1 >> 4);
    }

    final static boolean c(int param0, int param1, byte param2) {
        int var3 = 0;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            var3 = -8 / ((param2 - 14) / 43);
            if (vf.field_w - 16 > param1) {
              break L1;
            } else {
              if (16 + (vf.field_w + 200) <= param1) {
                break L1;
              } else {
                if (param0 < -32 + qc.field_w) {
                  break L1;
                } else {
                  if (32 + (wi.field_kb + qc.field_w) <= param0) {
                    break L1;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L0;
                  }
                }
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_6_0 != 0;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        ((pd) this).field_H = param0 <= 0 ? 1 : param0;
        ((pd) this).field_D = param3 > 0 ? param3 : 1;
        ((pd) this).field_C = param2;
    }

    final static void a(java.awt.Canvas param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              int discarded$12 = -1;
              ud.a((java.awt.Component) (Object) param0);
              gn.a((byte) 127, (java.awt.Component) (Object) param0);
              if (bn.field_j != null) {
                bn.field_j.a(false, (java.awt.Component) (Object) param0);
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("pd.R(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + -32 + 41);
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            sm.a(param1, 31500, "");
            fk.a(84, param1);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "pd.L(" + 5189 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(boolean param0, int param1, int param2) {
        if (67 > param2) {
            param2 = 47;
        }
        super.a(param0, param1, param2);
        ((pd) this).field_F = -20 + param2;
    }

    final void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        var7 = DungeonAssault.field_K;
        var4 = param0 + ((pd) this).field_t;
        var5 = ((pd) this).field_i + param2;
        int discarded$5 = 99;
        bp.a(var5, hm.field_q, var4);
        int discarded$6 = 99;
        bp.a(((pd) this).field_F + var5 - -10, qf.field_f, var4);
        var6 = 0;
        L0: while (true) {
          if (var6 >= 7) {
            var6 = 0;
            L1: while (true) {
              if (var6 >= 3) {
                var6 = 1;
                L2: while (true) {
                  if (-1 + ((pd) this).field_F <= var6) {
                    bo.field_Kb.h(var4, var5);
                    if (param1 == 8187) {
                      L3: {
                        ud.field_y.h(var4, ((pd) this).field_F + var5 + 10);
                        if (((pd) this).field_F < 2 * qh.field_q.field_v) {
                          L4: {
                            if (0 == ((pd) this).field_C) {
                              stackOut_18_0 = 0;
                              stackIn_19_0 = stackOut_18_0;
                              break L4;
                            } else {
                              stackOut_17_0 = ((pd) this).field_z * (-23 + ((pd) this).field_F) / ((pd) this).field_C;
                              stackIn_19_0 = stackOut_17_0;
                              break L4;
                            }
                          }
                          var6 = stackIn_19_0;
                          gf.e(var4 + 4, var6 + var5 + 5, qh.field_q.field_y + (4 + var4), qh.field_q.field_v / 2 + (var6 + 10) + (var5 + 5));
                          int discarded$7 = 99;
                          bp.a(10 + var5 + var6, ji.field_G, var4 - -4);
                          int discarded$8 = 99;
                          bp.a(var5 - (-10 - var6) + -23, ji.field_G, 4 + var4);
                          gf.b();
                          qh.field_q.c(var4 - -4, var6 + var5 + 10, qh.field_q.field_y, qh.field_q.field_v / 2);
                          break L3;
                        } else {
                          L5: {
                            if (((pd) this).field_C == 0) {
                              stackOut_14_0 = 0;
                              stackIn_15_0 = stackOut_14_0;
                              break L5;
                            } else {
                              stackOut_13_0 = ((pd) this).field_z * (((pd) this).field_F - 46) / ((pd) this).field_C;
                              stackIn_15_0 = stackOut_13_0;
                              break L5;
                            }
                          }
                          var6 = stackIn_15_0;
                          int discarded$9 = 99;
                          bp.a(var6 + (10 + var5), ji.field_G, 4 + var4);
                          qh.field_q.h(var4 + 4, var6 + 10 + var5);
                          break L3;
                        }
                      }
                      return;
                    } else {
                      return;
                    }
                  } else {
                    qe.a(var4 - -7, var5 + 10 + var6, 5, 0, -(var6 * 80 / ((pd) this).field_F) + 144);
                    var6++;
                    continue L2;
                  }
                }
              } else {
                qe.b(-var6 + var4 - -5, 11 + var5, ((pd) this).field_F + -2, 0, 192 + -(var6 * 64));
                qe.b(var6 + (13 + var4), var5 + 11, -2 + ((pd) this).field_F, 0, (3 - var6) * 64);
                var6++;
                continue L1;
              }
            }
          } else {
            te.b(var6 + (6 + var4), var5 + 11, ((pd) this).field_F - 2, kc.field_M);
            var6++;
            continue L0;
          }
        }
    }

    pd(int param0, int param1, int param2, int param3, int param4, int param5) {
        super(param0, param1, 19, param3, param2);
        ((pd) this).field_z = param5;
        ((pd) this).field_F = param3 - 20;
        ((pd) this).b(4973, param4);
    }

    final void a(int param0, byte param1, int param2) {
        int var4 = 0;
        if (param1 <= -59) {
          if (((pd) this).field_F == 0) {
            return;
          } else {
            L0: {
              var4 = this.a(param0, true);
              if (var4 > ((pd) this).field_z) {
                ((pd) this).field_z = ((pd) this).field_z + ((pd) this).field_D;
                break L0;
              } else {
                if (var4 >= ((pd) this).field_z) {
                  break L0;
                } else {
                  ((pd) this).field_z = ((pd) this).field_z - ((pd) this).field_D;
                  break L0;
                }
              }
            }
            L1: {
              if (((pd) this).field_C >= ((pd) this).field_z) {
                break L1;
              } else {
                ((pd) this).field_z = ((pd) this).field_C;
                break L1;
              }
            }
            L2: {
              if (((pd) this).field_z >= 0) {
                break L2;
              } else {
                ((pd) this).field_z = 0;
                break L2;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    private final int a(int param0, boolean param1) {
        int var3 = 0;
        if (qh.field_q.field_v * 2 > ((pd) this).field_F) {
            var3 = (param0 + -16) * ((pd) this).field_C / (-23 + ((pd) this).field_F);
        } else {
            var3 = ((pd) this).field_C * (-33 + param0) / (((pd) this).field_F + -46);
        }
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = new od();
        field_G = "Giant Spider";
        field_B = "Sound: ";
    }
}
