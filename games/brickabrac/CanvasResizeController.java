/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CanvasResizeController {
    private int ticksUntilResize;
    private int maximumHeight;
    private CanvasResizeHandler resizeHandler;
    private int fallbackHeight;
    private int requestedHeight;
    private int savedCanvasHeight;
    private int resizeIntervalTicks;
    private int fallbackWidth;
    static String field_k;
    private int minimumHeapLimitMiB;
    static int field_f;
    private int maximumWidth;
    static long field_n;
    static String[] packNames;
    private int fullscreenWidth;
    private int requestedWidth;
    private int fullscreenHeight;
    private float aspectRatio;
    private int minimumHeight;
    private int savedCanvasWidth;
    private int minimumWidth;
    static String field_o;
    static String messageText;
    private boolean adaptiveResizeEnabled;

    final void tickResizePolicy(int obfuscationGuard) {
        int remainingResizeTicks = 0;
        int remainingResizeTicksFallback = 0;
        if (null != GameplayRenderHelpers.fullscreenCanvas) {
          return;
        }
        if (ResourceArchiveFactory.windowModeCapabilityWord > 0) {
          if (this.adaptiveResizeEnabled) {
            remainingResizeTicks = this.ticksUntilResize - 1;
            this.ticksUntilResize = this.ticksUntilResize - 1;
            if (remainingResizeTicks > 0) {
              return;
            }
            this.ticksUntilResize = this.resizeIntervalTicks;
            if (ValidationStatus.reportedHeapLimitMiB < this.minimumHeapLimitMiB) {
              this.adaptiveResizeEnabled = false;
            } else {
              if (obfuscationGuard < 23) {
                this.savedCanvasWidth = -43;
              }
              this.applyAdaptiveSize(0);
            }
            return;
          }
          if (this.requestedWidth > WeightedLruCache.canvasWidth) {
            WeightedLruCache.canvasOffsetX = (-WeightedLruCache.canvasWidth + this.requestedWidth) / 2;
          } else {
            if (this.requestedWidth > 0) {
              WeightedLruCache.canvasOffsetX = 0;
            }
          }
          if (WeightedLruCache.canvasWidth == this.fallbackWidth &&
            WidgetPaintStyle.canvasHeight == this.fallbackHeight) {
            return;
          }
          this.resizeHandler.resizeCanvas(this.fallbackWidth, this.fallbackHeight, -70);
          return;
        }
        this.adaptiveResizeEnabled = false;
        if (!this.adaptiveResizeEnabled) {
          if (this.requestedWidth <= WeightedLruCache.canvasWidth) {
            if (this.requestedWidth > 0) {
              WeightedLruCache.canvasOffsetX = 0;
            }
          } else {
            WeightedLruCache.canvasOffsetX = (-WeightedLruCache.canvasWidth + this.requestedWidth) / 2;
          }
          if (WeightedLruCache.canvasWidth != this.fallbackWidth) {
            this.resizeHandler.resizeCanvas(this.fallbackWidth, this.fallbackHeight, -70);
          } else {
            if (WidgetPaintStyle.canvasHeight != this.fallbackHeight) {
              this.resizeHandler.resizeCanvas(this.fallbackWidth, this.fallbackHeight, -70);
            }
          }
          return;
        }
        remainingResizeTicksFallback = this.ticksUntilResize - 1;
        this.ticksUntilResize = this.ticksUntilResize - 1;
        if (remainingResizeTicksFallback > 0) {
          return;
        }
        this.ticksUntilResize = this.resizeIntervalTicks;
        if (ValidationStatus.reportedHeapLimitMiB < this.minimumHeapLimitMiB) {
          this.adaptiveResizeEnabled = false;
        } else {
          if (obfuscationGuard < 23) {
            this.savedCanvasWidth = -43;
          }
          this.applyAdaptiveSize(0);
        }
        return;
    }

    final static void resendPendingRankingsRequests(byte obfuscationGuard, int opcode) {
        int var3 = 0;
        RankingsRequest var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          if (obfuscationGuard <= 118) {
            CanvasResizeController.initializeFireworkSpawnArea(17, -27, -12, -54, -92);
          }
          var4 = (RankingsRequest) (HuffmanCodec.pendingRankingsRequests.first(-99));
          while (var4 != null) {
            MultiplayerExitScreen.sendRankingsRequest(-21167, var4, opcode);
            var4 = (RankingsRequest) (HuffmanCodec.pendingRankingsRequests.next((byte) 116));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var2), "qn.I(" + obfuscationGuard + ',' + opcode + ')');
        }
    }

    final void restoreSavedCanvasSize(int obfuscationGuard) {
        this.resizeHandler.resizeCanvas(this.savedCanvasWidth, this.savedCanvasHeight, -77);
        int unusedGuardQuotient = 76 / ((obfuscationGuard - 31) / 42);
    }

    final void setRequestedSize(int obfuscationGuard, int width, int height) {
        this.requestedHeight = height;
        this.requestedWidth = width;
        int unusedGuardRemainder = 111 % ((obfuscationGuard + 47) / 41);
    }

    final static void initializeFireworkSpawnArea(int maxY, int minX, int maxX, int minY, int obfuscationGuard) {
        JungleBackground.fireworkRandom = new IsaacGenerator(new int[]{(int)MonotonicTime.nowMillis(false)});
        PauseMenuScreen.fireworkSpawnMinX = minX;
        if (obfuscationGuard == -6532) {
          Mesh3D.fireworkSpawnMinY = minY;
          HotspotTextWidget.fireworkSpawnMaxX = maxX;
          ParallaxMusicHelpers.fireworkSpawnMaxY = maxY;
          FarmBackground.fireworkSpawnWidth = HotspotTextWidget.fireworkSpawnMaxX - PauseMenuScreen.fireworkSpawnMinX;
          ArrayWidgetGroup.fireworkSpawnHeight = -Mesh3D.fireworkSpawnMinY + ParallaxMusicHelpers.fireworkSpawnMaxY;
          return;
        }
        CanvasResizeController.b(109);
        Mesh3D.fireworkSpawnMinY = minY;
        HotspotTextWidget.fireworkSpawnMaxX = maxX;
        ParallaxMusicHelpers.fireworkSpawnMaxY = maxY;
        FarmBackground.fireworkSpawnWidth = HotspotTextWidget.fireworkSpawnMaxX - PauseMenuScreen.fireworkSpawnMinX;
        ArrayWidgetGroup.fireworkSpawnHeight = -Mesh3D.fireworkSpawnMinY + ParallaxMusicHelpers.fireworkSpawnMaxY;
    }

    final GameCanvas openFullscreenCanvas(boolean obfuscationGuard) {
        this.savedCanvasHeight = WidgetPaintStyle.canvasHeight;
        this.savedCanvasWidth = WeightedLruCache.canvasWidth;
        this.resizeHandler.resizeCanvas(this.fullscreenWidth, this.fullscreenHeight, -93);
        MusicCrossfadeStream.field_A = false;
        GameCanvas canvas = LoginCredentials.createFullscreenCanvas(0, 0, this.fullscreenWidth, this.fullscreenHeight, obfuscationGuard, AccountMessageDialog.field_ub);
        if (canvas == null) {
          this.restoreSavedCanvasSize(102);
        }
        return canvas;
    }

    public static void b(int param0) {
        if (param0 == 0) {
          packNames = null;
          field_o = null;
          messageText = null;
          field_k = null;
          return;
        }
        CanvasResizeController.b(-47);
        packNames = null;
        field_o = null;
        messageText = null;
        field_k = null;
    }

    private CanvasResizeController() throws Throwable {
        throw new Error();
    }

    final boolean canUseAdaptiveResize(byte obfuscationGuard) {
        if (obfuscationGuard != -32) {
          return true;
        }
        if (ValidationStatus.reportedHeapLimitMiB < this.minimumHeapLimitMiB) {
          return false;
        }
        if (0 >= ResourceArchiveFactory.windowModeCapabilityWord) {
          return false;
        }
        return true;
    }

    private final void applyAdaptiveSize(int offsetUpdateThreshold) {
        int fittedWidth;
        int fittedHeight;
        int widthFromHeight;
        int unusedClientFlag;
        int widthFromHeightAtLimit;
        unusedClientFlag = BrickABrac.field_J ? 1 : 0;
        fittedWidth = this.requestedWidth;
        fittedHeight = this.requestedHeight;
        if (!this.canUseAdaptiveResize((byte) -32)) {
          this.adaptiveResizeEnabled = false;
          return;
        }
        if (fittedHeight <= this.maximumHeight) {
          if (fittedHeight < this.minimumHeight) {
            fittedHeight = this.minimumHeight;
          }
        } else {
          fittedHeight = this.maximumHeight;
        }
        if (this.maximumWidth < fittedWidth) {
          fittedWidth = this.maximumWidth;
        } else {
          if (this.minimumWidth <= fittedWidth) {
            if (!(0.0f < this.aspectRatio)) {
              if (fittedWidth != WeightedLruCache.canvasWidth) {
                this.resizeHandler.resizeCanvas(fittedWidth, fittedHeight, -97);
              } else {
                if (fittedHeight != WidgetPaintStyle.canvasHeight) {
                  this.resizeHandler.resizeCanvas(fittedWidth, fittedHeight, -97);
                }
              }
              if (offsetUpdateThreshold < this.requestedWidth) {
                WeightedLruCache.canvasOffsetX = (-WeightedLruCache.canvasWidth + this.requestedWidth) / 2;
              }
              return;
            }
            widthFromHeight = (int)((float)fittedHeight * this.aspectRatio + 0.5f);
            if (widthFromHeight > fittedWidth) {
              fittedHeight = (int)((float)fittedWidth / this.aspectRatio);
            } else {
              if (fittedWidth > widthFromHeight) {
                fittedWidth = widthFromHeight;
              }
            }
            if (fittedWidth != WeightedLruCache.canvasWidth) {
              this.resizeHandler.resizeCanvas(fittedWidth, fittedHeight, -97);
            } else {
              if (fittedHeight != WidgetPaintStyle.canvasHeight) {
                this.resizeHandler.resizeCanvas(fittedWidth, fittedHeight, -97);
              }
            }
            if (offsetUpdateThreshold < this.requestedWidth) {
              WeightedLruCache.canvasOffsetX = (-WeightedLruCache.canvasWidth + this.requestedWidth) / 2;
            }
            return;
          }
          fittedWidth = this.minimumWidth;
        }
        boolean requestResizeAfterFit = true;
        if (0.0f < this.aspectRatio) {
          widthFromHeightAtLimit = (int)((float)fittedHeight * this.aspectRatio + 0.5f);
          if (widthFromHeightAtLimit > fittedWidth) {
            fittedHeight = (int)((float)fittedWidth / this.aspectRatio);
          } else {
            if (fittedWidth > widthFromHeightAtLimit) {
              fittedWidth = widthFromHeightAtLimit;
              if (fittedWidth != WeightedLruCache.canvasWidth) {
                this.resizeHandler.resizeCanvas(fittedWidth, fittedHeight, -97);
                if (offsetUpdateThreshold < this.requestedWidth) {
                  WeightedLruCache.canvasOffsetX = (-WeightedLruCache.canvasWidth + this.requestedWidth) / 2;
                }
                return;
              }
              if (fittedHeight != WidgetPaintStyle.canvasHeight) {
                this.resizeHandler.resizeCanvas(fittedWidth, fittedHeight, -97);
              }
              requestResizeAfterFit = false;
            }
          }
        }
        if (requestResizeAfterFit) {
          if (fittedWidth != WeightedLruCache.canvasWidth) {
            this.resizeHandler.resizeCanvas(fittedWidth, fittedHeight, -97);
          } else {
            if (fittedHeight != WidgetPaintStyle.canvasHeight) {
              this.resizeHandler.resizeCanvas(fittedWidth, fittedHeight, -97);
            }
          }
        }
        if (offsetUpdateThreshold >= this.requestedWidth) {
          return;
        }
        WeightedLruCache.canvasOffsetX = (-WeightedLruCache.canvasWidth + this.requestedWidth) / 2;
    }

    static {
        field_k = "Please log in as a subscribing member to access this feature.";
        field_o = "Playing";
    }
}
