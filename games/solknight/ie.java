/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ie {
    static long[] field_g;
    private sf field_f;
    private int field_e;
    static long[][] field_c;
    private int field_b;
    private int field_d;
    private int field_a;

    private final int a(byte param0, int param1) {
        if (param0 >= -100) {
          this.c(11);
        }
        return 37;
    }

    private final int a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5;
        int var6;
        var6 = SolKnight.field_L ? 1 : 0;
        for (var4 = 0; ab.field_s[this.field_d].length > var4; var4++) {
          var5 = this.b(param1 - 225, var4);
          if (this.b((byte) -4, var4) &&
            this.a(var4, -3) <= param0 &&
            param0 < this.a(var4, (byte) 55) &&
            param2 >= var5 &&
            this.a((byte) -113, var4) + var5 > param2) {
            return var4;
          }
        }
        if (param1 != 111) {
          this.a(113);
        }
        return -1;
    }

    private final void a(boolean param0, int param1, int param2) {
        int stackIn_40_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_151_0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        var8 = SolKnight.field_L ? 1 : 0;
        if (param1 != 2647) {
          this.field_b = -116;
        }
        L1: {
          var4 = ab.field_s[this.field_d][param2];
          var5 = var4;
          if (var5 != 0) {
            if (var5 != 1) {
              if (var5 != 5) {
                if (var5 == 16) {
                  if (this.field_f.f(0)) {
                    gb.a(param0, 9, -128);
                    mb.a(true, 14, 256);
                  }
                } else {
                  if (var5 != 14) {
                    if (var5 == 3) {
                      if (!(!this.field_f.f(0))) {
                        gb.a(param0, 4, param1 - 2774);
                        fb.field_c = this.field_d;
                        mb.a(true, 14, 256);
                      }
                      break L1;
                    }
                    if (6 == var5) {
                      if (this.field_f.f(0)) {
                        gb.a(param0, fb.field_c, param1 - 2775);
                        mb.a(true, 14, 256);
                      }
                    } else {
                      if (var5 == 2) {
                        if (!(!this.field_f.f(0))) {
                          gb.a(param0, 2, -127);
                          mb.a(true, 14, 256);
                        }
                        break L1;
                      }
                      if (17 == var5) {
                        if (!(!this.field_f.f(param1 ^ 2647))) {
                          if (!pg.field_e) {
                            pl.field_a = pl.field_a + oa.field_m * 100;
                          }
                          kb.field_b = kb.field_b + 1;
                          lk.field_b = ud.field_k;
                          wc.field_c = 0;
                          if (kb.field_b == 4) {
                            pk.a((byte) -96, 2, true);
                          }
                          if (kb.field_b == 7) {
                            pk.a((byte) -96, 3, true);
                          }
                          f.field_d = 0;
                          oa.field_m = 0;
                          jg.field_b = 10;
                          mf.field_A = 0;
                          ib.field_h = 0;
                          kf.field_G = new rb[10];
                          fg.field_a = 0;
                          pg.field_e = false;
                          lk.field_f = 0;
                          vk.field_p = 0;
                          bi.field_h = 0;
                          for (var5 = 0; var5 < nf.field_W.length; var5 += 2) {
                            nf.field_W[var5] = bk.a(1280, jb.field_g, (byte) -116) - 640;
                            nf.field_W[var5 + 1] = bk.a(720, jb.field_g, (byte) 83);
                          }
                          gb.a(param0, -1, -128);
                          mb.a(true, 14, 256);
                        }
                        break L1;
                      }
                      if (var5 == 18) {
                        if (!(!this.field_f.f(0))) {
                          f.field_d = 0;
                          ve.field_b = 0;
                          kh.field_d = 255;
                          pg.field_e = true;
                          uf.field_p = -1;
                          if (!il.b(param1 ^ 2988)) {
                            ah.b(true);
                          }
                          kh.field_c = null;
                          if (il.b(507)) {
                            gb.a(param0, 8, -128);
                          } else {
                            if (jl.field_d != 0) {
                              gb.a(param0, 7, -127);
                              mb.a(true, 14, 256);
                            } else {
                              gb.a(param0, 2, -127);
                              mb.a(true, 14, 256);
                            }
                          }
                        }
                        break L1;
                      }
                      if (var5 != 12) {
                        if (var5 == 13) {
                          if (this.field_f.c((byte) 11)) {
                            gg.a(0, 10);
                          }
                          if (this.field_f.e(12542)) {
                            gg.a(256, 10);
                          }
                          if (this.field_f.a(param1 ^ 2570)) {
                            var5 = 64 + (wb.field_a + 9);
                            var6 = (this.a(param2, -3) + (this.a(param2, (byte) 55) - var5) >> 1) + wb.field_a + 8;
                            var7 = gb.field_j - var6 << 2;
                            if (var7 <= 0) {
                              gg.a(0, 10);
                            } else {
                              if (var7 < 256) {
                                gg.a(var7, param1 - 2637);
                              } else {
                                gg.a(256, 10);
                              }
                            }
                          }
                          if (this.field_f.c(0)) {
                            if (td.field_l > 32) {
                              var5 = td.field_l % 32;
                              if (var5 == 0) {
                                var5 = 32;
                              }
                              gg.a(td.field_l - var5, 10);
                            } else {
                              gg.a(0, param1 - 2637);
                            }
                          }
                          if (!(!this.field_f.e((byte) -72))) {
                            if (td.field_l >= 224) {
                              gg.a(256, param1 ^ 2653);
                            } else {
                              var5 = td.field_l % 32;
                              gg.a(32 + (td.field_l - var5), 10);
                            }
                          }
                          break L1;
                        }
                        if (4 == var5) {
                          if (!(!this.field_f.d((byte) -107))) {
                            if (dj.field_k != null) {
                              qk.d(14995);
                              mb.a(true, 14, 256);
                            } else {
                              var5 = param0 ? 1 : 0;
                              ta.a(false, 320, w.field_b, 2, ug.field_g.field_F + ug.field_g.field_s, ug.field_g, 8, ad.field_b.field_F + ad.field_b.field_s, ad.field_b.field_F, w.field_b, 8, 240, ad.field_b, ug.field_g.field_F, var5 != 0);
                              mb.a(true, 14, 256);
                            }
                          }
                          break L1;
                        }
                        switch (var5) {
                          case 7:
                            if (!this.field_f.d((byte) -49)) {
                              break;
                            }
                            if (!il.b(507)) {
                              if (!il.b(507)) {
                                ah.b(true);
                              }
                              kh.field_c = null;
                              if (0 == jl.field_d) {
                                gb.a(param0, 2, -128);
                              } else {
                                gb.a(param0, 7, -127);
                              }
                            } else {
                              if (lk.field_e != 0) {
                                gb.a(param0, 8, -128);
                              } else {
                                gb.a(param0, 0, -127);
                              }
                            }
                            stackIn_151_0 = (0 < ob.field_l) ? 0 : 9;
                            fb.field_c = stackIn_151_0;
                            mb.a(true, 14, 256);
                            pk.a((byte) -96, 0, true);
                            break;
                          case 8:
                            if (!this.field_f.d((byte) -94)) {
                              break;
                            }
                            rg.field_c = 0;
                            mb.a(true, 14, 256);
                            break;
                          case 9:
                            if (this.field_f.d((byte) -17)) {
                              rg.field_c = 1;
                              mb.a(true, 14, 256);
                            }
                            break;
                          case 15:
                            if (!this.field_f.d((byte) -58)) {
                              break;
                            }
                            if (this.field_d != 3 &&
                              2 != this.field_d) {
                              if (8 != this.field_d) {
                                mb.a(true, 14, 256);
                                break;
                              }
                              bb.a((byte) -14, 7, 8);
                              mb.a(true, 14, 256);
                              break;
                            }
                            bb.a((byte) -14, this.field_d, this.field_d);
                            mb.a(true, 14, 256);
                            break;
                          default:
                            break;
                          case 11:
                            if (!this.field_f.f(0)) {
                              break;
                            }
                            if (dj.field_k != null) {
                              qk.d(14995);
                            }
                            he.a(-1, ia.g(-81));
                            mb.a(true, 14, 256);
                            break;
                          case 19:
                            if (this.field_f.f(0)) {
                              if (null != dj.field_k) {
                                qk.d(14995);
                              }
                              fh.a(25, ia.g(-55));
                              mb.a(true, 14, 256);
                            }
                            break;
                          case 10:
                            if (this.field_f.d((byte) -42)) {
                              rg.field_c = 2;
                              mb.a(true, 14, 256);
                            }
                            break;
                        }
                      } else {
                        if (this.field_f.c((byte) 11)) {
                          ah.a((byte) -88, 0);
                        }
                        if (this.field_f.e(12542)) {
                          ah.a((byte) -52, 256);
                        }
                        if (this.field_f.a(65)) {
                          var5 = 64 + (wb.field_a + 9);
                          var6 = 8 + (-var5 + (this.a(param2, -3) + this.a(param2, (byte) 55)) >> 1) + wb.field_a;
                          var7 = -var6 + gb.field_j << 2;
                          if (0 >= var7) {
                            ah.a((byte) -86, 0);
                          } else {
                            if (256 <= var7) {
                              ah.a((byte) -82, 256);
                            } else {
                              ah.a((byte) -97, var7);
                            }
                          }
                        }
                        if (this.field_f.c(0)) {
                          pc.a(121);
                        }
                        if (this.field_f.e((byte) -57)) {
                          cb.b((byte) -39);
                        }
                      }
                    }
                  } else {
                    if (this.field_f.f(param1 - 2647)) {
                      gb.a(param0, 3, -128);
                      fb.field_c = this.field_d;
                      mb.a(true, 14, 256);
                    }
                  }
                }
              } else {
                if (this.field_f.f(0)) {
                  gb.a(param0, 0, -128);
                  mb.a(true, 14, 256);
                }
              }
            } else {
              if (this.field_f.f(0)) {
                gb.a(param0, -1, -128);
                stackIn_46_0 = (ob.field_l > 0) ? 0 : 9;
                fb.field_c = stackIn_46_0;
                mb.a(true, 14, 256);
              }
            }
          } else {
            if (this.field_f.f(0)) {
              oa.field_n = false;
              ve.field_b = -1;
              ic.field_t = ic.field_t + lc.field_p;
              bi.field_b = null;
              kh.field_c = null;
              wc.field_c = 0;
              jl.field_d = 0;
              lc.field_p = 0;
              lc.field_h = lc.field_h - fa.field_f;
              oa.field_m = 0;
              k.field_c = 0;
              ic.field_t = ic.field_t - (bi.field_i >>> 11) * fa.field_f;
              uf.field_p = 2;
              jg.field_b = 10;
              kb.field_b = 0;
              pg.field_e = false;
              fg.field_a = 0;
              fa.field_f = 0;
              bi.field_h = 0;
              pl.field_a = 0;
              ic.field_t = ic.field_t + lk.field_e;
              ic.field_t = ic.field_t - (lc.field_h >>> 17) * ud.field_k;
              bi.field_i = bi.field_i - ud.field_k;
              ib.field_h = 0;
              mf.field_A = 0;
              cb.field_a = 0;
              lk.field_b = 0;
              lk.field_e = 0;
              vk.field_p = 0;
              ci.field_ib = 0;
              ob.field_j = 0;
              ia.field_hb = 0;
              lk.field_f = 0;
              ud.field_k = 0;
              kf.field_G = null;
              pk.a((byte) -96, 1, true);
              gb.a(param0, -1, param1 ^ -2601);
              stackIn_40_0 = (ob.field_l > 0) ? 0 : 9;
              fb.field_c = stackIn_40_0;
              mb.a(true, 14, 256);
            }
          }
        }
    }

    private final void e(int param0) {
        int var3;
        var3 = SolKnight.field_L ? 1 : 0;
        if (this.field_d == 2 &&
          !il.b(507)) {
          if (el.field_n == 96) {
            if (this.field_f.field_f > 0) {
              if (3 != this.field_f.field_f) {
                this.field_f.a((byte) 111, this.field_f.field_f - 1);
              }
            } else {
              this.field_f.a((byte) 111, 2);
            }
          }
          if (97 == el.field_n) {
            if (2 > this.field_f.field_f) {
              this.field_f.a((byte) 111, 1 + this.field_f.field_f);
            } else {
              if (2 == this.field_f.field_f) {
                this.field_f.a((byte) 111, 0);
              }
            }
          }
          if (el.field_n == 99) {
            if (this.field_f.field_f >= 0 &&
              this.field_f.field_f <= 2) {
              this.field_f.a((byte) 111, 3);
            } else {
              this.field_f.a((byte) 111, rg.field_c);
            }
          }
          if (el.field_n == 98) {
            if (this.field_f.field_f == 3) {
              this.field_f.a((byte) 111, rg.field_c);
            } else {
              this.field_f.a((byte) 111, 3);
            }
          }
          this.field_f.b((byte) 108);
          return;
        }
        if (param0 != -257) {
          ie.a(49, -110, -117);
        }
        if (9 == this.field_d) {
          this.field_f.a(0, false);
        } else {
          this.field_f.a(true);
        }
    }

    private final int a(int param0, byte param1) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int discarded$0 = 0;
        if (2 == this.field_d &&
          !il.b(507)) {
          return 180 + this.a(param0, param1 ^ -54);
        }
        if (!gg.field_f[this.field_d]) {
          var3 = ab.field_s[this.field_d][param0];
          var4 = te.field_I[var3];
          if (var4 == null) {
            return jb.field_a[this.field_d];
          }
          var5 = ad.field_b.b(var4) + 20;
          return bb.field_P[this.field_d] + (jb.field_a[this.field_d] + var5) >> 1;
        }
        if (param1 != 55) {
          discarded$0 = this.a((byte) -96, -95);
        }
        return bb.field_P[this.field_d];
    }

    public static void a(byte param0) {
        field_c = (long[][]) null;
        if (param0 != 101) {
          field_c = (long[][]) null;
        }
        field_g = null;
    }

    private final void a(boolean param0, boolean param1, int param2) {
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_24_0 = 0;
        int var4;
        int var5;
        int var6;
        String var7;
        int var8;
        int var9;
        int var10;
        int var11;
        hd var12;
        int var13;
        int var14;
        int var15;
        int var16;
        var4 = this.b(123, param2);
        var5 = this.a(param2, -3);
        var6 = ab.field_s[this.field_d][param2];
        var7 = te.field_I[var6];
        if (param0) {
          return;
        }
        if (var7 == null) {
          var7 = "ERROR: missing text";
        }
        stackIn_7_0 = (!param1) ? 1134591 : 16777215;
        var8 = stackIn_7_0;
        stackIn_10_0 = (!param1) ? 8421504 : 1134591;
        var9 = stackIn_10_0;
        var10 = -var5 + this.a(param2, (byte) 55);
        var11 = this.a((byte) -125, param2);
        if (8 <= var6 &&
          var6 <= 10 &&
          rg.field_c == param2) {
          var8 = 16776960;
        }
        if (!gg.field_f[this.field_d]) {
          uj.a(var10, var11, var5, w.field_b, var4, 2);
        }
        var12 = ad.field_b;
        var13 = -w.field_b[0].field_r + var11 + (-w.field_b[6].field_r + (-var12.field_F - var12.field_s));
        if (12 != var6 &&
          var6 != 13) {
          var12.a(var7, var5 + (var10 >> 1), (var13 >> 1) + (var12.field_F + (var4 + w.field_b[0].field_r)), var8, var9);
          return;
        }
        var14 = 9 + (wb.field_a + 64);
        var15 = var5 + (-var14 + var10 >> 1);
        var12.c(var7, var15, (var13 >> 1) + var4 - (-var12.field_F - w.field_b[0].field_r), var8, var9);
        var15 = var15 + (wb.field_a + 8);
        if (12 == var6) {
          stackIn_24_0 = wc.field_a;
        } else {
          stackIn_24_0 = td.field_l;
        }
        var16 = stackIn_24_0;
        mi.b(var15 + 1, var4 + (var11 >> 1), 65, 4, var9);
        mi.b(var15 + (var16 >> 2), 2 + ((var11 - 20 >> 1) + var4), 3, 20, var9);
        mi.b(var15, -1 + var4 + (var11 >> 1), 65, 4, var8);
        mi.b(var15 + (var16 >> 2) - 1, 1 + (-20 + var11 >> 1) + var4, 3, 20, var8);
        return;
    }

    final static void a(int param0, int param1, int param2) {
        if (param2 < 20) {
          field_c = (long[][]) null;
        }
        mi.g(param0, param1, 8, 16711680);
        mi.b(param0 - 8, param1, 4, 16711680);
        mi.b(param0 + 8 - 4, param1, 4, 16711680);
        mi.h(param0, -8 + param1, 4, 16711680);
        mi.h(param0, -4 + param1 + 8, 4, 16711680);
    }

    final void c(int param0) {
        int stackIn_23_0 = 0;
        int var2;
        int var3;
        var3 = SolKnight.field_L ? 1 : 0;
        if (ve.field_b > 240) {
          if (hg.field_F == 0 &&
            !fh.field_d[83] &&
            !fh.field_d[84]) {
            return;
          }
          ve.field_b = 240;
          return;
        }
        if (9 == this.field_d) {
          var2 = ke.a(true, true);
          if (var2 == 3) {
            fh.a(62, ia.g(param0 ^ -89));
          }
          if (var2 == 1) {
            gb.a(false, 0, -128);
            this.field_f.field_f = 0;
          }
          if (2 == var2) {
            gb.a(true, 0, param0 ^ -128);
          }
        }
        while (wk.a((byte) -56)) {
          if (13 == el.field_n &&
            5 != this.field_d) {
            if (this.field_d == 1) {
              gb.a(false, -1, param0 ^ -127);
              stackIn_23_0 = (ob.field_l > 0) ? 0 : 9;
              fb.field_c = stackIn_23_0;
              continue;
            }
            if (8 == this.field_d) {
              continue;
            }
            gb.a(false, fb.field_c, -127);
            continue;
          }
          this.e(-257);
          if (this.field_f.field_f == -1) {
            continue;
          }
          this.a(false, 2647, this.field_f.field_f);
        }
        this.field_f.a(param0 - 125, this.a(gb.field_j, (byte) 111, ad.field_m), this.a(db.field_o, (byte) 111, s.field_gb));
        if (-1 != this.field_f.field_f) {
          this.a(true, 2647, this.field_f.field_f);
        }
        if (param0 != hg.field_F) {
          this.field_b = s.field_gb;
          this.field_a = db.field_o;
        }
    }

    private final int b(int param0, int param1) {
        if (2 == this.field_d &&
          !il.b(507)) {
          if (3 > param1) {
            return ah.field_i[this.field_d];
          }
          return ah.field_i[this.field_d] + si.field_F[this.field_d];
        }
        int var3 = 121 % ((45 - param0) / 60);
        return ah.field_i[this.field_d] + si.field_F[this.field_d] * param1;
    }

    private final boolean b(byte param0, int param1) {
        if (param0 != -4) {
          this.field_b = -115;
          return true;
        }
        return true;
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        if (param1 == ~this.field_d &&
          !il.b(param1 + 510)) {
          if (param0 < 3) {
            return 200 * param0 + jb.field_a[this.field_d];
          }
          return 200 + jb.field_a[this.field_d];
        }
        if (!gg.field_f[this.field_d]) {
          var3 = ab.field_s[this.field_d][param0];
          var4 = te.field_I[var3];
          if (var4 == null) {
            return jb.field_a[this.field_d];
          }
          var5 = 20 + ad.field_b.b(var4);
          return jb.field_a[this.field_d] + (bb.field_P[this.field_d] - var5) >> 1;
        }
        return jb.field_a[this.field_d];
    }

    final void b(boolean param0, int param1) {
        int stackIn_5_0;
        int stackIn_5_1;
        hd stackIn_5_2;
        int stackIn_5_3;
        boolean stackIn_6_4 = false;
        boolean stackIn_8_5;
        boolean stackIn_9_6 = false;
        int stackIn_11_0 = 0;
        hd stackIn_11_1 = null;
        boolean stackIn_12_2 = false;
        boolean stackIn_15_3 = false;
        int stackIn_17_0 = 0;
        hd stackIn_17_1 = null;
        boolean stackIn_18_2 = false;
        int stackIn_20_3;
        boolean stackIn_20_4;
        boolean stackIn_21_5;
        int var3;
        int var4;
        int var3Lifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        if (param1 != 3367) {
          return;
        }
        if (this.field_d == 8) {
          var3 = 4 + ad.field_b.field_s + ad.field_b.field_m;
          var4 = var3 * ad.field_b.b(ba.field_r, 600);
          stackIn_5_0 = var4;
          stackIn_5_1 = var3;
          stackIn_5_2 = ad.field_b;
          stackIn_5_3 = 71;
          stackIn_6_4 = (lk.field_e == 0) ? false : true;
          stackIn_8_5 = false;
          stackIn_9_6 = (jl.field_d == 0) ? false : true;
          var4Lifetime1 = stackIn_5_0 + stackIn_5_1 * ((hd) (Object) stackIn_5_2).b(ai.$cfr$intArgs$a$c7de0d339b2a(stackIn_5_3, stackIn_6_4, stackIn_8_5, stackIn_9_6), 600);
          ah.field_i[this.field_d] = var4Lifetime1 + 2;
          var4Lifetime1 = var4Lifetime1 + (var3 + 41);
          stackIn_11_0 = var4Lifetime1;
          stackIn_11_1 = ad.field_b;
          stackIn_12_2 = (jl.field_d == 0) ? false : true;
          stackIn_15_3 = (lk.field_e == 0) ? false : true;
          var4Lifetime2 = stackIn_11_0 + ((hd) (Object) stackIn_11_1).b(qh.a(stackIn_12_2, stackIn_15_3, false, (byte) 8), 600) * var3;
          si.field_F[this.field_d] = var4Lifetime2 + 2 - ah.field_i[this.field_d];
          var4Lifetime2 += 41;
          stackIn_17_0 = var4Lifetime2;
          stackIn_17_1 = ad.field_b;
          stackIn_18_2 = (lk.field_e == 0) ? false : true;
          stackIn_20_3 = param1 - 3451;
          stackIn_20_4 = false;
          stackIn_21_5 = (jl.field_d == 0) ? false : true;
          var4Lifetime3 = stackIn_17_0 + ((hd) (Object) stackIn_17_1).b(jl.a(stackIn_18_2, stackIn_20_3, stackIn_20_4, stackIn_21_5), 600) * var3;
          dd.field_b = 480 - var4Lifetime3 >> 1;
          ah.field_i[this.field_d] = ah.field_i[this.field_d] + dd.field_b;
        }
        if (this.field_d == 9) {
          df.a(0, true);
        }
        var3Lifetime1 = 0;
        if (9 == this.field_d) {
          var3Lifetime1 = -1;
        }
        if (this.field_d == 0 &&
          this.field_f.field_f != -1) {
          var3Lifetime1 = this.field_f.field_f;
        }
        if (this.field_d == 1 &&
          -1 != this.field_f.field_f &&
          -1 != kd.field_a) {
          var3Lifetime1 = this.field_f.field_f;
        }
        this.field_f.a(param0, var3Lifetime1, this.a(gb.field_j, (byte) 111, ad.field_m), 127);
        this.field_e = -1;
    }

    final void d(int param0) {
        boolean stackIn_37_1 = false;
        int stackIn_59_0 = 0;
        hd stackIn_59_1 = null;
        int stackIn_59_2 = 0;
        boolean stackIn_60_3 = false;
        boolean stackIn_62_4;
        boolean stackIn_63_5 = false;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        hd stackIn_65_2 = null;
        boolean stackIn_66_3 = false;
        boolean stackIn_69_4 = false;
        int stackIn_71_0 = 0;
        hd stackIn_71_1 = null;
        boolean stackIn_72_2 = false;
        int stackIn_74_3;
        boolean stackIn_74_4;
        boolean stackIn_75_5;
        boolean stackIn_86_1 = false;
        boolean stackIn_87_2 = false;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        String var12_ref_String;
        int var13;
        String var13_ref_String;
        int var14;
        String var14_ref_String;
        int var15;
        int var16;
        int var2Lifetime1;
        int var2Lifetime2;
        int var3Lifetime1;
        int var3Lifetime2;
        int var6Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var9Lifetime1Lifetime1;
        int var10Lifetime1Lifetime1;
        int var11Lifetime1Lifetime1;
        int var9Lifetime1Lifetime2;
        var16 = SolKnight.field_L ? 1 : 0;
        if (9 == this.field_d) {
          we.a(true);
          return;
        }
        if (this.field_d == 0 ||
          this.field_d == 1) {
          ah.a(false, param0 ^ 577);
          je.a(-75, -128, gb.field_j);
        }
        if (!pg.field_e &&
          gb.field_j != -1) {
          ie.a(gb.field_j, ad.field_m, param0 ^ 520);
        }
        if (400 <= ve.field_b) {
          var2 = (-ve.field_b + 500) * 96 / 100;
          mi.a(320, 240, var2, 16711680, 128);
          mi.a(320, 240, var2 * 62 / 64, 16776960, 128);
          mi.a(320, 240, 60 * var2 / 64, 16776960, 128);
          mi.a(320, 240, var2 * 58 / 64, 16777215, 128);
          mi.a(320, 240, var2 * 57 / 64, 16777215, 128);
          mi.a(320, 240, 56 * var2 / 64, 16777215, 128);
          mi.a(320, 240, 55 * var2 / 64, 16777215, 128);
          mi.a(320, 240, var2 * 54 / 64, 16777215, 128);
        } else {
          if (ve.field_b >= 350) {
            var2 = 96;
            var3 = -(440 * (ve.field_b - 350) / 50) + 440;
            mi.a(320, 240, var2, 16711680, 128);
            mi.a(320, 240, 62 * var2 / 64, 16776960, 128);
            mi.a(320, 240, 60 * var2 / 64, 16776960, 128);
            mi.a(320, 240, 58 * var2 / 64, 16777215, 128);
            mi.a(320, 240, 57 * var2 / 64, 16777215, 128);
            mi.a(320, 240, var2 * 56 / 64, 16777215, 128);
            mi.a(320, 240, 55 * var2 / 64, 16777215, 128);
            mi.a(320, 240, 54 * var2 / 64, 16777215, 128);
            hj.field_n.c(320 - hj.field_n.field_q * 200 / hj.field_n.field_r, -440 + var3, hj.field_n.field_q * 400 / hj.field_n.field_r, 400);
          } else {
            if (ve.field_b >= 250) {
              hj.field_n.c(320 - 250 * hj.field_n.field_q / hj.field_n.field_r, -10, 500 * hj.field_n.field_q / hj.field_n.field_r, 500);
              hj.field_p.d(320 - hj.field_p.field_q / 2, 3 * (480 - hj.field_p.field_r) / 5);
              if (330 <= ve.field_b) {
                mi.a(0, 0, 640, 480, 16777215, -3944 + 12 * ve.field_b);
              }
            }
          }
        }
        if (ve.field_b >= 250) {
          return;
        }
        qd.field_f[this.field_d].d(10, 11);
        var2Lifetime1 = 224;
        var3Lifetime1 = 416;
        var4 = ah.field_i[this.field_d];
        var5 = si.field_F[this.field_d] * this.field_f.field_g + var4;
        if (this.field_d == 5) {
          var2Lifetime1 = 100;
          var4 = 40;
          var3Lifetime1 = -var2Lifetime1 + 640;
        }
        var6 = -var2Lifetime1 + var3Lifetime1 >> 1;
        var7 = -var4 + var5;
        if (gg.field_f[this.field_d]) {
          var3Lifetime2 = bb.field_P[this.field_d];
          var2Lifetime2 = jb.field_a[this.field_d];
          var6Lifetime1 = -var2Lifetime2 + var3Lifetime2 >> 1;
          uj.a((var6Lifetime1 << 1) + 40, var7 + 50, -20 + var2Lifetime2, h.field_d, var4 - 20, 2);
        }
        if (this.field_d == 0) {
          ug.field_g.a(uc.field_h[kb.field_b], 480, 95, 16776960, 1);
          var8 = 28;
          var9 = 110;
          var10 = 316;
          var11 = h.field_b.field_q * var10 / h.field_b.field_r;
          h.field_b.c(var8, var9, var11, var10);
          h.field_b.c(-var11 + (640 - var8), var9, var11, var10);
        }
        L7: {
          if (2 == this.field_d) {
            this.a(-56);
          } else {
            if (4 != this.field_d) {
              if (this.field_d != 3 &&
                7 != this.field_d) {
                if (8 != this.field_d) {
                  if (this.field_d == 9) {
                    ad.field_b.a(ua.field_E, 30, 80, 580, 300, 0, -1, 0, 0, 0);
                  } else {
                    if (this.field_d != 5) {
                      if ((6 == this.field_d)) {
                        var8 = 220;
                        var9Lifetime1 = 118;
                        var10Lifetime1 = var9Lifetime1 - 10 >> 1;
                        var11Lifetime1 = -37 + (-var8 + 480) + var10Lifetime1 >> 1;
                        fi.a(var9Lifetime1, true, 1, 230, 638, var8, var11Lifetime1);
                        ad.field_b.a(Integer.toString(100 * oa.field_m), 112, -103 + (var11Lifetime1 + 155), 16777215, -1);
                        ug.field_g.a(qb.field_X, 112, 57 + var11Lifetime1, 0, 0, 16777215, -1, 1, 0, ug.field_g.field_F + ug.field_g.field_s);
                        if (ob.field_l > 0) {
                          var15 = 5000;
                          var13_ref_String = w.field_d;
                          var12_ref_String = kh.field_e;
                          var14_ref_String = bb.a(jj.field_I, new String[]{Integer.toString(lk.field_e)}, -63);
                        } else {
                          var12_ref_String = bb.a(he.field_e, new String[]{Integer.toString(kb.field_b + 1)}, -63);
                          var15 = oa.field_m * 100 + lk.field_e;
                          var13_ref_String = ud.field_j;
                          var14_ref_String = ai.field_d;
                        }
                        ad.field_b.a(var12_ref_String, 222, -103 + (71 + var11Lifetime1), 194, 82, 16776960, 16777215, 1, 1, ad.field_b.field_s + ad.field_b.field_F);
                        ad.field_b.a(Integer.toString(var15), 528, var11Lifetime1 + 155 - 103, 16777215, -1);
                        ug.field_g.a(var13_ref_String, 528, -103 + (160 + var11Lifetime1), 0, 0, 16777215, -1, 1, 0, ug.field_g.field_F + ug.field_g.field_s);
                        ad.field_b.a(var14_ref_String, 320, var11Lifetime1 + 229 - 103, 16776960, -1);
                        h.field_b.c(45, var11Lifetime1 + 200 - 103, 100 * h.field_b.field_q / h.field_b.field_r, 100);
                        h.field_b.c(-(100 * h.field_b.field_q / h.field_b.field_r) + 595, -103 + (var11Lifetime1 + 200), h.field_b.field_q * 100 / h.field_b.field_r, 100);
                        ad.field_b.a(ti.field_a, 320, 277 - (-var11Lifetime1 + 103), 16727871, -1);
                        ah.field_i[this.field_d] = var8 + var11Lifetime1;
                      }
                    } else {
                      var8 = kb.field_b;
                      if (kd.field_a == this.field_d &&
                        this.field_d != ri.field_f) {
                        var8--;
                      }
                      var9Lifetime1Lifetime2 = ad.field_b.b(rf.field_N[var8], 564);
                      var10Lifetime1Lifetime1 = 220 + var9Lifetime1Lifetime2 * 28;
                      var11Lifetime1Lifetime1 = 118;
                      var12 = -10 + var11Lifetime1Lifetime1 >> 1;
                      var13 = -37 + (480 + (-var10Lifetime1Lifetime1 + var12)) >> 1;
                      fi.a(var11Lifetime1Lifetime1, true, 1, 230, 638, var10Lifetime1Lifetime1, var13);
                      ad.field_b.a(bb.a(he.field_e, new String[]{Integer.toString(1 + var8)}, -63), 222, -32 + var13, 194, 82, 16776960, 16777215, 1, 1, ad.field_b.field_F + ad.field_b.field_s);
                      ad.field_b.a(Integer.toString(oa.field_m * 100), 112, var13 + 52, 16777215, -1);
                      ug.field_g.a(qb.field_X, 112, var13 + 57, 0, 0, 16777215, -1, 1, 0, ug.field_g.field_s + ug.field_g.field_F);
                      ad.field_b.a(Integer.toString(oa.field_m * 100 + lk.field_e), 528, 52 + var13, 16777215, -1);
                      ug.field_g.a(dc.field_m, 528, -103 + (160 + var13), 0, 0, 16777215, -1, 1, 0, ug.field_g.field_s + ug.field_g.field_F);
                      ad.field_b.a(gd.field_b, 320, 229 + var13 - 103, 16776960, -1);
                      var14 = var8 + 1 << 3;
                      if (var8 == 0) {
                        var14 = 16;
                      }
                      if (var8 == 1) {
                        var14 = 8;
                      }
                      td.field_e[var14 + hg.field_y].d(83, 248 + var13 - 103);
                      td.field_e[hg.field_y + var14].d(526, var13 + 145);
                      ad.field_b.a(mf.field_y[var8], 320, -103 + (var13 + 277), 16727871, -1);
                      ad.field_b.a(rf.field_N[var8], 38, var13 + 193, 564, 480, 16777215, -1, 1, 0, 28);
                      ah.field_i[this.field_d] = var13 + var10Lifetime1Lifetime1;
                    }
                  }
                } else {
                  var8 = dd.field_b;
                  var9Lifetime1Lifetime1 = 4 + (ad.field_b.field_m + ad.field_b.field_s);
                  var8 = var8 + var9Lifetime1Lifetime1 * ad.field_b.a(ba.field_r, 20, var8, 600, 1000, 16777215, -1, 1, 0, var9Lifetime1Lifetime1);
                  stackIn_59_0 = var8;
                  stackIn_59_1 = ad.field_b;
                  stackIn_59_2 = 71;
                  stackIn_60_3 = (lk.field_e != 0);
                  stackIn_62_4 = false;
                  stackIn_63_5 = (jl.field_d != 0);
                  var8 = stackIn_59_0 + ((hd) (Object) stackIn_59_1).a(ai.$cfr$intArgs$a$c7de0d339b2a(stackIn_59_2, stackIn_60_3, stackIn_62_4, stackIn_63_5), 20, var8, 600, 1000, 16777215, -1, 1, 0, var9Lifetime1Lifetime1) * var9Lifetime1Lifetime1;
                  var8 = var8 + (41 + var9Lifetime1Lifetime1);
                  stackIn_65_0 = var8;
                  stackIn_65_1 = var9Lifetime1Lifetime1;
                  stackIn_65_2 = ad.field_b;
                  stackIn_66_3 = (jl.field_d != 0);
                  stackIn_69_4 = (lk.field_e != 0);
                  var8 = stackIn_65_0 + stackIn_65_1 * ((hd) (Object) stackIn_65_2).a(qh.a(stackIn_66_3, stackIn_69_4, false, (byte) 8), 20, var8, 600, 1000, 16777215, -1, 1, 0, var9Lifetime1Lifetime1);
                  var8 += 41;
                  stackIn_71_0 = var8;
                  stackIn_71_1 = ad.field_b;
                  stackIn_72_2 = (0 != lk.field_e);
                  stackIn_74_3 = -116;
                  stackIn_74_4 = false;
                  stackIn_75_5 = (jl.field_d != 0);
                  var8 = stackIn_71_0 + ((hd) (Object) stackIn_71_1).a(jl.a(stackIn_72_2, stackIn_74_3, stackIn_74_4, stackIn_75_5), 20, var8, 600, 1000, 16777215, -1, 1, 0, var9Lifetime1Lifetime1) * var9Lifetime1Lifetime1;
                }
                break L7;
              }
              fi.a(118, true, 1, 398, 638, 277, 129);
              stackIn_37_1 = (7 == this.field_d);
              this.a(stackIn_37_1, param0 - 590);
            } else {
              this.b((byte) 101);
            }
          }
        }
        if (param0 != 582) {
          return;
        }
        for (var8 = 0; var8 < this.field_f.field_g; var8++) {
          if (this.b((byte) -4, var8)) {
            stackIn_86_1 = false;
            stackIn_87_2 = (var8 == this.field_f.field_f);
            this.a(stackIn_86_1, stackIn_87_2, var8);
          }
        }
        return;
    }

    private final void b(byte param0) {
        int var2 = ug.field_g.field_F + ug.field_g.field_s;
        int var3 = ug.field_g.b(c.field_E, 600);
        int var4 = (4 + var3) * var2 + 60;
        int var5 = -var4 + 574 >> 1;
        ah.field_i[this.field_d] = -30 + var5 + var4;
        uj.a(638, var4, 1, h.field_d, var5 - 30, 2);
        if (param0 <= 39) {
          field_c = (long[][]) null;
        }
        var5 = var5 + ug.field_g.a(c.field_E, 20, var5, 600, 640, 16777215, -1, 1, 0, var2) * var2;
        var5 = var5 + (var2 << 1);
        ug.field_g.a(ii.field_i, 320, var5, 16776960, -1);
        var5 = var5 + var2;
        ug.field_g.a(pg.field_c, 320, var5, 16776960, -1);
        var5 = var5 + var2;
        ug.field_g.a(h.field_c, 320, var5, 16776960, -1);
    }

    private final void a(int param0) {
        int var9 = 0;
        String stackIn_29_0 = null;
        String var2;
        hd var3;
        sd var4_ref_sd;
        int var4;
        String[] var5;
        int var7;
        int var8;
        int var10;
        int var11;
        String var12;
        int var13;
        int[] var17;
        int var8Lifetime1;
        String var2Lifetime1;
        var13 = SolKnight.field_L ? 1 : 0;
        if (param0 > -22) {
          this.field_e = -45;
        }
        L1: {
          var3 = ug.field_g;
          uj.a(638, 313, 1, h.field_d, 86, 2);
          if (!il.b(507)) {
            if (kh.field_c == null) {
              kh.field_c = mb.a(15, 1, (byte) 123, 10, 3);
            }
            var4_ref_sd = kh.field_c;
            if (!var4_ref_sd.field_h) {
              var2 = qf.field_g;
            } else {
              if (null != var4_ref_sd.field_n) {
                var2 = og.field_k;
                var5 = var4_ref_sd.field_n[rg.field_c];
                var17 = var4_ref_sd.field_i[rg.field_c];
                var7 = ti.a(bi.field_b, rg.field_c, var4_ref_sd, 0);
                var8 = var3.field_F + 127;
                for (var9 = 0; 10 > var9; var9++) {
                  if (var5[var9] != null) {
                    var10 = 16777215;
                    var11 = var17[var9];
                    var12 = var5[var9];
                    if (var7 == var9) {
                      var10 = 16776960;
                    }
                    var3.b(var9 + 1 + ". ", 73, var8, var10, -1);
                    var3.c(var12, 73, var8, var10, -1);
                    var3.b(bb.a("<%0>%", new String[]{Integer.toString(var11 % 101)}, -63), 380, var8, var10, -1);
                    var2 = "";
                    var3.b(Integer.toString(var11 / 101), 582, var8, var10, -1);
                  }
                  var8 += 21;
                }
                if (bi.field_b != null &&
                  var7 == -1) {
                  var3.c(ne.field_g, 73, var8, 16776960, -1);
                  var3.b(bb.a("<%0>%", new String[]{Integer.toString(bi.field_b.field_r[0] % 101)}, -63), 380, var8, 16776960, -1);
                  var3.b(Integer.toString(bi.field_b.field_r[0] / 101), 582, var8, 16776960, -1);
                }
                if ((var2.length() == 0)) {
                  var8Lifetime1 = 106 + var3.field_F;
                  var3.b(ne.field_a, 380, var8Lifetime1, 1134591, -1);
                  var3.b(mf.field_K, 582, var8Lifetime1, 1134591, -1);
                }
                break L1;
              }
              var2 = lk.field_a;
            }
          } else {
            var2 = og.field_k;
          }
        }
        var4 = 105 + (106 + var3.field_F);
        var3.a(var2, 327, var4, 1134591, -1);
        if (il.b(507)) {
          stackIn_29_0 = mf.field_n;
        } else {
          stackIn_29_0 = ad.field_o;
        }
        var2Lifetime1 = stackIn_29_0;
        var3.a(var2Lifetime1, 320, 106 + var3.field_F + 252, 1134591, -1);
    }

    private final void a(boolean param0, int param1) {
        int incrementValue$0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_46_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        String[] var12;
        int var13;
        int var14;
        int var15;
        int var3Lifetime1;
        int var8Lifetime1;
        int var14Lifetime1;
        var15 = SolKnight.field_L ? 1 : 0;
        var3 = 144;
        if (param1 != -8) {
          this.field_d = -81;
        }
        var4 = 103;
        if (param0) {
          stackIn_5_0 = jl.field_d;
        } else {
          stackIn_5_0 = ah.field_f;
        }
        var5 = stackIn_5_0;
        var6 = 0;
        var7 = -1;
        for (var8 = 0; var8 < hb.field_m.length; var8++) {
          L10: {
            if ((var5 & 1 << var8) != 0) {
              ii.field_f[var8].e(var3, var4);
            } else {
              if (param0) {
                break L10;
              }
              if (ob.field_l <= 0) {
                if ((1 << var8 & 28032) != 0) {
                  nb.field_a.e(var3, var4);
                } else {
                  jc.field_b.e(var3, var4);
                }
              } else {
                jc.field_b.e(var3, var4);
              }
            }
            if (var3 <= gb.field_j &&
              gb.field_j <= 32 + var3 &&
              var4 <= ad.field_m &&
              ad.field_m <= 32 + var4) {
              var7 = var8;
              mi.b(-2 + var3, var4 - 2, 36, 36, 6, 1134591);
            }
            if (this.field_a >= var3 &&
              var3 + 32 >= this.field_a &&
              var4 <= this.field_b &&
              32 + var4 >= this.field_b) {
              if (this.field_e != var8) {
                this.field_e = var8;
              } else {
                this.field_e = -1;
              }
              this.field_a = -1;
            }
            if (var8 == this.field_e) {
              mi.b(var3 - 2, var4 - 2, 36, 36, 6, 16776960);
            }
            incrementValue$0 = var6;
            var6++;
            if (incrementValue$0 == 8) {
              var4 += 40;
              var3 = 144;
            }
            var3 += 40;
          }
        }
        if (this.field_e >= 0) {
          var7 = this.field_e;
        }
        if (var7 != -1) {
          var8Lifetime1 = ad.field_b.field_s + ad.field_b.field_m;
          ad.field_b.a(hb.field_m[var7], 320, 226, 16776960, -1);
          var9 = var8Lifetime1;
          var10 = 226 + ad.field_b.field_F + ad.field_b.field_s;
          stackIn_46_0 = ((var5 & 1 << var7) == 0) ? 0 : 1;
          var11 = stackIn_46_0;
          if (var11 == 0) {
            ad.field_b.a(lf.field_b, 320, var10, 16727871, -1);
          } else {
            ad.field_b.a(hc.field_f, 320, var10, 16777215, -1);
          }
          if (var11 == 0) {
            if (ob.field_l <= 0) {
              if ((1 << var7 & 28032) == 0) {
                jc.field_b.d(36, 226);
              } else {
                nb.field_a.d(36, 226);
              }
            } else {
              jc.field_b.d(36, 226);
            }
          } else {
            ii.field_f[var7].d(36, 226);
          }
          var10 = var10 + (ad.field_b.field_F + ad.field_b.field_s);
          var12 = new String[16];
          var13 = ad.field_b.a(kk.field_a[var7], new int[]{410}, var12);
          for (var14 = 0; var13 > var14; var14++) {
            ad.field_b.c(var12[var14], 190, var10, 16777215, -1);
            var10 = var10 + var9;
          }
          var10 += 5;
          ad.field_b.c(ff.field_d + 100 * fc.field_n[var7], 190, var10, 16777215, -1);
          var10 = var10 + var9;
          var3Lifetime1 = 190;
          ad.field_b.c(cf.field_b, var3Lifetime1, var10, 16777215, -1);
          var3Lifetime1 = var3Lifetime1 + ad.field_b.b(cf.field_b);
          for (var14Lifetime1 = 0; var14Lifetime1 < fc.field_n[var7]; var14Lifetime1++) {
            pg.field_a.d(var3Lifetime1, -ad.field_b.field_m + var10);
            var3Lifetime1 = var3Lifetime1 + pg.field_a.field_p / 3;
          }
        } else {
          if (il.b(param1 ^ -509)) {
            ad.field_b.a(kg.field_b, 25, -ad.field_b.field_F + 241, 590, 1000, 16776960, -1, 1, 0, ad.field_b.field_s + ad.field_b.field_F);
            ad.field_b.a(mf.field_n, 25, 2 * ad.field_b.field_F + 241, 590, 1000, 16776960, -1, 1, 0, ad.field_b.field_s + ad.field_b.field_F);
          } else {
            ad.field_b.a(kg.field_b, 320, 296, 16776960, -1);
          }
        }
    }

    ie(int param0) {
        this.field_e = -1;
        this.field_a = -1;
        this.field_d = param0;
        this.field_f = new sf(ab.field_s[param0].length);
    }

    final static void b(int param0) {
        String var2 = (String) null;
        le.a(-88, ug.field_d, (String) null);
        if (param0 > -98) {
          ie.a(-121, 32, 65);
        }
    }

    static {
        int var1 = 0;
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        long var8 = 0L;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        field_c = new long[8][256];
        field_g = new long[11];
        int var0 = 0;
        while (var0 < 256) {
            var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
            var2 = (var0 & 1) != 0 ? (long)(var1 & 255) : (long)(var1 >>> 8);
            var4 = var2 << 1;
            if (256L <= var4) {
                var4 = var4 ^ 285L;
            }
            var6 = var4 << 1;
            if (var6 >= 256L) {
                var6 = var6 ^ 285L;
            }
            var8 = var2 ^ var6;
            var10 = var6 << 1;
            if (var10 >= 256L) {
                var10 = var10 ^ 285L;
            }
            var12 = var10 ^ var2;
            field_c[0][var0] = td.a(td.a(var4 << 8, td.a(var8 << 16, td.a(td.a(td.a(var6 << 40, td.a(var2 << 56, var2 << 48)), var2 << 32), var10 << 24))), var12);
            for (var14 = 1; 8 > var14; var14++) {
                field_c[var14][var0] = td.a(field_c[var14 - 1][var0] << 56, field_c[-1 + var14][var0] >>> 8);
            }
            var0++;
        }
        field_g[0] = 0L;
        int var15 = 1;
        var0 = var15;
        while (var15 <= 10) {
            var1 = 8 * (-1 + var15);
            field_g[var15] = ke.a(ke.a(tk.a(field_c[6][6 + var1], 65280L), ke.a(ke.a(ke.a(tk.a(1095216660480L, field_c[3][3 + var1]), ke.a(ke.a(tk.a(-72057594037927936L, field_c[0][var1]), tk.a(71776119061217280L, field_c[1][1 + var1])), tk.a(280375465082880L, field_c[2][var1 + 2]))), tk.a(field_c[4][4 + var1], 4278190080L)), tk.a(field_c[5][5 + var1], 16711680L))), tk.a(255L, field_c[7][var1 + 7]));
            var15++;
        }
    }
}
