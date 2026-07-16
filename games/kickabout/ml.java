/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml extends iw {
    static String[] field_s;
    private int field_u;
    static String[] field_t;
    static ot field_q;
    private int field_o;
    static int[] field_r;
    private aq field_p;
    static char field_v;

    public static void m(int param0) {
        field_r = null;
        field_t = null;
        field_q = null;
        field_s = null;
        if (param0 != 0) {
            field_s = null;
        }
    }

    final void p(int param0) {
        if (param0 > -99) {
            field_t = null;
        }
        ((ml) this).field_o = ((ml) this).field_n * 8;
    }

    final static void a(int param0, sj param1) {
        ut var2 = new ut(param1.a("", "final_frame.jpg", 8), (java.awt.Component) (Object) ic.field_d);
        int var3 = var2.field_q;
        int var4 = var2.field_w;
        tr.d(-12974);
        js.field_a = new ut(var3, param0 * var4 / 4);
        js.field_a.e();
        var2.d(0, 0);
        po.field_e = new ut(var3, var4 - js.field_a.field_w);
        po.field_e.e();
        var2.d(0, -js.field_a.field_w);
        po.field_e.field_n = js.field_a.field_w;
        ta.e(123);
    }

    final void b(int param0, byte param1) {
        int fieldTemp$0 = ((ml) this).field_n;
        ((ml) this).field_n = ((ml) this).field_n + 1;
        ((ml) this).field_f[fieldTemp$0] = (byte)(param0 + ((ml) this).field_p.b((byte) 100));
        int var3 = -46 % ((param1 - 13) / 59);
    }

    final void a(int param0, int param1, int param2) {
        int var5 = Kickabout.field_G;
        if (param1 < 34) {
            ml.m(35);
        }
        param2 = param2 & ti.field_b[param0];
        while (((ml) this).field_u < param0) {
            param0 = param0 - ((ml) this).field_u;
            int fieldTemp$0 = ((ml) this).field_n;
            ((ml) this).field_n = ((ml) this).field_n + 1;
            ((ml) this).field_f[fieldTemp$0] = (byte)(((ml) this).field_f[fieldTemp$0] + (param2 >>> param0));
            ((ml) this).field_f[((ml) this).field_n] = (byte) 0;
            ((ml) this).field_u = 8;
        }
        if (((ml) this).field_u != param0) {
            ((ml) this).field_u = ((ml) this).field_u - param0;
            ((ml) this).field_f[((ml) this).field_n] = (byte)(((ml) this).field_f[((ml) this).field_n] + (param2 << ((ml) this).field_u));
        } else {
            int fieldTemp$1 = ((ml) this).field_n;
            ((ml) this).field_n = ((ml) this).field_n + 1;
            ((ml) this).field_f[fieldTemp$1] = (byte)(((ml) this).field_f[fieldTemp$1] + param2);
            ((ml) this).field_f[((ml) this).field_n] = (byte) 0;
            ((ml) this).field_u = 8;
        }
    }

    final static void o(int param0) {
        fb.field_Q[47] = 73;
        fb.field_Q[45] = 26;
        fb.field_Q[46] = 72;
        fb.field_Q[91] = 42;
        fb.field_Q[93] = 43;
        fb.field_Q[59] = 57;
        fb.field_Q[44] = 71;
        fb.field_Q[520] = 59;
        fb.field_Q[222] = 58;
        fb.field_Q[192] = 28;
        if (param0 != 255) {
            field_v = 'ￄ';
        }
        fb.field_Q[92] = 74;
        fb.field_Q[61] = 27;
    }

    final void l(byte param0) {
        ((ml) this).field_n = (7 + ((ml) this).field_o) / 8;
        int var2 = 34 % ((param0 - 32) / 62);
    }

    final void a(byte param0, int param1, byte[] param2, int param3) {
        int var5 = 0;
        int var6 = Kickabout.field_G;
        for (var5 = 0; var5 < param3; var5++) {
            int fieldTemp$0 = ((ml) this).field_n;
            ((ml) this).field_n = ((ml) this).field_n + 1;
            param2[param1 + var5] = (byte)(((ml) this).field_f[fieldTemp$0] + -((ml) this).field_p.b((byte) 119));
        }
        if (param0 != -30) {
            ((ml) this).field_u = -126;
        }
    }

    final static void c(boolean param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        hd stackIn_3_0 = null;
        hd stackIn_4_0 = null;
        hd stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        hd stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        hd stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        hd stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        int stackIn_8_4 = 0;
        hd stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        int stackIn_9_4 = 0;
        int stackIn_9_5 = 0;
        hd stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        int stackIn_10_3 = 0;
        int stackIn_10_4 = 0;
        int stackIn_10_5 = 0;
        hd stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        int stackIn_11_4 = 0;
        int stackIn_11_5 = 0;
        int stackIn_11_6 = 0;
        hd stackIn_12_0 = null;
        hd stackIn_13_0 = null;
        hd stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_17_0 = 0;
        hd stackIn_18_0 = null;
        hd stackIn_19_0 = null;
        hd stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        hd stackOut_2_0 = null;
        hd stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        hd stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        hd stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        hd stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        int stackOut_7_4 = 0;
        hd stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        hd stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        int stackOut_8_4 = 0;
        int stackOut_8_5 = 0;
        hd stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        int stackOut_10_4 = 0;
        int stackOut_10_5 = 0;
        int stackOut_10_6 = 0;
        hd stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        int stackOut_9_4 = 0;
        int stackOut_9_5 = 0;
        int stackOut_9_6 = 0;
        hd stackOut_11_0 = null;
        hd stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        hd stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        hd stackOut_17_0 = null;
        hd stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        hd stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        L0: {
          ea.field_a = on.field_g;
          bh.field_s = on.field_f;
          pa.b((byte) 92);
          tn.field_d.a(0, ss.field_c.field_q, 0, -2 + ss.field_c.field_mb + -40, (byte) -123);
          li.field_a.a(true, m.field_m.field_q, 0, 0, sh.field_c);
          var1 = sh.field_c - -2;
          if (!param0) {
            break L0;
          } else {
            var4 = null;
            ml.a(-41, (sj) null);
            break L0;
          }
        }
        L1: {
          stackOut_2_0 = mc.field_d;
          stackIn_4_0 = stackOut_2_0;
          stackIn_3_0 = stackOut_2_0;
          if (param0) {
            stackOut_4_0 = (hd) (Object) stackIn_4_0;
            stackOut_4_1 = 0;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            break L1;
          } else {
            stackOut_3_0 = (hd) (Object) stackIn_3_0;
            stackOut_3_1 = 1;
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            break L1;
          }
        }
        L2: {
          stackOut_5_0 = (hd) (Object) stackIn_5_0;
          stackOut_5_1 = stackIn_5_1;
          stackOut_5_2 = m.field_m.field_q;
          stackOut_5_3 = 0;
          stackIn_7_0 = stackOut_5_0;
          stackIn_7_1 = stackOut_5_1;
          stackIn_7_2 = stackOut_5_2;
          stackIn_7_3 = stackOut_5_3;
          stackIn_6_0 = stackOut_5_0;
          stackIn_6_1 = stackOut_5_1;
          stackIn_6_2 = stackOut_5_2;
          stackIn_6_3 = stackOut_5_3;
          if (!ui.field_t) {
            stackOut_7_0 = (hd) (Object) stackIn_7_0;
            stackOut_7_1 = stackIn_7_1;
            stackOut_7_2 = stackIn_7_2;
            stackOut_7_3 = stackIn_7_3;
            stackOut_7_4 = 0;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            stackIn_8_2 = stackOut_7_2;
            stackIn_8_3 = stackOut_7_3;
            stackIn_8_4 = stackOut_7_4;
            break L2;
          } else {
            stackOut_6_0 = (hd) (Object) stackIn_6_0;
            stackOut_6_1 = stackIn_6_1;
            stackOut_6_2 = stackIn_6_2;
            stackOut_6_3 = stackIn_6_3;
            stackOut_6_4 = var1;
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_8_2 = stackOut_6_2;
            stackIn_8_3 = stackOut_6_3;
            stackIn_8_4 = stackOut_6_4;
            break L2;
          }
        }
        L3: {
          stackOut_8_0 = (hd) (Object) stackIn_8_0;
          stackOut_8_1 = stackIn_8_1;
          stackOut_8_2 = stackIn_8_2;
          stackOut_8_3 = stackIn_8_3;
          stackOut_8_4 = stackIn_8_4;
          stackOut_8_5 = m.field_m.field_mb;
          stackIn_10_0 = stackOut_8_0;
          stackIn_10_1 = stackOut_8_1;
          stackIn_10_2 = stackOut_8_2;
          stackIn_10_3 = stackOut_8_3;
          stackIn_10_4 = stackOut_8_4;
          stackIn_10_5 = stackOut_8_5;
          stackIn_9_0 = stackOut_8_0;
          stackIn_9_1 = stackOut_8_1;
          stackIn_9_2 = stackOut_8_2;
          stackIn_9_3 = stackOut_8_3;
          stackIn_9_4 = stackOut_8_4;
          stackIn_9_5 = stackOut_8_5;
          if (!ui.field_t) {
            stackOut_10_0 = (hd) (Object) stackIn_10_0;
            stackOut_10_1 = stackIn_10_1;
            stackOut_10_2 = stackIn_10_2;
            stackOut_10_3 = stackIn_10_3;
            stackOut_10_4 = stackIn_10_4;
            stackOut_10_5 = stackIn_10_5;
            stackOut_10_6 = 0;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            stackIn_11_2 = stackOut_10_2;
            stackIn_11_3 = stackOut_10_3;
            stackIn_11_4 = stackOut_10_4;
            stackIn_11_5 = stackOut_10_5;
            stackIn_11_6 = stackOut_10_6;
            break L3;
          } else {
            stackOut_9_0 = (hd) (Object) stackIn_9_0;
            stackOut_9_1 = stackIn_9_1;
            stackOut_9_2 = stackIn_9_2;
            stackOut_9_3 = stackIn_9_3;
            stackOut_9_4 = stackIn_9_4;
            stackOut_9_5 = stackIn_9_5;
            stackOut_9_6 = var1;
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_11_2 = stackOut_9_2;
            stackIn_11_3 = stackOut_9_3;
            stackIn_11_4 = stackOut_9_4;
            stackIn_11_5 = stackOut_9_5;
            stackIn_11_6 = stackOut_9_6;
            break L3;
          }
        }
        L4: {
          ((hd) (Object) stackIn_11_0).a(stackIn_11_1 != 0, stackIn_11_2, stackIn_11_3, stackIn_11_4, stackIn_11_5 + -stackIn_11_6);
          bs.a(0);
          rg.field_a.a(true, ss.field_c.field_q, 0, ss.field_c.field_mb + -40, 40);
          fp.field_o.a(true, af.field_d.field_q, 0, 0, 30);
          stackOut_11_0 = bt.field_b;
          stackIn_13_0 = stackOut_11_0;
          stackIn_12_0 = stackOut_11_0;
          if (param0) {
            stackOut_13_0 = (hd) (Object) stackIn_13_0;
            stackOut_13_1 = 0;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            break L4;
          } else {
            stackOut_12_0 = (hd) (Object) stackIn_12_0;
            stackOut_12_1 = 1;
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            break L4;
          }
        }
        L5: {
          ((hd) (Object) stackIn_14_0).a(stackIn_14_1 != 0, af.field_d.field_q, 0, 30, -2 + (-40 + (af.field_d.field_mb - 30)));
          va.field_w.a(true, 68, 5, 5, 30);
          qq.field_G.a(true, 78, 75, 5, 30);
          qv.field_n.a(true, 48, 155, 5, 30);
          df.field_G.a(true, 48, 205, 5, 30);
          if (ui.field_t) {
            stackOut_16_0 = 250;
            stackIn_17_0 = stackOut_16_0;
            break L5;
          } else {
            stackOut_15_0 = 200;
            stackIn_17_0 = stackOut_15_0;
            break L5;
          }
        }
        L6: {
          var2 = stackIn_17_0;
          stackOut_17_0 = cj.field_D;
          stackIn_19_0 = stackOut_17_0;
          stackIn_18_0 = stackOut_17_0;
          if (param0) {
            stackOut_19_0 = (hd) (Object) stackIn_19_0;
            stackOut_19_1 = 0;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            break L6;
          } else {
            stackOut_18_0 = (hd) (Object) stackIn_18_0;
            stackOut_18_1 = 1;
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            break L6;
          }
        }
        L7: {
          ((hd) (Object) stackIn_20_0).a(stackIn_20_1 != 0, -var2 + 363, var2 + 5, 5, 30);
          jn.field_lb.a(true, -370 + (-5 + af.field_d.field_q), 370, 5, 30);
          sp.field_Jb.a(2, 55, -10 + (bt.field_b.field_mb - 32), 37, 5, -5 + bt.field_b.field_q + -5, oe.field_f);
          var3 = (2 + af.field_d.field_q) / 2;
          dr.field_d.a(true, var3 + -2, 0, -40 + af.field_d.field_mb, 40);
          if (!ui.field_t) {
            var3 = 0;
            break L7;
          } else {
            break L7;
          }
        }
        ps.field_b.a(true, -var3 + af.field_d.field_q, var3, -40 + af.field_d.field_mb, 40);
    }

    final static void k(int param0, int param1) {
        if (param0 != 61) {
            ml.m(-70);
        }
        if (!(sk.field_c <= param1)) {
            return;
        }
        sk.field_c = param1;
        sk.a(101, 1, 0);
    }

    ml(byte[] param0) {
        super(param0);
    }

    ml(int param0) {
        super(param0);
    }

    final void n(int param0) {
        ((ml) this).field_f[((ml) this).field_n] = (byte) 0;
        ((ml) this).field_u = 8;
        if (param0 > -39) {
            ((ml) this).field_o = 31;
        }
    }

    final void b(boolean param0) {
        if (!((((ml) this).field_u ^ -1) <= -9)) {
            ((ml) this).field_u = 8;
            ((ml) this).field_n = ((ml) this).field_n + 1;
        }
        if (param0) {
            ml.k(-89, 18);
        }
    }

    final int k(byte param0) {
        if (param0 <= 90) {
            ((ml) this).l((byte) 22);
        }
        int fieldTemp$0 = ((ml) this).field_n;
        ((ml) this).field_n = ((ml) this).field_n + 1;
        return ((ml) this).field_f[fieldTemp$0] + -((ml) this).field_p.b((byte) 126) & 255;
    }

    final int l(int param0, int param1) {
        int var6 = Kickabout.field_G;
        int var3 = ((ml) this).field_o >> -2132812157;
        int var4 = 8 - (7 & ((ml) this).field_o);
        int var5 = 0;
        if (param1 != 59) {
            return -66;
        }
        ((ml) this).field_o = ((ml) this).field_o + param0;
        while (param0 > var4) {
            int incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((((ml) this).field_f[incrementValue$0] & ti.field_b[var4]) << -var4 + param0);
            param0 = param0 - var4;
            var4 = 8;
        }
        if (var4 == param0) {
            var5 = var5 + (((ml) this).field_f[var3] & ti.field_b[var4]);
        } else {
            var5 = var5 + (((ml) this).field_f[var3] >> var4 + -param0 & ti.field_b[param0]);
        }
        return var5;
    }

    final void a(byte param0, int[] param1) {
        ((ml) this).field_p = new aq(param1);
        if (param0 <= 99) {
            ((ml) this).field_u = 93;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new String[]{"Starting Price", "Buyout", "Duration"};
        field_s = new String[]{"<img=0>Exhibition games don't use your normal team, but premade level 50 players instead.", "<img=0>As it's not your own team, no <col=ffff00>EXP</col> or <col=ffff00>league points</col> are earnt, <col=ffff00>money</col> is still rewarded though.", "<img=0>Exhibition games are <col=ffff00>unrated</col> only", "<img=0>Exhibition games can be made when creating unrated games, or you can find the first Exhibition game available by clicking the 'Quickplay' button on the main menu."};
        field_r = new int[]{180, 220, 260, 300, 340};
        field_v = '/';
    }
}
