/*
 * Decompiled by CFR-JS 0.4.0.
 */
class MenuScreen extends MenuScreenBase {
    int buttonSpacing;
    TextHotspotRegion field_G;
    MenuSelection selection;
    Sprite headerSprite;
    boolean framedPanel;
    private int panelHeight;
    static int field_u;
    private int panelWidth;
    boolean field_n;
    static long field_v;
    private static int field_j;
    int[] itemIds;
    boolean hasButtonBackdrop;
    int parentScreenId;
    int buttonTop;
    static int field_i;
    int buttonLeft;
    static int[] field_y;
    private int panelX;
    private int panelY;
    static int[] field_m;
    boolean drawsBackground;
    int buttonRight;
    int screenId;
    private static int field_D;
    static int field_F;

    int getButtonTop(byte param0, int param1) {
        if (param0 != 6) {
          return 57;
        }
        return this.buttonTop + param1 * this.buttonSpacing;
    }

    final void drawBackground(boolean param0) {
        int var2 = 0;
        if (param0) {
          this.buttonSpacing = -3;
        }
        if (this.drawsBackground) {
          if (this.framedPanel) {
            ChatMessage.field_l.drawAt(0, 0);
          } else {
            IntrusiveNodeHashTable.field_b[BrowserCookieSupport.field_h].drawAt(0, 0);
            DebugSliderInputSupport.field_g = DebugSliderInputSupport.field_g + 1;
            if (!(0 >= DebugSliderInputSupport.field_g)) {
              var2 = (BrowserCookieSupport.field_h + 1) % IntrusiveNodeHashTable.field_b.length;
              IntrusiveNodeHashTable.field_b[var2].drawShadedGrayscale(0, 0, DebugSliderInputSupport.field_g);
              if (DebugSliderInputSupport.field_g > 255) {
                BrowserCookieSupport.field_h = var2;
                DebugSliderInputSupport.field_g = -750;
              }
            }
          }
        }
        if (this.framedPanel) {
          ByteArrayPool.a(this.panelWidth, this.panelHeight, true, this.panelX, this.panelY);
        }
        if (null != this.headerSprite) {
          this.headerSprite.draw(SoftwareRasterizer.width - this.headerSprite.field_z >> 1, 10);
        }
    }

    final void drawButton(boolean param0, int param1) {
        int stackIn_39_0 = 0;
        int var3;
        String var4;
        int var5;
        int var6;
        int var7;
        Object var8;
        int var9;
        int var10;
        Sprite var10_ref_dd;
        int var11;
        int var12;
        int var14;
        int var15;
        Sprite[] var16;
        int[] var20;
        int var9Lifetime1;
        int var10Lifetime1;
        int var14Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        var15 = Pool.field_O;
        var3 = this.itemIds[param1];
        var4 = TranslatedUiText.field_f[var3];
        if (var3 == 8) {
          if (this.parentScreenId != 0 &&
            this.parentScreenId != 21) {
            if (7 == this.parentScreenId) {
              var4 = TranslatedUiText.field_f[37];
            } else {
              if (this.parentScreenId == 6) {
                var4 = TranslatedUiText.field_f[38];
              } else {
                if (8 != this.parentScreenId &&
                  this.parentScreenId != 3 &&
                  this.parentScreenId != 24) {
                  if ((this.parentScreenId == 10 ||
                    11 == this.parentScreenId ||
                    this.parentScreenId == 12 ||
                    this.parentScreenId == 9)) {
                    var4 = ModelTableScene.optionsmenuNotpaused;
                  }
                } else {
                  var4 = WhirlpoolHasher.pausemenu;
                }
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            var4 = TranslatedUiText.field_f[7];
          }
        }
        var5 = this.getButtonLeft(0, param1);
        var6 = this.getButtonRight(false, param1);
        var7 = this.getButtonTop((byte) 6, param1);
        if (!param0) {
          return;
        }
        var8 = null;
        if (this.hasButtonBackdrop(-13676, param1)) {
          var9 = -var5 + var6;
          var10 = this.getButtonHeight((byte) 69, param1);
          var16 = this.getButtonFrameSprites(param1, -34);
          LogoMaterial.drawNineSlice(var16, (byte) 6, var9, var5, var7, var10);
        }
        var9Lifetime1 = this.getButtonState(param1, -4);
        if (QuickChatNavigationSupport.field_e[param1] != var4 ||
          var9Lifetime1 != FreePlayRules.field_h[param1]) {
          var10_ref_dd = this.createButtonLabel(var4, var9Lifetime1, 0, param1);
          ArrayWidgetGroup.field_G[param1] = var10_ref_dd;
          QuickChatNavigationSupport.field_e[param1] = var4;
          FreePlayRules.field_h[param1] = var9Lifetime1;
        }
        var10Lifetime1 = ArrayWidgetGroup.field_G[param1].field_z;
        if (20 == var3 ||
          var3 == 21) {
          var10Lifetime1 = Ball.field_H + 120;
        }
        var11 = -var10Lifetime1 + (var6 + var5) >> 1;
        var12 = this.getButtonHeight((byte) 69, param1);
        ArrayWidgetGroup.field_G[param1].draw(var11, var7 + this.getLabelOffsetY(param1, 6402));
        this.drawButtonOverlay(param1, var6, var5, var12, -24267, var7);
        if (var3 != 20 &&
          var3 != 21) {
          return;
        }
        var11 = var11 + Ball.field_H;
        var20 = PoolGameModel.field_B[0].gradientPalette(0, 0);
        for (var14 = var11; var14 <= 120 + var11; var14 += 20) {
          SoftwareRasterizer.fillRadialGlow(var14 << 4, -2 + var12 / 2 + var7 << 4, 16 - var11 + var14, var20.length - 1, var20);
        }
        if (20 == var3) {
          stackIn_39_0 = BallDebugOverlay.field_b * 120 / 256;
        } else {
          stackIn_39_0 = 120 * TranslatedUiText.field_h / 256;
        }
        var14Lifetime1 = stackIn_39_0;
        CompressedContainerSupport.field_a.draw(-(CompressedContainerSupport.field_a.field_z >> 1) + (var14Lifetime1 + var11), -4 + ((CompressedContainerSupport.field_a.field_A >> 1) + var7));
        return;
    }

    Sprite createButtonLabel(String param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        Sprite stackIn_2_0 = null;
        Sprite stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 0) {
            stackIn_4_0 = TransformRotationSupport.createTextLabelSprite(param1, 0, param0);
            return stackIn_4_0;
          }
          stackIn_2_0 = (Sprite) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("ob.PA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    int getLabelOffsetY(int param0, int param1) {
        if (param1 != 6402) {
          field_F = 22;
        }
        return -2;
    }

    Sprite[] getButtonFrameSprites(int param0, int param1) {
        int var3;
        if (param0 == this.selection.selectedIndex) {
          return ModelOriginSupport.field_s;
        }
        if (param1 != -34) {
          this.getButtonHeight((byte) -13, 83);
        }
        var3 = this.itemIds[param0];
        if ((var3 != 17 ||
          SocialListEntry.field_Lb != 0) && (var3 != 18 ||
          1 != SocialListEntry.field_Lb)) {
          return MeshSymmetrySupport.field_g;
        }
        return ModelOriginSupport.field_s;
    }

    void advanceScreen(int param0) {
        int var3;
        var3 = Pool.field_O;
        if (!AlternateLongAndTextLoginPayload.field_p &&
          !LoginRequiredScreen.field_H) {
          while (LabeledChildWidget.h(param0 + 128)) {
            if (IterableDualLinkDeque.field_a == 13) {
              this.navigateBack((byte) -30);
              continue;
            }
            this.handleNavigationKey(-34);
            if (this.selection.selectedIndex == -1) {
              continue;
            }
            this.handleMenuAction(-16470, false, this.selection.selectedIndex);
          }
          this.selection.a(this.findButtonAt(-6564, UsernameAvailabilityValidator.field_o, DialogLayer.field_W), this.findButtonAt(-6564, DebouncedValidationProvider.field_f, ReflectionReplySupport.field_i), param0 ^ -109);
          if (-1 != this.selection.selectedIndex) {
            this.handleMenuAction(-16470, true, this.selection.selectedIndex);
          }
        }
        if (param0 != -1) {
          this.drawParagraphSprite(-44, true);
        }
    }

    public static void releaseStatics(byte param0) {
        field_y = null;
        if (param0 <= 101) {
          LobbyPlayer var2 = (LobbyPlayer) null;
          MenuScreen.a(114, (ScrollPane) null, 91, 19, -106, 18, (LobbyPlayer) null);
        }
        field_m = null;
    }

    final void c(int param0, boolean param1) {
        if (param0 != 12) {
          return;
        }
        if (1 == DialWidget.field_W) {
          this.requestLocalMatch(0, param1, 0);
        } else {
          AccountCreationDialog.a(-3405, 7, 0, param1);
        }
    }

    final void setPanelBounds(int param0, int param1, int param2, int param3, int param4) {
        int discarded$0 = 0;
        this.panelWidth = param0;
        this.panelX = param2;
        this.panelY = param1;
        this.panelHeight = param3;
        if (param4 != 0) {
          discarded$0 = this.findButtonAt(-68, -48, -6);
        }
    }

    private final void requestLocalMatch(int param0, boolean param1, int param2) {
        if (param2 != 0) {
          return;
        }
        GameRules.field_b = -3;
        LoginPayload.field_f = param0;
    }

    private final int findButtonAt(int param0, int param1, int param2) {
        int var7 = 0;
        int var4;
        int var5;
        int stackIn_23_0 = 0;
        int stackIn_24_1 = 0;
        int var6;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var6Lifetime1;
        var4 = -1;
        if (param0 != -6564) {
          return -23;
        }
        var5 = -1;
        for (var7 = 0; var7 < this.itemIds.length; var7++) {
          if (this.isButtonEnabled(var7, true)) {
            var8 = this.getButtonTop((byte) 6, var7);
            var9 = this.getButtonLeft(param0 ^ -6564, var7);
            var10 = this.getButtonRight(false, var7);
            var11 = this.getButtonHeight((byte) 69, var7) + var8;
            if (param2 >= var9 &&
              var10 > param2 &&
              param1 >= var8 &&
              var11 > param1) {
              var6 = param2 - (var10 + var9 >> 1);
              if (var6 < 0) {
                var6 = -var6;
              }
              var12 = -(var8 + var11 >> 1) + param1;
              stackIn_23_0 = var6;
              if (var12 >= 0) {
                stackIn_24_1 = var12;
              } else {
                stackIn_24_1 = -var12;
              }
              var6Lifetime1 = stackIn_23_0 + stackIn_24_1;
              if (var5 < 0 ||
                var6Lifetime1 < var5) {
                var5 = var6Lifetime1;
                var4 = var7;
              }
            }
          }
        }
        return var4;
    }

    void handleMenuAction(int param0, boolean param1, int param2) {
        boolean stackIn_82_0 = false;
        String[] stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        String stackIn_85_2 = null;
        int stackIn_129_0 = 0;
        int stackIn_129_1 = 0;
        int stackIn_130_2 = 0;
        int stackIn_151_0 = 0;
        int stackIn_151_1 = 0;
        MenuScreen[] stackIn_151_2 = null;
        int stackIn_152_3;
        int stackIn_212_0 = 0;
        int stackIn_212_1 = 0;
        int stackIn_213_2 = 0;
        int stackIn_218_0 = 0;
        int stackIn_218_1 = 0;
        int stackIn_219_2 = 0;
        int stackIn_224_0 = 0;
        int stackIn_224_1 = 0;
        int stackIn_225_2 = 0;
        int stackIn_232_0 = 0;
        int stackIn_232_1 = 0;
        int stackIn_233_2 = 0;
        int stackIn_236_0 = 0;
        int stackIn_236_1 = 0;
        int stackIn_237_2 = 0;
        int stackIn_240_0 = 0;
        int stackIn_240_1 = 0;
        int stackIn_241_2 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        var9 = Pool.field_O;
        if (param0 != -16470) {
          return;
        }
        if (this.selection.field_a) {
          TextLineLayout.a((byte) -27, BeveledFrameSpriteFactory.field_c[0]);
        }
        regionExit1: {
          regionExit2: {
            var4 = this.itemIds[param2];
            var6 = var4;
            if (var6 != 0 &&
              var6 != 38) {
              if (37 == var6) {
                if (!(!this.selection.isPressActivated((byte) 72))) {
                  AccountCreationDialog.a(-3405, 7, 0, param1);
                }
              } else {
                if (39 == var6) {
                  if (!(!this.selection.isPressActivated((byte) 74))) {
                    AccountCreationDialog.a(-3405, 1, 0, param1);
                  }
                } else {
                  if (var6 == 49) {
                    if (!this.selection.isPressActivated((byte) 78)) {
                      break regionExit2;
                    }
                    stackIn_82_0 = !(ChatInputSupport.field_h);
                    ChatInputSupport.field_h = stackIn_82_0;
                    stackIn_84_0 = TranslatedUiText.field_f;
                    stackIn_84_1 = 49;
                    if (ChatInputSupport.field_h) {
                      stackIn_85_2 = NodeHashTableIterator.mouseYAxisInverted;
                    } else {
                      stackIn_85_2 = PoolMatchController.mouseYAxisNormal;
                    }
                    stackIn_84_0[stackIn_84_1] = stackIn_85_2;
                  } else {
                    if (var6 == 29) {
                      if (!this.selection.isPressActivated((byte) 58)) {
                        break regionExit2;
                      }
                      this.requestLocalMatch(0, param1, 0);
                    } else {
                      if (var6 == 30) {
                        if (!this.selection.isPressActivated((byte) 63)) {
                          break regionExit2;
                        }
                        this.requestLocalMatch(1, param1, param0 ^ -16470);
                      } else {
                        if (var6 == 31) {
                          if (!(!this.selection.isPressActivated((byte) 82))) {
                            this.requestLocalMatch(2, param1, 0);
                          }
                        } else {
                          if (32 == var6) {
                            if (!(!this.selection.isPressActivated((byte) 61))) {
                              this.requestLocalMatch(3, param1, 0);
                            }
                          } else {
                            if (var6 == 33) {
                              if (!this.selection.isPressActivated((byte) 73)) {
                                break regionExit2;
                              }
                              this.requestLocalMatch(4, param1, 0);
                            } else {
                              if (var6 == 34) {
                                if (!this.selection.isPressActivated((byte) 86)) {
                                  break regionExit2;
                                }
                                this.requestLocalMatch(5, param1, param0 + 16470);
                              } else {
                                if (var6 == 35) {
                                  if (!this.selection.isPressActivated((byte) 125)) {
                                    break regionExit2;
                                  }
                                  this.requestLocalMatch(6, param1, 0);
                                } else {
                                  if (var6 == 36) {
                                    if (!(!this.selection.isPressActivated((byte) 108))) {
                                      this.requestLocalMatch(7, param1, 0);
                                    }
                                  } else {
                                    if (var6 == 40) {
                                      if (!(!this.selection.isPressActivated((byte) 99))) {
                                        UiComponent.field_Ab = SceneNode.field_g[0];
                                        DialWidget.field_W = 3;
                                        GameRules.field_b = -6;
                                      }
                                    } else {
                                      if (var6 == 41) {
                                        if (!(!this.selection.isPressActivated((byte) 101))) {
                                          DialWidget.field_W = 3;
                                          UiComponent.field_Ab = SceneNode.field_g[1];
                                          GameRules.field_b = -6;
                                        }
                                      } else {
                                        if (var6 == 42) {
                                          if (!this.selection.isPressActivated((byte) 84)) {
                                            break regionExit2;
                                          }
                                          GameRules.field_b = -6;
                                          UiComponent.field_Ab = SceneNode.field_g[2];
                                          DialWidget.field_W = 3;
                                        } else {
                                          if (43 == var6) {
                                            if (!(!this.selection.isPressActivated((byte) 81))) {
                                              var6 = param1 ? 1 : 0;
                                              AccountCreationDialog.a(param0 ^ 19737, 2, GameRules.field_b, var6 != 0);
                                            }
                                          } else {
                                            if (var6 == 50) {
                                              if (!this.selection.isPressActivated((byte) 90)) {
                                                break regionExit2;
                                              }
                                              LookupProtocolSupport.field_e = 0;
                                              GameRules.field_b = -8;
                                            } else {
                                              if (var6 == 51) {
                                                if (!(!this.selection.isPressActivated((byte) 83))) {
                                                  LookupProtocolSupport.field_e = 1;
                                                  GameRules.field_b = -8;
                                                }
                                              } else {
                                                if (1 == var6) {
                                                  if (!this.selection.isPressActivated((byte) 76)) {
                                                    break regionExit2;
                                                  }
                                                  if (NanoTickClock.isClientConnected(107)) {
                                                    WireframeQuad.field_x = true;
                                                    TranslatedUiText.a(VertexProjectionSupport.pleaselogin, -4, (byte) 82);
                                                  } else {
                                                    var6 = param1 ? 1 : 0;
                                                    AccountCreationDialog.a(-3405, -4, GameRules.field_b, var6 != 0);
                                                  }
                                                } else {
                                                  if (var6 != 62 &&
                                                    var6 != 2) {
                                                    if (var6 == 7) {
                                                      if (!(!this.selection.isPressActivated((byte) 50))) {
                                                        var6 = param1 ? 1 : 0;
                                                        AccountCreationDialog.a(-3405, 0, GameRules.field_b, var6 != 0);
                                                        AppletUrlSupport.field_c = false;
                                                      }
                                                    } else {
                                                      if (var6 == 24) {
                                                        if (!(!this.selection.isPressActivated((byte) 95))) {
                                                          var6 = param1 ? 1 : 0;
                                                          AccountCreationDialog.a(-3405, 21, GameRules.field_b, var6 != 0);
                                                          ProxyAuthenticationRequiredException.field_a = true;
                                                        }
                                                      } else {
                                                        if (var6 == 22) {
                                                          if (!(!this.selection.isPressActivated((byte) 109))) {
                                                            var6 = param1 ? 1 : 0;
                                                            AccountCreationDialog.a(-3405, 17, GameRules.field_b, var6 != 0);
                                                          }
                                                        } else {
                                                          if (var6 == 5) {
                                                            if (!(!this.selection.isPressActivated((byte) 67))) {
                                                              var6 = param1 ? 1 : 0;
                                                              AccountCreationDialog.a(-3405, 13, GameRules.field_b, var6 != 0);
                                                            }
                                                          } else {
                                                            if (47 == var6) {
                                                              if (!(!this.selection.isPressActivated((byte) 81))) {
                                                                var6 = param1 ? 1 : 0;
                                                                AccountCreationDialog.a(-3405, 14, GameRules.field_b, var6 != 0);
                                                              }
                                                            } else {
                                                              if (8 == var6) {
                                                                if (!this.selection.isPressActivated((byte) 89)) {
                                                                  break regionExit2;
                                                                }
                                                                if ((GameRules.field_b != this.parentScreenId)) {
                                                                  stackIn_151_0 = -3405;
                                                                  stackIn_151_1 = this.parentScreenId;
                                                                  stackIn_151_2 = DisplayModeSupport.field_c;
                                                                  if (0 <= this.parentScreenId) {
                                                                    stackIn_152_3 = this.parentScreenId;
                                                                  } else {
                                                                    stackIn_152_3 = 0;
                                                                  }
                                                                  AccountCreationDialog.a(stackIn_151_0, stackIn_151_1, stackIn_151_2[stackIn_152_3].parentScreenId, param1);
                                                                }
                                                              } else {
                                                                if (var6 == 4) {
                                                                  if (!(!this.selection.isPressActivated((byte) 52))) {
                                                                    var6 = param1 ? 1 : 0;
                                                                    AccountCreationDialog.a(-3405, 15, GameRules.field_b, var6 != 0);
                                                                  }
                                                                } else {
                                                                  if (var6 == 48) {
                                                                    if (!this.selection.isPressActivated((byte) 89)) {
                                                                      break regionExit2;
                                                                    }
                                                                    var6 = param1 ? 1 : 0;
                                                                    AccountCreationDialog.a(-3405, 16, GameRules.field_b, var6 != 0);
                                                                  } else {
                                                                    if (var6 == 20) {
                                                                      var5 = 0;
                                                                      if (this.selection.isHomeKey(123) &&
                                                                        BallDebugOverlay.field_b > 0) {
                                                                        AgeValidator.a(true, 0);
                                                                        var5 = 1;
                                                                      }
                                                                      if (this.selection.isEndKey(103) &&
                                                                        256 > BallDebugOverlay.field_b) {
                                                                        var5 = 1;
                                                                        AgeValidator.a(true, 256);
                                                                      }
                                                                      if (this.selection.isPointerHeld((byte) 111)) {
                                                                        var6 = this.getButtonLeft(0, param2) + (this.getButtonRight(false, param2) + Ball.field_H) - 120 >> 1;
                                                                        var7 = -var6 + ReflectionReplySupport.field_i;
                                                                        var8 = 256 * var7 / 120;
                                                                        if (0 >= var8) {
                                                                          AgeValidator.a(true, 0);
                                                                        } else {
                                                                          if (var8 < 256) {
                                                                            AgeValidator.a(true, var8);
                                                                          } else {
                                                                            AgeValidator.a(true, 256);
                                                                          }
                                                                        }
                                                                        var5 = 1;
                                                                      }
                                                                      if (this.selection.isLeftArrow(-20421) &&
                                                                        BallDebugOverlay.field_b > 0) {
                                                                        var5 = 1;
                                                                        BitmapTextLayout.b((byte) -14);
                                                                      }
                                                                      if (this.selection.isRightArrow(-1) &&
                                                                        BallDebugOverlay.field_b < 256) {
                                                                        SingleChildWidget.f(param0 + 16245);
                                                                        var5 = 1;
                                                                      }
                                                                      if ((var5 != 0)) {
                                                                        if (this.selection.isPointerHeld((byte) 103) &&
                                                                          SocialListEntry.field_Tb <= field_D) {
                                                                          break regionExit2;
                                                                        }
                                                                        TextLineLayout.a((byte) -27, BeveledFrameSpriteFactory.field_c[2]);
                                                                        field_D = SocialListEntry.field_Tb + 20;
                                                                      }
                                                                    } else {
                                                                      if (var6 == 21) {
                                                                        if (this.selection.isHomeKey(121)) {
                                                                          QuickChatPhraseDefinition.setMusicVolume(0, 3815994);
                                                                        }
                                                                        if (this.selection.isEndKey(103)) {
                                                                          QuickChatPhraseDefinition.setMusicVolume(256, 3815994);
                                                                        }
                                                                        if (this.selection.isPointerHeld((byte) 105)) {
                                                                          var6 = this.getButtonLeft(0, param2) + this.getButtonRight(false, param2) + Ball.field_H - 120 >> 1;
                                                                          var7 = ReflectionReplySupport.field_i - var6;
                                                                          var8 = 256 * var7 / 120;
                                                                          if (var8 > 0) {
                                                                            if (var8 >= 256) {
                                                                              QuickChatPhraseDefinition.setMusicVolume(256, param0 + 3832464);
                                                                            } else {
                                                                              QuickChatPhraseDefinition.setMusicVolume(var8, 3815994);
                                                                            }
                                                                          } else {
                                                                            QuickChatPhraseDefinition.setMusicVolume(0, 3815994);
                                                                          }
                                                                        }
                                                                        if (this.selection.isLeftArrow(-20421)) {
                                                                          LinkButtonPainter.a(param0 ^ -16470);
                                                                        }
                                                                        if (!(!this.selection.isRightArrow(-1))) {
                                                                          CipherPacketBuffer.increaseMusicVolume(param0 + 4941);
                                                                        }
                                                                      } else {
                                                                        if (var6 == 6) {
                                                                          if (!this.selection.isPressActivated((byte) 112)) {
                                                                            break regionExit2;
                                                                          }
                                                                          if (MatchingTextValidator.field_u != null) {
                                                                            AccountStateQuery.d((byte) -124);
                                                                          } else {
                                                                            var6 = param1 ? 1 : 0;
                                                                            NineSliceFrame.field_c = false;
                                                                            AvailabilityQueryResult.a(-28038, var6 != 0);
                                                                          }
                                                                        } else {
                                                                          if (var6 != 61 &&
                                                                            var6 != 9) {
                                                                            if (10 == var6) {
                                                                              if (!(!this.selection.isPressActivated((byte) 104))) {
                                                                                AccountContentDialog.field_ub.notifyBallEventsProcessed((byte) -97);
                                                                                var6 = param1 ? 1 : 0;
                                                                                stackIn_212_0 = -3405;
                                                                                stackIn_212_1 = -1;
                                                                                if (LobbyPlayerLookupSupport.a(true)) {
                                                                                  stackIn_213_2 = 21;
                                                                                } else {
                                                                                  stackIn_213_2 = 0;
                                                                                }
                                                                                AccountCreationDialog.a(stackIn_212_0, stackIn_212_1, stackIn_213_2, var6 != 0);
                                                                              }
                                                                            } else {
                                                                              if (var6 == 11) {
                                                                                if (!(!this.selection.isPressActivated((byte) 113))) {
                                                                                  AccountContentDialog.field_ub.resignGame(1791);
                                                                                  var6 = param1 ? 1 : 0;
                                                                                  stackIn_218_0 = -3405;
                                                                                  stackIn_218_1 = -1;
                                                                                  if (LobbyPlayerLookupSupport.a(true)) {
                                                                                    stackIn_219_2 = 21;
                                                                                  } else {
                                                                                    stackIn_219_2 = 0;
                                                                                  }
                                                                                  AccountCreationDialog.a(stackIn_218_0, stackIn_218_1, stackIn_219_2, var6 != 0);
                                                                                }
                                                                              } else {
                                                                                if (12 == var6) {
                                                                                  if (!this.selection.isPressActivated((byte) 120)) {
                                                                                    break regionExit2;
                                                                                  }
                                                                                  if ((AccountContentDialog.field_ub.modeFlags & TutorialController.field_c) != 0) {
                                                                                    AccountContentDialog.field_ub.requestRematch((byte) -17);
                                                                                  } else {
                                                                                    var6 = param1 ? 1 : 0;
                                                                                    stackIn_224_0 = -3405;
                                                                                    stackIn_224_1 = -7;
                                                                                    if (!LobbyPlayerLookupSupport.a(true)) {
                                                                                      stackIn_225_2 = 0;
                                                                                    } else {
                                                                                      stackIn_225_2 = 21;
                                                                                    }
                                                                                    AccountCreationDialog.a(stackIn_224_0, stackIn_224_1, stackIn_225_2, var6 != 0);
                                                                                  }
                                                                                } else {
                                                                                  if (var6 != 3) {
                                                                                    if (var6 == 13) {
                                                                                      if (!(!this.selection.isPressActivated((byte) 122))) {
                                                                                        if (MidiNoteMixer.field_v) {
                                                                                          AccountContentDialog.field_ub.resignGame(1791);
                                                                                          var6 = param1 ? 1 : 0;
                                                                                          AccountCreationDialog.a(param0 ^ 19737, -5, GameRules.field_b, var6 != 0);
                                                                                        }
                                                                                        if (!(!TransformSupport.field_e)) {
                                                                                          FaceNormal.a(0, 3, 11);
                                                                                        }
                                                                                      }
                                                                                      break regionExit1;
                                                                                    }
                                                                                    switch (var6) {
                                                                                      case 17:
                                                                                        if (!this.selection.isPressActivated((byte) 94)) {
                                                                                          break regionExit2;
                                                                                        }
                                                                                        SocialListEntry.field_Lb = 0;
                                                                                        break regionExit1;
                                                                                      case 18:
                                                                                        if (!this.selection.isPressActivated((byte) 86)) {
                                                                                          break regionExit2;
                                                                                        }
                                                                                        SocialListEntry.field_Lb = 1;
                                                                                        break regionExit1;
                                                                                      default:
                                                                                        break regionExit1;
                                                                                      case 19:
                                                                                        if (!this.selection.isPressActivated((byte) 83)) {
                                                                                          break regionExit2;
                                                                                        }
                                                                                        DualLinkNodeHashTable.openQuitPage(-1, NanoTickClock.getApplet(99));
                                                                                        break regionExit1;
                                                                                    }
                                                                                  }
                                                                                  if (!this.selection.isPressActivated((byte) 78)) {
                                                                                    break regionExit2;
                                                                                  }
                                                                                  if ((AccountContentDialog.field_ub.modeFlags & LobbyPanelLayoutSupport.field_f) != 0) {
                                                                                    var6 = param1 ? 1 : 0;
                                                                                    stackIn_240_0 = -3405;
                                                                                    stackIn_240_1 = -8;
                                                                                    if (LobbyPlayerLookupSupport.a(true)) {
                                                                                      stackIn_241_2 = 21;
                                                                                    } else {
                                                                                      stackIn_241_2 = 0;
                                                                                    }
                                                                                    AccountCreationDialog.a(stackIn_240_0, stackIn_240_1, stackIn_241_2, var6 != 0);
                                                                                  } else {
                                                                                    if ((AccountContentDialog.field_ub.modeFlags & PaletteFontLoader.field_d) != 0) {
                                                                                      var6 = param1 ? 1 : 0;
                                                                                      stackIn_236_0 = -3405;
                                                                                      stackIn_236_1 = -6;
                                                                                      if (!LobbyPlayerLookupSupport.a(true)) {
                                                                                        stackIn_237_2 = 0;
                                                                                      } else {
                                                                                        stackIn_237_2 = 21;
                                                                                      }
                                                                                      AccountCreationDialog.a(stackIn_236_0, stackIn_236_1, stackIn_237_2, var6 != 0);
                                                                                    } else {
                                                                                      var6 = param1 ? 1 : 0;
                                                                                      stackIn_232_0 = -3405;
                                                                                      stackIn_232_1 = -7;
                                                                                      if (!LobbyPlayerLookupSupport.a(true)) {
                                                                                        stackIn_233_2 = 0;
                                                                                      } else {
                                                                                        stackIn_233_2 = 21;
                                                                                      }
                                                                                      AccountCreationDialog.a(stackIn_232_0, stackIn_232_1, stackIn_233_2, var6 != 0);
                                                                                    }
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                          } else {
                                                                            if (!this.selection.isPressActivated((byte) 75)) {
                                                                              break regionExit2;
                                                                            }
                                                                            AccountContentDialog.field_ub.openInGameMenu(256, param1);
                                                                            ContextMenu.field_Sb = true;
                                                                            AppletUrlSupport.field_c = false;
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    if (!(!this.selection.isPressActivated((byte) 51))) {
                                                      var6 = param1 ? 1 : 0;
                                                      stackIn_129_0 = -3405;
                                                      stackIn_129_1 = -1;
                                                      if (LobbyPlayerLookupSupport.a(true)) {
                                                        stackIn_130_2 = 21;
                                                      } else {
                                                        stackIn_130_2 = 0;
                                                      }
                                                      AccountCreationDialog.a(stackIn_129_0, stackIn_129_1, stackIn_130_2, var6 != 0);
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              break regionExit1;
            }
            if (this.selection.isPressActivated((byte) 97)) {
              AccountCreationDialog.a(-3405, 6, 0, param1);
            }
          }
        }
    }

    final void validateMenuGuard(byte param0) {
        if (param0 > -15) {
          this.getButtonHeight((byte) 12, -69);
        }
    }

    final void renderParagraphSprite(BitmapFont param0, int[] param1, int param2, int param3, String param4, int param5, int param6) {
        int var11 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        String[] var18 = null;
        int[] var25 = null;
        int[] var26 = null;
        var17 = Pool.field_O;
        try {
          if (param3 != -16097) {
            this.drawScreen(38);
          }
          if (param4 != TutorialController.field_m) {
            if (param4.equals(TutorialController.field_m)) {
              return;
            }
            var18 = new String[32];
            var9 = param0.wrapText(param4, new int[]{param5}, var18);
            var10 = 0;
            for (var11 = 0; var9 > var11; var11++) {
              var10 = var10 + param1[var11 % param1.length];
            }
            PasswordValidator.field_p = new Sprite(param5, var10 + param0.maxDescent);
            var25 = new int[4];
            var26 = SoftwareRasterizer.pixels;
            var13 = SoftwareRasterizer.width;
            var14 = SoftwareRasterizer.height;
            SoftwareRasterizer.saveClip(var25);
            PasswordValidator.field_p.bindAsRenderTarget();
            var15 = 0;
            var16 = param0.maxAscent;
            while (var15 < var9) {
              param0.drawLeft(var18[var15], 0, var16, param6, -1);
              var15++;
              var16 = var16 + param1[var15 % param1.length];
            }
            OpacityWidget.field_P.bindAsRenderTarget(15100);
            SoftwareRasterizer.setTarget(var26, var13, var14);
            SoftwareRasterizer.restoreClip(var25);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_16_0 = var8;
          stackIn_16_1 = new StringBuilder().append("ob.WB(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    void navigateBack(byte param0) {
        AccountCreationDialog.a(-3405, this.parentScreenId, this.parentScreenId, false);
        if (param0 > -11) {
          this.requestLocalMatch(11, false, -44);
        }
    }

    int getButtonHeight(byte param0, int param1) {
        if (param0 != 69) {
          this.getButtonRight(true, 77);
        }
        return 36;
    }

    void darkenBackground(byte param0) {
        SoftwareRasterizer.darkenRectangle(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height);
        if (param0 != 108) {
          field_y = (int[]) null;
        }
    }

    final void setItems(int[] param0, boolean param1) {
        try {
          this.itemIds = param0;
          this.selection = new MenuSelection(this.itemIds.length);
          if (!param1) {
            this.drawParagraphSprite(5, true);
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ob.SB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void onEnter(int param0, int param1, boolean param2) {
        if (param0 != ~this.selection.selectedIndex) {
          param1 = this.selection.selectedIndex;
        }
        this.selection.initializeSelection(param2, param1, this.findButtonAt(-6564, DebouncedValidationProvider.field_f, ReflectionReplySupport.field_i), true);
        field_D = SocialListEntry.field_Tb;
    }

    final void drawParagraphSprite(int param0, boolean param1) {
        PasswordValidator.field_p.draw(SoftwareRasterizer.width - PasswordValidator.field_p.field_z >> 1, param0);
        if (param1) {
          this.onEnter(-32, 52, true);
        }
    }

    int getButtonLeft(int param0, int param1) {
        if (param0 != 0) {
          return 80;
        }
        return this.buttonLeft;
    }

    boolean hasButtonBackdrop(int param0, int param1) {
        if (param0 != -13676) {
          this.field_n = false;
        }
        return this.hasButtonBackdrop;
    }

    boolean isButtonVisible(int param0, int param1) {
        int var3 = -92 / ((-42 - param1) / 49);
        return true;
    }

    final void clearBackground(int param0) {
        SoftwareRasterizer.fillRectangle(param0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height, 0);
    }

    void onExit(byte param0) {
        if (param0 != -6) {
          field_F = 50;
        }
    }

    void drawButtonOverlay(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param4 != -24267) {
          this.framedPanel = true;
        }
    }

    private final int getButtonState(int param0, int param1) {
        if (param1 != -4) {
          this.field_n = false;
        }
        if (!this.isButtonEnabled(param0, true)) {
          return this.selection.selectedIndex != param0 ? 1 : 2;
        }
        return this.selection.selectedIndex == param0 ? 3 : 4;
    }

    void drawScreen(int param0) {
        int var2 = 0;
        int var3;
        var3 = Pool.field_O;
        this.drawBackground(false);
        if (ArrayWidgetGroup.field_G == null ||
          !(ArrayWidgetGroup.field_G.length >= this.selection.itemCount)) {
          ArrayWidgetGroup.field_G = new Sprite[this.selection.itemCount];
          FreePlayRules.field_h = new int[this.selection.itemCount];
          QuickChatNavigationSupport.field_e = new String[this.selection.itemCount];
        }
        if (param0 < 36) {
          return;
        }
        for (var2 = 0; var2 < this.selection.itemCount; var2++) {
          if (this.isButtonVisible(var2, -126)) {
            this.drawButton(true, var2);
          }
        }
        if (0 == this.screenId) {
          ProjectedLineSupport.field_k.draw(0, SoftwareRasterizer.height - ProjectedLineSupport.field_k.field_y);
          FullscreenFocusCanvas.field_a.draw(SoftwareRasterizer.width - FullscreenFocusCanvas.field_a.field_w, SoftwareRasterizer.height - FullscreenFocusCanvas.field_a.field_y);
        }
    }

    final static void a(int param0, ScrollPane param1, int param2, int param3, int param4, int param5, LobbyPlayer param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        PlayerContextMenu var13 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          LogoFinalFrameLoader.openPlayerContextMenu(param6.displayName, -1, param6.playerId, -1, param1, param6.accountName, 32540, param6, (int[]) null);
          PlasmaBallSkin.field_m.addGameInviteActions((byte) 124, true);
          PlasmaBallSkin.field_m.buildPlayerMenu(0, (int[]) null, (byte) 75);
          PlasmaBallSkin.field_m.addReportAbuseAction((byte) 65);
          var13 = PlasmaBallSkin.field_m;
          var8 = param5;
          var9 = param4;
          var10 = param2;
          var11 = param0;
          var13.field_n.layoutAtAnchor(var10, var11, var8, 0, var9);
          if (param3 != 9851) {
            MenuScreen.releaseStatics((byte) -122);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_5_0 = var7;
          stackIn_5_1 = new StringBuilder().append("ob.AC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    int getButtonRight(boolean param0, int param1) {
        if (param0) {
          this.onExit((byte) 8);
        }
        return this.buttonRight;
    }

    final static void a(int[] param0, int[] param1, int[] param2, int[] param3, float[] param4, int[] param5, float[] param6, int param7, int[] param8) {
        float var9_float = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19 = 0.0f;
        float var20 = 0.0f;
        float var21 = 0.0f;
        float var22 = 0.0f;
        float var23 = 0.0f;
        float var24 = 0.0f;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        float var24Lifetime1;
        float var24Lifetime2;
        float var24Lifetime3;
        try {
          var9_float = param4[0];
          var10 = param6[param7];
          var11 = param4[1];
          var12 = param6[1];
          var13 = param4[2];
          var14 = param6[2];
          var15 = -(var12 * var13) + var11 * var14;
          var16 = -(1.0f * var14) + 1.0f * var12;
          var17 = var13 * 1.0f - 1.0f * var11;
          var18 = -(var14 * var9_float) + var13 * var10;
          var19 = var14 * 1.0f - var10 * 1.0f;
          var20 = -(var13 * 1.0f) + var9_float * 1.0f;
          var21 = -(var10 * var11) + var9_float * var12;
          var22 = -(var12 * 1.0f) + 1.0f * var10;
          var23 = 1.0f * var11 - var9_float * 1.0f;
          var24 = 1.0f / (var9_float * var16 + 1.0f * var15 + var17 * var10);
          var20 = var20 * var24;
          var17 = var24 * var17;
          var22 = var22 * var24;
          var23 = var24 * var23;
          var21 = var21 * var24;
          var16 = var24 * var16;
          var15 = var15 * var24;
          var18 = var18 * var24;
          var19 = var24 * var19;
          var25 = param5[0];
          var26 = param3[0];
          var27 = param2[0];
          var28 = param5[1];
          var29 = param3[1];
          var30 = param2[1];
          var31 = param5[2];
          var32 = param3[2];
          var33 = param2[2];
          var24Lifetime1 = 0.5f + (var15 * (float)var25 + var18 * (float)var28 + var21 * (float)var31);
          param8[0] = (int)var24Lifetime1;
          param8[1] = (int)(var22 * (float)var31 + (var16 * (float)var25 + var24Lifetime1 + (float)var28 * var19) + 0.5f);
          param8[2] = (int)((float)var31 * var23 + ((float)var28 * var20 + (var24Lifetime1 + var17 * (float)var25)) + 0.5f);
          var24Lifetime2 = 0.5f + ((float)var32 * var21 + (var18 * (float)var29 + var15 * (float)var26));
          param1[0] = (int)var24Lifetime2;
          param1[1] = (int)(var24Lifetime2 + var16 * (float)var26 + (float)var29 * var19 + (float)var32 * var22 + 0.5f);
          param1[2] = (int)(var20 * (float)var29 + (var24Lifetime2 + var17 * (float)var26) + (float)var32 * var23 + 0.5f);
          var24Lifetime3 = (float)var33 * var21 + ((float)var30 * var18 + var15 * (float)var27) + 0.5f;
          param0[0] = (int)var24Lifetime3;
          param0[2] = (int)(var20 * (float)var30 + (var24Lifetime3 + (float)var27 * var17) + (float)var33 * var23 + 0.5f);
          param0[1] = (int)((float)var33 * var22 + ((float)var30 * var19 + (var16 * (float)var27 + var24Lifetime3)) + 0.5f);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ob.VB(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    final void enableFramedPanel(int param0, int param1, int param2) {
        this.framedPanel = true;
        int var4 = null != this.headerSprite ? this.headerSprite.field_y : 0;
        if (param2 != -10) {
          return;
        }
        this.setPanelBounds(SoftwareRasterizer.width - 2 * param0, param1, param0, -param1 + var4 + (SoftwareRasterizer.height - param1), 0);
    }

    boolean isButtonEnabled(int param0, boolean param1) {
        if (!param1) {
          return false;
        }
        return this.isButtonVisible(param0, -126);
    }

    MenuScreen(Sprite param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        this.hasButtonBackdrop = false;
        this.field_n = true;
        this.headerSprite = null;
        this.framedPanel = false;
        this.drawsBackground = true;
        try {
          this.buttonLeft = param2;
          this.headerSprite = param0;
          this.buttonSpacing = param5;
          this.buttonRight = param3;
          this.buttonTop = param4;
          DisplayModeSupport.field_c[param1] = this;
          this.screenId = param1;
          this.setItems(param6, true);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ob.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    void handleNavigationKey(int param0) {
        this.selection.navigateVertical(-15525);
        if (param0 != -34) {
          MenuScreen.releaseStatics((byte) 126);
        }
    }

    static {
        field_j = 11;
        field_i = 9;
        field_m = new int[]{2, 20, 21, 49, 5, 13};
        field_D = 0;
        field_F = 1 << field_j;
    }
}
