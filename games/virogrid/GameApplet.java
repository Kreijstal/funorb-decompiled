/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class GameApplet extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static String textColourBlue;
    static int field_c;
    boolean field_i;
    public static int field_f;
    public static int field_e;
    public static boolean field_b;
    public static int field_h;
    public static int field_j;
    public static int field_d;
    public static boolean field_a;

    public abstract void init();

    abstract void shutdownClientServices(int param0);

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
          stackIn_5_1 = new StringBuilder().append("uk.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final void redirectToErrorPage(int param0, String param1) {
        try {
          RuntimeException stackIn_14_0 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3 = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          try {
            if (this.field_i) {
              return;
            }
            this.field_i = true;
            System.out.println("error_game_" + param1);
            try {
              JavaScriptBridge.callJavaScript("loggedout", 6168, ContentTransitionDialog.getApplet((byte) 16));
              if (param0 != -25296) {
                this.windowDeiconified((java.awt.event.WindowEvent) null);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = decompiledCaughtException;
            }
            try {
              this.getAppletContext().showDocument(new java.net.URL(this.getCodeBase(), "error_game_" + param1 + ".ws"), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3_ref = (Exception) (Object) decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_14_0 = var3_ref2;
            stackIn_14_1 = new StringBuilder().append("uk.P(").append(param0).append(',');
            if (param1 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
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
          stackIn_5_1 = new StringBuilder().append("uk.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final static void pushClipRect(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param1 != 6) {
            textColourBlue = (String) null;
          }
          AudioPumpThread.pushRasterState(param1 - 6);
          Rasterizer.intersectClip(param2, param4, param3, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var5), "uk.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void runTick(boolean param0) {
        long var2_long = 0L;
        long var4 = 0L;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        Object var6 = null;
        try {
          var2_long = ClockAndTextHelpers.monotonicMillis(-9986);
          var4 = LogoIntroHelpers.field_b[RasterSnapshot.field_n];
          LogoIntroHelpers.field_b[RasterSnapshot.field_n] = var2_long;
          if (!param0) {
            return;
          }
          if (var4 != 0L &&
            var2_long > var4) {
          }
          RasterSnapshot.field_n = 31 & 1 + RasterSnapshot.field_n;
          var6 = this;
          synchronized (var6) {
            NameEntryPopup.field_Gb = NetworkArchiveRequest.field_F;
          }
          this.tickGame(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var2), "uk.N(" + param0 + ')');
        }
    }

    private final void terminate(byte param0, boolean param1) {
        Exception exception = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        Object var3_ref = null;
        Throwable var3_ref2 = null;
        try {
          var3_ref = this;
          synchronized (var3_ref) {
            if (IntKeyLookup.field_d) {
              return;
            }
            if (param0 != 20) {
              return;
            }
            IntKeyLookup.field_d = true;
          }
          if (ContextMenuHelpers.field_a != null) {
            ContextMenuHelpers.field_a.destroy();
          }
          try {
            this.shutdownClientServices(param0 ^ -76);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          if (UiWidget.field_v != null) {
            try {
              UiWidget.field_v.removeFocusListener((java.awt.event.FocusListener) (this));
              UiWidget.field_v.getParent().remove((java.awt.Component) ((Object) UiWidget.field_v));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (MusicPlaybackHelpers.field_c != null) {
            try {
              MusicPlaybackHelpers.field_c.shutdown(23607);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          this.shutdown(0);
          if (DelayedPacket.field_m != null) {
            try {
              System.exit(0);
            } catch (java.lang.Throwable decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              var3_ref2 = decompiledCaughtException;
            }
          }
          System.out.println("Shutdown complete - clean:" + param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "uk.G(" + param0 + ',' + param1 + ')');
        }
    }

    public final String getParameter(String param0) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        String stackIn_10_0 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (DelayedPacket.field_m != null) {
            stackIn_4_0 = null;
            return (String) (stackIn_4_0);
          }
          if (ContextMenuHelpers.field_a != null &&
            this != ContextMenuHelpers.field_a) {
            stackIn_10_0 = ContextMenuHelpers.field_a.getParameter(param0);
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getParameter(param0);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("uk.getParameter(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    abstract void initializeGame(boolean param0);

    final static int hitTestFooterButtons(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (DropTargetWidget.field_I != null) {
            stackIn_8_0 = DropTargetWidget.field_I.online ? 1 : 0;
          } else {
            stackIn_8_0 = (null == MusicPlaybackHelpers.field_b) ? 0 : 1;
          }
          var3_int = stackIn_8_0;
          if (var3_int != 0) {
            stackIn_12_0 = ClientEnvironmentHelpers.field_c.field_J;
          } else {
            stackIn_12_0 = 480;
          }
          var4 = stackIn_12_0;
          var5 = var4 - param2;
          var6 = param1 + (int)EmailAvailabilityValidator.field_t - 644;
          var7 = var5 / 20;
          if (param0 >= -103) {
            GameApplet.pushClipRect(-101, 19, -78, 79, -92);
          }
          if (var5 < 0 ||
            var6 < 0 ||
            var7 > 1) {
            var7 = -1;
          }
          if (1 == var7) {
            var7 = var6 / 26 + 1;
          }
          stackIn_26_0 = var7;
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var3), "uk.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized void recreateCanvas(int param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          if (UiWidget.field_v != null) {
            UiWidget.field_v.removeFocusListener((java.awt.event.FocusListener) (this));
            UiWidget.field_v.getParent().setBackground(java.awt.Color.black);
            UiWidget.field_v.getParent().remove((java.awt.Component) ((Object) UiWidget.field_v));
          }
          boolean decompiledFrameRemainder0 = true;
          if (FullscreenErrorDialog.field_cb == null) {
            if (DelayedPacket.field_m != null) {
              var2 = DelayedPacket.field_m;
              decompiledFrameRemainder0 = (var4 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (null == ContextMenuHelpers.field_a) {
                var2 = WidgetStyleLayer.field_n;
                if (var4 != 0) {
                  var2 = ContextMenuHelpers.field_a;
                  var2 = FullscreenErrorDialog.field_cb;
                }
              } else {
                var2 = ContextMenuHelpers.field_a;
                if (var4 != 0) {
                  var2 = FullscreenErrorDialog.field_cb;
                }
              }
            }
          } else {
            var2 = FullscreenErrorDialog.field_cb;
          }
          ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
          UiWidget.field_v = (java.awt.Canvas) ((Object) new DelegatingCanvas((java.awt.Component) (this)));
          ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) UiWidget.field_v));
          if (param0 != 21616) {
            this.onCanvasCreated(false);
          }
          UiWidget.field_v.setSize(FallingParticle.field_i, SpriteWidget.field_B);
          UiWidget.field_v.setVisible(true);
          boolean decompiledSharedTail0 = (var2 == DelayedPacket.field_m);
          if (!decompiledSharedTail0) {
            UiWidget.field_v.setLocation(UiWidget.field_s, RasterEffectHelpers.field_c);
            decompiledSharedTail0 = (var4 != 0);
          }
          if (decompiledSharedTail0) {
            var3 = DelayedPacket.field_m.getInsets();
            UiWidget.field_v.setLocation(UiWidget.field_s + var3.left, var3.top + RasterEffectHelpers.field_c);
          }
          UiWidget.field_v.addFocusListener((java.awt.event.FocusListener) (this));
          UiWidget.field_v.requestFocus();
          NameEntryPopup.field_Gb = true;
          NetworkArchiveRequest.field_F = true;
          DraggableWidget.field_K = true;
          SpriteWidget.field_Db = false;
          MenuScreen.field_b = ClockAndTextHelpers.monotonicMillis(param0 ^ -29554);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) (var2), "uk.H(" + param0 + ')');
        }
    }

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.net.URL stackIn_10_0 = null;
        java.net.URL stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != DelayedPacket.field_m) {
            stackIn_4_0 = null;
            return (java.net.URL) (stackIn_4_0);
          }
          if (ContextMenuHelpers.field_a != null &&
            this != ContextMenuHelpers.field_a) {
            stackIn_10_0 = ContextMenuHelpers.field_a.getDocumentBase();
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getDocumentBase();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var1), "uk.getDocumentBase()");
        }
    }

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          ContextMenuHelpers.field_a = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("uk.provideLoaderApplet(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final static void prepareChatSend(int param0, int param1, String param2, int param3, long param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 5) {
            return;
          }
          PendingHighscoreRequest.field_n = param2;
          GrowableIntList.field_c = param4;
          EmailValidator.field_o = param3;
          GameKeyHandler.field_d = param0;
          ViewportController.field_m = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("uk.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.applet.AppletContext stackIn_12_0 = null;
        java.applet.AppletContext stackIn_14_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != DelayedPacket.field_m) {
            stackIn_4_0 = null;
            return (java.applet.AppletContext) (stackIn_4_0);
          }
          if (null != ContextMenuHelpers.field_a &&
            ContextMenuHelpers.field_a != this) {
            stackIn_12_0 = ContextMenuHelpers.field_a.getAppletContext();
            return stackIn_12_0;
          }
          stackIn_14_0 = super.getAppletContext();
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var1), "uk.getAppletContext()");
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          NetworkArchiveRequest.field_F = true;
          DraggableWidget.field_K = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("uk.focusGained(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    abstract void shutdown(int param0);

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    abstract void onCanvasCreated(boolean param0);

    final void startAppletShell(int param0, int param1, int param2, int param3, int param4, int param5, String param6) {
        try {
          PlatformTaskDispatcher dupTemp$0 = null;
          RuntimeException stackIn_24_0 = null;
          StringBuilder stackIn_24_1 = null;
          String stackIn_25_2 = null;
          Throwable decompiledCaughtException = null;
          PlatformTask var8 = null;
          Throwable var8_ref = null;
          RuntimeException var8_ref2 = null;
          int var9 = 0;
          var9 = Virogrid.field_F ? 1 : 0;
          try {
            try {
              if (null != WidgetStyleLayer.field_n) {
                SpriteWidget.field_pb = SpriteWidget.field_pb + 1;
                if (SpriteWidget.field_pb < 3) {
                  this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                  return;
                }
                this.redirectToErrorPage(-25296, "alreadyloaded");
                return;
              }
              SpriteWidget.field_B = param1;
              IndexedSpriteState.field_g = param1;
              Bzip2State.field_v = param4;
              RasterEffectHelpers.field_c = 0;
              if (param0 <= 22) {
                this.focusLost((java.awt.event.FocusEvent) null);
              }
              FallingParticle.field_i = param2;
              LobbyGame.field_nc = param2;
              WidgetStyleLayer.field_n = this;
              UiWidget.field_s = 0;
              RasterBuffer.field_m = ContentTransitionDialog.getApplet((byte) 109);
              dupTemp$0 = new PlatformTaskDispatcher(param3, param6, param5, true);
              MusicPlaybackHelpers.field_c = dupTemp$0;
              DialWidget.field_R = dupTemp$0;
              var8 = MusicPlaybackHelpers.field_c.startThread(1, (Runnable) (this), 255);
              while (true) {
                if (var8.field_a == 0) {
                  IsaacRandom.sleepMillis(-115, 10L);
                  if (var9 == 0) {
                    continue;
                  }
                }
                break;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8_ref = decompiledCaughtException;
              IconLabelWidget.reportClientError((String) null, var8_ref, 1);
              this.redirectToErrorPage(-25296, "crash");
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var8_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_24_0 = var8_ref2;
            stackIn_24_1 = new StringBuilder().append("uk.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            if (param6 == null) {
              stackIn_25_2 = "null";
            } else {
              stackIn_25_2 = "{...}";
            }
            throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean isHostAllowed(byte param0) {
        return true;
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    public final void start() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this == WidgetStyleLayer.field_n &&
            !IntKeyLookup.field_d) {
            SpriteState.field_t = 0L;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "uk.start()");
        }
    }

    public final void destroy() {
        if (WidgetStyleLayer.field_n != this ||
          IntKeyLookup.field_d) {
          return;
        }
        try {
          SpriteState.field_t = ClockAndTextHelpers.monotonicMillis(-9986);
          IsaacRandom.sleepMillis(-22, 5000L);
          DialWidget.field_R = null;
          this.terminate((byte) 20, false);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "uk.destroy()");
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          NetworkArchiveRequest.field_F = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("uk.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void run() {
        try {
          boolean stackIn_68_0 = false;
          int stackIn_81_0 = 0;
          int stackIn_81_1 = 0;
          int stackIn_102_0 = 0;
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
          var5 = Virogrid.field_F ? 1 : 0;
          try {
            try {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              if (PlatformTaskDispatcher.field_q != null) {
                var1 = PlatformTaskDispatcher.field_q.toLowerCase();
                if (((String) (var1)).indexOf("sun") != -1 ||
                  ((String) (var1)).indexOf("apple") != -1) {
                  var2 = PlatformTaskDispatcher.field_k;
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
                    this.redirectToErrorPage(-25296, "wrongjava");
                    decompiledFrameRemainder3 = (var5 != 0);
                  }
                  if ((decompiledFrameRemainder3) &&
                    (var2.startsWith("1.6.0_"))) {
                    var3 = 6;
                    while (var2.length() > var3) {
                      stackIn_68_0 = DualLinkHashTable.isAsciiDigit(0, var2.charAt(var3));
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
                      if (MusicVoiceMixer.isDecimalInteger((CharSequence) ((Object) var4), -128) &&
                        !(WhirlpoolDigest.parseDecimalInt((CharSequence) ((Object) var4), false) >= 10)) {
                        this.redirectToErrorPage(-25296, "wrongjava");
                        decompiledFrameRemainder3 = (var5 != 0);
                      }
                    }
                  }
                }
              }
              if (((decompiledFrameRemainder3) && (decompiledFrameCompleted0)) &&
                (decompiledFrameRemainder2 = (PlatformTaskDispatcher.field_k != null))) {
                stackIn_68_0 = PlatformTaskDispatcher.field_k.startsWith("1.");
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (stackIn_68_0)) {
                var1_int = 2;
                var2_int = 0;
                while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (var1_int < PlatformTaskDispatcher.field_k.length()) {
                    var3 = PlatformTaskDispatcher.field_k.charAt(var1_int);
                    stackIn_81_0 = 48;
                    stackIn_81_1 = var3;
                    decompiledFrameRemainder1 = (var5 == 0);
                    if ((decompiledFrameRemainder1) && (stackIn_81_0 <= stackIn_81_1 &&
                      57 >= var3)) {
                      var2_int = 10 * var2_int - (-var3 + 48);
                      var1_int++;
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    stackIn_81_0 = -6;
                    stackIn_81_1 = ~var2_int;
                  }
                  if (stackIn_81_0 < stackIn_81_1) {
                    break;
                  }
                  ChatAndIgnoreHelpers.field_c = true;
                  break;
                }
              }
              if (decompiledFrameRemainder3) {
                var1 = WidgetStyleLayer.field_n;
                if (ContextMenuHelpers.field_a != null) {
                  var1 = ContextMenuHelpers.field_a;
                }
                var2_ref = PlatformTaskDispatcher.field_v;
                if (null != var2_ref) {
                  try {
                    var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3_ref_Throwable = decompiledCaughtException;
                  }
                }
                ClientEnvironmentHelpers.detectMaxMemoryMb(1);
                this.recreateCanvas(21616);
                LoginPanel.field_M = MusicCrossfadeStream.createRasterBuffer((java.awt.Component) ((Object) UiWidget.field_v), FallingParticle.field_i, SpriteWidget.field_B, 101);
                this.initializeGame(true);
                ChatPanelSetupHelpers.field_b = ArrayWidgetContainer.createGameClock(true);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (SpriteState.field_t != 0L) {
                    stackIn_102_0 = compareLongs(SpriteState.field_t, ClockAndTextHelpers.monotonicMillis(-9986));
                    decompiledFrameRemainder0 = (var5 == 0);
                    if ((decompiledFrameRemainder0) &&
                      (stackIn_102_0 <= 0)) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    CheckboxTickPainter.field_c = ChatPanelSetupHelpers.field_b.waitAndAdvance(16680, ReflectionCheckHelpers.field_f);
                    stackIn_102_0 = 0;
                  }
                  var3 = stackIn_102_0;
                  do {
                    if (!(CheckboxTickPainter.field_c > var3)) {
                      this.renderAppletFrame(9282);
                      NetworkGameClient.pumpPlatformEvents(MusicPlaybackHelpers.field_c, UiWidget.field_v, (byte) -102);
                      break;
                    }
                    this.runTick(true);
                    var3++;
                  } while (var5 == 0);
                } while (var5 == 0);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = decompiledCaughtException;
              IconLabelWidget.reportClientError((String) null, (Throwable) (var1), 1);
              this.redirectToErrorPage(-25296, "crash");
            }
            this.terminate((byte) 20, true);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw AsyncCheckResult.wrapException((Throwable) (var1), "uk.run()");
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void renderAppletFrame(int param0) {
        int fieldTemp$1 = 0;
        long var2_long = 0L;
        long var4 = 0L;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var6_int = 0;
        java.awt.Insets var6 = null;
        try {
          if (param0 != 9282) {
            this.getDocumentBase();
          }
          var2_long = ClockAndTextHelpers.monotonicMillis(-9986);
          var4 = WidgetNode.field_q[PasswordConfirmationValidator.field_r];
          WidgetNode.field_q[PasswordConfirmationValidator.field_r] = var2_long;
          if (var4 != 0L &&
            var4 < var2_long) {
            var6_int = (int)(-var4 + var2_long);
            StrongCacheReference.field_E = (32000 + (var6_int >> 1)) / var6_int;
          }
          PasswordConfirmationValidator.field_r = 31 & PasswordConfirmationValidator.field_r + 1;
          fieldTemp$1 = AudioPumpThread.field_a;
          AudioPumpThread.field_a = AudioPumpThread.field_a + 1;
          if (fieldTemp$1 > 50) {
            DraggableWidget.field_K = true;
            AudioPumpThread.field_a = AudioPumpThread.field_a - 50;
            UiWidget.field_v.setSize(FallingParticle.field_i, SpriteWidget.field_B);
            UiWidget.field_v.setVisible(true);
            if (null != DelayedPacket.field_m &&
              FullscreenErrorDialog.field_cb == null) {
              var6 = DelayedPacket.field_m.getInsets();
              UiWidget.field_v.setLocation(UiWidget.field_s + var6.left, RasterEffectHelpers.field_c + var6.top);
              if (Virogrid.field_F) {
                UiWidget.field_v.setLocation(UiWidget.field_s, RasterEffectHelpers.field_c);
              }
            } else {
              UiWidget.field_v.setLocation(UiWidget.field_s, RasterEffectHelpers.field_c);
            }
          }
          this.onCanvasCreated(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var2), "uk.O(" + param0 + ')');
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    protected GameApplet() {
        this.field_i = false;
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (null != DelayedPacket.field_m) {
          return null;
        }
        if (null != ContextMenuHelpers.field_a &&
          ContextMenuHelpers.field_a != this) {
          return ContextMenuHelpers.field_a.getCodeBase();
        }
        return super.getCodeBase();
    }

    abstract void tickGame(int param0);

    public static void releaseStatics(int param0) {
        try {
          textColourBlue = null;
          if (param0 != -6490) {
            textColourBlue = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "uk.I(" + param0 + ')');
        }
    }

    public final void stop() {
        if (WidgetStyleLayer.field_n != this ||
          IntKeyLookup.field_d) {
          return;
        }
        try {
          SpriteState.field_t = ClockAndTextHelpers.monotonicMillis(-9986) + 4000L;
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "uk.stop()");
        }
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.awt.Rectangle var2 = null;
        RuntimeException var2_ref = null;
        try {
          if (WidgetStyleLayer.field_n == this &&
            !IntKeyLookup.field_d) {
            DraggableWidget.field_K = true;
            if (ChatAndIgnoreHelpers.field_c &&
              ClockAndTextHelpers.monotonicMillis(-9986) - MenuScreen.field_b > 1000L) {
              var2 = param0.getClipBounds();
              if (null != var2) {
                if (var2.width < LobbyGame.field_nc) {
                  return;
                }
                if (IndexedSpriteState.field_g > var2.height) {
                  return;
                }
              }
              SpriteWidget.field_Db = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_26_0 = var2_ref;
          stackIn_26_1 = new StringBuilder().append("uk.paint(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    static {
        textColourBlue = "blue";
    }

    private static int compareLongs(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
