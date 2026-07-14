/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cl extends ee {
    private int field_T;
    private int field_V;
    static rf field_S;
    private boolean field_U;
    private int field_R;
    static hl field_W;
    private boolean field_Q;

    cl(hn param0, rd param1) {
        this(param0, (ee) (Object) param1, 0, param1.field_Rb);
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var3 = 0;
        var4 = 0;
        var5 = 0;
        var6 = 0;
        L0: while (true) {
          if (-19 >= (var6 ^ -1)) {
            ((cl) this).field_T = var3;
            param0.field_J.b(var3, 93);
          } else {
            if (bk.field_h[var6] >= var5) {
              if (param0.field_J.a(-5, var6)) {
                L1: {
                  if (bk.field_h[var6] <= var5) {
                    break L1;
                  } else {
                    var4 = 0;
                    var5 = bk.field_h[var6];
                    break L1;
                  }
                }
                var4++;
                if ((double)var4 * Math.random() < 1.0) {
                  var3 = var6;
                  var6++;
                  continue L0;
                } else {
                  var6++;
                  continue L0;
                }
              } else {
                var6++;
                continue L0;
              }
            } else {
              var6++;
              continue L0;
            }
          }
        }
    }

    final void a(mn param0, double param1, int param2, vg param3, oi param4) {
        if (param2 > -5) {
            return;
        }
        double var7 = ((cl) this).field_C;
        ((cl) this).field_C = ((cl) this).field_C * uh.field_e[((cl) this).field_T];
        if ((1 << ((cl) this).field_T & 50087) == 0) {
            ((cl) this).a(m.field_i[((cl) this).field_T], true, param1, param3);
        } else {
            ((cl) this).a(-124, m.field_i[((cl) this).field_T], param1, param3);
        }
        ((cl) this).field_C = var7;
        ((cl) this).a(123, pm.field_w[(31 & ((cl) this).field_V) >> 1135526145], param1, param3);
    }

    final static int h(byte param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            kg var2 = null;
            int stackIn_17_0 = 0;
            int stackIn_27_0 = 0;
            int stackIn_31_0 = 0;
            int stackIn_35_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_16_0 = 0;
            int stackOut_26_0 = 0;
            int stackOut_30_0 = 0;
            int stackOut_34_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (param0 < -51) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        return -101;
                    }
                    case 2: {
                        if (om.field_s.field_a >= 4) {
                            statePc = 4;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        if (-1 != om.field_s.field_e) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        return 3;
                    }
                    case 6: {
                        if (om.field_s.field_e == -2) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        return 1;
                    }
                    case 8: {
                        return 4;
                    }
                    case 9: {
                        try {
                            if (0 == we.field_k) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            ol.field_a = ek.field_p.a(fa.field_P, -96, eb.field_n);
                            we.field_k = we.field_k + 1;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if ((we.field_k ^ -1) == -2) {
                                statePc = 14;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (ol.field_a.field_g == -3) {
                                statePc = 16;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            stackOut_16_0 = sf.a(-1, (byte) -121);
                            stackIn_17_0 = stackOut_16_0;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        return stackIn_17_0;
                    }
                    case 18: {
                        try {
                            if (-2 != ol.field_a.field_g) {
                                statePc = 20;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            we.field_k = we.field_k + 1;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (2 == we.field_k) {
                                statePc = 22;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            gk.field_u = new vd((java.net.Socket) ol.field_a.field_f, ek.field_p);
                            var2 = new kg(13);
                            ql.a(hj.field_k, var2, hc.field_n, (byte) 40, wi.field_c);
                            var2.f(93, 15);
                            var2.d(-103, pi.field_L);
                            gk.field_u.a(13, false, var2.field_m, 0);
                            we.field_k = we.field_k + 1;
                            fl.field_a = ri.a(-3) + 30000L;
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (we.field_k != 3) {
                                statePc = 32;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (-1 <= (gk.field_u.c((byte) -109) ^ -1)) {
                                statePc = 29;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var1_int = gk.field_u.a((byte) -5);
                            if (0 == var1_int) {
                                statePc = 28;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            stackOut_26_0 = sf.a(var1_int, (byte) -67);
                            stackIn_27_0 = stackOut_26_0;
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        return stackIn_27_0;
                    }
                    case 28: {
                        try {
                            we.field_k = we.field_k + 1;
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (fl.field_a >= ri.a(-3)) {
                                statePc = 32;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            stackOut_30_0 = sf.a(-2, (byte) -80);
                            stackIn_31_0 = stackOut_30_0;
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        return stackIn_31_0;
                    }
                    case 32: {
                        try {
                            if (we.field_k == 4) {
                                statePc = 34;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            return -1;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            om.field_s.a(Confined.field_L, (Object) (Object) gk.field_u, (byte) -65);
                            gk.field_u = null;
                            ol.field_a = null;
                            we.field_k = 0;
                            stackOut_34_0 = 0;
                            stackIn_35_0 = stackOut_34_0;
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        return stackIn_35_0;
                    }
                    case 36: {
                        var1 = (IOException) (Object) caughtException;
                        return sf.a(-3, (byte) -123);
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(String param0, int param1) {
        if (!(((cl) this).field_R != 0)) {
            kc.a(param0, (pm) this, 127, false);
        }
        if (param1 > -66) {
            return;
        }
        ((cl) this).field_R = 2;
    }

    final boolean f(int param0) {
        if (param0 >= -54) {
            ((cl) this).field_T = 108;
            return false;
        }
        return false;
    }

    final void a(int param0, int param1) {
        double var3 = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        int var13 = 0;
        L0: {
          var13 = Confined.field_J ? 1 : 0;
          ((cl) this).field_G = ((cl) this).field_G * 0.97;
          ((cl) this).field_V = ((cl) this).field_V + 1;
          if (((cl) this).field_R <= 0) {
            break L0;
          } else {
            ((cl) this).field_R = ((cl) this).field_R - 1;
            break L0;
          }
        }
        ((cl) this).field_K = ((cl) this).field_K * 0.97;
        ((cl) this).field_L = ((cl) this).field_L * 0.995;
        ((cl) this).field_A.field_x.b(3, param1, ((cl) this).field_D);
        ((cl) this).field_E = ((cl) this).field_E - ((cl) this).field_A.field_x.field_B;
        ((cl) this).field_t = ((cl) this).field_t - ((cl) this).field_A.field_x.field_G;
        super.a(param0, param1);
        L1: while (true) {
          L2: {
            if (-1 <= (param1 ^ -1)) {
              break L2;
            } else {
              if (((cl) this).field_A.field_x.field_r[param1] <= ((cl) this).field_D) {
                break L2;
              } else {
                param1--;
                continue L1;
              }
            }
          }
          L3: while (true) {
            L4: {
              if (param1 >= ((cl) this).field_A.field_x.field_a - 2) {
                break L4;
              } else {
                if (((cl) this).field_D < ((cl) this).field_A.field_x.field_r[param1 + 1]) {
                  break L4;
                } else {
                  param1++;
                  continue L3;
                }
              }
            }
            L5: {
              ((cl) this).field_A.field_x.b(3, param1, ((cl) this).field_D);
              if (0.0 > ((cl) this).field_D) {
                ((cl) this).field_z = true;
                ((cl) this).field_s = 2;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              ((cl) this).field_t = ((cl) this).field_t + ((cl) this).field_A.field_x.field_G;
              ((cl) this).field_E = ((cl) this).field_E + ((cl) this).field_A.field_x.field_B;
              if (-1 <= (((cl) this).field_A.field_B.field_R ^ -1)) {
                break L6;
              } else {
                if (((cl) this).field_R != 0) {
                  break L6;
                } else {
                  if (!this.a(((cl) this).field_A.field_B, -1326)) {
                    break L6;
                  } else {
                    L7: {
                      var3 = -((cl) this).field_E + ((cl) this).field_A.field_B.field_E;
                      var5 = ((cl) this).field_A.field_B.field_t - ((cl) this).field_t;
                      var7 = ((cl) this).field_A.field_B.field_D - ((cl) this).field_D;
                      var9 = Math.sqrt(var7 * var7 + (var5 * var5 + var3 * var3));
                      if (1.0 <= var9) {
                        break L7;
                      } else {
                        var9 = 1.0;
                        break L7;
                      }
                    }
                    var11 = 0.01 / var9;
                    ((cl) this).a((ee) (Object) ((cl) this).field_A.field_B, 12);
                    ((cl) this).a(false, var11, param0 ^ 17081);
                    break L6;
                  }
                }
              }
            }
            return;
          }
        }
    }

    public static void c(boolean param0) {
        field_S = null;
        field_W = null;
        if (param0) {
            field_W = null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        ci.field_a[mc.field_c] = param2;
        sj.field_rb[mc.field_c] = mc.field_c;
        an.field_n[mc.field_c] = param3;
        if (cg.field_f > param3) {
            mi.field_f = param3;
        }
        if (param3 > hj.field_j) {
            ka.field_P = param3;
        }
        am.field_I[mc.field_c] = param1;
        em.field_b[mc.field_c] = param0;
        oc.field_m[mc.field_c] = param5;
        int var6 = param0 + (param1 - -param5);
        int var7 = 0 != var6 ? 1000 * param1 / var6 : 0;
        ik.field_cb[mc.field_c] = var7;
        if (var7 < mi.field_f) {
            mi.field_f = var7;
        }
        if (ka.field_P < var7) {
            ka.field_P = var7;
        }
        int var8 = 29 % ((param4 - 22) / 52);
        mc.field_c = mc.field_c + 1;
    }

    final static int a(int param0, String param1, boolean param2) {
        if (param0 != -3) {
            return -103;
        }
        if (param2) {
            return dn.field_f.c(param1);
        }
        return rn.field_e.c(param1);
    }

    cl(hn param0, dj param1, int param2) {
        this(param0, (ee) (Object) param1, param2, true);
    }

    final void a(byte param0, dj param1) {
        int var3 = 0;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        h var8 = null;
        h var9 = null;
        String stackIn_75_0 = null;
        String stackIn_88_0 = null;
        String stackIn_98_0 = null;
        String stackIn_117_0 = null;
        String stackIn_121_0 = null;
        String stackOut_74_0 = null;
        String stackOut_73_0 = null;
        String stackOut_87_0 = null;
        String stackOut_86_0 = null;
        String stackOut_116_0 = null;
        String stackOut_115_0 = null;
        String stackOut_120_0 = null;
        String stackOut_119_0 = null;
        String stackOut_97_0 = null;
        String stackOut_96_0 = null;
        var7 = Confined.field_J ? 1 : 0;
        if (param1.field_z) {
          return;
        } else {
          L0: {
            ((cl) this).field_Q = true;
            if (param0 <= -70) {
              break L0;
            } else {
              cl.c(false);
              break L0;
            }
          }
          L1: {
            var4 = ((cl) this).field_T;
            if (-1 != var4) {
              if (-2 == var4) {
                if (param1.field_Eb) {
                  this.a(ae.field_e, -88);
                  break L1;
                } else {
                  param1.field_Eb = true;
                  kc.a(ii.field_i, (pm) this, 125, param1.field_Rb);
                  param1.field_Rb = false;
                  ((cl) this).d(10797);
                  break L1;
                }
              } else {
                if (-3 == (var4 ^ -1)) {
                  if (param1.field_Sb) {
                    this.a(rh.field_db, -86);
                    break L1;
                  } else {
                    param1.field_Sb = true;
                    kc.a(mg.field_c, (pm) this, 119, param1.field_sb);
                    if (param1.field_sb) {
                      pk.a((byte) 16, b.a(new String[1], tn.field_D, 1177));
                      param1.field_sb = false;
                      ((cl) this).d(10797);
                      break L1;
                    } else {
                      ((cl) this).d(10797);
                      break L1;
                    }
                  }
                } else {
                  if (3 == var4) {
                    if (!param1.field_cb) {
                      param1.field_cb = true;
                      kc.a(ah.field_Z, (pm) this, 119, param1.field_nb);
                      if (param1.field_nb) {
                        pk.a((byte) 105, b.a(new String[1], ck.field_b, 1177));
                        param1.field_nb = false;
                        ((cl) this).d(10797);
                        break L1;
                      } else {
                        ((cl) this).d(10797);
                        break L1;
                      }
                    } else {
                      this.a(qf.field_b, -84);
                      break L1;
                    }
                  } else {
                    if (var4 == 5) {
                      if (!param1.field_eb) {
                        L2: {
                          param1.field_eb = true;
                          kc.a(fa.field_T, (pm) this, 121, param1.field_Ob);
                          if (param1.field_Ob) {
                            pk.a((byte) 87, b.a(new String[1], ld.field_b, 1177));
                            param1.field_Ob = false;
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                        ((cl) this).d(10797);
                        break L1;
                      } else {
                        this.a(vg.field_Q, -104);
                        break L1;
                      }
                    } else {
                      if (4 != var4) {
                        if (6 != var4) {
                          if ((var4 ^ -1) == -9) {
                            param1.field_U = 1500;
                            kc.a(wd.field_e, (pm) this, 122, true);
                            ((cl) this).d(10797);
                            break L1;
                          } else {
                            if ((var4 ^ -1) == -8) {
                              param1.field_Pb = 1500;
                              kc.a(ne.field_a, (pm) this, 119, true);
                              ((cl) this).d(10797);
                              break L1;
                            } else {
                              if ((var4 ^ -1) == -11) {
                                if ((param1.field_ub ^ -1) <= -21) {
                                  this.a(rn.field_b, -104);
                                  break L1;
                                } else {
                                  L3: {
                                    if (param1.field_ub >= 0) {
                                      L4: {
                                        var4 = 20 - param1.field_ub;
                                        if (-5 <= (var4 ^ -1)) {
                                          break L4;
                                        } else {
                                          var4 = 4;
                                          break L4;
                                        }
                                      }
                                      L5: {
                                        param1.field_ub = param1.field_ub + var4;
                                        if (1 != var4) {
                                          stackOut_74_0 = b.a(new String[1], ah.field_R, 1177);
                                          stackIn_75_0 = stackOut_74_0;
                                          break L5;
                                        } else {
                                          stackOut_73_0 = ek.field_e;
                                          stackIn_75_0 = stackOut_73_0;
                                          break L5;
                                        }
                                      }
                                      kc.a(stackIn_75_0, (pm) this, 126, false);
                                      break L3;
                                    } else {
                                      param1.field_ub = 4;
                                      kc.a(b.a(new String[1], ah.field_R, 1177), (pm) this, 120, true);
                                      pk.a((byte) 68, b.a(new String[1], dc.field_M, 1177));
                                      break L3;
                                    }
                                  }
                                  ((cl) this).d(10797);
                                  break L1;
                                }
                              } else {
                                if (var4 == 11) {
                                  if (param1.field_tb < 20) {
                                    L6: {
                                      if (-1 >= (param1.field_tb ^ -1)) {
                                        L7: {
                                          var4 = 20 + -param1.field_tb;
                                          if (-5 > (var4 ^ -1)) {
                                            var4 = 4;
                                            break L7;
                                          } else {
                                            break L7;
                                          }
                                        }
                                        L8: {
                                          param1.field_tb = param1.field_tb + var4;
                                          if (var4 != 1) {
                                            stackOut_87_0 = b.a(new String[1], hf.field_X, 1177);
                                            stackIn_88_0 = stackOut_87_0;
                                            break L8;
                                          } else {
                                            stackOut_86_0 = md.field_b;
                                            stackIn_88_0 = stackOut_86_0;
                                            break L8;
                                          }
                                        }
                                        kc.a(stackIn_88_0, (pm) this, 127, false);
                                        break L6;
                                      } else {
                                        param1.field_tb = 4;
                                        kc.a(b.a(new String[1], hf.field_X, 1177), (pm) this, 116, true);
                                        pk.a((byte) 48, b.a(new String[1], tm.field_e, 1177));
                                        break L6;
                                      }
                                    }
                                    ((cl) this).d(10797);
                                    break L1;
                                  } else {
                                    this.a(sc.field_j, -73);
                                    break L1;
                                  }
                                } else {
                                  if ((var4 ^ -1) != -13) {
                                    if (var4 != -14) {
                                      if (var4 != 14) {
                                        if (var4 != 15) {
                                          if (var4 != 16) {
                                            if (-10 == var4) {
                                              kc.a(dj.field_W, (pm) this, 119, true);
                                              param1.field_R = 1500;
                                              ((cl) this).d(10797);
                                              ((cl) this).field_A.field_J.field_e = 3 + ((cl) this).field_A.field_J.field_o;
                                              ((cl) this).field_A.field_J.field_m = ((cl) this).field_A.field_J.field_o + 3;
                                              if (((cl) this).field_A.field_J.field_m <= 24) {
                                                hc.field_u = b.a(new String[1], oe.field_X, 1177);
                                                bg.field_f = 0;
                                                break L1;
                                              } else {
                                                break L1;
                                              }
                                            } else {
                                              if (-18 == (var4 ^ -1)) {
                                                kc.a(q.field_n, (pm) this, 123, true);
                                                param1.field_yb = param1.field_yb + 1;
                                                d.field_a = d.field_a - 1;
                                                ((cl) this).d(10797);
                                                break L1;
                                              } else {
                                                break L1;
                                              }
                                            }
                                          } else {
                                            kc.a(na.field_Q, (pm) this, 124, true);
                                            param1.field_Gb = 1500;
                                            ((cl) this).d(10797);
                                            break L1;
                                          }
                                        } else {
                                          L9: {
                                            kc.a(km.field_a, (pm) this, 116, true);
                                            param1.field_ib = 1500;
                                            param1.field_Bb.field_l = true;
                                            if (0 != param1.field_Bb.field_d) {
                                              break L9;
                                            } else {
                                              param1.field_Bb.field_d = 1;
                                              break L9;
                                            }
                                          }
                                          var4 = 0;
                                          L10: while (true) {
                                            if (var4 >= 5) {
                                              ((cl) this).d(10797);
                                              break L1;
                                            } else {
                                              var9 = param1.field_Nb[var4];
                                              if (var9 != null) {
                                                var9.field_ab.field_l = true;
                                                if (0 == var9.field_ab.field_d) {
                                                  var9.field_ab.field_d = 1;
                                                  var4++;
                                                  continue L10;
                                                } else {
                                                  var4++;
                                                  continue L10;
                                                }
                                              } else {
                                                var4++;
                                                continue L10;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        L11: {
                                          L12: {
                                            var3 = param1.field_Bb.field_b - 8;
                                            if (var3 == -1) {
                                              break L12;
                                            } else {
                                              L13: {
                                                if (-1 == param1.field_Bb.field_d) {
                                                  break L13;
                                                } else {
                                                  if (var3 < ((cl) this).field_A.field_J.a(-2)) {
                                                    break L12;
                                                  } else {
                                                    break L13;
                                                  }
                                                }
                                              }
                                              L14: {
                                                if (-65537 == param1.field_Bb.field_d) {
                                                  stackOut_116_0 = dj.field_Ib;
                                                  stackIn_117_0 = stackOut_116_0;
                                                  break L14;
                                                } else {
                                                  stackOut_115_0 = pi.field_P;
                                                  stackIn_117_0 = stackOut_115_0;
                                                  break L14;
                                                }
                                              }
                                              kc.a(stackIn_117_0, (pm) this, 121, true);
                                              break L11;
                                            }
                                          }
                                          L15: {
                                            if (-1 != var3) {
                                              stackOut_120_0 = vm.field_ab;
                                              stackIn_121_0 = stackOut_120_0;
                                              break L15;
                                            } else {
                                              stackOut_119_0 = dj.field_Ib;
                                              stackIn_121_0 = stackOut_119_0;
                                              break L15;
                                            }
                                          }
                                          kc.a(stackIn_121_0, (pm) this, 120, true);
                                          param1.field_Bb.field_b = param1.field_Bb.field_b + 1;
                                          break L11;
                                        }
                                        param1.field_Bb.field_d = 65536;
                                        var4 = 0;
                                        L16: while (true) {
                                          if ((var4 ^ -1) <= -6) {
                                            ((cl) this).d(10797);
                                            break L1;
                                          } else {
                                            var8 = param1.field_Nb[var4];
                                            if (var8 != null) {
                                              L17: {
                                                var6 = param1.field_Bb.field_b - 4;
                                                if (var8.field_ab.field_b < var6) {
                                                  var8.field_ab.field_b = var6;
                                                  break L17;
                                                } else {
                                                  break L17;
                                                }
                                              }
                                              var8.field_ab.field_d = 65536;
                                              var4++;
                                              continue L16;
                                            } else {
                                              var4++;
                                              continue L16;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      if ((param1.field_ab ^ -1) <= -5) {
                                        this.a(gi.field_hb, -82);
                                        break L1;
                                      } else {
                                        if ((param1.field_ab ^ -1) <= -1) {
                                          param1.field_ab = param1.field_ab + 1;
                                          kc.a(ah.field_W, (pm) this, 119, false);
                                          ((cl) this).d(10797);
                                          break L1;
                                        } else {
                                          param1.field_ab = 1;
                                          kc.a(ah.field_W, (pm) this, 121, true);
                                          pk.a((byte) 126, b.a(new String[1], ae.field_b, 1177));
                                          ((cl) this).d(10797);
                                          break L1;
                                        }
                                      }
                                    }
                                  } else {
                                    if (param1.field_zb >= 10) {
                                      this.a(ke.field_ab, -111);
                                      break L1;
                                    } else {
                                      if (-1 < (param1.field_zb ^ -1)) {
                                        param1.field_zb = 4;
                                        kc.a(b.a(new String[1], kn.field_b, 1177), (pm) this, 119, true);
                                        pk.a((byte) 76, b.a(new String[1], jh.field_U, 1177));
                                        ((cl) this).d(10797);
                                        break L1;
                                      } else {
                                        L18: {
                                          var4 = 10 + -param1.field_zb;
                                          if (var4 > 4) {
                                            var4 = 4;
                                            break L18;
                                          } else {
                                            break L18;
                                          }
                                        }
                                        L19: {
                                          param1.field_zb = param1.field_zb + var4;
                                          if (var4 == 1) {
                                            stackOut_97_0 = wh.field_ab;
                                            stackIn_98_0 = stackOut_97_0;
                                            break L19;
                                          } else {
                                            stackOut_96_0 = b.a(new String[1], kn.field_b, 1177);
                                            stackIn_98_0 = stackOut_96_0;
                                            break L19;
                                          }
                                        }
                                        kc.a(stackIn_98_0, (pm) this, 120, false);
                                        ((cl) this).d(10797);
                                        break L1;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          if (!param1.o(-100)) {
                            this.a(dn.field_a, -99);
                            break L1;
                          } else {
                            kc.a(gb.field_b, (pm) this, 124, true);
                            ((cl) this).d(10797);
                            break L1;
                          }
                        }
                      } else {
                        if (!param1.field_rb) {
                          param1.field_rb = true;
                          kc.a(wi.field_b, (pm) this, 126, param1.field_hb);
                          if (param1.field_hb) {
                            pk.a((byte) 62, b.a(new String[1], vg.field_K, 1177));
                            param1.field_hb = false;
                            ((cl) this).d(10797);
                            break L1;
                          } else {
                            ((cl) this).d(10797);
                            break L1;
                          }
                        } else {
                          this.a(f.field_b, -103);
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              if (!param1.field_mb) {
                param1.field_mb = true;
                kc.a(kd.field_s, (pm) this, 126, param1.field_T);
                param1.field_T = false;
                ((cl) this).d(10797);
                break L1;
              } else {
                this.a(hj.field_i, -76);
                break L1;
              }
            }
          }
          L20: {
            if (((cl) this).field_z) {
              gd.a(48, 70, gj.field_d, (pm) this);
              if (((cl) this).field_U) {
                break L20;
              } else {
                ((cl) this).field_A.a((byte) 50, 200);
                break L20;
              }
            } else {
              break L20;
            }
          }
          return;
        }
    }

    final void a(boolean param0, il param1) {
        param1.c((ee) this, -7442);
        if (param0) {
            ((cl) this).field_R = 69;
        }
    }

    private final boolean a(dj param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        int stackIn_35_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_75_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        var4 = Confined.field_J ? 1 : 0;
        if (!param0.field_z) {
          L0: {
            if (param1 == -1326) {
              break L0;
            } else {
              var5 = null;
              ((cl) this).a((cl) null, (byte) -81);
              break L0;
            }
          }
          var3 = ((cl) this).field_T;
          if (var3 != -1) {
            if (-2 == var3) {
              L1: {
                if (param0.field_Eb) {
                  stackOut_38_0 = 0;
                  stackIn_39_0 = stackOut_38_0;
                  break L1;
                } else {
                  stackOut_37_0 = 1;
                  stackIn_39_0 = stackOut_37_0;
                  break L1;
                }
              }
              return stackIn_39_0 != 0;
            } else {
              if ((var3 ^ -1) != -3) {
                if (var3 != 3) {
                  if ((var3 ^ -1) != -6) {
                    if (4 != var3) {
                      if (6 != var3) {
                        L2: {
                          if (var3 == 8) {
                            break L2;
                          } else {
                            if (7 == var3) {
                              break L2;
                            } else {
                              if (var3 == -11) {
                                L3: {
                                  L4: {
                                    if (!((cl) this).field_Q) {
                                      break L4;
                                    } else {
                                      if ((param0.field_ub ^ -1) <= -21) {
                                        stackOut_62_0 = 0;
                                        stackIn_63_0 = stackOut_62_0;
                                        break L3;
                                      } else {
                                        break L4;
                                      }
                                    }
                                  }
                                  stackOut_61_0 = 1;
                                  stackIn_63_0 = stackOut_61_0;
                                  break L3;
                                }
                                return stackIn_63_0 != 0;
                              } else {
                                if (var3 == 11) {
                                  L5: {
                                    L6: {
                                      if (!((cl) this).field_Q) {
                                        break L6;
                                      } else {
                                        if (20 <= param0.field_tb) {
                                          stackOut_68_0 = 0;
                                          stackIn_69_0 = stackOut_68_0;
                                          break L5;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                    stackOut_67_0 = 1;
                                    stackIn_69_0 = stackOut_67_0;
                                    break L5;
                                  }
                                  return stackIn_69_0 != 0;
                                } else {
                                  if (-13 != var3) {
                                    if (var3 != 13) {
                                      L7: {
                                        if (14 == var3) {
                                          break L7;
                                        } else {
                                          if (15 == var3) {
                                            break L7;
                                          } else {
                                            if ((var3 ^ -1) == -17) {
                                              return true;
                                            } else {
                                              if (var3 != 9) {
                                                if (17 != var3) {
                                                  return false;
                                                } else {
                                                  return true;
                                                }
                                              } else {
                                                return true;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      return true;
                                    } else {
                                      return true;
                                    }
                                  } else {
                                    L8: {
                                      L9: {
                                        if (!((cl) this).field_Q) {
                                          break L9;
                                        } else {
                                          if (-11 >= (param0.field_zb ^ -1)) {
                                            stackOut_74_0 = 0;
                                            stackIn_75_0 = stackOut_74_0;
                                            break L8;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                      stackOut_73_0 = 1;
                                      stackIn_75_0 = stackOut_73_0;
                                      break L8;
                                    }
                                    return stackIn_75_0 != 0;
                                  }
                                }
                              }
                            }
                          }
                        }
                        return true;
                      } else {
                        return param0.l(-53);
                      }
                    } else {
                      L10: {
                        if (param0.field_rb) {
                          stackOut_54_0 = 0;
                          stackIn_55_0 = stackOut_54_0;
                          break L10;
                        } else {
                          stackOut_53_0 = 1;
                          stackIn_55_0 = stackOut_53_0;
                          break L10;
                        }
                      }
                      return stackIn_55_0 != 0;
                    }
                  } else {
                    L11: {
                      if (param0.field_eb) {
                        stackOut_50_0 = 0;
                        stackIn_51_0 = stackOut_50_0;
                        break L11;
                      } else {
                        stackOut_49_0 = 1;
                        stackIn_51_0 = stackOut_49_0;
                        break L11;
                      }
                    }
                    return stackIn_51_0 != 0;
                  }
                } else {
                  L12: {
                    if (param0.field_cb) {
                      stackOut_46_0 = 0;
                      stackIn_47_0 = stackOut_46_0;
                      break L12;
                    } else {
                      stackOut_45_0 = 1;
                      stackIn_47_0 = stackOut_45_0;
                      break L12;
                    }
                  }
                  return stackIn_47_0 != 0;
                }
              } else {
                L13: {
                  if (param0.field_Sb) {
                    stackOut_42_0 = 0;
                    stackIn_43_0 = stackOut_42_0;
                    break L13;
                  } else {
                    stackOut_41_0 = 1;
                    stackIn_43_0 = stackOut_41_0;
                    break L13;
                  }
                }
                return stackIn_43_0 != 0;
              }
            }
          } else {
            L14: {
              if (param0.field_mb) {
                stackOut_34_0 = 0;
                stackIn_35_0 = stackOut_34_0;
                break L14;
              } else {
                stackOut_33_0 = 1;
                stackIn_35_0 = stackOut_33_0;
                break L14;
              }
            }
            return stackIn_35_0 != 0;
          }
        } else {
          return false;
        }
    }

    final void a(int param0, h param1) {
        ((cl) this).a((byte) -116, ((cl) this).field_A.field_B);
        if (param0 != 640) {
            ((cl) this).field_T = -106;
        }
    }

    final void a(dj param0, byte param1) {
        if (param1 != 80) {
            ((cl) this).field_Q = true;
        }
        ((cl) this).a((byte) -113, param0);
    }

    private cl(hn param0, ee param1, int param2, boolean param3) {
        super(param0, param1.field_E, param1.field_t, param1.field_D, 0.25, 0.01);
        double[] var5 = null;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double[] var16 = null;
        double[] var17 = null;
        double[] var18 = null;
        double[] var19 = null;
        double[] var20 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          ((cl) this).field_V = (int)(Math.random() * 64.0);
          ((cl) this).field_R = 0;
          var20 = new double[12];
          var19 = var20;
          var18 = var19;
          var17 = var18;
          var16 = var17;
          var5 = var16;
          param0.field_B.field_jb.a((byte) 113, var20);
          var6 = (Math.random() + 1.0) * 0.2;
          var8 = 0.002 * Math.sqrt(Math.random()) / var6;
          var10 = 6.283185307179586 * Math.random();
          var12 = var8 * Math.sin(var10);
          var14 = Math.cos(var10) * var8;
          ((cl) this).field_L = var20[11] * var6 + (var14 * var20[8] + var20[5] * var12);
          ((cl) this).field_G = var20[4] * var12 + var14 * var20[7] + var20[10] * var6;
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param3) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((cl) this).field_U = stackIn_3_1 != 0;
        ((cl) this).field_K = var14 * var20[6] + var12 * var20[3] + var20[9] * var6;
        ((cl) this).field_T = param2;
    }

    final boolean a(pm param0, byte param1) {
        if (param1 != 72) {
            return false;
        }
        return false;
    }

    final double a(int param0, boolean param1, double param2) {
        if (param0 != 14170) {
            Object var6 = null;
            int discarded$0 = cl.a(-34, (String) null, true);
        }
        return param2;
    }

    final boolean a(boolean param0, pm param1) {
        if (!param0) {
            ((cl) this).field_T = 61;
            return false;
        }
        return false;
    }

    final void a(int param0, vg param1) {
        param1.a((cl) this, (byte) -115);
        if (param0 != -1) {
            ((cl) this).field_V = -53;
        }
    }

    final void a(int param0, ah param1) {
        int var3 = 116 % ((param0 - 14) / 53);
    }

    final void a(boolean param0, ee param1) {
        ((cl) this).a(param1, 0.0, -55);
        if (!param0) {
            ((cl) this).field_R = -82;
        }
    }

    final void a(byte param0, sa param1) {
        if (param0 != 9) {
            ((cl) this).field_V = 72;
        }
    }

    final void a(pm param0, int param1) {
        param0.a((cl) this, (byte) 124);
        if (param1 >= -81) {
            ((cl) this).field_U = false;
        }
    }

    final boolean c(int param0) {
        if (param0 != 5) {
            return true;
        }
        return false;
    }

    final void a(int param0, hf param1) {
        if (param0 > -29) {
            ((cl) this).field_V = -43;
        }
    }

    final void a(cl param0, byte param1) {
        int var3 = -92 % ((-35 - param1) / 60);
    }

    final void a(int param0, mb param1) {
        if (param0 != -23154) {
            Object var4 = null;
            ((cl) this).a(false, (il) null);
        }
        param1.a((cl) this, (byte) 107);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_S = new rf();
    }
}
