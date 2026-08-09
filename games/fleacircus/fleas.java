/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

public final class fleas extends wb {
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
        int stackIn_79_0 = 0;
        int stackIn_80_0 = 0;
        sf stackIn_80_1 = null;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        L0: {
          var12 = field_A ? 1 : 0;
          if (10 != fl.field_c[param3][param0]) {
            break L0;
          } else {
            fh.a((byte) 105, ab.field_a, 100, 63);
            lj.field_c[uf.field_h] = param3;
            fb.field_e[uf.field_h] = param0;
            nc.field_a[uf.field_h] = ni.field_j;
            uf.field_h = uf.field_h + 1;
            var6 = param3 - 1;
            L1: while (true) {
              if (param3 - -1 < var6) {
                break L0;
              } else {
                var7 = -1 + param0;
                L2: while (true) {
                  if (var7 > param0 + 1) {
                    var6++;
                    continue L1;
                  } else {
                    L3: {
                      if (fl.field_c[var6][var7] != 15) {
                        break L3;
                      } else {
                        fl.field_c[var6][2 + var7] = (char)2;
                        break L3;
                      }
                    }
                    fl.field_c[var6][var7] = (char)0;
                    this.a((byte) -120, var7, var6);
                    var8 = 0;
                    L4: while (true) {
                      if (-5 >= (var8 ^ -1)) {
                        var7++;
                        continue L2;
                      } else {
                        var9 = 0;
                        L5: while (true) {
                          if ((var9 ^ -1) <= -5) {
                            var8++;
                            continue L4;
                          } else {
                            lh.field_e[var8 + 4 * var6][4 * var7 - -var9] = 0;
                            var9++;
                            continue L5;
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
        L6: {
          if (fl.field_c[param3][param0] == 5) {
            fh.a((byte) 102, ih.field_l, 100, 63);
            fl.field_c[param3][param0] = (char)0;
            this.a((byte) -117, param0, param3);
            jd.field_o[param2] = 1;
            var8 = 0;
            L7: while (true) {
              if (var8 >= 4) {
                break L6;
              } else {
                var9 = 0;
                L8: while (true) {
                  if (4 <= var9) {
                    var8++;
                    continue L7;
                  } else {
                    lh.field_e[var8 + param3 * 4][var9 + param0 * 4] = 0;
                    var9++;
                    continue L8;
                  }
                }
              }
            }
          } else {
            break L6;
          }
        }
        L9: {
          if (fl.field_c[param3][param0] != 6) {
            break L9;
          } else {
            if (param4 == 2) {
              fl.field_c[param3][param0] = (char)33;
              field_G[param3][param0] = 2;
              jd.field_o[param2] = 2;
              fh.a((byte) -70, me.field_k, 100, 384 / ee.field_h);
              ee.field_h = ee.field_h + 12;
              if (ee.field_h <= 32) {
                break L9;
              } else {
                ee.field_h = 32;
                break L9;
              }
            } else {
              break L9;
            }
          }
        }
        L10: {
          if (7 != fl.field_c[param3][param0]) {
            break L10;
          } else {
            if (2 != param4) {
              break L10;
            } else {
              if (0 == db.field_H) {
                var7 = pl.field_g;
                var6 = 0;
                L11: while (true) {
                  if (pl.field_g <= var6) {
                    L12: {
                      L13: {
                        if (var7 == pl.field_g) {
                          break L13;
                        } else {
                          if ((uf.field_b[var7] ^ -1) != -5) {
                            break L13;
                          } else {
                            break L12;
                          }
                        }
                      }
                      uf.field_b[var7] = 4;
                      fh.a((byte) -91, hi.field_p, 100, 63);
                      break L12;
                    }
                    if (pl.field_g == var7) {
                      f.field_F[var7] = param3;
                      ek.field_b[var7] = param0;
                      hl.field_C[var7] = 0;
                      fl.field_c[param3][param0 + -2] = (char)30;
                      this.a((byte) -89, param0 + -2, param3);
                      pl.field_g = pl.field_g + 1;
                      break L10;
                    } else {
                      break L10;
                    }
                  } else {
                    if (param3 == f.field_F[var6]) {
                      if (param0 == ek.field_b[var6]) {
                        var7 = var6;
                        var6++;
                        continue L11;
                      } else {
                        var6++;
                        continue L11;
                      }
                    } else {
                      var6++;
                      continue L11;
                    }
                  }
                }
              } else {
                break L10;
              }
            }
          }
        }
        L14: {
          L15: {
            if (-14 == (fl.field_c[param3][param0] ^ -1)) {
              break L15;
            } else {
              if (27 != fl.field_c[param3][param0]) {
                break L14;
              } else {
                break L15;
              }
            }
          }
          if (3 == param4) {
            break L14;
          } else {
            cl.field_d[param2] = 1;
            c.field_U = true;
            fh.a((byte) -59, ah.field_a, 100, 63);
            break L14;
          }
        }
        L16: {
          L17: {
            if (16 == fl.field_c[param3][param0]) {
              break L17;
            } else {
              if (-30 != (fl.field_c[param3][param0] ^ -1)) {
                break L16;
              } else {
                break L17;
              }
            }
          }
          L18: {
            L19: {
              if (pc.field_b != param3) {
                break L19;
              } else {
                if (lb.field_m != param0) {
                  break L19;
                } else {
                  var10 = tg.field_d;
                  var11 = hf.field_b;
                  break L18;
                }
              }
            }
            var10 = pc.field_b;
            var11 = lb.field_m;
            break L18;
          }
          L20: {
            if (fl.field_c[var10][var11] == 16) {
              break L20;
            } else {
              if (fl.field_c[var10][var11] != 29) {
                break L16;
              } else {
                break L20;
              }
            }
          }
          L21: {
            if ((ge.field_a[param2] ^ -1) >= -1) {
              break L21;
            } else {
              if (0 >= lh.field_e[4 + var10 * 4][4 * var11]) {
                qg.field_a[param2] = 16 + 16 * var10;
                dh.field_b[param2] = var11 * 16;
                fh.a((byte) 89, uh.field_s, 100, 63);
                break L21;
              } else {
                break L21;
              }
            }
          }
          if (0 <= ge.field_a[param2]) {
            break L16;
          } else {
            if (-1 > (lh.field_e[var10 * 4 - 1][4 * var11] ^ -1)) {
              break L16;
            } else {
              qg.field_a[param2] = var10 * 16 - 4;
              dh.field_b[param2] = 16 * var11;
              fh.a((byte) 116, uh.field_s, 100, 63);
              break L16;
            }
          }
        }
        L22: {
          L23: {
            if (17 == fl.field_c[param3][param0]) {
              break L23;
            } else {
              if (fl.field_c[param3][param0] != 31) {
                break L22;
              } else {
                break L23;
              }
            }
          }
          cl.field_d[param2] = 1;
          pl.field_f = pl.field_f + 1;
          wi.field_p.a(-121, 100);
          fh.a((byte) 102, nb.field_f, 100, 63);
          break L22;
        }
        L24: {
          if (param1) {
            break L24;
          } else {
            field_K = (ng) null;
            break L24;
          }
        }
        L25: {
          if (fl.field_c[param3][param0] != 19) {
            break L25;
          } else {
            if (-1 == (we.field_c ^ -1)) {
              L26: {
                stackIn_79_0 = 117;

                if (md.field_L < 0) {
                  stackIn_80_0 = stackIn_79_0;
                  stackIn_80_1 = ha.field_o;
                  break L26;
                } else {
                  stackIn_80_0 = stackIn_79_0;
                  stackIn_80_1 = hg.field_k;
                  break L26;
                }
              }
              fh.a((byte) stackIn_80_0, stackIn_80_1, 100, 63);
              ue.field_d = -ue.field_d;
              md.field_L = -md.field_L;
              we.field_c = 3;
              db.field_H = 4 - db.field_H;
              if (-3 >= (param4 ^ -1)) {
                break L25;
              } else {
                ge.field_a[param2] = -ge.field_a[param2];
                break L25;
              }
            } else {
              break L25;
            }
          }
        }
        L27: {
          if (fl.field_c[param3][param0] != 21) {
            break L27;
          } else {
            if (param4 < 2) {
              fh.a((byte) -102, fg.field_l, 100, 63);
              fl.field_c[param3][param0] = (char)0;
              this.a((byte) -115, param0, param3);
              ge.field_a[param2] = -ge.field_a[param2];
              var8 = 0;
              L28: while (true) {
                if (-5 >= (var8 ^ -1)) {
                  break L27;
                } else {
                  var9 = 0;
                  L29: while (true) {
                    if (var9 >= 4) {
                      var8++;
                      continue L28;
                    } else {
                      lh.field_e[var8 + 4 * param3][4 * param0 + var9] = 0;
                      var9++;
                      continue L29;
                    }
                  }
                }
              }
            } else {
              break L27;
            }
          }
        }
        L30: {
          if (fl.field_c[param3][param0] != 22) {
            break L30;
          } else {
            if (2 != param4) {
              break L30;
            } else {
              fl.field_c[param3][param0] = (char)26;
              rf.field_e[gh.field_q] = param3;
              hf.field_d[gh.field_q] = param0;
              wh.field_d[gh.field_q] = param2;
              gh.field_q = gh.field_q + 1;
              break L30;
            }
          }
        }
        L31: {
          if (-24 != (fl.field_c[param3][param0] ^ -1)) {
            break L31;
          } else {
            L32: {
              fh.a((byte) -120, gf.field_g, 100, 63);
              if (15 != tj.field_a) {
                break L32;
              } else {
                if (-1 != (field_E ^ -1)) {
                  break L32;
                } else {
                  hg.a(-25389, 4, 251, tj.field_a);
                  break L32;
                }
              }
            }
            var6 = 0;
            L33: while (true) {
              if (var6 >= 40) {
                break L31;
              } else {
                var7 = 0;
                L34: while (true) {
                  if (var7 >= 21) {
                    var6++;
                    continue L33;
                  } else {
                    L35: {
                      if (23 == fl.field_c[var6][var7]) {
                        break L35;
                      } else {
                        if (fl.field_c[var6][var7] == 20) {
                          break L35;
                        } else {
                          var7++;
                          continue L34;
                        }
                      }
                    }
                    fl.field_c[var6][var7] = (char)0;
                    this.a((byte) -122, var7, var6);
                    var8 = 0;
                    L36: while (true) {
                      if (4 > var8) {
                        var9 = 0;
                        L37: while (true) {
                          if (4 <= var9) {
                            var8++;
                            continue L36;
                          } else {
                            lh.field_e[var8 + var6 * 4][var9 + var7 * 4] = 0;
                            var9++;
                            continue L37;
                          }
                        }
                      } else {
                        var7++;
                        continue L34;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        L38: {
          if (fl.field_c[param3][param0] == 24) {
            fh.a((byte) 117, gf.field_g, 100, 63);
            var6 = 0;
            L39: while (true) {
              if (40 <= var6) {
                break L38;
              } else {
                var7 = 0;
                L40: while (true) {
                  if (21 <= var7) {
                    var6++;
                    continue L39;
                  } else {
                    L41: {
                      if ((fl.field_c[var6][var7] ^ -1) == -25) {
                        fl.field_c[var6][var7] = (char)0;
                        this.a((byte) -109, var7, var6);
                        var8 = 0;
                        L42: while (true) {
                          if (var8 >= 4) {
                            break L41;
                          } else {
                            var9 = 0;
                            L43: while (true) {
                              if (4 <= var9) {
                                var8++;
                                continue L42;
                              } else {
                                lh.field_e[var6 * 4 + var8][var7 * 4 - -var9] = 0;
                                var9++;
                                continue L43;
                              }
                            }
                          }
                        }
                      } else {
                        break L41;
                      }
                    }
                    if (-19 == (fl.field_c[var6][var7] ^ -1)) {
                      fl.field_c[var6][var7] = (char)2;
                      this.a((byte) -99, var7, var6);
                      var8 = 0;
                      L44: while (true) {
                        if (-5 < (var8 ^ -1)) {
                          var9 = 0;
                          L45: while (true) {
                            if ((var9 ^ -1) <= -5) {
                              var8++;
                              continue L44;
                            } else {
                              lh.field_e[var6 * 4 + var8][var7 * 4 + var9] = 1;
                              var9++;
                              continue L45;
                            }
                          }
                        } else {
                          var7++;
                          continue L40;
                        }
                      }
                    } else {
                      var7++;
                      continue L40;
                    }
                  }
                }
              }
            }
          } else {
            break L38;
          }
        }
        L46: {
          if (-26 != (fl.field_c[param3][param0] ^ -1)) {
            break L46;
          } else {
            L47: {
              L48: {
                if (-4 == (param4 ^ -1)) {
                  break L48;
                } else {
                  if (-2 == (md.field_L ^ -1)) {
                    break L47;
                  } else {
                    break L48;
                  }
                }
              }
              if (-2 == (param4 ^ -1)) {
                break L46;
              } else {
                if (-1 != md.field_L) {
                  break L46;
                } else {
                  break L47;
                }
              }
            }
            cl.field_d[param2] = 1;
            fh.a((byte) 87, kc.field_e, 100, 63);
            break L46;
          }
        }
    }

    final void b(byte param0) {
        hl.g(0);
        if (null != rh.field_p) {
            lh.a(false);
        }
        if (param0 != -61) {
            return;
        }
        hh.a(param0 ^ -62);
    }

    private final void g(byte param0) {
        int[] array$2 = null;
        int[] array$3 = null;
        dd[] array$4 = null;
        dd[] array$5 = null;
        dd dupTemp$6 = null;
        dd dupTemp$7 = null;
        int[][] var2;
        int var3;
        int var4_int;
        int var5;
        int var17;
        int[][] var18;
        int[][] var21;
        int[][] var22;
        int[][] var26;
        int[][] var27;
        dd[] var4;
        int var6;
        int var7;
        dd var8;
        int var8_int;
        dd[] var9;
        dd[] var10;
        int var11;
        int var12;
        vg var13;
        vg var14;
        int var15_int;
        el var15;
        el var16;
        int[][] var19;
        int var20;
        int[][] var23;
        int[][] var24;
        int[][] var28;
        int[][] var29;
        int[] var32;
        var17 = field_A ? 1 : 0;
        aj.field_t = of.a("blocks", "", hm.field_g, 89);
        el.field_s = of.a("fleas", "", hm.field_g, 67);
        var3 = -24 % ((-43 - param0) / 62);
        lh.field_b = (fa) ((Object) tc.a(de.field_h, "squarish16", hm.field_g, (byte) 120, ""));
        var26 = new int[2][];
        var21 = var26;
        var18 = var21;
        var27 = var18;
        var22 = var27;
        var2 = var22;
        var18[0] = ((dj) ((Object) lh.field_b)).field_P[0];
        int[] array$1 = new int[var26[0].length];
        var18[1] = array$1;
        var4_int = 1;
        L0: while (true) {
          if (var4_int >= 2) {
            ((dj) ((Object) lh.field_b)).field_P = var2;
            tl.field_p = (fa) ((Object) tc.a(de.field_h, "fleafont_filled", hm.field_g, (byte) 115, ""));
            var28 = new int[4][];
            var23 = var28;
            var19 = var23;
            var29 = var19;
            var24 = var29;
            var2 = var24;
            var19[0] = ((dj) ((Object) tl.field_p)).field_P[0];
            array$2 = new int[var28[0].length];
            var19[1] = array$2;
            array$3 = new int[var28[0].length];
            var19[2] = array$3;
            var4_int = 1;
            L1: while (true) {
              if (3 <= var4_int) {
                se.field_a = new dd[3];
                ((dj) ((Object) tl.field_p)).field_P = var2;
                se.field_a[0] = kl.a(252, hm.field_g, "", "texture_1");
                se.field_a[1] = kl.a(252, hm.field_g, "", "texture_3");
                se.field_a[2] = kl.a(252, hm.field_g, "", "texture_5");
                si.field_C = kl.a(252, hm.field_g, "", "main_background");
                qi.field_c = kl.a(252, hm.field_g, "", "back_background");
                nc.field_d = kl.a(252, hm.field_g, "", "ingame_back");
                kl.a(252, hm.field_g, "", "ingame_banner");
                jj.field_P = kl.a(252, hm.field_g, "", "ingame_title");
                var4 = new dd[aj.field_t.length + 1];
                var5 = 0;
                L2: while (true) {
                  if (aj.field_t.length <= var5) {
                    var4[32] = kl.a(252, hm.field_g, "", "block_water");
                    aj.field_t = var4;
                    be.field_c = kl.a(252, hm.field_g, "", "level_select_arrow");
                    tk.field_m = kl.a(252, hm.field_g, "", "level_select_arrow_pressed");
                    ad.field_b = fc.a(hm.field_g, "level_select_frame", "", (byte) 61);
                    pf.field_a = kl.a(252, hm.field_g, "", "level_select_preview_frame");
                    pa.field_n = kl.a(252, hm.field_g, "", "level_select_slider_tab");
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
                    qa.field_l = hm.a("checkbox_value_1", hm.field_g, (byte) -13, "");
                    ai.field_n = of.a("countdown", "", hm.field_g, 103);
                    ji.field_f = new dd[ai.field_n.length];
                    var5 = ai.field_n.length - 1;
                    L3: while (true) {
                      if (var5 < 0) {
                        gi.field_b.a((byte) 125);
                        var5 = gb.field_d;
                        var6 = gb.field_k;
                        var32 = gb.field_a;
                        var8 = new dd(640, 480);
                        var8.f();
                        qi.field_c.d(0, 0, gb.field_d, gb.field_k);
                        gb.h(5, 5, 0, 0, gb.field_d, gb.field_k);
                        qi.field_c = var8;
                        gb.a(var32, var5, var6);
                        ca.field_P = kl.a(252, hm.field_g, "", "explosion");
                        il.field_d = of.a("achievementicons", "", hm.field_g, 103);
                        var9 = new dd[3];
                        var10 = new dd[3];
                        var9[0] = kl.a(252, hm.field_g, "", "ingame_background_1");
                        var9[1] = kl.a(252, hm.field_g, "", "ingame_background_2");
                        var9[2] = kl.a(252, hm.field_g, "", "ingame_background_3");
                        var11 = 0;
                        L4: while (true) {
                          if (-4 >= (var11 ^ -1)) {
                            gi.field_b.a((byte) 111);
                            nl.field_c = new dd[2][];
                            array$4 = new dd[pl.field_l[0]];
                            nl.field_c[0] = array$4;
                            array$5 = new dd[pl.field_l[1]];
                            nl.field_c[1] = array$5;
                            var11 = 0;
                            L5: while (true) {
                              if (-11 >= (var11 ^ -1)) {
                                var11 = 10;
                                L6: while (true) {
                                  if (20 <= var11) {
                                    var11 = 20;
                                    L7: while (true) {
                                      if (var11 >= nl.field_c[1].length) {
                                        var11 = 0;
                                        L8: while (true) {
                                          if (-15 >= (var11 ^ -1)) {
                                            var11 = 14;
                                            L9: while (true) {
                                              if (28 <= var11) {
                                                var11 = 28;
                                                L10: while (true) {
                                                  if (var11 >= nl.field_c[0].length) {
                                                    je.field_O = new dd[6];
                                                    je.field_O[0] = kl.a(252, hm.field_g, "", "menu_character_1");
                                                    je.field_O[1] = kl.a(252, hm.field_g, "", "menu_character_2");
                                                    je.field_O[2] = kl.a(252, hm.field_g, "", "menu_character_3");
                                                    je.field_O[3] = kl.a(252, hm.field_g, "", "menu_character_4");
                                                    je.field_O[4] = kl.a(252, hm.field_g, "", "menu_character_5");
                                                    je.field_O[5] = kl.a(252, hm.field_g, "", "menu_character_6");
                                                    dupTemp$6 = je.field_O[0];
                                                    dupTemp$6.field_v = dupTemp$6.field_v - 200;
                                                    dupTemp$7 = je.field_O[1];
                                                    dupTemp$7.field_v = dupTemp$7.field_v - 200;
                                                    pd.field_k = fc.a(hm.field_g, "frame", "", (byte) 61);
                                                    gj.field_E = fc.a(hm.field_g, "frame_bright", "", (byte) 61);
                                                    ta.field_z = fc.a(hm.field_g, "button_frame", "", (byte) 61);
                                                    a.field_b = fc.a(hm.field_g, "button_raised", "", (byte) 61);
                                                    ud.b((byte) 47);
                                                    var11 = tl.field_p.field_N;
                                                    vb.field_a = new dd(var11, var11);
                                                    vb.field_a.f();
                                                    td.field_m.a(0, 0, var11, var11);
                                                    td.field_m = null;
                                                    gi.field_b.a((byte) 109);
                                                    var12 = 10 * tl.field_p.field_N;
                                                    rh.field_c = new ik(45, -(var12 / 2) + 250, 340, var12, tl.field_p, be.field_c, tk.field_m, pa.field_n, rb.field_G);
                                                    rh.field_c.field_Q = -16777216;
                                                    rh.field_c.field_r = -1862275584;
                                                    rh.field_c.field_F = -2241536;
                                                    rh.field_c.field_H = -16777214;
                                                    rh.field_c.field_u = 134217728;
                                                    rh.field_c.field_s = 0;
                                                    rh.field_c.field_w = 553648127;
                                                    rh.field_c.field_O = -1593901056;
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
                                                    ol.field_f = new rk(wd.field_a.field_l, 420, gl.field_m, qa.field_l, bb.field_H, lh.field_b);
                                                    ol.field_f.field_t = fl.field_f;
                                                    var15_int = ob.field_c.length - 1;
                                                    L11: while (true) {
                                                      if ((var15_int ^ -1) > -1) {
                                                        var20 = -1 + ej.field_a.length;
                                                        var15_int = var20;
                                                        L12: while (true) {
                                                          if ((var20 ^ -1) > -1) {
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
                                                            var15 = f.field_G;
                                                            var15.field_t = 256;
                                                            var16 = cb.field_w;
                                                            cb.field_w.field_A = 256;
                                                            var16.field_t = 256;
                                                            f.field_G.field_r = true;
                                                            hm.field_g = null;
                                                            cb.field_w.field_r = true;
                                                            return;
                                                          } else {
                                                            ej.field_a[var20] = new ok(320, 240, kl.field_a[var20], ve.field_d);
                                                            ej.field_a[var20].field_J = 100;
                                                            var20--;
                                                            continue L12;
                                                          }
                                                        }
                                                      } else {
                                                        ob.field_c[var15_int] = new ok(-1000, -1000, qg.field_d[var15_int], ve.field_d);
                                                        var15_int--;
                                                        continue L11;
                                                      }
                                                    }
                                                  } else {
                                                    nl.field_c[0][var11] = var10[2];
                                                    var11++;
                                                    continue L10;
                                                  }
                                                }
                                              } else {
                                                nl.field_c[0][var11] = var10[1];
                                                var11++;
                                                continue L9;
                                              }
                                            }
                                          } else {
                                            nl.field_c[0][var11] = var10[0];
                                            var11++;
                                            continue L8;
                                          }
                                        }
                                      } else {
                                        nl.field_c[1][var11] = var10[2];
                                        var11++;
                                        continue L7;
                                      }
                                    }
                                  } else {
                                    nl.field_c[1][var11] = var10[1];
                                    var11++;
                                    continue L6;
                                  }
                                }
                              } else {
                                nl.field_c[1][var11] = var10[0];
                                var11++;
                                continue L5;
                              }
                            }
                          } else {
                            var10[var11] = new dd(640, 350);
                            var10[var11].f();
                            var9[var11].d(0, 0, gb.field_d, gb.field_k);
                            gb.h(2, 2, 0, 0, gb.field_d, gb.field_k);
                            gb.d(0, 0, gb.field_d, gb.field_k);
                            var11++;
                            continue L4;
                          }
                        }
                      } else {
                        ji.field_f[var5] = ai.field_n[var5].c();
                        ji.field_f[var5].a();
                        ji.field_f[var5].f();
                        gb.h(5, 1, 0, 0, gb.field_d, gb.field_k);
                        var5--;
                        continue L3;
                      }
                    }
                  } else {
                    var4[var5] = aj.field_t[var5];
                    var5++;
                    continue L2;
                  }
                }
              } else {
                var5 = 0;
                L13: while (true) {
                  if (var5 >= var29[var4_int].length) {
                    var4_int++;
                    continue L1;
                  } else {
                    if (var5 < 3) {
                      var29[var4_int][var5] = var29[0][var5];
                      var5++;
                      continue L13;
                    } else {
                      if (1 != var4_int) {
                        if (var4_int == 2) {
                          var6 = var29[0][var5] >> 129444080 & 255;
                          var7 = (65376 & var29[0][var5]) >> 977946344;
                          var8_int = var29[0][var5] & 255;
                          var29[var4_int][var5] = ne.a(var8_int / 2, ne.a(var6 / 2 << -1579543472, var7 / 2 << -215758840));
                          var5++;
                          continue L13;
                        } else {
                          var5++;
                          continue L13;
                        }
                      } else {
                        var29[var4_int][var5] = 16777215;
                        var5++;
                        continue L13;
                      }
                    }
                  }
                }
              }
            }
          } else {
            var5 = 0;
            L14: while (true) {
              if (var27[var4_int].length <= var5) {
                var4_int++;
                continue L0;
              } else {
                if (3 > var5) {
                  var27[var4_int][var5] = var27[0][var5];
                  var5++;
                  continue L14;
                } else {
                  var27[var4_int][var5] = 1;
                  var5++;
                  continue L14;
                }
              }
            }
          }
        }
    }

    final void d(boolean param0) {
        Object stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_41_0 = 0;
        Object var2;
        int var3;
        int var4;
        L0: {
          var4 = field_A ? 1 : 0;
          if (null != rh.field_p) {
            stackIn_3_0 = rh.field_p;
            break L0;
          } else {
            stackIn_3_0 = ol.field_e;
            break L0;
          }
        }
        var2 = stackIn_3_0;
        if (!mc.b((byte) 123)) {
          if (!md.field_T) {
            bg.a((byte) -75, (java.awt.Canvas) (var2));
            return;
          } else {
            if (td.d(-89)) {
              L1: {
                if (bc.field_V == ab.field_b) {
                  if (-1 != ab.field_b) {
                    pi.field_b[ab.field_b].f(2);
                    break L1;
                  } else {
                    fc.c(126);
                    break L1;
                  }
                } else {
                  if (-17 < (af.field_g ^ -1)) {
                    L2: {
                      if ((ab.field_b ^ -1) != 0) {
                        pi.field_b[ab.field_b].f(2);
                        break L2;
                      } else {
                        fc.c(-21);
                        break L2;
                      }
                    }
                    L3: {
                      var3 = 1 + af.field_g;
                      var3 = var3 * 16;
                      if (-256 > (var3 ^ -1)) {
                        var3 = 255;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    gb.g(0, 0, 640, 480, 1, var3);
                    break L1;
                  } else {
                    L4: {
                      if (-17 != (af.field_g ^ -1)) {
                        break L4;
                      } else {
                        if ((bc.field_V ^ -1) != -11) {
                          break L4;
                        } else {
                          fh.a((byte) 114, jd.field_q, 100, 63);
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (3 != ab.field_b) {
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      if (-1 != bc.field_V) {
                        pi.field_b[bc.field_V].f(2);
                        break L6;
                      } else {
                        fc.c(126);
                        break L6;
                      }
                    }
                    L7: {
                      var3 = -af.field_g + 32 + 1;
                      var3 = var3 * 16;
                      if (-256 > (var3 ^ -1)) {
                        var3 = 255;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    gb.g(0, 0, 640, 480, 1, var3);
                    break L1;
                  }
                }
              }
              L8: {
                if (hi.a((byte) -72)) {
                  gb.d(0, 0, gb.field_d, gb.field_k);
                  lf.a(pd.field_k, pd.field_k[0].field_w, pd.field_k[0].field_t, (byte) 100);
                  break L8;
                } else {
                  if (!uk.b(15000)) {
                    break L8;
                  } else {
                    L9: {
                      if (rh.field_p == null) {
                        stackIn_41_0 = ha.field_k ? 1 : 0;
                        break L9;
                      } else {
                        stackIn_41_0 = 1;
                        break L9;
                      }
                    }
                    dh.a(stackIn_41_0 != 0, (byte) 121);
                    break L8;
                  }
                }
              }
              L10: {
                if (vk.field_L == 0) {
                  break L10;
                } else {
                  var3 = af.field_g * 256 / 32;
                  if (-1 <= (var3 ^ -1)) {
                    break L10;
                  } else {
                    gb.g(0, 0, gb.field_d, gb.field_k, 0, var3);
                    break L10;
                  }
                }
              }
              L11: {
                if ((qe.field_k ^ -1) <= -3) {
                  ve.field_d.b("FPS: " + ak.field_c, 640, 480, 255, 16776960);
                  break L11;
                } else {
                  break L11;
                }
              }
              ul.c(param0);
              be.a(0, (java.awt.Canvas) (var2), (byte) -127, 0);
              return;
            } else {
              jj.a(100.0f, li.field_h, true);
              bg.a((byte) -104, (java.awt.Canvas) (var2));
              return;
            }
          }
        } else {
          L12: {
            stackIn_6_0 = var2;

            if (null == rh.field_p) {
              stackIn_7_0 = stackIn_6_0;
              stackIn_7_1 = ha.field_k ? 1 : 0;
              break L12;
            } else {
              stackIn_7_0 = stackIn_6_0;
              stackIn_7_1 = 1;
              break L12;
            }
          }
          af.a((java.awt.Canvas) ((Object) stackIn_7_0), stackIn_7_1 != 0, param0);
          return;
        }
    }

    final void a(int param0) {
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
        wb.i(param0 + 0);
        h.c(param0 ^ 55);
        cd.c(true);
        rd.a((byte) -19);
        jg.a(param0 ^ 107);
        gb.a();
        rh.c((byte) -110);
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
        wj.a(param0 + -95);
        uc.c((byte) -118);
        of.b(71);
        vb.a(-29039);
        va.b((byte) 126);
        ng.a(0);
        w.c(5);
        af.a(105);
        uf.a(true);
        k.a(-40);
        td.a(123167272);
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
        lh.b(1);
        hc.c((byte) 87);
        tk.a(param0 ^ 93);
        fd.e();
        gl.a((byte) 112);
        la.b();
        th.b(false);
        tj.a(false);
        pl.f(param0 + 1);
        sa.a((byte) 33);
        ue.a(param0 + -6617886);
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
        pa.d(-6);
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
        pc.c(param0 + -119);
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
        qa.d(0);
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
        li.a((byte) -112);
        wf.a(0);
        cb.f(param0 ^ 67);
        pj.h(-103);
        jk.c(28);
        a.a((byte) 126);
        na.b(105);
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
        jc.a(param0 + -36);
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
    }

    final static void h(byte param0) {
        int var1_int = 0;
        int var3 = field_A ? 1 : 0;
        try {
            l.field_b.c(12445);
            for (var1_int = 0; var1_int < 32; var1_int++) {
                bh.field_q[var1_int] = 0L;
            }
            int var2 = -69 / ((param0 - -16) / 46);
            for (var1_int = 0; var1_int < 32; var1_int++) {
                ub.field_c[var1_int] = 0L;
            }
            w.field_r = 0;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "fleas.C(" + param0 + ')');
        }
    }

    private final boolean b(boolean param0, int param1) {
        kh[] array$0 = null;
        kh[] array$1 = null;
        Object stackIn_67_0 = null;
        byte[] stackIn_67_1 = null;
        int var3;
        byte[] var3_ref_byte__;
        String var4_ref_String;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        ih var11;
        byte[] var12;
        byte[] var13;
        byte[] var14;
        var10 = field_A ? 1 : 0;
        ei.b(true);
        if (null == pb.field_a) {
          if (null == ib.field_f) {
            if (jc.field_e != null) {
              jj.a(65.0f, cb.field_q, true);
              this.d(true);
              td.field_j = wk.a(jc.field_e, "", "Flea Circus Titlescreen");
              gg.field_h.a(field_K, ob.field_d, 11498, 0, td.field_j);
              hf.field_e[0] = wk.a(jc.field_e, "", "Flea Circus 1");
              hf.field_e[1] = wk.a(jc.field_e, "", "Flea Circus 2");
              hf.field_e[2] = wk.a(jc.field_e, "", "Flea Circus 3");
              var3 = 0;
              L0: while (true) {
                if (var3 >= 3) {
                  field_K = null;
                  ob.field_d = null;
                  jc.field_e = null;
                  fleas.h((byte) -114);
                  return false;
                } else {
                  gg.field_h.a(field_K, ob.field_d, 11498, 0, hf.field_e[var3]);
                  var3++;
                  continue L0;
                }
              }
            } else {
              if (null == a.field_a) {
                if (hm.field_g != null) {
                  jj.a(72.0f, f.field_H, true);
                  this.d(true);
                  this.g((byte) -111);
                  de.field_h = null;
                  hm.field_g = null;
                  fleas.h((byte) -116);
                  return false;
                } else {
                  if (pa.field_l != null) {
                    jj.a(98.0f, vi.field_c, true);
                    this.d(true);
                    var5 = pl.field_l[0];
                    array$0 = new kh[var5];
                    ia.field_m[0] = array$0;
                    var6 = 0;
                    L1: while (true) {
                      if (var5 <= var6) {
                        var5 = pl.field_l[1];
                        array$1 = new kh[var5];
                        ia.field_m[1] = array$1;
                        var6 = 0;
                        L2: while (true) {
                          if (var6 >= var5) {
                            var6 = 0;
                            L3: while (true) {
                              if (var6 >= 50) {
                                pa.field_l = null;
                                jk.field_l = 2;
                                tj.field_a = 0;
                                fleas.h((byte) -72);
                                return false;
                              } else {
                                th.field_v[var6] = new dd(20, 20);
                                ff.field_b[var6] = new dd(20, 20);
                                var6++;
                                continue L3;
                              }
                            }
                          } else {
                            var4_ref_String = "classic_" + (1 + var6) + ".lvl";
                            var3_ref_byte__ = pa.field_l.a(0, var4_ref_String, "");
                            stackIn_67_0 = null;
                            stackIn_67_1 = (byte[]) (var3_ref_byte__);
                            if (stackIn_67_0 != stackIn_67_1) {
                              ia.field_m[1][var6] = new kh(var3_ref_byte__);
                              var6++;
                              continue L2;
                            } else {
                              var6++;
                              continue L2;
                            }
                          }
                        }
                      } else {
                        var4_ref_String = 1 + var6 + ".lvl";
                        var14 = pa.field_l.a(0, var4_ref_String, "");
                        var13 = var14;
                        var12 = var13;
                        var3_ref_byte__ = var12;
                        if (null != var3_ref_byte__) {
                          ia.field_m[0][var6] = new kh(var14);
                          var6++;
                          continue L1;
                        } else {
                          var6++;
                          continue L1;
                        }
                      }
                    }
                  } else {
                    var3 = 0;
                    L4: while (true) {
                      if ((var3 ^ -1) <= -12) {
                        L5: {
                          ab.field_b = 0;
                          k.a(0, td.field_j);
                          var3 = 3072;
                          var4 = 30;
                          var5 = 15;
                          var6 = 10;
                          var7 = -2;
                          if (param1 > 0) {
                            break L5;
                          } else {
                            var11 = (ih) null;
                            fleas.a((ih) null, -35);
                            break L5;
                          }
                        }
                        var8 = this.field_C.field_w + -20;
                        var9 = this.field_C.field_t - 20;
                        rb.a(var5, var6, var9, this.field_C, var8, var3, (byte) 125, var4, var7);
                        ue.a((byte) -122, this.field_N);
                        mc.a(this.field_D, ih.field_m, 0);
                        pa.a(false, jj.field_P);
                        el.a((java.applet.Applet) (this), 150, (byte) 44, 15488514, jd.field_g, 1052688);
                        we.a(50, 106);
                        qb.a(50, 114);
                        fleas.h((byte) -71);
                        return true;
                      } else {
                        pi.field_b[var3] = new t(var3);
                        var3++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                jj.a(70.0f, f.field_H, true);
                this.d(true);
                cb.field_u = kl.a(252, a.field_a, "basic", "unachieved");
                td.field_m = kl.a(252, a.field_a, "basic", "orbcoin");
                em.a(td.field_m, (byte) -85);
                mf.field_g = kl.a(252, a.field_a, "basic", "locked");
                ve.field_d = (fa) ((Object) ub.a("roman12", a.field_a, "", pf.field_b, 32));
                lk.field_Q = (fa) ((Object) ub.a("roman20", a.field_a, "", pf.field_b, 32));
                a.field_a = null;
                fleas.h((byte) 33);
                return false;
              }
            }
          } else {
            jj.a(60.0f, ri.field_s, true);
            this.d(true);
            wi.b(-14277);
            ib.field_f = null;
            fleas.h((byte) 76);
            return false;
          }
        } else {
          L6: {
            if (!a.field_a.b((byte) -100)) {
              break L6;
            } else {
              if (!a.field_a.a("basic", -116)) {
                break L6;
              } else {
                if (!a.field_a.a("roman12", -112)) {
                  break L6;
                } else {
                  if (a.field_a.a("roman20", -113)) {
                    L7: {
                      if (!pb.field_a.b((byte) -110)) {
                        break L7;
                      } else {
                        if (pb.field_a.a(-116)) {
                          L8: {
                            if (!ib.field_f.b((byte) -125)) {
                              break L8;
                            } else {
                              if (!ib.field_f.a(-128)) {
                                break L8;
                              } else {
                                L9: {
                                  if (!pa.field_l.b((byte) -102)) {
                                    break L9;
                                  } else {
                                    if (!pa.field_l.a(-22)) {
                                      break L9;
                                    } else {
                                      L10: {
                                        if (!ob.field_d.b((byte) -108)) {
                                          break L10;
                                        } else {
                                          if (!ob.field_d.a(-72)) {
                                            break L10;
                                          } else {
                                            L11: {
                                              if (!jc.field_e.b((byte) -104)) {
                                                break L11;
                                              } else {
                                                if (!jc.field_e.a(-36)) {
                                                  break L11;
                                                } else {
                                                  L12: {
                                                    if (!hm.field_g.b((byte) -124)) {
                                                      break L12;
                                                    } else {
                                                      if (hm.field_g.a(-76)) {
                                                        L13: {
                                                          if (!de.field_h.b((byte) -122)) {
                                                            break L13;
                                                          } else {
                                                            if (!de.field_h.a(-54)) {
                                                              break L13;
                                                            } else {
                                                              L14: {
                                                                if (!pf.field_b.b((byte) -106)) {
                                                                  break L14;
                                                                } else {
                                                                  if (!pf.field_b.a("roman12", -106)) {
                                                                    break L14;
                                                                  } else {
                                                                    if (!pf.field_b.a("roman20", -118)) {
                                                                      break L14;
                                                                    } else {
                                                                      jj.a(55.0f, ri.field_s, true);
                                                                      if (!param0) {
                                                                        return false;
                                                                      } else {
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
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                              jj.a(31.0f, sa.a(pf.field_b, "roman12", de.field_j, rg.field_q, (byte) 46), true);
                                                              return false;
                                                            }
                                                          }
                                                        }
                                                        jj.a(30.0f, sa.a(de.field_h, "", de.field_j, rg.field_q, (byte) 46), true);
                                                        return false;
                                                      } else {
                                                        break L12;
                                                      }
                                                    }
                                                  }
                                                  jj.a(25.0f, sa.a(hm.field_g, "", bf.field_f, li.field_e, (byte) 46), true);
                                                  return false;
                                                }
                                              }
                                            }
                                            jj.a(20.0f, sa.a(jc.field_e, "", tj.field_b, mi.field_p, (byte) 46), true);
                                            return false;
                                          }
                                        }
                                      }
                                      jj.a(18.0f, re.a((byte) 127, 0, ob.field_d, kk.field_c, cf.field_b), true);
                                      return false;
                                    }
                                  }
                                }
                                jj.a(15.0f, sa.a(pa.field_l, "", gk.field_G, sc.field_c, (byte) 46), true);
                                return false;
                              }
                            }
                          }
                          jj.a(10.0f, sa.a(ib.field_f, "", fk.field_x, vf.field_n, (byte) 46), true);
                          return false;
                        } else {
                          break L7;
                        }
                      }
                    }
                    jj.a(5.0f, sa.a(pb.field_a, "", fk.field_x, vf.field_n, (byte) 46), true);
                    return false;
                  } else {
                    break L6;
                  }
                }
              }
            }
          }
          jj.a(3.0f, sa.a(a.field_a, "basic", bf.field_f, li.field_e, (byte) 46), true);
          return false;
        }
    }

    final void d(int param0) {
        boolean discarded$0 = false;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_109_0 = null;
        int stackIn_109_1 = 0;
        Object stackIn_110_0 = null;
        int stackIn_110_1 = 0;
        int stackIn_110_2 = 0;
        int var2;
        int var3;
        hi var4;
        hi var5;
        L0: {
          var3 = field_A ? 1 : 0;
          ni.field_j = ni.field_j + 1;
          ai.e(-20846);
          if (rh.field_p == null) {
            break L0;
          } else {
            if (!rh.field_p.field_c) {
              break L0;
            } else {
              lh.a(false);
              cm.a((byte) -28);
              break L0;
            }
          }
        }
        L1: {
          stackIn_5_0 = this;

          if (rh.field_p == null) {
            stackIn_6_0 = this;
            stackIn_6_1 = 0;
            break L1;
          } else {
            stackIn_6_0 = this;
            stackIn_6_1 = 1;
            break L1;
          }
        }
        L2: {
          this.b(stackIn_6_1 != 0, (byte) 63);
          if (d.field_Q) {
            this.f(true);
            d.field_Q = false;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (-3 >= (qe.field_k ^ -1)) {
            L4: {
              if (ei.field_H[1]) {
                var2 = -1 + hj.field_a.length;
                L5: while (true) {
                  if ((var2 ^ -1) <= -1) {
                    hj.field_a[var2] = 999;
                    var2--;
                    continue L5;
                  } else {
                    if (!ei.field_H[2]) {
                      break L4;
                    } else {
                      if (0 != (ab.field_b ^ -1)) {
                        break L4;
                      } else {
                        td.b(120);
                        break L4;
                      }
                    }
                  }
                }
              } else {
                if (!ei.field_H[2]) {
                  break L4;
                } else {
                  if (0 != (ab.field_b ^ -1)) {
                    break L4;
                  } else {
                    td.b(120);
                    break L4;
                  }
                }
              }
            }
            if (!ei.field_H[86]) {
              break L3;
            } else {
              L6: {
                if (ei.field_H[16]) {
                  hg.a(-25389, 0, 255, 0);
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (ei.field_H[17]) {
                  hg.a(-25389, 1, 254, 0);
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (!ei.field_H[18]) {
                  break L8;
                } else {
                  hg.a(-25389, 2, 253, 0);
                  break L8;
                }
              }
              L9: {
                if (ei.field_H[19]) {
                  hg.a(-25389, 3, 252, 0);
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (!ei.field_H[20]) {
                  break L10;
                } else {
                  hg.a(param0 + -46823, 4, 251, 0);
                  break L10;
                }
              }
              L11: {
                if (ei.field_H[21]) {
                  hg.a(param0 + -46823, 5, 250, 0);
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (ei.field_H[22]) {
                  hg.a(-25389, 6, 249, 0);
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (ei.field_H[23]) {
                  hg.a(-25389, 7, 248, 0);
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                if (ei.field_H[24]) {
                  hg.a(-25389, 8, 247, 0);
                  break L14;
                } else {
                  break L14;
                }
              }
              L15: {
                if (ei.field_H[25]) {
                  hg.a(param0 + -46823, 9, 246, 0);
                  break L15;
                } else {
                  break L15;
                }
              }
              L16: {
                if (ei.field_H[32]) {
                  hg.a(-25389, 10, 245, 0);
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                if (ei.field_H[33]) {
                  hg.a(-25389, 11, 244, 0);
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                if (ei.field_H[34]) {
                  hg.a(-25389, 12, 243, 0);
                  break L18;
                } else {
                  break L18;
                }
              }
              L19: {
                if (ei.field_H[35]) {
                  hg.a(-25389, 13, 242, 0);
                  break L19;
                } else {
                  break L19;
                }
              }
              L20: {
                if (ei.field_H[36]) {
                  hg.a(param0 + -46823, 14, 241, 0);
                  break L20;
                } else {
                  break L20;
                }
              }
              if (ei.field_H[37]) {
                hg.a(-25389, 15, 240, 0);
                break L3;
              } else {
                break L3;
              }
            }
          } else {
            break L3;
          }
        }
        L21: {
          if (!mc.b((byte) 80)) {
            break L21;
          } else {
            this.f((byte) -124);
            if (!mc.b((byte) -112)) {
              break L21;
            } else {
              L22: {
                if (nl.a(52)) {
                  discarded$0 = this.b(false, 47);
                  break L22;
                } else {
                  break L22;
                }
              }
              return;
            }
          }
        }
        L23: {
          if (param0 == 21434) {
            break L23;
          } else {
            this.field_C = (dd) null;
            break L23;
          }
        }
        L24: {
          L25: {
            if (!md.field_T) {
              te.b(0, al.field_f);
              if (this.b(true, 46)) {
                md.field_T = true;
                break L25;
              } else {
                break L25;
              }
            } else {
              if (td.d(-101)) {
                if (!hi.a((byte) -72)) {
                  if (!uk.b(param0 + -6434)) {
                    this.i((byte) -85);
                    break L25;
                  } else {
                    L26: {
                      stackIn_109_0 = this;

                      stackIn_109_1 = -81;

                      if (rh.field_p == null) {
                        stackIn_110_0 = this;
                        stackIn_110_1 = stackIn_109_1;
                        stackIn_110_2 = 0;
                        break L26;
                      } else {
                        stackIn_110_0 = this;
                        stackIn_110_1 = stackIn_109_1;
                        stackIn_110_2 = 1;
                        break L26;
                      }
                    }
                    L27: {
                      var2 = this.a((byte) stackIn_110_1, stackIn_110_2 != 0);
                      if (1 == var2) {
                        break L27;
                      } else {
                        if (2 == var2) {
                          break L27;
                        } else {
                          break L25;
                        }
                      }
                    }
                    L28: {
                      if (null != rh.field_p) {
                        lh.a(false);
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    if (-3 != (var2 ^ -1)) {
                      break L25;
                    } else {
                      hf.a(rl.a((byte) -110), -52);
                      break L25;
                    }
                  }
                } else {
                  L29: {
                    if (-1 != (vk.field_L ^ -1)) {
                      this.i((byte) -85);
                      break L29;
                    } else {
                      var2 = lk.k(param0 ^ 31053);
                      if (-3 == (var2 ^ -1)) {
                        lh.a(false);
                        break L29;
                      } else {
                        if (3 != var2) {
                          if (4 == var2) {
                            me.a(-2, 0, false);
                            break L29;
                          } else {
                            L30: {
                              if (!hi.a((byte) -72)) {
                                pi.field_b[ab.field_b].a(true, true);
                                break L30;
                              } else {
                                break L30;
                              }
                            }
                            if (!qh.c((byte) 79)) {
                              L31: while (true) {
                                var4 = (hi) ((Object) a.field_e.e(-22033));
                                if (var4 != null) {
                                  bg.a(var4, 4, -90);
                                  continue L31;
                                } else {
                                  break L24;
                                }
                              }
                            } else {
                              break L24;
                            }
                          }
                        } else {
                          c.a(320, (byte) 110, tl.field_p.field_K + tl.field_p.field_y, a.field_b, 8, 2, tl.field_p, ta.field_z, 240, tl.field_p.field_y, true, 8);
                          break L29;
                        }
                      }
                    }
                  }
                  if (!hi.a((byte) -72)) {
                    pi.field_b[ab.field_b].a(true, true);
                    break L25;
                  } else {
                    break L25;
                  }
                }
              } else {
                nb.a(false);
                if (!td.d(-104)) {
                  break L25;
                } else {
                  L32: {
                    wh.a(-98);
                    em.a(param0 + -21512);
                    if (8 != ab.field_b) {
                      break L32;
                    } else {
                      vf.e(-6359);
                      break L32;
                    }
                  }
                  if (ab.field_b != 5) {
                    break L25;
                  } else {
                    if (field_L == 0) {
                      ab.field_b = 2;
                      oa.a(2, false, param0 ^ -21496);
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                }
              }
            }
          }
          if (!qh.c((byte) 79)) {
            L33: while (true) {
              var5 = (hi) ((Object) a.field_e.e(-22033));
              if (var5 != null) {
                bg.a(var5, 4, -90);
                continue L33;
              } else {
                break L24;
              }
            }
          } else {
            break L24;
          }
        }
        L34: while (true) {
          if (!tb.a(-55, ne.field_b)) {
            L35: {
              dk.b((byte) 41, 0);
              if (!lk.i(param0 ^ 21424)) {
                break L35;
              } else {
                var2 = this.e(false);
                if (var2 == 2) {
                  id.a(false);
                  break L35;
                } else {
                  break L35;
                }
              }
            }
            hg.a(-79);
            return;
          } else {
            this.g(-12);
            continue L34;
          }
        }
    }

    private final void i(byte param0) {
        int var3;
        L0: {
          var3 = field_A ? 1 : 0;
          if (0 != vk.field_L) {
            if ((vk.field_L ^ -1) != -2) {
              if (2 == vk.field_L) {
                L1: {
                  if (qh.c((byte) 123)) {
                    ab.field_b = mf.field_c;
                    break L1;
                  } else {
                    L2: {
                      fg.field_x = ed.a(16777215, 4);
                      if (null == wi.field_p) {
                        break L2;
                      } else {
                        wi.field_p.a(param0 + 84);
                        break L2;
                      }
                    }
                    ab.field_b = w.field_l;
                    ml.i(param0 + 14);
                    if (1 != (ab.field_b ^ -1)) {
                      break L1;
                    } else {
                      ab.field_b = 0;
                      c.a(320, (byte) 111, tl.field_p.field_y + tl.field_p.field_K, a.field_b, 8, 2, tl.field_p, ta.field_z, 240, tl.field_p.field_y, false, 8);
                      break L1;
                    }
                  }
                }
                vk.field_L = 3;
                bc.field_V = ab.field_b;
                break L0;
              } else {
                af.field_g = af.field_g - 1;
                if (af.field_g == 0) {
                  vk.field_L = 0;
                  break L0;
                } else {
                  break L0;
                }
              }
            } else {
              af.field_g = af.field_g + 1;
              if (32 == af.field_g) {
                L3: {
                  if (!hi.a((byte) -72)) {
                    qc.a(500);
                    break L3;
                  } else {
                    ml.d((byte) 106);
                    break L3;
                  }
                }
                vk.field_L = 2;
                break L0;
              } else {
                break L0;
              }
            }
          } else {
            if (bc.field_V != ab.field_b) {
              L4: {
                af.field_g = af.field_g + 1;
                if (af.field_g != 16) {
                  break L4;
                } else {
                  if ((ab.field_b ^ -1) != -11) {
                    break L4;
                  } else {
                    td.b(94);
                    break L4;
                  }
                }
              }
              L5: {
                if ((ab.field_b ^ -1) > -1) {
                  break L5;
                } else {
                  pi.field_b[ab.field_b].e(-400);
                  break L5;
                }
              }
              if ((af.field_g ^ -1) == -33) {
                L6: {
                  if ((ab.field_b ^ -1) != -3) {
                    break L6;
                  } else {
                    m.field_b = null;
                    break L6;
                  }
                }
                ab.field_b = bc.field_V;
                af.field_g = 0;
                break L0;
              } else {
                break L0;
              }
            } else {
              if (0 != (ab.field_b ^ -1)) {
                pi.field_b[ab.field_b].a((byte) 26);
                break L0;
              } else {
                this.l(param0 + 212);
                break L0;
              }
            }
          }
        }
        L7: {
          if (param0 == -85) {
            break L7;
          } else {
            field_L = 71;
            break L7;
          }
        }
    }

    private final void f(boolean param0) {
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
        pa.field_l = q.a(8192, 3);
        ib.field_f = q.a(8192, 4);
        ob.field_d = q.a(8192, 5);
        jc.field_e = q.a(8192, 6);
        de.field_h = q.a(8192, 7);
        if (!(0 != cg.field_y)) {
            ei.b(true);
        }
        bc.a(pf.field_b, 1, a.field_a);
    }

    private final void a(byte param0, int param1, int param2) {
        bm.e((byte) 31);
        if (param0 > -47) {
            fleas.h((byte) -92);
        }
    }

    final static void a(int param0, vh param1, int param2) {
        ih var3 = ud.field_b;
        var3.e(8, param0);
        if (param2 != 2) {
            return;
        }
        try {
            var3.a(-11, param1.field_n);
            var3.b((byte) 76, param1.field_m);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "fleas.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void j(byte param0) {
        ci var4 = new ci(22050, la.field_a);
        ic.field_ab = qf.a(pb.field_a, "", "FLEA_drops").b().a(var4);
        fi.field_n = qf.a(pb.field_a, "", "FLEA_flea_die").b().a(var4);
        nb.field_f = qf.a(pb.field_a, "", "FLEA_escape").b().a(var4);
        rl.field_g = qf.a(pb.field_a, "", "FLEA_placeblock").b().a(var4);
        el.field_C = qf.a(pb.field_a, "", "FLEA_placeramp").b().a(var4);
        ih.field_l = qf.a(pb.field_a, "", "FLEA_balloon").b().a(var4);
        int var3 = 36 / ((-23 - param0) / 33);
        hg.field_n = qf.a(pb.field_a, "", "FLEA_land").b().a(var4);
        me.field_k = qf.a(pb.field_a, "", "FLEA_spring").b().a(var4);
        bf.field_d = qf.a(pb.field_a, "", "FLEA_spinplatform").b().a(var4);
        ab.field_a = qf.a(pb.field_a, "", "FLEA_bomb").b().a(var4);
        ah.field_a = qf.a(pb.field_a, "", "FLEA_drowning").b().a(var4);
        rh.field_n = qf.a(pb.field_a, "", "FLEA_fanloop").b().a(var4);
        hi.field_p = qf.a(pb.field_a, "", "FLEA_spider").b().a(var4);
        uh.field_s = qf.a(pb.field_a, "", "FLEA_teleport_in").b().a(var4);
        gi.field_d = qf.a(pb.field_a, "", "FLEA_noplace").b().a(var4);
        hg.field_k = qf.a(pb.field_a, "", "FLEA_gravity_up").b().a(var4);
        ha.field_o = qf.a(pb.field_a, "", "FLEA_gravity_down").b().a(var4);
        gf.field_g = qf.a(pb.field_a, "", "FLEA_switch").b().a(var4);
        fg.field_l = qf.a(pb.field_a, "", "FLEA_crumble").b().a(var4);
        hf.field_g = qf.a(pb.field_a, "", "FLEA_bridgecollapse").b().a(var4);
        kc.field_e = qf.a(pb.field_a, "", "FLEA_death").b().a(var4);
        pb.field_a = null;
        oj.field_i = ie.a(rh.field_n, 100, 0);
        oj.field_i.g(-1);
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
        ei.b(true);
    }

    public final void init() {
        this.a(12, 8, "fleacircus");
    }

    private final void b(int param0, int param1, int param2) {
        int stackIn_25_0 = 0;
        int stackIn_26_0 = 0;
        sf stackIn_26_1 = null;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        var8 = field_A ? 1 : 0;
        if (param0 < -90) {
          L0: {
            if ((param1 ^ -1) <= -339) {
              break L0;
            } else {
              if (-3 < (param1 ^ -1)) {
                break L0;
              } else {
                if (2 > param2) {
                  break L0;
                } else {
                  if (-643 >= (param2 ^ -1)) {
                    break L0;
                  } else {
                    var4 = param2 / 16;
                    var5 = param1 / 16;
                    var7 = 4 * var5;
                    var6 = var4 * 4;
                    if ((var4 ^ -1) > -1) {
                      return;
                    } else {
                      L1: {
                        if (0 > var5) {
                          break L1;
                        } else {
                          if (40 <= var4) {
                            break L1;
                          } else {
                            if (-22 >= (var5 ^ -1)) {
                              break L1;
                            } else {
                              param2 = var6;
                              L2: while (true) {
                                if (param2 >= var6 - -4) {
                                  L3: {
                                    stackIn_25_0 = -109;

                                    if (mh.field_u != 1) {
                                      stackIn_26_0 = stackIn_25_0;
                                      stackIn_26_1 = el.field_C;
                                      break L3;
                                    } else {
                                      stackIn_26_0 = stackIn_25_0;
                                      stackIn_26_1 = rl.field_g;
                                      break L3;
                                    }
                                  }
                                  fh.a((byte) stackIn_26_0, stackIn_26_1, 100, 63);
                                  ik.field_R = false;
                                  fl.field_c[var4][var5] = (char)(1 + mh.field_u);
                                  this.a((byte) -91, var5, var4);
                                  param2 = var6;
                                  L4: while (true) {
                                    if (param2 >= 4 + var6) {
                                      break L0;
                                    } else {
                                      param1 = var7;
                                      L5: while (true) {
                                        if (var7 - -4 <= param1) {
                                          param2++;
                                          continue L4;
                                        } else {
                                          L6: {
                                            if (-2 == (mh.field_u ^ -1)) {
                                              lh.field_e[param2][param1] = 1;
                                              break L6;
                                            } else {
                                              break L6;
                                            }
                                          }
                                          L7: {
                                            if (-3 != (mh.field_u ^ -1)) {
                                              if (-4 != (mh.field_u ^ -1)) {
                                                break L7;
                                              } else {
                                                if (-var7 + param1 != -var6 + param2) {
                                                  break L7;
                                                } else {
                                                  lh.field_e[param2][param1] = 1;
                                                  break L7;
                                                }
                                              }
                                            } else {
                                              if (-4 != (mh.field_u ^ -1)) {
                                                break L7;
                                              } else {
                                                if (-var7 + param1 != -var6 + param2) {
                                                  break L7;
                                                } else {
                                                  lh.field_e[param2][param1] = 1;
                                                  break L7;
                                                }
                                              }
                                            }
                                          }
                                          param1++;
                                          continue L5;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  param1 = var7;
                                  L8: while (true) {
                                    if (4 + var7 <= param1) {
                                      param2++;
                                      continue L2;
                                    } else {
                                      if (0 == lh.field_e[param2][param1]) {
                                        param1++;
                                        continue L8;
                                      } else {
                                        L9: {
                                          if (ik.field_R) {
                                            fh.a((byte) 107, gi.field_d, 100, 96);
                                            ik.field_R = false;
                                            break L9;
                                          } else {
                                            break L9;
                                          }
                                        }
                                        return;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    public fleas() {
    }

    final static re[] a(ih param0, int param1) {
        re[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        re[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        re var6_ref_re = null;
        int var7 = 0;
        ih var8 = null;
        var7 = field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -6383) {
                break L1;
              } else {
                var8 = (ih) null;
                fleas.a((ih) null, -51);
                break L1;
              }
            }
            var2_int = param0.b(8, (byte) -87);
            if (-1 <= (var2_int ^ -1)) {
              var3 = param0.b(12, (byte) -87);
              var4 = new re[var3];
              var5 = 0;
              L2: while (true) {
                if (var5 >= var3) {
                  stackIn_13_0 = (re[]) (var4);
                  break L0;
                } else {
                  L3: {
                    if (!fb.a((byte) 98, param0)) {
                      var6 = param0.b(qh.a(3, -1 + var5), (byte) -87);
                      var4[var5] = var4[var6];
                      break L3;
                    } else {
                      var6_ref_re = new re();
                      param0.b(24, (byte) -87);
                      param0.b(24, (byte) -87);
                      var6_ref_re.field_a = param0.b(24, (byte) -87);
                      param0.b(9, (byte) -87);
                      param0.b(12, (byte) -87);
                      param0.b(12, (byte) -87);
                      param0.b(12, (byte) -87);
                      var4[var5] = var6_ref_re;
                      break L3;
                    }
                  }
                  var5++;
                  continue L2;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var2);

            stackIn_16_1 = new StringBuilder().append("fleas.J(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        return stackIn_13_0;
    }

    private final void l(int param0) {
        ok dupTemp$0 = null;
        ok dupTemp$1 = null;
        ok dupTemp$2 = null;
        int[] dupTemp$3 = null;
        int dupTemp$4 = 0;
        StringBuilder discarded$5 = null;
        int stackIn_67_0 = 0;
        int stackIn_70_0 = 0;
        vg stackIn_75_0 = null;
        vg stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        vg stackIn_78_0 = null;
        vg stackIn_79_0 = null;
        int stackIn_79_1 = 0;
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
        int var13;
        int var14;
        int var15;
        kh var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        ok var23;
        int var24;
        ok var25;
        L0: {
          var24 = field_A ? 1 : 0;
          if ((mg.field_d ^ -1) <= -1) {
            mg.field_d = mg.field_d + 1;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          this.field_M = 1.0 + ma.a((double)ni.field_j / 10.0, 109);
          if (lk.field_D.field_k) {
            lk.field_D.field_d = (int)(30.0 + this.field_M * 4.0);
            lk.field_D.field_a = (int)(-(2.0 * this.field_M) + 415.0);
            lk.field_D.field_l = (int)(-(this.field_M * 2.0) + 395.0);
            lk.field_D.field_n = (int)(4.0 * this.field_M + 220.0);
            break L1;
          } else {
            if (-1 < (mg.field_d ^ -1)) {
              break L1;
            } else {
              si.field_y.field_a = (int)(415.0 - 2.0 * this.field_M);
              si.field_y.field_n = (int)(4.0 * this.field_M + 220.0);
              si.field_y.field_l = (int)(395.0 - this.field_M * 2.0);
              si.field_y.field_d = (int)(4.0 * this.field_M + 30.0);
              break L1;
            }
          }
        }
        L2: {
          var2 = tj.field_a;
          if (nl.field_c[field_E].length > tj.field_a) {
            break L2;
          } else {
            var2 = -1 + nl.field_c[field_E].length;
            break L2;
          }
        }
        L3: while (true) {
          if (!wf.b(-118)) {
            L4: {
              if (kc.field_f != 0) {
                break L4;
              } else {
                ik.field_R = true;
                break L4;
              }
            }
            L5: {
              ee.field_h = ee.field_h - (ee.field_h + 1 >> -2056075741);
              if (10 == jk.field_l) {
                break L5;
              } else {
                break L5;
              }
            }
            if (-2 != (pa.field_o ^ -1)) {
              qh.field_z = 0;
              jg.field_e = 0;
              var3 = 0;
              L6: while (true) {
                if (var3 >= nb.field_b) {
                  L7: {
                    jg.field_e = jg.field_e - pl.field_f;
                    if (qh.field_z != 0) {
                      em.field_b = em.field_b - 1;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    L9: {
                      dk.field_C.b(true);
                      wd.field_a.b(true);
                      de.field_b.b(true);
                      var15 = mh.field_u;
                      if (dk.field_C.field_g) {
                        break L9;
                      } else {
                        if (!ei.field_H[16]) {
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    mh.field_u = 1;
                    break L8;
                  }
                  L10: {
                    L11: {
                      if (wd.field_a.field_g) {
                        break L11;
                      } else {
                        if (!ei.field_H[17]) {
                          break L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                    mh.field_u = 2;
                    break L10;
                  }
                  L12: {
                    L13: {
                      if (de.field_b.field_g) {
                        break L13;
                      } else {
                        if (!ei.field_H[18]) {
                          break L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    mh.field_u = 3;
                    break L12;
                  }
                  L14: {
                    if (mh.field_u != var15) {
                      ik.a(wj.field_b[0], (byte) -84);
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    var16 = ia.field_m[field_E][var2];
                    if (jk.field_l != 10) {
                      if (pl.field_f < var16.field_e) {
                        if (qe.field_k >= 2) {
                          if (ji.field_a == 2) {
                            stackIn_67_0 = 1;
                            break L15;
                          } else {
                            stackIn_67_0 = 0;
                            break L15;
                          }
                        } else {
                          stackIn_67_0 = 0;
                          break L15;
                        }
                      } else {
                        stackIn_67_0 = 1;
                        break L15;
                      }
                    } else {
                      stackIn_67_0 = 1;
                      break L15;
                    }
                  }
                  L16: {
                    var17 = stackIn_67_0;
                    if (var16.field_e <= var16.field_f - jg.field_e) {
                      stackIn_70_0 = 0;
                      break L16;
                    } else {
                      stackIn_70_0 = 1;
                      break L16;
                    }
                  }
                  L17: {
                    var18 = stackIn_70_0;
                    if (var18 == 0) {
                      break L17;
                    } else {
                      if (0 <= mg.field_d) {
                        break L17;
                      } else {
                        mg.field_d = 0;
                        break L17;
                      }
                    }
                  }
                  L18: {
                    stackIn_75_0 = lk.field_D;

                    if (var17 == 0) {
                      stackIn_76_0 = (vg) ((Object) stackIn_75_0);
                      stackIn_76_1 = 0;
                      break L18;
                    } else {
                      stackIn_76_0 = (vg) ((Object) stackIn_75_0);
                      stackIn_76_1 = 1;
                      break L18;
                    }
                  }
                  L19: {
                    stackIn_76_0.field_k = stackIn_76_1 != 0;
                    stackIn_78_0 = si.field_y;

                    if (lk.field_D.field_k) {
                      stackIn_79_0 = (vg) ((Object) stackIn_78_0);
                      stackIn_79_1 = 0;
                      break L19;
                    } else {
                      stackIn_79_0 = (vg) ((Object) stackIn_78_0);
                      stackIn_79_1 = 1;
                      break L19;
                    }
                  }
                  L20: {
                    stackIn_79_0.field_k = stackIn_79_1 != 0;
                    if (var17 == 0) {
                      break L20;
                    } else {
                      L21: {
                        if (5 == tj.field_a) {
                          hg.a(-25389, 0, 255, tj.field_a);
                          if (tg.field_g) {
                            hg.a(-25389, 12, 243, tj.field_a);
                            break L21;
                          } else {
                            break L21;
                          }
                        } else {
                          break L21;
                        }
                      }
                      L22: {
                        if (tj.field_a != 10) {
                          break L22;
                        } else {
                          hg.a(-25389, 1, 254, tj.field_a);
                          if (tg.field_g) {
                            hg.a(-25389, 13, 242, tj.field_a);
                            break L22;
                          } else {
                            break L22;
                          }
                        }
                      }
                      L23: {
                        if (tj.field_a != 20) {
                          break L23;
                        } else {
                          hg.a(-25389, 2, 253, tj.field_a);
                          if (tg.field_g) {
                            hg.a(-25389, 14, 241, tj.field_a);
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                      }
                      if (pl.field_f == ml.field_O) {
                        L24: {
                          if (0 != tj.field_a) {
                            if (-2 != (tj.field_a ^ -1)) {
                              break L24;
                            } else {
                              if (-2 != (field_E ^ -1)) {
                                break L24;
                              } else {
                                hg.a(-25389, 6, 249, tj.field_a);
                                break L24;
                              }
                            }
                          } else {
                            if (-2 != (tj.field_a ^ -1)) {
                              break L24;
                            } else {
                              if (-2 != (field_E ^ -1)) {
                                break L24;
                              } else {
                                hg.a(-25389, 6, 249, tj.field_a);
                                break L24;
                              }
                            }
                          }
                        }
                        L25: {
                          if (-3 != (tj.field_a ^ -1)) {
                            break L25;
                          } else {
                            if (field_E == 1) {
                              hg.a(-25389, 7, 248, tj.field_a);
                              break L25;
                            } else {
                              break L25;
                            }
                          }
                        }
                        L26: {
                          if (3 != tj.field_a) {
                            break L26;
                          } else {
                            if (field_E == 1) {
                              hg.a(-25389, 8, 247, tj.field_a);
                              break L26;
                            } else {
                              break L26;
                            }
                          }
                        }
                        L27: {
                          if ((tj.field_a ^ -1) != -5) {
                            break L27;
                          } else {
                            if ((field_E ^ -1) == -2) {
                              hg.a(-25389, 9, 246, tj.field_a);
                              break L27;
                            } else {
                              break L27;
                            }
                          }
                        }
                        oa.a(10, true, -125);
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                  }
                  L28: {
                    ol.field_f.field_t = fl.field_f;
                    ol.field_f.c(47);
                    fl.field_f = ol.field_f.field_t;
                    if (fl.field_f) {
                      L29: {
                        var19 = ag.field_f / 16;
                        var20 = kc.field_b / 16;
                        var21 = -1;
                        if ((var20 ^ -1) <= -22) {
                          break L29;
                        } else {
                          if (var19 >= 40) {
                            break L29;
                          } else {
                            if ((var20 ^ -1) > -1) {
                              break L29;
                            } else {
                              if (0 <= var19) {
                                var21 = fl.field_c[var19][var20];
                                break L29;
                              } else {
                                break L29;
                              }
                            }
                          }
                        }
                      }
                      var22 = ob.field_c.length + -1;
                      L30: while (true) {
                        if (var22 < 0) {
                          break L28;
                        } else {
                          L31: {
                            if ((var22 ^ -1) == (var21 ^ -1)) {
                              L32: {
                                ob.field_c[var22].field_l = var19 * 16;
                                ob.field_c[var22].field_a = var20 * 16;
                                dupTemp$0 = ob.field_c[var22];
                                dupTemp$0.field_l = dupTemp$0.field_l - ob.field_c[var22].field_n / 2;
                                ob.field_c[var22].field_a = kc.field_b / 16 * 16;
                                dupTemp$1 = ob.field_c[var22];
                                dupTemp$1.field_a = dupTemp$1.field_a + 32;
                                ob.field_c[var22].field_C = var19 * 16;
                                ob.field_c[var22].field_H = var20 * 16;
                                dupTemp$2 = ob.field_c[var22];
                                var25 = dupTemp$2;
                                var23 = dupTemp$2;
                                ob.field_c[var22].field_z = 16;
                                var25.field_G = 16;
                                if ((ob.field_c[var22].field_l ^ -1) > -1) {
                                  ob.field_c[var22].field_l = 0;
                                  break L32;
                                } else {
                                  break L32;
                                }
                              }
                              L33: {
                                if (ob.field_c[var22].field_a >= 0) {
                                  break L33;
                                } else {
                                  ob.field_c[var22].field_a = 0;
                                  break L33;
                                }
                              }
                              if (ob.field_c[var22].field_l - -ob.field_c[var22].field_n <= 640) {
                                break L31;
                              } else {
                                ob.field_c[var22].field_l = 640 + -ob.field_c[var22].field_n;
                                break L31;
                              }
                            } else {
                              var23 = ob.field_c[var22];
                              ob.field_c[var22].field_z = 0;
                              var23.field_G = 0;
                              break L31;
                            }
                          }
                          ob.field_c[var22].d(98);
                          var22--;
                          continue L30;
                        }
                      }
                    } else {
                      break L28;
                    }
                  }
                  L34: {
                    if (kc.field_f == 1) {
                      if (oa.field_n) {
                        break L34;
                      } else {
                        this.b(-94, kc.field_b, ag.field_f);
                        break L34;
                      }
                    } else {
                      oa.field_n = false;
                      break L34;
                    }
                  }
                  L35: {
                    lk.field_D.b(true);
                    si.field_y.b(true);
                    if (lk.field_D.field_g) {
                      oa.a(10, true, 91);
                      ik.a(wj.field_b[0], (byte) -84);
                      break L35;
                    } else {
                      break L35;
                    }
                  }
                  L36: {
                    if (!si.field_y.field_g) {
                      break L36;
                    } else {
                      L37: {
                        if (0 >= qg.field_c) {
                          break L37;
                        } else {
                          if (0 == nb.field_b) {
                            break L36;
                          } else {
                            break L37;
                          }
                        }
                      }
                      cf.a(-25319);
                      ik.a(wj.field_b[0], (byte) -84);
                      break L36;
                    }
                  }
                  L38: {
                    if (var17 != 0) {
                      L39: {
                        if (120 > pg.field_f) {
                          pg.field_f = pg.field_f + 1;
                          break L39;
                        } else {
                          break L39;
                        }
                      }
                      if (-11 != (jk.field_l ^ -1)) {
                        break L38;
                      } else {
                        if (-361 >= (pg.field_f ^ -1)) {
                          break L38;
                        } else {
                          if (em.field_b != 0) {
                            break L38;
                          } else {
                            if (qh.field_y != 0) {
                              break L38;
                            } else {
                              pg.field_f = pg.field_f + 1;
                              break L38;
                            }
                          }
                        }
                      }
                    } else {
                      break L38;
                    }
                  }
                  if (-1 == (ni.field_j & 1 ^ -1)) {
                    kb.field_i = (kb.field_i + 1) % 8;
                    var3 = 0;
                    L40: while (true) {
                      L41: {
                        if (var3 >= oe.field_a) {
                          break L41;
                        } else {
                          L42: while (true) {
                            L43: {
                              var4 = fl.field_c[id.field_h[var3]][uf.field_e[var3]];
                              if (var4 == ci.field_c[var3]) {
                                break L43;
                              } else {
                                if (fg.field_u[var3] == var4) {
                                  break L43;
                                } else {
                                  var3++;
                                  continue L40;
                                }
                              }
                            }
                            if (0 == ok.field_s[var3]) {
                              L44: {
                                if (-1 == (kb.field_i ^ -1)) {
                                  fl.field_c[id.field_h[var3]][uf.field_e[var3]] = (char)ci.field_c[var3];
                                  break L44;
                                } else {
                                  break L44;
                                }
                              }
                              if (-5 == (kb.field_i ^ -1)) {
                                fl.field_c[id.field_h[var3]][uf.field_e[var3]] = (char)fg.field_u[var3];
                                var3++;
                                continue L40;
                              } else {
                                var3++;
                                continue L40;
                              }
                            } else {
                              if (-9 == (ci.field_c[var3] ^ -1)) {
                                var7 = id.field_h[var3] * 16;
                                var13 = 0;
                                var8 = uf.field_e[var3] * 16;
                                var4 = 0;
                                L45: while (true) {
                                  if (var4 >= nb.field_b) {
                                    if (1 == var13) {
                                      L46: {
                                        if (-9 != (fl.field_c[id.field_h[var3]][uf.field_e[var3]] ^ -1)) {
                                          break L46;
                                        } else {
                                          fh.a((byte) -91, bf.field_d, 100, 63);
                                          break L46;
                                        }
                                      }
                                      fl.field_c[id.field_h[var3]][uf.field_e[var3]] = (char)9;
                                      var3++;
                                      if (var3 >= oe.field_a) {
                                        break L41;
                                      } else {
                                        continue L42;
                                      }
                                    } else {
                                      fl.field_c[id.field_h[var3]][uf.field_e[var3]] = (char)8;
                                      var3++;
                                      if (var3 >= oe.field_a) {
                                        break L41;
                                      } else {
                                        continue L42;
                                      }
                                    }
                                  } else {
                                    if (0 == cl.field_d[var4]) {
                                      if (var7 <= qg.field_a[var4]) {
                                        if (var8 <= dh.field_b[var4]) {
                                          if (qg.field_a[var4] < 16 + var7) {
                                            if (dh.field_b[var4] < var8 - -16) {
                                              var13 = 1;
                                              var4++;
                                              continue L45;
                                            } else {
                                              var4++;
                                              continue L45;
                                            }
                                          } else {
                                            var4++;
                                            continue L45;
                                          }
                                        } else {
                                          var4++;
                                          continue L45;
                                        }
                                      } else {
                                        var4++;
                                        continue L45;
                                      }
                                    } else {
                                      var4++;
                                      continue L45;
                                    }
                                  }
                                }
                              } else {
                                var3++;
                                continue L40;
                              }
                            }
                          }
                        }
                      }
                      L47: {
                        if (ml.field_O <= nb.field_b) {
                          qg.field_c = -1;
                          break L47;
                        } else {
                          qg.field_c = qg.field_c - 1;
                          if (1 <= qg.field_c) {
                            break L47;
                          } else {
                            nb.field_b = nb.field_b + 1;
                            qg.field_c = 6;
                            fh.a((byte) 105, ic.field_ab, 100, 63);
                            break L47;
                          }
                        }
                      }
                      var19 = 0;
                      var3 = 0;
                      L48: while (true) {
                        if (nb.field_b <= var3) {
                          oj.field_i.i((int)(32.0 * Math.log((double)(1 + var19))));
                          var3 = 0;
                          L49: while (true) {
                            if (var3 >= gh.field_q) {
                              var3 = 0;
                              L50: while (true) {
                                if (pl.field_g <= var3) {
                                  var6 = 20;
                                  L51: while (true) {
                                    if ((var6 ^ -1) > -1) {
                                      if (param0 > 126) {
                                        L52: {
                                          if (0 < we.field_c) {
                                            we.field_c = we.field_c - 1;
                                            break L52;
                                          } else {
                                            break L52;
                                          }
                                        }
                                        return;
                                      } else {
                                        return;
                                      }
                                    } else {
                                      var5 = 39;
                                      L53: while (true) {
                                        if (-1 < (var5 ^ -1)) {
                                          var6--;
                                          continue L51;
                                        } else {
                                          if (fl.field_c[var5][var6] == 33) {
                                            dupTemp$3 = field_G[var5];
                                            dupTemp$4 = dupTemp$3[var6];
                                            dupTemp$3[var6] = dupTemp$4 - 1;
                                            if (dupTemp$4 < 0) {
                                              fl.field_c[var5][var6] = (char)6;
                                              var5--;
                                              continue L53;
                                            } else {
                                              var5--;
                                              continue L53;
                                            }
                                          } else {
                                            var5--;
                                            continue L53;
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var6 = ek.field_b[var3];
                                  var5 = f.field_F[var3];
                                  var7 = 16 * var5;
                                  var8 = (-2 + var6) * 16 - -hl.field_C[var3];
                                  var4 = 0;
                                  L54: while (true) {
                                    if (var4 >= nb.field_b) {
                                      L55: {
                                        hl.field_C[var3] = hl.field_C[var3] + uf.field_b[var3];
                                        if (hl.field_C[var3] >= 16) {
                                          hl.field_C[var3] = 16;
                                          uf.field_b[var3] = -4;
                                          break L55;
                                        } else {
                                          break L55;
                                        }
                                      }
                                      if (0 == hl.field_C[var3]) {
                                        fl.field_c[var5][-2 + var6] = (char)15;
                                        this.a((byte) -86, var6 - 2, var5);
                                        var4 = var3;
                                        L56: while (true) {
                                          if (var4 >= pl.field_g) {
                                            pl.field_g = pl.field_g - 1;
                                            var3++;
                                            continue L50;
                                          } else {
                                            f.field_F[var4] = f.field_F[1 + var4];
                                            ek.field_b[var4] = ek.field_b[1 + var4];
                                            hl.field_C[var4] = hl.field_C[1 + var4];
                                            uf.field_b[var4] = uf.field_b[var4 + 1];
                                            var4++;
                                            continue L56;
                                          }
                                        }
                                      } else {
                                        var3++;
                                        continue L50;
                                      }
                                    } else {
                                      if (qg.field_a[var4] >= -4 + var7) {
                                        if (20 + var7 > qg.field_a[var4]) {
                                          if (var8 <= dh.field_b[var4]) {
                                            if (var8 - -20 > dh.field_b[var4]) {
                                              L57: {
                                                if (0 != cl.field_d[var4]) {
                                                  break L57;
                                                } else {
                                                  cl.field_d[var4] = 1;
                                                  fh.a((byte) 93, fi.field_n, 100, 63);
                                                  break L57;
                                                }
                                              }
                                              lh.field_e[qg.field_a[var4] / 4][dh.field_b[var4] / 4] = 0;
                                              var4++;
                                              continue L54;
                                            } else {
                                              var4++;
                                              continue L54;
                                            }
                                          } else {
                                            var4++;
                                            continue L54;
                                          }
                                        } else {
                                          var4++;
                                          continue L54;
                                        }
                                      } else {
                                        var4++;
                                        continue L54;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              L58: {
                                var5 = rf.field_e[var3];
                                var6 = hf.field_d[var3];
                                var4 = wh.field_d[var3];
                                if (-1 != (cl.field_d[var4] ^ -1)) {
                                  break L58;
                                } else {
                                  if (jd.field_o[var4] != 0) {
                                    break L58;
                                  } else {
                                    if (qg.field_a[var4] / 16 != var5) {
                                      break L58;
                                    } else {
                                      if (var6 * 4 - 1 != dh.field_b[var4] / 4) {
                                        break L58;
                                      } else {
                                        var3++;
                                        continue L49;
                                      }
                                    }
                                  }
                                }
                              }
                              fh.a((byte) 101, hf.field_g, 100, 63);
                              fl.field_c[var5][var6] = (char)0;
                              this.a((byte) -79, var6, var5);
                              var20 = 0;
                              L59: while (true) {
                                if (-5 >= (var20 ^ -1)) {
                                  gh.field_q = gh.field_q - 1;
                                  rf.field_e[var3] = rf.field_e[gh.field_q];
                                  hf.field_d[var3] = hf.field_d[gh.field_q];
                                  wh.field_d[var3] = wh.field_d[gh.field_q];
                                  var3--;
                                  var3++;
                                  continue L49;
                                } else {
                                  var21 = 0;
                                  L60: while (true) {
                                    if (var21 >= 4) {
                                      var20++;
                                      continue L59;
                                    } else {
                                      lh.field_e[var5 * 4 - -var20][var21 + 4 * var6] = 0;
                                      var21++;
                                      continue L60;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          L61: {
                            if (cl.field_d[var3] != 0) {
                              break L61;
                            } else {
                              if ((jd.field_o[var3] ^ -1) == -2) {
                                break L61;
                              } else {
                                if (fl.field_c[qg.field_a[var3] / 16][dh.field_b[var3] / 16] != 2) {
                                  break L61;
                                } else {
                                  cl.field_d[var3] = 1;
                                  fh.a((byte) -77, fi.field_n, 100, 63);
                                  break L61;
                                }
                              }
                            }
                          }
                          if (-1 == (cl.field_d[var3] ^ -1)) {
                            L62: {
                              var7 = qg.field_a[var3];
                              var8 = dh.field_b[var3];
                              var9 = ge.field_a[var3];
                              var10 = var7 / 4;
                              if (-1 >= (var9 ^ -1)) {
                                va.field_t[var3] = 2 + kb.field_i % 2;
                                break L62;
                              } else {
                                va.field_t[var3] = kb.field_i % 2;
                                break L62;
                              }
                            }
                            var12 = var9 / 4;
                            var11 = var8 / 4;
                            var14 = 0;
                            var4 = 0;
                            L63: while (true) {
                              if (qi.field_f <= var4) {
                                L64: {
                                  if (jd.field_o[var3] != 0) {
                                    L65: {
                                      if (-2 != (jd.field_o[var3] ^ -1)) {
                                        break L65;
                                      } else {
                                        L66: {
                                          var5 = var7 / 16;
                                          var8 = var8 - ue.field_d;
                                          var6 = var8 / 16;
                                          if (0 > var6) {
                                            break L66;
                                          } else {
                                            if (21 <= var6) {
                                              break L66;
                                            } else {
                                              if (fl.field_c[var5][var6] != 11) {
                                                break L65;
                                              } else {
                                                if (var8 % 16 == 4) {
                                                  jd.field_o[var3] = 0;
                                                  var9 = -4;
                                                  ge.field_a[var3] = -4;
                                                  fh.a((byte) 89, hg.field_n, 100, 63);
                                                  break L65;
                                                } else {
                                                  break L65;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        cl.field_d[var3] = 1;
                                        fh.a((byte) 86, fi.field_n, 100, 63);
                                        break L65;
                                      }
                                    }
                                    if (2 != jd.field_o[var3]) {
                                      break L64;
                                    } else {
                                      L67: {
                                        lh.field_e[var10][var11] = 0;
                                        if ((lh.field_e[var10][-md.field_L + var11] ^ -1) != -3) {
                                          break L67;
                                        } else {
                                          this.a((var11 + -1) / 4, true, var3, var10 / 4, 3);
                                          break L67;
                                        }
                                      }
                                      L68: {
                                        L69: {
                                          var9 = ge.field_a[var3];
                                          var7 = qg.field_a[var3];
                                          var8 = dh.field_b[var3];
                                          var11 = var8 / 4;
                                          var10 = var7 / 4;
                                          var12 = var9 / 4;
                                          var8 = var8 - ue.field_d;
                                          var11 = var11 - md.field_L;
                                          if (lh.field_e[var10][var11] > 0) {
                                            break L69;
                                          } else {
                                            if (-1 == (var14 ^ -1)) {
                                              break L68;
                                            } else {
                                              break L69;
                                            }
                                          }
                                        }
                                        var8 = var8 + ue.field_d;
                                        var11 = var11 + md.field_L;
                                        jd.field_o[var3] = 0;
                                        break L68;
                                      }
                                      lh.field_e[var10][var11] = 1;
                                      break L64;
                                    }
                                  } else {
                                    L70: {
                                      lh.field_e[var10][var11] = 0;
                                      if ((lh.field_e[var10][var11 + md.field_L] ^ -1) != -3) {
                                        break L70;
                                      } else {
                                        if (-1 == (var14 ^ -1)) {
                                          this.a((md.field_L + var11) / 4, true, var3, var10 / 4, 2);
                                          break L70;
                                        } else {
                                          break L70;
                                        }
                                      }
                                    }
                                    L71: {
                                      if ((lh.field_e[var10][var11 - md.field_L] ^ -1) != -3) {
                                        break L71;
                                      } else {
                                        if (-1 == (var14 ^ -1)) {
                                          this.a((var11 - md.field_L) / 4, true, var3, var10 / 4, 3);
                                          break L71;
                                        } else {
                                          break L71;
                                        }
                                      }
                                    }
                                    L72: {
                                      L73: {
                                        if (0 < lh.field_e[var10][var11 - -md.field_L]) {
                                          break L73;
                                        } else {
                                          if (var14 == 0) {
                                            break L72;
                                          } else {
                                            break L73;
                                          }
                                        }
                                      }
                                      if ((lh.field_e[var10 - -var12][var11] ^ -1) != -3) {
                                        break L72;
                                      } else {
                                        this.a(var11 / 4, true, var3, (var10 + var12) / 4, var12);
                                        break L72;
                                      }
                                    }
                                    L74: {
                                      var7 = qg.field_a[var3];
                                      var8 = dh.field_b[var3];
                                      var9 = ge.field_a[var3];
                                      var10 = var7 / 4;
                                      var12 = var9 / 4;
                                      var11 = var8 / 4;
                                      if (-3 != (jd.field_o[var3] ^ -1)) {
                                        L75: {
                                          if (lh.field_e[var10][md.field_L + var11] > 0) {
                                            break L75;
                                          } else {
                                            if (var14 == 0) {
                                              var8 = var8 + ue.field_d;
                                              break L74;
                                            } else {
                                              break L75;
                                            }
                                          }
                                        }
                                        L76: {
                                          if ((lh.field_e[var12 + var10][var11] ^ -1) >= -1) {
                                            break L76;
                                          } else {
                                            if (lh.field_e[var10][-md.field_L + var11] > 0) {
                                              break L76;
                                            } else {
                                              if ((lh.field_e[var12 + var10][var11 - md.field_L] ^ -1) < -1) {
                                                break L76;
                                              } else {
                                                var8 = var8 - ue.field_d;
                                                var7 = var7 + var9;
                                                break L74;
                                              }
                                            }
                                          }
                                        }
                                        if (0 < lh.field_e[var12 + var10][var11]) {
                                          var9 = -var9;
                                          break L74;
                                        } else {
                                          var7 = var7 + var9;
                                          break L74;
                                        }
                                      } else {
                                        break L74;
                                      }
                                    }
                                    var10 = var7 / 4;
                                    var11 = var8 / 4;
                                    if (1 == jd.field_o[var3]) {
                                      break L64;
                                    } else {
                                      if (-1 == (cl.field_d[var3] ^ -1)) {
                                        lh.field_e[var10][var11] = 1;
                                        break L64;
                                      } else {
                                        qg.field_a[var3] = var7;
                                        dh.field_b[var3] = var8;
                                        ge.field_a[var3] = var9;
                                        var3++;
                                        continue L48;
                                      }
                                    }
                                  }
                                }
                                qg.field_a[var3] = var7;
                                dh.field_b[var3] = var8;
                                ge.field_a[var3] = var9;
                                var3++;
                                continue L48;
                              } else {
                                if (var7 >= oa.field_m[var4]) {
                                  if (var7 < lc.field_v[var4]) {
                                    if (var8 >= uh.field_n[var4]) {
                                      if (ca.field_G[var4] > var8) {
                                        if (me.field_i[var4] == 0) {
                                          L77: {
                                            if (var7 / 16 <= rk.field_u[var4]) {
                                              ge.field_a[var3] = -4;
                                              var12 = -1;
                                              var9 = -4;
                                              break L77;
                                            } else {
                                              ge.field_a[var3] = 4;
                                              var9 = 4;
                                              var12 = 1;
                                              break L77;
                                            }
                                          }
                                          var19++;
                                          var14 = 1;
                                          if (var19 == qh.field_z) {
                                            if (ia.field_m[field_E][var2].field_f == qh.field_z) {
                                              hg.a(-25389, 11, 244, var2);
                                              var4++;
                                              continue L63;
                                            } else {
                                              var4++;
                                              continue L63;
                                            }
                                          } else {
                                            var4++;
                                            continue L63;
                                          }
                                        } else {
                                          var4++;
                                          continue L63;
                                        }
                                      } else {
                                        var4++;
                                        continue L63;
                                      }
                                    } else {
                                      var4++;
                                      continue L63;
                                    }
                                  } else {
                                    var4++;
                                    continue L63;
                                  }
                                } else {
                                  var4++;
                                  continue L63;
                                }
                              }
                            }
                          } else {
                            var3++;
                            continue L48;
                          }
                        }
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  if (cl.field_d[var3] != 0) {
                    jg.field_e = jg.field_e + 1;
                    var3++;
                    continue L6;
                  } else {
                    qh.field_z = qh.field_z + 1;
                    var3++;
                    continue L6;
                  }
                }
              }
            } else {
              return;
            }
          } else {
            L78: {
              var3 = id.field_b;
              if (-33 == (var3 ^ -1)) {
                L79: {
                  if (uc.field_a.length() < 16) {
                    discarded$5 = uc.field_a.append((char) var3);
                    break L79;
                  } else {
                    break L79;
                  }
                }
                if (-86 != (ji.field_a ^ -1)) {
                  break L78;
                } else {
                  if (uc.field_a.length() <= 0) {
                    break L78;
                  } else {
                    uf.a(-1 + uc.field_a.length(), uc.field_a, ' ', -120);
                    break L78;
                  }
                }
              } else {
                if (!ii.a(1, (char) var3)) {
                  if (-86 != (ji.field_a ^ -1)) {
                    break L78;
                  } else {
                    if (uc.field_a.length() <= 0) {
                      break L78;
                    } else {
                      uf.a(-1 + uc.field_a.length(), uc.field_a, ' ', -120);
                      break L78;
                    }
                  }
                } else {
                  if (-86 != (ji.field_a ^ -1)) {
                    break L78;
                  } else {
                    if (uc.field_a.length() <= 0) {
                      break L78;
                    } else {
                      uf.a(-1 + uc.field_a.length(), uc.field_a, ' ', -120);
                      break L78;
                    }
                  }
                }
              }
            }
            L80: {
              if (-85 == (ji.field_a ^ -1)) {
                break L80;
              } else {
                break L80;
              }
            }
            if (ji.field_a != 13) {
              continue L3;
            } else {
              oa.a(1, false, -109);
              return;
            }
          }
        }
    }

    public static void m(int param0) {
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
    }

    static {
        $cfr$clinit: {
            long var0;
            int var2;
            int var3;
            field_H = "Must save: <%0>";
            field_J = new long[256];
            field_E = 0;
            var2 = 0;
            L0: while (true) {
              if ((var2 ^ -1) <= -257) {
                field_G = new int[40][21];
                field_I = "Bonus: <%0>";
                break $cfr$clinit;
              } else {
                var0 = (long)var2;
                var3 = 0;
                L1: while (true) {
                  if (8 <= var3) {
                    field_J[var2] = var0;
                    var2++;
                    continue L0;
                  } else {
                    if (1L != (var0 & 1L)) {
                      var0 = var0 >>> 1;
                      var3++;
                      continue L1;
                    } else {
                      var0 = var0 >>> -1944046335 ^ -3932672073523589310L;
                      var3++;
                      continue L1;
                    }
                  }
                }
              }
            }
        }
    }
}
