/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class GameApplet extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    boolean field_d;
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

    public static void b(byte param0) {
        try {
          field_e = null;
          if (param0 != -19) {
            field_l = -112;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "kc.B(" + param0 + ')');
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

    private final void a(boolean param0, int param1) {
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
          if (lt.field_m != null) {
            try {
              lt.field_m.a(false);
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
          var3_int = 34 / ((param1 - 14) / 33);
          System.out.println("Shutdown complete - clean:" + param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "kc.N(" + param0 + ',' + param1 + ')');
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
          var1 = (RasterStateFrame) (ko.field_m.removeLast((byte) -127));
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
          if (ke.field_a == this &&
            !LegacyOpenGlShoreWaveWaterEffect.field_e) {
            pt.field_a = true;
            if (DroneWaveDefinition.field_l &&
              -bt.field_f + wq.monotonicTimeMillis(-97) > 1000L) {
              var2 = param0.getClipBounds();
              if (null != var2) {
                if (var2.width < vs.field_b) {
                  return;
                }
                if (var2.height < lw.field_b) {
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
          pt.field_a = true;
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

    final boolean i(int param0) {
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

    final void a(int param0, int param1, byte param2, int param3, int param4, String param5, int param6) {
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
              if (ke.field_a != null) {
                ps.field_a = ps.field_a + 1;
                if (ps.field_a >= 3) {
                  this.a("alreadyloaded", 21253);
                  return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
              }
              if (param2 != 44) {
                return;
              }
              ke.field_a = this;
              UnderageAccountInfoPanel.field_H = 0;
              SpriteState.field_s = param4;
              LegacyOpenGlRidgedWaterEffect.field_h = param3;
              vs.field_b = param3;
              DirectByteArrayStorage.field_c = 0;
              wq.field_b = param1;
              lw.field_b = param1;
              HardwareRidgedWaterNoise.field_z = LegacyOpenGlUnlitEffect.c(2);
              dupTemp$0 = new PlatformTaskDispatcher(param0, param5, param6, true);
              lt.field_m = dupTemp$0;
              CompactMeshGeometry.field_O = dupTemp$0;
              var8 = lt.field_m.a(true, (Runnable) (this), 1);
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
              this.a("crash", 21253);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var8_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_25_0 = var8_ref2;
            stackIn_25_1 = new StringBuilder().append("kc.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            if (param5 == null) {
              stackIn_26_2 = "null";
            } else {
              stackIn_26_2 = "{...}";
            }
            throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param6).append(')').toString());
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
          if (this == ke.field_a &&
            !LegacyOpenGlShoreWaveWaterEffect.field_e) {
            NanoTickClock.field_k = 4000L + wq.monotonicTimeMillis(-46);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "kc.stop()");
        }
    }

    private final void h(int param0) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        int var6_int = 0;
        java.awt.Insets var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_long = wq.monotonicTimeMillis(-126);
          var4 = Js5Client.field_k[CacheIoRequest.field_B];
          Js5Client.field_k[CacheIoRequest.field_B] = var2_long;
          if (var4 != (long)param0 &&
            var4 < var2_long) {
            var6_int = (int)(var2_long - var4);
            DroneDebris.field_B = (32000 + (var6_int >> 1)) / var6_int;
          }
          CacheIoRequest.field_B = 1 + CacheIoRequest.field_B & 31;
          fieldTemp$1 = ArchiveProvider.field_b;
          ArchiveProvider.field_b = ArchiveProvider.field_b + 1;
          if (fieldTemp$1 > 50) {
            ArchiveProvider.field_b = ArchiveProvider.field_b - 50;
            pt.field_a = true;
            NineSlicePanel.field_f.setSize(LegacyOpenGlRidgedWaterEffect.field_h, wq.field_b);
            NineSlicePanel.field_f.setVisible(true);
            if (null != PrimitiveType.field_c &&
              null == of.field_n) {
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
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "kc.A(" + param0 + ')');
        }
    }

    abstract void renderFrame(int param0);

    private final void a(byte param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        try {
          var2_long = wq.monotonicTimeMillis(-66);
          var4 = fa.field_a[ka.field_b];
          fa.field_a[ka.field_b] = var2_long;
          ka.field_b = ka.field_b + 1 & 31;
          if (var4 != 0L &&
            var4 >= var2_long) {
          }
          var6 = this;
          synchronized (var6) {
            if (param0 < 95) {
              field_e = (float[]) null;
            }
            ii.field_a = SpriteStripButtonRenderer.field_o;
          }
          this.updateGame(-64);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "kc.J(" + param0 + ')');
        }
    }

    abstract void shutdownGameResources(int guard);

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ke.field_a == this &&
            !LegacyOpenGlShoreWaveWaterEffect.field_e) {
            NanoTickClock.field_k = wq.monotonicTimeMillis(-125);
            TextureCombineOperation.sleepMillis(5000L, (byte) 119);
            CompactMeshGeometry.field_O = null;
            this.a(false, -32);
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
          if (ke.field_a == this &&
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

    final synchronized void e(int param0) {
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
          if (null == of.field_n) {
            if (PrimitiveType.field_c == null) {
              if (null != OpenGlShader.field_c) {
                var2 = OpenGlShader.field_c;
                if (var4 != 0) {
                  var2 = ke.field_a;
                  var2 = PrimitiveType.field_c;
                  var2 = of.field_n;
                }
              } else {
                var2 = ke.field_a;
                if (var4 != 0) {
                  var2 = PrimitiveType.field_c;
                  var2 = of.field_n;
                }
              }
            } else {
              var2 = PrimitiveType.field_c;
              if (var4 != 0) {
                var2 = of.field_n;
              }
            }
          } else {
            var2 = of.field_n;
          }
          ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
          NineSlicePanel.field_f = (java.awt.Canvas) ((Object) new DelegatingCanvas((java.awt.Component) (this)));
          ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) NineSlicePanel.field_f));
          NineSlicePanel.field_f.setSize(LegacyOpenGlRidgedWaterEffect.field_h, wq.field_b);
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
          ii.field_a = true;
          SpriteStripButtonRenderer.field_o = true;
          pt.field_a = true;
          if (param0 != 1000) {
            return;
          }
          DroneDebris.field_A = false;
          bt.field_f = wq.monotonicTimeMillis(param0 ^ -912);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) (var2), "kc.H(" + param0 + ')');
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

    final static byte[] c(int param0) {
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
          if (param0 != -5204) {
            stackIn_3_0 = (byte[]) null;
            return stackIn_3_0;
          }
          var1 = new PacketBuffer(30000);
          var1.writeByte((byte) 117, 3);
          var1.writeByte((byte) 90, ToolkitRasterStateFrame.field_e);
          var1.writeByte((byte) 46, ResourceArchive.field_f);
          var1.writeByte((byte) 39, LegacyOpenGlEffectManager.field_i);
          var1.writeByte((byte) 52, hc.field_f);
          var2 = 0;
          while (36 > var2) {
            if (var2 < 25) {
              var1.writeMedium(OpenGlTexture3D.field_j[var2], 112);
              var1.writeShort(-58, CacheIoRequest.field_z[var2]);
              var3 = CacheIoRequest.field_A[var2] + 1;
              if (NineSlicePanel.field_d[var2]) {
                var3 = var3 | 128;
              }
              if (up.field_g[var2]) {
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
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var1_ref), "kc.F(" + param0 + ')');
        }
    }

    public abstract void init();

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    final void a(String param0, int param1) {
        try {
          Throwable throwable = null;
          Exception exception = null;
          RuntimeException runtimeException = null;
          RuntimeException stackIn_16_0 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (this.field_d) {
              return;
            }
            this.field_d = true;
            System.out.println("error_game_" + param0);
            try {
              BrowserScriptBridge.call(LegacyOpenGlUnlitEffect.c(2), param1 ^ -21354, "loggedout");
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              throwable = decompiledCaughtException;
            }
            try {
              this.getAppletContext().showDocument(new java.net.URL(this.getCodeBase(), "error_game_" + param0 + ".ws"), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
            if (param1 != 21253) {
              field_l = -65;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            runtimeException = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_16_0 = runtimeException;
            stackIn_16_1 = new StringBuilder().append("kc.K(");
            if (param0 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
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
        this.field_d = false;
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
                    this.a("wrongjava", 21253);
                    decompiledFrameRemainder3 = (var5 != 0);
                  }
                  if ((decompiledFrameRemainder3) &&
                    (var2.startsWith("1.6.0_"))) {
                    var3 = 6;
                    while (var3 < var2.length()) {
                      stackIn_68_0 = ea.a((byte) -54, var2.charAt(var3));
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
                      if (ContentTransitionPhase.a(-13181, (CharSequence) ((Object) var4)) &&
                        !(10 <= no.a((byte) -128, (CharSequence) ((Object) var4)))) {
                        this.a("wrongjava", 21253);
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
                var1 = ke.field_a;
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
                CompactMeshGeometry.b(true);
                this.e(1000);
                ProgressDialog.field_R = SoftLruCache.a(wq.field_b, LegacyOpenGlRidgedWaterEffect.field_h, 0, (java.awt.Component) ((Object) NineSlicePanel.field_f));
                this.initializeGame(28196);
                jl.field_a = bt.createTickClock(false);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (NanoTickClock.field_k != 0L) {
                    stackIn_105_0 = $cfr$lcmp(~wq.monotonicTimeMillis(-122), ~NanoTickClock.field_k);
                    decompiledFrameRemainder0 = (var5 == 0);
                    if ((decompiledFrameRemainder0) &&
                      (stackIn_105_0 <= 0)) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    BurstParticle.field_t = jl.field_a.waitAndAdvance(4007, DualLinkNode.field_p);
                    stackIn_105_0 = 0;
                  }
                  var3 = stackIn_105_0;
                  do {
                    if (!(BurstParticle.field_t > var3)) {
                      this.h(0);
                      ReflectionCheck.postDummyEventAfterQueueWait(NineSlicePanel.field_f, lt.field_m, -11030);
                      break;
                    }
                    this.a((byte) 101);
                    var3++;
                  } while (var5 == 0);
                } while (var5 == 0);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = decompiledCaughtException;
              IntrusiveNode.reportClientError((String) null, (Throwable) (var1), 0);
              this.a("crash", 21253);
            }
            this.a(true, -99);
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

    final static boolean a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          var1_int = -117 / ((param0 + 43) / 61);
          stackIn_4_0 = (vm.nameAvailabilityState == LegacyOpenGlGraphicsHeap.PENDING);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var1), "kc.O(" + param0 + ')');
        }
    }

    abstract void releaseAllStatics(boolean param0);

    static {
        field_e = new float[4];
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
