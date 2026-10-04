/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

public abstract class GameApplet extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static int queuedMeshFaceCount;
    boolean errorPageShown;
    static int[] meshFaceCountsByDepthBucket;
    public static boolean field_h;
    public static boolean field_e;
    public static boolean field_i;
    public static boolean field_c;
    public static boolean field_f;
    public static int field_g;
    public static boolean field_j;

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.net.URL stackIn_10_0 = null;
        java.net.URL stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (SharedBufferPools.fullscreenFrame != null) {
            stackIn_4_0 = null;
            return (java.net.URL) (stackIn_4_0);
          }
          if ((null != VisualPropertyNode.loaderApplet) &&
              (this != VisualPropertyNode.loaderApplet)) {
            stackIn_10_0 = VisualPropertyNode.loaderApplet.getDocumentBase();
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getDocumentBase();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var1), "ch.getDocumentBase()");
        }
    }

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          VisualPropertyNode.loaderApplet = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("ch.provideLoaderApplet(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
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
          stackIn_5_1 = new StringBuilder().append("ch.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    private final void shutdownAppletServices(byte methodGuard, boolean reportedCleanShutdown) {
        Exception ignoredCleanupException = null;
        RuntimeException shutdownFailureForContext = null;
        Object shutdownMonitor = null;
        Throwable caughtShutdownFailure = null;
        Throwable ignoredExitFailure = null;
        try {
          shutdownMonitor = this;
          synchronized (shutdownMonitor) {
            if (MidiNoteMixer.appletShutdownStarted) {
              return;
            }
            MidiNoteMixer.appletShutdownStarted = true;
          }
          if (null != VisualPropertyNode.loaderApplet) {
            VisualPropertyNode.loaderApplet.destroy();
          }
          try {
            this.serviceAudio(1);
            if (methodGuard != 14) {
              this.renderFrame(-33);
            }
          } catch (java.lang.Exception audioShutdownFailure) {
            caughtShutdownFailure = audioShutdownFailure;
            ignoredCleanupException = (Exception) (Object) caughtShutdownFailure;
          }
          if (MessageDialog.gameCanvas != null) {
            try {
              MessageDialog.gameCanvas.removeFocusListener((java.awt.event.FocusListener) (this));
              MessageDialog.gameCanvas.getParent().remove((java.awt.Component) ((Object) MessageDialog.gameCanvas));
            } catch (java.lang.Exception canvasRemovalFailure) {
              caughtShutdownFailure = canvasRemovalFailure;
              ignoredCleanupException = (Exception) (Object) caughtShutdownFailure;
            }
          }
          if (MenuScreen.platformTaskDispatcher != null) {
            try {
              MenuScreen.platformTaskDispatcher.shutdown((byte) 13);
            } catch (java.lang.Exception dispatcherShutdownFailure) {
              caughtShutdownFailure = dispatcherShutdownFailure;
              ignoredCleanupException = (Exception) (Object) caughtShutdownFailure;
            }
          }
          this.releaseGameResources((byte) -64);
          if (null != SharedBufferPools.fullscreenFrame) {
            try {
              System.exit(0);
            } catch (java.lang.Throwable exitFailure) {
              caughtShutdownFailure = exitFailure;
              ignoredExitFailure = caughtShutdownFailure;
            }
          }
          System.out.println("Shutdown complete - clean:" + reportedCleanShutdown);
          return;
        } catch (java.lang.RuntimeException shutdownContextFailure) {
          caughtShutdownFailure = shutdownContextFailure;
          shutdownFailureForContext = (RuntimeException) (Object) caughtShutdownFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) shutdownFailureForContext), "ch.I(" + methodGuard + ',' + reportedCleanShutdown + ')');
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
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
          stackIn_5_1 = new StringBuilder().append("ch.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public static void releaseMeshDepthBuckets(byte methodGuard) {
        try {
            meshFaceCountsByDepthBucket = null;
            int guardResidue = 30 % ((30 - methodGuard) / 52);
        } catch (RuntimeException bucketCleanupFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) bucketCleanupFailure), "ch.E(" + methodGuard + ')');
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          CrcAcknowledgedPacket.canvasHasFocus = true;
          UsernameQueryState.canvasRedrawRequested = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("ch.focusGained(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final void showGameError(byte methodGuard, String errorCode) {
        try {
            RuntimeException errorFailureBeforeContext = null;
            StringBuilder errorMessagePrefix = null;
            String errorCodeDescription = null;
            Throwable caughtErrorDisplayFailure = null;
            Throwable ignoredLogoutBridgeFailure = null;
            Exception ignoredErrorPageFailure = null;
            RuntimeException errorFailureForContext = null;
            try {
              if (this.errorPageShown) {
                return;
              }
              this.errorPageShown = true;
              System.out.println("error_game_" + errorCode);
              if (methodGuard != 79) {
                GameApplet.releaseMeshDepthBuckets((byte) -125);
              }
              try {
                AppletJavaScriptBridge.callWithoutArguments((byte) -6, NodeHashTableIterator.getActiveApplet(115), "loggedout");
              } catch (java.lang.Throwable logoutBridgeFailure) {
                caughtErrorDisplayFailure = logoutBridgeFailure;
                ignoredLogoutBridgeFailure = caughtErrorDisplayFailure;
              }
              try {
                this.getAppletContext().showDocument(new java.net.URL(this.getCodeBase(), "error_game_" + errorCode + ".ws"), "_top");
              } catch (java.lang.Exception errorPageFailure) {
                caughtErrorDisplayFailure = errorPageFailure;
                ignoredErrorPageFailure = (Exception) (Object) caughtErrorDisplayFailure;
              }
              return;
            } catch (java.lang.RuntimeException errorDisplayContextFailure) {
              caughtErrorDisplayFailure = errorDisplayContextFailure;
              errorFailureForContext = (RuntimeException) (Object) caughtErrorDisplayFailure;
              errorFailureBeforeContext = errorFailureForContext;
              errorMessagePrefix = new StringBuilder().append("ch.A(").append(methodGuard).append(',');
              if (errorCode == null) {
                errorCodeDescription = "null";
              } else {
                errorCodeDescription = "{...}";
              }
              throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) errorFailureBeforeContext), ((StringBuilder) (Object) errorMessagePrefix).append(errorCodeDescription).append(')').toString());
            }
        } catch (RuntimeException | Error uncheckedErrorDisplayFailure) {
            throw uncheckedErrorDisplayFailure;
        } catch (Throwable checkedErrorDisplayFailure) {
            throw new RuntimeException(checkedErrorDisplayFailure);
        }
    }

    public final void run() {
        try {
            boolean digitOrLegacyVersionPredicate = false;
            int majorVersionComparisonLeft = 0;
            int majorVersionComparisonRight = 0;
            int stopDeadlineComparisonOrTickIndex = 0;
            Throwable caughtRunFailure = null;
            Object lowercaseVendorOrFocusRootOrFailure = null;
            int javaVersionDigitIndex = 0;
            String javaVersionText = null;
            int parsedJavaMajorVersion = 0;
            java.lang.reflect.Method focusCycleRootMethod = null;
            int updateSuffixIndexOrVersionDigitOrTickIndex = 0;
            Throwable ignoredFocusRootFailure = null;
            String javaUpdateSuffix = null;
            int clientControlSnapshot = 0;
            clientControlSnapshot = Geoblox.clientControlFlowFlag;
            try {
              try {
                appletExecutionBoundary: {
                  legacyJavaVersionCheck: {
                    digitOrLegacyVersionDecision: {
                      vendorCompatibilityCheck: {
                        if (PlatformTaskDispatcher.javaVendor != null) {
                          lowercaseVendorOrFocusRootOrFailure = PlatformTaskDispatcher.javaVendor.toLowerCase();
                          if ((-1 == ((String) (lowercaseVendorOrFocusRootOrFailure)).indexOf("sun")) &&
                              (((String) (lowercaseVendorOrFocusRootOrFailure)).indexOf("apple") == -1)) {
                            break vendorCompatibilityCheck;
                          }
                          javaVersionText = PlatformTaskDispatcher.javaVersion;
                          if (!((!javaVersionText.equals("1.1")) &&
                              (!javaVersionText.startsWith("1.1.")) &&
                              (!javaVersionText.equals("1.2")) &&
                              (!javaVersionText.startsWith("1.2.")) &&
                              (!javaVersionText.equals("1.3")) &&
                              (!javaVersionText.startsWith("1.3.")) &&
                              (!javaVersionText.equals("1.4")) &&
                              (!javaVersionText.startsWith("1.4.")) &&
                              (!javaVersionText.equals("1.5")) &&
                              (!javaVersionText.startsWith("1.5.")) &&
                              (!javaVersionText.equals("1.6.0")))) {
                            this.showGameError((byte) 79, "wrongjava");
                            if (clientControlSnapshot == 0) {
                              break appletExecutionBoundary;
                            }
                          }
                          if (javaVersionText.startsWith("1.6.0_")) {
                            updateSuffixIndexOrVersionDigitOrTickIndex = 6;
                            while (javaVersionText.length() > updateSuffixIndexOrVersionDigitOrTickIndex) {
                              digitOrLegacyVersionPredicate = DualLinkNode.isAsciiDigit(-58, javaVersionText.charAt(updateSuffixIndexOrVersionDigitOrTickIndex));
                              if (clientControlSnapshot != 0) {
                                break digitOrLegacyVersionDecision;
                              }
                              if (digitOrLegacyVersionPredicate) {
                                updateSuffixIndexOrVersionDigitOrTickIndex++;
                                continue;
                              }
                              break;
                            }
                            javaUpdateSuffix = javaVersionText.substring(6, updateSuffixIndexOrVersionDigitOrTickIndex);
                            if (!MessageDialog.isSignedDecimalInt((byte) -115, (CharSequence) ((Object) javaUpdateSuffix))) {
                              break vendorCompatibilityCheck;
                            }
                            if (MultiHandleSliderWidget.a(false, (CharSequence) ((Object) javaUpdateSuffix)) >= 10) {
                              break vendorCompatibilityCheck;
                            }
                            this.showGameError((byte) 79, "wrongjava");
                            if (clientControlSnapshot == 0) {
                              break appletExecutionBoundary;
                            }
                          }
                        }
                      }
                      if (PlatformTaskDispatcher.javaVersion == null) {
                        break legacyJavaVersionCheck;
                      }
                      digitOrLegacyVersionPredicate = PlatformTaskDispatcher.javaVersion.startsWith("1.");
                    }
                    if (digitOrLegacyVersionPredicate) {
                      javaVersionDigitIndex = 2;
                      parsedJavaMajorVersion = 0;
                      while (true) {
                        majorVersionComparison: {
                          if (~PlatformTaskDispatcher.javaVersion.length() < ~javaVersionDigitIndex) {
                            updateSuffixIndexOrVersionDigitOrTickIndex = PlatformTaskDispatcher.javaVersion.charAt(javaVersionDigitIndex);
                            majorVersionComparisonLeft = updateSuffixIndexOrVersionDigitOrTickIndex;
                            majorVersionComparisonRight = 48;
                            if (clientControlSnapshot != 0) {
                              break majorVersionComparison;
                            }
                            if ((majorVersionComparisonLeft >= majorVersionComparisonRight) &&
                                (updateSuffixIndexOrVersionDigitOrTickIndex <= 57)) {
                              parsedJavaMajorVersion = 10 * parsedJavaMajorVersion - 48 + updateSuffixIndexOrVersionDigitOrTickIndex;
                              javaVersionDigitIndex++;
                              continue;
                            }
                          }
                          majorVersionComparisonLeft = ~parsedJavaMajorVersion;
                          majorVersionComparisonRight = -6;
                        }
                        if (majorVersionComparisonLeft > majorVersionComparisonRight) {
                          break;
                        }
                        ResizableDialog.legacyJavaCanvasRefreshRequired = true;
                        break;
                      }
                    }
                  }
                  lowercaseVendorOrFocusRootOrFailure = PrefixCodeDecoder.activeGameApplet;
                  if (null != VisualPropertyNode.loaderApplet) {
                    lowercaseVendorOrFocusRootOrFailure = VisualPropertyNode.loaderApplet;
                  }
                  focusCycleRootMethod = PlatformTaskDispatcher.setFocusCycleRootMethod;
                  if (null != focusCycleRootMethod) {
                    try {
                      focusCycleRootMethod.invoke(lowercaseVendorOrFocusRootOrFailure, new Object[]{Boolean.TRUE});
                    } catch (java.lang.Throwable focusRootSetupFailure) {
                      caughtRunFailure = focusRootSetupFailure;
                      ignoredFocusRootFailure = caughtRunFailure;
                    }
                  }
                  SpriteCheckboxRenderer.a(75);
                  this.rebuildGameCanvas(true);
                  SingleChildWidget.mainRasterBuffer = DropTargetWidget.createCanvasRasterBuffer(false, (java.awt.Component) ((Object) MessageDialog.gameCanvas), ClientRenderingState.canvasHeight, AudioService.canvasWidth);
                  this.initializeGame(117);
                  ReflectionCheckRequest.frameTimer = BufferedSocket.createFrameClock(5000);
                  do {
                    stopDeadlineOrTickDecision: {
                      if (0L != MenuScreen.appletStopDeadlineMillis) {
                        stopDeadlineComparisonOrTickIndex = $cfr$lcmp(~MenuScreen.appletStopDeadlineMillis, ~ClientClockSupport.correctedCurrentTimeMillis(-12520));
                        if (clientControlSnapshot != 0) {
                          break stopDeadlineOrTickDecision;
                        }
                        if (stopDeadlineComparisonOrTickIndex >= 0) {
                          break appletExecutionBoundary;
                        }
                      }
                      TriangleMesh.pendingUpdateTicks = ReflectionCheckRequest.frameTimer.awaitAndCountTicks((byte) -6, ByteStorage.updatePeriodNanoseconds);
                      stopDeadlineComparisonOrTickIndex = 0;
                    }
                    updateSuffixIndexOrVersionDigitOrTickIndex = stopDeadlineComparisonOrTickIndex;
                    while (true) {
                      if (!(TriangleMesh.pendingUpdateTicks > updateSuffixIndexOrVersionDigitOrTickIndex)) {
                        this.renderAppletFrame(32000);
                        OpacityWidget.pollEventQueueAndPostDummyEvent(MenuScreen.platformTaskDispatcher, (byte) 83, MessageDialog.gameCanvas);
                        break;
                      }
                      this.updateAppletTick((byte) -10);
                      updateSuffixIndexOrVersionDigitOrTickIndex++;
                      if (clientControlSnapshot == 0) {
                        continue;
                      }
                      break;
                    }
                  } while (clientControlSnapshot == 0);
                  break appletExecutionBoundary;
                }
              } catch (java.lang.Throwable appletLoopFailure) {
                caughtRunFailure = appletLoopFailure;
                lowercaseVendorOrFocusRootOrFailure = caughtRunFailure;
                IterableNodeHashTable.reportClientError((Throwable) (lowercaseVendorOrFocusRootOrFailure), (String) null, (byte) 125);
                this.showGameError((byte) 79, "crash");
              }
              this.shutdownAppletServices((byte) 14, true);
              return;
            } catch (java.lang.RuntimeException runContextFailure) {
              caughtRunFailure = runContextFailure;
              lowercaseVendorOrFocusRootOrFailure = (RuntimeException) (Object) caughtRunFailure;
              throw InstrumentEnvelope.withFailureContext((Throwable) (lowercaseVendorOrFocusRootOrFailure), "ch.run()");
            }
        } catch (RuntimeException | Error uncheckedRunFailure) {
            throw uncheckedRunFailure;
        } catch (Throwable checkedRunFailure) {
            throw new RuntimeException(checkedRunFailure);
        }
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.applet.AppletContext stackIn_8_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (SharedBufferPools.fullscreenFrame != null) {
            stackIn_2_0 = null;
            return (java.applet.AppletContext) (stackIn_2_0);
          }
          if ((VisualPropertyNode.loaderApplet != null) &&
              (this != VisualPropertyNode.loaderApplet)) {
            stackIn_8_0 = VisualPropertyNode.loaderApplet.getAppletContext();
            return stackIn_8_0;
          }
          stackIn_10_0 = super.getAppletContext();
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var1), "ch.getAppletContext()");
        }
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    final synchronized void rebuildGameCanvas(boolean visible) {
        Object selectedContainerOrFailure = null;
        java.awt.Insets fullscreenInsets = null;
        int clientControlSnapshot = 0;
        RuntimeException caughtCanvasCreationFailure = null;
        clientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          if (MessageDialog.gameCanvas != null) {
            MessageDialog.gameCanvas.removeFocusListener((java.awt.event.FocusListener) (this));
            MessageDialog.gameCanvas.getParent().setBackground(java.awt.Color.black);
            MessageDialog.gameCanvas.getParent().remove((java.awt.Component) ((Object) MessageDialog.gameCanvas));
          }
          canvasContainerSelection: {
            if (FullscreenFocusCanvas.standaloneFrameReference == null) {
              if (null == SharedBufferPools.fullscreenFrame) {
                if (VisualPropertyNode.loaderApplet != null) {
                  selectedContainerOrFailure = VisualPropertyNode.loaderApplet;
                  if (clientControlSnapshot == 0) {
                    break canvasContainerSelection;
                  }
                }
                selectedContainerOrFailure = PrefixCodeDecoder.activeGameApplet;
                if (clientControlSnapshot == 0) {
                  break canvasContainerSelection;
                }
              }
              selectedContainerOrFailure = SharedBufferPools.fullscreenFrame;
              if (clientControlSnapshot == 0) {
                break canvasContainerSelection;
              }
            }
            selectedContainerOrFailure = FullscreenFocusCanvas.standaloneFrameReference;
          }
          canvasLocationSelection: {
            ((java.awt.Container) (selectedContainerOrFailure)).setLayout((java.awt.LayoutManager) null);
            MessageDialog.gameCanvas = (java.awt.Canvas) ((Object) new DelegatingCanvas((java.awt.Component) (this)));
            ((java.awt.Container) (selectedContainerOrFailure)).add((java.awt.Component) ((Object) MessageDialog.gameCanvas));
            MessageDialog.gameCanvas.setSize(AudioService.canvasWidth, ClientRenderingState.canvasHeight);
            MessageDialog.gameCanvas.setVisible(visible);
            if (SharedBufferPools.fullscreenFrame != selectedContainerOrFailure) {
              MessageDialog.gameCanvas.setLocation(PrefixCodeDecoder.canvasOffsetX, ButtonWidget.canvasOffsetY);
              if (clientControlSnapshot == 0) {
                break canvasLocationSelection;
              }
            }
            fullscreenInsets = SharedBufferPools.fullscreenFrame.getInsets();
            MessageDialog.gameCanvas.setLocation(fullscreenInsets.left + PrefixCodeDecoder.canvasOffsetX, fullscreenInsets.top + ButtonWidget.canvasOffsetY);
          }
          MessageDialog.gameCanvas.addFocusListener((java.awt.event.FocusListener) (this));
          MessageDialog.gameCanvas.requestFocus();
          ValidationState.updateFocusSnapshot = true;
          CrcAcknowledgedPacket.canvasHasFocus = true;
          UsernameQueryState.canvasRedrawRequested = true;
          EntityMotionSupport.canvasReplacementRequested = false;
          Geoblox.canvasCreationTimeMillis = ClientClockSupport.correctedCurrentTimeMillis(-12520);
          return;
        } catch (java.lang.RuntimeException canvasCreationFailure) {
          caughtCanvasCreationFailure = canvasCreationFailure;
          selectedContainerOrFailure = caughtCanvasCreationFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) (selectedContainerOrFailure), "ch.H(" + visible + ')');
        }
    }

    public final void start() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if ((this == PrefixCodeDecoder.activeGameApplet) &&
              (!MidiNoteMixer.appletShutdownStarted)) {
            MenuScreen.appletStopDeadlineMillis = 0L;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "ch.start()");
        }
    }

    final static String compactExceptionTrace(Throwable failure, int methodGuard) throws IOException {
        String compactTrace;
        ContextualRuntimeException contextualFailure;
        StringWriter traceWriter;
        PrintWriter tracePrinter;
        String printedTrace;
        BufferedReader traceReader;
        String exceptionHeader;
        String stackFrameLine;
        int openParenthesisIndex;
        int closeParenthesisIndex;
        String qualifiedMethodName;
        int javaSourceSuffixIndex;
        if (failure instanceof ContextualRuntimeException) {
          contextualFailure = (ContextualRuntimeException) ((Object) failure);
          failure = contextualFailure.wrappedCause;
          compactTrace = contextualFailure.contextPath + " | ";
        } else {
          compactTrace = "";
        }
        traceWriter = new StringWriter();
        if (methodGuard != 1) {
          queuedMeshFaceCount = 61;
        }
        tracePrinter = new PrintWriter((Writer) ((Object) traceWriter));
        failure.printStackTrace(tracePrinter);
        tracePrinter.close();
        printedTrace = traceWriter.toString();
        traceReader = new BufferedReader((Reader) ((Object) new StringReader(printedTrace)));
        exceptionHeader = traceReader.readLine();
        while (true) {
          stackFrameLine = traceReader.readLine();
          if (null == stackFrameLine) {
            compactTrace = compactTrace + "| " + exceptionHeader;
            return compactTrace;
          }
          openParenthesisIndex = stackFrameLine.indexOf('(');
          closeParenthesisIndex = stackFrameLine.indexOf(')', openParenthesisIndex + 1);
          if (-1 != openParenthesisIndex) {
            qualifiedMethodName = stackFrameLine.substring(0, openParenthesisIndex);
          } else {
            qualifiedMethodName = stackFrameLine;
          }
          qualifiedMethodName = qualifiedMethodName.trim();
          qualifiedMethodName = qualifiedMethodName.substring(qualifiedMethodName.lastIndexOf(' ') + 1);
          qualifiedMethodName = qualifiedMethodName.substring(1 + qualifiedMethodName.lastIndexOf('\t'));
          compactTrace = compactTrace + qualifiedMethodName;
          if ((openParenthesisIndex != -1) &&
              (-1 != closeParenthesisIndex)) {
            javaSourceSuffixIndex = stackFrameLine.indexOf(".java:", openParenthesisIndex);
            if (javaSourceSuffixIndex >= 0) {
              compactTrace = compactTrace + stackFrameLine.substring(javaSourceSuffixIndex + 5, closeParenthesisIndex);
            }
          }
          compactTrace = compactTrace + ' ';
          continue;
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    final boolean isAppletStartupAllowed(boolean unusedMethodGuard) {
        return true;
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (null != SharedBufferPools.fullscreenFrame) {
          return null;
        }
        if ((null != VisualPropertyNode.loaderApplet) &&
            (VisualPropertyNode.loaderApplet != this)) {
          return VisualPropertyNode.loaderApplet.getCodeBase();
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
          CrcAcknowledgedPacket.canvasHasFocus = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("ch.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    abstract void initializeGame(int param0);

    private final void updateAppletTick(byte methodGuard) {
        long updateTimeMillis = 0L;
        long previousUpdateTimeMillis = 0L;
        Throwable caughtUpdateFailure = null;
        RuntimeException updateFailureForContext = null;
        Object appletMonitor = null;
        try {
          if (methodGuard != -10) {
            queuedMeshFaceCount = -102;
          }
          updateTimeMillis = ClientClockSupport.correctedCurrentTimeMillis(methodGuard ^ 12526);
          previousUpdateTimeMillis = RasterTargetSnapshot.updateTimeHistoryMillis[FullscreenErrorDialog.nextUpdateTimeHistoryIndex];
          RasterTargetSnapshot.updateTimeHistoryMillis[FullscreenErrorDialog.nextUpdateTimeHistoryIndex] = updateTimeMillis;
          FullscreenErrorDialog.nextUpdateTimeHistoryIndex = 31 & 1 + FullscreenErrorDialog.nextUpdateTimeHistoryIndex;
          if ((previousUpdateTimeMillis != 0L) &&
              (updateTimeMillis > previousUpdateTimeMillis)) {
          }
          appletMonitor = this;
          synchronized (appletMonitor) {
            ValidationState.updateFocusSnapshot = CrcAcknowledgedPacket.canvasHasFocus;
          }
          this.updateGame(false);
          return;
        } catch (java.lang.RuntimeException updateCallbackFailure) {
          caughtUpdateFailure = updateCallbackFailure;
          updateFailureForContext = (RuntimeException) (Object) caughtUpdateFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) updateFailureForContext), "ch.L(" + methodGuard + ')');
        }
    }

    abstract void releaseGameResources(byte param0);

    public abstract void init();

    public final synchronized void paint(java.awt.Graphics param0) {
        java.awt.Rectangle var2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          if ((PrefixCodeDecoder.activeGameApplet == this) &&
              (!MidiNoteMixer.appletShutdownStarted)) {
            UsernameQueryState.canvasRedrawRequested = true;
            if ((ResizableDialog.legacyJavaCanvasRefreshRequired) &&
                (-Geoblox.canvasCreationTimeMillis + ClientClockSupport.correctedCurrentTimeMillis(-12520) > 1000L)) {
              var2 = param0.getClipBounds();
              if (null != var2) {
                if (~var2.width > ~DialWidget.initialCanvasWidth) {
                  return;
                }
                if (NetworkArchiveRequest.initialCanvasHeight > var2.height) {
                  return;
                }
              }
              EntityMotionSupport.canvasReplacementRequested = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_25_0 = var2_ref;
          stackIn_25_1 = new StringBuilder().append("ch.paint(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    public final void destroy() {
        if (PrefixCodeDecoder.activeGameApplet != this || MidiNoteMixer.appletShutdownStarted) {
            return;
        }
        try {
            MenuScreen.appletStopDeadlineMillis = ClientClockSupport.correctedCurrentTimeMillis(-12520);
            ByteTextDecodingSupport.sleepMillis(0, 5000L);
            SpriteButtonRenderer.appletTaskDispatcher = null;
            this.shutdownAppletServices((byte) 14, false);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "ch.destroy()");
        }
    }

    abstract void updateGame(boolean param0);

    final void startAppletServices(int initialCacheVariant, int methodGuard, int gameCrc, int initialCanvasHeight, int initialCanvasWidth, String gameName, int cacheIndexCount) {
        try {
            PlatformTaskDispatcher createdDispatcher = null;
            RuntimeException startupFailureBeforeContext = null;
            StringBuilder startupMessagePrefix = null;
            String gameNameDescription = null;
            Throwable caughtStartupFailure = null;
            PlatformTask appletThreadTask = null;
            Throwable startupFailureForReport = null;
            RuntimeException startupFailureForContext = null;
            int clientControlSnapshot = 0;
            clientControlSnapshot = Geoblox.clientControlFlowFlag;
            try {
              try {
                if (PrefixCodeDecoder.activeGameApplet != null) {
                  AsyncResourceDownloader.duplicateAppletStartCount = AsyncResourceDownloader.duplicateAppletStartCount + 1;
                  if (AsyncResourceDownloader.duplicateAppletStartCount < 3) {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                    return;
                  }
                  this.showGameError((byte) 79, "alreadyloaded");
                  return;
                }
                SocketArchiveNetworkClient.errorReportGameCrc = gameCrc;
                ClientRenderingState.canvasHeight = initialCanvasHeight;
                NetworkArchiveRequest.initialCanvasHeight = initialCanvasHeight;
                PrefixCodeDecoder.canvasOffsetX = 0;
                ButtonWidget.canvasOffsetY = 0;
                AudioService.canvasWidth = initialCanvasWidth;
                DialWidget.initialCanvasWidth = initialCanvasWidth;
                PrefixCodeDecoder.activeGameApplet = (GameApplet) (this);
                GameScreen.errorReportApplet = NodeHashTableIterator.getActiveApplet(107);
                if (methodGuard != -14948) {
                  return;
                }
                createdDispatcher = new PlatformTaskDispatcher(initialCacheVariant, gameName, cacheIndexCount, true);
                MenuScreen.platformTaskDispatcher = createdDispatcher;
                SpriteButtonRenderer.appletTaskDispatcher = createdDispatcher;
                appletThreadTask = MenuScreen.platformTaskDispatcher.startThread((Runnable) (this), 0, 1);
                while (true) {
                  if (appletThreadTask.status == 0) {
                    ByteTextDecodingSupport.sleepMillis(0, 10L);
                    if (!(clientControlSnapshot != 0)) {
                      continue;
                    }
                  }
                  break;
                }
              } catch (java.lang.Throwable appletStartupFailure) {
                caughtStartupFailure = appletStartupFailure;
                startupFailureForReport = caughtStartupFailure;
                IterableNodeHashTable.reportClientError(startupFailureForReport, (String) null, (byte) 125);
                this.showGameError((byte) 79, "crash");
              }
              return;
            } catch (java.lang.RuntimeException startupContextFailure) {
              caughtStartupFailure = startupContextFailure;
              startupFailureForContext = (RuntimeException) (Object) caughtStartupFailure;
              startupFailureBeforeContext = startupFailureForContext;
              startupMessagePrefix = new StringBuilder().append("ch.B(").append(initialCacheVariant).append(',').append(methodGuard).append(',').append(gameCrc).append(',').append(initialCanvasHeight).append(',').append(initialCanvasWidth).append(',');
              if (gameName == null) {
                gameNameDescription = "null";
              } else {
                gameNameDescription = "{...}";
              }
              throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) startupFailureBeforeContext), ((StringBuilder) (Object) startupMessagePrefix).append(gameNameDescription).append(',').append(cacheIndexCount).append(')').toString());
            }
        } catch (RuntimeException | Error uncheckedStartupFailure) {
            throw uncheckedStartupFailure;
        } catch (Throwable checkedStartupFailure) {
            throw new RuntimeException(checkedStartupFailure);
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
          if (SharedBufferPools.fullscreenFrame != null) {
            stackIn_4_0 = null;
            return (String) (stackIn_4_0);
          }
          if ((VisualPropertyNode.loaderApplet != null) &&
              (this != VisualPropertyNode.loaderApplet)) {
            stackIn_10_0 = VisualPropertyNode.loaderApplet.getParameter(param0);
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getParameter(param0);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("ch.getParameter(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final void renderAppletFrame(int methodGuard) {
        int previousCanvasRefreshCounter = 0;
        long renderTimeMillis = 0L;
        long previousRenderTimeMillis = 0L;
        RuntimeException caughtRenderFailure = null;
        RuntimeException renderFailureForContext = null;
        int elapsedHistoryMillis = 0;
        java.awt.Insets fullscreenInsets = null;
        try {
          if (methodGuard != 32000) {
            this.windowActivated((java.awt.event.WindowEvent) null);
          }
          renderTimeMillis = ClientClockSupport.correctedCurrentTimeMillis(methodGuard - 44520);
          previousRenderTimeMillis = ArchiveRequest.renderTimeHistoryMillis[GzipInflater.nextRenderTimeHistoryIndex];
          ArchiveRequest.renderTimeHistoryMillis[GzipInflater.nextRenderTimeHistoryIndex] = renderTimeMillis;
          GzipInflater.nextRenderTimeHistoryIndex = 31 & GzipInflater.nextRenderTimeHistoryIndex + 1;
          if ((0L != previousRenderTimeMillis) &&
              (previousRenderTimeMillis < renderTimeMillis)) {
            elapsedHistoryMillis = (int)(-previousRenderTimeMillis + renderTimeMillis);
            MatchScoringSupport.frameLoopRateEstimate = (32000 + (elapsedHistoryMillis >> 1)) / elapsedHistoryMillis;
          }
          canvasRefreshLocation: {
            previousCanvasRefreshCounter = DisplayModeInfo.canvasRefreshCounter;
            DisplayModeInfo.canvasRefreshCounter = DisplayModeInfo.canvasRefreshCounter + 1;
            if (previousCanvasRefreshCounter > 50) {
              DisplayModeInfo.canvasRefreshCounter = DisplayModeInfo.canvasRefreshCounter - 50;
              UsernameQueryState.canvasRedrawRequested = true;
              MessageDialog.gameCanvas.setSize(AudioService.canvasWidth, ClientRenderingState.canvasHeight);
              MessageDialog.gameCanvas.setVisible(true);
              if (!((SharedBufferPools.fullscreenFrame != null) &&
                  (FullscreenFocusCanvas.standaloneFrameReference == null))) {
                MessageDialog.gameCanvas.setLocation(PrefixCodeDecoder.canvasOffsetX, ButtonWidget.canvasOffsetY);
                if (Geoblox.clientControlFlowFlag == 0) {
                  break canvasRefreshLocation;
                }
              }
              fullscreenInsets = SharedBufferPools.fullscreenFrame.getInsets();
              MessageDialog.gameCanvas.setLocation(fullscreenInsets.left + PrefixCodeDecoder.canvasOffsetX, ButtonWidget.canvasOffsetY + fullscreenInsets.top);
            }
          }
          this.renderFrame(25853);
          return;
        } catch (java.lang.RuntimeException renderCallbackFailure) {
          caughtRenderFailure = renderCallbackFailure;
          renderFailureForContext = caughtRenderFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) renderFailureForContext), "ch.F(" + methodGuard + ')');
        }
    }

    public final void stop() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if ((this == PrefixCodeDecoder.activeGameApplet) &&
              (!MidiNoteMixer.appletShutdownStarted)) {
            MenuScreen.appletStopDeadlineMillis = 4000L + ClientClockSupport.correctedCurrentTimeMillis(-12520);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "ch.stop()");
        }
    }

    abstract void renderFrame(int param0);

    abstract void serviceAudio(int param0);

    protected GameApplet() {
        this.errorPageShown = false;
    }

    static {
        queuedMeshFaceCount = 0;
        meshFaceCountsByDepthBucket = new int[1024];
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
