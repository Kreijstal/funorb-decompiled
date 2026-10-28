/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MainMenuScreen {
    MenuInputState input;
    boolean members;
    private int actionCount;
    static TerrainMaskSupport field_a;
    private int[] actionCodes;

    private final void setActionCount(byte guard) {
        try {
          if (guard != 62) {
            this.updatePointerSelection(103, false);
          }
          if (this.members) {
            this.actionCount = 8;
            if (EscapeVector.obfuscationControl == 0) {
              return;
            }
          }
          this.actionCount = 9;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var2), "t.G(" + guard + ')');
        }
    }

    final static int maxInt(int left, int right, int guard) {
        try {
          if (guard < 9) {
            field_a = (TerrainMaskSupport) null;
          }
          int stackIn_7_0 = (right > left) ? right : left;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var3), "t.K(" + left + ',' + right + ',' + guard + ')');
        }
    }

    final void update(int guard) {
        int var3 = EscapeVector.obfuscationControl;
        try {
          while (true) {
            if (AccountRequestDialog.pollKeyEvent(-111)) {
              this.input.handleKeyEvent((byte) 6);
              boolean stackIn_11_0 = this.handleActivation(guard - 13569, false);
              if (var3 == 0) {
                if (stackIn_11_0) {
                  return;
                }
                continue;
              }
              break;
            }
            this.input.updateVerticalList(guard - 400, 240, 192, 24, guard);
            boolean stackIn_11_0Lifetime1 = this.handleActivation(-13169, true);
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var2), "t.F(" + guard + ')');
        }
    }

    private final void drawAction(int actionCode, int y, byte guard, boolean selected) {
        int stackIn_63_0 = 0;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var7Lifetime2;
        int var11 = EscapeVector.obfuscationControl;
        try {
          if (5 * actionCode > LoginHandshakeSupport.field_d) {
            return;
          }
          LoginHandshakeSupport.field_b.bindAsFramebuffer();
          SoftwareRasterizer.clearFramebuffer();
          int stackIn_8_0 = (!selected) ? 6340704 : 16777215;
          int var5_int = stackIn_8_0;
          if (guard != -34) {
            this.actionCodes = (int[]) null;
          }
          boolean decompiledFrameRemainder0 = true;
          int var6 = LoginHandshakeSupport.field_b.fullWidth / 2;
          if (actionCode == 0) {
            ByteStorage.gameFont.drawCentered(SpriteDecodeSupport.field_e, var6, 22, var5_int, -1);
          }
          if (actionCode != 0 ||
            var11 != 0) {
            if (actionCode != 1) {
              if (actionCode == 2) {
                ByteStorage.gameFont.drawCentered(LoginHandshakeState.instructionsLabel, var6, 22, var5_int, -1);
              }
              if (actionCode != 2 ||
                var11 != 0) {
                if (actionCode == 3) {
                  int var7 = ByteStorage.gameFont.stringWidth(DisplayNameForm.field_N);
                  int var8 = ByteStorage.gameFont.stringWidth(LoginMethod.field_d);
                  int stackIn_31_0 = (var8 < var7) ? var7 : var8;
                  int var9 = stackIn_31_0;
                  int var10 = (var9 - 68) / 2 + var6;
                  ByteStorage.gameFont.drawRight(DisplayNameForm.field_N, var10, 22, var5_int, -1);
                  SingleChildContainer.drawSliderTrack(var10, 13202, 4, IterableNodeHashTable.field_c, var5_int);
                }
                if (actionCode != 3 ||
                  var11 != 0) {
                  if (4 != actionCode) {
                    if (5 == actionCode) {
                      ByteStorage.gameFont.drawCentered(BrowserSessionMarkerState.field_b, var6, 22, var5_int, -1);
                    }
                    if (5 != actionCode ||
                      var11 != 0) {
                      if (actionCode != 6) {
                        if (actionCode != 7 &&
                          (decompiledFrameRemainder0 = (actionCode == 8))) {
                          ByteStorage.gameFont.drawCentered(UiTheme.field_s, var6, 22, var5_int, -1);
                          decompiledFrameRemainder0 = (var11 != 0);
                        }
                        if (decompiledFrameRemainder0) {
                          ByteStorage.gameFont.drawCentered(SessionMenuSupport.field_a, var6, 22, var5_int, -1);
                        }
                      }
                      if (decompiledFrameRemainder0 &&
                        (actionCode == 6 ||
                        var11 != 0)) {
                        ByteStorage.gameFont.drawCentered(DynamicTerrainRenderer.field_m, var6, 22, var5_int, -1);
                        if (var11 != 0) {
                          var7Lifetime2 = ByteStorage.gameFont.stringWidth(DisplayNameForm.field_N);
                          var8Lifetime1 = ByteStorage.gameFont.stringWidth(LoginMethod.field_d);
                          stackIn_63_0 = (var8Lifetime1 >= var7Lifetime2) ? var8Lifetime1 : var7Lifetime2;
                          var9Lifetime1 = stackIn_63_0;
                          var10Lifetime1 = (-68 + var9Lifetime1) / 2 + var6;
                          ByteStorage.gameFont.drawRight(LoginMethod.field_d, var10Lifetime1, 22, var5_int, -1);
                          SingleChildContainer.drawSliderTrack(var10Lifetime1, 13202, 4, MembershipPromotionSupport.field_b, var5_int);
                          ByteStorage.gameFont.drawCentered(EscapeVector.field_z, var6, 22, var5_int, -1);
                        }
                      }
                    }} else {
                    var7Lifetime2 = ByteStorage.gameFont.stringWidth(DisplayNameForm.field_N);
                    var8Lifetime1 = ByteStorage.gameFont.stringWidth(LoginMethod.field_d);
                    stackIn_63_0 = (var8Lifetime1 >= var7Lifetime2) ? var8Lifetime1 : var7Lifetime2;
                    var9Lifetime1 = stackIn_63_0;
                    var10Lifetime1 = (-68 + var9Lifetime1) / 2 + var6;
                    ByteStorage.gameFont.drawRight(LoginMethod.field_d, var10Lifetime1, 22, var5_int, -1);
                    SingleChildContainer.drawSliderTrack(var10Lifetime1, 13202, 4, MembershipPromotionSupport.field_b, var5_int);
                    if (var11 != 0) {
                      ByteStorage.gameFont.drawCentered(EscapeVector.field_z, var6, 22, var5_int, -1);
                    }
                  }
                }}} else {
              ByteStorage.gameFont.drawCentered(EscapeVector.field_z, var6, 22, var5_int, -1);
            }
          }
          AlphaContainer.field_D.bindRaster(112);
          MeshProjectionSupport.markSpriteEdges(LoginHandshakeSupport.field_b, true, 1);
          LoginHandshakeSupport.field_b.addOutline(5267536);
          int var7Lifetime1 = -LoginHandshakeSupport.field_d + 30 + 5 * actionCode;
          if (var7Lifetime1 > 0) {
            ResourceArchive.drawSpriteWithRowJitter(y, (-LoginHandshakeSupport.field_b.fullWidth + 640) / 2, var7Lifetime1, LoginHandshakeSupport.field_b, guard ^ 120);
            if (var11 == 0) {
              return;
            }
          }
          LoginHandshakeSupport.field_b.drawTransparent((-LoginHandshakeSupport.field_b.fullWidth + 640) / 2, y);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var5), "t.A(" + actionCode + ',' + y + ',' + guard + ',' + selected + ')');
        }
    }

    final static ClientException wrapClientException(Throwable failure, String context) {
        ClientException var2;
        RuntimeException var2_ref;
        if (failure instanceof ClientException) {
          var2 = (ClientException) ((Object) failure);
          var2.context = var2.context + ' ' + context;
        } else {
          var2 = new ClientException(failure, context);
        }
        return var2;
    }

    public static void releaseStatics(byte guard) {
        if (guard >= -24) {
          return;
        }
        try {
          field_a = null;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "t.D(" + guard + ')');
        }
    }

    private final int selectedActionCode(int guard) {
        try {
          if (guard < 52) {
            MainMenuScreen.releaseStatics((byte) -84);
          }
          if (this.input.selectedIndex >= 0 &&
            this.actionCodes.length > this.input.selectedIndex) {
            int stackIn_10_0 = this.actionCodes[this.input.selectedIndex];
            return stackIn_10_0;
          }
          int stackIn_8_0 = -1;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var2), "t.E(" + guard + ')');
        }
    }

    private final int actionCodeAt(int guard, int index) {
        try {
          if (guard != 192) {
            int stackIn_2_0 = 121;
            return stackIn_2_0;
          }
          if (index >= 0 &&
            index < this.actionCodes.length) {
            int stackIn_10_0 = this.actionCodes[index];
            return stackIn_10_0;
          }
          int stackIn_8_0 = -1;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var3), "t.I(" + guard + ',' + index + ')');
        }
    }

    final void draw(byte guard) {
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        boolean stackIn_23_4 = false;
        int var5 = EscapeVector.obfuscationControl;
        try {
          SoftwareRasterizer.clearFramebuffer();
          SelfDestructEffects.drawMenuEdges(2);
          if (LoginHandshakeSupport.isLegacyMenuVisible((byte) 117)) {
            int var2_int = InstructionsScreen.legacyMenuWidth(0) / 2 + 20;
            int var3 = 15 + SlidingSpriteTransition.legacyMenuHeight((byte) -122) / 2;
            if (LoginHandshakeSupport.field_d >= 40) {
              stackIn_8_0 = 0;
            } else {
              stackIn_8_0 = -LoginHandshakeSupport.field_d + 40;
            }
            AccountNoticeKind.drawAnimatedPanelFrame(stackIn_8_0, -var2_int + 320, var2_int + 321, 301 + var3, true, 29788, true, 6324320, 3162160, 0, 300 - var3, true);
            AchievementTracker.drawLegacyMenu(guard ^ -16);
            MenuTitleRenderSupport.drawTitles(4);
            return;
          }
          if (LoginHandshakeSupport.field_d >= 40) {
            stackIn_14_0 = 0;
          } else {
            stackIn_14_0 = -LoginHandshakeSupport.field_d + 40;
          }
          AccountNoticeKind.drawAnimatedPanelFrame(stackIn_14_0, 240, 400, 16 + (192 + this.actionCount * 24), true, 29788, true, 6324320, 3162160, 0, 176, true);
          MenuTitleRenderSupport.drawTitles(guard ^ -12);
          int var2_intLifetime1 = 0;
          int var3Lifetime1 = 192;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (this.actionCodes.length <= var2_intLifetime1))) {
            int var4 = this.actionCodeAt(192, var2_intLifetime1);
            if (var5 == 0) {
              Object stackIn_22_0 = this;
              int stackIn_22_1 = var4;
              int stackIn_22_2 = var3Lifetime1;
              int stackIn_22_3 = -34;
              if (~var4 != ~this.selectedActionCode(69)) {
                stackIn_23_4 = false;
              } else {
                Object stackIn_20_0 = this;
                stackIn_23_4 = true;
              }
              this.drawAction(stackIn_22_1, stackIn_22_2, (byte) stackIn_22_3, stackIn_23_4);
              var3Lifetime1 += 24;
              var2_intLifetime1++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0 &&
            guard == -16) {
            return;
          }
          this.input = (MenuInputState) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var2), "t.L(" + guard + ')');
        }
    }

    final void updatePointerSelection(int guard, boolean pointerDriven) {
        if (guard != -26480) {
          return;
        }
        try {
          this.input.setPointerSelection(this.input.hitVerticalList((byte) 115, 192, GzipDecoder.field_d, 24, 400, UiContainer.field_y, 240), pointerDriven, 4767999);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "t.J(" + guard + ',' + pointerDriven + ')');
        }
    }

    private final void buildActionCodes(int guard) {
        try {
          boolean decompiledSharedTail0 = !(this.members);
          if (!decompiledSharedTail0) {
            this.actionCodes = new int[]{0, 2, 3, 4, 5, 6, 7, 8};
            decompiledSharedTail0 = (EscapeVector.obfuscationControl != 0);
          }
          if (decompiledSharedTail0) {
            this.actionCodes = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
          }
          if (guard != 22) {
            field_a = (TerrainMaskSupport) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var2), "t.H(" + guard + ')');
        }
    }

    private final boolean handleActivation(int guard, boolean pointerDriven) {
        int var10 = EscapeVector.obfuscationControl;
        try {
          if (this.input.selectionChanged) {
            ObjectSpriteSet.field_e.playSampleWithPan(ArchiveRequest.field_w, 100, 1536 * IterableNodeHashTable.field_c / 64, 8192);
          }
          int var3_int = this.selectedActionCode(123);
          if (var3_int == 0 &&
            this.input.isInitialActivation((byte) -18)) {
            GameplaySession.openSessionScreen(pointerDriven, 2560);
            return true;
          }
          if (var3_int == 1 &&
            this.input.isInitialActivation((byte) -18)) {
            IntegerParseSupport.field_c = true;
            AccountSessionSupport.field_a.open(pointerDriven, (byte) 47);
            LoginHandshakeSupport.field_d = 0;
          }
          if (var3_int == 2 &&
            this.input.isInitialActivation((byte) -18)) {
            InstructionsNavigationSupport.openInstructions(this.input.pointerDriven, false);
            return true;
          }
          boolean decompiledFrameRemainder0 = true;
          if (var3_int == 3) {
            if (this.input.isLeftPressed(guard + 13072) &&
              IterableNodeHashTable.field_c > 0) {
              IterableNodeHashTable.field_c = IterableNodeHashTable.field_c - 8;
              if (0 > IterableNodeHashTable.field_c) {
                IterableNodeHashTable.field_c = 0;
              }
              TrackerMusicDefinition.playFootstep(8192);
            }
            if (this.input.isRightPressed(-98) &&
              IterableNodeHashTable.field_c < 64) {
              IterableNodeHashTable.field_c = IterableNodeHashTable.field_c + 8;
              if (IterableNodeHashTable.field_c > 64) {
                IterableNodeHashTable.field_c = 64;
              }
              TrackerMusicDefinition.playFootstep(8192);
            }
            if (this.input.isHomePressed(-10809)) {
              IterableNodeHashTable.field_c = 0;
              TrackerMusicDefinition.playFootstep(8192);
            }
            if (this.input.isEndPressed(0)) {
              IterableNodeHashTable.field_c = 64;
              TrackerMusicDefinition.playFootstep(8192);
            }
            if (!this.input.isPointerHeld(false) &&
              (decompiledFrameRemainder0 = !(!this.input.isInitialActivation((byte) -18)))) {
              TrackerMusicDefinition.playFootstep(guard ^ -4977);
              decompiledFrameRemainder0 = (var10 != 0);
            }
            if (decompiledFrameRemainder0) {
              int var4 = ByteStorage.gameFont.stringWidth(DisplayNameForm.field_N);
              int var5 = ByteStorage.gameFont.stringWidth(LoginMethod.field_d);
              int stackIn_68_0 = (var4 <= var5) ? var5 : var4;
              int var6 = stackIn_68_0;
              int var7 = 320 + (var6 - 68) / 2;
              int var8 = -var7 - 2 + GzipDecoder.field_d;
              if (!(var8 >= 0)) {
                var8 = 0;
              } else if (var8 > 64) {
                var8 = 64;
                if (var10 != 0) {
                  var8 = 0;
                }
              }
              if (this.input.isInitialActivation((byte) -18) ||
                ~IterableNodeHashTable.field_c != ~var8) {
                IterableNodeHashTable.field_c = var8;
                TrackerMusicDefinition.playFootstep(8192);
              }
            }
          }
          if (var3_int == 4) {
            if (this.input.isLeftPressed(116) &&
              MembershipPromotionSupport.field_b > 0) {
              MembershipPromotionSupport.field_b = MembershipPromotionSupport.field_b - 8;
              if (MembershipPromotionSupport.field_b < 0) {
                MembershipPromotionSupport.field_b = 0;
              }
              TrackerMusicPlayer var4_ref_o = DraggableWidget.field_N;
              if (null != var4_ref_o) {
                var4_ref_o.setMasterVolume(GrowableIntList.field_b * MembershipPromotionSupport.field_b / 64);
              }
            }
            if (this.input.isRightPressed(-98) &&
              MembershipPromotionSupport.field_b < 64) {
              MembershipPromotionSupport.field_b = MembershipPromotionSupport.field_b + 8;
              if (64 < MembershipPromotionSupport.field_b) {
                MembershipPromotionSupport.field_b = 64;
              }
              TrackerMusicPlayer var4_ref_oLifetime1 = DraggableWidget.field_N;
              if (null != var4_ref_oLifetime1) {
                var4_ref_oLifetime1.setMasterVolume(GrowableIntList.field_b * MembershipPromotionSupport.field_b / 64);
              }
            }
            if (this.input.isHomePressed(-10809)) {
              MembershipPromotionSupport.field_b = 0;
              TrackerMusicPlayer var4_ref_oLifetime2 = DraggableWidget.field_N;
              if (var4_ref_oLifetime2 != null) {
                var4_ref_oLifetime2.setMasterVolume(MembershipPromotionSupport.field_b * GrowableIntList.field_b / 64);
              }
            }
            if (this.input.isEndPressed(0)) {
              MembershipPromotionSupport.field_b = 64;
              TrackerMusicPlayer var4_ref_oLifetime3 = DraggableWidget.field_N;
              if (var4_ref_oLifetime3 != null) {
                var4_ref_oLifetime3.setMasterVolume(GrowableIntList.field_b * MembershipPromotionSupport.field_b / 64);
              }
            }
            if (this.input.isPointerHeld(false)) {
              int var4Lifetime1 = ByteStorage.gameFont.stringWidth(DisplayNameForm.field_N);
              int var5Lifetime1 = ByteStorage.gameFont.stringWidth(LoginMethod.field_d);
              int stackIn_129_0 = (var4Lifetime1 <= var5Lifetime1) ? var5Lifetime1 : var4Lifetime1;
              int var6Lifetime1 = stackIn_129_0;
              int var7Lifetime1 = 320 + (-68 + var6Lifetime1) / 2;
              int var8Lifetime1 = GzipDecoder.field_d - 2 - var7Lifetime1;
              if (0 > var8Lifetime1) {
                var8Lifetime1 = 0;
                if (var10 != 0 &&
                  var8Lifetime1 > 64) {
                  var8Lifetime1 = 64;
                }
              } else if (var8Lifetime1 > 64) {
                var8Lifetime1 = 64;
              }
              MembershipPromotionSupport.field_b = var8Lifetime1;
              TrackerMusicPlayer var9 = DraggableWidget.field_N;
              if (var9 != null) {
                var9.setMasterVolume(GrowableIntList.field_b * MembershipPromotionSupport.field_b / 64);
              }
            }
          }
          if (var3_int == 5 &&
            this.input.isInitialActivation((byte) -18)) {
            if (null != IsaacRandom.field_d) {
              DisplayAndRatingSupport.exitFullscreen(guard - 11954);
              if (var10 != 0) {
                TickClock.configureDefaultMenuStyle(24, pointerDriven);
              }
            } else {
              TickClock.configureDefaultMenuStyle(24, pointerDriven);
            }
            return true;
          }
          if (var3_int == 6 &&
            this.input.isInitialActivation((byte) -18)) {
            SpriteArchiveSupport.showHighscoresScreen(this.input.pointerDriven, -1230, false);
            LoginHandshakeSupport.field_d = 0;
            ChatMessage.clearFrameOffsets((byte) -96);
            return true;
          }
          if (var3_int == 7 &&
            this.input.isInitialActivation((byte) -18)) {
            SpriteState.showAchievementsScreen(guard + 13193, this.input.pointerDriven);
            LoginHandshakeSupport.field_d = 0;
            ChatMessage.clearFrameOffsets((byte) -94);
            return true;
          }
          if (guard != -13169) {
            this.updatePointerSelection(2, false);
          }
          if (8 == var3_int &&
            this.input.isInitialActivation((byte) -18)) {
            if (IsaacRandom.field_d != null) {
              DisplayAndRatingSupport.exitFullscreen(-25123);
            }
            QuitPageSupport.openQuitPage(-9787, PointCloudEffect.activeApplet((byte) -122));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var3), "t.B(" + guard + ',' + pointerDriven + ')');
        }
    }

    MainMenuScreen() {
        try {
          this.members = UiContainer.hasMembership((byte) 117);
          this.setActionCount((byte) 62);
          this.buildActionCodes(22);
          this.input = new MenuInputState(this.actionCount);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "t.<init>()");
        }
    }

    static {
        field_a = new TerrainMaskSupport();
    }
}
