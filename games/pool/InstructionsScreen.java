/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class InstructionsScreen extends MenuScreen {
    static String field_J;
    static boolean field_K;
    private int pageIndex;
    static UiComponent field_H;

    final void drawScreen(int param0) {
        String dupTemp$2 = null;
        String dupTemp$3 = null;
        int var2;
        int var3;
        int var4;
        int var3Lifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        super.drawScreen(127);
        var2 = 480;
        if (param0 >= 36) {
          var3 = KillerRules.field_h;
          if (DiskCacheWorker.instructionsTitles[this.pageIndex] == pl.field_f) {
            pl.field_a.draw(SoftwareRasterizer.width - pl.field_a.field_z >> 1, -FreePlayRules.field_e.maxAscent + var3);
            var3 += 5;
            if (AchievementNotice.field_p != this.pageIndex ||
              null == LocalGameSetupScreen.field_K) {
              ScrollPaneWithFooter.field_Lb = SocketArchiveNetworkClient.a(NameEntryPopup.field_Ob[ProgressBarWidget.field_S][this.pageIndex], var2, ArchiveLoadSequence.instructionsPages[this.pageIndex], var3 + 10, sa.field_h, true, SoftwareRasterizer.width - var2 >> 1);
              LocalGameSetupScreen.field_K = FaceNormal.a("</col>", ArchiveLoadSequence.instructionsPages[this.pageIndex], (byte) 4, "<col=aaaaff>");
              AchievementNotice.field_p = this.pageIndex;
            }
          } else {
            dupTemp$2 = DiskCacheWorker.instructionsTitles[this.pageIndex];
            pl.field_f = dupTemp$2;
            pl.field_a = dq.createTextLabelSprite(4, 0, dupTemp$2);
            pl.field_a.draw(SoftwareRasterizer.width - pl.field_a.field_z >> 1, -FreePlayRules.field_e.maxAscent + var3);
            var3 += 5;
            if (AchievementNotice.field_p != this.pageIndex ||
              null == LocalGameSetupScreen.field_K) {
              ScrollPaneWithFooter.field_Lb = SocketArchiveNetworkClient.a(NameEntryPopup.field_Ob[ProgressBarWidget.field_S][this.pageIndex], var2, ArchiveLoadSequence.instructionsPages[this.pageIndex], var3 + 10, sa.field_h, true, SoftwareRasterizer.width - var2 >> 1);
              LocalGameSetupScreen.field_K = FaceNormal.a("</col>", ArchiveLoadSequence.instructionsPages[this.pageIndex], (byte) 4, "<col=aaaaff>");
              AchievementNotice.field_p = this.pageIndex;
            }
          }
          sa.field_h.setInlineSprites(AccountCreationForm.field_Z, LoginPayloadFactory.field_d);
          this.renderParagraphSprite(sa.field_h, NameEntryPopup.field_Ob[ProgressBarWidget.field_S][this.pageIndex], 10 + var3, -16097, LocalGameSetupScreen.field_K, var2, 13421772);
          nj.drawNineSlice(MidiPcmStream.field_y, (byte) 21, 20 + var2, -10 + (SoftwareRasterizer.width - var2 >> 1), var3, 190);
          this.drawParagraphSprite(10 + var3, false);
          if (this.pageIndex != Js5ArchiveManager.field_k) {
            Js5ArchiveManager.field_k = this.pageIndex;
            GameApplet.field_h = dq.createTextLabelSprite(2, 0, DebugOverlayLayoutSupport.formatPageIndicator(this.pageIndex, 121));
          }
          GameApplet.field_h.draw(620 - GameApplet.field_h.field_z, -FreePlayRules.field_e.maxAscent + 60);
          var4 = TextureCache.a(104);
          if (var4 == -1) {
            return;
          }
          qa.a((byte) 71, SoftwareRasterizer.width >> 1, sa.field_h, LoginPayload.field_e[var4], 15658734, 4144959);
          if (null == this.field_G) {
            return;
          }
          this.field_G.drawOutline(15658734, 0, 128, -1, true, 0);
          return;
        }
        this.getButtonTop((byte) -57, -26);
        var3Lifetime1 = KillerRules.field_h;
        if (DiskCacheWorker.instructionsTitles[this.pageIndex] == pl.field_f) {
          pl.field_a.draw(SoftwareRasterizer.width - pl.field_a.field_z >> 1, -FreePlayRules.field_e.maxAscent + var3Lifetime1);
          var3Lifetime1 += 5;
          if (AchievementNotice.field_p != this.pageIndex ||
            null == LocalGameSetupScreen.field_K) {
            ScrollPaneWithFooter.field_Lb = SocketArchiveNetworkClient.a(NameEntryPopup.field_Ob[ProgressBarWidget.field_S][this.pageIndex], var2, ArchiveLoadSequence.instructionsPages[this.pageIndex], var3Lifetime1 + 10, sa.field_h, true, SoftwareRasterizer.width - var2 >> 1);
            LocalGameSetupScreen.field_K = FaceNormal.a("</col>", ArchiveLoadSequence.instructionsPages[this.pageIndex], (byte) 4, "<col=aaaaff>");
            AchievementNotice.field_p = this.pageIndex;
          }
          sa.field_h.setInlineSprites(AccountCreationForm.field_Z, LoginPayloadFactory.field_d);
          this.renderParagraphSprite(sa.field_h, NameEntryPopup.field_Ob[ProgressBarWidget.field_S][this.pageIndex], 10 + var3Lifetime1, -16097, LocalGameSetupScreen.field_K, var2, 13421772);
          nj.drawNineSlice(MidiPcmStream.field_y, (byte) 21, 20 + var2, -10 + (SoftwareRasterizer.width - var2 >> 1), var3Lifetime1, 190);
          this.drawParagraphSprite(10 + var3Lifetime1, false);
          if (this.pageIndex != Js5ArchiveManager.field_k) {
            Js5ArchiveManager.field_k = this.pageIndex;
            GameApplet.field_h = dq.createTextLabelSprite(2, 0, DebugOverlayLayoutSupport.formatPageIndicator(this.pageIndex, 121));
          }
          GameApplet.field_h.draw(620 - GameApplet.field_h.field_z, -FreePlayRules.field_e.maxAscent + 60);
          var4Lifetime1 = TextureCache.a(104);
          if (var4Lifetime1 != -1) {
            qa.a((byte) 71, SoftwareRasterizer.width >> 1, sa.field_h, LoginPayload.field_e[var4Lifetime1], 15658734, 4144959);
            if (null != this.field_G) {
              this.field_G.drawOutline(15658734, 0, 128, -1, true, 0);
            }
          }
          return;
        }
        dupTemp$3 = DiskCacheWorker.instructionsTitles[this.pageIndex];
        pl.field_f = dupTemp$3;
        pl.field_a = dq.createTextLabelSprite(4, 0, dupTemp$3);
        pl.field_a.draw(SoftwareRasterizer.width - pl.field_a.field_z >> 1, -FreePlayRules.field_e.maxAscent + var3Lifetime1);
        var3Lifetime1 += 5;
        if (AchievementNotice.field_p != this.pageIndex) {
          ScrollPaneWithFooter.field_Lb = SocketArchiveNetworkClient.a(NameEntryPopup.field_Ob[ProgressBarWidget.field_S][this.pageIndex], var2, ArchiveLoadSequence.instructionsPages[this.pageIndex], var3Lifetime1 + 10, sa.field_h, true, SoftwareRasterizer.width - var2 >> 1);
          LocalGameSetupScreen.field_K = FaceNormal.a("</col>", ArchiveLoadSequence.instructionsPages[this.pageIndex], (byte) 4, "<col=aaaaff>");
          AchievementNotice.field_p = this.pageIndex;
          sa.field_h.setInlineSprites(AccountCreationForm.field_Z, LoginPayloadFactory.field_d);
          this.renderParagraphSprite(sa.field_h, NameEntryPopup.field_Ob[ProgressBarWidget.field_S][this.pageIndex], 10 + var3Lifetime1, -16097, LocalGameSetupScreen.field_K, var2, 13421772);
          nj.drawNineSlice(MidiPcmStream.field_y, (byte) 21, 20 + var2, -10 + (SoftwareRasterizer.width - var2 >> 1), var3Lifetime1, 190);
          this.drawParagraphSprite(10 + var3Lifetime1, false);
          if (this.pageIndex != Js5ArchiveManager.field_k) {
            Js5ArchiveManager.field_k = this.pageIndex;
            GameApplet.field_h = dq.createTextLabelSprite(2, 0, DebugOverlayLayoutSupport.formatPageIndicator(this.pageIndex, 121));
          }
          GameApplet.field_h.draw(620 - GameApplet.field_h.field_z, -FreePlayRules.field_e.maxAscent + 60);
          var4Lifetime2 = TextureCache.a(104);
          if (var4Lifetime2 != -1) {
            qa.a((byte) 71, SoftwareRasterizer.width >> 1, sa.field_h, LoginPayload.field_e[var4Lifetime2], 15658734, 4144959);
            if (null != this.field_G) {
              this.field_G.drawOutline(15658734, 0, 128, -1, true, 0);
            }
          }
          return;
        }
        if (null == LocalGameSetupScreen.field_K) {
          ScrollPaneWithFooter.field_Lb = SocketArchiveNetworkClient.a(NameEntryPopup.field_Ob[ProgressBarWidget.field_S][this.pageIndex], var2, ArchiveLoadSequence.instructionsPages[this.pageIndex], var3Lifetime1 + 10, sa.field_h, true, SoftwareRasterizer.width - var2 >> 1);
          LocalGameSetupScreen.field_K = FaceNormal.a("</col>", ArchiveLoadSequence.instructionsPages[this.pageIndex], (byte) 4, "<col=aaaaff>");
          AchievementNotice.field_p = this.pageIndex;
        }
        sa.field_h.setInlineSprites(AccountCreationForm.field_Z, LoginPayloadFactory.field_d);
        this.renderParagraphSprite(sa.field_h, NameEntryPopup.field_Ob[ProgressBarWidget.field_S][this.pageIndex], 10 + var3Lifetime1, -16097, LocalGameSetupScreen.field_K, var2, 13421772);
        nj.drawNineSlice(MidiPcmStream.field_y, (byte) 21, 20 + var2, -10 + (SoftwareRasterizer.width - var2 >> 1), var3Lifetime1, 190);
        this.drawParagraphSprite(10 + var3Lifetime1, false);
        if (this.pageIndex != Js5ArchiveManager.field_k) {
          Js5ArchiveManager.field_k = this.pageIndex;
          GameApplet.field_h = dq.createTextLabelSprite(2, 0, DebugOverlayLayoutSupport.formatPageIndicator(this.pageIndex, 121));
        }
        GameApplet.field_h.draw(620 - GameApplet.field_h.field_z, -FreePlayRules.field_e.maxAscent + 60);
        var4Lifetime3 = TextureCache.a(104);
        if (var4Lifetime3 == -1) {
          return;
        }
        qa.a((byte) 71, SoftwareRasterizer.width >> 1, sa.field_h, LoginPayload.field_e[var4Lifetime3], 15658734, 4144959);
        if (null == this.field_G) {
          return;
        }
        this.field_G.drawOutline(15658734, 0, 128, -1, true, 0);
        return;
    }

    final void handleNavigationKey(int param0) {
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_48_0 = 0;
        int var2;
        int var3;
        int var4;
        int var3Lifetime1;
        var4 = Pool.field_O;
        stackIn_3_0 = (this.isButtonVisible(0, -120)) ? 0 : 1;
        var2 = stackIn_3_0;
        if (param0 == -34) {
          stackIn_7_0 = (this.isButtonVisible(2, 102)) ? 2 : 1;
          var3 = stackIn_7_0;
          if (!this.selection.isPointerHeld((byte) 102)) {
            if (IterableDualLinkDeque.field_a == 96) {
              if (this.selection.selectedIndex <= var2) {
                this.selection.a(var3, (byte) 1);
              } else {
                this.selection.a(-1 + this.selection.selectedIndex, (byte) 1);
              }
            }
            if (IterableDualLinkDeque.field_a == 97) {
              if (0 > this.selection.selectedIndex) {
                this.selection.a(var2, (byte) 1);
              } else {
                if (var3 <= this.selection.selectedIndex) {
                  this.selection.a(var2, (byte) 1);
                } else {
                  this.selection.a(this.selection.selectedIndex + 1, (byte) 1);
                }
              }
            }
          }
          this.selection.a(false);
          return;
        }
        this.getButtonRight(false, 51);
        stackIn_48_0 = (this.isButtonVisible(2, 102)) ? 2 : 1;
        var3Lifetime1 = stackIn_48_0;
        if (!this.selection.isPointerHeld((byte) 102)) {
          if (IterableDualLinkDeque.field_a == 96) {
            if (this.selection.selectedIndex <= var2) {
              this.selection.a(var3Lifetime1, (byte) 1);
            } else {
              this.selection.a(-1 + this.selection.selectedIndex, (byte) 1);
            }
          }
          if (IterableDualLinkDeque.field_a == 97) {
            if (0 > this.selection.selectedIndex) {
              this.selection.a(var2, (byte) 1);
            } else {
              if (var3Lifetime1 <= this.selection.selectedIndex) {
                this.selection.a(var2, (byte) 1);
              } else {
                this.selection.a(this.selection.selectedIndex + 1, (byte) 1);
              }
            }
          }
        }
        this.selection.a(false);
        return;
    }

    final void handleMenuAction(int param0, boolean param1, int param2) {
        int var4;
        int var5;
        var5 = Pool.field_O;
        var4 = this.itemIds[param2];
        if (var4 == 25) {
          if (!this.selection.isPressActivated((byte) 66)) {
            return;
          }
          if (!this.isButtonVisible(param2, -92)) {
            return;
          }
          this.pageIndex = this.pageIndex - 1;
          if (this.isButtonVisible(param2, -91)) {
            return;
          }
        } else {
          if (var4 != 26) {
            super.handleMenuAction(param0 ^ 0, param1, param2);
            if (param0 != -16470) {
              field_H = (UiComponent) null;
            }
            return;
          }
          if (!this.selection.isPressActivated((byte) 127)) {
            return;
          }
          if (!this.isButtonVisible(param2, -109)) {
            return;
          }
          this.pageIndex = this.pageIndex + 1;
          if (this.isButtonVisible(param2, -111)) {
            return;
          }
        }
        if (param1) {
          return;
        }
        this.selection.selectedIndex = 1;
    }

    final int getButtonLeft(int param0, int param1) {
        if (param0 == 0) {
          return this.buttonLeft + param1 * 170;
        }
        this.handleMenuAction(57, true, -110);
        return this.buttonLeft + param1 * 170;
    }

    final boolean isButtonVisible(int param0, int param1) {
        int var3 = 0;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        if (param0 == 0) {
          if (this.pageIndex == 0) {
            return false;
          }
          if (2 != param0) {
            var3 = -55 % ((param1 + 42) / 49);
            return true;
          }
          if (ArchiveLoadSequence.instructionsPages.length - 1 == this.pageIndex) {
            return false;
          }
          var3Lifetime3 = -55 % ((param1 + 42) / 49);
          return true;
        }
        if (2 != param0) {
          var3Lifetime1 = -55 % ((param1 + 42) / 49);
          return true;
        }
        if (ArchiveLoadSequence.instructionsPages.length - 1 == this.pageIndex) {
          return false;
        }
        var3Lifetime2 = -55 % ((param1 + 42) / 49);
        return true;
    }

    final int getButtonRight(boolean param0, int param1) {
        if (param0) {
          return 87;
        }
        return this.getButtonLeft(0, param1) + 160;
    }

    public static void releaseStatics(byte param0) {
        if (param0 != -90) {
          field_K = false;
          field_J = null;
          field_H = null;
          return;
        }
        field_J = null;
        field_H = null;
    }

    final void onEnter(int param0, int param1, boolean param2) {
        super.onEnter(param0, param1, param2);
        this.pageIndex = 0;
    }

    InstructionsScreen(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(ScrollPaneWithFooter.field_Pb, param0, param1, param2, param3, param4, param5);
        this.pageIndex = 0;
    }

    final void advanceScreen(int param0) {
        super.advanceScreen(param0);
        if (ScrollPaneWithFooter.field_Lb == null) {
          return;
        }
        if (null == LocalGameSetupScreen.field_K) {
          return;
        }
        if (AchievementNotice.field_p != -1) {
          this.field_G = ScreenProjectionSupport.findHotspotRegion(DebouncedValidationProvider.field_f, ScrollPaneWithFooter.field_Lb, wn.field_i, 15395);
          LongAndTextLoginPayload.field_l = 12;
          SocialListEntry.field_Vb = 12;
          PauseMenuScreen.g(0, null == this.field_G ? -1 : this.field_G.field_p);
        }
    }

    final int getButtonTop(byte param0, int param1) {
        if (param0 != 6) {
          this.pageIndex = 50;
          return this.buttonTop;
        }
        return this.buttonTop;
    }

    static {
        field_K = true;
    }
}
