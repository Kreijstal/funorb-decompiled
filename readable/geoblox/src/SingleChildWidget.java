/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class SingleChildWidget extends UiWidget implements ChildWidgetOwner {
    static AwtRasterBuffer mainRasterBuffer;
    static int[] projectedMeshVertexX;
    static String fpsTextTemplate;
    UiWidget child;

    boolean handlePointerPress(int parentY, int methodGuard, int parentX, int pointerButton, int pointerX, int pointerY, UiWidget eventContext) {
        int guardResidue = 0;
        RuntimeException pointerPressFailure = null;
        boolean childHandledPress = false;
        RuntimeException pressFailureForContext = null;
        StringBuilder pressContextBuilder = null;
        String eventContextDescription = null;
        RuntimeException caughtPressFailure = null;
        try {
          guardResidue = 124 % ((-3 - methodGuard) / 38);
          childHandledPress = (this.child != null) && (this.child.handlePointerPress(this.widgetY + parentY, -96, this.widgetX + parentX, pointerButton, pointerX, pointerY, eventContext));
          return childHandledPress;
        } catch (java.lang.RuntimeException pressFailure) {
          caughtPressFailure = pressFailure;
          pointerPressFailure = caughtPressFailure;
          pressFailureForContext = pointerPressFailure;
          pressContextBuilder = new StringBuilder().append("sh.D(").append(parentY).append(',').append(methodGuard).append(',').append(parentX).append(',').append(pointerButton).append(',').append(pointerX).append(',').append(pointerY).append(',');
          if (eventContext == null) {
            eventContextDescription = "null";
          } else {
            eventContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) pressFailureForContext), ((StringBuilder) (Object) pressContextBuilder).append(eventContextDescription).append(')').toString());
        }
    }

    final static void sortRankedEntryRange(int startIndex, int prefixLimitIndex, int lowerKeyBound, int upperKeyBound, byte methodGuard, int endIndexExclusive, boolean useSecondKey) {
        int entryIndex = 0;
        int partitionIndexBeforeIncrement = 0;
        int selectedKeySnapshot = 0;
        RuntimeException caughtSortFailure = null;
        int midpointOrBubbleEnd = 0;
        RuntimeException sortFailureForContext = null;
        int partitionOrBubbleIndex = 0;
        int leastUpperKeyOrLeftEntry = 0;
        int greatestLowerKeyOrRightEntry = 0;
        int entry = 0;
        int entryKey = 0;
        int clientControlFlowSnapshot = 0;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        try {
          if (prefixLimitIndex <= startIndex) {
            return;
          }
          if (endIndexExclusive <= startIndex + 1) {
            return;
          }
          if (startIndex + 5 < endIndexExclusive &&
              upperKeyBound != lowerKeyBound) {
            midpointOrBubbleEnd = (1 & (upperKeyBound & lowerKeyBound)) + (lowerKeyBound >> 1) + (upperKeyBound >> 1);
            partitionOrBubbleIndex = startIndex;
            leastUpperKeyOrLeftEntry = upperKeyBound;
            if (methodGuard < 106) {
              return;
            }
            greatestLowerKeyOrRightEntry = lowerKeyBound;
            for (entryIndex = startIndex; entryIndex < endIndexExclusive; entryIndex++) {
              entry = AchievementQuery.rankedEntryIndices[entryIndex];
              if (!useSecondKey) {
                selectedKeySnapshot = ClientProtocolStage.rankedEntryKeyOne[entry];
              } else {
                selectedKeySnapshot = LoginPasswordSupport.rankedEntryKeyTwo[entry];
              }
              entryKey = selectedKeySnapshot;
              if (entryKey > midpointOrBubbleEnd) {
                AchievementQuery.rankedEntryIndices[entryIndex] = AchievementQuery.rankedEntryIndices[partitionOrBubbleIndex];
                partitionIndexBeforeIncrement = partitionOrBubbleIndex;
                partitionOrBubbleIndex++;
                AchievementQuery.rankedEntryIndices[partitionIndexBeforeIncrement] = entry;
                if (leastUpperKeyOrLeftEntry > entryKey) {
                  leastUpperKeyOrLeftEntry = entryKey;
                }
              } else {
                if (greatestLowerKeyOrRightEntry >= entryKey) {
                  continue;
                }
                greatestLowerKeyOrRightEntry = entryKey;
              }
            }
            SingleChildWidget.sortRankedEntryRange(startIndex, prefixLimitIndex, leastUpperKeyOrLeftEntry, upperKeyBound, (byte) 118, partitionOrBubbleIndex, useSecondKey);
            SingleChildWidget.sortRankedEntryRange(partitionOrBubbleIndex, prefixLimitIndex, lowerKeyBound, greatestLowerKeyOrRightEntry, (byte) 107, endIndexExclusive, useSecondKey);
            return;
          }
          for (midpointOrBubbleEnd = -1 + endIndexExclusive; midpointOrBubbleEnd > startIndex; midpointOrBubbleEnd--) {
            for (partitionOrBubbleIndex = startIndex; partitionOrBubbleIndex < midpointOrBubbleEnd; partitionOrBubbleIndex++) {
              leastUpperKeyOrLeftEntry = AchievementQuery.rankedEntryIndices[partitionOrBubbleIndex];
              greatestLowerKeyOrRightEntry = AchievementQuery.rankedEntryIndices[1 + partitionOrBubbleIndex];
              if (RankedComparisonSupport.isRightRankedEntryBeforeLeft(useSecondKey, greatestLowerKeyOrRightEntry, (byte) -125, leastUpperKeyOrLeftEntry)) {
                AchievementQuery.rankedEntryIndices[partitionOrBubbleIndex] = greatestLowerKeyOrRightEntry;
                AchievementQuery.rankedEntryIndices[partitionOrBubbleIndex + 1] = leastUpperKeyOrLeftEntry;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException sortFailure) {
          caughtSortFailure = sortFailure;
          sortFailureForContext = caughtSortFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) sortFailureForContext), "sh.T(" + startIndex + ',' + prefixLimitIndex + ',' + lowerKeyBound + ',' + upperKeyBound + ',' + methodGuard + ',' + endIndexExclusive + ',' + useSecondKey + ')');
        }
    }

    private final boolean requestUnfocusedChildFocus(UiWidget focusContext, int methodGuard) {
        RuntimeException childFocusRequestFailure = null;
        UiWidget guardedNullWidgetSnapshot = null;
        boolean childFocusRequested = false;
        RuntimeException focusFailureForContext = null;
        StringBuilder focusContextBuilder = null;
        String focusContextDescription = null;
        RuntimeException caughtFocusFailure = null;
        try {
          if (methodGuard != 22439) {
            guardedNullWidgetSnapshot = (UiWidget) null;
            this.handlePointerRelease(73, 123, false, (UiWidget) null, 48, 45);
          }
          childFocusRequested = (this.child != null) && (!this.child.hasKeyboardFocus((byte) 54)) && (this.child.requestKeyboardFocus((byte) -117, focusContext));
          return childFocusRequested;
        } catch (java.lang.RuntimeException focusFailure) {
          caughtFocusFailure = focusFailure;
          childFocusRequestFailure = caughtFocusFailure;
          focusFailureForContext = childFocusRequestFailure;
          focusContextBuilder = new StringBuilder().append("sh.S(");
          if (focusContext == null) {
            focusContextDescription = "null";
          } else {
            focusContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) focusFailureForContext), ((StringBuilder) (Object) focusContextBuilder).append(focusContextDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    final static boolean readNextIncomingPacket(byte methodGuard, int[] payloadLengthByOpcode) {
        int queuedPayloadCopyIndex = 0;
        int delayedPayloadCopyIndex = 0;
        RuntimeException packetFailureForContext = null;
        StringBuilder packetContextBuilder = null;
        String lengthTableDescription = null;
        RuntimeException caughtPacketFailure = null;
        int guardResidue = 0;
        RuntimeException packetReadFailure = null;
        long nowMillis = 0L;
        DelayedIncomingPacket queuedPacket = null;
        int deliveryDelayMillis = 0;
        DelayedIncomingPacket delayedPacket = null;
        int clientControlFlowSnapshot = 0;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        try {
          guardResidue = -108 / ((-71 - methodGuard) / 45);
          if (LogoCompositor.connectedSessionStage != PacketBuffer.currentProtocolStage) {
            return false;
          }
          nowMillis = ClientClockSupport.correctedCurrentTimeMillis(-12520);
          if (EntityMotionSupport.incomingPacketBaseDelayMillis != 0 &&
              MidiNote.stagedIncomingPacketOpcode < 0) {
            queuedPacket = (DelayedIncomingPacket) ((Object) MeshPrioritySupport.delayedIncomingPackets.firstForIteration(0));
            if (queuedPacket != null &&
                nowMillis > queuedPacket.deliveryTimeMillis) {
              queuedPacket.unlinkNode(false);
              AchievementSubmission.sessionPacketPayloadLength = queuedPacket.payload.length;
              LogoCompositor.sessionPacketBuffer.position = 0;
              for (queuedPayloadCopyIndex = 0; queuedPayloadCopyIndex < AchievementSubmission.sessionPacketPayloadLength; queuedPayloadCopyIndex++) {
                LogoCompositor.sessionPacketBuffer.bytes[queuedPayloadCopyIndex] = queuedPacket.payload[queuedPayloadCopyIndex];
              }
              MidiNoteMixer.thirdPreviousPacketOpcode = AttachedEntityRenderer.secondPreviousPacketOpcode;
              AttachedEntityRenderer.secondPreviousPacketOpcode = VisualPropertyNode.previousPacketOpcode;
              VisualPropertyNode.previousPacketOpcode = ScorePopup.currentPacketOpcode;
              ScorePopup.currentPacketOpcode = queuedPacket.packetOpcode;
              return true;
            }
          }
          while (true) {
            if (MidiNote.stagedIncomingPacketOpcode < 0) {
              LogoCompositor.sessionPacketBuffer.position = 0;
              if (!UiWidget.readSessionBytesIfAvailable(30000, 1)) {
                return false;
              }
              MidiNote.stagedIncomingPacketOpcode = LogoCompositor.sessionPacketBuffer.readCipherByte((byte) 122);
              LogoCompositor.sessionPacketBuffer.position = 0;
              AchievementSubmission.sessionPacketPayloadLength = payloadLengthByOpcode[MidiNote.stagedIncomingPacketOpcode];
            }
            if (!TriangleMesh.readSessionPacketPayload(false)) {
              return false;
            }
            if (EntityMotionSupport.incomingPacketBaseDelayMillis == 0) {
              MidiNoteMixer.thirdPreviousPacketOpcode = AttachedEntityRenderer.secondPreviousPacketOpcode;
              AttachedEntityRenderer.secondPreviousPacketOpcode = VisualPropertyNode.previousPacketOpcode;
              VisualPropertyNode.previousPacketOpcode = ScorePopup.currentPacketOpcode;
              ScorePopup.currentPacketOpcode = MidiNote.stagedIncomingPacketOpcode;
              MidiNote.stagedIncomingPacketOpcode = -1;
              return true;
            }
            deliveryDelayMillis = EntityMotionSupport.incomingPacketBaseDelayMillis;
            if (0.0 != EndingAnimationSupport.incomingPacketDelayJitterMillis) {
              deliveryDelayMillis = (int)((double)deliveryDelayMillis + DelegatingCanvas.sharedClientRandom.nextGaussian() * EndingAnimationSupport.incomingPacketDelayJitterMillis);
              if (deliveryDelayMillis < 0) {
                deliveryDelayMillis = 0;
              }
            }
            delayedPacket = new DelayedIncomingPacket((long)deliveryDelayMillis + nowMillis, MidiNote.stagedIncomingPacketOpcode, new byte[AchievementSubmission.sessionPacketPayloadLength]);
            for (delayedPayloadCopyIndex = 0; AchievementSubmission.sessionPacketPayloadLength > delayedPayloadCopyIndex; delayedPayloadCopyIndex++) {
              delayedPacket.payload[delayedPayloadCopyIndex] = LogoCompositor.sessionPacketBuffer.bytes[delayedPayloadCopyIndex];
            }
            MeshPrioritySupport.delayedIncomingPackets.addLast(-108, delayedPacket);
            MidiNote.stagedIncomingPacketOpcode = -1;
          }
        } catch (java.lang.RuntimeException packetFailure) {
          caughtPacketFailure = packetFailure;
          packetReadFailure = caughtPacketFailure;
          packetFailureForContext = packetReadFailure;
          packetContextBuilder = new StringBuilder().append("sh.HA(").append(methodGuard).append(',');
          if (payloadLengthByOpcode == null) {
            lengthTableDescription = "null";
          } else {
            lengthTableDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) packetFailureForContext), ((StringBuilder) (Object) packetContextBuilder).append(lengthTableDescription).append(')').toString());
        }
    }

    StringBuilder appendWidgetDiagnostics(int methodGuard, StringBuilder output, Hashtable visitedWidgets, int depth) {
        RuntimeException widgetDiagnosticFailure = null;
        StringBuilder diagnosticOutputSnapshot = null;
        RuntimeException diagnosticFailureForContext = null;
        StringBuilder diagnosticContextBuilder = null;
        String outputDescription = null;
        StringBuilder diagnosticContextAfterOutput = null;
        String visitedWidgetsDescription = null;
        RuntimeException caughtDiagnosticFailure = null;
        try {
          if (this.beginWidgetDiagnosticVisit(output, depth, 10095, visitedWidgets)) {
            this.appendWidgetDiagnosticProperties(depth, visitedWidgets, 34, output);
            this.appendChildDiagnostics(depth, output, visitedWidgets, 0);
          }
          if (methodGuard != 0) {
            mainRasterBuffer = (AwtRasterBuffer) null;
          }
          diagnosticOutputSnapshot = (StringBuilder) (output);
          return diagnosticOutputSnapshot;
        } catch (java.lang.RuntimeException diagnosticFailure) {
          caughtDiagnosticFailure = diagnosticFailure;
          widgetDiagnosticFailure = caughtDiagnosticFailure;
          diagnosticFailureForContext = widgetDiagnosticFailure;
          diagnosticContextBuilder = new StringBuilder().append("sh.PA(").append(methodGuard).append(',');
          if (output == null) {
            outputDescription = "null";
          } else {
            outputDescription = "{...}";
          }
          diagnosticContextAfterOutput = ((StringBuilder) (Object) diagnosticContextBuilder).append(outputDescription).append(',');
          if (visitedWidgets == null) {
            visitedWidgetsDescription = "null";
          } else {
            visitedWidgetsDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) diagnosticFailureForContext), ((StringBuilder) (Object) diagnosticContextAfterOutput).append(visitedWidgetsDescription).append(',').append(depth).append(')').toString());
        }
    }

    UiWidget findFocusTarget(int methodGuard) {
        UiWidget childSnapshot = this.child;
        if (childSnapshot != null &&
            childSnapshot.hasKeyboardFocus((byte) 54)) {
            return childSnapshot;
        }
        if (methodGuard == -4863) {
            return null;
        }
        UiWidget guardedNullWidgetSnapshot = (UiWidget) null;
        this.handlePointerPress(114, -49, -37, 74, 126, 94, (UiWidget) null);
        return null;
    }

    void renderWidget(int parentX, int parentY, byte methodGuard, int renderPass) {
        if (0 == renderPass &&
            this.renderer != null) {
            this.renderer.drawWidget(parentX, -50, parentY, true, (UiWidget) (this));
        }
        int guardResidue = 85 % ((methodGuard - 1) / 43);
        if (this.child != null) {
            this.child.renderWidget(this.widgetX + parentX, parentY + this.widgetY, (byte) -74, renderPass);
        }
    }

    void handlePointerRelease(int parentX, int pointerX, boolean releaseGuard, UiWidget eventContext, int parentY, int pointerY) {
        if (!releaseGuard) {
            return;
        }
        try {
            if (null != this.child) {
                this.child.handlePointerRelease(this.widgetX + parentX, pointerX, true, eventContext, parentY + this.widgetY, pointerY);
            }
        } catch (RuntimeException pointerReleaseFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) pointerReleaseFailure), "sh.TA(" + parentX + ',' + pointerX + ',' + releaseGuard + ',' + (eventContext != null ? "{...}" : "null") + ',' + parentY + ',' + pointerY + ')');
        }
    }

    final int getLastRenderPass(byte methodGuard) {
        if (methodGuard <= 82) {
            UiWidget guardedNullWidgetSnapshot = (UiWidget) null;
            this.handlePointerWheel(-119, 24, -30, 98, 113, (UiWidget) null, 116);
        }
        return this.child != null ? this.child.getLastRenderPass((byte) 123) : 0;
    }

    final void appendChildDiagnostics(int depth, StringBuilder output, Hashtable visitedWidgets, int firstIndentIndex) {
        StringBuilder discardedNewlineAppend = null;
        int indentIndex = 0;
        StringBuilder discardedIndentAppend = null;
        StringBuilder discardedNullChildAppend = null;
        int clientControlFlowSnapshot = 0;
        RuntimeException diagnosticFailureForContext = null;
        StringBuilder diagnosticContextBuilder = null;
        String outputDescription = null;
        StringBuilder diagnosticContextAfterOutput = null;
        String visitedWidgetsDescription = null;
        RuntimeException caughtDiagnosticFailure = null;
        RuntimeException childDiagnosticFailure = null;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        try {
          discardedNewlineAppend = output.append('\n');
          for (indentIndex = firstIndentIndex; depth >= indentIndex; indentIndex++) {
            discardedIndentAppend = output.append(' ');
          }
          if (this.child != null) {
            this.child.appendWidgetDiagnostics(0, output, visitedWidgets, depth + 1);
          } else {
            discardedNullChildAppend = output.append("null");
          }
          return;
        } catch (java.lang.RuntimeException diagnosticFailure) {
          caughtDiagnosticFailure = diagnosticFailure;
          childDiagnosticFailure = caughtDiagnosticFailure;
          diagnosticFailureForContext = childDiagnosticFailure;
          diagnosticContextBuilder = new StringBuilder().append("sh.V(").append(depth).append(',');
          if (output == null) {
            outputDescription = "null";
          } else {
            outputDescription = "{...}";
          }
          diagnosticContextAfterOutput = ((StringBuilder) (Object) diagnosticContextBuilder).append(outputDescription).append(',');
          if (visitedWidgets == null) {
            visitedWidgetsDescription = "null";
          } else {
            visitedWidgetsDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) diagnosticFailureForContext), ((StringBuilder) (Object) diagnosticContextAfterOutput).append(visitedWidgetsDescription).append(',').append(firstIndentIndex).append(')').toString());
        }
    }

    String getHoverText(byte methodGuard) {
        String childHoverText = null;
        String parentHoverText = super.getHoverText(methodGuard);
        if (this.child != null) {
            childHoverText = this.child.getHoverText((byte) 69);
            if (childHoverText != null) {
                return childHoverText;
            }
        }
        return parentHoverText;
    }

    private final boolean requestUnfocusedChildFocus(UiWidget focusContext, byte methodGuard) {
        int guardResidue = 0;
        RuntimeException childFocusRequestFailure = null;
        boolean childFocusRequested = false;
        RuntimeException focusFailureForContext = null;
        StringBuilder focusContextBuilder = null;
        String focusContextDescription = null;
        RuntimeException caughtFocusFailure = null;
        try {
          guardResidue = -11 % ((methodGuard + 73) / 40);
          childFocusRequested = (null != this.child) && (!this.child.hasKeyboardFocus((byte) 54)) && (this.child.requestKeyboardFocus((byte) -85, focusContext));
          return childFocusRequested;
        } catch (java.lang.RuntimeException focusFailure) {
          caughtFocusFailure = focusFailure;
          childFocusRequestFailure = caughtFocusFailure;
          focusFailureForContext = childFocusRequestFailure;
          focusContextBuilder = new StringBuilder().append("sh.U(");
          if (focusContext == null) {
            focusContextDescription = "null";
          } else {
            focusContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) focusFailureForContext), ((StringBuilder) (Object) focusContextBuilder).append(focusContextDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    final boolean requestKeyboardFocus(byte methodGuard, UiWidget focusContext) {
        RuntimeException childFocusRequestFailure = null;
        boolean childFocusRequested = false;
        RuntimeException focusFailureForContext = null;
        StringBuilder focusContextBuilder = null;
        String focusContextDescription = null;
        RuntimeException caughtFocusFailure = null;
        try {
          if (methodGuard > -30) {
            mainRasterBuffer = (AwtRasterBuffer) null;
          }
          childFocusRequested = (null != this.child) && (this.child.requestKeyboardFocus((byte) -34, focusContext));
          return childFocusRequested;
        } catch (java.lang.RuntimeException focusFailure) {
          caughtFocusFailure = focusFailure;
          childFocusRequestFailure = caughtFocusFailure;
          focusFailureForContext = childFocusRequestFailure;
          focusContextBuilder = new StringBuilder().append("sh.UA(").append(methodGuard).append(',');
          if (focusContext == null) {
            focusContextDescription = "null";
          } else {
            focusContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) focusFailureForContext), ((StringBuilder) (Object) focusContextBuilder).append(focusContextDescription).append(')').toString());
        }
    }

    final boolean hasKeyboardFocus(byte methodGuard) {
        if (methodGuard != 54) {
            UiWidget guardedNullWidgetSnapshot = (UiWidget) null;
            this.updatePointerState(false, 15, (UiWidget) null, 31);
        }
        return this.findFocusTarget(-4863) != null ? true : false;
    }

    final boolean handlePointerWheel(int parentY, int wheelRotation, int parentX, int methodGuard, int pointerX, UiWidget eventContext, int pointerY) {
        RuntimeException pointerWheelFailure = null;
        boolean childHandledWheel = false;
        RuntimeException wheelFailureForContext = null;
        StringBuilder wheelContextBuilder = null;
        String eventContextDescription = null;
        RuntimeException caughtWheelFailure = null;
        try {
          if (methodGuard != -1) {
            return true;
          }
          childHandledWheel = (null != this.child) && (this.child.hasKeyboardFocus((byte) 54)) && (this.child.handlePointerWheel(parentY, wheelRotation, parentX, -1, pointerX, eventContext, pointerY));
          return childHandledWheel;
        } catch (java.lang.RuntimeException wheelFailure) {
          caughtWheelFailure = wheelFailure;
          pointerWheelFailure = caughtWheelFailure;
          wheelFailureForContext = pointerWheelFailure;
          wheelContextBuilder = new StringBuilder().append("sh.EB(").append(parentY).append(',').append(wheelRotation).append(',').append(parentX).append(',').append(methodGuard).append(',').append(pointerX).append(',');
          if (eventContext == null) {
            eventContextDescription = "null";
          } else {
            eventContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) wheelFailureForContext), ((StringBuilder) (Object) wheelContextBuilder).append(eventContextDescription).append(',').append(pointerY).append(')').toString());
        }
    }

    final void clearKeyboardFocus(int methodGuard) {
        if (null != this.child) {
            this.child.clearKeyboardFocus(-123);
        }
        if (methodGuard >= -122) {
            SingleChildWidget.releaseStaticReferences((byte) 83);
        }
    }

    void refreshChildLayout(boolean layoutGuard) {
        if (null != this.child) {
            this.child.refreshLayout(-73);
        }
        if (!layoutGuard) {
            projectedMeshVertexX = (int[]) null;
        }
    }

    public static void releaseStaticReferences(byte methodGuard) {
        if (methodGuard != -3) {
            return;
        }
        mainRasterBuffer = null;
        fpsTextTemplate = null;
        projectedMeshVertexX = null;
    }

    void updatePointerState(boolean hoverGuard, int parentY, UiWidget eventContext, int parentX) {
        try {
            super.updatePointerState(hoverGuard, parentY, eventContext, parentX);
            if (this.child != null) {
                this.child.updatePointerState(false, this.widgetY + parentY, eventContext, this.widgetX + parentX);
            }
        } catch (RuntimeException pointerStateFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) pointerStateFailure), "sh.H(" + hoverGuard + ',' + parentY + ',' + (eventContext != null ? "{...}" : "null") + ',' + parentX + ')');
        }
    }

    final boolean handleKeyInput(int keyCode, int methodGuard, char typedCharacter, UiWidget eventContext) {
        int keyCodeSnapshot = 0;
        RuntimeException keyInputFailure = null;
        boolean childFocusRequested = false;
        RuntimeException keyFailureForContext = null;
        StringBuilder keyContextBuilder = null;
        String eventContextDescription = null;
        RuntimeException caughtKeyFailure = null;
        try {
          if (null != this.child &&
              this.child.hasKeyboardFocus((byte) 54) &&
              this.child.handleKeyInput(keyCode, 13, typedCharacter, eventContext)) {
            return true;
          }
          if (methodGuard != 13) {
            mainRasterBuffer = (AwtRasterBuffer) null;
          }
          keyCodeSnapshot = keyCode;
          if (keyCodeSnapshot != 80) {
            return false;
          }
          if (!MidiPcmStream.heldInternalKeys[81]) {
            childFocusRequested = this.requestUnfocusedChildFocus(eventContext, 22439);
          } else {
            childFocusRequested = this.requestUnfocusedChildFocus(eventContext, (byte) -119);
          }
          return childFocusRequested;
        } catch (java.lang.RuntimeException keyFailure) {
          caughtKeyFailure = keyFailure;
          keyInputFailure = caughtKeyFailure;
          keyFailureForContext = keyInputFailure;
          keyContextBuilder = new StringBuilder().append("sh.I(").append(keyCode).append(',').append(methodGuard).append(',').append(typedCharacter).append(',');
          if (eventContext == null) {
            eventContextDescription = "null";
          } else {
            eventContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) keyFailureForContext), ((StringBuilder) (Object) keyContextBuilder).append(eventContextDescription).append(')').toString());
        }
    }

    SingleChildWidget(int x, int y, int width, int height, WidgetRenderer renderer, WidgetListener listener) {
        super(x, y, width, height, renderer, listener);
    }

    final void setWidgetBounds(int height, int width, byte methodGuard, int y, int x) {
        super.setWidgetBounds(height, width, (byte) -40, y, x);
        if (methodGuard > -6) {
            fpsTextTemplate = (String) null;
        }
        this.refreshChildLayout(true);
    }

    static {
        projectedMeshVertexX = new int[8192];
        fpsTextTemplate = "FPS: <%0>";
    }
}
