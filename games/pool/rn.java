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
        dg var4 = null;
        RuntimeException var4_ref = null;
        dg stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        dg stackOut_2_0 = null;
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
              var4 = new dg();
              var4.field_x = false;
              var4.field_N = 3;
              var4.field_m = (long)param2;
              var4.field_R = param1;
              int discarded$2 = -19789;
              this.a(var4);
              if (param0 == 58) {
                break L1;
              } else {
                ((rn) this).field_c = null;
                break L1;
              }
            }
            stackOut_2_0 = (dg) var4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4_ref;
            stackOut_4_1 = new StringBuilder().append("rn.E(").append(param0).append(',');
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
          throw wm.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final dg a(int param0, np param1, int param2) {
        dg var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        Object var6 = null;
        dg var7 = null;
        Throwable var8 = null;
        int var9 = 0;
        dg stackIn_9_0 = null;
        dg stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        Throwable decompiledCaughtException = null;
        dg stackOut_8_0 = null;
        dg stackOut_15_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var9 = Pool.field_O;
        try {
          L0: {
            var4 = new dg();
            var4.field_N = 1;
            var5 = 2 / ((10 - param0) / 52);
            var6 = (Object) (Object) ((rn) this).field_c;
            synchronized (var6) {
              L1: {
                var7 = (dg) (Object) ((rn) this).field_c.a((byte) 110);
                L2: while (true) {
                  if (var7 == null) {
                    break L1;
                  } else {
                    L3: {
                      if (var7.field_m != (long)param2) {
                        break L3;
                      } else {
                        if (param1 != var7.field_R) {
                          break L3;
                        } else {
                          if (2 == var7.field_N) {
                            var4.field_F = false;
                            var4.field_Q = var7.field_Q;
                            stackOut_8_0 = (dg) var4;
                            stackIn_9_0 = stackOut_8_0;
                            return stackIn_9_0;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    var7 = (dg) (Object) ((rn) this).field_c.b((byte) -97);
                    continue L2;
                  }
                }
              }
            }
            var4.field_Q = param1.a((byte) -110, param2);
            var4.field_F = false;
            var4.field_x = true;
            stackOut_15_0 = (dg) var4;
            stackIn_16_0 = stackOut_15_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4_ref;
            stackOut_17_1 = new StringBuilder().append("rn.D(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param2 + ')');
        }
        return stackIn_16_0;
    }

    private final void a(dg param0) {
        Object var3 = null;
        RuntimeException var3_ref = null;
        Throwable var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            var3 = (Object) (Object) ((rn) this).field_c;
            synchronized (var3) {
              L1: {
                ((rn) this).field_c.a((rg) (Object) param0, false);
                ((rn) this).field_e = ((rn) this).field_e + 1;
                ((Object) (Object) ((rn) this).field_c).notifyAll();
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3_ref;
            stackOut_6_1 = new StringBuilder().append("rn.C(");
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
          throw wm.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + -19789 + ')');
        }
    }

    public final void run() {
        try {
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
                      {
                        L2: {
                          ((Object) (Object) ((rn) this).field_c).wait();
                          break L2;
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

    final static void a(int param0, int param1, boolean param2, int param3, boolean param4, boolean param5, boolean param6, boolean param7) {
        kk.field_B = null;
        int discarded$0 = 4;
        or.c();
        int discarded$1 = 15;
        int discarded$2 = 33;
        param6 = wi.a(14, 11, 0, 13, param6);
        int discarded$3 = 11;
        mp.a(param1, param6, 16777215, 16777215, param5, 13375, true, param4, param7);
        int var14 = -36;
        hr.a(param4, -108, param1);
        int discarded$4 = 0;
        int discarded$5 = 0;
        lq.a(param1, param6);
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
        vh stackIn_5_0 = null;
        vh stackIn_5_1 = null;
        long stackIn_5_2 = 0L;
        vh stackIn_5_3 = null;
        vh stackIn_6_0 = null;
        vh stackIn_6_1 = null;
        long stackIn_6_2 = 0L;
        vh stackIn_6_3 = null;
        vh stackIn_7_0 = null;
        vh stackIn_7_1 = null;
        long stackIn_7_2 = 0L;
        vh stackIn_7_3 = null;
        String stackIn_7_4 = null;
        vh stackOut_4_0 = null;
        vh stackOut_4_1 = null;
        long stackOut_4_2 = 0L;
        vh stackOut_4_3 = null;
        vh stackOut_6_0 = null;
        vh stackOut_6_1 = null;
        long stackOut_6_2 = 0L;
        vh stackOut_6_3 = null;
        String stackOut_6_4 = null;
        vh stackOut_5_0 = null;
        vh stackOut_5_1 = null;
        long stackOut_5_2 = 0L;
        vh stackOut_5_3 = null;
        String stackOut_5_4 = null;
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
        ji.field_g = 1;
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
          stackOut_4_0 = null;
          stackOut_4_1 = null;
          stackOut_4_2 = 0L;
          stackOut_4_3 = mg.field_c;
          stackIn_6_0 = stackOut_4_0;
          stackIn_6_1 = stackOut_4_1;
          stackIn_6_2 = stackOut_4_2;
          stackIn_6_3 = stackOut_4_3;
          stackIn_5_0 = stackOut_4_0;
          stackIn_5_1 = stackOut_4_1;
          stackIn_5_2 = stackOut_4_2;
          stackIn_5_3 = stackOut_4_3;
          if (tq.field_p) {
            stackOut_6_0 = null;
            stackOut_6_1 = null;
            stackOut_6_2 = stackIn_6_2;
            stackOut_6_3 = (vh) (Object) stackIn_6_3;
            stackOut_6_4 = lh.field_e;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            stackIn_7_2 = stackOut_6_2;
            stackIn_7_3 = stackOut_6_3;
            stackIn_7_4 = stackOut_6_4;
            break L1;
          } else {
            stackOut_5_0 = null;
            stackOut_5_1 = null;
            stackOut_5_2 = stackIn_5_2;
            stackOut_5_3 = (vh) (Object) stackIn_5_3;
            stackOut_5_4 = ch.field_L;
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_7_2 = stackOut_5_2;
            stackIn_7_3 = stackOut_5_3;
            stackIn_7_4 = stackOut_5_4;
            break L1;
          }
        }
        L2: {
          uc.field_b = new vh(stackIn_7_2, stackIn_7_3, ((String) (Object) stackIn_7_4).toUpperCase());
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
          if (var17_int >= 5) {
            L6: {
              if (dg.field_T.length >= 2) {
                oi.field_v[1] = new vh(0L, kq.field_a, ab.field_h);
                mc.field_f[1] = new uo[dg.field_T.length - -1];
                mc.field_f[1][0] = new uo(0L, ef.field_c, (vh) null, ei.field_A, (dd) null, mq.field_b);
                var17_int = 0;
                L7: while (true) {
                  if (dg.field_T.length <= var17_int) {
                    break L6;
                  } else {
                    mc.field_f[1][1 + var17_int] = new uo(0L, ef.field_c, (vh) null, ei.field_A, (dd) null, Integer.toString(dg.field_T[var17_int]));
                    var17_int++;
                    continue L7;
                  }
                }
              } else {
                break L6;
              }
            }
            L8: {
              oi.field_v[2] = new vh(0L, kq.field_a, ve.field_o);
              mc.field_f[2] = new uo[3];
              if (1 < ji.field_g) {
                oi.field_v[3] = new vh(0L, kq.field_a, pk.field_c);
                mc.field_f[3] = new uo[1 + ji.field_g];
                mc.field_f[3][0] = new uo(0L, ef.field_c, (vh) null, ei.field_A, (dd) null, mq.field_b);
                var17_int = 0;
                L9: while (true) {
                  if (var17_int >= ji.field_g) {
                    break L8;
                  } else {
                    mc.field_f[3][var17_int - -1] = new uo(0L, ef.field_c, (vh) null, ei.field_A, (dd) null, ln.field_r[var17_int]);
                    var17_int++;
                    continue L9;
                  }
                }
              } else {
                break L8;
              }
            }
            var17_int = 0;
            L10: while (true) {
              if (param3 <= var17_int) {
                var17_int = 0;
                L11: while (true) {
                  if (4 + param3 <= var17_int) {
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
                    L12: while (true) {
                      if (var18 >= 4 + param3) {
                        uq.field_f.a(-120, kc.field_b);
                        uq.field_f.a(-117, d.field_c);
                        uq.field_f.a(-121, gi.field_o);
                        Pool.field_P = new vh(0L, dg.field_J, v.field_d.toUpperCase());
                        ba.field_vb = new vh(0L, rp.field_d, th.field_f.toUpperCase());
                        return;
                      } else {
                        L13: {
                          L14: {
                            if (1 != var18) {
                              break L14;
                            } else {
                              if (dg.field_T.length < 2) {
                                break L13;
                              } else {
                                break L14;
                              }
                            }
                          }
                          L15: {
                            if (3 != var18) {
                              break L15;
                            } else {
                              if (1 < ji.field_g) {
                                break L15;
                              } else {
                                break L13;
                              }
                            }
                          }
                          rq.field_x.a(92, oi.field_v[var18]);
                          var19 = 0;
                          L16: while (true) {
                            if (mc.field_f[var18].length <= var19) {
                              break L13;
                            } else {
                              L17: {
                                if (mc.field_f[var18][var19] == null) {
                                  break L17;
                                } else {
                                  rq.field_x.a(37, (vh) (Object) mc.field_f[var18][var19]);
                                  break L17;
                                }
                              }
                              var19++;
                              continue L16;
                            }
                          }
                        }
                        var18++;
                        continue L12;
                      }
                    }
                  } else {
                    L18: {
                      if (oi.field_v[var17_int] != null) {
                        oi.field_v[var17_int].field_M = 11;
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    L19: {
                      if (null != mc.field_f[var17_int]) {
                        var18 = 0;
                        L20: while (true) {
                          if (mc.field_f[var17_int].length <= var18) {
                            break L19;
                          } else {
                            L21: {
                              if (mc.field_f[var17_int][var18] == null) {
                                break L21;
                              } else {
                                break L21;
                              }
                            }
                            var18++;
                            continue L20;
                          }
                        }
                      } else {
                        break L19;
                      }
                    }
                    var17_int++;
                    continue L11;
                  }
                }
              } else {
                oi.field_v[var17_int + 4] = new vh(0L, kq.field_a, ck.field_R[var17_int]);
                mc.field_f[4 - -var17_int] = new uo[rb.b(255, (int) gr.field_E[var17_int]) - -1];
                mc.field_f[4 - -var17_int][0] = new uo(0L, ef.field_c, (vh) null, ei.field_A, (dd) null, mq.field_b);
                var18 = 0;
                L22: while (true) {
                  if (var18 >= (255 & gr.field_E[var17_int])) {
                    var17_int++;
                    continue L10;
                  } else {
                    L23: {
                      if (null == jl.field_d) {
                        var19_ref = null;
                        break L23;
                      } else {
                        if (jl.field_d[var17_int] == null) {
                          var19_ref = null;
                          break L23;
                        } else {
                          var19_ref = (Object) (Object) jl.field_d[var17_int][var18];
                          break L23;
                        }
                      }
                    }
                    L24: {
                      if (mj.field_c != null) {
                        if (mj.field_c[var17_int] == null) {
                          var20 = null;
                          break L24;
                        } else {
                          var20 = (Object) (Object) mj.field_c[var17_int][var18];
                          break L24;
                        }
                      } else {
                        var20 = null;
                        break L24;
                      }
                    }
                    mc.field_f[4 + var17_int][1 + var18] = new uo(0L, ef.field_c, (vh) null, ei.field_A, (dd) var19_ref, (String) var20);
                    var18++;
                    continue L22;
                  }
                }
              }
            }
          } else {
            mc.field_f[0][1 + var17_int] = new uo(0L, ef.field_c, (vh) null, ei.field_A, uk.field_i[var17_int], pn.field_i[var17_int]);
            var17_int++;
            continue L5;
          }
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
        dg var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        dg stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        dg stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var5 = new dg();
            var5.field_N = 2;
            var5.field_Q = param0;
            var5.field_R = param1;
            var5.field_x = false;
            var5.field_m = (long)param3;
            var6 = -13 / ((-21 - param2) / 57);
            int discarded$2 = -19789;
            this.a(var5);
            stackOut_0_0 = (dg) var5;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5_ref;
            stackOut_2_1 = new StringBuilder().append("rn.H(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
          throw wm.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_1_0;
    }

    public static void b() {
        field_a = null;
        field_g = null;
        field_h = null;
        field_f = null;
    }

    rn(sj param0) {
        le var2 = null;
        ((rn) this).field_c = new wo();
        ((rn) this).field_j = false;
        ((rn) this).field_e = 0;
        try {
            var2 = param0.a(90, 5, (Runnable) this);
            while (0 == var2.field_f) {
                cf.a(-78, 10L);
            }
            if (var2.field_f == 2) {
                throw new RuntimeException();
            }
            ((rn) this).field_i = (Thread) var2.field_e;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "rn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"Eight-ball Pool: Basics", "Eight-ball Pool: What is a Foul?", "Eight-ball Pool: Fouls", "Nine-ball Pool: Basics", "Time Trial Pool", "Killer Pool", "Controls: Camera", "Controls: Shot Mode", "Tips", "Glossary"};
        field_h = "<%0> wants to draw.";
    }
}
