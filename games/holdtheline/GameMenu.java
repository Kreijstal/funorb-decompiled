/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameMenu extends MenuList {
    static HuffmanDecoder field_u;
    private int menuId;
    private int closeDelayTicks;
    private int[] itemAnimationTimers;
    float carouselOffset;
    private int field_v;
    int transitionState;
    private int enterTicks;
    int targetCarouselOffset;
    static ll field_x;
    private int exitTicks;
    static int field_z;

    final void draw(int param0) {
        boolean stackIn_16_3 = false;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        int stackIn_87_0 = 0;
        int stackIn_98_0 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        Sprite var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var13 = null;
        int var8Lifetime1;
        var9 = HoldTheLine.field_D;
        if (param0 != -55) {
          return;
        }
        var2 = 50 - this.enterTicks;
        if (this.transitionState == 2) {
          var2 = -(this.itemCount * 5) + (this.exitTicks + 25);
        }
        if (var2 < 0) {
          var2 = 0;
        }
        var3 = (int)((double)we.field_n * (-Math.exp((double)((float)var2 * 0.20000000298023224f)) + 1.0));
        if (this.transitionState > 2) {
          var3 = 640;
        }
        boolean decompiledFrameRemainder0 = true;
        boolean decompiledFrameCompleted0 = true;
        if (this.menuId != 12) {
          var4 = 0;
          while (this.itemCount > var4) {
            stackIn_51_1 = this.getItemY(var4, -125);
            stackIn_51_2 = var4;
            if (var9 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
            stackIn_16_3 = (~this.selectedItem == ~var4);
            this.drawItem(stackIn_51_1, stackIn_51_2, stackIn_16_3, (byte) -116);
            var4++;
          }
          if ((decompiledFrameCompleted0) &&
            (var9 != 0)) {
            this.enterMenuTransition(var3, false);
          }
        } else {
          this.enterMenuTransition(var3, false);
        }
        if (decompiledFrameCompleted0) {
          if (this.menuId != 2) {
            if (this.menuId == 3) {
              this.drawChampionshipSelection(true, var3);
              decompiledFrameRemainder0 = (var9 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (this.menuId == 4) {
                this.drawHelpCarousel(var3, -11468);
                decompiledFrameRemainder0 = (var9 != 0);
              }
              if (decompiledFrameRemainder0) {
                if (this.menuId != 5) {
                  if (6 == this.menuId) {
                    this.drawAchievementBrowser(45, var3);
                    decompiledFrameRemainder0 = (var9 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    if (this.menuId == 9) {
                      this.drawLoginRequiredMessage(29280);
                      decompiledFrameRemainder0 = (var9 != 0);
                    }
                    if (decompiledFrameRemainder0) {
                      if (this.menuId == 7) {
                        this.drawAchievements((byte) -18);
                        decompiledFrameRemainder0 = (var9 != 0);
                      }
                      if (decompiledFrameRemainder0) {
                        if (8 != this.menuId) {
                          if (this.menuId == 10) {
                            if (480.0f != this.carouselOffset) {
                              this.drawRaceResults(12);
                            }
                            decompiledFrameRemainder0 = (0.0f != this.carouselOffset);
                            if (decompiledFrameRemainder0) {
                              this.drawRacePreviewPanel(param0 - 10912);
                              decompiledFrameRemainder0 = (var9 != 0);
                            }
                          }
                          if ((decompiledFrameRemainder0) &&
                            (decompiledFrameRemainder0 = (this.menuId == 11))) {
                            this.drawRaceResults(12);
                            decompiledFrameRemainder0 = (var9 != 0);
                          }
                        }
                        if (decompiledFrameRemainder0) {
                          this.drawAchievements((byte) -18);
                          decompiledFrameRemainder0 = (var9 != 0);
                        }
                      }
                    }
                  }
                }
                if (decompiledFrameRemainder0) {
                  this.drawHelpCarousel(var3, -11468);
                  decompiledFrameRemainder0 = (var9 != 0);
                }
              }
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_51_1 = 1;
            stackIn_51_2 = var3;
          }
        }
        if (decompiledFrameRemainder0) {
          this.drawChampionshipSelection(stackIn_51_1 != 0, stackIn_51_2);
        }
        if (this.menuId != 0 &&
          this.menuId != 12 &&
          this.transitionState <= 2) {
          var4 = 0;
          var5_int = 8;
          if (10 == this.menuId) {
            var5_int = var5_int - (int)this.carouselOffset;
          }
          if (this.transitionState == 2) {
            var6 = -(this.itemCount * 5) - 5 + (25 + this.exitTicks);
            var4 = (int)((double)we.field_n * (1.0 - Math.exp((double)(0.20000000298023224f * (float)var6))));
          }
          BlobWriteRequest.drawTitleBar(SocketConnector.field_g[this.menuId].toUpperCase(), var4, 5, param0 - 1698, var5_int);
        }
        if (this.menuId == 0) {
          var4 = -140 + this.top;
          if (this.transitionState == 0) {
            var5_int = -this.enterTicks + 50;
            var4 = var4 - (int)((double)this.top * Math.exp((double)(0.20000000298023224f * (float)var5_int)));
          }
          if (this.transitionState == 3) {
            var4 = (int)((double)this.top * (Math.exp((double)(0.20000000298023224f * (float)(40 - this.closeDelayTicks))) - 1.0) / (-1.0 + Math.exp(8.0))) - 140;
          }
          SoftwareRasterizer.fillRectangleAlpha(0, var4 + 100, 640, 5, 0, 128);
          var5 = ValidationState.field_e.getSprite(8192);
          if (var5 != null) {
            var13 = new int[4];
            SoftwareRasterizer.saveClip(var13);
            SoftwareRasterizer.intersectClip(0, var4, 640, var4 + 100);
            var7 = 0;
            do {
              if (var7 >= 11) {
                SoftwareRasterizer.restoreClip(var13);
                SoftwareRasterizer.drawHorizontalLine(0, -1 + var4, 640, 0);
                break;
              }
              ValidationState.field_e.getSprite(8192).drawUnkeyed(60 * var7, var4);
              ValidationState.field_e.getSprite(param0 ^ -8247).drawUnkeyed(60 * var7, 60 + var4);
              var7++;
            } while (var9 == 0);
            var7 = 0;
            scanLoop1: while (true) {
              if (var7 < 11) {
                SoftwareRasterizer.drawHorizontalLine(-16 + 64 * var7, var4, 32, 16777215);
                SoftwareRasterizer.drawHorizontalLine(16 + 64 * var7, var4, 32, 16711680);
                stackIn_87_0 = 0;
                if (var9 != 0) {
                  break scanLoop1;
                }
                var8 = stackIn_87_0;
                while (var8 < 6) {
                  SoftwareRasterizer.drawHorizontalLine(-17 + 64 * var7, var8 + var4 + 1, 32, 14737632);
                  SoftwareRasterizer.drawHorizontalLine(15 + var7 * 64, 1 + var4 + var8, 32, 14680064);
                  var8++;
                }
                SoftwareRasterizer.drawHorizontalLine(64 * var7 - 16, 7 + var4, 32, 8421504);
                SoftwareRasterizer.drawHorizontalLine(16 + 64 * var7, 7 + var4, 32, 8388608);
                var7++;
                continue;
              }
              SoftwareRasterizer.drawHorizontalLine(0, var4 + 8, 640, 0);
              SoftwareRasterizer.drawHorizontalLine(0, 90 + var4, 640, 0);
              stackIn_87_0 = 0;
              break;
            }
            var7 = stackIn_87_0;
            scanLoop2: while (true) {
              if (var7 < 11) {
                SoftwareRasterizer.drawHorizontalLine(var7 * 64, 91 + var4, 32, 16777215);
                SoftwareRasterizer.drawHorizontalLine(var7 * 64 + 32, var4 + 91, 32, 16711680);
                stackIn_98_0 = 0;
                if (var9 != 0) {
                  break scanLoop2;
                }
                var8Lifetime1 = stackIn_98_0;
                while (var8Lifetime1 < 6) {
                  SoftwareRasterizer.drawHorizontalLine(var7 * 64 - 1, 92 + (var4 + var8Lifetime1), 32, 14737632);
                  SoftwareRasterizer.drawHorizontalLine(31 + var7 * 64, 92 + var4 + var8Lifetime1, 32, 14680064);
                  var8Lifetime1++;
                }
                SoftwareRasterizer.drawHorizontalLine(var7 * 64, 98 + var4, 32, 8421504);
                SoftwareRasterizer.drawHorizontalLine(var7 * 64 + 32, 98 + var4, 32, 8388608);
                var7++;
                continue;
              }
              stackIn_98_0 = 0;
              break;
            }
            SoftwareRasterizer.drawHorizontalLine(stackIn_98_0, var4 + 99, 640, 0);
          }
          uk.field_a.drawAlpha(207, -15 + var4, 128);
          IterableNodeHashTable.field_b.draw(202, -20 + var4);
        }
        oi.a(param0 ^ -56, this.menuId);
        return;
    }

    private final void drawHelpPage(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_37_0 = 0;
        var8 = HoldTheLine.field_D;
        TutorialAction.a(-param2 + 40, 102, 560, (byte) 41, 312);
        if (param1 != 0) {
          this.draw(-4);
        }
        regionExit1: {
          regionExit2: {
            regionExit3: {
              regionExit4: {
                var4 = 132;
                q.drawCenteredTextWithHighlight(TextHotspotRange.field_i[param0], HoldTheLine.field_F, 2, -param2 + 320, (byte) -127, var4);
                var4 += 40;
                var5 = ImageProducerRasterBuffer.field_m % 180 / 5;
                var6 = param0;
                regionExit5: switch ((var8 == 0
                  || var6 == 0
                  || var6 == 2
                  || var6 == 3
                  || var6 == 6
                  ) ? var6 : -1) {
                  case 0:
                    Vector2i.a(20, DiskCacheStore.field_f, 0, 0, 560, var4 - 20, 40 - param2, 414 - var4, -1, 1, HoldTheLine.field_F);
                    var4 += 120;
                    q.drawCenteredTextWithHighlight(LinkWidgetRenderer.field_c, HoldTheLine.field_F, 2, -param2 + 320, (byte) -127, var4);
                    var4 += 30;
                    LinkWidgetRenderer.a(310 - param2, Point2i.field_a, true, HoldTheLine.field_F, var4, 1);
                    var4 += 20;
                    LinkWidgetRenderer.a(-param2 + 310, LoadProgressDialog.field_fb, true, HoldTheLine.field_F, var4, 1);
                    var4 += 20;
                    LinkWidgetRenderer.a(310 - param2, fk.field_a, true, HoldTheLine.field_F, var4, 1);
                    var4 += 20;
                    LinkWidgetRenderer.a(310 - param2, GameKeyHandler.field_c, true, HoldTheLine.field_F, var4, 1);
                    var4 += 20;
                    LinkWidgetRenderer.a(-param2 + 310, NameCheckProgressDialog.field_xb, true, HoldTheLine.field_F, var4, 1);
                    var4 -= 80;
                    GrowableObjectList.a(-param2 + 320, 1, b.field_a, 0, var4, HoldTheLine.field_F);
                    var4 += 20;
                    GrowableObjectList.a(-param2 + 320, param1 ^ 1, WhirlpoolHasher.field_i, 0, var4, HoldTheLine.field_F);
                    var4 += 20;
                    GrowableObjectList.a(320 - param2, 1, NameSuggestionsPanel.field_H, 0, var4, HoldTheLine.field_F);
                    var4 += 20;
                    GrowableObjectList.a(320 - param2, 1, StrongCacheEntry.field_t, 0, var4, HoldTheLine.field_F);
                    var4 += 20;
                    GrowableObjectList.a(320 - param2, param1 + 1, kc.field_c, 0, var4, HoldTheLine.field_F);
                    var4 += 20;
                    if (var8 == 0) {
                      break regionExit1;
                    }
                  case 1:
                    Vector2i.a(20, LoginForm.field_L, 0, 0, 560, -20 + var4, 40 - param2, -var4 + 414, -1, 1, HoldTheLine.field_F);
                    if (var8 == 0) {
                      break regionExit2;
                    }
                  case 2:
                    Vector2i.a(20, ImageProducerRasterBuffer.field_k, 0, 0, 560, -20 + var4, 40 - param2, 414 - var4, -1, 1, HoldTheLine.field_F);
                    var4 += 185;
                    var6 = 0;
                    {
                      while (true) {
                        if (var6 < 3) {
                          oi.field_a.drawUnkeyed(-(20 * var6) + 168 - param2, -20 + var4 + 5);
                          oi.field_a.drawUnkeyed(-(var6 * 20) + 408 - param2, -20 + (var4 + 5));
                          oi.field_a.drawUnkeyed(-param2 + (168 - var6 * 20), 10 + (var4 + 5));
                          oi.field_a.drawUnkeyed(408 - (param2 + 20 * var6), var4 + 10 + 5);
                          BoundaryIntersection.field_k.getSpriteOrPlaceholder(16, var5, 9, 16).draw(-(var6 * 20) + (-param2 + 170), -20 + (var4 + 7));
                          LoginChoicePanel.field_O.getSpriteOrPlaceholder(16, var5, param1 ^ 9, 16).draw(-param2 + 410 - var6 * 20, 7 + var4 - 20);
                          na.field_q.getSpriteOrPlaceholder(16, var5, 9, 16).draw(-(var6 * 20) - param2 + 170, 10 + (var4 + 7));
                          StrongCacheEntry.field_u.getSpriteOrPlaceholder(16, var5, param1 + 9, 16).draw(-param2 + 410 - var6 * 20, 10 + (var4 + 7));
                          var6++;
                          if (var8 == 0) {
                            continue;
                          }
                        } else {
                          GrowableObjectList.a(200 - param2, param1 + 1, IsaacRandom.field_k, 0, var4, HoldTheLine.field_F);
                          GrowableObjectList.a(-param2 + 440, 1, ResourceArchive.field_h, 0, var4, HoldTheLine.field_F);
                          var4 += 30;
                          GrowableObjectList.a(200 - param2, 1, AudioServiceThread.field_a, 0, var4, HoldTheLine.field_F);
                          GrowableObjectList.a(440 - param2, 1, HoldTheLine.field_B, 0, var4, HoldTheLine.field_F);
                          var4 += 30;
                        }
                        break;
                      }
                      if (var8 == 0) {
                        break regionExit2;
                      }
                    }
                  case 3:
                    Vector2i.a(20, MusicPatchEnvelope.field_k, 0, 0, 560, var4 - 20, -param2 + 40, -var4 + 414, -1, 1, HoldTheLine.field_F);
                    var4 += 25;
                    var6 = 1;
                    {
                      scanLoop6: while (true) {
                        if (4 > var6) {
                          stackIn_37_0 = 0;
                          if (var8 != 0) {
                            break scanLoop6;
                          }
                          var7 = stackIn_37_0;
                          while (var6 > var7) {
                            oi.field_a.drawUnkeyed(-param2 + 93 - var7 * 20, var4 + (-20 - (-5 - 20 * var6)));
                            oi.field_a.drawUnkeyed(-param2 + (383 - var7 * 20), -20 + var4 - (-5 - 20 * var6));
                            oi.field_a.drawUnkeyed(288 - param2 - var7 * 20, 20 * var6 + (60 + var4 + 5));
                            BoundaryIntersection.field_k.getSpriteOrPlaceholder(16, var5, 9, 16).draw(-(20 * var7) + (95 - param2), 20 * var6 + (var4 - 20 + 7));
                            LoginChoicePanel.field_O.getSpriteOrPlaceholder(16, var5, 9, 16).draw(-param2 + (385 - 20 * var7), 7 + (-20 + var4) + 20 * var6);
                            na.field_q.getSpriteOrPlaceholder(16, var5, param1 ^ 9, 16).draw(290 - param2 - 20 * var7, var6 * 20 + var4 + 60 + 7);
                            var7++;
                          }
                          var6++;
                          continue scanLoop6;
                        }
                        var4 += 20;
                        GrowableObjectList.a(125 - param2, 1, AccountTermsPanel.field_J, 0, var4, HoldTheLine.field_F);
                        GrowableObjectList.a(-param2 + 415, 1, uk.field_f, 0, var4, HoldTheLine.field_F);
                        var4 += 20;
                        GrowableObjectList.a(-param2 + 125, 1, LoginForm.field_K, 0, var4, HoldTheLine.field_F);
                        GrowableObjectList.a(-param2 + 415, param1 + 1, UiTheme.field_h, 0, var4, HoldTheLine.field_F);
                        var4 += 20;
                        GrowableObjectList.a(-param2 + 125, 1, NamedSoundEffect.field_o, 0, var4, HoldTheLine.field_F);
                        GrowableObjectList.a(-param2 + 415, 1, RaceWorld.field_K, 0, var4, HoldTheLine.field_F);
                        var4 += 40;
                        GrowableObjectList.a(320 - param2, 1, wl.field_e, 0, var4, HoldTheLine.field_F);
                        var4 += 20;
                        GrowableObjectList.a(-param2 + 320, 1, LoginCredentialType.field_d, 0, var4, HoldTheLine.field_F);
                        var4 += 20;
                        GrowableObjectList.a(320 - param2, 1, ArcTrackBoundary.field_v, 0, var4, HoldTheLine.field_F);
                        var4 += 40;
                        stackIn_37_0 = 20;
                        break;
                      }
                      Vector2i.a(stackIn_37_0, NanoTickClock.field_o, 0, 0, 560, -20 + var4, 40 - param2, -var4 + 414, param1 - 1, 1, HoldTheLine.field_F);
                      if (var8 == 0) {
                        break regionExit2;
                      }
                      break regionExit5;
                    }
                  case 4:
                    break;
                  default:
                    break regionExit1;
                  case 5:
                    break regionExit4;
                  case 6:
                    break regionExit3;
                }
                Vector2i.a(20, DelayedServerPacket.field_p, 0, 0, 560, -20 + var4, -param2 + 40, 414 - var4, -1, 1, HoldTheLine.field_F);
                var4 += 40;
                Vector2i.a(20, IntrusiveNode.field_e, 0, 0, 560, -20 + var4, -param2 + 40, 414 - var4, -1, 1, HoldTheLine.field_F);
                var4 += 80;
                Vector2i.a(20, Vector2i.field_b, 0, 0, 560, var4 - 20, 40 - param2, -var4 + 414, -1, 1, HoldTheLine.field_F);
                var4 += 60;
                Vector2i.a(20, SingleChildWidget.field_D, 0, 0, 560, -20 + var4, 40 - param2, 414 - var4, -1, 1, HoldTheLine.field_F);
                var4 += 60;
                if (var8 == 0) {
                  break regionExit2;
                }
              }
              Vector2i.a(20, TutorialPage.field_n, 0, 0, 560, var4 - 20, -param2 + 40, -var4 + 414, ~param1, 1, HoldTheLine.field_F);
              var4 += 80;
              q.drawCenteredTextWithHighlight(hc.field_a, HoldTheLine.field_F, 2, 160 - param2, (byte) -127, var4);
              q.drawCenteredTextWithHighlight(o.field_a, HoldTheLine.field_F, 2, 480 - param2, (byte) -128, var4);
              var4 += 20;
              q.drawCenteredTextWithHighlight(IconToggleRenderer.field_a, HoldTheLine.field_F, 2, -param2 + 160, (byte) -128, var4);
              q.drawCenteredTextWithHighlight(IterableNodeHashTable.field_f, HoldTheLine.field_F, 2, 480 - param2, (byte) -128, var4);
              q.drawCenteredTextWithHighlight(m.field_b, HoldTheLine.field_F, 1, -param2 + 320, (byte) -127, var4);
              var4 += 40;
              LinkWidgetRenderer.a(-param2 + 200, Point2i.field_a, true, HoldTheLine.field_F, var4, 1);
              var4 += 20;
              LinkWidgetRenderer.a(-param2 + 200, LoadProgressDialog.field_fb, true, HoldTheLine.field_F, var4, 1);
              var4 += 20;
              LinkWidgetRenderer.a(-param2 + 200, fk.field_a, true, HoldTheLine.field_F, var4, 1);
              var4 += 20;
              LinkWidgetRenderer.a(-param2 + 200, GameKeyHandler.field_c, true, HoldTheLine.field_F, var4, 1);
              var4 += 20;
              LinkWidgetRenderer.a(200 - param2, NetworkArchiveRequest.field_A, true, HoldTheLine.field_F, var4, 1);
              var4 -= 80;
              GrowableObjectList.a(440 - param2, 1, LabeledField.field_H, 1, var4, HoldTheLine.field_F);
              var4 += 20;
              GrowableObjectList.a(-param2 + 440, param1 ^ 1, IndexedSpriteState.field_f, 1, var4, HoldTheLine.field_F);
              var4 += 20;
              GrowableObjectList.a(-param2 + 440, 1, RoadFillRenderer.field_e, 1, var4, HoldTheLine.field_F);
              var4 += 20;
              GrowableObjectList.a(-param2 + 440, 1, ka.field_a, 1, var4, HoldTheLine.field_F);
              var4 += 20;
              GrowableObjectList.a(-param2 + 440, param1 ^ 1, jh.field_b, 1, var4, HoldTheLine.field_F);
              var4 -= 80;
              q.drawCenteredTextWithHighlight(b.field_a, HoldTheLine.field_F, 0, -param2 + 320, (byte) -128, var4);
              var4 += 20;
              q.drawCenteredTextWithHighlight(WhirlpoolHasher.field_i, HoldTheLine.field_F, 0, 320 - param2, (byte) -127, var4);
              var4 += 20;
              q.drawCenteredTextWithHighlight(NameSuggestionsPanel.field_H, HoldTheLine.field_F, 0, 320 - param2, (byte) -127, var4);
              var4 += 20;
              q.drawCenteredTextWithHighlight(StrongCacheEntry.field_t, HoldTheLine.field_F, 0, 320 - param2, (byte) -127, var4);
              var4 += 20;
              q.drawCenteredTextWithHighlight(kc.field_c, HoldTheLine.field_F, 0, 320 - param2, (byte) -127, var4);
              var4 += 20;
              if (var8 == 0) {
                break regionExit2;
              }
            }
            Vector2i.a(20, AccountFormText.field_f, 0, 0, 560, -20 + var4, 40 - param2, -var4 + 414, param1 - 1, 1, HoldTheLine.field_F);
          }
        }
    }

    final void handleItemKey(int param0, int param1) {
        int var3;
        int var4;
        boolean decompiledFrameRemainder1 = true;
        boolean decompiledFrameRemainder0 = true;
        var4 = HoldTheLine.field_D;
        var3 = AgeValidator.field_i[this.menuId][param0];
        if (18 == var3) {
          if (DelayedServerPacket.field_n == 102) {
            SecondaryNodeDeque.field_d = 0;
            decompiledFrameRemainder1 = (var4 != 0);
          }
          if (decompiledFrameRemainder1) {
            if ((DelayedServerPacket.field_n == 103) &&
              (decompiledFrameRemainder1 = !(256 <= SecondaryNodeDeque.field_d))) {
              SecondaryNodeDeque.field_d = 256;
              MatchingTextValidator.a(293, StrongCacheEntry.field_r);
              decompiledFrameRemainder1 = (var4 != 0);
            }
            if (decompiledFrameRemainder1) {
              super.handleItemKey(param0, -24489);
              decompiledFrameRemainder1 = (var4 != 0);
            }
          }
        } else {
          decompiledFrameRemainder0 = (var3 == 19);
        }
        if ((decompiledFrameRemainder1) &&
          (decompiledFrameRemainder0)) {
          if (DelayedServerPacket.field_n == 102) {
            ll.a(-118, 0);
            decompiledFrameRemainder1 = (var4 != 0);
          }
          if (decompiledFrameRemainder1) {
            if (DelayedServerPacket.field_n == 103) {
              ll.a(param1 + 24365, 160);
              decompiledFrameRemainder1 = (var4 != 0);
            }
            if (decompiledFrameRemainder1) {
              super.handleItemKey(param0, -24489);
              decompiledFrameRemainder1 = (var4 != 0);
            }
          }
        }
        if (decompiledFrameRemainder1) {
          super.handleItemKey(param0, -24489);
        }
        if (param1 != -24489) {
          this.exitTicks = 66;
        }
    }

    final boolean isClosed(boolean param0) {
        if (param0) {
          field_z = -119;
        }
        return this.transitionState == 4 ? true : false;
    }

    private final void showImmediately(byte param0) {
        this.transitionState = 1;
        if (param0 >= -95) {
          return;
        }
        this.enterTicks = 50 + 5 * this.itemCount;
    }

    private final void drawLoginRequiredMessage(int param0) {
        int var2 = 0;
        if (this.transitionState > 2) {
          return;
        }
        TutorialAction.a(-var2 + 40, 140, 560, (byte) 41, 200);
        int var3 = 170;
        nm.field_c.drawCentered(NodeHashTableIterator.field_b, 320 - var2, var3, 2, -1);
        var3 += 40;
        Vector2i.a(20, ko.field_a, 0, 0, 560, -20 + var3, 40 - var2, -var3 + 414, -1, 1, HoldTheLine.field_F);
        if (param0 != 29280) {
          this.carouselOffset = 0.7895873785018921f;
        }
    }

    private final void handleChampionshipMouse(int param0) {
        int var2 = -this.enterTicks + 50;
        if (this.transitionState == 2) {
          var2 = -(this.itemCount * 5) + this.exitTicks + 25;
        }
        if (var2 < 0) {
          var2 = 0;
        }
        int var3 = (int)((double)we.field_n * (-Math.exp((double)(0.20000000298023224f * (float)var2)) + 1.0));
        if (param0 != -5302) {
          return;
        }
        if (this.transitionState > 2) {
          var3 = 640;
        }
        GrowableStringList.field_a = this.hitTestChampionshipIcon(FullscreenErrorDialog.field_X, (byte) -128, NodeHashTableIterator.field_g, var3);
        if (GrowableStringList.field_a != -1) {
          ArchiveCatalog.a(0, (byte) 118, this.menuId, GrowableStringList.field_a);
        }
        ArchiveCatalog.field_j = this.hitTestCoursePreview(FullscreenErrorDialog.field_X, param0 + 5465, NodeHashTableIterator.field_g, var3);
        if (ValidationIndicator.field_J == 1) {
          MatchingTextValidator.a(293, StrongCacheEntry.field_r);
          if (GrowableStringList.field_a != -1 &&
            ~GrowableStringList.field_a != ~BoundaryIntersection.field_p) {
            if (pj.field_m != GameKeyHandler.field_b ||
              BoundaryIntersection.field_p != PasswordValidator.field_j) {
              this.carouselOffset = this.carouselOffset - 640.0f;
              PasswordValidator.field_j = BoundaryIntersection.field_p;
              GameKeyHandler.field_b = pj.field_m;
            }
            this.targetCarouselOffset = 640;
            BoundaryIntersection.field_p = GrowableStringList.field_a;
          }
        }
    }

    final void beginExit(int param0) {
        this.transitionState = 2;
        int var2 = 44 / ((param0 + 25) / 61);
        ImageProducerRasterBuffer.field_m = 0;
    }

    private final void handleRaceResultKeys(int param0) {
        int discarded$0 = 0;
        int var3;
        boolean decompiledFrameRemainder0 = true;
        var3 = HoldTheLine.field_D;
        if (0.0f < this.carouselOffset) {
          if (DelayedServerPacket.field_n != 84) {
            if (DelayedServerPacket.field_n == 98) {
              this.selectedItem = 0;
              decompiledFrameRemainder0 = (var3 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (99 == DelayedServerPacket.field_n) {
                this.selectedItem = 1;
                decompiledFrameRemainder0 = (var3 != 0);
              }
              if (decompiledFrameRemainder0) {
                if (96 != DelayedServerPacket.field_n ||
                  this.selectedItem != 1) {
                  if ((DelayedServerPacket.field_n != 97 ||
                    this.selectedItem != 1) &&
                    (decompiledFrameRemainder0 = (this.selectedItem == 0))) {
                    this.handleKey(true);
                    decompiledFrameRemainder0 = (var3 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    IntArrayReadRequest.field_l = RotatedSpriteAsset.field_g[ArchiveIndex.b((byte) -49).field_p][1];
                    decompiledFrameRemainder0 = (var3 != 0);
                  }
                }
                if (decompiledFrameRemainder0) {
                  IntArrayReadRequest.field_l = RotatedSpriteAsset.field_g[ArchiveIndex.b((byte) -49).field_p][0];
                  decompiledFrameRemainder0 = (var3 != 0);
                }
              }
            }
          }
          if (decompiledFrameRemainder0) {
            if ((this.selectedItem != 0) &&
              (decompiledFrameRemainder0 = (MusicPatchPcmStream.field_r != null))) {
              if (IntArrayReadRequest.field_l != -1) {
                MusicPatchPcmStream.field_r.vehicles[0].a(20385, ge.field_c[IntArrayReadRequest.field_l]);
              }
              wm.a(false, false, -1);
              MatchingTextValidator.a(293, StrongCacheEntry.field_r);
              decompiledFrameRemainder0 = (var3 != 0);
            }
            if (decompiledFrameRemainder0) {
              this.activateItem(this.selectedItem, param0 ^ 3564);
              decompiledFrameRemainder0 = (var3 != 0);
            }
          }
        }
        if (decompiledFrameRemainder0) {
          if (DelayedServerPacket.field_n != 84 ||
            this.selectedItem != 1) {
            if (DelayedServerPacket.field_n != 98 ||
              this.menuId != 10) {
              if (DelayedServerPacket.field_n != 99) {
                if (this.selectedItem == 0) {
                  this.handleKey(true);
                  if (var3 != 0) {
                    this.selectedItem = 1;
                    this.selectedItem = 0;
                    this.activateMenuActionWithSound((byte) 117, 6, false);
                  }
                }
              } else {
                this.selectedItem = 1;
                if (var3 != 0) {
                  this.selectedItem = 0;
                  this.activateMenuActionWithSound((byte) 117, 6, false);
                }
              }
            } else {
              this.selectedItem = 0;
              if (var3 != 0) {
                this.activateMenuActionWithSound((byte) 117, 6, false);
              }
            }
          } else {
            this.activateMenuActionWithSound((byte) 117, 6, false);
          }
        }
        if (param0 != -1) {
          discarded$0 = this.hitTestCoursePreview(65, -46, 28, -26);
        }
    }

    private final void drawVolumeSlider(int param0, byte param1, int param2, int param3) {
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_12_3 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_19_3 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_30_2 = 0;
        int stackIn_31_3 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_34_2 = 0;
        int stackIn_35_3;
        int stackIn_39_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_47_2 = 0;
        int stackIn_47_3 = 0;
        int stackIn_47_4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var12Lifetime1;
        var13 = HoldTheLine.field_D;
        var5 = -7 + param3 + param2;
        if (param1 >= -45) {
          return;
        }
        var6 = 0;
        while (true) {
          stackIn_4_0 = -9;
          stackIn_4_1 = ~var6;
          if (stackIn_4_0 < stackIn_4_1) {
            var7 = param2 + 256 * var6 / 16;
            var8 = var7 + 8;
            var9 = var6 * 30 / 16;
            var10 = 22 + param0;
            var11 = var10 - var9;
            SoftwareRasterizer.drawHorizontalLine(var7 + var9 / 2, -1 + var11, 10, 0);
            stackIn_39_0 = 1;
            if (var13 == 0) {
              var12 = stackIn_39_0;
              while (var12 <= var9) {
                SoftwareRasterizer.drawHorizontalLine(var7 + (var12 / 2 - 1), -var12 + var10, 1, 0);
                stackIn_47_0 = var12 / 2 + var7;
                stackIn_47_1 = var10 - var12;
                stackIn_47_2 = 2;
                stackIn_47_3 = var7;
                stackIn_47_4 = var5;
                if (stackIn_47_3 > stackIn_47_4) {
                  stackIn_12_3 = 4210752;
                } else {
                  stackIn_12_3 = 8421504;
                }
                SoftwareRasterizer.drawHorizontalLine(stackIn_47_0, stackIn_47_1, stackIn_47_2, stackIn_12_3);
                stackIn_16_0 = 2 + (var7 + var12 / 2);
                stackIn_16_1 = var10 - var12;
                stackIn_16_2 = 6;
                if (~var9 == ~var12) {
                  if (var5 < var7) {
                    stackIn_19_3 = 4210752;
                  } else {
                    stackIn_19_3 = 8421504;
                  }
                } else {
                  if (var5 >= var7) {
                    stackIn_19_3 = 16777215;
                  } else {
                    stackIn_19_3 = 8421504;
                  }
                }
                SoftwareRasterizer.drawHorizontalLine(stackIn_16_0, stackIn_16_1, stackIn_16_2, stackIn_19_3);
                SoftwareRasterizer.drawHorizontalLine(8 + (var12 / 2 + var7), -var12 + var10, 1, 0);
                var12++;
              }
              SoftwareRasterizer.drawHorizontalLine(-1 + var7, var10, 10, 0);
              if (var7 <= var5 &&
                var5 < var8) {
                var12Lifetime1 = 1;
                while (var12Lifetime1 <= var9) {
                  stackIn_4_0 = var5;
                  stackIn_4_1 = 2 + var7;
                  if (stackIn_4_0 < stackIn_4_1) {
                    SoftwareRasterizer.drawHorizontalLine(var5 + var12Lifetime1 / 2, var10 - var12Lifetime1, var7 + (2 - var5), 4210752);
                    stackIn_30_0 = var12Lifetime1 / 2 + (var7 + 2);
                    stackIn_30_1 = var10 - var12Lifetime1;
                    stackIn_30_2 = 6;
                    if (~var9 != ~var12Lifetime1) {
                      stackIn_31_3 = 8421504;
                    } else {
                      stackIn_31_3 = 4210752;
                    }
                    SoftwareRasterizer.drawHorizontalLine(stackIn_30_0, stackIn_30_1, stackIn_30_2, stackIn_31_3);
                  } else {
                    stackIn_34_0 = var5 + var12Lifetime1 / 2;
                    stackIn_34_1 = -var12Lifetime1 + var10;
                    stackIn_34_2 = var7 - (-8 + var5);
                    if (var12Lifetime1 == var9) {
                      stackIn_35_3 = 4210752;
                    } else {
                      stackIn_35_3 = 8421504;
                    }
                    SoftwareRasterizer.drawHorizontalLine(stackIn_34_0, stackIn_34_1, stackIn_34_2, stackIn_35_3);
                  }
                  var12Lifetime1++;
                }
              }
              var6++;
              continue;
            }
          } else {
            stackIn_39_0 = 0;
          }
          var6 = stackIn_39_0;
          while (true) {
            if (var6 >= 4) {
              return;
            }
            SoftwareRasterizer.drawHorizontalLine(-var6 + (param3 + param2) - 7, param0 + (var6 + 22), 1 + var6 * 2, 16711680);
            var6++;
            if (var13 != 0) {
              return;
            }
          }
        }
    }

    private final void drawAchievements(byte param0) {
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_25_0 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        Sprite var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var5Lifetime1;
        var12 = HoldTheLine.field_D;
        TutorialAction.a(60, 101, 520, (byte) 41, 320);
        SocketConnector.field_a = 0;
        var2 = 160;
        var3 = 125;
        var4 = 0;
        if (param0 != -18) {
          return;
        }
        var5 = 0;
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (var5 >= 16))) {
          var6_int = QuickChatDynamicCommand.field_d[var5];
          stackIn_10_0 = 0;
          stackIn_10_1 = 1 << var6_int & ClientException.field_c;
          if (var12 == 0) {
            if (stackIn_10_0 != stackIn_10_1) {
              this.drawAchievementIcon(true, var6_int, SecondaryNodeDequeIterator.field_h[var6_int], var3, 12, var2);
              var2 += 40;
              var4++;
              if (9 == var4) {
                var3 += 40;
                var2 = 180;
              }
            }
            var5++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_10_0 = -1;
          stackIn_10_1 = TutorialTransition.field_e;
        }
        if (stackIn_10_0 != stackIn_10_1) {
          stackIn_13_0 = TutorialTransition.field_e;
        } else {
          stackIn_13_0 = WidgetContainer.field_E;
        }
        var5Lifetime1 = stackIn_13_0;
        if (-1 != var5Lifetime1) {
          this.drawAchievementIcon(false, var5Lifetime1, 128, 291, param0 + 30, 320);
          LinkWidgetRenderer.a(200, PolarSortVector.field_b, true, HoldTheLine.field_F, 252, 0);
          GrowableObjectList.a(440, 1, BoundaryCurve.field_o, 0, 252, HoldTheLine.field_F);
          q.drawCenteredTextWithHighlight(Integer.toString(ShadedRoadStripRenderer.field_o[var5Lifetime1][0]), HoldTheLine.field_F, 0, 140, (byte) -128, 282);
          var6 = PolarSortVector.a((byte) -123);
          var7 = ShadedRoadStripRenderer.field_o[var5Lifetime1][1];
          var8 = ImageProducerRasterBuffer.field_m / 15 % (var7 + 2);
          var9 = ImageProducerRasterBuffer.field_m / 5 % 3;
          var10 = 0;
          while (true) {
            if (var10 < var7) {
              var11 = 0;
              stackIn_25_0 = var8;
              if (var12 == 0) {
                if (stackIn_25_0 != var10) {
                  if (~var10 == ~(var8 - 1)) {
                    var11 = -var9 + 3;
                  }
                } else {
                  var11 = var9;
                }
                var6.drawDownscaledBlended(-var11 + 460 + 16 * var10, -var11 + 262, 32 + 2 * var11, 32 + var11 * 2);
                var10++;
                continue;
              }
            } else {
              nm.field_c.drawCentered(ae.field_c[var5Lifetime1], 320, 217, 0, -1);
              stackIn_25_0 = 20;
            }
            break;
          }
          Vector2i.a(stackIn_25_0, TextLineLayout.field_j[var5Lifetime1], 0, 0, 400, 362, 120, 80, param0 + 17, 1, HoldTheLine.field_F);
        }
        BlobWriteRequest.drawTitleBar(IndexedSpriteState.field_b, 0, 0, -1753, 448);
        return;
    }

    final static void clearJs5Errors(int param0) {
        if (param0 >= -77) {
          GameMenu.createRotationMatrix(56, 62, (byte) 72);
        }
        OutlinedRoadStripRenderer.field_n.field_c = 0;
        OutlinedRoadStripRenderer.field_n.field_f = 0;
    }

    private final void drawHelpCarousel(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = HoldTheLine.field_D;
        if (this.transitionState > 2) {
          return;
        }
        if (param1 != -11468) {
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.transitionState != 1) {
          this.drawHelpPage(ih.field_p, 0, param0);
          decompiledFrameRemainder0 = (var4 != 0);
        }
        if (decompiledFrameRemainder0) {
          var3 = 0;
          while (var3 < 7) {
            this.drawHelpPage(var3, 0, (int)this.carouselOffset + param0 - 640 * var3);
            var3++;
            if (var4 != 0) {
              break;
            }
          }
        }

    }

    private final void drawAchievementBrowser(int param0, int param1) {
        boolean stackIn_7_0 = false;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        boolean stackOut_6_0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        Sprite var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var6Lifetime1;
        var13 = HoldTheLine.field_D;
        if (this.transitionState > 2) {
          return;
        }
        if (param0 <= 4) {
          this.handleAchievementMouse((byte) -103);
        }
        TutorialAction.a(60 - param1, 101, 520, (byte) 41, 320);
        SocketConnector.field_a = 0;
        var3 = 156;
        var4 = 125;
        var5 = 0;
        var6 = 0;
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (16 <= var6))) {
          stackOut_6_0 = this.isAchievementVisible(var6, 176);
          stackIn_15_0 = stackOut_6_0 ? 1 : 0;
          stackIn_7_0 = stackOut_6_0;
          if (var13 == 0) {
            if (stackIn_7_0) {
              var7_int = QuickChatDynamicCommand.field_d[var6];
              this.drawAchievementIcon(true, var7_int, SecondaryNodeDequeIterator.field_h[var7_int], var4, 12, -param1 + var3);
              var3 += 46;
              var5++;
              if (var5 == 8) {
                var4 += 40;
                var3 = 179;
                if (this.isAchievementVisible(15, 176)) {
                  var3 -= 23;
                }
              }
            }
            var6++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_15_0 = 0;
        }
        if (stackIn_15_0 != ~TutorialTransition.field_e) {
          stackIn_18_0 = TutorialTransition.field_e;
        } else {
          stackIn_18_0 = WidgetContainer.field_E;
        }
        var6Lifetime1 = stackIn_18_0;
        if (var6Lifetime1 != -1) {
          this.drawAchievementIcon(false, var6Lifetime1, 128, 276, 12, -param1 + 320);
          LinkWidgetRenderer.a(200 - param1, PolarSortVector.field_b, true, HoldTheLine.field_F, 252, 0);
          GrowableObjectList.a(-param1 + 440, 1, BoundaryCurve.field_o, 0, 252, HoldTheLine.field_F);
          q.drawCenteredTextWithHighlight(Integer.toString(ShadedRoadStripRenderer.field_o[var6Lifetime1][0]), HoldTheLine.field_F, 0, -param1 + 160, (byte) -127, 282);
          var7 = PolarSortVector.a((byte) -123);
          var8 = ShadedRoadStripRenderer.field_o[var6Lifetime1][1];
          var9 = ImageProducerRasterBuffer.field_m / 15 % (2 + var8);
          var10 = ImageProducerRasterBuffer.field_m / 5 % 3;
          var11 = 0;
          while (true) {
            if (var11 < var8) {
              var12 = 0;
              stackIn_29_0 = var11;
              stackIn_29_1 = var9;
              if (var13 == 0) {
                if (stackIn_29_0 != stackIn_29_1) {
                  if (~var11 == ~(var9 - 1)) {
                    var12 = 3 - var10;
                  }
                } else {
                  var12 = var10;
                }
                var7.drawDownscaledBlended(-var12 + (460 + (-param1 + 16 * var11)), 262 - var12, 32 + 2 * var12, 32 + 2 * var12);
                var11++;
                continue;
              }
            } else {
              stackIn_29_0 = 0;
              stackIn_29_1 = field_z & 1 << var6Lifetime1;
            }
            break;
          }
          if (stackIn_29_0 != stackIn_29_1) {
            q.drawCenteredTextWithHighlight(DualLinkNode.field_j, HoldTheLine.field_F, 1, 320 - param1, (byte) -127, 357);
          }
          if ((stackIn_29_0 == stackIn_29_1 ||
            var13 != 0) &&
            ImageProducerRasterBuffer.field_m % 80 < 40) {
            q.drawCenteredTextWithHighlight(fc.field_b, HoldTheLine.field_F, 2, 320 - param1, (byte) -127, 352);
          }
          nm.field_c.drawCentered(ae.field_c[var6Lifetime1], 320 - param1, 207, 0, -1);
          Vector2i.a(20, TextLineLayout.field_j[var6Lifetime1], 0, 0, 400, 357, 120 - param1, 80, -1, 1, HoldTheLine.field_F);
        }
        if ((var6Lifetime1 == -1 ||
          var13 != 0) &&
          pj.b((byte) 104)) {
          q.drawCenteredTextWithHighlight(EditableTextField.field_M, HoldTheLine.field_F, 0, 320 - param1, (byte) -127, 270);
          q.drawCenteredTextWithHighlight(ue.field_b, HoldTheLine.field_F, 0, 320 - param1, (byte) -128, 290);
        }
        BlobWriteRequest.drawTitleBar(IndexedSpriteState.field_b, param1, 0, -1753, 448);
        return;
    }

    private final void updateMembershipPromotion(int param0, boolean param1) {
        int discarded$1 = 0;
        int var3;
        int var4;
        int stackIn_5_0 = 0;
        boolean stackIn_6_1 = false;
        var4 = HoldTheLine.field_D;
        if (param0 != 0) {
          discarded$1 = this.hitTestAchievement(123, -77, -90);
        }
        boolean decompiledFrameRemainder0 = true;
        if (CurvedRoadSegment.field_T) {
          stackIn_5_0 = -86;
          stackIn_6_1 = !(param1);
          var3 = UsernameLoginCredentials.updateMembershipSlidesWithIntGuard(stackIn_5_0, stackIn_6_1);
          switch (var3) {
            default:
              break;
            case 2:
              this.activateMenuActionWithSound((byte) 117, 0, true);
              if (var4 == 0) {
                break;
              }
            case 1:
              this.activateMenuActionWithSound((byte) 117, 0, false);
              if (var4 == 0) {
                break;
              }
            case 3:
              MusicPatch.a(GameKeyHandler.a(99), (byte) 65);
              break;
          }
          decompiledFrameRemainder0 = (var4 != 0);
        }
        if (decompiledFrameRemainder0) {
          kc.field_a.getSprites(180);
          TextButton.field_A.getSprite(param0 + 8192);
          MouseWheelInput.field_a.getSprite(8192);
          bo.field_d.getSprite(8192);
          if (kc.field_a.isLoaded((byte) 127) &&
            TextButton.field_A.isLoaded((byte) 10) &&
            MouseWheelInput.field_a.isLoaded((byte) 10) && bo.field_d.isLoaded((byte) 10)) {
            TextFieldValidator.a(SpriteState.field_w, TextButton.field_A.field_b, 0);
            Js5Transport.a(0, 19189, 80, 20, 50, 0, -1500, MouseWheelInput.field_a.field_b, 80);
            te.a(param0 - 4, kc.field_a.field_i);
            nm.a(bo.field_d.field_b, 22210);
            NetworkGameClient.initializeAccountScreenSelection(true, true);
            CurvedRoadSegment.field_T = true;
          }
        }

    }

    private final void drawAchievementIcon(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        Sprite stackIn_18_0 = null;
        int var7;
        int var8;
        int var9;
        Sprite var10;
        int var11;
        var11 = HoldTheLine.field_D;
        stackIn_3_0 = (0 == (1 << param1 & field_z)) ? 0 : 1;
        var7 = stackIn_3_0;
        stackIn_6_0 = ((1 << param1 & 65284) == 0) ? 0 : 1;
        var8 = stackIn_6_0;
        stackIn_9_0 = (param2 != 32) ? 0 : 1;
        regionExit1: {
          var9 = stackIn_9_0;
          if (var7 != 0) {
            var10 = ak.a(param4 - 48, var9 != 0, param1);
            if (var11 == 0) {
              break regionExit1;
            }
          }
          if (var8 != 0 ||
            of.a(param4 - 981)) {
            var10 = ak.a(param4 ^ -108, var9 != 0, -1);
            if (var11 != 0) {
              if (var9 == 0) {
                stackIn_18_0 = SolidRoadStripRenderer.field_q;
              } else {
                stackIn_18_0 = ka.field_f;
              }
              var10 = stackIn_18_0;
            }
          } else {
            if (var9 == 0) {
              stackIn_18_0 = SolidRoadStripRenderer.field_q;
            } else {
              stackIn_18_0 = ka.field_f;
            }
            var10 = stackIn_18_0;
          }
        }
        if (var9 == 0) {
          if (param2 != 128) {
            var10.drawDownscaledBlended(-(param2 >> 1) + param5, -(param2 >> 1) + param3, param2, param2);
            if (var11 != 0) {
              var10.draw(-64 + param5, param3 - 64);
              var10.draw(-16 + param5, -16 + param3);
            }
          } else {
            var10.draw(-64 + param5, param3 - 64);
            if (var11 != 0) {
              var10.draw(-16 + param5, -16 + param3);
            }
          }
        } else {
          var10.draw(-16 + param5, -16 + param3);
        }
        if (param4 == param1 &&
          var7 != 0) {
          pe.a(param2, 4209, param5, param3);
        }
        if (param0) {
          dm.field_e[SocketConnector.field_a] = param5;
          co.field_d[SocketConnector.field_a] = param3;
          ArchiveIndex.field_b[SocketConnector.field_a] = param2;
          EditableTextField.field_J[SocketConnector.field_a] = param1;
          SocketConnector.field_a = SocketConnector.field_a + 1;
        }
    }

    private final void activateMenuActionWithSound(byte param0, int param1, boolean param2) {
        if (param0 != 117) {
          return;
        }
        MatchingTextValidator.a(293, StrongCacheEntry.field_r);
        this.activateMenuAction(param1, param2, param0 ^ -95);
    }

    final void beginExitFromCurrentPosition(int param0) {
        this.transitionState = 2;
        BlobReadRequest.field_n = -BlobReadRequest.field_n + 80;
        this.exitTicks = -this.enterTicks + (this.itemCount * 5 + 25);
        if (param0 != 0) {
          this.closeDelayTicks = 0;
        }
    }

    private final void handleAchievementMouse(byte param0) {
        WidgetContainer.field_E = this.hitTestAchievement(-21, NodeHashTableIterator.field_g, FullscreenErrorDialog.field_X);
        if (ValidationIndicator.field_J == 1) {
          MatchingTextValidator.a(293, StrongCacheEntry.field_r);
          if (~TutorialTransition.field_e != ~WidgetContainer.field_E) {
            if (WidgetContainer.field_E != -1) {
              TutorialTransition.field_e = WidgetContainer.field_E;
              if (HoldTheLine.field_D != 0) {
                TutorialTransition.field_e = -1;
              }
            }
          } else {
            TutorialTransition.field_e = -1;
          }
        }
        if (param0 <= 82) {
          this.update(49, false);
        }
    }

    final void reset(boolean param0, int param1) {
        String[][] array$0 = null;
        boolean stackIn_21_1 = false;
        int stackIn_26_1 = 0;
        String[][] stackIn_31_0 = null;
        String[][] stackIn_31_1 = null;
        int stackIn_31_2 = 0;
        String[] stackIn_36_3 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = HoldTheLine.field_D;
        this.transitionState = 0;
        this.closeDelayTicks = 0;
        this.exitTicks = 0;
        this.enterTicks = 0;
        var3 = 0;
        do {
          if (var3 >= this.itemAnimationTimers.length) {
            ValidationHelpWidget.field_S = -20;
            ImageProducerRasterBuffer.field_m = 0;
            break;
          }
          this.itemAnimationTimers[var3] = 0;
          var3++;
        } while (var5 == 0);
        if (this.menuId == 4 ||
          this.menuId == 5) {
          ih.field_p = 0;
        }
        boolean decompiledFrameCompleted0 = true;
        if (this.menuId == 2 ||
          this.menuId == 3) {
          var3 = 0;
          while (var3 < 4) {
            RotatedSpriteCache.field_g[var3] = null;
            var3++;
            if (var5 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
          }
        }
        if (decompiledFrameCompleted0) {
          stackIn_21_1 = !(param0);
          this.keyboardSelection = stackIn_21_1;
          WidgetContainer.field_E = -1;
          this.carouselOffset = 0.0f;
          ArchiveRequest.field_s = 0;
          TexturedRoadFillRenderer.field_h = 2;
          this.targetCarouselOffset = 0;
          ArchiveCatalog.field_j = -1;
        }
        if (10 != this.menuId &&
          this.menuId != 11) {
          stackIn_26_1 = 0;
        } else {
          stackIn_26_1 = 1;
        }
        this.selectedItem = stackIn_26_1;
        SocketConnector.field_a = 0;
        TutorialTransition.field_e = -1;
        LinearPointPath.field_o = 0;
        this.field_v = -1;
        if (this.menuId == 0 &&
          StrongCacheEntry.field_v != -1) {
          this.selectedItem = StrongCacheEntry.field_v;
        }
        this.clearPointerState((byte) 117);
        var3 = StrongCacheEntry.field_w;
        array$0 = new String[1][];
        stackIn_31_0 = array$0;
        stackIn_31_1 = array$0;
        stackIn_31_2 = 0;
        if (10 != this.menuId) {
          if (2 == this.menuId) {
            stackIn_36_3 = UiTheme.field_k;
          } else {
            if (this.menuId != 3) {
              stackIn_36_3 = null;
            } else {
              stackIn_36_3 = UiTheme.field_k;
            }
          }
        } else {
          stackIn_36_3 = WidgetContainer.field_A[var3];
        }
        stackIn_31_1[stackIn_31_2] = stackIn_36_3;
        TrackObjectDefinition.setMenuDescriptions(stackIn_31_0, 79, this.menuId);
        if (param1 >= -81) {
          this.itemAnimationTimers = (int[]) null;
        }
        var4 = 0;
        do {
          if (var4 >= 16) {
            if (!CurvedRoadSegment.field_T) {
              return;
            }
            break;
          }
          SecondaryNodeDequeIterator.field_h[var4] = 32;
          var4++;
        } while (var5 == 0);
        NetworkGameClient.initializeAccountScreenSelection(param0, true);
        return;
    }

    private final void finishExit(byte param0) {
        boolean discarded$0 = false;
        if (param0 >= -56) {
          discarded$0 = this.isAchievementVisible(45, -17);
        }
        this.transitionState = 4;
        this.closeDelayTicks = 40;
    }

    final void increaseItemValue(int param0, int param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_30_0 = 0;
        boolean stackIn_45_0 = false;
        int var3;
        int var4;
        var4 = HoldTheLine.field_D;
        var3 = AgeValidator.field_i[this.menuId][param1];
        switch ((var4 == 0
          || var3 == 10
          || var3 == 19
          || var3 == 21
          ) ? var3 : -1) {
          case 10:
          case 5:
            fieldTemp$0 = LinearPointPath.field_o + 1;
            LinearPointPath.field_o = LinearPointPath.field_o + 1;
            if (fieldTemp$0 <= 1) {
              break;
            }
            LinearPointPath.field_o = 0;
            if (var4 == 0) {
              break;
            }
          case 24:
            fieldTemp$1 = ArchiveRequest.field_s + 1;
            ArchiveRequest.field_s = ArchiveRequest.field_s + 1;
            if (fieldTemp$1 <= 3) {
              break;
            }
            ArchiveRequest.field_s = 0;
            if (var4 == 0) {
              break;
            }
          case 25:
            fieldTemp$2 = TexturedRoadFillRenderer.field_h + 1;
            TexturedRoadFillRenderer.field_h = TexturedRoadFillRenderer.field_h + 1;
            stackIn_24_0 = ~fieldTemp$2;
            if (ih.field_p != -1 + TextHotspotRange.field_i.length) {
              stackIn_25_1 = 2;
            } else {
              stackIn_25_1 = 1;
            }
            if (stackIn_24_0 >= ~stackIn_25_1) {
              break;
            }
            stackIn_30_0 = (ih.field_p == 0) ? 1 : 0;
            TexturedRoadFillRenderer.field_h = stackIn_30_0;
            if (var4 == 0) {
              break;
            }
          case 18:
            if (SecondaryNodeDeque.field_d >= 224) {
              if (SecondaryNodeDeque.field_d >= 256) {
                break;
              }
              SecondaryNodeDeque.field_d = 256;
              MatchingTextValidator.a(293, StrongCacheEntry.field_r);
              if (var4 == 0) {
                break;
              }
            }
            SecondaryNodeDeque.field_d = 32 * (1 + SecondaryNodeDeque.field_d * 8 / 256);
            MatchingTextValidator.a(293, StrongCacheEntry.field_r);
            if (var4 == 0) {
              break;
            }
          case 19:
            if (NanoTickClock.field_e < 140) {
              ll.a(-108, 20 * (8 * NanoTickClock.field_e / 160) + 20);
              if (var4 == 0) {
                break;
              }
            }
            ll.a(-125, 160);
            if (var4 == 0) {
              break;
            }
          case 21:
            MatchingTextValidator.a(293, StrongCacheEntry.field_r);
            stackIn_45_0 = !(AgeValidator.field_o);
            AgeValidator.field_o = stackIn_45_0;
            this.itemAnimationTimers[param1] = 50;
          default:
            break;
        }
        if (param0 <= 97) {
          this.field_v = -111;
        }
    }

    private final void activateMenuAction(int param0, boolean param1, int param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_86_1 = 0;
        int stackIn_97_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_108_1 = 0;
        boolean stackIn_160_0 = false;
        boolean stackIn_160_1 = false;
        int stackIn_161_2 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        regionExit1: {
          regionExit2: {
            regionExit3: {
              regionExit4: {
                regionExit5: {
                  regionExit6: {
                    regionExit7: {
                      regionExit8: {
                        regionExit9: {
                          regionExit10: {
                            regionExit11: {
                              regionExit12: {
                                regionExit13: {
                                  regionExit14: {
                                    regionExit15: {
                                      regionExit16: {
                                        regionExit17: {
                                          regionExit18: {
                                            regionExit19: {
                                              regionExit20: {
                                                regionExit21: {
                                                  regionExit22: {
                                                    var7 = HoldTheLine.field_D;
                                                    var4 = -78 % ((param2 - 36) / 41);
                                                    var6 = param0;
                                                    if (var6 != 2) {
                                                      if (var6 == 13 &&
                                                        var7 == 0) {
                                                        break regionExit22;
                                                      }
                                                      if (var6 == 14 &&
                                                        var7 == 0) {
                                                        break regionExit21;
                                                      }
                                                      if (var6 == 15) {
                                                        break regionExit20;
                                                      }
                                                      if (var6 == 16 &&
                                                        var7 == 0) {
                                                        break regionExit19;
                                                      }
                                                      if (var6 == 17 &&
                                                        var7 == 0) {
                                                        break regionExit18;
                                                      }
                                                      if (var6 == 0 &&
                                                        var7 == 0) {
                                                        break regionExit17;
                                                      }
                                                      if (var6 == 3) {
                                                        break regionExit16;
                                                      }
                                                      if (var6 == 7 &&
                                                        var7 == 0) {
                                                        break regionExit15;
                                                      }
                                                      if (var6 == 8 &&
                                                        var7 == 0) {
                                                        break regionExit14;
                                                      }
                                                      if (var6 == 4 &&
                                                        var7 == 0) {
                                                        break regionExit13;
                                                      }
                                                      if (5 == var6 &&
                                                        var7 == 0) {
                                                        break regionExit12;
                                                      }
                                                      if (var6 == 9) {
                                                        break regionExit11;
                                                      }
                                                      if (var6 == 10 &&
                                                        var7 == 0) {
                                                        break regionExit10;
                                                      }
                                                      if (var6 == 11 &&
                                                        var7 == 0) {
                                                        break regionExit9;
                                                      }
                                                      switch (var6) {
                                                        case 24:
                                                          break regionExit8;
                                                        case 25:
                                                          break regionExit7;
                                                        case 12:
                                                          break regionExit6;
                                                        case 6:
                                                          break regionExit5;
                                                        case 26:
                                                          break regionExit4;
                                                        default:
                                                          break regionExit1;
                                                        case 1:
                                                          if (var7 == 0) {
                                                            break regionExit3;
                                                          }
                                                          break;
                                                      }
                                                    }
                                                    wm.a(param1, false, -1);
                                                    if (var7 == 0) {
                                                      break regionExit2;
                                                    }
                                                  }
                                                  wm.a(param1, false, 2);
                                                  this.field_v = param0;
                                                  if (var7 == 0) {
                                                    break regionExit2;
                                                  }
                                                }
                                                wm.a(param1, false, 6);
                                                this.field_v = param0;
                                                if (var7 == 0) {
                                                  break regionExit2;
                                                }
                                              }
                                              wm.a(param1, false, 4);
                                              this.field_v = param0;
                                              if (var7 == 0) {
                                                break regionExit2;
                                              }
                                            }
                                            wm.a(param1, false, 5);
                                            this.field_v = param0;
                                            if (var7 == 0) {
                                              break regionExit2;
                                            }
                                          }
                                          if (null == MidiPcmStream.field_U) {
                                            QuadraticPointPath.b((byte) 108);
                                            if (var7 == 0) {
                                              break regionExit2;
                                            }
                                          }
                                          AgeValidator.a(-29486, false);
                                          if (var7 == 0) {
                                            break regionExit2;
                                          }
                                        }
                                        if (of.a(-969) ||
                                          this.menuId != 9 &&
                                          7 != this.menuId &&
                                          8 != this.menuId &&
                                          this.menuId != 3) {
                                          wm.a(param1, false, 0);
                                          if (var7 == 0) {
                                            break regionExit2;
                                          }
                                        }
                                        wm.a(param1, false, 12);
                                        if (var7 == 0) {
                                          break regionExit2;
                                        }
                                      }
                                      wm.a(param1, false, TextLayout.field_a);
                                      if (var7 == 0) {
                                        break regionExit2;
                                      }
                                    }
                                    MusicPatchPcmStream.field_r.field_mb = -1;
                                    qn.a(7, param1, true);
                                    if (var7 == 0) {
                                      break regionExit2;
                                    }
                                  }
                                  if (this.menuId == 10 &&
                                    0.0f < this.carouselOffset &&
                                    3 == CheckboxRenderer.field_x) {
                                    wm.a(param1, false, 13);
                                    if (var7 == 0) {
                                      break regionExit2;
                                    }
                                  }
                                  this.activateMenuAction(7, param1, -12);
                                  if (var7 == 0) {
                                    break regionExit2;
                                  }
                                }
                                wm.a(param1, false, 3);
                                if (var7 == 0) {
                                  break regionExit2;
                                }
                              }
                              if (LinearPointPath.field_o != 0) {
                                stackIn_86_1 = 0;
                              } else {
                                stackIn_86_1 = 4;
                              }
                              this.activateMenuAction(stackIn_86_1, param1, -24);
                              if (var7 == 0) {
                                break regionExit2;
                              }
                            }
                            if (this.menuId == 2 ||
                              this.menuId == 6) {
                              i.a((byte) 71, true);
                              if (var7 == 0) {
                                break regionExit2;
                              }
                            }
                            if (this.menuId == 9) {
                              if (DelegatingCanvas.field_d == 7) {
                                stackIn_97_0 = (ClientException.field_c == 0) ? 3 : 7;
                                var6 = stackIn_97_0;
                                if (var7 != 0) {
                                  stackIn_101_0 = (0 != ClientException.field_c) ? 8 : 12;
                                  var6 = stackIn_101_0;
                                }
                              } else {
                                stackIn_101_0 = (0 != ClientException.field_c) ? 8 : 12;
                                var6 = stackIn_101_0;
                              }
                              MatchingTextValidator.a(var6, true, 3865, param1);
                              if (var7 == 0) {
                                break regionExit2;
                              }
                            }
                            MusicPatch.a(GameKeyHandler.a(98), (byte) 47);
                            if (var7 == 0) {
                              break regionExit2;
                            }
                          }
                          if (LinearPointPath.field_o == 0) {
                            stackIn_108_1 = 9;
                          } else {
                            stackIn_108_1 = 0;
                          }
                          this.activateMenuAction(stackIn_108_1, param1, -35);
                          if (var7 == 0) {
                            break regionExit2;
                          }
                        }
                        PathWaypoint.field_o = null;
                        field_z = 0;
                        ClientException.field_c = 0;
                        wm.a(param1, false, 12);
                        if (var7 == 0) {
                          break regionExit2;
                        }
                      }
                      if (-1 == ArchiveRequest.field_s &&
                        var7 == 0) {
                        break regionExit2;
                      }
                      if (ArchiveRequest.field_s == 0) {
                        this.activateMenuAction(0, param1, -125);
                        if (var7 == 0) {
                          break regionExit2;
                        }
                      }
                      var5 = -1 + ArchiveRequest.field_s;
                      if (~var5 == ~pj.field_m) {
                        break regionExit2;
                      }
                      if (~GameKeyHandler.field_b != ~pj.field_m ||
                        ~BoundaryIntersection.field_p != ~PasswordValidator.field_j) {
                        this.carouselOffset = this.carouselOffset - 640.0f;
                        GameKeyHandler.field_b = pj.field_m;
                        PasswordValidator.field_j = BoundaryIntersection.field_p;
                      }
                      pj.field_m = var5;
                      this.targetCarouselOffset = 640;
                      if (var7 == 0) {
                        break regionExit2;
                      }
                    }
                    if (TexturedRoadFillRenderer.field_h != 0) {
                      if (2 == TexturedRoadFillRenderer.field_h) {
                        if (ih.field_p >= 6) {
                          break regionExit1;
                        }
                        fieldTemp$0 = ih.field_p + 1;
                        ih.field_p = ih.field_p + 1;
                        if (fieldTemp$0 == 6) {
                          TexturedRoadFillRenderer.field_h = 1;
                        }
                        this.targetCarouselOffset = 640 * ih.field_p;
                        if (var7 == 0) {
                          break regionExit2;
                        }
                      }
                      if (TexturedRoadFillRenderer.field_h != 1) {
                        break regionExit1;
                      }
                      wm.a(param1, false, TextLayout.field_a);
                      if (var7 == 0) {
                        break regionExit2;
                      }
                    }
                    if (0 >= ih.field_p) {
                      break regionExit1;
                    }
                    fieldTemp$1 = ih.field_p - 1;
                    ih.field_p = ih.field_p - 1;
                    if (0 == fieldTemp$1) {
                      TexturedRoadFillRenderer.field_h = 2;
                    }
                    this.targetCarouselOffset = ih.field_p * 640;
                    if (var7 == 0) {
                      break regionExit2;
                    }
                  }
                  if (!NameAvailabilityResult.field_e) {
                    wm.a(param1, false, 13);
                    this.field_v = param0;
                    if (var7 == 0) {
                      break regionExit2;
                    }
                  }
                  ProxySocketConnector.c(0);
                  if (var7 == 0) {
                    break regionExit2;
                  }
                }
                if (CheckboxRenderer.field_x != 2 &&
                  CheckboxRenderer.field_x != 6) {
                  if (CheckboxRenderer.field_x != 4 &&
                    CheckboxRenderer.field_x != 5) {
                    ij.a(param1, -81);
                    if (var7 == 0) {
                      break regionExit2;
                    }
                  }
                  if (pj.b((byte) 108)) {
                    if (0 != ClientException.field_c ||
                      ad.field_a) {
                      wm.a(param1, false, 9);
                      if (var7 == 0) {
                        break regionExit2;
                      }
                    }
                    wm.a(param1, false, 12);
                    if (var7 == 0) {
                      break regionExit2;
                    }
                  }
                  if (ClientException.field_c == 0) {
                    stackIn_160_0 = param1;
                    stackIn_160_1 = false;
                    if (of.a(-969)) {
                      stackIn_161_2 = 0;
                    } else {
                      stackIn_161_2 = 12;
                    }
                    wm.a(stackIn_160_0, stackIn_160_1, stackIn_161_2);
                    if (var7 == 0) {
                      break regionExit2;
                    }
                  }
                  wm.a(param1, false, 8);
                  if (var7 == 0) {
                    break regionExit2;
                  }
                }
                if (pj.b((byte) 102)) {
                  wm.a(param1, false, 9);
                  if (var7 == 0) {
                    break regionExit2;
                  }
                }
                if (ClientException.field_c == 0) {
                  wm.a(param1, false, 3);
                  if (var7 == 0) {
                    break regionExit2;
                  }
                }
                wm.a(param1, false, 7);
                if (var7 == 0) {
                  break regionExit2;
                }
              }
              ProxySocketConnector.c(0);
              if (var7 == 0) {
                break regionExit2;
              }
            }
            te.a(true);
          }
        }
    }

    final static void initializeTrackObjectDefinitions(boolean param0) {
        if (null != mc.field_a) {
          return;
        }
        mc.field_a = new TrackObjectDefinition[73];
        mc.field_a[1] = new TrackObjectDefinition(5, 543, StrongCacheEntry.field_u, i.field_j, -1);
        mc.field_a[2] = new TrackObjectDefinition(5, 540, BoundaryIntersection.field_k, i.field_j, -1);
        mc.field_a[3] = new TrackObjectDefinition(5, 541, LoginChoicePanel.field_O, i.field_j, -1);
        mc.field_a[4] = new TrackObjectDefinition(5, 542, na.field_q, i.field_j, -1);
        mc.field_a[5] = new TrackObjectDefinition(12, 6, 352, 0);
        mc.field_a[6] = new TrackObjectDefinition(12, 6, 352, 0);
        mc.field_a[7] = new TrackObjectDefinition(12, 6, 352, 0);
        mc.field_a[8] = new TrackObjectDefinition(12, 6, 352, 0);
        mc.field_a[9] = new TrackObjectDefinition(4, 1180, IsaacRandom.field_f, EmailLoginCredentials.field_d, -1);
        mc.field_a[10] = null;
        mc.field_a[11] = new TrackObjectDefinition(4, 8300, Vector2i.field_d, ao.field_d, -1);
        mc.field_a[12] = new TrackObjectDefinition(10, 0, DiskCacheWorker.field_b, 2);
        mc.field_a[13] = new TrackObjectDefinition(15, 0, IntArrayReadRequest.field_i, 2);
        mc.field_a[14] = new TrackObjectDefinition(20, 0, cd.field_d, 2);
        mc.field_a[15] = new TrackObjectDefinition(25, 0, ArchiveCatalog.field_k, 2);
        mc.field_a[16] = new TrackObjectDefinition(40, 0, BufferedRandomAccessFile.field_o, 2);
        mc.field_a[17] = new TrackObjectDefinition(25, 50, 524320, SingleChildWidget.field_A, 0);
        mc.field_a[18] = new TrackObjectDefinition(25, 50, 524320, aj.field_c, 0);
        mc.field_a[19] = new TrackObjectDefinition(25, 50, 524320, MouseWheelInput.field_c, 0);
        mc.field_a[20] = new TrackObjectDefinition(15, 30, 32, BlobReadRequest.field_k, 0);
        mc.field_a[21] = new TrackObjectDefinition(15, 30, 32, CheckboxWidget.field_I, 0);
        mc.field_a[22] = new TrackObjectDefinition(15, 30, 32, MusicPatch.field_u, 0);
        mc.field_a[23] = new TrackObjectDefinition(10, 10, 16384, MusicPatchPcmStream.field_s, 0);
        mc.field_a[24] = new TrackObjectDefinition(5, 0, DialWidgetRenderer.field_i, 0);
        mc.field_a[25] = new TrackObjectDefinition(5, 0, ae.field_b, 0);
        mc.field_a[26] = new TrackObjectDefinition(5, 0, ma.field_l, 0);
        mc.field_a[27] = new TrackObjectDefinition(80, 40, 1081376, h.field_b, 0);
        mc.field_a[28] = new TrackObjectDefinition(80, 4, 32, UsernameLoginCredentials.field_h, 1);
        mc.field_a[29] = new TrackObjectDefinition(10, 0, aj.field_a, -1);
        mc.field_a[30] = new TrackObjectDefinition(15, 25, 16416, ViewportSizingController.field_a, 0);
        mc.field_a[31] = new TrackObjectDefinition(15, 25, 16416, SocketJs5Transport.field_r, 0);
        mc.field_a[32] = new TrackObjectDefinition(10, 0, 16384, TickClock.field_a, 2);
        mc.field_a[33] = new TrackObjectDefinition(15, 0, 16384, UiWidget.field_r, 2);
        mc.field_a[34] = new TrackObjectDefinition(20, 0, 16384, MusicCrossfadeStream.field_o, 2);
        mc.field_a[35] = new TrackObjectDefinition(15, 0, 16384, DelayedServerPacket.field_q, 2);
        mc.field_a[36] = new TrackObjectDefinition(20, 0, 16384, kc.field_d, 2);
        mc.field_a[37] = new TrackObjectDefinition(25, 0, 16384, NameAvailabilityResult.field_c, 2);
        mc.field_a[38] = new TrackObjectDefinition(50, 50, 16416, LayeredButtonRenderer.field_t, ko.field_c, 0);
        mc.field_a[39] = new TrackObjectDefinition(5, 0, UiWidget.field_j, 0);
        mc.field_a[40] = new TrackObjectDefinition(5, 0, SpriteButtonRenderer.field_r, 0);
        mc.field_a[41] = new TrackObjectDefinition(10, 10, 65568, NameSuggestionsPanel.field_J, 0);
        mc.field_a[42] = new TrackObjectDefinition(10, 10, 65568, gk.field_b, 0);
        mc.field_a[43] = new TrackObjectDefinition(10, 10, 16384, TrackObjectDefinition.field_i, 0);
        if (param0) {
          return;
        }
        mc.field_a[44] = new TrackObjectDefinition(15, 15, 16384, GameKeyHandler.field_e, 0);
        mc.field_a[45] = new TrackObjectDefinition(20, 20, 16384, q.field_d, 0);
        mc.field_a[46] = new TrackObjectDefinition(10, 16384, co.field_b, 2);
        mc.field_a[47] = new TrackObjectDefinition(15, 16384, MusicCrossfadeStream.field_A, 2);
        mc.field_a[48] = new TrackObjectDefinition(20, 16384, uk.field_b, 2);
        mc.field_a[49] = new TrackObjectDefinition(25, 16384, ArchiveLoadProgress.field_c, 2);
        mc.field_a[50] = new TrackObjectDefinition(40, 16384, ri.field_a, 2);
        mc.field_a[51] = new TrackObjectDefinition(15, 32, ArchiveCatalog.field_l, 0);
        mc.field_a[52] = new TrackObjectDefinition(10, 32, fj.field_s, 0);
        mc.field_a[53] = new TrackObjectDefinition(5, 25, 32, ResourceArchive.field_f, 3);
        mc.field_a[54] = new TrackObjectDefinition(3, 40, ai.field_b, 3);
        mc.field_a[55] = new TrackObjectDefinition(80, 40, 32, um.field_e, 0);
        mc.field_a[56] = new TrackObjectDefinition(8, 4, 1146912, we.field_p, 0);
        mc.field_a[57] = new TrackObjectDefinition(15, 7, 32, EmailValidationResult.field_c, 0);
        mc.field_a[58] = new TrackObjectDefinition(10, 16384, jo.field_a, 2);
        mc.field_a[59] = new TrackObjectDefinition(15, 16384, hm.field_b, 2);
        mc.field_a[60] = new TrackObjectDefinition(20, 16384, Vector2f.field_b, 2);
        mc.field_a[61] = new TrackObjectDefinition(25, 16384, BlobReadRequest.field_i, 2);
        mc.field_a[62] = new TrackObjectDefinition(12, 6, 352, 0);
        mc.field_a[63] = new TrackObjectDefinition(12, 6, 352, 0);
        mc.field_a[64] = new TrackObjectDefinition(12, 6, 352, 0);
        mc.field_a[65] = new TrackObjectDefinition(12, 6, 352, 0);
        mc.field_a[66] = new TrackObjectDefinition(12, 6, 352, 0);
        mc.field_a[67] = new TrackObjectDefinition(12, 6, 352, 0);
        mc.field_a[68] = new TrackObjectDefinition(12, 6, 352, 0);
        mc.field_a[69] = new TrackObjectDefinition(12, 6, 352, 0);
        mc.field_a[70] = new TrackObjectDefinition(10, 10, 360488, DropTargetWidget.field_K, fk.field_c, -1);
        mc.field_a[71] = new TrackObjectDefinition(10, 10, 360489, jk.field_p, fk.field_c, -1);
        mc.field_a[72] = new TrackObjectDefinition(12, 360490, DirectByteStorage.field_g, -1);
    }

    public static void clearSharedReferences(int param0) {
        field_u = null;
        if (param0 != -21006) {
          GameMenu.clearJs5Errors(-12);
        }
        field_x = null;
    }

    private final void drawChampionshipSelection(boolean param0, int param1) {
        int stackIn_8_1 = 0;
        int stackIn_10_2 = 0;
        int stackIn_11_3 = 0;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        int var3;
        int var4;
        var4 = HoldTheLine.field_D;
        if (!param0) {
          this.handleChampionshipMouse(35);
        }
        var3 = 0;
        scanLoop1: while (true) {
          if (var3 < 4) {
            stackIn_18_1 = ~var3;
            stackIn_18_2 = ~GrowableStringList.field_a;
            if (var4 == 0) {
              if (stackIn_18_1 == stackIn_18_2) {
                stackIn_8_1 = 4210752;
              } else {
                stackIn_8_1 = RoadSegment.field_l[var3];
              }
              stackIn_10_2 = 2;
              if (~GrowableStringList.field_a == ~var3) {
                stackIn_11_3 = 16777215;
              } else {
                stackIn_11_3 = CourseDefinition.field_q[var3];
              }
              this.drawFramedSprite(stackIn_8_1, stackIn_10_2, stackIn_11_3, 2, var3 * 128 + 128 - param1, 110, 80, IndexedSpriteState.a(0, (byte) -83, var3), 60);
              var3++;
              continue;
            }
          } else {
            bn.a(BoundaryIntersection.field_p + 4, -107);
            if (pj.b((byte) 118)) {
              TutorialAction.a(30 - param1, 170, 580, (byte) 41, 260);
              var3 = 280;
              q.drawCenteredTextWithHighlight(EditableTextField.field_M, nm.field_c, 0, -param1 + 320, (byte) -128, var3 - nm.field_c.ascent);
              q.drawCenteredTextWithHighlight(ue.field_b, nm.field_c, 0, -param1 + 320, (byte) -127, var3);
              if (var4 == 0) {
                break scanLoop1;
              }
            }
            if (1 == this.transitionState) {
              this.drawChampionshipRecords(GameKeyHandler.field_b, -(int)this.carouselOffset + param1, PasswordValidator.field_j, (byte) 116);
              this.drawChampionshipRecords(pj.field_m, -(int)this.carouselOffset + (param1 + 640), BoundaryIntersection.field_p, (byte) -108);
              if (var4 == 0) {
                break scanLoop1;
              }
            }
            stackIn_18_1 = GameKeyHandler.field_b;
            stackIn_18_2 = param1;
          }
          this.drawChampionshipRecords(stackIn_18_1, stackIn_18_2, BoundaryIntersection.field_p, (byte) 83);
          break;
        }
        ni.field_a.drawCentered(QuickChatDynamicCommand.field_b, 320 + param1, 474, 0, -1);
        return;
    }

    private final void enterMenuTransition(int param0, boolean param1) {
        bn.a(7, -119);
        b.field_c.a(param1);
        if (CurvedRoadSegment.field_T) {
          GameKeyHandler.a((byte) 49);
        }
    }

    private final boolean isAchievementVisible(int param0, int param1) {
        int var3;
        int stackIn_5_0 = 0;
        boolean stackIn_11_0 = false;
        if (param1 != 176) {
          this.carouselOffset = 0.4921543300151825f;
        }
        stackIn_5_0 = ((1 << param0 & field_z) == 0) ? 0 : 1;
        var3 = stackIn_5_0;
        stackIn_11_0 = (var3 != 0) || (15 != param0) || (LoginCredentialType.a(16616, 0));
        return stackIn_11_0;
    }

    private final void drawFramedSprite(int param0, int param1, int param2, int param3, int param4, int param5, int param6, Sprite param7, int param8) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = HoldTheLine.field_D;
        try {
          var10_int = param4 - param6 / 2;
          var11 = param5 - param8 / param1;
          var12 = var10_int + param6;
          var13 = var11 + param8;
          var14 = 0;
          scanLoop1: while (true) {
            if (var14 < param3) {
              SoftwareRasterizer.drawHorizontalLine(var10_int + (-1 - var14), -var14 + (var11 - 1), var14 * 2 + (2 + param6), param2);
              SoftwareRasterizer.drawHorizontalLine(-var14 - 1 + var10_int, var13 + var14, param6 + 2 + var14 * 2, param0);
              SoftwareRasterizer.drawVerticalLine(var10_int - (1 + var14), var11 - var14, 2 * var14 + param8, param2);
              SoftwareRasterizer.drawVerticalLine(var12 + var14, var11 - var14, 2 * var14 + param8, param0);
              var14++;
              if (var15 == 0) {
                continue;
              }
            } else {
              if (param6 == param7.width &&
                param8 == param7.height) {
                break scanLoop1;
              }
              param7.drawScaled(var10_int, var11, param6, param8);
            }
            if (var15 == 0) {
              return;
            }
            break;
          }
          param7.drawUnkeyed(var10_int, var11);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_15_0 = var10;
          stackIn_15_1 = new StringBuilder().append("ti.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param8).append(')').toString());
        }
    }

    final void rebuildItems(int param0) {
        this.itemCount = AgeValidator.field_i[this.menuId].length;
        int var2 = 76 % ((param0 - 25) / 35);
        this.itemAnimationTimers = new int[this.itemCount];
    }

    final void update(int param0, boolean param1) {
        boolean stackIn_33_0 = false;
        int stackIn_90_0 = 0;
        int stackIn_90_1 = 0;
        int stackIn_107_0 = 0;
        int stackIn_107_1 = 0;
        int var3 = 0;
        float var3_float = 0.0f;
        int var4 = 0;
        int var5 = 0;
        int var3Lifetime1;
        var5 = HoldTheLine.field_D;
        if (ValidationIndicator.field_J == 1) {
          if (0 == this.transitionState) {
            ValidationIndicator.field_J = 0;
            this.showImmediately((byte) -116);
          }
          if (this.transitionState == 2 ||
            this.transitionState == 3) {
            ValidationIndicator.field_J = 0;
            this.finishExit((byte) -100);
          }
        }
        boolean decompiledFrameCompleted0 = true;
        if (this.menuId != 12 &&
          this.transitionState <= 1) {
          while (qh.c(-47)) {
            stackIn_107_0 = DelayedServerPacket.field_n;
            stackIn_107_1 = 13;
            if (var5 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
            if (stackIn_107_0 == stackIn_107_1 &&
              0 != this.menuId &&
              AgeValidator.field_i[this.menuId].length > 0 && (2 == AgeValidator.field_i[this.menuId][0] ||
              0 == AgeValidator.field_i[this.menuId][0] ||
              AgeValidator.field_i[this.menuId][0] == 4 ||
              AgeValidator.field_i[this.menuId][0] == 3)) {
              this.activateItem(0, -3565);
            }
            if (RotatedSpriteCache.field_c) {
              if (DelayedServerPacket.field_n == 28) {
                CurvedRoadSegment.field_T = false;
                wm.a(false, false, 12);
              }
              if (DelayedServerPacket.field_n == 1) {
                stackIn_33_0 = !(LoginCredentialType.field_c);
                LoginCredentialType.field_c = stackIn_33_0;
              }
            }
            if (RotatedSpriteCache.field_c &&
              DelayedServerPacket.field_n == 1 &&
              RotatedSpriteCache.field_c &&
              IterableSecondaryNodeDeque.field_g[82]) {
              ao.field_b = 3;
              l.field_b = true;
              hk.field_d = -1 + MenuList.field_l[3];
            }
            if (2 != this.menuId &&
              3 != this.menuId) {
              if (this.menuId == 10 ||
                11 == this.menuId) {
                this.handleRaceResultKeys(-1);
                continue;
              }
              if (this.menuId != 4 &&
                this.menuId != 5) {
                this.handleKey(true);
                continue;
              }
              this.handleKey(true);
              if (-1 == this.selectedItem) {
                continue;
              }
              if (AgeValidator.field_i[this.menuId][this.selectedItem] != 25) {
                continue;
              }
              if (!(2 <= TexturedRoadFillRenderer.field_h) ||
                ih.field_p != -1 + TextHotspotRange.field_i.length) {
                if (TexturedRoadFillRenderer.field_h > 0) {
                  continue;
                }
                if (0 != ih.field_p) {
                  continue;
                }
              }
              TexturedRoadFillRenderer.field_h = 1;
              continue;
            }
            this.handleChampionshipKeys(-1);
          }
          if ((decompiledFrameCompleted0) &&
            (na.field_k)) {
            this.handleMouse(12515);
            if (this.menuId == 2 ||
              this.menuId == 3) {
              this.handleChampionshipMouse(-5302);
            }
            if (10 == this.menuId ||
              this.menuId == 11) {
              this.handleRaceResultMouse((byte) -88);
            }
            if (this.menuId == 6 ||
              this.menuId == 7 ||
              this.menuId == 8 ||
              this.menuId == 9) {
              this.handleAchievementMouse((byte) 98);
            }
          }
        }
        if (decompiledFrameCompleted0) {
          var3 = 0;
          scanLoop1: while (true) {
            if (this.itemAnimationTimers.length > var3) {
              stackIn_90_0 = ~this.itemAnimationTimers[var3];
              stackIn_90_1 = -1;
              if (var5 == 0) {
                if (stackIn_90_0 < stackIn_90_1) {
                  this.itemAnimationTimers[var3] = this.itemAnimationTimers[var3] - 1;
                }
                var3++;
                continue;
              }
            } else {
              if (this.transitionState == 0) {
                if (this.enterTicks == 0) {
                  ValidationHelpWidget.a(17405, 64, 0, HuffmanDecoder.field_c.field_f);
                  ValidationHelpWidget.a(17405, 64, 256, HuffmanDecoder.field_c.field_h);
                }
                this.enterTicks = this.enterTicks + 1;
                if (~(this.itemCount * 5 + 25) != ~this.enterTicks) {
                  break scanLoop1;
                }
                this.transitionState = 1;
                if (var5 == 0) {
                  break scanLoop1;
                }
              }
              stackIn_90_0 = 2;
              stackIn_90_1 = this.transitionState;
            }
            if (stackIn_90_0 != stackIn_90_1) {
              if (this.transitionState != 3) {
                break scanLoop1;
              }
              this.closeDelayTicks = this.closeDelayTicks + 1;
              if (40 > this.closeDelayTicks) {
                break scanLoop1;
              }
              this.transitionState = 4;
              if (var5 == 0) {
                break scanLoop1;
              }
            }
            this.exitTicks = this.exitTicks + 1;
            var3 = this.exitTicks + 25 - 5 * (1 + this.itemCount);
            var4 = (int)((double)we.field_n * (-Math.exp((double)(0.20000000298023224f * (float)var3)) + 1.0));
            if (var4 < -260) {
              this.transitionState = 3;
            }
            break;
          }
          ImageProducerRasterBuffer.field_m = ImageProducerRasterBuffer.field_m + 1;
          if ((float)this.targetCarouselOffset != this.carouselOffset) {
            var3_float = (float)this.targetCarouselOffset - this.carouselOffset;
            this.carouselOffset = this.carouselOffset + var3_float * 0.20000000298023224f;
            if (1.0f > var3_float && (this.menuId == 2 ||
              this.menuId == 3)) {
              this.targetCarouselOffset = 0;
              this.carouselOffset = 0.0f;
              GameKeyHandler.field_b = pj.field_m;
              PasswordValidator.field_j = BoundaryIntersection.field_p;
            }
          }
          stackIn_107_0 = -125;
          stackIn_107_1 = (-30 - param0) / 62;
        }
        var3Lifetime1 = stackIn_107_0 % stackIn_107_1;
        if (this.menuId == 6 ||
          7 == this.menuId ||
          this.menuId == 8) {
          this.animateAchievementIcons(1);
        }
        if (this.menuId == 12) {
          this.updateMembershipPromotion(0, param1);
        }
    }

    final int hitTestItem(boolean param0, int param1, int param2) {
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        var7 = HoldTheLine.field_D;
        if (param0) {
          this.drawAchievementIcon(true, -31, -22, -74, -57, -16);
        }
        var4 = -1;
        var5 = 0;
        while (true) {
          if (!(this.itemCount > var5)) {
            stackIn_10_0 = var4;
            stackIn_10_1 = -1;
            break;
          }
          var6 = param1 - this.getItemY(var5, 6);
          stackIn_10_0 = -1;
          stackIn_10_1 = ~var6;
          if (var7 == 0) {
            if (stackIn_10_0 >= stackIn_10_1 &&
              var6 <= 30) {
              var4 = var5;
            }
            var5++;
            continue;
          }
          break;
        }
        if (stackIn_10_0 == stackIn_10_1) {
          return -1;
        }
        if (AgeValidator.field_i[this.menuId][var4] == 5) {
          LinearPointPath.field_o = fj.a(SpriteSheetAsset.field_c, (byte) -119, param2);
          return var4;
        }
        if (AgeValidator.field_i[this.menuId][var4] == 10) {
          LinearPointPath.field_o = fj.a(TexturedRoadFillRenderer.field_l, (byte) -119, param2);
          return var4;
        }
        if (AgeValidator.field_i[this.menuId][var4] == 24) {
          ArchiveRequest.field_s = fj.a(DiskCacheWorker.field_a, (byte) -119, param2);
          return var4;
        }
        if (AgeValidator.field_i[this.menuId][var4] == 25) {
          TexturedRoadFillRenderer.field_h = fj.a(SpriteButtonRenderer.field_v, (byte) -119, param2);
          return var4;
        }
        if (param2 >= this.left &&
          this.right > param2) {
          return var4;
        }
        return -1;
    }

    private final int getItemY(int param0, int param1) {
        int var4 = -87 % ((param1 + 65) / 43);
        int var3 = 10 != this.menuId ? 0 : (int)this.carouselOffset;
        if (this.menuId == 1) {
          return param0 == 0 ? 43 : 35 * (param0 - 1) + 165 - var3;
        }
        if (AgeValidator.field_i[this.menuId][param0] == 26) {
          return 445;
        }
        return -var3 + ((this.menuId != 0 ? 43 : 165) + 35 * param0);
    }

    final void handleItemPress(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        var12 = HoldTheLine.field_D;
        var7 = 50 - this.enterTicks + 5 * param1;
        if (0 > var7) {
          var7 = 0;
        }
        var7 = var7 + this.itemAnimationTimers[param1];
        if (this.transitionState == 4) {
          param0 = 0;
          if ((var12 != 0) &&
            (3 == this.transitionState)) {
            param0 = (int)((double)param0 * ((-1.0 + Math.exp((double)((float)(-this.closeDelayTicks + 40) * 0.20000000298023224f))) / (-1.0 + Math.exp(8.0))));
          }
        } else {
          if (3 == this.transitionState) {
            param0 = (int)((double)param0 * ((-1.0 + Math.exp((double)((float)(-this.closeDelayTicks + 40) * 0.20000000298023224f))) / (-1.0 + Math.exp(8.0))));
          }
        }
        var8 = 123 % ((-51 - param3) / 46);
        if (this.transitionState == 2 &&
          param1 != this.field_v) {
          var7 = -(5 * (-param1 + this.itemCount)) + (25 + this.exitTicks);
          if (var7 < 0) {
            var7 = 0;
          }
        }
        boolean decompiledFrameRemainder1 = true;
        boolean decompiledFrameRemainder0 = true;
        var9 = (int)((double)we.field_n * (-Math.exp((double)((float)var7 * 0.20000000298023224f)) + 1.0));
        var10 = AgeValidator.field_i[this.menuId][param1];
        var11 = var10;
        decompiledFrameRemainder0 = ((var11 == 18 &&
          var12 == 0) || var11 == 19);
        if (decompiledFrameRemainder0) {
          if (var11 == 18 &&
            var12 == 0 || var12 != 0) {
            param4 = param4 - (var9 + 165);
            if (0 < param4) {
              if (128 <= param4) {
                SecondaryNodeDeque.field_d = 256;
                if (var12 != 0) {
                  SecondaryNodeDeque.field_d = 256 * param4 / 128;
                  SecondaryNodeDeque.field_d = 0;
                }
              } else {
                SecondaryNodeDeque.field_d = 256 * param4 / 128;
                if (var12 != 0) {
                  SecondaryNodeDeque.field_d = 0;
                }
              }
            } else {
              SecondaryNodeDeque.field_d = 0;
            }
            decompiledFrameRemainder1 = !(-ValidationHelpWidget.field_S + ImageProducerRasterBuffer.field_m <= 20);
            if (decompiledFrameRemainder1) {
              MatchingTextValidator.a(293, StrongCacheEntry.field_r);
              ValidationHelpWidget.field_S = ImageProducerRasterBuffer.field_m;
            }
          }
          if (decompiledFrameRemainder1) {
            if ((var11 != 18 ||
              var12 != 0) && var12 == 0 || var12 != 0) {
              param4 = param4 - (-7 + (172 + var9));
              if (param4 <= 0) {
                ll.a(-111, 0);
              }
              if (!(param4 <= 0) ||
                var12 != 0) {
                if (param4 >= 128) {
                  ll.a(93, 160);
                }
                if (!(param4 >= 128) ||
                  var12 != 0) {
                  ll.a(-128, param4 * 160 / 128);
                  decompiledFrameRemainder0 = (var12 == 0);
                }}}
            decompiledFrameRemainder1 = !(decompiledFrameRemainder0);
          }
        }
        if (decompiledFrameRemainder1) {
          super.handleItemPress(param0, param1, param2, 81, param4, param5);
        }

    }

    final void activateItem(int param0, int param1) {
        if (param1 != -3565) {
          this.itemAnimationTimers = (int[]) null;
        }
        if (0 == this.menuId) {
          StrongCacheEntry.field_v = param0;
        }
        MatchingTextValidator.a(293, StrongCacheEntry.field_r);
        this.activateMenuAction(AgeValidator.field_i[this.menuId][param0], !this.keyboardSelection ? true : false, 103);
    }

    private final void animateAchievementIcons(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_9_0 = 0;
        var4 = HoldTheLine.field_D;
        var2 = 0;
        if (param0 != 1) {
          return;
        }
        while (var2 < 16) {
          if (var4 == 0) {
            if (TutorialTransition.field_e == var2) {
              stackIn_9_0 = 48;
            } else {
              stackIn_9_0 = (~WidgetContainer.field_E != ~var2) ? 32 : 40;
            }
            var3 = stackIn_9_0;
            if (SecondaryNodeDequeIterator.field_h[var2] <= var3) {
              if (!(SecondaryNodeDequeIterator.field_h[var2] >= var3)) {
                SecondaryNodeDequeIterator.field_h[var2] = SecondaryNodeDequeIterator.field_h[var2] + 1;
              }
            } else {
              SecondaryNodeDequeIterator.field_h[var2] = SecondaryNodeDequeIterator.field_h[var2] - 1;
            }
            var2++;
            continue;
          }
          break;
        }
    }

    private final void drawChampionshipRecords(int param0, int param1, int param2, byte param3) {
        long[] dupTemp$0 = null;
        int stackIn_23_1 = 0;
        Sprite stackIn_23_2 = null;
        int stackIn_24_3 = 0;
        Object stackIn_26_0;
        int stackIn_26_4;
        int stackIn_26_5;
        int stackIn_26_6;
        Object stackIn_27_0;
        int stackIn_27_7;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_68_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_78_0 = 0;
        String stackIn_102_0 = null;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        String[][] var7 = null;
        int var8 = 0;
        String[] var9 = null;
        String var9_ref = null;
        Sprite var10_ref_hj = null;
        long[] var10_ref_long__ = null;
        int var10 = 0;
        int[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16_int = 0;
        String var16 = null;
        int var17 = 0;
        String var18 = null;
        int var19 = 0;
        int var20 = 0;
        String[] var21 = null;
        long[] var22 = null;
        CourseDefinition var23 = null;
        String var24 = null;
        var20 = HoldTheLine.field_D;
        var6 = 6 / ((23 - param3) / 55);
        var7_int = param2;
        switch ((var20 == 0
          || var7_int == 0
          || var7_int == 3
          ) ? var7_int : -1) {
          case 0:
            var5 = 32;
            if (var20 == 0) {
              break;
            }
          case 1:
            var5 = 34;
            if (var20 == 0) {
              break;
            }
          case 2:
            var5 = 33;
            if (var20 == 0) {
              break;
            }
          case 3:
            var5 = 35;
            if (var20 == 0) {
              break;
            }
          default:
            throw new RuntimeException();
        }
        TutorialAction.a(30 - param1, 170, 580, (byte) 41, 260);
        if (null == RotatedSpriteCache.field_g[param2] &&
          -1 != var5) {
          RotatedSpriteCache.field_g[param2] = il.a(5, 3, var5, 10, (byte) -66);
        }
        var7 = RotatedSpriteCache.field_g[param2].field_m;
        var8 = 0;
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (var8 >= 4))) {
          var23 = tk.field_c[param2][var8];
          var23.pollLoaded(3);
          var10_ref_hj = var23.getPreview(9392, 0, 60);
          if (var20 == 0) {
            if (var10_ref_hj != null) {
              stackIn_23_1 = -141;
              stackIn_23_2 = var10_ref_hj;
              if (~var8 != ~ArchiveCatalog.field_j) {
                stackIn_24_3 = CourseDefinition.field_q[param2];
              } else {
                stackIn_24_3 = 16777215;
              }
              stackIn_26_0 = this;
              stackIn_26_4 = -param1 + (32 + TextHotspotWidget.field_K[var8]);
              stackIn_26_5 = 190;
              stackIn_26_6 = 2;
              if (ArchiveCatalog.field_j != var8) {
                stackIn_27_0 = this;
                stackIn_27_7 = RoadSegment.field_l[param2];
              } else {
                stackIn_27_0 = this;
                stackIn_27_7 = 0;
              }
              this.drawFramedSprite(stackIn_23_1, stackIn_23_2, stackIn_24_3, stackIn_26_4, stackIn_26_5, stackIn_26_6, stackIn_27_7);
            }
            var8++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          q.drawCenteredTextWithHighlight(IntHashTable.field_a, HoldTheLine.field_F, 0, 280 - param1, (byte) -127, 204);
          var8 = 0;
        }
        boolean decompiledFrameCompleted1 = true;
        boolean decompiledFrameCompleted0 = true;
        if (var7 != null) {
          var21 = var7[param0];
          var9 = var21;
          dupTemp$0 = RotatedSpriteCache.field_g[param2].field_k[param0];
          var22 = dupTemp$0;
          var10_ref_long__ = dupTemp$0;
          var11 = RotatedSpriteCache.field_g[param2].field_p[param0];
          var12 = -1;
          var13 = -1;
          var14 = 0;
          var15 = 0;
          while (var15 < 10) {
            stackIn_102_0 = var21[var15];
            if (var20 != 0) {
              decompiledFrameCompleted1 = false;
              break;
            }
            if (stackIn_102_0 != null ||
              var20 != 0) {
              if (PathWaypoint.field_o != null &&
                LoadProgressDialog.isLocalPlayerName(var21[var15], false) &&
                PathWaypoint.field_o.field_m == var22[var15]) {
                var16_int = 1;
                var17 = 0;
                while (true) {
                  if (var17 < 4) {
                    stackIn_52_0 = ~PathWaypoint.field_o.field_r[var17];
                    stackIn_52_1 = ~var11[5 * var15 + var17];
                    if (stackIn_52_0 != stackIn_52_1) {
                      var16_int = 0;
                    } else {
                      var17++;
                      continue;
                    }
                  }
                  if (var16_int == 0) {
                    break;
                  }
                  var12 = var15;
                  break;
                }
              }
              stackIn_52_0 = 0;
              stackIn_52_1 = ~ArchiveCatalog.field_j;
              if (stackIn_52_0 != stackIn_52_1 && (var13 == -1 ||
                var14 > var11[var15 * 5 + 1 + ArchiveCatalog.field_j])) {
                var13 = var15;
                var14 = var11[1 + 5 * var15 + ArchiveCatalog.field_j];
              }
            }
            var15++;
          }
          if (decompiledFrameCompleted1) {
            var15 = 220 + nm.field_c.ascent - 6;
            var16_int = 0;
            while (10 > var16_int) {
              stackIn_102_0 = var21[var16_int];
              if (var20 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_102_0 != null) {
                if (~var12 != ~var16_int) {
                  stackIn_68_0 = (~var13 != ~var16_int) ? 0 : 3;
                } else {
                  stackIn_68_0 = 5;
                }
                var17 = stackIn_68_0;
                var18 = var21[var16_int];
                LinkWidgetRenderer.a(-param1 + 54, 1 + var16_int + ". ", true, HoldTheLine.field_F, var15, var17);
                GrowableObjectList.a(54 - param1, 1, var18, var17, var15, HoldTheLine.field_F);
                if (var12 != var16_int) {
                  stackIn_73_0 = (var13 != var16_int) ? 1 : 2;
                } else {
                  stackIn_73_0 = 5;
                }
                var17 = stackIn_73_0;
                GrowableObjectList.a(-param1 + 235, 1, DisplayNameValidator.formatPreciseRaceTime(42, -var11[5 * var16_int]), var17, var15, HoldTheLine.field_F);
                if (~var16_int != ~var13) {
                  stackIn_78_0 = (var12 != var16_int) ? 0 : 5;
                } else {
                  stackIn_78_0 = 3;
                }
                var17 = stackIn_78_0;
                var19 = 0;
                while (var19 < 4) {
                  q.drawCenteredTextWithHighlight(AccountFormText.formatRaceTime(var11[5 * var16_int - (-1 - var19)], (byte) -61), HoldTheLine.field_F, var17, 32 + TextHotspotWidget.field_K[var19] - param1, (byte) -127, var15);
                  var19++;
                }
                var8 = 1;
              }
              var16_int++;
              var15 += 20;
            }
            if ((decompiledFrameCompleted0) && (-1 == var12 &&
              PathWaypoint.field_o != null &&
              var5 == PathWaypoint.field_o.field_j)) {
              var16 = QuickChatPhraseCache.field_e;
              GrowableObjectList.a(-param1 + 54, 1, var16, 5, var15, HoldTheLine.field_F);
              GrowableObjectList.a(240 - param1, 1, DisplayNameValidator.formatPreciseRaceTime(48, -PathWaypoint.field_o.field_r[0]), 5, var15, HoldTheLine.field_F);
              var17 = 0;
              while (var17 < 4) {
                q.drawCenteredTextWithHighlight(AccountFormText.formatRaceTime(PathWaypoint.field_o.field_r[1 + var17], (byte) -61), HoldTheLine.field_F, 5, TextHotspotWidget.field_K[var17] + (32 - param1), (byte) -127, var15);
                var17++;
                if (var20 != 0) {
                  return;
                }
              }
            }
          }
        }
        if ((decompiledFrameCompleted1) &&
          (decompiledFrameCompleted0)) {
          if (var8 != 0) {
            return;
          }
          if (40 <= ImageProducerRasterBuffer.field_m % 80) {
            return;
          }
          if (var7 == null) {
            stackIn_102_0 = fm.field_b;
          } else {
            if (!RotatedSpriteCache.field_g[param2].field_j) {
              stackIn_102_0 = ri.field_d;
            } else {
              stackIn_102_0 = GzipDecompressor.field_d;
            }
          }
        }
        var24 = stackIn_102_0;
        var9_ref = var24;
        var10 = 90 + (220 + nm.field_c.ascent);
        nm.field_c.drawCentered(var24, 337 - param1, var10, 0, -1);
        return;
    }

    private final void handleChampionshipKeys(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_6_1 = 0;
        if (99 != DelayedServerPacket.field_n &&
          DelayedServerPacket.field_n != 98) {
          boolean decompiledFrameRemainder0 = true;
          if (this.selectedItem != 0) {
            if (this.selectedItem == 1) {
              if (DelayedServerPacket.field_n == 84) {
                MatchingTextValidator.a(293, StrongCacheEntry.field_r);
                if (GrowableStringList.field_a != -1 &&
                  GrowableStringList.field_a != BoundaryIntersection.field_p) {
                  if (~pj.field_m != ~GameKeyHandler.field_b ||
                    ~PasswordValidator.field_j != ~BoundaryIntersection.field_p) {
                    PasswordValidator.field_j = BoundaryIntersection.field_p;
                    this.carouselOffset = this.carouselOffset - 640.0f;
                    GameKeyHandler.field_b = pj.field_m;
                  }
                  this.targetCarouselOffset = 640;
                  BoundaryIntersection.field_p = GrowableStringList.field_a;
                }
              }
              if (DelayedServerPacket.field_n == 96) {
                fieldTemp$0 = GrowableStringList.field_a - 1;
                GrowableStringList.field_a = GrowableStringList.field_a - 1;
                if (fieldTemp$0 < 0) {
                  GrowableStringList.field_a = 3;
                }
              }
              if (97 == DelayedServerPacket.field_n) {
                fieldTemp$1 = GrowableStringList.field_a + 1;
                GrowableStringList.field_a = GrowableStringList.field_a + 1;
                if (fieldTemp$1 >= 4) {
                  GrowableStringList.field_a = 0;
                  decompiledFrameRemainder0 = (HoldTheLine.field_D == 0);
                }
              }
            }
            if (decompiledFrameRemainder0) {
              if (param0 != -1) {
                field_u = (HuffmanDecoder) null;
              }
              return;
            }
          }
          this.handleItemKey(this.selectedItem, -24489);
          return;
        }
        if (0 != this.selectedItem) {
          stackIn_6_1 = 0;
        } else {
          stackIn_6_1 = 1;
        }
        this.selectedItem = stackIn_6_1;
        if (this.selectedItem != 1) {
          return;
        }
        if (GrowableStringList.field_a == -1) {
          GrowableStringList.field_a = 0;
        }
    }

    final void decreaseItemValue(int param0, int param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_30_0 = 0;
        int var3;
        int var4;
        var4 = HoldTheLine.field_D;
        if (param0 != 1) {
          this.beginExit(-61);
        }
        var3 = AgeValidator.field_i[this.menuId][param1];
        switch ((var4 == 0
          || var3 == 19
          || var3 == 25
          ) ? var3 : -1) {
          case 10:
          case 5:
            fieldTemp$0 = LinearPointPath.field_o - 1;
            LinearPointPath.field_o = LinearPointPath.field_o - 1;
            if (fieldTemp$0 >= 0) {
              break;
            }
            LinearPointPath.field_o = 1;
            if (var4 == 0) {
              break;
            }
          case 24:
            fieldTemp$1 = ArchiveRequest.field_s - 1;
            ArchiveRequest.field_s = ArchiveRequest.field_s - 1;
            if (fieldTemp$1 >= 0) {
              break;
            }
            ArchiveRequest.field_s = 3;
            if (var4 == 0) {
              break;
            }
          case 25:
            fieldTemp$2 = TexturedRoadFillRenderer.field_h - 1;
            TexturedRoadFillRenderer.field_h = TexturedRoadFillRenderer.field_h - 1;
            stackIn_25_0 = ~fieldTemp$2;
            if (ih.field_p != 0) {
              stackIn_26_1 = 0;
            } else {
              stackIn_26_1 = 1;
            }
            if (stackIn_25_0 <= ~stackIn_26_1) {
              break;
            }
            stackIn_30_0 = (-1 + TextHotspotRange.field_i.length != ih.field_p) ? 2 : 1;
            TexturedRoadFillRenderer.field_h = stackIn_30_0;
            if (var4 == 0) {
              break;
            }
          case 18:
            if (SecondaryNodeDeque.field_d > 32) {
              SecondaryNodeDeque.field_d = -32 + 32 * ((SecondaryNodeDeque.field_d * 8 + 256 - 1) / 256);
              MatchingTextValidator.a(293, StrongCacheEntry.field_r);
              if (var4 == 0) {
                break;
              }
            }
            if (0 >= SecondaryNodeDeque.field_d) {
              break;
            }
            SecondaryNodeDeque.field_d = 0;
            MatchingTextValidator.a(293, StrongCacheEntry.field_r);
            if (var4 == 0) {
              break;
            }
          case 19:
            if (NanoTickClock.field_e > 20) {
              ll.a(param0 ^ -123, (-1 + (-1 + (8 * NanoTickClock.field_e + 160)) / 160) * 20);
              if (var4 == 0) {
                break;
              }
            }
            ll.a(49, 0);
            break;
          default:
            break;
        }
    }

    GameMenu(int param0) {
        super(AgeValidator.field_i[param0].length, 15, 360, 165, 35);
        this.menuId = param0;
        this.itemAnimationTimers = new int[AgeValidator.field_i[param0].length];
        EditableTextField.field_J = new int[16];
        SecondaryNodeDequeIterator.field_h = new int[16];
        dm.field_e = new int[16];
        ArchiveIndex.field_b = new int[16];
        co.field_d = new int[16];
        this.reset(false, -116);
    }

    final void drawItem(int param0, int param1, boolean param2, byte param3) {
        String[] array$0 = null;
        String stackIn_35_0 = null;
        int stackIn_56_0 = 0;
        int[] stackIn_72_0 = null;
        String[] stackIn_72_1 = null;
        int stackIn_72_2 = 0;
        int stackIn_74_3 = 0;
        int[] stackIn_79_0 = null;
        String[] stackIn_79_1 = null;
        int stackIn_79_2 = 0;
        int stackIn_80_3 = 0;
        int[] stackIn_85_0 = null;
        String[] stackIn_85_1 = null;
        int stackIn_85_2 = 0;
        int stackIn_87_3 = 0;
        String[] stackIn_102_0 = null;
        String[] stackIn_102_1 = null;
        int stackIn_102_2 = 0;
        String stackIn_103_3 = null;
        int stackIn_105_2 = 0;
        String stackIn_106_3 = null;
        int[] stackIn_109_0 = null;
        String[] stackIn_109_1 = null;
        int stackIn_109_2 = 0;
        int stackIn_111_3 = 0;
        int[] stackIn_115_0 = null;
        String[] stackIn_115_1 = null;
        int stackIn_115_2 = 0;
        int stackIn_117_3;
        int stackIn_124_0 = 0;
        int var5;
        int var6;
        float var7_float;
        int var7;
        String var8;
        int var9;
        int var10;
        String var10_ref_String;
        int var11;
        String[] var11_ref_String__;
        int var12;
        int var13;
        int var14;
        String var15;
        int var10Lifetime1;
        int var11Lifetime1;
        var14 = HoldTheLine.field_D;
        var5 = AgeValidator.field_i[this.menuId][param1];
        if (this.transitionState >= 3 &&
          var5 != this.field_v) {
          return;
        }
        if (param3 >= -75) {
          this.beginExitFromCurrentPosition(-38);
        }
        var6 = 50 - (this.enterTicks - 5 * param1);
        if (var6 < 0) {
          var6 = 0;
        }
        var6 = var6 + this.itemAnimationTimers[param1];
        if (this.transitionState == 4) {
          param0 = 0;
          if ((var14 != 0) &&
            (this.transitionState == 3)) {
            var7_float = (float)((Math.exp((double)((float)(40 - this.closeDelayTicks) * 0.20000000298023224f)) - 1.0) / (Math.exp(8.0) - 1.0));
            param0 = (int)((float)param0 - (float)(param0 - 8) * (1.0f - var7_float));
          }
        } else {
          if (this.transitionState == 3) {
            var7_float = (float)((Math.exp((double)((float)(40 - this.closeDelayTicks) * 0.20000000298023224f)) - 1.0) / (Math.exp(8.0) - 1.0));
            param0 = (int)((float)param0 - (float)(param0 - 8) * (1.0f - var7_float));
          }
        }
        if (2 == this.transitionState &&
          ~var5 != ~this.field_v) {
          var6 = 25 + (this.exitTicks - (-param1 + this.itemCount) * 5);
          if (var6 < 0) {
            var6 = 0;
          }
        }
        var7 = (int)((double)we.field_n * (-Math.exp((double)((float)var6 * 0.20000000298023224f)) + 1.0));
        var15 = uk.field_c[var5];
        var8 = var15;
        var8 = var15;
        var8 = var15;
        if (var15 != null &&
          this.menuId == 0 ||
          this.menuId == 1) {
          var8 = var15.toUpperCase();
        }
        if (var5 == 3) {
          if (TextLayout.field_a != 0 &&
            0 != ByteStorage.field_b) {
            if (TextLayout.field_a == 1 ||
              ByteStorage.field_b == 1) {
              var8 = Bzip2State.field_J;
              if (var14 != 0) {
                var8 = uk.field_c[0];
              }
            }
          } else {
            var8 = uk.field_c[0];
          }
        }
        if (var5 == 6) {
          if (CheckboxRenderer.field_x != 1) {
            stackIn_35_0 = hk.field_b;
          } else {
            stackIn_35_0 = DialogLayer.field_J;
          }
          var8 = stackIn_35_0;
        }
        if (12 == var5 &&
          NameAvailabilityResult.field_e) {
          var8 = PathWaypoint.field_p.toUpperCase();
        }
        if (var5 == 7 &&
          MusicPatchPcmStream.field_r != null &&
          3 == MusicPatchPcmStream.field_r.field_J) {
          var8 = sa.field_c.toUpperCase();
        }
        if (var5 == 8) {
          if (this.menuId == 10 &&
            0.0f < this.carouselOffset &&
            CheckboxRenderer.field_x == 3) {
            var8 = IntrusiveNode.field_c.toUpperCase();
            if (var14 != 0) {
              var8 = ka.field_e.toUpperCase();
            }
          } else {
            var8 = ka.field_e.toUpperCase();
          }
        }
        if (var8 == null) {
          var8 = "ERROR: missing text";
        }
        if (param2 &&
          this.transitionState == 1) {
          stackIn_56_0 = 2;
        } else {
          stackIn_56_0 = 1;
        }
        var9 = stackIn_56_0;
        if (this.field_v == var5 && (this.transitionState == 3 ||
          this.transitionState == 2)) {
          var9 = 5;
        }
        boolean decompiledFrameRemainder0 = true;
        if (var5 != 24) {
          if (var5 != 25) {
            if (26 == var5) {
              BlobWriteRequest.drawTitleBar(var8, var7, var9, -1753, param0);
              decompiledFrameRemainder0 = (var14 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (var5 == 0 ||
                var5 == 3) {
                stackIn_72_0 = PacketBuffer.field_k;
                stackIn_72_1 = new String[]{var8};
                stackIn_72_2 = 82;
                if (param2 &&
                  this.transitionState == 1) {
                  stackIn_74_3 = 0;
                } else {
                  stackIn_74_3 = -1;
                }
                fk.a(stackIn_72_0, stackIn_72_1, stackIn_72_2, stackIn_74_3, param0, -1, var7);
                decompiledFrameRemainder0 = (var14 != 0);
              }
              if (decompiledFrameRemainder0) {
                if (var5 == 5) {
                  stackIn_79_0 = SpriteSheetAsset.field_c;
                  stackIn_79_1 = PacketBuffer.field_n;
                  stackIn_79_2 = -120;
                  if (param2 &&
                    1 == this.transitionState) {
                    stackIn_80_3 = LinearPointPath.field_o;
                  } else {
                    stackIn_80_3 = -1;
                  }
                  fk.a(stackIn_79_0, stackIn_79_1, stackIn_79_2, stackIn_80_3, param0, -1, var7);
                  decompiledFrameRemainder0 = (var14 != 0);
                }
                if (decompiledFrameRemainder0) {
                  if (var5 == 10) {
                    stackIn_85_0 = TexturedRoadFillRenderer.field_l;
                    stackIn_85_1 = ReflectionCheck.field_i;
                    stackIn_85_2 = -127;
                    if (param2 &&
                      this.transitionState == 1) {
                      stackIn_87_3 = LinearPointPath.field_o;
                    } else {
                      stackIn_87_3 = -1;
                    }
                    fk.a(stackIn_85_0, stackIn_85_1, stackIn_85_2, stackIn_87_3, param0, -1, var7);
                    decompiledFrameRemainder0 = (var14 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    if (var5 == this.field_v &&
                      this.transitionState == 3) {
                      var10 = (-this.closeDelayTicks + 80) * this.closeDelayTicks;
                      var10 = (-var10 + 3200) * var10;
                      var11 = var10 * 381 / 2560000;
                      var12 = (-nm.field_c.measureText(var8) + 640) / 2;
                      var13 = 15 + var10 * (-15 + var12) / 2560000;
                      RoadStripRenderer.a(var11, var9, (byte) -83, var13, param0, var8);
                      decompiledFrameRemainder0 = (var14 != 0);
                    }
                    if (decompiledFrameRemainder0) {
                      WidgetContainer.drawHeader((byte) -122, var8, var9, var7, param0);
                      decompiledFrameRemainder0 = (var14 != 0);
                    }
                  }
                }
              }
            }
          }
          if (decompiledFrameRemainder0) {
            var10_ref_String = uk.field_c[3];
            if (0 != TextLayout.field_a &&
              ByteStorage.field_b != 0) {
              if (TextLayout.field_a == 1 ||
                ByteStorage.field_b == 1) {
                var10_ref_String = Bzip2State.field_J;
                if (var14 != 0) {
                  var10_ref_String = uk.field_c[0];
                }
              }
            } else {
              var10_ref_String = uk.field_c[0];
            }
            array$0 = new String[3];
            stackIn_102_0 = array$0;
            stackIn_102_1 = array$0;
            stackIn_102_2 = 0;
            if (0 >= ih.field_p) {
              stackIn_103_3 = "";
            } else {
              stackIn_103_3 = CachedTextLayout.field_r;
            }
            stackIn_102_1[stackIn_102_2] = stackIn_103_3;
            stackIn_102_0[1] = var10_ref_String;
            stackIn_105_2 = 2;
            if (ih.field_p >= 6) {
              stackIn_106_3 = "";
            } else {
              stackIn_106_3 = ByteStorage.field_d;
            }
            stackIn_102_0[stackIn_105_2] = stackIn_106_3;
            var11_ref_String__ = stackIn_102_0;
            stackIn_109_0 = SpriteButtonRenderer.field_v;
            stackIn_109_1 = var11_ref_String__;
            stackIn_109_2 = -111;
            if (param2 &&
              this.transitionState == 1) {
              stackIn_111_3 = TexturedRoadFillRenderer.field_h;
            } else {
              stackIn_111_3 = -1;
            }
            fk.a(stackIn_109_0, stackIn_109_1, stackIn_109_2, stackIn_111_3, param0, -1, var7);
            if (var14 != 0) {
              stackIn_115_0 = DiskCacheWorker.field_a;
              stackIn_115_1 = DropTargetWidget.field_L;
              stackIn_115_2 = -121;
              if (param2 &&
                1 == this.transitionState) {
                stackIn_117_3 = ArchiveRequest.field_s;
              } else {
                stackIn_117_3 = -1;
              }
              fk.a(stackIn_115_0, stackIn_115_1, stackIn_115_2, stackIn_117_3, param0, 1 + pj.field_m, var7);
            }
          }
        } else {
          stackIn_115_0 = DiskCacheWorker.field_a;
          stackIn_115_1 = DropTargetWidget.field_L;
          stackIn_115_2 = -121;
          if (param2 &&
            1 == this.transitionState) {
            stackIn_117_3 = ArchiveRequest.field_s;
          } else {
            stackIn_117_3 = -1;
          }
          fk.a(stackIn_115_0, stackIn_115_1, stackIn_115_2, stackIn_117_3, param0, 1 + pj.field_m, var7);
        }
        if (18 == var5 ||
          var5 == 19) {
          if (var5 == 18) {
            stackIn_124_0 = SecondaryNodeDeque.field_d * 128 / 256;
          } else {
            stackIn_124_0 = NanoTickClock.field_e * 128 / 160;
          }
          var10Lifetime1 = stackIn_124_0;
          var11Lifetime1 = 172 + var7;
          this.drawVolumeSlider(param0, (byte) -52, var11Lifetime1, var10Lifetime1);
        }
    }

    private final void drawRacePreviewPanel(int param0) {
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        boolean stackIn_9_3 = false;
        int stackIn_31_0;
        int stackIn_31_1;
        int stackIn_31_2;
        int stackIn_31_3;
        int stackIn_33_4 = 0;
        int stackIn_36_0;
        int stackIn_36_1;
        int stackIn_36_2;
        int stackIn_36_3;
        int stackIn_38_4;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        String stackIn_65_0 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        float var8_float = 0.0f;
        CourseDefinition var8 = null;
        float var9_float = 0.0f;
        int[] var9 = null;
        float var10_float = 0.0f;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int var14_int = 0;
        String var14 = null;
        float var15 = 0.0f;
        float var16 = 0.0f;
        int var17 = 0;
        int var18 = 0;
        int[] var19 = null;
        int[] var20 = null;
        int var3Lifetime1;
        int var4Lifetime1;
        float var9_floatLifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var11Lifetime1Lifetime1;
        var18 = HoldTheLine.field_D;
        var2 = -(int)this.carouselOffset + 570;
        if (this.transitionState <= 2) {
          var3 = 0;
          if (this.transitionState == 2) {
            var4 = this.exitTicks + 25 - (this.itemCount + 1) * 5;
            var3 = (int)((double)we.field_n * (-Math.exp((double)(0.20000000298023224f * (float)var4)) + 1.0));
          }
          BlobWriteRequest.drawTitleBar(MusicPatchEnvelope.field_e, var3, 1, -1753, 488 - (int)this.carouselOffset);
        }
        var3Lifetime1 = 0;
        if (param0 != -10967) {
          this.transitionState = 8;
        }
        var4Lifetime1 = 298;
        var5 = 224;
        var6 = 331;
        var7 = 10 + var2;
        stackIn_8_1 = this.getItemY(0, -110) + 480;
        stackIn_8_2 = 0;
        stackIn_9_3 = (this.selectedItem == 0);
        boolean decompiledFrameRemainder0 = true;
        this.drawItem(stackIn_8_1, stackIn_8_2, stackIn_9_3, (byte) -94);
        if (this.transitionState == 0) {
          var8_int = 80;
          var9_float = 0.10000000149011612f;
          var10_float = (float)Math.exp((double)(-var9_float * 80.0f));
          var11 = -ImageProducerRasterBuffer.field_m + var8_int;
          var3Lifetime1 = (int)((Math.exp((double)(var9_float * (float)var11)) - 1.0) * (double)(300.0f * var10_float)) - 10;
          var6 = var6 + (-5 + (int)((Math.exp((double)(var9_float * (float)(-5 + var11))) - 1.0) * (double)(var10_float * 300.0f)));
          decompiledFrameRemainder0 = (var18 != 0);
        }
        if (decompiledFrameRemainder0) {
          if (this.transitionState == 2 &&
            ByteStorage.field_b != -1) {
            var8_float = 0.10000000149011612f;
            var9_floatLifetime1 = (float)Math.exp((double)(-var8_float * 80.0f));
            var10 = this.exitTicks + 40;
            var3Lifetime1 = (int)((-1.0 + Math.exp((double)(var8_float * (float)var10))) * (double)(300.0f * var9_floatLifetime1));
            var6 = var6 + (int)((-1.0 + Math.exp((double)(var8_float * (float)(var10 + 5)))) * (double)(var9_floatLifetime1 * 300.0f));
          } else {
            if (2 < this.transitionState &&
              ByteStorage.field_b != -1) {
              return;
            }
            if (1 < this.transitionState &&
              ByteStorage.field_b == -1) {
              var8_float = 0.20000000298023224f;
              var9_floatLifetime1 = -(float)Math.exp((double)(-var8_float * (float)ImageProducerRasterBuffer.field_m)) + 1.0f;
              var4Lifetime1 = (int)(var9_floatLifetime1 * 342.0f) + 298;
              var6 = (int)((1.0f - var9_floatLifetime1) * (float)var6);
              var5 = (int)(var9_floatLifetime1 * 256.0f) + 224;
              var3Lifetime1 = (int)(600.0f * var9_floatLifetime1);
              var7 = (int)((float)var7 * (-var9_floatLifetime1 + 1.0f));
              if (var18 != 0) {
                return;
              }
            }
          }
        }
        var8 = ArchiveIndex.b((byte) -49);
        nm.field_c.drawCentered(ue.field_c + var8.field_b, var3Lifetime1 + 320, var2, 0, -1);
        var2 += 15;
        if (we.field_o == null) {
          we.field_o = new Sprite(640, 480);
        }
        vb.a(-72, we.field_o);
        SecondaryNodeDequeIterator.a(0);
        MarkerSliderRenderer.restoreRasterTarget(param0 + 10966);
        SoftwareRasterizer.fillRectangleAlpha(var6 - 5, var7 - 5, 10 + var4Lifetime1, var5 + 10, 0, 128);
        if (MusicPatchPcmStream.field_r != null &&
          MusicPatchPcmStream.field_r.field_r == 3) {
          SoftwareRasterizer.fillRectangle(var6, var7, var4Lifetime1, var5, 0);
        }
        we.field_o.drawScaled(var6, var7, var4Lifetime1, var5);
        var2 += 247;
        nm.field_c.drawCentered(jc.field_a, -var3Lifetime1 + 320, var2, 0, -1);
        var2 += 8;
        var9 = RotatedSpriteAsset.field_g[var8.field_p];
        stackIn_31_0 = 166 - var3Lifetime1;
        stackIn_31_1 = -5 + var2;
        stackIn_31_2 = 148;
        stackIn_31_3 = 114;
        if (var9[0] == IntArrayReadRequest.field_l &&
          this.selectedItem == 1) {
          stackIn_33_4 = 16777215;
        } else {
          stackIn_33_4 = 0;
        }
        SoftwareRasterizer.fillRectangleAlpha(stackIn_31_0, stackIn_31_1, stackIn_31_2, stackIn_31_3, stackIn_33_4, 128);
        QuadraticPointPath.field_i.getSpriteOrPlaceholder(104, var9[0], 9, 138).drawUnkeyed(-var3Lifetime1 + 171, var2);
        stackIn_36_0 = var3Lifetime1 + 326;
        stackIn_36_1 = -5 + var2;
        stackIn_36_2 = 148;
        stackIn_36_3 = 114;
        if (~var9[1] == ~IntArrayReadRequest.field_l &&
          this.selectedItem == 1) {
          stackIn_38_4 = 16777215;
        } else {
          stackIn_38_4 = 0;
        }
        SoftwareRasterizer.fillRectangleAlpha(stackIn_36_0, stackIn_36_1, stackIn_36_2, stackIn_36_3, stackIn_38_4, 128);
        QuadraticPointPath.field_i.getSpriteOrPlaceholder(104, var9[1], 9, 138).drawUnkeyed(var3Lifetime1 + 331, var2);
        var12 = 0;
        var20 = new int[4];
        var19 = var20;
        var13 = var19;
        var10Lifetime1 = 0;
        while (true) {
          stackIn_40_0 = -5;
          stackIn_40_1 = ~var10Lifetime1;
          if (stackIn_40_0 < stackIn_40_1) {
            stackIn_51_0 = 0;
            if (var18 == 0) {
              var11Lifetime1 = stackIn_51_0;
              while (var11Lifetime1 < 4) {
                stackIn_40_0 = IntArrayReadRequest.field_j[var11Lifetime1];
                stackIn_40_1 = IntArrayReadRequest.field_j[var10Lifetime1];
                if (stackIn_40_0 > stackIn_40_1) {
                  var13[var10Lifetime1] = var13[var10Lifetime1] + 1;
                }
                var11Lifetime1++;
              }
              var10Lifetime1++;
              continue;
            }
          } else {
            var2 = 640 - (int)this.carouselOffset;
            nm.field_c.drawCentered(qh.field_e, 160 - var3Lifetime1, var2, 0, -1);
            var2 += 40;
            stackIn_51_0 = 0;
          }
          var10Lifetime1 = stackIn_51_0;
          scanLoop1: while (true) {
            stackIn_53_0 = 4;
            stackIn_53_1 = var10Lifetime1;
            if (stackIn_53_0 > stackIn_53_1 &&
              var18 == 0) {
              var11Lifetime1Lifetime1 = 0;
              while (4 > var11Lifetime1Lifetime1) {
                stackIn_53_0 = ~var10Lifetime1;
                stackIn_53_1 = ~var20[var11Lifetime1Lifetime1];
                if (stackIn_53_0 == stackIn_53_1) {
                  if (this.transitionState == 0) {
                    var14_int = 60;
                    var15 = 0.10000000149011612f;
                    var16 = (float)Math.exp((double)(-var15 * 80.0f));
                    var17 = -ImageProducerRasterBuffer.field_m + var14_int + 5 * var12;
                    var3Lifetime1 = (int)((-1.0 + Math.exp((double)(var15 * (float)var17))) * (double)(var16 * 300.0f));
                  }
                  if (IntArrayReadRequest.field_j[var11Lifetime1Lifetime1] != 1) {
                    stackIn_65_0 = IntArrayReadRequest.field_j[var11Lifetime1Lifetime1] + ij.field_a;
                  } else {
                    stackIn_65_0 = DirectByteStorage.field_h;
                  }
                  var14 = stackIn_65_0;
                  nm.field_c.draw(var14, -var3Lifetime1 + 170, var2, var11Lifetime1Lifetime1 + 6, -1);
                  nm.field_c.drawRightAligned(FullscreenErrorDialog.field_Y[var10Lifetime1], 150 - var3Lifetime1, var2, var11Lifetime1Lifetime1 + 6, -1);
                  var12++;
                  var2 += 30;
                }
                var11Lifetime1Lifetime1++;
              }
              var10Lifetime1++;
              continue scanLoop1;
            }
            break;
          }
          return;
        }
    }

    final static int[] createRotationMatrix(int param0, int param1, byte param2) {
        int var3 = GrowableStringList.a(param1, 5255);
        if (param2 >= -42) {
          return (int[]) null;
        }
        int var4 = hc.a(0, param1);
        int var5 = GrowableStringList.a(param0, 5255);
        int var6 = hc.a(0, param0);
        int var7 = (int)((long)var5 * (long)var3 >> 16);
        int var8 = (int)((long)var3 * (long)var6 >> 16);
        int var9 = (int)((long)var5 * (long)var4 >> 16);
        int var10 = (int)((long)var4 * (long)var6 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    private final int hitTestCoursePreview(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        int stackIn_15_0 = 0;
        var6 = HoldTheLine.field_D;
        if (param0 >= 168 &&
          param0 <= 213) {
          if (param1 != 163) {
            return -42;
          }
          var5 = 0;
          while (var5 < 4) {
            stackIn_15_0 = ~param2;
            if (var6 != 0) {
              return stackIn_15_0;
            }
            if (stackIn_15_0 <= ~(-param3 + (2 + TextHotspotWidget.field_K[var5])) &&
              param2 <= TextHotspotWidget.field_K[var5] - (-62 + param3)) {
              return var5;
            }
            var5++;
          }
          return -1;
        }
        return -1;
    }

    private final void drawFramedSprite(int param0, Sprite param1, int param2, int param3, int param4, int param5, int param6) {
        try {
          this.drawFramedSprite(param6, 2, param2, param5, param3, param4, param1.width, param1, param1.height);
          if (param0 != -141) {
            this.closeDelayTicks = 23;
          }
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "ti.GA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    private final void drawRaceResults(int param0) {
        int stackIn_7_0 = 0;
        double stackIn_10_0 = 0.0;
        int stackIn_11_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_47_0 = 0;
        String stackIn_58_0 = null;
        int stackIn_66_0 = 0;
        int stackIn_75_0 = 0;
        String stackIn_90_0 = null;
        int stackIn_98_0;
        int stackIn_98_1;
        int stackIn_98_2;
        int stackIn_98_3;
        String stackIn_98_4;
        boolean stackIn_99_5 = false;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        float var5 = 0.0f;
        float var6 = 0.0f;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        SpriteAsset var14 = null;
        SpriteAsset var15 = null;
        SpriteAsset var16 = null;
        String var17 = null;
        String var18 = null;
        String var9Lifetime1;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9_intLifetime1;
        int var8Lifetime3;
        var13 = HoldTheLine.field_D;
        if (MusicPatchPcmStream.field_r == null) {
          return;
        }
        var2 = 140 - (int)this.carouselOffset;
        var3 = 0;
        var4 = 500;
        if (param0 != 12) {
          return;
        }
        var5 = 0.10000000149011612f;
        var6 = (float)Math.exp((double)(400.0f * -var5));
        if (this.transitionState > 1) {
          stackIn_7_0 = ImageProducerRasterBuffer.field_m;
        } else {
          stackIn_7_0 = -ImageProducerRasterBuffer.field_m + var4;
        }
        boolean decompiledFrameRemainder0 = true;
        var7 = stackIn_7_0;
        if (MusicPatchPcmStream.field_r.field_E) {
          var8 = (int)((double)(300.0f * var6) * (Math.exp((double)((float)var7 * var5)) - 1.0));
          stackIn_10_0 = (double)(var6 * 300.0f);
          if (var7 > 10) {
            stackIn_11_1 = -10 + var7;
          } else {
            stackIn_11_1 = 0;
          }
          var9_int = (int)(stackIn_10_0 * (Math.exp((double)((float)stackIn_11_1 * var5)) - 1.0));
          if (MusicPatchPcmStream.field_r.vehicles[0].field_R < 3) {
            var14 = BoundaryIntersection.field_o[MusicPatchPcmStream.field_r.vehicles[0].field_R];
            if (null == var14.getSprite(8192)) {
              LoadProgressDialog.field_hb.draw(352, var2 + (-var8 - 64));
              if (var13 != 0) {
                var14.field_b.draw(336, var2 - (var8 + 64));
              }
            } else {
              var14.field_b.draw(336, var2 - (var8 + 64));
            }
          }
          if (3 > MusicPatchPcmStream.field_r.vehicles[1].field_R) {
            var15 = BoundaryIntersection.field_o[MusicPatchPcmStream.field_r.vehicles[1].field_R];
            if (var15.getSprite(8192) == null) {
              LoadProgressDialog.field_hb.draw(192, var2 + (-var9_int - 64));
              if (var13 != 0) {
                var15.field_b.draw(176, -var9_int + var2 - 64);
              }
            } else {
              var15.field_b.draw(176, -var9_int + var2 - 64);
            }
          }
          decompiledFrameRemainder0 = (var13 != 0);
        }
        if (decompiledFrameRemainder0) {
          var8Lifetime3 = (int)((-1.0 + Math.exp((double)(var5 * (float)var7))) * (double)(300.0f * var6));
          if (MusicPatchPcmStream.field_r.vehicles[0].field_R < 3) {
            var16 = BoundaryIntersection.field_o[MusicPatchPcmStream.field_r.vehicles[0].field_R];
            if (var16.getSprite(param0 + 8180) == null) {
              LoadProgressDialog.field_hb.draw(272, -64 + (-var8Lifetime3 + var2));
              if (var13 != 0) {
                var16.field_b.draw(256, -64 + var2 - var8Lifetime3);
              }
            } else {
              var16.field_b.draw(256, -64 + var2 - var8Lifetime3);
            }
          }
        }
        var2 += 120;
        if (CheckboxRenderer.field_x == 5) {
          if (this.transitionState <= 1) {
            stackIn_33_0 = -ImageProducerRasterBuffer.field_m + var4;
          } else {
            stackIn_33_0 = ImageProducerRasterBuffer.field_m;
          }
          var7Lifetime1 = stackIn_33_0;
          var7Lifetime1 -= 75;
          if (var7Lifetime1 < 0) {
            var7Lifetime1 = 0;
          }
          var8Lifetime1 = 320 + (int)((double)(var6 * 500.0f) * (Math.exp((double)((float)var7Lifetime1 * var5)) - 1.0));
          nm.field_c.drawCentered("-", var8Lifetime1 + 2, var2, 0, -1);
          nm.field_c.drawRightAligned(vf.field_u, -8 + var8Lifetime1, var2, 0, -1);
          nm.field_c.draw(MusicPatchPcmStream.field_o, 12 + var8Lifetime1, var2, 0, -1);
          var2 += 30;
        }
        var9_intLifetime1 = 0;
        while (true) {
          stackIn_39_0 = var9_intLifetime1;
          stackIn_39_1 = 4;
          if (stackIn_39_0 < stackIn_39_1) {
            stackIn_75_0 = 0;
            if (var13 == 0) {
              var10 = stackIn_75_0;
              while (MusicPatchPcmStream.field_r.field_h > var10) {
                stackIn_39_0 = this.transitionState;
                stackIn_39_1 = 1;
                if (stackIn_39_0 > stackIn_39_1) {
                  stackIn_47_0 = ImageProducerRasterBuffer.field_m;
                } else {
                  stackIn_47_0 = var4 - ImageProducerRasterBuffer.field_m;
                }
                var7Lifetime2 = stackIn_47_0;
                var7Lifetime2 = var7Lifetime2 - (5 - var3) * 10;
                if (0 > var7Lifetime2) {
                  var7Lifetime2 = 0;
                }
                var8Lifetime2 = (int)((Math.exp((double)(var5 * (float)var7Lifetime2)) - 1.0) * (double)(var6 * 500.0f));
                if (var3 % 2 != 0) {
                  var8Lifetime2 = 320 + var8Lifetime2;
                } else {
                  var8Lifetime2 = -var8Lifetime2 + 320;
                }
                if (~var9_intLifetime1 == ~MusicPatchPcmStream.field_r.vehicles[var10].field_R) {
                  if (CheckboxRenderer.field_x != 4) {
                    if (CheckboxRenderer.field_x != 5) {
                      var11 = SingleChildWidget.field_C[var9_intLifetime1];
                      if (var11 == 1) {
                        stackIn_58_0 = DirectByteStorage.field_h;
                      } else {
                        stackIn_58_0 = var11 + ij.field_a;
                      }
                      var12 = stackIn_58_0;
                      nm.field_c.draw(var12, -55 + var8Lifetime2, var2, var10 + 6, -1);
                      nm.field_c.drawRightAligned(FullscreenErrorDialog.field_Y[var9_intLifetime1], -80 + var8Lifetime2, var2, 6 + var10, -1);
                      if (pe.field_g[var10] == -1) {
                        nm.field_c.draw(DualLinkNode.field_m, 40 + var8Lifetime2, var2, var10 + 6, -1);
                      } else {
                        nm.field_c.draw(DisplayNameValidator.formatPreciseRaceTime(48, pe.field_g[var10]), 40 + var8Lifetime2, var2, var10 + 6, -1);
                      }
                    } else {
                      nm.field_c.drawRightAligned(FullscreenErrorDialog.field_Y[var9_intLifetime1], var8Lifetime2 - 15, var2, var10 + 6, -1);
                      stackIn_66_0 = (LoginCredentialType.a(param0 + 16604, 0)) ? 3 : 1;
                      var11 = stackIn_66_0;
                      nm.field_c.draw(Integer.toString(MusicPatchPcmStream.field_r.vehicles[var10].field_Sb), 15 + var8Lifetime2, var2, 6 + var10, -1);
                      nm.field_c.draw("-", 16 + var8Lifetime2 + 14 * var11, var2, 6 + var10, -1);
                      nm.field_c.draw(Integer.toString(MusicPatchPcmStream.field_r.vehicles[var10].field_oc), 31 + var8Lifetime2 + var11 * 14, var2, var10 + 6, -1);
                    }
                  } else {
                    nm.field_c.drawRightAligned(FullscreenErrorDialog.field_Y[var9_intLifetime1], -15 + var8Lifetime2, var2, var10 + 6, -1);
                    if (-1 != pe.field_g[var10]) {
                      nm.field_c.draw(DisplayNameValidator.formatPreciseRaceTime(47, pe.field_g[var10]), 15 + var8Lifetime2, var2, var10 + 6, -1);
                    } else {
                      nm.field_c.draw(DualLinkNode.field_m, var8Lifetime2 + 15, var2, 6 + var10, -1);
                    }
                  }
                  var3++;
                  var2 += 30;
                }
                var10++;
              }
              var9_intLifetime1++;
              continue;
            }
          } else {
            stackIn_75_0 = CheckboxRenderer.field_x;
          }
          if (stackIn_75_0 != 5) {
            var2 += 30;
          }
          if (ImageProducerRasterBuffer.field_m % 50 < 25) {
            if (CheckboxRenderer.field_x == 2 &&
              -1 != OutlinedRoadStripRenderer.field_r) {
              var9 = LoginCredentials.substituteIndexedTokens(SolidRoadStripRenderer.field_n, new String[]{ViewportSizingController.field_t[OutlinedRoadStripRenderer.field_r]}, true);
              if (!of.a(param0 - 981)) {
                var9 = SingleChildWidget.field_E;
              }
              nm.field_c.drawCentered(var9, 320, var2, 1, -1);
            } else {
              if (CheckboxRenderer.field_x == 1) {
                if (EntitySound.field_l != 1) {
                  stackIn_90_0 = LoginCredentials.substituteIndexedTokens(sh.field_c, new String[]{Integer.toString(EntitySound.field_l)}, true);
                } else {
                  stackIn_90_0 = SpriteSheetAsset.field_f;
                }
                var18 = stackIn_90_0;
                var9 = var18;
                nm.field_c.drawCentered(var18, 320, var2, 1, -1);
              } else {
                if (6 == CheckboxRenderer.field_x) {
                  var17 = h.field_a;
                  nm.field_c.drawCentered(var17, 320, var2, 1, -1);
                }
              }
            }
          }
          if (1 == CheckboxRenderer.field_x) {
            var9Lifetime1 = DialogLayer.field_J;
          } else {
            if (CheckboxRenderer.field_x == 6) {
              var9Lifetime1 = ka.field_e;
            } else {
              var9Lifetime1 = hk.field_b;
            }
          }
          stackIn_98_0 = 240;
          stackIn_98_1 = 0;
          stackIn_98_2 = -5;
          stackIn_98_3 = 430 - (int)this.carouselOffset;
          stackIn_98_4 = var9Lifetime1;
          stackIn_99_5 = (this.selectedItem == 1);
          te.a(stackIn_98_0, stackIn_98_1, stackIn_98_2, stackIn_98_3, stackIn_98_4, stackIn_99_5);
          return;
        }
    }

    private final int hitTestChampionshipIcon(int param0, byte param1, int param2, int param3) {
        int var5;
        int var6;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        var6 = HoldTheLine.field_D;
        if (param0 >= 80 &&
          param0 <= 140) {
          var5 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var5 >= 4))) {
            stackIn_13_0 = 88 + (128 * var5 - param3);
            stackIn_13_1 = param2;
            if (var6 == 0) {
              if (stackIn_13_0 <= stackIn_13_1 &&
                param2 <= (-param3 + (var5 * 128 + 168))) {
                return var5;
              }
              var5++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_13_0 = param1;
            stackIn_13_1 = -87;
          }
          if (stackIn_13_0 > stackIn_13_1) {
            this.exitTicks = 9;
          }
          return -1;
        }
        return -1;
    }

    private final void handleRaceResultMouse(byte param0) {
        int stackIn_13_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int var2;
        int var3;
        int var4;
        var4 = HoldTheLine.field_D;
        if (200 <= NodeHashTableIterator.field_g &&
          NodeHashTableIterator.field_g < 440 &&
          (float)FullscreenErrorDialog.field_X >= 430.0f - this.carouselOffset &&
          -this.carouselOffset + 460.0f > (float)FullscreenErrorDialog.field_X) {
          this.selectedItem = 1;
          if (1 == ValidationIndicator.field_J) {
            this.activateMenuActionWithSound((byte) 117, 6, true);
          }
        }
        var2 = 0;
        scanLoop1: while (true) {
          boolean decompiledFrameRemainder0 = true;
          if (2 > var2) {
            stackIn_26_0 = 0;
            stackIn_26_1 = var2;
            if (var4 != 0) {
              break scanLoop1;
            }
            stackIn_13_0 = (stackIn_26_0 == stackIn_26_1) ? 240 : 400;
            var3 = stackIn_13_0;
            if ((-69 + var3) <= NodeHashTableIterator.field_g &&
              var3 + 69 > NodeHashTableIterator.field_g &&
              (float)FullscreenErrorDialog.field_X >= 845.0f - this.carouselOffset &&
              (float)FullscreenErrorDialog.field_X < 949.0f - this.carouselOffset) {
              IntArrayReadRequest.field_l = RotatedSpriteAsset.field_g[ArchiveIndex.b((byte) -49).field_p][var2];
              ArchiveCatalog.a(0, (byte) 120, this.menuId, var2);
              this.selectedItem = 1;
              if (((ValidationIndicator.field_J == 1)) &&
                ((null != MusicPatchPcmStream.field_r))) {
                MusicPatchPcmStream.field_r.vehicles[0].a(20385, ge.field_c[IntArrayReadRequest.field_l]);
                wm.a(true, false, -1);
                MatchingTextValidator.a(293, StrongCacheEntry.field_r);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              var2++;
              continue;
            }
          }
          stackIn_26_0 = this.menuId;
          stackIn_26_1 = 10;
          break;
        }
        if (stackIn_26_0 == stackIn_26_1 &&
          this.carouselOffset > 0.0f &&
          na.field_k &&
          NodeHashTableIterator.field_g > this.left &&
          this.right >= NodeHashTableIterator.field_g &&
          FullscreenErrorDialog.field_X >= 35 &&
          FullscreenErrorDialog.field_X <= 65) {
          this.selectedItem = 0;
          if (0 != ValidationIndicator.field_J) {
            this.activateItem(this.selectedItem, -3565);
          }
        }
        if (param0 != -88) {
          this.itemAnimationTimers = (int[]) null;
        }
        return;
    }

    private final int hitTestAchievement(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        var8 = HoldTheLine.field_D;
        var4 = 0;
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (!(SocketConnector.field_a > var4)))) {
          var5 = -param1 + dm.field_e[var4];
          var6 = -param2 + co.field_d[var4];
          var7 = ArchiveIndex.field_b[var4] >> 1;
          stackIn_10_0 = -var7;
          stackIn_10_1 = var5;
          if (var8 == 0) {
            if (stackIn_10_0 <= stackIn_10_1 &&
              var5 <= var7 &&
              -var7 <= var6 &&
              var6 <= var7) {
              return EditableTextField.field_J[var4];
            }
            var4++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_10_0 = param0;
          stackIn_10_1 = -21;
        }
        if (stackIn_10_0 != stackIn_10_1) {
          this.exitTicks = -80;
        }
        return -1;
    }

    final void initializeChampionshipCarousel(int param0, int param1) {
        this.targetCarouselOffset = 0;
        this.carouselOffset = (float)param0;
        BoundaryIntersection.field_p = param1;
        PasswordValidator.field_j = param1;
        RotatedSpriteCache.field_g[param1] = null;
    }

    static {
        field_x = new ll();
    }
}
