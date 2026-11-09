/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class ShatteredPlansClient extends GameClientShell {
    static int[] field_E;
    static SecondaryNodeHashTable field_H;
    static String field_L;
    private IntrusiveDeque field_G;
    static boolean field_K;
    static String field_J;
    private int field_I;
    public static boolean field_F;

    final static boolean a(int param0, long param1, String param2) {
        ve var4 = null;
        RuntimeException var4_ref = null;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 16) {
            return false;
          }
          var4 = NodeSequence.a((byte) -90, param2);
          if (var4 != null &&
            var4.field_xb != null) {
            return true;
          }
          stackIn_12_0 = (null != np.field_a) && (ik.a(-101, param1) != null);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_15_0 = var4_ref;
          stackIn_15_1 = new StringBuilder().append("ShatteredPlansClient.KA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void shutdown(boolean param0) {
        if (param0) {
          this.update(-37);
        }
        GameApplet.closeAudioPlayers(120);
        if (null != NameSuggestionsPanel.field_K) {
          BufferedCacheFile.c(0);
        }
        Dialog.f((byte) 89);
    }

    final void initialise(int param0) {
        this.initialiseShell(param0 + 257, 1, 14, 25, false, 0, 2, 4);
        MusicCrossfadeStream var3 = new MusicCrossfadeStream();
        var3.field_u.d(128, (byte) -110, 9);
        var3.field_r.d(128, (byte) -110, 9);
        var3.field_u.setMasterVolume(598, wm.field_b);
        var3.field_r.setMasterVolume(param0 ^ -599, wm.field_b);
        DebouncedValidator.a((java.awt.Component) ((Object) tm.field_i), ValidatedTextInputWidget.field_W, var3, 1102, false, 22050, 22050, true);
        IterableNodeHashTable.field_b = 2458760;
        wo.field_a = 2805974;
        ProductionContent.field_j = 2458760;
        ih.field_b = 2458760;
        ValidationMessageWidget.field_P = 2458760;
        StarAnnotation.field_n = 2805974;
        ProductionContent.a(us.b(0), 1);
        this.allowOpcodeGroups(false, true, -2839, true, true, false, false);
        SliderWidget.field_K = TaskAi.field_a;
        ae.field_a[71] = 4;
        ae.field_a[74] = -2;
        ae.field_a[58] = -2;
        ae.field_a[10] = -1;
        ae.field_a[63] = 1;
        ae.field_a[69] = 1;
        ae.field_a[64] = 1;
        ae.field_a[72] = 0;
        ae.field_a[70] = -2;
        ae.field_a[67] = -2;
        ae.field_a[9] = -1;
        ae.field_a[73] = 3;
        ae.field_a[66] = 15;
        ae.field_a[68] = param0;
        NodeHashTableIterator.field_h = MouseInputHandler.field_f;
        ae.field_a[62] = 1;
        ae.field_a[61] = 1;
        ae.field_a[65] = 1;
    }

    final void update(int param0) {
        try {
          int fieldTemp$0 = 0;
          int fieldTemp$1 = 0;
          int var11_int = 0;
          boolean stackIn_7_1 = false;
          boolean stackIn_45_1 = false;
          boolean stackIn_46_2 = false;
          int stackIn_97_0 = 0;
          int stackIn_97_1 = 0;
          int stackIn_102_0 = 0;
          int stackIn_105_0 = 0;
          GameSession stackIn_111_0 = null;
          GameScreen stackIn_114_0 = null;
          int stackIn_118_0 = 0;
          GameSession stackIn_126_0 = null;
          boolean stackIn_127_1 = false;
          int stackIn_150_0 = 0;
          int stackIn_150_1 = 0;
          int stackIn_167_0 = 0;
          int stackIn_172_0 = 0;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          int var2 = 0;
          int var3 = 0;
          lq var3_ref_lq = null;
          Object var4_ref = null;
          int var4 = 0;
          GameRules var5_ref_vr = null;
          int var5 = 0;
          int var6 = 0;
          int var7 = 0;
          int var8 = 0;
          int var9 = 0;
          String[] var10 = null;
          GameSession var11 = null;
          GameScreen var12 = null;
          GameSession var13 = null;
          int var14 = 0;
          MapGenerationException var15 = null;
          InvalidMapConnectionException var15_ref = null;
          Exception var15_ref2 = null;
          int var16 = 0;
          int stackIn_97_0Lifetime1;
          int stackIn_97_1Lifetime1;
          int var3Lifetime1;
          var16 = field_F ? 1 : 0;
          po.b(-87);
          GalaxyMap.field_f = po.b(-80);
          ql.a(-26848);
          if (null != NameSuggestionsPanel.field_K &&
            NameSuggestionsPanel.field_K.field_c) {
            BufferedCacheFile.c(0);
            GameScreen.g(4);
          }
          stackIn_7_1 = (null != NameSuggestionsPanel.field_K);
          this.a(stackIn_7_1, 77);
          if (PlayerStats.field_n) {
            this.c(false);
            PlayerStats.field_n = false;
          }
          RasterStateFrame.field_n = RasterStateFrame.field_n + 1;
          if (uf.a(false)) {
            this.j((byte) -123);
            if (uf.a(false)) {
              if (ik.field_h) {
                return;
              }
              if (QuaternaryNodeList.b(91)) {
                ik.field_h = this.c(82, false);
              }
              return;
            }
          }
          var2 = 0;
          if (!ik.field_h) {
            te.a(0, so.field_o);
            if (this.c(82, true)) {
              ik.field_h = true;
            }
          } else {
            if (!StrongCacheEntry.f((byte) 122)) {
              DialogRoot.f((byte) 125);
            } else {
              if (DisplayModeInfo.field_e) {
                if (!sq.a(false)) {
                  if (kh.f((byte) -67)) {
                    var2 = 1;
                    stackIn_45_1 = true;
                    stackIn_46_2 = (NameSuggestionsPanel.field_K != null);
                    var3 = this.a(stackIn_45_1, stackIn_46_2);
                    if (var3 == 1 ||
                      var3 == 2) {
                      if (NameSuggestionsPanel.field_K != null) {
                        BufferedCacheFile.c(0);
                      }
                      if (2 == var3) {
                        DebouncedValidator.a(1, (java.applet.Applet) (this));
                      }
                    }
                    this.b(false, true);
                  } else {
                    if (DialPainter.c(0)) {
                      var2 = 1;
                      if (~jb.field_c != ~jb.field_g) {
                        this.b(false, false);
                      } else {
                        var3 = RoundedFrameSupport.a(106);
                        if (var3 == 1) {
                          AccountStatusDialog.field_ob = true;
                          MenuLabel.a(AchievementProgress.field_a, 0, (byte) 122);
                        }
                        this.b(false, true);
                      }
                    } else {
                      this.b(false, false);
                    }
                  }
                } else {
                  boolean decompiledFrameRemainder1 = true;
                  if (~jb.field_g != ~jb.field_c) {
                    this.b(false, false);
                  } else {
                    var3 = GuestPlayForm.d(false);
                    if (var3 == 2) {
                      BufferedCacheFile.c(0);
                    } else {
                      if (3 == var3) {
                        BattleContribution.field_s = false;
                        StrongCacheEntry.a(8, 13421772, IterableNodeHashTable.field_b, 8, mp.field_b.field_K, DerelictMapReader.field_i, 240, mp.field_b.field_K + mp.field_b.field_q, DerelictMapReader.field_i, 320, mp.field_b, mp.field_b, 0, mp.field_b.field_K, ValidationMessageWidget.field_P, mp.field_b.field_q + mp.field_b.field_K, 0, 2, 480, (Sprite[]) null, StarAnnotation.field_n);
                        HuffmanCodec.a(true, -1);
                      } else {
                        if (var3 != 4) {
                          this.b(false, true);
                          decompiledFrameRemainder1 = false;
                        }
                        else {
                          BattleContribution.field_s = true;
                          MenuLabel.a(wi.field_b, 0, (byte) 125);
                        }
                      }
                    }
                    if (decompiledFrameRemainder1) {
                      this.b(false, true);
                    }
                  }
                  var2 = 1;
                }
              } else {
                if (!Dialog.d(true)) {
                  GzipInflater.a(1);
                }
                DisplayModeInfo.field_e = true;
              }
            }
          }
          if (var2 != 0) {
            if (gg.field_a > FullscreenFocusCanvas.field_b) {
              fieldTemp$0 = FullscreenFocusCanvas.field_b + ResizingDialog.field_U;
              FullscreenFocusCanvas.field_b = FullscreenFocusCanvas.field_b + ResizingDialog.field_U;
              if (gg.field_a < fieldTemp$0) {
                FullscreenFocusCanvas.field_b = gg.field_a;
              }
            }
          } else {
            if (0 < FullscreenFocusCanvas.field_b) {
              fieldTemp$1 = FullscreenFocusCanvas.field_b - ResizingDialog.field_U;
              FullscreenFocusCanvas.field_b = FullscreenFocusCanvas.field_b - ResizingDialog.field_U;
              if (fieldTemp$1 < 0) {
                FullscreenFocusCanvas.field_b = 0;
              }
            }
          }
          if (!Dialog.d(true)) {
            while (true) {
              var3_ref_lq = (lq) (GameKeyHandler.field_a.pollFirst(54));
              if (var3_ref_lq == null) {
                break;
              }
              gd.a(var3_ref_lq, 1500005281, 4);
            }
          }
          var3Lifetime1 = -87 % ((15 - param0) / 35);
          scanLoop1: while (FleetTrailPoint.a(ae.field_a, 1)) {
            stackIn_150_0 = -10;
            stackIn_150_1 = ~BufferedCacheFile.field_e;
            if (stackIn_150_0 == stackIn_150_1) {
              DiskCacheWorker.a(1048576);
              StripedProgressWidget.field_Q = false;
              gr.field_o = 10;
              oi.field_c = sa.field_a.readString(-1);
              continue;
            }
            if (BufferedCacheFile.field_e == 14) {
              DiskCacheWorker.a(1048576);
              BytePayloadNode.a(HitRegion.a(20605), js.nextPowerOfTwo(2000, (byte) 122), UnderageAccountInfoPanel.m(42), 1024, js.nextPowerOfTwo(6, (byte) 122), (byte) -122, IntList.field_j.length, bb.a((byte) 100), LabeledChildWidget.field_C, 150);
              sj.a((byte) 77, js.b((byte) 121), NodeHashTableIterator.a(83));
              EmailValidator.field_p = true;
              StripedProgressWidget.field_Q = false;
              gr.field_o = -2;
              continue;
            }
            if (15 == BufferedCacheFile.field_e) {
              if (EmailValidator.field_p) {
                DiskCacheWorker.a(1048576);
                ProjectsContent.a((byte) -122);
                qn.b(112);
                ta.a(0, 0, (byte) 96, false);
                EmailValidator.field_p = false;
                ProxyAuthenticationRequiredException.field_b = true;
                Wormhole.field_i = false;
                MusicEnvelope.field_d = false;
                v.field_b = false;
                DiskArchiveRequest.field_A = true;
                wm.a(0);
              }
              is.field_a = false;
              StripedProgressWidget.field_Q = false;
              continue;
            }
            if (BufferedCacheFile.field_e == 10 &&
              EmailValidator.field_p) {
              DialWidget.h(112);
              continue;
            }
            if (BufferedCacheFile.field_e == 71) {
              if (!IsolationistAi.field_r) {
                continue;
              }
              var4 = sa.field_a.readInt(16711680);
              var4 = var4 & ~vq.field_a;
              var5 = 0;
              while (var5 < 25) {
                var6 = 1 << var5;
                stackIn_97_0 = ~(var6 & var4);
                stackIn_97_1 = -1;
                if (stackIn_97_0 != stackIn_97_1) {
                  this.field_G.addLast((byte) -113, new IntNode(var5));
                }
                var5++;
              }
              stackIn_97_0Lifetime1 = vq.field_a;
              stackIn_97_1Lifetime1 = var4;
              vq.field_a = stackIn_97_0Lifetime1 | stackIn_97_1Lifetime1;
              continue scanLoop1;
            }
            if (58 != BufferedCacheFile.field_e) {
              if (60 != BufferedCacheFile.field_e) {
                var4_ref = null;
                if (!v.field_b) {
                  if (MusicEnvelope.field_d) {
                    var4_ref = SecondaryNodeHashTable.field_g;
                  }
                } else {
                  var4_ref = PasswordInputPainter.field_x;
                }
                if (var4_ref != null &&
                  ((GameSession) (var4_ref)).handleTurnResultPacket(14759)) {
                  continue;
                }
                this.e((byte) -84);
                continue;
              }
              if (v.field_b ||
                MusicEnvelope.field_d) {
                DiskCacheWorker.a(1048576);
                if (v.field_b) {
                  PasswordInputPainter.field_x.a(false, false);
                }
                ProxyAuthenticationRequiredException.field_b = true;
                v.field_b = false;
                gr.field_o = -2;
                Wormhole.field_i = false;
                MusicEnvelope.field_d = false;
                ImageProducerRasterBuffer.field_n = true;
                wm.a(0);
              }
              is.field_a = false;
              continue;
            }
            DiskCacheWorker.a(1048576);
            var4 = sa.field_a.readUnsignedByte(-93);
            var5_ref_vr = kj.a((byte) -85, sa.field_a);
            var6 = sa.field_a.readSignedByte(-2852);
            stackIn_102_0 = (sa.field_a.readUnsignedByte(-95) == 0) ? 0 : 1;
            var7 = stackIn_102_0;
            var8 = sa.field_a.readSignedByte(-2852);
            stackIn_105_0 = (var8 < 0) ? 0 : 1;
            var9 = stackIn_105_0;
            var10 = new String[sa.field_a.readUnsignedByte(-128)];
            for (var11_int = 0; var11_int < var10.length; var11_int++) {
              var10[var11_int] = sa.field_a.readMarkedString((byte) -111);
            }
            tq.field_b = null;
            if (var9 == 0) {
              stackIn_111_0 = SecondaryNodeHashTable.field_g;
            } else {
              stackIn_111_0 = PasswordInputPainter.field_x;
            }
            var11 = stackIn_111_0;
            if (var11 == null) {
              stackIn_114_0 = null;
            } else {
              stackIn_114_0 = var11.field_Y;
            }
            var12 = stackIn_114_0;
            var13 = new GameSession(true, false, var4, var5_ref_vr, var6, var10, var8, var7 != 0, var12);
            var14 = 1;
            if (var13.field_n != null) {
              stackIn_118_0 = (1 != sa.field_a.readUnsignedByte(-122)) ? 0 : 1;
              var14 = stackIn_118_0;
            }
            try {
              var13.field_P.readMap(sa.field_a, var13.field_n, false);
              decompiledRegionSelector0 = 0;
            } catch (MapGenerationException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var15 = (MapGenerationException) (Object) decompiledCaughtException;
              GameKeyHandler.a(-29901, (Throwable) ((Object) var15), "Map Generation failed when receiving initial game state from server.");
              q.g(-96);
              decompiledRegionSelector0 = 1;
            } catch (InvalidMapConnectionException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var15_ref = (InvalidMapConnectionException) (Object) decompiledCaughtException;
              GameKeyHandler.a(-29901, (Throwable) ((Object) var15_ref), "Gamestate received from server is invalid.");
              q.g(-96);
              decompiledRegionSelector0 = 1;
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var15_ref2 = (Exception) (Object) decompiledCaughtException;
              GameKeyHandler.a(-29901, (Throwable) ((Object) var15_ref2), "Error receiving gamestate from server.");
              q.g(-119);
              decompiledRegionSelector0 = 1;
            }
            if (decompiledRegionSelector0 != 0) {
              continue;
            }
            var13.b((byte) -81);
            stackIn_126_0 = var13;
            stackIn_127_1 = (var14 != 0);
            stackIn_126_0.field_L = stackIn_127_1;
            if (var9 != 0) {
              v.field_b = true;
              PasswordInputPainter.field_x = var13;
              LoginForm.k(8);
              wp.a(-2);
              qf.b((byte) -98);
            } else {
              SecondaryNodeHashTable.field_g = var13;
              MusicEnvelope.field_d = true;
            }
            ta.a(0, -1, (byte) 96, false);
            ImageProducerRasterBuffer.field_n = false;
            Wormhole.field_i = true;
            is.field_a = false;
          }
          stackIn_150_0 = 0;
          stackIn_150_1 = 82;
          d.$cfr$intArgs$a$a6964d7afeb1(stackIn_150_0, stackIn_150_1);
          if (null != ScrollBar.field_zb &&
            ScrollBar.field_zb.field_j) {
            vq.field_a = vq.field_a | ScrollBar.field_zb.field_h;
            oe.field_e = ScrollBar.field_zb.field_l;
            ScrollBar.field_zb = null;
            IsolationistAi.field_r = true;
          }
          if (GameRules.field_c == -2 &&
            gr.field_o != -1) {
            ImageProducerRasterBuffer.field_n = true;
          }
          if (ImageProducerRasterBuffer.field_n) {
          }
          boolean decompiledFrameRemainder0 = true;
          if (!AchievementProgress.field_g && ((PasswordInputPainter.field_x == null ||
            !PasswordInputPainter.field_x.field_j) &&
            (SecondaryNodeHashTable.field_g == null ||
            !SecondaryNodeHashTable.field_g.field_j))) {
            stackIn_167_0 = 0;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_167_0 = 1;
          }
          var4 = stackIn_167_0;
          if (var4 != 0 &&
            FleetTrailPoint.field_p[82] &&
            FleetTrailPoint.field_p[73]) {
            stackIn_172_0 = 1;
          } else {
            stackIn_172_0 = 0;
          }
          var5 = stackIn_172_0;
          if (var5 != 0) {
            q.g(-108);
          }
          if (ArchiveRequest.f(-11)) {
            var6 = this.serviceConnection((byte) 16);
            if (var6 == 0 ||
              var6 == 1) {
              vs.a(4, (byte) -103);
              AchievementProgress.a(7, true);
              oq.a(6, 37);
              ef.a(true);
              if (1 == var6) {
                is.field_a = true;
                StripedProgressWidget.field_Q = true;
              } else {
                if (EmailValidator.field_p) {
                  ProxyAuthenticationRequiredException.field_b = true;
                  Wormhole.field_i = false;
                  DiskArchiveRequest.field_A = true;
                  if (!v.field_b) {
                    ta.a(0, 0, (byte) 96, false);
                  } else {
                    oi.field_c = RoundedFrameSupport.field_a;
                    ta.a(0, 10, (byte) 96, false);
                  }
                  DiskCacheWorker.a(1048576);
                  mj.field_Hb[GameRules.field_c].a(0, (byte) 84, false);
                  MusicEnvelope.field_d = false;
                  v.field_b = false;
                  EmailValidator.field_p = false;
                  wm.a(0);
                }
                StripedProgressWidget.field_Q = false;
                is.field_a = false;
              }
            }
            var7 = 0;
            if (var6 == 2) {
              var7 = 1;
            }
            if (var5 != 0) {
              var7 = 1;
            }
            if (EmailValidator.field_p ||
              StripedProgressWidget.field_Q ||
              is.field_a) {
              var7 = 1;
            }
            if (var7 != 0) {
              IntrusiveNode.b(-11);
            }
          }
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void l(int param0) {
        int var2_int = 0;
        int var3 = field_F ? 1 : 0;
        wg.field_e = new rl();
        wg.field_e.a("<col=2F5FBF>", 27275, "key");
        wg.field_e.a("<col=FF8080>", 27275, "highlight");
        wg.field_e.a("<col=2F5FBF>", 27275, "glossary");
        for (var2_int = 0; var2_int < 4; var2_int++) {
          wg.field_e.a(QuickChatCategoryRegistry.a("<col=<%0>><%1></col>", 4371, new String[]{Integer.toString(SoundPlayback.field_k[var2_int], 16), MusicCrossfadeStream.field_x[var2_int].toLowerCase()}), 27275, "resource" + var2_int);
          wg.field_e.a(QuickChatCategoryRegistry.a("<col=<%0>><%1></col>", param0 ^ 4370, new String[]{Integer.toString(SoundPlayback.field_k[var2_int], 16), MusicCrossfadeStream.field_x[var2_int]}), 27275, "Resource" + var2_int);
        }
        wg.field_e.a(field_L, 27275, "territories");
        wg.field_e.a(ObjectList.field_c, 27275, "uioptions");
        wg.field_e.a(ba.field_a, 27275, "fleetinfo");
        wg.field_e.a(MouseWheelInput.field_c, param0 ^ 27274, "projects");
        wg.field_e.a(DropTargetWidget.field_B, 27275, "diplomacy");
        wg.field_e.a(uq.field_l, 27275, "messages");
        wg.field_e.a(Integer.toString(SoundPlayback.field_k[0], 16), 27275, "colmetal");
        wg.field_e.a(Integer.toString(SoundPlayback.field_k[1], 16), 27275, "colbiomass");
        wg.field_e.a(Integer.toString(SoundPlayback.field_k[2], 16), 27275, "colenergy");
        wg.field_e.a(Integer.toString(SoundPlayback.field_k[3], 16), 27275, "colexotics");
        String var2 = "<col=<%0>><%1></col>";
        wg.field_e.a(QuickChatCategoryRegistry.a(var2, 4371, new String[]{Integer.toString(SoundPlayback.field_k[0], 16), or.field_d[0].toLowerCase()}), 27275, "project_metal");
        wg.field_e.a(QuickChatCategoryRegistry.a(var2, 4371, new String[]{Integer.toString(SoundPlayback.field_k[1], 16), or.field_d[param0].toLowerCase()}), 27275, "project_biomass");
        wg.field_e.a(QuickChatCategoryRegistry.a(var2, 4371, new String[]{Integer.toString(SoundPlayback.field_k[2], 16), or.field_d[2].toLowerCase()}), 27275, "project_energy");
        wg.field_e.a(QuickChatCategoryRegistry.a(var2, 4371, new String[]{Integer.toString(SoundPlayback.field_k[0], 16), or.field_d[0]}), 27275, "Project_Metal");
        wg.field_e.a(QuickChatCategoryRegistry.a(var2, 4371, new String[]{Integer.toString(SoundPlayback.field_k[1], 16), or.field_d[1]}), param0 + 27274, "Project_Biomass");
        wg.field_e.a(QuickChatCategoryRegistry.a(var2, 4371, new String[]{Integer.toString(SoundPlayback.field_k[2], 16), or.field_d[2]}), 27275, "Project_Energy");
        wg.field_e.a(QuickChatCategoryRegistry.a(var2, 4371, new String[]{Integer.toString(SoundPlayback.field_k[3], 16), or.field_d[3]}), param0 ^ 27274, "Project_Exotics");
        wg.field_e.a(QuickChatCategoryRegistry.a(var2, 4371, new String[]{Integer.toString(SoundPlayback.field_k[0], 16), or.field_d[0].toUpperCase()}), 27275, "PROJECT_METAL");
        wg.field_e.a(QuickChatCategoryRegistry.a(var2, param0 ^ 4370, new String[]{Integer.toString(SoundPlayback.field_k[1], 16), or.field_d[1].toUpperCase()}), 27275, "PROJECT_BIOMASS");
        wg.field_e.a(QuickChatCategoryRegistry.a(var2, param0 ^ 4370, new String[]{Integer.toString(SoundPlayback.field_k[2], 16), or.field_d[2].toUpperCase()}), param0 ^ 27274, "PROJECT_ENERGY");
        wg.field_e.a(QuickChatCategoryRegistry.a(var2, param0 + 4370, new String[]{Integer.toString(SoundPlayback.field_k[3], 16), or.field_d[3].toUpperCase()}), 27275, "PROJECT_EXOTICS");
    }

    private final boolean c(int param0, boolean param1) {
        int var3 = 0;
        boolean stackIn_77_0 = false;
        int var4;
        var4 = field_F ? 1 : 0;
        Bzip2State.a((byte) 51);
        if (null == IntHashIndex.field_a) {
          if (StrongCacheEntry.field_z != null) {
            nj.a(75.0f, 2, GuestPlayForm.field_I);
            this.draw(1);
            SpriteState.a(StrongCacheEntry.field_z, DualLinkNode.field_n, param0 - 47);
            DualLinkNode.field_n = null;
            StrongCacheEntry.field_z = null;
            ValidationState.c(126);
            return false;
          }
          if (IntrusiveNodeHashTable.field_g != null) {
            nj.a(90.0f, 2, PasswordValidator.field_p);
            this.draw(1);
            ck.a(ChatMessage.field_d, (java.applet.Applet) (this), AttackTask.field_s, rl.field_f, IntrusiveNodeHashTable.field_g, RichTextLayout.field_k, (byte) -8);
            rl.field_f = null;
            IntrusiveNodeHashTable.field_g = null;
            RichTextLayout.field_k = null;
            ValidationState.c(122);
            return false;
          }
          if (PointsVictoryChecker.field_l != null) {
            oi.a((byte) -126, PointsVictoryChecker.field_l);
            PointsVictoryChecker.field_l = null;
            ValidationState.c(125);
            return false;
          }
          if (null != ai.field_c) {
            ListContent.a(ai.field_c, param0 - 167);
            IsaacRandom.field_h = oq.a(ai.field_c.getFileByName(true, "starnames.txt", ""), (byte) -17);
            ai.field_c = null;
            ValidationState.c(121);
            return false;
          }
          if (null != oi.field_h) {
            CellVertex.a(1, new HuffmanCodec(oi.field_h.getFileByName(true, "huffman", "")));
            oi.field_h = null;
            ValidationState.c(126);
            return false;
          }
          this.l(1);
          WhirlpoolHasher.a(true);
          qf.a((byte) -125);
          for (var3 = 0; 14 > var3; var3++) {
            mj.field_Hb[var3] = new sm(var3);
          }
          if (param0 != 82) {
            this.l(64);
          }
          gr.field_o = 0;
          stackIn_77_0 = !(bs.field_b < 2);
          AchievementProgress.field_g = stackIn_77_0;
          uc.field_A = -1;
          GameRules.field_c = 0;
          de.field_j = -1;
          PaddedContentDialog.setTargetFrameRate(50, (byte) 52);
          UsernameAvailabilityValidator.b(param0 ^ -86, 50);
          ValidationState.c(122);
          QuickChatPhraseRegistry.a(32767, PaddedContentDialog.field_nb, true, 1048576);
          return true;
        }
        if (AttackTask.field_s.isIndexLoaded((byte) 127) &&
          AttackTask.field_s.ensureGroupLoadedByName("basic", -70)) {
          if (AttackTask.field_s.isIndexLoaded((byte) -45) &&
            AttackTask.field_s.ensureGroupLoadedByName("lobby", param0 + 16)) {
            if (rl.field_f.isIndexLoaded((byte) 120) &&
              rl.field_f.ensureGroupLoadedByName("lobby", param0 ^ -62)) {
              if (IntHashIndex.field_a.isIndexLoaded((byte) 120) &&
                IntHashIndex.field_a.preloadAll(param0 - 83)) {
                if (ld.field_m.isIndexLoaded((byte) -70) &&
                  ld.field_m.preloadAll(param0 - 83)) {
                  if (DualLinkNode.field_n.isIndexLoaded((byte) 111) &&
                    DualLinkNode.field_n.preloadAll(param0 - 83)) {
                    if (StrongCacheEntry.field_z.isIndexLoaded((byte) -121) &&
                      StrongCacheEntry.field_z.preloadAll(-1)) {
                      if (ChatMessage.field_d.isIndexLoaded((byte) -81) &&
                        ChatMessage.field_d.ensureGroupLoadedByName("", -67)) {
                        if (PointsVictoryChecker.field_l.isIndexLoaded((byte) -19) &&
                          PointsVictoryChecker.field_l.preloadAll(param0 ^ -83)) {
                          if (IntrusiveNodeHashTable.field_g.isIndexLoaded((byte) -79) &&
                            IntrusiveNodeHashTable.field_g.preloadAll(-1)) {
                            if (ai.field_c.isIndexLoaded((byte) -40) &&
                              ai.field_c.preloadAll(param0 ^ -83)) {
                              if (oi.field_h.isIndexLoaded((byte) -125) &&
                                oi.field_h.preloadAll(-1)) {
                                if (RichTextLayout.field_k.isIndexLoaded((byte) -87) &&
                                  RichTextLayout.field_k.preloadAll(-1)) {
                                  QuickChatCategoryDefinition.e(-23771);
                                  nj.a(65.0f, 2, jp.field_xb);
                                  this.draw(param0 - 81);
                                  if (!param1) {
                                    return false;
                                  }
                                  vo.a(ld.field_m, IntHashIndex.field_a, param0 + 18);
                                  IntHashIndex.field_a = null;
                                  ld.field_m = null;
                                  ValidationState.c(122);
                                  return false;
                                }
                                nj.a(75.0f, 2, CandidateLink.a(MouseInputHandler.field_e, RichTextLayout.field_k, param0 ^ 118, ToggleButton.field_v));
                                return false;
                              }
                              nj.a(75.0f, 2, BoundsRect.a("", oi.field_h, (byte) 77, MouseInputHandler.field_e, ToggleButton.field_v));
                              return false;
                            }
                            nj.a(75.0f, 2, BoundsRect.a("", ai.field_c, (byte) 39, MouseInputHandler.field_e, ToggleButton.field_v));
                            return false;
                          }
                          nj.a(75.0f, 2, BoundsRect.a("", IntrusiveNodeHashTable.field_g, (byte) 12, ValidatedTextInputWidget.field_J, SpriteState.field_r));
                          return false;
                        }
                        nj.a(75.0f, 2, BoundsRect.a("", PointsVictoryChecker.field_l, (byte) 61, ValidatedTextInputWidget.field_J, SpriteState.field_r));
                        return false;
                      }
                      nj.a(75.0f, 2, BoundsRect.a("", ChatMessage.field_d, (byte) 11, ValidatedTextInputWidget.field_J, SpriteState.field_r));
                      return false;
                    }
                    nj.a(60.0f, param0 - 80, BoundsRect.a("", StrongCacheEntry.field_z, (byte) 62, ByteArrayStorage.field_a, hc.field_b));
                    return false;
                  }
                  nj.a(45.0f, 2, ve.a(DualLinkNode.field_n, 0, ByteArrayStorage.field_a, hc.field_b, param0 - 15012));
                  return false;
                }
                nj.a(40.0f, 2, BoundsRect.a("", ld.field_m, (byte) 47, kh.field_Db, TurnEventLog.field_e));
                return false;
              }
              nj.a(20.0f, 2, BoundsRect.a("", IntHashIndex.field_a, (byte) 117, kh.field_Db, TurnEventLog.field_e));
              return false;
            }
            nj.a(17.0f, 2, BoundsRect.a("lobby", rl.field_f, (byte) 94, LinkPainter.field_h, IntrusiveDequeCursor.field_h));
            return false;
          }
          nj.a(13.0f, 2, BoundsRect.a("lobby", AttackTask.field_s, (byte) 19, ValidatedTextInputWidget.field_J, SpriteState.field_r));
          return false;
        }
        nj.a(10.0f, param0 ^ 80, BoundsRect.a("basic", AttackTask.field_s, (byte) 38, ValidatedTextInputWidget.field_J, SpriteState.field_r));
        return false;
    }

    final void disposeResources(int param0) {
        ShatteredPlansClient.clearStatics((byte) -46);
        IntNode.clearStatics(23811);
        IntrusiveDeque.clearStatics(0);
        tg.clearStatics(82);
        wi.clearStatics((byte) 111);
        no.clearStatics(-6);
        MusicCrossfadeStream.clearStatics(param0 ^ 24068);
        id.clearStatics((byte) -77);
        va.clearStatics(102);
        GameScreen.d(param0 ^ -24389);
        InvalidMapConnectionException.clearStatics((byte) 16);
        GameRules.clearStatics(true);
        GalaxyMap.clearStatics((byte) -98);
        rl.clearStatics(param0 ^ -24069);
        GameKeyHandler.a((byte) -102);
        uo.clearStatics(true);
        jf.a((byte) -23);
        wo.clearStatics((byte) -103);
        vo.clearStatics(256);
        GameClientShell.clearStatics(-38);
        ClientException.clearStatics(108);
        GameApplet.b(param0 ^ -24187);
        UrlLoader.clearStatics(0);
        MouseInputHandler.a(param0 ^ -24150);
        MouseWheelInput.clearStatics(param0 ^ -24163);
        SoftwareRasterizer.clearStatics();
        Archive.clearStatics(-466);
        gg.clearStatics(param0 + 24069);
        PacketBuffer.clearStatics((byte) 78);
        pr.b(21455);
        bs.clearStatics(53);
        sa.clearStatics(2029303720);
        ba.a(0);
        kd.clearStatics(109);
        ss.clearStatics(1);
        je.a(1);
        dk.clearStatics((byte) 125);
        nf.clearStatics((byte) -25);
        hq.clearStatics(108);
        FrameTimer.clearStatics((byte) 47);
        uh.clearStatics(param0 ^ -24161);
        FullscreenFocusCanvas.clearStatics(-1314558012);
        CanvasResizeController.clearStatics(false);
        ArchiveNetworkClient.a(16967);
        DiskCacheWorker.clearStatics(true);
        ArchiveSourceManager.clearStatics((byte) 124);
        BufferedCacheFile.clearStatics(false);
        BufferedSocket.clearStatics((byte) -127);
        PlayerStats.clearStatics((byte) -17);
        SolVictoryChecker.clearStatics(-26088);
        IntrusiveNode.a(true);
        PolygonSpanIterator.clearStatics();
        BitmapFont.clearStatics();
        sj.clearStatics((byte) -106);
        ObjectList.clearStatics(false);
        pl.clearStatics(param0 ^ -17251);
        nb.a((byte) 123);
        dh.clearStatics((byte) -98);
        of.b(64);
        ud.clearStatics(127);
        aj.clearStatics(21805);
        ij.clearStatics((byte) -29);
        SoundCache.clearStatics((byte) 120);
        sm.clearStatics(-25370);
        GameSession.clearStatics(11);
        te.clearStatics(param0 + 24069);
        nn.clearStatics((byte) 63);
        MidiPcmStream.clearStatics(-17876);
        IntrusiveNodeHashTable.clearStatics(0);
        MusicVoice.clearStatics(-109);
        MidiFileReader.clearStatics();
        PcmPlayerService.clearStatics();
        d.clearStatics(-28065);
        np.clearStatics(true);
        PanelNode.clearStatics(false);
        v.clearStatics(3);
        wp.clearStatics((byte) -90);
        ae.clearStatics(-17358);
        AnimatedPanel.clearStatics(-14115);
        fb.clearStatics(32);
        SecondaryNodeHashTable.clearStatics(true);
        mj.clearStatics(-4923);
        qn.clearStatics(-989994556);
        ue.a(18031);
        rs.clearStatics(2616);
        ScrollBar.clearStatics((byte) -118);
        ul.g(param0 ^ -24045);
        am.clearStatics(param0 + 47949);
        fc.clearStatics((byte) -87);
        ScrollPane.clearStatics(param0 ^ param0);
        kh.clearStatics(param0 ^ 24070);
        wg.clearStatics((byte) -117);
        ArchiveIndex.clearStatics(true);
        GzipInflater.clearStatics((byte) 114);
        ArchiveSource.clearStatics(false);
        ig.clearStatics((byte) 92);
        ta.clearStatics((byte) 118);
        DialogRoot.clearStatics(true);
        AccountCreationDialog.clearStatics(-17682);
        ProgressDialog.clearStatics((byte) -94);
        PaddedContentDialog.clearStatics(param0 + 24089);
        AccountStatusDialog.clearStatics((byte) -121);
        AccountCreationForm.clearStatics((byte) 32);
        GuestPlayForm.clearStatics((byte) 121);
        LoginForm.clearStatics((byte) -73);
        AccountFieldValue.clearStatics(param0 + 2129445);
        WidgetStyle.clearStatics(3);
        wc.clearStatics(-23092);
        IsaacBackedRandom.clearStatics((byte) -109);
        Player.a(param0 ^ -24065);
        ho.a(520);
        GameState.clearStatics((byte) -67);
        Star.clearStatics(param0 ^ -24069);
        FleetMove.clearStatics((byte) -106);
        PlacementOrder.clearStatics(21758);
        an.clearStatics(true);
        HuffmanCodec.clearStatics(110);
        MapViewState.clearStatics(param0 ^ 28675);
        MapView.clearStatics(0);
        ConquestVictoryChecker.clearStatics(45);
        DerelictVictoryChecker.clearStatics((byte) -64);
        PointsVictoryChecker.b((byte) 59);
        VictoryChecker.clearStatics(true);
        jb.clearStatics(30);
        vs.clearStatics(param0 ^ -24162);
        oo.clearStatics(4);
        mk.a((byte) -58);
        MessageKind.clearStatics(false);
        ChatMessage.a(param0 ^ 24068);
        CipherPacketBuffer.clearStatics(0);
        ai.clearStatics((byte) 1);
        po.clearStatics((byte) 87);
        IsaacRandom.clearStatics(-117);
        qj.clearStatics((byte) -20);
        or.clearStatics(126);
        sg.clearStatics((byte) 34);
        wh.clearStatics(true);
        tb.clearStatics(58);
        nl.clearStatics(-87);
        q.clearStatics((byte) 125);
        jp.g(param0 + 23965);
        dd.clearStatics(param0 ^ 27074);
        dg.clearStatics((byte) -124);
        StandardAi.clearStatics((byte) 79);
        TaskAi.clearStatics(param0 ^ 24118);
        FleetVisual.clearStatics(param0 ^ -24081);
        BattleSnapshot.clearStatics((byte) 68);
        Territory.clearStatics(-28714);
        BattleEvent.clearStatics(param0 + 24195);
        PlacementEvent.clearStatics((byte) 12);
        BattleContribution.clearStatics(false);
        StellarBombEvent.clearStatics(0);
        StarAbandonedEvent.clearStatics((byte) 48);
        TurnEventLog.clearStatics(0);
        NodeSequence.clearStatics((byte) -122);
        sf.a((byte) 82);
        DualLinkDeque.clearStatics(param0 ^ -8957);
        QuaternaryNodeList.clearStatics(-79);
        wm.clearStatics(false);
        mi.clearStatics((byte) 99);
        ls.clearStatics(param0 - 4458);
        TutorialVictoryChecker.clearStatics(-124);
        ListContent.clearStatics((byte) 118);
        StatusContent.clearStatics(18973);
        ProductionContent.clearStatics(param0 + 24072);
        ProjectsContent.clearStatics(5);
        MenuButton.clearStatics(128);
        kb.clearStatics(true);
        MenuComponent.a((byte) -124);
        uc.clearStatics((byte) 106);
        SpriteButton.clearStatics((byte) -68);
        MenuList.clearStatics(1546006977);
        MenuLabel.clearStatics(104);
        ToggleButton.clearStatics((byte) 124);
        os.clearStatics(true);
        MenuWindow.clearStatics((byte) 6);
        CombinedTerritory.clearStatics(0);
        DerelictMapGenerator.clearStatics(84);
        StandardMapGenerator.clearStatics(0);
        SolMapGenerator.clearStatics((byte) -80);
        TutorialMapGenerator.d(-10);
        TertiaryNodeList.a(-5731);
        AchievementProgress.clearStatics((byte) -37);
        ck.clearStatics(100);
        BirthDateConfirmationForm.clearStatics(-105);
        DualLinkNode.clearStatics(9768448);
        IndexedSpriteState.clearStatics(1);
        SpriteState.e(997342595);
        ReflectionCheck.clearStatics((byte) -70);
        RandomAccessCacheFile.clearStatics(false);
        bf.clearStatics((byte) -57);
        vh.clearStatics((byte) 110);
        AudioService.clearStatics(-102);
        AlignedMenuLabel.clearStatics(-110);
        VerticalMenuSlider.clearStatics(5);
        gd.clearStatics(param0 + 24189);
        tm.clearStatics(param0 ^ 11083);
        tq.clearStatics(param0 ^ 10214);
        de.clearStatics((byte) 102);
        sq.clearStatics((byte) 127);
        CellVertex.clearStatics(14077);
        StarLink.clearStatics(param0 + 24110);
        sn.clearStatics(param0 ^ -24146);
        Wormhole.clearStatics(-93);
        HitRegion.clearStatics((byte) 15);
        AllianceExpiredEvent.clearStatics(true);
        SocketArchiveNetworkClient.clearStatics(-126);
        NetworkArchiveRequest.d(false);
        SectorCacheStore.clearStatics(4);
        DiskArchiveRequest.clearStatics(param0 + 24092);
        CachedArchiveSource.clearStatics((byte) 114);
        gp.clearStatics((byte) 123);
        ArchiveRequest.clearStatics(param0 ^ 6520);
        ng.clearStatics(-109);
        AccountNoticeDialog.clearStatics(param0 ^ -24069);
        WidgetTheme.clearStatics((byte) -77);
        wn.clearStatics();
        VorbisSample.clearStatics();
        hc.clearStatics((byte) 66);
        sr.clearStatics((byte) -74);
        nm.clearStatics((byte) 4);
        im.clearStatics(-27153);
        oe.clearStatics(param0 ^ -24069);
        uk.clearStatics((byte) 91);
        DelegatingCanvas.a(param0 ^ 24068);
        bb.clearStatics((byte) 26);
        IntHashIndex.clearStatics((byte) -26);
        ByteArrayStorage.clearStatics(124);
        Bzip2Decoder.clearStatics();
        Bzip2State.clearStatics((byte) -105);
        lr.clearStatics(3);
        gi.clearStatics(32);
        CheckboxPainter.a(false);
        StatefulWidgetTheme.clearStatics(true);
        DialPainter.clearStatics(16711935);
        SliderPainter.clearStatics((byte) 49);
        TextLayout.clearStatics(-109);
        UiWidget.clearStatics(0);
        FocusableWidget.clearStatics(true);
        SingleChildWidget.clearStatics((byte) 109);
        ResizingDialog.clearStatics(-123);
        Dialog.clearStatics(-1);
        WidgetContainer.clearStatics(param0 ^ -24192);
        IntrusiveDequeCursor.clearStatics(22256);
        wl.a((byte) 85);
        VorbisFloor1.clearStatics();
        AccountValidationText.clearStatics((byte) -121);
        mq.clearStatics((byte) 127);
        RoundedFrameSupport.clearStatics((byte) 72);
        hr.clearStatics(5);
        QuickChatMenu.clearStatics(param0 ^ 2556);
        QuickChatPhraseRegistry.clearStatics(true);
        QuickChatCategoryRegistry.clearStatics((byte) 125);
        QuickChatPhraseDefinition.clearStatics((byte) -117);
        QuickChatCategoryDefinition.clearStatics((byte) -50);
        WeightedLruCache.a(false);
        SocketConnector.clearStatics((byte) 23);
        ProxyAuthenticationRequiredException.clearStatics(101);
        NanoFrameTimer.clearStatics((byte) 78);
        ImageProducerRasterBuffer.clearStatics(6);
        us.clearStatics(param0 ^ -24069);
        DisplayModeInfo.a(param0 + 24155);
        WhirlpoolHasher.clearStatics(0);
        StarLinkPlanner.clearStatics((byte) -11);
        ei.clearStatics((byte) -81);
        we.clearStatics(-122);
        lm.clearStatics(true);
        TertiaryLinkNode.clearStatics((byte) -21);
        QuaternaryLinkNode.clearStatics(true);
        ep.clearStatics(640);
        BytePayloadNode.clearStatics((byte) 123);
        SynthInstrument.clearStatics();
        AttackTask.clearStatics(-62);
        DefendTask.clearStatics(-127);
        GarrisonTask.clearStatics((byte) -99);
        AiTask.clearStatics((byte) -122);
        n.clearStatics(11209);
        MusicPatch.clearStatics(59114);
        MusicEnvelope.clearStatics(false);
        LabeledChildWidget.clearStatics((byte) -43);
        ValidatedTextInputWidget.clearStatics(5);
        TextFieldWidget.clearStatics(102);
        ContentDialog.releaseDialogStatics((byte) 88);
        StripedProgressWidget.clearStatics(-125);
        NameSuggestionsPanel.clearStatics(param0 ^ -32120);
        TextHotspotWidget.clearStatics((byte) -104);
        ValidationIndicator.clearStatics((byte) 107);
        ValidationMessageWidget.clearStatics(4096);
        CheckboxWidget.clearStatics(-22429);
        TextFieldValidator.clearStatics((byte) -65);
        bk.a(param0 + 26631);
        UnderageAccountInfoPanel.a((byte) -75);
        DialWidget.clearStatics(4);
        SliderWidget.clearStatics(-104);
        en.clearStatics(-5);
        cr.clearStatics((byte) 41);
        DerelictMapReader.clearStatics(false);
        StandardMapReader.clearStatics(-90);
        SolMapReader.clearStatics((byte) 87);
        StarAnnotation.clearStatics(param0 ^ 24068);
        so.clearStatics(2);
        qe.clearStatics((byte) 93);
        FleetTrailPoint.clearStatics(true);
        js.clearStatics((byte) 115);
        BirthDateValidator.clearStatics((byte) 124);
        NumericDateInputWidget.clearStatics(false);
        ArrayWidgetGroup.clearStatics(-1);
        TutorialAi.clearStatics(false);
        LegacyAi.clearStatics(19333);
        AggressiveAi.clearStatics((byte) 97);
        RecklessAi.clearStatics(388178881);
        IsolationistAi.clearStatics(false);
        DefensiveAi.clearStatics(30);
        PlayerEliminatedEvent.clearStatics(2105376);
        DateInputWidget.clearStatics((byte) -113);
        RichTextLayout.clearStatics((byte) 36);
        DirectByteArrayStorage.a((byte) 104);
        IntList.a(19568);
        DraggableWidget.clearStatics(-950540796);
        DropTargetWidget.f((byte) 111);
        IterableNodeHashTable.clearStatics(-1215);
        SecondaryNodeDeque.clearStatics(param0 ^ -24167);
        WeightedCacheEntry.clearStatics(false);
        gq.clearStatics(118);
        StrongCacheEntry.clearStatics(-120);
        ProxySocketConnector.clearStatics(1);
        CandidateLink.clearStatics(param0 + 24068);
        oi.clearStatics(-1);
        AudioFilter.clearStatics();
        ef.a(0);
        NodeHashTableIterator.clearStatics(param0 + 24068);
        SecondaryNodeDequeIterator.a(124);
        jr.clearStatics(1885);
        wj.clearStatics((byte) 59);
        wq.clearStatics((byte) -36);
        gr.clearStatics(-47);
        SoundPlayback.clearStatics((byte) -111);
        qf.clearStatics(9952);
        uq.a(param0 + 24123);
        BoundsRect.clearStatics(0);
        oq.clearStatics(param0 + 24098);
        SpriteStripButtonPainter.clearStatics((byte) -128);
        LinkPainter.clearStatics(-110);
        PasswordInputPainter.clearStatics(true);
        og.clearStatics(-1);
        OpacityWidget.releaseOpacityWidgetStatics(124);
        ve.clearStatics(0);
        uf.clearStatics((byte) 68);
        hd.clearStatics((byte) -99);
        vc.clearStatics(-67);
        nd.clearStatics(true);
        ks.a((byte) 127);
        fg.clearStatics(param0 ^ -24186);
        sk.clearStatics(param0 + 24021);
        gb.clearStatics((byte) -115);
        lq.clearStatics((byte) 67);
        ld.clearStatics(16711680);
        ByteArrayNode.a((byte) 93);
        mp.clearStatics(param0 + 16160);
        kj.a(1);
        StatusMessagePanel.clearStatics(240);
        LoginMethodPreference.clearStatics(16928);
        TargetedChatMessage.clearStatics((byte) -47);
        jm.clearStatics(22595);
        PrivateChatMessage.clearStatics(false);
        RasterStateFrame.clearStatics(16777215);
        IntrusiveDequeSequence.clearStatics(11);
        DualLinkDequeSequence.clearStatics((byte) -107);
        TertiaryListSequence.clearStatics(0);
        QuaternaryListSequence.clearStatics(17593);
        wa.clearStatics(param0 ^ -14291);
        ih.clearStatics(-1);
        rk.clearStatics(-13095);
        aq.clearStatics((byte) 107);
        WidgetStateStyle.clearStatics((byte) 70);
        TextLayoutLine.clearStatics(4324);
        UsernameAvailabilityValidator.clearStatics(true);
        PasswordValidator.clearStatics(param0 + 24324);
        EmailSyntaxValidator.clearStatics(param0 + 23978);
        EmailValidator.clearStatics(0);
        AgeValidator.clearStatics(127);
        MatchingTextValidator.clearStatics(param0 + 24147);
        oa.clearStatics(78);
        ql.clearStatics((byte) -53);
        ValidationState.clearStatics(-31);
        DebouncedValidator.clearStatics((byte) -37);
        ro.clearStatics((byte) -92);
        this.field_s = null;
        this.field_G = null;
    }

    public static void clearStatics(byte param0) {
        if (param0 != -46) {
          field_L = (String) null;
        }
        field_H = null;
        field_L = null;
        field_J = null;
        field_E = null;
    }

    public final void init() {
        this.configureGame("shatteredplans", 15, (byte) 112);
    }

    private final void b(boolean param0, boolean param1) {
        int fieldTemp$0 = 0;
        boolean stackIn_47_0 = false;
        boolean stackIn_82_0 = false;
        int stackIn_102_0 = 0;
        int stackIn_107_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        String var9;
        String[] var11;
        String[] var12;
        int var4Lifetime1;
        int var4Lifetime2;
        boolean stackIn_47_0Lifetime1;
        var8 = field_F ? 1 : 0;
        if (~jb.field_c != ~jb.field_g) {
          if (jb.field_g != po.field_f) {
            if (~jb.field_g == ~NanoFrameTimer.field_d) {
              if (!Dialog.d(true)) {
                if (null != tq.field_b) {
                  ks.a(20, tq.field_b, 3);
                }
                stackIn_82_0 = !(bs.field_b < 2);
                AchievementProgress.field_g = stackIn_82_0;
                gr.field_o = SolMapReader.field_b;
                ArchiveRequest.a(75, id.a(2, AttackTask.field_s, "basic", "unachieved"));
                oi.a(!param0);
                if (BattleContribution.field_s) {
                  BattleContribution.field_s = false;
                  StrongCacheEntry.a(8, 13421772, IterableNodeHashTable.field_b, 8, mp.field_b.field_K, DerelictMapReader.field_i, 240, mp.field_b.field_q + mp.field_b.field_K, DerelictMapReader.field_i, 320, mp.field_b, mp.field_b, 0, mp.field_b.field_K, ValidationMessageWidget.field_P, mp.field_b.field_q + mp.field_b.field_K, 0, 2, 480, (Sprite[]) null, StarAnnotation.field_n);
                  HuffmanCodec.a(false, -1);
                }
                if (AccountStatusDialog.field_ob) {
                  ta.a(gr.field_o, -6, (byte) 96, false);
                }
                if (PointsVictoryChecker.a((byte) -111, gr.field_o)) {
                  DiskCacheWorker.a(1048576);
                }
                GzipInflater.a(1);
              }
              AccountStatusDialog.field_ob = false;
              BattleContribution.field_s = false;
              jb.field_g = WidgetTheme.field_n;
            } else {
              Bzip2State.field_F = Bzip2State.field_F - 1;
              if (Bzip2State.field_F == 0) {
                jb.field_g = jb.field_c;
              }
            }
          } else {
            Bzip2State.field_F = Bzip2State.field_F + 1;
            if (Bzip2State.field_F == 16) {
              if (BattleContribution.field_s) {
                oq.a(param0);
              } else {
                if (!AccountStatusDialog.field_ob) {
                  QuickChatPhraseDefinition.f((byte) -91);
                } else {
                  QuickChatPhraseDefinition.f((byte) -91);
                }
              }
              jb.field_g = NanoFrameTimer.field_d;
            }
          }
        } else {
          var3 = 0;
          var4 = 0;
          if (!param1) {
            if (GameRules.field_c == gr.field_o) {
              if (GameRules.field_c != -1) {
                if (GameRules.field_c != -2) {
                  if (GameRules.field_c == -3) {
                    ScrollPane.f((byte) 93);
                  } else {
                    if (PointsVictoryChecker.a((byte) -121, GameRules.field_c)) {
                      mj.field_Hb[GameRules.field_c].i(2664);
                    }
                  }
                } else {
                  var3 = 1;
                }
              } else {
                if (!EmailValidator.field_p) {
                  PasswordInputPainter.field_x.b(true, true);
                  while (PasswordValidator.$cfr$intArgs$e$296a4c2b494e(55)) {
                    PasswordInputPainter.field_x.g(-86);
                  }
                } else {
                  var3 = 1;
                  var4 = 1;
                }
              }
            } else {
              if (BirthDateConfirmationForm.field_Q != 0 ||
                !PointsVictoryChecker.a((byte) -76, GameRules.field_c) ||
                mj.field_Hb[GameRules.field_c].a((byte) 95)) {
                BirthDateConfirmationForm.field_Q = BirthDateConfirmationForm.field_Q + 1;
              }
              if (BirthDateConfirmationForm.field_Q == 32) {
                DiskCacheWorker.a(1048576);
              }
            }
          }
          if (EmailValidator.field_p &&
            !StripedProgressWidget.field_Q &&
            !is.field_a) {
            if (v.field_b &&
              sr.field_h) {
              var3 = 0;
            }
            StatusMessagePanel.a(2, var3 != 0);
            if (MusicEnvelope.field_d) {
              SecondaryNodeHashTable.field_g.b(var4 != 0, true);
            }
            if (v.field_b) {
              StatusMessagePanel.a(320, 8, 180, var4 != 0);
              PasswordInputPainter.field_x.b(var4 != 0, true);
            }
            while (PasswordValidator.$cfr$intArgs$e$296a4c2b494e(55)) {
              if (v.field_b) {
                if (StatefulWidgetTheme.a(13, -9861, 12, 15)) {
                  continue;
                }
              } else {
                qf.a(0, 13, 15, 12);
              }
              stackIn_47_0 = MusicEnvelope.field_d;
              if (stackIn_47_0) {
                SecondaryNodeHashTable.field_g.g(-98);
              }
              if (!v.field_b) {
                continue;
              }
              PasswordInputPainter.field_x.g(-99);
            }
          }
          stackIn_47_0Lifetime1 = EmailValidator.field_p;
          if (!stackIn_47_0Lifetime1) {
            DelegatingCanvas.b(0);
          }
          if (!ImageProducerRasterBuffer.field_n) {
            if (NodeHashTableIterator.field_h > 0) {
              NodeHashTableIterator.field_h = NodeHashTableIterator.field_h - 1;
            }
          } else {
            if (NodeHashTableIterator.field_h < MouseInputHandler.field_f) {
              NodeHashTableIterator.field_h = NodeHashTableIterator.field_h + 1;
            }
          }
          var5 = MouseInputHandler.field_f * MouseInputHandler.field_f;
          var6 = -(NodeHashTableIterator.field_h * NodeHashTableIterator.field_h) + var5;
          var7 = 120 * var6 / var5 + Player.field_z;
          ValidatedTextInputWidget.a(var7, (byte) -47);
          if (uc.field_v > 0) {
            uc.field_v = uc.field_v - 1;
          }
          if (this.field_G.startForward(0) != null) {
            fieldTemp$0 = this.field_I + 1;
            this.field_I = this.field_I + 1;
            if (fieldTemp$0 == 335) {
              this.field_I = 0;
              this.field_G.pollFirst(64);
            }
          }
        }
        if (param0) {
          var9 = (String) null;
          ShatteredPlansClient.a(64, 68L, (String) null);
        }
        if (gr.field_o == -4) {
          tq.field_b = null;
          var11 = new String[]{IntList.field_f[0], IntList.field_f[1], IntList.field_f[2], IntList.field_f[3]};
          PasswordInputPainter.field_x = new GameSession(false, false, (int) MidiPcmStream.field_w[0], SliderWidget.field_K, PlacementEvent.field_k, var11, 0, false, (GameScreen) null);
          stackIn_102_0 = (!uh.field_i) ? 0 : 1;
          var4Lifetime1 = stackIn_102_0;
          ta.a(0, -1, (byte) 96, var4Lifetime1 != 0);
          Wormhole.field_i = true;
        }
        if (gr.field_o == -5) {
          tq.field_b = null;
          var12 = new String[]{IntList.field_f[0]};
          PasswordInputPainter.field_x = new GameSession(false, true, 0, TaskAi.field_a, 0, var12, 0, false, (GameScreen) null);
          stackIn_107_0 = (!uh.field_i) ? 0 : 1;
          var4Lifetime2 = stackIn_107_0;
          ta.a(0, -1, (byte) 96, var4Lifetime2 != 0);
          Wormhole.field_i = true;
        }
        if (gr.field_o == -7) {
          NetworkArchiveRequest.a(11, np.field_a.g(-79), (byte) -2);
          gr.field_o = GameRules.field_c;
          is.field_a = true;
        }
    }

    private final void c(boolean param0) {
        if (StandardAi.field_e != null) {
          PrivateChatMessage.loadGameText(-47, StandardAi.field_e);
          StandardAi.field_e = null;
          ValidationState.c(121);
        }
        oi.field_h = SoundCache.a(3, 50);
        ChatMessage.field_d = IterableNodeHashTable.a(5, true, param0, !param0 ? true : false, false);
        PointsVictoryChecker.field_l = SoundCache.a(6, 93);
        IntrusiveNodeHashTable.field_g = SoundCache.a(7, 110);
        IntHashIndex.field_a = SoundCache.a(8, 90);
        ld.field_m = SoundCache.a(9, 28);
        DualLinkNode.field_n = SoundCache.a(10, 55);
        StrongCacheEntry.field_z = SoundCache.a(11, 67);
        ai.field_c = SoundCache.a(12, 28);
        RichTextLayout.field_k = SoundCache.a(13, 52);
    }

    final void draw(int param0) {
        Object stackIn_3_0 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_18_0 = false;
        boolean stackIn_28_0 = false;
        int stackIn_69_0 = 0;
        boolean stackIn_71_1 = false;
        Object var2;
        IntNode var3_ref_he;
        int var3_int;
        long var3;
        String var4;
        int var5_int;
        long var5;
        int var6;
        int var7_int;
        long var7;
        int var8;
        int var9;
        int var10;
        int var11;
        Sprite var13;
        int var14;
        int[] var18;
        var14 = field_F ? 1 : 0;
        if (NameSuggestionsPanel.field_K != null) {
          stackIn_3_0 = NameSuggestionsPanel.field_K;
        } else {
          stackIn_3_0 = tm.field_i;
        }
        var2 = stackIn_3_0;
        if (uf.a(false)) {
          if (NameSuggestionsPanel.field_K == null) {
            stackIn_7_0 = MusicPatch.field_i;
          } else {
            stackIn_7_0 = true;
          }
          no.a(stackIn_7_0, 10, (java.awt.Canvas) (var2));
          return;
        }
        if (!ik.field_h) {
          ProxySocketConnector.a(9242, (java.awt.Canvas) (var2));
          return;
        }
        if (!StrongCacheEntry.f((byte) 116)) {
          nj.a(100.0f, 2, ToggleButton.field_v);
          ProxySocketConnector.a(9242, (java.awt.Canvas) (var2));
          return;
        }
        if (~gr.field_o != ~GameRules.field_c) {
          stackIn_28_0 = (-1 == GameRules.field_c);
          ValidationState.a(stackIn_28_0, false);
          if (~GameRules.field_c != ~gr.field_o ||
            -2 != GameRules.field_c) {
            ShatteredPlansClient.n((byte) 67);
          }
          if (PointsVictoryChecker.a((byte) -105, GameRules.field_c) &&
            !PointsVictoryChecker.a((byte) -123, gr.field_o)) {
            mj.field_Hb[GameRules.field_c].b(94, 128 * BirthDateConfirmationForm.field_Q / 32);
          } else {
            if (!PointsVictoryChecker.a((byte) -75, GameRules.field_c) &&
              PointsVictoryChecker.a((byte) -127, gr.field_o)) {
              mj.field_Hb[gr.field_o].b(89, -(BirthDateConfirmationForm.field_Q * 128 / 32) + 128);
            } else {
              if (PointsVictoryChecker.a((byte) -125, GameRules.field_c) &&
                PointsVictoryChecker.a((byte) -74, gr.field_o)) {
                mj.field_Hb[GameRules.field_c].c(gr.field_o, -6469, 128 * BirthDateConfirmationForm.field_Q / 32);
              }
            }
          }
        } else {
          if (GameRules.field_c != -2) {
            stackIn_18_0 = (GameRules.field_c == -1);
            ValidationState.a(stackIn_18_0, false);
            if (GameRules.field_c != gr.field_o ||
              GameRules.field_c != -2) {
              ShatteredPlansClient.n((byte) 67);
            }
            if (PointsVictoryChecker.a((byte) -99, GameRules.field_c)) {
              mj.field_Hb[GameRules.field_c].g(-121);
            }
          } else {
            SoftwareRasterizer.clear();
          }
        }
        if (gr.field_o != GameRules.field_c) {
          if (gr.field_o == -2) {
            SoftwareRasterizer.fillRectAlpha(0, 0, 640, 480, 0, 256 * BirthDateConfirmationForm.field_Q / 32);
          } else {
            if (GameRules.field_c == -2) {
              SoftwareRasterizer.fillRectAlpha(0, 0, 640, 480, 0, -(256 * BirthDateConfirmationForm.field_Q / 32) + 256);
            }
          }
        }
        if (!TutorialAi.field_x ||
          !Wormhole.field_i) {
          AnimatedPanel.a(VictoryChecker.a(30), (byte) 111);
        }
        if (FullscreenFocusCanvas.field_b > 0) {
          SoftwareRasterizer.fillRectAlpha(0, 0, 640, 480, 0, FullscreenFocusCanvas.field_b);
        }
        if (sq.a(false)) {
          TextHotspotWidget.a(sa.a(-27572), param0 ^ -2, FleetMove.e(param0 ^ -84));
          kd.a((byte) -119);
        } else {
          if (kh.f((byte) -67)) {
            stackIn_69_0 = 95;
            stackIn_71_1 = (null != NameSuggestionsPanel.field_K) || (MusicPatch.field_i);
            Player.$cfr$intArgs$a$7ffe4b125357(stackIn_69_0, stackIn_71_1);
          } else {
            if (!DialPainter.c(0)) {
              if (!this.field_G.isEmpty(27)) {
                var3_ref_he = (IntNode) (this.field_G.startForward(param0 ^ 1));
                var4 = ud.field_a[var3_ref_he.field_k];
                var5_int = mp.field_b.stringWidth(var4) + 50;
                var6 = 36;
                var7_int = 10 + var5_int / 2;
                var8 = 10;
                var9 = this.field_I;
                if (303 < var9) {
                  var9 = 335 - var9;
                } else {
                  if (var9 > 32) {
                    var9 = 32;
                  }
                }
                var10 = QuickChatCategoryRegistry.a(0, 32, var9, var5_int, param0 ^ 1);
                var11 = 10 + (var5_int - var10 >> 1);
                var18 = new int[4];
                SoftwareRasterizer.saveClip(var18);
                MidiPcmStream.a(var6, var8, var11, (byte) -78, var10);
                SoftwareRasterizer.setClip(var11, var8, var10 + var11, var8 + var6);
                var13 = oi.a(var3_ref_he.field_k, (byte) 66);
                var13.draw(-36 + (var7_int + var5_int / 2), 4 + var8);
                mp.field_b.drawString(var4, -(var5_int / 2) + (var7_int + 10), -2 + (mp.field_b.field_J + var6 >> 1) + var8, 2805974, -1);
                SoftwareRasterizer.restoreClip(var18);
              }
            } else {
              TextHotspotWidget.a(gq.c(-118), param0 - 2, ValidationMessageWidget.h(param0 + 107));
              ClientException.a(94);
            }
          }
        }
        if (jb.field_g != jb.field_c) {
          var3_int = Bzip2State.field_F * 256 / 16;
          if (var3_int > 0) {
            SoftwareRasterizer.fillRectAlpha(0, 0, SoftwareRasterizer.field_b, SoftwareRasterizer.field_k, 0, var3_int);
          }
        }
        if (EmailSyntaxValidator.field_n &&
          AchievementProgress.field_g) {
          mp.field_b.drawString(Integer.toString(LinkPainter.field_i), 4, 4 + mp.field_b.field_J, 16777215, -1);
          var3 = Runtime.getRuntime().totalMemory();
          var5 = Runtime.getRuntime().freeMemory();
          var7 = -var5 + var3;
          mp.field_b.drawString((int)(var7 >> 10) + "kb", 4, 2 * mp.field_b.field_J + 8, 16777215, -1);
        }
        if (param0 != 1) {
          this.shutdown(true);
        }
        WeightedCacheEntry.a(110, 0, (java.awt.Canvas) (var2), 0);
    }

    public ShatteredPlansClient() {
        this.field_G = new IntrusiveDeque();
        this.field_I = 0;
    }

    private final static void n(byte param0) {
        int var1 = 0;
        int var2 = 0;
        double var3 = 0.0;
        int var2Lifetime1;
        if (-3 != GameRules.field_c) {
          if (PasswordInputPainter.field_x != null ||
            SecondaryNodeHashTable.field_g != null) {
            return;
          }
          var1 = -320 + (RasterStateFrame.field_n % 640 << 1);
          var2 = -320 + var1;
          if (param0 != 67) {
            return;
          }
          var3 = (Math.cos(3.141592653589793 * (double)var2 / 640.0) + 1.0) * 12.0;
          if (var3 > 16.0) {
            var3 = var3 + 5.0 * (var3 - 16.0);
          }
          so.a(param0 - 67, (640 - SecondaryNodeHashTable.field_f.field_o) / 2, 10, jf.field_a);
          var2Lifetime1 = (int)var3;
          SecondaryNodeHashTable.field_f.drawAdditive((640 - SecondaryNodeHashTable.field_f.field_o) / 2, 10, 256);
          return;
        }
    }

    static {
        field_K = true;
        field_L = "Production";
        field_J = "Target: <%0> points";
    }
}
