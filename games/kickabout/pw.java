/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pw extends i {
    static ut field_H;
    static np field_G;
    private boolean field_F;
    static hd field_J;
    private boolean field_I;

    final void a(int param0, int param1) {
        int var3;
        ml stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_28_2 = 0;
        boolean decompiledFrameRemainder0 = true;
        super.a(69, param1);
        if (!la.a(100)) {
          if (!dg.field_e &&
            !ds.field_g) {
            if (param0 <= 60) {
              return;
            }
            if ((param1 == 0) &&
              (decompiledFrameRemainder0 = !(ad.field_f < an.field_c))) {
              if (qd.field_g < ad.field_f) {
                return;
              }
              if (ng.field_e) {
                if (ad.field_f > hk.field_L) {
                  return;
                }
                if (!(an.field_c <= hk.field_L) ||
                  !(hk.field_L <= qd.field_g)) {
                  return;
                }
              }
              var3 = 0;
              if (0 < ad.field_f) {
                var3 = var3 | 1;
              }
              if (ng.field_e &&
                hk.field_L > 0) {
                var3 = var3 | 4;
              }
              or.field_d.b(51, (byte) 127);
              or.field_d.a(105, bi.field_m);
              or.field_d.a(126, ee.field_d);
              or.field_d.a(109, var3);
              or.field_d.b(-95, ad.field_f);
              stackIn_27_0 = or.field_d;
              stackIn_27_1 = -75;
              if (!ng.field_e) {
                stackIn_28_2 = 0;
              } else {
                stackIn_28_2 = hk.field_L;
              }
              ((ml) (Object) stackIn_27_0).b(stackIn_27_1, stackIn_28_2);
              ((wf) (cq.field_h)).a(0, 0, true);
            }
            if (decompiledFrameRemainder0) {
              return;
            }
          }
          if (decompiledFrameRemainder0) {
            return;
          }
        }

    }

    final boolean a(int param0, byte param1, char param2) {
        boolean discarded$0 = false;
        boolean stackIn_2_0 = false;
        int stackIn_3_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_8_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_11_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_20_2 = 0;
        int stackIn_28_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_62_0 = 0;
        int var4;
        int var6;
        String var7;
        String var8;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        stackIn_2_0 = ne.field_G[81];
        stackIn_3_1 = (101 != param0) ? 0 : 1;
        stackIn_6_2 = (85 != param0) ? 0 : 1;
        stackIn_8_1 = stackIn_3_1 | stackIn_6_2;
        stackIn_9_2 = (param0 != 96) ? 0 : 1;
        stackIn_11_1 = stackIn_8_1 | stackIn_9_2;
        stackIn_12_2 = (97 != param0) ? 0 : 1;
        var4 = stackIn_2_0 | (stackIn_11_1 | stackIn_12_2) != 0 ? 1 : 0;
        stackIn_15_0 = var4;
        if (ne.field_G[82] &&
          cc.field_e == 66) {
          stackIn_16_1 = 1;
        } else {
          stackIn_16_1 = 0;
        }
        if (ne.field_G[82] &&
          param0 == 67) {
          stackIn_20_2 = 1;
        } else {
          stackIn_20_2 = 0;
        }
        boolean decompiledFrameRemainder1 = true;
        var4Lifetime1 = stackIn_15_0 | (stackIn_16_1 | stackIn_20_2);
        stackIn_28_0 = var4Lifetime1;
        if (this.b(-111, param2) && (this.field_F &&
          bd.field_A.j((byte) -16).length() < kt.field_l ||
          this.field_I &&
          !(rt.field_F.j((byte) -16).length() >= kt.field_l))) {
          stackIn_29_1 = 1;
          decompiledFrameRemainder1 = false;
        }
        else {
          stackIn_29_1 = 0;
        }
        boolean decompiledFrameRemainder0 = true;
        var4Lifetime2 = stackIn_28_0 | stackIn_29_1;
        stackIn_39_0 = var4Lifetime2;
        if (this.b(-118, param2) && (this.field_F &&
          bd.field_A.j((byte) -16).length() == kt.field_l &&
          bd.field_A.i((byte) 35).length() > 0 ||
          this.field_I &&
          rt.field_F.j((byte) -16).length() == kt.field_l &&
          !(rt.field_F.i((byte) 35).length() <= 0))) {
          stackIn_40_1 = 1;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_40_1 = 0;
        }
        var4Lifetime3 = stackIn_39_0 | stackIn_40_1;
        if (var4Lifetime3 == 0) {
          if (!this.field_F &&
            !this.field_I) {
            discarded$0 = super.a(param0, param1, param2);
            return false;
          }
          return true;
        }
        if (this.field_F) {
          if (param2 == 48 &&
            bd.field_A.j((byte) -16).length() == 0) {
            return true;
          }
          bd.field_A.a(param0, param2, 875);
          var8 = bd.field_A.j((byte) -16);
          if (var8 != null &&
            var8.length() > 0) {
            stackIn_62_0 = Integer.parseInt(var8);
          } else {
            stackIn_62_0 = 0;
          }
          var6 = stackIn_62_0;
          ad.field_f = var6;
        } else {
          if (!this.field_I) {
            return true;
          }
          if (48 == param2 &&
            0 == rt.field_F.j((byte) -16).length()) {
            return true;
          }
          rt.field_F.a(param0, param2, param1 + 896);
          var7 = rt.field_F.j((byte) -16);
          if (var7 != null &&
            0 < var7.length()) {
            stackIn_53_0 = Integer.parseInt(var7);
          } else {
            stackIn_53_0 = 0;
          }
          var6 = stackIn_53_0;
          hk.field_L = var6;
        }
        return true;
    }

    final int b(int param0) {
        if (param0 != -1379118556) {
          return 96;
        }
        return 545;
    }

    final int a(byte param0) {
        if (param0 <= 75) {
          this.a((byte) 120, 52, 33);
        }
        return 400;
    }

    final void a(byte param0, int param1, int param2) {
        int var11 = 0;
        int stackIn_8_0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var12;
        var12 = Kickabout.field_G;
        super.a((byte) -124, param1, param2);
        wk.field_c.a(150 + param2, 23, param1 + 98);
        pb.field_C.a(qa.field_G, 25 + param1, param2 + 270, 150, 40, 16729156, -1, 1, 1, 0);
        if (param0 > -11) {
          field_J = (hd) null;
        }
        var4 = 220 + param1;
        var5 = 50 + var4;
        var6 = param2 + 55;
        var7 = var4 + 50;
        var8 = 6 + (var6 + 75);
        var9 = 75 + var8 + 6;
        on.a(-47 + var4, var6, 90, 75, 10, 65793, 128);
        on.a(160 + var5 + 7, var6, 90, 75, 10, 65793, 128);
        un.field_d.d(oj.field_T.toLowerCase(), var4 - 2, var6 + 30, 16777215, -1);
        pb.field_C.d(ad.a(an.field_c, 26300), var4 - 2, var6 + 54, 16777215, -1);
        un.field_d.d(tu.field_D.toLowerCase(), 52 + (160 + var5), var6 + 30, 16777215, -1);
        pb.field_C.d(ad.a(qd.field_g, 26300), 52 + (160 + var5), 54 + var6, 16777215, -1);
        on.a(var5, var6, 160, 75, 10, 65793, 128);
        on.a(var7, var8, 160, 75, 10, 65793, 128);
        on.a(var4, var9, 260, 120, 10, 65793, 128);
        un.field_d.d(gl.field_f.toLowerCase(), 130 + var4, 21 + var6, 16777215, -1);
        un.field_d.d(Kickabout.field_F.toLowerCase(), var4 + 130, var9 + 21, 16777215, -1);
        if (pn.g(2368)) {
          stackIn_8_0 = (nj.a(-51) % 500L < 250L) ? 1 : 0;
        } else {
          stackIn_8_0 = 0;
        }
        var10 = stackIn_8_0;
        uq.field_b.field_s = var4 + 10;
        uq.field_b.field_J = 27 + var6;
        on.a(uq.field_b.field_s + 85, uq.field_b.field_J + 6, bd.field_A.field_q + 4, -4 + bd.field_A.field_mb, 7829367, 128);
        pb.field_C.a('£', 91 + uq.field_b.field_s, uq.field_b.field_J + 19, 16777215);
        uq.field_b.a(110, var10 != 0 & this.field_F);
        oa.field_b.field_J = 5 + (var8 - 13);
        oa.field_b.field_s = var4 + 10;
        on.a(oa.field_b.field_s + 85, 40 + oa.field_b.field_J, rt.field_F.field_q + 4, -4 + rt.field_F.field_mb, 7829367, 128);
        if (ng.field_e) {
          pb.field_C.a('£', oa.field_b.field_s + 91, 53 + oa.field_b.field_J, 16777215);
        }
        oa.field_b.a(94, var10 != 0 & this.field_I);
        kr.field_a.a(false, (byte) 46);
        if (ad.field_f < an.field_c) {
          pb.field_C.d(ik.field_E, var4 + 130, 75 + var6 - 8, 16711680, -1);
        } else {
          if (qd.field_g >= ad.field_f) {
            if (ng.field_e &&
              ad.field_f > hk.field_L) {
              pb.field_C.d(jw.field_Eb, var4 + 130, -8 + var6 + 75, 16711680, -1);
            }
          } else {
            pb.field_C.d(rr.field_d, 130 + var4, 75 + var6 - 8, 16711680, -1);
          }
        }
        if (ng.field_e) {
          if (hk.field_L < an.field_c) {
            pb.field_C.d(ik.field_E, 130 + var4, 75 + var8 - 8, 16711680, -1);
          } else {
            if (hk.field_L <= qd.field_g) {
              if (hk.field_L < ad.field_f) {
                pb.field_C.d(f.field_b, 130 + var4, 67 + var8, 16711680, -1);
              }
            } else {
              pb.field_C.d(rr.field_d, 130 + var4, var8 + 67, 16711680, -1);
            }
          }
        } else {
          pb.field_C.d(um.field_f, var4 + 130, var8 + 67, 16711680, -1);
        }
        for (var11 = 0; var11 < 5; var11++) {
          of.field_d[var11].a(true, of.field_d[var11].field_q, var4 + 10, 26 + (var9 + var11 * 18), of.field_d[var11].field_mb);
          if (of.field_d[var11].field_gb) {
            on.a(of.field_d[var11].field_F, of.field_d[var11].field_T, of.field_d[var11].field_q, of.field_d[var11].field_mb - 2, 6, 16777215, 140);
          }
          if (ee.field_d == var11) {
            su.field_a.c(10 + (var4 + 74), 26 + var9 - (-(var11 * 18) - 2));
          }
          of.field_d[var11].a(112, false);
        }
    }

    private final boolean b(int param0, char param1) {
        int var4 = Kickabout.field_G;
        int var3 = 0;
        if (param0 >= -109) {
          return true;
        }
        while (var3 < ia.field_e.length) {
          if (ia.field_e[var3] == param1) {
            return true;
          }
          var3++;
        }
        return false;
    }

    pw(int param0) {
        super(18);
        int var3_int = 0;
        hd var7 = null;
        hd var8 = null;
        bi.field_m = param0;
        ng.field_e = true;
        wk.field_c = tu.field_E.field_i[bi.field_m];
        an.field_c = su.a((byte) -107, wk.field_c);
        qd.field_g = af.a(wk.field_c, -31);
        ad.field_f = an.field_c;
        kt.field_l = 8;
        hk.field_L = gp.a(wk.field_c, -576054046) <= 0 ? 1 : gp.a(wk.field_c, -576054046);
        hd var9 = new hd();
        of.field_d = new hd[5];
        var9.field_y = 16777215;
        var9.field_ub = 65793;
        var9.field_X = (hu) ((Object) pb.field_C);
        var9.field_D = 95;
        for (var3_int = 0; var3_int < 5; var3_int++) {
          of.field_d[var3_int] = new hd();
          var7 = of.field_d[var3_int];
          var8 = var7;
          var8.a(var9, (byte) -77);
          var7.b(0, true);
          var7.field_E = ni.field_k[var3_int];
          var8.field_mb = 18;
          var8.field_q = 240;
        }
        uq.field_b = new hd();
        uq.field_b.field_y = 16777215;
        uq.field_b.field_B = 5;
        uq.field_b.field_A = 1;
        uq.field_b.field_mb = 24;
        uq.field_b.field_q = 240;
        uq.field_b.field_X = (hu) ((Object) pb.field_C);
        oa.field_b = new hd();
        oa.field_b.field_B = 40;
        oa.field_b.field_mb = 60;
        oa.field_b.field_X = (hu) ((Object) pb.field_C);
        oa.field_b.field_A = 1;
        oa.field_b.field_q = 240;
        oa.field_b.field_y = 16777215;
        hd var3 = new hd();
        var3.field_X = (hu) ((Object) pb.field_C);
        var3.field_p = 1;
        var3.field_A = 1;
        var3.field_y = 16777215;
        hd var10 = new hd(0L, (hd) null);
        var10.field_R = sp.a((byte) 26, 8947956);
        hd var5 = new hd();
        var5.field_B = 2;
        var5.field_y = 16777215;
        var5.field_X = (hu) ((Object) pb.field_C);
        var5.field_D = 5;
        bd.field_A = new vg(0L, var3, var10, var5, 20);
        bd.field_A.field_R = null;
        bd.field_A.a(-630, 5 + (uq.field_b.field_q >> 1) - 33, (uq.field_b.field_mb >> 2) - 2, 4 + (pb.field_C.field_G + pb.field_C.field_p), 67);
        uq.field_b.a((byte) -113, (hd) (bd.field_A));
        rt.field_F = new vg(0L, var3, var10, var5, 20);
        rt.field_F.field_R = null;
        rt.field_F.a(-630, 5 + (-33 + (oa.field_b.field_q >> 1)), 8 + (oa.field_b.field_mb >> 1), 4 + (pb.field_C.field_G + pb.field_C.field_p), 67);
        oa.field_b.a((byte) -121, (hd) (rt.field_F));
        kr.field_a = new jw(jc.field_k.toLowerCase(), un.field_d);
        kr.field_a.field_J = 5;
        kr.field_a.field_s = 5 + (oa.field_b.field_q - kr.field_a.field_q >> 1);
        hk.field_I = eo.a(false, 0);
        qp.field_L = eo.a(true, 0);
        hq.field_c = eo.a(false, 0);
        fn.field_a = eo.a(true, 0);
        qp.field_L.field_s = (uq.field_b.field_q >> 1) + ((qp.field_L.field_q >> 1) + qp.field_L.field_q);
        fn.field_a.field_s = fn.field_a.field_q - (-(fn.field_a.field_q >> 1) - (oa.field_b.field_q >> 1));
        hk.field_I.field_s = -(hk.field_I.field_q >> 1) + (-(hk.field_I.field_q * 2) + (uq.field_b.field_q >> 1));
        hq.field_c.field_s = (oa.field_b.field_q >> 1) + (-(2 * hq.field_c.field_q) - (hq.field_c.field_q >> 1));
        fn.field_a.field_J = 35;
        hq.field_c.field_J = 35;
        uq.field_b.a((byte) -108, hk.field_I);
        uq.field_b.a((byte) -125, qp.field_L);
        oa.field_b.a((byte) -117, hq.field_c);
        oa.field_b.a((byte) -115, fn.field_a);
        oa.field_b.a((byte) -113, (hd) (kr.field_a));
        bd.field_A.b(Integer.toString(ad.field_f), -23174);
        rt.field_F.b(Integer.toString(hk.field_L), -23174);
        this.field_F = true;
        this.field_I = false;
    }

    public static void g(int param0) {
        field_J = null;
        if (param0 != -8332) {
          field_H = (ut) null;
        }
        field_G = null;
        field_H = null;
    }

    final void a(int param0, boolean param1) {
        hd stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int stackIn_44_2 = 0;
        boolean stackIn_47_1 = false;
        hd stackIn_49_0 = null;
        boolean stackIn_50_1 = false;
        hd stackIn_52_0 = null;
        boolean stackIn_53_1 = false;
        hd stackIn_55_0 = null;
        boolean stackIn_56_1 = false;
        int stackIn_60_0 = 0;
        String stackIn_61_1 = null;
        boolean stackIn_66_0 = false;
        int stackIn_85_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_135_0 = 0;
        vg stackIn_138_0 = null;
        String stackIn_139_1 = null;
        int stackIn_145_0 = 0;
        vg stackIn_149_0 = null;
        String stackIn_150_1 = null;
        int stackIn_163_0 = 0;
        int stackIn_176_0 = 0;
        int stackIn_183_0 = 0;
        int stackIn_184_1 = 0;
        int stackIn_186_0 = 0;
        int stackIn_187_1 = 0;
        int stackIn_191_0 = 0;
        int stackIn_192_1 = 0;
        int stackIn_194_0 = 0;
        int stackIn_195_1 = 0;
        int stackIn_197_0 = 0;
        int stackIn_198_1 = 0;
        int stackIn_200_0 = 0;
        int stackIn_201_1 = 0;
        hd stackIn_204_0 = null;
        boolean stackIn_205_1 = false;
        int var3;
        int var4;
        int var5;
        int var6;
        String var6_ref_String;
        int var7;
        String var8;
        int var9;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var7Lifetime4;
        int var7Lifetime5;
        var9 = Kickabout.field_G;
        for (var3 = 0; var3 < of.field_d.length; var3++) {
          of.field_d[var3].b(0, param1);
        }
        uq.field_b.b(0, param1);
        oa.field_b.b(0, param1);
        bd.field_A.b(param0 + 11567);
        rt.field_F.b(11570);
        for (var3 = 0; var3 < 5; var3++) {
          if (of.field_d[var3].field_gb) {
            if (var3 == ee.field_d) {
              qd.$cfr$intArgs$a$b6210757cdab(-67, vo.$cfr$intArgs$a$53ce4ab4c593(-18, jh.field_Jb, new String[]{ni.field_k[var3]}));
            } else {
              qd.$cfr$intArgs$a$b6210757cdab(-67, vo.$cfr$intArgs$a$53ce4ab4c593(-18, kn.field_H, new String[]{ni.field_k[var3]}));
            }
          }
        }
        if (qp.field_L.field_Q) {
          if (ad.field_f == qd.field_g) {
            qd.$cfr$intArgs$a$b6210757cdab(-67, vf.field_H);
          } else {
            if (ng.field_e &&
              ad.field_f == hk.field_L) {
              qd.$cfr$intArgs$a$b6210757cdab(-67, ad.field_a);
            } else {
              qd.$cfr$intArgs$a$b6210757cdab(-67, vo.$cfr$intArgs$a$53ce4ab4c593(-18, ij.field_q, new String[]{ad.a(1, 26300)}));
            }
          }
        }
        if (hk.field_I.field_Q) {
          if (an.field_c != ad.field_f) {
            qd.$cfr$intArgs$a$b6210757cdab(-67, vo.$cfr$intArgs$a$53ce4ab4c593(-18, np.field_Ib, new String[]{ad.a(1, 26300)}));
          } else {
            qd.$cfr$intArgs$a$b6210757cdab(-67, fd.field_j);
          }
        }
        if (fn.field_a.field_Q) {
          if (ng.field_e) {
            if (hk.field_L == qd.field_g) {
              qd.$cfr$intArgs$a$b6210757cdab(-67, hm.field_E);
            } else {
              qd.$cfr$intArgs$a$b6210757cdab(-67, vo.$cfr$intArgs$a$53ce4ab4c593(-18, nw.field_c, new String[]{ad.a(1, param0 ^ 26303)}));
            }
          } else {
            qd.$cfr$intArgs$a$b6210757cdab(-67, im.field_zb);
          }
        }
        if (hq.field_c.field_Q) {
          if (ng.field_e) {
            if (an.field_c != hk.field_L) {
              if (ad.field_f == hk.field_L) {
                qd.$cfr$intArgs$a$b6210757cdab(-67, sd.field_e);
              } else {
                qd.$cfr$intArgs$a$b6210757cdab(-67, vo.$cfr$intArgs$a$53ce4ab4c593(-18, up.field_d, new String[]{ad.a(1, 26300)}));
              }
            } else {
              qd.$cfr$intArgs$a$b6210757cdab(-67, bn.field_C);
            }
          } else {
            qd.$cfr$intArgs$a$b6210757cdab(-67, im.field_zb);
          }
        }
        stackIn_43_0 = qp.field_L;
        stackIn_43_1 = ad.field_f;
        if (ng.field_e) {
          stackIn_44_2 = hk.field_L;
        } else {
          stackIn_44_2 = qd.field_g;
        }
        stackIn_47_1 = (stackIn_43_1 >= stackIn_44_2) ? false : true;
        stackIn_43_0.field_lb = stackIn_47_1;
        stackIn_49_0 = hk.field_I;
        stackIn_50_1 = (ad.field_f <= an.field_c) ? false : true;
        stackIn_49_0.field_lb = stackIn_50_1;
        stackIn_52_0 = fn.field_a;
        stackIn_53_1 = (qd.field_g <= hk.field_L) ? false : true;
        stackIn_52_0.field_lb = stackIn_53_1 & ng.field_e;
        stackIn_55_0 = hq.field_c;
        stackIn_56_1 = (hk.field_L <= ad.field_f) ? false : true;
        stackIn_55_0.field_lb = stackIn_56_1 & ng.field_e;
        if (kr.field_a.field_gb) {
          stackIn_60_0 = -67;
          if (ng.field_e) {
            stackIn_61_1 = pa.field_i;
          } else {
            stackIn_61_1 = hh.field_c;
          }
          qd.$cfr$intArgs$a$b6210757cdab(stackIn_60_0, stackIn_61_1);
        }
        if (kr.field_a.field_sb == 1) {
          stackIn_66_0 = !(ng.field_e);
          ng.field_e = stackIn_66_0;
          sp.c(61, -17);
          if (ng.field_e) {
            rt.field_F.b(Integer.toString(hk.field_L), -23174);
          } else {
            rt.field_F.b("", -23174);
          }
        }
        kr.field_a.field_Gb = ng.field_e;
        if (bd.field_A.field_sb == 1) {
          this.field_I = false;
          this.field_F = true;
        }
        if (rt.field_F.field_sb == 1) {
          this.field_F = false;
          this.field_I = true;
        }
        if (!ng.field_e) {
          this.field_I = false;
        }
        var3 = 0;
        var4 = 0;
        var5 = 5;
        for (var6 = 0; var6 < 3; var6++) {
          if (qp.field_L.field_qb == 1) {
            if (wo.field_o % var5 == 0) {
              if (!ng.field_e) {
                stackIn_85_0 = qd.field_g;
              } else {
                stackIn_85_0 = hk.field_L;
              }
              if (stackIn_85_0 > ad.field_f) {
                ad.field_f = ad.field_f + 1;
                if (ng.field_e) {
                  stackIn_89_0 = hk.field_L;
                } else {
                  stackIn_89_0 = qd.field_g;
                }
                if (stackIn_89_0 < ad.field_f) {
                  if (ng.field_e) {
                    stackIn_93_0 = hk.field_L;
                  } else {
                    stackIn_93_0 = qd.field_g;
                  }
                  ad.field_f = stackIn_93_0;
                }
                sp.c(60, param0 ^ -17);
                var4 = 1;
              }
            }
            var3 = 1;
          }
          if (1 == hk.field_I.field_qb) {
            if (wo.field_o % var5 == 0 &&
              an.field_c < ad.field_f) {
              ad.field_f = ad.field_f - 1;
              if (ad.field_f < an.field_c) {
                ad.field_f = an.field_c;
              }
              sp.c(59, -94);
              var4 = 1;
            }
            var3 = 1;
          }
          if (fn.field_a.field_qb == 1) {
            if (0 == wo.field_o % var5 &&
              hk.field_L < qd.field_g) {
              hk.field_L = hk.field_L + 1;
              if (hk.field_L > qd.field_g) {
                hk.field_L = qd.field_g;
              }
              sp.c(60, param0 - 125);
              var4 = 1;
            }
            var3 = 1;
          }
          boolean decompiledFrameRemainder1 = true;
          if (1 == hq.field_c.field_qb) {
            if (wo.field_o % var5 == 0) {
              if (ad.field_f >= hk.field_L) {
                var3 = 1;
                decompiledFrameRemainder1 = false;
              }
              else {
                hk.field_L = hk.field_L - 1;
                if (hk.field_L < ad.field_f) {
                  hk.field_L = ad.field_f;
                }
                sp.c(59, 88);
                var4 = 1;
              }
            }
            if (decompiledFrameRemainder1) {
              var3 = 1;
            }
          }
        }
        if (var3 == 0) {
          wo.field_o = 0;
        } else {
          wo.field_o = wo.field_o + 1;
        }
        if (var4 != 0) {
          this.field_F = false;
          this.field_I = false;
          var6_ref_String = bd.field_A.j((byte) -16);
          if (var6_ref_String != null &&
            var6_ref_String.length() > 0) {
            stackIn_135_0 = Integer.parseInt(var6_ref_String);
          } else {
            stackIn_135_0 = 0;
          }
          var7 = stackIn_135_0;
          if (var7 != ad.field_f) {
            stackIn_138_0 = bd.field_A;
            if (ad.field_f > 0) {
              stackIn_139_1 = Integer.toString(ad.field_f);
            } else {
              stackIn_139_1 = "";
            }
            ((vg) (Object) stackIn_138_0).b(stackIn_139_1, -23174);
          }
          if (ng.field_e) {
            var8 = rt.field_F.j((byte) -16);
            if (var8 != null &&
              var8.length() > 0) {
              stackIn_145_0 = Integer.parseInt(var8);
            } else {
              stackIn_145_0 = 0;
            }
            var7Lifetime5 = stackIn_145_0;
            if (var7Lifetime5 != hk.field_L) {
              stackIn_149_0 = rt.field_F;
              if (hk.field_L <= 0) {
                stackIn_150_1 = "";
              } else {
                stackIn_150_1 = Integer.toString(hk.field_L);
              }
              ((vg) (Object) stackIn_149_0).b(stackIn_150_1, -23174);
            }
          }
        }
        for (var6Lifetime1 = 0; of.field_d.length > var6Lifetime1; var6Lifetime1++) {
          if (of.field_d[var6Lifetime1].field_sb == 1) {
            ee.field_d = var6Lifetime1;
            sp.c(61, 14);
            this.field_I = false;
            this.field_F = false;
          }
        }
        if (bd.field_A.j((byte) -16) != null &&
          bd.field_A.j((byte) -16).length() > 0) {
          stackIn_163_0 = Integer.parseInt(bd.field_A.j((byte) -16));
        } else {
          stackIn_163_0 = 0;
        }
        boolean decompiledFrameRemainder0 = true;
        var6Lifetime2 = stackIn_163_0;
        if (var6Lifetime2 >= an.field_c &&
          qd.field_g >= var6Lifetime2 && (!ng.field_e ||
          !(var6Lifetime2 > hk.field_L))) {
          bd.field_A.b(16777215, (byte) 120);
          decompiledFrameRemainder0 = false;
        }
        else {
          bd.field_A.b(16711680, (byte) 125);
        }
        if (ng.field_e) {
          if (rt.field_F.j((byte) -16) != null &&
            rt.field_F.j((byte) -16).length() > 0) {
            stackIn_176_0 = Integer.parseInt(rt.field_F.j((byte) -16));
          } else {
            stackIn_176_0 = 0;
          }
          var7Lifetime1 = stackIn_176_0;
          if (an.field_c <= var7Lifetime1 &&
            var7Lifetime1 <= qd.field_g &&
            ad.field_f <= var7Lifetime1) {
            rt.field_F.b(16777215, (byte) 126);
          } else {
            rt.field_F.b(16711680, (byte) -127);
          }
        }
        var7Lifetime2 = 1;
        stackIn_183_0 = var7Lifetime2;
        stackIn_184_1 = (qd.field_g < ad.field_f) ? 0 : 1;
        var7Lifetime3 = stackIn_183_0 & stackIn_184_1;
        stackIn_186_0 = var7Lifetime3;
        stackIn_187_1 = (an.field_c > ad.field_f) ? 0 : 1;
        var7Lifetime4 = stackIn_186_0 & stackIn_187_1;
        if (ng.field_e) {
          stackIn_191_0 = var7Lifetime4;
          stackIn_192_1 = (hk.field_L < ad.field_f) ? 0 : 1;
          var7Lifetime4 = stackIn_191_0 & stackIn_192_1;
          stackIn_194_0 = var7Lifetime4;
          stackIn_195_1 = (hk.field_L < ad.field_f) ? 0 : 1;
          var7Lifetime4 = stackIn_194_0 & stackIn_195_1;
          stackIn_197_0 = var7Lifetime4;
          stackIn_198_1 = (hk.field_L > qd.field_g) ? 0 : 1;
          var7Lifetime4 = stackIn_197_0 & stackIn_198_1;
          stackIn_200_0 = var7Lifetime4;
          stackIn_201_1 = (hk.field_L < an.field_c) ? 0 : 1;
          var7Lifetime4 = stackIn_200_0 & stackIn_201_1;
        }
        stackIn_204_0 = this.field_i[0];
        stackIn_205_1 = (var7Lifetime4 == 0) ? false : true;
        stackIn_204_0.field_lb = stackIn_205_1;
        if (param0 != 3) {
          this.a(-126, (byte) 75, '￺');
        }
    }

    static {
    }
}
