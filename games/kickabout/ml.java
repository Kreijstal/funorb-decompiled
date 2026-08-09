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
            field_s = (String[]) null;
        }
    }

    final void p(int param0) {
        if (param0 > -99) {
            field_t = (String[]) null;
        }
        this.field_o = this.field_n * 8;
    }

    final static void a(int param0, sj param1) {
        ut var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
            var2 = new ut(param1.a("", "final_frame.jpg", 8), (java.awt.Component) ((Object) ic.field_d));
            var3 = var2.field_q;
            var4 = var2.field_w;
            tr.d(-12974);
            js.field_a = new ut(var3, param0 * var4 / 4);
            js.field_a.e();
            var2.d(0, 0);
            po.field_e = new ut(var3, var4 - js.field_a.field_w);
            po.field_e.e();
            var2.d(0, -js.field_a.field_w);
            po.field_e.field_n = js.field_a.field_w;
            ta.e(123);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "ml.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, byte param1) {
        int fieldTemp$0 = this.field_n;
        this.field_n = this.field_n + 1;
        this.field_f[fieldTemp$0] = (byte)(param0 + this.field_p.b((byte) 100));
        int var3 = -46 % ((param1 - 13) / 59);
    }

    final void a(int param0, int param1, int param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var5 = Kickabout.field_G;
        if (param1 < 34) {
            ml.m(35);
        }
        param2 = param2 & ti.field_b[param0];
        while (this.field_u < param0) {
            param0 = param0 - this.field_u;
            fieldTemp$0 = this.field_n;
            this.field_n = this.field_n + 1;
            this.field_f[fieldTemp$0] = (byte)(this.field_f[fieldTemp$0] + (param2 >>> param0));
            this.field_f[this.field_n] = (byte) 0;
            this.field_u = 8;
        }
        if (this.field_u != param0) {
            this.field_u = this.field_u - param0;
            this.field_f[this.field_n] = (byte)(this.field_f[this.field_n] + (param2 << this.field_u));
        } else {
            fieldTemp$1 = this.field_n;
            this.field_n = this.field_n + 1;
            this.field_f[fieldTemp$1] = (byte)(this.field_f[fieldTemp$1] + param2);
            this.field_f[this.field_n] = (byte) 0;
            this.field_u = 8;
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
        this.field_n = (7 + this.field_o) / 8;
        int var2 = 34 % ((param0 - 32) / 62);
    }

    final void a(byte param0, int param1, byte[] param2, int param3) {
        int fieldTemp$1 = 0;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = Kickabout.field_G;
        try {
          L0: {
            var5_int = 0;
            L1: while (true) {
              if (var5_int >= param3) {
                L2: {
                  if (param0 == -30) {
                    break L2;
                  } else {
                    this.field_u = -126;
                    break L2;
                  }
                }
                break L0;
              } else {
                fieldTemp$1 = this.field_n;
                this.field_n = this.field_n + 1;
                param2[param1 + var5_int] = (byte)(this.field_f[fieldTemp$1] + -this.field_p.b((byte) 119));
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("ml.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ')');
        }
    }

    final static void c(boolean param0) {
        hd stackIn_4_0 = null;
        hd stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_7_2;
        int stackIn_7_3;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        int stackIn_8_4 = 0;
        int stackIn_10_5;
        int stackIn_11_5 = 0;
        int stackIn_11_6 = 0;
        hd stackIn_13_0 = null;
        hd stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_17_0 = 0;
        hd stackIn_19_0 = null;
        hd stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int var1;
        int var2;
        int var3;
        sj var4;
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
            var4 = (sj) null;
            ml.a(-41, (sj) null);
            break L0;
          }
        }
        L1: {
          stackIn_4_0 = mc.field_d;

          if (param0) {
            stackIn_5_0 = (hd) ((Object) stackIn_4_0);
            stackIn_5_1 = 0;
            break L1;
          } else {
            stackIn_5_0 = (hd) ((Object) stackIn_4_0);
            stackIn_5_1 = 1;
            break L1;
          }
        }
        L2: {




          stackIn_7_2 = m.field_m.field_q;

          stackIn_7_3 = 0;

          if (!ui.field_t) {
            stackIn_5_0 = (hd) ((Object) stackIn_5_0);

            stackIn_8_2 = stackIn_7_2;
            stackIn_8_3 = stackIn_7_3;
            stackIn_8_4 = 0;
            break L2;
          } else {
            stackIn_5_0 = (hd) ((Object) stackIn_5_0);

            stackIn_8_2 = stackIn_7_2;
            stackIn_8_3 = stackIn_7_3;
            stackIn_8_4 = var1;
            break L2;
          }
        }
        L3: {










          stackIn_10_5 = m.field_m.field_mb;

          if (!ui.field_t) {
            stackIn_5_0 = (hd) ((Object) stackIn_5_0);




            stackIn_11_5 = stackIn_10_5;
            stackIn_11_6 = 0;
            break L3;
          } else {
            stackIn_5_0 = (hd) ((Object) stackIn_5_0);




            stackIn_11_5 = stackIn_10_5;
            stackIn_11_6 = var1;
            break L3;
          }
        }
        L4: {
          ((hd) (Object) stackIn_5_0).a(stackIn_5_1 != 0, stackIn_8_2, stackIn_8_3, stackIn_8_4, stackIn_11_5 + -stackIn_11_6);
          bs.a(0);
          rg.field_a.a(true, ss.field_c.field_q, 0, ss.field_c.field_mb + -40, 40);
          fp.field_o.a(true, af.field_d.field_q, 0, 0, 30);
          stackIn_13_0 = bt.field_b;

          if (param0) {
            stackIn_14_0 = (hd) ((Object) stackIn_13_0);
            stackIn_14_1 = 0;
            break L4;
          } else {
            stackIn_14_0 = (hd) ((Object) stackIn_13_0);
            stackIn_14_1 = 1;
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
            stackIn_17_0 = 250;
            break L5;
          } else {
            stackIn_17_0 = 200;
            break L5;
          }
        }
        L6: {
          var2 = stackIn_17_0;
          stackIn_19_0 = cj.field_D;

          if (param0) {
            stackIn_20_0 = (hd) ((Object) stackIn_19_0);
            stackIn_20_1 = 0;
            break L6;
          } else {
            stackIn_20_0 = (hd) ((Object) stackIn_19_0);
            stackIn_20_1 = 1;
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
        this.field_f[this.field_n] = (byte) 0;
        this.field_u = 8;
        if (param0 > -39) {
            this.field_o = 31;
        }
    }

    final void b(boolean param0) {
        if (!((this.field_u ^ -1) <= -9)) {
            this.field_u = 8;
            this.field_n = this.field_n + 1;
        }
        if (param0) {
            ml.k(-89, 18);
        }
    }

    final int k(byte param0) {
        if (param0 <= 90) {
            this.l((byte) 22);
        }
        int fieldTemp$0 = this.field_n;
        this.field_n = this.field_n + 1;
        return this.field_f[fieldTemp$0] + -this.field_p.b((byte) 126) & 255;
    }

    final int l(int param0, int param1) {
        int incrementValue$0 = 0;
        int var6 = Kickabout.field_G;
        int var3 = this.field_o >> -2132812157;
        int var4 = 8 - (7 & this.field_o);
        int var5 = 0;
        if (param1 != 59) {
            return -66;
        }
        this.field_o = this.field_o + param0;
        while (param0 > var4) {
            incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((this.field_f[incrementValue$0] & ti.field_b[var4]) << -var4 + param0);
            param0 = param0 - var4;
            var4 = 8;
        }
        if (var4 == param0) {
            var5 = var5 + (this.field_f[var3] & ti.field_b[var4]);
        } else {
            var5 = var5 + (this.field_f[var3] >> var4 + -param0 & ti.field_b[param0]);
        }
        return var5;
    }

    final void a(byte param0, int[] param1) {
        try {
            this.field_p = new aq(param1);
            if (param0 <= 99) {
                this.field_u = 93;
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "ml.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_t = new String[]{"Starting Price", "Buyout", "Duration"};
        field_s = new String[]{"<img=0>Exhibition games don't use your normal team, but premade level 50 players instead.", "<img=0>As it's not your own team, no <col=ffff00>EXP</col> or <col=ffff00>league points</col> are earnt, <col=ffff00>money</col> is still rewarded though.", "<img=0>Exhibition games are <col=ffff00>unrated</col> only", "<img=0>Exhibition games can be made when creating unrated games, or you can find the first Exhibition game available by clicking the 'Quickplay' button on the main menu."};
        field_r = new int[]{180, 220, 260, 300, 340};
        field_v = '/';
    }
}
