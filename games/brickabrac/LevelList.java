/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LevelList {
    private int rowSpacing;
    private int rowHeight;
    private int scrollOffset;
    private MenuScreen owner;
    private LevelPack pack;
    private int lastPointerY;
    int scrollStep;
    private int lastPointerX;
    private boolean keyboardSelection;
    private int labelBaselineOffset;
    private int buttonIndex;
    private int maxScrollOffset;
    static RgbSprite[] volcanicCentreSprites;
    static ResourceArchive field_o;
    private int rowGap;
    private MenuButton viewport;
    private int contentHeight;
    int selectedLevelIndex;

    public static void a(boolean param0) {
        field_o = null;
        volcanicCentreSprites = null;
        if (!param0) {
          CharSequence var2 = (CharSequence) null;
          LevelList.a((CharSequence) null, false);
        }
    }

    final void scrollBy(int deltaPixels, boolean clamp) {
        this.scrollOffset = this.scrollOffset + deltaPixels;
        if (!clamp) {
          return;
        }
        if (this.scrollOffset < 0) {
          this.scrollOffset = 0;
        }
        if (this.scrollOffset > this.maxScrollOffset) {
          this.scrollOffset = this.maxScrollOffset;
        }
    }

    final static void a(int param0) {
        if (null != ArrayWidgetGroup.buttonLabels) {
          return;
        }
        ArrayWidgetGroup.buttonLabels = new String[46];
        ArrayWidgetGroup.buttonLabels[5] = TextHotspotRegion.field_l;
        ArrayWidgetGroup.buttonLabels[3] = MusicCrossfadeStream.field_B;
        ArrayWidgetGroup.buttonLabels[4] = pp.field_c;
        ArrayWidgetGroup.buttonLabels[9] = LevelPackLoader.field_d;
        ArrayWidgetGroup.buttonLabels[1] = ArchiveNetworkRequest.field_H;
        ArrayWidgetGroup.buttonLabels[11] = StrongCacheEntry.field_H;
        ArrayWidgetGroup.buttonLabels[7] = jj.field_b;
        ArrayWidgetGroup.buttonLabels[0] = BirthDateEntryPanel.field_O;
        ArrayWidgetGroup.buttonLabels[6] = GamePresentationHelpers.field_b;
        ArrayWidgetGroup.buttonLabels[8] = null;
        ArrayWidgetGroup.buttonLabels[13] = QuickChatSineHelpers.field_a;
        ArrayWidgetGroup.buttonLabels[27] = MatchResultScreen.field_r;
        ArrayWidgetGroup.buttonLabels[2] = DebouncedValidationSource.field_e;
        CacheEntry.field_A[11] = MusicCrossfadeStream.field_w;
        CacheEntry.field_A[5] = ProxyAuthenticationRequiredException.field_c;
        CacheEntry.field_A[6] = ch.field_i;
        CacheEntry.field_A[9] = SecondaryHashTable.field_a;
        CacheEntry.field_A[4] = OutgoingPacketHelpers.field_d;
        ArrayWidgetGroup.buttonLabels[14] = SpriteInputHelpers.field_c[0];
        CacheEntry.field_A[3] = ChatLobbyUiHelpers.field_e;
        ArrayWidgetGroup.buttonLabels[39] = BackgroundScene.field_o;
        ArrayWidgetGroup.buttonLabels[23] = UiComponent.field_mb;
        ArrayWidgetGroup.buttonLabels[21] = ArchiveNetworkClient.field_r;
        ArrayWidgetGroup.buttonLabels[17] = LevelCompleteScreen.field_E[0];
        ArrayWidgetGroup.buttonLabels[38] = kk.field_a;
        if (param0 != -1) {
          return;
        }
        ArrayWidgetGroup.buttonLabels[34] = f.field_b;
        ArrayWidgetGroup.buttonLabels[28] = ConstructionBackground.field_r;
        ArrayWidgetGroup.buttonLabels[19] = HighscorePackSelector.field_g;
        ArrayWidgetGroup.buttonLabels[35] = LevelPackLoader.field_d;
        ArrayWidgetGroup.buttonLabels[20] = LevelResultSubmission.field_q;
        ArrayWidgetGroup.buttonLabels[33] = CanvasInputCleanup.field_c;
        ArrayWidgetGroup.buttonLabels[32] = LoginPanel.field_L;
        ArrayWidgetGroup.buttonLabels[25] = DiagnosticTextLine.field_i;
        ArrayWidgetGroup.buttonLabels[24] = DesertBackground.field_r;
        ArrayWidgetGroup.buttonLabels[42] = Widget.field_u;
        ArrayWidgetGroup.buttonLabels[37] = LevelPackLoader.field_i;
        CacheEntry.field_A[7] = AppletGameShell.field_f;
        CacheEntry.field_A[8] = PauseMenuScreen.field_v;
        ArrayWidgetGroup.buttonLabels[15] = SpriteInputHelpers.field_c[1];
        ArrayWidgetGroup.buttonLabels[16] = SpriteInputHelpers.field_c[2];
        CacheEntry.field_A[12] = AppletResourceHelpers.field_b;
        CacheEntry.field_A[10] = WidgetTheme.field_d;
        ArrayWidgetGroup.buttonLabels[18] = LevelCompleteScreen.field_E[1];
        ArrayWidgetGroup.buttonLabels[26] = PauseMenuScreen.field_u;
        ArrayWidgetGroup.buttonLabels[22] = FocusableWidget.field_D;
        CacheEntry.field_A[13] = TimedSplashScreen.field_s;
        hm.field_b = new String[]{ContentTransitionPhase.field_a, BrowserResizeNotificationHelpers.field_c, TabbedPane.field_Pb, ResourcePreparationQueue.field_a};
        CacheEntry.field_A[16] = MeshAttributeRecord.field_d;
        CanvasResizeController.packNames = new String[]{RadialSelectorWidget.field_T, Widget.field_u};
        WidgetTheme.lostBallMessages = new String[]{ArrayWidgetGroup.field_C, AccountContentTransitionLayer.field_ub, PlayerNameChooserPanel.field_P, FullscreenDialogHelpers.field_f, jh.field_c};
        ar.field_a = new String[]{kk.field_a};
        CacheEntry.field_A[15] = MatchCompleteScreen.field_F;
        ArchiveFetchClient.field_j = new String[]{LoginCredentials.field_g, MusicPatch.field_m, GameRenderAudioHelpers.field_b, RectangleBody.field_t};
        TextLineLayout.field_e = new String[]{MultiValueSliderWidget.field_N, ReflectionCheck.field_o, MonotonicTime.field_a, EmailLoginCredentials.field_m, ch.field_j, GameTransportActions.field_a, AppletFlowHelpers.field_f, OutgoingPacketHelpers.field_h};
        CacheEntry.field_A[17] = MusicPatch.field_q;
        CacheEntry.field_A[14] = RadialSelectorWidget.field_V;
        CacheEntry.field_A[18] = GameScreen.field_g;
    }

    final static short[] readPackedShortArray(byte obfuscationGuard, short[] reuse, BitPacketBuffer packet, int lengthBits) {
        int count = 0;
        int valueBits = 0;
        int base = 0;
        int element = 0;
        int unusedGameFlag = 0;
        short[] invalidGuardResult = null;
        Object emptyResult = null;
        short[] result = null;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String reuseSummary = null;
        StringBuilder packetContext = null;
        String packetSummary = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          if (obfuscationGuard >= -53) {
            invalidGuardResult = (short[]) null;
            return invalidGuardResult;
          }
          count = packet.readBits(lengthBits, (byte) 61);
          if (count == 0) {
            emptyResult = null;
            return (short[]) (emptyResult);
          }
          if (reuse == null ||
            reuse.length != count) {
            reuse = new short[count];
          }
          valueBits = packet.readBits(4, (byte) 122);
          base = (short)packet.readBits(16, (byte) 94);
          if (valueBits <= 0) {
            for (element = 0; element < count; element++) {
              reuse[element] = (short)base;
            }
          } else {
            for (element = 0; count > element; element++) {
              reuse[element] = (short)(packet.readBits(valueBits, (byte) 91) + base);
            }
          }
          result = (short[]) (reuse);
          return result;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("uj.E(").append(obfuscationGuard).append(',');
          if (reuse == null) {
            reuseSummary = "null";
          } else {
            reuseSummary = "{...}";
          }
          packetContext = ((StringBuilder) (Object) contextBuilder).append(reuseSummary).append(',');
          if (packet == null) {
            packetSummary = "null";
          } else {
            packetSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) packetContext).append(packetSummary).append(',').append(lengthBits).append(')').toString());
        }
    }

    final void selectFirst(byte obfuscationGuard) {
        this.lastPointerX = MusicPatch.pointerX;
        this.scrollOffset = 0;
        this.lastPointerY = ResourcePreparationEntry.pointerY;
        this.keyboardSelection = true;
        this.selectedLevelIndex = 0;
        int var2 = 125 % ((-49 - obfuscationGuard) / 41);
    }

    final void draw(byte obfuscationGuard) {
        int rowBaselineY = 0;
        int levelIndex;
        int labelStyle;
        int clientBranchFlag;
        clientBranchFlag = BrickABrac.field_J ? 1 : 0;
        MovingBody.a((byte) 70, this.viewport.x + this.viewport.width, this.viewport.x, this.viewport.y, this.viewport.y + this.viewport.height);
        levelIndex = AccountDateHelpers.divideFloorPositive(this.rowSpacing, (byte) 15, this.scrollOffset - this.rowGap);
        if (obfuscationGuard != 28) {
          return;
        }
        for (rowBaselineY = this.viewport.y + (-this.scrollOffset + this.rowGap + this.labelBaselineOffset) + levelIndex * this.rowSpacing; this.viewport.height + (10 + this.viewport.y) > rowBaselineY; rowBaselineY = rowBaselineY + this.rowSpacing) {
          if (this.pack.levelCount > levelIndex) {
            if (0 <= levelIndex) {
              labelStyle = 3;
              if (hh.unlockedLevelCounts[this.pack.packId] < levelIndex) {
                if (this.selectedLevelIndex == levelIndex) {
                  labelStyle = 0;
                }
              } else {
                labelStyle = (levelIndex != this.selectedLevelIndex) ? 2 : 1;
              }
              ContextActionController.field_g.drawCentered(this.pack.metadata[levelIndex].numberLabel, (this.viewport.x * 2 + this.viewport.width) / 2, rowBaselineY, labelStyle, -1);
            }
            levelIndex++;
            continue;
          }
          break;
        }
        sc.popRaster(-106);
        return;
    }

    final boolean handleNavigationKey(int obfuscationGuard, int keyCode, int characterCode) {
        int centerLevelIndex;
        centerLevelIndex = AccountDateHelpers.divideFloorPositive(this.rowHeight, (byte) 15, this.scrollOffset - this.rowGap) + this.viewport.height / (2 * this.rowSpacing);
        if (obfuscationGuard != -28088) {
          this.contentHeight = -121;
        }
        if (keyCode == 99) {
          this.keyboardSelection = true;
          this.selectedLevelIndex = this.selectedLevelIndex + 1;
          if (this.selectedLevelIndex > centerLevelIndex) {
            this.scrollBy(this.rowSpacing, true);
          }
        } else {
          if (keyCode == 98) {
            this.selectedLevelIndex = this.selectedLevelIndex - 1;
            this.keyboardSelection = true;
            if (this.selectedLevelIndex <= centerLevelIndex - 1) {
              this.scrollBy(-this.rowSpacing, true);
            }
          }
        }
        if (this.selectedLevelIndex >= 0 &&
          this.pack.levelCount > this.selectedLevelIndex) {
          return false;
        }
        this.selectedLevelIndex = -1;
        this.keyboardSelection = false;
        return true;
    }

    final void selectLast(byte obfuscationGuard) {
        this.keyboardSelection = true;
        this.selectedLevelIndex = -1 + this.pack.levelCount;
        this.scrollOffset = this.maxScrollOffset;
        if (obfuscationGuard >= -39) {
          this.scrollBy(47, false);
        }
        this.lastPointerY = ResourcePreparationEntry.pointerY;
        this.lastPointerX = MusicPatch.pointerX;
    }

    final void setScrollOffset(int offsetPixels) {
        this.scrollOffset = offsetPixels;
    }

    final void updatePointerSelection(boolean obfuscationGuard) {
        if (this.buttonIndex != this.owner.selection.selectedIndex) {
          this.selectedLevelIndex = -1;
          this.lastPointerX = -1;
          this.lastPointerY = -1;
          this.keyboardSelection = false;
        } else {
          this.scrollBy(GameplayAudioEvent.mouseWheelDelta * this.scrollStep, true);
          this.keyboardSelection = this.keyboardSelection & (GameplayAudioEvent.mouseWheelDelta == 0 ? true : false);
          if (!this.keyboardSelection ||
            MusicPatch.pointerX != this.lastPointerX ||
            this.lastPointerY != ResourcePreparationEntry.pointerY) {
            this.selectedLevelIndex = AccountDateHelpers.divideFloorPositive(this.rowSpacing, (byte) 15, ResourcePreparationEntry.pointerY - (this.viewport.y - (-this.rowGap + this.scrollOffset)));
            if (this.selectedLevelIndex < 0) {
              this.selectedLevelIndex = 0;
            }
            if (!(this.pack.levelCount >= this.selectedLevelIndex)) {
              this.selectedLevelIndex = this.pack.levelCount;
            }
          }
          this.lastPointerY = ResourcePreparationEntry.pointerY;
          this.lastPointerX = MusicPatch.pointerX;
        }
        if (obfuscationGuard) {
          this.viewport = (MenuButton) null;
        }
    }

    final static byte[] a(CharSequence param0, boolean param1) {
        int var4 = 0;
        byte[] stackIn_69_0 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param1) {
            field_o = (ResourceArchive) null;
          }
          var2_int = param0.length();
          var3 = new byte[var2_int];
          for (var4 = 0; var2_int > var4; var4++) {
            {
              var5 = param0.charAt(var4);
              if ((0 >= var5 ||
                128 <= var5) && (var5 < 160 ||
                var5 > 255)) {
                switch (var5) {
                  case 8364:
                    var3[var4] = (byte)-128;
                    break;
                  case 8218:
                    var3[var4] = (byte)-126;
                    break;
                  case 402:
                    var3[var4] = (byte)-125;
                    break;
                  case 8222:
                    var3[var4] = (byte)-124;
                    break;
                  case 8230:
                    var3[var4] = (byte)-123;
                    break;
                  case 8224:
                    var3[var4] = (byte)-122;
                    break;
                  case 8225:
                    var3[var4] = (byte)-121;
                    break;
                  case 710:
                    var3[var4] = (byte)-120;
                    break;
                  case 8240:
                    var3[var4] = (byte)-119;
                    break;
                  case 352:
                    var3[var4] = (byte)-118;
                    break;
                  case 8249:
                    var3[var4] = (byte)-117;
                    break;
                  case 338:
                    var3[var4] = (byte)-116;
                    break;
                  case 381:
                    var3[var4] = (byte)-114;
                    break;
                  case 8216:
                    var3[var4] = (byte)-111;
                    break;
                  case 8217:
                    var3[var4] = (byte)-110;
                    break;
                  case 8220:
                    var3[var4] = (byte)-109;
                    break;
                  case 8221:
                    var3[var4] = (byte)-108;
                    break;
                  case 8226:
                    var3[var4] = (byte)-107;
                    break;
                  case 8211:
                    var3[var4] = (byte)-106;
                    break;
                  case 8212:
                    var3[var4] = (byte)-105;
                    break;
                  case 732:
                    var3[var4] = (byte)-104;
                    break;
                  case 8482:
                    var3[var4] = (byte)-103;
                    break;
                  case 353:
                    var3[var4] = (byte)-102;
                    break;
                  case 8250:
                    var3[var4] = (byte)-101;
                    break;
                  case 339:
                    var3[var4] = (byte)-100;
                    break;
                  case 382:
                    var3[var4] = (byte)-98;
                    break;
                  case 376:
                    var3[var4] = (byte)-97;
                    break;
                  default:
                    var3[var4] = (byte)63;
                    break;
                }
              } else {
                var3[var4] = (byte)var5;
              }
            }
          }
          stackIn_69_0 = var3;
          return stackIn_69_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_72_0 = var2;
          stackIn_72_1 = new StringBuilder().append("uj.G(");
          if (param0 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param1).append(')').toString());
        }
    }

    LevelList(int rowHeight, int rowGap, int buttonIndex, MenuScreen owner, MenuButton viewport, LevelPack pack) {
        this.selectedLevelIndex = -1;
        try {
          this.rowSpacing = rowHeight + rowGap;
          this.owner = owner;
          this.viewport = viewport;
          this.buttonIndex = buttonIndex;
          this.pack = pack;
          this.labelBaselineOffset = ContextActionController.field_g.xHeight + (ContextActionController.field_g.capHeight - 5);
          this.rowGap = rowGap;
          this.rowHeight = rowHeight;
          this.contentHeight = this.rowGap + this.pack.levelCount * this.rowSpacing;
          this.maxScrollOffset = -this.viewport.height + this.contentHeight + 5;
          if (0 > this.maxScrollOffset) {
            this.maxScrollOffset = 0;
          }
          this.scrollStep = 3 * this.rowHeight / 2;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "uj.<init>(" + rowHeight + ',' + rowGap + ',' + buttonIndex + ',' + (owner != null ? "{...}" : "null") + ',' + (viewport != null ? "{...}" : "null") + ',' + (pack != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
