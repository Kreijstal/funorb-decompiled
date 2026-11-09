/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

public final class Sumoblitz extends GameClientShell {
    static int[] field_G;
    static ToolkitSprite[] field_J;
    private boolean field_F;
    static int hsvTableUsers;
    static int field_I;
    private Sprite field_K;
    public static boolean field_L;

    final static void completeAccountCreation(String[] suggestions, int guard, int responseCode, String errorMessage) {
        int var5 = 0;
        boolean stackIn_20_0 = false;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = field_L ? 1 : 0;
        try {
          ProxySocketConnector.accountCreationState = DropTargetWidget.COMPLETE;
          if (255 != responseCode) {
            if (responseCode >= 100 &&
              responseCode <= 105) {
              ServerIntArrayRequest.field_l = AccountConnectionPhase.accountNameSuggestions(suggestions, 8192);
              if (var5 != 0) {
                ServerIntArrayRequest.field_l = LegacyOpenGlReflectionEffect.accountError(40, errorMessage, responseCode);
                stackIn_20_0 = !(13 <= IntroFinalFrameResources.field_d);
                ServerIntArrayRequest.field_l = LegacyOpenGlEffect.accountSuccess(stackIn_20_0, 8192);
              }
            } else {
              ServerIntArrayRequest.field_l = LegacyOpenGlReflectionEffect.accountError(40, errorMessage, responseCode);
              if (var5 != 0) {
                stackIn_20_0 = !(13 <= IntroFinalFrameResources.field_d);
                ServerIntArrayRequest.field_l = LegacyOpenGlEffect.accountSuccess(stackIn_20_0, 8192);
              }
            }
          } else {
            stackIn_20_0 = !(13 <= IntroFinalFrameResources.field_d);
            ServerIntArrayRequest.field_l = LegacyOpenGlEffect.accountSuccess(stackIn_20_0, 8192);
          }
          if (guard != 13) {
            hsvTableUsers = -63;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_28_0 = var4;
          stackIn_28_1 = new StringBuilder().append("Sumoblitz.SA(");
          if (suggestions == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(guard).append(',').append(responseCode).append(',');
          if (errorMessage == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    final void shutdownGameResources(int guard) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (guard != -15254) {
            this.initializeGameArchives(36);
          }
          HiscoreRequestQueue.shutdownAudioOutputs(-27864);
          if (CompactMeshGeometry.field_o != null) {
            LegacyOpenGlNormalMapGenerator.exitFullscreenIfActive((byte) 81);
          }
          MessageDialog.shutdownClientSession(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2), "Sumoblitz.L(" + guard + ')');
        }
    }

    private final void advanceScreenTransition(byte param0) {
        int fieldTemp$0 = 0;
        GameplaySession stackIn_58_0 = null;
        boolean stackIn_59_1 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = field_L ? 1 : 0;
        try {
          if (2 <= Bzip2State.field_j &&
            AudioOutputBootstrap.field_b[41]) {
            LegacyOpenGlSpriteTexture.field_w = true;
            LoginIdentifierSupport.field_e = 16777215;
          }
          var2_int = -73 / ((8 - param0) / 40);
          if (null != IsaacPacketBuffer.field_v.first(-98)) {
            fieldTemp$0 = NineSlicePanel.field_g + 1;
            NineSlicePanel.field_g = NineSlicePanel.field_g + 1;
            if (fieldTemp$0 == 256) {
              NineSlicePanel.field_g = 0;
              IsaacPacketBuffer.field_v.removeFirst(9);
            }
          }
          if (0 != LegacyOpenGlUnlitEffect.field_e) {
            if (LegacyOpenGlUnlitEffect.field_e == 1) {
              MenuFadeState.transitionTicks = MenuFadeState.transitionTicks + 1;
              if (MenuFadeState.transitionTicks != 30) {
                return;
              }
              if (!DisplayPromptState.isDisplayPromptOpen((byte) -58)) {
                IntIndexHashTable.a(0);
                if (var3 != 0) {
                  DroneProximitySupport.showGuestLogin(true);
                }
              } else {
                DroneProximitySupport.showGuestLogin(true);
              }
              LegacyOpenGlUnlitEffect.field_e = 2;
              if (var3 == 0) {
                return;
              }
            }
            if (2 == LegacyOpenGlUnlitEffect.field_e) {
              boolean decompiledSharedTail0 = !(AccountPacketReader.isGuestSession((byte) 9));
              if (!decompiledSharedTail0) {
                RendererPreference.field_b = DroneEscalationSupport.field_b;
                decompiledSharedTail0 = (var3 != 0);
              }
              if (decompiledSharedTail0) {
                MatchingTextValidator.field_g = EmailSyntaxValidator.requestServerIntArray((byte) 113, 4);
                if (LruNodeCache.gameplaySession != null) {
                  LruNodeCache.gameplaySession.submitSessionStatistics(-119);
                }
                RendererPreference.field_b = SecondaryNodeQueue.field_d;
                if (-2 == RendererPreference.field_b) {
                  RendererPreference.field_b = 0;
                  RotarySelectorWidget.a((byte) 122, false);
                }
              }
              LegacyOpenGlUnlitEffect.field_e = 3;
              OpenGlCubeTexture.field_k = RendererPreference.field_b;
              MenuFadeState.transitionTicks = 29;
              if (var3 == 0) {
                return;
              }
            }
            MenuFadeState.transitionTicks = MenuFadeState.transitionTicks - 1;
            if (MenuFadeState.transitionTicks != 0) {
              return;
            }
            LegacyOpenGlUnlitEffect.field_e = 0;
            if (var3 == 0) {
              return;
            }
          }
          stackIn_58_0 = LruNodeCache.gameplaySession;
          stackIn_59_1 = (-1 == RendererPreference.field_b);
          ((GameplaySession) (Object) stackIn_58_0).update(stackIn_59_1, (byte) -88);
          if (~OpenGlCubeTexture.field_k != ~RendererPreference.field_b) {
            MenuFadeState.transitionTicks = MenuFadeState.transitionTicks + 1;
            if (MenuFadeState.transitionTicks != 30) {
              return;
            }
            if (RendererPreference.field_b == 2) {
              HardwareTextureCache.field_f = null;
            }
            MenuFadeState.transitionTicks = 0;
            RendererPreference.field_b = OpenGlCubeTexture.field_k;
            if (var3 == 0) {
              return;
            }
          }
          if (RendererPreference.field_b != -1) {
            LegacyOpenGlEffectManager.field_g[RendererPreference.field_b].update(-18556);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2), "Sumoblitz.TA(" + param0 + ')');
        }
    }

    final void initializeGame(int param0) {
        MidiPcmStream var2 = null;
        MusicCrossfadeStream var3 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          if (param0 != 28196) {
            Sumoblitz.playEntityCollisionSound(59, -122, (byte) 42);
          }
          this.initializeDefaultClientServices(100, 3, 1, 10, 2, 0, true);
          var2 = new MidiPcmStream();
          var2.setInitialProgram(177, 128, 9);
          var3 = new MusicCrossfadeStream(var2, new MidiPcmStream());
          SpriteMask.initializeAudioOutputs(FourIntUpdateRequest.platformDispatcher, true, var3, (byte) -125, 48000, (java.awt.Component) ((Object) NineSlicePanel.field_f));
          BufferedSocket.field_f = false;
          DroneIntroductionOverlay.field_e = var2;
          this.configureAccountFeatures(true, true, (byte) 60, true, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2_ref), "Sumoblitz.C(" + param0 + ')');
        }
    }

    final void renderFrame(int param0) {
        try {
          boolean stackIn_50_0 = false;
          Throwable decompiledCaughtException = null;
          java.awt.Canvas var2 = null;
          RuntimeException var2_ref = null;
          GraphicsToolkit var3 = null;
          int var4_int = 0;
          IntNode var4 = null;
          int var5_int = 0;
          Exception var5 = null;
          int var6 = 0;
          int var7 = 0;
          String var8_ref_String = null;
          int var8 = 0;
          ToolkitRasterStateStack var9 = null;
          int var10 = 0;
          int var4_intLifetime1;
          int var5_intLifetime1;
          int var5_intLifetime2;
          int var6Lifetime1;
          int var6Lifetime2;
          int var7Lifetime1;
          int var8Lifetime1;
          int var5_intLifetime1Lifetime1;
          int var6Lifetime1Lifetime1;
          int var7Lifetime1Lifetime1;
          var10 = field_L ? 1 : 0;
          try {
            var2 = ActiveCanvasProvider.currentCanvas(-97);
            SoftwareRasterizer.clear();
            if (FadingWidget.g(param0 ^ -99)) {
              LegacyOpenGlGraphicsHeap.renderStartupCanvas((byte) 122, var2, WhirlpoolDigest.a(param0 ^ 7));
              return;
            }
            if (!OpenGlTexture2D.field_j) {
              SoftwareRenderBuffer.a(-62, var2);
              return;
            }
            if (!ClientException.a(param0 ^ 0)) {
              NameSuggestionsPanel.setLoadingProgress(param0 ^ 20, 100.0f, StatefulWidgetRenderer.waitingForExtraDataText);
              SoftwareRenderBuffer.a(-88, var2);
              return;
            }
            if (MatchingTextValidator.field_h.updateToolkit(false) &&
              !this.initializeRendererAssets((byte) -124)) {
              return;
            }
            var3 = MatchingTextValidator.field_h.getToolkit(-115);
            var3.clear(0);
            LruNodeCache.gameplaySession.render(param0 ^ 120, var3, false);
            if (OpenGlCubeTexture.field_k == RendererPreference.field_b) {
              if (-1 != RendererPreference.field_b) {
                LegacyOpenGlEffectManager.field_g[RendererPreference.field_b].render(255, var3, -2355);
                if (var10 != 0) {
                  var4_int = 255 * MenuFadeState.transitionTicks / 30;
                  if (-1 != RendererPreference.field_b) {
                    LegacyOpenGlEffectManager.field_g[RendererPreference.field_b].render(-var4_int + 255, var3, -2355);
                  }
                  if (-1 != OpenGlCubeTexture.field_k) {
                    LegacyOpenGlEffectManager.field_g[OpenGlCubeTexture.field_k].render(var4_int, var3, -2355);
                  }
                }
              }
            } else {
              var4_int = 255 * MenuFadeState.transitionTicks / 30;
              if (-1 != RendererPreference.field_b) {
                LegacyOpenGlEffectManager.field_g[RendererPreference.field_b].render(-var4_int + 255, var3, -2355);
              }
              if (-1 != OpenGlCubeTexture.field_k) {
                LegacyOpenGlEffectManager.field_g[OpenGlCubeTexture.field_k].render(var4_int, var3, -2355);
              }
            }
            if (DisplayPromptState.isDisplayPromptOpen((byte) 103)) {
              SoftwareRasterizer.darkenRectangle(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height);
              OpenGlUnderwaterEffect.drawDisplayPromptPanel((byte) -7);
            }
            if (param0 != LegacyOpenGlUnlitEffect.field_e) {
              var4_intLifetime1 = 256 * MenuFadeState.transitionTicks / 30;
              if (var4_intLifetime1 > 0) {
                SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height, 0, var4_intLifetime1);
              }
            }
            if (DisplayPromptRenderer.a(param0 - 85) &&
              !DisplayPromptState.isDisplayPromptOpen((byte) -75)) {
              if (CompactMeshGeometry.field_o != null) {
                stackIn_50_0 = true;
              } else {
                stackIn_50_0 = AppletFocusState.focused;
              }
              SoftwareTransform3D.a(stackIn_50_0, 25);
            }
            if (Bzip2State.field_j >= 2 &&
              SceneryParticle.field_v) {
              LegacyOpenGlEffect.field_c.drawText(20, 20, 16777215, Integer.toString(DroneDebris.field_B), (byte) -81, 1);
            }
            var4 = (IntNode) (IsaacPacketBuffer.field_v.first(param0 - 121));
            if (null != var4) {
              var6 = NineSlicePanel.field_g;
              if (var6 >= 64) {
                if (var6 <= 192) {
                  var5_int = 255;
                  if (var10 != 0) {
                    var5_int = (-var6 + 192) * 255 / 64;
                    var5_int = 255 * var6 / 64;
                  }
                } else {
                  var5_int = (-var6 + 192) * 255 / 64;
                  if (var10 != 0) {
                    var5_int = 255 * var6 / 64;
                  }
                }
              } else {
                var5_int = 255 * var6 / 64;
              }
              var7 = 45;
              boolean decompiledSharedTail0 = !(var4.value < 0);
              if (!decompiledSharedTail0) {
                var8_ref_String = SpriteMask.arcadeModeUnlockedText;
                decompiledSharedTail0 = (var10 != 0);
              }
              if (decompiledSharedTail0) {
                var8_ref_String = ArchiveProvider.achievementNames[var4.value];
                if (DroneEscalationSupport.field_a.length > var4.value) {
                  var7 += 65;
                  DroneEscalationSupport.field_a[var4.value].drawScaled(-32 + ArchiveCatalog.field_c - 180 + 85, 45, 64, 64, 0, 16777215 | var5_int << 24, 1);
                }
              }
              LegacyOpenGlEffect.field_c.drawWrappedText(150, var5_int << 24, 0, 170, -180 + ArchiveCatalog.field_c, (int[]) null, (ToolkitSprite[]) null, -1 + var7, var5_int << 24, 0, 18, -8787, var8_ref_String, (SpriteMask) null, 1, 0);
              LegacyOpenGlEffect.field_c.drawWrappedText(150, var5_int << 24, 0, 170, -180 + ArchiveCatalog.field_c, (int[]) null, (ToolkitSprite[]) null, 1 + var7, var5_int << 24, 0, 18, -8787, var8_ref_String, (SpriteMask) null, 1, 0);
              LegacyOpenGlEffect.field_c.drawWrappedText(150, var5_int << 24 | 16777215, 0, 170, -180 + ArchiveCatalog.field_c, (int[]) null, (ToolkitSprite[]) null, var7, -1, 0, 18, -8787, var8_ref_String, (SpriteMask) null, 1, 0);
            }
            boolean decompiledFrameRemainder0 = true;
            if (BeveledCheckboxRenderer.hasOpenDialogs(false)) {
              var5_intLifetime1 = (-SoftwareRasterizer.width + LegacyOpenGlRidgedWaterEffect.field_h) * 0 / 2;
              var6Lifetime1 = 0 * (IntroMeshResources.canvasHeight - SoftwareRasterizer.height) / 2;
              DialogOriginSupport.setDialogOrigin(var5_intLifetime1, var6Lifetime1, 59);
              SoftwareTransform3D.a(false, (byte) -122);
              this.field_F = true;
              decompiledFrameRemainder0 = (var10 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (!DisplayPromptRenderer.a(-44)) {
                if (!ClientStackTraceFormatter.retainDialogRaster((byte) 52)) {
                  this.field_F = false;
                  if (var10 != 0) {
                    var5_intLifetime1Lifetime1 = 0 * (-SoftwareRasterizer.width + LegacyOpenGlRidgedWaterEffect.field_h) / 2;
                    var6Lifetime1Lifetime1 = (IntroMeshResources.canvasHeight - SoftwareRasterizer.height) * 0 / 2;
                    VertexAttribute.a(var5_intLifetime1Lifetime1, -80, var6Lifetime1Lifetime1);
                    SoftwareTransform3D.a(false, param0 ^ 121);
                    this.field_F = true;
                  }
                }
              } else {
                var5_intLifetime1Lifetime1 = 0 * (-SoftwareRasterizer.width + LegacyOpenGlRidgedWaterEffect.field_h) / 2;
                var6Lifetime1Lifetime1 = (IntroMeshResources.canvasHeight - SoftwareRasterizer.height) * 0 / 2;
                VertexAttribute.a(var5_intLifetime1Lifetime1, -80, var6Lifetime1Lifetime1);
                SoftwareTransform3D.a(false, param0 ^ 121);
                this.field_F = true;
              }
            }
            if (this.field_F) {
              var5_intLifetime2 = SoftwareRasterizer.width;
              var6Lifetime2 = SoftwareRasterizer.height;
              if (this.field_K != null) {
                var6Lifetime2 = this.field_K.field_u;
                var5_intLifetime2 = this.field_K.field_x;
              }
              var7Lifetime1 = (-var5_intLifetime2 + LegacyOpenGlRidgedWaterEffect.field_h) / 2;
              var8 = (IntroMeshResources.canvasHeight - var6Lifetime2) / 2;
              if (BeveledCheckboxRenderer.hasOpenDialogs(false) &&
                this.field_K != null) {
                var7Lifetime1 = GraphicsToolkitManager.topDialogX(param0 ^ -10517);
                var8 = NanoTickClock.topDialogY(3878);
              }
              var9 = IntroMeshResources.rasterStateForToolkit(var3, (byte) 18);
              var9.pushClip((byte) 111, var8, var8 + var6Lifetime2, var7Lifetime1, var7Lifetime1 + var5_intLifetime2);
              var7Lifetime1Lifetime1 = (-SoftwareRasterizer.width + LegacyOpenGlRidgedWaterEffect.field_h) / 2;
              var8Lifetime1 = (IntroMeshResources.canvasHeight - SoftwareRasterizer.height) / 2;
              var3.drawPixels(var7Lifetime1Lifetime1, var8Lifetime1, SoftwareRasterizer.width, SoftwareRasterizer.height, SoftwareRasterizer.pixels, 0, SoftwareRasterizer.width);
              var9.pop(param0 + 29709);
            }
            try {
              var3.present(true);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              var5.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2_ref), "Sumoblitz.I(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void initializeGameArchives(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != DisplayModeFailure.field_a) {
            ArchiveCatalog.a(DisplayModeFailure.field_a, -5);
            DisplayModeFailure.field_a = null;
            VertexAttribute.b(param0 - 21961);
          }
          if (param0 != 21961) {
            this.advanceScreenTransition((byte) -69);
          }
          GzipDecompressor.field_a = true;
          LegacyOpenGlRenderbuffer.field_v = EmailCredentials.a(4, (byte) 125);
          UiStyle.field_Z = EmailCredentials.a(5, (byte) 125);
          SecondaryNodeDeque.field_d = EmailCredentials.a(6, (byte) 125);
          MenuSelectionController.field_c = EmailCredentials.a(7, (byte) 125);
          ByteArrayCacheNode.field_r = EmailCredentials.a(8, (byte) 125);
          ForceFieldRingEffect.field_s = EmailCredentials.a(9, (byte) 125);
          GraphicsToolkitManager.field_d = EmailCredentials.a(12, (byte) 125);
          LegacyOpenGlEffectManager.field_b = new Random(IntroMeshResources.monotonicTimeMillis(-52));
          if (null == MatchingTextValidator.field_h) {
            MatchingTextValidator.field_h = new GraphicsToolkitManager(11, -1, (TextureProvider) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2), "Sumoblitz.QA(" + param0 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_J = null;
        if (param0 != 0) {
          return;
        }
        try {
          field_G = null;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "Sumoblitz.UA(" + param0 + ')');
        }
    }

    final void updateGame(int param0) {
        boolean discarded$0 = false;
        boolean stackIn_11_1 = false;
        int stackIn_85_1 = 0;
        boolean stackIn_86_2 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        GameProgressUpdate var3_ref_hg = null;
        int var3 = 0;
        int var4 = 0;
        var4 = field_L ? 1 : 0;
        try {
          NetworkResourceRequest.e((byte) 76);
          if (CompactMeshGeometry.field_o != null &&
            CompactMeshGeometry.field_o.field_a) {
            LegacyOpenGlNormalMapGenerator.exitFullscreenIfActive((byte) 49);
            DroneEscalationSupport.refreshDisplayPrompt((byte) 35);
          }
          stackIn_11_1 = (null != CompactMeshGeometry.field_o);
          this.updateClientServices(stackIn_11_1, -103);
          if (RidgedNoise3D.field_u) {
            this.initializeGameArchives(21961);
            RidgedNoise3D.field_u = false;
          }
          if (FadingWidget.g(-42)) {
            this.updateIntroAndLogin(106);
            if (FadingWidget.g(-33)) {
              if (ScrollViewport.g(-1)) {
                discarded$0 = this.advanceGameLoading(false, true);
              }
              return;
            }
          }
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledSharedTail0 = !(OpenGlTexture2D.field_j);
          if (!decompiledSharedTail0) {
            if (!ClientException.a(0)) {
              ScreenNameValidator.d((byte) -112);
              decompiledFrameRemainder0 = !(!ClientException.a(0));
              if (decompiledFrameRemainder0) {
                QuickChatPhrase.a(-24233);
                LegacyOpenGlGraphicsHeap.initializeDefaultMenus(0);
                if (5 == RendererPreference.field_b &&
                  0 == OpenGlTransparentWaterEffect.field_e) {
                  RendererPreference.field_b = 2;
                  StrongCacheReference.switchMenuScreen(-7753, false, 2);
                }
                decompiledFrameRemainder0 = !(!DisplayPromptState.isDisplayPromptOpen((byte) 119));
                if (decompiledFrameRemainder0) {
                  RotarySelectorWidget.a((byte) -111, true);
                  decompiledFrameRemainder0 = (var4 != 0);
                }
              }
            }
            if (decompiledFrameRemainder0) {
              if (DisplayPromptState.isDisplayPromptOpen((byte) 107)) {
                if (0 == LegacyOpenGlUnlitEffect.field_e) {
                  var2_int = FullscreenPromptController.pollPromptInput(-38);
                  switch (var2_int) {
                    case 2:
                      LegacyOpenGlNormalMapGenerator.exitFullscreenIfActive((byte) 71);
                      break;
                    case 3:
                      RotarySelectorWidget.a((byte) -21, true);
                      break;
                    case 4:
                      DroneProximitySupport.showGuestLogin(true);
                      break;
                    default:
                      break;
                  }
                  if (!DisplayPromptState.isDisplayPromptOpen((byte) 109)) {
                    LegacyOpenGlEffectManager.field_g[RendererPreference.field_b].resetSelection(-8628, true);
                  }
                  decompiledFrameRemainder0 = (var4 != 0);
                }
                if (decompiledFrameRemainder0) {
                  this.advanceScreenTransition((byte) 96);
                  decompiledFrameRemainder0 = (var4 != 0);
                }
              }
              if (decompiledFrameRemainder0) {
                if (!DisplayPromptRenderer.a(-123)) {
                  this.advanceScreenTransition((byte) -94);
                  decompiledFrameRemainder0 = (var4 != 0);
                }
                if (decompiledFrameRemainder0) {
                  stackIn_85_1 = -1;
                  stackIn_86_2 = (CompactMeshGeometry.field_o != null);
                  var2_int = this.processAccountDialogs(stackIn_85_1, stackIn_86_2);
                  if (1 == var2_int ||
                    var2_int == 2) {
                    if (null != CompactMeshGeometry.field_o) {
                      LegacyOpenGlNormalMapGenerator.exitFullscreenIfActive((byte) 49);
                    }
                    if (2 == var2_int) {
                      HardwareQuadBatchBuffers.quitToWebsite(LegacyOpenGlUnlitEffect.activeApplet(2), false);
                    }
                  }
                  decompiledSharedTail0 = (var4 != 0);
                }
              }
            }
          }
          if ((decompiledFrameRemainder0) &&
            (decompiledSharedTail0)) {
            ModalDialog.pollAccountDialogs((byte) 55, OpenGlUnderwaterEffect.field_r);
            if (this.advanceGameLoading(true, true)) {
              OpenGlTexture2D.field_j = true;
            }
          }
          var2_int = 35 % ((37 - param0) / 61);
          if (!AccountPacketReader.isGuestSession((byte) 9)) {
            do {
              var3_ref_hg = (GameProgressUpdate) (OpenGlUnderwaterEffect.field_q.removeFirst(9));
              if (var3_ref_hg == null) {
                if (var4 == 0) {
                  break;
                }
              } else {
                AccountServiceResult.queueAndSendProgressUpdate(4, (byte) 30, var3_ref_hg);
              }
            } while (var4 == 0);
          }
          do {
            if (!AccountPacketReader.readAccountPacket(RasterBuffer.accountPacketLengths, -126)) {
              MessageDialog.flushAccountWrites(0, 0);
              break;
            }
            this.dispatchAccountPacket(9289);
          } while (var4 == 0);
          if (FixedPointPerlinNoise3D.a(-23517)) {
            var3 = this.pollReconnectAndResend(true);
            if (var3 == 2) {
              ScrollViewport.a((byte) 70);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2), "Sumoblitz.D(" + param0 + ')');
        }
    }

    private final boolean initializeRendererAssets(byte guard) {
        GraphicsToolkit var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard >= -4) {
            hsvTableUsers = -36;
          }
          var2 = MatchingTextValidator.field_h.getToolkit(-125);
          if (var2 == null) {
            return false;
          }
          if (var2.usesNativeRendering()) {
            OpenGlTransparentWaterEffect.field_k = false;
            DisplaySizeController.field_f = 0;
            if (field_L) {
              DisplaySizeController.field_f = 1;
              OpenGlTransparentWaterEffect.field_k = true;
            }
          } else {
            DisplaySizeController.field_f = 1;
            OpenGlTransparentWaterEffect.field_k = true;
          }
          MenuSelectionController.createRendererAssets(false);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2_ref), "Sumoblitz.RA(" + guard + ')');
        }
    }

    private final boolean advanceGameLoading(boolean allowSoundUnpacking, boolean guard) {
        try {
          boolean discarded$0 = false;
          GraphicsToolkitManager stackIn_95_0 = null;
          boolean stackIn_96_1 = false;
          boolean stackIn_134_0 = false;
          boolean stackIn_249_0 = false;
          boolean stackIn_276_0 = false;
          boolean stackIn_363_0 = false;
          GraphicsToolkitManager stackIn_450_0 = null;
          boolean stackIn_451_1 = false;
          boolean stackIn_492_0 = false;
          boolean stackIn_606_0 = false;
          Throwable decompiledCaughtException = null;
          java.awt.Canvas var3 = null;
          int var3_int = 0;
          RuntimeException var3_ref = null;
          GraphicsToolkit var4 = null;
          int var5_int = 0;
          IntNode var5 = null;
          int var6_int = 0;
          Exception var6 = null;
          int var7 = 0;
          int var8 = 0;
          String var9_ref_String = null;
          int var9 = 0;
          ToolkitRasterStateStack var10 = null;
          int var11 = 0;
          var11 = field_L ? 1 : 0;
          try {
            DroneChargeParticle.initializeMenuLabels(-69);
            if (null != SecondaryNodeDeque.field_d) {
              if (ArenaDefinitionCodec.field_c.loadIndex((byte) 127) &&
                ArenaDefinitionCodec.field_c.tryLoadNamedGroup("basic", 100)) {
                if (!ArenaDefinitionCodec.field_c.tryLoadNamedGroup("arialbold14", 100)) {
                  NameSuggestionsPanel.setLoadingProgress(20, 4.0f, CubeMapSource.groupLoadingMessage("arialbold14", ArenaDefinitionCodec.field_c, ToolkitRasterBuffer.waitingForFontsText, true, HuffmanDecoder.loadingFontsText));
                  return false;
                }
                if (RotarySelectorWidget.field_J.loadIndex((byte) 127) &&
                  RotarySelectorWidget.field_J.tryLoadNamedGroup("arialbold14", 100)) {
                  if (!ArenaDefinitionCodec.field_c.tryLoadNamedGroup("arial13", 100)) {
                    NameSuggestionsPanel.setLoadingProgress(20, 4.0f, CubeMapSource.groupLoadingMessage("arial13", ArenaDefinitionCodec.field_c, ToolkitRasterBuffer.waitingForFontsText, true, HuffmanDecoder.loadingFontsText));
                    return false;
                  }
                  if (RotarySelectorWidget.field_J.loadIndex((byte) 127) &&
                    RotarySelectorWidget.field_J.tryLoadNamedGroup("arial13", 100)) {
                    if (SecondaryNodeDeque.field_d.loadIndex((byte) 127) &&
                      SecondaryNodeDeque.field_d.tryLoadAllGroups(true)) {
                      if (MenuSelectionController.field_c.loadIndex((byte) 127) &&
                        MenuSelectionController.field_c.tryLoadAllGroups(guard)) {
                        if (ByteArrayCacheNode.field_r.loadIndex((byte) 127) &&
                          ByteArrayCacheNode.field_r.tryLoadAllGroups(guard)) {
                          if (ForceFieldRingEffect.field_s.loadIndex((byte) 127) &&
                            ForceFieldRingEffect.field_s.tryLoadAllGroups(true)) {
                            if (LegacyOpenGlRenderbuffer.field_v.loadIndex((byte) 127) &&
                              LegacyOpenGlRenderbuffer.field_v.tryLoadAllGroups(true)) {
                              if (UiStyle.field_Z.loadIndex((byte) 127) &&
                                UiStyle.field_Z.tryLoadAllGroups(true)) {
                                if (GraphicsToolkitManager.field_d.loadIndex((byte) 127) &&
                                  GraphicsToolkitManager.field_d.tryLoadAllGroups(true)) {
                                  boolean decompiledFrameRemainder6 = true;
                                  NameSuggestionsPanel.setLoadingProgress(20, 65.0f, ProjectionMode.unpackingSoundEffectsText);
                                  var3 = ActiveCanvasProvider.currentCanvas(-22);
                                  SoftwareRasterizer.clear();
                                  if (FadingWidget.g(-61)) {
                                    LegacyOpenGlGraphicsHeap.renderStartupCanvas((byte) 85, var3, WhirlpoolDigest.a(7));
                                    decompiledFrameRemainder6 = (var11 != 0);
                                  }
                                  if (decompiledFrameRemainder6) {
                                    if (!OpenGlTexture2D.field_j) {
                                      SoftwareRenderBuffer.a(-117, var3);
                                      decompiledFrameRemainder6 = (var11 != 0);
                                    }
                                    if (decompiledFrameRemainder6) {
                                      if (!ClientException.a(0)) {
                                        NameSuggestionsPanel.setLoadingProgress(20, 100.0f, StatefulWidgetRenderer.waitingForExtraDataText);
                                        SoftwareRenderBuffer.a(-117, var3);
                                        decompiledFrameRemainder6 = (var11 != 0);
                                      }
                                      if (decompiledFrameRemainder6) {
                                        stackIn_95_0 = MatchingTextValidator.field_h;
                                        stackIn_96_1 = !(guard);
                                        if (!((GraphicsToolkitManager) (Object) stackIn_95_0).updateToolkit(stackIn_96_1) ||
                                          this.initializeRendererAssets((byte) -105)) {
                                          var4 = MatchingTextValidator.field_h.getToolkit(-97);
                                          var4.clear(0);
                                          LruNodeCache.gameplaySession.render(124, var4, false);
                                          if (~OpenGlCubeTexture.field_k == ~RendererPreference.field_b) {
                                            if (-1 != RendererPreference.field_b) {
                                              LegacyOpenGlEffectManager.field_g[RendererPreference.field_b].render(255, var4, -2355);
                                              if (var11 != 0) {
                                                var5_int = 255 * MenuFadeState.transitionTicks / 30;
                                                if (-1 != RendererPreference.field_b) {
                                                  LegacyOpenGlEffectManager.field_g[RendererPreference.field_b].render(255 - var5_int, var4, -2355);
                                                }
                                                if (OpenGlCubeTexture.field_k != -1) {
                                                  LegacyOpenGlEffectManager.field_g[OpenGlCubeTexture.field_k].render(var5_int, var4, -2355);
                                                }
                                              }
                                            }
                                          } else {
                                            var5_int = 255 * MenuFadeState.transitionTicks / 30;
                                            if (-1 != RendererPreference.field_b) {
                                              LegacyOpenGlEffectManager.field_g[RendererPreference.field_b].render(255 - var5_int, var4, -2355);
                                            }
                                            if (OpenGlCubeTexture.field_k != -1) {
                                              LegacyOpenGlEffectManager.field_g[OpenGlCubeTexture.field_k].render(var5_int, var4, -2355);
                                            }
                                          }
                                          if (DisplayPromptState.isDisplayPromptOpen((byte) 124)) {
                                            SoftwareRasterizer.darkenRectangle(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height);
                                            OpenGlUnderwaterEffect.drawDisplayPromptPanel((byte) -7);
                                          }
                                          if (0 != LegacyOpenGlUnlitEffect.field_e) {
                                            var5_int = MenuFadeState.transitionTicks * 256 / 30;
                                            if (var5_int > 0) {
                                              SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height, 0, var5_int);
                                            }
                                          }
                                          if (DisplayPromptRenderer.a(-67) &&
                                            !DisplayPromptState.isDisplayPromptOpen((byte) 115)) {
                                            if (null != CompactMeshGeometry.field_o) {
                                              stackIn_134_0 = true;
                                            } else {
                                              stackIn_134_0 = AppletFocusState.focused;
                                            }
                                            SoftwareTransform3D.a(stackIn_134_0, 25);
                                          }
                                          if (Bzip2State.field_j >= 2 &&
                                            SceneryParticle.field_v) {
                                            LegacyOpenGlEffect.field_c.drawText(20, 20, 16777215, Integer.toString(DroneDebris.field_B), (byte) -103, 1);
                                          }
                                          var5 = (IntNode) (IsaacPacketBuffer.field_v.first(82));
                                          if (null != var5) {
                                            var7 = NineSlicePanel.field_g;
                                            if (var7 < 64) {
                                              var6_int = 255 * var7 / 64;
                                              if (var11 != 0) {
                                                if (var7 <= 192) {
                                                  var6_int = 255;
                                                  var6_int = (-(255 * var7) + 48960) / 64;
                                                } else {
                                                  var6_int = (-(255 * var7) + 48960) / 64;
                                                }
                                              }
                                            } else {
                                              if (var7 <= 192) {
                                                var6_int = 255;
                                                if (var11 != 0) {
                                                  var6_int = (-(255 * var7) + 48960) / 64;
                                                }
                                              } else {
                                                var6_int = (-(255 * var7) + 48960) / 64;
                                              }
                                            }
                                            var8 = 45;
                                            if (0 <= var5.value) {
                                              var9_ref_String = ArchiveProvider.achievementNames[var5.value];
                                              if (!(DroneEscalationSupport.field_a.length <= var5.value)) {
                                                DroneEscalationSupport.field_a[var5.value].drawScaled(-32 + (85 + ArchiveCatalog.field_c - 180), 45, 64, 64, 0, 16777215 | var6_int << 24, 1);
                                                var8 += 65;
                                                if (var11 != 0) {
                                                  var9_ref_String = SpriteMask.arcadeModeUnlockedText;
                                                }
                                              }
                                            } else {
                                              var9_ref_String = SpriteMask.arcadeModeUnlockedText;
                                            }
                                            LegacyOpenGlEffect.field_c.drawWrappedText(150, var6_int << 24, 0, 170, ArchiveCatalog.field_c - 180, (int[]) null, (ToolkitSprite[]) null, -1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (SpriteMask) null, 1, 0);
                                            LegacyOpenGlEffect.field_c.drawWrappedText(150, var6_int << 24, 0, 170, -180 + ArchiveCatalog.field_c, (int[]) null, (ToolkitSprite[]) null, 1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (SpriteMask) null, 1, 0);
                                            LegacyOpenGlEffect.field_c.drawWrappedText(150, var6_int << 24 | 16777215, 0, 170, ArchiveCatalog.field_c - 180, (int[]) null, (ToolkitSprite[]) null, var8, -1, 0, 18, -8787, var9_ref_String, (SpriteMask) null, 1, 0);
                                          }
                                          boolean decompiledSharedTail8 = !(BeveledCheckboxRenderer.hasOpenDialogs(false));
                                          if (!decompiledSharedTail8) {
                                            var6_int = (-SoftwareRasterizer.width + LegacyOpenGlRidgedWaterEffect.field_h) * 0 / 2;
                                            var7 = (-SoftwareRasterizer.height + IntroMeshResources.canvasHeight) * 0 / 2;
                                            DialogOriginSupport.setDialogOrigin(var6_int, var7, 76);
                                            SoftwareTransform3D.a(false, (byte) -122);
                                            this.field_F = true;
                                            decompiledSharedTail8 = (var11 != 0);
                                          }
                                          if (decompiledSharedTail8) {
                                            if (DisplayPromptRenderer.a(-126)) {
                                              var6_int = (-SoftwareRasterizer.width + LegacyOpenGlRidgedWaterEffect.field_h) * 0 / 2;
                                              var7 = (IntroMeshResources.canvasHeight - SoftwareRasterizer.height) * 0 / 2;
                                              VertexAttribute.a(var6_int, -45, var7);
                                              SoftwareTransform3D.a(false, -66);
                                              this.field_F = true;
                                              if (var11 != 0 &&
                                                !ClientStackTraceFormatter.retainDialogRaster((byte) 52)) {
                                                this.field_F = false;
                                              }
                                            } else {
                                              if (!ClientStackTraceFormatter.retainDialogRaster((byte) 52)) {
                                                this.field_F = false;
                                              }
                                            }
                                          }
                                          if (this.field_F) {
                                            var6_int = SoftwareRasterizer.width;
                                            var7 = SoftwareRasterizer.height;
                                            if (this.field_K != null) {
                                              var6_int = this.field_K.field_x;
                                              var7 = this.field_K.field_u;
                                            }
                                            var8 = (-var6_int + LegacyOpenGlRidgedWaterEffect.field_h) / 2;
                                            var9 = (-var7 + IntroMeshResources.canvasHeight) / 2;
                                            if (BeveledCheckboxRenderer.hasOpenDialogs(false) &&
                                              this.field_K != null) {
                                              var8 = GraphicsToolkitManager.topDialogX(-10517);
                                              var9 = NanoTickClock.topDialogY(3878);
                                            }
                                            var10 = IntroMeshResources.rasterStateForToolkit(var4, (byte) 126);
                                            var10.pushClip((byte) 91, var9, var7 + var9, var8, var6_int + var8);
                                            var9 = (-SoftwareRasterizer.height + IntroMeshResources.canvasHeight) / 2;
                                            var8 = (-SoftwareRasterizer.width + LegacyOpenGlRidgedWaterEffect.field_h) / 2;
                                            var4.drawPixels(var8, var9, SoftwareRasterizer.width, SoftwareRasterizer.height, SoftwareRasterizer.pixels, 0, SoftwareRasterizer.width);
                                            var10.pop(29709);
                                          }
                                          try {
                                            var4.present(true);
                                          } catch (java.lang.Exception decompiledCaughtParameter0) {
                                            decompiledCaughtException = decompiledCaughtParameter0;
                                            var6 = (Exception) (Object) decompiledCaughtException;
                                            var6.printStackTrace();
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (!allowSoundUnpacking) {
                                    return false;
                                  }
                                  LegacyOpenGlPostProcessManager.field_b = new SoundCache(SecondaryNodeDeque.field_d, MenuSelectionController.field_c);
                                  TurbulenceNoise3D.loadGameSoundEffects((byte) -62, SecondaryNodeDeque.field_d);
                                  QuickChatPhrase.a(-24233);
                                  SecondaryNodeDeque.field_d = null;
                                  VertexAttribute.b(0);
                                  return false;
                                }
                                NameSuggestionsPanel.setLoadingProgress(20, 60.0f, ProxySocketConnector.archiveLoadingMessage(ArenaPad.waitingForLevelsText, (byte) 85, 0, GraphicsToolkitManager.field_d, LegacyOpenGlNormalMapGenerator.loadingLevelsText));
                                return false;
                              }
                              NameSuggestionsPanel.setLoadingProgress(20, 55.0f, CubeMapSource.groupLoadingMessage("", UiStyle.field_Z, ToolkitRasterBuffer.waitingForFontsText, true, HuffmanDecoder.loadingFontsText));
                              return false;
                            }
                            NameSuggestionsPanel.setLoadingProgress(20, 45.0f, CubeMapSource.groupLoadingMessage("", LegacyOpenGlRenderbuffer.field_v, ProgressDialog.waitingForGraphicsText, true, LegacyOpenGlTurbulentTextureEffect.loadingGraphicsText));
                            return false;
                          }
                          NameSuggestionsPanel.setLoadingProgress(20, 40.0f, CubeMapSource.groupLoadingMessage("", ForceFieldRingEffect.field_s, LegacyOpenGlPostProcessEffect.waitingForMusicText, true, MessageDialog.loadingMusicText));
                          return false;
                        }
                        NameSuggestionsPanel.setLoadingProgress(20, 30.0f, ProxySocketConnector.archiveLoadingMessage(ContentTransitionPhase.waitingForInstrumentsText, (byte) 85, 0, ByteArrayCacheNode.field_r, ArchiveIndex.loadingInstrumentsText));
                        return false;
                      }
                      NameSuggestionsPanel.setLoadingProgress(20, 20.0f, CubeMapSource.groupLoadingMessage("", MenuSelectionController.field_c, GameClientShell.waitingForSoundEffectsText, true, VertexLayout.loadingSoundEffectsText));
                      return false;
                    }
                    NameSuggestionsPanel.setLoadingProgress(20, 10.0f, CubeMapSource.groupLoadingMessage("", SecondaryNodeDeque.field_d, GameClientShell.waitingForSoundEffectsText, true, VertexLayout.loadingSoundEffectsText));
                    return false;
                  }
                  NameSuggestionsPanel.setLoadingProgress(20, 5.0f, CubeMapSource.groupLoadingMessage("arial13", RotarySelectorWidget.field_J, ToolkitRasterBuffer.waitingForFontsText, true, HuffmanDecoder.loadingFontsText));
                  return false;
                }
                NameSuggestionsPanel.setLoadingProgress(20, 5.0f, CubeMapSource.groupLoadingMessage("arialbold14", RotarySelectorWidget.field_J, ToolkitRasterBuffer.waitingForFontsText, true, HuffmanDecoder.loadingFontsText));
                return false;
              }
              NameSuggestionsPanel.setLoadingProgress(20, 3.0f, CubeMapSource.groupLoadingMessage("basic", ArenaDefinitionCodec.field_c, ProgressDialog.waitingForGraphicsText, true, LegacyOpenGlTurbulentTextureEffect.loadingGraphicsText));
              return false;
            }
            if (null != MenuSelectionController.field_c) {
              boolean decompiledFrameRemainder5 = true;
              NameSuggestionsPanel.setLoadingProgress(20, 70.0f, ProjectionMode.unpackingSoundEffectsText);
              var3 = ActiveCanvasProvider.currentCanvas(-103);
              SoftwareRasterizer.clear();
              if (FadingWidget.g(-96)) {
                LegacyOpenGlGraphicsHeap.renderStartupCanvas((byte) -45, var3, WhirlpoolDigest.a(7));
                decompiledFrameRemainder5 = (var11 != 0);
              }
              if (decompiledFrameRemainder5) {
                if (!OpenGlTexture2D.field_j) {
                  SoftwareRenderBuffer.a(-121, var3);
                  decompiledFrameRemainder5 = (var11 != 0);
                }
                if (decompiledFrameRemainder5) {
                  if (!ClientException.a(0)) {
                    NameSuggestionsPanel.setLoadingProgress(20, 100.0f, StatefulWidgetRenderer.waitingForExtraDataText);
                    SoftwareRenderBuffer.a(-68, var3);
                    decompiledFrameRemainder5 = (var11 != 0);
                  }
                  if ((decompiledFrameRemainder5) && (!MatchingTextValidator.field_h.updateToolkit(false) ||
                    this.initializeRendererAssets((byte) -99))) {
                    var4 = MatchingTextValidator.field_h.getToolkit(-121);
                    var4.clear(0);
                    LruNodeCache.gameplaySession.render(123, var4, false);
                    boolean decompiledSharedTail7 = (~OpenGlCubeTexture.field_k == ~RendererPreference.field_b);
                    if (!decompiledSharedTail7) {
                      var5_int = MenuFadeState.transitionTicks * 255 / 30;
                      if (RendererPreference.field_b != -1) {
                        LegacyOpenGlEffectManager.field_g[RendererPreference.field_b].render(-var5_int + 255, var4, -2355);
                      }
                      if (OpenGlCubeTexture.field_k != -1) {
                        LegacyOpenGlEffectManager.field_g[OpenGlCubeTexture.field_k].render(var5_int, var4, -2355);
                      }
                      decompiledSharedTail7 = (var11 != 0);
                    }
                    if ((decompiledSharedTail7) &&
                      (RendererPreference.field_b != -1)) {
                      LegacyOpenGlEffectManager.field_g[RendererPreference.field_b].render(255, var4, -2355);
                    }
                    if (DisplayPromptState.isDisplayPromptOpen((byte) 118)) {
                      SoftwareRasterizer.darkenRectangle(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height);
                      OpenGlUnderwaterEffect.drawDisplayPromptPanel((byte) -7);
                    }
                    if (LegacyOpenGlUnlitEffect.field_e != 0) {
                      var5_int = MenuFadeState.transitionTicks * 256 / 30;
                      if (var5_int > 0) {
                        SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height, 0, var5_int);
                      }
                    }
                    if (DisplayPromptRenderer.a(-126) &&
                      !DisplayPromptState.isDisplayPromptOpen((byte) 110)) {
                      if (CompactMeshGeometry.field_o != null) {
                        stackIn_249_0 = true;
                      } else {
                        stackIn_249_0 = AppletFocusState.focused;
                      }
                      SoftwareTransform3D.a(stackIn_249_0, 64);
                    }
                    if (2 <= Bzip2State.field_j &&
                      SceneryParticle.field_v) {
                      LegacyOpenGlEffect.field_c.drawText(20, 20, 16777215, Integer.toString(DroneDebris.field_B), (byte) -98, 1);
                    }
                    var5 = (IntNode) (IsaacPacketBuffer.field_v.first(-100));
                    if (var5 != null) {
                      var7 = NineSlicePanel.field_g;
                      if (64 <= var7) {
                        if (192 >= var7) {
                          var6_int = 255;
                          if (var11 != 0) {
                            var6_int = (48960 - 255 * var7) / 64;
                            var6_int = var7 * 255 / 64;
                          }
                        } else {
                          var6_int = (48960 - 255 * var7) / 64;
                          if (var11 != 0) {
                            var6_int = var7 * 255 / 64;
                          }
                        }
                      } else {
                        var6_int = var7 * 255 / 64;
                      }
                      var8 = 45;
                      if (var5.value >= 0) {
                        var9_ref_String = ArchiveProvider.achievementNames[var5.value];
                        if (!(var5.value >= DroneEscalationSupport.field_a.length)) {
                          var8 += 65;
                          DroneEscalationSupport.field_a[var5.value].drawScaled(-180 + ArchiveCatalog.field_c + 85 - 32, 45, 64, 64, 0, var6_int << 24 | 16777215, 1);
                          if (var11 != 0) {
                            var9_ref_String = SpriteMask.arcadeModeUnlockedText;
                          }
                        }
                      } else {
                        var9_ref_String = SpriteMask.arcadeModeUnlockedText;
                      }
                      LegacyOpenGlEffect.field_c.drawWrappedText(150, var6_int << 24, 0, 170, -180 + ArchiveCatalog.field_c, (int[]) null, (ToolkitSprite[]) null, -1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (SpriteMask) null, 1, 0);
                      LegacyOpenGlEffect.field_c.drawWrappedText(150, var6_int << 24, 0, 170, ArchiveCatalog.field_c - 180, (int[]) null, (ToolkitSprite[]) null, 1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (SpriteMask) null, 1, 0);
                      LegacyOpenGlEffect.field_c.drawWrappedText(150, var6_int << 24 | 16777215, 0, 170, ArchiveCatalog.field_c - 180, (int[]) null, (ToolkitSprite[]) null, var8, -1, 0, 18, -8787, var9_ref_String, (SpriteMask) null, 1, 0);
                    }
                    stackIn_276_0 = !guard;
                    boolean decompiledFrameRemainder4 = true;
                    if (BeveledCheckboxRenderer.hasOpenDialogs(stackIn_276_0)) {
                      var6_int = 0 * (-SoftwareRasterizer.width + LegacyOpenGlRidgedWaterEffect.field_h) / 2;
                      var7 = 0 * (-SoftwareRasterizer.height + IntroMeshResources.canvasHeight) / 2;
                      DialogOriginSupport.setDialogOrigin(var6_int, var7, 126);
                      SoftwareTransform3D.a(false, (byte) -122);
                      this.field_F = true;
                      decompiledFrameRemainder4 = (var11 != 0);
                    }
                    if (decompiledFrameRemainder4) {
                      if (!DisplayPromptRenderer.a(-124)) {
                        if (!ClientStackTraceFormatter.retainDialogRaster((byte) 52)) {
                          this.field_F = false;
                          if (var11 != 0) {
                            var6_int = (-SoftwareRasterizer.width + LegacyOpenGlRidgedWaterEffect.field_h) * 0 / 2;
                            var7 = (-SoftwareRasterizer.height + IntroMeshResources.canvasHeight) * 0 / 2;
                            VertexAttribute.a(var6_int, -66, var7);
                            SoftwareTransform3D.a(false, -124);
                            this.field_F = true;
                          }
                        }
                      } else {
                        var6_int = (-SoftwareRasterizer.width + LegacyOpenGlRidgedWaterEffect.field_h) * 0 / 2;
                        var7 = (-SoftwareRasterizer.height + IntroMeshResources.canvasHeight) * 0 / 2;
                        VertexAttribute.a(var6_int, -66, var7);
                        SoftwareTransform3D.a(false, -124);
                        this.field_F = true;
                      }
                    }
                    if (this.field_F) {
                      var6_int = SoftwareRasterizer.width;
                      var7 = SoftwareRasterizer.height;
                      if (null != this.field_K) {
                        var6_int = this.field_K.field_x;
                        var7 = this.field_K.field_u;
                      }
                      var8 = (-var6_int + LegacyOpenGlRidgedWaterEffect.field_h) / 2;
                      var9 = (-var7 + IntroMeshResources.canvasHeight) / 2;
                      if (BeveledCheckboxRenderer.hasOpenDialogs(false) &&
                        null != this.field_K) {
                        var8 = GraphicsToolkitManager.topDialogX(-10517);
                        var9 = NanoTickClock.topDialogY(3878);
                      }
                      var10 = IntroMeshResources.rasterStateForToolkit(var4, (byte) 70);
                      var10.pushClip((byte) -88, var9, var7 + var9, var8, var6_int + var8);
                      var9 = (-SoftwareRasterizer.height + IntroMeshResources.canvasHeight) / 2;
                      var8 = (-SoftwareRasterizer.width + LegacyOpenGlRidgedWaterEffect.field_h) / 2;
                      var4.drawPixels(var8, var9, SoftwareRasterizer.width, SoftwareRasterizer.height, SoftwareRasterizer.pixels, 0, SoftwareRasterizer.width);
                      var10.pop(29709);
                    }
                    try {
                      var4.present(true);
                    } catch (java.lang.Exception decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      var6 = (Exception) (Object) decompiledCaughtException;
                      var6.printStackTrace();
                    }
                  }
                }
              }
              DebouncedInputValidator.a(MenuSelectionController.field_c, 105);
              MenuSelectionController.field_c = null;
              VertexAttribute.b(0);
              return false;
            }
            if (null != ForceFieldRingEffect.field_s) {
              boolean decompiledFrameRemainder3 = true;
              NameSuggestionsPanel.setLoadingProgress(20, 75.0f, ClientException.unpackingMusicText);
              var3 = ActiveCanvasProvider.currentCanvas(-103);
              SoftwareRasterizer.clear();
              if (FadingWidget.g(-98)) {
                LegacyOpenGlGraphicsHeap.renderStartupCanvas((byte) 95, var3, WhirlpoolDigest.a(7));
                decompiledFrameRemainder3 = (var11 != 0);
              }
              if (decompiledFrameRemainder3) {
                if (!OpenGlTexture2D.field_j) {
                  SoftwareRenderBuffer.a(-73, var3);
                  decompiledFrameRemainder3 = (var11 != 0);
                }
                if (decompiledFrameRemainder3) {
                  if (!ClientException.a(0)) {
                    NameSuggestionsPanel.setLoadingProgress(20, 100.0f, StatefulWidgetRenderer.waitingForExtraDataText);
                    SoftwareRenderBuffer.a(-111, var3);
                    decompiledFrameRemainder3 = (var11 != 0);
                  }
                  if ((decompiledFrameRemainder3) && (!MatchingTextValidator.field_h.updateToolkit(false) ||
                    this.initializeRendererAssets((byte) -48) ||
                    var11 != 0)) {
                    var4 = MatchingTextValidator.field_h.getToolkit(-128);
                    var4.clear(0);
                    LruNodeCache.gameplaySession.render(124, var4, false);
                    boolean decompiledSharedTail6 = (~RendererPreference.field_b == ~OpenGlCubeTexture.field_k);
                    if (!decompiledSharedTail6) {
                      var5_int = 255 * MenuFadeState.transitionTicks / 30;
                      if (RendererPreference.field_b != -1) {
                        LegacyOpenGlEffectManager.field_g[RendererPreference.field_b].render(-var5_int + 255, var4, -2355);
                      }
                      if (OpenGlCubeTexture.field_k != -1) {
                        LegacyOpenGlEffectManager.field_g[OpenGlCubeTexture.field_k].render(var5_int, var4, -2355);
                      }
                      decompiledSharedTail6 = (var11 != 0);
                    }
                    if ((decompiledSharedTail6) &&
                      (-1 != RendererPreference.field_b)) {
                      LegacyOpenGlEffectManager.field_g[RendererPreference.field_b].render(255, var4, -2355);
                    }
                    if (DisplayPromptState.isDisplayPromptOpen((byte) 109)) {
                      SoftwareRasterizer.darkenRectangle(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height);
                      OpenGlUnderwaterEffect.drawDisplayPromptPanel((byte) -7);
                    }
                    if (LegacyOpenGlUnlitEffect.field_e != 0) {
                      var5_int = MenuFadeState.transitionTicks * 256 / 30;
                      if (0 < var5_int) {
                        SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height, 0, var5_int);
                      }
                    }
                    if (DisplayPromptRenderer.a(-28) &&
                      !DisplayPromptState.isDisplayPromptOpen((byte) -55)) {
                      if (CompactMeshGeometry.field_o == null) {
                        stackIn_363_0 = AppletFocusState.focused;
                      } else {
                        stackIn_363_0 = true;
                      }
                      SoftwareTransform3D.a(stackIn_363_0, -122);
                    }
                    if (Bzip2State.field_j >= 2 &&
                      SceneryParticle.field_v) {
                      LegacyOpenGlEffect.field_c.drawText(20, 20, 16777215, Integer.toString(DroneDebris.field_B), (byte) -122, 1);
                    }
                    var5 = (IntNode) (IsaacPacketBuffer.field_v.first(-85));
                    if (null != var5) {
                      var7 = NineSlicePanel.field_g;
                      if (64 <= var7) {
                        if (var7 <= 192) {
                          var6_int = 255;
                          if (var11 != 0) {
                            var6_int = (48960 - var7 * 255) / 64;
                            var6_int = 255 * var7 / 64;
                          }
                        } else {
                          var6_int = (48960 - var7 * 255) / 64;
                          if (var11 != 0) {
                            var6_int = 255 * var7 / 64;
                          }
                        }
                      } else {
                        var6_int = 255 * var7 / 64;
                      }
                      var8 = 45;
                      boolean decompiledSharedTail5 = !(var5.value < 0);
                      if (!decompiledSharedTail5) {
                        var9_ref_String = SpriteMask.arcadeModeUnlockedText;
                        decompiledSharedTail5 = (var11 != 0);
                      }
                      if (decompiledSharedTail5) {
                        var9_ref_String = ArchiveProvider.achievementNames[var5.value];
                        if (DroneEscalationSupport.field_a.length > var5.value) {
                          var8 += 65;
                          DroneEscalationSupport.field_a[var5.value].drawScaled(ArchiveCatalog.field_c - 180 + 53, 45, 64, 64, 0, var6_int << 24 | 16777215, 1);
                        }
                      }
                      LegacyOpenGlEffect.field_c.drawWrappedText(150, var6_int << 24, 0, 170, -180 + ArchiveCatalog.field_c, (int[]) null, (ToolkitSprite[]) null, var8 - 1, var6_int << 24, 0, 18, -8787, var9_ref_String, (SpriteMask) null, 1, 0);
                      LegacyOpenGlEffect.field_c.drawWrappedText(150, var6_int << 24, 0, 170, ArchiveCatalog.field_c - 180, (int[]) null, (ToolkitSprite[]) null, 1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (SpriteMask) null, 1, 0);
                      LegacyOpenGlEffect.field_c.drawWrappedText(150, var6_int << 24 | 16777215, 0, 170, ArchiveCatalog.field_c - 180, (int[]) null, (ToolkitSprite[]) null, var8, -1, 0, 18, -8787, var9_ref_String, (SpriteMask) null, 1, 0);
                    }
                    boolean decompiledFrameRemainder2 = true;
                    if (BeveledCheckboxRenderer.hasOpenDialogs(false)) {
                      var6_int = 0 * (LegacyOpenGlRidgedWaterEffect.field_h - SoftwareRasterizer.width) / 2;
                      var7 = (IntroMeshResources.canvasHeight - SoftwareRasterizer.height) * 0 / 2;
                      DialogOriginSupport.setDialogOrigin(var6_int, var7, 86);
                      SoftwareTransform3D.a(false, (byte) -122);
                      this.field_F = true;
                      decompiledFrameRemainder2 = (var11 != 0);
                    }
                    if (decompiledFrameRemainder2) {
                      if (!DisplayPromptRenderer.a(-63)) {
                        if (!ClientStackTraceFormatter.retainDialogRaster((byte) 52)) {
                          this.field_F = false;
                          if (var11 != 0) {
                            var6_int = 0 * (LegacyOpenGlRidgedWaterEffect.field_h - SoftwareRasterizer.width) / 2;
                            var7 = (IntroMeshResources.canvasHeight - SoftwareRasterizer.height) * 0 / 2;
                            VertexAttribute.a(var6_int, -82, var7);
                            SoftwareTransform3D.a(false, -100);
                            this.field_F = true;
                          }
                        }
                      } else {
                        var6_int = 0 * (LegacyOpenGlRidgedWaterEffect.field_h - SoftwareRasterizer.width) / 2;
                        var7 = (IntroMeshResources.canvasHeight - SoftwareRasterizer.height) * 0 / 2;
                        VertexAttribute.a(var6_int, -82, var7);
                        SoftwareTransform3D.a(false, -100);
                        this.field_F = true;
                      }
                    }
                    if (this.field_F) {
                      var6_int = SoftwareRasterizer.width;
                      var7 = SoftwareRasterizer.height;
                      if (this.field_K != null) {
                        var6_int = this.field_K.field_x;
                        var7 = this.field_K.field_u;
                      }
                      var8 = (LegacyOpenGlRidgedWaterEffect.field_h - var6_int) / 2;
                      var9 = (-var7 + IntroMeshResources.canvasHeight) / 2;
                      if (BeveledCheckboxRenderer.hasOpenDialogs(false) &&
                        this.field_K != null) {
                        var8 = GraphicsToolkitManager.topDialogX(-10517);
                        var9 = NanoTickClock.topDialogY(3878);
                      }
                      var10 = IntroMeshResources.rasterStateForToolkit(var4, (byte) 28);
                      var10.pushClip((byte) 127, var9, var7 + var9, var8, var8 + var6_int);
                      var9 = (IntroMeshResources.canvasHeight - SoftwareRasterizer.height) / 2;
                      var8 = (-SoftwareRasterizer.width + LegacyOpenGlRidgedWaterEffect.field_h) / 2;
                      var4.drawPixels(var8, var9, SoftwareRasterizer.width, SoftwareRasterizer.height, SoftwareRasterizer.pixels, 0, SoftwareRasterizer.width);
                      var10.pop(29709);
                    }
                    try {
                      var4.present(true);
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      var6 = (Exception) (Object) decompiledCaughtException;
                      var6.printStackTrace();
                    }
                  }
                }
              }
              LegacyOpenGlReflectionEffect.a(-1509, ForceFieldRingEffect.field_s);
              ForceFieldRingEffect.field_s = null;
              VertexAttribute.b(0);
              return false;
            }
            if (ByteArrayCacheNode.field_r != null) {
              if (!BlendMode.prepareGameMusicPatches(false, ByteArrayCacheNode.field_r)) {
                VertexAttribute.b(0);
                return false;
              }
              ByteArrayCacheNode.field_r = null;
              VertexAttribute.b(0);
              return false;
            }
            if (GraphicsToolkitManager.field_d != null) {
              boolean decompiledFrameRemainder1 = true;
              NameSuggestionsPanel.setLoadingProgress(20, 80.0f, DroneWaveDefinition.unpackingLevelsText);
              var3 = ActiveCanvasProvider.currentCanvas(125);
              SoftwareRasterizer.clear();
              if (FadingWidget.g(-128)) {
                LegacyOpenGlGraphicsHeap.renderStartupCanvas((byte) -75, var3, WhirlpoolDigest.a(7));
                decompiledFrameRemainder1 = (var11 != 0);
              }
              if (decompiledFrameRemainder1) {
                if (!OpenGlTexture2D.field_j) {
                  SoftwareRenderBuffer.a(-67, var3);
                  decompiledFrameRemainder1 = (var11 != 0);
                }
                if (decompiledFrameRemainder1) {
                  if (!ClientException.a(0)) {
                    NameSuggestionsPanel.setLoadingProgress(20, 100.0f, StatefulWidgetRenderer.waitingForExtraDataText);
                    SoftwareRenderBuffer.a(-52, var3);
                    decompiledFrameRemainder1 = (var11 != 0);
                  }
                  if (decompiledFrameRemainder1) {
                    stackIn_450_0 = MatchingTextValidator.field_h;
                    stackIn_451_1 = !(guard);
                    if (!((GraphicsToolkitManager) (Object) stackIn_450_0).updateToolkit(stackIn_451_1) ||
                      this.initializeRendererAssets((byte) -11) ||
                      var11 != 0) {
                      var4 = MatchingTextValidator.field_h.getToolkit(-120);
                      var4.clear(0);
                      LruNodeCache.gameplaySession.render(122, var4, false);
                      boolean decompiledSharedTail4 = (~RendererPreference.field_b == ~OpenGlCubeTexture.field_k);
                      if (!decompiledSharedTail4) {
                        var5_int = MenuFadeState.transitionTicks * 255 / 30;
                        if (-1 != RendererPreference.field_b) {
                          LegacyOpenGlEffectManager.field_g[RendererPreference.field_b].render(-var5_int + 255, var4, -2355);
                        }
                        if (OpenGlCubeTexture.field_k != -1) {
                          LegacyOpenGlEffectManager.field_g[OpenGlCubeTexture.field_k].render(var5_int, var4, -2355);
                        }
                        decompiledSharedTail4 = (var11 != 0);
                      }
                      if ((decompiledSharedTail4) &&
                        (RendererPreference.field_b != -1)) {
                        LegacyOpenGlEffectManager.field_g[RendererPreference.field_b].render(255, var4, -2355);
                      }
                      if (DisplayPromptState.isDisplayPromptOpen((byte) -36)) {
                        SoftwareRasterizer.darkenRectangle(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height);
                        OpenGlUnderwaterEffect.drawDisplayPromptPanel((byte) -7);
                      }
                      if (LegacyOpenGlUnlitEffect.field_e != 0) {
                        var5_int = 256 * MenuFadeState.transitionTicks / 30;
                        if (var5_int > 0) {
                          SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height, 0, var5_int);
                        }
                      }
                      if (DisplayPromptRenderer.a(-103) &&
                        !DisplayPromptState.isDisplayPromptOpen((byte) 127)) {
                        if (null != CompactMeshGeometry.field_o) {
                          stackIn_492_0 = true;
                        } else {
                          stackIn_492_0 = AppletFocusState.focused;
                        }
                        SoftwareTransform3D.a(stackIn_492_0, 115);
                      }
                      if (Bzip2State.field_j >= 2 &&
                        SceneryParticle.field_v) {
                        LegacyOpenGlEffect.field_c.drawText(20, 20, 16777215, Integer.toString(DroneDebris.field_B), (byte) -61, 1);
                      }
                      var5 = (IntNode) (IsaacPacketBuffer.field_v.first(110));
                      if (null != var5) {
                        var7 = NineSlicePanel.field_g;
                        if (var7 < 64) {
                          var6_int = 255 * var7 / 64;
                          if (var11 != 0) {
                            if (var7 > 192) {
                              var6_int = (192 - var7) * 255 / 64;
                              var6_int = 255;
                            } else {
                              var6_int = 255;
                            }
                          }
                        } else {
                          if (var7 > 192) {
                            var6_int = (192 - var7) * 255 / 64;
                            if (var11 != 0) {
                              var6_int = 255;
                            }
                          } else {
                            var6_int = 255;
                          }
                        }
                        var8 = 45;
                        boolean decompiledSharedTail3 = !(0 > var5.value);
                        if (!decompiledSharedTail3) {
                          var9_ref_String = SpriteMask.arcadeModeUnlockedText;
                          decompiledSharedTail3 = (var11 != 0);
                        }
                        if (decompiledSharedTail3) {
                          var9_ref_String = ArchiveProvider.achievementNames[var5.value];
                          if (DroneEscalationSupport.field_a.length > var5.value) {
                            var8 += 65;
                            DroneEscalationSupport.field_a[var5.value].drawScaled(-127 + ArchiveCatalog.field_c, 45, 64, 64, 0, var6_int << 24 | 16777215, 1);
                          }
                        }
                        LegacyOpenGlEffect.field_c.drawWrappedText(150, var6_int << 24, 0, 170, ArchiveCatalog.field_c - 180, (int[]) null, (ToolkitSprite[]) null, -1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (SpriteMask) null, 1, 0);
                        LegacyOpenGlEffect.field_c.drawWrappedText(150, var6_int << 24, 0, 170, -180 + ArchiveCatalog.field_c, (int[]) null, (ToolkitSprite[]) null, 1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (SpriteMask) null, 1, 0);
                        LegacyOpenGlEffect.field_c.drawWrappedText(150, var6_int << 24 | 16777215, 0, 170, ArchiveCatalog.field_c - 180, (int[]) null, (ToolkitSprite[]) null, var8, -1, 0, 18, -8787, var9_ref_String, (SpriteMask) null, 1, 0);
                      }
                      boolean decompiledSharedTail2 = !(BeveledCheckboxRenderer.hasOpenDialogs(false));
                      if (!decompiledSharedTail2) {
                        var6_int = (LegacyOpenGlRidgedWaterEffect.field_h - SoftwareRasterizer.width) * 0 / 2;
                        var7 = (-SoftwareRasterizer.height + IntroMeshResources.canvasHeight) * 0 / 2;
                        DialogOriginSupport.setDialogOrigin(var6_int, var7, -44);
                        SoftwareTransform3D.a(false, (byte) -122);
                        this.field_F = true;
                        decompiledSharedTail2 = (var11 != 0);
                      }
                      if (decompiledSharedTail2) {
                        if (DisplayPromptRenderer.a(-61)) {
                          var6_int = (-SoftwareRasterizer.width + LegacyOpenGlRidgedWaterEffect.field_h) * 0 / 2;
                          var7 = (IntroMeshResources.canvasHeight - SoftwareRasterizer.height) * 0 / 2;
                          VertexAttribute.a(var6_int, -95, var7);
                          SoftwareTransform3D.a(false, -109);
                          this.field_F = true;
                          if (var11 != 0 &&
                            !ClientStackTraceFormatter.retainDialogRaster((byte) 52)) {
                            this.field_F = false;
                          }
                        } else {
                          if (!ClientStackTraceFormatter.retainDialogRaster((byte) 52)) {
                            this.field_F = false;
                          }
                        }
                      }
                      if (this.field_F) {
                        var6_int = SoftwareRasterizer.width;
                        var7 = SoftwareRasterizer.height;
                        if (this.field_K != null) {
                          var7 = this.field_K.field_u;
                          var6_int = this.field_K.field_x;
                        }
                        var8 = (-var6_int + LegacyOpenGlRidgedWaterEffect.field_h) / 2;
                        var9 = (-var7 + IntroMeshResources.canvasHeight) / 2;
                        if (BeveledCheckboxRenderer.hasOpenDialogs(false) &&
                          this.field_K != null) {
                          var8 = GraphicsToolkitManager.topDialogX(-10517);
                          var9 = NanoTickClock.topDialogY(3878);
                        }
                        var10 = IntroMeshResources.rasterStateForToolkit(var4, (byte) 83);
                        var10.pushClip((byte) 71, var9, var9 + var7, var8, var8 + var6_int);
                        var9 = (IntroMeshResources.canvasHeight - SoftwareRasterizer.height) / 2;
                        var8 = (LegacyOpenGlRidgedWaterEffect.field_h - SoftwareRasterizer.width) / 2;
                        var4.drawPixels(var8, var9, SoftwareRasterizer.width, SoftwareRasterizer.height, SoftwareRasterizer.pixels, 0, SoftwareRasterizer.width);
                        var10.pop(29709);
                      }
                      try {
                        var4.present(true);
                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        var6 = (Exception) (Object) decompiledCaughtException;
                        var6.printStackTrace();
                      }
                    }
                  }
                }
              }
              GameDefinitionLoader.a(-9937, GraphicsToolkitManager.field_d);
              GraphicsToolkitManager.field_d = null;
              VertexAttribute.b(0);
              return false;
            }
            if (null == ArenaDefinitionCodec.field_c) {
              if (!guard) {
                discarded$0 = this.initializeRendererAssets((byte) -12);
              }
              if (SlowBurstParticle.f(5)) {
                var3_int = 0;
                while (true) {
                  if (13 > var3_int) {
                    LegacyOpenGlEffectManager.field_g[var3_int] = LegacyOpenGlUnderwaterEffect.createMenuScreen(var3_int, (byte) -100);
                    var3_int++;
                    if (var11 == 0) {
                      continue;
                    }
                  } else {
                    RendererPreference.field_b = 0;
                    OpenGlTexture.setTickRate(50, 26175);
                    ByteArrayStorage.compatibilityNoOp(50, -106);
                    PerlinNoise2D.playGameMusic(86, 0);
                    LegacyOpenGlTexture3D.playLoopingSound(true, 0);
                  }
                  break;
                }
                ArenaDefinition.field_a = 0;
              }
              if (MatchingTextValidator.field_h.getToolkit(-113) == null) {
                MatchingTextValidator.field_h.updateToolkit(false);
                if (!this.initializeRendererAssets((byte) -124)) {
                  return false;
                }
              }
              LruNodeCache.gameplaySession = new GameplaySession();
              return true;
            }
            boolean decompiledFrameRemainder0 = true;
            NameSuggestionsPanel.setLoadingProgress(20, 90.0f, SoftwareTransform3D.unpackingGraphicsText);
            var3 = ActiveCanvasProvider.currentCanvas(78);
            SoftwareRasterizer.clear();
            if (FadingWidget.g(-70)) {
              LegacyOpenGlGraphicsHeap.renderStartupCanvas((byte) -86, var3, WhirlpoolDigest.a(7));
              decompiledFrameRemainder0 = (var11 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (!OpenGlTexture2D.field_j) {
                SoftwareRenderBuffer.a(-62, var3);
                decompiledFrameRemainder0 = (var11 != 0);
              }
              if (decompiledFrameRemainder0) {
                if (!ClientException.a(0)) {
                  NameSuggestionsPanel.setLoadingProgress(20, 100.0f, StatefulWidgetRenderer.waitingForExtraDataText);
                  SoftwareRenderBuffer.a(-110, var3);
                  decompiledFrameRemainder0 = (var11 != 0);
                }
                if ((decompiledFrameRemainder0) && (!MatchingTextValidator.field_h.updateToolkit(false) ||
                  this.initializeRendererAssets((byte) -34) ||
                  var11 != 0)) {
                  var4 = MatchingTextValidator.field_h.getToolkit(-125);
                  var4.clear(0);
                  LruNodeCache.gameplaySession.render(119, var4, false);
                  boolean decompiledSharedTail1 = (~OpenGlCubeTexture.field_k == ~RendererPreference.field_b);
                  if (!decompiledSharedTail1) {
                    var5_int = MenuFadeState.transitionTicks * 255 / 30;
                    if (RendererPreference.field_b != -1) {
                      LegacyOpenGlEffectManager.field_g[RendererPreference.field_b].render(-var5_int + 255, var4, -2355);
                    }
                    if (-1 != OpenGlCubeTexture.field_k) {
                      LegacyOpenGlEffectManager.field_g[OpenGlCubeTexture.field_k].render(var5_int, var4, -2355);
                    }
                    decompiledSharedTail1 = (var11 != 0);
                  }
                  if ((decompiledSharedTail1) &&
                    (RendererPreference.field_b != -1)) {
                    LegacyOpenGlEffectManager.field_g[RendererPreference.field_b].render(255, var4, -2355);
                  }
                  if (DisplayPromptState.isDisplayPromptOpen((byte) -50)) {
                    SoftwareRasterizer.darkenRectangle(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height);
                    OpenGlUnderwaterEffect.drawDisplayPromptPanel((byte) -7);
                  }
                  if (LegacyOpenGlUnlitEffect.field_e != 0) {
                    var5_int = MenuFadeState.transitionTicks * 256 / 30;
                    if (var5_int > 0) {
                      SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height, 0, var5_int);
                    }
                  }
                  if (DisplayPromptRenderer.a(-38) &&
                    !DisplayPromptState.isDisplayPromptOpen((byte) 110)) {
                    if (null == CompactMeshGeometry.field_o) {
                      stackIn_606_0 = AppletFocusState.focused;
                    } else {
                      stackIn_606_0 = true;
                    }
                    SoftwareTransform3D.a(stackIn_606_0, -75);
                  }
                  if (Bzip2State.field_j >= 2 &&
                    SceneryParticle.field_v) {
                    LegacyOpenGlEffect.field_c.drawText(20, 20, 16777215, Integer.toString(DroneDebris.field_B), (byte) -93, 1);
                  }
                  var5 = (IntNode) (IsaacPacketBuffer.field_v.first(66));
                  if (null != var5) {
                    var7 = NineSlicePanel.field_g;
                    if (var7 >= 64) {
                      if (192 >= var7) {
                        var6_int = 255;
                        if (var11 != 0) {
                          var6_int = (192 - var7) * 255 / 64;
                          var6_int = var7 * 255 / 64;
                        }
                      } else {
                        var6_int = (192 - var7) * 255 / 64;
                        if (var11 != 0) {
                          var6_int = var7 * 255 / 64;
                        }
                      }
                    } else {
                      var6_int = var7 * 255 / 64;
                    }
                    var8 = 45;
                    if (var5.value >= 0) {
                      var9_ref_String = ArchiveProvider.achievementNames[var5.value];
                      if (!(var5.value >= DroneEscalationSupport.field_a.length)) {
                        var8 += 65;
                        DroneEscalationSupport.field_a[var5.value].drawScaled(-32 + (85 + (ArchiveCatalog.field_c - 180)), 45, 64, 64, 0, var6_int << 24 | 16777215, 1);
                        if (var11 != 0) {
                          var9_ref_String = SpriteMask.arcadeModeUnlockedText;
                        }
                      }
                    } else {
                      var9_ref_String = SpriteMask.arcadeModeUnlockedText;
                    }
                    LegacyOpenGlEffect.field_c.drawWrappedText(150, var6_int << 24, 0, 170, -180 + ArchiveCatalog.field_c, (int[]) null, (ToolkitSprite[]) null, -1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (SpriteMask) null, 1, 0);
                    LegacyOpenGlEffect.field_c.drawWrappedText(150, var6_int << 24, 0, 170, -180 + ArchiveCatalog.field_c, (int[]) null, (ToolkitSprite[]) null, var8 + 1, var6_int << 24, 0, 18, -8787, var9_ref_String, (SpriteMask) null, 1, 0);
                    LegacyOpenGlEffect.field_c.drawWrappedText(150, 16777215 | var6_int << 24, 0, 170, -180 + ArchiveCatalog.field_c, (int[]) null, (ToolkitSprite[]) null, var8, -1, 0, 18, -8787, var9_ref_String, (SpriteMask) null, 1, 0);
                  }
                  boolean decompiledSharedTail0 = !(BeveledCheckboxRenderer.hasOpenDialogs(false));
                  if (!decompiledSharedTail0) {
                    var6_int = 0 * (LegacyOpenGlRidgedWaterEffect.field_h - SoftwareRasterizer.width) / 2;
                    var7 = (IntroMeshResources.canvasHeight - SoftwareRasterizer.height) * 0 / 2;
                    DialogOriginSupport.setDialogOrigin(var6_int, var7, -105);
                    SoftwareTransform3D.a(false, (byte) -122);
                    this.field_F = true;
                    decompiledSharedTail0 = (var11 != 0);
                  }
                  if (decompiledSharedTail0) {
                    if (DisplayPromptRenderer.a(-67)) {
                      var6_int = 0 * (LegacyOpenGlRidgedWaterEffect.field_h - SoftwareRasterizer.width) / 2;
                      var7 = (-SoftwareRasterizer.height + IntroMeshResources.canvasHeight) * 0 / 2;
                      VertexAttribute.a(var6_int, -53, var7);
                      SoftwareTransform3D.a(false, -101);
                      this.field_F = true;
                      if (var11 != 0 &&
                        !ClientStackTraceFormatter.retainDialogRaster((byte) 52)) {
                        this.field_F = false;
                      }
                    } else {
                      if (!ClientStackTraceFormatter.retainDialogRaster((byte) 52)) {
                        this.field_F = false;
                      }
                    }
                  }
                  if (this.field_F) {
                    var6_int = SoftwareRasterizer.width;
                    var7 = SoftwareRasterizer.height;
                    if (this.field_K != null) {
                      var6_int = this.field_K.field_x;
                      var7 = this.field_K.field_u;
                    }
                    var8 = (LegacyOpenGlRidgedWaterEffect.field_h - var6_int) / 2;
                    var9 = (IntroMeshResources.canvasHeight - var7) / 2;
                    if (BeveledCheckboxRenderer.hasOpenDialogs(false) &&
                      null != this.field_K) {
                      var8 = GraphicsToolkitManager.topDialogX(-10517);
                      var9 = NanoTickClock.topDialogY(3878);
                    }
                    var10 = IntroMeshResources.rasterStateForToolkit(var4, (byte) 29);
                    var10.pushClip((byte) 61, var9, var9 + var7, var8, var6_int + var8);
                    var9 = (IntroMeshResources.canvasHeight - SoftwareRasterizer.height) / 2;
                    var8 = (-SoftwareRasterizer.width + LegacyOpenGlRidgedWaterEffect.field_h) / 2;
                    var4.drawPixels(var8, var9, SoftwareRasterizer.width, SoftwareRasterizer.height, SoftwareRasterizer.pixels, 0, SoftwareRasterizer.width);
                    var10.pop(29709);
                  }
                  try {
                    var4.present(true);
                  } catch (java.lang.Exception decompiledCaughtParameter3) {
                    decompiledCaughtException = decompiledCaughtParameter3;
                    var6 = (Exception) (Object) decompiledCaughtException;
                    var6.printStackTrace();
                  }
                }
              }
            }
            NameSuggestionsPanel.a(ArenaDefinitionCodec.field_c, UiStyle.field_Z, 20, LegacyOpenGlRenderbuffer.field_v);
            NetworkResourceRequest.a(7966, UiStyle.field_Z, LegacyOpenGlRenderbuffer.field_v);
            ArenaDefinitionCodec.field_c = null;
            LegacyOpenGlRenderbuffer.field_v = null;
            UiStyle.field_Z = null;
            VertexAttribute.b(0);
            return false;
          } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
            decompiledCaughtException = decompiledCaughtParameter5;
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var3_ref), "Sumoblitz.PA(" + allowSoundUnpacking + ',' + guard + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void releaseAllStatics(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          Sumoblitz.releaseStatics(0);
          GameApplet.releaseStatics((byte) -19);
          IntNode.releaseStatics(6334);
          IntrusiveDeque.releaseStatics((byte) 117);
          GraphicsToolkit.releaseStatics(0);
          PacketBuffer.releaseStatics(-22);
          IntroMeshResources.releaseStatics(false);
          HiscoreRequestQueue.releaseStatics(param0);
          GraphicsToolkitManager.releaseStatics(-1);
          AudioOutputBootstrap.releaseStatics(5460);
          MusicCrossfadeStream.releaseStatics(-127);
          HudMessageSupport.releaseStatics(13921);
          LoginTextResources.releaseStatics(20283);
          ArenaBackdropPalettes.releaseStatics((byte) 84);
          GameKeyHandler.releaseStatics(-2851);
          AccountNameSupport.releaseStatics(true);
          GameClientShell.releaseStatics(119);
          ClientException.releaseStatics((byte) -18);
          JaggrabDownloader.releaseStatics(126);
          MouseInputHandler.releaseStatics(8);
          MouseWheelInput.releaseStatics((byte) -75);
          SoftwareRasterizer.releaseStatics();
          ResourceArchive.clearStaticState((byte) 35);
          SnowParticleSpriteData.releaseStatics(116);
          ClientStackTraceFormatter.releaseStatics((byte) -71);
          ActiveCanvasProvider.releaseStatics(0);
          MouseInputRegistration.releaseStatics((byte) 14);
          FullscreenPromptController.releaseStatics((byte) -14);
          IntroLogoRenderer.releaseStatics((byte) 95);
          GameTrackPlayback.releaseStatics((byte) -106);
          ChatMessage.releaseStatics(23050);
          StringBuilderSupport.releaseStatics(0);
          IntroductionOverlaySupport.releaseStatics(-1);
          AccountPacketReader.releaseStatics((byte) -68);
          TickClock.releaseStatics((byte) 96);
          RasterBuffer.releaseStatics((byte) 41);
          ArchiveLoadingStage.releaseStatics((byte) 17);
          FullscreenCanvas.releaseStatics(true);
          SoundCache.releaseStatics(false);
          MenuScreen.releaseStatics(-6);
          GameplaySession.releaseStatics((byte) 42);
          ValidationStatusSpriteCache.releaseStatics((byte) 30);
          Base37NameAlphabet.releaseStatics((byte) 118);
          Js5Client.releaseStatics(!param0);
          CacheIoWorker.releaseStatics(87);
          ArchiveCatalog.releaseStatics(2);
          BufferedSocket.releaseStatics(68);
          IntrusiveNode.releaseStatics((byte) 80);
          FontMetrics.releaseStatics(false);
          MidiPcmStream.releaseStatics(-95);
          IntrusiveNodeHashTable.releaseStatics(6406);
          MusicVoice.releaseStatics((byte) 115);
          MidiFileReader.releaseStatics();
          MidiNoteMixer.releaseStatics((byte) 81);
          AudioOutput.releaseStatics();
          LoadingStatusText.releaseStatics(-3);
          StatisticsSubmissionSupport.releaseStatics(-1);
          ArchiveIndex.releaseStatics(-95);
          GzipDecompressor.releaseStatics((byte) 98);
          ArchiveProvider.releaseStatics((byte) -45);
          AccountStatusDialogState.releaseStatics((byte) 127);
          RendererSession.releaseStatics(4);
          RendererPreference.releaseStatics((byte) 115);
          NativeLibraryExtractor.releaseStatics(!param0);
          DroneVariantScoring.releaseStatics((byte) -111);
          NextLevelChoiceLabels.releaseStatics((byte) -89);
          DialogLayer.releaseStatics(128);
          AccountCreationProgressDialog.releaseStatics(false);
          ProgressDialog.releaseStatics(true);
          ContentDialog.releaseStatics(105);
          MessageDialog.releaseStatics(124);
          AccountCreationForm.releaseStatics(0);
          LoginForm.releaseStatics(-118);
          DisplayNameForm.releaseStatics(121);
          LoginFieldValue.releaseStatics((byte) 108);
          WidgetTheme.releaseStatics((byte) 117);
          FriendListState.releaseStatics(100);
          DiskCacheDataFile.releaseStatics(113);
          Drone.releaseStatics(0);
          ArenaDefinition.releaseStatics((byte) 113);
          ArenaPad.releaseStatics(1432625512);
          ResetStatsConfirmationOverlay.releaseStatics(544);
          LevelSelectScreen.releaseStatics(1);
          LevelCompleteUpgradeScreen.releaseStatics(32);
          ReassignUpgradesScreen.releaseStatics((byte) 41);
          AppletFocusState.releaseStatics((byte) -55);
          AchievementThresholds.releaseStatics(28);
          MenuSelectionController.releaseStatics(true);
          TimedSceneEffect.releaseStatics(31295);
          ClientExceptionSupport.releaseStatics(false);
          LoginIdentifierSupport.releaseStatics(2);
          EnemyDrone.releaseStatics(false);
          PlayerDrone.releaseStatics((byte) -68);
          PowerupPickup.releaseStatics(91);
          NextLevelChoiceOverlay.releaseStatics((byte) 122);
          IntrusiveDequeCursor.releaseStatics(-1384583532);
          IntroFinalFrameResources.releaseStatics(param0);
          RenderPresentationException.releaseStatics(1);
          GraphicsHeap.releaseStatics((byte) -103);
          IsaacPacketBuffer.releaseStatics(24599);
          ArenaDefinitionCodec.releaseStatics(20437);
          LoginCredentialFactory.releaseStatics((byte) -1);
          NineSlicePanel.releaseStatics(0);
          IntroPreparation.releaseStatics((byte) 102);
          LegacyBitmapFont.releaseStatics();
          AccountRequestDefaults.releaseStatics(-11418);
          AccountCreationNavigation.releaseStatics(true);
          ReflectionReplySender.releaseStatics((byte) 16);
          LoginCredentials.releaseStatics(8192);
          SpriteMask.releaseStatics(!param0);
          GameDefinitionLoader.releaseStatics(true);
          SpriteState.releaseStatics(-109);
          DualLinkNode.releaseStatics(37);
          UpgradeStatNames.releaseStatics(1600);
          LimitedRandomAccessFile.releaseStatics(100);
          DelegatingCanvas.releaseStatics(92);
          DroneProximitySupport.releaseStatics(0);
          TextCaretLayout.releaseStatics((byte) -88);
          AccountUiBootstrap.releaseStatics(-123);
          DisplayPromptRenderer.releaseStatics(true);
          ByteArrayPool.releaseStatics((byte) -115);
          CanvasResizeState.releaseStatics(-1685);
          LoginFormState.releaseStatics(10);
          CheckboxRenderer.releaseStatics(false);
          StatefulWidgetRenderer.releaseStatics(0);
          ModalDialog.releaseStatics((byte) 95);
          TextLayout.releaseStatics(82);
          FullscreenDisplayMode.releaseStatics((byte) -126);
          ResizingDialog.releaseStatics(101);
          DropDownWidget.releaseStatics((byte) 58);
          InteractiveWidget.releaseStatics((byte) 54);
          GridWidgetContainer.releaseStatics(-16099);
          WidgetContainer.releaseStatics(true);
          ArrayWidgetContainer.releaseStatics(0);
          IsaacCipher.releaseStatics((byte) -122);
          AudioServiceThread.releaseStatics(2);
          SocketJs5Client.releaseStatics(1);
          SecondaryNodeQueue.releaseStatics(0);
          NetworkResourceRequest.clearStaticState((byte) 62);
          SectorCacheStore.releaseStatics((byte) -90);
          CacheIoRequest.releaseStatics((byte) 64);
          CachedArchiveProvider.releaseStatics((byte) -96);
          ResourceRequest.releaseStatics(true);
          AppletTickHistory.releaseStatics(false);
          SoftwareRasterViewport.releaseStatics();
          VorbisSample.releaseStatics();
          MenuFadeState.releaseStatics(-66);
          IntroMeshMaterial.releaseStatics(-104);
          CompactMeshGeometry.releaseStatics(0);
          ParticleSpriteResources.releaseStatics(true);
          AccountRsaModulus.releaseStatics(-126);
          RasterColorTables.releaseStatics(-119);
          IntroMeshProjection.releaseStatics(-127);
          Js5ClientState.releaseStatics((byte) -104);
          UiStyle.releaseStatics(-1);
          SecondaryNodeHashTable.releaseStatics(8192);
          IntIndexHashTable.releaseStatics(18260);
          ByteArrayStorage.releaseStatics(-100);
          Bzip2Decompressor.releaseStatics();
          Bzip2State.releaseStatics(true);
          ReflectionCheck.releaseStatics(false);
          IndexedSprite.releaseStatics(3);
          LoginDialogState.releaseLoginState((byte) 122);
          VorbisFloor1.releaseStatics();
          QuickChatPhrase.releaseStatics(-6811);
          DroneEscalationSupport.releaseStatics(-122);
          QuickChatPhraseProvider.releaseStatics(false);
          SoftLruCache.releaseStatics(1);
          ScoreMultiplierTable.releaseStatics(true);
          HuffmanDecoder.releaseStatics((byte) 123);
          RsaEnvelopeScratch.releaseStatics(1284);
          SocketConnector.releaseStatics(85);
          ProxyAuthenticationRequiredException.releaseStatics(127);
          NanoTickClock.releaseStatics(121);
          ImageProducerRasterBuffer.releaseStatics(-48);
          SoundInstrument.releaseStatics();
          PerlinNoiseFactory.releaseStatics(0);
          WhirlpoolDigest.releaseStatics((byte) -58);
          InstrumentNoteMask.releaseStatics((byte) 125);
          MusicPatch.releaseStatics((byte) 111);
          MusicPatchEnvelope.releaseStatics((byte) 110);
          LevelCompletionSupport.releaseStatics(6);
          TextureMetadata.releaseStatics(param0);
          LabeledWidget.releaseStatics(-107);
          ValidatedTextInputWidget.releaseStatics(-15648);
          TextInputWidget.releaseStatics(82);
          ContentTransitionDialog.releaseStatics(0);
          StripedProgressWidget.releaseStatics(-1346554936);
          NameSuggestionsPanel.releaseStatics(-18490);
          HotspotTextWidget.releaseStatics((byte) -118);
          ValidationStatusWidget.releaseStatics(-21433);
          ValidationMessageWidget.releaseStatics((byte) -79);
          CheckboxWidget.releaseStatics(454);
          TextInputValidator.releaseStatics(false);
          WhirlpoolTables.releaseStatics(-109);
          UnderageAccountInfoPanel.releaseStatics(false);
          RotarySelectorWidget.releaseStatics(0);
          MarkerTrackWidget.releaseStatics(!param0);
          GameInstructions.releaseStatics(!param0);
          ToolkitRasterBuffer.releaseStatics(-73);
          SoftwareRenderTarget.releaseStatics(5423);
          SoftwareRenderContext.releaseStatics(param0);
          Transform3D.releaseStatics(false);
          LegacyOpenGlGraphicsToolkit.releaseStatics((byte) 66);
          LegacyOpenGlTextureCache.releaseStatics((byte) -24);
          LegacyOpenGlEffectManager.releaseStatics(255);
          LegacyOpenGlPostProcessManager.releaseStatics((byte) 0);
          LegacyOpenGlFloatPostProcessEffect.releaseStatics(false);
          LegacyOpenGlInterleavedStream.releaseStatics(106);
          LegacyOpenGlNormalMapGenerator.releaseStatics((byte) -69);
          LegacyOpenGlSprite.releaseStatics(0);
          LegacyOpenGlTransform3D.releaseStatics(0);
          LegacyOpenGlTexture.releaseStatics((byte) -81);
          LegacyOpenGlTexture2D.releaseStatics((byte) 28);
          LegacyCubeMapSource.releaseStatics((byte) -21);
          LegacyOpenGlCubeTexture.releaseStatics(1);
          HardwareGraphicsToolkit.releaseStatics(8);
          VertexAttribute.releaseStatics(2);
          GpuDataType.releaseStatics(0);
          WaterTextureResources.releaseStatics(128);
          AffineTransform3D.releaseStatics((byte) 49);
          ProjectionMode.releaseStatics(-7520);
          PointLight.releaseStatics(0);
          TextureTransformMode.releaseStatics((byte) 17);
          HardwareTextureCache.releaseStatics((byte) -109);
          ShaderEffect.releaseStatics(-119);
          HardwareCubeMapSource.releaseStatics(true);
          BlendMode.releaseStatics(26238);
          HardwareQuadBatchBuffers.releaseStatics(786336);
          VertexLayout.releaseStatics((byte) 101);
          HardwareBufferSet.releaseStatics(true);
          TextureCombineSource.releaseStatics(false);
          TextureCoordinateGeneration.releaseStatics((byte) -100);
          VertexStreamLayout.releaseStatics(61303);
          PrimitiveType.releaseStatics(-99);
          OpenGlVertexBuffer.releaseStatics(false);
          IntList.releaseStatics(-26791);
          CachedTextLayout.releaseLayoutSpriteData(0);
          DraggableWidget.releaseStatics(-1);
          DropTargetWidget.releaseStatics((byte) 118);
          ScrollPane.releaseStatics(param0);
          DisplayModeConfirmationDialog.releaseStatics((byte) -43);
          FullscreenMembershipDialog.k(50);
          ScrollViewport.releaseStatics(!param0);
          DirectByteArrayStorage.releaseStatics(17);
          QuickChatCommand.releaseStatics(-13252);
          SecondaryNodeDeque.releaseStatics(-103);
          CacheReferenceNode.releaseStatics((byte) 54);
          StrongCacheReference.releaseStatics(24);
          ProxySocketConnector.releaseProxyStatics(1183);
          AudioFilter.releaseStatics();
          SpriteSheetSupport.releaseStatics(28322);
          SoftwareTransform3D.releaseStatics(-1);
          ScrollingTexturePixels.releaseStatics();
          ToolkitImageProducerBuffer.releaseStatics(119);
          RenderBufferSet.releaseStatics((byte) -59);
          DualLinkedRenderResource.releaseStatics(33);
          LegacyOpenGlShaderProgram.releaseStatics((byte) -62);
          LegacyOpenGlTexture3D.releaseStatics(-21551);
          LegacyOpenGlPostProcessEffect.releaseStatics((byte) -58);
          LegacyOpenGlEffect.releaseStatics((byte) -76);
          LegacyWaterTextureResources.releaseStatics((byte) 60);
          LegacyOpenGlRenderBufferSet.releaseStatics(1821625704);
          LegacyOpenGlRenderbuffer.releaseStatics(-21057);
          LegacyOpenGlGraphicsHeap.releaseStatics(-20388);
          LegacyOpenGlSpriteTexture.releaseStatics(!param0);
          LegacyOpenGlPbuffer.releaseStatics(-1);
          EnemyDroneFactory.releaseStatics(true);
          LegacyVertexAttribute.releaseStatics(107);
          LegacyOpenGlDisplayLists.releaseStatics((byte) -51);
          CubeMapSource.releaseStatics((byte) 43);
          LegacyOpenGlVertexBuffer.releaseStatics(true);
          LegacyOpenGlBuffer.releaseStatics(true);
          LegacyOpenGlClientVertexBuffer.releaseStatics(-124);
          LegacyOpenGlSpecularEffect.releaseStatics((byte) -38);
          LegacyOpenGlTurbulentTextureEffect.releaseStatics(4);
          TextureGeneratorNode.releaseStatics(true);
          PerlinNoise2D.releaseStatics(2);
          LegacyOpenGlAssemblyProgram.releaseStatics(429166529);
          LegacyOpenGlRidgedWaterEffect.releaseStatics(8192);
          LegacyOpenGlTexture1D.releaseStatics(7064);
          LegacyOpenGlReflectionEffect.releaseStatics((byte) -127);
          LegacyOpenGlUnderwaterEffect.releaseStatics(true);
          LegacyOpenGlEnvironmentWaterEffect.releaseStatics(3);
          LegacyOpenGlShoreWaveWaterEffect.releaseStatics((byte) -19);
          LegacyOpenGlShader.releaseStatics(-25140);
          BigBurstaProgress.releaseStatics(-124);
          TextureFilter.releaseStatics(0);
          HardwareGraphicsHeap.releaseStatics(124);
          MouseInputShutdown.releaseStatics(-23787);
          PerlinNoiseSliceGenerator.releaseStatics((byte) -69);
          HardwareTextureSprite.releaseStatics(1);
          HardwareSpecularEffect.releaseStatics(0);
          HardwareAnimatedWaterEffect.e(1);
          HardwareReflectionEffect.releaseStatics((byte) 79);
          FallbackShaderEffect.d(false);
          RidgedNoise3D.releaseStatics((byte) 30);
          FixedPointPerlinNoise3D.releaseStatics((byte) 101);
          TurbulenceNoise3D.releaseStatics(param0);
          NoiseSliceGenerator.releaseStatics(64);
          IntroLightingLookup.releaseStatics(-127);
          OpenGlCubeTexture.releaseStatics(124);
          OpenGlTexture3D.releaseStatics((byte) -17);
          OpenGlUnderwaterEffect.releaseStatics(12);
          OpenGlTransparentWaterEffect.releaseStatics((byte) 79);
          OpenGlEnvironmentWaterEffect.releaseStatics(!param0);
          OpenGlShaderProgram.releaseStatics((byte) -60);
          OpenGlBuffer.releaseStatics((byte) 13);
          OpenGlIndexBuffer.releaseStatics(param0);
          OpenGlVertexLayout.releaseStatics(123);
          NodeHashTableIterator.releaseStatics(1);
          SecondaryNodeDequeIterator.releaseStatics(-95);
          LegacyOpenGlSpriteMask.releaseStatics(!param0);
          LruNodeCache.releaseStatics(1882049616);
          OpenGlShader.releaseStatics((byte) -70);
          ToolkitRasterStateCacheEntry.releaseStatics(-114);
          ToolkitRasterStateFrame.releaseStatics(false);
          HiscoreRequest.releaseStatics(-26437);
          SessionStatisticsSubmission.releaseStatics(!param0);
          HiscorePlayerName.releaseStatics(false);
          PlayingSound.releaseStatics(1022768328);
          FourIntReadRequest.releaseStatics((byte) -127);
          SpriteStripButtonRenderer.releaseStatics(126);
          LinkWidgetRenderer.releaseStatics(118);
          BeveledTextInputRenderer.releaseStatics(2147483647);
          PasswordInputRenderer.releaseStatics(22760);
          BeveledCheckboxRenderer.releaseStatics(-4);
          FadingWidget.releaseStatics((byte) -84);
          SpriteOptionRenderer.releaseStatics((byte) -31);
          SocialContact.releaseStatics(0);
          FourStatHiscoreRequest.releaseStatics(-11807);
          ArchiveLoadRequirement.releaseStatics(true);
          HudMessage.releaseStatics(false);
          ServerIntArrayRequest.releaseStatics(!param0);
          GameProgressUpdate.releaseStatics((byte) 12);
          ServerDataReadRequest.releaseStatics(12);
          RendererStateSnapshot.releaseStatics(0);
          AccountRequestState.releaseStatics(90);
          AccountServiceResult.releaseStatics((byte) 89);
          EmailAvailabilityRequest.releaseStatics(-121);
          AccountConnectionPhase.releaseStatics((byte) 119);
          DroneWaveDefinition.releaseStatics((byte) 99);
          DroneDebris.releaseStatics(2);
          SceneryParticle.releaseStatics(false);
          PowerupTrailParticle.releaseStatics(3190);
          ForceFieldRingEffect.releaseStatics(6408);
          ShrinkingRingEffect.releaseStatics(0);
          SlowBurstParticle.releaseStatics(true);
          InwardSparkParticle.releaseStatics(83);
          DroneChargeParticle.releaseStatics(4);
          DroneIntroductionOverlay.releaseStatics((byte) 105);
          LoginMethodPreference.releaseStatics(0);
          EmailCredentials.releaseStatics((byte) 88);
          DisplayModeFailure.releaseStatics(1);
          RasterStateFrame.releaseStatics(480);
          WidgetStateStyle.releaseStatics((byte) -30);
          TextLayoutLine.releaseStatics(122);
          DropDownArrowRenderer.releaseStatics((byte) -115);
          EmptyWidgetRenderer.releaseStatics(false);
          DropDownLabelRenderer.releaseStatics(59);
          FocusProxyWidget.releaseStatics(false);
          DropDownListWidget.releaseStatics(67);
          QueuedIntArrayRequest.releaseStatics(18);
          FourIntUpdateRequest.releaseStatics(1);
          ScreenNameValidator.releaseStatics((byte) -119);
          PasswordValidator.releaseStatics(-1);
          ConfirmedEmailValidator.releaseStatics(false);
          AgeValidator.releaseStatics((byte) -91);
          MatchingTextValidator.releaseStatics((byte) -31);
          ContentTransitionPhase.releaseStatics((byte) 91);
          TextHotspot.releaseStatics(18232);
          ValidationStatus.releaseStatics(1431655765);
          HardwareRidgedWaterNoise.releaseStatics((byte) -75);
          HardwareTurbulentWaterNoise.releaseStatics(-11701);
          VertexBufferReference.releaseStatics(16766976);
          IndexBufferReference.releaseStatics(6);
          EmailValidationError.releaseStatics(-102);
          LegacyRidgedWaterNoise.releaseStatics((byte) 110);
          AppletInstanceState.releaseStatics(true);
          ByteArrayCacheNode.releaseStatics(0);
          this.gameHost = null;
          this.field_K = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2), "Sumoblitz.E(" + param0 + ')');
        }
    }

    public Sumoblitz() {
        this.field_F = false;
        this.field_K = null;
    }

    public final void init() {
        try {
          this.startAppletWithDefaultWidth(13, "sumoblitz", 480);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "Sumoblitz.init()");
        }
    }

    final static void playEntityCollisionSound(int param0, int param1, byte param2) {
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = field_L ? 1 : 0;
        try {
          if (param0 == 0) {
            return;
          }
          if (param2 > -67) {
            return;
          }
          regionExit1: {
            regionExit2: {
              var3_int = 0;
              var4 = param1;
              if (var4 == 1) {
                var3_int = ExpandingRingEffect.nextRandomInt(5, HardwareGraphicsHeap.field_o, (byte) -96);
                PlayerDrone.playSample(-113, OpenGlCubeTexture.field_l[22 + var3_int]);
                if (var5 == 0) {
                  return;
                }
              } else {
                if ((2 != var4 ||
                  var5 != 0) &&
                  (3 != var4 ||
                  var5 != 0)) {
                  switch (var4) {
                    case 4:
                      break regionExit2;
                    case 6:
                      break regionExit1;
                    case 5:
                      break regionExit1;
                    default:
                      return;
                    case 0:
                      break;
                  }
                }
              }
              var3_int = ExpandingRingEffect.nextRandomInt(ResetStatsConfirmationOverlay.field_d[param0][1].length, HardwareGraphicsHeap.field_o, (byte) -96);
              PlayerDrone.playSample(89, ResetStatsConfirmationOverlay.field_d[param0][1][var3_int]);
              if (var5 == 0) {
                return;
              }
            }
            var3_int = ExpandingRingEffect.nextRandomInt(ResetStatsConfirmationOverlay.field_d[param0][2].length, HardwareGraphicsHeap.field_o, (byte) -96);
            PlayerDrone.playSample(-121, ResetStatsConfirmationOverlay.field_d[param0][2][var3_int]);
            if (var5 == 0) {
              return;
            }
          }
          var3_int = ExpandingRingEffect.nextRandomInt(ResetStatsConfirmationOverlay.field_d[param0][0].length, HardwareGraphicsHeap.field_o, (byte) -96);
          PlayerDrone.playSample(42, ResetStatsConfirmationOverlay.field_d[param0][0][var3_int]);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var3), "Sumoblitz.OA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_G = new int[16384];
        hsvTableUsers = 0;
        field_I = 49;
    }
}
