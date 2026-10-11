/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk {
    private int field_u;
    static gk field_q;
    private int[] field_d;
    private int field_o;
    private int field_n;
    private int field_h;
    private int field_m;
    private im field_v;
    private boolean field_g;
    private int field_p;
    static char[] field_r;
    private boolean field_j;
    private int field_e;
    private int field_t;
    private lb field_s;
    private int field_a;
    int field_b;
    private int field_f;
    int field_i;
    static tl field_w;
    private int field_c;
    private int field_x;
    private boolean field_k;
    private int field_l;

    final void a(int param0, boolean param1) {
        String[] array$0 = null;
        int stackIn_109_1 = 0;
        int stackIn_130_0 = 0;
        int stackIn_138_0 = 0;
        int stackIn_138_1 = 0;
        String[] stackIn_140_0 = null;
        String[] stackIn_140_1 = null;
        int stackIn_140_2 = 0;
        String stackIn_141_3 = null;
        int stackIn_144_0 = 0;
        int stackIn_162_0 = 0;
        int stackIn_162_1 = 0;
        int stackIn_236_0 = 0;
        int stackIn_236_1 = 0;
        int stackIn_243_0 = 0;
        int stackIn_434_0 = 0;
        int stackIn_437_0 = 0;
        int stackIn_443_0 = 0;
        int stackIn_446_0 = 0;
        int stackIn_458_0 = 0;
        int stackIn_461_0 = 0;
        int stackIn_473_0 = 0;
        int stackIn_473_1 = 0;
        int var3_int = 0;
        kb var3 = null;
        int var4 = 0;
        pd var4_ref_pd = null;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        kb var8_ref_kb = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        int var11 = 0;
        int[] var11_ref_int__ = null;
        int var12 = 0;
        int var13 = 0;
        hj var13_ref_hj = null;
        int var14_int = 0;
        String var14 = null;
        int var15 = 0;
        Object var15_ref = null;
        String var15_ref_String = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        Object var21 = null;
        Object var22 = null;
        Object var23 = null;
        Object var24 = null;
        kb var25 = null;
        hj var26 = null;
        int[] var27 = null;
        String var28 = null;
        hj var29 = null;
        hj var30 = null;
        String[][] var31 = null;
        String var32 = null;
        int[] var33 = null;
        pd var34 = null;
        pd var35 = null;
        me var36 = null;
        oj var37 = null;
        var21 = null;
        var22 = null;
        var23 = null;
        var24 = null;
        var20 = OrbDefence.field_D ? 1 : 0;
        wf.field_c.field_f.a(this.field_h, -32, this.field_t, false);
        wf.field_c.field_f.a(this.field_h, 121, this.field_t, true);
        var34 = (pd) (this.field_v.b((byte) 115));
        L1: while (true) {
          if (var34 != null) {
            var34.a(this.field_t, (byte) 100, this.field_h);
            var34 = (pd) (this.field_v.d(param0 ^ 855));
            if (var20 == 0) {
              continue;
            }
          } else {
            if (3 < this.field_b) {
              if (200 >= this.field_u) {
                break L1;
              }
              ul.d(0, 0, 640, 480, 0, this.field_u - 200);
              if (var20 == 0) {
                break L1;
              }
            }
          }
          if (this.field_u > 0) {
            ul.d(0, 0, 640, 480, 0, this.field_u);
          }
          break;
        }
        var3_int = -this.field_t + ol.field_e * eh.field_a + (320 - ol.field_e / 2);
        var4 = uh.field_b * ol.field_e + 240 - ol.field_e / 2 - this.field_h;
        var5 = eh.field_a + wf.field_c.field_f.field_c * uh.field_b;
        var6 = 16724787;
        var7 = oj.a((byte) 47, this.field_f);
        if (var5 >= 0 &&
          wf.field_c.field_f.field_i > var5) {
          if (this.a(var7, param0 + 22725, var5) && (6 != this.field_f ||
            this.a(var5, var7, (byte) -40) != 0)) {
            var6 = 65399;
            if ((var20 != 0) &&
              (wf.field_c.field_f.field_o[var5] == 7)) {
              var6 = 16777011;
            }
          } else {
            if (wf.field_c.field_f.field_o[var5] == 7) {
              var6 = 16777011;
            }
          }
        }
        var8 = 0;
        if (var6 == 65399) {
          if (wf.field_c.field_e[0].b(true) >= ui.field_a[this.field_f][0]) {
            if (this.field_f == 0) {
              var8 = 10;
            }
            if (this.field_f == 1) {
              var8 = 8;
            }
            if (this.field_f == 2) {
              var8 = 20;
            }
            if (this.field_f == 3) {
              var8 = 6;
            }
            if (this.field_f == 4) {
              var8 = 30;
            }
            if (5 == this.field_f) {
              var8 = 6;
              if (var20 != 0) {
                var6 = 16724787;
              }
            }
          } else {
            var6 = 16724787;
          }
        }
        if (var6 == 16777011) {
          var25 = wf.field_c.a(var5, param0 ^ 123);
          if (var25 != null &&
            6 != var25.field_C) {
            var4 = -(ol.field_e / 2) + ol.field_e * var25.field_h + (240 - this.field_h);
            var3_int = -(ol.field_e / 2) + ol.field_e * var25.field_g + 320 - this.field_t;
            var8 = var25.field_l;
            var5 = wf.field_c.field_f.field_c * var25.field_h + var25.field_g;
            var7 = oj.a((byte) 47, var25.field_C);
          }
        }
        var26 = new hj(64, 64);
        var26.d();
        if (this.field_f == 0) {
          hf.field_g[0].a(32 + ol.field_e / 2, 27 + ol.field_e / 2, 0, 1300);
        }
        if (this.field_f == 1) {
          hf.field_g[7].a(32 + ol.field_e, ol.field_e + 27, 0, 1950);
        }
        if (this.field_f == 2) {
          hf.field_g[14].a(32 + ol.field_e, ol.field_e + 27, 0, 1950);
        }
        if (3 == this.field_f) {
          hf.field_g[21].a(ol.field_e / 2 + 32, 27 + ol.field_e / 2, 0, 1300);
        }
        if (4 == this.field_f) {
          hf.field_g[28].a(32 + ol.field_e * 3 / 2, 27 + 3 * ol.field_e / 2, 0, 2600);
        }
        if (this.field_f == 5) {
          hf.field_g[35].a(ol.field_e + 32, ol.field_e + 27, 0, 1950);
        }
        if (6 == this.field_f) {
          hf.field_g[42].a(ol.field_e / 2 + 32, ol.field_e / 2 + 27, 0, 1300);
        }
        var10 = 0;
        do {
          if (!(var10 < var26.field_v.length)) {
            cb.field_a.a(-40);
            break;
          }
          var11 = var26.field_v[var10];
          var12 = 255 & var11 | (var11 & 65280) >> 8 | var11 >> 16 & 255;
          var26.field_v[var10] = vi.a(16711680, var12 * vi.a(var6, 16711680) / 255) + (vi.a(var12 * vi.a(65280, var6) / 255, 65280) + vi.a(255, var12 * vi.a(255, var6) / 255));
          var10++;
        } while (var20 == 0);
        if (16777011 != var6) {
          var26.c(var3_int - 32, -32 + var4);
          if (this.field_f == 6 &&
            this.a(var7, 22727, var5)) {
            var10 = this.a(var5, var7, (byte) -64);
            var11 = 255 & var10;
            if (0 < var11) {
              var12 = 320 + (ol.field_e * (var11 + eh.field_a) + (-(ol.field_e / 2) - this.field_t));
              var13 = -this.field_h + (ol.field_e * uh.field_b + (240 - ol.field_e / 2));
              var26.c(-32 + var12, var13 - 32);
            }
            var12 = (65280 & var10) >> 8;
            if (var12 > 0) {
              var13 = (-var12 + eh.field_a) * ol.field_e + (320 - (ol.field_e / 2 + this.field_t));
              var14_int = -this.field_h + (-(ol.field_e / 2) + 240 + uh.field_b * ol.field_e);
              var26.c(-32 + var13, var14_int - 32);
            }
            var13 = var10 >> 16 & 255;
            if (var13 > 0) {
              var14_int = -this.field_t + (-(ol.field_e / 2) + ol.field_e * eh.field_a) + 320;
              var15 = -this.field_h + ((var13 + uh.field_b) * ol.field_e + 240) - ol.field_e / 2;
              var26.c(-32 + var14_int, -32 + var15);
            }
            var14_int = (var10 & -16777216) >> 24;
            if (var14_int > 0) {
              var15 = ol.field_e * eh.field_a + 320 - ol.field_e / 2 - this.field_t;
              var16 = -this.field_h + 240 + ((-var14_int + uh.field_b) * ol.field_e - ol.field_e / 2);
              var26.c(-32 + var15, -32 + var16);
            }
          }
        }
        boolean decompiledFrameCompleted2 = true;
        if (var8 > 0) {
          var10 = ol.field_e;
          var12 = 0;
          while (var12 < 16) {
            var12++;
            if (var20 != 0) {
              decompiledFrameCompleted2 = false;
              break;
            }
          }
          if (decompiledFrameCompleted2) {
            var33 = new int[256];
            var27 = var33;
            var11_ref_int__ = var27;
            var4 = var4 + (var7 - 1) * var10;
            var12 = 0;
            while (true) {
              if (var12 < 4) {
                var11_ref_int__[4 - var12] = -(var12 * 4112) - (-32896 - 2097152 * (4 - var12));
                var11_ref_int__[4 + var12] = 32896 - (4112 * var12 + var12 * 2097152 - 8388608);
                var12++;
                if (var20 == 0) {
                  continue;
                }
              } else {
                var3_int = var3_int + var10 * (var7 - 1);
              }
              break;
            }
            ul.a(var3_int << 4, var4 << 4, var10 * var8 << 4, 32, var33);
          }
        }
        var3 = (kb) (wf.field_c.field_o.b((byte) 116));
        do {
          if (var3 == null) {
            var3 = (kb) (wf.field_c.field_o.b((byte) 122));
            break;
          }
          var3.a(this.field_t, this.field_h, param0 - 10);
          var3 = (kb) (wf.field_c.field_o.d(param0 + 851));
        } while (var20 == 0);
        L39: while (true) {
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameCompleted1 = true;
          if (var3 != null) {
            stackIn_473_0 = -7;
            stackIn_473_1 = ~var3.field_C;
            if (var20 != 0) {
              while (true) {
                if (stackIn_473_0 == stackIn_473_1) {
                  var4 = var3.f(100);
                  if (var4 > 0) {
                    var5 = ol.field_e / 2 - this.field_t + var3.field_g * ol.field_e + 320;
                    var6 = -24 + ol.field_e * var3.field_h + (-this.field_h + 240);
                    ob.field_I.c(Integer.toString(var4), var5, var6, 16777215, 0);
                    var3.a(this.field_t, (byte) -108, this.field_h);
                  }
                }
                var3 = (kb) (wf.field_c.field_o.d(853));
                decompiledFrameCompleted1 = false;
                break;
              }
            }
            if (decompiledFrameCompleted1) {
              if (stackIn_473_0 == stackIn_473_1) {
                var4 = -this.field_t + var3.field_g * ol.field_e + 320;
                var5 = 240 + ol.field_e * var3.field_h - this.field_h;
                hf.field_g[1 + 7 * var3.field_C].a(var4, var5 - 5, 0, 1300);
              }
              var3 = (kb) (wf.field_c.field_o.d(853));
              if (var20 == 0) {
                continue;
              }
            }
          }
          if (decompiledFrameCompleted1) {
            var35 = (pd) (wf.field_c.field_r.b((byte) 127));
            while (var35 != null) {
              var35.a(this.field_t, (byte) 86, this.field_h);
              var35 = (pd) (wf.field_c.field_r.d(853));
              if (var20 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if (decompiledFrameCompleted0) {
              var3 = (kb) (wf.field_c.field_o.b((byte) 114));
              while (var3 != null) {
                stackIn_130_0 = ~var3.field_C;
                if (var20 != 0) {
                  break L39;
                }
                stackIn_109_1 = -6;
                if (stackIn_130_0 == stackIn_109_1) {
                  var4 = var3.f(100);
                  if (var4 > 0) {
                    var5 = ol.field_e / 2 - this.field_t + var3.field_g * ol.field_e + 320;
                    var6 = -24 + ol.field_e * var3.field_h + (-this.field_h + 240);
                    ob.field_I.c(Integer.toString(var4), var5, var6, 16777215, 0);
                    var3.a(this.field_t, (byte) -108, this.field_h);
                  }
                }
                var3 = (kb) (wf.field_c.field_o.d(853));
              }
            }
          }
          if (decompiledFrameCompleted0) {
            var36 = (me) (wf.field_c.field_h.b((byte) 114));
            while (true) {
              if (var36 != null) {
                var36.a(this.field_t, this.field_h, (byte) 102);
                var36 = (me) (wf.field_c.field_h.d(853));
                if (var20 == 0) {
                  continue;
                }
              } else {
                if (l.field_c <= 0) {
                  break;
                }
              }
              var3_int = 16711680;
              if ((4 & l.field_c) == 0) {
                var3_int = 16729156;
              }
              var4 = 8 + jd.field_c.a(hd.field_j);
              if ((var4 / 2) > wl.field_a) {
                wl.field_a = var4 / 2;
              }
              if ((-(var4 / 2) + 640) < wl.field_a) {
                wl.field_a = -(var4 / 2) + 640;
              }
              ul.g(-8 + wl.field_a - var4 / 2, md.field_f - 16, 16 + var4, 24, 16777215, 192);
              ul.d(wl.field_a - (var4 / 2 + 8), md.field_f - 16, var4 + 16, 24, 0, 192);
              jd.field_c.c(hd.field_j, -1 + wl.field_a, md.field_f, 0, 0);
              jd.field_c.c(hd.field_j, wl.field_a, md.field_f - 1, 0, 0);
              jd.field_c.c(hd.field_j, wl.field_a, md.field_f, var3_int, -1);
              break;
            }
          }
          stackIn_130_0 = 0;
          break;
        }
        var3_int = stackIn_130_0;
        var4_ref_pd = (pd) (wf.field_c.field_r.b((byte) -18));
        boolean decompiledNaturalLoopExit2 = false;
        while (!(decompiledNaturalLoopExit2 = (var4_ref_pd == null))) {
          stackIn_138_0 = -1;
          stackIn_138_1 = ~var4_ref_pd.field_o;
          if (var20 == 0) {
            if (stackIn_138_0 > stackIn_138_1) {
              var3_int = var3_int + var4_ref_pd.field_o;
            }
            var4_ref_pd = (pd) (wf.field_c.field_r.d(param0 + 851));
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit2) {
          em.c((byte) 67);
          i.field_a.b(0, 0);
          hc.field_i.b(0, 358);
          ul.e(0, 0, param0, 480);
          ul.a(0, 0, 640, 480, 11184810, 4605510);
          ul.e(638, 0, 640, 480);
          ul.a(0, 0, 640, 480, 11184810, 4605510);
          ul.c();
          stackIn_138_0 = 2;
          stackIn_138_1 = 2;
        }
        ul.d(stackIn_138_0, stackIn_138_1, 636, 476, 0);
        array$0 = new String[13];
        stackIn_140_0 = array$0;
        stackIn_140_1 = array$0;
        stackIn_140_2 = 7;
        if (!ok.a(0, false)) {
          stackIn_141_3 = uh.field_c;
        } else {
          stackIn_141_3 = jl.field_f;
        }
        stackIn_140_1[stackIn_140_2] = stackIn_141_3;
        stackIn_140_0[8] = bk.field_b;
        stackIn_140_0[9] = k.field_a;
        stackIn_140_0[10] = bi.field_a;
        stackIn_140_0[11] = bi.field_a;
        stackIn_140_0[12] = od.field_a;
        var4_ref_String__ = stackIn_140_0;
        ul.e(177, 0, 462, 480);
        var5 = -79 + 79 * wf.field_c.field_x;
        stackIn_144_0 = (wf.field_c.field_x <= 0) ? 0 : 1;
        var6 = stackIn_144_0;
        if (0 < wf.field_c.field_y) {
          var5 = var5 - wf.field_c.field_y * 79 / 50;
          var6 = 0;
        }
        if (var3_int == 0) {
          var6 = 0;
        }
        var7 = 39;
        ad.field_e.c(-var7 - var5 % ad.field_e.field_s, 358);
        ad.field_e.c(-(var5 % ad.field_e.field_s) - (var7 - ad.field_e.field_s), 358);
        if (var6 != 0) {
          var8 = 276;
          var9 = 358;
          var10 = 79;
          var11 = 33;
          ul.a(var8 - 8, var9 - 8, var10 + 16, var11 + 16, 8, 16776960, 64);
          ul.a(var8 - 7, -7 + var9, 14 + var10, var11 + 14, 8, 16776960, 64);
          ul.a(var8 - 6, -6 + var9, 12 + var10, 12 + var11, 8, 16776960, 64);
          ul.a(-5 + var8, var9 - 5, var10 + 10, 10 + var11, 8, 16776960, 64);
          if (wf.field_c.field_x % 11 != 0) {
            ul.a(var8, var9, var10, var11, 8947848, 65280);
            if (var20 != 0) {
              ul.a(var8, var9, var10, var11, 8947848, 16711680);
            }
          } else {
            ul.a(var8, var9, var10, var11, 8947848, 16711680);
          }
          gk.field_a.e(var8, var9, var10, var11, 64);
          var8--;
          var11 += 2;
          var10 += 2;
          var9--;
          ul.d(var8, var9, var10, var11, 0);
          var10 += 2;
          var8--;
          var11 += 2;
          var9--;
          ul.d(var8, var9, var10, var11, 11184810);
          var9--;
          var11 += 2;
          var8--;
          var10 += 2;
          ul.d(var8, var9, var10, var11, 0);
        }
        var8 = 0;
        boolean decompiledNaturalLoopExit1 = false;
        while (!(decompiledNaturalLoopExit1 = (var8 >= 99))) {
          var28 = var4_ref_String__[jc.field_f[this.field_b][var8]];
          var9_ref_String = var28;
          stackIn_162_0 = 10;
          stackIn_162_1 = var8 % 11;
          if (var20 == 0) {
            if (stackIn_162_0 == stackIn_162_1) {
              var9_ref_String = t.a(-415993727, new String[]{var28}, ia.field_e);
            }
            cc.field_t.a(Integer.toString(var8 + 1), -4 - var5 + (320 + 79 * var8), 387, 0, -1, 128);
            ob.field_I.a(var9_ref_String, -4 - var5 + (320 + 79 * var8) - 39 - 1, 358, 76, 33, 0, 0, 1, 1, 12);
            ob.field_I.a(var9_ref_String, -39 + 79 * var8 + (-var5 + 320) - 4, 357, 76, 33, 0, 0, 1, 1, 12);
            ob.field_I.a(var9_ref_String, -43 + (79 * var8 - var5 + 320), 358, 76, 33, 16777215, -1, 1, 1, 12);
            var8++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit1) {
          ul.c();
          ob.field_I.c(Integer.toString(wf.field_c.field_x), 111, 29, 0, 0);
          ob.field_I.c(Integer.toString(wf.field_c.field_x), 110, 30, 0, 0);
          ob.field_I.c(Integer.toString(wf.field_c.field_x), 111, 30, 16777215, -1);
          stackIn_162_0 = -wf.field_c.field_i + wf.field_c.field_g;
          stackIn_162_1 = 50;
        }
        var4 = stackIn_162_0 / stackIn_162_1;
        if (var4 < 0) {
          var4 = 0;
        }
        ob.field_I.a(Integer.toString(var4), 200, 24, 16777215, -1);
        boolean decompiledSharedTail3 = !(0 < wf.field_c.field_e[0].field_f);
        if (!decompiledSharedTail3) {
          ob.field_I.b(t.a(-415993727, new String[]{Integer.toString(wf.field_c.field_e[0].field_d)}, ke.field_a), 400, 32, 16777215, -1);
          var4 = 32;
          var5 = 526;
          if (wj.field_m == 1) {
            var5 = 465;
            var4 = 48;
          }
          jd.field_c.b(t.a(-415993727, new String[]{Integer.toString(wf.field_c.field_e[0].field_f)}, rl.field_d), var5, var4, 16777215, -1);
          decompiledSharedTail3 = (var20 != 0);
        }
        if (decompiledSharedTail3) {
          ob.field_I.b(t.a(-415993727, new String[]{Integer.toString(wf.field_c.field_e[0].field_d)}, ke.field_a), 400, 32, 16777215, -1);
        }
        var31 = new String[][]{new String[]{jg.field_l, jg.field_l + " I", jg.field_l + " II", jg.field_l + " III", nd.field_f, ob.field_L}, new String[]{am.field_g, am.field_g + " I", am.field_g + " II", am.field_g + " III", p.field_e, kd.field_b}, new String[]{oj.field_o, oj.field_o + " I", oj.field_o + " II", oj.field_o + " III", ug.field_o, cd.field_r}, new String[]{fd.field_g, fd.field_g + " I", fd.field_g + " II", fd.field_g + " III", b.field_q, ua.field_b}, new String[]{q.field_c, q.field_c + " I", q.field_c + " II", q.field_c + " III", lj.field_B, ob.field_E}, new String[]{kg.field_l, kg.field_l + " I", kg.field_l + " II", kg.field_l + " III", de.field_c, ua.field_d}, new String[]{gl.field_c, gl.field_c, gl.field_c + " II", gl.field_c + " III", lj.field_B, ob.field_E}};
        var5 = this.field_f;
        var6 = 0;
        var7 = uh.field_b * wf.field_c.field_f.field_c + eh.field_a;
        if (var7 >= 0 &&
          var7 < wf.field_c.field_f.field_i &&
          wf.field_c.field_f.field_o[var7] == 7) {
          var8_ref_kb = wf.field_c.a(var7, 126);
          if (var8_ref_kb != null) {
            var6 = var8_ref_kb.field_F + 1;
            var5 = var8_ref_kb.field_C;
          }
        }
        var7 = 0;
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (var7 >= 5))) {
          var8 = var7;
          stackIn_236_0 = 3;
          stackIn_236_1 = this.field_b;
          if (var20 == 0) {
            boolean decompiledFrameRemainder2 = true;
            if (stackIn_236_0 < stackIn_236_1) {
              if (var7 != 3) {
                if ((var7 == 4)) {
                  var8 = 6;
                }
                decompiledFrameRemainder2 = false;
              }
              else {
                var8 = 5;
              }
            }
            var9 = 56;
            var10 = ck.field_c[0].field_s;
            var11 = 320 - var10 / 2 - (var9 * 2 - var9 * var7);
            var12 = 405;
            if (jk.field_j[var8] >= 0) {
              ck.field_c[1].c(var11, var12);
              if (~this.field_f == ~var8) {
                ul.b(var11, var12, var10, var10, 3, 16777215, 128);
              }
              if (!(ua.field_a < var11) &&
                !(var12 > vl.field_d) &&
                !(ua.field_a >= var10 + var11) &&
                !(vl.field_d >= (var12 + var10))) {
                ul.d(var11 + 6, var12 + 6, var10 - 12, var10 - 12, 16777215, 128);
                var6 = 0;
                var5 = var8;
                if (of.field_G == 1 &&
                  var8 != this.field_f) {
                  this.field_f = var8;
                  gk.a(mh.field_a[2], (byte) -11);
                }
              }
            } else {
              ck.field_c[0].c(var11, var12);
            }
            ul.e(var11 + 6, var12, var11 + 46, 46 + var12);
            if (jk.field_j[var8] >= 3) {
              var12 += 10;
              var11 += 10;
              hf.field_g[0 + 7 * var8].d(var11, var12);
              if (var8 <= 3) {
                var12 += 4;
              }
              if (3 == var8) {
                var12 -= 4;
              }
              if (var8 == 5) {
                var29 = hf.field_g[7 * var8 + 6];
                var13_ref_hj = var29;
                var13_ref_hj.a(var29.field_s << 3, var29.field_t << 3, 16 + var11 << 4, 10 + var12 << 4, wf.field_c.field_i * 1000, 2048);
              } else {
                hf.field_g[7 * var8 + 6].a(512, 128, var11 + 16 << 4, var12 + 6 << 4, (int)(Math.sin(0.1 * (double)wf.field_c.field_i + (double)var8) * 10000.0), 2048);
              }
              if (var8 == 5) {
                var12 -= 2;
              }
              if (var8 <= 3) {
                var12 -= 4;
              }
              if (var8 == 2) {
                var12 -= 4;
              }
              if (var8 == 3) {
                var12 -= 2;
              }
              if (var8 == 4) {
                var12 -= 8;
              }
              hf.field_g[7 * var8 + 1].d(var11, var12);
            } else if (0 > jk.field_j[var8]) {
              al.field_d.a(10 + var11, var12 + 10);
            } else {
              var11 += 10;
              var12 += 10;
              hf.field_g[var8 * 7 + 0].d(var11, var12);
              if (var8 != 5) {
                hf.field_g[var8 * 7 + 2].a(512, 256, 16 + var11 << 4, 6 + var12 << 4, (int)(Math.sin(0.1 * (double)wf.field_c.field_i + (double)var8) * 10000.0), 2048);
              } else {
                var30 = hf.field_g[2 + 7 * var8];
                var13_ref_hj = var30;
                var13_ref_hj.a(var30.field_s << 3, var30.field_t << 3, var11 + 16 << 4, var12 + 10 << 4, wf.field_c.field_i * 1000, 2048);
              }
              if (var8 == 2) {
                var12 -= 4;
              }
              if (3 == var8) {
                var12 -= 6;
              }
              if (4 == var8) {
                var12 -= 8;
              }
              hf.field_g[var8 * 7 + 1].d(var11, var12);
            }
            ul.c();
            var7++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          ob.field_I.c(var31[var5][var6], 549, 380, 16777215, -1);
          stackIn_236_0 = 0;
          stackIn_236_1 = var5;
        }
        if (stackIn_236_0 != stackIn_236_1 &&
          var5 != 1 &&
          var5 != 4) {
          if (var5 == 3) {
            stackIn_243_0 = 2;
          } else {
            stackIn_243_0 = 1;
          }
        } else {
          stackIn_243_0 = 0;
        }
        var7 = stackIn_243_0;
        if (var5 == 6) {
          var7 = 3;
        }
        if (5 == var5) {
          var7 = 0;
        }
        var8 = 1;
        var9 = 5;
        var10 = 25;
        var11 = 40;
        var12 = 30;
        var13 = 0;
        switch (var5) {
          case 4:
            var12 = 30;
            var13 = -10;
            var11 = 45;
          default:
            break;
          case 5:
            var12 = 24;
            var13 = 0;
            var11 = 37;
            if (var20 == 0) {
              break;
            }
          case 3:
            var12 = 20;
            var13 = -10;
            if (var20 == 0) {
              break;
            }
          case 2:
            var12 = 25;
            var13 = -10;
            break;
        }
        switch (var5) {
          case 0:
            var8 = 5;
            var9 = 30;
            if (var6 != 2) {
              if (var6 == 3) {
                var8 = 20;
                if (var20 == 0) {
                  break;
                }
              }
              if (var6 != 4) {
                if (var6 != 5) {
                  break;
                }
                var8 = 40;
                if (var20 == 0) {
                  break;
                }
              }
              var8 = 25;
              if (var20 == 0) {
                break;
              }
            }
            var8 = 10;
            break;
          case 1:
            var8 = 12;
            var9 = 8;
            if (var6 != 2) {
              if (var6 == 3) {
                var9 = 12;
                var8 = 22;
                if (var20 == 0) {
                  break;
                }
              }
              if (4 != var6) {
                if (var6 != 5) {
                  break;
                }
                var9 = 16;
                var8 = 64;
                if (var20 == 0) {
                  break;
                }
              }
              var9 = 14;
              var8 = 32;
              if (var20 == 0) {
                break;
              }
            }
            var9 = 10;
            var8 = 16;
            break;
          case 4:
            var8 = 200;
            var9 = 30;
            if (var6 == 2) {
              var8 = 250;
              if (var20 == 0) {
                break;
              }
            }
            if (var6 != 3) {
              if (var6 == 4) {
                var8 = 500;
                if (var20 == 0) {
                  break;
                }
              }
              if (var6 != 5) {
                break;
              }
              var8 = 1000;
              if (var20 == 0) {
                break;
              }
            }
            var8 = 333;
          default:
            break;
          case 5:
            var8 = 5;
            var10 = 25;
            var9 = 6;
            if (var6 != 2) {
              if (3 != var6) {
                if (var6 != 4) {
                  if (var6 != 5) {
                    break;
                  }
                  var10 = 125;
                  var8 = 80;
                  if (var20 == 0) {
                    break;
                  }
                }
                var10 = 100;
                var8 = 40;
                if (var20 == 0) {
                  break;
                }
              }
              var8 = 20;
              var10 = 75;
              if (var20 == 0) {
                break;
              }
            }
            var10 = 50;
            var8 = 10;
            if (var20 == 0) {
              break;
            }
          case 3:
            var9 = 6;
            var8 = 1;
            if (var6 == 2) {
              var8 = 2;
              if (var20 == 0) {
                break;
              }
            }
            if (var6 != 3) {
              if (4 == var6) {
                var8 = 4;
                if (var20 == 0) {
                  break;
                }
              }
              if (5 != var6) {
                break;
              }
              var8 = 5;
              if (var20 == 0) {
                break;
              }
            }
            var8 = 3;
            if (var20 == 0) {
              break;
            }
          case 2:
            var9 = 20;
            var8 = 40;
            if (var6 != 2) {
              if (var6 != 3) {
                if (var6 == 4) {
                  var8 = 80;
                  var9 = 25;
                  if (var20 == 0) {
                    break;
                  }
                }
                if (var6 != 5) {
                  break;
                }
                var8 = 100;
                var9 = 30;
                if (var20 == 0) {
                  break;
                }
              }
              var8 = 70;
              if (var20 == 0) {
                break;
              }
            }
            var8 = 50;
            break;
        }
        hf.field_g[7 * var5].c(469, 405);
        if (var5 != 6) {
          var14_int = 4000;
          if (var5 == 5) {
            var14_int = 102100;
          }
          var15 = var6 + var5 * 7 + 1;
          if (var6 == 0) {
            var15++;
          }
          var16 = var11 + 465;
          var17 = 405 + var12;
          hf.field_g[var15].a(-85, var16, var17, var14_int, 4096);
        }
        hf.field_g[7 * var5 + 1].c(469, 405 + var13);
        if (var5 != 6) {
          if (var7 == 0) {
            jd.field_c.b(sd.field_d, 530, 420, 16777215, 0);
          }
          if (1 == var7) {
            jd.field_c.b(ei.field_b, 530, 420, 16777215, 0);
          }
          if (var7 == 2) {
            jd.field_c.b(t.field_k, 530, 420, 16777215, 0);
          }
          jd.field_c.a(Integer.toString(var8), 625, 420, 16777215, 0);
          if (var5 == 5) {
            jd.field_c.b(ca.field_a, 530, 440, 16777215, 0);
            jd.field_c.a(Integer.toString(var10), 625, 440, 16777215, 0);
            if (var20 != 0) {
              jd.field_c.b(ed.field_e, 530, 440, 16777215, 0);
              jd.field_c.a(Integer.toString(var9), 625, 440, 16777215, 0);
              jd.field_c.b(wg.field_n, 530, 420, 16777215, 0);
              jd.field_c.b(ed.field_d, 530, 440, 16777215, 0);
            }
          } else {
            jd.field_c.b(ed.field_e, 530, 440, 16777215, 0);
            jd.field_c.a(Integer.toString(var9), 625, 440, 16777215, 0);
            if (var20 != 0) {
              jd.field_c.b(wg.field_n, 530, 420, 16777215, 0);
              jd.field_c.b(ed.field_d, 530, 440, 16777215, 0);
            }
          }
        } else {
          jd.field_c.b(wg.field_n, 530, 420, 16777215, 0);
          jd.field_c.b(ed.field_d, 530, 440, 16777215, 0);
        }
        if (var6 <= jk.field_j[var5]) {
          var14_int = 16777215;
          if (wf.field_c.field_e[0].b(true) < ui.field_a[var5][var6]) {
            var14_int = 16711680;
          }
          jd.field_c.a(Integer.toString(ui.field_a[var5][var6]), 625, 460, var14_int, 0);
          jd.field_c.b(rh.field_a, 530, 460, var14_int, 0);
        }
        if (var6 >= 5) {
        }
        boolean decompiledFrameRemainder1 = true;
        if (wf.field_c.field_x > 0) {
          var14_int = -1;
          if (1 <= wf.field_c.field_x &&
            wf.field_c.field_x < 100) {
            var14_int = jc.field_f[this.field_b][wf.field_c.field_x - 1];
          }
          ul.e(8, 363, 172, 473);
          if (0 <= this.field_a &&
            this.field_a <= 11) {
            var15 = mg.a(this.field_a, (byte) -114);
            ab.field_g[var15 * 12 + da.field_b / 10 % wh.field_a[var15]].c(hi.field_m + 43, 363);
          }
          var15_ref = null;
          if (var3_int > 0) {
            var15_ref_String = t.a(param0 - 415993729, new String[]{Integer.toString(var3_int)}, d.field_h);
            if (this.field_a != var14_int) {
              if (hi.field_m == 0) {
                gk.a(mh.field_a[47], (byte) -11);
              }
              if (hi.field_m >= 0) {
                hi.field_m = hi.field_m + 10;
              }
              if (hi.field_m < 0 &&
                hi.field_m > -150) {
                hi.field_m = hi.field_m - 10;
              }
              if (hi.field_m > 150) {
                hi.field_m = -150;
              }
              if (!(hi.field_m > -150)) {
                gk.a(mh.field_a[46], (byte) -11);
                this.field_a = var14_int;
                if (var20 != 0) {
                  if (hi.field_m < 0) {
                    hi.field_m = hi.field_m + 10;
                  }
                  if (0 < hi.field_m) {
                    hi.field_m = hi.field_m - 10;
                  }
                }
              }
            } else {
              if (hi.field_m < 0) {
                hi.field_m = hi.field_m + 10;
              }
              if (0 < hi.field_m) {
                hi.field_m = hi.field_m - 10;
              }
            }
          } else {
            var15_ref_String = nl.field_c;
            if (hi.field_m == 0) {
              gk.a(mh.field_a[47], (byte) -11);
            }
            if (hi.field_m >= 0) {
              hi.field_m = hi.field_m + 10;
            }
            if (hi.field_m < 0 &&
              hi.field_m > -150) {
              hi.field_m = hi.field_m - 10;
            }
            if (hi.field_m > 150) {
              hi.field_m = -150;
            }
          }
          ob.field_I.a(var15_ref_String, 14, 362, 158, 105, 0, 0, 1, 2, 18);
          ob.field_I.a(var15_ref_String, 13, 363, 158, 105, 0, 0, 1, 2, 18);
          ob.field_I.a(var15_ref_String, 14, 363, 158, 105, 16777215, -1, 1, 2, 18);
          var16 = (wf.field_c.field_g - wf.field_c.field_i) / 50;
          if (var16 < 0) {
            var16 = 0;
          }
          var15_ref_String = t.a(param0 ^ -415993725, new String[]{Integer.toString(var16)}, nb.field_p);
          if (hi.field_m == -150 && (wf.field_c.field_x % 11 != 0 &&
            0 < wf.field_c.field_x ||
            wf.field_c.field_x == 0 ||
            wf.field_c.field_r.c(param0 ^ -3086) &&
            !(wf.field_c.field_e[0].field_f <= 0))) {
            var15_ref_String = p.field_b;
            ob.field_I.a(var15_ref_String, 14, Math.abs(hi.field_m) / 4 + 327, 158, 105, 0, 0, 1, 0, 16);
            ob.field_I.a(var15_ref_String, 13, 328 + Math.abs(hi.field_m) / 4, 158, 105, 0, 0, 1, 0, 16);
            ob.field_I.a(var15_ref_String, 14, Math.abs(hi.field_m) / 4 + 328, 158, 105, 16777215, -1, 1, 0, 16);
          }
          ul.c();
          decompiledFrameRemainder1 = (var20 != 0);
        }
        if (decompiledFrameRemainder1) {
          var32 = jm.field_c;
          var14 = var32;
          var14 = var32;
          ob.field_I.a(var32, 14, 332, 158, 105, 0, 0, 1, 2, 18);
          ob.field_I.a(var32, 13, 333, 158, 105, 0, 0, 1, 2, 18);
          ob.field_I.a(var32, 14, 333, 158, 105, 16777215, -1, 1, 2, 18);
          var15 = (wf.field_c.field_g - wf.field_c.field_i) / 50;
          if (0 > var15) {
            var15 = 0;
          }
          var14 = t.a(param0 - 415993729, new String[]{Integer.toString(var15)}, nb.field_p);
        }
        var37 = (oj) (wf.field_c.field_b.b((byte) 126));
        while (var37 != null) {
          var37.a((byte) 54, this.field_t, this.field_h);
          var37 = (oj) (wf.field_c.field_b.d(param0 ^ 855));
          if (var20 == 0) {
            continue;
          }
          break;
        }
        var14 = "";
        if (wf.field_c.field_e[0].b(true) < 1000) {
          var14 = Integer.toString(wf.field_c.field_e[0].b(true));
          if (var20 != 0) {
            if (wf.field_c.field_e[0].b(true) >= 9999) {
              var14 = ci.field_m;
              var14 = t.a(-415993727, new String[]{Integer.toString(wf.field_c.field_e[0].b(true) / 1000), Integer.toString(wf.field_c.field_e[0].b(true) / 100 % 10)}, rf.field_H);
            } else {
              var14 = t.a(-415993727, new String[]{Integer.toString(wf.field_c.field_e[0].b(true) / 1000), Integer.toString(wf.field_c.field_e[0].b(true) / 100 % 10)}, rf.field_H);
            }
          }
        } else {
          boolean decompiledSharedTail2 = !(wf.field_c.field_e[0].b(true) >= 9999);
          if (!decompiledSharedTail2) {
            var14 = ci.field_m;
            decompiledSharedTail2 = (var20 != 0);
          }
          if (decompiledSharedTail2) {
            var14 = t.a(-415993727, new String[]{Integer.toString(wf.field_c.field_e[0].b(true) / 1000), Integer.toString(wf.field_c.field_e[0].b(true) / 100 % 10)}, rf.field_H);
          }
        }
        ob.field_I.c(var14, 362, 30, 0, 0);
        ob.field_I.c(var14, 363, 29, 0, 0);
        ob.field_I.c(var14, 363, 30, 16777215, -1);
        if (0 == this.field_b ||
          this.field_b > 3) {
          al.field_d.a(598, 10);
          if (!df.field_f) {
            ul.i(614, 26, 16, 0, 128);
          }
          if (ua.field_a >= 598 &&
            vl.field_d >= 10 &&
            ua.field_a <= 630 &&
            vl.field_d <= 42) {
            ob.field_I.a(jg.field_n[25], 635, 49, 0, 0);
            ob.field_I.a(jg.field_n[25], 634, 50, 0, 0);
            ob.field_I.a(jg.field_n[25], 635, 50, 16777215, -1);
          }
        }
        if (1 != of.field_G) {
          this.field_j = false;
        }
        if (this.field_m != -1) {
          boolean decompiledSharedTail1 = (!(df.field_f) || (this.field_b != 0 &&
            !(this.field_m >= 16)));
          if (!decompiledSharedTail1) {
            var15 = 300;
            var16 = jd.field_c.a(sa.field_d[this.field_m], var15, 16);
            var17 = -var15 + 640;
            var18 = -var16 + 480 - 120;
            var19 = 8;
            ug.a(101, -(2 * var19) + var18, -(2 * var19) + var17, var16 + 2 * var19, var15 + var19 * 2);
            jd.field_c.a(sa.field_d[this.field_m], var17 - var19, -var19 + var18, var15, var16, 16777215, 0, 0, 1, 16);
            if (ua.field_a >= var17 - 2 * var19 &&
              vl.field_d >= (-(var19 * 2) + var18) &&
              ua.field_a < (var15 + var17) &&
              var16 + var18 > vl.field_d) {
              this.field_j = true;
            }
            decompiledSharedTail1 = (var20 != 0);
          }
          if (decompiledSharedTail1) {
            ob.field_I.c(pa.field_a[this.field_m], 320, 339, 0, 0);
            ob.field_I.c(pa.field_a[this.field_m], 319, 340, 0, 0);
            ob.field_I.c(pa.field_a[this.field_m], 320, 340, 16777215, -1);
          }
        }
        if (this.field_o > 0) {
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledSharedTail0 = !(wf.field_c.field_f.field_k > 0);
          if (!decompiledSharedTail0) {
            if (wf.field_c.field_x >= 90) {
              if (this.field_o >= 50) {
                stackIn_434_0 = 255;
              } else {
                stackIn_434_0 = 5 * this.field_o;
              }
              var15 = stackIn_434_0;
              if (this.field_o < 100) {
                stackIn_437_0 = 5 * this.field_o - 250;
              } else {
                stackIn_437_0 = 255;
              }
              var16 = stackIn_437_0;
              if (var16 < 0) {
                var16 = 0;
              }
              pj.field_u[0].c(0, 0, var15, var16);
              decompiledFrameRemainder0 = (var20 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (50 > this.field_o) {
                stackIn_443_0 = 5 * this.field_o;
              } else {
                stackIn_443_0 = 255;
              }
              var15 = stackIn_443_0;
              if (this.field_o < 100) {
                stackIn_446_0 = -250 + this.field_o * 5;
              } else {
                stackIn_446_0 = 255;
              }
              var16 = stackIn_446_0;
              if (0 > var16) {
                var16 = 0;
              }
              pj.field_u[2].c(0, 0, var15, var16);
              if (this.field_o <= 300) {
                ob.field_I.a(sl.field_Z, 149, -this.field_o + 500, 340, 200, 0, 0, 1, 1, 14);
                ob.field_I.a(sl.field_Z, 150, -this.field_o + 499, 340, 200, 0, 0, 1, 1, 14);
                ob.field_I.a(sl.field_Z, 150, -this.field_o + 500, 340, 200, 16777215, -1, 1, 1, 14);
              }
              if (this.field_o > 300) {
                ob.field_I.a(sl.field_Z, 149, 200, 340, 200, 0, 0, 1, 1, 14);
                ob.field_I.a(sl.field_Z, 150, 199, 340, 200, 0, 0, 1, 1, 14);
                ob.field_I.a(sl.field_Z, 150, 200, 340, 200, 16777215, -1, 1, 1, 14);
                ob.field_I.c(oh.field_d, 319, 450, 0, 0);
                ob.field_I.c(oh.field_d, 320, 449, 0, 0);
                ob.field_I.c(oh.field_d, 320, 450, 16777215, -1);
              }
              decompiledSharedTail0 = (var20 != 0);
            }
          }
          if ((decompiledFrameRemainder0) &&
            (decompiledSharedTail0)) {
            if (this.field_o >= 50) {
              stackIn_458_0 = 255;
            } else {
              stackIn_458_0 = this.field_o * 5;
            }
            var15 = stackIn_458_0;
            if (this.field_o >= 100) {
              stackIn_461_0 = 255;
            } else {
              stackIn_461_0 = 5 * this.field_o - 250;
            }
            var16 = stackIn_461_0;
            if (var16 < 0) {
              var16 = 0;
            }
            pj.field_u[1].c(0, 0, var15, var16);
          }
          if (400 < this.field_o) {
            ul.d(0, 0, 640, 480, 0, (this.field_o * 250 - 100000) / 100);
          }
        }
        return;
    }

    private final boolean a(int param0, int param1, int param2) {
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_34_0 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var4Lifetime1;
        int var6Lifetime1;
        var7 = OrbDefence.field_D ? 1 : 0;
        var5 = 0;
        while (true) {
          stackIn_2_0 = ~param0;
          stackIn_2_1 = ~var5;
          boolean decompiledFrameRemainder0 = true;
          if (stackIn_2_0 < stackIn_2_1) {
            stackIn_17_0 = 0;
            decompiledFrameRemainder0 = (var7 == 0);
            if (decompiledFrameRemainder0) {
              var6 = stackIn_17_0;
              while (param0 > var6) {
                var4 = wf.field_c.field_f.field_c * var6 + var5 + param2;
                stackIn_2_0 = -1;
                stackIn_2_1 = ~var4;
                if (stackIn_2_0 >= stackIn_2_1 &&
                  var4 < wf.field_c.field_f.field_i) {
                  if (wf.field_c.field_f.field_o[var4] != 1 &&
                    wf.field_c.field_f.field_o[var4] != 9) {
                    return false;
                  }
                  var6++;
                  continue;
                } else {
                  return false;
                }
              }
              var5++;
              continue;
            }
          }
          if (decompiledFrameRemainder0) {
            var5 = -1;
            stackIn_17_0 = param1;
          }
          if (stackIn_17_0 != 22727) {
            this.field_t = 89;
          }
          L9: while (true) {
            stackIn_20_0 = ~(1 + param0);
            if (stackIn_20_0 < ~var5) {
              stackIn_34_0 = -1;
              if (var7 != 0) {
                return stackIn_34_0 != 0;
              }
              var6Lifetime1 = stackIn_34_0;
              while ((1 + param0) > var6Lifetime1) {
                var4Lifetime1 = wf.field_c.field_f.field_c * var6Lifetime1 + param2 + var5;
                stackIn_20_0 = var4Lifetime1;
                if (stackIn_20_0 < 0) {
                  return false;
                }
                if (wf.field_c.field_f.field_i <= var4Lifetime1) {
                  return false;
                }
                if (wf.field_c.field_f.field_o[var4Lifetime1] == 7) {
                  return false;
                }
                var6Lifetime1++;
              }
              var5++;
              continue L9;
            }
            break;
          }
          return true;
        }
    }

    private final int a(int param0, int param1, byte param2) {
        int stackIn_2_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_57_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        int stackIn_78_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_80_1 = 0;
        int stackIn_103_0 = 0;
        int stackIn_103_1 = 0;
        int stackIn_116_0 = 0;
        int stackIn_131_0 = 0;
        int stackIn_133_0 = 0;
        int stackIn_133_1 = 0;
        int stackIn_157_0 = 0;
        int stackIn_159_0 = 0;
        int stackIn_171_0 = 0;
        int stackIn_171_1 = 0;
        int stackIn_187_0 = 0;
        int stackIn_189_0 = 0;
        int stackIn_213_0 = 0;
        int stackIn_215_0 = 0;
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
        int stackIn_24_0Lifetime1;
        int stackIn_78_0Lifetime1;
        int stackIn_131_0Lifetime1;
        int stackIn_157_0Lifetime1;
        int stackIn_187_0Lifetime1;
        int stackIn_213_0Lifetime1;
        int var4Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var13Lifetime2;
        int var14Lifetime2;
        int var15Lifetime2;
        int var13Lifetime1Lifetime1;
        int var13Lifetime1Lifetime2;
        int var14Lifetime1Lifetime1;
        int var14Lifetime1Lifetime2;
        int var15Lifetime1Lifetime1;
        int var15Lifetime1Lifetime2;
        var16 = OrbDefence.field_D ? 1 : 0;
        var4 = 0;
        var5 = 0;
        var6 = 0;
        var7 = 0;
        var8 = 0;
        var9 = 0;
        var10 = 0;
        var11 = param0 + 16;
        var12 = param0 + 1;
        while (true) {
          stackIn_2_0 = ~var11;
          boolean decompiledFrameRemainder1 = true;
          L3: {
            if (stackIn_2_0 < ~var12) {
              stackIn_49_0 = -1;
              stackIn_49_1 = ~(var12 % wf.field_c.field_f.field_c);
              decompiledFrameRemainder1 = (var16 == 0);
              if (decompiledFrameRemainder1) {
                if (stackIn_49_0 == stackIn_49_1) {
                  var5 = 0;
                } else {
                  var14 = -1;
                  L5: while (true) {
                    stackIn_9_0 = var14;
                    stackIn_9_1 = 1 + param1;
                    if (stackIn_9_0 < stackIn_9_1) {
                      stackIn_24_0 = -1;
                      var15 = stackIn_24_0;
                      while (1 + param1 > var15) {
                        var13 = var14 + (var12 + wf.field_c.field_f.field_c * var15);
                        stackIn_9_0 = 0;
                        stackIn_9_1 = var13;
                        if (stackIn_9_0 > stackIn_9_1 ||
                          !(var13 < wf.field_c.field_f.field_i)) {
                          var5 = 0;
                          break L3;
                        }
                        if (wf.field_c.field_f.field_o[var13] == 7) {
                          var5 = 0;
                          break L3;
                        }
                        var15++;
                      }
                      var14++;
                      continue L5;
                    }
                    break;
                  }
                  stackIn_24_0Lifetime1 = 0;
                  var14Lifetime2 = stackIn_24_0Lifetime1;
                  L14: while (true) {
                    stackIn_26_0 = param1;
                    stackIn_26_1 = var14Lifetime2;
                    if (stackIn_26_0 > stackIn_26_1) {
                      stackIn_2_0 = 0;
                      var15Lifetime2 = stackIn_2_0;
                      while (var15Lifetime2 < param1) {
                        var13Lifetime2 = var14Lifetime2 + var12 + wf.field_c.field_f.field_c * var15Lifetime2;
                        stackIn_26_0 = 0;
                        stackIn_26_1 = var13Lifetime2;
                        if (stackIn_26_0 > stackIn_26_1 ||
                          !(wf.field_c.field_f.field_i > var13Lifetime2)) {
                          var5 = 0;
                          break L3;
                        }
                        if (wf.field_c.field_f.field_o[var13Lifetime2] != 0) {
                          var10 = 0;
                        } else {
                          if (var9 != 0 &&
                            var10 == 0) {
                            var5 = 0;
                            break L3;
                          }
                          var9 = 1;
                          var10 = 1;
                        }
                        if (wf.field_c.field_f.field_o[var13Lifetime2] == 1) {
                          break L3;
                        }
                        if (wf.field_c.field_f.field_o[var13Lifetime2] == 9) {
                          break L3;
                        }
                        var15Lifetime2++;
                      }
                      var14Lifetime2++;
                      continue L14;
                    }
                    break;
                  }
                  var5++;
                  var12++;
                  continue;
                }
              }
            }
          }
          if (decompiledFrameRemainder1) {
            stackIn_49_0 = ~var5;
            stackIn_49_1 = -1;
          }
          if (stackIn_49_0 < stackIn_49_1) {
            var5++;
          }
          if (16 == var5 ||
            var9 == 0) {
            var5 = 0;
          }
          var10 = 0;
          var9 = 0;
          var12 = -1 + param0;
          while (true) {
            stackIn_57_0 = var12;
            boolean decompiledFrameRemainder0 = true;
            L30: {
              if (stackIn_57_0 > -16 + param0) {
                stackIn_103_0 = -1;
                stackIn_103_1 = ~(var12 % wf.field_c.field_f.field_c);
                decompiledFrameRemainder0 = (var16 == 0);
                if (decompiledFrameRemainder0) {
                  if (stackIn_103_0 == stackIn_103_1) {
                    var6 = 0;
                  } else {
                    var14Lifetime1 = -1;
                    L32: while (true) {
                      stackIn_63_0 = var14Lifetime1;
                      stackIn_63_1 = 1 + param1;
                      if (stackIn_63_0 < stackIn_63_1) {
                        stackIn_78_0 = -1;
                        var15Lifetime1 = stackIn_78_0;
                        while ((1 + param1) > var15Lifetime1) {
                          var13Lifetime1 = var12 + var14Lifetime1 + var15Lifetime1 * wf.field_c.field_f.field_c;
                          stackIn_63_0 = -1;
                          stackIn_63_1 = ~var13Lifetime1;
                          if (stackIn_63_0 < stackIn_63_1 ||
                            !(var13Lifetime1 < wf.field_c.field_f.field_i)) {
                            var6 = 0;
                            break L30;
                          }
                          if (wf.field_c.field_f.field_o[var13Lifetime1] == 7) {
                            var6 = 0;
                            break L30;
                          }
                          var15Lifetime1++;
                        }
                        var14Lifetime1++;
                        continue L32;
                      }
                      break;
                    }
                    stackIn_78_0Lifetime1 = 0;
                    var14Lifetime1 = stackIn_78_0Lifetime1;
                    L41: while (true) {
                      stackIn_80_0 = ~param1;
                      stackIn_80_1 = ~var14Lifetime1;
                      if (stackIn_80_0 < stackIn_80_1) {
                        stackIn_57_0 = 0;
                        var15Lifetime1 = stackIn_57_0;
                        while (var15Lifetime1 < param1) {
                          var13Lifetime1 = wf.field_c.field_f.field_c * var15Lifetime1 + (var14Lifetime1 + var12);
                          stackIn_80_0 = ~var13Lifetime1;
                          stackIn_80_1 = -1;
                          if (stackIn_80_0 > stackIn_80_1 ||
                            !(var13Lifetime1 < wf.field_c.field_f.field_i)) {
                            var6 = 0;
                            break L30;
                          }
                          if (wf.field_c.field_f.field_o[var13Lifetime1] != 0) {
                            var10 = 0;
                          } else {
                            if (var9 != 0 &&
                              var10 == 0) {
                              var6 = 0;
                              break L30;
                            }
                            var10 = 1;
                            var9 = 1;
                          }
                          if (wf.field_c.field_f.field_o[var13Lifetime1] == 1) {
                            break L30;
                          }
                          if (wf.field_c.field_f.field_o[var13Lifetime1] == 9) {
                            break L30;
                          }
                          var15Lifetime1++;
                        }
                        var14Lifetime1++;
                        continue L41;
                      }
                      break;
                    }
                    var6++;
                    var12--;
                    continue;
                  }
                }
              }
            }
            if (decompiledFrameRemainder0) {
              stackIn_103_0 = 0;
              stackIn_103_1 = var6;
            }
            if (stackIn_103_0 < stackIn_103_1) {
              var6++;
            }
            if (var6 == 16 ||
              var9 == 0) {
              var6 = 0;
            }
            var9 = 0;
            var10 = 0;
            if (param2 >= -13) {
              this.field_l = -57;
            }
            var12 = param0 + wf.field_c.field_f.field_c;
            L55: while (true) {
              L57: {
                if (var12 < (param0 + 16 * wf.field_c.field_f.field_c)) {
                  stackIn_159_0 = -1;
                  if (var16 != 0) {
                    break L55;
                  }
                  var14Lifetime1Lifetime1 = stackIn_159_0;
                  L58: while (true) {
                    stackIn_116_0 = var14Lifetime1Lifetime1;
                    if (stackIn_116_0 < param1 + 1) {
                      stackIn_131_0 = -1;
                      var15Lifetime1Lifetime1 = stackIn_131_0;
                      while (var15Lifetime1Lifetime1 < 1 + param1) {
                        var13Lifetime1Lifetime1 = wf.field_c.field_f.field_c * var15Lifetime1Lifetime1 + (var14Lifetime1Lifetime1 + var12);
                        stackIn_116_0 = var13Lifetime1Lifetime1;
                        if (stackIn_116_0 < 0 ||
                          !(var13Lifetime1Lifetime1 < wf.field_c.field_f.field_i)) {
                          var7 = 0;
                          break L57;
                        }
                        if (7 == wf.field_c.field_f.field_o[var13Lifetime1Lifetime1]) {
                          var7 = 0;
                          break L57;
                        }
                        var15Lifetime1Lifetime1++;
                      }
                      var14Lifetime1Lifetime1++;
                      continue L58;
                    }
                    break;
                  }
                  stackIn_131_0Lifetime1 = 0;
                  var14Lifetime1Lifetime1 = stackIn_131_0Lifetime1;
                  L67: while (true) {
                    stackIn_133_0 = ~var14Lifetime1Lifetime1;
                    stackIn_133_1 = ~param1;
                    if (stackIn_133_0 > stackIn_133_1) {
                      stackIn_157_0 = 0;
                      var15Lifetime1Lifetime1 = stackIn_157_0;
                      while (var15Lifetime1Lifetime1 < param1) {
                        var13Lifetime1Lifetime1 = wf.field_c.field_f.field_c * var15Lifetime1Lifetime1 + var12 + var14Lifetime1Lifetime1;
                        stackIn_133_0 = ~var13Lifetime1Lifetime1;
                        stackIn_133_1 = -1;
                        if (stackIn_133_0 > stackIn_133_1 ||
                          !(var13Lifetime1Lifetime1 < wf.field_c.field_f.field_i)) {
                          var7 = 0;
                          break L57;
                        }
                        if (wf.field_c.field_f.field_o[var13Lifetime1Lifetime1] == 0) {
                          if (var9 != 0 &&
                            var10 == 0) {
                            var7 = 0;
                            break L57;
                          }
                          var10 = 1;
                          var9 = 1;
                        } else {
                          var10 = 0;
                        }
                        if (wf.field_c.field_f.field_o[var13Lifetime1Lifetime1] == 1) {
                          break L57;
                        }
                        if (9 == wf.field_c.field_f.field_o[var13Lifetime1Lifetime1] &&
                          var16 == 0) {
                          break L57;
                        }
                        var15Lifetime1Lifetime1++;
                      }
                      var14Lifetime1Lifetime1++;
                      continue L67;
                    }
                    break;
                  }
                  var7++;
                  stackIn_157_0Lifetime1 = var12 + wf.field_c.field_f.field_c;
                  var12 = stackIn_157_0Lifetime1;
                  continue L55;
                }
              }
              stackIn_159_0 = 0;
              break;
            }
            if (stackIn_159_0 < var7) {
              var7++;
            }
            if (var7 == 16 ||
              var9 == 0) {
              var7 = 0;
            }
            var9 = 0;
            var10 = 0;
            var12 = param0 - wf.field_c.field_f.field_c;
            L82: while (true) {
              L84: {
                if ((param0 - 16 * wf.field_c.field_f.field_c) < var12) {
                  stackIn_215_0 = -1;
                  if (var16 != 0) {
                    break L82;
                  }
                  var14Lifetime1Lifetime2 = stackIn_215_0;
                  L85: while (true) {
                    stackIn_171_0 = ~var14Lifetime1Lifetime2;
                    stackIn_171_1 = ~(param1 + 1);
                    if (stackIn_171_0 > stackIn_171_1) {
                      stackIn_187_0 = -1;
                      var15Lifetime1Lifetime2 = stackIn_187_0;
                      while (var15Lifetime1Lifetime2 < (1 + param1)) {
                        var13Lifetime1Lifetime2 = var14Lifetime1Lifetime2 + (var12 + var15Lifetime1Lifetime2 * wf.field_c.field_f.field_c);
                        stackIn_171_0 = -1;
                        stackIn_171_1 = ~var13Lifetime1Lifetime2;
                        if (stackIn_171_0 < stackIn_171_1 ||
                          !(var13Lifetime1Lifetime2 < wf.field_c.field_f.field_i)) {
                          var8 = 0;
                          break L84;
                        }
                        if (wf.field_c.field_f.field_o[var13Lifetime1Lifetime2] == 7) {
                          var8 = 0;
                          break L84;
                        }
                        var15Lifetime1Lifetime2++;
                      }
                      var14Lifetime1Lifetime2++;
                      continue L85;
                    }
                    break;
                  }
                  stackIn_187_0Lifetime1 = 0;
                  var14Lifetime1Lifetime2 = stackIn_187_0Lifetime1;
                  L94: while (true) {
                    stackIn_189_0 = param1;
                    if (stackIn_189_0 > var14Lifetime1Lifetime2) {
                      stackIn_213_0 = 0;
                      var15Lifetime1Lifetime2 = stackIn_213_0;
                      while (var15Lifetime1Lifetime2 < param1) {
                        var13Lifetime1Lifetime2 = wf.field_c.field_f.field_c * var15Lifetime1Lifetime2 + (var12 + var14Lifetime1Lifetime2);
                        stackIn_189_0 = var13Lifetime1Lifetime2;
                        if (stackIn_189_0 < 0 ||
                          !(wf.field_c.field_f.field_i > var13Lifetime1Lifetime2)) {
                          var8 = 0;
                          break L84;
                        }
                        if (0 != wf.field_c.field_f.field_o[var13Lifetime1Lifetime2]) {
                          var10 = 0;
                        } else {
                          if (var9 != 0 &&
                            var10 == 0) {
                            var8 = 0;
                            break L84;
                          }
                          var9 = 1;
                          var10 = 1;
                        }
                        if (1 == wf.field_c.field_f.field_o[var13Lifetime1Lifetime2]) {
                          break L84;
                        }
                        if (wf.field_c.field_f.field_o[var13Lifetime1Lifetime2] == 9 &&
                          var16 == 0) {
                          break L84;
                        }
                        var15Lifetime1Lifetime2++;
                      }
                      var14Lifetime1Lifetime2++;
                      continue L94;
                    }
                    break;
                  }
                  var8++;
                  stackIn_213_0Lifetime1 = var12 - wf.field_c.field_f.field_c;
                  var12 = stackIn_213_0Lifetime1;
                  continue L82;
                }
              }
              stackIn_215_0 = 0;
              break;
            }
            if (stackIn_215_0 < var8) {
              var8++;
            }
            if (var8 == 16 ||
              var9 == 0) {
              var8 = 0;
            }
            var4Lifetime1 = var5 + ((var8 << 24) + (var7 << 16)) + (var6 << 8);
            return var4Lifetime1;
          }
        }
    }

    final void b(int param0, boolean param1) {
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        boolean stackIn_48_0 = false;
        int stackIn_110_0 = 0;
        boolean stackIn_276_0 = false;
        int stackIn_284_0 = 0;
        int stackIn_291_0 = 0;
        int stackIn_291_1 = 0;
        int stackIn_409_0 = 0;
        int stackIn_422_0 = 0;
        int stackIn_436_0 = 0;
        int stackIn_450_0 = 0;
        int stackIn_461_0 = 0;
        kb stackIn_498_0 = null;
        f stackIn_531_0 = null;
        int stackIn_532_0 = 0;
        int stackIn_532_1 = 0;
        int stackIn_546_0 = 0;
        int stackIn_546_1 = 0;
        int stackIn_553_0 = 0;
        boolean stackOut_275_0;
        int var3 = 0;
        pd var3_ref_pd = null;
        int var4 = 0;
        pd var4_ref_pd = null;
        int var5 = 0;
        pd var6_ref_pd = null;
        int var6 = 0;
        int var7_int = 0;
        lb var7 = null;
        int var8 = 0;
        kb var9_ref_kb = null;
        int var9 = 0;
        int var10_int = 0;
        int[] var10 = null;
        kb var11_ref_kb = null;
        int var11 = 0;
        int var12 = 0;
        im var12_ref_im = null;
        int var13_int = 0;
        Object var13 = null;
        int var14_int = 0;
        Object var14 = null;
        int var15_int = 0;
        kb var15 = null;
        Object var15_ref = null;
        int var16 = 0;
        kb var16_ref_kb = null;
        int var17_int = 0;
        kb var17 = null;
        int var18 = 0;
        int var19 = 0;
        lb[] var21 = null;
        pd var22 = null;
        kb var23 = null;
        Object var24 = null;
        kb var24_ref = null;
        Object var25 = null;
        kb var25_ref = null;
        kb var26 = null;
        Object var27 = null;
        kb var27_ref = null;
        im var28 = null;
        Object var29 = null;
        kb var29_ref = null;
        Object var14Lifetime1;
        kb var15Lifetime1;
        Object var14Lifetime2;
        int stackIn_532_0Lifetime1;
        int stackIn_532_1Lifetime1;
        int stackIn_546_0Lifetime1;
        int stackIn_546_1Lifetime1;
        int var3Lifetime1;
        int var3Lifetime2;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var5Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var10_intLifetime1;
        int var12Lifetime1;
        int var13_intLifetime1;
        int var17_intLifetime1;
        int stackIn_532_0Lifetime2;
        int stackIn_532_1Lifetime2;
        int var3Lifetime3;
        int var4Lifetime4;
        int var5Lifetime2;
        int var10_intLifetime2;
        int var10_intLifetime3;
        int var10_intLifetime4;
        int var12Lifetime2;
        int var4Lifetime3Lifetime1;
        int var4Lifetime3Lifetime2;
        int var5Lifetime1Lifetime1;
        int var7_intLifetime1Lifetime1;
        int var8Lifetime1Lifetime1;
        var24 = null;
        var25 = null;
        var27 = null;
        var29 = null;
        var19 = OrbDefence.field_D ? 1 : 0;
        if (va.field_d >= 2) {
          if (ek.field_a[12]) {
            ob.field_F = true;
          }
          if (ek.field_a[11]) {
            ob.field_F = false;
          }
        }
        boolean decompiledFrameCompleted6 = true;
        if (0 >= this.field_n) {
          this.field_n = 10;
          if (!(wf.field_c.field_x >= 99) && (0 != wf.field_c.field_x % 11 ||
            wf.field_c.field_r.c(-3088))) {
            var3 = wf.field_c.field_f.field_s[wf.field_c.field_x % wf.field_c.field_f.field_s.length];
            var4 = var3 % wf.field_c.field_f.field_c;
            var5 = var3 / wf.field_c.field_f.field_c;
            var22 = new pd(var4, var5, wf.field_c, 12, 1);
            var22 = var22;
            var22.field_o = 1;
            this.field_v.a(-118, var22);
            if (jc.field_f[this.field_b][wf.field_c.field_x] == 1) {
              var7_int = 1;
              if (wf.field_c.field_x % 11 == 10) {
                var7_int = 3;
              }
              var8 = 1;
              while (var8 <= var7_int) {
                var3Lifetime3 = wf.field_c.field_f.field_s[(var8 + wf.field_c.field_x) % wf.field_c.field_f.field_s.length];
                var5Lifetime2 = var3Lifetime3 / wf.field_c.field_f.field_c;
                var4Lifetime4 = var3Lifetime3 % wf.field_c.field_f.field_c;
                var6_ref_pd = new pd(var4Lifetime4, var5Lifetime2, wf.field_c, 12, 1);
                var6_ref_pd.field_o = 1;
                this.field_v.a(-81, var6_ref_pd);
                var8++;
                if (var19 != 0) {
                  decompiledFrameCompleted6 = false;
                  break;
                }
              }
            }
            if ((decompiledFrameCompleted6) &&
              (var19 != 0)) {
              this.field_n = this.field_n - 1;
            }
          }
        } else {
          this.field_n = this.field_n - 1;
        }
        var3_ref_pd = (pd) (this.field_v.b((byte) -39));
        L9: while (true) {
          if (var3_ref_pd != null) {
            var3_ref_pd.c(1);
            stackIn_37_0 = 6;
            stackIn_37_1 = wf.field_c.field_f.field_o[var3_ref_pd.field_t];
            if (var19 == 0) {
              if (stackIn_37_0 == stackIn_37_1) {
                var3_ref_pd.field_o = 0;
              }
              var3_ref_pd = (pd) (this.field_v.d(param0 - 27950));
              continue;
            }
          } else {
            var3_ref_pd = (pd) (this.field_v.d((byte) -122));
            while (var3_ref_pd != null) {
              stackIn_37_0 = ~var3_ref_pd.field_o;
              stackIn_37_1 = -1;
              if (var19 != 0) {
                break L9;
              }
              if (stackIn_37_0 >= stackIn_37_1) {
                var3_ref_pd.b(57);
              }
              var3_ref_pd = (pd) (this.field_v.b(10708));
            }
            stackIn_37_0 = ~this.field_b;
            stackIn_37_1 = -1;
          }
          break;
        }
        if ((stackIn_37_0 == stackIn_37_1 ||
          3 < this.field_b) &&
          (ua.field_a >= 598 &&
          vl.field_d >= 10 &&
          ua.field_a <= 630 &&
          vl.field_d <= 42 &&
          1 == gi.field_e)) {
          stackIn_48_0 = !(df.field_f);
          df.field_f = stackIn_48_0;
          gk.a(mh.field_a[2], (byte) -11);
        }
        boolean decompiledFrameRemainder3 = true;
        if (this.field_u > 0) {
          this.field_u = this.field_u - 1;
          wf.field_c.field_i = 0;
          if (this.field_b <= 3) {
            if (this.field_u <= 100) {
              this.field_t = -3 + (63 * this.field_t + 320) / 64;
              decompiledFrameRemainder3 = (var19 != 0);
            }
            if (decompiledFrameRemainder3) {
              this.field_t = (-320 + 63 * this.field_t + ol.field_e * (wf.field_c.field_f.field_c - 1)) / 64 + 3;
              decompiledFrameRemainder3 = (var19 != 0);
            }
          }
          if (decompiledFrameRemainder3) {
            if (this.field_u <= 300) {
              if (this.field_u > 200) {
                this.field_h = (-120 + this.field_h * 63 + ol.field_e * (-1 + wf.field_c.field_f.field_t)) / 64 + 3;
                decompiledFrameRemainder3 = (var19 != 0);
              }
              if (decompiledFrameRemainder3) {
                if (this.field_u > 100) {
                  this.field_t = (320 + 63 * this.field_t) / 64 - 3;
                  if (var19 != 0) {
                    this.field_h = -3 + (120 + this.field_h * 63) / 64;
                    this.field_t = (-320 + ol.field_e * (-1 + wf.field_c.field_f.field_c) + this.field_t * 63) / 64 + 3;
                  }
                } else {
                  this.field_h = -3 + (120 + this.field_h * 63) / 64;
                  if (var19 != 0) {
                    this.field_t = (-320 + ol.field_e * (-1 + wf.field_c.field_f.field_c) + this.field_t * 63) / 64 + 3;
                  }
                }
              }
            } else {
              this.field_t = (-320 + ol.field_e * (-1 + wf.field_c.field_f.field_c) + this.field_t * 63) / 64 + 3;
            }
          }
        }
        if (wf.field_c.field_f.field_k == 0) {
          wf.field_c.field_k = true;
        }
        if (l.field_c > 0) {
          l.field_c = l.field_c - 1;
        }
        if (wf.field_c.field_k) {
          if (this.field_o == 0) {
            hi.a(ee.field_b[14], 2, false, 1, false, 2);
            if (wf.field_c.field_f.field_k > 0 &&
              wf.field_c.field_x > 44) {
              wf.field_c.field_x = wf.field_c.field_f.field_k / 25 + 99;
              if (this.field_b == 0) {
                f.a(6, 249, (byte) -25);
              }
              if (0 == this.field_b &&
                wf.field_c.field_f.field_k >= 125) {
                f.a(7, 248, (byte) -25);
              }
              if (3 == this.field_b) {
                f.a(8, 247, (byte) -25);
              }
              if (wf.field_c.field_s == 0 &&
                this.field_b == 0) {
                f.a(16, 239, (byte) -25);
              }
            }
          }
          this.field_o = this.field_o + 1;
          if (this.field_o == 400 &&
            0 < wf.field_c.field_f.field_k &&
            44 >= wf.field_c.field_x &&
            of.field_G == 0 &&
            !ek.field_a[13]) {
            this.field_o = 399;
          }
          if (this.field_o <= 500) {
            return;
          }
          if (n.b((byte) 93)) {
            rh.a((byte) -91, 6, true);
            if (var19 != 0) {
              il.field_f.c(-1);
              kj.field_x = null;
              if (dm.field_f != 0) {
                rh.a((byte) 113, 5, true);
                rh.a((byte) -45, 2, true);
              } else {
                rh.a((byte) -45, 2, true);
              }
            }
          } else {
            il.field_f.c(-1);
            kj.field_x = null;
            if (dm.field_f != 0) {
              rh.a((byte) 113, 5, true);
              if (var19 != 0) {
                rh.a((byte) -45, 2, true);
              }
            } else {
              rh.a((byte) -45, 2, true);
            }
          }
          stackIn_110_0 = (tc.field_b > 0) ? 0 : 7;
          bk.field_e = stackIn_110_0;
          return;
        }
        da.field_b = da.field_b + 1;
        if ((!df.field_f ||
          this.field_b != 0 &&
          this.field_m < 16) && this.field_m != -1) {
          this.field_c = this.field_c + 1;
          if (this.field_c > 250) {
            this.field_c = 0;
            this.field_m = -1;
          }
        }
        if (0 == this.field_b) {
          if (0 == hm.field_C &&
            wf.field_c.field_i == 0 &&
            this.field_c == 0 &&
            !this.field_k &&
            this.field_m == -1) {
            this.field_m = 0;
            this.field_c = 0;
          }
          boolean decompiledFrameRemainder2 = true;
          if ((hm.field_C == 0 &&
            wf.field_c.field_o.c((byte) 52) < 10 &&
            wf.field_c.field_e[0].b(true) > 30 &&
            wf.field_c.field_b.c(-3088)) &&
            (decompiledFrameRemainder2 = (this.field_m == -1))) {
            this.field_m = 1;
            this.field_c = 0;
            decompiledFrameRemainder2 = (var19 != 0);
          }
          if ((decompiledFrameRemainder2) &&
            (hm.field_C == 0)) {
            if (this.field_m != 2) {
              if ((wf.field_c.field_o.c((byte) 52) > 3 &&
                wf.field_c.field_e[0].b(true) <= 30 ||
                !(wf.field_c.field_o.c((byte) 52) < 10)) && (wf.field_c.field_b.c(-3088))) {
                if (this.field_m == -1 ||
                  this.field_m == 1) {
                  this.field_m = 2;
                  this.field_c = 0;
                }
                if (this.field_j &&
                  gi.field_e == 1) {
                  hm.field_C = 1;
                  this.field_m = -1;
                }
              }
            } else {
              if (this.field_m == -1 ||
                this.field_m == 1) {
                this.field_m = 2;
                this.field_c = 0;
              }
              if (this.field_j &&
                gi.field_e == 1) {
                hm.field_C = 1;
                this.field_m = -1;
              }
            }
          }
          if (hm.field_C == 1) {
            this.field_c = 0;
            this.field_m = 3;
            if (wf.field_c.field_x > 1) {
              hm.field_C = 2;
              this.field_m = -1;
            }
          }
          if (2 == hm.field_C) {
            if (this.field_j &&
              gi.field_e == 1) {
              this.field_m = -1;
            }
            if (wf.field_c.field_x == 2) {
              hm.field_C = 3;
              this.field_m = 15;
              this.field_c = 0;
            }
          }
          if (hm.field_C == 3) {
            if (this.field_j &&
              gi.field_e == 1) {
              this.field_m = -1;
            }
            if (wf.field_c.field_x == 5) {
              this.field_m = 5;
              hm.field_C = 4;
              this.field_c = 0;
            }
          }
          if (hm.field_C == 4) {
            if (this.field_j &&
              1 == gi.field_e) {
              this.field_m = -1;
            }
            if (wf.field_c.field_x == 10 &&
              fd.field_b < 500 + wf.field_c.field_i ||
              !(wf.field_c.field_x < 11)) {
              this.field_m = 4;
              this.field_c = 0;
              hm.field_C = 5;
            }
          }
          if (this.field_m == -1 &&
            !(wf.field_c.field_f.field_k >= 125) &&
            !this.field_g) {
            this.field_g = true;
            this.field_c = 0;
            this.field_m = 6;
            if (var19 != 0 && (this.field_b > 3 &&
              hm.field_C == 0 &&
              0 == wf.field_c.field_i &&
              0 == this.field_c &&
              !this.field_k &&
              this.field_m == -1)) {
              this.field_m = 18;
              this.field_c = 0;
            }
          }
        } else {
          if (this.field_b > 3 &&
            hm.field_C == 0 &&
            0 == wf.field_c.field_i &&
            0 == this.field_c &&
            !this.field_k &&
            this.field_m == -1) {
            this.field_m = 18;
            this.field_c = 0;
          }
        }
        if (this.field_m == -1 && (wf.field_c.field_r.c(-3088) ||
          0 != wf.field_c.field_x % 11) && wf.field_c.field_f.field_k > 0) {
          boolean decompiledFrameRemainder1 = true;
          if (!(wf.field_c.field_x >= 11) ||
            !(jk.field_j[2] < 2)) {
            if (this.field_b >= 4 ||
              !(wf.field_c.field_x >= 22) ||
              !(2 > jk.field_j[3])) {
              if (this.field_b < 4 &&
                wf.field_c.field_x >= 33 &&
                2 > jk.field_j[4]) {
                jk.field_j[4] = 2;
                this.field_m = 9;
                decompiledFrameRemainder1 = (var19 != 0);
              }
              if (decompiledFrameRemainder1) {
                if (4 <= this.field_b &&
                  wf.field_c.field_x >= 22 &&
                  jk.field_j[5] < 2) {
                  jk.field_j[5] = 2;
                  this.field_m = 16;
                  decompiledFrameRemainder1 = (var19 != 0);
                }
                if (decompiledFrameRemainder1) {
                  if (wf.field_c.field_x >= 44 &&
                    jk.field_j[0] < 4) {
                    this.field_m = 10;
                    jk.field_j[0] = 4;
                    decompiledFrameRemainder1 = (var19 != 0);
                  }
                  if (decompiledFrameRemainder1) {
                    if (!(wf.field_c.field_x >= 55) ||
                      !(jk.field_j[1] < 4)) {
                      if (wf.field_c.field_x >= 66 &&
                        jk.field_j[2] < 4) {
                        this.field_m = 12;
                        jk.field_j[2] = 4;
                        decompiledFrameRemainder1 = (var19 != 0);
                      }
                      if (decompiledFrameRemainder1) {
                        if (this.field_b >= 4 ||
                          !(77 <= wf.field_c.field_x) ||
                          !(jk.field_j[3] < 4)) {
                          if (this.field_b < 4 &&
                            wf.field_c.field_x >= 88 &&
                            jk.field_j[4] < 4) {
                            jk.field_j[4] = 4;
                            this.field_m = 14;
                            decompiledFrameRemainder1 = (var19 != 0);
                          }
                          if ((decompiledFrameRemainder1) &&
                            (decompiledFrameRemainder1 = !(4 > this.field_b)) &&
                            (decompiledFrameRemainder1 = !(wf.field_c.field_x < 77)) &&
                            (decompiledFrameRemainder1 = !(jk.field_j[5] >= 4))) {
                            this.field_m = 17;
                            jk.field_j[5] = 4;
                            decompiledFrameRemainder1 = (var19 != 0);
                          }
                        }
                        if (decompiledFrameRemainder1) {
                          jk.field_j[3] = 4;
                          this.field_m = 13;
                          if (var19 != 0) {
                            this.field_m = 11;
                            jk.field_j[1] = 4;
                            this.field_m = 8;
                            jk.field_j[3] = 2;
                            jk.field_j[2] = 2;
                            this.field_m = 7;
                          }
                        }
                      }
                    } else {
                      this.field_m = 11;
                      jk.field_j[1] = 4;
                      if (var19 != 0) {
                        this.field_m = 8;
                        jk.field_j[3] = 2;
                        jk.field_j[2] = 2;
                        this.field_m = 7;
                      }
                    }
                  }
                }
              }
            } else {
              this.field_m = 8;
              jk.field_j[3] = 2;
              if (var19 != 0) {
                jk.field_j[2] = 2;
                this.field_m = 7;
              }
            }
          } else {
            jk.field_j[2] = 2;
            this.field_m = 7;
          }
          if (-1 != this.field_m) {
            this.field_c = 0;
          }
        }
        nh.field_b = nh.field_b + 1;
        mm.field_C = mm.field_C + 1;
        if ((4 <= this.field_m ||
          0 == this.field_m) && (this.field_j &&
          gi.field_e == 1)) {
          this.field_k = true;
          this.field_m = -1;
        }
        if (ek.field_a[56] &&
          2 <= va.field_d) {
          var3Lifetime1 = 0;
          while (true) {
            if (jk.field_j.length > var3Lifetime1) {
              jk.field_j[var3Lifetime1] = 4;
              var3Lifetime1++;
              if (var19 == 0) {
                continue;
              }
            } else {
              jk.field_j[-1 + jk.field_j.length] = 0;
              fc.field_d = true;
              this.field_s.a((byte) -6, 1000);
            }
            break;
          }
          gk.a(mh.field_a[1], (byte) -11);
        }
        if (!this.field_s.b(-59)) {
          fc.field_d = true;
        }
        var3Lifetime2 = 0;
        if (param0 != 28803) {
          this.field_v = (im) null;
        }
        var4_ref_pd = (pd) (wf.field_c.field_r.b((byte) -85));
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (var4_ref_pd == null))) {
          stackOut_275_0 = ek.field_a[55];
          stackIn_284_0 = stackOut_275_0 ? 1 : 0;
          stackIn_276_0 = stackOut_275_0;
          if (var19 == 0) {
            if (stackIn_276_0 &&
              va.field_d >= 2) {
              fc.field_d = true;
              var4_ref_pd.field_o = 0;
            }
            if (var4_ref_pd.field_o > 0) {
              var3Lifetime2 = var3Lifetime2 + var4_ref_pd.field_o;
            }
            var4_ref_pd = (pd) (wf.field_c.field_r.d(param0 ^ 29654));
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_284_0 = 0;
        }
        var4Lifetime1 = stackIn_284_0;
        while (true) {
          if (-1 + this.field_d.length <= var4Lifetime1) {
            this.field_d[-1 + this.field_d.length] = var3Lifetime2;
            this.field_x = this.field_x - 1;
            bc.field_r = bc.field_r + this.field_x;
            a.field_r = a.field_r + this.field_x;
            stackIn_291_0 = -1;
            stackIn_291_1 = ~(wf.field_c.field_x % 11);
            break;
          }
          this.field_d[var4Lifetime1] = this.field_d[var4Lifetime1 + 1];
          stackIn_291_0 = this.field_d[var4Lifetime1];
          stackIn_291_1 = this.field_x;
          if (var19 == 0) {
            if (stackIn_291_0 > stackIn_291_1) {
              this.field_x = this.field_d[var4Lifetime1];
            }
            var4Lifetime1++;
            continue;
          }
          break;
        }
        boolean decompiledFrameRemainder4 = true;
        if (stackIn_291_0 == stackIn_291_1 &&
          var3Lifetime2 == 0 &&
          0 < wf.field_c.field_x) {
          this.b(-106);
          decompiledFrameRemainder4 = (var19 != 0);
        }
        if (decompiledFrameRemainder4) {
          if (0 == var3Lifetime2) {
            var4Lifetime2 = this.b((byte) -127);
            if (var4Lifetime2 != bl.field_p) {
              hi.a(ee.field_b[var4Lifetime2], 2, false, 1, true, 2);
            }
            bl.field_p = var4Lifetime2;
            if (var19 != 0) {
              var4Lifetime2 = 1 + this.b((byte) 98);
              if (wf.field_c.field_x % 11 == 0) {
                var4Lifetime2++;
              }
              if (~var4Lifetime2 != ~bl.field_p) {
                hi.a(ee.field_b[var4Lifetime2], 2, false, 1, true, 2);
              }
              bl.field_p = var4Lifetime2;
            }
          } else {
            var4Lifetime2 = 1 + this.b((byte) 98);
            if (wf.field_c.field_x % 11 == 0) {
              var4Lifetime2++;
            }
            if (~var4Lifetime2 != ~bl.field_p) {
              hi.a(ee.field_b[var4Lifetime2], 2, false, 1, true, 2);
            }
            bl.field_p = var4Lifetime2;
          }
        }
        mm.field_C = mm.field_C - (vl.field_d - ua.field_a);
        bc.field_r = bc.field_r - ua.field_a;
        a.field_r = a.field_r - vl.field_d;
        if (param1) {
          while (nf.e(32722)) {
            this.a(true);
            if (var19 != 0) {
              return;
            }
          }
          if (!ia.a(param0 ^ 28803)) {
            if (this.field_s == null) {
              return;
            }
            if (ek.field_a[96]) {
              this.field_t = this.field_t - 16;
              this.a(94);
            }
            if (ek.field_a[97]) {
              this.field_t = this.field_t + 16;
              this.a(125);
            }
            if (ek.field_a[98]) {
              this.field_h = this.field_h - 16;
              this.a(74);
            }
            if (ek.field_a[99]) {
              this.field_h = this.field_h + 16;
              this.a(83);
            }
            if ((lg.field_a & 4) != 0) {
              var4Lifetime3 = (-ua.field_a + this.field_e) / 4;
              var5Lifetime1 = (-vl.field_d + this.field_p) / 4;
              var6 = var4Lifetime3 * 4;
              var7_intLifetime1 = var5Lifetime1 * 4;
              if (var4Lifetime3 != 0 ||
                var5Lifetime1 != 0) {
                this.field_p = this.field_p - var7_intLifetime1;
                this.field_e = this.field_e - var6;
                this.field_h = this.field_h + var7_intLifetime1;
                this.field_t = this.field_t + var6;
              }
              this.a(param0 - 28713);
              if (var19 != 0) {
                this.field_p = vl.field_d;
                this.field_e = ua.field_a;
              }
            } else {
              this.field_p = vl.field_d;
              this.field_e = ua.field_a;
            }
            cb.field_a.a(param0 - 28843);
            if (this.field_h < 192) {
              this.field_h = 192;
            }
            if (this.field_t < 320) {
              this.field_t = 320;
            }
            if ((-128 + (-1 + wf.field_c.field_f.field_t) * ol.field_e) < this.field_h) {
              this.field_h = -128 + (wf.field_c.field_f.field_t - 1) * ol.field_e;
            }
            if ((ol.field_e * (wf.field_c.field_f.field_c - 1) - 320) < this.field_t) {
              this.field_t = ol.field_e * (wf.field_c.field_f.field_c - 1) - 320;
            }
            boolean decompiledFrameCompleted0 = true;
            if (null != this.field_s) {
              eh.field_a = (-320 + (ua.field_a + ol.field_e / 2 + this.field_t)) / ol.field_e;
              uh.field_b = (this.field_h + (ol.field_e / 2 + (vl.field_d - 240))) / ol.field_e;
              if (gi.field_e == 2 &&
                !this.field_j &&
                null != this.field_s) {
                var4Lifetime3Lifetime1 = eh.field_a + uh.field_b * wf.field_c.field_f.field_c;
                if (var4Lifetime3Lifetime1 >= 0 &&
                  var4Lifetime3Lifetime1 < wf.field_c.field_f.field_i &&
                  wf.field_c.field_f.field_o[var4Lifetime3Lifetime1] == 7) {
                  l.field_c = -1;
                  var23 = wf.field_c.a(var4Lifetime3Lifetime1, param0 - 28908);
                  eh.field_a = var23.field_g;
                  uh.field_b = var23.field_h;
                  if (var23 != null) {
                  }
                  if (var23.field_p == this.field_s) {
                    gk.a(mh.field_a[3], (byte) -11);
                    var23.d(param0 ^ 28810);
                    wf.field_c.a(-1);
                  }
                }
              }
              if (of.field_G == 1 &&
                !this.field_j &&
                vl.field_d < 360 &&
                vl.field_d > 60) {
                this.a(85);
                if (null != this.field_s) {
                  boolean decompiledFrameCompleted1 = true;
                  L117: {
                    L118: {
                      boolean decompiledFrameRemainder0 = true;
                      var4Lifetime3Lifetime1 = eh.field_a + wf.field_c.field_f.field_c * uh.field_b;
                      var5Lifetime1Lifetime1 = this.field_s.b(true);
                      var6Lifetime1 = ui.field_a[this.field_f][0];
                      var7_intLifetime1Lifetime1 = oj.a((byte) 47, this.field_f);
                      var8Lifetime1 = 0;
                      if (var4Lifetime3Lifetime1 >= 0 &&
                        var4Lifetime3Lifetime1 < wf.field_c.field_f.field_i &&
                        jk.field_j[this.field_f] >= 0) {
                        if ((!this.a(var7_intLifetime1Lifetime1, param0 - 6076, var4Lifetime3Lifetime1) ||
                          this.field_f == 6 &&
                          this.a(var4Lifetime3Lifetime1, var7_intLifetime1Lifetime1, (byte) -126) == 0) &&
                          (decompiledFrameRemainder0 = (gi.field_e == 1)) &&
                          (decompiledFrameRemainder0 = !(!this.b(var4Lifetime3Lifetime1, var7_intLifetime1Lifetime1, 1)))) {
                          wl.field_a = ua.field_a;
                          if (this.field_f != 6) {
                            hd.field_j = aa.field_a;
                            if (var19 != 0) {
                              hd.field_j = ue.field_J;
                            }
                          } else {
                            hd.field_j = ue.field_J;
                          }
                          md.field_f = vl.field_d;
                          if (wl.field_a < 128) {
                            wl.field_a = 128;
                          }
                          if (wl.field_a > 512) {
                            wl.field_a = 512;
                          }
                          l.field_c = 100;
                          decompiledFrameRemainder0 = (var19 != 0);
                        }
                        if (decompiledFrameRemainder0) {
                          if ((var5Lifetime1Lifetime1 < var6Lifetime1) &&
                            (decompiledFrameRemainder0 = (gi.field_e == 1))) {
                            md.field_f = vl.field_d;
                            wl.field_a = ua.field_a;
                            hd.field_j = ih.field_b;
                            if (wl.field_a < 128) {
                              wl.field_a = 128;
                            }
                            l.field_c = 100;
                            decompiledFrameRemainder0 = !(wl.field_a <= 512);
                            if (decompiledFrameRemainder0) {
                              wl.field_a = 512;
                            }
                          }
                          if ((decompiledFrameRemainder0) &&
                            (!(var5Lifetime1Lifetime1 < var6Lifetime1) ||
                            var19 != 0)) {
                            l.field_c = -1;
                            var9_ref_kb = wf.field_c.a(var4Lifetime3Lifetime1, -116);
                            var5Lifetime1Lifetime1 = var5Lifetime1Lifetime1 - var6Lifetime1;
                            if (var9_ref_kb != null) {
                              System.out.println("Oops");
                            }
                            boolean decompiledFrameCompleted2 = true;
                            var11_ref_kb = new kb(eh.field_a, uh.field_b, this.field_f, 0, this.field_s, wf.field_c);
                            if (this.field_f == 6) {
                              boolean decompiledFrameCompleted5 = true;
                              var12 = this.a(var4Lifetime3Lifetime1, var7_intLifetime1Lifetime1, (byte) -74);
                              var13_int = var12 & 255;
                              if (var13_int > 0) {
                                var14_int = 0;
                                while (var14_int < var7_intLifetime1Lifetime1) {
                                  stackIn_409_0 = 0;
                                  if (var19 != 0) {
                                    decompiledFrameCompleted5 = false;
                                    break;
                                  }
                                  var15_int = stackIn_409_0;
                                  while (var7_intLifetime1Lifetime1 > var15_int) {
                                    var10_int = wf.field_c.field_f.field_c * var15_int + var4Lifetime3Lifetime1 + var13_int + var14_int;
                                    wf.field_c.field_f.field_o[var10_int] = 7;
                                    wf.field_c.field_f.field_j[var10_int] = 29;
                                    var15_int++;
                                  }
                                  var14_int++;
                                }
                                if (decompiledFrameCompleted5) {
                                  var14 = new kb(var13_int + eh.field_a, uh.field_b, this.field_f, 0, this.field_s, wf.field_c);
                                  ((kb) (var14)).field_s = var11_ref_kb;
                                  wf.field_c.field_o.a(-96, (ca) (var14));
                                }
                              }
                              if (decompiledFrameCompleted5) {
                                var14_int = 255 & var12 >> 8;
                                stackIn_409_0 = 0;
                              }
                              boolean decompiledFrameCompleted4 = true;
                              if (stackIn_409_0 < var14_int) {
                                var15_int = 0;
                                while (var7_intLifetime1Lifetime1 > var15_int) {
                                  stackIn_422_0 = 0;
                                  if (var19 != 0) {
                                    decompiledFrameCompleted4 = false;
                                    break;
                                  }
                                  var16 = stackIn_422_0;
                                  while (var16 < var7_intLifetime1Lifetime1) {
                                    var10_intLifetime2 = -var14_int + (var15_int + var4Lifetime3Lifetime1 + var16 * wf.field_c.field_f.field_c);
                                    wf.field_c.field_f.field_o[var10_intLifetime2] = 7;
                                    wf.field_c.field_f.field_j[var10_intLifetime2] = 29;
                                    var16++;
                                  }
                                  var15_int++;
                                }
                                if (decompiledFrameCompleted4) {
                                  var15 = new kb(eh.field_a - var14_int, uh.field_b, this.field_f, 0, this.field_s, wf.field_c);
                                  var15.field_s = var11_ref_kb;
                                  wf.field_c.field_o.a(param0 - 28887, var15);
                                }
                              }
                              if (decompiledFrameCompleted4) {
                                var15_int = var12 >> 16 & 255;
                                stackIn_422_0 = var15_int;
                              }
                              boolean decompiledFrameCompleted3 = true;
                              if (stackIn_422_0 > 0) {
                                var16 = 0;
                                while (var7_intLifetime1Lifetime1 > var16) {
                                  stackIn_436_0 = 0;
                                  if (var19 != 0) {
                                    decompiledFrameCompleted3 = false;
                                    break;
                                  }
                                  var17_int = stackIn_436_0;
                                  while (var7_intLifetime1Lifetime1 > var17_int) {
                                    var10_intLifetime3 = wf.field_c.field_f.field_c * (var17_int + var15_int) + var16 + var4Lifetime3Lifetime1;
                                    wf.field_c.field_f.field_o[var10_intLifetime3] = 7;
                                    wf.field_c.field_f.field_j[var10_intLifetime3] = 29;
                                    var17_int++;
                                  }
                                  var16++;
                                }
                                if (decompiledFrameCompleted3) {
                                  var16_ref_kb = new kb(eh.field_a, uh.field_b + var15_int, this.field_f, 0, this.field_s, wf.field_c);
                                  var16_ref_kb.field_s = var11_ref_kb;
                                  wf.field_c.field_o.a(-128, var16_ref_kb);
                                }
                              }
                              if (decompiledFrameCompleted3) {
                                var16 = (var12 & -16777216) >> 24;
                                stackIn_436_0 = ~var16;
                              }
                              if (stackIn_436_0 < -1) {
                                var17_intLifetime1 = 0;
                                while (var7_intLifetime1Lifetime1 > var17_intLifetime1) {
                                  stackIn_450_0 = 0;
                                  if (var19 != 0) {
                                    decompiledFrameCompleted2 = false;
                                    break;
                                  }
                                  var18 = stackIn_450_0;
                                  while (var18 < var7_intLifetime1Lifetime1) {
                                    var10_intLifetime4 = var17_intLifetime1 + var4Lifetime3Lifetime1 + (var18 - var16) * wf.field_c.field_f.field_c;
                                    wf.field_c.field_f.field_o[var10_intLifetime4] = 7;
                                    wf.field_c.field_f.field_j[var10_intLifetime4] = 29;
                                    var18++;
                                  }
                                  var17_intLifetime1++;
                                }
                                if (decompiledFrameCompleted2) {
                                  var17 = new kb(eh.field_a, uh.field_b - var16, this.field_f, 0, this.field_s, wf.field_c);
                                  var17.field_s = var11_ref_kb;
                                  wf.field_c.field_o.a(param0 ^ -28908, var17);
                                }
                              }
                            }
                            if (decompiledFrameCompleted2) {
                              stackIn_450_0 = 0;
                            }
                            var12Lifetime2 = stackIn_450_0;
                            L158: while (true) {
                              if (var12Lifetime2 < var7_intLifetime1Lifetime1) {
                                stackIn_461_0 = 0;
                                if (var19 != 0) {
                                  break L158;
                                }
                                var13_intLifetime1 = stackIn_461_0;
                                while (var7_intLifetime1Lifetime1 > var13_intLifetime1) {
                                  var10_intLifetime1 = var13_intLifetime1 * wf.field_c.field_f.field_c + var12Lifetime2 + var4Lifetime3Lifetime1;
                                  wf.field_c.field_f.field_o[var10_intLifetime1] = 7;
                                  wf.field_c.field_f.field_j[var10_intLifetime1] = 29;
                                  var13_intLifetime1++;
                                }
                                var12Lifetime2++;
                                continue;
                              }
                              stackIn_461_0 = 3;
                              break;
                            }
                            if (stackIn_461_0 == this.field_f) {
                              wf.field_c.field_s = wf.field_c.field_s + 1;
                            }
                            if (this.field_f != 6) {
                              gk.a(mh.field_a[1], (byte) -11);
                              if (var19 != 0) {
                                ea.a(param0 - 28749, mh.field_a[56], 800);
                              }
                            } else {
                              ea.a(param0 - 28749, mh.field_a[56], 800);
                            }
                            wf.field_c.field_o.a(-117, var11_ref_kb);
                            var12_ref_im = new im();
                            while (true) {
                              if (!wf.field_c.field_o.c(-3088)) {
                                var24_ref = (kb) (wf.field_c.field_o.b((byte) -74));
                                var24_ref.b(param0 ^ 28858);
                                var12_ref_im.a(-98, var24_ref);
                                if (var19 == 0) {
                                  continue;
                                }
                              } else {
                                while (!var12_ref_im.c(-3088)) {
                                  var25_ref = (kb) (var12_ref_im.b((byte) -78));
                                  var13 = var25_ref;
                                  stackIn_498_0 = (kb) (wf.field_c.field_o.b((byte) -29));
                                  if (var19 != 0) {
                                    break L118;
                                  }
                                  var14Lifetime2 = stackIn_498_0;
                                  while (var14Lifetime2 != null) {
                                    stackIn_532_0 = ((kb) (var14Lifetime2)).field_h;
                                    stackIn_532_1 = var25_ref.field_h;
                                    if (stackIn_532_0 <= stackIn_532_1 && (!(var25_ref.field_g < ((kb) (var14Lifetime2)).field_g) ||
                                      ~((kb) (var14Lifetime2)).field_h != ~var25_ref.field_h)) {
                                      var14Lifetime2 = (kb) (wf.field_c.field_o.d(853));
                                      continue;
                                    }
                                    vk.$cfr$intArgs$a$0b89e0d19fbb(var25_ref, -65, (ca) (var14Lifetime2));
                                    var14Lifetime2 = null;
                                    var13 = null;
                                    break;
                                  }
                                  if (var13 != null) {
                                    wf.field_c.field_o.a(param0 - 28907, (ca) (var13));
                                  }
                                }
                              }
                              break;
                            }
                            var8Lifetime1 = 1;
                          }
                        }
                      }
                      if (var8Lifetime1 != 0) {
                        break L117;
                      }
                      if (var4Lifetime3Lifetime1 < 0) {
                        break L117;
                      }
                      if (wf.field_c.field_f.field_i <= var4Lifetime3Lifetime1) {
                        break L117;
                      }
                      if (gi.field_e != 1) {
                        if (of.field_G != 1) {
                          break L117;
                        }
                        if (!ek.field_a[81]) {
                          break L117;
                        }
                      }
                      if (var5Lifetime1Lifetime1 <= 0) {
                        break L117;
                      }
                      if (wf.field_c.field_f.field_o[var4Lifetime3Lifetime1] != 7) {
                        break L117;
                      }
                      l.field_c = -1;
                      var26 = wf.field_c.a(var4Lifetime3Lifetime1, -120);
                      var9_ref_kb = var26;
                      uh.field_b = var26.field_h;
                      stackIn_498_0 = var26;
                    }
                    eh.field_a = stackIn_498_0.field_g;
                    if (this.field_s == var9_ref_kb.field_p &&
                      var9_ref_kb.field_F < jk.field_j[var9_ref_kb.field_C]) {
                      var10 = ui.field_a[var9_ref_kb.field_C];
                      var11 = var10.length;
                      var12Lifetime1 = var9_ref_kb.field_F + 1;
                      if (var12Lifetime1 < var11 &&
                        var5Lifetime1Lifetime1 >= var10[var12Lifetime1]) {
                        var5Lifetime1Lifetime1 = var5Lifetime1Lifetime1 - var10[var12Lifetime1];
                        gk.a(mh.field_a[3], (byte) -11);
                        wf.field_c.field_o.a(-125, new kb(eh.field_a, uh.field_b, var9_ref_kb.field_C, var12Lifetime1, this.field_s, wf.field_c));
                        var9_ref_kb.field_C = -1;
                        var28 = new im();
                        while (!wf.field_c.field_o.c(-3088)) {
                          var27_ref = (kb) (wf.field_c.field_o.b((byte) -85));
                          var27_ref.b(57);
                          var28.a(param0 - 28917, var27_ref);
                          if (var19 != 0) {
                            decompiledFrameCompleted1 = false;
                            break;
                          }
                        }
                        if (decompiledFrameCompleted1) {
                          while (!var28.c(-3088)) {
                            var29_ref = (kb) (var28.b((byte) 119));
                            var14Lifetime1 = var29_ref;
                            stackIn_531_0 = wf.field_c;
                            if (var19 != 0) {
                              decompiledFrameCompleted0 = false;
                              break;
                            }
                            var15Lifetime1 = (kb) (((im) (Object) stackIn_531_0.field_o).b((byte) 124));
                            while (var15Lifetime1 != null) {
                              stackIn_532_0Lifetime2 = var15Lifetime1.field_h;
                              stackIn_532_1Lifetime2 = var29_ref.field_h;
                              if (stackIn_532_0Lifetime2 <= stackIn_532_1Lifetime2 && (!(var29_ref.field_g < var15Lifetime1.field_g) ||
                                ~var29_ref.field_h != ~var15Lifetime1.field_h)) {
                                var15Lifetime1 = (kb) (wf.field_c.field_o.d(853));
                                continue;
                              }
                              vk.$cfr$intArgs$a$0b89e0d19fbb(var29_ref, -65, var15Lifetime1);
                              var14Lifetime1 = null;
                              var15_ref = null;
                              break;
                            }
                            if (var14Lifetime1 != null) {
                              wf.field_c.field_o.a(-83, (ca) (var14Lifetime1));
                            }
                          }
                        }
                      }
                    }
                  }
                  if ((decompiledFrameCompleted1) &&
                    (decompiledFrameCompleted0)) {
                    this.field_s.c(false);
                  }
                  if (decompiledFrameCompleted0) {
                    this.field_s.a((byte) -6, var5Lifetime1Lifetime1);
                  }
                }
              }
            }
            if (decompiledFrameCompleted0) {
              if (df.field_f &&
                -1 != this.field_m) {
                if (this.field_b == 0) {
                  return;
                }
                if (this.field_m >= 16) {
                  return;
                }
              }
              wf.field_c.b((byte) 98);
              stackIn_531_0 = wf.field_c;
            }
            ((f) (Object) stackIn_531_0).d((byte) 104);
            df.field_g = df.field_g + 1;
            stackIn_532_0Lifetime1 = ~df.field_g;
            stackIn_532_1Lifetime1 = -1001;
            if (stackIn_532_0Lifetime1 < stackIn_532_1Lifetime1) {
              var4Lifetime3Lifetime2 = df.field_g / 1000;
              var21 = wf.field_c.field_e;
              var6Lifetime2 = 0;
              L186: while (true) {
                if (var6Lifetime2 < var21.length) {
                  var7 = var21[var6Lifetime2];
                  var8Lifetime1Lifetime1 = 0;
                  stackIn_553_0 = 0;
                  if (var19 != 0) {
                    break L186;
                  }
                  var9 = stackIn_553_0;
                  while (wf.field_c.field_f.field_o.length > var9) {
                    stackIn_546_0 = wf.field_c.field_f.field_o[var9];
                    stackIn_546_1 = 6;
                    if (stackIn_546_0 == stackIn_546_1) {
                      wf.field_c.field_b.a(-123, new oj(var9 % wf.field_c.field_f.field_c, var9 / wf.field_c.field_f.field_c, var7, var9 / wf.field_c.field_f.field_c + var9 % wf.field_c.field_f.field_c, var4Lifetime3Lifetime2));
                      if ((var9 % wf.field_c.field_f.field_c) > var8Lifetime1Lifetime1) {
                        var8Lifetime1Lifetime1 = var9 % wf.field_c.field_f.field_c;
                      }
                    }
                    var9++;
                  }
                  stackIn_546_0Lifetime1 = -1;
                  stackIn_546_1Lifetime1 = ~var8Lifetime1Lifetime1;
                  if (stackIn_546_0Lifetime1 > stackIn_546_1Lifetime1 &&
                    var8Lifetime1Lifetime1 < 64 &&
                    33 < wf.field_c.field_x &&
                    wf.field_c.field_a) {
                    f.a(17, 238, (byte) -25);
                  }
                  var6Lifetime2++;
                  continue;
                }
                stackIn_553_0 = df.field_g - 1000 * var4Lifetime3Lifetime2;
                break;
              }
              df.field_g = stackIn_553_0;
              return;
            }
          }
          return;
        }
        return;
    }

    private final void a(boolean param0) {
        lb dupTemp$0 = null;
        int stackIn_5_0 = 0;
        int var2;
        int var3;
        if (ob.field_K == 13 &&
          this.field_o == 0) {
          var2 = 1;
          gk.a(mh.field_a[45], (byte) -11);
          var3 = var2;
          stackIn_5_0 = (!qb.b((byte) 123)) ? 0 : 7;
          o.a(stackIn_5_0, 2, false, var3);
          return;
        }
        if (!param0) {
          return;
        }
        if (ob.field_K == 83) {
          if (wf.field_c.field_g > (10 + wf.field_c.field_i) && (wf.field_c.field_x % 11 != 0 &&
            0 < wf.field_c.field_x ||
            0 == wf.field_c.field_x ||
            wf.field_c.field_r.c(-3088) &&
            !(wf.field_c.field_e[0].field_f <= 0))) {
            dupTemp$0 = wf.field_c.field_e[0];
            dupTemp$0.field_f = dupTemp$0.field_f + (-wf.field_c.field_i + wf.field_c.field_g);
            wf.field_c.field_g = 10 + wf.field_c.field_i;
          }
          if (1 == hm.field_C) {
            hm.field_C = 2;
            this.field_m = -1;
          }
        }
        if (16 == ob.field_K &&
          this.field_f != 0 &&
          jk.field_j[0] >= 0) {
          this.field_f = 0;
          gk.a(mh.field_a[2], (byte) -11);
        }
        if (ob.field_K == 17 &&
          this.field_f != 1 &&
          jk.field_j[1] >= 0) {
          this.field_f = 1;
          gk.a(mh.field_a[2], (byte) -11);
        }
        if (ob.field_K == 18 &&
          this.field_f != 2 &&
          0 <= jk.field_j[2]) {
          this.field_f = 2;
          gk.a(mh.field_a[2], (byte) -11);
        }
        if (19 == ob.field_K &&
          this.field_b < 4 &&
          this.field_f != 3 &&
          jk.field_j[3] >= 0) {
          this.field_f = 3;
          gk.a(mh.field_a[2], (byte) -11);
        }
        if (ob.field_K == 20 &&
          this.field_b < 4 &&
          this.field_f != 4 &&
          jk.field_j[4] >= 0) {
          this.field_f = 4;
          gk.a(mh.field_a[2], (byte) -11);
        }
        if (ob.field_K == 19 &&
          this.field_b >= 4 &&
          this.field_f != 5 &&
          jk.field_j[5] >= 0) {
          this.field_f = 5;
          gk.a(mh.field_a[2], (byte) -11);
        }
        if (20 == ob.field_K &&
          this.field_b >= 4 &&
          this.field_f != 6 && !(jk.field_j[6] < 0)) {
          this.field_f = 6;
          gk.a(mh.field_a[2], (byte) -11);
        }
    }

    private final boolean b(int param0, int param1, int param2) {
        int discarded$1 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_19_0 = 0;
        var7 = OrbDefence.field_D ? 1 : 0;
        if (param2 != 1) {
          discarded$1 = this.a(79, -127, (byte) -25);
        }
        var5 = -1;
        L1: while (true) {
          stackIn_4_0 = ~var5;
          stackIn_4_1 = ~(1 + param1);
          if (stackIn_4_0 > stackIn_4_1) {
            stackIn_19_0 = -1;
            if (var7 != 0) {
              return stackIn_19_0 != 0;
            }
            var6 = stackIn_19_0;
            while ((1 + param1) > var6) {
              var4 = wf.field_c.field_f.field_c * var6 + (var5 + param0);
              stackIn_4_0 = ~var4;
              stackIn_4_1 = -1;
              if (stackIn_4_0 <= stackIn_4_1 &&
                wf.field_c.field_f.field_i > var4) {
                if (wf.field_c.field_f.field_o[var4] == 7) {
                  return false;
                }
                var6++;
                continue;
              } else {
                return false;
              }
            }
            var5++;
            continue L1;
          }
          break;
        }
        return true;
    }

    final void c(int param0) {
        if (mm.field_A == null &&
          wf.field_c.field_e[0].field_d > 0 &&
          !fc.field_d) {
          if (0 == this.field_b) {
            mm.field_A = new vg(0, 65535, bc.field_r, mm.field_C, a.field_r, nh.field_b, new int[]{wf.field_c.field_x + wf.field_c.field_e[0].field_d * 105});
          }
          if (1 == this.field_b) {
            mm.field_A = new vg(1, 65534, bc.field_r, mm.field_C, a.field_r, nh.field_b, new int[]{105 * wf.field_c.field_e[0].field_d + wf.field_c.field_x});
          }
          if (this.field_b == 2) {
            mm.field_A = new vg(2, 65533, bc.field_r, mm.field_C, a.field_r, nh.field_b, new int[]{wf.field_c.field_e[0].field_d * 105 + wf.field_c.field_x});
          }
          if (this.field_b == 3) {
            mm.field_A = new vg(3, 65532, bc.field_r, mm.field_C, a.field_r, nh.field_b, new int[]{wf.field_c.field_x + wf.field_c.field_e[0].field_d * 105});
          }
          if (this.field_b == 4) {
            mm.field_A = new vg(4, 65531, bc.field_r, mm.field_C, a.field_r, nh.field_b, new int[]{wf.field_c.field_e[0].field_d * 105 + wf.field_c.field_x});
          }
          if (5 == this.field_b) {
            mm.field_A = new vg(5, 65530, bc.field_r, mm.field_C, a.field_r, nh.field_b, new int[]{wf.field_c.field_e[0].field_d * 105 + wf.field_c.field_x});
          }
          if (!n.b((byte) 31)) {
            vl.a(3, 10, mm.field_A);
          }
        }
        if (param0 != -1) {
          this.field_e = -41;
        }
    }

    final static void a(int param0, mj param1, int param2) {
        se var3 = null;
        try {
          var3 = uk.field_b;
          var3.i(param0, param2 ^ 108);
          if (param2 != 14) {
            field_r = (char[]) null;
          }
          var3.a(param1.field_g, -68);
          var3.b((byte) -60, param1.field_h);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "nk.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void b(int param0) {
        int discarded$1 = 0;
        int var2;
        var2 = this.b((byte) 111);
        hi.a(ee.field_b[var2], 2, false, 1, true, 2);
        if (param0 > -80) {
          discarded$1 = this.b((byte) -48);
        }
        bl.field_p = var2;
        if (0 != wf.field_c.field_x &&
          wf.field_c.field_g < wf.field_c.field_i + 50 &&
          !wf.field_c.field_r.c(-3088)) {
          wf.field_c.field_g = 50 + wf.field_c.field_i;
        }
    }

    public static void c(byte param0) {
        if (param0 != 15) {
          field_q = (gk) null;
        }
        field_w = null;
        field_q = null;
        field_r = null;
    }

    final static int a(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = OrbDefence.field_D ? 1 : 0;
        try {
          bm.field_d.a(em.field_o, false, true, ke.field_b);
          bm.field_d.o(123);
          do {
            if (!nf.e(32722)) {
              if (mc.field_g != -1) {
                var1_int = mc.field_g;
                il.a(-1, 0);
                stackIn_8_0 = var1_int;
                return stackIn_8_0;
              }
              break;
            }
            bm.field_d.a(od.field_k, true, ob.field_K);
          } while (var2 == 0);
          if (param0 >= -93) {
            field_w = (tl) null;
          }
          if (oe.field_p) {
            stackIn_14_0 = 3;
            return stackIn_14_0;
          }
          if (mg.field_m == tg.field_c) {
            stackIn_17_0 = 1;
            return stackIn_17_0;
          }
          if (!bd.field_u.a(false)) {
            stackIn_21_0 = 1;
            return stackIn_21_0;
          }
          if (mg.field_m != qc.field_g) {
            stackIn_26_0 = -1;
            return stackIn_26_0;
          }
          stackIn_24_0 = 2;
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1), "nk.D(" + param0 + ')');
        }
    }

    private final void a(int param0) {
        if (param0 < 69) {
          return;
        }
        if (this.field_u > 0) {
          this.field_u = 0;
          this.field_t = this.field_t / 4 * 4;
          this.field_h = 4 * (this.field_h / 4);
        }
    }

    private final int b(byte param0) {
        int var5 = 0;
        int var3 = 86 % ((-68 - param0) / 57);
        int var2 = 0;
        if (33 <= wf.field_c.field_x) {
          var2 = 3;
        }
        if (66 <= wf.field_c.field_x) {
          var2 = 6;
        }
        int var4 = wf.field_c.field_x / 11 * 11 + 11;
        if (!(var4 > jc.field_f[wf.field_c.field_m].length)) {
          var5 = jc.field_f[wf.field_c.field_m][var4 - 1];
          if (var5 == 9 ||
            var5 == 10) {
            var2 = 9;
          }
        }
        return var2;
    }

    nk(int param0) {
        this.field_h = 192;
        this.field_d = new int[1500];
        this.field_t = 320;
        this.field_e = 0;
        this.field_p = 0;
        this.field_f = 0;
        this.field_g = false;
        this.field_i = 0;
        this.field_u = 200;
        this.field_a = -1;
        this.field_x = 1;
        n.field_a = param0;
        this.field_b = param0;
        this.field_k = false;
        if (param0 > 3) {
          this.field_u = 400;
        }
        this.field_v = new im();
        this.field_i = 0;
        this.field_m = -1;
        bc.field_r = 0;
        this.field_o = 0;
        dm.field_f = 0;
        mm.field_C = 0;
        jk.field_j = new int[]{2, 2, -1, -1, -1, -1, 0};
        a.field_r = 0;
        nh.field_b = 0;
        this.field_c = 0;
        df.field_g = 1000;
        wf.field_c = new f(param0);
        this.field_s = this.field_l < 0 ? null : wf.field_c.field_e[this.field_l];
        wf.field_c.a((byte) -4, 0, 0);
        hm.field_C = 0;
        this.b(-97);
    }

    static {
        field_q = new gk();
        field_r = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_w = new tl();
    }
}
