/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db implements ml {
    private int field_f;
    private int field_d;
    private int field_j;
    private int field_h;
    private ta field_a;
    static String field_b;
    static String field_e;
    private int field_g;
    private int field_c;
    private int field_i;

    final static void a(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = (Object) (Object) we.field_n;
                    // monitorenter we.field_n
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ni.field_a = lf.field_a;
                        mg.field_s = mg.field_s + 1;
                        ei.field_a = b.field_k;
                        p.field_a = dh.field_b;
                        oe.field_d = oh.field_b;
                        oh.field_b = false;
                        kc.field_d = ke.field_g;
                        qg.field_c = cj.field_d;
                        ab.field_e = ek.field_a;
                        ke.field_g = param0;
                        // monitorexit var1
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 4: {
                    throw (RuntimeException) (Object) var2;
                }
                case 5: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(boolean param0) {
        int var1 = 0;
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var2 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (!param0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        ah.field_h = stackIn_3_0 != 0;
        rc.field_i = null;
        if (!fk.field_a) {
          var1 = ue.field_G;
          if (-1 > (var1 ^ -1)) {
            if (var1 != 1) {
              rc.field_i = gg.a(new String[1], pj.field_d, true);
              rc.field_i = vd.a(new CharSequence[3], (byte) -125);
              me.field_f.g((byte) -75);
              hl.b(34);
              return;
            } else {
              rc.field_i = mc.field_i;
              rc.field_i = vd.a(new CharSequence[3], (byte) -125);
              me.field_f.g((byte) -75);
              hl.b(34);
              return;
            }
          } else {
            me.field_f.g((byte) -75);
            hl.b(34);
            return;
          }
        } else {
          me.field_f.q(105);
          return;
        }
    }

    final static void a(int param0, int param1) {
        int var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        int var2 = -108 % ((param1 - -28) / 61);
        d var3 = (d) (Object) wk.field_b.a((byte) -117);
        while (var3 != null) {
            pj.a(param0, var3, true);
            var3 = (d) (Object) wk.field_b.d((byte) 63);
        }
        de var5 = (de) (Object) qa.field_d.a((byte) -117);
        while (var5 != null) {
            w.a(-94, param0, var5);
            var5 = (de) (Object) qa.field_d.d((byte) 63);
        }
    }

    public final void a(boolean param0, we param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        fj var14 = null;
        we stackIn_3_0 = null;
        we stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          if (param1 instanceof fj) {
            stackOut_2_0 = (we) param1;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (we) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var14 = (fj) (Object) stackIn_3_0;
          ge.d(param1.field_r + param3, param1.field_e + param2, param1.field_l, param1.field_p, ((db) this).field_i);
          if (var14 != null) {
            break L1;
          } else {
            break L1;
          }
        }
        var7 = var14.field_I + (param3 - -param1.field_r);
        var8 = param2 + (param1.field_e + var14.field_C);
        ge.f(var7, var8, var14.field_G, ((db) this).field_c);
        if (param4 <= 19) {
          return;
        } else {
          L2: {
            if ((var14.field_H ^ -1) == 0) {
              break L2;
            } else {
              var9 = 2.0 * ((double)var14.field_H * 3.141592653589793) / (double)var14.field_K;
              var11 = (int)(-Math.sin(var9) * (double)var14.field_G);
              var12 = (int)(Math.cos(var9) * (double)var14.field_G);
              ge.f(var7 - -var11, var12 + var8, 1, ((db) this).field_j);
              break L2;
            }
          }
          L3: {
            ge.f(var7, var8, 2, 1);
            var9 = 2.0 * (3.141592653589793 * (double)var14.field_D) / (double)var14.field_K;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_G);
            var12 = (int)(Math.cos(var9) * (double)var14.field_G);
            ge.e(var7, var8, var7 + var11, var12 + var8, 1);
            if (((db) this).field_a != null) {
              var13 = ((db) this).field_d + var14.field_I + var14.field_G;
              int discarded$1 = ((db) this).field_a.a(param1.field_s, param1.field_r + (param3 - -var13), ((db) this).field_g + param2 - -param1.field_e, -((db) this).field_d - (var13 - param1.field_l), -(((db) this).field_d << 1978096801) + param1.field_p, ((db) this).field_f, ((db) this).field_h, 1, 1, 0);
              break L3;
            } else {
              break L3;
            }
          }
          return;
        }
    }

    public static void a(byte param0) {
        if (param0 >= -13) {
            field_b = null;
            field_e = null;
            field_b = null;
            return;
        }
        field_e = null;
        field_b = null;
    }

    final static void b(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int stackIn_2_0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        var1 = 8;
        ci.a(param0 ^ 30460, 176, 464, var1 + 40 + -2, 0, new int[8], 100);
        ci.a(30380, 176, 464, var1 + 40, 1, new int[6], 145);
        if (param0 == 80) {
          L0: {
            stackOut_11_0 = 30380;
            stackIn_13_0 = stackOut_11_0;
            stackIn_12_0 = stackOut_11_0;
            if (fe.field_h == 2) {
              stackOut_13_0 = stackIn_13_0;
              stackOut_13_1 = 65;
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              break L0;
            } else {
              stackOut_12_0 = stackIn_12_0;
              stackOut_12_1 = 75;
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              break L0;
            }
          }
          L1: {
            stackOut_14_0 = stackIn_14_0;
            stackOut_14_1 = stackIn_14_1;
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (2 != fe.field_h) {
              stackOut_16_0 = stackIn_16_0;
              stackOut_16_1 = stackIn_16_1;
              stackOut_16_2 = 565;
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L1;
            } else {
              stackOut_15_0 = stackIn_15_0;
              stackOut_15_1 = stackIn_15_1;
              stackOut_15_2 = 575;
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L1;
            }
          }
          L2: {
            ci.a(stackIn_17_0, stackIn_17_1, stackIn_17_2, var1 + 40, 2, new int[4], 380);
            ci.a(30380, 255, 385, var1 + 40, 3, new int[3], 380);
            ci.a(30380, 255, 385, var1 + 40, 4, new int[3], 380);
            ci.a(30380, 166, 474, var1 + 40, 5, new int[1], 370);
            ci.a(param0 + 30300, 180, 460, 40 - -var1, 6, new int[2], 370);
            ci.a(param0 + 30300, 164, 476, 40 - -var1, 7, new int[2], 200);
            ci.a(param0 + 30300, 166, 474, 40 - -var1, 8, new int[2], 370);
            ci.a(30380, 166, 474, var1 + 40, 9, new int[2], 380);
            ci.a(param0 + 30300, 180, 460, 40 - -var1, 10, new int[1], 370);
            lh.field_b = pl.field_e.a(ma.field_a[11]);
            var2 = pl.field_e.a(ma.field_a[12]);
            if (var2 > lh.field_b) {
              lh.field_b = var2;
              break L2;
            } else {
              break L2;
            }
          }
          var3 = 4 + pl.field_e.field_j - -pl.field_e.field_D;
          i.field_r[7] = pl.field_e.field_D + 200 + (pl.field_e.field_C + var3);
          mc.field_b[7] = 40 + var3;
          return;
        } else {
          L3: {
            field_e = null;
            stackOut_1_0 = 30380;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (fe.field_h == 2) {
              stackOut_3_0 = stackIn_3_0;
              stackOut_3_1 = 65;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L3;
            } else {
              stackOut_2_0 = stackIn_2_0;
              stackOut_2_1 = 75;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L3;
            }
          }
          L4: {
            stackOut_4_0 = stackIn_4_0;
            stackOut_4_1 = stackIn_4_1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (2 != fe.field_h) {
              stackOut_6_0 = stackIn_6_0;
              stackOut_6_1 = stackIn_6_1;
              stackOut_6_2 = 565;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L4;
            } else {
              stackOut_5_0 = stackIn_5_0;
              stackOut_5_1 = stackIn_5_1;
              stackOut_5_2 = 575;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L4;
            }
          }
          L5: {
            ci.a(stackIn_7_0, stackIn_7_1, stackIn_7_2, var1 + 40, 2, new int[4], 380);
            ci.a(30380, 255, 385, var1 + 40, 3, new int[3], 380);
            ci.a(30380, 255, 385, var1 + 40, 4, new int[3], 380);
            ci.a(30380, 166, 474, var1 + 40, 5, new int[1], 370);
            ci.a(param0 + 30300, 180, 460, 40 - -var1, 6, new int[2], 370);
            ci.a(param0 + 30300, 164, 476, 40 - -var1, 7, new int[2], 200);
            ci.a(param0 + 30300, 166, 474, 40 - -var1, 8, new int[2], 370);
            ci.a(30380, 166, 474, var1 + 40, 9, new int[2], 380);
            ci.a(param0 + 30300, 180, 460, 40 - -var1, 10, new int[1], 370);
            lh.field_b = pl.field_e.a(ma.field_a[11]);
            var2 = pl.field_e.a(ma.field_a[12]);
            if (var2 > lh.field_b) {
              lh.field_b = var2;
              break L5;
            } else {
              break L5;
            }
          }
          var3 = 4 + pl.field_e.field_j - -pl.field_e.field_D;
          i.field_r[7] = pl.field_e.field_D + 200 + (pl.field_e.field_C + var3);
          mc.field_b[7] = 40 + var3;
          return;
        }
    }

    db(ta param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((db) this).field_a = param0;
        ((db) this).field_f = param3;
        ((db) this).field_j = param6;
        ((db) this).field_d = param1;
        ((db) this).field_h = param4;
        ((db) this).field_i = param7;
        ((db) this).field_g = param2;
        ((db) this).field_c = param5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Loading extra data";
        field_e = "Close";
    }
}
