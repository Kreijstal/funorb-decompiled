/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpriteCheckboxRenderer implements WidgetRenderer {
    static Sprite boardSceneRaster;
    static BufferedSocket sessionSocket;
    static int loginDebugPermissionLevel;
    static String accountCreationDisplayName;
    static int gameMusicVolumeLevel;
    static int previousMenuScreenId;

    final static void drawIntroAnimation(int sunCenterY) {
        int faceHalfWidth = 0;
        int geometryTravelOrFallOffset = 0;
        int unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        GzipInflater.sunBackgroundSprite.drawRunEncoded(0, 0);
        PacketByteCipher.sunForegroundSprite.draw(320 - (PacketByteCipher.sunForegroundSprite.fullWidth >> 1), sunCenterY - (PacketByteCipher.sunForegroundSprite.fullHeight >> 1));
        AudioService.screenTitleSprites[0].draw(0, 20);
        int titleGlowTick = -70 + MatchingTextValidator.introAnimationTick;
        if (titleGlowTick >= 0) {
            if (!((double)titleGlowTick * 0.0174532925 < 1.5707963267948966)) {
                faceHalfWidth = RasterTargetSnapshot.introFaceFrames[CachedTextLayout.introFaceFrameIndex].fullWidth >> 1;
                if (CachedTextLayout.introFaceFrameIndex >= 11) {
                    geometryTravelOrFallOffset = (MatchingTextValidator.introAnimationTick - UnderlinedButtonRenderer.introFaceFrameStartTick >> 1) * (MatchingTextValidator.introAnimationTick - UnderlinedButtonRenderer.introFaceFrameStartTick >> 1) >> 1;
                    RasterTargetSnapshot.introFaceFrames[CachedTextLayout.introFaceFrameIndex].drawGrayModulated(-(RasterTargetSnapshot.introFaceFrames[CachedTextLayout.introFaceFrameIndex].fullWidth >> 1) + 320, geometryTravelOrFallOffset + (-(RasterTargetSnapshot.introFaceFrames[CachedTextLayout.introFaceFrameIndex].fullHeight >> 1) + 240), WidgetSkinState.introFaceModulationRgb);
                    AccountCreationForm.introGeometryFrames[0].draw(faceHalfWidth + 320, -34 + geometryTravelOrFallOffset - (AccountCreationForm.introGeometryFrames[0].fullHeight >> 1) + 240);
                    AccountCreationForm.introGeometryFrames[1].draw(-faceHalfWidth + 320 - AccountCreationForm.introGeometryFrames[1].fullWidth, -(AccountCreationForm.introGeometryFrames[1].fullHeight >> 1) + (240 + geometryTravelOrFallOffset + 22));
                    return;
                }
                geometryTravelOrFallOffset = MatchingTextValidator.introAnimationTick << 2;
                if (faceHalfWidth + 320 < 1000 - geometryTravelOrFallOffset) {
                    AccountCreationForm.introGeometryFrames[0].draw(1000 - geometryTravelOrFallOffset, -34 + (240 - (AccountCreationForm.introGeometryFrames[0].fullHeight >> 1)));
                } else {
                    AccountCreationForm.introGeometryFrames[0].draw(320 + faceHalfWidth, 206 - (AccountCreationForm.introGeometryFrames[0].fullHeight >> 1));
                }
                if (-AccountCreationForm.introGeometryFrames[1].fullWidth + (320 - faceHalfWidth) > geometryTravelOrFallOffset - 1200) {
                    AccountCreationForm.introGeometryFrames[1].draw(geometryTravelOrFallOffset - 1200, 22 + (240 - (AccountCreationForm.introGeometryFrames[1].fullHeight >> 1)));
                    RasterTargetSnapshot.introFaceFrames[CachedTextLayout.introFaceFrameIndex].drawGrayModulated(320 - faceHalfWidth, 240 - (RasterTargetSnapshot.introFaceFrames[CachedTextLayout.introFaceFrameIndex].fullHeight >> 1), WidgetSkinState.introFaceModulationRgb);
                    return;
                }
                AccountCreationForm.introGeometryFrames[1].draw(-AccountCreationForm.introGeometryFrames[1].fullWidth - faceHalfWidth + 320, 240 - (AccountCreationForm.introGeometryFrames[1].fullHeight >> 1) + 22);
                RasterTargetSnapshot.introFaceFrames[CachedTextLayout.introFaceFrameIndex].drawGrayModulated(320 - faceHalfWidth, 240 - (RasterTargetSnapshot.introFaceFrames[CachedTextLayout.introFaceFrameIndex].fullHeight >> 1), WidgetSkinState.introFaceModulationRgb);
                return;
            }
            AudioService.screenTitleSprites[0].drawAdditive(0, 20, (int)(0.5 + Math.sin(2.0 * ((double)titleGlowTick * 0.0174532925)) * 90.0));
        }
        faceHalfWidth = RasterTargetSnapshot.introFaceFrames[CachedTextLayout.introFaceFrameIndex].fullWidth >> 1;
        if (CachedTextLayout.introFaceFrameIndex >= 11) {
            geometryTravelOrFallOffset = (MatchingTextValidator.introAnimationTick - UnderlinedButtonRenderer.introFaceFrameStartTick >> 1) * (MatchingTextValidator.introAnimationTick - UnderlinedButtonRenderer.introFaceFrameStartTick >> 1) >> 1;
            RasterTargetSnapshot.introFaceFrames[CachedTextLayout.introFaceFrameIndex].drawGrayModulated(-(RasterTargetSnapshot.introFaceFrames[CachedTextLayout.introFaceFrameIndex].fullWidth >> 1) + 320, geometryTravelOrFallOffset + (-(RasterTargetSnapshot.introFaceFrames[CachedTextLayout.introFaceFrameIndex].fullHeight >> 1) + 240), WidgetSkinState.introFaceModulationRgb);
            AccountCreationForm.introGeometryFrames[0].draw(faceHalfWidth + 320, -34 + geometryTravelOrFallOffset - (AccountCreationForm.introGeometryFrames[0].fullHeight >> 1) + 240);
            AccountCreationForm.introGeometryFrames[1].draw(-faceHalfWidth + 320 - AccountCreationForm.introGeometryFrames[1].fullWidth, -(AccountCreationForm.introGeometryFrames[1].fullHeight >> 1) + (240 + geometryTravelOrFallOffset + 22));
            return;
        }
        geometryTravelOrFallOffset = MatchingTextValidator.introAnimationTick << 2;
        if (faceHalfWidth + 320 < 1000 - geometryTravelOrFallOffset) {
            AccountCreationForm.introGeometryFrames[0].draw(1000 - geometryTravelOrFallOffset, -34 + (240 - (AccountCreationForm.introGeometryFrames[0].fullHeight >> 1)));
            if (-AccountCreationForm.introGeometryFrames[1].fullWidth + (320 - faceHalfWidth) > geometryTravelOrFallOffset - 1200) {
                AccountCreationForm.introGeometryFrames[1].draw(geometryTravelOrFallOffset - 1200, 22 + (240 - (AccountCreationForm.introGeometryFrames[1].fullHeight >> 1)));
                RasterTargetSnapshot.introFaceFrames[CachedTextLayout.introFaceFrameIndex].drawGrayModulated(320 - faceHalfWidth, 240 - (RasterTargetSnapshot.introFaceFrames[CachedTextLayout.introFaceFrameIndex].fullHeight >> 1), WidgetSkinState.introFaceModulationRgb);
                return;
            }
            AccountCreationForm.introGeometryFrames[1].draw(-AccountCreationForm.introGeometryFrames[1].fullWidth - faceHalfWidth + 320, 240 - (AccountCreationForm.introGeometryFrames[1].fullHeight >> 1) + 22);
            RasterTargetSnapshot.introFaceFrames[CachedTextLayout.introFaceFrameIndex].drawGrayModulated(320 - faceHalfWidth, 240 - (RasterTargetSnapshot.introFaceFrames[CachedTextLayout.introFaceFrameIndex].fullHeight >> 1), WidgetSkinState.introFaceModulationRgb);
            return;
        }
        AccountCreationForm.introGeometryFrames[0].draw(320 + faceHalfWidth, 206 - (AccountCreationForm.introGeometryFrames[0].fullHeight >> 1));
        if (-AccountCreationForm.introGeometryFrames[1].fullWidth + (320 - faceHalfWidth) > geometryTravelOrFallOffset - 1200) {
            AccountCreationForm.introGeometryFrames[1].draw(geometryTravelOrFallOffset - 1200, 22 + (240 - (AccountCreationForm.introGeometryFrames[1].fullHeight >> 1)));
            RasterTargetSnapshot.introFaceFrames[CachedTextLayout.introFaceFrameIndex].drawGrayModulated(320 - faceHalfWidth, 240 - (RasterTargetSnapshot.introFaceFrames[CachedTextLayout.introFaceFrameIndex].fullHeight >> 1), WidgetSkinState.introFaceModulationRgb);
            return;
        }
        AccountCreationForm.introGeometryFrames[1].draw(-AccountCreationForm.introGeometryFrames[1].fullWidth - faceHalfWidth + 320, 240 - (AccountCreationForm.introGeometryFrames[1].fullHeight >> 1) + 22);
        RasterTargetSnapshot.introFaceFrames[CachedTextLayout.introFaceFrameIndex].drawGrayModulated(320 - faceHalfWidth, 240 - (RasterTargetSnapshot.introFaceFrames[CachedTextLayout.introFaceFrameIndex].fullHeight >> 1), WidgetSkinState.introFaceModulationRgb);
    }

    public static void releaseStaticReferences(boolean methodGuard) {
        sessionSocket = null;
        boardSceneRaster = null;
        if (!methodGuard) {
            return;
        }
        accountCreationDisplayName = null;
    }

    public final void drawWidget(int parentX, int methodGuard, int parentY, boolean widgetEnabled, UiWidget widget) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        Sprite var8 = null;
        try {
          var6_int = widget.widgetX + parentX;
          var7 = widget.widgetY + parentY;
          EntityLinkSupport.drawGradientWidgetBorder(var6_int, widget.widgetHeight, var7, widget.widgetWidth, -1540604944);
          var8 = ClientClockSupport.validationStateSprites[1];
          if ((widget instanceof ButtonWidget) &&
              (((ButtonWidget) ((Object) widget)).active)) {
            var8.drawAdditive(var6_int - (-1 - (-var8.fullWidth + widget.widgetWidth >> 1)), (-var8.fullHeight + widget.widgetHeight >> 1) + 1 + var7, 256);
          }
          if (widget.hasKeyboardFocus((byte) 54)) {
            ImageProducerRasterBuffer.drawDottedWhiteFocusRectangle(var7 + 2, -4 + widget.widgetWidth, 14164, -4 + widget.widgetHeight, var6_int + 2);
          }
          if (methodGuard < -5) {
            return;
          }
          gameMusicVolumeLevel = 68;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("oc.E(").append(parentX).append(',').append(methodGuard).append(',').append(parentY).append(',').append(widgetEnabled).append(',');
          if (widget == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static void pushRasterTarget(int methodGuard) {
        int var2 = -117 / ((-46 - methodGuard) / 50);
        RasterTargetSnapshot var1 = (RasterTargetSnapshot) ((Object) SharedBufferPools.rasterSnapshotPool.removeLast(1));
        if (!(var1 != null)) {
            var1 = new RasterTargetSnapshot();
        }
        var1.capture(SoftwareRasterizer.clipLeft, SoftwareRasterizer.clipRight, SoftwareRasterizer.clipBottom, SoftwareRasterizer.stride, SoftwareRasterizer.framebufferHeight, SoftwareRasterizer.clipTop, SoftwareRasterizer.framebuffer, true);
        MatchingTextValidator.rasterTargetStack.addLast(-88, var1);
    }

    final static void estimateHeapCapacityMiB(int methodGuard) {
        try {
            java.lang.reflect.Method maxMemoryMethod = null;
            int guardQuotient = 0;
            Exception ignoredMethodLookupFailure = null;
            Runtime runtime = null;
            Throwable ignoredMaxMemoryFailure = null;
            Long maximumHeapBytes = null;
            Object[] unusedNullArgumentsSnapshot = null;
            int maxMemoryInvocationContinuation = 0;
            Throwable caughtHeapQueryThrowable = null;
            try {
              maxMemoryMethod = Runtime.class.getMethod("maxMemory", new Class[]{});
              if (maxMemoryMethod == null) {
                guardQuotient = -93 / ((-13 - methodGuard) / 47);
                return;
              }
              try {
                runtime = Runtime.getRuntime();
                unusedNullArgumentsSnapshot = (Object[]) null;
                maximumHeapBytes = (Long) (maxMemoryMethod.invoke((Object) (runtime), (Object[]) null));
                ArchiveHandshakeState.heapCapacityEstimateMiB = 1 + (int)(maximumHeapBytes.longValue() / 1048576L);
                maxMemoryInvocationContinuation = 0;
              } catch (java.lang.Throwable maxMemoryInvocationFailure) {
                caughtHeapQueryThrowable = maxMemoryInvocationFailure;
                ignoredMaxMemoryFailure = caughtHeapQueryThrowable;
                maxMemoryInvocationContinuation = 1;
              }
              if (maxMemoryInvocationContinuation == 0) {
                guardQuotient = -93 / ((-13 - methodGuard) / 47);
                return;
              }
            } catch (java.lang.Exception methodLookupFailure) {
              caughtHeapQueryThrowable = methodLookupFailure;
              ignoredMethodLookupFailure = (Exception) (Object) caughtHeapQueryThrowable;
              guardQuotient = -93 / ((-13 - methodGuard) / 47);
              return;
            }
            guardQuotient = -93 / ((-13 - methodGuard) / 47);
        } catch (RuntimeException | Error uncheckedBoundaryFailure) {
            throw uncheckedBoundaryFailure;
        } catch (Throwable checkedBoundaryFailure) {
            throw new RuntimeException(checkedBoundaryFailure);
        }
    }

    static {
        gameMusicVolumeLevel = 80;
        boardSceneRaster = new Sprite(640, 640);
    }
}
