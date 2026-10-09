/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

public abstract class GameApplet extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static int queuedMeshFaceCount;
    boolean errorPageShown;
    static int[] meshFaceCountsByDepthBucket;
    public static boolean textLoadControlIncrementEnabled;
    public static boolean sourceUnreferencedFlag1;
    public static boolean sourceUnreferencedFlag2;
    public static boolean sourceUnreferencedFlag3;
    public static boolean sourceUnreferencedFlag4;
    public static int sourceUnreferencedInteger;
    public static boolean sourceUnreferencedFlag5;

    public final java.net.URL getDocumentBase() {
        RuntimeException documentBaseFailureForContext = null;
        Object fullscreenNullDocumentBase = null;
        java.net.URL loaderDocumentBase = null;
        java.net.URL inheritedDocumentBase = null;
        RuntimeException documentBaseFailure = null;
        try {
          if (SharedBufferPools.fullscreenFrame != null) {
            fullscreenNullDocumentBase = null;
            return (java.net.URL) (fullscreenNullDocumentBase);
          }
          if (null != VisualPropertyNode.loaderApplet &&
              this != VisualPropertyNode.loaderApplet) {
            loaderDocumentBase = VisualPropertyNode.loaderApplet.getDocumentBase();
            return loaderDocumentBase;
          }
          inheritedDocumentBase = super.getDocumentBase();
          return inheritedDocumentBase;
        } catch (java.lang.RuntimeException caughtDocumentBaseFailure) {
          documentBaseFailure = caughtDocumentBaseFailure;
          documentBaseFailureForContext = documentBaseFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) documentBaseFailureForContext), "ch.getDocumentBase()");
        }
    }

    public final static void provideLoaderApplet(java.applet.Applet loaderApplet) {
        RuntimeException loaderAssignmentFailureForContext = null;
        RuntimeException loaderAssignmentFailureBeforeDescription = null;
        StringBuilder loaderAssignmentMessagePrefix = null;
        String loaderAppletDescription = null;
        RuntimeException loaderAssignmentFailure = null;
        try {
          VisualPropertyNode.loaderApplet = loaderApplet;
          return;
        } catch (java.lang.RuntimeException caughtLoaderAssignmentFailure) {
          loaderAssignmentFailure = caughtLoaderAssignmentFailure;
          loaderAssignmentFailureForContext = loaderAssignmentFailure;
          loaderAssignmentFailureBeforeDescription = loaderAssignmentFailureForContext;
          loaderAssignmentMessagePrefix = new StringBuilder().append("ch.provideLoaderApplet(");
          if (loaderApplet == null) {
            loaderAppletDescription = "null";
          } else {
            loaderAppletDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) loaderAssignmentFailureBeforeDescription), ((StringBuilder) (Object) loaderAssignmentMessagePrefix).append(loaderAppletDescription).append(')').toString());
        }
    }

    public final void windowClosing(java.awt.event.WindowEvent windowEvent) {
        RuntimeException windowCloseFailureForContext = null;
        RuntimeException windowCloseFailureBeforeDescription = null;
        StringBuilder windowCloseMessagePrefix = null;
        String windowEventDescription = null;
        RuntimeException windowCloseFailure = null;
        try {
          this.destroy();
          return;
        } catch (java.lang.RuntimeException caughtWindowCloseFailure) {
          windowCloseFailure = caughtWindowCloseFailure;
          windowCloseFailureForContext = windowCloseFailure;
          windowCloseFailureBeforeDescription = windowCloseFailureForContext;
          windowCloseMessagePrefix = new StringBuilder().append("ch.windowClosing(");
          if (windowEvent == null) {
            windowEventDescription = "null";
          } else {
            windowEventDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) windowCloseFailureBeforeDescription), ((StringBuilder) (Object) windowCloseMessagePrefix).append(windowEventDescription).append(')').toString());
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

    public final void windowIconified(java.awt.event.WindowEvent unusedWindowEvent) {
    }

    public final void update(java.awt.Graphics graphics) {
        RuntimeException updateFailureForContext = null;
        RuntimeException updateFailureBeforeDescription = null;
        StringBuilder updateMessagePrefix = null;
        String graphicsDescription = null;
        RuntimeException updateFailure = null;
        try {
          this.paint(graphics);
          return;
        } catch (java.lang.RuntimeException caughtUpdateFailure) {
          updateFailure = caughtUpdateFailure;
          updateFailureForContext = updateFailure;
          updateFailureBeforeDescription = updateFailureForContext;
          updateMessagePrefix = new StringBuilder().append("ch.update(");
          if (graphics == null) {
            graphicsDescription = "null";
          } else {
            graphicsDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) updateFailureBeforeDescription), ((StringBuilder) (Object) updateMessagePrefix).append(graphicsDescription).append(')').toString());
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

    public final void windowOpened(java.awt.event.WindowEvent unusedWindowEvent) {
    }

    public final void focusGained(java.awt.event.FocusEvent focusEvent) {
        RuntimeException focusGainFailureForContext = null;
        RuntimeException focusGainFailureBeforeDescription = null;
        StringBuilder focusGainMessagePrefix = null;
        String focusEventDescription = null;
        RuntimeException focusGainFailure = null;
        try {
          CrcAcknowledgedPacket.canvasHasFocus = true;
          UsernameQueryState.canvasRedrawRequested = true;
          return;
        } catch (java.lang.RuntimeException caughtFocusGainFailure) {
          focusGainFailure = caughtFocusGainFailure;
          focusGainFailureForContext = focusGainFailure;
          focusGainFailureBeforeDescription = focusGainFailureForContext;
          focusGainMessagePrefix = new StringBuilder().append("ch.focusGained(");
          if (focusEvent == null) {
            focusEventDescription = "null";
          } else {
            focusEventDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) focusGainFailureBeforeDescription), ((StringBuilder) (Object) focusGainMessagePrefix).append(focusEventDescription).append(')').toString());
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
                    {
                      boolean digitOrLegacyVersionDecisionRemainderEnabled = true;
                      if (PlatformTaskDispatcher.javaVendor != null) {
                        lowercaseVendorOrFocusRootOrFailure = PlatformTaskDispatcher.javaVendor.toLowerCase();
                        if (-1 != ((String) (lowercaseVendorOrFocusRootOrFailure)).indexOf("sun") ||
                            ((String) (lowercaseVendorOrFocusRootOrFailure)).indexOf("apple") != -1) {
                          javaVersionText = PlatformTaskDispatcher.javaVersion;
                          if (javaVersionText.equals("1.1") ||
                              javaVersionText.startsWith("1.1.") ||
                              javaVersionText.equals("1.2") ||
                              javaVersionText.startsWith("1.2.") ||
                              javaVersionText.equals("1.3") ||
                              javaVersionText.startsWith("1.3.") ||
                              javaVersionText.equals("1.4") ||
                              javaVersionText.startsWith("1.4.") ||
                              javaVersionText.equals("1.5") ||
                              javaVersionText.startsWith("1.5.") ||
                              javaVersionText.equals("1.6.0")) {
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
                                digitOrLegacyVersionDecisionRemainderEnabled = false;
                                break;
                              }
                              if (digitOrLegacyVersionPredicate) {
                                updateSuffixIndexOrVersionDigitOrTickIndex++;
                                continue;
                              }
                              break;
                            }
                            if (digitOrLegacyVersionDecisionRemainderEnabled) {
                              javaUpdateSuffix = javaVersionText.substring(6, updateSuffixIndexOrVersionDigitOrTickIndex);
                              if (MessageDialog.isSignedDecimalInt((byte) -115, (CharSequence) ((Object) javaUpdateSuffix)) && !(MultiHandleSliderWidget.parseSignedDecimalInt(false, (CharSequence) ((Object) javaUpdateSuffix)) >= 10)) {
                                this.showGameError((byte) 79, "wrongjava");
                                if (clientControlSnapshot == 0) {
                                  break appletExecutionBoundary;
                                }
                              }
                            }
                          }
                        }
                      }
                      if (digitOrLegacyVersionDecisionRemainderEnabled) {
                        if (PlatformTaskDispatcher.javaVersion == null) {
                          break legacyJavaVersionCheck;
                        }
                        digitOrLegacyVersionPredicate = PlatformTaskDispatcher.javaVersion.startsWith("1.");
                      }
                    }
                    if (digitOrLegacyVersionPredicate) {
                      javaVersionDigitIndex = 2;
                      parsedJavaMajorVersion = 0;
                      while (true) {
                        majorVersionComparison: {
                          if (PlatformTaskDispatcher.javaVersion.length() > javaVersionDigitIndex) {
                            updateSuffixIndexOrVersionDigitOrTickIndex = PlatformTaskDispatcher.javaVersion.charAt(javaVersionDigitIndex);
                            majorVersionComparisonLeft = updateSuffixIndexOrVersionDigitOrTickIndex;
                            majorVersionComparisonRight = 48;
                            if (clientControlSnapshot != 0) {
                              break majorVersionComparison;
                            }
                            if (majorVersionComparisonLeft >= majorVersionComparisonRight &&
                                updateSuffixIndexOrVersionDigitOrTickIndex <= 57) {
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
                  SpriteCheckboxRenderer.estimateHeapCapacityMiB(75);
                  this.rebuildGameCanvas(true);
                  SingleChildWidget.mainRasterBuffer = DropTargetWidget.createCanvasRasterBuffer(false, (java.awt.Component) ((Object) MessageDialog.gameCanvas), ClientRenderingState.canvasHeight, AudioService.canvasWidth);
                  this.initializeGame(117);
                  ReflectionCheckRequest.frameTimer = BufferedSocket.createFrameClock(5000);
                  do {
                    stopDeadlineOrTickDecision: {
                      if (0L != MenuScreen.appletStopDeadlineMillis) {
                        stopDeadlineComparisonOrTickIndex = compareSignedLongs(~MenuScreen.appletStopDeadlineMillis, ~ClientClockSupport.correctedCurrentTimeMillis(-12520));
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
                    do {
                      if (!(TriangleMesh.pendingUpdateTicks > updateSuffixIndexOrVersionDigitOrTickIndex)) {
                        this.renderAppletFrame(32000);
                        OpacityWidget.pollEventQueueAndPostDummyEvent(MenuScreen.platformTaskDispatcher, (byte) 83, MessageDialog.gameCanvas);
                        break;
                      }
                      this.updateAppletTick((byte) -10);
                      updateSuffixIndexOrVersionDigitOrTickIndex++;
                    } while (clientControlSnapshot == 0);
                  } while (clientControlSnapshot == 0);
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
        RuntimeException appletContextFailureForContext = null;
        Object fullscreenNullAppletContext = null;
        java.applet.AppletContext loaderAppletContext = null;
        java.applet.AppletContext inheritedAppletContext = null;
        RuntimeException appletContextFailure = null;
        try {
          if (SharedBufferPools.fullscreenFrame != null) {
            fullscreenNullAppletContext = null;
            return (java.applet.AppletContext) (fullscreenNullAppletContext);
          }
          if (VisualPropertyNode.loaderApplet != null &&
              this != VisualPropertyNode.loaderApplet) {
            loaderAppletContext = VisualPropertyNode.loaderApplet.getAppletContext();
            return loaderAppletContext;
          }
          inheritedAppletContext = super.getAppletContext();
          return inheritedAppletContext;
        } catch (java.lang.RuntimeException caughtAppletContextFailure) {
          appletContextFailure = caughtAppletContextFailure;
          appletContextFailureForContext = appletContextFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) appletContextFailureForContext), "ch.getAppletContext()");
        }
    }

    public final void windowClosed(java.awt.event.WindowEvent unusedWindowEvent) {
    }

    public final void windowDeiconified(java.awt.event.WindowEvent unusedWindowEvent) {
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
          if (FullscreenFocusCanvas.standaloneFrameReference == null) {
            if (null == SharedBufferPools.fullscreenFrame) {
              if (VisualPropertyNode.loaderApplet != null) {
                selectedContainerOrFailure = VisualPropertyNode.loaderApplet;
                if (clientControlSnapshot != 0) {
                  selectedContainerOrFailure = PrefixCodeDecoder.activeGameApplet;
                  if (clientControlSnapshot != 0) {
                    selectedContainerOrFailure = SharedBufferPools.fullscreenFrame;
                    if (clientControlSnapshot != 0) {
                      selectedContainerOrFailure = FullscreenFocusCanvas.standaloneFrameReference;
                    }
                  }
                }
              } else {
                selectedContainerOrFailure = PrefixCodeDecoder.activeGameApplet;
                if (clientControlSnapshot != 0) {
                  selectedContainerOrFailure = SharedBufferPools.fullscreenFrame;
                  if (clientControlSnapshot != 0) {
                    selectedContainerOrFailure = FullscreenFocusCanvas.standaloneFrameReference;
                  }
                }
              }
            } else {
              selectedContainerOrFailure = SharedBufferPools.fullscreenFrame;
              if (clientControlSnapshot != 0) {
                selectedContainerOrFailure = FullscreenFocusCanvas.standaloneFrameReference;
              }
            }
          } else {
            selectedContainerOrFailure = FullscreenFocusCanvas.standaloneFrameReference;
          }
          ((java.awt.Container) (selectedContainerOrFailure)).setLayout((java.awt.LayoutManager) null);
          MessageDialog.gameCanvas = (java.awt.Canvas) ((Object) new DelegatingCanvas((java.awt.Component) (this)));
          ((java.awt.Container) (selectedContainerOrFailure)).add((java.awt.Component) ((Object) MessageDialog.gameCanvas));
          MessageDialog.gameCanvas.setSize(AudioService.canvasWidth, ClientRenderingState.canvasHeight);
          MessageDialog.gameCanvas.setVisible(visible);
          if (SharedBufferPools.fullscreenFrame != selectedContainerOrFailure) {
            MessageDialog.gameCanvas.setLocation(PrefixCodeDecoder.canvasOffsetX, ButtonWidget.canvasOffsetY);
            if (clientControlSnapshot != 0) {
              fullscreenInsets = SharedBufferPools.fullscreenFrame.getInsets();
              MessageDialog.gameCanvas.setLocation(fullscreenInsets.left + PrefixCodeDecoder.canvasOffsetX, fullscreenInsets.top + ButtonWidget.canvasOffsetY);
            }
          } else {
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
        RuntimeException startFailureForContext = null;
        RuntimeException startFailure = null;
        try {
          if (this == PrefixCodeDecoder.activeGameApplet &&
              !MidiNoteMixer.appletShutdownStarted) {
            MenuScreen.appletStopDeadlineMillis = 0L;
            return;
          }
          return;
        } catch (java.lang.RuntimeException caughtStartFailure) {
          startFailure = caughtStartFailure;
          startFailureForContext = startFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) startFailureForContext), "ch.start()");
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
          if (openParenthesisIndex != -1 &&
              -1 != closeParenthesisIndex) {
            javaSourceSuffixIndex = stackFrameLine.indexOf(".java:", openParenthesisIndex);
            if (javaSourceSuffixIndex >= 0) {
              compactTrace = compactTrace + stackFrameLine.substring(javaSourceSuffixIndex + 5, closeParenthesisIndex);
            }
          }
          compactTrace = compactTrace + ' ';
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent unusedWindowEvent) {
    }

    public final void windowActivated(java.awt.event.WindowEvent unusedWindowEvent) {
    }

    final boolean isAppletStartupAllowed(boolean unusedMethodGuard) {
        return true;
    }

    public final java.net.URL getCodeBase() {
        RuntimeException unusedCodeBaseFailure;
        if (null != SharedBufferPools.fullscreenFrame) {
          return null;
        }
        if (null != VisualPropertyNode.loaderApplet &&
            VisualPropertyNode.loaderApplet != this) {
          return VisualPropertyNode.loaderApplet.getCodeBase();
        }
        return super.getCodeBase();
    }

    public final void focusLost(java.awt.event.FocusEvent focusEvent) {
        RuntimeException focusLossFailureForContext = null;
        RuntimeException focusLossFailureBeforeDescription = null;
        StringBuilder focusLossMessagePrefix = null;
        String focusEventDescription = null;
        RuntimeException focusLossFailure = null;
        try {
          CrcAcknowledgedPacket.canvasHasFocus = false;
          return;
        } catch (java.lang.RuntimeException caughtFocusLossFailure) {
          focusLossFailure = caughtFocusLossFailure;
          focusLossFailureForContext = focusLossFailure;
          focusLossFailureBeforeDescription = focusLossFailureForContext;
          focusLossMessagePrefix = new StringBuilder().append("ch.focusLost(");
          if (focusEvent == null) {
            focusEventDescription = "null";
          } else {
            focusEventDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) focusLossFailureBeforeDescription), ((StringBuilder) (Object) focusLossMessagePrefix).append(focusEventDescription).append(')').toString());
        }
    }

    abstract void initializeGame(int methodGuard);

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
          if (previousUpdateTimeMillis != 0L &&
              updateTimeMillis > previousUpdateTimeMillis) {
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

    abstract void releaseGameResources(byte methodGuard);

    public abstract void init();

    public final synchronized void paint(java.awt.Graphics graphics) {
        java.awt.Rectangle graphicsClipBounds = null;
        RuntimeException paintingFailureBeforeDescription = null;
        StringBuilder paintingMessagePrefix = null;
        String graphicsDescription = null;
        RuntimeException paintingFailure = null;
        RuntimeException paintingFailureForContext = null;
        try {
          if (PrefixCodeDecoder.activeGameApplet == this &&
              !MidiNoteMixer.appletShutdownStarted) {
            UsernameQueryState.canvasRedrawRequested = true;
            if (ResizableDialog.legacyJavaCanvasRefreshRequired &&
                -Geoblox.canvasCreationTimeMillis + ClientClockSupport.correctedCurrentTimeMillis(-12520) > 1000L) {
              graphicsClipBounds = graphics.getClipBounds();
              if (null != graphicsClipBounds) {
                if (graphicsClipBounds.width < DialWidget.initialCanvasWidth) {
                  return;
                }
                if (NetworkArchiveRequest.initialCanvasHeight > graphicsClipBounds.height) {
                  return;
                }
              }
              EntityMotionSupport.canvasReplacementRequested = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException caughtPaintingFailure) {
          paintingFailure = caughtPaintingFailure;
          paintingFailureForContext = paintingFailure;
          paintingFailureBeforeDescription = paintingFailureForContext;
          paintingMessagePrefix = new StringBuilder().append("ch.paint(");
          if (graphics == null) {
            graphicsDescription = "null";
          } else {
            graphicsDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) paintingFailureBeforeDescription), ((StringBuilder) (Object) paintingMessagePrefix).append(graphicsDescription).append(')').toString());
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
        } catch (RuntimeException destructionFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) destructionFailure), "ch.destroy()");
        }
    }

    abstract void updateGame(boolean methodGuard);

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
                PrefixCodeDecoder.activeGameApplet = this;
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
                    if (clientControlSnapshot == 0) {
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

    public final String getParameter(String parameterName) {
        RuntimeException parameterLookupFailureForContext = null;
        Object fullscreenNullParameterValue = null;
        String loaderParameterValue = null;
        String inheritedParameterValue = null;
        RuntimeException parameterLookupFailureBeforeDescription = null;
        StringBuilder parameterLookupMessagePrefix = null;
        String parameterNameDescription = null;
        RuntimeException parameterLookupFailure = null;
        try {
          if (SharedBufferPools.fullscreenFrame != null) {
            fullscreenNullParameterValue = null;
            return (String) (fullscreenNullParameterValue);
          }
          if (VisualPropertyNode.loaderApplet != null &&
              this != VisualPropertyNode.loaderApplet) {
            loaderParameterValue = VisualPropertyNode.loaderApplet.getParameter(parameterName);
            return loaderParameterValue;
          }
          inheritedParameterValue = super.getParameter(parameterName);
          return inheritedParameterValue;
        } catch (java.lang.RuntimeException caughtParameterLookupFailure) {
          parameterLookupFailure = caughtParameterLookupFailure;
          parameterLookupFailureForContext = parameterLookupFailure;
          parameterLookupFailureBeforeDescription = parameterLookupFailureForContext;
          parameterLookupMessagePrefix = new StringBuilder().append("ch.getParameter(");
          if (parameterName == null) {
            parameterNameDescription = "null";
          } else {
            parameterNameDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) parameterLookupFailureBeforeDescription), ((StringBuilder) (Object) parameterLookupMessagePrefix).append(parameterNameDescription).append(')').toString());
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
          if (0L != previousRenderTimeMillis &&
              previousRenderTimeMillis < renderTimeMillis) {
            elapsedHistoryMillis = (int)(-previousRenderTimeMillis + renderTimeMillis);
            MatchScoringSupport.frameLoopRateEstimate = (32000 + (elapsedHistoryMillis >> 1)) / elapsedHistoryMillis;
          }
          previousCanvasRefreshCounter = DisplayModeInfo.canvasRefreshCounter;
          DisplayModeInfo.canvasRefreshCounter = DisplayModeInfo.canvasRefreshCounter + 1;
          if (previousCanvasRefreshCounter > 50) {
            DisplayModeInfo.canvasRefreshCounter = DisplayModeInfo.canvasRefreshCounter - 50;
            UsernameQueryState.canvasRedrawRequested = true;
            MessageDialog.gameCanvas.setSize(AudioService.canvasWidth, ClientRenderingState.canvasHeight);
            MessageDialog.gameCanvas.setVisible(true);
            if (SharedBufferPools.fullscreenFrame == null ||
                FullscreenFocusCanvas.standaloneFrameReference != null) {
              MessageDialog.gameCanvas.setLocation(PrefixCodeDecoder.canvasOffsetX, ButtonWidget.canvasOffsetY);
              if (Geoblox.clientControlFlowFlag != 0) {
                fullscreenInsets = SharedBufferPools.fullscreenFrame.getInsets();
                MessageDialog.gameCanvas.setLocation(fullscreenInsets.left + PrefixCodeDecoder.canvasOffsetX, ButtonWidget.canvasOffsetY + fullscreenInsets.top);
              }
            } else {
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
        RuntimeException stopFailureForContext = null;
        RuntimeException stopFailure = null;
        try {
          if (this == PrefixCodeDecoder.activeGameApplet &&
              !MidiNoteMixer.appletShutdownStarted) {
            MenuScreen.appletStopDeadlineMillis = 4000L + ClientClockSupport.correctedCurrentTimeMillis(-12520);
            return;
          }
          return;
        } catch (java.lang.RuntimeException caughtStopFailure) {
          stopFailure = caughtStopFailure;
          stopFailureForContext = stopFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stopFailureForContext), "ch.stop()");
        }
    }

    abstract void renderFrame(int methodGuard);

    abstract void serviceAudio(int methodGuard);

    protected GameApplet() {
        this.errorPageShown = false;
    }

    static {
        queuedMeshFaceCount = 0;
        meshFaceCountsByDepthBucket = new int[1024];
    }

    private static int compareSignedLongs(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
