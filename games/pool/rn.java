/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new dg();
          var4.field_x = false;
          var4.field_N = 3;
          var4.field_m = (long)param2;
          var4.field_R = param1;
          this.a(var4, -19789);
          if (param0 != 58) {
            this.field_c = (wo) null;
          }
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("rn.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    final dg a(int param0, np param1, int param2) {
        dg var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        Object var6 = null;
        dg var7 = null;
        int var9 = 0;
        dg stackIn_9_0 = null;
        dg stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        Throwable decompiledCaughtException = null;
        var9 = Pool.field_O;
        try {
          var4 = new dg();
          var4.field_N = 1;
          var5 = 2 / ((10 - param0) / 52);
          var6 = this.field_c;
          synchronized (var6) {
            var7 = (dg) (this.field_c.a((byte) 110));
            while (var7 != null) {
              if (var7.field_m == (long)param2 &&
                param1 == var7.field_R &&
                2 == var7.field_N) {
                var4.field_F = false;
                var4.field_Q = var7.field_Q;
                stackIn_9_0 = var4;
                return stackIn_9_0;
              }
              var7 = (dg) (this.field_c.b((byte) -97));
            }
          }
          var4.field_Q = param1.a((byte) -110, param2);
          var4.field_F = false;
          var4.field_x = true;
          stackIn_16_0 = var4;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_19_0 = var4_ref;
          stackIn_19_1 = new StringBuilder().append("rn.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(dg param0, int param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        Object var3 = null;
        RuntimeException var3_ref = null;
        try {
          var3 = this.field_c;
          synchronized (var3) {
            this.field_c.a(param0, false);
            this.field_e = this.field_e + 1;
            this.field_c.notifyAll();
          }
          if (param1 != -19789) {
            this.run();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("rn.C(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void run() {
        try {
          InterruptedException interruptedException = null;
          Object var2 = null;
          int var5 = 0;
          dg var7 = null;
          int decompiledRegionSelector0 = 0;
          int decompiledRegionSelector1 = 0;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          String var6 = null;
          var5 = Pool.field_O;
          while (!this.field_j) {
            var2 = this.field_c;
            synchronized (var2) {
              var7 = (dg) (this.field_c.a(0));
              if (var7 == null) {
                try {
                  this.field_c.wait();
                } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                }
                decompiledRegionSelector0 = 0;
              } else {
                this.field_e = this.field_e - 1;
                decompiledRegionSelector0 = 1;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              continue;
            }
            try {
              boolean decompiledFrameRemainder0 = true;
              if (2 != var7.field_N) {
                if (var7.field_N != 3) {
                  decompiledRegionSelector1 = 1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  var7.field_Q = var7.field_R.a((byte) -110, (int)var7.field_m);
                  var7.field_F = false;
                }
              } else {
                var7.field_R.a((int)var7.field_m, -12875, var7.field_Q.length, var7.field_Q);
                var7.field_F = false;
              }
              if (decompiledFrameRemainder0) {
                decompiledRegionSelector1 = 0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var6 = (String) null;
              tc.a((Throwable) ((Object) var2_ref), (String) null, -8555);
              decompiledRegionSelector1 = 1;
            }
            if (decompiledRegionSelector1 == 0) {
              continue;
            }
            var7.field_F = false;
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
        int var14 = 36 / ((param12 + 84) / 37);
        hr.a(param4, -108, param1);
        lq.a(param1, param6, 0, param11);
    }

    final static void a(String[][] param0, String[] param1, String[] param2, int param3, byte param4, byte[] param5, dd[][] param6, dd[][] param7, int param8, int param9, String[] param10, int[] param11, String[][] param12, byte[] param13, di param14) {
        uo[] array$0 = null;
        uo[] array$1 = null;
        uo[] array$2 = null;
        int var19 = 0;
        vh stackIn_8_0;
        vh stackIn_8_1;
        long stackIn_8_2;
        vh stackIn_8_3;
        vh stackIn_9_0 = null;
        vh stackIn_9_1 = null;
        String stackIn_9_4 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_84_2 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_87_2 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_90_2 = null;
        StringBuilder stackIn_92_1 = null;
        String stackIn_93_2 = null;
        StringBuilder stackIn_95_1 = null;
        String stackIn_96_2 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_99_2 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_102_2 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_105_2 = null;
        StringBuilder stackIn_107_1 = null;
        String stackIn_108_2 = null;
        StringBuilder stackIn_110_1 = null;
        String stackIn_111_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15 = null;
        vh var16 = null;
        int var17_int = 0;
        vh var17 = null;
        int var18 = 0;
        Object var19_ref = null;
        Object var20 = null;
        int var21 = 0;
        vh var23 = null;
        vh var24 = null;
        int var18Lifetime1;
        int var18Lifetime2;
        int var17_intLifetime1;
        int var17_intLifetime2;
        int var17_intLifetime3;
        int var17_intLifetime4;
        var21 = Pool.field_O;
        try {
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
          if (param4 <= 59) {
            return;
          }
          kj.field_a = new vh(0L, sd.field_Q, wi.field_c);
          ci.field_c = new of(0L, new vh(0L, (vh) null), ub.field_n, iq.field_f);
          c.field_e.a(116, d.field_f);
          if (tq.field_p) {
            c.field_e.a(-94, kj.field_a);
          }
          c.field_e.a(-113, ci.field_c);
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
          stackIn_8_0 = null;
          stackIn_8_1 = null;
          stackIn_8_2 = 0L;
          stackIn_8_3 = mg.field_c;
          if (tq.field_p) {
            stackIn_9_0 = null;
            stackIn_9_1 = null;
            stackIn_9_4 = lh.field_e;
          } else {
            stackIn_9_0 = null;
            stackIn_9_1 = null;
            stackIn_9_4 = ch.field_L;
          }
          uc.field_b = new vh(stackIn_8_2, stackIn_8_3, ((String) (Object) stackIn_9_4).toUpperCase());
          oi.field_n = new vh(0L, (vh) null);
          oi.field_n.a(65, ll.field_d);
          oi.field_n.a(-93, pk.field_a);
          pk.field_a.a(78, wk.field_N);
          pk.field_a.a(-106, pp.field_c);
          pk.field_a.a(19, ac.field_p);
          if (tq.field_p) {
            pk.field_a.a(119, mm.field_g);
          }
          pk.field_a.a(-117, mn.field_e);
          pk.field_a.a(104, l.field_f);
          pk.field_a.a(-127, vb.field_m);
          if (tq.field_p) {
            oi.field_n.a(-97, field_f);
          }
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
          if (tq.field_p) {
            cl.field_d.a(9, jh.field_a);
          }
          cl.field_d.a(-109, wo.field_f);
          ok.field_ob = new vh(0L, tg.field_d, dk.field_g.toUpperCase());
          ii.field_e = new vh(0L, rl.field_d);
          rq.field_x = new vh(0L, ri.field_P);
          oi.field_q = new vh(0L, bh.field_b, gr.field_D.toUpperCase());
          oi.field_v = new vh[4 + param3];
          mc.field_f = new uo[param3 + 4][];
          oi.field_v[0] = new vh(0L, kq.field_a, fr.field_q);
          mc.field_f[0] = new uo[6];
          for (var17_int = 0; var17_int < 5; var17_int++) {
            mc.field_f[0][1 + var17_int] = new uo(0L, ef.field_c, (vh) null, ei.field_A, uk.field_i[var17_int], pn.field_i[var17_int]);
          }
          if (dg.field_T.length >= 2) {
            oi.field_v[1] = new vh(0L, kq.field_a, ab.field_h);
            array$0 = new uo[dg.field_T.length + 1];
            mc.field_f[1] = array$0;
            mc.field_f[1][0] = new uo(0L, ef.field_c, (vh) null, ei.field_A, (dd) null, mq.field_b);
            for (var17_intLifetime1 = 0; dg.field_T.length > var17_intLifetime1; var17_intLifetime1++) {
              mc.field_f[1][1 + var17_intLifetime1] = new uo(0L, ef.field_c, (vh) null, ei.field_A, (dd) null, Integer.toString(dg.field_T[var17_intLifetime1]));
            }
          }
          oi.field_v[2] = new vh(0L, kq.field_a, ve.field_o);
          mc.field_f[2] = new uo[]{new uo(0L, ef.field_c, (vh) null, ei.field_A, (dd) null, mq.field_b), new uo(0L, ef.field_c, (vh) null, ei.field_A, hh.field_f[0], mb.field_g), new uo(0L, ef.field_c, (vh) null, ei.field_A, hh.field_f[1], rm.field_f)};
          if (1 < ji.field_g) {
            oi.field_v[3] = new vh(0L, kq.field_a, pk.field_c);
            array$1 = new uo[1 + ji.field_g];
            mc.field_f[3] = array$1;
            mc.field_f[3][0] = new uo(0L, ef.field_c, (vh) null, ei.field_A, (dd) null, mq.field_b);
            for (var17_intLifetime2 = 0; var17_intLifetime2 < ji.field_g; var17_intLifetime2++) {
              mc.field_f[3][var17_intLifetime2 + 1] = new uo(0L, ef.field_c, (vh) null, ei.field_A, (dd) null, ln.field_r[var17_intLifetime2]);
            }
          }
          for (var17_intLifetime3 = 0; param3 > var17_intLifetime3; var17_intLifetime3++) {
            oi.field_v[var17_intLifetime3 + 4] = new vh(0L, kq.field_a, ck.field_R[var17_intLifetime3]);
            array$2 = new uo[rb.b(255, (int) gr.field_E[var17_intLifetime3]) + 1];
            mc.field_f[4 + var17_intLifetime3] = array$2;
            mc.field_f[4 + var17_intLifetime3][0] = new uo(0L, ef.field_c, (vh) null, ei.field_A, (dd) null, mq.field_b);
            for (var18 = 0; var18 < (255 & gr.field_E[var17_intLifetime3]); var18++) {
              if (null == jl.field_d) {
                var19_ref = null;
              } else {
                if (jl.field_d[var17_intLifetime3] == null) {
                  var19_ref = null;
                } else {
                  var19_ref = jl.field_d[var17_intLifetime3][var18];
                }
              }
              if (mj.field_c != null) {
                if (mj.field_c[var17_intLifetime3] == null) {
                  var20 = null;
                } else {
                  var20 = mj.field_c[var17_intLifetime3][var18];
                }
              } else {
                var20 = null;
              }
              mc.field_f[4 + var17_intLifetime3][1 + var18] = new uo(0L, ef.field_c, (vh) null, ei.field_A, (dd) (var19_ref), (String) (var20));
            }
          }
          for (var17_intLifetime4 = 0; 4 + param3 > var17_intLifetime4; var17_intLifetime4++) {
            if (oi.field_v[var17_intLifetime4] != null) {
              oi.field_v[var17_intLifetime4].field_M = 11;
            }
            if (null != mc.field_f[var17_intLifetime4]) {
              for (var18Lifetime1 = 0; mc.field_f[var17_intLifetime4].length > var18Lifetime1; var18Lifetime1++) {
                if (mc.field_f[var17_intLifetime4][var18Lifetime1] != null &&
                  mc.field_f[var17_intLifetime4][var18Lifetime1].field_Pb != null) {
                  mc.field_f[var17_intLifetime4][var18Lifetime1].field_Pb.field_M = 11;
                }
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
          for (var18Lifetime2 = 0; var18Lifetime2 < 4 + param3; var18Lifetime2++) {
            if ((1 != var18Lifetime2 ||
              !(dg.field_T.length < 2)) && (3 != var18Lifetime2 ||
              !(1 >= ji.field_g))) {
              rq.field_x.a(92, oi.field_v[var18Lifetime2]);
              for (var19 = 0; mc.field_f[var18Lifetime2].length > var19; var19++) {
                if (mc.field_f[var18Lifetime2][var19] != null) {
                  rq.field_x.a(37, mc.field_f[var18Lifetime2][var19]);
                }
              }
            }
          }
          uq.field_f.a(-120, kc.field_b);
          uq.field_f.a(-117, d.field_c);
          uq.field_f.a(-121, gi.field_o);
          Pool.field_P = new vh(0L, dg.field_J, v.field_d.toUpperCase());
          ba.field_vb = new vh(0L, rp.field_d, th.field_f.toUpperCase());
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_80_0 = var15;
          stackIn_80_1 = new StringBuilder().append("rn.G(");
          if (param0 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          stackIn_83_1 = ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',');
          if (param1 == null) {
            stackIn_84_2 = "null";
          } else {
            stackIn_84_2 = "{...}";
          }
          stackIn_86_1 = ((StringBuilder) (Object) stackIn_83_1).append(stackIn_84_2).append(',');
          if (param2 == null) {
            stackIn_87_2 = "null";
          } else {
            stackIn_87_2 = "{...}";
          }
          stackIn_89_1 = ((StringBuilder) (Object) stackIn_86_1).append(stackIn_87_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_90_2 = "null";
          } else {
            stackIn_90_2 = "{...}";
          }
          stackIn_92_1 = ((StringBuilder) (Object) stackIn_89_1).append(stackIn_90_2).append(',');
          if (param6 == null) {
            stackIn_93_2 = "null";
          } else {
            stackIn_93_2 = "{...}";
          }
          stackIn_95_1 = ((StringBuilder) (Object) stackIn_92_1).append(stackIn_93_2).append(',');
          if (param7 == null) {
            stackIn_96_2 = "null";
          } else {
            stackIn_96_2 = "{...}";
          }
          stackIn_98_1 = ((StringBuilder) (Object) stackIn_95_1).append(stackIn_96_2).append(',').append(param8).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_99_2 = "null";
          } else {
            stackIn_99_2 = "{...}";
          }
          stackIn_101_1 = ((StringBuilder) (Object) stackIn_98_1).append(stackIn_99_2).append(',');
          if (param11 == null) {
            stackIn_102_2 = "null";
          } else {
            stackIn_102_2 = "{...}";
          }
          stackIn_104_1 = ((StringBuilder) (Object) stackIn_101_1).append(stackIn_102_2).append(',');
          if (param12 == null) {
            stackIn_105_2 = "null";
          } else {
            stackIn_105_2 = "{...}";
          }
          stackIn_107_1 = ((StringBuilder) (Object) stackIn_104_1).append(stackIn_105_2).append(',');
          if (param13 == null) {
            stackIn_108_2 = "null";
          } else {
            stackIn_108_2 = "{...}";
          }
          stackIn_110_1 = ((StringBuilder) (Object) stackIn_107_1).append(stackIn_108_2).append(',');
          if (param14 == null) {
            stackIn_111_2 = "null";
          } else {
            stackIn_111_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_110_1).append(stackIn_111_2).append(')').toString());
        }
    }

    final void a(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          InterruptedException var2_ref = null;
          this.field_j = true;
          var2 = this.field_c;
          synchronized (var2) {
            this.field_c.notifyAll();
          }
          try {
            this.field_i.join();
            if (param0 != -11307) {
              this.field_e = -90;
            }
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
          }
          this.field_i = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final dg a(byte[] param0, np param1, byte param2, int param3) {
        dg var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        dg stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new dg();
          var5.field_N = 2;
          var5.field_Q = param0;
          var5.field_R = param1;
          var5.field_x = false;
          var5.field_m = (long)param3;
          var6 = -13 / ((-21 - param2) / 57);
          this.a(var5, -19789);
          stackIn_1_0 = var5;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_4_0 = var5_ref;
          stackIn_4_1 = new StringBuilder().append("rn.H(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 != 10) {
          field_a = (String[]) null;
        }
        field_a = null;
        field_g = null;
        field_h = null;
        field_f = null;
    }

    rn(sj param0) {
        le var2 = null;
        this.field_c = new wo();
        this.field_j = false;
        this.field_e = 0;
        try {
          var2 = param0.a(90, 5, (Runnable) (this));
          while (0 == var2.field_f) {
            cf.a(-78, 10L);
          }
          if (var2.field_f == 2) {
            throw new RuntimeException();
          }
          this.field_i = (Thread) (var2.field_e);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "rn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = new String[]{"Eight-ball Pool: Basics", "Eight-ball Pool: What is a Foul?", "Eight-ball Pool: Fouls", "Nine-ball Pool: Basics", "Time Trial Pool", "Killer Pool", "Controls: Camera", "Controls: Shot Mode", "Tips", "Glossary"};
        field_h = "<%0> wants to draw.";
    }
}
