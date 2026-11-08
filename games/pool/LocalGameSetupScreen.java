/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LocalGameSetupScreen extends MenuScreen {
    static String field_J;
    static java.awt.Color field_H;
    static String field_K;
    static String errorJs5io;
    static String[] field_L;

    final int getButtonTop(byte param0, int param1) {
        UiComponent var3 = NineSliceFrame.field_a.findById((long)this.itemIds[param1], (byte) 31);
        if (param0 != 6) {
          field_L = (String[]) null;
        }
        if (var3 != null) {
          return var3.screenY;
        }
        return this.buttonTop;
    }

    final static MeshBuilder[] splitMeshIntoGrid(MeshBuilder mesh, int[] divisions, boolean obfuscationGuard) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        MeshBuilder[] stackIn_3_0 = null;
        int stackIn_20_0 = 0;
        MeshBuilder stackIn_20_1 = null;
        int stackIn_20_2 = 0;
        boolean stackIn_21_3;
        MeshBuilder[] stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        MeshBuilder[] var3 = null;
        RuntimeException var3_ref = null;
        MeshBuilder var4 = null;
        MeshBuilder var5 = null;
        MeshBuilder var6 = null;
        MeshBuilder var7 = null;
        MeshBuilder var8 = null;
        int var9 = 0;
        MeshBuilder var11_ref_eg = null;
        MeshBuilder var12_ref_eg = null;
        MeshBuilder var13 = null;
        int var14 = 0;
        MeshBuilder var15 = null;
        MeshBuilder[] var16 = null;
        var14 = Pool.field_O;
        try {
          if (!obfuscationGuard) {
            stackIn_3_0 = (MeshBuilder[]) null;
            return stackIn_3_0;
          }
          var16 = new MeshBuilder[divisions[0] * divisions[1] * divisions[2]];
          var3 = var16;
          var9 = 0;
          var5 = new MeshBuilder(mesh, false, false, false, false);
          for (var10 = 0; var10 < divisions[0]; var10++) {
            if (-1 + divisions[0] <= var10) {
              var4 = var5;
            } else {
              var4 = TutorialController.b((byte) 122);
              var11_ref_eg = TutorialController.b((byte) 124);
              JaggrabDownloader.a(0, var4, mesh.field_D + (1 + var10) * (mesh.field_w - mesh.field_D) / divisions[0], false, 0, 0, 1, 0, var11_ref_eg, var5);
              var5 = var11_ref_eg;
            }
            var7 = var4;
            for (var11 = 0; divisions[1] > var11; var11++) {
              if (var11 < divisions[1] - 1) {
                var15 = TutorialController.b((byte) 123);
                var6 = var15;
                var12_ref_eg = TutorialController.b((byte) 125);
                JaggrabDownloader.a((1 + var11) * (-mesh.field_y + mesh.field_S) / divisions[1] + mesh.field_y, var15, 0, false, 0, 1, 0, 0, var12_ref_eg, var7);
                var7 = var12_ref_eg;
              } else {
                var6 = var7;
              }
              var8 = var6;
              for (var12 = 0; var12 < divisions[2]; var12++) {
                if (var12 < (divisions[2] - 1)) {
                  var3[var9] = TutorialController.b((byte) 124);
                  var13 = TutorialController.b((byte) 126);
                  stackIn_20_0 = 0;
                  stackIn_20_1 = var16[var9];
                  stackIn_20_2 = 0;
                  stackIn_21_3 = !(obfuscationGuard);
                  JaggrabDownloader.a(stackIn_20_0, stackIn_20_1, stackIn_20_2, stackIn_21_3, mesh.field_V + (var12 + 1) * (-mesh.field_V + mesh.field_x) / divisions[2], 0, 0, 1, var13, var8);
                  var8 = var13;
                } else {
                  var3[var9] = var8;
                }
                var9++;
              }
            }
          }
          stackIn_26_0 = var3;
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_29_0 = var3_ref;
          stackIn_29_1 = new StringBuilder().append("cm.S(");
          if (mesh == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (divisions == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static boolean loadMembershipBenefitsAssets(byte obfuscationGuard) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        Sprite var3 = null;
        int var4 = 0;
        Sprite var5 = null;
        var4 = Pool.field_O;
        try {
          if (PotEvent.field_m != null) {
            return true;
          }
          if (!ViewportController.field_q.ensureGroupAvailableByName("benefits", 0)) {
            return false;
          }
          if (!MonotonicClock.field_h.ensureGroupAvailableByName("benefits/", 0)) {
            return false;
          }
          PotEvent.field_m = DimmedPauseMenu.loadSprite(ViewportController.field_q, obfuscationGuard - 29, "benefits", "members_benefits_borders");
          for (var1_int = 0; var1_int < PotEvent.field_m.field_D.length; var1_int++) {
            if (0 == (-16777216 & PotEvent.field_m.field_D[var1_int])) {
              PotEvent.field_m.field_D[var1_int] = 0;
            }
          }
          AccountDisplayNameSupport.field_g = WidgetStyleLayer.loadSprite("benefits", (byte) 118, "members_benefits_logo", ViewportController.field_q);
          QuickChatMenu.field_Rb = WidgetStyleLayer.loadSprite("benefits", (byte) 69, "members_benefits_price", ViewportController.field_q);
          var5 = new Sprite(MonotonicClock.field_h.getFileByName(false, "members_benefits_screenshots.jpg", "benefits/"), (java.awt.Component) ((Object) TextLineLayout.a((byte) -67)));
          ShotEvent.field_o = new Sprite[3];
          for (var2 = 0; var2 < ShotEvent.field_o.length; var2++) {
            var3 = new Sprite(var5.field_w, var5.field_y / ShotEvent.field_o.length);
            var3.bindAsRenderTarget();
            var5.a(0, -var2 * var5.field_y / ShotEvent.field_o.length);
            ShotEvent.field_o[var2] = var3;
          }
          if (obfuscationGuard != 109) {
            return true;
          }
          OpacityWidget.field_P.bindAsRenderTarget(15100);
          FaceNormal.configureMembershipBenefitsBackground(-2107, PotEvent.field_m, ReportAbuseDialog.textGameName);
          AchievementNotice.configureMembershipBenefitsHeader(40, QuickChatMenu.field_Rb, 80, 80, 15, -2400, 2, -1, 40);
          GameApplet.a(ShotEvent.field_o, -58);
          CheckboxPainter.a(AccountDisplayNameSupport.field_g, 106);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1), "cm.W(" + obfuscationGuard + ')');
        }
    }

    final int getButtonHeight(byte param0, int param1) {
        UiComponent var3 = NineSliceFrame.field_a.findById((long)this.itemIds[param1], (byte) 31);
        if (param0 != 69) {
          errorJs5io = (String) null;
        }
        if (var3 == null) {
          return 36;
        }
        return var3.height;
    }

    final void handleMenuAction(int param0, boolean param1, int param2) {
        int var4;
        int var5;
        var5 = Pool.field_O;
        var4 = this.itemIds[param2];
        if (var4 != 65) {
          if (var4 != 64) {
            if (var4 == 63) {
              if (this.selection.isPressActivated((byte) 89) &&
                DelayedServerPacket.field_n < 8) {
                DelayedServerPacket.field_n = DelayedServerPacket.field_n + 1;
                KillerRules.updateKillerPlayerCountControls((byte) -45);
              }
            } else {
              if (27 != var4) {
                if (28 != var4) {
                  if (44 != var4) {
                    if (var4 == 45) {
                      if (this.selection.isPressActivated((byte) 71) &&
                        ChatPanelSupport.field_a < ByteArrayNode.field_p[0] - 1) {
                        ChatPanelSupport.field_a = ChatPanelSupport.field_a + 1;
                        PlayerContextMenu.updatePageControls(param0 ^ -16473);
                      }
                    } else {
                      if (var4 != 46) {
                        super.handleMenuAction(-16470, param1, param2);
                      } else {
                        if (this.selection.isPressActivated((byte) 64)) {
                          LookupProtocolSupport.field_e = 1 - LookupProtocolSupport.field_e;
                          ByteStorage.d(param0 ^ 16424);
                        }
                      }
                    }
                  } else {
                    if (this.selection.isPressActivated((byte) 68) &&
                      ChatPanelSupport.field_a > 0) {
                      ChatPanelSupport.field_a = ChatPanelSupport.field_a - 1;
                      PlayerContextMenu.updatePageControls(13);
                    }
                  }
                } else {
                  if (this.selection.isPressActivated((byte) 115)) {
                    DialWidget.field_W = (DialWidget.field_W + 2) % 3;
                    this.updateRulesetSelection(param0 + 16474);
                  }
                }
              } else {
                if (this.selection.isPressActivated((byte) 76)) {
                  DialWidget.field_W = (DialWidget.field_W + 1) % 3;
                  this.updateRulesetSelection(4);
                }
              }
            }
          } else {
            if (this.selection.isPressActivated((byte) 59) &&
              2 < DelayedServerPacket.field_n) {
              DelayedServerPacket.field_n = DelayedServerPacket.field_n - 1;
              KillerRules.updateKillerPlayerCountControls((byte) -45);
            }
          }
        } else {
          if (this.selection.isPressActivated((byte) 64) &&
            Pocket.areSelectedSettingsAllowed(0)) {
            this.c(param0 ^ -16474, param1);
          }
        }
        if (param0 != -16470) {
          field_H = (java.awt.Color) null;
        }
    }

    private final void initializeSetupWidgets(int obfuscationGuard) {
        this.framedPanel = false;
        int var2 = 20;
        int var3 = 100;
        this.enableFramedPanel(var2, var3, -10);
        int var4 = this.headerSprite != null ? this.headerSprite.field_y : 0;
        if (obfuscationGuard >= -62) {
          this.getButtonLeft(4, 111);
        }
        NineSliceFrame.field_a = new UiComponent(-1L, (UiComponent) null, var2, var3, SoftwareRasterizer.width - 2 * var2, -var3 + var4 + (SoftwareRasterizer.height - var3), (String) null);
        IterableNodeHashTable.field_e = new UiComponent(-1L, (UiComponent) null, 40, 50, 240, 200, (String) null);
        IterableNodeHashTable.field_e.horizontalAlignment = 1;
        IterableNodeHashTable.field_e.frameSprites = MeshSymmetrySupport.field_g;
        IterableNodeHashTable.field_e.selectedFrameSprites = ModelOriginSupport.field_s;
        NineSliceFrame.field_a.addChild(-114, IterableNodeHashTable.field_e);
        UiComponent dupTemp$0 = MeshRenderSupport.a((byte) 68, 10, 55, false, 28);
        TikiTableScene.field_V = dupTemp$0;
        IterableNodeHashTable.field_e.addChild(-102, dupTemp$0);
        UiComponent dupTemp$1 = MeshRenderSupport.a((byte) 120, 210, 55, true, 27);
        ArchiveLoadStep.field_f = dupTemp$1;
        IterableNodeHashTable.field_e.addChild(122, dupTemp$1);
        MultiHandleSliderWidget.a(false, IterableNodeHashTable.field_e, TikiTableScene.field_V);
        MultiHandleSliderWidget.a(false, IterableNodeHashTable.field_e, ArchiveLoadStep.field_f);
        QuickChatNavigationSupport.field_f = new UiComponent(-1L, (UiComponent) null, 0, 0, 160, 150, (String) null);
        QuickChatNavigationSupport.field_f.horizontalAlignment = 1;
        QuickChatNavigationSupport.field_f.verticalAlignment = 1;
        QuickChatNavigationSupport.field_f.frameSprites = UsernameSuggestionsPanel.field_N;
        IterableNodeHashTable.field_e.addChild(-116, QuickChatNavigationSupport.field_f);
        this.updateRulesetSelection(4);
        PoolGameModel.field_v = new UiComponent(-1L, (UiComponent) null, 290, IterableNodeHashTable.field_e.localY, 270, 60, (String) null);
        PoolGameModel.field_v.sprite = TransformRotationSupport.createTextLabelSprite(4, 0, ArchiveAvailabilitySupport.muOptionsPlayers);
        PoolGameModel.field_v.sprite.field_G = 10;
        PoolGameModel.field_v.frameSprites = MeshSymmetrySupport.field_g;
        GlowParticle.centerWidgetSpritesVertically(PoolGameModel.field_v, (byte) 93);
        PoolUiText.field_f = new UiComponent(-1L, (UiComponent) null, 130, 10, 100, 40, (String) null);
        PoolUiText.field_f.verticalAlignment = 1;
        PoolUiText.field_f.horizontalAlignment = 1;
        PoolUiText.field_f.frameSprites = UsernameSuggestionsPanel.field_N;
        PoolGameModel.field_v.addChild(-106, PoolUiText.field_f);
        MultiHandleSliderWidget.a(false, PoolGameModel.field_v, PoolUiText.field_f);
        UiComponent dupTemp$2 = MeshRenderSupport.a((byte) 67, 100, 10, false, 64);
        RasterSnapshot.field_w = dupTemp$2;
        PoolGameModel.field_v.addChild(114, dupTemp$2);
        UiComponent dupTemp$3 = MeshRenderSupport.a((byte) 112, 235, 10, true, 63);
        LoginRequestSupport.field_e = dupTemp$3;
        PoolGameModel.field_v.addChild(33, dupTemp$3);
        MultiHandleSliderWidget.a(false, PoolGameModel.field_v, RasterSnapshot.field_w);
        MultiHandleSliderWidget.a(false, PoolGameModel.field_v, LoginRequestSupport.field_e);
        KillerRules.updateKillerPlayerCountControls((byte) -45);
        NineSliceFrame.field_a.addChild(-111, PoolGameModel.field_v);
        AppletContainerSupport.field_c = new UiComponent(0L, (UiComponent) null, PoolGameModel.field_v.localX, PoolGameModel.field_v.localY - (-PoolGameModel.field_v.height - 10), PoolGameModel.field_v.width, PoolGameModel.field_v.height, (String) null);
        AppletContainerSupport.field_c.horizontalAlignment = 0;
        AppletContainerSupport.field_c.frameSprites = MeshSymmetrySupport.field_g;
        AppletContainerSupport.field_c.sprite = TransformRotationSupport.createTextLabelSprite(4, 0, CushionSegment.timer);
        AppletContainerSupport.field_c.sprite.field_G = PoolGameModel.field_v.sprite.field_G;
        GlowParticle.centerWidgetSpritesVertically(AppletContainerSupport.field_c, (byte) 93);
        NineSliceFrame.field_a.addChild(-99, AppletContainerSupport.field_c);
        VerticalScrollbar.field_Nb = new UiComponent(-1L, (UiComponent) null, PoolUiText.field_f.localX, PoolUiText.field_f.localY, PoolUiText.field_f.width, PoolUiText.field_f.height, (String) null);
        VerticalScrollbar.field_Nb.horizontalAlignment = 1;
        VerticalScrollbar.field_Nb.frameSprites = UsernameSuggestionsPanel.field_N;
        VerticalScrollbar.field_Nb.verticalAlignment = 1;
        AppletContainerSupport.field_c.addChild(49, VerticalScrollbar.field_Nb);
        UiComponent dupTemp$4 = MeshRenderSupport.a((byte) 102, RasterSnapshot.field_w.localX, RasterSnapshot.field_w.localY, false, 45);
        DualLinkNodeHashTable.field_f = dupTemp$4;
        AppletContainerSupport.field_c.addChild(112, dupTemp$4);
        UiComponent dupTemp$5 = MeshRenderSupport.a((byte) 124, LoginRequestSupport.field_e.localX, RasterSnapshot.field_w.localY, true, 44);
        TickClock.field_i = dupTemp$5;
        AppletContainerSupport.field_c.addChild(84, dupTemp$5);
        MultiHandleSliderWidget.a(false, AppletContainerSupport.field_c, DualLinkNodeHashTable.field_f);
        MultiHandleSliderWidget.a(false, AppletContainerSupport.field_c, TickClock.field_i);
        PlayerContextMenu.updatePageControls(13);
        CacheEntry.field_x = new UiComponent(46L, (UiComponent) null, PoolGameModel.field_v.localX, AppletContainerSupport.field_c.localY + AppletContainerSupport.field_c.height + 10, PoolGameModel.field_v.width, PoolGameModel.field_v.height, (String) null);
        CacheEntry.field_x.frameSprites = MeshSymmetrySupport.field_g;
        CacheEntry.field_x.horizontalAlignment = 0;
        CacheEntry.field_x.selectedFrameSprites = ModelOriginSupport.field_s;
        CacheEntry.field_x.sprite = TransformRotationSupport.createTextLabelSprite(4, 0, DisplayModeSupport.gameoptlabels[3]);
        CacheEntry.field_x.selectedSprite = TransformRotationSupport.createTextLabelSprite(3, 0, DisplayModeSupport.gameoptlabels[3]);
        CacheEntry.field_x.sprite.field_G = PoolGameModel.field_v.sprite.field_G;
        CacheEntry.field_x.selectedSprite.field_G = PoolGameModel.field_v.sprite.field_G;
        GlowParticle.centerWidgetSpritesVertically(CacheEntry.field_x, (byte) 93);
        TextureCache.field_c = new UiComponent(-1L, (UiComponent) null, PoolUiText.field_f.localX, PoolUiText.field_f.localY, PoolUiText.field_f.width, PoolUiText.field_f.height, (String) null);
        TextureCache.field_c.horizontalAlignment = 1;
        TextureCache.field_c.frameSprites = UsernameSuggestionsPanel.field_N;
        TextureCache.field_c.verticalAlignment = 1;
        ByteStorage.d(-113);
        CacheEntry.field_x.addChild(14, TextureCache.field_c);
        NineSliceFrame.field_a.addChild(-118, CacheEntry.field_x);
    }

    final boolean isButtonEnabled(int param0, boolean param1) {
        if (!param1) {
          return false;
        }
        UiComponent var3 = NineSliceFrame.field_a.findById((long)this.itemIds[param0], (byte) 31);
        if (var3 != null) {
          return var3.enabled;
        }
        if (65 != this.itemIds[param0]) {
          return true;
        }
        return Pocket.areSelectedSettingsAllowed(0);
    }

    private final void updateRulesetSelection(int obfuscationGuard) {
        IterableNodeHashTable.field_e.sprite = TransformRotationSupport.createTextLabelSprite(obfuscationGuard, 0, LobbyPlayer.rulesetNames[DialWidget.field_W]);
        QuickChatNavigationSupport.field_f.sprite = SpriteResourceSupport.field_c[DialWidget.field_W];
        TextureCache.placeWidgetAtBottomCenter(IterableNodeHashTable.field_e, QuickChatNavigationSupport.field_f, -89);
    }

    final void drawScreen(int param0) {
        int var2 = 0;
        int var3;
        var3 = Pool.field_O;
        this.drawBackground(false);
        NineSliceFrame.field_a.drawRoot((byte) -79, false);
        if (param0 < 36) {
          return;
        }
        for (var2 = this.selection.itemCount - 2; this.selection.itemCount > var2; var2++) {
          if (this.isButtonVisible(var2, 48)) {
            this.drawButton(true, var2);
          }
        }
    }

    public static void releaseStatics(byte param0) {
        field_K = null;
        field_H = null;
        errorJs5io = null;
        field_J = null;
        if (param0 != 74) {
          field_J = (String) null;
        }
        field_L = null;
    }

    final void advanceScreen(int param0) {
        NineSliceFrame.field_a.updateRoot(true, false);
        super.advanceScreen(-1);
        int var2 = ~this.selection.selectedIndex <= param0 ? this.itemIds[this.selection.selectedIndex] : -1;
        MenuSelectionSupport.selectComponentTreeByKey(NineSliceFrame.field_a, (byte) -111, var2);
    }

    LocalGameSetupScreen(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(VerticalScrollbar.field_Wb, param0, param1, param2, param3, param4, param5);
        try {
          this.initializeSetupWidgets(-108);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "cm.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final int getButtonLeft(int param0, int param1) {
        if (param0 != 0) {
          this.getButtonHeight((byte) -23, 61);
        }
        UiComponent var3 = NineSliceFrame.field_a.findById((long)this.itemIds[param1], (byte) 31);
        if (var3 != null) {
          return var3.screenX;
        }
        return this.buttonLeft + (-7 + param1) * 250;
    }

    final static byte[] loadMenuResource(String name, byte obfuscationGuard) {
        RuntimeException var2 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= 16) {
            stackIn_4_0 = MidiNoteMixer.field_u.getFileByName(false, name, "");
            return stackIn_4_0;
          }
          stackIn_2_0 = (byte[]) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("cm.P(");
          if (name == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void onEnter(int param0, int param1, boolean param2) {
        super.onEnter(param0, param1, param2);
        ByteStorage.d(param0 ^ -107);
        KillerRules.updateKillerPlayerCountControls((byte) -45);
        this.updateRulesetSelection(4);
        PlayerContextMenu.updatePageControls(13);
    }

    final int getButtonRight(boolean param0, int param1) {
        UiComponent var3 = NineSliceFrame.field_a.findById((long)this.itemIds[param1], (byte) 31);
        if (param0) {
          this.onEnter(16, -44, false);
        }
        if (var3 != null) {
          return var3.screenX + var3.width;
        }
        return this.buttonRight + (param1 - 7) * 280;
    }

    final static void readLookupAcknowledgement(int obfuscationGuard) {
        LookupQuery var1 = (LookupQuery) (BallSkin.field_i.last((byte) -105));
        int var2 = -46 / ((-18 - obfuscationGuard) / 38);
        if (var1 == null) {
          ShotEvent.closeClientSocket(-127);
          return;
        }
        CipherPacketBuffer var3 = PlayerContextMenu.field_e;
        var3.readInt(true);
        var3.readInt(true);
        var3.readInt(true);
        var3.readInt(true);
        var1.unlink((byte) -117);
    }

    final boolean isButtonVisible(int param0, int param1) {
        UiComponent var3 = NineSliceFrame.field_a.findById((long)this.itemIds[param0], (byte) 31);
        int var4 = 124 % ((param1 + 42) / 49);
        if (var3 != null) {
          return var3.enabled;
        }
        return true;
    }

    static {
        errorJs5io = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_K = null;
        field_H = new java.awt.Color(10040319);
    }
}
