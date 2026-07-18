/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

public final class TombRacer extends rfa implements ls {
    static String field_F;
    private int field_E;
    private cja field_H;
    private rca field_D;
    public static boolean field_G;

    public final boolean a(byte param0, char param1, int param2) {
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (!rda.d(20125)) {
            break L0;
          } else {
            if (1 != param2) {
              if (param2 != 2) {
                if (param2 != 3) {
                  if (param2 != 27) {
                    if (param2 == 5) {
                      return true;
                    } else {
                      if (param2 == 6) {
                        return true;
                      } else {
                        if (param2 == 7) {
                          return true;
                        } else {
                          if (8 == param2) {
                            od.field_i = 0;
                            pca.a(od.field_i, param0 + -26037, 0);
                            return true;
                          } else {
                            if (param2 == 9) {
                              od.field_i = 50;
                              pca.a(od.field_i, param0 ^ 26043, 0);
                              return true;
                            } else {
                              if (param2 == 10) {
                                od.field_i = 80;
                                pca.a(od.field_i, param0 + -26037, 5);
                                return true;
                              } else {
                                if (11 == param2) {
                                  od.field_i = 150;
                                  pca.a(od.field_i, param0 ^ 26043, 0);
                                  return true;
                                } else {
                                  if (param2 == 12) {
                                    od.field_i = 200;
                                    pca.a(od.field_i, param0 + -26037, 0);
                                    return true;
                                  } else {
                                    if (param2 != 52) {
                                      break L0;
                                    } else {
                                      if (oj.field_tb[81]) {
                                        System.out.println("Git hash: 86acd69e33288530ebd1917f2ede5a853f902fe7");
                                        System.out.println("Git committer date: 2015-09-15 11:23:43 +0100");
                                        System.out.println("Git author date: 2015-09-15 11:23:43 +0100");
                                        return true;
                                      } else {
                                        break L0;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    L1: {
                      if (ara.field_wb) {
                        stackOut_16_0 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        break L1;
                      } else {
                        stackOut_15_0 = 1;
                        stackIn_17_0 = stackOut_15_0;
                        break L1;
                      }
                    }
                    ara.field_wb = stackIn_17_0 != 0;
                    return true;
                  }
                } else {
                  L2: {
                    if (rsa.field_s) {
                      stackOut_11_0 = 0;
                      stackIn_12_0 = stackOut_11_0;
                      break L2;
                    } else {
                      stackOut_10_0 = 1;
                      stackIn_12_0 = stackOut_10_0;
                      break L2;
                    }
                  }
                  rsa.field_s = stackIn_12_0 != 0;
                  return true;
                }
              } else {
                L3: {
                  if (jc.field_M) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L3;
                  } else {
                    stackOut_5_0 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    break L3;
                  }
                }
                jc.field_M = stackIn_7_0 != 0;
                return true;
              }
            } else {
              qb.c((byte) -118);
              return true;
            }
          }
        }
        if (!iqa.field_c.a(param2, param0 ^ 71, param1)) {
          if (((TombRacer) this).field_D == null) {
            if (!hb.field_t.a(param2, param1, param0 ^ -71)) {
              L4: {
                if (param0 == -72) {
                  break L4;
                } else {
                  this.z(-14);
                  break L4;
                }
              }
              return false;
            } else {
              return true;
            }
          } else {
            boolean discarded$1 = ((TombRacer) this).field_D.a(fna.field_h, kda.field_td, (byte) 126);
            return true;
          }
        } else {
          return true;
        }
    }

    private final void a(boolean param0, rqa param1, byte param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        ssa var5_ref_ssa = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ssa var9 = null;
        int var10 = 0;
        int stackIn_19_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_47_0 = 0;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        boolean stackOut_46_0 = false;
        int stackOut_45_0 = 0;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        var10 = field_G ? 1 : 0;
        try {
          L0: {
            if (null == tga.field_a) {
              return;
            } else {
              L1: {
                this.z(91);
                if (null != cs.field_c) {
                  cs.field_c.a((byte) -28, false);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (wka.field_d) {
                  break L2;
                } else {
                  if (param1 == null) {
                    break L2;
                  } else {
                    if ((Object) (Object) wm.field_a == (Object) (Object) param1) {
                      break L2;
                    } else {
                      if ((Object) (Object) hb.field_t == (Object) (Object) param1) {
                        break L2;
                      } else {
                        param1.a((byte) -28, false);
                        break L2;
                      }
                    }
                  }
                }
              }
              L3: {
                if (null != wm.field_a) {
                  if (!wm.field_a.b(31923)) {
                    wm.field_a.a((byte) -28, false);
                    break L3;
                  } else {
                    if (param1 != null) {
                      break L3;
                    } else {
                      L4: {
                        if (wm.field_a instanceof ala) {
                          stackOut_18_0 = 0;
                          stackIn_19_0 = stackOut_18_0;
                          break L4;
                        } else {
                          stackOut_17_0 = 1;
                          stackIn_19_0 = stackOut_17_0;
                          break L4;
                        }
                      }
                      var4_int = stackIn_19_0;
                      if (var4_int != 0) {
                        wm.field_a.a((byte) -28, false);
                        tga.field_a.SA(0, 0, aaa.a(false), koa.b(param2 ^ 17), bea.field_l, 0, aaa.a(false));
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
              L5: {
                var4_int = 0;
                if (hb.field_t == null) {
                  break L5;
                } else {
                  if (hb.field_t.b(31923)) {
                    bea.a();
                    var4_int = 1;
                    hb.field_t.a((byte) -28, true);
                    break L5;
                  } else {
                    hb.field_t.a((byte) -28, true);
                    break L5;
                  }
                }
              }
              L6: {
                if (param0) {
                  iqa.field_c.d(true);
                  if (!iqa.field_c.e(-8832)) {
                    break L6;
                  } else {
                    L7: {
                      bea.a();
                      if ((((TombRacer) this).field_E & 8) != 0) {
                        stackOut_32_0 = 0;
                        stackIn_33_0 = stackOut_32_0;
                        break L7;
                      } else {
                        stackOut_31_0 = 1;
                        stackIn_33_0 = stackOut_31_0;
                        break L7;
                      }
                    }
                    wma.a(stackIn_33_0 != 0, 0);
                    bi.a(tga.field_a, param2 ^ 17);
                    break L6;
                  }
                } else {
                  break L6;
                }
              }
              L8: {
                if (((TombRacer) this).field_D != null) {
                  ((TombRacer) this).field_D.b((byte) -65);
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                ((TombRacer) this).field_H.a((byte) -90);
                if (param2 == 17) {
                  break L9;
                } else {
                  field_F = null;
                  break L9;
                }
              }
              L10: {
                if (lca.a(false)) {
                  var4_int = 1;
                  bka.a((byte) 126);
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (!fja.h(param2 ^ 110)) {
                  break L11;
                } else {
                  if (lca.a(false)) {
                    break L11;
                  } else {
                    L12: {
                      tga.field_a.c(-1073741824, 0, aaa.a(false), 0, param2 ^ -22956, koa.b(0));
                      var5_ref_ssa = uja.a((byte) 65, tga.field_a);
                      var5_ref_ssa.a(aaa.a(false) + mp.a((byte) -112) >> 1, koa.b(0) + -qra.a(96) >> 1, (byte) -12, koa.b(0) + qra.a(96) >> 1, aaa.a(false) - mp.a((byte) -125) >> 1);
                      if (dq.field_f == null) {
                        stackOut_46_0 = bn.field_n;
                        stackIn_47_0 = stackOut_46_0 ? 1 : 0;
                        break L12;
                      } else {
                        stackOut_45_0 = 1;
                        stackIn_47_0 = stackOut_45_0;
                        break L12;
                      }
                    }
                    bqa.a(stackIn_47_0 != 0, 106);
                    tga.field_a.SA(0, 0, bea.field_g, bea.field_a, bea.field_l, 0, bea.field_g);
                    var5_ref_ssa.a(param2 + 84);
                    break L11;
                  }
                }
              }
              L13: {
                if (var4_int != 0) {
                  L14: {
                    if (!lca.a(false)) {
                      tga.field_a.SA(0, 0, bea.field_g, bea.field_a, bea.field_l, 0, bea.field_g);
                      break L14;
                    } else {
                      tga.field_a.c(-1073741824, 0, aaa.a(false), 0, -22971, koa.b(0));
                      var5 = f.a(false);
                      var6 = gw.A(-1);
                      var7 = m.A(param2 + -7128);
                      var8 = rs.a((byte) 124);
                      var9 = uja.a((byte) 65, tga.field_a);
                      var9.a(var5 + var7, var6, (byte) -12, var6 + var8, var5);
                      tga.field_a.SA(0, 0, bea.field_g, bea.field_a, bea.field_l, 0, bea.field_g);
                      var9.a(99);
                      break L14;
                    }
                  }
                  this.x(-28581);
                  break L13;
                } else {
                  this.x(-28581);
                  break L13;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var4 = decompiledCaughtException;
            stackOut_55_0 = (RuntimeException) var4;
            stackOut_55_1 = new StringBuilder().append("TombRacer.FB(").append(param0).append(',');
            stackIn_57_0 = stackOut_55_0;
            stackIn_57_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param1 == null) {
              stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
              stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
              stackOut_57_2 = "null";
              stackIn_58_0 = stackOut_57_0;
              stackIn_58_1 = stackOut_57_1;
              stackIn_58_2 = stackOut_57_2;
              break L15;
            } else {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "{...}";
              stackIn_58_0 = stackOut_56_0;
              stackIn_58_1 = stackOut_56_1;
              stackIn_58_2 = stackOut_56_2;
              break L15;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_58_0, stackIn_58_2 + ',' + param2 + ')');
        }
    }

    final void e(int param0) {
        TombRacer.y(param0 + 3787);
        cq.a(-90);
        gt.a(127);
        pba.a(4096);
        vna.b((byte) 91);
        bea.d();
        gda.a(27316);
        ssa.d(-98);
        nba.a(false);
        fa.a(-23172);
        kh.g((byte) 0);
        mua.a(0);
        bpa.a((byte) -57);
        rma.b(13902);
        hp.a(32);
        di.c(param0 + -19099);
        nla.a((byte) 119);
        tk.a(false);
        bi.a(false);
        dga.a(-29262);
        ke.a(3712);
        wv.a(false);
        se.e((byte) 126);
        oka.d(-120);
        ufa.b(param0 ^ -3638);
        taa.a((byte) 9);
        fw.a(0);
        qha.c((byte) -122);
        ou.a(113);
        rm.a(param0 + 12213);
        kla.a(param0 ^ 11134);
        id.c(param0 ^ -3666);
        v.e(param0 ^ -3666);
        bga.a(200);
        aoa.a((byte) 63);
        eca.a(30152);
        qea.a(-3);
        rc.a(true);
        rfa.w(125);
        ug.l(param0 ^ 3665);
        lr.a(false);
        jna.c((byte) -88);
        hua.a(param0 ^ -3666);
        qaa.a(14979);
        cn.d(0);
        uia.a(true);
        bva.a((byte) -13);
        s.a(true);
        oi.a(false);
        sj.a(true);
        msa.a(param0 ^ -3666);
        gqa.a(95);
        qd.a(22442);
        ip.b(-59);
        cha.a(true);
        ina.a(53);
        via.a(64);
        vm.e(param0 ^ -27015);
        tia.a((byte) -125);
        dfa.b((byte) -104);
        ala.c(0);
        qh.b(false);
        gq.f(39);
        ej.a(-1);
        uaa.a(5193);
        iaa.a(-124);
        nb.a((byte) -95);
        eu.a(114);
        vn.a((byte) 0);
        no.b(true);
        sra.c((byte) -35);
        kk.a((byte) 120);
        kra.a(param0 ^ 1916);
        ega.a(2);
        ff.f(0);
        vea.a(63);
        qda.c((byte) 0);
        fma.a((byte) -127);
        ph.a(true);
        jqa.a(-97);
        nda.a(-1);
        sq.a(true);
        fla.a(0);
        ru.a(false);
        dra.a(-109);
        w.a(-101);
        fna.a(1);
        ko.b(-100);
        dda.a(30967);
        vha.a(640);
        me.a(17355);
        dl.d((byte) 96);
        fda.a(param0 + 3574);
        du.a(-6884);
        hf.g((byte) 126);
        qw.a(true);
        tu.c(-1);
        kq.a(param0 ^ 11052);
        qra.b(param0 + 3762);
        hca.D(-1);
        goa.b(0);
        kv.a(-31014);
        pl.a(0);
        lu.a(-12);
        la.p(-128);
        tt.a(4);
        vg.o(param0 ^ -3621);
        hw.a(-75);
        fr.a((byte) 1);
        ta.d((byte) -17);
        oj.a(false);
        um.a((byte) 18);
        jea.c((byte) -107);
        ola.d((byte) -39);
        hla.f(23613);
        lja.b((byte) 67);
        wla.a(true);
        pha.d((byte) -68);
        ht.d((byte) -113);
        af.a(123);
        re.a((byte) -33);
        od.b(0);
        il.a();
        ji.f(124);
        rf.a((byte) -19);
        g.a(false);
        wea.a(8);
        ub.a(true);
        pra.a(param0 + 3548);
        tea.a((byte) -124);
        ida.a((byte) 122);
        tv.f(119);
        bv.f(0);
        is.f(2);
        kta.b();
        l.c(0);
        qt.b(-25809);
        iqa.a(126);
        fga.a((byte) -29);
        ck.a(false);
        wu.a((byte) 91);
        gva.a(param0 ^ -14342);
        rn.a((byte) -114);
        dt.n(param0 ^ param0);
        dva.a((byte) 53);
        aq.b(-116);
        wd.a(3);
        kqa.a((byte) -120);
        sma.a(-98);
        cfa.c((byte) 103);
        ds.a(false);
        bua.a((byte) 97);
        uma.a(-1);
        hu.a((byte) 119);
        za.a((byte) 86);
        qla.a(-63);
        oc.a((byte) -71);
        ka.a(-11);
        ob.a(false);
        vj.a(param0 + 3556);
        uta.c(0);
        gka.a((byte) -124);
        lh.a((byte) 117);
        sw.i(-53);
        ara.a(false);
        wj.a((byte) 41);
        jta.c(false);
        gga.f(param0 + 3666);
        kn.a(-3);
        dsa.a((byte) -126);
        fb.a(true);
        rua.g(false);
        vs.i((byte) -77);
        mpa.f(param0 ^ -3666);
        ij.f(7707);
        mr.f(0);
        tha.c(99);
        jw.c(91);
        efa.c(true);
        hd.a(param0 + 32687);
        lsa.a((byte) 101);
        qma.a((byte) 25);
        hh.a(false);
        fha.a((byte) 3);
        hba.a(1);
        jr.a((byte) -87);
        vga.b(96);
        bsa.a((byte) -33);
        cj.a(47);
        uja.b(param0 ^ -3668);
        ae.e((byte) -28);
        qr.b(param0 ^ -3666);
        gn.c(0);
        bja.c(127);
        at.i((byte) -102);
        dh.a((byte) -6);
        bw.a(115);
        ofa.e(0);
        rla.b(true);
        sta.h((byte) -124);
        b.h((byte) 122);
        rva.b(0);
        joa.a(false);
        dr.a(115);
        sb.a(0);
        qba.a(false);
        li.a(3);
        ch.a((byte) -35);
        rta.b(-89);
        maa.b();
        sv.d(-48);
        dea.a(true);
        jn.d(param0 ^ -3610);
        pk.b(true);
        ai.a((byte) 41);
        epa.d(2);
        qp.d(108);
        vba.d((byte) -10);
        ow.d(param0 ^ 3680);
        vv.d(-127);
        rd.d(-128);
        ct.a((byte) -121);
        csa.j((byte) -107);
        gfa.b(104);
        fm.d(-124);
        sqa.b((byte) -128);
        uw.f(param0 + 3666);
        pta.b(true);
        npa.c(-2147483648);
        bba.a((byte) -28);
        tqa.a((byte) 75);
        ui.a(4);
        ts.b(32);
        fq.b(0);
        dj.a(-1);
        fsa.K(8424);
        db.h((byte) -117);
        kua.a((byte) -113);
        pc.a(true);
        up.a((byte) 2);
        ep.j(114);
        mda.j((byte) 87);
        cra.c(-63);
        dk.a((byte) 104);
        ena.a(true);
        al.a((byte) 66);
        ea.b(0);
        vca.a(param0 ^ -3922);
        foa.a(false);
        bqa.a((byte) -116);
        uj.a((byte) 48);
        cf.a(10);
        nr.a(false);
        vra.a(param0 ^ -3670);
        ua.a(-105);
        lta.a(-87);
        lf.a((byte) 117);
        wga.a(true);
        uu.a(0);
        ap.a((byte) 40);
        nra.a((byte) 95);
        cm.a(true);
        qpa.a(false);
        dba.a((byte) -121);
        ju.a((byte) 120);
        gha.a(param0 + 3542);
        cea.a(-118);
        eua.f(58);
        nc.a(122);
        tr.a((byte) -125);
        wt.a(112);
        apa.a((byte) 7);
        wp.a((byte) 97);
        bl.a(123);
        wb.a((byte) -39);
        qoa.a((byte) 33);
        uoa.a();
        fg.b();
        uca.a(65);
        an.a(-32768);
        nn.a((byte) 9);
        nea.a(0);
        vaa.a(0);
        ml.a((byte) -7);
        he.a(-24962);
        ol.a(0);
        pla.b(-1);
        qu.a(72);
        kr.a();
        aj.a(-11061);
        wca.f(0);
        eoa.b();
        aqa.a((byte) -59);
        wua.a((byte) -36);
        dd.a(8476);
        wra.a(true);
        es.c(param0 + 3571);
        st.c(param0 + 3668);
        ada.c(param0 ^ 3628);
        ue.r(param0 ^ -3666);
        cba.a((byte) 109);
        on.d(32);
        wf.a(2907);
        qka.b((byte) 62);
        gp.a(-117);
        wq.b(true);
        jia.a((byte) 31);
        bs.a(param0 ^ -3601);
        aga.a((byte) -113);
        pca.c(param0 + 3674);
        baa.a(param0 + 3786);
        uh.d(0);
        vf.c(-55);
        uda.h(115);
        daa.b(-12224);
        ova.d((byte) -77);
        dua.d((byte) -128);
        ab.f(6153);
        opa.f(param0 + 3766);
        bp.f(0);
        gu.c(-28);
        era.a((byte) 114);
        qna.a(-2);
        uba.b((byte) -128);
        fe.e(25);
        gv.a(false);
        qqa.a(0);
        ppa.a(-1551894744);
        sga.c((byte) -117);
        js.b((byte) -50);
        qi.f(true);
        uc.E(7);
        jl.a(param0 ^ -1088533378);
        lk.a(false);
        mba.d(-1);
        c.m(72);
        vh.a(param0 + 3560);
        jk.b((byte) 76);
        fka.a();
        aa.a(true);
        lva.d((byte) -123);
        uq.b(param0 + 3747);
        wg.a(true);
        nv.j(18416);
        wda.d(param0 + 15738);
        bca.b(3);
        ir.a((byte) 104);
        gpa.a(false);
        nf.a(param0 + -22136);
        pd.l(59);
        pka.a(-1);
        ana.d(true);
        th.g((byte) 91);
        mka.a((byte) -111);
        tg.a((byte) 23);
        tn.a((byte) 94);
        bq.a((byte) 25);
        dw.a((byte) 101);
        ria.i(-30362);
        ioa.i(-99);
        jaa.a(true);
        lfa.i(5353);
        boa.a(false);
        ska.c(884207088);
        fu.n((byte) -51);
        fra.b(-27203);
        ro.f(-107);
        cv.n((byte) 100);
        kva.i(param0 ^ 3665);
        rea.b(12134);
        kga.n((byte) 9);
        rl.d(true);
        oo.j(-115);
        sea.b(param0 ^ -25894);
        aia.i(-87);
        ki.a(false);
        lma.n((byte) -123);
        cda.n((byte) 112);
        ce.l(30389);
        lpa.b(1);
        im.j((byte) 124);
        aka.o((byte) 120);
        vsa.q((byte) -125);
        pqa.n((byte) -126);
        ao.i(param0 + 3543);
        eq.b(15602);
        rh.l(15);
        dja.l(1);
        wh.l(-127);
        nk.b(20);
        rq.a();
        si.B(118);
        kna.y(0);
        cu.c(-1);
        kpa.a(70);
        oma.r((byte) 112);
        fqa.A(1);
        jma.e(71);
        f.c(24641);
        vka.e(false);
        uk.s((byte) 120);
        ra.B(-12);
        gea.b(param0 + 3666);
        wqa.e(true);
        tl.l(16711422);
        mg.e(9980);
        bla.e(true);
        lea.r((byte) -72);
        aja.A(32076);
        gd.e(true);
        bg.e((byte) 67);
        pt.e(param0 + 3666);
        dna.r((byte) 102);
        tca.D(15);
        ln.B(15);
        ps.s((byte) 44);
        aw.A(4);
        mc.g((byte) -105);
        mh.A(-121);
        mj.s((byte) -12);
        sm.l(11162931);
        er.s((byte) 25);
        bia.C(param0 + 4197970);
        eia.l(param0 ^ -3655);
        wpa.D(-129);
        ge.r((byte) 119);
        jh.D(param0 ^ 3597);
        ipa.D(4);
        sua.B(105);
        spa.d(true);
        ona.A(7);
        kt.A(-121);
        wha.r((byte) 79);
        hia.e(param0 + 3680);
        md.A(123);
        wta.r((byte) 15);
        wfa.r((byte) -123);
        lda.r((byte) -90);
        df.s((byte) -18);
        hn.e(false);
        tp.t((byte) 75);
        jb.s((byte) -66);
        nja.f(false);
        uka.t((byte) 79);
        ga.A(4096);
        wi.e((byte) -92);
        ava.a(-1);
        rga.a((byte) 99);
        pea.a((byte) -100);
        km.a(-98);
        nka.a((byte) -75);
        jla.b(-23884);
        rr.b(param0 + 3666);
        kd.a((byte) -121);
        jsa.e(2);
        so.m(param0 + 3866);
        tra.j(68);
        lc.e(false);
        rk.a(30548);
        laa.a(param0 ^ -19478);
        lga.a((byte) -123);
        mha.b(-23897);
        sd.g((byte) 10);
        io.a((byte) -57);
        pg.a(param0 + 3666);
        bc.a(118);
        esa.a((byte) 102);
        ci.a((byte) -79);
        ija.a((byte) 97);
        bf.a(true);
        pna.e(110);
        tw.b(122);
        cka.t(7312);
        hsa.b(param0 ^ -3693);
        uua.a((byte) -120);
        uv.f(0);
        oba.a((byte) -14);
        mq.a(26860);
        jja.a(false);
        cb.d(param0 ^ -33413);
        kl.c(1956);
        rt.g(-1);
        np.d(0);
        tj.a(360);
        qf.g((byte) -93);
        hoa.g(34067);
        eo.x((byte) 3);
        gj.a(-119);
        una.a(true);
        hk.a(param0 + 3674);
        asa.e(14);
        ura.a(false);
        kp.a(false);
        vw.a((byte) 101);
        ld.a((byte) -126);
        mna.a(false);
        gja.g(3);
        ft.a((byte) 102);
        fp.b(29325);
        dn.a(0);
        ne.a(15);
        iw.a(false);
        kda.T(32885);
        tq.a(0);
        po.a(false);
        vp.e(63);
        k.e(0);
        op.f(-87);
        bra.i((byte) 86);
        vua.a((byte) -4);
        jo.g((byte) -126);
        q.a(8);
        ql.a(true);
        iha.a();
        sk.b(33);
        hma.b(param0 + 11858);
        pb.a((byte) 98);
        ie.b(-13170);
        tja.a(false);
        qb.b((byte) 90);
        paa.k((byte) 77);
        fk.b(-116);
        fj.b(-2);
        dta.a(0);
        hva.a();
        cs.a(3840);
        hi.c(6);
        rb.g((byte) -119);
        hj.a(false);
        sg.b(-2);
        av.b(false);
        wn.b(123);
        wma.b(125);
        bn.d(false);
        koa.a(-108);
        mma.a(-1901);
        ula.g((byte) 42);
        nj.e((byte) -99);
        bha.e(param0 + 12227);
        ws.e(1);
        uqa.j((byte) -94);
        osa.e(91);
        uha.e(115);
        sa.e(-73);
        ira.j((byte) 91);
        rsa.j((byte) 124);
        oqa.g(11683);
        lo.e(1);
        nta.a(-25821);
        of.b(param0 ^ -3599);
        fva.a(115);
        jra.a(19290);
        rja.a(-21755);
        tna.a(true);
        coa.c(16711680);
        gia.c(-26382);
        tga.a(61);
        nga.d((byte) -119);
        lm.c(7438);
        bma.d(-21771);
        wja.c(0);
        eka.c(param0 ^ 3612);
        fs.c(-92);
        pv.d((byte) -93);
        wna.d((byte) -109);
        vda.d((byte) 90);
        ifa.d((byte) 117);
        gla.d((byte) -102);
        nw.d((byte) 118);
        vc.c(3);
        wsa.c(-33);
        hb.b(true);
        vla.c(param0 ^ -3668);
        nfa.d((byte) -123);
        nia.c(-124);
        sba.c(param0 ^ 14527);
        hv.a(false);
        bj.a(true);
        iia.c(-1);
        rda.c(-118);
        ksa.c(param0 ^ 17000);
        qv.a(true);
        un.a(true);
        jv.c(param0 ^ 12863);
        go.d((byte) -105);
        voa.c(0);
        bk.d((byte) 101);
        cna.a(param0 ^ 3646);
        qq.a();
        ita.a((byte) 48);
        lp.a((byte) 34);
        hna.a(121);
        nsa.a(false);
        iga.a(param0 ^ -3634);
        r.a(11);
        kka.c((byte) -87);
        qfa.a(true);
        cua.a(3);
        lha.a((byte) 91);
        kba.a((byte) -48);
        qe.a(-18318);
        aaa.a((byte) -75);
        ku.d(120);
        pm.a((byte) 79);
        fd.b((byte) -124);
        cp.b(-197);
        qk.j(param0 + 3771);
        cla.a(param0 ^ -3666);
        tla.a((byte) 124);
        wba.e(-25657);
        ota.a(0);
        nm.a((byte) 70);
        o.d(param0 ^ -3666);
        wo.c(34962);
        lra.c(18168);
        ns.c(2);
        kw.c(125);
        uga.g(-12242);
        tva.c(-125);
        ma.c(9681);
        rpa.a((byte) -58);
        fca.a(-1);
        oca.a(false);
        hs.a(32768);
        to.c(-114);
        ll.a((byte) 83);
        gca.b(4);
        hka.a(false);
        tda.c((byte) 103);
        gh.a(param0 + 3657);
        jq.d((byte) -112);
        vta.d(36070);
        em.d(0);
        fn.d(-16973);
        sl.d(param0 + 3666);
        vu.d(-90);
        lba.d(1713718860);
        or.e(24451);
        jg.b((byte) 127);
        dka.b((byte) 7);
        hm.g((byte) 4);
        tfa.c(0);
        pe.e(0);
        dma.a(-31784);
        jd.a(32242);
        bta.d(false);
        mf.a(false);
        dp.d(13936);
        hl.e(-127);
        dqa.a((byte) 11);
        rba.a((byte) -92);
        pda.a((byte) -114);
        vja.a(30000);
        eta.a(29574);
        wka.c(-31068);
        ooa.d(119);
        jga.a((byte) -3);
        pua.a((byte) -115);
        hq.b(-6682);
        pr.a(28122);
        vt.a((byte) 117);
        wl.a((byte) -66);
        iea.a(-1);
        bb.a(false);
        kb.a(param0 ^ 3618);
        lqa.a((byte) 102);
        kea.a(-7646);
        kia.a((byte) 107);
        pfa.b(param0 + 3670);
        cc.a(0);
        wk.b((byte) -54);
        qg.a(param0 ^ 2973);
        ur.a(-17614);
        td.b(-113);
        hga.b((byte) 126);
        poa.c((byte) 112);
        rg.h((byte) -127);
        tka.c((byte) -55);
        mu.d((byte) 101);
        lt.a(param0 ^ 3690);
        cga.a(true);
        mi.a((byte) 101);
        bfa.a(17049);
        ela.a(126);
        rv.a(-31950);
        in.a(true);
        cr.b((byte) -128);
        us.a(-1);
        fta.b(0);
        rha.a(-29867);
        aca.a(false);
        mp.a(9);
        aua.a(true);
        ic.a(true);
        mga.a(param0 ^ -35493);
        nl.a((byte) -117);
        tc.b(17129);
        hda.b((byte) -128);
        wc.b((byte) -78);
        gba.a(true);
        vk.a(param0 ^ -3666);
        mm.a((byte) -44);
        sda.a(-1);
        bd.a(119);
        pq.a(0);
        sja.b((byte) -126);
        nt.a(true);
        fpa.a(1451);
        ak.f(-50);
        dia.a(true);
        lq.f(param0 ^ -31324);
        wr.a((byte) -90);
        tb.a((byte) -125);
        jf.a((byte) 2);
        ng.a((byte) 46);
        kha.a(param0 + 3665);
        ema.a(48);
        pu.a((byte) -53);
        fua.a(param0 + 3540);
        haa.b(121);
        je.g((byte) -119);
        ik.a((byte) -104);
        toa.a(3402);
        cia.b(-1);
        lw.b(70);
        waa.a(param0 ^ -7488);
        oea.a((byte) -49);
        rp.a(true);
        ad.b(-10);
        wm.a((byte) 115);
        fv.a((byte) -101);
        gsa.a(1);
        it.a(-99);
        kma.a((byte) -91);
        dpa.a(param0 + 3665);
        oia.b(false);
        lca.a(-22593);
        bt.a(-1);
        eh.a((byte) -114);
        faa.a(false);
        cva.b(1);
        jm.b(false);
        hqa.f(-1852);
        mn.f(-58);
        jba.f(501386288);
        oe.b((byte) -112);
        sla.a(param0 ^ 9054);
        bm.a(717);
        uo.a((byte) 10);
        pa.a((byte) 117);
        afa.a((byte) 58);
        aba.a(true);
        ot.b((byte) -86);
        pn.g(-93);
        hg.a(param0 ^ -15106);
        gg.a((byte) -107);
        gta.a(false);
        eda.a(45);
        mca.a(0);
        dq.a(8148);
        tba.a(0);
        woa.a(-20476);
        qja.a(param0 ^ 3694);
        oda.a(true);
        hra.a(false);
        rra.a(false);
        nma.b(false);
        qo.b(true);
        dca.g(param0 + 3668);
        ((TombRacer) this).field_x = null;
        ((TombRacer) this).field_H = null;
        ((TombRacer) this).field_D = null;
    }

    private final void z(int param0) {
        int var2 = aaa.a(false);
        int var3 = koa.b(0);
        if (mba.e(-22766)) {
            boolean discarded$4 = tga.field_a.h();
            tga.field_a.a(0.8999999761581421f, 1.0f, 1.0f);
            if (tga.field_a.f()) {
                tga.field_a.a(0, 0, var2, var3);
            }
        }
        int var4 = 106 / ((param0 - -73) / 46);
        tga.field_a.GA(0);
        tga.field_a.ya();
        tga.field_a.DA(var2 / 2, var3 / 2, 512, 512);
        tga.field_a.f(8, 16384);
        gda var5 = tga.field_a.b();
        var5.a(0, 0, -1600, 0, 0, 0);
        tga.field_a.a(var5);
    }

    final boolean h(byte param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 == 84) {
            break L0;
          } else {
            ((TombRacer) this).field_E = -98;
            break L0;
          }
        }
        L1: {
          L2: {
            if (vd.field_n) {
              break L2;
            } else {
              if (rpa.field_d) {
                break L2;
              } else {
                if (!vda.field_q) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          stackOut_6_0 = 1;
          stackIn_8_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    public TombRacer() {
        ((TombRacer) this).field_E = 0;
        ((TombRacer) this).field_H = new cja();
        ad.field_j = (TombRacer) this;
    }

    final void v(int param0) {
        kga.i(98);
        if (param0 != 24230) {
            ((TombRacer) this).h(-10);
        }
        if (2147483647 == jm.field_n) {
        } else {
            if (jm.field_n == -2) {
                uv.d(30785);
            } else {
                ira.a(false, jm.field_n, (byte) -46);
            }
            jm.field_n = 2147483647;
        }
        if (uma.field_c) {
            if (rba.field_a != null) {
                rba.field_a.o(-18570);
            }
        }
    }

    public final void a(boolean param0, boolean param1) {
        taa var4 = null;
        int stackIn_10_0 = 0;
        ila stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        ila stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        ila stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        ila stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        int stackIn_27_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        ila stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        ila stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        ila stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        ila stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        L0: {
          ((TombRacer) this).field_E = ((TombRacer) this).field_E + 1;
          if (null != mq.field_e) {
            break L0;
          } else {
            if (vpa.a(114)) {
              break L0;
            } else {
              ql.field_k.k(75, -2988);
              break L0;
            }
          }
        }
        L1: {
          if (null == mq.field_e) {
            break L1;
          } else {
            if (mq.field_e.a(54) <= 0) {
              break L1;
            } else {
              if (((TombRacer) this).field_D != null) {
                break L1;
              } else {
                if ((Object) (Object) hb.field_t == (Object) (Object) rba.field_a) {
                  break L1;
                } else {
                  L2: {
                    var4 = mq.field_e.c(43);
                    if (param0) {
                      stackOut_9_0 = 0;
                      stackIn_10_0 = stackOut_9_0;
                      break L2;
                    } else {
                      stackOut_8_0 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      break L2;
                    }
                  }
                  L3: {
                    if (rd.b(stackIn_10_0 == 0)) {
                      break L3;
                    } else {
                      if (var4.b(1)) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  ((TombRacer) this).field_D = new rca(rba.field_a, var4);
                  break L1;
                }
              }
            }
          }
        }
        L4: {
          L5: {
            stackOut_14_0 = iqa.field_c;
            stackOut_14_1 = -91;
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (null == rba.field_a) {
              break L5;
            } else {
              stackOut_15_0 = (ila) (Object) stackIn_15_0;
              stackOut_15_1 = stackIn_15_1;
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              if ((Object) (Object) hb.field_t != (Object) (Object) rba.field_a) {
                break L5;
              } else {
                stackOut_16_0 = (ila) (Object) stackIn_16_0;
                stackOut_16_1 = stackIn_16_1;
                stackOut_16_2 = 1;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_18_2 = stackOut_16_2;
                break L4;
              }
            }
          }
          stackOut_17_0 = (ila) (Object) stackIn_17_0;
          stackOut_17_1 = stackIn_17_1;
          stackOut_17_2 = 0;
          stackIn_18_0 = stackOut_17_0;
          stackIn_18_1 = stackOut_17_1;
          stackIn_18_2 = stackOut_17_2;
          break L4;
        }
        L6: {
          ((ila) (Object) stackIn_18_0).a((byte) stackIn_18_1, stackIn_18_2 != 0, false);
          if (param0) {
            break L6;
          } else {
            ((TombRacer) this).field_E = 123;
            break L6;
          }
        }
        L7: {
          if (((TombRacer) this).field_D == null) {
            L8: {
              if (wm.field_a == null) {
                break L8;
              } else {
                if (wm.field_a instanceof ala) {
                  break L8;
                } else {
                  wm.field_a.a(false, false, 15283);
                  break L8;
                }
              }
            }
            hb.field_t.a(true, param1, 15283);
            if (cs.field_c == null) {
              break L7;
            } else {
              if (wka.field_d) {
                cs.field_c.a(false, false, 15283);
                break L7;
              } else {
                break L7;
              }
            }
          } else {
            L9: {
              ((TombRacer) this).field_D.a((byte) -109);
              if (((TombRacer) this).field_D.d((byte) -75)) {
                ((TombRacer) this).field_D = null;
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              if (null != ((TombRacer) this).field_D) {
                stackOut_26_0 = 0;
                stackIn_27_0 = stackOut_26_0;
                break L10;
              } else {
                stackOut_25_0 = 1;
                stackIn_27_0 = stackOut_25_0;
                break L10;
              }
            }
            param1 = stackIn_27_0 != 0;
            break L7;
          }
        }
        L11: {
          L12: {
            if (!vd.field_n) {
              break L12;
            } else {
              if ((Object) (Object) rba.field_a != (Object) (Object) hb.field_t) {
                break L11;
              } else {
                break L12;
              }
            }
          }
          rp.a(8824);
          break L11;
        }
        ((TombRacer) this).field_H.b((byte) -66);
        ipa.s((byte) 49);
    }

    final void h(int param0) {
        L0: {
          ((TombRacer) this).a(82, 81);
          ((TombRacer) this).a((eb) (Object) new sra(), 119);
          if (param0 <= -15) {
            break L0;
          } else {
            this.z(125);
            break L0;
          }
        }
        foa.field_b = false;
        ce.j(32454);
        vca.field_c[81] = -1;
        vca.field_c[75] = -1;
        vca.field_c[74] = -2;
        vca.field_c[89] = 2;
        vca.field_c[80] = -1;
        vca.field_c[69] = 1;
        vca.field_c[85] = -1;
        vca.field_c[72] = -1;
        vca.field_c[93] = -1;
        vca.field_c[70] = 1;
        vca.field_c[71] = 1;
        vca.field_c[82] = -1;
        vca.field_c[84] = -1;
        vca.field_c[67] = 1;
        vca.field_c[88] = 0;
        vca.field_c[87] = -1;
        vca.field_c[90] = -1;
        vca.field_c[64] = -2;
        vca.field_c[77] = -1;
        vca.field_c[83] = -1;
        vca.field_c[68] = 1;
        vca.field_c[91] = -1;
        vca.field_c[79] = -2;
        vca.field_c[86] = -2;
        vca.field_c[92] = -1;
        vca.field_c[65] = -2;
        vca.field_c[78] = -1;
        vca.field_c[76] = -1;
    }

    public static void y(int param0) {
        field_F = null;
        if (param0 < 88) {
            TombRacer.y(44);
        }
    }

    final boolean a(int param0, kh param1, byte param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int[] var4_array = null;
        int var5_int = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String[] var9 = null;
        int var10 = 0;
        int var11_int = 0;
        BitSet[] var11 = null;
        boolean[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int[] var18 = null;
        gqa var19 = null;
        String var20 = null;
        jha var21 = null;
        gqa var22 = null;
        String var23 = null;
        jha var24 = null;
        boolean[] var25 = null;
        aoa var26 = null;
        bga var27 = null;
        kh var28 = null;
        int[] var29 = null;
        boolean[] var32 = null;
        int[] var33 = null;
        boolean[] var36 = null;
        int[] var37 = null;
        int[] var39 = null;
        boolean[] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        int[] var45 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_114_0 = 0;
        boolean stackIn_116_0 = false;
        RuntimeException stackIn_118_0 = null;
        StringBuilder stackIn_118_1 = null;
        RuntimeException stackIn_119_0 = null;
        StringBuilder stackIn_119_1 = null;
        RuntimeException stackIn_120_0 = null;
        StringBuilder stackIn_120_1 = null;
        String stackIn_120_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_104_0 = 0;
        boolean stackOut_115_0 = false;
        int stackOut_113_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_117_0 = null;
        StringBuilder stackOut_117_1 = null;
        RuntimeException stackOut_119_0 = null;
        StringBuilder stackOut_119_1 = null;
        String stackOut_119_2 = null;
        RuntimeException stackOut_118_0 = null;
        StringBuilder stackOut_118_1 = null;
        String stackOut_118_2 = null;
        var16 = field_G ? 1 : 0;
        try {
          L0: {
            if (param0 != 75) {
              if (param0 != 9) {
                if (param0 != 14) {
                  if (15 != param0) {
                    L1: {
                      if (10 != param0) {
                        break L1;
                      } else {
                        if (!vd.field_n) {
                          break L1;
                        } else {
                          qt.a(-64);
                          stackOut_20_0 = 1;
                          stackIn_21_0 = stackOut_20_0;
                          return stackIn_21_0 != 0;
                        }
                      }
                    }
                    if (param0 == 11) {
                      L2: {
                        var19 = ila.a(-18787, false);
                        k.a((byte) 124, var19);
                        if (null == rba.field_a) {
                          break L2;
                        } else {
                          if (!var19.field_m) {
                            var20 = var19.field_g;
                            var21 = im.a(var19.field_d, var19.field_f, 100, rba.field_a.a(false, var20), var20);
                            iqa.field_c.a(0, var21);
                            break L2;
                          } else {
                            return true;
                          }
                        }
                      }
                      stackOut_28_0 = 1;
                      stackIn_29_0 = stackOut_28_0;
                      return stackIn_29_0 != 0;
                    } else {
                      if (param2 > 34) {
                        if (12 != param0) {
                          if (param0 == 76) {
                            var4_int = param1.h(255);
                            var5_int = 0;
                            L3: while (true) {
                              if (var4_int <= var5_int) {
                                stackOut_44_0 = 1;
                                stackIn_45_0 = stackOut_44_0;
                                return stackIn_45_0 != 0;
                              } else {
                                String discarded$2 = param1.e((byte) -76);
                                var5_int++;
                                continue L3;
                              }
                            }
                          } else {
                            L4: {
                              if (64 == param0) {
                                break L4;
                              } else {
                                if (param0 != 65) {
                                  if (param0 != 66) {
                                    if (param0 == 86) {
                                      if (toa.field_j) {
                                        stackOut_75_0 = 1;
                                        stackIn_76_0 = stackOut_75_0;
                                        return stackIn_76_0 != 0;
                                      } else {
                                        L5: {
                                          var26 = new aoa();
                                          var26.a(param1, (byte) -19);
                                          mq.field_e = var26.a(false);
                                          mq.field_e.field_a = mq.field_e.field_o.get(78);
                                          mp.a(2, mq.field_e.field_h);
                                          cf.a(mq.field_e.field_k, -114);
                                          if (null == baa.field_d) {
                                            break L5;
                                          } else {
                                            if (baa.field_d.field_i != null) {
                                              eda.a(mq.field_e.field_g, true);
                                              break L5;
                                            } else {
                                              break L5;
                                            }
                                          }
                                        }
                                        L6: {
                                          if (!wka.field_d) {
                                            break L6;
                                          } else {
                                            if (mq.field_e.field_l) {
                                              break L6;
                                            } else {
                                              if (bh.field_p) {
                                                break L6;
                                              } else {
                                                caa.a((byte) 101);
                                                break L6;
                                              }
                                            }
                                          }
                                        }
                                        stackOut_85_0 = 1;
                                        stackIn_86_0 = stackOut_85_0;
                                        return stackIn_86_0 != 0;
                                      }
                                    } else {
                                      if (param0 == 85) {
                                        if (null == mq.field_e) {
                                          stackOut_91_0 = 1;
                                          stackIn_92_0 = stackOut_91_0;
                                          return stackIn_92_0 != 0;
                                        } else {
                                          var27 = new bga();
                                          var27.a(param1, (byte) -19);
                                          var27.a(mq.field_e, (byte) -128);
                                          stackOut_93_0 = 1;
                                          stackIn_94_0 = stackOut_93_0;
                                          return stackIn_94_0 != 0;
                                        }
                                      } else {
                                        if (87 != param0) {
                                          if (88 == param0) {
                                            dea.a(60);
                                            stackOut_100_0 = 1;
                                            stackIn_101_0 = stackOut_100_0;
                                            return stackIn_101_0 != 0;
                                          } else {
                                            if (param0 == 89) {
                                              uca.field_a = param1.c((byte) 71);
                                              ea.field_j = param1.c((byte) 48);
                                              stackOut_104_0 = 1;
                                              stackIn_105_0 = stackOut_104_0;
                                              return stackIn_105_0 != 0;
                                            } else {
                                              if (param0 != 72) {
                                                stackOut_115_0 = this.a(param1, param0, (byte) 111);
                                                stackIn_116_0 = stackOut_115_0;
                                                break L0;
                                              } else {
                                                var42 = fqa.e(true);
                                                var37 = var42;
                                                var33 = var37;
                                                var29 = var33;
                                                var4_array = var29;
                                                var17 = var4_array;
                                                var5 = var17;
                                                var28 = param1;
                                                var7 = ((uia) (Object) var28).h(255);
                                                var8 = 0;
                                                L7: while (true) {
                                                  if (var7 <= var8) {
                                                    var43 = sb.a(0, var42);
                                                    ((TombRacer) this).field_H.a((byte) 6, var43);
                                                    var44 = rb.field_o;
                                                    var39 = var44;
                                                    var18 = var39;
                                                    var45 = var4_array;
                                                    var8 = 0;
                                                    L8: while (true) {
                                                      if (var8 >= 8) {
                                                        stackOut_113_0 = 1;
                                                        stackIn_114_0 = stackOut_113_0;
                                                        return stackIn_114_0 != 0;
                                                      } else {
                                                        var18[var8] = fh.a(var44[var8], var45[var8]);
                                                        var8++;
                                                        continue L8;
                                                      }
                                                    }
                                                  } else {
                                                    var17[var8] = ((uia) (Object) var28).e(-41);
                                                    var8++;
                                                    continue L7;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          gh.a(param1, (byte) -79);
                                          stackOut_96_0 = 1;
                                          stackIn_97_0 = stackOut_96_0;
                                          return stackIn_97_0 != 0;
                                        }
                                      }
                                    }
                                  } else {
                                    L9: {
                                      if (rba.field_a == null) {
                                        break L9;
                                      } else {
                                        rba.field_a.b(false, true, 0);
                                        ira.a(false, -2, (byte) -33);
                                        iqa.field_c.d(96);
                                        break L9;
                                      }
                                    }
                                    vda.field_q = false;
                                    stackOut_69_0 = 1;
                                    stackIn_70_0 = stackOut_69_0;
                                    return stackIn_70_0 != 0;
                                  }
                                } else {
                                  break L4;
                                }
                              }
                            }
                            L10: {
                              var4_int = param1.e(-108);
                              if (0 == param1.h(255)) {
                                stackOut_51_0 = 0;
                                stackIn_52_0 = stackOut_51_0;
                                break L10;
                              } else {
                                stackOut_50_0 = 1;
                                stackIn_52_0 = stackOut_50_0;
                                break L10;
                              }
                            }
                            var5_int = stackIn_52_0;
                            var6 = param1.h(255);
                            var7 = param1.h(255);
                            var8 = param1.h(255);
                            var9 = new String[param1.h(255)];
                            var10 = param1.c((byte) 94);
                            var11_int = 0;
                            L11: while (true) {
                              if (var11_int >= var9.length) {
                                var11 = new BitSet[var9.length];
                                param1.h((byte) -96);
                                var41 = new boolean[var9.length];
                                var36 = var41;
                                var32 = var36;
                                var25 = var32;
                                var12 = var25;
                                var13 = 0;
                                L12: while (true) {
                                  if (var11.length <= var13) {
                                    param1.i((byte) 98);
                                    qv.field_o = null;
                                    rba.field_a = new qh(true, var4_int, var9, var10, var5_int != 0, var6, -1 + var6, var7, var8, 0, var11, var41, (ou) null);
                                    rba.field_a.a(120, param1);
                                    rba.field_a.j((byte) -121);
                                    iqa.field_c.a(-68);
                                    ira.a(false, -1, (byte) 83);
                                    vda.field_q = false;
                                    stackOut_64_0 = 1;
                                    stackIn_65_0 = stackOut_64_0;
                                    return stackIn_65_0 != 0;
                                  } else {
                                    var12[var13] = uha.a(5907, param1);
                                    var14 = pa.b((byte) 121);
                                    var11[var13] = new BitSet(var14);
                                    var15 = 0;
                                    L13: while (true) {
                                      if (var14 <= var15) {
                                        var13++;
                                        continue L12;
                                      } else {
                                        L14: {
                                          if (uha.a(5907, param1)) {
                                            var11[var13].set(var15);
                                            break L14;
                                          } else {
                                            break L14;
                                          }
                                        }
                                        boolean discarded$3 = var11[var13].get(var15);
                                        var15++;
                                        continue L13;
                                      }
                                    }
                                  }
                                }
                              } else {
                                var9[var11_int] = param1.e((byte) -76);
                                var11_int++;
                                continue L11;
                              }
                            }
                          }
                        } else {
                          L15: {
                            var22 = ila.a(-18787, true);
                            k.a((byte) 114, var22);
                            if (rba.field_a == null) {
                              break L15;
                            } else {
                              if (var22.field_m) {
                                break L15;
                              } else {
                                var23 = var22.field_g;
                                var24 = im.a(var22.field_d, var22.field_f, -87, rba.field_a.a(false, var23), var23);
                                iqa.field_c.a(0, var24);
                                break L15;
                              }
                            }
                          }
                          stackOut_37_0 = 1;
                          stackIn_38_0 = stackOut_37_0;
                          return stackIn_38_0 != 0;
                        }
                      } else {
                        stackOut_31_0 = 0;
                        stackIn_32_0 = stackOut_31_0;
                        return stackIn_32_0 != 0;
                      }
                    }
                  } else {
                    L16: {
                      if (vd.field_n) {
                        cv.o((byte) -108);
                        ik.a(5);
                        era.field_c = true;
                        vd.field_n = false;
                        iqa.field_c.c(88);
                        ira.a(false, 0, (byte) 111);
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    rpa.field_d = false;
                    vda.field_q = false;
                    stackOut_16_0 = 1;
                    stackIn_17_0 = stackOut_16_0;
                    return stackIn_17_0 != 0;
                  }
                } else {
                  uha.a(mh.r((byte) 107), lla.a(false, 4), (byte) -51, vo.e(35040), lla.a(false, 2000), ws.field_o.length, jf.field_t, 1024, oh.b(19845), 150);
                  us.a(-8250, mo.b(-80), fa.b((byte) 123));
                  vd.field_n = true;
                  rpa.field_d = false;
                  ira.a(false, -2, (byte) 90);
                  stackOut_10_0 = 1;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0 != 0;
                }
              } else {
                rpa.field_d = false;
                ira.a(false, 1, (byte) -77);
                vj.a(param1.e((byte) -76), -79);
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              }
            } else {
              L17: {
                if (null == rba.field_a) {
                  break L17;
                } else {
                  var4_int = param1.e(113);
                  ql.field_k.k(69, -2988);
                  ql.field_k.a(var4_int, (byte) 125);
                  rba.field_a.b(106, param1);
                  break L17;
                }
              }
              stackOut_4_0 = 1;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var4 = decompiledCaughtException;
            stackOut_117_0 = (RuntimeException) var4;
            stackOut_117_1 = new StringBuilder().append("TombRacer.CB(").append(param0).append(',');
            stackIn_119_0 = stackOut_117_0;
            stackIn_119_1 = stackOut_117_1;
            stackIn_118_0 = stackOut_117_0;
            stackIn_118_1 = stackOut_117_1;
            if (param1 == null) {
              stackOut_119_0 = (RuntimeException) (Object) stackIn_119_0;
              stackOut_119_1 = (StringBuilder) (Object) stackIn_119_1;
              stackOut_119_2 = "null";
              stackIn_120_0 = stackOut_119_0;
              stackIn_120_1 = stackOut_119_1;
              stackIn_120_2 = stackOut_119_2;
              break L18;
            } else {
              stackOut_118_0 = (RuntimeException) (Object) stackIn_118_0;
              stackOut_118_1 = (StringBuilder) (Object) stackIn_118_1;
              stackOut_118_2 = "{...}";
              stackIn_120_0 = stackOut_118_0;
              stackIn_120_1 = stackOut_118_1;
              stackIn_120_2 = stackOut_118_2;
              break L18;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_120_0, stackIn_120_2 + ',' + param2 + ')');
        }
        return stackIn_116_0;
    }

    public final void init() {
        ((TombRacer) this).a(31, 640, 480, "tombracer", 20575);
    }

    final void d(int param0) {
        if (param0 != -66) {
            ((TombRacer) this).v(83);
        }
        jm.b((byte) 122);
        nd.a((byte) 55);
        if (dq.field_f != null) {
            og.b(0);
        }
        dfa.c((byte) 62);
    }

    private final void x(int param0) {
        L0: {
          if (!mba.e(-22766)) {
            tga.field_a.a(0, (ob[]) null);
            if (dia.field_o == null) {
              break L0;
            } else {
              if (!dia.field_o.a(-2)) {
                break L0;
              } else {
                tga.field_a.SA(0, 0, bea.field_g, bea.field_a, bea.field_l, 0, bea.field_g);
                break L0;
              }
            }
          } else {
            tga.field_a.a(0, (ob[]) null);
            if (dia.field_o == null) {
              break L0;
            } else {
              if (!dia.field_o.a(-2)) {
                break L0;
              } else {
                tga.field_a.SA(0, 0, bea.field_g, bea.field_a, bea.field_l, 0, bea.field_g);
                break L0;
              }
            }
          }
        }
    }

    private final boolean a(kh param0, int param1, byte param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        jha var9 = null;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_39_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var10 = field_G ? 1 : 0;
        try {
          L0: {
            if (null != rba.field_a) {
              if (74 != param1) {
                if (param1 == 67) {
                  var4_int = param0.c((byte) 102);
                  rba.field_a.a((byte) -54, var4_int);
                  stackOut_9_0 = 1;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0 != 0;
                } else {
                  if (68 == param1) {
                    var4_int = param0.h(255);
                    var5 = 0;
                    L1: while (true) {
                      if (var5 >= rba.field_a.field_k.field_k) {
                        rba.field_a.field_k.field_b = var4_int;
                        stackOut_21_0 = 1;
                        stackIn_22_0 = stackOut_21_0;
                        return stackIn_22_0 != 0;
                      } else {
                        L2: {
                          var6 = 1 & var4_int >> var5;
                          var7 = 1 & rba.field_a.field_k.field_b >> var5;
                          if (var6 != var7) {
                            if (1 == var6) {
                              var8 = rba.field_a.field_k.c(var5, 0);
                              var9 = im.a(1, gl.a((byte) 107, ad.field_h, new String[1]), 111, var5, var8);
                              iqa.field_c.a(0, var9);
                              break L2;
                            } else {
                              break L2;
                            }
                          } else {
                            break L2;
                          }
                        }
                        var5++;
                        continue L1;
                      }
                    }
                  } else {
                    if (param1 == 69) {
                      var4_int = param0.h(255);
                      rba.field_a.d(5, var4_int);
                      stackOut_25_0 = 1;
                      stackIn_26_0 = stackOut_25_0;
                      return stackIn_26_0 != 0;
                    } else {
                      if (param1 == 70) {
                        rba.field_a.field_k.field_t = param0.h(255);
                        stackOut_29_0 = 1;
                        stackIn_30_0 = stackOut_29_0;
                        return stackIn_30_0 != 0;
                      } else {
                        if (param1 == 71) {
                          var4_int = param0.h(255);
                          rba.field_a.a(var4_int, (byte) -23);
                          stackOut_33_0 = 1;
                          stackIn_34_0 = stackOut_33_0;
                          return stackIn_34_0 != 0;
                        } else {
                          if (!rba.field_a.a(param1, -4, param0)) {
                            stackOut_38_0 = 0;
                            stackIn_39_0 = stackOut_38_0;
                            break L0;
                          } else {
                            stackOut_36_0 = 1;
                            stackIn_37_0 = stackOut_36_0;
                            return stackIn_37_0 != 0;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) var4;
            stackOut_40_1 = new StringBuilder().append("TombRacer.VA(");
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param0 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L3;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_43_0, stackIn_43_2 + ',' + param1 + ',' + 111 + ')');
        }
        return stackIn_39_0 != 0;
    }

    final void b(int param0, int param1) {
        int var4 = 0;
        L0: {
          var4 = field_G ? 1 : 0;
          ql.a(2, -28521);
          if (param1 >= 107) {
            break L0;
          } else {
            ((TombRacer) this).field_D = null;
            break L0;
          }
        }
        L1: {
          ki.b(false, 3);
          ua.b(4, 2);
          gw.b(-104, 6);
          mda.b(7, (byte) -120);
          if (param0 != 1) {
            L2: {
              if (!vd.field_n) {
                break L2;
              } else {
                L3: {
                  L4: {
                    era.field_c = true;
                    if (null == rba.field_a) {
                      break L4;
                    } else {
                      if (rba.field_a.d((byte) 79)) {
                        break L4;
                      } else {
                        vj.a(ph.field_k, -114);
                        rba.field_a = null;
                        ira.a(false, 1, (byte) 122);
                        break L3;
                      }
                    }
                  }
                  wm.field_a = null;
                  rba.field_a = null;
                  fp.a(-82);
                  ira.a(false, 0, (byte) 124);
                  break L3;
                }
                ((wv) (Object) hb.field_t).a(0, 0, false);
                vd.field_n = false;
                iqa.field_c.c(-89);
                break L2;
              }
            }
            vda.field_q = false;
            rpa.field_d = false;
            break L1;
          } else {
            vda.field_q = true;
            rpa.field_d = true;
            break L1;
          }
        }
    }

    public final void b(int param0) {
        if (param0 != 1) {
            Object var3 = null;
            this.a(false, (rqa) null, (byte) 51);
        }
        ih.D(17229);
        cna.field_a = false;
        if (oq.a((byte) 124).a(~param0)) {
            return;
        }
        this.a(true, (rqa) (Object) rba.field_a, (byte) 17);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find a suitable opponent in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
    }
}
