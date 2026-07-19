/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf extends oe implements vn {
    static String field_S;
    static String field_V;
    static int field_Q;
    private ek field_U;
    private pn field_T;
    static sb field_N;
    static ck field_O;
    static int field_R;
    static String field_P;

    final void a(ce param0, int param1, int param2, int param3) {
        try {
            if (param1 < 38) {
                field_V = (String) null;
            }
            super.a(param0, 98, param2, param3);
            this.field_U.field_I = this.field_T.a(-128).a(20350) == dc.field_b ? true : false;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "mf.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void a(byte param0, int param1, ek param2, int param3, int param4) {
        if (param0 != 67) {
            field_R = -124;
        }
        if (this.field_T.a(-101).a(param0 ^ 20285) != dc.field_b) {
            return;
        }
        try {
            kh.a(-31, this.field_T.i(-22079), this.field_T.f((byte) 48), this.field_T.b(false));
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "mf.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, java.awt.Canvas param3) {
        java.awt.Graphics var4 = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var4 = param3.getGraphics();
                  le.field_m.a((byte) 54, var4, param1, param2);
                  var4.dispose();
                  if (param0 == 1) {
                    break L2;
                  } else {
                    field_V = (String) null;
                    break L2;
                  }
                }
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L3: {
                var4_ref = (Exception) (Object) decompiledCaughtException;
                param3.repaint();
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var4_ref2);
            stackOut_5_1 = new StringBuilder().append("mf.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L4;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    final static void h(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        w stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        int stackIn_1_2 = 0;
        w stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        w stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        w stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        w stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        w stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        int stackIn_6_4 = 0;
        int stackIn_9_0 = 0;
        w stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        int stackOut_0_2 = 0;
        w stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        w stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        w stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        w stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_5_4 = 0;
        w stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int stackOut_4_4 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          vk.field_f = hk.field_i;
          wj.field_Lb = hk.field_j;
          pa.g((byte) 115);
          dc.field_e.a(g.field_R.field_N + -42, g.field_R.field_mb, 0, 107, 0);
          fn.field_g.a(aj.field_a.field_mb, 0, 0, kf.field_O, 0);
          var1 = kf.field_O + 2;
          stackOut_0_0 = gg.field_y;
          stackOut_0_1 = aj.field_a.field_mb;
          stackOut_0_2 = param0 ^ 5;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_2_2 = stackOut_0_2;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          stackIn_1_2 = stackOut_0_2;
          if (pd.field_a) {
            stackOut_2_0 = (w) ((Object) stackIn_2_0);
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = stackIn_2_2;
            stackOut_2_3 = var1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            stackIn_3_3 = stackOut_2_3;
            break L0;
          } else {
            stackOut_1_0 = (w) ((Object) stackIn_1_0);
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = stackIn_1_2;
            stackOut_1_3 = 0;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_3_3 = stackOut_1_3;
            break L0;
          }
        }
        L1: {
          stackOut_3_0 = (w) ((Object) stackIn_3_0);
          stackOut_3_1 = stackIn_3_1;
          stackOut_3_2 = stackIn_3_2;
          stackOut_3_3 = stackIn_3_3;
          stackIn_5_0 = stackOut_3_0;
          stackIn_5_1 = stackOut_3_1;
          stackIn_5_2 = stackOut_3_2;
          stackIn_5_3 = stackOut_3_3;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          stackIn_4_2 = stackOut_3_2;
          stackIn_4_3 = stackOut_3_3;
          if (pd.field_a) {
            stackOut_5_0 = (w) ((Object) stackIn_5_0);
            stackOut_5_1 = stackIn_5_1;
            stackOut_5_2 = stackIn_5_2;
            stackOut_5_3 = stackIn_5_3;
            stackOut_5_4 = var1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            stackIn_6_2 = stackOut_5_2;
            stackIn_6_3 = stackOut_5_3;
            stackIn_6_4 = stackOut_5_4;
            break L1;
          } else {
            stackOut_4_0 = (w) ((Object) stackIn_4_0);
            stackOut_4_1 = stackIn_4_1;
            stackOut_4_2 = stackIn_4_2;
            stackOut_4_3 = stackIn_4_3;
            stackOut_4_4 = 0;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_6_2 = stackOut_4_2;
            stackIn_6_3 = stackOut_4_3;
            stackIn_6_4 = stackOut_4_4;
            break L1;
          }
        }
        L2: {
          ((w) (Object) stackIn_6_0).a(stackIn_6_1, stackIn_6_2, stackIn_6_3, -stackIn_6_4 + aj.field_a.field_N, 0);
          bf.c((byte) -103);
          uh.field_c.a(g.field_R.field_mb, 0, -40 + g.field_R.field_N, 40, 0);
          p.field_b.a(wm.field_h.field_mb, 0, 0, 30, 0);
          li.field_h.a(wm.field_h.field_mb, param0 ^ 5, 30, -70 + (wm.field_h.field_N - 2), 0);
          f.field_o.a(68, param0 ^ 5, 5, 30, 5);
          d.field_a.a(78, 0, 5, 30, 75);
          tg.field_f.a(48, 0, 5, 30, 155);
          md.field_X.a(48, 0, param0, 30, 205);
          if (pd.field_a) {
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
          jc.field_h.a(363 + -var2, param0 + -5, 5, 30, 5 - -var2);
          bk.field_Rb.a(-370 + (wm.field_h.field_mb - 5), 0, 5, 30, 370);
          gf.field_c.a(6, 37, vh.field_e, 5, -10 + (li.field_h.field_N - 32), li.field_h.field_mb - 5 - 5, 2);
          var3 = (wm.field_h.field_mb + 2) / 2;
          o.field_a.a(var3 + -2, 0, wm.field_h.field_N + -40, 40, 0);
          if (pd.field_a) {
            break L3;
          } else {
            var3 = 0;
            break L3;
          }
        }
        se.field_U.a(wm.field_h.field_mb - var3, 0, wm.field_h.field_N + -40, 40, var3);
    }

    final static void a(int param0, String[] param1, byte[] param2, ji param3, int param4, String[][] param5, ck[][] param6, int param7, String[][] param8, String[] param9, String[] param10, ck[][] param11, int param12, byte[] param13, int[] param14) {
        qd[] array$3 = null;
        qd[] array$4 = null;
        qd[] array$5 = null;
        RuntimeException var15 = null;
        w var16 = null;
        int var17_int = 0;
        w var17 = null;
        int var18 = 0;
        Object var19_ref = null;
        int var19 = 0;
        Object var20 = null;
        int var21 = 0;
        w var23 = null;
        w var24 = null;
        w stackIn_4_0 = null;
        w stackIn_4_1 = null;
        long stackIn_4_2 = 0L;
        w stackIn_4_3 = null;
        w stackIn_5_0 = null;
        w stackIn_5_1 = null;
        long stackIn_5_2 = 0L;
        w stackIn_5_3 = null;
        w stackIn_6_0 = null;
        w stackIn_6_1 = null;
        long stackIn_6_2 = 0L;
        w stackIn_6_3 = null;
        String stackIn_6_4 = null;
        int stackIn_39_0 = 0;
        int stackIn_56_0 = 0;
        qd stackIn_66_0 = null;
        Object stackIn_74_0 = null;
        qd stackIn_88_0 = null;
        Object stackIn_94_0 = null;
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
        RuntimeException stackIn_112_0 = null;
        StringBuilder stackIn_112_1 = null;
        RuntimeException stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        RuntimeException stackIn_114_0 = null;
        StringBuilder stackIn_114_1 = null;
        String stackIn_114_2 = null;
        RuntimeException stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        RuntimeException stackIn_116_0 = null;
        StringBuilder stackIn_116_1 = null;
        RuntimeException stackIn_117_0 = null;
        StringBuilder stackIn_117_1 = null;
        String stackIn_117_2 = null;
        RuntimeException stackIn_118_0 = null;
        StringBuilder stackIn_118_1 = null;
        RuntimeException stackIn_119_0 = null;
        StringBuilder stackIn_119_1 = null;
        RuntimeException stackIn_120_0 = null;
        StringBuilder stackIn_120_1 = null;
        String stackIn_120_2 = null;
        RuntimeException stackIn_121_0 = null;
        StringBuilder stackIn_121_1 = null;
        RuntimeException stackIn_122_0 = null;
        StringBuilder stackIn_122_1 = null;
        RuntimeException stackIn_123_0 = null;
        StringBuilder stackIn_123_1 = null;
        String stackIn_123_2 = null;
        RuntimeException stackIn_124_0 = null;
        StringBuilder stackIn_124_1 = null;
        RuntimeException stackIn_125_0 = null;
        StringBuilder stackIn_125_1 = null;
        RuntimeException stackIn_126_0 = null;
        StringBuilder stackIn_126_1 = null;
        String stackIn_126_2 = null;
        RuntimeException stackIn_127_0 = null;
        StringBuilder stackIn_127_1 = null;
        RuntimeException stackIn_128_0 = null;
        StringBuilder stackIn_128_1 = null;
        RuntimeException stackIn_129_0 = null;
        StringBuilder stackIn_129_1 = null;
        String stackIn_129_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        w stackOut_3_0 = null;
        w stackOut_3_1 = null;
        long stackOut_3_2 = 0L;
        w stackOut_3_3 = null;
        w stackOut_5_0 = null;
        w stackOut_5_1 = null;
        long stackOut_5_2 = 0L;
        w stackOut_5_3 = null;
        String stackOut_5_4 = null;
        w stackOut_4_0 = null;
        w stackOut_4_1 = null;
        long stackOut_4_2 = 0L;
        w stackOut_4_3 = null;
        String stackOut_4_4 = null;
        int stackOut_55_0 = 0;
        int stackOut_38_0 = 0;
        qd stackOut_65_0 = null;
        w stackOut_73_0 = null;
        qd stackOut_87_0 = null;
        w stackOut_93_0 = null;
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
        RuntimeException stackOut_111_0 = null;
        StringBuilder stackOut_111_1 = null;
        RuntimeException stackOut_113_0 = null;
        StringBuilder stackOut_113_1 = null;
        String stackOut_113_2 = null;
        RuntimeException stackOut_112_0 = null;
        StringBuilder stackOut_112_1 = null;
        String stackOut_112_2 = null;
        RuntimeException stackOut_114_0 = null;
        StringBuilder stackOut_114_1 = null;
        RuntimeException stackOut_116_0 = null;
        StringBuilder stackOut_116_1 = null;
        String stackOut_116_2 = null;
        RuntimeException stackOut_115_0 = null;
        StringBuilder stackOut_115_1 = null;
        String stackOut_115_2 = null;
        RuntimeException stackOut_117_0 = null;
        StringBuilder stackOut_117_1 = null;
        RuntimeException stackOut_119_0 = null;
        StringBuilder stackOut_119_1 = null;
        String stackOut_119_2 = null;
        RuntimeException stackOut_118_0 = null;
        StringBuilder stackOut_118_1 = null;
        String stackOut_118_2 = null;
        RuntimeException stackOut_120_0 = null;
        StringBuilder stackOut_120_1 = null;
        RuntimeException stackOut_122_0 = null;
        StringBuilder stackOut_122_1 = null;
        String stackOut_122_2 = null;
        RuntimeException stackOut_121_0 = null;
        StringBuilder stackOut_121_1 = null;
        String stackOut_121_2 = null;
        RuntimeException stackOut_123_0 = null;
        StringBuilder stackOut_123_1 = null;
        RuntimeException stackOut_125_0 = null;
        StringBuilder stackOut_125_1 = null;
        String stackOut_125_2 = null;
        RuntimeException stackOut_124_0 = null;
        StringBuilder stackOut_124_1 = null;
        String stackOut_124_2 = null;
        RuntimeException stackOut_126_0 = null;
        StringBuilder stackOut_126_1 = null;
        RuntimeException stackOut_128_0 = null;
        StringBuilder stackOut_128_1 = null;
        String stackOut_128_2 = null;
        RuntimeException stackOut_127_0 = null;
        StringBuilder stackOut_127_1 = null;
        String stackOut_127_2 = null;
        Object var17_ref = null;
        var21 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              pa.field_db = param10;
              jj.field_a = param1;
              gn.field_c = param5;
              hb.field_Qb = param8;
              pf.field_k = param9;
              hd.field_u = param0;
              rn.field_e = param6;
              da.field_a = param13;
              mg.field_Vb = param7;
              be.field_u = param11;
              ne.field_c = param2;
              b.field_P = param14;
              fj.field_a = bj.a(112, param3, "lobby", "gameprivacy");
              si.field_d = bj.a(112, param3, "lobby", "ratedgame");
              client.field_x = bj.a(112, param3, "lobby", "opentome");
              bb.field_b = bj.a(112, param3, "lobby", "allowspectators");
              ed.field_b = new String[5];
              ed.field_b[2] = om.field_g;
              ed.field_b[3] = hd.field_p;
              ed.field_b[4] = ik.field_a;
              ed.field_b[1] = ul.field_h;
              ed.field_b[0] = dk.field_b;
              gg.field_y = new w(0L, (w) null);
              gh.field_b = new w(0L, fh.field_g, cb.field_h);
              kn.field_r = new w(0L, dd.field_k, ak.field_a);
              ec.field_k = new nm(0L, new w(0L, (w) null), gf.field_g, tm.field_b);
              gg.field_y.a(gh.field_b, -16834);
              if (!pd.field_a) {
                break L1;
              } else {
                gg.field_y.a(kn.field_r, param4 + -7940);
                break L1;
              }
            }
            L2: {
              gg.field_y.a(ec.field_k, -16834);
              ec.field_k.field_Rb.a(-122, ua.field_H);
              var23 = ec.field_k.field_Rb;
              var24 = var23;
              ec.field_k.field_Rb.field_W = 1;
              var24.field_X = 1;
              fn.field_g = new w(0L, ua.field_H);
              fn.field_g.field_X = 1;
              uh.field_c = new w(0L, hd.field_q, pc.field_f.toUpperCase());
              p.field_b = new w(0L, ml.field_a, in.field_u.toUpperCase());
              li.field_h = new w(0L, bf.field_t);
              f.field_o = new w(0L, fh.field_g, li.field_c);
              d.field_a = new w(0L, bl.field_Y, ml.field_c);
              tg.field_f = new w(0L, bl.field_Y, ba.field_e);
              md.field_X = new w(0L, bl.field_Y, be.field_o);
              jc.field_h = new w(0L, bl.field_Y, gk.field_Db);
              bk.field_Rb = new w(0L, dd.field_k, bk.field_Qb);
              gf.field_c = new nm(0L, new w(0L, (w) null), gf.field_g, tm.field_b);
              o.field_a = new w(0L, d.field_g, qe.field_c.toUpperCase());
              o.field_a.field_Hb = pd.field_a;
              stackOut_3_0 = null;
              stackOut_3_1 = null;
              stackOut_3_2 = 0L;
              stackOut_3_3 = d.field_g;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              stackIn_5_3 = stackOut_3_3;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              stackIn_4_2 = stackOut_3_2;
              stackIn_4_3 = stackOut_3_3;
              if (pd.field_a) {
                stackOut_5_0 = null;
                stackOut_5_1 = null;
                stackOut_5_2 = stackIn_5_2;
                stackOut_5_3 = (w) ((Object) stackIn_5_3);
                stackOut_5_4 = p.field_c;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                stackIn_6_2 = stackOut_5_2;
                stackIn_6_3 = stackOut_5_3;
                stackIn_6_4 = stackOut_5_4;
                break L2;
              } else {
                stackOut_4_0 = null;
                stackOut_4_1 = null;
                stackOut_4_2 = stackIn_4_2;
                stackOut_4_3 = (w) ((Object) stackIn_4_3);
                stackOut_4_4 = pl.field_c;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_6_2 = stackOut_4_2;
                stackIn_6_3 = stackOut_4_3;
                stackIn_6_4 = stackOut_4_4;
                break L2;
              }
            }
            L3: {
              se.field_U = new w(stackIn_6_2, stackIn_6_3, ((String) (Object) stackIn_6_4).toUpperCase());
              wm.field_h = new w(0L, (w) null);
              wm.field_h.a(p.field_b, -16834);
              wm.field_h.a(li.field_h, -16834);
              li.field_h.a(f.field_o, -16834);
              li.field_h.a(d.field_a, -16834);
              li.field_h.a(tg.field_f, -16834);
              if (pd.field_a) {
                li.field_h.a(md.field_X, -16834);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              li.field_h.a(jc.field_h, -16834);
              li.field_h.a(bk.field_Rb, -16834);
              li.field_h.a(gf.field_c, param4 + -7940);
              if (!pd.field_a) {
                break L4;
              } else {
                wm.field_h.a(o.field_a, -16834);
                break L4;
              }
            }
            wm.field_h.a(se.field_U, -16834);
            f.field_n = new w(0L, ua.field_H);
            f.field_n.field_W = 0;
            f.field_n.field_X = 1;
            ce.field_A = new w(0L, kn.field_p, gm.field_J.toUpperCase());
            tc.field_Ob = new w(0L, ui.field_x);
            tc.field_Ob.a(f.field_n, -16834);
            tc.field_Ob.a(ce.field_A, -16834);
            cl.field_n = new w(0L, gf.field_g);
            cl.field_n.a(-128, ua.field_H);
            cl.field_n.field_W = 1;
            var16 = cl.field_n;
            var16.field_X = 1;
            in.field_o = new w(0L, (w) null);
            if (param4 == -8894) {
              L5: {
                he.field_jb = new w(0L, ua.field_H);
                he.field_jb.field_X = 1;
                kl.field_r = new w(0L, fh.field_g, cb.field_h);
                ea.field_A = new w(0L, dd.field_k, ak.field_a);
                tb.field_b = new nm(0L, new w(0L, (w) null), gf.field_g, tm.field_b);
                in.field_o.a(he.field_jb, -16834);
                in.field_o.a(kl.field_r, -16834);
                if (pd.field_a) {
                  in.field_o.a(ea.field_A, param4 ^ 25468);
                  break L5;
                } else {
                  break L5;
                }
              }
              in.field_o.a(tb.field_b, param4 ^ 25468);
              ma.field_G = new w(0L, hd.field_q, om.field_b.toUpperCase());
              fl.field_b = new w(0L, ml.field_a);
              qm.field_a = new w(0L, bf.field_t);
              li.field_d = new w(0L, i.field_e, bk.field_Nb.toUpperCase());
              um.field_c = new w[4 + param12];
              qa.field_v = new qd[param12 - -4][];
              um.field_c[0] = new w(0L, sg.field_e, qc.field_l);
              qa.field_v[0] = new qd[6];
              var17_int = 0;
              L6: while (true) {
                L7: {
                  L8: {
                    L9: {
                      L10: {
                        if ((var17_int ^ -1) <= -6) {
                          break L10;
                        } else {
                          qa.field_v[0][var17_int - -1] = new qd(0L, l.field_a, (w) null, df.field_ab, fj.field_a[var17_int], ed.field_b[var17_int]);
                          var17_int++;
                          if (var21 != 0) {
                            break L9;
                          } else {
                            if (var21 == 0) {
                              continue L6;
                            } else {
                              break L10;
                            }
                          }
                        }
                      }
                      if (2 <= b.field_P.length) {
                        um.field_c[1] = new w(0L, sg.field_e, hb.field_Pb);
                        array$3 = new qd[1 + b.field_P.length];
                        qa.field_v[1] = array$3;
                        qa.field_v[1][0] = new qd(0L, l.field_a, (w) null, df.field_ab, (ck) null, hd.field_t);
                        break L9;
                      } else {
                        break L8;
                      }
                    }
                    var17_int = 0;
                    L11: while (true) {
                      if (b.field_P.length <= var17_int) {
                        break L8;
                      } else {
                        qa.field_v[1][var17_int + 1] = new qd(0L, l.field_a, (w) null, df.field_ab, (ck) null, Integer.toString(b.field_P[var17_int]));
                        var17_int++;
                        if (var21 != 0) {
                          break L7;
                        } else {
                          if (var21 == 0) {
                            continue L11;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                  }
                  um.field_c[2] = new w(0L, sg.field_e, bc.field_G);
                  qa.field_v[2] = new qd[]{new qd(0L, l.field_a, (w) null, df.field_ab, (ck) null, hd.field_t), new qd(0L, l.field_a, (w) null, df.field_ab, bb.field_b[0], jh.field_f), new qd(0L, l.field_a, (w) null, df.field_ab, bb.field_b[1], h.field_f)};
                  break L7;
                }
                L12: {
                  L13: {
                    if (mg.field_Vb <= 1) {
                      break L13;
                    } else {
                      um.field_c[3] = new w(0L, sg.field_e, mk.field_a);
                      array$4 = new qd[mg.field_Vb + 1];
                      qa.field_v[3] = array$4;
                      qa.field_v[3][0] = new qd(0L, l.field_a, (w) null, df.field_ab, (ck) null, hd.field_t);
                      var17_int = 0;
                      L14: while (true) {
                        if (mg.field_Vb <= var17_int) {
                          break L13;
                        } else {
                          qa.field_v[3][var17_int - -1] = new qd(0L, l.field_a, (w) null, df.field_ab, (ck) null, pf.field_k[var17_int]);
                          var17_int++;
                          if (var21 != 0) {
                            break L12;
                          } else {
                            if (var21 == 0) {
                              continue L14;
                            } else {
                              break L13;
                            }
                          }
                        }
                      }
                    }
                  }
                  var17_int = 0;
                  break L12;
                }
                L15: while (true) {
                  L16: {
                    if (param12 <= var17_int) {
                      stackOut_55_0 = 0;
                      stackIn_56_0 = stackOut_55_0;
                      break L16;
                    } else {
                      um.field_c[4 + var17_int] = new w(0L, sg.field_e, pa.field_db[var17_int]);
                      array$5 = new qd[lb.a((int) da.field_a[var17_int], 255) - -1];
                      qa.field_v[4 - -var17_int] = array$5;
                      qa.field_v[var17_int + 4][0] = new qd(0L, l.field_a, (w) null, df.field_ab, (ck) null, hd.field_t);
                      stackOut_38_0 = 0;
                      stackIn_56_0 = stackOut_38_0;
                      stackIn_39_0 = stackOut_38_0;
                      if (var21 != 0) {
                        break L16;
                      } else {
                        var18 = stackIn_39_0;
                        L17: while (true) {
                          L18: {
                            L19: {
                              if ((da.field_a[var17_int] & 255) <= var18) {
                                break L19;
                              } else {
                                if (var21 != 0) {
                                  break L18;
                                } else {
                                  L20: {
                                    if (rn.field_e == null) {
                                      var19_ref = null;
                                      break L20;
                                    } else {
                                      if (null != rn.field_e[var17_int]) {
                                        var19_ref = rn.field_e[var17_int][var18];
                                        break L20;
                                      } else {
                                        var19_ref = null;
                                        break L20;
                                      }
                                    }
                                  }
                                  L21: {
                                    if (null != gn.field_c) {
                                      if (null == gn.field_c[var17_int]) {
                                        var20 = null;
                                        break L21;
                                      } else {
                                        var20 = gn.field_c[var17_int][var18];
                                        break L21;
                                      }
                                    } else {
                                      var20 = null;
                                      break L21;
                                    }
                                  }
                                  qa.field_v[var17_int + 4][var18 - -1] = new qd(0L, l.field_a, (w) null, df.field_ab, (ck) (var19_ref), (String) (var20));
                                  var18++;
                                  if (var21 == 0) {
                                    continue L17;
                                  } else {
                                    break L19;
                                  }
                                }
                              }
                            }
                            var17_int++;
                            break L18;
                          }
                          continue L15;
                        }
                      }
                    }
                  }
                  var17_int = stackIn_56_0;
                  L22: while (true) {
                    L23: {
                      L24: {
                        L25: {
                          if (var17_int >= param12 - -4) {
                            break L25;
                          } else {
                            if (var21 != 0) {
                              break L24;
                            } else {
                              L26: {
                                if (null != um.field_c[var17_int]) {
                                  um.field_c[var17_int].field_Db = 11;
                                  break L26;
                                } else {
                                  break L26;
                                }
                              }
                              L27: {
                                if (null == qa.field_v[var17_int]) {
                                  break L27;
                                } else {
                                  var18 = 0;
                                  L28: while (true) {
                                    if (var18 >= qa.field_v[var17_int].length) {
                                      break L27;
                                    } else {
                                      stackOut_65_0 = qa.field_v[var17_int][var18];
                                      stackIn_74_0 = stackOut_65_0;
                                      stackIn_66_0 = stackOut_65_0;
                                      if (var21 != 0) {
                                        break L23;
                                      } else {
                                        L29: {
                                          if (stackIn_66_0 == null) {
                                            break L29;
                                          } else {
                                            if (qa.field_v[var17_int][var18].field_Tb != null) {
                                              qa.field_v[var17_int][var18].field_Tb.field_Db = 11;
                                              break L29;
                                            } else {
                                              break L29;
                                            }
                                          }
                                        }
                                        var18++;
                                        if (var21 == 0) {
                                          continue L28;
                                        } else {
                                          break L27;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              var17_int++;
                              if (var21 == 0) {
                                continue L22;
                              } else {
                                break L25;
                              }
                            }
                          }
                        }
                        fh.field_d = new w(0L, d.field_g);
                        nn.field_a = new w(0L, d.field_g);
                        tg.field_i = new w(0L, fc.field_c);
                        tg.field_i.a(-112, ua.field_H);
                        tg.field_i.field_W = 1;
                        break L24;
                      }
                      stackOut_73_0 = tg.field_i;
                      stackIn_74_0 = stackOut_73_0;
                      break L23;
                    }
                    var17_ref = stackIn_74_0;
                    ((w) (var17_ref)).field_X = 1;
                    oh.field_d = new w(0L, (w) null);
                    oh.field_d.a(fl.field_b, -16834);
                    oh.field_d.a(qm.field_a, -16834);
                    qm.field_a.a(li.field_d, -16834);
                    var18 = 0;
                    L30: while (true) {
                      L31: {
                        L32: {
                          L33: {
                            if (var18 >= 4 + param12) {
                              break L33;
                            } else {
                              if (var21 != 0) {
                                break L31;
                              } else {
                                L34: {
                                  L35: {
                                    if ((var18 ^ -1) != -2) {
                                      break L35;
                                    } else {
                                      if (-3 >= (b.field_P.length ^ -1)) {
                                        break L35;
                                      } else {
                                        if (var21 == 0) {
                                          break L34;
                                        } else {
                                          break L35;
                                        }
                                      }
                                    }
                                  }
                                  L36: {
                                    if (var18 != 3) {
                                      break L36;
                                    } else {
                                      if (-2 > (mg.field_Vb ^ -1)) {
                                        break L36;
                                      } else {
                                        if (var21 == 0) {
                                          break L34;
                                        } else {
                                          break L36;
                                        }
                                      }
                                    }
                                  }
                                  qm.field_a.a(um.field_c[var18], -16834);
                                  var19 = 0;
                                  L37: while (true) {
                                    if (var19 >= qa.field_v[var18].length) {
                                      break L34;
                                    } else {
                                      stackOut_87_0 = qa.field_v[var18][var19];
                                      stackIn_94_0 = stackOut_87_0;
                                      stackIn_88_0 = stackOut_87_0;
                                      if (var21 != 0) {
                                        break L32;
                                      } else {
                                        L38: {
                                          if (stackIn_88_0 != null) {
                                            qm.field_a.a(qa.field_v[var18][var19], -16834);
                                            break L38;
                                          } else {
                                            break L38;
                                          }
                                        }
                                        var19++;
                                        if (var21 == 0) {
                                          continue L37;
                                        } else {
                                          break L34;
                                        }
                                      }
                                    }
                                  }
                                }
                                var18++;
                                if (var21 == 0) {
                                  continue L30;
                                } else {
                                  break L33;
                                }
                              }
                            }
                          }
                          oh.field_d.a(fh.field_d, -16834);
                          oh.field_d.a(nn.field_a, param4 + -7940);
                          oh.field_d.a(tg.field_i, -16834);
                          ie.field_a = new w(0L, tg.field_h, ea.field_u.toUpperCase());
                          stackOut_93_0 = new w(0L, kn.field_p, kb.field_d.toUpperCase());
                          stackIn_94_0 = stackOut_93_0;
                          break L32;
                        }
                        qc.field_q = (w) ((Object) stackIn_94_0);
                        break L31;
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L39: {
            var15 = decompiledCaughtException;
            stackOut_96_0 = (RuntimeException) (var15);
            stackOut_96_1 = new StringBuilder().append("mf.D(").append(param0).append(',');
            stackIn_98_0 = stackOut_96_0;
            stackIn_98_1 = stackOut_96_1;
            stackIn_97_0 = stackOut_96_0;
            stackIn_97_1 = stackOut_96_1;
            if (param1 == null) {
              stackOut_98_0 = (RuntimeException) ((Object) stackIn_98_0);
              stackOut_98_1 = (StringBuilder) ((Object) stackIn_98_1);
              stackOut_98_2 = "null";
              stackIn_99_0 = stackOut_98_0;
              stackIn_99_1 = stackOut_98_1;
              stackIn_99_2 = stackOut_98_2;
              break L39;
            } else {
              stackOut_97_0 = (RuntimeException) ((Object) stackIn_97_0);
              stackOut_97_1 = (StringBuilder) ((Object) stackIn_97_1);
              stackOut_97_2 = "{...}";
              stackIn_99_0 = stackOut_97_0;
              stackIn_99_1 = stackOut_97_1;
              stackIn_99_2 = stackOut_97_2;
              break L39;
            }
          }
          L40: {
            stackOut_99_0 = (RuntimeException) ((Object) stackIn_99_0);
            stackOut_99_1 = ((StringBuilder) (Object) stackIn_99_1).append(stackIn_99_2).append(',');
            stackIn_101_0 = stackOut_99_0;
            stackIn_101_1 = stackOut_99_1;
            stackIn_100_0 = stackOut_99_0;
            stackIn_100_1 = stackOut_99_1;
            if (param2 == null) {
              stackOut_101_0 = (RuntimeException) ((Object) stackIn_101_0);
              stackOut_101_1 = (StringBuilder) ((Object) stackIn_101_1);
              stackOut_101_2 = "null";
              stackIn_102_0 = stackOut_101_0;
              stackIn_102_1 = stackOut_101_1;
              stackIn_102_2 = stackOut_101_2;
              break L40;
            } else {
              stackOut_100_0 = (RuntimeException) ((Object) stackIn_100_0);
              stackOut_100_1 = (StringBuilder) ((Object) stackIn_100_1);
              stackOut_100_2 = "{...}";
              stackIn_102_0 = stackOut_100_0;
              stackIn_102_1 = stackOut_100_1;
              stackIn_102_2 = stackOut_100_2;
              break L40;
            }
          }
          L41: {
            stackOut_102_0 = (RuntimeException) ((Object) stackIn_102_0);
            stackOut_102_1 = ((StringBuilder) (Object) stackIn_102_1).append(stackIn_102_2).append(',');
            stackIn_104_0 = stackOut_102_0;
            stackIn_104_1 = stackOut_102_1;
            stackIn_103_0 = stackOut_102_0;
            stackIn_103_1 = stackOut_102_1;
            if (param3 == null) {
              stackOut_104_0 = (RuntimeException) ((Object) stackIn_104_0);
              stackOut_104_1 = (StringBuilder) ((Object) stackIn_104_1);
              stackOut_104_2 = "null";
              stackIn_105_0 = stackOut_104_0;
              stackIn_105_1 = stackOut_104_1;
              stackIn_105_2 = stackOut_104_2;
              break L41;
            } else {
              stackOut_103_0 = (RuntimeException) ((Object) stackIn_103_0);
              stackOut_103_1 = (StringBuilder) ((Object) stackIn_103_1);
              stackOut_103_2 = "{...}";
              stackIn_105_0 = stackOut_103_0;
              stackIn_105_1 = stackOut_103_1;
              stackIn_105_2 = stackOut_103_2;
              break L41;
            }
          }
          L42: {
            stackOut_105_0 = (RuntimeException) ((Object) stackIn_105_0);
            stackOut_105_1 = ((StringBuilder) (Object) stackIn_105_1).append(stackIn_105_2).append(',').append(param4).append(',');
            stackIn_107_0 = stackOut_105_0;
            stackIn_107_1 = stackOut_105_1;
            stackIn_106_0 = stackOut_105_0;
            stackIn_106_1 = stackOut_105_1;
            if (param5 == null) {
              stackOut_107_0 = (RuntimeException) ((Object) stackIn_107_0);
              stackOut_107_1 = (StringBuilder) ((Object) stackIn_107_1);
              stackOut_107_2 = "null";
              stackIn_108_0 = stackOut_107_0;
              stackIn_108_1 = stackOut_107_1;
              stackIn_108_2 = stackOut_107_2;
              break L42;
            } else {
              stackOut_106_0 = (RuntimeException) ((Object) stackIn_106_0);
              stackOut_106_1 = (StringBuilder) ((Object) stackIn_106_1);
              stackOut_106_2 = "{...}";
              stackIn_108_0 = stackOut_106_0;
              stackIn_108_1 = stackOut_106_1;
              stackIn_108_2 = stackOut_106_2;
              break L42;
            }
          }
          L43: {
            stackOut_108_0 = (RuntimeException) ((Object) stackIn_108_0);
            stackOut_108_1 = ((StringBuilder) (Object) stackIn_108_1).append(stackIn_108_2).append(',');
            stackIn_110_0 = stackOut_108_0;
            stackIn_110_1 = stackOut_108_1;
            stackIn_109_0 = stackOut_108_0;
            stackIn_109_1 = stackOut_108_1;
            if (param6 == null) {
              stackOut_110_0 = (RuntimeException) ((Object) stackIn_110_0);
              stackOut_110_1 = (StringBuilder) ((Object) stackIn_110_1);
              stackOut_110_2 = "null";
              stackIn_111_0 = stackOut_110_0;
              stackIn_111_1 = stackOut_110_1;
              stackIn_111_2 = stackOut_110_2;
              break L43;
            } else {
              stackOut_109_0 = (RuntimeException) ((Object) stackIn_109_0);
              stackOut_109_1 = (StringBuilder) ((Object) stackIn_109_1);
              stackOut_109_2 = "{...}";
              stackIn_111_0 = stackOut_109_0;
              stackIn_111_1 = stackOut_109_1;
              stackIn_111_2 = stackOut_109_2;
              break L43;
            }
          }
          L44: {
            stackOut_111_0 = (RuntimeException) ((Object) stackIn_111_0);
            stackOut_111_1 = ((StringBuilder) (Object) stackIn_111_1).append(stackIn_111_2).append(',').append(param7).append(',');
            stackIn_113_0 = stackOut_111_0;
            stackIn_113_1 = stackOut_111_1;
            stackIn_112_0 = stackOut_111_0;
            stackIn_112_1 = stackOut_111_1;
            if (param8 == null) {
              stackOut_113_0 = (RuntimeException) ((Object) stackIn_113_0);
              stackOut_113_1 = (StringBuilder) ((Object) stackIn_113_1);
              stackOut_113_2 = "null";
              stackIn_114_0 = stackOut_113_0;
              stackIn_114_1 = stackOut_113_1;
              stackIn_114_2 = stackOut_113_2;
              break L44;
            } else {
              stackOut_112_0 = (RuntimeException) ((Object) stackIn_112_0);
              stackOut_112_1 = (StringBuilder) ((Object) stackIn_112_1);
              stackOut_112_2 = "{...}";
              stackIn_114_0 = stackOut_112_0;
              stackIn_114_1 = stackOut_112_1;
              stackIn_114_2 = stackOut_112_2;
              break L44;
            }
          }
          L45: {
            stackOut_114_0 = (RuntimeException) ((Object) stackIn_114_0);
            stackOut_114_1 = ((StringBuilder) (Object) stackIn_114_1).append(stackIn_114_2).append(',');
            stackIn_116_0 = stackOut_114_0;
            stackIn_116_1 = stackOut_114_1;
            stackIn_115_0 = stackOut_114_0;
            stackIn_115_1 = stackOut_114_1;
            if (param9 == null) {
              stackOut_116_0 = (RuntimeException) ((Object) stackIn_116_0);
              stackOut_116_1 = (StringBuilder) ((Object) stackIn_116_1);
              stackOut_116_2 = "null";
              stackIn_117_0 = stackOut_116_0;
              stackIn_117_1 = stackOut_116_1;
              stackIn_117_2 = stackOut_116_2;
              break L45;
            } else {
              stackOut_115_0 = (RuntimeException) ((Object) stackIn_115_0);
              stackOut_115_1 = (StringBuilder) ((Object) stackIn_115_1);
              stackOut_115_2 = "{...}";
              stackIn_117_0 = stackOut_115_0;
              stackIn_117_1 = stackOut_115_1;
              stackIn_117_2 = stackOut_115_2;
              break L45;
            }
          }
          L46: {
            stackOut_117_0 = (RuntimeException) ((Object) stackIn_117_0);
            stackOut_117_1 = ((StringBuilder) (Object) stackIn_117_1).append(stackIn_117_2).append(',');
            stackIn_119_0 = stackOut_117_0;
            stackIn_119_1 = stackOut_117_1;
            stackIn_118_0 = stackOut_117_0;
            stackIn_118_1 = stackOut_117_1;
            if (param10 == null) {
              stackOut_119_0 = (RuntimeException) ((Object) stackIn_119_0);
              stackOut_119_1 = (StringBuilder) ((Object) stackIn_119_1);
              stackOut_119_2 = "null";
              stackIn_120_0 = stackOut_119_0;
              stackIn_120_1 = stackOut_119_1;
              stackIn_120_2 = stackOut_119_2;
              break L46;
            } else {
              stackOut_118_0 = (RuntimeException) ((Object) stackIn_118_0);
              stackOut_118_1 = (StringBuilder) ((Object) stackIn_118_1);
              stackOut_118_2 = "{...}";
              stackIn_120_0 = stackOut_118_0;
              stackIn_120_1 = stackOut_118_1;
              stackIn_120_2 = stackOut_118_2;
              break L46;
            }
          }
          L47: {
            stackOut_120_0 = (RuntimeException) ((Object) stackIn_120_0);
            stackOut_120_1 = ((StringBuilder) (Object) stackIn_120_1).append(stackIn_120_2).append(',');
            stackIn_122_0 = stackOut_120_0;
            stackIn_122_1 = stackOut_120_1;
            stackIn_121_0 = stackOut_120_0;
            stackIn_121_1 = stackOut_120_1;
            if (param11 == null) {
              stackOut_122_0 = (RuntimeException) ((Object) stackIn_122_0);
              stackOut_122_1 = (StringBuilder) ((Object) stackIn_122_1);
              stackOut_122_2 = "null";
              stackIn_123_0 = stackOut_122_0;
              stackIn_123_1 = stackOut_122_1;
              stackIn_123_2 = stackOut_122_2;
              break L47;
            } else {
              stackOut_121_0 = (RuntimeException) ((Object) stackIn_121_0);
              stackOut_121_1 = (StringBuilder) ((Object) stackIn_121_1);
              stackOut_121_2 = "{...}";
              stackIn_123_0 = stackOut_121_0;
              stackIn_123_1 = stackOut_121_1;
              stackIn_123_2 = stackOut_121_2;
              break L47;
            }
          }
          L48: {
            stackOut_123_0 = (RuntimeException) ((Object) stackIn_123_0);
            stackOut_123_1 = ((StringBuilder) (Object) stackIn_123_1).append(stackIn_123_2).append(',').append(param12).append(',');
            stackIn_125_0 = stackOut_123_0;
            stackIn_125_1 = stackOut_123_1;
            stackIn_124_0 = stackOut_123_0;
            stackIn_124_1 = stackOut_123_1;
            if (param13 == null) {
              stackOut_125_0 = (RuntimeException) ((Object) stackIn_125_0);
              stackOut_125_1 = (StringBuilder) ((Object) stackIn_125_1);
              stackOut_125_2 = "null";
              stackIn_126_0 = stackOut_125_0;
              stackIn_126_1 = stackOut_125_1;
              stackIn_126_2 = stackOut_125_2;
              break L48;
            } else {
              stackOut_124_0 = (RuntimeException) ((Object) stackIn_124_0);
              stackOut_124_1 = (StringBuilder) ((Object) stackIn_124_1);
              stackOut_124_2 = "{...}";
              stackIn_126_0 = stackOut_124_0;
              stackIn_126_1 = stackOut_124_1;
              stackIn_126_2 = stackOut_124_2;
              break L48;
            }
          }
          L49: {
            stackOut_126_0 = (RuntimeException) ((Object) stackIn_126_0);
            stackOut_126_1 = ((StringBuilder) (Object) stackIn_126_1).append(stackIn_126_2).append(',');
            stackIn_128_0 = stackOut_126_0;
            stackIn_128_1 = stackOut_126_1;
            stackIn_127_0 = stackOut_126_0;
            stackIn_127_1 = stackOut_126_1;
            if (param14 == null) {
              stackOut_128_0 = (RuntimeException) ((Object) stackIn_128_0);
              stackOut_128_1 = (StringBuilder) ((Object) stackIn_128_1);
              stackOut_128_2 = "null";
              stackIn_129_0 = stackOut_128_0;
              stackIn_129_1 = stackOut_128_1;
              stackIn_129_2 = stackOut_128_2;
              break L49;
            } else {
              stackOut_127_0 = (RuntimeException) ((Object) stackIn_127_0);
              stackOut_127_1 = (StringBuilder) ((Object) stackIn_127_1);
              stackOut_127_2 = "{...}";
              stackIn_129_0 = stackOut_127_0;
              stackIn_129_1 = stackOut_127_1;
              stackIn_129_2 = stackOut_127_2;
              break L49;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_129_0), stackIn_129_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void g(int param0) {
        int var2 = 250;
        this.field_T.b(25, 140, -var2 + this.field_t >> 876882657, this.field_y - 5 >> -262495615, -16555);
        this.field_U.b(30, 100, 10 + (140 + (-var2 + this.field_t >> -1122840863)), 2 + (20 + (this.field_y - param0) >> -5749503), param0 ^ -16565);
    }

    final static void a(byte param0, int param1) {
        if (param0 < 80) {
            field_S = (String) null;
        }
        uf var2 = we.field_b;
        var2.f(param1, -4);
        var2.a(true, 2);
        var2.a(true, 4);
        var2.a(true, am.b(112));
    }

    public static void i(int param0) {
        field_O = null;
        field_S = null;
        field_V = null;
        field_N = null;
        field_P = null;
        if (param0 != -17690) {
            field_O = (ck) null;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, -106, param2, param3);
        bj.field_f.a(vf.field_e, 4 + param0 + this.field_u, 4 + bj.field_f.field_R + param3 - -this.field_D, 16777215, -1);
        if (param1 >= -103) {
            ek var6 = (ek) null;
            this.a((byte) -51, -52, (ek) null, -94, 59);
        }
    }

    mf(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, (gl) null);
        this.field_T = new pn(new di(10000536), gf.field_i, 0, 0, 140, 25);
        this.field_T.a((byte) 79, new qf());
        this.field_U = new ek(fa.field_o, (kg) (this));
        this.field_K = new ce[]{(ce) ((Object) this.field_T), (ce) ((Object) this.field_U)};
        this.field_U.field_p = (gl) ((Object) new fk());
        this.f(119);
    }

    static {
        field_V = "Add name";
        field_S = "Please select options in the following rows:  ";
        field_O = new ck(36, 36);
        field_P = "Achievements";
    }
}
