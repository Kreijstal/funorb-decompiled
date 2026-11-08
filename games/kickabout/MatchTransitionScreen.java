/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MatchTransitionScreen extends ButtonMenuScreen {
    static String[] field_A;
    static int[] field_B;

    MatchTransitionScreen() {
    }

    final void updateScreen(byte param0, boolean param1) {
        int stackIn_9_0 = 0;
        int var3;
        int var4;
        int var5;
        super.updateScreen((byte) -104, param1);
        var3 = 7 % ((param0 - 38) / 60);
        if (GameModesHelpScreen.field_G != null) {
          return;
        }
        if (!um.field_b) {
          var4 = MarkerSliderWidget.field_E[BufferedCacheFile.field_a];
          var5 = ButtonMenuScreen.field_r[BufferedCacheFile.field_a];
          mj.a(256.0, 60, (double)var4, (double)var5);
          gg.h((byte) 93);
          DelayedServerPacket.a(ig.field_d, false, -2);
          return;
        }
        if (ih.field_c != gk.field_g) {
          AnimationClip.a(FullscreenFailureReason.field_f, -76, TeamSelectionView.field_j, gk.field_g);
        } else {
          if (FullscreenFailureReason.field_f != RankingsScreen.field_C) {
            AnimationClip.a(FullscreenFailureReason.field_f, -76, TeamSelectionView.field_j, gk.field_g);
          } else {
            stackIn_9_0 = (NanoTickClock.field_n) ? 0 : 1;
            if (stackIn_9_0 == (TeamSelectionView.field_j ? 1 : 0)) {
              AnimationClip.a(FullscreenFailureReason.field_f, -76, TeamSelectionView.field_j, gk.field_g);
            }
          }
        }
        if (FadingSoundPlayer.field_q) {
          return;
        }
        mj.a(140.0, 60, 448.0, 672.0);
        if (MyKitScreen.field_O) {
          KitStyleTile.j(13459);
        }
        gg.h((byte) -125);
        System.gc();
        AnimationPlayer.a((byte) 98);
        DelayedServerPacket.a(-1, false, -2);
    }

    final static int a(int param0, String param1, boolean param2) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 10) {
            var4 = (String) null;
            MatchTransitionScreen.a(-31, (String) null, true);
          }
          if (!param2) {
            stackIn_6_0 = MeshObject.field_f.a(param1);
            return stackIn_6_0;
          }
          stackIn_4_0 = MainMenuScreen.field_F.a(param1);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ud.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean c(int param0, int param1) {
        boolean stackIn_27_0 = false;
        boolean stackIn_44_0 = false;
        boolean stackIn_64_0 = false;
        boolean stackIn_148_0 = false;
        boolean stackIn_159_0 = false;
        boolean stackIn_172_0 = false;
        boolean stackIn_183_0 = false;
        if (param1 != 17030) {
          return false;
        }
        if (GameplayHelpScreen.field_G[82]) {
          return false;
        }
        if (GameplayHelpScreen.field_G[86]) {
          return false;
        }
        if (16 <= param0) {
          if (param0 <= 27) {
            return true;
          }
          if (32 > param0) {
            stackIn_44_0 = ((!(param0 < 48) &&
              !(param0 > 58)) ||
              (!(param0 < 64) &&
              !(param0 > 73)) ||
              (param0 == 80 ||
              param0 == 83 ||
              param0 == 84 ||
              param0 == 85 ||
              59 == param0 ||
              param0 == 74 ||
              28 == param0));
            return stackIn_44_0;
          }
          boolean decompiledFrameRemainder1 = true;
          if (param0 > 43 && ((param0 < 48 ||
            param0 > 58) &&
            (param0 < 64 ||
            param0 > 73)) && (param0 != 80 &&
            param0 != 83 &&
            param0 != 84 &&
            param0 != 85 &&
            59 != param0 &&
            param0 != 74 &&
            28 != param0)) {
            stackIn_27_0 = false;
            decompiledFrameRemainder1 = false;
          }
          else {
            stackIn_27_0 = true;
          }
          return stackIn_27_0;
        }
        if (32 <= param0) {
          if (param0 <= 43) {
            return true;
          }
          if (param0 >= 48) {
            if (param0 <= 58) {
              return true;
            }
            stackIn_64_0 = ((!(param0 < 64) &&
              !(param0 > 73)) ||
              (param0 == 80 ||
              param0 == 83 ||
              param0 == 84 ||
              param0 == 85 ||
              59 == param0 ||
              param0 == 74 ||
              28 == param0));
            return stackIn_64_0;
          }
          if (param0 < 64) {
            if (param0 == 80) {
              return true;
            }
            if (param0 == 83) {
              return true;
            }
            if (param0 == 84) {
              return true;
            }
            if (param0 == 85) {
              return true;
            }
            if (59 == param0) {
              return true;
            }
            if (param0 == 74) {
              return true;
            }
            if (28 == param0) {
              return true;
            }
            return false;
          }
          if (param0 <= 73) {
            return true;
          }
          if (param0 == 80) {
            return true;
          }
          if (param0 == 83) {
            return true;
          }
          if (param0 == 84) {
            return true;
          }
          if (param0 == 85) {
            return true;
          }
          if (59 == param0) {
            return true;
          }
          if (param0 == 74) {
            return true;
          }
          if (28 != param0) {
            return false;
          }
          return true;
        }
        if (param0 < 48) {
          boolean decompiledFrameRemainder0 = true;
          if (param0 < 64) {
            if (param0 != 80 &&
              param0 != 83 &&
              param0 != 84 &&
              param0 != 85 &&
              59 != param0 &&
              param0 != 74) {
              if (28 == param0) {
                return true;
              }
              stackIn_183_0 = false;
              decompiledFrameRemainder0 = false;
            }
          } else {
            if (param0 > 73) {
              if (param0 != 80 &&
                param0 != 83 &&
                param0 != 84 &&
                param0 != 85 &&
                59 != param0 &&
                param0 != 74) {
                if (28 == param0) {
                  return true;
                }
                stackIn_172_0 = false;
              } else {
                stackIn_172_0 = true;
              }
              return stackIn_172_0;
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_183_0 = true;
          }
          return stackIn_183_0;
        }
        if (param0 <= 58) {
          return true;
        }
        if (param0 < 64) {
          if (param0 != 80 &&
            param0 != 83 &&
            param0 != 84 &&
            param0 != 85 &&
            59 != param0 &&
            param0 != 74) {
            if (28 == param0) {
              return true;
            }
            stackIn_159_0 = false;
          } else {
            stackIn_159_0 = true;
          }
          return stackIn_159_0;
        }
        if (param0 <= 73) {
          return true;
        }
        if (param0 != 80 &&
          param0 != 83 &&
          param0 != 84 &&
          param0 != 85 &&
          59 != param0 &&
          param0 != 74) {
          if (28 == param0) {
            return true;
          }
          stackIn_148_0 = false;
        } else {
          stackIn_148_0 = true;
        }
        return stackIn_148_0;
    }

    public static void releaseStatics(int param0) {
        field_A = null;
        field_B = null;
        if (param0 != 14513) {
          field_B = (int[]) null;
        }
    }

    final static void a(boolean param0, int param1, boolean param2, int param3, boolean param4, boolean param5, int param6, boolean param7, int param8, boolean param9) {
        int var11;
        var11 = Kickabout.field_G;
        if (param4) {
          AuctionsHelpScreen.field_H = ModalPanel.field_B;
          ParticipantStatus.a(param4, 1);
          if (ns.field_a > 0) {
            we.a(param7, param4, (byte) -119, param6);
          }
          MarkerSliderWidget.field_F.field_A = 1;
          MarkerSliderWidget.field_F.field_kb = ip.field_c.field_kb;
          if (fj.field_a > 0) {
            BeveledTextPainter.a(102, param4, param7, param6);
          }
          if (ee.field_b > 0) {
            SpriteState.a(param7, param6, -2, param9, param4);
          }
          if (TrinketCatalog.field_b &&
            PlayerContextMenu.field_i.field_gc >= PlayerContextMenu.field_i.field_bc) {
            TickClock.field_d.field_lb = false;
            LineupView.field_u.field_zb.field_E = LeagueWinnerDialog.field_I;
            DateInputValidator.a(true, LineupView.field_u.field_Ab);
          } else {
            LineupView.field_u.field_zb.field_E = null;
            TickClock.field_d.field_lb = true;
            SplashScreen.layoutPlayerRows(LineupView.field_u, param3, param2, param6, 92);
          }
        } else {
          if (ColorQuantizationBox.field_a != SoftwareRasterizer.field_g) {
            if (ColorQuantizationBox.field_f.field_e == SoftwareRasterizer.field_f &&
              ColorQuantizationBox.field_f.field_a == SoftwareRasterizer.field_g) {
              if (null == PlayerContextMenu.field_i) {
                if (ArchiveSource.field_b == null) {
                  CipherPacketBuffer.c(false);
                  if (param4) {
                    AuctionsHelpScreen.field_H = ModalPanel.field_B;
                  } else {
                    AuctionsHelpScreen.field_H = (ColorQuantizationBox.field_a - 640) / 2;
                  }
                  ParticipantStatus.a(param4, 1);
                  if (ns.field_a > 0) {
                    we.a(param7, param4, (byte) -119, param6);
                  }
                  MarkerSliderWidget.field_F.field_A = 1;
                  MarkerSliderWidget.field_F.field_kb = ip.field_c.field_kb;
                  if (fj.field_a > 0) {
                    BeveledTextPainter.a(102, param4, param7, param6);
                  }
                  if (ee.field_b > 0) {
                    SpriteState.a(param7, param6, -2, param9, param4);
                  }
                  if (TrinketCatalog.field_b &&
                    PlayerContextMenu.field_i.field_gc >= PlayerContextMenu.field_i.field_bc) {
                    TickClock.field_d.field_lb = false;
                    LineupView.field_u.field_zb.field_E = LeagueWinnerDialog.field_I;
                    DateInputValidator.a(true, LineupView.field_u.field_Ab);
                  } else {
                    LineupView.field_u.field_zb.field_E = null;
                    TickClock.field_d.field_lb = true;
                    SplashScreen.layoutPlayerRows(LineupView.field_u, param3, param2, param6, 92);
                  }
                  DialogOverlay.a(param2, param0, param6, param8, param5, param3, param1);
                  SplashScreen.layoutPlayerRows(ClientException.field_c, param3, param2, param6, 38);
                  GameKeyHandler.field_c = GameKeyHandler.field_c + 1;
                  return;
                }
                bq.a(103, true);
              } else {
                bq.a(98, false);
              }
            }
            if (!param4) {
              AuctionsHelpScreen.field_H = (ColorQuantizationBox.field_a - 640) / 2;
              ParticipantStatus.a(param4, 1);
              if (ns.field_a > 0) {
                we.a(param7, param4, (byte) -119, param6);
              }
              MarkerSliderWidget.field_F.field_A = 1;
              MarkerSliderWidget.field_F.field_kb = ip.field_c.field_kb;
              if (fj.field_a > 0) {
                BeveledTextPainter.a(102, param4, param7, param6);
              }
              if (ee.field_b > 0) {
                SpriteState.a(param7, param6, -2, param9, param4);
              }
              if (TrinketCatalog.field_b &&
                PlayerContextMenu.field_i.field_gc >= PlayerContextMenu.field_i.field_bc) {
                TickClock.field_d.field_lb = false;
                LineupView.field_u.field_zb.field_E = LeagueWinnerDialog.field_I;
                DateInputValidator.a(true, LineupView.field_u.field_Ab);
              } else {
                LineupView.field_u.field_zb.field_E = null;
                TickClock.field_d.field_lb = true;
                SplashScreen.layoutPlayerRows(LineupView.field_u, param3, param2, param6, 92);
              }
            } else {
              AuctionsHelpScreen.field_H = ModalPanel.field_B;
              ParticipantStatus.a(param4, 1);
              if (ns.field_a > 0) {
                we.a(param7, param4, (byte) -119, param6);
              }
              MarkerSliderWidget.field_F.field_A = 1;
              MarkerSliderWidget.field_F.field_kb = ip.field_c.field_kb;
              if (fj.field_a > 0) {
                BeveledTextPainter.a(102, param4, param7, param6);
              }
              if (ee.field_b > 0) {
                SpriteState.a(param7, param6, -2, param9, param4);
              }
              if (TrinketCatalog.field_b &&
                PlayerContextMenu.field_i.field_gc >= PlayerContextMenu.field_i.field_bc) {
                TickClock.field_d.field_lb = false;
                LineupView.field_u.field_zb.field_E = LeagueWinnerDialog.field_I;
                DateInputValidator.a(true, LineupView.field_u.field_Ab);
              } else {
                LineupView.field_u.field_zb.field_E = null;
                TickClock.field_d.field_lb = true;
                SplashScreen.layoutPlayerRows(LineupView.field_u, param3, param2, param6, 92);
              }
            }
          } else {
            if (SoftwareRasterizer.field_f != BufferedSocket.field_s &&
              ColorQuantizationBox.field_f.field_e == SoftwareRasterizer.field_f &&
              ColorQuantizationBox.field_f.field_a == SoftwareRasterizer.field_g) {
              if (null == PlayerContextMenu.field_i) {
                if (ArchiveSource.field_b == null) {
                  CipherPacketBuffer.c(false);
                  if (param4) {
                    AuctionsHelpScreen.field_H = ModalPanel.field_B;
                  } else {
                    AuctionsHelpScreen.field_H = (ColorQuantizationBox.field_a - 640) / 2;
                  }
                  ParticipantStatus.a(param4, 1);
                  if (ns.field_a > 0) {
                    we.a(param7, param4, (byte) -119, param6);
                  }
                  MarkerSliderWidget.field_F.field_A = 1;
                  MarkerSliderWidget.field_F.field_kb = ip.field_c.field_kb;
                  if (fj.field_a > 0) {
                    BeveledTextPainter.a(102, param4, param7, param6);
                  }
                  if (ee.field_b > 0) {
                    SpriteState.a(param7, param6, -2, param9, param4);
                  }
                  if (TrinketCatalog.field_b &&
                    PlayerContextMenu.field_i.field_gc >= PlayerContextMenu.field_i.field_bc) {
                    TickClock.field_d.field_lb = false;
                    LineupView.field_u.field_zb.field_E = LeagueWinnerDialog.field_I;
                    DateInputValidator.a(true, LineupView.field_u.field_Ab);
                  } else {
                    LineupView.field_u.field_zb.field_E = null;
                    TickClock.field_d.field_lb = true;
                    SplashScreen.layoutPlayerRows(LineupView.field_u, param3, param2, param6, 92);
                  }
                  DialogOverlay.a(param2, param0, param6, param8, param5, param3, param1);
                  SplashScreen.layoutPlayerRows(ClientException.field_c, param3, param2, param6, 38);
                  GameKeyHandler.field_c = GameKeyHandler.field_c + 1;
                  return;
                }
                bq.a(103, true);
              } else {
                bq.a(98, false);
              }
            }
            if (!param4) {
              AuctionsHelpScreen.field_H = (ColorQuantizationBox.field_a - 640) / 2;
              ParticipantStatus.a(param4, 1);
              if (ns.field_a > 0) {
                we.a(param7, param4, (byte) -119, param6);
              }
              MarkerSliderWidget.field_F.field_A = 1;
              MarkerSliderWidget.field_F.field_kb = ip.field_c.field_kb;
              if (fj.field_a > 0) {
                BeveledTextPainter.a(102, param4, param7, param6);
              }
              if (ee.field_b > 0) {
                SpriteState.a(param7, param6, -2, param9, param4);
              }
              if (TrinketCatalog.field_b &&
                PlayerContextMenu.field_i.field_gc >= PlayerContextMenu.field_i.field_bc) {
                TickClock.field_d.field_lb = false;
                LineupView.field_u.field_zb.field_E = LeagueWinnerDialog.field_I;
                DateInputValidator.a(true, LineupView.field_u.field_Ab);
              } else {
                LineupView.field_u.field_zb.field_E = null;
                TickClock.field_d.field_lb = true;
                SplashScreen.layoutPlayerRows(LineupView.field_u, param3, param2, param6, 92);
              }
            } else {
              AuctionsHelpScreen.field_H = ModalPanel.field_B;
              ParticipantStatus.a(param4, 1);
              if (ns.field_a > 0) {
                we.a(param7, param4, (byte) -119, param6);
              }
              MarkerSliderWidget.field_F.field_A = 1;
              MarkerSliderWidget.field_F.field_kb = ip.field_c.field_kb;
              if (fj.field_a > 0) {
                BeveledTextPainter.a(102, param4, param7, param6);
                if (ee.field_b > 0) {
                  SpriteState.a(param7, param6, -2, param9, param4);
                }
                if (TrinketCatalog.field_b &&
                  PlayerContextMenu.field_i.field_gc >= PlayerContextMenu.field_i.field_bc) {
                  TickClock.field_d.field_lb = false;
                  LineupView.field_u.field_zb.field_E = LeagueWinnerDialog.field_I;
                  DateInputValidator.a(true, LineupView.field_u.field_Ab);
                } else {
                  LineupView.field_u.field_zb.field_E = null;
                  TickClock.field_d.field_lb = true;
                  SplashScreen.layoutPlayerRows(LineupView.field_u, param3, param2, param6, 92);
                }
              } else {
                if (ee.field_b > 0) {
                  SpriteState.a(param7, param6, -2, param9, param4);
                }
                if (!TrinketCatalog.field_b) {
                  LineupView.field_u.field_zb.field_E = null;
                  TickClock.field_d.field_lb = true;
                  SplashScreen.layoutPlayerRows(LineupView.field_u, param3, param2, param6, 92);
                } else {
                  if (PlayerContextMenu.field_i.field_gc >= PlayerContextMenu.field_i.field_bc) {
                    TickClock.field_d.field_lb = false;
                    LineupView.field_u.field_zb.field_E = LeagueWinnerDialog.field_I;
                    DateInputValidator.a(true, LineupView.field_u.field_Ab);
                  } else {
                    LineupView.field_u.field_zb.field_E = null;
                    TickClock.field_d.field_lb = true;
                    SplashScreen.layoutPlayerRows(LineupView.field_u, param3, param2, param6, 92);
                  }
                }
              }
            }
          }
        }
        DialogOverlay.a(param2, param0, param6, param8, param5, param3, param1);
        SplashScreen.layoutPlayerRows(ClientException.field_c, param3, param2, param6, 38);
        GameKeyHandler.field_c = GameKeyHandler.field_c + 1;
    }

    final void drawScreen(int param0, boolean param1) {
        super.drawScreen(param0, param1);
        if (null == um.field_e) {
          return;
        }
        if (-2 == ig.field_d) {
          return;
        }
        um.field_e.c((byte) 80);
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        int stackIn_11_0 = 0;
        int stackIn_44_0 = 0;
        int var4;
        if (param2 != 17860) {
          return false;
        }
        if (NumericDateInputWidget.field_J == null) {
          if (!TextFieldNode.field_Wb) {
            if (DebugConsole.field_s) {
              return NodeHashTableIterator.a(param3, param2 ^ -17866, param0);
            }
            if (9 == FixedQuaternion.field_e) {
              return NodeHashTableIterator.a(param3, param2 ^ -17866, param0);
            }
            if (FixedQuaternion.field_e == 10) {
              return NodeHashTableIterator.a(param3, param2 ^ -17866, param0);
            }
            if (11 == FixedQuaternion.field_e) {
              return NodeHashTableIterator.a(param3, param2 ^ -17866, param0);
            }
            if (FixedQuaternion.field_e != 80) {
              return false;
            }
            if (!ph.a(true)) {
              return false;
            }
            TextFieldNode.field_Wb = true;
            return true;
          }
          if (!ph.a(true)) {
            return false;
          }
          stackIn_44_0 = (!UiLayoutNode.a(false, param1, param0)) ? 0 : 1;
          var4 = stackIn_44_0;
          if (80 == FixedQuaternion.field_e ||
            84 == FixedQuaternion.field_e) {
            TextFieldNode.field_Wb = false;
            var4 = 1;
          }
        } else {
          if (FixedQuaternion.field_e == 13) {
            NumericDateInputWidget.field_J = null;
            return true;
          }
          if (!TextFieldNode.field_Wb) {
            if (DebugConsole.field_s) {
              return NodeHashTableIterator.a(param3, param2 ^ -17866, param0);
            }
            if (9 == FixedQuaternion.field_e) {
              return NodeHashTableIterator.a(param3, param2 ^ -17866, param0);
            }
            if (FixedQuaternion.field_e == 10) {
              return NodeHashTableIterator.a(param3, param2 ^ -17866, param0);
            }
            if (11 == FixedQuaternion.field_e) {
              return NodeHashTableIterator.a(param3, param2 ^ -17866, param0);
            }
            if (FixedQuaternion.field_e != 80) {
              return false;
            }
            if (!ph.a(true)) {
              return false;
            }
            TextFieldNode.field_Wb = true;
            return true;
          }
          if (!ph.a(true)) {
            return false;
          }
          stackIn_11_0 = (!UiLayoutNode.a(false, param1, param0)) ? 0 : 1;
          var4 = stackIn_11_0;
          if (80 == FixedQuaternion.field_e) {
            TextFieldNode.field_Wb = false;
            var4 = 1;
          } else {
            if (84 == FixedQuaternion.field_e) {
              TextFieldNode.field_Wb = false;
              var4 = 1;
            }
          }
        }
        if (13 == FixedQuaternion.field_e) {
          TrinketCatalog.a(89);
          var4 = 1;
          TextFieldNode.field_Wb = false;
        }
        return var4 != 0;
    }

    static {
        field_B = new int[8192];
        field_A = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
