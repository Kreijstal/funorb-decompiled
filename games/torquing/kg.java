/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg {
    private sg field_d;
    private int field_b;
    static nh field_c;
    pj field_a;

    final static boolean a(int[] param0, byte param1) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        ai var4_ref_ai = null;
        int var4 = 0;
        int var5_int = 0;
        ai var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        int stackOut_2_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_29_0 = 0;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Torquing.field_u;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (ef.field_a == w.field_cb) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = 0;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        var2_long = km.b(-1);
                        if (param1 == 21) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = 0;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0 != 0;
                }
                case 7: {
                    try {
                        if (wh.field_x == 0) {
                            statePc = 17;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (-1 < (im.field_E ^ -1)) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var4_ref_ai = (ai) ((Object) qe.field_c.b(param1 + -21));
                        if (var4_ref_ai == null) {
                            statePc = 18;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var4_ref_ai.field_n >= var2_long) {
                            statePc = 18;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var4_ref_ai.f(0);
                        oo.field_a = var4_ref_ai.field_k.length;
                        kj.field_d.field_n = 0;
                        var5_int = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var5_int >= oo.field_a) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        kj.field_d.field_j[var5_int] = var4_ref_ai.field_k[var5_int];
                        var5_int++;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        mm.field_d = eb.field_f;
                        eb.field_f = wk.field_h;
                        wk.field_h = fa.field_e;
                        fa.field_e = var4_ref_ai.field_j;
                        stackOut_15_0 = 1;
                        stackIn_16_0 = stackOut_15_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return stackIn_16_0 != 0;
                }
                case 17: {
                    stackOut_17_0 = im.field_E;
                    stackIn_20_0 = stackOut_17_0;
                    statePc = 20;
                    continue stateLoop;
                }
                case 18: {
                    stackOut_18_0 = im.field_E;
                    stackIn_20_0 = stackOut_18_0;
                    statePc = 20;
                    continue stateLoop;
                }
                case 19: {
                    try {
                        stackOut_19_0 = im.field_E;
                        stackIn_20_0 = stackOut_19_0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if ((stackIn_20_0 ^ -1) <= -1) {
                            statePc = 25;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        kj.field_d.field_n = 0;
                        if (no.a(1, param1 + -21)) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackOut_22_0 = 0;
                        stackIn_23_0 = stackOut_22_0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 23: {
                    return stackIn_23_0 != 0;
                }
                case 24: {
                    try {
                        im.field_E = kj.field_d.a(true);
                        kj.field_d.field_n = 0;
                        oo.field_a = param0[im.field_E];
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (ah.a(param1 ^ 23)) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackOut_26_0 = 0;
                        stackIn_27_0 = stackOut_26_0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 27: {
                    return stackIn_27_0 != 0;
                }
                case 28: {
                    try {
                        if (wh.field_x != 0) {
                            statePc = 31;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        mm.field_d = eb.field_f;
                        eb.field_f = wk.field_h;
                        wk.field_h = fa.field_e;
                        fa.field_e = im.field_E;
                        im.field_E = -1;
                        stackOut_29_0 = 1;
                        stackIn_30_0 = stackOut_29_0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 30: {
                    return stackIn_30_0 != 0;
                }
                case 31: {
                    try {
                        var4 = wh.field_x;
                        if (0.0 == u.field_s) {
                            statePc = 35;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var4 = (int)((double)var4 + sa.field_d.nextGaussian() * u.field_s);
                        if (-1 < (var4 ^ -1)) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var4 = 0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var5 = new ai((long)var4 + var2_long, im.field_E, new byte[oo.field_a]);
                        var6 = 0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (oo.field_a <= var6) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var5.field_k[var6] = kj.field_d.field_j[var6];
                        var6++;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        qe.field_c.a((byte) 54, var5);
                        im.field_E = -1;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 39: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackOut_39_0 = (RuntimeException) (var2);
                    stackOut_39_1 = new StringBuilder().append("kg.C(");
                    stackIn_41_0 = stackOut_39_0;
                    stackIn_41_1 = stackOut_39_1;
                    stackIn_40_0 = stackOut_39_0;
                    stackIn_40_1 = stackOut_39_1;
                    if (param0 == null) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
                    stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
                    stackOut_40_2 = "{...}";
                    stackIn_42_0 = stackOut_40_0;
                    stackIn_42_1 = stackOut_40_1;
                    stackIn_42_2 = stackOut_40_2;
                    statePc = 42;
                    continue stateLoop;
                }
                case 41: {
                    stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
                    stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
                    stackOut_41_2 = "null";
                    stackIn_42_0 = stackOut_41_0;
                    stackIn_42_1 = stackOut_41_1;
                    stackIn_42_2 = stackOut_41_2;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    throw rb.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0) {
        ul.field_e = new ei();
        if (param0 < 81) {
            field_c = (nh) null;
        }
    }

    final void a(boolean param0) {
        if (!(this.field_a == null)) {
            this.field_a.field_z[0] = (short)(this.field_a.field_z[0] + 1);
            if (!((short)(this.field_a.field_z[0] + 1) % 16 != 0)) {
                this.field_a = null;
                this.field_d.d(this.field_b);
            }
        }
        if (!param0) {
            field_c = (nh) null;
        }
    }

    kg(sg param0, int param1, int param2) {
        rm var4 = null;
        int discarded$0 = 0;
        int discarded$1 = 0;
        kh var5 = null;
        try {
            this.field_b = param1;
            this.field_d = param0;
            var4 = new rm(1, 1, 0);
            discarded$0 = var4.a(0, 0, 0);
            discarded$1 = var4.a(0, 0, 0, (byte) 0, (byte) 0, (short)param2, (short) -1);
            this.field_a = (pj) ((Object) var4.a(80, 1365, -1, -12, 12));
            this.field_a.field_z[0] = (short)param2;
            var5 = new kh();
            var5.field_k = this.field_a;
            param0.a(param1, var5);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "kg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static int a(byte param0) {
        if (-3 >= (b.field_x ^ -1)) {
          L0: {
            if (0 == sn.field_i) {
              if (!lp.field_a.a(-12749)) {
                return 20;
              } else {
                if (!lp.field_a.a(true, "commonui")) {
                  return 40;
                } else {
                  if (eg.field_v.a(-12749)) {
                    if (eg.field_v.a(true, "commonui")) {
                      if (kb.field_a.a(-12749)) {
                        if (kb.field_a.c(-19375)) {
                          break L0;
                        } else {
                          return 80;
                        }
                      } else {
                        return 70;
                      }
                    } else {
                      return 60;
                    }
                  } else {
                    return 50;
                  }
                }
              }
            } else {
              L1: {
                if (je.field_f != null) {
                  if (je.field_f.a(-12749)) {
                    if (!je.field_f.b((byte) -37, "")) {
                      return 29;
                    } else {
                      if (je.field_f.a(true, "")) {
                        break L1;
                      } else {
                        return 29;
                      }
                    }
                  } else {
                    return 14;
                  }
                } else {
                  break L1;
                }
              }
              if (!lp.field_a.a(-12749)) {
                return 43;
              } else {
                if (lp.field_a.a(true, "commonui")) {
                  if (!eg.field_v.a(-12749)) {
                    return 71;
                  } else {
                    if (eg.field_v.a(true, "commonui")) {
                      if (!kb.field_a.a(-12749)) {
                        return 82;
                      } else {
                        if (!kb.field_a.c(param0 + -19424)) {
                          return 86;
                        } else {
                          break L0;
                        }
                      }
                    } else {
                      return 80;
                    }
                  }
                } else {
                  return 57;
                }
              }
            }
          }
          L2: {
            if (param0 == 49) {
              break L2;
            } else {
              kg.a(49);
              break L2;
            }
          }
          return 100;
        } else {
          return 0;
        }
    }

    public static void b(byte param0) {
        boolean discarded$0 = false;
        if (param0 != -64) {
            int[] var2 = (int[]) null;
            discarded$0 = kg.a((int[]) null, (byte) 104);
        }
        field_c = null;
    }

    static {
    }
}
