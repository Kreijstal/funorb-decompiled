/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class GameAppletShell extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static String field_f;
    boolean errorReported;
    static String field_g;
    static boolean field_k;
    static int field_a;
    public static boolean field_h;
    public static boolean field_l;
    public static int field_e;
    public static int field_i;
    public static int field_d;
    public static boolean field_c;
    public static boolean field_j;

    final boolean isHostAllowed(boolean guard) {
        return true;
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    final void startAppletThread(int gameCrc, int indexCount, int threadPriority, int width, int height, int cacheBuild, String cacheName) {
        try {
          String stackIn_22_2 = null;
          Throwable decompiledCaughtException = null;
          int var9 = EscapeVector.obfuscationControl;
          try {
            try {
              if (null != StatefulTextPainter.field_r) {
                DynamicTerrainRenderer.field_b = DynamicTerrainRenderer.field_b + 1;
                if (DynamicTerrainRenderer.field_b < 3) {
                  this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                  return;
                }
                this.showErrorPage(-1, "alreadyloaded");
                return;
              }
              AppletViewportState.canvasWidth = width;
              NameAvailabilityResponseSupport.field_b = width;
              BoundedUrlRequest.field_d = height;
              DropTargetWidget.field_G = height;
              StatefulTextPainter.field_r = this;
              Js5NetworkRequest.field_D = 0;
              MenuTitleRenderSupport.field_b = 0;
              UiTheme.field_n = gameCrc;
              IntrusiveNode.field_c = PointCloudEffect.activeApplet((byte) -109);
              SystemTaskService dupTemp$1 = new SystemTaskService(cacheBuild, cacheName, indexCount, true);
              NetworkGameClient.taskService = dupTemp$1;
              SpriteCheckboxPainter.field_a = dupTemp$1;
              SystemTask var8 = NetworkGameClient.taskService.startThread(true, threadPriority, (Runnable) (this));
              while (true) {
                if (var8.status == 0) {
                  AchievementTracker.sleepMillis((byte) 100, 10L);
                  if (var9 == 0) {
                    continue;
                  }
                }
                break;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              Throwable var8_ref = decompiledCaughtException;
              GameModeSelectScreen.reportClientError(false, (String) null, var8_ref);
              this.showErrorPage(-1, "crash");
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            RuntimeException var8_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_21_0 = var8_ref2;
            StringBuilder stackIn_21_1 = new StringBuilder().append("eh.M(").append(gameCrc).append(',').append(indexCount).append(',').append(threadPriority).append(',').append(width).append(',').append(height).append(',').append(cacheBuild).append(',');
            if (cacheName == null) {
              stackIn_22_2 = "null";
            } else {
              stackIn_22_2 = "{...}";
            }
            throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final java.net.URL getDocumentBase() {
        try {
          if (PathPoint.field_i != null) {
            Object stackIn_4_0 = null;
            return (java.net.URL) (stackIn_4_0);
          }
          if (null != ModalPanel.field_P &&
            ModalPanel.field_P != this) {
            java.net.URL stackIn_10_0 = ModalPanel.field_P.getDocumentBase();
            return stackIn_10_0;
          }
          java.net.URL stackIn_12_0 = super.getDocumentBase();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var1), "eh.getDocumentBase()");
        }
    }

    abstract void shutdownClientServices(boolean guard);

    abstract void releaseClientStatics(byte guard);

    public final void focusLost(java.awt.event.FocusEvent param0) {
        String stackIn_6_2 = null;
        try {
          AchievementRecord.field_l = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_5_0 = runtimeException;
          StringBuilder stackIn_5_1 = new StringBuilder().append("eh.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte guard) {
        try {
          field_g = null;
          if (guard != -111) {
            field_k = false;
          }
          field_f = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var1), "eh.Q(" + guard + ')');
        }
    }

    public final java.applet.AppletContext getAppletContext() {
        try {
          if (null != PathPoint.field_i) {
            Object stackIn_2_0 = null;
            return (java.applet.AppletContext) (stackIn_2_0);
          }
          if (null != ModalPanel.field_P &&
            this != ModalPanel.field_P) {
            java.applet.AppletContext stackIn_10_0 = ModalPanel.field_P.getAppletContext();
            return stackIn_10_0;
          }
          java.applet.AppletContext stackIn_12_0 = super.getAppletContext();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var1), "eh.getAppletContext()");
        }
    }

    private final void executeClientTick(int guard) {
        try {
          long var2_long = MonotonicClockSupport.monotonicMillis(128);
          long var4 = CipherPacketBuffer.field_t[SingleChildContainer.field_z];
          CipherPacketBuffer.field_t[SingleChildContainer.field_z] = var2_long;
          SingleChildContainer.field_z = 31 & SingleChildContainer.field_z + 1;
          if (guard != 48) {
            field_a = -22;
          }
          if (var4 != 0L &&
            var2_long > var4) {
            int var6_int = (int)(var2_long - var4);
            NanoTickClock.field_j = ((var6_int >> 1) + 32000) / var6_int;
          }
          Object var6 = this;
          synchronized (var6) {
            ObjectSpriteSet.field_b = AchievementRecord.field_l;
          }
          this.updateClient(-111);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          Throwable decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "eh.N(" + guard + ')');
        }
    }

    public final void stop() {
        if (StatefulTextPainter.field_r != this ||
          RatingQuery.field_j) {
          return;
        }
        try {
          LegacyMenuColumn.field_p = 4000L + MonotonicClockSupport.monotonicMillis(128);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "eh.stop()");
        }
    }

    final static boolean isCp1252Character(int guard, char character) {
        int stackIn_28_0 = 0;
        int var5 = EscapeVector.obfuscationControl;
        try {
          if ((character <= 0 ||
            character >= 128) &&
            (character < 160 ||
            character > 255)) {
            boolean decompiledFrameCompleted0 = true;
            if (character != guard) {
              char[] var2_array = IntrusiveDeque.field_c;
              int var3 = 0;
              while (var2_array.length > var3) {
                int var4 = var2_array[var3];
                stackIn_28_0 = ~character;
                if (var5 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (stackIn_28_0 == ~var4) {
                  return true;
                }
                var3++;
              }
            }
            if (decompiledFrameCompleted0) {
              stackIn_28_0 = 0;
            }
            return stackIn_28_0 != 0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var2), "eh.K(" + guard + ',' + character + ')');
        }
    }

    abstract void updateClient(int guard);

    final void showErrorPage(int guard, String errorCode) {
        try {
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (guard != -1) {
              field_k = true;
            }
            if (this.errorReported) {
              return;
            }
            this.errorReported = true;
            System.out.println("error_game_" + errorCode);
            try {
              JavaScriptBridge.callWindowFunction(PointCloudEffect.activeApplet((byte) -87), "loggedout", -29155);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              Throwable var3 = decompiledCaughtException;
            }
            try {
              this.getAppletContext().showDocument(new java.net.URL(this.getCodeBase(), "error_game_" + errorCode + ".ws"), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              Exception var3_ref = (Exception) (Object) decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            RuntimeException var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_18_0 = var3_ref2;
            StringBuilder stackIn_18_1 = new StringBuilder().append("eh.F(").append(guard).append(',');
            if (errorCode == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void destroy() {
        try {
          if (this == StatefulTextPainter.field_r &&
            !RatingQuery.field_j) {
            LegacyMenuColumn.field_p = MonotonicClockSupport.monotonicMillis(128);
            AchievementTracker.sleepMillis((byte) 100, 5000L);
            SpriteCheckboxPainter.field_a = null;
            this.shutdownApplet((byte) 107, false);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "eh.destroy()");
        }
    }

    public final String getParameter(String param0) {
        String stackIn_17_2 = null;
        try {
          if (null != PathPoint.field_i) {
            Object stackIn_4_0 = null;
            return (String) (stackIn_4_0);
          }
          if (ModalPanel.field_P != null &&
            this != ModalPanel.field_P) {
            String stackIn_10_0 = ModalPanel.field_P.getParameter(param0);
            return stackIn_10_0;
          }
          String stackIn_12_0 = super.getParameter(param0);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_16_0 = var2;
          StringBuilder stackIn_16_1 = new StringBuilder().append("eh.getParameter(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    public final void run() {
        try {
          boolean stackIn_66_0 = false;
          int stackIn_79_0 = 0;
          int stackIn_79_1 = 0;
          int stackIn_98_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var1 = null;
          int var3 = 0;
          int var5 = EscapeVector.obfuscationControl;
          try {
            try {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              if (SystemTaskService.javaVendor != null) {
                var1 = SystemTaskService.javaVendor.toLowerCase();
                if (((String) (var1)).indexOf("sun") != -1 ||
                  -1 != ((String) (var1)).indexOf("apple")) {
                  String var2 = SystemTaskService.javaVersion;
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
                    this.showErrorPage(-1, "wrongjava");
                    decompiledFrameRemainder3 = (var5 != 0);
                  }
                  if (decompiledFrameRemainder3 &&
                    var2.startsWith("1.6.0_")) {
                    var3 = 6;
                    while (var3 < var2.length()) {
                      stackIn_66_0 = IntroAudioSupport.isAsciiDigit(var2.charAt(var3), false);
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
                      String var4 = var2.substring(6, var3);
                      if (LoginCredentialType.isDecimalText(false, (CharSequence) ((Object) var4)) &&
                        !(ModeProgress.parseDecimal(16777215, (CharSequence) ((Object) var4)) >= 10)) {
                        this.showErrorPage(-1, "wrongjava");
                        decompiledFrameRemainder3 = (var5 != 0);
                      }
                    }
                  }
                }
              }
              if (decompiledFrameRemainder3 && decompiledFrameCompleted0 &&
                (decompiledFrameRemainder2 = (null != SystemTaskService.javaVersion))) {
                stackIn_66_0 = SystemTaskService.javaVersion.startsWith("1.");
              }
              if (decompiledFrameRemainder3 &&
                decompiledFrameRemainder2 &&
                stackIn_66_0) {
                int var1_int = 2;
                int var2_int = 0;
                while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (SystemTaskService.javaVersion.length() > var1_int) {
                    var3 = SystemTaskService.javaVersion.charAt(var1_int);
                    stackIn_79_0 = ~var3;
                    stackIn_79_1 = -49;
                    decompiledFrameRemainder1 = (var5 == 0);
                    if (decompiledFrameRemainder1 && (stackIn_79_0 <= stackIn_79_1 &&
                      57 >= var3)) {
                      var1_int++;
                      var2_int = var3 - 48 + var2_int * 10;
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
                  GzipDecoder.field_c = true;
                  break;
                }
              }
              if (decompiledFrameRemainder3) {
                var1 = StatefulTextPainter.field_r;
                if (ModalPanel.field_P != null) {
                  var1 = ModalPanel.field_P;
                }
                java.lang.reflect.Method var2_ref = SystemTaskService.setFocusCycleRootMethod;
                if (var2_ref != null) {
                  try {
                    var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    Throwable var3_ref_Throwable = decompiledCaughtException;
                  }
                }
                DelayedServerPacket.detectMaximumHeap((byte) -61);
                this.replaceCanvas(2);
                AlphaContainer.field_D = PcmResampler.createRasterBuffer((java.awt.Component) ((Object) SpriteDecodeSupport.field_d), BoundedUrlRequest.field_d, (byte) 125, AppletViewportState.canvasWidth);
                this.initializeClient((byte) -97);
                IntrusiveNodeHashTable.field_f = MinimapPoint.createTickClock(18863);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (0L != LegacyMenuColumn.field_p) {
                    stackIn_98_0 = compareLongs(LegacyMenuColumn.field_p, MonotonicClockSupport.monotonicMillis(128));
                    decompiledFrameRemainder0 = (var5 == 0);
                    if (decompiledFrameRemainder0 &&
                      stackIn_98_0 <= 0) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    Js5NetworkRequest.field_z = IntrusiveNodeHashTable.field_f.waitAndAdvance(LoginText.field_d, 97);
                    stackIn_98_0 = 0;
                  }
                  var3 = stackIn_98_0;
                  do {
                    if (!(var3 < Js5NetworkRequest.field_z)) {
                      this.executeRenderFrame((byte) 92);
                      FullscreenFocusCanvas.pumpEventQueue((byte) -61, NetworkGameClient.taskService, SpriteDecodeSupport.field_d);
                      break;
                    }
                    this.executeClientTick(48);
                    var3++;
                  } while (var5 == 0);
                } while (var5 == 0);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = decompiledCaughtException;
              GameModeSelectScreen.reportClientError(false, (String) null, (Throwable) (var1));
              this.showErrorPage(-1, "crash");
            }
            this.shutdownApplet((byte) 101, true);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw MainMenuScreen.wrapClientException((Throwable) (var1), "eh.run()");
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void executeRenderFrame(byte guard) {
        try {
          long var2_long = MonotonicClockSupport.monotonicMillis(128);
          long var4 = TileSpriteCacheEntry.field_d[RatingQuery.field_h];
          TileSpriteCacheEntry.field_d[RatingQuery.field_h] = var2_long;
          RatingQuery.field_h = 1 + RatingQuery.field_h & 31;
          if (var4 != 0L &&
            var4 < var2_long) {
            int var6 = (int)(-var4 + var2_long);
            Bzip2State.field_p = ((var6 >> 1) + 32000) / var6;
          }
          int fieldTemp$0 = QuickChatPhraseDefinition.field_r;
          QuickChatPhraseDefinition.field_r = QuickChatPhraseDefinition.field_r + 1;
          if (fieldTemp$0 > 50) {
            QuickChatPhraseDefinition.field_r = QuickChatPhraseDefinition.field_r - 50;
            NameSuggestionsPanel.field_H = true;
            SpriteDecodeSupport.field_d.setSize(AppletViewportState.canvasWidth, BoundedUrlRequest.field_d);
            SpriteDecodeSupport.field_d.setVisible(true);
            if (null != PathPoint.field_i &&
              null == PathPoint.field_f) {
              java.awt.Insets var6_ref_java_awt_Insets = PathPoint.field_i.getInsets();
              SpriteDecodeSupport.field_d.setLocation(var6_ref_java_awt_Insets.left + MenuTitleRenderSupport.field_b, Js5NetworkRequest.field_D + var6_ref_java_awt_Insets.top);
              if (EscapeVector.obfuscationControl != 0) {
                SpriteDecodeSupport.field_d.setLocation(MenuTitleRenderSupport.field_b, Js5NetworkRequest.field_D);
              }
            } else {
              SpriteDecodeSupport.field_d.setLocation(MenuTitleRenderSupport.field_b, Js5NetworkRequest.field_D);
            }
          }
          this.renderClient((byte) 26);
          int var6Lifetime1 = 112 % ((guard + 83) / 36);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var2), "eh.J(" + guard + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
        String stackIn_6_2 = null;
        try {
          AchievementRecord.field_l = true;
          NameSuggestionsPanel.field_H = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_5_0 = runtimeException;
          StringBuilder stackIn_5_1 = new StringBuilder().append("eh.focusGained(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void update(java.awt.Graphics param0) {
        String stackIn_6_2 = null;
        try {
          this.paint(param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_5_0 = runtimeException;
          StringBuilder stackIn_5_1 = new StringBuilder().append("eh.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    abstract void renderClient(byte guard);

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (PathPoint.field_i != null) {
          return null;
        }
        if (null != ModalPanel.field_P &&
          ModalPanel.field_P != this) {
          return ModalPanel.field_P.getCodeBase();
        }
        return super.getCodeBase();
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    abstract void initializeClient(byte guard);

    final static void showEmptyLoginForm(int guard) {
        try {
          IntValueNode.showLoginForm("", (String) null, 63);
          if (guard >= -12) {
            GameAppletShell.releaseStatics((byte) 116);
          }
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "eh.A(" + guard + ')');
        }
    }

    protected GameAppletShell() {
        this.errorReported = false;
    }

    public abstract void init();

    final static void drawFadingPanelFrame(int alpha, int left, int top, int darkColor, int frameId, int bottom, int guard, int right, int lightColor, int accentColor, int openingOffset) {
        try {
          SoftwareRasterizer.fillRectangleAlpha(left + 1, top + 1, -2 - left + right, -2 - top + bottom, 0, alpha);
          AccountMessagePanel.drawUnevenFrame(darkColor, right, lightColor, frameId, top, -28, left, bottom, openingOffset);
          if (guard != -3) {
            GameAppletShell.releaseStatics((byte) 59);
          }
          if (0 <= accentColor) {
            AccountMessagePanel.drawUnevenFrame(accentColor, right - 3, darkColor, -1, top + 3, 110, 3 + left, -3 + bottom, openingOffset);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var11 = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var11), "eh.G(" + alpha + ',' + left + ',' + top + ',' + darkColor + ',' + frameId + ',' + bottom + ',' + guard + ',' + right + ',' + lightColor + ',' + accentColor + ',' + openingOffset + ')');
        }
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    public final void start() {
        try {
          if (StatefulTextPainter.field_r == this &&
            !RatingQuery.field_j) {
            LegacyMenuColumn.field_p = 0L;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "eh.start()");
        }
    }

    public final void windowClosing(java.awt.event.WindowEvent param0) {
        String stackIn_6_2 = null;
        try {
          this.destroy();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_5_0 = runtimeException;
          StringBuilder stackIn_5_1 = new StringBuilder().append("eh.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        String stackIn_24_2 = null;
        try {
          if (StatefulTextPainter.field_r == this &&
            !RatingQuery.field_j) {
            NameSuggestionsPanel.field_H = true;
            if (GzipDecoder.field_c &&
              -AccountPayloadSupport.field_c + MonotonicClockSupport.monotonicMillis(128) > 1000L) {
              java.awt.Rectangle var2 = param0.getClipBounds();
              if (null != var2) {
                if (var2.width < NameAvailabilityResponseSupport.field_b) {
                  return;
                }
                if (var2.height < DropTargetWidget.field_G) {
                  return;
                }
              }
              PacketBuffer.field_i = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2_ref = decompiledCaughtException;
          RuntimeException stackIn_23_0 = var2_ref;
          StringBuilder stackIn_23_1 = new StringBuilder().append("eh.paint(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        String stackIn_6_2 = null;
        try {
          ModalPanel.field_P = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_5_0 = runtimeException;
          StringBuilder stackIn_5_1 = new StringBuilder().append("eh.provideLoaderApplet(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final synchronized void replaceCanvas(int guard) {
        Object var3 = null;
        int var5 = EscapeVector.obfuscationControl;
        try {
          if (SpriteDecodeSupport.field_d != null) {
            SpriteDecodeSupport.field_d.removeFocusListener((java.awt.event.FocusListener) (this));
            SpriteDecodeSupport.field_d.getParent().setBackground(java.awt.Color.black);
            SpriteDecodeSupport.field_d.getParent().remove((java.awt.Component) ((Object) SpriteDecodeSupport.field_d));
          }
          boolean decompiledFrameRemainder0 = true;
          int var2_int = -119 % ((76 - guard) / 49);
          if (PathPoint.field_f == null) {
            if (PathPoint.field_i != null) {
              var3 = PathPoint.field_i;
              decompiledFrameRemainder0 = (var5 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (ModalPanel.field_P != null) {
                var3 = ModalPanel.field_P;
                if (var5 != 0) {
                  var3 = StatefulTextPainter.field_r;
                  var3 = PathPoint.field_f;
                }
              } else {
                var3 = StatefulTextPainter.field_r;
                if (var5 != 0) {
                  var3 = PathPoint.field_f;
                }
              }
            }
          } else {
            var3 = PathPoint.field_f;
          }
          ((java.awt.Container) (var3)).setLayout((java.awt.LayoutManager) null);
          SpriteDecodeSupport.field_d = (java.awt.Canvas) ((Object) new DelegatingCanvas((java.awt.Component) (this)));
          ((java.awt.Container) (var3)).add((java.awt.Component) ((Object) SpriteDecodeSupport.field_d));
          SpriteDecodeSupport.field_d.setSize(AppletViewportState.canvasWidth, BoundedUrlRequest.field_d);
          SpriteDecodeSupport.field_d.setVisible(true);
          if (var3 == PathPoint.field_i) {
            java.awt.Insets var4 = PathPoint.field_i.getInsets();
            SpriteDecodeSupport.field_d.setLocation(var4.left + MenuTitleRenderSupport.field_b, var4.top + Js5NetworkRequest.field_D);
            if (var5 != 0) {
              SpriteDecodeSupport.field_d.setLocation(MenuTitleRenderSupport.field_b, Js5NetworkRequest.field_D);
            }
          } else {
            SpriteDecodeSupport.field_d.setLocation(MenuTitleRenderSupport.field_b, Js5NetworkRequest.field_D);
          }
          SpriteDecodeSupport.field_d.addFocusListener((java.awt.event.FocusListener) (this));
          SpriteDecodeSupport.field_d.requestFocus();
          ObjectSpriteSet.field_b = true;
          AchievementRecord.field_l = true;
          NameSuggestionsPanel.field_H = true;
          PacketBuffer.field_i = false;
          AccountPayloadSupport.field_c = MonotonicClockSupport.monotonicMillis(128);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var2), "eh.L(" + guard + ')');
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    final static int parseInt(int radix, int guard, CharSequence text) {
        String stackIn_9_2 = null;
        try {
          if (guard != 27672) {
            GameAppletShell.drawFadingPanelFrame(31, -73, -54, 36, 120, -37, -8, -46, 86, 6, -127);
          }
          int stackIn_4_0 = IntegerParseSupport.parseInt(true, radix, text, 97);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var3;
          StringBuilder stackIn_8_1 = new StringBuilder().append("eh.C(").append(radix).append(',').append(guard).append(',');
          if (text == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void shutdownApplet(byte guard, boolean clean) {
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        Exception var3_ref2 = null;
        try {
          Object var3_ref = this;
          synchronized (var3_ref) {
            if (RatingQuery.field_j) {
              return;
            }
            RatingQuery.field_j = true;
          }
          if (null != ModalPanel.field_P) {
            ModalPanel.field_P.destroy();
          }
          try {
            if (guard < 100) {
              this.run();
            }
            this.shutdownClientServices(true);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref2 = (Exception) (Object) decompiledCaughtException;
          }
          if (SpriteDecodeSupport.field_d != null) {
            try {
              SpriteDecodeSupport.field_d.removeFocusListener((java.awt.event.FocusListener) (this));
              SpriteDecodeSupport.field_d.getParent().remove((java.awt.Component) ((Object) SpriteDecodeSupport.field_d));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3_ref2 = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (NetworkGameClient.taskService != null) {
            try {
              NetworkGameClient.taskService.shutdown(0);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3_ref2 = (Exception) (Object) decompiledCaughtException;
            }
          }
          this.releaseClientStatics((byte) -105);
          if (PathPoint.field_i != null) {
            try {
              System.exit(0);
            } catch (java.lang.Throwable decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              Throwable var3_ref3 = decompiledCaughtException;
            }
          }
          System.out.println("Shutdown complete - clean:" + clean);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          RuntimeException runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "eh.I(" + guard + ',' + clean + ')');
        }
    }

    static {
        field_f = "You are unable to access this level yet.";
        field_a = -1;
    }

    private static int compareLongs(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
