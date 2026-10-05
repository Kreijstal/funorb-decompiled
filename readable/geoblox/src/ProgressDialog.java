/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ProgressDialog extends ResizableDialog {
    private String introductoryText;
    static LoginMethod usernameLoginMethod;
    private boolean normalAnimationStopped;
    private boolean redHighlightActive;
    private ProgressBarWidget progressBar;
    private String statusText;

    ProgressDialog(DialogLayer dialogLayer, String introductoryText) {
        super(dialogLayer, 300, 120);
        int introductionHeight = 0;
        try {
            this.introductoryText = introductoryText;
            if (this.introductoryText != null) {
                introductionHeight = UiFontResources.commonUiBoldFont.measureWrappedHeight(this.introductoryText, 260, UiFontResources.commonUiBoldFont.maxAscent);
                this.resizeAndCenter(introductionHeight + 150, 103, 300);
            }
            this.progressBar = new ProgressBarWidget(13, 50, 274, 30, 15, 2113632, 4210752);
            this.normalAnimationStopped = false;
            this.progressBar.animationEnabled = true;
            this.redHighlightActive = false;
            this.addChild((byte) -98, this.progressBar);
        } catch (RuntimeException progressDialogConstructionFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) progressDialogConstructionFailure), "rl.<init>(" + (dialogLayer != null ? "{...}" : "null") + ',' + (introductoryText != null ? "{...}" : "null") + ')');
        }
    }

    final static DelayedPcmStream delayStreamByMillis(int delayMillis, PcmStream stream, int methodGuard) {
        RuntimeException delayedStreamFailureForContext = null;
        DelayedPcmStream delayedStreamBeforeReturn = null;
        RuntimeException delayedFailureBeforeContext = null;
        StringBuilder delayedMessagePrefix = null;
        String streamDescription = null;
        RuntimeException caughtDelayedStreamFailure = null;
        try {
          if (methodGuard != 1000) {
            ProgressDialog.isUsernameQueryFlowPending(-33);
          }
          delayedStreamBeforeReturn = new DelayedPcmStream(stream, delayMillis * AudioOutput.sampleRateHz / 1000);
          return delayedStreamBeforeReturn;
        } catch (java.lang.RuntimeException delayedStreamFailure) {
          caughtDelayedStreamFailure = delayedStreamFailure;
          delayedStreamFailureForContext = caughtDelayedStreamFailure;
          delayedFailureBeforeContext = delayedStreamFailureForContext;
          delayedMessagePrefix = new StringBuilder().append("rl.E(").append(delayMillis).append(',');
          if (stream == null) {
            streamDescription = "null";
          } else {
            streamDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) delayedFailureBeforeContext), ((StringBuilder) (Object) delayedMessagePrefix).append(streamDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    final static boolean isUsernameQueryFlowPending(int methodGuard) {
        if (methodGuard != -1071908447) {
            return false;
        }
        return IntrusiveDeque.pendingClientFlowToken == WidgetSkinState.usernameQueryFlowState ? true : false;
    }

    final void stopNormalAnimation(int methodGuard) {
        this.progressBar.animationEnabled = false;
        this.normalAnimationStopped = true;
        if (methodGuard != 23181) {
            PcmStream guardedNullStream = (PcmStream) null;
            ProgressDialog.delayStreamByMillis(9, (PcmStream) null, 122);
        }
    }

    final static void writeByteShortQuery(int packetOpcode, int methodGuard, ByteShortQuery query) {
        PacketBuffer outgoingQueryPacket = null;
        RuntimeException queryWriteFailureForContext = null;
        RuntimeException queryFailureBeforeContext = null;
        StringBuilder queryMessagePrefix = null;
        String queryDescription = null;
        RuntimeException caughtQueryWriteFailure = null;
        try {
          outgoingQueryPacket = CacheReference.outgoingSessionBuffer;
          outgoingQueryPacket.writeCipherByte(packetOpcode, (byte) -85);
          outgoingQueryPacket.writeByte((byte) 123, query.queryByte);
          outgoingQueryPacket.writeShortBE(query.queryShort, methodGuard + 28161);
          if (methodGuard == 534) {
            return;
          }
          usernameLoginMethod = (LoginMethod) null;
          return;
        } catch (java.lang.RuntimeException queryWriteFailure) {
          caughtQueryWriteFailure = queryWriteFailure;
          queryWriteFailureForContext = caughtQueryWriteFailure;
          queryFailureBeforeContext = queryWriteFailureForContext;
          queryMessagePrefix = new StringBuilder().append("rl.G(").append(packetOpcode).append(',').append(methodGuard).append(',');
          if (query == null) {
            queryDescription = "null";
          } else {
            queryDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) queryFailureBeforeContext), ((StringBuilder) (Object) queryMessagePrefix).append(queryDescription).append(')').toString());
        }
    }

    public static void releaseProgressDialogLoginMethod(byte methodGuard) {
        if (methodGuard != 57) {
            usernameLoginMethod = (LoginMethod) null;
            usernameLoginMethod = null;
            return;
        }
        usernameLoginMethod = null;
    }

    final void updateProgress(boolean redHighlight, String statusText, int methodGuard, float percentage) {
        int guardResidue = 0;
        RuntimeException progressUpdateFailureForContext = null;
        boolean requestedHighlightBeforeComparison = false;
        int highlightToggleComparisonValue = 0;
        boolean enabledHighlightSnapshot = false;
        RuntimeException progressFailureBeforeContext = null;
        StringBuilder progressMessagePrefix = null;
        String statusTextDescription = null;
        RuntimeException caughtProgressUpdateFailure = null;
        try {
          guardResidue = -51 / ((methodGuard - 86) / 32);
          requestedHighlightBeforeComparison = redHighlight;
          if (this.redHighlightActive) {
            highlightToggleComparisonValue = 0;
          } else {
            highlightToggleComparisonValue = 1;
          }
          if ((requestedHighlightBeforeComparison ? 1 : 0) != highlightToggleComparisonValue) {
            this.statusText = statusText;
            this.progressBar.fillFractionQ16 = (int)(65536.0f * (percentage / 100.0f));
            return;
          }
          enabledHighlightSnapshot = !(!redHighlight);
          ((ProgressDialog) (this)).redHighlightActive = enabledHighlightSnapshot;
          if (!this.redHighlightActive) {
            this.progressBar.setStripeColors(4210752, 2113632, (byte) -103);
            if (this.normalAnimationStopped) {
              this.progressBar.animationEnabled = false;
            }
          } else {
            this.progressBar.setStripeColors(4210752, 8405024, (byte) -103);
            this.progressBar.animationEnabled = true;
          }
          this.statusText = statusText;
          this.progressBar.fillFractionQ16 = (int)(65536.0f * (percentage / 100.0f));
          return;
        } catch (java.lang.RuntimeException progressUpdateFailure) {
          caughtProgressUpdateFailure = progressUpdateFailure;
          progressUpdateFailureForContext = caughtProgressUpdateFailure;
          progressFailureBeforeContext = progressUpdateFailureForContext;
          progressMessagePrefix = new StringBuilder().append("rl.C(").append(redHighlight).append(',');
          if (statusText == null) {
            statusTextDescription = "null";
          } else {
            statusTextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) progressFailureBeforeContext), ((StringBuilder) (Object) progressMessagePrefix).append(statusTextDescription).append(',').append(methodGuard).append(',').append(percentage).append(')').toString());
        }
    }

    final void drawDialogFrame(int x, int methodGuard, int y) {
        super.drawDialogFrame(x, methodGuard, y);
        UiFontResources.commonUiBoldFont.drawCenteredText(this.statusText, (this.widgetWidth >> 1) + x, y + 103, 16777215, -1);
        if (this.introductoryText != null) {
            SoftwareRasterizer.drawHorizontalLine(20 + x, -7 + y + 120, 260, 8421504);
            UiFontResources.commonUiBoldFont.drawParagraph(this.introductoryText, x + 20, 8 + (120 + y), 260, 100, 16777215, -1, 1, 0, UiFontResources.commonUiBoldFont.maxAscent);
        }
    }

    static {
        usernameLoginMethod = new LoginMethod("usename");
    }
}
