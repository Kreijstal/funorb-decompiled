/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MenuScreen {
    static Sprite field_d;
    private int field_c;
    static int[] field_f;
    static int field_g;
    private MenuInputState field_h;
    static String field_a;
    static boolean field_e;
    static String field_b;

    private final void performItemAction(int param0, int param1, boolean param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        MenuInputState stackIn_76_0 = null;
        boolean stackIn_77_1 = false;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        boolean decompiledFrameRemainder0 = true;
        var8 = TetraLink.field_J;
        var5 = param1;
        if (0 != var5 &&
          var5 != 1 &&
          2 != var5 &&
          var5 != 7 &&
          var5 != 3 &&
          var5 != 5 &&
          var5 != 8 &&
          var5 != 4 &&
          var5 != 6 &&
          var5 != 9 &&
          var5 != 10 &&
          var5 != 11 &&
          var5 != 18 &&
          var5 != 19 &&
          var5 != 12 &&
          var5 != 20 &&
          var5 != 21 &&
          22 != var5 &&
          var5 != 13 &&
          var5 != 23) {
          if (var5 == 14) {
            var4 = 0;
            if (this.field_h.isHomePressed((byte) -123) &&
              0 < DelegatingCanvas.field_c) {
              StatefulWidgetRenderer.setSoundEffectVolume(0, 128);
              var4 = 1;
            }
            if (this.field_h.isEndPressed(107) &&
              DelegatingCanvas.field_c < 256) {
              StatefulWidgetRenderer.setSoundEffectVolume(256, 128);
              var4 = 1;
            }
            if (this.field_h.isPointerHeld(0)) {
              var5 = this.getItemLeft((byte) 66, param0) + this.getItemRight(param0, (byte) 74) + ReportAbuseDialog.field_Rb - 120 >> 1;
              var6 = (int)LoadingStepTracker.field_c - var5;
              var7 = 256 * var6 / 120;
              if (var7 > 0) {
                if (var7 >= 256) {
                  StatefulWidgetRenderer.setSoundEffectVolume(256, 128);
                } else {
                  StatefulWidgetRenderer.setSoundEffectVolume(var7, 128);
                }
              } else {
                StatefulWidgetRenderer.setSoundEffectVolume(0, 128);
              }
              var4 = 1;
            }
            if (this.field_h.isLeftPressed(true) &&
              DelegatingCanvas.field_c > 0) {
              var4 = 1;
              QueuedListRequest.decreaseSoundVolume(-127);
            }
            if (this.field_h.isRightPressed(97) &&
              DelegatingCanvas.field_c < 256) {
              var4 = 1;
              PacketBuffer.stepSoundVolume(256);
            }
            if ((var4 != 0) &&
              (!this.field_h.isPointerHeld(0) ||
              !(NameEntryKeyHelpers.field_c >= LruTextureCache.field_e))) {
              DateOfBirthPanel.playSample(SectorCacheStore.field_a, 573509761);
              NameEntryKeyHelpers.field_c = LruTextureCache.field_e + 20;
            }
          } else {
            if (15 == var5) {
              if (this.field_h.isHomePressed((byte) -117)) {
                NineSliceFrame.setMusicVolume(0, 59);
              }
              if (this.field_h.isEndPressed(105)) {
                NineSliceFrame.setMusicVolume(256, 20);
              }
              if (this.field_h.isPointerHeld(0)) {
                var5 = this.getItemLeft((byte) -123, param0) - (-this.getItemRight(param0, (byte) -84) - (ReportAbuseDialog.field_Rb - 120)) >> 1;
                var6 = -var5 + (int)LoadingStepTracker.field_c;
                var7 = 256 * var6 / 120;
                if (var7 <= 0) {
                  NineSliceFrame.setMusicVolume(0, 86);
                } else {
                  if (var7 >= 256) {
                    NineSliceFrame.setMusicVolume(256, 77);
                  } else {
                    NineSliceFrame.setMusicVolume(var7, 65);
                  }
                }
              }
              stackIn_76_0 = this.field_h;
              stackIn_77_1 = !(param2);
              if (((MenuInputState) (Object) stackIn_76_0).isLeftPressed(stackIn_77_1)) {
                RasterStackHelpers.stepMusicVolumeDown(32);
              }
              if (this.field_h.isRightPressed(97)) {
                GzipDecompressor.stepMusicVolumeUp((byte) 127);
              }
            } else {
              if (var5 != 16) {
                if (var5 == 17 &&
                  MenuLabelGlobals.field_d.field_c) {
                  if (!this.field_h.isBackAction(-3)) {
                    decompiledFrameRemainder0 = !(!this.field_h.isNextAction((byte) 111));
                    if (decompiledFrameRemainder0) {
                      fieldTemp$0 = GameKeyHandler.field_g + 1;
                      GameKeyHandler.field_g = GameKeyHandler.field_g + 1;
                      if (fieldTemp$0 >= ReflectionCheckHelpers.field_f.length) {
                        GameKeyHandler.field_g = 2;
                      }
                    }
                  } else {
                    fieldTemp$1 = GameKeyHandler.field_g - 1;
                    GameKeyHandler.field_g = GameKeyHandler.field_g - 1;
                    if (2 > fieldTemp$1) {
                      GameKeyHandler.field_g = ReflectionCheckHelpers.field_f.length - 1;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    IndexedSpriteState.field_c = GameKeyHandler.field_g;
                    DelegatingCanvas.createGameOptions(true, -7869);
                  }
                }
              } else {
                if (this.field_h.isBackAction(-3) ||
                  this.field_h.isNextAction((byte) 101)) {
                  if (GameKeyHandler.field_g < 2) {
                    GameKeyHandler.field_g = IndexedSpriteState.field_c;
                    DelegatingCanvas.createGameOptions(true, -7869);
                  } else {
                    GameKeyHandler.field_g = 0;
                    DelegatingCanvas.createGameOptions(true, -7869);
                  }
                }
              }
            }
          }
        }
        if (param2) {
          this.field_h = (MenuInputState) null;
        }
    }

    private final void drawInstructionPage(byte param0, int param1, int param2) {
        String var6 = LobbyOverlayHelpers.field_c[param2];
        if (param0 < 23) {
          field_f = (int[]) null;
        }
        int var5 = SocialTabsPanel.field_b.wrappedLineCount(var6, 370);
        SoftwareRasterizer.fillRectangle(132, 125, 376, 6 + 24 * var5, param1 == 1 ? 127 : 394896);
        NineSliceFrameHelpers.drawNineSliceFrame(370 + WhirlpoolHasher.field_l[0].field_t + WhirlpoolHasher.field_l[2].field_t, (byte) -36, WhirlpoolHasher.field_l, 135 - WhirlpoolHasher.field_l[0].field_t, WhirlpoolHasher.field_l[6].field_F + (24 * var5 + WhirlpoolHasher.field_l[0].field_F), -WhirlpoolHasher.field_l[0].field_F + 128);
        if (2 != param1) {
          SocialTabsPanel.field_b.drawParagraph(var6, 135, 125, 370, 240, 8437759, -1, 1, 0, 24);
        }
    }

    private final void handleNavigationKeys(boolean param0) {
        int discarded$0 = 0;
        int var3;
        var3 = TetraLink.field_J;
        if (96 == WidgetStyleLayer.field_e) {
          if (0 >= this.field_h.field_b) {
            this.field_h.selectIndex(1, -58);
          } else {
            if (2 != this.field_h.field_b) {
              this.field_h.selectIndex(0, -21);
            }
          }
        }
        if (WidgetStyleLayer.field_e == 97) {
          if (this.field_h.field_b != 1) {
            if (this.field_h.field_b != 2) {
              this.field_h.selectIndex(1, -106);
            }
          } else {
            this.field_h.selectIndex(0, -97);
          }
        }
        if (WidgetStyleLayer.field_e == 99) {
          if (this.field_h.field_b >= 0 &&
            1 >= this.field_h.field_b) {
            this.field_h.selectIndex(2, -101);
          } else {
            this.field_h.selectIndex(RasterBuffer.field_k, -65);
          }
        }
        if (WidgetStyleLayer.field_e == 98) {
          if (2 != this.field_h.field_b) {
            this.field_h.selectIndex(2, -108);
          } else {
            this.field_h.selectIndex(RasterBuffer.field_k, -95);
          }
        }
        this.field_h.captureKeyCode((byte) -108);
        if (!param0) {
          discarded$0 = this.getItemTop(3, -94);
        }
    }

    private final void drawMenuItem(int param0, byte param1, boolean param2, int param3) {
        int discarded$0 = 0;
        String stackIn_25_0 = null;
        StringBuilder stackIn_28_0 = null;
        String stackIn_29_1 = null;
        StringBuilder stackIn_32_0 = null;
        String stackIn_33_1 = null;
        int stackIn_43_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_56_0 = 0;
        int var5;
        String var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        String var18;
        var17 = TetraLink.field_J;
        if (2 == param3) {
          return;
        }
        var5 = GameOptionControls.field_f[this.field_c][param0];
        var18 = MenuLabelGlobals.field_c[var5];
        var6 = var18;
        var6 = var18;
        var6 = var18;
        switch (var5) {
          case 16:
            stackIn_32_0 = new StringBuilder().append(var18);
            if (MenuLabelGlobals.field_d.field_c) {
              stackIn_33_1 = SingleChildWidget.field_I;
            } else {
              stackIn_33_1 = LoadingStepTracker.field_a;
            }
            var6 = ((StringBuilder) (Object) stackIn_32_0).append(stackIn_33_1).toString();
            break;
          case 17:
            stackIn_28_0 = new StringBuilder().append(var18);
            if (!MenuLabelGlobals.field_d.field_c) {
              stackIn_29_1 = CachedTextLayout.field_n;
            } else {
              stackIn_29_1 = ReflectionCheckHelpers.field_f[GameKeyHandler.field_g];
            }
            var6 = ((StringBuilder) (Object) stackIn_28_0).append(stackIn_29_1).toString();
            break;
          case 19:
            if (0 != LoginCredentials.field_a) {
              stackIn_25_0 = OpacityWidget.field_O;
            } else {
              stackIn_25_0 = CachedArchiveSource.field_h;
            }
            var6 = stackIn_25_0;
            break;
          case 8:
            if (PlayerContextMenu.field_d != 0 &&
              DraggableWidget.field_O != 0) {
              if (2 != PlayerContextMenu.field_d &&
                2 != DraggableWidget.field_O) {
                if (3 != PlayerContextMenu.field_d &&
                  DraggableWidget.field_O != 3 &&
                  4 != PlayerContextMenu.field_d &&
                  DraggableWidget.field_O != 4 &&
                  PlayerContextMenu.field_d != 5 &&
                  DraggableWidget.field_O != 5) {
                  break;
                }
                var6 = BevelFrameSpriteFactory.field_c;
                break;
              }
              var6 = PacketBuffer.field_o;
              break;
            }
            var6 = MenuLabelGlobals.field_c[7];
            break;
          default:
            break;
        }
        var7 = SocialTabsPanel.field_b.textWidth(var6);
        var8 = this.getItemLeft((byte) 46, param0);
        var9 = this.getItemRight(param0, (byte) -101);
        var10 = this.getItemTop(54, param0);
        if (var5 == 14 ||
          var5 == 15) {
          var7 = ReportAbuseDialog.field_Rb + 120;
        }
        var11 = var8 + (var9 - var7) >> 1;
        var12 = this.getItemHeight(param0, (byte) 43);
        var13 = var9 - var8;
        var14 = this.getItemHeight(param0, (byte) 113);
        CachedTextLayout.drawGradientPanel(var10, param3, var13, var14, (byte) 111, var8, param2);
        if (param1 != -15) {
          discarded$0 = this.getItemTop(-79, -108);
        }
        stackIn_43_0 = (!param2) ? 8437759 : 16777215;
        var15 = stackIn_43_0;
        if (var5 == 17 &&
          !MenuLabelGlobals.field_d.field_c) {
          stackIn_49_0 = (param2) ? 12632256 : 7829367;
          var15 = stackIn_49_0;
        }
        SocialTabsPanel.field_b.drawLeft(var6, var11, SocialTabsPanel.field_b.field_N + var10, var15, -1);
        if (var5 != 14 &&
          15 != var5) {
          return;
        }
        var11 = var11 + ReportAbuseDialog.field_Rb;
        SoftwareRasterizer.drawRectangle(var11, -1 + (var10 + var12 / 2), 121, 2, var15);
        if (var5 != 14) {
          stackIn_56_0 = 120 * FontAndFrameStyleHelpers.field_a / 256;
        } else {
          stackIn_56_0 = 120 * DelegatingCanvas.field_c / 256;
        }
        var16 = stackIn_56_0;
        SoftwareRasterizer.drawRectangle(var16 + (var11 - 1), var10 + 3, 3, var12 - 6, var15);
        return;
    }

    private final void moveSelection(int param0) {
        int var2;
        int var3;
        var2 = this.field_h.field_b;
        if (BackgroundSparkle.field_t == 6 &&
          !LoadingProgressDialog.isKeyboardIdle(46)) {
          this.handleNavigationKeys(true);
        } else {
          if (GameOptionControls.field_f[this.field_c].length != 0) {
            this.field_h.handleVerticalNavigation(85);
          }
        }
        var3 = 4 % ((46 - param0) / 33);
        if (this.field_h.field_b != var2) {
          DateOfBirthPanel.playSample(CachedArchiveSource.field_A, 573509761);
        }
    }

    private final void activateItem(boolean param0, int param1, byte param2) {
        if (param2 != -29) {
          return;
        }
        int var4 = GameOptionControls.field_f[this.field_c][param1];
        this.performItemAction(param1, var4, false);
        if (this.field_h.isForwardAction(32)) {
          if (14 != var4 &&
            15 != var4) {
            DateOfBirthPanel.playSample(SectorCacheStore.field_a, param2 ^ -573509790);
          }
          SocialListPacketHandler.handleMenuAction(param0, var4, false);
        }
    }

    final void updatePointerSelection(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = TetraLink.field_J;
        if (this.field_h.field_b != -1) {
          param1 = this.field_h.field_b;
        }
        this.field_h.initializeSelection(this.findItemAt((int)LoadingStepTracker.field_c, (byte) 58, (int)CommonUiHelpers.field_i), param1, param0, 62);
        NameEntryKeyHelpers.field_c = LruTextureCache.field_e;
        if (param2 != -1) {
          this.drawTitleBanner(-84, (byte) -77);
        }
        if (this.field_c == 8) {
          NameEntryKeyHelpers.field_a = -1;
          QuickChatPhraseDefinition.field_u = -1;
          for (var4 = 0; var4 < 8; var4++) {
            FlaggedTextValue.field_o[var4] = 0;
          }
        }
    }

    private final void drawAchievements(byte param0, int param1) {
        int stackIn_18_0 = 0;
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
        int var4Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        var14 = TetraLink.field_J;
        var3 = 0;
        var4 = 0;
        if (param0 != -99) {
          field_b = (String) null;
        }
        while (var4 < 8) {
          if (WidgetNode.isAchievementUnlocked(1, var4)) {
            var3++;
          }
          var4++;
        }
        var4Lifetime1 = -(20 * var3) + 340;
        var5 = 140;
        DebouncedValidator.field_j = 0;
        for (var6 = 0; 8 > var6; var6++) {
          if (WidgetNode.isAchievementUnlocked(1, var6)) {
            var7 = var6;
            this.drawAchievementIcon(var4Lifetime1, var7, true, FlaggedTextValue.field_o[var7], var5, param0 ^ -100);
            var4Lifetime1 += 40;
          }
        }
        if (-1 != NameEntryKeyHelpers.field_a) {
          stackIn_18_0 = NameEntryKeyHelpers.field_a;
        } else {
          stackIn_18_0 = QuickChatPhraseDefinition.field_u;
        }
        var6Lifetime1 = stackIn_18_0;
        var7Lifetime1 = 124;
        if (LoadingProgressDialog.isKeyboardIdle(param0 + 136)) {
          var7Lifetime1 -= 8;
        }
        if (var6Lifetime1 == -1) {
          if (param1 != 2) {
            if (!LoadingProgressDialog.isKeyboardIdle(-70)) {
              SocialTabsPanel.field_b.drawParagraph(ReportAbuseDialog.field_Lb, 160, 240, 320, 80, 8437759, -1, 1, 0, 20);
            } else {
              SocialTabsPanel.field_b.drawCentered(GameSession.field_e, 320, 270, 8437759, -1);
              SocialTabsPanel.field_b.drawCentered(LoadingScreenHelpers.field_h, 320, 290, 8437759, -1);
              SocialTabsPanel.field_b.drawParagraph(ReportAbuseDialog.field_Lb, 160, 210, 320, 80, 8437759, -1, 1, 0, 20);
            }
          }
        } else {
          if (param1 != 2) {
            SocialTabsPanel.field_b.drawCentered(ModelMergeHelpers.field_a[var6Lifetime1], 320, var7Lifetime1 + 60, 8437759, -1);
            if ((QuickChatCategoryCache.field_a & 1 << var6Lifetime1) != 0) {
              SocialTabsPanel.field_b.drawCentered(CommonUiHelpers.field_f, 320, var7Lifetime1 + 80, 8437759, -1);
            } else {
              SocialTabsPanel.field_b.drawCentered(NetworkGameClient.field_D, 320, 80 + var7Lifetime1, 8437759, -1);
            }
          }
          if (LoadingProgressDialog.isKeyboardIdle(-110)) {
            var7Lifetime1 -= 8;
          }
          var8 = (int)(76.0 * Math.cos((double)((float)LruTextureCache.field_e / 50.0f)));
          var9 = (int)(28.0 * Math.sin((double)((float)LruTextureCache.field_e / 50.0f)));
          var10 = (int)(76.0 * Math.sin((double)((float)LruTextureCache.field_e / 50.0f)));
          var11 = (int)(28.0 * Math.cos((double)((float)LruTextureCache.field_e / 50.0f)));
          var12 = 3072 / (96 - var9);
          var13 = 3072 / (-var11 + 96);
          if (JoinStatusTextHelpers.field_a[var6Lifetime1] >= 1) {
            if (var9 < 0) {
              AgeValidator.field_r.drawDownscaledAveraged(240 + var8 - (var12 >> 1), var8 / 2 + (var7Lifetime1 + 158) + (var9 - (var12 >> 1)), var12, var12);
            }
            if (JoinStatusTextHelpers.field_a[var6Lifetime1] >= 2 &&
              var11 < 0) {
              AgeValidator.field_r.drawDownscaledAveraged(-(var13 >> 1) + (var10 + 240), 158 + (var7Lifetime1 + (-(var10 / 2) + var11)) - (var13 >> 1), var13, var13);
            }
          }
          this.drawAchievementIcon(240, var6Lifetime1, false, 128, 158 + var7Lifetime1, 1);
          if (JoinStatusTextHelpers.field_a[var6Lifetime1] >= 1) {
            if (var9 >= 0) {
              AgeValidator.field_r.drawDownscaledAveraged(var8 + (240 - (var12 >> 1)), -(var12 >> 1) + 158 + (var7Lifetime1 + var8 / 2 + var9), var12, var12);
            }
            if (JoinStatusTextHelpers.field_a[var6Lifetime1] >= 2 &&
              var11 >= 0) {
              AgeValidator.field_r.drawDownscaledAveraged(var10 + (240 - (var13 >> 1)), var11 + var7Lifetime1 + 158 + (-(var10 / 2) - (var13 >> 1)), var13, var13);
            }
          }
          if (LoadingProgressDialog.isKeyboardIdle(param0 ^ 10)) {
            var7Lifetime1 -= 8;
          }
          if (2 != param1) {
            SocialTabsPanel.field_b.drawRight(EmailAvailabilityValidator.field_B, 420, var7Lifetime1 + 128, 8437759, -1);
            SocialTabsPanel.field_b.drawLeft(Integer.toString(SectorCacheStore.field_b[var6Lifetime1]), 420, var7Lifetime1 + 128, 8437759, -1);
            SocialTabsPanel.field_b.drawRight(DisplayMode.field_c, 420, var7Lifetime1 + 148, 8437759, -1);
            SocialTabsPanel.field_b.drawLeft(Integer.toString(JoinStatusTextHelpers.field_a[var6Lifetime1]), 420, var7Lifetime1 + 148, 8437759, -1);
            SocialTabsPanel.field_b.drawParagraph(IconLabelItem.field_Ob[var6Lifetime1], 320, var7Lifetime1 + 158, 160, 80, 8437759, -1, 1, 0, 20);
          }
        }
    }

    private final boolean isItemVisible(int param0, byte param1) {
        if (param1 < 119) {
          field_g = -62;
          return true;
        }
        return true;
    }

    final static String decodeWindowsCodePageText(int param0, int param1, byte[] param2, int param3) {
        int var6 = 0;
        int incrementValue$0 = 0;
        char[] var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var9 = 0;
        byte[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        char[] var13 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        int var8 = 0;
        var9 = TetraLink.field_J;
        try {
          var13 = new char[param1];
          var12 = var13;
          var11 = var12;
          var4 = var11;
          var5 = 0;
          if (param0 != -1095) {
            var10 = (byte[]) null;
            MenuScreen.decodeWindowsCodePageText(111, -127, (byte[]) null, 91);
          }
          for (var6 = 0; var6 < param1; var6++) {
            var7 = param2[param3 + var6] & 255;
            if (var7 != 0) {
              if (var7 >= 128 &&
                160 > var7) {
                var8 = PacketDiagnosticsHelpers.field_o[var7 - 128];
                if (var8 == 0) {
                  var8 = 63;
                }
                var7 = var8;
              }
              incrementValue$0 = var5;
              var5++;
              var11[incrementValue$0] = (char)var7;
            }
          }
          stackIn_17_0 = new String(var13, 0, var5);
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_20_0 = var4_ref;
          stackIn_20_1 = new StringBuilder().append("cl.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void drawRankings(int param0, int param1) {
        int var10 = 0;
        int var3;
        int var4;
        int var5;
        String var6;
        String[] var7;
        int[] var8;
        int var9;
        String var11;
        int var12;
        int var4Lifetime1;
        var12 = TetraLink.field_J;
        if (param0 == 2) {
          return;
        }
        if (LoadingProgressDialog.isKeyboardIdle(122)) {
          this.drawMessageText((byte) 117);
          return;
        }
        if (null == Bzip2State.field_x) {
          Bzip2State.field_x = JoinStatusTextHelpers.findOrSendListRequest(0, (byte) 68, 7, 8);
        }
        var3 = 16777215;
        var4 = SocialTabsPanel.field_b.field_N + 102;
        if (param1 >= -22) {
          return;
        }
        var5 = var4;
        if (3 == Js5Transport.field_l) {
          var4 = var4 + GzipDecompressor.field_g.field_N;
        }
        regionExit1: {
          GzipDecompressor.field_g.drawCentered(SpriteState.field_w, 310, var5, var3, -1);
          GzipDecompressor.field_g.drawCentered(AccountServerResult.field_j, 368, var4, var3, -1);
          GzipDecompressor.field_g.drawCentered(ConnectionTimingHelpers.field_d, 420, var5, var3, -1);
          GzipDecompressor.field_g.drawCentered(IndexedSpriteHelpers.field_a, 458, var4, var3, -1);
          var4 += 24;
          GzipDecompressor.field_g.drawCentered(TextLayout.field_b, 500, var5, var3, -1);
          if (Bzip2State.field_x.field_u) {
            if (Bzip2State.field_x.field_p != null) {
              var6 = StringPadHelpers.field_c;
              var7 = Bzip2State.field_x.field_p[RasterBuffer.field_k];
              var8 = Bzip2State.field_x.field_y[RasterBuffer.field_k];
              var9 = 0;
              for (var10 = 0; var10 < 8; var10++) {
                if (null != var7[var10]) {
                  var3 = 8437759;
                  var11 = var7[var10];
                  if (PieceDropAnimation.matchesNormalizedSessionName(var11, 4)) {
                    var3 = 16777215;
                    var9 = 1;
                  }
                  var6 = "";
                  this.drawRankingRow(var10, var4, var8[2 + var10 * 4], var11, var8[var10 * 4 + 3], var3, var8[1 + 4 * var10], false, var8[4 * var10]);
                }
                var4 += 21;
              }
              if (((var9 == 0)) &&
                (!(Bzip2State.field_x.field_t + Bzip2State.field_x.field_B + Bzip2State.field_x.field_s <= 0))) {
                var3 = 8437759;
                this.drawRankingRow(-1, var4, Bzip2State.field_x.field_t, NetworkGameClient.field_w, Bzip2State.field_x.field_s, var3, Bzip2State.field_x.field_B, false, Bzip2State.field_x.field_o);
              }
              break regionExit1;
            }
            var6 = WidgetTheme.field_l;
          } else {
            var6 = WidgetStyleLayer.field_m;
          }
        }
        var4Lifetime1 = SocialTabsPanel.field_b.field_N + 120 + 8 * GameOptionControls.field_j[6] / 2;
        SocialTabsPanel.field_b.drawCentered(var6, 320, var4Lifetime1, 8437759, -1);
        return;
    }

    private final void drawTitleBanner(int param0, byte param1) {
        NanoTickClock.field_k.drawTransparentWithOpacity(110, 0, 192);
        GameApplet.field_c.drawScaled(163, 20, 315, 120);
        int var3 = -94 % ((-17 - param1) / 53);
    }

    private final int getItemLeft(byte param0, int param1) {
        int var3 = -119 / ((-29 - param0) / 58);
        if (this.field_c == 6 &&
          !LoadingProgressDialog.isKeyboardIdle(-80)) {
          return 2 > param1 ? 180 * param1 + 150 : GameOptionControls.field_g[this.field_c];
        }
        return GameOptionControls.field_g[this.field_c];
    }

    final static void insertNodeBefore(IntrusiveNode param0, int param1, IntrusiveNode param2) {
        try {
          if (param2.previous != null) {
            param2.unlink(false);
          }
          param2.next = param0;
          int var3_int = -58 / ((-38 - param1) / 33);
          param2.previous = param0.previous;
          param2.previous.next = param2;
          param2.next.previous = param2;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "cl.CA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final int findAchievementAt(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        var8 = TetraLink.field_J;
        for (var4 = 0; var4 < DebouncedValidator.field_j; var4++) {
          var5 = -param2 + FlaggedTextValue.field_h[var4];
          var6 = FlaggedTextValue.field_i[var4] - param1;
          var7 = FlaggedTextValue.field_j[var4] >> 1;
          if (var5 >= -var7 &&
            var5 <= var7 &&
            -var7 <= var6 &&
            var7 >= var6) {
            return FlaggedTextValue.field_b[var4];
          }
        }
        if (!param0) {
          this.field_h = (MenuInputState) null;
        }
        return -1;
    }

    final void handleInput(int param0) {
        int var2 = 0;
        int stackIn_28_0 = 0;
        int var3;
        int var4;
        var4 = TetraLink.field_J;
        if (!DualLinkDeque.field_e &&
          !ChatMessage.field_o) {
          while (KeyEventHelpers.pollKeyEvent((byte) 28)) {
            if (13 != WidgetStyleLayer.field_e) {
              this.moveSelection(-49);
              if (this.field_h.field_b == -1) {
                continue;
              }
              this.activateItem(false, this.field_h.field_b, (byte) -29);
              continue;
            }
            if (2 != this.field_c &&
              this.field_c != 3 &&
              this.field_c != 4 &&
              this.field_c != 5) {
              if (this.field_c == PlayerContextMenu.field_d) {
                continue;
              }
              if (PlayerContextMenu.field_d != 0 &&
                PlayerContextMenu.field_d != 2 &&
                PlayerContextMenu.field_d != 3 &&
                PlayerContextMenu.field_d != 4) {
                if (PlayerContextMenu.field_d != 5) {
                  continue;
                }
                SocialListPacketHandler.handleMenuAction(false, 8, false);
                continue;
              }
              SocialListPacketHandler.handleMenuAction(false, 8, false);
              continue;
            }
            SocialListPacketHandler.handleMenuAction(false, 2, false);
          }
        }
        if (this.field_c == 8) {
          for (var2 = 0; var2 < 8; var2++) {
            if (var2 == NameEntryKeyHelpers.field_a) {
              stackIn_28_0 = 48;
            } else {
              stackIn_28_0 = (var2 != QuickChatPhraseDefinition.field_u) ? 32 : 40;
            }
            var3 = stackIn_28_0;
            if (var3 >= FlaggedTextValue.field_o[var2]) {
              if (FlaggedTextValue.field_o[var2] < var3) {
                FlaggedTextValue.field_o[var2] = FlaggedTextValue.field_o[var2] + 1;
              }
            } else {
              FlaggedTextValue.field_o[var2] = FlaggedTextValue.field_o[var2] - 1;
            }
          }
        }
        if (param0 != 0) {
          field_d = (Sprite) null;
        }
    }

    private final int findItemAt(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5;
        int var6;
        var6 = TetraLink.field_J;
        if (ClientProtocolStage.field_a > IsaacCipher.field_a.field_z) {
          return -1;
        }
        if (param1 != 58) {
          this.releaseScreenAssets(-123);
        }
        for (var4 = 0; GameOptionControls.field_f[this.field_c].length > var4; var4++) {
          var5 = this.getItemTop(32, var4);
          if (this.isItemVisible(var4, (byte) 127) &&
            this.getItemLeft((byte) -117, var4) <= param0 &&
            param0 < this.getItemRight(var4, (byte) -120) &&
            param2 >= var5 &&
            this.getItemHeight(var4, (byte) 102) + var5 > param2) {
            return var4;
          }
        }
        return -1;
    }

    private final int getItemTop(int param0, int param1) {
        int var3 = -60 / ((param0 + 76) / 34);
        if (6 == this.field_c &&
          !LoadingProgressDialog.isKeyboardIdle(109)) {
          if (param1 < 2) {
            return GameOptionControls.field_b[this.field_c];
          }
          return GameOptionControls.field_j[this.field_c] + GameOptionControls.field_b[this.field_c];
        }
        return param1 * GameOptionControls.field_j[this.field_c] + GameOptionControls.field_b[this.field_c];
    }

    private final void drawRankingRow(int param0, int param1, int param2, String param3, int param4, int param5, int param6, boolean param7, int param8) {
        String var13 = null;
        String var14 = null;
        String var15 = null;
        String var16 = null;
        int var10_int = param2 + (param4 + param6);
        if (param0 != -1) {
          SocialTabsPanel.field_b.drawRight(1 + param0 + ". ", 140, param1, param5, -1);
        }
        if (0 != var10_int) {
          param2 = (200 * param2 + var10_int) / (2 * var10_int);
          param4 = (param4 * 200 + var10_int) / (var10_int * 2);
          param6 = (var10_int + 200 * param6) / (2 * var10_int);
        }
        SocialTabsPanel.field_b.drawLeft(param3, 140, param1, param5, -1);
        String var12 = Integer.toString(param8);
        SocialTabsPanel.field_b.drawCentered(var12, 310, param1, param5, -1);
        if (param7) {
          return;
        }
        try {
          var13 = 500 > var10_int ? Integer.toString(var10_int) : "500+";
          String var11 = var13;
          SocialTabsPanel.field_b.drawCentered(var13, 368, param1, param5, -1);
          var14 = param6 + "%";
          SocialTabsPanel.field_b.drawCentered(var14, 420, param1, param5, -1);
          var15 = param4 + "%";
          SocialTabsPanel.field_b.drawCentered(var15, 458, param1, param5, -1);
          var16 = param2 + "%";
          SocialTabsPanel.field_b.drawCentered(var16, 500, param1, param5, -1);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "cl.K(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void releaseScreenAssets(int param0) {
        if (param0 != 4) {
          field_g = -3;
        }
        if (this.field_c == 6) {
          Bzip2State.field_x = null;
        }
    }

    private final void drawAchievementIcon(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        Sprite var7;
        int var8;
        Sprite var9;
        Sprite stackIn_4_0 = null;
        Sprite stackIn_10_0 = null;
        Sprite var10;
        var8 = TetraLink.field_J;
        if (param3 == 32) {
          if ((QuickChatCategoryCache.field_a & 1 << param1) != 0) {
            stackIn_10_0 = UiComponent.field_G[param1];
          } else {
            stackIn_10_0 = Bzip2State.field_F;
          }
          var10 = stackIn_10_0;
          var7 = var10;
          var10.drawTransparent(param0 - 16, -16 + param4);
        } else {
          if ((QuickChatCategoryCache.field_a & 1 << param1) == 0) {
            stackIn_4_0 = NotificationToast.field_p;
          } else {
            stackIn_4_0 = LoginDialog.field_qb[param1];
          }
          var9 = stackIn_4_0;
          var7 = var9;
          if (128 != param3) {
            var9.drawDownscaledAveraged(-(param3 >> 1) + param0, param4 - (param3 >> 1), param3, param3);
          } else {
            var9.drawTransparent(-64 + param0, -64 + param4);
          }
        }
        if (param2) {
          FlaggedTextValue.field_h[DebouncedValidator.field_j] = param0;
          FlaggedTextValue.field_i[DebouncedValidator.field_j] = param4;
          FlaggedTextValue.field_j[DebouncedValidator.field_j] = param3;
          FlaggedTextValue.field_b[DebouncedValidator.field_j] = param1;
          DebouncedValidator.field_j = DebouncedValidator.field_j + 1;
        }
        if (param5 != 1) {
          this.field_c = 96;
        }
    }

    public static void releaseStatics(int param0) {
        field_b = null;
        field_d = null;
        field_a = null;
        if (param0 > -95) {
          IntrusiveNode var2 = (IntrusiveNode) null;
          MenuScreen.insertNodeBefore((IntrusiveNode) null, 47, (IntrusiveNode) null);
        }
        field_f = null;
    }

    final void handlePointer(boolean param0, double param1, int param2, double param3, int param4, int param5) {
        int var9;
        int var12;
        int stackIn_7_0 = 0;
        int var10;
        int var11;
        var12 = TetraLink.field_J;
        var9 = -105 % ((param5 - 52) / 32);
        if (!DualLinkDeque.field_e &&
          !ChatMessage.field_o) {
          if (8 == this.field_c) {
            if (param0) {
              stackIn_7_0 = -1;
            } else {
              stackIn_7_0 = this.findAchievementAt(true, (int)param1, (int)param3);
            }
            QuickChatPhraseDefinition.field_u = stackIn_7_0;
            if (param4 == 1) {
              if (NameEntryKeyHelpers.field_a == QuickChatPhraseDefinition.field_u) {
                NameEntryKeyHelpers.field_a = -1;
              } else {
                if (QuickChatPhraseDefinition.field_u != -1) {
                  NameEntryKeyHelpers.field_a = QuickChatPhraseDefinition.field_u;
                }
              }
            }
          }
          if (param0) {
            this.field_h.updatePointer(-1, -1, (byte) 120);
          } else {
            var10 = this.field_h.field_b;
            var11 = this.findItemAt((int)param3, (byte) 58, (int)param1);
            this.field_h.updatePointer(var11, var11, (byte) 120);
            if (-1 != this.field_h.field_b) {
              this.activateItem(true, this.field_h.field_b, (byte) -29);
            }
            if (this.field_h.field_b != var10) {
              DateOfBirthPanel.playSample(CachedArchiveSource.field_A, 573509761);
            }
          }
        }
    }

    private final int getItemHeight(int param0, byte param1) {
        boolean discarded$0 = false;
        if (param1 <= 42) {
          discarded$0 = this.isItemVisible(42, (byte) 101);
        }
        return 30;
    }

    private final void drawMessageText(byte param0) {
        int var2 = 103 % ((48 - param0) / 61);
        SocialTabsPanel.field_b.drawCentered(NodeHashTable.field_c, 320, 115 - (-SocialTabsPanel.field_b.field_N - 94), 8437759, -1);
    }

    final void drawScreen(boolean param0, int param1, int param2) {
        int var5 = 0;
        int stackIn_2_0;
        int stackIn_2_1;
        int stackIn_2_2;
        int stackIn_2_3;
        int stackIn_3_4 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_12_0;
        int stackIn_12_1;
        int stackIn_12_2;
        int stackIn_12_3;
        int stackIn_13_4;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        Object stackIn_21_0;
        boolean stackIn_21_3;
        int stackIn_31_0;
        int stackIn_31_1;
        int stackIn_31_2;
        int stackIn_31_3;
        int stackIn_32_4 = 0;
        int var4;
        int var6;
        int var7;
        int var8;
        var8 = TetraLink.field_J;
        SoftwareRasterizer.fillRectangle(100, 0, 10, 400, 0);
        SoftwareRasterizer.fillRectangle(530, 0, 10, 400, 0);
        stackIn_2_0 = 110;
        stackIn_2_1 = 0;
        stackIn_2_2 = 420;
        stackIn_2_3 = 400;
        stackIn_3_4 = (1 == param2) ? 127 : 394896;
        SoftwareRasterizer.fillRectangle(stackIn_2_0, stackIn_2_1, stackIn_2_2, stackIn_2_3, stackIn_3_4);
        if (this.field_c == 10) {
          this.drawTitleBanner(param2, (byte) -111);
          return;
        }
        if (param0) {
          this.performItemAction(67, 7, true);
        }
        GameApplet.field_c.drawScaled(163, 20, 315, 120);
        var4 = SocialTabsPanel.field_b.textWidth(PendingReplyNode.field_p[this.field_c]);
        stackIn_9_0 = -20;
        if (GameOptionControls.field_b[this.field_c] < 120) {
          stackIn_10_1 = GameOptionControls.field_b[this.field_c];
        } else {
          stackIn_10_1 = 120;
        }
        var6 = stackIn_9_0 + stackIn_10_1;
        stackIn_12_0 = 465 - var4;
        stackIn_12_1 = -SocialTabsPanel.field_b.field_N - 3 + var6 + WhirlpoolHasher.field_l[0].field_F;
        stackIn_12_2 = 6 + var4;
        stackIn_12_3 = -WhirlpoolHasher.field_l[6].field_F - WhirlpoolHasher.field_l[0].field_F + (SocialTabsPanel.field_b.field_N + 16);
        stackIn_13_4 = (param2 != 1) ? 394896 : 127;
        SoftwareRasterizer.fillRectangle(stackIn_12_0, stackIn_12_1, stackIn_12_2, stackIn_12_3, stackIn_13_4);
        NineSliceFrameHelpers.drawNineSliceFrame(WhirlpoolHasher.field_l[2].field_t + WhirlpoolHasher.field_l[0].field_t + var4, (byte) -36, WhirlpoolHasher.field_l, -var4 + (468 - WhirlpoolHasher.field_l[0].field_t), SocialTabsPanel.field_b.field_N + 10, var6 - SocialTabsPanel.field_b.field_N);
        SocialTabsPanel.field_b.drawLeft(PendingReplyNode.field_p[this.field_c], -var4 + 470, 2 + var6, 16777215, -1);
        for (var5 = 0; this.field_h.field_g > var5; var5++) {
          if (this.isItemVisible(var5, (byte) 127)) {
            stackIn_20_1 = var5;
            stackIn_20_2 = -15;
            if (var5 != this.field_h.field_b) {
              stackIn_21_0 = this;
              stackIn_21_3 = false;
            } else {
              stackIn_21_0 = this;
              stackIn_21_3 = true;
            }
            this.drawMenuItem(stackIn_20_1, (byte) stackIn_20_2, stackIn_21_3, param2);
          }
        }
        if (this.field_c != 6) {
          if (this.field_c != 7) {
            if (this.field_c == 8) {
              this.drawAchievements((byte) -99, param2);
            } else {
              if (9 == this.field_c) {
                var7 = SocialTabsPanel.field_b.wrappedLineCount(NameSuggestionsPanel.field_R, 370);
                stackIn_31_0 = 132;
                stackIn_31_1 = 122;
                stackIn_31_2 = 376;
                stackIn_31_3 = 6 + 24 * var7;
                stackIn_32_4 = (param2 == 1) ? 127 : 394896;
                SoftwareRasterizer.fillRectangle(stackIn_31_0, stackIn_31_1, stackIn_31_2, stackIn_31_3, stackIn_32_4);
                NineSliceFrameHelpers.drawNineSliceFrame(WhirlpoolHasher.field_l[2].field_t + 370 + WhirlpoolHasher.field_l[0].field_t, (byte) -36, WhirlpoolHasher.field_l, 135 - WhirlpoolHasher.field_l[0].field_t, var7 * 24 - (-WhirlpoolHasher.field_l[0].field_F - WhirlpoolHasher.field_l[6].field_F), 125 - WhirlpoolHasher.field_l[0].field_F);
                if (param2 != 2) {
                  SocialTabsPanel.field_b.drawParagraph(NameSuggestionsPanel.field_R, 135, 125, 370, 240, 8437759, -1, 1, 0, 24);
                }
              }
            }
          } else {
            this.drawInstructionPage((byte) 79, param2, param1);
          }
        } else {
          this.drawRankings(param2, -114);
        }
        return;
    }

    MenuScreen(int param0) {
        this.field_c = param0;
        this.field_h = new MenuInputState(GameOptionControls.field_f[this.field_c].length);
        if (GameOptionControls.field_f[this.field_c].length == 0) {
          this.field_h.field_b = -1;
        }
    }

    private final int getItemRight(int param0, byte param1) {
        if (this.field_c == 6 &&
          !LoadingProgressDialog.isKeyboardIdle(-118)) {
          return param0 < 2 ? 310 + 180 * param0 : GameOptionControls.field_h[this.field_c];
        }
        int var3 = 89 % ((-19 - param1) / 61);
        return GameOptionControls.field_h[this.field_c];
    }

    static {
        field_d = new Sprite(540, 140);
        field_a = "Resign";
        field_e = true;
    }
}
