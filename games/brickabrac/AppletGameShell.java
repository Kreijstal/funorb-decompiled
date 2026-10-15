/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

public abstract class AppletGameShell extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static UiComponent field_e;
    static String field_k;
    boolean field_d;
    private static Calendar field_n;
    static int[] faceGroupOffsets;
    static String field_b;
    static String field_f;
    public static int field_l;
    public static int field_j;
    public static boolean field_i;
    public static int field_a;
    public static boolean field_g;
    public static int field_h;
    public static int field_c;

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    abstract void updateClient(int obfuscationGuard);

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.net.URL stackIn_8_0 = null;
        java.net.URL stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != MatchingTextValidator.field_o) {
            stackIn_2_0 = null;
            return (java.net.URL) (stackIn_2_0);
          }
          if (null != CacheEntry.field_x &&
            CacheEntry.field_x != this) {
            stackIn_8_0 = CacheEntry.field_x.getDocumentBase();
            return stackIn_8_0;
          }
          stackIn_10_0 = super.getDocumentBase();
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var1), "ke.getDocumentBase()");
        }
    }

    private final void runClientTick(int obfuscationGuard) {
        RuntimeException runtimeException = null;
        long nowMillis = 0L;
        long previousTickMillis = 0L;
        Throwable decompiledCaughtException = null;
        Object focusLock = null;
        try {
          nowMillis = MonotonicTime.nowMillis(false);
          if (obfuscationGuard != 26573) {
            field_f = (String) null;
          }
          previousTickMillis = sm.tickTimes[RankingsRequest.tickTimeCursor];
          sm.tickTimes[RankingsRequest.tickTimeCursor] = nowMillis;
          RankingsRequest.tickTimeCursor = 31 & 1 + RankingsRequest.tickTimeCursor;
          if (0L != previousTickMillis &&
            previousTickMillis < nowMillis) {
          }
          focusLock = this;
          synchronized (focusLock) {
            NinjaBackground.frameFocus = CircleBody.liveFocus;
          }
          this.updateClient(-107);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ke.S(" + obfuscationGuard + ')');
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (null != MatchingTextValidator.field_o) {
          return null;
        }
        if (null != CacheEntry.field_x &&
          CacheEntry.field_x != this) {
          return CacheEntry.field_x.getCodeBase();
        }
        return super.getCodeBase();
    }

    final boolean e(int param0) {
        return true;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, String param5, int param6) {
        try {
          PlatformServices dupTemp$0 = null;
          RuntimeException stackIn_21_0 = null;
          StringBuilder stackIn_21_1 = null;
          String stackIn_22_2 = null;
          Throwable decompiledCaughtException = null;
          int var8_int = 0;
          Throwable var8 = null;
          RuntimeException var8_ref = null;
          PlatformTask var9 = null;
          int var10 = 0;
          var10 = BrickABrac.field_J ? 1 : 0;
          try {
            try {
              if (QuickChatCategoryRegistry.field_f != null) {
                TableRowSubmission.field_l = TableRowSubmission.field_l + 1;
                if (TableRowSubmission.field_l < 3) {
                  this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                  return;
                }
                this.a("alreadyloaded", 4000);
                return;
              }
              WeightedLruCache.canvasWidth = param3;
              u.field_d = param3;
              QuickChatCategoryRegistry.field_f = this;
              WeightedLruCache.canvasOffsetX = 0;
              var8_int = 88 / ((param1 - 24) / 56);
              LoginPanel.field_W = 0;
              RichTextLayout.field_m = param4;
              WidgetPaintStyle.canvasHeight = param2;
              UiCleanupHelpers.field_d = param2;
              SecondaryHashTable.field_i = EmailConfirmationValidator.e((byte) -64);
              dupTemp$0 = new PlatformServices(param0, param5, param6, true);
              AccountMessageDialog.field_ub = dupTemp$0;
              LevelPackLoader.field_e = dupTemp$0;
              var9 = AccountMessageDialog.field_ub.startThread(1, (Runnable) (this), (byte) -124);
              while (true) {
                if (var9.status == 0) {
                  BytePayloadRequest.sleepMillis(-125, 10L);
                  if (var10 == 0) {
                    continue;
                  }
                }
                break;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8 = decompiledCaughtException;
              AlignedIconLabel.a((String) null, var8, 52);
              this.a("crash", 4000);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var8_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = var8_ref;
            stackIn_21_1 = new StringBuilder().append("ke.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            if (param5 == null) {
              stackIn_22_2 = "null";
            } else {
              stackIn_22_2 = "{...}";
            }
            throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param6).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        java.applet.AppletContext stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (MatchingTextValidator.field_o != null) {
            stackIn_2_0 = null;
            return (java.applet.AppletContext) (stackIn_2_0);
          }
          if (CacheEntry.field_x != null &&
            this != CacheEntry.field_x) {
            stackIn_10_0 = CacheEntry.field_x.getAppletContext();
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getAppletContext();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var1), "ke.getAppletContext()");
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
          stackIn_5_1 = new StringBuilder().append("ke.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final static void shuffleFivePasses(int[] values, byte obfuscationGuard, IsaacGenerator random) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          MovingBody.shuffleValues(-122, values, 5, random);
          if (obfuscationGuard != 39) {
            AppletGameShell.copyBytes(false, (byte[]) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ke.U(");
          if (values == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(',');
          if (random == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.awt.Rectangle var2 = null;
        RuntimeException var2_ref = null;
        try {
          if (QuickChatCategoryRegistry.field_f == this &&
            !ParisBackground.field_s) {
            GameplayAudioEvent.redrawRequested = true;
            if (FullscreenFailureKind.field_h &&
              -er.field_c + MonotonicTime.nowMillis(false) > 1000L) {
              var2 = param0.getClipBounds();
              if (var2 != null) {
                if (var2.width < u.field_d) {
                  return;
                }
                if (UiCleanupHelpers.field_d > var2.height) {
                  return;
                }
              }
              MusicCrossfadeStream.field_A = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_27_0 = var2_ref;
          stackIn_27_1 = new StringBuilder().append("ke.paint(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    public final void run() {
        try {
          boolean stackIn_66_0 = false;
          int stackIn_79_0 = 0;
          int stackIn_79_1 = 0;
          int stackIn_98_0 = 0;
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
          var5 = BrickABrac.field_J ? 1 : 0;
          try {
            try {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              if (null != PlatformServices.javaVendor) {
                var1 = PlatformServices.javaVendor.toLowerCase();
                if (((String) (var1)).indexOf("sun") != -1 ||
                  ((String) (var1)).indexOf("apple") != -1) {
                  var2 = PlatformServices.javaVersion;
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
                    this.a("wrongjava", 4000);
                    decompiledFrameRemainder3 = (var5 != 0);
                  }
                  if ((decompiledFrameRemainder3) &&
                    (var2.startsWith("1.6.0_"))) {
                    var3 = 6;
                    while (var3 < var2.length()) {
                      stackIn_66_0 = WidgetTheme.isAsciiDigit(var2.charAt(var3), (byte) 86);
                      if (var5 != 0) {
                        decompiledFrameCompleted0 = false;
                        break;
                      }
                      if (stackIn_66_0) {
                        var3++;
                        continue;
                      }
                      break;
                    }
                    if (decompiledFrameCompleted0) {
                      var4 = var2.substring(6, var3);
                      if (MeshAttributeRecord.isDecimalInt((CharSequence) ((Object) var4), -102) &&
                        !(UsernameAvailabilityValidator.parseDecimalInt((CharSequence) ((Object) var4), -28734) >= 10)) {
                        this.a("wrongjava", 4000);
                        decompiledFrameRemainder3 = (var5 != 0);
                      }
                    }
                  }
                }
              }
              if (((decompiledFrameRemainder3) && (decompiledFrameCompleted0)) &&
                (decompiledFrameRemainder2 = (PlatformServices.javaVersion != null))) {
                stackIn_66_0 = PlatformServices.javaVersion.startsWith("1.");
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (stackIn_66_0)) {
                var1_int = 2;
                var2_int = 0;
                while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (var1_int < PlatformServices.javaVersion.length()) {
                    var3 = PlatformServices.javaVersion.charAt(var1_int);
                    stackIn_79_0 = ~var3;
                    stackIn_79_1 = -49;
                    decompiledFrameRemainder1 = (var5 == 0);
                    if ((decompiledFrameRemainder1) && (stackIn_79_0 <= stackIn_79_1 &&
                      var3 <= 57)) {
                      var1_int++;
                      var2_int = var2_int * 10 + var3 - 48;
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    stackIn_79_0 = -6;
                    stackIn_79_1 = ~var2_int;
                  }
                  if (stackIn_79_0 < stackIn_79_1) {
                    break;
                  }
                  FullscreenFailureKind.field_h = true;
                  break;
                }
              }
              if (decompiledFrameRemainder3) {
                var1 = QuickChatCategoryRegistry.field_f;
                if (CacheEntry.field_x != null) {
                  var1 = CacheEntry.field_x;
                }
                var2_ref = PlatformServices.field_x;
                if (var2_ref != null) {
                  try {
                    var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3_ref_Throwable = decompiledCaughtException;
                  }
                }
                IntegerValidationHelpers.refreshReportedHeapLimit(1);
                this.c(false);
                BallPulseEffect.framebuffer = MusicEnvelope.createFramebuffer((java.awt.Component) ((Object) CacheIoRequest.windowCanvas), WeightedLruCache.canvasWidth, -2414, WidgetPaintStyle.canvasHeight);
                this.initializeClient(false);
                MenuSelection.gameClock = BoardPresentationHelpers.createGameClock((byte) 123);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (0L != BufferedFile.shutdownDeadlineMillis) {
                    stackIn_98_0 = $cfr$lcmp(BufferedFile.shutdownDeadlineMillis, MonotonicTime.nowMillis(false));
                    decompiledFrameRemainder0 = (var5 == 0);
                    if ((decompiledFrameRemainder0) &&
                      (stackIn_98_0 <= 0)) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    GrowableIntList.cyclesDue = MenuSelection.gameClock.waitAndAdvance(ResourceRequest.tickDurationNanos, (byte) -71);
                    stackIn_98_0 = 0;
                  }
                  var3 = stackIn_98_0;
                  do {
                    if (!(GrowableIntList.cyclesDue > var3)) {
                      this.runRenderFrame(0);
                      IntNode.pumpPlatformEvents(-4317, AccountMessageDialog.field_ub, CacheIoRequest.windowCanvas);
                      break;
                    }
                    this.runClientTick(26573);
                    var3++;
                  } while (var5 == 0);
                } while (var5 == 0);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = decompiledCaughtException;
              AlignedIconLabel.a((String) null, (Throwable) (var1), 77);
              this.a("crash", 4000);
            }
            this.shutdown(true, -93);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw FarmBackground.addExceptionContext((Throwable) (var1), "ke.run()");
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void runRenderFrame(int obfuscationGuard) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        long nowMillis = 0L;
        long previousRenderMillis = 0L;
        int renderSpanMillis = 0;
        java.awt.Insets insets = null;
        RuntimeException decompiledCaughtException = null;
        try {
          nowMillis = MonotonicTime.nowMillis(false);
          previousRenderMillis = Under13RegistrationNoticePanel.renderTimes[MembershipBenefitsScreen.renderTimeCursor];
          Under13RegistrationNoticePanel.renderTimes[MembershipBenefitsScreen.renderTimeCursor] = nowMillis;
          MembershipBenefitsScreen.renderTimeCursor = 31 & 1 + MembershipBenefitsScreen.renderTimeCursor;
          if ((long)obfuscationGuard != previousRenderMillis &&
            nowMillis > previousRenderMillis) {
            renderSpanMillis = (int)(nowMillis - previousRenderMillis);
            FocusableWidget.recentRenderRate = (32000 + (renderSpanMillis >> 1)) / renderSpanMillis;
          }
          fieldTemp$1 = MouseWheelSource.resizeFrameCounter;
          MouseWheelSource.resizeFrameCounter = MouseWheelSource.resizeFrameCounter + 1;
          if (50 < fieldTemp$1) {
            GameplayAudioEvent.redrawRequested = true;
            MouseWheelSource.resizeFrameCounter = MouseWheelSource.resizeFrameCounter - 50;
            CacheIoRequest.windowCanvas.setSize(WeightedLruCache.canvasWidth, WidgetPaintStyle.canvasHeight);
            CacheIoRequest.windowCanvas.setVisible(true);
            if (null != MatchingTextValidator.field_o &&
              null == BackgroundRegistry.field_e) {
              insets = MatchingTextValidator.field_o.getInsets();
              CacheIoRequest.windowCanvas.setLocation(insets.left + WeightedLruCache.canvasOffsetX, insets.top + LoginPanel.field_W);
              if (BrickABrac.field_J) {
                CacheIoRequest.windowCanvas.setLocation(WeightedLruCache.canvasOffsetX, LoginPanel.field_W);
              }
            } else {
              CacheIoRequest.windowCanvas.setLocation(WeightedLruCache.canvasOffsetX, LoginPanel.field_W);
            }
          }
          this.renderClient(obfuscationGuard + 102);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ke.W(" + obfuscationGuard + ')');
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          CircleBody.liveFocus = true;
          GameplayAudioEvent.redrawRequested = true;
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
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void stop() {
        if (QuickChatCategoryRegistry.field_f != this ||
          ParisBackground.field_s) {
          return;
        }
        try {
          BufferedFile.shutdownDeadlineMillis = MonotonicTime.nowMillis(false) + 4000L;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ke.stop()");
        }
    }

    public static void d(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          faceGroupOffsets = null;
          if (param0 != 19254) {
            AppletGameShell.shuffleFivePasses((int[]) null, (byte) -57, (IsaacGenerator) null);
          }
          field_b = null;
          field_f = null;
          field_n = null;
          field_k = null;
          field_e = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var1), "ke.O(" + param0 + ')');
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    private final void shutdown(boolean clean, int obfuscationGuard) {
        Exception exception = null;
        Exception var4_ref = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        int var3_int = 0;
        Throwable decompiledCaughtException = null;
        Throwable var4 = null;
        try {
          var3 = this;
          synchronized (var3) {
            if (ParisBackground.field_s) {
              return;
            }
            ParisBackground.field_s = true;
          }
          if (null != CacheEntry.field_x) {
            CacheEntry.field_x.destroy();
          }
          try {
            this.stopClientServices(false);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          var3_int = -40 % ((-22 - obfuscationGuard) / 54);
          if (CacheIoRequest.windowCanvas != null) {
            try {
              CacheIoRequest.windowCanvas.removeFocusListener((java.awt.event.FocusListener) (this));
              CacheIoRequest.windowCanvas.getParent().remove((java.awt.Component) ((Object) CacheIoRequest.windowCanvas));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4_ref = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (AccountMessageDialog.field_ub != null) {
            try {
              AccountMessageDialog.field_ub.shutdown(true);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var4_ref = (Exception) (Object) decompiledCaughtException;
            }
          }
          this.clearClientResources(true);
          if (null != MatchingTextValidator.field_o) {
            try {
              System.exit(0);
            } catch (java.lang.Throwable decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              var4 = decompiledCaughtException;
            }
          }
          System.out.println("Shutdown complete - clean:" + clean);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ke.BA(" + clean + ',' + obfuscationGuard + ')');
        }
    }

    final synchronized void c(boolean param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          if (CacheIoRequest.windowCanvas != null) {
            CacheIoRequest.windowCanvas.removeFocusListener((java.awt.event.FocusListener) (this));
            CacheIoRequest.windowCanvas.getParent().setBackground(java.awt.Color.black);
            CacheIoRequest.windowCanvas.getParent().remove((java.awt.Component) ((Object) CacheIoRequest.windowCanvas));
          }
          boolean decompiledFrameRemainder0 = true;
          if (BackgroundRegistry.field_e == null) {
            if (null != MatchingTextValidator.field_o) {
              var2 = MatchingTextValidator.field_o;
              decompiledFrameRemainder0 = (var4 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (null == CacheEntry.field_x) {
                var2 = QuickChatCategoryRegistry.field_f;
                if (var4 != 0) {
                  var2 = CacheEntry.field_x;
                  var2 = BackgroundRegistry.field_e;
                }
              } else {
                var2 = CacheEntry.field_x;
                if (var4 != 0) {
                  var2 = BackgroundRegistry.field_e;
                }
              }
            }
          } else {
            var2 = BackgroundRegistry.field_e;
          }
          ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
          CacheIoRequest.windowCanvas = (java.awt.Canvas) ((Object) new DelegatingCanvas((java.awt.Component) (this)));
          ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) CacheIoRequest.windowCanvas));
          CacheIoRequest.windowCanvas.setSize(WeightedLruCache.canvasWidth, WidgetPaintStyle.canvasHeight);
          CacheIoRequest.windowCanvas.setVisible(true);
          if (MatchingTextValidator.field_o == var2) {
            var3 = MatchingTextValidator.field_o.getInsets();
            CacheIoRequest.windowCanvas.setLocation(var3.left + WeightedLruCache.canvasOffsetX, var3.top + LoginPanel.field_W);
            if (var4 != 0) {
              CacheIoRequest.windowCanvas.setLocation(WeightedLruCache.canvasOffsetX, LoginPanel.field_W);
            }
          } else {
            CacheIoRequest.windowCanvas.setLocation(WeightedLruCache.canvasOffsetX, LoginPanel.field_W);
          }
          CacheIoRequest.windowCanvas.addFocusListener((java.awt.event.FocusListener) (this));
          CacheIoRequest.windowCanvas.requestFocus();
          CircleBody.liveFocus = true;
          NinjaBackground.frameFocus = true;
          GameplayAudioEvent.redrawRequested = true;
          MusicCrossfadeStream.field_A = param0;
          er.field_c = MonotonicTime.nowMillis(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) (var2), "ke.DA(" + param0 + ')');
        }
    }

    final static byte[] copyBytes(boolean obfuscationGuard, byte[] data) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard) {
            field_e = (UiComponent) null;
          }
          var2_int = data.length;
          var3 = new byte[var2_int];
          ArrayOperations.copy(data, 0, var3, 0, var2_int);
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("ke.R(").append(obfuscationGuard).append(',');
          if (data == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          CircleBody.liveFocus = false;
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
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final void a(String param0, int param1) {
        try {
          Throwable throwable = null;
          Exception exception = null;
          RuntimeException runtimeException = null;
          RuntimeException stackIn_17_0 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (this.field_d) {
              return;
            }
            this.field_d = true;
            System.out.println("error_game_" + param0);
            try {
              AppletJavaScriptBridge.callFunctionWithoutArguments("loggedout", -123, EmailConfirmationValidator.e((byte) -124));
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
            if (param1 != 4000) {
              field_k = (String) null;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            runtimeException = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_17_0 = runtimeException;
            stackIn_17_1 = new StringBuilder().append("ke.CA(");
            if (param0 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void initializeClient(boolean obfuscationGuard);

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this == QuickChatCategoryRegistry.field_f &&
            !ParisBackground.field_s) {
            BufferedFile.shutdownDeadlineMillis = MonotonicTime.nowMillis(false);
            BytePayloadRequest.sleepMillis(-127, 5000L);
            LevelPackLoader.field_e = null;
            this.shutdown(false, 46);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ke.destroy()");
        }
    }

    abstract void stopClientServices(boolean obfuscationGuard);

    abstract void clearClientResources(boolean obfuscationGuard);

    final static String a(byte param0, long param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          field_n.setTime(new Date(param1));
          var3_int = field_n.get(7);
          var4 = field_n.get(5);
          var5 = field_n.get(2);
          var6 = field_n.get(1);
          var7 = field_n.get(11);
          if (param0 != -75) {
            AppletGameShell.shuffleFivePasses((int[]) null, (byte) -75, (IsaacGenerator) null);
          }
          var8 = field_n.get(12);
          var9 = field_n.get(13);
          stackIn_4_0 = JungleBackground.field_u[-1 + var3_int] + ", " + var4 / 10 + var4 % 10 + "-" + FullscreenFailureDialog.field_eb[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var3), "ke.P(" + param0 + ',' + param1 + ')');
        }
    }

    abstract void renderClient(int obfuscationGuard);

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          CacheEntry.field_x = param0;
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
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void start() {
        if (QuickChatCategoryRegistry.field_f != this ||
          ParisBackground.field_s) {
          return;
        }
        try {
          BufferedFile.shutdownDeadlineMillis = 0L;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ke.start()");
        }
    }

    public abstract void init();

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
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
          if (MatchingTextValidator.field_o != null) {
            stackIn_4_0 = null;
            return (String) (stackIn_4_0);
          }
          if (null != CacheEntry.field_x &&
            this != CacheEntry.field_x) {
            stackIn_10_0 = CacheEntry.field_x.getParameter(param0);
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
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    protected AppletGameShell() {
        this.field_d = false;
    }

    final static void sendTableRow(int opcode, TableRowSubmission submission, int obfuscationGuard) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        BitPacketBuffer var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          var3 = TextFieldValidator.outgoingPackets;
          var3.writeCipheredOpcode(obfuscationGuard ^ -3818, opcode);
          var3.position = var3.position + 1;
          var4 = var3.position;
          var3.writeByte(106, 1);
          var3.writeShort((byte) 116, submission.requestId);
          var3.writeShort((byte) 112, submission.tableId);
          var3.writeShort((byte) 127, submission.tableWord);
          var3.writeInt(submission.resultWordOne, (byte) -79);
          var3.writeInt(submission.resultWordTwo, (byte) -79);
          var3.writeInt(submission.resultWordThree, (byte) -79);
          if (obfuscationGuard != 14989) {
            field_f = (String) null;
          }
          var3.writeInt(submission.resultWordFour, (byte) -79);
          var3.writeByte(-28, submission.values.length);
          var5 = 0;
          while (var5 < submission.values.length) {
            var3.writeInt(submission.values[var5], (byte) -79);
            var5++;
            if (var6 != 0) {
              return;
            }
          }
          var3.appendCrc32(3, var4);
          var3.backfillByteLength((byte) 113, var3.position - var4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("ke.Q(").append(opcode).append(',');
          if (submission == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(obfuscationGuard).append(')').toString());
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
          stackIn_5_1 = new StringBuilder().append("ke.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    static {
        field_k = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_n = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        faceGroupOffsets = new int[128];
        field_b = null;
        field_f = "Shrink: makes your paddle shorter.";
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
