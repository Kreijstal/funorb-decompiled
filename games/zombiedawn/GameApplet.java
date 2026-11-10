/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class GameApplet extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    boolean field_j;
    static MenuScreen field_c;
    static int field_b;
    static int field_h;
    public static int field_f;
    public static boolean field_g;
    public static int field_a;
    public static int field_e;
    public static int field_k;
    public static int field_d;
    public static int field_i;

    abstract void runFrameStep(byte param0);

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (ResizableModeHelpers.field_a != null) {
          return null;
        }
        if (null != MidiNoteMask.field_i &&
          this != MidiNoteMask.field_i) {
          return MidiNoteMask.field_i.getCodeBase();
        }
        return super.getCodeBase();
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
          stackIn_5_1 = new StringBuilder().append("ke.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final synchronized void replaceCanvas(boolean param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ZombieDawn.field_J;
        try {
          if (IntrusiveDequeCursor.field_d != null) {
            IntrusiveDequeCursor.field_d.removeFocusListener((java.awt.event.FocusListener) (this));
            IntrusiveDequeCursor.field_d.getParent().setBackground(java.awt.Color.black);
            IntrusiveDequeCursor.field_d.getParent().remove((java.awt.Component) ((Object) IntrusiveDequeCursor.field_d));
          }
          boolean decompiledFrameRemainder0 = true;
          if (null != ReflectionCheckRequest.field_p) {
            var2 = ReflectionCheckRequest.field_p;
            decompiledFrameRemainder0 = (var4 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (null != ResizableModeHelpers.field_a) {
              var2 = ResizableModeHelpers.field_a;
              if (var4 != 0) {
                if (null != MidiNoteMask.field_i) {
                  var2 = MidiNoteMask.field_i;
                  var2 = DropdownList.field_J;
                } else {
                  var2 = DropdownList.field_J;
                }
              }
            } else {
              if (null != MidiNoteMask.field_i) {
                var2 = MidiNoteMask.field_i;
                if (var4 != 0) {
                  var2 = DropdownList.field_J;
                }
              } else {
                var2 = DropdownList.field_J;
              }
            }
          }
          ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
          IntrusiveDequeCursor.field_d = (java.awt.Canvas) ((Object) new DelegatingCanvas((java.awt.Component) (this)));
          ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) IntrusiveDequeCursor.field_d));
          IntrusiveDequeCursor.field_d.setSize(Alien.field_eb, FrameSpriteHelpers.field_c);
          IntrusiveDequeCursor.field_d.setVisible(true);
          boolean decompiledSharedTail0 = (var2 == ResizableModeHelpers.field_a);
          if (!decompiledSharedTail0) {
            IntrusiveDequeCursor.field_d.setLocation(ScrollViewport.field_I, PhantomZombie.field_I);
            decompiledSharedTail0 = (var4 != 0);
          }
          if (decompiledSharedTail0) {
            var3 = ResizableModeHelpers.field_a.getInsets();
            IntrusiveDequeCursor.field_d.setLocation(var3.left + ScrollViewport.field_I, PhantomZombie.field_I + var3.top);
          }
          IntrusiveDequeCursor.field_d.addFocusListener((java.awt.event.FocusListener) (this));
          IntrusiveDequeCursor.field_d.requestFocus();
          RankingRowHelpers.field_c = param0;
          WeightedLruCache.field_d = true;
          PacketRequestHelpers.field_b = true;
          GrowableIntList.field_f = false;
          MoveTargetMarker.field_g = MonotonicClock.monotonicTimeMillis(-22826);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) (var2), "ke.FB(" + param0 + ')');
        }
    }

    abstract void paintFrame(byte param0);

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    abstract void onStartup(byte param0);

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
          stackIn_5_1 = new StringBuilder().append("ke.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    public static void releaseStatics(int param0) {
        try {
          field_c = null;
          int var1_int = 19 / ((param0 + 39) / 54);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "ke.GB(" + param0 + ')');
        }
    }

    final static void drawThreeSliceBar(int param0, int param1, Sprite[] param2, int param3, int param4) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = ZombieDawn.field_J;
        try {
          if (param2 != null &&
            param3 > 0) {
            var5_int = param2[0].field_r;
            if (param0 <= 10) {
              GameApplet.drawThreeSliceBar(-53, 77, (Sprite[]) null, 65, -32);
            }
            var6 = param2[2].field_r;
            var7 = param2[1].field_r;
            param2[0].drawTransparent(param1, param4);
            param2[2].drawTransparent(-var6 + param1 + param3, param4);
            Rasterizer.saveClip(AccountServerResult.field_c);
            Rasterizer.intersectClip(var5_int + param1, param4, -var6 + param3 + param1, param4 + param2[1].field_q);
            var8 = var5_int + param1;
            var9 = param1 + param3 - var6;
            param1 = var8;
            while (var9 > param1) {
              param2[1].drawTransparent(param1, param4);
              param1 = param1 + var7;
              if (var10 != 0) {
                return;
              }
            }
            Rasterizer.restoreClip(AccountServerResult.field_c);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("ke.EB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void redistributeFacesByPriority(int param0, int param1, int[] param2, byte[] param3, int param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        byte dupTemp$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = ZombieDawn.field_J;
        try {
          var5_int = param0;
          while (var5_int < OffsetHelpers.field_b.length) {
            param4 = OffsetHelpers.field_b[var5_int];
            if (var7 != 0) {
              return;
            }
            var6 = var5_int << 4;
            while (true) {
              incrementValue$0 = param4;
              param4--;
              if (0 != incrementValue$0) {
                incrementValue$1 = var6;
                var6++;
                param1 = RasterState.field_o[incrementValue$1];
                dupTemp$2 = param3[param1];
                dupTemp$3 = param2[dupTemp$2];
                param2[dupTemp$2] = dupTemp$3 + 1;
                RasterState.field_o[dupTemp$3] = param1;
                continue;
              }
              break;
            }
            var5_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("ke.CB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param4).append(')').toString());
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          WeightedLruCache.field_d = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("ke.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final boolean isHostAllowed(boolean param0) {
        return true;
    }

    public final void stop() {
        if (this != DropdownList.field_J ||
          RandomAccessCacheFile.field_j) {
          return;
        }
        try {
          RankingRowHelpers.field_a = 4000L + MonotonicClock.monotonicTimeMillis(-22826);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "ke.stop()");
        }
    }

    final void startAppletServices(int param0, int param1, String param2, int param3, int param4, int param5, int param6) {
        try {
          PlatformTaskDispatcher dupTemp$0 = null;
          RuntimeException stackIn_24_0 = null;
          StringBuilder stackIn_24_1 = null;
          String stackIn_25_2 = null;
          Throwable decompiledCaughtException = null;
          AsyncRequest var8 = null;
          Throwable var8_ref = null;
          RuntimeException var8_ref2 = null;
          int var9 = 0;
          var9 = ZombieDawn.field_J;
          try {
            try {
              if (null != DropdownList.field_J) {
                EmailSyntaxValidator.field_k = EmailSyntaxValidator.field_k + 1;
                if (EmailSyntaxValidator.field_k < 3) {
                  this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                  return;
                }
                this.redirectToErrorPage("alreadyloaded", 50);
                return;
              }
              ScrollViewport.field_I = 0;
              FrameSpriteHelpers.field_c = param0;
              LevelObstacle.field_D = param0;
              PhantomZombie.field_I = 0;
              field_b = param5;
              Alien.field_eb = param3;
              QuickChatPhraseCache.field_d = param3;
              DropdownList.field_J = this;
              PendingIntArrayRequest.field_m = AppletHostHelpers.getHostApplet(0);
              if (param4 != -14384) {
                field_h = -97;
              }
              dupTemp$0 = new PlatformTaskDispatcher(param6, param2, param1, true);
              SpriteFadeHelpers.field_a = dupTemp$0;
              WidgetContainer.field_E = dupTemp$0;
              var8 = SpriteFadeHelpers.field_a.startThread(1, (Runnable) (this), true);
              while (true) {
                if (var8.status == 0) {
                  AlternateLongAndNameCredentials.sleepMillis(10L, (byte) 95);
                  if (var9 == 0) {
                    continue;
                  }
                }
                break;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8_ref = decompiledCaughtException;
              ErrorReportHelpers.reportClientError(var8_ref, 10331, (String) null);
              this.redirectToErrorPage("crash", 50);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var8_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_24_0 = var8_ref2;
            stackIn_24_1 = new StringBuilder().append("ke.AB(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_25_2 = "null";
            } else {
              stackIn_25_2 = "{...}";
            }
            throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void onShutdown(int param0);

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.net.URL stackIn_8_0 = null;
        java.net.URL stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != ResizableModeHelpers.field_a) {
            stackIn_2_0 = null;
            return (java.net.URL) (stackIn_2_0);
          }
          if (null != MidiNoteMask.field_i &&
            MidiNoteMask.field_i != this) {
            stackIn_8_0 = MidiNoteMask.field_i.getDocumentBase();
            return stackIn_8_0;
          }
          stackIn_10_0 = super.getDocumentBase();
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var1), "ke.getDocumentBase()");
        }
    }

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          MidiNoteMask.field_i = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("ke.provideLoaderApplet(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    private final void renderAppletFrame(int param0) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        java.awt.Insets var6 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        try {
          var2_long = MonotonicClock.monotonicTimeMillis(-22826);
          if (param0 != 6) {
            this.renderAppletFrame(120);
          }
          var4 = LoginNameValue.field_c[ArmedHuman.field_Db];
          LoginNameValue.field_c[ArmedHuman.field_Db] = var2_long;
          ArmedHuman.field_Db = ArmedHuman.field_Db + 1 & 31;
          if (var4 != 0L &&
            var2_long > var4) {
            var6_int = (int)(var2_long - var4);
            NineSliceFrame.field_d = ((var6_int >> 1) + 32000) / var6_int;
          }
          fieldTemp$1 = MessageDialogContent.field_O;
          MessageDialogContent.field_O = MessageDialogContent.field_O + 1;
          if (50 < fieldTemp$1) {
            PacketRequestHelpers.field_b = true;
            MessageDialogContent.field_O = MessageDialogContent.field_O - 50;
            IntrusiveDequeCursor.field_d.setSize(Alien.field_eb, FrameSpriteHelpers.field_c);
            IntrusiveDequeCursor.field_d.setVisible(true);
            if (null != ResizableModeHelpers.field_a &&
              null == ReflectionCheckRequest.field_p) {
              var6 = ResizableModeHelpers.field_a.getInsets();
              IntrusiveDequeCursor.field_d.setLocation(ScrollViewport.field_I + var6.left, var6.top + PhantomZombie.field_I);
              if (ZombieDawn.field_J != 0) {
                IntrusiveDequeCursor.field_d.setLocation(ScrollViewport.field_I, PhantomZombie.field_I);
              }
            } else {
              IntrusiveDequeCursor.field_d.setLocation(ScrollViewport.field_I, PhantomZombie.field_I);
            }
          }
          this.paintFrame((byte) 67);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "ke.HB(" + param0 + ')');
        }
    }

    public abstract void init();

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (DropdownList.field_J == this &&
            !RandomAccessCacheFile.field_j) {
            RankingRowHelpers.field_a = MonotonicClock.monotonicTimeMillis(-22826);
            AlternateLongAndNameCredentials.sleepMillis(5000L, (byte) 34);
            WidgetContainer.field_E = null;
            this.shutdown((byte) 96, false);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "ke.destroy()");
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          WeightedLruCache.field_d = true;
          PacketRequestHelpers.field_b = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("ke.focusGained(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.applet.AppletContext stackIn_12_0 = null;
        java.applet.AppletContext stackIn_14_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ResizableModeHelpers.field_a != null) {
            stackIn_4_0 = null;
            return (java.applet.AppletContext) (stackIn_4_0);
          }
          if (null != MidiNoteMask.field_i &&
            MidiNoteMask.field_i != this) {
            stackIn_12_0 = MidiNoteMask.field_i.getAppletContext();
            return stackIn_12_0;
          }
          stackIn_14_0 = super.getAppletContext();
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var1), "ke.getAppletContext()");
        }
    }

    private final void shutdown(byte param0, boolean param1) {
        Exception exception = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        Object var3_ref = null;
        Throwable var3_ref2 = null;
        try {
          if (param0 != 96) {
            return;
          }
          var3_ref = this;
          synchronized (var3_ref) {
            if (RandomAccessCacheFile.field_j) {
              return;
            }
            RandomAccessCacheFile.field_j = true;
          }
          if (MidiNoteMask.field_i != null) {
            MidiNoteMask.field_i.destroy();
          }
          try {
            this.onShutdown(param0 + 16754);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          if (IntrusiveDequeCursor.field_d != null) {
            try {
              IntrusiveDequeCursor.field_d.removeFocusListener((java.awt.event.FocusListener) (this));
              IntrusiveDequeCursor.field_d.getParent().remove((java.awt.Component) ((Object) IntrusiveDequeCursor.field_d));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (null != SpriteFadeHelpers.field_a) {
            try {
              SpriteFadeHelpers.field_a.shutdown(0);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          this.releaseStaticResources(false);
          if (ResizableModeHelpers.field_a != null) {
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
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "ke.JB(" + param0 + ',' + param1 + ')');
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.awt.Rectangle var2 = null;
        RuntimeException var2_ref = null;
        try {
          if (DropdownList.field_J == this &&
            !RandomAccessCacheFile.field_j) {
            PacketRequestHelpers.field_b = true;
            if (LoginAndPacketHelpers.field_a &&
              MonotonicClock.monotonicTimeMillis(-22826) - MoveTargetMarker.field_g > 1000L) {
              var2 = param0.getClipBounds();
              if (var2 != null) {
                if (var2.width < QuickChatPhraseCache.field_d) {
                  return;
                }
                if (var2.height < LevelObstacle.field_D) {
                  return;
                }
              }
              GrowableIntList.field_f = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_22_0 = var2_ref;
          stackIn_22_1 = new StringBuilder().append("ke.paint(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    abstract void releaseStaticResources(boolean param0);

    public final void start() {
        if (this != DropdownList.field_J ||
          RandomAccessCacheFile.field_j) {
          return;
        }
        try {
          RankingRowHelpers.field_a = 0L;
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "ke.start()");
        }
    }

    private final void runTimedTick(byte param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        try {
          var2_long = MonotonicClock.monotonicTimeMillis(param0 - 22873);
          var4 = ZombieDawn.field_E[EmailSyntaxValidator.field_f];
          ZombieDawn.field_E[EmailSyntaxValidator.field_f] = var2_long;
          if (0L != var4 &&
            var2_long > var4) {
          }
          EmailSyntaxValidator.field_f = 1 + EmailSyntaxValidator.field_f & 31;
          var6 = this;
          synchronized (var6) {
            RankingRowHelpers.field_c = WeightedLruCache.field_d;
          }
          if (param0 != 47) {
            field_h = 11;
          }
          this.runFrameStep((byte) 15);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "ke.BB(" + param0 + ')');
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    final void redirectToErrorPage(String param0, int param1) {
        try {
          RuntimeException stackIn_17_0 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3 = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          try {
            if (this.field_j) {
              return;
            }
            if (param1 != 50) {
              this.shutdown((byte) -17, true);
            }
            this.field_j = true;
            System.out.println("error_game_" + param0);
            try {
              JavaScriptBridge.callWindowFunction(AppletHostHelpers.getHostApplet(0), "loggedout", -90);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = decompiledCaughtException;
            }
            try {
              this.getAppletContext().showDocument(new java.net.URL(this.getCodeBase(), "error_game_" + param0 + ".ws"), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3_ref = (Exception) (Object) decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_17_0 = var3_ref2;
            stackIn_17_1 = new StringBuilder().append("ke.IB(");
            if (param0 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected GameApplet() {
        this.field_j = false;
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
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
          if (ResizableModeHelpers.field_a != null) {
            stackIn_4_0 = null;
            return (String) (stackIn_4_0);
          }
          if (null != MidiNoteMask.field_i &&
            MidiNoteMask.field_i != this) {
            stackIn_10_0 = MidiNoteMask.field_i.getParameter(param0);
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getParameter(param0);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("ke.getParameter(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public final void run() {
        try {
          boolean stackIn_64_0 = false;
          int stackIn_76_0 = 0;
          int stackIn_76_1 = 0;
          int stackIn_93_0 = 0;
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
          var5 = ZombieDawn.field_J;
          try {
            try {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              if (null != PlatformTaskDispatcher.field_h) {
                var1 = PlatformTaskDispatcher.field_h.toLowerCase();
                if (((String) (var1)).indexOf("sun") != -1 ||
                  ((String) (var1)).indexOf("apple") != -1) {
                  var2 = PlatformTaskDispatcher.field_g;
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
                    this.redirectToErrorPage("wrongjava", 50);
                    decompiledFrameRemainder3 = (var5 != 0);
                  }
                  if ((decompiledFrameRemainder3) &&
                    (var2.startsWith("1.6.0_"))) {
                    var3 = 6;
                    while (var3 < var2.length()) {
                      stackIn_64_0 = CacheEntry.isAsciiDigit(var2.charAt(var3), 117);
                      if (var5 != 0) {
                        decompiledFrameCompleted0 = false;
                        break;
                      }
                      if (stackIn_64_0) {
                        var3++;
                        continue;
                      }
                      break;
                    }
                    if (decompiledFrameCompleted0) {
                      var4 = var2.substring(6, var3);
                      if (ResizableModeHelpers.isDecimalInteger((byte) -118, (CharSequence) ((Object) var4)) &&
                        !(DualLinkDeque.parseDecimalInt((CharSequence) ((Object) var4), -84) >= 10)) {
                        this.redirectToErrorPage("wrongjava", 50);
                        decompiledFrameRemainder3 = (var5 != 0);
                      }
                    }
                  }
                }
              }
              if (((decompiledFrameRemainder3) && (decompiledFrameCompleted0)) &&
                (decompiledFrameRemainder2 = (PlatformTaskDispatcher.field_g != null))) {
                stackIn_64_0 = PlatformTaskDispatcher.field_g.startsWith("1.");
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (stackIn_64_0)) {
                var1_int = 2;
                var2_int = 0;
                while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (PlatformTaskDispatcher.field_g.length() > var1_int) {
                    var3 = PlatformTaskDispatcher.field_g.charAt(var1_int);
                    stackIn_76_0 = ~var3;
                    stackIn_76_1 = -49;
                    decompiledFrameRemainder1 = (var5 == 0);
                    if ((decompiledFrameRemainder1) && (stackIn_76_0 <= stackIn_76_1 &&
                      57 >= var3)) {
                      var2_int = var3 - (48 - 10 * var2_int);
                      var1_int++;
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    stackIn_76_0 = 5;
                    stackIn_76_1 = var2_int;
                  }
                  if (stackIn_76_0 > stackIn_76_1) {
                    break;
                  }
                  LoginAndPacketHelpers.field_a = true;
                  break;
                }
              }
              if (decompiledFrameRemainder3) {
                var1 = DropdownList.field_J;
                if (null != MidiNoteMask.field_i) {
                  var1 = MidiNoteMask.field_i;
                }
                var2_ref = PlatformTaskDispatcher.field_d;
                if (null != var2_ref) {
                  try {
                    var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3_ref_Throwable = decompiledCaughtException;
                  }
                }
                LongAndTextLoginPayload.detectMaxMemoryMb(1818);
                this.replaceCanvas(true);
                DisplayState.field_f = TextAndNameCredentials.createRasterBuffer(-1, FrameSpriteHelpers.field_c, (java.awt.Component) ((Object) IntrusiveDequeCursor.field_d), Alien.field_eb);
                this.onStartup((byte) 94);
                CivilianHuman.field_yb = EmailAvailabilityValidator.createTickClock(16516);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (RankingRowHelpers.field_a != 0L) {
                    stackIn_93_0 = compareLongs(~RankingRowHelpers.field_a, ~MonotonicClock.monotonicTimeMillis(-22826));
                    decompiledFrameRemainder0 = (var5 == 0);
                    if ((decompiledFrameRemainder0) &&
                      (stackIn_93_0 >= 0)) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    StationaryRifleman.field_Ob = CivilianHuman.field_yb.waitAndAdvanceTicks(KeyHandlerHolder.field_a, 0);
                    stackIn_93_0 = 0;
                  }
                  var3 = stackIn_93_0;
                  do {
                    if (!(var3 < StationaryRifleman.field_Ob)) {
                      this.renderAppletFrame(6);
                      TextButton.pumpEventQueue(0, SpriteFadeHelpers.field_a, IntrusiveDequeCursor.field_d);
                      break;
                    }
                    this.runTimedTick((byte) 47);
                    var3++;
                  } while (var5 == 0);
                } while (var5 == 0);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = decompiledCaughtException;
              ErrorReportHelpers.reportClientError((Throwable) (var1), 10331, (String) null);
              this.redirectToErrorPage("crash", 50);
            }
            this.shutdown((byte) 96, true);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw ExceptionWrapper.wrapException((Throwable) (var1), "ke.run()");
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    static {
        field_h = 500;
    }

    private static int compareLongs(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
