/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj {
    int[] field_J;
    byte field_D;
    short field_k;
    int field_G;
    int[] field_B;
    short[] field_p;
    int[] field_E;
    short[] field_m;
    short[] field_c;
    short[] field_L;
    short[] field_O;
    short[] field_C;
    short[] field_I;
    short[] field_u;
    static fk field_g;
    short[] field_n;
    short[] field_h;
    short[] field_M;
    int[] field_o;
    private boolean field_i;
    int field_x;
    int field_q;
    short[] field_z;
    short[] field_l;
    int[] field_w;
    int field_j;
    short[] field_d;
    short field_e;
    byte[] field_N;
    int[] field_F;
    short field_r;
    int[] field_s;
    int field_b;
    int[] field_H;
    short[] field_a;
    int[] field_v;
    short[] field_A;
    static sg field_f;
    short[] field_y;
    int field_t;
    short[] field_K;

    final void a(int param0, int param1, int param2, int param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        var6 = 0;
        if (param4) {
          return;
        } else {
          L0: while (true) {
            L1: {
              if (var6 < this.field_e) {
                this.field_O[var6] = (short)(this.field_O[var6] * param1 / param3);
                this.field_M[var6] = (short)(param0 * this.field_M[var6] / param3);
                this.field_z[var6] = (short)(param2 * this.field_z[var6] / param3);
                var6++;
                if (var7 != 0) {
                  break L1;
                } else {
                  if (var7 == 0) {
                    continue L0;
                  } else {
                    this.a((byte) -113);
                    break L1;
                  }
                }
              } else {
                this.a((byte) -113);
                break L1;
              }
            }
            return;
          }
        }
    }

    private final void a(byte param0) {
        if (param0 > -97) {
            sj.a(3);
        }
        this.field_i = false;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        var5 = 0;
        if (param1 <= 11) {
          return;
        } else {
          L0: while (true) {
            L1: {
              if (this.field_e > var5) {
                this.field_O[var5] = (short)(this.field_O[var5] + param2);
                this.field_M[var5] = (short)(this.field_M[var5] + param3);
                this.field_z[var5] = (short)(this.field_z[var5] + param0);
                var5++;
                if (var6 != 0) {
                  break L1;
                } else {
                  if (var6 == 0) {
                    continue L0;
                  } else {
                    this.a((byte) -119);
                    break L1;
                  }
                }
              } else {
                this.a((byte) -119);
                break L1;
              }
            }
            return;
          }
        }
    }

    final static void a(ad param0, ad param1, ad param2, ad param3, int param4) {
        le discarded$2 = null;
        le[] array$3 = null;
        RuntimeException var5 = null;
        int var6_int = 0;
        le[] var6 = null;
        int var7_int = 0;
        le[] var7 = null;
        int var8_int = 0;
        le[] var8 = null;
        int var9_int = 0;
        ai[] var9 = null;
        int var10_int = 0;
        int[] var10 = null;
        le var11_ref_le = null;
        int var11 = 0;
        int var12 = 0;
        ai[] var13 = null;
        le var14 = null;
        le[] var15 = null;
        le[] var16 = null;
        ai[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int stackIn_28_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_47_0 = 0;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_86_2 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_89_2 = null;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        String stackIn_92_2 = null;
        int stackIn_98_0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_35_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_46_0 = 0;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        String stackOut_85_2 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        String stackOut_84_2 = null;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        String stackOut_88_2 = null;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        String stackOut_87_2 = null;
        RuntimeException stackOut_89_0 = null;
        StringBuilder stackOut_89_1 = null;
        RuntimeException stackOut_91_0 = null;
        StringBuilder stackOut_91_1 = null;
        String stackOut_91_2 = null;
        RuntimeException stackOut_90_0 = null;
        StringBuilder stackOut_90_1 = null;
        String stackOut_90_2 = null;
        int stackOut_97_0 = 0;
        int stackOut_96_0 = 0;
        var12 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            sb.field_r = vd.a(true, "", param0, param3, "big_font");
            pl.field_e = vd.a(true, "kartika13", param2, param1, "");
            ke.field_i = ma.a(param3, "background", param4 + 16711680, "");
            fi.field_a = lb.a(false, "", param3, "river_background");
            var13 = uj.a("", "jungle_background", param3, false);
            m.field_k = var13[0];
            m.field_k.b();
            ib.field_b = var13[1].a();
            ne.field_a = uj.a("", "waterfall_background", param3, false);
            var6_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var6_int >= ne.field_a.length) {
                    break L3;
                  } else {
                    ne.field_a[var6_int].b();
                    var6_int++;
                    if (var12 != 0) {
                      break L2;
                    } else {
                      if (var12 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                tj.field_a = ma.a(param3, "aztec_background", param4 + 16711680, "");
                eg.field_d = new ai[4];
                eg.field_d[0] = df.a("", param3, (byte) 118, "river_borders");
                eg.field_d[1] = df.a("", param3, (byte) 118, "jungle_borders");
                eg.field_d[2] = df.a("", param3, (byte) 118, "waterfall_borders");
                eg.field_d[3] = df.a("", param3, (byte) 118, "aztec_borders");
                break L2;
              }
              var6_int = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (var6_int >= eg.field_d.length) {
                      break L6;
                    } else {
                      eg.field_d[var6_int].b();
                      var6_int++;
                      if (var12 != 0) {
                        break L5;
                      } else {
                        if (var12 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  ka.field_b = ma.a(param1, "unachieved", 16711680, "basic");
                  aj.field_e = ma.a(param1, "orbcoin", 16711680, "basic");
                  discarded$2 = ma.a(param1, "locked", 16711680, "basic");
                  lb.field_E = lb.a(false, "", param3, "totems");
                  dj.field_a = lb.a(false, "", param3, "vines");
                  j.field_f = lb.a(false, "", param3, "birds");
                  qi.field_K = lb.a(false, "", param3, "blocks");
                  break L5;
                }
                var6_int = 0;
                L7: while (true) {
                  L8: {
                    L9: {
                      if (dj.field_a.length <= var6_int) {
                        break L9;
                      } else {
                        var14 = new le(2 + dj.field_a[var6_int].field_m, dj.field_a[var6_int].field_n - -1);
                        var14.e();
                        dj.field_a[var6_int].c(1, 0);
                        var14.e(1);
                        dj.field_a[var6_int] = var14;
                        var6_int++;
                        if (var12 != 0) {
                          break L8;
                        } else {
                          if (var12 == 0) {
                            continue L7;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    ac.field_a.a((byte) 120);
                    ba.field_a[param4] = lb.a(false, "", param3, "sprite_explorer_idle");
                    ba.field_a[4] = lb.a(false, "", param3, "sprite_explorer_celebrate_maj");
                    ba.field_a[3] = lb.a(false, "", param3, "sprite_explorer_celebrate_min");
                    ba.field_a[2] = lb.a(false, "", param3, "sprite_explorer_climbing");
                    ba.field_a[1] = lb.a(false, "", param3, "sprite_explorer_shoot");
                    ba.field_a[5] = lb.a(false, "", param3, "sprite_explorer_lose");
                    ba.field_a[6] = lb.a(false, "", param3, "sprite_explorer_idle_panic");
                    kb.field_a = new le[8];
                    break L8;
                  }
                  var6 = lb.a(false, "", param3, "menu_titles");
                  kb.field_a[6] = var6[6];
                  kb.field_a[2] = var6[2];
                  kb.field_a[5] = var6[4];
                  kb.field_a[3] = var6[3];
                  kb.field_a[1] = var6[1];
                  kb.field_a[0] = var6[0];
                  kb.field_a[7] = var6[5];
                  cm.field_F = new le[ba.field_a[0].length];
                  var7_int = 0;
                  L10: while (true) {
                    L11: {
                      L12: {
                        if (cm.field_F.length <= var7_int) {
                          break L12;
                        } else {
                          cm.field_F[var7_int] = new le(6 + ba.field_a[0][var7_int].field_m, ba.field_a[0][var7_int].field_n - -6);
                          cm.field_F[var7_int].e();
                          ba.field_a[0][var7_int].a(3, 3);
                          h.a(3, 16777215, 0, false, cm.field_F[var7_int].field_j, 0, cm.field_F[var7_int].field_k, cm.field_F[var7_int]);
                          var7_int++;
                          if (var12 != 0) {
                            break L11;
                          } else {
                            if (var12 == 0) {
                              continue L10;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                      ac.field_a.a((byte) 119);
                      wl.field_f = lb.a(false, "", param3, "catapult");
                      hf.field_d = ma.a(param3, "sun", 16711680, "");
                      qa.field_i = ma.a(param3, "moon", param4 ^ 16711680, "");
                      l.field_D = new le[5];
                      l.field_D[0] = ma.a(param3, "world_one_complete", 16711680, "");
                      l.field_D[1] = ma.a(param3, "world_two_complete", 16711680, "");
                      l.field_D[2] = ma.a(param3, "world_three_complete", 16711680, "");
                      l.field_D[3] = ma.a(param3, "world_four_complete", 16711680, "");
                      l.field_D[4] = ma.a(param3, "game_complete", 16711680, "");
                      ib.field_d = ma.a(param3, "game_over", 16711680, "");
                      m.field_i = lb.a(false, "", param3, "water");
                      ph.field_d = ma.a(param3, "map", param4 ^ 16711680, "");
                      break L11;
                    }
                    var15 = lb.a(false, "", param3, "monkeys_idle");
                    var7 = var15;
                    var8_int = 0;
                    L13: while (true) {
                      L14: {
                        if (var8_int >= 5) {
                          var7 = lb.a(false, "", param3, "monkeys_falling");
                          stackOut_35_0 = 0;
                          stackIn_36_0 = stackOut_35_0;
                          break L14;
                        } else {
                          nh.field_f[0][var8_int] = new le[4];
                          var9_int = var8_int;
                          stackOut_27_0 = 0;
                          stackIn_36_0 = stackOut_27_0;
                          stackIn_28_0 = stackOut_27_0;
                          if (var12 != 0) {
                            break L14;
                          } else {
                            var10_int = stackIn_28_0;
                            L15: while (true) {
                              L16: {
                                L17: {
                                  if (20 <= var9_int) {
                                    break L17;
                                  } else {
                                    nh.field_f[0][var8_int][var10_int] = new le(var15[var9_int].field_m, var15[var9_int].field_n);
                                    nh.field_f[0][var8_int][var10_int] = var15[var9_int];
                                    var10_int++;
                                    var9_int += 5;
                                    if (var12 != 0) {
                                      break L16;
                                    } else {
                                      if (var12 == 0) {
                                        continue L15;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                }
                                var8_int++;
                                break L16;
                              }
                              continue L13;
                            }
                          }
                        }
                      }
                      var8_int = stackIn_36_0;
                      L18: while (true) {
                        L19: {
                          L20: {
                            if (5 <= var8_int) {
                              break L20;
                            } else {
                              nh.field_f[1][var8_int] = new le[4];
                              var9_int = var8_int;
                              stackOut_38_0 = 0;
                              stackIn_47_0 = stackOut_38_0;
                              stackIn_39_0 = stackOut_38_0;
                              if (var12 != 0) {
                                break L19;
                              } else {
                                var10_int = stackIn_39_0;
                                L21: while (true) {
                                  L22: {
                                    L23: {
                                      if ((var9_int ^ -1) <= -21) {
                                        break L23;
                                      } else {
                                        nh.field_f[1][var8_int][var10_int] = new le(var7[var9_int].field_m, var7[var9_int].field_n);
                                        nh.field_f[1][var8_int][var10_int] = var7[var9_int];
                                        var9_int += 5;
                                        var10_int++;
                                        if (var12 != 0) {
                                          break L22;
                                        } else {
                                          if (var12 == 0) {
                                            continue L21;
                                          } else {
                                            break L23;
                                          }
                                        }
                                      }
                                    }
                                    var8_int++;
                                    break L22;
                                  }
                                  if (var12 == 0) {
                                    continue L18;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                            }
                          }
                          ck.field_a = lb.a(false, "", param3, "basket");
                          j.field_g = ma.a(param3, "raft", 16711680, "");
                          ci.field_d = ma.a(param3, "arrow", 16711680, "");
                          ak.field_t = lb.a(false, "", param3, "sprite_coconuts");
                          qh.field_a = lb.a(false, "", param3, "gecko");
                          ik.field_p = lb.a(false, "", param3, "waterfall_central");
                          cl.field_c = lb.a(false, "", param3, "waterfall_bottom");
                          cc.field_a[0] = lb.a(false, "", param3, "fish_a");
                          cc.field_a[1] = lb.a(false, "", param3, "fish_b");
                          cc.field_a[2] = lb.a(false, "", param3, "fish_c");
                          pc.field_U = lb.a(false, "", param3, "eyes");
                          ie.field_b = lb.a(false, "", param3, "achievements_large");
                          wc.field_e = lb.a(false, "", param3, "menu_frame");
                          df.field_q = lb.a(false, "", param3, "menu_monkey");
                          kj.field_F = ma.a(param3, "menu_vine", 16711680, "");
                          wg.field_g = ma.a(param3, "title_logo", 16711680, "");
                          we.field_f = lb.a(false, "", param3, "title_monkey");
                          w.field_b = lb.a(false, "", param3, "title_flashes");
                          j.field_c = ma.a(param3, "intro_screen", 16711680, "");
                          uk.field_n = ma.a(param3, "title_2", 16711680, "");
                          fe.field_f = lb.a(false, "", param3, "river");
                          de.field_f = ma.a(param3, "slider", param4 ^ 16711680, "");
                          sd.field_f = ma.a(param3, "bar", 16711680, "");
                          wc.field_h = ma.a(param3, "web", 16711680, "");
                          tl.field_b = ma.a(param3, "heavy_nut", 16711680, "");
                          ni.field_c[0] = df.a("", param3, (byte) 118, "x1");
                          ni.field_c[1] = df.a("", param3, (byte) 118, "x2");
                          ni.field_c[2] = df.a("", param3, (byte) 118, "x3");
                          ni.field_c[3] = df.a("", param3, (byte) 118, "x4");
                          ik.field_o = lb.a(false, "", param3, "fs_frame");
                          ji.field_b = lb.a(false, "", param3, "fs_frame_inv");
                          stackOut_46_0 = 0;
                          stackIn_47_0 = stackOut_46_0;
                          break L19;
                        }
                        var8_int = stackIn_47_0;
                        L24: while (true) {
                          L25: {
                            L26: {
                              if (ni.field_c.length <= var8_int) {
                                break L26;
                              } else {
                                ni.field_c[var8_int].b();
                                var8_int++;
                                if (var12 != 0) {
                                  break L25;
                                } else {
                                  if (var12 == 0) {
                                    continue L24;
                                  } else {
                                    break L26;
                                  }
                                }
                              }
                            }
                            qc.field_L = lb.a(false, "", param3, "map_explorer");
                            break L25;
                          }
                          var8 = lb.a(false, "", param3, "spider");
                          var9_int = 4;
                          L27: while (true) {
                            L28: {
                              L29: {
                                if (var9_int < 0) {
                                  break L29;
                                } else {
                                  array$3 = new le[var8.length];
                                  hb.field_m[var9_int] = array$3;
                                  if (var12 != 0) {
                                    break L28;
                                  } else {
                                    var10_int = 0;
                                    L30: while (true) {
                                      L31: {
                                        L32: {
                                          if (var8.length <= var10_int) {
                                            break L32;
                                          } else {
                                            hb.field_m[var9_int][var10_int] = new le(var8[var10_int].field_m, var8[var10_int].field_n);
                                            hb.field_m[var9_int][var10_int].e();
                                            var8[var10_int].d(0, 0, vg.field_K[var9_int]);
                                            var10_int++;
                                            if (var12 != 0) {
                                              break L31;
                                            } else {
                                              if (var12 == 0) {
                                                continue L30;
                                              } else {
                                                break L32;
                                              }
                                            }
                                          }
                                        }
                                        var9_int--;
                                        break L31;
                                      }
                                      if (var12 == 0) {
                                        continue L27;
                                      } else {
                                        break L29;
                                      }
                                    }
                                  }
                                }
                              }
                              ac.field_a.a((byte) 113);
                              break L28;
                            }
                            var16 = ie.field_b;
                            var10_int = 0;
                            L33: while (true) {
                              L34: {
                                L35: {
                                  if (var10_int >= var16.length) {
                                    break L35;
                                  } else {
                                    var11_ref_le = var16[var10_int];
                                    wh.a((byte) -114, var11_ref_le);
                                    var10_int++;
                                    if (var12 != 0) {
                                      break L34;
                                    } else {
                                      if (var12 == 0) {
                                        continue L33;
                                      } else {
                                        break L35;
                                      }
                                    }
                                  }
                                }
                                wh.a((byte) -68, ka.field_b);
                                break L34;
                              }
                              var9_int = 0;
                              L36: while (true) {
                                L37: {
                                  if (-301 >= (var9_int ^ -1)) {
                                    break L37;
                                  } else {
                                    sc.field_h[var9_int] = pf.a((byte) 125, 16);
                                    var9_int++;
                                    if (var12 == 0) {
                                      continue L36;
                                    } else {
                                      break L37;
                                    }
                                  }
                                }
                                var17 = new ai[6];
                                var9 = var17;
                                var9[0] = df.a("", param3, (byte) 118, "keyboard_left");
                                var9[1] = df.a("", param3, (byte) 118, "keyboard_right");
                                var9[2] = df.a("", param3, (byte) 118, "keyboard_enter");
                                var9[3] = df.a("", param3, (byte) 118, "keyboard_space");
                                var9[4] = df.a("", param3, (byte) 118, "keyboard_esc");
                                var9[5] = df.a("", param3, (byte) 118, "keyboard_ctrl");
                                var19 = new int[var17.length];
                                var18 = var19;
                                var10 = var18;
                                var11 = 0;
                                L38: while (true) {
                                  L39: {
                                    L40: {
                                      if (var11 >= var19.length) {
                                        break L40;
                                      } else {
                                        var10[var11] = -3 + var17[var11].field_l;
                                        var11++;
                                        if (var12 != 0) {
                                          break L39;
                                        } else {
                                          if (var12 == 0) {
                                            continue L38;
                                          } else {
                                            break L40;
                                          }
                                        }
                                      }
                                    }
                                    pl.field_e.a(var9, var19);
                                    ac.field_a.a((byte) 110);
                                    break L39;
                                  }
                                  break L0;
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
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L41: {
            var5 = decompiledCaughtException;
            stackOut_80_0 = (RuntimeException) (var5);
            stackOut_80_1 = new StringBuilder().append("sj.B(");
            stackIn_82_0 = stackOut_80_0;
            stackIn_82_1 = stackOut_80_1;
            stackIn_81_0 = stackOut_80_0;
            stackIn_81_1 = stackOut_80_1;
            if (param0 == null) {
              stackOut_82_0 = (RuntimeException) ((Object) stackIn_82_0);
              stackOut_82_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackOut_82_2 = "null";
              stackIn_83_0 = stackOut_82_0;
              stackIn_83_1 = stackOut_82_1;
              stackIn_83_2 = stackOut_82_2;
              break L41;
            } else {
              stackOut_81_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackOut_81_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackOut_81_2 = "{...}";
              stackIn_83_0 = stackOut_81_0;
              stackIn_83_1 = stackOut_81_1;
              stackIn_83_2 = stackOut_81_2;
              break L41;
            }
          }
          L42: {
            stackOut_83_0 = (RuntimeException) ((Object) stackIn_83_0);
            stackOut_83_1 = ((StringBuilder) (Object) stackIn_83_1).append(stackIn_83_2).append(',');
            stackIn_85_0 = stackOut_83_0;
            stackIn_85_1 = stackOut_83_1;
            stackIn_84_0 = stackOut_83_0;
            stackIn_84_1 = stackOut_83_1;
            if (param1 == null) {
              stackOut_85_0 = (RuntimeException) ((Object) stackIn_85_0);
              stackOut_85_1 = (StringBuilder) ((Object) stackIn_85_1);
              stackOut_85_2 = "null";
              stackIn_86_0 = stackOut_85_0;
              stackIn_86_1 = stackOut_85_1;
              stackIn_86_2 = stackOut_85_2;
              break L42;
            } else {
              stackOut_84_0 = (RuntimeException) ((Object) stackIn_84_0);
              stackOut_84_1 = (StringBuilder) ((Object) stackIn_84_1);
              stackOut_84_2 = "{...}";
              stackIn_86_0 = stackOut_84_0;
              stackIn_86_1 = stackOut_84_1;
              stackIn_86_2 = stackOut_84_2;
              break L42;
            }
          }
          L43: {
            stackOut_86_0 = (RuntimeException) ((Object) stackIn_86_0);
            stackOut_86_1 = ((StringBuilder) (Object) stackIn_86_1).append(stackIn_86_2).append(',');
            stackIn_88_0 = stackOut_86_0;
            stackIn_88_1 = stackOut_86_1;
            stackIn_87_0 = stackOut_86_0;
            stackIn_87_1 = stackOut_86_1;
            if (param2 == null) {
              stackOut_88_0 = (RuntimeException) ((Object) stackIn_88_0);
              stackOut_88_1 = (StringBuilder) ((Object) stackIn_88_1);
              stackOut_88_2 = "null";
              stackIn_89_0 = stackOut_88_0;
              stackIn_89_1 = stackOut_88_1;
              stackIn_89_2 = stackOut_88_2;
              break L43;
            } else {
              stackOut_87_0 = (RuntimeException) ((Object) stackIn_87_0);
              stackOut_87_1 = (StringBuilder) ((Object) stackIn_87_1);
              stackOut_87_2 = "{...}";
              stackIn_89_0 = stackOut_87_0;
              stackIn_89_1 = stackOut_87_1;
              stackIn_89_2 = stackOut_87_2;
              break L43;
            }
          }
          L44: {
            stackOut_89_0 = (RuntimeException) ((Object) stackIn_89_0);
            stackOut_89_1 = ((StringBuilder) (Object) stackIn_89_1).append(stackIn_89_2).append(',');
            stackIn_91_0 = stackOut_89_0;
            stackIn_91_1 = stackOut_89_1;
            stackIn_90_0 = stackOut_89_0;
            stackIn_90_1 = stackOut_89_1;
            if (param3 == null) {
              stackOut_91_0 = (RuntimeException) ((Object) stackIn_91_0);
              stackOut_91_1 = (StringBuilder) ((Object) stackIn_91_1);
              stackOut_91_2 = "null";
              stackIn_92_0 = stackOut_91_0;
              stackIn_92_1 = stackOut_91_1;
              stackIn_92_2 = stackOut_91_2;
              break L44;
            } else {
              stackOut_90_0 = (RuntimeException) ((Object) stackIn_90_0);
              stackOut_90_1 = (StringBuilder) ((Object) stackIn_90_1);
              stackOut_90_2 = "{...}";
              stackIn_92_0 = stackOut_90_0;
              stackIn_92_1 = stackOut_90_1;
              stackIn_92_2 = stackOut_90_2;
              break L44;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_92_0), stackIn_92_2 + ',' + param4 + ')');
        }
        if (fc.field_c) {
          L45: {
            if (var12 == 0) {
              stackOut_97_0 = 1;
              stackIn_98_0 = stackOut_97_0;
              break L45;
            } else {
              stackOut_96_0 = 0;
              stackIn_98_0 = stackOut_96_0;
              break L45;
            }
          }
          MonkeyPuzzle2.field_F = stackIn_98_0 != 0;
          return;
        } else {
          return;
        }
    }

    final static le a(int param0, int param1, int param2) {
        le var3 = null;
        int var4 = 0;
        int var5 = 0;
        le stackIn_5_0 = null;
        le stackIn_6_0 = null;
        le stackOut_4_0 = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        var3 = new le(param0, param0);
        var4 = 0;
        if (param1 == 74) {
          L0: while (true) {
            if (var3.field_s.length > var4) {
              stackOut_4_0 = (le) (var3);
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (var5 == 0) {
                stackIn_6_0.field_s[var4] = param2;
                var4++;
                continue L0;
              } else {
                return stackIn_5_0;
              }
            } else {
              return var3;
            }
          }
        } else {
          return (le) null;
        }
    }

    final static void a(int param0) {
        cb.field_c[91] = 42;
        cb.field_c[47] = 73;
        cb.field_c[93] = 43;
        cb.field_c[222] = 58;
        cb.field_c[520] = 59;
        cb.field_c[192] = 28;
        cb.field_c[59] = 57;
        cb.field_c[param0] = 74;
        cb.field_c[44] = 71;
        cb.field_c[46] = 72;
        cb.field_c[61] = 27;
        cb.field_c[45] = 26;
    }

    public static void b(int param0) {
        field_g = null;
        if (param0 != -21) {
            sj.a(40);
        }
        field_f = null;
    }

    final void c(int param0) {
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
        L0: {
          var12 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (param0 == 74) {
            break L0;
          } else {
            this.field_y = (short[]) null;
            break L0;
          }
        }
        if (this.field_i) {
          return;
        } else {
          this.field_i = true;
          var2 = 32767;
          var3 = 32767;
          var4 = 32767;
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          var8 = 0;
          L1: while (true) {
            L2: {
              L3: {
                if (var8 >= this.field_e) {
                  break L3;
                } else {
                  var9 = this.field_O[var8];
                  var10 = this.field_M[var8];
                  if (var12 != 0) {
                    break L2;
                  } else {
                    L4: {
                      if (var3 > var10) {
                        var3 = var10;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (var2 > var9) {
                        var2 = var9;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      if (var6 < var10) {
                        var6 = var10;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      if (var9 > var5) {
                        var5 = var9;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      var11 = this.field_z[var8];
                      if (var11 > var7) {
                        var7 = var11;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (var11 >= var4) {
                        break L9;
                      } else {
                        var4 = var11;
                        break L9;
                      }
                    }
                    var8++;
                    if (var12 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              this.field_t = var7;
              this.field_q = var5;
              this.field_j = var3;
              this.field_b = var6;
              this.field_G = var2;
              this.field_x = var4;
              break L2;
            }
            return;
          }
        }
    }

    sj() {
        this.field_i = false;
        this.field_D = (byte) 0;
    }

    static {
        field_g = new fk(2);
        field_f = new sg(1);
    }
}
