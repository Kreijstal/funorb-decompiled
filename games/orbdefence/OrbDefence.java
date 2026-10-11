/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class OrbDefence extends ph {
    static String field_C;
    static String field_E;
    public static boolean field_D;

    final void a(byte param0) {
        boolean discarded$0 = false;
        int stackIn_5_1 = 0;
        boolean stackIn_6_2 = false;
        boolean stackIn_31_1 = false;
        int var2;
        ha var3_ref_ha;
        int var3;
        int var4;
        int var2Lifetime1;
        var4 = field_D ? 1 : 0;
        lj.c(false);
        if (null != mg.field_k &&
          mg.field_k.field_e) {
          lb.a(true);
          ee.a(4);
        }
        stackIn_5_1 = 123;
        stackIn_6_2 = (mg.field_k != null);
        this.b(stackIn_5_1, stackIn_6_2);
        if (gi.field_b) {
          this.g((byte) -123);
          gi.field_b = false;
        }
        if (eg.c((byte) -126)) {
          this.c(false);
          if (eg.c((byte) -126)) {
            if (!fe.c((byte) -117)) {
              return;
            }
            discarded$0 = this.a(false, (byte) 97);
            return;
          }
        }
        if (!f.field_j) {
          vi.a(false, of.field_K);
          if (this.a(true, (byte) 97)) {
            f.field_j = true;
          }
        } else {
          if (!ad.a((byte) -72)) {
            em.b((byte) 118);
            if (ad.a((byte) -72)) {
              bg.a(-2027485778);
              ij.b(0);
              if (5 == kf.field_c &&
                dm.field_f == 0) {
                kf.field_c = 2;
                rh.a((byte) -96, 2, false);
              }
              if (rl.a((byte) 125)) {
                ud.a(8, bk.field_d, true, ob.field_I.field_B + ob.field_I.field_E, 6, 6, ob.field_I, ob.field_I.field_E, (byte) 5, 320, 240, qc.field_f);
              }
            }
          } else {
            if (!rl.a((byte) 106)) {
              if (ec.k(783)) {
                stackIn_31_1 = (null != mg.field_k);
                var2 = this.a(stackIn_31_1, false);
                if (var2 == 1 ||
                  var2 == 2) {
                  if (null != mg.field_k) {
                    lb.a(true);
                  }
                  if (2 == var2) {
                    ja.a(-106, uj.b((byte) -120));
                  }
                }
              } else {
                this.e(false);
              }
            } else {
              if (lc.field_r != 0) {
                this.e(false);
              } else {
                var2 = hi.i(0);
                if (var2 == 2) {
                  lb.a(true);
                } else {
                  if (var2 != 3) {
                    if (var2 == 4) {
                      n.a((byte) -110);
                    }
                  } else {
                    ud.a(8, bk.field_d, true, ob.field_I.field_E + ob.field_I.field_B, 6, 6, ob.field_I, ob.field_I.field_E, (byte) 5, 320, 240, qc.field_f);
                  }
                }
                if (!rl.a((byte) 114)) {
                  nc.field_cb[kf.field_c].a(true, (byte) 93);
                }
              }
            }
          }
        }
        var2Lifetime1 = -59 / ((54 - param0) / 39);
        if (!n.b((byte) -70)) {
          while (true) {
            var3_ref_ha = (ha) (pe.field_b.e(0));
            if (var3_ref_ha == null) {
              break;
            }
            f.a(4, var3_ref_ha, (byte) -4);
          }
        }
        while (uj.a(tg.field_b, -16)) {
          this.e((byte) -115);
        }
        bh.a(0, -1);
        if (sg.c(true)) {
          var3 = this.j(7);
          if (2 == var3) {
            md.b((byte) -121);
          }
        }
    }

    final static void d(boolean param0) {
        int var1_int = 0;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        var4 = field_D ? 1 : 0;
        try {
          if (param0) {
            field_C = (String) null;
          }
          wi.c();
          dk.field_c = new int[260];
          sf.field_O = 11;
          for (var1_int = 0; var1_int < 256; var1_int++) {
            var2 = 15.0;
            dk.field_c[var1_int] = (int)(Math.pow((double)((float)var1_int / 256.0f), var2) * 255.0);
          }
          var5 = 256;
          var1_intLifetime1 = var5;
          while (var5 < dk.field_c.length) {
            dk.field_c[var5] = 255;
            var5++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1), "OrbDefence.B(" + param0 + ')');
        }
    }

    private final void g(byte param0) {
        if (eg.field_x != null) {
          va.a(eg.field_x, (byte) 63);
          eg.field_x = null;
          vd.a(113);
        }
        bh.field_d = qk.a(4, -32585);
        pd.field_r = qk.a(5, -32585);
        kd.field_q = qk.a(6, -32585);
        ig.field_hb = qk.a(7, -32585);
        int var2 = 13 / ((-73 - param0) / 49);
        hl.field_N = qk.a(8, -32585);
        lg.field_c = qk.a(9, -32585);
        mc.a(j.field_b, -29608, tf.field_d);
    }

    final static void a(byte[] param0, byte param1) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_39_1 = 0;
        int stackIn_52_1 = 0;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_58_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] var9 = null;
        byte[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        mg var17 = null;
        mg var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        int stackIn_21_0Lifetime1;
        int stackIn_21_1Lifetime1;
        int stackIn_32_0Lifetime1;
        int stackIn_32_1Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var5Lifetime5;
        int var13Lifetime1;
        int var13Lifetime2;
        int var14Lifetime1;
        int var14Lifetime2;
        int var13Lifetime3;
        int stackIn_21_0Lifetime1Lifetime1;
        int stackIn_21_1Lifetime1Lifetime1;
        var16 = field_D ? 1 : 0;
        try {
          var17 = new mg(param0);
          var18 = var17;
          var18.field_i = param0.length - 2;
          ec.field_K = var18.j(98203176);
          ha.field_g = new boolean[ec.field_K];
          jd.field_g = new int[ec.field_K];
          m.field_a = new int[ec.field_K];
          wh.field_b = new int[ec.field_K];
          md.field_i = new byte[ec.field_K][];
          fl.field_a = new byte[ec.field_K][];
          wc.field_a = new int[ec.field_K];
          var18.field_i = param0.length - (7 + 8 * ec.field_K);
          sg.field_B = var18.j(98203176);
          var3 = -1 % ((-4 - param1) / 62);
          he.field_r = var18.j(98203176);
          var4 = (var18.b((byte) 90) & 255) + 1;
          for (var5 = 0; ec.field_K > var5; var5++) {
            jd.field_g[var5] = var17.j(98203176);
          }
          for (var5Lifetime1 = 0; var5Lifetime1 < ec.field_K; var5Lifetime1++) {
            wc.field_a[var5Lifetime1] = var18.j(98203176);
          }
          for (var5Lifetime2 = 0; ec.field_K > var5Lifetime2; var5Lifetime2++) {
            wh.field_b[var5Lifetime2] = var18.j(98203176);
          }
          for (var5Lifetime3 = 0; ec.field_K > var5Lifetime3; var5Lifetime3++) {
            m.field_a[var5Lifetime3] = var18.j(98203176);
          }
          var18.field_i = -(3 * (-1 + var4)) - 8 * ec.field_K + param0.length - 7;
          vc.field_g = new int[var4];
          var5Lifetime4 = 1;
          while (var5Lifetime4 < var4) {
            vc.field_g[var5Lifetime4] = var18.a((byte) -30);
            stackIn_21_0 = ~vc.field_g[var5Lifetime4];
            stackIn_21_1 = -1;
            if (stackIn_21_0 == stackIn_21_1) {
              vc.field_g[var5Lifetime4] = 1;
            }
            var5Lifetime4++;
          }
          var18.field_i = 0;
          var5Lifetime5 = 0;
          while (true) {
            stackIn_21_0Lifetime1 = ~var5Lifetime5;
            stackIn_21_1Lifetime1 = ~ec.field_K;
            if (stackIn_21_0Lifetime1 <= stackIn_21_1Lifetime1) {
              return;
            }
            {
              var6 = wh.field_b[var5Lifetime5];
              var7 = m.field_a[var5Lifetime5];
              var8 = var7 * var6;
              var21 = new byte[var8];
              var19 = var21;
              var9 = var19;
              fl.field_a[var5Lifetime5] = var21;
              var22 = new byte[var8];
              var20 = var22;
              var10 = var20;
              md.field_i[var5Lifetime5] = var22;
              var11 = 0;
              var12 = var18.b((byte) 90);
              if ((1 & var12) == 0) {
                for (var13 = 0; var8 > var13; var13++) {
                  var9[var13] = var18.d(-20398);
                }
                if (((var12 & 2) != 0)) {
                  for (var13Lifetime3 = 0; var13Lifetime3 < var8; var13Lifetime3++) {
                    dupTemp$0 = var18.d(-20398);
                    var10[var13Lifetime3] = dupTemp$0;
                    var14 = dupTemp$0;
                    stackIn_21_0Lifetime1Lifetime1 = var11;
                    stackIn_21_1Lifetime1Lifetime1 = ~var14;
                    if (stackIn_21_1Lifetime1Lifetime1 == 0) {
                      stackIn_52_1 = 0;
                    } else {
                      stackIn_52_1 = 1;
                    }
                    var11 = stackIn_21_0Lifetime1Lifetime1 | stackIn_52_1;
                  }
                }
              } else {
                for (var13Lifetime1 = 0; var6 > var13Lifetime1; var13Lifetime1++) {
                  for (var14Lifetime1 = 0; var7 > var14Lifetime1; var14Lifetime1++) {
                    var9[var13Lifetime1 + var14Lifetime1 * var6] = var18.d(-20398);
                  }
                }
                if ((2 & var12) != 0) {
                  var13Lifetime2 = 0;
                  while (true) {
                    stackIn_32_0 = var13Lifetime2;
                    stackIn_32_1 = var6;
                    if (stackIn_32_0 >= stackIn_32_1) {
                      break;
                    }
                    for (var14Lifetime2 = 0; var14Lifetime2 < var7; var14Lifetime2++) {
                      dupTemp$1 = var18.d(-20398);
                      var10[var14Lifetime2 * var6 + var13Lifetime2] = dupTemp$1;
                      var15 = dupTemp$1;
                      stackIn_32_0Lifetime1 = var11;
                      stackIn_32_1Lifetime1 = ~var15;
                      if (stackIn_32_1Lifetime1 == 0) {
                        stackIn_39_1 = 0;
                      } else {
                        stackIn_39_1 = 1;
                      }
                      var11 = stackIn_32_0Lifetime1 | stackIn_39_1;
                    }
                    var13Lifetime2++;
                  }
                }
              }
            }
            ha.field_g[var5Lifetime5] = var11 != 0;
            var5Lifetime5++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_57_0 = var2;
          stackIn_57_1 = new StringBuilder().append("OrbDefence.I(");
          if (param0 == null) {
            stackIn_58_2 = "null";
          } else {
            stackIn_58_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_57_0), ((StringBuilder) (Object) stackIn_57_1).append(stackIn_58_2).append(',').append(param1).append(')').toString());
        }
    }

    public OrbDefence() {
    }

    final void d(int param0) {
        am.a(-4062);
        if (param0 != 176400) {
          field_E = (String) null;
        }
        if (mg.field_k != null) {
          lb.a(true);
        }
        uj.c((byte) 63);
    }

    final void a(boolean param0) {
        OrbDefence.h((byte) -119);
        kg.c(96);
        im.a(9);
        wf.a(71);
        jm.a(-1178583839);
        qh.c(118);
        rl.b((byte) -126);
        uk.a(param0);
        ph.g(-97);
        ui.a(-10013);
        tf.b(13695);
        uj.c(0);
        gk.a(8);
        pe.b(121);
        ul.b();
        ki.a(false);
        kc.a();
        tc.a(true);
        n.c((byte) -87);
        mg.c(10);
        ji.a(-5046);
        nl.a((byte) -77);
        ce.a(true);
        bi.a((byte) 23);
        ld.a(false);
        bm.a(63);
        fm.a((byte) -64);
        vj.a((byte) 24);
        lf.a(117);
        og.a((byte) -123);
        wh.a(-122);
        na.a(-20008);
        aa.a((byte) -14);
        fh.a((byte) -27);
        l.b(124);
        ea.a(29967);
        jk.a((byte) 65);
        vd.b(13461);
        ja.c(-92);
        nk.c((byte) 15);
        ql.a((byte) 50);
        ge.a(1);
        vl.b(-122);
        pi.a(param0);
        dj.c((byte) 78);
        cb.a((byte) -95);
        ca.a(40);
        lj.d(116);
        mh.a(1);
        he.c(22);
        qi.a();
        jg.d(79);
        la.e();
        t.c(true);
        am.a((byte) 29);
        ml.a(true);
        pf.a(param0);
        lm.b(5);
        aj.a((byte) -94);
        fd.a(-32311);
        id.a((byte) -115);
        hd.a(100);
        le.a(1000000);
        jl.b((byte) 9);
        cj.b(1280);
        bg.a((byte) -107);
        ke.a((byte) -80);
        sk.m(-79);
        ig.r(11285);
        ve.f(false);
        pc.q(-1);
        dh.e((byte) -94);
        rf.c(!param0 ? true : false);
        pk.l(-100);
        el.c(!param0 ? true : false);
        ee.a((byte) 107);
        bl.b(13756);
        ne.a(-1459);
        kh.a();
        nj.c();
        qa.b();
        sd.a((byte) -30);
        o.a((byte) -128);
        ia.a((byte) 125);
        fe.a((byte) 126);
        f.a((byte) -69);
        km.e(125);
        pd.a((byte) -19);
        lb.a((byte) -98);
        kd.b((byte) 119);
        tk.e(-31028);
        th.a(true);
        oj.c(384);
        se.e(false);
        wc.a((byte) -69);
        wl.b(-25829);
        de.a(-2079);
        lh.a(-21248);
        mf.a(127);
        fk.a((byte) -102);
        ub.a();
        re.c((byte) -77);
        nd.b(-16996);
        oa.a((byte) 90);
        a.a((byte) 29);
        il.a(0);
        cd.d((byte) 61);
        uc.d((byte) -99);
        ak.c((byte) -102);
        gl.c(128);
        fl.a(-128);
        wj.c((byte) -90);
        jd.a(0);
        gg.f(true);
        jc.a(true);
        wi.b();
        p.a((byte) 73);
        fa.a(false);
        wd.b(100);
        m.a((byte) 98);
        lg.a(104);
        oh.a(-17303);
        tg.a(2);
        pa.a(17);
        ua.a(-415277564);
        tb.a(-9698);
        sf.b((byte) 7);
        k.a((byte) -112);
        al.a((byte) 3);
        bh.a(-21000);
        ll.a(14);
        ac.a();
        da.b(16);
        ud.c(true);
        q.a(109);
        qk.a((byte) -122);
        ci.a(1);
        sj.b((byte) 64);
        ab.a(false);
        ck.a(22499);
        dm.a(0);
        pj.e(-75);
        s.i(99);
        kj.a((byte) 81);
        ej.o(-15640);
        sg.a((byte) 87);
        ta.c((byte) -95);
        gd.b(24);
        kf.a(-17218);
        oe.f(-12563);
        rh.a((byte) 126);
        nh.a((byte) -59);
        gb.a(2867);
        dk.b(0);
        cf.a(0);
        mb.a(114);
        pg.a(-12150);
        bk.a(48);
        g.b((byte) -22);
        ij.b((byte) 68);
        db.a(-101);
        mc.c(12);
        od.b((byte) -87);
        ok.b((byte) 104);
        cg.d(0);
        uh.a(-5);
        sl.c((byte) 126);
        me.c(5);
        vc.a((byte) 116);
        rc.a(-127);
        h.l(-115);
        oc.q(119);
        vi.n(1);
        hl.p(0);
        dg.a((byte) 120);
        we.k(29858);
        te.k(-3213);
        kk.l(79);
        of.a((byte) -83);
        hi.g(-104);
        qb.a((byte) -83);
        ob.a((byte) -19);
        ue.c((byte) -13);
        lk.a();
        j.a(-99);
        gi.a(param0);
        nc.e(8864);
        ei.b(139);
        hg.c(false);
        vf.a(1);
        bd.c(0);
        tj.a((byte) -58);
        dd.c((byte) -119);
        mm.k(21006);
        ba.b(50);
        ek.b(-1);
        qe.a(param0);
        nf.h(127);
        lc.i(96);
        md.d(-77);
        ih.a(-127);
        pl.a(-1);
        ol.a(false);
        gj.c(false);
        vg.c(false);
        hb.a(119);
        hf.c(true);
        mj.a((byte) 86);
        vk.b((byte) -108);
        qc.a(4784);
        eg.a(-123);
        fi.a(-8601);
        jj.k(37);
        ti.e(67);
        d.a((byte) -128);
        ad.a(true);
        dc.c(!param0 ? true : false);
        ha.a((byte) 99);
        va.a(8);
        qj.a(-28342);
        mi.a((byte) -67);
        tl.a(-127);
        hc.c(31);
        ec.a((byte) 122);
        df.a(76);
        ii.b(-26268);
        hh.b(-93);
        i.a(100);
        vh.c(95);
        fb.a((byte) 125);
        qf.c(32);
        vb.c(-26818);
        ef.c(param0);
        sa.a((byte) -105);
        ed.a(-1);
        bc.c((byte) -97);
        em.d((byte) -15);
        wg.j(-24392);
        b.j(-1);
        nb.j(-1);
        ug.b((byte) -41);
        li.a(false);
        cc.a((byte) 83);
        qd.a(-96);
        wb.f(7312);
        e.a((byte) -14);
        this.field_n = null;
    }

    final void d(byte param0) {
        int stackIn_39_0 = 0;
        boolean stackIn_40_1 = false;
        int var3_int;
        kg var3;
        int var4;
        int var5;
        int var6;
        java.awt.Canvas var7;
        var6 = field_D ? 1 : 0;
        var7 = tb.a((byte) 114);
        if (eg.c((byte) -126)) {
          nd.a((byte) -54, var7, km.a(false));
          return;
        }
        if (!f.field_j) {
          em.a(0, var7);
          return;
        }
        if (!ad.a((byte) -72)) {
          j.a(100.0f, ge.field_i, (byte) 113);
          em.a(0, var7);
          return;
        }
        ul.d();
        if (~kk.field_S != ~kf.field_c) {
          if (5 <= te.field_O) {
            if (kk.field_S != -1) {
              if (kk.field_S == 1 &&
                il.field_f != null) {
                il.field_f.a(2, false);
              }
              nc.field_cb[kk.field_S].b((byte) -119);
            } else {
              il.field_f.a(2, false);
            }
            ub.a(10 - te.field_O, 0, ub.field_a);
          } else {
            if (kf.field_c != -1) {
              if (kf.field_c == 1 &&
                null != il.field_f) {
                il.field_f.a(2, false);
              }
              nc.field_cb[kf.field_c].b((byte) -120);
            } else {
              il.field_f.a(2, false);
            }
            ub.a(te.field_O, 0, ub.field_a);
          }
        } else {
          if (-1 != kf.field_c) {
            if (kf.field_c == 1 &&
              il.field_f != null) {
              il.field_f.a(2, false);
            }
            nc.field_cb[kf.field_c].b((byte) 6);
          } else {
            il.field_f.a(2, true);
          }
        }
        if (rl.a((byte) 124)) {
          ul.c(0, 0, ul.field_f, ul.field_l);
          gl.a(4 + f.field_w[0].field_o, f.field_w[0].field_k + 4, false, f.field_w);
        }
        if (lc.field_r != 0) {
          var3_int = 256 * te.field_O / 10;
          if (var3_int > 0) {
            ul.d(0, 0, ul.field_f, ul.field_l, 0, var3_int);
          }
        }
        if (ec.k(783) &&
          !rl.a((byte) 101)) {
          stackIn_39_0 = 82;
          if (null == mg.field_k) {
            stackIn_40_1 = wg.field_o;
          } else {
            stackIn_40_1 = true;
          }
          fg.$cfr$intArgs$a$7ffe4b125357(stackIn_39_0, stackIn_40_1);
        }
        if (2 <= va.field_d) {
          ob.field_I.b(Integer.toString(ud.field_f), 20, 20, 16777215, 1);
        }
        if (param0 >= -72) {
          field_C = (String) null;
        }
        var3 = (kg) (oj.field_r.b((byte) 120));
        if (var3 != null) {
          var5 = lc.field_x;
          if (var5 >= 80) {
            if (var5 < 230) {
              var4 = 96;
            } else {
              var4 = 96 + (300 + (160 - 2 * var5));
            }
          } else {
            var4 = 96 + 2 * (-80 + var5);
          }
          ul.i(var4, 417, 57, 16777215, 64);
          ul.i(var4, 417, 56, 16777215, 128);
          ul.i(var4, 417, 55, 16777215, 192);
          ul.i(var4, 417, 54, 0, 255);
          bd.field_o[var3.field_k].d(var4 - 32, 370);
          ob.field_I.c(gj.field_j[var3.field_k], var4 - 1, 440 + ob.field_I.field_H, 0, 0);
          ob.field_I.c(gj.field_j[var3.field_k], var4, ob.field_I.field_H + 439, 0, 0);
          ob.field_I.c(gj.field_j[var3.field_k], var4, 440 + ob.field_I.field_H, 15610879, -1);
        }
        kg.a(0, (byte) -83, 0, var7);
        return;
    }

    final void c(byte param0) {
        this.a(false, (byte) 88, 10, 3, 1, 0, 2, 60);
        int var3 = 112 / ((param0 + 4) / 39);
        lj var2 = new lj();
        var2.a(128, 9, (byte) 125);
        gj.a(22050, var2, true, 1024, (java.awt.Component) ((Object) tf.field_f), wc.field_c);
        he.field_C = 16777215;
        lf.field_e = 15632639;
        mf.field_c = 16777215;
        this.a(false, true, true, false, false);
    }

    private final boolean a(boolean param0, byte param1) {
        int[] array$1 = null;
        int var4_int = 0;
        int var7_int = 0;
        int var3;
        int[] var3_ref_int__;
        qg[] var4;
        int[] var5;
        int var6;
        hj[] var6_ref_hj__;
        hj var7;
        int var9;
        int[] var10;
        int[] var11;
        hj var12;
        hj var13;
        int[] var14;
        int var3Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        var9 = field_D ? 1 : 0;
        bl.a(param1 ^ 20);
        if (null != kd.field_q) {
          if (j.field_b.b(-1) &&
            j.field_b.b((byte) 102, "basic")) {
            if (!j.field_b.b((byte) 99, "arialbold14")) {
              j.a(4.0f, ed.a(hi.field_e, j.field_b, -14416, bk.field_a, "arialbold14"), (byte) 118);
              return false;
            }
            if (tf.field_d.b(-1) &&
              tf.field_d.b((byte) 121, "arialbold14")) {
              if (!j.field_b.b((byte) 81, "arial13")) {
                j.a(4.0f, ed.a(hi.field_e, j.field_b, param1 - 14513, bk.field_a, "arial13"), (byte) 112);
                return false;
              }
              if (tf.field_d.b(param1 - 98) &&
                tf.field_d.b((byte) -84, "arial13")) {
                if (kd.field_q.b(-1) &&
                  kd.field_q.c(7715)) {
                  if (ig.field_hb.b(-1) &&
                    ig.field_hb.c(7715)) {
                    if (hl.field_N.b(-1) &&
                      hl.field_N.c(param1 + 7618)) {
                      if (lg.field_c.b(-1) &&
                        lg.field_c.c(param1 + 7618)) {
                        if (bh.field_d.b(-1) &&
                          bh.field_d.c(7715)) {
                          if (pd.field_r.b(param1 ^ -98) &&
                            pd.field_r.c(param1 + 7618)) {
                            j.a(65.0f, me.field_i, (byte) 122);
                            this.d((byte) -80);
                            if (!param0) {
                              return false;
                            }
                            mh.field_a = new dl[60];
                            bg.a(param1 - 2027485875);
                            cj.field_b = new vd(kd.field_q, ig.field_hb);
                            mh.field_a[0] = cm.a(kd.field_q, "", "Orb_defence_select_menu_item").a();
                            mh.field_a[30] = cm.a(kd.field_q, "", "Orb_defence_mouseover_options").a();
                            mh.field_a[1] = cm.a(kd.field_q, "", "Orb_defence_place_turret_2").a();
                            mh.field_a[2] = cm.a(kd.field_q, "", "Orb_defence_select_turret").a();
                            mh.field_a[3] = cm.a(kd.field_q, "", "Orb_defence_upgrade_turret").a();
                            mh.field_a[5] = cm.a(kd.field_q, "", "Orb_defence_fast_blast_1").a();
                            mh.field_a[10] = cm.a(kd.field_q, "", "Orb_defence_chain_shot_1").a();
                            mh.field_a[15] = cm.a(kd.field_q, "", "Orb_defence_big_shot_1").a();
                            mh.field_a[20] = cm.a(kd.field_q, "", "Orb_defence_ice_shot_1").a();
                            mh.field_a[25] = cm.a(kd.field_q, "", "Orb_defence_beam_blast_1").a();
                            mh.field_a[6] = cm.a(kd.field_q, "", "Orb_defence_fast_blast_2").a();
                            mh.field_a[11] = cm.a(kd.field_q, "", "Orb_defence_chain_shot_2").a();
                            mh.field_a[16] = cm.a(kd.field_q, "", "Orb_defence_big_shot_2").a();
                            mh.field_a[21] = cm.a(kd.field_q, "", "Orb_defence_ice_shot_2").a();
                            mh.field_a[26] = cm.a(kd.field_q, "", "Orb_defence_beam_blast_2").a();
                            mh.field_a[7] = cm.a(kd.field_q, "", "Orb_defence_fast_blast_3").a();
                            mh.field_a[12] = cm.a(kd.field_q, "", "Orb_defence_chain_shot_3").a();
                            mh.field_a[17] = cm.a(kd.field_q, "", "Orb_defence_big_shot_3").a();
                            mh.field_a[22] = cm.a(kd.field_q, "", "Orb_defence_ice_shot_3").a();
                            mh.field_a[27] = cm.a(kd.field_q, "", "Orb_defence_beam_blast_3").a();
                            mh.field_a[8] = cm.a(kd.field_q, "", "Orb_defence_fast_blast_4").a();
                            mh.field_a[13] = cm.a(kd.field_q, "", "Orb_defence_chain_shot_4").a();
                            mh.field_a[18] = cm.a(kd.field_q, "", "Orb_defence_big_shot_4").a();
                            mh.field_a[23] = cm.a(kd.field_q, "", "Orb_defence_ice_shot_4").a();
                            mh.field_a[28] = cm.a(kd.field_q, "", "Orb_defence_beam_blast_4").a();
                            mh.field_a[9] = cm.a(kd.field_q, "", "Orb_defence_fast_blast_5").a();
                            mh.field_a[14] = cm.a(kd.field_q, "", "Orb_defence_chain_shot_5").a();
                            mh.field_a[19] = cm.a(kd.field_q, "", "Orb_defence_big_shot_5").a();
                            mh.field_a[24] = cm.a(kd.field_q, "", "Orb_defence_ice_shot_5").a();
                            mh.field_a[29] = cm.a(kd.field_q, "", "Orb_defence_beam_blast_5").a();
                            mh.field_a[44] = cm.a(kd.field_q, "", "orb_defence_start_game").a();
                            mh.field_a[45] = cm.a(kd.field_q, "", "orb_defence_end_game").a();
                            mh.field_a[46] = cm.a(kd.field_q, "", "orb_defence_display_wave_message").a();
                            mh.field_a[47] = cm.a(kd.field_q, "", "orb_defence_remove_wave_message").a();
                            mh.field_a[49] = cm.a(kd.field_q, "", "Orb_defence_norb_death_1").a();
                            mh.field_a[50] = cm.a(kd.field_q, "", "Orb_defence_norb_death_2").a();
                            mh.field_a[51] = cm.a(kd.field_q, "", "Orb_defence_norb_death_3").a();
                            mh.field_a[52] = cm.a(kd.field_q, "", "Orb_defence_norb_death_4").a();
                            mh.field_a[53] = cm.a(kd.field_q, "", "Orb_defence_norb_death_5").a();
                            mh.field_a[54] = cm.a(kd.field_q, "", "Orb_defence_norb_boss_death").a();
                            mh.field_a[55] = cm.a(kd.field_q, "", "orb_defence_destroy_orb").a();
                            mh.field_a[56] = cm.a(kd.field_q, "", "orb_defence_barrier_initialise").a();
                            mh.field_a[59] = cm.a(kd.field_q, "", "orb_defence_barrier_explode").a();
                            kd.field_q = null;
                            vd.a(39);
                            return false;
                          }
                          j.a(55.0f, ed.a(hi.field_e, pd.field_r, param1 ^ -14383, bk.field_a, ""), (byte) 105);
                          return false;
                        }
                        j.a(45.0f, ed.a(kj.field_z, bh.field_d, param1 - 14513, jj.field_B, ""), (byte) 120);
                        return false;
                      }
                      j.a(40.0f, ed.a(ha.field_l, lg.field_c, -14416, qd.field_a, ""), (byte) 112);
                      return false;
                    }
                    j.a(30.0f, mc.a(hl.field_N, ii.field_d, ld.field_c, 0, -93), (byte) 113);
                    return false;
                  }
                  j.a(20.0f, ed.a(hb.field_b, ig.field_hb, -14416, vg.field_u, ""), (byte) 111);
                  return false;
                }
                j.a(10.0f, ed.a(hb.field_b, kd.field_q, -14416, vg.field_u, ""), (byte) 114);
                return false;
              }
              j.a(5.0f, ed.a(hi.field_e, tf.field_d, -14416, bk.field_a, "arial13"), (byte) 122);
              return false;
            }
            j.a(5.0f, ed.a(hi.field_e, tf.field_d, -14416, bk.field_a, "arialbold14"), (byte) 113);
            return false;
          }
          j.a(3.0f, ed.a(kj.field_z, j.field_b, param1 - 14513, jj.field_B, "basic"), (byte) 120);
          return false;
        }
        if (null != ig.field_hb) {
          j.a(70.0f, me.field_i, (byte) 120);
          this.d((byte) -82);
          mh.field_a[31] = nj.a(ig.field_hb, "", "orb_defence_normo_boss_arrive").a();
          mh.field_a[32] = nj.a(ig.field_hb, "", "orb_defence_swarmo_boss_arrive").a();
          mh.field_a[33] = nj.a(ig.field_hb, "", "orb_defence_zoomo_boss_arrive").a();
          mh.field_a[34] = nj.a(ig.field_hb, "", "orb_defence_tougho_boss_arrive").a();
          mh.field_a[35] = nj.a(ig.field_hb, "", "orb_defence_flybo_boss_arrive").a();
          mh.field_a[36] = nj.a(ig.field_hb, "", "orb_defence_bombo_boss_arrive").a();
          mh.field_a[37] = nj.a(ig.field_hb, "", "orb_defence_blambo_boss_arrive").a();
          mh.field_a[38] = nj.a(ig.field_hb, "", "orb_defence_irono_boss_arrive").a();
          mh.field_a[39] = nj.a(ig.field_hb, "", "orb_defence_awesomeo_boss_arrive").a();
          mh.field_a[40] = nj.a(ig.field_hb, "", "orb_defence_sneako_boss_arrive").a();
          mh.field_a[41] = nj.a(ig.field_hb, "", "orb_defence_splitto_boss_arrive").a();
          mh.field_a[57] = nj.a(ig.field_hb, "", "orb_defence_Barrier_Norb_Electrocute").a();
          mh.field_a[58] = nj.a(ig.field_hb, "", "orb_defence_Electro_Turret_shoot").a();
          ig.field_hb = null;
          vd.a(param1 - 8);
          return false;
        }
        if (lg.field_c != null) {
          ee.field_b = new fj[15];
          j.a(75.0f, m.field_e, (byte) 125);
          this.d((byte) -116);
          ee.field_b[0] = fj.a(lg.field_c, "", "Orb_defence_level_1_construction");
          ee.field_b[1] = fj.a(lg.field_c, "", "Orb_defence_level_1_waves");
          ee.field_b[2] = fj.a(lg.field_c, "", "Orb_defence_level_1_boss");
          ee.field_b[3] = fj.a(lg.field_c, "", "Orb_defence_level_2_construction");
          ee.field_b[4] = fj.a(lg.field_c, "", "Orb_defence_level_2_waves");
          ee.field_b[5] = fj.a(lg.field_c, "", "Orb_defence_level_2_boss");
          ee.field_b[6] = fj.a(lg.field_c, "", "Orb_defence_level_3_construction");
          ee.field_b[7] = fj.a(lg.field_c, "", "Orb_defence_level_3_waves");
          ee.field_b[8] = fj.a(lg.field_c, "", "Orb_defence_level_3_boss");
          ee.field_b[9] = fj.a(lg.field_c, "", "Orb_defence_level_4_construction");
          ee.field_b[10] = fj.a(lg.field_c, "", "Orb_defence_level_4_waves");
          ee.field_b[11] = fj.a(lg.field_c, "", "Orb_defence_level_4_boss");
          ee.field_b[12] = fj.a(lg.field_c, "", "Orb_defence_titlescreen_1");
          ee.field_b[14] = fj.a(lg.field_c, "", "Orb_defence_gameover");
          lg.field_c = null;
          vd.a(param1 - 71);
          return false;
        }
        if (hl.field_N != null) {
          for (var3 = 0; 15 > var3; var3++) {
            if (null != ee.field_b[var3] &&
              !ml.field_c.a(hl.field_N, cj.field_b, (byte) 31, ee.field_b[var3], 176400)) {
              vd.a(param1 ^ 0);
              return false;
            }
          }
          ml.field_c.b((byte) 27);
          hl.field_N = null;
          cj.field_b = null;
          vd.a(64);
          return false;
        }
        if (null != j.field_b) {
          j.a(90.0f, ek.field_c, (byte) 119);
          this.d((byte) -113);
          al.field_d = fk.a(j.field_b, "unachieved", 45, "basic");
          me.field_n = fk.a(j.field_b, "locked", -90, "basic");
          jm.field_b = fk.a(j.field_b, "orbcoin", 105, "basic");
          sl.a(2408, al.field_d);
          sl.a(param1 ^ 2313, me.field_n);
          sl.a(param1 ^ 2313, jm.field_b);
          ob.field_I = b.a("", "arialbold14", param1 - 202, tf.field_d, j.field_b);
          jd.field_c = b.a("", "arial13", 90, tf.field_d, j.field_b);
          tf.field_d = null;
          j.field_b = null;
          vd.a(param1 ^ 59);
          return false;
        }
        if (null == bh.field_d) {
          if (gl.b(10489)) {
            for (var3Lifetime1 = 0; var3Lifetime1 < 9; var3Lifetime1++) {
              nc.field_cb[var3Lifetime1] = new ja(var3Lifetime1);
            }
            kf.field_c = 0;
            cc.a(false, 50);
            km.a((byte) -62, 50);
            hi.a(ee.field_b[12], param1 ^ 99, false, 1, true, 2);
            bl.field_p = 0;
          }
          if (param1 == 97) {
            return true;
          }
          field_E = (String) null;
          return true;
        }
        fk.a(bh.field_d, "background", -117, "");
        cc.field_t = sf.a("", pd.field_r, -1, "aafont", bh.field_d);
        var14 = cc.field_t.field_J[0];
        var11 = var14;
        var10 = var11;
        var3_ref_int__ = var10;
        cc.field_t.field_J = new int[2][];
        cc.field_t.field_J[0] = var14;
        array$1 = new int[var14.length];
        cc.field_t.field_J[1] = array$1;
        for (var4_int = 0; var14.length > var4_int; var4_int++) {
          cc.field_t.field_J[1][var4_int] = vi.a(var14[var4_int], 16711935);
        }
        var4 = fl.a(-9945, bh.field_d, "", "keys");
        var5 = new int[]{14, 14, 14, 15, 15};
        for (var6 = 0; var4.length > var6; var6++) {
          var4[var6].field_c = 2 + var4[var6].field_h;
          var4[var6].field_b = 1;
        }
        ob.field_I.a(var4, var5);
        jd.field_c.a(var4, var5);
        pj.field_u = p.a(13863, "", bh.field_d, "menu_overlays");
        am.field_d = new hj[6];
        am.field_d[0] = fk.a(bh.field_d, "baseimage", -83, "");
        am.field_d[1] = fk.a(bh.field_d, "baseimage2", 79, "");
        am.field_d[2] = fk.a(bh.field_d, "baseimage3", gi.a((int) param1, -84), "");
        am.field_d[3] = fk.a(bh.field_d, "baseimage4", gi.a((int) param1, -95), "");
        am.field_d[4] = fk.a(bh.field_d, "baseimage5", -72, "");
        am.field_d[5] = fk.a(bh.field_d, "baseimage6", -58, "");
        hi.field_g = new hj[6];
        for (var6Lifetime1 = 0; hi.field_g.length > var6Lifetime1; var6Lifetime1++) {
          hi.field_g[var6Lifetime1] = new hj(160, 120);
        }
        hg.field_ab = fk.a(bh.field_d, "anorb", param1 ^ -64, "");
        ab.field_g = p.a(13863, "", bh.field_d, "walk_norb");
        hf.field_g = p.a(13863, "", bh.field_d, "turrettest");
        cj.a(105);
        fk.field_b = fk.a(bh.field_d, "titleimage", 46, "");
        fk.a(bh.field_d, "orbpilon", 120, "");
        p.a(param1 + 13766, "", bh.field_d, "wall");
        bc.field_q = p.a(13863, "", bh.field_d, "edging");
        mf.field_b = p.a(13863, "", bh.field_d, "floors_1");
        p.a(param1 ^ 13894, "", bh.field_d, "turrets");
        gd.field_b = p.a(13863, "", bh.field_d, "explosion");
        p.a(13863, "", bh.field_d, "bosses");
        gk.field_a = fk.a(bh.field_d, "in_game_shine", -79, "");
        ad.field_e = fk.a(bh.field_d, "in_game_swarm_bar", param1 ^ -8, "");
        dh.field_X = fk.a(bh.field_d, "in_game_topbar_center", 38, "");
        ck.field_c = new hj[2];
        ck.field_c[0] = fk.a(bh.field_d, "in_game_turret_unavailable", -119, "");
        ck.field_c[1] = fk.a(bh.field_d, "in_game_turret_available", -62, "");
        qh.field_d = new hj[3];
        qh.field_d[0] = fk.a(bh.field_d, "in_game_topbutton_blue", 83, "");
        qh.field_d[1] = fk.a(bh.field_d, "in_game_topbutton_green", -60, "");
        qh.field_d[2] = fk.a(bh.field_d, "in_game_topbutton_grey", 71, "");
        f.field_w = p.a(13863, "", bh.field_d, "frame");
        bk.field_d = p.a(13863, "", bh.field_d, "button_frame");
        qc.field_f = p.a(13863, "", bh.field_d, "button_raised");
        p.a(param1 ^ 13894, "", bh.field_d, "button_depressed");
        bd.field_o = new hj[24];
        bd.field_o[0] = fk.a(bh.field_d, "achievements_icon_1", -99, "");
        bd.field_o[1] = fk.a(bh.field_d, "achievements_icon_2", -71, "");
        bd.field_o[2] = fk.a(bh.field_d, "achievements_icon_3", 45, "");
        bd.field_o[3] = fk.a(bh.field_d, "achievements_icon_4", 92, "");
        bd.field_o[4] = fk.a(bh.field_d, "achievements_icon_5", -100, "");
        bd.field_o[5] = fk.a(bh.field_d, "achievements_icon_6", -115, "");
        bd.field_o[6] = fk.a(bh.field_d, "achievements_icon_7", gi.a((int) param1, 55), "");
        bd.field_o[7] = fk.a(bh.field_d, "achievements_icon_8", 72, "");
        bd.field_o[8] = fk.a(bh.field_d, "achievements_icon_9", 58, "");
        bd.field_o[9] = fk.a(bh.field_d, "achievements_icon_10", -116, "");
        bd.field_o[10] = fk.a(bh.field_d, "achievements_icon_11", 57, "");
        bd.field_o[11] = fk.a(bh.field_d, "achievements_icon_12", -79, "");
        bd.field_o[12] = fk.a(bh.field_d, "achievements_icon_13", 38, "");
        bd.field_o[13] = fk.a(bh.field_d, "achievements_icon_14", 87, "");
        bd.field_o[14] = fk.a(bh.field_d, "achievements_icon_15", 98, "");
        bd.field_o[15] = fk.a(bh.field_d, "achievements_icon_16", gi.a((int) param1, 62), "");
        bd.field_o[16] = fk.a(bh.field_d, "achievements_icon_17", 51, "");
        bd.field_o[17] = fk.a(bh.field_d, "achievements_icon_18", gi.a((int) param1, -29), "");
        bd.field_o[18] = fk.a(bh.field_d, "achievements_icon_19", param1 - 202, "");
        bd.field_o[19] = fk.a(bh.field_d, "achievements_icon_20", 87, "");
        bd.field_o[20] = fk.a(bh.field_d, "achievements_icon_21", -70, "");
        bd.field_o[21] = fk.a(bh.field_d, "achievements_icon_22", -125, "");
        bd.field_o[22] = fk.a(bh.field_d, "achievements_icon_23", 120, "");
        bd.field_o[23] = fk.a(bh.field_d, "achievements_icon_24", -98, "");
        ba.a((byte) -27);
        var6_ref_hj__ = bd.field_o;
        for (var7_int = 0; var7_int < var6_ref_hj__.length; var7_int++) {
          var12 = var6_ref_hj__[var7_int];
          sl.a(2408, var12);
        }
        var6Lifetime2 = ob.field_I.field_H + ob.field_I.field_B;
        ba.field_e = new hj(var6Lifetime2, var6Lifetime2);
        ba.field_e.d();
        jm.field_b.d(0, 0, var6Lifetime2, var6Lifetime2);
        jm.field_b = null;
        cb.field_a.a(-40);
        o.a(80, (byte) -38, (java.applet.Applet) (this), tk.field_r, 0, 255);
        var7 = fk.a(bh.field_d, "mb_frames", param1 ^ 38, "");
        ij.a(-63, ui.field_e, var7);
        pj.a(param1 - 97, fk.a(bh.field_d, "mb_logo", 40, ""));
        bk.a(90, p.a(13863, "", bh.field_d, "mb_sshots"));
        var13 = fk.a(bh.field_d, "mb_pricing_bg", 60, "");
        kj.a(var13, 80, (byte) 45, 10, 10, 10, 140, 1500, 10);
        bh.field_d = null;
        pd.field_r = null;
        vd.a(70);
        return false;
    }

    public final void init() {
        this.a(11, "orbdefence", (byte) 20);
    }

    private final void e(boolean param0) {
        int fieldTemp$0 = 0;
        int var3;
        var3 = field_D ? 1 : 0;
        if (va.field_d >= 2 &&
          ek.field_a[41]) {
          lb.field_g = 16777215;
          fc.field_d = true;
        }
        if (!df.field_f) {
          jg.field_n[25] = db.field_c;
        } else {
          jg.field_n[25] = cc.field_m;
        }
        if (param0) {
          return;
        }
        if (oj.field_r.b((byte) -55) != null) {
          fieldTemp$0 = lc.field_x + 1;
          lc.field_x = lc.field_x + 1;
          if (fieldTemp$0 == 335) {
            lc.field_x = 0;
            oj.field_r.e(0);
          }
        }
        if (0 != lc.field_r) {
          if (lc.field_r != 1) {
            if (lc.field_r != 2) {
              te.field_O = te.field_O - 1;
              if (0 == te.field_O) {
                lc.field_r = 0;
              }
            } else {
              if (!n.b((byte) 102)) {
                oh.field_c = lg.a(4, param0);
                if (null != il.field_f) {
                  il.field_f.c(-1);
                }
                kf.field_c = da.field_B;
                if (kf.field_c == -2) {
                  kf.field_c = 0;
                  ud.a(8, bk.field_d, false, ob.field_I.field_E + ob.field_I.field_B, 6, 6, ob.field_I, ob.field_I.field_E, (byte) 5, 320, 240, qc.field_f);
                }
              } else {
                kf.field_c = dm.field_a;
              }
              kk.field_S = kf.field_c;
              te.field_O = 9;
              lc.field_r = 3;
            }
          } else {
            te.field_O = te.field_O + 1;
            if (te.field_O == 10) {
              if (rl.a((byte) 108)) {
                n.a((byte) -110);
              } else {
                ji.a((byte) 104);
              }
              lc.field_r = 2;
            }
          }
        } else {
          if (~kf.field_c == ~kk.field_S) {
            if (kf.field_c != -1) {
              nc.field_cb[kf.field_c].b(param0);
            } else {
              il.field_f.b(28803, true);
            }
          } else {
            te.field_O = te.field_O + 1;
            if (te.field_O == 10) {
              if (kf.field_c == 2) {
                kj.field_x = null;
              }
              kf.field_c = kk.field_S;
              te.field_O = 0;
            }
          }
        }
    }

    public static void h(byte param0) {
        if (param0 >= -102) {
          return;
        }
        field_E = null;
        field_C = null;
    }

    static {
        field_C = "Updates will sent to the email address you've given";
        field_E = "???";
    }
}
