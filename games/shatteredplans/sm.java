/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sm {
    private int field_a;
    private int field_g;
    static int field_b;
    private boolean field_f;
    private int field_h;
    private np field_d;
    private int field_i;
    static boolean field_e;
    static String field_c;

    final void b(int param0, int param1) {
        int discarded$0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        var3 = this.c(32);
        if (0 == var3) {
          return;
        }
        if (null != ce.field_x ||
          null != in.field_g) {
          sn.a(640, -46, 480, 192 + (param1 >> 1), 0, 0);
        }
        var4 = (640 - var3) / 2;
        var5 = this.h(-127);
        var6 = this.b((byte) -98);
        var7 = var4;
        if (param0 < 41) {
          discarded$0 = this.h(101);
        }
        var8 = 20 + var3;
        var9 = var5 - 10;
        var10 = var6 + 10;
        kp.field_m = qh.a(kp.field_m, var9 - 3, 24, -3 + var7, -1, 24);
        vl.field_q = qh.a(vl.field_q, 4 + (var9 + var10) - 24, 24, -24 + (var7 - (-var8 - 3)), -1, 24);
        if (fj.field_t.field_a == 2) {
          sn.a(var8, -50, var10, param1 + 128, var7, var9);
          bs.field_a = qh.a(bs.field_a, var9, var8, var7, -1, var10);
          bs.a(bs.field_a, 107);
          gf.b(3, 3, 0, 0, var8, var10);
          bs.field_a.a(var7, var9, 128 - param1 << 1);
          cg.i(0);
        } else {
          if (fj.field_t.field_a == 1) {
            sn.a(var8, -29, var10, 128 + param1, var7, var9);
          } else {
            gf.c(var7, var9, var8, var10, 855316, -param1 + 128 << 1);
          }
        }
        ga.a(var10, var9, var7, (byte) -102, var8);
        gf.a(s.field_f);
        gf.d(var7, var9, var7 + var8, var9 + var10);
        this.e(var5, 7903);
        gf.b(s.field_f);
        return;
    }

    private final void f(byte param0) {
        int var2;
        int var3;
        int var4;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        ne.field_o = this.b(-100, pd.field_k, bb.field_b);
        if (param0 <= 115) {
          return;
        }
        var2 = 0;
        if (je.field_d != 0) {
          var3 = this.b(107, nh.field_p, td.field_P);
          if (0 <= var3) {
            this.d(4, var3);
          }
        }
        if (0 != so.field_o) {
          var2 = so.field_o * -20;
        }
        if (ai.field_e != 0) {
          if (rf.field_n != 0) {
            if (ne.field_o != -2) {
              if (-3 == ne.field_o) {
                var2 -= 10;
              }
            } else {
              var2 += 10;
            }
          }
        } else {
          if (je.field_d != 0) {
            if (-2 != ne.field_o) {
              if (ne.field_o == -3) {
                this.a(1, (byte) -57);
              }
            } else {
              this.a(-1, (byte) -57);
            }
          }
        }
        if (0 != rf.field_n &&
          -1 == ne.field_o) {
          if (!this.field_f) {
            this.field_f = true;
            this.field_i = bb.field_b;
          } else {
            var2 = -this.field_i + bb.field_b;
            this.field_i = bb.field_b;
          }
        } else {
          this.field_f = false;
        }
        if (0 != var2) {
          pr.field_g = pr.field_g - var2;
          ac.field_w = ac.field_w - var2;
          if (pr.field_g < 0) {
            pr.field_g = 0;
          }
          if (ac.field_w < 0) {
            ac.field_w = 0;
          }
          if (kb.field_A < pr.field_g) {
            pr.field_g = kb.field_A;
          }
          if (kb.field_A < ac.field_w) {
            ac.field_w = kb.field_A;
          }
        }
        return;
    }

    private final int b(int param0) {
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        if (param0 != 10) {
          this.b(-38, false, 12, 127);
        }
        if (vr.field_c != this.field_a &&
          this.field_a != gr.field_o) {
          return 0;
        }
        if (vr.field_c != gr.field_o &&
          nh.a((byte) -76, vr.field_c) &&
          nh.a((byte) -76, gr.field_o)) {
          var2 = wm.a(eh.field_Q, (byte) 121, 32);
          var4 = (int)((double)(80 + qg.field_r[vr.field_c]) * var2);
          var5 = -(((int)(var2 * (double)(-qg.field_r[vr.field_c] + qg.field_r[gr.field_o])) + qg.field_r[vr.field_c]) / 2) + 320;
          if (vr.field_c == this.field_a) {
            return qg.field_r[vr.field_c] / 2 + var5 - var4;
          }
          return -(qg.field_r[vr.field_c] / 2) + (100 - var4);
        }
        return 320;
    }

    final void a(int param0, int param1) {
        if (nh.a((byte) -74, param1)) {
          if (this.field_g == -1) {
          }
          mj.field_Hb[param1].field_g = -1;
        }
        if (param0 != -30492) {
          this.a(47, 88);
        }
    }

    private final int b(boolean param0) {
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        if (this.field_a != vr.field_c &&
          gr.field_o != this.field_a) {
          return 0;
        }
        if (gr.field_o != vr.field_c && nh.a((byte) -82, vr.field_c) &&
          nh.a((byte) -126, gr.field_o)) {
          var2 = wm.a(eh.field_Q, (byte) 118, 32);
          var4 = (int)((-var2 + 1.0) * (double)(80 + qg.field_r[vr.field_c]));
          var5 = -(((int)(var2 * (double)(qg.field_r[gr.field_o] - qg.field_r[vr.field_c])) + qg.field_r[vr.field_c]) / 2) + 320;
          var5 = var5 + var4;
          if (vr.field_c != this.field_a) {
            return var5;
          }
          return -80 + (var5 - qg.field_r[vr.field_c]);
        }
        if (param0) {
          return -21;
        }
        return (640 - this.c(32)) / 2;
    }

    private final void a(int param0, int param1, int param2) {
        int stackIn_3_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_48_0 = 0;
        int var4;
        int var5;
        int var6;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        String var14;
        int var14_int;
        int var15;
        String var15_ref_String;
        int var16;
        bi var17;
        int var17_int;
        int var18;
        int var19;
        bi var20;
        int var21;
        int[] var25;
        int var9Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var12Lifetime2;
        int var13Lifetime1;
        int var16Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var14_intLifetime1;
        var21 = ShatteredPlansClient.field_F ? 1 : 0;
        if (jn.field_b != 0) {
          stackIn_3_0 = re.a(pr.field_g, 32, jn.field_b, ac.field_w, 0);
        } else {
          stackIn_3_0 = ac.field_w;
        }
        var4 = stackIn_3_0;
        var5 = pe.field_J.length;
        if (0 > var4) {
          var4 = 0;
        }
        if (kb.field_A < var4) {
          var4 = kb.field_A;
        }
        var6 = param0 - (-qg.field_r[this.field_a] - 18);
        param0 -= 8;
        gf.a(param0 + 20, param1 + 2, 18 + (-60 + qg.field_r[this.field_a] + o.field_k.field_z), 309, 10, 0, 92);
        gf.f(20 + param0, 2 + param1, qg.field_r[this.field_a] - 60 + (18 + o.field_k.field_z), 309, 10, 2458760);
        var25 = new int[4];
        gf.a(var25);
        gf.i(25 + param0, 5 + param1, var6 - 20, param1 + qg.field_t[this.field_a] - 14);
        var8 = -var4;
        for (var9 = 0; var9 < var5; var9++) {
          if (var9 > 0) {
            gf.f(param0 + 30, -20 + (3 + (param1 + var8)), -param0 + var6 - 80, 16777215);
            gf.f(param0 + 30, -40 + (var8 + (param1 + 3)), -80 + (-param0 + var6), 16777215);
            rs.field_Cb.d(pe.field_J[var9], param0 + 50, rs.field_Cb.field_J / 2 + (3 + param1) + var8 - 30, 16777215, -1);
          }
          if (294 >= var8 &&
            var8 >= -294) {
            this.a(var8 + param1 + 3, true, var9, param0 + 30);
          }
          var8 = var8 + cb.field_i[var9];
        }
        gf.b(var25);
        if (kb.field_A > var4) {
          bg.field_a.c(param0 - (-qg.field_r[this.field_a] + 26), -35 + (qg.field_t[this.field_a] + param1), 256);
          if (ne.field_o == -3) {
            bg.field_a.c(qg.field_r[this.field_a] + param0 - 26, param1 + qg.field_t[this.field_a] - 35, 256);
          }
        }
        if (0 < var4) {
          o.field_k.c(-26 + (param0 + qg.field_r[this.field_a]), 5 + param1, 256);
          if (ne.field_o == -2) {
            o.field_k.c(qg.field_r[this.field_a] + (param0 - 26), param1 + 5, 256);
          }
        }
        var9Lifetime1 = -(21 * var5) + 310;
        if (param2 != 7552) {
          return;
        }
        param1 += 8;
        var10 = nc.field_t;
        for (var11 = 0; -1 + var5 > var11; var11++) {
          var12 = ln.field_H[var11];
          if (12 < var12) {
            var12 = 12;
          }
          if (var10 != 0) {
            stackIn_35_0 = var9Lifetime1 * var12 / var10;
          } else {
            stackIn_35_0 = 0;
          }
          var13 = stackIn_35_0;
          var10 = var10 - var12;
          var9Lifetime1 = var9Lifetime1 - var13;
          var13 += 21;
          for (var14_int = 0; var14_int <= 16; var14_int++) {
            mh.a(var13, var6 - var14_int, param1 + var14_int, 65793, false);
          }
          ks.a(-18166, 16, 2458760, -1, var6, param1);
          mh.a(var13, -16 + var6, 16 + param1, 2458760, false);
          var14_intLifetime1 = -12 + ln.field_H[var11];
          if (var14_intLifetime1 > 0) {
            var15_ref_String = pe.field_J[var11];
            var16 = rs.field_Cb.c(var15_ref_String);
            var17_int = rs.field_Cb.field_q + rs.field_Cb.field_J;
            var18 = var6 - 15;
            var19 = (var13 - var16 >> 1) + 8 + param1;
            var20 = new bi(var17_int, var16);
            bs.a(var20, 125);
            rs.field_Cb.a(var15_ref_String, 1 + rs.field_Cb.field_J * 3 / 4, -1 + var16, 16777215, -1);
            cg.i(0);
            var20.c(var18, var19, 256 * var14_intLifetime1 / 12);
          }
          param1 = param1 + var13;
        }
        var11Lifetime1 = var9Lifetime1 + 16;
        for (var12Lifetime1 = 0; var12Lifetime1 <= 16; var12Lifetime1++) {
          mh.a(-(var12Lifetime1 * 2) + 32 + var11Lifetime1, -var12Lifetime1 + var6, param1 + var12Lifetime1, 65793, false);
        }
        ks.a(-18166, 16, 2458760, -1, var6, param1);
        mh.a(var11Lifetime1, var6 - 16, param1 + 16, 2458760, false);
        stackIn_48_0 = (this.field_a != 7) ? 16 : 8;
        var12Lifetime2 = stackIn_48_0;
        ks.a(-18166, var12Lifetime2, 2458760, 1, var6 - 16, var11Lifetime1 + 15 + param1);
        var13Lifetime1 = ln.field_H[var5 - 1] << 2;
        if (0 != var13Lifetime1) {
          var14 = pe.field_J[var5 - 1];
          var15 = rs.field_Cb.c(var14);
          var16Lifetime1 = rs.field_Cb.field_q + rs.field_Cb.field_J;
          var17 = new bi(var16Lifetime1, var15);
          bs.a(var17, 82);
          rs.field_Cb.a(var14, rs.field_Cb.field_J * 3 / 4 + 1, -1 + var15, 16777215, -1);
          cg.i(param2 ^ 7552);
          var18Lifetime1 = var6 - 14;
          var19Lifetime1 = (-var15 + var11Lifetime1 >> 1) + 16 + param1;
          var17.c(var18Lifetime1, var19Lifetime1, (int)(2.67 * (double)var13Lifetime1));
        }
        return;
    }

    private final int d(int param0, int param1, int param2) {
        int var7 = 0;
        int var4;
        int var5;
        int[] var6;
        int var8;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 < 53) {
          this.e(93, -98);
        }
        var4 = 140;
        var5 = 52;
        var6 = new int[4];
        gf.a(var6);
        gf.a();
        for (var7 = 0; 25 > var7; var7++) {
          if (var5 <= param1 &&
            var5 + 32 > param1 &&
            var4 <= param2 &&
            param2 < var4 + 32) {
            return var7;
          }
          var5 += 42;
          if (var7 % 13 == 12) {
            var4 = (int)((double)var4 + Math.sqrt(3.0) * 21.0);
            var5 = 73;
          }
        }
        return -1;
    }

    private final void d(byte param0) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var6Lifetime1;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = ln.field_H.length;
        var3 = ac.field_w + 147;
        var4 = 0;
        if (param0 >= -31) {
          field_c = (String) null;
        }
        while (var4 < var2) {
          var3 = var3 - cb.field_i[var4];
          if (0 <= var3) {
            var4++;
            continue;
          }
          break;
        }
        o.field_s = var4;
        var5 = ne.field_o;
        if (var5 < 0) {
          var5 = o.field_s;
        }
        nc.field_t = 0;
        for (var4Lifetime1 = 0; var4Lifetime1 < ln.field_H.length; var4Lifetime1++) {
          var6 = ln.field_H[var4Lifetime1];
          if (var5 == var4Lifetime1) {
            var6++;
            if (var6 <= 24) {
              ln.field_H[var4Lifetime1] = var6;
            } else {
              var6 = 24;
            }
          } else {
            var6--;
            if (var6 >= 0) {
              ln.field_H[var4Lifetime1] = var6;
            } else {
              var6 = 0;
            }
          }
          if (var6 > 12) {
            var6 = 12;
          }
          nc.field_t = nc.field_t + var6;
        }
        if (jn.field_b != 0) {
          fieldTemp$0 = jn.field_b + 1;
          jn.field_b = jn.field_b + 1;
          if (fieldTemp$0 == 32) {
            jn.field_b = 0;
            pr.field_g = ac.field_w;
          }
        }
        if (oo.field_b == null) {
          oo.field_b = new int[5];
          er.field_q = new int[5];
          fg.field_c = new int[5];
          for (var4Lifetime2 = 0; var4Lifetime2 < 5; var4Lifetime2++) {
            er.field_q[var4Lifetime2] = vc.a((byte) -39, 35);
            fg.field_c[var4Lifetime2] = vc.a((byte) -39, 35);
          }
        }
        var6Lifetime1 = cl.field_n % 50;
        if (var6Lifetime1 == 0) {
          for (var4Lifetime3 = 0; 5 > var4Lifetime3; var4Lifetime3++) {
            er.field_q[var4Lifetime3] = fg.field_c[var4Lifetime3];
            fg.field_c[var4Lifetime3] = vc.a((byte) -39, 35);
          }
        }
    }

    private final void e(int param0, int param1) {
        int var6 = 0;
        int stackIn_12_1 = 0;
        boolean stackIn_13_2 = false;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        Object stackIn_17_0;
        boolean stackIn_17_3;
        int var3;
        int var4;
        int var5;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var4Lifetime1;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        var3 = this.b(false);
        var4 = qg.field_t[this.field_a];
        var5 = this.field_h % (this.field_d.field_b * 16);
        if (param1 != 7903) {
          field_c = (String) null;
        }
        for (var6 = 0; var6 < this.field_d.field_b; var6++) {
          if (this.a((byte) 44, var6)) {
            var7 = (this.field_h - var6 * 4) * 256 / (this.field_d.field_b * 4);
            if (var7 > 0) {
              if (var7 >= 256) {
                stackIn_16_1 = var6;
                stackIn_16_2 = -127;
                if (this.field_d.field_c != var6) {
                  stackIn_17_0 = this;
                  stackIn_17_3 = false;
                } else {
                  stackIn_17_0 = this;
                  stackIn_17_3 = true;
                }
                this.a(stackIn_16_1, stackIn_16_2, stackIn_17_3);
              } else {
                stackIn_12_1 = var6;
                stackIn_13_2 = (var6 == this.field_d.field_c);
                this.a(stackIn_12_1, stackIn_13_2, var7, false);
              }
            }
            if (qg.field_p[this.field_a][var6] != 29 &&
              qg.field_p[this.field_a][var6] != 28) {
              var4Lifetime1 = this.c(var6, true);
              if (var6 == this.field_d.field_c) {
                hn.field_c.f(25 + var3, (qg.field_l[this.field_a] - hn.field_c.field_w) / 2 + var4Lifetime1);
              } else {
                var8 = this.field_d.field_b * 6 + var6 * 4;
                var9 = Math.abs(var5 - var8);
                if (2 * this.field_d.field_b <= var9) {
                  if (var9 < 6 * this.field_d.field_b) {
                    var10 = (6 * this.field_d.field_b - var9) * 256 / (this.field_d.field_b * 4);
                    hn.field_c.a(25 + var3, (-hn.field_c.field_w + qg.field_l[this.field_a]) / 2 + var4Lifetime1, var10);
                  }
                } else {
                  hn.field_c.a(var3 + 25, var4Lifetime1 + (qg.field_l[this.field_a] - hn.field_c.field_w) / 2, 256);
                }
              }
            }
          }
        }
        if (this.field_a != 6 &&
          this.field_a != 7) {
          if (this.field_a == 8) {
            this.j(-8);
          } else if (this.field_a == 5) {
            this.c((byte) -23);
          } else if (this.field_a == 10) {
            this.e((byte) 80);
          }
        } else {
          this.a(this.b(false), param0, 7552);
        }
    }

    private final void e(byte param0) {
        gf.a(kc.field_m);
        gf.a();
        int var2 = re.a(0, 32, on.field_c, 320, 0);
        int var3 = 200;
        int var4 = this.b(false) - (var2 - this.c(32) >> 1);
        int var5 = -48 + this.h(-104) - var3;
        if (param0 < 39) {
          return;
        }
        if (var2 > 20) {
          ga.a(var3, var5, var4, (byte) -112, var2);
        }
        if (on.field_c == 32) {
          gf.d(var4 + 8, 8 + var5, var2 + (var4 - 8), var3 + (var5 - 8));
          mp.field_b.c(wc.field_b, (var2 >> 1) + var4, mp.field_b.field_J + 10 + var5, 2805974, -1);
          rs.field_Cb.a(oi.field_c, 10 + var4, mp.field_b.field_J + (var5 + 10), -20 + var2, -mp.field_b.field_J + (-30 + var3), 2805974, -1, 1, 1, rs.field_Cb.field_J);
        }
        gf.b(kc.field_m);
    }

    private final void a(int param0, boolean param1, int param2, boolean param3) {
        int discarded$0 = 0;
        int discarded$1 = 0;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_17_1 = false;
        int var5;
        String var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        var5 = qg.field_p[this.field_a][param0];
        if (param3) {
          this.field_d = (np) null;
        }
        var6 = this.c(-22609, var5);
        stackIn_5_0 = (param1) ? 2805974 : 2458760;
        var7 = stackIn_5_0;
        var8 = qg.field_l[this.field_a];
        var9 = this.b(param0, true);
        var10 = this.c(param0, true);
        if (21 != var5 &&
          var5 != 22) {
          mp.field_b.d(var6, var9, var10 + mp.field_b.field_J, var7, -1, param2);
        } else {
          mp.field_b.d(var6, var9, mp.field_b.field_J + var10, var7, -1, param2);
          var9 = var9 + hg.field_t;
          gf.d(var9, var10 + (var8 / 2 - 1), 121, 2, var7, param2);
          if (var5 == 21) {
            stackIn_11_0 = tf.field_p * 120 / 256;
          } else {
            stackIn_11_0 = wm.field_b * 120 / 256;
          }
          var11 = stackIn_11_0;
          gf.d(-1 + (var9 + var11), 3 + var10, 3, -6 + var8, var7, param2);
        }
        if (param0 == this.field_g) {
          stackIn_17_1 = !(param3);
          discarded$0 = this.a(stackIn_17_1, param0);
          discarded$1 = this.b(10);
        }
    }

    private final void a(int param0, String param1, int param2, int param3, int param4, int param5, int param6, byte param7, int param8, int param9) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var11_int = 0;
        RuntimeException var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var11_int = param0 + param4;
          if (param2 <= param8) {
            gf.f(param2, var11_int, 1 + (-param2 + param8), param9);
          } else {
            gf.f(param8, var11_int, 1 + (-param8 + param2), param9);
          }
          var12 = param2 + param8 >> 1;
          if (var12 >= param5) {
            gf.f(param5, param3, -param5 + var12, param9);
          } else {
            gf.f(var12, param3, -var12 + param5, param9);
          }
          if (0 >= param0) {
            gf.j(param8, var11_int, -param0, param9);
            gf.j(param2, var11_int, -param0, param9);
          } else {
            gf.j(param8, param4, param0, param9);
            gf.j(param2, param4, param0, param9);
          }
          if (param3 > var11_int) {
            gf.j(var12, var11_int, param3 - var11_int, param9);
          } else {
            gf.j(var12, param3, var11_int - param3, param9);
          }
          var13 = wk.a(-9615, param1, rs.field_Cb, new int[]{param6});
          if (param7 != 62) {
            return;
          }
          param4 = -(rs.field_Cb.field_J * var13 >> 1) + param3;
          rs.field_Cb.a(param1, 5 + param5, param4, param6, var13 * rs.field_Cb.field_J + rs.field_Cb.field_q, param9, -1, 0, 0, rs.field_Cb.field_J);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11 = decompiledCaughtException;
          stackIn_19_0 = var11;
          stackIn_19_1 = new StringBuilder().append("sm.UA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    private final void a(String param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var11_int = 0;
        String var13 = null;
        String var12 = null;
        String var14 = null;
        String var15 = null;
        String var16 = null;
        String var17 = null;
        String var12Lifetime1;
        String var12Lifetime2;
        try {
          var11_int = param1 - (-param9 - param5);
          if (var11_int != 0) {
            param5 = (200 * param5 + var11_int) / (2 * var11_int);
            param1 = (param1 * 200 + var11_int) / (var11_int * 2);
            param9 = (200 * param9 + var11_int) / (var11_int * 2);
          }
          if (-1 != param7) {
            var13 = 1 + param7 + ".";
            rs.field_Cb.b(var13, 15 + (vn.field_r[0] + param4), param6, param8, -1);
          }
          var12 = param0;
          rs.field_Cb.d(var12, param4 - (-vn.field_r[0] - 20), param6, param8, -1);
          var14 = Integer.toString(param3);
          rs.field_Cb.c(var14, param4 + vn.field_r[1], param6, param8, -1);
          var15 = var11_int >= 50 ? "50+" : Integer.toString(var11_int);
          var12Lifetime1 = var15;
          rs.field_Cb.c(var15, vn.field_r[2] + param4, param6, param8, -1);
          var12Lifetime2 = param1 + "%";
          if (param2 >= -116) {
            this.a(-46, (byte) -46, 11, -112, -101, -46, -96);
          }
          rs.field_Cb.c(var12Lifetime2, param4 + vn.field_r[3], param6, param8, -1);
          var16 = param9 + "%";
          rs.field_Cb.c(var16, param4 + vn.field_r[4], param6, param8, -1);
          var17 = param5 + "%";
          rs.field_Cb.c(var17, vn.field_r[5] + param4, param6, param8, -1);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "sm.Q(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    final void c(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        double var7;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_9_2 = 0;
        if (ce.field_x != null ||
          null != in.field_g) {
          oa.a(480, 0, 640, (byte) -126, 0);
        }
        var4 = this.c(32);
        var5 = this.h(-123);
        var6 = this.b((byte) -98);
        if (param1 != -6469) {
          return;
        }
        var7 = wm.a(param2, (byte) 99, 128);
        var9 = (640 - var4) / 2;
        var10 = (int)((double)(qg.field_r[this.field_a] + 80) * (1.0 - var7));
        var11 = var9;
        var12 = 20 + var4;
        var13 = var5 - 10;
        var14 = var6 + 10;
        ga.a(var14, var13, var11, (byte) -73, var12);
        gf.a(s.field_f);
        var15 = var10 + (var9 - 20);
        var16 = var12 + var11;
        stackIn_8_0 = var11;
        stackIn_8_1 = var13;
        stackIn_9_2 = (var15 < var16) ? var15 : var16;
        gf.d(stackIn_8_0, stackIn_8_1, stackIn_9_2, var14 + var13);
        this.e(var5, param1 + 14372);
        gf.d(var11, var13, var11 + var12, var14 + var13);
        mj.field_Hb[param0].e(var5, 7903);
        gf.b(s.field_f);
    }

    private final void c(byte param0) {
        String discarded$0 = null;
        int var12 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        String var8;
        String[] var9;
        int[] var10;
        int var11;
        String var13;
        int var14;
        int var7Lifetime1;
        int var6Lifetime1;
        int var6Lifetime1Lifetime1;
        var14 = ShatteredPlansClient.field_F ? 1 : 0;
        gf.a(kc.field_m);
        gf.a();
        if (param0 != -23) {
          discarded$0 = this.c(72, -48);
        }
        if (w.d(true)) {
          this.d(param0 ^ -21);
          return;
        }
        if (ri.field_I == null) {
          ri.field_I = kf.a((byte) 85, 0, 7, 10);
        }
        var2 = re.a(0, 32, nb.field_a, 560, param0 ^ -23);
        var3 = 200;
        var4 = this.b(false) - (-this.c(32) + var2 >> 1);
        var5 = this.h(param0 - 71) - var3 - 24;
        if (var2 > 20) {
          ga.a(var3, var5, var4, (byte) -109, var2);
        }
        L3: {
          gf.d(var4 + 8, 8 + var5, var2 + (var4 - 8), -8 + (var3 + var5));
          var6 = 2805974;
          var7 = 16 + var5 + rs.field_Cb.field_J;
          rs.field_Cb.c(bh.field_r, vn.field_r[1] + var4, var7, var6, -1);
          rs.field_Cb.c(un.field_j, vn.field_r[2] + var4, var7, var6, -1);
          rs.field_Cb.c(ld.field_q, var4 + vn.field_r[3], var7, var6, -1);
          rs.field_Cb.c(hc.field_c, vn.field_r[4] + var4, var7, var6, -1);
          rs.field_Cb.c(eo.field_X, vn.field_r[5] + var4, var7, var6, -1);
          var7 += 24;
          if (!ri.field_I.field_q) {
            var8 = ea.field_d;
          } else {
            if (null != ri.field_I.field_n) {
              var8 = ne.field_q;
              var9 = ri.field_I.field_n[ff.field_y];
              var10 = ri.field_I.field_m[ff.field_y];
              var11 = 0;
              for (var12 = 0; var12 < 10; var12++) {
                if (null != var9[var12]) {
                  var6Lifetime1 = 2805974;
                  var13 = var9[var12];
                  if (jp.a(var13, (byte) -105)) {
                    var11 = 1;
                    var6Lifetime1 = 16777215;
                  }
                  this.a(var13, var10[1 + var12 * 4], (byte) -128, var10[4 * var12], var4, var10[2 + 4 * var12], var7, var12, var6Lifetime1, var10[3 + 4 * var12]);
                  var8 = "";
                }
                var7 += 15;
              }
              if (((var11 == 0)) &&
                (!(ri.field_I.field_h + ri.field_I.field_i + ri.field_I.field_r <= 0))) {
                var6Lifetime1Lifetime1 = 2805974;
                this.a(ln.field_o, ri.field_I.field_i, (byte) -120, ri.field_I.field_l, var4, ri.field_I.field_r, var7, -1, var6Lifetime1Lifetime1, ri.field_I.field_h);
              }
              break L3;
            }
            var8 = wj.field_k;
          }
        }
        var7Lifetime1 = (rs.field_Cb.field_J + var3 >> 1) + var5;
        rs.field_Cb.c(var8, var4 + (var2 >> 1), var7Lifetime1, 2805974, -1);
        gf.b(kc.field_m);
        return;
    }

    private final void d(int param0) {
        int var2 = 420;
        if (param0 != 2) {
          this.a(-30, 106, 23);
        }
        int var3 = re.a(0, 32, nb.field_a, var2, 0);
        int var4 = 80;
        int var5 = this.b(false) - (var3 - this.c(32) >> 1);
        int var6 = -60 + this.h(-122) - var4 - 48;
        if (var3 > 20) {
          ga.a(var4, var6, var5, (byte) -124, var3);
        }
        gf.d(8 + var5, 8 + var6, var5 + var3 - 8, -8 + var6 + var4);
        rs.field_Cb.c(fr.field_D, 320, (rs.field_Cb.field_J + var4 >> 1) + var6, 16777215, -1);
        gf.b(kc.field_m);
    }

    final void a(int param0, byte param1, boolean param2) {
        int var4 = 0;
        int var5;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        if (-1 != this.field_d.field_c) {
          param0 = this.field_d.field_c;
        }
        if (this.field_a == 11) {
          param0 = 1;
        }
        if (this.field_a == 8 &&
          oe.field_e &&
          ur.field_zb == null) {
          ur.field_zb = vs.a((byte) 88, 4);
        }
        this.field_d.a(this.a(bb.field_b, (byte) -109, pd.field_k), param0, param2, 59);
        this.field_h = 0;
        an.field_c = -1;
        if (param1 <= 14) {
          this.e((byte) -50);
        }
        qd.field_e = -1;
        this.field_g = -1;
        qg.field_q = cl.field_n;
        for (var4 = 1; 6 > var4; var4++) {
          ln.field_H[var4] = 0;
        }
        o.field_s = 0;
        if (this.field_a == 8) {
          up.field_d = 0;
        }
        ne.field_o = -1;
        nc.field_t = 24;
        ln.field_H[0] = 24;
        if (cb.field_i == null && (6 == this.field_a ||
          this.field_a == 7)) {
          hd.c(false);
        }
    }

    private final void a(int param0, int param1, boolean param2) {
        int discarded$2 = 0;
        int discarded$3 = 0;
        int var4;
        String var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        if (param1 >= -34) {
          field_b = 112;
        }
        var4 = qg.field_p[this.field_a][param0];
        var5 = this.c(-22609, var4);
        stackIn_5_0 = (!param2) ? 2458760 : 2805974;
        var6 = stackIn_5_0;
        var7 = qg.field_l[this.field_a];
        var8 = this.b(param0, true);
        var9 = this.c(param0, true);
        if (var4 != 21 &&
          var4 != 22) {
          mp.field_b.d(var5, var8, mp.field_b.field_J + var9, var6, -1);
        } else {
          mp.field_b.d(var5, var8, var9 + mp.field_b.field_J, var6, -1);
          var8 = var8 + hg.field_t;
          gf.b(var8, -1 + (var9 + var7 / 2), 121, 2, var6);
          if (21 == var4) {
            stackIn_11_0 = tf.field_p * 120 / 256;
          } else {
            stackIn_11_0 = 120 * wm.field_b / 256;
          }
          var10 = stackIn_11_0;
          gf.b(var10 + (var8 - 1), 3 + var9, 3, -6 + var7, var6);
        }
        if (param0 == this.field_g) {
          discarded$2 = this.a(true, param0);
          discarded$3 = this.b(10);
        }
    }

    private final void a(boolean param0) {
        int fieldTemp$1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var2Lifetime1;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        int fieldTemp$0 = le.field_b + 1;
        le.field_b = le.field_b + 1;
        if (32 < fieldTemp$0) {
          le.field_b = 32;
        }
        if (!param0) {
          field_c = (String) null;
        }
        for (var2 = 0; jd.field_j.length > var2; var2++) {
          if (var2 != qd.field_e &&
            an.field_c != var2) {
            ql.field_o[var2] = null;
            tr.field_sb[var2] = null;
          }
        }
        if (ek.field_A != 0) {
          fieldTemp$1 = ek.field_A + 1;
          ek.field_A = ek.field_A + 1;
          if (32 <= fieldTemp$1) {
            up.field_d = q.field_Bb;
            ek.field_A = 0;
          }
        }
        if (an.field_c == -1) {
          stackIn_21_0 = qd.field_e;
        } else {
          stackIn_21_0 = an.field_c;
        }
        var2Lifetime1 = stackIn_21_0;
        if (var2Lifetime1 == -1) {
          stackIn_24_0 = 0;
        } else {
          stackIn_24_0 = 32 + 16 * nd.field_d[var2Lifetime1];
        }
        var3 = stackIn_24_0;
        if (var2Lifetime1 == 24) {
          stackIn_28_0 = ((1 << var2Lifetime1 & vq.field_a) == 0) ? 0 : 1;
          var4 = stackIn_28_0;
          if (var4 == 0) {
            stackIn_31_0 = 0;
          } else {
            stackIn_31_0 = 32 + 16 * nd.field_d[var2Lifetime1];
          }
          var3 = stackIn_31_0;
        }
        if (q.field_Bb != var3) {
          if (ek.field_A != 0) {
            up.field_d = re.a(up.field_d, 32, ek.field_A, q.field_Bb, 0);
          }
          ek.field_A = 1;
          q.field_Bb = var3;
        }
    }

    private final int a(int param0, boolean param1) {
        int discarded$0 = 0;
        int var3 = qg.field_p[this.field_a][param0];
        if (param1) {
          discarded$0 = this.a(-113, (byte) 1, 62);
        }
        if (var3 == 21 ||
          22 == var3) {
          return 120 + hg.field_t;
        }
        return mp.field_b.c(this.c(-22609, var3));
    }

    private final void a(int param0, boolean param1, int param2, int param3) {
        String var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        om var10_ref_om;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16_int;
        int var17_int;
        int var18_int;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var30;
        Object var31;
        String var32;
        String var33;
        bi var34;
        bi var35;
        String var36;
        String var37;
        String var38;
        String var39;
        String var40;
        String var41;
        om var45;
        int stackIn_55_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_99_0 = 0;
        bi var9_ref_bi;
        String[] var16;
        String var17;
        String var18;
        int var26;
        int var27;
        int var28;
        int var29;
        String var42;
        String var43;
        String var44;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var13Lifetime1;
        int var13Lifetime2;
        int var16_intLifetime1;
        int var16_intLifetime2;
        int var17_intLifetime1;
        int var17_intLifetime2;
        int var18_intLifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var22Lifetime1;
        int var23Lifetime1;
        int var24Lifetime1;
        int var25Lifetime1;
        int var29Lifetime1;
        int var29Lifetime2;
        String var17Lifetime1;
        String var17Lifetime2;
        String var18Lifetime1;
        int var19Lifetime2;
        int var20Lifetime2;
        int var21Lifetime2;
        int var9Lifetime3Lifetime1;
        int var9Lifetime3Lifetime2;
        int var9Lifetime3Lifetime3;
        int var10Lifetime2Lifetime1;
        int var10Lifetime2Lifetime2;
        int var10Lifetime3Lifetime1;
        int var10Lifetime3Lifetime2;
        int var10Lifetime3Lifetime3;
        int var10Lifetime3Lifetime4;
        int var19Lifetime1Lifetime1;
        int var20Lifetime1Lifetime1;
        int var21Lifetime1Lifetime1;
        int var21Lifetime1Lifetime2;
        int var20Lifetime2Lifetime1;
        var31 = null;
        var30 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!param1) {
          this.a(12, (byte) -40, false);
        }
        var6 = -60 + qg.field_r[this.field_a];
        var7 = -50 + qg.field_t[this.field_a];
        var8 = 1 + rs.field_Cb.field_J * 3 / 4;
        if (param2 != 0) {
          if (param2 != 1) {
            if (param2 != 2) {
              if (param2 == 3) {
                if (ai.field_e == 1) {
                  param3 -= 5;
                }
                jm.field_r.c(5 + param3, 5 + param0);
                var9 = param3 + 345;
                var10 = 120;
                this.a(0, gp.field_a, 5 + (param3 + 315), 8 + param0, param0 + 8, var9, var10, (byte) 62, 315 + (param3 + 5), 16711680);
                this.a(16711680, 25 + param0, var9, 25 + param0, lr.field_f, 5, var10, param0 + 25, (byte) 110, 315 + param3 + 5);
                this.a(16711680, 78 + (5 + param0), var9, 69 + param0, lh.field_u, 0, var10, 78 + param0 + 5, (byte) 110, param3 + 205);
                this.a(16711680, 95 + (5 + param0), var9, 5 + param0 + 110, eo.field_kb, 0, var10, param0 + 115, (byte) 110, 5 + (param3 + 195));
                this.a(16711680, param0 + 5 + 120, var9, param0 + 5 + 160, fi.field_h, 5, var10, 5 + (param0 + 200), (byte) 110, 5 + param3 + 86);
                return;
              }
              if (param2 == 4) {
                if (ai.field_e == 1) {
                  param3 -= 5;
                }
                var9Lifetime1 = 295 + param3;
                var10Lifetime1 = 220;
                var11 = 16711680;
                hb.field_d.c(param3 + 5, param0 + 5);
                this.a(var11, param0 + 5, var9Lifetime1, 5 + param0 + 14, md.field_K, 5, var10Lifetime1, 32 + param0 + 5, (byte) 110, 250 + param3);
                this.a(-5, nn.field_a, 139 + (5 + param3), 40 + param0 + 5, param0 + 85, var9Lifetime1, var10Lifetime1, (byte) 62, 5 + param3 + 139, var11);
                this.a(var11, 5 + (param0 + 130), var9Lifetime1, 70 + param0 + 5, pa.field_i, 5, var10Lifetime1, 100 + (5 + param0), (byte) 110, 188 + (5 + param3));
                this.a(var11, param0 + 130, var9Lifetime1, 95 + param0, kj.field_e, 10, var10Lifetime1, 5 + (param0 + 260), (byte) 110, param3 + 235);
                this.a(var11, 264 + param0 + 5, var9Lifetime1, 5 + (param0 + 110), ln.field_q, 25, var10Lifetime1, 5 + (param0 + 294), (byte) 110, 210 + (5 + param3));
                param0 += 150;
                var12 = 400;
                if (ai.field_e == 1) {
                  var12 = 390;
                }
                ai.a(true);
                gf.b(16 * var12 + em.field_c[0], ul.field_Db[0] + param0 * 16, 50, 7, h.field_s);
                rs.field_Cb.d(sk.field_i, var12 + 22, param0 + rs.field_Cb.field_J / 4, 16777215, -1);
                param0 += 40;
                gf.b(16 * var12 + em.field_c[0], ul.field_Db[0] + 16 * param0, 50, 7, h.field_s);
                gf.b(em.field_c[1] + 16 * var12, 16 * param0 + ul.field_Db[1], 50, 7, h.field_s);
                rs.field_Cb.d(pg.field_F, var12 + 22, rs.field_Cb.field_J / 4 + param0, 16777215, -1);
                param0 += 40;
                gf.b(16 * var12 + em.field_c[0], param0 * 16 + ul.field_Db[0], 50, 7, h.field_s);
                gf.b(em.field_c[2] + var12 * 16, ul.field_Db[2] + 16 * param0, 50, 7, h.field_s);
                gf.b(em.field_c[3] + var12 * 16, ul.field_Db[3] + param0 * 16, 50, 7, h.field_s);
                rs.field_Cb.d(vd.field_n, var12 + 22, param0 + rs.field_Cb.field_J / 4, 16777215, -1);
                param0 += 40;
                qk.field_y[0].b(var12 - 15, param0 - 15, 30, 30);
                var13 = cl.field_n % 104;
                if (4 < var13 &&
                  48 >= var13) {
                  qk.field_y[var13 / 4].c(var12 - 15, param0 - 15, 30, 30, 128);
                } else {
                  qk.field_y[12].c(-15 + var12, -15 + param0, 30, 30, 128);
                }
                rs.field_Cb.d(or.field_d[0], var12 + 22, param0 + rs.field_Cb.field_J / 4, 16777215, -1);
                return;
              }
              if (param2 == 5) {
                var9_ref_bi = new bi(80, 80);
                bs.a(var9_ref_bi, 90);
                bd.field_G.a(40, 40, cl.field_n % 25 * 200, 16384);
                cg.i(0);
                var9_ref_bi.d(param3 + 15, 8 + param0);
                var42 = er.field_n;
                var10Lifetime2 = rs.field_Cb.a(wg.field_e.a(5607, var42), param3 + 80, param0, -80 + var6, var7, 16777215, -1, 3, 0, var8);
                param0 = param0 + ((3 + var10Lifetime2 * 4) * var8 >> 2);
                var11Lifetime1 = cl.field_n % 200;
                eo.a(false, 68 + param0, param0 + 40, (byte) -51, var11Lifetime1, 55 + param3, param3);
                this.a(param0 + 40, var11Lifetime1, param3 + 55, false, 92, param3, param0 + 68, 0, false);
                var43 = ri.field_N;
                var10Lifetime2Lifetime1 = rs.field_Cb.a(wg.field_e.a(5607, var43), param3 + 80, param0, var6 - 80, var7, 16777215, -1, 3, 0, var8);
                param0 = param0 + ((4 * var10Lifetime2Lifetime1 + 3) * var8 >> 2);
                kj.field_f[cl.field_n % kj.field_f.length].f(5 + param3, 42 + param0);
                var44 = rk.field_n;
                var5 = var44;
                var10Lifetime2Lifetime2 = rs.field_Cb.a(wg.field_e.a(5607, var44), 80 + param3, param0, -80 + var6, var7, 16777215, -1, 3, 0, var8);
                param0 = param0 + ((3 + var10Lifetime2Lifetime2 * 4) * var8 >> 2);
                return;
              }
              if (param2 == 6) {
                var45 = (om) (fj.field_p);
                var10_ref_om = var45.h();
                var10_ref_om.f();
                var11Lifetime2 = cl.field_n % 200;
                var12Lifetime1 = param3 + 35;
                var13Lifetime1 = param0 + 40;
                if (var11Lifetime2 < 170) {
                  gf.b(var12Lifetime1, var13Lifetime1, 30, 16777215);
                  gf.c(var12Lifetime1, var13Lifetime1, 30, 16777215, 92);
                  ie.a(var10_ref_om, var10_ref_om.field_z << 3, var10_ref_om.field_w << 3, var12Lifetime1 * 16, var13Lifetime1 * 16, 0, 4096);
                  gf.c(var12Lifetime1, var13Lifetime1, 9, 0, 92);
                  di.field_i[0].f(-(di.field_i[0].field_z / 2) + 30 + var12Lifetime1, var13Lifetime1 - di.field_i[0].field_w / 2);
                  di.field_i[1].f(var12Lifetime1 - 30 - di.field_i[0].field_z / 2, var13Lifetime1 - di.field_i[0].field_w / 2);
                  di.field_i[2].f(var12Lifetime1 - di.field_i[0].field_z / 2, 30 + (var13Lifetime1 - di.field_i[0].field_w / 2));
                  var14 = 4;
                  if (120 <= var11Lifetime2) {
                    var14 = 1;
                  } else {
                    var15 = (-80 + var11Lifetime2) / 20;
                    if (var15 < 0) {
                      var15 = -var15;
                    }
                    if (var11Lifetime2 >= 80) {
                      var15++;
                    }
                    var14 = var14 - var15;
                    if (0 == var14) {
                      var14 = 1;
                    }
                  }
                  rs.field_Cb.c(Integer.toString(var14), var12Lifetime1, 4 + var13Lifetime1, 16777215, -1);
                  if (var11Lifetime2 / 20 > 0 &&
                    var11Lifetime2 / 20 < 4 &&
                    var11Lifetime2 % 20 < 3) {
                    gf.b(var12Lifetime1 + 30, var13Lifetime1, di.field_i[0].field_z / 2, 16777215);
                  }
                  if (var11Lifetime2 / 20 > 3 &&
                    var11Lifetime2 / 20 < 7 &&
                    var11Lifetime2 % 20 < 3) {
                    gf.b(-30 + var12Lifetime1, var13Lifetime1, di.field_i[1].field_z / 2, 16777215);
                  }
                  if (var11Lifetime2 > 160 &&
                    var11Lifetime2 < 165) {
                    gf.b(var12Lifetime1, 30 + var13Lifetime1, di.field_i[2].field_z / 2, 16777215);
                  }
                }
                var32 = da.field_a;
                var14 = rs.field_Cb.a(wg.field_e.a(5607, var32), 80 + param3, param0, var6 - 80, var7, 16777215, -1, 3, 0, var8);
                param0 = param0 + (var8 * (3 + 4 * var14) >> 2);
                var15 = cl.field_n % 50;
                if (var15 >= 25) {
                  var15 -= 25;
                  var15 = var15 * ((614400 - 16384 * var15) * var15) / 15625;
                } else {
                  var15 = 0;
                }
                for (var16_int = 0; var16_int < 6; var16_int++) {
                  var17_int = (-var15 + var16_int * 8192) / 6;
                  var18_int = (20 * je.a(var17_int, (byte) -104) >> 12) + (param3 + 35 << 4);
                  var19 = (20 * oh.b(var17_int, -122) >> 12) + (40 + param0 << 4);
                  gf.b(var18_int, var19, 64, 255, vj.field_F);
                }
                for (var16_intLifetime1 = 0; var16_intLifetime1 < 10; var16_intLifetime1++) {
                  gf.f(-(var16_intLifetime1 >> 1) + (param3 + 36), var16_intLifetime1 + param0 + 30, -2 & var16_intLifetime1, 16777215);
                }
                var33 = er.field_l;
                var14 = rs.field_Cb.a(wg.field_e.a(5607, var33), param3 + 80, param0, -80 + var6, var7, 16777215, -1, 3, 0, var8);
                param0 = param0 + (var8 * (3 + var14 * 4) >> 2);
                var16_intLifetime2 = cl.field_n / 100 % 3;
                var17_intLifetime1 = cl.field_n % 100;
                var18_intLifetime1 = 0;
                if (var17_intLifetime1 > 20 &&
                  var17_intLifetime1 < 40) {
                  if (var17_intLifetime1 > 30) {
                    stackIn_55_0 = 1000 - var17_intLifetime1 * 25;
                  } else {
                    stackIn_55_0 = -500 + 25 * var17_intLifetime1;
                  }
                  var18_intLifetime1 = stackIn_55_0;
                }
                if (var17_intLifetime1 >= 21) {
                  if (80 >= var17_intLifetime1) {
                    stackIn_61_0 = 256;
                  } else {
                    stackIn_61_0 = 12 * (100 - var17_intLifetime1);
                  }
                } else {
                  stackIn_61_0 = 12 * var17_intLifetime1;
                }
                var17_intLifetime2 = stackIn_61_0;
                if (var16_intLifetime2 != 0) {
                  if (1 == var16_intLifetime2) {
                    var34 = new bi(var10_ref_om.field_z + 20, var10_ref_om.field_w);
                    bs.a(var34, 83);
                    var20 = 0;
                    for (var21 = 0; 5 > var21; var21++) {
                      var10_ref_om.f(var20, 0);
                      var20 += 5;
                    }
                    cg.i(0);
                    var34.c(param3 + 7, param0 + 15, var17_intLifetime2);
                    var34.c(param3 + 7, 15 + param0, var18_intLifetime1);
                  } else {
                    if (var16_intLifetime2 == 2) {
                      var35 = new bi(var10_ref_om.field_z + 30, var10_ref_om.field_w);
                      bs.a(var35, 123);
                      var20 = 0;
                      var21 = 0;
                      while (var21 < 10) {
                        ie.a(var10_ref_om, 8 * var10_ref_om.field_z, var10_ref_om.field_w * 8, (var20 + var10_ref_om.field_z / 4) * 16, 4 * var10_ref_om.field_w, 0, 2048);
                        ie.a(var10_ref_om, 8 * var10_ref_om.field_z, var10_ref_om.field_w * 8, 16 * (var20 + var10_ref_om.field_z / 4), var10_ref_om.field_w * 12, 0, 2048);
                        var21++;
                        var20 += 5;
                      }
                      cg.i(0);
                      var35.c(param3 + 3, 15 + param0, var17_intLifetime2);
                      var35.c(param3 + 3, param0 + 15, var18_intLifetime1);
                    }
                  }
                } else {
                  var10_ref_om.c(15 + param3, param0 + 15, var17_intLifetime2);
                  var10_ref_om.c(15 + param3, param0 + 15, var18_intLifetime1);
                }
                var36 = fr.field_F;
                var14 = rs.field_Cb.a(wg.field_e.a(5607, var36), 80 + param3, param0, var6 - 80, var7, 16777215, -1, 3, 0, var8);
                param0 = param0 + (var8 * (3 + var14 * 4) >> 2);
                if (null != oo.field_b) {
                  var19Lifetime2 = cl.field_n % 50;
                  for (var20Lifetime2 = 0; 5 > var20Lifetime2; var20Lifetime2++) {
                    oo.field_b[var20Lifetime2] = re.a(er.field_q[var20Lifetime2], 50, var19Lifetime2, fg.field_c[var20Lifetime2], 0);
                  }
                  var20Lifetime2Lifetime1 = param3 + 10;
                  var21Lifetime2 = oo.field_b[0] + (10 + param0);
                  for (var22 = 1; var22 < 5; var22++) {
                    for (var23 = 0; var23 < 10; var23++) {
                      var24 = var22 * 10 + (param3 + var23);
                      var25 = 10 + param0 + re.a(oo.field_b[-1 + var22], 10, var23, oo.field_b[var22], 0);
                      gf.g(var20Lifetime2Lifetime1, var21Lifetime2, var24, var25, 12632256);
                      var21Lifetime2 = var25;
                      var20Lifetime2Lifetime1 = var24;
                    }
                  }
                }
                gf.j(9 + param3, param0 + 10, 35, 16777215);
                gf.f(param3 + 10, param0 + 44, 40, 16777215);
                var37 = ub.field_Cb;
                var14 = rs.field_Cb.a(wg.field_e.a(5607, var37), param3 + 80, param0, var6 - 80, var7, 16777215, -1, 3, 0, var8);
                param0 = param0 + (var8 * (var14 * 4 + 3) >> 2);
                return;
              }
              if (param2 == 7) {
                var9Lifetime2 = cl.field_n % 200;
                var10Lifetime3 = rs.field_Cb.a(wg.field_e.a(5607, jl.field_N), param3, param0, var6, var7, 16777215, -1, 3, 0, var8);
                param0 = param0 + ((2 * var10Lifetime3 + 3) * var8 >> 1);
                var11Lifetime3 = param0;
                var12Lifetime2 = param3 + 125;
                var13Lifetime2 = param3 + 325;
                var14 = 150;
                var15 = 125;
                var16 = new String[16];
                var17 = wg.field_e.a(5607, ph.field_d);
                var18 = wg.field_e.a(5607, jb.field_h);
                var19Lifetime1 = rs.field_Cb.a(var17, new int[]{var14}, var16);
                var20Lifetime1 = rs.field_Cb.a(var18, new int[]{var15}, var16);
                stackIn_96_0 = (var20Lifetime1 < var19Lifetime1) ? var19Lifetime1 : var20Lifetime1;
                var10Lifetime3Lifetime1 = stackIn_96_0;
                var10Lifetime3Lifetime2 = 3;
                var21Lifetime1 = var8 + var8 * var10Lifetime3Lifetime2;
                rs.field_Cb.a(var17, var12Lifetime2, var11Lifetime3, var14, var21Lifetime1, 16777215, -1, 0, 1, var8);
                rs.field_Cb.a(var18, var13Lifetime2, var11Lifetime3, var15, var21Lifetime1, 16777215, -1, 0, 1, var8);
                eo.a(false, param0 + 25, 25 + param0, (byte) 120, var9Lifetime2, param3 + 100, param3);
                this.a(param0 + 25, var9Lifetime2, param3 + 100, false, 92, param3, 25 + param0, 8, true);
                var22Lifetime1 = (50 + cl.field_n) % 800 / 200;
                this.a(param3 + 295, 16, var22Lifetime1, (var21Lifetime1 >> 1) + var11Lifetime3, (byte) -70, (cl.field_n + 50) % 200);
                var11Lifetime3 = var11Lifetime3 + (rs.field_Cb.field_J + var21Lifetime1);
                var17Lifetime1 = wg.field_e.a(5607, tb.field_b);
                var18Lifetime1 = wg.field_e.a(5607, wq.field_c);
                var19Lifetime1Lifetime1 = rs.field_Cb.a(var17Lifetime1, new int[]{var14}, var16);
                var20Lifetime1Lifetime1 = rs.field_Cb.a(var18Lifetime1, new int[]{var15}, var16);
                stackIn_99_0 = (var20Lifetime1Lifetime1 >= var19Lifetime1Lifetime1) ? var20Lifetime1Lifetime1 : var19Lifetime1Lifetime1;
                var10Lifetime3Lifetime3 = stackIn_99_0;
                var21Lifetime1Lifetime1 = var8 * var10Lifetime3Lifetime3 + var8;
                rs.field_Cb.a(var17Lifetime1, var12Lifetime2, var11Lifetime3, var14, var21Lifetime1Lifetime1, 16777215, -1, 0, 1, var8);
                rs.field_Cb.a(var18Lifetime1, var13Lifetime2, var11Lifetime3, var15, var21Lifetime1Lifetime1, 16777215, -1, 0, 1, var8);
                eo.a(false, 90 + param0, 90 + param0, (byte) 73, var9Lifetime2, param3 + 10, param3 + 110);
                this.a(90 + param0, var9Lifetime2, param3 + 10, true, 92, 110 + param3, 90 + param0, 4, true);
                this.a(param3 + 295, 16, -1, var11Lifetime3 + (var21Lifetime1Lifetime1 >> 1), (byte) -21, (100 + cl.field_n) % 200);
                var11Lifetime3 = var11Lifetime3 + (var8 + var21Lifetime1Lifetime1);
                var17Lifetime2 = wg.field_e.a(5607, of.field_a);
                var10Lifetime3Lifetime4 = rs.field_Cb.a(var17Lifetime2, new int[]{200}, var16);
                var21Lifetime1Lifetime2 = var10Lifetime3Lifetime4 * var8 + var8;
                if (40 > var21Lifetime1Lifetime2) {
                  var21Lifetime1Lifetime2 = 40;
                }
                rs.field_Cb.a(var17Lifetime2, var12Lifetime2, var11Lifetime3, 200, var21Lifetime1Lifetime2, 16777215, -1, 0, 1, var8);
                var23Lifetime1 = -(var9Lifetime2 / 24) + 15;
                var24Lifetime1 = -(var9Lifetime2 / 17) + 10;
                if (var24Lifetime1 < 0) {
                  var24Lifetime1 = 0;
                }
                var25Lifetime1 = 4 - var9Lifetime2 / 30;
                if (0 > var25Lifetime1) {
                  var25Lifetime1 = 0;
                }
                var26 = 80;
                var27 = 5;
                var28 = param3 + 18;
                var11Lifetime3 += 10;
                if (ai.field_e == 0) {
                  var11Lifetime3 += 20;
                }
                if (var9Lifetime2 < 0) {
                  return;
                }
                if (180 > var9Lifetime2) {
                  var29 = 4 * var26 / 15 + 2 * var27;
                  this.a(var28, (byte) 126, var26, var25Lifetime1, var29, 8421504, var11Lifetime3);
                  var28 += 30;
                  var29Lifetime1 = 2 * var27 + var26;
                  this.a(var28, (byte) 127, var26, var23Lifetime1, var29Lifetime1, df.field_k[0], var11Lifetime3);
                  var28 += 30;
                  var29Lifetime2 = 2 * var27 + 10 * var26 / 15;
                  this.a(var28, (byte) 126, var26, var24Lifetime1, var29Lifetime2, df.field_k[2], var11Lifetime3);
                }
                return;
              }
              if (8 == param2) {
                var38 = hs.field_g;
                var9Lifetime3 = rs.field_Cb.a(wg.field_e.a(5607, var38), param3 + 40, param0, var6 - 40, var7, 16777215, -1, 3, 0, var8);
                this.a(param3 + 15, 20, 0, param0 + (rs.field_Cb.field_J * (var9Lifetime3 * 2 + 1) >> 2), (byte) -15, cl.field_n % 200);
                param0 = param0 + ((3 + var9Lifetime3 * 4) * var8 >> 2);
                var39 = sp.field_b;
                var9Lifetime3Lifetime1 = rs.field_Cb.a(wg.field_e.a(5607, var39), param3 + 40, param0, -40 + var6, var7, 16777215, -1, 3, 0, var8);
                this.a(15 + param3, 20, 1, param0 + (rs.field_Cb.field_J * (1 + var9Lifetime3Lifetime1 * 2) >> 2), (byte) -71, (cl.field_n + 185) % 200);
                param0 = param0 + (var8 * (3 + 4 * var9Lifetime3Lifetime1) >> 2);
                var40 = jb.field_f;
                var5 = var40;
                var5 = var40;
                var9Lifetime3Lifetime2 = rs.field_Cb.a(wg.field_e.a(5607, var40), param3 + 40, param0, var6 - 40, var7, 16777215, -1, 3, 0, var8);
                this.a(15 + param3, 20, 2, (rs.field_Cb.field_J * (2 * var9Lifetime3Lifetime2 + 1) >> 2) + param0, (byte) -82, (170 + cl.field_n) % 200);
                var41 = ar.field_o;
                var5 = var41;
                var5 = var41;
                param0 = param0 + (var8 * (4 * var9Lifetime3Lifetime2 + 3) >> 2);
                var9Lifetime3Lifetime3 = rs.field_Cb.a(wg.field_e.a(5607, var41), 40 + param3, param0, var6 - 40, var7, 16777215, -1, 3, 0, var8);
                this.a(param3 + 15, 20, 3, ((var9Lifetime3Lifetime3 * 2 + 1) * rs.field_Cb.field_J >> 2) + param0, (byte) 90, (155 + cl.field_n) % 200);
                param0 = param0 + (var8 * (4 * var9Lifetime3Lifetime3 + 3) >> 2);
                return;
              }
              if (param2 != 9) {
                if (10 != param2) {
                  throw new RuntimeException();
                }
                var5 = df.field_m + ac.field_v;
              } else {
                var5 = dm.field_a;
              }
            } else {
              var5 = jd.field_a;
            }
          } else {
            var5 = ck.field_g;
          }
        } else {
          var5 = vc.field_e;
        }
        this.a(var8, -91, param0, param3, var6, 16777215, var7, rs.field_Cb, wg.field_e.a(5607, var5));
    }

    private final int a(boolean param0, int param1) {
        if (!param0) {
          this.field_f = true;
        }
        return this.b(false) + 65 + this.a(param1, false);
    }

    private final int f(int param0, int param1) {
        if (param0 != -20) {
          this.e((byte) 56);
        }
        return qg.field_l[this.field_a];
    }

    private final void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        int var10 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param5 >= 150) {
          return;
        }
        int var7 = param5;
        if (125 < var7) {
          var7 = -param5 + 150;
        }
        int var8 = 0;
        if (var7 >= 25) {
        } else {
          if (param5 <= 125) {
            var8 = re.a(param1, 25, param5, 0, 0);
          } else {
            var8 = re.a(0, 25, param5 - 125, -param1, 0);
          }
          param1 = re.a(param1 / 2, 25, var7, param1, 0);
        }
        int var9 = 103 / ((param4 - 25) / 40);
        if (param2 != -1) {
          co.field_p[param2].b(-param1 + param0, var8 + param3 - param1, 2 * param1, 2 * param1);
        } else {
          bd.field_G.a(15, var8 + param3, 8192 * param1 / bd.field_G.field_z, param0, 200 * (cl.field_n % 25));
        }
    }

    final void g(byte param0) {
        if (this.field_a == 5) {
          ri.field_I = null;
        }
        if (param0 <= 52) {
          sm.f(1);
        }
    }

    private final int b(int param0, int param1, int param2) {
        int var10 = 0;
        int stackIn_25_0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var11;
        int var12;
        int var13;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        var4 = 20 + (this.b(false) + qg.field_r[this.field_a]);
        var5 = 10 + this.h(-121);
        var6 = ln.field_H.length;
        if (param1 > var4) {
          return -1;
        }
        if (var4 - 16 > param1) {
          if (param1 < -34 + var4 &&
            param1 > -54 + var4) {
            if (var5 - 5 < param2 &&
              var5 + 17 > param2) {
              return -2;
            }
            if (-45 + (var5 + qg.field_t[this.field_a]) < param2 &&
              qg.field_t[this.field_a] + (var5 - 23) > param2) {
              return -3;
            }
          }
          return -1;
        }
        param1 = var4 - param1;
        var7 = -(var6 * 21) + 310;
        var8 = -12 % ((param0 - 41) / 43);
        var9 = nc.field_t;
        for (var10 = 0; var6 > var10; var10++) {
          var11 = ln.field_H[var10];
          if (var11 > 12) {
            var11 = 12;
          }
          if (var10 != -1 + var6) {
            if (var9 != 0) {
              stackIn_25_0 = var7 * var11 / var9;
            } else {
              stackIn_25_0 = 0;
            }
            var12 = stackIn_25_0;
            var7 = var7 - var12;
            var9 = var9 - var11;
            var12 += 21;
          } else {
            var12 = var7 + 16;
          }
          if (var6 - 1 != var10) {
            if (var5 + param1 <= param2 &&
              param2 < var5 + param1 + var12) {
              return var10;
            }
          } else {
            if (param2 >= param1 + var5 &&
              param2 < var5 + 32 + (-param1 + var12)) {
              return var10;
            }
          }
          var5 = var5 + var12;
        }
        return -1;
    }

    final void i(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!md.field_Q &&
          !is.field_a) {
          while (cc.$cfr$intArgs$e$296a4c2b494e(55)) {
            if (oq.field_j != 13) {
              this.k(23);
              if (this.field_d.field_c == -1) {
                continue;
              }
              this.a(false, this.field_d.field_c, false);
              continue;
            }
            if (1 != this.field_a &&
              this.field_a != 2 &&
              this.field_a != 3 &&
              this.field_a != 4) {
              if (vr.field_c == 9) {
                continue;
              }
              var2 = br.field_m;
              ta.a(0, var2, (byte) 96, false);
              continue;
            }
            ta.a(0, -1, (byte) 96, false);
          }
          if (this.field_a == 6 ||
            this.field_a == 7) {
            this.f((byte) 122);
          }
          if (this.field_a == 8) {
            this.a(-16084);
          }
          v.a((byte) -128);
          this.field_d.a(param0 ^ -2665, this.a(td.field_P, (byte) -109, nh.field_p), this.a(bb.field_b, (byte) -109, pd.field_k));
          if (this.field_d.field_c != -1) {
            this.a(true, this.field_d.field_c, false);
          }
        }
        if (param0 != 2664) {
          this.d(97, 114);
        }
        if (this.field_a == 6 ||
          this.field_a == 7) {
          this.d((byte) -70);
        }
        if (this.field_a == 8) {
          this.a(true);
        }
        this.field_h = this.field_h + 1;
        if (this.field_a == 10) {
          fieldTemp$0 = on.field_c + 1;
          on.field_c = on.field_c + 1;
          if (32 < fieldTemp$0) {
            on.field_c = 32;
          }
        }
        if (this.field_a == 5) {
          fieldTemp$1 = nb.field_a + 1;
          nb.field_a = nb.field_a + 1;
          if (fieldTemp$1 > 32) {
            nb.field_a = 32;
          }
        }
    }

    private final void a(int param0) {
        int discarded$0 = 0;
        int var2 = 0;
        qd.field_e = this.d(param0 + 16191, pd.field_k, bb.field_b);
        if (param0 != -16084) {
          discarded$0 = this.b(true);
        }
        if (je.field_d == 0) {
        } else {
          var2 = this.d(84, nh.field_p, td.field_P);
          if (var2 == an.field_c) {
            an.field_c = -1;
          } else {
            if (var2 != -1) {
              an.field_c = var2;
            }
          }
        }
    }

    private final int b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        if (vr.field_c != this.field_a &&
          this.field_a != gr.field_o) {
          return 0;
        }
        if (nh.a((byte) -124, vr.field_c) && nh.a((byte) -75, gr.field_o) &&
          vr.field_c != gr.field_o) {
          var2 = qg.field_p[vr.field_c].length * qg.field_l[vr.field_c] + (qg.field_t[vr.field_c] + 10);
          var3 = qg.field_t[gr.field_o] + qg.field_l[gr.field_o] * qg.field_p[gr.field_o].length + 10;
          return re.a(var2, 32, eh.field_Q, var3, 0);
        }
        if (param0 != -98) {
          this.field_h = -2;
        }
        return qg.field_l[this.field_a] * qg.field_p[this.field_a].length + qg.field_t[this.field_a] + 10;
    }

    private final void d(int param0, int param1) {
        int var3 = 0;
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        o.field_s = param1;
        pr.field_g = 0 != jn.field_b ? re.a(pr.field_g, 32, jn.field_b, ac.field_w, 0) : ac.field_w;
        ac.field_w = 0;
        if (param0 != 4) {
          this.a((String) null, -102, (byte) 82, -77, 35, 32, 13, -31, 45, 70);
        }
        for (var3 = 0; var3 < param1; var3++) {
          ac.field_w = ac.field_w + cb.field_i[var3];
        }
        jn.field_b = 1;
    }

    public static void f(int param0) {
        field_c = null;
        if (param0 != -25370) {
          sm.f(36);
        }
    }

    final void g(int param0) {
        if (null != ce.field_x ||
          in.field_g != null) {
          oa.a(480, 0, 640, (byte) -116, 0);
        }
        int var2 = this.c(32);
        int var3 = this.b((byte) -98);
        int var4 = this.h(-121);
        int var5 = (-var2 + 640) / 2;
        int var6 = var5;
        int var7 = 20 + var2;
        int var8 = var4 - 10;
        int var9 = var3 + 10;
        int var10 = 127 / ((param0 - 15) / 60);
        ga.a(var9, var8, var6, (byte) -72, var7);
        this.e(var4, 7903);
    }

    private final boolean a(byte param0, int param1) {
        if (param0 != 44) {
          return false;
        }
        return true;
    }

    private final void a(boolean param0, int param1, boolean param2) {
        int stackIn_92_0 = 0;
        int stackIn_92_1 = 0;
        boolean stackIn_93_3 = false;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var7Lifetime1;
        int var8Lifetime1;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param2) {
          field_e = true;
        }
        var4 = qg.field_p[this.field_a][param1];
        if (this.field_d.d(-1)) {
          this.b(param1, param0, var4, -32580);
        }
        boolean decompiledFrameRemainder0 = true;
        var6 = var4;
        if (var6 != 0 &&
          var6 != 30 &&
          var6 != 1 &&
          var6 != 2 && var6 != 8 && var6 != 25 && var6 != 23 && var6 != 5 && (var6 != 6 &&
          var6 != 9) && 4 != var6 && var6 != 7 && var6 != 10 && var6 != 11 && 12 != var6 && var6 != 13 && var6 != 14 && var6 != 15 && var6 != 16 && 17 != var6 && var6 != 18 && (var6 != 19 &&
          var6 != 24) && var6 != 26 && (var6 != 20 &&
          var6 != 27) && var6 != 28 && var6 != 29 && (var6 != 31 &&
          32 != var6)) {
          if (var6 == 21) {
            var5 = 0;
            if (this.field_d.a(-1) &&
              tf.field_p > 0) {
              js.a(0, 197126152);
              var5 = 1;
            }
            if (this.field_d.a(true) &&
              tf.field_p < 256) {
              var5 = 1;
              js.a(256, 197126152);
            }
            if (this.field_d.b((byte) -50)) {
              var6 = this.b(param1, true) + this.a(true, param1) + hg.field_t - 120 >> 1;
              var7 = pd.field_k - var6;
              var8 = 256 * var7 / 120;
              if (0 < var8) {
                if (var8 < 256) {
                  js.a(var8, 197126152);
                } else {
                  js.a(256, 197126152);
                }
              } else {
                js.a(0, 197126152);
              }
              var5 = 1;
            }
            if (this.field_d.c(-97) &&
              tf.field_p > 0) {
              var5 = 1;
              df.c(!param2);
            }
            if (this.field_d.f(-97) &&
              tf.field_p < 256) {
              var5 = 1;
              cc.f((byte) 124);
            }
            if (((var5 != 0)) && ((!(this.field_d.b((byte) -114)) ||
              !(cl.field_n <= qg.field_q)))) {
              qk.a(qc.field_w, 89);
              qg.field_q = 25 + cl.field_n;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (var6 == 22) {
              if (this.field_d.a(-1)) {
                ak.c(-68, 0);
              }
              if (this.field_d.a(true)) {
                ak.c(-61, 256);
              }
              if (this.field_d.b((byte) -73)) {
                stackIn_92_0 = -120;
                stackIn_92_1 = this.b(param1, true);
                stackIn_93_3 = !(param2);
                var6 = stackIn_92_0 + (stackIn_92_1 - (-this.a(stackIn_93_3, param1) - hg.field_t)) >> 1;
                var7Lifetime1 = pd.field_k - var6;
                var8Lifetime1 = 256 * var7Lifetime1 / 120;
                if (var8Lifetime1 <= 0) {
                  ak.c(127, 0);
                } else {
                  if (256 > var8Lifetime1) {
                    ak.c(-66, var8Lifetime1);
                  } else {
                    ak.c(127, 256);
                  }
                }
              }
              if (this.field_d.c(-97)) {
                qs.d(!param2);
              }
              if (this.field_d.f(-77)) {
                jn.a(11615);
              }
            }
          }
        }

    }

    private final void j(int param0) {
        int var26 = 0;
        int stackIn_5_0 = 0;
        bi stackIn_8_0 = null;
        bi stackIn_11_0 = null;
        bi stackIn_24_0 = null;
        bi stackIn_27_0 = null;
        int stackIn_42_0 = 0;
        int stackIn_48_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        bi var7;
        int var7_int;
        bi var8;
        int var9;
        bi var9_ref_bi;
        int var10;
        bi var10_ref_bi;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        String var21_ref_String;
        int var21;
        int var22;
        String var22_ref_String;
        int var23;
        int var24;
        int var25;
        int var27;
        bi var28;
        bi var29;
        bi var30;
        int var2Lifetime1;
        int var2Lifetime2;
        int var5Lifetime1;
        int var18Lifetime1;
        int var20Lifetime1;
        int var22Lifetime1;
        int var23Lifetime1;
        bi var8Lifetime1;
        bi var9_ref_biLifetime1;
        bi var8Lifetime2;
        var27 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = 52;
        var3 = 140;
        gf.a(kc.field_m);
        var4 = var2;
        gf.a();
        for (var6 = 0; var6 < 25; var6++) {
          var7_int = (int)(Math.cos((double)(-(23 * var6)) + 3.141592653589793 * (double)(2 * cl.field_n) / 150.0) * 64.0) + 64;
          stackIn_5_0 = ((1 << var6 & vq.field_a) == 0) ? 0 : 1;
          var5 = stackIn_5_0;
          if (var5 != 0) {
            stackIn_8_0 = df.a(var6, 32);
          } else {
            stackIn_8_0 = ed.field_b;
          }
          var28 = stackIn_8_0;
          var8 = var28;
          if (var5 == 0) {
            stackIn_11_0 = lq.field_o;
          } else {
            stackIn_11_0 = oi.a(var6, (byte) 66);
          }
          var29 = stackIn_11_0;
          var9_ref_bi = var29;
          if (le.field_b == 32) {
            if (an.field_c == var6) {
              if (var5 == 0) {
                stackIn_24_0 = n.field_k;
              } else {
                stackIn_24_0 = mr.a(var6, -106);
              }
              var8Lifetime2 = stackIn_24_0;
              if (var5 == 0) {
                stackIn_27_0 = pc.field_n;
              } else {
                stackIn_27_0 = jd.field_j[var6];
              }
              var30 = stackIn_27_0;
              var9_ref_biLifetime1 = var30;
              var10_ref_bi = new bi(48, 48);
              bs.a(var10_ref_bi, 112);
              var30.c(0, 0, 48, 48);
              cg.i(0);
              var8Lifetime2.c(var4 - 32, var3 - 32, 96, 96, var7_int << 1);
              var10_ref_bi.c(var4 - 8, -8 + var3, 256);
            } else {
              if (qd.field_e == var6) {
                if (-1 == an.field_c) {
                  var28.c(-16 + var4, var3 - 16, var7_int);
                  var29.c(var4, var3, 256);
                  var29.c(var4, var3, 128);
                } else {
                  var28.c(var4 - 16, var3 - 16, var7_int);
                  var29.c(var4, var3, 256);
                }
              } else {
                if (an.field_c == -1) {
                  var28.c(var4 - 16, var3 - 16, var7_int);
                  var29.c(var4, var3, 256);
                } else {
                  var28.c(var4 - 16, -16 + var3, var7_int >> 1);
                  var29.c(var4, var3, 128);
                }
              }
            }
          } else {
            var28.c(-16 + var4, var3 - 16, var7_int * le.field_b / 32);
            var29.c(var4, var3, (le.field_b << 8) / 32);
          }
          var4 += 42;
          if (12 == var6 % 13) {
            var3 = (int)((double)var3 + Math.sqrt(3.0) * 21.0);
            var4 = var2 + 21;
          }
        }
        if (gl.field_h == null) {
          gl.field_h = new bi(256, 256);
        }
        if (il.field_gb == null) {
          il.field_gb = new bi(256, 256);
        }
        if (an.field_c == -1) {
          stackIn_42_0 = qd.field_e;
        } else {
          stackIn_42_0 = an.field_c;
        }
        var6 = stackIn_42_0;
        if (var6 != -1) {
          stackIn_48_0 = ((vq.field_a & 1 << var6) != 0) ? 1 : 0;
        } else {
          stackIn_48_0 = 0;
        }
        var5Lifetime1 = stackIn_48_0;
        if (var5Lifetime1 == 0) {
          var7 = pc.field_n;
          var8Lifetime1 = n.field_k;
        } else {
          var7 = jd.field_j[var6];
          var8Lifetime1 = mr.a(var6, -94);
        }
        ra.a(-106);
        gl.field_h.e();
        gf.b();
        var7.b(0, 0, 256, 256);
        il.field_gb.e();
        var8Lifetime1.c(0, 0);
        cg.i(0);
        var9 = 64 + (int)(64.0 * Math.cos(3.141592653589793 * (double)(cl.field_n * 2) / 150.0));
        var10 = re.a(0, 32, le.field_b, 600, 0);
        var11 = 155;
        var12 = (640 - var10) / 2;
        var13 = 220;
        if (20 < var10) {
          ga.a(var11, var13, var12, (byte) -124, var10);
        }
        gf.d(10 + var12, var13, var12 + var10 - 10, var11 + var13);
        var14 = 98;
        var15 = (qg.field_m[this.field_a] >> 1) + 24;
        var16 = 128;
        var17 = 113 / ((87 - param0) / 34);
        gf.a(-(var16 >> 5) - (var16 >> 1) + var14, var15 + 6, var16 + (var16 >> 4), 136, 10, 0, 128);
        gf.f(-(var16 >> 1) + (var14 - (var16 >> 5)), 6 + var15, (var16 >> 4) + var16, 136, 10, ui.a(3974311, 0, -95, 128));
        il.field_gb.c(-var16 + var14, -54 + var15, var16 << 1, 256, var9);
        gl.field_h.c(var14 - (var16 >> 1), 10 + var15, var16, 128, 256);
        var18 = 350;
        var2Lifetime1 = 24 + this.b(false) + (this.c(32) + 16) - var18;
        var19 = 136;
        var20 = -var19 + (-34 + this.h(-110));
        gf.a(var2Lifetime1, var20, var18, var19, 10, 0, 128);
        gf.f(var2Lifetime1, var20, var18, var19, 10, ui.a(3974311, 0, -118, 128));
        if (-1 != var6 &&
          var6 != 24) {
          mp.field_b.d(ud.field_a[var6].toUpperCase(), var2Lifetime1 + 10, var20 + (6 + mp.field_b.field_J), 2805974, -1);
          var21_ref_String = "(" + re.a(af.field_e, 4371, new String[]{Integer.toString(ei.field_g[var6])}) + ")";
          var22 = rs.field_Cb.a(var21_ref_String, 10 + var2Lifetime1, 14 + (var20 + rs.field_Cb.field_J), var18 - 20, var19, 2805974, -1, 0, 0, rs.field_Cb.field_J);
          var22 = var22 + (1 + rs.field_Cb.a(ul.field_Qb[var6], 10 + var2Lifetime1, rs.field_Cb.field_J / 2 + var20 + (14 + (1 + var22) * rs.field_Cb.field_J), -20 + var18, var19, 2805974, -1, 0, 0, rs.field_Cb.field_J));
          rs.field_Cb.a(a.field_i, 10 + var2Lifetime1, var20 - (-14 - (var22 + 1) * rs.field_Cb.field_J), var18 - 20, var19, 2805974, -1, 0, 0, rs.field_Cb.field_J);
        } else {
          if (var6 == 24) {
            mp.field_b.d(ud.field_a[var6].toUpperCase(), var2Lifetime1 + 10, 6 + var20 + mp.field_b.field_J, 2805974, -1);
            if (var5Lifetime1 != 0) {
              var21_ref_String = "(" + re.a(af.field_e, 4371, new String[]{Integer.toString(ei.field_g[var6])}) + ")";
              var22_ref_String = ul.field_Qb[var6];
            } else {
              var21_ref_String = "(" + kj.field_i + "???)";
              var22_ref_String = ep.field_c;
            }
            var23 = rs.field_Cb.a(var21_ref_String, var2Lifetime1 + 10, 14 + (var20 + rs.field_Cb.field_J), -20 + var18, var19, 2805974, -1, 0, 0, rs.field_Cb.field_J);
            var23 = var23 + (1 + rs.field_Cb.a(var22_ref_String, 10 + var2Lifetime1, (var23 + 1) * rs.field_Cb.field_J + (var20 - (-14 - rs.field_Cb.field_J / 2)), var18 - 20, var19, 2805974, -1, 0, 0, rs.field_Cb.field_J));
            rs.field_Cb.a(a.field_i, var2Lifetime1 + 10, (var23 + 1) * rs.field_Cb.field_J + 14 + var20, -20 + var18, var19, 2805974, -1, 0, 0, rs.field_Cb.field_J);
          } else {
            if (!oe.field_e) {
              mp.field_b.d(me.field_c.toUpperCase(), var2Lifetime1 + 10, mp.field_b.field_J + (6 + var20), 2805974, -1);
              rs.field_Cb.a(rk.field_l, 10 + var2Lifetime1, var20 + 14 + rs.field_Cb.field_J, -20 + var18, var19, 2805974, -1, 0, 0, rs.field_Cb.field_J);
            } else {
              mp.field_b.d(ol.field_j.toUpperCase(), 10 + var2Lifetime1, var20 + 6 + mp.field_b.field_J, 2805974, -1);
              rs.field_Cb.a(li.field_c, 10 + var2Lifetime1, rs.field_Cb.field_J + var20 + 14, -20 + var18, var19, 2805974, -1, 0, 0, rs.field_Cb.field_J);
            }
          }
        }
        if (ek.field_A != 0) {
          var21 = re.a(up.field_d, 32, ek.field_A, q.field_Bb, 0);
        } else {
          var21 = q.field_Bb;
        }
        var21 = re.a(0, 32, le.field_b, var21, 0);
        if (var21 > 20) {
          var18Lifetime1 = 52;
          var2Lifetime2 = 89 + var14;
          var20Lifetime1 = -(var21 >> 1) + (var15 + 74);
          gf.a(var2Lifetime2, var20Lifetime1, var18Lifetime1, var21, 10, 0, 128);
          gf.f(var2Lifetime2, var20Lifetime1, var18Lifetime1, var21, 10, ui.a(3974311, 0, -122, 128));
          gf.d(4 + var2Lifetime2, 4 + var20Lifetime1, var18Lifetime1 + var2Lifetime2 - 4, -4 + var21 + var20Lifetime1);
          if (var6 != -1 && (var6 != 24 ||
            var5Lifetime1 != 0)) {
            var22Lifetime1 = nd.field_d[var6];
            if (var22Lifetime1 > 1) {
              var23Lifetime1 = var20Lifetime1 + 24;
              var24 = var21;
              if (var24 < 48) {
                var24 = 48;
              }
              var25 = var20Lifetime1 + var24 - 24;
              for (var26 = 0; var22Lifetime1 > var26; var26++) {
                cm.field_b.c(var2Lifetime2 + 10, var23Lifetime1 + (var26 * (var25 - var23Lifetime1) / (var22Lifetime1 - 1) - 16), 32, 32);
              }
            } else {
              cm.field_b.c(10 + var2Lifetime2, var20Lifetime1 + ((var21 >> 1) - 16), 32, 32);
            }
          }
        }
        gf.b(kc.field_m);
    }

    private final int b(int param0, boolean param1) {
        if (!param1) {
          return -70;
        }
        return this.b(false) + 65;
    }

    private final void k(int param0) {
        int var2;
        int var3;
        boolean stackIn_4_0 = false;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        if (oq.field_j == 1) {
          stackIn_4_0 = !(mm.field_n);
          mm.field_n = stackIn_4_0;
        }
        var2 = 85 / ((-27 - param0) / 45);
        if (2 == oq.field_j) {
          em.a(us.b(0), 1);
        }
        if (oq.field_j == 3) {
          em.a(dg.g(1), 1);
        }
        if (oq.field_j == 4) {
          em.a(mq.c((byte) 67), 1);
        }
        if (vr.field_c == 6) {
          this.e(170);
        } else {
          if (11 == vr.field_c) {
            this.field_d.e(85);
          } else {
            this.field_d.b(0);
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, nq param7, String param8) {
        int var12 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        String[] var11 = null;
        String var13 = null;
        int var14 = 0;
        int var15 = 0;
        String[] var16 = null;
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var16 = vi.a(param7, (byte) 119, param8, new int[]{param4});
          var11 = var16;
          for (var12 = 0; var12 < var11.length; var12++) {
            var13 = var11[var12];
            param2 = param2 + param0;
            var14 = param7.c(var13);
            if (4 * var14 >= param4 * 3) {
              param7.b(var13, param3, param2, param5, -1, param4);
            } else {
              param7.d(var13, param3, param2, param5, -1);
            }
          }
          if (param1 != -91) {
            this.a(106, true, 125, -94);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_12_0 = var10;
          stackIn_12_1 = new StringBuilder().append("sm.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param8 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6) {
        int var11 = 0;
        int var12 = 0;
        int[] var17 = null;
        int var8 = 20;
        int var9 = 5;
        int var10 = -77 % ((param1 - 63) / 63);
        jq.a(2 + var9, param5, 4 + var8, -2 + param6 + (param2 - param4), -2 + param0, (byte) -126, 4 + param4);
        if (0 < param3) {
          var11 = param2 * param3 / 15 + 2 * var9;
          gf.a(param0, param2 + (param6 - var11), var8, var11, var9, param5);
          var12 = var11 / 3;
          if (2 * var9 >= var12) {
            var12 = 1 + var9 * 2;
          }
          gf.b(param0, param2 + (param6 - var11), var8, var12, var9, 0, param5);
          var17 = new int[4];
          gf.a(var17);
          gf.d(param0, param6, param0 + var8, param2 + param6);
          ie.a(ii.field_q, param0, param6);
          gf.b(var17);
        }
        rs.field_Cb.c(Integer.toString(param3), var8 / 2 + param0, 10 + param6 + param2, 16777215, -1);
    }

    private final void a(int param0, byte param1) {
        int var5 = 0;
        int var7 = ShatteredPlansClient.field_F ? 1 : 0;
        int var3 = ln.field_H.length;
        int var4 = ac.field_w + 147;
        for (var5 = 0; var5 < var3; var5++) {
          var4 = var4 - cb.field_i[var5];
          if (var4 < 0) {
            break;
          }
        }
        if (param1 != -57) {
          return;
        }
        int var6 = var5 + param0;
        if (var6 >= 0 &&
          ln.field_H.length > var6) {
          this.d(4, var6);
        }
    }

    sm(int param0) {
        this.field_a = param0;
        this.field_d = new np(qg.field_p[this.field_a].length);
        ln.field_H = new int[pe.field_J.length];
        this.a(0, (byte) 28, false);
    }

    private final void b(int param0, boolean param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param3 != -32580) {
          field_b = 98;
        }
        L1: {
          var5 = param2;
          if (var5 == 0) {
            this.field_g = param0;
            var5 = param1 ? 1 : 0;
            ta.a(gr.field_o, 12, (byte) 96, var5 != 0);
          } else {
            if (30 == var5) {
              this.field_g = param0;
              var5 = param1 ? 1 : 0;
              var6 = var5;
              ta.a(0, -4, (byte) 96, var6 != 0);
            } else {
              if (var5 == 1) {
                if (w.d(true)) {
                  var5 = 0;
                  uc.a(320, mp.field_b.field_K, mp.field_b.field_K + mp.field_b.field_q, 240, 8, se.field_a, param1, mr.field_i, (byte) -87, 2, mr.field_i, mp.field_b, false, 8, var5);
                } else {
                  this.field_g = param0;
                  var5 = param1 ? 1 : 0;
                  var6 = var5;
                  ta.a(gr.field_o, -6, (byte) 96, var6 != 0);
                }
              } else {
                if (var5 == 2) {
                  this.field_g = param0;
                  var5 = param1 ? 1 : 0;
                  ta.a(0, -1, (byte) 96, var5 != 0);
                } else {
                  if (8 == var5) {
                    this.field_g = param0;
                    var5 = param1 ? 1 : 0;
                    ta.a(gr.field_o, 0, (byte) 96, var5 != 0);
                  } else {
                    if (var5 == 25) {
                      this.field_g = param0;
                      var5 = param1 ? 1 : 0;
                      ta.a(gr.field_o, 0, (byte) 96, var5 != 0);
                      uo.field_e = true;
                    } else {
                      if (var5 == 23) {
                        this.field_g = param0;
                        var5 = param1 ? 1 : 0;
                        ta.a(gr.field_o, 8, (byte) 96, var5 != 0);
                      } else {
                        if (var5 != 31) {
                          if (var5 != 5) {
                            if (6 != var5) {
                              if (var5 == 9) {
                                this.field_g = param0;
                                var5 = br.field_m;
                                var6 = param1 ? 1 : 0;
                                ta.a(gr.field_o, var5, (byte) 96, var6 != 0);
                              } else {
                                if (var5 == 4) {
                                  this.field_g = param0;
                                  var5 = param1 ? 1 : 0;
                                  ta.a(gr.field_o, 5, (byte) 96, var5 != 0);
                                } else {
                                  if (var5 != 21 &&
                                    var5 != 22) {
                                    if (var5 == 7) {
                                      if (null != bj.field_K) {
                                        ej.c(param3 ^ -32580);
                                      } else {
                                        var5 = param1 ? 1 : 0;
                                        ne.field_s = false;
                                        m.a(8, 13421772, rm.field_b, 8, mp.field_b.field_K, mr.field_i, 240, mp.field_b.field_K + mp.field_b.field_q, mr.field_i, 320, mp.field_b, mp.field_b, 0, mp.field_b.field_K, ah.field_P, mp.field_b.field_q + mp.field_b.field_K, 0, 2, 480, (bi[]) null, es.field_n);
                                        fm.a(var5 != 0, -1);
                                      }
                                      break L1;
                                    }
                                    if (var5 == 10) {
                                      this.field_g = param0;
                                      ce.field_x.a(false, param1);
                                      lg.field_b = true;
                                      cs.field_i = false;
                                    } else {
                                      if (11 == var5) {
                                        this.field_g = param0;
                                        ce.field_x.c(false);
                                        var5 = param1 ? 1 : 0;
                                        ta.a(0, -1, (byte) 96, var5 != 0);
                                      } else {
                                        if (var5 == 12) {
                                          this.field_g = param0;
                                          ce.field_x.d(-7970);
                                          var5 = param1 ? 1 : 0;
                                          ta.a(0, -1, (byte) 96, var5 != 0);
                                        } else {
                                          if (13 == var5) {
                                            this.field_g = param0;
                                            ce.field_x.b(-123);
                                            var5 = param1 ? 1 : 0;
                                            ta.a(0, -1, (byte) 96, var5 != 0);
                                          } else {
                                            if (14 != var5) {
                                              if (var5 != 15 &&
                                                var5 != 16 &&
                                                var5 != 17) {
                                                if (var5 == 18) {
                                                  ff.field_y = 0;
                                                } else {
                                                  if (19 == var5) {
                                                    ff.field_y = 1;
                                                  } else {
                                                    if (var5 == 24) {
                                                      if (this.field_a != 8 &&
                                                        5 != vr.field_c) {
                                                        if ((this.field_a == 11)) {
                                                          ts.a(kq.f((byte) 126), (byte) 51);
                                                        }
                                                      } else {
                                                        qk.a(se.field_a, this.field_a, (byte) 123);
                                                      }
                                                      break L1;
                                                    }
                                                    if (26 == var5) {
                                                      if (this.a((byte) 44, param0)) {
                                                        this.field_g = param0;
                                                        var5 = param1 ? 1 : 0;
                                                        var6 = var5;
                                                        ta.a(0, -5, (byte) 96, var6 != 0);
                                                      }
                                                    } else {
                                                      if (var5 == 20) {
                                                        this.field_g = param0;
                                                        da.a(param3 ^ -32579, kq.f((byte) 127));
                                                      } else {
                                                        if (27 == var5) {
                                                          var5 = param1 ? 1 : 0;
                                                          ta.a(gr.field_o, -3, (byte) 96, var5 != 0);
                                                        } else {
                                                          if (var5 == 28) {
                                                            hj.field_k = hj.field_k + 1;
                                                            if (hj.field_k == 4) {
                                                              hj.field_k = 0;
                                                            }
                                                            var5 = hj.field_k;
                                                            switch (var5) {
                                                              case 0:
                                                                oq.field_i[28] = lm.field_a;
                                                                break L1;
                                                              case 1:
                                                                oq.field_i[28] = la.field_n;
                                                                break L1;
                                                              case 2:
                                                                oq.field_i[28] = ue.field_c;
                                                                break L1;
                                                              default:
                                                                break L1;
                                                              case 3:
                                                                oq.field_i[28] = cf.field_I;
                                                                break L1;
                                                            }
                                                          }
                                                          if (var5 == 29) {
                                                            if (hi.field_a != td.field_K) {
                                                              oq.field_i[29] = tp.field_k;
                                                              td.field_K = hi.field_a;
                                                            } else {
                                                              td.field_K = ec.field_s;
                                                              oq.field_i[29] = og.field_a;
                                                            }
                                                            break L1;
                                                          }
                                                          if (32 == var5) {
                                                            if (oq.field_i[32] == ga.field_L) {
                                                              hk.field_nb = js.field_i;
                                                              oq.field_i[32] = rj.field_r;
                                                              jo.a(32767, hk.field_nb, true, 50);
                                                            } else {
                                                              oq.field_i[32] = ga.field_L;
                                                              hk.field_nb = wp.field_a;
                                                              jo.a(32767, hk.field_nb, true, 50);
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              this.field_g = param0;
                                              if (v.field_b) {
                                                var5 = param1 ? 1 : 0;
                                                ta.a(gr.field_o, -7, (byte) 96, var5 != 0);
                                              }
                                              if (kc.field_d) {
                                                os.a(0, 11, true);
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
                              this.field_g = param0;
                              var5 = param1 ? 1 : 0;
                              ta.a(gr.field_o, 7, (byte) 96, var5 != 0);
                            }
                          } else {
                            this.field_g = param0;
                            var5 = param1 ? 1 : 0;
                            ta.a(gr.field_o, 6, (byte) 96, var5 != 0);
                          }
                        } else {
                          this.field_g = param0;
                          var5 = param1 ? 1 : 0;
                          ta.a(gr.field_o, 13, (byte) 96, var5 != 0);
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

    final boolean a(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        if (this.field_a == 5) {
          fieldTemp$0 = nb.field_a - 1;
          nb.field_a = nb.field_a - 1;
          return fieldTemp$0 <= 0 ? true : false;
        }
        if (param0 < 32) {
          field_c = (String) null;
        }
        if (8 == this.field_a) {
          fieldTemp$1 = le.field_b - 1;
          le.field_b = le.field_b - 1;
          return fieldTemp$1 <= 0 ? true : false;
        }
        if (this.field_a == 10) {
          fieldTemp$2 = on.field_c - 1;
          on.field_c = on.field_c - 1;
          return 0 >= fieldTemp$2 ? true : false;
        }
        return true;
    }

    private final int h(int param0) {
        if (vr.field_c != this.field_a &&
          this.field_a != gr.field_o) {
          return 0;
        }
        if (param0 > -92) {
          this.e((byte) 113);
        }
        if (gr.field_o != vr.field_c &&
          nh.a((byte) -119, vr.field_c) &&
          nh.a((byte) -88, gr.field_o)) {
          return re.a(qg.field_m[vr.field_c], 32, eh.field_Q, qg.field_m[gr.field_o], 0);
        }
        return qg.field_m[this.field_a];
    }

    private final String c(int param0, int param1) {
        String var3;
        int var4;
        String var5;
        String var3Lifetime1;
        String var3Lifetime2;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        var5 = oq.field_i[param1];
        var3 = var5;
        var3Lifetime1 = var5;
        var3Lifetime2 = var5;
        if (29 == param1 ||
          28 == param1) {
          var3Lifetime2 = "   " + var5;
        }
        boolean decompiledFrameRemainder0 = true;
        if (param1 == 9) {
          if (br.field_m != 0 &&
            gr.field_o != 0 &&
            br.field_m != 11 &&
            gr.field_o != 11 &&
            br.field_m != 13 &&
            gr.field_o != 13) {
            if (1 != br.field_m &&
              gr.field_o != 1) {
              if ((2 == br.field_m ||
                gr.field_o == 2 ||
                br.field_m == 3 ||
                gr.field_o == 3 ||
                br.field_m == 4 ||
                4 == gr.field_o)) {
                var3Lifetime2 = ep.field_d;
              }
            } else {
              var3Lifetime2 = ha.field_d;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            var3Lifetime2 = oq.field_i[8];
          }
        }
        if (param1 == 10 &&
          null != ce.field_x &&
          ce.field_x.field_W) {
          var3Lifetime2 = ua.field_g;
        }
        if (param0 != -22609) {
          return (String) null;
        }
        if (var3Lifetime2 != null) {
          return var3Lifetime2.toUpperCase();
        }
        return null;
    }

    private final int c(int param0, boolean param1) {
        if (!param1) {
          return 40;
        }
        return this.h(-105) + (qg.field_t[this.field_a] + qg.field_l[this.field_a] * param0);
    }

    private final void a(int param0, int param1, int param2, int param3, String param4, int param5, int param6, int param7, byte param8, int param9) {
        int stackIn_11_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var11_int = 0;
        RuntimeException var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var13Lifetime1;
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var11_int = param9 + param5;
          if (param5 <= 0) {
            gf.f(var11_int, param1, -param5, param0);
            gf.f(var11_int, param7, -param5, param0);
          } else {
            gf.f(param9, param1, param5, param0);
            gf.f(param9, param7, param5, param0);
          }
          if (param7 <= param1) {
            gf.j(var11_int, param7, -param7 + (param1 + 1), param0);
            if (param3 >= param7) {
              stackIn_18_0 = (param1 <= param3) ? 1 : 0;
            } else {
              stackIn_18_0 = 1;
            }
            var12 = stackIn_18_0;
          } else {
            if (param3 >= param1) {
              stackIn_11_0 = (param7 <= param3) ? 1 : 0;
            } else {
              stackIn_11_0 = 1;
            }
            var12 = stackIn_11_0;
            gf.j(var11_int, param1, -param1 + (param7 + 1), param0);
          }
          if (var11_int >= param2) {
            if (var12 != 0) {
              var13 = param1 + param7 >> 1;
              if (param5 <= 0) {
                gf.f(var11_int, var13, -param5, param0);
                var11_int = var11_int - param5;
              } else {
                var11_int = var11_int - param5;
                gf.f(var11_int, var13, param5, param0);
              }
              var14 = param3 - var13;
              if (0 >= var14) {
                gf.j(var11_int, var13 + var14, -var14, param0);
              } else {
                gf.j(var11_int, var13, var14, param0);
              }
            }
            gf.f(param2, param3, -param2 + var11_int, param0);
          } else {
            if (var12 != 0) {
              var13 = param1 + param7 >> 1;
              if (param5 > 0) {
                gf.f(var11_int, var13, param5, param0);
                var11_int = var11_int + param5;
              } else {
                var11_int = var11_int + param5;
                gf.f(var11_int, var13, -param5, param0);
              }
              var14 = -var13 + param3;
              if (var14 <= 0) {
                gf.j(var11_int, var14 + var13, -var14, param0);
              } else {
                gf.j(var11_int, var13, var14, param0);
              }
            }
            gf.f(var11_int, param3, param2 - var11_int, param0);
          }
          if (param8 != 110) {
            return;
          }
          var13Lifetime1 = wk.a(-9615, param4, rs.field_Cb, new int[]{param6});
          param1 = -(var13Lifetime1 * rs.field_Cb.field_J >> 1) + param3;
          rs.field_Cb.a(param4, param2 + 5, param1, param6, var13Lifetime1 * rs.field_Cb.field_J + rs.field_Cb.field_q, param0, -1, 0, 0, rs.field_Cb.field_J);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11 = decompiledCaughtException;
          stackIn_44_0 = var11;
          stackIn_44_1 = new StringBuilder().append("sm.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6, int param7, boolean param8) {
        bi stackIn_23_0 = null;
        double var10;
        double var12;
        double var14;
        int var16;
        int var17;
        double var18;
        double var20;
        double var22;
        double var24;
        double var26;
        double var28;
        int var30;
        int var31;
        int var32;
        double var33;
        int var35;
        double var10Lifetime1;
        int var32Lifetime1;
        var35 = ShatteredPlansClient.field_F ? 1 : 0;
        var10 = Math.sqrt((double)((-param6 + param0) * (-param6 + param0) + (param2 - param5) * (param2 - param5)));
        var12 = (double)(-param5 + param2) / var10;
        var14 = (double)(-param6 + param0) / var10;
        var16 = param5 * 16 + (-param5 + param2) * 16 * param1 / 200;
        var17 = param1 * (16 * (param0 - param6)) / 200 + 16 * param6;
        var18 = Math.sqrt((double)((var17 - param6 * 16) * (-(param6 * 16) + var17) + (var16 - 16 * param5) * (-(16 * param5) + var16)));
        if (param4 != 92) {
          this.field_a = 76;
        }
        var10Lifetime1 = Math.sqrt((double)(256 * ((-param6 + param0) * (-param6 + param0)) + (-param5 + param2) * ((-param5 + param2) * 256)));
        var20 = var10Lifetime1 / 2.0;
        var22 = 1.0 / var20;
        var24 = -(0.2 * ((-var20 + var18) * (var18 - var20) * var22)) + var10Lifetime1 / 10.0;
        var26 = (double)(16 * (param6 - param0));
        var28 = (double)((param5 - param2) * 16);
        var26 = var26 / var10Lifetime1;
        var28 = var28 / var10Lifetime1;
        var30 = (int)(var24 * var26) + var16;
        var31 = -(int)(var28 * var24) + var17;
        var32 = 0;
        if (0.0 == var12) {
          var32Lifetime1 = (0.0 < var14) ? 49152 : 16384;
        } else {
          if (var14 == 0.0) {
            var32Lifetime1 = (!(0.0 < var12)) ? 32768 : 0;
          } else {
            var33 = (double)(16 * (param0 - param6));
            if (0.0 > var33) {
              var33 = -var33;
            }
            var32Lifetime1 = (int)(Math.asin(var33 / var10Lifetime1) * 32768.0 / 3.141592653589793);
            if (0.0 > var12) {
              if (0.0 > var14) {
                var32Lifetime1 = 32768 - var32Lifetime1;
              } else {
                var32Lifetime1 = var32Lifetime1 + 32768;
              }
            } else {
              if (0.0 < var14) {
                var32Lifetime1 = 65536 - var32Lifetime1;
              }
            }
          }
        }
        var32Lifetime1 -= 16384;
        var32Lifetime1 = -3800 + (var32Lifetime1 + param1 * 7600 / 200);
        if (!param3) {
          stackIn_23_0 = fj.field_p;
        } else {
          stackIn_23_0 = eq.field_o;
        }
        ie.a((om) (stackIn_23_0), fj.field_p.field_z << 3, fj.field_p.field_w << 3, var30, var31, var32Lifetime1, 4096);
        if (param8) {
          gf.c(var30 >> 4, var31 >> 4, 9, 0, 92);
          rs.field_Cb.c(Integer.toString(param7), var30 >> 4, 4 + (var31 >> 4), 16777215, -1);
        }
    }

    private final int a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5;
        int var6;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param1 != -109) {
          this.field_h = 86;
        }
        for (var4 = 0; qg.field_p[this.field_a].length > var4; var4++) {
          var5 = this.c(var4, true);
          if (this.a((byte) 44, var4) &&
            param2 >= this.b(var4, true) &&
            param2 < this.a(true, var4) &&
            var5 <= param0 &&
            param0 < var5 + this.f(-20, var4)) {
            return var4;
          }
        }
        return -1;
    }

    private final void e(int param0) {
        int var3;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 != 170) {
          return;
        }
        if (oq.field_j != 104) {
          if (105 == oq.field_j) {
            this.a(1, (byte) -57);
            this.field_d.b(0);
          } else {
            if (oq.field_j == 102) {
              this.d(param0 - 166, 0);
              this.field_d.b(0);
            } else {
              if (oq.field_j == 103) {
                this.d(4, ln.field_H.length - 1);
              } else {
                this.field_d.b(0);
              }
            }
          }
        } else {
          this.a(-1, (byte) -57);
          this.field_d.b(0);
        }
    }

    private final int c(int param0) {
        if (vr.field_c != this.field_a &&
          this.field_a != gr.field_o) {
          return 0;
        }
        if (gr.field_o == vr.field_c) {
          return qg.field_r[vr.field_c];
        }
        if (nh.a((byte) -103, vr.field_c) &&
          nh.a((byte) -125, gr.field_o)) {
          return re.a(qg.field_r[vr.field_c], 32, eh.field_Q, qg.field_r[gr.field_o], 0);
        }
        double var2 = wm.a(eh.field_Q, (byte) 109, param0);
        if (this.field_a == vr.field_c) {
          var2 = -var2 + 1.0;
        }
        return (int)((double)qg.field_r[this.field_a] * var2);
    }

    static {
        field_e = false;
        field_c = "Status";
    }
}
