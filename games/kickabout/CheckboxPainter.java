/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CheckboxPainter implements WidgetPainter {
    static MenuSelection field_c;
    private int field_d;
    static String[] field_b;
    private int field_n;
    private int field_i;
    static int field_k;
    private int field_p;
    private BitmapFont field_m;
    private int field_g;
    private int field_f;
    private int field_j;
    private int field_a;
    private int field_e;
    static ArgbSprite field_o;
    private int field_l;
    private int field_h;

    final static void a(int param0) {
        int var3 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        String stackIn_26_0 = null;
        String stackIn_33_0 = null;
        int stackIn_38_0 = 0;
        String stackIn_38_1 = null;
        boolean stackIn_39_2 = false;
        NineSlicePanelPainter stackIn_44_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        NineSlicePanelPainter var9 = null;
        int var10 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var10 = Kickabout.field_G;
        try {
          var1_int = ChatInputState.field_c;
          var2 = param0;
          if (TextPromptState.field_a == 2) {
            var3_long = -PlayingView.field_o + MonotonicClock.monotonicMillis(-50);
            var2 = (int)((10999L - var3_long) / 1000L);
            if (var2 < 0) {
              var2 = 0;
            }
          }
          for (var3 = 0; WeightedLruCache.field_c.length > var3; var3++) {
            var4 = AchievementQuery.field_g[var3];
            if (0 > var4) {
              var5 = MarkerSliderPainter.field_k;
            } else {
              if (var4 != DirectByteStorage.field_k.selectedIndex) {
                var5 = ArrayWidgetContainer.field_v;
              } else {
                var5 = NumericDateInputWidget.field_R;
              }
            }
            var6 = WeightedLruCache.field_c[var3];
            if (TextPromptState.field_a == 2 &&
              1 == var2) {
              if (StrongCacheEntry.field_D.length <= TrinketIcon.field_Eb.length) {
                stackIn_18_0 = TrinketIcon.field_Eb.length;
              } else {
                stackIn_18_0 = StrongCacheEntry.field_D.length;
              }
              var7 = stackIn_18_0;
              if (SharedPanelFactory.field_a.length < CaptionedContainer.field_E.length) {
                stackIn_21_0 = CaptionedContainer.field_E.length;
              } else {
                stackIn_21_0 = SharedPanelFactory.field_a.length;
              }
              var8 = stackIn_21_0;
              if (6 <= var3 &&
                var3 < var7 + 6) {
                if (-6 + var3 - (-TrinketIcon.field_Eb.length + var7) >= 0) {
                  stackIn_26_0 = TrinketIcon.field_Eb[-var7 - 6 + (var3 + TrinketIcon.field_Eb.length)];
                } else {
                  stackIn_26_0 = "";
                }
                var6 = stackIn_26_0;
              }
              if (var3 >= var7 + 7 &&
                var3 < var8 + 7 + var7) {
                if (SharedPanelFactory.field_a.length <= var3 - (7 + var7)) {
                  stackIn_33_0 = "";
                } else {
                  stackIn_33_0 = SharedPanelFactory.field_a[-7 + (var3 - var7)];
                }
                var6 = stackIn_33_0;
              }
            }
            if (var4 == -2) {
              var6 = Integer.toString(var2);
            }
            stackIn_38_0 = 10;
            stackIn_38_1 = var6;
            stackIn_39_2 = !(var4 < 0);
            var7Lifetime1 = MatchTransitionScreen.a(stackIn_38_0, stackIn_38_1, stackIn_39_2);
            var8Lifetime1 = TeamManagementScreen.field_A - (var7Lifetime1 >> 1);
            if (var4 >= 0) {
              if (DirectByteStorage.field_k.selectedIndex == var4) {
                stackIn_44_0 = SharedChatLayoutSupport.field_a;
              } else {
                stackIn_44_0 = LinkTextPainter.field_e;
              }
              var9 = stackIn_44_0;
              var1_int = var1_int + ThreadSleepSupport.field_a;
              if (var9 != null) {
                var9.drawPanel(-DiskCacheWorker.field_d + var8Lifetime1, PlayerModelPreview.field_j + (LeagueRatingRequirements.field_d << 1), var1_int, var7Lifetime1 + (DiskCacheWorker.field_d << 1), param0 ^ 3);
              }
              var1_int = var1_int + LeagueRatingRequirements.field_d;
            }
            if (var4 < 0) {
              MeshObject.field_f.drawText(var6, var8Lifetime1, InputLayoutState.field_d + var1_int, var5, -1);
              var1_int = var1_int + PlayArea.field_c;
            } else {
              MainMenuScreen.field_F.drawText(var6, var8Lifetime1, ConsoleExpression.field_g + var1_int, var5, -1);
              var1_int = var1_int + (PlayerModelPreview.field_j + ThreadSleepSupport.field_a + LeagueRatingRequirements.field_d);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var1), "re.E(" + param0 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_b = null;
        field_o = null;
        if (param0 != 109) {
          CheckboxPainter.a((byte) 112, -27, 55, -64);
        }
        field_c = null;
    }

    final static void b(int param0) {
        int var1;
        int var1Lifetime1;
        int var1Lifetime2;
        int var1Lifetime3;
        if (param0 <= 85) {
          field_k = 33;
        }
        AuctionItem.field_f = AuctionItem.field_f + 3;
        if (AuctionItem.field_f >= 256) {
          AuctionItem.field_f = AuctionItem.field_f - 256;
        }
        if (FadingSoundPlayer.field_q) {
          AccountNameCheckState.advanceLoadingStep(0, 0);
          var1 = PitchSurfaceLoader.loadPitchSurface(RankingsScreen.field_C, KitPatternMaskSupport.field_c, (byte) -110);
          if (var1 != -1) {
            DelayedServerPacket.a(100, 9863, var1);
            return;
          }
          if (!CachedListingRow.loadGoalScenery(63, KitPatternMaskSupport.field_c, RankingsScreen.field_C)) {
            DelayedServerPacket.a(2, 9863, 1);
            return;
          }
          AccountNameCheckState.advanceLoadingStep(0, 1);
          if (0 != KitPatternMaskSupport.field_c) {
            if (KitPatternMaskSupport.field_c == 1) {
              var1Lifetime1 = ReceivedAuctionItem.b(123);
              if (var1Lifetime1 != -1) {
                DelayedServerPacket.a(100, 9863, var1Lifetime1);
                return;
              }
            } else {
              if (KitPatternMaskSupport.field_c == 2) {
                var1Lifetime1 = StreetSceneryLoader.loadStreetScenery(-124);
                if (var1Lifetime1 != -1) {
                  DelayedServerPacket.a(100, 9863, var1Lifetime1);
                  return;
                }
              }
            }
          } else {
            var1Lifetime1 = FullscreenErrorDialog.c(false);
            if (var1Lifetime1 != -1) {
              DelayedServerPacket.a(100, 9863, var1Lifetime1);
              return;
            }
          }
          AccountNameCheckState.advanceLoadingStep(0, 2);
          if (2 != RankingsScreen.field_C) {
            if (RankingsScreen.field_C == 3) {
              var1Lifetime2 = AvailabilityCheckRequest.loadStadiumScenery((byte) 28);
              if (var1Lifetime2 != -1) {
                DelayedServerPacket.a(100, 9863, var1Lifetime2);
                return;
              }
            }
          } else {
            if (!LobbyMatchPreview.ensureBleachersLoaded((byte) -94)) {
              DelayedServerPacket.a(1, 9863, 0);
              return;
            }
          }
          AccountNameCheckState.advanceLoadingStep(0, 3);
          var1Lifetime3 = GrowableIntList.a(5464, KitPatternMaskSupport.field_c, RankingsScreen.field_C);
          if (var1Lifetime3 != -1) {
            DelayedServerPacket.a(100, 9863, var1Lifetime3);
            return;
          }
          AccountNameCheckState.advanceLoadingStep(0, 4);
          if (!MyKitScreen.ensureSoundLoaded(120, TrinketPickerDialog.a(KitPatternMaskSupport.field_c, 121, NanoTickClock.field_n, RankingsScreen.field_C))) {
            DelayedServerPacket.a(4, 9863, 0);
            return;
          }
          AccountNameCheckState.advanceLoadingStep(0, 5);
          if (RankingsScreen.field_C == 2) {
            if (!MyKitScreen.ensureSoundLoaded(108, 4)) {
              DelayedServerPacket.a(2, 9863, 0);
              return;
            }
            if (!MyKitScreen.ensureSoundLoaded(117, 5)) {
              DelayedServerPacket.a(2, 9863, 1);
              return;
            }
          } else {
            if (RankingsScreen.field_C == 3) {
              if (!MyKitScreen.ensureSoundLoaded(109, 6)) {
                DelayedServerPacket.a(2, 9863, 0);
                return;
              }
              if (!MyKitScreen.ensureSoundLoaded(120, 7)) {
                DelayedServerPacket.a(2, 9863, 1);
                return;
              }
            }
          }
          if (ArchiveIndex.field_t) {
            DateInputValidator.field_e = null;
            DualLinkNode.field_h = null;
            ModalPanel.field_G = null;
            ClientInteractionSupport.field_e = null;
            ClientPacketFlushSupport.field_f = null;
            AccountNameCheckState.advanceLoadingStep(0, 6);
            if (0 == RankingsScreen.field_C) {
              UiLayoutNode.a(15, 6, 50, 0);
            }
            if (RankingsScreen.field_C == 1) {
              UiLayoutNode.a(15, 5, 70, 20);
            }
            if (2 == RankingsScreen.field_C) {
              UiLayoutNode.a(15, 4, 128, 0);
            }
            if (3 == RankingsScreen.field_C) {
              UiLayoutNode.a(15, 3, 256, 0);
            }
            AccountNameCheckState.advanceLoadingStep(0, 7);
            if (RankingsScreen.field_C == 2) {
              UiInputRoutingSupport.buildSliderTrackSprites(true, 128);
            }
            if (RankingsScreen.field_C == 3) {
              PitchAppearanceSupport.buildPitchSprites((byte) -39, 128);
            }
            AccountNameCheckState.advanceLoadingStep(0, 8);
            PitchDecorationSupport.buildPitchDecorations(true);
            AccountNameCheckState.advanceLoadingStep(0, 9);
            if (0 == KitPatternMaskSupport.field_c) {
              MusicPatchPcmStream.b(1);
            }
            if (KitPatternMaskSupport.field_c == 1) {
              GameResourceLoader.a((byte) -48);
            }
            if (KitPatternMaskSupport.field_c == 2) {
              MeshObject.a(11383);
            }
            AccountNameCheckState.advanceLoadingStep(0, 10);
            MatchTextInputOverlay.setRenderDetail(-4121, RankingsScreen.field_C);
            ArchiveIndex.field_t = false;
          }
          FadingSoundPlayer.field_q = false;
        }
    }

    final static void a(byte param0, int param1, int param2, int param3) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        RowRangeRequest var9 = null;
        var8 = Kickabout.field_G;
        try {
          if (PlayArea.isGuestSession(100)) {
            return;
          }
          if (PlayerContextMenu.field_f) {
            return;
          }
          if (param1 >= 0) {
            if (param1 > TrinketSlot.field_Db[param3]) {
              param1 = TrinketSlot.field_Db[param3];
            }
          } else {
            param1 = 0;
          }
          if (param2 < 0) {
            param1 = 0;
          } else {
            if (TrinketSlot.field_Db[param3] < param2) {
              param2 = TrinketSlot.field_Db[param3];
            }
          }
          if (param2 <= param1) {
            return;
          }
          if (-param1 + param2 > 32) {
            param2 = 32 + param1;
          }
          FullscreenFocusCanvas.field_g.clear(22997);
          var4_int = 0;
          if (param0 <= 120) {
            field_c = (MenuSelection) null;
          }
          var5 = 0;
          var6 = param1;
          for (var7 = param1; var7 < param2; var7++) {
            if (LineupView.field_y.get(var7, (byte) 116, param3) == null) {
              if (var5 == 0) {
                var6 = var7;
              }
              var5++;
            } else {
              if (var5 > 0) {
                var4_int++;
                FullscreenFocusCanvas.field_g.addLast(new RowRangeRequest(param3, var6, var5), 3);
              }
              var5 = 0;
            }
          }
          if (var5 > 0) {
            FullscreenFocusCanvas.field_g.addLast(new RowRangeRequest(param3, var6, var5), 3);
            var4_int++;
          }
          if (0 < var4_int) {
            FootballerAiOverlaySupport.field_d.writeIsaacByte(53, (byte) 118);
            FootballerAiOverlaySupport.field_d.writeShort(-1207444472, 2 + 5 * var4_int);
            FootballerAiOverlaySupport.field_d.writeByte(121, var4_int);
            var9 = (RowRangeRequest) (FullscreenFocusCanvas.field_g.removeFirst((byte) 126));
            while (var9 != null) {
              var9.writeToPacket(FootballerAiOverlaySupport.field_d, (byte) 95);
              var9 = (RowRangeRequest) (FullscreenFocusCanvas.field_g.removeFirst((byte) 127));
            }
            FootballerAiOverlaySupport.field_d.writeByte(105, param3);
            PlayerContextMenu.field_f = true;
            BeveledTextPainter.field_t = 500;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var4), "re.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static WorldDrawEntry a(boolean param0, int param1) {
        WorldDrawEntry var2 = new WorldDrawEntry(3);
        var2.field_n = param0 ? true : false;
        if (param1 < 33) {
          return (WorldDrawEntry) null;
        }
        return var2;
    }

    public final void drawWidget(int param0, boolean param1, int param2, UiWidget param3, int param4) {
        Checkbox var12 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        try {
          var12 = !(param3 instanceof Checkbox) ? null : (Checkbox) (param3);
          if (var12 != null) {
            param1 = param1 & var12.field_y;
          }
          var7 = 5592405;
          SoftwareRasterizer.fillRect(param4 + param3.field_t, param3.field_g + param2, param3.field_n, param3.field_i, this.field_a);
          if (param1) {
            var7 = 16777215;
          }
          var8 = param4 - (-param3.field_t - this.field_f);
          var9 = this.field_n + (param2 + param3.field_g);
          int var10 = -126 / ((59 - param0) / 53);
          SoftwareRasterizer.drawRectangleShadow(var8, var9, this.field_h, this.field_g, 5592405);
          SoftwareRasterizer.fillRect(var8, var9, this.field_h, this.field_g, var7);
          if (var12.field_A) {
            SoftwareRasterizer.drawLine(var8, var9, this.field_h + var8, this.field_g + var9, 1);
            SoftwareRasterizer.drawLine(var8 + this.field_h, var9, var8, this.field_g + var9, 1);
          }
          if (null != this.field_m) {
            var11 = this.field_h + (this.field_f + this.field_i);
            this.field_m.drawParagraph(param3.field_q, var11 + param3.field_t + param4, this.field_p + param2 + param3.field_g, -this.field_i - var11 + param3.field_n, param3.field_i - (this.field_i << 1), this.field_e, this.field_l, this.field_d, this.field_j, 0);
          }
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "re.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    CheckboxPainter(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.field_d = 1;
        this.field_j = 1;
        try {
          this.field_m = param0;
          this.field_g = param7;
          this.field_f = param5;
          this.field_i = param1;
          this.field_p = param2;
          this.field_l = param4;
          this.field_e = param3;
          this.field_a = param9;
          this.field_h = param8;
          this.field_n = param6;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "re.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        field_b = new String[]{"<img=0>Tournaments are <col=ffff00>unrated</col> only.", "<img=0>If a player has no opponent for their game, they automatically go through to the next round.", "<img=0>In the event of a draw, a random statistic is chosen to decide who wins, in the event of all stats being the the same, the winner is decided on a coin toss."};
        field_c = new MenuSelection(1);
    }
}
