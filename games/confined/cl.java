/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.lang.String;

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
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        try {
            var3_int = 0;
            var4 = 0;
            var5 = 0;
            for (var6 = 0; var6 < 18; var6++) {
                if (bk.field_h[var6] >= var5) {
                    if (param0.field_J.a(-5, var6)) {
                        if (bk.field_h[var6] > var5) {
                            var4 = 0;
                            var5 = bk.field_h[var6];
                        }
                        var4++;
                        if ((double)var4 * Math.random() < 1.0) {
                            var3_int = var6;
                        }
                    }
                }
            }
            ((cl) this).field_T = var3_int;
            param0.field_J.b(var3_int, 93);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "cl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(mn param0, double param1, int param2, vg param3, oi param4) {
        double var7_double = 0.0;
        if (param2 > -5) {
            return;
        }
        try {
            var7_double = ((cl) this).field_C;
            ((cl) this).field_C = ((cl) this).field_C * uh.field_e[((cl) this).field_T];
            if ((1 << ((cl) this).field_T & 50087) == 0) {
                ((cl) this).a(m.field_i[((cl) this).field_T], true, param1, param3);
            } else {
                ((cl) this).a(-124, m.field_i[((cl) this).field_T], param1, param3);
            }
            ((cl) this).field_C = var7_double;
            ((cl) this).a(123, pm.field_w[(31 & ((cl) this).field_V) >> 1], param1, param3);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "cl.QA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static int h() {
        try {
            IOException var1 = null;
            int var1_int = 0;
            kg var2 = null;
            int stackIn_15_0 = 0;
            int stackIn_25_0 = 0;
            int stackIn_29_0 = 0;
            int stackIn_33_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_14_0 = 0;
            int stackOut_28_0 = 0;
            int stackOut_24_0 = 0;
            int stackOut_32_0 = 0;
            if (om.field_s.field_a >= 4) {
              if (-1 != om.field_s.field_e) {
                if (om.field_s.field_e == -2) {
                  return 4;
                } else {
                  return 1;
                }
              } else {
                return 3;
              }
            } else {
              try {
                L0: {
                  L1: {
                    if (0 == we.field_k) {
                      ol.field_a = ek.field_p.a(fa.field_P, -96, eb.field_n);
                      we.field_k = we.field_k + 1;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (we.field_k == 1) {
                      if (ol.field_a.field_g == 2) {
                        stackOut_14_0 = sf.a(-1, (byte) -121);
                        stackIn_15_0 = stackOut_14_0;
                        return stackIn_15_0;
                      } else {
                        if (ol.field_a.field_g != 1) {
                          break L2;
                        } else {
                          we.field_k = we.field_k + 1;
                          break L2;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (2 == we.field_k) {
                      gk.field_u = new vd((java.net.Socket) ol.field_a.field_f, ek.field_p);
                      var2 = new kg(13);
                      ql.a(hj.field_k, var2, hc.field_n, (byte) 40, wi.field_c);
                      var2.f(93, 15);
                      var2.d(-103, pi.field_L);
                      gk.field_u.a(13, false, var2.field_m, 0);
                      we.field_k = we.field_k + 1;
                      fl.field_a = ri.a(-3) + 30000L;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (we.field_k != 3) {
                      break L4;
                    } else {
                      if (gk.field_u.c((byte) -109) <= 0) {
                        if (fl.field_a >= ri.a(-3)) {
                          break L4;
                        } else {
                          stackOut_28_0 = sf.a(-2, (byte) -80);
                          stackIn_29_0 = stackOut_28_0;
                          return stackIn_29_0;
                        }
                      } else {
                        var1_int = gk.field_u.a((byte) -5);
                        if (0 == var1_int) {
                          we.field_k = we.field_k + 1;
                          break L4;
                        } else {
                          stackOut_24_0 = sf.a(var1_int, (byte) -67);
                          stackIn_25_0 = stackOut_24_0;
                          return stackIn_25_0;
                        }
                      }
                    }
                  }
                  if (we.field_k == 4) {
                    om.field_s.a(Confined.field_L, (Object) (Object) gk.field_u, (byte) -65);
                    gk.field_u = null;
                    ol.field_a = null;
                    we.field_k = 0;
                    stackOut_32_0 = 0;
                    stackIn_33_0 = stackOut_32_0;
                    break L0;
                  } else {
                    return -1;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return sf.a(-3, (byte) -123);
              }
              return stackIn_33_0;
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
        try {
            ((cl) this).field_R = 2;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "cl.BB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
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
            if (param1 <= 0) {
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
              if (((cl) this).field_A.field_B.field_R <= 0) {
                break L6;
              } else {
                if (((cl) this).field_R != 0) {
                  break L6;
                } else {
                  int discarded$1 = -1326;
                  if (!this.a(((cl) this).field_A.field_B)) {
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

    public static void c() {
        field_S = null;
        field_W = null;
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
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
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
        int stackOut_1_0 = 0;
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
            if (param0 == -3) {
              if (!param2) {
                stackOut_6_0 = rn.field_e.c(param1);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = dn.field_f.c(param1);
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = -103;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("cl.UA(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ')');
        }
        return stackIn_7_0;
    }

    cl(hn param0, dj param1, int param2) {
        this(param0, (ee) (Object) param1, param2, true);
    }

    final void a(byte param0, dj param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        h var8 = null;
        h var9 = null;
        String stackIn_73_0 = null;
        String stackIn_86_0 = null;
        String stackIn_96_0 = null;
        String stackIn_113_0 = null;
        String stackIn_117_0 = null;
        RuntimeException stackIn_148_0 = null;
        StringBuilder stackIn_148_1 = null;
        RuntimeException stackIn_149_0 = null;
        StringBuilder stackIn_149_1 = null;
        RuntimeException stackIn_150_0 = null;
        StringBuilder stackIn_150_1 = null;
        String stackIn_150_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_72_0 = null;
        String stackOut_71_0 = null;
        String stackOut_85_0 = null;
        String stackOut_84_0 = null;
        String stackOut_112_0 = null;
        String stackOut_111_0 = null;
        String stackOut_116_0 = null;
        String stackOut_115_0 = null;
        String stackOut_95_0 = null;
        String stackOut_94_0 = null;
        RuntimeException stackOut_147_0 = null;
        StringBuilder stackOut_147_1 = null;
        RuntimeException stackOut_149_0 = null;
        StringBuilder stackOut_149_1 = null;
        String stackOut_149_2 = null;
        RuntimeException stackOut_148_0 = null;
        StringBuilder stackOut_148_1 = null;
        String stackOut_148_2 = null;
        var7 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            if (param1.field_z) {
              return;
            } else {
              L1: {
                ((cl) this).field_Q = true;
                if (param0 <= -70) {
                  break L1;
                } else {
                  int discarded$1 = 0;
                  cl.c();
                  break L1;
                }
              }
              L2: {
                var4 = ((cl) this).field_T;
                if (var4 != 0) {
                  if (var4 == 1) {
                    if (param1.field_Eb) {
                      this.a(ae.field_e, -88);
                      break L2;
                    } else {
                      param1.field_Eb = true;
                      kc.a(ii.field_i, (pm) this, 125, param1.field_Rb);
                      param1.field_Rb = false;
                      ((cl) this).d(10797);
                      break L2;
                    }
                  } else {
                    if (var4 == 2) {
                      if (param1.field_Sb) {
                        this.a(rh.field_db, -86);
                        break L2;
                      } else {
                        L3: {
                          param1.field_Sb = true;
                          kc.a(mg.field_c, (pm) this, 119, param1.field_sb);
                          if (!param1.field_sb) {
                            break L3;
                          } else {
                            pk.a((byte) 16, b.a(new String[1], tn.field_D, 1177));
                            param1.field_sb = false;
                            break L3;
                          }
                        }
                        ((cl) this).d(10797);
                        break L2;
                      }
                    } else {
                      if (3 == var4) {
                        if (!param1.field_cb) {
                          L4: {
                            param1.field_cb = true;
                            kc.a(ah.field_Z, (pm) this, 119, param1.field_nb);
                            if (!param1.field_nb) {
                              break L4;
                            } else {
                              pk.a((byte) 105, b.a(new String[1], ck.field_b, 1177));
                              param1.field_nb = false;
                              break L4;
                            }
                          }
                          ((cl) this).d(10797);
                          break L2;
                        } else {
                          this.a(qf.field_b, -84);
                          break L2;
                        }
                      } else {
                        if (var4 == 5) {
                          if (!param1.field_eb) {
                            L5: {
                              param1.field_eb = true;
                              kc.a(fa.field_T, (pm) this, 121, param1.field_Ob);
                              if (param1.field_Ob) {
                                pk.a((byte) 87, b.a(new String[1], ld.field_b, 1177));
                                param1.field_Ob = false;
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            ((cl) this).d(10797);
                            break L2;
                          } else {
                            this.a(vg.field_Q, -104);
                            break L2;
                          }
                        } else {
                          if (4 != var4) {
                            if (6 != var4) {
                              if (var4 == 8) {
                                param1.field_U = 1500;
                                kc.a(wd.field_e, (pm) this, 122, true);
                                ((cl) this).d(10797);
                                break L2;
                              } else {
                                if (var4 == 7) {
                                  param1.field_Pb = 1500;
                                  kc.a(ne.field_a, (pm) this, 119, true);
                                  ((cl) this).d(10797);
                                  break L2;
                                } else {
                                  if (var4 == 10) {
                                    if (param1.field_ub >= 20) {
                                      this.a(rn.field_b, -104);
                                      break L2;
                                    } else {
                                      L6: {
                                        if (param1.field_ub >= 0) {
                                          L7: {
                                            var4 = 20 - param1.field_ub;
                                            if (var4 <= 4) {
                                              break L7;
                                            } else {
                                              var4 = 4;
                                              break L7;
                                            }
                                          }
                                          L8: {
                                            param1.field_ub = param1.field_ub + var4;
                                            if (1 != var4) {
                                              stackOut_72_0 = b.a(new String[1], ah.field_R, 1177);
                                              stackIn_73_0 = stackOut_72_0;
                                              break L8;
                                            } else {
                                              stackOut_71_0 = ek.field_e;
                                              stackIn_73_0 = stackOut_71_0;
                                              break L8;
                                            }
                                          }
                                          kc.a(stackIn_73_0, (pm) this, 126, false);
                                          break L6;
                                        } else {
                                          param1.field_ub = 4;
                                          kc.a(b.a(new String[1], ah.field_R, 1177), (pm) this, 120, true);
                                          pk.a((byte) 68, b.a(new String[1], dc.field_M, 1177));
                                          break L6;
                                        }
                                      }
                                      ((cl) this).d(10797);
                                      break L2;
                                    }
                                  } else {
                                    if (var4 == 11) {
                                      if (param1.field_tb < 20) {
                                        L9: {
                                          if (param1.field_tb >= 0) {
                                            L10: {
                                              var4 = 20 + -param1.field_tb;
                                              if (var4 > 4) {
                                                var4 = 4;
                                                break L10;
                                              } else {
                                                break L10;
                                              }
                                            }
                                            L11: {
                                              param1.field_tb = param1.field_tb + var4;
                                              if (var4 != 1) {
                                                stackOut_85_0 = b.a(new String[1], hf.field_X, 1177);
                                                stackIn_86_0 = stackOut_85_0;
                                                break L11;
                                              } else {
                                                stackOut_84_0 = md.field_b;
                                                stackIn_86_0 = stackOut_84_0;
                                                break L11;
                                              }
                                            }
                                            kc.a(stackIn_86_0, (pm) this, 127, false);
                                            break L9;
                                          } else {
                                            param1.field_tb = 4;
                                            kc.a(b.a(new String[1], hf.field_X, 1177), (pm) this, 116, true);
                                            pk.a((byte) 48, b.a(new String[1], tm.field_e, 1177));
                                            break L9;
                                          }
                                        }
                                        ((cl) this).d(10797);
                                        break L2;
                                      } else {
                                        this.a(sc.field_j, -73);
                                        break L2;
                                      }
                                    } else {
                                      if (var4 != 12) {
                                        if (var4 != 13) {
                                          if (var4 != 14) {
                                            if (var4 != 15) {
                                              if (var4 != 16) {
                                                if (var4 == 9) {
                                                  kc.a(dj.field_W, (pm) this, 119, true);
                                                  param1.field_R = 1500;
                                                  ((cl) this).d(10797);
                                                  ((cl) this).field_A.field_J.field_e = 3 + ((cl) this).field_A.field_J.field_o;
                                                  ((cl) this).field_A.field_J.field_m = ((cl) this).field_A.field_J.field_o + 3;
                                                  if (((cl) this).field_A.field_J.field_m <= 24) {
                                                    hc.field_u = b.a(new String[1], oe.field_X, 1177);
                                                    bg.field_f = 0;
                                                    break L2;
                                                  } else {
                                                    break L2;
                                                  }
                                                } else {
                                                  if (var4 == 17) {
                                                    kc.a(q.field_n, (pm) this, 123, true);
                                                    param1.field_yb = param1.field_yb + 1;
                                                    d.field_a = d.field_a - 1;
                                                    ((cl) this).d(10797);
                                                    break L2;
                                                  } else {
                                                    break L2;
                                                  }
                                                }
                                              } else {
                                                kc.a(na.field_Q, (pm) this, 124, true);
                                                param1.field_Gb = 1500;
                                                ((cl) this).d(10797);
                                                break L2;
                                              }
                                            } else {
                                              L12: {
                                                kc.a(km.field_a, (pm) this, 116, true);
                                                param1.field_ib = 1500;
                                                param1.field_Bb.field_l = true;
                                                if (0 != param1.field_Bb.field_d) {
                                                  break L12;
                                                } else {
                                                  param1.field_Bb.field_d = 1;
                                                  break L12;
                                                }
                                              }
                                              var4 = 0;
                                              L13: while (true) {
                                                if (var4 >= 5) {
                                                  ((cl) this).d(10797);
                                                  break L2;
                                                } else {
                                                  L14: {
                                                    var9 = param1.field_Nb[var4];
                                                    if (var9 != null) {
                                                      var9.field_ab.field_l = true;
                                                      if (0 != var9.field_ab.field_d) {
                                                        break L14;
                                                      } else {
                                                        var9.field_ab.field_d = 1;
                                                        break L14;
                                                      }
                                                    } else {
                                                      break L14;
                                                    }
                                                  }
                                                  var4++;
                                                  continue L13;
                                                }
                                              }
                                            }
                                          } else {
                                            L15: {
                                              L16: {
                                                var3_int = param1.field_Bb.field_b - 8;
                                                if (var3_int == 0) {
                                                  break L16;
                                                } else {
                                                  L17: {
                                                    if (param1.field_Bb.field_d == 0) {
                                                      break L17;
                                                    } else {
                                                      if (var3_int < ((cl) this).field_A.field_J.a(-2)) {
                                                        break L16;
                                                      } else {
                                                        break L17;
                                                      }
                                                    }
                                                  }
                                                  L18: {
                                                    if (param1.field_Bb.field_d == 65536) {
                                                      stackOut_112_0 = dj.field_Ib;
                                                      stackIn_113_0 = stackOut_112_0;
                                                      break L18;
                                                    } else {
                                                      stackOut_111_0 = pi.field_P;
                                                      stackIn_113_0 = stackOut_111_0;
                                                      break L18;
                                                    }
                                                  }
                                                  kc.a(stackIn_113_0, (pm) this, 121, true);
                                                  break L15;
                                                }
                                              }
                                              L19: {
                                                if (var3_int != 0) {
                                                  stackOut_116_0 = vm.field_ab;
                                                  stackIn_117_0 = stackOut_116_0;
                                                  break L19;
                                                } else {
                                                  stackOut_115_0 = dj.field_Ib;
                                                  stackIn_117_0 = stackOut_115_0;
                                                  break L19;
                                                }
                                              }
                                              kc.a(stackIn_117_0, (pm) this, 120, true);
                                              param1.field_Bb.field_b = param1.field_Bb.field_b + 1;
                                              break L15;
                                            }
                                            param1.field_Bb.field_d = 65536;
                                            var4 = 0;
                                            L20: while (true) {
                                              if (var4 >= 5) {
                                                ((cl) this).d(10797);
                                                break L2;
                                              } else {
                                                L21: {
                                                  var8 = param1.field_Nb[var4];
                                                  if (var8 == null) {
                                                    break L21;
                                                  } else {
                                                    L22: {
                                                      var6 = param1.field_Bb.field_b - 4;
                                                      if (var8.field_ab.field_b < var6) {
                                                        var8.field_ab.field_b = var6;
                                                        break L22;
                                                      } else {
                                                        break L22;
                                                      }
                                                    }
                                                    var8.field_ab.field_d = 65536;
                                                    break L21;
                                                  }
                                                }
                                                var4++;
                                                continue L20;
                                              }
                                            }
                                          }
                                        } else {
                                          if (param1.field_ab >= 4) {
                                            this.a(gi.field_hb, -82);
                                            break L2;
                                          } else {
                                            L23: {
                                              if (param1.field_ab >= 0) {
                                                param1.field_ab = param1.field_ab + 1;
                                                kc.a(ah.field_W, (pm) this, 119, false);
                                                break L23;
                                              } else {
                                                param1.field_ab = 1;
                                                kc.a(ah.field_W, (pm) this, 121, true);
                                                pk.a((byte) 126, b.a(new String[1], ae.field_b, 1177));
                                                break L23;
                                              }
                                            }
                                            ((cl) this).d(10797);
                                            break L2;
                                          }
                                        }
                                      } else {
                                        if (param1.field_zb >= 10) {
                                          this.a(ke.field_ab, -111);
                                          break L2;
                                        } else {
                                          L24: {
                                            if (param1.field_zb < 0) {
                                              param1.field_zb = 4;
                                              kc.a(b.a(new String[1], kn.field_b, 1177), (pm) this, 119, true);
                                              pk.a((byte) 76, b.a(new String[1], jh.field_U, 1177));
                                              break L24;
                                            } else {
                                              L25: {
                                                var4 = 10 + -param1.field_zb;
                                                if (var4 > 4) {
                                                  var4 = 4;
                                                  break L25;
                                                } else {
                                                  break L25;
                                                }
                                              }
                                              L26: {
                                                param1.field_zb = param1.field_zb + var4;
                                                if (var4 == 1) {
                                                  stackOut_95_0 = wh.field_ab;
                                                  stackIn_96_0 = stackOut_95_0;
                                                  break L26;
                                                } else {
                                                  stackOut_94_0 = b.a(new String[1], kn.field_b, 1177);
                                                  stackIn_96_0 = stackOut_94_0;
                                                  break L26;
                                                }
                                              }
                                              kc.a(stackIn_96_0, (pm) this, 120, false);
                                              break L24;
                                            }
                                          }
                                          ((cl) this).d(10797);
                                          break L2;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              if (!param1.o(-100)) {
                                this.a(dn.field_a, -99);
                                break L2;
                              } else {
                                kc.a(gb.field_b, (pm) this, 124, true);
                                ((cl) this).d(10797);
                                break L2;
                              }
                            }
                          } else {
                            if (!param1.field_rb) {
                              L27: {
                                param1.field_rb = true;
                                kc.a(wi.field_b, (pm) this, 126, param1.field_hb);
                                if (!param1.field_hb) {
                                  break L27;
                                } else {
                                  pk.a((byte) 62, b.a(new String[1], vg.field_K, 1177));
                                  param1.field_hb = false;
                                  break L27;
                                }
                              }
                              ((cl) this).d(10797);
                              break L2;
                            } else {
                              this.a(f.field_b, -103);
                              break L2;
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
                    break L2;
                  } else {
                    this.a(hj.field_i, -76);
                    break L2;
                  }
                }
              }
              L28: {
                if (((cl) this).field_z) {
                  gd.a(48, 70, gj.field_d, (pm) this);
                  if (((cl) this).field_U) {
                    break L28;
                  } else {
                    ((cl) this).field_A.a((byte) 50, 200);
                    break L28;
                  }
                } else {
                  break L28;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L29: {
            var3 = decompiledCaughtException;
            stackOut_147_0 = (RuntimeException) var3;
            stackOut_147_1 = new StringBuilder().append("cl.RA(").append(param0).append(',');
            stackIn_149_0 = stackOut_147_0;
            stackIn_149_1 = stackOut_147_1;
            stackIn_148_0 = stackOut_147_0;
            stackIn_148_1 = stackOut_147_1;
            if (param1 == null) {
              stackOut_149_0 = (RuntimeException) (Object) stackIn_149_0;
              stackOut_149_1 = (StringBuilder) (Object) stackIn_149_1;
              stackOut_149_2 = "null";
              stackIn_150_0 = stackOut_149_0;
              stackIn_150_1 = stackOut_149_1;
              stackIn_150_2 = stackOut_149_2;
              break L29;
            } else {
              stackOut_148_0 = (RuntimeException) (Object) stackIn_148_0;
              stackOut_148_1 = (StringBuilder) (Object) stackIn_148_1;
              stackOut_148_2 = "{...}";
              stackIn_150_0 = stackOut_148_0;
              stackIn_150_1 = stackOut_148_1;
              stackIn_150_2 = stackOut_148_2;
              break L29;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_150_0, stackIn_150_2 + ')');
        }
    }

    final void a(boolean param0, il param1) {
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
              param1.c((ee) this, -7442);
              if (!param0) {
                break L1;
              } else {
                ((cl) this).field_R = 69;
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
            stackOut_3_1 = new StringBuilder().append("cl.L(").append(param0).append(',');
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
          throw sd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    private final boolean a(dj param0) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_85_0 = 0;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_89_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_75_0 = 0;
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
        int stackOut_2_0 = 0;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        String stackOut_88_2 = null;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        String stackOut_87_2 = null;
        var4 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            if (!param0.field_z) {
              var3_int = ((cl) this).field_T;
              if (var3_int != 0) {
                if (var3_int == 1) {
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
                  if (var3_int != 2) {
                    if (var3_int != 3) {
                      if (var3_int != 5) {
                        if (4 != var3_int) {
                          if (6 != var3_int) {
                            if (var3_int == 8) {
                              stackOut_56_0 = 1;
                              stackIn_57_0 = stackOut_56_0;
                              return stackIn_57_0 != 0;
                            } else {
                              if (7 == var3_int) {
                                stackOut_58_0 = 1;
                                stackIn_59_0 = stackOut_58_0;
                                return stackIn_59_0 != 0;
                              } else {
                                if (var3_int == 10) {
                                  L2: {
                                    L3: {
                                      if (!((cl) this).field_Q) {
                                        break L3;
                                      } else {
                                        if (param0.field_ub >= 20) {
                                          stackOut_64_0 = 0;
                                          stackIn_65_0 = stackOut_64_0;
                                          break L2;
                                        } else {
                                          break L3;
                                        }
                                      }
                                    }
                                    stackOut_63_0 = 1;
                                    stackIn_65_0 = stackOut_63_0;
                                    break L2;
                                  }
                                  return stackIn_65_0 != 0;
                                } else {
                                  if (var3_int == 11) {
                                    L4: {
                                      L5: {
                                        if (!((cl) this).field_Q) {
                                          break L5;
                                        } else {
                                          if (20 <= param0.field_tb) {
                                            stackOut_70_0 = 0;
                                            stackIn_71_0 = stackOut_70_0;
                                            break L4;
                                          } else {
                                            break L5;
                                          }
                                        }
                                      }
                                      stackOut_69_0 = 1;
                                      stackIn_71_0 = stackOut_69_0;
                                      break L4;
                                    }
                                    return stackIn_71_0 != 0;
                                  } else {
                                    if (var3_int != 12) {
                                      if (var3_int != 13) {
                                        if (14 == var3_int) {
                                          stackOut_78_0 = 1;
                                          stackIn_79_0 = stackOut_78_0;
                                          return stackIn_79_0 != 0;
                                        } else {
                                          if (15 == var3_int) {
                                            stackOut_80_0 = 1;
                                            stackIn_81_0 = stackOut_80_0;
                                            return stackIn_81_0 != 0;
                                          } else {
                                            if (var3_int == 16) {
                                              stackOut_82_0 = 1;
                                              stackIn_83_0 = stackOut_82_0;
                                              return stackIn_83_0 != 0;
                                            } else {
                                              if (var3_int != 9) {
                                                if (17 != var3_int) {
                                                  stackOut_84_0 = 0;
                                                  stackIn_85_0 = stackOut_84_0;
                                                  break L0;
                                                } else {
                                                  return true;
                                                }
                                              } else {
                                                return true;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        return true;
                                      }
                                    } else {
                                      L6: {
                                        L7: {
                                          if (!((cl) this).field_Q) {
                                            break L7;
                                          } else {
                                            if (param0.field_zb >= 10) {
                                              stackOut_76_0 = 0;
                                              stackIn_77_0 = stackOut_76_0;
                                              break L6;
                                            } else {
                                              break L7;
                                            }
                                          }
                                        }
                                        stackOut_75_0 = 1;
                                        stackIn_77_0 = stackOut_75_0;
                                        break L6;
                                      }
                                      return stackIn_77_0 != 0;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            return param0.l(-53);
                          }
                        } else {
                          L8: {
                            if (param0.field_rb) {
                              stackOut_54_0 = 0;
                              stackIn_55_0 = stackOut_54_0;
                              break L8;
                            } else {
                              stackOut_53_0 = 1;
                              stackIn_55_0 = stackOut_53_0;
                              break L8;
                            }
                          }
                          return stackIn_55_0 != 0;
                        }
                      } else {
                        L9: {
                          if (param0.field_eb) {
                            stackOut_50_0 = 0;
                            stackIn_51_0 = stackOut_50_0;
                            break L9;
                          } else {
                            stackOut_49_0 = 1;
                            stackIn_51_0 = stackOut_49_0;
                            break L9;
                          }
                        }
                        return stackIn_51_0 != 0;
                      }
                    } else {
                      L10: {
                        if (param0.field_cb) {
                          stackOut_46_0 = 0;
                          stackIn_47_0 = stackOut_46_0;
                          break L10;
                        } else {
                          stackOut_45_0 = 1;
                          stackIn_47_0 = stackOut_45_0;
                          break L10;
                        }
                      }
                      return stackIn_47_0 != 0;
                    }
                  } else {
                    L11: {
                      if (param0.field_Sb) {
                        stackOut_42_0 = 0;
                        stackIn_43_0 = stackOut_42_0;
                        break L11;
                      } else {
                        stackOut_41_0 = 1;
                        stackIn_43_0 = stackOut_41_0;
                        break L11;
                      }
                    }
                    return stackIn_43_0 != 0;
                  }
                }
              } else {
                L12: {
                  if (param0.field_mb) {
                    stackOut_34_0 = 0;
                    stackIn_35_0 = stackOut_34_0;
                    break L12;
                  } else {
                    stackOut_33_0 = 1;
                    stackIn_35_0 = stackOut_33_0;
                    break L12;
                  }
                }
                return stackIn_35_0 != 0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var3 = decompiledCaughtException;
            stackOut_86_0 = (RuntimeException) var3;
            stackOut_86_1 = new StringBuilder().append("cl.SA(");
            stackIn_88_0 = stackOut_86_0;
            stackIn_88_1 = stackOut_86_1;
            stackIn_87_0 = stackOut_86_0;
            stackIn_87_1 = stackOut_86_1;
            if (param0 == null) {
              stackOut_88_0 = (RuntimeException) (Object) stackIn_88_0;
              stackOut_88_1 = (StringBuilder) (Object) stackIn_88_1;
              stackOut_88_2 = "null";
              stackIn_89_0 = stackOut_88_0;
              stackIn_89_1 = stackOut_88_1;
              stackIn_89_2 = stackOut_88_2;
              break L13;
            } else {
              stackOut_87_0 = (RuntimeException) (Object) stackIn_87_0;
              stackOut_87_1 = (StringBuilder) (Object) stackIn_87_1;
              stackOut_87_2 = "{...}";
              stackIn_89_0 = stackOut_87_0;
              stackIn_89_1 = stackOut_87_1;
              stackIn_89_2 = stackOut_87_2;
              break L13;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_89_0, stackIn_89_2 + ',' + -1326 + ')');
        }
        return stackIn_85_0 != 0;
    }

    final void a(int param0, h param1) {
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
              ((cl) this).a((byte) -116, ((cl) this).field_A.field_B);
              if (param0 == 640) {
                break L1;
              } else {
                ((cl) this).field_T = -106;
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
            stackOut_3_1 = new StringBuilder().append("cl.VA(").append(param0).append(',');
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
          throw sd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final void a(dj param0, byte param1) {
        try {
            if (param1 != 80) {
                ((cl) this).field_Q = true;
            }
            ((cl) this).a((byte) -113, param0);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "cl.GB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private cl(hn param0, ee param1, int param2, boolean param3) {
        super(param0, param1.field_E, param1.field_t, param1.field_D, 0.25, 0.01);
        RuntimeException var5 = null;
        double[] var5_array = null;
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
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        ((cl) this).field_V = (int)(Math.random() * 64.0);
        ((cl) this).field_R = 0;
        try {
          L0: {
            L1: {
              var20 = new double[12];
              var19 = var20;
              var18 = var19;
              var17 = var18;
              var16 = var17;
              var5_array = var16;
              param0.field_B.field_jb.a((byte) 113, var20);
              var6 = (Math.random() + 1.0) * 0.2;
              var8 = 0.002 * Math.sqrt(Math.random()) / var6;
              var10 = 6.283185307179586 * Math.random();
              var12 = var8 * Math.sin(var10);
              var14 = Math.cos(var10) * var8;
              ((cl) this).field_L = var20[11] * var6 + (var14 * var20[8] + var20[5] * var12);
              ((cl) this).field_G = var20[4] * var12 + var14 * var20[7] + var20[10] * var6;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param3) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            ((cl) this).field_U = stackIn_4_1 != 0;
            ((cl) this).field_K = var14 * var20[6] + var12 * var20[3] + var20[9] * var6;
            ((cl) this).field_T = param2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("cl.<init>(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(pm param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
            if (param1 == 72) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("cl.WA(");
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
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final double a(int param0, boolean param1, double param2) {
        if (param0 != 14170) {
            Object var6 = null;
            int discarded$0 = cl.a(-34, (String) null, true);
        }
        return param2;
    }

    final boolean a(boolean param0, pm param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
            if (param0) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              ((cl) this).field_T = 61;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("cl.CB(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final void a(int param0, vg param1) {
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
              param1.a((cl) this, (byte) -115);
              if (param0 == -1) {
                break L1;
              } else {
                ((cl) this).field_V = -53;
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
            stackOut_3_1 = new StringBuilder().append("cl.DA(").append(param0).append(',');
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
          throw sd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final void a(int param0, ah param1) {
        try {
            int var3_int = 116 % ((param0 - 14) / 53);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "cl.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, ee param1) {
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
              ((cl) this).a(param1, 0.0, -55);
              if (param0) {
                break L1;
              } else {
                ((cl) this).field_R = -82;
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
            stackOut_3_1 = new StringBuilder().append("cl.E(").append(param0).append(',');
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
          throw sd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final void a(byte param0, sa param1) {
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
              if (param0 == 9) {
                break L1;
              } else {
                ((cl) this).field_V = 72;
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
            stackOut_3_1 = new StringBuilder().append("cl.M(").append(param0).append(',');
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
          throw sd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final void a(pm param0, int param1) {
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
              param0.a((cl) this, (byte) 124);
              if (param1 < -81) {
                break L1;
              } else {
                ((cl) this).field_U = false;
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
            stackOut_3_1 = new StringBuilder().append("cl.D(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
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
          throw sd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final boolean c(int param0) {
        if (param0 != 5) {
            return true;
        }
        return false;
    }

    final void a(int param0, hf param1) {
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
              if (param0 <= -29) {
                break L1;
              } else {
                ((cl) this).field_V = -43;
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
            stackOut_3_1 = new StringBuilder().append("cl.A(").append(param0).append(',');
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
          throw sd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final void a(cl param0, byte param1) {
        try {
            int var3_int = -92 % ((-35 - param1) / 60);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "cl.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, mb param1) {
        try {
            if (param0 != -23154) {
                Object var4 = null;
                ((cl) this).a(false, (il) null);
            }
            param1.a((cl) this, (byte) 107);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "cl.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_S = new rf();
    }
}
