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
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_78_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_80_0 = 0;
        sf stackIn_80_1 = null;
        int stackOut_77_0 = 0;
        int stackOut_79_0 = 0;
        sf stackOut_79_1 = null;
        int stackOut_78_0 = 0;
        sf stackOut_78_1 = null;
        L0: {
          var12 = field_A ? 1 : 0;
          if (10 != fl.field_c[param3][param0]) {
            break L0;
          } else {
            pd discarded$13 = fh.a((byte) 105, ab.field_a, 100, 63);
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
            pd discarded$14 = fh.a((byte) 102, ih.field_l, 100, 63);
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
              pd discarded$15 = fh.a((byte) -70, me.field_k, 100, 384 / ee.field_h);
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
                        if ((var7 ^ -1) == (pl.field_g ^ -1)) {
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
                      pd discarded$16 = fh.a((byte) -91, hi.field_p, 100, 63);
                      break L12;
                    }
                    if ((pl.field_g ^ -1) == (var7 ^ -1)) {
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
                    L14: {
                      if (param3 != f.field_F[var6]) {
                        break L14;
                      } else {
                        if (param0 == ek.field_b[var6]) {
                          var7 = var6;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                    }
                    var6++;
                    continue L11;
                  }
                }
              } else {
                break L10;
              }
            }
          }
        }
        L15: {
          L16: {
            if (-14 == (fl.field_c[param3][param0] ^ -1)) {
              break L16;
            } else {
              if (27 != fl.field_c[param3][param0]) {
                break L15;
              } else {
                break L16;
              }
            }
          }
          if (3 == param4) {
            break L15;
          } else {
            cl.field_d[param2] = 1;
            c.field_U = true;
            pd discarded$17 = fh.a((byte) -59, ah.field_a, 100, 63);
            break L15;
          }
        }
        L17: {
          L18: {
            if (16 == fl.field_c[param3][param0]) {
              break L18;
            } else {
              if (-30 != (fl.field_c[param3][param0] ^ -1)) {
                break L17;
              } else {
                break L18;
              }
            }
          }
          L19: {
            L20: {
              if ((pc.field_b ^ -1) != (param3 ^ -1)) {
                break L20;
              } else {
                if ((lb.field_m ^ -1) != (param0 ^ -1)) {
                  break L20;
                } else {
                  var10 = tg.field_d;
                  var11 = hf.field_b;
                  break L19;
                }
              }
            }
            var10 = pc.field_b;
            var11 = lb.field_m;
            break L19;
          }
          L21: {
            if (fl.field_c[var10][var11] == 16) {
              break L21;
            } else {
              if (fl.field_c[var10][var11] != 29) {
                break L17;
              } else {
                break L21;
              }
            }
          }
          L22: {
            if ((ge.field_a[param2] ^ -1) >= -1) {
              break L22;
            } else {
              if (0 >= lh.field_e[4 + var10 * 4][4 * var11]) {
                qg.field_a[param2] = 16 + 16 * var10;
                dh.field_b[param2] = var11 * 16;
                pd discarded$18 = fh.a((byte) 89, uh.field_s, 100, 63);
                break L22;
              } else {
                break L22;
              }
            }
          }
          if (0 <= ge.field_a[param2]) {
            break L17;
          } else {
            if (-1 > (lh.field_e[var10 * 4 - 1][4 * var11] ^ -1)) {
              break L17;
            } else {
              qg.field_a[param2] = var10 * 16 - 4;
              dh.field_b[param2] = 16 * var11;
              pd discarded$19 = fh.a((byte) 116, uh.field_s, 100, 63);
              break L17;
            }
          }
        }
        L23: {
          L24: {
            if (17 == fl.field_c[param3][param0]) {
              break L24;
            } else {
              if (fl.field_c[param3][param0] != 31) {
                break L23;
              } else {
                break L24;
              }
            }
          }
          cl.field_d[param2] = 1;
          pl.field_f = pl.field_f + 1;
          wi.field_p.a(-121, 100);
          pd discarded$20 = fh.a((byte) 102, nb.field_f, 100, 63);
          break L23;
        }
        L25: {
          if (param1) {
            break L25;
          } else {
            field_K = null;
            break L25;
          }
        }
        L26: {
          if (fl.field_c[param3][param0] != 19) {
            break L26;
          } else {
            if (-1 == (we.field_c ^ -1)) {
              L27: {
                stackOut_77_0 = 117;
                stackIn_79_0 = stackOut_77_0;
                stackIn_78_0 = stackOut_77_0;
                if (md.field_L < 0) {
                  stackOut_79_0 = stackIn_79_0;
                  stackOut_79_1 = ha.field_o;
                  stackIn_80_0 = stackOut_79_0;
                  stackIn_80_1 = stackOut_79_1;
                  break L27;
                } else {
                  stackOut_78_0 = stackIn_78_0;
                  stackOut_78_1 = hg.field_k;
                  stackIn_80_0 = stackOut_78_0;
                  stackIn_80_1 = stackOut_78_1;
                  break L27;
                }
              }
              pd discarded$21 = fh.a((byte) stackIn_80_0, stackIn_80_1, 100, 63);
              ue.field_d = -ue.field_d;
              md.field_L = -md.field_L;
              we.field_c = 3;
              db.field_H = 4 - db.field_H;
              if (-3 >= (param4 ^ -1)) {
                break L26;
              } else {
                ge.field_a[param2] = -ge.field_a[param2];
                break L26;
              }
            } else {
              break L26;
            }
          }
        }
        L28: {
          if (fl.field_c[param3][param0] != 21) {
            break L28;
          } else {
            if (param4 < 2) {
              pd discarded$22 = fh.a((byte) -102, fg.field_l, 100, 63);
              fl.field_c[param3][param0] = (char)0;
              this.a((byte) -115, param0, param3);
              ge.field_a[param2] = -ge.field_a[param2];
              var8 = 0;
              L29: while (true) {
                if (-5 >= (var8 ^ -1)) {
                  break L28;
                } else {
                  var9 = 0;
                  L30: while (true) {
                    if (var9 >= 4) {
                      var8++;
                      continue L29;
                    } else {
                      lh.field_e[var8 + 4 * param3][4 * param0 + var9] = 0;
                      var9++;
                      continue L30;
                    }
                  }
                }
              }
            } else {
              break L28;
            }
          }
        }
        L31: {
          if (fl.field_c[param3][param0] != 22) {
            break L31;
          } else {
            if (2 != param4) {
              break L31;
            } else {
              fl.field_c[param3][param0] = (char)26;
              rf.field_e[gh.field_q] = param3;
              hf.field_d[gh.field_q] = param0;
              wh.field_d[gh.field_q] = param2;
              gh.field_q = gh.field_q + 1;
              break L31;
            }
          }
        }
        L32: {
          if (-24 != (fl.field_c[param3][param0] ^ -1)) {
            break L32;
          } else {
            L33: {
              pd discarded$23 = fh.a((byte) -120, gf.field_g, 100, 63);
              if (15 != tj.field_a) {
                break L33;
              } else {
                if (-1 != (field_E ^ -1)) {
                  break L33;
                } else {
                  hg.a(-25389, 4, 251, tj.field_a);
                  break L33;
                }
              }
            }
            var6 = 0;
            L34: while (true) {
              if (var6 >= 40) {
                break L32;
              } else {
                var7 = 0;
                L35: while (true) {
                  if (var7 >= 21) {
                    var6++;
                    continue L34;
                  } else {
                    L36: {
                      L37: {
                        if (23 == fl.field_c[var6][var7]) {
                          break L37;
                        } else {
                          if (fl.field_c[var6][var7] == 20) {
                            break L37;
                          } else {
                            break L36;
                          }
                        }
                      }
                      fl.field_c[var6][var7] = (char)0;
                      this.a((byte) -122, var7, var6);
                      var8 = 0;
                      L38: while (true) {
                        if (4 <= var8) {
                          break L36;
                        } else {
                          var9 = 0;
                          L39: while (true) {
                            if (4 <= var9) {
                              var8++;
                              continue L38;
                            } else {
                              lh.field_e[var8 + var6 * 4][var9 + var7 * 4] = 0;
                              var9++;
                              continue L39;
                            }
                          }
                        }
                      }
                    }
                    var7++;
                    continue L35;
                  }
                }
              }
            }
          }
        }
        L40: {
          if (fl.field_c[param3][param0] == 24) {
            pd discarded$24 = fh.a((byte) 117, gf.field_g, 100, 63);
            var6 = 0;
            L41: while (true) {
              if (40 <= var6) {
                break L40;
              } else {
                var7 = 0;
                L42: while (true) {
                  if (21 <= var7) {
                    var6++;
                    continue L41;
                  } else {
                    L43: {
                      if (fl.field_c[var6][var7] == 24) {
                        fl.field_c[var6][var7] = (char)0;
                        this.a((byte) -109, var7, var6);
                        var8 = 0;
                        L44: while (true) {
                          if (var8 >= 4) {
                            break L43;
                          } else {
                            var9 = 0;
                            L45: while (true) {
                              if (4 <= var9) {
                                var8++;
                                continue L44;
                              } else {
                                lh.field_e[var6 * 4 + var8][var7 * 4 - -var9] = 0;
                                var9++;
                                continue L45;
                              }
                            }
                          }
                        }
                      } else {
                        break L43;
                      }
                    }
                    L46: {
                      if (-19 != (fl.field_c[var6][var7] ^ -1)) {
                        break L46;
                      } else {
                        fl.field_c[var6][var7] = (char)2;
                        this.a((byte) -99, var7, var6);
                        var8 = 0;
                        L47: while (true) {
                          if (-5 >= (var8 ^ -1)) {
                            break L46;
                          } else {
                            var9 = 0;
                            L48: while (true) {
                              if ((var9 ^ -1) <= -5) {
                                var8++;
                                continue L47;
                              } else {
                                lh.field_e[var6 * 4 + var8][var7 * 4 + var9] = 1;
                                var9++;
                                continue L48;
                              }
                            }
                          }
                        }
                      }
                    }
                    var7++;
                    continue L42;
                  }
                }
              }
            }
          } else {
            break L40;
          }
        }
        L49: {
          if (-26 != (fl.field_c[param3][param0] ^ -1)) {
            break L49;
          } else {
            L50: {
              L51: {
                if (-4 == (param4 ^ -1)) {
                  break L51;
                } else {
                  if (-2 == (md.field_L ^ -1)) {
                    break L50;
                  } else {
                    break L51;
                  }
                }
              }
              L52: {
                if (-2 == (param4 ^ -1)) {
                  break L52;
                } else {
                  if (-1 != md.field_L) {
                    break L52;
                  } else {
                    break L50;
                  }
                }
              }
              break L49;
            }
            cl.field_d[param2] = 1;
            pd discarded$25 = fh.a((byte) 87, kc.field_e, 100, 63);
            break L49;
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
        int[][] var2 = null;
        int var3 = 0;
        int var4_int = 0;
        dd[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
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
        int[][] var18 = null;
        int[][] var19 = null;
        int var20 = 0;
        int[][] var21 = null;
        int[][] var22 = null;
        int[][] var23 = null;
        int[][] var24 = null;
        int[][] var26 = null;
        int[][] var27 = null;
        int[][] var28 = null;
        int[][] var29 = null;
        int[][] var31 = null;
        int[][] var32 = null;
        int[][] var33 = null;
        int[][] var34 = null;
        int[][] var36 = null;
        int[][] var37 = null;
        int[][] var38 = null;
        int[][] var39 = null;
        int[] var40 = null;
        var17 = field_A ? 1 : 0;
        aj.field_t = of.a("blocks", "", hm.field_g, 89);
        el.field_s = of.a("fleas", "", hm.field_g, 67);
        var3 = -24 % ((-43 - param0) / 62);
        lh.field_b = (fa) (Object) tc.a(de.field_h, "squarish16", hm.field_g, (byte) 120, "");
        var36 = new int[2][];
        var31 = var36;
        var26 = var31;
        var21 = var26;
        var18 = var21;
        var37 = var18;
        var32 = var37;
        var27 = var32;
        var22 = var27;
        var2 = var22;
        var18[0] = ((dj) (Object) lh.field_b).field_P[0];
        var18[1] = new int[var36[0].length];
        var4_int = 1;
        L0: while (true) {
          if (var4_int >= 2) {
            ((dj) (Object) lh.field_b).field_P = var2;
            tl.field_p = (fa) (Object) tc.a(de.field_h, "fleafont_filled", hm.field_g, (byte) 115, "");
            var38 = new int[4][];
            var33 = var38;
            var28 = var33;
            var23 = var28;
            var19 = var23;
            var39 = var19;
            var34 = var39;
            var29 = var34;
            var24 = var29;
            var2 = var24;
            var19[0] = ((dj) (Object) tl.field_p).field_P[0];
            var19[1] = new int[var38[0].length];
            var19[2] = new int[var38[0].length];
            var4_int = 1;
            L1: while (true) {
              if (3 <= var4_int) {
                se.field_a = new dd[3];
                ((dj) (Object) tl.field_p).field_P = var2;
                se.field_a[0] = kl.a(252, hm.field_g, "", "texture_1");
                se.field_a[1] = kl.a(252, hm.field_g, "", "texture_3");
                se.field_a[2] = kl.a(252, hm.field_g, "", "texture_5");
                si.field_C = kl.a(252, hm.field_g, "", "main_background");
                qi.field_c = kl.a(252, hm.field_g, "", "back_background");
                nc.field_d = kl.a(252, hm.field_g, "", "ingame_back");
                dd discarded$2 = kl.a(252, hm.field_g, "", "ingame_banner");
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
                    dd discarded$3 = kl.a(252, hm.field_g, "", "game_complete_backdrop");
                    ((fleas) this).field_C = kl.a(252, hm.field_g, "", "mb_price_background");
                    ((fleas) this).field_N = of.a("mb_screenshots", "", hm.field_g, 92);
                    ((fleas) this).field_D = kl.a(252, hm.field_g, "", "mb_foreground");
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
                        var40 = gb.field_a;
                        var8 = new dd(640, 480);
                        var8.f();
                        qi.field_c.d(0, 0, gb.field_d, gb.field_k);
                        gb.h(5, 5, 0, 0, gb.field_d, gb.field_k);
                        qi.field_c = var8;
                        gb.a(var40, var5, var6);
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
                            nl.field_c[0] = new dd[pl.field_l[0]];
                            nl.field_c[1] = new dd[pl.field_l[1]];
                            var11 = 0;
                            L5: while (true) {
                              if (-11 >= (var11 ^ -1)) {
                                var11 = 10;
                                L6: while (true) {
                                  if (20 <= var11) {
                                    var11 = 20;
                                    L7: while (true) {
                                      if ((var11 ^ -1) <= (nl.field_c[1].length ^ -1)) {
                                        var11 = 0;
                                        L8: while (true) {
                                          if (-15 >= (var11 ^ -1)) {
                                            var11 = 14;
                                            L9: while (true) {
                                              if (28 <= var11) {
                                                var11 = 28;
                                                L10: while (true) {
                                                  if ((var11 ^ -1) <= (nl.field_c[0].length ^ -1)) {
                                                    je.field_O = new dd[6];
                                                    je.field_O[0] = kl.a(252, hm.field_g, "", "menu_character_1");
                                                    je.field_O[1] = kl.a(252, hm.field_g, "", "menu_character_2");
                                                    je.field_O[2] = kl.a(252, hm.field_g, "", "menu_character_3");
                                                    je.field_O[3] = kl.a(252, hm.field_g, "", "menu_character_4");
                                                    je.field_O[4] = kl.a(252, hm.field_g, "", "menu_character_5");
                                                    je.field_O[5] = kl.a(252, hm.field_g, "", "menu_character_6");
                                                    je.field_O[0].field_v = je.field_O[0].field_v - 200;
                                                    je.field_O[1].field_v = je.field_O[1].field_v - 200;
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
                  if (var5 >= var39[var4_int].length) {
                    var4_int++;
                    continue L1;
                  } else {
                    L14: {
                      if (var5 < 3) {
                        var39[var4_int][var5] = var39[0][var5];
                        break L14;
                      } else {
                        if (1 != var4_int) {
                          if (var4_int != 2) {
                            break L14;
                          } else {
                            var6 = var39[0][var5] >> 129444080 & 255;
                            var7 = (65376 & var39[0][var5]) >> 977946344;
                            var8_int = var39[0][var5] & 255;
                            var39[var4_int][var5] = ne.a(var8_int / 2, ne.a(var6 / 2 << -1579543472, var7 / 2 << -215758840));
                            break L14;
                          }
                        } else {
                          var39[var4_int][var5] = 16777215;
                          break L14;
                        }
                      }
                    }
                    var5++;
                    continue L13;
                  }
                }
              }
            }
          } else {
            var5 = 0;
            L15: while (true) {
              if (var37[var4_int].length <= var5) {
                var4_int++;
                continue L0;
              } else {
                L16: {
                  if (3 > var5) {
                    var37[var4_int][var5] = var37[0][var5];
                    break L16;
                  } else {
                    var37[var4_int][var5] = 1;
                    break L16;
                  }
                }
                var5++;
                continue L15;
              }
            }
          }
        }
    }

    final void d(boolean param0) {
        int var4 = field_A ? 1 : 0;
        Object var2 = null == rh.field_p ? ol.field_e : rh.field_p;
        if (mc.b((byte) 123)) {
            af.a((java.awt.Canvas) var2, null != rh.field_p ? true : ha.field_k, param0);
            return;
        }
        bg.a((byte) -75, (java.awt.Canvas) var2);
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
        ((fleas) this).field_C = null;
        ((fleas) this).field_N = null;
        ((fleas) this).field_D = null;
        ((fleas) this).field_n = null;
    }

    final static void h(byte param0) {
        int var1 = 0;
        int var3 = field_A ? 1 : 0;
        l.field_b.c(12445);
        for (var1 = 0; var1 < 32; var1++) {
            bh.field_q[var1] = 0L;
        }
        int var2 = -69 / ((param0 - -16) / 46);
        for (var1 = 0; var1 < 32; var1++) {
            ub.field_c[var1] = 0L;
        }
        w.field_r = 0;
    }

    private final boolean b(boolean param0, int param1) {
        int var3 = 0;
        byte[] var3_ref_byte__ = null;
        String var4_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        var10 = field_A ? 1 : 0;
        ei.b(true);
        if (null == pb.field_a) {
          if (null == ib.field_f) {
            if (jc.field_e != null) {
              jj.a(65.0f, cb.field_q, true);
              ((fleas) this).d(true);
              td.field_j = wk.a(jc.field_e, "", "Flea Circus Titlescreen");
              boolean discarded$3 = gg.field_h.a(field_K, ob.field_d, 11498, 0, td.field_j);
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
                  boolean discarded$4 = gg.field_h.a(field_K, ob.field_d, 11498, 0, hf.field_e[var3]);
                  var3++;
                  continue L0;
                }
              }
            } else {
              if (null == a.field_a) {
                if (hm.field_g != null) {
                  jj.a(72.0f, f.field_H, true);
                  ((fleas) this).d(true);
                  this.g((byte) -111);
                  de.field_h = null;
                  hm.field_g = null;
                  fleas.h((byte) -116);
                  return false;
                } else {
                  if (pa.field_l != null) {
                    jj.a(98.0f, vi.field_c, true);
                    ((fleas) this).d(true);
                    var5 = pl.field_l[0];
                    ia.field_m[0] = new kh[var5];
                    var6 = 0;
                    L1: while (true) {
                      if ((var5 ^ -1) >= (var6 ^ -1)) {
                        var5 = pl.field_l[1];
                        ia.field_m[1] = new kh[var5];
                        var6 = 0;
                        L2: while (true) {
                          if ((var6 ^ -1) <= (var5 ^ -1)) {
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
                            L4: {
                              var4_ref = "classic_" + (1 + var6) + ".lvl";
                              var21 = pa.field_l.a(0, var4_ref, "");
                              var19 = var21;
                              var17 = var19;
                              var15 = var17;
                              var13 = var15;
                              var3_ref_byte__ = var13;
                              if (var3_ref_byte__ != null) {
                                ia.field_m[1][var6] = new kh(var21);
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                            var6++;
                            continue L2;
                          }
                        }
                      } else {
                        L5: {
                          var4_ref = 1 + var6 + ".lvl";
                          var20 = pa.field_l.a(0, var4_ref, "");
                          var18 = var20;
                          var16 = var18;
                          var14 = var16;
                          var12 = var14;
                          var3_ref_byte__ = var12;
                          if (var3_ref_byte__ != null) {
                            ia.field_m[0][var6] = new kh(var20);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var6++;
                        continue L1;
                      }
                    }
                  } else {
                    var3 = 0;
                    L6: while (true) {
                      if ((var3 ^ -1) <= -12) {
                        L7: {
                          ab.field_b = 0;
                          k.a(0, td.field_j);
                          var3 = 3072;
                          var4 = 30;
                          var5 = 15;
                          var6 = 10;
                          var7 = -2;
                          if (param1 > 0) {
                            break L7;
                          } else {
                            var11 = null;
                            re[] discarded$5 = fleas.a((ih) null, -35);
                            break L7;
                          }
                        }
                        var8 = ((fleas) this).field_C.field_w + -20;
                        var9 = ((fleas) this).field_C.field_t - 20;
                        rb.a(var5, var6, var9, ((fleas) this).field_C, var8, var3, (byte) 125, var4, var7);
                        ue.a((byte) -122, ((fleas) this).field_N);
                        mc.a(((fleas) this).field_D, ih.field_m, 0);
                        pa.a(false, jj.field_P);
                        el.a((java.applet.Applet) this, 150, (byte) 44, 15488514, jd.field_g, 1052688);
                        we.a(50, 106);
                        qb.a(50, 114);
                        fleas.h((byte) -71);
                        return true;
                      } else {
                        pi.field_b[var3] = new t(var3);
                        var3++;
                        continue L6;
                      }
                    }
                  }
                }
              } else {
                jj.a(70.0f, f.field_H, true);
                ((fleas) this).d(true);
                cb.field_u = kl.a(252, a.field_a, "basic", "unachieved");
                td.field_m = kl.a(252, a.field_a, "basic", "orbcoin");
                em.a(td.field_m, (byte) -85);
                mf.field_g = kl.a(252, a.field_a, "basic", "locked");
                ve.field_d = (fa) (Object) ub.a("roman12", a.field_a, "", pf.field_b, 32);
                lk.field_Q = (fa) (Object) ub.a("roman20", a.field_a, "", pf.field_b, 32);
                a.field_a = null;
                fleas.h((byte) 33);
                return false;
              }
            }
          } else {
            jj.a(60.0f, ri.field_s, true);
            ((fleas) this).d(true);
            wi.b(-14277);
            ib.field_f = null;
            fleas.h((byte) 76);
            return false;
          }
        } else {
          L8: {
            if (!a.field_a.b((byte) -100)) {
              break L8;
            } else {
              if (!a.field_a.a("basic", -116)) {
                break L8;
              } else {
                if (!a.field_a.a("roman12", -112)) {
                  break L8;
                } else {
                  if (a.field_a.a("roman20", -113)) {
                    L9: {
                      if (!pb.field_a.b((byte) -110)) {
                        break L9;
                      } else {
                        if (pb.field_a.a(-116)) {
                          L10: {
                            if (!ib.field_f.b((byte) -125)) {
                              break L10;
                            } else {
                              if (!ib.field_f.a(-128)) {
                                break L10;
                              } else {
                                L11: {
                                  if (!pa.field_l.b((byte) -102)) {
                                    break L11;
                                  } else {
                                    if (!pa.field_l.a(-22)) {
                                      break L11;
                                    } else {
                                      L12: {
                                        if (!ob.field_d.b((byte) -108)) {
                                          break L12;
                                        } else {
                                          if (!ob.field_d.a(-72)) {
                                            break L12;
                                          } else {
                                            L13: {
                                              if (!jc.field_e.b((byte) -104)) {
                                                break L13;
                                              } else {
                                                if (!jc.field_e.a(-36)) {
                                                  break L13;
                                                } else {
                                                  L14: {
                                                    if (!hm.field_g.b((byte) -124)) {
                                                      break L14;
                                                    } else {
                                                      if (hm.field_g.a(-76)) {
                                                        L15: {
                                                          if (!de.field_h.b((byte) -122)) {
                                                            break L15;
                                                          } else {
                                                            if (!de.field_h.a(-54)) {
                                                              break L15;
                                                            } else {
                                                              L16: {
                                                                if (!pf.field_b.b((byte) -106)) {
                                                                  break L16;
                                                                } else {
                                                                  if (!pf.field_b.a("roman12", -106)) {
                                                                    break L16;
                                                                  } else {
                                                                    if (!pf.field_b.a("roman20", -118)) {
                                                                      break L16;
                                                                    } else {
                                                                      jj.a(55.0f, ri.field_s, true);
                                                                      if (!param0) {
                                                                        return false;
                                                                      } else {
                                                                        wh.a(-128);
                                                                        ((fleas) this).d(true);
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
                                                        break L14;
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
                          break L9;
                        }
                      }
                    }
                    jj.a(5.0f, sa.a(pb.field_a, "", fk.field_x, vf.field_n, (byte) 46), true);
                    return false;
                  } else {
                    break L8;
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
        int var2 = 0;
        int var3 = 0;
        hi var5 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
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
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (rh.field_p == null) {
            stackOut_5_0 = this;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = this;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        L2: {
          ((fleas) this).b(stackIn_6_1 != 0, (byte) 63);
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
              if (!ei.field_H[1]) {
                break L4;
              } else {
                var2 = -1 + hj.field_a.length;
                L5: while (true) {
                  if ((var2 ^ -1) > -1) {
                    break L4;
                  } else {
                    hj.field_a[var2] = 999;
                    var2--;
                    continue L5;
                  }
                }
              }
            }
            L6: {
              if (!ei.field_H[2]) {
                break L6;
              } else {
                if (0 != (ab.field_b ^ -1)) {
                  break L6;
                } else {
                  td.b(120);
                  break L6;
                }
              }
            }
            if (!ei.field_H[86]) {
              break L3;
            } else {
              L7: {
                if (ei.field_H[16]) {
                  hg.a(-25389, 0, 255, 0);
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (ei.field_H[17]) {
                  hg.a(-25389, 1, 254, 0);
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (!ei.field_H[18]) {
                  break L9;
                } else {
                  hg.a(-25389, 2, 253, 0);
                  break L9;
                }
              }
              L10: {
                if (ei.field_H[19]) {
                  hg.a(-25389, 3, 252, 0);
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (!ei.field_H[20]) {
                  break L11;
                } else {
                  hg.a(param0 + -46823, 4, 251, 0);
                  break L11;
                }
              }
              L12: {
                if (ei.field_H[21]) {
                  hg.a(param0 + -46823, 5, 250, 0);
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (ei.field_H[22]) {
                  hg.a(-25389, 6, 249, 0);
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                if (ei.field_H[23]) {
                  hg.a(-25389, 7, 248, 0);
                  break L14;
                } else {
                  break L14;
                }
              }
              L15: {
                if (ei.field_H[24]) {
                  hg.a(-25389, 8, 247, 0);
                  break L15;
                } else {
                  break L15;
                }
              }
              L16: {
                if (ei.field_H[25]) {
                  hg.a(param0 + -46823, 9, 246, 0);
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                if (ei.field_H[32]) {
                  hg.a(-25389, 10, 245, 0);
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                if (ei.field_H[33]) {
                  hg.a(-25389, 11, 244, 0);
                  break L18;
                } else {
                  break L18;
                }
              }
              L19: {
                if (ei.field_H[34]) {
                  hg.a(-25389, 12, 243, 0);
                  break L19;
                } else {
                  break L19;
                }
              }
              L20: {
                if (ei.field_H[35]) {
                  hg.a(-25389, 13, 242, 0);
                  break L20;
                } else {
                  break L20;
                }
              }
              L21: {
                if (ei.field_H[36]) {
                  hg.a(param0 + -46823, 14, 241, 0);
                  break L21;
                } else {
                  break L21;
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
        L22: {
          if (!mc.b((byte) 80)) {
            break L22;
          } else {
            ((fleas) this).f((byte) -124);
            if (!mc.b((byte) -112)) {
              break L22;
            } else {
              L23: {
                if (nl.a(52)) {
                  boolean discarded$1 = this.b(false, 47);
                  break L23;
                } else {
                  break L23;
                }
              }
              return;
            }
          }
        }
        L24: {
          if (param0 == 21434) {
            break L24;
          } else {
            ((fleas) this).field_C = null;
            break L24;
          }
        }
        L25: {
          te.b(0, al.field_f);
          if (this.b(true, 46)) {
            md.field_T = true;
            break L25;
          } else {
            break L25;
          }
        }
        L26: {
          if (!qh.c((byte) 79)) {
            L27: while (true) {
              var5 = (hi) (Object) a.field_e.e(-22033);
              if (var5 != null) {
                bg.a(var5, 4, -90);
                continue L27;
              } else {
                break L26;
              }
            }
          } else {
            break L26;
          }
        }
        L28: while (true) {
          if (!tb.a(-55, ne.field_b)) {
            L29: {
              dk.b((byte) 41, 0);
              if (!lk.i(param0 ^ 21424)) {
                break L29;
              } else {
                var2 = ((fleas) this).e(false);
                if (var2 == 2) {
                  id.a(false);
                  break L29;
                } else {
                  break L29;
                }
              }
            }
            hg.a(-79);
            return;
          } else {
            ((fleas) this).g(-12);
            continue L28;
          }
        }
    }

    private final void i(byte param0) {
        int var3 = 0;
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
                if ((af.field_g ^ -1) == -1) {
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
        var3.a(-11, param1.field_n);
        var3.b((byte) 76, param1.field_m);
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
        ((fleas) this).a(9, 11, 22, false, 0, 8, 8, 10);
        ei var2 = new ei();
        var2.b(9, 128, 238);
        hd.a(220, var2, 22050, 11, 22050, fg.field_q, (java.awt.Component) (Object) ol.field_e, true);
        fb.field_c = 0;
        rg.field_n = 1;
        cm.field_j = 0;
        ((fleas) this).a(false, true, true, true, param0 ^ 100);
        field_F = new Random();
        if (param0 != -14) {
            return;
        }
        ei.b(true);
    }

    public final void init() {
        ((fleas) this).a(12, 8, "fleacircus");
    }

    private final void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_0 = 0;
        sf stackIn_26_1 = null;
        int stackOut_23_0 = 0;
        int stackOut_25_0 = 0;
        sf stackOut_25_1 = null;
        int stackOut_24_0 = 0;
        sf stackOut_24_1 = null;
        var8 = field_A ? 1 : 0;
        if (param0 < -90) {
          L0: {
            if ((param1 ^ -1) <= -339) {
              break L0;
            } else {
              L1: {
                if (-3 < (param1 ^ -1)) {
                  break L1;
                } else {
                  if (2 > param2) {
                    break L1;
                  } else {
                    if (-643 >= (param2 ^ -1)) {
                      break L1;
                    } else {
                      var4 = param2 / 16;
                      var5 = param1 / 16;
                      var7 = 4 * var5;
                      var6 = var4 * 4;
                      if ((var4 ^ -1) > -1) {
                        return;
                      } else {
                        L2: {
                          if (0 > var5) {
                            break L2;
                          } else {
                            if (40 <= var4) {
                              break L2;
                            } else {
                              if (-22 >= (var5 ^ -1)) {
                                break L2;
                              } else {
                                param2 = var6;
                                L3: while (true) {
                                  if (param2 >= var6 - -4) {
                                    L4: {
                                      stackOut_23_0 = -109;
                                      stackIn_25_0 = stackOut_23_0;
                                      stackIn_24_0 = stackOut_23_0;
                                      if (mh.field_u != 1) {
                                        stackOut_25_0 = stackIn_25_0;
                                        stackOut_25_1 = el.field_C;
                                        stackIn_26_0 = stackOut_25_0;
                                        stackIn_26_1 = stackOut_25_1;
                                        break L4;
                                      } else {
                                        stackOut_24_0 = stackIn_24_0;
                                        stackOut_24_1 = rl.field_g;
                                        stackIn_26_0 = stackOut_24_0;
                                        stackIn_26_1 = stackOut_24_1;
                                        break L4;
                                      }
                                    }
                                    pd discarded$2 = fh.a((byte) stackIn_26_0, stackIn_26_1, 100, 63);
                                    ik.field_R = false;
                                    fl.field_c[var4][var5] = (char)(1 + mh.field_u);
                                    this.a((byte) -91, var5, var4);
                                    param2 = var6;
                                    L5: while (true) {
                                      if (param2 >= 4 + var6) {
                                        break L1;
                                      } else {
                                        param1 = var7;
                                        L6: while (true) {
                                          if ((var7 - -4 ^ -1) >= (param1 ^ -1)) {
                                            param2++;
                                            continue L5;
                                          } else {
                                            L7: {
                                              if (-2 == (mh.field_u ^ -1)) {
                                                lh.field_e[param2][param1] = 1;
                                                break L7;
                                              } else {
                                                break L7;
                                              }
                                            }
                                            L8: {
                                              if (-3 != (mh.field_u ^ -1)) {
                                                break L8;
                                              } else {
                                                if (param2 - var6 == -param1 + (var7 + 3)) {
                                                  lh.field_e[param2][param1] = 1;
                                                  break L8;
                                                } else {
                                                  break L8;
                                                }
                                              }
                                            }
                                            L9: {
                                              if (-4 != (mh.field_u ^ -1)) {
                                                break L9;
                                              } else {
                                                if ((-var7 + param1 ^ -1) != (-var6 + param2 ^ -1)) {
                                                  break L9;
                                                } else {
                                                  lh.field_e[param2][param1] = 1;
                                                  break L9;
                                                }
                                              }
                                            }
                                            param1++;
                                            continue L6;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    param1 = var7;
                                    L10: while (true) {
                                      if ((4 + var7 ^ -1) >= (param1 ^ -1)) {
                                        param2++;
                                        continue L3;
                                      } else {
                                        if (0 == lh.field_e[param2][param1]) {
                                          param1++;
                                          continue L10;
                                        } else {
                                          L11: {
                                            if (ik.field_R) {
                                              pd discarded$3 = fh.a((byte) 107, gi.field_d, 100, 96);
                                              ik.field_R = false;
                                              break L11;
                                            } else {
                                              break L11;
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
              break L0;
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
        int var5 = 0;
        int var6 = 0;
        re var6_ref = null;
        int var7 = field_A ? 1 : 0;
        if (param1 != -6383) {
            Object var8 = null;
            re[] discarded$0 = fleas.a((ih) null, -51);
        }
        int var2 = param0.b(8, (byte) -87);
        if (-1 > (var2 ^ -1)) {
            return null;
        }
        int var3 = param0.b(12, (byte) -87);
        re[] var4 = new re[var3];
        for (var5 = 0; (var5 ^ -1) > (var3 ^ -1); var5++) {
            if (fb.a((byte) 98, param0)) {
                var6_ref = new re();
                int discarded$1 = param0.b(24, (byte) -87);
                int discarded$2 = param0.b(24, (byte) -87);
                var6_ref.field_a = param0.b(24, (byte) -87);
                int discarded$3 = param0.b(9, (byte) -87);
                int discarded$4 = param0.b(12, (byte) -87);
                int discarded$5 = param0.b(12, (byte) -87);
                int discarded$6 = param0.b(12, (byte) -87);
                var4[var5] = var6_ref;
            } else {
                var6 = param0.b(qh.a(3, -1 + var5), (byte) -87);
                var4[var5] = var4[var6];
            }
        }
        return var4;
    }

    private final void l(int param0) {
        int var2 = 0;
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
        ok var25 = null;
        int stackIn_59_0 = 0;
        int stackIn_62_0 = 0;
        vg stackIn_66_0 = null;
        vg stackIn_67_0 = null;
        vg stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        vg stackIn_69_0 = null;
        vg stackIn_70_0 = null;
        vg stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        int stackOut_58_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        vg stackOut_65_0 = null;
        vg stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        vg stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        vg stackOut_68_0 = null;
        vg stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        vg stackOut_69_0 = null;
        int stackOut_69_1 = 0;
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
          ((fleas) this).field_M = 1.0 + ma.a((double)ni.field_j / 10.0, 109);
          if (lk.field_D.field_k) {
            lk.field_D.field_d = (int)(30.0 + ((fleas) this).field_M * 4.0);
            lk.field_D.field_a = (int)(-(2.0 * ((fleas) this).field_M) + 415.0);
            lk.field_D.field_l = (int)(-(((fleas) this).field_M * 2.0) + 395.0);
            lk.field_D.field_n = (int)(4.0 * ((fleas) this).field_M + 220.0);
            break L1;
          } else {
            if (-1 < (mg.field_d ^ -1)) {
              break L1;
            } else {
              si.field_y.field_a = (int)(415.0 - 2.0 * ((fleas) this).field_M);
              si.field_y.field_n = (int)(4.0 * ((fleas) this).field_M + 220.0);
              si.field_y.field_l = (int)(395.0 - ((fleas) this).field_M * 2.0);
              si.field_y.field_d = (int)(4.0 * ((fleas) this).field_M + 30.0);
              break L1;
            }
          }
        }
        L2: {
          var2 = tj.field_a;
          if ((nl.field_c[field_E].length ^ -1) < (tj.field_a ^ -1)) {
            break L2;
          } else {
            var2 = -1 + nl.field_c[field_E].length;
            break L2;
          }
        }
        L3: while (true) {
          if (!wf.b(-118)) {
            L4: {
              if ((kc.field_f ^ -1) != -1) {
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
                    if ((qh.field_z ^ -1) != -1) {
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
                      pd discarded$15 = ik.a(wj.field_b[0], (byte) -84);
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    L16: {
                      var16 = ia.field_m[field_E][var2];
                      if (jk.field_l == 10) {
                        break L16;
                      } else {
                        if ((pl.field_f ^ -1) <= (var16.field_e ^ -1)) {
                          break L16;
                        } else {
                          L17: {
                            if (qe.field_k < 2) {
                              break L17;
                            } else {
                              if (ji.field_a != 2) {
                                break L17;
                              } else {
                                break L16;
                              }
                            }
                          }
                          stackOut_58_0 = 0;
                          stackIn_59_0 = stackOut_58_0;
                          break L15;
                        }
                      }
                    }
                    stackOut_57_0 = 1;
                    stackIn_59_0 = stackOut_57_0;
                    break L15;
                  }
                  L18: {
                    var17 = stackIn_59_0;
                    if ((var16.field_e ^ -1) >= (var16.field_f - jg.field_e ^ -1)) {
                      stackOut_61_0 = 0;
                      stackIn_62_0 = stackOut_61_0;
                      break L18;
                    } else {
                      stackOut_60_0 = 1;
                      stackIn_62_0 = stackOut_60_0;
                      break L18;
                    }
                  }
                  L19: {
                    var18 = stackIn_62_0;
                    if (var18 == 0) {
                      break L19;
                    } else {
                      if (0 <= mg.field_d) {
                        break L19;
                      } else {
                        mg.field_d = 0;
                        break L19;
                      }
                    }
                  }
                  L20: {
                    stackOut_65_0 = lk.field_D;
                    stackIn_67_0 = stackOut_65_0;
                    stackIn_66_0 = stackOut_65_0;
                    if (var17 == 0) {
                      stackOut_67_0 = (vg) (Object) stackIn_67_0;
                      stackOut_67_1 = 0;
                      stackIn_68_0 = stackOut_67_0;
                      stackIn_68_1 = stackOut_67_1;
                      break L20;
                    } else {
                      stackOut_66_0 = (vg) (Object) stackIn_66_0;
                      stackOut_66_1 = 1;
                      stackIn_68_0 = stackOut_66_0;
                      stackIn_68_1 = stackOut_66_1;
                      break L20;
                    }
                  }
                  L21: {
                    stackIn_68_0.field_k = stackIn_68_1 != 0;
                    stackOut_68_0 = si.field_y;
                    stackIn_70_0 = stackOut_68_0;
                    stackIn_69_0 = stackOut_68_0;
                    if (lk.field_D.field_k) {
                      stackOut_70_0 = (vg) (Object) stackIn_70_0;
                      stackOut_70_1 = 0;
                      stackIn_71_0 = stackOut_70_0;
                      stackIn_71_1 = stackOut_70_1;
                      break L21;
                    } else {
                      stackOut_69_0 = (vg) (Object) stackIn_69_0;
                      stackOut_69_1 = 1;
                      stackIn_71_0 = stackOut_69_0;
                      stackIn_71_1 = stackOut_69_1;
                      break L21;
                    }
                  }
                  L22: {
                    stackIn_71_0.field_k = stackIn_71_1 != 0;
                    if (var17 == 0) {
                      break L22;
                    } else {
                      L23: {
                        if (5 == tj.field_a) {
                          hg.a(-25389, 0, 255, tj.field_a);
                          if (tg.field_g) {
                            hg.a(-25389, 12, 243, tj.field_a);
                            break L23;
                          } else {
                            break L23;
                          }
                        } else {
                          break L23;
                        }
                      }
                      L24: {
                        if (tj.field_a != 10) {
                          break L24;
                        } else {
                          hg.a(-25389, 1, 254, tj.field_a);
                          if (tg.field_g) {
                            hg.a(-25389, 13, 242, tj.field_a);
                            break L24;
                          } else {
                            break L24;
                          }
                        }
                      }
                      L25: {
                        if (tj.field_a != 20) {
                          break L25;
                        } else {
                          hg.a(-25389, 2, 253, tj.field_a);
                          if (tg.field_g) {
                            hg.a(-25389, 14, 241, tj.field_a);
                            break L25;
                          } else {
                            break L25;
                          }
                        }
                      }
                      if ((pl.field_f ^ -1) == (ml.field_O ^ -1)) {
                        L26: {
                          if (0 != tj.field_a) {
                            break L26;
                          } else {
                            if (field_E == 1) {
                              hg.a(-25389, 5, 250, tj.field_a);
                              break L26;
                            } else {
                              break L26;
                            }
                          }
                        }
                        L27: {
                          if (-2 != (tj.field_a ^ -1)) {
                            break L27;
                          } else {
                            if (-2 != (field_E ^ -1)) {
                              break L27;
                            } else {
                              hg.a(-25389, 6, 249, tj.field_a);
                              break L27;
                            }
                          }
                        }
                        L28: {
                          if (-3 != (tj.field_a ^ -1)) {
                            break L28;
                          } else {
                            if (field_E == 1) {
                              hg.a(-25389, 7, 248, tj.field_a);
                              break L28;
                            } else {
                              break L28;
                            }
                          }
                        }
                        L29: {
                          if (3 != tj.field_a) {
                            break L29;
                          } else {
                            if (field_E == 1) {
                              hg.a(-25389, 8, 247, tj.field_a);
                              break L29;
                            } else {
                              break L29;
                            }
                          }
                        }
                        L30: {
                          if ((tj.field_a ^ -1) != -5) {
                            break L30;
                          } else {
                            if ((field_E ^ -1) == -2) {
                              hg.a(-25389, 9, 246, tj.field_a);
                              break L30;
                            } else {
                              break L30;
                            }
                          }
                        }
                        oa.a(10, true, -125);
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                  }
                  L31: {
                    ol.field_f.field_t = fl.field_f;
                    ol.field_f.c(47);
                    fl.field_f = ol.field_f.field_t;
                    if (fl.field_f) {
                      L32: {
                        var19 = ag.field_f / 16;
                        var20 = kc.field_b / 16;
                        var21 = -1;
                        if ((var20 ^ -1) <= -22) {
                          break L32;
                        } else {
                          if (var19 >= 40) {
                            break L32;
                          } else {
                            if ((var20 ^ -1) > -1) {
                              break L32;
                            } else {
                              if (0 <= var19) {
                                var21 = fl.field_c[var19][var20];
                                break L32;
                              } else {
                                break L32;
                              }
                            }
                          }
                        }
                      }
                      var22 = ob.field_c.length + -1;
                      L33: while (true) {
                        if (var22 < 0) {
                          break L31;
                        } else {
                          L34: {
                            if ((var22 ^ -1) == (var21 ^ -1)) {
                              L35: {
                                ob.field_c[var22].field_l = var19 * 16;
                                ob.field_c[var22].field_a = var20 * 16;
                                ob.field_c[var22].field_l = ob.field_c[var22].field_l - ob.field_c[var22].field_n / 2;
                                ob.field_c[var22].field_a = kc.field_b / 16 * 16;
                                ob.field_c[var22].field_a = ob.field_c[var22].field_a + 32;
                                ob.field_c[var22].field_C = var19 * 16;
                                ob.field_c[var22].field_H = var20 * 16;
                                var25 = ob.field_c[var22];
                                var23 = ob.field_c[var22];
                                ob.field_c[var22].field_z = 16;
                                var25.field_G = 16;
                                if ((ob.field_c[var22].field_l ^ -1) > -1) {
                                  ob.field_c[var22].field_l = 0;
                                  break L35;
                                } else {
                                  break L35;
                                }
                              }
                              L36: {
                                if (ob.field_c[var22].field_a >= 0) {
                                  break L36;
                                } else {
                                  ob.field_c[var22].field_a = 0;
                                  break L36;
                                }
                              }
                              if (ob.field_c[var22].field_l - -ob.field_c[var22].field_n <= 640) {
                                break L34;
                              } else {
                                ob.field_c[var22].field_l = 640 + -ob.field_c[var22].field_n;
                                break L34;
                              }
                            } else {
                              var23 = ob.field_c[var22];
                              ob.field_c[var22].field_z = 0;
                              var23.field_G = 0;
                              break L34;
                            }
                          }
                          ob.field_c[var22].d(98);
                          var22--;
                          continue L33;
                        }
                      }
                    } else {
                      break L31;
                    }
                  }
                  L37: {
                    if (kc.field_f == 1) {
                      if (oa.field_n) {
                        break L37;
                      } else {
                        this.b(-94, kc.field_b, ag.field_f);
                        break L37;
                      }
                    } else {
                      oa.field_n = false;
                      break L37;
                    }
                  }
                  L38: {
                    lk.field_D.b(true);
                    si.field_y.b(true);
                    if (lk.field_D.field_g) {
                      oa.a(10, true, 91);
                      pd discarded$16 = ik.a(wj.field_b[0], (byte) -84);
                      break L38;
                    } else {
                      break L38;
                    }
                  }
                  L39: {
                    if (!si.field_y.field_g) {
                      break L39;
                    } else {
                      L40: {
                        if (0 >= qg.field_c) {
                          break L40;
                        } else {
                          if (0 == nb.field_b) {
                            break L39;
                          } else {
                            break L40;
                          }
                        }
                      }
                      cf.a(-25319);
                      pd discarded$17 = ik.a(wj.field_b[0], (byte) -84);
                      break L39;
                    }
                  }
                  L41: {
                    if (var17 != 0) {
                      L42: {
                        if (120 > pg.field_f) {
                          pg.field_f = pg.field_f + 1;
                          break L42;
                        } else {
                          break L42;
                        }
                      }
                      L43: {
                        if (-11 != (jk.field_l ^ -1)) {
                          break L43;
                        } else {
                          if (-361 >= (pg.field_f ^ -1)) {
                            break L43;
                          } else {
                            if (em.field_b != 0) {
                              break L43;
                            } else {
                              if (qh.field_y != 0) {
                                break L43;
                              } else {
                                pg.field_f = pg.field_f + 1;
                                break L43;
                              }
                            }
                          }
                        }
                      }
                      if (-1 == (ni.field_j & 1 ^ -1)) {
                        kb.field_i = (kb.field_i + 1) % 8;
                        var3 = 0;
                        L44: while (true) {
                          if ((var3 ^ -1) <= (oe.field_a ^ -1)) {
                            break L41;
                          } else {
                            L45: {
                              L46: {
                                var4 = fl.field_c[id.field_h[var3]][uf.field_e[var3]];
                                if (var4 == ci.field_c[var3]) {
                                  break L46;
                                } else {
                                  if ((fg.field_u[var3] ^ -1) != (var4 ^ -1)) {
                                    break L45;
                                  } else {
                                    break L46;
                                  }
                                }
                              }
                              if (0 == ok.field_s[var3]) {
                                L47: {
                                  if (-1 == (kb.field_i ^ -1)) {
                                    fl.field_c[id.field_h[var3]][uf.field_e[var3]] = (char)ci.field_c[var3];
                                    break L47;
                                  } else {
                                    break L47;
                                  }
                                }
                                if (-5 == (kb.field_i ^ -1)) {
                                  fl.field_c[id.field_h[var3]][uf.field_e[var3]] = (char)fg.field_u[var3];
                                  break L45;
                                } else {
                                  break L45;
                                }
                              } else {
                                if (-9 != (ci.field_c[var3] ^ -1)) {
                                  break L45;
                                } else {
                                  var7 = id.field_h[var3] * 16;
                                  var13 = 0;
                                  var8 = uf.field_e[var3] * 16;
                                  var4 = 0;
                                  L48: while (true) {
                                    if ((var4 ^ -1) <= (nb.field_b ^ -1)) {
                                      if (1 == var13) {
                                        L49: {
                                          if (-9 != (fl.field_c[id.field_h[var3]][uf.field_e[var3]] ^ -1)) {
                                            break L49;
                                          } else {
                                            pd discarded$18 = fh.a((byte) -91, bf.field_d, 100, 63);
                                            break L49;
                                          }
                                        }
                                        fl.field_c[id.field_h[var3]][uf.field_e[var3]] = (char)9;
                                        break L45;
                                      } else {
                                        fl.field_c[id.field_h[var3]][uf.field_e[var3]] = (char)8;
                                        break L45;
                                      }
                                    } else {
                                      L50: {
                                        if (0 != cl.field_d[var4]) {
                                          break L50;
                                        } else {
                                          if ((var7 ^ -1) < (qg.field_a[var4] ^ -1)) {
                                            break L50;
                                          } else {
                                            if ((var8 ^ -1) < (dh.field_b[var4] ^ -1)) {
                                              break L50;
                                            } else {
                                              if ((qg.field_a[var4] ^ -1) <= (16 + var7 ^ -1)) {
                                                break L50;
                                              } else {
                                                if ((dh.field_b[var4] ^ -1) > (var8 - -16 ^ -1)) {
                                                  var13 = 1;
                                                  break L50;
                                                } else {
                                                  break L50;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var4++;
                                      continue L48;
                                    }
                                  }
                                }
                              }
                            }
                            var3++;
                            continue L44;
                          }
                        }
                      } else {
                        return;
                      }
                    } else {
                      if (-1 == (ni.field_j & 1 ^ -1)) {
                        kb.field_i = (kb.field_i + 1) % 8;
                        var3 = 0;
                        if ((var3 ^ -1) <= (oe.field_a ^ -1)) {
                          break L41;
                        } else {
                          L51: {
                            L52: {
                              var4 = fl.field_c[id.field_h[var3]][uf.field_e[var3]];
                              if (var4 == ci.field_c[var3]) {
                                break L52;
                              } else {
                                if ((fg.field_u[var3] ^ -1) != (var4 ^ -1)) {
                                  break L51;
                                } else {
                                  break L52;
                                }
                              }
                            }
                            if (0 == ok.field_s[var3]) {
                              L53: while (true) {
                                L54: {
                                  if (-1 == (kb.field_i ^ -1)) {
                                    fl.field_c[id.field_h[var3]][uf.field_e[var3]] = (char)ci.field_c[var3];
                                    break L54;
                                  } else {
                                    break L54;
                                  }
                                }
                                L55: {
                                  if (-5 == (kb.field_i ^ -1)) {
                                    fl.field_c[id.field_h[var3]][uf.field_e[var3]] = (char)fg.field_u[var3];
                                    break L55;
                                  } else {
                                    break L55;
                                  }
                                }
                                L56: while (true) {
                                  var3++;
                                  if ((var3 ^ -1) <= (oe.field_a ^ -1)) {
                                    break L41;
                                  } else {
                                    L57: {
                                      var4 = fl.field_c[id.field_h[var3]][uf.field_e[var3]];
                                      if (var4 == ci.field_c[var3]) {
                                        break L57;
                                      } else {
                                        if ((fg.field_u[var3] ^ -1) != (var4 ^ -1)) {
                                          continue L56;
                                        } else {
                                          break L57;
                                        }
                                      }
                                    }
                                    if (0 == ok.field_s[var3]) {
                                      continue L53;
                                    } else {
                                      if (-9 != (ci.field_c[var3] ^ -1)) {
                                        continue L56;
                                      } else {
                                        var7 = id.field_h[var3] * 16;
                                        var13 = 0;
                                        var8 = uf.field_e[var3] * 16;
                                        var4 = 0;
                                        L58: while (true) {
                                          if ((var4 ^ -1) <= (nb.field_b ^ -1)) {
                                            if (1 == var13) {
                                              L59: {
                                                if (-9 != (fl.field_c[id.field_h[var3]][uf.field_e[var3]] ^ -1)) {
                                                  break L59;
                                                } else {
                                                  pd discarded$19 = fh.a((byte) -91, bf.field_d, 100, 63);
                                                  break L59;
                                                }
                                              }
                                              fl.field_c[id.field_h[var3]][uf.field_e[var3]] = (char)9;
                                              continue L56;
                                            } else {
                                              fl.field_c[id.field_h[var3]][uf.field_e[var3]] = (char)8;
                                              continue L56;
                                            }
                                          } else {
                                            L60: {
                                              if (0 != cl.field_d[var4]) {
                                                break L60;
                                              } else {
                                                if ((var7 ^ -1) < (qg.field_a[var4] ^ -1)) {
                                                  break L60;
                                                } else {
                                                  if ((var8 ^ -1) < (dh.field_b[var4] ^ -1)) {
                                                    break L60;
                                                  } else {
                                                    if ((qg.field_a[var4] ^ -1) <= (16 + var7 ^ -1)) {
                                                      break L60;
                                                    } else {
                                                      if ((dh.field_b[var4] ^ -1) > (var8 - -16 ^ -1)) {
                                                        var13 = 1;
                                                        break L60;
                                                      } else {
                                                        break L60;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            var4++;
                                            continue L58;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              if (-9 != (ci.field_c[var3] ^ -1)) {
                                break L51;
                              } else {
                                var7 = id.field_h[var3] * 16;
                                var13 = 0;
                                var8 = uf.field_e[var3] * 16;
                                var4 = 0;
                                L61: while (true) {
                                  if ((var4 ^ -1) <= (nb.field_b ^ -1)) {
                                    L62: while (true) {
                                      L63: {
                                        if (1 == var13) {
                                          L64: {
                                            if (-9 != (fl.field_c[id.field_h[var3]][uf.field_e[var3]] ^ -1)) {
                                              break L64;
                                            } else {
                                              pd discarded$20 = fh.a((byte) -91, bf.field_d, 100, 63);
                                              break L64;
                                            }
                                          }
                                          fl.field_c[id.field_h[var3]][uf.field_e[var3]] = (char)9;
                                          break L63;
                                        } else {
                                          fl.field_c[id.field_h[var3]][uf.field_e[var3]] = (char)8;
                                          break L63;
                                        }
                                      }
                                      L65: while (true) {
                                        var3++;
                                        if ((var3 ^ -1) <= (oe.field_a ^ -1)) {
                                          break L41;
                                        } else {
                                          L66: {
                                            var4 = fl.field_c[id.field_h[var3]][uf.field_e[var3]];
                                            if (var4 == ci.field_c[var3]) {
                                              break L66;
                                            } else {
                                              if ((fg.field_u[var3] ^ -1) != (var4 ^ -1)) {
                                                continue L65;
                                              } else {
                                                break L66;
                                              }
                                            }
                                          }
                                          if (0 == ok.field_s[var3]) {
                                            L67: {
                                              if (-1 == (kb.field_i ^ -1)) {
                                                fl.field_c[id.field_h[var3]][uf.field_e[var3]] = (char)ci.field_c[var3];
                                                break L67;
                                              } else {
                                                break L67;
                                              }
                                            }
                                            if (-5 == (kb.field_i ^ -1)) {
                                              fl.field_c[id.field_h[var3]][uf.field_e[var3]] = (char)fg.field_u[var3];
                                              continue L65;
                                            } else {
                                              continue L65;
                                            }
                                          } else {
                                            if (-9 != (ci.field_c[var3] ^ -1)) {
                                              continue L65;
                                            } else {
                                              var7 = id.field_h[var3] * 16;
                                              var13 = 0;
                                              var8 = uf.field_e[var3] * 16;
                                              var4 = 0;
                                              L68: while (true) {
                                                if ((var4 ^ -1) <= (nb.field_b ^ -1)) {
                                                  continue L62;
                                                } else {
                                                  L69: {
                                                    if (0 != cl.field_d[var4]) {
                                                      break L69;
                                                    } else {
                                                      if ((var7 ^ -1) < (qg.field_a[var4] ^ -1)) {
                                                        break L69;
                                                      } else {
                                                        if ((var8 ^ -1) < (dh.field_b[var4] ^ -1)) {
                                                          break L69;
                                                        } else {
                                                          if ((qg.field_a[var4] ^ -1) <= (16 + var7 ^ -1)) {
                                                            break L69;
                                                          } else {
                                                            if ((dh.field_b[var4] ^ -1) > (var8 - -16 ^ -1)) {
                                                              var13 = 1;
                                                              break L69;
                                                            } else {
                                                              break L69;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                  var4++;
                                                  continue L68;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    L70: {
                                      if (0 != cl.field_d[var4]) {
                                        break L70;
                                      } else {
                                        if ((var7 ^ -1) < (qg.field_a[var4] ^ -1)) {
                                          break L70;
                                        } else {
                                          if ((var8 ^ -1) < (dh.field_b[var4] ^ -1)) {
                                            break L70;
                                          } else {
                                            if ((qg.field_a[var4] ^ -1) <= (16 + var7 ^ -1)) {
                                              break L70;
                                            } else {
                                              if ((dh.field_b[var4] ^ -1) > (var8 - -16 ^ -1)) {
                                                var13 = 1;
                                                break L70;
                                              } else {
                                                break L70;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var4++;
                                    continue L61;
                                  }
                                }
                              }
                            }
                          }
                          L71: while (true) {
                            var3++;
                            if ((var3 ^ -1) <= (oe.field_a ^ -1)) {
                              break L41;
                            } else {
                              L72: {
                                var4 = fl.field_c[id.field_h[var3]][uf.field_e[var3]];
                                if (var4 == ci.field_c[var3]) {
                                  break L72;
                                } else {
                                  if ((fg.field_u[var3] ^ -1) != (var4 ^ -1)) {
                                    continue L71;
                                  } else {
                                    break L72;
                                  }
                                }
                              }
                              if (0 == ok.field_s[var3]) {
                                L73: {
                                  if (-1 == (kb.field_i ^ -1)) {
                                    fl.field_c[id.field_h[var3]][uf.field_e[var3]] = (char)ci.field_c[var3];
                                    break L73;
                                  } else {
                                    break L73;
                                  }
                                }
                                if (-5 == (kb.field_i ^ -1)) {
                                  fl.field_c[id.field_h[var3]][uf.field_e[var3]] = (char)fg.field_u[var3];
                                  continue L71;
                                } else {
                                  continue L71;
                                }
                              } else {
                                if (-9 != (ci.field_c[var3] ^ -1)) {
                                  continue L71;
                                } else {
                                  var7 = id.field_h[var3] * 16;
                                  var13 = 0;
                                  var8 = uf.field_e[var3] * 16;
                                  var4 = 0;
                                  L74: while (true) {
                                    if ((var4 ^ -1) <= (nb.field_b ^ -1)) {
                                      if (1 == var13) {
                                        L75: {
                                          if (-9 != (fl.field_c[id.field_h[var3]][uf.field_e[var3]] ^ -1)) {
                                            break L75;
                                          } else {
                                            pd discarded$21 = fh.a((byte) -91, bf.field_d, 100, 63);
                                            break L75;
                                          }
                                        }
                                        fl.field_c[id.field_h[var3]][uf.field_e[var3]] = (char)9;
                                        continue L71;
                                      } else {
                                        fl.field_c[id.field_h[var3]][uf.field_e[var3]] = (char)8;
                                        continue L71;
                                      }
                                    } else {
                                      L76: {
                                        if (0 != cl.field_d[var4]) {
                                          break L76;
                                        } else {
                                          if ((var7 ^ -1) < (qg.field_a[var4] ^ -1)) {
                                            break L76;
                                          } else {
                                            if ((var8 ^ -1) < (dh.field_b[var4] ^ -1)) {
                                              break L76;
                                            } else {
                                              if ((qg.field_a[var4] ^ -1) <= (16 + var7 ^ -1)) {
                                                break L76;
                                              } else {
                                                if ((dh.field_b[var4] ^ -1) > (var8 - -16 ^ -1)) {
                                                  var13 = 1;
                                                  break L76;
                                                } else {
                                                  break L76;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var4++;
                                      continue L74;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        return;
                      }
                    }
                  }
                  L77: {
                    if (ml.field_O <= nb.field_b) {
                      qg.field_c = -1;
                      break L77;
                    } else {
                      qg.field_c = qg.field_c - 1;
                      if (1 <= qg.field_c) {
                        break L77;
                      } else {
                        nb.field_b = nb.field_b + 1;
                        qg.field_c = 6;
                        pd discarded$22 = fh.a((byte) 105, ic.field_ab, 100, 63);
                        break L77;
                      }
                    }
                  }
                  var19 = 0;
                  var3 = 0;
                  L78: while (true) {
                    if (nb.field_b <= var3) {
                      oj.field_i.i((int)(32.0 * Math.log((double)(1 + var19))));
                      var3 = 0;
                      L79: while (true) {
                        if (var3 >= gh.field_q) {
                          var3 = 0;
                          L80: while (true) {
                            if (pl.field_g <= var3) {
                              var6 = 20;
                              L81: while (true) {
                                if ((var6 ^ -1) > -1) {
                                  if (param0 > 126) {
                                    L82: {
                                      if (0 < we.field_c) {
                                        we.field_c = we.field_c - 1;
                                        break L82;
                                      } else {
                                        break L82;
                                      }
                                    }
                                    return;
                                  } else {
                                    return;
                                  }
                                } else {
                                  var5 = 39;
                                  L83: while (true) {
                                    if (-1 < (var5 ^ -1)) {
                                      var6--;
                                      continue L81;
                                    } else {
                                      L84: {
                                        if (fl.field_c[var5][var6] == 33) {
                                          field_G[var5][var6] = field_G[var5][var6] - 1;
                                          if (field_G[var5][var6] >= 0) {
                                            break L84;
                                          } else {
                                            fl.field_c[var5][var6] = (char)6;
                                            break L84;
                                          }
                                        } else {
                                          break L84;
                                        }
                                      }
                                      var5--;
                                      continue L83;
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
                              L85: while (true) {
                                if ((var4 ^ -1) <= (nb.field_b ^ -1)) {
                                  L86: {
                                    hl.field_C[var3] = hl.field_C[var3] + uf.field_b[var3];
                                    if (hl.field_C[var3] >= 16) {
                                      hl.field_C[var3] = 16;
                                      uf.field_b[var3] = -4;
                                      break L86;
                                    } else {
                                      break L86;
                                    }
                                  }
                                  L87: {
                                    if (0 == hl.field_C[var3]) {
                                      fl.field_c[var5][-2 + var6] = (char)15;
                                      this.a((byte) -86, var6 - 2, var5);
                                      var4 = var3;
                                      L88: while (true) {
                                        if (var4 >= pl.field_g) {
                                          pl.field_g = pl.field_g - 1;
                                          break L87;
                                        } else {
                                          f.field_F[var4] = f.field_F[1 + var4];
                                          ek.field_b[var4] = ek.field_b[1 + var4];
                                          hl.field_C[var4] = hl.field_C[1 + var4];
                                          uf.field_b[var4] = uf.field_b[var4 + 1];
                                          var4++;
                                          continue L88;
                                        }
                                      }
                                    } else {
                                      break L87;
                                    }
                                  }
                                  var3++;
                                  continue L80;
                                } else {
                                  L89: {
                                    if (qg.field_a[var4] < -4 + var7) {
                                      break L89;
                                    } else {
                                      if ((20 + var7 ^ -1) >= (qg.field_a[var4] ^ -1)) {
                                        break L89;
                                      } else {
                                        if ((var8 ^ -1) < (dh.field_b[var4] ^ -1)) {
                                          break L89;
                                        } else {
                                          if ((var8 - -20 ^ -1) >= (dh.field_b[var4] ^ -1)) {
                                            break L89;
                                          } else {
                                            L90: {
                                              if (0 != cl.field_d[var4]) {
                                                break L90;
                                              } else {
                                                cl.field_d[var4] = 1;
                                                pd discarded$23 = fh.a((byte) 93, fi.field_n, 100, 63);
                                                break L90;
                                              }
                                            }
                                            lh.field_e[qg.field_a[var4] / 4][dh.field_b[var4] / 4] = 0;
                                            break L89;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var4++;
                                  continue L85;
                                }
                              }
                            }
                          }
                        } else {
                          L91: {
                            L92: {
                              var5 = rf.field_e[var3];
                              var6 = hf.field_d[var3];
                              var4 = wh.field_d[var3];
                              if (-1 != (cl.field_d[var4] ^ -1)) {
                                break L92;
                              } else {
                                if ((jd.field_o[var4] ^ -1) != -1) {
                                  break L92;
                                } else {
                                  if (qg.field_a[var4] / 16 != var5) {
                                    break L92;
                                  } else {
                                    if (var6 * 4 - 1 == dh.field_b[var4] / 4) {
                                      break L91;
                                    } else {
                                      break L92;
                                    }
                                  }
                                }
                              }
                            }
                            pd discarded$24 = fh.a((byte) 101, hf.field_g, 100, 63);
                            fl.field_c[var5][var6] = (char)0;
                            this.a((byte) -79, var6, var5);
                            var20 = 0;
                            L93: while (true) {
                              if (-5 >= (var20 ^ -1)) {
                                gh.field_q = gh.field_q - 1;
                                rf.field_e[var3] = rf.field_e[gh.field_q];
                                hf.field_d[var3] = hf.field_d[gh.field_q];
                                wh.field_d[var3] = wh.field_d[gh.field_q];
                                var3--;
                                break L91;
                              } else {
                                var21 = 0;
                                L94: while (true) {
                                  if (var21 >= 4) {
                                    var20++;
                                    continue L93;
                                  } else {
                                    lh.field_e[var5 * 4 - -var20][var21 + 4 * var6] = 0;
                                    var21++;
                                    continue L94;
                                  }
                                }
                              }
                            }
                          }
                          var3++;
                          continue L79;
                        }
                      }
                    } else {
                      L95: {
                        if (cl.field_d[var3] != 0) {
                          break L95;
                        } else {
                          if ((jd.field_o[var3] ^ -1) == -2) {
                            break L95;
                          } else {
                            if (fl.field_c[qg.field_a[var3] / 16][dh.field_b[var3] / 16] != 2) {
                              break L95;
                            } else {
                              cl.field_d[var3] = 1;
                              pd discarded$25 = fh.a((byte) -77, fi.field_n, 100, 63);
                              break L95;
                            }
                          }
                        }
                      }
                      L96: {
                        if (-1 != (cl.field_d[var3] ^ -1)) {
                          break L96;
                        } else {
                          L97: {
                            var7 = qg.field_a[var3];
                            var8 = dh.field_b[var3];
                            var9 = ge.field_a[var3];
                            var10 = var7 / 4;
                            if (-1 >= (var9 ^ -1)) {
                              va.field_t[var3] = 2 + kb.field_i % 2;
                              break L97;
                            } else {
                              va.field_t[var3] = kb.field_i % 2;
                              break L97;
                            }
                          }
                          var12 = var9 / 4;
                          var11 = var8 / 4;
                          var14 = 0;
                          var4 = 0;
                          L98: while (true) {
                            if ((qi.field_f ^ -1) >= (var4 ^ -1)) {
                              L99: {
                                if ((jd.field_o[var3] ^ -1) != -1) {
                                  L100: {
                                    if (-2 != (jd.field_o[var3] ^ -1)) {
                                      break L100;
                                    } else {
                                      L101: {
                                        var5 = var7 / 16;
                                        var8 = var8 - ue.field_d;
                                        var6 = var8 / 16;
                                        if (0 > var6) {
                                          break L101;
                                        } else {
                                          if (21 <= var6) {
                                            break L101;
                                          } else {
                                            if (fl.field_c[var5][var6] != 11) {
                                              break L100;
                                            } else {
                                              if (var8 % 16 == 4) {
                                                jd.field_o[var3] = 0;
                                                var9 = -4;
                                                ge.field_a[var3] = -4;
                                                pd discarded$26 = fh.a((byte) 89, hg.field_n, 100, 63);
                                                break L100;
                                              } else {
                                                break L100;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      cl.field_d[var3] = 1;
                                      pd discarded$27 = fh.a((byte) 86, fi.field_n, 100, 63);
                                      break L100;
                                    }
                                  }
                                  if (2 != jd.field_o[var3]) {
                                    break L99;
                                  } else {
                                    L102: {
                                      lh.field_e[var10][var11] = 0;
                                      if ((lh.field_e[var10][-md.field_L + var11] ^ -1) != -3) {
                                        break L102;
                                      } else {
                                        this.a((var11 + -1) / 4, true, var3, var10 / 4, 3);
                                        break L102;
                                      }
                                    }
                                    L103: {
                                      L104: {
                                        var9 = ge.field_a[var3];
                                        var7 = qg.field_a[var3];
                                        var8 = dh.field_b[var3];
                                        var11 = var8 / 4;
                                        var10 = var7 / 4;
                                        var12 = var9 / 4;
                                        var8 = var8 - ue.field_d;
                                        var11 = var11 - md.field_L;
                                        if (lh.field_e[var10][var11] > 0) {
                                          break L104;
                                        } else {
                                          if (-1 == (var14 ^ -1)) {
                                            break L103;
                                          } else {
                                            break L104;
                                          }
                                        }
                                      }
                                      var8 = var8 + ue.field_d;
                                      var11 = var11 + md.field_L;
                                      jd.field_o[var3] = 0;
                                      break L103;
                                    }
                                    lh.field_e[var10][var11] = 1;
                                    break L99;
                                  }
                                } else {
                                  L105: {
                                    lh.field_e[var10][var11] = 0;
                                    if ((lh.field_e[var10][var11 + md.field_L] ^ -1) != -3) {
                                      break L105;
                                    } else {
                                      if (-1 == (var14 ^ -1)) {
                                        this.a((md.field_L + var11) / 4, true, var3, var10 / 4, 2);
                                        break L105;
                                      } else {
                                        break L105;
                                      }
                                    }
                                  }
                                  L106: {
                                    if ((lh.field_e[var10][var11 - md.field_L] ^ -1) != -3) {
                                      break L106;
                                    } else {
                                      if (-1 == (var14 ^ -1)) {
                                        this.a((var11 - md.field_L) / 4, true, var3, var10 / 4, 3);
                                        break L106;
                                      } else {
                                        break L106;
                                      }
                                    }
                                  }
                                  L107: {
                                    L108: {
                                      if (0 < lh.field_e[var10][var11 - -md.field_L]) {
                                        break L108;
                                      } else {
                                        if (var14 == 0) {
                                          break L107;
                                        } else {
                                          break L108;
                                        }
                                      }
                                    }
                                    if ((lh.field_e[var10 - -var12][var11] ^ -1) != -3) {
                                      break L107;
                                    } else {
                                      this.a(var11 / 4, true, var3, (var10 + var12) / 4, var12);
                                      break L107;
                                    }
                                  }
                                  L109: {
                                    var7 = qg.field_a[var3];
                                    var8 = dh.field_b[var3];
                                    var9 = ge.field_a[var3];
                                    var10 = var7 / 4;
                                    var12 = var9 / 4;
                                    var11 = var8 / 4;
                                    if (-3 != (jd.field_o[var3] ^ -1)) {
                                      L110: {
                                        if (lh.field_e[var10][md.field_L + var11] > 0) {
                                          break L110;
                                        } else {
                                          if ((var14 ^ -1) == -1) {
                                            var8 = var8 + ue.field_d;
                                            break L109;
                                          } else {
                                            break L110;
                                          }
                                        }
                                      }
                                      L111: {
                                        if ((lh.field_e[var12 + var10][var11] ^ -1) >= -1) {
                                          break L111;
                                        } else {
                                          if (lh.field_e[var10][-md.field_L + var11] > 0) {
                                            break L111;
                                          } else {
                                            if ((lh.field_e[var12 + var10][var11 - md.field_L] ^ -1) < -1) {
                                              break L111;
                                            } else {
                                              var8 = var8 - ue.field_d;
                                              var7 = var7 + var9;
                                              break L109;
                                            }
                                          }
                                        }
                                      }
                                      if (0 < lh.field_e[var12 + var10][var11]) {
                                        var9 = -var9;
                                        break L109;
                                      } else {
                                        var7 = var7 + var9;
                                        break L109;
                                      }
                                    } else {
                                      break L109;
                                    }
                                  }
                                  var10 = var7 / 4;
                                  var11 = var8 / 4;
                                  if (1 == jd.field_o[var3]) {
                                    break L99;
                                  } else {
                                    if (-1 == (cl.field_d[var3] ^ -1)) {
                                      lh.field_e[var10][var11] = 1;
                                      break L99;
                                    } else {
                                      qg.field_a[var3] = var7;
                                      dh.field_b[var3] = var8;
                                      ge.field_a[var3] = var9;
                                      var3++;
                                      continue L78;
                                    }
                                  }
                                }
                              }
                              qg.field_a[var3] = var7;
                              dh.field_b[var3] = var8;
                              ge.field_a[var3] = var9;
                              break L96;
                            } else {
                              L112: {
                                if (var7 < oa.field_m[var4]) {
                                  break L112;
                                } else {
                                  if (var7 >= lc.field_v[var4]) {
                                    break L112;
                                  } else {
                                    if ((var8 ^ -1) > (uh.field_n[var4] ^ -1)) {
                                      break L112;
                                    } else {
                                      if (ca.field_G[var4] <= var8) {
                                        break L112;
                                      } else {
                                        if (me.field_i[var4] == 0) {
                                          L113: {
                                            if ((var7 / 16 ^ -1) >= (rk.field_u[var4] ^ -1)) {
                                              ge.field_a[var3] = -4;
                                              var12 = -1;
                                              var9 = -4;
                                              break L113;
                                            } else {
                                              ge.field_a[var3] = 4;
                                              var9 = 4;
                                              var12 = 1;
                                              break L113;
                                            }
                                          }
                                          var19++;
                                          var14 = 1;
                                          if ((var19 ^ -1) != (qh.field_z ^ -1)) {
                                            break L112;
                                          } else {
                                            if ((ia.field_m[field_E][var2].field_f ^ -1) == (qh.field_z ^ -1)) {
                                              hg.a(-25389, 11, 244, var2);
                                              break L112;
                                            } else {
                                              break L112;
                                            }
                                          }
                                        } else {
                                          break L112;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              var4++;
                              continue L98;
                            }
                          }
                        }
                      }
                      var3++;
                      continue L78;
                    }
                  }
                } else {
                  L114: {
                    if (cl.field_d[var3] != 0) {
                      jg.field_e = jg.field_e + 1;
                      break L114;
                    } else {
                      qh.field_z = qh.field_z + 1;
                      break L114;
                    }
                  }
                  var3++;
                  continue L6;
                }
              }
            } else {
              return;
            }
          } else {
            L115: {
              L116: {
                var3 = id.field_b;
                if (var3 == 32) {
                  break L116;
                } else {
                  if (!ii.a(1, (char) var3)) {
                    break L115;
                  } else {
                    break L116;
                  }
                }
              }
              if (uc.field_a.length() < 16) {
                StringBuilder discarded$28 = uc.field_a.append(var3);
                break L115;
              } else {
                break L115;
              }
            }
            L117: {
              if (-86 != (ji.field_a ^ -1)) {
                break L117;
              } else {
                if (uc.field_a.length() <= 0) {
                  break L117;
                } else {
                  StringBuilder discarded$29 = uf.a(-1 + uc.field_a.length(), uc.field_a, ' ', -120);
                  break L117;
                }
              }
            }
            L118: {
              if (-85 == (ji.field_a ^ -1)) {
                break L118;
              } else {
                break L118;
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
        field_G = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var2 = 0;
        long var0 = 0L;
        int var3 = 0;
        field_H = "Must save: <%0>";
        field_J = new long[256];
        field_E = 0;
        for (var2 = 0; (var2 ^ -1) > -257; var2++) {
            var0 = (long)var2;
            for (var3 = 0; 8 > var3; var3++) {
                if (1L == (var0 & 1L)) {
                    var0 = var0 >>> -1944046335 ^ -3932672073523589310L;
                } else {
                    var0 = var0 >>> 1;
                }
            }
            field_J[var2] = var0;
        }
        field_G = new int[40][21];
        field_I = "Bonus: <%0>";
    }
}
