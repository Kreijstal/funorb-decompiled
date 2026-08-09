/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gk implements Iterable {
    static hg field_g;
    static byte[][][] field_c;
    int field_a;
    static p field_f;
    l[] field_h;
    static km field_b;
    private l field_d;
    static km field_e;

    public static void a(byte param0) {
        try {
            field_b = null;
            field_c = (byte[][][]) null;
            field_f = null;
            field_g = null;
            field_e = null;
            int var1_int = 118 / ((param0 - -72) / 50);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "gk.E(" + param0 + ')');
        }
    }

    final l a(long param0, int param1) {
        l var4 = null;
        int var6 = 0;
        l stackIn_9_0 = null;
        int stackIn_12_0 = 0;
        l stackIn_14_0 = null;
        Object stackIn_16_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        l var5 = null;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var4 = this.field_h[(int)((long)(this.field_a - 1) & param0)];
            this.field_d = var4.field_f;
            L1: while (true) {
              L2: {
                L3: {
                  if (this.field_d == var4) {
                    break L3;
                  } else {
                    stackIn_12_0 = (param0 < this.field_d.field_d ? -1 : (param0 == this.field_d.field_d ? 0 : 1));

                    if (var6 != 0) {
                      break L2;
                    } else {
                      if (stackIn_12_0 == 0) {
                        var5 = this.field_d;
                        this.field_d = this.field_d.field_f;
                        stackIn_9_0 = (l) (var5);
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        this.field_d = this.field_d.field_f;
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackIn_12_0 = param1;
                break L2;
              }
              if (stackIn_12_0 == -18348) {
                this.field_d = null;
                stackIn_16_0 = null;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_14_0 = (l) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var4_ref), "gk.A(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0;
          } else {
            return (l) ((Object) stackIn_16_0);
          }
        }
    }

    final static gh a(byte param0, int param1, boolean param2) {
        um stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        boolean stackIn_5_2 = false;
        int stackIn_5_3 = 0;
        int stackIn_5_4 = 0;
        int stackIn_5_5 = 0;
        um stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        boolean stackIn_7_2 = false;
        int stackIn_7_3 = 0;
        int stackIn_7_4 = 0;
        int stackIn_7_5 = 0;
        um stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        boolean stackIn_8_2 = false;
        int stackIn_8_3 = 0;
        int stackIn_8_4 = 0;
        int stackIn_8_5 = 0;
        int stackIn_8_6 = 0;
        gh stackIn_12_0 = null;
        km stackIn_35_0 = null;
        km stackIn_37_0 = null;
        km stackIn_38_0 = null;
        String stackIn_38_1 = null;
        km stackIn_39_0 = null;
        km stackIn_41_0 = null;
        km stackIn_42_0 = null;
        String stackIn_42_1 = null;
        int stackIn_46_0 = 0;
        Object stackIn_87_0 = null;
        Object stackIn_102_0 = null;
        gh stackOut_11_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        p var4 = null;
        Object var5 = null;
        Object var6 = null;
        gh var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        dj var17 = null;
        String var18 = null;
        int var19 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = Virogrid.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 < -6) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        gk.a(true, (String) null, true);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_7_0 = ve.field_q.field_Ib;
                        stackIn_5_0 = stackIn_7_0;
                        stackIn_7_1 = pg.field_e - -2;
                        stackIn_5_1 = stackIn_7_1;
                        stackIn_7_2 = param2;
                        stackIn_5_2 = stackIn_7_2;
                        stackIn_7_3 = 0;
                        stackIn_5_3 = stackIn_7_3;
                        stackIn_7_4 = 2;
                        stackIn_5_4 = stackIn_7_4;
                        stackIn_7_5 = param1 * (3 * (pg.field_e - -2));
                        stackIn_5_5 = stackIn_7_5;
                        if (ve.field_q.field_Ib != wf.field_d) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_8_0 = (um) ((Object) stackIn_5_0);
                        stackIn_8_1 = stackIn_5_1;
                        stackIn_8_2 = stackIn_5_2;
                        stackIn_8_3 = stackIn_5_3;
                        stackIn_8_4 = stackIn_5_4;
                        stackIn_8_5 = stackIn_5_5;
                        stackIn_8_6 = 1;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_8_0 = (um) ((Object) stackIn_7_0);
                        stackIn_8_1 = stackIn_7_1;
                        stackIn_8_2 = stackIn_7_2;
                        stackIn_8_3 = stackIn_7_3;
                        stackIn_8_4 = stackIn_7_4;
                        stackIn_8_5 = stackIn_7_5;
                        stackIn_8_6 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var3_int = ((um) (Object) stackIn_8_0).a(stackIn_8_1, stackIn_8_2, stackIn_8_3 != 0, stackIn_8_4, stackIn_8_5, stackIn_8_6 != 0) ? 1 : 0;
                        var4 = ve.field_q.field_Lb.field_W;
                        var5 = null;
                        if (-3 != (oa.field_q ^ -1)) {
                            statePc = 94;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        dg.field_E.field_Y = true;
                        ee.field_e.field_V = oi.a(new String[]{wl.field_a}, gg.field_J, 2);
                        ve.field_q.field_Ib.field_Eb.field_V = null;
                        var6 = null;
                        var7 = (gh) ((Object) var4.a((byte) -41));
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (null == var7) {
                            statePc = 86;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var8 = 0;
                        stackOut_11_0 = (gh) (var7);
                        stackIn_87_0 = stackOut_11_0;
                        stackIn_12_0 = stackOut_11_0;
                        if (var19 != 0) {
                            statePc = 87;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (stackIn_12_0.field_W != null) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var7.field_Eb = new km(0L, gg.field_F);
                        var7.a(0, var7.field_Eb);
                        var7.field_Gb = new km(0L, jd.field_d);
                        var7.a(0, var7.field_Gb);
                        var7.field_Mb = new km(0L, gg.field_F);
                        var7.a(0, var7.field_Mb);
                        var7.field_Gb.field_lb = 2;
                        var8 = 1;
                        var7.b((byte) 42);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var7.field_K = ve.field_q.field_Lb.field_K;
                        var9 = 0;
                        if (var7.field_Pb != null) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var11 = 16737894;
                        var10 = 13369344;
                        if (var19 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var7.field_Pb == wl.field_a) {
                            statePc = 22;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var10 = 13421568;
                        var11 = 16777062;
                        if (var19 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var10 = 52224;
                        var11 = 6750054;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var12 = 0;
                        if (null == var7.field_Jb) {
                            statePc = 30;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (!var7.field_Jb.equals("")) {
                            statePc = 29;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var7.field_Mb.field_ab = var11;
                        var7.field_Mb.field_qb = qg.field_u;
                        var7.field_Mb.a(0, pg.field_e, qg.field_u.field_u + 3, (byte) -94, var9);
                        var12 = 1;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var7.field_Gb.field_bb = var11;
                        var7.field_Eb.field_bb = var11;
                        var7.field_Gb.field_E = var10;
                        var7.field_Eb.field_E = var10;
                        var7.field_Gb.field_A = var11;
                        var7.field_Eb.field_A = var11;
                        var7.field_Gb.field_ab = var11;
                        var7.field_Eb.field_ab = var11;
                        var13 = 0;
                        var14 = var7.field_K + -82;
                        if (var12 != 0) {
                            statePc = 33;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var13 = qg.field_u.field_u - -3;
                        var14 = var14 - var13;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackIn_37_0 = var7.field_Eb;
                        stackIn_35_0 = stackIn_37_0;
                        if (-1 <= (var14 ^ -1)) {
                            statePc = 37;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackIn_38_0 = (km) ((Object) stackIn_35_0);
                        stackIn_38_1 = e.a(var7.field_Eb.field_C, var7.field_Hb, var14);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackIn_38_0 = (km) ((Object) stackIn_37_0);
                        stackIn_38_1 = var7.field_Hb;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackIn_38_0.field_V = stackIn_38_1;
                        var7.field_Eb.a(var13, pg.field_e, var14, (byte) -46, var9);
                        stackIn_41_0 = var7.field_Gb;
                        stackIn_39_0 = stackIn_41_0;
                        if (var7.field_Pb == null) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackIn_42_0 = (km) ((Object) stackIn_39_0);
                        stackIn_42_1 = var7.field_Pb;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackIn_42_0 = (km) ((Object) stackIn_41_0);
                        stackIn_42_1 = ln.field_a;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackIn_42_0.field_V = stackIn_42_1;
                        var7.field_Gb.a(-80 + var7.field_K, pg.field_e, 80, (byte) -54, var9);
                        if (var7.field_Eb.field_V.equals(var7.field_Hb)) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackIn_46_0 = 1;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackIn_46_0 = 0;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var15 = stackIn_46_0;
                        var9 = var9 + pg.field_e;
                        if (var3_int != 0) {
                            statePc = 49;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var7.field_kb = -var7.field_ub + var9;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var8 != 0) {
                            statePc = 52;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        ve.field_q.field_Lb.a(2, var7, (km) (var6), (byte) 113);
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (var7.field_Mb == null) {
                            statePc = 60;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (!var7.field_Mb.field_S) {
                            statePc = 60;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        wc.field_g = var7.field_Jb;
                        if (var19 == 0) {
                            statePc = 85;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (-1 != (var7.field_nb ^ -1)) {
                            statePc = 72;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (!var7.field_Eb.field_S) {
                            statePc = 85;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (var15 == 0) {
                            statePc = 85;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        wc.field_g = var7.field_Hb;
                        if (var19 == 0) {
                            statePc = 85;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var16 = var7.field_Hb;
                        ai.a(-1, ve.field_q.field_Ib, (int[]) null, (String) null, 0L, var16, -1, var7, 111);
                        if (var7.field_Pb == null) {
                            statePc = 84;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (dd.a(md.field_e.field_g, false)) {
                            statePc = 84;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (wg.field_f) {
                            statePc = 84;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (dh.field_n) {
                            statePc = 83;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var17 = md.field_e;
                        var18 = oi.a(new String[]{var16}, ha.field_d, 2);
                        var17.field_a.a(1, var18, 8);
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        var17 = md.field_e;
                        var18 = oi.a(new String[]{var16}, og.field_c, 2);
                        var17.field_a.a(1, var18, 18);
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var5 = var7;
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        var6 = var7;
                        var7 = (gh) ((Object) var4.a(16213));
                        if (var19 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        stackIn_87_0 = ve.field_q.field_Fb;
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        if ((((km) ((Object) stackIn_87_0)).field_nb ^ -1) == -1) {
                            statePc = 90;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        he.field_Xb = new fe(ve.field_q.field_Fb.field_Bb, ve.field_q.field_Fb.field_J, ve.field_q.field_Fb.field_K, ve.field_q.field_Fb.field_ub, jd.field_e, s.field_f, ti.field_h, ti.field_h);
                        ge.field_d = 0;
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (ve.field_q.field_Mb.field_nb == 0) {
                            statePc = 93;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        he.field_Xb = new fe(ve.field_q.field_Mb.field_Bb, ve.field_q.field_Mb.field_J, ve.field_q.field_Mb.field_K, ve.field_q.field_Mb.field_ub, ec.field_D, s.field_f, ti.field_h, ti.field_h);
                        ge.field_d = 1;
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        dg.field_E.field_Y = false;
                        ee.field_e.field_V = wc.field_b;
                        if (oa.field_q == 1) {
                            statePc = 98;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        ve.field_q.field_Ib.field_Eb.field_V = ul.field_e;
                        if (var19 == 0) {
                            statePc = 100;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        ve.field_q.field_Ib.field_Eb.field_V = ce.field_H;
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        ak.a(16377, ve.field_q.field_Lb);
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        stackIn_102_0 = var5;
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 103;
                        continue stateLoop;
                    }
                }
                case 102: {
                    return (gh) ((Object) stackIn_102_0);
                }
                case 103: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw kg.a((Throwable) ((Object) var3), "gk.D(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(l param0, int param1, long param2) {
        RuntimeException runtimeException = null;
        l var5 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != param0.field_a) {
                param0.a(false);
                break L1;
              } else {
                break L1;
              }
            }
            if (param1 <= -83) {
              var5 = this.field_h[(int)((long)(-1 + this.field_a) & param2)];
              param0.field_f = var5;
              param0.field_a = var5.field_a;
              param0.field_a.field_f = param0;
              param0.field_d = param2;
              param0.field_f.field_a = param0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (runtimeException);

            stackIn_11_1 = new StringBuilder().append("gk.B(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    gk(int param0) {
        l dupTemp$1 = null;
        RuntimeException runtimeException = null;
        int var2_int = 0;
        l var3 = null;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Virogrid.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_a = param0;
                        this.field_h = new l[param0];
                        var2_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param0 <= var2_int) {
                            statePc = 9;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        dupTemp$1 = new l();
                        this.field_h[var2_int] = dupTemp$1;
                        var3 = dupTemp$1;
                        var3.field_f = var3;
                        var3.field_a = var3;
                        var2_int++;
                        if (var4 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var4 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw kg.a((Throwable) ((Object) runtimeException), "gk.<init>(" + param0 + ')');
                }
                case 9: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final Iterator iterator() {
        j stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            stackIn_1_0 = new j((gk) (this));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var1), "gk.iterator()");
        }
        return (Iterator) ((Object) stackIn_1_0);
    }

    final static void a(boolean param0, String param1, boolean param2) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              p.field_f = param0;
              if (!param2) {
                break L1;
              } else {
                field_c = (byte[][][]) null;
                break L1;
              }
            }
            fe.field_Fb = true;
            hf.field_w = new sh(tm.field_l, on.field_b, param1, kb.field_c, p.field_f);
            tm.field_l.a(0, hf.field_w);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("gk.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ')');
        }
    }

    static {
        field_f = null;
    }
}
