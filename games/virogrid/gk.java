/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

final class gk implements Iterable {
    static hg field_g;
    static byte[][][] field_c;
    int field_a;
    static p field_f;
    l[] field_h;
    static km field_b;
    private l field_d;
    static km field_e;

    public static void a() {
        try {
            field_b = null;
            field_c = null;
            field_f = null;
            field_g = null;
            field_e = null;
            int var1_int = -118;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "gk.E(" + -127 + 41);
        }
    }

    final l a(long param0, int param1) {
        l var4 = null;
        RuntimeException var4_ref = null;
        l var5 = null;
        int var6 = 0;
        int stackIn_4_0 = 0;
        l stackIn_9_0 = null;
        int stackIn_12_0 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_16_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        l stackOut_8_0 = null;
        int stackOut_11_0 = 0;
        Object stackOut_15_0 = null;
        Object stackOut_13_0 = null;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var4 = ((gk) this).field_h[(int)((long)(((gk) this).field_a - 1) & param0)];
            ((gk) this).field_d = var4.field_f;
            L1: while (true) {
              L2: {
                L3: {
                  if (((gk) this).field_d == var4) {
                    break L3;
                  } else {
                    stackOut_3_0 = (param0 < ((gk) this).field_d.field_d ? -1 : (param0 == ((gk) this).field_d.field_d ? 0 : 1));
                    stackIn_12_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      if (stackIn_4_0 == 0) {
                        var5 = ((gk) this).field_d;
                        ((gk) this).field_d = ((gk) this).field_d.field_f;
                        stackOut_8_0 = (l) var5;
                        stackIn_9_0 = stackOut_8_0;
                        return stackIn_9_0;
                      } else {
                        ((gk) this).field_d = ((gk) this).field_d.field_f;
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackOut_11_0 = param1;
                stackIn_12_0 = stackOut_11_0;
                break L2;
              }
              if (stackIn_12_0 == -18348) {
                ((gk) this).field_d = null;
                stackOut_15_0 = null;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                stackOut_13_0 = null;
                stackIn_14_0 = stackOut_13_0;
                return (l) (Object) stackIn_14_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var4_ref, "gk.A(" + param0 + 44 + param1 + 41);
        }
        return (l) (Object) stackIn_16_0;
    }

    final static gh a(byte param0, int param1, boolean param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
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
        RuntimeException decompiledCaughtException = null;
        um stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        boolean stackOut_4_2 = false;
        int stackOut_4_3 = 0;
        int stackOut_4_4 = 0;
        int stackOut_4_5 = 0;
        um stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        boolean stackOut_7_2 = false;
        int stackOut_7_3 = 0;
        int stackOut_7_4 = 0;
        int stackOut_7_5 = 0;
        int stackOut_7_6 = 0;
        um stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        boolean stackOut_5_2 = false;
        int stackOut_5_3 = 0;
        int stackOut_5_4 = 0;
        int stackOut_5_5 = 0;
        int stackOut_5_6 = 0;
        gh stackOut_11_0 = null;
        km stackOut_34_0 = null;
        km stackOut_37_0 = null;
        String stackOut_37_1 = null;
        km stackOut_35_0 = null;
        String stackOut_35_1 = null;
        km stackOut_38_0 = null;
        km stackOut_41_0 = null;
        String stackOut_41_1 = null;
        km stackOut_39_0 = null;
        String stackOut_39_1 = null;
        int stackOut_45_0 = 0;
        int stackOut_43_0 = 0;
        km stackOut_86_0 = null;
        Object stackOut_101_0 = null;
        var19 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              stackOut_4_0 = ve.field_q.field_Ib;
              stackOut_4_1 = pg.field_e - -2;
              stackOut_4_2 = param2;
              stackOut_4_3 = 0;
              stackOut_4_4 = 2;
              stackOut_4_5 = param1 * (3 * (pg.field_e - -2));
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              stackIn_7_3 = stackOut_4_3;
              stackIn_7_4 = stackOut_4_4;
              stackIn_7_5 = stackOut_4_5;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              stackIn_5_3 = stackOut_4_3;
              stackIn_5_4 = stackOut_4_4;
              stackIn_5_5 = stackOut_4_5;
              if (ve.field_q.field_Ib != wf.field_d) {
                stackOut_7_0 = (um) (Object) stackIn_7_0;
                stackOut_7_1 = stackIn_7_1;
                stackOut_7_2 = stackIn_7_2;
                stackOut_7_3 = stackIn_7_3;
                stackOut_7_4 = stackIn_7_4;
                stackOut_7_5 = stackIn_7_5;
                stackOut_7_6 = 0;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                stackIn_8_2 = stackOut_7_2;
                stackIn_8_3 = stackOut_7_3;
                stackIn_8_4 = stackOut_7_4;
                stackIn_8_5 = stackOut_7_5;
                stackIn_8_6 = stackOut_7_6;
                break L1;
              } else {
                stackOut_5_0 = (um) (Object) stackIn_5_0;
                stackOut_5_1 = stackIn_5_1;
                stackOut_5_2 = stackIn_5_2;
                stackOut_5_3 = stackIn_5_3;
                stackOut_5_4 = stackIn_5_4;
                stackOut_5_5 = stackIn_5_5;
                stackOut_5_6 = 1;
                stackIn_8_0 = stackOut_5_0;
                stackIn_8_1 = stackOut_5_1;
                stackIn_8_2 = stackOut_5_2;
                stackIn_8_3 = stackOut_5_3;
                stackIn_8_4 = stackOut_5_4;
                stackIn_8_5 = stackOut_5_5;
                stackIn_8_6 = stackOut_5_6;
                break L1;
              }
            }
            L2: {
              var3_int = ((um) (Object) stackIn_8_0).a(stackIn_8_1, stackIn_8_2, stackIn_8_3 != 0, stackIn_8_4, stackIn_8_5, stackIn_8_6 != 0) ? 1 : 0;
              var4 = ve.field_q.field_Lb.field_W;
              var5 = null;
              if (oa.field_q != 2) {
                L3: {
                  L4: {
                    dg.field_E.field_Y = false;
                    ee.field_e.field_V = wc.field_b;
                    if (oa.field_q == 1) {
                      break L4;
                    } else {
                      ve.field_q.field_Ib.field_Eb.field_V = ul.field_e;
                      if (var19 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  ve.field_q.field_Ib.field_Eb.field_V = ce.field_H;
                  break L3;
                }
                ak.a(16377, ve.field_q.field_Lb);
                break L2;
              } else {
                dg.field_E.field_Y = true;
                ee.field_e.field_V = oi.a(new String[1], gg.field_J, 2);
                ve.field_q.field_Ib.field_Eb.field_V = null;
                var6 = null;
                var7 = (gh) (Object) var4.a((byte) -41);
                L5: while (true) {
                  L6: {
                    L7: {
                      if (null == var7) {
                        break L7;
                      } else {
                        var8 = 0;
                        stackOut_11_0 = (gh) var7;
                        stackIn_87_0 = (Object) (Object) stackOut_11_0;
                        stackIn_12_0 = stackOut_11_0;
                        if (var19 != 0) {
                          break L6;
                        } else {
                          L8: {
                            if (stackIn_12_0.field_W != null) {
                              break L8;
                            } else {
                              var7.field_Eb = new km(0L, gg.field_F);
                              var7.a(0, var7.field_Eb);
                              var7.field_Gb = new km(0L, jd.field_d);
                              var7.a(0, var7.field_Gb);
                              var7.field_Mb = new km(0L, gg.field_F);
                              var7.a(0, var7.field_Mb);
                              var7.field_Gb.field_lb = 2;
                              var8 = 1;
                              var7.b((byte) 42);
                              break L8;
                            }
                          }
                          L9: {
                            L10: {
                              var7.field_K = ve.field_q.field_Lb.field_K;
                              var9 = 0;
                              if (var7.field_Pb != null) {
                                break L10;
                              } else {
                                var11 = 16737894;
                                var10 = 13369344;
                                if (var19 == 0) {
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            L11: {
                              if (var7.field_Pb == wl.field_a) {
                                break L11;
                              } else {
                                var10 = 13421568;
                                var11 = 16777062;
                                if (var19 == 0) {
                                  break L9;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            var10 = 52224;
                            var11 = 6750054;
                            break L9;
                          }
                          L12: {
                            var12 = 0;
                            if (null == var7.field_Jb) {
                              break L12;
                            } else {
                              if (!var7.field_Jb.equals((Object) (Object) "")) {
                                var7.field_Mb.field_ab = var11;
                                var7.field_Mb.field_qb = qg.field_u;
                                var7.field_Mb.a(0, pg.field_e, qg.field_u.field_u + 3, (byte) -94, var9);
                                var12 = 1;
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                          }
                          L13: {
                            var7.field_Gb.field_bb = var11;
                            var7.field_Eb.field_bb = var11;
                            km fieldTemp$2 = var7.field_Eb;
                            var7.field_Gb.field_E = var10;
                            fieldTemp$2.field_E = var10;
                            var7.field_Gb.field_A = var11;
                            var7.field_Eb.field_A = var11;
                            var7.field_Gb.field_ab = var11;
                            var7.field_Eb.field_ab = var11;
                            var13 = 0;
                            var14 = var7.field_K + -82;
                            if (var12 != 0) {
                              var13 = qg.field_u.field_u - -3;
                              var14 = var14 - var13;
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                          L14: {
                            stackOut_34_0 = var7.field_Eb;
                            stackIn_37_0 = stackOut_34_0;
                            stackIn_35_0 = stackOut_34_0;
                            if (var14 <= 0) {
                              stackOut_37_0 = (km) (Object) stackIn_37_0;
                              stackOut_37_1 = var7.field_Hb;
                              stackIn_38_0 = stackOut_37_0;
                              stackIn_38_1 = stackOut_37_1;
                              break L14;
                            } else {
                              stackOut_35_0 = (km) (Object) stackIn_35_0;
                              stackOut_35_1 = e.a(var7.field_Eb.field_C, var7.field_Hb, var14);
                              stackIn_38_0 = stackOut_35_0;
                              stackIn_38_1 = stackOut_35_1;
                              break L14;
                            }
                          }
                          L15: {
                            stackIn_38_0.field_V = stackIn_38_1;
                            var7.field_Eb.a(var13, pg.field_e, var14, (byte) -46, var9);
                            stackOut_38_0 = var7.field_Gb;
                            stackIn_41_0 = stackOut_38_0;
                            stackIn_39_0 = stackOut_38_0;
                            if (var7.field_Pb == null) {
                              stackOut_41_0 = (km) (Object) stackIn_41_0;
                              stackOut_41_1 = ln.field_a;
                              stackIn_42_0 = stackOut_41_0;
                              stackIn_42_1 = stackOut_41_1;
                              break L15;
                            } else {
                              stackOut_39_0 = (km) (Object) stackIn_39_0;
                              stackOut_39_1 = var7.field_Pb;
                              stackIn_42_0 = stackOut_39_0;
                              stackIn_42_1 = stackOut_39_1;
                              break L15;
                            }
                          }
                          L16: {
                            stackIn_42_0.field_V = stackIn_42_1;
                            var7.field_Gb.a(-80 + var7.field_K, pg.field_e, 80, (byte) -54, var9);
                            if (var7.field_Eb.field_V.equals((Object) (Object) var7.field_Hb)) {
                              stackOut_45_0 = 0;
                              stackIn_46_0 = stackOut_45_0;
                              break L16;
                            } else {
                              stackOut_43_0 = 1;
                              stackIn_46_0 = stackOut_43_0;
                              break L16;
                            }
                          }
                          L17: {
                            var15 = stackIn_46_0;
                            var9 = var9 + pg.field_e;
                            if (var3_int != 0) {
                              break L17;
                            } else {
                              var7.field_kb = -var7.field_ub + var9;
                              break L17;
                            }
                          }
                          L18: {
                            if (var8 != 0) {
                              ve.field_q.field_Lb.a(2, (km) (Object) var7, (km) var6, (byte) 113);
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                          L19: {
                            L20: {
                              if (var7.field_Mb == null) {
                                break L20;
                              } else {
                                if (!var7.field_Mb.field_S) {
                                  break L20;
                                } else {
                                  wc.field_g = var7.field_Jb;
                                  if (var19 == 0) {
                                    break L19;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                            }
                            L21: {
                              if (var7.field_nb != 0) {
                                break L21;
                              } else {
                                if (!var7.field_Eb.field_S) {
                                  break L19;
                                } else {
                                  if (var15 == 0) {
                                    break L19;
                                  } else {
                                    wc.field_g = var7.field_Hb;
                                    if (var19 == 0) {
                                      break L19;
                                    } else {
                                      break L21;
                                    }
                                  }
                                }
                              }
                            }
                            L22: {
                              var16 = var7.field_Hb;
                              ai.a(-1, ve.field_q.field_Ib, (int[]) null, (String) null, 0L, var16, -1, (km) (Object) var7, 111);
                              if (var7.field_Pb == null) {
                                break L22;
                              } else {
                                int discarded$3 = 0;
                                if (dd.a(md.field_e.field_g)) {
                                  break L22;
                                } else {
                                  if (wg.field_f) {
                                    break L22;
                                  } else {
                                    L23: {
                                      if (dh.field_n) {
                                        break L23;
                                      } else {
                                        var17 = md.field_e;
                                        var18 = oi.a(new String[1], ha.field_d, 2);
                                        var17.field_a.a(1, var18, 8);
                                        break L23;
                                      }
                                    }
                                    var17 = md.field_e;
                                    var18 = oi.a(new String[1], og.field_c, 2);
                                    var17.field_a.a(1, var18, 18);
                                    break L22;
                                  }
                                }
                              }
                            }
                            var5 = (Object) (Object) var7;
                            break L19;
                          }
                          var6 = (Object) (Object) var7;
                          var7 = (gh) (Object) var4.a(16213);
                          if (var19 == 0) {
                            continue L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    stackOut_86_0 = ve.field_q.field_Fb;
                    stackIn_87_0 = (Object) (Object) stackOut_86_0;
                    break L6;
                  }
                  L24: {
                    if (((km) (Object) stackIn_87_0).field_nb == 0) {
                      break L24;
                    } else {
                      he.field_Xb = new fe(ve.field_q.field_Fb.field_Bb, ve.field_q.field_Fb.field_J, ve.field_q.field_Fb.field_K, ve.field_q.field_Fb.field_ub, jd.field_e, s.field_f, ti.field_h, ti.field_h);
                      ge.field_d = 0;
                      break L24;
                    }
                  }
                  L25: {
                    if (ve.field_q.field_Mb.field_nb == 0) {
                      break L25;
                    } else {
                      he.field_Xb = new fe(ve.field_q.field_Mb.field_Bb, ve.field_q.field_Mb.field_J, ve.field_q.field_Mb.field_K, ve.field_q.field_Mb.field_ub, ec.field_D, s.field_f, ti.field_h, ti.field_h);
                      ge.field_d = 1;
                      break L25;
                    }
                  }
                  break L2;
                }
              }
            }
            stackOut_101_0 = var5;
            stackIn_102_0 = stackOut_101_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var3, "gk.D(" + -100 + 44 + param1 + 44 + param2 + 41);
        }
        return (gh) (Object) stackIn_102_0;
    }

    final void a(l param0, int param1, long param2) {
        RuntimeException runtimeException = null;
        l var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
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
              var5 = ((gk) this).field_h[(int)((long)(-1 + ((gk) this).field_a) & param2)];
              param0.field_f = var5;
              param0.field_a = var5.field_a;
              param0.field_a.field_f = param0;
              param0.field_d = param2;
              param0.field_f.field_a = param0;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) runtimeException;
            stackOut_8_1 = new StringBuilder().append("gk.B(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    gk(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        l var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            ((gk) this).field_a = param0;
            ((gk) this).field_h = new l[param0];
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (param0 <= var2_int) {
                    break L3;
                  } else {
                    l dupTemp$2 = new l();
                    ((gk) this).field_h[var2_int] = dupTemp$2;
                    var3 = dupTemp$2;
                    var3.field_f = var3;
                    var3.field_a = var3;
                    var2_int++;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw kg.a((Throwable) (Object) runtimeException, "gk.<init>(" + param0 + 41);
        }
    }

    public final Iterator iterator() {
        RuntimeException var1 = null;
        j stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        j stackOut_0_0 = null;
        try {
          L0: {
            stackOut_0_0 = new j((gk) this);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var1, "gk.iterator()");
        }
        return (Iterator) (Object) stackIn_1_0;
    }

    final static void a(boolean param0, String param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            p.field_f = param0;
            fe.field_Fb = true;
            hf.field_w = new sh(tm.field_l, on.field_b, param1, kb.field_c, p.field_f);
            tm.field_l.a(0, (fi) (Object) hf.field_w);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("gk.C(").append(param0).append(44);
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
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + 0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = null;
    }
}
