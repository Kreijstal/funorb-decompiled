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
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        boolean stackOut_46_0 = false;
        int stackOut_45_0 = 0;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
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
                if (var4_int == 0) {
                  break L13;
                } else {
                  if (!lca.a(false)) {
                    tga.field_a.SA(0, 0, bea.field_g, bea.field_a, bea.field_l, 0, bea.field_g);
                    break L13;
                  } else {
                    tga.field_a.c(-1073741824, 0, aaa.a(false), 0, -22971, koa.b(0));
                    var5 = f.a(false);
                    var6 = gw.A(-1);
                    var7 = m.A(param2 + -7128);
                    int discarded$2 = 124;
                    var8 = rs.a();
                    var9 = uja.a((byte) 65, tga.field_a);
                    var9.a(var5 + var7, var6, (byte) -12, var6 + var8, var5);
                    tga.field_a.SA(0, 0, bea.field_g, bea.field_a, bea.field_l, 0, bea.field_g);
                    var9.a(99);
                    break L13;
                  }
                }
              }
              int discarded$3 = -28581;
              this.x();
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var4 = decompiledCaughtException;
            stackOut_54_0 = (RuntimeException) var4;
            stackOut_54_1 = new StringBuilder().append("TombRacer.FB(").append(param0).append(44);
            stackIn_56_0 = stackOut_54_0;
            stackIn_56_1 = stackOut_54_1;
            stackIn_55_0 = stackOut_54_0;
            stackIn_55_1 = stackOut_54_1;
            if (param1 == null) {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "null";
              stackIn_57_0 = stackOut_56_0;
              stackIn_57_1 = stackOut_56_1;
              stackIn_57_2 = stackOut_56_2;
              break L14;
            } else {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "{...}";
              stackIn_57_0 = stackOut_55_0;
              stackIn_57_1 = stackOut_55_1;
              stackIn_57_2 = stackOut_55_2;
              break L14;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_57_0, stackIn_57_2 + 44 + param2 + 41);
        }
    }

    final void e(int param0) {
        TombRacer.y(param0 + 3787);
        int discarded$0 = -90;
        cq.a();
        gt.a(127);
        pba.a(4096);
        int discarded$1 = 91;
        vna.b();
        bea.d();
        gda.a(27316);
        ssa.d(-98);
        nba.a(false);
        int discarded$2 = -23172;
        fa.a();
        int discarded$3 = 0;
        kh.g();
        mua.a(0);
        bpa.a((byte) -57);
        int discarded$4 = 13902;
        rma.b();
        int discarded$5 = 32;
        hp.a();
        di.c(param0 + -19099);
        int discarded$6 = 119;
        nla.a();
        int discarded$7 = 0;
        tk.a();
        int discarded$8 = 0;
        bi.a();
        int discarded$9 = -29262;
        dga.a();
        ke.a(3712);
        int discarded$10 = 0;
        wv.a();
        int discarded$11 = 126;
        se.e();
        oka.d(-120);
        ufa.b(param0 ^ -3638);
        taa.a((byte) 9);
        fw.a(0);
        int discarded$12 = -122;
        qha.c();
        ou.a(113);
        rm.a(param0 + 12213);
        kla.a(param0 ^ 11134);
        id.c(param0 ^ -3666);
        v.e(param0 ^ -3666);
        bga.a(200);
        int discarded$13 = 63;
        aoa.a();
        int discarded$14 = 30152;
        eca.a();
        qea.a(-3);
        int discarded$15 = 1;
        rc.a();
        int discarded$16 = 125;
        rfa.w();
        ug.l(param0 ^ 3665);
        int discarded$17 = 0;
        lr.a();
        jna.c((byte) -88);
        hua.a(param0 ^ -3666);
        int discarded$18 = 14979;
        qaa.a();
        int discarded$19 = 0;
        cn.d();
        int discarded$20 = 1;
        uia.a();
        bva.a((byte) -13);
        s.a(true);
        int discarded$21 = 0;
        oi.a();
        sj.a(true);
        msa.a(param0 ^ -3666);
        int discarded$22 = 95;
        gqa.a();
        qd.a(22442);
        int discarded$23 = -59;
        ip.b();
        int discarded$24 = 1;
        cha.a();
        int discarded$25 = 53;
        ina.a();
        int discarded$26 = 64;
        via.a();
        vm.e(param0 ^ -27015);
        int discarded$27 = -125;
        tia.a();
        int discarded$28 = -104;
        dfa.b();
        ala.c(0);
        qh.b(false);
        gq.f(39);
        int discarded$29 = -1;
        ej.a();
        int discarded$30 = 5193;
        uaa.a();
        int discarded$31 = -124;
        iaa.a();
        int discarded$32 = -95;
        nb.a();
        int discarded$33 = 114;
        eu.a();
        vn.a((byte) 0);
        int discarded$34 = 1;
        no.b();
        int discarded$35 = -35;
        sra.c();
        int discarded$36 = 120;
        kk.a();
        kra.a(param0 ^ 1916);
        int discarded$37 = 2;
        ega.a();
        int discarded$38 = 0;
        ff.f();
        int discarded$39 = 63;
        vea.a();
        int discarded$40 = 0;
        qda.c();
        fma.a((byte) -127);
        ph.a(true);
        int discarded$41 = -97;
        jqa.a();
        int discarded$42 = -1;
        nda.a();
        sq.a(true);
        int discarded$43 = 0;
        fla.a();
        int discarded$44 = 0;
        ru.a();
        int discarded$45 = -109;
        dra.a();
        int discarded$46 = -101;
        w.a();
        int discarded$47 = 1;
        fna.a();
        ko.b(-100);
        dda.a(30967);
        int discarded$48 = 640;
        vha.a();
        me.a(17355);
        dl.d((byte) 96);
        fda.a(param0 + 3574);
        int discarded$49 = -6884;
        du.a();
        int discarded$50 = 126;
        hf.g();
        qw.a(true);
        int discarded$51 = -1;
        tu.c();
        kq.a(param0 ^ 11052);
        qra.b(param0 + 3762);
        hca.D(-1);
        int discarded$52 = 0;
        goa.b();
        int discarded$53 = -31014;
        kv.a();
        pl.a(0);
        int discarded$54 = -12;
        lu.a();
        la.p(-128);
        tt.a(4);
        vg.o(param0 ^ -3621);
        int discarded$55 = -75;
        hw.a();
        int discarded$56 = 1;
        fr.a();
        int discarded$57 = -17;
        ta.d();
        int discarded$58 = 0;
        oj.a();
        um.a((byte) 18);
        int discarded$59 = -107;
        jea.c();
        int discarded$60 = -39;
        ola.d();
        hla.f(23613);
        int discarded$61 = 67;
        lja.b();
        int discarded$62 = 1;
        wla.a();
        pha.d((byte) -68);
        int discarded$63 = -113;
        ht.d();
        af.a(123);
        int discarded$64 = -33;
        re.a();
        od.b(0);
        il.a();
        int discarded$65 = 124;
        ji.f();
        int discarded$66 = -19;
        rf.a();
        int discarded$67 = 0;
        g.a();
        wea.a(8);
        int discarded$68 = 1;
        ub.a();
        pra.a(param0 + 3548);
        int discarded$69 = -124;
        tea.a();
        ida.a((byte) 122);
        tv.f(119);
        bv.f(0);
        int discarded$70 = 2;
        is.f();
        kta.b();
        l.c(0);
        int discarded$71 = -25809;
        qt.b();
        int discarded$72 = 126;
        iqa.a();
        int discarded$73 = -29;
        fga.a();
        int discarded$74 = 0;
        ck.a();
        int discarded$75 = 91;
        wu.a();
        gva.a(param0 ^ -14342);
        int discarded$76 = -114;
        rn.a();
        dt.n(param0 ^ param0);
        int discarded$77 = 53;
        dva.a();
        int discarded$78 = -116;
        aq.b();
        wd.a(3);
        int discarded$79 = -120;
        kqa.a();
        sma.a(-98);
        int discarded$80 = 103;
        cfa.c();
        ds.a(false);
        int discarded$81 = 97;
        bua.a();
        int discarded$82 = -1;
        uma.a();
        int discarded$83 = 119;
        hu.a();
        int discarded$84 = 86;
        za.a();
        int discarded$85 = -63;
        qla.a();
        oc.a((byte) -71);
        ka.a(-11);
        int discarded$86 = 0;
        ob.a();
        vj.a(param0 + 3556);
        uta.c(0);
        int discarded$87 = -124;
        gka.a();
        int discarded$88 = 117;
        lh.a();
        int discarded$89 = -53;
        sw.i();
        ara.a(false);
        wj.a((byte) 41);
        int discarded$90 = 0;
        jta.c();
        gga.f(param0 + 3666);
        kn.a(-3);
        int discarded$91 = -126;
        dsa.a();
        int discarded$92 = 1;
        fb.a();
        int discarded$93 = 0;
        rua.g();
        vs.i((byte) -77);
        mpa.f(param0 ^ -3666);
        int discarded$94 = 7707;
        ij.f();
        mr.f(0);
        int discarded$95 = 99;
        tha.c();
        jw.c(91);
        efa.c(true);
        hd.a(param0 + 32687);
        int discarded$96 = 101;
        lsa.a();
        int discarded$97 = 25;
        qma.a();
        int discarded$98 = 0;
        hh.a();
        int discarded$99 = 3;
        fha.a();
        int discarded$100 = 1;
        hba.a();
        jr.a((byte) -87);
        int discarded$101 = 96;
        vga.b();
        bsa.a((byte) -33);
        int discarded$102 = 47;
        cj.a();
        uja.b(param0 ^ -3668);
        int discarded$103 = -28;
        ae.e();
        qr.b(param0 ^ -3666);
        int discarded$104 = 0;
        gn.c();
        int discarded$105 = 127;
        bja.c();
        int discarded$106 = -102;
        at.i();
        int discarded$107 = -6;
        dh.a();
        int discarded$108 = 115;
        bw.a();
        ofa.e(0);
        int discarded$109 = 1;
        rla.b();
        int discarded$110 = -124;
        sta.h();
        b.h((byte) 122);
        rva.b(0);
        int discarded$111 = 0;
        joa.a();
        int discarded$112 = 115;
        dr.a();
        int discarded$113 = 0;
        sb.a();
        int discarded$114 = 0;
        qba.a();
        int discarded$115 = 3;
        li.a();
        int discarded$116 = -35;
        ch.a();
        rta.b(-89);
        maa.b();
        int discarded$117 = -48;
        sv.d();
        dea.a(true);
        jn.d(param0 ^ -3610);
        pk.b(true);
        int discarded$118 = 41;
        ai.a();
        epa.d(2);
        int discarded$119 = 108;
        qp.d();
        int discarded$120 = -10;
        vba.d();
        ow.d(param0 ^ 3680);
        int discarded$121 = -127;
        vv.d();
        int discarded$122 = -128;
        rd.d();
        int discarded$123 = -121;
        ct.a();
        int discarded$124 = -107;
        csa.j();
        gfa.b(104);
        int discarded$125 = -124;
        fm.d();
        int discarded$126 = -128;
        sqa.b();
        uw.f(param0 + 3666);
        int discarded$127 = 1;
        pta.b();
        int discarded$128 = -2147483648;
        npa.c();
        int discarded$129 = -28;
        bba.a();
        int discarded$130 = 75;
        tqa.a();
        ui.a(4);
        ts.b(32);
        int discarded$131 = 0;
        fq.b();
        int discarded$132 = -1;
        dj.a();
        fsa.K(8424);
        int discarded$133 = -117;
        db.h();
        int discarded$134 = -113;
        kua.a();
        int discarded$135 = 1;
        pc.a();
        int discarded$136 = 2;
        up.a();
        ep.j(114);
        mda.j((byte) 87);
        int discarded$137 = -63;
        cra.c();
        dk.a((byte) 104);
        ena.a(true);
        int discarded$138 = 66;
        al.a();
        ea.b(0);
        vca.a(param0 ^ -3922);
        foa.a(false);
        int discarded$139 = -116;
        bqa.a();
        int discarded$140 = 48;
        uj.a();
        int discarded$141 = 10;
        cf.a();
        nr.a(false);
        vra.a(param0 ^ -3670);
        int discarded$142 = -105;
        ua.a();
        int discarded$143 = -87;
        lta.a();
        int discarded$144 = 117;
        lf.a();
        wga.a(true);
        int discarded$145 = 0;
        uu.a();
        int discarded$146 = 40;
        ap.a();
        int discarded$147 = 95;
        nra.a();
        int discarded$148 = 1;
        cm.a();
        qpa.a(false);
        int discarded$149 = -121;
        dba.a();
        int discarded$150 = 120;
        ju.a();
        gha.a(param0 + 3542);
        int discarded$151 = -118;
        cea.a();
        eua.f(58);
        nc.a(122);
        int discarded$152 = -125;
        tr.a();
        int discarded$153 = 112;
        wt.a();
        int discarded$154 = 7;
        apa.a();
        int discarded$155 = 97;
        wp.a();
        int discarded$156 = 123;
        bl.a();
        int discarded$157 = -39;
        wb.a();
        int discarded$158 = 33;
        qoa.a();
        uoa.a();
        fg.b();
        int discarded$159 = 65;
        uca.a();
        an.a(-32768);
        int discarded$160 = 9;
        nn.a();
        int discarded$161 = 0;
        nea.a();
        int discarded$162 = 0;
        vaa.a();
        int discarded$163 = -7;
        ml.a();
        he.a(-24962);
        int discarded$164 = 0;
        ol.a();
        pla.b(-1);
        int discarded$165 = 72;
        qu.a();
        kr.a();
        int discarded$166 = -11061;
        aj.a();
        int discarded$167 = 0;
        wca.f();
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
        int discarded$168 = 32;
        on.d();
        int discarded$169 = 2907;
        wf.a();
        int discarded$170 = 62;
        qka.b();
        gp.a(-117);
        int discarded$171 = 1;
        wq.b();
        jia.a((byte) 31);
        bs.a(param0 ^ -3601);
        int discarded$172 = -113;
        aga.a();
        pca.c(param0 + 3674);
        baa.a(param0 + 3786);
        int discarded$173 = 0;
        uh.d();
        int discarded$174 = -55;
        vf.c();
        uda.h(115);
        int discarded$175 = -12224;
        daa.b();
        int discarded$176 = -77;
        ova.d();
        int discarded$177 = -128;
        dua.d();
        ab.f(6153);
        opa.f(param0 + 3766);
        bp.f(0);
        int discarded$178 = -28;
        gu.c();
        int discarded$179 = 114;
        era.a();
        qna.a(-2);
        uba.b((byte) -128);
        fe.e(25);
        int discarded$180 = 0;
        gv.a();
        qqa.a(0);
        int discarded$181 = -1551894744;
        ppa.a();
        int discarded$182 = -117;
        sga.c();
        js.b((byte) -50);
        int discarded$183 = 1;
        qi.f();
        uc.E(7);
        jl.a(param0 ^ -1088533378);
        lk.a(false);
        int discarded$184 = -1;
        mba.d();
        int discarded$185 = 72;
        c.m();
        vh.a(param0 + 3560);
        int discarded$186 = 76;
        jk.b();
        fka.a();
        int discarded$187 = 1;
        aa.a();
        lva.d((byte) -123);
        uq.b(param0 + 3747);
        wg.a(true);
        nv.j(18416);
        wda.d(param0 + 15738);
        bca.b(3);
        ir.a((byte) 104);
        int discarded$188 = 0;
        gpa.a();
        nf.a(param0 + -22136);
        int discarded$189 = 59;
        pd.l();
        pka.a(-1);
        int discarded$190 = 1;
        ana.d();
        int discarded$191 = 91;
        th.g();
        int discarded$192 = -111;
        mka.a();
        int discarded$193 = 23;
        tg.a();
        int discarded$194 = 94;
        tn.a();
        int discarded$195 = 25;
        bq.a();
        dw.a((byte) 101);
        ria.i(-30362);
        int discarded$196 = -99;
        ioa.i();
        int discarded$197 = 1;
        jaa.a();
        int discarded$198 = 5353;
        lfa.i();
        int discarded$199 = 0;
        boa.a();
        ska.c(884207088);
        int discarded$200 = -51;
        fu.n();
        int discarded$201 = -27203;
        fra.b();
        int discarded$202 = -107;
        ro.f();
        int discarded$203 = 100;
        cv.n();
        kva.i(param0 ^ 3665);
        int discarded$204 = 12134;
        rea.b();
        kga.n((byte) 9);
        int discarded$205 = 1;
        rl.d();
        int discarded$206 = -115;
        oo.j();
        sea.b(param0 ^ -25894);
        int discarded$207 = -87;
        aia.i();
        int discarded$208 = 0;
        ki.a();
        int discarded$209 = -123;
        lma.n();
        int discarded$210 = 112;
        cda.n();
        ce.l(30389);
        int discarded$211 = 1;
        lpa.b();
        int discarded$212 = 124;
        im.j();
        int discarded$213 = 120;
        aka.o();
        vsa.q((byte) -125);
        int discarded$214 = -126;
        pqa.n();
        ao.i(param0 + 3543);
        eq.b(15602);
        int discarded$215 = 15;
        rh.l();
        dja.l(1);
        int discarded$216 = -127;
        wh.l();
        int discarded$217 = 20;
        nk.b();
        rq.a();
        int discarded$218 = 118;
        si.B();
        kna.y(0);
        int discarded$219 = -1;
        cu.c();
        kpa.a(70);
        oma.r((byte) 112);
        int discarded$220 = 1;
        fqa.A();
        int discarded$221 = 71;
        jma.e();
        int discarded$222 = 24641;
        f.c();
        int discarded$223 = 0;
        vka.e();
        uk.s((byte) 120);
        int discarded$224 = -12;
        ra.B();
        gea.b(param0 + 3666);
        int discarded$225 = 1;
        wqa.e();
        int discarded$226 = 16711422;
        tl.l();
        mg.e(9980);
        int discarded$227 = 1;
        bla.e();
        int discarded$228 = -72;
        lea.r();
        int discarded$229 = 32076;
        aja.A();
        int discarded$230 = 1;
        gd.e();
        int discarded$231 = 67;
        bg.e();
        pt.e(param0 + 3666);
        dna.r((byte) 102);
        tca.D(15);
        int discarded$232 = 15;
        ln.B();
        ps.s((byte) 44);
        int discarded$233 = 4;
        aw.A();
        int discarded$234 = -105;
        mc.g();
        int discarded$235 = -121;
        mh.A();
        int discarded$236 = -12;
        mj.s();
        int discarded$237 = 11162931;
        sm.l();
        int discarded$238 = 25;
        er.s();
        bia.C(param0 + 4197970);
        eia.l(param0 ^ -3655);
        int discarded$239 = -129;
        wpa.D();
        int discarded$240 = 119;
        ge.r();
        jh.D(param0 ^ 3597);
        int discarded$241 = 4;
        ipa.D();
        int discarded$242 = 105;
        sua.B();
        int discarded$243 = 1;
        spa.d();
        ona.A(7);
        int discarded$244 = -121;
        kt.A();
        int discarded$245 = 79;
        wha.r();
        hia.e(param0 + 3680);
        md.A(123);
        int discarded$246 = 15;
        wta.r();
        wfa.r((byte) -123);
        int discarded$247 = -90;
        lda.r();
        int discarded$248 = -18;
        df.s();
        int discarded$249 = 0;
        hn.e();
        int discarded$250 = 75;
        tp.t();
        int discarded$251 = -66;
        jb.s();
        int discarded$252 = 0;
        nja.f();
        uka.t((byte) 79);
        int discarded$253 = 4096;
        ga.A();
        wi.e((byte) -92);
        int discarded$254 = -1;
        ava.a();
        int discarded$255 = 99;
        rga.a();
        pea.a((byte) -100);
        int discarded$256 = -98;
        km.a();
        int discarded$257 = -75;
        nka.a();
        int discarded$258 = -23884;
        jla.b();
        rr.b(param0 + 3666);
        int discarded$259 = -121;
        kd.a();
        jsa.e(2);
        so.m(param0 + 3866);
        int discarded$260 = 68;
        tra.j();
        lc.e(false);
        rk.a(30548);
        laa.a(param0 ^ -19478);
        int discarded$261 = -123;
        lga.a();
        int discarded$262 = -23897;
        mha.b();
        int discarded$263 = 10;
        sd.g();
        int discarded$264 = -57;
        io.a();
        pg.a(param0 + 3666);
        int discarded$265 = 118;
        bc.a();
        int discarded$266 = 102;
        esa.a();
        ci.a((byte) -79);
        int discarded$267 = 97;
        ija.a();
        int discarded$268 = 1;
        bf.a();
        int discarded$269 = 110;
        pna.e();
        int discarded$270 = 122;
        tw.b();
        int discarded$271 = 7312;
        cka.t();
        hsa.b(param0 ^ -3693);
        uua.a((byte) -120);
        uv.f(0);
        oba.a((byte) -14);
        int discarded$272 = 26860;
        mq.a();
        jja.a(false);
        cb.d(param0 ^ -33413);
        int discarded$273 = 1956;
        kl.c();
        int discarded$274 = -1;
        rt.g();
        int discarded$275 = 0;
        np.d();
        int discarded$276 = 360;
        tj.a();
        qf.g((byte) -93);
        int discarded$277 = 34067;
        hoa.g();
        int discarded$278 = 3;
        eo.x();
        int discarded$279 = -119;
        gj.a();
        int discarded$280 = 1;
        una.a();
        hk.a(param0 + 3674);
        asa.e(14);
        int discarded$281 = 0;
        ura.a();
        int discarded$282 = 0;
        kp.a();
        int discarded$283 = 101;
        vw.a();
        int discarded$284 = -126;
        ld.a();
        mna.a(false);
        int discarded$285 = 3;
        gja.g();
        int discarded$286 = 102;
        ft.a();
        fp.b(29325);
        int discarded$287 = 0;
        dn.a();
        ne.a(15);
        int discarded$288 = 0;
        iw.a();
        int discarded$289 = 32885;
        kda.T();
        int discarded$290 = 0;
        tq.a();
        int discarded$291 = 0;
        po.a();
        vp.e(63);
        k.e(0);
        int discarded$292 = -87;
        op.f();
        bra.i((byte) 86);
        vua.a((byte) -4);
        int discarded$293 = -126;
        jo.g();
        int discarded$294 = 8;
        q.a();
        ql.a(true);
        iha.a();
        sk.b(33);
        hma.b(param0 + 11858);
        pb.a((byte) 98);
        ie.b(-13170);
        int discarded$295 = 0;
        tja.a();
        qb.b((byte) 90);
        int discarded$296 = 77;
        paa.k();
        int discarded$297 = -116;
        fk.b();
        int discarded$298 = -2;
        fj.b();
        int discarded$299 = 0;
        dta.a();
        hva.a();
        int discarded$300 = 3840;
        cs.a();
        int discarded$301 = 6;
        hi.c();
        rb.g((byte) -119);
        int discarded$302 = 0;
        hj.a();
        int discarded$303 = -2;
        sg.b();
        int discarded$304 = 0;
        av.b();
        int discarded$305 = 123;
        wn.b();
        int discarded$306 = 125;
        wma.b();
        int discarded$307 = 0;
        bn.d();
        koa.a(-108);
        int discarded$308 = -1901;
        mma.a();
        int discarded$309 = 42;
        ula.g();
        int discarded$310 = -99;
        nj.e();
        bha.e(param0 + 12227);
        ws.e(1);
        int discarded$311 = -94;
        uqa.j();
        osa.e(91);
        int discarded$312 = 115;
        uha.e();
        int discarded$313 = -73;
        sa.e();
        int discarded$314 = 91;
        ira.j();
        int discarded$315 = 124;
        rsa.j();
        int discarded$316 = 11683;
        oqa.g();
        lo.e(1);
        int discarded$317 = -25821;
        nta.a();
        of.b(param0 ^ -3599);
        int discarded$318 = 115;
        fva.a();
        jra.a(19290);
        rja.a(-21755);
        int discarded$319 = 1;
        tna.a();
        coa.c(16711680);
        gia.c(-26382);
        int discarded$320 = 61;
        tga.a();
        int discarded$321 = -119;
        nga.d();
        int discarded$322 = 7438;
        lm.c();
        int discarded$323 = -21771;
        bma.d();
        wja.c(0);
        eka.c(param0 ^ 3612);
        int discarded$324 = -92;
        fs.c();
        int discarded$325 = -93;
        pv.d();
        wna.d((byte) -109);
        int discarded$326 = 90;
        vda.d();
        int discarded$327 = 117;
        ifa.d();
        gla.d((byte) -102);
        nw.d((byte) 118);
        int discarded$328 = 3;
        vc.c();
        int discarded$329 = -33;
        wsa.c();
        int discarded$330 = 1;
        hb.b();
        vla.c(param0 ^ -3668);
        nfa.d((byte) -123);
        int discarded$331 = -124;
        nia.c();
        sba.c(param0 ^ 14527);
        hv.a(false);
        int discarded$332 = 1;
        bj.a();
        int discarded$333 = -1;
        iia.c();
        int discarded$334 = -118;
        rda.c();
        ksa.c(param0 ^ 17000);
        int discarded$335 = 1;
        qv.a();
        int discarded$336 = 1;
        un.a();
        jv.c(param0 ^ 12863);
        int discarded$337 = -105;
        go.d();
        int discarded$338 = 0;
        voa.c();
        int discarded$339 = 101;
        bk.d();
        cna.a(param0 ^ 3646);
        qq.a();
        int discarded$340 = 48;
        ita.a();
        int discarded$341 = 34;
        lp.a();
        hna.a(121);
        int discarded$342 = 0;
        nsa.a();
        iga.a(param0 ^ -3634);
        r.a(11);
        int discarded$343 = -87;
        kka.c();
        int discarded$344 = 1;
        qfa.a();
        int discarded$345 = 3;
        cua.a();
        lha.a((byte) 91);
        int discarded$346 = -48;
        kba.a();
        qe.a(-18318);
        int discarded$347 = -75;
        aaa.a();
        int discarded$348 = 120;
        ku.d();
        int discarded$349 = 79;
        pm.a();
        int discarded$350 = -124;
        fd.b();
        cp.b(-197);
        qk.j(param0 + 3771);
        cla.a(param0 ^ -3666);
        int discarded$351 = 124;
        tla.a();
        wba.e(-25657);
        ota.a(0);
        int discarded$352 = 70;
        nm.a();
        o.d(param0 ^ -3666);
        wo.c(34962);
        lra.c(18168);
        int discarded$353 = 2;
        ns.c();
        int discarded$354 = 125;
        kw.c();
        int discarded$355 = -12242;
        uga.g();
        tva.c(-125);
        ma.c(9681);
        int discarded$356 = -58;
        rpa.a();
        int discarded$357 = -1;
        fca.a();
        int discarded$358 = 0;
        oca.a();
        int discarded$359 = 32768;
        hs.a();
        to.c(-114);
        int discarded$360 = 83;
        ll.a();
        gca.b(4);
        hka.a(false);
        int discarded$361 = 103;
        tda.c();
        gh.a(param0 + 3657);
        int discarded$362 = -112;
        jq.d();
        vta.d(36070);
        em.d(0);
        int discarded$363 = -16973;
        fn.d();
        sl.d(param0 + 3666);
        int discarded$364 = -90;
        vu.d();
        lba.d(1713718860);
        int discarded$365 = 24451;
        or.e();
        jg.b((byte) 127);
        int discarded$366 = 7;
        dka.b();
        hm.g((byte) 4);
        tfa.c(0);
        int discarded$367 = 0;
        pe.e();
        int discarded$368 = -31784;
        dma.a();
        int discarded$369 = 32242;
        jd.a();
        bta.d(false);
        mf.a(false);
        int discarded$370 = 13936;
        dp.d();
        int discarded$371 = -127;
        hl.e();
        int discarded$372 = 11;
        dqa.a();
        int discarded$373 = -92;
        rba.a();
        int discarded$374 = -114;
        pda.a();
        int discarded$375 = 30000;
        vja.a();
        eta.a(29574);
        int discarded$376 = -31068;
        wka.c();
        int discarded$377 = 119;
        ooa.d();
        int discarded$378 = -3;
        jga.a();
        int discarded$379 = -115;
        pua.a();
        int discarded$380 = -6682;
        hq.b();
        int discarded$381 = 28122;
        pr.a();
        vt.a((byte) 117);
        wl.a((byte) -66);
        int discarded$382 = -1;
        iea.a();
        bb.a(false);
        kb.a(param0 ^ 3618);
        int discarded$383 = 102;
        lqa.a();
        kea.a(-7646);
        int discarded$384 = 107;
        kia.a();
        pfa.b(param0 + 3670);
        cc.a(0);
        int discarded$385 = -54;
        wk.b();
        qg.a(param0 ^ 2973);
        int discarded$386 = -17614;
        ur.a();
        td.b(-113);
        int discarded$387 = 126;
        hga.b();
        poa.c((byte) 112);
        int discarded$388 = -127;
        rg.h();
        int discarded$389 = -55;
        tka.c();
        int discarded$390 = 101;
        mu.d();
        lt.a(param0 ^ 3690);
        int discarded$391 = 1;
        cga.a();
        mi.a((byte) 101);
        bfa.a(17049);
        ela.a(126);
        int discarded$392 = -31950;
        rv.a();
        int discarded$393 = 1;
        in.a();
        int discarded$394 = -128;
        cr.b();
        int discarded$395 = -1;
        us.a();
        int discarded$396 = 0;
        fta.b();
        int discarded$397 = -29867;
        rha.a();
        int discarded$398 = 0;
        aca.a();
        mp.a(9);
        int discarded$399 = 1;
        aua.a();
        int discarded$400 = 1;
        ic.a();
        mga.a(param0 ^ -35493);
        int discarded$401 = -117;
        nl.a();
        int discarded$402 = 17129;
        tc.b();
        hda.b((byte) -128);
        wc.b((byte) -78);
        int discarded$403 = 1;
        gba.a();
        vk.a(param0 ^ -3666);
        int discarded$404 = -44;
        mm.a();
        int discarded$405 = -1;
        sda.a();
        bd.a(119);
        pq.a(0);
        int discarded$406 = -126;
        sja.b();
        int discarded$407 = 1;
        nt.a();
        int discarded$408 = 1451;
        fpa.a();
        int discarded$409 = -50;
        ak.f();
        int discarded$410 = 1;
        dia.a();
        lq.f(param0 ^ -31324);
        int discarded$411 = -90;
        wr.a();
        tb.a((byte) -125);
        int discarded$412 = 2;
        jf.a();
        ng.a((byte) 46);
        kha.a(param0 + 3665);
        int discarded$413 = 48;
        ema.a();
        int discarded$414 = -53;
        pu.a();
        fua.a(param0 + 3540);
        int discarded$415 = 121;
        haa.b();
        int discarded$416 = -119;
        je.g();
        int discarded$417 = -104;
        ik.a();
        int discarded$418 = 3402;
        toa.a();
        cia.b(-1);
        int discarded$419 = 70;
        lw.b();
        waa.a(param0 ^ -7488);
        int discarded$420 = -49;
        oea.a();
        rp.a(true);
        int discarded$421 = -10;
        ad.b();
        wm.a((byte) 115);
        int discarded$422 = -101;
        fv.a();
        int discarded$423 = 1;
        gsa.a();
        int discarded$424 = -99;
        it.a();
        kma.a((byte) -91);
        dpa.a(param0 + 3665);
        oia.b(false);
        lca.a(-22593);
        bt.a(-1);
        int discarded$425 = -114;
        eh.a();
        faa.a(false);
        cva.b(1);
        jm.b(false);
        int discarded$426 = -1852;
        hqa.f();
        int discarded$427 = -58;
        mn.f();
        int discarded$428 = 501386288;
        jba.f();
        int discarded$429 = -112;
        oe.b();
        sla.a(param0 ^ 9054);
        int discarded$430 = 717;
        bm.a();
        uo.a((byte) 10);
        int discarded$431 = 117;
        pa.a();
        afa.a((byte) 58);
        int discarded$432 = 1;
        aba.a();
        ot.b((byte) -86);
        int discarded$433 = -93;
        pn.g();
        hg.a(param0 ^ -15106);
        gg.a((byte) -107);
        gta.a(false);
        int discarded$434 = 45;
        eda.a();
        int discarded$435 = 0;
        mca.a();
        int discarded$436 = 8148;
        dq.a();
        int discarded$437 = 0;
        tba.a();
        int discarded$438 = -20476;
        woa.a();
        qja.a(param0 ^ 3694);
        int discarded$439 = 1;
        oda.a();
        int discarded$440 = 0;
        hra.a();
        rra.a(false);
        int discarded$441 = 0;
        nma.b();
        int discarded$442 = 1;
        qo.b();
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
        int discarded$3 = 98;
        kga.i();
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
        int discarded$1 = 49;
        ipa.s();
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
        int discarded$1 = 32454;
        ce.j();
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
                                String discarded$9 = param1.e((byte) -76);
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
                                            int discarded$10 = 60;
                                            dea.a();
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
                                                int discarded$11 = 111;
                                                stackOut_115_0 = this.a(param1, param0);
                                                stackIn_116_0 = stackOut_115_0;
                                                break L0;
                                              } else {
                                                int discarded$12 = 1;
                                                var42 = fqa.e();
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
                                        boolean discarded$13 = var11[var13].get(var15);
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
                  int discarded$14 = 107;
                  int discarded$15 = 35040;
                  int discarded$16 = 19845;
                  uha.a(mh.r(), lla.a(false, 4), (byte) -51, vo.e(), lla.a(false, 2000), ws.field_o.length, jf.field_t, 1024, oh.b(), 150);
                  int discarded$17 = 123;
                  us.a(-8250, mo.b(-80), fa.b());
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
            stackOut_117_1 = new StringBuilder().append("TombRacer.CB(").append(param0).append(44);
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
          throw tba.a((Throwable) (Object) stackIn_120_0, stackIn_120_2 + 44 + param2 + 41);
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
        int discarded$2 = 122;
        jm.b();
        nd.a((byte) 55);
        if (dq.field_f != null) {
            int discarded$3 = 0;
            og.b();
        }
        int discarded$4 = 62;
        dfa.c();
    }

    private final void x() {
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

    private final boolean a(kh param0, int param1) {
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
          throw tba.a((Throwable) (Object) stackIn_43_0, stackIn_43_2 + 44 + param1 + 44 + 111 + 41);
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
          int discarded$30 = 2;
          int discarded$31 = 4;
          ua.b();
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
        int discarded$0 = 17229;
        ih.D();
        cna.field_a = false;
        int discarded$4 = 124;
        if (oq.a().a(~param0)) {
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
