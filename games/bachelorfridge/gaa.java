/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gaa extends lg {
    static String field_l;
    static ma[] field_i;
    static int field_k;
    boolean field_j;
    private jfa field_h;

    final static void a(po param0, vr param1, int param2) {
        int var3 = 0;
        jc var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        Object var11 = null;
        Object var12 = null;
        Object var13 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        var9 = BachelorFridge.field_y;
        var3 = kt.field_k;
        fo.field_a = new sna(0L, (sna) null);
        if (param1 != null) {
          param1.field_g = false;
          param1.field_e = 0;
          bga.field_l = new cc(var3, param1, param1);
          cea.field_h = new wk(var3, param1, param1, (so) (Object) new oe());
          var4 = kn.a(128);
          if (var4 != null) {
            nh.a(0, var4);
            var13 = null;
            mj.field_k = qla.a(1513239, 1513239, 0, 1127256, 65793, 8947848, -24, (po) null, 4020342, 2245737, 5138823, 65793, 65793);
            tga.field_p = qla.a(0, 0, 16764006, 0, 0, 0, -24, param0, 0, 0, 0, 0, 0);
            jv.field_i = qla.a(0, 0, 16777215, 0, 0, 0, -24, param0, 0, 0, 0, 0, 0);
            var5 = dg.field_i;
            var6 = dg.field_c;
            var17 = dg.field_e;
            var16 = var17;
            var15 = var16;
            if (param2 <= -53) {
              kga.field_a = new kv(10, 14);
              kga.field_a.b();
              var8 = 2;
              L0: while (true) {
                if (7 <= var8) {
                  dg.a(var17, var5, var6);
                  sc.field_m = ad.a(mj.field_k, var4, tga.field_p, jv.field_i, false);
                  fo.field_a.field_z = new eaa();
                  return;
                } else {
                  dg.f(var8, var8 + 1, 14 + -(var8 << 134815873), 16777215);
                  var8++;
                  continue L0;
                }
              }
            } else {
              var10 = null;
              gaa.a((String) null, -16);
              kga.field_a = new kv(10, 14);
              kga.field_a.b();
              var8 = 2;
              L1: while (true) {
                if (7 <= var8) {
                  dg.a(var17, var5, var6);
                  sc.field_m = ad.a(mj.field_k, var4, tga.field_p, jv.field_i, false);
                  fo.field_a.field_z = new eaa();
                  return;
                } else {
                  dg.f(var8, var8 + 1, 14 + -(var8 << 134815873), 16777215);
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            var12 = null;
            cv.a(1, "QC2", (Throwable) null);
            return;
          }
        } else {
          var11 = null;
          cv.a(1, "QC1", (Throwable) null);
          return;
        }
    }

    final static void a(sna param0, sna param1, byte param2, sna param3, sna param4) {
        String var5 = null;
        int var6 = 0;
        Object var7 = null;
        var6 = BachelorFridge.field_y;
        if (lna.field_C == null) {
          lna.field_q = false;
          if (hl.field_I) {
            var5 = kna.field_h;
            var7 = null;
            pp.a(vq.field_w, 5, var5, 0, (String) null);
            jba.field_A.field_G = (8355711 & uc.field_l.field_G >> 715195425) + vq.field_w + -((vq.field_w & 16711422) >> -1950608191);
            jba.field_A.field_ab = ((uc.field_l.field_ab & 16711423) >> -1600929151) + -(8355711 & vq.field_w >> 1652335745) + vq.field_w;
            jba.field_A.field_w = ((uc.field_l.field_w & 16711423) >> 1791790433) + (-((vq.field_w & 16711423) >> 233803489) + vq.field_w);
            lna.field_C = jba.field_A;
            qk.field_q = ts.field_r;
            bi.field_h = new sna(0L, param4);
            qc.field_b = new sna(0L, param3);
            tga.field_m = new sna(0L, (sna) null);
            aja.field_p = new sna(0L, param1);
            jba.field_A = new sna(0L, param0);
            jba.field_A.field_jb = dc.field_r;
            aja.field_p.a(-1, jba.field_A);
            if (param2 != 55) {
              field_k = -39;
              ts.field_r = new sna(0L, qk.field_q);
              aja.field_p.a(param2 ^ -56, ts.field_r);
              ub.field_k = new sna(0L, uc.field_l, nw.field_s);
              qq.field_k = new sna(0L, uc.field_l);
              bi.field_h.a(param2 ^ -56, qc.field_b);
              bi.field_h.a(-1, tga.field_m);
              tga.field_m.a(param2 ^ -56, aja.field_p);
              tga.field_m.a(param2 ^ -56, ub.field_k);
              tga.field_m.a(-1, qq.field_k);
              return;
            } else {
              ts.field_r = new sna(0L, qk.field_q);
              aja.field_p.a(param2 ^ -56, ts.field_r);
              ub.field_k = new sna(0L, uc.field_l, nw.field_s);
              qq.field_k = new sna(0L, uc.field_l);
              bi.field_h.a(param2 ^ -56, qc.field_b);
              bi.field_h.a(-1, tga.field_m);
              tga.field_m.a(param2 ^ -56, aja.field_p);
              tga.field_m.a(param2 ^ -56, ub.field_k);
              tga.field_m.a(-1, qq.field_k);
              return;
            }
          } else {
            if (!sea.field_j) {
              var5 = qg.field_a;
              var7 = null;
              pp.a(vq.field_w, 5, var5, 0, (String) null);
              jba.field_A.field_G = (8355711 & uc.field_l.field_G >> 715195425) + vq.field_w + -((vq.field_w & 16711422) >> -1950608191);
              jba.field_A.field_ab = ((uc.field_l.field_ab & 16711423) >> -1600929151) + -(8355711 & vq.field_w >> 1652335745) + vq.field_w;
              jba.field_A.field_w = ((uc.field_l.field_w & 16711423) >> 1791790433) + (-((vq.field_w & 16711423) >> 233803489) + vq.field_w);
              lna.field_C = jba.field_A;
              qk.field_q = ts.field_r;
              bi.field_h = new sna(0L, param4);
              qc.field_b = new sna(0L, param3);
              tga.field_m = new sna(0L, (sna) null);
              aja.field_p = new sna(0L, param1);
              jba.field_A = new sna(0L, param0);
              jba.field_A.field_jb = dc.field_r;
              aja.field_p.a(-1, jba.field_A);
              if (param2 == 55) {
                ts.field_r = new sna(0L, qk.field_q);
                aja.field_p.a(param2 ^ -56, ts.field_r);
                ub.field_k = new sna(0L, uc.field_l, nw.field_s);
                qq.field_k = new sna(0L, uc.field_l);
                bi.field_h.a(param2 ^ -56, qc.field_b);
                bi.field_h.a(-1, tga.field_m);
                tga.field_m.a(param2 ^ -56, aja.field_p);
                tga.field_m.a(param2 ^ -56, ub.field_k);
                tga.field_m.a(-1, qq.field_k);
                return;
              } else {
                field_k = -39;
                ts.field_r = new sna(0L, qk.field_q);
                aja.field_p.a(param2 ^ -56, ts.field_r);
                ub.field_k = new sna(0L, uc.field_l, nw.field_s);
                qq.field_k = new sna(0L, uc.field_l);
                bi.field_h.a(param2 ^ -56, qc.field_b);
                bi.field_h.a(-1, tga.field_m);
                tga.field_m.a(param2 ^ -56, aja.field_p);
                tga.field_m.a(param2 ^ -56, ub.field_k);
                tga.field_m.a(-1, qq.field_k);
                return;
              }
            } else {
              var5 = uda.field_eb;
              var7 = null;
              pp.a(vq.field_w, 5, var5, 0, (String) null);
              jba.field_A.field_G = (8355711 & uc.field_l.field_G >> 715195425) + vq.field_w + -((vq.field_w & 16711422) >> -1950608191);
              jba.field_A.field_ab = ((uc.field_l.field_ab & 16711423) >> -1600929151) + -(8355711 & vq.field_w >> 1652335745) + vq.field_w;
              jba.field_A.field_w = ((uc.field_l.field_w & 16711423) >> 1791790433) + (-((vq.field_w & 16711423) >> 233803489) + vq.field_w);
              lna.field_C = jba.field_A;
              qk.field_q = ts.field_r;
              bi.field_h = new sna(0L, param4);
              qc.field_b = new sna(0L, param3);
              tga.field_m = new sna(0L, (sna) null);
              aja.field_p = new sna(0L, param1);
              jba.field_A = new sna(0L, param0);
              jba.field_A.field_jb = dc.field_r;
              aja.field_p.a(-1, jba.field_A);
              if (param2 == 55) {
                ts.field_r = new sna(0L, qk.field_q);
                aja.field_p.a(param2 ^ -56, ts.field_r);
                ub.field_k = new sna(0L, uc.field_l, nw.field_s);
                qq.field_k = new sna(0L, uc.field_l);
                bi.field_h.a(param2 ^ -56, qc.field_b);
                bi.field_h.a(-1, tga.field_m);
                tga.field_m.a(param2 ^ -56, aja.field_p);
                tga.field_m.a(param2 ^ -56, ub.field_k);
                tga.field_m.a(-1, qq.field_k);
                return;
              } else {
                field_k = -39;
                ts.field_r = new sna(0L, qk.field_q);
                aja.field_p.a(param2 ^ -56, ts.field_r);
                ub.field_k = new sna(0L, uc.field_l, nw.field_s);
                qq.field_k = new sna(0L, uc.field_l);
                bi.field_h.a(param2 ^ -56, qc.field_b);
                bi.field_h.a(-1, tga.field_m);
                tga.field_m.a(param2 ^ -56, aja.field_p);
                tga.field_m.a(param2 ^ -56, ub.field_k);
                tga.field_m.a(-1, qq.field_k);
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(String param0, int param1) {
        gja.a(param0, (byte) 92);
        uv.a(false, oc.field_m, false);
        if (param1 > -81) {
            Object var3 = null;
            gaa.a((String) null, -56);
        }
    }

    private final void a(byte param0) {
        int var2 = 35 % ((15 - param0) / 49);
        ((gaa) this).field_a.field_z = null;
        ((gaa) this).a(qga.field_s, 40, -4586, 72, 334, 260);
        ((gaa) this).a(hea.field_s, 40, -4586, 72, 334, 366);
    }

    public static void d(int param0) {
        field_l = null;
        field_i = null;
        if (param0 != 350) {
            Object var2 = null;
            gaa.a((String) null, -96);
        }
    }

    gaa(int param0, int param1, int param2, int param3, boolean param4, jfa param5) {
        super(param0, param1, param2, param3, 0, (String) null);
        ((gaa) this).field_j = param4 ? true : false;
        ((gaa) this).field_h = param5;
        this.a((byte) 82);
    }

    final void e(int param0) {
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        ew.field_r.e(((gaa) this).field_g, ((gaa) this).field_f);
        dg.a(((gaa) this).field_g - -40, ((gaa) this).field_f + 20, ((gaa) this).field_d - 110, ((gaa) this).field_c - 30, 20, 65793, 64);
        ((gaa) this).field_h.field_v.a(false, false, 2048, 2048, param0, -28, 256, 230, 150);
        if (!((gaa) this).field_j) {
          L0: {
            wq.a(1, 14, 300, 16777215, ((gaa) this).field_f + 16, 300, 65793, true, tba.field_r, 0, ((gaa) this).field_g + 54);
            laa.a(284, (byte) -95, 310, 16777215, us.field_a, 65793);
            ana.field_r.e(244, 330);
            stackOut_5_0 = 356;
            stackOut_5_1 = -111;
            stackOut_5_2 = 298;
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_7_2 = stackOut_5_2;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            stackIn_6_2 = stackOut_5_2;
            if (((gaa) this).field_j) {
              stackOut_7_0 = stackIn_7_0;
              stackOut_7_1 = stackIn_7_1;
              stackOut_7_2 = stackIn_7_2;
              stackOut_7_3 = 16777215;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              stackIn_8_3 = stackOut_7_3;
              break L0;
            } else {
              stackOut_6_0 = stackIn_6_0;
              stackOut_6_1 = stackIn_6_1;
              stackOut_6_2 = stackIn_6_2;
              stackOut_6_3 = 8421504;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              stackIn_8_3 = stackOut_6_3;
              break L0;
            }
          }
          laa.a(stackIn_8_0, (byte) stackIn_8_1, stackIn_8_2, stackIn_8_3, qga.field_s, 65793);
          ana.field_r.e(350, 330);
          laa.a(356, (byte) -65, 402, 16777215, hea.field_s, 65793);
          return;
        } else {
          L1: {
            wq.a(1, 14, 300, 16777215, ((gaa) this).field_f + 10, 300, 65793, true, qi.field_a, 0, ((gaa) this).field_g + 54);
            laa.a(284, (byte) -56, 310, 16777215, lga.a(true, new String[1], he.field_o), 65793);
            ana.field_r.e(244, 330);
            stackOut_1_0 = 356;
            stackOut_1_1 = -111;
            stackOut_1_2 = 298;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_2_0 = stackOut_1_0;
            stackIn_2_1 = stackOut_1_1;
            stackIn_2_2 = stackOut_1_2;
            if (((gaa) this).field_j) {
              stackOut_3_0 = stackIn_3_0;
              stackOut_3_1 = stackIn_3_1;
              stackOut_3_2 = stackIn_3_2;
              stackOut_3_3 = 16777215;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              stackIn_4_2 = stackOut_3_2;
              stackIn_4_3 = stackOut_3_3;
              break L1;
            } else {
              stackOut_2_0 = stackIn_2_0;
              stackOut_2_1 = stackIn_2_1;
              stackOut_2_2 = stackIn_2_2;
              stackOut_2_3 = 8421504;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_4_2 = stackOut_2_2;
              stackIn_4_3 = stackOut_2_3;
              break L1;
            }
          }
          laa.a(stackIn_4_0, (byte) stackIn_4_1, stackIn_4_2, stackIn_4_3, qga.field_s, 65793);
          ana.field_r.e(350, 330);
          laa.a(356, (byte) -65, 402, 16777215, hea.field_s, 65793);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "You";
    }
}
