/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ViewportController {
    private int maximumHeight;
    private int field_i;
    private int field_j;
    private int containerHeight;
    private int maximumWidth;
    static BoundedUrlRequest field_m;
    private int minimumHeight;
    private int field_o;
    private int field_d;
    private int minimumHeapMiB;
    private int field_q;
    private boolean autoResizeEnabled;
    private int containerWidth;
    private int minimumWidth;
    private int field_r;
    private int field_b;
    private ViewportResizeListener field_l;
    private int field_p;
    private float aspectRatio;

    public static void releaseStatics(boolean guard) {
        if (guard) {
          return;
        }
        field_m = null;
    }

    final void restoreWindowedSize(int guard) {
        if (guard != 0) {
          return;
        }
        this.field_l.onResize(true, this.field_r, this.field_p);
    }

    final FullscreenFocusCanvas enterFullscreen(boolean windowed) {
        this.field_p = AppletViewportState.canvasWidth;
        if (!windowed) {
          this.updateViewport(12);
          this.field_r = BoundedUrlRequest.field_d;
          this.field_l.onResize(windowed, this.field_o, this.field_j);
          PacketBuffer.field_i = false;
          FullscreenFocusCanvas var2 = AccountFormStage.createFullscreenCanvas(this.field_j, -16493, NetworkGameClient.taskService, this.field_o, 0, 0);
          if (var2 == null) {
            this.restoreWindowedSize(0);
            return var2;
          }
          return var2;
        }
        this.field_r = BoundedUrlRequest.field_d;
        this.field_l.onResize(windowed, this.field_o, this.field_j);
        PacketBuffer.field_i = false;
        FullscreenFocusCanvas var2Lifetime1 = AccountFormStage.createFullscreenCanvas(this.field_j, -16493, NetworkGameClient.taskService, this.field_o, 0, 0);
        if (var2Lifetime1 != null) {
          return var2Lifetime1;
        }
        this.restoreWindowedSize(0);
        return var2Lifetime1;
    }

    final boolean canResizeViewport(int guard) {
        int var2 = 71 / ((-20 - guard) / 62);
        if (this.minimumHeapMiB > IntroFrameRenderer.field_c) {
          return false;
        }
        if (Js5NetworkRequest.field_x > 0) {
          return true;
        }
        return false;
    }

    private final void applyDesiredSize(byte guard) {
        int var5 = EscapeVector.obfuscationControl;
        int var2 = this.containerWidth;
        int var3 = this.containerHeight;
        if (!this.canResizeViewport(-109)) {
          this.autoResizeEnabled = false;
          return;
        }
        boolean decompiledFrameRemainder2 = true;
        if (this.maximumHeight < var3) {
          var3 = this.maximumHeight;
        } else if (this.minimumHeight <= var3) {
          boolean decompiledFrameRemainder1 = true;
          if (this.maximumWidth < var2) {
            var2 = this.maximumWidth;
          } else if (this.minimumWidth > var2) {
            var2 = this.minimumWidth;
            if (0.0f < this.aspectRatio) {
              int var4 = (int)(0.5f + (float)var3 * this.aspectRatio);
              if (var2 < var4) {
                var3 = (int)((float)var2 / this.aspectRatio);
              } else if (var4 < var2) {
                var2 = var4;
              }
            }
            decompiledFrameRemainder1 = false;
          }
          if (decompiledFrameRemainder1 &&
            0.0f < this.aspectRatio) {
            int var4Lifetime2 = (int)(0.5f + (float)var3 * this.aspectRatio);
            if (var2 < var4Lifetime2) {
              var3 = (int)((float)var2 / this.aspectRatio);
            } else if (var4Lifetime2 < var2) {
              var2 = var4Lifetime2;
            }
          }
          decompiledFrameRemainder2 = false;
        } else {
          var3 = this.minimumHeight;
        }
        if (decompiledFrameRemainder2) {
          boolean decompiledFrameRemainder0 = true;
          if (this.maximumWidth < var2) {
            var2 = this.maximumWidth;
          } else if (this.minimumWidth > var2) {
            var2 = this.minimumWidth;
            if (0.0f < this.aspectRatio) {
              int var4Lifetime1 = (int)(0.5f + (float)var3 * this.aspectRatio);
              if (var2 < var4Lifetime1) {
                var3 = (int)((float)var2 / this.aspectRatio);
              } else if (var4Lifetime1 < var2) {
                var2 = var4Lifetime1;
              }
            }
            decompiledFrameRemainder0 = false;
          }
          if (decompiledFrameRemainder0 &&
            0.0f < this.aspectRatio) {
            int var4Lifetime1Lifetime1 = (int)(0.5f + (float)var3 * this.aspectRatio);
            if (var2 < var4Lifetime1Lifetime1) {
              var3 = (int)((float)var2 / this.aspectRatio);
            } else if (var4Lifetime1Lifetime1 < var2) {
              var2 = var4Lifetime1Lifetime1;
            }
          }
        }
        if (AppletViewportState.canvasWidth != var2) {
          this.field_l.onResize(true, var3, var2);
        } else if (var3 != BoundedUrlRequest.field_d) {
          this.field_l.onResize(true, var3, var2);
        }
        if (guard != 13) {
          return;
        }
        if (this.containerWidth > 0) {
          MenuTitleRenderSupport.field_b = (this.containerWidth - AppletViewportState.canvasWidth) / 2;
        }
    }

    final void updateViewport(int guard) {
        if (null != IsaacRandom.field_d) {
          return;
        }
        if (Js5NetworkRequest.field_x <= 0) {
          this.autoResizeEnabled = false;
        }
        if (!this.autoResizeEnabled) {
          if (AppletViewportState.canvasWidth < this.containerWidth) {
            MenuTitleRenderSupport.field_b = (-AppletViewportState.canvasWidth + this.containerWidth) / 2;
          } else if (0 < this.containerWidth) {
            MenuTitleRenderSupport.field_b = 0;
          }
          if (this.field_q == AppletViewportState.canvasWidth &&
            this.field_i == BoundedUrlRequest.field_d) {
            return;
          }
          this.field_l.onResize(true, this.field_i, this.field_q);
          return;
        }
        if (guard != 9477) {
          return;
        }
        int fieldTemp$0 = this.field_d - 1;
        this.field_d = this.field_d - 1;
        if (fieldTemp$0 > 0) {
          return;
        }
        this.field_d = this.field_b;
        if (IntroFrameRenderer.field_c < this.minimumHeapMiB) {
          this.autoResizeEnabled = false;
        } else {
          this.applyDesiredSize((byte) 13);
        }
        return;
    }

    final void setDesiredSize(int height, int width, int guard) {
        this.containerHeight = height;
        if (guard != 18705) {
          return;
        }
        this.containerWidth = width;
    }

    private ViewportController() throws Throwable {
        throw new Error();
    }

    static {
    }
}
