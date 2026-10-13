/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class GameAppletShell extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static fl field_b;
    static String field_a;
    static String field_m;
    static int[][] field_e;
    static String field_c;
    boolean errorReported;
    public static boolean field_k;
    public static boolean field_g;
    public static int field_f;
    public static int field_d;
    public static int field_j;
    public static int field_l;
    public static boolean field_h;

    public abstract void init();

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
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
          if (ContextualRuntimeException.field_f != null) {
            stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          if (la.loaderApplet != null &&
            this != la.loaderApplet) {
            stackIn_8_0 = la.loaderApplet.getParameter(param0);
            return stackIn_8_0;
          }
          stackIn_10_0 = super.getParameter(param0);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("iv.getParameter(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        java.awt.Rectangle clipBounds = null;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String graphicsDescription = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        try {
          if (this == IntKeyLookup.activeGameShell &&
            !PcmPlayerService.clientShutdownStarted) {
            MaskedTextEntryPainter.redrawRequested = true;
            if (se.field_c &&
              -AttackEvent.lastCanvasRebuildMillis + vi.monotonicMillis(62) > 1000L) {
              clipBounds = param0.getClipBounds();
              if (null != clipBounds) {
                if (GuestPlayConfirmationForm.canvasWidth > clipBounds.width) {
                  return;
                }
                if (MatchSetupPanel.canvasHeight > clipBounds.height) {
                  return;
                }
              }
              tq.canvasRebuildRequested = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("iv.paint(");
          if (param0 == null) {
            graphicsDescription = "null";
          } else {
            graphicsDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(graphicsDescription).append(')').toString());
        }
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (IntKeyLookup.activeGameShell == this &&
            !PcmPlayerService.clientShutdownStarted) {
            ActionRequest.shutdownDeadlineMillis = vi.monotonicMillis(-46);
            SpriteButtonPainter.a(5000L, 0);
            PacketBuffer.field_s = null;
            this.shutdownShell(false, -1251);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "iv.destroy()");
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
          stackIn_5_1 = new StringBuilder().append("iv.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          la.loaderApplet = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("iv.provideLoaderApplet(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void stop() {
        if (IntKeyLookup.activeGameShell != this ||
          PcmPlayerService.clientShutdownStarted) {
          return;
        }
        try {
          ActionRequest.shutdownDeadlineMillis = 4000L + vi.monotonicMillis(-62);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "iv.stop()");
        }
    }

    final boolean e(int param0) {
        return true;
    }

    final void startAppletShell(int width, int requestedCacheStoreId, String requestedCacheName, int obfuscationGuard, int revision, int cacheIndexCount, int height) {
        try {
          PlatformTaskService dupTemp$0 = null;
          RuntimeException stackIn_25_0 = null;
          StringBuilder stackIn_25_1 = null;
          String stackIn_26_2 = null;
          Throwable decompiledCaughtException = null;
          PlatformTask var8 = null;
          Throwable var8_ref = null;
          RuntimeException var8_ref2 = null;
          int var9 = 0;
          var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
          try {
            try {
              if (IntKeyLookup.activeGameShell != null) {
                DropdownArrowPainter.field_b = DropdownArrowPainter.field_b + 1;
                if (DropdownArrowPainter.field_b >= 3) {
                  this.reportGameError("alreadyloaded", (byte) -85);
                  return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
              }
              mh.field_c = 0;
              bn.field_b = width;
              GuestPlayConfirmationForm.canvasWidth = width;
              DualNodeIterator.field_b = 0;
              SummonRequest.field_B = revision;
              dt.field_a = height;
              MatchSetupPanel.canvasHeight = height;
              IntKeyLookup.activeGameShell = this;
              if (obfuscationGuard != 10) {
                return;
              }
              ToggleWidget.field_L = CombatEvent.d((byte) 10);
              dupTemp$0 = new PlatformTaskService(requestedCacheStoreId, requestedCacheName, cacheIndexCount, true);
              IntPair.field_m = dupTemp$0;
              PacketBuffer.field_s = dupTemp$0;
              var8 = IntPair.field_m.startThreadAsync(1, 0, (Runnable) (this));
              while (true) {
                if (var8.status == 0) {
                  SpriteButtonPainter.a(10L, obfuscationGuard ^ 10);
                  if (var9 == 0) {
                    continue;
                  }
                }
                break;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8_ref = decompiledCaughtException;
              af.a(var8_ref, obfuscationGuard - 118, (String) null);
              this.reportGameError("crash", (byte) -62);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var8_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_25_0 = var8_ref2;
            stackIn_25_1 = new StringBuilder().append("iv.AB(").append(width).append(',').append(requestedCacheStoreId).append(',');
            if (requestedCacheName == null) {
              stackIn_26_2 = "null";
            } else {
              stackIn_26_2 = "{...}";
            }
            throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(obfuscationGuard).append(',').append(revision).append(',').append(cacheIndexCount).append(',').append(height).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void runClientTick(int obfuscationGuard) {
        RuntimeException failure = null;
        long nowMillis = 0L;
        long previousTimestamp = 0L;
        Throwable caughtFailure = null;
        Object focusMonitor = null;
        try {
          nowMillis = vi.monotonicMillis(120);
          previousTimestamp = CampaignMission.tickTimestampsMillis[MusicPatchPcmStream.tickTimestampIndex];
          CampaignMission.tickTimestampsMillis[MusicPatchPcmStream.tickTimestampIndex] = nowMillis;
          if (0L != previousTimestamp &&
            previousTimestamp >= nowMillis) {
          }
          if (obfuscationGuard != 17684) {
            this.destroy();
          }
          MusicPatchPcmStream.tickTimestampIndex = 1 + MusicPatchPcmStream.tickTimestampIndex & 31;
          focusMonitor = this;
          synchronized (focusMonitor) {
            ph.tickFocusSnapshot = wj.canvasFocused;
          }
          this.tickClient((byte) -120);
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = (RuntimeException) (Object) caughtFailure;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failure), "iv.WA(" + obfuscationGuard + ')');
        }
    }

    abstract void shutdownClient(byte obfuscationGuard);

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    final void reportGameError(String errorCode, byte obfuscationGuard) {
        try {
          RuntimeException stackIn_15_0 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3 = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          try {
            if (this.errorReported) {
              return;
            }
            this.errorReported = true;
            System.out.println("error_game_" + errorCode);
            try {
              lj.a("loggedout", (byte) -121, CombatEvent.d((byte) -123));
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = decompiledCaughtException;
            }
            try {
              if (obfuscationGuard >= -35) {
                return;
              }
              this.getAppletContext().showDocument(new java.net.URL(this.getCodeBase(), "error_game_" + errorCode + ".ws"), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3_ref = (Exception) (Object) decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_15_0 = var3_ref2;
            stackIn_15_1 = new StringBuilder().append("iv.TA(");
            if (errorCode == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(obfuscationGuard).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void initializeClient(boolean obfuscationGuard);

    private final void shutdownShell(boolean clean, int obfuscationGuard) {
        Exception exception = null;
        Throwable throwable = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        try {
          var3 = this;
          synchronized (var3) {
            if (PcmPlayerService.clientShutdownStarted) {
              return;
            }
            PcmPlayerService.clientShutdownStarted = true;
          }
          if (la.loaderApplet != null) {
            la.loaderApplet.destroy();
          }
          try {
            this.shutdownClient((byte) 103);
            if (obfuscationGuard != -1251) {
              this.recreateCanvas((byte) 114);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          if (null != IndexedSpriteBase.field_b) {
            try {
              IndexedSpriteBase.field_b.removeFocusListener((java.awt.event.FocusListener) (this));
              IndexedSpriteBase.field_b.getParent().remove((java.awt.Component) ((Object) IndexedSpriteBase.field_b));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (null != IntPair.field_m) {
            try {
              IntPair.field_m.stopAndClose(true);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          this.finishShutdown((byte) -72);
          if (null != ContextualRuntimeException.field_f) {
            try {
              System.exit(0);
            } catch (java.lang.Throwable decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              throwable = decompiledCaughtException;
            }
          }
          System.out.println("Shutdown complete - clean:" + clean);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "iv.CB(" + clean + ',' + obfuscationGuard + ')');
        }
    }

    abstract void tickClient(byte obfuscationGuard);

    final static void a(boolean param0, boolean param1, java.awt.Canvas param2) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          if (StrongCacheEntry.field_E >= 10) {
            if (BitmapTextWidgetPainter.b(true)) {
              if (SoundCache.field_b == 0) {
                tq.a(param1, false, 112);
                ContentTransitionDialog.a(0, 12, param2, 0);
                decompiledFrameRemainder0 = (var4 != 0);
              }
              if (decompiledFrameRemainder0) {
                PaletteRegionMap.a((byte) 111, param2);
                if (var4 != 0) {
                  SoftwareRaster.b();
                  TaggedMapData.a(240, 320, -121);
                  ContentTransitionDialog.a(0, 12, param2, 0);
                  var3_int = 0;
                  if (MaskedTextEntryPainter.redrawRequested) {
                    MaskedTextEntryPainter.redrawRequested = false;
                    var3_int = 1;
                  }
                  NodeHashIterator.a(-5790, TurnEffectEvent.field_F, SpellCastEvent.g(-15862), var3_int != 0, dd.a(false));
                }
              }
            } else {
              SoftwareRaster.b();
              TaggedMapData.a(240, 320, -121);
              ContentTransitionDialog.a(0, 12, param2, 0);
              if (var4 != 0) {
                var3_int = 0;
                if (MaskedTextEntryPainter.redrawRequested) {
                  MaskedTextEntryPainter.redrawRequested = false;
                  var3_int = 1;
                }
                NodeHashIterator.a(-5790, TurnEffectEvent.field_F, SpellCastEvent.g(-15862), var3_int != 0, dd.a(false));
              }
            }
          } else {
            var3_int = 0;
            if (MaskedTextEntryPainter.redrawRequested) {
              MaskedTextEntryPainter.redrawRequested = false;
              var3_int = 1;
            }
            NodeHashIterator.a(-5790, TurnEffectEvent.field_F, SpellCastEvent.g(-15862), var3_int != 0, dd.a(false));
          }
          if (param0) {
            field_m = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_29_0 = var3;
          stackIn_29_1 = new StringBuilder().append("iv.BB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (null != ContextualRuntimeException.field_f) {
          return null;
        }
        if (la.loaderApplet != null &&
          la.loaderApplet != this) {
          return la.loaderApplet.getCodeBase();
        }
        return super.getCodeBase();
    }

    public final void run() {
        try {
          boolean stackIn_68_0 = false;
          int stackIn_83_0 = 0;
          int stackIn_83_1 = 0;
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
          var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
          try {
            try {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              if (null != PlatformTaskService.javaVendor) {
                var1 = PlatformTaskService.javaVendor.toLowerCase();
                if (((String) (var1)).indexOf("sun") != -1 ||
                  ((String) (var1)).indexOf("apple") != -1) {
                  var2 = PlatformTaskService.javaVersion;
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
                    this.reportGameError("wrongjava", (byte) -39);
                    decompiledFrameRemainder3 = (var5 != 0);
                  }
                  if ((decompiledFrameRemainder3) &&
                    (var2.startsWith("1.6.0_"))) {
                    var3 = 6;
                    while (var3 < var2.length()) {
                      stackIn_68_0 = mu.a(28799, var2.charAt(var3));
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
                      if (vv.a(-45, (CharSequence) ((Object) var4)) &&
                        !(HuffmanCodec.a(107, (CharSequence) ((Object) var4)) >= 10)) {
                        this.reportGameError("wrongjava", (byte) -101);
                        decompiledFrameRemainder3 = (var5 != 0);
                      }
                    }
                  }
                }
              }
              if (((decompiledFrameRemainder3) && (decompiledFrameCompleted0)) &&
                (decompiledFrameRemainder2 = (PlatformTaskService.javaVersion != null))) {
                stackIn_68_0 = PlatformTaskService.javaVersion.startsWith("1.");
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (stackIn_68_0)) {
                var1_int = 2;
                var2_int = 0;
                while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (var1_int < PlatformTaskService.javaVersion.length()) {
                    var3 = PlatformTaskService.javaVersion.charAt(var1_int);
                    stackIn_83_0 = ~var3;
                    stackIn_83_1 = -49;
                    decompiledFrameRemainder1 = (var5 == 0);
                    if ((decompiledFrameRemainder1) && (stackIn_83_0 <= stackIn_83_1 && (var3 <= 57 ||
                      var5 != 0))) {
                      var2_int = 10 * var2_int + (var3 - 48);
                      var1_int++;
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    stackIn_83_0 = -6;
                    stackIn_83_1 = ~var2_int;
                  }
                  if (stackIn_83_0 < stackIn_83_1) {
                    break;
                  }
                  se.field_c = true;
                  break;
                }
              }
              if (decompiledFrameRemainder3) {
                var1 = IntKeyLookup.activeGameShell;
                if (null != la.loaderApplet) {
                  var1 = la.loaderApplet;
                }
                var2_ref = PlatformTaskService.field_x;
                if (var2_ref != null) {
                  try {
                    var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3_ref_Throwable = decompiledCaughtException;
                  }
                }
                AgeValidator.c((byte) -76);
                this.recreateCanvas((byte) 87);
                so.field_b = StripedProgressWidget.a(bn.field_b, dt.field_a, 1423111778, (java.awt.Component) ((Object) IndexedSpriteBase.field_b));
                this.initializeClient(false);
                GameClock.gameClock = DraggableWidgetContainer.createGameClock(false);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (0L != ActionRequest.shutdownDeadlineMillis) {
                    stackIn_102_0 = $cfr$lcmp(ActionRequest.shutdownDeadlineMillis, vi.monotonicMillis(-56));
                    decompiledFrameRemainder0 = (var5 == 0);
                    if ((decompiledFrameRemainder0) &&
                      (stackIn_102_0 <= 0)) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    Widget.ticksThisFrame = GameClock.gameClock.waitAndAdvance(-125, rd.tickDurationNanos);
                    stackIn_102_0 = 0;
                  }
                  var3 = stackIn_102_0;
                  do {
                    if (!(Widget.ticksThisFrame > var3)) {
                      this.runRenderFrame(-11);
                      MapTile.a(IntPair.field_m, IndexedSpriteBase.field_b, true);
                      break;
                    }
                    this.runClientTick(17684);
                    var3++;
                  } while (var5 == 0);
                } while (var5 == 0);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = decompiledCaughtException;
              af.a((Throwable) (var1), -102, (String) null);
              this.reportGameError("crash", (byte) -121);
            }
            this.shutdownShell(true, -1251);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw AnimationSkeleton.addExceptionContext((Throwable) (var1), "iv.run()");
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
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
          stackIn_5_1 = new StringBuilder().append("iv.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void start() {
        if (IntKeyLookup.activeGameShell != this ||
          PcmPlayerService.clientShutdownStarted) {
          return;
        }
        try {
          ActionRequest.shutdownDeadlineMillis = 0L;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "iv.start()");
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          wj.canvasFocused = true;
          MaskedTextEntryPainter.redrawRequested = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("iv.focusGained(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    abstract void finishShutdown(byte obfuscationGuard);

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.net.URL stackIn_12_0 = null;
        java.net.URL stackIn_14_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ContextualRuntimeException.field_f != null) {
            stackIn_4_0 = null;
            return (java.net.URL) (stackIn_4_0);
          }
          if (null != la.loaderApplet &&
            this != la.loaderApplet) {
            stackIn_12_0 = la.loaderApplet.getDocumentBase();
            return stackIn_12_0;
          }
          stackIn_14_0 = super.getDocumentBase();
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var1), "iv.getDocumentBase()");
        }
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        java.applet.AppletContext stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ContextualRuntimeException.field_f != null) {
            stackIn_2_0 = null;
            return (java.applet.AppletContext) (stackIn_2_0);
          }
          if (la.loaderApplet != null &&
            la.loaderApplet != this) {
            stackIn_10_0 = la.loaderApplet.getAppletContext();
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getAppletContext();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var1), "iv.getAppletContext()");
        }
    }

    abstract void renderClient(int obfuscationGuard);

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    private final void runRenderFrame(int obfuscationGuard) {
        int previousRefreshCounter = 0;
        RuntimeException failure = null;
        long nowMillis = 0L;
        long previousTimestamp = 0L;
        int elapsedMillis = 0;
        java.awt.Insets frameInsets = null;
        RuntimeException caughtFailure = null;
        try {
          nowMillis = vi.monotonicMillis(94);
          previousTimestamp = AiActionCandidate.renderTimestampsMillis[MidiPcmStream.renderTimestampIndex];
          AiActionCandidate.renderTimestampsMillis[MidiPcmStream.renderTimestampIndex] = nowMillis;
          MidiPcmStream.renderTimestampIndex = MidiPcmStream.renderTimestampIndex + 1 & 31;
          if (0L != previousTimestamp &&
            previousTimestamp < nowMillis) {
            elapsedMillis = (int)(-previousTimestamp + nowMillis);
            UnitModelPreview.field_i = (32000 + (elapsedMillis >> 1)) / elapsedMillis;
          }
          previousRefreshCounter = uh.canvasRefreshCounter;
          uh.canvasRefreshCounter = uh.canvasRefreshCounter + 1;
          if (previousRefreshCounter > 50) {
            uh.canvasRefreshCounter = uh.canvasRefreshCounter - 50;
            MaskedTextEntryPainter.redrawRequested = true;
            IndexedSpriteBase.field_b.setSize(bn.field_b, dt.field_a);
            IndexedSpriteBase.field_b.setVisible(true);
            if (null != ContextualRuntimeException.field_f &&
              cs.field_bb == null) {
              frameInsets = ContextualRuntimeException.field_f.getInsets();
              IndexedSpriteBase.field_b.setLocation(DualNodeIterator.field_b + frameInsets.left, mh.field_c + frameInsets.top);
              if (ArmiesOfGielinor.obfuscationControl) {
                IndexedSpriteBase.field_b.setLocation(DualNodeIterator.field_b, mh.field_c);
              }
            } else {
              IndexedSpriteBase.field_b.setLocation(DualNodeIterator.field_b, mh.field_c);
            }
          }
          if (obfuscationGuard != -11) {
            this.start();
          }
          this.renderClient(0);
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failure), "iv.UA(" + obfuscationGuard + ')');
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    final synchronized void recreateCanvas(byte obfuscationGuard) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (IndexedSpriteBase.field_b != null) {
            IndexedSpriteBase.field_b.removeFocusListener((java.awt.event.FocusListener) (this));
            IndexedSpriteBase.field_b.getParent().setBackground(java.awt.Color.black);
            IndexedSpriteBase.field_b.getParent().remove((java.awt.Component) ((Object) IndexedSpriteBase.field_b));
          }
          boolean decompiledFrameRemainder0 = true;
          if (cs.field_bb != null) {
            var2 = cs.field_bb;
            decompiledFrameRemainder0 = (var4 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (ContextualRuntimeException.field_f != null) {
              var2 = ContextualRuntimeException.field_f;
              if (var4 != 0) {
                if (la.loaderApplet != null) {
                  var2 = la.loaderApplet;
                  var2 = IntKeyLookup.activeGameShell;
                } else {
                  var2 = IntKeyLookup.activeGameShell;
                }
              }
            } else {
              if (la.loaderApplet != null) {
                var2 = la.loaderApplet;
                if (var4 != 0) {
                  var2 = IntKeyLookup.activeGameShell;
                }
              } else {
                var2 = IntKeyLookup.activeGameShell;
              }
            }
          }
          ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
          IndexedSpriteBase.field_b = (java.awt.Canvas) ((Object) new GameCanvas((java.awt.Component) (this)));
          ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) IndexedSpriteBase.field_b));
          IndexedSpriteBase.field_b.setSize(bn.field_b, dt.field_a);
          if (obfuscationGuard != 87) {
            return;
          }
          IndexedSpriteBase.field_b.setVisible(true);
          boolean decompiledSharedTail0 = (var2 == ContextualRuntimeException.field_f);
          if (!decompiledSharedTail0) {
            IndexedSpriteBase.field_b.setLocation(DualNodeIterator.field_b, mh.field_c);
            decompiledSharedTail0 = (var4 != 0);
          }
          if (decompiledSharedTail0) {
            var3 = ContextualRuntimeException.field_f.getInsets();
            IndexedSpriteBase.field_b.setLocation(var3.left + DualNodeIterator.field_b, var3.top + mh.field_c);
          }
          IndexedSpriteBase.field_b.addFocusListener((java.awt.event.FocusListener) (this));
          IndexedSpriteBase.field_b.requestFocus();
          ph.tickFocusSnapshot = true;
          wj.canvasFocused = true;
          MaskedTextEntryPainter.redrawRequested = true;
          tq.canvasRebuildRequested = false;
          AttackEvent.lastCanvasRebuildMillis = vi.monotonicMillis(obfuscationGuard + 7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) (var2), "iv.RA(" + obfuscationGuard + ')');
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          wj.canvasFocused = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("iv.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    protected GameAppletShell() {
        this.errorReported = false;
    }

    public static void d(int param0) {
        field_m = null;
        field_c = null;
        if (param0 <= 86) {
          return;
        }
        try {
          field_a = null;
          field_b = null;
          field_e = (int[][]) null;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "iv.VA(" + param0 + ')');
        }
    }

    static {
        field_m = "Curses";
        field_a = "Enter name of friend to add to list";
        field_c = "Unable to add friend - system busy";
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
