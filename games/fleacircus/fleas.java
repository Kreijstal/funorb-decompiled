/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

public final class fleas extends NetworkGameClient {
    private dd field_C;
    static String field_H;
    static Random field_F;
    private static long[] field_J;
    private double field_M;
    private dd field_D;
    static int field_E;
    private dd[] field_N;
    static int field_L;
    private static int[][] field_G;
    private static ng field_K;
    static ni field_B;
    static String field_I;
    public static boolean field_A;

    private final void a(int param0, boolean param1, int param2, int param3, int param4) {
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_8_0 = 0;
        char stackIn_10_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_74_1 = 0;
        int stackIn_143_0 = 0;
        sf stackIn_144_1 = null;
        int stackIn_165_0 = 0;
        int stackIn_182_0 = 0;
        int stackIn_182_1 = 0;
        int stackIn_186_0 = 0;
        char stackIn_188_1 = 0;
        int stackIn_208_0 = 0;
        int stackIn_213_0 = 0;
        int stackIn_213_1 = 0;
        int stackIn_217_0 = 0;
        int stackIn_233_0 = 0;
        int stackIn_248_0 = 0;
        RuntimeException decompiledCaughtException = null;
        char stackOut_9_0;
        char stackOut_187_1;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_4_0Lifetime1;
        int stackIn_4_1Lifetime1;
        int stackIn_182_0Lifetime1;
        int stackIn_182_1Lifetime1;
        int stackIn_213_0Lifetime1;
        int stackIn_213_1Lifetime1;
        int stackIn_233_0Lifetime1;
        int var6_intLifetime1;
        int var6_intLifetime2;
        int var6_intLifetime3;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var8Lifetime4;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var9Lifetime4;
        int var8Lifetime4Lifetime1;
        int var9Lifetime4Lifetime1;
        var12 = field_A ? 1 : 0;
        try {
          boolean decompiledFrameCompleted4 = true;
          if (10 == fl.field_c[param3][param0]) {
            fh.$cfr$intArgs$a$cb0bc10e6b69(105, ab.field_a, 100, 63);
            lj.field_c[uf.field_h] = param3;
            fb.field_e[uf.field_h] = param0;
            nc.field_a[uf.field_h] = ni.field_j;
            uf.field_h = uf.field_h + 1;
            var6_int = param3 - 1;
            while (true) {
              stackIn_4_0 = param3 + 1;
              stackIn_4_1 = var6_int;
              if (stackIn_4_0 < stackIn_4_1) {
                break;
              }
              stackIn_27_0 = -1 + param0;
              if (var12 != 0) {
                decompiledFrameCompleted4 = false;
                break;
              }
              var7 = stackIn_27_0;
              while (true) {
                stackIn_8_0 = var7;
                if (stackIn_8_0 <= param0 + 1) {
                  stackOut_9_0 = fl.field_c[var6_int][var7];
                  stackIn_4_0Lifetime1 = stackOut_9_0;
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_4_1Lifetime1 = 15;
                  if (stackIn_10_0 == stackIn_4_1Lifetime1) {
                    fl.field_c[var6_int][2 + var7] = '\002';
                  }
                  fl.field_c[var6_int][var7] = '\0';
                  this.a((byte) -120, var7, var6_int);
                  var8 = 0;
                  while (var8 < 4) {
                    stackIn_8_0 = 0;
                    var9 = stackIn_8_0;
                    while (var9 < 4) {
                      IntrusiveNode.field_e[var8 + 4 * var6_int][4 * var7 + var9] = 0;
                      var9++;
                    }
                    var8++;
                  }
                  var7++;
                  continue;
                }
                break;
              }
              var6_int++;
            }
          }
          if (decompiledFrameCompleted4) {
            stackIn_27_0 = fl.field_c[param3][param0];
          }
          boolean decompiledFrameCompleted3 = true;
          if (stackIn_27_0 == 5) {
            fh.$cfr$intArgs$a$cb0bc10e6b69(102, ih.field_l, 100, 63);
            fl.field_c[param3][param0] = '\0';
            this.a((byte) -117, param0, param3);
            jd.field_o[param2] = 1;
            var8Lifetime1 = 0;
            while (var8Lifetime1 < 4) {
              stackIn_42_0 = 0;
              if (var12 != 0) {
                decompiledFrameCompleted3 = false;
                break;
              }
              var9Lifetime1 = stackIn_42_0;
              while (4 > var9Lifetime1) {
                IntrusiveNode.field_e[var8Lifetime1 + param3 * 4][var9Lifetime1 + param0 * 4] = 0;
                var9Lifetime1++;
              }
              var8Lifetime1++;
            }
          }
          if (decompiledFrameCompleted3) {
            stackIn_42_0 = ~fl.field_c[param3][param0];
          }
          if (stackIn_42_0 == -7 &&
            param4 == 2) {
            fl.field_c[param3][param0] = '!';
            field_G[param3][param0] = 2;
            jd.field_o[param2] = 2;
            fh.$cfr$intArgs$a$cb0bc10e6b69(-70, me.field_k, 100, 384 / ee.field_h);
            ee.field_h = ee.field_h + 12;
            if (ee.field_h > 32) {
              ee.field_h = 32;
            }
          }
          if (7 == fl.field_c[param3][param0] &&
            2 == param4 &&
            0 == db.field_H) {
            var7Lifetime1 = pl.field_g;
            var6_intLifetime1 = 0;
            while (true) {
              if (pl.field_g > var6_intLifetime1) {
                stackIn_74_0 = param3;
                stackIn_74_1 = f.field_F[var6_intLifetime1];
                if (var12 == 0) {
                  if (stackIn_74_0 == stackIn_74_1 &&
                    param0 == ek.field_b[var6_intLifetime1]) {
                    var7Lifetime1 = var6_intLifetime1;
                  }
                  var6_intLifetime1++;
                  continue;
                }
              } else {
                stackIn_74_0 = ~var7Lifetime1;
                stackIn_74_1 = ~pl.field_g;
              }
              if (stackIn_74_0 == stackIn_74_1 ||
                uf.field_b[var7Lifetime1] != 4) {
                uf.field_b[var7Lifetime1] = 4;
                fh.$cfr$intArgs$a$cb0bc10e6b69(-91, hi.field_p, 100, 63);
              }
              if (~pl.field_g != ~var7Lifetime1) {
                break;
              }
              f.field_F[var7Lifetime1] = param3;
              ek.field_b[var7Lifetime1] = param0;
              hl.field_C[var7Lifetime1] = 0;
              fl.field_c[param3][param0 - 2] = '\036';
              this.a((byte) -89, param0 - 2, param3);
              pl.field_g = pl.field_g + 1;
              break;
            }
          }
          if ((fl.field_c[param3][param0] == 13 ||
            27 == fl.field_c[param3][param0]) &&
            3 != param4) {
            cl.field_d[param2] = 1;
            c.field_U = true;
            fh.$cfr$intArgs$a$cb0bc10e6b69(-59, ah.field_a, 100, 63);
          }
          if (16 == fl.field_c[param3][param0] ||
            fl.field_c[param3][param0] == 29) {
            if (~pc.field_b == ~param3 &&
              ~lb.field_m == ~param0) {
              var10 = tg.field_d;
              var11 = hf.field_b;
              if (var12 != 0) {
                var10 = pc.field_b;
                var11 = lb.field_m;
              }
            } else {
              var10 = pc.field_b;
              var11 = lb.field_m;
            }
            if (fl.field_c[var10][var11] == 16 ||
              fl.field_c[var10][var11] == 29) {
              if (ge.field_a[param2] > 0 &&
                0 >= IntrusiveNode.field_e[4 + var10 * 4][4 * var11]) {
                qg.field_a[param2] = 16 + 16 * var10;
                dh.field_b[param2] = var11 * 16;
                fh.$cfr$intArgs$a$cb0bc10e6b69(89, uh.field_s, 100, 63);
              }
              if (0 > ge.field_a[param2] &&
                IntrusiveNode.field_e[var10 * 4 - 1][4 * var11] <= 0) {
                qg.field_a[param2] = var10 * 16 - 4;
                dh.field_b[param2] = 16 * var11;
                fh.$cfr$intArgs$a$cb0bc10e6b69(116, uh.field_s, 100, 63);
              }
            }
          }
          if (17 == fl.field_c[param3][param0] ||
            fl.field_c[param3][param0] == 31) {
            cl.field_d[param2] = 1;
            pl.field_f = pl.field_f + 1;
            wi.field_p.a(-121, 100);
            fh.$cfr$intArgs$a$cb0bc10e6b69(102, nb.field_f, 100, 63);
          }
          if (!param1) {
            field_K = (ng) null;
          }
          if (fl.field_c[param3][param0] == 19 &&
            we.field_c == 0) {
            stackIn_143_0 = 117;
            if (md.field_L < 0) {
              stackIn_144_1 = ha.field_o;
            } else {
              stackIn_144_1 = hg.field_k;
            }
            fh.$cfr$intArgs$a$cb0bc10e6b69(stackIn_143_0, stackIn_144_1, 100, 63);
            ue.field_d = -ue.field_d;
            md.field_L = -md.field_L;
            we.field_c = 3;
            db.field_H = 4 - db.field_H;
            if (param4 < 2) {
              ge.field_a[param2] = -ge.field_a[param2];
            }
          }
          boolean decompiledFrameCompleted2 = true;
          if (fl.field_c[param3][param0] == 21 &&
            param4 < 2) {
            fh.$cfr$intArgs$a$cb0bc10e6b69(-102, fg.field_l, 100, 63);
            fl.field_c[param3][param0] = '\0';
            this.a((byte) -115, param0, param3);
            ge.field_a[param2] = -ge.field_a[param2];
            var8Lifetime2 = 0;
            while (var8Lifetime2 < 4) {
              stackIn_165_0 = 0;
              if (var12 != 0) {
                decompiledFrameCompleted2 = false;
                break;
              }
              var9Lifetime2 = stackIn_165_0;
              while (var9Lifetime2 < 4) {
                IntrusiveNode.field_e[var8Lifetime2 + 4 * param3][4 * param0 + var9Lifetime2] = 0;
                var9Lifetime2++;
              }
              var8Lifetime2++;
            }
          }
          if (decompiledFrameCompleted2) {
            stackIn_165_0 = fl.field_c[param3][param0];
          }
          if (stackIn_165_0 == 22 &&
            2 == param4) {
            fl.field_c[param3][param0] = '\032';
            rf.field_e[gh.field_q] = param3;
            hf.field_d[gh.field_q] = param0;
            wh.field_d[gh.field_q] = param2;
            gh.field_q = gh.field_q + 1;
          }
          boolean decompiledFrameCompleted1 = true;
          if (fl.field_c[param3][param0] == 23) {
            fh.$cfr$intArgs$a$cb0bc10e6b69(-120, gf.field_g, 100, 63);
            if (15 == tj.field_a &&
              field_E == 0) {
              hg.a(-25389, 4, 251, tj.field_a);
            }
            var6_intLifetime2 = 0;
            while (true) {
              stackIn_182_0 = var6_intLifetime2;
              stackIn_182_1 = 40;
              if (stackIn_182_0 >= stackIn_182_1) {
                break;
              }
              stackIn_208_0 = 0;
              if (var12 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
              var7Lifetime2 = stackIn_208_0;
              while (true) {
                stackIn_186_0 = var7Lifetime2;
                if (stackIn_186_0 < 21) {
                  stackIn_182_0Lifetime1 = 23;
                  stackOut_187_1 = fl.field_c[var6_intLifetime2][var7Lifetime2];
                  stackIn_182_1Lifetime1 = stackOut_187_1;
                  stackIn_188_1 = stackOut_187_1;
                  if (stackIn_182_0Lifetime1 == stackIn_188_1 ||
                    fl.field_c[var6_intLifetime2][var7Lifetime2] == 20) {
                    fl.field_c[var6_intLifetime2][var7Lifetime2] = '\0';
                    this.a((byte) -122, var7Lifetime2, var6_intLifetime2);
                    var8Lifetime3 = 0;
                    while (4 > var8Lifetime3) {
                      stackIn_186_0 = 0;
                      var9Lifetime3 = stackIn_186_0;
                      while (4 > var9Lifetime3) {
                        IntrusiveNode.field_e[var8Lifetime3 + var6_intLifetime2 * 4][var9Lifetime3 + var7Lifetime2 * 4] = 0;
                        var9Lifetime3++;
                      }
                      var8Lifetime3++;
                    }
                  }
                  var7Lifetime2++;
                  continue;
                }
                break;
              }
              var6_intLifetime2++;
            }
          }
          if (decompiledFrameCompleted1) {
            stackIn_208_0 = fl.field_c[param3][param0];
          }
          boolean decompiledFrameCompleted0 = true;
          if (stackIn_208_0 == 24) {
            fh.$cfr$intArgs$a$cb0bc10e6b69(117, gf.field_g, 100, 63);
            var6_intLifetime3 = 0;
            while (true) {
              stackIn_213_0 = 40;
              stackIn_213_1 = var6_intLifetime3;
              if (stackIn_213_0 <= stackIn_213_1) {
                break;
              }
              stackIn_248_0 = 0;
              if (var12 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              var7Lifetime3 = stackIn_248_0;
              while (true) {
                stackIn_217_0 = 21;
                if (stackIn_217_0 > var7Lifetime3) {
                  stackIn_213_0Lifetime1 = ~fl.field_c[var6_intLifetime3][var7Lifetime3];
                  stackIn_213_1Lifetime1 = -25;
                  if (stackIn_213_0Lifetime1 == stackIn_213_1Lifetime1) {
                    fl.field_c[var6_intLifetime3][var7Lifetime3] = '\0';
                    this.a((byte) -109, var7Lifetime3, var6_intLifetime3);
                    var8Lifetime4 = 0;
                    while (var8Lifetime4 < 4) {
                      stackIn_233_0 = 0;
                      var9Lifetime4 = stackIn_233_0;
                      while (4 > var9Lifetime4) {
                        IntrusiveNode.field_e[var6_intLifetime3 * 4 + var8Lifetime4][var7Lifetime3 * 4 + var9Lifetime4] = 0;
                        var9Lifetime4++;
                      }
                      var8Lifetime4++;
                    }
                  }
                  stackIn_233_0Lifetime1 = -19;
                  if (stackIn_233_0Lifetime1 == ~fl.field_c[var6_intLifetime3][var7Lifetime3]) {
                    fl.field_c[var6_intLifetime3][var7Lifetime3] = '\002';
                    this.a((byte) -99, var7Lifetime3, var6_intLifetime3);
                    var8Lifetime4Lifetime1 = 0;
                    while (var8Lifetime4Lifetime1 < 4) {
                      stackIn_217_0 = 0;
                      var9Lifetime4Lifetime1 = stackIn_217_0;
                      while (var9Lifetime4Lifetime1 < 4) {
                        IntrusiveNode.field_e[var6_intLifetime3 * 4 + var8Lifetime4Lifetime1][var7Lifetime3 * 4 + var9Lifetime4Lifetime1] = 1;
                        var9Lifetime4Lifetime1++;
                      }
                      var8Lifetime4Lifetime1++;
                    }
                  }
                  var7Lifetime3++;
                  continue;
                }
                break;
              }
              var6_intLifetime3++;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_248_0 = -26;
          }
          if (stackIn_248_0 == ~fl.field_c[param3][param0]) {
            if (param4 == 3 ||
              md.field_L != 1) {
              if (param4 == 1) {
                return;
              }
              if (-1 != md.field_L) {
                return;
              }
            }
            cl.field_d[param2] = 1;
            fh.$cfr$intArgs$a$cb0bc10e6b69(87, kc.field_e, 100, 63);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var6), "fleas.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void b(byte param0) {
        hl.g(0);
        if (null != ResourceArchive.field_p) {
          IntrusiveNode.a(false);
        }
        if (param0 != -61) {
          return;
        }
        try {
          hh.a(param0 ^ -62);
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "fleas.F(" + param0 + ')');
        }
    }

    private final void g(byte param0) {
        int[] array$0 = null;
        int[] array$1 = null;
        int[] array$2 = null;
        dd[] array$3 = null;
        dd[] array$4 = null;
        dd dupTemp$5 = null;
        dd dupTemp$6 = null;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_40_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[][] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4_int = 0;
        dd[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        int[] var7 = null;
        int var8_int = 0;
        dd var8 = null;
        dd[] var9 = null;
        dd[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        vg var13 = null;
        vg var14 = null;
        int var15_int = 0;
        el var15 = null;
        el var16 = null;
        int var17 = 0;
        int var6Lifetime1;
        var17 = field_A ? 1 : 0;
        try {
          aj.field_t = of.a("blocks", "", hm.field_g, 89);
          el.field_s = of.a("fleas", "", hm.field_g, 67);
          var3 = -24 % ((-43 - param0) / 62);
          IntrusiveNode.field_b = (fa) ((Object) tc.a(de.field_h, "squarish16", hm.field_g, (byte) 120, ""));
          var2 = new int[2][];
          var2[0] = ((dj) (IntrusiveNode.field_b)).field_P[0];
          array$0 = new int[var2[0].length];
          var2[1] = array$0;
          var4_int = 1;
          while (true) {
            stackIn_3_0 = var4_int;
            stackIn_3_1 = 2;
            if (stackIn_3_0 < stackIn_3_1) {
              stackIn_17_0 = 0;
              if (var17 == 0) {
                var5 = stackIn_17_0;
                while (var2[var4_int].length > var5) {
                  stackIn_3_0 = 3;
                  stackIn_3_1 = var5;
                  if (stackIn_3_0 <= stackIn_3_1) {
                    var2[var4_int][var5] = 1;
                  } else {
                    var2[var4_int][var5] = var2[0][var5];
                  }
                  var5++;
                }
                var4_int++;
                continue;
              }
            } else {
              ((dj) (IntrusiveNode.field_b)).field_P = var2;
              tl.field_p = (fa) ((Object) tc.a(de.field_h, "fleafont_filled", hm.field_g, (byte) 115, ""));
              var2 = new int[4][];
              var2[0] = ((dj) (tl.field_p)).field_P[0];
              array$1 = new int[var2[0].length];
              var2[1] = array$1;
              array$2 = new int[var2[0].length];
              var2[2] = array$2;
              stackIn_17_0 = 1;
            }
            var4_int = stackIn_17_0;
            while (true) {
              stackIn_19_0 = 3;
              stackIn_19_1 = var4_int;
              if (stackIn_19_0 > stackIn_19_1) {
                stackIn_40_0 = 0;
                if (var17 == 0) {
                  var5 = stackIn_40_0;
                  while (var5 < var2[var4_int].length) {
                    stackIn_19_0 = var5;
                    stackIn_19_1 = 3;
                    if (stackIn_19_0 >= stackIn_19_1) {
                      if (1 == var4_int) {
                        var2[var4_int][var5] = 16777215;
                      } else if (var4_int == 2) {
                        var6 = var2[0][var5] >> 16 & 255;
                        var7_int = (65376 & var2[0][var5]) >> 8;
                        var8_int = var2[0][var5] & 255;
                        var2[var4_int][var5] = ne.a(var8_int / 2, ne.a(var6 / 2 << 16, var7_int / 2 << 8));
                      }
                    } else {
                      var2[var4_int][var5] = var2[0][var5];
                    }
                    var5++;
                  }
                  var4_int++;
                  continue;
                }
              } else {
                se.field_a = new dd[3];
                ((dj) (tl.field_p)).field_P = var2;
                se.field_a[0] = kl.a(252, hm.field_g, "", "texture_1");
                se.field_a[1] = kl.a(252, hm.field_g, "", "texture_3");
                se.field_a[2] = kl.a(252, hm.field_g, "", "texture_5");
                si.field_C = kl.a(252, hm.field_g, "", "main_background");
                qi.field_c = kl.a(252, hm.field_g, "", "back_background");
                nc.field_d = kl.a(252, hm.field_g, "", "ingame_back");
                kl.a(252, hm.field_g, "", "ingame_banner");
                jj.field_P = kl.a(252, hm.field_g, "", "ingame_title");
                stackIn_40_0 = aj.field_t.length + 1;
              }
              var4 = new dd[stackIn_40_0];
              var5 = 0;
              do {
                if (!(aj.field_t.length > var5)) {
                  var4[32] = kl.a(252, hm.field_g, "", "block_water");
                  aj.field_t = var4;
                  be.field_c = kl.a(252, hm.field_g, "", "level_select_arrow");
                  tk.field_m = kl.a(252, hm.field_g, "", "level_select_arrow_pressed");
                  ad.field_b = fc.a(hm.field_g, "level_select_frame", "", (byte) 61);
                  pf.field_a = kl.a(252, hm.field_g, "", "level_select_preview_frame");
                  DualLinkNode.field_n = kl.a(252, hm.field_g, "", "level_select_slider_tab");
                  rd.field_e = kl.a(252, hm.field_g, "", "level_select_bracket");
                  rb.field_G = kl.a(252, hm.field_g, "", "level_select_scroll_bg");
                  de.field_a = kl.a(252, hm.field_g, "", "main_title");
                  fg.field_j = kl.a(252, hm.field_g, "", "achievements_title");
                  aj.field_v = kl.a(252, hm.field_g, "", "instructions_title");
                  va.field_g = kl.a(252, hm.field_g, "", "highscores_title");
                  a.field_f = kl.a(252, hm.field_g, "", "selectlevel_title");
                  uh.field_k = kl.a(252, hm.field_g, "", "menu_box_420");
                  ek.field_c = kl.a(252, hm.field_g, "", "menu_box_480");
                  db.field_I = kl.a(252, hm.field_g, "", "level_complete_congratulations");
                  f.field_E = kl.a(252, hm.field_g, "", "level_complete_1");
                  me.field_g = kl.a(252, hm.field_g, "", "level_complete_2");
                  tk.field_s = kl.a(252, hm.field_g, "", "level_complete_3");
                  kl.a(252, hm.field_g, "", "game_complete_backdrop");
                  this.field_C = kl.a(252, hm.field_g, "", "mb_price_background");
                  this.field_N = of.a("mb_screenshots", "", hm.field_g, 92);
                  this.field_D = kl.a(252, hm.field_g, "", "mb_foreground");
                  lc.field_t = kl.a(252, hm.field_g, "", "game_complete_title");
                  sd.field_e = hm.a("slider_back", hm.field_g, (byte) 127, "");
                  q.field_c = hm.a("slider_left", hm.field_g, (byte) -71, "");
                  lj.field_f = hm.a("slider_right", hm.field_g, (byte) -79, "");
                  tb.field_f = kl.a(252, hm.field_g, "", "slider_tab");
                  gl.field_m = hm.a("checkbox_value_0", hm.field_g, (byte) -88, "");
                  UiComponent.field_l = hm.a("checkbox_value_1", hm.field_g, (byte) -13, "");
                  ai.field_n = of.a("countdown", "", hm.field_g, 103);
                  ji.field_f = new dd[ai.field_n.length];
                  break;
                }
                var4[var5] = aj.field_t[var5];
                var5++;
              } while (var17 == 0);
              var5 = ai.field_n.length - 1;
              do {
                if (var5 < 0) {
                  gi.field_b.a((byte) 125);
                  var5 = gb.field_d;
                  break;
                }
                ji.field_f[var5] = ai.field_n[var5].c();
                ji.field_f[var5].a();
                ji.field_f[var5].f();
                gb.h(5, 1, 0, 0, gb.field_d, gb.field_k);
                var5--;
              } while (var17 == 0);
              var6Lifetime1 = gb.field_k;
              var7 = gb.field_a;
              var8 = new dd(640, 480);
              var8.f();
              qi.field_c.d(0, 0, gb.field_d, gb.field_k);
              gb.h(5, 5, 0, 0, gb.field_d, gb.field_k);
              qi.field_c = var8;
              gb.a(var7, var5, var6Lifetime1);
              ca.field_P = kl.a(252, hm.field_g, "", "explosion");
              il.field_d = of.a("achievementicons", "", hm.field_g, 103);
              var9 = new dd[3];
              var10 = new dd[3];
              var9[0] = kl.a(252, hm.field_g, "", "ingame_background_1");
              var9[1] = kl.a(252, hm.field_g, "", "ingame_background_2");
              var9[2] = kl.a(252, hm.field_g, "", "ingame_background_3");
              var11 = 0;
              do {
                if (var11 >= 3) {
                  gi.field_b.a((byte) 111);
                  nl.field_c = new dd[2][];
                  array$3 = new dd[pl.field_l[0]];
                  nl.field_c[0] = array$3;
                  array$4 = new dd[pl.field_l[1]];
                  nl.field_c[1] = array$4;
                  break;
                }
                var10[var11] = new dd(640, 350);
                var10[var11].f();
                var9[var11].d(0, 0, gb.field_d, gb.field_k);
                gb.h(2, 2, 0, 0, gb.field_d, gb.field_k);
                gb.d(0, 0, gb.field_d, gb.field_k);
                var11++;
              } while (var17 == 0);
              var11 = 0;
              do {
                if (var11 >= 10) {
                  var11 = 10;
                  break;
                }
                nl.field_c[1][var11] = var10[0];
                var11++;
              } while (var17 == 0);
              do {
                if (20 <= var11) {
                  var11 = 20;
                  break;
                }
                nl.field_c[1][var11] = var10[1];
                var11++;
              } while (var17 == 0);
              do {
                if (!(var11 < nl.field_c[1].length)) {
                  var11 = 0;
                  break;
                }
                nl.field_c[1][var11] = var10[2];
                var11++;
              } while (var17 == 0);
              do {
                if (var11 >= 14) {
                  var11 = 14;
                  break;
                }
                nl.field_c[0][var11] = var10[0];
                var11++;
              } while (var17 == 0);
              do {
                if (28 <= var11) {
                  var11 = 28;
                  break;
                }
                nl.field_c[0][var11] = var10[1];
                var11++;
              } while (var17 == 0);
              do {
                if (!(var11 < nl.field_c[0].length)) {
                  je.field_O = new dd[6];
                  je.field_O[0] = kl.a(252, hm.field_g, "", "menu_character_1");
                  je.field_O[1] = kl.a(252, hm.field_g, "", "menu_character_2");
                  je.field_O[2] = kl.a(252, hm.field_g, "", "menu_character_3");
                  je.field_O[3] = kl.a(252, hm.field_g, "", "menu_character_4");
                  je.field_O[4] = kl.a(252, hm.field_g, "", "menu_character_5");
                  je.field_O[5] = kl.a(252, hm.field_g, "", "menu_character_6");
                  dupTemp$5 = je.field_O[0];
                  dupTemp$5.field_v = dupTemp$5.field_v - 200;
                  dupTemp$6 = je.field_O[1];
                  dupTemp$6.field_v = dupTemp$6.field_v - 200;
                  pd.field_k = fc.a(hm.field_g, "frame", "", (byte) 61);
                  gj.field_E = fc.a(hm.field_g, "frame_bright", "", (byte) 61);
                  ta.field_z = fc.a(hm.field_g, "button_frame", "", (byte) 61);
                  a.field_b = fc.a(hm.field_g, "button_raised", "", (byte) 61);
                  ud.b((byte) 47);
                  var11 = tl.field_p.field_N;
                  vb.field_a = new dd(var11, var11);
                  vb.field_a.f();
                  BufferedSocket.field_m.a(0, 0, var11, var11);
                  BufferedSocket.field_m = null;
                  gi.field_b.a((byte) 109);
                  break;
                }
                nl.field_c[0][var11] = var10[2];
                var11++;
              } while (var17 == 0);
              var12 = 10 * tl.field_p.field_N;
              ResourceArchive.field_c = new ik(45, -(var12 / 2) + 250, 340, var12, tl.field_p, be.field_c, tk.field_m, DualLinkNode.field_n, rb.field_G);
              ResourceArchive.field_c.field_Q = -16777216;
              ResourceArchive.field_c.field_r = -1862275584;
              ResourceArchive.field_c.field_F = -2241536;
              ResourceArchive.field_c.field_H = -16777214;
              ResourceArchive.field_c.field_u = 134217728;
              ResourceArchive.field_c.field_s = 0;
              ResourceArchive.field_c.field_w = 553648127;
              ResourceArchive.field_c.field_O = -1593901056;
              dk.field_C = new vg("", 360, 20, tl.field_p);
              wd.field_a = new vg("", 360, 178, tl.field_p);
              de.field_b = new vg("", 360, 395, tl.field_p);
              var13 = de.field_b;
              dk.field_C.field_d = 36;
              var14 = wd.field_a;
              var14.field_d = 36;
              var13.field_d = 36;
              dk.field_C.field_n = 145;
              wd.field_a.field_n = 205;
              de.field_b.field_n = 220;
              ol.field_f = new rk(wd.field_a.field_l, 420, gl.field_m, UiComponent.field_l, bb.field_H, IntrusiveNode.field_b);
              ol.field_f.field_t = fl.field_f;
              var15_int = ob.field_c.length - 1;
              do {
                if (var15_int < 0) {
                  var15_int = -1 + ej.field_a.length;
                  break;
                }
                ob.field_c[var15_int] = new ok(-1000, -1000, qg.field_d[var15_int], ve.field_d);
                var15_int--;
              } while (var17 == 0);
              do {
                if (var15_int < 0) {
                  lk.field_D = new vg(nj.field_d.toLowerCase(), 415, de.field_b.field_l, tl.field_p);
                  lk.field_D.field_w = 16711680;
                  lk.field_D.field_n = 220;
                  lk.field_D.field_k = false;
                  lk.field_D.field_A = 0;
                  lk.field_D.field_C = -2;
                  lk.field_D.field_x = -1;
                  lk.field_D.field_E = 8388608;
                  lk.field_D.field_B = 4194304;
                  lk.field_D.field_d = 30;
                  lk.field_D.field_D = 2;
                  lk.field_D.field_F = 0;
                  si.field_y = new vg(kf.field_l.toLowerCase(), lk.field_D.field_a, lk.field_D.field_l, tl.field_p);
                  si.field_y.field_C = lk.field_D.field_C;
                  si.field_y.field_B = lk.field_D.field_B;
                  si.field_y.field_A = lk.field_D.field_A;
                  si.field_y.field_D = lk.field_D.field_D;
                  si.field_y.field_d = 30;
                  si.field_y.field_E = lk.field_D.field_E;
                  si.field_y.field_F = lk.field_D.field_F;
                  si.field_y.field_k = true;
                  si.field_y.field_w = lk.field_D.field_w;
                  si.field_y.field_x = lk.field_D.field_x;
                  si.field_y.field_n = 220;
                  f.field_G = new el(100, 100, 150, q.field_c, sd.field_e, lj.field_f, (dd) null, tb.field_f);
                  cb.field_w = new el(100, 100, 150, q.field_c, sd.field_e, lj.field_f, (dd) null, tb.field_f);
                  f.field_G.field_A = 256;
                  break;
                }
                ej.field_a[var15_int] = new ok(320, 240, kl.field_a[var15_int], ve.field_d);
                ej.field_a[var15_int].field_J = 100;
                var15_int--;
              } while (var17 == 0);
              var15 = f.field_G;
              var15.field_t = 256;
              var16 = cb.field_w;
              cb.field_w.field_A = 256;
              var16.field_t = 256;
              f.field_G.field_r = true;
              hm.field_g = null;
              cb.field_w.field_r = true;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var2_ref), "fleas.P(" + param0 + ')');
        }
    }

    final void d(boolean param0) {
        Object stackIn_5_0 = null;
        Object stackIn_11_0 = null;
        boolean stackIn_12_1 = false;
        boolean stackIn_77_0 = false;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var3Lifetime1;
        int var3Lifetime2;
        var4 = field_A ? 1 : 0;
        try {
          if (null != ResourceArchive.field_p) {
            stackIn_5_0 = ResourceArchive.field_p;
          } else {
            stackIn_5_0 = ol.field_e;
          }
          var2 = stackIn_5_0;
          if (mc.b((byte) 123)) {
            stackIn_11_0 = var2;
            if (null == ResourceArchive.field_p) {
              stackIn_12_1 = ha.field_k;
            } else {
              stackIn_12_1 = true;
            }
            af.a((java.awt.Canvas) (stackIn_11_0), stackIn_12_1, param0);
            return;
          }
          if (!md.field_T) {
            bg.a((byte) -75, (java.awt.Canvas) (var2));
            return;
          }
          if (!BufferedSocket.d(-89)) {
            jj.a(100.0f, IterableNodeHashTable.field_h, true);
            bg.a((byte) -104, (java.awt.Canvas) (var2));
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          if (~bc.field_V != ~ab.field_b) {
            if (af.field_g >= 16) {
              if (af.field_g == 16 &&
                bc.field_V == 10) {
                fh.$cfr$intArgs$a$cb0bc10e6b69(114, jd.field_q, 100, 63);
              }
              if (3 != ab.field_b) {
              }
              if (-1 == bc.field_V) {
                fc.c(126);
                if (var4 != 0) {
                  pi.field_b[bc.field_V].f(2);
                }
              } else {
                pi.field_b[bc.field_V].f(2);
              }
              var3 = -af.field_g + 32 + 1;
              var3 = var3 * 16;
              if (var3 > 255) {
                var3 = 255;
              }
              gb.g(0, 0, 640, 480, 1, var3);
              decompiledFrameRemainder0 = (var4 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (ab.field_b == -1) {
                fc.c(-21);
                if (var4 != 0) {
                  pi.field_b[ab.field_b].f(2);
                }
              } else {
                pi.field_b[ab.field_b].f(2);
              }
              var3Lifetime2 = 1 + af.field_g;
              var3Lifetime2 = var3Lifetime2 * 16;
              if (var3Lifetime2 > 255) {
                var3Lifetime2 = 255;
              }
              gb.g(0, 0, 640, 480, 1, var3Lifetime2);
              if (var4 != 0) {
                if (-1 == ab.field_b) {
                  fc.c(126);
                  pi.field_b[ab.field_b].f(2);
                } else {
                  pi.field_b[ab.field_b].f(2);
                }
              }
            }
          } else {
            if (-1 == ab.field_b) {
              fc.c(126);
              if (var4 != 0) {
                pi.field_b[ab.field_b].f(2);
              }
            } else {
              pi.field_b[ab.field_b].f(2);
            }
          }
          if (!hi.a((byte) -72)) {
            if (uk.b(15000)) {
              if (ResourceArchive.field_p == null) {
                stackIn_77_0 = ha.field_k;
              } else {
                stackIn_77_0 = true;
              }
              dh.a(stackIn_77_0, (byte) 121);
              if (var4 != 0) {
                gb.d(0, 0, gb.field_d, gb.field_k);
                lf.a(pd.field_k, pd.field_k[0].field_w, pd.field_k[0].field_t, (byte) 100);
              }
            }
          } else {
            gb.d(0, 0, gb.field_d, gb.field_k);
            lf.a(pd.field_k, pd.field_k[0].field_w, pd.field_k[0].field_t, (byte) 100);
          }
          if (vk.field_L != 0) {
            var3Lifetime1 = af.field_g * 256 / 32;
            if (var3Lifetime1 > 0) {
              gb.g(0, 0, gb.field_d, gb.field_k, 0, var3Lifetime1);
            }
          }
          if (qe.field_k >= 2) {
            ve.field_d.b("FPS: " + ak.field_c, 640, 480, 255, 16776960);
          }
          ul.c(param0);
          be.a(0, (java.awt.Canvas) (var2), (byte) -127, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var2_ref), "fleas.D(" + param0 + ')');
        }
    }

    final void a(int param0) {
        try {
          fleas.m(param0 + 0);
          nb.a((byte) 69);
          cf.b(21230);
          lc.c((byte) 99);
          pg.a(-12);
          vc.d(-29943);
          ei.f(-16257);
          cl.a(-2);
          l.b(-29049);
          qi.a((byte) -113);
          NetworkGameClient.i(param0 + 0);
          ContextualRuntimeException.c(param0 ^ 55);
          GameAppletShell.c(true);
          rd.a((byte) -19);
          jg.a(param0 ^ 107);
          gb.a();
          ResourceArchive.c((byte) -110);
          fa.a();
          qg.a(false);
          tb.a((byte) -72);
          lj.a(param0 + 1);
          ki.a((byte) -92);
          be.a(false);
          vi.a((byte) 81);
          oe.a((byte) 71);
          se.a(true);
          ma.a((byte) -127);
          sg.a(param0 ^ 2);
          fb.a(3);
          b.b(2);
          ud.a((byte) 85);
          wj.a(param0 - 95);
          uc.c((byte) -118);
          of.b(71);
          vb.a(-29039);
          va.b((byte) 126);
          ng.a(0);
          w.c(5);
          af.a(105);
          uf.a(true);
          k.a(-40);
          BufferedSocket.a(123167272);
          kh.a((byte) -97);
          ik.b(false);
          vg.c((byte) -53);
          el.d(30537);
          rk.d(109);
          ok.b(false);
          t.g(9973);
          vj.b(true);
          df.a((byte) 71);
          bk.a(param0 ^ -6565);
          IntrusiveNode.b(1);
          hc.c((byte) 87);
          tk.a(param0 ^ 93);
          fd.e();
          gl.a((byte) 112);
          la.b();
          th.b(false);
          tj.a(false);
          pl.f(param0 + 1);
          sa.a((byte) 33);
          ue.a(param0 - 6617886);
          pb.a((byte) -120);
          ge.a((byte) -79);
          pf.a(13480);
          rf.a((byte) 119);
          mg.a((byte) -3);
          gi.a((byte) 96);
          fj.a((byte) -127);
          jl.a(32768);
          nl.a((byte) -33);
          f.j(-7409);
          ua.i((byte) 124);
          ui.e(false);
          bd.g((byte) 127);
          ca.j(100);
          rb.a(param0 ^ 107);
          ul.k(16777215);
          nf.f((byte) -50);
          ad.a((byte) 42);
          jd.a((byte) 72);
          ff.a((byte) 92);
          cc.a();
          ti.a(-23740);
          nc.a(param0 ^ -99);
          DualLinkNode.d(-6);
          cm.a(param0 ^ -91);
          ta.c((byte) 62);
          ea.a((byte) -95);
          s.a((byte) 123);
          mf.a((byte) -9);
          ih.j(8);
          al.a(true);
          wi.a(false);
          ci.a((byte) 127);
          gd.a(-1);
          ec.a(124);
          hk.a();
          wl.a();
          ub.a(17077);
          uk.a(-9435);
          hj.a(-5928);
          uj.a((byte) 126);
          kc.a(param0 ^ -2);
          ug.a((byte) -73);
          hh.a(true);
          pc.c(param0 - 119);
          oj.a(param0 ^ -100);
          wc.a(-24464);
          de.a(0);
          g.a(false);
          bf.a(false);
          fk.i(105);
          ah.a(true);
          qh.b(false);
          cg.b(1);
          rl.a(-930374320);
          u.a(-2355);
          dl.h(2);
          ek.b((byte) -42);
          ic.o(-101);
          mc.a((byte) 87);
          e.b((byte) -92);
          bl.c();
          sd.a(9330);
          re.a((byte) -56);
          si.c(param0 ^ -66);
          tg.a(true);
          cj.a(false);
          di.a(26189);
          q.a((byte) -127);
          m.a(118);
          kl.a((byte) -24);
          hl.b(true);
          qk.b(param0 + 1);
          ld.a((byte) -95);
          lf.a((byte) 65);
          fl.a(26113);
          hd.a((byte) -75);
          fe.a();
          gk.a(true);
          fg.a(-5);
          gf.c(-46);
          bg.b((byte) -120);
          hb.c((byte) 116);
          ee.a(1);
          ib.a(-111);
          ne.a((byte) -84);
          UiComponent.d(0);
          bb.a(-1);
          dk.a((byte) 2);
          jj.c(true);
          db.k(0);
          gj.a((byte) -112);
          ab.a(param0 + 1);
          ii.a(param0 + 6);
          aj.f(113);
          ol.a(true);
          ej.b(1);
          ag.a(param0 + 1);
          kk.a(4);
          oc.a((byte) -40);
          lg.a(-106);
          hm.b(2067);
          em.b(3505);
          o.b((byte) 82);
          bj.a(0);
          hf.a(-124);
          wa.a(param0 ^ 1730);
          kb.b(false);
          ml.j(1);
          oh.f((byte) -110);
          lk.c(true);
          ij.e((byte) -20);
          ja.j(-91);
          je.i(93);
          v.k(-8011);
          vk.c(false);
          r.d(0);
          sc.a((byte) -73);
          md.a((byte) -101);
          d.j(-1);
          am.a();
          dh.a(120);
          j.a(-113);
          qe.c(-1);
          id.a((byte) 110);
          pk.d((byte) 89);
          qj.i(param0 ^ 124);
          fh.a((byte) -94);
          IterableNodeHashTable.a((byte) -112);
          SecondaryNodeDeque.a(0);
          cb.f(param0 ^ 67);
          pj.h(-103);
          jk.c(28);
          a.a((byte) 126);
          NodeHashTableIterator.b(105);
          rc.a((byte) 58);
          ll.a(61);
          bh.a(param0 ^ 125);
          il.a(-70);
          pd.a((byte) -89);
          vh.d(-889323520);
          ri.c((byte) -97);
          me.a(param0 ^ -4284);
          aa.a(-122);
          mh.b(705);
          jc.a(param0 - 36);
          tf.i(0);
          gm.c(false);
          hg.a((byte) 108);
          tc.a((byte) -75);
          ia.c(true);
          hi.c((byte) -117);
          fi.a(param0 + param0);
          ql.a((byte) -92);
          ae.a((byte) -114);
          mk.a(122);
          ve.a((byte) 84);
          ed.a(20760);
          ha.b(false);
          bm.c(false);
          nj.a((byte) -105);
          ji.a(-122);
          wh.c(param0 ^ 250);
          ef.b((byte) -117);
          rg.b(true);
          rj.a((byte) 75);
          fc.a(-100);
          uh.a(8);
          kf.a(param0 ^ 116);
          oa.a((byte) -88);
          te.a(false);
          pi.a((byte) 11);
          vf.c(false);
          ai.c((byte) -10);
          ck.c((byte) 2);
          ga.c((byte) 113);
          tl.c((byte) 115);
          ak.b(false);
          mi.a((byte) 27);
          wd.a(false);
          gg.c(param0 ^ -125);
          ob.a(param0 ^ 73);
          this.field_C = null;
          this.field_N = null;
          this.field_D = null;
          this.field_n = null;
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "fleas.M(" + param0 + ')');
        }
    }

    final static void h(byte param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_intLifetime1;
        var3 = field_A ? 1 : 0;
        try {
          l.field_b.c(12445);
          var1_int = 0;
          while (var1_int < 32) {
            bh.field_q[var1_int] = 0L;
            var1_int++;
            if (var3 == 0) {
              continue;
            }
            break;
          }
          var2 = -69 / ((param0 + 16) / 46);
          var1_intLifetime1 = 0;
          while (var1_intLifetime1 < 32) {
            ub.field_c[var1_intLifetime1] = 0L;
            var1_intLifetime1++;
            if (var3 != 0) {
              return;
            }
          }
          w.field_r = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) runtimeException), "fleas.C(" + param0 + ')');
        }
    }

    private final boolean b(boolean param0, int param1) {
        kh[] array$0 = null;
        kh[] array$1 = null;
        Object stackIn_126_0 = null;
        byte[] stackIn_126_1 = null;
        Object stackIn_137_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        String var4_ref_String = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object stackIn_126_0Lifetime1;
        byte[] stackIn_126_1Lifetime1;
        byte[] var3Lifetime1;
        String var4_ref_StringLifetime1;
        var10 = field_A ? 1 : 0;
        try {
          ei.b(true);
          if (null != pb.field_a) {
            if (a.field_a.b((byte) -100) &&
              a.field_a.a("basic", -116) &&
              a.field_a.a("roman12", -112) &&
              a.field_a.a("roman20", -113)) {
              if (pb.field_a.b((byte) -110) &&
                pb.field_a.a(-116)) {
                if (ib.field_f.b((byte) -125) &&
                  ib.field_f.a(-128)) {
                  if (DualLinkNode.field_l.b((byte) -102) &&
                    DualLinkNode.field_l.a(-22)) {
                    if (ob.field_d.b((byte) -108) &&
                      ob.field_d.a(-72)) {
                      if (jc.field_e.b((byte) -104) &&
                        jc.field_e.a(-36)) {
                        if (hm.field_g.b((byte) -124) &&
                          hm.field_g.a(-76)) {
                          if (de.field_h.b((byte) -122) &&
                            de.field_h.a(-54)) {
                            if (pf.field_b.b((byte) -106) &&
                              pf.field_b.a("roman12", -106) &&
                              pf.field_b.a("roman20", -118)) {
                              jj.a(55.0f, ri.field_s, true);
                              if (!param0) {
                                return false;
                              }
                              wh.a(-128);
                              this.d(true);
                              field_K = new ng(pb.field_a, ib.field_f);
                              wj.field_b[0] = qf.a(pb.field_a, "", "menu_select").b();
                              wj.field_b[1] = ia.a(882, 2500, 1);
                              this.j((byte) 87);
                              pb.field_a = null;
                              fleas.h((byte) -110);
                              return false;
                            }
                            jj.a(31.0f, sa.a(pf.field_b, "roman12", de.field_j, rg.field_q, (byte) 46), true);
                            return false;
                          }
                          jj.a(30.0f, sa.a(de.field_h, "", de.field_j, rg.field_q, (byte) 46), true);
                          return false;
                        }
                        jj.a(25.0f, sa.a(hm.field_g, "", bf.field_f, IterableNodeHashTable.field_e, (byte) 46), true);
                        return false;
                      }
                      jj.a(20.0f, sa.a(jc.field_e, "", tj.field_b, mi.field_p, (byte) 46), true);
                      return false;
                    }
                    jj.a(18.0f, re.a((byte) 127, 0, ob.field_d, kk.field_c, cf.field_b), true);
                    return false;
                  }
                  jj.a(15.0f, sa.a(DualLinkNode.field_l, "", gk.field_G, sc.field_c, (byte) 46), true);
                  return false;
                }
                jj.a(10.0f, sa.a(ib.field_f, "", fk.field_x, vf.field_n, (byte) 46), true);
                return false;
              }
              jj.a(5.0f, sa.a(pb.field_a, "", fk.field_x, vf.field_n, (byte) 46), true);
              return false;
            }
            jj.a(3.0f, sa.a(a.field_a, "basic", bf.field_f, IterableNodeHashTable.field_e, (byte) 46), true);
            return false;
          }
          if (null != ib.field_f) {
            jj.a(60.0f, ri.field_s, true);
            this.d(true);
            wi.b(-14277);
            ib.field_f = null;
            fleas.h((byte) 76);
            return false;
          }
          if (jc.field_e != null) {
            jj.a(65.0f, cb.field_q, true);
            this.d(true);
            BufferedSocket.field_j = wk.a(jc.field_e, "", "Flea Circus Titlescreen");
            gg.field_h.a(field_K, ob.field_d, 11498, 0, BufferedSocket.field_j);
            hf.field_e[0] = wk.a(jc.field_e, "", "Flea Circus 1");
            hf.field_e[1] = wk.a(jc.field_e, "", "Flea Circus 2");
            hf.field_e[2] = wk.a(jc.field_e, "", "Flea Circus 3");
            var3_int = 0;
            do {
              if (var3_int >= 3) {
                field_K = null;
                ob.field_d = null;
                jc.field_e = null;
                fleas.h((byte) -114);
                break;
              }
              gg.field_h.a(field_K, ob.field_d, 11498, 0, hf.field_e[var3_int]);
              var3_int++;
            } while (var10 == 0);
            return false;
          }
          if (null != a.field_a) {
            jj.a(70.0f, f.field_H, true);
            this.d(true);
            cb.field_u = kl.a(252, a.field_a, "basic", "unachieved");
            BufferedSocket.field_m = kl.a(252, a.field_a, "basic", "orbcoin");
            em.a(BufferedSocket.field_m, (byte) -85);
            mf.field_g = kl.a(252, a.field_a, "basic", "locked");
            ve.field_d = (fa) ((Object) ub.a("roman12", a.field_a, "", pf.field_b, 32));
            lk.field_Q = (fa) ((Object) ub.a("roman20", a.field_a, "", pf.field_b, 32));
            a.field_a = null;
            fleas.h((byte) 33);
            return false;
          }
          if (hm.field_g != null) {
            jj.a(72.0f, f.field_H, true);
            this.d(true);
            this.g((byte) -111);
            de.field_h = null;
            hm.field_g = null;
            fleas.h((byte) -116);
            return false;
          }
          if (DualLinkNode.field_l == null) {
            var3_int = 0;
            do {
              if (var3_int >= 11) {
                ab.field_b = 0;
                k.a(0, BufferedSocket.field_j);
                var3_int = 3072;
                break;
              }
              pi.field_b[var3_int] = new t(var3_int);
              var3_int++;
            } while (var10 == 0);
            var4 = 30;
            var5 = 15;
            var6 = 10;
            var7 = -2;
            if (param1 <= 0) {
              fleas.a((ih) null, -35);
            }
            var8 = this.field_C.field_w - 20;
            var9 = this.field_C.field_t - 20;
            rb.a(var5, var6, var9, this.field_C, var8, var3_int, (byte) 125, var4, var7);
            ue.a((byte) -122, this.field_N);
            mc.a(this.field_D, ih.field_m, 0);
            DualLinkNode.a(false, jj.field_P);
            el.a((java.applet.Applet) (this), 150, (byte) 44, 15488514, jd.field_g, 1052688);
            we.a(50, 106);
            qb.a(50, 114);
            fleas.h((byte) -71);
            return true;
          }
          jj.a(98.0f, vi.field_c, true);
          this.d(true);
          var5 = pl.field_l[0];
          array$0 = new kh[var5];
          ia.field_m[0] = array$0;
          var6 = 0;
          scanLoop1: while (true) {
            boolean decompiledFrameCompleted0 = true;
            boolean decompiledFrameCompleted1 = true;
            if (var5 > var6) {
              var4_ref_String = 1 + var6 + ".lvl";
              var3 = DualLinkNode.field_l.a(0, var4_ref_String, "");
              stackIn_126_0 = null;
              stackIn_126_1 = var3;
              if (var10 != 0) {
                while (true) {
                  if (stackIn_126_0 != stackIn_126_1) {
                    ia.field_m[1][var6] = new kh(var3);
                  }
                  var6++;
                  decompiledFrameCompleted1 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted1) {
                if (stackIn_126_0 != stackIn_126_1) {
                  ia.field_m[0][var6] = new kh(var3);
                }
                var6++;
                if (var10 == 0) {
                  continue;
                }
              }
            }
            if (decompiledFrameCompleted1) {
              var5 = pl.field_l[1];
              array$1 = new kh[var5];
              ia.field_m[1] = array$1;
              var6 = 0;
              while (var6 < var5) {
                var4_ref_StringLifetime1 = "classic_" + (1 + var6) + ".lvl";
                var3Lifetime1 = DualLinkNode.field_l.a(0, var4_ref_StringLifetime1, "");
                stackIn_137_0 = null;
                if (var10 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                stackIn_126_0Lifetime1 = stackIn_137_0;
                stackIn_126_1Lifetime1 = var3Lifetime1;
                if (stackIn_126_0Lifetime1 != stackIn_126_1Lifetime1) {
                  ia.field_m[1][var6] = new kh(var3Lifetime1);
                }
                var6++;
              }
            }
            if (decompiledFrameCompleted0) {
              var6 = 0;
              while (var6 < 50) {
                th.field_v[var6] = new dd(20, 20);
                ff.field_b[var6] = new dd(20, 20);
                var6++;
                if (var10 != 0) {
                  break scanLoop1;
                }
              }
              stackIn_137_0 = null;
            }
            DualLinkNode.field_l = (ResourceArchive) (stackIn_137_0);
            jk.field_l = 2;
            tj.field_a = 0;
            fleas.h((byte) -72);
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var3_ref), "fleas.R(" + param0 + ',' + param1 + ')');
        }
    }

    final void d(int param0) {
        boolean discarded$0 = false;
        boolean stackIn_11_1 = false;
        int stackIn_165_1 = 0;
        boolean stackIn_166_2 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        hi var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        var3 = field_A ? 1 : 0;
        try {
          ni.field_j = ni.field_j + 1;
          ai.e(-20846);
          if (ResourceArchive.field_p != null &&
            ResourceArchive.field_p.field_c) {
            IntrusiveNode.a(false);
            cm.a((byte) -28);
          }
          stackIn_11_1 = (ResourceArchive.field_p != null);
          this.b(stackIn_11_1, (byte) 63);
          if (d.field_Q) {
            this.f(true);
            d.field_Q = false;
          }
          if (qe.field_k >= 2) {
            boolean decompiledFrameCompleted0 = true;
            if (ei.field_H[1]) {
              var2_int = -1 + hj.field_a.length;
              while (var2_int >= 0) {
                hj.field_a[var2_int] = 999;
                var2_int--;
                if (var3 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
            }
            if ((decompiledFrameCompleted0) && (ei.field_H[2] &&
              ab.field_b == -1)) {
              BufferedSocket.b(120);
            }
            if (ei.field_H[86]) {
              if (ei.field_H[16]) {
                hg.a(-25389, 0, 255, 0);
              }
              if (ei.field_H[17]) {
                hg.a(-25389, 1, 254, 0);
              }
              if (ei.field_H[18]) {
                hg.a(-25389, 2, 253, 0);
              }
              if (ei.field_H[19]) {
                hg.a(-25389, 3, 252, 0);
              }
              if (ei.field_H[20]) {
                hg.a(param0 - 46823, 4, 251, 0);
              }
              if (ei.field_H[21]) {
                hg.a(param0 - 46823, 5, 250, 0);
              }
              if (ei.field_H[22]) {
                hg.a(-25389, 6, 249, 0);
              }
              if (ei.field_H[23]) {
                hg.a(-25389, 7, 248, 0);
              }
              if (ei.field_H[24]) {
                hg.a(-25389, 8, 247, 0);
              }
              if (ei.field_H[25]) {
                hg.a(param0 - 46823, 9, 246, 0);
              }
              if (ei.field_H[32]) {
                hg.a(-25389, 10, 245, 0);
              }
              if (ei.field_H[33]) {
                hg.a(-25389, 11, 244, 0);
              }
              if (ei.field_H[34]) {
                hg.a(-25389, 12, 243, 0);
              }
              if (ei.field_H[35]) {
                hg.a(-25389, 13, 242, 0);
              }
              if (ei.field_H[36]) {
                hg.a(param0 - 46823, 14, 241, 0);
              }
              if (ei.field_H[37]) {
                hg.a(-25389, 15, 240, 0);
              }
            }
          }
          if (mc.b((byte) 80)) {
            this.f((byte) -124);
            if (mc.b((byte) -112)) {
              if (nl.a(52)) {
                discarded$0 = this.b(false, 47);
              }
              return;
            }
          }
          if (param0 != 21434) {
            this.field_C = (dd) null;
          }
          boolean decompiledFrameRemainder0 = true;
          if (md.field_T) {
            if (!BufferedSocket.d(-101)) {
              nb.a(false);
              decompiledFrameRemainder0 = !(!BufferedSocket.d(-104));
              if (decompiledFrameRemainder0) {
                wh.a(-98);
                em.a(param0 - 21512);
                if (8 == ab.field_b) {
                  vf.e(-6359);
                }
                decompiledFrameRemainder0 = (ab.field_b == 5);
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameRemainder0 = (field_L == 0))) {
                  ab.field_b = 2;
                  oa.a(2, false, param0 ^ -21496);
                  decompiledFrameRemainder0 = (var3 != 0);
                }
              }
            }
            if (decompiledFrameRemainder0) {
              if (hi.a((byte) -72)) {
                if (vk.field_L == 0) {
                  var2_int = lk.k(param0 ^ 31053);
                  switch (var2_int) {
                    case 3:
                      c.a(320, (byte) 110, tl.field_p.field_K + tl.field_p.field_y, a.field_b, 8, 2, tl.field_p, ta.field_z, 240, tl.field_p.field_y, true, 8);
                    default:
                      break;
                    case 4:
                      me.a(-2, 0, false);
                      if (var3 == 0) {
                        break;
                      }
                    case 2:
                      IntrusiveNode.a(false);
                      break;
                  }
                  if (var3 != 0) {
                    this.i((byte) -85);
                  }
                } else {
                  this.i((byte) -85);
                }
                decompiledFrameRemainder0 = !(hi.a((byte) -72));
                if (decompiledFrameRemainder0) {
                  pi.field_b[ab.field_b].a(true, true);
                  decompiledFrameRemainder0 = (var3 != 0);
                }
              }
              if (decompiledFrameRemainder0) {
                if (uk.b(param0 - 6434)) {
                  stackIn_165_1 = -81;
                  stackIn_166_2 = (ResourceArchive.field_p != null);
                  var2_int = this.a((byte) stackIn_165_1, stackIn_166_2);
                  if (1 == var2_int ||
                    2 == var2_int) {
                    if (null != ResourceArchive.field_p) {
                      IntrusiveNode.a(false);
                    }
                    if (var2_int == 2) {
                      hf.a(rl.a((byte) -110), -52);
                    }
                  }
                  if (var3 != 0) {
                    this.i((byte) -85);
                    te.b(0, al.field_f);
                    if (this.b(true, 46)) {
                      md.field_T = true;
                    }
                  }
                } else {
                  this.i((byte) -85);
                  if (var3 != 0) {
                    te.b(0, al.field_f);
                    if (this.b(true, 46)) {
                      md.field_T = true;
                    }
                  }
                }
              }
            }
          } else {
            te.b(0, al.field_f);
            if (this.b(true, 46)) {
              md.field_T = true;
            }
          }
          if (!qh.c((byte) 79)) {
            do {
              var2 = (hi) (a.field_e.e(-22033));
              if (null == var2) {
                if (var3 == 0) {
                  break;
                }
              } else {
                bg.a(var2, 4, -90);
              }
            } while (var3 == 0);
          }
          do {
            if (!tb.a(-55, ne.field_b)) {
              dk.b((byte) 41, 0);
              break;
            }
            this.g(-12);
          } while (var3 == 0);
          if (lk.i(param0 ^ 21424)) {
            var2_int = this.e(false);
            if (var2_int == 2) {
              id.a(false);
            }
          }
          hg.a(-79);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var2_ref), "fleas.B(" + param0 + ')');
        }
    }

    private final void i(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = field_A ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          if (0 == vk.field_L) {
            if (bc.field_V == ab.field_b) {
              if (ab.field_b == -1) {
                this.l(param0 + 212);
                decompiledFrameRemainder0 = (var3 != 0);
              }
              if (decompiledFrameRemainder0) {
                pi.field_b[ab.field_b].a((byte) 26);
                decompiledFrameRemainder0 = (var3 != 0);
              }
            }
            if (decompiledFrameRemainder0) {
              af.field_g = af.field_g + 1;
              if (af.field_g == 16 &&
                ab.field_b == 10) {
                BufferedSocket.b(94);
              }
              if (ab.field_b >= 0) {
                pi.field_b[ab.field_b].e(-400);
              }
              decompiledFrameRemainder0 = (af.field_g == 32);
              if (decompiledFrameRemainder0) {
                if (ab.field_b == 2) {
                  m.field_b = null;
                }
                ab.field_b = bc.field_V;
                af.field_g = 0;
                decompiledFrameRemainder0 = (var3 != 0);
              }
            }
          }
          if (decompiledFrameRemainder0) {
            if (vk.field_L == 1) {
              af.field_g = af.field_g + 1;
              decompiledFrameRemainder0 = (32 == af.field_g);
              if (decompiledFrameRemainder0) {
                if (hi.a((byte) -72)) {
                  ml.d((byte) 106);
                  if (var3 != 0) {
                    qc.a(500);
                  }
                } else {
                  qc.a(500);
                }
                vk.field_L = 2;
                decompiledFrameRemainder0 = (var3 != 0);
              }
            }
            if (decompiledFrameRemainder0) {
              if (2 != vk.field_L) {
                af.field_g = af.field_g - 1;
                decompiledFrameRemainder0 = (af.field_g == 0);
                if (decompiledFrameRemainder0) {
                  vk.field_L = 0;
                  decompiledFrameRemainder0 = (var3 != 0);
                }
              }
              if (decompiledFrameRemainder0) {
                if (!qh.c((byte) 123)) {
                  fg.field_x = ed.a(16777215, 4);
                  if (null != wi.field_p) {
                    wi.field_p.a(param0 + 84);
                  }
                  ab.field_b = w.field_l;
                  ml.i(param0 + 14);
                  if (ab.field_b == -2) {
                    ab.field_b = 0;
                    c.a(320, (byte) 111, tl.field_p.field_y + tl.field_p.field_K, a.field_b, 8, 2, tl.field_p, ta.field_z, 240, tl.field_p.field_y, false, 8);
                    if (var3 != 0) {
                      ab.field_b = mf.field_c;
                    }
                  }
                } else {
                  ab.field_b = mf.field_c;
                }
                vk.field_L = 3;
                bc.field_V = ab.field_b;
              }
            }
          }
          if (param0 != -85) {
            field_L = 71;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var2), "fleas.N(" + param0 + ')');
        }
    }

    private final void f(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (ne.field_a != null) {
            uh.a((byte) -128, ne.field_a);
            ne.field_a = null;
            fleas.h((byte) 79);
          }
          hm.field_g = q.a(8192, 1);
          pb.field_a = q.a(8192, 2);
          if (!param0) {
            return;
          }
          DualLinkNode.field_l = q.a(8192, 3);
          ib.field_f = q.a(8192, 4);
          ob.field_d = q.a(8192, 5);
          jc.field_e = q.a(8192, 6);
          de.field_h = q.a(8192, 7);
          if (0 == cg.field_y) {
            ei.b(true);
          }
          bc.a(pf.field_b, 1, a.field_a);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var2), "fleas.Q(" + param0 + ')');
        }
    }

    private final void a(byte param0, int param1, int param2) {
        try {
          bm.e((byte) 31);
          if (param0 > -47) {
            fleas.h((byte) -92);
          }
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "fleas.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, vh param1, int param2) {
        RuntimeException runtimeException = null;
        ih var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = ud.field_b;
          var3.e(8, param0);
          if (param2 != 2) {
            return;
          }
          var3.a(-11, param1.field_n);
          var3.b((byte) 76, param1.field_m);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("fleas.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void j(byte param0) {
        ci var2 = null;
        try {
          var2 = new ci(22050, la.field_a);
          ic.field_ab = qf.a(pb.field_a, "", "FLEA_drops").b().a(var2);
          fi.field_n = qf.a(pb.field_a, "", "FLEA_flea_die").b().a(var2);
          nb.field_f = qf.a(pb.field_a, "", "FLEA_escape").b().a(var2);
          rl.field_g = qf.a(pb.field_a, "", "FLEA_placeblock").b().a(var2);
          el.field_C = qf.a(pb.field_a, "", "FLEA_placeramp").b().a(var2);
          ih.field_l = qf.a(pb.field_a, "", "FLEA_balloon").b().a(var2);
          int var3 = 36 / ((-23 - param0) / 33);
          hg.field_n = qf.a(pb.field_a, "", "FLEA_land").b().a(var2);
          me.field_k = qf.a(pb.field_a, "", "FLEA_spring").b().a(var2);
          bf.field_d = qf.a(pb.field_a, "", "FLEA_spinplatform").b().a(var2);
          ab.field_a = qf.a(pb.field_a, "", "FLEA_bomb").b().a(var2);
          ah.field_a = qf.a(pb.field_a, "", "FLEA_drowning").b().a(var2);
          ResourceArchive.field_n = qf.a(pb.field_a, "", "FLEA_fanloop").b().a(var2);
          hi.field_p = qf.a(pb.field_a, "", "FLEA_spider").b().a(var2);
          uh.field_s = qf.a(pb.field_a, "", "FLEA_teleport_in").b().a(var2);
          gi.field_d = qf.a(pb.field_a, "", "FLEA_noplace").b().a(var2);
          hg.field_k = qf.a(pb.field_a, "", "FLEA_gravity_up").b().a(var2);
          ha.field_o = qf.a(pb.field_a, "", "FLEA_gravity_down").b().a(var2);
          gf.field_g = qf.a(pb.field_a, "", "FLEA_switch").b().a(var2);
          fg.field_l = qf.a(pb.field_a, "", "FLEA_crumble").b().a(var2);
          hf.field_g = qf.a(pb.field_a, "", "FLEA_bridgecollapse").b().a(var2);
          kc.field_e = qf.a(pb.field_a, "", "FLEA_death").b().a(var2);
          pb.field_a = null;
          oj.field_i = ie.a(ResourceArchive.field_n, 100, 0);
          oj.field_i.g(-1);
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "fleas.L(" + param0 + ')');
        }
    }

    final void a(byte param0) {
        this.a(9, 11, 22, false, 0, 8, 8, 10);
        ei var2 = new ei();
        var2.b(9, 128, 238);
        hd.a(220, var2, 22050, 11, 22050, fg.field_q, (java.awt.Component) ((Object) ol.field_e), true);
        fb.field_c = 0;
        rg.field_n = 1;
        cm.field_j = 0;
        this.a(false, true, true, true, param0 ^ 100);
        field_F = new Random();
        if (param0 != -14) {
          return;
        }
        try {
          ei.b(true);
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "fleas.H(" + param0 + ')');
        }
    }

    public final void init() {
        try {
          this.a(12, 8, "fleacircus");
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "fleas.init()");
        }
    }

    private final void b(int param0, int param1, int param2) {
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_44_0 = 0;
        sf stackIn_48_1 = null;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_50_0Lifetime1;
        int stackIn_50_1Lifetime1;
        var8 = field_A ? 1 : 0;
        try {
          if (param0 >= -90) {
            return;
          }
          if (param1 < 338 &&
            param1 >= 2 &&
            2 <= param2 &&
            param2 < 642) {
            var4_int = param2 / 16;
            var5 = param1 / 16;
            var7 = 4 * var5;
            var6 = var4_int * 4;
            if (var4_int >= 0 &&
              0 <= var5 &&
              40 > var4_int &&
              var5 < 21) {
              param2 = var6;
              while (true) {
                stackIn_28_0 = param2;
                stackIn_28_1 = var6 + 4;
                if (stackIn_28_0 < stackIn_28_1) {
                  stackIn_44_0 = var7;
                  if (var8 == 0) {
                    param1 = stackIn_44_0;
                    while ((4 + var7) > param1) {
                      stackIn_28_0 = 0;
                      stackIn_28_1 = IntrusiveNode.field_e[param2][param1];
                      if (stackIn_28_0 != stackIn_28_1) {
                        if (ik.field_R) {
                          fh.$cfr$intArgs$a$cb0bc10e6b69(107, gi.field_d, 100, 96);
                          ik.field_R = false;
                        }
                        return;
                      }
                      param1++;
                    }
                    param2++;
                    continue;
                  }
                } else {
                  stackIn_44_0 = -109;
                }
                if (mh.field_u != 1) {
                  stackIn_48_1 = el.field_C;
                } else {
                  stackIn_48_1 = rl.field_g;
                }
                fh.$cfr$intArgs$a$cb0bc10e6b69(stackIn_44_0, stackIn_48_1, 100, 63);
                ik.field_R = false;
                fl.field_c[var4_int][var5] = (char)(1 + mh.field_u);
                this.a((byte) -91, var5, var4_int);
                param2 = var6;
                while (true) {
                  stackIn_50_0 = param2;
                  stackIn_50_1 = 4 + var6;
                  if (stackIn_50_0 >= stackIn_50_1) {
                    return;
                  }
                  if (var8 != 0) {
                    return;
                  }
                  param1 = var7;
                  while ((var7 + 4) > param1) {
                    stackIn_50_0Lifetime1 = -2;
                    stackIn_50_1Lifetime1 = ~mh.field_u;
                    if (stackIn_50_0Lifetime1 == stackIn_50_1Lifetime1) {
                      IntrusiveNode.field_e[param2][param1] = 1;
                    }
                    if (mh.field_u == 2 &&
                      param2 - var6 == -param1 + (var7 + 3)) {
                      IntrusiveNode.field_e[param2][param1] = 1;
                    }
                    if (mh.field_u == 3 &&
                      ~(-var7 + param1) == ~(-var6 + param2)) {
                      IntrusiveNode.field_e[param2][param1] = 1;
                    }
                    param1++;
                  }
                  param2++;
                }
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var4), "fleas.K(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public fleas() {
    }

    final static re[] a(ih param0, int param1) {
        Object stackIn_8_0 = null;
        re[] stackIn_16_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        re[] var4 = null;
        int var5 = 0;
        re var6_ref_re = null;
        int var6 = 0;
        int var7 = 0;
        var7 = field_A ? 1 : 0;
        try {
          if (param1 != -6383) {
            fleas.a((ih) null, -51);
          }
          var2_int = param0.b(8, (byte) -87);
          if (var2_int > 0) {
            stackIn_8_0 = null;
            return (re[]) (stackIn_8_0);
          }
          var3 = param0.b(12, (byte) -87);
          var4 = new re[var3];
          var5 = 0;
          while (var5 < var3) {
            boolean decompiledSharedTail0 = !(fb.a((byte) 98, param0));
            if (!decompiledSharedTail0) {
              var6_ref_re = new re();
              param0.b(24, (byte) -87);
              param0.b(24, (byte) -87);
              var6_ref_re.field_a = param0.b(24, (byte) -87);
              param0.b(9, (byte) -87);
              param0.b(12, (byte) -87);
              param0.b(12, (byte) -87);
              param0.b(12, (byte) -87);
              var4[var5] = var6_ref_re;
              decompiledSharedTail0 = (var7 != 0);
            }
            if (decompiledSharedTail0) {
              var6 = param0.b(qh.a(3, -1 + var5), (byte) -87);
              var4[var5] = var4[var6];
            }
            var5++;
            if (var7 == 0) {
              continue;
            }
            break;
          }
          stackIn_16_0 = var4;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_20_0 = var2;
          stackIn_20_1 = new StringBuilder().append("fleas.J(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void l(int param0) {
        StringBuilder discarded$0 = null;
        ok dupTemp$1 = null;
        ok dupTemp$2 = null;
        int[] dupTemp$3 = null;
        int dupTemp$4 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_61_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_104_0 = 0;
        vg stackIn_113_0 = null;
        boolean stackIn_114_1 = false;
        int stackIn_211_0 = 0;
        int stackIn_211_1 = 0;
        int stackIn_292_0 = 0;
        int stackIn_292_1 = 0;
        int stackIn_314_0 = 0;
        int stackIn_314_1 = 0;
        int stackIn_376_0 = 0;
        int stackIn_376_1 = 0;
        int stackIn_465_0 = 0;
        int stackIn_492_0 = 0;
        int stackIn_496_0 = 0;
        int stackIn_496_1 = 0;
        int stackIn_521_0 = 0;
        int stackIn_521_1 = 0;
        int stackIn_537_0 = 0;
        int stackIn_539_0 = 0;
        int stackIn_539_1 = 0;
        char stackIn_544_0 = 0;
        int stackIn_552_0 = 0;
        RuntimeException decompiledCaughtException = null;
        char stackOut_543_0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
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
        kh var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        ok var23 = null;
        int var24 = 0;
        int stackIn_292_0Lifetime1;
        int stackIn_292_1Lifetime1;
        int stackIn_376_0Lifetime1;
        int stackIn_376_1Lifetime1;
        int stackIn_492_0Lifetime1;
        int stackIn_496_0Lifetime1;
        int stackIn_496_1Lifetime1;
        int stackIn_521_0Lifetime1;
        int stackIn_521_1Lifetime1;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var3Lifetime4;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var4Lifetime2Lifetime1;
        int var5Lifetime1Lifetime1;
        int var6Lifetime1Lifetime1;
        int var7Lifetime2Lifetime1;
        int var8Lifetime2Lifetime1;
        var24 = field_A ? 1 : 0;
        try {
          if (mg.field_d >= 0) {
            mg.field_d = mg.field_d + 1;
          }
          this.field_M = 1.0 + ma.a((double)ni.field_j / 10.0, 109);
          if (!lk.field_D.field_k) {
            if (!(mg.field_d < 0)) {
              si.field_y.field_a = (int)(415.0 - 2.0 * this.field_M);
              si.field_y.field_n = (int)(4.0 * this.field_M + 220.0);
              si.field_y.field_l = (int)(395.0 - this.field_M * 2.0);
              si.field_y.field_d = (int)(4.0 * this.field_M + 30.0);
              if (var24 != 0) {
                lk.field_D.field_d = (int)(30.0 + this.field_M * 4.0);
                lk.field_D.field_a = (int)(-(2.0 * this.field_M) + 415.0);
                lk.field_D.field_l = (int)(-(this.field_M * 2.0) + 395.0);
                lk.field_D.field_n = (int)(4.0 * this.field_M + 220.0);
              }
            }
          } else {
            lk.field_D.field_d = (int)(30.0 + this.field_M * 4.0);
            lk.field_D.field_a = (int)(-(2.0 * this.field_M) + 415.0);
            lk.field_D.field_l = (int)(-(this.field_M * 2.0) + 395.0);
            lk.field_D.field_n = (int)(4.0 * this.field_M + 220.0);
          }
          var2_int = tj.field_a;
          if (nl.field_c[field_E].length <= tj.field_a) {
            var2_int = -1 + nl.field_c[field_E].length;
          }
          boolean decompiledNaturalLoopExit2 = false;
          while (!(decompiledNaturalLoopExit2 = (!SecondaryNodeDeque.b(-118)))) {
            var3 = id.field_b;
            stackIn_42_0 = -33;
            stackIn_42_1 = ~var3;
            if (var24 == 0) {
              if ((stackIn_42_0 == stackIn_42_1 ||
                ii.a(1, (char) var3)) &&
                uc.field_a.length() < 16) {
                discarded$0 = uc.field_a.append((char) var3);
              }
              if (ji.field_a == 85 &&
                uc.field_a.length() > 0) {
                uf.a(-1 + uc.field_a.length(), uc.field_a, ' ', -120);
              }
              if (ji.field_a == 84) {
              }
              if (ji.field_a == 13) {
                oa.a(1, false, -109);
                return;
              }
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit2) {
            stackIn_42_0 = ~kc.field_f;
            stackIn_42_1 = -1;
          }
          if (stackIn_42_0 == stackIn_42_1) {
            ik.field_R = true;
          }
          ee.field_h = ee.field_h - (ee.field_h + 1 >> 3);
          if (10 == jk.field_l) {
          }
          if (DualLinkNode.field_o == 1) {
            return;
          }
          qh.field_z = 0;
          jg.field_e = 0;
          var3Lifetime1 = 0;
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (!(var3Lifetime1 < nb.field_b)))) {
            stackIn_61_0 = cl.field_d[var3Lifetime1];
            if (var24 == 0) {
              if (stackIn_61_0 == 0) {
                qh.field_z = qh.field_z + 1;
              } else {
                jg.field_e = jg.field_e + 1;
              }
              var3Lifetime1++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            jg.field_e = jg.field_e - pl.field_f;
            stackIn_61_0 = ~qh.field_z;
          }
          if (stackIn_61_0 != -1) {
            em.field_b = em.field_b - 1;
          }
          dk.field_C.b(true);
          wd.field_a.b(true);
          de.field_b.b(true);
          var15 = mh.field_u;
          if (dk.field_C.field_g ||
            ei.field_H[16]) {
            mh.field_u = 1;
          }
          if (wd.field_a.field_g ||
            ei.field_H[17]) {
            mh.field_u = 2;
          }
          if (de.field_b.field_g ||
            ei.field_H[18]) {
            mh.field_u = 3;
          }
          if (mh.field_u != var15) {
            ik.a(wj.field_b[0], (byte) -84);
          }
          boolean decompiledFrameRemainder0 = true;
          var16 = ia.field_m[field_E][var2_int];
          if (jk.field_l != 10 &&
            pl.field_f < var16.field_e && (!(qe.field_k >= 2) ||
            ji.field_a != 2)) {
            stackIn_100_0 = 0;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_100_0 = 1;
          }
          var17 = stackIn_100_0;
          stackIn_104_0 = (var16.field_e <= (var16.field_f - jg.field_e)) ? 0 : 1;
          var18 = stackIn_104_0;
          if (var18 != 0 &&
            0 > mg.field_d) {
            mg.field_d = 0;
          }
          lk.field_D.field_k = var17 != 0;
          stackIn_113_0 = si.field_y;
          stackIn_114_1 = !(lk.field_D.field_k);
          stackIn_113_0.field_k = stackIn_114_1;
          if (var17 != 0) {
            if (5 == tj.field_a) {
              hg.a(-25389, 0, 255, tj.field_a);
              if (tg.field_g) {
                hg.a(-25389, 12, 243, tj.field_a);
              }
            }
            if (tj.field_a == 10) {
              hg.a(-25389, 1, 254, tj.field_a);
              if (tg.field_g) {
                hg.a(-25389, 13, 242, tj.field_a);
              }
            }
            if (tj.field_a == 20) {
              hg.a(-25389, 2, 253, tj.field_a);
              if (tg.field_g) {
                hg.a(-25389, 14, 241, tj.field_a);
              }
            }
            if (~pl.field_f == ~ml.field_O) {
              if (0 == tj.field_a &&
                field_E == 1) {
                hg.a(-25389, 5, 250, tj.field_a);
              }
              if (tj.field_a == 1 &&
                field_E == 1) {
                hg.a(-25389, 6, 249, tj.field_a);
              }
              if (tj.field_a == 2 &&
                field_E == 1) {
                hg.a(-25389, 7, 248, tj.field_a);
              }
              if (3 == tj.field_a &&
                field_E == 1) {
                hg.a(-25389, 8, 247, tj.field_a);
              }
              if (tj.field_a == 4 &&
                field_E == 1) {
                hg.a(-25389, 9, 246, tj.field_a);
              }
              oa.a(10, true, -125);
            }
          }
          boolean decompiledFrameCompleted0 = true;
          ol.field_f.field_t = fl.field_f;
          ol.field_f.c(47);
          fl.field_f = ol.field_f.field_t;
          if (fl.field_f) {
            var19 = ag.field_f / 16;
            var20 = kc.field_b / 16;
            var21 = -1;
            if (var20 < 21 &&
              var19 < 40 &&
              var20 >= 0 &&
              0 <= var19) {
              var21 = fl.field_c[var19][var20];
            }
            var22 = ob.field_c.length - 1;
            while (var22 >= 0) {
              stackIn_211_0 = ~var22;
              stackIn_211_1 = ~var21;
              if (var24 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_211_0 != stackIn_211_1) {
                var23 = ob.field_c[var22];
                ob.field_c[var22].field_z = 0;
                var23.field_G = 0;
              } else {
                ob.field_c[var22].field_l = var19 * 16;
                ob.field_c[var22].field_a = var20 * 16;
                dupTemp$1 = ob.field_c[var22];
                dupTemp$1.field_l = dupTemp$1.field_l - ob.field_c[var22].field_n / 2;
                ob.field_c[var22].field_a = kc.field_b / 16 * 16;
                dupTemp$2 = ob.field_c[var22];
                dupTemp$2.field_a = dupTemp$2.field_a + 32;
                ob.field_c[var22].field_C = var19 * 16;
                ob.field_c[var22].field_H = var20 * 16;
                var23 = ob.field_c[var22];
                ob.field_c[var22].field_z = 16;
                var23.field_G = 16;
                if (ob.field_c[var22].field_l < 0) {
                  ob.field_c[var22].field_l = 0;
                }
                if (ob.field_c[var22].field_a < 0) {
                  ob.field_c[var22].field_a = 0;
                }
                if (ob.field_c[var22].field_l + ob.field_c[var22].field_n > 640) {
                  ob.field_c[var22].field_l = 640 - ob.field_c[var22].field_n;
                }
              }
              ob.field_c[var22].d(98);
              var22--;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_211_0 = kc.field_f;
            stackIn_211_1 = 1;
          }
          if (stackIn_211_0 != stackIn_211_1) {
            oa.field_n = false;
          }
          if ((stackIn_211_0 == stackIn_211_1 ||
            var24 != 0) &&
            !oa.field_n) {
            this.b(-94, kc.field_b, ag.field_f);
          }
          lk.field_D.b(true);
          si.field_y.b(true);
          if (lk.field_D.field_g) {
            oa.a(10, true, 91);
            ik.a(wj.field_b[0], (byte) -84);
          }
          if (si.field_y.field_g && (!(0 < qg.field_c) ||
            0 != nb.field_b)) {
            cf.a(-25319);
            ik.a(wj.field_b[0], (byte) -84);
          }
          if (var17 != 0) {
            if (120 > pg.field_f) {
              pg.field_f = pg.field_f + 1;
            }
            if (jk.field_l == 10 &&
              pg.field_f < 360 &&
              em.field_b == 0 &&
              qh.field_y == 0) {
              pg.field_f = pg.field_f + 1;
            }
          }
          if ((ni.field_j & 1) != 0) {
            return;
          }
          kb.field_i = (kb.field_i + 1) % 8;
          var3Lifetime2 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var3Lifetime2 < oe.field_a)))) {
            var4 = fl.field_c[id.field_h[var3Lifetime2]][uf.field_e[var3Lifetime2]];
            stackIn_314_0 = var4;
            stackIn_314_1 = ci.field_c[var3Lifetime2];
            if (var24 == 0) {
              boolean decompiledFrameRemainder4 = true;
              if (stackIn_314_0 == stackIn_314_1 ||
                ~fg.field_u[var3Lifetime2] == ~var4) {
                if (0 != ok.field_s[var3Lifetime2]) {
                  if ((ci.field_c[var3Lifetime2] == 8)) {
                    var7 = id.field_h[var3Lifetime2] * 16;
                    var13 = 0;
                    var8 = uf.field_e[var3Lifetime2] * 16;
                    var4 = 0;
                    while (var4 < nb.field_b) {
                      stackIn_292_0 = 0;
                      stackIn_292_1 = cl.field_d[var4];
                      if (stackIn_292_0 == stackIn_292_1 &&
                        var7 <= qg.field_a[var4] &&
                        var8 <= dh.field_b[var4] &&
                        qg.field_a[var4] < (16 + var7) &&
                        dh.field_b[var4] < (var8 + 16)) {
                        var13 = 1;
                      }
                      var4++;
                    }
                    stackIn_292_0Lifetime1 = 1;
                    stackIn_292_1Lifetime1 = var13;
                    if (stackIn_292_0Lifetime1 != stackIn_292_1Lifetime1) {
                      fl.field_c[id.field_h[var3Lifetime2]][uf.field_e[var3Lifetime2]] = '\b';
                    } else {
                      if (fl.field_c[id.field_h[var3Lifetime2]][uf.field_e[var3Lifetime2]] == 8) {
                        fh.$cfr$intArgs$a$cb0bc10e6b69(-91, bf.field_d, 100, 63);
                      }
                      fl.field_c[id.field_h[var3Lifetime2]][uf.field_e[var3Lifetime2]] = '\t';
                    }
                  }
                  decompiledFrameRemainder4 = false;
                }
                else {
                  if (kb.field_i == 0) {
                    fl.field_c[id.field_h[var3Lifetime2]][uf.field_e[var3Lifetime2]] = (char)ci.field_c[var3Lifetime2];
                  }
                  if (kb.field_i == 4) {
                    fl.field_c[id.field_h[var3Lifetime2]][uf.field_e[var3Lifetime2]] = (char)fg.field_u[var3Lifetime2];
                  }
                }
              }
              var3Lifetime2++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_314_0 = ml.field_O;
            stackIn_314_1 = nb.field_b;
          }
          if (stackIn_314_0 > stackIn_314_1) {
            qg.field_c = qg.field_c - 1;
            if (!(1 <= qg.field_c)) {
              nb.field_b = nb.field_b + 1;
              qg.field_c = 6;
              fh.$cfr$intArgs$a$cb0bc10e6b69(105, ic.field_ab, 100, 63);
              if (var24 != 0) {
                qg.field_c = -1;
              }
            }
          } else {
            qg.field_c = -1;
          }
          var19Lifetime1 = 0;
          var3Lifetime3 = 0;
          while (true) {
            if (!(nb.field_b > var3Lifetime3)) {
              oj.field_i.i((int)(32.0 * Math.log((double)(1 + var19Lifetime1))));
              stackIn_465_0 = 0;
              break;
            }
            stackIn_465_0 = cl.field_d[var3Lifetime3];
            if (var24 == 0) {
              if (stackIn_465_0 == 0 &&
                jd.field_o[var3Lifetime3] != 1 &&
                fl.field_c[qg.field_a[var3Lifetime3] / 16][dh.field_b[var3Lifetime3] / 16] == 2) {
                cl.field_d[var3Lifetime3] = 1;
                fh.$cfr$intArgs$a$cb0bc10e6b69(-77, fi.field_n, 100, 63);
              }
              if (cl.field_d[var3Lifetime3] == 0) {
                var7Lifetime1 = qg.field_a[var3Lifetime3];
                var8Lifetime1 = dh.field_b[var3Lifetime3];
                var9 = ge.field_a[var3Lifetime3];
                var10 = var7Lifetime1 / 4;
                if (var9 < 0) {
                  va.field_t[var3Lifetime3] = kb.field_i % 2;
                } else {
                  va.field_t[var3Lifetime3] = 2 + kb.field_i % 2;
                }
                var12 = var9 / 4;
                var11 = var8Lifetime1 / 4;
                var14 = 0;
                var4Lifetime1 = 0;
                while (true) {
                  if (qi.field_f > var4Lifetime1) {
                    stackIn_376_0 = var7Lifetime1;
                    stackIn_376_1 = oa.field_m[var4Lifetime1];
                    if (stackIn_376_0 >= stackIn_376_1 &&
                      var7Lifetime1 < lc.field_v[var4Lifetime1] &&
                      var8Lifetime1 >= uh.field_n[var4Lifetime1] &&
                      ca.field_G[var4Lifetime1] > var8Lifetime1 &&
                      me.field_i[var4Lifetime1] == 0) {
                      if ((var7Lifetime1 / 16) > rk.field_u[var4Lifetime1]) {
                        ge.field_a[var3Lifetime3] = 4;
                        var9 = 4;
                        var12 = 1;
                      } else {
                        ge.field_a[var3Lifetime3] = -4;
                        var12 = -1;
                        var9 = -4;
                      }
                      var19Lifetime1++;
                      var14 = 1;
                      if (~var19Lifetime1 == ~qh.field_z &&
                        ~ia.field_m[field_E][var2_int].field_f == ~qh.field_z) {
                        hg.a(-25389, 11, 244, var2_int);
                      }
                    }
                    var4Lifetime1++;
                    continue;
                  }
                  break;
                }
                stackIn_376_0Lifetime1 = ~jd.field_o[var3Lifetime3];
                stackIn_376_1Lifetime1 = -1;
                if (stackIn_376_0Lifetime1 == stackIn_376_1Lifetime1) {
                  IntrusiveNode.field_e[var10][var11] = 0;
                  if (IntrusiveNode.field_e[var10][var11 + md.field_L] == 2 &&
                    var14 == 0) {
                    this.a((md.field_L + var11) / 4, true, var3Lifetime3, var10 / 4, 2);
                  }
                  if (IntrusiveNode.field_e[var10][var11 - md.field_L] == 2 &&
                    var14 == 0) {
                    this.a((var11 - md.field_L) / 4, true, var3Lifetime3, var10 / 4, 3);
                  }
                  if ((!(0 >= IntrusiveNode.field_e[var10][var11 + md.field_L]) ||
                    var14 != 0) &&
                    IntrusiveNode.field_e[var10 + var12][var11] == 2) {
                    this.a(var11 / 4, true, var3Lifetime3, (var10 + var12) / 4, var12);
                  }
                  boolean decompiledFrameRemainder3 = true;
                  var7Lifetime1 = qg.field_a[var3Lifetime3];
                  var8Lifetime1 = dh.field_b[var3Lifetime3];
                  var9 = ge.field_a[var3Lifetime3];
                  var10 = var7Lifetime1 / 4;
                  var12 = var9 / 4;
                  var11 = var8Lifetime1 / 4;
                  if (jd.field_o[var3Lifetime3] != 2) {
                    if (!(IntrusiveNode.field_e[var10][md.field_L + var11] <= 0) ||
                      var14 != 0) {
                      if (IntrusiveNode.field_e[var12 + var10][var11] > 0 &&
                        IntrusiveNode.field_e[var10][-md.field_L + var11] <= 0 &&
                        IntrusiveNode.field_e[var12 + var10][var11 - md.field_L] <= 0) {
                        var8Lifetime1 = var8Lifetime1 - ue.field_d;
                        var7Lifetime1 = var7Lifetime1 + var9;
                      } else {
                        if (0 >= IntrusiveNode.field_e[var12 + var10][var11]) {
                          var7Lifetime1 = var7Lifetime1 + var9;
                        } else {
                          var9 = -var9;
                        }
                      }
                      decompiledFrameRemainder3 = false;
                    }
                    else {
                      var8Lifetime1 = var8Lifetime1 + ue.field_d;
                    }
                  }
                  var10 = var7Lifetime1 / 4;
                  var11 = var8Lifetime1 / 4;
                  if (1 != jd.field_o[var3Lifetime3] &&
                    cl.field_d[var3Lifetime3] == 0) {
                    IntrusiveNode.field_e[var10][var11] = 1;
                  }
                } else {
                  boolean decompiledFrameRemainder2 = true;
                  if (jd.field_o[var3Lifetime3] == 1) {
                    var5 = var7Lifetime1 / 16;
                    var8Lifetime1 = var8Lifetime1 - ue.field_d;
                    var6 = var8Lifetime1 / 16;
                    if (0 <= var6 &&
                      21 > var6) {
                      if (((fl.field_c[var5][var6] == 11)) &&
                        ((var8Lifetime1 % 16 == 4))) {
                        jd.field_o[var3Lifetime3] = 0;
                        var9 = -4;
                        ge.field_a[var3Lifetime3] = -4;
                        fh.$cfr$intArgs$a$cb0bc10e6b69(89, hg.field_n, 100, 63);
                      }
                      decompiledFrameRemainder2 = false;
                    }
                    else {
                      cl.field_d[var3Lifetime3] = 1;
                      fh.$cfr$intArgs$a$cb0bc10e6b69(86, fi.field_n, 100, 63);
                    }
                  }
                  if (2 == jd.field_o[var3Lifetime3]) {
                    IntrusiveNode.field_e[var10][var11] = 0;
                    if (IntrusiveNode.field_e[var10][-md.field_L + var11] == 2) {
                      this.a((var11 - 1) / 4, true, var3Lifetime3, var10 / 4, 3);
                    }
                    var9 = ge.field_a[var3Lifetime3];
                    var7Lifetime1 = qg.field_a[var3Lifetime3];
                    var8Lifetime1 = dh.field_b[var3Lifetime3];
                    var11 = var8Lifetime1 / 4;
                    var10 = var7Lifetime1 / 4;
                    var12 = var9 / 4;
                    var8Lifetime1 = var8Lifetime1 - ue.field_d;
                    var11 = var11 - md.field_L;
                    if (!(IntrusiveNode.field_e[var10][var11] <= 0) ||
                      var14 != 0) {
                      var8Lifetime1 = var8Lifetime1 + ue.field_d;
                      var11 = var11 + md.field_L;
                      jd.field_o[var3Lifetime3] = 0;
                    }
                    IntrusiveNode.field_e[var10][var11] = 1;
                  }
                }
                qg.field_a[var3Lifetime3] = var7Lifetime1;
                dh.field_b[var3Lifetime3] = var8Lifetime1;
                ge.field_a[var3Lifetime3] = var9;
              }
              var3Lifetime3++;
              continue;
            }
            break;
          }
          var3Lifetime4 = stackIn_465_0;
          scanLoop1: while (true) {
            boolean decompiledFrameRemainder1 = true;
            if (var3Lifetime4 < gh.field_q) {
              var5Lifetime1 = rf.field_e[var3Lifetime4];
              var6Lifetime1 = hf.field_d[var3Lifetime4];
              var4Lifetime2 = wh.field_d[var3Lifetime4];
              stackIn_496_0 = -1;
              stackIn_496_1 = ~cl.field_d[var4Lifetime2];
              if (var24 != 0) {
                decompiledFrameRemainder1 = !(stackIn_496_0 <= stackIn_496_1);
                if (decompiledFrameRemainder1) {
                  var6Lifetime1 = ek.field_b[var3Lifetime4];
                  var5Lifetime1 = f.field_F[var3Lifetime4];
                  var7Lifetime2 = 16 * var5Lifetime1;
                  var8Lifetime2 = (-2 + var6Lifetime1) * 16 + hl.field_C[var3Lifetime4];
                  stackIn_537_0 = 0;
                  break scanLoop1;
                }
              } else {
                if (stackIn_496_0 != stackIn_496_1 ||
                  jd.field_o[var4Lifetime2] != 0 ||
                  qg.field_a[var4Lifetime2] / 16 != var5Lifetime1 ||
                  var6Lifetime1 * 4 - 1 != dh.field_b[var4Lifetime2] / 4) {
                  fh.$cfr$intArgs$a$cb0bc10e6b69(101, hf.field_g, 100, 63);
                  fl.field_c[var5Lifetime1][var6Lifetime1] = '\0';
                  this.a((byte) -79, var6Lifetime1, var5Lifetime1);
                  var20Lifetime1 = 0;
                  while (var20Lifetime1 < 4) {
                    stackIn_492_0 = 0;
                    var21Lifetime1 = stackIn_492_0;
                    while (var21Lifetime1 < 4) {
                      IntrusiveNode.field_e[var5Lifetime1 * 4 + var20Lifetime1][var21Lifetime1 + 4 * var6Lifetime1] = 0;
                      var21Lifetime1++;
                    }
                    var20Lifetime1++;
                  }
                  stackIn_492_0Lifetime1 = gh.field_q - 1;
                  gh.field_q = stackIn_492_0Lifetime1;
                  rf.field_e[var3Lifetime4] = rf.field_e[gh.field_q];
                  hf.field_d[var3Lifetime4] = hf.field_d[gh.field_q];
                  wh.field_d[var3Lifetime4] = wh.field_d[gh.field_q];
                  var3Lifetime4--;
                }
                var3Lifetime4++;
                continue;
              }
            }
            if (decompiledFrameRemainder1) {
              var3Lifetime4 = 0;
              while (true) {
                stackIn_496_0Lifetime1 = pl.field_g;
                stackIn_496_1Lifetime1 = var3Lifetime4;
                if (stackIn_496_0Lifetime1 <= stackIn_496_1Lifetime1) {
                  break;
                }
                var6Lifetime1Lifetime1 = ek.field_b[var3Lifetime4];
                var5Lifetime1Lifetime1 = f.field_F[var3Lifetime4];
                var7Lifetime2Lifetime1 = 16 * var5Lifetime1Lifetime1;
                var8Lifetime2Lifetime1 = (-2 + var6Lifetime1Lifetime1) * 16 + hl.field_C[var3Lifetime4];
                stackIn_537_0 = 0;
                if (var24 != 0) {
                  break scanLoop1;
                }
                var4Lifetime2Lifetime1 = stackIn_537_0;
                while (var4Lifetime2Lifetime1 < nb.field_b) {
                  stackIn_521_0 = qg.field_a[var4Lifetime2Lifetime1];
                  stackIn_521_1 = -4 + var7Lifetime2Lifetime1;
                  if (stackIn_521_0 >= stackIn_521_1 &&
                    (20 + var7Lifetime2Lifetime1) > qg.field_a[var4Lifetime2Lifetime1] &&
                    var8Lifetime2Lifetime1 <= dh.field_b[var4Lifetime2Lifetime1] &&
                    (var8Lifetime2Lifetime1 + 20) > dh.field_b[var4Lifetime2Lifetime1]) {
                    if (0 == cl.field_d[var4Lifetime2Lifetime1]) {
                      cl.field_d[var4Lifetime2Lifetime1] = 1;
                      fh.$cfr$intArgs$a$cb0bc10e6b69(93, fi.field_n, 100, 63);
                    }
                    IntrusiveNode.field_e[qg.field_a[var4Lifetime2Lifetime1] / 4][dh.field_b[var4Lifetime2Lifetime1] / 4] = 0;
                  }
                  var4Lifetime2Lifetime1++;
                }
                hl.field_C[var3Lifetime4] = hl.field_C[var3Lifetime4] + uf.field_b[var3Lifetime4];
                stackIn_521_0Lifetime1 = hl.field_C[var3Lifetime4];
                stackIn_521_1Lifetime1 = 16;
                if (stackIn_521_0Lifetime1 >= stackIn_521_1Lifetime1) {
                  hl.field_C[var3Lifetime4] = 16;
                  uf.field_b[var3Lifetime4] = -4;
                }
                if (0 == hl.field_C[var3Lifetime4]) {
                  fl.field_c[var5Lifetime1Lifetime1][-2 + var6Lifetime1Lifetime1] = '\017';
                  this.a((byte) -86, var6Lifetime1Lifetime1 - 2, var5Lifetime1Lifetime1);
                  var4Lifetime2Lifetime1 = var3Lifetime4;
                  while (var4Lifetime2Lifetime1 < pl.field_g) {
                    f.field_F[var4Lifetime2Lifetime1] = f.field_F[1 + var4Lifetime2Lifetime1];
                    ek.field_b[var4Lifetime2Lifetime1] = ek.field_b[1 + var4Lifetime2Lifetime1];
                    hl.field_C[var4Lifetime2Lifetime1] = hl.field_C[1 + var4Lifetime2Lifetime1];
                    uf.field_b[var4Lifetime2Lifetime1] = uf.field_b[var4Lifetime2Lifetime1 + 1];
                    var4Lifetime2Lifetime1++;
                  }
                  pl.field_g = pl.field_g - 1;
                }
                var3Lifetime4++;
              }
            }
            stackIn_537_0 = 20;
            break;
          }
          var6Lifetime2 = stackIn_537_0;
          while (true) {
            stackIn_539_0 = ~var6Lifetime2;
            stackIn_539_1 = -1;
            if (stackIn_539_0 <= stackIn_539_1) {
              stackIn_552_0 = 39;
              if (var24 == 0) {
                var5Lifetime2 = stackIn_552_0;
                while (var5Lifetime2 >= 0) {
                  stackOut_543_0 = fl.field_c[var5Lifetime2][var6Lifetime2];
                  stackIn_539_0 = stackOut_543_0;
                  stackIn_544_0 = stackOut_543_0;
                  stackIn_539_1 = 33;
                  if (stackIn_544_0 == stackIn_539_1) {
                    dupTemp$3 = field_G[var5Lifetime2];
                    dupTemp$4 = dupTemp$3[var6Lifetime2];
                    dupTemp$3[var6Lifetime2] = dupTemp$4 - 1;
                    if (dupTemp$4 < 0) {
                      fl.field_c[var5Lifetime2][var6Lifetime2] = '\006';
                    }
                  }
                  var5Lifetime2--;
                }
                var6Lifetime2--;
                continue;
              }
            } else {
              stackIn_552_0 = param0;
            }
            if (stackIn_552_0 <= 126) {
              return;
            }
            if (0 < we.field_c) {
              we.field_c = we.field_c - 1;
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var2), "fleas.O(" + param0 + ')');
        }
    }

    public static void m(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_B = null;
          field_H = null;
          field_F = null;
          if (param0 != -1) {
            fleas.m(59);
          }
          field_K = null;
          field_I = null;
          field_J = null;
          field_G = (int[][]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var1), "fleas.I(" + param0 + ')');
        }
    }

    static {
        int var2 = 0;
        int var3 = 0;
        long var0;
        field_H = "Must save: <%0>";
        field_J = new long[256];
        field_E = 0;
        for (var2 = 0; var2 < 256; var2++) {
          var0 = (long)var2;
          for (var3 = 0; 8 > var3; var3++) {
            if (1L != (var0 & 1L)) {
              var0 = var0 >>> 1;
            } else {
              var0 = var0 >>> 1 ^ -3932672073523589310L;
            }
          }
          field_J[var2] = var0;
        }
        field_G = new int[40][21];
        field_I = "Bonus: <%0>";
    }
}
