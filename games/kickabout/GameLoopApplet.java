/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class GameLoopApplet extends NetworkGameClient implements OverlayLayer {
    static String field_D;
    static ClubState field_E;
    static String field_C;

    final void startWithLoader(int param0, LoadingSequence param1) {
        try {
          try {
            NetworkGameClient.field_t = param1;
            this.enableBaseResponses(true, -1);
            this.enableHandlerGroup1((byte) 105);
            this.enableHandlerGroup2(-1);
            if (param0 < 97) {
              this.update(108, false);
            }
            this.enableHandlerGroup5(10);
            this.enableHandlerGroup4(13);
            this.enableHandlerGroup(6);
            this.i(13);
            IntTripleCommand.field_A[10] = -1;
            IntTripleCommand.field_A[9] = -1;
            UrlRequest.field_g = new Vector();
            OverlayLayerSupport.registerOverlay(false, (OverlayLayer) (this));
          } catch (RuntimeException runtimeException) {
            throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "tu.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(int param0, int param1, int param2) {
        if (param0 != 15848) {
          GameLoopApplet.n((byte) 32);
        }
        CipherPacketBuffer var3 = FootballerAiOverlaySupport.field_d;
        var3.writeIsaacByte(param1, (byte) -117);
        var3.writeByte(param0 - 15721, 3);
        var3.writeByte(109, 10);
        var3.writeShort(-1207444472, param2);
    }

    private final void r(int param0) {
        if (param0 != 10) {
          field_E = (ClubState) null;
        }
    }

    public final boolean capturesInput(byte param0) {
        if (param0 < 63) {
          GameLoopApplet.n((byte) -47);
        }
        return true;
    }

    abstract void applyPendingNavigation(int param0);

    final void runFrameStep(byte param0) {
        int stackIn_6_1 = 0;
        boolean stackIn_7_2 = false;
        int var2;
        int var3;
        int var4;
        AchievementSubmission var5;
        var4 = Kickabout.field_G;
        if (SplashScreen.field_m != null &&
          SplashScreen.field_m.field_b) {
          UiWidget.leaveFullscreen(0);
          AudioOutputSupport.a((byte) -122);
        }
        stackIn_6_1 = 0;
        stackIn_7_2 = (SplashScreen.field_m != null);
        this.c(stackIn_6_1, stackIn_7_2);
        if (PitchBoundaryCacheState.field_c) {
          NetworkGameClient.field_t.bindArchives(7312);
          PitchBoundaryCacheState.field_c = false;
        }
        if (RegistrationUiSupport.c(608)) {
          this.n(-93);
          if (RegistrationUiSupport.c(608)) {
            return;
          }
        }
        this.processIncomingPackets(-113);
        if (!CachedListingRow.field_h) {
          CachedListingRow.a(17, StatefulTextPainter.field_v);
          if (NetworkGameClient.field_t.pollArchives(true)) {
            NetworkGameClient.field_t.buildAssets(12763);
            CachedListingRow.field_h = true;
          }
        } else {
          if (!MouseWheelInput.field_b) {
            if (!PlayArea.isGuestSession(100)) {
              if (NetworkGameClient.field_t.pollReady(-27598)) {
                MouseWheelInput.field_b = true;
                this.applyPendingNavigation(55);
                KitStyleTile.c(false);
              }
            } else {
              this.dispatchInputEvents(18861);
            }
          } else {
            this.dispatchInputEvents(18861);
          }
        }
        if (!PlayArea.isGuestSession(100)) {
          while (true) {
            var5 = (AchievementSubmission) (FullscreenErrorDialog.field_R.removeFirst((byte) 127));
            if (var5 == null) {
              break;
            }
            LeaderboardParticipant.submitAchievement(4, var5, 77);
          }
        }
        if (param0 > -25) {
          this.paint(120);
        }
        HuffmanTextSupport.b(5);
        TextFieldNode.flushWithSimulatedLag(0, 0);
        if (ClientInteractionSupport.a((byte) 10)) {
          var2 = this.pollLoginResult((byte) -65);
          if (var2 == 0 ||
            var2 == 1) {
            this.onConnectionResult(var2, (byte) 120);
          }
          var3 = 0;
          if (var2 == 2) {
            var3 = 1;
          }
          if (this.isConnectionBusy((byte) -120)) {
            var3 = 1;
          }
          if (!ClientInteractionSupport.a((byte) 10)) {
            var3 = 0;
          }
          if (var3 != 0) {
            AccountNameCharacterSupport.a((byte) -113);
          }
        }
    }

    public abstract void update(int param0, boolean param1);

    abstract boolean isConnectionBusy(byte param0);

    private final void dispatchInputEvents(int param0) {
        int stackIn_28_1 = 0;
        boolean stackIn_29_2 = false;
        int stackIn_54_0 = 0;
        int stackIn_55_1 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        OverlayLayer var6;
        int var3Lifetime1;
        var5 = Kickabout.field_G;
        var2 = 0;
        if (!ArchiveManager.hasActiveModal(false)) {
          if (ServerTextTemplate.a(-4)) {
            if (MarkerSliderWidget.i(0)) {
              ScrollPane.h(-1);
            } else {
              var3 = SharedPanelFactory.pollPromptAction(-3);
              if (var3 != 2) {
                if (3 != var3) {
                  if (var3 == 4) {
                    MatchHudRoutingSupport.a((byte) 50, false, FullscreenFailureReason.field_b);
                    ProxySocketConnector.field_e = true;
                  }
                } else {
                  ConsoleEvaluationException.a(true, 0);
                }
              } else {
                UiWidget.leaveFullscreen(0);
              }
              this.update(param0 - 18886, false);
            }
          } else {
            if (PlayerStats.a((byte) -3)) {
              stackIn_28_1 = param0 - 18856;
              stackIn_29_2 = (null != SplashScreen.field_m);
              var3 = this.b(stackIn_28_1, stackIn_29_2);
              if (var3 != 1 &&
                var3 != 2) {
                this.update(param0 ^ -18870, false);
              } else {
                if (null != SplashScreen.field_m) {
                  UiWidget.leaveFullscreen(0);
                }
                if (var3 != 2) {
                  this.update(param0 ^ -18870, false);
                } else {
                  AppScreen.openQuitPage(param0 + 1477, AppletContextSupport.getActiveApplet(-79));
                  this.update(param0 ^ -18870, false);
                }
              }
            } else {
              if (NanoTickClock.c(2915)) {
                if (!MarkerSliderWidget.i(0)) {
                  var3 = AuctionsHelpScreen.g(-61);
                  if (var3 == 1) {
                    MatchHudRoutingSupport.a((byte) 50, true, NineSlicePanelPainter.field_f);
                  }
                  this.update(-25, false);
                } else {
                  ScrollPane.h(-1);
                }
              } else {
                if (!MarkerSliderWidget.i(0)) {
                  var2 = 1;
                  var3 = -1;
                  while (TexturedPanelPainter.$cfr$intArgs$b$c4997cb15529(-59)) {
                    if (-1 == FixedQuaternion.field_e) {
                      if (FixedQuaternion.field_e == -1 &&
                        -1 != var3) {
                        FixedQuaternion.field_e = var3;
                        var3 = -1;
                      }
                    } else {
                      if (MatchTransitionScreen.c(FixedQuaternion.field_e, param0 - 1831)) {
                        var3 = FixedQuaternion.field_e;
                        continue;
                      }
                    }
                    var4 = 0;
                    while (UrlRequest.field_g.size() > var4) {
                      if (((OverlayLayer) (UrlRequest.field_g.elementAt(var4))).handleKeyTyped(param0 - 7345, FixedQuaternion.field_e, ClassDescriptorSupport.field_c)) {
                        break;
                      }
                      var4++;
                    }
                  }
                } else {
                  ScrollPane.h(param0 - 18862);
                }
              }
            }
          }
        } else {
          this.update(-25, false);
        }
        var3Lifetime1 = 0;
        if (param0 != 18861) {
          field_C = (String) null;
        }
        while (var3Lifetime1 < UrlRequest.field_g.size()) {
          var6 = (OverlayLayer) (UrlRequest.field_g.elementAt(var3Lifetime1));
          var6.update(param0 - 18886, var2 != 0);
          stackIn_54_0 = var2;
          if (var6.capturesInput((byte) 81)) {
            stackIn_55_1 = 0;
          } else {
            stackIn_55_1 = 1;
          }
          var2 = stackIn_54_0 & stackIn_55_1;
          var3Lifetime1++;
        }
    }

    protected GameLoopApplet() {
    }

    abstract void onConnectionResult(int param0, byte param1);

    final void paintFrame(byte param0) {
        int var3 = 0;
        int var4 = Kickabout.field_G;
        java.awt.Canvas var2 = DropTargetWidget.l(64);
        if (RegistrationUiSupport.c(608)) {
          PlayingView.drawClientToCanvas(var2, StrongCacheEntry.hasGameFocus(2368), 0);
          return;
        }
        if (!CachedListingRow.field_h) {
          FormationAgent.a(var2, -14142);
          return;
        }
        if (!MouseWheelInput.field_b &&
          !PlayArea.isGuestSession(100)) {
          ValidationHelpWidget.a(100.0f, SumIntegersCommand.field_H, (byte) 30);
          FormationAgent.a(var2, -14142);
          return;
        }
        TextFieldNode.field_Rb = true;
        for (var3 = -1 + UrlRequest.field_g.size(); var3 >= 0; var3--) {
          ((OverlayLayer) (UrlRequest.field_g.elementAt(var3))).paint(109);
        }
        if (param0 < 50) {
          this.handleKeyTyped(34, 72, 'ￆ');
        }
        if (!TextFieldNode.field_Rb) {
          this.r(10);
        } else {
          CheatCodeListener.d(-27302);
          WidgetStyleFactory.drawRasterToCanvas(27744, 0, 0, var2);
        }
    }

    abstract boolean handlePacket(int param0, CipherPacketBuffer param1, int param2);

    final static void n(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = Kickabout.field_G;
        try {
          ClubStateFactory.field_d = new Sprite[MatchHudSupport.field_a.length];
          ValidationIndicator.field_G = new Sprite[MatchHudSupport.field_a.length];
          if (param0 != -10) {
            return;
          }
          for (var1_int = 0; MatchHudSupport.field_a.length > var1_int; var1_int++) {
            ClubStateFactory.field_d[var1_int] = AnimationClip.tintGrayscaleSprite(16729156, TrinketShopDialog.bitwiseXor((int) param0, 85), MatchHudSupport.field_a[var1_int]);
            ValidationIndicator.field_G[var1_int] = AnimationClip.tintGrayscaleSprite(4521796, -92, MatchHudSupport.field_a[var1_int]);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var1), "tu.D(" + param0 + ')');
        }
    }

    public abstract boolean handleKeyTyped(int param0, int param1, char param2);

    final static int fixedPointDistance(int param0, int param1, int param2) {
        if (param2 != -23146) {
          return 89;
        }
        param0 = param0 >> 8;
        param1 = param1 >> 8;
        return DisplayNameUiSupport.a(param1 * param1 + param0 * param0, -524289);
    }

    public static void q(int param0) {
        field_D = null;
        field_C = null;
        if (param0 != 30907) {
          return;
        }
        field_E = null;
    }

    public abstract void paint(int param0);

    private final void processIncomingPackets(int param0) {
        int var2;
        int var3;
        var3 = Kickabout.field_G;
        while (ClassNameSupport.a(-125, IntTripleCommand.field_A)) {
          if (this.handlePacket(AppletContextSupport.field_b, ByteArrayPool.field_e, 1)) {
            continue;
          }
          this.dispatchServerPacket(95);
        }
        var2 = 80 / ((param0 + 28) / 48);
    }

    static {
        field_D = "Max Price";
        field_C = "street";
    }
}
