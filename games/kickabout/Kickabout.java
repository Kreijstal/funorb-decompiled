/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class Kickabout extends tu {
    private boolean field_L;
    static sj field_J;
    static String field_I;
    static hd field_H;
    static String field_F;
    public static int field_G;

    public final void a(int param0, boolean param1) {
        boolean stackIn_3_1 = false;
        boolean stackIn_17_0 = false;
        js stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        boolean stackIn_31_2 = false;
        boolean stackIn_59_0 = false;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        pt var8;
        pt var9;
        boolean stackIn_59_0Lifetime1;
        boolean stackIn_59_0Lifetime2;
        var7 = field_G;
        stackIn_3_1 = (param1);
        boolean decompiledFrameRemainder0 = true;
        this.field_L = stackIn_3_1;
        gi.b(17702);
        if (pf.field_c &&
          this.field_L && ((null != e.field_m ||
          vb.field_k) &&
          (ra.field_G != null &&
          um.field_e == ra.field_G ||
          cq.field_h == um.field_e &&
          null == ra.field_G)) && um.field_e.f((byte) 29)) {
          stackIn_17_0 = true;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_17_0 = false;
        }
        kw.b(stackIn_17_0, (byte) -116);
        re.b(param0 ^ -105);
        ((eh) (ma.field_t)).e(0);
        if (um.field_e == null &&
          !wh.field_q &&
          !od.field_n ||
          null != um.field_e &&
          ja.field_O) {
          io.a(2);
        }
        if (param0 != -25) {
          this.c((byte) -89);
        }
        stackIn_30_0 = cq.field_h;
        stackIn_30_1 = -96;
        stackIn_31_2 = (this.field_L) && (null == ra.field_G);
        ((js) (Object) stackIn_30_0).a((byte) stackIn_30_1, stackIn_31_2);
        if (ra.field_G == null) {
          if (um.field_e != null &&
            cq.field_h != um.field_e) {
            um.field_e.a((byte) 119, false);
          } else {
            if (null != sr.field_l &&
              sr.field_l != cq.field_h) {
              sr.field_l.a((byte) -116, false);
            }
          }
        } else {
          var3 = (ce.field_I << 8) / 24;
          cq.field_h.a(var3, false, -53, ra.field_G);
          ra.field_G.a(var3, true, -100, cq.field_h);
          ra.field_G.a((byte) -51, false);
          if (!ka.field_b) {
            ce.field_I = ce.field_I + 1;
          }
          var4 = -ce.field_I + 24;
          var5 = (var4 * var4 << 8) / 576;
          var6 = -var5 + 256;
          wr.field_f = var5 * po.a(cq.field_h, -4) + po.a(ra.field_G, -4) * var6 >> 8;
          if (ce.field_I == 24) {
            cv.a((byte) 105);
          }
        }
        dh.b(true);
        if (this.field_L) {
          var9 = (pt) (tu.field_E.field_g.g(24009));
          while (true) {
            if (var9 != null) {
              var9.c((byte) -109);
              stackIn_59_0 = gi.a(param0 ^ -149, var9);
              if (stackIn_59_0) {
                gu.a((byte) -25, var9, true);
              }
              var9 = (pt) (tu.field_E.field_g.c(33));
              continue;
            }
            break;
          }
          var8 = (pt) (vd.field_a.g(param0 + 24034));
          while (var8 != null) {
            var8.c((byte) -109);
            stackIn_59_0Lifetime1 = gi.a(140, var8);
            if (stackIn_59_0Lifetime1) {
              gu.a((byte) -25, var8, false);
            }
            var8 = (pt) (vd.field_a.c(33));
          }
          stackIn_59_0Lifetime2 = tu.field_E.field_m;
          if (stackIn_59_0Lifetime2) {
            gw.c(0);
            tu.field_E.field_m = false;
          }
          this.u(param0 ^ 23294);
        }
        if (la.a(100) &&
          ws.field_f) {
          ql.a(31663);
          ws.field_f = false;
        }
    }

    private final void u(int param0) {
        if (param0 != -23271) {
          return;
        }
        if (lf.field_b == null ||
          "" == lf.field_b) {
          return;
        }
        if (ak.a(cq.field_h, param0 + 23275) == 0) {
          return;
        }
        ot var2 = jm.field_g == null ? (ot) (sf.field_C) : jm.field_g;
        int var3 = -var2.field_o + 640 >> 1;
        if (el.field_A >= var3 && var2.field_o + var3 >= el.field_A && 10 <= n.field_m &&
          !(n.field_m > (10 + var2.field_v))) {
          qd.$cfr$intArgs$a$b6210757cdab(-67, lf.field_b);
        }
    }

    final void a(int param0, byte param1) {
        int var3;
        int var4;
        var4 = field_G;
        kp.a(4, -120);
        mf.a(7, (byte) -97);
        if (cq.field_h instanceof sc) {
          jm.a(0, false, -2);
        }
        var3 = -37 % ((-39 - param1) / 32);
        if (param0 == 1) {
          an.field_d = true;
          ec.field_e = true;
        } else {
          if (od.field_n) {
            wi.field_B = true;
            al.field_Db = true;
            k.field_k = true;
            if (null != um.field_e) {
              if (!um.field_e.e(-2)) {
                ka.a(2, uc.field_B);
                ng.a(10, 113);
              } else {
                ng.a(0, 104);
              }
              jm.a(18, false, -2);
            } else {
              if (sr.field_l == null) {
                jm.a(0, false, -2);
              } else {
                ka.a(2, uc.field_B);
                ng.a(10, 112);
                jm.a(18, false, -2);
              }
            }
            od.field_n = false;
            vr.b(1);
          }
          ec.field_e = false;
          an.field_d = false;
        }
    }

    public static void o(byte param0) {
        field_H = null;
        field_I = null;
        field_F = null;
        field_J = null;
        if (param0 >= -35) {
          Kickabout.o((byte) -40);
        }
    }

    private final void w(int param0) {
        int var3;
        int var4;
        int var5;
        int var6;
        ot var7;
        Object stackIn_5_0 = null;
        if (param0 < 95) {
          return;
        }
        if (null != jm.field_g) {
          stackIn_5_0 = jm.field_g;
        } else {
          stackIn_5_0 = sf.field_C;
        }
        var7 = (ot) (stackIn_5_0);
        var3 = 640 - var7.field_o >> 1;
        var4 = ak.a(cq.field_h, 4);
        if (ra.field_G != null) {
          var5 = ak.a(ra.field_G, 4);
          if (var4 > var5) {
            var6 = Math.min(256, (ce.field_I << 9) / 24);
            var4 = var4 + ((-var4 + var5) * var6 >> 8);
          } else {
            if (var5 > var4) {
              var6 = Math.max(0, -256 + 2 * ((ce.field_I << 8) / 24));
              var4 = var4 + ((-var4 + var5) * var6 >> 8);
            }
          }
        }
        if (256 == var4) {
          var7.c(var3, 10);
        }
        if (0 != var4) {
          var7.b(var3, 10, var4);
        }
    }

    public final boolean a(int param0, int param1, char param2) {
        int var8 = 0;
        int var7 = 0;
        int fieldTemp$0 = 0;
        boolean stackIn_38_0 = false;
        boolean stackIn_44_0 = false;
        boolean stackIn_49_0 = false;
        boolean stackIn_55_0 = false;
        boolean stackIn_60_0 = false;
        boolean stackIn_75_0 = false;
        boolean stackIn_81_0 = false;
        boolean stackIn_86_0 = false;
        boolean stackIn_92_0 = false;
        boolean stackIn_97_0 = false;
        boolean stackIn_109_0 = false;
        boolean stackIn_115_0 = false;
        boolean stackIn_120_0 = false;
        boolean stackIn_126_0 = false;
        boolean stackIn_131_0 = false;
        boolean stackIn_140_0 = false;
        int stackIn_146_0 = 0;
        boolean stackIn_151_0 = false;
        boolean stackIn_156_0 = false;
        boolean stackIn_163_0 = false;
        boolean stackIn_168_0 = false;
        boolean stackIn_174_0 = false;
        boolean stackIn_183_0 = false;
        boolean stackIn_192_0 = false;
        boolean stackIn_240_0 = false;
        boolean stackOut_139_0;
        int var4;
        int var5;
        int var6_int;
        js var6;
        String[] var7_ref_String__;
        int var9;
        String[] var10;
        String var11;
        hn var12;
        int var6_intLifetime1;
        int stackIn_146_0Lifetime1;
        int var6_intLifetime2;
        int var6_intLifetime3;
        var9 = field_G;
        var4 = ne.field_G[82] ? 1 : 0;
        var5 = ne.field_G[86] ? 1 : 0;
        if (ka.field_b &&
          83 == param1) {
          ce.field_I = ce.field_I + 1;
          return true;
        }
        if (param1 == 103 &&
          tb.field_v == 1) {
          tb.field_v = 0;
        }
        if (102 == param1 &&
          tb.field_v == 0) {
          tb.field_v = 1;
        }
        if (fm.a(false)) {
          boolean decompiledFrameRemainder2 = true;
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder3 = true;
          boolean decompiledFrameRemainder0 = true;
          if (var4 != 0 &&
            var5 != 0) {
            if ((param1 != 51) &&
              (decompiledFrameRemainder0 = (param2 != 96))) {
              gd.field_a = false;
              return true;
            }
            if (decompiledFrameRemainder0) {
              var11 = "The quick brown fox jumped over the lazy rabbit. Also this sentence is getting quite long with some long words that might not fit at end of a sentence/line but we shall see. Oooh double-barrel-ness, see how it deals with that.";
              var10 = og.a(var11, 100, (byte) -69);
              var7_ref_String__ = var10;
              if (var7_ref_String__ == null) {
                return true;
              }
              for (var8 = 0; var10.length > var8; var8++) {
                System.out.println(var10[var8]);
              }
              return true;
            }
          }
          if (decompiledFrameRemainder0) {
            if (param2 == 96) {
              r.field_d = new kd(qo.d((byte) 26), pb.field_C, oo.field_c);
              oa.a(false, r.field_d);
              return r.field_d.a(11516, param1, param2);
            }
            if (param1 == 89) {
              System.gc();
              return true;
            }
            decompiledFrameRemainder2 = (var4 != 0);
            if ((decompiledFrameRemainder2) &&
              (var5 != 0)) {
              if (param1 == 1) {
                nm.a(rm.field_C, param0 - 11592, false, ih.field_c);
                gs.a(0);
                return true;
              }
              if (2 == param1) {
                nm.a(rm.field_C, -76, true, ih.field_c);
                gs.a(0);
                return true;
              }
              if (16 == param1) {
                stackIn_75_0 = !(gd.field_a);
                gd.field_a = stackIn_75_0;
                return true;
              }
              if (param1 == 17) {
                stackIn_81_0 = !(hr.field_k);
                hr.field_k = stackIn_81_0;
                return true;
              }
              if (param1 == 18) {
                stackIn_86_0 = !(wl.field_o);
                wl.field_o = stackIn_86_0;
                return true;
              }
              if (param1 == 19) {
                stackIn_92_0 = !(th.field_d);
                th.field_d = stackIn_92_0;
                return true;
              }
              if (param1 == 20) {
                stackIn_97_0 = !(wl.field_g);
                wl.field_g = stackIn_97_0;
                return true;
              }
              decompiledFrameRemainder1 = (param1 == 21);
              if (decompiledFrameRemainder1) {
                for (var6_int = 0; tu.field_E.field_J.length > var6_int; var6_int++) {
                  tu.field_E.field_J[var6_int] = true;
                }
                decompiledFrameRemainder3 = false;
              }
            }
          }
          if ((decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1)) {
            if (16 == param1) {
              stackIn_38_0 = !(gd.field_a);
              gd.field_a = stackIn_38_0;
              return true;
            }
            if (param1 == 17) {
              stackIn_44_0 = !(hr.field_k);
              hr.field_k = stackIn_44_0;
              return true;
            }
            if (param1 == 18) {
              stackIn_49_0 = !(wl.field_o);
              wl.field_o = stackIn_49_0;
              return true;
            }
            if (param1 == 19) {
              stackIn_55_0 = !(th.field_d);
              th.field_d = stackIn_55_0;
              return true;
            }
            if (param1 == 20) {
              stackIn_60_0 = !(wl.field_g);
              wl.field_g = stackIn_60_0;
              return true;
            }
            decompiledFrameRemainder1 = (param1 == 21);
            if (decompiledFrameRemainder1) {
              for (var6_intLifetime3 = 0; tu.field_E.field_J.length > var6_intLifetime3; var6_intLifetime3++) {
                tu.field_E.field_J[var6_intLifetime3] = true;
              }
            }
          }
          if ((decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1) &&
            (!la.a(100))) {
            var6_intLifetime2 = 0;
            for (var7 = 0; var7 < tu.field_E.field_J.length; var7++) {
              stackOut_139_0 = tu.field_E.field_J[var7];
              stackIn_146_0 = stackOut_139_0 ? 1 : 0;
              stackIn_140_0 = stackOut_139_0;
              if (stackIn_140_0) {
                var6_intLifetime2 = var6_intLifetime2 | 1 << var7;
              }
            }
            or.field_d.b(69, (byte) -54);
            or.field_d.b(-88, var6_intLifetime2);
          }
          if (decompiledFrameRemainder2) {
            stackIn_146_0Lifetime1 = -23;
            if (stackIn_146_0Lifetime1 == ~param1) {
              stackIn_151_0 = !(gk.field_e);
              gk.field_e = stackIn_151_0;
              return true;
            }
            if (param1 == 23) {
              stackIn_156_0 = !(wp.field_f);
              wp.field_f = stackIn_156_0;
              if (null == um.field_e) {
                return true;
              }
              um.field_e.a(-109);
              return true;
            }
            if (param1 == 24) {
              stackIn_163_0 = !(pq.field_K);
              pq.field_K = stackIn_163_0;
              return true;
            }
            if (param1 == 25) {
              stackIn_168_0 = !(ka.field_b);
              ka.field_b = stackIn_168_0;
              return true;
            }
            if (26 == param1) {
              stackIn_174_0 = !(gs.field_g);
              gs.field_g = stackIn_174_0;
              return true;
            }
            if (27 == param1) {
              fieldTemp$0 = fa.field_j + 1;
              fa.field_j = fa.field_j + 1;
              fa.field_j = fieldTemp$0 & 3;
              return true;
            }
            if (85 == param1) {
              stackIn_183_0 = !(pb.field_B);
              pb.field_B = stackIn_183_0;
              return true;
            }
            if (35 == param1) {
              lr.b((byte) -116);
            }
            if (param1 == 39) {
              stackIn_192_0 = !(pc.field_e);
              pc.field_e = stackIn_192_0;
              return true;
            }
            if (param1 == 40 &&
              !la.a(param0 ^ 11416)) {
              or.field_d.b(85, (byte) 112);
              return true;
            }
            if (param1 == 41 &&
              !la.a(100)) {
              or.field_d.b(80, (byte) 114);
              return true;
            }
            if (param1 == 56 &&
              !la.a(100)) {
              or.field_d.b(81, (byte) 107);
              or.field_d.field_n = or.field_d.field_n + 2;
              var6_intLifetime1 = or.field_d.field_n;
              or.field_d.a(113, 1);
              var12 = new hn(3, new int[]{0, 0});
              var12.a(1, or.field_d);
              or.field_d.d(or.field_d.field_n - var6_intLifetime1, 62);
              return true;
            }
            if (param1 == 1) {
              nm.a(0, param0 - 11592, vi.field_n, ih.field_c);
              gs.a(0);
              return true;
            }
            if (param1 == 2) {
              nm.a(1, -76, vi.field_n, ih.field_c);
              gs.a(param0 - 11516);
              return true;
            }
            if (param1 == 3) {
              nm.a(2, -76, vi.field_n, ih.field_c);
              gs.a(0);
              return true;
            }
            if (param1 == 4) {
              nm.a(3, param0 ^ -11448, vi.field_n, ih.field_c);
              gs.a(0);
              return true;
            }
          }
          if (var5 != 0) {
            if (param1 == 1) {
              nm.a(rm.field_C, -76, vi.field_n, 0);
              gs.a(param0 ^ 11516);
              return true;
            }
            if (param1 == 2) {
              nm.a(rm.field_C, -76, vi.field_n, 1);
              gs.a(0);
              return true;
            }
            if (param1 == 3) {
              nm.a(rm.field_C, param0 ^ -11448, vi.field_n, 2);
              gs.a(0);
              return true;
            }
          }
          if (87 == param1) {
            pq.field_J = (pq.field_J + 1) % 10;
            return true;
          }
          if (param1 == 88) {
            pq.field_J = (9 + pq.field_J) % 10;
            return true;
          }
        }
        var6 = cq.field_h;
        if (param0 != 11516) {
          return true;
        }
        if (null != ra.field_G) {
          var6 = ra.field_G;
        }
        if (var6 == null) {
          stackIn_240_0 = false;
        } else {
          stackIn_240_0 = var6.a(param1, -17, param2);
        }
        return stackIn_240_0;
    }

    private final void v(int param0) {
        on.a(0, 300, 640, 87, 0, 190);
        int var2 = (int)(250.0f * ga.field_R / 100.0f);
        int var3 = var2 + 196;
        un.field_d.d(vo.$cfr$intArgs$a$53ce4ab4c593(-18, mc.field_e, new String[]{h.field_b[ih.field_c][rm.field_C].toUpperCase()}), 320, 332, 16777215, 0);
        on.f(193, 348, 254, 19, 8, 268435455);
        if (param0 != 81) {
          return;
        }
        if (var2 <= 16) {
          pt.a((var2 >> 1) + 195, -22914, 0, 480, 0);
          on.i(195, 350, 250, 15, 6, 268435455);
          ta.e(117);
          pt.a(640, -22914, (var2 >> 1) + 195, 480, 0);
          on.i(-250 + (var2 + 195), 350, 250, 15, 6, 268435455);
          ta.e(122);
        } else {
          on.i(195, 350, var2, 15, 6, 268435455);
        }
        pt.a(640, -22914, var3, 480, 0);
        q.field_d.d(mf.field_Db, 320, 362, 16777215, -1);
        ta.e(126);
        pt.a(var3, -22914, 0, 480, 0);
        q.field_d.d(mf.field_Db, 320, 362, 65793, -1);
        ta.e(param0 ^ 39);
    }

    public Kickabout() {
        CharSequence var2 = (CharSequence) ((Object) gw.field_b);
        tu.field_E = new gr(jc.a(var2, false));
        nm.field_g = this;
    }

    final static void t(int param0) {
        int var3_int = 0;
        int var8 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int stackIn_11_0 = 0;
        int[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_22_2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        ot var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        ot var11 = null;
        int stackIn_11_0Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var9 = field_G;
        try {
          var11 = nn.field_B;
          if (param0 != -826875391) {
            Kickabout.o((byte) -117);
          }
          var2 = 0;
          for (var3_int = 0; var3_int < var11.field_v; var3_int++) {
            var4 = 70 * var3_int / var11.field_v;
            for (var5 = 0; var11.field_o > var5; var5++) {
              var11.field_y[var2] = qj.b(var11.field_y[var2], -16777216);
              var11.field_y[var2] = hf.a(var11.field_y[var2], hf.a(hf.a(var4 << 16, var4 << 8), var4));
              var2++;
            }
          }
          var3 = nn.field_B;
          vq.field_d = new ut(((ut) ((Object) var3)).field_o, ((ut) ((Object) var3)).field_v);
          var10 = 0;
          var4Lifetime1 = var10;
          var5Lifetime1 = 0;
          while (true) {
            stackIn_11_0 = ~((ut) ((Object) var3)).field_v;
            if (stackIn_11_0 >= ~var5Lifetime1) {
              po.field_h = new ut(((ut) ((Object) var3)).field_o, ((ut) ((Object) var3)).field_v);
              return;
            }
            var6 = 0;
            var7 = 0;
            for (var8 = 0; var8 < ((ut) ((Object) var3)).field_o; var8++) {
              stackIn_11_0Lifetime1 = var6;
              if (stackIn_11_0Lifetime1 == 0 &&
                (((ut) ((Object) var3)).field_y[var10] & -16777216) != 0) {
                incrementValue$0 = var7;
                var7++;
                if (5 < incrementValue$0) {
                  var6 = 1;
                }
              }
              incrementValue$1 = var10;
              var10++;
              stackIn_21_0 = vq.field_d.field_y;
              stackIn_21_1 = incrementValue$1;
              if (var6 != 0) {
                stackIn_22_2 = -1;
              } else {
                stackIn_22_2 = 0;
              }
              stackIn_21_0[stackIn_21_1] = stackIn_22_2;
            }
            var5Lifetime1++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "Kickabout.HA(" + param0 + ')');
        }
    }

    final void c(byte param0) {
        ph.a(4);
        if (param0 != -24) {
          return;
        }
        r.a(true);
    }

    final void g(byte param0) {
        if (param0 >= -23) {
          this.g((byte) 116);
        }
        this.a(1, 69, 0, 2, 18, (byte) -4, 4, true);
        this.a(107, new eh());
        vq.a(oo.field_c, (byte) 23, (java.awt.Component) ((Object) ic.field_d));
        bc.a((byte) -8, uc.field_A);
    }

    final void o(int param0) {
        if (2147483647 == op.field_v) {
        } else {
          if (op.field_v != -3) {
            jm.a(op.field_v, false, -2);
          } else {
            rg.a(-1822);
          }
        }
        gm.i(0);
        if (param0 < 50) {
          field_I = (String) null;
        }
    }

    final boolean m(byte param0) {
        boolean stackIn_8_0 = false;
        if (param0 >= -70) {
          return true;
        }
        stackIn_8_0 = (od.field_n) || (ec.field_e) || (an.field_d);
        return stackIn_8_0;
    }

    final boolean a(int param0, ml param1, int param2) {
        boolean stackIn_9_0 = false;
        boolean stackIn_10_1 = false;
        int stackIn_29_0 = 0;
        ml stackIn_29_1 = null;
        boolean stackIn_30_2 = false;
        boolean stackIn_36_0 = false;
        boolean stackIn_37_1 = false;
        boolean stackIn_45_0 = false;
        boolean stackIn_46_1 = false;
        boolean stackIn_55_0 = false;
        boolean stackIn_56_1 = false;
        boolean stackIn_88_0 = false;
        boolean stackIn_91_0 = false;
        boolean stackIn_93_0 = false;
        boolean stackIn_94_1 = false;
        int stackIn_160_0 = 0;
        int stackIn_163_0 = 0;
        int stackIn_166_0 = 0;
        int stackIn_169_0 = 0;
        int stackIn_181_0 = 0;
        int stackIn_184_0 = 0;
        int stackIn_187_0 = 0;
        int stackIn_190_0 = 0;
        ap stackIn_192_0 = null;
        boolean stackIn_193_1 = false;
        int stackIn_242_0 = 0;
        int stackIn_245_0 = 0;
        int stackIn_248_0 = 0;
        int stackIn_251_0 = 0;
        int stackIn_254_1 = 0;
        boolean stackIn_257_0 = false;
        int stackIn_272_0 = 0;
        int stackIn_275_0 = 0;
        int stackIn_278_0 = 0;
        RuntimeException stackIn_306_0 = null;
        StringBuilder stackIn_306_1 = null;
        String stackIn_307_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        String[] var4 = null;
        int[] var4_array = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        vc[] var5_ref_vc__ = null;
        int[] var5_ref_int__ = null;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        vc[] var7_ref_vc__ = null;
        int var7 = 0;
        int var8_int = 0;
        tv var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String[] var12 = null;
        int var13 = 0;
        Object var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        vc[] var30 = null;
        vc[] var31 = null;
        String[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        String var40 = null;
        up[] var41 = null;
        ng var42 = null;
        String var43 = null;
        String[] var44 = null;
        String var45 = null;
        int[] var46 = null;
        int[] var47 = null;
        int[] var48 = null;
        int[] var49 = null;
        int[] var50 = null;
        int[] var51 = null;
        int[] var52 = null;
        vc[] var5_ref_vc__Lifetime1;
        int[] var5_ref_int__Lifetime1;
        int[] var5_ref_int__Lifetime2;
        int[] var6_ref_int__Lifetime1;
        int[] var6_ref_int__Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var5Lifetime5;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8_intLifetime1;
        int var13Lifetime1;
        int var15Lifetime1;
        int var4_intLifetime1;
        int var4_intLifetime2;
        int var4_intLifetime3;
        int var4_intLifetime4;
        int var4_intLifetime5;
        int var4_intLifetime6;
        int var4_intLifetime7;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        int var7Lifetime3;
        int var7Lifetime4;
        int var5Lifetime2Lifetime1;
        int var5Lifetime4Lifetime1;
        int var5Lifetime4Lifetime2;
        int var4_intLifetime6Lifetime1;
        int var4_intLifetime6Lifetime2;
        int var6Lifetime3Lifetime1;
        int var6Lifetime3Lifetime2;
        var22 = field_G;
        try {
          if (param2 != 1) {
            this.m((byte) -8);
          }
          if (param0 == 90) {
            ((eh) (ma.field_t)).b((byte) 115);
            return true;
          }
          if (param0 == 86) {
            stackIn_9_0 = false;
            stackIn_10_1 = (param1.h((byte) -122) == 1);
            fj.a(stackIn_9_0, stackIn_10_1);
            return true;
          }
          if (85 == param0) {
            ds.field_g = true;
            return true;
          }
          if (param0 == 84) {
            rr.field_f = true;
            return true;
          }
          if (param0 == 81) {
            vd.field_a.a(new pt(un.field_e), param2 ^ 2);
            return true;
          }
          if (71 != param0 &&
            83 != param0) {
            if (73 == param0) {
              ds.field_g = false;
              param1.p(-127);
              stackIn_36_0 = false;
              stackIn_37_1 = (param1.l(1, 59) == 1);
              fj.a(stackIn_36_0, stackIn_37_1);
              param1.l((byte) 103);
              var4_int = un.field_e.i(param2 ^ -97);
              var5 = un.field_e.b(param2 ^ 65281);
              var6 = un.field_e.h((byte) -119);
              var7_ref_vc__ = new vc[var6];
              for (var8_int = 0; var8_int < var6; var8_int++) {
                var7_ref_vc__[var8_int] = vc.a(param2 - 21833, un.field_e);
              }
              ((wf) (rn.a(param2 - 120, 16))).a(true, var7_ref_vc__, var4_int, var5);
              return true;
            }
            if (param0 == 76) {
              ds.field_g = false;
              param1.p(-104);
              stackIn_45_0 = false;
              stackIn_46_1 = (param1.l(1, param2 ^ 58) == 1);
              fj.a(stackIn_45_0, stackIn_46_1);
              param1.l((byte) -84);
              var4_intLifetime1 = un.field_e.h((byte) -125);
              var30 = new vc[var4_intLifetime1];
              var5_ref_vc__ = var30;
              for (var6Lifetime1 = 0; var6Lifetime1 < var4_intLifetime1; var6Lifetime1++) {
                var5_ref_vc__[var6Lifetime1] = vc.a(-21832, un.field_e);
              }
              wh.a((byte) 99, var30);
              return true;
            }
            if (param0 == 80) {
              ds.field_g = false;
              param1.p(-100);
              stackIn_55_0 = false;
              stackIn_56_1 = (param1.l(1, param2 + 58) == 1);
              fj.a(stackIn_55_0, stackIn_56_1);
              param1.l((byte) 112);
              var4_intLifetime2 = un.field_e.h((byte) -125);
              var31 = new vc[var4_intLifetime2];
              var5_ref_vc__Lifetime1 = var31;
              for (var6Lifetime2 = 0; var6Lifetime2 < var4_intLifetime2; var6Lifetime2++) {
                var5_ref_vc__Lifetime1[var6Lifetime2] = vc.a(ek.b(param2, -21831), un.field_e);
              }
              ((wf) (rn.a(-53, 16))).a(true, var31);
              return true;
            }
            if (param0 == 77) {
              var4_intLifetime3 = un.field_e.h((byte) -115);
              k.a(true, var4_intLifetime3);
              bh.field_k = var4_intLifetime3;
              if (cq.field_h instanceof qs) {
                if (null != ra.field_G) {
                  return true;
                }
                ((qt) (cq.field_h)).a(param2 ^ 1, 0, true);
                tb.a((byte) 126, 28);
              }
              return true;
            }
            if (param0 == 78) {
              var32 = new String[param1.a((byte) 81)];
              var4 = var32;
              for (var5Lifetime1 = 0; var32.length > var5Lifetime1; var5Lifetime1++) {
                var4[var5Lifetime1] = param1.a(ek.b(param2, -112));
              }
              gg.a(var32, (byte) 88);
              return true;
            }
            if (70 == param0) {
              ui.field_y = true;
              tu.field_E.a(85, param1, 4);
              pf.field_c = tu.field_E.field_d;
              if (tu.field_E.field_L) {
                tb.field_v = 1;
              } else {
                tb.field_v = 0;
              }
              ei.field_n = tu.field_E.field_A;
              if (!iu.field_h) {
                li.a(tu.field_E.field_p, (byte) 33);
                pe.a(tu.field_E.field_F, (byte) -116);
              }
              if (cq.field_h instanceof ta &&
                ra.field_G == null) {
                ((qt) (cq.field_h)).a(0, 0, true);
                tb.a((byte) 126, 28);
              }
              param1.p(param2 ^ -105);
              stackIn_88_0 = (param1.l(1, 59) == 1);
              c.field_g = stackIn_88_0;
              stackIn_91_0 = (1 == param1.l(1, 59));
              f.field_c = stackIn_91_0;
              stackIn_93_0 = false;
              stackIn_94_1 = (param1.l(1, 59) == 1);
              fj.a(stackIn_93_0, stackIn_94_1);
              param1.l((byte) 108);
              return true;
            }
            if (param0 == 74) {
              var4_intLifetime4 = param1.k(param2 + 3);
              if (um.field_e != null) {
                um.field_e.a(-21573, param1);
              }
              or.field_d.b(57, (byte) -80);
              or.field_d.b(param2 ^ -30, var4_intLifetime4);
              return true;
            }
            if (param0 == 9) {
              cv.a((byte) 87);
              ec.field_e = false;
              jm.a(10, false, -2);
              ka.a(2, param1.a(param2 - 98));
              return true;
            }
            if (param0 == 14) {
              cv.a((byte) 81);
              q.a(ma.f(param2 ^ 1), 120, ig.a((byte) 6, 1250), ig.a((byte) 6, 16), dd.b(-116), sn.field_c, dr.a(param2 ^ 1), 150, ow.field_c.length, 1024);
              ln.a(64, qq.h((byte) -64), qt.f((byte) -63));
              ec.field_e = false;
              od.field_n = true;
              if (!an.field_d) {
                jm.a(-3, false, -2);
              }
              return true;
            }
            if (param0 == 15) {
              if (od.field_n) {
                vc.f((byte) 119);
                vu.b(122);
                jm.a(0, false, -2);
                wi.field_B = true;
                k.field_k = true;
                od.field_n = false;
                al.field_Db = true;
                vr.b(1);
              }
              an.field_d = false;
              ec.field_e = false;
              return true;
            }
            if (10 == param0 &&
              od.field_n) {
              na.i(14);
              return true;
            }
            if (param0 == 67) {
              var23 = new int[8];
              var48 = var23;
              var35 = var48;
              var4_array = var35;
              for (var5Lifetime2 = 0; 2 >= var5Lifetime2; var5Lifetime2++) {
                var23[var5Lifetime2] = param1.k(ek.b(param2, 5));
              }
              var46 = var4_array;
              var33 = var46;
              var24 = var33;
              var5_ref_int__ = var24;
              var47 = bh.field_f;
              var34 = var47;
              var25 = var34;
              var6_ref_int__ = var25;
              for (var7 = 0; var7 < 8; var7++) {
                var24[var7] = qj.b(var46[var7], ~var47[var7]);
              }
              for (var5Lifetime2Lifetime1 = 0; var5Lifetime2Lifetime1 < 73; var5Lifetime2Lifetime1++) {
                if (c.a(var5Lifetime2Lifetime1, 0, var48)) {
                  ec.field_f.a(new oi(var5Lifetime2Lifetime1), 3);
                  ok.field_a.a(new oi(var5Lifetime2Lifetime1), 3);
                }
              }
              var49 = bh.field_f;
              var36 = var49;
              var26 = var36;
              var5_ref_int__Lifetime1 = var26;
              var50 = var4_array;
              var37 = var50;
              var27 = var37;
              var6_ref_int__Lifetime1 = var27;
              for (var7Lifetime3 = 0; var7Lifetime3 < 8; var7Lifetime3++) {
                var26[var7Lifetime3] = hf.a(var49[var7Lifetime3], var50[var7Lifetime3]);
              }
              var51 = ha.field_F;
              var38 = var51;
              var28 = var38;
              var5_ref_int__Lifetime2 = var28;
              var52 = var4_array;
              var39 = var52;
              var29 = var39;
              var6_ref_int__Lifetime2 = var29;
              for (var7Lifetime4 = 0; var7Lifetime4 < 8; var7Lifetime4++) {
                var28[var7Lifetime4] = hf.a(var51[var7Lifetime4], var52[var7Lifetime4]);
              }
              if (sj.field_g) {
                og.a(20164);
              }
              return true;
            }
            if (param0 == 75) {
              var4_intLifetime5 = param1.h((byte) -114);
              for (var5Lifetime3 = 0; var5Lifetime3 < var4_intLifetime5; var5Lifetime3++) {
                var40 = param1.a(80);
                r.field_d.a("  <col=99ccff># " + var40 + "</col", (byte) 94);
              }
              return true;
            }
            if (param0 != 64 &&
              param0 != 65) {
              if (param0 == 66) {
                if (null != sr.field_l) {
                  wi.field_B = true;
                  jm.a(-3, false, -2);
                  vr.b(1);
                }
                if (null != um.field_e &&
                  um.field_e.field_t) {
                  um.field_e.a(false, param2 ^ 19);
                  al.field_Db = true;
                  wi.field_B = true;
                  jm.a(-3, false, -2);
                  vr.b(param2 ^ 0);
                }
                an.field_d = false;
                return true;
              }
              if (82 == param0) {
                tb.a((byte) 126, 38);
                return true;
              }
              if (um.field_e != null &&
                um.field_e.field_t) {
                if (69 == param0) {
                  um.field_e.a((byte) -17, param1);
                  return true;
                }
                if (68 == param0) {
                  var4_intLifetime6 = param1.h((byte) -105);
                  for (var5Lifetime4 = 0; var5Lifetime4 < var4_intLifetime6; var5Lifetime4++) {
                    um.field_e.field_m.d(4);
                  }
                  var5Lifetime4 = param1.k(4);
                  um.field_e.field_m.a(param1, -5);
                  var6Lifetime3 = um.field_e.field_m.c(-98);
                  if (var5Lifetime4 != -1 &&
                    ~var6Lifetime3 != ~var5Lifetime4 &&
                    um.field_e.field_g) {
                    bd.a("ChecksumError: server=" + Integer.toHexString(var5Lifetime4) + " client=" + Integer.toHexString(var6Lifetime3), (Throwable) ((Object) new IllegalStateException(um.field_e.field_m.toString())), 1);
                    um.field_e.field_g = false;
                  }
                  um.field_e.field_i.a(um.field_e.field_m, (byte) 119);
                  return true;
                }
              }
              if (param0 == 87) {
                if (um.field_e != null) {
                  al.field_Db = true;
                }
                var6Lifetime3Lifetime1 = 0;
                param1.p(-114);
                var5Lifetime4Lifetime1 = 0;
                var4_intLifetime6Lifetime1 = 0;
                stackIn_242_0 = (!mu.a(param1, (byte) -39)) ? 0 : 1;
                var4_intLifetime6Lifetime1 = stackIn_242_0;
                stackIn_245_0 = (!mu.a(param1, (byte) -39)) ? 0 : 1;
                var5Lifetime4Lifetime1 = stackIn_245_0;
                stackIn_248_0 = (!mu.a(param1, (byte) -39)) ? 0 : 1;
                var6Lifetime3Lifetime1 = stackIn_248_0;
                param1.l((byte) -50);
                stackIn_251_0 = (var6Lifetime3Lifetime1 != 0) ? 0 : 1;
                if (var5Lifetime4Lifetime1 == var4_intLifetime6Lifetime1) {
                  stackIn_254_1 = 0;
                } else {
                  stackIn_254_1 = 1;
                }
                stackIn_257_0 = (stackIn_251_0 == stackIn_254_1);
                if (!stackIn_257_0) {
                  throw new RuntimeException("Tried to init a lobby without the full state being sent [" + (var4_intLifetime6Lifetime1 != 0) + "," + (var5Lifetime4Lifetime1 != 0) + "," + (var6Lifetime3Lifetime1 != 0) + "]");
                }
                sr.field_l = new lm(param1);
                da.a(-88);
                if (null == ra.field_G ||
                  ra.field_G.field_c != 18) {
                  if (cq.field_h.field_c == -2) {
                    cq.field_h = (js) ((Object) sr.field_l);
                  } else {
                    al.field_Db = true;
                    ng.a(-2, param2 ^ 71);
                    jm.a(18, false, param2 - 3);
                  }
                }
                an.field_d = false;
                return true;
              }
              if (null != sr.field_l &&
                param0 == 88) {
                param1.p(-112);
                var6Lifetime3Lifetime2 = 0;
                var4_intLifetime6Lifetime2 = 0;
                var5Lifetime4Lifetime2 = 0;
                stackIn_272_0 = (!mu.a(param1, (byte) -39)) ? 0 : 1;
                var4_intLifetime6Lifetime2 = stackIn_272_0;
                stackIn_275_0 = (!mu.a(param1, (byte) -39)) ? 0 : 1;
                var5Lifetime4Lifetime2 = stackIn_275_0;
                stackIn_278_0 = (!mu.a(param1, (byte) -39)) ? 0 : 1;
                var6Lifetime3Lifetime2 = stackIn_278_0;
                param1.l((byte) 103);
                if (var4_intLifetime6Lifetime2 != 0) {
                  sr.field_l.a(param1, false);
                }
                if (var5Lifetime4Lifetime2 != 0) {
                  sr.field_l.a(param2 + 8, param1);
                }
                if (var6Lifetime3Lifetime2 != 0) {
                  sr.field_l.a(param1, (byte) 110);
                }
                return true;
              }
              if (param0 == 89) {
                var42 = new ng();
                var42.a(param1, param2 ^ -20364);
                var43 = var42.a((byte) 51);
                var44 = og.a(var43, 80, (byte) 123);
                for (var7Lifetime1 = 0; var7Lifetime1 < var44.length; var7Lifetime1++) {
                  var8 = new tv(2, "", 0, "", var44[var7Lifetime1]);
                  qh.a((byte) 94, var8);
                }
                return true;
              }
              if (param0 != 91) {
                return false;
              }
              var45 = param1.a(param2 - 108);
              if (um.field_e != null &&
                um.field_e.field_A ||
                sr.field_l != null) {
                li.a(2009, var45);
              }
              return true;
            }
            ok.field_a.b(22997);
            if (sr.field_l != null) {
              wi.field_B = true;
            }
            var4_intLifetime7 = param1.field_n;
            cv.a((byte) 72);
            stackIn_160_0 = (0 == param1.h((byte) -106)) ? 0 : 1;
            var5Lifetime5 = stackIn_160_0;
            stackIn_163_0 = (0 == param1.h((byte) -116)) ? 0 : 1;
            var6Lifetime4 = stackIn_163_0;
            var7Lifetime2 = param1.h((byte) -117);
            var8_intLifetime1 = param1.h((byte) -126);
            stackIn_166_0 = (param1.h((byte) -123) == 0) ? 0 : 1;
            var9 = stackIn_166_0;
            stackIn_169_0 = (0 == param1.h((byte) -113)) ? 0 : 1;
            var10 = stackIn_169_0;
            var11 = param1.h((byte) -111);
            var12 = new String[var11];
            for (var13 = 0; var12.length > var13; var13++) {
              var12[var13] = param1.a(-111);
            }
            var13Lifetime1 = param1.j((byte) -64);
            var14 = null;
            if (var10 != 0 &&
              var13Lifetime1 >= 0) {
              var41 = new up[9];
              var14 = var41;
              for (var15 = 0; 9 > var15; var15++) {
                ((Object[]) (var14))[var15] = new up();
                var41[var15].a(39, param1);
              }
            }
            vs.field_g = null;
            var15Lifetime1 = param1.h((byte) -128);
            stackIn_181_0 = (0 == (var15Lifetime1 & 1)) ? 0 : 1;
            var16 = stackIn_181_0;
            stackIn_184_0 = ((var15Lifetime1 & 2) == 0) ? 0 : 1;
            var17 = stackIn_184_0;
            stackIn_187_0 = ((var15Lifetime1 & 4) == 0) ? 0 : 1;
            var18 = stackIn_187_0;
            stackIn_190_0 = ((var15Lifetime1 & 8) == 0) ? 0 : 1;
            var19 = stackIn_190_0;
            var20 = param1.j((byte) -87);
            um.field_e = new ap(true, (up[]) (var14), var12, var13Lifetime1, var5Lifetime5 != 0, var6Lifetime4 != 0, var7Lifetime2, var8_intLifetime1, var9 != 0, var10 != 0, var16 != 0, var17 != 0, var18 != 0, var20, (gr) null);
            stackIn_192_0 = um.field_e;
            stackIn_193_1 = (var19 != 0);
            stackIn_192_0.field_v = stackIn_193_1;
            da.a(-76);
            if (ra.field_G == null ||
              ra.field_G.field_c != 18) {
              if (cq.field_h.field_c == -1) {
                cq.field_h = (js) ((Object) um.field_e);
              } else {
                wi.field_B = true;
                ng.a(-1, param2 ^ 85);
                jm.a(18, false, -2);
              }
            }
            an.field_d = false;
            var21 = param1.field_n - var4_intLifetime7;
            if (var21 != ms.field_b) {
              throw new RuntimeException("");
            }
            return true;
          }
          rr.field_f = false;
          stackIn_29_0 = -105;
          stackIn_29_1 = (ml) (param1);
          stackIn_30_2 = (83 == so.field_b);
          mf.$cfr$intArgs$a$fbddc791f0bf(stackIn_29_0, stackIn_29_1, stackIn_30_2);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_306_0 = var4_ref;
          stackIn_306_1 = new StringBuilder().append("Kickabout.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_307_2 = "null";
          } else {
            stackIn_307_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_306_0), ((StringBuilder) (Object) stackIn_306_1).append(stackIn_307_2).append(',').append(param2).append(')').toString());
        }
    }

    public final void a(int param0) {
        int incrementValue$0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        lm stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        boolean stackIn_45_2 = false;
        ap stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        boolean stackIn_54_2 = false;
        js stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        boolean stackIn_64_2 = false;
        qt stackIn_74_0 = null;
        boolean stackIn_75_1 = false;
        js stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        boolean stackIn_86_2 = false;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        boolean decompiledFrameRemainder1 = true;
        var6 = field_G;
        var2 = 97 % ((param0 - 50) / 45);
        var3 = 0;
        if (0 < wr.field_f) {
          stackIn_4_0 = (po.a(cq.field_h, -4) < 640) ? 0 : 1;
          var4 = stackIn_4_0;
          if ((var4 == 0 ||
            ra.field_G != null) && 0 != tb.field_v) {
            var3 = 240;
            if ((ra.field_G != null)) {
              stackIn_14_0 = (po.a(ra.field_G, -4) < 640) ? 0 : 1;
              var5 = stackIn_14_0;
              if (var4 != 0 &&
                var5 != 0) {
                var3 = 256;
              }
              if (var4 == 0 &&
                var5 != 0) {
                var3 = var3 + (ce.field_I << 3);
              }
              if (var4 != 0 &&
                var5 == 0) {
                var3 = var3 + (24 - ce.field_I << 3);
              }
              if (!(var3 <= 256)) {
                var3 = 256;
              }
            }
            decompiledFrameRemainder1 = false;
          }
          else {
            var3 = 256;
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (cq.field_h.field_c == -3 && (null == ra.field_G ||
          18 == ra.field_G.field_c)) {
          var4Lifetime1 = 0;
          for (var5Lifetime1 = -on.field_a.length; var5Lifetime1 < 0; var5Lifetime1++) {
            incrementValue$0 = var4Lifetime1;
            var4Lifetime1++;
            on.field_a[incrementValue$0] = 65793;
          }
          decompiledFrameRemainder0 = false;
        }
        else {
          if (wr.field_f < 680) {
            hr.a((byte) -48);
          }
          if (sr.field_l != null &&
            cq.field_h.field_c != 0 &&
            cq.field_h.field_c != -1 &&
            6 != cq.field_h.field_c) {
            stackIn_44_0 = sr.field_l;
            stackIn_44_1 = -5;
            stackIn_45_2 = (this.field_L) && (sr.field_l == cq.field_h) && (ra.field_G == null);
            ((lm) (Object) stackIn_44_0).a(stackIn_44_1, stackIn_45_2);
          }
          if (um.field_e != null &&
            cq.field_h.field_c != 0 &&
            -2 != cq.field_h.field_c) {
            stackIn_53_0 = um.field_e;
            stackIn_53_1 = -5;
            stackIn_54_2 = (this.field_L) && (um.field_e == cq.field_h) && (null == ra.field_G);
            ((ap) (Object) stackIn_53_0).a(stackIn_53_1, stackIn_54_2);
          }
        }
        pt.a(wr.field_f, -22914, 0, 480, 0);
        var4Lifetime2 = -nn.field_B.field_o + wr.field_f;
        if (var3 > 0) {
          eo.a(po.field_h, vq.field_d, var4Lifetime2);
          eo.a(mk.field_a, 0, 0, wr.field_f, 480, var3, 0);
          cq.field_j.c(-36, 50, 64);
        }
        if (cq.field_h instanceof qt) {
          stackIn_63_0 = cq.field_h;
          stackIn_63_1 = -5;
          stackIn_64_2 = (this.field_L) && (null == ra.field_G);
          ((js) (Object) stackIn_63_0).a(stackIn_63_1, stackIn_64_2);
        }
        if (ra.field_G instanceof qt) {
          ra.field_G.a(-5, false);
        }
        if (wr.field_f > 0) {
          po.field_h.c(var4Lifetime2, 0);
          nn.field_B.c(var4Lifetime2, 0);
        }
        ta.e(118);
        if (cq.field_h instanceof qt) {
          stackIn_74_0 = (qt) (cq.field_h);
          stackIn_75_1 = (this.field_L) && (ra.field_G == null);
          ((qt) (Object) stackIn_74_0).a(stackIn_75_1, 117);
        }
        if (ra.field_G instanceof qt) {
          ((qt) (ra.field_G)).a(false, 119);
        }
        if (!(cq.field_h instanceof qt) &&
          cq.field_h != um.field_e &&
          cq.field_h != sr.field_l) {
          stackIn_85_0 = cq.field_h;
          stackIn_85_1 = -5;
          stackIn_86_2 = (this.field_L) && (ra.field_G == null);
          ((js) (Object) stackIn_85_0).a(stackIn_85_1, stackIn_86_2);
        }
        if (ra.field_G != null &&
          !(ra.field_G instanceof qt) &&
          um.field_e != ra.field_G &&
          sr.field_l != ra.field_G) {
          ra.field_G.a(-5, false);
        }
        this.w(102);
        if (pb.field_B) {
          sc.g((byte) -119);
        }
        if (ka.field_b) {
          var5Lifetime2 = -ce.field_I + 24 << 4;
          if (ce.field_I < 12) {
            var5Lifetime2 = ce.field_I << 4;
          }
          q.field_d.d("Transition: " + ce.field_I + " : " + var5Lifetime2, 320, 100, 16777215, 0);
        }
        if (wh.field_q &&
          cq.field_h.field_c != -4) {
          this.v(81);
        }
        wq.a((byte) 71);
        gs.a((byte) -106);
    }

    final void b(int param0) {
        Kickabout.o((byte) -99);
        bw.a(false);
        uq.a(-91);
        ug.a(-1);
        et.a(121);
        w.b(23);
        ng.b(param0 ^ 126);
        up.g(112);
        hn.a((byte) 122);
        pt.a((byte) 9);
        su.a((byte) -115);
        gr.b((byte) 0);
        fp.a(-23834);
        wk.a((byte) -67);
        pc.b(-13827);
        nd.a((byte) 115);
        oo.a(param0 ^ -18184);
        pl.a(20177);
        pr.a(0);
        oi.a(false);
        tf.a(param0 - 133);
        on.c();
        jl.a(param0 ^ 8198);
        ml.m(0);
        gs.b((byte) -117);
        mi.a(param0 - 6);
        nc.a((byte) 72);
        ss.a((byte) -90);
        tu.q(30907);
        de.a(param0 + 3896);
        gw.d(param0 + 92);
        qr.a(false);
        ma.d(true);
        bs.a((byte) -95);
        ah.c(1);
        u.a(param0 - 8);
        ku.a(param0 - 7);
        rg.a((byte) 66);
        sj.c(param0 ^ -122);
        fc.a(29136);
        td.a(false);
        iw.g((byte) 88);
        nj.a((byte) -64);
        fh.a((byte) 122);
        fs.a(-81);
        ms.a((byte) 53);
        tn.a(false);
        cu.a(param0 ^ 6);
        oa.a(param0 - 6);
        tv.a(2);
        hp.a(0);
        ns.a((byte) 60);
        mc.a((byte) -116);
        qe.a(true);
        vq.a((byte) 25);
        kh.d(param0 - 1712);
        sd.a(-1);
        ap.a(true);
        lm.a(true);
        js.a((byte) 125);
        kd.c(-1);
        lu.g((byte) -28);
        am.e(13421568);
        gn.d(126);
        hj.a(param0 + 50);
        rd.a(true);
        ds.a(-49);
        cq.b(110);
        eh.d(1);
        ig.a((byte) -13);
        vb.a(0);
        fn.q(140);
        hs.b(104);
        il.a((byte) 101);
        jb.c(false);
        ar.a((byte) -73);
        gm.i((byte) 14);
        ak.a(17);
        vr.a((byte) -118);
        ca.a((byte) -72);
        ws.a(-25514);
        fj.b(true);
        c.a((byte) 114);
        sn.a(-1316);
        ti.a((byte) -126);
        nh.a();
        aj.a(-9097);
        le.a(false);
        bq.a((byte) -127);
        dg.a((byte) -90);
        t.a();
        ep.a(0);
        ck.a(false);
        rj.a((byte) -116);
        ks.a(0);
        uh.a();
        jj.a((byte) -99);
        qt.c((byte) -107);
        fv.b((byte) 108);
        mt.a(param0 ^ 7);
        ji.a(-123);
        hd.g(-14457);
        io.a((byte) -6);
        ko.a((byte) -22);
        ew.d(81);
        te.a(true);
        ec.a(0);
        we.a((byte) -43);
        kr.a(param0 ^ -121);
        kj.b((byte) -118);
        ps.b(-27680);
        bh.c(param0 ^ -109);
        kt.a(125);
        e.a(-1);
        ta.g((byte) 91);
        sp.j(param0 - 246);
        jt.h((byte) -17);
        in.a(param0 ^ 31347);
        ud.e(14513);
        gt.a(true);
        ch.a((byte) 119);
        qn.a((byte) -124);
        hu.a();
        nu.a(true);
        aq.b(1);
        vj.a((byte) 111);
        tg.a();
        wh.a(0);
        bd.f(param0 ^ -54);
        gk.a((byte) -127);
        rm.f(-71);
        uf.b(param0 ^ 3547);
        ne.g(29250);
        cb.a((byte) -100);
        ob.i(127);
        la.a((byte) -124);
        tj.f(0);
        nl.e((byte) -108);
        is.b(116);
        mj.a(param0 ^ 6);
        om.b(0);
        na.a(param0 ^ 116);
        iv.a(false);
        gu.h((byte) 38);
        al.a(1);
        uv.c(123);
        np.i((byte) -122);
        rb.c(true);
        he.b(240);
        qb.a(-7);
        em.c((byte) 36);
        sk.a(-5514);
        ph.b(1114366657);
        ad.a(param0 - 6);
        bn.e(-38);
        so.a((byte) -113);
        jq.a(true);
        kp.a((byte) 101);
        vk.a(50);
        pi.a((byte) -116);
        h.a(false);
        jc.a(48);
        p.a(320);
        it.c(92);
        oe.a((byte) -90);
        wr.a(true);
        ua.a((byte) -30);
        ki.a(0);
        mo.a(-3);
        po.a(0);
        sc.e(130);
        rq.a(true);
        dc.a(-89);
        bo.a(param0 ^ 78);
        tt.a(false);
        eg.d();
        sh.a(320);
        ul.a(param0 ^ 125);
        o.d(1603);
        be.d((byte) -53);
        lj.a(-64);
        ts.a((byte) 123);
        vg.m(param0 + 90);
        qd.a(-75);
        rk.a(0);
        nr.a((byte) 126);
        dr.a((byte) -127);
        fm.g((byte) 81);
        eo.c();
        tk.i((byte) -69);
        wf.h((byte) -53);
        jw.a(0);
        jh.k((byte) 68);
        jr.i(-25734);
        kc.a((byte) -111);
        b.f(-2010043359);
        mf.i((byte) -127);
        pu.i((byte) -108);
        qs.h((byte) -111);
        bp.c(false);
        kq.i((byte) -123);
        vu.a(-15410);
        rf.a(-97);
        kf.c(true);
        sl.i((byte) 39);
        ac.b((byte) 16);
        wa.a((byte) 116);
        rr.a(param0 - 121);
        ru.a((byte) -32);
        kl.a(param0 ^ 6);
        rc.a(113);
        ow.a(false);
        km.a();
        cp.a((byte) 60);
        fw.f(-107);
        i.f((byte) 90);
        pv.g((byte) -111);
        sq.g(13);
        qq.g(param0 + 2350);
        aw.h((byte) -117);
        ha.g(100);
        hg.h(22100);
        nq.h(0);
        no.g((byte) -93);
        pq.g(-14948);
        pw.g(-8332);
        gi.h(-31922);
        hk.g(0);
        rt.g(param0 ^ 25994);
        ie.h(24342);
        ek.d(false);
        kn.g(2);
        vf.g((byte) -45);
        ce.g(30);
        bm.d(false);
        lt.a(-122);
        of.a(false);
        ih.a(66049);
        d.a(0);
        se.m(-1);
        jn.s(248);
        oj.j((byte) 110);
        vo.j((byte) 53);
        wv.j((byte) -108);
        ae.a((byte) -94);
        nn.k(2);
        pd.k(param0 ^ -11205);
        mb.a((byte) -94);
        wc.a(10);
        ee.a((byte) -100);
        th.a(false);
        ve.j((byte) 77);
        cd.a((byte) -98);
        cm.o(1);
        qv.a(true);
        wi.a(79);
        fd.g((byte) 88);
        ub.a((byte) -103);
        wj.i(param0 ^ -336184830);
        nw.c((byte) -65);
        iq.b(0);
        ct.j(31068);
        pg.b(127);
        bi.f(param0 - 6);
        eb.a(2);
        n.b(-2147483648);
        gf.a(64);
        kk.a((byte) 94);
        pe.b((byte) 7);
        wq.a(-109);
        f.a((byte) -88);
        tl.c(0);
        ao.b(113);
        sa.a((byte) 125);
        di.a(-10);
        lf.a((byte) 94);
        pf.a((byte) 98);
        au.a();
        os.b(3);
        si.a(0);
        un.a((byte) 106);
        re.a((byte) 109);
        id.a(-116);
        ei.a(-19485);
        du.a(-24229);
        ql.b(7);
        mv.a(true);
        ka.a(19044);
        sg.a(false);
        bb.b(111);
        bt.a(true);
        an.a(30297);
        bg.a(71);
        eq.a((byte) -32);
        av.b(99);
        lw.a((byte) -125);
        vi.d(125);
        dh.a((byte) -29);
        hq.a(param0 + 55);
        cl.a(-1);
        tr.a(false);
        ol.g(-39);
        va.c((byte) -40);
        wb.g(param0 - 119);
        fk.f(1);
        lr.f(param0 - 15646);
        bf.b((byte) -113);
        ib.a(param0 + 905215451);
        cv.b((byte) -39);
        ia.a((byte) 107);
        rn.a(-66);
        je.a(-1);
        ok.a(param0 + 121);
        ef.h((byte) -31);
        db.a();
        mk.a(17437);
        uk.a((byte) -128);
        nm.a(256);
        g.a(true);
        us.f((byte) 40);
        ip.a(-123);
        vp.b((byte) 125);
        da.a((byte) -80);
        rs.b();
        pp.a(false);
        dj.e(param0 - 29110);
        tb.c((byte) -115);
        ui.a(true);
        qh.b(-1);
        hi.g(-26236);
        wm.a((byte) -119);
        or.a((byte) 69);
        vv.g((byte) 18);
        af.a((byte) 105);
        cg.k(115);
        mr.n((byte) 74);
        ga.l(param0 - 6);
        mu.p(12);
        fr.a(param0 - 6);
        lb.i(param0 + 9568);
        gb.a((byte) 38);
        ju.h((byte) -120);
        qk.a((byte) 108);
        jd.b((byte) -124);
        br.a(true);
        ai.l(0);
        bk.b(-79);
        kv.a();
        hw.a(96);
        sf.f(90);
        ra.g(128);
        qa.g(60);
        df.c(false);
        ja.h(8);
        um.a(123);
        es.a((byte) -49);
        hl.f(param0 ^ -5);
        fb.n(-23192);
        wt.b(false);
        go.a(99);
        mg.a(param0 ^ 136);
        hv.a(23);
        jk.f((byte) -37);
        gl.a(93);
        m.a(0);
        s.i(-1);
        nv.j(696);
        st.b((byte) -103);
        jg.h((byte) -112);
        ln.k(31235);
        ll.b((byte) -56);
        fu.a(true);
        ht.a(false);
        ci.a(18);
        ij.g((byte) -46);
        ff.a((byte) 101);
        pn.b(-1);
        dq.a(false);
        dt.a(43);
        cj.a(param0 ^ -104);
        vt.a(-73);
        as.a();
        nt.i(4476);
        ov.a(1);
        lc.a(-119);
        nb.a(true);
        ag.a((byte) 100);
        vc.g((byte) -126);
        wd.a((byte) 122);
        ni.a(-1859);
        sm.a(0);
        wp.b(param0 ^ 6);
        op.b(-1842526431);
        cr.a(param0 + 18080);
        ri.b(true);
        rp.a(102);
        mn.a((byte) 106);
        pj.h((byte) 115);
        oc.b((byte) -116);
        dk.a(7571);
        ii.a(84);
        bl.b((byte) -104);
        lk.a(param0 - 6);
        li.a((byte) -126);
        tm.a(15);
        fi.a((byte) 121);
        dw.a(param0 ^ 6);
        sb.a(-127);
        q.b(-84);
        en.b((byte) 38);
        rl.b(20);
        ba.c((byte) -35);
        od.b(param0 - 6);
        qi.b((byte) 85);
        sr.a((byte) 121);
        nk.a(-15207);
        pa.c((byte) 125);
        md.c(param0 ^ 32312);
        fa.a(param0 - 121);
        kw.d((byte) -122);
        r.a(param0 ^ -94);
        jm.a(104);
        vd.a(-5);
        wn.a(param0 ^ param0);
        ue.a(92);
        j.a(true);
        vl.a(120);
        aa.b((byte) -104);
        wo.a(false);
        gp.c(85);
        oh.b((byte) -47);
        vs.a(0);
        cf.a(-13);
        iu.a((byte) -123);
        gd.a(22897);
        hm.g(10040319);
        kb.g(1);
        jo.g(param0 - 6);
        jf.g(param0 + 121);
        ir.a(false);
        pb.g(50);
        tq.g(115);
        ik.g(param0 ^ -107);
        uc.g(220);
        ev.g(1);
        el.g((byte) 52);
        uj.a(false);
        lh.g((byte) 96);
        ej.h((byte) 118);
        im.a(-18523);
        at.h((byte) -117);
        dn.c(true);
        qp.a(14);
        hh.a((byte) 121);
        qj.b((byte) -125);
        dl.a((byte) -61);
        hr.a(2);
        k.a(-77);
        mp.a(1);
        hf.a(true);
        v.b(0);
        bv.g(-70);
        lo.c((byte) -96);
        qo.f((byte) -126);
        mh.g(-29635);
        fo.c((byte) 92);
        ge.c((byte) 76);
        ic.a((byte) 68);
        er.a((byte) -94);
        rv.a(-89);
        lg.d(param0 ^ 344);
        ea.a(param0 ^ -110);
        ld.a((byte) 112);
        this.field_z = null;
    }

    public final void init() {
        this.a("Kickabout", 19, (byte) -60);
    }

    static {
        field_I = "Name is available";
        field_F = "Duration";
    }
}
