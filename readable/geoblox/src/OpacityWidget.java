/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpacityWidget extends SingleChildWidget {
    static String fullscreenAfterAcceptText;
    static String createInvalidEmailAlertText;
    int opacity;
    static ResourceArchive synthesizedSoundArchive;
    static boolean[] enabledSessionPacketOpcodes;
    static String createDisplayNameText;

    public OpacityWidget() {
        super(0, 0, 0, 0, (WidgetRenderer) null, (WidgetListener) null);
        this.opacity = 256;
    }

    final static boolean isLogoAnimationComplete(int methodGuard) {
        if (methodGuard != 7426) {
            createDisplayNameText = (String) null;
        }
        return 250 < DequeCursor.logoAnimationTick ? true : false;
    }

    OpacityWidget(UiWidget content) {
        super(content.widgetX, content.widgetY, content.widgetWidth, content.widgetHeight, (WidgetRenderer) null, (WidgetListener) null);
        try {
            content.setWidgetBounds(this.widgetHeight, this.widgetWidth, (byte) -113, 0, 0);
            this.opacity = 256;
            this.child = content;
        } catch (RuntimeException opacityWidgetConstructionFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) opacityWidgetConstructionFailure), "wj.<init>(" + (content != null ? "{...}" : "null") + ')');
        }
    }

    final static String replaceIndexedTextMarkers(String templateText, String[] replacementTexts, byte methodGuard) {
        StringBuilder discardedTailAppendResult = null;
        StringBuilder discardedPrefixAppendResult = null;
        StringBuilder discardedReplacementAppendResult = null;
        String nullTemplateResult = null;
        String completedTemplateResult = null;
        RuntimeException templateFailureBeforeDescription = null;
        StringBuilder templateMessagePrefix = null;
        String templateDescription = null;
        StringBuilder templateMessageBeforeReplacements = null;
        String replacementsDescription = null;
        RuntimeException caughtTemplateFailure = null;
        int templateLength = 0;
        RuntimeException templateFailureForContext = null;
        int resultCapacity = 0;
        int scanCursor = 0;
        int capacityMarkerStart = 0;
        StringBuilder resultBuilder = null;
        int unchangedTextStart = 0;
        String capacityMarkerIdText = null;
        int capacityReplacementIndexOrBuildMarkerStart = 0;
        String buildMarkerIdText = null;
        int buildReplacementIndex = 0;
        try {
          templateLength = templateText.length();
          resultCapacity = templateLength;
          scanCursor = 0;
          while (true) {
            capacityMarkerStart = templateText.indexOf("<%", scanCursor);
            if (0 <= capacityMarkerStart) {
              for (scanCursor = capacityMarkerStart + 2; templateLength > scanCursor; scanCursor++) {
                if (DualLinkNode.isAsciiDigit(-58, templateText.charAt(scanCursor))) {
                  continue;
                }
                break;
              }
              capacityMarkerIdText = templateText.substring(capacityMarkerStart + 2, scanCursor);
              if (!MessageDialog.isSignedDecimalInt((byte) -123, (CharSequence) ((Object) capacityMarkerIdText))) {
                continue;
              }
              if (scanCursor >= templateLength) {
                continue;
              }
              if (templateText.charAt(scanCursor) != 62) {
                continue;
              }
              scanCursor++;
              capacityReplacementIndexOrBuildMarkerStart = MultiHandleSliderWidget.parseSignedDecimalInt(false, (CharSequence) ((Object) capacityMarkerIdText));
              resultCapacity = resultCapacity + (-scanCursor + (capacityMarkerStart + replacementTexts[capacityReplacementIndexOrBuildMarkerStart].length()));
              continue;
            }
            break;
          }
          resultBuilder = new StringBuilder(resultCapacity);
          unchangedTextStart = 0;
          scanCursor = 0;
          if (methodGuard >= -12) {
            nullTemplateResult = (String) null;
            return nullTemplateResult;
          }
          while (true) {
            capacityReplacementIndexOrBuildMarkerStart = templateText.indexOf("<%", scanCursor);
            if (0 > capacityReplacementIndexOrBuildMarkerStart) {
              discardedTailAppendResult = resultBuilder.append(templateText.substring(unchangedTextStart));
              completedTemplateResult = resultBuilder.toString();
              return completedTemplateResult;
            }
            for (scanCursor = capacityReplacementIndexOrBuildMarkerStart + 2; scanCursor < templateLength; scanCursor++) {
              if (DualLinkNode.isAsciiDigit(-58, templateText.charAt(scanCursor))) {
                continue;
              }
              break;
            }
            buildMarkerIdText = templateText.substring(2 + capacityReplacementIndexOrBuildMarkerStart, scanCursor);
            if (!MessageDialog.isSignedDecimalInt((byte) -125, (CharSequence) ((Object) buildMarkerIdText))) {
              continue;
            }
            if (templateLength <= scanCursor) {
              continue;
            }
            if (templateText.charAt(scanCursor) != 62) {
              continue;
            }
            scanCursor++;
            buildReplacementIndex = MultiHandleSliderWidget.parseSignedDecimalInt(false, (CharSequence) ((Object) buildMarkerIdText));
            discardedPrefixAppendResult = resultBuilder.append(templateText.substring(unchangedTextStart, capacityReplacementIndexOrBuildMarkerStart));
            unchangedTextStart = scanCursor;
            discardedReplacementAppendResult = resultBuilder.append(replacementTexts[buildReplacementIndex]);
            continue;
          }
        } catch (java.lang.RuntimeException templateFailure) {
          caughtTemplateFailure = templateFailure;
          templateFailureForContext = caughtTemplateFailure;
          templateFailureBeforeDescription = templateFailureForContext;
          templateMessagePrefix = new StringBuilder().append("wj.E(");
          if (templateText == null) {
            templateDescription = "null";
          } else {
            templateDescription = "{...}";
          }
          templateMessageBeforeReplacements = ((StringBuilder) (Object) templateMessagePrefix).append(templateDescription).append(',');
          if (replacementTexts == null) {
            replacementsDescription = "null";
          } else {
            replacementsDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) templateFailureBeforeDescription), ((StringBuilder) (Object) templateMessageBeforeReplacements).append(replacementsDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    final void renderWidget(int parentX, int parentY, byte methodGuard, int renderPass) {
        int guardResidue = 16 % ((methodGuard - 1) / 43);
        if (!(renderPass == 0)) {
            return;
        }
        if (null == this.child) {
            return;
        }
        if (this.opacity == 0) {
            return;
        }
        if (this.opacity == 256) {
            this.child.renderWidget(parentX + this.widgetX, parentY + this.widgetY, (byte) 83, renderPass);
            return;
        }
        Sprite contentRaster = new Sprite(this.child.widgetWidth, this.child.widgetHeight);
        Geoblox.setRasterTarget(1, contentRaster);
        this.child.renderWidget(0, 0, (byte) -115, renderPass);
        RasterTargetRestoreSupport.restoreRasterTarget(true);
        contentRaster.drawAlpha(this.widgetX + parentX, this.widgetY + parentY, this.opacity);
    }

    public static void releaseOpacitySharedResources(byte methodGuard) {
        enabledSessionPacketOpcodes = null;
        createInvalidEmailAlertText = null;
        fullscreenAfterAcceptText = null;
        if (methodGuard != -60) {
            return;
        }
        synthesizedSoundArchive = null;
        createDisplayNameText = null;
    }

    final static void pollEventQueueAndPostDummyEvent(PlatformTaskDispatcher taskDispatcher, byte methodGuard, Object eventSource) {
        int queuePollIndex = 0;
        RuntimeException queueFailureBeforeDescription = null;
        StringBuilder queueMessagePrefix = null;
        String dispatcherDescription = null;
        StringBuilder queueMessageBeforeEventSource = null;
        String eventSourceDescription = null;
        Throwable caughtQueueOrPostFailure = null;
        Exception ignoredPostFailure = null;
        RuntimeException queueFailureForContext = null;
        int guardQuotient = 0;
        int unusedClientControlSnapshot = 0;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          if (taskDispatcher.systemEventQueue == null) {
            return;
          }
          for (queuePollIndex = 0; queuePollIndex < 50; queuePollIndex++) {
            if (null != taskDispatcher.systemEventQueue.peekEvent()) {
              ByteTextDecodingSupport.sleepMillis(0, 1L);
              continue;
            }
            break;
          }
          guardQuotient = 11 / ((methodGuard - 2) / 48);
          try {
            if (eventSource != null) {
              taskDispatcher.systemEventQueue.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(eventSource, 1001, "dummy")));
            }
          } catch (java.lang.Exception postFailure) {
            caughtQueueOrPostFailure = postFailure;
            ignoredPostFailure = (Exception) (Object) caughtQueueOrPostFailure;
          }
          return;
        } catch (java.lang.RuntimeException queueFailure) {
          caughtQueueOrPostFailure = queueFailure;
          queueFailureForContext = (RuntimeException) (Object) caughtQueueOrPostFailure;
          queueFailureBeforeDescription = queueFailureForContext;
          queueMessagePrefix = new StringBuilder().append("wj.G(");
          if (taskDispatcher == null) {
            dispatcherDescription = "null";
          } else {
            dispatcherDescription = "{...}";
          }
          queueMessageBeforeEventSource = ((StringBuilder) (Object) queueMessagePrefix).append(dispatcherDescription).append(',').append(methodGuard).append(',');
          if (eventSource == null) {
            eventSourceDescription = "null";
          } else {
            eventSourceDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) queueFailureBeforeDescription), ((StringBuilder) (Object) queueMessageBeforeEventSource).append(eventSourceDescription).append(')').toString());
        }
    }

    final static Sprite[] loadSpriteFrames(String resourceName, String groupName, ResourceArchive graphicsArchive, int methodGuard) {
        int archiveGroupId = 0;
        RuntimeException spriteLoadFailureForContext = null;
        int archiveFileId = 0;
        Sprite[] spriteFramesBeforeReturn = null;
        RuntimeException spriteLoadFailureBeforeDescription = null;
        StringBuilder spriteLoadMessagePrefix = null;
        String resourceNameDescription = null;
        StringBuilder spriteLoadMessageBeforeGroupName = null;
        String groupNameDescription = null;
        StringBuilder spriteLoadMessageBeforeArchive = null;
        String archiveDescription = null;
        RuntimeException caughtSpriteLoadFailure = null;
        try {
          archiveGroupId = graphicsArchive.findGroupId((byte) 126, groupName);
          archiveFileId = graphicsArchive.findFileId(resourceName, -114, archiveGroupId);
          if (methodGuard != 0) {
            enabledSessionPacketOpcodes = (boolean[]) null;
          }
          spriteFramesBeforeReturn = GameGraphicsResources.loadRgbSpritesById(archiveGroupId, (byte) -81, archiveFileId, graphicsArchive);
          return spriteFramesBeforeReturn;
        } catch (java.lang.RuntimeException spriteLoadFailure) {
          caughtSpriteLoadFailure = spriteLoadFailure;
          spriteLoadFailureForContext = caughtSpriteLoadFailure;
          spriteLoadFailureBeforeDescription = spriteLoadFailureForContext;
          spriteLoadMessagePrefix = new StringBuilder().append("wj.C(");
          if (resourceName == null) {
            resourceNameDescription = "null";
          } else {
            resourceNameDescription = "{...}";
          }
          spriteLoadMessageBeforeGroupName = ((StringBuilder) (Object) spriteLoadMessagePrefix).append(resourceNameDescription).append(',');
          if (groupName == null) {
            groupNameDescription = "null";
          } else {
            groupNameDescription = "{...}";
          }
          spriteLoadMessageBeforeArchive = ((StringBuilder) (Object) spriteLoadMessageBeforeGroupName).append(groupNameDescription).append(',');
          if (graphicsArchive == null) {
            archiveDescription = "null";
          } else {
            archiveDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) spriteLoadFailureBeforeDescription), ((StringBuilder) (Object) spriteLoadMessageBeforeArchive).append(archiveDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    static {
        createInvalidEmailAlertText = "Please check if address is correct";
        fullscreenAfterAcceptText = "to keep fullscreen or";
        enabledSessionPacketOpcodes = new boolean[64];
        createDisplayNameText = "Player Name: ";
    }
}
