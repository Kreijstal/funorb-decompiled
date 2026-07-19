/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vrb extends rqa {
    vrb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static boolean a(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 < -89) {
          L0: {
            L1: {
              if (fda.e((byte) 120)) {
                break L1;
              } else {
                if (-1 > (hcb.field_o ^ -1)) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = 1;
            stackIn_7_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return false;
        }
    }

    final nc a(nc[] param0, int param1) {
        boolean discarded$2 = false;
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_2_0 = null;
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
              if (param1 < -119) {
                break L1;
              } else {
                discarded$2 = vrb.a(106);
                break L1;
              }
            }
            si.a(215, 62, param0[0].a(123));
            stackOut_2_0 = new nc("void");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("vrb.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(byte[] param0, int param1, int param2, asb param3, String[] param4, String[][] param5, phb[][] param6, int param7, phb[][] param8, String[][] param9, String[] param10, byte[] param11, int param12, String[] param13, int[] param14) {
        cna[] array$3 = null;
        cna[] array$4 = null;
        cna[] array$5 = null;
        RuntimeException var15 = null;
        llb var16 = null;
        int var17_int = 0;
        llb var17 = null;
        int var18 = 0;
        Object var19_ref = null;
        int var19 = 0;
        Object var20 = null;
        int var21 = 0;
        llb var23 = null;
        llb var24 = null;
        llb stackIn_5_0 = null;
        llb stackIn_5_1 = null;
        long stackIn_5_2 = 0L;
        llb stackIn_5_3 = null;
        llb stackIn_6_0 = null;
        llb stackIn_6_1 = null;
        long stackIn_6_2 = 0L;
        llb stackIn_6_3 = null;
        llb stackIn_7_0 = null;
        llb stackIn_7_1 = null;
        long stackIn_7_2 = 0L;
        llb stackIn_7_3 = null;
        String stackIn_7_4 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_84_2 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        String stackIn_87_2 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        String stackIn_90_2 = null;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        String stackIn_93_2 = null;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        String stackIn_96_2 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_99_2 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        String stackIn_102_2 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_105_2 = null;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        RuntimeException stackIn_108_0 = null;
        StringBuilder stackIn_108_1 = null;
        String stackIn_108_2 = null;
        RuntimeException stackIn_109_0 = null;
        StringBuilder stackIn_109_1 = null;
        RuntimeException stackIn_110_0 = null;
        StringBuilder stackIn_110_1 = null;
        RuntimeException stackIn_111_0 = null;
        StringBuilder stackIn_111_1 = null;
        String stackIn_111_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        llb stackOut_4_0 = null;
        llb stackOut_4_1 = null;
        long stackOut_4_2 = 0L;
        llb stackOut_4_3 = null;
        llb stackOut_6_0 = null;
        llb stackOut_6_1 = null;
        long stackOut_6_2 = 0L;
        llb stackOut_6_3 = null;
        String stackOut_6_4 = null;
        llb stackOut_5_0 = null;
        llb stackOut_5_1 = null;
        long stackOut_5_2 = 0L;
        llb stackOut_5_3 = null;
        String stackOut_5_4 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        String stackOut_86_2 = null;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        String stackOut_85_2 = null;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        RuntimeException stackOut_89_0 = null;
        StringBuilder stackOut_89_1 = null;
        String stackOut_89_2 = null;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        String stackOut_88_2 = null;
        RuntimeException stackOut_90_0 = null;
        StringBuilder stackOut_90_1 = null;
        RuntimeException stackOut_92_0 = null;
        StringBuilder stackOut_92_1 = null;
        String stackOut_92_2 = null;
        RuntimeException stackOut_91_0 = null;
        StringBuilder stackOut_91_1 = null;
        String stackOut_91_2 = null;
        RuntimeException stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        String stackOut_95_2 = null;
        RuntimeException stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        String stackOut_94_2 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        String stackOut_98_2 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        String stackOut_101_2 = null;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        String stackOut_100_2 = null;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        String stackOut_104_2 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        String stackOut_103_2 = null;
        RuntimeException stackOut_105_0 = null;
        StringBuilder stackOut_105_1 = null;
        RuntimeException stackOut_107_0 = null;
        StringBuilder stackOut_107_1 = null;
        String stackOut_107_2 = null;
        RuntimeException stackOut_106_0 = null;
        StringBuilder stackOut_106_1 = null;
        String stackOut_106_2 = null;
        RuntimeException stackOut_108_0 = null;
        StringBuilder stackOut_108_1 = null;
        RuntimeException stackOut_110_0 = null;
        StringBuilder stackOut_110_1 = null;
        String stackOut_110_2 = null;
        RuntimeException stackOut_109_0 = null;
        StringBuilder stackOut_109_1 = null;
        String stackOut_109_2 = null;
        var21 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              wja.field_c = param4;
              sha.field_w = param2;
              nkb.field_r = param7;
              hqb.field_k = param9;
              ieb.field_o = param14;
              hva.field_c = param10;
              ea.field_k = param13;
              awa.field_o = param5;
              gm.field_M = param0;
              mg.field_o = param6;
              vva.field_u = param11;
              hwa.field_p = param8;
              sqb.field_o = wjb.a(param3, true, "lobby", "gameprivacy");
              hnb.field_U = wjb.a(param3, true, "lobby", "ratedgame");
              atb.field_b = wjb.a(param3, true, "lobby", "opentome");
              lcb.field_t = wjb.a(param3, true, "lobby", "allowspectators");
              uka.field_p = new String[5];
              uka.field_p[2] = tja.field_b;
              uka.field_p[3] = gkb.field_q;
              uka.field_p[1] = uh.field_o;
              uka.field_p[0] = uob.field_f;
              uka.field_p[4] = ikb.field_o;
              fh.field_f = new llb(0L, (llb) null);
              me.field_q = new llb(0L, sdb.field_p, kpb.field_r);
              epa.field_o = new llb(0L, qsa.field_d, k.field_p);
              tja.field_a = new soa(0L, new llb(0L, (llb) null), htb.field_w, cab.field_o);
              fh.field_f.b(-561, me.field_q);
              if (ll.field_o) {
                fh.field_f.b(param1 + -10792, epa.field_o);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              fh.field_f.b(param1 + -10792, tja.field_a);
              tja.field_a.field_xb.a(param1 + 8214, qc.field_q);
              var23 = tja.field_a.field_xb;
              var24 = var23;
              tja.field_a.field_xb.field_B = 1;
              var24.field_F = 1;
              nna.field_v = new llb(0L, qc.field_q);
              nna.field_v.field_F = 1;
              gmb.field_c = new llb(0L, vj.field_q, bw.field_a.toUpperCase());
              qpb.field_w = new llb(0L, pa.field_a, cta.field_o.toUpperCase());
              sra.field_a = new llb(0L, as.field_c);
              fwa.field_a = new llb(0L, sdb.field_p, bo.field_o);
              wrb.field_q = new llb(0L, ki.field_p, lw.field_e);
              gs.field_b = new llb(0L, ki.field_p, sc.field_b);
              mqb.field_C = new llb(0L, ki.field_p, qdb.field_e);
              jna.field_o = new llb(0L, ki.field_p, gq.field_o);
              uga.field_h = new llb(0L, qsa.field_d, tea.field_c);
              rgb.field_f = new soa(0L, new llb(0L, (llb) null), htb.field_w, cab.field_o);
              gha.field_p = new llb(0L, qcb.field_p, ev.field_b.toUpperCase());
              gha.field_p.field_y = ll.field_o;
              stackOut_4_0 = null;
              stackOut_4_1 = null;
              stackOut_4_2 = 0L;
              stackOut_4_3 = qcb.field_p;
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              stackIn_6_3 = stackOut_4_3;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              stackIn_5_3 = stackOut_4_3;
              if (ll.field_o) {
                stackOut_6_0 = null;
                stackOut_6_1 = null;
                stackOut_6_2 = stackIn_6_2;
                stackOut_6_3 = (llb) ((Object) stackIn_6_3);
                stackOut_6_4 = uab.field_a;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                stackIn_7_2 = stackOut_6_2;
                stackIn_7_3 = stackOut_6_3;
                stackIn_7_4 = stackOut_6_4;
                break L2;
              } else {
                stackOut_5_0 = null;
                stackOut_5_1 = null;
                stackOut_5_2 = stackIn_5_2;
                stackOut_5_3 = (llb) ((Object) stackIn_5_3);
                stackOut_5_4 = ueb.field_o;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_7_2 = stackOut_5_2;
                stackIn_7_3 = stackOut_5_3;
                stackIn_7_4 = stackOut_5_4;
                break L2;
              }
            }
            L3: {
              oib.field_a = new llb(stackIn_7_2, stackIn_7_3, ((String) (Object) stackIn_7_4).toUpperCase());
              bqa.field_d = new llb(0L, (llb) null);
              bqa.field_d.b(-561, qpb.field_w);
              bqa.field_d.b(param1 + -10792, sra.field_a);
              sra.field_a.b(-561, fwa.field_a);
              sra.field_a.b(-561, wrb.field_q);
              sra.field_a.b(param1 ^ -9672, gs.field_b);
              if (!ll.field_o) {
                break L3;
              } else {
                sra.field_a.b(param1 ^ -9672, mqb.field_C);
                break L3;
              }
            }
            L4: {
              sra.field_a.b(-561, jna.field_o);
              sra.field_a.b(-561, uga.field_h);
              sra.field_a.b(-561, rgb.field_f);
              if (ll.field_o) {
                bqa.field_d.b(-561, gha.field_p);
                break L4;
              } else {
                break L4;
              }
            }
            bqa.field_d.b(-561, oib.field_a);
            nbb.field_y = new llb(0L, qc.field_q);
            nbb.field_y.field_F = 1;
            nbb.field_y.field_B = 0;
            ss.field_o = new llb(0L, hnb.field_X, tia.field_K.toUpperCase());
            dd.field_o = new llb(0L, fh.field_g);
            dd.field_o.b(-561, nbb.field_y);
            dd.field_o.b(-561, ss.field_o);
            wo.field_p = new llb(0L, htb.field_w);
            wo.field_p.a(18445, qc.field_q);
            var16 = wo.field_p;
            wo.field_p.field_B = 1;
            if (param1 == 10231) {
              L5: {
                var16.field_F = 1;
                rsa.field_o = new llb(0L, (llb) null);
                ukb.field_o = new llb(0L, qc.field_q);
                ukb.field_o.field_F = 1;
                jn.field_a = new llb(0L, sdb.field_p, kpb.field_r);
                vqb.field_o = new llb(0L, qsa.field_d, k.field_p);
                rga.field_f = new soa(0L, new llb(0L, (llb) null), htb.field_w, cab.field_o);
                rsa.field_o.b(-561, ukb.field_o);
                rsa.field_o.b(-561, jn.field_a);
                if (ll.field_o) {
                  rsa.field_o.b(-561, vqb.field_o);
                  break L5;
                } else {
                  break L5;
                }
              }
              rsa.field_o.b(-561, rga.field_f);
              nt.field_q = new llb(0L, vj.field_q, tua.field_b.toUpperCase());
              rob.field_q = new llb(0L, pa.field_a);
              gt.field_o = new llb(0L, as.field_c);
              aqb.field_e = new llb(0L, bv.field_b, mr.field_J.toUpperCase());
              ceb.field_o = new llb[4 + param12];
              inb.field_q = new cna[4 + param12][];
              ceb.field_o[0] = new llb(0L, gjb.field_p, tm.field_p);
              inb.field_q[0] = new cna[6];
              var17_int = 0;
              L6: while (true) {
                if ((var17_int ^ -1) <= -6) {
                  L7: {
                    if ((ieb.field_o.length ^ -1) <= -3) {
                      ceb.field_o[1] = new llb(0L, gjb.field_p, uda.field_a);
                      array$3 = new cna[1 + ieb.field_o.length];
                      inb.field_q[1] = array$3;
                      inb.field_q[1][0] = new cna(0L, tia.field_M, (llb) null, iga.field_o, (phb) null, mpb.field_k);
                      var17_int = 0;
                      L8: while (true) {
                        if (var17_int >= ieb.field_o.length) {
                          break L7;
                        } else {
                          inb.field_q[1][var17_int + 1] = new cna(0L, tia.field_M, (llb) null, iga.field_o, (phb) null, Integer.toString(ieb.field_o[var17_int]));
                          var17_int++;
                          continue L8;
                        }
                      }
                    } else {
                      break L7;
                    }
                  }
                  L9: {
                    ceb.field_o[2] = new llb(0L, gjb.field_p, kra.field_b);
                    inb.field_q[2] = new cna[]{new cna(0L, tia.field_M, (llb) null, iga.field_o, (phb) null, mpb.field_k), new cna(0L, tia.field_M, (llb) null, iga.field_o, lcb.field_t[0], nl.field_j), new cna(0L, tia.field_M, (llb) null, iga.field_o, lcb.field_t[1], ns.field_a)};
                    if (-2 > (nkb.field_r ^ -1)) {
                      ceb.field_o[3] = new llb(0L, gjb.field_p, ijb.field_o);
                      array$4 = new cna[1 + nkb.field_r];
                      inb.field_q[3] = array$4;
                      inb.field_q[3][0] = new cna(0L, tia.field_M, (llb) null, iga.field_o, (phb) null, mpb.field_k);
                      var17_int = 0;
                      L10: while (true) {
                        if (var17_int >= nkb.field_r) {
                          break L9;
                        } else {
                          inb.field_q[3][var17_int + 1] = new cna(0L, tia.field_M, (llb) null, iga.field_o, (phb) null, wja.field_c[var17_int]);
                          var17_int++;
                          continue L10;
                        }
                      }
                    } else {
                      break L9;
                    }
                  }
                  var17_int = 0;
                  L11: while (true) {
                    if (param12 <= var17_int) {
                      var17_int = 0;
                      L12: while (true) {
                        if (var17_int >= 4 + param12) {
                          vw.field_a = new llb(0L, qcb.field_p);
                          qsa.field_b = new llb(0L, qcb.field_p);
                          qi.field_p = new llb(0L, mla.field_q);
                          qi.field_p.a(18445, qc.field_q);
                          qi.field_p.field_B = 1;
                          var17 = qi.field_p;
                          var17.field_F = 1;
                          vva.field_r = new llb(0L, (llb) null);
                          vva.field_r.b(-561, rob.field_q);
                          vva.field_r.b(-561, gt.field_o);
                          gt.field_o.b(-561, aqb.field_e);
                          var18 = 0;
                          L13: while (true) {
                            if (4 + param12 <= var18) {
                              vva.field_r.b(param1 + -10792, vw.field_a);
                              vva.field_r.b(-561, qsa.field_b);
                              vva.field_r.b(-561, qi.field_p);
                              sfa.field_d = new llb(0L, lo.field_b, ko.field_d.toUpperCase());
                              rlb.field_a = new llb(0L, hnb.field_X, vsa.field_s.toUpperCase());
                              decompiledRegionSelector0 = 1;
                              break L0;
                            } else {
                              L14: {
                                L15: {
                                  if ((var18 ^ -1) != -2) {
                                    break L15;
                                  } else {
                                    if (ieb.field_o.length < 2) {
                                      break L14;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                                L16: {
                                  if ((var18 ^ -1) != -4) {
                                    break L16;
                                  } else {
                                    if ((nkb.field_r ^ -1) < -2) {
                                      break L16;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                gt.field_o.b(-561, ceb.field_o[var18]);
                                var19 = 0;
                                L17: while (true) {
                                  if (var19 >= inb.field_q[var18].length) {
                                    break L14;
                                  } else {
                                    L18: {
                                      if (null != inb.field_q[var18][var19]) {
                                        gt.field_o.b(-561, inb.field_q[var18][var19]);
                                        break L18;
                                      } else {
                                        break L18;
                                      }
                                    }
                                    var19++;
                                    continue L17;
                                  }
                                }
                              }
                              var18++;
                              continue L13;
                            }
                          }
                        } else {
                          L19: {
                            if (ceb.field_o[var17_int] == null) {
                              break L19;
                            } else {
                              ceb.field_o[var17_int].field_D = 11;
                              break L19;
                            }
                          }
                          L20: {
                            if (inb.field_q[var17_int] != null) {
                              var18 = 0;
                              L21: while (true) {
                                if (var18 >= inb.field_q[var17_int].length) {
                                  break L20;
                                } else {
                                  if (inb.field_q[var17_int][var18] != null) {
                                    L22: {
                                      if (null != inb.field_q[var17_int][var18].field_yb) {
                                        inb.field_q[var17_int][var18].field_yb.field_D = 11;
                                        break L22;
                                      } else {
                                        break L22;
                                      }
                                    }
                                    var18++;
                                    continue L21;
                                  } else {
                                    var18++;
                                    continue L21;
                                  }
                                }
                              }
                            } else {
                              break L20;
                            }
                          }
                          var17_int++;
                          continue L12;
                        }
                      }
                    } else {
                      ceb.field_o[var17_int + 4] = new llb(0L, gjb.field_p, hva.field_c[var17_int]);
                      array$5 = new cna[dla.a(255, (int) gm.field_M[var17_int]) + 1];
                      inb.field_q[var17_int + 4] = array$5;
                      inb.field_q[var17_int + 4][0] = new cna(0L, tia.field_M, (llb) null, iga.field_o, (phb) null, mpb.field_k);
                      var18 = 0;
                      L23: while (true) {
                        if (var18 >= (gm.field_M[var17_int] & 255)) {
                          var17_int++;
                          continue L11;
                        } else {
                          L24: {
                            if (mg.field_o == null) {
                              var19_ref = null;
                              break L24;
                            } else {
                              if (null == mg.field_o[var17_int]) {
                                var19_ref = null;
                                break L24;
                              } else {
                                var19_ref = mg.field_o[var17_int][var18];
                                break L24;
                              }
                            }
                          }
                          L25: {
                            if (null == hqb.field_k) {
                              var20 = null;
                              break L25;
                            } else {
                              if (null == hqb.field_k[var17_int]) {
                                var20 = null;
                                break L25;
                              } else {
                                var20 = hqb.field_k[var17_int][var18];
                                break L25;
                              }
                            }
                          }
                          inb.field_q[4 + var17_int][1 + var18] = new cna(0L, tia.field_M, (llb) null, iga.field_o, (phb) (var19_ref), (String) (var20));
                          var18++;
                          continue L23;
                        }
                      }
                    }
                  }
                } else {
                  inb.field_q[0][1 + var17_int] = new cna(0L, tia.field_M, (llb) null, iga.field_o, sqb.field_o[var17_int], uka.field_p[var17_int]);
                  var17_int++;
                  continue L6;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var15 = decompiledCaughtException;
            stackOut_78_0 = (RuntimeException) (var15);
            stackOut_78_1 = new StringBuilder().append("vrb.B(");
            stackIn_80_0 = stackOut_78_0;
            stackIn_80_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param0 == null) {
              stackOut_80_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackOut_80_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L26;
            } else {
              stackOut_79_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackOut_79_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackOut_79_2 = "{...}";
              stackIn_81_0 = stackOut_79_0;
              stackIn_81_1 = stackOut_79_1;
              stackIn_81_2 = stackOut_79_2;
              break L26;
            }
          }
          L27: {
            stackOut_81_0 = (RuntimeException) ((Object) stackIn_81_0);
            stackOut_81_1 = ((StringBuilder) (Object) stackIn_81_1).append(stackIn_81_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_83_0 = stackOut_81_0;
            stackIn_83_1 = stackOut_81_1;
            stackIn_82_0 = stackOut_81_0;
            stackIn_82_1 = stackOut_81_1;
            if (param3 == null) {
              stackOut_83_0 = (RuntimeException) ((Object) stackIn_83_0);
              stackOut_83_1 = (StringBuilder) ((Object) stackIn_83_1);
              stackOut_83_2 = "null";
              stackIn_84_0 = stackOut_83_0;
              stackIn_84_1 = stackOut_83_1;
              stackIn_84_2 = stackOut_83_2;
              break L27;
            } else {
              stackOut_82_0 = (RuntimeException) ((Object) stackIn_82_0);
              stackOut_82_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackOut_82_2 = "{...}";
              stackIn_84_0 = stackOut_82_0;
              stackIn_84_1 = stackOut_82_1;
              stackIn_84_2 = stackOut_82_2;
              break L27;
            }
          }
          L28: {
            stackOut_84_0 = (RuntimeException) ((Object) stackIn_84_0);
            stackOut_84_1 = ((StringBuilder) (Object) stackIn_84_1).append(stackIn_84_2).append(',');
            stackIn_86_0 = stackOut_84_0;
            stackIn_86_1 = stackOut_84_1;
            stackIn_85_0 = stackOut_84_0;
            stackIn_85_1 = stackOut_84_1;
            if (param4 == null) {
              stackOut_86_0 = (RuntimeException) ((Object) stackIn_86_0);
              stackOut_86_1 = (StringBuilder) ((Object) stackIn_86_1);
              stackOut_86_2 = "null";
              stackIn_87_0 = stackOut_86_0;
              stackIn_87_1 = stackOut_86_1;
              stackIn_87_2 = stackOut_86_2;
              break L28;
            } else {
              stackOut_85_0 = (RuntimeException) ((Object) stackIn_85_0);
              stackOut_85_1 = (StringBuilder) ((Object) stackIn_85_1);
              stackOut_85_2 = "{...}";
              stackIn_87_0 = stackOut_85_0;
              stackIn_87_1 = stackOut_85_1;
              stackIn_87_2 = stackOut_85_2;
              break L28;
            }
          }
          L29: {
            stackOut_87_0 = (RuntimeException) ((Object) stackIn_87_0);
            stackOut_87_1 = ((StringBuilder) (Object) stackIn_87_1).append(stackIn_87_2).append(',');
            stackIn_89_0 = stackOut_87_0;
            stackIn_89_1 = stackOut_87_1;
            stackIn_88_0 = stackOut_87_0;
            stackIn_88_1 = stackOut_87_1;
            if (param5 == null) {
              stackOut_89_0 = (RuntimeException) ((Object) stackIn_89_0);
              stackOut_89_1 = (StringBuilder) ((Object) stackIn_89_1);
              stackOut_89_2 = "null";
              stackIn_90_0 = stackOut_89_0;
              stackIn_90_1 = stackOut_89_1;
              stackIn_90_2 = stackOut_89_2;
              break L29;
            } else {
              stackOut_88_0 = (RuntimeException) ((Object) stackIn_88_0);
              stackOut_88_1 = (StringBuilder) ((Object) stackIn_88_1);
              stackOut_88_2 = "{...}";
              stackIn_90_0 = stackOut_88_0;
              stackIn_90_1 = stackOut_88_1;
              stackIn_90_2 = stackOut_88_2;
              break L29;
            }
          }
          L30: {
            stackOut_90_0 = (RuntimeException) ((Object) stackIn_90_0);
            stackOut_90_1 = ((StringBuilder) (Object) stackIn_90_1).append(stackIn_90_2).append(',');
            stackIn_92_0 = stackOut_90_0;
            stackIn_92_1 = stackOut_90_1;
            stackIn_91_0 = stackOut_90_0;
            stackIn_91_1 = stackOut_90_1;
            if (param6 == null) {
              stackOut_92_0 = (RuntimeException) ((Object) stackIn_92_0);
              stackOut_92_1 = (StringBuilder) ((Object) stackIn_92_1);
              stackOut_92_2 = "null";
              stackIn_93_0 = stackOut_92_0;
              stackIn_93_1 = stackOut_92_1;
              stackIn_93_2 = stackOut_92_2;
              break L30;
            } else {
              stackOut_91_0 = (RuntimeException) ((Object) stackIn_91_0);
              stackOut_91_1 = (StringBuilder) ((Object) stackIn_91_1);
              stackOut_91_2 = "{...}";
              stackIn_93_0 = stackOut_91_0;
              stackIn_93_1 = stackOut_91_1;
              stackIn_93_2 = stackOut_91_2;
              break L30;
            }
          }
          L31: {
            stackOut_93_0 = (RuntimeException) ((Object) stackIn_93_0);
            stackOut_93_1 = ((StringBuilder) (Object) stackIn_93_1).append(stackIn_93_2).append(',').append(param7).append(',');
            stackIn_95_0 = stackOut_93_0;
            stackIn_95_1 = stackOut_93_1;
            stackIn_94_0 = stackOut_93_0;
            stackIn_94_1 = stackOut_93_1;
            if (param8 == null) {
              stackOut_95_0 = (RuntimeException) ((Object) stackIn_95_0);
              stackOut_95_1 = (StringBuilder) ((Object) stackIn_95_1);
              stackOut_95_2 = "null";
              stackIn_96_0 = stackOut_95_0;
              stackIn_96_1 = stackOut_95_1;
              stackIn_96_2 = stackOut_95_2;
              break L31;
            } else {
              stackOut_94_0 = (RuntimeException) ((Object) stackIn_94_0);
              stackOut_94_1 = (StringBuilder) ((Object) stackIn_94_1);
              stackOut_94_2 = "{...}";
              stackIn_96_0 = stackOut_94_0;
              stackIn_96_1 = stackOut_94_1;
              stackIn_96_2 = stackOut_94_2;
              break L31;
            }
          }
          L32: {
            stackOut_96_0 = (RuntimeException) ((Object) stackIn_96_0);
            stackOut_96_1 = ((StringBuilder) (Object) stackIn_96_1).append(stackIn_96_2).append(',');
            stackIn_98_0 = stackOut_96_0;
            stackIn_98_1 = stackOut_96_1;
            stackIn_97_0 = stackOut_96_0;
            stackIn_97_1 = stackOut_96_1;
            if (param9 == null) {
              stackOut_98_0 = (RuntimeException) ((Object) stackIn_98_0);
              stackOut_98_1 = (StringBuilder) ((Object) stackIn_98_1);
              stackOut_98_2 = "null";
              stackIn_99_0 = stackOut_98_0;
              stackIn_99_1 = stackOut_98_1;
              stackIn_99_2 = stackOut_98_2;
              break L32;
            } else {
              stackOut_97_0 = (RuntimeException) ((Object) stackIn_97_0);
              stackOut_97_1 = (StringBuilder) ((Object) stackIn_97_1);
              stackOut_97_2 = "{...}";
              stackIn_99_0 = stackOut_97_0;
              stackIn_99_1 = stackOut_97_1;
              stackIn_99_2 = stackOut_97_2;
              break L32;
            }
          }
          L33: {
            stackOut_99_0 = (RuntimeException) ((Object) stackIn_99_0);
            stackOut_99_1 = ((StringBuilder) (Object) stackIn_99_1).append(stackIn_99_2).append(',');
            stackIn_101_0 = stackOut_99_0;
            stackIn_101_1 = stackOut_99_1;
            stackIn_100_0 = stackOut_99_0;
            stackIn_100_1 = stackOut_99_1;
            if (param10 == null) {
              stackOut_101_0 = (RuntimeException) ((Object) stackIn_101_0);
              stackOut_101_1 = (StringBuilder) ((Object) stackIn_101_1);
              stackOut_101_2 = "null";
              stackIn_102_0 = stackOut_101_0;
              stackIn_102_1 = stackOut_101_1;
              stackIn_102_2 = stackOut_101_2;
              break L33;
            } else {
              stackOut_100_0 = (RuntimeException) ((Object) stackIn_100_0);
              stackOut_100_1 = (StringBuilder) ((Object) stackIn_100_1);
              stackOut_100_2 = "{...}";
              stackIn_102_0 = stackOut_100_0;
              stackIn_102_1 = stackOut_100_1;
              stackIn_102_2 = stackOut_100_2;
              break L33;
            }
          }
          L34: {
            stackOut_102_0 = (RuntimeException) ((Object) stackIn_102_0);
            stackOut_102_1 = ((StringBuilder) (Object) stackIn_102_1).append(stackIn_102_2).append(',');
            stackIn_104_0 = stackOut_102_0;
            stackIn_104_1 = stackOut_102_1;
            stackIn_103_0 = stackOut_102_0;
            stackIn_103_1 = stackOut_102_1;
            if (param11 == null) {
              stackOut_104_0 = (RuntimeException) ((Object) stackIn_104_0);
              stackOut_104_1 = (StringBuilder) ((Object) stackIn_104_1);
              stackOut_104_2 = "null";
              stackIn_105_0 = stackOut_104_0;
              stackIn_105_1 = stackOut_104_1;
              stackIn_105_2 = stackOut_104_2;
              break L34;
            } else {
              stackOut_103_0 = (RuntimeException) ((Object) stackIn_103_0);
              stackOut_103_1 = (StringBuilder) ((Object) stackIn_103_1);
              stackOut_103_2 = "{...}";
              stackIn_105_0 = stackOut_103_0;
              stackIn_105_1 = stackOut_103_1;
              stackIn_105_2 = stackOut_103_2;
              break L34;
            }
          }
          L35: {
            stackOut_105_0 = (RuntimeException) ((Object) stackIn_105_0);
            stackOut_105_1 = ((StringBuilder) (Object) stackIn_105_1).append(stackIn_105_2).append(',').append(param12).append(',');
            stackIn_107_0 = stackOut_105_0;
            stackIn_107_1 = stackOut_105_1;
            stackIn_106_0 = stackOut_105_0;
            stackIn_106_1 = stackOut_105_1;
            if (param13 == null) {
              stackOut_107_0 = (RuntimeException) ((Object) stackIn_107_0);
              stackOut_107_1 = (StringBuilder) ((Object) stackIn_107_1);
              stackOut_107_2 = "null";
              stackIn_108_0 = stackOut_107_0;
              stackIn_108_1 = stackOut_107_1;
              stackIn_108_2 = stackOut_107_2;
              break L35;
            } else {
              stackOut_106_0 = (RuntimeException) ((Object) stackIn_106_0);
              stackOut_106_1 = (StringBuilder) ((Object) stackIn_106_1);
              stackOut_106_2 = "{...}";
              stackIn_108_0 = stackOut_106_0;
              stackIn_108_1 = stackOut_106_1;
              stackIn_108_2 = stackOut_106_2;
              break L35;
            }
          }
          L36: {
            stackOut_108_0 = (RuntimeException) ((Object) stackIn_108_0);
            stackOut_108_1 = ((StringBuilder) (Object) stackIn_108_1).append(stackIn_108_2).append(',');
            stackIn_110_0 = stackOut_108_0;
            stackIn_110_1 = stackOut_108_1;
            stackIn_109_0 = stackOut_108_0;
            stackIn_109_1 = stackOut_108_1;
            if (param14 == null) {
              stackOut_110_0 = (RuntimeException) ((Object) stackIn_110_0);
              stackOut_110_1 = (StringBuilder) ((Object) stackIn_110_1);
              stackOut_110_2 = "null";
              stackIn_111_0 = stackOut_110_0;
              stackIn_111_1 = stackOut_110_1;
              stackIn_111_2 = stackOut_110_2;
              break L36;
            } else {
              stackOut_109_0 = (RuntimeException) ((Object) stackIn_109_0);
              stackOut_109_1 = (StringBuilder) ((Object) stackIn_109_1);
              stackOut_109_2 = "{...}";
              stackIn_111_0 = stackOut_109_0;
              stackIn_111_1 = stackOut_109_1;
              stackIn_111_2 = stackOut_109_2;
              break L36;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_111_0), stackIn_111_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
    }
}
