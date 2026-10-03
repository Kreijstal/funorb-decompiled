/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameScreen extends MenuScreen {
    private boolean field_S;
    private int field_X;
    private boolean field_H;
    private int field_Z;
    private int field_M;
    private int field_V;
    private int field_w;
    private int field_n;
    private Geoblox gameApplet;
    private int screenId;
    int activeTicks;
    private int field_o;
    private int field_B;
    private int field_t;
    private int field_L;
    private int[] field_P;
    private int field_T;
    private boolean field_C;
    static String[] quickChatShortcutHelpTexts;
    private int field_N;
    private int field_s;
    private int field_Y;
    static int selectedThemeId;
    private double field_A;
    private boolean field_E;
    private int animationTick;
    private int field_u;
    private int field_I;
    private PcmSampleStream volumePreviewStream;
    private int volumePreviewTicks;
    static String createNameLeadingSpaceAlertText;
    private int field_W;
    int field_q;
    private boolean field_v;
    static java.applet.Applet field_x;
    private int field_F;
    private int field_O;
    private int field_z;

    final void handleMenuKey(int itemIndex, int param1) {
        RuntimeException decompiledCaughtException = null;
        int actionId = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              actionId = InstrumentEnvelope.menuActionIds[this.screenId][itemIndex];
              if ((actionId == 8) &&
                  (var4 == 0)) {
                L4: {
                  if (102 != ki.currentKeyboardEventCode) {
                    if (ki.currentKeyboardEventCode != 103) {
                      super.handleMenuKey(itemIndex, -53);
                      if (var4 == 0) {
                        break L4;
                      }
                    }
                    j.field_gb = 80;
                    if (var4 == 0) {
                      break L4;
                    }
                  }
                  j.field_gb = 0;
                }
                this.previewMusicVolume(0);
                if (var4 == 0) {
                  break L0;
                }
              } else {
                if (actionId != 9) {
                  break L1;
                }
              }
              if (102 != ki.currentKeyboardEventCode) {
                if (103 != ki.currentKeyboardEventCode) {
                  super.handleMenuKey(itemIndex, -70);
                  if (var4 == 0) {
                    break L0;
                  }
                }
                wg.a(-15346, 80);
                if (var4 == 0) {
                  break L0;
                }
              }
              wg.a(-15346, 0);
              if (var4 == 0) {
                break L0;
              }
            }
            if ((ki.currentKeyboardEventCode == 13) &&
                (!this.field_C)) {
              L10: {
                if (this.screenId == 1) {
                  ai.requestedScreenId = -1;
                  if (var4 == 0) {
                    break L10;
                  }
                }
                ai.requestedScreenId = oc.previousMenuScreenId;
              }
              if (~ai.requestedScreenId == ~this.screenId) {
                break L0;
              }
              if ((this.screenId != 1) &&
                  (this.screenId != 0)) {
                break L0;
              }
              oc.previousMenuScreenId = this.screenId;
              if (var4 == 0) {
                break L0;
              }
            }
            if (this.field_C) {
              if ((ki.currentKeyboardEventCode != 84) &&
                  (83 != ki.currentKeyboardEventCode)) {
                break L0;
              }
              if (!fh.c(-103)) {
                L16: {
                  if (og.field_n <= 0) {
                    if (this.field_o == 0) {
                      break L16;
                    }
                    if ((PrefixCodeDecoder.pointerXSnapshot > 190) &&
                        (PrefixCodeDecoder.pointerXSnapshot < 449) &&
                        (265 < ue.pointerYSnapshot) &&
                        (ue.pointerYSnapshot < 299)) {
                      break L16;
                    }
                  }
                  if (InstrumentPatch.field_n == null) {
                    if (0 != this.field_o) {
                      if (PrefixCodeDecoder.pointerXSnapshot <= 260) {
                        break L0;
                      }
                      if (PrefixCodeDecoder.pointerXSnapshot >= 380) {
                        break L0;
                      }
                      if (ue.pointerYSnapshot <= 274) {
                        break L0;
                      }
                      if (ue.pointerYSnapshot >= 309) {
                        break L0;
                      }
                    }
                    this.pointerInteractionActive = true;
                    this.field_C = false;
                    if (var4 == 0) {
                      break L0;
                    }
                  }
                  L20: {
                    if (1 != this.field_o) {
                      if (this.field_o >= 0) {
                        break L20;
                      }
                      if (PrefixCodeDecoder.pointerXSnapshot <= 350) {
                        break L20;
                      }
                      if (PrefixCodeDecoder.pointerXSnapshot >= 470) {
                        break L20;
                      }
                      if (ue.pointerYSnapshot <= 327) {
                        break L20;
                      }
                      if (ue.pointerYSnapshot >= 362) {
                        break L20;
                      }
                    }
                    this.field_C = false;
                    ArchiveCatalog.b(255);
                    this.pointerInteractionActive = true;
                    if (var4 == 0) {
                      break L0;
                    }
                  }
                  if (this.field_o != 0) {
                    if (this.field_o >= 0) {
                      break L0;
                    }
                    if (PrefixCodeDecoder.pointerXSnapshot <= 170) {
                      break L0;
                    }
                    if (PrefixCodeDecoder.pointerXSnapshot >= 290) {
                      break L0;
                    }
                    if (ue.pointerYSnapshot <= 327) {
                      break L0;
                    }
                    if (ue.pointerYSnapshot >= 362) {
                      break L0;
                    }
                  }
                  this.pointerInteractionActive = true;
                  this.field_C = false;
                  if (var4 == 0) {
                    break L0;
                  }
                }
                this.pointerInteractionActive = true;
                this.field_C = false;
                if (var4 == 0) {
                  break L0;
                }
              }
              L23: {
                if (this.field_o != 1) {
                  if (this.field_o >= 0) {
                    break L23;
                  }
                  if (PrefixCodeDecoder.pointerXSnapshot <= 350) {
                    break L23;
                  }
                  if (470 <= PrefixCodeDecoder.pointerXSnapshot) {
                    break L23;
                  }
                  if (ue.pointerYSnapshot <= 265) {
                    break L23;
                  }
                  if (ue.pointerYSnapshot >= 299) {
                    break L23;
                  }
                }
                this.pointerInteractionActive = true;
                this.field_C = false;
                if (var4 == 0) {
                  break L0;
                }
              }
              if (this.field_o != 0) {
                if (this.field_o >= 0) {
                  break L0;
                }
                if (PrefixCodeDecoder.pointerXSnapshot <= 170) {
                  break L0;
                }
                if (PrefixCodeDecoder.pointerXSnapshot >= 290) {
                  break L0;
                }
                if (ue.pointerYSnapshot <= 265) {
                  break L0;
                }
                if (ue.pointerYSnapshot >= 299) {
                  break L0;
                }
              }
              this.pointerInteractionActive = true;
              if (null != el.gameplaySession) {
                el.gameplaySession.submitScore((byte) -70);
              }
              el.gameplayReturnScreenId = 0;
              ai.requestedScreenId = -1;
              cd.gameplayOriginScreenId = 0;
              if (var4 == 0) {
                break L0;
              }
            }
            super.handleMenuKey(itemIndex, -100);
          }
          if (param1 > -26) {
            this.updateTransition(59);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var3), "c.M(" + itemIndex + ',' + param1 + ')');
        }
    }

    private final void b(boolean param0) {
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = Geoblox.field_C;
        try {
          if (param0) {
            this.field_F = 124;
          }
          this.field_W = this.field_W % ee.menuBackgroundSprite.fullWidth;
          this.field_O = this.field_O % ee.menuBackgroundSprite.fullHeight;
          var2_int = -ee.menuBackgroundSprite.fullWidth + this.field_W;
          L1: while (true) {
            L2: {
              L3: {
                if (640 > var2_int) {
                  stackIn_16_0 = ee.menuBackgroundSprite.fullHeight + this.field_O + 480;
                  if (var4 != 0) {
                    break L2;
                  }
                  var3 = stackIn_16_0;
                  while (true) {
                    L5: {
                      if (~-ee.menuBackgroundSprite.fullHeight >= ~var3) {
                        ee.menuBackgroundSprite.drawUnmasked(var2_int, var3);
                        var3 = var3 - ee.menuBackgroundSprite.fullHeight;
                        if (var4 != 0) {
                          break L5;
                        }
                        if (var4 == 0) {
                          continue;
                        }
                      }
                      var2_int = var2_int + ee.menuBackgroundSprite.fullWidth;
                    }
                    if (var4 == 0) {
                      continue L1;
                    }
                    break L3;
                  }
                }
              }
              this.field_I = this.field_I % vc.menuForegroundSprite.fullHeight;
              this.field_u = this.field_u % vc.menuForegroundSprite.fullWidth;
              stackIn_16_0 = this.field_u + (vc.menuForegroundSprite.fullWidth + 640);
            }
            var2_int = stackIn_16_0;
            L7: while (true) {
              L9: {
                if (~-vc.menuForegroundSprite.fullWidth >= ~var2_int) {
                  if (var4 != 0) {
                    return;
                  }
                  var3 = this.field_I + vc.menuForegroundSprite.fullHeight + 480;
                  while (true) {
                    L11: {
                      if (~var3 <= ~-vc.menuForegroundSprite.fullHeight) {
                        vc.menuForegroundSprite.draw(var2_int, var3);
                        var3 = var3 - vc.menuForegroundSprite.fullHeight;
                        if (var4 != 0) {
                          break L11;
                        }
                        if (var4 == 0) {
                          continue;
                        }
                      }
                      var2_int = var2_int - vc.menuForegroundSprite.fullWidth;
                    }
                    if (var4 == 0) {
                      continue L7;
                    }
                    break L9;
                  }
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var2), "c.I(" + param0 + ')');
        }
    }

    private final void g(byte param0) {
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Geoblox.field_C;
        try {
          L0: {
            if (!this.field_H) {
              if (this.field_T >= 0) {
                break L0;
              }
              this.field_T = this.field_T + 1;
              if (var3 == 0) {
                break L0;
              }
            }
            if (-4 >= this.field_T) {
              this.field_H = false;
              if (var3 == 0) {
                break L0;
              }
            }
            this.field_T = this.field_T - 1;
          }
          if (param0 >= -11) {
            this.gameApplet = (Geoblox) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var2), "c.Q(" + param0 + ')');
        }
    }

    final void renderScreen(int param0) {
        int stackIn_73_0 = 0;
        int stackIn_122_0 = 0;
        int stackIn_144_0 = 0;
        int stackIn_191_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var8_ref_String = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Geoblox.field_C;
        try {
          if (param0 != -28750) {
            return;
          }
          this.b(false);
          var2_int = 270;
          var3 = 140;
          var4 = 400;
          if ((this.screenId != 0) &&
              (this.screenId != 1) &&
              (this.screenId != 4)) {
            L1: {
              if (2 == this.screenId) {
                var2_int = 235;
                if (var12 == 0) {
                  break L1;
                }
              }
              var2_int = 285;
            }
            L3: {
              var5 = 120;
              if (this.screenId == 3) {
                var5 += 10;
                if (var12 == 0) {
                  break L3;
                }
              }
              if ((this.screenId != 8) &&
                  (this.screenId != 7)) {
                break L3;
              }
              var4 += 20;
              var5 -= 10;
            }
            ma.drawNineSlicePanel(var3, var5, var2_int, (byte) -92, var4, ll.frameNineSliceSprites);
          }
          if (!this.field_E) {
            super.renderScreen(param0 + 0);
          }
          if ((this.screenId != 2) &&
              (this.screenId != 8)) {
            if (!((5 != this.screenId) &&
                  (7 != this.screenId))) {
              kh.screenTitleSprites[4].draw(0, 20);
              ac.a(false, false, (byte) -93);
              if (var12 == 0) {
                return;
              }
            }
            if (this.screenId != 6) {
              if (this.screenId == 4) {
                kh.screenTitleSprites[8].draw(0, 20);
                ma.drawNineSlicePanel(var3 + 10, 120, 100, (byte) -92, var4, ll.frameNineSliceSprites);
                var5 = 184;
                dd.uiPaletteFont.drawCenteredText(Geoblox.loginMessage, 320, var5, 0, -1);
                var5 = 185;
                fi.smallFont.drawParagraph(r.field_sb, 130, var5, 380, 300, 0, -1, 1, 0, 14);
                ma.drawNineSlicePanel(320, 120, 60, (byte) -92, var4, ll.frameNineSliceSprites);
                fi.smallFont.drawParagraph(bd.field_b, 130, 330, 380, 300, 0, -1, 1, 0, 14);
                if (var12 == 0) {
                  return;
                }
              }
              if (this.screenId != 3) {
                kh.screenTitleSprites[0].draw(0, 20);
                if ((this.screenId != 0) &&
                    (this.screenId != 1)) {
                  return;
                }
                if (!this.field_C) {
                  return;
                }
                if (fh.c(-93)) {
                  if (this.activeTicks <= 200) {
                    stackIn_73_0 = this.activeTicks;
                  } else {
                    stackIn_73_0 = 200;
                  }
                  L17: {
                    var5 = stackIn_73_0;
                    SoftwareRasterizer.fillRectangleAlpha(0, 0, 640, 480, 0, var5);
                    ma.drawNineSlicePanel(160, 150, 80, (byte) -92, 340, ll.frameNineSliceSprites);
                    var6 = 170;
                    fi.smallFont.drawParagraph(ki.fullscreenNonmemberText, 160, var6, 320, 300, 0, -1, 1, 0, 16);
                    var7 = 100;
                    var8 = -(20 + var7 >> 1) + 410;
                    var6 = 265;
                    var9 = var8 - (-(var7 >> 1) - 10);
                    ma.drawNineSlicePanel(var6, var8, 36, (byte) -92, 20 + var7, eb.mouseBoxFrames);
                    if (1 != this.field_o) {
                      if (this.field_o >= 0) {
                        break L17;
                      }
                      if (350 >= PrefixCodeDecoder.pointerXSnapshot) {
                        break L17;
                      }
                      if (PrefixCodeDecoder.pointerXSnapshot >= 470) {
                        break L17;
                      }
                      if (ue.pointerYSnapshot <= 265) {
                        break L17;
                      }
                      if (ue.pointerYSnapshot >= 299) {
                        break L17;
                      }
                    }
                    dd.uiPaletteFont.colorPalettes[0][wf.field_p] = 15488514;
                  }
                  L19: {
                    dd.uiPaletteFont.drawCenteredText(hh.fullscreenCloseButtonText, var9, 30 + var6, 0, -1);
                    var8 = 320 - (20 + var7 >> 1) - 90;
                    dd.uiPaletteFont.colorPalettes[0][wf.field_p] = 16689938;
                    var6 = 265;
                    var9 = 10 + (var7 >> 1) + var8;
                    ma.drawNineSlicePanel(var6, var8, 36, (byte) -92, var7 + 20, eb.mouseBoxFrames);
                    if (this.field_o != 0) {
                      if (0 <= this.field_o) {
                        break L19;
                      }
                      if (170 >= PrefixCodeDecoder.pointerXSnapshot) {
                        break L19;
                      }
                      if (PrefixCodeDecoder.pointerXSnapshot >= 290) {
                        break L19;
                      }
                      if (ue.pointerYSnapshot <= 265) {
                        break L19;
                      }
                      if (ue.pointerYSnapshot >= 299) {
                        break L19;
                      }
                    }
                    dd.uiPaletteFont.colorPalettes[0][wf.field_p] = 15488514;
                  }
                  dd.uiPaletteFont.drawCenteredText(qb.fullscreenMembersButtonText, var9, 30 + var6, 0, -1);
                  dd.uiPaletteFont.colorPalettes[0][wf.field_p] = 16689938;
                  if (var12 == 0) {
                    return;
                  }
                }
                if (og.field_n > 0) {
                  if (InstrumentPatch.field_n == null) {
                    if (this.activeTicks > 200) {
                      stackIn_122_0 = 200;
                    } else {
                      stackIn_122_0 = this.activeTicks;
                    }
                    L24: {
                      var5 = stackIn_122_0;
                      SoftwareRasterizer.fillRectangleAlpha(0, 0, 640, 480, 0, var5);
                      ma.drawNineSlicePanel(160, 160, 95, (byte) -92, 320, ll.frameNineSliceSprites);
                      var6 = 170;
                      var6 = var6 + 16 * fi.smallFont.drawParagraph(sj.fullscreenUnavailableText, 170, var6, 300, 300, 0, -1, 1, 0, 16);
                      var6 += 40;
                      var7 = 100;
                      var8 = 320 - (var7 + 20 >> 1);
                      var9 = (var7 >> 1) + (var8 + 10);
                      ma.drawNineSlicePanel(var6, var8, 36, (byte) -92, 20 + var7, eb.mouseBoxFrames);
                      if (0 != this.field_o) {
                        if (260 >= PrefixCodeDecoder.pointerXSnapshot) {
                          break L24;
                        }
                        if (PrefixCodeDecoder.pointerXSnapshot >= 380) {
                          break L24;
                        }
                        if (ue.pointerYSnapshot <= 274) {
                          break L24;
                        }
                        if (ue.pointerYSnapshot >= 309) {
                          break L24;
                        }
                      }
                      dd.uiPaletteFont.colorPalettes[0][wf.field_p] = 15488514;
                    }
                    dd.uiPaletteFont.drawCenteredText(hh.fullscreenCloseButtonText, var9, 30 + var6, 0, -1);
                    dd.uiPaletteFont.colorPalettes[0][wf.field_p] = 16689938;
                    if (var12 == 0) {
                      return;
                    }
                  }
                  if (this.activeTicks <= 200) {
                    stackIn_144_0 = this.activeTicks;
                  } else {
                    stackIn_144_0 = 200;
                  }
                  L27: {
                    var5 = stackIn_144_0;
                    SoftwareRasterizer.fillRectangleAlpha(0, 0, 640, 480, 0, var5);
                    ma.drawNineSlicePanel(160, 160, 140, (byte) -92, 320, ll.frameNineSliceSprites);
                    var6 = 170;
                    var7_ref_String = ue.fullscreenBeforeAcceptText + " " + ArchiveRequest.fullscreenAcceptButtonText + " " + wj.fullscreenAfterAcceptText + " " + rb.fullscreenCancelButtonText + " " + uj.fullscreenAfterCancelText;
                    var6 = var6 + 16 * fi.smallFont.drawParagraph(var7_ref_String, 170, var6, 300, 300, 0, -1, 1, 0, 16);
                    var6 += 10;
                    var8_ref_String = Integer.toString((1500 - this.activeTicks) / 150 + 1);
                    if ((1500 - this.activeTicks) / 150 <= 0) {
                      var6 = var6 + fi.smallFont.drawParagraph(wj.a(mj.fullscreenAcceptCountdownSingularText, new String[]{var8_ref_String}, (byte) -51), 170, var6, 300, 300, 0, -1, 1, 0, 16) * 16;
                      if (var12 == 0) {
                        break L27;
                      }
                    }
                    var6 = var6 + fi.smallFont.drawParagraph(wj.a(jk.fullscreenAcceptCountdownPluralText, new String[]{var8_ref_String}, (byte) -45), 170, var6, 300, 300, 0, -1, 1, 0, 16) * 16;
                  }
                  L29: {
                    var6 += 40;
                    var9 = 100;
                    var10 = -(20 + var9 >> 1) + 320 + 90;
                    ma.drawNineSlicePanel(var6, var10, 36, (byte) -92, var9 + 20, eb.mouseBoxFrames);
                    var11 = 10 + ((var9 >> 1) + var10);
                    if (this.field_o != 1) {
                      if (0 <= this.field_o) {
                        break L29;
                      }
                      if (PrefixCodeDecoder.pointerXSnapshot <= 350) {
                        break L29;
                      }
                      if (PrefixCodeDecoder.pointerXSnapshot >= 470) {
                        break L29;
                      }
                      if (ue.pointerYSnapshot <= 317) {
                        break L29;
                      }
                      if (ue.pointerYSnapshot >= 352) {
                        break L29;
                      }
                    }
                    dd.uiPaletteFont.colorPalettes[0][wf.field_p] = 15488514;
                  }
                  L31: {
                    dd.uiPaletteFont.drawCenteredText(rb.fullscreenCancelButtonText, var11, 30 + var6, 0, -1);
                    dd.uiPaletteFont.colorPalettes[0][wf.field_p] = 16689938;
                    var10 = 320 - (20 + var9 >> 1) - 90;
                    var11 = 10 + (var9 >> 1) + var10;
                    ma.drawNineSlicePanel(var6, var10, 36, (byte) -92, 20 + var9, eb.mouseBoxFrames);
                    if (this.field_o != 0) {
                      if (this.field_o >= 0) {
                        break L31;
                      }
                      if (PrefixCodeDecoder.pointerXSnapshot <= 170) {
                        break L31;
                      }
                      if (PrefixCodeDecoder.pointerXSnapshot >= 290) {
                        break L31;
                      }
                      if (ue.pointerYSnapshot <= 317) {
                        break L31;
                      }
                      if (ue.pointerYSnapshot >= 352) {
                        break L31;
                      }
                    }
                    dd.uiPaletteFont.colorPalettes[0][wf.field_p] = 15488514;
                  }
                  dd.uiPaletteFont.drawCenteredText(ArchiveRequest.fullscreenAcceptButtonText, var11, 30 + var6, 0, -1);
                  dd.uiPaletteFont.colorPalettes[0][wf.field_p] = 16689938;
                  if (var12 == 0) {
                    return;
                  }
                }
                if (this.activeTicks > 200) {
                  stackIn_191_0 = 200;
                } else {
                  stackIn_191_0 = this.activeTicks;
                }
                L34: {
                  var5 = stackIn_191_0;
                  SoftwareRasterizer.fillRectangleAlpha(0, 0, 640, 480, 0, var5);
                  ma.drawNineSlicePanel(170, 160, 80, (byte) -92, 320, ll.frameNineSliceSprites);
                  var6 = 180;
                  fi.smallFont.drawParagraph(ki.fullscreenNonmemberText, 170, var6, 300, 300, 0, -1, 1, 0, 16);
                  var7 = 242;
                  var8 = 320 - (var7 + 20 >> 1);
                  var9 = 10 + (var8 + (var7 >> 1));
                  var6 = 265;
                  ma.drawNineSlicePanel(var6, var8, 36, (byte) -92, var7 + 20, eb.mouseBoxFrames);
                  if (this.field_o != 0) {
                    if (PrefixCodeDecoder.pointerXSnapshot <= 190) {
                      break L34;
                    }
                    if (PrefixCodeDecoder.pointerXSnapshot >= 449) {
                      break L34;
                    }
                    if (ue.pointerYSnapshot <= 265) {
                      break L34;
                    }
                    if (299 <= ue.pointerYSnapshot) {
                      break L34;
                    }
                  }
                  dd.uiPaletteFont.colorPalettes[0][wf.field_p] = 15488514;
                }
                dd.uiPaletteFont.drawCenteredText(hh.fullscreenCloseButtonText, var9, 30 + var6, 0, -1);
                dd.uiPaletteFont.colorPalettes[0][wf.field_p] = 16689938;
                if (var12 == 0) {
                  return;
                }
              }
              kh.screenTitleSprites[5].draw(0, 20);
              if (!this.field_E) {
                this.b(-97, this.field_q);
                if (var12 == 0) {
                  return;
                }
              }
              L37: {
                var5 = this.field_F;
                if (!this.field_v) {
                  var5 = 640 - var5;
                  SoftwareRasterizer.setClip(0, 0, var5, 480);
                  this.b(-85, this.field_n);
                  this.field_S = true;
                  super.renderScreen(-28750);
                  this.field_S = false;
                  SoftwareRasterizer.setClip(var5, 0, 640, 480);
                  this.b(param0 ^ 28757, this.field_q);
                  super.renderScreen(-28750);
                  SoftwareRasterizer.setClip(0, 0, 640, 480);
                  qj.transitionCurtain.drawRotatedCentered((qj.transitionCurtain.fullHeight >> 1) + var5, 240, -49150, 4096);
                  if (var12 == 0) {
                    break L37;
                  }
                }
                SoftwareRasterizer.setClip(var5, 0, 640, 480);
                this.b(-17, this.field_n);
                this.field_S = true;
                super.renderScreen(-28750);
                this.field_S = false;
                SoftwareRasterizer.setClip(0, 0, var5, 480);
                this.b(-48, this.field_q);
                super.renderScreen(-28750);
                SoftwareRasterizer.setClip(0, 0, 640, 480);
                qj.transitionCurtain.drawRotatedCentered(-(qj.transitionCurtain.fullHeight >> 1) + var5, 240, -16383, 4096);
              }
              if (var12 == 0) {
                return;
              }
            }
            kh.screenTitleSprites[7].draw(0, 20);
            ac.a(false, true, (byte) -122);
            if (var12 == 0) {
              return;
            }
          }
          this.b(30);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var2), "c.T(" + param0 + ')');
        }
    }

    final void decreaseMenuValue(int itemIndex, byte param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int actionId = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Geoblox.field_C;
        try {
          var3_int = 121 % ((44 - param1) / 36);
          actionId = InstrumentEnvelope.menuActionIds[this.screenId][itemIndex];
          if ((actionId == 8) &&
              (var5 == 0)) {
            if (j.field_gb > 10) {
              j.field_gb = j.field_gb - 10;
              if (var5 == 0) {
                return;
              }
            }
            j.field_gb = 0;
            if (var5 == 0) {
              return;
            }
          } else {
            if (9 != actionId) {
              return;
            }
          }
          if (oc.field_c > 10) {
            wg.a(-15346, oc.field_c - 10);
            if (var5 == 0) {
              return;
            }
          }
          wg.a(-15346, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "c.N(" + itemIndex + ',' + param1 + ')');
        }
    }

    public static void d(byte param0) {
        try {
            quickChatShortcutHelpTexts = null;
            field_x = null;
            createNameLeadingSpaceAlertText = null;
            if (param0 != 28) {
                GameScreen.c(79, (byte) -113);
            }
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "c.S(" + param0 + ')');
        }
    }

    private final void c(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = Geoblox.field_C;
        try {
          if (param0 >= -40) {
            this.b(77, -13);
          }
          if ((3 == this.screenId) &&
              (!this.field_E)) {
            if (!((this.field_q != 4) &&
                  (this.selectedItemIndex == 3))) {
              if (4 == this.field_q) {
                if (this.selectedItemIndex == 2) {
                  this.selectedItemIndex = 3;
                }
                if (oc.previousMenuScreenId != 1) {
                  return;
                }
                if (this.selectedItemIndex != 3) {
                  return;
                }
                this.selectedItemIndex = 0;
                if (var3 == 0) {
                  return;
                }
              }
              if (this.field_q != 0) {
                return;
              }
              if (this.selectedItemIndex != 0) {
                return;
              }
              this.selectedItemIndex = 1;
              if (var3 == 0) {
                return;
              }
            }
            this.selectedItemIndex = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var2), "c.C(" + param0 + ')');
        }
    }

    final int hitTestMenuItem(int pointerX, int pointerY, byte param2) {
        int stackIn_2_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_125_0 = 0;
        int stackIn_131_0 = 0;
        int stackIn_133_0 = 0;
        int stackIn_145_0 = 0;
        int stackIn_162_0 = 0;
        int stackIn_168_0 = 0;
        int stackIn_179_0 = 0;
        int stackIn_193_0 = 0;
        int stackIn_195_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param2 < 20) {
            stackIn_2_0 = -109;
            return stackIn_2_0;
          }
          if ((0 != this.screenId) &&
              (this.screenId != 1)) {
            L1: {
              if (this.screenId == 3) {
                if ((pointerY > 430) &&
                    (pointerY < 470)) {
                  if ((this.field_q != 0) &&
                      (pointerX > 130) &&
                      (pointerX < 253)) {
                    stackIn_162_0 = 0;
                    return stackIn_162_0;
                  }
                  if ((pointerX > 268) &&
                      (391 > pointerX)) {
                    stackIn_168_0 = 1;
                    return stackIn_168_0;
                  }
                  if ((this.field_q != 4) &&
                      (pointerX > 406) &&
                      (pointerX < 529)) {
                    stackIn_179_0 = 2;
                    return stackIn_179_0;
                  }
                  if ((this.field_q == 4) &&
                      (oc.previousMenuScreenId != 1) &&
                      (pointerX > 406) &&
                      (pointerX < 635)) {
                    stackIn_193_0 = 3;
                    return stackIn_193_0;
                  }
                }
              } else {
                if (this.screenId != 5) {
                  if ((this.screenId != 7) &&
                      (this.screenId != 8)) {
                    if (2 == this.screenId) {
                      if ((pointerY > 380) &&
                          (pointerY < 420)) {
                        if ((pointerX > 61) &&
                            (220 > pointerX)) {
                          stackIn_133_0 = 0;
                          return stackIn_133_0;
                        }
                        if ((241 < pointerX) &&
                            (pointerX < 400)) {
                          stackIn_125_0 = 1;
                          return stackIn_125_0;
                        }
                        if (pointerX <= 420) {
                          break L1;
                        }
                        if (pointerX >= 579) {
                          break L1;
                        }
                        stackIn_131_0 = 2;
                        return stackIn_131_0;
                      }
                      if (pointerY <= 430) {
                        break L1;
                      }
                      if (pointerY >= 470) {
                        break L1;
                      }
                      if (pointerX <= 279) {
                        break L1;
                      }
                      if (pointerX >= 362) {
                        break L1;
                      }
                      stackIn_145_0 = 3;
                      return stackIn_145_0;
                    }
                    if (this.screenId == 4) {
                      if (pointerX <= 171) {
                        break L1;
                      }
                      if (pointerX >= 469) {
                        break L1;
                      }
                      if ((265 < pointerY) &&
                          (pointerY < 301)) {
                        stackIn_78_0 = 0;
                        return stackIn_78_0;
                      }
                      if (pointerY <= 395) {
                        break L1;
                      }
                      if (431 <= pointerY) {
                        break L1;
                      }
                      stackIn_84_0 = 1;
                      return stackIn_84_0;
                    }
                    if (6 != this.screenId) {
                      break L1;
                    }
                    if (pointerY <= 430) {
                      break L1;
                    }
                    if (470 <= pointerY) {
                      break L1;
                    }
                    if ((pointerX > 146) &&
                        (pointerX < 306)) {
                      stackIn_99_0 = 0;
                      return stackIn_99_0;
                    }
                    if (pointerX <= 326) {
                      break L1;
                    }
                    if (pointerX >= 486) {
                      break L1;
                    }
                    stackIn_107_0 = 1;
                    return stackIn_107_0;
                  }
                  if ((pointerY > 437) &&
                      (pointerY < 473)) {
                    if ((pointerX > 121) &&
                        (356 > pointerX)) {
                      stackIn_54_0 = 0;
                      return stackIn_54_0;
                    }
                    if ((436 < pointerX) &&
                        (pointerY < 518)) {
                      stackIn_60_0 = 1;
                      return stackIn_60_0;
                    }
                  }
                } else {
                  if ((pointerY > 435) &&
                      (470 > pointerY) &&
                      (pointerX > 279) &&
                      (361 > pointerX)) {
                    stackIn_36_0 = 0;
                    return stackIn_36_0;
                  }
                }
              }
            }
            stackIn_195_0 = -1;
            return stackIn_195_0;
          }
          if ((pointerX >= 149) &&
              (490 >= pointerX)) {
            stackIn_18_0 = super.hitTestMenuItem(pointerX, pointerY, (byte) 127);
            return stackIn_18_0;
          }
          stackIn_16_0 = -1;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var4), "c.P(" + pointerX + ',' + pointerY + ',' + param2 + ')');
        }
    }

    private final void b(int param0) {
        Object stackIn_59_0 = null;
        RuntimeException decompiledCaughtException = null;
        String var2 = null;
        int var2_int = 0;
        RuntimeException var2_ref = null;
        int var3 = 0;
        String[] var3_ref_String__ = null;
        MonochromeBitmapFont var4 = null;
        int[] var5 = null;
        String var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String var8 = null;
        String var9 = null;
        int var10 = 0;
        var10 = Geoblox.field_C;
        try {
          if ((ca.field_f == null) &&
              (!fh.c(-115))) {
            ca.field_f = qb.b(22, 1, 0, 10, 3);
          }
          L1: {
            if (0 != da.field_c) {
              if (da.field_c != 2) {
                if (da.field_c != 1) {
                  break L1;
                }
                kh.screenTitleSprites[3].draw(0, 20);
                if (var10 == 0) {
                  break L1;
                }
              }
              kh.screenTitleSprites[2].draw(0, 20);
              if (var10 == 0) {
                break L1;
              }
            }
            kh.screenTitleSprites[1].draw(0, 20);
          }
          if (param0 != 30) {
            this.updateTransition(-78);
          }
          L5: {
            if ((null != ca.field_f) &&
                (null != ca.field_f.field_k)) {
              if (!ca.field_f.field_j) {
                var2 = eb.field_f;
                var3 = 76 + (150 + dd.uiPaletteFont.maxAscent);
                dd.uiPaletteFont.drawCenteredText(var2, 322, var3, 0, -1);
                if (var10 == 0) {
                  break L5;
                }
              }
              L8: {
                var2_int = 0;
                var3_ref_String__ = ca.field_f.field_k[da.field_c];
                var4 = fi.smallFont;
                if (var3_ref_String__ != null) {
                  var5 = ca.field_f.field_h[da.field_c];
                  var6 = var4.maxAscent + 150;
                  var7 = 0;
                  var8_int = 0;
                  while (true) {
                    L10: {
                      if (var8_int < 10) {
                        stackIn_59_0 = null;
                        if (var10 != 0) {
                          break L10;
                        }
                        L12: {
                          if (stackIn_59_0 != var3_ref_String__[var8_int]) {
                            var2_int = 1;
                            var9 = var3_ref_String__[var8_int];
                            if ((var7 == 0) &&
                                (null != el.gameplaySession) &&
                                (var5[var8_int] == Math.abs(el.gameplaySession.score)) &&
                                (WhirlpoolHash.a(var9, (byte) 12))) {
                              var7 = 1;
                              var4.drawRightAlignedText(1 + var8_int + ". ", 165, var6, 16610816, -1);
                              var4.drawText(var9, 165, var6, 16610816, -1);
                              var4.drawRightAlignedText(Integer.toString(var5[var8_int]), 500, var6, 16610816, -1);
                              if (var10 == 0) {
                                break L12;
                              }
                            }
                            var4.drawRightAlignedText(1 + var8_int + ". ", 165, var6, 1, -1);
                            var4.drawText(var9, 165, var6, 1, -1);
                            var4.drawRightAlignedText(Integer.toString(var5[var8_int]), 500, var6, 1, -1);
                          }
                        }
                        var6 += 15;
                        var8_int++;
                        if (var10 == 0) {
                          continue;
                        }
                      }
                      if (var7 != 0) {
                        break L8;
                      }
                      stackIn_59_0 = null;
                    }
                    if (stackIn_59_0 == el.gameplaySession) {
                      break L8;
                    }
                    if (el.gameplaySession.score == 0) {
                      break L8;
                    }
                    if (el.gameplaySession.score == -2147483648) {
                      break L8;
                    }
                    var8 = SecondaryDeque.field_f;
                    var4.drawText(var8, 165, var6, 16724225, -1);
                    var4.drawRightAlignedText(Integer.toString(Math.abs(el.gameplaySession.score)), 500, var6, 16724225, -1);
                    break L8;
                  }
                }
              }
              if (var2_int == 0) {
                var5_ref = sb.noHighscoresText;
                var6 = 76 + dd.uiPaletteFont.maxAscent + 150;
                dd.uiPaletteFont.drawCenteredText(var5_ref, 322, var6, 0, -1);
              }
              if (var10 == 0) {
                break L5;
              }
            }
            L15: {
              if (!fh.c(-89)) {
                var2 = g.serviceUnavailableText;
                if (var10 == 0) {
                  break L15;
                }
              }
              var2 = sb.noHighscoresText;
            }
            var3 = 150 - (-dd.uiPaletteFont.maxAscent - 76);
            dd.uiPaletteFont.drawCenteredText(var2, 322, var3, 0, -1);
            if (fh.c(param0 - 147)) {
              dd.uiPaletteFont.drawParagraph(ni.createToUseText, 125, 350, 395, 100, 0, -1, 1, 0, 26);
            }
          }
          if (!fh.c(param0 ^ -109)) {
            var2 = ue.highscoreFriendTipText;
            fi.smallFont.drawParagraph(var2, 140, 325, 360, 300, 0, -1, 1, 0, 16);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var2_ref), "c.U(" + param0 + ')');
        }
    }

    final void updateScreen(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException decompiledCaughtException = null;
        float var2_float = 0.0f;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = Geoblox.field_C;
        try {
          fieldTemp$0 = this.animationTick + 1;
          this.animationTick = this.animationTick + 1;
          if (fieldTemp$0 % 5 == 0) {
            this.field_O = this.field_O - 1;
            this.field_W = this.field_W + 1;
            this.g((byte) -102);
          }
          if (3 == (this.animationTick & 3)) {
            this.field_I = this.field_I - 1;
            this.field_u = this.field_u - 1;
          }
          if (this.field_E) {
            this.e((byte) 104);
            return;
          }
          jk.field_a = this.field_C;
          this.volumePreviewTicks = this.volumePreviewTicks + 1;
          this.activeTicks = this.activeTicks + 1;
          if ((this.field_C) &&
              (InstrumentPatch.field_n != null) &&
              (this.activeTicks > 1500)) {
            ArchiveCatalog.b(255);
            this.field_C = false;
          }
          while (true) {
            L4: {
              if (hh.pollKeyboardEvent(108)) {
                this.handleScreenKey((byte) 62);
                if (var3 != 0) {
                  break L4;
                }
                if (var3 == 0) {
                  continue;
                }
              }
              if ((this.screenId == 3) &&
                  (this.selectedItemIndex == 0) &&
                  (this.field_q == 0) &&
                  (!this.field_H)) {
                this.selectedItemIndex = this.selectedItemIndex + 1;
              }
            }
            if (this.screenId == 3) {
              L7: {
                if (0 == (1 & this.animationTick)) {
                  this.field_z = this.field_z + 1;
                  this.field_Z = -(this.field_z >> 1) + 60;
                  if (this.field_Z < 15) {
                    this.field_Z = 15;
                    if (var3 == 0) {
                      break L7;
                    }
                  }
                  this.field_A = this.field_A + 0.1;
                }
              }
              if (120 == this.field_z) {
                this.field_X = qi.b(7, 1);
                this.field_L = qi.b(7, 1);
                this.field_z = 0;
              }
              if ((this.field_q < 4) &&
                  (this.animationTick % 24 == 0)) {
                this.field_w = this.field_w + 1;
                if (this.field_w >= 4) {
                  this.field_w = 0;
                }
              }
              L11: {
                if (this.field_q != 3) {
                  if (4 != this.field_q) {
                    break L11;
                  }
                  if (49 > (this.animationTick & 255)) {
                    if ((15 & this.animationTick) != 0) {
                      break L11;
                    }
                    this.field_w = this.field_w + 1;
                    if (this.field_w >= 4) {
                      this.field_w = 0;
                    }
                    this.field_B = this.field_B + 1;
                    if (4 > this.field_B) {
                      break L11;
                    }
                    this.field_B = 0;
                    if (var3 == 0) {
                      break L11;
                    }
                  }
                  this.field_B = 0;
                  this.field_w = 0;
                  if (var3 == 0) {
                    break L11;
                  }
                }
                var2_float = 0.019999999552965164f * (float)(this.animationTick % 50);
                this.field_N = ((int)(var2_float * (float)this.field_t) << 8) + (jg.themeCycleColors[selectedThemeId][this.field_B] + ((int)(var2_float * (float)this.field_V) << 16) + (int)((float)this.field_M * var2_float));
                if (this.animationTick % 50 == 49) {
                  this.field_B = this.field_B + 1;
                  this.field_B = this.field_B % 7;
                  this.field_V = -((16751678 & jg.themeCycleColors[selectedThemeId][this.field_B]) >> 16) + ((jg.themeCycleColors[selectedThemeId][(1 + this.field_B) % 7] & 16754682) >> 16);
                  this.field_t = (255 & jg.themeCycleColors[selectedThemeId][(this.field_B + 1) % 7] >> 8) - ((jg.themeCycleColors[selectedThemeId][this.field_B] & 65438) >> 8);
                  this.field_M = (255 & jg.themeCycleColors[selectedThemeId][(1 + this.field_B) % 7]) - (255 & jg.themeCycleColors[selectedThemeId][this.field_B]);
                }
              }
              PrefixCodeDecoder.advanceMenuAvatarAnimation((byte) 127);
            }
            L15: {
              fieldTemp$1 = di.field_a;
              di.field_a = di.field_a - 1;
              if (0 > fieldTemp$1) {
                if (bi.pointerPressButtonSnapshot == 0) {
                  break L15;
                }
                di.field_a = 50;
                if (var3 == 0) {
                  break L15;
                }
              }
              bi.pointerPressButtonSnapshot = 0;
            }
            if (bi.pointerPressButtonSnapshot != 0) {
              if (!((this.screenId != 5) &&
                    (7 != this.screenId))) {
                oe.a(false, false, param0 ^ 189);
              }
              if (this.screenId == 6) {
                oe.a(true, false, param0 + 131);
              }
              if (this.screenId == 4) {
                oe.a(true, true, 160);
              }
            }
            L21: {
              if (!this.field_C) {
                this.updatePointer(true);
                if (var3 == 0) {
                  break L21;
                }
              }
              if (bi.pointerPressButtonSnapshot != 0) {
                if (fh.c(-104)) {
                  if ((265 < he.pointerPressYSnapshot) &&
                      (he.pointerPressYSnapshot < 299)) {
                    if ((mc.pointerPressXSnapshot > 350) &&
                        (mc.pointerPressXSnapshot < 470)) {
                      this.pointerInteractionActive = true;
                      this.field_C = false;
                      if (var3 == 0) {
                        break L21;
                      }
                    }
                    if (!((mc.pointerPressXSnapshot > 170) &&
                          (mc.pointerPressXSnapshot < 290))) {
                      this.pointerInteractionActive = false;
                      if (var3 == 0) {
                        break L21;
                      }
                    }
                    this.pointerInteractionActive = true;
                    if (null != el.gameplaySession) {
                      el.gameplaySession.submitScore((byte) -70);
                    }
                    ai.requestedScreenId = -1;
                    el.gameplayReturnScreenId = 0;
                    cd.gameplayOriginScreenId = 0;
                    if (var3 == 0) {
                      break L21;
                    }
                  }
                  this.pointerInteractionActive = false;
                  if (var3 == 0) {
                    break L21;
                  }
                }
                if ((og.field_n > 0) &&
                    (null != InstrumentPatch.field_n)) {
                  if ((he.pointerPressYSnapshot > 317) &&
                      (352 > he.pointerPressYSnapshot)) {
                    if (!((mc.pointerPressXSnapshot > 350) &&
                          (mc.pointerPressXSnapshot < 470))) {
                      if (!((mc.pointerPressXSnapshot > 170) &&
                            (mc.pointerPressXSnapshot < 290))) {
                        this.pointerInteractionActive = false;
                        if (var3 == 0) {
                          break L21;
                        }
                      }
                      this.field_C = false;
                      this.pointerInteractionActive = true;
                      if (var3 == 0) {
                        break L21;
                      }
                    }
                    this.field_C = false;
                    ArchiveCatalog.b(255);
                    this.pointerInteractionActive = true;
                    if (var3 == 0) {
                      break L21;
                    }
                  }
                  this.pointerInteractionActive = false;
                  if (var3 == 0) {
                    break L21;
                  }
                }
                this.pointerInteractionActive = true;
                this.field_C = false;
              }
            }
            if (!((PrefixCodeDecoder.pointerXSnapshot == this.field_s) &&
                  (~ue.pointerYSnapshot == ~this.field_Y))) {
              this.field_o = -1;
            }
            this.field_Y = ue.pointerYSnapshot;
            if (param0 != 29) {
              this.handleMenuKey(11, 26);
            }
            this.field_s = PrefixCodeDecoder.pointerXSnapshot;
            if (this.selectedItemIndex != 0) {
              L39: {
                var2_int = (PrefixCodeDecoder.pointerXSnapshot + he.pointerPressYSnapshot - (-kd.field_c - ki.currentKeyboardEventCode)) % 8;
                if (var2_int != 0) {
                  if (var2_int != 1) {
                    if (var2_int != 2) {
                      if (var2_int == 3) {
                        oa.field_a = oa.field_a - gb.field_g;
                        kb.field_d = kb.field_d + 1;
                        if (var3 == 0) {
                          break L39;
                        }
                      }
                      if (var2_int != 4) {
                        if (var2_int != 5) {
                          if (6 == var2_int) {
                            gb.field_g = gb.field_g - 1;
                            ml.field_r = ml.field_r - kb.field_d;
                            if (var3 == 0) {
                              break L39;
                            }
                          }
                          if (var2_int != 7) {
                            break L39;
                          }
                          kb.field_d = kb.field_d - 1;
                          ml.field_r = ml.field_r - gb.field_g;
                          if (var3 == 0) {
                            break L39;
                          }
                        }
                        kb.field_d = kb.field_d + 1;
                        ml.field_r = ml.field_r + gb.field_g;
                        if (var3 == 0) {
                          break L39;
                        }
                      }
                      gb.field_g = gb.field_g + 1;
                      ml.field_r = ml.field_r + kb.field_d;
                      if (var3 == 0) {
                        break L39;
                      }
                    }
                    oa.field_a = oa.field_a - kb.field_d;
                    gb.field_g = gb.field_g + 1;
                    if (var3 == 0) {
                      break L39;
                    }
                  }
                  oa.field_a = oa.field_a + gb.field_g;
                  kb.field_d = kb.field_d - 1;
                  if (var3 == 0) {
                    break L39;
                  }
                }
                oa.field_a = oa.field_a + kb.field_d;
                gb.field_g = gb.field_g - 1;
              }
              var2_int = (ki.currentKeyboardEventCode + PrefixCodeDecoder.pointerXSnapshot - (-he.pointerPressYSnapshot - kd.field_c)) % 5;
              if (0 != var2_int) {
                if (var2_int != 1) {
                  if (var2_int == 2) {
                    el.field_g = el.field_g - AwtRasterBuffer.field_f;
                    lb.field_b = lb.field_b - 1;
                    if (var3 == 0) {
                      return;
                    }
                  }
                  if (var2_int == 3) {
                    AwtRasterBuffer.field_f = AwtRasterBuffer.field_f + 1;
                    el.field_g = el.field_g + lb.field_b;
                    if (var3 == 0) {
                      return;
                    }
                  }
                  if (var2_int != 4) {
                    return;
                  }
                  el.field_g = el.field_g - lb.field_b;
                  AwtRasterBuffer.field_f = AwtRasterBuffer.field_f - 1;
                  if (var3 == 0) {
                    return;
                  }
                }
                el.field_g = el.field_g + AwtRasterBuffer.field_f;
                lb.field_b = lb.field_b + 1;
                if (var3 == 0) {
                  return;
                }
              }
              dc.field_a = dc.field_a | lb.field_b + el.field_g << 17;
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var2), "c.R(" + param0 + ')');
        }
    }

    private final void b(int param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4_int = 0;
        Object var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = Geoblox.field_C;
        try {
          L0: {
            var3_int = 180;
            SoftwareRasterizer.saveClip(this.field_P);
            if ((param1 != 0) &&
                (1 != param1) &&
                (param1 != 2)) {
              ma.drawNineSlicePanel(140, 30, 80, (byte) -92, 80, ll.frameNineSliceSprites);
              ma.drawNineSlicePanel(242, 30, 80, (byte) -92, 80, ll.frameNineSliceSprites);
              if (var11 == 0) {
                break L0;
              }
            }
            L2: {
              ma.drawNineSlicePanel(140, 30, 80, (byte) -92, 80, ll.frameNineSliceSprites);
              ma.drawNineSlicePanel(242, 30, 80, (byte) -92, 80, ll.frameNineSliceSprites);
              ma.drawNineSlicePanel(345, 30, 80, (byte) -92, 80, ll.frameNineSliceSprites);
              ri.a(70, 180, 29497);
              vf.spriteScratchRaster.setAsRasterTarget();
              SoftwareRasterizer.clearFramebuffer();
              ke.entitySpritesByThemeCategoryAndVariant[1][this.field_X][this.field_L].draw((vf.spriteScratchRaster.fullWidth >> 1) - (ke.entitySpritesByThemeCategoryAndVariant[1][this.field_X][this.field_L].fullWidth >> 1), (vf.spriteScratchRaster.fullHeight >> 1) - (ke.entitySpritesByThemeCategoryAndVariant[1][this.field_X][this.field_L].fullHeight >> 1));
              sh.mainRasterBuffer.setAsRasterTarget(255);
              SoftwareRasterizer.restoreClip(this.field_P);
              SoftwareRasterizer.intersectClip(50, 250, 90, 310);
              vf.spriteScratchRaster.addOutline(1);
              vf.spriteScratchRaster.draw(44, this.field_z + 200);
              SoftwareRasterizer.restoreClip(this.field_P);
              SoftwareRasterizer.intersectClip(40, 355, 93, 415);
              var4_int = 70;
              var5 = 385;
              var6 = (int)(-Math.sin(this.field_A) * (double)this.field_Z + 0.5) + var4_int;
              var7 = (int)(0.5 + Math.cos(this.field_A) * (double)this.field_Z) + var5;
              var8 = (int)(this.field_A / 6.283185307179586 * 65535.0 + 0.5);
              var9 = 2.0943741584421716;
              if (this.field_Z != 15) {
                vf.spriteScratchRaster.setAsRasterTarget();
                SoftwareRasterizer.clearFramebuffer();
                ke.entitySpritesByThemeCategoryAndVariant[1][this.field_X][this.field_L].drawRotatedCentered(vf.spriteScratchRaster.fullWidth >> 1, vf.spriteScratchRaster.fullHeight >> 1, var8, 3072);
                sh.mainRasterBuffer.setAsRasterTarget(255);
                SoftwareRasterizer.restoreClip(this.field_P);
                SoftwareRasterizer.intersectClip(40, 355, 103, 415);
                vf.spriteScratchRaster.addOutline(1);
                vf.spriteScratchRaster.draw(var6 - (vf.spriteScratchRaster.fullWidth >> 1), var7 - (vf.spriteScratchRaster.fullHeight >> 1));
                var8 = (int)(0.5 + 65535.0 * ((this.field_A + var9) / 6.283185307179586));
                var6 = var4_int + (int)(0.5 + -Math.sin(this.field_A + var9) * (double)this.field_Z);
                var7 = (int)(0.5 + Math.cos(this.field_A + var9) * (double)this.field_Z) + var5;
                vf.spriteScratchRaster.setAsRasterTarget();
                SoftwareRasterizer.clearFramebuffer();
                ke.entitySpritesByThemeCategoryAndVariant[1][this.field_X][this.field_L].drawRotatedCentered(vf.spriteScratchRaster.fullWidth >> 1, vf.spriteScratchRaster.fullHeight >> 1, var8, 3072);
                sh.mainRasterBuffer.setAsRasterTarget(255);
                SoftwareRasterizer.restoreClip(this.field_P);
                SoftwareRasterizer.intersectClip(40, 355, 103, 415);
                vf.spriteScratchRaster.addOutline(1);
                vf.spriteScratchRaster.draw(var6 - (vf.spriteScratchRaster.fullWidth >> 1), -(vf.spriteScratchRaster.fullHeight >> 1) + var7);
                var9 = var9 * 2.0;
                var8 = (int)(0.5 + 65535.0 * ((var9 + this.field_A) / 6.283185307179586));
                var6 = (int)(-Math.sin(var9 + this.field_A) * (double)this.field_Z + 0.5) + var4_int;
                var7 = var5 + (int)(Math.cos(var9 + this.field_A) * (double)this.field_Z + 0.5);
                vf.spriteScratchRaster.setAsRasterTarget();
                SoftwareRasterizer.clearFramebuffer();
                ke.entitySpritesByThemeCategoryAndVariant[1][this.field_X][this.field_L].drawRotatedCentered(vf.spriteScratchRaster.fullWidth >> 1, vf.spriteScratchRaster.fullHeight >> 1, var8, 3072);
                sh.mainRasterBuffer.setAsRasterTarget(255);
                SoftwareRasterizer.restoreClip(this.field_P);
                SoftwareRasterizer.intersectClip(40, 355, 103, 415);
                vf.spriteScratchRaster.addOutline(1);
                vf.spriteScratchRaster.draw(var6 - (vf.spriteScratchRaster.fullWidth >> 1), var7 - (vf.spriteScratchRaster.fullHeight >> 1));
                if (var11 == 0) {
                  break L2;
                }
              }
              KeyboardInputListener.field_a.setAsRasterTarget();
              SoftwareRasterizer.clearFramebuffer();
              mi.sparkleFrames[this.field_w].drawScaled(-10 + (KeyboardInputListener.field_a.fullWidth >> 1), (KeyboardInputListener.field_a.fullHeight >> 1) - 10, 20, 20);
              sh.mainRasterBuffer.setAsRasterTarget(255);
              SoftwareRasterizer.restoreClip(this.field_P);
              SoftwareRasterizer.intersectClip(40, 355, 103, 415);
              KeyboardInputListener.field_a.draw(var6 - (KeyboardInputListener.field_a.fullWidth >> 1), var7 - (KeyboardInputListener.field_a.fullWidth >> 1));
              var8 = (int)((this.field_A + var9) / 6.283185307179586 * 65535.0 + 0.5);
              var6 = (int)(-Math.sin(var9 + this.field_A) * (double)this.field_Z + 0.5) + var4_int;
              var7 = var5 + (int)(0.5 + Math.cos(var9 + this.field_A) * (double)this.field_Z);
              KeyboardInputListener.field_a.setAsRasterTarget();
              SoftwareRasterizer.clearFramebuffer();
              mi.sparkleFrames[this.field_w].drawScaled((KeyboardInputListener.field_a.fullWidth >> 1) - 10, (KeyboardInputListener.field_a.fullHeight >> 1) - 10, 20, 20);
              sh.mainRasterBuffer.setAsRasterTarget(255);
              SoftwareRasterizer.restoreClip(this.field_P);
              SoftwareRasterizer.intersectClip(40, 355, 103, 415);
              KeyboardInputListener.field_a.draw(var6 - (KeyboardInputListener.field_a.fullWidth >> 1), -(KeyboardInputListener.field_a.fullWidth >> 1) + var7);
              var9 = var9 * 2.0;
              var8 = (int)(0.5 + (this.field_A + var9) / 6.283185307179586 * 65535.0);
              var6 = (int)(0.5 + -Math.sin(var9 + this.field_A) * (double)this.field_Z) + var4_int;
              var7 = var5 + (int)(Math.cos(this.field_A + var9) * (double)this.field_Z + 0.5);
              KeyboardInputListener.field_a.setAsRasterTarget();
              SoftwareRasterizer.clearFramebuffer();
              mi.sparkleFrames[this.field_w].drawScaled((KeyboardInputListener.field_a.fullWidth >> 1) - 10, -10 + (KeyboardInputListener.field_a.fullHeight >> 1), 20, 20);
              sh.mainRasterBuffer.setAsRasterTarget(255);
              SoftwareRasterizer.restoreClip(this.field_P);
              SoftwareRasterizer.intersectClip(40, 355, 103, 415);
              KeyboardInputListener.field_a.draw(var6 - (KeyboardInputListener.field_a.fullWidth >> 1), var7 - (KeyboardInputListener.field_a.fullWidth >> 1));
            }
            SoftwareRasterizer.restoreClip(this.field_P);
          }
          L4: {
            ma.drawNineSlicePanel(140, 550, 40, (byte) -92, 60, ll.frameNineSliceSprites);
            dd.uiPaletteFont.drawCenteredText(param1 + 1 + "/5", 580, 170, 0, -1);
            var4 = null;
            var5 = 155;
            var6 = param1;
            if (var6 == 0) {
              dd.uiPaletteFont.drawText(a.field_a[0], var5, var3_int, 0, -1);
              var4 = ec.field_e[0];
              dd.uiPaletteFont.drawText(a.field_a[1], var5, var3_int + 110, 0, -1);
            } else {
              if ((1 == var6) &&
                  (var11 == 0)) {
                dd.uiPaletteFont.drawText(a.field_a[2], var5, var3_int, 0, -1);
                var4 = ec.field_e[1];
                break L4;
              }
              if (var6 == 2) {
                dd.uiPaletteFont.drawText(a.field_a[3], var5, var3_int, 0, -1);
                var4 = ec.field_e[2];
              } else {
                if (var6 == 3) {
                  vf.spriteScratchRaster.setAsRasterTarget();
                  SoftwareRasterizer.clearFramebuffer();
                  MenuScreen.amorphousFramesByThemeAndVariant[1][this.field_L][this.field_w].draw(-(MenuScreen.amorphousFramesByThemeAndVariant[1][this.field_L][this.field_w].fullWidth >> 1) + (vf.spriteScratchRaster.fullWidth >> 1), (vf.spriteScratchRaster.fullHeight >> 1) - (MenuScreen.amorphousFramesByThemeAndVariant[1][this.field_L][this.field_w].fullHeight >> 1));
                  sh.mainRasterBuffer.setAsRasterTarget(255);
                  SoftwareRasterizer.restoreClip(this.field_P);
                  vf.spriteScratchRaster.draw(70 - (vf.spriteScratchRaster.fullWidth >> 1), -(vf.spriteScratchRaster.fullHeight >> 1) + 180);
                  vf.spriteScratchRaster.setAsRasterTarget();
                  SoftwareRasterizer.clearFramebuffer();
                  s.geometrySpritesByThemeAndCategory[1][this.field_X].drawGrayModulated((vf.spriteScratchRaster.fullWidth >> 1) - (s.geometrySpritesByThemeAndCategory[1][this.field_X].fullWidth >> 1), (vf.spriteScratchRaster.fullHeight >> 1) - (s.geometrySpritesByThemeAndCategory[1][this.field_X].fullHeight >> 1), this.field_N);
                  sh.mainRasterBuffer.setAsRasterTarget(255);
                  SoftwareRasterizer.restoreClip(this.field_P);
                  vf.spriteScratchRaster.addOutline(1);
                  vf.spriteScratchRaster.draw(70 - (vf.spriteScratchRaster.fullWidth >> 1), 282 - (vf.spriteScratchRaster.fullHeight >> 1));
                  dd.uiPaletteFont.drawText(a.field_a[4], var5, var3_int, 0, -1);
                  var4 = ec.field_e[3];
                } else {
                  if (4 == var6) {
                    vf.spriteScratchRaster.setAsRasterTarget();
                    SoftwareRasterizer.clearFramebuffer();
                    fc.blackOrbFrames[this.field_w].draw(-(fc.blackOrbFrames[this.field_w].fullWidth >> 1) + (vf.spriteScratchRaster.fullWidth >> 1), -(fc.blackOrbFrames[this.field_w].fullHeight >> 1) + (vf.spriteScratchRaster.fullHeight >> 1));
                    k.a(0, 0, vf.spriteScratchRaster.fullWidth, -27085, vf.spriteScratchRaster.fullHeight);
                    sh.mainRasterBuffer.setAsRasterTarget(255);
                    SoftwareRasterizer.restoreClip(this.field_P);
                    vf.spriteScratchRaster.draw(70 - (vf.spriteScratchRaster.fullWidth >> 1), 180 - (vf.spriteScratchRaster.fullHeight >> 1));
                    vf.spriteScratchRaster.setAsRasterTarget();
                    SoftwareRasterizer.clearFramebuffer();
                    if (this.field_B >= 4) {
                      this.field_B = 0;
                    }
                    hb.silverStarFrames[this.field_B].draw(-(hb.silverStarFrames[this.field_B].fullWidth >> 1) + (vf.spriteScratchRaster.fullWidth >> 1), (vf.spriteScratchRaster.fullHeight >> 1) - (hb.silverStarFrames[this.field_B].fullHeight >> 1));
                    k.a(0, 0, vf.spriteScratchRaster.fullWidth, -27085, vf.spriteScratchRaster.fullHeight);
                    sh.mainRasterBuffer.setAsRasterTarget(255);
                    SoftwareRasterizer.restoreClip(this.field_P);
                    vf.spriteScratchRaster.draw(70 - (vf.spriteScratchRaster.fullWidth >> 1), -(vf.spriteScratchRaster.fullHeight >> 1) + 282);
                    dd.uiPaletteFont.drawText(a.field_a[5], var5, var3_int, 0, -1);
                    var4 = ec.field_e[4];
                  }
                }
              }
            }
          }
          var6 = fi.smallFont.maxAscent + fi.smallFont.maxDescent;
          if (param0 > -14) {
            this.handleMenuPointer(-3, -61, false, -67, true, 116);
          }
          var7 = 355;
          var3_int = var3_int + fi.smallFont.drawParagraph((String) (var4), var5, var3_int, var7, 300, 0, -1, 0, 0, 16) * var6;
          SoftwareRasterizer.restoreClip(this.field_P);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "c.B(" + param0 + ',' + param1 + ')');
        }
    }

    final void handleMenuPointer(int itemIndex, int pointerX, boolean initialClick, int rowOffsetY, boolean heldRepeat, int pointerButton) {
        RuntimeException decompiledCaughtException = null;
        int actionId = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = Geoblox.field_C;
        try {
          if (initialClick) {
            this.field_q = -45;
          }
          L2: {
            actionId = InstrumentEnvelope.menuActionIds[this.screenId][itemIndex];
            var8 = actionId;
            if (var8 == 8) {
              L4: {
                pointerX -= 280;
                if (pointerX > 0) {
                  if (pointerX < NetworkArchiveRequest.barSprite.fullWidth) {
                    j.field_gb = 80 * pointerX / NetworkArchiveRequest.barSprite.fullWidth;
                    if (var9 == 0) {
                      break L4;
                    }
                  }
                  j.field_gb = 80;
                  if (var9 == 0) {
                    break L4;
                  }
                }
                j.field_gb = 0;
              }
              this.previewMusicVolume(0);
              if (var9 == 0) {
                return;
              }
            } else {
              if (var8 != 9) {
                break L2;
              }
            }
            pointerX -= 280;
            if (pointerX <= 0) {
              wg.a(-15346, 0);
              if (var9 == 0) {
                return;
              }
            }
            if (~NetworkArchiveRequest.barSprite.fullWidth < ~pointerX) {
              wg.a(-15346, 80 * pointerX / NetworkArchiveRequest.barSprite.fullWidth);
              if (var9 == 0) {
                return;
              }
            }
            wg.a(-15346, 80);
            if (var9 == 0) {
              return;
            }
          }
          if (!heldRepeat) {
            super.handleMenuPointer(itemIndex, pointerX, initialClick, rowOffsetY, heldRepeat, pointerButton);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var7), "c.G(" + itemIndex + ',' + pointerX + ',' + initialClick + ',' + rowOffsetY + ',' + heldRepeat + ',' + pointerButton + ')');
        }
    }

    final static char c(int param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3 = 0;
        try {
          var2_int = 255 & param1;
          if (var2_int == 0) {
            throw new IllegalArgumentException("" + Integer.toString(var2_int, 16));
          }
          if ((var2_int >= 128) &&
              (160 > var2_int)) {
            var3 = lf.extendedTextCharacters[-128 + var2_int];
            if (0 == var3) {
              var3 = 63;
            }
            var2_int = var3;
          }
          if (param0 <= 21) {
            GameScreen.d((byte) -112);
          }
          stackIn_16_0 = (char)var2_int;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var2), "c.A(" + param0 + ',' + param1 + ')');
        }
    }

    final void setItemCount(int param0, int itemCount) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != -12831) {
            this.renderMenuItem(true, (byte) 98, -83, 83);
          }
          this.itemCount = itemCount;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var3), "c.J(" + param0 + ',' + itemCount + ')');
        }
    }

    private final void e(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 < 73) {
            this.field_V = 15;
          }
          if ((0 == this.field_T) &&
              (!this.field_H)) {
            L2: {
              if (0 == this.field_F) {
                if (this.keyboardSelectionActive) {
                  if (this.field_q != 4) {
                    break L2;
                  }
                  this.selectedItemIndex = 3;
                  if (Geoblox.field_C == 0) {
                    break L2;
                  }
                }
                this.selectedItemIndex = this.hitTestMenuItem(PrefixCodeDecoder.pointerXSnapshot, ue.pointerYSnapshot, (byte) 54);
              }
            }
            this.field_F = this.field_F + 8;
            if (~(640 + qj.transitionCurtain.height) > ~this.field_F) {
              this.field_E = false;
              this.field_F = 0;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var2), "c.E(" + param0 + ')');
        }
    }

    private final void f(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != 89) {
            return;
          }
          if ((3 == this.screenId) &&
              (!this.field_E)) {
            L1: {
              if ((this.field_q != 4) &&
                  (this.selectedItemIndex == 3)) {
                this.selectedItemIndex = 2;
                if (Geoblox.field_C == 0) {
                  break L1;
                }
              }
              if (this.field_q == 4) {
                if (this.selectedItemIndex == 2) {
                  this.selectedItemIndex = 1;
                }
                if ((oc.previousMenuScreenId == 1) &&
                    (this.selectedItemIndex == 3)) {
                  this.selectedItemIndex = 1;
                }
              }
            }
            if ((this.field_q == 0) &&
                (this.selectedItemIndex == 0)) {
              this.selectedItemIndex = 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var2), "c.F(" + param0 + ')');
        }
    }

    GameScreen(Geoblox param0, int param1) {
        super(InstrumentEnvelope.menuActionIds[param1].length, 140, 500, 140, 40);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_S = false;
        this.field_L = 0;
        this.field_H = false;
        this.field_X = 0;
        this.animationTick = 0;
        this.field_I = 115;
        this.field_P = new int[4];
        this.field_o = -1;
        this.volumePreviewTicks = 0;
        this.field_u = 123;
        this.field_O = 0;
        this.field_F = 0;
        this.field_z = 0;
        this.field_v = true;
        this.field_W = 0;
        try {
          this.screenId = param1;
          this.gameApplet = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = (RuntimeException) (runtimeException);
          stackIn_6_1 = new StringBuilder().append("c.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void previewMusicVolume(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != 0) {
            return;
          }
          if ((null != this.volumePreviewStream) &&
              (!this.volumePreviewStream.isSamplePositionOutOfRange()) &&
              (50 >= this.volumePreviewTicks)) {
            return;
          }
          this.volumePreviewStream = PcmSampleStream.createForPlaybackRate(fl.field_c[8], 100, j.field_gb);
          GameplayEntity.registerAudioStream(false, this.volumePreviewStream);
          this.volumePreviewTicks = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var2), "c.H(" + param0 + ')');
        }
    }

    final void updateTransition(int param0) {
        int fieldTemp$1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          fieldTemp$1 = this.animationTick + 1;
          this.animationTick = this.animationTick + 1;
          if (fieldTemp$1 % 5 == 0) {
            this.field_W = this.field_W + 1;
            this.field_O = this.field_O - 1;
            this.g((byte) -114);
          }
          if ((this.animationTick & 3) == 3) {
            this.field_u = this.field_u - 1;
            this.field_I = this.field_I - 1;
          }
          if (param0 != 16405) {
            this.b(false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var2), "c.K(" + param0 + ')');
        }
    }

    final void activateMenuItem(int itemIndex, byte param1) {
        int stackIn_105_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int actionId = 0;
        int var6_int = 0;
        String[] var6 = null;
        int var7 = 0;
        var7 = Geoblox.field_C;
        try {
          td.playPcmSample(-348, fl.field_c[29]);
          var3_int = 0;
          var4 = 0;
          actionId = InstrumentEnvelope.menuActionIds[this.screenId][itemIndex];
          if (param1 != -2) {
            this.updateTransition(-70);
          }
          L1: {
            var6_int = actionId;
            if ((var6_int == 15) &&
                (var7 == 0)) {
              if (1 == oc.previousMenuScreenId) {
                return;
              }
              var3_int = 1;
            } else if (!((var6_int == 0) &&
                (var7 == 0))) {
              L5: {
                L6: {
                  L7: {
                    L8: {
                      L9: {
                        L10: {
                          L11: {
                            L12: {
                              L13: {
                                L14: {
                                  L15: {
                                    L16: {
                                      L17: {
                                        if ((1 == var6_int) &&
                                            (var7 == 0)) {
                                          ai.requestedScreenId = -1;
                                          if (var7 == 0) {
                                            break L1;
                                          }
                                        } else if (!((var6_int == 2) &&
                                            (var7 == 0))) {
                                          if (var6_int == 3) {
                                            break L17;
                                          }
                                          if ((var6_int == 4) &&
                                              (var7 == 0)) {
                                            break L16;
                                          }
                                          if ((14 == var6_int) &&
                                              (var7 == 0)) {
                                            break L15;
                                          }
                                          if (var6_int == 5) {
                                            break L14;
                                          }
                                          if (var6_int == 13) {
                                            break L13;
                                          }
                                          if ((6 == var6_int) &&
                                              (var7 == 0)) {
                                            break L12;
                                          }
                                          if (var6_int == 7) {
                                            break L11;
                                          }
                                          if (var6_int == 12) {
                                            break L10;
                                          }
                                          if (var6_int == 11) {
                                            break L9;
                                          }
                                          if (var6_int == 10) {
                                            break L8;
                                          }
                                          if ((16 == var6_int) &&
                                              (var7 == 0)) {
                                            break L7;
                                          }
                                          if (var6_int == 17) {
                                            break L6;
                                          }
                                          if (var6_int == 18) {
                                            break L5;
                                          }
                                          break L1;
                                        }
                                        if (!fh.c(-100)) {
                                          ai.requestedScreenId = 2;
                                          if (var7 == 0) {
                                            break L1;
                                          }
                                        }
                                        ai.requestedScreenId = 8;
                                        if (var7 == 0) {
                                          break L1;
                                        }
                                      }
                                      ai.requestedScreenId = 3;
                                      if (var7 == 0) {
                                        break L1;
                                      }
                                    }
                                    if (InstrumentPatch.field_n == null) {
                                      this.field_C = true;
                                    }
                                    if ((!ArchiveCatalog.b(255)) &&
                                        (og.field_n > 0) &&
                                        (sa.a(MenuScreen.field_i, (byte) 37))) {
                                      f.i((byte) -128);
                                    }
                                    this.field_o = 0;
                                    this.pointerInteractionActive = false;
                                    this.activeTicks = 0;
                                    if (var7 == 0) {
                                      break L1;
                                    }
                                  }
                                  InstrumentPatch.field_p = 0;
                                  ug.field_c = 0;
                                  ra.field_d = -2147483648;
                                }
                                if ((2 != this.screenId) &&
                                    (this.screenId != 4) &&
                                    (6 != this.screenId) &&
                                    (oc.previousMenuScreenId == 1)) {
                                  ai.requestedScreenId = 1;
                                  if (var7 == 0) {
                                    break L1;
                                  }
                                }
                                ai.requestedScreenId = 0;
                                if (var7 == 0) {
                                  break L1;
                                }
                              }
                              if (null != el.gameplaySession) {
                                el.gameplaySession.submitScore((byte) -70);
                              }
                              L30: {
                                L31: {
                                  ai.requestedScreenId = -1;
                                  if (this.screenId != 8) {
                                    if ((4 == this.screenId) &&
                                        (null != el.gameplaySession) &&
                                        (el.gameplaySession.newActionCount == 0)) {
                                      break L31;
                                    }
                                    if (this.screenId != 7) {
                                      el.gameplayReturnScreenId = 6;
                                      if (var7 == 0) {
                                        break L30;
                                      }
                                    }
                                    el.gameplayReturnScreenId = 5;
                                    if (var7 == 0) {
                                      break L30;
                                    }
                                  }
                                }
                                el.gameplayReturnScreenId = 2;
                              }
                              cd.gameplayOriginScreenId = this.screenId;
                              if (var7 == 0) {
                                break L1;
                              }
                            }
                            L34: {
                              el.gameplaySession.emitPointsPopup(false);
                              el.gameplaySession.addScore((byte) 127, wa.collectUnfinishedPopupPoints(param1 ^ 25864));
                              el.gameplaySession.addScore((byte) 127, el.gameplaySession.resultBonusPoints);
                              el.gameplaySession.resultBonusPoints = 0;
                              if (fh.c(-114)) {
                                if (!((!el.gameplaySession.tutorialMode) &&
                                      (el.gameplaySession.score == 0) &&
                                      (ug.field_c == 0)) &&
                                    !((el.gameplaySession.tutorialMode) &&
                                      (el.gameplaySession.updateTick < 750))) {
                                  if ((0 == el.gameplaySession.score) &&
                                      (0 == ug.field_c)) {
                                    ai.requestedScreenId = 0;
                                    if (var7 == 0) {
                                      break L34;
                                    }
                                  }
                                  ai.requestedScreenId = 4;
                                  if (var7 == 0) {
                                    break L34;
                                  }
                                }
                                ai.requestedScreenId = 0;
                                if (var7 == 0) {
                                  break L34;
                                }
                              }
                              if ((el.gameplaySession.score == 0) &&
                                  (ug.field_c == 0)) {
                                ai.requestedScreenId = 0;
                                if (var7 == 0) {
                                  break L34;
                                }
                              }
                              el.gameplaySession.submitScore((byte) -70);
                              if (0 < el.gameplaySession.newActionCount) {
                                ai.requestedScreenId = 6;
                                if (var7 == 0) {
                                  break L34;
                                }
                              }
                              ai.requestedScreenId = 2;
                            }
                            fi.a(param1 + 2, ll.field_d);
                            if (var7 == 0) {
                              break L1;
                            }
                          }
                          gf.a(k.c(param1 ^ -125), 62);
                          if (var7 == 0) {
                            break L1;
                          }
                        }
                        if (!((this.field_q < 4) &&
                              (!this.field_E))) {
                          var4 = 1;
                          if (var7 == 0) {
                            break L1;
                          }
                        }
                        this.field_n = this.field_q;
                        this.field_q = this.field_q + 1;
                        this.field_v = true;
                        this.field_E = true;
                        if (var7 == 0) {
                          break L1;
                        }
                      }
                      if (!((this.field_q > 0) &&
                            (!this.field_E))) {
                        var4 = 1;
                        if (var7 == 0) {
                          break L1;
                        }
                      }
                      this.field_n = this.field_q;
                      this.field_E = true;
                      this.field_q = this.field_q - 1;
                      this.field_v = false;
                      if (var7 == 0) {
                        break L1;
                      }
                    }
                    if (fh.c(-112)) {
                      ai.requestedScreenId = 7;
                      if (var7 == 0) {
                        break L1;
                      }
                    }
                    ai.requestedScreenId = 5;
                    if (var7 == 0) {
                      break L1;
                    }
                  }
                  da.field_c = 0;
                  if (var7 == 0) {
                    break L1;
                  }
                }
                da.field_c = 1;
                if (var7 == 0) {
                  break L1;
                }
              }
              da.field_c = 2;
              break L1;
            }
            L47: {
              if (var3_int == 0) {
                if ((fh.c(param1 ^ 107)) &&
                    (kc.field_c == 0)) {
                  var3_int = 1;
                  if (var7 == 0) {
                    break L47;
                  }
                }
                if ((ca.field_f != null) &&
                    (ca.field_f.field_j) &&
                    (ca.field_f.field_k != null)) {
                  var6 = ca.field_f.field_k[1];
                  stackIn_105_0 = (var6[0] != null) ? 0 : 1;
                  var3_int = stackIn_105_0;
                }
              }
            }
            kc.field_c = kc.field_c + 1;
            pg.resetGameplayDifficulty(param1 ^ -9410);
            el.gameplaySession = new GameplaySession(this.gameApplet, var3_int != 0);
            PointerInputListener.a((byte) -39);
            ai.requestedScreenId = -1;
          }
          if (var4 == 0) {
            this.field_H = true;
            a.field_e = -1;
          }
          if (~this.screenId != ~ai.requestedScreenId) {
            if ((this.screenId != 1) &&
                (this.screenId != 0)) {
              return;
            }
            oc.previousMenuScreenId = this.screenId;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var3), "c.L(" + itemIndex + ',' + param1 + ')');
        }
    }

    final void increaseMenuValue(byte param0, int itemIndex) {
        RuntimeException runtimeException = null;
        int actionId = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Geoblox.field_C;
        try {
          L0: {
            actionId = InstrumentEnvelope.menuActionIds[this.screenId][itemIndex];
            if (actionId == 8) {
              if (j.field_gb >= 70) {
                j.field_gb = 80;
                if (var4 == 0) {
                  break L0;
                }
              }
              j.field_gb = j.field_gb + 10;
              if (var4 == 0) {
                break L0;
              }
            } else {
              if (9 != actionId) {
                break L0;
              }
            }
            if (oc.field_c >= 70) {
              wg.a(-15346, 80);
              if (var4 == 0) {
                break L0;
              }
            }
            wg.a(-15346, 10 + oc.field_c);
          }
          if (param0 != 90) {
            this.activeTicks = 120;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "c.V(" + param0 + ',' + itemIndex + ')');
        }
    }

    final void renderMenuItem(boolean selected, byte param1, int itemIndex, int rowY) {
        int stackIn_7_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_98_1 = 0;
        int stackIn_99_2 = 0;
        int stackIn_153_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int actionId = 0;
        String var7 = null;
        PaletteBitmapFont var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = Geoblox.field_C;
        try {
          if (param1 >= -74) {
            return;
          }
          if (this.field_S) {
            stackIn_7_0 = this.field_n;
          } else {
            stackIn_7_0 = this.field_q;
          }
          L1: {
            var5_int = stackIn_7_0;
            if (3 == this.screenId) {
              if ((itemIndex == 0) &&
                  (var5_int == 0)) {
                return;
              }
              if (itemIndex != 2) {
                break L1;
              }
              if (var5_int != 4) {
                break L1;
              }
              return;
            }
          }
          L4: {
            actionId = InstrumentEnvelope.menuActionIds[this.screenId][itemIndex];
            var7 = tl.field_f[actionId];
            if (actionId == 15) {
              if ((var5_int == 4) &&
                  (oc.previousMenuScreenId != 1)) {
                break L4;
              }
              return;
            }
          }
          if ((3 == this.screenId) &&
              (this.field_E) &&
              (this.field_q == 4) &&
              (oc.previousMenuScreenId != 1) &&
              (itemIndex == 2) &&
              (this.selectedItemIndex == 3)) {
            selected = true;
          }
          L7: {
            if (!((this.screenId != 3) &&
                  (this.screenId != 2))) {
              rowY += 280;
              if (var14 == 0) {
                break L7;
              }
            }
            if ((this.screenId != 5) &&
                (this.screenId != 7) &&
                (this.screenId != 6) &&
                (this.screenId != 4)) {
              break L7;
            }
            rowY += 295;
          }
          L11: {
            var8 = dd.uiPaletteFont;
            var9 = 320;
            var10 = 160;
            if (!((0 != this.screenId) &&
                (this.screenId != 1))) {
              var11 = 322;
              if (var14 == 0) {
                break L11;
              }
            }
            var11 = var8.measureMaximumWrappedWidth(var7, 400);
          }
          L14: {
            if ((this.screenId != 3) &&
                (this.screenId != 2) &&
                (this.screenId != 6)) {
              if ((this.screenId != 7) &&
                  (this.screenId != 8)) {
                if (this.screenId != 4) {
                  if (selected) {
                    var9 = var9 + this.field_T;
                    var10 = var10 + this.field_T;
                    rowY = rowY - this.field_T;
                  }
                  var10 = 320 - (var11 + 20 >> 1);
                  stackIn_98_0 = rowY;
                  stackIn_98_1 = var10;
                  if (!selected) {
                    stackIn_99_2 = 0;
                  } else {
                    stackIn_99_2 = this.field_T;
                  }
                  ma.drawNineSlicePanel(stackIn_98_0, stackIn_98_1 + stackIn_99_2, 36, (byte) -92, var11 + 20, eb.mouseBoxFrames);
                  if (var14 == 0) {
                    break L14;
                  }
                }
                L20: {
                  var11 = 278;
                  var10 = 320 - (var11 + 20 >> 1);
                  if (actionId != 13) {
                    rowY = 395;
                    if (var14 == 0) {
                      break L20;
                    }
                  }
                  rowY = 265;
                }
                var9 = 10 + (var11 >> 1) + var10;
                if (selected) {
                  var10 = var10 + this.field_T;
                  rowY = rowY - this.field_T;
                  var9 = var9 + this.field_T;
                }
                ma.drawNineSlicePanel(rowY, var10, 36, (byte) -92, 20 + var11, eb.mouseBoxFrames);
                if (var14 == 0) {
                  break L14;
                }
              }
              L23: {
                rowY = 437;
                if (actionId == 13) {
                  var10 = 121;
                  var9 = (var11 >> 1) + var10 + 10;
                  if (var14 == 0) {
                    break L23;
                  }
                }
                var10 = 436;
                var9 = (var11 >> 1) + var10 + 10;
              }
              if (selected) {
                var9 = var9 + this.field_T;
                rowY = rowY - this.field_T;
                var10 = var10 + this.field_T;
              }
              ma.drawNineSlicePanel(rowY, var10, 36, (byte) -92, var11 + 20, eb.mouseBoxFrames);
              if (var14 == 0) {
                break L14;
              }
            }
            L26: {
              if (this.screenId != 3) {
                var11 = 160;
                if (var14 == 0) {
                  break L26;
                }
              }
              var11 = 123;
            }
            L28: {
              var12 = (rowY + (-280 - this.firstItemY)) / this.itemSpacing;
              var9 = 320 + (var11 + 20) * (var12 - 1);
              var10 = -(var11 >> 1) + var9;
              if (6 == this.screenId) {
                var9 += 86;
                rowY = 430;
                var10 += 86;
                if (var14 == 0) {
                  break L28;
                }
              }
              if (this.screenId == 3) {
                var9 = 9 + (320 + (15 + var11) * (var12 - 1));
                rowY = 430;
                var10 = var9 - (var11 >> 1);
                if (15 != actionId) {
                  break L28;
                }
                var10 -= 138;
                var11 = 229;
                var9 = (var11 >> 1) + var10;
                if (var14 == 0) {
                  break L28;
                }
              }
              rowY = 380;
              if (actionId == 5) {
                var11 = 83;
                var9 = 320;
                rowY += 50;
                var10 = var9 - (var11 >> 1);
              }
            }
            L31: {
              if (!selected) {
                ma.drawNineSlicePanel(rowY, var10, 40, (byte) -92, var11, eb.mouseBoxFrames);
                if (var14 == 0) {
                  break L31;
                }
              }
              var9 = var9 + this.field_T;
              var10 = var10 + this.field_T;
              rowY = rowY - this.field_T;
              ma.drawNineSlicePanel(rowY, var10, 40, (byte) -92, var11, eb.mouseBoxFrames);
            }
            rowY += 2;
          }
          L33: {
            if (selected) {
              dd.uiPaletteFont.colorPalettes[0][wf.field_p] = 15488514;
              var12 = this.field_T;
              if (var14 == 0) {
                break L33;
              }
            }
            var12 = 0;
          }
          L35: {
            if (!((actionId != 8) &&
                  (9 != actionId))) {
              var8.drawRightAlignedText(var7, 285 + var12, 30 + rowY, 0, -1);
              NetworkArchiveRequest.barSprite.draw(var12 + 280, rowY + 15);
              if (actionId == 8) {
                stackIn_153_0 = j.field_gb;
              } else {
                stackIn_153_0 = oc.field_c;
              }
              var13 = stackIn_153_0;
              var13 = var13 * (-4 + NetworkArchiveRequest.barSprite.fullWidth) / 80;
              re.widgetSprite.draw(280 + var13 - 1 + var12, 9 + rowY);
              if (var14 == 0) {
                break L35;
              }
            }
            var8.drawCenteredText(var7, var9, rowY + 30, 0, -1);
          }
          dd.uiPaletteFont.colorPalettes[0][wf.field_p] = 16689938;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var5), "c.O(" + selected + ',' + param1 + ',' + itemIndex + ',' + rowY + ')');
        }
    }

    private final void handleScreenKey(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = Geoblox.field_C;
        try {
          if (param0 != 62) {
            this.field_X = -26;
          }
          if (this.pointerInteractionActive) {
            return;
          }
          L1: {
            L2: {
              if (!this.field_C) {
                if (this.screenId == 0) {
                  break L2;
                }
                if (1 == this.screenId) {
                  break L2;
                }
                if (this.screenId == 4) {
                  break L2;
                }
              }
              L4: {
                if (ki.currentKeyboardEventCode == 96) {
                  if (this.field_C) {
                    if (this.field_o == 0) {
                      break L4;
                    }
                    this.field_o = 0;
                    if (var3 == 0) {
                      break L4;
                    }
                  }
                  if (0 >= this.selectedItemIndex) {
                    this.selectedItemIndex = this.itemCount;
                  }
                  this.selectedItemIndex = this.selectedItemIndex - 1;
                  this.keyboardSelectionActive = true;
                  this.f((byte) 89);
                  if (var3 == 0) {
                    break L4;
                  }
                }
                if (ki.currentKeyboardEventCode != 97) {
                  if ((ki.currentKeyboardEventCode == 98) &&
                      (2 == this.screenId)) {
                    if (this.selectedItemIndex < 0) {
                      this.selectedItemIndex = 3;
                      if (var3 == 0) {
                        break L4;
                      }
                    }
                    if (5 != InstrumentEnvelope.menuActionIds[this.screenId][this.selectedItemIndex]) {
                      break L4;
                    }
                    this.selectedItemIndex = 1;
                    if (var3 == 0) {
                      break L4;
                    }
                  }
                  if (ki.currentKeyboardEventCode != 99) {
                    break L4;
                  }
                  if (this.screenId != 2) {
                    break L4;
                  }
                  if (this.selectedItemIndex < 0) {
                    this.selectedItemIndex = 1;
                    if (var3 == 0) {
                      break L4;
                    }
                  }
                  if (InstrumentEnvelope.menuActionIds[this.screenId][this.selectedItemIndex] == 5) {
                    break L4;
                  }
                  this.selectedItemIndex = 3;
                  if (var3 == 0) {
                    break L4;
                  }
                }
                if (this.field_C) {
                  if (this.field_o == 1) {
                    break L4;
                  }
                  if ((!fh.c(-122)) &&
                      (og.field_n <= 0)) {
                    break L4;
                  }
                  this.field_o = 1;
                  if (var3 == 0) {
                    break L4;
                  }
                }
                this.selectedItemIndex = this.selectedItemIndex + 1;
                this.keyboardSelectionActive = true;
                if (this.itemCount <= this.selectedItemIndex) {
                  this.selectedItemIndex = 0;
                }
                this.c((byte) -117);
              }
              if (0 > this.selectedItemIndex) {
                break L1;
              }
              this.handleMenuKey(this.selectedItemIndex, -49);
              if (var3 == 0) {
                break L1;
              }
            }
            if (ki.currentKeyboardEventCode == 98) {
              if (0 >= this.selectedItemIndex) {
                this.selectedItemIndex = this.itemCount;
              }
              this.selectedItemIndex = this.selectedItemIndex - 1;
              this.keyboardSelectionActive = true;
              this.f((byte) 89);
              if (var3 == 0) {
                break L1;
              }
            }
            if (ki.currentKeyboardEventCode == 99) {
              this.selectedItemIndex = this.selectedItemIndex + 1;
              if (this.selectedItemIndex >= this.itemCount) {
                this.selectedItemIndex = 0;
              }
              this.keyboardSelectionActive = true;
              this.c((byte) -107);
              if (var3 == 0) {
                break L1;
              }
            }
            if (0 <= this.selectedItemIndex) {
              this.handleMenuKey(this.selectedItemIndex, -29);
            }
          }
          if ((ki.currentKeyboardEventCode == 69) &&
              (this.screenId == 3) &&
              (this.field_q < 4)) {
            this.field_q = this.field_q + 1;
            if (var3 == 0) {
              return;
            }
          }
          if ((ki.currentKeyboardEventCode == 41) &&
              (this.screenId == 3) &&
              (this.field_q > 0)) {
            this.field_q = this.field_q - 1;
            if (var3 == 0) {
              return;
            }
          }
          if ((13 == ki.currentKeyboardEventCode) &&
              (!this.field_C) &&
              (4 != this.screenId)) {
            L22: {
              if (this.screenId == 1) {
                ai.requestedScreenId = -1;
                if (var3 == 0) {
                  break L22;
                }
              }
              if ((this.screenId != 6) &&
                  (this.screenId != 2)) {
                ai.requestedScreenId = oc.previousMenuScreenId;
                if (var3 == 0) {
                  break L22;
                }
              }
              ai.requestedScreenId = 0;
            }
            if (~this.screenId != ~ai.requestedScreenId) {
              if ((this.screenId != 1) &&
                  (this.screenId != 0)) {
                return;
              }
              oc.previousMenuScreenId = this.screenId;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var2), "c.D(" + param0 + ')');
        }
    }

    static {
        quickChatShortcutHelpTexts = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        selectedThemeId = 0;
        createNameLeadingSpaceAlertText = "Names cannot start or end with space or underscore";
    }
}
