/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class TorChallenge extends d {
    static sl field_I;
    static si field_H;
    static int field_G;
    static int field_E;
    public static boolean field_F;

    public final void init() {
        try {
            ((TorChallenge) this).a((byte) 58, 12, "torchallenge");
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "TorChallenge.init()");
        }
    }

    private final void t() {
        ka[] var2 = null;
        int var2_int = 0;
        int var3_int = 0;
        Object var3 = null;
        ka[] var3_array = null;
        ka var4_ref_ka = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        int[] var6 = null;
        int var7_int = 0;
        ka var7 = null;
        int var8 = 0;
        int var9 = 0;
        ka var10 = null;
        int var10_int = 0;
        ka var11 = null;
        int var12 = 0;
        int stackIn_9_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_97_1 = 0;
        int stackIn_99_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_102_1 = 0;
        int stackIn_110_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_114_0 = 0;
        int stackIn_116_0 = 0;
        int stackIn_116_1 = 0;
        int stackIn_118_0 = 0;
        int stackIn_121_0 = 0;
        int stackIn_121_1 = 0;
        int stackIn_147_0 = 0;
        int stackIn_150_0 = 0;
        int stackIn_158_0 = 0;
        int stackIn_161_0 = 0;
        int stackIn_169_0 = 0;
        int stackIn_171_0 = 0;
        int stackIn_173_0 = 0;
        int stackIn_176_0 = 0;
        int stackIn_185_0 = 0;
        int stackIn_188_0 = 0;
        int stackIn_196_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_92_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_96_1 = 0;
        int stackOut_98_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_101_1 = 0;
        int stackOut_109_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_113_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_115_1 = 0;
        int stackOut_117_0 = 0;
        int stackOut_120_0 = 0;
        int stackOut_120_1 = 0;
        int stackOut_146_0 = 0;
        int stackOut_149_0 = 0;
        int stackOut_157_0 = 0;
        int stackOut_160_0 = 0;
        int stackOut_168_0 = 0;
        int stackOut_170_0 = 0;
        int stackOut_172_0 = 0;
        int stackOut_175_0 = 0;
        int stackOut_184_0 = 0;
        int stackOut_187_0 = 0;
        int stackOut_195_0 = 0;
        var12 = field_F ? 1 : 0;
        int discarded$6 = 102;
        tk.a();
        int discarded$7 = 0;
        ag.field_e = ad.a(ic.field_C, bh.field_q, "", "small_font");
        ph.field_o = new ka[7];
        ph.field_o[0] = qk.a("", "overlay_title", ic.field_C, TorChallenge.a(1, 1));
        ph.field_o[1] = qk.a("", "overlay_pause", ic.field_C, 0);
        ph.field_o[2] = qk.a("", "overlay_highscores", ic.field_C, 0);
        ph.field_o[3] = qk.a("", "overlay_instructions", ic.field_C, 0);
        ph.field_o[4] = qk.a("", "overlay_achievements", ic.field_C, 0);
        ph.field_o[5] = qk.a("", "overlay_characters", ic.field_C, 0);
        ph.field_o[6] = qk.a("", "overlay_levels", ic.field_C, 0);
        ri.field_j = qk.a("", "overlay_title_tile", ic.field_C, 0);
        ui.field_i = v.a("frame", 26, "", ic.field_C);
        dh.field_cb = new ka[2][];
        hd.field_a = v.a("main_menu_frame", 124, "", ic.field_C);
        dh.field_cb[0] = hd.field_a;
        dh.field_cb[1] = lk.a(-127, "char_select_frame_selected", "", ic.field_C);
        ba.field_b = v.a("button_frame", 53, "", ic.field_C);
        aa.field_k = lk.a(-127, "nav_frame", "", ic.field_C);
        ph.field_m = lk.a(-128, "text_frame", "", ic.field_C);
        qf.field_c = lk.a(-127, "seal_list", "", ic.field_C);
        ib.field_M = lk.a(-127, "go_button", "", ic.field_C);
        dg.field_J = v.a("instructions_frame", 35, "", ic.field_C);
        ka[] discarded$8 = lk.a(-127, "char_select_arrows", "", ic.field_C);
        ua.field_d = mh.a(53, ic.field_C, "keys", "");
        dj.field_V = mh.a(113, ic.field_C, "keys2", "");
        tf.field_j = lk.a(-128, "achievements_large", "", ic.field_C);
        var2 = tf.field_j;
        var3_int = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (~var3_int <= ~var2.length) {
                break L2;
              } else {
                var4_ref_ka = var2[var3_int];
                fd.a((byte) -44, var4_ref_ka);
                var3_int++;
                if (var12 != 0) {
                  break L1;
                } else {
                  if (var12 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            fd.a((byte) -44, je.field_b);
            lj.field_o = lk.a(-127, "interface_clouds", "", ic.field_C);
            rd.field_i = lk.a(-128, "interface_border", "", ic.field_C);
            ng.field_L = lk.a(-127, "interface_score_health", "", ic.field_C);
            ph.field_h = lk.a(-127, "interface_lives_remaining", "", ic.field_C);
            di.field_t = lk.a(-128, "interface_lives_heads", "", ic.field_C);
            rc.field_p = lk.a(-127, "interface_bo_energy", "", ic.field_C);
            ni.field_h = lk.a(-127, "interface_sais_energy", "", ic.field_C);
            ba.field_d = lk.a(-128, "interface_glovepunch_energy", "", ic.field_C);
            wf.field_b = qk.a("", "interface_seals", ic.field_C, 0);
            dl.field_j = qk.a("", "interface_sealscollected", ic.field_C, 0);
            mb.field_d = lk.a(-128, "interface_health_icon", "", ic.field_C);
            rl.field_h = lk.a(-128, "boss_heads", "", ic.field_C);
            la.field_f.a(-63);
            ie.field_f = new ka[3][2];
            ie.field_f[0][0] = rc.field_p[0];
            ie.field_f[0][1] = rc.field_p[1];
            ie.field_f[1][0] = ni.field_h[0];
            ie.field_f[1][1] = ni.field_h[1];
            ie.field_f[2][0] = ba.field_d[0];
            ie.field_f[2][1] = ba.field_d[1];
            dh.field_Y = qk.a("", "menu_slider", ic.field_C, 0);
            wa.field_xb = rb.a(ic.field_C, "", (byte) -127, "intro4_bg");
            hl.a(wa.field_xb, false, gf.field_m[3][0]);
            break L1;
          }
          var2_int = 0;
          L3: while (true) {
            L4: {
              L5: {
                if (var2_int >= 5) {
                  break L5;
                } else {
                  ef.field_h[var2_int] = new ka[s.field_l[var2_int]];
                  var3_int = var2_int;
                  stackOut_8_0 = var3_int;
                  stackIn_36_0 = stackOut_8_0;
                  stackIn_9_0 = stackOut_8_0;
                  if (var12 != 0) {
                    break L4;
                  } else {
                    L6: {
                      L7: {
                        L8: {
                          L9: {
                            L10: {
                              L11: {
                                if (stackIn_9_0 != 0) {
                                  break L11;
                                } else {
                                  if (var12 == 0) {
                                    ef.field_h[var2_int][0] = qk.a("", "intro1", ic.field_C, 0);
                                    if (var12 == 0) {
                                      break L6;
                                    } else {
                                      break L10;
                                    }
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              L12: {
                                if (var3_int != 1) {
                                  break L12;
                                } else {
                                  if (var12 == 0) {
                                    break L10;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              L13: {
                                if (2 != var3_int) {
                                  break L13;
                                } else {
                                  if (var12 == 0) {
                                    break L9;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              if (3 == var3_int) {
                                break L8;
                              } else {
                                if (var3_int == 4) {
                                  break L7;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            ef.field_h[var2_int][0] = qk.a("", "intro2", ic.field_C, 0);
                            if (var12 == 0) {
                              break L6;
                            } else {
                              break L9;
                            }
                          }
                          ef.field_h[var2_int][0] = qk.a("", "intro3", ic.field_C, 0);
                          if (var12 == 0) {
                            break L6;
                          } else {
                            break L8;
                          }
                        }
                        ef.field_h[var2_int][0] = null;
                        ef.field_h[var2_int][1] = qk.a("", "intro4_enemies", ic.field_C, 0);
                        if (var12 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                      ef.field_h[var2_int][0] = qk.a("", "intro5", ic.field_C, 0);
                      break L6;
                    }
                    var2_int++;
                    if (var12 == 0) {
                      continue L3;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              ef.field_h[3][0] = wa.field_xb.a();
              wa.field_xb = null;
              we.field_m = new ka[4];
              we.field_m[0] = null;
              qc.field_c = rb.a(ic.field_C, "", (byte) -116, "game_start_bg");
              we.field_m[1] = qk.a("", "game_start_henhui", ic.field_C, 0);
              we.field_m[2] = qk.a("", "game_start_ziren", ic.field_C, 0);
              we.field_m[3] = qk.a("", "game_start_damen", ic.field_C, 0);
              eb.field_p = new ka[2];
              eb.field_p[0] = qk.a("", "level_start_heads", ic.field_C, 0);
              eb.field_p[1] = qk.a("", "level_start_tower_1", ic.field_C, 0);
              pl.field_f = new ka[4];
              pl.field_f[0] = null;
              ad.field_e = rb.a(ic.field_C, "", (byte) -115, "level_start_boss_bg");
              hl.a(ad.field_e, false, 15245826);
              pl.field_f[1] = qk.a("", "level_start_boss_1", ic.field_C, 0);
              pl.field_f[2] = qk.a("", "level_start_boss_2", ic.field_C, 0);
              pl.field_f[3] = qk.a("", "level_start_boss_3", ic.field_C, 0);
              ei.field_w = new ka[4];
              ei.field_w[0] = null;
              lb.field_t = rb.a(ic.field_C, "", (byte) -128, "game_over_scene_bg");
              hl.a(lb.field_t, false, 6831816);
              ei.field_w[1] = qk.a("", "game_over_scene_henhui", ic.field_C, 0);
              ei.field_w[2] = qk.a("", "game_over_scene_ziren", ic.field_C, 0);
              ei.field_w[3] = qk.a("", "game_over_scene_damen", ic.field_C, 0);
              pf.field_a = new ka[5];
              pf.field_a[0] = null;
              mb.field_b = qc.field_c.b();
              hl.a(qc.field_c, false, 15245826);
              hl.a(mb.field_b, false, 6831816);
              pf.field_a[1] = qk.a("", "game_win_1_henhui", ic.field_C, 0);
              pf.field_a[2] = qk.a("", "game_win_1_ziren", ic.field_C, 0);
              pf.field_a[3] = qk.a("", "game_win_1_damen", ic.field_C, 0);
              pf.field_a[4] = qk.a("", "game_win_1_stars", ic.field_C, 0);
              pe.field_eb = lk.a(-127, "status_messages", "", ic.field_C);
              var2_int = pe.field_eb.length;
              stackOut_35_0 = 0;
              stackIn_36_0 = stackOut_35_0;
              break L4;
            }
            var3_int = stackIn_36_0;
            L14: while (true) {
              L15: {
                L16: {
                  if (var2_int <= var3_int) {
                    break L16;
                  } else {
                    pe.field_eb[var3_int].g();
                    var3_int++;
                    if (var12 != 0) {
                      break L15;
                    } else {
                      if (var12 == 0) {
                        continue L14;
                      } else {
                        break L16;
                      }
                    }
                  }
                }
                dd.field_m = lk.a(-128, "rocket_trail", "", ic.field_C);
                qb.a((byte) 49, dd.field_m);
                wh.field_f = lk.a(-127, "dust_cloud", "", ic.field_C);
                qb.a((byte) 45, wh.field_f);
                ve.field_b = lk.a(-127, "monk1", "", ic.field_C);
                qb.a((byte) 87, ve.field_b);
                tf.field_a = lk.a(-127, "monk2", "", ic.field_C);
                qb.a((byte) 81, tf.field_a);
                oe.field_d = lk.a(-127, "monk3", "", ic.field_C);
                qb.a((byte) 23, oe.field_d);
                hc.field_T = lk.a(-128, "monk1_swooshes", "", ic.field_C);
                qb.a((byte) 57, hc.field_T);
                cg.field_d = lk.a(-127, "monk2_swooshes", "", ic.field_C);
                qb.a((byte) 16, cg.field_d);
                af.field_b = lk.a(-127, "boss1", "", ic.field_C);
                qb.a((byte) 64, af.field_b);
                aj.field_i = lk.a(-127, "boss1_attacks", "", ic.field_C);
                qb.a((byte) 33, aj.field_i);
                pl.field_c = lk.a(-127, "boss2", "", ic.field_C);
                qb.a((byte) 72, pl.field_c);
                s.field_n = lk.a(-127, "boss2_attacks", "", ic.field_C);
                qb.a((byte) 109, s.field_n);
                hi.field_F = lk.a(-127, "boss3", "", ic.field_C);
                qb.a((byte) 126, hi.field_F);
                nk.field_a = lk.a(-128, "boss3_attacks", "", ic.field_C);
                qb.a((byte) 14, nk.field_a);
                si.field_I = new ka[3][][];
                break L15;
              }
              var6_int = 0;
              L17: while (true) {
                stackOut_43_0 = -4;
                stackIn_44_0 = stackOut_43_0;
                L18: while (true) {
                  L19: {
                    L20: {
                      if (stackIn_44_0 >= ~var6_int) {
                        break L20;
                      } else {
                        var5 = oj.field_g[var6_int][1];
                        var4 = oj.field_g[var6_int][0];
                        si.field_I[var6_int] = new ka[var4][var5];
                        if (var12 != 0) {
                          break L19;
                        } else {
                          L21: {
                            L22: {
                              L23: {
                                if (var6_int == 0) {
                                  break L23;
                                } else {
                                  L24: {
                                    if (1 == var6_int) {
                                      break L24;
                                    } else {
                                      if (2 != var6_int) {
                                        break L21;
                                      } else {
                                        var3_array = lk.a(-127, "boss3_swooshes", "", ic.field_C);
                                        if (var12 == 0) {
                                          break L22;
                                        } else {
                                          break L24;
                                        }
                                      }
                                    }
                                  }
                                  var3_array = lk.a(-128, "boss2_swooshes", "", ic.field_C);
                                  if (var12 == 0) {
                                    break L22;
                                  } else {
                                    break L23;
                                  }
                                }
                              }
                              var3_array = lk.a(-128, "boss1_swooshes", "", ic.field_C);
                              break L22;
                            }
                            qb.a((byte) 4, var3_array);
                            var7_int = 0;
                            L25: while (true) {
                              if (var7_int >= var4) {
                                break L21;
                              } else {
                                stackOut_57_0 = 0;
                                stackIn_44_0 = stackOut_57_0;
                                stackIn_58_0 = stackOut_57_0;
                                if (var12 != 0) {
                                  continue L18;
                                } else {
                                  var8 = stackIn_58_0;
                                  L26: while (true) {
                                    L27: {
                                      L28: {
                                        if (~var5 >= ~var8) {
                                          break L28;
                                        } else {
                                          si.field_I[var6_int][var7_int][var8] = var3_array[var5 * var7_int + var8];
                                          var8++;
                                          if (var12 != 0) {
                                            break L27;
                                          } else {
                                            if (var12 == 0) {
                                              continue L26;
                                            } else {
                                              break L28;
                                            }
                                          }
                                        }
                                      }
                                      var7_int++;
                                      break L27;
                                    }
                                    if (var12 == 0) {
                                      continue L25;
                                    } else {
                                      break L21;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var6_int++;
                          if (var12 == 0) {
                            continue L17;
                          } else {
                            break L20;
                          }
                        }
                      }
                    }
                    dj.field_O = qk.a("", "spear", ic.field_C, 0);
                    break L19;
                  }
                  var3_array = null;
                  int discarded$9 = 1;
                  this.b();
                  var6_int = 0;
                  L29: while (true) {
                    stackOut_68_0 = 3;
                    stackIn_69_0 = stackOut_68_0;
                    L30: while (true) {
                      L31: {
                        L32: {
                          if (stackIn_69_0 <= var6_int) {
                            break L32;
                          } else {
                            stackOut_70_0 = 0;
                            stackIn_91_0 = stackOut_70_0;
                            stackIn_71_0 = stackOut_70_0;
                            if (var12 != 0) {
                              break L31;
                            } else {
                              var7_int = stackIn_71_0;
                              L33: while (true) {
                                stackOut_72_0 = 20;
                                stackIn_73_0 = stackOut_72_0;
                                L34: while (true) {
                                  L35: {
                                    if (stackIn_73_0 <= var7_int) {
                                      break L35;
                                    } else {
                                      c.field_c[var7_int][var6_int] = new ka[db.field_x[var7_int][var6_int]];
                                      stackOut_74_0 = 0;
                                      stackIn_69_0 = stackOut_74_0;
                                      stackIn_75_0 = stackOut_74_0;
                                      if (var12 != 0) {
                                        continue L30;
                                      } else {
                                        var8 = stackIn_75_0;
                                        L36: while (true) {
                                          L37: {
                                            if (db.field_x[var7_int][var6_int] <= var8) {
                                              break L37;
                                            } else {
                                              stackOut_77_0 = var6_int;
                                              stackIn_73_0 = stackOut_77_0;
                                              stackIn_78_0 = stackOut_77_0;
                                              if (var12 != 0) {
                                                continue L34;
                                              } else {
                                                L38: {
                                                  if (stackIn_78_0 == 0) {
                                                    c.field_c[var7_int][var6_int][var8] = ve.field_b[var8 + var7_int * 6];
                                                    break L38;
                                                  } else {
                                                    break L38;
                                                  }
                                                }
                                                L39: {
                                                  if (var6_int == 1) {
                                                    c.field_c[var7_int][var6_int][var8] = tf.field_a[var8 + 6 * var7_int];
                                                    break L39;
                                                  } else {
                                                    break L39;
                                                  }
                                                }
                                                L40: {
                                                  if (2 == var6_int) {
                                                    c.field_c[var7_int][var6_int][var8] = oe.field_d[var8 + 6 * var7_int];
                                                    break L40;
                                                  } else {
                                                    break L40;
                                                  }
                                                }
                                                var8++;
                                                if (var12 == 0) {
                                                  continue L36;
                                                } else {
                                                  break L37;
                                                }
                                              }
                                            }
                                          }
                                          var7_int++;
                                          if (var12 == 0) {
                                            continue L33;
                                          } else {
                                            break L35;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var6_int++;
                                  if (var12 == 0) {
                                    continue L29;
                                  } else {
                                    break L32;
                                  }
                                }
                              }
                            }
                          }
                        }
                        ve.field_b = null;
                        oe.field_d = null;
                        tf.field_a = null;
                        stackOut_90_0 = 0;
                        stackIn_91_0 = stackOut_90_0;
                        break L31;
                      }
                      var6_int = stackIn_91_0;
                      L41: while (true) {
                        stackOut_92_0 = var6_int;
                        stackIn_93_0 = stackOut_92_0;
                        L42: while (true) {
                          L43: {
                            L44: {
                              if (stackIn_93_0 >= 2) {
                                break L44;
                              } else {
                                stackOut_94_0 = 0;
                                stackIn_110_0 = stackOut_94_0;
                                stackIn_95_0 = stackOut_94_0;
                                if (var12 != 0) {
                                  break L43;
                                } else {
                                  var7_int = stackIn_95_0;
                                  L45: while (true) {
                                    stackOut_96_0 = ~var7_int;
                                    stackOut_96_1 = -21;
                                    stackIn_97_0 = stackOut_96_0;
                                    stackIn_97_1 = stackOut_96_1;
                                    L46: while (true) {
                                      L47: {
                                        if (stackIn_97_0 <= stackIn_97_1) {
                                          break L47;
                                        } else {
                                          uf.field_o[var7_int][var6_int] = new ka[db.field_x[var7_int][var6_int]];
                                          stackOut_98_0 = 0;
                                          stackIn_93_0 = stackOut_98_0;
                                          stackIn_99_0 = stackOut_98_0;
                                          if (var12 != 0) {
                                            continue L42;
                                          } else {
                                            var8 = stackIn_99_0;
                                            L48: while (true) {
                                              L49: {
                                                if (~var8 <= ~db.field_x[var7_int][var6_int]) {
                                                  break L49;
                                                } else {
                                                  stackOut_101_0 = 0;
                                                  stackOut_101_1 = var6_int;
                                                  stackIn_97_0 = stackOut_101_0;
                                                  stackIn_97_1 = stackOut_101_1;
                                                  stackIn_102_0 = stackOut_101_0;
                                                  stackIn_102_1 = stackOut_101_1;
                                                  if (var12 != 0) {
                                                    continue L46;
                                                  } else {
                                                    L50: {
                                                      if (stackIn_102_0 != stackIn_102_1) {
                                                        break L50;
                                                      } else {
                                                        uf.field_o[var7_int][var6_int][var8] = hc.field_T[var8 + 6 * var7_int];
                                                        break L50;
                                                      }
                                                    }
                                                    L51: {
                                                      if (1 != var6_int) {
                                                        break L51;
                                                      } else {
                                                        uf.field_o[var7_int][var6_int][var8] = cg.field_d[var8 + 6 * var7_int];
                                                        break L51;
                                                      }
                                                    }
                                                    var8++;
                                                    if (var12 == 0) {
                                                      continue L48;
                                                    } else {
                                                      break L49;
                                                    }
                                                  }
                                                }
                                              }
                                              var7_int++;
                                              if (var12 == 0) {
                                                continue L45;
                                              } else {
                                                break L47;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var6_int++;
                                      if (var12 == 0) {
                                        continue L41;
                                      } else {
                                        break L44;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            cg.field_d = null;
                            hc.field_T = null;
                            ak.field_a[0] = lk.a(-127, "henhui_puff", "", ic.field_C);
                            ak.field_a[1] = lk.a(-128, "ziren_puff", "", ic.field_C);
                            ak.field_a[2] = lk.a(-128, "damen_puff", "", ic.field_C);
                            ra.field_b[0][0] = qk.a("", "damen_vert_swipe", ic.field_C, 0);
                            ra.field_b[0][1] = ra.field_b[0][0].i();
                            ra.field_b[1][0] = qk.a("", "damen_angled_swipe", ic.field_C, 0);
                            ra.field_b[1][1] = ra.field_b[1][0].i();
                            stackOut_109_0 = 0;
                            stackIn_110_0 = stackOut_109_0;
                            break L43;
                          }
                          var6_int = stackIn_110_0;
                          L52: while (true) {
                            stackOut_111_0 = var6_int;
                            stackIn_112_0 = stackOut_111_0;
                            L53: while (true) {
                              L54: {
                                L55: {
                                  if (stackIn_112_0 >= 3) {
                                    break L55;
                                  } else {
                                    stackOut_113_0 = 0;
                                    stackIn_147_0 = stackOut_113_0;
                                    stackIn_114_0 = stackOut_113_0;
                                    if (var12 != 0) {
                                      break L54;
                                    } else {
                                      var7_int = stackIn_114_0;
                                      L56: while (true) {
                                        stackOut_115_0 = var7_int;
                                        stackOut_115_1 = 16;
                                        stackIn_116_0 = stackOut_115_0;
                                        stackIn_116_1 = stackOut_115_1;
                                        L57: while (true) {
                                          L58: {
                                            if (stackIn_116_0 >= stackIn_116_1) {
                                              break L58;
                                            } else {
                                              g.field_i[var7_int][var6_int] = new ka[kk.field_h[var7_int][var6_int]];
                                              stackOut_117_0 = 0;
                                              stackIn_112_0 = stackOut_117_0;
                                              stackIn_118_0 = stackOut_117_0;
                                              if (var12 != 0) {
                                                continue L53;
                                              } else {
                                                var8 = stackIn_118_0;
                                                L59: while (true) {
                                                  L60: {
                                                    if (~var8 <= ~kk.field_h[var7_int][var6_int]) {
                                                      break L60;
                                                    } else {
                                                      stackOut_120_0 = 0;
                                                      stackOut_120_1 = var6_int;
                                                      stackIn_116_0 = stackOut_120_0;
                                                      stackIn_116_1 = stackOut_120_1;
                                                      stackIn_121_0 = stackOut_120_0;
                                                      stackIn_121_1 = stackOut_120_1;
                                                      if (var12 != 0) {
                                                        continue L57;
                                                      } else {
                                                        L61: {
                                                          L62: {
                                                            if (stackIn_121_0 != stackIn_121_1) {
                                                              break L62;
                                                            } else {
                                                              L63: {
                                                                if (8 <= var7_int) {
                                                                  break L63;
                                                                } else {
                                                                  g.field_i[var7_int][var6_int][var8] = af.field_b[var7_int * 8 - -var8];
                                                                  if (var12 == 0) {
                                                                    break L61;
                                                                  } else {
                                                                    break L63;
                                                                  }
                                                                }
                                                              }
                                                              g.field_i[var7_int][var6_int][var8] = aj.field_i[var7_int * 8 - 64 - -var8];
                                                              if (var12 == 0) {
                                                                break L61;
                                                              } else {
                                                                break L62;
                                                              }
                                                            }
                                                          }
                                                          L64: {
                                                            if (1 == var6_int) {
                                                              break L64;
                                                            } else {
                                                              if (var6_int == 2) {
                                                                L65: {
                                                                  if (var7_int >= 8) {
                                                                    break L65;
                                                                  } else {
                                                                    g.field_i[var7_int][var6_int][var8] = hi.field_F[var8 + var7_int * 8];
                                                                    if (var12 == 0) {
                                                                      break L61;
                                                                    } else {
                                                                      break L65;
                                                                    }
                                                                  }
                                                                }
                                                                g.field_i[var7_int][var6_int][var8] = nk.field_a[var8 + var7_int * 8 - 64];
                                                                if (var12 == 0) {
                                                                  break L61;
                                                                } else {
                                                                  break L64;
                                                                }
                                                              } else {
                                                                break L61;
                                                              }
                                                            }
                                                          }
                                                          L66: {
                                                            if (var7_int >= 8) {
                                                              break L66;
                                                            } else {
                                                              g.field_i[var7_int][var6_int][var8] = pl.field_c[var8 + 8 * var7_int];
                                                              if (var12 == 0) {
                                                                break L61;
                                                              } else {
                                                                break L66;
                                                              }
                                                            }
                                                          }
                                                          g.field_i[var7_int][var6_int][var8] = s.field_n[8 * (-8 + var7_int) + var8];
                                                          break L61;
                                                        }
                                                        var8++;
                                                        if (var12 == 0) {
                                                          continue L59;
                                                        } else {
                                                          break L60;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  var7_int++;
                                                  if (var12 == 0) {
                                                    continue L56;
                                                  } else {
                                                    break L58;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          var6_int++;
                                          if (var12 == 0) {
                                            continue L52;
                                          } else {
                                            break L55;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                ec.field_a = lk.a(-128, "tour_icon", "", ic.field_C);
                                qb.a((byte) 21, ec.field_a);
                                wi.field_d = lk.a(-127, "coins", "", ic.field_C);
                                qb.a((byte) 103, wi.field_d);
                                be.field_f = lk.a(-127, "tour_wall", "", ic.field_C);
                                ic.field_D = lk.a(-128, "tour_wall2", "", ic.field_C);
                                af.field_a = lk.a(-128, "tour_wall3", "", ic.field_C);
                                stackOut_146_0 = 0;
                                stackIn_147_0 = stackOut_146_0;
                                break L54;
                              }
                              var6_int = stackIn_147_0;
                              L67: while (true) {
                                L68: {
                                  L69: {
                                    if (6 <= var6_int) {
                                      break L69;
                                    } else {
                                      stackOut_149_0 = 0;
                                      stackIn_158_0 = stackOut_149_0;
                                      stackIn_150_0 = stackOut_149_0;
                                      if (var12 != 0) {
                                        break L68;
                                      } else {
                                        var7_int = stackIn_150_0;
                                        L70: while (true) {
                                          L71: {
                                            L72: {
                                              if (var7_int >= 2) {
                                                break L72;
                                              } else {
                                                we.field_e[var6_int][var7_int] = new ka(ic.field_D[0].field_u, ic.field_D[0].field_x);
                                                var7_int++;
                                                if (var12 != 0) {
                                                  break L71;
                                                } else {
                                                  if (var12 == 0) {
                                                    continue L70;
                                                  } else {
                                                    break L72;
                                                  }
                                                }
                                              }
                                            }
                                            var6_int++;
                                            break L71;
                                          }
                                          if (var12 == 0) {
                                            continue L67;
                                          } else {
                                            break L69;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  stackOut_157_0 = 0;
                                  stackIn_158_0 = stackOut_157_0;
                                  break L68;
                                }
                                var6_int = stackIn_158_0;
                                L73: while (true) {
                                  L74: {
                                    L75: {
                                      if (var6_int >= 2) {
                                        break L75;
                                      } else {
                                        stackOut_160_0 = 0;
                                        stackIn_169_0 = stackOut_160_0;
                                        stackIn_161_0 = stackOut_160_0;
                                        if (var12 != 0) {
                                          break L74;
                                        } else {
                                          var7_int = stackIn_161_0;
                                          L76: while (true) {
                                            L77: {
                                              L78: {
                                                if (var7_int >= 2) {
                                                  break L78;
                                                } else {
                                                  re.field_v[var6_int][var7_int] = new ka(af.field_a[0].field_u, af.field_a[0].field_x);
                                                  var7_int++;
                                                  if (var12 != 0) {
                                                    break L77;
                                                  } else {
                                                    if (var12 == 0) {
                                                      continue L76;
                                                    } else {
                                                      break L78;
                                                    }
                                                  }
                                                }
                                              }
                                              var6_int++;
                                              break L77;
                                            }
                                            if (var12 == 0) {
                                              continue L73;
                                            } else {
                                              break L75;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    stackOut_168_0 = 0;
                                    stackIn_169_0 = stackOut_168_0;
                                    break L74;
                                  }
                                  var6_int = stackIn_169_0;
                                  L79: while (true) {
                                    stackOut_170_0 = ~var6_int;
                                    stackIn_171_0 = stackOut_170_0;
                                    L80: while (true) {
                                      L81: {
                                        L82: {
                                          if (stackIn_171_0 <= -5) {
                                            break L82;
                                          } else {
                                            stackOut_172_0 = 0;
                                            stackIn_185_0 = stackOut_172_0;
                                            stackIn_173_0 = stackOut_172_0;
                                            if (var12 != 0) {
                                              break L81;
                                            } else {
                                              var7_int = stackIn_173_0;
                                              L83: while (true) {
                                                L84: {
                                                  if (2 <= var7_int) {
                                                    break L84;
                                                  } else {
                                                    stackOut_175_0 = 0;
                                                    stackIn_171_0 = stackOut_175_0;
                                                    stackIn_176_0 = stackOut_175_0;
                                                    if (var12 != 0) {
                                                      continue L80;
                                                    } else {
                                                      var8 = stackIn_176_0;
                                                      L85: while (true) {
                                                        L86: {
                                                          L87: {
                                                            if (var8 >= 2) {
                                                              break L87;
                                                            } else {
                                                              sf.field_d[var6_int][var7_int][var8] = new ka(be.field_f[ea.field_e * 6 - -var8].field_u, be.field_f[var8 + 6 * ea.field_e].field_x);
                                                              var8++;
                                                              if (var12 != 0) {
                                                                break L86;
                                                              } else {
                                                                if (var12 == 0) {
                                                                  continue L85;
                                                                } else {
                                                                  break L87;
                                                                }
                                                              }
                                                            }
                                                          }
                                                          var7_int++;
                                                          break L86;
                                                        }
                                                        if (var12 == 0) {
                                                          continue L83;
                                                        } else {
                                                          break L84;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                var6_int++;
                                                if (var12 == 0) {
                                                  continue L79;
                                                } else {
                                                  break L82;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        kj.field_C = lk.a(-128, "doors", "", ic.field_C);
                                        qb.a((byte) 82, kj.field_C);
                                        stackOut_184_0 = 8;
                                        stackIn_185_0 = stackOut_184_0;
                                        break L81;
                                      }
                                      var6 = new int[stackIn_185_0];
                                      var8 = 90;
                                      var7 = new ka(var8, var8);
                                      je.field_g = new ka(kj.field_C[0].field_q, kj.field_C[0].field_v);
                                      cj.field_c = new ka(kj.field_C[0].field_q, kj.field_C[0].field_v);
                                      od.a(33, 30, 68, 90, 34, 45, je.field_g, var7, var6);
                                      var6 = null;
                                      var7 = null;
                                      je.field_g.h();
                                      c.field_b = qk.a("", "door_sign", ic.field_C, 0);
                                      c.field_b.h();
                                      si.field_F = new ka(kj.field_C[0].field_q, kj.field_C[0].field_v);
                                      si.field_F.d();
                                      qg.f(33, 30, 68, 90, 1);
                                      kj.field_C[1].g(0, 0);
                                      la.field_f.a(101);
                                      dk.field_c = new ka[4][9];
                                      var9 = 0;
                                      L88: while (true) {
                                        L89: {
                                          L90: {
                                            if (var9 >= 4) {
                                              break L90;
                                            } else {
                                              stackOut_187_0 = 0;
                                              stackIn_196_0 = stackOut_187_0;
                                              stackIn_188_0 = stackOut_187_0;
                                              if (var12 != 0) {
                                                break L89;
                                              } else {
                                                var10_int = stackIn_188_0;
                                                L91: while (true) {
                                                  L92: {
                                                    L93: {
                                                      if (9 <= var10_int) {
                                                        break L93;
                                                      } else {
                                                        dk.field_c[var9][var10_int] = wi.field_d[var10_int + var9 * 9];
                                                        var10_int++;
                                                        if (var12 != 0) {
                                                          break L92;
                                                        } else {
                                                          if (var12 == 0) {
                                                            continue L91;
                                                          } else {
                                                            break L93;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    var9++;
                                                    break L92;
                                                  }
                                                  if (var12 == 0) {
                                                    continue L88;
                                                  } else {
                                                    break L90;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          wi.field_d = null;
                                          lj.field_h = lk.a(-127, "clouds", "", ic.field_C);
                                          qb.a((byte) 86, lj.field_h);
                                          var9 = tf.field_x.field_x - -tf.field_x.field_K;
                                          hh.field_b = new ka(var9, var9);
                                          hh.field_b.d();
                                          bc.field_f.c(0, 0, var9, var9);
                                          bc.field_f = null;
                                          la.field_f.a(105);
                                          stackOut_195_0 = 12476;
                                          stackIn_196_0 = stackOut_195_0;
                                          break L89;
                                        }
                                        int discarded$10 = 255;
                                        oj.a(gi.b(stackIn_196_0), 0, 80, false, il.field_p);
                                        var10 = qk.a("", "mb_frames", ic.field_C, 0);
                                        pl.a(13267, dl.field_E, var10);
                                        int discarded$11 = 2;
                                        nj.a(qk.a("", "mb_logo", ic.field_C, 0));
                                        pa.a(-99, lk.a(-127, "mb_sshots", "", ic.field_C));
                                        var11 = qk.a("", "mb_pricing_bg", ic.field_C, 0);
                                        hc.a(10, 101, 10, 30, 80, 1500, 80, 10, var11);
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
                    }
                  }
                }
              }
            }
          }
        }
    }

    static int a(int param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        try {
          L0: {
            stackOut_0_0 = param0 ^ param1;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var2, "TorChallenge.E(" + param0 + 44 + param1 + 41);
        }
        return stackIn_1_0;
    }

    public static void q(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                int discarded$2 = TorChallenge.a((String) null, false, -43, -1, (String) null, (String) null, 18);
                break L1;
              }
            }
            field_I = null;
            field_H = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var1, "TorChallenge.L(" + param0 + 41);
        }
    }

    final void f(int param0) {
        RuntimeException var2 = null;
        java.awt.Canvas var2_ref = null;
        ka var3_ref_ka = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_82_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_81_0 = false;
        int stackOut_79_0 = 0;
        var5 = field_F ? 1 : 0;
        try {
          L0: {
            var2_ref = ab.a(102);
            if (!hc.c((byte) 57)) {
              if (!eb.field_o) {
                il.a(-20895, var2_ref);
                return;
              } else {
                if (!jh.a((byte) 103)) {
                  mh.a(wa.field_qb, (byte) -125, 100.0f);
                  il.a(-20895, var2_ref);
                  return;
                } else {
                  L1: {
                    L2: {
                      if (~bc.field_o == ~bb.field_h) {
                        break L2;
                      } else {
                        L3: {
                          if (16 > hk.field_e) {
                            break L3;
                          } else {
                            L4: {
                              L5: {
                                if (-1 == bb.field_h) {
                                  break L5;
                                } else {
                                  ug.field_i[bb.field_h].e(param0 ^ 1014663489);
                                  if (var5 == 0) {
                                    break L4;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              ji.field_m.c(param0 ^ 7856);
                              break L4;
                            }
                            var3_ref_ka = new ka(1, 1);
                            var3_ref_ka.field_y = qg.field_i;
                            var3_ref_ka.field_q = qg.field_g;
                            var3_ref_ka.field_u = qg.field_g;
                            var3_ref_ka.field_v = qg.field_f;
                            var3_ref_ka.field_x = qg.field_f;
                            var4 = 256 * (hk.field_e - 15) / 16;
                            var3_ref_ka.e(0, 0, var4);
                            if (var5 == 0) {
                              break L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                        L6: {
                          L7: {
                            if (bc.field_o == -1) {
                              break L7;
                            } else {
                              ug.field_i[bc.field_o].e(param0 ^ 1014663489);
                              if (var5 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          ji.field_m.c(48);
                          break L6;
                        }
                        var3_ref_ka = new ka(1, 1);
                        var3_ref_ka.field_q = qg.field_g;
                        var3_ref_ka.field_u = qg.field_g;
                        var3_ref_ka.field_y = qg.field_i;
                        var3_ref_ka.field_v = qg.field_f;
                        var3_ref_ka.field_x = qg.field_f;
                        var4 = (-(255 * hk.field_e) + 3825) / 15;
                        var3_ref_ka.e(0, 0, var4);
                        if (var5 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    L8: {
                      if (-1 != bc.field_o) {
                        break L8;
                      } else {
                        ji.field_m.c(48);
                        if (var5 == 0) {
                          break L1;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      L10: {
                        if (bc.field_o == 8) {
                          break L10;
                        } else {
                          if (9 != bc.field_o) {
                            break L9;
                          } else {
                            break L10;
                          }
                        }
                      }
                      ug.field_i[8].e(1014667201);
                      ug.field_i[9].e(1014667201);
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L9;
                      }
                    }
                    L11: {
                      if (bc.field_o == 10) {
                        break L11;
                      } else {
                        if (11 == bc.field_o) {
                          break L11;
                        } else {
                          ug.field_i[bc.field_o].e(1014667201);
                          if (var5 == 0) {
                            break L1;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                    ug.field_i[10].e(1014667201);
                    ug.field_i[11].e(param0 + 1014659393);
                    break L1;
                  }
                  L12: {
                    if (param0 == 7808) {
                      break L12;
                    } else {
                      field_G = -107;
                      break L12;
                    }
                  }
                  L13: {
                    int discarded$4 = 0;
                    if (vc.a()) {
                      qg.d(0, 0, qg.field_g, qg.field_f);
                      si.a(true, ui.field_i, ui.field_i[0].field_x + 16, 16 + ui.field_i[0].field_u);
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if (rb.field_b != 0) {
                      var3 = 256 * hk.field_e / 32;
                      if (0 >= var3) {
                        break L14;
                      } else {
                        qg.a(0, 0, qg.field_g, qg.field_f, 0, var3);
                        break L14;
                      }
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    int discarded$5 = 1;
                    if (lc.a()) {
                      L16: {
                        if (null == gi.field_d) {
                          stackOut_81_0 = m.field_d;
                          stackIn_82_0 = stackOut_81_0 ? 1 : 0;
                          break L16;
                        } else {
                          stackOut_79_0 = 1;
                          stackIn_82_0 = stackOut_79_0;
                          break L16;
                        }
                      }
                      qk.a(stackIn_82_0 != 0, 0);
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  int discarded$6 = 0;
                  nj.a(0, 0, var2_ref);
                  break L0;
                }
              }
            } else {
              int discarded$7 = -40;
              ib.a(var2_ref, param0 + -7783, ph.a());
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var2, "TorChallenge.C(" + param0 + 41);
        }
    }

    final void d(int param0) {
        RuntimeException runtimeException = null;
        kb var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = field_F ? 1 : 0;
        try {
          L0: {
            ((TorChallenge) this).a(false, 11, 2, 3, false, 0, 1, 39);
            var2 = new kb();
            var2.b(128, -122, 9);
            kb.a(22050, 16239, sh.field_u, true, (java.awt.Component) (Object) bg.field_P, var2);
            lg.field_f = 1;
            qa.field_f = 0;
            ai.field_d = 0;
            ((TorChallenge) this).a(true, true, true, true, false);
            if (param0 <= -62) {
              var3 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var3 >= 3) {
                      break L3;
                    } else {
                      ii.field_f[var3] = new int[1];
                      var3++;
                      if (var4 != 0) {
                        break L2;
                      } else {
                        if (var4 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  ja.a((byte) 124);
                  break L2;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw oj.a((Throwable) (Object) runtimeException, "TorChallenge.H(" + param0 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        RuntimeException decompiledCaughtException = null;
        var16 = field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var8_int = gl.field_l[param5][param6][1][0];
              var9 = gl.field_l[param5][param6][1][1];
              var10 = gl.field_l[param5][param6][2][0];
              var11 = gl.field_l[param5][param6][2][1];
              var12 = vb.field_a[param5][param6];
              if (!param3) {
                break L1;
              } else {
                TorChallenge.q(123);
                break L1;
              }
            }
            L2: {
              qg.a(ae.field_y);
              var13 = 64;
              qg.a(var8_int, param1, var9, param4);
              var14 = var12 + -1;
              if (var14 < 0) {
                var14 += 64;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var15 = var12 - -1;
              if (64 <= var15) {
                var15 -= 64;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              L5: {
                if (0 != param7) {
                  break L5;
                } else {
                  if ((64 & ic.field_E[var14][param2]) <= 0) {
                    break L5;
                  } else {
                    qg.f(var10, param1, var9, param4);
                    re.field_v[1][param6].a(var10, param1);
                    qg.b(ae.field_y);
                    if (var16 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              L6: {
                if (param7 == 0) {
                  break L6;
                } else {
                  L7: {
                    if (param7 != 1) {
                      break L7;
                    } else {
                      if (0 >= (64 & ic.field_E[var15][param2])) {
                        break L7;
                      } else {
                        qg.f(var8_int, param1, var11, param4);
                        re.field_v[1][param6].a(var8_int, param1);
                        qg.b(ae.field_y);
                        if (var16 == 0) {
                          break L4;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  qg.f(var11, param1, -var11 + var9, var13, 0);
                  qg.a(var8_int, param1, var11, param4);
                  re.field_v[0][param6].a(var8_int, param1);
                  qg.b(ae.field_y);
                  if (var16 == 0) {
                    break L4;
                  } else {
                    break L6;
                  }
                }
              }
              qg.f(var8_int, param1, var10 + -var8_int, var13, 0);
              qg.a(var10, param1, var9, param4);
              re.field_v[0][param6].a(var10, param1);
              qg.b(ae.field_y);
              break L4;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var8, "TorChallenge.A(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    private final void d(int param0, boolean param1) {
        RuntimeException var3 = null;
        ka[] var3_array = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ka[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_21_0 = 0;
        var15 = field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (!param1) {
                    break L3;
                  } else {
                    var3_array = lk.a(-128, "skeleton_runner", "", ic.field_C);
                    var4 = 3;
                    var5 = 8;
                    var6 = var3_array.length;
                    var7 = var6 / var5;
                    var8 = var4 * var6;
                    var9 = new ka[var8];
                    var10 = 0;
                    L4: while (true) {
                      stackOut_3_0 = ~var5;
                      stackIn_4_0 = stackOut_3_0;
                      L5: while (true) {
                        L6: {
                          if (stackIn_4_0 >= ~var10) {
                            break L6;
                          } else {
                            stackOut_5_0 = 0;
                            stackIn_22_0 = stackOut_5_0;
                            stackIn_6_0 = stackOut_5_0;
                            if (var15 != 0) {
                              break L1;
                            } else {
                              var11 = stackIn_6_0;
                              L7: while (true) {
                                L8: {
                                  if (~var11 <= ~var4) {
                                    break L8;
                                  } else {
                                    stackOut_8_0 = 0;
                                    stackIn_4_0 = stackOut_8_0;
                                    stackIn_9_0 = stackOut_8_0;
                                    if (var15 != 0) {
                                      continue L5;
                                    } else {
                                      var12 = stackIn_9_0;
                                      L9: while (true) {
                                        L10: {
                                          L11: {
                                            if (~var7 >= ~var12) {
                                              break L11;
                                            } else {
                                              var13 = var7 * var10 - -var12;
                                              var14 = var11 * var7 + var4 * var7 * var10 - -var12;
                                              var9[var14] = var3_array[var13];
                                              var12++;
                                              if (var15 != 0) {
                                                break L10;
                                              } else {
                                                if (var15 == 0) {
                                                  continue L9;
                                                } else {
                                                  break L11;
                                                }
                                              }
                                            }
                                          }
                                          var11++;
                                          break L10;
                                        }
                                        if (var15 == 0) {
                                          continue L7;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                  }
                                }
                                var10++;
                                if (var15 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                        }
                        re.field_x[dg.field_T[1]] = var9;
                        if (var15 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                re.field_x[dg.field_T[1]] = lk.a(-128, "runner", "", ic.field_C);
                break L2;
              }
              qb.a((byte) 94, re.field_x[dg.field_T[1]]);
              stackOut_21_0 = 83;
              stackIn_22_0 = stackOut_21_0;
              break L1;
            }
            L12: {
              if (stackIn_22_0 >= 80) {
                break L12;
              } else {
                field_H = null;
                break L12;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var3, "TorChallenge.K(" + 83 + 44 + param1 + 41);
        }
    }

    private final void s() {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (jd.field_e == null) {
                break L1;
              } else {
                int discarded$2 = 0;
                kc.a(jd.field_e);
                jd.field_e = null;
                id.a(87);
                break L1;
              }
            }
            ic.field_C = pe.b(4, -1);
            bh.field_q = pe.b(5, -1);
            pk.field_d = pe.b(6, -1);
            lk.field_f = pe.b(7, -1);
            cl.field_y = pe.b(8, -1);
            fh.field_f = pe.b(9, -1);
            qh.field_M = pe.b(10, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var2, "TorChallenge.D(" + 119 + 41);
        }
    }

    final void d(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        rd var3_ref_rd = null;
        bk var3_ref_bk = null;
        int var3 = 0;
        eh var3_ref_eh = null;
        int var4 = 0;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        Object stackIn_46_0 = null;
        Object stackIn_48_0 = null;
        Object stackIn_50_0 = null;
        Object stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        Object stackOut_45_0 = null;
        Object stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        Object stackOut_46_0 = null;
        Object stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        var4 = field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              int discarded$15 = -117;
              cl.b();
              if (gi.field_d == null) {
                break L1;
              } else {
                if (gi.field_d.field_i) {
                  ij.c((byte) -126);
                  int discarded$16 = 116;
                  ki.a();
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              var2_int = 54 / ((param0 - -39) / 43);
              stackOut_8_0 = this;
              stackOut_8_1 = -115;
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              if (null == gi.field_d) {
                stackOut_11_0 = this;
                stackOut_11_1 = stackIn_11_1;
                stackOut_11_2 = 0;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                stackIn_12_2 = stackOut_11_2;
                break L2;
              } else {
                stackOut_9_0 = this;
                stackOut_9_1 = stackIn_9_1;
                stackOut_9_2 = 1;
                stackIn_12_0 = stackOut_9_0;
                stackIn_12_1 = stackOut_9_1;
                stackIn_12_2 = stackOut_9_2;
                break L2;
              }
            }
            L3: {
              ((TorChallenge) this).b(stackIn_12_1, stackIn_12_2 != 0);
              if (tc.field_k) {
                int discarded$17 = 119;
                this.s();
                tc.field_k = false;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (hc.c((byte) 63)) {
                ((TorChallenge) this).i(109);
                if (hc.c((byte) -108)) {
                  L5: {
                    if (!ih.f((byte) -128)) {
                      break L5;
                    } else {
                      boolean discarded$18 = this.a(false, (byte) 82);
                      break L5;
                    }
                  }
                  return;
                } else {
                  break L4;
                }
              } else {
                break L4;
              }
            }
            L6: {
              L7: {
                if (eb.field_o) {
                  break L7;
                } else {
                  mc.a(bl.field_X, 83);
                  if (!this.a(true, (byte) 63)) {
                    break L6;
                  } else {
                    eb.field_o = true;
                    if (var4 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
              }
              L8: {
                if (!jh.a((byte) 77)) {
                  break L8;
                } else {
                  L9: {
                    int discarded$19 = 0;
                    if (vc.a()) {
                      break L9;
                    } else {
                      L10: {
                        int discarded$20 = 1;
                        if (lc.a()) {
                          break L10;
                        } else {
                          int discarded$21 = 0;
                          this.u();
                          if (var4 == 0) {
                            break L6;
                          } else {
                            break L10;
                          }
                        }
                      }
                      L11: {
                        stackOut_45_0 = this;
                        stackIn_50_0 = stackOut_45_0;
                        stackIn_46_0 = stackOut_45_0;
                        if (null == gi.field_d) {
                          stackOut_50_0 = this;
                          stackOut_50_1 = 0;
                          stackIn_51_0 = stackOut_50_0;
                          stackIn_51_1 = stackOut_50_1;
                          break L11;
                        } else {
                          stackOut_46_0 = this;
                          stackIn_48_0 = stackOut_46_0;
                          stackOut_48_0 = this;
                          stackOut_48_1 = 1;
                          stackIn_51_0 = stackOut_48_0;
                          stackIn_51_1 = stackOut_48_1;
                          break L11;
                        }
                      }
                      L12: {
                        L13: {
                          var3 = ((TorChallenge) this).a(stackIn_51_1 != 0, 127);
                          if (var3 == 1) {
                            break L13;
                          } else {
                            if (var3 != 2) {
                              break L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        L14: {
                          if (gi.field_d == null) {
                            break L14;
                          } else {
                            ij.c((byte) -120);
                            break L14;
                          }
                        }
                        if (2 == var3) {
                          ef.a((byte) -93, gi.b(12476));
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      if (var4 == 0) {
                        break L6;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L15: {
                    if (rb.field_b == 0) {
                      break L15;
                    } else {
                      int discarded$22 = 0;
                      this.u();
                      if (var4 == 0) {
                        break L6;
                      } else {
                        break L15;
                      }
                    }
                  }
                  L16: {
                    L17: {
                      var3 = og.a(false);
                      if (var3 == 2) {
                        break L17;
                      } else {
                        L18: {
                          if (var3 == 3) {
                            break L18;
                          } else {
                            if (var3 == 4) {
                              fh.a(0, 7284, -2);
                              if (var4 == 0) {
                                break L16;
                              } else {
                                break L18;
                              }
                            } else {
                              break L16;
                            }
                          }
                        }
                        il.a(true, 0);
                        if (var4 == 0) {
                          break L16;
                        } else {
                          break L17;
                        }
                      }
                    }
                    ij.c((byte) -104);
                    break L16;
                  }
                  L19: {
                    int discarded$23 = 0;
                    if (!vc.a()) {
                      ug.field_i[bc.field_o].a(3, true);
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  if (var4 == 0) {
                    break L6;
                  } else {
                    break L8;
                  }
                }
              }
              int discarded$24 = 3;
              aj.b();
              if (jh.a((byte) 57)) {
                L20: {
                  L21: {
                    bi.a(125);
                    int discarded$25 = 2;
                    mf.b();
                    if (ee.field_o > 0) {
                      break L21;
                    } else {
                      cd.field_o = true;
                      if (var4 == 0) {
                        break L20;
                      } else {
                        break L21;
                      }
                    }
                  }
                  cd.field_o = false;
                  break L20;
                }
                if (5 != bc.field_o) {
                  break L6;
                } else {
                  if (eh.field_l != 0) {
                    break L6;
                  } else {
                    bc.field_o = 2;
                    be.a(2, (byte) -125, false);
                    break L6;
                  }
                }
              } else {
                break L6;
              }
            }
            L22: {
              L23: {
                if (d.p(-77)) {
                  break L23;
                } else {
                  L24: while (true) {
                    L25: {
                      L26: {
                        var3_ref_rd = (rd) (Object) wc.field_g.a((byte) -100);
                        if (null == var3_ref_rd) {
                          break L26;
                        } else {
                          fc.a(var3_ref_rd, 4, false);
                          if (var4 != 0) {
                            break L25;
                          } else {
                            if (var4 == 0) {
                              continue L24;
                            } else {
                              break L26;
                            }
                          }
                        }
                      }
                      L27: while (true) {
                        var3_ref_bk = (bk) (Object) kj.field_B.a((byte) 102);
                        if (null == var3_ref_bk) {
                          break L25;
                        } else {
                          ee.a(var3_ref_bk, 5, (byte) -43);
                          if (var4 != 0) {
                            break L23;
                          } else {
                            if (var4 == 0) {
                              continue L27;
                            } else {
                              break L25;
                            }
                          }
                        }
                      }
                    }
                    L28: while (true) {
                      var3_ref_eh = (eh) (Object) wj.field_b.a((byte) -113);
                      if (var3_ref_eh == null) {
                        break L23;
                      } else {
                        int discarded$26 = 160;
                        int discarded$27 = 6;
                        ki.a(var3_ref_eh);
                        if (var4 != 0) {
                          break L22;
                        } else {
                          if (var4 == 0) {
                            continue L28;
                          } else {
                            break L23;
                          }
                        }
                      }
                    }
                  }
                }
              }
              L29: while (true) {
                L30: {
                  if (!p.a(16, qc.field_h)) {
                    break L30;
                  } else {
                    ((TorChallenge) this).j(5000);
                    if (var4 != 0) {
                      break L22;
                    } else {
                      if (var4 == 0) {
                        continue L29;
                      } else {
                        break L30;
                      }
                    }
                  }
                }
                nb.a(0, -1);
                break L22;
              }
            }
            L31: {
              int discarded$28 = -26375;
              if (!nb.a()) {
                break L31;
              } else {
                var3 = ((TorChallenge) this).e((byte) 110);
                if (var3 != 2) {
                  break L31;
                } else {
                  int discarded$29 = 10;
                  kc.f();
                  break L31;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var2, "TorChallenge.N(" + param0 + 41);
        }
    }

    final static int a(String param0, boolean param1, int param2, int param3, String param4, String param5, int param6) {
        qa var7 = null;
        RuntimeException var7_ref = null;
        qa var8 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              var7 = new qa(param4);
              if (param2 == -20031) {
                break L1;
              } else {
                int discarded$2 = TorChallenge.a((String) null, false, -109, -34, (String) null, (String) null, -9);
                break L1;
              }
            }
            var8 = new qa(param0);
            stackOut_3_0 = pd.a(var8, param6, param5, param1, param3, -1, var7);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var7_ref;
            stackOut_5_1 = new StringBuilder().append("TorChallenge.G(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param4 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param5 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param6 + 41);
        }
        return stackIn_4_0;
    }

    public TorChallenge() {
    }

    private final boolean a(boolean param0, byte param1) {
        int var3_int = 0;
        int var4 = 0;
        Object stackIn_59_0 = null;
        Object stackIn_66_0 = null;
        Object stackOut_58_0 = null;
        Object stackOut_65_0 = null;
        var4 = field_F ? 1 : 0;
        int discarded$10 = -67;
        t.a();
        if (null == pk.field_d) {
          if (qh.field_M == null) {
            if (null != lk.field_f) {
              mh.a(pk.field_a, (byte) -125, 70.0f);
              ((TorChallenge) this).f(7808);
              cg.field_a[3] = wg.a(lk.field_f, "", "Henhui_character_select").c();
              cg.field_a[4] = wg.a(lk.field_f, "", "Ziren_character_select").c();
              cg.field_a[5] = wg.a(lk.field_f, "", "Damen_character_select").c();
              cg.field_a[6] = wg.a(lk.field_f, "", "TOR_Challenge_Menu").c();
              cg.field_a[7] = wg.a(lk.field_f, "", "menu_character_selected_gong").c();
              cg.field_a[8] = wg.a(lk.field_f, "", "menu_TOWER").c();
              cg.field_a[9] = wg.a(lk.field_f, "", "menu_ONE").c();
              cg.field_a[10] = wg.a(lk.field_f, "", "menu_TWO").c();
              cg.field_a[11] = wg.a(lk.field_f, "", "menu_THREE").c();
              cg.field_a[12] = wg.a(lk.field_f, "", "menu_FOUR").c();
              cg.field_a[13] = wg.a(lk.field_f, "", "menu_FIVE").c();
              cg.field_a[14] = wg.a(lk.field_f, "", "menu_SIX").c();
              cg.field_a[15] = wg.a(lk.field_f, "", "menu_READY").c();
              cg.field_a[16] = wg.a(lk.field_f, "", "menu_YOU_LOSE").c();
              wl.field_c[6][0] = wg.a(lk.field_f, "", "H_Attack_1").c();
              wl.field_c[6][1] = wg.a(lk.field_f, "", "Z_Attack_1").c();
              wl.field_c[6][2] = wg.a(lk.field_f, "", "D_Attack_1").c();
              wl.field_c[7][0] = wg.a(lk.field_f, "", "H_Attack_2").c();
              wl.field_c[7][1] = wg.a(lk.field_f, "", "Z_Attack_2").c();
              wl.field_c[7][2] = wg.a(lk.field_f, "", "D_Attack_2").c();
              wl.field_c[8][0] = wg.a(lk.field_f, "", "H_Attack_3_combo").c();
              wl.field_c[8][1] = wg.a(lk.field_f, "", "Z_Attack_3_combo").c();
              wl.field_c[8][2] = wg.a(lk.field_f, "", "D_Attack_3_combo").c();
              wl.field_c[9][0] = wg.a(lk.field_f, "", "H_Attack_2_spec").c();
              wl.field_c[9][1] = wg.a(lk.field_f, "", "Z_Attack_2_spec").c();
              wl.field_c[9][2] = wg.a(lk.field_f, "", "D_Attack_2_spec").c();
              wl.field_c[10][0] = wg.a(lk.field_f, "", "H_Death").c();
              wl.field_c[10][1] = wg.a(lk.field_f, "", "Z_Death").c();
              wl.field_c[10][2] = wg.a(lk.field_f, "", "D_Death").c();
              wl.field_c[11][0] = wg.a(lk.field_f, "", "H_Hit_1").c();
              wl.field_c[11][1] = wg.a(lk.field_f, "", "Z_Hit_1").c();
              wl.field_c[11][2] = wg.a(lk.field_f, "", "D_Hit_1").c();
              wl.field_c[12][0] = wg.a(lk.field_f, "", "H_Hit_2").c();
              wl.field_c[12][1] = wg.a(lk.field_f, "", "Z_Hit_2").c();
              wl.field_c[12][2] = wg.a(lk.field_f, "", "D_Hit_2").c();
              wl.field_c[13][0] = wg.a(lk.field_f, "", "H_Hit_3").c();
              wl.field_c[13][1] = wg.a(lk.field_f, "", "Z_Hit_3").c();
              wl.field_c[13][2] = wg.a(lk.field_f, "", "D_Hit_3").c();
              bf.field_c[0][6] = wg.a(lk.field_f, "", "Boss_1_Attack_combo").c();
              bf.field_c[0][7] = wg.a(lk.field_f, "", "Boss_1_Death").c();
              bf.field_c[0][8] = wg.a(lk.field_f, "", "Boss_1_Hit").c();
              bf.field_c[1][6] = wg.a(lk.field_f, "", "Boss_2_Attack_combo").c();
              bf.field_c[1][7] = wg.a(lk.field_f, "", "Boss_2_Death").c();
              bf.field_c[1][8] = wg.a(lk.field_f, "", "Boss_2_Hit").c();
              bf.field_c[2][6] = wg.a(lk.field_f, "", "Boss_3_Attack_combo").c();
              bf.field_c[2][7] = wg.a(lk.field_f, "", "Boss_3_Death").c();
              bf.field_c[2][8] = wg.a(lk.field_f, "", "Boss_3_Hit").c();
              lk.field_f = null;
              id.a(102);
              return false;
            } else {
              if (null != fh.field_f) {
                mh.a(wc.field_a, (byte) -125, 75.0f);
                ((TorChallenge) this).f(7808);
                al.field_x[0] = ej.a(fh.field_f, "", "TOR_Lvl_1");
                al.field_x[1] = ej.a(fh.field_f, "", "TOR_Lvl_2");
                al.field_x[2] = ej.a(fh.field_f, "", "TOR_Lvl_3");
                al.field_x[3] = ej.a(fh.field_f, "", "TOR_Lvl_4");
                al.field_x[4] = ej.a(fh.field_f, "", "TOR_Lvl_5");
                al.field_x[5] = ej.a(fh.field_f, "", "TOR_Lvl_6");
                al.field_x[6] = ej.a(fh.field_f, "", "TOR_Boss_Fight");
                al.field_x[7] = ej.a(fh.field_f, "", "TOR_Title");
                al.field_x[8] = ej.a(fh.field_f, "", "TOR_Menu");
                al.field_x[9] = ej.a(fh.field_f, "", "TOR_lvl_start_jingle");
                al.field_x[10] = ej.a(fh.field_f, "", "TOR_lvl_complete_jingle");
                al.field_x[11] = ej.a(fh.field_f, "", "TOR_boss_complete_jingle");
                al.field_x[12] = ej.a(fh.field_f, "", "TOR_game_over_jingle");
                al.field_x[13] = ej.a(fh.field_f, "", "TOR_Complete");
                fh.field_f = null;
                id.a(126);
                return false;
              } else {
                if (cl.field_y != null) {
                  var3_int = 0;
                  L0: while (true) {
                    L1: {
                      L2: {
                        if (14 <= var3_int) {
                          break L2;
                        } else {
                          stackOut_58_0 = null;
                          stackIn_66_0 = stackOut_58_0;
                          stackIn_59_0 = stackOut_58_0;
                          if (var4 != 0) {
                            break L1;
                          } else {
                            L3: {
                              if (stackIn_59_0 == (Object) (Object) al.field_x[var3_int]) {
                                break L3;
                              } else {
                                if (la.field_a.a(false, ub.field_d, al.field_x[var3_int], cl.field_y, 176400)) {
                                  break L3;
                                } else {
                                  return false;
                                }
                              }
                            }
                            var3_int++;
                            if (var4 == 0) {
                              continue L0;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                      la.field_a.b(true);
                      cl.field_y = null;
                      stackOut_65_0 = null;
                      stackIn_66_0 = stackOut_65_0;
                      break L1;
                    }
                    ub.field_d = (u) (Object) stackIn_66_0;
                    id.a(47);
                    return false;
                  }
                } else {
                  if (aj.field_f != null) {
                    je.field_b = qk.a("basic", "unachieved", aj.field_f, 0);
                    bc.field_f = qk.a("basic", "orbcoin", aj.field_f, 0);
                    hb.field_c = qk.a("basic", "locked", aj.field_f, 0);
                    fd.a((byte) -44, je.field_b);
                    fd.a((byte) -44, bc.field_f);
                    fd.a((byte) -44, hb.field_c);
                    ul.a(aj.field_f, -1656370552, ad.field_g);
                    aj.field_f = null;
                    id.a(51);
                    return false;
                  } else {
                    if (ic.field_C == null) {
                      L4: {
                        if (!param0) {
                          break L4;
                        } else {
                          int discarded$11 = -98;
                          boolean discarded$12 = m.b();
                          var3_int = 0;
                          L5: while (true) {
                            L6: {
                              L7: {
                                if (16 <= var3_int) {
                                  break L7;
                                } else {
                                  ug.field_i[var3_int] = new pd(var3_int, (TorChallenge) this);
                                  var3_int++;
                                  if (var4 != 0) {
                                    break L6;
                                  } else {
                                    if (var4 == 0) {
                                      continue L5;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              bb.field_h = 12;
                              bc.field_o = 12;
                              ug.field_i[12].a(3, true);
                              int discarded$13 = 1;
                              int discarded$14 = 50;
                              al.b();
                              int discarded$15 = 50;
                              int discarded$16 = 102;
                              u.a();
                              o.a(-126, 50);
                              break L6;
                            }
                            if (!d.p(-83)) {
                              qa.field_g = be.a(4, 31315);
                              vh.field_d = new tc[3];
                              vh.field_d[0] = v.b(1, 256, 5, 0);
                              vh.field_d[1] = v.b(1, 256, 5, 1);
                              vh.field_d[2] = v.b(1, 256, 5, 2);
                              int discarded$17 = -6262;
                              int discarded$18 = 6;
                              eb.field_l = kk.b();
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      L8: {
                        if (param1 > 34) {
                          break L8;
                        } else {
                          TorChallenge.q(-52);
                          break L8;
                        }
                      }
                      id.a(60);
                      return true;
                    } else {
                      mh.a(vb.field_e, (byte) -125, 90.0f);
                      ((TorChallenge) this).f(7808);
                      int discarded$19 = 1;
                      this.t();
                      ic.field_C = null;
                      bh.field_q = null;
                      id.a(67);
                      return false;
                    }
                  }
                }
              }
            }
          } else {
            je.field_c = new byte[cg.field_c.length][];
            var3_int = 0;
            L9: while (true) {
              L10: {
                L11: {
                  if (~var3_int <= ~je.field_c.length) {
                    break L11;
                  } else {
                    je.field_c[var3_int] = qh.field_M.a(-2, cg.field_c[var3_int], "");
                    var3_int++;
                    if (var4 != 0) {
                      break L10;
                    } else {
                      if (var4 == 0) {
                        continue L9;
                      } else {
                        break L11;
                      }
                    }
                  }
                }
                qh.field_M = null;
                id.a(108);
                break L10;
              }
              return false;
            }
          }
        } else {
          L12: {
            if (!aj.field_f.b(-7957)) {
              break L12;
            } else {
              if (!aj.field_f.b(5, "basic")) {
                break L12;
              } else {
                L13: {
                  if (!pk.field_d.b(-7957)) {
                    break L13;
                  } else {
                    if (!pk.field_d.b((byte) 79)) {
                      break L13;
                    } else {
                      L14: {
                        if (!lk.field_f.b(-7957)) {
                          break L14;
                        } else {
                          if (!lk.field_f.b((byte) 79)) {
                            break L14;
                          } else {
                            L15: {
                              if (!cl.field_y.b(-7957)) {
                                break L15;
                              } else {
                                if (cl.field_y.b((byte) 79)) {
                                  L16: {
                                    if (!fh.field_f.b(-7957)) {
                                      break L16;
                                    } else {
                                      if (fh.field_f.b((byte) 79)) {
                                        L17: {
                                          if (!ic.field_C.b(-7957)) {
                                            break L17;
                                          } else {
                                            if (ic.field_C.b((byte) 79)) {
                                              L18: {
                                                if (!bh.field_q.b(-7957)) {
                                                  break L18;
                                                } else {
                                                  if (bh.field_q.b((byte) 79)) {
                                                    L19: {
                                                      if (!qh.field_M.b(-7957)) {
                                                        break L19;
                                                      } else {
                                                        if (qh.field_M.b((byte) 79)) {
                                                          mh.a(pk.field_a, (byte) -125, 65.0f);
                                                          if (param0) {
                                                            bi.a(124);
                                                            ((TorChallenge) this).f(7808);
                                                            ub.field_d = new u(pk.field_d, lk.field_f);
                                                            cg.field_a[0] = q.a(pk.field_d, "", "Btn_Chime").b();
                                                            cg.field_a[1] = q.a(pk.field_d, "", "menu_change_character").b();
                                                            cg.field_a[2] = q.a(pk.field_d, "", "Slider").b();
                                                            wl.field_c[0][0] = q.a(pk.field_d, "", "H_Jump").b();
                                                            wl.field_c[0][1] = q.a(pk.field_d, "", "Z_Jump").b();
                                                            wl.field_c[0][2] = q.a(pk.field_d, "", "D_Jump").b();
                                                            wl.field_c[1][0] = q.a(pk.field_d, "", "H_Land").b();
                                                            wl.field_c[1][1] = q.a(pk.field_d, "", "Z_Land").b();
                                                            wl.field_c[1][2] = q.a(pk.field_d, "", "D_Land").b();
                                                            wl.field_c[2][0] = q.a(pk.field_d, "", "H_Slide").b();
                                                            wl.field_c[2][1] = q.a(pk.field_d, "", "Z_Slide").b();
                                                            wl.field_c[2][2] = q.a(pk.field_d, "", "D_Slide").b();
                                                            wl.field_c[3][0] = q.a(pk.field_d, "", "H_Step1").b();
                                                            wl.field_c[3][1] = q.a(pk.field_d, "", "Z_Step1").b();
                                                            wl.field_c[3][2] = q.a(pk.field_d, "", "D_Step1").b();
                                                            wl.field_c[4][0] = q.a(pk.field_d, "", "H_Step2").b();
                                                            wl.field_c[4][1] = q.a(pk.field_d, "", "Z_Step2").b();
                                                            wl.field_c[4][2] = q.a(pk.field_d, "", "D_Step2").b();
                                                            wl.field_c[5][0] = q.a(pk.field_d, "", "H_Weapon_Death_Impact").b();
                                                            wl.field_c[5][1] = q.a(pk.field_d, "", "Z_Weapon_Death_Impact").b();
                                                            wl.field_c[5][2] = q.a(pk.field_d, "", "D_Weapon_Death_Impact").b();
                                                            ia.field_i[0][dg.field_T[1]][0] = q.a(pk.field_d, "", "Run_1_Death").b();
                                                            ia.field_i[0][dg.field_T[1]][1] = q.a(pk.field_d, "", "Run_2_Death").b();
                                                            ia.field_i[0][dg.field_T[1]][2] = q.a(pk.field_d, "", "Run_3_Death").b();
                                                            ia.field_i[2][dg.field_T[1]][0] = q.a(pk.field_d, "", "Run_1_Step").b();
                                                            ia.field_i[2][dg.field_T[1]][1] = q.a(pk.field_d, "", "Run_2_Step").b();
                                                            ia.field_i[2][dg.field_T[1]][2] = q.a(pk.field_d, "", "Run_3_Step").b();
                                                            ia.field_i[3][dg.field_T[1]][1] = q.a(pk.field_d, "", "Run_Jump").b();
                                                            ia.field_i[3][dg.field_T[1]][2] = ia.field_i[3][dg.field_T[1]][1];
                                                            ia.field_i[4][dg.field_T[1]][1] = q.a(pk.field_d, "", "Run_land").b();
                                                            ia.field_i[4][dg.field_T[1]][2] = ia.field_i[4][dg.field_T[1]][2];
                                                            ia.field_i[0][dg.field_T[2]][0] = q.a(pk.field_d, "", "Spitter_1_Death").b();
                                                            ia.field_i[0][dg.field_T[2]][1] = q.a(pk.field_d, "", "Spitter_2_Death").b();
                                                            ia.field_i[0][dg.field_T[2]][2] = q.a(pk.field_d, "", "Spitter_3_Death").b();
                                                            ia.field_i[2][dg.field_T[2]][0] = q.a(pk.field_d, "", "Spitter_1_Step").b();
                                                            ia.field_i[2][dg.field_T[2]][1] = q.a(pk.field_d, "", "Spitter_2_Step").b();
                                                            ia.field_i[2][dg.field_T[2]][2] = q.a(pk.field_d, "", "Spitter_3_Step").b();
                                                            ia.field_i[4][dg.field_T[2]][0] = q.a(pk.field_d, "", "Spitter_Land").b();
                                                            ia.field_i[4][dg.field_T[2]][1] = ia.field_i[4][dg.field_T[2]][0];
                                                            ia.field_i[4][dg.field_T[2]][2] = ia.field_i[4][dg.field_T[2]][0];
                                                            ia.field_i[6][dg.field_T[2]][0] = q.a(pk.field_d, "", "Spitter_1_Spit").b();
                                                            ia.field_i[6][dg.field_T[2]][1] = q.a(pk.field_d, "", "Spitter_2_Spit").b();
                                                            ia.field_i[6][dg.field_T[2]][2] = q.a(pk.field_d, "", "Spitter_3_Spit").b();
                                                            ia.field_i[4][dg.field_T[7]][0] = q.a(pk.field_d, "", "Spitter_1_Spit_Impact").b();
                                                            ia.field_i[4][dg.field_T[7]][1] = q.a(pk.field_d, "", "Spitter_2_Spit_Impact").b();
                                                            ia.field_i[4][dg.field_T[7]][2] = q.a(pk.field_d, "", "Spitter_3_Spit_Impact").b();
                                                            ia.field_i[0][dg.field_T[3]][0] = q.a(pk.field_d, "", "Thud_1_Death").b();
                                                            ia.field_i[0][dg.field_T[3]][1] = q.a(pk.field_d, "", "Thud_2_Death").b();
                                                            ia.field_i[0][dg.field_T[3]][2] = q.a(pk.field_d, "", "Thud_3_Death").b();
                                                            ia.field_i[7][dg.field_T[3]][2] = q.a(pk.field_d, "", "Thud_3_Charge_Step").b();
                                                            ia.field_i[4][dg.field_T[3]][0] = q.a(pk.field_d, "", "Thud_Land").b();
                                                            ia.field_i[4][dg.field_T[3]][1] = ia.field_i[4][dg.field_T[3]][0];
                                                            ia.field_i[4][dg.field_T[3]][2] = ia.field_i[4][dg.field_T[3]][0];
                                                            ia.field_i[6][dg.field_T[3]][1] = q.a(pk.field_d, "", "Thud_Rock_Throw").b();
                                                            ia.field_i[6][dg.field_T[3]][2] = ia.field_i[4][dg.field_T[3]][1];
                                                            ia.field_i[2][dg.field_T[3]][0] = q.a(pk.field_d, "", "Thud_Step").b();
                                                            ia.field_i[2][dg.field_T[3]][1] = ia.field_i[2][dg.field_T[3]][0];
                                                            ia.field_i[2][dg.field_T[3]][2] = ia.field_i[2][dg.field_T[3]][0];
                                                            ia.field_i[4][dg.field_T[22]][1] = q.a(pk.field_d, "", "Thud_Rock_Impact").b();
                                                            ia.field_i[4][dg.field_T[22]][2] = ia.field_i[4][dg.field_T[22]][1];
                                                            ia.field_i[0][dg.field_T[4]][0] = q.a(pk.field_d, "", "Rocket_1_Death").b();
                                                            ia.field_i[0][dg.field_T[4]][1] = q.a(pk.field_d, "", "Rocket_2_Death").b();
                                                            ia.field_i[0][dg.field_T[4]][2] = q.a(pk.field_d, "", "Rocket_3_Death").b();
                                                            ia.field_i[1][dg.field_T[4]][0] = q.a(pk.field_d, "", "Rocket_Roar_Loop").b();
                                                            ia.field_i[1][dg.field_T[4]][1] = ia.field_i[1][dg.field_T[4]][0];
                                                            ia.field_i[1][dg.field_T[4]][2] = ia.field_i[1][dg.field_T[4]][1];
                                                            ia.field_i[0][dg.field_T[5]][0] = q.a(pk.field_d, "", "Slime_1_Death").b();
                                                            ia.field_i[0][dg.field_T[5]][1] = q.a(pk.field_d, "", "Slime_2_Death").b();
                                                            ia.field_i[0][dg.field_T[5]][2] = q.a(pk.field_d, "", "Slime_3_Death").b();
                                                            ia.field_i[2][dg.field_T[5]][1] = q.a(pk.field_d, "", "Slime_2_Move").b();
                                                            ia.field_i[2][dg.field_T[5]][2] = q.a(pk.field_d, "", "Slime_3_Move").b();
                                                            ia.field_i[5][dg.field_T[5]][0] = q.a(pk.field_d, "", "Slime_Fall").b();
                                                            ia.field_i[5][dg.field_T[5]][1] = ia.field_i[5][dg.field_T[5]][0];
                                                            ia.field_i[5][dg.field_T[5]][2] = ia.field_i[5][dg.field_T[5]][0];
                                                            ia.field_i[4][dg.field_T[5]][0] = q.a(pk.field_d, "", "Slime_Impact").b();
                                                            ia.field_i[4][dg.field_T[5]][1] = ia.field_i[4][dg.field_T[5]][0];
                                                            ia.field_i[4][dg.field_T[5]][2] = ia.field_i[4][dg.field_T[5]][0];
                                                            ia.field_i[0][dg.field_T[6]][0] = q.a(pk.field_d, "", "Grinder_2_Death").b();
                                                            ia.field_i[4][dg.field_T[6]][1] = q.a(pk.field_d, "", "Grinder_2_Wall_Impact").b();
                                                            ia.field_i[4][dg.field_T[6]][2] = q.a(pk.field_d, "", "Grinder_3_Wall_Impact").b();
                                                            bf.field_c[0][0] = q.a(pk.field_d, "", "Boss_1_Jump").b();
                                                            bf.field_c[0][1] = q.a(pk.field_d, "", "Boss_1_Land").b();
                                                            bf.field_c[0][2] = q.a(pk.field_d, "", "Boss_1_Miss_Combo").b();
                                                            bf.field_c[0][3] = q.a(pk.field_d, "", "Boss_1_Step").b();
                                                            bf.field_c[0][4] = q.a(pk.field_d, "", "Boss_1_Step2").b();
                                                            bf.field_c[0][5] = q.a(pk.field_d, "", "Boss_1_Weapon_Impact").b();
                                                            bf.field_c[1][0] = q.a(pk.field_d, "", "Boss_2_Jump").b();
                                                            bf.field_c[1][1] = q.a(pk.field_d, "", "Boss_2_Land").b();
                                                            bf.field_c[1][2] = q.a(pk.field_d, "", "Boss_2_Miss_Combo").b();
                                                            bf.field_c[1][3] = q.a(pk.field_d, "", "Boss_2_Step").b();
                                                            bf.field_c[1][5] = q.a(pk.field_d, "", "Boss_2_Weapon_Impact").b();
                                                            bf.field_c[2][0] = q.a(pk.field_d, "", "Boss_3_Jump").b();
                                                            bf.field_c[2][1] = q.a(pk.field_d, "", "Boss_3_Land").b();
                                                            bf.field_c[2][2] = q.a(pk.field_d, "", "Boss_3_Miss_Combo").b();
                                                            bf.field_c[2][3] = q.a(pk.field_d, "", "Boss_3_Step").b();
                                                            bf.field_c[2][4] = q.a(pk.field_d, "", "Boss_3_Step2").b();
                                                            bf.field_c[2][5] = q.a(pk.field_d, "", "Boss_3_Weapon_Impact").b();
                                                            cj.field_h[0] = q.a(pk.field_d, "", "collect1").b();
                                                            cj.field_h[1] = q.a(pk.field_d, "", "collect2").b();
                                                            cj.field_h[2] = q.a(pk.field_d, "", "Exit_Door").b();
                                                            cj.field_h[3] = q.a(pk.field_d, "", "Extra_HP").b();
                                                            cj.field_h[4] = q.a(pk.field_d, "", "Extra_Life").b();
                                                            cj.field_h[5] = q.a(pk.field_d, "", "Health_Drink").b();
                                                            cj.field_h[6] = q.a(pk.field_d, "", "Help_Bubble").b();
                                                            cj.field_h[7] = q.a(pk.field_d, "", "seal_active").b();
                                                            cj.field_h[8] = q.a(pk.field_d, "", "seal_achieved").b();
                                                            cj.field_h[9] = q.a(pk.field_d, "", "Timer").b();
                                                            cj.field_h[10] = q.a(pk.field_d, "", "Timer_Ending").b();
                                                            cj.field_h[11] = cj.field_h[7];
                                                            cj.field_h[12] = q.a(pk.field_d, "", "Exit_Door_active").b();
                                                            pk.field_d = null;
                                                            id.a(62);
                                                            return false;
                                                          } else {
                                                            return false;
                                                          }
                                                        } else {
                                                          break L19;
                                                        }
                                                      }
                                                    }
                                                    mh.a(pk.a(256, "Loading Levels", "", qh.field_M, "Waiting for Levels"), (byte) -125, 60.0f);
                                                    return false;
                                                  } else {
                                                    break L18;
                                                  }
                                                }
                                              }
                                              mh.a(pk.a(256, ij.field_x, "", bh.field_q, wf.field_a), (byte) -125, 60.0f);
                                              return false;
                                            } else {
                                              break L17;
                                            }
                                          }
                                        }
                                        mh.a(pk.a(256, ra.field_m, "", ic.field_C, uk.field_K), (byte) -125, 50.0f);
                                        return false;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                  mh.a(pk.a(256, ui.field_e, "", fh.field_f, qh.field_L), (byte) -125, 40.0f);
                                  return false;
                                } else {
                                  break L15;
                                }
                              }
                            }
                            mh.a(fc.a(qh.field_L, cl.field_y, 0, 89, ui.field_e), (byte) -125, 30.0f);
                            return false;
                          }
                        }
                      }
                      mh.a(pk.a(256, ie.field_c, "", lk.field_f, cb.field_a), (byte) -125, 20.0f);
                      return false;
                    }
                  }
                }
                mh.a(pk.a(256, ie.field_c, "", pk.field_d, cb.field_a), (byte) -125, 10.0f);
                return false;
              }
            }
          }
          mh.a(pk.a(256, ra.field_m, "basic", aj.field_f, uk.field_K), (byte) -125, 3.0f);
          return false;
        }
    }

    private final void u() {
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (rb.field_b == 0) {
                  break L2;
                } else {
                  L3: {
                    if (rb.field_b == 1) {
                      break L3;
                    } else {
                      L4: {
                        if (rb.field_b == 2) {
                          break L4;
                        } else {
                          L5: {
                            if (hk.field_e <= 0) {
                              break L5;
                            } else {
                              hk.field_e = hk.field_e - 1;
                              break L5;
                            }
                          }
                          L6: {
                            if (0 <= hk.field_e) {
                              break L6;
                            } else {
                              hk.field_e = 0;
                              break L6;
                            }
                          }
                          if (hk.field_e != 0) {
                            break L1;
                          } else {
                            rb.field_b = 0;
                            if (var3 == 0) {
                              break L1;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      L7: {
                        L8: {
                          if (!d.p(-115)) {
                            break L8;
                          } else {
                            bc.field_o = m.field_h;
                            if (var3 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        L9: {
                          qa.field_g = be.a(4, 31315);
                          vh.field_d = new tc[4];
                          vh.field_d[0] = v.b(1, TorChallenge.a(0, 256), 5, 0);
                          vh.field_d[1] = v.b(1, 256, 5, 1);
                          vh.field_d[2] = v.b(1, 256, 5, 2);
                          int discarded$6 = -6262;
                          int discarded$7 = 6;
                          eb.field_l = kk.b();
                          if (null != ji.field_m) {
                            gl.field_a = true;
                            oi.a(true, true, false);
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          if (ji.field_m != null) {
                            ji.field_m.c((byte) -66);
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        bc.field_o = lj.field_e;
                        if (bc.field_o == -2) {
                          bc.field_o = 0;
                          il.a(false, 0);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      rb.field_b = 3;
                      hk.field_e = 31;
                      bb.field_h = bc.field_o;
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  hk.field_e = hk.field_e + 1;
                  if (32 == hk.field_e) {
                    L11: {
                      L12: {
                        int discarded$8 = 0;
                        if (!vc.a()) {
                          break L12;
                        } else {
                          int discarded$9 = -88;
                          vl.a();
                          if (var3 == 0) {
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      int discarded$10 = -83;
                      dj.f();
                      break L11;
                    }
                    rb.field_b = 2;
                    if (var3 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              L13: {
                if (bc.field_o == bb.field_h) {
                  break L13;
                } else {
                  L14: {
                    hk.field_e = hk.field_e + 1;
                    if (16 > hk.field_e) {
                      break L14;
                    } else {
                      if (bc.field_o != 3) {
                        break L14;
                      } else {
                        if (bb.field_h == 1) {
                          if (oi.field_g) {
                            L15: {
                              L16: {
                                if (dj.field_Q < 0) {
                                  break L16;
                                } else {
                                  if (~n.field_jb == ~dj.field_Q) {
                                    break L16;
                                  } else {
                                    n.field_jb = dj.field_Q;
                                    if (var3 == 0) {
                                      break L15;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                              }
                              n.field_jb = 0;
                              break L15;
                            }
                            L17: {
                              L18: {
                                oi.field_g = false;
                                if (kj.field_A < 0) {
                                  break L18;
                                } else {
                                  if (i.field_r != kj.field_A) {
                                    break L17;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                              i.field_r = 0;
                              if (var3 == 0) {
                                break L14;
                              } else {
                                break L17;
                              }
                            }
                            i.field_r = kj.field_A;
                            break L14;
                          } else {
                            break L14;
                          }
                        } else {
                          break L14;
                        }
                      }
                    }
                  }
                  if (32 == hk.field_e) {
                    L19: {
                      if (bc.field_o != 2) {
                        break L19;
                      } else {
                        rc.field_r = null;
                        break L19;
                      }
                    }
                    L20: {
                      if (bc.field_o != 1) {
                        break L20;
                      } else {
                        int discarded$11 = 0;
                        vd.b();
                        break L20;
                      }
                    }
                    bc.field_o = bb.field_h;
                    cf.field_b = bc.field_o;
                    hk.field_e = 0;
                    if (bc.field_o != 0) {
                      break L1;
                    } else {
                      if (cj.field_e) {
                        h.a(6, 4);
                        cj.field_e = false;
                        if (var3 == 0) {
                          break L1;
                        } else {
                          break L13;
                        }
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
              L21: {
                if (bc.field_o == -1) {
                  break L21;
                } else {
                  L22: {
                    L23: {
                      if (8 == bc.field_o) {
                        break L23;
                      } else {
                        if (bc.field_o != 9) {
                          break L22;
                        } else {
                          break L23;
                        }
                      }
                    }
                    ug.field_i[8].f(9504);
                    ug.field_i[9].f(9504);
                    if (var3 == 0) {
                      break L1;
                    } else {
                      break L22;
                    }
                  }
                  L24: {
                    L25: {
                      if (bc.field_o == 10) {
                        break L25;
                      } else {
                        if (11 != bc.field_o) {
                          break L24;
                        } else {
                          break L25;
                        }
                      }
                    }
                    ug.field_i[10].f(9504);
                    ug.field_i[11].f(9504);
                    if (var3 == 0) {
                      break L1;
                    } else {
                      break L24;
                    }
                  }
                  L26: {
                    if (3 == bc.field_o) {
                      break L26;
                    } else {
                      ug.field_i[bc.field_o].f(9504);
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L26;
                      }
                    }
                  }
                  ug.field_i[3].f(9504);
                  ug.field_i[14].f(9504);
                  if (var3 == 0) {
                    break L1;
                  } else {
                    break L21;
                  }
                }
              }
              ji.field_m.a(21);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var2, "TorChallenge.O(" + 0 + 41);
        }
    }

    final void b(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              int discarded$6 = 4;
              ae.a();
              if (gi.field_d != null) {
                ij.c((byte) -94);
                break L1;
              } else {
                break L1;
              }
            }
            var2_int = -126 / ((11 - param0) / 36);
            int discarded$7 = -94;
            rl.c();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var2, "TorChallenge.J(" + param0 + 41);
        }
    }

    private final void b() {
        RuntimeException var2 = null;
        int var2_int = 0;
        int[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_39_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_38_0 = 0;
        var9 = field_F ? 1 : 0;
        try {
          L0: {
            var2_int = g.a(124, 0) ? 1 : 0;
            this.d(83, var2_int != 0);
            re.field_x[dg.field_T[2]] = lk.a(-128, "spitter", "", ic.field_C);
            qb.a((byte) 69, re.field_x[dg.field_T[2]]);
            re.field_x[dg.field_T[7]] = lk.a(-127, "spittle", "", ic.field_C);
            qb.a((byte) 85, re.field_x[dg.field_T[7]]);
            re.field_x[dg.field_T[3]] = lk.a(-127, "thudder", "", ic.field_C);
            qb.a((byte) 46, re.field_x[dg.field_T[3]]);
            re.field_x[dg.field_T[4]] = lk.a(-127, "rocketeer", "", ic.field_C);
            qb.a((byte) 114, re.field_x[dg.field_T[4]]);
            re.field_x[dg.field_T[5]] = lk.a(-127, "slimer", "", ic.field_C);
            qb.a((byte) 65, re.field_x[dg.field_T[5]]);
            re.field_x[dg.field_T[6]] = lk.a(-127, "grinder", "", ic.field_C);
            qb.a((byte) 21, re.field_x[dg.field_T[6]]);
            re.field_x[dg.field_T[22]] = lk.a(-128, "rock", "", ic.field_C);
            qb.a((byte) 56, re.field_x[dg.field_T[22]]);
            var3 = new int[8];
            var4 = new int[8];
            var5 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var5 >= 8) {
                    break L3;
                  } else {
                    var3[var5] = re.field_x[var5].length / 8;
                    var4[var5] = var3[var5] / 3;
                    var5++;
                    if (var9 != 0) {
                      break L2;
                    } else {
                      if (var9 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var5 = 0;
                break L2;
              }
              L4: while (true) {
                stackOut_11_0 = 8;
                stackIn_12_0 = stackOut_11_0;
                L5: while (true) {
                  L6: {
                    L7: {
                      if (stackIn_12_0 <= var5) {
                        break L7;
                      } else {
                        stackOut_13_0 = 1;
                        stackIn_32_0 = stackOut_13_0;
                        stackIn_14_0 = stackOut_13_0;
                        if (var9 != 0) {
                          break L6;
                        } else {
                          var6 = stackIn_14_0;
                          L8: while (true) {
                            stackOut_15_0 = ~var6;
                            stackIn_16_0 = stackOut_15_0;
                            L9: while (true) {
                              L10: {
                                if (stackIn_16_0 <= -9) {
                                  break L10;
                                } else {
                                  stackOut_17_0 = 0;
                                  stackIn_12_0 = stackOut_17_0;
                                  stackIn_18_0 = stackOut_17_0;
                                  if (var9 != 0) {
                                    continue L5;
                                  } else {
                                    var7 = stackIn_18_0;
                                    L11: while (true) {
                                      L12: {
                                        if (var7 >= 3) {
                                          break L12;
                                        } else {
                                          ah.field_d[var5][var6][var7] = new ka[h.field_b[var6][var5][var7]];
                                          stackOut_20_0 = 0;
                                          stackIn_16_0 = stackOut_20_0;
                                          stackIn_21_0 = stackOut_20_0;
                                          if (var9 != 0) {
                                            continue L9;
                                          } else {
                                            var8 = stackIn_21_0;
                                            L13: while (true) {
                                              L14: {
                                                L15: {
                                                  if (~h.field_b[var6][var5][var7] >= ~var8) {
                                                    break L15;
                                                  } else {
                                                    ah.field_d[var5][var6][var7][var8] = re.field_x[var5][var8 + var7 * var4[var5] + var6 * var3[var5]];
                                                    var8++;
                                                    if (var9 != 0) {
                                                      break L14;
                                                    } else {
                                                      if (var9 == 0) {
                                                        continue L13;
                                                      } else {
                                                        break L15;
                                                      }
                                                    }
                                                  }
                                                }
                                                var7++;
                                                break L14;
                                              }
                                              if (var9 == 0) {
                                                continue L11;
                                              } else {
                                                break L12;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var6++;
                                      if (var9 == 0) {
                                        continue L8;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                }
                              }
                              var5++;
                              if (var9 == 0) {
                                continue L4;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_31_0 = 0;
                    stackIn_32_0 = stackOut_31_0;
                    break L6;
                  }
                  var5 = stackIn_32_0;
                  L16: while (true) {
                    stackOut_33_0 = var5;
                    stackIn_34_0 = stackOut_33_0;
                    L17: while (true) {
                      L18: {
                        L19: {
                          if (stackIn_34_0 >= 8) {
                            break L19;
                          } else {
                            if (var9 != 0) {
                              break L18;
                            } else {
                              var6 = 0;
                              L20: while (true) {
                                L21: {
                                  if (var6 >= 3) {
                                    break L21;
                                  } else {
                                    ah.field_d[var5][0][var6] = new ka[h.field_b[0][var5][var6]];
                                    stackOut_38_0 = 0;
                                    stackIn_34_0 = stackOut_38_0;
                                    stackIn_39_0 = stackOut_38_0;
                                    if (var9 != 0) {
                                      continue L17;
                                    } else {
                                      var7 = stackIn_39_0;
                                      L22: while (true) {
                                        L23: {
                                          L24: {
                                            if (var7 >= h.field_b[0][var5][var6]) {
                                              break L24;
                                            } else {
                                              ah.field_d[var5][0][var6][var7] = ah.field_d[var5][1][var6][var7];
                                              var7++;
                                              if (var9 != 0) {
                                                break L23;
                                              } else {
                                                if (var9 == 0) {
                                                  continue L22;
                                                } else {
                                                  break L24;
                                                }
                                              }
                                            }
                                          }
                                          var6++;
                                          break L23;
                                        }
                                        if (var9 == 0) {
                                          continue L20;
                                        } else {
                                          break L21;
                                        }
                                      }
                                    }
                                  }
                                }
                                var5++;
                                if (var9 == 0) {
                                  continue L16;
                                } else {
                                  break L19;
                                }
                              }
                            }
                          }
                        }
                        break L18;
                      }
                      break L0;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var2, "TorChallenge.M(" + 1 + 41);
        }
    }

    final static boolean r(int param0) {
        RuntimeException var1 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            L1: {
              if (param0 == -1592) {
                break L1;
              } else {
                field_H = null;
                break L1;
              }
            }
            stackOut_3_0 = eb.field_m;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var1, "TorChallenge.I(" + param0 + 41);
        }
        return stackIn_4_0;
    }

    final void b(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              TorChallenge.q(1);
              int discarded$162 = 25840;
              sl.e();
              lj.a(11446);
              ki.a(64);
              int discarded$163 = -106;
              ea.a();
              int discarded$164 = -55;
              sd.a();
              int discarded$165 = -93;
              ac.b();
              int discarded$166 = 0;
              id.a();
              int discarded$167 = 123;
              gb.a();
              int discarded$168 = -100;
              kf.a();
              int discarded$169 = 127;
              d.h();
              jd.a(640);
              ug.a((byte) -57);
              int discarded$170 = 25910;
              we.a();
              int discarded$171 = -36;
              mj.a();
              int discarded$172 = -79;
              vf.a();
              int discarded$173 = -117;
              og.a();
              if (param0 >= 103) {
                break L1;
              } else {
                int discarded$174 = TorChallenge.a((String) null, true, -106, 32, (String) null, (String) null, -51);
                break L1;
              }
            }
            qg.c();
            eg.a();
            int discarded$175 = 26;
            qc.a();
            int discarded$176 = 250;
            nk.a();
            int discarded$177 = 128;
            uf.d();
            int discarded$178 = -99;
            ol.a();
            int discarded$179 = -116;
            mb.a();
            int discarded$180 = 1;
            ik.a();
            int discarded$181 = 0;
            c.b();
            int discarded$182 = -52;
            ub.a();
            int discarded$183 = 0;
            hk.b();
            int discarded$184 = 23801;
            wj.a();
            int discarded$185 = -74;
            pl.a();
            int discarded$186 = -14471;
            bf.a();
            int discarded$187 = 0;
            wh.a();
            int discarded$188 = -126;
            ve.a();
            int discarded$189 = 10;
            gi.a();
            jl.b(118);
            oe.b(-15721);
            int discarded$190 = 96;
            r.a();
            int discarded$191 = 0;
            ad.a();
            cd.b((byte) 79);
            u.a(-26193);
            pd.k(1);
            int discarded$192 = 10;
            wl.b();
            lk.a(-89);
            qb.a(2316);
            int discarded$193 = -38;
            vd.a();
            vb.d(0);
            int discarded$194 = -98;
            rb.b();
            int discarded$195 = 122;
            oa.b();
            rk.b(true);
            int discarded$196 = 1;
            wb.a();
            da.a((byte) -92);
            kb.c(128);
            int discarded$197 = 0;
            dl.b();
            pc.b();
            pg.c(16);
            kh.a();
            fj.b(false);
            int discarded$198 = 106;
            a.b();
            int discarded$199 = -82;
            rl.b();
            int discarded$200 = 1;
            rc.b();
            h.a(38);
            ec.a(-1);
            ck.b(255);
            qe.d(true);
            int discarded$201 = 125;
            ra.a();
            int discarded$202 = 106;
            tf.a();
            int discarded$203 = 102;
            hd.a();
            int discarded$204 = -102;
            kl.a();
            int discarded$205 = 1;
            le.a();
            int discarded$206 = 113;
            mg.a();
            int discarded$207 = 95;
            vj.a();
            int discarded$208 = 69;
            si.d();
            int discarded$209 = 255;
            ta.p();
            pe.m(4210752);
            int discarded$210 = -118;
            jf.n();
            int discarded$211 = 104;
            wa.n();
            int discarded$212 = -110;
            dg.h();
            ih.h(99);
            int discarded$213 = -86;
            fg.f();
            int discarded$214 = 0;
            ib.c();
            int discarded$215 = -1;
            qa.a();
            int discarded$216 = 23592;
            dk.a();
            int discarded$217 = 120;
            tj.a();
            dc.a();
            wg.b();
            l.b();
            int discarded$218 = 104;
            sa.a();
            int discarded$219 = 32097;
            ok.a();
            int discarded$220 = 124;
            jj.a();
            int discarded$221 = 103;
            de.a();
            int discarded$222 = 126;
            hh.a();
            pa.n(6);
            bi.b(0);
            jc.a(-108);
            tg.b(false);
            w.b((byte) 68);
            fi.d();
            vl.a(0);
            int discarded$223 = -14282;
            jh.a();
            ah.a(44);
            am.a(98);
            t.b(68);
            int discarded$224 = -13;
            cg.b();
            int discarded$225 = 0;
            aj.a();
            int discarded$226 = -88;
            fh.a();
            int discarded$227 = 1;
            wi.c();
            int discarded$228 = 8727;
            of.a();
            int discarded$229 = -48;
            wc.a();
            nl.a();
            int discarded$230 = -113;
            ei.a();
            int discarded$231 = 91;
            ed.a();
            int discarded$232 = 6;
            bb.b();
            int discarded$233 = -25984;
            fl.e();
            int discarded$234 = 16711680;
            ii.b();
            db.h(117);
            la.b((byte) -64);
            al.c((byte) 99);
            di.a(false);
            nd.a(0);
            int discarded$235 = 2048;
            ai.a();
            sh.b(true);
            int discarded$236 = -9386;
            cb.b();
            int discarded$237 = -25725;
            nh.l();
            int discarded$238 = -50;
            te.a();
            int discarded$239 = 46;
            bc.a();
            oc.a();
            int discarded$240 = -128;
            nb.b();
            int discarded$241 = 1;
            ti.a();
            int discarded$242 = 606002657;
            vg.c();
            pi.b((byte) -119);
            int discarded$243 = -55;
            mh.a();
            int discarded$244 = 106;
            oj.a();
            ch.a(false);
            int discarded$245 = -7604;
            af.a();
            kg.e(-8796);
            aa.a(2432);
            int discarded$246 = 0;
            pk.a();
            vc.a(false);
            gh.a(-16742);
            int discarded$247 = 3;
            mf.a();
            int discarded$248 = 887316838;
            ob.a();
            int discarded$249 = 0;
            mc.a();
            int discarded$250 = -79;
            ga.b();
            int discarded$251 = 28215;
            g.a();
            ph.a(2);
            lg.a(-27840);
            ee.f(107);
            ng.c(true);
            ic.g(1);
            int discarded$252 = 0;
            v.c();
            int discarded$253 = 0;
            b.a();
            kj.g(-10365);
            int discarded$254 = -40;
            nj.b();
            int discarded$255 = 0;
            pf.a();
            int discarded$256 = -4;
            oh.a();
            lh.g(116);
            int discarded$257 = 0;
            cj.b();
            int discarded$258 = 0;
            sf.a();
            int discarded$259 = -98;
            je.a();
            int discarded$260 = -106;
            hl.a();
            ca.a(32);
            int discarded$261 = -5;
            ba.a();
            int discarded$262 = 33;
            ie.a();
            gl.a(-26425);
            int discarded$263 = -38;
            bj.b();
            int discarded$264 = 126;
            bd.b();
            int discarded$265 = 15752;
            dd.d();
            int discarded$266 = 75;
            ja.a();
            int discarded$267 = 2;
            s.a();
            int discarded$268 = 102;
            ua.a();
            int discarded$269 = -31397;
            ul.d();
            td.c(0);
            fb.a(1012);
            int discarded$270 = 1;
            ab.a();
            int discarded$271 = 0;
            bg.h();
            int discarded$272 = 96;
            rf.i();
            int discarded$273 = 65;
            dj.l();
            n.l(5);
            int discarded$274 = 123;
            ek.c();
            int discarded$275 = 1;
            li.c();
            int discarded$276 = -1;
            df.a();
            int discarded$277 = 87;
            tk.c();
            int discarded$278 = 112;
            dh.g();
            int discarded$279 = -110;
            hc.a();
            int discarded$280 = -116;
            wf.a();
            qh.f((byte) -36);
            int discarded$281 = -15087;
            uc.a();
            int discarded$282 = 0;
            bl.e();
            ce.a();
            int discarded$283 = 3366;
            be.a();
            oi.d(10166);
            fa.b(-3);
            m.a(128);
            int discarded$284 = 50;
            uk.d();
            k.a(true);
            int discarded$285 = 0;
            fd.b();
            int discarded$286 = -103;
            ak.a();
            lb.d(18972);
            int discarded$287 = -114;
            re.e();
            int discarded$288 = 67;
            fc.c();
            int discarded$289 = 75;
            qf.a();
            md.b(-1);
            int discarded$290 = 640;
            ag.b();
            int discarded$291 = 1;
            ae.b();
            int discarded$292 = 65535;
            ji.a();
            int discarded$293 = 68;
            vk.a();
            e.b((byte) -83);
            int discarded$294 = 1;
            o.b();
            cl.c((byte) 110);
            int discarded$295 = -13978;
            me.a();
            int discarded$296 = -88;
            fk.b();
            ij.b(42);
            int discarded$297 = 19199;
            hf.b();
            hi.h(-1);
            int discarded$298 = 0;
            qk.c();
            int discarded$299 = 126;
            ue.c();
            ni.a(true);
            int discarded$300 = 4707;
            ql.a();
            int discarded$301 = -60;
            rd.b();
            int discarded$302 = 127;
            tc.a();
            int discarded$303 = -128;
            bk.b();
            int discarded$304 = 237;
            eb.a();
            int discarded$305 = 121;
            eh.c();
            int discarded$306 = -116;
            ne.a();
            int discarded$307 = -124;
            ef.b();
            int discarded$308 = -44;
            vh.c();
            int discarded$309 = -113;
            cf.a();
            int discarded$310 = -75;
            lc.b();
            sj.a(15638);
            int discarded$311 = 0;
            hb.a();
            na.e(-7345);
            ri.g(12);
            int discarded$312 = 61;
            kk.f();
            int discarded$313 = 256;
            ll.a();
            int discarded$314 = 8192;
            kd.a();
            int discarded$315 = -909082559;
            gj.a();
            int discarded$316 = -81;
            qi.a();
            int discarded$317 = -14298;
            i.g();
            int discarded$318 = 1;
            bh.f();
            int discarded$319 = 8;
            il.g();
            int discarded$320 = 102;
            kc.d();
            int discarded$321 = 68;
            ci.f();
            gf.d((byte) -113);
            p.a(true);
            ia.b((byte) 79);
            int discarded$322 = 10;
            rj.a();
            ui.c((byte) -125);
            int discarded$323 = -57;
            vi.a();
            ((TorChallenge) this).field_w = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var2, "TorChallenge.P(" + param0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = null;
        field_E = 0;
        field_G = 640;
    }
}
