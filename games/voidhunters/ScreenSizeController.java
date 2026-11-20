/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScreenSizeController {
    private int previousHeight;
    private int defaultWidth;
    private int availableHeight;
    private int resizeInterval;
    private int previousWidth;
    private int availableWidth;
    private int maximumWidth;
    private int maximumHeight;
    int fullscreenWidth;
    static IntrusiveDeque field_p;
    private int defaultHeight;
    private float aspectRatio;
    int minimumMemoryMegabytes;
    private int minimumHeight;
    private int minimumWidth;
    private CanvasResizeListener resizeListener;
    int fullscreenHeight;
    static Sprite[] field_d;
    private int resizeTicksRemaining;
    boolean resizable;

    private final void applyResizableSize(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        int var4Lifetime2;
        var5 = VoidHunters.field_G;
        var2 = this.availableWidth;
        var3 = this.availableHeight;
        if (!this.canResize(20)) {
          this.resizable = false;
          return;
        }
        if (var3 <= this.maximumHeight) {
          if (this.minimumHeight > var3) {
            var3 = this.minimumHeight;
          }
        } else {
          var3 = this.maximumHeight;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.maximumWidth < var2) {
          var2 = this.maximumWidth;
        } else {
          if (var2 >= this.minimumWidth) {
            if (param0 != -17698) {
              this.maximumHeight = -54;
              if (0.0f < this.aspectRatio) {
                var4 = (int)(0.5f + (float)var3 * this.aspectRatio);
                if (var2 < var4) {
                  var3 = (int)((float)var2 / this.aspectRatio);
                } else {
                  if (var2 > var4) {
                    var2 = var4;
                  }
                }
              }
              decompiledFrameRemainder0 = false;
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameRemainder0 = !(!(0.0f < this.aspectRatio)))) {
              var4Lifetime2 = (int)(0.5f + (float)var3 * this.aspectRatio);
              if (var2 < var4Lifetime2) {
                var3 = (int)((float)var2 / this.aspectRatio);
              } else {
                if (var2 > var4Lifetime2) {
                  var2 = var4Lifetime2;
                }
              }
              if (var2 != GetDebrisSurvives.field_p) {
                this.resizeListener.onSizeChanged(99, var2, var3);
              } else {
                if (SetPointDefenceLaserReload.field_p != var3) {
                  this.resizeListener.onSizeChanged(99, var2, var3);
                }
              }
              if (0 < this.availableWidth) {
                GetCountermeasuresPulseRadius.field_o = (this.availableWidth - GetDebrisSurvives.field_p) / 2;
              }
              return;
            }
          }
          if (decompiledFrameRemainder0) {
            var2 = this.minimumWidth;
          }
        }
        if (decompiledFrameRemainder0) {
          if (param0 != -17698) {
            this.maximumHeight = -54;
          }
          if (0.0f < this.aspectRatio) {
            var4Lifetime1 = (int)(0.5f + (float)var3 * this.aspectRatio);
            if (var2 < var4Lifetime1) {
              var3 = (int)((float)var2 / this.aspectRatio);
            } else {
              if (var2 > var4Lifetime1) {
                var2 = var4Lifetime1;
              }
            }
          }
        }
        if (var2 != GetDebrisSurvives.field_p) {
          this.resizeListener.onSizeChanged(99, var2, var3);
        } else {
          if (SetPointDefenceLaserReload.field_p != var3) {
            this.resizeListener.onSizeChanged(99, var2, var3);
          }
        }
        if (0 < this.availableWidth) {
          GetCountermeasuresPulseRadius.field_o = (this.availableWidth - GetDebrisSurvives.field_p) / 2;
        }
    }

    final void setFullscreenSize(int param0, int param1, int param2) {
        this.fullscreenWidth = param2;
        if (param1 != 480) {
          this.previousWidth = -38;
          this.fullscreenHeight = param0;
          return;
        }
        this.fullscreenHeight = param0;
    }

    final FullscreenCanvas createFullscreenCanvas(byte param0) {
        FullscreenCanvas var2 = null;
        FullscreenCanvas var2Lifetime1;
        this.previousWidth = GetDebrisSurvives.field_p;
        this.previousHeight = SetPointDefenceLaserReload.field_p;
        if (param0 < 112) {
          ScreenSizeController.drawCachedFrame(false, -4);
          this.resizeListener.onSizeChanged(65, this.fullscreenWidth, this.fullscreenHeight);
          GetDebrisSurvives.field_q = false;
          var2 = OpenGlTexture3D.createFullscreenCanvas(0, SetTorpedoProjectiles.field_o, this.fullscreenWidth, this.fullscreenHeight, 0, 0);
          if (var2 == null) {
            this.restorePreviousSize(-29674);
            return var2;
          }
          return var2;
        }
        this.resizeListener.onSizeChanged(65, this.fullscreenWidth, this.fullscreenHeight);
        GetDebrisSurvives.field_q = false;
        var2Lifetime1 = OpenGlTexture3D.createFullscreenCanvas(0, SetTorpedoProjectiles.field_o, this.fullscreenWidth, this.fullscreenHeight, 0, 0);
        if (var2Lifetime1 != null) {
          return var2Lifetime1;
        }
        this.restorePreviousSize(-29674);
        return var2Lifetime1;
    }

    final boolean canResize(int param0) {
        if (param0 < 0) {
          return false;
        }
        if (this.minimumMemoryMegabytes > Nebula.maximumHeapMegabytes) {
          return false;
        }
        if (GetDebrisCarryOver.field_o <= 0) {
          return false;
        }
        return true;
    }

    final boolean isResizeMemoryRestricted(byte param0) {
        if (param0 != -17) {
          this.minimumMemoryMegabytes = 13;
          if (GetDebrisCarryOver.field_o <= 0) {
            return false;
          }
          if (this.minimumMemoryMegabytes > Nebula.maximumHeapMegabytes) {
            return true;
          }
          return false;
        }
        if (GetDebrisCarryOver.field_o <= 0) {
          return false;
        }
        if (this.minimumMemoryMegabytes > Nebula.maximumHeapMegabytes) {
          return true;
        }
        return false;
    }

    final void setAvailableSize(int param0, int param1, int param2) {
        this.availableWidth = param1;
        int var4 = 89 / ((param0 - 14) / 39);
        this.availableHeight = param2;
    }

    public static void clearSharedReferences(byte param0) {
        field_d = null;
        field_p = null;
        if (param0 != 120) {
          field_p = (IntrusiveDeque) null;
        }
    }

    final boolean isValidSize(int param0, int param1, int param2) {
        boolean stackIn_13_0 = false;
        if (param2 != 0) {
          this.resizable = true;
          if (this.minimumWidth > param1) {
            return false;
          }
          if (param1 > this.maximumWidth) {
            return false;
          }
          if (this.minimumHeight > param0) {
            return false;
          }
          if (this.maximumHeight < param0) {
            return false;
          }
          if (this.aspectRatio == 0.0f) {
            return true;
          }
          stackIn_13_0 = (Math.round(this.aspectRatio * (float)param0) == param1);
          return stackIn_13_0;
        }
        if (this.minimumWidth > param1) {
          return false;
        }
        if (param1 > this.maximumWidth) {
          return false;
        }
        if (this.minimumHeight > param0) {
          return false;
        }
        if (this.maximumHeight < param0) {
          return false;
        }
        if (this.aspectRatio == 0.0f) {
          return true;
        }
        if (Math.round(this.aspectRatio * (float)param0) == param1) {
          return true;
        }
        return false;
    }

    final void update(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        if (null != EmailAvailabilityChecks.fullscreenCanvas) {
          return;
        }
        if (0 < GetDebrisCarryOver.field_o) {
          if (this.resizable) {
            fieldTemp$1 = this.resizeTicksRemaining - 1;
            this.resizeTicksRemaining = this.resizeTicksRemaining - 1;
            if (0 < fieldTemp$1) {
              return;
            }
            this.resizeTicksRemaining = this.resizeInterval;
            if (param0 != 3908) {
              field_d = (Sprite[]) null;
            }
            if (Nebula.maximumHeapMegabytes < this.minimumMemoryMegabytes) {
              this.resizable = false;
            } else {
              this.applyResizableSize(-17698);
            }
            return;
          }
          if (this.availableWidth > GetDebrisSurvives.field_p) {
            GetCountermeasuresPulseRadius.field_o = (this.availableWidth - GetDebrisSurvives.field_p) / 2;
          } else {
            if (this.availableWidth <= 0) {
              if (this.defaultWidth == GetDebrisSurvives.field_p &&
                this.defaultHeight == SetPointDefenceLaserReload.field_p) {
                return;
              }
              this.resizeListener.onSizeChanged(98, this.defaultWidth, this.defaultHeight);
              return;
            }
            GetCountermeasuresPulseRadius.field_o = 0;
          }
          if (this.defaultWidth != GetDebrisSurvives.field_p) {
            this.resizeListener.onSizeChanged(98, this.defaultWidth, this.defaultHeight);
          } else {
            if (this.defaultHeight != SetPointDefenceLaserReload.field_p) {
              this.resizeListener.onSizeChanged(98, this.defaultWidth, this.defaultHeight);
            }
          }
          return;
        }
        this.resizable = false;
        if (this.resizable) {
          fieldTemp$0 = this.resizeTicksRemaining - 1;
          this.resizeTicksRemaining = this.resizeTicksRemaining - 1;
          if (0 < fieldTemp$0) {
            return;
          }
          this.resizeTicksRemaining = this.resizeInterval;
          if (param0 != 3908) {
            field_d = (Sprite[]) null;
          }
          if (Nebula.maximumHeapMegabytes >= this.minimumMemoryMegabytes) {
            this.applyResizableSize(-17698);
          } else {
            this.resizable = false;
          }
          return;
        }
        if (this.availableWidth > GetDebrisSurvives.field_p) {
          GetCountermeasuresPulseRadius.field_o = (this.availableWidth - GetDebrisSurvives.field_p) / 2;
        } else {
          if (this.availableWidth > 0) {
            GetCountermeasuresPulseRadius.field_o = 0;
            if (this.defaultWidth != GetDebrisSurvives.field_p) {
              this.resizeListener.onSizeChanged(98, this.defaultWidth, this.defaultHeight);
            } else {
              if (this.defaultHeight != SetPointDefenceLaserReload.field_p) {
                this.resizeListener.onSizeChanged(98, this.defaultWidth, this.defaultHeight);
              }
            }
            return;
          }
        }
        if (this.defaultWidth == GetDebrisSurvives.field_p &&
          this.defaultHeight == SetPointDefenceLaserReload.field_p) {
          return;
        }
        this.resizeListener.onSizeChanged(98, this.defaultWidth, this.defaultHeight);
    }

    ScreenSizeController(CanvasResizeListener param0) {
        this(640, 480, 1280, 1024, 640, 480, 122, 16, param0);
    }

    final static void drawCachedFrame(boolean param0, int param1) {
        if (!SetReloadBarWidth.isCachedFrameAvailable((byte) -91)) {
          return;
        }
        if (param0) {
          SoftwareRasterizer2D.fillRectangleAlpha(0, 0, SoftwareRasterizer2D.width, SoftwareRasterizer2D.height, 0, 192);
        }
        if (param1 == 20637) {
          HighscoreTableRequest.field_h.draw(0, 0, 0);
          return;
        }
        field_d = (Sprite[]) null;
        HighscoreTableRequest.field_h.draw(0, 0, 0);
    }

    private ScreenSizeController(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, CanvasResizeListener param8) {
        try {
          this.aspectRatio = 0.0f;
          this.resizeListener = param8;
          this.defaultWidth = param4;
          this.resizable = false;
          this.minimumHeight = param1;
          this.resizeInterval = param7;
          this.minimumMemoryMegabytes = param6;
          this.fullscreenHeight = 480;
          this.defaultHeight = param5;
          this.minimumWidth = param0;
          this.maximumWidth = param2;
          this.maximumHeight = param3;
          this.fullscreenWidth = 640;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "vfa.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    final void restorePreviousSize(int param0) {
        if (param0 == -29674) {
          this.resizeListener.onSizeChanged(114, this.previousWidth, this.previousHeight);
          return;
        }
        this.fullscreenHeight = -17;
        this.resizeListener.onSizeChanged(114, this.previousWidth, this.previousHeight);
    }

    static {
        field_p = new IntrusiveDeque();
    }
}
