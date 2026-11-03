/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ButtonWidget extends UiWidget {
    static PlatformTaskDispatcher field_M;
    boolean active;
    private boolean focusable;
    static boolean field_J;
    static boolean[] field_H;
    static int[] field_L;
    boolean enabled;
    private boolean focused;

    final static void a(int param0, int param1, byte param2, java.awt.Canvas param3) {
        java.awt.Graphics var4 = null;
        int var5 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        try {
          try {
            var4 = param3.getGraphics();
            OpacityWidget.field_P.drawTo(var4, param0, param1, -23820);
            var5 = 107 % ((-1 - param2) / 57);
            var4.dispose();
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = (Exception) (Object) decompiledCaughtException;
            param3.repaint();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_6_0 = var4_ref2;
          stackIn_6_1 = new StringBuilder().append("fe.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    void activateButton(int param0, int param1, int param2, int param3) {
        if (param0 != 16) {
          return;
        }
        if (null != this.listener &&
          this.listener instanceof ButtonActivationListener) {
          ((ButtonActivationListener) (this.listener)).onButtonActivated(true, param2, param3, this, param1);
        }
    }

    final static void a(boolean param0, boolean param1, boolean param2, int param3, int param4) {
        UiComponent stackIn_20_0 = null;
        boolean stackIn_21_1 = false;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_67_0 = 0;
        boolean stackIn_76_0 = false;
        int stackIn_83_0 = 0;
        boolean stackIn_131_0 = false;
        int stackIn_150_0 = 0;
        UiComponent stackIn_173_0 = null;
        boolean stackIn_174_1 = false;
        UiComponent stackIn_178_0 = null;
        boolean stackIn_179_1 = false;
        UiComponent stackIn_183_0 = null;
        boolean stackIn_184_1 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_75_0;
        boolean stackOut_130_0;
        UiComponent var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        UiComponent var6 = null;
        UiComponent var7 = null;
        UiComponent var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        String var10_ref_String = null;
        int var10 = 0;
        int var11 = 0;
        Object var11_ref = null;
        int var12 = 0;
        int[] var13_ref_int__ = null;
        int var13 = 0;
        String var13_ref_String = null;
        int var14 = 0;
        String var14_ref_String = null;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        IntrusiveDeque var17 = null;
        Object var18 = null;
        int var18_int = 0;
        LobbyPlayer var18_ref = null;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        String var22 = null;
        int[] var23 = null;
        int stackIn_53_0Lifetime1;
        int stackIn_63_0Lifetime1;
        int var13Lifetime1;
        int var18_intLifetime1;
        var18 = null;
        var19 = Pool.field_O;
        try {
          fr.$cfr$intArgs$a$e9dea5688aa5(-58, nj.field_b);
          if (null != HighscoresScreen.field_L) {
            ContentTransitionDialog.field_ob.enabled = true;
            kc.field_b.height = 0;
            var5 = kc.field_b;
            var5.width = 0;
            d.field_c.height = 0;
            var6 = d.field_c;
            var6.width = 0;
            TextHotspotRegion.field_o.height = 0;
            var7 = TextHotspotRegion.field_o;
            var7.width = 0;
            if (TikiTableScene.e((byte) 85)) {
              ii.field_e.text = rf.yourGame.toUpperCase();
              var9 = (2 + Bzip2DecoderState.field_f.width) / 2;
              kc.field_b.setBounds(Bzip2DecoderState.field_f.height - 40, 2147483647, 0, var9 - 2, 40);
              if (HighscoresScreen.field_L.field_mc < HighscoresScreen.field_L.field_Nb) {
                kc.field_b.text = LimitedRandomAccessFile.muInvitePlayers.toUpperCase();
                kc.field_b.enabled = true;
                if (var19 != 0) {
                  kc.field_b.text = ro.gameFull.toUpperCase();
                  kc.field_b.enabled = false;
                }
              } else {
                kc.field_b.text = ro.gameFull.toUpperCase();
                kc.field_b.enabled = false;
              }
              kc.field_b.frameSprites = mg.field_c.frameSprites;
              if (PoolMatchController.field_jb > 0) {
                boolean decompiledSharedTail1 = (PoolMatchController.field_jb != 1);
                if (!decompiledSharedTail1) {
                  var10_ref_String = lo.joinRequestsOne;
                  decompiledSharedTail1 = (var19 != 0);
                }
                if (decompiledSharedTail1) {
                  var10_ref_String = AccountWelcomePanel.substituteTemplateArguments(new String[]{Integer.toString(PoolMatchController.field_jb)}, -1, TutorialController.joinRequestsMany);
                }
                if ((MultiHandleSliderWidget.field_V & 16) == 0 &&
                  !AccountWelcomePanel.field_bb) {
                  kc.field_b.frameSprites = mg.field_c.activeFrameSprites;
                }
                kc.field_b.text = kc.field_b.text + "<br>" + var10_ref_String;
              }
              d.field_c.setBounds(Bzip2DecoderState.field_f.height - 40, 2147483647, var9, -var9 + Bzip2DecoderState.field_f.width, 40);
              d.field_c.text = UsernameAvailabilityValidator.startgame.toUpperCase();
              var8 = d.field_c;
              stackIn_20_0 = d.field_c;
              stackIn_21_1 = (param0) && (StrongCacheEntry.field_K == 0L);
              stackIn_20_0.enabled = stackIn_21_1;
              var10 = 2;
              if (ArchiveLoadStep.field_m != null) {
                if (null == dk.field_j) {
                  dk.field_j = new byte[dr.field_c];
                  gf.field_b = new boolean[dr.field_c];
                }
                var11 = 0;
                do {
                  if (!(var11 < dr.field_c)) {
                    var10 = 0;
                    break;
                  }
                  gf.field_b[var11] = false;
                  var11++;
                } while (var19 == 0);
                scanLoop1: while (true) {
                  if (var10 < 2) {
                    var11 = 0;
                    stackIn_67_0 = 0;
                    if (var19 != 0) {
                      break scanLoop1;
                    }
                    var12 = stackIn_67_0;
                    while (true) {
                      stackIn_36_0 = var12;
                      stackIn_36_1 = ArchiveLoadStep.field_m.length;
                      if (stackIn_36_0 < stackIn_36_1) {
                        var23 = ArchiveLoadStep.field_m[var12];
                        var21 = var23;
                        var20 = var21;
                        var13_ref_int__ = var20;
                        stackIn_63_0 = 0;
                        var14 = stackIn_63_0;
                        scanLoop2: while (true) {
                          if (var23.length > var14) {
                            var15 = var23[var14];
                            var16 = var20[1 + var14];
                            stackIn_53_0 = ~var15;
                            if (stackIn_53_0 == 0) {
                              if (0 == var10) {
                                stackIn_45_0 = HighscoresScreen.field_L.field_Nb;
                              } else {
                                stackIn_45_0 = HighscoresScreen.field_L.field_mc;
                              }
                              var17_int = stackIn_45_0;
                              if (~var17_int != ~var16) {
                                break scanLoop2;
                              }
                            } else {
                              if (var16 != (HighscoresScreen.field_L.settings[var15] & 255)) {
                                break scanLoop2;
                              }
                            }
                            var14 += 2;
                            continue;
                          }
                          var11 = 1;
                          var14 = -1;
                          stackIn_53_0Lifetime1 = 0;
                          var15 = stackIn_53_0Lifetime1;
                          while (var23.length > var15) {
                            var16 = var23[var15];
                            stackIn_36_0 = ~var16;
                            stackIn_36_1 = ~var14;
                            if (stackIn_36_0 < stackIn_36_1) {
                              var14 = var16;
                            }
                            var15 += 2;
                          }
                          gf.field_b[var14] = true;
                          break;
                        }
                        var12++;
                        continue;
                      }
                      break;
                    }
                    stackIn_63_0Lifetime1 = var11;
                    if (stackIn_63_0Lifetime1 == 0) {
                      var10++;
                      continue;
                    }
                  }
                  stackIn_67_0 = ~TutorialController.field_i;
                  break;
                }
                if (stackIn_67_0 <= -3 &&
                  TextLineLayout.field_c[12]) {
                  var10 = 2;
                }
              }
              boolean decompiledFrameRemainder0 = true;
              if (var10 < 2) {
                d.field_c.enabled = false;
                decompiledFrameRemainder0 = !(!d.field_c.hovered);
                if (decompiledFrameRemainder0) {
                  var11_ref = null;
                  var12 = 0;
                  var13 = 0;
                  while (true) {
                    if (var13 < dr.field_c) {
                      stackOut_75_0 = gf.field_b[var13];
                      stackIn_83_0 = stackOut_75_0 ? 1 : 0;
                      stackIn_76_0 = stackOut_75_0;
                      if (var19 == 0) {
                        if (stackIn_76_0) {
                          var22 = "<col=A00000>" + ck.field_R[var13] + "</col>";
                          if (var11_ref == null) {
                            var11_ref = var22;
                          } else {
                            var11_ref = (String) (var11_ref) + ", " + var22;
                            var12 = 1;
                          }
                        }
                        var13++;
                        continue;
                      }
                    } else {
                      stackIn_83_0 = -1;
                    }
                    break;
                  }
                  if (stackIn_83_0 != ~var10) {
                    var13_ref_String = NameEntryPopup.gameoptBadnumplayers;
                    boolean decompiledSharedTail0 = (var12 == 0);
                    if (!decompiledSharedTail0) {
                      var14_ref_String = ab.gameoptInviteplayersOrTrychanging2 + (String) (var11_ref);
                      decompiledSharedTail0 = (var19 != 0);
                    }
                    if (decompiledSharedTail0) {
                      var14_ref_String = AccountWelcomePanel.substituteTemplateArguments(new String[]{(String) (var11_ref)}, -1, EmailAvailabilityValidator.gameoptInviteplayersOrTrychanging1);
                    }
                  } else {
                    var13_ref_String = ah.gameoptUnselectedoptions;
                    if (var12 == 0) {
                      var14_ref_String = AccountWelcomePanel.substituteTemplateArguments(new String[]{(String) (var11_ref)}, -1, ArrayWidgetGroup.gameoptPleaseselectoption1);
                      if (var19 != 0) {
                        var14_ref_String = SingleChildWidget.gameoptPleaseselectoption2 + (String) (var11_ref);
                      }
                    } else {
                      var14_ref_String = SingleChildWidget.gameoptPleaseselectoption2 + (String) (var11_ref);
                    }
                  }
                  CacheEntry.field_B = "<col=A00000>" + var13_ref_String + "<br>" + var14_ref_String;
                }
              }
              if ((decompiledFrameRemainder0) && (!(var10 < 2) || var19 != 0) && (null != Pocket.field_j ||
                null != DebugTuningSlider.field_d ||
                w.field_j != null ||
                null != op.field_a)) {
                var11 = 0;
                var12 = 0;
                var13Lifetime1 = 0;
                var14 = 0;
                var15 = 0;
                var16 = 0;
                boolean decompiledNaturalLoopExit0 = false;
                while (!(decompiledNaturalLoopExit0 = (!(dr.field_c > var16)))) {
                  var17_int = HighscoresScreen.field_L.settings[var16] & 255;
                  if (var19 == 0) {
                    if (Pocket.field_j != null &&
                      null != Pocket.field_j[var16] &&
                      Pocket.field_j[var16][var17_int]) {
                      var11 = 1;
                    }
                    if (DebugTuningSlider.field_d != null &&
                      null != DebugTuningSlider.field_d[var16]) {
                      var18_int = DebugTuningSlider.field_d[var16][var17_int];
                      if (var18_int > var13Lifetime1) {
                        var13Lifetime1 = var18_int;
                      }
                      if (var18_int != 0 &&
                        !DualLinkNode.field_s) {
                        var11 = 1;
                      }
                    }
                    if (op.field_a != null &&
                      op.field_a[var16] != null) {
                      var15 = var15 | op.field_a[var16][var17_int];
                    }
                    if (null != w.field_j &&
                      w.field_j[var16] != null) {
                      var18_intLifetime1 = w.field_j[var16][var17_int];
                      if (var18_intLifetime1 > var14) {
                        var14 = var18_intLifetime1;
                      }
                      if (0 != var18_intLifetime1 &&
                        !DualLinkNode.field_s) {
                        var11 = 1;
                      }
                    }
                    var16++;
                    continue;
                  }
                  break;
                }
                if (decompiledNaturalLoopExit0) {
                  var16 = 0;
                }
                var17 = DualLinkDeque.field_f.content.children;
                var18_ref = (LobbyPlayer) (var17.last((byte) 96));
                scanLoop3: while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (var18_ref != null) {
                    stackOut_130_0 = var18_ref.isUnindexed(true);
                    stackIn_150_0 = stackOut_130_0 ? 1 : 0;
                    stackIn_131_0 = stackOut_130_0;
                    if (var19 != 0) {
                      break scanLoop3;
                    }
                    if (!stackIn_131_0 ||
                      var19 != 0) {
                      if (var11 != 0 &&
                        !var18_ref.field_Pb) {
                        var16 = 1;
                        decompiledFrameRemainder1 = false;
                      }
                      else {
                        if (var13Lifetime1 > var18_ref.field_Rb) {
                          var16 = 1;
                          decompiledFrameRemainder1 = false;
                        }
                        else {
                          if (var18_ref.field_Xb < var14) {
                            var16 = 1;
                            decompiledFrameRemainder1 = false;
                          }
                          else {
                            if (0 < (var15 & ~var18_ref.field_Nb)) {
                              var16 = 1;
                              decompiledFrameRemainder1 = false;
                            }
                            else {
                              if (var12 != 0) {
                                var16 = 1;
                                decompiledFrameRemainder1 = false;
                              }
                            }
                          }
                        }
                      }
                    }
                    if (decompiledFrameRemainder1) {
                      var18_ref = (LobbyPlayer) (var17.previous((byte) -5));
                      continue;
                    }
                  }
                  stackIn_150_0 = TutorialController.field_i;
                  break;
                }
                if (stackIn_150_0 >= 2 &&
                  TextLineLayout.field_c[12]) {
                  var16 = 0;
                }
                if (var16 != 0) {
                  d.field_c.enabled = false;
                  if (d.field_c.hovered) {
                    if (na.field_e.field_i.selectedTab != 0) {
                      CacheEntry.field_B = AccountWelcomePanel.substituteTemplateArguments(new String[]{Camera.muChatGame}, -1, t.gameoptPlayersdontqualifySelectgametab);
                      if (var19 != 0) {
                        CacheEntry.field_B = QuickChatHelpDialog.gameoptPlayersdontqualify;
                      }
                    } else {
                      CacheEntry.field_B = QuickChatHelpDialog.gameoptPlayersdontqualify;
                    }
                  }
                }
              }
              if (var19 != 0) {
                var9_ref_String = HighscoresScreen.field_L.field_Ob;
                ii.field_e.text = AccountWelcomePanel.substituteTemplateArguments(new String[]{var9_ref_String}, -1, th.xsGame).toUpperCase();
                TextHotspotRegion.field_o.setBounds(-40 + Bzip2DecoderState.field_f.height, 2147483647, 0, Bzip2DecoderState.field_f.width, 40);
                TextHotspotRegion.field_o.text = AccountWelcomePanel.substituteTemplateArguments(new String[]{var9_ref_String}, -1, PasswordValidator.waitingForXToStartGame);
                var8 = TextHotspotRegion.field_o;
              }
            } else {
              var9_ref_String = HighscoresScreen.field_L.field_Ob;
              ii.field_e.text = AccountWelcomePanel.substituteTemplateArguments(new String[]{var9_ref_String}, -1, th.xsGame).toUpperCase();
              TextHotspotRegion.field_o.setBounds(-40 + Bzip2DecoderState.field_f.height, 2147483647, 0, Bzip2DecoderState.field_f.width, 40);
              TextHotspotRegion.field_o.text = AccountWelcomePanel.substituteTemplateArguments(new String[]{var9_ref_String}, -1, PasswordValidator.waitingForXToStartGame);
              var8 = TextHotspotRegion.field_o;
            }
            if (StrongCacheEntry.field_K != 0L) {
              var9 = (int)(-rl.monotonicTimeMillis((byte) -94) + StrongCacheEntry.field_K);
              var9 = (999 + var9) / 1000;
              if (var9 < 1) {
                var9 = 1;
              }
              var8.text = AccountWelcomePanel.substituteTemplateArguments(new String[]{Integer.toString(var9)}, -1, WireframeQuad.gameOptionsChanged);
            }
            MarkerSliderPainter.field_c.text = AccountWelcomePanel.substituteTemplateArguments(new String[]{Integer.toString(HighscoresScreen.field_L.field_mc), Integer.toString(HighscoresScreen.field_L.field_Nb)}, -1, qa.playersXOfY);
          }
          stackIn_173_0 = so.field_k;
          stackIn_174_1 = (param2) && (!param1) && (!AccountWelcomePanel.field_bb);
          ((UiComponent) (Object) stackIn_173_0).updateRoot(stackIn_174_1, false);
          stackIn_178_0 = Bzip2DecoderState.field_f;
          stackIn_179_1 = (param2) && (!param1) && (!AccountWelcomePanel.field_bb);
          ((UiComponent) (Object) stackIn_178_0).updateRoot(stackIn_179_1, false);
          var5_int = 92 / ((0 - param3) / 63);
          stackIn_183_0 = de.field_b;
          stackIn_184_1 = (param2) && (!param1) && (AccountWelcomePanel.field_bb);
          ((UiComponent) (Object) stackIn_183_0).updateRoot(stackIn_184_1, false);
          na.field_e.field_i.processTabPresses(true);
          if (null != HighscoresScreen.field_L) {
            if (ContentTransitionDialog.field_ob.pressedButton != 0) {
              AccountCreationForm.a(HighscoresScreen.field_L.getGameId(20872), true, param4);
            }
            if (kc.field_b.pressedButton != 0) {
              AccountWelcomePanel.field_bb = true;
            }
            if (d.field_c.pressedButton != 0) {
              HighscoresScreen.field_N = true;
            }
            if (AccountContentDialog.field_vb.pressedButton != 0) {
              AccountWelcomePanel.field_bb = false;
            }
            RankingsScreen.a(param4, HighscoresScreen.field_L, 0, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var5_ref), "fe.GA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean a(int[] param0, int param1, int param2) {
        RuntimeException var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -13671) {
            ButtonWidget.a((int[]) null, 103, 77);
          }
          stackIn_5_0 = ((param0[param2 >> 5] & 1 << (param2 & 31)) != 0);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("fe.BA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void clearKeyboardFocus(byte param0) {
        if (param0 != 99) {
          field_J = true;
        }
        if (this.focused) {
          this.focused = false;
          if (this.listener != null &&
            this.listener instanceof KeyboardFocusListener) {
            ((KeyboardFocusListener) (this.listener)).onKeyboardFocusChanged(param0 ^ 17634, this.focused, (UiWidget) (this));
          }
        }
    }

    void updatePointerState(UiWidget param0, int param1, int param2, int param3) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.updatePointerState(param0, param1, param2, param3);
          if (this.pressedPointerButton != 0) {
            if (~cd.field_b == ~this.pressedPointerButton) {
              return;
            }
            if (this.containsPointer(param2, param3, wn.field_i, -1, DebouncedValidationProvider.field_f) &&
              cd.field_b == 0) {
              this.activateButton(16, -param2 + wn.field_i, -param3 + DebouncedValidationProvider.field_f, this.pressedPointerButton);
            }
            this.handlePointerRelease(param2, wn.field_i, param3, DebouncedValidationProvider.field_f, (byte) 115, param0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("fe.S(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    boolean handleKeyInput(char param0, int param1, boolean param2, UiWidget param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2) {
            return false;
          }
          if (!this.hasKeyboardFocus(73)) {
            return false;
          }
          if (param1 != 84 &&
            param1 != 83) {
            return false;
          }
          this.activateButton(16, -1, -1, 1);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("fe.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final boolean hasKeyboardFocus(int param0) {
        int var2 = 81 % ((param0 - 7) / 48);
        return this.focused;
    }

    boolean handlePointerPress(UiWidget param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2) {
            return false;
          }
          if (this.enabled &&
            this.containsPointer(param1, param5, param6, -1, param4)) {
            this.requestKeyboardFocus(param0, (byte) 122);
            this.pressedPointerButton = param3;
            if (this.listener != null &&
              this.listener instanceof bn) {
              ((bn) (this.listener)).a((byte) -123, param5, this, param1, param3, param6, param4);
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_14_0 = var8;
          stackIn_14_1 = new StringBuilder().append("fe.AA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static String a(boolean param0, byte param1, CharSequence param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_4_0 = null;
        boolean stackIn_8_0 = false;
        String stackIn_11_0 = null;
        int stackIn_14_0 = 0;
        Object stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_7_0;
        var5 = Pool.field_O;
        try {
          var3 = CachedArchiveSource.a(param0, param2, (byte) 117);
          if (var3 != null) {
            stackIn_4_0 = var3;
            return stackIn_4_0;
          }
          var4 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(param2.length() > var4)))) {
            stackOut_7_0 = uc.isNameCharacter(param2.charAt(var4), (byte) -51);
            stackIn_14_0 = stackOut_7_0 ? 1 : 0;
            stackIn_8_0 = stackOut_7_0;
            if (var5 == 0) {
              if (!stackIn_8_0) {
                stackIn_11_0 = RasterBuffer.createAlertNamechars;
                return stackIn_11_0;
              }
              var4++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_14_0 = param1;
          }
          if (stackIn_14_0 > 66) {
            return null;
          }
          ButtonWidget.a(7, -120, (byte) 100, (java.awt.Canvas) null);
          stackIn_17_0 = null;
          return (String) (stackIn_17_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("fe.DA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final StringBuilder appendWidgetDiagnostics(StringBuilder param0, int param1, Hashtable param2, int param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_8_0 = null;
        StringBuilder stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.beginWidgetDiagnosticVisit(param1, param2, param0, -1)) {
            this.appendWidgetDiagnosticProperties(1, param2, param0, param1);
            if (this.active) {
              discarded$2 = param0.append(" active");
            }
            if (!this.enabled) {
              discarded$3 = param0.append(" disabled");
            }
          }
          if (param3 > 13) {
            stackIn_10_0 = (StringBuilder) (param0);
            return stackIn_10_0;
          }
          stackIn_8_0 = (StringBuilder) null;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("fe.EA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_L = null;
        if (param0 != 72) {
          field_J = false;
        }
        field_H = null;
        field_M = null;
    }

    ButtonWidget(String param0, WidgetListener param1) {
        this(param0, VerticalScrollbar.field_Sb.field_l, param1);
    }

    boolean requestKeyboardFocus(UiWidget param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.enabled &&
            this.focusable) {
            param0.clearKeyboardFocus((byte) 99);
            this.focused = true;
            if (this.listener != null &&
              this.listener instanceof KeyboardFocusListener) {
              ((KeyboardFocusListener) (this.listener)).onKeyboardFocusChanged(17537, this.focused, (UiWidget) (this));
            }
            var3_int = 113 % ((param1 + 43) / 47);
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("fe.M(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    ButtonWidget(String param0, WidgetPainter param1, WidgetListener param2) {
        super(param0, param1, param2);
        this.enabled = true;
        this.focusable = true;
        this.focused = false;
    }

    protected ButtonWidget() {
        this.enabled = true;
        this.focusable = true;
        this.focused = false;
        this.renderer = VerticalScrollbar.field_Sb.field_k;
    }

    final void handlePointerRelease(int param0, int param1, int param2, int param3, byte param4, UiWidget param5) {
        try {
          if (null != this.listener &&
            this.listener instanceof bn) {
            ((bn) (this.listener)).a(param3, this, param2, param0, -116, param1);
          }
          if (param4 <= 62) {
            this.handlePointerPress((UiWidget) null, -88, true, 21, -27, 5, -59);
          }
          this.pressedPointerButton = 0;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "fe.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_H = new boolean[64];
        field_L = new int[8192];
        field_J = true;
    }
}
