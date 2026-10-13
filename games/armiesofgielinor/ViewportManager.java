/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ViewportManager {
    int fullscreenWidth;
    int fullscreenHeight;
    static String field_a;
    private int fixedHeight;
    static ClientUiComponent field_d;
    private int maximumWidth;
    boolean resizeEnabled;
    private int minimumHeapMiB;
    private int resizeCountdown;
    static String field_u;
    private ViewportResizeListener listener;
    private int savedWidth;
    private int savedHeight;
    private float aspectRatio;
    static String[] field_q;
    private int fixedWidth;
    static String field_w;
    private int minimumHeight;
    private int containerWidth;
    private int maximumHeight;
    static boolean field_c;
    private int minimumWidth;
    private int containerHeight;
    private int resizeIntervalTicks;

    final void setFullscreenSize(int width, int height, int obfuscationGuard) {
        this.fullscreenWidth = width;
        this.fullscreenHeight = height;
        if (obfuscationGuard == -8717) {
          return;
        }
        this.applyContainerSize((byte) -71);
    }

    final static void a(byte param0, IntrusiveNode param1, IntrusiveNode param2) {
        try {
          if (param1.previous != null) {
            param1.unlink(-105);
          }
          param1.previous = param2.previous;
          if (param0 != -123) {
            field_a = (String) null;
          }
          param1.next = param2;
          param1.previous.next = param1;
          param1.next.previous = param1;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "fj.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void setContainerSize(int height, int width, int obfuscationGuard) {
        this.containerHeight = height;
        this.containerWidth = width;
        if (obfuscationGuard == -30514) {
          return;
        }
        this.minimumHeapMiB = 12;
    }

    final static void exitFullscreen(java.awt.Frame frame, PlatformTaskService platformService, int obfuscationGuard) {
        PlatformTask exitTask = null;
        int obfuscationControl = 0;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String frameDescription = null;
        StringBuilder contextWithFrame = null;
        String serviceDescription = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard != -2) {
            return;
          }
          while (true) {
            exitTask = platformService.exitFullscreenAsync((byte) -68, frame);
            while (exitTask.status == 0) {
              SpriteButtonPainter.a(10L, 0);
            }
            if (exitTask.status != 1) {
              SpriteButtonPainter.a(100L, 0);
              continue;
            }
            break;
          }
          frame.setVisible(false);
          frame.dispose();
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("fj.J(");
          if (frame == null) {
            frameDescription = "null";
          } else {
            frameDescription = "{...}";
          }
          contextWithFrame = ((StringBuilder) (Object) errorContext).append(frameDescription).append(',');
          if (platformService == null) {
            serviceDescription = "null";
          } else {
            serviceDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) contextWithFrame).append(serviceDescription).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    ViewportManager(ViewportResizeListener listener) {
        this(640, 480, 1280, 1024, 640, 480, 122, 16, listener);
    }

    final boolean acceptsDimensions(int width, int obfuscationGuard, int height) {
        if (obfuscationGuard != 122) {
          return false;
        }
        if (width < this.minimumWidth) {
          return false;
        }
        if (this.maximumWidth < width) {
          return false;
        }
        if (height < this.minimumHeight) {
          return false;
        }
        if (height > this.maximumHeight) {
          return false;
        }
        if (this.aspectRatio == 0.0f) {
          return true;
        }
        if (Math.round(this.aspectRatio * (float)height) != width) {
          return false;
        }
        return true;
    }

    final boolean canResize(byte obfuscationGuard) {
        if (obfuscationGuard != 103) {
          this.advanceViewport(-97);
          if (this.minimumHeapMiB > hq.maximumHeapMiB) {
            return false;
          }
          if (LoginForm.memberEntitlementValue > 0) {
            return true;
          }
          return false;
        }
        if (this.minimumHeapMiB > hq.maximumHeapMiB) {
          return false;
        }
        if (LoginForm.memberEntitlementValue > 0) {
          return true;
        }
        return false;
    }

    final void restoreViewport(int obfuscationGuard) {
        this.listener.viewportResized(this.savedHeight, -32263, this.savedWidth);
        if (obfuscationGuard >= 114) {
          return;
        }
        this.savedHeight = -64;
    }

    final static void detachKeyboard(java.awt.Component component, byte obfuscationGuard) {
        try {
          if (obfuscationGuard != 35) {
            IntrusiveNode var3 = (IntrusiveNode) null;
            ViewportManager.$cfr$intArgs$a$f94c566f195c(-121, (IntrusiveNode) null, (IntrusiveNode) null);
          }
          component.removeKeyListener(QuickChatCategory.keyboardListener);
          component.removeFocusListener(QuickChatCategory.keyboardListener);
          us.keyStateWriteIndex = -1;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "fj.D(" + (component != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    final boolean isResizeBlockedByHeap(byte obfuscationGuard) {
        if (obfuscationGuard <= 38) {
          field_w = (String) null;
          if (LoginForm.memberEntitlementValue <= 0) {
            return false;
          }
          if (this.minimumHeapMiB > hq.maximumHeapMiB) {
            return true;
          }
          return false;
        }
        if (LoginForm.memberEntitlementValue <= 0) {
          return false;
        }
        if (this.minimumHeapMiB > hq.maximumHeapMiB) {
          return true;
        }
        return false;
    }

    final void advanceViewport(int obfuscationGuard) {
        int remainingCountdown = 0;
        if (null != FixedQuaternion.fullscreenCanvas) {
          return;
        }
        if (LoginForm.memberEntitlementValue <= 0) {
          this.resizeEnabled = false;
        }
        if (this.resizeEnabled) {
          remainingCountdown = this.resizeCountdown - 1;
          this.resizeCountdown = this.resizeCountdown - 1;
          if (remainingCountdown > 0) {
            return;
          }
          this.resizeCountdown = this.resizeIntervalTicks;
          if (this.minimumHeapMiB > hq.maximumHeapMiB) {
            this.resizeEnabled = false;
          } else {
            if (obfuscationGuard != 0) {
              this.savedWidth = 67;
            }
            this.applyContainerSize((byte) 56);
          }
          return;
        }
        if (bn.viewportWidth < this.containerWidth) {
          DualNodeIterator.canvasOffsetX = (this.containerWidth - bn.viewportWidth) / 2;
        } else {
          if (this.containerWidth > 0) {
            DualNodeIterator.canvasOffsetX = 0;
          }
        }
        if (bn.viewportWidth == this.fixedWidth &&
          dt.viewportHeight == this.fixedHeight) {
          return;
        }
        this.listener.viewportResized(this.fixedHeight, -32263, this.fixedWidth);
    }

    final FullscreenFocusCanvas enterFullscreen(int obfuscationGuard) {
        FullscreenFocusCanvas fullscreen = null;
        FullscreenFocusCanvas canonicalFullscreen;
        this.savedHeight = dt.viewportHeight;
        if (obfuscationGuard != -1) {
          ViewportManager.b((byte) -86);
          this.savedWidth = bn.viewportWidth;
          this.listener.viewportResized(this.fullscreenHeight, obfuscationGuard ^ 32262, this.fullscreenWidth);
          tq.canvasRebuildRequested = false;
          fullscreen = dj.openFullscreenCanvas(this.fullscreenWidth, 0, IntPair.field_m, -71, 0, this.fullscreenHeight);
          if (fullscreen == null) {
            this.restoreViewport(124);
            return fullscreen;
          }
          return fullscreen;
        }
        this.savedWidth = bn.viewportWidth;
        this.listener.viewportResized(this.fullscreenHeight, obfuscationGuard ^ 32262, this.fullscreenWidth);
        tq.canvasRebuildRequested = false;
        canonicalFullscreen = dj.openFullscreenCanvas(this.fullscreenWidth, 0, IntPair.field_m, -71, 0, this.fullscreenHeight);
        if (canonicalFullscreen != null) {
          return canonicalFullscreen;
        }
        this.restoreViewport(124);
        return canonicalFullscreen;
    }

    public static void b(byte param0) {
        int var1 = -107 / ((57 - param0) / 47);
        field_q = null;
        field_a = null;
        field_w = null;
        field_d = null;
        field_u = null;
    }

    private final void applyContainerSize(byte obfuscationGuard) {
        int candidateWidth;
        int candidateHeight;
        int aspectWidth;
        int obfuscationControl;
        int alternateHeight;
        int upperBoundAspectWidth;
        int lowerBoundAspectWidth;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        candidateWidth = this.containerWidth;
        if (obfuscationGuard == 56) {
          candidateHeight = this.containerHeight;
          if (!this.canResize((byte) 103)) {
            this.resizeEnabled = false;
            return;
          }
          if (candidateWidth <= this.maximumWidth) {
            if (candidateWidth < this.minimumWidth) {
              candidateWidth = this.minimumWidth;
            }
          } else {
            candidateWidth = this.maximumWidth;
          }
          if (candidateHeight > this.maximumHeight) {
            candidateHeight = this.maximumHeight;
            if (0.0f < this.aspectRatio) {
              aspectWidth = (int)(this.aspectRatio * (float)candidateHeight + 0.5f);
              if (candidateWidth < aspectWidth) {
                candidateHeight = (int)((float)candidateWidth / this.aspectRatio);
              } else {
                if (aspectWidth < candidateWidth) {
                  candidateWidth = aspectWidth;
                }
              }
            }
          } else {
            if (this.minimumHeight > candidateHeight) {
              candidateHeight = this.minimumHeight;
            }
            if (0.0f < this.aspectRatio) {
              aspectWidth = (int)(this.aspectRatio * (float)candidateHeight + 0.5f);
              if (candidateWidth < aspectWidth) {
                candidateHeight = (int)((float)candidateWidth / this.aspectRatio);
              } else {
                if (aspectWidth < candidateWidth) {
                  candidateWidth = aspectWidth;
                }
              }
            }
          }
          if (bn.viewportWidth != candidateWidth) {
            this.listener.viewportResized(candidateHeight, -32263, candidateWidth);
          } else {
            if (dt.viewportHeight != candidateHeight) {
              this.listener.viewportResized(candidateHeight, -32263, candidateWidth);
            }
          }
          if (this.containerWidth <= 0) {
            return;
          }
          DualNodeIterator.canvasOffsetX = (-bn.viewportWidth + this.containerWidth) / 2;
          return;
        }
        this.fullscreenHeight = 17;
        alternateHeight = this.containerHeight;
        if (!this.canResize((byte) 103)) {
          this.resizeEnabled = false;
          return;
        }
        if (candidateWidth <= this.maximumWidth) {
          if (candidateWidth < this.minimumWidth) {
            candidateWidth = this.minimumWidth;
          }
        } else {
          candidateWidth = this.maximumWidth;
        }
        if (alternateHeight > this.maximumHeight) {
          alternateHeight = this.maximumHeight;
          if (0.0f < this.aspectRatio) {
            upperBoundAspectWidth = (int)(this.aspectRatio * (float)alternateHeight + 0.5f);
            if (candidateWidth < upperBoundAspectWidth) {
              alternateHeight = (int)((float)candidateWidth / this.aspectRatio);
            } else {
              if (upperBoundAspectWidth < candidateWidth) {
                candidateWidth = upperBoundAspectWidth;
              }
            }
          }
          if (bn.viewportWidth != candidateWidth ||
            dt.viewportHeight != alternateHeight) {
            this.listener.viewportResized(alternateHeight, -32263, candidateWidth);
          }
          if (this.containerWidth <= 0) {
            return;
          }
          DualNodeIterator.canvasOffsetX = (-bn.viewportWidth + this.containerWidth) / 2;
          return;
        }
        if (this.minimumHeight > alternateHeight) {
          alternateHeight = this.minimumHeight;
        }
        if (!(0.0f < this.aspectRatio)) {
          if (bn.viewportWidth != candidateWidth) {
            this.listener.viewportResized(alternateHeight, -32263, candidateWidth);
          } else {
            if (dt.viewportHeight != alternateHeight) {
              this.listener.viewportResized(alternateHeight, -32263, candidateWidth);
            }
          }
          if (this.containerWidth <= 0) {
            return;
          }
          DualNodeIterator.canvasOffsetX = (-bn.viewportWidth + this.containerWidth) / 2;
          return;
        }
        lowerBoundAspectWidth = (int)(this.aspectRatio * (float)alternateHeight + 0.5f);
        if (candidateWidth < lowerBoundAspectWidth) {
          alternateHeight = (int)((float)candidateWidth / this.aspectRatio);
        } else {
          if (lowerBoundAspectWidth < candidateWidth) {
            candidateWidth = lowerBoundAspectWidth;
          }
        }
        if (bn.viewportWidth != candidateWidth) {
          this.listener.viewportResized(alternateHeight, -32263, candidateWidth);
        } else {
          if (dt.viewportHeight != alternateHeight) {
            this.listener.viewportResized(alternateHeight, -32263, candidateWidth);
          }
        }
        if (this.containerWidth <= 0) {
          return;
        }
        DualNodeIterator.canvasOffsetX = (-bn.viewportWidth + this.containerWidth) / 2;
        return;
    }

    private ViewportManager(int minimumWidth, int minimumHeight, int maximumWidth, int maximumHeight, int fixedWidth, int fixedHeight, int minimumHeapMiB, int resizeIntervalTicks, ViewportResizeListener listener) {
        try {
          this.aspectRatio = 0.0f;
          this.listener = listener;
          this.fixedWidth = fixedWidth;
          this.maximumHeight = maximumHeight;
          this.maximumWidth = maximumWidth;
          this.fixedHeight = fixedHeight;
          this.minimumWidth = minimumWidth;
          this.resizeIntervalTicks = resizeIntervalTicks;
          this.minimumHeight = minimumHeight;
          this.fullscreenWidth = 640;
          this.fullscreenHeight = 480;
          this.resizeEnabled = false;
          this.minimumHeapMiB = minimumHeapMiB;
        } catch (RuntimeException failure) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failure), "fj.<init>(" + minimumWidth + ',' + minimumHeight + ',' + maximumWidth + ',' + maximumHeight + ',' + fixedWidth + ',' + fixedHeight + ',' + minimumHeapMiB + ',' + resizeIntervalTicks + ',' + (listener != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Back";
        field_w = "More memory is required to run in different resolutions. Try updating your version of Java or changing your Java settings.";
        field_q = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_u = "Spells of great power to cause harm to your enemies.";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$f94c566f195c(int param0, IntrusiveNode param1, IntrusiveNode param2) {
        try {
          if (param1.previous != null) {
            param1.unlink(-105);
          }
          param1.previous = param2.previous;
          if (param0 != -123) {
            field_a = (String) null;
          }
          param1.next = param2;
          param1.previous.next = param1;
          param1.next.previous = param1;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "fj.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }
}
