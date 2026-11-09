/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class GameApplet extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    boolean fatalErrorReported;
    static int field_l;
    static float[] field_e;
    public static boolean field_o;
    public static boolean field_p;
    public static boolean field_k;
    public static boolean field_m;
    public static int field_h;
    public static int field_i;
    public static boolean field_b;
    public static boolean field_a;
    public static boolean field_g;
    public static boolean field_f;
    public static int field_j;
    public static int field_c;
    public static int field_n;

    public static void releaseStatics(byte guard) {
        try {
          field_e = null;
          if (guard != -19) {
            field_l = -112;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "kc.B(" + guard + ')');
        }
    }

    public final String getParameter(String param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (PrimitiveType.field_c != null) {
            stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          if (OpenGlShader.field_c != null &&
            this != OpenGlShader.field_c) {
            stackIn_8_0 = OpenGlShader.field_c.getParameter(param0);
            return stackIn_8_0;
          }
          stackIn_10_0 = super.getParameter(param0);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("kc.getParameter(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          OpenGlShader.field_c = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("kc.provideLoaderApplet(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        java.applet.AppletContext stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (PrimitiveType.field_c != null) {
            stackIn_4_0 = null;
            return (java.applet.AppletContext) (stackIn_4_0);
          }
          if (OpenGlShader.field_c != null &&
            OpenGlShader.field_c != this) {
            stackIn_10_0 = OpenGlShader.field_c.getAppletContext();
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getAppletContext();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var1), "kc.getAppletContext()");
        }
    }

    abstract void updateGame(int param0);

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    private final void shutdownApplet(boolean clean, int guard) {
        Exception exception = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        int var3_int = 0;
        Throwable decompiledCaughtException = null;
        Object var3_ref = null;
        Throwable var3_ref2 = null;
        try {
          var3_ref = this;
          synchronized (var3_ref) {
            if (LegacyOpenGlShoreWaveWaterEffect.field_e) {
              return;
            }
            LegacyOpenGlShoreWaveWaterEffect.field_e = true;
          }
          if (null != OpenGlShader.field_c) {
            OpenGlShader.field_c.destroy();
          }
          try {
            this.shutdownGameResources(-15254);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          if (null != NineSlicePanel.field_f) {
            try {
              NineSlicePanel.field_f.removeFocusListener((java.awt.event.FocusListener) (this));
              NineSlicePanel.field_f.getParent().remove((java.awt.Component) ((Object) NineSlicePanel.field_f));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (FourIntUpdateRequest.platformDispatcher != null) {
            try {
              FourIntUpdateRequest.platformDispatcher.shutdown(false);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          this.releaseAllStatics(true);
          if (PrimitiveType.field_c != null) {
            try {
              System.exit(0);
            } catch (java.lang.Throwable decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              var3_ref2 = decompiledCaughtException;
            }
          }
          var3_int = 34 / ((guard - 14) / 33);
          System.out.println("Shutdown complete - clean:" + clean);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "kc.N(" + clean + ',' + guard + ')');
        }
    }

    abstract void initializeGame(int param0);

    final static void pushRasterState(int guard) {
        RasterStateFrame var1 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        try {
          if (guard < 40) {
            GameApplet.provideLoaderApplet((java.applet.Applet) null);
          }
          var1 = (RasterStateFrame) (PointLight.recycledRasterFrames.removeLast((byte) -127));
          if (var1 == null) {
            var1 = new RasterStateFrame();
          }
          var1.set(SoftwareRasterizer.width, SoftwareRasterizer.height, SoftwareRasterizer.pixels, SoftwareRasterizer.clipRight, (byte) -94, SoftwareRasterizer.clipTop, SoftwareRasterizer.clipLeft, SoftwareRasterizer.clipBottom);
          IntrusiveNodeHashTable.field_g.addLast((IntrusiveNode) (var1), (byte) 39);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var1_ref), "kc.M(" + guard + ')');
        }
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        java.awt.Rectangle var2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          if (AppletInstanceState.activeApplet == this &&
            !LegacyOpenGlShoreWaveWaterEffect.field_e) {
            CubeMapSource.field_a = true;
            if (DroneWaveDefinition.field_l &&
              -LegacyCubeMapSource.field_f + IntroMeshResources.monotonicTimeMillis(-97) > 1000L) {
              var2 = param0.getClipBounds();
              if (null != var2) {
                if (var2.width < AccountPacketReader.field_b) {
                  return;
                }
                if (var2.height < CanvasResizeState.minimumCanvasHeight) {
                  return;
                }
              }
              DroneDebris.field_A = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_21_0 = var2_ref;
          stackIn_21_1 = new StringBuilder().append("kc.paint(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          SpriteStripButtonRenderer.field_o = true;
          CubeMapSource.field_a = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("kc.focusGained(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final boolean allowStartup(int unused) {
        return true;
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (PrimitiveType.field_c != null) {
          return null;
        }
        if (null != OpenGlShader.field_c &&
          this != OpenGlShader.field_c) {
          return OpenGlShader.field_c.getCodeBase();
        }
        return super.getCodeBase();
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          SpriteStripButtonRenderer.field_o = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("kc.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    final void startApplet(int cacheId, int height, byte guard, int width, int gameCrc, String cacheName, int cacheIndexCount) {
        try {
          PlatformTaskDispatcher dupTemp$0 = null;
          RuntimeException stackIn_25_0 = null;
          StringBuilder stackIn_25_1 = null;
          String stackIn_26_2 = null;
          Throwable decompiledCaughtException = null;
          PlatformTask var8 = null;
          Throwable var8_ref = null;
          RuntimeException var8_ref2 = null;
          int var9 = 0;
          var9 = Sumoblitz.field_L ? 1 : 0;
          try {
            try {
              if (AppletInstanceState.activeApplet != null) {
                AchievementThresholds.field_a = AchievementThresholds.field_a + 1;
                if (AchievementThresholds.field_a >= 3) {
                  this.showFatalError("alreadyloaded", 21253);
                  return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
              }
              if (guard != 44) {
                return;
              }
              AppletInstanceState.activeApplet = this;
              UnderageAccountInfoPanel.field_H = 0;
              SpriteState.field_s = gameCrc;
              LegacyOpenGlRidgedWaterEffect.field_h = width;
              AccountPacketReader.field_b = width;
              DirectByteArrayStorage.field_c = 0;
              IntroMeshResources.canvasHeight = height;
              CanvasResizeState.minimumCanvasHeight = height;
              HardwareRidgedWaterNoise.field_z = LegacyOpenGlUnlitEffect.activeApplet(2);
              dupTemp$0 = new PlatformTaskDispatcher(cacheId, cacheName, cacheIndexCount, true);
              FourIntUpdateRequest.platformDispatcher = dupTemp$0;
              CompactMeshGeometry.field_O = dupTemp$0;
              var8 = FourIntUpdateRequest.platformDispatcher.startThread(true, (Runnable) (this), 1);
              while (true) {
                if (var8.status == 0) {
                  TextureCombineOperation.sleepMillis(10L, (byte) 73);
                  if (var9 == 0) {
                    continue;
                  }
                }
                break;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8_ref = decompiledCaughtException;
              IntrusiveNode.reportClientError((String) null, var8_ref, 0);
              this.showFatalError("crash", 21253);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var8_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_25_0 = var8_ref2;
            stackIn_25_1 = new StringBuilder().append("kc.P(").append(cacheId).append(',').append(height).append(',').append(guard).append(',').append(width).append(',').append(gameCrc).append(',');
            if (cacheName == null) {
              stackIn_26_2 = "null";
            } else {
              stackIn_26_2 = "{...}";
            }
            throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(cacheIndexCount).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.net.URL stackIn_10_0 = null;
        java.net.URL stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != PrimitiveType.field_c) {
            stackIn_4_0 = null;
            return (java.net.URL) (stackIn_4_0);
          }
          if (OpenGlShader.field_c != null &&
            OpenGlShader.field_c != this) {
            stackIn_10_0 = OpenGlShader.field_c.getDocumentBase();
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getDocumentBase();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var1), "kc.getDocumentBase()");
        }
    }

    public final void stop() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this == AppletInstanceState.activeApplet &&
            !LegacyOpenGlShoreWaveWaterEffect.field_e) {
            NanoTickClock.field_k = 4000L + IntroMeshResources.monotonicTimeMillis(-46);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "kc.stop()");
        }
    }

    private final void renderFrameTick(int guard) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        int var6_int = 0;
        java.awt.Insets var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_long = IntroMeshResources.monotonicTimeMillis(-126);
          var4 = Js5Client.field_k[CacheIoRequest.field_B];
          Js5Client.field_k[CacheIoRequest.field_B] = var2_long;
          if (var4 != (long)guard &&
            var4 < var2_long) {
            var6_int = (int)(var2_long - var4);
            DroneDebris.field_B = (32000 + (var6_int >> 1)) / var6_int;
          }
          CacheIoRequest.field_B = 1 + CacheIoRequest.field_B & 31;
          fieldTemp$1 = ArchiveProvider.field_b;
          ArchiveProvider.field_b = ArchiveProvider.field_b + 1;
          if (fieldTemp$1 > 50) {
            ArchiveProvider.field_b = ArchiveProvider.field_b - 50;
            CubeMapSource.field_a = true;
            NineSlicePanel.field_f.setSize(LegacyOpenGlRidgedWaterEffect.field_h, IntroMeshResources.canvasHeight);
            NineSlicePanel.field_f.setVisible(true);
            if (null != PrimitiveType.field_c &&
              null == HiscoreRequest.field_n) {
              var6 = PrimitiveType.field_c.getInsets();
              NineSlicePanel.field_f.setLocation(var6.left + UnderageAccountInfoPanel.field_H, var6.top + DirectByteArrayStorage.field_c);
              if (Sumoblitz.field_L) {
                NineSlicePanel.field_f.setLocation(UnderageAccountInfoPanel.field_H, DirectByteArrayStorage.field_c);
              }
            } else {
              NineSlicePanel.field_f.setLocation(UnderageAccountInfoPanel.field_H, DirectByteArrayStorage.field_c);
            }
          }
          this.renderFrame(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "kc.A(" + guard + ')');
        }
    }

    abstract void renderFrame(int param0);

    private final void updateGameTick(byte guard) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        try {
          var2_long = IntroMeshResources.monotonicTimeMillis(-66);
          var4 = AppletTickHistory.tickTimes[RenderBufferSet.tickHistoryIndex];
          AppletTickHistory.tickTimes[RenderBufferSet.tickHistoryIndex] = var2_long;
          RenderBufferSet.tickHistoryIndex = RenderBufferSet.tickHistoryIndex + 1 & 31;
          if (var4 != 0L &&
            var4 >= var2_long) {
          }
          var6 = this;
          synchronized (var6) {
            if (guard < 95) {
              field_e = (float[]) null;
            }
            AppletFocusState.focused = SpriteStripButtonRenderer.field_o;
          }
          this.updateGame(-64);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "kc.J(" + guard + ')');
        }
    }

    abstract void shutdownGameResources(int guard);

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (AppletInstanceState.activeApplet == this &&
            !LegacyOpenGlShoreWaveWaterEffect.field_e) {
            NanoTickClock.field_k = IntroMeshResources.monotonicTimeMillis(-125);
            TextureCombineOperation.sleepMillis(5000L, (byte) 119);
            CompactMeshGeometry.field_O = null;
            this.shutdownApplet(false, -32);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "kc.destroy()");
        }
    }

    public final void update(java.awt.Graphics param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.paint(param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("kc.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void start() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (AppletInstanceState.activeApplet == this &&
            !LegacyOpenGlShoreWaveWaterEffect.field_e) {
            NanoTickClock.field_k = 0L;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "kc.start()");
        }
    }

    final synchronized void replaceCanvas(int guard) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (NineSlicePanel.field_f != null) {
            NineSlicePanel.field_f.removeFocusListener((java.awt.event.FocusListener) (this));
            NineSlicePanel.field_f.getParent().setBackground(java.awt.Color.black);
            NineSlicePanel.field_f.getParent().remove((java.awt.Component) ((Object) NineSlicePanel.field_f));
          }
          if (null == HiscoreRequest.field_n) {
            if (PrimitiveType.field_c == null) {
              if (null != OpenGlShader.field_c) {
                var2 = OpenGlShader.field_c;
                if (var4 != 0) {
                  var2 = AppletInstanceState.activeApplet;
                  var2 = PrimitiveType.field_c;
                  var2 = HiscoreRequest.field_n;
                }
              } else {
                var2 = AppletInstanceState.activeApplet;
                if (var4 != 0) {
                  var2 = PrimitiveType.field_c;
                  var2 = HiscoreRequest.field_n;
                }
              }
            } else {
              var2 = PrimitiveType.field_c;
              if (var4 != 0) {
                var2 = HiscoreRequest.field_n;
              }
            }
          } else {
            var2 = HiscoreRequest.field_n;
          }
          ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
          NineSlicePanel.field_f = (java.awt.Canvas) ((Object) new DelegatingCanvas((java.awt.Component) (this)));
          ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) NineSlicePanel.field_f));
          NineSlicePanel.field_f.setSize(LegacyOpenGlRidgedWaterEffect.field_h, IntroMeshResources.canvasHeight);
          NineSlicePanel.field_f.setVisible(true);
          boolean decompiledSharedTail0 = (PrimitiveType.field_c == var2);
          if (!decompiledSharedTail0) {
            NineSlicePanel.field_f.setLocation(UnderageAccountInfoPanel.field_H, DirectByteArrayStorage.field_c);
            decompiledSharedTail0 = (var4 != 0);
          }
          if (decompiledSharedTail0) {
            var3 = PrimitiveType.field_c.getInsets();
            NineSlicePanel.field_f.setLocation(var3.left + UnderageAccountInfoPanel.field_H, var3.top + DirectByteArrayStorage.field_c);
          }
          NineSlicePanel.field_f.addFocusListener((java.awt.event.FocusListener) (this));
          NineSlicePanel.field_f.requestFocus();
          AppletFocusState.focused = true;
          SpriteStripButtonRenderer.field_o = true;
          CubeMapSource.field_a = true;
          if (guard != 1000) {
            return;
          }
          DroneDebris.field_A = false;
          LegacyCubeMapSource.field_f = IntroMeshResources.monotonicTimeMillis(guard ^ -912);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) (var2), "kc.H(" + guard + ')');
        }
    }

    public final void windowClosing(java.awt.event.WindowEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.destroy();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("kc.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final static byte[] encodeSavedProgress(int guard) {
        PacketBuffer var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        byte[] stackIn_3_0 = null;
        byte[] stackIn_16_0 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (guard != -5204) {
            stackIn_3_0 = (byte[]) null;
            return stackIn_3_0;
          }
          var1 = new PacketBuffer(30000);
          var1.writeByte((byte) 117, 3);
          var1.writeByte((byte) 90, ToolkitRasterStateFrame.field_e);
          var1.writeByte((byte) 46, ResourceArchive.selectedSpeedLevel);
          var1.writeByte((byte) 39, LegacyOpenGlEffectManager.selectedTractionLevel);
          var1.writeByte((byte) 52, AccountStatusDialogState.selectedBounceLevel);
          var2 = 0;
          while (36 > var2) {
            if (var2 < 25) {
              var1.writeMedium(OpenGlTexture3D.field_j[var2], 112);
              var1.writeShort(-58, CacheIoRequest.field_z[var2]);
              var3 = CacheIoRequest.field_A[var2] + 1;
              if (NineSlicePanel.field_d[var2]) {
                var3 = var3 | 128;
              }
              if (IntroMeshProjection.threeLifeCompletions[var2]) {
                var3 = var3 | 64;
              }
              var1.writeByte((byte) 105, var3);
            }
            var2++;
            if (var4 == 0) {
              continue;
            }
            break;
          }
          stackIn_16_0 = var1.copyWrittenBytes((byte) 120);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var1_ref), "kc.F(" + guard + ')');
        }
    }

    public abstract void init();

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    final void showFatalError(String errorCode, int guard) {
        try {
          Throwable throwable = null;
          Exception exception = null;
          RuntimeException runtimeException = null;
          RuntimeException stackIn_16_0 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (this.fatalErrorReported) {
              return;
            }
            this.fatalErrorReported = true;
            System.out.println("error_game_" + errorCode);
            try {
              BrowserScriptBridge.call(LegacyOpenGlUnlitEffect.activeApplet(2), guard ^ -21354, "loggedout");
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              throwable = decompiledCaughtException;
            }
            try {
              this.getAppletContext().showDocument(new java.net.URL(this.getCodeBase(), "error_game_" + errorCode + ".ws"), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
            if (guard != 21253) {
              field_l = -65;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            runtimeException = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_16_0 = runtimeException;
            stackIn_16_1 = new StringBuilder().append("kc.K(");
            if (errorCode == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(guard).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    protected GameApplet() {
        this.fatalErrorReported = false;
    }

    public final void run() {
        try {
          boolean stackIn_68_0 = false;
          int stackIn_84_0 = 0;
          int stackIn_84_1 = 0;
          int stackIn_105_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var1 = null;
          int var1_int = 0;
          String var2 = null;
          int var2_int = 0;
          java.lang.reflect.Method var2_ref = null;
          int var3 = 0;
          Throwable var3_ref_Throwable = null;
          String var4 = null;
          int var5 = 0;
          var5 = Sumoblitz.field_L ? 1 : 0;
          try {
            try {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              if (PlatformTaskDispatcher.field_u != null) {
                var1 = PlatformTaskDispatcher.field_u.toLowerCase();
                if (-1 != ((String) (var1)).indexOf("sun") ||
                  -1 != ((String) (var1)).indexOf("apple")) {
                  var2 = PlatformTaskDispatcher.field_q;
                  if (var2.equals("1.1") ||
                    var2.startsWith("1.1.") ||
                    var2.equals("1.2") ||
                    var2.startsWith("1.2.") ||
                    var2.equals("1.3") ||
                    var2.startsWith("1.3.") ||
                    var2.equals("1.4") ||
                    var2.startsWith("1.4.") ||
                    var2.equals("1.5") ||
                    var2.startsWith("1.5.") ||
                    var2.equals("1.6.0")) {
                    this.showFatalError("wrongjava", 21253);
                    decompiledFrameRemainder3 = (var5 != 0);
                  }
                  if ((decompiledFrameRemainder3) &&
                    (var2.startsWith("1.6.0_"))) {
                    var3 = 6;
                    while (var3 < var2.length()) {
                      stackIn_68_0 = AccountUiBootstrap.isAsciiDigit((byte) -54, var2.charAt(var3));
                      if (var5 != 0) {
                        decompiledFrameCompleted0 = false;
                        break;
                      }
                      if (stackIn_68_0) {
                        var3++;
                        continue;
                      }
                      break;
                    }
                    if (decompiledFrameCompleted0) {
                      var4 = var2.substring(6, var3);
                      if (ContentTransitionPhase.isDecimalInteger(-13181, (CharSequence) ((Object) var4)) &&
                        !(10 <= LoginFormState.parseDecimal((byte) -128, (CharSequence) ((Object) var4)))) {
                        this.showFatalError("wrongjava", 21253);
                        decompiledFrameRemainder3 = (var5 != 0);
                      }
                    }
                  }
                }
              }
              if (((decompiledFrameRemainder3) && (decompiledFrameCompleted0)) &&
                (decompiledFrameRemainder2 = (null != PlatformTaskDispatcher.field_q))) {
                stackIn_68_0 = PlatformTaskDispatcher.field_q.startsWith("1.");
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (stackIn_68_0)) {
                var1_int = 2;
                var2_int = 0;
                while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (var1_int < PlatformTaskDispatcher.field_q.length()) {
                    var3 = PlatformTaskDispatcher.field_q.charAt(var1_int);
                    stackIn_84_0 = 48;
                    stackIn_84_1 = var3;
                    decompiledFrameRemainder1 = (var5 == 0);
                    if ((decompiledFrameRemainder1) && (stackIn_84_0 <= stackIn_84_1 && (var3 <= 57 ||
                      var5 != 0))) {
                      var2_int = var3 - (48 - 10 * var2_int);
                      var1_int++;
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    stackIn_84_0 = -6;
                    stackIn_84_1 = ~var2_int;
                  }
                  if (stackIn_84_0 < stackIn_84_1) {
                    break;
                  }
                  DroneWaveDefinition.field_l = true;
                  break;
                }
              }
              if (decompiledFrameRemainder3) {
                var1 = AppletInstanceState.activeApplet;
                if (OpenGlShader.field_c != null) {
                  var1 = OpenGlShader.field_c;
                }
                var2_ref = PlatformTaskDispatcher.field_e;
                if (null != var2_ref) {
                  try {
                    var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3_ref_Throwable = decompiledCaughtException;
                  }
                }
                CompactMeshGeometry.refreshMaxHeapMiB(true);
                this.replaceCanvas(1000);
                ProgressDialog.field_R = SoftLruCache.a(IntroMeshResources.canvasHeight, LegacyOpenGlRidgedWaterEffect.field_h, 0, (java.awt.Component) ((Object) NineSlicePanel.field_f));
                this.initializeGame(28196);
                HardwareQuadBatchBuffers.field_a = LegacyCubeMapSource.createTickClock(false);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (NanoTickClock.field_k != 0L) {
                    stackIn_105_0 = compareLongs(~IntroMeshResources.monotonicTimeMillis(-122), ~NanoTickClock.field_k);
                    decompiledFrameRemainder0 = (var5 == 0);
                    if ((decompiledFrameRemainder0) &&
                      (stackIn_105_0 <= 0)) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    BurstParticle.field_t = HardwareQuadBatchBuffers.field_a.waitAndAdvance(4007, DualLinkNode.field_p);
                    stackIn_105_0 = 0;
                  }
                  var3 = stackIn_105_0;
                  do {
                    if (!(BurstParticle.field_t > var3)) {
                      this.renderFrameTick(0);
                      ReflectionCheck.postDummyEventAfterQueueWait(NineSlicePanel.field_f, FourIntUpdateRequest.platformDispatcher, -11030);
                      break;
                    }
                    this.updateGameTick((byte) 101);
                    var3++;
                  } while (var5 == 0);
                } while (var5 == 0);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = decompiledCaughtException;
              IntrusiveNode.reportClientError((String) null, (Throwable) (var1), 0);
              this.showFatalError("crash", 21253);
            }
            this.shutdownApplet(true, -99);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw ClientExceptionSupport.wrapWithContext((Throwable) (var1), "kc.run()");
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean isNameAvailabilityPending(int guard) {
        int var1_int = 0;
        RuntimeException var1 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          var1_int = -117 / ((guard + 43) / 61);
          stackIn_4_0 = (Base37NameAlphabet.nameAvailabilityState == LegacyOpenGlGraphicsHeap.PENDING);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var1), "kc.O(" + guard + ')');
        }
    }

    abstract void releaseAllStatics(boolean param0);

    static {
        field_e = new float[4];
    }

    private static int compareLongs(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
