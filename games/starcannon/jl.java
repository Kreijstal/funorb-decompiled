/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl {
    static int field_d;
    static int[] field_b;
    static String field_k;
    static pf field_a;
    private int field_l;
    private int field_i;
    static int field_h;
    static String field_c;
    private int field_f;
    private int field_g;
    private n field_e;
    static int field_j;

    final void a(int param0, int param1) {
        int var18 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        lk stackIn_68_0 = null;
        boolean stackIn_68_1 = false;
        boolean stackIn_69_2 = false;
        boolean stackIn_71_3;
        boolean stackIn_72_4 = false;
        int stackIn_79_0;
        lk stackIn_79_1;
        boolean stackIn_79_2;
        boolean stackIn_79_3;
        boolean stackIn_80_4 = false;
        boolean stackIn_83_5 = false;
        lk stackIn_89_0 = null;
        boolean stackIn_89_1 = false;
        boolean stackIn_90_2 = false;
        boolean stackIn_93_3 = false;
        lk stackIn_107_0 = null;
        boolean stackIn_107_1 = false;
        boolean stackIn_108_2 = false;
        boolean stackIn_110_3;
        boolean stackIn_111_4 = false;
        lk stackIn_113_0 = null;
        boolean stackIn_113_1 = false;
        boolean stackIn_113_2 = false;
        boolean stackIn_114_3 = false;
        boolean stackIn_117_4 = false;
        lk stackIn_119_0 = null;
        boolean stackIn_119_1 = false;
        boolean stackIn_120_2 = false;
        boolean stackIn_123_3;
        boolean stackIn_127_1 = false;
        boolean stackIn_133_0 = false;
        boolean stackIn_136_1 = false;
        boolean stackIn_137_2 = false;
        int stackIn_140_0 = 0;
        int stackIn_146_0 = 0;
        int stackIn_146_1 = 0;
        boolean stackOut_132_0;
        int var3_int = 0;
        hl var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        hl var22 = null;
        int stackIn_22_0Lifetime1;
        int stackIn_22_1Lifetime1;
        int stackIn_140_0Lifetime1;
        int stackIn_146_0Lifetime1;
        int stackIn_146_1Lifetime1;
        int var4Lifetime1;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        var21 = StarCannon.field_A;
        if (this.field_f == 7) {
          ki.a(j.field_b);
          var3_int = 480 * param1 / 100;
          ki.c(0, -var3_int + 480 >> 1, 640, var3_int + 480 >> 1);
          eb.a(74);
          ki.b(j.field_b);
          return;
        }
        var22 = fh.field_r[this.field_f];
        var3 = var22;
        if (var3 != null) {
          var4 = -var22.field_u + 640 >> 1;
          if (100 == param1) {
            rh.field_f[this.field_f].f(var4, 35, 256);
            var22.e(var4, 35);
          } else {
            rh.field_f[this.field_f].f(var4, 35, param1 * 256 / 100);
            var22.e(var4, 35, param1 * 256 / 100);
          }
        }
        var4Lifetime1 = 640;
        var5 = 0;
        var6 = 480;
        var7 = 0;
        var8 = 0;
        while (var8 < jh.field_c[this.field_f].length) {
          var9 = this.a(true, var8);
          stackIn_22_0 = ~var4Lifetime1;
          stackIn_22_1 = ~var9;
          if (stackIn_22_0 < stackIn_22_1) {
            var4Lifetime1 = var9;
          }
          var10 = this.c((byte) 123, var8);
          if (var5 < var10) {
            var5 = var10;
          }
          var11 = this.a((byte) -121, var8);
          if (var11 < var6) {
            var6 = var11;
          }
          var12 = this.b(-60, var8) + var11;
          if (var12 > var7) {
            var7 = var12;
          }
          var8++;
        }
        stackIn_22_0Lifetime1 = this.field_f;
        stackIn_22_1Lifetime1 = 2;
        boolean decompiledFrameRemainder1 = true;
        if (stackIn_22_0Lifetime1 != stackIn_22_1Lifetime1) {
          if (this.field_f != 3) {
            if (this.field_f != 4 &&
              this.field_f != 5) {
              if ((this.field_f == 6)) {
                if (var6 > a.field_b.field_p + (200 - af.field_y.field_p - 5)) {
                  var6 = -5 - af.field_y.field_p + 200 + a.field_b.field_p;
                }
                if (var7 < this.a((byte) -119, 1) + (this.b(-104, 1) + (af.field_y.field_p + af.field_y.field_q) + 5)) {
                  var7 = 5 + this.a((byte) -120, 1) + (this.b(-115, 1) - (-af.field_y.field_p - af.field_y.field_q));
                }
                var8Lifetime1 = 10 + af.field_y.a(jh.field_e);
                if (var4Lifetime1 > (320 - (var8Lifetime1 >> 1))) {
                  var4Lifetime1 = -(var8Lifetime1 >> 1) + 320;
                }
                if (-(var8Lifetime1 >> 1) + (320 + var8Lifetime1) > var5) {
                  var5 = -(var8Lifetime1 >> 1) + 320 + var8Lifetime1;
                }
                stackIn_68_0 = af.field_y;
                stackIn_68_1 = false;
                stackIn_69_2 = (jg.field_H != 0);
                stackIn_71_3 = false;
                stackIn_72_4 = (ia.field_k != 0);
                var8Lifetime1 = ((lk) (Object) stackIn_68_0).a(StarCannon.a(stackIn_68_1, stackIn_69_2, stackIn_71_3, stackIn_72_4)) + 10;
                if (var5 < (320 + var8Lifetime1 - (var8Lifetime1 >> 1))) {
                  var5 = -(var8Lifetime1 >> 1) + (320 + var8Lifetime1);
                }
                if (var4Lifetime1 > 320 - (var8Lifetime1 >> 1)) {
                  var4Lifetime1 = -(var8Lifetime1 >> 1) + 320;
                }
                stackIn_79_0 = 10;
                stackIn_79_1 = af.field_y;
                stackIn_79_2 = false;
                stackIn_79_3 = true;
                stackIn_80_4 = (ia.field_k != 0);
                stackIn_83_5 = (0 != jg.field_H);
                var8Lifetime1 = stackIn_79_0 + ((lk) (Object) stackIn_79_1).a(dl.b(stackIn_79_2, stackIn_79_3, stackIn_80_4, stackIn_83_5));
                if (var4Lifetime1 > -(var8Lifetime1 >> 1) + 320) {
                  var4Lifetime1 = 320 - (var8Lifetime1 >> 1);
                }
                if (var5 < (-(var8Lifetime1 >> 1) + var8Lifetime1 + 320)) {
                  var5 = -(var8Lifetime1 >> 1) + var8Lifetime1 + 320;
                }
                stackIn_89_0 = af.field_y;
                stackIn_89_1 = false;
                stackIn_90_2 = (ia.field_k != 0);
                stackIn_93_3 = (jg.field_H != 0);
                var8Lifetime1 = ((lk) (Object) stackIn_89_0).a(dl.a(stackIn_89_1, stackIn_90_2, stackIn_93_3, false)) + 10;
                if ((320 - (var8Lifetime1 >> 1)) < var4Lifetime1) {
                  var4Lifetime1 = 320 - (var8Lifetime1 >> 1);
                }
                if (!((-(var8Lifetime1 >> 1) + (320 + var8Lifetime1)) <= var5)) {
                  var5 = -(var8Lifetime1 >> 1) + (320 + var8Lifetime1);
                }
              }
              decompiledFrameRemainder1 = false;
            }
            else {
              if (var5 < 524) {
                var5 = 524;
              }
              if (var6 > 113) {
                var6 = 113;
              }
              if (var4Lifetime1 > 116) {
                var4Lifetime1 = 116;
              }
              if (var5 < 540) {
                var5 = 540;
              }
              if (var4Lifetime1 > 104) {
                var4Lifetime1 = 104;
              }
            }
          } else {
            if ((-5 + (130 - af.field_y.field_p)) < var6) {
              var6 = -5 + (-af.field_y.field_p + 130);
            }
          }
        } else {
          if (var6 > 115) {
            var6 = 115;
          }
          if (wk.a(108)) {
            var8Lifetime1 = af.field_y.a(n.field_g);
            if (-5 - (var8Lifetime1 >> 1) + 320 < var4Lifetime1) {
              var4Lifetime1 = -(var8Lifetime1 >> 1) + 320 - 5;
            }
            if ((-(var8Lifetime1 >> 1) + (320 + var8Lifetime1 + 5)) > var5) {
              var5 = 320 + var8Lifetime1 + (-(var8Lifetime1 >> 1) + 5);
            }
          }
        }
        boolean decompiledFrameRemainder0 = true;
        var4Lifetime1 -= 15;
        var5 += 15;
        var7 += 15;
        var6 -= 15;
        var8Lifetime2 = -var4Lifetime1 + var5;
        var9Lifetime1 = var7 + var6 >> 1;
        var7 = (var9Lifetime1 * (100 - param1) + var7 * param1) / 100;
        var6 = (param1 * var6 + var9Lifetime1 * (100 - param1)) / 100;
        var10Lifetime1 = 5 - var6 + var7;
        ki.a(j.field_b);
        ki.c(var4Lifetime1, var6, var8Lifetime2 + var4Lifetime1, var10Lifetime1 + var6);
        ki.b(19 + var4Lifetime1, var6 + 14, -38 + var8Lifetime2, var10Lifetime1 - 28, 0, 128);
        ba.a(var10Lifetime1, rd.field_p, (byte) 28, var4Lifetime1, var8Lifetime2, var6);
        sb.a(true, var8Lifetime2, 10596798, 0, var6, 16711680, var4Lifetime1, var10Lifetime1 >> 1);
        sb.a(true, var8Lifetime2, 0, 10596798, (var10Lifetime1 >> 1) + var6, 16711680, var4Lifetime1, var10Lifetime1 - (var10Lifetime1 >> 1));
        ki.c(var4Lifetime1 + 19, var6 + 14, var8Lifetime2 + var4Lifetime1 - 19, var6 + var10Lifetime1 - 14);
        if (this.field_f != 2) {
          if (this.field_f != 3) {
            if (this.field_f != 4 &&
              this.field_f != 5) {
              if ((this.field_f == 6)) {
                var11Lifetime1 = 200 + a.field_b.field_p;
                var12Lifetime1 = 4 + (a.field_b.field_r + a.field_b.field_q);
                af.field_y.b(jh.field_e, 320, var11Lifetime1, 65535, -1);
                stackIn_107_0 = af.field_y;
                stackIn_107_1 = false;
                stackIn_108_2 = (jg.field_H != 0);
                stackIn_110_3 = false;
                stackIn_111_4 = (0 != ia.field_k);
                ((lk) (Object) stackIn_107_0).b(StarCannon.a(stackIn_107_1, stackIn_108_2, stackIn_110_3, stackIn_111_4), 320, var12Lifetime1 + var11Lifetime1, 65535, -1);
                stackIn_113_0 = af.field_y;
                stackIn_113_1 = false;
                stackIn_113_2 = true;
                stackIn_114_3 = (ia.field_k != 0);
                stackIn_117_4 = (0 != jg.field_H);
                ((lk) (Object) stackIn_113_0).b(dl.b(stackIn_113_1, stackIn_113_2, stackIn_114_3, stackIn_117_4), 320, 24 + (var12Lifetime1 * 3 + var11Lifetime1), 65535, -1);
                stackIn_119_0 = af.field_y;
                stackIn_119_1 = false;
                stackIn_120_2 = (ia.field_k != 0);
                stackIn_123_3 = (jg.field_H != 0);
                ((lk) (Object) stackIn_119_0).b(dl.a(stackIn_119_1, stackIn_120_2, stackIn_123_3, false), 320, var12Lifetime1 * 4 + var11Lifetime1 + 48, 65535, -1);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              stackIn_127_1 = (this.field_f == 5);
              this.a(stackIn_127_1, (byte) 15);
            }
          } else {
            this.c(320, var8Lifetime2 >> 1);
          }
        } else {
          this.c(-24071);
        }
        if (param0 != 320) {
          this.c(60);
        }
        var11Lifetime2 = 0;
        while (var11Lifetime2 < this.field_e.field_b) {
          stackOut_132_0 = this.b((byte) -93, var11Lifetime2);
          stackIn_140_0 = stackOut_132_0 ? 1 : 0;
          stackIn_133_0 = stackOut_132_0;
          if (stackIn_133_0) {
            stackIn_136_1 = true;
            stackIn_137_2 = (this.field_e.field_k == var11Lifetime2);
            this.a(stackIn_136_1, stackIn_137_2, var11Lifetime2);
          }
          var11Lifetime2++;
        }
        ki.b(j.field_b);
        stackIn_140_0Lifetime1 = -1;
        if (stackIn_140_0Lifetime1 > ~var10Lifetime1 && (this.field_f == 0 ||
          this.field_f == 1)) {
          var8Lifetime2 = var8Lifetime2 >> 1;
          var11Lifetime3 = -var8Lifetime2 + 320;
          var15 = 255;
          var16 = 255;
          var17 = -1 + var11Lifetime3;
          while (true) {
            stackIn_146_0 = var17;
            stackIn_146_1 = 1;
            if (stackIn_146_0 < stackIn_146_1) {
              hf.field_i.e(-hf.field_i.field_x + (hf.field_i.field_x + 10) * param1 / 100, 1);
              hf.field_i.g(-(param1 * (hf.field_i.field_x + 10) / 100) + 640, 1);
              break;
            }
            var12Lifetime2 = var8Lifetime2 * var17 / var11Lifetime3;
            var14 = (var6 + 16) * 5 << 7;
            for (var18 = var6 + 16; var18 < (-16 + var6 + var10Lifetime1); var18 = var18 + (4 - qc.field_d)) {
              var13 = (int)((double)var12Lifetime2 + Math.random() * 5.0 - 2.0);
              stackIn_146_0Lifetime1 = ~var8Lifetime2;
              stackIn_146_1Lifetime1 = ~var13;
              if (stackIn_146_0Lifetime1 > stackIn_146_1Lifetime1) {
                var13 = var8Lifetime2;
              }
              var19 = ki.field_a[var13 + (-var8Lifetime2 + 319 + var14)];
              if (var19 == 16777088 ||
                16711808 == var19) {
                var19 = 16777215;
              }
              var20 = ki.field_a[var14 + (-var13 + var8Lifetime2) + 320];
              if (var20 == 16777088 ||
                var20 == 16711808) {
                var20 = 16777215;
              }
              var15 = ((255 & var19) + (var16 * 2 + 2 * var15)) / 5;
              ki.a(1 + var17, var18, var15 * 257);
              var16 = ((255 & var20) + 2 * var16 + var15 * 2) / 5;
              ki.a(638 - var17, var18, var16 * 257);
              var14 = var14 + (-(640 * qc.field_d) + 2560);
            }
            var17--;
          }
        }
        if (100 != param1 && (!(StarCannon.field_z >= 0) ||
          !(0 <= pa.field_L))) {
          pk.field_e.a(param1 - 100 >> 2, param1 - 100 >> 2, (-param1 + 100 >> 1) + 640, (100 - param1 >> 1) + 480);
          return;
        }
        pk.field_e.e(0, 0);
        return;
    }

    private final void c(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        var8 = StarCannon.field_A;
        param1 -= 30;
        var3 = 130;
        af.field_y.c(ui.field_t + (1 + we.field_k) + " / " + 4, param0 + param1, var3, 33023, 255);
        var4 = 320 - param1;
        var5 = param1 << 1;
        var6 = 1024;
        var7 = we.field_k;
        if (var7 == 0) {
          af.field_y.a(sb.field_p, -param1 + 320, var3, 16777215, -1);
          var3 += 30;
          af.field_y.a(ff.field_p, var4, var3, var5, var6, 49407, -1, 0, 0, 14);
        } else {
          if (var7 == 1) {
            af.field_y.a(tc.field_y, 320 - param1, var3, 16777215, -1);
            var3 += 30;
            var3 = var3 + (14 + af.field_y.a(s.field_a, var4, var3, var5, var6, 49407, -1, 0, 0, 14) * 14);
            af.field_w[4 + pd.field_a * 8].c(var4, -6 + var3);
            var3 = var3 + (14 + 14 * af.field_y.a(fi.field_a, var4 + 40, var3, -40 + var5, var6, 49407, -1, 0, 0, 14));
            var3 = var3 + (14 + 14 * af.field_y.a(ac.field_c, var4, var3, var5, var6, 49407, -1, 0, 0, 14));
            var3 = var3 + (af.field_y.a(qd.field_y, var4, var3, var5, var6, 49407, -1, 0, 0, 14) * 14 + 14);
            var3 += 14;
            af.field_y.b(cc.field_k, 320, var3, 16777215, -1);
            var3 += 14;
            af.field_y.b(p.field_b, 320, var3, 16777215, -1);
            var3 += 14;
            af.field_y.b(eb.field_e, 320, var3, 16777215, -1);
          } else {
            if (var7 == 2) {
              af.field_y.a(vc.field_k, -param1 + 320, var3, 16777215, -1);
              var3 += 30;
              af.field_w[0 + 8 * pd.field_a].c(var4, -6 + var3);
              var3 = var3 + (14 * af.field_y.a(gf.field_e, var4 + 40, var3, var5 - 40, var6, 49407, -1, 0, 0, 14) + 14);
              af.field_w[1 + 8 * pd.field_a].c(var4, -6 + var3);
              var3 = var3 + (14 * af.field_y.a(mc.field_i, var4 + 40, var3, var5 - 40, var6, 49407, -1, 0, 0, 14) + 14);
              af.field_w[2 + pd.field_a * 8].c(var4, -6 + var3);
              var3 = var3 + (14 + 14 * af.field_y.a(mg.field_k, var4 + 40, var3, var5 - 40, var6, 49407, -1, 0, 0, 14));
              af.field_w[8 * pd.field_a + 5].c(var4, -6 + var3);
              var3 = var3 + (14 * af.field_y.a(a.field_c, 40 + var4, var3, -40 + var5, var6, 49407, -1, 0, 0, 14) + 14);
              af.field_y.a(la.field_a, var4, var3, var5, var6, 16777215, -1, 0, 0, 14);
            } else {
              if (3 == var7) {
                af.field_y.a(di.field_k, -param1 + 320, var3, 16777215, -1);
                var3 += 30;
                af.field_w[pd.field_a * 8 + 4].c(var4, -6 + var3);
                var3 = var3 + (14 + 14 * af.field_y.a(hb.field_g, 40 + var4, var3, -40 + var5, var6, 49407, -1, 0, 0, 14));
                af.field_w[6 + 8 * pd.field_a].c(var4, var3 - 6);
                var3 = var3 + (14 + af.field_y.a(t.field_x, 40 + var4, var3, -40 + var5, var6, 49407, -1, 0, 0, 14) * 14);
                af.field_w[pd.field_a * 8 + 7].c(var4, var3 - 6);
                var3 = var3 + (14 + af.field_y.a(oi.field_i, 40 + var4, var3, var5 - 40, var6, 49407, -1, 0, 0, 14) * 14);
                af.field_w[8 * pd.field_a + 3].c(var4, var3 - 6);
                var3 = var3 + (14 + 14 * af.field_y.a(ra.field_y, 40 + var4, var3, var5 - 40, var6, 49407, -1, 0, 0, 14));
                af.field_y.a(ab.field_B, var4, var3, var5, var6, 16777215, -1, 0, 0, 14);
              }
            }
          }
        }
    }

    private final void a(byte param0) {
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int var2;
        int var3;
        int var4;
        var4 = StarCannon.field_A;
        if (this.field_f == 2 &&
          !wk.a(47)) {
          if (lb.field_B == 96) {
            if (this.field_e.field_k > 0) {
              if (3 != this.field_e.field_k) {
                this.field_e.a(-84, this.field_e.field_k - 1);
              }
            } else {
              this.field_e.a(-96, 2);
            }
          }
          if (lb.field_B == 97) {
            if (this.field_e.field_k >= 2) {
              if (this.field_e.field_k == 2) {
                this.field_e.a(127, 0);
              }
            } else {
              this.field_e.a(param0 - 169, this.field_e.field_k + 1);
            }
          }
          if (lb.field_B == 99) {
            if (this.field_e.field_k >= 0 &&
              2 >= this.field_e.field_k) {
              this.field_e.a(-125, 3);
            } else {
              this.field_e.a(param0 - 4, ji.field_a);
            }
          }
          if (lb.field_B == 98) {
            if (this.field_e.field_k == 3) {
              this.field_e.a(param0 ^ -51, ji.field_a);
            } else {
              this.field_e.a(param0 ^ 29, 3);
            }
          }
          this.field_e.c((byte) 84);
          return;
        }
        if (3 != this.field_f) {
          if (this.field_f != 7 &&
            this.field_f != 5 &&
            2 != this.field_f) {
            this.field_e.a(param0 - 101);
            if (param0 != 101) {
              field_c = (String) null;
            }
            return;
          }
          this.field_e.b((byte) 92);
          return;
        }
        stackIn_30_0 = (we.field_k != 0) ? 0 : 1;
        var2 = stackIn_30_0;
        stackIn_33_0 = (we.field_k != 3) ? 0 : 1;
        var3 = stackIn_33_0;
        if ((var2 != 0 ||
          var3 != 0) && (lb.field_B == 96 ||
          97 == lb.field_B)) {
          this.field_e.b((byte) 92);
          if (var2 == 0 ||
            this.field_e.field_k != 0) {
            if (var3 != 0 &&
              this.field_e.field_k == 2) {
              this.field_e.b((byte) 92);
              return;
            }
            this.field_e.c((byte) 58);
            return;
          }
        }
        this.field_e.b((byte) 92);
        return;
    }

    private final int c(byte param0, int param1) {
        int var3;
        if (this.field_f == 2 &&
          !wk.a(108)) {
          return this.a(true, param1) - (-bi.field_c[this.field_f] + bj.field_c[this.field_f]);
        }
        if (this.field_f == 3) {
          return this.a(true, param1) - (-bi.field_c[this.field_f] + bj.field_c[this.field_f]);
        }
        if (this.field_f != 4 &&
          this.field_f != 5 &&
          this.field_f != 2) {
          var3 = -88 % ((14 - param0) / 61);
          return bi.field_c[this.field_f];
        }
        return this.a(true, param1) + a.field_b.a(mj.field_c[jh.field_c[this.field_f][param1]]) + 20;
    }

    private final void a(boolean param0, boolean param1, int param2) {
        int var16 = 0;
        int stackIn_3_0 = 0;
        int stackIn_42_0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        String var8;
        int var9;
        lk var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var17;
        var17 = StarCannon.field_A;
        var4 = this.a((byte) -116, param2);
        var5 = this.a(param0, param2);
        stackIn_3_0 = (!param1) ? 33023 : 16777215;
        var6 = stackIn_3_0;
        var7 = jh.field_c[this.field_f][param2];
        var8 = mj.field_c[var7];
        if (19 == var7) {
          if (nf.field_l == 0) {
            var8 = cf.field_k;
          }
          if (nf.field_l == 1) {
            if (!param1) {
              var6 = 16777088;
            }
            var8 = fl.field_g;
          }
          if (2 == nf.field_l) {
            if (!param1) {
              var6 = 16711808;
            }
            var8 = hg.field_D;
          }
        }
        if (var7 == 20) {
          if (qc.field_d == 0) {
            var8 = ec.field_d;
          }
          if (qc.field_d == 1) {
            var8 = fd.field_d;
          }
          if (qc.field_d == 2) {
            var8 = gh.field_A;
          }
        }
        if ((8 == var7 ||
          var7 == 10 ||
          var7 == 9) &&
          (!param1 &&
          ~ji.field_a == ~(var7 - 8))) {
          var6 = 65535;
        }
        if (var8 == null) {
          var8 = "ERROR: missing text";
        }
        var9 = -var5 + this.c((byte) 91, param2);
        var10 = a.field_b;
        if (var7 != 12 &&
          var7 != 13) {
          var10.b(var8, (var9 >> 1) + var5, var4 + var10.field_p, var6, -1);
        } else {
          var11 = ak.field_e + 64 + 9;
          var12 = (var9 - var11 >> 1) + var5;
          var12 = var12 + (8 + ak.field_e);
          var13 = 7 + var4;
          var14 = 6783897;
          ki.b(2 + var12, var13, 64, var14);
          ki.f(var12, 2 + var13, 13, var14);
          ki.f(65 + var12, var13 + 1, 13, var14);
          ki.b(var12, var13 + 15, 64, var14);
          ki.b(var12 + 1, 1 + var13, 63, 14, 0, 128);
          if (12 != var7) {
            stackIn_42_0 = mc.field_b >> 1;
          } else {
            stackIn_42_0 = nb.field_g;
          }
          var15 = stackIn_42_0;
          var10.c(var8, -5 + var12, var10.field_p + var4, var6, -1);
          ki.d(1 + var12, var13 + 1, var15, 14, var6);
          ki.g(var12 + 1, var13 + 5, 64, 3750201, 128);
          ki.g(var12 + 1, 10 + var13, 64, 3750201, 128);
          for (var16 = 5; 65 > var16; var16 += 5) {
            ki.f(var16 + var12, 1 + var13, 14, 3750201, 128);
          }
          ki.a(1 + var12, var13 + 1, var14);
          ki.a(64 + var12, 14 + var13, var14);
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_k = null;
        field_b = null;
        if (param0 != 0) {
          field_k = (String) null;
        }
    }

    private final void a(int param0, boolean param1, boolean param2) {
        int stackIn_42_0 = 0;
        boolean stackIn_51_0 = false;
        int stackIn_72_0 = 0;
        int var4;
        int var5;
        bf var5_ref_bf;
        int var6;
        int var7;
        int var8;
        int var9;
        ue var10;
        var9 = StarCannon.field_A;
        if (!param2) {
          var10 = (ue) null;
          jl.a(37, (ue) null, (byte) 99, -66);
        }
        L1: {
          var4 = jh.field_c[this.field_f][param0];
          var5 = var4;
          if (var5 != 0) {
            if (var5 != 1) {
              if (var5 == 5) {
                if (this.field_e.h(-84)) {
                  od.a(-116, 0, param1);
                  mj.a(255, 12, 0, 12, 50);
                }
              } else {
                if (var5 != 16) {
                  if (var5 == 14) {
                    if (!(!this.field_e.h(-84))) {
                      od.a(-123, 4, param1);
                      lf.field_cb = this.field_f;
                      mj.a(255, 12, 0, 12, 50);
                    }
                    break L1;
                  }
                  if (var5 == 3) {
                    if (!(!this.field_e.h(-84))) {
                      we.field_k = 0;
                      od.a(-112, 3, param1);
                      lf.field_cb = this.field_f;
                      mj.a(255, 12, 0, 12, 50);
                    }
                    break L1;
                  }
                  if (var5 == 6) {
                    if (this.field_e.h(-84)) {
                      od.a(-103, lf.field_cb, param1);
                      mj.a(255, 12, 0, 12, 50);
                    }
                  } else {
                    if (var5 != 2) {
                      if (var5 == 19) {
                        if (this.field_e.d(-1)) {
                          nf.field_l = nf.field_l + 1;
                          if (nf.field_l == 3) {
                            nf.field_l = 0;
                          }
                          mj.a(255, 12, 0, 12, 50);
                        }
                        if (this.field_e.b(-18433)) {
                          nf.field_l = nf.field_l - 1;
                          if (nf.field_l == -1) {
                            nf.field_l = 2;
                          }
                          mj.a(255, 12, 0, 12, 50);
                        }
                      } else {
                        if (var5 == 20) {
                          if (this.field_e.d(-1)) {
                            qc.field_d = qc.field_d + 1;
                            if (3 == qc.field_d) {
                              qc.field_d = 0;
                            }
                            mj.a(255, 12, 0, 12, 50);
                          }
                          if (!(!this.field_e.b(-18433))) {
                            qc.field_d = qc.field_d - 1;
                            if (qc.field_d == -1) {
                              qc.field_d = 2;
                            }
                            mj.a(255, 12, 0, 12, 50);
                          }
                          break L1;
                        }
                        if (var5 == 12) {
                          var5 = nb.field_g;
                          if (this.field_e.a((byte) 82)) {
                            nb.field_g = 0;
                          }
                          if (this.field_e.e(-104)) {
                            nb.field_g = 64;
                          }
                          if (this.field_e.c(0)) {
                            var6 = 9 + (64 + ak.field_e);
                            var7 = (this.a(param2, param0) + this.c((byte) 77, param0) - var6 >> 1) + ak.field_e + 8;
                            var8 = pe.field_d - var7;
                            if (0 < var8) {
                              if (var8 < 64) {
                                nb.field_g = var8;
                              } else {
                                nb.field_g = 64;
                              }
                            } else {
                              nb.field_g = 0;
                            }
                          }
                          if (this.field_e.e((byte) -59)) {
                            nb.field_g = nb.field_g - 8;
                            if (nb.field_g < 0) {
                              nb.field_g = 0;
                            }
                          }
                          if (this.field_e.d((byte) 5)) {
                            nb.field_g = nb.field_g + 8;
                            if (nb.field_g > 64) {
                              nb.field_g = 64;
                            }
                          }
                          if (~var5 != ~nb.field_g) {
                            mj.a(255, 12, 0, 12, 50);
                          }
                        } else {
                          if (13 == var5) {
                            var5 = mc.field_b;
                            if (this.field_e.a((byte) -92)) {
                              mc.field_b = 0;
                            }
                            if (this.field_e.e(-104)) {
                              mc.field_b = 128;
                            }
                            if (this.field_e.c(0)) {
                              var6 = 64 + (ak.field_e + 9);
                              var7 = 8 + ((-var6 + (this.a(true, param0) + this.c((byte) 123, param0)) >> 1) + ak.field_e);
                              var8 = -var7 + pe.field_d << 1;
                              if (var8 <= 0) {
                                mc.field_b = 0;
                              } else {
                                if (var8 >= 128) {
                                  mc.field_b = 128;
                                } else {
                                  mc.field_b = var8;
                                }
                              }
                            }
                            if (this.field_e.e((byte) -84)) {
                              mc.field_b = mc.field_b - 16;
                              if (mc.field_b < 0) {
                                mc.field_b = 0;
                              }
                            }
                            if (this.field_e.d((byte) 62)) {
                              mc.field_b = mc.field_b + 16;
                              if (mc.field_b > 128) {
                                mc.field_b = 128;
                              }
                            }
                            if ((var5 != mc.field_b)) {
                              kc.field_P.a(mc.field_b);
                            }
                            break L1;
                          }
                          if (var5 == 4) {
                            if (this.field_e.h(-84)) {
                              if (n.field_a == null) {
                                var5 = param1 ? 1 : 0;
                                hf.a(240, 12, 22, jk.field_f, 18, 320, jk.field_f, 12, a.field_b, -11, 12, var5 != 0);
                              } else {
                                re.a(0);
                              }
                              mj.a(255, 12, 0, 12, 50);
                            }
                          } else {
                            switch (var5) {
                              case 7:
                                if (!this.field_e.h(-84)) {
                                  break;
                                }
                                if (gj.field_c >= 0) {
                                  fi.field_e.field_k = 0;
                                  gj.field_c = 0;
                                  tj.field_G = 0;
                                  if (null != ah.field_a) {
                                    ah.field_a.h(6000);
                                    ah.field_a = null;
                                  }
                                  if (ok.field_tb != null) {
                                    jk.field_k.a(ok.field_tb);
                                    ok.field_tb = null;
                                  }
                                  mj.a(dg.field_l, 12, 0, 12, 50);
                                }
                                tj.field_C = 0;
                                od.a(-116, -1, param1);
                                mj.a(255, 12, 0, 12, 50);
                                break;
                              case 9:
                                if (!this.field_e.h(-84)) {
                                  break;
                                }
                                ji.field_a = 1;
                                mj.a(255, 12, 0, 12, 50);
                                break;
                              case 10:
                                if (!this.field_e.h(-84)) {
                                  break;
                                }
                                ji.field_a = 2;
                                mj.a(255, 12, 0, 12, 50);
                                break;
                              case 17:
                                if (this.field_e.h(-84) &&
                                  this.b((byte) -118, param0)) {
                                  we.field_k = we.field_k - 1;
                                  mj.a(255, 12, 0, 12, 50);
                                }
                                break;
                              case 18:
                                if (this.field_e.h(-84) &&
                                  this.b((byte) -103, param0)) {
                                  we.field_k = we.field_k + 1;
                                  mj.a(255, 12, 0, 12, 50);
                                }
                                break;
                              case 11:
                                if (!this.field_e.h(-84)) {
                                  break;
                                }
                                if (n.field_a != null) {
                                  re.a(0);
                                }
                                nh.a(ll.b(113), 337033697);
                                mj.a(255, 12, 0, 12, 50);
                                break;
                              default:
                                break;
                              case 21:
                                if (this.field_e.h(-84)) {
                                  if (n.field_a != null) {
                                    re.a(0);
                                  }
                                  bl.a(false, ll.b(94));
                                  mj.a(255, 12, 0, 12, 50);
                                }
                                break;
                              case 15:
                                if (this.field_e.h(-84)) {
                                  if (this.field_f != 4 &&
                                    this.field_f != 2) {
                                    if (6 == this.field_f) {
                                      vc.a(5, (byte) 60, 6);
                                    }
                                  } else {
                                    vc.a(this.field_f, (byte) 60, this.field_f);
                                  }
                                  mj.a(255, 12, 0, 12, 50);
                                }
                                break;
                              case 8:
                                if (this.field_e.h(-84)) {
                                  ji.field_a = 0;
                                  mj.a(255, 12, 0, 12, 50);
                                }
                                break;
                            }
                          }
                        }
                      }
                    } else {
                      if (this.field_e.h(-84)) {
                        od.a(-117, 2, param1);
                        mj.a(255, 12, 0, 12, 50);
                      }
                    }
                  }
                } else {
                  if (this.field_e.h(-84)) {
                    od.a(-98, 7, param1);
                    ij.a(0, true);
                    jg.field_H = 0;
                    eb.field_c = 0;
                    bh.field_e.b(23505);
                    pk.field_a.b(23505);
                    mj.a(255, 12, 0, 12, 50);
                  }
                }
              }
            } else {
              if (this.field_e.h(-84)) {
                od.a(-126, -1, param1);
                stackIn_72_0 = (u.field_d > 0) ? 0 : 7;
                lf.field_cb = stackIn_72_0;
                if (lf.field_cb == 7) {
                  ij.a(0, true);
                }
                mj.a(255, 12, 0, 12, 50);
              }
            }
          } else {
            if (this.field_e.h(-84)) {
              j.field_a = null;
              m.field_f = null;
              od.a(-98, -1, param1);
              stackIn_42_0 = (u.field_d <= 0) ? 7 : 0;
              lf.field_cb = stackIn_42_0;
              if (lf.field_cb == 7) {
                ij.a(0, true);
              }
              cg.field_e = 0;
              na.field_a = 0;
              qf.field_h = 0;
              wg.field_e = 0;
              pf.field_d = nf.field_l + 1;
              if (a.field_a) {
                il.field_i = il.field_i - 1;
                a.field_a = false;
                fc.field_e = fc.field_e - 1;
              }
              jk.field_j = 0;
              gi.field_g = true;
              m.field_f = null;
              jg.field_H = 0;
              if (nf.field_l == 2) {
                jk.field_j = 1;
              }
              fc.field_e = fc.field_e - (ia.field_k << 1);
              vb.field_m = 1;
              sd.field_c = 0;
              gj.field_c = 2;
              qb.field_e = 0;
              ia.field_k = 0;
              ua.field_c = -3;
              field_j = 5;
              tg.field_y = 10;
              ed.field_n = 0;
              il.field_i = il.field_i + rj.field_h;
              gf.field_b = 2;
              rj.field_h = 0;
              fi.field_e.field_f = 320;
              eg.field_l = 128;
              fi.field_e.field_z = 0;
              ui.field_p = 0;
              stackIn_51_0 = (rj.field_h == 0);
              q.field_j = stackIn_51_0;
              fi.field_e.field_k = 1;
              fi.field_e.field_n = 0;
              tj.field_G = 0;
              ie.field_C = 0;
              fi.field_e.field_u = 580;
              ha.field_d = 0;
              var5_ref_bf = (bf) (kh.field_y.c(-3905));
              while (var5_ref_bf != null) {
                if (var5_ref_bf != fi.field_e) {
                  var5_ref_bf.b(4);
                }
                var5_ref_bf = (bf) (kh.field_y.a(-16913));
              }
              for (var5 = 0; var5 < qc.field_c.length; var5++) {
                qc.field_c[var5] = null;
              }
              se.field_m = 0;
              nf.field_e = 0;
              lc.field_gb = 0;
              if (nf.field_l > 0) {
                se.field_m = 1;
              }
              if (null != kc.field_P) {
                ti.field_f.a(kc.field_P);
                kc.field_P.f();
                if (eg.field_f != kc.field_P) {
                  kc.field_P = eg.field_f;
                } else {
                  kc.field_P = gd.field_a;
                }
                ti.field_f.b(kc.field_P);
                kc.field_P.a(mc.field_b);
              }
              mj.a(255, 12, 0, 12, 50);
            }
          }
        }
    }

    final static void a(gi param0, gi param1, int param2, int param3, int param4, int param5) {
        kc.field_S = param4;
        ie.field_y = param0;
        mc.field_h = param2;
        rh.field_i = param5;
        if (param3 >= -5) {
          return;
        }
        try {
          wj.field_d = param1;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "jl.R(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void a(boolean param0, byte param1) {
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_49_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var12;
        int var3Lifetime1;
        int var7Lifetime1;
        int stackIn_40_0Lifetime1;
        int stackIn_40_1Lifetime1;
        var12 = StarCannon.field_A;
        ba.a(95, jk.field_f, (byte) 44, 136, 368, 122);
        var3 = 164;
        var4 = 134;
        if (param0) {
          stackIn_3_0 = jg.field_H;
        } else {
          stackIn_3_0 = eb.field_c;
        }
        var5 = stackIn_3_0;
        if ((32 & var5) == 0) {
          var3 += 20;
        }
        var6 = -1;
        if (param1 != 15) {
          return;
        }
        var7 = 0;
        while (di.field_j.length > var7) {
          stackIn_40_0 = var7;
          stackIn_40_1 = 6;
          if (stackIn_40_0 != stackIn_40_1) {
            var3 += 40;
          } else {
            var4 += 40;
            var3 = 144;
          }
          boolean decompiledFrameRemainder0 = true;
          if ((1 << var7 & var5) == 0) {
            decompiledFrameRemainder0 = !(param0);
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameRemainder0 = (var7 != 5))) {
              if (u.field_d <= 0 &&
                (340 & 1 << var7) != 0) {
                sc.field_a.c(var3, var4);
              } else {
                lf.field_V.c(var3, var4);
              }
            }
          } else {
            j.field_c[var7].c(var3, var4);
          }
          if (decompiledFrameRemainder0) {
            if (var3 <= pe.field_d &&
              pe.field_d <= var3 + 32 &&
              var4 <= la.field_c &&
              (var4 + 32) >= la.field_c) {
              var6 = var7;
              ki.f(-2 + var3, -2 + var4, 36, 36, 6, 8421504);
            }
            if (var3 <= this.field_i &&
              this.field_i <= 32 + var3 &&
              var4 <= this.field_l &&
              this.field_l <= (32 + var4)) {
              this.field_i = -1;
              if (~var7 == ~this.field_g) {
                this.field_g = -1;
              } else {
                this.field_g = var7;
              }
            }
            if (var7 == this.field_g) {
              ki.f(-2 + var3, -2 + var4, 36, 36, 6, 65535);
            }
          }
          var7++;
        }
        stackIn_40_0Lifetime1 = -1;
        stackIn_40_1Lifetime1 = ~this.field_g;
        if (stackIn_40_0Lifetime1 >= stackIn_40_1Lifetime1) {
          var6 = this.field_g;
        }
        ba.a(128 + ((af.field_y.field_r + af.field_y.field_q << 1) + af.field_y.field_p), jk.field_f, (byte) 14, 118, 408, 241 - af.field_y.field_p);
        if (var6 != -1) {
          var7Lifetime1 = af.field_y.field_q + af.field_y.field_r;
          af.field_y.b(di.field_j[var6], 320, 247, 16777215, -1);
          var8 = 2 + var7Lifetime1;
          stackIn_49_0 = ((var5 & 1 << var6) == 0) ? 0 : 1;
          var9 = stackIn_49_0;
          if (var9 != 0) {
            af.field_y.b(rj.field_f, 320, 247 + var8, 16777215, -1);
          } else {
            af.field_y.b(qb.field_c, 320, var8 + 247, 16727871, -1);
          }
          var10 = (var8 << 1) + 247;
          if (var9 == 0) {
            if (u.field_d <= 0 &&
              (1 << var6 & 340) != 0) {
              sc.field_a.e(128, -18 + var10);
            } else {
              lf.field_V.e(128, var10 - 18);
            }
          } else {
            j.field_c[var6].e(128, var10 - 18);
          }
          var10 = var10 + af.field_y.field_p;
          var10 = var10 + ((var8 >> 1) + af.field_y.a(vd.field_h[var6], 276, var10 - af.field_y.field_p, 236, 1000, 65535, -1, 0, 0, var8) * var8);
          af.field_y.a(ma.field_f + s.field_b[var6] * 100, 276, var10, 65535, -1);
          var10 = var10 + ((var8 >> 1) + var8);
          var3Lifetime1 = 276;
          af.field_y.a(ja.field_g, var3Lifetime1, var10, 65535, -1);
          var3Lifetime1 = var3Lifetime1 + af.field_y.a(ja.field_g);
          for (var11 = 0; var11 < s.field_b[var6]; var11++) {
            el.field_J.e(var3Lifetime1, -af.field_y.field_p + var10);
            var3Lifetime1 = var3Lifetime1 + el.field_J.field_u / 3;
          }
          return;
        }
        if (!wk.a(33)) {
          af.field_y.b(jk.field_a, 320, 247 + af.field_y.field_p * 5, 65535, -1);
        } else {
          af.field_y.b(jk.field_a, 320, af.field_y.field_p * 4 + 247, 65535, -1);
          af.field_y.b(n.field_g, 320, 247 + 7 * af.field_y.field_p, 65535, -1);
        }
        return;
    }

    final void b(boolean param0, int param1) {
        int var3 = param1;
        if (this.field_f == 7) {
          var3 = -1;
        }
        if (0 == this.field_f &&
          this.field_e.field_k != -1) {
          var3 = this.field_e.field_k;
        }
        if (1 == this.field_f && this.field_e.field_k != -1 &&
          StarCannon.field_z != -1) {
          var3 = this.field_e.field_k;
        }
        if (this.field_f == 3) {
          var3 = 2;
        }
        this.field_e.a(false, param0, var3, this.a(pe.field_d, la.field_c, param1 ^ -24332));
        this.field_g = -1;
        if (this.field_f == 2) {
          j.field_a = null;
        }
    }

    private final int a(boolean param0, int param1) {
        int var3;
        int var3Lifetime1;
        if (this.field_f == 2 &&
          !wk.a(104)) {
          if (param1 == 3) {
            param1 = 2;
          }
          var3 = -bj.field_c[this.field_f] + bi.field_c[this.field_f] >> 1;
          return (param1 - 1) * 140 + 320 - var3;
        }
        if (this.field_f == 3) {
          var3Lifetime1 = -bj.field_c[this.field_f] + bi.field_c[this.field_f] >> 1;
          return -var3Lifetime1 + 180 * (-1 + param1) + 320;
        }
        if (2 == this.field_f) {
          if (param1 != 0) {
            return -bj.field_c[this.field_f] + (630 - a.field_b.a(mj.field_c[jh.field_c[this.field_f][param1]]));
          }
          return bj.field_c[this.field_f] - 10;
        }
        if (!param0) {
          this.b(14);
        }
        if (this.field_f == 4 &&
          wk.a(40) &&
          param1 == 0) {
          return -10 + bj.field_c[this.field_f];
        }
        if (this.field_f == 5 &&
          0 == param1) {
          return -10 + bj.field_c[this.field_f];
        }
        if (4 != this.field_f &&
          this.field_f != 5) {
          return bj.field_c[this.field_f];
        }
        return 630 - bj.field_c[this.field_f] - a.field_b.a(mj.field_c[jh.field_c[this.field_f][param1]]);
    }

    final static id a(int param0, ue param1, byte param2, int param3) {
        RuntimeException var4 = null;
        id stackIn_5_0 = null;
        id stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!qb.a((byte) -82, param0, param3, param1)) {
            return null;
          }
          if (param2 == 64) {
            stackIn_7_0 = qi.a(14609);
            return stackIn_7_0;
          }
          stackIn_5_0 = (id) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("jl.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final int b(int param0, int param1) {
        int discarded$0 = 0;
        if (param0 > -49) {
          discarded$0 = this.b(34, -114);
        }
        return b.field_c[this.field_f] <= 30 ? b.field_c[this.field_f] : 30;
    }

    private final boolean b(byte param0, int param1) {
        boolean discarded$0 = false;
        if (this.field_f == 3) {
          if (param1 == 0 &&
            we.field_k == 0) {
            return false;
          }
          if (2 == param1 &&
            3 == we.field_k) {
            return false;
          }
        }
        if (param0 >= -78) {
          discarded$0 = this.b((byte) 49, 106);
          return true;
        }
        return true;
    }

    private final int a(byte param0, int param1) {
        if (this.field_f == 2 &&
          !wk.a(60)) {
          if (param1 < 3) {
            return qi.field_a[this.field_f];
          }
          return qi.field_a[this.field_f] + b.field_c[this.field_f];
        }
        if (2 != this.field_f &&
          this.field_f != 3 &&
          this.field_f != 4 &&
          this.field_f != 5) {
          if (param0 <= -107) {
            return qi.field_a[this.field_f] + b.field_c[this.field_f] * param1;
          }
          return 104;
        }
        return qi.field_a[this.field_f];
    }

    private final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5;
        int var6;
        boolean stackIn_15_0 = false;
        var6 = StarCannon.field_A;
        if (7 != this.field_f) {
        }
        if (param2 != -24332) {
          field_k = (String) null;
        }
        for (var4 = 0; jh.field_c[this.field_f].length > var4; var4++) {
          var5 = this.a((byte) -123, var4);
          stackIn_15_0 = this.b((byte) -87, var4);
          if (stackIn_15_0 &&
            this.a(true, var4) <= param0 &&
            param0 < this.c((byte) 80, var4) &&
            param1 >= var5 &&
            param1 < var5 + this.b(param2 + 24279, var4)) {
            return var4;
          }
        }
        return -1;
    }

    jl(int param0) {
        this.field_i = -1;
        this.field_g = -1;
        this.field_f = param0;
        this.field_e = new n(jh.field_c[param0].length);
    }

    private final void c(int param0) {
        String stackIn_30_0 = null;
        String var3;
        vc var4_ref_vc;
        int var4;
        String[] var5;
        int var7;
        int var8;
        int var9;
        String var10;
        int var10_int;
        int var11;
        int var12;
        String var13;
        int var14;
        lk var15;
        lk var16;
        int[] var20;
        int var9Lifetime1;
        String stackIn_30_0Lifetime1;
        lk var15Lifetime1;
        var14 = StarCannon.field_A;
        var15 = af.field_y;
        var16 = var15;
        if (param0 != -24071) {
          return;
        }
        L0: {
          if (!wk.a(73)) {
            if (j.field_a == null) {
              j.field_a = hg.b(3, 1, 1, -84, 10);
            }
            var4_ref_vc = j.field_a;
            if (!var4_ref_vc.field_j) {
              var3 = ba.field_a;
            } else {
              if (null != var4_ref_vc.field_n) {
                var3 = b.field_a;
                var5 = var4_ref_vc.field_n[ji.field_a];
                var20 = var4_ref_vc.field_o[ji.field_a];
                var7 = tj.a(ji.field_a, -1, m.field_f, var4_ref_vc);
                var8 = var16.field_p + 120;
                var9 = 0;
                while (var9 < 10) {
                  stackIn_30_0 = var5[var9];
                  if (stackIn_30_0 != null) {
                    var10_int = 16777215;
                    var11 = var20[var9];
                    if (~var7 == ~var9) {
                      var10_int = 65535;
                    }
                    var15Lifetime1 = var16;
                    var16.c(var9 + 1 + ". ", 180, var8, var10_int, -1);
                    var15Lifetime1.a(var5[var9], 180, var8, var10_int, -1);
                    var12 = var11 % 3;
                    if (var12 != 0) {
                      if (var12 != 1) {
                        var13 = td.field_j;
                      } else {
                        var13 = lb.field_l;
                      }
                    } else {
                      var13 = ta.field_a;
                    }
                    var16.b(var13, 355, var8, var10_int, -1);
                    var16.c(Integer.toString(var11 / 3), 480, var8, var10_int, -1);
                    var3 = "";
                  }
                  var8 += 20;
                  var9++;
                }
                if (null != m.field_f &&
                  var7 == -1) {
                  var16.a(we.field_i, 180, var8, 65535, -1);
                  var9Lifetime1 = kd.field_C % 3;
                  if (0 != var9Lifetime1) {
                    if (var9Lifetime1 == 1) {
                      var10 = lb.field_l;
                    } else {
                      var10 = td.field_j;
                    }
                  } else {
                    stackIn_30_0Lifetime1 = ta.field_a;
                    var10 = stackIn_30_0Lifetime1;
                  }
                  var16.b(var10, 355, var8, 65535, -1);
                  var16.c(Integer.toString(kd.field_C / 3), 480, var8, 65535, -1);
                }
                break L0;
              }
              var3 = w.field_q;
            }
          } else {
            var3 = b.field_a;
          }
        }
        var4 = 120 - (-var16.field_p - 100);
        var16.b(var3, 330, var4, 33023, -1);
        if (wk.a(89)) {
          var16.b(n.field_g, 320, 140 + var16.field_p + 120, 33023, -1);
        } else {
          var16.a(va.field_u, this.a(true, 0), qi.field_a[this.field_f] + b.field_c[this.field_f], -bj.field_c[this.field_f] + (620 - bi.field_c[this.field_f]), 1000, 16777215, -1, 1, 0, var16.field_p + var16.field_q);
        }
        return;
    }

    final void b(int param0) {
        int stackIn_21_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int var2;
        int var3;
        int stackIn_25_0Lifetime1;
        int stackIn_25_1Lifetime1;
        var3 = StarCannon.field_A;
        if (this.field_f == 7) {
          var2 = nc.a(true, param0 + 0);
          if (var2 == 3) {
            bl.a(false, ll.b(94));
          }
          if (var2 == 1) {
            od.a(-102, 0, false);
          }
          if (var2 == 2) {
            od.a(param0 ^ -109, 0, true);
          }
        }
        while (ad.e((byte) -81)) {
          stackIn_25_0 = -14;
          stackIn_25_1 = ~lb.field_B;
          if (stackIn_25_0 != stackIn_25_1) {
            this.a((byte) 101);
            if (this.field_e.field_k == -1) {
              continue;
            }
            this.a(this.field_e.field_k, false, true);
            continue;
          }
          if (this.field_f == 1) {
            od.a(-107, -1, false);
            stackIn_21_0 = (u.field_d <= 0) ? 7 : 0;
            lf.field_cb = stackIn_21_0;
            if (lf.field_cb != 7) {
              continue;
            }
            ij.a(param0 + 0, true);
            continue;
          }
          if (this.field_f == 6) {
            continue;
          }
          if (this.field_f == 7) {
            continue;
          }
          od.a(param0 - 128, lf.field_cb, false);
        }
        this.field_e.a(this.a(rg.field_B, kc.field_Q, -24332), this.a(pe.field_d, la.field_c, -24332), 126);
        stackIn_25_0Lifetime1 = 0;
        stackIn_25_1Lifetime1 = ~this.field_e.field_k;
        if (stackIn_25_0Lifetime1 != stackIn_25_1Lifetime1) {
          this.a(this.field_e.field_k, true, true);
        }
        if (kg.field_a != param0) {
          this.field_i = rg.field_B;
          this.field_l = kc.field_Q;
        }
        return;
    }

    static {
        field_b = new int[4];
        field_d = 4;
        field_h = 0;
        field_k = "Please try again in a few minutes.";
        field_a = new pf();
    }
}
