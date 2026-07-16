/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class rn implements Runnable {
    static int field_b;
    private wo field_c;
    static int field_d;
    static vh field_f;
    static String[] field_a;
    static int[] field_g;
    private boolean field_j;
    private Thread field_i;
    int field_e;
    static String field_h;

    final dg a(byte param0, np param1, int param2) {
        dg var4 = new dg();
        var4.field_x = false;
        var4.field_N = 3;
        var4.field_m = (long)param2;
        var4.field_R = param1;
        this.a(var4, -19789);
        if (param0 != 58) {
            ((rn) this).field_c = null;
        }
        return var4;
    }

    final dg a(int param0, np param1, int param2) {
        dg var4 = null;
        int var5 = 0;
        Object var6 = null;
        dg var7 = null;
        Throwable var8 = null;
        int var9 = 0;
        dg stackIn_8_0 = null;
        Throwable decompiledCaughtException = null;
        dg stackOut_7_0 = null;
        var9 = Pool.field_O;
        var4 = new dg();
        var4.field_N = 1;
        var5 = 2 / ((10 - param0) / 52);
        var6 = (Object) (Object) ((rn) this).field_c;
        synchronized (var6) {
          L0: {
            var7 = (dg) (Object) ((rn) this).field_c.a((byte) 110);
            L1: while (true) {
              if (var7 == null) {
                break L0;
              } else {
                L2: {
                  if (var7.field_m != (long)param2) {
                    break L2;
                  } else {
                    if (param1 != var7.field_R) {
                      break L2;
                    } else {
                      if (2 == var7.field_N) {
                        var4.field_F = false;
                        var4.field_Q = var7.field_Q;
                        stackOut_7_0 = (dg) var4;
                        stackIn_8_0 = stackOut_7_0;
                        return stackIn_8_0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                var7 = (dg) (Object) ((rn) this).field_c.b((byte) -97);
                continue L1;
              }
            }
          }
        }
        var4.field_Q = param1.a((byte) -110, param2);
        var4.field_F = false;
        var4.field_x = true;
        return var4;
    }

    private final void a(dg param0, int param1) {
        Object var3 = null;
        Throwable var4 = null;
        Throwable decompiledCaughtException = null;
        var3 = (Object) (Object) ((rn) this).field_c;
        synchronized (var3) {
          L0: {
            ((rn) this).field_c.a((rg) (Object) param0, false);
            ((rn) this).field_e = ((rn) this).field_e + 1;
            ((Object) (Object) ((rn) this).field_c).notifyAll();
            break L0;
          }
        }
        L1: {
          if (param1 == -19789) {
            break L1;
          } else {
            ((rn) this).run();
            break L1;
          }
        }
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            Object var6 = null;
            dg var7 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            var5 = Pool.field_O;
            L0: while (true) {
              if (((rn) this).field_j) {
                return;
              } else {
                var2 = (Object) (Object) ((rn) this).field_c;
                synchronized (var2) {
                  L1: {
                    var7 = (dg) (Object) ((rn) this).field_c.a(0);
                    if (var7 == null) {
                      try {
                        L2: {
                          ((Object) (Object) ((rn) this).field_c).wait();
                          break L2;
                        }
                      } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L3: {
                          interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                          break L3;
                        }
                      }
                      decompiledRegionSelector0 = 0;
                      break L1;
                    } else {
                      ((rn) this).field_e = ((rn) this).field_e - 1;
                      decompiledRegionSelector0 = 1;
                      break L1;
                    }
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  continue L0;
                } else {
                  try {
                    L4: {
                      L5: {
                        if (2 != var7.field_N) {
                          if (var7.field_N != 3) {
                            decompiledRegionSelector1 = 1;
                            break L4;
                          } else {
                            var7.field_Q = var7.field_R.a((byte) -110, (int)var7.field_m);
                            var7.field_F = false;
                            break L5;
                          }
                        } else {
                          boolean discarded$1 = var7.field_R.a((int)var7.field_m, -12875, var7.field_Q.length, var7.field_Q);
                          var7.field_F = false;
                          break L5;
                        }
                      }
                      decompiledRegionSelector1 = 0;
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L6: {
                      var2_ref = (Exception) (Object) decompiledCaughtException;
                      var6 = null;
                      tc.a((Throwable) (Object) var2_ref, (String) null, -8555);
                      decompiledRegionSelector1 = 1;
                      break L6;
                    }
                  }
                  if (decompiledRegionSelector1 == 0) {
                    continue L0;
                  } else {
                    var7.field_F = false;
                    continue L0;
                  }
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, boolean param4, boolean param5, boolean param6, boolean param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        kk.field_B = null;
        or.c((byte) 4);
        param6 = wi.a(param0, param3, param11, param9, param6, (byte) 33, param10);
        mp.a(param1, param6, param8, param13, param5, 13375, param2, param4, param7, param3);
        int var14 = 36 / ((param12 - -84) / 37);
        hr.a(param4, -108, param1);
        lq.a(param1, param6, 0, param11);
    }

    final static void a(String[][] param0, String[] param1, String[] param2, int param3, byte param4, byte[] param5, dd[][] param6, dd[][] param7, int param8, int param9, String[] param10, int[] param11, String[][] param12, byte[] param13, di param14) {
        vh var16 = null;
        int var17_int = 0;
        vh var17 = null;
        int var18 = 0;
        Object var19_ref = null;
        int var19 = 0;
        Object var20 = null;
        int var21 = 0;
        vh var23 = null;
        vh var24 = null;
        vh stackIn_6_0 = null;
        vh stackIn_6_1 = null;
        long stackIn_6_2 = 0L;
        vh stackIn_6_3 = null;
        vh stackIn_7_0 = null;
        vh stackIn_7_1 = null;
        long stackIn_7_2 = 0L;
        vh stackIn_7_3 = null;
        vh stackIn_8_0 = null;
        vh stackIn_8_1 = null;
        long stackIn_8_2 = 0L;
        vh stackIn_8_3 = null;
        String stackIn_8_4 = null;
        vh stackOut_5_0 = null;
        vh stackOut_5_1 = null;
        long stackOut_5_2 = 0L;
        vh stackOut_5_3 = null;
        vh stackOut_7_0 = null;
        vh stackOut_7_1 = null;
        long stackOut_7_2 = 0L;
        vh stackOut_7_3 = null;
        String stackOut_7_4 = null;
        vh stackOut_6_0 = null;
        vh stackOut_6_1 = null;
        long stackOut_6_2 = 0L;
        vh stackOut_6_3 = null;
        String stackOut_6_4 = null;
        var21 = Pool.field_O;
        ln.field_r = param1;
        ir.field_p = param12;
        tq.field_u = param13;
        dg.field_T = param11;
        ck.field_R = param10;
        mj.field_c = param0;
        wp.field_f = param2;
        ta.field_d = param7;
        gr.field_E = param5;
        ji.field_g = param8;
        jl.field_d = param6;
        cr.field_l = param9;
        uk.field_i = aj.a(0, "lobby", param14, "gameprivacy");
        c.field_c = aj.a(0, "lobby", param14, "ratedgame");
        iq.field_a = aj.a(0, "lobby", param14, "opentome");
        hh.field_f = aj.a(0, "lobby", param14, "allowspectators");
        pn.field_i = new String[5];
        pn.field_i[4] = oq.field_D;
        pn.field_i[2] = lq.field_O;
        pn.field_i[0] = ab.field_c;
        pn.field_i[1] = ua.field_m;
        pn.field_i[3] = hf.field_b;
        c.field_e = new vh(0L, (vh) null);
        d.field_f = new vh(0L, lf.field_d, jh.field_g);
        if (param4 > 59) {
          L0: {
            kj.field_a = new vh(0L, sd.field_Q, wi.field_c);
            ci.field_c = new of(0L, new vh(0L, (vh) null), ub.field_n, iq.field_f);
            c.field_e.a(116, d.field_f);
            if (tq.field_p) {
              c.field_e.a(-94, kj.field_a);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            c.field_e.a(-113, (vh) (Object) ci.field_c);
            ci.field_c.field_Sb.a((byte) -87, uo.field_Lb);
            ci.field_c.field_Sb.field_cb = 1;
            var23 = ci.field_c.field_Sb;
            var24 = var23;
            var24.field_Fb = 1;
            pm.field_m = new vh(0L, uo.field_Lb);
            pm.field_m.field_Fb = 1;
            gj.field_K = new vh(0L, tg.field_d, wp.field_b.toUpperCase());
            ll.field_d = new vh(0L, rl.field_d, vl.field_s.toUpperCase());
            pk.field_a = new vh(0L, ri.field_P);
            wk.field_N = new vh(0L, lf.field_d, wi.field_b);
            pp.field_c = new vh(0L, f.field_e, mb.field_d);
            ac.field_p = new vh(0L, f.field_e, a.field_c);
            mm.field_g = new vh(0L, f.field_e, ol.field_b);
            mn.field_e = new vh(0L, f.field_e, n.field_T);
            l.field_f = new vh(0L, sd.field_Q, ml.field_f);
            vb.field_m = new of(0L, new vh(0L, (vh) null), ub.field_n, iq.field_f);
            field_f = new vh(0L, mg.field_c, fc.field_a.toUpperCase());
            field_f.field_pb = tq.field_p;
            stackOut_5_0 = null;
            stackOut_5_1 = null;
            stackOut_5_2 = 0L;
            stackOut_5_3 = mg.field_c;
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_7_2 = stackOut_5_2;
            stackIn_7_3 = stackOut_5_3;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            stackIn_6_2 = stackOut_5_2;
            stackIn_6_3 = stackOut_5_3;
            if (tq.field_p) {
              stackOut_7_0 = null;
              stackOut_7_1 = null;
              stackOut_7_2 = stackIn_7_2;
              stackOut_7_3 = (vh) (Object) stackIn_7_3;
              stackOut_7_4 = lh.field_e;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              stackIn_8_3 = stackOut_7_3;
              stackIn_8_4 = stackOut_7_4;
              break L1;
            } else {
              stackOut_6_0 = null;
              stackOut_6_1 = null;
              stackOut_6_2 = stackIn_6_2;
              stackOut_6_3 = (vh) (Object) stackIn_6_3;
              stackOut_6_4 = ch.field_L;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              stackIn_8_3 = stackOut_6_3;
              stackIn_8_4 = stackOut_6_4;
              break L1;
            }
          }
          L2: {
            uc.field_b = new vh(stackIn_8_2, stackIn_8_3, ((String) (Object) stackIn_8_4).toUpperCase());
            oi.field_n = new vh(0L, (vh) null);
            oi.field_n.a(65, ll.field_d);
            oi.field_n.a(-93, pk.field_a);
            pk.field_a.a(78, wk.field_N);
            pk.field_a.a(-106, pp.field_c);
            pk.field_a.a(19, ac.field_p);
            if (tq.field_p) {
              pk.field_a.a(119, mm.field_g);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            pk.field_a.a(-117, mn.field_e);
            pk.field_a.a(104, l.field_f);
            pk.field_a.a(-127, (vh) (Object) vb.field_m);
            if (!tq.field_p) {
              break L3;
            } else {
              oi.field_n.a(-97, field_f);
              break L3;
            }
          }
          L4: {
            oi.field_n.a(-96, uc.field_b);
            t.field_b = new vh(0L, uo.field_Lb);
            t.field_b.field_Fb = 1;
            t.field_b.field_cb = 0;
            sb.field_a = new vh(0L, rp.field_d, wn.field_c.toUpperCase());
            ln.field_q = new vh(0L, tq.field_m);
            ln.field_q.a(52, t.field_b);
            ln.field_q.a(-124, sb.field_a);
            v.field_j = new vh(0L, ub.field_n);
            v.field_j.a((byte) -87, uo.field_Lb);
            v.field_j.field_cb = 1;
            var16 = v.field_j;
            var16.field_Fb = 1;
            cl.field_d = new vh(0L, (vh) null);
            nd.field_c = new vh(0L, uo.field_Lb);
            nd.field_c.field_Fb = 1;
            br.field_M = new vh(0L, lf.field_d, jh.field_g);
            jh.field_a = new vh(0L, sd.field_Q, wi.field_c);
            wo.field_f = new of(0L, new vh(0L, (vh) null), ub.field_n, iq.field_f);
            cl.field_d.a(-119, nd.field_c);
            cl.field_d.a(-104, br.field_M);
            if (!tq.field_p) {
              break L4;
            } else {
              cl.field_d.a(9, jh.field_a);
              break L4;
            }
          }
          cl.field_d.a(-109, (vh) (Object) wo.field_f);
          ok.field_ob = new vh(0L, tg.field_d, dk.field_g.toUpperCase());
          ii.field_e = new vh(0L, rl.field_d);
          rq.field_x = new vh(0L, ri.field_P);
          oi.field_q = new vh(0L, bh.field_b, gr.field_D.toUpperCase());
          oi.field_v = new vh[4 + param3];
          mc.field_f = new uo[param3 - -4][];
          oi.field_v[0] = new vh(0L, kq.field_a, fr.field_q);
          mc.field_f[0] = new uo[6];
          var17_int = 0;
          L5: while (true) {
            L6: {
              if (var17_int >= 5) {
                break L6;
              } else {
                mc.field_f[0][1 + var17_int] = new uo(0L, ef.field_c, (vh) null, ei.field_A, uk.field_i[var17_int], pn.field_i[var17_int]);
                var17_int++;
                if (0 == 0) {
                  continue L5;
                } else {
                  break L6;
                }
              }
            }
            L7: {
              if (-3 >= (dg.field_T.length ^ -1)) {
                oi.field_v[1] = new vh(0L, kq.field_a, ab.field_h);
                mc.field_f[1] = new uo[dg.field_T.length - -1];
                mc.field_f[1][0] = new uo(0L, ef.field_c, (vh) null, ei.field_A, (dd) null, mq.field_b);
                var17_int = 0;
                L8: while (true) {
                  if (dg.field_T.length <= var17_int) {
                    break L7;
                  } else {
                    mc.field_f[1][1 + var17_int] = new uo(0L, ef.field_c, (vh) null, ei.field_A, (dd) null, Integer.toString(dg.field_T[var17_int]));
                    var17_int++;
                    if (0 == 0) {
                      continue L8;
                    } else {
                      break L7;
                    }
                  }
                }
              } else {
                break L7;
              }
            }
            L9: {
              oi.field_v[2] = new vh(0L, kq.field_a, ve.field_o);
              mc.field_f[2] = new uo[3];
              if (1 < ji.field_g) {
                oi.field_v[3] = new vh(0L, kq.field_a, pk.field_c);
                mc.field_f[3] = new uo[1 + ji.field_g];
                mc.field_f[3][0] = new uo(0L, ef.field_c, (vh) null, ei.field_A, (dd) null, mq.field_b);
                var17_int = 0;
                L10: while (true) {
                  if (var17_int >= ji.field_g) {
                    break L9;
                  } else {
                    mc.field_f[3][var17_int - -1] = new uo(0L, ef.field_c, (vh) null, ei.field_A, (dd) null, ln.field_r[var17_int]);
                    var17_int++;
                    if (0 == 0) {
                      continue L10;
                    } else {
                      break L9;
                    }
                  }
                }
              } else {
                break L9;
              }
            }
            var17_int = 0;
            L11: while (true) {
              L12: {
                if (param3 <= var17_int) {
                  break L12;
                } else {
                  oi.field_v[var17_int + 4] = new vh(0L, kq.field_a, ck.field_R[var17_int]);
                  mc.field_f[4 - -var17_int] = new uo[rb.b(255, (int) gr.field_E[var17_int]) - -1];
                  mc.field_f[4 - -var17_int][0] = new uo(0L, ef.field_c, (vh) null, ei.field_A, (dd) null, mq.field_b);
                  var18 = 0;
                  L13: while (true) {
                    L14: {
                      if (var18 >= (255 & gr.field_E[var17_int])) {
                        break L14;
                      } else {
                        L15: {
                          if (null == jl.field_d) {
                            var19_ref = null;
                            break L15;
                          } else {
                            if (jl.field_d[var17_int] == null) {
                              var19_ref = null;
                              break L15;
                            } else {
                              var19_ref = (Object) (Object) jl.field_d[var17_int][var18];
                              break L15;
                            }
                          }
                        }
                        L16: {
                          if (mj.field_c != null) {
                            if (mj.field_c[var17_int] == null) {
                              var20 = null;
                              break L16;
                            } else {
                              var20 = (Object) (Object) mj.field_c[var17_int][var18];
                              break L16;
                            }
                          } else {
                            var20 = null;
                            break L16;
                          }
                        }
                        mc.field_f[4 + var17_int][1 + var18] = new uo(0L, ef.field_c, (vh) null, ei.field_A, (dd) var19_ref, (String) var20);
                        var18++;
                        if (0 == 0) {
                          continue L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    var17_int++;
                    if (0 == 0) {
                      continue L11;
                    } else {
                      break L12;
                    }
                  }
                }
              }
              var17_int = 0;
              L17: while (true) {
                L18: {
                  if (4 + param3 <= var17_int) {
                    break L18;
                  } else {
                    L19: {
                      if (oi.field_v[var17_int] != null) {
                        oi.field_v[var17_int].field_M = 11;
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    L20: {
                      if (null != mc.field_f[var17_int]) {
                        var18 = 0;
                        L21: while (true) {
                          if (mc.field_f[var17_int].length <= var18) {
                            break L20;
                          } else {
                            L22: {
                              if (mc.field_f[var17_int][var18] == null) {
                                break L22;
                              } else {
                                if (mc.field_f[var17_int][var18].field_Pb != null) {
                                  mc.field_f[var17_int][var18].field_Pb.field_M = 11;
                                  break L22;
                                } else {
                                  break L22;
                                }
                              }
                            }
                            var18++;
                            if (0 == 0) {
                              continue L21;
                            } else {
                              break L20;
                            }
                          }
                        }
                      } else {
                        break L20;
                      }
                    }
                    var17_int++;
                    if (0 == 0) {
                      continue L17;
                    } else {
                      break L18;
                    }
                  }
                }
                kc.field_b = new vh(0L, mg.field_c);
                d.field_c = new vh(0L, mg.field_c);
                gi.field_o = new vh(0L, pa.field_M);
                gi.field_o.a((byte) -87, uo.field_Lb);
                var17 = gi.field_o;
                gi.field_o.field_cb = 1;
                var17.field_Fb = 1;
                uq.field_f = new vh(0L, (vh) null);
                uq.field_f.a(65, ii.field_e);
                uq.field_f.a(-111, rq.field_x);
                rq.field_x.a(12, oi.field_q);
                var18 = 0;
                L23: while (true) {
                  L24: {
                    if (var18 >= 4 + param3) {
                      break L24;
                    } else {
                      L25: {
                        L26: {
                          if (1 != var18) {
                            break L26;
                          } else {
                            if (dg.field_T.length < 2) {
                              break L25;
                            } else {
                              break L26;
                            }
                          }
                        }
                        L27: {
                          if (3 != var18) {
                            break L27;
                          } else {
                            if (1 < ji.field_g) {
                              break L27;
                            } else {
                              if (0 == 0) {
                                break L25;
                              } else {
                                break L27;
                              }
                            }
                          }
                        }
                        rq.field_x.a(92, oi.field_v[var18]);
                        var19 = 0;
                        L28: while (true) {
                          if (mc.field_f[var18].length <= var19) {
                            break L25;
                          } else {
                            L29: {
                              if (mc.field_f[var18][var19] == null) {
                                break L29;
                              } else {
                                rq.field_x.a(37, (vh) (Object) mc.field_f[var18][var19]);
                                break L29;
                              }
                            }
                            var19++;
                            if (0 == 0) {
                              continue L28;
                            } else {
                              break L25;
                            }
                          }
                        }
                      }
                      var18++;
                      if (0 == 0) {
                        continue L23;
                      } else {
                        break L24;
                      }
                    }
                  }
                  uq.field_f.a(-120, kc.field_b);
                  uq.field_f.a(-117, d.field_c);
                  uq.field_f.a(-121, gi.field_o);
                  Pool.field_P = new vh(0L, dg.field_J, v.field_d.toUpperCase());
                  ba.field_vb = new vh(0L, rp.field_d, th.field_f.toUpperCase());
                  return;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0) {
        Object var2 = null;
        InterruptedException var2_ref = null;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        ((rn) this).field_j = true;
        var2 = (Object) (Object) ((rn) this).field_c;
        synchronized (var2) {
          L0: {
            ((Object) (Object) ((rn) this).field_c).notifyAll();
            break L0;
          }
        }
        try {
          L1: {
            L2: {
              ((rn) this).field_i.join();
              if (param0 == -11307) {
                break L2;
              } else {
                ((rn) this).field_e = -90;
                break L2;
              }
            }
            break L1;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
            break L3;
          }
        }
        ((rn) this).field_i = null;
    }

    final dg a(byte[] param0, np param1, byte param2, int param3) {
        dg var5 = new dg();
        var5.field_N = 2;
        var5.field_Q = param0;
        var5.field_R = param1;
        var5.field_x = false;
        var5.field_m = (long)param3;
        int var6 = -13 / ((-21 - param2) / 57);
        this.a(var5, -19789);
        return var5;
    }

    public static void b(int param0) {
        if (param0 != 10) {
            field_a = null;
        }
        field_a = null;
        field_g = null;
        field_h = null;
        field_f = null;
    }

    rn(sj param0) {
        ((rn) this).field_c = new wo();
        ((rn) this).field_j = false;
        ((rn) this).field_e = 0;
        le var2 = param0.a(90, 5, (Runnable) this);
        while (0 == var2.field_f) {
            cf.a(-78, 10L);
        }
        if (var2.field_f == 2) {
            throw new RuntimeException();
        }
        ((rn) this).field_i = (Thread) var2.field_e;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"Eight-ball Pool: Basics", "Eight-ball Pool: What is a Foul?", "Eight-ball Pool: Fouls", "Nine-ball Pool: Basics", "Time Trial Pool", "Killer Pool", "Controls: Camera", "Controls: Shot Mode", "Tips", "Glossary"};
        field_h = "<%0> wants to draw.";
    }
}
