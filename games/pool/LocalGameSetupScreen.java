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

    final static MeshBuilder[] a(MeshBuilder param0, int[] param1, boolean param2) {
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
          if (!param2) {
            stackIn_3_0 = (MeshBuilder[]) null;
            return stackIn_3_0;
          }
          var16 = new MeshBuilder[param1[0] * param1[1] * param1[2]];
          var3 = var16;
          var9 = 0;
          var5 = new MeshBuilder(param0, false, false, false, false);
          for (var10 = 0; var10 < param1[0]; var10++) {
            if (-1 + param1[0] <= var10) {
              var4 = var5;
            } else {
              var4 = TutorialController.b((byte) 122);
              var11_ref_eg = TutorialController.b((byte) 124);
              JaggrabDownloader.a(0, var4, param0.field_D + (1 + var10) * (param0.field_w - param0.field_D) / param1[0], false, 0, 0, 1, 0, var11_ref_eg, var5);
              var5 = var11_ref_eg;
            }
            var7 = var4;
            for (var11 = 0; param1[1] > var11; var11++) {
              if (var11 < param1[1] - 1) {
                var15 = TutorialController.b((byte) 123);
                var6 = var15;
                var12_ref_eg = TutorialController.b((byte) 125);
                JaggrabDownloader.a((1 + var11) * (-param0.field_y + param0.field_S) / param1[1] + param0.field_y, var15, 0, false, 0, 1, 0, 0, var12_ref_eg, var7);
                var7 = var12_ref_eg;
              } else {
                var6 = var7;
              }
              var8 = var6;
              for (var12 = 0; var12 < param1[2]; var12++) {
                if (var12 < (param1[2] - 1)) {
                  var3[var9] = TutorialController.b((byte) 124);
                  var13 = TutorialController.b((byte) 126);
                  stackIn_20_0 = 0;
                  stackIn_20_1 = var16[var9];
                  stackIn_20_2 = 0;
                  stackIn_21_3 = !(param2);
                  JaggrabDownloader.a(stackIn_20_0, stackIn_20_1, stackIn_20_2, stackIn_21_3, param0.field_V + (var12 + 1) * (-param0.field_V + param0.field_x) / param1[2], 0, 0, 1, var13, var8);
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
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean f(byte param0) {
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
          if (!rl.field_h.ensureGroupAvailableByName("benefits/", 0)) {
            return false;
          }
          PotEvent.field_m = lb.loadSprite(ViewportController.field_q, param0 - 29, "benefits", "members_benefits_borders");
          for (var1_int = 0; var1_int < PotEvent.field_m.field_D.length; var1_int++) {
            if (0 == (-16777216 & PotEvent.field_m.field_D[var1_int])) {
              PotEvent.field_m.field_D[var1_int] = 0;
            }
          }
          rf.field_g = WidgetStyleLayer.loadSprite("benefits", (byte) 118, "members_benefits_logo", ViewportController.field_q);
          QuickChatMenu.field_Rb = WidgetStyleLayer.loadSprite("benefits", (byte) 69, "members_benefits_price", ViewportController.field_q);
          var5 = new Sprite(rl.field_h.getFileByName(false, "members_benefits_screenshots.jpg", "benefits/"), (java.awt.Component) ((Object) TextLineLayout.a((byte) -67)));
          dn.field_o = new Sprite[3];
          for (var2 = 0; var2 < dn.field_o.length; var2++) {
            var3 = new Sprite(var5.field_w, var5.field_y / dn.field_o.length);
            var3.e();
            var5.a(0, -var2 * var5.field_y / dn.field_o.length);
            dn.field_o[var2] = var3;
          }
          if (param0 != 109) {
            return true;
          }
          OpacityWidget.field_P.bindAsRenderTarget(15100);
          ef.a(-2107, PotEvent.field_m, ReportAbuseDialog.textGameName);
          bq.a(40, QuickChatMenu.field_Rb, 80, 80, 15, -2400, 2, -1, 40);
          GameApplet.a(dn.field_o, -58);
          CheckboxPainter.a(rf.field_g, 106);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1), "cm.W(" + param0 + ')');
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
                fr.field_n < 8) {
                fr.field_n = fr.field_n + 1;
                KillerRules.c((byte) -45);
              }
            } else {
              if (27 != var4) {
                if (28 != var4) {
                  if (44 != var4) {
                    if (var4 == 45) {
                      if (this.selection.isPressActivated((byte) 71) &&
                        la.field_a < te.field_p[0] - 1) {
                        la.field_a = la.field_a + 1;
                        PlayerContextMenu.c(param0 ^ -16473);
                      }
                    } else {
                      if (var4 != 46) {
                        super.handleMenuAction(-16470, param1, param2);
                      } else {
                        if (this.selection.isPressActivated((byte) 64)) {
                          un.field_e = 1 - un.field_e;
                          ByteStorage.d(param0 ^ 16424);
                        }
                      }
                    }
                  } else {
                    if (this.selection.isPressActivated((byte) 68) &&
                      la.field_a > 0) {
                      la.field_a = la.field_a - 1;
                      PlayerContextMenu.c(13);
                    }
                  }
                } else {
                  if (this.selection.isPressActivated((byte) 115)) {
                    DialWidget.field_W = (DialWidget.field_W + 2) % 3;
                    this.g(param0 + 16474);
                  }
                }
              } else {
                if (this.selection.isPressActivated((byte) 76)) {
                  DialWidget.field_W = (DialWidget.field_W + 1) % 3;
                  this.g(4);
                }
              }
            }
          } else {
            if (this.selection.isPressActivated((byte) 59) &&
              2 < fr.field_n) {
              fr.field_n = fr.field_n - 1;
              KillerRules.c((byte) -45);
            }
          }
        } else {
          if (this.selection.isPressActivated((byte) 64) &&
            Pocket.a(0)) {
            this.c(param0 ^ -16474, param1);
          }
        }
        if (param0 != -16470) {
          field_H = (java.awt.Color) null;
        }
    }

    private final void h(int param0) {
        this.framedPanel = false;
        int var2 = 20;
        int var3 = 100;
        this.enableFramedPanel(var2, var3, -10);
        int var4 = this.headerSprite != null ? this.headerSprite.field_y : 0;
        if (param0 >= -62) {
          this.getButtonLeft(4, 111);
        }
        NineSliceFrame.field_a = new UiComponent(-1L, (UiComponent) null, var2, var3, SoftwareRasterizer.width - 2 * var2, -var3 + var4 + (SoftwareRasterizer.height - var3), (String) null);
        IterableNodeHashTable.field_e = new UiComponent(-1L, (UiComponent) null, 40, 50, 240, 200, (String) null);
        IterableNodeHashTable.field_e.horizontalAlignment = 1;
        IterableNodeHashTable.field_e.frameSprites = rm.field_g;
        IterableNodeHashTable.field_e.selectedFrameSprites = ln.field_s;
        NineSliceFrame.field_a.addChild(-114, IterableNodeHashTable.field_e);
        UiComponent dupTemp$0 = u.a((byte) 68, 10, 55, false, 28);
        TikiTableScene.field_V = dupTemp$0;
        IterableNodeHashTable.field_e.addChild(-102, dupTemp$0);
        UiComponent dupTemp$1 = u.a((byte) 120, 210, 55, true, 27);
        ArchiveLoadStep.field_f = dupTemp$1;
        IterableNodeHashTable.field_e.addChild(122, dupTemp$1);
        MultiHandleSliderWidget.a(false, IterableNodeHashTable.field_e, TikiTableScene.field_V);
        MultiHandleSliderWidget.a(false, IterableNodeHashTable.field_e, ArchiveLoadStep.field_f);
        jq.field_f = new UiComponent(-1L, (UiComponent) null, 0, 0, 160, 150, (String) null);
        jq.field_f.horizontalAlignment = 1;
        jq.field_f.verticalAlignment = 1;
        jq.field_f.frameSprites = UsernameSuggestionsPanel.field_N;
        IterableNodeHashTable.field_e.addChild(-116, jq.field_f);
        this.g(4);
        PoolGameModel.field_v = new UiComponent(-1L, (UiComponent) null, 290, IterableNodeHashTable.field_e.localY, 270, 60, (String) null);
        PoolGameModel.field_v.sprite = dq.createTextLabelSprite(4, 0, ab.muOptionsPlayers);
        PoolGameModel.field_v.sprite.field_G = 10;
        PoolGameModel.field_v.frameSprites = rm.field_g;
        dk.a(PoolGameModel.field_v, (byte) 93);
        PoolUiText.field_f = new UiComponent(-1L, (UiComponent) null, 130, 10, 100, 40, (String) null);
        PoolUiText.field_f.verticalAlignment = 1;
        PoolUiText.field_f.horizontalAlignment = 1;
        PoolUiText.field_f.frameSprites = UsernameSuggestionsPanel.field_N;
        PoolGameModel.field_v.addChild(-106, PoolUiText.field_f);
        MultiHandleSliderWidget.a(false, PoolGameModel.field_v, PoolUiText.field_f);
        UiComponent dupTemp$2 = u.a((byte) 67, 100, 10, false, 64);
        RasterSnapshot.field_w = dupTemp$2;
        PoolGameModel.field_v.addChild(114, dupTemp$2);
        UiComponent dupTemp$3 = u.a((byte) 112, 235, 10, true, 63);
        ih.field_e = dupTemp$3;
        PoolGameModel.field_v.addChild(33, dupTemp$3);
        MultiHandleSliderWidget.a(false, PoolGameModel.field_v, RasterSnapshot.field_w);
        MultiHandleSliderWidget.a(false, PoolGameModel.field_v, ih.field_e);
        KillerRules.c((byte) -45);
        NineSliceFrame.field_a.addChild(-111, PoolGameModel.field_v);
        hg.field_c = new UiComponent(0L, (UiComponent) null, PoolGameModel.field_v.localX, PoolGameModel.field_v.localY - (-PoolGameModel.field_v.height - 10), PoolGameModel.field_v.width, PoolGameModel.field_v.height, (String) null);
        hg.field_c.horizontalAlignment = 0;
        hg.field_c.frameSprites = rm.field_g;
        hg.field_c.sprite = dq.createTextLabelSprite(4, 0, CushionSegment.timer);
        hg.field_c.sprite.field_G = PoolGameModel.field_v.sprite.field_G;
        dk.a(hg.field_c, (byte) 93);
        NineSliceFrame.field_a.addChild(-99, hg.field_c);
        VerticalScrollbar.field_Nb = new UiComponent(-1L, (UiComponent) null, PoolUiText.field_f.localX, PoolUiText.field_f.localY, PoolUiText.field_f.width, PoolUiText.field_f.height, (String) null);
        VerticalScrollbar.field_Nb.horizontalAlignment = 1;
        VerticalScrollbar.field_Nb.frameSprites = UsernameSuggestionsPanel.field_N;
        VerticalScrollbar.field_Nb.verticalAlignment = 1;
        hg.field_c.addChild(49, VerticalScrollbar.field_Nb);
        UiComponent dupTemp$4 = u.a((byte) 102, RasterSnapshot.field_w.localX, RasterSnapshot.field_w.localY, false, 45);
        DualLinkNodeHashTable.field_f = dupTemp$4;
        hg.field_c.addChild(112, dupTemp$4);
        UiComponent dupTemp$5 = u.a((byte) 124, ih.field_e.localX, RasterSnapshot.field_w.localY, true, 44);
        TickClock.field_i = dupTemp$5;
        hg.field_c.addChild(84, dupTemp$5);
        MultiHandleSliderWidget.a(false, hg.field_c, DualLinkNodeHashTable.field_f);
        MultiHandleSliderWidget.a(false, hg.field_c, TickClock.field_i);
        PlayerContextMenu.c(13);
        CacheEntry.field_x = new UiComponent(46L, (UiComponent) null, PoolGameModel.field_v.localX, hg.field_c.localY + hg.field_c.height + 10, PoolGameModel.field_v.width, PoolGameModel.field_v.height, (String) null);
        CacheEntry.field_x.frameSprites = rm.field_g;
        CacheEntry.field_x.horizontalAlignment = 0;
        CacheEntry.field_x.selectedFrameSprites = ln.field_s;
        CacheEntry.field_x.sprite = dq.createTextLabelSprite(4, 0, s.gameoptlabels[3]);
        CacheEntry.field_x.selectedSprite = dq.createTextLabelSprite(3, 0, s.gameoptlabels[3]);
        CacheEntry.field_x.sprite.field_G = PoolGameModel.field_v.sprite.field_G;
        CacheEntry.field_x.selectedSprite.field_G = PoolGameModel.field_v.sprite.field_G;
        dk.a(CacheEntry.field_x, (byte) 93);
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
        return Pocket.a(0);
    }

    private final void g(int param0) {
        IterableNodeHashTable.field_e.sprite = dq.createTextLabelSprite(param0, 0, LobbyPlayer.rulesetNames[DialWidget.field_W]);
        jq.field_f.sprite = sb.field_c[DialWidget.field_W];
        TextureCache.a(IterableNodeHashTable.field_e, jq.field_f, -89);
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
        ek.a(NineSliceFrame.field_a, (byte) -111, var2);
    }

    LocalGameSetupScreen(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(VerticalScrollbar.field_Wb, param0, param1, param2, param3, param4, param5);
        try {
          this.h(-108);
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

    final static byte[] a(String param0, byte param1) {
        RuntimeException var2 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= 16) {
            stackIn_4_0 = MidiNoteMixer.field_u.getFileByName(false, param0, "");
            return stackIn_4_0;
          }
          stackIn_2_0 = (byte[]) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("cm.P(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final void onEnter(int param0, int param1, boolean param2) {
        super.onEnter(param0, param1, param2);
        ByteStorage.d(param0 ^ -107);
        KillerRules.c((byte) -45);
        this.g(4);
        PlayerContextMenu.c(13);
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

    final static void f(int param0) {
        bj var1 = (bj) (BallSkin.field_i.last((byte) -105));
        int var2 = -46 / ((-18 - param0) / 38);
        if (var1 == null) {
          dn.c(-127);
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
