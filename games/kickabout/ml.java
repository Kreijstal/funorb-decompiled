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
        ut var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
            var2 = new ut(param1.a("", "final_frame.jpg", 8), (java.awt.Component) (Object) ic.field_d);
            var3 = var2.field_q;
            var4 = var2.field_w;
            tr.d(-12974);
            js.field_a = new ut(var3, 3 * var4 / 4);
            js.field_a.e();
            var2.d(0, 0);
            po.field_e = new ut(var3, var4 - js.field_a.field_w);
            po.field_e.e();
            var2.d(0, -js.field_a.field_w);
            po.field_e.field_n = js.field_a.field_w;
            ta.e(123);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "ml.K(" + 3 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
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
        fb.field_Q[92] = 74;
        fb.field_Q[61] = 27;
    }

    final void l(byte param0) {
        ((ml) this).field_n = (7 + ((ml) this).field_o) / 8;
        int var2 = 34 % ((param0 - 32) / 62);
    }

    final void a(byte param0, int param1, byte[] param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
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
                    ((ml) this).field_u = -126;
                    break L2;
                  }
                }
                break L0;
              } else {
                int fieldTemp$2 = ((ml) this).field_n;
                ((ml) this).field_n = ((ml) this).field_n + 1;
                param2[param1 + var5_int] = (byte)(((ml) this).field_f[fieldTemp$2] + -((ml) this).field_p.b((byte) 119));
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("ml.E(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param3 + ')');
        }
    }

    final static void c(boolean param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        hd stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        int stackIn_1_2 = 0;
        int stackIn_1_3 = 0;
        hd stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_2_3 = 0;
        hd stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        int stackIn_3_4 = 0;
        hd stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        int stackIn_4_4 = 0;
        int stackIn_4_5 = 0;
        hd stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int stackIn_5_4 = 0;
        int stackIn_5_5 = 0;
        hd stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        int stackIn_6_4 = 0;
        int stackIn_6_5 = 0;
        int stackIn_6_6 = 0;
        int stackIn_9_0 = 0;
        hd stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        int stackOut_0_2 = 0;
        int stackOut_0_3 = 0;
        hd stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        int stackOut_2_4 = 0;
        hd stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        int stackOut_1_4 = 0;
        hd stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        int stackOut_3_4 = 0;
        int stackOut_3_5 = 0;
        hd stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_5_4 = 0;
        int stackOut_5_5 = 0;
        int stackOut_5_6 = 0;
        hd stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int stackOut_4_4 = 0;
        int stackOut_4_5 = 0;
        int stackOut_4_6 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          ea.field_a = on.field_g;
          bh.field_s = on.field_f;
          pa.b((byte) 92);
          tn.field_d.a(0, ss.field_c.field_q, 0, -2 + ss.field_c.field_mb + -40, (byte) -123);
          li.field_a.a(true, m.field_m.field_q, 0, 0, sh.field_c);
          var1 = sh.field_c - -2;
          stackOut_0_0 = mc.field_d;
          stackOut_0_1 = 1;
          stackOut_0_2 = m.field_m.field_q;
          stackOut_0_3 = 0;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_2_2 = stackOut_0_2;
          stackIn_2_3 = stackOut_0_3;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          stackIn_1_2 = stackOut_0_2;
          stackIn_1_3 = stackOut_0_3;
          if (!ui.field_t) {
            stackOut_2_0 = (hd) (Object) stackIn_2_0;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = stackIn_2_2;
            stackOut_2_3 = stackIn_2_3;
            stackOut_2_4 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            stackIn_3_3 = stackOut_2_3;
            stackIn_3_4 = stackOut_2_4;
            break L0;
          } else {
            stackOut_1_0 = (hd) (Object) stackIn_1_0;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = stackIn_1_2;
            stackOut_1_3 = stackIn_1_3;
            stackOut_1_4 = var1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_3_3 = stackOut_1_3;
            stackIn_3_4 = stackOut_1_4;
            break L0;
          }
        }
        L1: {
          stackOut_3_0 = (hd) (Object) stackIn_3_0;
          stackOut_3_1 = stackIn_3_1;
          stackOut_3_2 = stackIn_3_2;
          stackOut_3_3 = stackIn_3_3;
          stackOut_3_4 = stackIn_3_4;
          stackOut_3_5 = m.field_m.field_mb;
          stackIn_5_0 = stackOut_3_0;
          stackIn_5_1 = stackOut_3_1;
          stackIn_5_2 = stackOut_3_2;
          stackIn_5_3 = stackOut_3_3;
          stackIn_5_4 = stackOut_3_4;
          stackIn_5_5 = stackOut_3_5;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          stackIn_4_2 = stackOut_3_2;
          stackIn_4_3 = stackOut_3_3;
          stackIn_4_4 = stackOut_3_4;
          stackIn_4_5 = stackOut_3_5;
          if (!ui.field_t) {
            stackOut_5_0 = (hd) (Object) stackIn_5_0;
            stackOut_5_1 = stackIn_5_1;
            stackOut_5_2 = stackIn_5_2;
            stackOut_5_3 = stackIn_5_3;
            stackOut_5_4 = stackIn_5_4;
            stackOut_5_5 = stackIn_5_5;
            stackOut_5_6 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            stackIn_6_2 = stackOut_5_2;
            stackIn_6_3 = stackOut_5_3;
            stackIn_6_4 = stackOut_5_4;
            stackIn_6_5 = stackOut_5_5;
            stackIn_6_6 = stackOut_5_6;
            break L1;
          } else {
            stackOut_4_0 = (hd) (Object) stackIn_4_0;
            stackOut_4_1 = stackIn_4_1;
            stackOut_4_2 = stackIn_4_2;
            stackOut_4_3 = stackIn_4_3;
            stackOut_4_4 = stackIn_4_4;
            stackOut_4_5 = stackIn_4_5;
            stackOut_4_6 = var1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_6_2 = stackOut_4_2;
            stackIn_6_3 = stackOut_4_3;
            stackIn_6_4 = stackOut_4_4;
            stackIn_6_5 = stackOut_4_5;
            stackIn_6_6 = stackOut_4_6;
            break L1;
          }
        }
        L2: {
          ((hd) (Object) stackIn_6_0).a(stackIn_6_1 != 0, stackIn_6_2, stackIn_6_3, stackIn_6_4, stackIn_6_5 + -stackIn_6_6);
          bs.a(0);
          rg.field_a.a(true, ss.field_c.field_q, 0, ss.field_c.field_mb + -40, 40);
          fp.field_o.a(true, af.field_d.field_q, 0, 0, 30);
          bt.field_b.a(true, af.field_d.field_q, 0, 30, -2 + (-40 + (af.field_d.field_mb - 30)));
          va.field_w.a(true, 68, 5, 5, 30);
          qq.field_G.a(true, 78, 75, 5, 30);
          qv.field_n.a(true, 48, 155, 5, 30);
          df.field_G.a(true, 48, 205, 5, 30);
          if (ui.field_t) {
            stackOut_8_0 = 250;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 200;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var2 = stackIn_9_0;
          cj.field_D.a(true, -var2 + 363, var2 + 5, 5, 30);
          jn.field_lb.a(true, -370 + (-5 + af.field_d.field_q), 370, 5, 30);
          sp.field_Jb.a(2, 55, -10 + (bt.field_b.field_mb - 32), 37, 5, -5 + bt.field_b.field_q + -5, oe.field_f);
          var3 = (2 + af.field_d.field_q) / 2;
          dr.field_d.a(true, var3 + -2, 0, -40 + af.field_d.field_mb, 40);
          if (!ui.field_t) {
            var3 = 0;
            break L3;
          } else {
            break L3;
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
        if (!(((ml) this).field_u >= 8)) {
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
        int var3 = ((ml) this).field_o >> 3;
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
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((ml) this).field_p = new aq(param1);
              if (param0 > 99) {
                break L1;
              } else {
                ((ml) this).field_u = 93;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ml.O(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
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
