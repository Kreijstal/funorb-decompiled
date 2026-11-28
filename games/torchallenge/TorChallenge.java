/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class TorChallenge extends GameClientBase {
    static IntrusiveDeque field_I;
    static ModalDialogHost field_H;
    static int field_G;
    static int field_E;
    public static boolean field_F;

    public final void init() {
        try {
          this.startWithDefaultSize((byte) 58, 12, "torchallenge");
        } catch (RuntimeException runtimeException) {
          throw oj.wrapException((Throwable) ((Object) runtimeException), "TorChallenge.init()");
        }
    }

    private final void t(int param0) {
        Sprite[] array$0 = null;
        Sprite[] array$1 = null;
        Sprite[] array$2 = null;
        Sprite[] array$3 = null;
        int stackIn_51_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_115_0 = 0;
        int stackIn_119_0 = 0;
        int stackIn_119_1 = 0;
        int stackIn_134_0 = 0;
        int stackIn_136_0 = 0;
        int stackIn_140_0 = 0;
        int stackIn_140_1 = 0;
        int stackIn_182_0 = 0;
        int stackIn_194_0 = 0;
        int stackIn_206_0 = 0;
        int stackIn_208_0 = 0;
        int stackIn_223_0 = 0;
        int stackIn_235_0 = 0;
        RuntimeException decompiledCaughtException = null;
        Sprite[] var2 = null;
        int var2_int = 0;
        RuntimeException var2_ref = null;
        int var3_int = 0;
        Sprite[] var3 = null;
        Sprite var4_ref_ka = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        int[] var6 = null;
        int var7_int = 0;
        Sprite var7 = null;
        Object var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        Sprite var10 = null;
        Sprite var11 = null;
        int var12 = 0;
        var12 = field_F ? 1 : 0;
        try {
          ValidationStatusIcon.a(param0 + 101);
          SecondaryNodeDequeIterator.field_e = FullscreenFocusCanvas.a(SingleChildWidgetContainer.field_C, PasswordValidator.field_q, "", "small_font", false);
          ph.field_o = new Sprite[7];
          ph.field_o[0] = qk.a("", "overlay_title", SingleChildWidgetContainer.field_C, TorChallenge.a(param0, 1));
          ph.field_o[1] = qk.a("", "overlay_pause", SingleChildWidgetContainer.field_C, 0);
          ph.field_o[2] = qk.a("", "overlay_highscores", SingleChildWidgetContainer.field_C, 0);
          ph.field_o[3] = qk.a("", "overlay_instructions", SingleChildWidgetContainer.field_C, param0 - 1);
          ph.field_o[4] = qk.a("", "overlay_achievements", SingleChildWidgetContainer.field_C, 0);
          ph.field_o[5] = qk.a("", "overlay_characters", SingleChildWidgetContainer.field_C, 0);
          ph.field_o[6] = qk.a("", "overlay_levels", SingleChildWidgetContainer.field_C, 0);
          ri.field_j = qk.a("", "overlay_title_tile", SingleChildWidgetContainer.field_C, param0 ^ 1);
          DebouncedFieldValidator.field_i = ResizableModalDialog.a("frame", 26, "", SingleChildWidgetContainer.field_C);
          ValidationStatusWidget.field_cb = new Sprite[2][];
          GzipDecoder.field_a = ResizableModalDialog.a("main_menu_frame", param0 + 123, "", SingleChildWidgetContainer.field_C);
          ValidationStatusWidget.field_cb[0] = GzipDecoder.field_a;
          ValidationStatusWidget.field_cb[1] = SpriteLoader.a(-127, "char_select_frame_selected", "", SingleChildWidgetContainer.field_C);
          ba.field_b = ResizableModalDialog.a("button_frame", 53, "", SingleChildWidgetContainer.field_C);
          aa.field_k = SpriteLoader.a(-127, "nav_frame", "", SingleChildWidgetContainer.field_C);
          ph.field_m = SpriteLoader.a(param0 - 129, "text_frame", "", SingleChildWidgetContainer.field_C);
          qf.field_c = SpriteLoader.a(-127, "seal_list", "", SingleChildWidgetContainer.field_C);
          DisplayNameSelectionPanel.field_M = SpriteLoader.a(-127, "go_button", "", SingleChildWidgetContainer.field_C);
          AccountRegistrationPanel.field_J = ResizableModalDialog.a("instructions_frame", 35, "", SingleChildWidgetContainer.field_C);
          SpriteLoader.a(-127, "char_select_arrows", "", SingleChildWidgetContainer.field_C);
          ua.field_d = mh.a(param0 + 52, SingleChildWidgetContainer.field_C, "keys", "");
          EditableTextField.field_V = mh.a(113, SingleChildWidgetContainer.field_C, "keys2", "");
          tf.field_j = SpriteLoader.a(-128, "achievements_large", "", SingleChildWidgetContainer.field_C);
          var2 = tf.field_j;
          var3_int = 0;
          do {
            if (var3_int >= var2.length) {
              IterableNodeHashTable.a((byte) -44, je.field_b);
              ResourceArchive.field_o = SpriteLoader.a(-127, "interface_clouds", "", SingleChildWidgetContainer.field_C);
              rd.field_i = SpriteLoader.a(param0 ^ -127, "interface_border", "", SingleChildWidgetContainer.field_C);
              InteractiveWidget.field_L = SpriteLoader.a(param0 - 128, "interface_score_health", "", SingleChildWidgetContainer.field_C);
              ph.field_h = SpriteLoader.a(-127, "interface_lives_remaining", "", SingleChildWidgetContainer.field_C);
              di.field_t = SpriteLoader.a(-128, "interface_lives_heads", "", SingleChildWidgetContainer.field_C);
              rc.field_p = SpriteLoader.a(-127, "interface_bo_energy", "", SingleChildWidgetContainer.field_C);
              ni.field_h = SpriteLoader.a(param0 - 128, "interface_sais_energy", "", SingleChildWidgetContainer.field_C);
              ba.field_d = SpriteLoader.a(-128, "interface_glovepunch_energy", "", SingleChildWidgetContainer.field_C);
              wf.field_b = qk.a("", "interface_seals", SingleChildWidgetContainer.field_C, 0);
              MusicPatchNode.field_j = qk.a("", "interface_sealscollected", SingleChildWidgetContainer.field_C, param0 ^ 1);
              mb.field_d = SpriteLoader.a(-128, "interface_health_icon", "", SingleChildWidgetContainer.field_C);
              rl.field_h = SpriteLoader.a(param0 - 129, "boss_heads", "", SingleChildWidgetContainer.field_C);
              SectorCacheStore.field_f.bindAsTarget(-63);
              ie.field_f = new Sprite[3][2];
              ie.field_f[0][0] = rc.field_p[0];
              ie.field_f[0][1] = rc.field_p[1];
              ie.field_f[1][0] = ni.field_h[0];
              ie.field_f[1][1] = ni.field_h[1];
              ie.field_f[2][0] = ba.field_d[0];
              ie.field_f[2][1] = ba.field_d[1];
              ValidationStatusWidget.field_Y = qk.a("", "menu_slider", SingleChildWidgetContainer.field_C, 0);
              ProgressMessageDialog.field_xb = DiskCacheWorker.a(SingleChildWidgetContainer.field_C, "", (byte) -127, "intro4_bg");
              hl.a(ProgressMessageDialog.field_xb, false, MatchingFieldValidator.field_m[3][0]);
              break;
            }
            var4_ref_ka = var2[var3_int];
            IterableNodeHashTable.a((byte) -44, var4_ref_ka);
            var3_int++;
          } while (var12 == 0);
          var2_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var2_int >= 5))) {
            array$0 = new Sprite[MidiNoteMask.field_l[var2_int]];
            AccountServiceResult.field_h[var2_int] = array$0;
            var3_int = var2_int;
            stackIn_51_0 = var3_int;
            if (var12 == 0) {
              regionExit1: {
                regionExit2: {
                  regionExit3: {
                    regionExit4: {
                      if (stackIn_51_0 == 0) {
                        AccountServiceResult.field_h[var2_int][0] = qk.a("", "intro1", SingleChildWidgetContainer.field_C, 0);
                        break regionExit1;
                      } else if (var3_int != 1) {
                        switch (var3_int) {
                          case 2:
                            break regionExit4;
                          case 3:
                            break regionExit3;
                          case 4:
                            break regionExit2;
                          default:
                            break regionExit1;
                        }
                      }
                      AccountServiceResult.field_h[var2_int][0] = qk.a("", "intro2", SingleChildWidgetContainer.field_C, param0 - 1);
                      break regionExit1;
                    }
                    AccountServiceResult.field_h[var2_int][0] = qk.a("", "intro3", SingleChildWidgetContainer.field_C, param0 - 1);
                    break regionExit1;
                  }
                  AccountServiceResult.field_h[var2_int][0] = null;
                  AccountServiceResult.field_h[var2_int][1] = qk.a("", "intro4_enemies", SingleChildWidgetContainer.field_C, 0);
                  break regionExit1;
                }
                AccountServiceResult.field_h[var2_int][0] = qk.a("", "intro5", SingleChildWidgetContainer.field_C, 0);
              }
              var2_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            AccountServiceResult.field_h[3][0] = ProgressMessageDialog.field_xb.a();
            ProgressMessageDialog.field_xb = null;
            we.field_m = new Sprite[4];
            we.field_m[0] = null;
            qc.field_c = DiskCacheWorker.a(SingleChildWidgetContainer.field_C, "", (byte) -116, "game_start_bg");
            we.field_m[1] = qk.a("", "game_start_henhui", SingleChildWidgetContainer.field_C, 0);
            we.field_m[2] = qk.a("", "game_start_ziren", SingleChildWidgetContainer.field_C, 0);
            we.field_m[3] = qk.a("", "game_start_damen", SingleChildWidgetContainer.field_C, 0);
            eb.field_p = new Sprite[2];
            eb.field_p[0] = qk.a("", "level_start_heads", SingleChildWidgetContainer.field_C, param0 - 1);
            eb.field_p[1] = qk.a("", "level_start_tower_1", SingleChildWidgetContainer.field_C, 0);
            pl.field_f = new Sprite[4];
            pl.field_f[0] = null;
            FullscreenFocusCanvas.field_e = DiskCacheWorker.a(SingleChildWidgetContainer.field_C, "", (byte) -115, "level_start_boss_bg");
            hl.a(FullscreenFocusCanvas.field_e, false, 15245826);
            pl.field_f[1] = qk.a("", "level_start_boss_1", SingleChildWidgetContainer.field_C, param0 - 1);
            pl.field_f[2] = qk.a("", "level_start_boss_2", SingleChildWidgetContainer.field_C, 0);
            pl.field_f[3] = qk.a("", "level_start_boss_3", SingleChildWidgetContainer.field_C, 0);
            Bzip2State.field_w = new Sprite[4];
            Bzip2State.field_w[0] = null;
            lb.field_t = DiskCacheWorker.a(SingleChildWidgetContainer.field_C, "", (byte) -128, "game_over_scene_bg");
            hl.a(lb.field_t, false, 6831816);
            Bzip2State.field_w[1] = qk.a("", "game_over_scene_henhui", SingleChildWidgetContainer.field_C, 0);
            Bzip2State.field_w[2] = qk.a("", "game_over_scene_ziren", SingleChildWidgetContainer.field_C, param0 - 1);
            Bzip2State.field_w[3] = qk.a("", "game_over_scene_damen", SingleChildWidgetContainer.field_C, 0);
            pf.field_a = new Sprite[5];
            pf.field_a[0] = null;
            mb.field_b = qc.field_c.b();
            hl.a(qc.field_c, false, 15245826);
            hl.a(mb.field_b, false, 6831816);
            pf.field_a[1] = qk.a("", "game_win_1_henhui", SingleChildWidgetContainer.field_C, 0);
            pf.field_a[2] = qk.a("", "game_win_1_ziren", SingleChildWidgetContainer.field_C, 0);
            pf.field_a[3] = qk.a("", "game_win_1_damen", SingleChildWidgetContainer.field_C, 0);
            pf.field_a[4] = qk.a("", "game_win_1_stars", SingleChildWidgetContainer.field_C, 0);
            ProgressDialog.field_eb = SpriteLoader.a(-127, "status_messages", "", SingleChildWidgetContainer.field_C);
            var2_int = ProgressDialog.field_eb.length;
            stackIn_51_0 = 0;
          }
          var3_int = stackIn_51_0;
          do {
            if (var2_int <= var3_int) {
              ImageProducerRasterBuffer.field_m = SpriteLoader.a(param0 - 129, "rocket_trail", "", SingleChildWidgetContainer.field_C);
              qb.a((byte) 49, ImageProducerRasterBuffer.field_m);
              wh.field_f = SpriteLoader.a(-127, "dust_cloud", "", SingleChildWidgetContainer.field_C);
              qb.a((byte) 45, wh.field_f);
              ve.field_b = SpriteLoader.a(param0 - 128, "monk1", "", SingleChildWidgetContainer.field_C);
              qb.a((byte) 87, ve.field_b);
              tf.field_a = SpriteLoader.a(param0 - 128, "monk2", "", SingleChildWidgetContainer.field_C);
              qb.a((byte) 81, tf.field_a);
              RasterBuffer.field_d = SpriteLoader.a(param0 - 128, "monk3", "", SingleChildWidgetContainer.field_C);
              qb.a((byte) 23, RasterBuffer.field_d);
              hc.field_T = SpriteLoader.a(param0 ^ -127, "monk1_swooshes", "", SingleChildWidgetContainer.field_C);
              qb.a((byte) 57, hc.field_T);
              cg.field_d = SpriteLoader.a(-127, "monk2_swooshes", "", SingleChildWidgetContainer.field_C);
              qb.a((byte) 16, cg.field_d);
              af.field_b = SpriteLoader.a(-127, "boss1", "", SingleChildWidgetContainer.field_C);
              qb.a((byte) 64, af.field_b);
              aj.field_i = SpriteLoader.a(-127, "boss1_attacks", "", SingleChildWidgetContainer.field_C);
              qb.a((byte) 33, aj.field_i);
              pl.field_c = SpriteLoader.a(-127, "boss2", "", SingleChildWidgetContainer.field_C);
              qb.a((byte) 72, pl.field_c);
              MidiNoteMask.field_n = SpriteLoader.a(-127, "boss2_attacks", "", SingleChildWidgetContainer.field_C);
              qb.a((byte) 109, MidiNoteMask.field_n);
              AlphaWidgetContainer.field_F = SpriteLoader.a(-127, "boss3", "", SingleChildWidgetContainer.field_C);
              qb.a((byte) 126, AlphaWidgetContainer.field_F);
              nk.field_a = SpriteLoader.a(-128, "boss3_attacks", "", SingleChildWidgetContainer.field_C);
              qb.a((byte) 14, nk.field_a);
              ModalDialogHost.field_I = new Sprite[3][][];
              break;
            }
            ProgressDialog.field_eb[var3_int].normalizeCanvas();
            var3_int++;
          } while (var12 == 0);
          var6_int = 0;
          while (true) {
            stackIn_60_0 = -4;
            if (stackIn_60_0 < ~var6_int) {
              var5 = oj.field_g[var6_int][1];
              var4 = oj.field_g[var6_int][0];
              ModalDialogHost.field_I[var6_int] = new Sprite[var4][var5];
              if (var12 == 0) {
                boolean decompiledFrameRemainder4 = true;
                if (var6_int != 0) {
                  if (1 != var6_int) {
                    decompiledFrameRemainder4 = (2 == var6_int);
                    if (decompiledFrameRemainder4) {
                      var3 = SpriteLoader.a(-127, "boss3_swooshes", "", SingleChildWidgetContainer.field_C);
                    }
                  } else {
                    var3 = SpriteLoader.a(-128, "boss2_swooshes", "", SingleChildWidgetContainer.field_C);
                  }
                } else {
                  var3 = SpriteLoader.a(-128, "boss1_swooshes", "", SingleChildWidgetContainer.field_C);
                }
                if (decompiledFrameRemainder4) {
                  qb.a((byte) 4, var3);
                  var7_int = 0;
                  while (var7_int < var4) {
                    stackIn_60_0 = 0;
                    var8 = stackIn_60_0;
                    while (var5 > var8) {
                      ModalDialogHost.field_I[var6_int][var7_int][var8] = var3[var5 * var7_int + var8];
                      var8++;
                    }
                    var7_int++;
                  }
                }
                var6_int++;
                continue;
              }
            } else {
              EditableTextField.field_O = qk.a("", "spear", SingleChildWidgetContainer.field_C, 0);
            }
            var3 = null;
            this.b(true);
            var6_int = 0;
            while (true) {
              stackIn_89_0 = 3;
              boolean decompiledFrameRemainder3 = true;
              if (stackIn_89_0 > var6_int) {
                stackIn_113_0 = 0;
                decompiledFrameRemainder3 = (var12 == 0);
                if (decompiledFrameRemainder3) {
                  var7_int = stackIn_113_0;
                  while (true) {
                    stackIn_93_0 = 20;
                    if (stackIn_93_0 > var7_int) {
                      array$1 = new Sprite[NetworkArchiveRequest.field_x[var7_int][var6_int]];
                      c.field_c[var7_int][var6_int] = array$1;
                      stackIn_89_0 = 0;
                      var8 = stackIn_89_0;
                      while (NetworkArchiveRequest.field_x[var7_int][var6_int] > var8) {
                        stackIn_93_0 = var6_int;
                        if (stackIn_93_0 == 0) {
                          c.field_c[var7_int][var6_int][var8] = ve.field_b[var8 + var7_int * 6];
                        }
                        if (var6_int == 1) {
                          c.field_c[var7_int][var6_int][var8] = tf.field_a[var8 + 6 * var7_int];
                        }
                        if (2 == var6_int) {
                          c.field_c[var7_int][var6_int][var8] = RasterBuffer.field_d[var8 + 6 * var7_int];
                        }
                        var8++;
                      }
                      var7_int++;
                      continue;
                    }
                    break;
                  }
                  var6_int++;
                  continue;
                }
              }
              if (decompiledFrameRemainder3) {
                ve.field_b = null;
                RasterBuffer.field_d = null;
                tf.field_a = null;
                stackIn_113_0 = 0;
              }
              var6_int = stackIn_113_0;
              while (true) {
                stackIn_115_0 = var6_int;
                boolean decompiledFrameRemainder2 = true;
                if (stackIn_115_0 < 2) {
                  stackIn_134_0 = 0;
                  decompiledFrameRemainder2 = (var12 == 0);
                  if (decompiledFrameRemainder2) {
                    var7_int = stackIn_134_0;
                    while (true) {
                      stackIn_119_0 = ~var7_int;
                      stackIn_119_1 = -21;
                      if (stackIn_119_0 > stackIn_119_1) {
                        array$2 = new Sprite[NetworkArchiveRequest.field_x[var7_int][var6_int]];
                        PacketBuffer.field_o[var7_int][var6_int] = array$2;
                        stackIn_115_0 = 0;
                        var8 = stackIn_115_0;
                        while (var8 < NetworkArchiveRequest.field_x[var7_int][var6_int]) {
                          stackIn_119_0 = 0;
                          stackIn_119_1 = var6_int;
                          if (stackIn_119_0 == stackIn_119_1) {
                            PacketBuffer.field_o[var7_int][var6_int][var8] = hc.field_T[var8 + 6 * var7_int];
                          }
                          if (1 == var6_int) {
                            PacketBuffer.field_o[var7_int][var6_int][var8] = cg.field_d[var8 + 6 * var7_int];
                          }
                          var8++;
                        }
                        var7_int++;
                        continue;
                      }
                      break;
                    }
                    var6_int++;
                    continue;
                  }
                }
                if (decompiledFrameRemainder2) {
                  cg.field_d = null;
                  hc.field_T = null;
                  SecondaryNodeDeque.field_a[0] = SpriteLoader.a(-127, "henhui_puff", "", SingleChildWidgetContainer.field_C);
                  SecondaryNodeDeque.field_a[1] = SpriteLoader.a(param0 - 129, "ziren_puff", "", SingleChildWidgetContainer.field_C);
                  SecondaryNodeDeque.field_a[2] = SpriteLoader.a(-128, "damen_puff", "", SingleChildWidgetContainer.field_C);
                  ra.field_b[0][0] = qk.a("", "damen_vert_swipe", SingleChildWidgetContainer.field_C, param0 - 1);
                  ra.field_b[0][1] = ra.field_b[0][0].copyMirroredHorizontally();
                  ra.field_b[1][0] = qk.a("", "damen_angled_swipe", SingleChildWidgetContainer.field_C, 0);
                  ra.field_b[1][1] = ra.field_b[1][0].copyMirroredHorizontally();
                  stackIn_134_0 = 0;
                }
                var6_int = stackIn_134_0;
                while (true) {
                  stackIn_136_0 = var6_int;
                  boolean decompiledFrameRemainder1 = true;
                  if (stackIn_136_0 < 3) {
                    stackIn_182_0 = 0;
                    decompiledFrameRemainder1 = (var12 == 0);
                    if (decompiledFrameRemainder1) {
                      var7_int = stackIn_182_0;
                      while (true) {
                        stackIn_140_0 = var7_int;
                        stackIn_140_1 = 16;
                        if (stackIn_140_0 < stackIn_140_1) {
                          array$3 = new Sprite[kk.field_h[var7_int][var6_int]];
                          g.field_i[var7_int][var6_int] = array$3;
                          stackIn_136_0 = 0;
                          var8 = stackIn_136_0;
                          while (var8 < kk.field_h[var7_int][var6_int]) {
                            stackIn_140_0 = 0;
                            stackIn_140_1 = var6_int;
                            if (stackIn_140_0 == stackIn_140_1) {
                              if (8 > var7_int) {
                                g.field_i[var7_int][var6_int][var8] = af.field_b[var7_int * 8 + var8];
                              } else {
                                g.field_i[var7_int][var6_int][var8] = aj.field_i[var7_int * 8 - 64 + var8];
                              }
                            } else if (1 != var6_int) {
                              if (var6_int == 2) {
                                if (var7_int < 8) {
                                  g.field_i[var7_int][var6_int][var8] = AlphaWidgetContainer.field_F[var8 + var7_int * 8];
                                } else {
                                  g.field_i[var7_int][var6_int][var8] = nk.field_a[var8 + var7_int * 8 - 64];
                                }
                              }
                            } else if (var7_int < 8) {
                              g.field_i[var7_int][var6_int][var8] = pl.field_c[var8 + 8 * var7_int];
                            } else {
                              g.field_i[var7_int][var6_int][var8] = MidiNoteMask.field_n[8 * (-8 + var7_int) + var8];
                            }
                            var8++;
                          }
                          var7_int++;
                          continue;
                        }
                        break;
                      }
                      var6_int++;
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    ec.field_a = SpriteLoader.a(param0 - 129, "tour_icon", "", SingleChildWidgetContainer.field_C);
                    qb.a((byte) 21, ec.field_a);
                    wi.field_d = SpriteLoader.a(-127, "coins", "", SingleChildWidgetContainer.field_C);
                    qb.a((byte) 103, wi.field_d);
                    be.field_f = SpriteLoader.a(-127, "tour_wall", "", SingleChildWidgetContainer.field_C);
                    SingleChildWidgetContainer.field_D = SpriteLoader.a(param0 ^ -127, "tour_wall2", "", SingleChildWidgetContainer.field_C);
                    af.field_a = SpriteLoader.a(-128, "tour_wall3", "", SingleChildWidgetContainer.field_C);
                    stackIn_182_0 = 0;
                  }
                  var6_int = stackIn_182_0;
                  scanLoop5: while (true) {
                    if (6 > var6_int) {
                      stackIn_194_0 = 0;
                      if (var12 != 0) {
                        break scanLoop5;
                      }
                      var7_int = stackIn_194_0;
                      while (var7_int < 2) {
                        we.field_e[var6_int][var7_int] = new Sprite(SingleChildWidgetContainer.field_D[0].storedWidth, SingleChildWidgetContainer.field_D[0].storedHeight);
                        var7_int++;
                      }
                      var6_int++;
                      continue;
                    }
                    stackIn_194_0 = 0;
                    break;
                  }
                  var6_int = stackIn_194_0;
                  scanLoop6: while (true) {
                    if (var6_int < 2) {
                      stackIn_206_0 = 0;
                      if (var12 != 0) {
                        break scanLoop6;
                      }
                      var7_int = stackIn_206_0;
                      while (var7_int < 2) {
                        re.field_v[var6_int][var7_int] = new Sprite(af.field_a[0].storedWidth, af.field_a[0].storedHeight);
                        var7_int++;
                      }
                      var6_int++;
                      continue;
                    }
                    stackIn_206_0 = 0;
                    break;
                  }
                  var6_int = stackIn_206_0;
                  while (true) {
                    stackIn_208_0 = ~var6_int;
                    boolean decompiledFrameRemainder0 = true;
                    if (stackIn_208_0 > -5) {
                      stackIn_223_0 = 0;
                      decompiledFrameRemainder0 = (var12 == 0);
                      if (decompiledFrameRemainder0) {
                        var7_int = stackIn_223_0;
                        while (2 > var7_int) {
                          stackIn_208_0 = 0;
                          var8 = stackIn_208_0;
                          while (var8 < 2) {
                            sf.field_d[var6_int][var7_int][var8] = new Sprite(be.field_f[ea.field_e * 6 + var8].storedWidth, be.field_f[var8 + 6 * ea.field_e].storedHeight);
                            var8++;
                          }
                          var7_int++;
                        }
                        var6_int++;
                        continue;
                      }
                    }
                    if (decompiledFrameRemainder0) {
                      DequeWidgetContainer.field_C = SpriteLoader.a(param0 - 129, "doors", "", SingleChildWidgetContainer.field_C);
                      qb.a((byte) 82, DequeWidgetContainer.field_C);
                      stackIn_223_0 = 8;
                    }
                    var6 = new int[stackIn_223_0];
                    var8 = 90;
                    var7 = new Sprite(var8, var8);
                    je.field_g = new Sprite(DequeWidgetContainer.field_C[0].fullWidth, DequeWidgetContainer.field_C[0].fullHeight);
                    cj.field_c = new Sprite(DequeWidgetContainer.field_C[0].fullWidth, DequeWidgetContainer.field_C[0].fullHeight);
                    od.a(33, 30, 68, 90, 34, 45, je.field_g, var7, var6);
                    var6 = null;
                    var7_ref = null;
                    je.field_g.trimTransparentBorders();
                    c.field_b = qk.a("", "door_sign", SingleChildWidgetContainer.field_C, 0);
                    c.field_b.trimTransparentBorders();
                    ModalDialogHost.field_F = new Sprite(DequeWidgetContainer.field_C[0].fullWidth, DequeWidgetContainer.field_C[0].fullHeight);
                    ModalDialogHost.field_F.bindAsRenderTarget();
                    SoftwareRasterizer.fillRectangle(33, 30, 68, 90, param0);
                    DequeWidgetContainer.field_C[1].drawTransparent(0, 0);
                    SectorCacheStore.field_f.bindAsTarget(101);
                    dk.field_c = new Sprite[4][9];
                    var9 = 0;
                    scanLoop7: while (true) {
                      if (var9 < 4) {
                        stackIn_235_0 = 0;
                        if (var12 != 0) {
                          break scanLoop7;
                        }
                        var10_int = stackIn_235_0;
                        while (9 > var10_int) {
                          dk.field_c[var9][var10_int] = wi.field_d[var10_int + var9 * 9];
                          var10_int++;
                        }
                        var9++;
                        continue;
                      }
                      wi.field_d = null;
                      ResourceArchive.field_h = SpriteLoader.a(param0 - 128, "clouds", "", SingleChildWidgetContainer.field_C);
                      qb.a((byte) 86, ResourceArchive.field_h);
                      var9 = tf.field_x.field_x + tf.field_x.field_K;
                      hh.field_b = new Sprite(var9, var9);
                      hh.field_b.bindAsRenderTarget();
                      DefaultTextWidgetRenderer.field_f.drawDownscaledAreaAveraged(0, 0, var9, var9);
                      DefaultTextWidgetRenderer.field_f = null;
                      SectorCacheStore.field_f.bindAsTarget(105);
                      stackIn_235_0 = 12476;
                      break;
                    }
                    oj.a(gi.b(stackIn_235_0), 0, 80, false, EmailFormatValidator.field_p, 255);
                    var10 = qk.a("", "mb_frames", SingleChildWidgetContainer.field_C, param0 ^ 1);
                    pl.a(13267, MusicPatchNode.field_E, var10);
                    nj.a(qk.a("", "mb_logo", SingleChildWidgetContainer.field_C, 0), 2);
                    pa.a(-99, SpriteLoader.a(-127, "mb_sshots", "", SingleChildWidgetContainer.field_C));
                    var11 = qk.a("", "mb_pricing_bg", SingleChildWidgetContainer.field_C, 0);
                    hc.a(10, param0 ^ 100, 10, 30, 80, 1500, 80, 10, var11);
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw oj.wrapException((Throwable) ((Object) var2_ref), "TorChallenge.B(" + param0 + ')');
        }
    }

    static int a(int param0, int param1) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          stackIn_1_0 = param0 ^ param1;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.wrapException((Throwable) ((Object) var2), "TorChallenge.E(" + param0 + ',' + param1 + ')');
        }
    }

    public static void q(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != 1) {
            TorChallenge.a((String) null, false, -43, -1, (String) null, (String) null, 18);
          }
          field_I = null;
          field_H = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.wrapException((Throwable) ((Object) var1), "TorChallenge.L(" + param0 + ')');
        }
    }

    final void drawFrame(int param0) {
        boolean stackIn_82_0 = false;
        RuntimeException decompiledCaughtException = null;
        java.awt.Canvas var2 = null;
        RuntimeException var2_ref = null;
        Sprite var3_ref_ka = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Sprite var3_ref_kaLifetime1;
        int var4Lifetime1;
        var5 = field_F ? 1 : 0;
        try {
          var2 = MusicPatchEnvelope.a(102);
          if (hc.c((byte) 57)) {
            DisplayNameSelectionPanel.a(var2, param0 - 7783, ph.a((byte) -40));
            return;
          }
          if (!eb.field_o) {
            EmailFormatValidator.a(-20895, var2);
            return;
          }
          if (!jh.a((byte) 103)) {
            mh.a(ProgressMessageDialog.field_qb, (byte) -125, 100.0f);
            EmailFormatValidator.a(-20895, var2);
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          if (~DefaultTextWidgetRenderer.field_o != ~PcmOutputWorker.activeScreenId) {
            if (16 <= hk.field_e) {
              if (-1 != PcmOutputWorker.activeScreenId) {
                GameApplet.screens[PcmOutputWorker.activeScreenId].e(param0 ^ 1014663489);
                if (var5 != 0) {
                  ji.field_m.c(param0 ^ 7856);
                }
              } else {
                ji.field_m.c(param0 ^ 7856);
              }
              var3_ref_ka = new Sprite(1, 1);
              var3_ref_ka.pixels = SoftwareRasterizer.pixels;
              var3_ref_ka.fullWidth = SoftwareRasterizer.width;
              var3_ref_ka.storedWidth = SoftwareRasterizer.width;
              var3_ref_ka.fullHeight = SoftwareRasterizer.height;
              var3_ref_ka.storedHeight = SoftwareRasterizer.height;
              var4 = 256 * (hk.field_e + 1 - 16) / 16;
              var3_ref_ka.drawTransparentWithIntensity(0, 0, var4);
              decompiledFrameRemainder0 = (var5 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (DefaultTextWidgetRenderer.field_o != -1) {
                GameApplet.screens[DefaultTextWidgetRenderer.field_o].e(param0 ^ 1014663489);
                if (var5 != 0) {
                  ji.field_m.c(48);
                }
              } else {
                ji.field_m.c(48);
              }
              var3_ref_kaLifetime1 = new Sprite(1, 1);
              var3_ref_kaLifetime1.fullWidth = SoftwareRasterizer.width;
              var3_ref_kaLifetime1.storedWidth = SoftwareRasterizer.width;
              var3_ref_kaLifetime1.pixels = SoftwareRasterizer.pixels;
              var3_ref_kaLifetime1.fullHeight = SoftwareRasterizer.height;
              var3_ref_kaLifetime1.storedHeight = SoftwareRasterizer.height;
              var4Lifetime1 = (-(255 * hk.field_e) + 3825) / 15;
              var3_ref_kaLifetime1.drawTransparentWithIntensity(0, 0, var4Lifetime1);
              decompiledFrameRemainder0 = (var5 != 0);
            }
          }
          if (decompiledFrameRemainder0) {
            if (-1 == DefaultTextWidgetRenderer.field_o) {
              ji.field_m.c(48);
              decompiledFrameRemainder0 = (var5 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (DefaultTextWidgetRenderer.field_o == 8 ||
                9 == DefaultTextWidgetRenderer.field_o) {
                GameApplet.screens[8].e(1014667201);
                GameApplet.screens[9].e(1014667201);
                if (var5 != 0) {
                  if (DefaultTextWidgetRenderer.field_o != 10 &&
                    11 != DefaultTextWidgetRenderer.field_o) {
                    GameApplet.screens[DefaultTextWidgetRenderer.field_o].e(1014667201);
                    GameApplet.screens[10].e(1014667201);
                    GameApplet.screens[11].e(param0 + 1014659393);
                  } else {
                    GameApplet.screens[10].e(1014667201);
                    GameApplet.screens[11].e(param0 + 1014659393);
                  }
                }
              } else {
                boolean decompiledSharedTail0 = (DefaultTextWidgetRenderer.field_o == 10 ||
                  11 == DefaultTextWidgetRenderer.field_o);
                if (!decompiledSharedTail0) {
                  GameApplet.screens[DefaultTextWidgetRenderer.field_o].e(1014667201);
                  decompiledSharedTail0 = (var5 != 0);
                }
                if (decompiledSharedTail0) {
                  GameApplet.screens[10].e(1014667201);
                  GameApplet.screens[11].e(param0 + 1014659393);
                }
              }
            }
          }
          if (param0 != 7808) {
            field_G = -107;
          }
          if (vc.a(0)) {
            SoftwareRasterizer.darkenRectangleHalf(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height);
            ModalDialogHost.a(true, DebouncedFieldValidator.field_i, DebouncedFieldValidator.field_i[0].storedHeight + 16, 16 + DebouncedFieldValidator.field_i[0].storedWidth);
          }
          if (DiskCacheWorker.field_b != 0) {
            var3 = 256 * hk.field_e / 32;
            if (0 < var3) {
              SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height, 0, var3);
            }
          }
          if (lc.a(1)) {
            if (null == gi.field_d) {
              stackIn_82_0 = GrowableIntArray.field_d;
            } else {
              stackIn_82_0 = true;
            }
            qk.a(stackIn_82_0, 0);
          }
          nj.a(0, 0, var2, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw oj.wrapException((Throwable) ((Object) var2_ref), "TorChallenge.C(" + param0 + ')');
        }
    }

    final void initializeGame(int param0) {
        RuntimeException runtimeException = null;
        MidiPcmStream var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = field_F ? 1 : 0;
        try {
          this.initializeFramework(false, 11, 2, 3, false, 0, 1, 39);
          var2 = new MidiPcmStream();
          var2.setChannelProgram(128, -122, 9);
          MidiPcmStream.a(22050, 16239, ArchiveRequest.field_u, true, (java.awt.Component) ((Object) LabeledWidgetContainer.field_P), var2);
          TextLayout.field_f = 1;
          qa.field_f = 0;
          ai.field_d = 0;
          this.a(true, true, true, true, false);
          if (param0 > -62) {
            return;
          }
          var3 = 0;
          while (var3 < 3) {
            ii.field_f[var3] = new int[1];
            var3++;
            if (var4 != 0) {
              return;
            }
          }
          ja.a((byte) 124);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw oj.wrapException((Throwable) ((Object) runtimeException), "TorChallenge.H(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6, int param7) {
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var16 = field_F ? 1 : 0;
        try {
          var8_int = SocketConnector.field_l[param5][param6][1][0];
          var9 = SocketConnector.field_l[param5][param6][1][1];
          var10 = SocketConnector.field_l[param5][param6][2][0];
          var11 = SocketConnector.field_l[param5][param6][2][1];
          var12 = ArchiveNetworkClient.field_a[param5][param6];
          if (param3) {
            TorChallenge.q(123);
          }
          SoftwareRasterizer.saveClip(ae.field_y);
          var13 = 64;
          SoftwareRasterizer.intersectClip(var8_int, param1, var9, param4);
          var14 = var12 - 1;
          if (var14 < 0) {
            var14 += 64;
          }
          var15 = var12 + 1;
          if (64 <= var15) {
            var15 -= 64;
          }
          if (0 == param7 &&
            (64 & SingleChildWidgetContainer.field_E[var14][param2]) > 0) {
            SoftwareRasterizer.setClip(var10, param1, var9, param4);
            re.field_v[1][param6].drawOpaque(var10, param1);
            SoftwareRasterizer.restoreClip(ae.field_y);
            if (var16 == 0) {
              return;
            }
          }
          if (param7 != 0) {
            if (param7 == 1 &&
              0 < (64 & SingleChildWidgetContainer.field_E[var15][param2])) {
              SoftwareRasterizer.setClip(var8_int, param1, var11, param4);
              re.field_v[1][param6].drawOpaque(var8_int, param1);
              SoftwareRasterizer.restoreClip(ae.field_y);
              if (var16 == 0) {
                return;
              }
            }
            SoftwareRasterizer.fillRectangle(var11, param1, -var11 + var9, var13, 0);
            SoftwareRasterizer.intersectClip(var8_int, param1, var11, param4);
            re.field_v[0][param6].drawOpaque(var8_int, param1);
            SoftwareRasterizer.restoreClip(ae.field_y);
            if (var16 == 0) {
              return;
            }
          }
          SoftwareRasterizer.fillRectangle(var8_int, param1, var10 - var8_int, var13, 0);
          SoftwareRasterizer.intersectClip(var10, param1, var9, param4);
          re.field_v[0][param6].drawOpaque(var10, param1);
          SoftwareRasterizer.restoreClip(ae.field_y);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw oj.wrapException((Throwable) ((Object) var8), "TorChallenge.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    private final void d(int param0, boolean param1) {
        int stackIn_4_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        Sprite[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Sprite[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = field_F ? 1 : 0;
        try {
          boolean decompiledFrameCompleted0 = true;
          if (param1) {
            var3 = SpriteLoader.a(-128, "skeleton_runner", "", SingleChildWidgetContainer.field_C);
            var4 = 3;
            var5 = 8;
            var6 = var3.length;
            var7 = var6 / var5;
            var8 = var4 * var6;
            var9 = new Sprite[var8];
            var10 = 0;
            while (true) {
              stackIn_4_0 = ~var5;
              if (stackIn_4_0 < ~var10) {
                stackIn_22_0 = 0;
                if (var15 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                var11 = stackIn_22_0;
                while (var11 < var4) {
                  stackIn_4_0 = 0;
                  var12 = stackIn_4_0;
                  while (var7 > var12) {
                    var13 = var7 * var10 + var12;
                    var14 = var11 * var7 + var4 * var7 * var10 + var12;
                    var9[var14] = var3[var13];
                    var12++;
                  }
                  var11++;
                }
                var10++;
                continue;
              }
              break;
            }
            if (decompiledFrameCompleted0) {
              re.field_x[AccountRegistrationPanel.field_T[1]] = var9;
            }
          }
          if (decompiledFrameCompleted0) {
            if (!param1 ||
              var15 != 0) {
              re.field_x[AccountRegistrationPanel.field_T[1]] = SpriteLoader.a(-128, "runner", "", SingleChildWidgetContainer.field_C);
            }
            qb.a((byte) 94, re.field_x[AccountRegistrationPanel.field_T[1]]);
            stackIn_22_0 = param0;
          }
          if (stackIn_22_0 < 80) {
            field_H = (ModalDialogHost) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw oj.wrapException((Throwable) ((Object) var3_ref), "TorChallenge.K(" + param0 + ',' + param1 + ')');
        }
    }

    private final void s(int param0) {
        if (ClientException.field_e != null) {
          ConfirmedEmailAvailabilityValidator.a(ClientException.field_e, 0);
          ClientException.field_e = null;
          id.a(87);
        }
        if (param0 <= 111) {
          return;
        }
        try {
          SingleChildWidgetContainer.field_C = ProgressDialog.b(4, -1);
          PasswordValidator.field_q = ProgressDialog.b(5, -1);
          DelegatingCanvas.field_d = ProgressDialog.b(6, -1);
          SpriteLoader.field_f = ProgressDialog.b(7, -1);
          cl.field_y = ProgressDialog.b(8, -1);
          fh.field_f = ProgressDialog.b(9, -1);
          RegistrationAgreementPane.field_M = ProgressDialog.b(10, -1);
        } catch (RuntimeException runtimeException) {
          throw oj.wrapException((Throwable) ((Object) runtimeException), "TorChallenge.D(" + param0 + ')');
        }
    }

    final void tickGame(byte param0) {
        boolean discarded$0 = false;
        int stackIn_11_1 = 0;
        boolean stackIn_12_2 = false;
        boolean stackIn_51_1 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        rd var3_ref_rd = null;
        bk var3_ref_bk = null;
        eh var3_ref_eh = null;
        int var4 = 0;
        var4 = field_F ? 1 : 0;
        try {
          cl.b((byte) -117);
          if (gi.field_d != null &&
            gi.field_d.field_i) {
            ij.c((byte) -126);
            ki.a((byte) 116);
          }
          var2_int = 54 / ((param0 + 39) / 43);
          stackIn_11_1 = -115;
          stackIn_12_2 = (null != gi.field_d);
          this.serviceFramework(stackIn_11_1, stackIn_12_2);
          if (tc.field_k) {
            this.s(119);
            tc.field_k = false;
          }
          if (hc.c((byte) 63)) {
            this.updateLoginFlow(109);
            if (hc.c((byte) -108)) {
              if (GuestPlayConfirmationForm.f((byte) -128)) {
                discarded$0 = this.a(false, (byte) 82);
              }
              return;
            }
          }
          boolean decompiledFrameRemainder0 = true;
          if (!eb.field_o) {
            mc.a(bl.field_X, 83);
            decompiledFrameRemainder0 = !(!this.a(true, (byte) 63));
            if (decompiledFrameRemainder0) {
              eb.field_o = true;
              decompiledFrameRemainder0 = (var4 != 0);
            }
          }
          if (decompiledFrameRemainder0) {
            if (jh.a((byte) 77)) {
              if (!vc.a(0)) {
                if (!lc.a(1)) {
                  this.u(0);
                  decompiledFrameRemainder0 = (var4 != 0);
                }
                if (decompiledFrameRemainder0) {
                  stackIn_51_1 = (null != gi.field_d);
                  var3 = this.pollAccountUiActions(stackIn_51_1, 127);
                  if (var3 == 1 ||
                    var3 == 2) {
                    if (gi.field_d != null) {
                      ij.c((byte) -120);
                    }
                    if (2 == var3) {
                      AccountServiceResult.a((byte) -93, gi.b(12476));
                    }
                  }
                  decompiledFrameRemainder0 = (var4 != 0);
                }
              }
              if (decompiledFrameRemainder0) {
                if (DiskCacheWorker.field_b != 0) {
                  this.u(0);
                  decompiledFrameRemainder0 = (var4 != 0);
                }
                if (decompiledFrameRemainder0) {
                  var3 = MouseWheelInput.a(false);
                  switch (var3) {
                    default:
                      break;
                    case 4:
                      fh.a(0, 7284, -2);
                      if (var4 == 0) {
                        break;
                      }
                    case 3:
                      EmailFormatValidator.a(true, 0);
                      if (var4 == 0) {
                        break;
                      }
                    case 2:
                      ij.c((byte) -104);
                      break;
                  }
                  if (!vc.a(0)) {
                    GameApplet.screens[DefaultTextWidgetRenderer.field_o].a(3, true);
                  }
                  decompiledFrameRemainder0 = (var4 != 0);
                }
              }
            }
            if (decompiledFrameRemainder0) {
              aj.b(3);
              if (jh.a((byte) 57)) {
                bi.a(125);
                LevelDecoder.b(2);
                if (UiComponent.field_o <= 0) {
                  cd.field_o = true;
                  if (var4 != 0) {
                    cd.field_o = false;
                  }
                } else {
                  cd.field_o = false;
                }
                if (5 == DefaultTextWidgetRenderer.field_o &&
                  eh.field_l == 0) {
                  DefaultTextWidgetRenderer.field_o = 2;
                  be.a(2, (byte) -125, false);
                }
              }
            }
          }
          boolean decompiledFrameCompleted1 = true;
          boolean decompiledFrameCompleted0 = true;
          regionExit1: {
            if (!GameClientBase.p(-77)) {
              while (true) {
                var3_ref_rd = (rd) (wc.field_g.pollFirst((byte) -100));
                if (null != var3_ref_rd) {
                  ProxySocketConnector.a(var3_ref_rd, 4, false);
                  if (var4 == 0) {
                    continue;
                  }
                } else {
                  while (true) {
                    var3_ref_bk = (bk) (DequeWidgetContainer.field_B.pollFirst((byte) 102));
                    if (null == var3_ref_bk) {
                      break;
                    }
                    UiComponent.a(var3_ref_bk, 5, (byte) -43);
                    if (var4 != 0) {
                      break regionExit1;
                    }
                  }
                }
                break;
              }
              while (true) {
                var3_ref_eh = (eh) (wj.field_b.pollFirst((byte) -113));
                if (var3_ref_eh == null) {
                  break;
                }
                ki.a(var3_ref_eh, 6, 160);
                if (var4 != 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
              }
            }
          }
          if (decompiledFrameCompleted1) {
            while (p.a(16, qc.field_h)) {
              this.dispatchCommonPacket(5000);
              if (var4 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if (decompiledFrameCompleted0) {
              nb.a(0, -1);
            }
          }
          if (nb.a(-26375)) {
            var3 = this.reconnectAndResendRequests((byte) 110);
            if (var3 == 2) {
              ConfirmedEmailAvailabilityValidator.f(10);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.wrapException((Throwable) ((Object) var2), "TorChallenge.N(" + param0 + ')');
        }
    }

    final static int a(String param0, boolean param1, int param2, int param3, String param4, String param5, int param6) {
        qa var7 = null;
        RuntimeException var7_ref = null;
        qa var8 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = new qa(param4);
          if (param2 != -20031) {
            TorChallenge.a((String) null, false, -109, -34, (String) null, (String) null, -9);
          }
          var8 = new qa(param0);
          stackIn_4_0 = GameScreen.a(var8, param6, param5, param1, param3, -1, var7);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_8_0 = var7_ref;
          stackIn_8_1 = new StringBuilder().append("TorChallenge.G(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param5 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw oj.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param6).append(')').toString());
        }
    }

    public TorChallenge() {
    }

    private final boolean a(boolean param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        Object stackIn_99_0 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = field_F ? 1 : 0;
        try {
          t.a(-67);
          if (null != DelegatingCanvas.field_d) {
            if (aj.field_f.ensureIndexLoaded(-7957) &&
              aj.field_f.tryLoadGroupByName(5, "basic")) {
              if (DelegatingCanvas.field_d.ensureIndexLoaded(-7957) &&
                DelegatingCanvas.field_d.tryLoadAllGroups((byte) 79)) {
                if (SpriteLoader.field_f.ensureIndexLoaded(-7957) &&
                  SpriteLoader.field_f.tryLoadAllGroups((byte) 79)) {
                  if (cl.field_y.ensureIndexLoaded(-7957) &&
                    cl.field_y.tryLoadAllGroups((byte) 79)) {
                    if (fh.field_f.ensureIndexLoaded(-7957) &&
                      fh.field_f.tryLoadAllGroups((byte) 79)) {
                      if (SingleChildWidgetContainer.field_C.ensureIndexLoaded(-7957) &&
                        SingleChildWidgetContainer.field_C.tryLoadAllGroups((byte) 79)) {
                        if (PasswordValidator.field_q.ensureIndexLoaded(-7957) &&
                          PasswordValidator.field_q.tryLoadAllGroups((byte) 79)) {
                          if (RegistrationAgreementPane.field_M.ensureIndexLoaded(-7957) &&
                            RegistrationAgreementPane.field_M.tryLoadAllGroups((byte) 79)) {
                            mh.a(DelegatingCanvas.field_a, (byte) -125, 65.0f);
                            if (!param0) {
                              return false;
                            }
                            bi.a(124);
                            this.drawFrame(7808);
                            ub.field_d = new SoundCache(DelegatingCanvas.field_d, SpriteLoader.field_f);
                            cg.field_a[0] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Btn_Chime").toPcmSample();
                            cg.field_a[1] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "menu_change_character").toPcmSample();
                            cg.field_a[2] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Slider").toPcmSample();
                            wl.field_c[0][0] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "H_Jump").toPcmSample();
                            wl.field_c[0][1] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Z_Jump").toPcmSample();
                            wl.field_c[0][2] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "D_Jump").toPcmSample();
                            wl.field_c[1][0] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "H_Land").toPcmSample();
                            wl.field_c[1][1] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Z_Land").toPcmSample();
                            wl.field_c[1][2] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "D_Land").toPcmSample();
                            wl.field_c[2][0] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "H_Slide").toPcmSample();
                            wl.field_c[2][1] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Z_Slide").toPcmSample();
                            wl.field_c[2][2] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "D_Slide").toPcmSample();
                            wl.field_c[3][0] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "H_Step1").toPcmSample();
                            wl.field_c[3][1] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Z_Step1").toPcmSample();
                            wl.field_c[3][2] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "D_Step1").toPcmSample();
                            wl.field_c[4][0] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "H_Step2").toPcmSample();
                            wl.field_c[4][1] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Z_Step2").toPcmSample();
                            wl.field_c[4][2] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "D_Step2").toPcmSample();
                            wl.field_c[5][0] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "H_Weapon_Death_Impact").toPcmSample();
                            wl.field_c[5][1] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Z_Weapon_Death_Impact").toPcmSample();
                            wl.field_c[5][2] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "D_Weapon_Death_Impact").toPcmSample();
                            TextHotspotBounds.field_i[0][AccountRegistrationPanel.field_T[1]][0] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Run_1_Death").toPcmSample();
                            TextHotspotBounds.field_i[0][AccountRegistrationPanel.field_T[1]][1] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Run_2_Death").toPcmSample();
                            TextHotspotBounds.field_i[0][AccountRegistrationPanel.field_T[1]][2] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Run_3_Death").toPcmSample();
                            TextHotspotBounds.field_i[2][AccountRegistrationPanel.field_T[1]][0] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Run_1_Step").toPcmSample();
                            TextHotspotBounds.field_i[2][AccountRegistrationPanel.field_T[1]][1] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Run_2_Step").toPcmSample();
                            TextHotspotBounds.field_i[2][AccountRegistrationPanel.field_T[1]][2] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Run_3_Step").toPcmSample();
                            TextHotspotBounds.field_i[3][AccountRegistrationPanel.field_T[1]][1] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Run_Jump").toPcmSample();
                            TextHotspotBounds.field_i[3][AccountRegistrationPanel.field_T[1]][2] = TextHotspotBounds.field_i[3][AccountRegistrationPanel.field_T[1]][1];
                            TextHotspotBounds.field_i[4][AccountRegistrationPanel.field_T[1]][1] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Run_land").toPcmSample();
                            TextHotspotBounds.field_i[4][AccountRegistrationPanel.field_T[1]][2] = TextHotspotBounds.field_i[4][AccountRegistrationPanel.field_T[1]][2];
                            TextHotspotBounds.field_i[0][AccountRegistrationPanel.field_T[2]][0] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Spitter_1_Death").toPcmSample();
                            TextHotspotBounds.field_i[0][AccountRegistrationPanel.field_T[2]][1] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Spitter_2_Death").toPcmSample();
                            TextHotspotBounds.field_i[0][AccountRegistrationPanel.field_T[2]][2] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Spitter_3_Death").toPcmSample();
                            TextHotspotBounds.field_i[2][AccountRegistrationPanel.field_T[2]][0] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Spitter_1_Step").toPcmSample();
                            TextHotspotBounds.field_i[2][AccountRegistrationPanel.field_T[2]][1] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Spitter_2_Step").toPcmSample();
                            TextHotspotBounds.field_i[2][AccountRegistrationPanel.field_T[2]][2] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Spitter_3_Step").toPcmSample();
                            TextHotspotBounds.field_i[4][AccountRegistrationPanel.field_T[2]][0] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Spitter_Land").toPcmSample();
                            TextHotspotBounds.field_i[4][AccountRegistrationPanel.field_T[2]][1] = TextHotspotBounds.field_i[4][AccountRegistrationPanel.field_T[2]][0];
                            TextHotspotBounds.field_i[4][AccountRegistrationPanel.field_T[2]][2] = TextHotspotBounds.field_i[4][AccountRegistrationPanel.field_T[2]][0];
                            TextHotspotBounds.field_i[6][AccountRegistrationPanel.field_T[2]][0] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Spitter_1_Spit").toPcmSample();
                            TextHotspotBounds.field_i[6][AccountRegistrationPanel.field_T[2]][1] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Spitter_2_Spit").toPcmSample();
                            TextHotspotBounds.field_i[6][AccountRegistrationPanel.field_T[2]][2] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Spitter_3_Spit").toPcmSample();
                            TextHotspotBounds.field_i[4][AccountRegistrationPanel.field_T[7]][0] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Spitter_1_Spit_Impact").toPcmSample();
                            TextHotspotBounds.field_i[4][AccountRegistrationPanel.field_T[7]][1] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Spitter_2_Spit_Impact").toPcmSample();
                            TextHotspotBounds.field_i[4][AccountRegistrationPanel.field_T[7]][2] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Spitter_3_Spit_Impact").toPcmSample();
                            TextHotspotBounds.field_i[0][AccountRegistrationPanel.field_T[3]][0] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Thud_1_Death").toPcmSample();
                            TextHotspotBounds.field_i[0][AccountRegistrationPanel.field_T[3]][1] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Thud_2_Death").toPcmSample();
                            TextHotspotBounds.field_i[0][AccountRegistrationPanel.field_T[3]][2] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Thud_3_Death").toPcmSample();
                            TextHotspotBounds.field_i[7][AccountRegistrationPanel.field_T[3]][2] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Thud_3_Charge_Step").toPcmSample();
                            TextHotspotBounds.field_i[4][AccountRegistrationPanel.field_T[3]][0] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Thud_Land").toPcmSample();
                            TextHotspotBounds.field_i[4][AccountRegistrationPanel.field_T[3]][1] = TextHotspotBounds.field_i[4][AccountRegistrationPanel.field_T[3]][0];
                            TextHotspotBounds.field_i[4][AccountRegistrationPanel.field_T[3]][2] = TextHotspotBounds.field_i[4][AccountRegistrationPanel.field_T[3]][0];
                            TextHotspotBounds.field_i[6][AccountRegistrationPanel.field_T[3]][1] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Thud_Rock_Throw").toPcmSample();
                            TextHotspotBounds.field_i[6][AccountRegistrationPanel.field_T[3]][2] = TextHotspotBounds.field_i[4][AccountRegistrationPanel.field_T[3]][1];
                            TextHotspotBounds.field_i[2][AccountRegistrationPanel.field_T[3]][0] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Thud_Step").toPcmSample();
                            TextHotspotBounds.field_i[2][AccountRegistrationPanel.field_T[3]][1] = TextHotspotBounds.field_i[2][AccountRegistrationPanel.field_T[3]][0];
                            TextHotspotBounds.field_i[2][AccountRegistrationPanel.field_T[3]][2] = TextHotspotBounds.field_i[2][AccountRegistrationPanel.field_T[3]][0];
                            TextHotspotBounds.field_i[4][AccountRegistrationPanel.field_T[22]][1] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Thud_Rock_Impact").toPcmSample();
                            TextHotspotBounds.field_i[4][AccountRegistrationPanel.field_T[22]][2] = TextHotspotBounds.field_i[4][AccountRegistrationPanel.field_T[22]][1];
                            TextHotspotBounds.field_i[0][AccountRegistrationPanel.field_T[4]][0] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Rocket_1_Death").toPcmSample();
                            TextHotspotBounds.field_i[0][AccountRegistrationPanel.field_T[4]][1] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Rocket_2_Death").toPcmSample();
                            TextHotspotBounds.field_i[0][AccountRegistrationPanel.field_T[4]][2] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Rocket_3_Death").toPcmSample();
                            TextHotspotBounds.field_i[1][AccountRegistrationPanel.field_T[4]][0] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Rocket_Roar_Loop").toPcmSample();
                            TextHotspotBounds.field_i[1][AccountRegistrationPanel.field_T[4]][1] = TextHotspotBounds.field_i[1][AccountRegistrationPanel.field_T[4]][0];
                            TextHotspotBounds.field_i[1][AccountRegistrationPanel.field_T[4]][2] = TextHotspotBounds.field_i[1][AccountRegistrationPanel.field_T[4]][1];
                            TextHotspotBounds.field_i[0][AccountRegistrationPanel.field_T[5]][0] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Slime_1_Death").toPcmSample();
                            TextHotspotBounds.field_i[0][AccountRegistrationPanel.field_T[5]][1] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Slime_2_Death").toPcmSample();
                            TextHotspotBounds.field_i[0][AccountRegistrationPanel.field_T[5]][2] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Slime_3_Death").toPcmSample();
                            TextHotspotBounds.field_i[2][AccountRegistrationPanel.field_T[5]][1] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Slime_2_Move").toPcmSample();
                            TextHotspotBounds.field_i[2][AccountRegistrationPanel.field_T[5]][2] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Slime_3_Move").toPcmSample();
                            TextHotspotBounds.field_i[5][AccountRegistrationPanel.field_T[5]][0] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Slime_Fall").toPcmSample();
                            TextHotspotBounds.field_i[5][AccountRegistrationPanel.field_T[5]][1] = TextHotspotBounds.field_i[5][AccountRegistrationPanel.field_T[5]][0];
                            TextHotspotBounds.field_i[5][AccountRegistrationPanel.field_T[5]][2] = TextHotspotBounds.field_i[5][AccountRegistrationPanel.field_T[5]][0];
                            TextHotspotBounds.field_i[4][AccountRegistrationPanel.field_T[5]][0] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Slime_Impact").toPcmSample();
                            TextHotspotBounds.field_i[4][AccountRegistrationPanel.field_T[5]][1] = TextHotspotBounds.field_i[4][AccountRegistrationPanel.field_T[5]][0];
                            TextHotspotBounds.field_i[4][AccountRegistrationPanel.field_T[5]][2] = TextHotspotBounds.field_i[4][AccountRegistrationPanel.field_T[5]][0];
                            TextHotspotBounds.field_i[0][AccountRegistrationPanel.field_T[6]][0] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Grinder_2_Death").toPcmSample();
                            TextHotspotBounds.field_i[4][AccountRegistrationPanel.field_T[6]][1] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Grinder_2_Wall_Impact").toPcmSample();
                            TextHotspotBounds.field_i[4][AccountRegistrationPanel.field_T[6]][2] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Grinder_3_Wall_Impact").toPcmSample();
                            bf.field_c[0][0] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Boss_1_Jump").toPcmSample();
                            bf.field_c[0][1] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Boss_1_Land").toPcmSample();
                            bf.field_c[0][2] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Boss_1_Miss_Combo").toPcmSample();
                            bf.field_c[0][3] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Boss_1_Step").toPcmSample();
                            bf.field_c[0][4] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Boss_1_Step2").toPcmSample();
                            bf.field_c[0][5] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Boss_1_Weapon_Impact").toPcmSample();
                            bf.field_c[1][0] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Boss_2_Jump").toPcmSample();
                            bf.field_c[1][1] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Boss_2_Land").toPcmSample();
                            bf.field_c[1][2] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Boss_2_Miss_Combo").toPcmSample();
                            bf.field_c[1][3] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Boss_2_Step").toPcmSample();
                            bf.field_c[1][5] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Boss_2_Weapon_Impact").toPcmSample();
                            bf.field_c[2][0] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Boss_3_Jump").toPcmSample();
                            bf.field_c[2][1] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Boss_3_Land").toPcmSample();
                            bf.field_c[2][2] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Boss_3_Miss_Combo").toPcmSample();
                            bf.field_c[2][3] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Boss_3_Step").toPcmSample();
                            bf.field_c[2][4] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Boss_3_Step2").toPcmSample();
                            bf.field_c[2][5] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Boss_3_Weapon_Impact").toPcmSample();
                            cj.field_h[0] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "collect1").toPcmSample();
                            cj.field_h[1] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "collect2").toPcmSample();
                            cj.field_h[2] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Exit_Door").toPcmSample();
                            cj.field_h[3] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Extra_HP").toPcmSample();
                            cj.field_h[4] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Extra_Life").toPcmSample();
                            cj.field_h[5] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Health_Drink").toPcmSample();
                            cj.field_h[6] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Help_Bubble").toPcmSample();
                            cj.field_h[7] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "seal_active").toPcmSample();
                            cj.field_h[8] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "seal_achieved").toPcmSample();
                            cj.field_h[9] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Timer").toPcmSample();
                            cj.field_h[10] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Timer_Ending").toPcmSample();
                            cj.field_h[11] = cj.field_h[7];
                            cj.field_h[12] = SynthesizedSoundEffect.loadByName(DelegatingCanvas.field_d, "", "Exit_Door_active").toPcmSample();
                            DelegatingCanvas.field_d = null;
                            id.a(62);
                            return false;
                          }
                          mh.a(DelegatingCanvas.a(256, "Loading Levels", "", RegistrationAgreementPane.field_M, "Waiting for Levels"), (byte) -125, 60.0f);
                          return false;
                        }
                        mh.a(DelegatingCanvas.a(256, ij.field_x, "", PasswordValidator.field_q, wf.field_a), (byte) -125, 60.0f);
                        return false;
                      }
                      mh.a(DelegatingCanvas.a(256, ra.field_m, "", SingleChildWidgetContainer.field_C, DraggableWidgetContainer.field_K), (byte) -125, 50.0f);
                      return false;
                    }
                    mh.a(DelegatingCanvas.a(256, DebouncedFieldValidator.field_e, "", fh.field_f, RegistrationAgreementPane.field_L), (byte) -125, 40.0f);
                    return false;
                  }
                  mh.a(ProxySocketConnector.a(RegistrationAgreementPane.field_L, cl.field_y, 0, 89, DebouncedFieldValidator.field_e), (byte) -125, 30.0f);
                  return false;
                }
                mh.a(DelegatingCanvas.a(256, ie.field_c, "", SpriteLoader.field_f, cb.field_a), (byte) -125, 20.0f);
                return false;
              }
              mh.a(DelegatingCanvas.a(256, ie.field_c, "", DelegatingCanvas.field_d, cb.field_a), (byte) -125, 10.0f);
              return false;
            }
            mh.a(DelegatingCanvas.a(256, ra.field_m, "basic", aj.field_f, DraggableWidgetContainer.field_K), (byte) -125, 3.0f);
            return false;
          }
          if (RegistrationAgreementPane.field_M != null) {
            je.field_c = new byte[cg.levelNames.length][];
            var3_int = 0;
            do {
              if (!(var3_int < je.field_c.length)) {
                RegistrationAgreementPane.field_M = null;
                id.a(108);
                break;
              }
              je.field_c[var3_int] = RegistrationAgreementPane.field_M.getFileByName(-2, cg.levelNames[var3_int], "");
              var3_int++;
            } while (var4 == 0);
            return false;
          }
          if (null != SpriteLoader.field_f) {
            mh.a(DelegatingCanvas.field_a, (byte) -125, 70.0f);
            this.drawFrame(7808);
            cg.field_a[3] = VorbisSample.loadByName(SpriteLoader.field_f, "", "Henhui_character_select").decodeAllToPcm();
            cg.field_a[4] = VorbisSample.loadByName(SpriteLoader.field_f, "", "Ziren_character_select").decodeAllToPcm();
            cg.field_a[5] = VorbisSample.loadByName(SpriteLoader.field_f, "", "Damen_character_select").decodeAllToPcm();
            cg.field_a[6] = VorbisSample.loadByName(SpriteLoader.field_f, "", "TOR_Challenge_Menu").decodeAllToPcm();
            cg.field_a[7] = VorbisSample.loadByName(SpriteLoader.field_f, "", "menu_character_selected_gong").decodeAllToPcm();
            cg.field_a[8] = VorbisSample.loadByName(SpriteLoader.field_f, "", "menu_TOWER").decodeAllToPcm();
            cg.field_a[9] = VorbisSample.loadByName(SpriteLoader.field_f, "", "menu_ONE").decodeAllToPcm();
            cg.field_a[10] = VorbisSample.loadByName(SpriteLoader.field_f, "", "menu_TWO").decodeAllToPcm();
            cg.field_a[11] = VorbisSample.loadByName(SpriteLoader.field_f, "", "menu_THREE").decodeAllToPcm();
            cg.field_a[12] = VorbisSample.loadByName(SpriteLoader.field_f, "", "menu_FOUR").decodeAllToPcm();
            cg.field_a[13] = VorbisSample.loadByName(SpriteLoader.field_f, "", "menu_FIVE").decodeAllToPcm();
            cg.field_a[14] = VorbisSample.loadByName(SpriteLoader.field_f, "", "menu_SIX").decodeAllToPcm();
            cg.field_a[15] = VorbisSample.loadByName(SpriteLoader.field_f, "", "menu_READY").decodeAllToPcm();
            cg.field_a[16] = VorbisSample.loadByName(SpriteLoader.field_f, "", "menu_YOU_LOSE").decodeAllToPcm();
            wl.field_c[6][0] = VorbisSample.loadByName(SpriteLoader.field_f, "", "H_Attack_1").decodeAllToPcm();
            wl.field_c[6][1] = VorbisSample.loadByName(SpriteLoader.field_f, "", "Z_Attack_1").decodeAllToPcm();
            wl.field_c[6][2] = VorbisSample.loadByName(SpriteLoader.field_f, "", "D_Attack_1").decodeAllToPcm();
            wl.field_c[7][0] = VorbisSample.loadByName(SpriteLoader.field_f, "", "H_Attack_2").decodeAllToPcm();
            wl.field_c[7][1] = VorbisSample.loadByName(SpriteLoader.field_f, "", "Z_Attack_2").decodeAllToPcm();
            wl.field_c[7][2] = VorbisSample.loadByName(SpriteLoader.field_f, "", "D_Attack_2").decodeAllToPcm();
            wl.field_c[8][0] = VorbisSample.loadByName(SpriteLoader.field_f, "", "H_Attack_3_combo").decodeAllToPcm();
            wl.field_c[8][1] = VorbisSample.loadByName(SpriteLoader.field_f, "", "Z_Attack_3_combo").decodeAllToPcm();
            wl.field_c[8][2] = VorbisSample.loadByName(SpriteLoader.field_f, "", "D_Attack_3_combo").decodeAllToPcm();
            wl.field_c[9][0] = VorbisSample.loadByName(SpriteLoader.field_f, "", "H_Attack_2_spec").decodeAllToPcm();
            wl.field_c[9][1] = VorbisSample.loadByName(SpriteLoader.field_f, "", "Z_Attack_2_spec").decodeAllToPcm();
            wl.field_c[9][2] = VorbisSample.loadByName(SpriteLoader.field_f, "", "D_Attack_2_spec").decodeAllToPcm();
            wl.field_c[10][0] = VorbisSample.loadByName(SpriteLoader.field_f, "", "H_Death").decodeAllToPcm();
            wl.field_c[10][1] = VorbisSample.loadByName(SpriteLoader.field_f, "", "Z_Death").decodeAllToPcm();
            wl.field_c[10][2] = VorbisSample.loadByName(SpriteLoader.field_f, "", "D_Death").decodeAllToPcm();
            wl.field_c[11][0] = VorbisSample.loadByName(SpriteLoader.field_f, "", "H_Hit_1").decodeAllToPcm();
            wl.field_c[11][1] = VorbisSample.loadByName(SpriteLoader.field_f, "", "Z_Hit_1").decodeAllToPcm();
            wl.field_c[11][2] = VorbisSample.loadByName(SpriteLoader.field_f, "", "D_Hit_1").decodeAllToPcm();
            wl.field_c[12][0] = VorbisSample.loadByName(SpriteLoader.field_f, "", "H_Hit_2").decodeAllToPcm();
            wl.field_c[12][1] = VorbisSample.loadByName(SpriteLoader.field_f, "", "Z_Hit_2").decodeAllToPcm();
            wl.field_c[12][2] = VorbisSample.loadByName(SpriteLoader.field_f, "", "D_Hit_2").decodeAllToPcm();
            wl.field_c[13][0] = VorbisSample.loadByName(SpriteLoader.field_f, "", "H_Hit_3").decodeAllToPcm();
            wl.field_c[13][1] = VorbisSample.loadByName(SpriteLoader.field_f, "", "Z_Hit_3").decodeAllToPcm();
            wl.field_c[13][2] = VorbisSample.loadByName(SpriteLoader.field_f, "", "D_Hit_3").decodeAllToPcm();
            bf.field_c[0][6] = VorbisSample.loadByName(SpriteLoader.field_f, "", "Boss_1_Attack_combo").decodeAllToPcm();
            bf.field_c[0][7] = VorbisSample.loadByName(SpriteLoader.field_f, "", "Boss_1_Death").decodeAllToPcm();
            bf.field_c[0][8] = VorbisSample.loadByName(SpriteLoader.field_f, "", "Boss_1_Hit").decodeAllToPcm();
            bf.field_c[1][6] = VorbisSample.loadByName(SpriteLoader.field_f, "", "Boss_2_Attack_combo").decodeAllToPcm();
            bf.field_c[1][7] = VorbisSample.loadByName(SpriteLoader.field_f, "", "Boss_2_Death").decodeAllToPcm();
            bf.field_c[1][8] = VorbisSample.loadByName(SpriteLoader.field_f, "", "Boss_2_Hit").decodeAllToPcm();
            bf.field_c[2][6] = VorbisSample.loadByName(SpriteLoader.field_f, "", "Boss_3_Attack_combo").decodeAllToPcm();
            bf.field_c[2][7] = VorbisSample.loadByName(SpriteLoader.field_f, "", "Boss_3_Death").decodeAllToPcm();
            bf.field_c[2][8] = VorbisSample.loadByName(SpriteLoader.field_f, "", "Boss_3_Hit").decodeAllToPcm();
            SpriteLoader.field_f = null;
            id.a(102);
            return false;
          }
          if (null != fh.field_f) {
            mh.a(wc.field_a, (byte) -125, 75.0f);
            this.drawFrame(7808);
            DiskArchiveRequest.field_x[0] = MusicTrack.load(fh.field_f, "", "TOR_Lvl_1");
            DiskArchiveRequest.field_x[1] = MusicTrack.load(fh.field_f, "", "TOR_Lvl_2");
            DiskArchiveRequest.field_x[2] = MusicTrack.load(fh.field_f, "", "TOR_Lvl_3");
            DiskArchiveRequest.field_x[3] = MusicTrack.load(fh.field_f, "", "TOR_Lvl_4");
            DiskArchiveRequest.field_x[4] = MusicTrack.load(fh.field_f, "", "TOR_Lvl_5");
            DiskArchiveRequest.field_x[5] = MusicTrack.load(fh.field_f, "", "TOR_Lvl_6");
            DiskArchiveRequest.field_x[6] = MusicTrack.load(fh.field_f, "", "TOR_Boss_Fight");
            DiskArchiveRequest.field_x[7] = MusicTrack.load(fh.field_f, "", "TOR_Title");
            DiskArchiveRequest.field_x[8] = MusicTrack.load(fh.field_f, "", "TOR_Menu");
            DiskArchiveRequest.field_x[9] = MusicTrack.load(fh.field_f, "", "TOR_lvl_start_jingle");
            DiskArchiveRequest.field_x[10] = MusicTrack.load(fh.field_f, "", "TOR_lvl_complete_jingle");
            DiskArchiveRequest.field_x[11] = MusicTrack.load(fh.field_f, "", "TOR_boss_complete_jingle");
            DiskArchiveRequest.field_x[12] = MusicTrack.load(fh.field_f, "", "TOR_game_over_jingle");
            DiskArchiveRequest.field_x[13] = MusicTrack.load(fh.field_f, "", "TOR_Complete");
            fh.field_f = null;
            id.a(126);
            return false;
          }
          if (cl.field_y != null) {
            var3_int = 0;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (14 <= var3_int))) {
              stackIn_99_0 = null;
              if (var4 == 0) {
                if (stackIn_99_0 != DiskArchiveRequest.field_x[var3_int] &&
                  !SectorCacheStore.field_a.prepareTrackSamples(false, ub.field_d, DiskArchiveRequest.field_x[var3_int], cl.field_y, 176400)) {
                  return false;
                }
                var3_int++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              SectorCacheStore.field_a.releasePatchSampleIds(true);
              cl.field_y = null;
              stackIn_99_0 = null;
            }
            ub.field_d = (SoundCache) (stackIn_99_0);
            id.a(47);
            return false;
          }
          if (aj.field_f != null) {
            je.field_b = qk.a("basic", "unachieved", aj.field_f, 0);
            DefaultTextWidgetRenderer.field_f = qk.a("basic", "orbcoin", aj.field_f, 0);
            hb.field_c = qk.a("basic", "locked", aj.field_f, 0);
            IterableNodeHashTable.a((byte) -44, je.field_b);
            IterableNodeHashTable.a((byte) -44, DefaultTextWidgetRenderer.field_f);
            IterableNodeHashTable.a((byte) -44, hb.field_c);
            ul.a(aj.field_f, -1656370552, FullscreenFocusCanvas.field_g);
            aj.field_f = null;
            id.a(51);
            return false;
          }
          if (SingleChildWidgetContainer.field_C != null) {
            mh.a(ArchiveNetworkClient.field_e, (byte) -125, 90.0f);
            this.drawFrame(7808);
            this.t(1);
            SingleChildWidgetContainer.field_C = null;
            PasswordValidator.field_q = null;
            id.a(67);
            return false;
          }
          if (param0) {
            GrowableIntArray.b((byte) -98);
            var3_int = 0;
            while (true) {
              if (16 > var3_int) {
                GameApplet.screens[var3_int] = new GameScreen(var3_int, this);
                var3_int++;
                if (var4 == 0) {
                  continue;
                }
              } else {
                PcmOutputWorker.activeScreenId = 12;
                DefaultTextWidgetRenderer.field_o = 12;
                GameApplet.screens[12].a(3, true);
                DiskArchiveRequest.b(50, true);
                SoundCache.a((byte) 102, 50);
                o.a(-126, 50);
              }
              if (GameClientBase.p(-83)) {
                break;
              }
              qa.field_g = be.a(4, 31315);
              vh.field_d = new tc[3];
              vh.field_d[0] = ResizableModalDialog.b(1, 256, 5, 0);
              vh.field_d[1] = ResizableModalDialog.b(1, 256, 5, 1);
              vh.field_d[2] = ResizableModalDialog.b(1, 256, 5, 2);
              eb.field_l = kk.b(6, -6262);
              break;
            }
          }
          if (param1 <= 34) {
            TorChallenge.q(-52);
          }
          id.a(60);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oj.wrapException((Throwable) ((Object) var3), "TorChallenge.F(" + param0 + ',' + param1 + ')');
        }
    }

    private final void u(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = field_F ? 1 : 0;
        try {
          if (param0 != 0) {
            field_H = (ModalDialogHost) null;
          }
          if (DiskCacheWorker.field_b != 0) {
            if (DiskCacheWorker.field_b != 1) {
              if (DiskCacheWorker.field_b != 2) {
                if (hk.field_e > 0) {
                  hk.field_e = hk.field_e - 1;
                }
                if (0 > hk.field_e) {
                  hk.field_e = 0;
                }
                if (hk.field_e != 0) {
                  return;
                }
                DiskCacheWorker.field_b = 0;
                if (var3 == 0) {
                  return;
                }
              }
              boolean decompiledFrameRemainder0 = true;
              if (GameClientBase.p(-115)) {
                DefaultTextWidgetRenderer.field_o = GrowableIntArray.field_h;
                decompiledFrameRemainder0 = (var3 != 0);
              }
              if (decompiledFrameRemainder0) {
                qa.field_g = be.a(4, param0 ^ 31315);
                vh.field_d = new tc[4];
                vh.field_d[0] = ResizableModalDialog.b(1, TorChallenge.a(param0, 256), 5, 0);
                vh.field_d[1] = ResizableModalDialog.b(1, 256, 5, 1);
                vh.field_d[2] = ResizableModalDialog.b(1, 256, 5, 2);
                eb.field_l = kk.b(6, param0 - 6262);
                if (null != ji.field_m) {
                  SocketConnector.field_a = true;
                  DirectByteStorage.a(true, true, false);
                }
                if (ji.field_m != null) {
                  ji.field_m.c((byte) -66);
                }
                DefaultTextWidgetRenderer.field_o = ResourceArchive.field_e;
                if (DefaultTextWidgetRenderer.field_o == -2) {
                  DefaultTextWidgetRenderer.field_o = 0;
                  EmailFormatValidator.a(false, 0);
                }
              }
              DiskCacheWorker.field_b = 3;
              hk.field_e = 31;
              PcmOutputWorker.activeScreenId = DefaultTextWidgetRenderer.field_o;
              if (var3 == 0) {
                return;
              }
            }
            hk.field_e = hk.field_e + 1;
            if (32 != hk.field_e) {
              return;
            }
            if (vc.a(0)) {
              vl.a((byte) -88);
              if (var3 != 0) {
                EditableTextField.f((byte) -83);
              }
            } else {
              EditableTextField.f((byte) -83);
            }
            DiskCacheWorker.field_b = 2;
            if (var3 == 0) {
              return;
            }
          }
          if (DefaultTextWidgetRenderer.field_o != PcmOutputWorker.activeScreenId) {
            hk.field_e = hk.field_e + 1;
            if (16 <= hk.field_e &&
              DefaultTextWidgetRenderer.field_o == 3 &&
              PcmOutputWorker.activeScreenId == 1 &&
              DirectByteStorage.field_g) {
              if (EditableTextField.field_Q >= 0 &&
                ~ContentTransitionDialog.field_jb != ~EditableTextField.field_Q) {
                ContentTransitionDialog.field_jb = EditableTextField.field_Q;
                if (var3 != 0) {
                  ContentTransitionDialog.field_jb = 0;
                }
              } else {
                ContentTransitionDialog.field_jb = 0;
              }
              DirectByteStorage.field_g = false;
              if (!(DequeWidgetContainer.field_A >= 0) ||
                AccountNameAvailabilityValidator.field_r == DequeWidgetContainer.field_A) {
                AccountNameAvailabilityValidator.field_r = 0;
                if (var3 != 0) {
                  AccountNameAvailabilityValidator.field_r = DequeWidgetContainer.field_A;
                }
              } else {
                AccountNameAvailabilityValidator.field_r = DequeWidgetContainer.field_A;
              }
            }
            if (32 != hk.field_e) {
              return;
            }
            if (DefaultTextWidgetRenderer.field_o == 2) {
              rc.field_r = null;
            }
            if (DefaultTextWidgetRenderer.field_o == 1) {
              vd.b(0);
            }
            DefaultTextWidgetRenderer.field_o = PcmOutputWorker.activeScreenId;
            cf.field_b = DefaultTextWidgetRenderer.field_o;
            hk.field_e = 0;
            if (DefaultTextWidgetRenderer.field_o != 0) {
              return;
            }
            if (!cj.field_e) {
              return;
            }
            h.a(6, 4);
            cj.field_e = false;
            if (var3 == 0) {
              return;
            }
          }
          if (DefaultTextWidgetRenderer.field_o != -1) {
            if (8 == DefaultTextWidgetRenderer.field_o ||
              DefaultTextWidgetRenderer.field_o == 9) {
              GameApplet.screens[8].f(9504);
              GameApplet.screens[9].f(9504);
              if (var3 == 0) {
                return;
              }
            }
            if (DefaultTextWidgetRenderer.field_o == 10 ||
              11 == DefaultTextWidgetRenderer.field_o) {
              GameApplet.screens[10].f(9504);
              GameApplet.screens[11].f(9504);
              if (var3 == 0) {
                return;
              }
            }
            if (3 != DefaultTextWidgetRenderer.field_o) {
              GameApplet.screens[DefaultTextWidgetRenderer.field_o].f(9504);
              if (var3 == 0) {
                return;
              }
            }
            GameApplet.screens[3].f(9504);
            GameApplet.screens[14].f(9504);
            if (var3 == 0) {
              return;
            }
          }
          ji.field_m.a(param0 + 21);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.wrapException((Throwable) ((Object) var2), "TorChallenge.O(" + param0 + ')');
        }
    }

    final void disposeClient(int param0) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          ae.a(4);
          if (gi.field_d != null) {
            ij.c((byte) -94);
          }
          var2_int = -126 / ((11 - param0) / 36);
          rl.c(-94);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.wrapException((Throwable) ((Object) var2), "TorChallenge.J(" + param0 + ')');
        }
    }

    private final void b(boolean param0) {
        Sprite[] array$0 = null;
        Sprite[] array$1 = null;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_34_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var6Lifetime1;
        int var7Lifetime1;
        var9 = field_F ? 1 : 0;
        try {
          var2_int = g.a(124, 0) ? 1 : 0;
          this.d(83, var2_int != 0);
          re.field_x[AccountRegistrationPanel.field_T[2]] = SpriteLoader.a(-128, "spitter", "", SingleChildWidgetContainer.field_C);
          qb.a((byte) 69, re.field_x[AccountRegistrationPanel.field_T[2]]);
          re.field_x[AccountRegistrationPanel.field_T[7]] = SpriteLoader.a(-127, "spittle", "", SingleChildWidgetContainer.field_C);
          qb.a((byte) 85, re.field_x[AccountRegistrationPanel.field_T[7]]);
          if (!param0) {
            this.tickGame((byte) 102);
          }
          re.field_x[AccountRegistrationPanel.field_T[3]] = SpriteLoader.a(-127, "thudder", "", SingleChildWidgetContainer.field_C);
          qb.a((byte) 46, re.field_x[AccountRegistrationPanel.field_T[3]]);
          re.field_x[AccountRegistrationPanel.field_T[4]] = SpriteLoader.a(-127, "rocketeer", "", SingleChildWidgetContainer.field_C);
          qb.a((byte) 114, re.field_x[AccountRegistrationPanel.field_T[4]]);
          re.field_x[AccountRegistrationPanel.field_T[5]] = SpriteLoader.a(-127, "slimer", "", SingleChildWidgetContainer.field_C);
          qb.a((byte) 65, re.field_x[AccountRegistrationPanel.field_T[5]]);
          re.field_x[AccountRegistrationPanel.field_T[6]] = SpriteLoader.a(-127, "grinder", "", SingleChildWidgetContainer.field_C);
          qb.a((byte) 21, re.field_x[AccountRegistrationPanel.field_T[6]]);
          re.field_x[AccountRegistrationPanel.field_T[22]] = SpriteLoader.a(-128, "rock", "", SingleChildWidgetContainer.field_C);
          qb.a((byte) 56, re.field_x[AccountRegistrationPanel.field_T[22]]);
          var3 = new int[8];
          var4 = new int[8];
          var5 = 0;
          do {
            if (var5 >= 8) {
              var5 = 0;
              break;
            }
            var3[var5] = re.field_x[var5].length / 8;
            var4[var5] = var3[var5] / 3;
            var5++;
          } while (var9 == 0);
          while (true) {
            stackIn_12_0 = 8;
            boolean decompiledFrameRemainder0 = true;
            if (stackIn_12_0 > var5) {
              stackIn_32_0 = 1;
              decompiledFrameRemainder0 = (var9 == 0);
              if (decompiledFrameRemainder0) {
                var6 = stackIn_32_0;
                scanLoop1: while (true) {
                  stackIn_16_0 = ~var6;
                  if (stackIn_16_0 > -9) {
                    stackIn_12_0 = 0;
                    var7 = stackIn_12_0;
                    while (var7 < 3) {
                      array$0 = new Sprite[h.field_b[var6][var5][var7]];
                      ah.field_d[var5][var6][var7] = array$0;
                      stackIn_16_0 = 0;
                      var8 = stackIn_16_0;
                      while (h.field_b[var6][var5][var7] > var8) {
                        ah.field_d[var5][var6][var7][var8] = re.field_x[var5][var8 + var7 * var4[var5] + var6 * var3[var5]];
                        var8++;
                      }
                      var7++;
                    }
                    var6++;
                    continue scanLoop1;
                  }
                  break;
                }
                var5++;
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              stackIn_32_0 = 0;
            }
            var5 = stackIn_32_0;
            scanLoop2: while (true) {
              stackIn_34_0 = var5;
              if (stackIn_34_0 < 8) {
                if (var9 != 0) {
                  return;
                }
                var6Lifetime1 = 0;
                while (var6Lifetime1 < 3) {
                  array$1 = new Sprite[h.field_b[0][var5][var6Lifetime1]];
                  ah.field_d[var5][0][var6Lifetime1] = array$1;
                  stackIn_34_0 = 0;
                  var7Lifetime1 = stackIn_34_0;
                  while (var7Lifetime1 < h.field_b[0][var5][var6Lifetime1]) {
                    ah.field_d[var5][0][var6Lifetime1][var7Lifetime1] = ah.field_d[var5][1][var6Lifetime1][var7Lifetime1];
                    var7Lifetime1++;
                  }
                  var6Lifetime1++;
                }
                var5++;
                continue scanLoop2;
              }
              break;
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.wrapException((Throwable) ((Object) var2), "TorChallenge.M(" + param0 + ')');
        }
    }

    final static boolean r(int param0) {
        RuntimeException var1 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1592) {
            field_H = (ModalDialogHost) null;
          }
          stackIn_4_0 = eb.field_m;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.wrapException((Throwable) ((Object) var1), "TorChallenge.I(" + param0 + ')');
        }
    }

    final void clearClientResources(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          TorChallenge.q(1);
          IntrusiveDeque.resetStaticState(25840);
          ResourceArchive.clearStaticReferences(11446);
          ki.clearStaticReferences(64);
          ea.clearStaticReferences((byte) -106);
          sd.clearStaticReferences((byte) -55);
          ac.b(-93);
          id.clearStaticReferences(false);
          gb.clearStaticReferences(123);
          kf.resetStaticState((byte) -100);
          GameClientBase.h(127);
          ClientException.clearStaticReferences(640);
          GameApplet.a((byte) -57);
          we.a(25910);
          GameKeyHandler.clearStaticReferences((byte) -36);
          MouseInputHandler.clearStaticReferences((byte) -79);
          MouseWheelInput.a(-117);
          if (param0 < 103) {
            TorChallenge.a((String) null, true, -106, 32, (String) null, (String) null, -51);
          }
          SoftwareRasterizer.clearStaticReferences();
          BitmapFont.clearStaticReferences();
          qc.a((byte) 26);
          nk.clearStaticReferences(250);
          PacketBuffer.clearStaticReferences(128);
          ol.clearStaticReferences((byte) -99);
          mb.clearStaticReferences((byte) -116);
          ik.clearStaticReferences(true);
          c.b(0);
          ub.clearStaticReferences((byte) -52);
          hk.clearStaticReferences(0);
          wj.clearStaticReferences(23801);
          pl.resetStaticState((byte) -74);
          bf.a(-14471);
          wh.resetStaticState(false);
          ve.clearStaticReferences(-126);
          gi.clearStaticReferences(10);
          FrameTimer.clearStaticReferences(118);
          RasterBuffer.clearStaticReferences(-15721);
          r.clearStaticReferences((byte) 96);
          FullscreenFocusCanvas.clearStaticReferences(0);
          cd.clearStaticReferences((byte) 79);
          SoundCache.clearStaticReferences(-26193);
          GameScreen.k(1);
          wl.b(10);
          SpriteLoader.clearStaticReferences(-89);
          qb.a(2316);
          vd.clearStaticReferences(-38);
          ArchiveNetworkClient.resetStaticState(0);
          DiskCacheWorker.clearStaticReferences(-98);
          ArchiveSourceManager.clearStaticReferences(122);
          BufferedCacheFile.clearStaticReferences(true);
          BufferedSocket.resetStaticState(true);
          IntrusiveNode.clearStaticReferences((byte) -92);
          MidiPcmStream.c(128);
          MusicPatchNode.clearStaticReferences(false);
          MidiFileReader.clearStaticReferences();
          MusicPatchPcmStream.c(16);
          AudioOutput.clearStaticReferences();
          CrossfadingMidiPcmStream.b(false);
          a.clearStaticReferences((byte) 106);
          rl.clearStaticReferences((byte) -82);
          rc.b(true);
          h.clearStaticReferences(38);
          ec.clearStaticReferences(-1);
          ck.clearStaticReferences(255);
          LevelEntity.d(true);
          ra.clearStaticReferences((byte) 125);
          tf.clearStaticReferences((byte) 106);
          GzipDecoder.clearStaticReferences((byte) 102);
          kl.clearStaticReferences(-102);
          le.clearStaticReferences(true);
          mg.a((byte) 113);
          vj.clearStaticReferences((byte) 95);
          ModalDialogHost.clearDeclaredStaticReferences((byte) 69);
          AccountCreationResultPanel.resetDeclaredStaticReferences(255);
          ProgressDialog.releaseDeclaredStaticReferences(4210752);
          StandardContentDialog.discardDeclaredStaticReferences(-118);
          ProgressMessageDialog.discardDeclaredStaticReferences(104);
          AccountRegistrationPanel.clearDeclaredStaticReferences(-110);
          GuestPlayConfirmationForm.resetDeclaredStaticState(99);
          LoginPanel.clearDeclaredStaticReferences((byte) -86);
          DisplayNameSelectionPanel.clearStaticReferences(false);
          qa.a(-1);
          dk.a(23592);
          tj.clearStaticReferences(120);
          SynthesizerVoice.clearStaticReferences();
          VorbisSample.clearStaticReferences();
          VorbisFloor.clearStaticReferences();
          sa.a((byte) 104);
          ok.a(32097);
          jj.clearStaticReferences((byte) 124);
          de.a((byte) 103);
          hh.clearStaticReferences((byte) 126);
          pa.clearDeclaredStaticReferences(6);
          bi.clearStaticReferences(0);
          jc.clearStaticReferences(-108);
          SpriteState.clearStaticReferences(false);
          DualLinkNode.b((byte) 68);
          PolygonScanlineState.clearStaticReferences();
          vl.clearStaticReferences(0);
          jh.a(-14282);
          ah.clearStaticReferences(44);
          am.clearStaticReferences(98);
          t.clearDeclaredStaticReferences(68);
          cg.clearStaticReferences((byte) -13);
          aj.clearStaticReferences(0);
          fh.resetStaticState((byte) -88);
          wi.clearStaticReferences(1);
          ByteStorage.a(8727);
          wc.clearStaticReferences((byte) -48);
          Bzip2Decompressor.clearStaticReferences();
          Bzip2State.clearStaticReferences(-113);
          IsaacRandom.resetStaticState(91);
          PcmOutputWorker.clearStaticReferences(6);
          SocketArchiveNetworkClient.clearStaticReferences(-25984);
          ii.b(16711680);
          NetworkArchiveRequest.clearStaticReferences(117);
          SectorCacheStore.clearStaticReferences((byte) -64);
          DiskArchiveRequest.clearDeclaredStaticReferences((byte) 99);
          di.clearStaticReferences(false);
          RandomAccessCacheFile.clearStaticReferences(0);
          ai.resetStaticState(2048);
          ArchiveRequest.b(true);
          cb.clearStaticReferences(-9386);
          FullscreenStatusDialog.releaseDeclaredStaticReferences(-25725);
          te.a((byte) -50);
          DefaultTextWidgetRenderer.a((byte) 46);
          oc.clearStaticReferences();
          nb.clearStaticReferences(-128);
          ti.a(true);
          vg.clearStaticReferences(606002657);
          pi.b((byte) -119);
          mh.clearStaticReferences((byte) -55);
          oj.a(106);
          ch.clearStaticReferences(false);
          af.a(-7604);
          kg.clearStaticReferences(-8796);
          aa.a(2432);
          DelegatingCanvas.clearStaticReferences(false);
          vc.clearStaticReferences(false);
          gh.clearStaticReferences(-16742);
          LevelDecoder.clearStaticReferences(3);
          ob.clearStaticReferences(887316838);
          mc.a(false);
          ga.resetStaticState((byte) -79);
          g.clearStaticReferences(28215);
          ph.clearStaticReferences(2);
          TextLayout.a(-27840);
          UiComponent.clearStaticReferences(107);
          InteractiveWidget.clearStaticReferences(true);
          SingleChildWidgetContainer.clearDeclaredStaticReferences(1);
          ResizableModalDialog.clearStaticReferences(false);
          ModalDialog.clearDeclaredStaticReferences(0);
          DequeWidgetContainer.resetStaticState(-10365);
          nj.b((byte) -40);
          pf.resetStaticState(0);
          oh.clearStaticReferences(-4);
          lh.clearStaticReferences(116);
          cj.resetStaticState(0);
          sf.a(false);
          je.clearStaticReferences(-98);
          hl.clearStaticReferences(-106);
          ca.clearStaticReferences(32);
          ba.clearStaticReferences((byte) -5);
          ie.a((byte) 33);
          SocketConnector.clearStaticReferences(-26425);
          ProxyAuthenticationRequiredException.clearStaticReferences(-38);
          NanoFrameTimer.clearStaticReferences((byte) 126);
          ImageProducerRasterBuffer.d(15752);
          ja.clearStaticReferences(75);
          MidiNoteMask.clearStaticReferences(2);
          ua.clearStaticReferences(102);
          ul.resetStaticState(-31397);
          td.c(0);
          MusicPatch.clearStaticReferences(1012);
          MusicPatchEnvelope.a(true);
          LabeledWidgetContainer.releaseDeclaredStaticReferences(0);
          ValidatedTextField.resetStaticState((byte) 96);
          EditableTextField.clearDeclaredStaticReferences(65);
          ContentTransitionDialog.releaseDeclaredStaticReferences(5);
          StripedProgressWidget.clearDeclaredStaticReferences((byte) 123);
          NameSuggestionsPanel.c(true);
          RichTextWidget.clearDeclaredStaticReferences(-1);
          ValidationStatusIcon.clearDeclaredStaticReferences((byte) 87);
          ValidationStatusWidget.g(112);
          hc.clearDeclaredStaticReferences(-110);
          wf.clearStaticReferences((byte) -116);
          RegistrationAgreementPane.clearDeclaredStaticReferences((byte) -36);
          uc.clearDeclaredStaticReferences(-15087);
          bl.e(false);
          SoundFilter.clearStaticReferences();
          be.clearStaticReferences(3366);
          DirectByteStorage.resetStaticState(10166);
          RichTextLayout.clearStaticReferences(-3);
          GrowableIntArray.a(128);
          DraggableWidgetContainer.clearDeclaredStaticReferences((byte) 50);
          k.clearStaticReferences(true);
          IterableNodeHashTable.clearStaticReferences(0);
          SecondaryNodeDeque.resetStaticState((byte) -103);
          lb.d(18972);
          re.e((byte) -114);
          ProxySocketConnector.clearDeclaredStaticReferences(67);
          qf.clearStaticReferences((byte) 75);
          NodeHashTableIterator.b(-1);
          SecondaryNodeDequeIterator.b(640);
          ae.resetStaticState(true);
          ji.clearStaticReferences(65535);
          vk.clearStaticReferences(68);
          e.b((byte) -83);
          o.resetStaticState(true);
          cl.clearStaticReferences((byte) 110);
          me.clearStaticReferences(-13978);
          fk.resetStaticState((byte) -88);
          ij.clearStaticReferences(42);
          hf.clearStaticReferences(19199);
          AlphaWidgetContainer.h(-1);
          qk.clearStaticReferences(false);
          ue.clearDeclaredStaticReferences((byte) 126);
          ni.clearStaticReferences(true);
          ql.clearStaticReferences(4707);
          rd.clearDeclaredStaticReferences((byte) -60);
          tc.clearStaticReferences(127);
          bk.clearDeclaredStaticReferences((byte) -128);
          eb.clearStaticReferences(237);
          eh.c((byte) 121);
          AccountRequestState.clearStaticReferences((byte) -116);
          AccountServiceResult.b(-124);
          vh.clearStaticReferences(-44);
          cf.clearStaticReferences(-113);
          lc.clearDeclaredStaticReferences((byte) -75);
          DialogMessagePane.clearDeclaredStaticReferences(15638);
          hb.clearStaticReferences(false);
          na.releaseDeclaredStaticReferences(-7345);
          ri.clearStaticReferences(12);
          kk.clearStaticReferences(61);
          FullscreenNoticeType.clearStaticReferences(256);
          kd.resetStaticState(8192);
          gj.clearStaticReferences(-909082559);
          TextLineMetrics.clearStaticReferences((byte) -81);
          AccountNameAvailabilityValidator.clearStaticReferences(-14298);
          PasswordValidator.resetStaticState(1);
          EmailFormatValidator.clearStaticReferences(8);
          ConfirmedEmailAvailabilityValidator.d((byte) 102);
          AgeValidator.clearStaticReferences(68);
          MatchingFieldValidator.clearDeclaredStaticReferences((byte) -113);
          p.a(true);
          TextHotspotBounds.clearDeclaredStaticReferences((byte) 79);
          rj.a(10);
          DebouncedFieldValidator.clearStaticReferences((byte) -125);
          vi.a(-57);
          this.field_w = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.wrapException((Throwable) ((Object) var2), "TorChallenge.P(" + param0 + ')');
        }
    }

    static {
        field_I = null;
        field_E = 0;
        field_G = 640;
    }
}
