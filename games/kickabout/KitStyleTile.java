/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class KitStyleTile extends UiLayoutNode implements PopupCard {
    private ModelMesh field_Eb;
    UiLayoutNode field_Jb;
    private int field_Db;
    static byte[] field_yb;
    private boolean field_Gb;
    boolean field_Kb;
    boolean field_Ib;
    static int[] field_zb;
    private int field_Ab;
    static ResourceArchive field_Bb;
    private int field_Fb;
    KitStyleDefinition field_Cb;
    private ClubState field_Hb;

    final static void updateTutorialCamera(int param0) {
        int var2;
        FootballerAgent var2_ref_nl;
        int var3;
        int var4;
        BallAgent var5;
        var4 = Kickabout.field_G;
        if (param0 != 13459) {
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        var5 = ThumbnailStateFactory.field_d.field_V;
        if (HuffmanCodec.field_e == 1) {
          if (HoverTooltip.field_Eb) {
            var2 = EmailAvailabilityValidator.field_k.pixelY(true);
            var3 = (var2 * -200 + 326800) / -490;
            PitchAppearanceSupport.setProjectionTarget(256.0, 60, 448.0, (double)(var3 + 1344));
          } else {
            PitchAppearanceSupport.setProjectionTarget(256.0, param0 ^ 13487, (double)EmailAvailabilityValidator.field_k.pixelX(-122), (double)EmailAvailabilityValidator.field_k.pixelY(true));
          }
        } else {
          if (HuffmanCodec.field_e != 2) {
            if (HuffmanCodec.field_e != 3) {
              if (HuffmanCodec.field_e == 4) {
                if (!HoverTooltip.field_Eb) {
                  PitchAppearanceSupport.setProjectionTarget(200.0, 60, (double)EmailAvailabilityValidator.field_k.pixelX(param0 - 13564), (double)(EmailAvailabilityValidator.field_k.pixelY(true) - 55));
                } else {
                  PitchAppearanceSupport.setProjectionTarget(160.0, 60, (double)(AccountInputValidationResult.field_f.pixelX(-119) + EmailAvailabilityValidator.field_k.pixelX(-118) >> 1), (double)(AccountInputValidationResult.field_f.pixelY(true) + EmailAvailabilityValidator.field_k.pixelY(true) >> 1));
                }
              } else {
                if (5 != HuffmanCodec.field_e) {
                  if (6 == HuffmanCodec.field_e) {
                    PitchAppearanceSupport.setProjectionTarget(180.0, 60, (double)(EmailAvailabilityValidator.field_k.pixelX(-99) + AccountInputValidationResult.field_f.pixelX(-97) >> 1), (double)EmailAvailabilityValidator.field_k.pixelY(true));
                  } else {
                    if (HuffmanCodec.field_e == 7) {
                      var2_ref_nl = ThumbnailStateFactory.field_d.field_P[1][4];
                      PitchAppearanceSupport.setProjectionTarget(220.0, 60, (double)(AccountInputValidationResult.field_f.pixelX(-107) + var2_ref_nl.pixelX(-89) >> 1), (double)(AccountInputValidationResult.field_f.pixelY(true) + var2_ref_nl.pixelY(true) >> 1));
                    } else {
                      if (HuffmanCodec.field_e != 8) {
                        if (HuffmanCodec.field_e == 9) {
                          PitchAppearanceSupport.setProjectionTarget(220.0, 60, (double)(EmailAvailabilityValidator.field_k.pixelX(-128) + AccountInputValidationResult.field_f.pixelX(-121) >> 1), (double)EmailAvailabilityValidator.field_k.pixelY(true));
                        } else {
                          if (HuffmanCodec.field_e != 10) {
                            if (HuffmanCodec.field_e != 11) {
                              if (HuffmanCodec.field_e != 12) {
                                if (HuffmanCodec.field_e == 13) {
                                  if (!HoverTooltip.field_Eb &&
                                    var5.positionY >= 0) {
                                    if (var5.possessorTeam != 0 &&
                                      var5.horizontalSpeedSquared(-125) < 1638400) {
                                      PitchAppearanceSupport.setProjectionTarget(200.0, 60, (double)(LoginResponseUiSupport.field_c.pixelX(param0 - 13584) + var5.pixelX(true) >> 1), (double)(LoginResponseUiSupport.field_c.pixelY(true) + var5.pixelY(879306160) >> 1));
                                    } else {
                                      PitchAppearanceSupport.setProjectionTarget(170.0, param0 - 13399, (double)(LoginResponseUiSupport.field_c.pixelX(param0 ^ -13553) * 3 + 448 >> 2), (double)(LoginResponseUiSupport.field_c.pixelY(true) * 3 >> 2));
                                    }
                                    decompiledFrameRemainder0 = false;
                                  }
                                  else {
                                    PitchAppearanceSupport.setProjectionTarget(230.0, 60, 448.0, 50.0);
                                  }
                                }
                              } else {
                                PitchAppearanceSupport.setProjectionTarget(200.0, 60, (double)(LoginResponseUiSupport.field_c.pixelX(-92) + var5.pixelX(true) >> 1), (double)(LoginResponseUiSupport.field_c.pixelY(true) + (-160 + var5.pixelY(879306160)) >> 1));
                              }
                            } else {
                              PitchAppearanceSupport.setProjectionTarget(200.0, 60, (double)(LoginResponseUiSupport.field_c.pixelX(-109) + var5.pixelX(true) >> 1), (double)(LoginResponseUiSupport.field_c.pixelY(true) + var5.pixelY(879306160) >> 1));
                            }
                          } else {
                            PitchAppearanceSupport.setProjectionTarget(160.0, 60, 448.0, 672.0);
                          }
                        }
                      } else {
                        var2 = AccountInputValidationResult.field_f.pixelY(true);
                        var3 = 0;
                        if (var2 <= 810) {
                          if (var2 > 400) {
                            var3 = 1;
                          }
                        } else {
                          var3 = 2;
                        }
                        if (!HoverTooltip.field_Eb) {
                          PitchAppearanceSupport.setProjectionTarget(190.0, 60, (double)AccountInputValidationResult.field_f.pixelX(-92), (double)QuickChatMenuFactory.field_a[var3]);
                        } else {
                          PitchAppearanceSupport.setProjectionTarget(256.0, 60, (double)AccountInputValidationResult.field_f.pixelX(param0 ^ -13551), (double)AccountInputValidationResult.field_f.pixelY(true));
                        }
                      }
                    }
                  }
                } else {
                  if (HoverTooltip.field_Eb) {
                    PitchAppearanceSupport.setProjectionTarget(160.0, 60, (double)AccountInputValidationResult.field_f.pixelX(-124), (double)AccountInputValidationResult.field_f.pixelY(true));
                  } else {
                    PitchAppearanceSupport.setProjectionTarget(200.0, 60, (double)AccountInputValidationResult.field_f.pixelX(-118), (double)(AccountInputValidationResult.field_f.pixelY(true) - 55));
                  }
                }
              }
            } else {
              PitchAppearanceSupport.setProjectionTarget(200.0, 60, (double)EmailAvailabilityValidator.field_k.pixelX(-108), (double)EmailAvailabilityValidator.field_k.pixelY(true));
            }
          } else {
            PitchAppearanceSupport.setProjectionTarget(226.0, 60, (double)EmailAvailabilityValidator.field_k.pixelX(-111), (double)EmailAvailabilityValidator.field_k.pixelY(true));
          }
        }

    }

    public final int getHeight(int param0) {
        if (param0 != 15) {
          return 38;
        }
        return 120;
    }

    public final int getWidth(int param0) {
        if (param0 != 0) {
          field_zb = (int[]) null;
        }
        return 110;
    }

    public final void drawCentered(int param0, int param1, int param2) {
        AppScreen.renderModelToSprite(this.field_Eb, this.field_Db, PlayArea.field_e, -83);
        SoftwareDrawingSupport.outlineSpriteInPlace(PlayArea.field_e, 131586);
        SoftwareDrawingSupport.outlineSpriteInPlace(PlayArea.field_e, 16777215);
        SoftwareDrawingSupport.outlineSpriteInPlace(PlayArea.field_e, 13421772);
        SoftwareDrawingSupport.outlineSpriteInPlace(PlayArea.field_e, 11184810);
        if (param1 != 23) {
          PcmStreamMixer var5 = (PcmStreamMixer) null;
          KitStyleTile.initializeLogoSequence(-77, (ResourceArchive) null, 47, (PcmStreamMixer) null);
        }
        PlayArea.field_e.drawHalfSize(-(PlayArea.field_e.field_o >> 2) + param2, param0 - (PlayArea.field_e.field_v >> 2));
    }

    final static int[] createDemoIntegerValues(int param0) {
        int var1 = 54 % ((param0 + 42) / 42);
        return new int[]{1, 2, 3, 4};
    }

    final static void finishSharedUiTransitions(boolean param0) {
        PlayerStats.finishUiTransitions(-1456);
        if (param0) {
          PcmStreamMixer var2 = (PcmStreamMixer) null;
          KitStyleTile.initializeLogoSequence(-120, (ResourceArchive) null, 13, (PcmStreamMixer) null);
        }
    }

    final void drawKitTile(int param0) {
        boolean stackIn_4_1 = false;
        int stackIn_9_0 = 0;
        int stackIn_19_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        ArgbSprite var8;
        int var9;
        ArgbSprite var10;
        ArgbSprite var11;
        var9 = Kickabout.field_G;
        stackIn_4_1 = (this.field_F < SoftwareRasterizer.field_c) && (SoftwareRasterizer.field_b < this.field_q + this.field_F);
        this.field_Gb = stackIn_4_1;
        if (!this.field_Gb) {
          return;
        }
        stackIn_9_0 = (this.field_Cb.styleId != this.field_Hb.field_w) ? 0 : 1;
        var2 = stackIn_9_0;
        if (param0 != -24508) {
          return;
        }
        if (this.field_Jb.field_gb) {
          if (!this.field_Ib) {
            stackIn_19_0 = (!this.field_Kb) ? 1 : 0;
          } else {
            stackIn_19_0 = 0;
          }
        } else {
          stackIn_19_0 = 0;
        }
        var3 = stackIn_19_0;
        var4 = 0;
        if (var3 == 0) {
          if (var2 != 0) {
            var4 = 40;
          }
        } else {
          var4 = 210;
        }
        if (0 != var4) {
          SoftwareRasterizer.fillRoundedRectangleBlended(this.field_Jb.field_F, this.field_Jb.field_T, this.field_Jb.field_q, this.field_Jb.field_mb, 8, 16777215, var4);
        }
        if (var2 != 0) {
          SoftwareRasterizer.drawRoundedRectangle(this.field_Jb.field_F, this.field_Jb.field_T, this.field_Jb.field_q, this.field_Jb.field_mb, 8, 16777215);
        }
        if (null != this.field_Eb) {
          AppScreen.renderModelToSprite(this.field_Eb, this.field_Db, PlayArea.field_e, -101);
          if (var2 == 0) {
            if (var3 == 0) {
              if (this.field_Fb == 15 ||
                15 == this.field_Ab) {
                SoftwareDrawingSupport.outlineSpriteInPlace(PlayArea.field_e, 16777215);
                SoftwareDrawingSupport.outlineSpriteInPlace(PlayArea.field_e, 7829367);
              }
            } else {
              SoftwareDrawingSupport.outlineSpriteInPlace(PlayArea.field_e, 131586);
              SoftwareDrawingSupport.outlineSpriteInPlace(PlayArea.field_e, 65793);
            }
          } else {
            SoftwareDrawingSupport.outlineSpriteInPlace(PlayArea.field_e, 131586);
            SoftwareDrawingSupport.outlineSpriteInPlace(PlayArea.field_e, 16777215);
            SoftwareDrawingSupport.outlineSpriteInPlace(PlayArea.field_e, 13421772);
            SoftwareDrawingSupport.outlineSpriteInPlace(PlayArea.field_e, 11184810);
          }
          PlayArea.field_e.drawHalfSize(this.field_Jb.field_F + (-50 + this.field_Jb.field_q >> 1), (this.field_Jb.field_mb - 50 >> 1) + this.field_Jb.field_T);
        }
        var5 = (this.field_Jb.field_q >> 1) + this.field_Jb.field_F;
        var6 = this.field_Jb.field_mb + this.field_Jb.field_T + 5;
        if (this.field_Kb) {
          var10 = LineupPositionSupport.field_g;
          var10.draw(-(var10.field_q >> 1) + var5, var6 - (var10.field_w >> 1));
          var8 = new ArgbSprite(18, 13);
          PacketBuffer.pushSpriteRaster(param0 ^ -24576, var8);
          ConsoleTokenCursor.field_d.drawCentered("10", SoftwareRasterizer.field_g >> 1, SoftwareRasterizer.field_f - 2, -1, -1);
          SoftwareDrawingSupport.outlineSpriteInPlace(var8, -16711423);
          SoftwareDrawingSupport.outlineSpriteInPlace(var8, 1996554497);
          TeamManagementScreen.e(122);
          ((Sprite) ((Object) var8)).draw(-(((Sprite) ((Object) var8)).field_o >> 1) + var5, -(((Sprite) ((Object) var8)).field_v >> 1) + var6);
        }
        if (this.field_Ib) {
          var11 = LoginResponseUiSupport.field_h;
          var11.draw(var5 - (var11.field_q >> 1), var6 - (var11.field_w >> 1));
        }
        return;
    }

    final static void initializeLogoSequence(int param0, ResourceArchive param1, int param2, PcmStreamMixer param3) {
        try {
          ButtonMenuScreen.field_l = GameSoundEffect.getTargetFramesPerSecond((byte) 119) * param0 / 1000;
          GameAppletShell.decodeLogoAudio(param1, (byte) 60);
          StripedProgressBar.loadLogoModels((byte) 49, param1);
          CipherPacketBuffer.loadSplitFinalFrameSprites(3, param1);
          RasterGammaSupport.initializeIntensityLookup(false);
          Trinket.buildBlurredModelSprite((byte) -128);
          PlayerStats.field_p = 0 - ButtonMenuScreen.field_l;
          int var4_int = -119 / ((param2 + 39) / 58);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "nt.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void updateKitTile(int param0, boolean param1) {
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        String stackIn_24_2 = null;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        String stackIn_30_2 = null;
        int var3;
        int var4;
        int var5;
        var5 = Kickabout.field_G;
        if (!this.field_Gb) {
          return;
        }
        var3 = this.field_Hb.field_k;
        var4 = this.field_Hb.field_R;
        if (param0 != -1) {
          this.field_Hb = (ClubState) null;
        }
        if (null == this.field_Eb ||
          var3 != this.field_Fb ||
          this.field_Ab != var4) {
          this.field_Eb = AuctionsHelpScreen.createKitMesh(this.field_Cb.styleId, LongPlusOneCommand.field_B[var4], true, LongPlusOneCommand.field_B[var3]).createModelMesh(100, 4369, 20, -56, -20);
          this.field_Fb = var3;
          this.field_Ab = var4;
        }
        if (this.field_Jb.field_gb ||
          0 != this.field_Db) {
          this.field_Db = this.field_Db + 40;
          if (2048 <= this.field_Db) {
            if (this.field_gb) {
              this.field_Db = this.field_Db - 2048;
            } else {
              this.field_Db = 0;
            }
          }
        }
        if (this.field_gb) {
          if (this.field_Cb.achievementBitIndex != -1) {
            if (GoalkeeperAiSupport.field_a[this.field_Cb.achievementBitIndex] &&
              !ClientPacketFlushSupport.isBitSet(this.field_Cb.achievementBitIndex, 0, BufferedSocket.field_f)) {
              IndexedSpriteState.showTextTooltip(-67, MyKitScreen.field_W.toLowerCase());
            } else {
              stackIn_23_0 = -67;
              stackIn_23_1 = -18;
              if (!this.field_Ib) {
                stackIn_24_2 = ArchivePreloader.field_f;
              } else {
                stackIn_24_2 = RenderedBall.field_R;
              }
              IndexedSpriteState.showTextTooltip(stackIn_23_0, LoginDialog.$cfr$intArgs$a$53ce4ab4c593(stackIn_23_1, stackIn_24_2, new String[]{AvailabilityCheckRequest.field_c[this.field_Cb.achievementBitIndex].toLowerCase()}));
            }
          }
          if (-1 != this.field_Cb.unlockBitIndex) {
            stackIn_29_0 = -67;
            stackIn_29_1 = -18;
            if (!this.field_Kb) {
              stackIn_30_2 = CalendarSupport.field_h;
            } else {
              stackIn_30_2 = TickClock.field_l;
            }
            IndexedSpriteState.showTextTooltip(stackIn_29_0, LoginDialog.$cfr$intArgs$a$53ce4ab4c593(stackIn_29_1, stackIn_30_2, new String[]{}));
          }
          if (this.field_Cb.requiresJagexModeratorRights) {
            IndexedSpriteState.showTextTooltip(-67, BytePlusOneCommand.field_G);
          }
          if (this.field_Cb.requiredAccessKey != -1L) {
            IndexedSpriteState.showTextTooltip(-67, AccountTermsPanel.field_C);
          }
        }
        if (this.field_sb == 1) {
          if (this.field_Ib) {
            KitUnlockNoticeSupport.enqueueLockedKitNotice((byte) -98, this.field_Cb.achievementBitIndex);
          } else {
            if (!this.field_Kb) {
              LoginKind.playSelectionSound((byte) 81);
            } else {
              SocketArchiveNetworkClient.enqueueMessageDialog((byte) 126, 36);
            }
          }
        }
        return;
    }

    public static void releaseStatics(int param0) {
        field_yb = null;
        field_zb = null;
        if (param0 != 4476) {
          field_Bb = (ResourceArchive) null;
        }
        field_Bb = null;
    }

    final static void updateSessionLinks(java.applet.Applet param0, byte param1) {
        try {
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          String var3 = null;
          java.net.URL var4 = null;
          try {
            try {
              if (param1 <= 5) {
                field_yb = (byte[]) null;
              }
              var4 = param0.getCodeBase();
              var3 = SessionUrlSupport.decorateSessionUrl(param0, var4, 3).getFile();
              AppletJavaScriptBridge.callJavaScript(new Object[]{"home", var3 + "home.ws"}, param0, "updatelinks", 25449);
              AppletJavaScriptBridge.callJavaScript(new Object[]{"gamelist", var3 + "togamelist.ws"}, param0, "updatelinks", 25449);
              AppletJavaScriptBridge.callJavaScript(new Object[]{"serverlist", var3 + "toserverlist.ws"}, param0, "updatelinks", 25449);
              AppletJavaScriptBridge.callJavaScript(new Object[]{"options", var3 + "options.ws"}, param0, "updatelinks", 25449);
              AppletJavaScriptBridge.callJavaScript(new Object[]{"terms", var3 + "terms.ws"}, param0, "updatelinks", 25449);
              AppletJavaScriptBridge.callJavaScript(new Object[]{"privacy", var3 + "privacy.ws"}, param0, "updatelinks", 25449);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref;
            stackIn_8_1 = new StringBuilder().append("nt.B(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    KitStyleTile(ClubState param0, KitStyleDefinition param1) {
        this.field_Eb = null;
        this.field_Ib = false;
        this.field_Gb = false;
        this.field_Kb = false;
        try {
          this.field_Hb = param0;
          this.field_Cb = param1;
          this.field_Fb = -1;
          this.field_Ab = -1;
          this.field_Jb = new UiLayoutNode();
          this.addChild((byte) -128, this.field_Jb);
          this.field_q = 50;
          this.field_Jb.setBounds(true, 60, (this.field_q - 50 >> 1) - 5, 0, 60);
          this.field_Ib = this.field_Cb.isAchievementLocked(ScrollContainer.field_Ib, (byte) 54, BufferedSocket.field_f);
          this.field_Kb = this.field_Cb.isUnlockMaskLocked(ScrollContainer.field_Ib, field_yb, (byte) -81);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "nt.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_zb = new int[3];
    }
}
