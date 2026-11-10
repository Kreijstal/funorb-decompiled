/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class GameLoopApplet extends FunOrbApplet implements GameLayer {
    static String field_B;
    static String field_C;
    static int field_z;
    static Sprite field_A;

    abstract void onLoadingFinished(int param0);

    protected GameLoopApplet() {
    }

    final void startWithLoader(LoadingSequence param0, byte param1) {
        try {
          DualLinkNodeHashTable.field_b = param0;
          this.enableDefaultResponses((byte) 116, true);
          this.enableIntRecordResponses(12);
          this.enableHighscoreResponses(param1 - 15);
          this.enableSubmissionAcknowledgements((byte) 63);
          this.enableRecordStatusResponses(false);
          this.enableRankingsResponses((byte) 122);
          this.enableChatResponses(-113);
          if (param1 != 14) {
            return;
          }
          try {
            RasterCanvasSizeTarget.field_d[10] = -1;
            RasterCanvasSizeTarget.field_d[9] = -1;
            LoginDialog.field_eb = new Vector();
            TileMap.addGameLayer((byte) 6, (GameLayer) (this));
          } catch (RuntimeException runtimeException) {
            throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "m.NA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void paintFrame(byte param0) {
        int var3 = 0;
        int var5 = ZombieDawn.field_J;
        java.awt.Canvas var2 = PowerupBar.getActiveCanvas(-122);
        if (BootstrapLoadingHelpers.shouldShowBootstrapLoadingScreen((byte) -44)) {
          ProxyAuthException.renderStartupScreen(var2, 0, Blast.isFullscreenActive(-6376));
          return;
        }
        if (!ScrollContainer.field_F) {
          BitPacketBuffer.presentFrame(var2, (byte) -125);
          return;
        }
        if (!ProxyAuthException.field_b &&
          !MeleeHuman.isGuestSession(13296)) {
          ArrayWidgetContainer.setLoadingProgress(SavedDataRequest.field_p, 100.0f, -1);
          BitPacketBuffer.presentFrame(var2, (byte) -86);
          return;
        }
        AudioSetupHelpers.field_b = true;
        for (var3 = -1 + LoginDialog.field_eb.size(); var3 >= 0; var3--) {
          ((GameLayer) (LoginDialog.field_eb.elementAt(var3))).drawFrame(-14964);
        }
        int var4 = 35 / ((param0 + 27) / 44);
        if (AudioSetupHelpers.field_b) {
          DelegatingCanvas.drawModalOverlays(false);
          PowerupBar.drawRasterToCanvas(-126, 0, 0, var2);
        } else {
          this.onFrameNotPresented(29268);
        }
    }

    abstract boolean isConnectionBusy(int param0);

    public abstract void drawFrame(int param0);

    private final void dispatchInputEvents(int param0) {
        int stackIn_28_1 = 0;
        boolean stackIn_29_2 = false;
        int stackIn_58_0 = 0;
        int stackIn_59_1 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        GameLayer var6;
        int var3Lifetime1;
        var5 = ZombieDawn.field_J;
        var2 = 0;
        if (!ArmySoldier.hasActiveDialog((byte) -80)) {
          if (NodeHashTable.isLegacyMenuOpen(false)) {
            if (DelayedPacket.isDisplayModeChangePending(2)) {
              RasterBuffer.advanceLoginTransition(256);
            } else {
              var3 = FrameSequence.pollPopupMenuAction(true);
              if (var3 != 2) {
                if (3 == var3) {
                  DisplayState.requestFullscreen(true, false);
                  this.runTick(false, false);
                } else {
                  if (var3 != 4) {
                    this.runTick(false, false);
                  } else {
                    RegionPowerupEffect.startLoginTransition(-1, GameWorld.field_Y, false);
                    UiContainer.field_C = true;
                    this.runTick(false, false);
                  }
                }
              } else {
                FullscreenExitHelpers.exitFullscreen((byte) -71);
              }
            }
          } else {
            if (LoginPayloadKind.startRequestTimeout(15000)) {
              stackIn_28_1 = -27698;
              stackIn_29_2 = (null != DisplayState.field_b);
              var3 = this.pollLogin(stackIn_28_1, stackIn_29_2);
              if (var3 != 1 &&
                var3 != 2) {
                this.runTick(false, false);
              } else {
                if (null != DisplayState.field_b) {
                  FullscreenExitHelpers.exitFullscreen((byte) -71);
                }
                if (var3 != 2) {
                  this.runTick(false, false);
                } else {
                  AchievementSubmission.openQuitPage(param0 ^ -1869, AppletHostHelpers.getHostApplet(0));
                  this.runTick(false, false);
                }
              }
            } else {
              if (AreaSelectionScreen.isDimOverlayShown(param0 ^ 1813)) {
                if (!DelayedPacket.isDisplayModeChangePending(2)) {
                  var3 = QuickChatCommandType.pollFullscreenPromptAction(param0 - 1831);
                  if (var3 == 1) {
                    RegionPowerupEffect.startLoginTransition(-1, LoginPromptTexts.field_e, true);
                  }
                  this.runTick(false, false);
                } else {
                  RasterBuffer.advanceLoginTransition(256);
                }
              } else {
                if (!DelayedPacket.isDisplayModeChangePending(2)) {
                  var2 = 1;
                  var3 = -1;
                  while (TileMap.pollKeyEvent(param0 ^ -1902)) {
                    if (PasswordValidator.field_i == -1) {
                      if (PasswordValidator.field_i == -1 &&
                        -1 != var3) {
                        PasswordValidator.field_i = var3;
                        var3 = -1;
                      }
                    } else {
                      if (ProxyAuthException.isDeferredTypingKey((byte) -116, PasswordValidator.field_i)) {
                        var3 = PasswordValidator.field_i;
                        continue;
                      }
                    }
                    var4 = 0;
                    while (LoginDialog.field_eb.size() > var4) {
                      if (((GameLayer) (LoginDialog.field_eb.elementAt(var4))).onKeyTyped(WeightedLruCache.field_c, PasswordValidator.field_i, 20)) {
                        break;
                      }
                      var4++;
                    }
                  }
                } else {
                  RasterBuffer.advanceLoginTransition(param0 - 1575);
                }
              }
            }
          }
        } else {
          this.runTick(false, false);
        }
        if (param0 != 1831) {
          return;
        }
        for (var3Lifetime1 = 0; LoginDialog.field_eb.size() > var3Lifetime1; var3Lifetime1++) {
          var6 = (GameLayer) (LoginDialog.field_eb.elementAt(var3Lifetime1));
          var6.runTick(var2 != 0, false);
          stackIn_58_0 = var2;
          if (var6.consumesInput((byte) 119)) {
            stackIn_59_1 = 0;
          } else {
            stackIn_59_1 = 1;
          }
          var2 = stackIn_58_0 & stackIn_59_1;
        }
    }

    private final void processIncomingPackets(int param0) {
        int var3;
        var3 = ZombieDawn.field_J;
        while (LoginAndPacketHelpers.pollIncomingPacket(RasterCanvasSizeTarget.field_d, (byte) 44)) {
          if (this.handlePacket(MatchingTextValidator.field_g, TextAndNameCredentials.field_d, 2)) {
            continue;
          }
          this.dispatchServerPacket(-12);
        }
        if (param0 < 65) {
          field_A = (Sprite) null;
        }
    }

    abstract boolean handlePacket(BitPacketBuffer param0, int param1, int param2);

    private final void onFrameNotPresented(int param0) {
        if (param0 != 29268) {
          field_C = (String) null;
        }
    }

    public abstract boolean onKeyTyped(char param0, int param1, int param2);

    final void runFrameStep(byte param0) {
        boolean stackIn_9_1 = false;
        int var2;
        int var3;
        int var4;
        AchievementSubmission var5;
        var4 = ZombieDawn.field_J;
        if (param0 != 15) {
          GameLoopApplet.requestSavedData((byte) 91, 77, -4, -72);
        }
        if (DisplayState.field_b != null &&
          DisplayState.field_b.field_a) {
          FullscreenExitHelpers.exitFullscreen((byte) -71);
          MidiPcmStream.reopenAccountScreenIfActive(-121);
        }
        stackIn_9_1 = (DisplayState.field_b != null);
        this.updateConnection(stackIn_9_1, false);
        if (AccountWelcomePanel.field_K) {
          DualLinkNodeHashTable.field_b.bindArchives(81);
          AccountWelcomePanel.field_K = false;
        }
        if (BootstrapLoadingHelpers.shouldShowBootstrapLoadingScreen((byte) -44)) {
          this.updateLoginFlow((byte) 20);
          if (BootstrapLoadingHelpers.shouldShowBootstrapLoadingScreen((byte) -44)) {
            return;
          }
        }
        boolean decompiledFrameRemainder0 = true;
        this.processIncomingPackets(81);
        if (ScrollContainer.field_F) {
          if (!ProxyAuthException.field_b &&
            !MeleeHuman.isGuestSession(13296)) {
            if (!(!DualLinkNodeHashTable.field_b.pollReady((byte) 19))) {
              ProxyAuthException.field_b = true;
              this.onLoadingFinished(1235);
              SocialListEntry.hideMessageOverlay((byte) -118);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            this.dispatchInputEvents(param0 ^ 1832);
          }
        } else {
          DiskArchiveRequest.runAccountUiFrame(-91, LevelObstacle.field_I);
          if (DualLinkNodeHashTable.field_b.pollArchives(false)) {
            DualLinkNodeHashTable.field_b.buildAssets(22833);
            ScrollContainer.field_F = true;
          }
        }
        if (!MeleeHuman.isGuestSession(13296)) {
          while (true) {
            var5 = (AchievementSubmission) (Point.field_j.removeLast(117));
            if (var5 == null) {
              break;
            }
            FullscreenErrorDialog.queueProgressRecord(var5, (byte) 7, 4);
          }
        }
        AchievementBanner.sendReflectionCheckReplies((byte) -48);
        PendingIntArrayRequest.flushOutgoingPackets(0, param0 ^ -90);
        if (DialogLayer.isLoggedInOnline(-19301)) {
          var2 = this.reconnectAndResendRequests(99);
          if (0 == var2 ||
            var2 == 1) {
            this.onConnectionResult(var2, param0 + 95);
          }
          var3 = 0;
          if (var2 == 2) {
            var3 = 1;
          }
          if (this.isConnectionBusy(10)) {
            var3 = 1;
          }
          if (!DialogLayer.isLoggedInOnline(param0 - 19316)) {
            var3 = 0;
          }
          if (var3 != 0) {
            ScreechEffect.beginReconnect((byte) 110);
          }
        }
    }

    public final boolean consumesInput(byte param0) {
        if (param0 < 118) {
          LoadingSequence var3 = (LoadingSequence) null;
          this.startWithLoader((LoadingSequence) null, (byte) 96);
        }
        return true;
    }

    public static void releaseStatics(byte param0) {
        field_C = null;
        field_B = null;
        if (param0 > -121) {
          GameLoopApplet.requestSavedData((byte) -29, 125, -97, 86);
        }
        field_A = null;
    }

    public abstract void runTick(boolean param0, boolean param1);

    final static SavedDataRequest requestSavedData(byte param0, int param1, int param2, int param3) {
        if (param0 > -104) {
          GameLoopApplet.releaseStatics((byte) -31);
        }
        SavedDataRequest var4 = new SavedDataRequest();
        var4.field_k = param3;
        var4.field_o = new int[param1];
        LoginUiHelpers.field_b.addFirst(0, var4);
        UiWidget.sendIntArrayRequest(param2, 0, var4);
        return var4;
    }

    abstract void onConnectionResult(int param0, int param1);

    static {
        field_z = 0;
        field_C = "Mouse-over an icon for details";
        field_A = new Sprite(664, 504);
    }
}
