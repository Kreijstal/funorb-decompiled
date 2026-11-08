/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class DelegatingCanvas extends java.awt.Canvas {
    private java.awt.Component field_g;
    static double field_h;
    static String field_a;
    static int field_e;
    static byte[][] field_b;
    static String[][] field_d;
    static int field_f;
    static MusicTrack[] field_c;

    final static void openExternalUrl(String param0, java.applet.Applet param1, boolean param2, byte param3) {
        try {
          int var4_int = 0;
          if (PlatformTaskDispatcher.field_s.startsWith("win") &&
            StatusDialog.openUrlWithWindowsShell((byte) 118, param0)) {
            return;
          }
          var4_int = 89 / ((param3 + 46) / 63);
          try {
            param1.getAppletContext().showDocument(new java.net.URL(param0), "_blank");
          } catch (java.net.MalformedURLException malformedURLException) {
            DelegatingCanvas.reportError((Throwable) null, "MGR1: " + param0, (byte) 20);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void updateBattleTurn(int param0, boolean param1) {
        BattleUnit dupTemp$0 = null;
        int var3;
        BattleUnit var4;
        BattleUnit var5;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (StatefulTextPainter.field_p == 0) {
          MessageDialog.field_ob.field_X = false;
          MessageDialog.field_ob.field_H = false;
          MessageDialog.field_ob.field_g = false;
          if (0 != WhirlpoolHasher.field_k) {
            if (WhirlpoolHasher.field_k != 1) {
              if (WhirlpoolHasher.field_k == 2) {
                MessageDialog.field_ob.field_B = true;
                IntrusiveNodeHashTable.field_f = SpriteTrimHelpers.field_c;
                ChatPanel.resetFadeTimer(-127);
                ArrayWidgetContainer.field_A = 400;
              } else {
                if (WhirlpoolHasher.field_k != 3) {
                  if (4 == WhirlpoolHasher.field_k) {
                    IntrusiveNodeHashTable.field_f = TextHotspotWidget.field_Q;
                    if (DropdownList.field_N != 12 &&
                      !GradientBarButton.field_O.isTurnFinished((byte) 89)) {
                      IntrusiveNodeHashTable.field_f = TooltipHelpers.field_i;
                    }
                    if (BattleResetHelpers.countUnitsOfType40(-20675) <= 2) {
                      WhirlpoolHasher.field_k = 5;
                    }
                    ArrayWidgetContainer.field_A = 400;
                  } else {
                    if (WhirlpoolHasher.field_k == 5) {
                      IntrusiveNodeHashTable.field_f = GuardHelpers.field_b;
                      if (BattleResetHelpers.countUnitsOfType40(param0 - 20672) <= 1) {
                        WhirlpoolHasher.field_k = 6;
                      }
                    } else {
                      if (WhirlpoolHasher.field_k == 6) {
                        IntrusiveNodeHashTable.field_f = PendingMessageHelpers.field_f;
                      }
                    }
                  }
                } else {
                  if (DropdownList.field_N == 12) {
                    WhirlpoolHasher.field_k = 4;
                  }
                  ArrayWidgetContainer.field_A = 500;
                  IntrusiveNodeHashTable.field_f = KeepAliveHelpers.field_a;
                }
              }
            } else {
              IntrusiveNodeHashTable.field_f = CipherPacketBuffer.field_s;
              MessageDialog.field_ob.field_B = true;
              ChatPanel.resetFadeTimer(1);
            }
          } else {
            IntrusiveNodeHashTable.field_f = WidgetStyleLayer.field_f;
            MessageDialog.field_ob.field_B = true;
            ChatPanel.resetFadeTimer(97);
            ArrayWidgetContainer.field_A = 400;
          }
        }
        if (StatefulTextPainter.field_p == 1) {
          MessageDialog.field_ob.field_H = false;
          MessageDialog.field_ob.field_g = false;
          MessageDialog.field_ob.field_X = false;
          if (WhirlpoolHasher.field_k == 0) {
            IntrusiveNodeHashTable.field_f = WrappedTextLayout.field_m;
            MessageDialog.field_ob.field_B = true;
            ChatPanel.resetFadeTimer(-115);
            ArrayWidgetContainer.field_A = 400;
          } else {
            if (WhirlpoolHasher.field_k == 1) {
              if (DropdownList.field_N == 14) {
                WhirlpoolHasher.field_k = 2;
              }
              ArrayWidgetContainer.field_A = 500;
              IntrusiveNodeHashTable.field_f = StatusDialog.field_Mb;
            } else {
              if (2 != WhirlpoolHasher.field_k) {
                if (3 != WhirlpoolHasher.field_k) {
                  if (WhirlpoolHasher.field_k == 4) {
                    IntrusiveNodeHashTable.field_f = DirectByteStorage.field_i;
                  }
                } else {
                  IntrusiveNodeHashTable.field_f = FadingModalPanel.field_D;
                  if (1 >= BattleResetHelpers.countUnitsOfType40(param0 ^ 20672)) {
                    WhirlpoolHasher.field_k = 4;
                  }
                }
              } else {
                IntrusiveNodeHashTable.field_f = ValidationStatusIcon.field_R;
                if (DropdownList.field_N != 14 &&
                  !GradientBarButton.field_O.isTurnFinished((byte) 89)) {
                  IntrusiveNodeHashTable.field_f = LabeledField.field_E;
                }
                if (BattleResetHelpers.countUnitsOfType40(param0 - 20672) <= 2) {
                  WhirlpoolHasher.field_k = 3;
                }
                ArrayWidgetContainer.field_A = 400;
              }
            }
          }
        }
        if (2 == StatefulTextPainter.field_p) {
          MessageDialog.field_ob.field_H = false;
          MessageDialog.field_ob.field_X = false;
          MessageDialog.field_ob.field_g = false;
          if (WhirlpoolHasher.field_k == 0) {
            IntrusiveNodeHashTable.field_f = ThreeButtonPanel.field_D;
            MessageDialog.field_ob.field_B = true;
            ChatPanel.resetFadeTimer(-128);
            ArrayWidgetContainer.field_A = 400;
          } else {
            if (WhirlpoolHasher.field_k != 1) {
              if (WhirlpoolHasher.field_k != 2) {
                if (WhirlpoolHasher.field_k != 3) {
                  if (WhirlpoolHasher.field_k == 4) {
                    if (!GradientBarButton.field_O.isTurnFinished((byte) 89)) {
                      IntrusiveNodeHashTable.field_f = DualLinkNode.field_h;
                    }
                    if (BattleResetHelpers.countUnitsOfType40(-20675) <= 2) {
                      WhirlpoolHasher.field_k = 5;
                    }
                  } else {
                    if (WhirlpoolHasher.field_k == 5) {
                      IntrusiveNodeHashTable.field_f = DateHelpers.field_g;
                      if (BattleResetHelpers.countUnitsOfType40(-20675) <= 1) {
                        WhirlpoolHasher.field_k = 6;
                      }
                    } else {
                      if (WhirlpoolHasher.field_k == 6) {
                        IntrusiveNodeHashTable.field_f = ValueListPainter.field_d;
                      }
                    }
                  }
                } else {
                  IntrusiveNodeHashTable.field_f = StatsSendHelpers.field_d;
                  if (GradientBarButton.field_O.isTurnFinished((byte) 89)) {
                    WhirlpoolHasher.field_k = 4;
                  }
                  if (-1000 == MessageDialog.field_ob.field_s) {
                    WhirlpoolHasher.field_k = 2;
                  }
                  if (BattleResetHelpers.countUnitsOfType40(-20675) <= 2) {
                    WhirlpoolHasher.field_k = 5;
                  }
                  ArrayWidgetContainer.field_A = 320;
                }
              } else {
                IntrusiveNodeHashTable.field_f = NameCheckHelpers.field_h;
                if (0 != DropdownList.field_N) {
                  WhirlpoolHasher.field_k = 1;
                }
                ArrayWidgetContainer.field_A = 400;
                if (MessageDialog.field_ob.field_s != -1000) {
                  WhirlpoolHasher.field_k = 3;
                }
              }
            } else {
              IntrusiveNodeHashTable.field_f = ValidationStatusIcon.field_N;
              ArrayWidgetContainer.field_A = 500;
              if (DropdownList.field_N == 0) {
                WhirlpoolHasher.field_k = 2;
              }
            }
          }
        }
        if (3 == StatefulTextPainter.field_p) {
          MessageDialog.field_ob.field_X = false;
          MessageDialog.field_ob.field_H = false;
          MessageDialog.field_ob.field_g = false;
          if (WhirlpoolHasher.field_k == 0) {
            if (20 == DropdownList.field_N) {
              WhirlpoolHasher.field_k = 1;
            }
            IntrusiveNodeHashTable.field_f = GzipDecoder.field_f;
            if (BattleResetHelpers.countUnitsOfType40(-20675) <= 2) {
              WhirlpoolHasher.field_k = 2;
            }
          } else {
            if (1 == WhirlpoolHasher.field_k) {
              IntrusiveNodeHashTable.field_f = MessageDialog.field_jb;
              if (20 != DropdownList.field_N &&
                !GradientBarButton.field_O.isTurnFinished((byte) 89)) {
                WhirlpoolHasher.field_k = 0;
              }
              if (BattleResetHelpers.countUnitsOfType40(param0 ^ 20672) <= 2) {
                WhirlpoolHasher.field_k = 2;
              }
              ArrayWidgetContainer.field_A = 400;
            } else {
              if (2 == WhirlpoolHasher.field_k) {
                IntrusiveNodeHashTable.field_f = SectorCacheStore.field_h;
                if (BattleResetHelpers.countUnitsOfType40(-20675) <= 1) {
                  WhirlpoolHasher.field_k = 3;
                }
              } else {
                if (WhirlpoolHasher.field_k == 3) {
                  IntrusiveNodeHashTable.field_f = DirectByteStorage.field_i;
                }
              }
            }
          }
        }
        if (StatefulTextPainter.field_p == 4) {
          MessageDialog.field_ob.field_X = false;
          MessageDialog.field_ob.field_H = false;
          MessageDialog.field_ob.field_g = false;
          if (WhirlpoolHasher.field_k <= 2 &&
            520 > GradientBarButton.field_O.getUnitByOwner(0, true).field_lb) {
            WhirlpoolHasher.field_k = 8;
          }
          if (0 != WhirlpoolHasher.field_k) {
            if (WhirlpoolHasher.field_k == 1) {
              IntrusiveNodeHashTable.field_f = TextButton.field_x;
              MessageDialog.field_ob.field_B = true;
              ChatPanel.resetFadeTimer(param0 - 113);
              ArrayWidgetContainer.field_A = 500;
            } else {
              if (2 == WhirlpoolHasher.field_k) {
                IntrusiveNodeHashTable.field_f = QuickChatPhraseCache.field_f;
                if (GradientBarButton.field_O.getUnitByOwner(0, true).field_lb > 1300) {
                  WhirlpoolHasher.field_k = 3;
                }
                ArrayWidgetContainer.field_A = 300;
                ChatPanel.resetFadeTimer(-128);
              } else {
                if (WhirlpoolHasher.field_k != 3) {
                  if (WhirlpoolHasher.field_k != 4) {
                    if (WhirlpoolHasher.field_k != 5) {
                      if (WhirlpoolHasher.field_k != 6) {
                        if (7 != WhirlpoolHasher.field_k) {
                          if (WhirlpoolHasher.field_k == 8) {
                            if (DropdownList.field_N == 10) {
                              WhirlpoolHasher.field_k = 4;
                            }
                            IntrusiveNodeHashTable.field_f = ScreenDisplayMode.field_b;
                          }
                        } else {
                          IntrusiveNodeHashTable.field_f = IsaacRandom.field_c;
                          if (GradientBarButton.field_O.getUnitByOwner(0, true).field_lb < 516) {
                            WhirlpoolHasher.field_k = 6;
                          }
                        }
                      } else {
                        IntrusiveNodeHashTable.field_f = EmptyPainter.field_c;
                      }
                    } else {
                      if (GradientBarButton.field_O.getUnitByOwner(3, true) == null) {
                        IntrusiveNodeHashTable.field_f = StatsSendHelpers.field_f;
                      } else {
                        IntrusiveNodeHashTable.field_f = PasswordValidator.field_u;
                      }
                      if (BattleResetHelpers.countUnitsOfType40(-20675) <= 1) {
                        WhirlpoolHasher.field_k = 6;
                      }
                      if (null == GradientBarButton.field_O.getUnitByOwner(2, true) &&
                        null == GradientBarButton.field_O.getUnitByOwner(3, true)) {
                        WhirlpoolHasher.field_k = 7;
                      }
                    }
                  } else {
                    IntrusiveNodeHashTable.field_f = MidiPcmStream.field_o;
                    if (BattleResetHelpers.countUnitsOfType40(-20675) <= 2) {
                      WhirlpoolHasher.field_k = 5;
                    }
                  }
                } else {
                  if (DropdownList.field_N == 10) {
                    WhirlpoolHasher.field_k = 4;
                  }
                  ArrayWidgetContainer.field_A = 320;
                  IntrusiveNodeHashTable.field_f = LoginPanel.field_D;
                }
              }
            }
          } else {
            MessageDialog.field_ob.field_B = true;
            IntrusiveNodeHashTable.field_f = QueuedPacket.field_n;
            ChatPanel.resetFadeTimer(19);
            ArrayWidgetContainer.field_A = 400;
          }
          if (GradientBarButton.field_O.getUnitByOwner(0, true).field_db > 800) {
            WhirlpoolHasher.field_k = -Math.abs(WhirlpoolHasher.field_k);
          }
          if (WhirlpoolHasher.field_k < 0) {
            IntrusiveNodeHashTable.field_f = MusicCrossfadeStream.field_u;
            if (800 > GradientBarButton.field_O.getUnitByOwner(0, true).field_db) {
              if (GradientBarButton.field_O.getUnitByOwner(0, true).field_lb < 800) {
                WhirlpoolHasher.field_k = -WhirlpoolHasher.field_k;
              }
              if (GradientBarButton.field_O.getUnitByOwner(0, true).field_lb > 1200) {
                WhirlpoolHasher.field_k = -WhirlpoolHasher.field_k;
              }
            }
            ChatPanel.resetFadeTimer(param0 + 36);
            ArrayWidgetContainer.field_A = 400;
          }
        }
        if (StatefulTextPainter.field_p == 5) {
          MessageDialog.field_ob.field_X = false;
          MessageDialog.field_ob.field_H = false;
          MessageDialog.field_ob.field_g = false;
          if (GradientBarButton.field_O.getUnitByOwner(0, true) == null) {
            ScreenSwitchHelpers.switchScreen(true, true, 14, MatchingFieldValidator.field_r);
            BattleResetHelpers.resetBattleState(114);
            return;
          }
          var4 = GradientBarButton.field_O.getUnitByOwner(MessageDialog.field_ob.field_bb, true);
          if (0 == WhirlpoolHasher.field_k) {
            ArrayWidgetContainer.field_A = 400;
            if (DropdownList.field_N == 6) {
              WhirlpoolHasher.field_k = 1;
            }
            IntrusiveNodeHashTable.field_f = TutorialCaptionGlobals.field_a;
          } else {
            if (WhirlpoolHasher.field_k != 1) {
              if (WhirlpoolHasher.field_k == 2) {
                if (var4 == null) {
                }
                IntrusiveNodeHashTable.field_f = PairedSceneWidget.field_Cb;
              } else {
                if (WhirlpoolHasher.field_k != 3) {
                  if (WhirlpoolHasher.field_k != 4) {
                    if (WhirlpoolHasher.field_k != 5) {
                      if (WhirlpoolHasher.field_k == 6) {
                        IntrusiveNodeHashTable.field_f = CameraFollowTarget.field_e;
                        if (BattleResetHelpers.countUnitsOfType40(param0 - 20672) <= 1) {
                          WhirlpoolHasher.field_k = 7;
                        }
                      } else {
                        if (WhirlpoolHasher.field_k == 7) {
                          IntrusiveNodeHashTable.field_f = DiskCacheWorker.field_f;
                        }
                      }
                    } else {
                      IntrusiveNodeHashTable.field_f = SceneWidgetNode.field_o;
                      if (null == GradientBarButton.field_O.getUnitByOwner(1, true) ||
                        null == GradientBarButton.field_O.getUnitByOwner(2, true) ||
                        null == GradientBarButton.field_O.getUnitByOwner(3, true) ||
                        GradientBarButton.field_O.getUnitByOwner(1, true).field_jb != 40 ||
                        GradientBarButton.field_O.getUnitByOwner(2, true).field_jb != 40 ||
                        GradientBarButton.field_O.getUnitByOwner(3, true).field_jb != 40) {
                        WhirlpoolHasher.field_k = 6;
                      }
                    }
                  } else {
                    IntrusiveNodeHashTable.field_f = PasswordFieldPainter.field_E;
                    if (var4 == null ||
                      var4.field_jb != 11) {
                      WhirlpoolHasher.field_k = 5;
                    }
                    if (DropdownList.field_N != 120) {
                      WhirlpoolHasher.field_k = 5;
                    }
                    if (GradientBarButton.field_O.getUnitByOwner(1, true) == null ||
                      GradientBarButton.field_O.getUnitByOwner(2, true) == null ||
                      GradientBarButton.field_O.getUnitByOwner(3, true) == null ||
                      GradientBarButton.field_O.getUnitByOwner(1, true).field_jb != 40 ||
                      GradientBarButton.field_O.getUnitByOwner(2, true).field_jb != 40 ||
                      GradientBarButton.field_O.getUnitByOwner(3, true).field_jb != 40) {
                      WhirlpoolHasher.field_k = 6;
                    }
                  }
                } else {
                  IntrusiveNodeHashTable.field_f = GradientPanelPainter.field_b;
                  if (GradientBarButton.field_O.getUnitByOwner(1, true) == null ||
                    GradientBarButton.field_O.getUnitByOwner(2, true) == null ||
                    GradientBarButton.field_O.getUnitByOwner(3, true) == null ||
                    40 != GradientBarButton.field_O.getUnitByOwner(1, true).field_jb ||
                    GradientBarButton.field_O.getUnitByOwner(2, true).field_jb != 40 ||
                    GradientBarButton.field_O.getUnitByOwner(3, true).field_jb != 40) {
                    WhirlpoolHasher.field_k = 6;
                  }
                  if (var4 == null ||
                    var4.field_jb != 11) {
                    WhirlpoolHasher.field_k = 2;
                  }
                  if (120 == DropdownList.field_N) {
                    WhirlpoolHasher.field_k = 4;
                  }
                  ArrayWidgetContainer.field_A = 460;
                }
              }
            } else {
              IntrusiveNodeHashTable.field_f = ValidationStatusIcon.field_M;
              if (GradientBarButton.field_O.countUnits(12) >= 3) {
                WhirlpoolHasher.field_k = 2;
              }
              ArrayWidgetContainer.field_A = 400;
            }
          }
          if (GradientBarButton.field_O.getUnitByOwner(0, true).field_db > 800) {
            WhirlpoolHasher.field_k = -Math.abs(WhirlpoolHasher.field_k);
          }
          if (0 > WhirlpoolHasher.field_k) {
            {
              IntrusiveNodeHashTable.field_f = OverlayHelpers.field_c;
              if ((var4 == null ||
                var4.field_jb == 0) && DropdownList.field_N != 6) {
                if (var4 == null) {
                } else if (250 <= var4.field_ib) {
                } else {
                  IntrusiveNodeHashTable.field_f = PasswordFieldPainter.field_y;
                }
              } else {
                WhirlpoolHasher.field_k = -WhirlpoolHasher.field_k;
                GradientBarButton.field_O.getUnitByOwner(0, true).field_ib = 250;
              }
            }
            ArrayWidgetContainer.field_A = 400;
          }
          if (GradientBarButton.field_O.getUnitByOwner(0, true).field_ib < 250) {
            WhirlpoolHasher.field_k = -Math.abs(WhirlpoolHasher.field_k);
            MessageDialog.field_ob.field_bb = GradientBarButton.field_O.getUnitByOwner(0, true).field_T;
            if (240 > GradientBarButton.field_O.getUnitByOwner(0, true).field_ib) {
              dupTemp$0 = GradientBarButton.field_O.getUnitByOwner(0, true);
              dupTemp$0.field_ib = dupTemp$0.field_ib + 1;
            }
          }
        }
        if (StatefulTextPainter.field_p == 6) {
          if (null == GradientBarButton.field_O.getUnitByOwner(0, true)) {
            ScreenSwitchHelpers.switchScreen(true, true, 14, MatchingFieldValidator.field_r);
            BattleResetHelpers.resetBattleState(108);
            return;
          }
          if (WhirlpoolHasher.field_k == 0) {
            IntrusiveNodeHashTable.field_f = GameAppletShell.field_g;
            MessageDialog.field_ob.field_B = true;
            MessageDialog.field_ob.field_z = 1500;
            ChatPanel.resetFadeTimer(45);
            MessageDialog.field_ob.field_H = false;
            MessageDialog.field_ob.field_X = false;
            ArrayWidgetContainer.field_A = 400;
            MessageDialog.field_ob.field_g = false;
          } else {
            if (WhirlpoolHasher.field_k == 1) {
              IntrusiveNodeHashTable.field_f = QuickChatCaptionGlobals.field_a;
              MessageDialog.field_ob.field_B = true;
              MessageDialog.field_ob.field_z = 1500;
              ChatPanel.resetFadeTimer(param0 - 115);
              MessageDialog.field_ob.field_X = false;
              MessageDialog.field_ob.field_H = false;
            } else {
              if (2 != WhirlpoolHasher.field_k) {
                if (3 == WhirlpoolHasher.field_k) {
                  ArrayWidgetContainer.field_A = 280;
                  MessageDialog.field_ob.field_z = 6000;
                  IntrusiveNodeHashTable.field_f = GrowableIntList.field_e;
                  MessageDialog.field_ob.field_B = true;
                  ChatPanel.resetFadeTimer(86);
                } else {
                  if (WhirlpoolHasher.field_k == 4) {
                    MessageDialog.field_ob.field_z = 6000;
                    MessageDialog.field_ob.field_B = true;
                    IntrusiveNodeHashTable.field_f = LoginLoadingHelpers.field_d;
                    ArrayWidgetContainer.field_A = 280;
                    ChatPanel.resetFadeTimer(-18);
                  } else {
                    if (WhirlpoolHasher.field_k != 5 &&
                      WhirlpoolHasher.field_k == 6) {
                      MessageDialog.field_ob.field_z = 6000;
                      IntrusiveNodeHashTable.field_f = IntrusiveNodeHashTable.field_l;
                      MessageDialog.field_ob.field_X = false;
                      MessageDialog.field_ob.field_B = true;
                      ChatPanel.resetFadeTimer(-115);
                    }
                  }
                }
              } else {
                MessageDialog.field_ob.field_B = true;
                IntrusiveNodeHashTable.field_f = SoundEffectVoice.field_i;
                MessageDialog.field_ob.field_z = 1500;
                ChatPanel.resetFadeTimer(120);
                MessageDialog.field_ob.field_X = false;
              }
            }
          }
        }
        if (param0 != -3) {
          field_c = (MusicTrack[]) null;
        }
        if (7 != StatefulTextPainter.field_p) {
          return;
        }
        if (null == GradientBarButton.field_O.getUnitByOwner(0, true)) {
          ScreenSwitchHelpers.switchScreen(true, true, 14, MatchingFieldValidator.field_r);
          BattleResetHelpers.resetBattleState(113);
          return;
        }
        if (0 == WhirlpoolHasher.field_k) {
          IntrusiveNodeHashTable.field_f = TextLine.field_j;
          MessageDialog.field_ob.field_B = true;
        } else {
          if (!param1) {
            IntrusiveNodeHashTable.field_f = IntrusiveDequeCursor.field_h;
          }
        }
        var5 = GradientBarButton.field_O.getUnitByOwner(MessageDialog.field_ob.field_bb, true);
        if (WhirlpoolHasher.field_k < 0) {
          ArrayWidgetContainer.field_A = 400;
          if (var5 != null &&
            var5.field_jb != 0 ||
            DropdownList.field_N != -1) {
            WhirlpoolHasher.field_k = -WhirlpoolHasher.field_k;
          }
          if (var5 != null &&
            var5.field_ib < 250) {
            IntrusiveNodeHashTable.field_f = DropTargetWidget.field_F;
          }
        }
        if (GradientBarButton.field_O.getUnitByOwner(0, true).field_x > 0) {
          WhirlpoolHasher.field_k = -Math.abs(WhirlpoolHasher.field_k);
          MessageDialog.field_ob.field_bb = GradientBarButton.field_O.getUnitByOwner(0, true).field_T;
        }
        return;
    }

    public final void paint(java.awt.Graphics param0) {
        try {
          this.field_g.paint(param0);
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "jh.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    DelegatingCanvas(java.awt.Component param0) {
        try {
          this.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "jh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static int writeCompressedString(PacketBuffer param0, byte param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        CharSequence var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = param0.position;
          if (param1 != 127) {
            field_h = 0.05152737468678133;
          }
          var5 = (CharSequence) ((Object) param2);
          var4 = SocketConnector.encodeCp1252(var5, (byte) -82);
          param0.writeUnsignedSmart(var4.length, (byte) -124);
          param0.position = param0.position + TextLayout.field_g.decompress(param0.payload, var4.length, var4, param0.position, 1, 0);
          stackIn_3_0 = -var3_int + param0.position;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("jh.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void reportError(Throwable param0, String param1, byte param2) {
        try {
          PlatformTaskDispatcher stackIn_14_0;
          boolean stackIn_14_1;
          java.net.URL stackIn_14_2;
          java.net.URL stackIn_14_3;
          java.net.URL stackIn_14_4;
          StringBuilder stackIn_14_5;
          java.net.URL stackIn_15_2;
          java.net.URL stackIn_15_3;
          String stackIn_15_6;
          Throwable decompiledCaughtException = null;
          String var3 = null;
          Exception var3_ref = null;
          PlatformTask var4 = null;
          DataInputStream var5 = null;
          int var6 = 0;
          java.applet.Applet var7 = null;
          String var8 = null;
          var6 = ArcanistsMulti.field_G ? 1 : 0;
          try {
            var3 = "";
            if (param0 != null) {
              var3 = ThrowableFormatHelpers.describeThrowable((byte) 122, param0);
            }
            if (param1 != null) {
              if (param0 != null) {
                var3 = var3 + " | ";
              }
              var3 = var3 + param1;
            }
            DraggableWidget.printError((byte) -125, var3);
            if (param2 != 20) {
              var7 = (java.applet.Applet) null;
              DelegatingCanvas.openExternalUrl((String) null, (java.applet.Applet) null, true, (byte) 83);
            }
            var3 = CheckboxPainter.replaceAll(var3, ":", "%3a", (byte) 107);
            var3 = CheckboxPainter.replaceAll(var3, "@", "%40", (byte) 125);
            var3 = CheckboxPainter.replaceAll(var3, "&", "%26", (byte) 100);
            var8 = CheckboxPainter.replaceAll(var3, "#", "%23", (byte) 100);
            if (MouseWheelHandler.field_e == null) {
              return;
            }
            stackIn_14_0 = TimedMessage.field_k;
            stackIn_14_1 = true;
            stackIn_14_2 = null;
            stackIn_14_3 = null;
            stackIn_14_4 = MouseWheelHandler.field_e.getCodeBase();
            stackIn_14_5 = new StringBuilder().append("clienterror.ws?c=").append(KeyboardInputHandler.field_g).append("&u=");
            if (null == BitAndSpriteHelpers.field_i) {
              stackIn_15_2 = null;
              stackIn_15_3 = null;
              stackIn_15_6 = "" + MeshModel.field_K;
            } else {
              stackIn_15_2 = null;
              stackIn_15_3 = null;
              stackIn_15_6 = BitAndSpriteHelpers.field_i;
            }
            var4 = ((PlatformTaskDispatcher) (Object) stackIn_14_0).queueUrlOpen(stackIn_14_1, new java.net.URL(stackIn_14_4, ((StringBuilder) (Object) stackIn_14_5).append(stackIn_15_6).append("&v1=").append(PlatformTaskDispatcher.field_l).append("&v2=").append(PlatformTaskDispatcher.field_c).append("&e=").append(var8).toString()));
            while (var4.field_e == 0) {
              LobbyLayoutHelpers.sleepMillis(1L, 1);
            }
            if (var4.field_e == 1) {
              var5 = (DataInputStream) (var4.field_g);
              var5.read();
              var5.close();
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseStatics(byte param0) {
        field_c = null;
        if (param0 <= 24) {
          field_f = 116;
        }
        field_a = null;
        field_b = (byte[][]) null;
        field_d = (String[][]) null;
    }

    public final void update(java.awt.Graphics param0) {
        try {
          this.field_g.update(param0);
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "jh.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = null;
        field_b = new byte[50][];
        field_d = new String[][]{new String[]{"120", "90", "60", "45", "30", "20", "10"}, new String[]{"Grassy Hills", "Giants' Mountains", "Elven Isles", "Goblin Caves", "Murky Swamp", "Graveyard", "Sky Castles", "Mos Le'Harmless", "Arcane Crystals", "Random"}, new String[]{"Players are free to fight as they please", "4-player and 6-player games get divided into 2v2 or 3v3 team games, with shared victory"}};
        field_h = Math.atan2(1.0, 0.0);
        field_f = 0;
    }
}
