/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vrb extends rqa {
    vrb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static boolean a(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 >= -89) {
          return false;
        }
        stackIn_7_0 = (fda.e((byte) 120)) || !(hcb.field_o > 0);
        return stackIn_7_0;
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -119) {
            vrb.a(106);
          }
          si.a(215, 62, param0[0].a(123));
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vrb.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(byte[] param0, int param1, int param2, asb param3, String[] param4, String[][] param5, phb[][] param6, int param7, phb[][] param8, String[][] param9, String[] param10, byte[] param11, int param12, String[] param13, int[] param14) {
        cna[] array$0 = null;
        cna[] array$1 = null;
        cna[] array$2 = null;
        int var19 = 0;
        llb stackIn_6_0;
        llb stackIn_6_1;
        long stackIn_6_2;
        llb stackIn_6_3;
        llb stackIn_7_0 = null;
        llb stackIn_7_1 = null;
        String stackIn_7_4 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_82_2 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_85_2 = null;
        StringBuilder stackIn_87_1 = null;
        String stackIn_88_2 = null;
        StringBuilder stackIn_90_1 = null;
        String stackIn_91_2 = null;
        StringBuilder stackIn_93_1 = null;
        String stackIn_94_2 = null;
        StringBuilder stackIn_96_1 = null;
        String stackIn_97_2 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_100_2 = null;
        StringBuilder stackIn_102_1 = null;
        String stackIn_103_2 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_106_2 = null;
        StringBuilder stackIn_108_1 = null;
        String stackIn_109_2 = null;
        StringBuilder stackIn_111_1 = null;
        String stackIn_112_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15 = null;
        llb var16 = null;
        int var17_int = 0;
        llb var17 = null;
        int var18 = 0;
        Object var19_ref = null;
        Object var20 = null;
        int var21 = 0;
        llb var23 = null;
        llb var24 = null;
        int var18Lifetime1;
        int var18Lifetime2;
        int var17_intLifetime1;
        int var17_intLifetime2;
        int var17_intLifetime3;
        int var17_intLifetime4;
        var21 = VoidHunters.field_G;
        try {
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
            fh.field_f.b(param1 - 10792, epa.field_o);
          }
          fh.field_f.b(param1 - 10792, tja.field_a);
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
          stackIn_6_0 = null;
          stackIn_6_1 = null;
          stackIn_6_2 = 0L;
          stackIn_6_3 = qcb.field_p;
          if (ll.field_o) {
            stackIn_7_0 = null;
            stackIn_7_1 = null;
            stackIn_7_4 = uab.field_a;
          } else {
            stackIn_7_0 = null;
            stackIn_7_1 = null;
            stackIn_7_4 = ueb.field_o;
          }
          oib.field_a = new llb(stackIn_6_2, stackIn_6_3, ((String) (Object) stackIn_7_4).toUpperCase());
          bqa.field_d = new llb(0L, (llb) null);
          bqa.field_d.b(-561, qpb.field_w);
          bqa.field_d.b(param1 - 10792, sra.field_a);
          sra.field_a.b(-561, fwa.field_a);
          sra.field_a.b(-561, wrb.field_q);
          sra.field_a.b(param1 ^ -9672, gs.field_b);
          if (ll.field_o) {
            sra.field_a.b(param1 ^ -9672, mqb.field_C);
          }
          sra.field_a.b(-561, jna.field_o);
          sra.field_a.b(-561, uga.field_h);
          sra.field_a.b(-561, rgb.field_f);
          if (ll.field_o) {
            bqa.field_d.b(-561, gha.field_p);
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
          if (param1 != 10231) {
            return;
          }
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
          for (var17_int = 0; var17_int < 5; var17_int++) {
            inb.field_q[0][1 + var17_int] = new cna(0L, tia.field_M, (llb) null, iga.field_o, sqb.field_o[var17_int], uka.field_p[var17_int]);
          }
          if (ieb.field_o.length >= 2) {
            ceb.field_o[1] = new llb(0L, gjb.field_p, uda.field_a);
            array$0 = new cna[1 + ieb.field_o.length];
            inb.field_q[1] = array$0;
            inb.field_q[1][0] = new cna(0L, tia.field_M, (llb) null, iga.field_o, (phb) null, mpb.field_k);
            for (var17_intLifetime1 = 0; var17_intLifetime1 < ieb.field_o.length; var17_intLifetime1++) {
              inb.field_q[1][var17_intLifetime1 + 1] = new cna(0L, tia.field_M, (llb) null, iga.field_o, (phb) null, Integer.toString(ieb.field_o[var17_intLifetime1]));
            }
          }
          ceb.field_o[2] = new llb(0L, gjb.field_p, kra.field_b);
          inb.field_q[2] = new cna[]{new cna(0L, tia.field_M, (llb) null, iga.field_o, (phb) null, mpb.field_k), new cna(0L, tia.field_M, (llb) null, iga.field_o, lcb.field_t[0], nl.field_j), new cna(0L, tia.field_M, (llb) null, iga.field_o, lcb.field_t[1], ns.field_a)};
          if (nkb.field_r > 1) {
            ceb.field_o[3] = new llb(0L, gjb.field_p, ijb.field_o);
            array$1 = new cna[1 + nkb.field_r];
            inb.field_q[3] = array$1;
            inb.field_q[3][0] = new cna(0L, tia.field_M, (llb) null, iga.field_o, (phb) null, mpb.field_k);
            for (var17_intLifetime2 = 0; var17_intLifetime2 < nkb.field_r; var17_intLifetime2++) {
              inb.field_q[3][var17_intLifetime2 + 1] = new cna(0L, tia.field_M, (llb) null, iga.field_o, (phb) null, wja.field_c[var17_intLifetime2]);
            }
          }
          for (var17_intLifetime3 = 0; param12 > var17_intLifetime3; var17_intLifetime3++) {
            ceb.field_o[var17_intLifetime3 + 4] = new llb(0L, gjb.field_p, hva.field_c[var17_intLifetime3]);
            array$2 = new cna[dla.a(255, (int) gm.field_M[var17_intLifetime3]) + 1];
            inb.field_q[var17_intLifetime3 + 4] = array$2;
            inb.field_q[var17_intLifetime3 + 4][0] = new cna(0L, tia.field_M, (llb) null, iga.field_o, (phb) null, mpb.field_k);
            for (var18 = 0; var18 < (gm.field_M[var17_intLifetime3] & 255); var18++) {
              if (mg.field_o == null) {
                var19_ref = null;
              } else {
                if (null == mg.field_o[var17_intLifetime3]) {
                  var19_ref = null;
                } else {
                  var19_ref = mg.field_o[var17_intLifetime3][var18];
                }
              }
              if (null == hqb.field_k) {
                var20 = null;
              } else {
                if (null == hqb.field_k[var17_intLifetime3]) {
                  var20 = null;
                } else {
                  var20 = hqb.field_k[var17_intLifetime3][var18];
                }
              }
              inb.field_q[4 + var17_intLifetime3][1 + var18] = new cna(0L, tia.field_M, (llb) null, iga.field_o, (phb) (var19_ref), (String) (var20));
            }
          }
          for (var17_intLifetime4 = 0; var17_intLifetime4 < 4 + param12; var17_intLifetime4++) {
            if (ceb.field_o[var17_intLifetime4] != null) {
              ceb.field_o[var17_intLifetime4].field_D = 11;
            }
            if (inb.field_q[var17_intLifetime4] != null) {
              for (var18Lifetime1 = 0; var18Lifetime1 < inb.field_q[var17_intLifetime4].length; var18Lifetime1++) {
                if (inb.field_q[var17_intLifetime4][var18Lifetime1] != null &&
                  null != inb.field_q[var17_intLifetime4][var18Lifetime1].field_yb) {
                  inb.field_q[var17_intLifetime4][var18Lifetime1].field_yb.field_D = 11;
                }
              }
            }
          }
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
          for (var18Lifetime2 = 0; 4 + param12 > var18Lifetime2; var18Lifetime2++) {
            if ((var18Lifetime2 != 1 ||
              !(ieb.field_o.length < 2)) && (var18Lifetime2 != 3 ||
              !(nkb.field_r <= 1))) {
              gt.field_o.b(-561, ceb.field_o[var18Lifetime2]);
              for (var19 = 0; var19 < inb.field_q[var18Lifetime2].length; var19++) {
                if (null != inb.field_q[var18Lifetime2][var19]) {
                  gt.field_o.b(-561, inb.field_q[var18Lifetime2][var19]);
                }
              }
            }
          }
          vva.field_r.b(param1 - 10792, vw.field_a);
          vva.field_r.b(-561, qsa.field_b);
          vva.field_r.b(-561, qi.field_p);
          sfa.field_d = new llb(0L, lo.field_b, ko.field_d.toUpperCase());
          rlb.field_a = new llb(0L, hnb.field_X, vsa.field_s.toUpperCase());
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_81_0 = var15;
          stackIn_81_1 = new StringBuilder().append("vrb.B(");
          if (param0 == null) {
            stackIn_82_2 = "null";
          } else {
            stackIn_82_2 = "{...}";
          }
          stackIn_84_1 = ((StringBuilder) (Object) stackIn_81_1).append(stackIn_82_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_85_2 = "null";
          } else {
            stackIn_85_2 = "{...}";
          }
          stackIn_87_1 = ((StringBuilder) (Object) stackIn_84_1).append(stackIn_85_2).append(',');
          if (param4 == null) {
            stackIn_88_2 = "null";
          } else {
            stackIn_88_2 = "{...}";
          }
          stackIn_90_1 = ((StringBuilder) (Object) stackIn_87_1).append(stackIn_88_2).append(',');
          if (param5 == null) {
            stackIn_91_2 = "null";
          } else {
            stackIn_91_2 = "{...}";
          }
          stackIn_93_1 = ((StringBuilder) (Object) stackIn_90_1).append(stackIn_91_2).append(',');
          if (param6 == null) {
            stackIn_94_2 = "null";
          } else {
            stackIn_94_2 = "{...}";
          }
          stackIn_96_1 = ((StringBuilder) (Object) stackIn_93_1).append(stackIn_94_2).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_97_2 = "null";
          } else {
            stackIn_97_2 = "{...}";
          }
          stackIn_99_1 = ((StringBuilder) (Object) stackIn_96_1).append(stackIn_97_2).append(',');
          if (param9 == null) {
            stackIn_100_2 = "null";
          } else {
            stackIn_100_2 = "{...}";
          }
          stackIn_102_1 = ((StringBuilder) (Object) stackIn_99_1).append(stackIn_100_2).append(',');
          if (param10 == null) {
            stackIn_103_2 = "null";
          } else {
            stackIn_103_2 = "{...}";
          }
          stackIn_105_1 = ((StringBuilder) (Object) stackIn_102_1).append(stackIn_103_2).append(',');
          if (param11 == null) {
            stackIn_106_2 = "null";
          } else {
            stackIn_106_2 = "{...}";
          }
          stackIn_108_1 = ((StringBuilder) (Object) stackIn_105_1).append(stackIn_106_2).append(',').append(param12).append(',');
          if (param13 == null) {
            stackIn_109_2 = "null";
          } else {
            stackIn_109_2 = "{...}";
          }
          stackIn_111_1 = ((StringBuilder) (Object) stackIn_108_1).append(stackIn_109_2).append(',');
          if (param14 == null) {
            stackIn_112_2 = "null";
          } else {
            stackIn_112_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_81_0), ((StringBuilder) (Object) stackIn_111_1).append(stackIn_112_2).append(')').toString());
        }
    }

    static {
    }
}
